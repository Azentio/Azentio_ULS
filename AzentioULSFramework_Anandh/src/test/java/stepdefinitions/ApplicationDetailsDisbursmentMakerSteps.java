package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationDetailsAppDataEntryObj;
import pageobjects.KULS_CommonWebElements;
import resources.BaseClass;
import resources.ExcelData;

public class ApplicationDetailsDisbursmentMakerSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	String path = System.getProperty("user.dir") + "\\Test-data\\ULSTestData.xlsx";
	Map<String, String> loginTestData = new HashMap<>();
	Map<String, String> applicationDetailsDisbMkrTestData = new HashMap<>();
	KULS_CommonWebElements kulsCommonWebElements = new KULS_CommonWebElements(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ExcelData ExcelDataForApplicationDetailsDisbursmentMaker = new ExcelData(path, "ApplicationDetails_DisbMaker",
			"Data Set ID");
	ApplicationDetailsAppDataEntryObj applicationDetailsDisbursmentMakerObj = new ApplicationDetailsAppDataEntryObj(
			driver);
	SoftAssert softAssert = new SoftAssert();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	@And("^login with transaction maker credentials$")
	public void login_with_transaction_maker_credentials() throws Throwable {
		ExcelData ExcelDataForMakerLogin = new ExcelData(path, "LoginCredentials", "Stage");
		loginTestData = ExcelDataForMakerLogin.getTestdata("Maker2");
		kulsLogin.loginUlsApplicationAsMaker(loginTestData.get("Username"), loginTestData.get("Password"));
	}

	@And("^get the test data for application details disbursment maker test data$")
	public void get_the_test_data_for_application_details_disbursment_maker_test_data() throws Throwable {
		applicationDetailsDisbMkrTestData = ExcelDataForApplicationDetailsDisbursmentMaker.getTestdata("AT_ADM_002_D1");
	}

	@And("^search for disbursment maker record$")
	public void search_for_disbursment_maker_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, kulsCommonWebElements.ulsNotificationSearchTextBox(),
				20, 1);
		clicksAndActionsHelper.moveToElement(kulsCommonWebElements.ulsNotificationSearchTextBox());
		clicksAndActionsHelper.clickOnElement(kulsCommonWebElements.ulsNotificationSearchTextBox());
		kulsCommonWebElements.ulsNotificationSearchTextBox()
				.sendKeys(applicationDetailsDisbMkrTestData.get("Stage Code"));
	}

	@And("^verify Topup Type should be non editable and read only in disbursment maker$")
	public void verify_topup_type_should_be_non_editable_and_read_only_in_disbursment_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsTopupTypeDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsTopupTypeDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Topup type field should be non editable but here it is editable hence failed");
	}

	@And("^verify classification field should be non editable in disbursment maker$")
	public void verify_classification_field_should_be_non_editable_in_disbursment_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsClassificationDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsClassificationDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Classification field should be non editable but here it is editable hence failed");
	}

	@And("^and select the disbursment maker record$")
	public void and_select_the_disbursment_maker_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsDisbursmentMakerNotificationRecord(), 20, 1);
		applicationDetailsDisbursmentMakerObj.applicationDetailsDisbursmentMakerNotificationRecord().click();
	}

	@And("^click on application details screeen$")
	public void click_on_application_details_screeen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsApplicationDetailsSegmentButton(), 20, 1);
		applicationDetailsDisbursmentMakerObj.applicationDetailsApplicationDetailsSegmentButton().click();
	}

	@And("^verify product field should be non editable in disbursment maker$")
	public void verify_product_field_should_be_non_editable_in_disbursment_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsProductDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsProductDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Product field should be non editable but here it is editable hence failed");
	}

	@And("^verify total finance amunt requested field should be non editable in disbursment maker$")
	public void verify_total_finance_amunt_requested_field_should_be_non_editable_in_disbursment_maker()
			throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsTotalFinanceAmmountRequested(), 20, 1);
		for (int i = 0; i <= 10; i++) {
			try {
				applicationDetailsDisbursmentMakerObj.applicationDetailsTotalFinanceAmmountRequested().click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					status = true;
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(status, " total finance amount requested field might be non editable but here editable");
	}

	@And("^verify declared Net monthly income field should bee non editable in disbursment maker$")
	public void verify_declared_net_monthly_income_field_should_bee_non_editable_in_disbursment_maker()
			throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsDeclaredetMonthlyIncomeTextBox(), 20, 1);
		for (int i = 0; i <= 500; i++) {
			try {
				applicationDetailsDisbursmentMakerObj.applicationDetailsDeclaredetMonthlyIncomeTextBox().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					status = true;
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(status, " declared monthly income field might be non editable but here editable");
	}

	@And("^verify declared current obligation field should be non editable in disbursment maker$")
	public void verify_declared_current_obligation_field_should_be_non_editable_in_disbursment_maker()
			throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsDeclaredeCurrentObligationTextBox(), 20, 1);
		for (int i = 0; i <= 500; i++) {
			try {
				applicationDetailsDisbursmentMakerObj.applicationDetailsDeclaredeCurrentObligationTextBox().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					status = true;
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(status, " Declared Current obligation field might be non editable but here editable");
	}

	@And("^verify special promotion Campaign field should be non editable in disbursment maker$")
	public void verify_special_promotioncampaign_field_should_be_non_editable_in_disbursment_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsSpecialPromotionCampaignDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsSpecialPromotionCampaignDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Special Promotion Campaign should be non editable but here it is editable hence failed");
	}

	@And("^verify sourcing channel field should be non editable in disbursment maker$")
	public void verify_sourcing_channel_field_should_be_non_editable_in_disbursment_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsSourcingChannelDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsSourcingChannelDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Sourcing channel should be non editable but here it is editable hence failed");
	}

	@And("^verify business center code field should be non editable in disbursment maker$")
	public void verify_business_center_code_field_should_be_non_editable_in_disbursment_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsBusinessCenterCodeDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsBusinessCenterCodeDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Business Center Code should be non editable but here it is editable hence failed");
	}

	@And("^verify servicing type field should be non editable in disbursment maker$")
	public void verify_servicing_type_field_should_be_non_editable_in_disbursment_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsServiceTypeCodeDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsServiceTypeCodeDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Servicing type should be non editable but here it is editable hence failed");
	}

	@And("^veirfy region field should be non editable and readonly on disbursment maker$")
	public void veirfy_region_field_should_be_non_editable_and_readonly_on_disbursment_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsRegionCodeDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsRegionCodeDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Region should be non editable but here it is editable hence failed");
	}

	@And("^verify servcing Branch should be non editable and read only on disbursment maker$")
	public void verify_servcing_branch_should_be_non_editable_and_read_only_on_disbursment_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsServicingBranchCodeDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsServicingBranchCodeDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Servicing Branch should be non editable but here it is editable hence failed");
	}

	@And("^verify spoke location should be non editable and readonly on disbursment maker$")
	public void verify_spoke_location_should_be_non_editable_and_readonly_on_disbursment_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsSpokeLocationDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsSpokeLocationDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Spoke Location Branch should be non editable but here it is editable hence failed");
	}

	@And("^verify closing staff or servicing staf Or RM should be non editable and read only in disbursment maker$")
	public void verify_closing_staff_or_servicing_staf_or_rm_should_be_non_editable_and_read_only_in_disbursment_maker()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsClosingStafforServicingStafforRMDropdown(), 20,
				1);
		String validation = applicationDetailsDisbursmentMakerObj
				.applicationDetailsClosingStafforServicingStafforRMDropdown().getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Closing Staff or servicing staff or RM should be non editable but here it is editable hence failed");
	}

	@And("^verify Topup Application number should be non editable and read only in disbursment maker$")
	public void verify_topup_application_number_should_be_non_editable_and_read_only_in_disbursment_maker()
			throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsTopupApplicationNoInputBox(), 20, 1);
		for (int i = 0; i <= 500; i++) {
			try {
				applicationDetailsDisbursmentMakerObj.applicationDetailsTopupApplicationNoInputBox().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					status = true;
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(status, " Application number field might be non editable but here editable");
	}

	@And("^verify sourcing type field should be non editable and real only mode in disbursment maker$")
	public void verify_sourcing_type_field_should_be_non_editable_and_real_only_mode_in_disbursment_maker()
			throws Throwable {
		javascriptHelper.scrollIntoView(applicationDetailsDisbursmentMakerObj.applicationDetailsSourcingTypeDropdown());
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsSourcingTypeDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Sourcing Staff should be non editable but here it is editable hence failed");
	}

	@And("^verify sourcing office field should be non editable and read only mode in disbursment maker$")
	public void verify_sourcing_office_field_should_be_non_editable_and_read_only_mode_in_disbursment_maker()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsSourcingOfficeDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsSourcingOfficeDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Sourcing Office should be non editable but here it is editable hence failed");
	}

	@And("^verify sourcing entity field should be non editable and read only mode in disbursment maker$")
	public void verify_sourcing_entity_field_should_be_non_editable_and_read_only_mode_in_disbursment_maker()
			throws Throwable {
		javascriptHelper
				.scrollIntoView(applicationDetailsDisbursmentMakerObj.applicationDetailsSourcingEntityDropdown());
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsSourcingEntityDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Sourcing Entity should be non editable but here it is editable hence failed");
	}

	@And("^verify sourcing staff field should be non editable and read only mode in disbursment maker$")
	public void verify_sourcing_staff_field_should_be_non_editable_and_read_only_mode_in_disbursment_maker()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsSourcingStaffDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsSourcingStaffDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Sourcing staff should be non editable but here it is editable hence failed");
	}

	@And("^verify reference type field should be non editable and read only mode in disbursment maker$")
	public void verify_reference_type_field_should_be_non_editable_and_read_only_mode_in_disbursment_maker()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsReferenceTypeDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsReferenceTypeDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Reference type should be non editable but here it is editable hence failed");
	}

	@And("^verify reference entity field should be non editable and read only mode in disbursment maker$")
	public void verify_reference_entity_field_should_be_non_editable_and_read_only_mode_in_disbursment_maker()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsReferenceEntityDropdown(), 20, 1);
		String validation = applicationDetailsDisbursmentMakerObj.applicationDetailsReferenceEntityDropdown()
				.getAttribute("ng-reflect-disabled");
		softAssert.assertEquals(validation, "true",
				" Reference entity should be non editable but here it is editable hence failed");
	}

	@And("^verify refereence code field should be non editable and read only mode in disbursment maker$")
	public void verify_refereence_code_field_should_be_non_editable_and_read_only_mode_in_disbursment_maker()
			throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursmentMakerObj.applicationDetailsReferenceCodeInputBox(), 20, 1);
		for (int i = 0; i <= 500; i++) {
			try {
				applicationDetailsDisbursmentMakerObj.applicationDetailsReferenceCodeInputBox().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					status = true;
					Assert.fail(e.getMessage());
				}

			}
		}
		softAssert.assertTrue(status, " refernce Code field might be non editable but here editable");
	}

	@Then("^verify add button is not available in personal details disbursment maker screen$")
	public void verify_add_button_is_not_available_in_personal_details_disbursment_maker_screen() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 10; i++) {
			try {
				kulsCommonWebElements.ulsNotificationAddButton().isDisplayed();
			} catch (Exception e) {
				if (i == 10) {
					status = true;
				}
			}

		}
		Assert.assertTrue(status);

	}

	@Then("^verify the fucnctionality of back button in disbursment maker screen$")
	public void verify_the_fucnctionality_of_back_button_in_disbursment_maker_screen() throws Throwable {
		
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.scrollIntoView(kulsCommonWebElements.ulsTransactionBackButton());
				javascriptHelper.JSEClick(kulsCommonWebElements.ulsTransactionBackButton());
				
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, kulsCommonWebElements.ulsInboxText(), 20, 1);
		Assert.assertTrue(kulsCommonWebElements.ulsInboxText().isDisplayed());
		softAssert.assertAll();

	}

}
