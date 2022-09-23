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
import testDataType.TransactionScreenTestDataType;

public class ULS_CustomerPersonalDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginTestData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper waitHelper = new WaitHelper(driver);
	ULSTransaction_CustomerPersonalDetailsObj customerPersonalDetailsObj = new ULSTransaction_CustomerPersonalDetailsObj(
			driver);
	TransactionScreenTestDataType customerPersonalDetailsTestData = jsonConfig
			.getTransactionScreenListByName("Maker");
	KULS_CommonWebElements commonElement = new KULS_CommonWebElements(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	Map<String, String> testData = new HashMap<>();

	@Given("^navigate to uls application$")
	public void navigate_to_uls_application() throws Throwable {
		driver.get(configFileReader.getApplicationUrlTransactions());
	}

	@And("^login with maker credentials$")
	public void login_with_maker_credentials() throws Throwable {
		kulsLogin.loginUlsApplicationAsMaker(kulsLoginTestData.Username2, kulsLoginTestData.Password);
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
		commonElement.ulsNotificationSearchTextBox().sendKeys(customerPersonalDetailsTestData.applicationEventCode);
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
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.CustomerType
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
		customerPersonalDetailsObj.customerDetailsCIfInputBox().sendKeys(customerPersonalDetailsTestData.CIFID);

	}

	@And("^enter the applicantion number$")
	public void enter_the_applicantion_number() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsApplicationNumberInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsApplicationNumberInputBox().click();
		customerPersonalDetailsObj.customerDetailsApplicationNumberInputBox()
				.sendKeys(customerPersonalDetailsTestData.ApplicationNumber);
	}

	@And("^enter customer name$")
	public void enter_customer_name() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsCustomerNameInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsCustomerNameInputBox().click();
		customerPersonalDetailsObj.customerDetailsCustomerNameInputBox()
				.sendKeys(customerPersonalDetailsTestData.CustomerName);
	}

	@And("^choose the ID type$")
	public void choose_the_id_type() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsIDTypeDropDown(), 20, 1);
		customerPersonalDetailsObj.customerDetailsIDTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.IDType
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
				driver.findElement(By.xpath("//span[text()=' " + customerPersonalDetailsTestData.DOBYear + " ']"))
						.isDisplayed();
				driver.findElement(By.xpath("//span[text()=' " + customerPersonalDetailsTestData.DOBYear + " ']"))
						.click();
				break;
			} catch (Exception e) {
				customerPersonalDetailsObj.calendarPreviousButton().click();
			}
		}

		for (int i = 0; i <= 15; i++) {
			try {
				driver.findElement(By.xpath("//span[text()=' " + customerPersonalDetailsTestData.DOBMonth + " ']"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}

		List<WebElement> dayElement = driver
				.findElements(By.xpath("//span[text()='" + customerPersonalDetailsTestData.DOBDay + "']"));
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
		customerPersonalDetailsObj.customerDetailsEmailIDInputBox().sendKeys(customerPersonalDetailsTestData.EmailID);
	}

	@And("^enter id number in id type field$")
	public void enter_id_number_in_id_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsIDNumberInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsIDNumberInputBox().click();
		customerPersonalDetailsObj.customerDetailsIDNumberInputBox().sendKeys(customerPersonalDetailsTestData.IDNumber);
	}

	@And("^enter mobile number field$")
	public void enter_mobile_number_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsMobileNumberInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsMobileNumberInputBox().click();
		customerPersonalDetailsObj.customerDetailsMobileNumberInputBox()
				.sendKeys(customerPersonalDetailsTestData.MobileNumber);
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

	@And("^choose customer type as individual customer$")
	public void choose_customer_type_as_individual_customer() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsCustomerTypeDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsCustomerTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.CustomerType
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

	@And("^Applicant type field should br dropdown and user can able to select the data from the dropdown$")
	public void applicant_type_field_should_br_dropdown_and_user_can_able_to_select_the_data_from_the_dropdown()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsApplicantTypeDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsApplicantTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.ApplicantType
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

	@And("^salutation field should be dropdown and user can able to select the data  from the slutation dropdown$")
	public void salutation_field_should_be_dropdown_and_user_can_able_to_select_the_data_from_the_slutation_dropdown()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsSalutationDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsSalutationDropDown().click();
		Assert.assertEquals(customerPersonalDetailsTestData.dropdownAttribute,
				customerPersonalDetailsObj.customerPersonalDetailsSalutationDropDown().getAttribute("aria-haspopup"));
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.Salutation
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

	@And("^first name field should be text box and user can able to enter the data into the input box$")
	public void first_name_field_should_be_text_box_and_user_can_able_to_enter_the_data_into_the_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox().getAttribute("type");
		Assert.assertEquals(customerPersonalDetailsTestData.textBoxAttribute,
				customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox().getAttribute("type"));
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox()
				.sendKeys(customerPersonalDetailsTestData.FirstName);
	}

	@And("^middle name field should be text box and user can able to enter the data into the input box$")
	public void middle_name_field_should_be_text_box_and_user_can_able_to_enter_the_data_into_the_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMiddleNameInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsMiddleNameInputBox().getAttribute("type");
		Assert.assertEquals(customerPersonalDetailsTestData.textBoxAttribute,
				customerPersonalDetailsObj.customerPersonalDetailsMiddleNameInputBox().getAttribute("type"));
		customerPersonalDetailsObj.customerPersonalDetailsMiddleNameInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsMiddleNameInputBox()
				.sendKeys(customerPersonalDetailsTestData.MiddleName);
	}

	@And("^last name field should be text box and user can able to enter the data into the input box$")
	public void last_name_field_should_be_text_box_and_user_can_able_to_enter_the_data_into_the_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox().getAttribute("type");
		Assert.assertEquals(customerPersonalDetailsTestData.textBoxAttribute,
				customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox().getAttribute("type"));
		customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox()
				.sendKeys(customerPersonalDetailsTestData.LastName);
	}

	@And("^date of birth field should be date and user can able to give dte oof birth into it$")
	public void date_of_birth_field_should_be_date_and_user_can_able_to_give_dte_oof_birth_into_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsDateOfBirthInputCalendar(), 20, 1);
		customerPersonalDetailsObj.customerDetailsDateOfBirthInputCalendar().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsYearSelection(), 20, 1);
		customerPersonalDetailsObj.customerDetailsYearSelection().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerPersonalDetailsObj.calendarFirstYear(), 20, 1);

		while (true) {
			try {
				driver.findElement(By.xpath("//span[text()=' " + customerPersonalDetailsTestData.DOBYear + " ']"))
						.isDisplayed();
				driver.findElement(By.xpath("//span[text()=' " + customerPersonalDetailsTestData.DOBYear + " ']"))
						.click();
				break;
			} catch (Exception e) {
				customerPersonalDetailsObj.calendarPreviousButton().click();
			}
		}

		for (int i = 0; i <= 15; i++) {
			try {
				driver.findElement(By.xpath("//span[text()=' " + customerPersonalDetailsTestData.DOBMonth + " ']"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}

		List<WebElement> dayElement = driver
				.findElements(By.xpath("//span[text()='" + customerPersonalDetailsTestData.DOBDay + "']"));
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

	@And("^gender field should be dropdown and user can able to select the data from the dropdown$")
	public void gender_field_should_be_dropdown_and_user_can_able_to_select_the_data_from_the_dropdown()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsGenderDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsGenderDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.gender
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

	@And("^education level field should be lookup and user can able to select the data from the dropdown$")
	public void education_level_field_should_be_lookup_and_user_can_able_to_select_the_data_from_the_dropdown()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsEducationLevelDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsEducationLevelDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.educationlevel
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

	@And("^marital status field should be dropdown and user can able to sleect the data from the dropdown$")
	public void marital_status_field_should_be_dropdown_and_user_can_able_to_sleect_the_data_from_the_dropdown()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMaritalStatusDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsMaritalStatusDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.maritalstatus
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

	@And("^nationality field should be lookup and user can able to select the data from the nationality field$")
	public void nationality_field_should_be_lookup_and_user_can_able_to_select_the_data_from_the_nationality_field()
			throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsNationalityDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsNationalityDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.nationality
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

	@And("^ethnicity field should be lookup and user can able to select the data from the ethnicity field$")
	public void ethnicity_field_should_be_lookup_and_user_can_able_to_select_the_data_from_the_ethnicity_field()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsEthinicityDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsEthinicityDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.ethnicity
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

	@And("^residential status field should be lookup and user can able o select the data from residential status$")
	public void residential_status_field_should_be_lookup_and_user_can_able_o_select_the_data_from_residential_status()
			throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver,
//				customerPersonalDetailsObj.customerPersonalDetailsResidentialStatusDropDown(), 20, 1);
		for (int i = 0; i <= 40; i++) {
			try {
				javascriptHelper
						.scrollIntoView(customerPersonalDetailsObj.customerPersonalDetailsResidentialStatusDropDown());
				customerPersonalDetailsObj.customerPersonalDetailsResidentialStatusDropDown().click();
				break;
			} catch (Exception e) {
				if (i == 40) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.residentialstatus
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

	@And("^language field should be lookup and user can able to select the data from the language field$")
	public void language_field_should_be_lookup_and_user_can_able_to_select_the_data_from_the_language_field()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsLanguageDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsLanguageDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.language
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

	@And("^no of dependents field should bro textbox and user can able to enter the data into it$")
	public void no_of_dependents_field_should_bro_textbox_and_user_can_able_to_enter_the_data_into_it()
			throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsNoOfDependentsInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsNoOfDependentsInputBox().getAttribute("type");
		Assert.assertEquals(customerPersonalDetailsTestData.numericcBoxAttribute,
				customerPersonalDetailsObj.customerPersonalDetailsNoOfDependentsInputBox().getAttribute("type"));
		customerPersonalDetailsObj.customerPersonalDetailsNoOfDependentsInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsNoOfDependentsInputBox()
				.sendKeys(customerPersonalDetailsTestData.noofDependents);
	}

	@And("^mother maiden name field should be textbox and user can able to pass the data into the input box$")
	public void mother_maiden_name_field_should_be_textbox_and_user_can_able_to_pass_the_data_into_the_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox().getAttribute("type");
		Assert.assertEquals(customerPersonalDetailsTestData.textBoxAttribute,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox().getAttribute("type"));
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox()
				.sendKeys(customerPersonalDetailsTestData.motherMaidenName);
	}

	@And("^Type of Residence field should be lookup and user can able to select the data from the type of r̥esidence field$")
	public void type_of_residence_field_should_be_lookup_and_user_can_able_to_select_the_data_from_the_type_of_residence_field()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsTypeOfResidenceDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsTypeOfResidenceDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.typeOfResidence
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

	@And("^Category of Client field should be lookup and user can able to select the data from the Category of Client field$")
	public void category_of_client_field_should_be_lookup_and_user_can_able_to_select_the_data_from_the_category_of_client_field()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsCategoryOfClientDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsCategoryOfClientDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.CategoryOfClient
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

	@And("^Rating field should be text box and user can able to pass the data into it$")
	public void rating_field_should_be_text_box_and_user_can_able_to_pass_the_data_into_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsRatingInputBox(), 20, 1);
		customerPersonalDetailsObj.customerDetailsRatingInputBox().getAttribute("type");
		Assert.assertEquals(customerPersonalDetailsTestData.textBoxAttribute,
				customerPersonalDetailsObj.customerDetailsRatingInputBox().getAttribute("type"));
		customerPersonalDetailsObj.customerDetailsRatingInputBox().click();
		customerPersonalDetailsObj.customerDetailsRatingInputBox().sendKeys(customerPersonalDetailsTestData.rating);
	}

	@And("^fill the contactdetails form$")
	public void fill_the_contactdetails_form() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper
						.scrollIntoView(customerPersonalDetailsObj.customerPersonalDetailsPhoneNumberInputBox());
				customerPersonalDetailsObj.customerPersonalDetailsPhoneNumberInputBox().click();
				customerPersonalDetailsObj.customerPersonalDetailsPhoneNumberInputBox()
						.sendKeys(customerPersonalDetailsTestData.ContactDetailsMobileNumber);
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMobileNumberPrimaryInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsMobileNumberPrimaryInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsMobileNumberPrimaryInputBox()
				.sendKeys(customerPersonalDetailsTestData.ContactDetailsMobileNumber);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMobileNumberSecondaryInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsMobileNumberSecondaryInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsMobileNumberSecondaryInputBox()
				.sendKeys(customerPersonalDetailsTestData.ContactDetailsMobileNumber);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsEMAILInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsEMAILInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsEMAILInputBox()
				.sendKeys(customerPersonalDetailsTestData.EmailID);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsPerfectContactMethodDropDown(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsPerfectContactMethodDropDown().click();
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.PreferedContactMethod
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
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsPreferedTimeForContactInputBox(), 20, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				// customerPersonalDetailsObj.customerPersonalDetailsPreferedTimeForContactInputBox().click();
				clicksAndActionsHelper.doubleClick(
						customerPersonalDetailsObj.customerPersonalDetailsPreferedTimeForContactInputBox());
				customerPersonalDetailsObj.customerPersonalDetailsPreferedTimeForContactInputBox()
						.sendKeys(customerPersonalDetailsTestData.ContactTime);

				break;
			} catch (Exception e) {
				Assert.fail(e.getMessage());
			}
		}
	}

	@Then("^save the customer detail record$")
	public void save_the_customer_detail_record() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(commonElement.ulsSaveButton());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
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
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.DefaultSelectValue
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
		String xpath = "//ion-label[text()=' " + customerPersonalDetailsTestData.DefaultSelectValue
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

		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsCustomerTypeFieldValidation().getText());
	}

	@Then("^verify applicant type field should show the blank field validation message$")
	public void verify_applicant_type_field_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsApplicantTypeFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsApplicantTypeFieldValidation().getText());
	}

	@Then("^verify salutation field should show the blank field validation message$")
	public void verify_salutation_field_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsSalutationValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsSalutationValidation().getText());
	}

	@Then("^verify first name should show the blank field validation message$")
	public void verify_first_name_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsSalutationValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsSalutationValidation().getText());
	}

	@Then("^verify last name should show the blank field validation message$")
	public void verify_last_name_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation().getText());
	}

	@Then("^verify date of birth should show the blank field validation message$")
	public void verify_date_of_birth_should_show_the_blank_field_validation_message() throws Throwable {
		javascriptHelper.scrollIntoView(customerPersonalDetailsObj.customerPersonalDetailsDateOfBirthFieldValidation());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsDateOfBirthFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsDateOfBirthFieldValidation().getText());
	}

	@Then("^verify gender should show the blank field validation message$")
	public void verify_gender_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsGenderFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsGenderFieldValidation().getText());
	}

	@Then("^verify educational level should show the blank field validation message$")
	public void verify_educational_level_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsEducationLevelFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsEducationLevelFieldValidation().getText());
	}

	@Then("^verify Marital status should show the blank field validation message$")
	public void verify_marital_status_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMaritalStatusFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsMaritalStatusFieldValidation().getText());
	}

	@Then("^verify nationality should show the blank field validation message$")
	public void verify_nationality_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsNationalityFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsNationalityFieldValidation().getText());
	}

	@Then("^verify residencial status should show the blank field validation message$")
	public void verify_residencial_status_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsResidentialStatusFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsResidentialStatusFieldValidation().getText());
	}

	@Then("^verify language should show the blank field validation message$")
	public void verify_language_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsLanguageFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsLanguageFieldValidation().getText());
	}

	@Then("^verify no of dependents should show the blank field validation message$")
	public void verify_no_of_dependents_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.noOfDependetntsFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.noOfDependetntsFieldValidation().getText());
	}

	@Then("^verify Mothers maiden name should show the blank field validation message$")
	public void verify_mothers_maiden_name_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameFieldValidation().getText());
	}

	@Then("^verify type of residence should show the blank field validation message$")
	public void verify_type_of_residence_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsTypeOfResidenceFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
				customerPersonalDetailsObj.customerPersonalDetailsTypeOfResidenceFieldValidation().getText());
	}

	@Then("^verify category of client should show the blank field validation message$")
	public void verify_category_of_client_should_show_the_blank_field_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsCategoryOfClientFieldValidation(), 20, 1);
		Assert.assertEquals(customerPersonalDetailsTestData.BlankInputValidation,
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
				.sendKeys(customerPersonalDetailsTestData.NumericIInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation().getText();
		Assert.assertEquals(customerPersonalDetailsTestData.NumericSpecialCharecterValidation,
				customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation().getText());

	}

	@Then("^verify first name field should not allow special charecters$")
	public void verify_first_name_field_should_not_allow_special_charecters() throws Throwable {
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox().clear();
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameinputBox()
				.sendKeys(customerPersonalDetailsTestData.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsFirstNameFieldValidation().getText();
		Assert.assertEquals(customerPersonalDetailsTestData.NumericSpecialCharecterValidation,
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
				.sendKeys(customerPersonalDetailsTestData.NumericIInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation().getText();
		Assert.assertEquals(customerPersonalDetailsTestData.NumericSpecialCharecterValidation,
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation().getText());
	}

	@Then("^verify last name field should not allow special charecters$")
	public void verify_last_name_field_should_not_allow_special_charecters() throws Throwable {
		customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox().clear();
		customerPersonalDetailsObj.customerPersonalDetailsLastNameInputBox()
				.sendKeys(customerPersonalDetailsTestData.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsLastNameFieldValidation().getText();
		Assert.assertEquals(customerPersonalDetailsTestData.NumericSpecialCharecterValidation,
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
				.sendKeys(customerPersonalDetailsTestData.alphaNumericInput);
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
				.sendKeys(customerPersonalDetailsTestData.negativeInput);

		Assert.assertEquals(customerPersonalDetailsTestData.negativeInputValidation,
				customerPersonalDetailsObj.noOfDependetntsFieldValidation().getText());
	}

	@Then("^verify mothers maiden name field should not allow numeric values$")
	public void verify_mothers_maiden_name_field_should_not_allow_numeric_values() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox()
				.sendKeys(customerPersonalDetailsTestData.NumericIInput);
		Assert.assertEquals(customerPersonalDetailsTestData.NumericSpecialCharecterValidation,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameFieldValidation().getText());
	}

	@Then("^verify mothers maiden name field should not allow special charecters$")
	public void verify_mothers_maiden_name_field_should_not_allow_special_charecters() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox(), 20, 1);
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox().clear();
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox().click();
		customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameInputBox()
				.sendKeys(customerPersonalDetailsTestData.SpecialCharacterInput);
		Assert.assertEquals(customerPersonalDetailsTestData.NumericSpecialCharecterValidation,
				customerPersonalDetailsObj.customerPersonalDetailsMothersMaidenNameFieldValidation().getText());
	}

	@And("^select the new application record in mail box$")
	public void select_the_new_application_record_in_mail_box() throws Throwable {
		Thread.sleep(500);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsNotificationFirstRecord(), 10, 1);
		commonElement.ulsNotificationFirstRecord().click();
	}

	@And("^click on customer details tab$")
	public void click_on_customer_details_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsCustomerDetailsTabnewApp(), 20, 1);
		commonElement.ulsCustomerDetailsTabnewApp().click();

	}

	@And("^store the form data which is available in the list view$")
	public void store_the_form_data_which_is_available_in_the_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsListViewEditIcon(), 10, 1);
		customerPersonalDetailsObj.customerDetailsListViewEditIcon().click();
		// first name
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsFirstnamedtaHolder(), 10, 1);
		String firstName = customerPersonalDetailsObj.customerDetailsFirstnamedtaHolder()
				.getAttribute("ng-reflect-model");
		testData.put("firstName", firstName);

		// Last Name
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsLastNamedataHolder(), 10, 1);
		String lastName = customerPersonalDetailsObj.customerDetailsLastNamedataHolder()
				.getAttribute("ng-reflect-model");
		testData.put("lastName", lastName);
		// MiddleName

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsMiddleNamedataHolder(), 10, 1);
		String middleName = customerPersonalDetailsObj.customerDetailsMiddleNamedataHolder()
				.getAttribute("ng-reflect-model");
		testData.put("middleName", middleName);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerDetailsCustomerTypeDropDown(), 10, 1);
		String customerTypeBeforeSplit = customerPersonalDetailsObj.customerDetailsCustomerTypeDropDown()
				.getAttribute("aria-label");
		String[] splitCustomerType = customerTypeBeforeSplit.split(",");
		testData.put("splitCustomerType", splitCustomerType[0].translateEscapes());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerPersonalDetailsObj.customerPersonalDetailsApplicantTypeDropDown(), 10, 1);
		String applicantTypeBeforeSplit = customerPersonalDetailsObj.customerPersonalDetailsApplicantTypeDropDown()
				.getAttribute("aria-label");
		String[] splitApplicantType = applicantTypeBeforeSplit.split(",");
		testData.put("splitApplicantType", splitApplicantType[0].translateEscapes());

		System.out.println("First name Is " + testData.get("firstName"));
		System.out.println("last name Is " + testData.get("lastName"));
		System.out.println("middle name Is " + testData.get("middleName"));
		System.out.println("customer Type name Is " + testData.get("splitCustomerType"));
		System.out.println("applicant Type name Is " + testData.get("splitApplicantType"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerPersonalDetailsObj.customerDetailsBackButton(),
				10, 1);
		customerPersonalDetailsObj.customerDetailsBackButton().click();
	}

	@Then("^verify save button is available in the screen and field should be read only mode$")
	public void verify_save_button_is_available_in_the_screen_and_field_should_be_read_only_mode() throws Throwable {

	}

	@Then("^verify back button is available is screen and field should be read only mode$")
	public void verify_back_button_is_available_is_screen_and_field_should_be_read_only_mode() throws Throwable {

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

	@Then("^verify last name field is available and read only mode in screen$")
	public void verify_last_name_field_is_available_and_read_only_mode_in_screen() throws Throwable {

	}

	@Then("^verify customer type field i available and should be in read only mode$")
	public void verify_customer_type_field_i_available_and_should_be_in_read_only_mode() throws Throwable {

	}

	@Then("^verify applicant type field should be available and read only mode$")
	public void verify_applicant_type_field_should_be_available_and_read_only_mode() throws Throwable {

	}

	@Then("^verify status field should be available and field should be read only mode$")
	public void verify_status_field_should_be_available_and_field_should_be_read_only_mode() throws Throwable {

	}

	@And("^search the new application record$")
	public void search_the_new_application_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsNotificationSerachButton(), 10, 1);
		commonElement.ulsNotificationSerachButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, commonElement.ulsNotificationSearchTextBox(), 10, 1);
		clicksAndActionsHelper.moveToElement(commonElement.ulsNotificationSearchTextBox());
		clicksAndActionsHelper.clickUsingActionClass(commonElement.ulsNotificationSearchTextBox(),
				commonElement.ulsNotificationSearchTextBox());
		commonElement.ulsNotificationSearchTextBox().sendKeys(customerPersonalDetailsTestData.applicationEventCode);

	}

}
