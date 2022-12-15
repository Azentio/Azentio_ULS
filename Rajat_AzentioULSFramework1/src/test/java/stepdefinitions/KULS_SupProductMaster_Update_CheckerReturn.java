package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.KULS_SubProductMaster_Update_CheckerReturnObj;
import resources.BaseClass;
import testDataType.KULS_Login_TestDataType;

public class KULS_SupProductMaster_Update_CheckerReturn {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_SubProductMaster_Update_CheckerReturnObj subMasterRetailObj = new KULS_SubProductMaster_Update_CheckerReturnObj(driver);
	 KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Checker");
	
	@Given("^Launch the kuls application and login as checker$")
    public void launch_the_kuls_application() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
        driver.get(kulsApplicationUrl);
        //applicationLogin.loginUlsApplicationAsMaker(loginData.Username,loginData.Password);
        applicationLogin.ulSApplicationLoginAsAChecker(loginData.CheckerUserName1);
    }

    @Then("^Click on Remarks button in Action confirmation popup$")
    public void click_on_remarks_button_in_action_confirmation_popup() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.returnButtonInRemarks(),60,2);
        subMasterRetailObj.returnButtonInRemarks().click();
    }

       @And("^Click on Menu icon$")
    public void click_on_menu_icon() throws Throwable {
    	   seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.menuIcon(),60,2);
           subMasterRetailObj.menuIcon().click();
        
    }

    @And("^Click on Mailbox icon$")
    public void click_on_mailbox_icon() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.checkerInbox(),60,2);
        subMasterRetailObj.checkerInbox().click();
        
    }

    @And("^Search the respective reference id$")
    public void search_the_respective_reference_id() throws Throwable {
        
    }

    @And("^click on Action button$")
    public void click_on_action_button() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.actionIcon(),60,2);
        subMasterRetailObj.actionIcon().click();
        
    }

    @And("^Click on Return icon$")
    public void click_on_return_icon() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.returnIcon(),60,2);
        subMasterRetailObj.returnIcon().click();
        
    }

    @And("^Enter the remarks in Action confirmation popup$")
    public void enter_the_remarks_in_action_confirmation_popup() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.remarksText(),60,2);
        subMasterRetailObj.remarksText().click();
        
    }

}
