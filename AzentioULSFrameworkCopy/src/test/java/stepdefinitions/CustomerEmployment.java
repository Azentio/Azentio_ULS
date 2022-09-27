package stepdefinitions;

import java.util.Iterator;

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
import pageobjects.CustomerEmploymentObj;
import pageobjects.CustomerPersonalDetailOfferingObj;
import pageobjects.KULS_LoginObj;
import pageobjects.PropertyDetailsObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.ApplicationDetailsOfferingTestDataType;
import testDataType.CustomerAddressDetailsTestDataType;
import testDataType.CustomerEmploymentTestDataType;
import testDataType.CustomerPersonalDetailOfferingTestDataType;
import testDataType.KULS_Login_TestDataType;
import testDataType.PropertyDetailsTestDataType;

public class CustomerEmployment {

	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Login_TestDataType ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	String referenceID;
	CustomerEmploymentObj customerEmploymentObj = new CustomerEmploymentObj(driver);
	CustomerEmploymentTestDataType customerEmploymentTestDataType = jsonConfig.getCustomerEmploymentByName("Maker");
	SoftAssert softAssert = new SoftAssert();
	
	@Then("^user should click on the menu toggle from maker side$")
    public void user_should_click_on_the_menu_toggle_from_maker_side() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_Maker_MenuToggle());
		customerEmploymentObj.customerEmployment_Maker_MenuToggle().click();
    }

    @Then("^click on inbox to search for the Customer Employment record$")
    public void click_on_inbox_to_search_for_the_Customer_Employment_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_Inbox());
    	customerEmploymentObj.customerEmployment_Inbox().click();
    }

    @Then("^click on search button to search the record of Customer Employment in inbox$")
    public void click_on_search_button_to_search_the_record_of_Customer_Employment_in_inbox() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_SearchInbox());
    	customerEmploymentObj.customerEmployment_SearchInbox().click();
    }

    @Then("^enter the reference id of the Customer Employment record$")
    public void enter_the_reference_id_of_the_Customer_Employment_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_SearchInboxInputField());
    	customerEmploymentObj.customerEmployment_SearchInboxInputField().sendKeys(customerEmploymentTestDataType.ReferenceID);
	
    }

    @Then("^click on the entitle button of the Customer Employment record of that reference id$")
    public void click_on_the_entitle_button_of_the_Customer_Employment_record_of_that_reference_id() throws Throwable {
    	String beforexpath= "//span[contains(text(),'";
		String afterxpath= "')]/../../td/button";
		while(true) {
			try {
				driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    }

    @Then("^click on the Customer Financials tab$")
    public void click_on_the_customer_financials_tab() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_CustomerFinancialTab());
		customerEmploymentObj.customerEmployment_CustomerFinancialTab().click();
    }
    
    @Then("^open the record of Customer Employment to modify$")
    public void open_the_record_of_customer_employment_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_SearchButton());
    	customerEmploymentObj.customerEmployment_SearchButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_SearchInputField());
    	customerEmploymentObj.customerEmployment_SearchInputField().sendKeys(customerEmploymentTestDataType.CustomerFirstName);
    	String beforexpath= "//span[contains(text(),'"; 
    	String afterxpath= "')]/../../../td[2]/span/button[1]";
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +customerEmploymentTestDataType.CustomerFirstName+ afterxpath)));
    	driver.findElement(By.xpath(beforexpath +customerEmploymentTestDataType.CustomerFirstName+ afterxpath)).click();
    	Thread.sleep(1000);
    	javaScriptHelper.scrollIntoView(customerEmploymentObj.customerEmployment_CustomerEmploymentFirstRecordEdit());
    	waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_CustomerEmploymentFirstRecordEdit());
    	customerEmploymentObj.customerEmployment_CustomerEmploymentFirstRecordEdit().click();
    }
    

    @Then("^verify system should allow user to do a modification of Customer Employment Details record with valid data$")
    public void verify_system_should_allow_user_to_do_a_modification_of_customer_employment_details_record_with_valid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_EmployeeID());
    	customerEmploymentObj.customerEmployment_EmployeeID().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	customerEmploymentObj.customerEmployment_EmployeeID().sendKeys(customerEmploymentTestDataType.EmployeeID);
    	waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_SaveButton());
    	customerEmploymentObj.customerEmployment_SaveButton().click();
    }

    @Then("^verify system display the confirmation message post clicking on save button of Customer Employment Details record$")
    public void verify_system_display_the_confirmation_message_post_clicking_on_save_button_of_customer_employment_details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerEmploymentObj.customerEmployment_SaveConfirmationMessage());
    	boolean status = customerEmploymentObj.customerEmployment_SaveConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    }
    
    
}