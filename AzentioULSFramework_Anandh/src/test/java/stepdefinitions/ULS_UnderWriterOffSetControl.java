package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ULS_UnderWriterOffSetControlObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.KULS_UnderWriterOffSetControlTestData;

public class ULS_UnderWriterOffSetControl extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ULS_UnderWriterOffSetControlObj underWriterOffSetControlObj = new ULS_UnderWriterOffSetControlObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	KULS_UnderWriterOffSetControlTestData underWriterOffSetControlTestData = jsonConfig
			.getUlsUnderWriterOffSetControlTestDataByName("Maker");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter jsondataReaderWriter = new JsonDataReaderWriter();
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	Map<String, String> underWriterData = new HashMap<>();
	Map<String, String> underWriterTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	String filePath = System.getProperty("user.dir") + "\\Test-data\\ULSTestData.xlsx";
	ExcelData excelData = new ExcelData(filePath, "UnderWriterOffSetTestData", "Data Set ID");
	SoftAssert softAssert = new SoftAssert();
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);

	// underwriteroffsetcontrolObj
	@And("^click on business rules main module$")
	public void click_on_business_rules_main_module() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.ulsBusinessRulesMainModule(), 5, 1);
		underWriterOffSetControlObj.ulsBusinessRulesMainModule().click();

	}

	@And("^click on under writer off set control view button$")
	public void click_on_under_writer_off_set_control_view_button() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(underWriterOffSetControlObj.underWriterOffSetControlViewButton());
				underWriterOffSetControlObj.underWriterOffSetControlViewButton().click();
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^click on add button to create under writer off set record$")
	public void click_on_add_button_to_create_under_writer_off_set_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlAddButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlAddButton().click();
	}

	@And("^get the test data for checker reject creation$")
	public void get_the_test_data_for_checker_reject_creation() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T003_D1");
	}

	@And("^get the test data of the first test case from excel file$")
	public void get_the_test_data_of_the_first_test_case_from_excel_file() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T001_2_D1");
	}

	@And("^get the test data of checker return scenario$")
	public void get_the_test_data_of_checker_return_scenario() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T004_D1");
	}

	@Then("^verify back button and save buttons are visible when user click on add button$")
	public void verify_back_button_and_save_buttons_are_visible_when_user_click_on_add_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlBackButton(), 5, 1);
		Assert.assertTrue(underWriterOffSetControlObj.underWriterOffSetControlBackButton().isDisplayed());
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlSaveButton(), 5, 1);
		Assert.assertTrue(underWriterOffSetControlObj.userWriterOffSetControlSaveButton().isDisplayed());
	}

	@Then("^verify minimum value input box should be mendatory and field should be text box$")
	public void verify_minimum_value_input_box_should_be_mendatory_and_field_should_be_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.UnderWriterOffSetControl_MinimumValueMendatoryCheck(), 5, 1);

		Assert.assertTrue(underWriterOffSetControlObj.UnderWriterOffSetControl_MinimumValueMendatoryCheck().getText()
				.equalsIgnoreCase("*"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		Assert.assertTrue(underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().getAttribute("type")
				.equals("text"));
	}

	@And("^user can able to enter the minimum value input box$")
	public void user_can_able_to_enter_the_minimum_value_input_box() throws Throwable {
		System.out.println("Minimumvalud Test data " + underWriterTestData.get("MinimumValue"));
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterTestData.get("MinimumValue"));
	}

	@Then("^verify maximum value input box should be mendatory and field should be text box$")
	public void verify_maximum_value_input_box_should_be_mendatory_and_field_should_be_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.UnderWriterOffSetControl_MaximumValueMendatoryCheck(), 5, 1);

		Assert.assertTrue(underWriterOffSetControlObj.UnderWriterOffSetControl_MaximumValueMendatoryCheck().getText()
				.equalsIgnoreCase("*"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		Assert.assertTrue(underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().getAttribute("type")
				.equals("text"));
	}

	@And("^user can able to enter the maximum value input box$")
	public void user_can_able_to_enter_the_maximum_value_input_box() throws Throwable {
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterTestData.get("MaximumValue"));
		// MaximumValue
	}

	@And("^user can able to enter the minimum value input box for checker reject$")
	public void user_can_able_to_enter_the_minimum_value_input_box_for_checker_reject() throws Throwable {
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.MinimumValueForCheckerReject);
	}

	@And("^user can able to enter the maximum value input box for checker reject$")
	public void user_can_able_to_enter_the_maximum_value_input_box_for_checker_reject() throws Throwable {
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.MaximumValueForCheckerReject);
	}

	@And("^user can able to enter the minimum value input box for checker return$")
	public void user_can_able_to_enter_the_minimum_value_input_box_for_checker_return() throws Throwable {
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.MinimumValueForCheckerReturn);
	}

	@And("^user can able to enter the maximum value input box for checker return$")
	public void user_can_able_to_enter_the_maximum_value_input_box_for_checker_return() throws Throwable {
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.MaximumValueForCheckerReturn);
	}

	@Then("^verify available field should be non mendatory and field should be display only$")
	public void verify_available_field_should_be_non_mendatory_and_field_should_be_display_only() throws Throwable {
		System.out.println("Field name:Available non available");
	}

	@Then("^verify selected field should be non mendatory and field should be display only$")
	public void verify_selected_field_should_be_non_mendatory_and_field_should_be_display_only() throws Throwable {
		System.out.println("Field name: selected non available");
	}

	@Then("^click on save button in under writer off set screen$")
	public void click_on_save_button_in_under_writer_off_set_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlSaveButton(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlSaveButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlToastAlertClose(), 10, 1);
		underWriterOffSetControlObj.underWriterOffSetControlToastAlertClose().click();
	}

	@When("^click on mail box after saving the under writer record$")
	public void click_on_mail_box_after_saving_the_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlMailBox(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlMailBox().click();
	}

	@Then("^select the under writer record in checker stage$")
	public void select_the_under_writer_record_in_checker_stage() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				driver.findElement(By.xpath(
						"//span[text()='" + underWriterTestData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^click on search button to search the under writer off set record$")
	public void click_on_search_button_to_search_the_under_writer_off_set_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlinboxSearch(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlinboxSearch().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlSearchTextBoxInbox(), 5, 1);
		clicksAndActionsHelper.moveToElement(underWriterOffSetControlObj.underWriterOffSetControlSearchTextBoxInbox());
		clicksAndActionsHelper.clickOnElement(underWriterOffSetControlObj.underWriterOffSetControlSearchTextBoxInbox());
		underWriterOffSetControlObj.underWriterOffSetControlSearchTextBoxInbox()
				.sendKeys(underWriterTestData.get("ModuleCode"));
	}

	@And("^click on first under writer off set record$")
	public void click_on_first_under_writer_off_set_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID(), 5, 1);
		excelData.updateTestData("AT_UOC_T001_2_D1", "Reference ID",
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID().getText());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlfirstRecord().click();
	}

	@And("^click on first record of updated under writer which is going to return in checker stage$")
	public void click_on_first_record_of_updated_under_writer_which_is_going_to_return_in_checker_stage()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID(), 5, 1);
		excelData.updateTestData("AT_UOC_T010_D1", "Reference ID",
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID().getText());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlfirstRecord().click();
	}

	@And("^click on first record of under Writer off set control record$")
	public void click_on_first_record_of_under_writer_off_set_control_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID(), 5, 1);
		String referenceNumber = "";
		for (int i = 0; i <= 30; i++) {
			try {
				referenceNumber = underWriterOffSetControlObj.underWriterOffSetControlreferenceID().getText();
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		excelData.updateTestData("AT_UOC_T006_D6", "Reference ID", referenceNumber);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord(), 5, 1);
		for (int i = 0; i <= 50; i++) {
			try {
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@And("^click on first record of under writer which is updated before approval$")
    public void click_on_first_record_of_under_writer_which_is_updated_before_approval() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID(), 5, 1);
		String referenceNumber = "";
		for (int i = 0; i <= 30; i++) {
			try {
				referenceNumber = underWriterOffSetControlObj.underWriterOffSetControlreferenceID().getText();
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		excelData.updateTestData("AT_UOC_T006_D1", "Reference ID", referenceNumber);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord(), 5, 1);
		for (int i = 0; i <= 50; i++) {
			try {
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

	@And("^click on first under writer off set record for the checker reject record$")
	public void click_on_first_under_writer_off_set_record_for_the_checker_reject_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID(), 5, 1);
		excelData.updateTestData("AT_UOC_T003_D1", "Reference ID",
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID().getText());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlfirstRecord().click();
	}

	@And("^click on first updated under writer offset record which is going to approved in checker$")
	public void click_on_first_updated_under_writer_offset_record_which_is_going_to_approved_in_checker()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID(), 5, 1);
		excelData.updateTestData("AT_UOC_T007_8__D1", "Reference ID",
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID().getText());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlfirstRecord().click();
	}

	@And("^click on first updated under writer off set record which is going to reject in checker$")
	public void click_on_first_updated_under_writer_off_set_record_which_is_going_to_reject_in_checker()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID(), 5, 1);
		excelData.updateTestData("AT_UOC_T009_D1", "Reference ID",
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID().getText());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlfirstRecord().click();
	}

	@And("^click on first under writer off set record whcih is going to return in checker$")
	public void click_on_first_under_writer_off_set_record_whcih_is_going_to_return_in_checker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID(), 5, 1);
		excelData.updateTestData("AT_UOC_T004_D1", "Reference ID",
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID().getText());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlfirstRecord().click();
	}

	@And("^click on first under writer off set record to check the transaction summary$")
	public void click_on_first_under_writer_off_set_record_to_check_the_transaction_summary() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID(), 5, 1);
		excelData.updateTestData("AT_UOC_T0012__13_D1", "Reference ID",
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID().getText());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlfirstRecord(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlfirstRecord().click();
	}

	@And("^submit the under writer off set record$")
	public void submit_the_under_writer_off_set_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlSubmitButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlSubmitButton().click();
	}

	@Then("^give alert remark and click on submit in alert$")
	public void give_alert_remark_and_click_on_submit_in_alert() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlalertRemark(), 60, 1);
		underWriterOffSetControlObj.underWriterOffSetControlalertRemark().click();
		underWriterOffSetControlObj.underWriterOffSetControlalertRemark()
				.sendKeys(underWriterTestData.get("MakerAlertRemark"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlaleralertSubmitButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlaleralertSubmitButton().click();

	}

	@Then("^store the checker id for updated under writer record$")
	public void store_the_checker_id_for_updated_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert(), 5, 1);
		String submitedStatus = underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		excelData.updateTestData("AT_UOC_T007_8__D1", "Checker id", substring.replace(".", "").trim());
	}

	@Then("^store the checker id for checker reject scenario for updated record$")
	public void store_the_checker_id_for_checker_reject_scenario_for_updated_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert(), 5, 1);
		String submitedStatus = underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		excelData.updateTestData("AT_UOC_T009_D1", "Checker id", substring.replace(".", "").trim());
	}

	@Then("^store the checker id$")
	public void store_the_checker_id() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert(), 5, 1);
		String submitedStatus = underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		excelData.updateTestData("AT_UOC_T001_2_D1", "Checker id", substring.replace(".", "").trim());
		// jsondataReaderWriter.addData(substring.replace(".", "").trim());
	}

	@And("^store the checker id of updated record for checker return purpose$")
	public void store_the_checker_id_of_updated_record_for_checker_return_purpose() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert(), 5, 1);
		String submitedStatus = underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		excelData.updateTestData("AT_UOC_T010_D1", "Checker id", substring.replace(".", "").trim());
	}

	@Then("^store the checker id for checker reject$")
	public void store_the_checker_id_for_checker_reject() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert(), 5, 1);
		String submitedStatus = underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		excelData.updateTestData("AT_UOC_T003_D1", "Checker id", substring.replace(".", "").trim());
	}

	@Then("^store the checker id for checker return$")
	public void store_the_checker_id_for_checker_return() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert(), 5, 1);
		String submitedStatus = underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		excelData.updateTestData("AT_UOC_T004_D1", "Checker id", substring.replace(".", "").trim());
	}

	@Then("^store the checker id for updated record$")
	public void store_the_checker_id_for_updated_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert(), 5, 1);
		String submitedStatus = underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		excelData.updateTestData("AT_UOC_T006_D6", "Checker id", substring.replace(".", "").trim());
	}
	@Then("^store the checker ID of WIP Updated record$")
    public void store_the_checker_id_of_wip_updated_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert(), 5, 1);
		String submitedStatus = underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		excelData.updateTestData("AT_UOC_T006_D1", "Checker id", substring.replace(".", "").trim());
    }

	@Then("^click on approve button to approve the under writer record$")
	public void click_on_approve_button_to_approve_the_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerApproveButton(), 5,
				1);
		underWriterOffSetControlObj.checkerApproveButton().click();
	}

	@And("^get the test data for checker reject scenario$")
	public void get_the_test_data_for_checker_reject_scenario() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T003_D1");
	}

	@And("^click on reject button in checker stage to return the under writer off set control record$")
	public void click_on_reject_button_in_checker_stage_to_return_the_under_writer_off_set_control_record()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerRejectButton(), 5,
				1);
		underWriterOffSetControlObj.checkerRejectButton().click();
	}

	@And("^click on return button in checker stage to return the under writer off set control record$")
	public void click_on_return_button_in_checker_stage_to_return_the_under_writer_off_set_control_record()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerReturnButton(), 5,
				1);
		underWriterOffSetControlObj.checkerReturnButton().click();
	}

	// Checker scenario
	@Then("^login with checker user for return the under writer record$")
	public void login_with_checker_user_for_return_the_under_writer_record() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T004_D1");
		kulsLogin.ulSApplicationLoginAsAChecker(underWriterTestData.get("Checker id"));
	}

	@And("^login with checker id which is captured while submit the updated record for return purpose$")
	public void login_with_checker_id_which_is_captured_while_submit_the_updated_record_for_return_purpose()
			throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T010_D1");
		kulsLogin.ulSApplicationLoginAsAChecker(underWriterTestData.get("Checker id"));
	}

	@And("^click on menu button$")
	public void click_on_menu_button() throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver,
//				underWriterOffSetControlObj.underWriterOffSetControlCheckerMenuBar(), 5, 1);
//		underWriterOffSetControlObj.underWriterOffSetControlCheckerMenuBar().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlMailBox(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlMailBox().click();
	}

	@And("^give the checker remark in alert pop up for return the under writer record$")
	public void give_the_checker_remark_in_alert_pop_up_for_return_the_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerAlertRemark(), 5,
				1);
		underWriterOffSetControlObj.checkerAlertRemark().click();
		underWriterOffSetControlObj.checkerAlertRemark().sendKeys(underWriterTestData.get("ChekcerRemark"));
	}

	@And("^click on return button in remark pop up for return the under writer record$")
	public void click_on_return_button_in_remark_pop_up_for_return_the_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerAlertReturnButton(),
				5, 1);
		underWriterOffSetControlObj.checkerAlertReturnButton().click();
	}

	@Then("^verify checker user can able to see the reject pop up after returning the under writer record$")
	public void verify_checker_user_can_able_to_see_the_reject_pop_up_after_returning_the_under_writer_record()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerConfirmationPopUp(),
				5, 1);

		System.out.println(underWriterOffSetControlObj.checkerConfirmationPopUp().getText());
		Assert.assertTrue(underWriterOffSetControlObj.checkerConfirmationPopUp().getText()
				.contains("Record RETURNED Successfully"));
	}

	@And("^click on reject button in remark pop up for reject the under writer record$")
	public void click_on_return_button_in_remark_pop_up_for_reject_the_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerAlertRejectButton(),
				5, 1);
		underWriterOffSetControlObj.checkerAlertRejectButton().click();
	}

	@Then("^verify checker user can able to see the reject pop up after rejecting the under writer record$")
	public void verify_checker_user_can_able_to_see_the_reject_pop_up_after_rejecting_the_under_writer_record()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerConfirmationPopUp(),
				5, 1);

		System.out.println(underWriterOffSetControlObj.checkerConfirmationPopUp().getText());
		Assert.assertEquals(underWriterOffSetControlObj.checkerConfirmationPopUp().getText(),
				"Record REJECTED Successfully");
	}

	@And("^click on reject button in checker stage to reject the under writer off set control record$")
	public void click_on_reject_button_in_checker_stage_to_reject_the_under_writer_off_set_control_record()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerRejectButton(), 5,
				1);
		underWriterOffSetControlObj.checkerRejectButton().click();
	}

	@And("^give the checker remark in alert pop up for reject the under writer record$")
	public void give_the_checker_remark_in_alert_pop_up_for_reject_the_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerAlertRemark(), 5,
				1);
		underWriterOffSetControlObj.checkerAlertRemark().click();
		underWriterOffSetControlObj.checkerAlertRemark().sendKeys(underWriterTestData.get("ChekcerRemark"));
	}

	@Then("^login with checker user for approve the under writer record$")
	public void login_with_checker_user_for_approve_the_under_writer_record() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T001_2_D1");
		kulsLogin.ulSApplicationLoginAsAChecker(underWriterTestData.get("Checker id"));
	}

	@Then("^login with checker user for reject the under writer record$")
	public void login_with_checker_user_for_reject_the_under_writer_record() throws Throwable {
		// Map<String,String> loginTestData= new HashMap<>();
		underWriterTestData = excelData.getTestdata("AT_UOC_T003_D1");
		kulsLogin.ulSApplicationLoginAsAChecker(underWriterTestData.get("Checker id"));
	}

	@And("^log in with checker ID which is captured while sibmit from maker for approval purpose$")
	public void log_in_with_checker_id_which_is_captured_while_sibmit_from_maker_for_approval_purpose()
			throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T007_8__D1");
		kulsLogin.ulSApplicationLoginAsAChecker(underWriterTestData.get("Checker id"));
	}
	@And("^login with checker user to approve the WIP Updated record$")
    public void login_with_checker_user_to_approve_the_wip_updated_record() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T006_D1");
		kulsLogin.ulSApplicationLoginAsAChecker(underWriterTestData.get("Checker id"));
    }
	@And("^log in with checker ID which is captured while sibmit from maker for rejection purpose$")
	public void log_in_with_checker_id_which_is_captured_while_sibmit_from_maker_for_rejection_purpose()
			throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T009_D1");
		kulsLogin.ulSApplicationLoginAsAChecker(underWriterTestData.get("Checker id"));
	}

	@And("^click on approve button in checker stage to approve the under writer off set control record$")
	public void click_on_approve_button_in_checker_stage_to_approve_the_under_writer_off_set_control_record()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerApproveButton(), 5,
				1);
		underWriterOffSetControlObj.checkerApproveButton().click();
	}

	@And("^give the checker remark in alert pop up for approve the under writer record$")
	public void give_the_checker_remark_in_alert_pop_up_for_approve_the_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerAlertRemark(), 5,
				1);
		underWriterOffSetControlObj.checkerAlertRemark().click();
		underWriterOffSetControlObj.checkerAlertRemark().sendKeys(underWriterTestData.get("ChekcerRemark"));
	}

	@And("^click on approve button in remark pop up for approve the under writer record$")
	public void click_on_approve_button_in_remark_pop_up_for_approve_the_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerAlertApprove(), 5,
				1);
		underWriterOffSetControlObj.checkerAlertApprove().click();
	}

	@Then("^verify checker user can able to see the approve pop up after approving the under writer record$")
	public void verify_checker_user_can_able_to_see_the_approve_pop_up_after_approving_the_under_writer_record()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerConfirmationPopUp(),
				5, 1);

		Assert.assertEquals(underWriterOffSetControlObj.checkerConfirmationPopUp().getText(),
				"Record APPROVED Successfully");
	}

	@And("^get the test data for negative scenarios in excel file$")
	public void get_the_test_data_for_negative_scenarios_in_excel_file() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T005_D1");
	}

	@And("^click on save button before entering mendatory details$")
	public void click_on_save_button_before_entering_mendatory_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlSaveButton(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlSaveButton().click();

	}

	@Then("^verify system should show the validation for minimum and maximum value mendatory fields$")
	public void verify_system_should_show_the_validation_for_minimum_and_maximum_value_mendatory_fields()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlMinimumValueValidationMessage(), 5, 1);
		Assert.assertEquals(
				underWriterOffSetControlObj.underWriterOffSetControlMinimumValueValidationMessage().getText(),
				"Required field");
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlMaximumValueValidationMessage(), 5, 1);
		Assert.assertEquals(
				underWriterOffSetControlObj.underWriterOffSetControlMaximumValueValidationMessage().getText(),
				"Required field");
	}

	@And("^fill the alphabets in minimum and maximum value input box$")
	public void fill_the_alphabets_in_minimum_and_maximum_value_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterTestData.get("StringInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterTestData.get("StringInput"));
	}

	@Then("^verify system should not allow user to save the record$")
	public void verify_system_should_not_allow_user_to_save_the_record() throws Throwable {
		boolean result = false;
		for (int i = 0; i <= 15; i++) {
			try {
				result=underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().isDisplayed();
				break;
			} catch (NoSuchElementException e) {
				if (i == 15) {
					result = false;

				}
			}
		}
		Assert.assertFalse(result);
	}

	@Then("^click on save button after enter the alphabet input$")
	public void click_on_save_button_after_enter_the_alphabet_input() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlSaveButton(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlSaveButton().click();
	}

	@Then("^fill the minimum and maximum input as special characters$")
	public void fill_the_minimum_and_maximum_input_as_special_characters() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterTestData.get("SpecialCharacterInput"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterTestData.get("SpecialCharacterInput"));
	}

	@And("^click on save button after enter special characters$")
	public void click_on_save_button_after_enter_special_characters() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlMinimumValueValidationMessage(), 5, 1);
		Assert.assertEquals(
				underWriterOffSetControlObj.underWriterOffSetControlMinimumValueValidationMessage().getText(),
				"Alphanumeric characters allowed");
		try {
			Assert.assertEquals(
					underWriterOffSetControlObj.underWriterOffSetControlMaximumValueValidationMessage().getText(),
					"no special charecter allowed");
		} catch (Exception e) {
			softAssert.fail("Maximum Value field didn't through the validation for Special Character Input");
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlSaveButton(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlSaveButton().click();
	}

	@Then("^verify functionality of back button$")
	public void verify_functionality_of_back_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlBackButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlBackButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlAction(), 5, 1);
		Assert.assertTrue(underWriterOffSetControlObj.underWriterOffSetControlAction().isDisplayed());
		softAssert.assertAll();

	}

	@And("^update the minimum and maximum value fields$")
	public void update_the_minimum_and_maximum_value_fields() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T006_D1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterTestData.get("MinimumValue"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterTestData.get("MaximumValue"));
		String minimumValue = underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder()
				.getAttribute("ng-reflect-model");
		underWriterData.put("minimumValue", minimumValue);
		String maximumValue = underWriterOffSetControlObj.underWriterOffSetControlMaximumValueDataHolder()
				.getAttribute("ng-reflect-model");
		underWriterData.put("maximumValue", maximumValue);
	}

	@Then("^click on save button after updating the under writer off set screen$")
	public void click_on_save_button_after_updating_the_under_writer_off_set_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlToastAlertClose(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlToastAlertClose().click();
	}

	@Then("^verify record is updated or not$")
	public void verify_record_is_updated_or_not() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder(), 5, 1);
		String minimumValue = underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder()
				.getAttribute("ng-reflect-model");
		String maximumValue = underWriterOffSetControlObj.underWriterOffSetControlMaximumValueDataHolder()
				.getAttribute("ng-reflect-model");
		Assert.assertEquals(minimumValue, underWriterTestData.get("MinimumValue"));
		Assert.assertEquals(maximumValue, underWriterTestData.get("MaximumValue"));

	}

	@And("^get the test data of updattion seventh test case$")
	public void get_the_test_data_of_updattion_seventh_test_case() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T007_8__D1");
	}

	@Then("^select the record to do updation which is approved from checker user$")
	public void select_the_record_to_do_updation_which_is_approved_from_checker_user() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlListViewFirstRecord(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlListViewFirstRecord().click();
	}

	@And("^get the test data for update the under writer record for checker return$")
    public void get_the_test_data_for_update_the_under_writer_record_for_checker_return() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T010_D1");
    }
	@And("^get the test data  of validation screnario in updation screen$")
	public void get_the_test_data_of_validation_screnario_in_updation_screen() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T011_D1");
	}

	@Then("^update the already approved record$")
	public void update_the_already_approved_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterTestData.get("MinimumValue"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterTestData.get("MaximumValue"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder(), 5, 1);
		String minimumValue = underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder()
				.getAttribute("ng-reflect-model");
		String maximumValue = underWriterOffSetControlObj.underWriterOffSetControlMaximumValueDataHolder()
				.getAttribute("ng-reflect-model");
		underWriterData.put("minimumValue", minimumValue);
		underWriterData.put("maximumValue", maximumValue);
	}

	@And("^click on save button after update the approved one$")
	public void click_on_save_button_after_update_the_approved_one() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlToastAlertClose(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlToastAlertClose().click();
	}

	@Then("^verify approved record is updated with our input data$")
	public void verify_approved_record_is_updated_with_our_input_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder(), 5, 1);
		String minimumValue = underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder()
				.getAttribute("ng-reflect-model");
		String maximumValue = underWriterOffSetControlObj.underWriterOffSetControlMaximumValueDataHolder()
				.getAttribute("ng-reflect-model");
		Assert.assertEquals(minimumValue, underWriterTestData.get("MinimumValue"));
		Assert.assertEquals(maximumValue, underWriterTestData.get("MaximumValue"));
	}

	@And("^get the test data for updattion which is going to reject from checker$")
	public void get_the_test_data_for_updattion_which_is_going_to_reject_from_checker() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T009_D1");
	}

	@Then("^update the already approved record for checker reject$")
	public void update_the_already_approved_record_for_checker_reject() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterTestData.get("MinimumValue"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterTestData.get("MaximumValue"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder(), 5, 1);
		String minimumValue = underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder()
				.getAttribute("ng-reflect-model");
		String maximumValue = underWriterOffSetControlObj.underWriterOffSetControlMaximumValueDataHolder()
				.getAttribute("ng-reflect-model");
		underWriterData.put("minimumValue", minimumValue);
		underWriterData.put("maximumValue", maximumValue);
	}

	@Then("^verify approved record is updated with our input data for checker reject$")
	public void verify_approved_record_is_updated_with_our_input_data_for_checker_reject() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder(), 5, 1);
		String minimumValue = underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder()
				.getAttribute("ng-reflect-model");
		String maximumValue = underWriterOffSetControlObj.underWriterOffSetControlMaximumValueDataHolder()
				.getAttribute("ng-reflect-model");
		Assert.assertEquals(minimumValue, underWriterTestData.get("MinimumValue"));
		Assert.assertEquals(maximumValue, underWriterTestData.get("MaximumValue"));
	}

	@Then("^update the already approved record for checker return$")
	public void update_the_already_approved_record_for_checker_return() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterTestData.get("MinimumValue"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterTestData.get("MaximumValue"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder(), 5, 1);
		String minimumValue = underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder()
				.getAttribute("ng-reflect-model");
		String maximumValue = underWriterOffSetControlObj.underWriterOffSetControlMaximumValueDataHolder()
				.getAttribute("ng-reflect-model");
		underWriterData.put("minimumValue", minimumValue);
		underWriterData.put("maximumValue", maximumValue);
	}

	@Then("^verify approved record is updated with our input data for checker return$")
	public void verify_approved_record_is_updated_with_our_input_data_for_checker_return() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder(), 5, 1);
		String minimumValue = underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder()
				.getAttribute("ng-reflect-model");
		String maximumValue = underWriterOffSetControlObj.underWriterOffSetControlMaximumValueDataHolder()
				.getAttribute("ng-reflect-model");
		Assert.assertEquals(minimumValue, underWriterTestData.get("MinimumValue"));
		Assert.assertEquals(maximumValue, underWriterTestData.get("MaximumValue"));
	}

	@Then("^clear the input box value$")
	public void clear_the_input_box_value() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder(), 5, 1);
		String minimumValue = underWriterOffSetControlObj.userWriterOffSetControlMinimumValueDataHolder()
				.getAttribute("ng-reflect-model");
		String maximumValue = underWriterOffSetControlObj.underWriterOffSetControlMaximumValueDataHolder()
				.getAttribute("ng-reflect-model");

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);

		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().click();
		for (int i = 0; i <= minimumValue.length(); i++) {
			underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().sendKeys(Keys.BACK_SPACE);
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		for (int i = 0; i <= maximumValue.length(); i++) {
			underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().sendKeys(Keys.BACK_SPACE);
		}

	}

	@Then("^click on save button after enter the alphabet input for updation record$")
	public void click_on_save_button_after_enter_the_alphabet_input_for_updation_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton().click();
	}

	@And("^click on save button before entering mendatory details in updation record$")
	public void click_on_save_button_before_entering_mendatory_details_in_updation_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton(), 5, 1);
		clicksAndActionsHelper.clickOnElement(underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton());
		// underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton().click();
	}

	@And("^click on save button after enter special characters for updation record$")
	public void click_on_save_button_after_enter_special_characters_for_updation_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlUpdateSaveButton().click();
	}
	/*
	 * @Given("^Launch the kuls application and Navigate to under writer offset control view list$"
	 * ) public void
	 * launch_the_kuls_application_and_navigate_to_under_writer_offset_control_view_list
	 * () throws Throwable { String kulsApplicationUrl =
	 * configFileReader.getApplicationUrl(); driver.get(kulsApplicationUrl);
	 * login.loginUlsApplicationAsMaker(loginData.Username, loginData.Password);
	 * seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
	 * underWriterOffSetControlObj.configurationInLeftPanel(), 60, 2);
	 * underWriterOffSetControlObj.configurationInLeftPanel().click();
	 * seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
	 * underWriterOffSetControlObj.businessRulesInLeftPanel(), 60, 2);
	 * underWriterOffSetControlObj.businessRulesInLeftPanel().click();
	 * seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
	 * underWriterOffSetControlObj.ViewIconOfListViewInUnderWriterOffsetControl(),
	 * 60, 2);
	 * underWriterOffSetControlObj.ViewIconOfListViewInUnderWriterOffsetControl().
	 * click(); }
	 */

	@Then("^Validate the functionality of View summary section in under writer offset control$")
	public void validate_the_functionality_of_view_summary_section_in_under_writer_offset_control() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.viewSummaryIconOfUnderWriterOffsetControl(), 60, 2);

		seleniumActions.getJavascriptHelper()
				.JSEClick(underWriterOffSetControlObj.viewSummaryIconOfUnderWriterOffsetControl());

		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.viewSummaryPageOfUnderWriterOffsetControl(), 60, 2);
		Assert.assertEquals(underWriterOffSetControlObj.viewSummaryPageOfUnderWriterOffsetControl().isDisplayed(),
				true);
	}

	@And("^Validate all fields in list view of under writer offset control$")
	public void validate_all_fields_in_list_view_of_under_writer_offset_control() throws Throwable {
		Thread.sleep(3000);
		String xpath = "(//span[contains(text(),'Action')])[1]";
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		WebElement Action = driver.findElement(By.xpath(xpath));
		System.out.println(Action);
		String xpath1 = "//span[contains(text(),' Minimum Value ')]";
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath1)), 60, 2);
		WebElement minimumvalue = driver.findElement(By.xpath(xpath1));
		System.out.println(minimumvalue);
		String xpath2 = "//span[contains(text(),' Maximum Value ')]";
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 60, 2);
		WebElement maximumvalue = driver.findElement(By.xpath(xpath2));
		System.out.println(maximumvalue);
		String xpath3 = "(//span[contains(text(),' Status ')])[1]";
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 60, 2);
		WebElement status = driver.findElement(By.xpath(xpath3));
		System.out.println(status);

	}

	@And("^Validate that values in list view of under writer offset control is non editable$")
	public void validate_that_values_in_list_view_of_under_writer_offset_control_is_non_editable() throws Throwable {
		String xpath = "//tbody/tr[1]/td[4]";
		Thread.sleep(2000);
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified status field is not editable only displayable");
		}
	}

	@And("^Validate the functionalitiy of Add button of under writer offset control$")
	public void validate_the_functionalitiy_of_add_button_of_under_writer_offset_control() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.UnderWriterOffsetControlAddIcon(), 60, 2);
		underWriterOffSetControlObj.UnderWriterOffsetControlAddIcon().click();
		// Thread.sleep(2000);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underwriteroffsetcontrolSaveIcon(), 60, 1);
		Assert.assertEquals(underWriterOffSetControlObj.underwriteroffsetcontrolSaveIcon().isDisplayed(), true);
	}

	@And("^get the test data of under writer validation scenario$")
	public void get_the_test_data_of_under_writer_validation_scenario() throws Throwable {
		underWriterTestData = excelData.getTestdata("AT_UOC_T0012__13_D1");
	}

	@And("^Click on Back icon of under writer offset control$")
	public void click_on_back_icon_of_under_writer_offset_control() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underwriteroffsetcontrolBackIcon(), 60, 2);
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(underWriterOffSetControlObj.underwriteroffsetcontrolBackIcon());
				// underwriteroffsetcontrolObj.underwriteroffsetcontrolBackIcon().click();

				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// Thread.sleep(2000);
	}

	@And("^Verify that user can click on view inporgress in view list of under writer offset control$")
	public void verify_that_user_can_click_on_view_inprogress_in_view_list_of_under_writer_offset_control()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.pencilIconOfFirstRecordInUnderWriterOffsetControl(), 60, 2);
		for (int i = 0; i <= 15; i++) {
			try {
				underWriterOffSetControlObj.pencilIconOfFirstRecordInUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underwriteroffsetcontrolMinimumValueField(), 60, 2);
		Assert.assertEquals(underWriterOffSetControlObj.underwriteroffsetcontrolMinimumValueField().isDisplayed(),
				true);
	}

	@And("^Search with valid data in under writer offset control$")
	public void search_with_valid_data_in_under_writer_offset_control() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				underWriterOffSetControlObj.searchIconOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.searchTextFieldOfUnderWriterOffsetControl(), 30, 2);
		underWriterOffSetControlObj.searchTextFieldOfUnderWriterOffsetControl()
				.sendKeys(underWriterTestData.get("ValidSearchInListView"));
		String xpath = "//span[contains(text(),' Minimum Value ')]";
		String productgroup = null;
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		for (int i = 0; i < 20; i++) {

			productgroup = driver.findElement(By.xpath(xpath)).getText();
		}
		System.out.println(productgroup);

	}

	@And("^Search with Invalid data in under writer offset control$")
	public void search_with_invalid_data_in_under_writer_offset_control() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				underWriterOffSetControlObj.searchIconOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.searchTextFieldOfUnderWriterOffsetControl(), 30, 2);
		underWriterOffSetControlObj.searchTextFieldOfUnderWriterOffsetControl()
				.sendKeys(underWriterTestData.get("InvalidSearchInListView"));
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				// "Showing 0 to 0 of 0 entries"
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
	}
	@And("^search the invalid data in under writer offset control temp view$")
    public void search_the_invalid_data_in_under_writer_offset_control_temp_view() throws Throwable {
		Random random = new Random();
		int int_random = random.nextInt(7); 
		int int_random2 = random.nextInt(7); 
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				underWriterOffSetControlObj.searchIconOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.searchTextFieldOfUnderWriterOffsetControl(), 30, 2);
		System.out.println("Wip Invalid search"+underWriterTestData.get("InvalidSearchInWIp")+int_random+int_random2);
		String searchWithInvalidText=underWriterTestData.get("InvalidSearchInWIp")+int_random+int_random2;
		underWriterOffSetControlObj.searchTextFieldOfUnderWriterOffsetControl()
				.sendKeys(searchWithInvalidText);
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				// "Showing 0 to 0 of 0 entries"
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    }

	@And("^Validate Export to PDF functionality of under writer offset control$")
	public void validate_export_to_pdf_functionality_of_under_writer_offset_control() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				underWriterOffSetControlObj.exportIconOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.exportToPDFOfUnderWriterOffsetControl(), 60, 3);
		underWriterOffSetControlObj.exportToPDFOfUnderWriterOffsetControl().click();
		seleniumActions.getBrowserHelper().SwitchToWindow(1);
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(underWriterTestData.get("DownloadFilePath"));
		File[] totalfiles = file.listFiles();
		for (File fileName : totalfiles) {
			if (fileName.getName().equalsIgnoreCase(underWriterTestData.get("PDFFileName"))) {
				System.out.println("Downloaded file present in system");
				break;
			} else {
				System.out.println("Downloaded file present does not exist in system");
			}

		}
		seleniumActions.getBrowserHelper().switchToParentWithChildClose();

	}

	@And("^Validate export to Excel functionality of under writer offset control$")
	public void validate_export_to_excel_functionality_of_under_writer_offset_control() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				underWriterOffSetControlObj.exportIconOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 20; i++) {
			try {
				underWriterOffSetControlObj.exportToExcelOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}

		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(underWriterTestData.get("DownloadFilePath"));
		File[] totalfiles = file.listFiles();
		for (File fileName : totalfiles) {
			if (fileName.getName().contains("ExcelFileName")) {
				System.out.println("Downloaded file present in system");
				break;
			} else {
				System.out.println("Downloaded file present does not exist in system");
			}

		}

	}

	@And("^Navigate to Temp view of under writer offset control$")
	public void navigate_to_temp_view_of_under_writer_offset_control() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.TempViewIconOfUnderWriterOffsetControl(), 60, 2);
		underWriterOffSetControlObj.TempViewIconOfUnderWriterOffsetControl().click();
		Thread.sleep(2000);

	}

	@And("^Validate the fields are present in WIP of under writer offset control$")
	public void validate_the_fields_are_present_in_wip_of_under_writer_offset_control() throws Throwable {
		String xpath = "(//span[contains(text(),'Action')])[1]";
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		WebElement Action = driver.findElement(By.xpath(xpath));
		System.out.println(Action);
		String xpath1 = "//span[contains(text(),' Minimum Value ')]";
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath1)), 60, 2);
		WebElement minimumvalue = driver.findElement(By.xpath(xpath1));
		System.out.println(minimumvalue);
		String xpath2 = "//span[contains(text(),' Maximum Value ')]";
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 60, 2);
		WebElement maximumvalue = driver.findElement(By.xpath(xpath2));
		System.out.println(maximumvalue);
		String xpath3 = "(//span[contains(text(),' Status ')])[1]";
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 60, 2);
		WebElement status = driver.findElement(By.xpath(xpath3));
		System.out.println(status);
		String xpath4 = "//span[contains(text(),' Current Stage ')]";
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath4)), 60, 2);
		WebElement currentstage = driver.findElement(By.xpath(xpath4));
		System.out.println(currentstage);
	}

	@And("^Click on pencil icon of first record in temp view of under writer offset control$")
	public void click_on_pencil_icon_of_first_record_in_temp_view_of_under_writer_offset_control() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.pencilIconOfFirstRecordInUnderWriterOffsetControl(), 60, 2);
		underWriterOffSetControlObj.pencilIconOfFirstRecordInUnderWriterOffsetControl().click();
		Thread.sleep(2000);
	}
}
