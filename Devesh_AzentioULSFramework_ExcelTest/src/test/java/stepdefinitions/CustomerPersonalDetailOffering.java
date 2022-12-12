package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
import pageobjects.CustomerPersonalDetailOfferingObj;
import pageobjects.KULS_LoginObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.CustomerPersonalDetailOfferingTestDataType;
import testDataType.KULS_Login_TestDataType;

public class CustomerPersonalDetailOffering {

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
	CustomerPersonalDetailOfferingObj customerPersonalDetailOfferingObj = new CustomerPersonalDetailOfferingObj(driver);
	CustomerPersonalDetailOfferingTestDataType customerPersonalDetailOfferingTestDataType = jsonConfig.getCustomerPersonalDetailOfferingByName("Maker");
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","PersonalDetailOfferingTestData","Data Set ID");
	Map<String, String> testData;
	String dataSetID;
	
	@Then("^user should click on menu to open the sidebar$")
	public void user_should_click_on_menu_to_open_the_sidebar() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerPersonalDetailOfferingObj.customerPersonalDetailOffering_Maker_MenuToggle());
		customerPersonalDetailOfferingObj.customerPersonalDetailOffering_Maker_MenuToggle().click();
	}

	@Then("^click on inbox to search for the personal detail offering record$")
	public void click_on_inbox_to_search_for_the_personal_detail_offering_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerPersonalDetailOfferingObj.customerPersonalDetailOffering_Inbox());
		customerPersonalDetailOfferingObj.customerPersonalDetailOffering_Inbox().click();
	}

	@Then("^click on search button to search the record of personal detail offering$")
	public void click_on_search_button_to_search_the_record_of_personal_detail_offering() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerPersonalDetailOfferingObj.customerPersonalDetailOffering_SearchInbox());
		customerPersonalDetailOfferingObj.customerPersonalDetailOffering_SearchInbox().click();
	}

	@Then("^enter the reference id of the personal detail offering record$")
	public void enter_the_reference_id_of_the_personal_detail_offering_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerPersonalDetailOfferingObj.customerPersonalDetailOffering_SearchInboxInputField());
		customerPersonalDetailOfferingObj.customerPersonalDetailOffering_SearchInboxInputField().sendKeys(testData.get("Application id"));
	}

	@Then("^click on the entitle button of the record of that reference id$")
	public void click_on_the_entitle_button_of_the_record_of_that_reference_id() throws Throwable {
		String beforexpath= "//span[contains(text(),'";
		String afterxpath= "')]/../../td/button";
		while(true) {
			try {
				driver.findElement(By.xpath(beforexpath + testData.get("Application id") + afterxpath)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	}
	
	@Then("^click on the customer details tab in customer personal information screen$")
    public void click_on_the_customer_details_tab_in_customer_personal_information_screen() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerPersonalDetailOfferingObj.customerPersonalDetailOffering_CustomerDetailTab());
		customerPersonalDetailOfferingObj.customerPersonalDetailOffering_CustomerDetailTab().click();
    }

	@Then("^verify system should display mention fields of customer details list view$")
	public void verify_system_should_display_mention_fields_of_customer_details_list_view() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerPersonalDetailOfferingObj.customerPersonalDetailOffering_BackButton());
		boolean res = customerPersonalDetailOfferingObj.customerPersonalDetailOffering_BackButton().isDisplayed();
		Assert.assertTrue("true", res);
		boolean res1 = customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewCIF_Id().isDisplayed();
		Assert.assertTrue("true", res1);
		boolean res2 = customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewFirstNameField().isDisplayed();
		Assert.assertTrue("true", res2);
		boolean res3 = customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewMiddleNameField().isDisplayed();
		Assert.assertTrue("true", res3);
		boolean res4 = customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewLastNameField().isDisplayed();
		Assert.assertTrue("true", res4);
		boolean res5 = customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewCustomerTypeField().isDisplayed();
		Assert.assertTrue("true", res5);
		boolean res6 = customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewApplicantTypeField().isDisplayed();
		Assert.assertTrue("true", res6);
		boolean res7 = customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewStatusField().isDisplayed();
		Assert.assertTrue("true", res7);
	}

	@Then("^system should verify the values in the list view should be in read only mode$")
	public void system_should_verify_the_values_in_the_list_view_should_be_in_read_only_mode() throws Throwable {
		try {
			customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewCIF_IdValue().sendKeys(customerPersonalDetailOfferingTestDataType.EditText);;
			System.out.println("CIF_Id Value in the list view is not in read only mode");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("CIF_Id Value in the list view is in read only mode");
		}
		try {
			customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewFirstNameFieldValue().sendKeys(customerPersonalDetailOfferingTestDataType.EditText);;
			System.out.println("FirstName Value in the list view is not in read only mode");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("FirstName Value in the list view is in read only mode");
		}
		try {	
			customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewLastNameFieldValue().sendKeys(customerPersonalDetailOfferingTestDataType.EditText);;
			System.out.println("LastName Value in the list view is not in read only mode");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("LastName Value in the list view is in read only mode");
		}
		try {
			customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewMiddleNameFieldValue().sendKeys(customerPersonalDetailOfferingTestDataType.EditText);;
			System.out.println("MiddleName Value in the list view is not in read only mode");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("MiddleName Value in the list view is in read only mode");
		}
		try {
			customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewCustomerTypeFieldValue().sendKeys(customerPersonalDetailOfferingTestDataType.EditText);;
			System.out.println("CustomerType Value in the list view is not in read only mode");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("CustomerType Value in the list view is in read only mode");
		}
		try {
			customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewApplicantTypeFieldValue().sendKeys(customerPersonalDetailOfferingTestDataType.EditText);;
			System.out.println("ApplicantType Value in the list view is not in read only mode");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ApplicantType Value in the list view is in read only mode");
		}
		try {
			customerPersonalDetailOfferingObj.customerPersonalDetailOffering_ListViewStatusFieldValue().sendKeys(customerPersonalDetailOfferingTestDataType.EditText);;
			System.out.println("Status Value in the list view is not in read only mode");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Status Value in the list view is in read only mode");
		}
	}

	@Then("^verify the functionality of the back button in the personal detail offering stage$")
	public void verify_the_functionality_of_the_back_button_in_the_personal_detail_offering_stage() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerPersonalDetailOfferingObj.customerPersonalDetailOffering_BackButton());
		customerPersonalDetailOfferingObj.customerPersonalDetailOffering_BackButton().click();
	}
	
	@Then("^select data set ID for personal details offering testcase002$")
    public void select_data_set_id_for_personal_details_offering_testcase001() throws Throwable {
		dataSetID = "AT_PDO_002_D1";
        testData = excelData.getTestdata(dataSetID);
    }

}