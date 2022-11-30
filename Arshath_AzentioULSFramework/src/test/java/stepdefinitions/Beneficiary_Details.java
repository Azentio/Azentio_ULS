package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.BeneficiaryDetails_Obj;
import pageobjects.KULS_CommonWebElements;
import pageobjects.ULS_BeneficiaryDetailsObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.Beneficiary_Details_Testdata;
import testDataType.KULS_Login_TestDataType;

public class Beneficiary_Details extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	BrowserHelper browserhelper = new BrowserHelper(driver);
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	BeneficiaryDetails_Obj BeneficiaryObj = new BeneficiaryDetails_Obj(driver);
	Beneficiary_Details_Testdata Beneficiarydata = jsonConfig.getBenificiaryListByName("DISBMKR");
	ULS_BeneficiaryDetailsObj beneficiaryDetailsObj = new ULS_BeneficiaryDetailsObj(driver);
	KULS_CommonWebElements commonWebObj = new KULS_CommonWebElements(driver);
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00075\\Downloads\\UlsTestDataDesign.xlsx","BeneficiaryDetailsTestdata", "Data Set ID");
	Map<String, String> testData;	
	
	@And("^user search Disbursement Maker$")
	public void user_search_disbursement_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Search_Input(), 10, 2);
		BeneficiaryObj.Search_Input().sendKeys(testData.get("StageCode"));
	}

	@And("^user click on First record of Beneficiary Entry$")
	public void user_click_on_first_record_of_beneficiary_entry() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Inbox_Edit(), 10, 2);
		BeneficiaryObj.Inbox_Edit().click();
	}

	@And("^user click on Beneficiary Details Tab$")
	public void user_click_on_beneficiary_details_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_Tab(), 10, 2);
		BeneficiaryObj.Beneficiary_Tab().click();
	}

	@And("^user verify the Beneficiary Type in List view screen$")
	public void user_verify_the_beneficiary_type_in_list_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_Type(), 10, 2);
		Assert.assertTrue(BeneficiaryObj.Beneficiary_Type().isDisplayed());
	}

	@And("^user verify the Beneficiary Name in List view screen$")
	public void user_verify_the_beneficiary_name_in_list_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_Name(), 10, 2);
		Assert.assertTrue(BeneficiaryObj.Beneficiary_Name().isDisplayed());
	}

	@And("^user verify the Account type in List view screen$")
	public void user_verify_the_account_type_in_list_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Bank_Account_Type(), 10, 2);
		Assert.assertTrue(BeneficiaryObj.Bank_Account_Type().isDisplayed());
	}

	@And("^user verify the IBAN Account number in List view screen$")
	public void user_verify_the_iban_account_number_in_list_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.IBAN_Account_No(), 10, 2);
		Assert.assertTrue(BeneficiaryObj.IBAN_Account_No().isDisplayed());
	}

	@And("^user verify the Beneficiary Bank_Name in List view Screen$")
	public void user_verify_the_beneficiary_bankname_in_list_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_Bank_Name(), 10, 2);
		Assert.assertTrue(BeneficiaryObj.Beneficiary_Bank_Name().isDisplayed());
	}

	@And("^user verify the Bank name in List view screen$")
	public void user_verify_the_bank_name_in_list_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Bank_Name(), 10, 2);
		Assert.assertTrue(BeneficiaryObj.Bank_Name().isDisplayed());
	}

	@And("^user verify the Values in List view should be non editable$")
	public void user_verify_the_values_in_list_view_should_be_non_editable() throws Throwable {
		try {
			BeneficiaryObj.Beneficiary_Type_Listview().click();
			BeneficiaryObj.Beneficiary_Type_Listview().sendKeys(testData.get("Non-Editable"));
		} catch (Exception e) {

		}
		try {
			BeneficiaryObj.Beneficiary_Name_ListView().click();
			BeneficiaryObj.Beneficiary_Name_ListView().sendKeys(testData.get("Non-Editable"));
		} catch (Exception e) {

		}
	}

	@And("^user verify the Add button in List view screen$")
	public void user_verify_the_add_button_in_list_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_Add(), 10, 2);
		Assert.assertTrue(BeneficiaryObj.Beneficiary_Add().isDisplayed());
	}

	@And("^user verify the Search button in List view screen$")
	public void user_verify_the_search_button_in_list_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_Search(), 10, 2);
		Assert.assertTrue(BeneficiaryObj.Beneficiary_Search().isDisplayed());
	}

	@And("^user verify the Export to excel in List view screen$")
	public void user_verify_the_export_to_excel_in_list_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.exportIcon(), 10, 2);
		BeneficiaryObj.exportIcon().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.xlsOption(), 10, 2);
		Assert.assertTrue(BeneficiaryObj.xlsOption().isDisplayed());

	}

	@And("^user verify the Export to PDF in List view screen$")
	public void user_verify_the_export_to_pdf_in_list_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.pdfOption(), 10, 2);
		Assert.assertTrue(BeneficiaryObj.pdfOption().isDisplayed());
	}
    @And("^user verify the functionality of Search box with mismatch data$")
    public void user_verify_the_functionality_of_search_box_with_mismatch_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_Search(), 10, 2);
		BeneficiaryObj.Beneficiary_Search().click();
		
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_SearchText(), 10, 2);
		BeneficiaryObj.Beneficiary_SearchText().sendKeys(testData.get("MatchingSearch"));
		
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_SearchText(), 10, 2);
		BeneficiaryObj.Beneficiary_SearchText_Close().click();
		
    }
    @And("^user verify the functionality of Search box with matching data$")
    public void user_verify_the_functionality_of_search_box_with_matching_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_Search(), 10, 2);
		BeneficiaryObj.Beneficiary_Search().click();
		//Thread.sleep(2000);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_SearchText(), 10, 2);
		BeneficiaryObj.Beneficiary_SearchText().sendKeys(testData.get("MatchingSearch"));
		
		boolean status = false;
		for (int i = 0; i <= 15; i++) {
			try {
				status = driver
						.findElement(By.xpath("//span[contains(text(),'"+testData.get("MatchingSearch")+"')]"))
						.isDisplayed();

			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}

			}
		}
		Assert.assertTrue(status);
    }

    @And("^user verify the functionality of Export to PDF button$")
    public void user_verify_the_functionality_of_export_to_pdf_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.exportIcon(), 10, 2);
		BeneficiaryObj.exportIcon().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.xlsOption(), 10, 2);
		BeneficiaryObj.pdfOption().click();
		
		browserhelper.SwitchToWindow(0);
		browserhelper.switchToParentWithChildClose();
		
    }

    @And("^user verify the functionality of Export to Excel button$")
    public void user_verify_the_functionality_of_export_to_excel_button() throws Throwable {
    	//Thread.sleep(2000);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.exportIcon(), 10, 2);
		BeneficiaryObj.exportIcon().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.xlsOption(), 10, 2);
		BeneficiaryObj.xlsOption().click();
		
//		browserhelper.SwitchToWindow(0);
//		browserhelper.switchToParentWithChildClose();
    }
    
    //***************AT_BD_011****************//
    
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
				Assert.assertTrue(commonWebObj.ulsToastAlert().getText().contains("Success"));
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
				Assert.assertTrue(commonWebObj.ulsToastAlert().getText().contains("Success"));
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
	public void verify_user_can_able_to_see_the_save_and_back_button_in_the_benificiary_details_screen() throws Throwable {

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

	@And("^user update the Excelsheet Testdata for active deactive$")
	public void user_update_the_Excelsheet_Testdata_for_active_deactive() {
		testData = exceldata.getTestdata("AT_BD_011_D1");
	}
	@And("^user update the Excelsheet Testdata for Listview$")
	public void user_update_the_Excelsheet_Testdata_for_Listview() {
		testData = exceldata.getTestdata("AT_BD_012_D1");
	}
}
