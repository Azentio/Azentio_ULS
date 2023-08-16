package stepdefinitions;

import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationDetailsOfferingObj;
import pageobjects.CustomerAddressDetailsObj;
import pageobjects.CustomerPersonalDetailOfferingObj;
import pageobjects.KULS_LoginObj;
import pageobjects.PropertyDetailsObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.ApplicationDetailsOfferingTestDataType;
import testDataType.CustomerAddressDetailsTestDataType;
import testDataType.CustomerPersonalDetailOfferingTestDataType;
import testDataType.KULS_Login_TestDataType;
import testDataType.PropertyDetailsTestDataType;

public class PropertyDetails {

	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
//	JsonConfig jsonConfig = new JsonConfig();
//	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ConfigFileReader configFileReader = new ConfigFileReader();
//	KULS_Login_TestDataType ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	String referenceID;
	PropertyDetailsObj propertyDetailsObj = new PropertyDetailsObj(driver);
//	PropertyDetailsTestDataType propertyDetailsTestDataType = jsonConfig.getPropertyDetailsByName("Maker");
	SoftAssert softAssert = new SoftAssert();
	ExcelData excelData = new ExcelData(System.getProperty("user.dir")+"\\Test-data\\TestDataDesignSample.xlsx","PropertyDetailsTestData","Data Set ID");
	Map<String, String> testData;
	String dataSetID;
	
	@Then("^user should click on the menu toggle from maker stage$")
    public void user_should_click_on_the_menu_toggle_from_maker_stage() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_Maker_MenuToggle());
		propertyDetailsObj.propertyDetails_Maker_MenuToggle().click();
    }

    @Then("^click on inbox to search for the Property Details record$")
    public void click_on_inbox_to_search_for_the_property_details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_Inbox());
    	propertyDetailsObj.propertyDetails_Inbox().click();
    }

    @Then("^click on search button to search the record of Property Details in inbox$")
    public void click_on_search_button_to_search_the_record_of_property_details_in_inbox() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_SearchInbox());
    	propertyDetailsObj.propertyDetails_SearchInbox().click();
    }

    @Then("^enter the reference id of the Property Details record$")
    public void enter_the_reference_id_of_the_property_details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_SearchInboxInputField());
    	for(int i = 0; i<=200;i++) {
			try {
				propertyDetailsObj.propertyDetails_SearchInboxInputField().sendKeys(testData.get("Application id"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
    }

    @Then("^click on the entitle button of the Property Details record of that reference id$")
    public void click_on_the_entitle_button_of_the_property_details_record_of_that_reference_id() throws Throwable {
    	String beforexpath= "//span[contains(text(),'";
		String afterxpath= "')]/../../td/button";
		for(int i = 0; i<=200;i++) {
			try {
				driver.findElement(By.xpath(beforexpath + testData.get("Application id") +afterxpath)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @Then("^click on the Property Details tab$")
    public void click_on_the_property_details_tab() throws Throwable {
//		waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.appdataEntryPropertyDetailsTab());
		for(int i = 0; i<=200;i++) {
			try {
				propertyDetailsObj.appdataEntryPropertyDetailsTab().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.appdataEntry_NextSlides());
				propertyDetailsObj.appdataEntry_NextSlides().click();
				if(i==200) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }
    
    @Then("^open the active record of Property Details to modify$")
    public void open_the_active_record_of_Property_Details_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_SearchButton());
    	propertyDetailsObj.propertyDetails_SearchButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_SearchInputField());
    	propertyDetailsObj.propertyDetails_SearchInputField().sendKeys(testData.get("ActiveStatus"));
//    	String beforexpath= "//span[contains(text(),'"; 
//    	String afterxpath= "')]/../../../td[2]/span/button[1]";
    	String beforexpath= "//span[text()='"; 
    	String afterxpath= " ']/../../../td[1]/span/button[1]";
//    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +testData.get("ActiveStatus")+ afterxpath)));
    	for (int i = 0; i <=200; i++) {
			try {
				driver.findElement(By.xpath(beforexpath +testData.get("ActiveStatus")+ afterxpath)).click();
				break;
			} catch (Exception e) {
				if(i==200){
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			} 
		}
    	
//    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_FirstRecordEditButton());
//    	propertyDetailsObj.propertyDetails_FirstRecordEditButton().click();
    }
    
    @Then("^open the deactive record of Property Details to modify$")
    public void open_the_deactive_record_of_Property_Details_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_SearchButton());
    	propertyDetailsObj.propertyDetails_SearchButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_SearchInputField());
    	propertyDetailsObj.propertyDetails_SearchInputField().sendKeys(testData.get("DeactiveStatus"));
//    	String beforexpath= "//span[contains(text(),'"; 
//    	String afterxpath= "')]/../../../td[2]/span/button[1]";
    	String beforexpath= "//span[text()='"; 
    	String afterxpath= " ']/../../../td[1]/span/button[1]";
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +testData.get("DeactiveStatus")+ afterxpath)));
    	driver.findElement(By.xpath(beforexpath +testData.get("DeactiveStatus")+ afterxpath)).click();
    	
//    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_FirstRecordEditButton());
//    	propertyDetailsObj.propertyDetails_FirstRecordEditButton().click();
    }

	@Then("^click on status toggle button under property details to deactive$")
	public void click_on_status_toggle_button_under_property_details_to_deactive() throws Throwable {
		for (int i = 0; i <= 200; i++) {
			try {
				javaScriptHelper.scrollIntoView(propertyDetailsObj.propertyDetails_StatusToggleButton());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			}
		}
		waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_StatusToggleButton());
		propertyDetailsObj.propertyDetails_StatusToggleButton().click();
    }
	
	@Then("^click on update button under property details$")
	public void click_on_update_button_under_property_details() throws Throwable {
		for (int i = 0; i <=200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(propertyDetailsObj.propertyDetails_UpdateButton());
				break;
			} catch (Exception e) {
				if(i==200){
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			} 
		}
		waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_UpdateButton());
		propertyDetailsObj.propertyDetails_UpdateButton().click();
		waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_UpdateSuccessMessage());
		propertyDetailsObj.propertyDetails_UpdateSuccessMessage().isDisplayed();
		waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_UpdateSuccessMessageCloseButton());
		propertyDetailsObj.propertyDetails_UpdateSuccessMessageCloseButton().click();
	}
    
    @Then("^verify on clicking toggle button system should allow user to change the status of the record to Deactivate$")
    public void verify_on_clicking_toggle_button_system_should_allow_user_to_change_the_status_of_the_record_to_Deactivate() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_BackButton());
//    	propertyDetailsObj.propertyDetails_BackButton().click();
    	
    	String beforexpath= "//span[text()='"; 
    	String afterxpath= " ']/../../../td[1]/span/button[1]";
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +testData.get("DeactiveStatus")+ afterxpath)));
    	boolean status = driver.findElement(By.xpath(beforexpath +testData.get("DeactiveStatus")+ afterxpath)).isDisplayed();
    	Assert.assertTrue(status);
    }
    
    @Then("^verify on clicking toggle button system should allow user to change the status of the record to Activate$")
    public void verify_on_clicking_toggle_button_system_should_allow_user_to_change_the_status_of_the_record_to_Activate() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_BackButton());
//    	propertyDetailsObj.propertyDetails_BackButton().click();
    	
    	String beforexpath= "//span[text()='"; 
    	String afterxpath= " ']/../../../td[1]/span/button[1]";
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +testData.get("ActiveStatus")+ afterxpath)));
    	boolean status = driver.findElement(By.xpath(beforexpath +testData.get("ActiveStatus")+ afterxpath)).isDisplayed();
    	Assert.assertTrue(status);
    }
    	
    
    @Then("^verify the Label on button if the status of property details record is Active$")
    public void verify_the_Label_on_button_if_the_status_of_property_details_record_is_Active() throws Throwable {
//    	for (int i = 0; i <=200; i++) {
//    		try {
//    			javaScriptHelper.scrollIntoViewAndClick(propertyDetailsObj.propertyDetails_BackButton());
//    			break;
//			} catch (Exception e) {
//				if(i==200){
//					Assert.fail(e.getMessage());
//				}
//				// TODO: handle exception
//			} 
//		}
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_Title());
    	propertyDetailsObj.propertyDetails_Title().isDisplayed();
    	
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_FirstRecordStatus());
    	String status=propertyDetailsObj.propertyDetails_FirstRecordStatus().getText();
    	Assert.assertEquals("A", status);
    	
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_FirstRecordEditButton());
    	propertyDetailsObj.propertyDetails_FirstRecordEditButton().click();
    	
    	for (int i = 0; i <=200; i++) {
    		try {
    			javaScriptHelper.scrollIntoView(propertyDetailsObj.propertyDetails_StatusToggleButton());
    			break;
			} catch (Exception e) {
				if(i==200){
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			} 
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_StatusToggleButton());
    	boolean toggleStatus=propertyDetailsObj.propertyDetails_StatusToggleButton().getAttribute("aria-checked").equalsIgnoreCase("True");
    	Assert.assertTrue("Status toggle should be activate",toggleStatus);
    }
    
    @Then("^verify the Label on button if the status of property details record is Deactive$")
    public void verify_the_Label_on_button_if_the_status_of_property_details_record_is_Deactive() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_StatusToggleButton());
    	propertyDetailsObj.propertyDetails_StatusToggleButton().click();
    	
    	for (int i = 0; i <=200; i++) {
    		try {
    			javaScriptHelper.scrollIntoView(propertyDetailsObj.propertyDetails_UpdateButton());
    			break;
			} catch (Exception e) {
				if(i==200){
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			} 
		}
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_UpdateButton());
    	propertyDetailsObj.propertyDetails_UpdateButton().click();
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_UpdateSuccessMessage());
    	propertyDetailsObj.propertyDetails_UpdateSuccessMessage().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_UpdateSuccessMessageCloseButton());
    	propertyDetailsObj.propertyDetails_UpdateSuccessMessageCloseButton().isDisplayed();
    	
//    	for (int i = 0; i <=200; i++) {
//    		try {
//    			javaScriptHelper.scrollIntoViewAndClick(propertyDetailsObj.propertyDetails_BackButton());
//    			break;
//			} catch (Exception e) {
//				if(i==200){
//					Assert.fail(e.getMessage());
//				}
//				// TODO: handle exception
//			} 
//		}
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_Title());
    	propertyDetailsObj.propertyDetails_Title().isDisplayed();
    	
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_FirstRecordStatus());
    	String status=propertyDetailsObj.propertyDetails_FirstRecordStatus().getText();
    	Assert.assertEquals("X", status);
    	
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_FirstRecordEditButton());
    	propertyDetailsObj.propertyDetails_FirstRecordEditButton().click();
    	
    	for (int i = 0; i <=200; i++) {
    		try {
    			javaScriptHelper.scrollIntoView(propertyDetailsObj.propertyDetails_StatusToggleButton());
    			break;
			} catch (Exception e) {
				if(i==200){
					Assert.fail(e.getMessage());
				}
				// TODO: handle exception
			} 
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, propertyDetailsObj.propertyDetails_StatusToggleButton());
    	boolean toggleStatus=propertyDetailsObj.propertyDetails_StatusToggleButton().getAttribute("aria-checked").equalsIgnoreCase("True");
    	Assert.assertTrue("Status toggle should be activate",toggleStatus);
    	
    	
    }
    
    @Then("^verify the functionality of Back button on property details screen$")
    public void verify_the_functionality_of_Back_button_on_property_details_screen() throws Throwable {
    	
    }
    
    @Then("^select data set ID for property details testcase006$")
    public void select_data_set_ID_for_property_details_testcase006() throws Throwable {
    	dataSetID = "AT_PD_006_D1";
        testData = excelData.getTestdata(dataSetID);
    }
    
    
}