package stepdefinitions;

import static org.junit.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ProjectMasterOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.ProjectMasterTestDataType;

public class KULS_ProjectMaster_MandatoryField {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	ProjectMasterOBJ project = new ProjectMasterOBJ(driver);
	ProjectMasterTestDataType projectmaster = jsonConfig.getProjectMasterListByName("Maker");
	
	@Then("^Click the save button in project master$")
    public void click_the_save_button_in_project_master() throws Throwable {
		
		seleniumactions.getJavascriptHelper().scrollIntoView(project.newrecordsave());
		
		help.waitForElementToVisibleWithFluentWait(driver, project.newrecordsave(), 60, 5);
		project.newrecordsave().click();
		
		
        
    }

    @And("^Click the action edit icon project master for mandatoryField validation$")
    public void click_the_action_edit_icon_project_master_for_mandatoryfield_validation() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, project.actioneditmaker(), 60, 5);
    	project.actioneditmaker().click();
    	
        
    }

    @And("^Click the building details add icon in project master$")
    public void click_the_building_details_add_icon_in_project_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, project.buildingaddbutton(), 60, 5);
    	project.buildingaddbutton().click();
        
    }

    @And("^Verify the impact when user keep any mandatory field blank$")
    public void verify_the_impact_when_user_keep_any_mandatory_field_blank() throws Throwable {
    	
    	WebElement nameErrorMessage = driver
				.findElement(By.xpath("//digital-form-error//ion-badge"));
		String expectedErrorText = "Required field";
		String actualErrorText = nameErrorMessage.getText();
		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
			System.out.println(
					"The actual and expected result are same.The Popup validation message is" + actualErrorText);
		} else {
			System.out.println(
					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
		}
    	
        
    }

    @And("^Verify the impact when user enter characters  value in numeric field$")
    public void verify_the_impact_when_user_enter_characters_value_in_numeric_field() throws Throwable {
    	
    	seleniumactions.getJavascriptHelper().scrollIntoView(project.RegNo());
    	
    	help.waitForElementToVisibleWithFluentWait(driver, project.RegNo(), 60, 5);
    	project.RegNo().click();
    	project.RegNo().sendKeys(projectmaster.RegNo);
    	String attr= project.RegNo().getAttribute("ng-reflect-model");
    	Assert.assertNotEquals(attr, projectmaster.RegNo);
    	
        
    }

    @And("^Verify the impact when user enters only special characters value in any field$")
    public void verify_the_impact_when_user_enters_only_special_characters_value_in_any_field() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, project.BuildingName(), 60, 5);
    	project.BuildingName().click();
    	project.BuildingName().sendKeys(projectmaster.BuildingName);
    	String attr1 = project.BuildingNameinput().getAttribute("ng-reflect-model");
    	Assert.assertEquals(attr1, projectmaster.BuildingName);
        
    }
    @And("^Verify the impact when user enter numeric value in character field$")
    public void verify_the_impact_when_user_enter_numeric_value_in_character_field() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, project.VerifiedBy(), 60, 5);
    	
    	for(int i=0; i<20; i++) {
    		try {
    			project.VerifiedBy().click();
    	    	project.VerifiedBy().sendKeys(projectmaster.VerifiedBy);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
    	String attr1 = project.VerifiedByinput().getAttribute("ng-reflect-model");
    	Assert.assertEquals(attr1, projectmaster.VerifiedBy);
    	
        
    	
    }


}
