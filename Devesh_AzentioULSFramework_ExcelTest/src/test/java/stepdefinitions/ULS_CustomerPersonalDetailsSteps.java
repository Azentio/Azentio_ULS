package stepdefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.KULS_CommonWebElements;
import pageobjects.ULSTransaction_CustomerPersonalDetailsObj;
import resources.BaseClass;
import testDataType.KULS_Login_TestDataType;

public class ULS_CustomerPersonalDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginTestData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper waitHelper = new WaitHelper(driver);
	ULSTransaction_CustomerPersonalDetailsObj customerPersonalDetailsObj = new ULSTransaction_CustomerPersonalDetailsObj(
			driver);
//	CustomerPerssonalDetailsTestData customerPersonalDetailsTestData = jsonConfig
//			.getCustomerPersonalDetailsTestDataByName("Maker");
	KULS_CommonWebElements commonElement = new KULS_CommonWebElements(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> testData = new HashMap<>();
	
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","CustomerPersonalDetailsTestData","Data Set ID");
	String dataSetID;

//	@Given("^navigate to uls application$")
//	public void navigate_to_uls_application() throws Throwable {
//		driver.get(configFileReader.getULSApplicationCenBankUrl());
//	}

	@And("^login with maker credentials$")
	public void login_with_maker_credentials() throws Throwable {
		kulsLogin.loginUlsApplicationAsMaker(kulsLoginTestData.Username, kulsLoginTestData.Password);
	}

	@And("^click on mail box icon$")
	public void click_on_mail_box_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsMailBox(), 20, 1);
		commonElement.ulsMailBox().click();
	}

	@And("^select the application record$")
	public void select_the_application_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsNotificationSerachButton(), 10, 1);
		commonElement.ulsNotificationSerachButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsNotificationSearchTextBox(), 10, 1);
		clicksAndActionsHelper.moveToElement(commonElement.ulsNotificationSearchTextBox());
		clicksAndActionsHelper.clickUsingActionClass(commonElement.ulsNotificationSearchTextBox(),
				commonElement.ulsNotificationSearchTextBox());
		commonElement.ulsNotificationSearchTextBox().sendKeys(testData.get("Stage Code"));
		Thread.sleep(500);
		;
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsNotificationFirstRecord(), 10, 1);
		commonElement.ulsNotificationFirstRecord().click();
	}

	@And("^click on customer details record$")
	public void click_on_customer_details_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerPersonalDetailsObj.ulsCustomerDetailsTab(), 20,
				1);
		customerPersonalDetailsObj.ulsCustomerDetailsTab().click();
	}

	@And("^click on add button to add the customer personal detail record$")
	public void click_on_add_button_to_add_the_customer_personal_detail_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsNotificationAddButton(), 120, 1);
		commonElement.ulsNotificationAddButton().click();
	}

	@And("^search the customer for individual customer$")
	public void search_the_customer_for_individual_customer() throws Throwable {

	}

	@And("^choose customer for individual$")
	public void choose_customer_for_individual() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsCustomerTypeDropDown(), 20, 1);
		customerPersonalDetailsObj.customerDetailsCustomerTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + testData.get("Customer Type")
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

	@And("^enter the CIF ID$")
	public void enter_the_cif_id() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsCIfInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsCIfInputBox().click();
		customerPersonalDetailsObj.customerDetailsCIfInputBox().sendKeys(testData.get("CIF ID"));

	}

	@And("^enter the applicantion number$")
	public void enter_the_applicantion_number() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsApplicationNumberInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsApplicationNumberInputBox().click();
		customerPersonalDetailsObj.customerDetailsApplicationNumberInputBox()
				.sendKeys(testData.get("Application Number"));
	}

	@And("^enter customer name$")
	public void enter_customer_name() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsCustomerNameInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsCustomerNameInputBox().click();
		customerPersonalDetailsObj.customerDetailsCustomerNameInputBox()
				.sendKeys(testData.get("Customer Name"));
	}

	@And("^choose the ID type$")
	public void choose_the_id_type() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsIDTypeDropDown(), 20, 1);
		customerPersonalDetailsObj.customerDetailsIDTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + testData.get("ID Type")
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

	@And("^give date of birth of the employee$")
	public void give_date_of_birth_of_the_employee() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsDateOfBirthInputCalendar(), 20, 1);
		customerPersonalDetailsObj.customerDetailsDateOfBirthInputCalendar().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsYearSelection(), 20, 1);
		customerPersonalDetailsObj.customerDetailsYearSelection().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerPersonalDetailsObj.calendarFirstYear(), 20, 1);

		while (true) {
			try {
				driver.findElement(By.xpath("//span[text()=' " + testData.get("DOB Year") + " ']"))
						.isDisplayed();
				driver.findElement(By.xpath("//span[text()=' " + testData.get("DOB Year") + " ']"))
						.click();
				break;
			} catch (Exception e) {
				customerPersonalDetailsObj.calendarPreviousButton().click();
			}
		}

		for (int i = 0; i <= 15; i++) {
			try {
				driver.findElement(By.xpath("//span[text()=' " + testData.get("DOB Month") + " ']"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}

		List<WebElement> dayElement = driver
				.findElements(By.xpath("//span[text()='" + testData.get("DOB Day") + "']"));
		for (WebElement element : dayElement) {
			try {
				clicksAndActionsHelper.moveToElement(element);
				clicksAndActionsHelper.doubleClick(element);
				element.click();
				break;
			} catch (ElementClickInterceptedException e) {

			}
		}

	}

	@And("^enter email Id$")
	public void enter_email_id() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsEmailIDInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsEmailIDInputBox().click();
		customerPersonalDetailsObj.customerDetailsEmailIDInputBox().sendKeys(testData.get("Email ID"));
	}

	@And("^enter id number in id type field$")
	public void enter_id_number_in_id_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsIDNumberInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsIDNumberInputBox().click();
		customerPersonalDetailsObj.customerDetailsIDNumberInputBox().sendKeys(testData.get("ID Number"));
	}

	@And("^enter mobile number field$")
	public void enter_mobile_number_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsMobileNumberInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsMobileNumberInputBox().click();
		customerPersonalDetailsObj.customerDetailsMobileNumberInputBox()
				.sendKeys(testData.get("Mobile Number"));
	}

	@And("^click on search button to search the customer$")
	public void click_on_search_button_to_search_the_customer() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsSearchButton(), 20, 1);
		commonElement.ulsSearchButton().click();
	}

	@And("^click oncreate new request button$")
	public void click_oncreate_new_request_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsCreateNewRequestButton(), 20, 1);
		commonElement.ulsCreateNewRequestButton().click();
	}


	@And("^click on save button before enter the mandatory field$")
	public void click_on_save_button_before_enter_the_mandatory_field() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// commonElement.ulsSaveButton(), 20, 1);
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(commonElement.ulsSaveButton());
				commonElement.ulsSaveButton().click();
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^set maritail status fild as blank field$")
	public void set_maritail_status_fild_as_blank_field() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// customerPersonalDetailsObj.customerPersonalDetailsMaritalStatusDropDown(),
		// 30, 1);
		for (int j = 0; j <= 30; j++) {
			try {
				javascriptHelper
						.scrollIntoView(customerPersonalDetailsObj.customerPersonalDetailsMaritalStatusDropDown());
				customerPersonalDetailsObj.customerPersonalDetailsMaritalStatusDropDown().click();
				break;
			} catch (Exception e) {
				if (j == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String xpath = "//ion-label[text()=' " + testData.get("DefaultSelectValue")
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

	@And("^set nationality field as blank field$")
	public void set_nationality_field_as_blank_field() throws Throwable {
		for (int j = 0; j <= 30; j++) {
			try {
				javascriptHelper
						.scrollIntoView(customerPersonalDetailsObj.customerPersonalDetailsNationalityDropDown());
				customerPersonalDetailsObj.customerPersonalDetailsNationalityDropDown().click();
				break;
			} catch (Exception e) {
				if (j == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String xpath = "//ion-label[text()=' " + testData.get("DefaultSelectValue")
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

	@Then("^verify customertype field should show the blank field validation message$")
	public void verify_customertype_field_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsCustomerTypeFieldValidation(), 20, 1);

		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsCustomerTypeFieldValidation().getText());
	}

	@Then("^verify applicant type field should show the blank field validation message$")
	public void verify_applicant_type_field_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsApplicantTypeFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsApplicantTypeFieldValidation().getText());
	}

	@Then("^verify salutation field should show the blank field validation message$")
	public void verify_salutation_field_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsSalutationValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsSalutationValidation().getText());
	}

	@Then("^verify first name should show the blank field validation message$")
	public void verify_first_name_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsSalutationValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsSalutationValidation().getText());
	}

	@Then("^verify last name should show the blank field validation message$")
	public void verify_last_name_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation().getText());
	}

	@Then("^verify date of birth should show the blank field validation message$")
	public void verify_date_of_birth_should_show_the_blank_field_validation_message() throws Throwable {
		javascriptHelper.scrollIntoView(customerPersonalDetailsObj.customerPersonalDetailsDateOfBirthFieldValidation());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsDateOfBirthFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsDateOfBirthFieldValidation().getText());
	}

	@Then("^verify gender should show the blank field validation message$")
	public void verify_gender_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsGenderFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsGenderFieldValidation().getText());
	}

	@Then("^verify educational level should show the blank field validation message$")
	public void verify_educational_level_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsEducationLevelFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsEducationLevelFieldValidation().getText());
	}

	@Then("^verify Marital status should show the blank field validation message$")
	public void verify_marital_status_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMaritalStatusFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsMaritalStatusFieldValidation().getText());
	}

	@Then("^verify nationality should show the blank field validation message$")
	public void verify_nationality_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsNationalityFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsNationalityFieldValidation().getText());
	}

	@Then("^verify residencial status should show the blank field validation message$")
	public void verify_residencial_status_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsResidentialStatusFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsResidentialStatusFieldValidation().getText());
	}

	@Then("^verify language should show the blank field validation message$")
	public void verify_language_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsLanguageFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsLanguageFieldValidation().getText());
	}

	@Then("^verify no of dependents should show the blank field validation message$")
	public void verify_no_of_dependents_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.noOfDependetntsFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.noOfDependetntsFieldValidation().getText());
	}

	@Then("^verify Mothers maiden name should show the blank field validation message$")
	public void verify_mothers_maiden_name_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameFieldValidation().getText());
	}

	@Then("^verify type of residence should show the blank field validation message$")
	public void verify_type_of_residence_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsTypeOfResidenceFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsTypeOfResidenceFieldValidation().getText());
	}

	@Then("^verify category of client should show the blank field validation message$")
	public void verify_category_of_client_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsCategoryOfClientFieldValidation(), 20, 1);
		Assert.assertEquals(testData.get("BlankInputValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsCategoryOfClientFieldValidation().getText());
	}

	@Then("^verify first name field should not allow numeric values$")
	public void verify_first_name_field_should_not_allow_numeric_values() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper
						.scrollIntoViewAndClick(customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox()
				.sendKeys(testData.get("NumericIInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation().getText();
		Assert.assertEquals(testData.get("NumericSpecialCharecterValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation().getText());

	}

	@Then("^verify first name field should not allow special charecters$")
	public void verify_first_name_field_should_not_allow_special_charecters() throws Throwable {
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox().clear();
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox()
				.sendKeys(testData.get("SpecialCharacterInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation().getText();
		Assert.assertEquals(testData.get("NumericSpecialCharecterValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation().getText());
	}

	@Then("^verify last name field should not allow numeric values$")
	public void verify_last_name_field_should_not_allow_numeric_values() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper
						.scrollIntoViewAndClick(customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox()
				.sendKeys(testData.get("NumericIInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation().getText();
		Assert.assertEquals(testData.get("NumericSpecialCharecterValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation().getText());
	}

	@Then("^verify last name field should not allow special charecters$")
	public void verify_last_name_field_should_not_allow_special_charecters() throws Throwable {
		customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox().clear();
		customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox()
				.sendKeys(testData.get("SpecialCharacterInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation().getText();
		Assert.assertEquals(testData.get("NumericSpecialCharecterValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation().getText());
	}

	@Then("^verify no of dependents field should not allow to enter numeric values$")
	public void verify_no_of_dependents_field_should_not_allow_to_enter_numeric_values() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(
						customerPersonalDetailsObj.customerPersonalDetailsNoOfDependentsInputBox());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerPersonalDetailsObj.customerPersonalDetailsNoOfDependentsInputBox()
				.sendKeys(testData.get("alphaNumericInput"));
		String aplphaNumericInput = customerPersonalDetailsObj.customerPersonalDetailsNoOfDependentsDataHolder()
				.getText();
		char[] charArray = aplphaNumericInput.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isAlphabetic(charArray[i])) {
				Assert.fail("no of dependents field allow plphabets");
			}
		}

	}

	@Then("^verify user can not enter negative input$")
	public void verify_user_can_not_enter_negative_input() throws Throwable {
		customerPersonalDetailsObj.customerPersonalDetailsNoOfDependentsInputBox().clear();
		customerPersonalDetailsObj.customerPersonalDetailsNoOfDependentsInputBox()
				.sendKeys(testData.get("negativeInput"));

		Assert.assertEquals(testData.get("negativeInputValidation"),
				customerPersonalDetailsObj.noOfDependetntsFieldValidation().getText());
	}

	@Then("^verify mothers maiden name field should not allow numeric values$")
	public void verify_mothers_maiden_name_field_should_not_allow_numeric_values() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox()
				.sendKeys(testData.get("NumericIInput"));
		Assert.assertEquals(testData.get("NumericSpecialCharecterValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameFieldValidation().getText());
	}

	@Then("^verify mothers maiden name field should not allow special charecters$")
	public void verify_mothers_maiden_name_field_should_not_allow_special_charecters() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox().clear();
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox()
				.sendKeys(testData.get("SpecialCharacterInput"));
		Assert.assertEquals(testData.get("NumericSpecialCharecterValidation"),
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameFieldValidation().getText());
	}


	@Then("^verify CIF ID field is available in screen and field should be read only mode$")
	public void verify_cif_id_field_is_available_in_screen_and_field_should_be_read_only_mode() throws Throwable {
		boolean status = true;
		try {
			waitHelper.waitForElementToVisibleWithFluentWait(driver,
					customerPersonalDetailsObj.customerDetailsCIFIDListView(), 5, 1);
			customerPersonalDetailsObj.customerDetailsCIFIDListView().click();
		} catch (Exception e) {
			status = false;
		}
		Assert.assertFalse(" CIF Field is editable one ", status);

	}

	@Then("^verify first name field is available in screen and field should be read only mode$")
	public void verify_first_name_field_is_available_in_screen_and_field_should_be_read_only_mode() throws Throwable {
		boolean status = true;
		try {
			waitHelper.waitForElementToVisibleWithFluentWait(driver,
					customerPersonalDetailsObj.customerDetailsFirstnameListView(), 5, 1);
			customerPersonalDetailsObj.customerDetailsFirstnameListView().click();
		} catch (Exception e) {
			System.out.println(" Fied is read only mode ");
			status = false;
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerPersonalDetailsObj.customerDetailsFirstnameListView(), 10, 1);
		Assert.assertEquals(customerPersonalDetailsObj.customerDetailsFirstnameListView().getText(),
				testData.get("firstName"));
	}

	@Then("^verify middle name field is available in screen and field should be read only mode$")
	public void verify_middle_name_field_is_available_in_screen_and_field_should_be_read_only_mode() throws Throwable {
		boolean status = true;
		try {
			waitHelper.waitForElementToVisibleWithFluentWait(driver,
					customerPersonalDetailsObj.customerDetailsMiddlenameListView(), 5, 1);
			customerPersonalDetailsObj.customerDetailsMiddlenameListView().click();
		} catch (Exception e) {
			System.out.println(" Fied is read only mode ");
			status = false;
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerPersonalDetailsObj.customerDetailsMiddlenameListView(), 10, 1);
		Assert.assertEquals(customerPersonalDetailsObj.customerDetailsMiddlenameListView().getText(),
				testData.get("middleName"));
	}

	@Then("^select data set ID for Customer personal details testcase002$")
	public void select_data_set_id_for_customer_personal_details_testcase002() throws Throwable {
		dataSetID = "AT_CEL_002_D1";
        testData = excelData.getTestdata(dataSetID);
	}


}
