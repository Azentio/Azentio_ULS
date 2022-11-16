package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.Living_Expenses_Obj;
import pageobjects.Warehouse_MasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.LivExp_Testdata;

public class LivingExpense_Master extends BaseClass {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Living_Expenses_Obj LivexpObj = new Living_Expenses_Obj(driver);
	LivExp_Testdata LivExpdata = jsonConfig.getLivExpListByName("Maker");
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00075\\Downloads\\UlsTestDataDesign.xlsx",
			"LivingExpenseMasterTestdaa", "Data Set ID");
	Map<String, String> testData;
	Warehouse_MasterObj warehousrobj = new Warehouse_MasterObj(driver);

	@And("^user click on Other Masters Tab$")
	public void user_click_on_other_masters_tab() throws Throwable {
		javaHelper.scrollIntoView(LivexpObj.Living_Exp_OtherMaster());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Living_Exp_OtherMaster(), 60, 2);
		LivexpObj.Living_Exp_OtherMaster().click();
	}

	@And("^user click on List view Icon of  Living Expenses$")
	public void user_click_on_list_view_icon_of_living_expenses() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Living_Exp_Listview(), 60, 2);
		LivexpObj.Living_Exp_Listview().click();
	}

	@And("^user click on Add Icon for Living Expenses$")
	public void user_click_on_add_icon_for_living_expenses() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Add_Icon(), 60, 2);
		LivexpObj.Liv_Exp_Add_Icon().click();
	}

	@And("^user Enter value in Description and verify it$")
	public void user_enter_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().sendKeys(testData.get("Description"));
	}

	@And("^user Enter value in Description2 and verify it$")
	public void user_enter_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description2");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().sendKeys(testData.get("Description2"));
	}

	@And("^user Enter value in Description3 and verify it$")
	public void user_enter_value_in_description3_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description3");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description3(), 60, 2);
		LivexpObj.Liv_Exp_Description3().click();
		LivexpObj.Liv_Exp_Description3().sendKeys(testData.get("Description3"));
	}

	@And("^user select Rule value and verify it$")
	public void user_select_rule_value_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Rule");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Rule(), 60, 2);
		LivexpObj.Liv_Exp_Rule().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + testData.get("Rule") + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user choose Calender Effective Date and verify it$")
	public void user_choose_calender_effective_date_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Effective Date");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_EffectiveDate(), 60, 2);
		LivexpObj.Liv_Exp_EffectiveDate().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Year(), 60, 2);
		LivexpObj.Liv_Exp_Year().click();
		String yearXpath = "//button[text()=' " + testData.get("PresentYear") + " ']";
		for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(yearXpath)).click();
				break;
			} catch (Exception e) {

			}
		}
		String yearXpath2 = "//span[text()=' " + testData.get("UploadYear") + " ']";
		while (true) {
			try {
				driver.findElement(By.xpath(yearXpath2)).click();
				break;
			} catch (NoSuchElementException e) {
				String xpath = "//body/div[1]/div[2]/span[1]";
				String year = driver.findElement(By.xpath(xpath)).getText();
				int firstyear = Integer.parseInt(year);
				if (firstyear > Integer.parseInt(testData.get("UploadYear"))) {
					LivexpObj.previousbuttonIncalendar().click();
				} else {
					LivexpObj.nextbuttonIncalendar().click();

				}
			}
		}
		String monthXpath = "//span[text()=' " + testData.get("UploadMonth") + " ']";
		for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(monthXpath)).click();
				break;
			} catch (Exception e) {

			}
		}
		String dateXpath = "//span[text()='" + testData.get("UploadDate") + "']";
		for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(dateXpath)).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user save the Record in Living Expenses$")
	public void user_save_the_record_in_living_expenses() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Save(), 60, 2);
		LivexpObj.Liv_Exp_Save().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_SuccessPopup(), 30, 2);
		Assert.assertEquals(LivexpObj.Liv_Exp_SuccessPopup().isDisplayed(), true);
	}

	@And("^user save the Record in Living Expensess$")
	public void user_save_the_record_in_living_expensess() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Save(), 60, 2);
		LivexpObj.Liv_Exp_Save().click();

	}

	@And("^user go the Maker Inbox and store the Referance ID$")
	public void user_go_the_maker_inbox_and_store_the_referance_id() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T002_D2", "Reference ID", RefId);
	}

	@And("^user go the Maker Inbox and store the ReferanceID$")
	public void user_go_the_maker_inbox_and_store_the_referanceid() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T003_D3", "Reference ID", RefId);
	}

	@And("^user go Maker Inbox and store the ReferanceID$")
	public void user_go_maker_inbox_and_store_the_referanceid() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T004_D4", "Reference ID", RefId);
	}

	@And("^user go Inbox and store the ReferanceID$")
	public void user_go_inbox_and_store_the_referanceid() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T008_D8", "Reference ID", RefId);
	}
	
	@And("^user goto Inbox and store the ReferanceID$")
	public void user_goto_inbox_and_store_the_referanceid() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T009_D9", "Reference ID", RefId);
	}
	
	@And("^user goto Maker Inbox and store the Referance ID$")
	public void user_goto_maker_inbox_and_store_the_referance_id() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T010_D10", "Reference ID", RefId);
	}
	
	@And("^user goto the Maker Inbox and store the New Referance ID$")
	public void user_goto_the_Maker_Inbox_and_store_the_New_Referance_ID() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T014_D14", "Reference ID", RefId);
	}
	
	@And("^user goto Maker Inbox and store the New Ref ID$")
	public void user_goto_Maker_Inbox_and_store_the_New_Ref_ID() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T015_D15", "Reference ID", RefId);
	}
	
	@And("^user goto MakerInbox and store the New Ref ID$")
	public void user_goto_MakerInbox_and_store_the_New_Ref_ID() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T016_D16", "Reference ID", RefId);
	}
	@And("^user goto MakerInbox and stored the New Ref ID$")
	public void user_goto_MakerInbox_and_stored_the_New_Ref_ID() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T020_D20", "Reference ID", RefId);
	}
	@And("^user goto Inbox and stored the New Ref ID$")
	public void user_goto_Inbox_and_stored_the_New_Ref_ID() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T021_D21", "Reference ID", RefId);
	}
	
	@And("^user goto Inbox and stored the Ref ID$")
	public void user_goto_Inbox_and_stored_the_Ref_ID() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T022_D22", "Reference ID", RefId);
	}
	
	@And("^user goto Inbox and than stored the Ref ID$")
	public void user_goto_Inbox_and_than_stored_the_Ref_ID() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " + RefId);
		// json.addReferanceData(RefId);
		exceldata.updateTestData("AT_LR_T022_D25", "Reference ID", RefId);
	}
	
	@And("^user verify submit button and submit the Record from Maker stage$")
	public void user_verify_submit_button_and_submit_the_record_from_maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T002_D2", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}

	@And("^user verify submit button and submit Record from Maker stage$")
	public void user_verify_submit_button_and_submit_record_from_maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T003_D3", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}

	@And("^user verify submit button and submiting Record from Maker stage$")
	public void user_verify_submit_button_and_submiting_record_from_maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T004_D4", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}

	@And("^verify submit button and submiting Record from Maker stage$")
	public void verify_submit_button_and_submiting_record_from_maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T008_D8", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}
	@And("^verify submit button and submiting the Record from Maker stage$")
	public void verify_submit_button_and_submiting_the_record_from_maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T009_D9", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}
	@And("^verify submit button and submit it from Maker stage$")
	public void verify_submit_button_and_submit_it_from_maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T010_D10", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}
	@And("^user verify the submit button and submit the New Record from Maker stage$")
	public void user_verify_the_submit_button_and_submit_the_New_Record_from_Maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T014_D14", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}
	
	@And("^user verify the submit Icon and submit the New Record from Maker stage$")
	public void user_verify_the_submit_icon_and_submit_the_New_Record_from_Maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T015_D15", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}
	
	@And("^user verify the submitIcon and submit the New Record from Maker stage$")
	public void user_verify_the_submiticon_and_submit_the_New_Record_from_Maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T016_D16", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}
	
	@And("^user verify the submitIcon and submit New Record from Maker stage$")
	public void user_verify_the_submiticon_and_submit_New_Record_from_Maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T020_D20", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}
	@And("^user verify the submit and submit New Record from Maker stage$")
	public void user_verify_the_submit_and_submit_New_Record_from_Maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T021_D21", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}
	@And("^user verify submit and submit New Record from Maker stage$")
	public void user_verify_submit_and_submit_New_Record_from_Maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T022_D22", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}
	
	@And("^user verify submit and than submit New Record from Maker stage$")
	public void user_verify_submit_and_than_submit_New_Record_from_Maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData("AT_LR_T025_D25", "Checker id", popupID);

		System.out.println("Checker ID : " + popupID);
	}
	// ******************AT_LE_002_Approve_ListView************************//
	@Given("^user login as kuls application checker$")
	public void user_login_as_kuls_application_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		testData = exceldata.getTestdata("AT_LR_T002_D2");
		System.out.println(testData.get("Checker id"));
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}

	@Then("^User validate the Living Expense approved record in list view$")
	public void user_validate_the_living_expense_approved_record_in_list_view() throws Throwable {

		for (int i = 0; i < 50; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("Description") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("Description"));

				break;
			} catch (Exception e) {

			}
		}
	}

	// ******************AT_LE_003_Reject************************//
	@Given("^user login kuls application checker$")
	public void user_login_kuls_application_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		testData = exceldata.getTestdata("AT_LR_T003_D3");
		System.out.println(testData.get("Checker id"));
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}

	@And("^user Enter value in Reject Description and verify it$")
	public void user_enter_value_in_reject_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		testData = exceldata.getTestdata("AT_LR_T003_D3");
		LivexpObj.Liv_Exp_Description().sendKeys(testData.get("DescriptionReject"));
	}

	@And("^user Enter value in Reject Description2 and verify it$")
	public void user_enter_value_in_reject_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description2");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		testData = exceldata.getTestdata("AT_LR_T003_D3");
		LivexpObj.Liv_Exp_Description2().sendKeys(testData.get("DescriptionReject2"));
	}

	// ******************AT_LE_003_Reject_ListView************************//

	@Then("^User validate the Living Expense Rejected record in list view$")
	public void user_validate_the_living_expense_rejected_record_in_list_view() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T003_D3");
		for (int i = 0; i < 50; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("DescriptionReject") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("DescriptionReject"));

				break;
			} catch (Exception e) {

			}
		}
	}

	// ******************AT_LE_004_Return************************//

	@And("^user Enter value in Return Description and verify it$")
	public void user_enter_value_in_return_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().sendKeys(testData.get("DescriptionReturn"));
	}

	@And("^user Enter value in Return Description2 and verify it$")
	public void user_enter_value_in_return_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description2");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().sendKeys(testData.get("DescriptionReturn2"));
	}

	// ******************AT_LE_004_Return_Listview************************//

	@Then("^User validate the Living Expense Returned record in list view$")
	public void user_validate_the_living_expense_returned_record_in_list_view() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("DescriptionReturn") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("DescriptionReturn"));

				break;
			} catch (Exception e) {

			}
		}
	}

	// ***********************AT_LE_005_Validation*******************//

	@And("^user verify the Blank field in Living Expense$")
	public void user_verify_the_blank_field_in_living_expense() throws Throwable {
		String nameErrorMessage = driver
				.findElement(By.xpath("(//ion-badge[contains(text(),'" + testData.get("Field1") + "')])[1]")).getText();
		String expectedErrorText = testData.get("Field1");
		if (nameErrorMessage.equalsIgnoreCase(expectedErrorText)) {
			System.out.println("System should not allow the Mandatory fields Empty.The Popup validation message is "
					+ nameErrorMessage);
		} else {
			System.out.println(
					"System should allow the Mandatory fields.The Popup validation message is " + nameErrorMessage);
		}
	}

	// ***********************AT_LE_006_Modification*******************//

	@And("^user Enter Modify value in Description and verify it$")
	public void user_enter_modify_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().clear();
		LivexpObj.Liv_Exp_Description().sendKeys(testData.get("DescriptionModify"));
	}

	@And("^user Enter Modify value in Description2 and verify it$")
	public void user_enter_modify_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().clear();
		LivexpObj.Liv_Exp_Description2().sendKeys(testData.get("DescriptionModify2"));
	}

	@And("^user Enter ApprovedModify value in Description and verify it$")
	public void user_enter_approvedmodify_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().clear();
		LivexpObj.Liv_Exp_Description().sendKeys(testData.get("DescriptionApprovedModify"));
	}

	@And("^user Enter ApprovedModify value in Description2 and verify it$")
	public void user_enter_approvedmodify_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().clear();
		LivexpObj.Liv_Exp_Description2().sendKeys(testData.get("DescriptionApprovedModify2"));
	}

	// ***********************AT_LE_007_Invalid_Modification*******************//

	@And("^user Goto the Temp view screen of living Expense$")
	public void user_goto_the_temp_view_screen_of_living_expense() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Living_Exp_Tempview(), 60, 2);
		LivexpObj.Living_Exp_Tempview().click();
	}

	@And("^user click on First record in living Expense$")
	public void user_click_on_first_record_in_living_expense() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Temp_Edit(), 60, 2);
		LivexpObj.Liv_Exp_Temp_Edit().click();
	}

	@And("^user Enter Invalid value in Description and verify it$")
	public void user_enter_invalid_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().clear();
		LivexpObj.Liv_Exp_Description().sendKeys(testData.get("DescriptionInvalidModify"));
	}

	@And("^user Enter Invalid value in Description2 and verify it$")
	public void user_enter_invalid_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description2");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().clear();
		LivexpObj.Liv_Exp_Description2().sendKeys(testData.get("DescriptionInvalidModify1"));
	}

	@And("^user try to update the Modified Record$")
	public void user_try_to_update_the_modified_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Update(), 60, 2);
		LivexpObj.Liv_Exp_Update().click();
	}

	@And("^Validate the Message and verify it$")
	public void validate_the_message_and_verify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath("//ion-badge[contains(text(),'" + testData.get("Field2") + "')]")), 60, 2);
		WebElement errorPopUp = driver
				.findElement(By.xpath("//ion-badge[contains(text(),'" + testData.get("Field2") + "')]"));
		String expectedErrorText = testData.get("Field2");
		String actualErrorText = errorPopUp.getText();
		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
			System.out.println(
					"The system was not allow the record to save as we enter the invalid details.The Popup validation message is"
							+ actualErrorText);
		} else {
			System.out.println(
					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
		}
		Assert.assertEquals(actualErrorText, testData.get("Field2"));
	}

	@Then("^User validate the Living Expense Modified approved record in list view$")
	public void user_validate_the_living_expense_modified_approved_record_in_list_view() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("DescriptionModify") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("DescriptionModify"));

				break;
			} catch (Exception e) {

			}
		}
	}

	@Given("^user launch kuls application checker$")
	public void user_launch_kuls_application_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		testData = exceldata.getTestdata("AT_LR_T008_D8");
		System.out.println(testData.get("Checker id"));
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	// *****************************AT_LE_009_Reject_Valid_Modification***********************************//

	@Given("^user launching kuls application checker$")
	public void user_launching_kuls_application_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		testData = exceldata.getTestdata("AT_LR_T009_D9");
		System.out.println(testData.get("Checker id"));
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	
	@And("^user Enter Reject Modify value in Description and verify it$")
	public void user_enter_reject_modify_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().clear();
		LivexpObj.Liv_Exp_Description().sendKeys(testData.get("DescriptionRejectModify"));
	}

	@And("^user Enter Reject Modify value in Description2 and verify it$")
	public void user_enter_reject_modify_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().clear();
		LivexpObj.Liv_Exp_Description2().sendKeys(testData.get("DescriptionRejectModify2"));
	}

	@Then("^User validate the Living Expense Modified Rejected record in list view$")
	public void user_validate_the_living_expense_modified_rejected_record_in_list_view() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("DescriptionRejectModify") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("DescriptionRejectModify"));

				break;
			} catch (Exception e) {

			}
		}
	}

	// ***********************AT_LE_010_Return_Valid_Modification*************************//
	@Given("^login kuls application checker$")
	public void login_kuls_application_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		testData = exceldata.getTestdata("AT_LR_T002_D2");
		System.out.println(testData.get("Checker id"));
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	@And("^user Enter Return Modify value in Description and verify it$")
	public void user_enter_return_modify_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().clear();
		LivexpObj.Liv_Exp_Description().sendKeys(testData.get("DescriptionReturnModify"));
	}

	@And("^user Enter Return Modify value in Description2 and verify it$")
	public void user_enter_return_modify_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().clear();
		LivexpObj.Liv_Exp_Description2().sendKeys(testData.get("DescriptionReturnModify2"));
	}

	@Then("^User validate the Living Expense Modify Returned record in list view$")
	public void user_validate_the_living_expense_modify_returned_record_in_list_view() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("DescriptionReturnModify") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("DescriptionReturnModify"));

				break;
			} catch (Exception e) {

			}
		}
	}

	// ****************@AT-LE-013_Parameter_Creation******************//

	@And("^user click on Living Expenses Parameter$")
	public void user_click_on_living_expenses_parameter() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Living_Expense_Parameter(), 60, 2);
		LivexpObj.Liv_Exp_Living_Expense_Parameter().click();
	}

	@And("^user select the code value$")
	public void user_select_the_code_value() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Living_Expense_Parameter_Code(), 60,
				2);
		LivexpObj.Liv_Exp_Living_Expense_Parameter_Code().click();

		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("CodeValue")+" ']/parent::ion-item//ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user Enter the value$")
	public void user_enter_the_value() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Value");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Living_Expense_Parameter_Value(), 60,
				2);
		LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().click();
		LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().sendKeys(testData.get("Value"));
	}

	// ******************@AT_LE_014_Parameter_Listview***************//
	@Given("^user log inas uls application checker$")
	public void user_log_inas_uls_application_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		testData = exceldata.getTestdata("AT_LR_T014_D14");
		System.out.println(testData.get("Checker id"));
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	
	@And("^user Click on First Record Eye icon$")
	public void user_click_on_first_record_eye_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Temp_view(), 60, 2);
		LivexpObj.Liv_Exp_Temp_view().click();
	}

	@Then("^User validate the Living Expense Parameter approved record in list view$")
	public void user_validate_the_living_expense_parameter_approved_record_in_list_view() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("Description") + "')]")).getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("Description"));

				String validate1 = driver.findElement(By.xpath("//span[contains(text(),'" + testData.get("Value") + "')]"))
						.getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, testData.get("Value"));
				break;
			} catch (Exception e) {

			}
		}

	}

	// **********************@AT_LE_015_Parameter_Reject*********************//

	@And("^user Enter the Reject value$")
	public void user_enter_the_reject_value() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Value");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Living_Expense_Parameter_Value(), 60,
				2);
		LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().click();
		LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().sendKeys(testData.get("Value"));
	}

	// **********************@AT_LE_015_Parameter_Reject_Listview*********************//

	@Then("^User validate the Living Expense Parameter Rejected record in list view$")
	public void user_validate_the_living_expense_parameter_rejected_record_in_list_view() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("Description") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("Description"));

				String validate1 = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("Value") + "')]")).getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, testData.get("Value"));
				break;
			} catch (Exception e) {

			}
		}
	}

	// **********************@AT_LE_016_Parameter_Return*********************//

	@Then("^User validate the Living Expense Parameter Returned record in list view$")
	public void user_validate_the_living_expense_parameter_returned_record_in_list_view() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Value");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Living_Expense_Parameter_Value(), 60,
				2);
		LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().click();
		LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().sendKeys(testData.get("Value"));
	}

	@And("^user Enter the Return value$")
	public void user_enter_the_return_value() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.DescriptionReturn + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, LivExpdata.DescriptionReturn);

				String validate1 = driver
						.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.Returnvalue + "')]")).getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, LivExpdata.Returnvalue);
				break;
			} catch (Exception e) {

			}
		}
	}
	
	@Given("^user launching uls application checker$")
	public void user_launching_uls_application_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		testData = exceldata.getTestdata("AT_LR_T016_D16");
		System.out.println(testData.get("Checker id"));
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	
	
	
	
	@And("^user Pass the Exceldata value for Creation$")
	public void user_Pass_the_Exceldata_value_for_Creation() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T001_D1");
	}

	@And("^user Pass the Exceldata value for Approve$")
	public void user_Pass_the_Exceldata_value_for_approve() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T002_D2");
	}

	@And("^user Pass the Exceldata value for Rejection$")
	public void user_Pass_the_Exceldata_value_for_Rejection() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T003_D3");
	}

	@And("^user Pass the Exceldata value for Return$")
	public void user_Pass_the_Exceldata_value_for_Return() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T004_D4");
	}

	@And("^user Pass the Exceldata value for Invalid$")
	public void user_Pass_the_Exceldata_value_for_Invalid() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T005_D5");
	}

	@And("^user Pass the Exceldata value for Validation$")
	public void user_Pass_the_Exceldata_value_for_Validation() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T006_D6");
	}

	@And("^user Pass the Exceldata value for InvalidModify$")
	public void user_Pass_the_Exceldata_value_for_invalidmodify() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T007_D7");
	}
	@And("^user Pass the Exceldata value for checker$")
	public void user_Pass_the_Exceldata_value_for_checker() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T008_D8");
	}
	@And("^user Pass the Exceldata value for ModifyRejection$")
	public void user_Pass_the_Exceldata_value_for_ModifyRejection() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T009_D9");
	}
	@And("^user Pass the Exceldata value for ModifyReturn$")
	public void user_Pass_the_Exceldata_value_for_ModifyReturn() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T010_D10");
	}
	
	@And("^user Pass the Exceldata value for ParaMeter Creation$")
	public void user_Pass_the_Exceldata_value_for_parameter_Creation() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T013_D13");
	}
	@And("^user pass the Exceldata value for parameter checker$")
	public void user_Pass_the_Exceldata_value_for_parameter_checker() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T014_D14");
	}
	@And("^user Pass the Exceldata value for ParaMeter Rejection$")
	public void user_Pass_the_Exceldata_value_for_parameter_Rejection() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T015_D15");
	}
	@And("^user Pass the Exceldata value for ParaMeter Return$")
	public void user_Pass_the_Exceldata_value_for_parameter_Return() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T016_D16");
	}
	@And("^user Pass the Exceldata value for ParaMeter Invalid$")
	public void user_Pass_the_Exceldata_value_for_parameter_Invalid() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T017_D17");
	}


}
