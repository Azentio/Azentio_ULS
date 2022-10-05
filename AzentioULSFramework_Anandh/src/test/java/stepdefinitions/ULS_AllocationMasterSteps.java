package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.KULS_CommonWebElements;
import pageobjects.ULS_AllocationMasterObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.ULS_AllocationMasterTestData;

public class ULS_AllocationMasterSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ULS_AllocationMasterObj allocationMasterObj = new ULS_AllocationMasterObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ULS_AllocationMasterTestData allocationMasterTestData = jsonConfig.getAllocationTestDataByName("Maker");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	KULS_CommonWebElements ulsCommonWebElement = new KULS_CommonWebElements(driver);
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();

	@And("^click on temp view near by allocation master screen$")
	public void click_on_temp_view_near_by_allocation_master_screen() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(allocationMasterObj.ulsAllocationMasterTempView());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		allocationMasterObj.ulsAllocationMasterTempView().click();
	}

	@And("^select the first record of temp view in allocation master screen$")
	public void select_the_first_record_of_temp_view_in_allocation_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.ulsAllocationMasterTempViewFirstRecord(), 10, 1);
		allocationMasterObj.ulsAllocationMasterTempViewFirstRecord().click();
	}

	@Then("^verify user can able to see the save button in allocation master screen$")
	public void verify_user_can_able_to_see_the_save_button_in_allocation_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMasterObj.allocationMatserSaveButton(), 10,
				1);
		Assert.assertTrue(allocationMasterObj.allocationMatserSaveButton().isDisplayed());
	}

	@Then("^verify user can able to see the back button in allocation master screen$")
	public void verify_user_can_able_to_see_the_back_button_in_allocation_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMasterObj.allocationMasterBackButton(), 10,
				1);
		Assert.assertTrue(allocationMasterObj.allocationMasterBackButton().isDisplayed());
	}

	@Then("^verify user can able to see the Description field in allocation master screen$")
	public void verify_user_can_able_to_see_the_description_field_in_allocation_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterDescriptionInputBox(), 10, 1);
		Assert.assertTrue(allocationMasterObj.allocationMasterDescriptionInputBox().isDisplayed());

	}

	@Then("^verify user can able to see the allocation code in allocation master screen$")
	public void verify_user_can_able_to_see_the_allocation_code_in_allocation_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterAllocationCodeInputBox(), 10, 1);
		Assert.assertTrue(allocationMasterObj.allocationMasterAllocationCodeInputBox().isDisplayed());

	}

	@Then("^verify user can able to see the Status field in allocation master screen$")
	public void verify_user_can_able_to_see_the_status_field_in_allocation_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMasterObj.allocationMasterStatusField(), 10,
				1);
		Assert.assertTrue(allocationMasterObj.allocationMasterStatusField().isDisplayed());
	}

	@And("^update the description field in allocation master$")
	public void update_the_description_field_in_allocation_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterDescriptionInputBox(), 10, 1);
		allocationMasterObj.allocationMasterDescriptionInputBox().clear();
		allocationMasterObj.allocationMasterDescriptionInputBox().sendKeys(allocationMasterTestData.Description);
	}

	@And("^update the allocation code field$")
	public void update_the_allocation_code_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterAllocationCodeInputBox(), 10, 1);
		allocationMasterObj.allocationMasterAllocationCodeInputBox().clear();
		allocationMasterObj.allocationMasterAllocationCodeInputBox().sendKeys(allocationMasterTestData.AllocationCode);
	}

	@And("^click on save button to update the allocation master record$")
	public void click_on_save_button_to_update_the_allocation_master_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMasterObj.allocationMatserSaveButton(), 10,
				1);
		allocationMasterObj.allocationMatserSaveButton().click();
	}

	@Then("^verify allocation master record is saved in the system$")
	public void verify_allocation_master_record_is_saved_in_the_system() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElement.ulsToastAlert(), 10, 1);

		Assert.assertEquals(ulsCommonWebElement.ulsToastAlert().getText(),
				allocationMasterTestData.SaveVerificationMessage);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElement.ulsToastAlertClose(), 10, 1);
		ulsCommonWebElement.ulsToastAlertClose().click();
	}

	@And("^click on mail box find the allocation master record$")
	public void click_on_mail_box_find_the_allocation_master_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElement.ulsMailBox(), 10, 1);
		ulsCommonWebElement.ulsMailBox().click();
		Thread.sleep(4000);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElement.ulsNotificationSerachButton(), 10,
				1);
		ulsCommonWebElement.ulsNotificationSerachButton().click();

	}

	@And("^search the allocation module event code$")
	public void search_the_allocation_module_event_code() throws Throwable {

		clicksAndActionsHelper.moveToElement(ulsCommonWebElement.ulsNotificationSearchTextBox());
		clicksAndActionsHelper.clickUsingActionClass(ulsCommonWebElement.ulsNotificationSearchTextBox(),
				ulsCommonWebElement.ulsNotificationSearchTextBox());
		ulsCommonWebElement.ulsNotificationSearchTextBox().sendKeys(allocationMasterTestData.EventCode);
	}

	@And("^select the allocation master first record$")
	public void select_the_allocation_master_first_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterNotificationFirstRecord(), 10, 1);
		allocationMasterObj.allocationMasterNotificationFirstRecord().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterFirstRecordReferernceNumber(), 10, 1);
		jsonDataReaderWriter
				.addReferanceData(allocationMasterObj.allocationMasterFirstRecordReferernceNumber().getText());
	}

	@Then("^verify updated record visible for submission$")
	public void verify_updated_record_visible_for_submission() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterDescriptionDataHolder(), 10, 1);
		Assert.assertEquals(
				allocationMasterObj.allocationMasterDescriptionDataHolder().getAttribute("ng-reflect-model"),
				allocationMasterTestData.Description);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterAllocationCodeDataHolder(), 10, 1);
		Assert.assertEquals(
				allocationMasterObj.allocationMasterAllocationCodeDataHolder().getAttribute("ng-reflect-model"),
				allocationMasterTestData.AllocationCode);

	}

	@And("^click on submit button to submit the record$")
	public void click_on_submit_button_to_submit_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElement.ulsSubmitButton(), 10, 1);
		ulsCommonWebElement.ulsSubmitButton().click();

	}

	@And("^enter the alert remark in allocation master record$")
	public void enter_the_alert_remark_in_allocation_master_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElement.ulsAlertRemark(), 10, 1);
		ulsCommonWebElement.ulsAlertRemark().click();
		ulsCommonWebElement.ulsAlertRemark().sendKeys(allocationMasterTestData.submitAlertRemark);
	}

	@And("^click on alert submit button in allocation master record$")
	public void click_on_alert_submit_button_in_allocation_master_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElement.ulsAlertSubmitButton(), 10, 1);
		ulsCommonWebElement.ulsAlertSubmitButton().click();
	}

	@And("^get the checker id for allocation master record$")
	public void get_the_checker_id_for_allocation_master_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElement.ulsToastAlert(), 10, 1);
		String checkerID = ulsCommonWebElement.ulsToastAlert().getText();
		String substring = checkerID.substring(83);
		String finalCheckerID = substring.replace(".", "").trim();
		System.out.println("Checker ID " + finalCheckerID);
		jsonDataReaderWriter.addData(finalCheckerID);

	}

	@And("^click on view icon near by allocation master screen$")
	public void click_on_view_icon_near_by_allocation_master_screen() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(allocationMasterObj.allocationMasterViewButton());
				clicksAndActionsHelper.clickUsingActionClass(allocationMasterObj.allocationMasterViewButton(),
						allocationMasterObj.allocationMasterViewButton());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^select the approved record in allocation master list view$")
	public void select_the_approved_record_in_allocation_master_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMasterObj.allocationMasterListViewEditIcon(),
				10, 1);
		allocationMasterObj.allocationMasterListViewEditIcon().click();
	}

	@And("^clear the input field of description$")
	public void clear_the_input_field_of_description() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterDescriptionDataHolder(), 10, 1);
		int length = allocationMasterObj.allocationMasterDescriptionDataHolder().getAttribute("ng-reflect-model")
				.length();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterDescriptionInputBox(), 10, 1);
		for (int i = 0; i <= length; i++) {
			allocationMasterObj.allocationMasterDescriptionInputBox().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^clear the input field of allocation code$")
	public void clear_the_input_field_of_allocation_code() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterAllocationCodeDataHolder(), 10, 1);
		int length = allocationMasterObj.allocationMasterAllocationCodeDataHolder().getAttribute("ng-reflect-model")
				.length();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterAllocationCodeInputBox(), 10, 1);
		for (int i = 0; i <= length; i++) {
			allocationMasterObj.allocationMasterAllocationCodeInputBox().sendKeys(Keys.BACK_SPACE);
		}
	}

	@And("^click on save button with out data in mandatory field in allocation master$")
	public void click_on_save_button_with_out_data_in_mandatory_field_in_allocation_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMasterObj.allocationMatserSaveButton(), 10,
				1);
		allocationMasterObj.allocationMatserSaveButton().click();

	}

	@Then("^verify mandatory field are showing validation in allocation master screen$")
	public void verify_mandatory_field_are_showing_validation_in_allocation_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterDescriptionFieldValidation(), 10, 1);
		Assert.assertEquals(allocationMasterObj.allocationMasterDescriptionFieldValidation().getText(),
				allocationMasterTestData.BlankFieldVerificationMessage);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterAllocationCodeFieldvalidation(), 10, 1);
		Assert.assertEquals(allocationMasterObj.allocationMasterAllocationCodeFieldvalidation().getText(),
				allocationMasterTestData.BlankFieldVerificationMessage);
	}

	@And("^enter the special character input in description field$")
	public void enter_the_special_character_input_in_description_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterDescriptionInputBox(), 10, 1);
		allocationMasterObj.allocationMasterDescriptionInputBox().click();
		allocationMasterObj.allocationMasterDescriptionInputBox()
				.sendKeys(allocationMasterTestData.SpecialCharacterInput);

	}

	@And("^enter the special character input in allocation code field$")
	public void enter_the_special_character_input_in_allocation_code_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterAllocationCodeInputBox(), 10, 1);
		allocationMasterObj.allocationMasterAllocationCodeInputBox().click();
		allocationMasterObj.allocationMasterAllocationCodeInputBox()
				.sendKeys(allocationMasterTestData.SpecialCharacterInput);
	}

	@Then("^verify description field show the validation for special characecter$")
	public void verify_description_field_show_the_validation_for_special_characecter() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterDescriptionFieldValidation(), 10, 1);
		Assert.assertEquals(allocationMasterObj.allocationMasterDescriptionFieldValidation().getText(),
				allocationMasterTestData.SpecialCharacterVerification);

	}

	@Then("^verify allocation code field show the validation for special characecter$")
	public void verify_allocation_code_field_show_the_validation_for_special_characecter() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterAllocationCodeFieldvalidation(), 10, 1);
		Assert.assertEquals(allocationMasterObj.allocationMasterAllocationCodeFieldvalidation().getText(),
				allocationMasterTestData.SpecialCharacterVerification);
	}
	

    @And("^click on back buttonin allocation master updation screen$")
    public void click_on_back_buttonin_allocation_master_updation_screen() throws Throwable {
     waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMasterObj.allocationMasterBackButton(), 10, 1);
     allocationMasterObj.allocationMasterBackButton().click();
    }
    @Then("^verify back button is working as we expected$")
    public void verify_back_button_is_working_as_we_expected() throws Throwable {
     waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMasterObj.allocationMasterBackButtonVerification(), 10, 1);
     Assert.assertTrue(allocationMasterObj.allocationMasterBackButtonVerification().isDisplayed());
    }
}
