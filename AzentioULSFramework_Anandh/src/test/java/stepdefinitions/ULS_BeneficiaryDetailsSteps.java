package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.KULS_CommonWebElements;
import pageobjects.ULS_BeneficiaryDetailsObj;
import resources.BaseClass;
import testDataType.ULS_BeneficiaryDetailsTestData;

public class ULS_BeneficiaryDetailsSteps extends BaseClass {

	WebDriver driver = BaseClass.driver;
	ULS_BeneficiaryDetailsObj beneficiaryDetailsObj = new ULS_BeneficiaryDetailsObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	KULS_CommonWebElements ulsCommonWebElementObj = new KULS_CommonWebElements(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ULS_BeneficiaryDetailsTestData beneficiaryDetailsTestdata = jsonConfig.getBeneficiaryDetailsTestDataByName("Maker");

	@And("^search the disbursement maker record$")
	public void search_the_disbursement_maker_record() throws Throwable {
//        waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElementObj.ulsNotificationSerachButton(), 10, 1);
//        ulsCommonWebElementObj.ulsNotificationSerachButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElementObj.ulsNotificationSearchTextBox(),
				10, 1);
		clicksAndActionsHelper.moveToElement(ulsCommonWebElementObj.ulsNotificationSearchTextBox());
		clicksAndActionsHelper.clickOnElement(ulsCommonWebElementObj.ulsNotificationSearchTextBox());
		ulsCommonWebElementObj.ulsNotificationSearchTextBox().sendKeys(beneficiaryDetailsTestdata.StageCode);
	}

	@And("^select the first record of disbursment maker stage$")
	public void select_the_first_record_of_disbursment_maker_stage() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsDisbursementmakerFirstRecord(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsDisbursementmakerFirstRecord().click();
	}

	@And("^go to beneficiary details tab$")
	public void go_to_beneficiary_details_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.ulsBeneficiaryDetailsSegmantButton(), 10, 1);
		beneficiaryDetailsObj.ulsBeneficiaryDetailsSegmantButton().click();
	}

	@And("^click on add button on beneficiary details screen$")
	public void click_on_add_button_on_beneficiary_details_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryDetailsObj.beneficiaryDetailsAddButton(),
				10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsAddButton().click();
	}

	@Then("^verify user can able to update the facility application ID field$")
	public void verify_user_can_able_to_update_the_facility_application_id_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsFacilityApplicationIDDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsFacilityApplicationIDDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestdata.UpdatedFacilityApplicationID
				+ " ']/parent::ion-item/ion-radio";
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
		Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsFacilityApplicationIDDropDown()
				.getAttribute("aria-label").contains(beneficiaryDetailsTestdata.UpdatedFacilityApplicationID));
	}

	@Then("^verify user can able to update beneficiary name field$")
	public void verify_user_can_able_to_update_beneficiary_name_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameInputBox()
				.sendKeys(beneficiaryDetailsTestdata.UpdatedBeneficiaryName);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameDataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameDataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestdata.UpdatedBeneficiaryName);
	}

	@Then("^verify user can able to update beneficiary type field$")
	public void verify_user_can_able_to_update_beneficiary_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryTypeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestdata.UpdatedBeneficiaryType
				+ " ']/parent::ion-item/ion-radio";
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
		Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryTypeDropDown().getAttribute("aria-label")
				.contains(beneficiaryDetailsTestdata.UpdatedBeneficiaryType));
	}

	@Then("^verify user can able to update beneficiary KYC field$")
	public void verify_user_can_able_to_update_beneficiary_kyc_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCInputBox()
				.sendKeys(beneficiaryDetailsTestdata.UpdatedBeneficiaryKYC);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCdataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCdataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestdata.UpdatedBeneficiaryKYC);
	}

	@Then("^verify user can able to update the beneficiary address field$")
	public void verify_user_can_able_to_update_the_beneficiary_address_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressInputBox()
				.sendKeys(beneficiaryDetailsTestdata.UpdatedBeneficiaryAddress);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressDataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressDataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestdata.UpdatedBeneficiaryAddress);
	}

	@Then("^verify user can able to update the account type field$")
	public void verify_user_can_able_to_update_the_account_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsAccountTypeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsAccountTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestdata.UpdatedAccountType
				+ " ']/parent::ion-item/ion-radio";
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
		Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsAccountTypeDropDown().getAttribute("aria-label")
				.contains(beneficiaryDetailsTestdata.UpdatedAccountType));
	}

	@Then("^verify user can able to update the IBAN account no field$")
	public void verify_user_can_able_to_update_the_iban_account_no_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoInputBox()
				.sendKeys(beneficiaryDetailsTestdata.UpdatedIBANAccountNumber);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoDataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoDataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestdata.UpdatedIBANAccountNumber);
	}

	@Then("^verify user can able to update the MICR Type field$")
	public void verify_user_can_able_to_update_the_micr_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsMICRTypeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsMICRTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestdata.UpdatedMICRType
				+ " ']/parent::ion-item/ion-radio";
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
		Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsMICRTypeDropDown().getAttribute("aria-label")
				.contains(beneficiaryDetailsTestdata.UpdatedMICRType));
	}

	@Then("^verify user can able to update the beneficiary MICR Code field$")
	public void verify_user_can_able_to_update_the_beneficiary_micr_code_field() throws Throwable {
		if (beneficiaryDetailsTestdata.UpdatedMICRType.equals("NON-MICR")) {
			System.out.println("Non MICr No need to update the Micr code");
		} else

		{
			waitHelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryMICRCodeDropDown(), 10, 1);
			beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryMICRCodeDropDown().click();
			String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestdata.UpdatedBeneficiaryMICRCode
					+ " ']/parent::ion-item/ion-radio";
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
			Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryMICRCodeDropDown()
					.getAttribute("aria-label").contains(beneficiaryDetailsTestdata.UpdatedBeneficiaryMICRCode));
		}
	}

	@Then("^verify user can able to update the Bank code field$")
	public void verify_user_can_able_to_update_the_bank_code_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBankCodeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBankCodeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestdata.UpdatedBankCode
				+ " ']/parent::ion-item/ion-radio";
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
		Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsBankCodeDropDown().getAttribute("aria-label")
				.contains(beneficiaryDetailsTestdata.UpdatedBankCode));
	}

	@Then("^verify user can able to update the branch name field$")
	public void verify_user_can_able_to_update_the_branch_name_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBranchNameDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBranchNameDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestdata.UpdatedBranchName
				+ " ']/parent::ion-item/ion-radio";
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
		Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsBranchNameDropDown().getAttribute("aria-label")
				.contains(beneficiaryDetailsTestdata.UpdatedBranchName));
	}

	@Then("^verify user can able to update the IFSC Code$")
	public void verify_user_can_able_to_update_the_ifsc_code() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeInputBox().sendKeys(beneficiaryDetailsTestdata.UpdatedIFSCCode);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeDataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeDataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestdata.UpdatedIFSCCode);
	}

	@Then("^verify user can able to update the payment type field$")
	public void verify_user_can_able_to_update_the_payment_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsPaymentTypeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsPaymentTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestdata.UpdatedPaymentType
				+ " ']/parent::ion-item/ion-radio";
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
		Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsPaymentTypeDropDown().getAttribute("aria-label")
				.contains(beneficiaryDetailsTestdata.UpdatedPaymentType));
	}

	@Then("^verify user can able to update the payment mode field$")
	public void verify_user_can_able_to_update_the_payment_mode_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsPaymentModeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsPaymentModeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestdata.UpdatedPaymentMode
				+ " ']/parent::ion-item/ion-radio";
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
		Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsPaymentModeDropDown().getAttribute("aria-label")
				.contains(beneficiaryDetailsTestdata.UpdatedPaymentMode));
	}

	@Then("^verify user can able to update the beneficiary email field$")
	public void verify_user_can_able_to_update_the_beneficiary_email_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetails_BeneficiaryEmailInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetails_BeneficiaryEmailInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetails_BeneficiaryEmailInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetails_BeneficiaryEmailInputBox()
				.sendKeys(beneficiaryDetailsTestdata.UpdatedBeneficiaryEmail);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryEmailDataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryEmailDataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestdata.UpdatedBeneficiaryEmail);
	}

	@Then("^verify user can able to update the remarks field$")
	public void verify_user_can_able_to_update_the_remarks_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryDetailsObj.beneficiaryDetailsRemarks(), 10,
				1);
		beneficiaryDetailsObj.beneficiaryDetailsRemarks().click();
		beneficiaryDetailsObj.beneficiaryDetailsRemarks().clear();
		beneficiaryDetailsObj.beneficiaryDetailsRemarks().sendKeys(beneficiaryDetailsTestdata.UpdatedBeneficiaryEmail);
		Assert.assertEquals(beneficiaryDetailsObj.beneficiaryDetailsRemarks().getText(),
				beneficiaryDetailsTestdata.UpdatedBeneficiaryEmail);
	}

	@And("^click on save button to save the updated beneficiary details record$")
	public void click_on_save_button_to_save_the_updated_beneficiary_details_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryDetailsObj.beneficiaryDetailsSaveButton(),
				10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsSaveButton().click();
	}

	@And("^select one list view record$")
	public void select_one_list_view_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsListViewFirstRecord(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsListViewFirstRecord().click();

	}

	@And("^check the status of the status button$")
	public void check_the_status_of_the_status_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryDetailsObj.beneficiaryDetailsStatusButton(),
				10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsStatusButton().getAttribute("aria-checked");
		System.out.println("Status Button status "
				+ beneficiaryDetailsObj.beneficiaryDetailsStatusButton().getAttribute("aria-checked"));
	}

	@Then("^verify if the status is activate user can able to de activate if the status is de activate user can able to activate$")
	public void verify_if_the_status_is_activate_user_can_able_to_de_activate_if_the_status_is_de_activate_user_can_able_to_activate()
			throws Throwable {

		for (int i = 0; i < 2; i++) {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryDetailsObj.beneficiaryDetailsStatusButton(), 2, 1);
			String statusOfToggleButton = beneficiaryDetailsObj.beneficiaryDetailsStatusButton()
					.getAttribute("aria-checked");
			System.out.println("Record status " + statusOfToggleButton);
			if (statusOfToggleButton.equals("true")) {
				System.out.println("Inside if for true");
				beneficiaryDetailsObj.beneficiaryDetailsStatusButton().click();
				beneficiaryDetailsObj.beneficiaryDetailsSaveButton().click();
				for(int k=0;k<=20;k++)
				{
				try
				{
				beneficiaryDetailsObj.beneficiaryDetailsListViewFirstRecord().click();
				}
				catch(Exception e)
				{
					if(i==20)
					{
						Assert.fail(e.getMessage());
					}
				}
				}
			}
			if (statusOfToggleButton.equals("false")) {
				System.out.println("Inside if for false");
				beneficiaryDetailsObj.beneficiaryDetailsStatusButton().click();
				beneficiaryDetailsObj.beneficiaryDetailsSaveButton().click();
				// waitHelper.waitForElementToVisibleWithFluentWait(driver,
				// beneficiaryDetailsObj.beneficiaryDetailsListViewFirstRecord(), 20, 1);
				for (int j = 0; j <= 20; j++) {
					try {
						beneficiaryDetailsObj.beneficiaryDetailsListViewFirstRecord().click();
					} catch (Exception e) {
						if (i == 20) {
							Assert.fail(e.getMessage());
						}
					}
				}
			}
		}

	}

	@Then("^verify user can able to see the save and back button in the benificiary details screen$")
	public void verify_user_can_able_to_see_the_save_and_back_button_in_the_benificiary_details_screen()
			throws Throwable {

	}

}
