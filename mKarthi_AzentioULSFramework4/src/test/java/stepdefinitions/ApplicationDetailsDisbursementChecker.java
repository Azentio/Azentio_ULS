package stepdefinitions;

import static org.testng.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.Transactions_ScreenOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.TransactionScreenTestDataType;

public class ApplicationDetailsDisbursementChecker {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Transactions_ScreenOBJ Transaction = new Transactions_ScreenOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	TransactionScreenTestDataType Transactionjson = jsonConfig.getTransactionScreenListByName("Maker");
	
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","AppDetailsDisChkerTestData","Data Set ID");
	Map<String, String> testData;
	//
	Map<String, String> AppDetailsDisChkerTestData = new HashMap<>();

	@And("^User click the action edit icon in application detail disbursement checker$")
	public void user_click_the_action_edit_icon_in_application_detail_disbursement_checker() throws Throwable {

		testData = excelData.getTestdata("AT-ADC-001-D1");
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchiconreferenceid(), 60, 5);
		Transaction.searchiconreferenceid().click();

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchsentkeys(), 60, 5);
		Transaction.searchsentkeys().sendKeys(testData.get("Inbox Search"));

		Thread.sleep(2000);

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.inboxediticon(), 60, 5);
		Transaction.inboxediticon().click();

	}

	@And("^User verify the classification field in application detail disbursement checker$")
	public void user_verify_the_classification_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_Classification(), 60, 5);

		boolean status = Transaction.ApplicationDetails_Classification().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Primary product field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the product field in application detail disbursement checker$")
	public void user_verify_the_product_field_in_application_detail_disbursement_checker()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_Product(), 60, 5);

		boolean status = Transaction.ApplicationDetails_Product().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Primary sub product field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the total finanace amount requested field in application detail disbursement checker$")
	public void user_verify_the_total_finanace_amount_requested_field_in_application_detail_disbursement_checker()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_TotalFinanceAmountRequested(), 60, 5);

		boolean status = Transaction.ApplicationDetails_TotalFinanceAmountRequested().getAttribute("ng-reflect-readonly")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Total Finance Amount Requested field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the declared net income field in application detail disbursement checker$")
	public void user_verify_the_declared_net_income_field_in_application_detail_disbursement_checker()
			throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_DeclaredNetIncome(), 60, 5);

		boolean status = Transaction.ApplicationDetails_DeclaredNetIncome().getAttribute("ng-reflect-readonly")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Declared Net Income field should be non eitable one but here it is editable hence failed");


	}

	@And("^User verify the declared current obligations field in application detail disbursement checker$")
	public void user_verify_the_declared_current_obligations_field_in_application_detail_disbursement_checker()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_DeclaredCurrentObligations(), 60, 5);

		boolean status = Transaction.ApplicationDetails_DeclaredCurrentObligations().getAttribute("ng-reflect-readonly")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"DeclaredCurrentObligations field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the special promotion campaign field in application detail disbursement checker$")
	public void user_verify_the_special_promation_campaign_field_in_application_detail_disbursement_checker()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_SpecialPromotionCampaign(), 60, 5);

		boolean status = Transaction.ApplicationDetails_SpecialPromotionCampaign().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Special Promotion Campaign field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the sourcing channel field in application detail disbursement checker$")
	public void user_verify_the_sourcing_channel_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_SourcingChannel(), 60, 5);

		boolean status = Transaction.ApplicationDetails_SourcingChannel().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"SourcingChannel field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the business center code field in application detail disbursement checker$")
	public void user_verify_the_business_center_code_field_in_application_detail_disbursement_checker()
			throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_BusinessCenterCode(), 60, 5);

		boolean status = Transaction.ApplicationDetails_BusinessCenterCode().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Business Center Code field should be non eitable one but here it is editable hence failed");

		
	}

	@And("^User verify the servicing type field in application detail disbursement checker$")
	public void user_verify_the_servicing_type_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_ServicingType(), 60, 5);

		boolean status = Transaction.ApplicationDetails_ServicingType().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Servicing Type field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the region field in application detail disbursement checker$")
	public void user_verify_the_region_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_Region(), 60, 5);

		boolean status = Transaction.ApplicationDetails_Region().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Servicing Entity field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the servicing branch field in application detail disbursement checker$")
	public void user_verify_the_servicing_branch_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_ServicingBranch(), 60, 5);

		boolean status = Transaction.ApplicationDetails_ServicingBranch().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Servicing Branch field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the closing staff or servicing staff or RM field in application detail disbursement checker$")
	public void user_verify_the_closing_staff_or_servicing_staff_or_rm_field_in_application_detail_disbursement_checker()
			throws Throwable {
		
		seleniumactions.getJavascriptHelper().scrollDownVertically();

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_ClosingStaffOrServicingStaffOrRM(), 60, 5);

		boolean status = Transaction.ApplicationDetails_ClosingStaffOrServicingStaffOrRM().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Closing Staff Or Servicing Staff Or RM field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the sourcing type field in application detail disbursement checker$")
	public void user_verify_the_sourcing_type_field_in_application_detail_disbursement_checker() throws Throwable {
		
		seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.ApplicationDetails_SourcingType());

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_SourcingType(), 60, 5);

		boolean status = Transaction.ApplicationDetails_SourcingType().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Sourcing Type field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the sourcing staff field in application detail disbursement checker$")
	public void user_verify_the_sourcing_staff_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_SourcingStaff(), 60, 5);

		boolean status = Transaction.ApplicationDetails_SourcingStaff().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Sourcing Staff field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the sourcing entity field in application detail disbursement checker$")
	public void user_verify_the_sourcing_entity_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_SourcingEntity(), 60, 5);

		boolean status = Transaction.ApplicationDetails_SourcingEntity().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Sourcing Entity field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the sourcing office field in application detail disbursement checker$")
	public void user_verify_the_sourcing_office_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_SourcingOffice(), 60, 5);
		
		seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.ApplicationDetails_SourcingOffice());

		boolean status = Transaction.ApplicationDetails_SourcingOffice().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Sourcing Office field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the reference type field in application detail disbursement checker$")
	public void user_verify_the_reference_type_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_ReferenceType(), 60, 5);

		boolean status = Transaction.ApplicationDetails_ReferenceType().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Reference Type field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the reference entity field in application detail disbursement checker$")
	public void user_verify_the_reference_entity_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_ReferenceEntity(), 60, 5);

		boolean status = Transaction.ApplicationDetails_ReferenceEntity().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Reference Entity field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the reference code field in application detail disbursement checker$")
	public void user_verify_the_reference_code_field_in_application_detail_disbursement_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_ReferenceCode(), 60, 5);

		boolean status = Transaction.ApplicationDetails_ReferenceCode().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Reference code field should be non eitable one but here it is editable hence failed");

	}

	@And("^User click the work flow icon in application detail disbursement checker$")
	public void user_click_the_work_flow_icon_in_application_detail_disbursement_checker() throws Throwable {

		seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.ViewSummary());
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ViewSummary(), 60, 5);
		seleniumactions.getClickAndActionsHelper().doubleClick(Transaction.ViewSummary());
		
		

		//help.waitForElementToVisibleWithFluentWait(driver, Transaction.ViewSummaryClose(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				Transaction.ViewSummaryClose().click();
				break;
			} catch (Exception e) {
				
			}
		}
	//Transaction.ViewSummaryClose().click();
		
		softAssert.assertAll();

	}

	@And("^User verify the availability of add button in application detail disbursement checker$")
	public void user_verify_the_customer_details_list_view_in_application_detail_disbursement_checker()
			throws Throwable {

		try {

			WebElement add = driver.findElement(By.xpath("//button[@ng-reflect-text='Add']"));
			add.click();

		} catch (Exception e) {

			System.out.println("Add icon is not available");

		}

	}

	@And("^User Verify the Values in List view should be non editable in application detail disbursement checker$")
	public void user_verify_the_values_in_list_view_should_be_non_editable_in_application_detail_disbursement_checker()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_Classification(), 60, 5);

		boolean status = Transaction.ApplicationDetails_Classification().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Primary product field should be non eitable one but here it is editable hence failed");

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_Product(), 60, 5);

		boolean status1 = Transaction.ApplicationDetails_Product().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status1);

		softAssert.assertTrue(status1,
				"Primary sub product field should be non eitable one but here it is editable hence failed");

	}

	@And("^User verify the back button functionality in application detail disbursement checker$")
	public void user_verify_the_back_button_functionality_in_application_detail_disbursement_checker()
			throws Throwable {

		for (int i = 0; i < 20; i++) {
			try {
				Transaction.BackArrow().click();
				break;

			} catch (Exception e) {

			}
		
		}
		softAssert.assertAll();

	}
	
	//Pre-Request
	
	@And("^User click the action edit icon in application details pre-request$")
    public void user_click_the_action_edit_icon_in_application_details_prerequest() throws Throwable {
        
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchiconreferenceid(), 60, 5);
		Transaction.searchiconreferenceid().click();

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchsentkeys(), 60, 5);
		Transaction.searchsentkeys().sendKeys(Transactionjson.ApplicationDetailsPreRequestSearch1);

		Thread.sleep(2000);

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.inboxediticon(), 60, 5);
		Transaction.inboxediticon().click();

    }
	@And("^User get the test data for application details disbursemnt checker1$")
    public void user_get_the_test_data_for_application_details_disbursemnt_checker1() throws Throwable {
		AppDetailsDisChkerTestData = testData = excelData.getTestdata("AT-ADC-001-D1");
    }

    @And("^User get the test data for application details disbursemnt checker2$")
    public void user_get_the_test_data_for_application_details_disbursemnt_checker2() throws Throwable {
    	AppDetailsDisChkerTestData = testData = excelData.getTestdata("AT-ADC-002-D1");
    }
	


}
