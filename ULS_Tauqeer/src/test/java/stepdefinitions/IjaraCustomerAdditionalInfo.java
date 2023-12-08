package stepdefinitions;

import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class IjaraCustomerAdditionalInfo {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");

	/*
	 * JSPaths livingExpensesJsPaths = new JSPaths(excelPath,
	 * "TawarooqLivingExpenses_Elements", "LivingExpenses_FieldName", "JSPath");
	 */
	
	JSPaths AdditionalCustomerInfoJsPaths = new JSPaths(excelPath, "Ijara_AddCustInfoElements",
			"AdditionalCustomerInfo_FieldName", "JSPath");

	// ApplicationDetailsPageObj appObj = new ApplicationDetailsPageObj(driver);
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	
	ExcelData additionalCustustomerInfo_TestData = new ExcelData(excelTestDataPath, "Ijara_AddCustInfo_TestData",
			"DataSet ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	Robot robot;
	SoftAssert softAssert = new SoftAssert();
	WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(2000));

	// Testdata
	//At_IDA_007
	@And("^User get the test data for test case AT_IDA_07")
	public void get_the_test_data_for_test_case_search_customer_AT_IDA_07() throws Throwable {
		testData = additionalCustustomerInfo_TestData.getTestdata("DS_AT_IDA_07");
    }
	
	@And("User click the module name dropdown in ULS application for Additional Customer Info at New Application Stage")
	public void user_click_the_module_name_dropdown_in_uls_application_for_additional_customer_info_at_new_application_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(AdditionalCustomerInfoJsPaths.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(AdditionalCustomerInfoJsPaths.getElement("moduleNameDropdown"))
						.click();
				System.out.println(testData.get("Module Name"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("User select the module name as LOS1 in ULS application for Additional Customer Info at New Application Stage")
	public void user_select_the_module_name_as_los1_in_uls_application_for_additional_customer_info_at_new_application_stage() throws Throwable {
		try {
			
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
		} catch (Exception e) {
			// TODO: handle exception
			
			Assert.fail(e.getMessage());
		}
		// clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
	}
	
	
	@And("user click the Additional Customer Info tab")
	public void user_click_the_additional_customer_info_tab() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
			//	executeScriptWithWebElement(AdditionalCustomerInfoJsPaths.getElement("AdditionalCustomerInfoTab")));
		
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper.JSEClick(javascriptHelper.
								executeScriptWithWebElement(AdditionalCustomerInfoJsPaths.getElement("AdditionalCustomerInfoTab")));
				

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	@And("user click on the Add button under Customer Personal Information under Additional Customer Info tab")
	public void user_click_on_the_add_button_under_customer_personal_information_under_additional_customer_info_tab() throws IOException {
		/*
		 * waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
		 * executeScriptWithWebElement(AdditionalCustomerInfoJsPaths.getElement(
		 * "CustomerPersonalInfo_AddBtn")));
		 */
		
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper.JSEClick(javascriptHelper.
						executeScriptWithWebElement(AdditionalCustomerInfoJsPaths.getElement("CustomerPersonalInfo_AddBtn")));
				

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("user click on the Add button under Customer Identification under Additional Customer Info tab")
	public void user_click_on_the_add_button_under_customer_identification_under_additional_customer_info_tab() throws IOException {
		/*
		 * waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
		 * executeScriptWithWebElement(AdditionalCustomerInfoJsPaths.getElement(
		 * "CustomerIdentification_AddBtn")));
		 */
		
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement(AdditionalCustomerInfoJsPaths.getElement("CustomerIdentification_AddBtn")).click();
				

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
}
