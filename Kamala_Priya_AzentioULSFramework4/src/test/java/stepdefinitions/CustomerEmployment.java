package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.CustomerEmploymentObj;
import pageobjects.KULS_LoginObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.CustomerEmploymentTestDataType;
import testDataType.KULS_Login_TestDataType;

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
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00073\\Downloads\\UlsTestDataDesign.xlsx","CustomerEmployment","Data Set ID");
	Map<String, String> testData;

    @Then("^choose the data set id for modification with valid data in customer employment$")
    public void choose_the_data_set_id_for_modification_with_valid_data_in_customer_employment() throws Throwable {
testData=excelData.getTestdata("AT-CE-007-D1");
    }

	@Then("^user should click on the menu toggle from maker side$")
    public void user_should_click_on_the_menu_toggle_from_maker_side() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_Maker_MenuToggle(), 60, 2);
		customerEmploymentObj.customerEmployment_Maker_MenuToggle().click();
    }

    @Then("^click on inbox to search for the Customer Employment record$")
    public void click_on_inbox_to_search_for_the_Customer_Employment_record() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_Inbox(), 60, 2);
    	customerEmploymentObj.customerEmployment_Inbox().click();
    }

    @Then("^click on search button to search the record of Customer Employment in inbox$")
    public void click_on_search_button_to_search_the_record_of_Customer_Employment_in_inbox() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_SearchInbox(), 60, 2);
    	customerEmploymentObj.customerEmployment_SearchInbox().click();
    }

    @Then("^enter the reference id of the Customer Employment record$")
    public void enter_the_reference_id_of_the_Customer_Employment_record() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_SearchInboxInputField(), 60, 2);
    	customerEmploymentObj.customerEmployment_SearchInboxInputField().sendKeys(testData.get("ReferenceID"));
	
    }

    @Then("^click on the entitle button of the Customer Employment record of that reference id$")
    public void click_on_the_entitle_button_of_the_Customer_Employment_record_of_that_reference_id() throws Throwable {
    	String beforexpath= "//span[contains(text(),'";
		String afterxpath= "')]/../../td/button";
		while(true) {
			try {
				driver.findElement(By.xpath(beforexpath + testData.get("ReferenceID") + afterxpath)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    }

    @Then("^click on the Customer Financials tab$")
    public void click_on_the_customer_financials_tab() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_CustomerFinancialTab(), 60, 2);
		customerEmploymentObj.customerEmployment_CustomerFinancialTab().click();
    }
    
    @Then("^open the record of Customer Employment to modify$")
    public void open_the_record_of_customer_employment_to_modify() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_SearchButton(), 60, 2);
    	customerEmploymentObj.customerEmployment_SearchButton().click();
    	
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_SearchInputField(), 60, 2);
    	customerEmploymentObj.customerEmployment_SearchInputField().sendKeys(testData.get("CustomerFirstName"));
    	String beforexpath= "//span[contains(text(),'"; 
    	String afterxpath= "')]/../../../td[2]/span/button[1]";
		waithelper.waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(beforexpath +testData.get("CustomerFirstName")+ afterxpath)), 60, 2);
    	driver.findElement(By.xpath(beforexpath +testData.get("CustomerFirstName")+ afterxpath)).click();
    	Thread.sleep(1000);
    	javaScriptHelper.scrollIntoView(customerEmploymentObj.customerEmployment_CustomerEmploymentFirstRecordEdit());
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_CustomerEmploymentFirstRecordEdit(), 60, 2);
    	customerEmploymentObj.customerEmployment_CustomerEmploymentFirstRecordEdit().click();
    }
    

    @Then("^verify system should allow user to do a modification of Customer Employment Details record with valid data$")
    public void verify_system_should_allow_user_to_do_a_modification_of_customer_employment_details_record_with_valid_data() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_EmployeeID(), 60, 2);
    	customerEmploymentObj.customerEmployment_EmployeeID().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	customerEmploymentObj.customerEmployment_EmployeeID().sendKeys(Keys.BACK_SPACE);
    	customerEmploymentObj.customerEmployment_EmployeeID().sendKeys(customerEmploymentTestDataType.EmployeeID);
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_SaveButton(), 60, 2);
    	customerEmploymentObj.customerEmployment_SaveButton().click();
    }

    @Then("^verify system display the confirmation message post clicking on save button of Customer Employment Details record$")
    public void verify_system_display_the_confirmation_message_post_clicking_on_save_button_of_customer_employment_details_record() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, customerEmploymentObj.customerEmployment_SaveConfirmationMessage(), 60, 2);
     	boolean status = customerEmploymentObj.customerEmployment_SaveConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    }
    
    
}