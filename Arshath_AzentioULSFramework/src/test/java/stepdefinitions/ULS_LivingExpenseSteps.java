package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.ULS_LivingExpenseParameterObj;
import pageobjects.Warehouse_MasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;


public class ULS_LivingExpenseSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ULS_LivingExpenseParameterObj livingExpenseParameterObj = new ULS_LivingExpenseParameterObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	//ULS_LivingExpenseTestData livingExpenseTestData = jsonConfig.getLivingExpenseTestDataByName("Maker");
	ConfigFileReader configFileReader = new ConfigFileReader();
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00075\\Downloads\\UlsTestDataDesign.xlsx",
			"LivingExpenseMasterTestdaa", "Data Set ID");
	Map<String, String> testData;
	Warehouse_MasterObj warehousrobj = new Warehouse_MasterObj(driver);
	
	@And("^go to other master main module$")
	public void go_to_other_master_main_module() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseParameterObj.ulsOtherMasterMainMenu(), 10,
				1);
		livingExpenseParameterObj.ulsOtherMasterMainMenu().click();
	}

	@And("^click on view button in living expense module$")
	public void click_on_view_button_in_living_expense_module() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(livingExpenseParameterObj.ulsLivingExpenseViewButton());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^select the approved record of living expense$")
	public void select_the_approved_record_of_living_expense() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpenseFirstApprovedRecord(), 10, 1);
		livingExpenseParameterObj.livingExpenseFirstApprovedRecord().click();
	}

	@And("^go to living expese parameter tab$")
	public void go_to_living_expese_parameter_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseParameterObj.livingExpenseParameterTab(),
				10, 1);
		livingExpenseParameterObj.livingExpenseParameterTab().click();
	}

	@And("^select the living expense parameter approved record$")
	public void select_the_living_expense_parameter_approved_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpeseParameterFirstApprovedRecord(), 10, 1);
		livingExpenseParameterObj.livingExpeseParameterFirstApprovedRecord().click();
	}

	@And("^clear all the input fields of living expense approved record$")
	public void clear_all_the_input_fields_of_living_expense_approved_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpesneParameterDescriptionDataHolder(), 10, 1);
		String description = livingExpenseParameterObj.livingExpesneParameterDescriptionDataHolder()
				.getAttribute("ng-reflect-model");
		for (int i = 0; i < description.length(); i++) {
			livingExpenseParameterObj.livingExpesneParameterDescription().sendKeys(Keys.BACK_SPACE);
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpesneParameterValueInputBoxdataHolder(), 10, 1);
		String value = livingExpenseParameterObj.livingExpesneParameterValueInputBoxdataHolder()
				.getAttribute("ng-reflect-model");
		for (int i = 0; i < description.length(); i++) {
			livingExpenseParameterObj.livingExpesneParameterValueInputBox().sendKeys(Keys.BACK_SPACE);
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpesneParameterCodeDropDown(), 10, 1);
		livingExpenseParameterObj.livingExpesneParameterCodeDropDown().click();
		String xpath = "//ion-label[text()=' " + testData.get("Value")
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

	@And("^click on save button in living expense record$")
	public void click_on_save_button_in_living_expense_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseParameterObj.livingExpenseUpdateSave(),
				10, 1);
		livingExpenseParameterObj.livingExpenseUpdateSave().click();
	}

	@Then("^verify system should through the validation for blank field$")
	public void verify_system_should_through_the_validation_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpenseParameterDescriptionValidation(), 10, 1);
		Assert.assertEquals(livingExpenseParameterObj.livingExpenseParameterDescriptionValidation().getText(),
				testData.get("Field1"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpenseParameterValueValidation(), 10, 1);
		Assert.assertEquals(livingExpenseParameterObj.livingExpenseParameterValueValidation().getText(),
				testData.get("Field1"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpenseParameterCodeDropDownValidation(), 10, 1);
		Assert.assertEquals(livingExpenseParameterObj.livingExpenseParameterCodeDropDownValidation().getText(),
				testData.get("Field1"));
	}

	@And("^enter invalid special charecter in input box$")
	public void enter_invalid_special_charecter_in_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpesneParameterDescription(), 10, 1);
		livingExpenseParameterObj.livingExpesneParameterDescription()
				.sendKeys(testData.get("Invaliddata"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpesneParameterValueInputBox(), 10, 1);
		livingExpenseParameterObj.livingExpesneParameterValueInputBox()
				.sendKeys(testData.get("Invaliddata"));
	}

	@Then("^verify system should through the validation in living expense parameter screen$")
	public void verify_system_should_through_the_validation_in_living_expense_parameter_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpenseParameterDescriptionValidation(), 10, 1);
		Assert.assertEquals(livingExpenseParameterObj.livingExpenseParameterDescriptionValidation().getText(),
				testData.get("Field2"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpenseParameterValueValidation(), 10, 1);
		Assert.assertEquals(livingExpenseParameterObj.livingExpenseParameterValueValidation().getText(),
				testData.get("Field2"));
	}

	@And("^click on back button in living expense parameter screen$")
	public void click_on_back_button_in_living_expense_parameter_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpenseParameterBackButton(), 10, 1);
		livingExpenseParameterObj.livingExpenseParameterBackButton().click();

	}

	@Then("^verify living expense parameter screen should get navigate to previous screen$")
	public void verify_living_expense_parameter_screen_should_get_navigate_to_previous_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseParameterObj.livingExpenseParameterList(),
				10, 1);
		Assert.assertTrue(livingExpenseParameterObj.livingExpenseParameterList().isDisplayed());
	}

	@And("^update the living expense paramater record$")
	public void update_the_living_expense_paramater_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpesneParameterDescriptionDataHolder(), 10, 1);
		String description = livingExpenseParameterObj.livingExpesneParameterDescriptionDataHolder()
				.getAttribute("ng-reflect-model");
		for (int i = 0; i < description.length(); i++) {
			livingExpenseParameterObj.livingExpesneParameterDescription().sendKeys(Keys.BACK_SPACE);
		}
		livingExpenseParameterObj.livingExpesneParameterDescription()
				.sendKeys(testData.get("UpdatedDescription"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpesneParameterValueInputBoxdataHolder(), 10, 1);
		String value = livingExpenseParameterObj.livingExpesneParameterValueInputBoxdataHolder()
				.getAttribute("ng-reflect-model");
		for (int i = 0; i < description.length(); i++) {
			livingExpenseParameterObj.livingExpesneParameterValueInputBox().sendKeys(Keys.BACK_SPACE);
		}
		livingExpenseParameterObj.livingExpesneParameterValueInputBox().sendKeys(testData.get("UpdatedValue"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpesneParameterCodeDropDown(), 10, 1);
		livingExpenseParameterObj.livingExpesneParameterCodeDropDown().click();
		String xpath = "//ion-label[text()=' " + testData.get("UpdatedCodeValue")
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

	@And("^click on mail box and find the living expense record$")
	public void click_on_mail_box_and_find_the_living_expense_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpensesubmitToastAlert(), 10, 1);
		Assert.assertEquals(livingExpenseParameterObj.livingExpensesubmitToastAlert().getText(), "Success");
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpenseToastAlertClose(), 10, 1);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseParameterObj.livingExpenseMailBox(), 10,
				1);
		livingExpenseParameterObj.livingExpenseMailBox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseParameterObj.livingExpenseinboxSearch(),
				5, 1);
		livingExpenseParameterObj.livingExpenseinboxSearch().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpenseSearchTextBoxInbox(), 5, 1);
		clicksAndActionsHelper.moveToElement(livingExpenseParameterObj.livingExpenseSearchTextBoxInbox());
		clicksAndActionsHelper.clickOnElement(livingExpenseParameterObj.livingExpenseSearchTextBoxInbox());
		livingExpenseParameterObj.livingExpenseSearchTextBoxInbox().sendKeys("LIV_EXP");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseParameterObj.livingExpensereferenceID(),
				5, 1);
		livingExpenseParameterObj.livingExpensereferenceID().getText();
		System.out.println("Reference ID : " + livingExpenseParameterObj.livingExpensereferenceID().getText());
		jsonDataReaderWriter.addReferanceData(livingExpenseParameterObj.livingExpensereferenceID().getText().trim());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseParameterObj.livingExpensefirstRecord(),
				5, 1);
		livingExpenseParameterObj.livingExpensefirstRecord().click();
	}

	@Then("^store the checker id for living expense record$")
	public void store_the_checker_id_for_living_expense_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				livingExpenseParameterObj.livingExpensesubmitToastAlert(), 5, 1);
		String submitedStatus = livingExpenseParameterObj.livingExpensesubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		jsonDataReaderWriter.addData(substring.replace(".", "").trim());
	}

	@And("^submit the living expese record$")
	public void submit_the_living_expese_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseParameterObj.livingExpenseSubmitButton(),
				10, 1);
		livingExpenseParameterObj.livingExpenseSubmitButton().click();

	}

	@Then("^give alert remark and click on submit in alert for living expense record$")
	public void give_alert_remark_and_click_on_submit_in_alert_for_living_expense_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseParameterObj.livingExpensealertRemark(),
				10, 1);
		livingExpenseParameterObj.livingExpensealertRemark().click();
		livingExpenseParameterObj.livingExpensealertRemark().sendKeys("Approved from maker");
		livingExpenseParameterObj.livingExpensealeralertSubmitButton().click();
	}
	@Given("^user login uls application checker$")
	public void user_login_uls_application_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		testData = exceldata.getTestdata("AT_LR_T019_D19");
		System.out.println(testData.get("Checker id"));
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	@Then("^User validate Living Expense approved record in list view$")
	public void user_validate_living_expense_approved_record_in_list_view() throws Throwable {

		for (int i = 0; i < 50; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("UpdatedDescription") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("UpdatedDescription"));

				break;
			} catch (Exception e) {

			}
		}
	}
	
	@Given("^user login uls application checkers$")
	public void user_login_uls_application_checkers() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		testData = exceldata.getTestdata("AT_LR_T021_D21");
		System.out.println(testData.get("Checker id"));
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	@Given("^user login uls application as checkers$")
	public void user_login_uls_application_as_checkers() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		testData = exceldata.getTestdata("AT_LR_T022_D22");
		System.out.println(testData.get("Checker id"));
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	
	@And("^user Pass the Exceldata value for Update Invalid input$")
	public void user_Pass_the_Exceldata_value_for_Update_Invalid_input() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T018_D18");
	}
	@And("^user Pass the Exceldata value for Update input$")
	public void user_Pass_the_Exceldata_value_for_Update_input() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T019_D19");
	}
	@And("^user Pass the Exceldata value for Update approve input$")
	public void user_Pass_the_Exceldata_value_for_Update_approve_input() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T020_D20");
	}
	@And("^user Pass the Exceldata value for Update Rejet input$")
	public void user_Pass_the_Exceldata_value_for_Update_reject_input() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T021_D21");
	}
	@And("^user Pass the Exceldata value for Update Return input$")
	public void user_Pass_the_Exceldata_value_for_Update_return_input() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T022_D22");
	}

	
}
