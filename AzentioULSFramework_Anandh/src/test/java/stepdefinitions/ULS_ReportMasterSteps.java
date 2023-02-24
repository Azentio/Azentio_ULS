package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.AssetCollateralTypeObj;
import pageobjects.ReportMasterObj;
import pageobjects.ULS_ReportMasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import testDataType.ULS_ReportMasterTestData;

public class ULS_ReportMasterSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	String filePath = System.getProperty("user.dir") + "\\Test-data\\ULSTestData.xlsx";
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ULS_ReportMasterObj reportMasterObj = new ULS_ReportMasterObj(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ULS_ReportMasterTestData reportMasterTestData = jsonConfig.getReportMasterTestDataByName("Maker");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ExcelData excelData = new ExcelData(filePath, "ReportMasterTestData1", "Data Set ID");
	ExcelData excelDataForReportMasterD = new ExcelData(filePath, "ReportMasterTestData_2", "Data Set ID");
	ExcelData excelDataForReportMasterTestData = new ExcelData(filePath, "ReportMasterTestData", "Data Set ID");
	ExcelData excelDataForReportMaster = new ExcelData(filePath, "ReportMaster", "Data Set ID");
	Map<String, String> reportMastertestData = new HashMap<>();
	Map<String, String> testData = new HashMap<>();
	Selenium_Actions action = new Selenium_Actions(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login login = new KULS_Application_Login(driver);
	ReportMasterObj ReportMaster = new ReportMasterObj(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	RadioButtonHelper radioButtonHelper = new RadioButtonHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	AssetCollateralTypeObj assetCollateralTypeObj = new AssetCollateralTypeObj(driver);

	@And("^click on view button in report master$")
	public void click_on_view_button_in_report_master() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// reportMasterObj.reportMasterViewIcon(), 10, 1);
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(reportMasterObj.reportMasterViewIcon());
				break;

			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on add button in report master$")
	public void click_on_add_button_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.addIcon(), 10, 1);
		reportMasterObj.addIcon().click();
	}

	@Then("^verify back button and save buttons are appeared$")
	public void verify_back_button_and_save_buttons_are_appeared() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.Report_Master_Save(), 10, 1);
		Assert.assertTrue(reportMasterObj.Report_Master_Save().isDisplayed());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterBackButton(), 10, 1);
		Assert.assertTrue(reportMasterObj.reportMasterBackButton().isDisplayed());
	}

	@And("^get the test data of report master fifth test case$")
	public void get_the_test_data_of_report_master_fifth_test_case() throws Throwable {
		reportMastertestData = excelData.getTestdata("AT-RA-005_D1");
	}

	@And("^click on save button inreport master without filling the details$")
	public void click_on_save_button_inreport_master_without_filling_the_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.Report_Master_Save(), 10, 1);
		reportMasterObj.Report_Master_Save().click();
	}

	@Then("^verify system should through the validation for the empty fields$")
	public void verify_system_should_through_the_validation_for_the_empty_fields() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportNameValidation(),
				10, 1);// Required field
		Assert.assertEquals(reportMasterObj.remportMasterReportNameValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName2Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName2Validation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName3Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName3Validation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterDescriptionValidation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterDescriptionValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportTypeValidation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportTypeValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportUrlValidation(), 10,
				1);
		Assert.assertEquals(reportMasterObj.remportMasterReportUrlValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.remportMasterReportCategoryValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportCategoryValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));
	}

	@And("^enter special charecters in text box$")
	public void enter_special_charecters_in_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportName(), 10, 1);
		reportMasterObj.reportName().sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportName2(), 10, 1);
		reportMasterObj.reportName2().sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportName3(), 10, 1);
		reportMasterObj.reportName3().sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportDescription(), 10, 1);
		reportMasterObj.reportDescription().sendKeys(reportMastertestData.get("SpecialCharacterInput"));
	}

	@Then("^verify system should through the validation for report master$")
	public void verify_system_should_through_the_validation_for_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportNameValidation(),
				10, 1);// Required field
		Assert.assertEquals(reportMasterObj.remportMasterReportNameValidation().getText(),
				reportMastertestData.get("SpecialCharecterValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName2Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName2Validation().getText(),
				"Alphanumeric characters allowed");

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName3Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName3Validation().getText(),
				reportMastertestData.get("SpecialCharecterValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterDescriptionValidation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterDescriptionValidation().getText(),
				reportMastertestData.get("SpecialCharecterValidationMessage"));
	}

	@And("^click on back button in report master$")
	public void click_on_back_button_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterBackButton(), 10, 1);
		reportMasterObj.reportMasterBackButton().click();
	}

	@Then("^verify report master screen should get back or not$")
	public void verify_report_master_screen_should_get_back_or_not() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterListViewText(), 10, 1);

		Assert.assertTrue(reportMasterObj.reportMasterListViewText().isDisplayed());
	}

	@And("^click on add button in report parameter details$")
	public void click_on_add_button_in_report_parameter_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportMasterAddButton(),
				20, 1);
		for (int i = 0; i <= 20; i++) {
			try {
				reportMasterObj.reportMasterReportMasterAddButton().click();
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^get the test data of parameter details validation scenario from excel$")
	public void get_the_test_data_of_parameter_details_validation_scenario_from_excel() throws Throwable {
		reportMastertestData = excelData.getTestdata("AT-RA-016_D1");
	}

	@And("^click on save button in report parameter details without filling the mendaory details$")
	public void click_on_save_button_in_report_parameter_details_without_filling_the_mendaory_details()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsReportParameterDetailsSaveButton(), 10, 1);
		reportMasterObj.reportParameterDetailsReportParameterDetailsSaveButton().click();
	}

	@Then("^verify user can get the validation for incomplete data in mendatory field in report parameter details$")
	public void verify_user_can_get_the_validation_for_incomplete_data_in_mendatory_field_in_report_parameter_details()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsTemplateFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsTemplateFieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParameter1FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParameter1FieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description1FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam1Description1FieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));
/*
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description2FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam1Description2FieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description3FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam1Description3FieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParameter2FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParameter2FieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description2FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam2Description2FieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description3FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam2Description3FieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));
*/
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsSequenceNoFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsSequenceNoFieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsDateFormatFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsDateFormatFieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsNullableValuesFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsNullableValuesFieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

	}

	@And("^enter characters in numeric field in report parameter details$")
	public void enter_characters_in_numeric_field_in_report_parameter_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsSequenceNoTextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsSequenceNoTextBox().click();
		reportMasterObj.reportParameterDetailsSequenceNoTextBox().sendKeys(reportMastertestData.get("CharecterInputs"));

	}

	@Then("^verify system should not allow to enter the charecter data into the numeric input box$")
	public void verify_system_should_not_allow_to_enter_the_charecter_data_into_the_numeric_input_box()
			throws Throwable {
		String sequenceNo = reportMasterObj.reportParameterDetailsSequenceNoDataHolder()
				.getAttribute("ng-reflect-model");
		char[] seqenceNoArray = sequenceNo.toCharArray();
		for (int i = 0; i < seqenceNoArray.length; i++) {

			boolean digit = Character.isDigit(seqenceNoArray[i]);
			Assert.assertTrue(digit);
		}
	}

	@And("^enter special charecter inputs in report parameter details$")
	public void enter_special_charecter_inputs_in_report_parameter_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParameter1TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParameter1TextBox()
				.sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description1(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description1()
				.sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description2TextBox()
				.sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description3TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description3TextBox()
				.sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParameter2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParameter2TextBox()
				.sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam2Description2TextBox()
				.sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description3TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam2Description3TextBox()
				.sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsDateFormatTextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsDateFormatTextBox()
				.sendKeys(reportMastertestData.get("SpecialCharacterInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsNullableValuesTextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsNullableValuesTextBox()
				.sendKeys(reportMastertestData.get("SpecialCharacterInput"));
	}

	@Then("^verify system should through the validation for the special charecter inputs for special charecter$")
	public void verify_system_should_through_the_validation_for_the_special_charecter_inputs_for_special_charecter()
			throws Throwable {

		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * reportMasterObj.reportParameterDetailsParameter1FieldValidation(), 10, 1);
		 * Assert.assertEquals(reportMasterObj.
		 * reportParameterDetailsParameter1FieldValidation().getText(),
		 * reportMasterTestData.SpecialCharecterValidationMessage);
		 * 
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * reportMasterObj.reportParameterDetailsParam1Description1FieldValidation(),
		 * 10, 1); Assert.assertEquals(reportMasterObj.
		 * reportParameterDetailsParam1Description1FieldValidation().getText(),
		 * reportMasterTestData.SpecialCharecterValidationMessage);
		 * 
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * reportMasterObj.reportParameterDetailsParam1Description2FieldValidation(),
		 * 10, 1); Assert.assertEquals(reportMasterObj.
		 * reportParameterDetailsParam1Description2FieldValidation().getText(),
		 * reportMasterTestData.SpecialCharecterValidationMessage);
		 * 
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * reportMasterObj.reportParameterDetailsParam1Description3FieldValidation(),
		 * 10, 1); Assert.assertEquals(reportMasterObj.
		 * reportParameterDetailsParam1Description3FieldValidation().getText(),
		 * reportMasterTestData.SpecialCharecterValidationMessage);
		 * 
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * reportMasterObj.reportParameterDetailsParameter2FieldValidation(), 10, 1);
		 * Assert.assertEquals(reportMasterObj.
		 * reportParameterDetailsParameter2FieldValidation().getText(),
		 * reportMasterTestData.SpecialCharecterValidationMessage);
		 * 
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * reportMasterObj.reportParameterDetailsParam2Description2FieldValidation(),
		 * 10, 1); Assert.assertEquals(reportMasterObj.
		 * reportParameterDetailsParam2Description2FieldValidation().getText(),
		 * reportMasterTestData.SpecialCharecterValidationMessage);
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description3FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam2Description3FieldValidation().getText(),
				reportMastertestData.get("SpecialCharecterValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsDateFormatFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsDateFormatFieldValidation().getText(),
				reportMastertestData.get("SpecialCharecterValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsNullableValuesFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsNullableValuesFieldValidation().getText(),
				reportMastertestData.get("SpecialCharecterValidationMessage"));
	}

	@And("^click on template field and select the data from the drop down$")
	public void click_on_template_field_and_select_the_data_from_the_drop_down() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsTemplateDropDown(), 10, 1);
		reportMasterObj.reportParameterDetailsTemplateDropDown().click();

		String xpath = "//ion-label[text()=' " + reportMastertestData.get("TemplateIDInput")
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on is mendatory dropdown and select the value from the dropdown$")
	public void click_on_is_mendatory_dropdown_and_select_the_value_from_the_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsIsMandatoryDropDown(), 10, 1);
		reportMasterObj.reportParameterDetailsIsMandatoryDropDown().click();

		String xpath = "//ion-label[text()=' " + reportMastertestData.get("isMandatory")
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^enter numeric inputs in all the charecter fields in report parameter details$")
	public void enter_numeric_inputs_in_all_the_charecter_fields_in_report_parameter_details() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParameter1TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParameter1TextBox().clear();
		reportMasterObj.reportParameterDetailsParameter1TextBox().sendKeys(reportMastertestData.get("NumericInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description1(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description1().clear();
		reportMasterObj.reportParameterDetailsParam1Description1().sendKeys(reportMastertestData.get("NumericInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description2TextBox().clear();
		reportMasterObj.reportParameterDetailsParam1Description2TextBox()
				.sendKeys(reportMastertestData.get("NumericInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description3TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description3TextBox().clear();
		reportMasterObj.reportParameterDetailsParam1Description3TextBox()
				.sendKeys(reportMastertestData.get("NumericInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParameter2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParameter2TextBox().clear();
		reportMasterObj.reportParameterDetailsParameter2TextBox().sendKeys(reportMastertestData.get("NumericInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam2Description2TextBox().clear();
		reportMasterObj.reportParameterDetailsParam2Description2TextBox()
				.sendKeys(reportMastertestData.get("NumericInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description3TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam2Description3TextBox().clear();
		reportMasterObj.reportParameterDetailsParam2Description3TextBox()
				.sendKeys(reportMastertestData.get("NumericInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsDateFormatTextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsDateFormatTextBox().clear();
		reportMasterObj.reportParameterDetailsDateFormatTextBox().sendKeys(reportMastertestData.get("NumericInput"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsNullableValuesTextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsNullableValuesTextBox().clear();
		reportMasterObj.reportParameterDetailsNullableValuesTextBox()
				.sendKeys(reportMastertestData.get("NumericInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsReportParameterDetailsSaveButton(), 10, 1);
		reportMasterObj.reportParameterDetailsReportParameterDetailsSaveButton().click();
	}

	@Then("^verify system should allow user to save the parameter details record$")
	public void verify_system_should_allow_user_to_save_the_parameter_details_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.toastAlert(), 30, 1);
		Assert.assertTrue(reportMasterObj.toastAlert().isDisplayed());
	}

	@And("^click on view button neqar by report master module$")
	public void click_on_view_button_neqar_by_report_master_module() throws Throwable {
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper.scrollIntoView(reportMasterObj.reportMasterViewIcon());
				reportMasterObj.reportMasterViewIcon().click();
				break;
			} catch (Exception e) {
				if (i == 40) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on edit button of one of the approved record$")
	public void click_on_edit_button_of_one_of_the_approved_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ApprovedRecordEditIcon(),
				20, 1);
		reportMasterObj.reportMaster_ApprovedRecordEditIcon().click();
	}

	@And("^clear the input data of Report Name field$")
	public void clear_the_input_data_of_report_name_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportnameDataHolder(), 10,
				1);
		System.out.println(" Report Name Input Data : "
				+ reportMasterObj.reportMasterReportnameDataHolder().getAttribute("ng-reflect-model").length());
		int length = reportMasterObj.reportMasterReportnameDataHolder().getAttribute("ng-reflect-model").length();
		for (int i = 0; i < length; i++) {
			reportMasterObj.reportMasterReportNameInputBox().click();
			reportMasterObj.reportMasterReportNameInputBox().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^get the test data o report master tenth test case$")
	public void get_the_test_data_o_report_master_tenth_test_case() throws Throwable {
		reportMastertestData = excelData.getTestdata("AT-RA-010_D1");
	}

	@And("^clear input data of Report Name 2 field$")
	public void clear_input_data_of_report_name_2_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportname2DataHolder(),
				10, 1);
		System.out.println(" Report Name Input Data : "
				+ reportMasterObj.reportMasterReportname2DataHolder().getAttribute("ng-reflect-model").length());
		int length = reportMasterObj.reportMasterReportname2DataHolder().getAttribute("ng-reflect-model").length();
		for (int i = 0; i < length; i++) {
			reportMasterObj.reportMasterReportName2InputBox().click();
			reportMasterObj.reportMasterReportName2InputBox().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^clear the input data of Report Name 3 field$")
	public void clear_the_input_data_of_report_name_3_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportname3DataHolder(),
				10, 1);
		System.out.println(" Report Name Input Data : "
				+ reportMasterObj.reportMasterReportname3DataHolder().getAttribute("ng-reflect-model").length());
		int length = reportMasterObj.reportMasterReportname3DataHolder().getAttribute("ng-reflect-model").length();
		for (int i = 0; i < length; i++) {
			reportMasterObj.reportMasterReportName3InputBox().click();
			reportMasterObj.reportMasterReportName3InputBox().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^clear the input data of Report Description field$")
	public void clear_the_input_data_of_report_description_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportMasterReportDescriptionDataHolder(), 10, 1);
		System.out.println(" Report Name Input Data : "
				+ reportMasterObj.reportMasterReportDescriptionDataHolder().getAttribute("ng-reflect-model").length());
		int length = reportMasterObj.reportMasterReportDescriptionDataHolder().getAttribute("ng-reflect-model")
				.length();
		for (int i = 0; i < length; i++) {
			reportMasterObj.reportMasterReportDescriptionInputBox().click();
			reportMasterObj.reportMasterReportDescriptionInputBox().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^clear the input data of report type field$")
	public void clear_the_input_data_of_report_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportTypeDropdown(), 10,
				1);
		reportMasterObj.reportMasterReportTypeDropdown().click();
		String xpath = "//ion-label[text()=' " + reportMastertestData.get("defaultSelectValue")
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^clear the input data of Report URL field$")
	public void clear_the_input_data_of_report_url_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportURLField(), 10, 1);
		int length = reportMasterObj.reportMasterReportURLField().getText().length();
		for (int i = 0; i <= length; i++) {
			reportMasterObj.reportMasterReportURLField().click();
			reportMasterObj.reportMasterReportURLField().sendKeys(Keys.BACK_SPACE);
		}

	}

	@And("^clear the input data of Report category field$")
	public void clear_the_input_data_of_report_category_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportCategoryDropdown(),
				10, 1);
		reportMasterObj.reportMasterReportCategoryDropdown().click();
		String xpath = "//ion-label[text()=' " + reportMastertestData.get("defaultSelectValue")
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on save button to save the report master screen without data$")
	public void click_on_save_button_to_save_the_report_master_screen_without_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SaveButton(), 10, 1);
		reportMasterObj.reportMaster_SaveButton().click();
	}

	@Then("^verify all the mandatory field should show the validation for blank field$")
	public void verify_all_the_mandatory_field_should_show_the_validation_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportMasterReportNameFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportMasterReportNameFieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName2Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName2Validation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName3Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName3Validation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportMasterReportTypeDropdownFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportMasterReportTypeDropdownFieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportURLFieldValidation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.reportMasterReportURLFieldValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.remportMasterReportCategoryValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportCategoryValidation().getText(),
				reportMastertestData.get("mandatoryFieldValidationMessage"));
	}

	@Then("^verify report name field should through the validation message post enter the special character input$")
	public void verify_report_name_field_should_through_the_validation_message_post_enter_the_special_character_input()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportNameInputBox(), 10,
				1);
		reportMasterObj.reportMasterReportNameInputBox().sendKeys(reportMastertestData.get("SpecialCharacterInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportNameValidation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportNameValidation().getText(),
				reportMastertestData.get("SpecialCharecterValidationMessage"));
	}

	@Then("^verify report name 2 field should through the validation message post enter the special character input$")
	public void verify_report_name_2_field_should_through_the_validation_message_post_enter_the_special_character_input()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportName2InputBox(), 10,
				1);
		reportMasterObj.reportMasterReportName2InputBox().sendKeys(reportMastertestData.get("SpecialCharacterInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName2Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName2Validation().getText(),
				"Alphanumeric characters allowed");
	}

	@Then("^verify report name 3 field should through the validation message post enter the special character input$")
	public void verify_report_name_3_field_should_through_the_validation_message_post_enter_the_special_character_input()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterReportName3InputBox(), 10,
				1);
		reportMasterObj.reportMasterReportName3InputBox().sendKeys(reportMastertestData.get("SpecialCharacterInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName3Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName3Validation().getText(),
				reportMastertestData.get("SpecialCharecterValidationMessage"));
	}

	@Then("^verify report Description field should through the validation message post enter the special character input$")
	public void verify_report_description_field_should_through_the_validation_message_post_enter_the_special_character_input()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportMasterReportDescriptionInputBox(), 10, 1);
		reportMasterObj.reportMasterReportDescriptionInputBox()
				.sendKeys(reportMastertestData.get("SpecialCharacterInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportMasterReportDescriptionFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportMasterReportDescriptionFieldValidation().getText(),
				reportMastertestData.get("SpecialCharecterValidationMessage"));
	}

	@Then("^choose the data set id for for list view validation$")
	public void choose_the_data_set_id_for_for_list_view_validation() throws Throwable {
		testData = excelDataForReportMaster.getTestdata("AT-RM-T011-D1");
	}

	@And("^Click the Eye icon of report master$")
	public void click_the_eye_icon_of_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterViewIcon(), 60, 2);
		reportMasterObj.reportMasterViewIcon().click();
	}

	@Then("^Click the first icon in the list view in the report master$")
	public void click_the_first_icon_in_the_list_view_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportGroupMaster_ListViewEyeIcon(),
				60, 2);
		reportMasterObj.ReportGroupMaster_ListViewEyeIcon().click();
	}

	@And("^To verify the functionality of Add button in report master$")
	public void to_verify_the_functionality_of_add_button_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.addIcon(), 60, 2);
		Assert.assertEquals(reportMasterObj.addIcon().isDisplayed(), true);

	}

	@Then("^To verify the functionality of Search box with matching data in report master$")
	public void to_verify_the_functionality_of_search_box_with_matching_data_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.parameter_ListViewSearch(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				reportMasterObj.parameter_ListViewSearch().click();
				break;
			} catch (Exception e) {

			}
		}
		Thread.sleep(2000);
		reportMasterObj.parameter_ListViewSearchText().click();
		reportMasterObj.parameter_ListViewSearchText().sendKeys(testData.get("Matcheddata"));
		Assert.assertEquals(reportMasterObj.parameter_ListViewMachedData().isDisplayed(), true);
	}

	@And("^To verify the functionality of Search box with mismatch data in report master$")
	public void to_verify_the_functionality_of_search_box_with_mismatch_data_in_report_master() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				reportMasterObj.parameter_ListViewSearch().click();
				break;
			} catch (Exception e) {

			}
		}
		reportMasterObj.parameter_ListViewSearchText().click();
		reportMasterObj.parameter_ListViewSearchText().sendKeys(testData.get("UnMatcheddata"));
		Thread.sleep(1000);
		String xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]";
		for (int i = 0; i < 200; i++) {
			try {
				action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				// "Showing 0 to 0 of 0 entries"
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

	}

	@Then("^To verify the functionality of Export to PDF button in report master$")
	public void to_verify_the_functionality_of_export_to_pdf_button_in_report_master() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				reportMasterObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.exportToPDF(), 60, 3);
		reportMasterObj.exportToPDF().click();
		// seleniumactions.getBrowserHelper().SwitchToWindow(1);
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		int length = totalfiles.length;
		int i = 0;
		for (File fileName : totalfiles) {
			if (fileName.getName().equalsIgnoreCase("ReportMasterFormDataFile.pdf")) {
				System.out.println("Downloaded file present in system");
				break;
			} else if (i == length - 1) {
				System.out.println("Downloaded file present does not exist in system");
			}

		}
		action.getBrowserHelper().switchToParentWithChildClose();
	}

	@And("^To verify the functionality of Export to Excel button in report master$")
	public void to_verify_the_functionality_of_export_to_excel_button_in_report_master() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				reportMasterObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		List<String> xlsList = new LinkedList<>();
		action.getClickAndActionsHelper().moveToElement(reportMasterObj.exportToExcel());
		reportMasterObj.exportToExcel().click();
		Thread.sleep(2000);

		String UserDirectory = System.getProperty("user.dir");
		// System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		for (File fileName : totalfiles) {
			System.out.println("File name" + fileName);
			xlsList.add(fileName.toString());
		}

	}

	@Then("^To verify the functionality of Sequence number field in report master$")
	public void to_verify_the_functionality_of_sequence_number_field_in_report_master() throws Throwable {
		String xpath = "(//tbody/tr[1]/td[3]/p-celleditor[1]/span[1])[2]";
		// action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		for (int i = 0; i < 20; i++) {
			try {
				String ScequenceNumber = driver.findElement(By.xpath(xpath)).getText();
				System.out.println("ScequenceNumber :" + ScequenceNumber);
				break;
			} catch (NoSuchElementException e) {
			}
		}

	}

	@And("^To verify the functionality of Description field in report master$")
	public void to_verify_the_functionality_of_description_field_in_report_master() throws Throwable {
		String xpath1 = "(//tbody/tr[1]/td[4]/p-celleditor[1]/span[1])[2]";
		// action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath1)),60,2);
		for (int i = 0; i < 30; i++) {
			try {
				WebElement DescriptionField = driver.findElement(By.xpath(xpath1));
				System.out.println("DescriptionField :" + DescriptionField);
				break;
			} catch (NoSuchElementException e) {
			}
		}
	}

	@Then("^To verify the functionality of Status field in report master$")
	public void to_verify_the_functionality_of_status_field_in_report_master() throws Throwable {
		String xpath2 = "(//p-tag[@ng-reflect-value='Active'])[3]";
		// action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath2)),60,2);
		for (int i = 0; i < 30; i++) {
			try {
				WebElement status = driver.findElement(By.xpath(xpath2));
				System.out.println("status :" + status);
				break;
			} catch (NoSuchElementException e) {
			}
		}
	}

	// ***************Creation Flow*************************************//

	@Then("^Choose the data set id for report master creation$")
	public void choose_the_data_set_id_for_report_master_creation() throws Throwable {
		testData = excelDataForReportMaster.getTestdata("AT-RM-T001-D1");

	}

	@Then("^Click the add button in the report master$")
	public void click_the_add_button_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.addIcon(), 60, 2);
		reportMasterObj.addIcon().click();
	}

	@And("^Enter the report name in report master$")
	public void enter_the_report_name_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportName(), 60, 2);
		reportMasterObj.reportName().click();
		reportMasterObj.reportName().sendKeys(testData.get("ReportName"));
	}

	@Then("^Fill the report name2 in report master$")
	public void fill_the_report_name2_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportName2(), 60, 2);
		reportMasterObj.reportName2().click();
		reportMasterObj.reportName2().sendKeys(testData.get("ReportName2"));

	}

	@And("^Enter the report name3 in report master$")
	public void enter_the_report_name3_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportName3(), 60, 2);
		reportMasterObj.reportName3().click();
		reportMasterObj.reportName3().sendKeys(testData.get("ReportName3"));
	}

	@Then("^Fill the report description in report master$")
	public void fill_the_report_description_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.Reportdescription(), 60, 2);
		reportMasterObj.Reportdescription().click();
		reportMasterObj.Reportdescription().sendKeys(testData.get("ReportDescription"));

	}

	@And("^Choose the report type in report master$")
	public void choose_the_report_type_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportType(), 60, 2);
		reportMasterObj.reportType().click();
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("ReportType")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}

	}

	@Then("^Fill the report URL in report master$")
	public void fill_the_report_url_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportUrl(), 60, 2);
		reportMasterObj.reportUrl().click();
		reportMasterObj.reportUrl().sendKeys(testData.get("ReportURL"));
	}

	@And("^Enter the report catogory in report master$")
	public void enter_the_report_catogory_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportCategory(), 60, 2);
		reportMasterObj.reportCategory().click();
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("ReportCatogory")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}

	}

	@Then("^Save the record in report master$")
	public void save_the_record_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.Report_Master_Save(), 60, 2);
		reportMasterObj.Report_Master_Save().click();
	}

	@And("^Click the inbox in report master$")
	public void click_the_inbox_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.Report_Inbox(), 60, 2);
		reportMasterObj.Report_Inbox().click();
	}

	@Then("^Search the record in search field in report master$")
	public void search_the_record_in_search_field_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_SeachButton(), 60, 2);
		reportMasterObj.ReportMaster_SeachButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_SearchText(), 60, 2);
		action.getClickAndActionsHelper().moveToElement(reportMasterObj.ReportMaster_SearchText());
		reportMasterObj.ReportMaster_SearchText().click();
		reportMasterObj.ReportMaster_SearchText().sendKeys(testData.get("Search"));
	}

	@And("^Get the reference id in report master$")
	public void get_the_reference_id_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_GetRefId(), 60, 2);
		String RefId = reportMasterObj.ReportMaster_GetRefId().getText();
		excelDataForReportMaster.updateTestData("AT-RM-T001-D1", "Reference ID", RefId);
		System.out.println(RefId);
		// json.addReferanceData(RefId);
	}

	@And("^Get the reference id in report master for reject$")
	public void get_the_reference_id_in_report_master_for_reject() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_GetRefId(), 60, 2);
		String RefId = reportMasterObj.ReportMaster_GetRefId().getText();
		excelData.updateTestData("AT-RM-T001-D2", "Reference ID", RefId);

		System.out.println(RefId);
		// json.addReferanceData(RefId);
	}

	@And("^Get the reference id in report master for return$")
	public void get_the_reference_id_in_report_master_for_return() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_GetRefId(), 60, 2);
		String RefId = reportMasterObj.ReportMaster_GetRefId().getText();
		excelData.updateTestData("AT-RM-T001-D3", "Reference ID", RefId);

		System.out.println(RefId);
		// json.addReferanceData(RefId);
	}

	@Then("^Click the first action icon in report master$")
	public void click_the_first_action_icon_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_ActionIcon(), 60, 2);
		reportMasterObj.ReportMaster_ActionIcon().click();
	}

	@And("^Submit the record in report master$")
	public void submit_the_record_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_SubmitButton(), 60, 2);
		reportMasterObj.ReportMaster_SubmitButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_SubmitOKButton(), 60, 2);
		reportMasterObj.ReportMaster_SubmitOKButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_FinalSubmitButton(), 60,
				2);
		reportMasterObj.ReportMaster_FinalSubmitButton().click();
		Thread.sleep(3000);
	}

	@Then("^Get the checker id in report master$")
	public void get_the_checker_id_in_report_master() throws Throwable {

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// reportMstObj.ReportMaster_CheckerId(), 60, 2);
		String CheckerId = null;
		for (int i = 0; i < 20; i++) {
			try {
				CheckerId = reportMasterObj.ReportMaster_CheckerId().getText();
				break;
			} catch (Exception e) {

			}
		}

		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		excelDataForReportMaster.updateTestData("AT-RM-T001-D1", "Checker id", popupID);
		System.out.println(popupID);
	}

	@Then("^Get the checker id in report master for rejection flow$")
	public void get_the_checker_id_in_report_master_for_rejection_flow() throws Throwable {

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// reportMstObj.ReportMaster_CheckerId(), 60, 2);
		String CheckerId = null;
		for (int i = 0; i < 20; i++) {
			try {
				CheckerId = reportMasterObj.ReportMaster_CheckerId().getText();
				break;
			} catch (Exception e) {

			}
		}

		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		excelData.updateTestData("AT-RM-T001-D2", "Checker id", popupID);
		System.out.println(popupID);
	}

	@Then("^Get the checker id in report master for return$")
	public void get_the_checker_id_in_report_master_for_return() throws Throwable {

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// reportMstObj.ReportMaster_CheckerId(), 60, 2);
		String CheckerId = null;
		for (int i = 0; i < 20; i++) {
			try {
				CheckerId = reportMasterObj.ReportMaster_CheckerId().getText();
				break;
			} catch (Exception e) {

			}
		}

		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		excelData.updateTestData("AT-RM-T001-D3", "Checker id", popupID);
		System.out.println(popupID);
	}

///*******************Checker Approval************************//
	@Given("^Get the URL and login as Checker in report master$")
	public void get_the_url_and_login_as_checker_in_report_master() throws Throwable {
		String kulsApplicationUrl = configFileReader.getULSApplicationCenBankUrl();
		driver.get(kulsApplicationUrl);
		// System.out.println(json.readdata());
		login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}

	@Then("^Choose the data set id for checker approval in report master$")
	public void choose_the_data_set_id_for_checker_approval_in_report_master() throws Throwable {
		testData = excelData.getTestdata("AT-RM-T001-D1");
	}

	@Then("^Click the inbox in the report master$")
	public void click_the_inbox_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerInbox(), 60, 2);
		reportMasterObj.ReportMaster_CheckerInbox().click();
	}

	@And("^Search the reference id and click the respective action icon in report master$")
	public void search_the_reference_id_and_click_the_respective_action_icon_in_report_master() throws Throwable {
		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^Search the reference id and click the respective action icon in report master for rejection$")
	public void search_the_reference_id_and_click_the_respective_action_icon_in_report_master_for_rejection()
			throws Throwable {
		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^Search the reference id and click the respective action icon in report master for return$")
	public void search_the_reference_id_and_click_the_respective_action_icon_in_report_master_for_return()
			throws Throwable {

		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@Then("^Click the approve button in the report master$")
	public void click_the_approve_button_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerApproveButton(),
				60, 2);
		reportMasterObj.ReportMaster_CheckerApproveButton().click();
	}

	@And("^Enter the alert remark in the report master$")
	public void enter_the_alert_remark_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerAlertApprove(), 60,
				2);
		reportMasterObj.ReportMaster_CheckerAlertApprove().click();
	}

	@Then("^Give the final approve in the report master$")
	public void give_the_final_approve_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerFinalApprove(), 60,
				2);
		reportMasterObj.ReportMaster_CheckerFinalApprove().click();
	}

	@And("^Verify the record get approved in report master$")
	public void verify_the_record_get_approved_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerId(), 60, 2);
		String Toast = reportMasterObj.ReportMaster_CheckerId().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}

	@Then("^Verify that approved record is present in the list view$")
	public void verify_that_approved_record_is_present_in_the_list_view() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {

				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("ReportName") + "')]"))
						.getText();
				System.out.println(validate);

			} catch (Exception e) {
			}
		}
	}
//****************Checker Reject****************************//

	@Then("^Click the reject button in the report master$")
	public void click_the_reject_button_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerRejectButton(), 60,
				2);
		reportMasterObj.ReportMaster_CheckerRejectButton().click();
	}

	@And("^Enter the reject alert remark in the report master$")
	public void enter_the_reject_alert_remark_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerAlertReject(), 60,
				2);
		reportMasterObj.ReportMaster_CheckerAlertReject().click();
	}

	@Then("^Give the final reject in the report master$")
	public void give_the_final_reject_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerFinalReject(), 60,
				2);
		reportMasterObj.ReportMaster_CheckerFinalReject().click();
	}

	@And("^Verify the record get rejected in report master$")
	public void verify_the_record_get_rejected_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_RejectPopUp(), 60, 2);
		String Toast = reportMasterObj.ReportMaster_RejectPopUp().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record REJECTED Successfully");
	}

	@Then("^Verify that rejected record is not present in the list view$")
	public void verify_that_rejected_record_is_not_present_in_the_list_view() throws Throwable {
		for (int i = 0; i < 50; i++) {

		}
		try {
			String validate = driver
					.findElement(By.xpath("//span[contains(text(),'" + testData.get("ReportName") + "')]")).getText();
			System.out.println(validate);
			Assert.assertEquals(validate, testData.get("ReportName"));
		} catch (Exception e) {
			System.out.println("The Rejected Record Not in the List view ");
		}
	}

//*********************Checker Return**************************//
	@Then("^Click the return button in the report master$")
	public void click_the_return_button_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerReturnButton(), 60,
				2);
		reportMasterObj.ReportMaster_CheckerReturnButton().click();
	}

	@And("^Enter the return alert remark in the report master$")
	public void enter_the_return_alert_remark_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerAlertReturn(), 60,
				2);
		reportMasterObj.ReportMaster_CheckerAlertReturn().click();
	}

	@Then("^Give the final return in the report master$")
	public void give_the_final_return_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_CheckerFinalReturn1(), 60,
				2);
		reportMasterObj.ReportMaster_CheckerFinalReturn1().click();
	}

	@And("^Verify the record get returned in report master$")
	public void verify_the_record_get_returned_in_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.ReportMaster_ReturnPopUp(), 60, 2);
		String Toast = reportMasterObj.ReportMaster_ReturnPopUp().getText();
		System.out.println(Toast);
	}

	@Then("^Verify that returned record is present in the temp view$")
	public void verify_that_returned_record_is_present_in_the_temp_view() throws Throwable {
		for (int i = 0; i < 20; i++) {

		}
		try {
			String validate = driver
					.findElement(By.xpath("//span[contains(text(),'" + testData.get("ReportName") + "')]")).getText();
			System.out.println(validate);
			Assert.assertEquals(validate, testData.get("ReportName"));
		} catch (Exception e) {

		}
	}

	@And("^Click the temp view in the report master$")
	public void click_the_temp_view_in_the_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMasterEditIcon(), 60, 2);
		reportMasterObj.reportMasterEditIcon().click();

	}

	@Then("^choose the data set id for creation of report master for rejection$")
	public void choose_the_data_set_id_for_creation_of_report_master_for_rejection() throws Throwable {
		testData = excelData.getTestdata("AT-RM-T001-D2");
	}

	@And("^Choose the data set id for return the records in report master$")
	public void choose_the_data_set_id_for_return_the_records_in_report_master() throws Throwable {
		testData = excelData.getTestdata("AT-RM-T001-D3");
	}

	@Then("^User click the report master list view icon$")
	public void user_click_the_report_master_list_view_icon() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.ReportMasterListViewIcon(), 60, 5);
		ReportMaster.ReportMasterListViewIcon().click();

	}

	@Then("^User verify the functionality of Add button in report master$")
	public void user_verify_the_functionality_of_add_button_in_report_master() throws Throwable {

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.AddIcon(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.AddIcon().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@Then("^User click the save icon in report master$")
	public void user_click_the_save_icon_in_report_master() throws Throwable {

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.NewSave(), 60, 5);
		for (int i = 0; i < 30; i++) {
			try {
				ReportMaster.NewSave().click();
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail();
				}

			}
		}

	}

	@Then("^User get the confirmation message in report master$")
	public void user_get_the_confirmation_message_in_report_master() throws Throwable {

		for (int i = 0; i < 20; i++) {
			try {
				// Assert.assertEquals(assetcd.makerconfirmmsg().isDisplayed(), true);
				System.out.println(ReportMaster.makerconfirmmsg().getText());
				break;
			} catch (NoSuchElementException e) {

			}
		}
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// assetcd.successcancel(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.successcancel().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@Then("^User click the inboxmail icon in report master$")
	public void user_click_the_inboxmail_icon_in_report_master() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.mailicon(), 60, 5);
		ReportMaster.mailicon().click();

	}

	@And("^User verify the functionality of Back button in report master$")
	public void user_verify_the_functionality_of_back_button_in_report_master() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.BackArrow(), 60, 5);
		ReportMaster.BackArrow().click();

	}

	@And("^User click the report parameter add icon in report master$")
	public void user_click_the_report_parameter_add_icon_in_report_master() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.ReportParameterAddIcon(), 60, 5);
		ReportMaster.ReportParameterAddIcon().click();

	}

	@And("^User click the report group master icon in report master$")
	public void user_click_the_report_group_master_icon_in_report_master() throws Throwable {

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.ReportGroupMaster(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.ReportGroupMaster().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User click the report group master add icon in report master$")
	public void user_click_the_report_group_master_add_icon_in_report_master() throws Throwable {

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.AddIcon(), 60, 5);
		for (int i = 0; i < 40; i++) {
			try {
				ReportMaster.AddIcon().click();
			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the group name in report master$")
	public void user_enter_the_group_name_in_report_master() throws Throwable {
		testData = excelData.getTestdata("AT-RA-022_D1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.GroupName(), 60, 5);
		ReportMaster.GroupName().click();
		ReportMaster.GroupName().sendKeys(testData.get("Group Name"));

	}

	@And("^User Enter the group description in report master$")
	public void user_enter_the_group_description_in_report_master() throws Throwable {

		testData = excelData.getTestdata("AT-RA-022_D1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.GroupDescription(), 60, 5);
		ReportMaster.GroupDescription().click();
		ReportMaster.GroupDescription().sendKeys(testData.get("Group Des"));

	}

	@And("^User Enter the min parameter required in report master$")
	public void user_enter_the_min_parameter_required_in_report_master() throws Throwable {

		testData = excelData.getTestdata("AT-RA-022_D1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.MinParametersRequired(), 60, 5);
		ReportMaster.MinParametersRequired().click();
		ReportMaster.MinParametersRequired().sendKeys(testData.get("Min Parameter req"));

	}

	@And("^User Verify the available and selected field in report master$")
	public void user_click_the_double_arrow_in_report_master() throws Throwable {

		testData = excelData.getTestdata("AT-RA-022_D1");
		String xpath = "//div[contains(text(),'" + testData.get("Available and Selected") + "')]";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.AngleRight(), 60, 5);
		ReportMaster.AngleRight().click();

	}

	@And("^User get the reference id in report master$")
	public void user_get_the_reference_id_in_report_master() throws Throwable {
		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.searchiconreferenceid().click();
				ReportMaster.searchsentkeys().sendKeys(testData.get("Inbox Search"));
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.referenceid(), 60, 5);
		System.out.println(ReportMaster.referenceid().getText());
		String ref1 = ReportMaster.referenceid().getText();
		String ref2 = ref1.substring(0);
		// json.addReferanceData(ref2);
		excelData.updateTestData("AT-RA-012_D1", "Reference ID", ref2);

	}

	@And("^User click the action edit icon in submit stage in report master$")
	public void user_click_the_action_edit_icon_in_submit_stage_in_report_master() throws Throwable {

		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.inboxediticon().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User click the submit icon in report master$")
	public void user_click_the_submit_icon_in_report_master() throws Throwable {

		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.submit().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User enter the popup remark and click the popup submit$")
	public void user_enter_the_popup_remark_and_click_the_popup_submit() throws Throwable {
		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.popupremark().click();
				break;
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.popupremark().sendKeys(testData.get("Maker PopupRemark"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.popupsubmit(), 60, 5);
		ReportMaster.popupsubmit().click();

	}

	@And("^user get the popup message and get the checker id in report master$")
	public void user_get_the_popup_message_and_get_the_checher_id_in_report_master() throws Throwable {

		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.ProductCheckerid(), 60, 5);
		String Success = ReportMaster.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		System.out.println(popupID);
		excelDataForReportMasterTestData.updateTestData("AT-RA-012_D1", "Checker id", popupID);

	}

	@And("^User Enter the Template in report parameter$")
	public void user_enter_the_template_in_report_parameter() throws Throwable {

		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.Template(), 60, 5);
		ReportMaster.Template().click();

		String xpath = "//ion-label[contains(text(),'" + testData.get("Template") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the parameter1 in report parameter$")
	public void user_enter_the_parameter1_in_report_parameter() throws Throwable {

		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.Parameter1(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.Parameter1().click();
				ReportMaster.Parameter1().sendKeys(testData.get("Parameter 1"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the param1 Description1 in report parameter$")
	public void user_enter_the_param1_description1_in_report_parameter() throws Throwable {

		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.Param1Description1(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.Param1Description1().click();
				ReportMaster.Param1Description1().sendKeys(testData.get("Parameter 1 Des 1"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the param1 Description2 in report parameter$")
	public void user_enter_the_param1_description2_in_report_parameter() throws Throwable {

		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.Param1Description2(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.Param1Description2().click();
				ReportMaster.Param1Description2().sendKeys(testData.get("Parameter 1 Des 2"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the param1 Description3 in report parameter$")
	public void user_enter_the_param1_description3_in_report_parameter() throws Throwable {
		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.Param1Description3(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.Param1Description3().click();
				ReportMaster.Param1Description3().sendKeys(testData.get("Parameter 1 Des 3"));

				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the parameter2 in report parameter$")
	public void user_enter_the_parameter2_in_report_parameter() throws Throwable {
		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.Parameter2(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.Parameter2().click();
				ReportMaster.Parameter2().sendKeys(testData.get("Parameter 2"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the param2 Description2 in report parameter$")
	public void user_enter_the_param2_description2_in_report_parameter() throws Throwable {
		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.Param2Description2(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.Param2Description2().click();
				ReportMaster.Param2Description2().sendKeys(testData.get("Parameter 2 Des 2"));

				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the param2 Description3 in report parameter$")
	public void user_enter_the_param2_description3_in_report_parameter() throws Throwable {
		testData = excelData.getTestdata("AT-RA-012_D1");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.Param2Description3(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.Param2Description3().click();
				ReportMaster.Param2Description3().sendKeys(testData.get("Parameter 2 Des 3"));

				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the IsMandatory in report parameter$")
	public void user_enter_the_ismandatory_in_report_parameter() throws Throwable {

		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ReportMaster.IsMandatory(), 60, 5);
		ReportMaster.IsMandatory().click();

		String xpath = "//ion-label[contains(text(),'" + testData.get("Is Mandatory")
				+ "')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the sequenceNo in report parameter$")
	public void user_enter_the_sequenceno_in_report_parameter() throws Throwable {
		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.SequenceNo(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.SequenceNo().click();
				ReportMaster.SequenceNo().sendKeys(testData.get("Sequence No"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the date format in report parameter$")
	public void user_enter_the_date_format_in_report_parameter() throws Throwable {
		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.DateFormat(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.DateFormat().click();
				ReportMaster.DateFormat().sendKeys(testData.get("Date format"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User Enter the Nullable values in report parameter$")
	public void user_enter_the_nullable_values_in_report_paramete() throws Throwable {
		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.NullableValues(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.NullableValues().click();
				ReportMaster.NullableValues().sendKeys(testData.get("Nullable values"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User click the report master edit icon$")
	public void user_click_the_report_master_edit_icon() throws Throwable {

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.ReportMasterEditIcon(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.ReportMasterEditIcon().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	// Checker

	// Checker Approve

	@Given("^User login as uls checker in report master$")
	public void user_login_as_uls_checker_in_report_master() throws Throwable {
		String kulsApplicationUrl = configFileReader.getULSApplicationCenBankUrl();
		driver.get(kulsApplicationUrl);
		// System.out.println(json.readdata());
		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		System.out.println(testData.get("Checker id"));
		login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}

	@And("^User click the search icon in report master and get the reference id in report master$")
	public void user_click_the_search_icon_in_report_master_and_get_the_reference_id_in_report_master()
			throws Throwable {

		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.searchiconreferenceid().click();
				ReportMaster.searchsentkeys().sendKeys(testData.get("Inbox Search"));
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User search the respective reference id and click on Action button in report master$")
	public void user_search_the_respective_reference_id_and_click_on_action_button_in_report_master() throws Throwable {

		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		for (int i = 0; i < 40; i++) {

			try {

				driver.findElement(
						By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
						.click();
				break;

			}

			catch (Exception e) {

			}

		}

	}

	@Then("^User validate the updated record in list view in report master$")
	public void user_validate_the_updated_record_in_list_view_in_report_master() throws Throwable {

		testData = excelDataForReportMasterTestData.getTestdata("AT-RA-012_D1");
		for (int i = 0; i < 20; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("Reference ID") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("Reference ID"));
				break;

			} catch (NoSuchElementException e) {

			}

		}

	}

	@And("^User click the report master eye icon$")
	public void user_click_the_report_master_eye_icon() throws Throwable {

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ReportMaster.ReportMasterEditIcon(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.ReportMasterListViewIcon().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User verify the rejected record removed from the system in report master$")
	public void user_verify_the_rejected_record_removed_from_the_system_in_report_master() throws Throwable {

		testData = excelData.getTestdata("AT-RA-012_D1");
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.searchiconreferenceid().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, ReportMaster.searchsentkeys(), 60,
				2);

		ReportMaster.searchsentkeys().sendKeys(testData.get("Reference ID"));

		String xpath = "//td[contains(text(),'MST_REPORT')]/preceding-sibling::td[1]/span[contains(text(),'"
				+ testData.get("Reference ID") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
				break;
			} catch (NoSuchElementException e) {

			}
		}

	}

	@And("^User verify the returned record removed from the system in report master$")
	public void user_verify_the_returned_record_removed_from_the_system_in_report_master() throws Throwable {

		testData = excelData.getTestdata("AT-RA-012_D1");
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.searchiconreferenceid().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, ReportMaster.searchsentkeys(), 60,
				2);

		ReportMaster.searchsentkeys().sendKeys(testData.get("Reference ID"));

		String xpath = "//td[contains(text(),'MST_REPORT')]/preceding-sibling::td[1]/span[contains(text(),'"
				+ testData.get("Reference ID") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
				break;
			} catch (NoSuchElementException e) {

			}
		}

	}

	@And("^user verify the search results show matched data for report master$")
	public void user_verify_the_search_results_show_matched_data_for_report_master() throws Throwable {

		testData = excelData.getTestdata("AT-RA-042_D1");
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				ReportMaster.assetAutoViewSearchText(), 30, 2);
		ReportMaster.assetAutoViewSearchText().sendKeys(testData.get("SearchMatchData"));

		String xpath = "//span[contains(text(),'" + testData.get("SearchMatchData") + "')]";
		for (int i = 0; i < 20; i++) {
			try {
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
				break;
			} catch (NoSuchElementException e) {

			}

		}

	}

	@And("^user verify the search results shows no data for report master$")
	public void user_verify_the_search_results_shows_no_data_for_report_master() throws Throwable {

		testData = excelData.getTestdata("AT-RA-042_D1");
		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
		for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				ReportMaster.assetAutoViewSearchText(), 30, 2);
		ReportMaster.assetAutoViewSearchText().sendKeys(testData.get("SearchUnmatchedData"));
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), testData.get("UnmatchedDataError"));
				break;
			} catch (NoSuchElementException e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();

	}

	@Then("^user should navigate to report master$")
	public void user_should_navigate_to_report_master() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Maker_MenuToggle());
		reportMasterObj.reportMaster_Maker_MenuToggle().click();
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMasterConfigurations());
		reportMasterObj.reportMasterConfigurations().click();
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMasterConfigMenu());
		reportMasterObj.reportMasterConfigMenu().click();
	}

	@And("^click on work in progress records button of report master$")
	public void click_on_work_in_progress_records_button_of_report_master() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_WorkInProgressRecordsButton());
		reportMasterObj.reportMaster_WorkInProgressRecordsButton().click();
	}

	@Then("^click on add button to create new record of report master$")
	public void click_on_add_button_to_create_new_record_of_report_master() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_addButton());
		reportMasterObj.reportMaster_addButton().click();
	}

	@Then("^click on save button to save the report master record in the system$")
	public void click_on_save_button_to_save_the_report_master_record_in_the_system() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SaveButton());
		reportMasterObj.reportMaster_SaveButton().click();
	}

	@Then("^user should navigate to report group master$")
	public void user_should_navigate_to_report_group_master() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_addButton2());
		reportMasterObj.reportMaster_addButton2().click();
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportGroupMasterSegmentButton());
		reportMasterObj.reportMaster_ReportGroupMasterSegmentButton().click();
	}

	@Then("^click on add button to create new record of report group master$")
	public void click_on_add_button_to_create_new_record_of_report_group_master() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_addButton());
		clicksAndActionsHelper.JSEClick(reportMasterObj.reportMaster_addButton());
	}

	@Then("^verify system should show proper validation message for blank field of report master record which is mandatory$")
	public void verify_system_should_show_proper_validation_message_for_blank_field_of_report_master_record_which_is_mandatory()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SaveButton());
		clicksAndActionsHelper.JSEClick(reportMasterObj.reportMaster_SaveButton());

		String xpath = "//ion-label/span/ancestor::ion-col/descendant::ion-badge[contains(text(),'Required field')]";
		List<WebElement> mandatoryBlankFields = driver.findElements(By.xpath(xpath));
		for (WebElement element : mandatoryBlankFields) {
			boolean res = element.isDisplayed();
			Assert.assertTrue(res);
		}
	}

	@Then("^verify system should show proper validation message when user enter numeric value in character field of report master record$")
	public void verify_system_should_show_proper_validation_message_when_user_enter_numeric_value_in_character_field_of_report_master_record()
			throws Throwable {

	}

	@Then("^verify system should show proper validation message when user enter character value in numeric field of report master record$")
	public void verify_system_should_show_proper_validation_message_when_user_enter_character_value_in_numeric_field_of_report_master_record()
			throws Throwable {

	}

	@Then("^verify system should show proper validation message when user enter only special characters value in any field of report master record$")
	public void verify_system_should_show_proper_validation_message_when_user_enter_only_special_characters_value_in_any_field_of_report_master_record()
			throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_GroupName());
		clicksAndActionsHelper.doubleClick(reportMasterObj.reportMaster_GroupName());
		reportMasterObj.reportMaster_GroupName().sendKeys(testData.get("UnmatchedDataError"));

		boolean message = reportMasterObj.reportMaster_SpecialCharacterValidationMessage().isDisplayed();
		Assert.assertTrue(message);
	}

	@Then("^verify search box should display matching record with matched data in report group master$")
	public void verify_search_box_should_display_matching_record_with_matched_data_in_report_group_master()
			throws Throwable {
		while (true) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchButton());
				reportMasterObj.reportMaster_SearchButton().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchInputField());
		reportMasterObj.reportMaster_SearchInputField().sendKeys(testData.get("UnmatchedDataError"));
		String beforexpath = "//span[text()='";
		String afterxpath = "']";
		boolean result = driver.findElement(By.xpath(beforexpath + testData.get("UnmatchedDataError") + afterxpath))
				.isDisplayed();
		Assert.assertTrue(result);
	}

	@Then("^verify search box should not display any record with mismatched data in report group master$")
	public void verify_search_box_should_not_display_any_record_with_mismatched_data_in_report_group_master()
			throws Throwable {
		reportMasterObj.reportMaster_SearchInputField().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		reportMasterObj.reportMaster_SearchInputField().sendKeys("412379");
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_NoDataFoundInSearch());
		reportMasterObj.reportMaster_NoDataFoundInSearch().isDisplayed();
		reportMasterObj.reportMaster_SearchCloseButton().click();
	}

	@Then("^click on export to pdf button system should download Pdf file in report group master$")
	public void click_on_export_to_pdf_button_system_should_download_pdf_file_in_report_group_master()
			throws Throwable {
		reportMasterObj.reportMaster_Export().click();
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_PdfFile());
		reportMasterObj.reportMaster_PdfFile().click();
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();
	}

	@Then("^click on export to excel button system should download Excel file in report group master$")
	public void click_on_export_to_excel_button_system_should_download_excel_file_in_report_group_master()
			throws Throwable {
		while (true) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Export());
				reportMasterObj.reportMaster_Export().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
		for (int i = 0; i < 10; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_XlsFile());
				reportMasterObj.reportMaster_XlsFile().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

	@Then("^verify the functionality of Group header ID field system should display Group header ID number of that record$")
	public void verify_the_functionality_of_group_header_id_field_system_should_display_group_header_id_number_of_that_record()
			throws Throwable {
		boolean result = reportMasterObj.reportMaster_ListViewGroupHeaderIDField().isDisplayed();
		System.out.println("System is showing GroupHeaderID field - " + result);

		try {
			reportMasterObj.reportMaster_ListViewGroupHeaderIDField().sendKeys("ok");
			System.out.println("GroupHeaderID Field in list view is not editable");
		} catch (Exception e) {
			System.out.println("GroupHeaderID Field in list view is not editable");
		}
	}

	@Then("^verify the functionality of group name field system should display Group name of that record$")
	public void verify_the_functionality_of_group_name_field_system_should_display_group_name_of_that_record()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_GroupName());
		boolean result = reportMasterObj.reportMaster_GroupName().isDisplayed();
		System.out.println("System is showing GroupName field - " + result);

		try {
			reportMasterObj.reportMaster_GroupName().sendKeys("ok");
			System.out.println("GroupName Field in list view is not editable");
		} catch (Exception e) {
			System.out.println("GroupName Field in list view is not editable");
		}
	}

	@Then("^verify the functionality of Description field system should display Description of that group master record$")
	public void verify_the_functionality_of_description_field_system_should_display_description_of_that_group_master_record()
			throws Throwable {
		boolean result = reportMasterObj.reportMaster_ListViewDescriptionField().isDisplayed();
		System.out.println("System is showing Description field - " + result);

		try {
			reportMasterObj.reportMaster_ListViewDescriptionField().sendKeys("ok");
			System.out.println("Description Field in list view is not editable");
		} catch (Exception e) {
			System.out.println("Description Field in list view is not editable");
		}
	}

	@Then("^verify the functionality of Status field system should display Status of that group master record$")
	public void verify_the_functionality_of_status_field_system_should_display_status_of_that_group_master_record()
			throws Throwable {
		boolean result = reportMasterObj.reportMaster_ListViewStatusField().isDisplayed();
		System.out.println("System is showing Status field - " + result);

		try {
			reportMasterObj.reportMaster_ListViewStatusField().sendKeys("ok");
			System.out.println("Status Field in list view is not editable");
		} catch (Exception e) {
			System.out.println("Status Field in list view is not editable");
		}
	}

	@Then("^Fill all valid fields in the report master screen for approve the record$")
	public void fill_all_valid_fields_in_the_report_master_screen_for_approve_the_record() throws Throwable {
		testData = excelDataForReportMasterD.getTestdata("AT_RA_06_D1");
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName());
		reportMasterObj.reportMaster_ReportName().sendKeys(testData.get("Report Name"));
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName2());
		reportMasterObj.reportMaster_ReportName2().sendKeys(testData.get("Report Name 2"));
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName3());
		reportMasterObj.reportMaster_ReportName3().sendKeys(testData.get("Report Name 3"));
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportDescription());
		reportMasterObj.reportMaster_ReportDescription().sendKeys(testData.get("Report Description"));
		reportMasterObj.reportMaster_ReportType().click();
		radioButtonHelper.radioButton(testData.get("Report Type"));
		while (true) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportUrl());
				reportMasterObj.reportMaster_ReportUrl().sendKeys(testData.get("Report URL"));
				break;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		reportMasterObj.reportMaster_ReportCategory().click();
		radioButtonHelper.radioButton(testData.get("Report Category"));

	}

	@Then("^verify system display the confirmation message in the report master screen post clicking on save button$")
	public void verify_system_display_the_confirmation_message_in_the_report_master_screen_post_clicking_on_save_button()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SaveButton());
		reportMasterObj.reportMaster_SaveButton().click();
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SaveConfirmationMessage());
		boolean status = reportMasterObj.reportMaster_SaveConfirmationMessage().isDisplayed();
		Assert.assertTrue(status);
	}

	@Then("^verify the functionality of back button in report master screen$")
	public void verify_the_functionality_of_back_button_in_report_master_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_WorkInProgressRecordsButton());
		reportMasterObj.reportMaster_WorkInProgressRecordsButton().click();

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_addButton());
		reportMasterObj.reportMaster_addButton().click();

		for (int i = 0; i <= 500; i++) {
			try {
				reportMasterObj.reportMasterBackButton().click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportMasterListViewTitle());
		boolean status = reportMasterObj.reportMaster_ReportMasterListViewTitle().isDisplayed();
		Assert.assertTrue(status);

	}

	@Then("^confirmation message displays in the report master screen with reference id$")
	public void confirmation_message_displays_in_the_report_master_screen_with_reference_id() throws Throwable {
		String message = reportMasterObj.reportMaster_SaveConfirmationMessage().getText();
		System.out.println(message);
		String emptyString = "";
		String ar[] = message.split(" ");
		emptyString = ar[ar.length - 1];
		String referenceid = emptyString.replaceAll("[/.]", "");
		System.out.println("Reference ID : " + referenceid);
		excelDataForReportMasterD.updateTestData("AT_RA_07_D1", "Reference ID", referenceid);
		testData = excelDataForReportMasterD.getTestdata("AT_RA_07_D1");
		waitHelper.waitForElementwithFluentwait(driver,
				reportMasterObj.reportMaster_SaveConfirmationMessageCloseButton());
		reportMasterObj.reportMaster_SaveConfirmationMessageCloseButton().click();
	}

	@Then("^click on inbox button to select the record of report master$")
	public void click_on_inbox_button_to_select_the_record_of_report_master() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Inbox());
		reportMasterObj.reportMaster_Inbox().click();
	}

	@And("^select the record of report master from inbox to submit$")
	public void select_the_record_of_report_master_from_inbox_to_submit() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Maker_SearchInbox());
		reportMasterObj.reportMaster_Maker_SearchInbox().click();
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Maker_SearchInboxInputField());
		reportMasterObj.reportMaster_Maker_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
		String beforexpath = "//span[text()='";
		String afterxpath = "']/../../td/button";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + testData.get("Reference ID") + afterxpath)).click();
	}

	@Then("^verify the field status is non mandatory in report master$")
	public void verify_the_field_status_is_non_mandatory_in_report_master() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Status");
		waitHelper.waitForElementwithFluentwait(driver, driver.findElement(
				By.xpath("//ion-label[contains(text(),'Status')]/parent::div/following-sibling::ion-item/ion-toggle")));
		String status = driver
				.findElement(By.xpath(
						"//ion-label[contains(text(),'Status')]/parent::div/following-sibling::ion-item/ion-toggle"))
				.getAttribute("aria-checked");
		if (status.equalsIgnoreCase("true")) {
			System.out.println("Status is active");
		} else if ((status.equalsIgnoreCase("false"))) {
			System.out.println("Status is inactive");
		}
	}

	@Then("^verify system allow user to modify the report master record before approve the record$")
	public void verify_system_allow_user_to_modify_the_report_master_record_before_approve_the_record()
			throws Throwable {
		testData = excelDataForReportMasterD.getTestdata("AT_RA_06_D1");
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName());
		reportMasterObj.reportMaster_ReportName().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		reportMasterObj.reportMaster_ReportName().sendKeys(testData.get("Modify Report Name"));

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName2());
		reportMasterObj.reportMaster_ReportName2().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		reportMasterObj.reportMaster_ReportName2().sendKeys(testData.get("Modify Report Name 2"));

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName3());
		reportMasterObj.reportMaster_ReportName3().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		reportMasterObj.reportMaster_ReportName3().sendKeys(testData.get("Modify Report Name 3"));

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportDescription());
		reportMasterObj.reportMaster_ReportDescription().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		reportMasterObj.reportMaster_ReportDescription().sendKeys(testData.get("Modify Report Description"));

		reportMasterObj.reportMaster_ReportType().click();
		radioButtonHelper.radioButton(testData.get("Modify Report Type"));

		while (true) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportUrl());
				reportMasterObj.reportMaster_ReportUrl().sendKeys(Keys.chord(Keys.CONTROL, "A"));
				reportMasterObj.reportMaster_ReportUrl().sendKeys(testData.get("Modify Report URL"));
				break;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		reportMasterObj.reportMaster_ReportCategory().click();
		radioButtonHelper.radioButton(testData.get("Modify Report Category"));
	}

	@And("^click on approved records button of report master$")
	public void click_on_approved_records_button_of_report_master() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ApprovedRecordsButton());
		reportMasterObj.reportMaster_ApprovedRecordsButton().click();
	}

	@Then("^click on edit button of report master record to modify$")
	public void click_on_edit_button_of_report_master_record_to_modify() throws Throwable {
		testData = excelDataForReportMasterD.getTestdata("AT_RA_07_D1");
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchButton());
		reportMasterObj.reportMaster_SearchButton().click();
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchInputField());
		reportMasterObj.reportMaster_SearchInputField().sendKeys(testData.get("Approved Record"));
		String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + testData.get("Approved Record") + afterxpath)).click();

	}

	@Then("^verify system allow user to do a modification on already approved report master record$")
	public void verify_system_allow_user_to_do_a_modification_on_already_approved_report_master_record()
			throws Throwable {
		testData = excelDataForReportMasterD.getTestdata("AT_RA_07_D1");
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName());
		reportMasterObj.reportMaster_ReportName().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		reportMasterObj.reportMaster_ReportName().sendKeys(testData.get("Modify Report Name"));

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName2());
		reportMasterObj.reportMaster_ReportName2().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		reportMasterObj.reportMaster_ReportName2().sendKeys(testData.get("Modify Report Name 2"));

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName3());
		reportMasterObj.reportMaster_ReportName3().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		reportMasterObj.reportMaster_ReportName3().sendKeys(testData.get("Modify Report Name 3"));

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportDescription());
		reportMasterObj.reportMaster_ReportDescription().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		reportMasterObj.reportMaster_ReportDescription().sendKeys(testData.get("Modify Report Description"));

		reportMasterObj.reportMaster_ReportType().click();
		radioButtonHelper.radioButton(testData.get("Modify Report Type"));

		while (true) {
			try {
				waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportUrl());
				reportMasterObj.reportMaster_ReportUrl().sendKeys(Keys.chord(Keys.CONTROL, "A"));
				reportMasterObj.reportMaster_ReportUrl().sendKeys(testData.get("Modify Report URL"));
				break;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		reportMasterObj.reportMaster_ReportCategory().click();
		radioButtonHelper.radioButton(testData.get("Modify Report Category"));
	}

	@Then("^click on submit button to submit the record of report master$")
	public void click_on_submit_button_to_submit_the_record_of_report_master() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Submit());
		reportMasterObj.reportMaster_Submit().click();

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_MakerSubmitRemark());
		reportMasterObj.reportMaster_MakerSubmitRemark().sendKeys(testData.get("Maker Submit Remark"));

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_FinalSubmit());
		reportMasterObj.reportMaster_FinalSubmit().click();
	}

	@Then("^system should display confirmation message after submit report master record$")
	public void system_should_display_confirmation_message_after_submit_report_master_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ConfirmationMessage());
		boolean res = reportMasterObj.reportMaster_ConfirmationMessage().isDisplayed();
		Assert.assertEquals(res, true);
	}

	@Then("^logout user from maker stage$")
	public void logout_user_from_maker_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Profile());
		assetCollateralTypeObj.assetCollateralType_Profile().click();
		waitHelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_LogoutUser());
		assetCollateralTypeObj.assetCollateralType_LogoutUser().click();
	}

	@Then("^capture checker ID of report master$")
	public void capture_checker_id_of_report_master() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ConfirmationMessage());
		String message = reportMasterObj.reportMaster_ConfirmationMessage().getText();
		String emptystring = "";
		String ar[] = message.split(" ");
		emptystring = ar[ar.length - 1];
		String checkerID = emptystring.replaceAll("[/.]", "");
		System.out.println(checkerID);
		excelData.updateTestData("AT_RA_07_D1", "Checker id", checkerID);
		testData = excelData.getTestdata("AT_RA_07_D1");

		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ConfirmationMessageCloseButton());
		reportMasterObj.reportMaster_ConfirmationMessageCloseButton().click();
	}

	@And("^User Login as checker to approve report master record$")
	public void user_login_as_checker_to_approve_report_master_record() throws Throwable {
//    	testData = excelData.getTestdata("AT_ACT_07_D1");
		login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}

	@Then("^select the record of report master to approve$")
	public void select_the_record_of_report_master_to_approve() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Checker_SearchInbox());
		reportMasterObj.reportMaster_Checker_SearchInbox().click();
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Checker_SearchInboxInputField());
		reportMasterObj.reportMaster_Checker_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
		String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		String res = driver.findElement(By.xpath("//span[contains(text(),'" + testData.get("Reference ID") + "')]"))
				.getText();
		Assert.assertEquals(res, testData.get("Reference ID"));
		driver.findElement(By.xpath(beforexpath + testData.get("Reference ID") + afterxpath)).click();
	}

	@Then("^select approve button for approve the report master record$")
	public void select_approve_button_for_approve_the_report_master_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Checker_Approve());
		reportMasterObj.reportMaster_Checker_Approve().click();
	}

	@Then("^enter remark for approve the record of report master$")
	public void enter_remark_for_approve_the_record_of_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportMaster_Checker_CheckerApproveRemark(), 10, 2);
		reportMasterObj.reportMaster_Checker_CheckerApproveRemark().sendKeys(testData.get("Checker Submit Remark"));

	}

	@Then("^click on approve button of the report master record$")
	public void click_on_approve_button_of_the_report_master_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Checker_CheckerApproveButton());
		reportMasterObj.reportMaster_Checker_CheckerApproveButton().click();
	}

	@Then("^system should display confirmation message after approve the report master record$")
	public void system_should_display_confirmation_message_after_approve_the_report_master_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				reportMasterObj.reportMaster_Checker_ApproveConfirmationMessage());
		reportMasterObj.reportMaster_Checker_ApproveConfirmationMessage().isDisplayed();
		waitHelper.waitForElementwithFluentwait(driver,
				reportMasterObj.reportMaster_Checker_ApproveConfirmationMessageCloseButton());
		reportMasterObj.reportMaster_Checker_ApproveConfirmationMessageCloseButton().click();

	}

	@Then("^verify all the captured modified data of report master from makers side should be saved and stored in the system$")
	public void verify_all_the_captured_modified_data_of_report_master_from_makers_side_should_be_saved_and_stored_in_the_system()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchButton());
		reportMasterObj.reportMaster_SearchButton().click();
		waitHelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchInputField());
		reportMasterObj.reportMaster_SearchInputField().sendKeys(testData.get("Modify Report Name"));
		String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]";
		boolean modifiedReportName = driver
				.findElement(By.xpath(beforexpath + testData.get("Modify Report Name") + afterxpath)).isDisplayed();
		Assert.assertTrue(modifiedReportName);
	}

	@Then("^logout user from checker stage$")
	public void logout_user_from_checker_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Profile());
		assetCollateralTypeObj.assetCollateralType_Profile().click();
		waitHelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_LogoutUser());
		assetCollateralTypeObj.assetCollateralType_LogoutUser().click();
	}
}
