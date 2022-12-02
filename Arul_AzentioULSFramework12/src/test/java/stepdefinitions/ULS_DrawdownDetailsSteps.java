package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ULS_DrawdownDetailsObj;
import resources.BaseClass;

public class ULS_DrawdownDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ULS_DrawdownDetailsObj drawdownDetailsObj = new ULS_DrawdownDetailsObj(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	//ULS_DrawDownBreakupDetailsTestData drawdownDetailsTestdata = jsonConfig.getDrawDownDetailsTestdataByName("Maker");

	@And("^click on drawdown details tab$")
	public void click_on_drawdown_details_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, drawdownDetailsObj.ulsDrawDownDetialsSegmentButton(),
				10, 1);
		drawdownDetailsObj.ulsDrawDownDetialsSegmentButton().click();
	}

	@And("^click on list view first record on drawdown details$")
	public void click_on_list_view_first_record_on_drawdown_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, drawdownDetailsObj.ulsDrawdownDetailsFirstRecord(), 10,
				1);
		drawdownDetailsObj.ulsDrawdownDetailsFirstRecord().click();
	}

	@Then("^verify Facility details section should be available$")
	public void verify_facility_details_section_should_be_available() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetialsFacilityDetailsSection(), 10, 1);
		Assert.assertTrue(drawdownDetailsObj.drawdownDetialsFacilityDetailsSection().isDisplayed());
	}

	@Then("^verify All payment hyper link section is available or not$")
	public void verify_all_payment_hyper_link_section_is_available_or_not() throws Throwable {
		softAssert.fail("Screen not available");
	}

	@Then("^verify schedule details list section is available or not$")
	public void verify_schedule_details_list_section_is_available_or_not() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(drawdownDetailsObj.drawdownDetailsScheduleDetailsSection());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(drawdownDetailsObj.drawdownDetailsScheduleDetailsSection().isDisplayed());
	}

	@Then("^verify payment details list section is available or not$")
	public void verify_payment_details_list_section_is_available_or_not() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// drawdownDetailsObj.drawdownDetailsPaymentDetailsSection(), 10, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(drawdownDetailsObj.drawdownDetailsPaymentDetailsSection());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(drawdownDetailsObj.drawdownDetailsPaymentDetailsSection().isDisplayed());
	}

	@Then("^verify drawdown breakdown section is available or not$")
	public void verify_drawdown_breakdown_section_is_available_or_not() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(drawdownDetailsObj.drawdownDetailsDrawdownBreakupSection());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(drawdownDetailsObj.drawdownDetailsDrawdownBreakupSection().isDisplayed());
	}

	@Then("^verify product field should be non editable under facility details section$")
	public void verify_product_field_should_be_non_editable_under_facility_details_section() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(drawdownDetailsObj.drawDownDetailsFacilityDetailsProduct());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(
				drawdownDetailsObj.drawDownDetailsFacilityDetailsProduct().getAttribute("ng-reflect-readonly"), "true");
	}

	@Then("^verify sub product field should be non editable under facility details section$")
	public void verify_sub_product_field_should_be_non_editable_under_facility_details_section() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawDownDetailsFacilityDetailsSubProduct(), 10, 1);
		Assert.assertEquals(
				drawdownDetailsObj.drawDownDetailsFacilityDetailsSubProduct().getAttribute("ng-reflect-readonly"),
				"true");
	}

	@Then("^verify scheme field should be non editable under facility detials section$")
	public void verify_scheme_field_should_be_non_editable_under_facility_detials_section() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawDownDetailsFacilityDetailsScheme(), 10, 1);
		softAssert.assertEquals(
				drawdownDetailsObj.drawDownDetailsFacilityDetailsScheme().getAttribute("ng-reflect-readonly"), "true");
	}

	@Then("^verify Sanction amount field should be non editable under facility details section$")
	public void verify_sanction_amount_field_should_be_non_editable_under_facility_details_section() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsFacilityDetailsSanctionAmount(), 10, 1);
		Assert.assertEquals(
				drawdownDetailsObj.drawdownDetailsFacilityDetailsSanctionAmount().getAttribute("ng-reflect-readonly"),
				"true");
	}

	@Then("^verify saction date field should be non editable under facility details section$")
	public void verify_saction_date_field_should_be_non_editable_under_facility_details_section() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawDownDetailsFacilityDetailsSanctionDate(), 10, 1);
		Assert.assertEquals(
				drawdownDetailsObj.drawDownDetailsFacilityDetailsSanctionDate().getAttribute("ng-reflect-readonly"),
				"true");
	}

	@Then("^verify last disbursement date field should be non editable under facility details section$")
	public void verify_last_disbursement_date_field_should_be_non_editable_under_facility_details_section()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawDownDetailsFacilityDetailsLastDisbursementDate(), 10, 1);
		Assert.assertEquals(drawdownDetailsObj.drawDownDetailsFacilityDetailsLastDisbursementDate()
				.getAttribute("ng-reflect-readonly"), "true");
	}

	@Then("^verify is tranche allowed field should be non editable under facility details section$")
	public void verify_is_tranche_allowed_field_should_be_non_editable_under_facility_details_section()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsFacilityDetailsIsTrancheAllowed(), 10, 1);
		Assert.assertEquals(
				drawdownDetailsObj.drawdownDetailsFacilityDetailsIsTrancheAllowed().getAttribute("ng-reflect-readonly"),
				"true");
	}

	@Then("^verify limit amount field should be non editable under under facility details section$")
	public void verify_limit_amount_field_should_be_non_editable_under_under_facility_details_section()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsFacilityDetailsLimitAmount(), 10, 1);
		Assert.assertEquals(
				drawdownDetailsObj.drawdownDetailsFacilityDetailsLimitAmount().getAttribute("ng-reflect-readonly"),
				"true");
	}

	@Then("^verify disbursement amount field should be non editable under facility details section$")
	public void verify_disbursement_amount_field_should_be_non_editable_under_facility_details_section()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsFacilityDetailsDisbursedAmount(), 10, 1);
		Assert.assertEquals(
				drawdownDetailsObj.drawdownDetailsFacilityDetailsDisbursedAmount().getAttribute("ng-reflect-readonly"),
				"true");
	}

	@Then("^verify current disbursement field should be non editable under facility details section$")
	public void verify_current_disbursement_field_should_be_non_editable_under_facility_details_section()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsFacilityDetailsCurrentDisbursement(), 10, 1);
		Assert.assertEquals(drawdownDetailsObj.drawdownDetailsFacilityDetailsCurrentDisbursement()
				.getAttribute("ng-reflect-readonly"), "true");

	}

	@Then("^verify available amount field should be non editable under facility details section$")
	public void verify_available_amount_field_should_be_non_editable_under_facility_details_section() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsFacilityDetailsAvailableAmount(), 10, 1);
		Assert.assertEquals(
				drawdownDetailsObj.drawdownDetailsFacilityDetailsAvailableAmount().getAttribute("ng-reflect-readonly"),
				"true");
	}

	@Then("^verify Payment schedule ID field should be in non editable under schedule details$")
	public void verify_payment_schedule_id_field_should_be_in_non_editable_under_schedule_details() throws Throwable {
		softAssert.fail("Payment Schedule ID field is not available");
	}

	@Then("^verify Payment for field should be in non editable under schedule details$")
	public void verify_payment_for_field_should_be_in_non_editable_under_schedule_details() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsScheduleDetailsPaymentFor(), 10, 1);
		drawdownDetailsObj.drawdownDetailsScheduleDetailsPaymentFor().click();
		for (int i = 0; i <= 30; i++) {
			try {
				drawdownDetailsObj.drawdownDetailsScheduleDetailsPaymentFor().click();
				drawdownDetailsObj.drawdownDetailsScheduleDetailsPaymentFor().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {

				status = true;
				break;

			}
		}
		Assert.assertTrue(status);

	}

	@Then("^verify Planned schedule amount field should be in non editable under schedule details$")
	public void verify_planned_schedule_amount_field_should_be_in_non_editable_under_schedule_details()
			throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsScheduleDetailsScheduleAmount(), 10, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				drawdownDetailsObj.drawdownDetailsScheduleDetailsScheduleAmount().click();
				drawdownDetailsObj.drawdownDetailsScheduleDetailsScheduleAmount().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {

				status = true;
				break;

			}
		}
		Assert.assertTrue(status);
	}

	@Then("^verify Planned date field should be in non editable under schedule details$")
	public void verify_planned_date_field_should_be_in_non_editable_under_schedule_details() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsScheduleDetailsPlannedDate(), 10, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				drawdownDetailsObj.drawdownDetailsScheduleDetailsPlannedDate().click();
				drawdownDetailsObj.drawdownDetailsScheduleDetailsPlannedDate().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {

				status = true;
				break;

			}
		}
		Assert.assertTrue(status);
	}

	@Then("^verify Currency field should be in non editable under schedule details$")
	public void verify_currency_field_should_be_in_non_editable_under_schedule_details() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsScheduleDetailsCurrency(), 10, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				drawdownDetailsObj.drawdownDetailsScheduleDetailsCurrency().click();
				drawdownDetailsObj.drawdownDetailsScheduleDetailsCurrency().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {

				status = true;
				break;
			}
		}
		Assert.assertTrue(status);
	}

	@Then("^verify Schedule notes field should be in non editable under schedule details$")
	public void verify_schedule_notes_field_should_be_in_non_editable_under_schedule_details() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownDetailsScheduleDetailsScheduleNotes(), 10, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				drawdownDetailsObj.drawdownDetailsScheduleDetailsScheduleNotes().click();
				drawdownDetailsObj.drawdownDetailsScheduleDetailsScheduleNotes().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {

				status = true;
				break;
			}
		}
		Assert.assertTrue(status);
		softAssert.assertAll();
	}

	@And("^click on edit button in drwdownBreakup$")
	public void click_on_edit_button_in_drwdownbreakup() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(drawdownDetailsObj.drawdownDetailsDrawdownBreakupEditIcon());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}

		}
		drawdownDetailsObj.drawdownDetailsDrawdownBreakupEditIcon().click();

	}

	@And("^click on add button in drawdown break up list view$")
	public void click_on_add_button_in_drawdown_break_up_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpAddButton(), 10, 1);
		clicksAndActionsHelper.moveToElement(drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpAddButton());
		clicksAndActionsHelper.clickUsingActionClass(
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpAddButton(),
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpAddButton());
		// drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpAddButton().click();
	}

	@Then("^verify when user click on add button new record user can able to add$")
	public void verify_when_user_click_on_add_button_new_record_user_can_able_to_add() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpSaveButton(), 10, 1);
		Assert.assertTrue(drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpSaveButton().isDisplayed());

	}
	@And("^Click on Add icon in Payment details$")
    public void click_on_add_icon_in_payment_details() throws Throwable {
		javascriptHelper.scrollIntoView(drawdownDetailsObj.paymentDetails_AddIcon());
		//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
			//	drawdownDetailsObj.paymentDetails_AddIcon(), 10, 2);
		drawdownDetailsObj.paymentDetails_AddIcon().click();
    }

    @And("^Select the value in Payment type field$")
    public void select_the_value_in_payment_type_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.paymentDetails_PaymentTypeField(), 10, 2);
		drawdownDetailsObj.paymentDetails_PaymentTypeField().click();
		//testdata=exceldata.getTestdata("AT_BM_001_D1");
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + "test"
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the value in Payee field$")
    public void enter_the_value_in_payee_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.paymentDetails_PayeeField(), 10, 2);
		drawdownDetailsObj.paymentDetails_PayeeField().click();
		//testdata=exceldata.getTestdata("AT_BM_001_D1");
		drawdownDetailsObj.paymentDetails_PayeeField().sendKeys("test");
    }

    @And("^Enter the value in planned scheduled disbursement balance field$")
    public void enter_the_value_in_planned_scheduled_disbursement_balance_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.paymentDetails_PlannedScheduledDisbursementBalanceField(), 10, 2);
		drawdownDetailsObj.paymentDetails_PlannedScheduledDisbursementBalanceField().click();
		//testdata=exceldata.getTestdata("AT_BM_001_D1");
		drawdownDetailsObj.paymentDetails_PlannedScheduledDisbursementBalanceField().sendKeys("2000");
    }

    @And("^Enter the value in schedule amount field$")
    public void enter_the_value_in_schedule_amount_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.paymentDetails_ScheduleAmountField(), 10, 2);
		drawdownDetailsObj.paymentDetails_ScheduleAmountField().click();
		//testdata=exceldata.getTestdata("AT_BM_001_D1");
		drawdownDetailsObj.paymentDetails_ScheduleAmountField().sendKeys("5000");
    }
    @And("^Click on Save button in Payment details$")
    public void click_on_save_button_in_payment_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
    			drawdownDetailsObj.PaymentDetails_SaveButton(), 10, 2);
    	drawdownDetailsObj.PaymentDetails_SaveButton().click();
    }
    @And("^Sarch the value in Mail box for drawdown$")
    public void sarch_the_value_in_mail_box_for_drawdown() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,drawdownDetailsObj.ApplicationDetailsInboxView_SearchText(),60,2);
    	drawdownDetailsObj.ApplicationDetailsInboxView_SearchText().click();
    	drawdownDetailsObj.ApplicationDetailsInboxView_SearchText().sendKeys("DISBMKR");
    }

    @And("^Click on action icon of first record in drawdown$")
    public void click_on_action_icon_of_first_record_in_drawdown() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,drawdownDetailsObj.ApplicationDetailsMailBoxActionButtonOfFirstRecord_DISBMKR(), 30, 2);
    	drawdownDetailsObj.ApplicationDetailsMailBoxActionButtonOfFirstRecord_DISBMKR().click();
    }

    @And("^Navigate to Drawdown tab$")
    public void navigate_to_drawdown_tab() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,drawdownDetailsObj.drawdownIcon(), 30, 2);
    	drawdownDetailsObj.drawdownIcon().click();
    }

}
