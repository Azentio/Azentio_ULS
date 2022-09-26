package stepdefinitions;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.BeneficiaryDetailsObj;
import resources.BaseClass;
//import testDataType.KULS_CustomerEntityLayout_ContactDetails_Testdata;
import testDataType.KULS_Login_TestDataType;

public class BeneficiaryDetailsStep {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	BeneficiaryDetailsObj beneficiarydetailsobj = new BeneficiaryDetailsObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	// KULS_CustomerEntityLayout_ContactDetails_Testdata beneficiarydetaildata =
	// jsonConfig.getContactDetailsByName("Maker");

	@And("^Navigate to Mail box of Application details and search the DISBMKR value$")
	public void navigate_to_mail_box_of_application_details_and_search_the_disbckr_value() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				beneficiarydetailsobj.ApplicationDetails_Inbox(), 30, 2);
		beneficiarydetailsobj.ApplicationDetails_Inbox().click();
		for (int i = 0; i < 20; i++) {
			try {
				beneficiarydetailsobj.ApplicationDetailsInboxView_Search().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				beneficiarydetailsobj.ApplicationDetailsInboxView_SearchText(), 60, 2);
		beneficiarydetailsobj.ApplicationDetailsInboxView_SearchText().click();
		beneficiarydetailsobj.ApplicationDetailsInboxView_SearchText().sendKeys("DISBMKR");
	}

	@And("^Click on action icon of first record of application details_DISBMKR$")
	public void click_on_action_icon_of_first_record_of_application_detailsdisbmkr() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				beneficiarydetailsobj.ActionButtonOfFirstRecord_DISBMKR(), 30, 2);
		beneficiarydetailsobj.ActionButtonOfFirstRecord_DISBMKR().click();
	}

	@And("^Navigate to Beneficiary Details section$")
	public void navigate_to_beneficiary_details_section() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				beneficiarydetailsobj.BeneficiaryDetailsSection(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(beneficiarydetailsobj.BeneficiaryDetailsSection());
				break;
			} catch (ElementNotInteractableException e) {

			}
		}
	}

	@And("^Remove values from required fields in Beneficiary Details$")
	public void remove_values_from_required_fields_in_beneficiary_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				beneficiarydetailsobj.Beneficiaryname(), 60, 2);
		seleniumactions.getJavascriptHelper().JSEClick(beneficiarydetailsobj.Beneficiaryname());
		for (int i = 0; i <= 15; i++) {
			beneficiarydetailsobj.Beneficiaryname().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^Click on Save button and validate field is required popup in Beneficiary Details$")
	public void click_on_save_button_and_validate_field_is_required_popup_in_beneficiary_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				beneficiarydetailsobj.ContactDetails_SaveIcon(), 60, 2);
		beneficiarydetailsobj.ContactDetails_SaveIcon().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				beneficiarydetailsobj.requiredFieldWarningPopup(), 60, 2);
		Assert.assertEquals(beneficiarydetailsobj.requiredFieldWarningPopup().isDisplayed(), true);
	}

	@And("^Update with invalid data and validate error popup in Beneficiary details$")
	public void update_with_invalid_data_and_validate_error_popup_in_beneficiary_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				beneficiarydetailsobj.BeneficiaryKYC(), 60, 2);
		beneficiarydetailsobj.BeneficiaryKYC().click();
		beneficiarydetailsobj.BeneficiaryKYC().clear();
		beneficiarydetailsobj.BeneficiaryKYC().sendKeys("####");
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				beneficiarydetailsobj.alphaNumericCharactersAllowedWarningPopup(), 60, 2);
		Assert.assertEquals(beneficiarydetailsobj.alphaNumericCharactersAllowedWarningPopup().isDisplayed(), true);
	}

	@And("^Click on Pencil Icon of existing Beneficiary details record$")
	public void click_on_pencil_icon_of_existing_beneficiary_details_record() throws Throwable {
		Thread.sleep(2000);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				beneficiarydetailsobj.BeneficieryDetails_PencilIconOfFirstRecord(), 60, 2);
		beneficiarydetailsobj.BeneficieryDetails_PencilIconOfFirstRecord().click();
		Thread.sleep(2000);
	}

	@And("^Click on Back button of Beneficiary details$")
	public void click_on_back_button_of_beneficiary_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, beneficiarydetailsobj.BackIcon(),
				60, 2);
		beneficiarydetailsobj.BackIcon().click();
	}

}
