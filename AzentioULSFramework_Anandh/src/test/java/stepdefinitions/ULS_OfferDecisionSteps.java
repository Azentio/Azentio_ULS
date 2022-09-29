package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pageobjects.KULS_CommonWebElements;
import pageobjects.ULS_OfferDecisionObj;
import resources.BaseClass;
import testDataType.KULS_Login_TestDataType;
import testDataType.ULS_OfferDecisionTestData;

public class ULS_OfferDecisionSteps extends BaseClass {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ULS_OfferDecisionObj ulsOfferDecisionObj = new ULS_OfferDecisionObj(driver);
	KULS_CommonWebElements ulsCommonElements = new KULS_CommonWebElements(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login kulsApplicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginTestData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	ULS_OfferDecisionTestData offerDecisionTestdata = jsonConfig.getOfferDecisionTestDataByName("Maker");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> testData = new HashMap<>();

	@Given("^navigate to uls application url and login with valid user ID$")
	public void navigate_to_uls_application_url_and_login_with_valid_user_id() throws Throwable {
		driver.get(configFileReader.getULSApplicationCenBankUrl());
		kulsApplicationLogin.loginUlsApplicationAsMaker(kulsLoginTestData.UserName2, kulsLoginTestData.Password2);

	}

	@And("^click on mail box to select the l1App stage Record$")
	public void click_on_mail_box_to_select_the_l1app_stage_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonElements.ulsMailBox(), 10, 1);
		ulsCommonElements.ulsMailBox().click();
		ulsCommonElements.ulsNotificationSerachButton().click();
		clicksAndActionsHelper.moveToElement(ulsCommonElements.ulsNotificationSearchTextBox());
		clicksAndActionsHelper.clickUsingActionClass(ulsCommonElements.ulsNotificationSearchTextBox(),
				ulsCommonElements.ulsNotificationSearchTextBox());
		ulsCommonElements.ulsNotificationSearchTextBox().sendKeys(offerDecisionTestdata.StageCode);
	}

	@And("^select the perticular record from mail box for offer decision screen$")
	public void select_the_perticular_record_from_mail_box_for_offer_decision_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.ulsOfferDecisionMailBoxFirstRecord(), 10, 1);
		ulsOfferDecisionObj.ulsOfferDecisionMailBoxFirstRecord().click();
	}

	@And("^select the offer decision tab$")
	public void select_the_offer_decision_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsOfferDecisionObj.ulsOfferDecisionTab(), 10, 1);
		clicksAndActionsHelper.moveToElement(ulsOfferDecisionObj.ulsOfferDecisionTab());
		clicksAndActionsHelper.clickUsingActionClass(ulsOfferDecisionObj.ulsOfferDecisionTab(),
				ulsOfferDecisionObj.ulsOfferDecisionTab());
	}

	@And("^click on edit button under offer decision list view record$")
	public void click_on_edit_button_under_offer_decision_list_view_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecisionFacilityInfoListviewFirstRecord(), 10, 1);
		ulsOfferDecisionObj.offerDecisionFacilityInfoListviewFirstRecord().click();
	}

	@Then("^verify product field under facility details should be non editable$")
	public void verify_product_field_under_facility_details_should_be_non_editable() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFacilityDetailsProductField(), 10, 1);

		Assert.assertEquals(
				ulsOfferDecisionObj.offerDecesionFacilityDetailsProductField().getAttribute("ng-reflect-readonly"),
				offerDecisionTestdata.ReadOnlyVerification);

	}

	@Then("^verify sub product field under facility details should be non editable$")
	public void verify_sub_product_field_under_facility_details_should_be_non_editable() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFacilityDetailsSubProductField(), 10, 1);

		Assert.assertEquals(
				ulsOfferDecisionObj.offerDecesionFacilityDetailsSubProductField().getAttribute("ng-reflect-readonly"),
				offerDecisionTestdata.ReadOnlyVerification);
	}

	@Then("^verify scheme field under facility details should be non editable$")
	public void verify_scheme_field_under_facility_details_should_be_non_editable() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFacilityDetailsSchemeField(), 10, 1);

		Assert.assertEquals(
				ulsOfferDecisionObj.offerDecesionFacilityDetailsSchemeField().getAttribute("ng-reflect-readonly"),
				offerDecisionTestdata.ReadOnlyVerification);
	}

	@Then("^verify pricing indicator field under facility details should be non editable$")
	public void verify_pricing_indicator_field_under_facility_details_should_be_non_editable() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFacilityDetailsPricingIndicatorField(), 10, 1);

		Assert.assertEquals(ulsOfferDecisionObj.offerDecesionFacilityDetailsPricingIndicatorField()
				.getAttribute("ng-reflect-readonly"), offerDecisionTestdata.ReadOnlyVerification);
	}

	@Then("^verify repayment type field under facility details should be non editable$")
	public void verify_repayment_type_field_under_facility_details_should_be_non_editable() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFacilityDetailsRepaymentTypeField(), 10, 1);

		Assert.assertEquals(ulsOfferDecisionObj.offerDecesionFacilityDetailsRepaymentTypeField()
				.getAttribute("ng-reflect-readonly"), offerDecisionTestdata.ReadOnlyVerification);
	}

	@Then("^verify compute instalment on field under facility details should be non editable$")
	public void verify_compute_instalment_on_field_under_facility_details_should_be_non_editable() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFacilityDetailsComputeInstalmentOnField(), 10, 1);

		Assert.assertEquals(ulsOfferDecisionObj.offerDecesionFacilityDetailsComputeInstalmentOnField()
				.getAttribute("ng-reflect-readonly"), offerDecisionTestdata.ReadOnlyVerification);
	}

	@Then("^verify Principal frequency field under facility details should be non editable$")
	public void verify_principal_frequency_field_under_facility_details_should_be_non_editable() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFacilityDetailsPrincipalFrequencyField(), 10, 1);

		Assert.assertEquals(ulsOfferDecisionObj.offerDecesionFacilityDetailsPrincipalFrequencyField()
				.getAttribute("ng-reflect-readonly"), offerDecisionTestdata.ReadOnlyVerification);
	}

	@Then("^verify interst frequency field under facility details should be non editable$")
	public void verify_interst_frequency_field_under_facility_details_should_be_non_editable() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFacilityDetailsInterstFrequencyField(), 10, 1);

		Assert.assertEquals(ulsOfferDecisionObj.offerDecesionFacilityDetailsInterstFrequencyField()
				.getAttribute("ng-reflect-readonly"), offerDecisionTestdata.ReadOnlyVerification);
	}

	@Then("^verify Eligibilty type field should be non editable under eligibility details$")
	public void verify_eligibilty_type_field_should_be_non_editable_under_eligibility_details() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityType());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityType().click();
		try {
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityType().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@Then("^verify Eligibilty amount field should be non editable under eligibility details$")
	public void verify_eligibilty_amount_field_should_be_non_editable_under_eligibility_details() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityAmount());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityAmount().click();
		try {
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityAmount().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@Then("^verify Eligibilty field should be non editable under eligibility details$")
	public void verify_eligibilty_field_should_be_non_editable_under_eligibility_details() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityAmount());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityAmount().click();
		try {
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityAmount().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@Then("^verify Eligibilty percentage field should be non editable under eligibility details$")
	public void verify_eligibilty_percentage_field_should_be_non_editable_under_eligibility_details() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper
						.scrollIntoView(ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityPercentage());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityPercentage().click();
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsEligibilityPercentage().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@Then("^verify currency field should be non editable under eligibility details$")
	public void verify_currency_field_should_be_non_editable_under_eligibility_details() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsOfferDecisionObj.offerDecesionEligibilityDetailsCurrency());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsCurrency().sendKeys(Keys.ENTER);
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsCurrency().click();
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@Then("^verify Actual Percentage field should be non editable under eligibility details$")
	public void verify_actual_percentage_field_should_be_non_editable_under_eligibility_details() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsOfferDecisionObj.offerDecesionEligibilityDetailsActualPercentage());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsActualPercentage().click();
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsActualPercentage().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@Then("^verify Deviation level field should be non editable under eligibility details$")
	public void verify_deviation_level_field_should_be_non_editable_under_eligibility_details() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsOfferDecisionObj.offerDecesionEligibilityDetailsDeviationLevel());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}

		try {
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsDeviationLevel().click();
			ulsOfferDecisionObj.offerDecesionEligibilityDetailsDeviationLevel().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@Then("^verify requested amount field should be non editable under finace configuration$")
	public void verify_requested_amount_field_should_be_non_editable_under_finace_configuration() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsOfferDecisionObj.offerDecesionFinanceConfigurationRequestedAmount());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFinanceConfigurationRequestedAmount(), 10, 1);
		Assert.assertEquals(ulsOfferDecisionObj.offerDecesionFinanceConfigurationRequestedAmount()
				.getAttribute("ng-reflect-readonly"), offerDecisionTestdata.ReadOnlyVerification);
	}

	@Then("^verify requested tenure field should be non editable under finace configuration$")
	public void verify_requested_tenure_field_should_be_non_editable_under_finace_configuration() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFinanceConfigurationRequestedTenure(), 10, 1);
		Assert.assertEquals(ulsOfferDecisionObj.offerDecesionFinanceConfigurationRequestedTenure()
				.getAttribute("ng-reflect-readonly"), offerDecisionTestdata.ReadOnlyVerification);
	}

	@Then("^verify Offered amount field should be non editable under finace configuration$")
	public void verify_offered_amount_field_should_be_non_editable_under_finace_configuration() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFinanceConfigurationOfferedAmount(), 10, 1);
		Assert.assertEquals(ulsOfferDecisionObj.offerDecesionFinanceConfigurationOfferedAmount()
				.getAttribute("ng-reflect-readonly"), offerDecisionTestdata.ReadOnlyVerification);
	}

	@Then("^verify Offered tenure field should be non editable under finace configuration$")
	public void verify_offered_tenure_field_should_be_non_editable_under_finace_configuration() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecesionFinanceConfigurationOfferedTenure(), 10, 1);
		Assert.assertEquals(ulsOfferDecisionObj.offerDecesionFinanceConfigurationOfferedTenure()
				.getAttribute("ng-reflect-readonly"), offerDecisionTestdata.ReadOnlyVerification);
		testData.put("OfferedTenure",
				ulsOfferDecisionObj.offerDecesionFinanceConfigurationOfferedTenure().getAttribute("ng-reflect-model"));
	}

	@Then("^verify deviation amount field should be editable under finace configuration$")
	public void verify_deviation_amount_field_should_be_editable_under_finace_configuration() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationAmount(), 10, 1);
		Assert.assertEquals(ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationAmount().getAttribute("type"),
				offerDecisionTestdata.NumberFieldvalidationAttribute);
		ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationAmount().click();
		ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationAmount()
				.sendKeys(offerDecisionTestdata.DeviationAmount);
	}

	@Then("^verify deviation tenure field should be editable under finace configuration$")
	public void verify_deviation_tenure_field_should_be_editable_under_finace_configuration() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationTenure(), 10, 1);
		Assert.assertEquals(ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationTenure().getAttribute("type"),
				offerDecisionTestdata.NumberFieldvalidationAttribute);
		ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationTenure().click();
		ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationTenure()
				.sendKeys(offerDecisionTestdata.DeviationTenure);
	}

	@And("^clear the input from the deviation field text boxes$")
	public void clear_the_input_from_the_deviation_field_text_boxes() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecisionDeviationAmountDataHolder(), 10, 1);
		int deviationAmountLength = ulsOfferDecisionObj.offerDecisionDeviationAmountDataHolder()
				.getAttribute("ng-reflect-model").toString().length();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecisionDeviationTenureDataHolder(), 10, 1);
		int deviationTenureLength = ulsOfferDecisionObj.offerDecisionDeviationTenureDataHolder()
				.getAttribute("ng-reflect-model").toString().length();
		for (int i = 0; i <= deviationAmountLength; i++) {
			ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationAmount().sendKeys(Keys.BACK_SPACE);
		}
		for (int i = 0; i <= deviationTenureLength; i++) {
			ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationTenure().sendKeys(Keys.BACK_SPACE);
		}

	}

	@And("^click on save button to save the offer decision record$")
	public void click_on_save_button_to_save_the_offer_decision_record() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsOfferDecisionObj.offerDecisionFinanceConfigurationSaveButton());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		ulsOfferDecisionObj.offerDecisionFinanceConfigurationSaveButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonElements.ulsToastAlert(), 10, 1);
		Assert.assertEquals(ulsCommonElements.ulsToastAlert().getText(), offerDecisionTestdata.SaveVerificationMessage);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonElements.ulsToastAlertClose(), 10, 1);

		ulsCommonElements.ulsToastAlertClose().click();
	}

	@And("^select the record from the notification area$")
	public void select_the_record_from_the_notification_area() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonElements.ulsMailBoxFirstRecord(), 10, 1);
		ulsCommonElements.ulsMailBoxFirstRecord().click();
	}

	@Then("^verify offered tenure should be matched with before saving$")
	public void verify_offered_tenure_should_be_matched_with_before_saving() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsOfferDecisionObj.offerDecesionFinanceConfigurationOfferedTenure());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertEquals(
				ulsOfferDecisionObj.offerDecesionFinanceConfigurationOfferedTenure().getAttribute("ng-reflect-model"),
				testData.get("OfferedTenure"));

	}

	@And("^go to the offer decision screen$")
	public void go_to_the_offer_decision_screen() throws Throwable {

		for (int i = 0; i <= 30; i++) {

			try {
				javascriptHelper.JSEClick(ulsOfferDecisionObj.offerDecisionFacilityInfoListviewFirstRecord());
				// ulsOfferDecisionObj.offerDecisionFacilityInfoListviewFirstRecord().click();
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify offer amount should be matched with screen$")
	public void verify_offer_amount_should_be_matched_with_screen() throws Throwable {

	}

	@And("^enter the deviatuion amount$")
	public void enter_the_deviatuion_amount() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationAmount(), 10, 1);
		Assert.assertEquals(ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationAmount().getAttribute("type"),
				offerDecisionTestdata.NumberFieldvalidationAttribute);
		ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationAmount().click();
		ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationAmount()
				.sendKeys(offerDecisionTestdata.DeviationAmount);

	}

	@And("^enter the deviation tenure$")
	public void enter_the_deviation_tenure() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationTenure(), 10, 1);
		Assert.assertEquals(ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationTenure().getAttribute("type"),
				offerDecisionTestdata.NumberFieldvalidationAttribute);
		ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationTenure().click();
		ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviationTenure()
				.sendKeys(offerDecisionTestdata.DeviationTenure);
	}

	@Then("^click on deviate button to verify deviation amount and tenure should get deviated$")
	public void click_on_deviate_button_to_verify_deviation_amount_and_tenure_should_get_deviated() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviateButton());
				ulsOfferDecisionObj.offerDecisionFinanceConfigurationDeviateButton().click();
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Thread.sleep(2000);
	}
	

}
