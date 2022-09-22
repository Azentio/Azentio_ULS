package stepdefinitions;

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
import pageobjects.BeneficiaryDetails_Obj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
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

	@And("^user search Disbursement Maker$")
	public void user_search_disbursement_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Search_Input(), 10, 2);
		BeneficiaryObj.Search_Input().sendKeys("606");
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
			BeneficiaryObj.Beneficiary_Type_Listview().sendKeys("213");
		} catch (Exception e) {

		}
		try {
			BeneficiaryObj.Beneficiary_Name_ListView().click();
			BeneficiaryObj.Beneficiary_Name_ListView().sendKeys("213");
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
		BeneficiaryObj.Beneficiary_SearchText().sendKeys("123");
		
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_SearchText(), 10, 2);
		BeneficiaryObj.Beneficiary_SearchText_Close().click();
		
    }
    @And("^user verify the functionality of Search box with matching data$")
    public void user_verify_the_functionality_of_search_box_with_matching_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_Search(), 10, 2);
		BeneficiaryObj.Beneficiary_Search().click();
		//Thread.sleep(2000);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, BeneficiaryObj.Beneficiary_SearchText(), 10, 2);
		BeneficiaryObj.Beneficiary_SearchText().sendKeys("Arshath");
		
		boolean status = false;
		for (int i = 0; i <= 15; i++) {
			try {
				status = driver
						.findElement(By.xpath("//span[contains(text(),'Arshath')]"))
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
}
