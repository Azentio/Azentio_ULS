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
import pageobjects.ULS_ReportMasterObj;
import resources.BaseClass;
import testDataType.ULS_ReportMasterTestData;

public class ULS_ReportMasterSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ULS_ReportMasterObj reportMasterObj = new ULS_ReportMasterObj(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ULS_ReportMasterTestData reportMasterTestData = jsonConfig.getReportMasterTestDataByName("Maker");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

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

	@And("^click on save button inreport master without filling the details$")
	public void click_on_save_button_inreport_master_without_filling_the_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.Report_Master_Save(), 10, 1);
		reportMasterObj.Report_Master_Save().click();
	}

	@Then("^verify system should through the validation for the empty fields$")
	public void verify_system_should_through_the_validation_for_the_empty_fields() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportNameValidation(),
				10, 1);// Required field
		Assert.assertEquals(reportMasterObj.remportMasterReportNameValidation().getText(), "Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName2Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName2Validation().getText(), "Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName3Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName3Validation().getText(), "Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterDescriptionValidation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterDescriptionValidation().getText(), "Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportTypeValidation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportTypeValidation().getText(), "Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportUrlValidation(), 10,
				1);
		Assert.assertEquals(reportMasterObj.remportMasterReportUrlValidation().getText(), "Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.remportMasterReportCategoryValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportCategoryValidation().getText(), "Required field");
	}

	@And("^enter special charecters in text box$")
	public void enter_special_charecters_in_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportName(), 10, 1);
		reportMasterObj.reportName().sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportName2(), 10, 1);
		reportMasterObj.reportName2().sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportName3(), 10, 1);
		reportMasterObj.reportName3().sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportDescription(), 10, 1);
		reportMasterObj.reportDescription().sendKeys(reportMasterTestData.SpecialCharacterInput);
	}

	@Then("^verify system should through the validation for report master$")
	public void verify_system_should_through_the_validation_for_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportNameValidation(),
				10, 1);// Required field
		Assert.assertEquals(reportMasterObj.remportMasterReportNameValidation().getText(),
				"Alphanumeric characters allowed");

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName2Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName2Validation().getText(),
				"Alphanumeric characters allowed");

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterReportName3Validation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterReportName3Validation().getText(),
				"Alphanumeric characters allowed");

		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.remportMasterDescriptionValidation(),
				10, 1);
		Assert.assertEquals(reportMasterObj.remportMasterDescriptionValidation().getText(),
				"Alphanumeric characters allowed");
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
				"Required field");
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParameter1FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParameter1FieldValidation().getText(),
				"Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description1FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam1Description1FieldValidation().getText(),
				"Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description2FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam1Description2FieldValidation().getText(),
				"Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description3FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam1Description3FieldValidation().getText(),
				"Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParameter2FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParameter2FieldValidation().getText(),
				"Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description2FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam2Description2FieldValidation().getText(),
				"Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description3FieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsParam2Description3FieldValidation().getText(),
				"Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsSequenceNoFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsSequenceNoFieldValidation().getText(),
				"Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsDateFormatFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsDateFormatFieldValidation().getText(),
				"Required field");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsNullableValuesFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsNullableValuesFieldValidation().getText(),
				"Required field");

	}

	@And("^enter characters in numeric field in report parameter details$")
	public void enter_characters_in_numeric_field_in_report_parameter_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsSequenceNoTextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsSequenceNoTextBox().click();
		reportMasterObj.reportParameterDetailsSequenceNoTextBox().sendKeys(reportMasterTestData.CharecterInputs);

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
		reportMasterObj.reportParameterDetailsParameter1TextBox().sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description1(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description1().sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description2TextBox()
				.sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description3TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description3TextBox()
				.sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParameter2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParameter2TextBox().sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam2Description2TextBox()
				.sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description3TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam2Description3TextBox()
				.sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsDateFormatTextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsDateFormatTextBox().sendKeys(reportMasterTestData.SpecialCharacterInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsNullableValuesTextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsNullableValuesTextBox()
				.sendKeys(reportMasterTestData.SpecialCharacterInput);
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
				reportMasterTestData.SpecialCharecterValidationMessage);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsDateFormatFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsDateFormatFieldValidation().getText(),
				reportMasterTestData.SpecialCharecterValidationMessage);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsNullableValuesFieldValidation(), 10, 1);
		Assert.assertEquals(reportMasterObj.reportParameterDetailsNullableValuesFieldValidation().getText(),
				reportMasterTestData.SpecialCharecterValidationMessage);
	}

	@And("^click on template field and select the data from the drop down$")
	public void click_on_template_field_and_select_the_data_from_the_drop_down() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsTemplateDropDown(), 10, 1);
		reportMasterObj.reportParameterDetailsTemplateDropDown().click();

		String xpath = "//ion-label[text()=' " + reportMasterTestData.TemplateIDInput
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

		String xpath = "//ion-label[text()=' " + reportMasterTestData.isMandatory + " ']/parent::ion-item/ion-radio";
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
		reportMasterObj.reportParameterDetailsParameter1TextBox().sendKeys(reportMasterTestData.NumericInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description1(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description1().clear();
		reportMasterObj.reportParameterDetailsParam1Description1().sendKeys(reportMasterTestData.NumericInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description2TextBox().clear();
		reportMasterObj.reportParameterDetailsParam1Description2TextBox().sendKeys(reportMasterTestData.NumericInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam1Description3TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam1Description3TextBox().clear();
		reportMasterObj.reportParameterDetailsParam1Description3TextBox().sendKeys(reportMasterTestData.NumericInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParameter2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParameter2TextBox().clear();
		reportMasterObj.reportParameterDetailsParameter2TextBox().sendKeys(reportMasterTestData.NumericInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description2TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam2Description2TextBox().clear();
		reportMasterObj.reportParameterDetailsParam2Description2TextBox().sendKeys(reportMasterTestData.NumericInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsParam2Description3TextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsParam2Description3TextBox().clear();
		reportMasterObj.reportParameterDetailsParam2Description3TextBox().sendKeys(reportMasterTestData.NumericInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsDateFormatTextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsDateFormatTextBox().clear();
		reportMasterObj.reportParameterDetailsDateFormatTextBox().sendKeys(reportMasterTestData.NumericInput);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				reportMasterObj.reportParameterDetailsNullableValuesTextBox(), 10, 1);
		reportMasterObj.reportParameterDetailsNullableValuesTextBox().clear();
		reportMasterObj.reportParameterDetailsNullableValuesTextBox().sendKeys(reportMasterTestData.NumericInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportParameterDetailsReportParameterDetailsSaveButton(), 10, 1);
		reportMasterObj.reportParameterDetailsReportParameterDetailsSaveButton().click();
	}

	@Then("^verify system should not allow user to save the parameter details record$")
	public void verify_system_should_not_allow_user_to_save_the_parameter_details_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.toastAlert(), 30, 1);
		Assert.assertFalse(reportMasterObj.toastAlert().isDisplayed());
	}
}
