package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;

import pageobjects.FloatingRateMasterObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class MDM_FloatingRateMst extends BaseClass{

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browsehelper = new BrowserHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	FloatingRateMasterObj floatingObj = new FloatingRateMasterObj(driver);	
	
	
	
    @And("^user click on Floating rate master Temp view Icon$")
    public void user_click_on_floating_rate_master_temp_view_icon() throws Throwable {
       waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingObj.floatingMaster_TempIcon(), 60, 0);
       floatingObj.floatingMaster_TempIcon().click();
    }

    @And("^user verify the status button of the Record$")
    public void user_verify_the_status_button_of_the_record() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingObj.floatingMaster_ActiveInactive(), 60, 0);        
        Assert.assertTrue(floatingObj.floatingMaster_ActiveInactive().isDisplayed());
    }

    @And("^user click the status button to Deactive the record$")
    public void user_click_the_status_button_to_deactive_the_record() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingObj.floatingMaster_ActiveInactive(), 60, 0);        
        Assert.assertTrue(floatingObj.floatingMaster_ActiveInactive().isDisplayed());
        floatingObj.floatingMaster_ActiveInactive().click();
    }

    @And("^user verify the Deactive status in Record$")
    public void user_verify_the_deactive_status_in_record() throws Throwable {
    	String deactivate = floatingObj.floatingMaster_ActiveInactive().getDomAttribute("aria-checked");
    	Assert.assertEquals(deactivate, "false");
    }

    @And("^user verify the active status in Record$")
    public void user_verify_the_active_status_in_record() throws Throwable {
    	String deactivate = floatingObj.floatingMaster_ActiveInactive().getDomAttribute("aria-checked");
    	Assert.assertEquals(deactivate, "true");
    }
    
    @And("^user click the status button to active the record$")
    public void user_click_the_status_button_to_active_the_record() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingObj.floatingMaster_ActiveInactive(), 60, 0);        
        Assert.assertTrue(floatingObj.floatingMaster_ActiveInactive().isDisplayed());
        floatingObj.floatingMaster_ActiveInactive().click();
    }	
	
	
	
	
	
	
	
}
