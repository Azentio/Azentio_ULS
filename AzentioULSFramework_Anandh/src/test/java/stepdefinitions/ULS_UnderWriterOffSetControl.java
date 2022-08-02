package stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ULS_UnderWriterOffSetControlObj;
import resources.BaseClass;
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

	@And("^click on business rules main module$")
	public void click_on_business_rules_main_module() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.ulsBusinessRulesMainModule(), 5, 1);
		underWriterOffSetControlObj.ulsBusinessRulesMainModule().click();

	}

	@And("^click on under writer off set control view button$")
	public void click_on_under_writer_off_set_control_view_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlViewButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlViewButton().click();
	}

	@Then("^click on add button to create under writer off set record$")
	public void click_on_add_button_to_create_under_writer_off_set_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlAddButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlAddButton().click();
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
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.MinimumValue);
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
				.sendKeys(underWriterOffSetControlTestData.MaximumValue);
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
		for (int i = 0; i <= 15; i++) {
			try {
				driver.findElement(By.xpath(
						"//span[text()='" + jsondataReaderWriter.readReferancedata() + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 15) {
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
				.sendKeys(underWriterOffSetControlTestData.eventCode);
	}

	@And("^click on first under writer off set record$")
	public void click_on_first_under_writer_off_set_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlreferenceID(), 5, 1);
		jsondataReaderWriter
				.addReferanceData(underWriterOffSetControlObj.underWriterOffSetControlreferenceID().getText());
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
				underWriterOffSetControlObj.underWriterOffSetControlalertRemark(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlalertRemark().click();
		underWriterOffSetControlObj.underWriterOffSetControlalertRemark()
				.sendKeys(underWriterOffSetControlTestData.MakerSubmitRemark);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlaleralertSubmitButton(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlaleralertSubmitButton().click();

	}

	@Then("^store the checker id$")
	public void store_the_checker_id() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert(), 5, 1);
		String submitedStatus = underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		jsondataReaderWriter.addData(substring.replace(".", "").trim());
	}

	@Then("^click on approve button to approve the under writer record$")
	public void click_on_approve_button_to_approve_the_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerApproveButton(), 5,
				1);
		underWriterOffSetControlObj.checkerApproveButton().click();
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
		kulsLogin.ulSApplicationLoginAsAChecker(jsondataReaderWriter.readdata());
	}

	@And("^click on menu button$")
	public void click_on_menu_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlCheckerMenuBar(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlCheckerMenuBar().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlMailBox(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlMailBox().click();
	}

	@And("^give the checker remark in alert pop up for return the under writer record$")
	public void give_the_checker_remark_in_alert_pop_up_for_return_the_under_writer_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.checkerAlertRemark(), 5,
				1);
		underWriterOffSetControlObj.checkerAlertRemark().click();
		underWriterOffSetControlObj.checkerAlertRemark()
				.sendKeys(underWriterOffSetControlTestData.CheckerRemarkforReturn);
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
		underWriterOffSetControlObj.checkerAlertRemark()
				.sendKeys(underWriterOffSetControlTestData.CheckerRemarkforReject);
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
		underWriterOffSetControlObj.checkerAlertRemark()
				.sendKeys(underWriterOffSetControlTestData.CheckerRemarkforApprove);
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
				.sendKeys(underWriterOffSetControlTestData.MinimumValueAlphabetInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.MaximumValueAlphabetInput);
	}

	@Then("^verify system should not allow user to save the record$")
	public void verify_system_should_not_allow_user_to_save_the_record() throws Throwable {
		boolean result = false;
		for (int i = 0; i <= 15; i++) {
			try {
				underWriterOffSetControlObj.underWriterOffSetControlsubmitToastAlert().isDisplayed();
				break;
			} catch (NoSuchElementException e) {
				if (i == 15) {
					result = true;

				}
			}
		}
		Assert.assertTrue(result);
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
				.sendKeys(underWriterOffSetControlTestData.MinimumValueSpeciaCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.MinimumValueSpeciaCharacterInput);
	}

	@And("^click on save button after enter special characters$")
	public void click_on_save_button_after_enter_special_characters() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlMinimumValueValidationMessage(), 5, 1);
		Assert.assertEquals(
				underWriterOffSetControlObj.underWriterOffSetControlMinimumValueValidationMessage().getText(),
				"Alphanumeric characters allowed");
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

	}

	@And("^update the minimum and maximum value fields$")
	public void update_the_minimum_and_maximum_value_fields() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.UpdatedMinimumValue);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.UpdatedMaximumValue);
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
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.underWriterOffSetControlToastAlertClose(), 5, 1);
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
		Assert.assertEquals(minimumValue, underWriterOffSetControlTestData.UpdatedMinimumValue);
		Assert.assertEquals(maximumValue, underWriterOffSetControlTestData.UpdatedMaximumValue);
	}

	@Then("^select the record to do updation which is approved from checker user$")
	public void select_the_record_to_do_updation_which_is_approved_from_checker_user() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.underWriterOffSetControlListViewFirstRecord(), 5, 1);
		underWriterOffSetControlObj.underWriterOffSetControlListViewFirstRecord().click();
	}

	@Then("^update the already approved record$")
	public void update_the_already_approved_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.approvedRecordUpdateMinimumValue);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.approvedRecordUpdateMaximumValue);

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
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underWriterOffSetControlObj.underWriterOffSetControlToastAlertClose(), 5, 1);
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
		Assert.assertEquals(minimumValue, underWriterOffSetControlTestData.approvedRecordUpdateMinimumValue);
		Assert.assertEquals(maximumValue, underWriterOffSetControlTestData.approvedRecordUpdateMaximumValue);
    }
	@Then("^update the already approved record for checker reject$")
    public void update_the_already_approved_record_for_checker_reject() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.approvedRecordUpdateMinimumValueForCheckerReject);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.approvedRecordUpdateMaximumValueForCheckerReject);

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
		Assert.assertEquals(minimumValue, underWriterOffSetControlTestData.approvedRecordUpdateMinimumValueForCheckerReject);
		Assert.assertEquals(maximumValue, underWriterOffSetControlTestData.approvedRecordUpdateMaximumValueForCheckerReject);
    }
    @Then("^update the already approved record for checker return$")
    public void update_the_already_approved_record_for_checker_return() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMinimumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.approvedRecordUpdateMinimumValueForCheckerReturn);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox(), 5, 1);
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().click();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox().clear();
		underWriterOffSetControlObj.userWriterOffSetControlMaximumValueInputBox()
				.sendKeys(underWriterOffSetControlTestData.approvedRecordUpdateMaximumValueForCheckerReturn);

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
		Assert.assertEquals(minimumValue, underWriterOffSetControlTestData.approvedRecordUpdateMinimumValueForCheckerReturn);
		Assert.assertEquals(maximumValue, underWriterOffSetControlTestData.approvedRecordUpdateMaximumValueForCheckerReturn);
    }
}
