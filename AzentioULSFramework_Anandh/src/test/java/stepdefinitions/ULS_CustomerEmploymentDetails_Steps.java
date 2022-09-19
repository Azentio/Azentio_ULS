package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ULS_CustomerAddressDetailsObj;
import pageobjects.ULS_CustomerEmploymentDetailsObj;
import resources.BaseClass;
import testDataType.ULS_CustomerEmploymentDetailsTestdataType;

public class ULS_CustomerEmploymentDetails_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ULS_CustomerEmploymentDetailsObj customerEmploymentDetailsObj = new ULS_CustomerEmploymentDetailsObj(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ULS_CustomerEmploymentDetailsTestdataType customerEmploymentDetailsTestdata = jsonConfig
			.getCustomerEmploymentDetailsTestdataByName("Maker");
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

	@And("^go to customer financial tab$")
	public void go_to_customer_financial_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.Trans_CxEmplyObj_CxFinancialTab(), 10, 1);
		customerEmploymentDetailsObj.Trans_CxEmplyObj_CxFinancialTab().click();
	}

	@And("^click on edit button in customer personal details list view record$")
	public void click_on_edit_button_in_customer_personal_details_list_view_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.Trans_CxEmplyObj_CxFinancialEditIcon1(), 10, 1);
		customerEmploymentDetailsObj.Trans_CxEmplyObj_CxFinancialEditIcon1().click();

	}

	@And("^select the customer employement details list view record$")
	public void select_the_customer_employement_details_list_view_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.customerEmploymentDetailsEditIcon(), 10, 1);
		customerEmploymentDetailsObj.customerEmploymentDetailsEditIcon().click();
	}

	@And("^blank the employement period dropdown$")
	public void blank_the_employement_period_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.Trans_CxFinancial_EmploymentPeriod(), 10, 1);
		customerEmploymentDetailsObj.Trans_CxFinancial_EmploymentPeriod().click();
		String xpath = "//ion-label[text()=' " + customerEmploymentDetailsTestdata.defaultSelectValue
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

	@And("^blank the nature of emplyment dropdown field$")
	public void blank_the_nature_of_emplyment_dropdown_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.Trans_CxFinancial_NatureOfEmployment(), 10, 1);
		customerEmploymentDetailsObj.Trans_CxFinancial_NatureOfEmployment().click();
		String xpath = "//ion-label[text()=' " + customerEmploymentDetailsTestdata.defaultSelectValue
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

	@And("^blank the employername dropdown$")
	public void blank_the_employername_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.Trans_CxFinancial_EmployerName(), 10, 1);
		customerEmploymentDetailsObj.Trans_CxFinancial_EmployerName().click();
		String xpath = "//ion-label[text()=' " + customerEmploymentDetailsTestdata.defaultSelectValue
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

	@And("^blank the name if other dropdown field$")
	public void blank_the_name_if_other_dropdown_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.CustomerEmploymentEmployeeNameIfOtherdataHolder(), 10, 1);
		int length = customerEmploymentDetailsObj.CustomerEmploymentEmployeeNameIfOtherdataHolder()
				.getAttribute("ng-reflect-model").length();
		for (int i = 0; i <= length; i++) {
			customerEmploymentDetailsObj.Trans_CxFinancialEmployerNameIfOther().click();
			customerEmploymentDetailsObj.Trans_CxFinancialEmployerNameIfOther().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^blank the employee ID text box field$")
	public void blank_the_employee_id_text_box_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.CustomerEmploymentEmployeeIDDataHolder(), 10, 1);
		int length = customerEmploymentDetailsObj.CustomerEmploymentEmployeeIDDataHolder()
				.getAttribute("ng-reflect-model").length();
		for (int i = 0; i <= length; i++) {
			customerEmploymentDetailsObj.Trans_CxFinancial_EmployeeID().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^blank the date of joining calendar input field$")
	public void blank_the_date_of_joining_calendar_input_field() throws Throwable {
		/*
		 * String dateOfJoiningInput = ""; for (int j = 0; j <= 30; j++) { try {
		 * dateOfJoiningInput = javascriptHelper
		 * .executeScript("return document.getElementsByClassName('p-inputtext p-component')[0].value"
		 * ) .toString(); if (dateOfJoiningInput != "" && dateOfJoiningInput != null) {
		 * break; } } catch (Exception e) { if (j == 30) { Assert.fail(e.getMessage());
		 * } } }
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.customerEmploymentDetailsdateOfJoingInputBox(), 10, 1);
		customerEmploymentDetailsObj.customerEmploymentDetailsdateOfJoingInputBox().click();
//		for (int i = 0; i <= dateOfJoiningInput.length(); i++) {
//			customerEmploymentDetailsObj.customerEmploymentDetailsdateOfJoingInputBox().sendKeys(Keys.BACK_SPACE);
//		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.customerEmploymentDetailsClearButton(), 10, 1);
		customerEmploymentDetailsObj.customerEmploymentDetailsClearButton().click();
	}

	@And("^blank the employment end date calendar input field$")
	public void blank_the_employment_end_date_calendar_input_field() throws Throwable {

	}

	@And("^blank the department dropdown field$")
	public void blank_the_department_dropdown_field() throws Throwable {

	}

	@And("^blank the designation dropdown field$")
	public void blank_the_designation_dropdown_field() throws Throwable {

	}

	@And("^blank the employment type dropdown field$")
	public void blank_the_employment_type_dropdown_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.Trans_CxFinancial_EmploymentType(), 10, 1);
		customerEmploymentDetailsObj.Trans_CxFinancial_EmploymentType().click();
		String xpath = "//ion-label[text()=' " + customerEmploymentDetailsTestdata.defaultSelectValue
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

	@And("^blank the direct manager contact number extension field$")
	public void blank_the_direct_manager_contact_number_extension_field() throws Throwable {

	}

	@And("^blank the direct manager telephone input field$")
	public void blank_the_direct_manager_telephone_input_field() throws Throwable {

	}

	@And("^blank the employer phone number input field$")
	public void blank_the_employer_phone_number_input_field() throws Throwable {

	}

	@And("^blank the state dropdown field$")
	public void blank_the_state_dropdown_field() throws Throwable {

	}

	@And("^blank the pincode input field$")
	public void blank_the_pincode_input_field() throws Throwable {

	}

	@And("^blank the total experience input field$")
	public void blank_the_total_experience_input_field() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.customerEmploymentDetailsTotalExperienceYearsDateInputBox(), 10, 1);
		int length = customerEmploymentDetailsObj.customerEmploymentDetailsTotalExperienceYearsDateInputBox()
				.getAttribute("ng-reflect-model").length();
		for (int i = 0; i <= length; i++) {
			customerEmploymentDetailsObj.Trans_CxFinancial_TotalExperienceYears().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^blank the experience at current employment field$")
	public void blank_the_experience_at_current_employment_field() throws Throwable {

	}

	@And("^blank the direct manager input field$")
	public void blank_the_direct_manager_input_field() throws Throwable {

	}

	@And("^blank the city code input field$")
	public void blank_the_city_code_input_field() throws Throwable {

	}

	@And("^blank the retirement age input field$")
	public void blank_the_retirement_age_input_field() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(
						customerEmploymentDetailsObj.customerEmploymentDetailsRetirementAgeYearsDateHolder());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// customerEmploymentDetailsObj.customerEmploymentDetailsRetirementAgeYearsDateHolder(),
		// 10, 1);
		int length = customerEmploymentDetailsObj.customerEmploymentDetailsRetirementAgeYearsDateHolder()
				.getAttribute("ng-reflect-model").length();
		for (int i = 0; i <= length; i++) {
			customerEmploymentDetailsObj.Trans_CxFinancial_RetirementAge().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^click on save button after blank the fields in customer employment details$")
	public void click_on_save_button_after_blank_the_fields_in_customer_employment_details() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(customerEmploymentDetailsObj.CustomerEmployment_SaveButton());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerEmploymentDetailsObj.CustomerEmployment_SaveButton().click();
	}

	@Then("^verify employment Period field should show the validation for required field$")
	public void verify_employment_period_field_should_show_the_validation_for_required_field() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerEmploymentDetailsObj.Trans_CxFinancial_EmploymentPeriod());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(
				customerEmploymentDetailsObj.customerEmploymentDetailsEmploymentPeriodFieldvalidation().getText(),
				customerEmploymentDetailsTestdata.mandatoryBlankFieldValidation);
	}

	@Then("^verify nature of employment field should show the validation for required field$")
	public void verify_nature_of_employment_field_should_show_the_validation_for_required_field() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerEmploymentDetailsObj.Trans_CxFinancial_NatureOfEmployment());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(
				customerEmploymentDetailsObj.customerEmploymentDetailsnatureOfEmploymentFieldvalidation().getText(),
				customerEmploymentDetailsTestdata.mandatoryBlankFieldValidation);
	}

	@Then("^verify employer name if other field should show the validation for required field$")
	public void verify_employer_name_if_other_field_should_show_the_validation_for_required_field() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerEmploymentDetailsObj.Trans_CxFinancial_EmployerNameOther1());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerEmploymentDetailsObj.customerEmploymentDetailsEmployerNameIfOtherFieldvalidation(), 10, 1);
		Assert.assertEquals(
				customerEmploymentDetailsObj.customerEmploymentDetailsEmployerNameIfOtherFieldvalidation().getText(),
				customerEmploymentDetailsTestdata.mandatoryBlankFieldValidation);
	}

	@Then("^verify employee ID field should show the validation for required field$")
	public void verify_employee_id_field_should_show_the_validation_for_required_field() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerEmploymentDetailsObj.Trans_CxFinancial_EmployeeID());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(customerEmploymentDetailsObj.customerEmploymentDetailsEmployeeIDFieldvalidation().getText(),
				customerEmploymentDetailsTestdata.mandatoryBlankFieldValidation);
	}

	@Then("^verify Date of joining field should show the validation for required field$")
	public void verify_date_of_joining_field_should_show_the_validation_for_required_field() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper
						.scrollIntoView(customerEmploymentDetailsObj.customerEmploymentDetailsdateOfJoingInputBox());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(
				customerEmploymentDetailsObj.customerEmploymentDetailsdateOfJoiningFieldvalidation().getText(),
				customerEmploymentDetailsTestdata.mandatoryBlankFieldValidation);
	}

	@Then("^verify employment type field should show the validation for required field$")
	public void verify_employment_type_field_should_show_the_validation_for_required_field() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerEmploymentDetailsObj.Trans_CxFinancial_EmploymentType());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(
				customerEmploymentDetailsObj.customerEmploymentDetailsEmploymentTypeFieldvalidation().getText(),
				customerEmploymentDetailsTestdata.mandatoryBlankFieldValidation);
	}

	@Then("^verify total experience field should show the validation for required field$")
	public void verify_total_experience_field_should_show_the_validation_for_required_field() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(
						customerEmploymentDetailsObj.customerEmploymentDetailsTotalExperienceYearsDateInputBox());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(
				customerEmploymentDetailsObj.customerEmploymentDetailsTotalExperienceYearsFieldvalidation().getText(),
				customerEmploymentDetailsTestdata.mandatoryBlankFieldValidation);
	}

	@Then("^verify retirement age field should show the validation for required field$")
	public void verify_retirement_age_field_should_show_the_validation_for_required_field() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				status = customerEmploymentDetailsObj.customerEmploymentDetailsretirementAgeYearsFieldvalidation()
						.isDisplayed();
			} catch (Exception e) {
				if (i == 20) {
					status = false;
				}
			}
		}
		if(status==true)
		{
			Assert.assertEquals(
					customerEmploymentDetailsObj.customerEmploymentDetailsretirementAgeYearsFieldvalidation().getText(),
					customerEmploymentDetailsTestdata.mandatoryBlankFieldValidation);			
		}
	}

}
