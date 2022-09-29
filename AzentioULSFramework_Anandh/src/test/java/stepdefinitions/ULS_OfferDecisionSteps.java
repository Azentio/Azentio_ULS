package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.KULS_CommonWebElements;
import pageobjects.ULS_OfferDecisionObj;
import resources.BaseClass;
import testDataType.KULS_Login_TestDataType;

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

	@Given("^navigate to uls application url and login with valid user ID$")
	public void navigate_to_uls_application_url_and_login_with_valid_user_id() throws Throwable {
		driver.get(configFileReader.getULSApplicationCenBankUrl());
		kulsApplicationLogin.loginUlsApplicationAsMaker(kulsLoginTestData.UserName2, kulsLoginTestData.Password2);

	}

	@And("^click on mail box to select the l1App stage Record$")
	public void click_on_mail_box_to_select_the_l1app_stage_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonElements.ulsMailBox(), 10, 1);
		ulsCommonElements.ulsMailBox().click();
		ulsCommonElements.ulsNotificationSerachButton()
	}

	@And("^select the perticular record from mail box for offer decision screen$")
	public void select_the_perticular_record_from_mail_box_for_offer_decision_screen() throws Throwable {

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

	}

	@Then("^verify product field under facility details should be non editable$")
	public void verify_product_field_under_facility_details_should_be_non_editable() throws Throwable {

	}

	@Then("^verify sub product field under facility details should be non editable$")
	public void verify_sub_product_field_under_facility_details_should_be_non_editable() throws Throwable {

	}

	@Then("^verify scheme field under facility details should be non editable$")
	public void verify_scheme_field_under_facility_details_should_be_non_editable() throws Throwable {

	}

	@Then("^verify pricing indicator field under facility details should be non editable$")
	public void verify_pricing_indicator_field_under_facility_details_should_be_non_editable() throws Throwable {

	}

	@Then("^verify repayment type field under facility details should be non editable$")
	public void verify_repayment_type_field_under_facility_details_should_be_non_editable() throws Throwable {

	}

	@Then("^verify compute instalment on field under facility details should be non editable$")
	public void verify_compute_instalment_on_field_under_facility_details_should_be_non_editable() throws Throwable {

	}

	@Then("^verify Principal frequency field under facility details should be non editable$")
	public void verify_principal_frequency_field_under_facility_details_should_be_non_editable() throws Throwable {

	}

	@Then("^verify interst frequency field under facility details should be non editable$")
	public void verify_interst_frequency_field_under_facility_details_should_be_non_editable() throws Throwable {

	}

}
