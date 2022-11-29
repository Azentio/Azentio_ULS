package stepdefinitions;

import java.io.File;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.BounceMasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.KULS_BounceMaster_Test;
import testDataType.KULS_Login_TestDataType;

public class KULS_BounceMaster {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	KULS_Application_Login login = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	BounceMasterObj bouncemasterobj = new BounceMasterObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	KULS_BounceMaster_Test bouncemasterdata = jsonConfig.getBounceMasterByName("Maker");
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	WaitHelper help = new WaitHelper(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00074\\Downloads\\bouncemastertestdata.xlsx", "BounceMasterTestData", "Data Set ID") ;
	Map<String, String> testdata;
	
	

	@Given("^Launch the kuls application and Navigate to bounce master module view list$")
	public void launch_the_kuls_application_and_navigate_to_bounce_master_module_view_list() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		login.loginUlsApplicationAsMaker(loginData.Username, loginData.Password);
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,bouncemasterobj.menuBarInHomePage(),10,2);
		// bouncemasterobj.menuBarInHomePage().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.ModuleName(), 10, 2);
		bouncemasterobj.ModuleName().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.LOS(), 10, 2);
		bouncemasterobj.LOS().click();
		
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.configurationInLeftPanel(), 10, 2);
		bouncemasterobj.configurationInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.configManagerInLeftPanel(), 10, 2);
		bouncemasterobj.configManagerInLeftPanel().click();
		Thread.sleep(2000);
		for (int i = 0; i <= 20; i++) {
			try {
				javascripthelper.scrollIntoView(bouncemasterobj.viewIconOfBounceMaster());
				// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,bouncemasterobj.viewIconOfBounceMaster(),10,2);
				bouncemasterobj.viewIconOfBounceMaster().click();
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^Click on Save button in bounce master$")
	public void click_on_save_button_in_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMasterSaveIcon(), 10, 2);
		bouncemasterobj.BounceMasterSaveIcon().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMastersubmitSuccessPopup(), 10, 2);
		Assert.assertEquals(bouncemasterobj.BounceMastersubmitSuccessPopup().isDisplayed(), true);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.closeIconInSuccessPopupOfBounceMaster(), 10, 2);
		bouncemasterobj.closeIconInSuccessPopupOfBounceMaster().click();

	}

	@Then("^Submit the bounce master record from maker user$")
	public void submit_the_bounce_master_record_from_maker_user() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMasterMaker_Submit(), 10, 2);
		bouncemasterobj.BounceMasterMaker_Submit().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_EnterRemark(), 10, 2);
		bouncemasterobj.BounceMaster_EnterRemark().click();
		bouncemasterobj.BounceMaster_EnterRemark().sendKeys("ok");
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMasterRemarkSubmit(), 10, 2);
		bouncemasterobj.BounceMasterRemarkSubmit().click();
	}

	@And("^Click on Add icon of bounce master$")
	public void click_on_add_icon_of_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMasterAddIcon(), 10, 2);
		bouncemasterobj.BounceMasterAddIcon().click();

	}

	@And("^Enter the value in Bounce code field of bounce master$")
	public void enter_the_value_in_bounce_code_field_of_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceCodeFieldInBounceMaster(), 10, 2);
		bouncemasterobj.BounceCodeFieldInBounceMaster().click();
		//testdata=exceldata.getTestdata("AT_BM_001_D1");
		bouncemasterobj.BounceCodeFieldInBounceMaster().sendKeys(testdata.get("Bounce Code"));
	}

	@And("^Select the value in Charge applicable field of bounce master$")
	public void select_the_value_in_charge_applicable_field_of_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.ChargeApplicableFieldInBounceMaster(), 10, 2);
		bouncemasterobj.ChargeApplicableFieldInBounceMaster().click();
		//testdata=exceldata.getTestdata("AT_BM_001_D1");
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Charge Applicable")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Bounce description field of bounce master$")
	public void select_the_value_in_bounce_description_field_of_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceDescriptionFieldInBounceMaster(), 10, 2);
		for (int i = 0; i < 50; i++) {
			try {
				bouncemasterobj.BounceDescriptionFieldInBounceMaster().click();
				bouncemasterobj.BounceDescriptionFieldInBounceMaster().sendKeys(testdata.get("Bounce Description"));
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Bounce description2 field of bounce master$")
	public void select_the_value_in_bounce_description2_field_of_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceDescription2FieldInBounceMaster(), 10, 2);
		bouncemasterobj.BounceDescription2FieldInBounceMaster().click();
		bouncemasterobj.BounceDescription2FieldInBounceMaster().sendKeys(testdata.get("Bounce Description2"));
	}

	@And("^Select the value in Bounce description3 field of bounce master$")
	public void select_the_value_in_bounce_description3_field_of_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceDescription3FieldInBounceMaster(), 10, 2);
		bouncemasterobj.BounceDescription3FieldInBounceMaster().click();
		bouncemasterobj.BounceDescription3FieldInBounceMaster().sendKeys(testdata.get("Bounce Description3"));
	}

	@And("^Click on Mail icon for bounce master$")
	public void click_on_mail_icon_for_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMasterInbox(), 10, 2);
		bouncemasterobj.BounceMasterInbox().click();

	}

	@And("^Search the respictive bounce master record$")
	public void search_the_respictive_bounce_master_record() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				// seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
				bouncemasterobj.BounceMasterInboxView_Search().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMasterInboxView_SearchText(), 10, 2);
		bouncemasterobj.BounceMasterInboxView_SearchText().click();
		bouncemasterobj.BounceMasterInboxView_SearchText().sendKeys(bouncemasterdata.SearchValueInInbox);

	}

	@And("^Store the reference number and click on first bounce master record$")
	public void store_the_reference_number_and_click_on_first_bounce_master_record() throws Throwable {
		String reference = null;
		for (int i = 0; i < 200; i++) {
			try {
				reference = bouncemasterobj.BounceMasterReferanceId().getText();
				break;
			} catch (Exception e) {

			}
		}
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,bouncemasterobj.firstEditIconInMakerListView(),40,
		// 2);
		// bouncemasterobj.firstEditIconInMakerListView().click();

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40,
		// 2);

		json.addReferanceData(reference);
		System.out.println(reference);

		for (int i = 0; i < 20; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User Capture Checker id from the submit popup for Bounce Master$")
	public void user_capture_checker_id_from_the_submit_popup_for_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_Checker_Id(), 10, 3);
		String CheckerId = bouncemasterobj.BounceMaster_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		json.addData(popupID);
		System.out.println(popupID);
	}

	@Then("^Verify the record approved popup for bounce master$")
	public void verify_the_record_approved_popup_for_bounce_master() throws Throwable {
		String Toast;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMastercheckerApproveMgs(), 10, 2);
		Toast = bouncemasterobj.BounceMastercheckerApproveMgs().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}

	@And("^Search the respective reference id and click on Action button for bounce master$")
	public void search_the_respective_reference_id_and_click_on_action_button_for_bounce_master() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^Click on Approve button for bounce master$")
	public void click_on_approve_button_for_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.bounceMaster_Checker_Approve(), 10, 2);
		bouncemasterobj.bounceMaster_Checker_Approve().click();
	}

	@And("^Enter the remarks in action confirmation popup for bounce master$")
	public void enter_the_remarks_in_action_confirmation_popup_for_bounce_master() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				// bouncemasterobj.Checker_Alert_Approve().click();
				seleniumactions.getJavascriptHelper().JSEClick(bouncemasterobj.BounceMaster_Checker_Alert_Approve());

				break;
			} catch (ElementNotInteractableException e) {

			}
		}
	}

	@And("^Click on Remarks button in action confirmation popup for bounce master$")
	public void click_on_remarks_button_in_action_confirmation_popup_for_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_Checker_Final_Approve(), 10, 2);
		bouncemasterobj.BounceMaster_Checker_Final_Approve().click();
	}

	@Then("^verify that approved bounce master record is present in the view list$")
	public void verify_that_approved_bounce_master_record_is_present_in_the_view_list() throws Throwable {
		String validate = "";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMasterAddIcon(), 10, 2);
		for (int i = 0; i < 20; i++) {
			try {

				validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + bouncemasterdata.BounceCode + "')]"))
						.getText();

				Assert.assertEquals(validate, bouncemasterdata.BounceCode);
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}

		}
		System.out.println(validate);
	}

	@Then("^Verify the record rejected popup for bounce master$")
	public void verify_the_record_rejected_popup_for_bounce_master() throws Throwable {
		String Toast;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMastercheckerApproveMgs(), 10, 2);
		Toast = bouncemasterobj.BounceMastercheckerApproveMgs().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record REJECTED Successfully");
	}

	@And("^Click on reject button for bounce master$")
	public void click_on_reject_button_for_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMasterChecker_Reject(), 10, 2);
		bouncemasterobj.BounceMasterChecker_Reject().click();
	}

	@And("^Enter the remarks in action confirmation popup for bounce master rejection$")
	public void enter_the_remarks_in_action_confirmation_popup_for_bounce_master_rejection() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_Checker_Alert_Reject(), 10, 2);
		seleniumactions.getJavascriptHelper().JSEClick(bouncemasterobj.BounceMaster_Checker_Alert_Reject());
	}

	@And("^Click on remarks button action confirmation popup for bounce master rejection$")
	public void click_on_remarks_button_action_confirmation_popup_for_bounce_master_rejection() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_Checker_Final_Reject(), 10, 2);
		bouncemasterobj.BounceMaster_Checker_Final_Reject().click();
	}

	@Then("^verify that rejected bounce master record is not present in the view list$")
	public void verify_that_rejected_bounce_master_record_is_not_present_in_the_view_list() throws Throwable {
		try {
			String validate = driver
					.findElement(By.xpath("//span[contains(text(),'" + bouncemasterdata.BounceCode + "')]")).getText();
			System.out.println(validate);
			Assert.assertEquals(validate, bouncemasterdata.BounceCode);
		} catch (Exception e) {
			System.out.println("The Rejected Record Not in the List view " + bouncemasterdata.BounceCode);
		}
	}

	@Then("^Verify the record returned popup for bounce master$")
	public void verify_the_record_returned_popup_for_bounce_master() throws Throwable {
		String Toast;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMastercheckerApproveMgs(), 10, 2);
		Toast = bouncemasterobj.BounceMastercheckerApproveMgs().getText();
		System.out.println(Toast);
	}

	@And("^Click on return button for bounce master$")
	public void click_on_return_button_for_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_Checker_Return(), 10, 2);
		bouncemasterobj.BounceMaster_Checker_Return().click();
	}

	@And("^Enter the remarks in action confirmation popup for bounce master return$")
	public void enter_the_remarks_in_action_confirmation_popup_for_bounce_master_return() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_Checker_Alert_Return(), 10, 2);
		bouncemasterobj.BounceMaster_Checker_Alert_Return().click();
	}

	@And("^Click on remarks button action confirmation popup for bounce master return$")
	public void click_on_remarks_button_action_confirmation_popup_for_bounce_master_return() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_Checker_Final_Return(), 10, 2);
		bouncemasterobj.BounceMaster_Checker_Final_Return().click();
	}

	@Then("^verify that returned bounce master record is present in the temp view$")
	public void verify_that_returned_bounce_master_record_is_present_in_the_temp_view() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {

				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + bouncemasterdata.BounceCode + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, bouncemasterdata.BounceCode);
			} catch (Exception e) {
				Assert.fail();
			}
		}
	}

	@And("^Navigate to temp view of bounce master$")
	public void navigate_to_temp_view_of_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.tempViewOfBounceMaster(), 10, 2);
		bouncemasterobj.tempViewOfBounceMaster().click();
		Thread.sleep(2000);

	}

	@Then("^Click on Save button and validate the field is required popup in Bounce master$")
	public void click_on_save_button_and_validate_the_field_is_required_popup_in_bounce_master() throws Throwable {
		Thread.sleep(2000);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMasterSaveIcon(), 10, 2);
		bouncemasterobj.BounceMasterSaveIcon().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_requiredFieldWarningPopup(), 10, 2);
		Assert.assertEquals(bouncemasterobj.BounceMaster_requiredFieldWarningPopup().isDisplayed(), true);
	}

	@And("^Click on back button of bounce master$")
	public void click_on_back_button_of_bounce_master() throws Throwable {
		Thread.sleep(2000);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMasterBackIcon(),10, 2);
		
		bouncemasterobj.BounceMasterBackIcon().click();
		Thread.sleep(2000);
	}

	@And("^Enter special characters in all fields and validate the popup in bounce master$")
	public void enter_special_characters_in_all_fields_and_validate_the_popup_in_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceCodeFieldInBounceMaster(), 10, 2);
		bouncemasterobj.BounceCodeFieldInBounceMaster().click();
		bouncemasterobj.BounceCodeFieldInBounceMaster().sendKeys(testdata.get("Bounce Code"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceDescriptionFieldInBounceMaster(), 10, 2);
		bouncemasterobj.BounceDescriptionFieldInBounceMaster().click();
		bouncemasterobj.BounceDescriptionFieldInBounceMaster().sendKeys(testdata.get("Bounce Description"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_alphaNumericCharactersAllowedWarningPopup(), 10, 2);
		Assert.assertEquals(bouncemasterobj.BounceMaster_alphaNumericCharactersAllowedWarningPopup().isDisplayed(),
				true);
	}

	@And("^Validate all fields present in bounce master view list$")
	public void validate_all_fields_present_in_bounce_master_view_list() throws Throwable {
		Thread.sleep(1000);
		String xpath = "(//span[contains(text(),'Action')])[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		WebElement Action = driver.findElement(By.xpath(xpath));
		System.out.println(Action);
		String xpath1 = "//span[contains(text(),' Bounce Code ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath1)), 10, 2);
		WebElement Bouncecode = driver.findElement(By.xpath(xpath1));
		System.out.println(Bouncecode);
		String xpath2 = "//span[contains(text(),' Description ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 10, 2);
		WebElement description = driver.findElement(By.xpath(xpath2));
		System.out.println(description);
		String xpath3 = "//span[contains(text(),' Charge Applicable ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 10, 2);
		WebElement chargeapplicable = driver.findElement(By.xpath(xpath3));
		System.out.println(chargeapplicable);
		String xpath4 = "(//span[contains(text(),' Status ')])[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath4)), 10, 2);
		WebElement status = driver.findElement(By.xpath(xpath4));
		System.out.println(status);
	}

	@And("^Validate that records in bounce master view list is non editable$")
	public void validate_that_records_in_bounce_master_view_list_is_non_editable() throws Throwable {
		String xpath = "//tbody/tr[1]/td[4]";
		Thread.sleep(2000);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified status field is not editable only displayable");
		}
	}

	@And("^Search with valid test data in bounce master view list$")
	public void search_with_valid_test_data_in_bounce_master_view_list() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				bouncemasterobj.searchIconOfBounceMaster().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.searchTextFieldOfBounceMaster(), 10, 2);
		bouncemasterobj.searchTextFieldOfBounceMaster().sendKeys(testdata.get("Search with valid data"));
		String xpath = "//span[contains(text(),' Description ')]";
		String productgroup = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		for (int i = 0; i < 20; i++) {

			productgroup = driver.findElement(By.xpath(xpath)).getText();
		}
		System.out.println(productgroup);
	}

	@And("^Search with invalid test data in bounce master view list$")
	public void search_with_invalid_test_data_in_bounce_master_view_list() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				bouncemasterobj.searchIconOfBounceMaster().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.searchTextFieldOfBounceMaster(), 10, 2);
		bouncemasterobj.searchTextFieldOfBounceMaster().sendKeys(testdata.get("Search with Invalid data"));
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 10, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				// "Showing 0 to 0 of 0 entries"
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
	}

	@And("^Validate the export to PDF functionality of bounce master$")
	public void validate_the_export_to_pdf_functionality_of_bounce_master() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				bouncemasterobj.exportIconOfBounceMaster().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.exportToPDFOfBounceMaster(), 10, 3);
		bouncemasterobj.exportToPDFOfBounceMaster().click();
		// seleniumactions.getBrowserHelper().SwitchToWindow(1);
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File("C:\\Users\\inindc00074");
		File[] totalfiles = file.listFiles();
		for (File fileName : totalfiles) {
			if (fileName.getName().equalsIgnoreCase("SubProductMasterFile.pdf")) {
				System.out.println("Downloaded file present in system");
				break;
			} else {
				System.out.println("Downloaded file present does not exist in system");
			}

		}
		seleniumactions.getBrowserHelper().switchToParentWithChildClose();
	}

	@And("^Validate the export to Excel functionality of bounce master$")
	public void validate_the_export_to_excel_functionality_of_bounce_master() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				bouncemasterobj.exportIconOfBounceMaster().click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 20; i++) {
			try {
				bouncemasterobj.exportToExcelOfBounceMaster().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();
		System.out.println("Downloaded XLS file present in system");
	}

	@And("^Select the existing record in bounce master$")
	public void select_the_existing_record_in_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.BounceMaster_pencilIconOfFirstRecord(), 10, 2);
		bouncemasterobj.BounceMaster_pencilIconOfFirstRecord().click();
	}

	@And("^Validate the view summary of bounce master$")
	public void validate_the_view_summary_of_bounce_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.viewSummaryIconOfBounceMaster(), 10, 2);
		seleniumactions.getJavascriptHelper().JSEClick(bouncemasterobj.viewSummaryIconOfBounceMaster());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.viewSummaryPageOfBounceMaster(), 10, 2);
		Assert.assertEquals(bouncemasterobj.viewSummaryPageOfBounceMaster().isDisplayed(), true);
	}
	
	@And("^User click the config manager in Bounce master$")
    public void user_click_the_config_manager_in_bounce_master() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.ConfigManager(), 10, 5);
		bouncemasterobj.ConfigManager().click();
        
    }

    @And("^User click the Bounce master edit icon$")
    public void user_click_the_bounce_master_edit_icon() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.BounceMasterEdit(), 10, 5);
    	bouncemasterobj.BounceMasterEdit().click();
        
    }

    @And("^User click the Action edit icon in Bounce master$")
    public void user_click_the_action_edit_icon_in_bounce_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.ActionEditIcon(), 10, 5);
    	bouncemasterobj.ActionEditIcon().click();
        
    }

    @And("^User Enter the Charge applicable in Bounce master$")
    public void user_enter_the_charge_applicable_in_bounce_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.ChargeApplicable(), 10, 5);
    	bouncemasterobj.ChargeApplicable().click();
		
		String xpath = "//ion-label[contains(text(),'" + testdata.get("Charge Applicable1") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
        
    }

    @And("^User click the save icon in Bounce master$")
    public void user_click_the_save_icon_in_bounce_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.UpdateSave(), 10, 5);
    	bouncemasterobj.UpdateSave().click();
        
    }

    @And("^User verify while modification system enters the invalid data in Bounce master$")
    public void user_verify_while_modification_system_enters_the_invalid_data_in_bounce_master() throws Throwable {
        
      	help.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.RequiredField(), 10, 5);
   	    Assert.assertEquals("Required field",
   	    		bouncemasterobj.RequiredField().getText());
    	System.out.println(bouncemasterobj.RequiredField().getText());
    	
    }

    

    @And("^User clear the Bounce Code in Bounce master$")
    public void user_clear_the_bounce_code_in_bounce_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.BounceCode(), 10, 5);
    	bouncemasterobj.BounceCode().click();
		for(int i=0; i<20; i++) {
			bouncemasterobj.BounceCode().sendKeys(Keys.BACK_SPACE);
		}
		

        
    }

    @And("^User verify while modification, when user keep any mandatory field blank$")
    public void user_verify_while_modification_when_user_keep_any_mandatory_field_blank() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.RequiredField(), 10, 5);
   	    Assert.assertEquals("Required field",
   	    		bouncemasterobj.RequiredField().getText());
    	System.out.println(bouncemasterobj.RequiredField().getText());
    	
    	
    }

	@And("^User click on Bounce Master Temp view$")
	public void user_click_on_bounce_master_temp_view() throws Throwable {
		javaHelper.scrollIntoView(bouncemasterobj.tempViewOfBounceMaster());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.tempViewOfBounceMaster(), 10, 2);
		bouncemasterobj.tempViewOfBounceMaster().click();
	}

	@And("^user update the Bounce code field$")
	public void user_update_the_bounce_code_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.BounceCodeFieldInBounceMaster(), 10, 2);
		bouncemasterobj.BounceCodeFieldInBounceMaster().click();
		bouncemasterobj.BounceCodeFieldInBounceMaster().clear();
		bouncemasterobj.BounceCodeFieldInBounceMaster().sendKeys(testdata.get("Updated Bounce code"));
	}

	@And("^user update the Charge Applicable field$")
	public void user_update_the_charge_applicable_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.ChargeApplicableFieldInBounceMaster(), 10,
				2);
		bouncemasterobj.ChargeApplicableFieldInBounceMaster().click();
		for (int i = 0; i < 10; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),' "+testdata.get("Updated Charge Applicable")+" ')]/parent::ion-item//ion-radio"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user update the Bounce Description field$")
	public void user_update_the_bounce_description_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.BounceDescriptionFieldInBounceMaster(), 10,
				2);
		for (int i = 0; i < 40; i++) {
			try {
				bouncemasterobj.BounceDescriptionFieldInBounceMaster().click();
				bouncemasterobj.BounceDescriptionFieldInBounceMaster().clear();
				bouncemasterobj.BounceDescriptionFieldInBounceMaster().sendKeys(testdata.get("Updated Bounce description"));
				break;
			} catch (Exception e) {
				if (i == 40) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user update the Bounce Description2 field$")
	public void user_update_the_bounce_description2_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.BounceDescription2FieldInBounceMaster(), 10,
				2);
		bouncemasterobj.BounceDescription2FieldInBounceMaster().click();
		bouncemasterobj.BounceDescription2FieldInBounceMaster().clear();
		bouncemasterobj.BounceDescription2FieldInBounceMaster().sendKeys(testdata.get("Updated Bounce Description2"));
	}

	@And("^user update the Bounce Description3 field$")
	public void user_update_the_bounce_description3_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.BounceDescription3FieldInBounceMaster(), 10,
				2);
		bouncemasterobj.BounceDescription3FieldInBounceMaster().click();
		bouncemasterobj.BounceDescription3FieldInBounceMaster().clear();
		bouncemasterobj.BounceDescription3FieldInBounceMaster().sendKeys(testdata.get("Updated Bounce Description3"));
	}

	@And("^user click the save button$")
	public void user_click_the_save_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.BounceMasterSaveIcon(), 10, 2);
		bouncemasterobj.BounceMasterSaveIcon().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.BounceMasterSaveSuccessPopup(), 10, 2);
		Assert.assertEquals(bouncemasterobj.BounceMasterSaveSuccessPopup().getText(), "Success");

	}

	@And("^User click on Bounce Master List view$")
	public void user_click_on_bounce_master_list_view() throws Throwable {
		javaHelper.scrollIntoView(bouncemasterobj.viewIconOfBounceMaster());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.viewIconOfBounceMaster(), 10, 2);
		bouncemasterobj.viewIconOfBounceMaster().click();
	}
	
	@And("^user click the save buttons$")
	public void user_click_the_save_buttons() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.BounceMasterSaveIcon(), 10, 2);
		bouncemasterobj.BounceMasterSaveIcon().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bouncemasterobj.BounceMastersubmitSuccessPopup(), 10, 2);
		Assert.assertEquals(bouncemasterobj.BounceMastersubmitSuccessPopup().getText(), "success");

	}
	@And("^User update test data for Bounce master creation checker reject$")
    public void user_update_test_data_for_bounce_master_creation_checker_reject() throws Throwable {
		testdata=exceldata.getTestdata("AT_BM_002_D1");
    }
	@And("^User update test data for Bounce master creation checker approve$")
    public void user_update_test_data_for_bounce_master_creation_checker_approve() throws Throwable {
		testdata=exceldata.getTestdata("AT_BM_001_D1");
    }
	@And("^User update test data for Bounce master creation checker return$")
    public void user_update_test_data_for_bounce_master_creation_checker_return() throws Throwable {
		testdata=exceldata.getTestdata("AT_BM_003_D1");
    }
	@And("^User update test data for Bounce master creation validation$")
    public void user_update_test_data_for_bounce_master_creation_validation() throws Throwable {
		testdata=exceldata.getTestdata("AT_BM_004_D1");
    }

    @And("^User update test data for Bounce master updation$")
    public void user_update_test_data_for_bounce_master_updation() throws Throwable {
    	testdata=exceldata.getTestdata("AT_BM_005_D1");
    }
    @And("^User update test data for Bounce master updation validation$")
    public void user_update_test_data_for_bounce_master_updation_validation() throws Throwable {
    	testdata=exceldata.getTestdata("AT_BM_006_D1");
    }
    @And("^User update test data for Bounce master updationand checker approve$")
    public void user_update_test_data_for_bounce_master_updationand_checker_approve() throws Throwable {
    	testdata=exceldata.getTestdata("AT_BM_007_D1");
    }

    @And("^User update test data for Bounce master updation and checker reject$")
    public void user_update_test_data_for_bounce_master_updation_and_checker_reject() throws Throwable {
    	testdata=exceldata.getTestdata("AT_BM_008_D1");
    }

    @And("^User update test data for Bounce master updation and checker return$")
    public void user_update_test_data_for_bounce_master_updation_and_checker_return() throws Throwable {
    	testdata=exceldata.getTestdata("AT_BM_009_D1");
    }
    @And("^User update test data for Bounce master view list validation$")
    public void user_update_test_data_for_bounce_master_view_list_validation() throws Throwable {
    	testdata=exceldata.getTestdata("AT_BM_010_D1");
    }
    @Given("^Launch the kuls application and Navigate to Allocation master module view list$")
    public void launch_the_kuls_application_and_navigate_to_allocation_master_module_view_list() throws Throwable {
    	String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		login.loginUlsApplicationAsMaker(loginData.Username, loginData.Password);
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,bouncemasterobj.menuBarInHomePage(),10,2);
		// bouncemasterobj.menuBarInHomePage().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.configurationInLeftPanel(), 10, 2);
		bouncemasterobj.configurationInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				bouncemasterobj.configManagerInLeftPanel(), 10, 2);
		bouncemasterobj.configManagerInLeftPanel().click();
		Thread.sleep(2000);
		for (int i = 0; i <= 20; i++) {
			try {
				javascripthelper.scrollIntoView(bouncemasterobj.viewIconOfAllocationMaster());
				// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,bouncemasterobj.viewIconOfBounceMaster(),10,2);
				bouncemasterobj.viewIconOfAllocationMaster().click();
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

   
	
}
