package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.DueMasterObject;
import resources.BaseClass;
import resources.ExcelData;
import testDataType.KULS_DueMaster_Creation;
import testDataType.KULS_Login_TestDataType;

public class KULS_DueMaster_Step {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	DueMasterObject duemasterObj = new DueMasterObject(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	KULS_DueMaster_Creation dueMasterData = jsonConfig.getDueMasterByName("Maker");
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00075\\Downloads\\UlsTestDataDesign.xlsx","DueMasterTestData", "Data Set ID");
	Map<String, String> testdata;

	@Given("^Launch the kuls application and Navigate to Due master module view list$")
	public void launch_the_kuls_application_and_navigate_to_due_master_module_view_list() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		applicationLogin.loginUlsApplicationAsMaker(loginData.Username, loginData.Password);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.configurationInLeftPanel(), 60, 2);
		duemasterObj.configurationInLeftPanel().click();
//	    seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,duemasterObj.productDefinitionInLeftPanel(),60,2);
//	    duemasterObj.productDefinitionInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.configManagerInLeftPanel(), 60, 2);
		duemasterObj.configManagerInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, duemasterObj.dueMasterViewIcon(),
				60, 2);
		duemasterObj.dueMasterViewIcon().click();
	}

	@Then("^Click on Save button$")
	public void click_on_save_button() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterSaveButton(), 60, 2);
		duemasterObj.dueMasterSaveButton().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMastersubmitSuccessPopup(), 60, 2);
		Assert.assertEquals(duemasterObj.dueMastersubmitSuccessPopup().isDisplayed(), true);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.closeIconInSuccessPopup(), 60, 2);
		duemasterObj.closeIconInSuccessPopup().click();
	}

	@And("^Click on Add icon$")
	public void click_on_add_icon() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, duemasterObj.dueMasterAddIcon(),
				60, 2);
		duemasterObj.dueMasterAddIcon().click();
	}

	@And("^user pass the excel Testdata value for creation$")
	public void user_pass_the_excel_Testdata_value_for_creation() throws Throwable {
		testdata = exceldata.getTestdata("AT_DM_T001_D1");
	}

	@And("^Enter the value in Due code field$")
	public void enter_the_value_in_due_code_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterDueCodeField(), 60, 2);
		duemasterObj.dueMasterDueCodeField().click();
		duemasterObj.dueMasterDueCodeField().sendKeys(testdata.get("DueCode"));
	}

	@And("^Enter the value in Description field$")
	public void enter_the_value_in_description_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterDescriptionField(), 60, 2);
		duemasterObj.dueMasterDescriptionField().click();
		duemasterObj.dueMasterDescriptionField().sendKeys(testdata.get("Description"));
	}

	@And("^Select the value in Waiver allowed field$")
	public void select_the_value_in_waiver_allowed_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterWaiverAllowedField(), 60, 2);
		duemasterObj.dueMasterWaiverAllowedField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("WaiverAllowed")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Enter the value in Legal code1 field$")
	public void enter_the_value_in_legal_coed1_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterLegalCode1Field(), 60, 2);
		duemasterObj.dueMasterLegalCode1Field().click();
		for (int i = 0; i < 50; i++) {
			try {
				duemasterObj.dueMasterLegalCode1Field().sendKeys(testdata.get("LegalCode1"));
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Enter the value in Legal code2 field$")
	public void enter_the_value_in_legal_code2_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterLegalCode2Field(), 60, 2);
		duemasterObj.dueMasterLegalCode2Field().click();
		duemasterObj.dueMasterLegalCode2Field().sendKeys(testdata.get("LegalCode2"));
	}

	@And("^Enter the value in Legal code3 field$")
	public void enter_the_value_in_legal_coed3_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterLegalCode3Field(), 60, 2);
		duemasterObj.dueMasterLegalCode3Field().click();
		duemasterObj.dueMasterLegalCode3Field().sendKeys(testdata.get("LegalCode3"));
	}

	@And("^Select the value in Repayment flag field$")
	public void select_the_value_in_repayment_tag_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterRepaymentFlagField(), 60, 2);
		duemasterObj.dueMasterRepaymentFlagField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("RepaymentFlag")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Future adjustment flag field$")
	public void select_the_value_in_future_adjustment_flag_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterFutureAdjustmentFlagField(), 60, 2);
		duemasterObj.dueMasterFutureAdjustmentFlagField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("FutureAdjustmentFlag")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Is tax due field$")
	public void select_the_value_in_is_tax_due_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterIsTaxDueField(), 60, 2);
		duemasterObj.dueMasterIsTaxDueField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("IsTaxDue")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Tax calculation method$")
	public void select_the_value_in_tax_calculation_method() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterTaxCalculationMethodField(), 60, 2);
		duemasterObj.dueMasterTaxCalculationMethodField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("TaxCalculationMethod")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Enter the value in Remarks field$")
	public void enter_the_value_in_remarks_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterRemarksField(), 60, 2);
		duemasterObj.dueMasterRemarksField().click();
		for (int i = 0; i < 50; i++) {
			try {
				duemasterObj.dueMasterRemarksField().sendKeys(testdata.get("Remarks"));
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Verify that required fields are present with red color astric symbol$")
	public void verify_that_required_fields_are_present_with_red_color_astric_symbol() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterRedColorAstricSymbolForRequiredField(), 60, 2);
		Assert.assertEquals(duemasterObj.dueMasterRedColorAstricSymbolForRequiredField().isDisplayed(), true);
	}

	@And("^Click on Save button without entering the values in required fields$")
	public void click_on_save_button_without_entering_the_values_in_required_fields() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterSaveButton(), 60, 2);
		duemasterObj.dueMasterSaveButton().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.requiredFieldWarningPopup(), 60, 2);
		Assert.assertEquals(duemasterObj.requiredFieldWarningPopup().isDisplayed(), true);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterBackButton(), 60, 2);
		duemasterObj.dueMasterBackButton().click();
		Thread.sleep(2000);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, duemasterObj.dueMasterAddIcon(),
				60, 2);
		duemasterObj.dueMasterAddIcon().click();
	}

	@And("^user pass the excel Testdata value for Invalid$")
	public void user_pass_the_excel_Testdata_value_for_Invalid() throws Throwable {
		testdata = exceldata.getTestdata("AT_DM_T002_D2");
	}

	@And("^Enter the invalid value in text fields and make sure the warning popup is displayed$")
	public void enter_the_invalid_value_in_due_code_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterDueCodeField(), 60, 2);
		duemasterObj.dueMasterDueCodeField().click();
		duemasterObj.dueMasterDueCodeField().sendKeys(testdata.get("DueCode"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterDescriptionField(), 60, 2);
		duemasterObj.dueMasterDescriptionField().click();
		duemasterObj.dueMasterDescriptionField().sendKeys(testdata.get("Description"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.alphaNumericCharactersAllowedWarningPopup(), 60, 2);
		Assert.assertEquals(duemasterObj.alphaNumericCharactersAllowedWarningPopup().isDisplayed(), true);
	}

	@Then("^Click on Save button and make sure that user can able to save the record$")
	public void click_on_save_button_and_make_sure_that_user_can_able_to_save_the_record() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterSaveButton(), 60, 2);
		duemasterObj.dueMasterSaveButton().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.alphaNumericCharactersAllowedWarningPopup(), 60, 2);
		Assert.assertEquals(duemasterObj.alphaNumericCharactersAllowedWarningPopup().isDisplayed(), true);
	}

	@Then("^Verify the back button functionality$")
	public void verify_the_back_button_functionality() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.dueMasterBackButton(), 60, 2);
		duemasterObj.dueMasterBackButton().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.pencilIconOfFirstRecord(), 60, 2);
		Assert.assertEquals(duemasterObj.pencilIconOfFirstRecord().isDisplayed(), true);
	}

	@And("^Navigate to Temp view in view list$")
	public void navigate_to_temp_view_in_view_list() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, duemasterObj.dueMasterTempView(),
				60, 2);
		duemasterObj.dueMasterTempView().click();
	}

	@And("^Click on Pencil icon of the record$")
	public void click_on_pencil_icon_of_the_record() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				duemasterObj.pencilIconOfFirstRecord(), 60, 2);
		duemasterObj.pencilIconOfFirstRecord().click();
	}

	@And("^Update the status of the record$")
	public void update_the_status_of_the_record() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, duemasterObj.statusToggleIcon(),
				60, 2);
		duemasterObj.statusToggleIcon().click();
	}
}
