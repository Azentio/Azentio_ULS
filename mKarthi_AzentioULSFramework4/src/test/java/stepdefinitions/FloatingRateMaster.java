package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.FloatingRateMasterObject;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class FloatingRateMaster extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	FloatingRateMasterObject floatingMstObj = new FloatingRateMasterObject(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	// FloatingRateMasterTestData floatingMasterData =
	// jconfig.getFloatingRateMasterByName("Maker");
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot mandateOrNot = new FindFieldisMandatoryorNot(driver);
	// List<String> xlsList = new ArrayList<>();
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx",
			"FloatingRateMaster", "Data Set ID");
	Map<String, String> testData;
	JsonDataReaderWriter json = new JsonDataReaderWriter();

	@And("^Click the eye icon of the floating rate master$")
	public void click_the_eye_icon_of_the_floating_rate_master() throws Throwable {
		action.getJavascriptHelper().scrollIntoView(floatingMstObj.floatingMaster_EyeIcon());
		floatingMstObj.floatingMaster_EyeIcon().isDisplayed();

		for (int i = 0; i < 30; i++) {
			try {

				floatingMstObj.floatingMaster_EyeIcon().click();
				break;
			} catch (NoSuchElementException e) {
			}
		}
	}

	@Then("^Click the add button in floating rate master$")
	public void click_the_add_button_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_AddButton(), 60, 2);
		floatingMstObj.floatingMaster_AddButton().click();
		floatingMstObj.floatingMaster_AddButton().isDisplayed();

	}

	@And("^Check all the fiels are avaliable in floating rate master$")
	public void check_all_the_fiels_are_avaliable_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_IndexRateTypeField(), 60,
				2);
		floatingMstObj.floatingMaster_IndexRateTypeField().isDisplayed();
		String IndexType = floatingMstObj.floatingMaster_IndexRateTypeField().getText();
		System.out.println("Floating rate master screen  get open with below mentioned fields");
		System.out.println(IndexType);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_IndexRateField(), 60, 2);
		floatingMstObj.floatingMaster_IndexRateField().isDisplayed();
		String IndexRate = floatingMstObj.floatingMaster_IndexRateField().getText();
		System.out.println(IndexRate);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_ValidFromField(), 60, 2);
		floatingMstObj.floatingMaster_ValidFromField().isDisplayed();
		String ValidFrom = floatingMstObj.floatingMaster_ValidFromField().getText();
		System.out.println(ValidFrom);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_RemarksField(), 60, 2);
		floatingMstObj.floatingMaster_RemarksField().isDisplayed();
		String Remark = floatingMstObj.floatingMaster_RemarksField().getText();
		System.out.println(Remark);

	}

	@Then("^To verify the red astriek mark on all the mandatory fields$")
	public void to_verify_the_red_astriek_mark_on_all_the_mandatory_fields() throws Throwable {
		mandateOrNot.verifyGivenFieldisMandatoryOrNot("Index Rate Type");
		mandateOrNot.verifyGivenFieldisMandatoryOrNot("Index Rate");
		mandateOrNot.verifyGivenFieldisMandatoryOrNot("Valid From");
		mandateOrNot.verifyGivenFieldisMandatoryOrNot("Remarks");
	}

	@And("^Select the Index Rate type$")
	public void select_the_index_rate_type() throws Throwable {
		testData = excelData.getTestdata("AT-FRM-T001_D2");

		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_IndexRateTypeDropdown(),
				60, 2);
		clickAndAction.moveToElement(floatingMstObj.floatingMaster_IndexRateTypeDropdown());
		floatingMstObj.floatingMaster_IndexRateTypeDropdown().click();
		String xpath = "//ion-label[text()=' " + testData.get("IndexRateType") + " ']/following-sibling::ion-radio";
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@Then("^Enter the Index rate$")
	public void enter_the_index_rate() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_IndexRate(), 30, 2);

		for (int i = 0; i < 50; i++) {
			try {
				floatingMstObj.floatingMaster_IndexRate().click();
				floatingMstObj.floatingMaster_IndexRate().sendKeys(testData.get("IndexRate"));
				break;
			} catch (ElementNotInteractableException e) {

			}
		}
	}

	@And("^Choose the valid form date$")
	public void choose_the_valid_form_date() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_ValidFormCalendar(), 60,
				2);
		floatingMstObj.floatingMaster_ValidFormCalendar().click();

		for (int i = 0; i < 100; i++) {
			try {
				driver.findElement(By.xpath("//button[contains(text(),'" + testData.get("CalenderMonth") + "')]"));
				break;
			} catch (Exception e) {

				action.getJavascriptHelper().JSEClick(floatingMstObj.floatingMaster_MonthNextArrow());
			}
		}

		Thread.sleep(4000);
		List<WebElement> calendar = driver
				.findElements(By.xpath("//td/span[text()='" + testData.get("CalenderDate") + "']"));
		for (WebElement element : calendar) {
			try {
				element.click();
				break;
			} catch (Exception e) {

			}
		}
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// floatingMstObj.floatingMaster_CalendarToday(), 60, 2);
		// floatingMstObj.floatingMaster_CalendarToday().click();
	}

	@Then("^Enter the remark$")
	public void enter_the_remark() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_Remarks(), 60, 2);
		floatingMstObj.floatingMaster_Remarks().click();
		floatingMstObj.floatingMaster_Remarks().sendKeys(testData.get("Remark"));
	}

	@And("^Save the record$")
	public void save_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_Save(), 60, 2);
		floatingMstObj.floatingMaster_Save().click();
		// String popup=floatingMstObj.floatingMaster_SavePopUp().getText();
		// System.out.println("The system displays the confirmation message post
		// clicking on Save button"+ popup);
		// Assert.assertEquals("Success", popup);

	}

	@Then("^Cancel the popup$")
	public void cancel_the_popup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_AlertClose(), 60, 2);
		floatingMstObj.floatingMaster_AlertClose().click();
	}

	@And("^Save the record in floating rate master$")
	public void save_the_record_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_Save(), 60, 2);
		floatingMstObj.floatingMaster_Save().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_SavePopUp(), 30, 5);
		String popup = floatingMstObj.floatingMaster_SavePopUp().getText();
		System.out.println("The system displays the confirmation message post clicking on Save button" + popup);
		Assert.assertEquals("Success", popup);
	}

	@And("^Save the record captured with popup$")
	public void save_the_record_captured_with_popup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_update(), 60, 2);
		floatingMstObj.floatingMaster_update().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_SavePopUp(), 30, 5);
		String popup = floatingMstObj.floatingMaster_SavePopUp().getText();
		System.out.println("The system displays the confirmation message post clicking on Save button" + popup);
		// Assert.assertEquals("success", popup);
		Assert.assertTrue(popup.contains("Success"));
		Thread.sleep(2000);
	}

	@Then("^Click the active record in temp view tab$")
	public void click_the_active_record_in_temp_view_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_TempViewactiverecord(),
				60, 2);
		floatingMstObj.floatingMaster_TempViewactiverecord().click();

	}

	@And("^Click the temp view button in floating rate master$")
	public void click_the_temp_view_button_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_tempviewbuttonButton(),
				60, 2);
		floatingMstObj.floatingMaster_tempviewbuttonButton().click();
	}

	@Then("^Click the pencil icon$")
	public void click_the_pencil_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_PencilIcon(), 30, 5);
		clickAndAction.moveToElement(floatingMstObj.floatingMaster_PencilIcon());
		floatingMstObj.floatingMaster_PencilIcon().click();
	}

	@And("^Submit the record$")
	public void submit_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_Submit(), 60, 2);
		action.getJavascriptHelper().JSEClick(floatingMstObj.floatingMaster_Submit());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_SubmitOKButton(), 60, 2);
		floatingMstObj.floatingMaster_SubmitOKButton().click();
		// floatingMstObj.floatingMaster_SubmitOKButton().sendKeys("ok");
		// floatingMstObj.floatingMaster_SubmitOKButton().sendKeys(Keys.ENTER);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_FinalSubmitButton(), 60,
				2);
		floatingMstObj.floatingMaster_FinalSubmitButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_PopUp(), 60, 2);
		String popup = floatingMstObj.floatingMaster_PopUp().getText();
		System.out.println("The system displays the confirmation message post clicking on Cancel button" + popup);
		// System.err.println();
		//
	}

//******Cancel Button*********//
	@And("^verify the cancel button$")
	public void verify_the_cancel_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_CancelButton(), 60, 2);
		floatingMstObj.floatingMaster_CancelButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_SubmitcanceButton(), 60,
				2);
		floatingMstObj.floatingMaster_SubmitcanceButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_FinalcanceButton(), 60,
				2);
		floatingMstObj.floatingMaster_FinalcanceButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_PopUp(), 60, 2);
		String popup = floatingMstObj.floatingMaster_PopUp().getText();
		System.out.println("The system displays the confirmation message post clicking on Cancel button" + popup);
		Assert.assertEquals("Record REJECTED Successfully", popup);
	}

//****Inactive to Active************///
	@Then("^Click the action icon of in_active record in floating master$")
	public void click_the_action_icon_of_inactive_record_in_floating_master() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				floatingMstObj.floatingMaster_ActionIconOfactiverecord(), 60, 2);
		for (int i = 0; i < 10; i++) {
			try {
				floatingMstObj.floatingMaster_ActionIconOfactiverecord().click();
			} catch (Exception e) {
			}
		}
	}

	@Then("^Change the status to active$")
	public void change_the_status_to_active() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_ActiveInactive(), 60, 2);
		floatingMstObj.floatingMaster_ActiveInactive().click();
	}

	@And("^Update the record in tempview$")
	public void update_the_record_in_tempview() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_tempviewupdate(), 60, 2);
		action.getJavascriptHelper().JSEClick(floatingMstObj.floatingMaster_tempviewupdate());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_SavePopUp(), 60, 2);
		String popup = floatingMstObj.floatingMaster_SavePopUp().getText();
		Assert.assertEquals(popup, "Success");
		System.out.println(popup);
	}

//*******validation************//

	@Then("^Print the validation output in floating rate master$")
	public void print_the_validation_output_in_floating_rate_master() throws Throwable {
		WebElement nameErrorMessage = driver
				.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]"));
		String expectedErrorText = "Required field";
		String actualErrorText = nameErrorMessage.getText();
		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
			System.out.println(
					"The actual and expected result are same.The Popup validation message is" + actualErrorText);
		} else {
			System.out.println(
					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
		}
		Assert.assertEquals(actualErrorText, "Required field");

	}

	@And("^Check the functionality of invalid input$")
	public void check_the_functionality_of_invalid_input() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_IndexRate(), 60, 2);
		floatingMstObj.floatingMaster_IndexRate().click();
		floatingMstObj.floatingMaster_IndexRate().sendKeys("1234567890");
		WebElement errorPopUp = driver
				.findElement(By.xpath("//ion-badge[contains(text(),'Maximum 8 characters are allowed')]"));
		String expectedErrorText = "Maximum 8 characters are allowed";
		String actualErrorText = errorPopUp.getText();
		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
			System.out.println(
					"The system was not allow the record to save as we enter the invalid details.The Popup validation message is"
							+ actualErrorText);
		} else {
			System.out.println(
					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
		}
		Assert.assertEquals(actualErrorText, "Maximum 8 characters are allowed");

	}

	@Then("^Check the functionality of back button$")
	public void check_the_functionality_of_back_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_BackButton(), 60, 2);
		floatingMstObj.floatingMaster_BackButton().click();
	}

	@And("^Save the record for validation$")
	public void save_the_record_for_validation() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_Save(), 60, 2);
		floatingMstObj.floatingMaster_Save().click();
	}

//******************List view validation***********************//
	@Then("^To verify the values in List view should be non editable in floating rate master$")
	public void to_verify_the_values_in_list_view_should_be_non_editable_in_floating_rate_master() throws Throwable {
		String xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]";
		// action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (NoSuchElementException e) {
			System.out.println("Verified status field is not editable only displayable");
		}
	}

	@Then("^To verify the functionality of Search box with matching data in a floating rate master$")
	public void to_verify_the_functionality_of_search_box_with_matching_data_in_a_floating_rate_master()
			throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				floatingMstObj.FloatingMaster_ListViewSearch().click();
				break;
			} catch (Exception e) {

			}
		}

		floatingMstObj.FloatingMaster_ListViewSearchText().click();
		floatingMstObj.FloatingMaster_ListViewSearchText().sendKeys("111");
		floatingMstObj.floatingMaster_IndexRate().getText();
		Assert.assertEquals(floatingMstObj.floatingMaster_IndexRate().isDisplayed(), true);
	}

	@And("^To verify the functionality of Search box with mismatch data in floating rate master$")
	public void to_verify_the_functionality_of_search_box_with_mismatch_data_in_floating_rate_master()
			throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				floatingMstObj.FloatingMaster_ListViewSearch().click();
				break;
			} catch (Exception e) {

			}
		}
		floatingMstObj.FloatingMaster_ListViewSearchText().click();
		floatingMstObj.FloatingMaster_ListViewSearchText().sendKeys("###");
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

	@And("^To verify the functionality of Export to Excel button in floating rate master$")
	public void to_verify_the_functionality_of_export_to_excel_button_in_floating_rate_master() throws Throwable {
		List<String> xlsList = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			try {
				floatingMstObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, floatingMstObj.exportToPDF(), 60, 3);
		floatingMstObj.exportToPDF().click();
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
			if (fileName.getName().equalsIgnoreCase("FloatingRateMasterFile.pdf")) {
				System.out.println("Downloaded file present in system");
				break;
			} else if (i == length - 1) {
				System.out.println("Downloaded file present does not exist in system");
			}

		}
		action.getBrowserHelper().switchToParentWithChildClose();
	}

	@Then("^To verify the functionality of Export to PDF button in floating rate master$")
	public void to_verify_the_functionality_of_export_to_pdf_button_in_floating_rate_master() throws Throwable {
		List<String> xlsList = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			try {
				floatingMstObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		action.getClickAndActionsHelper().moveToElement(floatingMstObj.exportToExcel());
		floatingMstObj.exportToExcel().click();
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

	@Then("^Click the inbox in Floating rate master$")
	public void click_the_inbox_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.Inbox(), 60, 2);
		floatingMstObj.Inbox().click();
	}

	@Then("^Get the reference id and store it in json in floating rate master$")
	public void get_the_reference_id_and_store_it_in_json_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.GetRefId(), 60, 2);
		String RefId = floatingMstObj.GetRefId().getText();
		System.out.println(RefId);
		json.addReferanceData(RefId);
	}

	@And("^Search the record in Floating rate master$")
	public void search_the_record_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.SeachButton(), 60, 2);
		floatingMstObj.SeachButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.SearchText(), 60, 2);
		action.getClickAndActionsHelper().moveToElement(floatingMstObj.SearchText());
		floatingMstObj.SearchText().click();
		floatingMstObj.SearchText().sendKeys("FLOAT_RATE_MST");

	}

	@And("^Click the action icon of respective floating rate master$")
	public void click_the_action_icon_of_respective_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.ActionIcon(), 60, 2);
		floatingMstObj.ActionIcon().click();
	}

//***********Checker Approve****************************///

	@Given("^Get the url and login as a checker in floationg rate master$")
	public void get_the_url_and_login_as_a_checker_in_floationg_rate_master() throws Throwable {
		String kulsApplicationUrl = configFileRead.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		System.out.println(json.readdata());
		testData = excelData.getTestdata("AT-FRM-T002_D1");
		login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}

	@Then("^Click the inbox in floating rate master checker$")
	public void click_the_inbox_in_floating_rate_master_checker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.Checker_Inbox(), 60, 2);
		floatingMstObj.Checker_Inbox().click();
	}

	@Then("^click the approve button in the floating rate master$")
	public void click_the_approve_button_in_the_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.CheckerApproveButton(), 60, 2);
		floatingMstObj.CheckerApproveButton().click();
	}

	@Then("^Click the final approve button in floating rate master$")
	public void click_the_final_approve_button_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.CheckerFinalApprove(), 60, 2);
		floatingMstObj.CheckerFinalApprove().click();
	}

	@And("^Search the reference id and click the respective action icon in floating rate master$")
	public void search_the_reference_id_and_click_the_respective_action_icon_in_floating_rate_master()
			throws Throwable {
		String reference = null;
		for (int i = 0; i < 200; i++) {
			try {
				reference = floatingMstObj.FloatingReferanceId().getText();
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.firstEditIconInListView(), 60, 2);

		floatingMstObj.firstEditIconInListView().click();

		excelData.updateTestData("AT-FRM-T002_D1", "Reference ID", reference);
		json.addReferanceData(reference);
		System.out.println(reference);
	}

	@And("^Select the remark to approve the record in floating rate master$")
	public void select_the_remark_to_approve_the_record_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.CheckerAlertApprove(), 60, 2);
		floatingMstObj.CheckerAlertApprove().click();
	}

	@And("^verify the record got approved in the floating rate master$")
	public void verify_the_record_got_approved_in_the_floating_rate_master() throws Throwable {
		String Toast;
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.checkerApproveMgs(), 60, 2);
		Toast = floatingMstObj.checkerApproveMgs().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}

	@Then("^Get the checker id and store it in a excel$")
	public void get_the_checker_id_and_store_it_in_a_excel() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.Checker_Id(), 60, 2);
		String sucessmgs = floatingMstObj.Checker_Id().getText();
		System.out.println(sucessmgs);
		String Space = " ";
		String split[] = sucessmgs.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		Thread.sleep(1000);
		excelData.updateTestData("AT-FRM-T001_D1", "Checker id", popupID);

		System.out.println(popupID);

		testData = excelData.getTestdata("AT-FRM-T001_D1");
		// json.addData(popupID);

	}

//*******************Checker reject***********************///
	@Then("^click the reject button in the floating rate master$")
	public void click_the_reject_button_in_the_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.CheckerRejectButton(), 60, 2);
		floatingMstObj.CheckerRejectButton().click();
	}

	@Then("^Click the final reject button in floating rate master$")
	public void click_the_final_reject_button_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.CheckerFinalReject(), 60, 2);
		floatingMstObj.CheckerFinalReject().click();

	}

	@And("^Select the remark to reject the record in floating rate master$")
	public void select_the_remark_to_reject_the_record_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.CheckerAlertReject(), 60, 2);
		floatingMstObj.CheckerAlertReject().click();
	}

	@And("^verify the record rejected in the floating rate master$")
	public void verify_the_record_rejected_in_the_floating_rate_master() throws Throwable {
		String Toast;
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.checkerApproveMgs(), 60, 2);
		Toast = floatingMstObj.checkerApproveMgs().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record REJECTED Successfully");
	}

//**********Checker Reuturn********************///
	@Then("^click the return button in the floating rate master$")
	public void click_the_return_button_in_the_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.CheckerReturnButton(), 60, 2);
		floatingMstObj.CheckerReturnButton().click();
	}

	@Then("^Click the final return button in floating rate master$")
	public void click_the_final_return_button_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.FinalReturn(), 60, 2);
		floatingMstObj.FinalReturn().click();
	}

	@And("^Select the remark to return the record in floating rate master$")
	public void select_the_remark_to_return_the_record_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.CheckerAlertReturn(), 60, 2);
		floatingMstObj.CheckerAlertReturn().click();
	}

	@And("^verify the record returned to maker in the floating rate master$")
	public void verify_the_record_returned_to_maker_in_the_floating_rate_master() throws Throwable {
		String Toast;
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.checkerApproveMgs(), 60, 2);
		Toast = floatingMstObj.checkerApproveMgs().getText();
		System.out.println(Toast);
	}
//**********************Modification Validation************************//

	@Then("^Select the first record in temp view of floating rate master$")
	public void select_the_first_record_in_temp_view_of_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_TempFistEditIcon(), 60,
				2);
		floatingMstObj.floatingMaster_TempFistEditIcon().click();
	}

	@Then("^Validate the blank field popup in  floating rate master$")
	public void validate_the_blank_field_popup_in_floating_rate_master() throws Throwable {

		WebElement nameErrorMessage = driver
				.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]"));
		String expectedErrorText = "Required field";
		String actualErrorText = nameErrorMessage.getText();
		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
			System.out.println(
					"The actual and expected result are same.The Popup validation message is" + actualErrorText);
		} else {
			System.out.println(
					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
		}
		Assert.assertEquals("Required field", actualErrorText);
	}

	@Then("^click and pass the invalid details for index rate in floating rate$")
	public void click_and_pass_the_invalid_details_for_index_rate_in_floating_rate() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_IndexRate(), 60, 2);
		floatingMstObj.floatingMaster_IndexRate().click();
		System.out.println(testData.get("IndexRate"));
		for (int i = 0; i < 40; i++) {
			floatingMstObj.floatingMaster_IndexRate().sendKeys(Keys.BACK_SPACE);
		}
		floatingMstObj.floatingMaster_IndexRate().sendKeys(testData.get("IndexRate"));
	}

	@And("^click the temp view in floating rate master$")
	public void click_the_temp_view_in_floating_rate_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_TempView(), 60, 2);
		floatingMstObj.floatingMaster_TempView().click();
	}

	@And("^click and choose the select fied in index rate type and make that field as blank$")
	public void click_and_choose_the_select_fied_in_index_rate_type_and_make_that_field_as_blank() throws Throwable {
		System.out.println(testData.get("IndexRateType"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.IndexRateTypeModi(), 60, 2);
		action.getClickAndActionsHelper().moveToElement(floatingMstObj.IndexRateTypeModi());
		floatingMstObj.IndexRateTypeModi().click();
		String xpath = "//ion-label[text()=' " + testData.get("IndexRateType") + " ']/following-sibling::ion-radio";
		for (int i = 0; i < 100; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Validate the the invalid detail popup in floating rate master$")
	public void validate_the_the_invalid_detail_popup_in_floating_rate_master() throws Throwable {
		WebElement errorPopUp = driver
				.findElement(By.xpath("//ion-badge[contains(text(),' Maximum allowed length is 8')]"));
		String expectedErrorText = "Maximum allowed length is 8";
		String actualErrorText = errorPopUp.getText();
		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
			System.out.println(
					"The system was not allow the record to save as we enter the invalid details.The Popup validation message is"
							+ actualErrorText);
		} else {
			System.out.println(
					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
		}
		Assert.assertEquals("Maximum allowed length is 8", actualErrorText);
	}

	@And("^Choose the row number in mexcel sheet$")
	public void choose_the_row_number_in_mexcel_sheet() throws Throwable {
		testData = excelData.getTestdata("AT-FRM-T008_D1");

	}

	@And("^Update the record for validation while modifying$")
	public void update_the_record_for_validation_while_modifying() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_update(), 60, 2);
		floatingMstObj.floatingMaster_update().click();
	}

	@Then("^Click and modify the field index rate$")
	public void click_and_modify_the_field_index_rate() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_IndexRate(), 60, 2);
		floatingMstObj.floatingMaster_IndexRate().click();
		System.out.println(testData.get("IndexRate"));
		for (int i = 0; i < 40; i++) {
			floatingMstObj.floatingMaster_IndexRate().sendKeys(Keys.BACK_SPACE);
		}
		floatingMstObj.floatingMaster_IndexRate().sendKeys(testData.get("IndexRate"));
	}

	@And("^Choose the row number in excel sheet for modification before approving the record$")
	public void choose_the_row_number_in_excel_sheet_for_modification_before_approving_the_record() throws Throwable {
		testData = excelData.getTestdata("AT-FRM-T007_D1");

	}

	@And("^click and modify the field index rate type$")
	public void click_and_modify_the_field_index_rate_type() throws Throwable {
		System.out.println(testData.get("IndexRateType"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.IndexRateTypeModi(), 60, 2);
		action.getClickAndActionsHelper().moveToElement(floatingMstObj.IndexRateTypeModi());
		floatingMstObj.IndexRateTypeModi().click();
		String xpath = "//ion-label[text()=' " + testData.get("IndexRateType") + " ']/following-sibling::ion-radio";
		for (int i = 0; i < 100; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Click and modify the remark$")
	public void click_and_modify_the_remark() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, floatingMstObj.floatingMaster_Remarks(), 60, 2);
		floatingMstObj.floatingMaster_Remarks().click();
		System.out.println(testData.get("Remark"));
		for (int i = 0; i < 40; i++) {
			floatingMstObj.floatingMaster_Remarks().sendKeys(Keys.BACK_SPACE);
		}
		floatingMstObj.floatingMaster_Remarks().sendKeys(testData.get("Remark"));
	}

}
