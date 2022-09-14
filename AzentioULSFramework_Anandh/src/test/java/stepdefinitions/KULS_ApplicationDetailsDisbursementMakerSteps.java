package stepdefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.Status;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationDetailsDisbursementMakerObj;
import pageobjects.KULS_CommonWebElements;
import resources.BaseClass;
import utilities.ExtentTestManager;

public class KULS_ApplicationDetailsDisbursementMakerSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	Status reportStatus;
	ApplicationDetailsDisbursementMakerObj applicationDetailsDisbursementMakerObj = new ApplicationDetailsDisbursementMakerObj(
			driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	KULS_CommonWebElements kulsCommonWebObj = new KULS_CommonWebElements(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	Logger Log = LogManager.getLogger(KULS_ApplicationDetailsDisbursementMakerSteps.class.getName());

	@And("^search the record for disbursement maker record$")
	public void search_the_record_for_disbursement_maker_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, kulsCommonWebObj.ulsNotificationSerachButton(), 30, 1);
		kulsCommonWebObj.ulsNotificationSerachButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, kulsCommonWebObj.ulsNotificationSearchTextBox(), 30,
				1);
		clicksAndActionsHelper.moveToElement(kulsCommonWebObj.ulsNotificationSearchTextBox());
		clicksAndActionsHelper.clickUsingActionClass(kulsCommonWebObj.ulsNotificationSearchTextBox(),
				kulsCommonWebObj.ulsNotificationSearchTextBox());
		kulsCommonWebObj.ulsNotificationSearchTextBox().sendKeys("DISBMKR");
		Thread.sleep(500);
	}

	@And("^select the disbursement maker record in the mail record$")
	public void select_the_disbursement_maker_record_in_the_mail_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, kulsCommonWebObj.ulsMailBoxFirstRecord(), 30, 1);
		kulsCommonWebObj.ulsMailBoxFirstRecord().click();
	}

	@And("^go to application details$")
	public void go_to_application_details() throws Throwable {

	}

	@Then("^verify add button is not available and user can not able to create the record$")
	public void verify_add_button_is_not_available_and_user_can_not_able_to_create_the_record() throws Throwable {
		boolean result = true;
		try {
			waitHelper.waitForElementToVisibleWithFluentWait(driver,
					applicationDetailsDisbursementMakerObj.ApplicationDetailsAddIcon(), 3, 1);
			applicationDetailsDisbursementMakerObj.ApplicationDetailsAddIcon().click();
		} catch (Exception e) {
			result = false;
		}
		Assert.assertFalse(result);
		System.out.println("Add button status is" + result + " hence user can not able to add the new record");
	}

	@Then("^verify the functionlaity of the back button$")
	public void verify_the_functionlaity_of_the_back_button() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(applicationDetailsDisbursementMakerObj.applicationDetailsBackButton());
				applicationDetailsDisbursementMakerObj.applicationDetailsBackButton().click();
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail();
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.applicationDetailsInboxText(), 30, 1);
		softAssert.assertTrue(applicationDetailsDisbursementMakerObj.applicationDetailsInboxText().isDisplayed(),
				"Back button is not working");
		softAssert.assertAll();
	}

	@Then("^verify user can not able to modify the primary product field$")
	public void verify_user_can_not_able_to_modify_the_primary_product_field() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_PrimaryProductField(), 10, 1);

		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_PrimaryProductField()
				.getAttribute("ng-reflect-disabled").equals("true");
		System.out.println("Status is " + status);
		try
		{
			Assert.assertTrue(status);
		}
		catch(AssertionError e)
		{
			System.out.println("Warning area");
			Log.warn("Primary product field should be non eitable one but here it is editable hence warning occured");
			softAssert.assertTrue(status,
				"Primary product field should be non eitable one but here it is editable hence failed");
			ExtentTestManager.getTest().log(Status.WARNING, "Warning");

		}
		
		}

	@Then("^verify user can not able to modify the primary sub product field$")
	public void verify_user_can_not_able_to_modify_the_primary_sub_product_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_PrimarySubProductField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_PrimarySubProductField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				"Primary Sub product field should be non editable but here its a editable one hence test step is failed");
		System.out.println("Hello");
		//softAssert.assertAll();
	}

	@Then("^verify user can not able to modify the total finance amount requested$")
	public void verify_user_can_not_able_to_modify_the_total_finance_amount_requested() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_TotalFinanceAmountRequestedField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}

		softAssert.assertFalse(status, "Total Finance field should be non editable but here it is editable one");
		
	}

	@Then("^verify user can not able to modify declared net income field$")
	public void verify_user_can_not_able_to_modify_declared_net_income_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_DeclaredNetIncomeField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		softAssert.assertTrue(status,
				" modify declared net income field should be non editable but here it is edtable one hence test steps failed");

	}

	@Then("^verify user can not able to modify the Declared Current Obligations field$")
	public void verify_user_can_not_able_to_modify_the_declared_current_obligations_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_DeclaredCurrentObligationsField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		softAssert.assertFalse(status,
				" Declared Current obligation field should be non editable but here its editable one hence test case failed");

	}

	@Then("^verify user can not able to modify the Special PromotionCampaign field$")
	public void verify_user_can_not_able_to_modify_the_special_promotioncampaign_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_SpecialPromotionField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_SpecialPromotionField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" Special PromotionCampaign field should be non editable but here its a editable one hence test steps got failed");
	}

	@Then("^verify user can not able to modify the sourcing channel field$")
	public void verify_user_can_not_able_to_modify_the_sourcing_channel_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingChannelField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingChannelField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" sourcing channel field should be non editable but here its a editable one hence test steps got failed");
	}

	@Then("^verify user can not able to modify the business center code field$")
	public void verify_user_can_not_able_to_modify_the_business_center_code_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_BusinessCenterCodeField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_BusinessCenterCodeField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" business center code field should be non editable but here its a editable one hence test steps got failed");
	}

	@Then("^verify user can not able to modify the servicing type field$")
	public void verify_user_can_not_able_to_modify_the_servicing_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_ServicingTypeField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_ServicingTypeField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" servicing type field should be non editable but here its a editable one hence test steps got failed");

	}

	@Then("^verify user can not able to modify the Servicing Entity field$")
	public void verify_user_can_not_able_to_modify_the_servicing_entity_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_ServicingEntityField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_ServicingEntityField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" Servicing Entity field should be non editable but here its a editable one hence test steps got failed");

	}

	@Then("^verify user can not able to modify the Servicing Branch field$")
	public void verify_user_can_not_able_to_modify_the_servicing_branch_field() throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver,
//				applicationDetailsDisbursementMakerObj.AppDataEntry_ServicingBranchField(), 10, 1);
		boolean status = false;
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.scrollIntoView(applicationDetailsDisbursementMakerObj.AppDataEntry_ServicingBranchField());
				status = applicationDetailsDisbursementMakerObj.AppDataEntry_ServicingBranchField()
						.getAttribute("ng-reflect-disabled").equals("true");
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail();
					;
				}
			}
		}
		softAssert.assertTrue(status,
				" Servicing Branch field should be non editable but here its a editable one hence test steps got failed");
	}

	@Then("^verify user can not able to modify the Closing Staff or Servicing Staff or RM field$")
	public void verify_user_can_not_able_to_modify_the_closing_staff_or_servicing_staff_or_rm_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_ClosingStaffField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_ClosingStaffField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" Closing Staff or Servicing Staff or RM field should be non editable but here its a editable one hence test steps got failed");
	}

	@Then("^verify user can not able to modify the Sourcing Type field$")
	public void verify_user_can_not_able_to_modify_the_sourcing_type_field() throws Throwable {

		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper
						.scrollIntoView(applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingTypeField());
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingTypeField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" Sourcing Type field should be non editable but here its a editable one hence test steps got failed");

	}

	@Then("^verify user can not able to modify the Sourcing staff field$")
	public void verify_user_can_not_able_to_modify_the_sourcing_staff_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingStaffField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingStaffField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" Sourcing staff field should be non editable but here its a editable one hence test steps got failed");

	}

	@Then("^verify user can not able to modify the Sourcing Entity field$")
	public void verify_user_can_not_able_to_modify_the_sourcing_entity_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingEntityField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingEntityField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" Sourcing Entity field should be non editable but here its a editable one hence test steps got failed");

	}

	@Then("^verify user can not able to modify the Sourcing Office field$")
	public void verify_user_can_not_able_to_modify_the_sourcing_office_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingOfficeField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingOfficeField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" Sourcing Office field should be non editable but here its a editable one hence test steps got failed");

	}

	@Then("^verify user can not able to modify the  Reference Type field$")
	public void verify_user_can_not_able_to_modify_the_reference_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_ReferenceTypeField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_ReferenceTypeField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" Reference Type field should be non editable but here its a editable one hence test steps got failed");

	}

	@Then("^verify user can not able to modify the Reference Entity field$")
	public void verify_user_can_not_able_to_modify_the_reference_entity_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.AppDataEntry_ReferenceEntityField(), 10, 1);
		boolean status = applicationDetailsDisbursementMakerObj.AppDataEntry_ReferenceEntityField()
				.getAttribute("ng-reflect-disabled").equals("true");
		softAssert.assertTrue(status,
				" Reference Entity field should be non editable but here its a editable one hence test steps got failed");
	}

	@Then("^verify user can not able to modify the Reference Code field$")
	public void verify_user_can_not_able_to_modify_the_reference_code_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_ReferenceCodeField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		softAssert.assertFalse(status,
				" Reference Code field should be non editable but here its a editable one hence test steps got failed");

	}

}
