package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

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
import resources.ExcelData;
import testDataType.ULS_BeneficiaryDetailsTestData;

public class ULS_BeneficiaryDetailsSteps extends BaseClass {

	WebDriver driver = BaseClass.driver;
	ULS_BeneficiaryDetailsObj beneficiaryDetailsObj = new ULS_BeneficiaryDetailsObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	KULS_CommonWebElements ulsCommonWebElementObj = new KULS_CommonWebElements(driver);
	KULS_CommonWebElements commonWebObj = new KULS_CommonWebElements(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ULS_BeneficiaryDetailsTestData beneficiaryDetailsTestdata = jsonConfig.getBeneficiaryDetailsTestDataByName("Maker");
	String path = System.getProperty("user.dir") + "\\Test-data\\ULSTestData.xlsx";
	ExcelData excelDataforBeneficiaryDetials = new ExcelData(path, "BeneficiaryDetails", "Data Set ID");
	Map<String, String> beneficiaryDetailsTestData = new HashMap<>();
	@And("^get the test data for activation and de activation of the beneficiary record$")
    public void get_the_test_data_for_activation_and_de_activation_of_the_beneficiary_record() throws Throwable {
		beneficiaryDetailsTestData=excelDataforBeneficiaryDetials.getTestdata("AT-BD-001_D11");
    }
	@And("^search the disbursement maker record$")
	public void search_the_disbursement_maker_record() throws Throwable {
//        waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElementObj.ulsNotificationSerachButton(), 10, 1);
//        ulsCommonWebElementObj.ulsNotificationSerachButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElementObj.ulsNotificationSearchTextBox(),
				10, 1);
		clicksAndActionsHelper.moveToElement(ulsCommonWebElementObj.ulsNotificationSearchTextBox());
		clicksAndActionsHelper.clickOnElement(ulsCommonWebElementObj.ulsNotificationSearchTextBox());
		ulsCommonWebElementObj.ulsNotificationSearchTextBox().sendKeys(beneficiaryDetailsTestData.get("Stage Code"));
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
		for (int i = 0; i <= 10; i++) {
			try {
				beneficiaryDetailsObj.beneficiaryDetailsAddButton().click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^get the test data for update the record before save$")
	public void get_the_test_data_for_update_the_record_before_save() throws Throwable {
		beneficiaryDetailsTestData = excelDataforBeneficiaryDetials.getTestdata("AT-BD-001_D3");
	}

	@Then("^verify user can able to update the facility application ID field$")
	public void verify_user_can_able_to_update_the_facility_application_id_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsFacilityApplicationIDDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsFacilityApplicationIDDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestData.get("Facility Appliation ID")
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
				.getAttribute("aria-label").contains(beneficiaryDetailsTestData.get("Facility Appliation ID")));
	}

	@Then("^verify user can able to update beneficiary name field$")
	public void verify_user_can_able_to_update_beneficiary_name_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameInputBox()
				.sendKeys(beneficiaryDetailsTestData.get("Beneficiary Name"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameDataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryNameDataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestData.get("Beneficiary Name"));
	}

	@Then("^verify user can able to update beneficiary type field$")
	public void verify_user_can_able_to_update_beneficiary_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryTypeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestData.get("Beneficiary Type")
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
				.contains(beneficiaryDetailsTestData.get("Beneficiary Type")));
	}

	@Then("^verify user can able to update beneficiary KYC field$")
	public void verify_user_can_able_to_update_beneficiary_kyc_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCInputBox()
				.sendKeys(beneficiaryDetailsTestData.get("Beneficiary KYC"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCdataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryKYCdataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestData.get("Beneficiary KYC"));
	}

	@Then("^verify user can able to update the beneficiary address field$")
	public void verify_user_can_able_to_update_the_beneficiary_address_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressInputBox()
				.sendKeys(beneficiaryDetailsTestData.get("Beneficiary Address"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressDataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryAddressDataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestData.get("Beneficiary Address"));
	}

	@Then("^verify user can able to update the account type field$")
	public void verify_user_can_able_to_update_the_account_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsAccountTypeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsAccountTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestData.get("Account Type")
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
				.contains(beneficiaryDetailsTestData.get("Account Type")));
	}

	@Then("^verify user can able to update the IBAN account no field$")
	public void verify_user_can_able_to_update_the_iban_account_no_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoInputBox()
				.sendKeys(beneficiaryDetailsTestData.get("IBAN Account No"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoDataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsIBANAccountNoDataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestData.get("IBAN Account No"));
	}

	@Then("^verify user can able to update the MICR Type field$")
	public void verify_user_can_able_to_update_the_micr_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsMICRTypeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsMICRTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestData.get("MICR Type")
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
				.contains(beneficiaryDetailsTestData.get("MICR Type")));
	}

	@Then("^verify user can able to update the beneficiary MICR Code field$")
	public void verify_user_can_able_to_update_the_beneficiary_micr_code_field() throws Throwable {
		double beneficiaryMICRCode = Double.valueOf(beneficiaryDetailsTestData.get("Beneficiary MICR Code"));
		String strbeneficiaryMICRCode = String.format("%.0f", beneficiaryMICRCode);
		if (beneficiaryDetailsTestdata.UpdatedMICRType.equals("NON-MICR")) {
			System.out.println("Non MICr No need to update the Micr code");
		} else

		{
			waitHelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryMICRCodeDropDown(), 10, 1);
			beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryMICRCodeDropDown().click();
			String xpath = "//ion-label[text()=' " + strbeneficiaryMICRCode
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
					.getAttribute("aria-label").contains(strbeneficiaryMICRCode));
		}
	}

	@Then("^verify user can able to update the Bank code field$")
	public void verify_user_can_able_to_update_the_bank_code_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBankCodeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBankCodeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestData.get("Bank Code")
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
				.contains(beneficiaryDetailsTestData.get("Bank Code")));
	}

	@Then("^verify user can able to update the branch name field$")
	public void verify_user_can_able_to_update_the_branch_name_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBranchNameDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBranchNameDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestData.get("Branch Name")
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
				.contains(beneficiaryDetailsTestData.get("Branch Name")));
	}

	@Then("^verify user can able to update the IFSC Code$")
	public void verify_user_can_able_to_update_the_ifsc_code() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeInputBox()
				.sendKeys(beneficiaryDetailsTestData.get("IFSC Code"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeDataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsIFSCCodeDataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestData.get("IFSC Code"));
	}

	@Then("^verify user can able to update the payment type field$")
	public void verify_user_can_able_to_update_the_payment_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsPaymentTypeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsPaymentTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestData.get("Payment Type")
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
				.contains(beneficiaryDetailsTestData.get("Payment Type")));
	}

	@Then("^verify user can able to update the payment mode field$")
	public void verify_user_can_able_to_update_the_payment_mode_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsPaymentModeDropDown(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsPaymentModeDropDown().click();
		String xpath = "//ion-label[text()=' " + beneficiaryDetailsTestData.get("Payment Mode")
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
				.contains(beneficiaryDetailsTestData.get("Payment Mode")));
	}

	@Then("^verify user can able to update the beneficiary email field$")
	public void verify_user_can_able_to_update_the_beneficiary_email_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetails_BeneficiaryEmailInputBox(), 10, 1);
		beneficiaryDetailsObj.beneficiaryDetails_BeneficiaryEmailInputBox().click();
		beneficiaryDetailsObj.beneficiaryDetails_BeneficiaryEmailInputBox().clear();
		beneficiaryDetailsObj.beneficiaryDetails_BeneficiaryEmailInputBox()
				.sendKeys(beneficiaryDetailsTestData.get("Beneficiary eMail"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryEmailDataHolder(), 10, 1);
		Assert.assertEquals(
				beneficiaryDetailsObj.beneficiaryDetailsBeneficiaryEmailDataHolder().getAttribute("ng-reflect-model"),
				beneficiaryDetailsTestData.get("Beneficiary eMail"));
	}

	@Then("^verify user can able to update the remarks field$")
	public void verify_user_can_able_to_update_the_remarks_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryDetailsObj.beneficiaryDetailsRemarks(), 10,
				1);
		beneficiaryDetailsObj.beneficiaryDetailsRemarks().click();
		beneficiaryDetailsObj.beneficiaryDetailsRemarks().clear();
		beneficiaryDetailsObj.beneficiaryDetailsRemarks().sendKeys(beneficiaryDetailsTestData.get("Remarks"));
		Assert.assertEquals(beneficiaryDetailsObj.beneficiaryDetailsRemarks().getText(),
				beneficiaryDetailsTestData.get("Remarks"));
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
			waitHelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryDetailsObj.beneficiaryDetailsStatusButton(), 2, 1);
			String statusOfToggleButton = beneficiaryDetailsObj.beneficiaryDetailsStatusButton()
					.getAttribute("aria-checked");
			System.out.println("Record status " + statusOfToggleButton);
			if (statusOfToggleButton.equals("true")) {
				System.out.println("Inside if for true");
				beneficiaryDetailsObj.beneficiaryDetailsStatusButton().click();
				beneficiaryDetailsObj.beneficiaryDetailsSaveButton().click();

				waitHelper.waitForElementToVisibleWithFluentWait(driver, commonWebObj.ulsToastAlert(), 4, 1);
				Assert.assertEquals(commonWebObj.ulsToastAlert().getText(),
						beneficiaryDetailsTestdata.SuccessToastMessage);
				waitHelper.waitForElementToVisibleWithFluentWait(driver, commonWebObj.ulsToastAlertClose(), 4, 1);
				commonWebObj.ulsToastAlertClose().click();
				for (int k = 0; k <= 10; k++) {
					try {
						beneficiaryDetailsObj.beneficiaryDetailsListViewFirstRecord().click();
						break;
					} catch (Exception e) {
						if (k == 10) {
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
				waitHelper.waitForElementToVisibleWithFluentWait(driver, commonWebObj.ulsToastAlert(), 4, 1);
				Assert.assertEquals(commonWebObj.ulsToastAlert().getText(),
						beneficiaryDetailsTestdata.SuccessToastMessage);
				waitHelper.waitForElementToVisibleWithFluentWait(driver, commonWebObj.ulsToastAlertClose(), 4, 1);
				commonWebObj.ulsToastAlertClose().click();
				for (int j = 0; j <= 10; j++) {
					try {
						beneficiaryDetailsObj.beneficiaryDetailsListViewFirstRecord().click();
						break;
					} catch (Exception e) {
						if (j == 10) {
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

		waitHelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryDetailsObj.beneficiaryDetailsBackButton(),
				10, 1);
		Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsBackButton().isDisplayed());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryDetailsObj.beneficiaryDetailsSaveButton(),
				10, 1);
		Assert.assertTrue(beneficiaryDetailsObj.beneficiaryDetailsSaveButton().isDisplayed());
	}

	@And("^click on back button in beneficiary dettails screen$")
	public void click_on_back_button_in_beneficiary_dettails_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryDetailsObj.beneficiaryDetailsBackButton(),
				10, 1);
		beneficiaryDetailsObj.beneficiaryDetailsBackButton().click();
	}

}
