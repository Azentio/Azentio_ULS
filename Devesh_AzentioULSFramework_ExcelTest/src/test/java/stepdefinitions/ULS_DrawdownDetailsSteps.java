package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ULS_DrawdownDetailsObj;
import resources.BaseClass;

public class ULS_DrawdownDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ULS_DrawdownDetailsObj drawdownDetailsObj = new ULS_DrawdownDetailsObj(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
//	ULS_DrawDownBreakupDetailsTestData drawdownDetailsTestdata = jsonConfig.getDrawDownDetailsTestdataByName("Maker");
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","DrawdownDetailsTestData","Data Set ID");
	Map<String, String> testData;
	String dataSetID;
	
	@And("^click on drawdown details tab$")
	public void click_on_drawdown_details_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, drawdownDetailsObj.ulsDrawDownDetialsSegmentButton(),
				10, 1);
		drawdownDetailsObj.ulsDrawDownDetialsSegmentButton().click();
	}
	
	@And("^User search the record from the system for DrawDown records$")
    public void user_search_the_record_from_the_system_for_drawdown_records() throws Throwable {
       
		waitHelper.waitForElementToVisibleWithFluentWait(driver, drawdownDetailsObj.uls_DrawdownDetails_SearchIcon(), 60, 5);
		drawdownDetailsObj.uls_DrawdownDetails_SearchIcon().click();
    	
		waitHelper.waitForElementToVisibleWithFluentWait(driver, drawdownDetailsObj.uls_DrawdownDetails_SearchInputField(), 60, 5);
    	drawdownDetailsObj.uls_DrawdownDetails_SearchInputField().sendKeys(testData.get("Application id"));
		
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

	@Then("^check when user add any drawdownbreak up list view new row might be added$")
	public void check_when_user_add_any_drawdownbreak_up_list_view_new_row_might_be_added() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownBreaupDetailsPaymentTypeDropdown(), 10, 1);
		drawdownDetailsObj.drawdownBreaupDetailsPaymentTypeDropdown().click();
		String xpath = "//ion-label[text()=' " + testData.get("Payment Type") + " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownBreakUpDetailsEndBeneficiaryNameDropDown(), 10, 1);
		drawdownDetailsObj.drawdownBreakUpDetailsEndBeneficiaryNameDropDown().click();
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.scrollIntoView(drawdownDetailsObj.drawDownDetailsDropDownFirstOption());
				clicksAndActionsHelper.moveToElement(drawdownDetailsObj.drawDownDetailsDropDownFirstOption());
				clicksAndActionsHelper.clickOnElement(drawdownDetailsObj.drawDownDetailsDropDownFirstOption());
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownBreakUpDetailsOriginalAmountTextBox(), 10, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				drawdownDetailsObj.drawdownBreakUpDetailsOriginalAmountTextBox().click();
				drawdownDetailsObj.drawdownBreakUpDetailsOriginalAmountTextBox()
						.sendKeys(testData.get("Original Amount"));
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownBreakUpDetailsAmountToBePaidTextBox(), 10, 1);
		drawdownDetailsObj.drawdownBreakUpDetailsAmountToBePaidTextBox().click();
		drawdownDetailsObj.drawdownBreakUpDetailsAmountToBePaidTextBox()
				.sendKeys(testData.get("Amount to be paid"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownBreakUpDetailsPayingCurrencyDropDown(), 10, 1);
		drawdownDetailsObj.drawdownBreakUpDetailsPayingCurrencyDropDown().click();
		String payingCurrency = "//ion-label[text()=' " + testData.get("Paying Currency")
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(payingCurrency)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(payingCurrency)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(payingCurrency)));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawdownBreakUpDetailsPaymentModeDropDown(), 10, 1);
		drawdownDetailsObj.drawdownBreakUpDetailsPaymentModeDropDown().click();
		String paymentMode = "//ion-label[text()=' " + testData.get("Payment Mode")
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(paymentMode)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(paymentMode)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(paymentMode)));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, drawdownDetailsObj.drawdownDetailsDisbursedAccountNo(),
				10, 1);
		drawdownDetailsObj.drawdownDetailsDisbursedAccountNo().click();
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.scrollIntoView(drawdownDetailsObj.drawDownDetailsDropDownFirstOption());
				clicksAndActionsHelper.moveToElement(drawdownDetailsObj.drawDownDetailsDropDownFirstOption());
				clicksAndActionsHelper.clickOnElement(drawdownDetailsObj.drawDownDetailsDropDownFirstOption());
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpSaveButton(), 10, 1);
		drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpSaveButton().click();
		boolean status = false;
		for (int i = 0; i <= 50; i++) {
			try {
				status = driver.findElement(By.xpath(
						"//ion-title[text()=' DrawDown Breakup List ']//ancestor::div[2]//parent::div//following-sibling::div//table//td[text()=' "
								+ testData.get("Amount to be paid") + " ']"))
						.isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status);
	}

	@Then("^verify when user click on minus button that row will be deleted$")
	public void verify_when_user_click_on_minus_button_that_row_will_be_deleted() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(
						"//ion-title[text()=' DrawDown Breakup List ']//ancestor::div[2]//parent::div//following-sibling::div//table//td[text()=' "
								+ testData.get("Amount to be paid")
								+ " ']//following-sibling::td[5]//ion-button")));
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		driver.findElement(By.xpath(
				"//ion-title[text()=' DrawDown Breakup List ']//ancestor::div[2]//parent::div//following-sibling::div//table//td[text()=' "
						+ testData.get("Amount to be paid") + " ']//following-sibling::td[5]//ion-button"))
				.click();

		for (int i = 0; i <= 30; i++) {
			try {
				Assert.assertFalse(driver
						.findElement(By.xpath("//tr//td[text()=' " + testData.get("Amount to be paid") + " ']"))
						.isDisplayed());
				break;
			} catch (AssertionError e) {
				softAssert.fail("Deleted Element is  available after deletion");
				break;
			}
		}

	}

	@Then("^verify the functionality of add button$")
	public void verify_the_functionality_of_add_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpAddButton(), 10, 1);
		clicksAndActionsHelper.moveToElement(drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpAddButton());
		clicksAndActionsHelper.clickUsingActionClass(
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpAddButton(),
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpAddButton());
	}

	@Then("^verify the functionality of back button$")
	public void verify_the_functionality_of_back_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpBackButton(), 10, 1);
		clicksAndActionsHelper.moveToElement(drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpBackButton());
		clicksAndActionsHelper.clickUsingActionClass(
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpBackButton(),
				drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpBackButton());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpBackButtonVerification(), 10, 1);
		Assert.assertTrue(drawdownDetailsObj.drawDownDetailsDrawdownDetailsBreakUpBackButtonVerification().isDisplayed());
		softAssert.assertAll();
	}
	@Then("^select data set ID for Drawdown and Drawdown Details testcase007$")
    public void select_data_set_id_for_drawdown_and_drawdown_details_testcase007() throws Throwable {
		dataSetID = "AT_DWD_007_D1";
        testData = excelData.getTestdata(dataSetID);
    }
}
