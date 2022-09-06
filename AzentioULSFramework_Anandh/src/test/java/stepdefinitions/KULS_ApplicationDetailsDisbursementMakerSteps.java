package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationDetailsDisbursementMakerObj;
import pageobjects.KULS_CommonWebElements;
import resources.BaseClass;

public class KULS_ApplicationDetailsDisbursementMakerSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ApplicationDetailsDisbursementMakerObj applicationDetailsDisbursementMakerObj = new ApplicationDetailsDisbursementMakerObj(
			driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	KULS_CommonWebElements kulsCommonWebObj = new KULS_CommonWebElements(driver);

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
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.applicationDetailsBackButton(), 30, 1);
		applicationDetailsDisbursementMakerObj.applicationDetailsBackButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				applicationDetailsDisbursementMakerObj.applicationDetailsInboxText(), 30, 1);
		Assert.assertTrue(applicationDetailsDisbursementMakerObj.applicationDetailsInboxText().isDisplayed());
	}

	@Then("^verify user can not able to modify the primary product field$")
	public void verify_user_can_not_able_to_modify_the_primary_product_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_PrimaryProductField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the primary sub product field$")
	public void verify_user_can_not_able_to_modify_the_primary_sub_product_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_PrimarySubProductField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
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
		Assert.assertFalse(status);
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
		Assert.assertFalse(status);
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
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the Special PromotionCampaign field$")
	public void verify_user_can_not_able_to_modify_the_special_promotioncampaign_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_SpecialPromotionField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the sourcing channel field$")
	public void verify_user_can_not_able_to_modify_the_sourcing_channel_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingChannelField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the business center code field$")
	public void verify_user_can_not_able_to_modify_the_business_center_code_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_BusinessCenterCodeField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the servicing type field$")
	public void verify_user_can_not_able_to_modify_the_servicing_type_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_ServicingTypeField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the Servicing Entity field$")
	public void verify_user_can_not_able_to_modify_the_servicing_entity_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_ServicingEntityField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the Servicing Branch field$")
	public void verify_user_can_not_able_to_modify_the_servicing_branch_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_ServicingBranchField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the Closing Staff or Servicing Staff or RM field$")
	public void verify_user_can_not_able_to_modify_the_closing_staff_or_servicing_staff_or_rm_field() throws Throwable {

		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_ClosingStaffField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the Sourcing Type field$")
	public void verify_user_can_not_able_to_modify_the_sourcing_type_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingTypeField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the Sourcing staff field$")
	public void verify_user_can_not_able_to_modify_the_sourcing_staff_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingStaffField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the Sourcing Entity field$")
	public void verify_user_can_not_able_to_modify_the_sourcing_entity_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingEntityField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the Sourcing Office field$")
	public void verify_user_can_not_able_to_modify_the_sourcing_office_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_SourcingOfficeField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the  Reference Type field$")
	public void verify_user_can_not_able_to_modify_the_reference_type_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_ReferenceTypeField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
	}

	@Then("^verify user can not able to modify the Reference Entity field$")
	public void verify_user_can_not_able_to_modify_the_reference_entity_field() throws Throwable {
		boolean status = true;
		for (int i = 0; i <= 50; i++) {
			try {
				applicationDetailsDisbursementMakerObj.AppDataEntry_ReferenceEntityField().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					status = false;
				}

			}
		}
		Assert.assertFalse(status);
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
		Assert.assertFalse(status);
	}

}
