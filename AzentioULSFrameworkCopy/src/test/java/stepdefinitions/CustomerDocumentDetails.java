package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CustomerDocumentDetailsObj;
import pageobjects.KULS_LoginObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.CustomerDocumentDetailsTestDataType;
import testDataType.KULS_Login_TestDataType;

public class CustomerDocumentDetails {

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
	CustomerDocumentDetailsObj documentDetailsObj = new CustomerDocumentDetailsObj(driver);
	CustomerDocumentDetailsTestDataType documentDetailsTestDataType = jsonConfig.getCustomerDocumentDetailsByName("Maker");
	SoftAssert softAssert = new SoftAssert();
	
	@Then("^user should click on the menu toggle in login page$")
    public void user_should_click_on_the_menu_toggle_in_login_page() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_Maker_MenuToggle());
		documentDetailsObj.customerDocumentDetails_Maker_MenuToggle().click();
    }

    @Then("^click on inbox to search for the Customer Document Details record$")
    public void click_on_inbox_to_search_for_the_Customer_Document_Details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_Inbox());
    	documentDetailsObj.customerDocumentDetails_Inbox().click();
    }

    @Then("^click on search button to search the record of Customer Document Details in inbox$")
    public void click_on_search_button_to_search_the_record_of_Customer_Document_Details_in_inbox() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchInbox());
    	documentDetailsObj.customerDocumentDetails_SearchInbox().click();
    }

    @Then("^enter the reference id of the Customer Document Details record$")
    public void enter_the_reference_id_of_the_Customer_Document_Details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchInboxInputField());
    	documentDetailsObj.customerDocumentDetails_SearchInboxInputField().sendKeys(documentDetailsTestDataType.ReferenceID);
	
    }

    @Then("^click on the entitle button of the Customer Document Details record of that reference id$")
    public void click_on_the_entitle_button_of_the_Customer_Document_Details_record_of_that_reference_id() throws Throwable {
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

    @Then("^click on the Document Details tab$")
    public void click_on_the_document_details_tab() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_DocumentDetailTab());
		documentDetailsObj.customerDocumentDetails_DocumentDetailTab().click();
    }
    
    @Then("^open the record of Customer Document Details to modify$")
    public void open_the_record_of_Customer_Document_Details_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchButton());
    	documentDetailsObj.customerDocumentDetails_SearchButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchInputField());
    	documentDetailsObj.customerDocumentDetails_SearchInputField().sendKeys(documentDetailsTestDataType.Number);
    	String beforexpath= "//span[contains(text(),'"; 
    	String afterxpath= "')]/../../../td[2]/span/button[1]";
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +documentDetailsTestDataType.Number+ afterxpath)));
    	driver.findElement(By.xpath(beforexpath +documentDetailsTestDataType.Number+ afterxpath)).click();
    	Thread.sleep(1000);
    	javaScriptHelper.scrollIntoView(documentDetailsObj.customerDocumentDetails_DocumentDetailFirstRecordEdit());
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_DocumentDetailFirstRecordEdit());
    	documentDetailsObj.customerDocumentDetails_DocumentDetailFirstRecordEdit().click();
    }
    

    @Then("^verify system should allow user to do a modification of Customer Document Details record before approved$")
    public void verify_system_should_allow_user_to_do_a_modification_of_Customer_Document_Details_record_before_approved() throws Throwable {
    	RadioButtonHelper radioButtonHelper = new  RadioButtonHelper(driver);
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_DocumentName());
    	documentDetailsObj.customerDocumentDetails_DocumentName().click();
    	radioButtonHelper.radioButton(documentDetailsTestDataType.DocumentName);
    	Thread.sleep(500);
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_MandatoryOrOptional());
    	documentDetailsObj.customerDocumentDetails_MandatoryOrOptional().click();
    	radioButtonHelper.radioButton(documentDetailsTestDataType.MandatoryOrOptional);
    	Thread.sleep(500);
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_DocumentCategory());
    	documentDetailsObj.customerDocumentDetails_DocumentCategory().click();
    	radioButtonHelper.radioButton(documentDetailsTestDataType.DocumentCategory);
    	Thread.sleep(500);
//    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_DocumentStatus());
//    	documentDetailsObj.customerDocumentDetails_DocumentStatus().click();
//    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SaveButton());
//    	documentDetailsObj.customerDocumentDetails_SaveButton().click();
    }
    
    @Then("^verify system should allow user to do a modification with valid data$")
    public void verify_system_should_allow_user_to_do_a_modification_with_valid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SaveButton());
    	documentDetailsObj.customerDocumentDetails_SaveButton().click();
    }

    @Then("^verify system display the confirmation message post clicking on save button of Customer Document Details record$")
    public void verify_system_display_the_confirmation_message_post_clicking_on_save_button_of_Customer_Document_Details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SaveConfirmationMessage());
    	boolean status = documentDetailsObj.customerDocumentDetails_SaveConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    }
    
    @And("^verify the same record of Customer Document Details should get saved in a system$")
    public void verify_the_same_record_of_customer_document_details_should_get_saved_in_a_system() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchButton());
    	documentDetailsObj.customerDocumentDetails_SearchButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchInputField());
    	documentDetailsObj.customerDocumentDetails_SearchInputField().sendKeys(documentDetailsTestDataType.Number);
    	String beforexpath= "//span[contains(text(),'"; 
    	String afterxpath= "')]/../../../td[2]/span/button[1]";
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +documentDetailsTestDataType.Number+ afterxpath)));
    	driver.findElement(By.xpath(beforexpath +documentDetailsTestDataType.Number+ afterxpath)).click();
    	Thread.sleep(1000);
    	javaScriptHelper.scrollIntoView(documentDetailsObj.customerDocumentDetails_DocumentDetailFirstRecordEdit());
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_DocumentDetailFirstRecordEdit());
    	boolean status = documentDetailsObj.customerDocumentDetails_DocumentDetailFirstRecordEdit().isDisplayed();
    	Assert.assertTrue(status);
    }
    
    
}