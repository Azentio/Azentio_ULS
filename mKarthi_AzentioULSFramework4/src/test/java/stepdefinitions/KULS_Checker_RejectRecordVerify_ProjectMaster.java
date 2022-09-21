package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ProjectMasterOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.ProjectMasterTestDataType;

public class KULS_Checker_RejectRecordVerify_ProjectMaster {

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
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ProjectMasterTestDataType projectmaster = jsonConfig.getProjectMasterListByName("Maker");

	@And("^Click the inboxmailicon in maker stage for reject record verify$")
	public void click_the_inboxmailicon_in_maker_stage_for_reject_record_verify() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, project.InboxIcon(), 60, 2);
		project.InboxIcon().click();

	}
	@And("^user verify the rejected record removed from the system$")
    public void user_verify_the_rejected_record_removed_from_the_system() throws Throwable {
        for (int i = 0; i <20; i++) {
            try {
                project.searchIcon().click();
                break;
            } catch (Exception e) {

            }
        }

            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,project.searchIcon(),60,2);
            project.searchIcon().click();
            project.searchsentkeys().sendKeys(json.readReferancedata());
            String xpath ="//span[contains(text(),'"+json.readReferancedata()+"')]";
            for (int i = 0; i < 200; i++) {
                try {
                    Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
                    break;
                } catch (NoSuchElementException e) {

                }
            }

    }
    @And("^user verify the returned record removed from the system$")
    public void user_verify_the_returned_record_removed_from_the_system() throws Throwable {
        for (int i = 0; i <20; i++) {
            try {
            	project.searchIcon().click();
                break;
            } catch (Exception e) {

            }
        }

            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,project.searchIcon(),60,2);
            project.searchIcon().click();
            project.searchsentkeys().sendKeys(json.readReferancedata());
            String xpath ="//span[contains(text(),'"+json.readReferancedata()+"')]";
            for (int i = 0; i < 200; i++) {
                try {
                    Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
                    break;
                } catch (NoSuchElementException e) {

                }
            }
    }
    @Then("^user verify the return record$")
    public void user_verify_the_return_record() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, project.recordMsgChecker(), 60, 2);
    	System.out.println(project.recordMsgChecker().getText());
    	
        
    }

    @And("^user click on return icon$")
    public void user_click_on_return_icon() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, project.CheckerReturn(), 60, 2);
    	project.CheckerReturn().click();
        
    }

    @And("^user enter the remark for return the record$")
    public void user_enter_the_remark_for_return_the_record() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, project.popupremark(), 60, 2);
    	project.popupremark().click();
    	project.popupremark().sendKeys(projectmaster.RemarkReturn);
    	
        
    }

    @And("^user click the final return button$")
    public void user_click_the_final_return_button() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, project.popupReturn(), 60, 2);
    	project.popupReturn().click();
    	
    	
        
    }


}
