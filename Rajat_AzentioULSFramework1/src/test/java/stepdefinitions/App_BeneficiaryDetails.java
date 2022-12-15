package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.BeneficiaryDetails_Obj;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.BeneficiaryDetailsTestData;

public class App_BeneficiaryDetails extends BaseClass {
WebDriver driver = BaseClass.driver;
JsonConfig jsonConfig = new JsonConfig();
ConfigFileReader configFileReader = new ConfigFileReader();
Selenium_Actions seleniumActions = new Selenium_Actions(driver);
BeneficiaryDetails_Obj beneficiaryDetailsObj = new BeneficiaryDetails_Obj(driver);
BeneficiaryDetailsTestData beneficiaryDetailsTestData = jsonConfig.getBeneficiaryDetailsDataListByName("Maker");
JsonDataReaderWriter json = new JsonDataReaderWriter();
ExcelData excelData = new ExcelData("C:\\Users\\inindc00072\\Downloads\\UlsTestDataDesign.xlsx","BeneficiaryDetails ","Data Set ID");
Map<String, String> testData;

@And("^Updating Testdata Id for Application Beneficiary Details$")
public void updating_testdata_id_for_ApplicationBeneficiaryDetails$()  {
	testData=excelData.getTestdata("AT-BD-004_D1");
}


@And("^User search Disbursement Maker Stage in inbox list view$")
public void user_search_disbursement_maker_stage_in_inbox_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.InboxSearchButton(),30, 2);
	 beneficiaryDetailsObj.InboxSearchButton().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.InboxSearchText(),30, 2);
	 beneficiaryDetailsObj.InboxSearchText().click();
	 beneficiaryDetailsObj.InboxSearchText().sendKeys(testData.get("SearchStage"));
}


	
@And("^User click the first edit icon of Disbursement Maker Stage record$")
public void user_click_the_first_edit_icon_of_disbursement_maker_stage_record() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.AppDISBMKR_ActionIcon(),30, 2);
	beneficiaryDetailsObj.AppDISBMKR_ActionIcon().click();
}

@And("^user click the Beneficiary details tab$")
public void user_click_the_beneficiary_details_tab() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.beneficiaryDetailsTab(),30, 2);
	beneficiaryDetailsObj.beneficiaryDetailsTab().click();
}

@And("^User click the first edit icon of beneficiary details list data$")
public void user_click_the_first_edit_icon_of_beneficiary_details_list_data() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.beneficiaryDetailsFirstEditIcon1(),30, 2);
	beneficiaryDetailsObj.beneficiaryDetailsFirstEditIcon1().click();
}

@And("^User Select and Update Facility Application id$")
public void user_select_and_update_facility_application_id() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.facilityApplicationId(),30, 2);
	beneficiaryDetailsObj.facilityApplicationId().click();
	String xpath ="//ion-label[text()=' "+testData.get("FacilityApplicationId")+" ']//following-sibling::ion-radio";
	for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Update Beneficiary Name$")
public void user_update_beneficiary_name() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.BeneficiaryName(),30, 2);
	beneficiaryDetailsObj.BeneficiaryName().click();
	for (int i = 0; i < 30; i++) {
		try {
			beneficiaryDetailsObj.BeneficiaryName().clear();
			beneficiaryDetailsObj.BeneficiaryName().sendKeys(testData.get("BeneficiaryName"));
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Select and Update Beneficiary Type$")
public void user_select_and_update_beneficiary_type() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.beneficiaryType(),30, 2);
	beneficiaryDetailsObj.beneficiaryType().click();
	String xpath ="//ion-label[text()=' "+testData.get("BeneficiaryType")+" ']//following-sibling::ion-radio";
	for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Update Beneficiary KYC$")
public void user_update_beneficiary_kyc() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.beneficiaryKYC(),30, 2);
	beneficiaryDetailsObj.beneficiaryKYC().click();
	for (int i = 0; i < 30; i++) {
		try {
			beneficiaryDetailsObj.beneficiaryKYC().clear();
			beneficiaryDetailsObj.beneficiaryKYC().sendKeys(testData.get("BeneficiaryKYC"));
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Update Beneficiary Address$")
public void user_update_beneficiary_address() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.beneficiaryAddress(),30, 2);
	beneficiaryDetailsObj.beneficiaryAddress().click();
	for (int i = 0; i < 30; i++) {
		try {
			beneficiaryDetailsObj.beneficiaryAddress().clear();
			beneficiaryDetailsObj.beneficiaryAddress().sendKeys(testData.get("Beneficiaryaddress"));
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Select and Update Account Type$")
public void user_select_and_update_account_type() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.accountType(),30, 2);
	beneficiaryDetailsObj.accountType().click();
	String xpath ="//ion-label[text()=' "+testData.get("AccountType")+" ']//following-sibling::ion-radio";
	for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Update IBAN or Account Number$")
public void user_update_iban_or_account_number() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.IBANorAccountNo(),30, 2);
	beneficiaryDetailsObj.IBANorAccountNo().click();
	for (int i = 0; i < 30; i++) {
		try {
			beneficiaryDetailsObj.IBANorAccountNo().clear();
			beneficiaryDetailsObj.IBANorAccountNo().sendKeys(testData.get("IBANAccountNo"));
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Select and Update MICR Type$")
public void user_select_and_update_micr_type() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.MICRType(),30, 2);
	beneficiaryDetailsObj.MICRType().click();
	String xpath ="//ion-label[text()=' "+testData.get("MICRtype")+" ']//following-sibling::ion-radio";
	for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Select and Update Beneficiary MICR Code$")
public void user_select_and_update_beneficiary_micr_code() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.beneficiaryMICRCode(),30, 2);
	beneficiaryDetailsObj.beneficiaryMICRCode().click();
	String xpath ="//ion-label[text()=' "+testData.get("BranchName")+" ']//following-sibling::ion-radio";
	for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Select and Update Bank Code$")
public void user_select_and_update_bank_code() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.bankCode(),30, 2);
	beneficiaryDetailsObj.bankCode().click();
	String xpath ="//ion-label[text()=' "+testData.get("Bankcode")+" ']//following-sibling::ion-radio";
	for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Select and Update Branch Name$")
public void user_select_and_update_branch_name() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.branchName(),30, 2);
	beneficiaryDetailsObj.branchName().click();
	String xpath ="//ion-label[text()=' "+testData.get("BranchName")+" ']//following-sibling::ion-radio";
	for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Update IFSC Code$")
public void user_update_ifsc_code() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.IFSCCode(),30, 2);
	beneficiaryDetailsObj.IFSCCode().click();
	for (int i = 0; i < 30; i++) {
		try {
			beneficiaryDetailsObj.IFSCCode().clear();
			beneficiaryDetailsObj.IFSCCode().sendKeys(testData.get("IFSCcode"));
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Select and Update Payment Type$")
public void user_select_and_update_payment_type() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.paymentType(),30, 2);
	beneficiaryDetailsObj.paymentType().click();
	String xpath ="//ion-label[text()=' "+testData.get("Paymenttype")+" ']//following-sibling::ion-radio";
	for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Select and Update Payment Mode$")
public void user_select_and_update_payment_mode() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.paymentMode(),30, 2);
	beneficiaryDetailsObj.paymentMode().click();
	String xpath ="//ion-label[text()=' "+testData.get("paymentMode")+" ']//following-sibling::ion-radio";
	for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Update Beneficiary Email$")
public void user_update_beneficiary_email() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.beneficiaryEmail(),30, 2);
	beneficiaryDetailsObj.beneficiaryEmail().click();
	for (int i = 0; i < 30; i++) {
		try {
			beneficiaryDetailsObj.beneficiaryEmail().clear();
			beneficiaryDetailsObj.beneficiaryEmail().sendKeys(testData.get("BeneficiaryEmail"));
			break;
		} catch (Exception e) {
			
		}
	}
}

@And("^User Update Remarks in Beneficiary Details$")
public void user_update_remarks_in_beneficiary_details() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.remarks(),30, 2);
	beneficiaryDetailsObj.remarks().click();
	for (int i = 0; i < 30; i++) {
		try {
			beneficiaryDetailsObj.remarks().clear();
			beneficiaryDetailsObj.remarks().sendKeys("Remark");
			break;
		} catch (Exception e) {
			
		}
	}
}
@And("^User upadte and save the Beneficiary Details record$")
public void user_upadte_and_save_the_beneficiary_details_record() throws Throwable {
	seleniumActions.getJavascriptHelper().scrollIntoView(beneficiaryDetailsObj.beneficiaryDetailsUpdate());
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.beneficiaryDetailsUpdate(),30, 2);
	 beneficiaryDetailsObj.beneficiaryDetailsUpdate().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.successMgs(),30, 2);
	 Assert.assertEquals(beneficiaryDetailsObj.successMgs().isDisplayed(), true);
}



@Then("^User verify the functionality of active and deactive toggle$")
public void user_verify_the_functionality_of_active_and_deactive_toggle() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.statusToggle(),30, 2);
	beneficiaryDetailsObj.statusToggle().click();
	beneficiaryDetailsObj.statusToggle().click();
	
}

@Then("^User verify the Label on button if the status of record is Active$")
public void user_verify_the_label_on_button_if_the_status_of_record_is_active() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.statusToggle(),30, 2);
	String status = beneficiaryDetailsObj.statusToggle().getAttribute("aria-checked");
	if (status.equalsIgnoreCase("true")) {
		System.out.println("viewed record is active");
	}
	else {
		System.out.println("viewed record is inactive");
	}
}




@And("^User Save the Reference Number for the Beneficiary Details Record Disbursement Maker Stage$")
public void user_save_the_reference_number_for_the_beneficiary_details_record_disbursement_maker_stage() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.referenceIdForDisbursementMaker(), 30, 2);
	String referenceId = beneficiaryDetailsObj.referenceIdForDisbursementMaker().getText();
	System.out.println(referenceId);
	json.addReferanceData(referenceId);
}
@And("^User Save the Reference Number for the Beneficiary Details Record Disbursement Checker Stage$")
public void user_save_the_reference_number_for_the_beneficiary_details_record_disbursement_checker_stage() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.referenceIdForDisbursementChecker(), 30, 2);
	String referenceId = beneficiaryDetailsObj.referenceIdForDisbursementChecker().getText();
	System.out.println(referenceId);
	json.addReferanceData(referenceId);
}

@And("^User Verify the Functionality of Approve button in Beneficiary Details$")
public void user_verify_the_functionality_of_approve_button_in_beneficiary_details() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.approveButton(), 30, 2);
	beneficiaryDetailsObj.approveButton().click();
}

@And("^User Enter remark for approve$")
public void user_enter_remark_for_approve() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.remarkforapprove(), 30, 2);
	beneficiaryDetailsObj.remarkforapprove().click();
}

@And("^User click popup approve button$")
public void user_click_popup_approve_button() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.finalApprove(), 30, 2);
	beneficiaryDetailsObj.finalApprove().click();
}



@And("^User Verify Record got approved and moved to Disbursement Checker Stage$")
public void user_verify_record_got_approved_and_moved_to_disbursement_checker_stage() throws Throwable {
	for (int i = 0; i <200; i++) {
		try {
			 beneficiaryDetailsObj.InboxSearchText().click();
			beneficiaryDetailsObj.InboxSearchText().clear();
			beneficiaryDetailsObj.InboxSearchText().sendKeys("DISBCKR");
			break;
		} catch (Exception e) {
			
		}
	}
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.InboxSearchButton(),30, 2);
	 beneficiaryDetailsObj.InboxSearchButton().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.InboxSearchText(),30, 2);
	 beneficiaryDetailsObj.InboxSearchText().click();
	 beneficiaryDetailsObj.InboxSearchText().sendKeys(json.readReferancedata());
	 for (int i = 0; i <200; i++) {
			try {
				String xpath ="//td[text()=' DISBCKR ']";
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				if (i==199) {
					Assert.fail("Record not found");
				}
			}
	
	 }
}
@And("^User search Disbursement Checker Stage in inbox list view$")
public void user_search_disbursement_checker_stage_in_inbox_list_view() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.InboxSearchButton(),30, 2);
	 beneficiaryDetailsObj.InboxSearchButton().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.InboxSearchText(),30, 2);
	 beneficiaryDetailsObj.InboxSearchText().click();
	 beneficiaryDetailsObj.InboxSearchText().sendKeys("DISBCKR");
}
@And("^User click the first edit icon of Disbursement Checker Stage record$")
public void user_click_the_first_edit_icon_of_disbursement_checker_stage_record() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.AppDISBCKR_ActionIcon(),30, 2);
	beneficiaryDetailsObj.AppDISBCKR_ActionIcon().click();
}
@And("^User Verify Record got approved and moved to Checker Print Stage$")
public void user_verify_record_got_approved_and_moved_to_checker_print_stage() throws Throwable {
	for (int i = 0; i <200; i++) {
		try {
			 beneficiaryDetailsObj.InboxSearchText().click();
			beneficiaryDetailsObj.InboxSearchText().clear();
			beneficiaryDetailsObj.InboxSearchText().sendKeys("DISBCKR");
			break;
		} catch (Exception e) {
			
		}
	}
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.InboxSearchButton(),30, 2);
	 beneficiaryDetailsObj.InboxSearchButton().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryDetailsObj.InboxSearchText(),30, 2);
	 beneficiaryDetailsObj.InboxSearchText().click();
	 beneficiaryDetailsObj.InboxSearchText().sendKeys(json.readReferancedata());
	 for (int i = 0; i <200; i++) {
			try {
				String xpath ="//td[text()=' CHQPRT ']";
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				if (i==199) {
					Assert.fail("Record not found");
				}
			}
	
	 }
}
}
