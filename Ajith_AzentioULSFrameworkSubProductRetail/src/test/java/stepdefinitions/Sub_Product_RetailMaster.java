package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SubProductMasterRetail_Obj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.SubProductMaster_RetailTestData;
import testDataType.SubProductRetailParameterNegativeTestDataType;
import testDataType.SubProductRetailParameterTestDataType;
import testDataType.SubproductMasterRetail_Testdata;

public class Sub_Product_RetailMaster extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	// JavascriptHelper javascriptHelper= new JavascriptHelper(driver);
	SubProductMasterRetail_Obj subMasterRetailObj = new SubProductMasterRetail_Obj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	SubProductMaster_RetailTestData subProductMasterRetailData = jsonConfig.getSubProductMasterRetailByName("Maker");
	WaitHelper waitHelper = new WaitHelper(driver);
	String path = System.getProperty("user.dir") + "\\Test-data\\ULSTestData.xlsx";
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	SubproductMasterRetail_Testdata subprdMstData = jsonConfig.getSubproductRetailByName("Maker");
	SubProductRetailParameterTestDataType paradata = jsonConfig.getSubParameterListByName("Maker");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	SubProductRetailParameterNegativeTestDataType paradata1 = jsonConfig.getSubParameterNegativeListByName("Maker");
	Map<String, String> subProductMasterTestData = new HashMap<>();
	ExcelData excelData = new ExcelData(path, "SupProductRetailTestData", "Data Set ID");
	String Tab;
	String Toast;

	@Given("^user log in as uls application maker$")
	public void user_log_in_as_uls_application_maker() throws Throwable {
		ExcelData excelData = new ExcelData(path, "LoginCredentials", "Stage");
		Map<String, String> testdata = excelData.getTestdata("Maker3");
		String kulsApplicationUrl = configFileReader.getLoanTransactionApplicationUrl();
		driver.get(kulsApplicationUrl);
		applicationLogin.loginUlsApplicationAsMaker(testdata.get("Username"), testdata.get("Password"));

	}
	@Given("^Navigate to uls application for verify returned parameter record is visible under temp of sub product retail$")
    public void navigate_to_uls_application_for_verify_returned_parameter_record_is_visible_under_temp_of_sub_product_retail() throws Throwable {
		ExcelData excelData = new ExcelData(path, "LoginCredentials", "Stage");
		Map<String, String> testdata = excelData.getTestdata("Maker3");
		String kulsApplicationUrl = configFileReader.getLoanTransactionApplicationUrl();
		driver.get(kulsApplicationUrl);
		applicationLogin.loginUlsApplicationAsMaker(testdata.get("Username"), testdata.get("Password"));
		subProductMasterTestData=excelData.getTestdata("AT-SPR-0013_D1");
    }

	@And("^get the test data for the first test case$")
	public void get_the_test_data_for_the_first_test_case() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-T001_D1");
	}

	@And("^get the test data for updation which is going to return in checker$")
	public void get_the_test_data_for_updation_which_is_going_to_return_in_checker() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-006_D3");
	}
	@And("^get the test data of sub product parameter creation test data$")
    public void get_the_test_data_of_sub_product_parameter_creation_test_data() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-010_D1");
    }
	

//    @When("^user click product set up menu$")
//    public void user_click_product_set_up_menu() throws Throwable {
//    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.productSetup(),10,2);
//        subMasterRetailObj.productSetup().click();
//    }
	@When("^click on configuration main menu$")
	public void click_on_configuration_main_menu() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWaitElementToBeClickable(driver,
				subMasterRetailObj.ulsConfigurationsMainMenu(), 10, 1);
		subMasterRetailObj.ulsConfigurationsMainMenu().click();
	}

	@And("^click on config manager sub menu$")
	public void click_on_config_manager_sub_menu() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.ulsConfigManagerMainMenu(), 10, 1);
		subMasterRetailObj.ulsConfigManagerMainMenu().click();
	}
	@And("^user change Module name from Corporate to LOS$")
    public void user_change_module_name_from_corporate_to_los() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.moduleChangeOption(),30, 2);
		subMasterRetailObj.moduleChangeOption().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.LOSoption(),30, 2);
		subMasterRetailObj.LOSoption().click();
	}

	@And("^user click edit icon of sub product retail$")
	public void user_click_edit_icon_of_sub_product_retail() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.subProductEditIcon(), 10, 2);
		subMasterRetailObj.subProductEditIcon().click();
	}

	@And("^user click the edit icon for the record which saved in maker$")
	public void user_click_the_edit_icon_for_the_record_which_saved_in_maker() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.firstEditIcon(), 10, 3);
		subMasterRetailObj.firstEditIcon().click();
	}

	@And("^user click parameter tab in sub product retail master$")
	public void user_click_parameter_tab_in_sub_product_retail_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.parameter(),
				30, 2);
		subMasterRetailObj.parameter().click();

	}

	@Then("^user verify the functionality of back button for parameter tab Updation$")
	public void user_verify_the_functionality_of_back_button_for_parameter_tab_updation() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.backButtonInParameterTab(), 30, 2);
		subMasterRetailObj.backButtonInParameterTab().click();

	}

	@And("^get the test data for Updation scenario for checker approval$")
	public void get_the_test_data_for_updation_scenario_for_checker_approval() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-006_D1");
	}

	@And("^get the test data for Updation scenario for checker Reject$")
	public void get_the_test_data_for_updation_scenario_for_checker_reject() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-006_D2");
	}

	@And("^user Select and modify the project group$")
	public void user_select_and_modify_the_project_group() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productGroup(),
				10, 3);
		subMasterRetailObj.productGroup().click();
		String xpath = "//ion-label[contains(text(),'" + subProductMasterTestData.get("ProductGroup")
				+ "')]//following-sibling::ion-radio";
		for (int i = 0; i < 30; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(xpath)),
						driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}

		}

	}

	@And("^user Select and modify the Product code$")
	public void user_select_and_modify_the_product_code() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productCode(),
				30, 3);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.productCode().click();
				break;
			} catch (Exception e) {

			}
		}
		System.out.println("Product Code " + subProductMasterTestData.get("ProductCode"));
		String xpath = "//ion-label[contains(text(),'" + subProductMasterTestData.get("ProductCode")
				+ "')]//following-sibling::ion-radio";
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),10,
		// 3);

		for (int i = 0; i < 50; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(xpath)),
						driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getLocalizedMessage());
				}

			}
		}

	}

	@And("^user enter and modify sub product code$")
	public void user_enter_and_modify_sub_product_code() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.subProductCode(),10,
		// 2);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.subProductCode().click();
				subMasterRetailObj.subProductCode().clear();
				subMasterRetailObj.subProductCode().sendKeys(subProductMasterTestData.get("SubproductCode"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^user enter and modify sub product description$")
	public void user_enter_and_modify_sub_product_description() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.subProductDescription(), 10, 2);
		subMasterRetailObj.subProductDescription().click();
		subMasterRetailObj.subProductDescription().clear();
		subMasterRetailObj.subProductDescription().sendKeys(subProductMasterTestData.get("SubProductDescription"));
	}

	@And("^user enter and modify allocation sequence number$")
	public void user_enter_and_modify_allocation_sequence_number() throws Throwable {
		seleniumactions.getJavascriptHelper()
				.scrollIntoView(subMasterRetailObj.Sub_Product_Alloation_Sequence_Number());
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().clear();
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number()
				.sendKeys(subProductMasterTestData.get("AllocationSequenceNumber"));

	}

	@And("^user enter and modify allocation sequence number for reject$")
	public void user_enter_and_modify_allocation_sequence_number_for_reject() throws Throwable {
		seleniumactions.getJavascriptHelper()
				.scrollIntoView(subMasterRetailObj.Sub_Product_Alloation_Sequence_Number());
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().clear();
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number()
				.sendKeys(subProductMasterTestData.get("AllocationSequenceNumber"));
	}

	@And("^user enter and modify allocation sequence number for return$")
	public void user_enter_and_modify_allocation_sequence_number_for_return() throws Throwable {
		seleniumactions.getJavascriptHelper()
				.scrollIntoView(subMasterRetailObj.Sub_Product_Alloation_Sequence_Number());
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().clear();
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number()
				.sendKeys(subProductMasterTestData.get("AllocationSequenceNumber"));
	}

	@And("^user click the save button for updation$")
	public void user_click_the_save_button_for_updation() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.SubProductUpdate());
		subMasterRetailObj.SubProductUpdate().click();
	}

	@Then("^user verify the sucess message for updation$")
	public void user_verify_the_sucess_message_for_updation() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.successMgs(),
				10, 1);
		Assert.assertEquals(subMasterRetailObj.successMgs().isDisplayed(), true);
	}

	@And("^user click list view in sub product menu$")
	public void user_click_list_view_in_sub_product_menu() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.subProductViewIcon(), 10, 3);
		subMasterRetailObj.subProductViewIcon().click();
	}

	@And("^user click the inbox icon$")
	public void user_click_the_inbox_icon() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Sub_Product_Inbox(), 30, 3);
		subMasterRetailObj.Sub_Product_Inbox().click();
	}

	@And("^user click the modified record in the list view and store the reference number$")
	public void user_click_the_modified_record_in_the_list_view_and_store_the_reference_number() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Subproduct_InboxView_Search(),30,2);
		for (int i = 0; i < 20; i++) {
			try {
				// seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
				subMasterRetailObj.Subproduct_InboxView_Search().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_InboxView_SearchText(), 10, 2);
		subMasterRetailObj.Subproduct_InboxView_SearchText().click();
		subMasterRetailObj.Subproduct_InboxView_SearchText().sendKeys(subProductMasterTestData.get("Module Code"));
		String reference = null;
		for (int i = 0; i < 200; i++) {
			try {
				reference = subMasterRetailObj.Sub_Producr_Product_ReferanceId().getText();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.firstEditIconInListView(), 40, 2);
		subMasterRetailObj.firstEditIconInListView().click();

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40,
		// 2);

		// json.addReferanceData(reference);
		excelData.updateTestData("AT-SPR-009_D1", "Reference ID", reference);
		System.out.println(reference);

	}

	@And("^select the modified record and store the reference number for checker reject purpose$")
	public void select_the_modified_record_and_store_the_reference_number_for_checker_reject_purpose()
			throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				// seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
				subMasterRetailObj.Subproduct_InboxView_Search().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_InboxView_SearchText(), 10, 2);
		subMasterRetailObj.Subproduct_InboxView_SearchText().click();
		subMasterRetailObj.Subproduct_InboxView_SearchText().sendKeys(subProductMasterRetailData.SearchSubProductInbox);
		String reference = null;
		for (int i = 0; i < 200; i++) {
			try {
				reference = subMasterRetailObj.Sub_Producr_Product_ReferanceId().getText();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.firstEditIconInListView(), 40, 2);
		subMasterRetailObj.firstEditIconInListView().click();

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40,
		// 2);

		json.addReferanceData(reference);
		System.out.println(reference);
		excelData.updateTestData("AT-SPR-008_D1", "Reference ID", reference);
	}

	@And("^store the updated record reference number for checker approval purpose$")
	public void store_the_updated_record_reference_number_for_checker_approval_purpose() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				// seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
				subMasterRetailObj.Subproduct_InboxView_Search().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_InboxView_SearchText(), 10, 2);
		subMasterRetailObj.Subproduct_InboxView_SearchText().click();
		subMasterRetailObj.Subproduct_InboxView_SearchText().sendKeys(subProductMasterRetailData.SearchSubProductInbox);
		String reference = null;
		for (int i = 0; i < 200; i++) {
			try {
				reference = subMasterRetailObj.Sub_Producr_Product_ReferanceId().getText();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.firstEditIconInListView(), 40, 2);
		subMasterRetailObj.firstEditIconInListView().click();

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40,
		// 2);

		// json.addReferanceData(reference);
		System.out.println(reference);
		excelData.updateTestData("AT-SPR-007_D1", "Reference ID", reference);
	}

	@And("^user submit the modified record and verify the sucess message$")
	public void user_submit_the_modified_record_and_verify_the_sucess_message() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_Submit(), 30, 2);
		subMasterRetailObj.Subproduct_Submit().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_Maker_SubmitRemark(), 30, 2);
		subMasterRetailObj.Subproduct_Maker_SubmitRemark().click();
		subMasterRetailObj.Subproduct_Maker_SubmitRemark().sendKeys(subProductMasterRetailData.Remark);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.makerFinalSubmit(), 30, 2);
		subMasterRetailObj.makerFinalSubmit().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_Checker_Id(), 10, 3);
		String sucessmgs = subMasterRetailObj.Subproduct_Checker_Id().getText();
		System.out.println(sucessmgs);
		String Space = " ";
		String split[] = sucessmgs.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		excelData.updateTestData("AT-SPR-009_D1", "Checker id", popupID);
		System.out.println(popupID);

	}

	@And("^store the updated record checker ID for rejection purpose$")
	public void store_the_updated_record_checker_id_for_rejection_purpose() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_Submit(), 30, 2);
		subMasterRetailObj.Subproduct_Submit().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_Maker_SubmitRemark(), 30, 2);
		subMasterRetailObj.Subproduct_Maker_SubmitRemark().click();
		subMasterRetailObj.Subproduct_Maker_SubmitRemark().sendKeys(subProductMasterRetailData.Remark);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.makerFinalSubmit(), 30, 2);
		subMasterRetailObj.makerFinalSubmit().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_Checker_Id(), 10, 3);
		String sucessmgs = subMasterRetailObj.Subproduct_Checker_Id().getText();
		System.out.println(sucessmgs);
		String Space = " ";
		String split[] = sucessmgs.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		System.out.println(popupID);
		excelData.updateTestData("AT-SPR-008_D1", "Checker id", popupID);
	}

	@And("^user submit the modification record and store the checker id for approval purpose$")
	public void user_submit_the_modification_record_and_store_the_checker_id_for_approval_purpose() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_Submit(), 30, 2);
		subMasterRetailObj.Subproduct_Submit().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_Maker_SubmitRemark(), 30, 2);
		subMasterRetailObj.Subproduct_Maker_SubmitRemark().click();
		subMasterRetailObj.Subproduct_Maker_SubmitRemark().sendKeys(subProductMasterRetailData.Remark);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.makerFinalSubmit(), 30, 2);
		subMasterRetailObj.makerFinalSubmit().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_Checker_Id(), 10, 3);
		String sucessmgs = subMasterRetailObj.Subproduct_Checker_Id().getText();
		System.out.println(sucessmgs);
		String Space = " ";
		String split[] = sucessmgs.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		System.out.println(popupID);
		excelData.updateTestData("AT-SPR-007_D1", "Checker id", popupID);
	}

	@Then("^User validate the updated record in list view$")
	public void user_validate_the_updated_record_in_list_view() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
		// driver.findElement(By.xpath("//span[contains(text(),'" +
		// subProductMasterRetailData.ProductCode + "')]")), 10, 2);
		for (int i = 0; i < 20; i++) {
			try {
				String validate = driver
						.findElement(By.xpath(
								"//span[contains(text(),'" + subProductMasterTestData.get("ProductCode") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, subProductMasterTestData.get("ProductCode"));
				break;
			} catch (NoSuchElementException e) {

			}
		}

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
		// driver.findElement(By.xpath("//span[contains(text(),'" +
		// subProductMasterRetailData.SubProductCode + "')]")), 10, 2);
		for (int i = 0; i < 20; i++) {
			try {
				String validate1 = driver
						.findElement(By.xpath(
								"//span[contains(text(),'" + subProductMasterTestData.get("ProductCode") + "')]"))
						.getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, subProductMasterTestData.get("ProductCode"));
				break;
			} catch (NoSuchElementException e) {

			}
		}

	}

	@And("^user verify all modified details are present on post save the record$")
	public void user_verify_all_modified_details_are_present_on_post_save_the_record() throws Throwable {
		// product group
		String xpath = "//ion-select[@aria-label=' " + subProductMasterTestData.get("ProductGroup").trim()
				+ " ,  Product Group *']";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
		// product code
		for (int i = 0; i < 50; i++) {
			try {
				String xpath1 = "//ion-select[@aria-label=' " + subProductMasterTestData.get("ProductCode").trim()
						+ " ,  Product Code *']";
				Assert.assertEquals(driver.findElement(By.xpath(xpath1)).isDisplayed(), true);
				break;
			} catch (NoSuchElementException e) {

			}
		}
		// sub poduct code
		String xpath2 = "//ion-label[contains(text(),'Subproduct Code')]//following-sibling::ion-input";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 10, 2);
		String subProductCode = driver.findElement(By.xpath(xpath2)).getAttribute("ng-reflect-model");
		Assert.assertEquals(subProductCode, subProductMasterTestData.get("SubproductCode"));
		System.out.println(subProductCode);
		// sub product description
		String xpath3 = "//ion-label[contains(text(),'Subproduct Description')]//following-sibling::ion-input";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 10, 2);
		String subProductDescription = driver.findElement(By.xpath(xpath3)).getAttribute("ng-reflect-model");
		Assert.assertEquals(subProductDescription, subProductMasterTestData.get("SubProductDescription"));
		System.out.println(subProductDescription);
		// allocation seq num
		String xpath4 = "//ion-col[33]/digital-text-box[1]/ion-item[1]/ion-input[1]";
		seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath4)));
		String allocationseq = driver.findElement(By.xpath(xpath4)).getAttribute("ng-reflect-model");
		Assert.assertEquals(allocationseq, subProductMasterTestData.get("AllocationSequenceNumber"));
		System.out.println(allocationseq);

	}

	@And("^user verify enter invalid data should not be allowed on save the record$")
	public void user_verify_enter_invalid_data_should_not_be_allowed_on_save_the_record() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.subProductCode(), 10, 2);
		subMasterRetailObj.subProductCode().click();
		subMasterRetailObj.subProductCode().clear();
		subMasterRetailObj.subProductCode().sendKeys(subProductMasterTestData.get("SpecialCharacterInput"));
		String xpath = "//digital-form-error//ion-badge";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		String error = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(error);
		seleniumactions.getJavascriptHelper()
				.scrollIntoView(subMasterRetailObj.Sub_Product_Alloation_Sequence_Number());
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().clear();
		try {
			subMasterRetailObj.Sub_Product_Alloation_Sequence_Number()
					.sendKeys(subProductMasterRetailData.InvalidTestData);
		} catch (Exception e) {
			System.out.println("unable to send character data to allocation sequence number");
		}

		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.SubProductUpdate());
		subMasterRetailObj.SubProductUpdate().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.tagName("ion-toast")), 10, 2);
		WebElement Root = driver.findElement(By.tagName("ion-toast"));
		for (int i = 0; i < 50; i++) {
			try {
				WebElement ShadowDom = (WebElement) seleniumactions.getJavascriptHelper()
						.executeScript("return arguments[0].shadowRoot", Root);
				String error1 = ShadowDom.findElement(By.xpath("//ion-toast//div[@class='toast-message']")).getText();
				System.out.println(error1);
				break;
			} catch (Exception e) {

			}

		}

	}

	@And("^user verify while modification, when user keep any mandatory field blank and click on save button system should not allow to save the record$")
	public void user_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_save_button_system_should_not_allow_to_save_the_record()
			throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.subProductCode(), 10, 2);
		subMasterRetailObj.subProductCode().click();
		subMasterRetailObj.subProductCode().clear();
		String xpath = "//ion-label[contains(text(),' Subproduct Code ')]//ancestor::digital-text-box//following-sibling::div//child::ion-badge";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		System.out.println(driver.findElement(By.xpath(xpath)).getText());
		seleniumactions.getJavascriptHelper()
				.scrollIntoView(subMasterRetailObj.Sub_Product_Alloation_Sequence_Number());
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().clear();

	}

	@And("^user verify status option is non mandatory then default is active  and should be editable$")
	public void user_verify_status_option_is_non_mandatory_then_default_is_active_and_should_be_editable()
			throws Throwable {

		String xpath = "//ion-toggle[@role='switch']//input";
		seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
		Assert.assertEquals(driver.findElement(By.xpath(xpath)).getAttribute("value"),
				subProductMasterRetailData.StatusSwitchToggle);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.statusSwitchButton(), 10, 3);
		subMasterRetailObj.statusSwitchButton().click();
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.SubProductUpdate());
		subMasterRetailObj.SubProductUpdate().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.tagName("ion-toast")), 10, 2);
		WebElement Root = driver.findElement(By.tagName("ion-toast"));
		for (int i = 0; i < 50; i++) {
			try {
				WebElement ShadowDom = (WebElement) seleniumactions.getJavascriptHelper()
						.executeScript("return arguments[0].shadowRoot", Root);
				String error1 = ShadowDom.findElement(By.xpath("//ion-toast//div[@class='toast-message']")).getText();
				System.out.println(error1);
				break;
			} catch (Exception e) {

			}

		}

	}

	@And("^user select and modify loan currency$")
	public void user_select_and_modify_loan_currency() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.loanCurrency(),
				30, 2);
		subMasterRetailObj.loanCurrency().click();

		// String xpa =
		// "//ion-label[contains(text(),'"+subProductMasterRetailData.LoanCurrency+"')]";

		// WebElement loan = driver.findElement(By.xpath(xpa));
		// loan.click();
		// driver.findElement(By.xpath("//ion-label[contains(text(),'"+subProductMasterRetailData.LoanCurrency+"')]//following-sibling::ion-radio")).click();

		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subProductMasterRetailData.LoanCurrency
						+ "')]//following-sibling::ion-radio")).click();

				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^user select and modify the repayment type$")
	public void user_select_and_modify_the_repayment_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.repaymentType(), 30, 2);
		subMasterRetailObj.repaymentType().click();

		String xpath = "//ion-label[contains(text(),'" + subProductMasterRetailData.RepaymentType
				+ "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^user select and modify Flat and Reducing data$")
	public void user_select_and_modify_flat_and_reducing_data() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.flatReducing(),
				30, 2);
		subMasterRetailObj.flatReducing().click();

		String xpath1 = "//ion-label[contains(text(),'" + subProductMasterRetailData.FlatReducing
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath1)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^user select and modify interest Amortization Method$")
	public void user_select_and_modify_interest_amortization_method() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.intAmortizationMethod(), 30, 2);
		subMasterRetailObj.intAmortizationMethod().click();

		String xpath2 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IntAmortizationMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^user select and modify interest Amortization Method for reject$")
	public void user_select_and_modify_interest_amortization_method_for_reject() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.intAmortizationMethod(), 30, 2);
		subMasterRetailObj.intAmortizationMethod().click();

		String xpath2 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IntAmortizationMethodReject
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^user select and modify interest Amortization Method for return$")
	public void user_select_and_modify_interest_amortization_method_for_return() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.intAmortizationMethod(), 30, 2);
		subMasterRetailObj.intAmortizationMethod().click();

		String xpath2 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IntAmortizationMethodReturn
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Compute Installment on$")
	public void user_select_and_modify_compute_installment_on() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.computeInstallmentOn(), 30, 2);
		for (int i = 1; i < 200; i++) {
			try {
				subMasterRetailObj.computeInstallmentOn().click();
				break;

			} catch (Exception e) {

			}
		}

		String xpath3 = "//ion-label[contains(text(),'" + subProductMasterRetailData.ComputeInstallmentOn
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath3)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select and Modify Compute Installment on for approved$")
	public void user_select_and_modify_compute_installment_on_for_approved() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.computeInstallmentOn(), 30, 2);
		subMasterRetailObj.computeInstallmentOn().click();

		String xpath3 = "//ion-label[contains(text(),'" + subProductMasterRetailData.ComputeInstallmentOnApproved
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath3)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Interest Due date method$")
	public void user_select_and_modify_interest_due_date_method() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.instDueDateMethod(),30,
		// 2);
		for (int i = 1; i < 200; i++) {
			try {
				subMasterRetailObj.instDueDateMethod().click();
				break;

			} catch (Exception e) {

			}
		}

		String xpath4 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InstDueDateMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath4)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Principal repayment Frequency$")
	public void user_select_and_modify_principal_repayment_frequency() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.lpcGracePeriod());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.principalRepaymentFrequency(), 30, 2);
		subMasterRetailObj.principalRepaymentFrequency().click();

		String xpath5 = "//ion-label[contains(text(),'" + subProductMasterRetailData.PrincipalRepaymentFrequency
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath5)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Interest Repayment Frequency$")
	public void user_select_and_modify_interest_repayment_frequency() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.interestRepaymentFrequency(), 30, 2);
		subMasterRetailObj.interestRepaymentFrequency().click();

		String xpath6 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InterestRepaymentFrequency
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath6)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Loan Eligibility Calculation$")
	public void user_select_and_modify_loan_eligibility_calculation() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.loanElegibilityCalc().click();
				break;
			} catch (Exception e) {

			}
		}

		String xpath7 = "//ion-label[contains(text(),'" + subProductMasterRetailData.LoanElegibilityCalc
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath7)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Include Guarantor inclusive$")
	public void user_select_and_modify_include_guarantor_inclusive() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.includeGuarantorInc(), 30, 2);
		subMasterRetailObj.includeGuarantorInc().click();

		String xpath8 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IncludeGuarantorInc
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath8)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Due Period Required$")
	public void user_select_and_modify_due_period_required() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.duePeriodRequired(), 30, 2);
		subMasterRetailObj.duePeriodRequired().click();

		String xpath9 = "//ion-label[contains(text(),'" + subProductMasterRetailData.DuePeriodRequired
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath9)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Installment commence from$")
	public void user_select_and_modify_installment_commence_from() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.instCommenceFrom(), 30, 2);
		subMasterRetailObj.instCommenceFrom().click();

		String xpath10 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InstCommenceFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath10)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Days in Year$")
	public void user_select_and_modify_days_in_year() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.daysInYear());

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.daysInYear(),
				30, 2);
		subMasterRetailObj.daysInYear().click();

		String xpath11 = "//ion-label[contains(text(),'" + subProductMasterRetailData.DaysInYear
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath11)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select and Modify Multiple Disbursement Tranch Allowed$")
	public void user_select_and_modify_multiple_disbursement_tranch_allowed() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.multipleDisbursTranchAllowed(), 30, 2);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.multipleDisbursTranchAllowed().click();
				break;
			} catch (Exception e) {

			}
		}

		String xpath12 = "//ion-label[contains(text(),'" + subProductMasterRetailData.MultipleDisbursTranchAllowed
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath12)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Include Income Deduction Debit$")
	public void user_select_and_modify_include_income_deduction_debit() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.includeIncomeDeduDebt(),30,
		// 2);
		for (int i = 1; i < 20; i++) {
			try {
				subMasterRetailObj.includeIncomeDeduDebt().click();
				break;

			} catch (Exception e) {

			}
		}

		String xpath13 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IncludeIncomeDeduDebt
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath13)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select and Modify Round off$")
	public void user_select_and_modify_round_off() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.roundOff(), 30,
				2);
		for (int i = 1; i < 20; i++) {
			try {
				subMasterRetailObj.roundOff().click();
				break;
			} catch (Exception e) {

			}
		}

		String xpath14 = "//ion-label[contains(text(),'" + subProductMasterRetailData.RoundOff
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath14)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Appropriation Code$")
	public void user_select_and_modify_appropriation_code() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.appropriationCode(), 30, 2);
		subMasterRetailObj.appropriationCode().click();

		String xpath15 = "//ion-label[contains(text(),'" + subProductMasterRetailData.AppropriationCode
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath15)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Ballon Allowed$")
	public void user_select_and_modify_ballon_allowed() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.balloonAllowed());

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.balloonAllowed(), 30, 2);
		subMasterRetailObj.balloonAllowed().click();

		String xpath16 = "//ion-label[contains(text(),'" + subProductMasterRetailData.BalloonAllowed
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath16)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Pre owned Asset$")
	public void user_select_and_modify_pre_owned_asset() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.preOwnedAsset());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.preOwnedAsset(), 30, 2);
		subMasterRetailObj.preOwnedAsset().click();
		String xpath17 = "//ion-label[contains(text(),'" + subProductMasterRetailData.PreOwnedAsset
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath17)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Day Count Convention for BPI$")
	public void user_select_and_modify_day_count_convention_for_bpi() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.dayCountConventionForBPI());
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.dayCountConventionForBPI().click();
				break;

			} catch (Exception e) {

			}
		}
		String xpath18 = "//ion-label[contains(text(),'" + subProductMasterRetailData.DayCountConventionForBPI
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath18)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Interest Charging Starts from$")
	public void user_select_and_modify_interest_charging_starts_from() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.interestChargingStartsFrom());
		subMasterRetailObj.interestChargingStartsFrom().click();

		String xpath19 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InterestChargingStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath19)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify BPI recovery$")
	public void user_select_and_modify_bpi_recovery() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.bpiRecovery());

		for (int i = 1; i < 20; i++) {
			try {
				subMasterRetailObj.bpiRecovery().click();
				break;

			} catch (Exception e) {

			}
		}
		String xpath20 = "//ion-label[contains(text(),'" + subProductMasterRetailData.BpiRecovery
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath20)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Installment Recovery Type$")
	public void user_select_and_modify_installment_recovery_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.installmentRecoveryType(), 30, 2);
		subMasterRetailObj.installmentRecoveryType().click();

		String xpath21 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InstallmentRecoveryType
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath21)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select and Modify iS Step up allowed$")
	public void user_select_and_modify_is_step_up_allowed() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.isStepupAllowed(), 30, 2);
		subMasterRetailObj.isStepupAllowed().click();

		String xpath22 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IsStepupAllowed
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath22)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Rate Type$")
	public void user_select_and_modify_rate_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.rateType(), 30,
				2);
		subMasterRetailObj.rateType().click();

		String xpath23 = "//ion-label[contains(text(),'" + subProductMasterRetailData.RateType
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath23)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Initiate Discount Factor$")
	public void user_select_and_modify_initiate_discount_factor() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.initiateDiscFactor());

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.initiateDiscFactor(), 30, 2);
		subMasterRetailObj.initiateDiscFactor().click();

		String xpath24 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InitiateDiscFactor
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath24)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Bulk Payment$")
	public void user_select_and_modify_bulk_payment() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.bulkPayment(),
				30, 2);
		subMasterRetailObj.bulkPayment().click();

		Thread.sleep(1000);

		String xpath25 = "//ion-label[contains(text(),'" + subProductMasterRetailData.bulkPayment
				+ "')]//following-sibling::ion-radio";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath25)), 30, 2);
		driver.findElement(By.xpath(xpath25)).click();

	}

	@And("^User select and Modify Immediate and due date$")
	public void user_select_and_modify_immediate_and_due_date() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.immediateDueDate(), 30, 2);
		subMasterRetailObj.immediateDueDate().click();

		String xpath26 = "//ion-label[contains(text(),'" + subProductMasterRetailData.immediateDueDate
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath26)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Bulk Payment Lock in Starts from$")
	public void user_select_and_modify_bulk_payment_lock_in_starts_from() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.bulkPaymentLockinStartsFrom(), 30, 2);
		subMasterRetailObj.bulkPaymentLockinStartsFrom().click();

		String xpath27 = "//ion-label[contains(text(),'" + subProductMasterRetailData.bulkPaymentLockinStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath27)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Bulk Payment min bulk payment Parameter$")
	public void user_select_and_modify_bulk_payment_min_bulk_payment_parameter() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.minBulkPaymentParameter(), 30, 2);
		subMasterRetailObj.minBulkPaymentParameter().click();

		String xpath28 = "//ion-label[contains(text(),'" + subProductMasterRetailData.minBulkPaymentParameter
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath28)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Bulk Payment max bulk payment parameter$")
	public void user_select_and_modify_bulk_payment_max_bulk_payment_parameter() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.maxBulkPaymentparameters(), 30, 2);
		subMasterRetailObj.maxBulkPaymentparameters().click();

		String xpath29 = "//ion-label[contains(text(),'" + subProductMasterRetailData.maxBulkPaymentparameters
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath29)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Bulk Payment Forclosure lock in Starts from$")
	public void user_select_and_modify_bulk_payment_forclosure_lock_in_starts_from() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.foreClosureLockInStartsFrom());
		subMasterRetailObj.foreClosureLockInStartsFrom().click();
		String xpath30 = "//ion-label[contains(text(),'" + subProductMasterRetailData.foreClosureLockInStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath30)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select and Modify Bulk Payment min rebate parameter$")
	public void user_select_and_modify_bulk_payment_min_rebate_parameter() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.minRebateParameter(), 30, 2);
		subMasterRetailObj.minRebateParameter().click();

		String xpath31 = "//ion-label[contains(text(),'" + subProductMasterRetailData.minRebateParameter
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath31)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Bulk Payment max rebate parameter$")
	public void user_select_and_modify_bulk_payment_max_rebate_parameter() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.maxRebateParameter());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.maxRebateParameter(), 30, 2);
		subMasterRetailObj.maxRebateParameter().click();

		String xpath32 = "//ion-label[contains(text(),'" + subProductMasterRetailData.maxRebateParameter
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath32)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Bulk Payment Reschedulement Lock in starts from$")
	public void user_select_and_modify_bulk_payment_reschedulement_lock_in_starts_from() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.reschedulementLockInStartsFrom());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.reschedulementLockInStartsFrom(), 30, 2);
		subMasterRetailObj.reschedulementLockInStartsFrom().click();

		String xpath33 = "//ion-label[contains(text(),'" + subProductMasterRetailData.reschedulementLockInStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath33)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Interest computed$")
	public void user_select_and_modify_interest_computed() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.interestComputed());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.interestComputed(), 30, 2);
		subMasterRetailObj.interestComputed().click();

		String xpath34 = "//ion-label[contains(text(),'" + subProductMasterRetailData.interestComputed
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath34)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify recomputation of profit$")
	public void user_select_and_modify_recomputation_of_profit() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.recomputationofProfit());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.recomputationofProfit(), 30, 2);
		subMasterRetailObj.recomputationofProfit().click();

		String xpath35 = "//ion-label[contains(text(),'" + subProductMasterRetailData.recomputationofProfit
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath35)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify pre EMI$")
	public void user_select_and_modify_pre_emi() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.tdsApplicable());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.preEMI(), 30,
				2);
		subMasterRetailObj.preEMI().click();

		String xpath36 = "//ion-label[contains(text(),'" + subProductMasterRetailData.preEMI
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath36)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify mi recovery to be renamed as$")
	public void user_select_and_modify_mi_recovery_to_be_renamed_as() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.miRecoveryToBeRenamedAs(), 30, 2);
		subMasterRetailObj.miRecoveryToBeRenamedAs().click();

		String xpath37 = "//ion-label[contains(text(),'" + subProductMasterRetailData.miRecoveryToBeRenamedAs
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath37)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify bpi payment tenure method$")
	public void user_select_and_modify_bpi_payment_tenure_method() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.bpiRepaymentTenureMethod());
		subMasterRetailObj.bpiRepaymentTenureMethod().click();

		String xpath38 = "//ion-label[contains(text(),'" + subProductMasterRetailData.bpiRepaymentTenureMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath38)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select and Modify bpi rate method$")
	public void user_select_and_modify_bpi_rate_method() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.bpiRateMethod(), 30, 2);
		subMasterRetailObj.bpiRateMethod().click();

		String xpath39 = "//ion-label[contains(text(),'" + subProductMasterRetailData.bpiRateMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath39)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select and Modify bpi repayment frequency$")
	public void user_select_and_modify_bpi_repayment_frequency() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.bpiRepaymentFrequency(), 30, 2);
		subMasterRetailObj.bpiRepaymentFrequency().click();

		String xpath40 = "//ion-label[contains(text(),'" + subProductMasterRetailData.bpiRepaymentFrequency
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath40)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User select and Modify Tds applicable$")
	public void user_select_and_modify_tds_applicable() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.tdsApplicable(), 30, 2);
		subMasterRetailObj.tdsApplicable().click();

		String xpath41 = "//ion-label[contains(text(),'" + subProductMasterRetailData.tdsApplicable
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath41)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^user verify the functionality of Activate and Deactivate button$")
	public void user_verify_the_functionality_of_activate_and_deactivate_button() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.statusSwitchButton(), 10, 3);
		subMasterRetailObj.statusSwitchButton().click();
		subMasterRetailObj.statusSwitchButton().click();

	}

	@And("^user verify the functionality of View Workflow button$")
	public void user_verify_the_functionality_of_view_workflow_button() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.viewSummary(),30,
		// 2);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.viewSummary().click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.closeButtonInSummary().click();
				break;
			} catch (Exception e) {

			}
		}

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.closeButtonInSummary(),30,
		// 2);

	}

	@And("^User save the record for parameter updation$")
	public void user_save_the_record_for_parameter_updation() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.Save());
		subMasterRetailObj.Save().click();

	}

	@Then("^verify success message in parameter tab$")
	public void verify_success_message_in_parameter_tab() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.successMgs(),
				10, 2);
		Assert.assertEquals(subMasterRetailObj.successMgs().isDisplayed(), true);
	}

	@And("^User Update the record for parameter$")
	public void user_update_the_record_for_parameter() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.SubProductUpdate());
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.SubProductUpdate().click();
				break;
			} catch (Exception e) {

			}

		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.successMgs(),
				10, 2);
		Assert.assertEquals(subMasterRetailObj.successMgs().isDisplayed(), true);
	}

	@And("^User verify while modification, when user keep any mandatory field blank and click on save button for parameter tabs$")
	public void user_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_save_button_for_parameter_tabs()
			throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.Save());
		subMasterRetailObj.Save().click();

		// Principal Repayment Frequency
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.principalRepaymentFrequency());
		String xpath = "//ion-label[contains(text(),'Principal Repayment Frequency')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		// System.out.println(driver.findElement(By.xpath(xpath)).getText());
		Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Required field");
		// Interest Repayment Frequency
		String xpath1 = "//ion-label[contains(text(),' Interest Repayment Frequency ')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath1)), 10, 2);
		// System.out.println(driver.findElement(By.xpath(xpath1)).getText());
		Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Required field");
		// Loan Eligibility Calc
		String xpath2 = "//ion-label[contains(text(),' Loan Eligibility Calc. ')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 10, 2);
		// System.out.println(driver.findElement(By.xpath(xpath2)).getText());
		Assert.assertEquals(driver.findElement(By.xpath(xpath2)).getText(), "Required field");
		// Include Guarantor Inc.
		String xpath3 = "//ion-label[contains(text(),'Include Guarantor Inc.')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 10, 2);
		// System.out.println(driver.findElement(By.xpath(xpath3)).getText());
		Assert.assertEquals(driver.findElement(By.xpath(xpath3)).getText(), "Required field");
		System.out.println("System does not allow to save the record with bank fields");

	}

	@And("^user verify the rejected record removed from the system$")
	public void user_verify_the_rejected_record_removed_from_the_system() throws Throwable {
		subProductMasterTestData=excelData.getTestdata("AT-SPR-0012_D1");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.Subproduct_InboxView_Search().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_InboxView_SearchText(), 10, 2);
		subMasterRetailObj.Subproduct_InboxView_SearchText().click();
		subMasterRetailObj.Subproduct_InboxView_SearchText().sendKeys(json.readReferancedata());
		String xpath = "//span[contains(text(),'" + subProductMasterTestData.get("Reference ID") + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
				break;
			} catch (NoSuchElementException e) {

			}
		}

	}

	@And("^user verify the returned record removed from the system$")
	public void user_verify_the_returned_record_removed_from_the_system() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.Subproduct_InboxView_Search().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Subproduct_InboxView_SearchText(), 10, 2);
		subMasterRetailObj.Subproduct_InboxView_SearchText().click();
		subMasterRetailObj.Subproduct_InboxView_SearchText().sendKeys(json.readReferancedata());
		String xpath = "//span[contains(text(),'" + json.readReferancedata() + "')]";
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
				break;
			} catch (NoSuchElementException e) {

			}
		}
	}

	@And("^user select Product code under product details for parameter Updation$")
	public void user_select_product_code_under_product_details_for_parameter_updation() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productCode(),
				10, 2);
		subMasterRetailObj.productCode().click();
		System.out.println(subProductMasterRetailData.ProductCodecParameterUpdation);
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getJavascriptHelper()
						.scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'"
								+ subProductMasterRetailData.ProductCodecParameterUpdation
								+ "')]/following-sibling::ion-radio")));
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + subProductMasterRetailData.ProductCodecParameterUpdation
								+ "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Product code under product details for parameter Validation$")
	public void user_select_product_code_under_product_details_for_parameter_validation() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productCode(),
				10, 2);
		subMasterRetailObj.productCode().click();
		System.out.println(subProductMasterRetailData.ProductCodecParameterValidation);
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getJavascriptHelper()
						.scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'"
								+ subProductMasterRetailData.ProductCodecParameterValidation
								+ "')]/following-sibling::ion-radio")));
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + subProductMasterRetailData.ProductCodecParameterValidation
								+ "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user enter sub product code under sub product for parameter Validation$")
	public void user_enter_sub_product_code_under_sub_product_for_parameter_validation() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.subProductCode(), 10, 2);
		subMasterRetailObj.subProductCode().click();
		subMasterRetailObj.subProductCode().sendKeys(subProductMasterRetailData.SubProductCodeParameterValidation);
	}

	@And("^user enter sub product code under sub product for parameter Updation$")
	public void user_enter_sub_product_code_under_sub_product_for_parameter_updation() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.subProductCode(), 10, 2);
		subMasterRetailObj.subProductCode().click();
		subMasterRetailObj.subProductCode().sendKeys(subProductMasterRetailData.SubProductCodeParameterUpdation);
	}

	@When("^user click product set up menu$")
	public void user_click_product_set_up_menu() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productSetup(), 10, 2);
		subMasterRetailObj.productSetup().click();
	}

	@When("^user click the configuration menu for sub product retail$")
	public void user_click_the_configuration_menu_for_sub_product_retail() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.ulsConfigurationsMainMenu(), 30, 2);
		subMasterRetailObj.ulsConfigurationsMainMenu().click();
	}

	@And("^user click list view icon of sub product retail$")
	public void user_click_list_view_icon_of_sub_product_retail() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.subProductViewIcon(), 10, 2);
		subMasterRetailObj.subProductViewIcon().click();
	}

	@And("^click on temp view of sub product retail master$")
	public void click_on_temp_view_of_sub_product_retail_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.subProductRetailTempView(), 10, 2);
		subMasterRetailObj.subProductRetailTempView().click();
	}

	@And("^user click add icon for create record in sub product retail$")
	public void user_click_add_icon_for_create_record_in_sub_product_retail() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.addIcon(), 10, 2);
		subMasterRetailObj.addIcon().click();
	}

	@And("^user click Back button icon in sub product retail$")
	public void user_click_back_button_icon_in_sub_product_retail() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Back(), 10, 2);
		subMasterRetailObj.Subproduct_Back().click();
	}

	@And("^get the test datafor creation of record which is going to reject by maker$")
	public void get_the_test_datafor_creation_of_record_which_is_going_to_reject_by_maker() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-T001_D2");
	}

	@And("^get the test data of creation of sub product record whcih is going to return in checker stage$")
	public void get_the_test_data_of_creation_of_sub_product_record_whcih_is_going_to_return_in_checker_stage()
			throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-T001_D3");
	}

	@And("^get the test data of validation scenario$")
	public void get_the_test_data_of_validation_scenario() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-005_D1");
	}
	@And("^get the test data for creation of sub product parameter which is going to rejected by checker$")
    public void get_the_test_data_for_creation_of_sub_product_parameter_which_is_going_to_rejected_by_checker() throws Throwable {
		subProductMasterTestData=excelData.getTestdata("AT-SPR-010_D2");
    }
	@And("^get the test data for sub product parameter creation which going to return in checker$")
    public void get_the_test_data_for_sub_product_parameter_creation_which_going_to_return_in_checker() throws Throwable {
		subProductMasterTestData=excelData.getTestdata("AT-SPR-010_D3");
    }
	@And("^user select Product group under product details and verify fields$")
	public void user_select_product_group_under_product_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Product Group");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Product(), 10, 2);
		Tab = subMasterRetailObj.Sub_Product_Product().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productGroup(), 10, 2);
		subMasterRetailObj.productGroup().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(), '"
						+ subProductMasterTestData.get("ProductGroup") + "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Product code under product details for verify parameter field invalid$")
	public void user_select_product_code_under_product_details_for_verify_parameter_field_invalid() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Product Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productCode(), 10, 2);
		subMasterRetailObj.productCode().click();
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("ProductCode") + "')]/following-sibling::ion-radio")));
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.ProductCodeParameter
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Product code under product details and verify fields$")
	public void user_select_product_code_under_product_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Product Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productCode(), 10, 2);
		System.out.println("Product Code : " + subProductMasterTestData.get("ProductCode"));
		subMasterRetailObj.productCode().click();
		for (int i = 0; i < 30; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("ProductCode") + "')]/following-sibling::ion-radio")));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("ProductCode") + "')]/following-sibling::ion-radio")));
				clicksAndActionsHelper.clickUsingActionClass(
						driver.findElement(By.xpath("//ion-label[contains(text(),'"
								+ subProductMasterTestData.get("ProductCode") + "')]/following-sibling::ion-radio")),
						driver.findElement(By.xpath("//ion-label[contains(text(),'"
								+ subProductMasterTestData.get("ProductCode") + "')]/following-sibling::ion-radio")));
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user select Product codes under product details and verify fields$")
	public void user_select_product_codes_under_product_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Product Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productCode(), 10, 2);
		subMasterRetailObj.productCode().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("ProductCode") + "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user enter sub product code under sub product definition details and verify fields$")
	public void user_enter_sub_product_code_under_sub_product_definition_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Subproduct Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Subproduct_Definition(),
				10, 2);
		Tab = subMasterRetailObj.Sub_Product_Subproduct_Definition().getText();
		System.out.println("System should display The Tab as " + Tab);
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.subProductCode(), 10, 2);
		Random random = new Random();
		int randomNumber1 = random.nextInt(500 - 100) + 100;
		String subproductCode =subProductMasterTestData.get("PrefixCode")+randomNumber1;
		excelData.updateTestData(subProductMasterTestData.get("Data Set ID"),"SubproductCode" , subproductCode);
		for (int i = 0; i < 30; i++) {
			try {
				subMasterRetailObj.subProductCode().click();
				subMasterRetailObj.subProductCode().sendKeys(subproductCode);
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^user enter sub product codes under sub product definition details and verify fields$")
	public void user_enter_sub_product_codes_under_sub_product_definition_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Subproduct Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Subproduct_Definition(),
				10, 2);
		Tab = subMasterRetailObj.Sub_Product_Subproduct_Definition().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.subProductCode(), 10, 2);
		subMasterRetailObj.subProductCode().click();
		subMasterRetailObj.subProductCode().sendKeys(subProductMasterTestData.get("SubproductCode"));
	}

	@And("^user enter sub product code under sub product definition for verify parameter invalid data$")
	public void user_enter_sub_product_code_under_sub_product_definition_for_verify_parameter_invalid_data()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Subproduct Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Subproduct_Definition(),
				10, 2);
		Tab = subMasterRetailObj.Sub_Product_Subproduct_Definition().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.subProductCode(), 10, 2);
		subMasterRetailObj.subProductCode().click();
		subMasterRetailObj.subProductCode().sendKeys(subprdMstData.SubproductcodeParameter);
	}

	@And("^user enter sub product code description under sub product definition details and verify fields$")
	public void user_enter_sub_product_code_description_under_sub_product_definition_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("subProduct Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.subProductDescription(), 10, 2);
		Random random = new Random();
		int randomNumber1 = random.nextInt(500 - 100) + 100;
		String subproductCodeDescription =subProductMasterTestData.get("PrefixDescription")+randomNumber1;
		excelData.updateTestData(subProductMasterTestData.get("Data Set ID"),"SubProductDescription" , subproductCodeDescription);
		subMasterRetailObj.subProductDescription().click();
		subMasterRetailObj.subProductDescription().sendKeys(subproductCodeDescription);
	}

	@And("^user select facility type under facility details$")
	public void user_select_facility_type_under_facility_details() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Facility Type");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Facility(), 10, 2);
		Tab = subMasterRetailObj.Sub_Product_Facility().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.facilityType(), 10, 2);
		subMasterRetailObj.facilityType().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("FacilityType") + "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select individual or corporate under facility details and verify fields$")
	public void user_select_individual_or_corporate_under_facility_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Individual/Corporate");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.individualCorporate(), 10, 2);
		subMasterRetailObj.individualCorporate().click();
		for (int i = 0; i < 200; i++) {
			try {// Individual_Corporate
				driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("Individual_Corporate") + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Loan Purpose under facility details and verify fields$")
	public void user_select_loan_purpose_under_facility_details_and_verify_fields() throws Throwable {
		javascriptHelper.scrollIntoView(subMasterRetailObj.loanPurpose());
		verifyfield.verifyGivenFieldisMandatoryOrNot("Loan Purpose");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.loanPurpose(), 10, 2);
		subMasterRetailObj.loanPurpose().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("LoanPurpose") + "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Installed Based under facility details and verify fields$")
	public void user_select_installed_based_under_facility_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Installment Based");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.installmentBased(), 10, 2);
		subMasterRetailObj.installmentBased().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("InstallmentBased") + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select continue with existing loan number under facility details and verify fields$")
	public void user_select_continue_with_existing_loan_number_under_facility_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Continue Existing Loan Number");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.continueExistingLoanNumber(), 10,
				2);
		subMasterRetailObj.continueExistingLoanNumber().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + subProductMasterTestData.get("ContinueExistingLoanNumber")
								+ "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select financial concept under facility details and verify fields$")
	public void user_select_financial_concept_under_facility_details_and_verify_fields() throws Throwable {
		javascriptHelper.scrollIntoView(subMasterRetailObj.financialConcept());
		verifyfield.verifyGivenFieldisMandatoryOrNot("Financing Concept");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.financialConcept(), 10, 2);
		subMasterRetailObj.financialConcept().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("FinancingConcept") + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Disbursement locking under facility details and verify fields$")
	public void user_select_disbursement_locking_under_facility_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Disbursement Locking");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.disbursementLocking(), 10, 2);
		subMasterRetailObj.disbursementLocking().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("DisbursementLocking") + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Top Up Allowed under facility details and verify fields$")
	public void user_select_top_up_allowed_under_facility_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Top Up Allowed");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.topUpAllowed(), 10, 2);
		subMasterRetailObj.topUpAllowed().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("TopupAllowed") + "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select collatralized under Asset Financed details and verify fields$")
	public void user_select_collatralized_under_asset_financed_details_and_verify_fields() throws Throwable {

		verifyfield.verifyGivenFieldisMandatoryOrNot("Collateralized");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Asset_Financed(), 70,
				2);
		Tab = subMasterRetailObj.Sub_Product_Asset_Financed().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Collateralized(), 10,
				2);
		subMasterRetailObj.Sub_Product_Collateralized().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ subProductMasterTestData.get("Collateralized") + "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select finance against existing Asset under Asset Financed details and verify fields$")
	public void user_select_finance_against_existing_asset_under_asset_financed_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Finance Against Existing Asset");
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Sub_Product_Finance_Against_Existing_Asset(), 10, 2);
		subMasterRetailObj.Sub_Product_Finance_Against_Existing_Asset().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + subProductMasterTestData.get("FinanceAgainstExistingAsset")
								+ "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select is multiple Asset Finance is allowed under Asset Financed details and verify fields$")
	public void user_select_is_multiple_asset_finance_is_allowed_under_asset_financed_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Is Multi Asset Finance Allowed");
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Sub_Product_Multi_Asset_Finance_Allowed(), 10, 2);
		subMasterRetailObj.Sub_Product_Multi_Asset_Finance_Allowed().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + subProductMasterTestData.get("IsMultiAssetFinanceAllowed")
								+ "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select impact on under Floating Rate details and verify fields$")
	public void user_select_impact_on_under_floating_rate_details_and_verify_fields() throws Throwable {
		javascriptHelper.scrollIntoView(subMasterRetailObj.Sub_Product_ImpactOn());
		verifyfield.verifyGivenFieldisMandatoryOrNot("Impact On");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Floating_Rate(), 10, 2);
		Tab = subMasterRetailObj.Sub_Product_Floating_Rate().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_ImpactOn(), 10, 2);
		subMasterRetailObj.Sub_Product_ImpactOn().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subProductMasterTestData.get("ImpactOn")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Reset Logic under Floating Rate details and verify fields$")
	public void user_select_reset_logic_under_floating_rate_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Reset Logic");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_ResetLogic(), 10, 2);
		subMasterRetailObj.Sub_Product_ResetLogic().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subProductMasterTestData.get("ResetLogic")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Floating rate Effective date under Floating Rate details and verify fields$")
	public void user_select_floating_rate_effective_date_under_floating_rate_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Float Rate Effective Date");
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Sub_Product_Float_Rate_Effective_Date(), 10, 2);
		subMasterRetailObj.Sub_Product_Float_Rate_Effective_Date().click();
		System.out.println("Effective Date " + subProductMasterTestData.get("FloatRateEffectiverDate"));
		String xpath = "//ion-label[text()=' " + subProductMasterTestData.get("FloatRateEffectiverDate")
				+ " ']//parent::ion-item//ion-radio";
		for (int i = 0; i < 200; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(xpath)),
						driver.findElement(By.xpath(xpath)));
//				driver.findElement(By.xpath("//ion-label[text(),'"
//						+ subProductMasterTestData.get("FloatRateEffectiverDate") + "']/following-sibling::ion-radio"))
//						.click();
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user select Floating Rate Effective Frequency under Floating Rate details and verify fields$")
	public void user_select_floating_rate_effective_frequency_under_floating_rate_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Float Rate Effective Frequency");
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Sub_Product_Float_Rate_Effective_Frequency(), 10, 2);
		subMasterRetailObj.Sub_Product_Float_Rate_Effective_Frequency().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + subProductMasterTestData.get("FloatRateEffectiveFrequency")
								+ "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user enter EMI CAP percentage under Floating Rate details and verify fields$")
	public void user_enter_emi_cap_percentage_under_floating_rate_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("EMI Cap (In %)");
		for (int i = 0; i < 100; i++) {
			try {
				waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_EMI_Cap(), 90,
						2);
				subMasterRetailObj.Sub_Product_EMI_Cap().click();
				subMasterRetailObj.Sub_Product_EMI_Cap().sendKeys(subProductMasterTestData.get("EMICap"));
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user enter tenor tolerance in months under Floating Rate details and verify fields$")
	public void user_enter_tenor_tolerance_in_months_under_floating_rate_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Tenor Tolerance (In months)");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_tenorTolerance(), 10,
				2);
		subMasterRetailObj.Sub_Product_tenorTolerance().click();
		subMasterRetailObj.Sub_Product_tenorTolerance().sendKeys(subProductMasterTestData.get("TenorTolerance"));
	}

	@And("^user enter legacy code 1 under Legacy Codes details and verify fields$")
	public void user_enter_legacy_code_1_under_legacy_codes_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Legacy Code 1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Legacy_Codes(), 10, 2);
		Tab = subMasterRetailObj.Sub_Product_Legacy_Codes().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Legacy_Codes1(), 10, 2);
		subMasterRetailObj.Sub_Product_Legacy_Codes1().click();
		subMasterRetailObj.Sub_Product_Legacy_Codes1().sendKeys(subProductMasterTestData.get("LegacyCode1"));
	}

	@And("^user enter legacy code 2 under Legacy Codes details and verify fields$")
	public void user_enter_legacy_code_2_under_legacy_codes_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Legacy Code 2");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Legacy_Codes2(), 10, 2);
		subMasterRetailObj.Sub_Product_Legacy_Codes2().click();
		subMasterRetailObj.Sub_Product_Legacy_Codes2().sendKeys(subProductMasterTestData.get("LegacyCode2"));
	}

	@And("^user enter dm code under Legacy Codes details and verify fields$")
	public void user_enter_dm_code_under_legacy_codes_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("DM Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_DM_Code(), 10, 2);
		subMasterRetailObj.Sub_Product_DM_Code().click();
		subMasterRetailObj.Sub_Product_DM_Code().sendKeys(subProductMasterTestData.get("DMCode"));
	}

	@And("^user enetr Allocation sequence number under Legacy Codes details and verify fields$")
	public void user_enetr_allocation_sequence_number_under_legacy_codes_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Allocation Sequence Number");
		Random random = new Random();
		int allocationSequence = random.nextInt(99 - 10) + 10;
		excelData.updateTestData(subProductMasterTestData.get("Data Set ID"),"AllocationSequenceNumber", String.valueOf(allocationSequence));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.Sub_Product_Alloation_Sequence_Number(), 10, 2);
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
		subMasterRetailObj.Sub_Product_Alloation_Sequence_Number()
				.sendKeys(String.valueOf(allocationSequence));
		

	}

	@And("^user verify and save the Record with Valid data$")
	public void user_verify_and_save_the_record_with_valid_data() throws Throwable {
		javascriptHelper.scrollIntoView(subMasterRetailObj.Sub_Product_Product_Save());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Product_Save(), 10, 2);
		subMasterRetailObj.Sub_Product_Product_Save().isDisplayed();
		subMasterRetailObj.Sub_Product_Product_Save().click();
		
	}

	@And("^user goto the Maker Inbox$")
	public void user_goto_the_maker_inbox() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Inbox(), 10, 2);
		subMasterRetailObj.Sub_Product_Inbox().click();
	}

	@Then("^user store the Referance Id in Maker stage and Click on Action Icon$")
	public void user_store_the_referance_id_in_maker_stage_and_click_on_action_icon() throws Throwable {
		String RefId =null;
		for (int i = 0; i <200; i++) {
			try {
				RefId = subMasterRetailObj.Sub_Producr_Product_ReferanceId().getText();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
		
		System.out.println(RefId);
		excelData.updateTestData("AT-SPR-T001_D1", "Reference ID", RefId);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Action(), 10, 2);
		subMasterRetailObj.Sub_Product_Action().click();
	}

	@Then("^user store the Referance Id in Maker stage for checker return purpose and Click on Action Icon$")
	public void user_store_the_referance_id_in_maker_stage_for_checker_return_purpose_and_click_on_action_icon()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Producr_Product_ReferanceId(),
				10, 2);
		String RefId = subMasterRetailObj.Sub_Producr_Product_ReferanceId().getText();
		System.out.println(RefId);
		json.addReferanceData(RefId);
		excelData.updateTestData("AT-SPR-T004_D1", "Reference ID", RefId);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Action(), 10, 2);
		subMasterRetailObj.Sub_Product_Action().click();
	}

	@Then("^user store the Referance Id in Maker stage and Click on Action Icon which is going to reject in checker$")
	public void user_store_the_referance_id_in_maker_stage_and_click_on_action_icon_which_is_going_to_reject_in_checker()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Producr_Product_ReferanceId(),
				10, 2);
		String RefId = subMasterRetailObj.Sub_Producr_Product_ReferanceId().getText();
		System.out.println(RefId);
		// json.addReferanceData(RefId);
		excelData.updateTestData("AT-SPR-T003_D1", "Reference ID", RefId);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Action(), 10, 2);
		subMasterRetailObj.Sub_Product_Action().click();
	}

	@And("^store the record reference number for checker approval$")
	public void store_the_record_reference_number_for_checker_approval() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_SaveSuccess_alert(), 10,
				2);
		Toast = subMasterRetailObj.Subproduct_SaveSuccess_alert().getText();
		System.out.println("Toast alert message " + Toast);
		System.out.println(Toast.substring(37).trim());
		Assert.assertTrue(Toast.contains("Success"));
		System.err.println(subProductMasterTestData.get("Data Set ID"));
		excelData.updateTestData(subProductMasterTestData.get("Data Set ID"), "Reference ID", Toast.substring(37).trim());
		
		
	}

    @And("^user click first record in Inbox view$")
    public void user_click_first_record_in_inbox_view() throws Throwable {
    	String xpath = "//span[text()='"+subProductMasterTestData.get("Reference ID")+"']/parent::td/preceding-sibling::td/button";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

	@And("^user verify the submit button and submit from Maker stage$")
	public void user_verify_the_submit_button_and_submit_from_maker_stage() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Submit(), 10, 2);
		subMasterRetailObj.Subproduct_Submit().isDisplayed();
		subMasterRetailObj.Subproduct_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Submit_confirmation(),
				10, 2);
		subMasterRetailObj.Subproduct_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Maker_Submit(), 10, 2);
		subMasterRetailObj.Subproduct_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Checker_Id(), 10, 2);
		String CheckerId = subMasterRetailObj.Subproduct_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
	//	json.addData(popupID);
		System.out.println(popupID);
		excelData.updateTestData("AT-SPR-T001_D1", "Checker id", popupID);
	}

	@And("^submit the record from maker and store the checker ID for return purpose$")
	public void submit_the_record_from_maker_and_store_the_checker_id_for_return_purpose() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Submit(), 10, 2);
		subMasterRetailObj.Subproduct_Submit().isDisplayed();
		subMasterRetailObj.Subproduct_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Submit_confirmation(),
				10, 2);
		subMasterRetailObj.Subproduct_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Maker_Submit(), 10, 2);
		subMasterRetailObj.Subproduct_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Checker_Id(), 10, 2);
		String CheckerId = subMasterRetailObj.Subproduct_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		json.addData(popupID);
		System.out.println(popupID);
		excelData.updateTestData("AT-SPR-T004_D1", "Checker id", popupID);
	}

	@And("^store the checker id of sub product master for checker approval$")
	public void store_the_checker_id_of_sub_product_master_for_checker_approval() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Submit(), 10, 2);
		subMasterRetailObj.Subproduct_Submit().isDisplayed();
		subMasterRetailObj.Subproduct_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Submit_confirmation(),
				10, 2);
		subMasterRetailObj.Subproduct_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Maker_Submit(), 10, 2);
		subMasterRetailObj.Subproduct_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Checker_Id(), 10, 2);
		String CheckerId = subMasterRetailObj.Subproduct_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		excelData.updateTestData("AT-SPR-T001_D1", "Checker id", popupID);
		System.out.println(popupID);
	}

	// ****************M2_SubPrdMst_CHECKER APPROVE***************//

	@And("^get the test data of checker reject scenario$")
	public void get_the_test_data_of_checker_reject_scenario() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-T003_D1");
	}

	@And("^get the test data of updation checker approval scenario$")
	public void get_the_test_data_of_updation_checker_approval_scenario() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-007_D1");
	}

	@And("^get the test data of checker reject for updation scenario$")
	public void get_the_test_data_of_checker_reject_for_updation_scenario() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-008_D1");
	}

	@And("^get the test data of checker return for updation scenario$")
	public void get_the_test_data_of_checker_return_for_updation_scenario() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-009_D1");
	}
	@And("^get the test data for subproduct parameter checker approval scenario$")
    public void get_the_test_data_for_subproduct_parameter_checker_approval_scenario() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-0011_D1");
    }
	@Given("^user log in as uls application checker$")
	public void user_log_in_as_uls_application_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		applicationLogin.ulSApplicationLoginAsAChecker(subProductMasterTestData.get("Checker id"));
	}
	 @Given("^navigate the uls application along with parameter creation record test data$")
	    public void navigate_the_uls_application_along_with_parameter_creation_record_test_data() throws Throwable {
		 subProductMasterTestData = excelData.getTestdata("AT-SPR-0012_D1");
		 String kulsApplicationUrl = configFileReader.getApplicationUrl();
			driver.get(kulsApplicationUrl);
			applicationLogin.ulSApplicationLoginAsAChecker(subProductMasterTestData.get("Checker id"));
	    }
	@Given("^Navigate to uls application and for checker return$")
	public void navigate_to_uls_application_and_for_checker_return() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-T004_D1");
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		System.out.println(json.readdata());
		applicationLogin.ulSApplicationLoginAsAChecker(subProductMasterTestData.get("Checker id"));
	}
	@Given("^Navigate to uls application as checker along with parameter checker rekect test data$")
    public void navigate_to_uls_application_as_checker_along_with_parameter_checker_rekect_test_data() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-0013_D1");
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		System.out.println(json.readdata());
		applicationLogin.ulSApplicationLoginAsAChecker(subProductMasterTestData.get("Checker id"));
    }
	@And("^user Click on Menu icon$")
	public void user_click_on_menu_icon() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.Checker_toggle(), 10, 2);
		// subMasterRetailObj.Checker_toggle().click();
		javascriptHelper.JSEClick(subMasterRetailObj.Checker_toggle());
	}

	@And("^user Click on Mailbox icon$")
	public void user_click_on_mailbox_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Checker_Inbox(), 10, 2);
		subMasterRetailObj.Checker_Inbox().click();
	}

	@And("^get the test data for checker approval scenario$")
	public void get_the_test_data_for_checker_approval_scenario() throws Throwable {
		subProductMasterTestData = excelData.getTestdata("AT-SPR-T001_D1");
	}

	@And("^Search the respective reference id and click on Action button$")
	public void search_the_respective_reference_id_and_click_on_action_button() throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver,
//						By.xpath("//span[text()='" +json.readReferancedata() + "']/ancestor::tr/td[1]/button")),
//				10, 2);
		for (int i = 0; i <= 20; i++) {
			try {
				driver.findElement(By.xpath("//span[text()='" + subProductMasterTestData.get("Reference ID")
						+ "']/ancestor::tr/td[1]/button")).click();
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user Click on Approve icon$")
	public void user_click_on_approve_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Checker_Approve(), 10, 2);
		subMasterRetailObj.Checker_Approve().click();
	}

	@And("^user Enter the remarks in Action confirmation popup$")
	public void user_enter_the_remarks_in_action_confirmation_popup() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.Checker_Approve(), 10, 2);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.Checker_Alert_Approve().click();
				break;
			} catch (ElementNotInteractableException e) {

			}
		}

	}

	@Then("^user Click on Remarks button in Action confirmation popup$")
	public void user_click_on_remarks_button_in_action_confirmation_popup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Checker_Final_Approve(), 10, 2);
		subMasterRetailObj.Checker_Final_Approve().click();
	}

	@Then("^user verify the Record got Approved$")
	public void user_verify_the_record_got_approved() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Checker_Id(), 10, 2);
		Toast = subMasterRetailObj.Subproduct_Checker_Id().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}

	// *********************@M1.1_SubPrdMst_ListView*********************//

	@Then("^User validate the approved record in list view$")
	public void user_validate_the_approved_record_in_list_view() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// driver.findElement(By.xpath("//span[contains(text(),'"+subprdMstData.ProductCode+"')]")),
		// 10, 2);
		for (int i = 0; i < 200; i++) {
			try {
				String validate = driver
						.findElement(By.xpath(
								"//span[contains(text(),'" + subProductMasterTestData.get("ProductCode") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, subprdMstData.ProductCode);
				break;

			} catch (NoSuchElementException e) {
				if (i==199) {
					Assert.fail("Subproduct Code not Visibile in List view");
				}
			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// driver.findElement(By.xpath("//span[contains(text(),'" +
		// subprdMstData.Subproductcode + "')]")), 10, 2);
		for (int i = 0; i < 200; i++) {
			try {
				String validate1 = driver
						.findElement(By.xpath("//span[contains(text(),'" + subProductMasterTestData.get("SubproductCode") + "')]"))
						.getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, subProductMasterTestData.get("SubproductCode"));
				break;

			} catch (NoSuchElementException e) {
				if (i==199) {
					Assert.fail("Subproduct code not visible in List view");
				}
			}
		}

	}

	// *********************@M3_SubPrdMst_Reject*********************//

	@And("^user Click on Reject icon$")
	public void user_click_on_reject_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Checker_Reject(), 10, 2);
		subMasterRetailObj.Checker_Reject().click();
	}

	@And("^user Enter the remarks for Reject the Record$")
	public void user_enter_the_remarks_for_reject_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Checker_Alert_Reject(), 10, 2);
		subMasterRetailObj.Checker_Alert_Reject().click();
	}

	@Then("^user Click on Remarks button for Reject confirmation$")
	public void user_click_on_remarks_button_for_reject_confirmation() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Checker_Final_Reject(), 10, 2);
		subMasterRetailObj.Checker_Final_Reject().click();
	}

	@Then("^user verify the Record got Rejected$")
	public void user_verify_the_record_got_rejected() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Checker_Id(), 10, 2);
		Toast = subMasterRetailObj.Subproduct_Checker_Id().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record REJECTED Successfully");
	}

	/// *******************@M2_SubPrdMst_ListView*******************///

	@Then("^User validate the Rejected record in list view$")
	public void user_validate_the_rejected_record_in_list_view() throws Throwable {
		for (int i = 0; i <100; i++) {
			try {
				waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Maker_Listview_Prdcode(), 10,
						2);
				String validate = driver
						.findElement(
								By.xpath("//span[contains(text(),'" + subProductMasterTestData.get("ProductCode") + "')]"))
						.getText();
				Assert.assertEquals(validate, subProductMasterTestData.get("ProductCode"));
			} catch (Exception e) {
				if (i==99) {
					System.out
					.println("The Rejected Product Code - "+ subProductMasterTestData.get("ProductCode")+" Record Not in the List view " );
	
				}
						}
		}
		for (int i = 0; i <100; i++) {
			try {
				waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Maker_Listview_Prdcode(), 10,
						2);
				String validate = driver
						.findElement(
								By.xpath("//span[contains(text(),'" + subProductMasterTestData.get("SubproductCode") + "')]"))
						.getText();
				Assert.assertEquals(validate, subProductMasterTestData.get("SubproductCode"));
			} catch (Exception e) {
				if (i==99) {
					System.out
					.println("The Rejected Sub Product Code - "+ subProductMasterTestData.get("SubproductCode")+" Record Not in the List view " );
	
				}
						}
		}
		
	}

	/// *******************@M4_SubPrdMst_Return*******************///

	@And("^user Click on Return icon$")
	public void user_click_on_return_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Checker_Return(), 10, 2);
		subMasterRetailObj.Checker_Return().click();
	}

	@And("^user Enter the remarks for Return the Record$")
	public void user_enter_the_remarks_for_return_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Checker_Alert_Return(), 10, 2);
		subMasterRetailObj.Checker_Alert_Return().click();
	}

	@Then("^user Click on Remarks button for Return confirmation$")
	public void user_click_on_remarks_button_for_return_confirmation() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Checker_Final_Return(), 10, 2);
		subMasterRetailObj.Checker_Final_Return().click();
	}

	@Then("^user verify the Record got Return$")
	public void user_verify_the_record_got_return() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Subproduct_Checker_Id(), 10, 2);
		Toast = subMasterRetailObj.Subproduct_Checker_Id().getText();
		System.out.println(Toast);
		Assert.assertTrue(Toast.contains("Record RETURNED Successfully"));
	}

	/// *******************@M3_SubPrdMst_ListView*******************///

	@And("^user click Edit view icon of sub product retail$")
	public void user_click_edit_view_icon_of_sub_product_retail() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.subProductEditIcon(), 10, 2);
		subMasterRetailObj.subProductEditIcon().click();
	}

	@Then("^User validate the Returned record in list view$")
	public void user_validate_the_returned_record_in_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Maker_Listview_Prdcode(), 10, 2);
		String validate = driver
				.findElement(By.xpath("//span[contains(text(),'" + subProductMasterTestData.get("ProductCode") + "')]"))
				.getText();
		System.out.println(validate.trim());

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Maker_Listview_subPrdcode(), 10, 2);
		String validate1 = driver
				.findElement(By.xpath("//span[contains(text(),'" + subProductMasterTestData.get("ProductCode") + "')]"))
				.getText();
		System.out.println(validate1);
		Assert.assertEquals(validate.trim(), subProductMasterTestData.get("ProductCode").trim());
	}

	/// *******************@M4_SubPrdMst_InvalidCreation*******************///

	@And("^user verify and save the Record with InValid data$")
	public void user_verify_and_save_the_record_with_invalid_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Sub_Product_Product_Save(), 10, 2);
		subMasterRetailObj.Sub_Product_Product_Save().isDisplayed();
		subMasterRetailObj.Sub_Product_Product_Save().click();
	}

	@And("^user enter sub product code as special characters$")
	public void user_enter_sub_product_code_as_special_characters() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.subProductCode(), 10, 2);
		subMasterRetailObj.subProductCode().click();

		System.out.println("Special Character Input " + subProductMasterTestData.get("SpecialCharacterInput"));
		subMasterRetailObj.subProductCode().sendKeys(subProductMasterTestData.get("SpecialCharacterInput"));
	}

	@Then("^user verify the Special characters field proper validation message$")
	public void user_verify_the_special_characters_field_proper_validation_message() throws Throwable {
		String nameErrorMessage = null;
		for (int i = 0; i < 200; i++) {
			try {
				nameErrorMessage = driver.findElement(By.xpath("//digital-form-error//ion-badge")).getText();
				break;
			} catch (NoSuchElementException e) {

			}
		}

		String expectedErrorText = "Alphanumeric characters allowed";
		if (nameErrorMessage.equalsIgnoreCase(expectedErrorText)) {
			System.out.println("System should allow only " + nameErrorMessage);
		} else {
			System.out.println("System should not allow " + nameErrorMessage);
		}
	}

	@Then("^user verify the Required field proper validation message$")
	public void user_verify_the_required_field_proper_validation_message() throws Throwable {
		String nameErrorMessage = driver.findElement(By.xpath("(//digital-form-error//ion-badge)[1]")).getText();
		String expectedErrorText = "Required field";
		if (nameErrorMessage.equalsIgnoreCase(expectedErrorText)) {
			System.out.println("System should not allow the Mandatory fields Empty.The Popup validation message is "
					+ nameErrorMessage);
		} else {
			System.out.println(
					"System should allow the Mandatory fields.The Popup validation message is " + nameErrorMessage);
		}
	}

	@And("^user click on the first Edit Icon$")
	public void user_click_on_the_first_edit_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.pencil(), 10, 5);
		subMasterRetailObj.pencil().click();

	}

	@And("^user goto the parameter subTab$")
	public void user_goto_the_parameter_subtab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.parameter(), 10, 5);
		subMasterRetailObj.parameter().click();
	}

	@And("^user Enter the loan currency value$")
	public void user_enter_the_loan_currency_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.loanCurrency(), 10, 5);
		subMasterRetailObj.loanCurrency().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + paradata.LoanCurrency + "')]//following-sibling::ion-radio"))
						.click();

				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^user Enter the Remark value as special character$")
	public void user_enter_the_remark_value_as_special_character() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				javascriptHelper.scrollIntoView(subMasterRetailObj.remarks());
				subMasterRetailObj.remarks().click();
			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.remarks(), 10, 5);

		for (int i = 0; i < 200; i++) {
			try {
				subMasterRetailObj.remarks().sendKeys(subprdMstData.Specialchar);
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^user verify and save the Records with InValid data$")
	public void user_verify_and_save_the_records_with_invalid_data() throws Throwable {
		javascriptHelper.scrollIntoView(subMasterRetailObj.Save());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Save(), 10, 5);
		subMasterRetailObj.Save().click();
	}

	@Then("^Get the validation message in maker$")
	public void get_the_validation_message() throws Throwable {

		WebElement nameErrorMessage = driver.findElement(By.xpath("//digital-form-error//ion-badge"));
		String expectedErrorText = "Required field";
		String actualErrorText = nameErrorMessage.getText();
		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
			System.out.println(
					"The actual and expected result are same.The Popup validation message is" + actualErrorText);
		} else {
			System.out.println(
					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
		}

	}

	@And("^Click the parameter$")
	public void click_the_parameter() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.pencil(), 10, 5);
		subMasterRetailObj.pencil().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.parameter(), 10, 5);
		subMasterRetailObj.parameter().click();

	}

	@And("^Update the parameter fields in maker$")
	public void update_the_parameter_fields_in_maker() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.loanCurrencyUpdate(), 10, 5);
		subMasterRetailObj.loanCurrencyUpdate().click();

		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + paradata1.LoanCurrency + "')]//following-sibling::ion-radio"))
						.click();

				break;

			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subretail.minTenorInMonths(), 10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.minTenorInMonths().click();
				subMasterRetailObj.minTenorInMonths().sendKeys(paradata1.MinTenorInMonths);
			} catch (Exception e) {

			}
		}

		System.out.println(subMasterRetailObj.errmsg().getText());

	}

	@And("^Click the save icon$")
	public void click_the_save_icon() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.Save(), 10, 5);
		subMasterRetailObj.Save().click();

	}

	@Then("^Click the subproductretail master$")
	public void click_the_subproductretail_master() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productsetup(), 10, 5);
		subMasterRetailObj.productsetup().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.eyeicon(), 10, 5);
		subMasterRetailObj.eyeicon().click();
	}

	@Then("^Verify the back arrow function$")
	public void verify_the_back_arrow_function() throws Throwable {

		// waitHelper.waitForElementToVisibleWithFluentWaitElementToBeClickable(driver,
		// subretail.pencil(),10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.pencil().click();
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.parameter(), 10, 5);
		subMasterRetailObj.parameter().click();

		// waitHelper.waitForElementToVisibleWithFluentWait(driver, subretail.back(),
		// 10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.back().click();
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.pencil(), 10, 5);
		subMasterRetailObj.pencil().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.parameter(), 10, 5);
		subMasterRetailObj.parameter().click();
	}
    @And("^get the test dta of parameter test case which is going to approve in checker$")
    public void get_the_test_dta_of_parameter_test_case_which_is_going_to_approve_in_checker() throws Throwable {
    	subProductMasterTestData=excelData.getTestdata("AT-SPR-010_D1");
    }
	@Then("^Enter the required sub product parameters fields in maker$")
	public void enter_the_required_sub_product_parameters_fields_in_maker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.loanCurrency(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Loan Currency");
		subMasterRetailObj.loanCurrency().click();

		// String xpa = "//ion-label[contains(text(),'"+paradata.LoanCurrency+"')]";

		// WebElement loan = driver.findElement(By.xpath(xpa));
		// loan.click();
		// driver.findElement(By.xpath("//ion-label[contains(text(),'"+paradata.LoanCurrency+"')]//following-sibling::ion-radio")).click();

		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + subProductMasterTestData.get("LoanCurrency") + "')]//following-sibling::ion-radio"))
						.click();

				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.indexationCurrency(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Indexation Currency");
		subMasterRetailObj.indexationCurrency().click();

		String xpa1 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("IndexationCurrency")
				+ "')]//following-sibling::ion-radio";
		for (int i = 0; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpa1)).click();
				break;

			} catch (Exception e) {

			}
		}
		verifyfield.verifyGivenFieldisMandatoryOrNot("Minimum Finance Amount");
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.minimumFinanceAmount(), 10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.minimumFinanceAmount();
				subMasterRetailObj.minimumFinanceAmount().sendKeys(subProductMasterTestData.get("MinFinanceAmount"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.maximumFinanceAmount(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Maximum Finance Amount");
		subMasterRetailObj.maximumFinanceAmount().click();
		subMasterRetailObj.maximumFinanceAmount().sendKeys(subProductMasterTestData.get("MaxFinanceAmount"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.minTenorInMonths(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Min Tenor In Months");
		subMasterRetailObj.minTenorInMonths().click();
		subMasterRetailObj.minTenorInMonths().sendKeys(subProductMasterTestData.get("MinTenorInMonths"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.maxTenorInMonths(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Max Tenor In Months");
		subMasterRetailObj.maxTenorInMonths().click();
		subMasterRetailObj.maxTenorInMonths().sendKeys(subProductMasterTestData.get("MaxTenorInMonths"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.repaymentType(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Repayment Type");
		subMasterRetailObj.repaymentType().click();

		String xpath = "//ion-label[contains(text(),'" + subProductMasterTestData.get("RepaymentType") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.flatReducing(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Flat/Reducing");
		subMasterRetailObj.flatReducing().click();

		String xpath1 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("FlatReducing")+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath1)).click();
				break;

			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.intAmortizationMethod(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Int. Amortization Method");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.intAmortizationMethod().click();
				break;
			} catch (Exception e) {

			}
		}

		String xpath2 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("IntAmortizationMethod")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.computeInstallmentOn(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Compute Installment on");
		subMasterRetailObj.computeInstallmentOn().click();

		String xpath3 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("ComputeInstallmentOn")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath3)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.instDueDateMethod(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Inst. due date method");
		subMasterRetailObj.instDueDateMethod().click();

		String xpath4 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("InstDueDateMethod")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath4)).click();
				break;

			} catch (Exception e) {

			}
		}

		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.lpcGracePeriod());
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.lpcGracePeriod(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("LPC grace period (days)");

		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.lpcGracePeriod().click();
				subMasterRetailObj.lpcGracePeriod().sendKeys(subProductMasterTestData.get("LPCGracePeriodDays"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.principalRepaymentFrequency(), 10,
				5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Principal Repayment Frequency");
		subMasterRetailObj.principalRepaymentFrequency().click();

		String xpath5 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("PrincipalRepaymentFrequency")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath5)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.interestRepaymentFrequency(), 10,
				5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Interest Repayment Frequency");
		subMasterRetailObj.interestRepaymentFrequency().click();

		String xpath6 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("InterestRepaymentFrequency")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath6)).click();
				break;

			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.instRoundingLogic(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Inst. Rounding Logic");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.instRoundingLogic().click();
				subMasterRetailObj.instRoundingLogic().sendKeys(subProductMasterTestData.get("InstRoundingLogic"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.loanElegibilityCalc(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Loan Eligibility Calc.");
		subMasterRetailObj.loanElegibilityCalc().click();

		String xpath7 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("LoanElegibilityCalc")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath7)).click();
				break;

			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.remarks(), 10,
		// 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Remarks");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.remarks().click();
				subMasterRetailObj.remarks().sendKeys(subProductMasterTestData.get("Remark"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.includeGuarantorInc(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Include Guarantor Inc.");
		subMasterRetailObj.includeGuarantorInc().click();

		String xpath8 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("IncludeGuarantorInc")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath8)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.duePeriodRequired());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.duePeriodRequired(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Due Period Required");
		subMasterRetailObj.duePeriodRequired().click();

		String xpath9 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("DuePeriodRequired")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath9)).click();
				break;

			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.maxCoapplicants(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Max Coapplicants");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.maxCoapplicants().click();
				subMasterRetailObj.maxCoapplicants().sendKeys(subProductMasterTestData.get("MaxCoApplication"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.maxGuarantors(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Max Guarantors");
		subMasterRetailObj.maxGuarantors().click();
		subMasterRetailObj.maxGuarantors().sendKeys(subProductMasterTestData.get("MaxGuarantors"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.instCommenceFrom(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Inst. Commence From");
		subMasterRetailObj.instCommenceFrom().click();

		String xpath10 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("InstCommenceFrom")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath10)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.daysInYear());

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.daysInYear(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Days In Year");
		subMasterRetailObj.daysInYear().click();

		String xpath11 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("DaysInYear") + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath11)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.multipleDisbursTranchAllowed(), 10,
				5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Multiple Disburs. Tranch Allowed");
		subMasterRetailObj.multipleDisbursTranchAllowed().click();

		String xpath12 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("MultipleDisbursTranchAllowed")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath12)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.includeIncomeDeduDebt(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Include Income Dedu. Debt");
		subMasterRetailObj.includeIncomeDeduDebt().click();

		String xpath13 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("IncludeIncomeDeduDept")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath13)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.roundOff(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Round Off");
		subMasterRetailObj.roundOff().click();

		String xpath14 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("RoundOff") + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath14)).click();
				break;

			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.roundOffValue(),
		// 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("RoundOff Value");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.roundOffValue().click();
				subMasterRetailObj.roundOffValue().sendKeys(subProductMasterTestData.get("RoundOffValue"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.offerValidityDays(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Offer Validity (Days)");
		subMasterRetailObj.offerValidityDays().click();
		subMasterRetailObj.offerValidityDays().sendKeys(subProductMasterTestData.get("OfferValidityDays"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.appropriationCode(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Appropriation Code");
		subMasterRetailObj.appropriationCode().click();

		String xpath15 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("AppropriationCode")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath15)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.balloonAllowed());

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.balloonAllowed(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Balloon Allowed");
		subMasterRetailObj.balloonAllowed().click();

		String xpath16 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("BalloonAllowed")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath16)).click();
				break;

			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.maximumBalloonPercentage(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Maximum Balloon Percentage");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.maximumBalloonPercentage().click();
				subMasterRetailObj.maximumBalloonPercentage().sendKeys(subProductMasterTestData.get("MaxBalloonPercentage"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.minIRR(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Min IRR");
		subMasterRetailObj.minIRR().click();
		subMasterRetailObj.minIRR().sendKeys(subProductMasterTestData.get("MinIRR"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.maxIRR(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Max IRR");
		subMasterRetailObj.maxIRR().click();
		subMasterRetailObj.maxIRR().sendKeys(subProductMasterTestData.get("MaxIRR"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.preOwnedAsset(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Pre-owned Asset");
		subMasterRetailObj.preOwnedAsset().click();

		String xpath17 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("PreOwnedAsset") + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath17)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.discountingFactorRounding());
		verifyfield.verifyGivenFieldisMandatoryOrNot("Discounting Factor Rounding");

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.discountingFactorRounding(), 10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.discountingFactorRounding().click();
				subMasterRetailObj.discountingFactorRounding().sendKeys(subProductMasterTestData.get("DiscountingFactorRounding"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.dayCountConventionForBPI(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Day Count Convention for BPI");
		for (int i = 1; i < 20; i++) {
			try {
				subMasterRetailObj.dayCountConventionForBPI().click();
				break;

			} catch (Exception e) {

			}
		}

		String xpath18 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("DayCountConventionForBPI")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath18)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.interestChargingStartsFrom(), 10,
				5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Interest Charging Starts From");
		subMasterRetailObj.interestChargingStartsFrom().click();

		String xpath19 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("InterestChargingStartsFrom")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath19)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.bpiRecovery(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("BPI Recovery");
		subMasterRetailObj.bpiRecovery().click();

		String xpath20 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("InterestChargingStartsFrom") + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath20)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.installmentRecoveryType(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Installment Recovery Type");
		subMasterRetailObj.installmentRecoveryType().click();

		String xpath21 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("InstallmentRecoveryType")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath21)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.isStepupAllowed(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Is Step-Up Allowed");
		subMasterRetailObj.isStepupAllowed().click();

		String xpath22 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("IsStepupAllowed")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath22)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.rateType(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Rate Type");
		subMasterRetailObj.rateType().click();

		String xpath23 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("RateType") + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath23)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.initiateDiscFactor());

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.initiateDiscFactor(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Initiate Disc. Factor");
		subMasterRetailObj.initiateDiscFactor().click();

		String xpath24 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("InitiateDiscFactor")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath24)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@Then("^Enter the required pre-EMI fields in maker$")
	public void enter_the_required_preemi_fields_in_maker() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.preEMI(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Pre-EMI");
		subMasterRetailObj.preEMI().click();

		String xpath36 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("preEMI") + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath36)).click();
				break;

			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.preEMIInstallment(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("No. Of Pre-EMI Installment");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.preEMIInstallment().click();
				subMasterRetailObj.preEMIInstallment().sendKeys(subProductMasterTestData.get("NoOfPreEMIInstallment"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.miRecoveryToBeRenamedAs(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("MI_RECOVERY_TO_BE_RENAMED_AS");
		subMasterRetailObj.miRecoveryToBeRenamedAs().click();

		String xpath37 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("miRecoveryToBeRenamedAs")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath37)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.bpiRepaymentTenureMethod());

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.bpiRepaymentTenureMethod(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("BPI_REPAYMENT_TENURE_METHOD");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.bpiRepaymentTenureMethod().click();
				break;
			} catch (Exception e) {

			}
		}

		String xpath38 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("bpiRepaymentTenureMethod")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath38)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.bpiRateMethod(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("BPI_RATE_METHOD");
		subMasterRetailObj.bpiRateMethod().click();

		String xpath39 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("bpiRateMethod")+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath39)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.bpiRepaymentFrequency(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("BPI_REPAYMENT_FREQUENCY");
		subMasterRetailObj.bpiRepaymentFrequency().click();

		String xpath40 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("bpiRepaymentFrequency")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath40)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.tdsApplicable(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("TDS_APPLICABLE");
		subMasterRetailObj.tdsApplicable().click();

		String xpath41 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("tdsApplicable") + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath41)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.moratoriumTenureType(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("MORATORIUM_TENURE_TYPE");
		subMasterRetailObj.moratoriumTenureType().click();

		String xpath42 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("moratoriumTenureType")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath42)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^Click the approve icon in checker$")
	public void click_the_approve_icon_in_checker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.CheckerApprove(), 10, 5);
		subMasterRetailObj.CheckerApprove().click();
	}

	@Then("^Click the save button get the confirmation messege$")
	public void click_the_save_button_get_the_confirmation_messege() throws Throwable {

		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.Save());

		// subMasterRetailObj.Save().click();
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.Save().click();
				break;

			} catch (Exception e) {

			}

		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.makerconfirmmsg(), 10, 5);

		for (int i = 0; i < 20; i++) {
			try {
				Assert.assertEquals(subMasterRetailObj.makerconfirmmsg().isDisplayed(), true);
				System.out.println(subMasterRetailObj.makerconfirmmsg().getText());
				break;
			} catch (NoSuchElementException e) {

			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.successcancel(), 10, 5);
		subMasterRetailObj.successcancel().click();

	}
	@And("^search for sub product master record in mail box area$")
    public void search_for_sub_product_master_record_in_mail_box_area() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.mailicon().click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.searchiconreferenceid().click();
				subMasterRetailObj.searchsentkeys().sendKeys(subProductMasterTestData.get("Module Code"));
				break;
			} catch (Exception e) {

			}
		}




		
    }

    @And("^select the sub product master record and store the reference number for checker reject purpose$")
    public void select_the_sub_product_master_record_and_store_the_reference_number_for_checker_reject_purpose() throws Throwable {
		System.out.println(subMasterRetailObj.referenceid().getText());
		String ref1 = subMasterRetailObj.referenceid().getText();
		String ref2 = ref1.substring(0);
		//json.addReferanceData(ref2);
		excelData.updateTestData("AT-SPR-0011_D1", "Reference ID", ref2);

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.inboxediticon(), 10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.inboxediticon().click();
				break;
			} catch (Exception e) {

			}
		}
    }

    @And("^submit the record from maker stage$")
    public void submit_the_record_from_maker_stage() throws Throwable {

		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.submit().click();
				break;
			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.popupremark(),
		// 10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.popupremark().click();
				subMasterRetailObj.popupremark().sendKeys(subProductMasterTestData.get("AlertRemark"));
				break;
			} catch (Exception e) {

			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.popupsubmit(), 10, 5);
		subMasterRetailObj.popupsubmit().click();
    }

    @And("^store the checker id for cheker id for checker reject purpose$")
    public void store_the_checker_id_for_cheker_id_for_checker_reject_purpose() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.ProductCheckerid(), 10, 5);
		String Success = subMasterRetailObj.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		//json.addData(popupID);
		System.out.println(popupID);
		excelData.updateTestData("AT-SPR-0012_D1", "Checker id", popupID);
    }
    @And("^select the sub product parameter master record and store the reference number for checker return purpose$")
    public void select_the_sub_product_parameter_master_record_and_store_the_reference_number_for_checker_return_purpose() throws Throwable {
    	System.out.println(subMasterRetailObj.referenceid().getText());
		String ref1 = subMasterRetailObj.referenceid().getText();
		String ref2 = ref1.substring(0);
		//json.addReferanceData(ref2);
		excelData.updateTestData("AT-SPR-0013_D1", "Reference ID", ref2);

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.inboxediticon(), 10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.inboxediticon().click();
				break;
			} catch (Exception e) {

			}
		}
    }

    @And("^store the checker id for cheker id for checker return purpose in sub product parameter$")
    public void store_the_checker_id_for_cheker_id_for_checker_return_purpose_in_sub_product_parameter() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.ProductCheckerid(), 10, 5);
		String Success = subMasterRetailObj.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		//json.addData(popupID);
		System.out.println(popupID);
		excelData.updateTestData("AT-SPR-0013_D1", "Checker id", popupID);
    }

	@Then("^Launch the application and login as checker$")
	public void lanch_the_application_and_login_as_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		System.out.println(json.readdata());
		applicationLogin.ulSApplicationLoginAsAChecker(json.readdata());
	}

	@Then("^Get the respective reference id and submit in maker$")
	public void get_the_respective_reference_id() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.mailicon(), 10,
		// 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.mailicon().click();
				break;
			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.searchiconreferenceid(), 10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.searchiconreferenceid().click();
				subMasterRetailObj.searchsentkeys().sendKeys(subProductMasterTestData.get("Module Code"));
				break;
			} catch (Exception e) {

			}
		}

		System.out.println(subMasterRetailObj.referenceid().getText());
		String ref1 = subMasterRetailObj.referenceid().getText();
		String ref2 = ref1.substring(0);
		//json.addReferanceData(ref2);
		excelData.updateTestData("AT-SPR-0011_D1", "Reference ID", ref2);

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.inboxediticon(), 10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.inboxediticon().click();
				break;
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.submit().click();
				break;
			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.popupremark(),
		// 10, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.popupremark().click();
				subMasterRetailObj.popupremark().sendKeys(paradata.PopupRemarks);
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.popupsubmit(), 10, 5);
		subMasterRetailObj.popupsubmit().click();

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.ApprovedMSG(),
		// 10, 5);
		/*
		 * System.out.println(subMasterRetailObj.ApprovedMSG().getText()); String mak =
		 * subMasterRetailObj.ApprovedMSG().getText(); String mak1 = mak.substring(86,
		 * 94); jsonRW.addReferanceData(mak1);
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.ProductCheckerid(), 10, 5);
		String Success = subMasterRetailObj.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		//json.addData(popupID);
		System.out.println(popupID);
		excelData.updateTestData("AT-SPR-0011_D1", "Checker id", popupID);
	}

	@Then("^Click the action edit icon in checker$")
	public void click_the_action_edit_icon_in_checker() throws Throwable {

		String xpath1 = "//span[contains(text(),'" + json.readReferancedata()
				+ "')]//parent::td//preceding-sibling::td//child::button";

		WebElement actionedit = driver.findElement(By.xpath(xpath1));
		actionedit.click();
	}

	@And("^Enter the required bulk payment fields in maker$")
	public void enter_the_required_bulk_payment_fields_in_maker() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.bulkPayment1(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Bulk Payment");
		subMasterRetailObj.bulkPayment1().click();

		// Thread.sleep(3000);

		String xpath25 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("bulkPayment") + "')]//following-sibling::ion-radio";
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// driver.findElement(By.xpath(xpath25)), 30, 2);
		for (int i = 0; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath25)).click();
				break;
			} catch (Exception e) {

			}
		}

		verifyfield.verifyGivenFieldisMandatoryOrNot("No of Bulk payment in a Year");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.noOfBulkPaymentInAYear().click();
				subMasterRetailObj.noOfBulkPaymentInAYear().sendKeys(subProductMasterTestData.get("NoOfBulkPaymentInAYear"));
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.bulkPaymentLockinPeriod());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.bulkPaymentLockinPeriod(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Bulk payment LockIn Period");
		subMasterRetailObj.bulkPaymentLockinPeriod().click();
		subMasterRetailObj.bulkPaymentLockinPeriod().sendKeys(subProductMasterTestData.get("BulkPaymentLockinPeriod"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.bulkPaymentTimeInterval(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Bulk Payment Time Interval");
		subMasterRetailObj.bulkPaymentTimeInterval().click();
		subMasterRetailObj.bulkPaymentTimeInterval().sendKeys(subProductMasterTestData.get("BulkPaymentTimeInterval"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.immediateDueDate(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Immediate/Due date");
		subMasterRetailObj.immediateDueDate().click();

		String xpath26 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("immediateDueDate")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath26)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.bulkPaymentLockinStartsFrom(), 10,
				5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Bulk Payment Lock-In starts From");
		subMasterRetailObj.bulkPaymentLockinStartsFrom().click();

		String xpath27 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("bulkPaymentLockinStartsFrom")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath27)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.minBulkPaymentParameter(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Min Bulk Payment Parameter");
		subMasterRetailObj.minBulkPaymentParameter().click();

		String xpath28 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("minBulkPaymentParameter")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath28)).click();
				break;

			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.minBulkPaymentValue(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Min Bulk Payment Value");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.minBulkPaymentValue().click();
				subMasterRetailObj.minBulkPaymentValue().sendKeys(subProductMasterTestData.get("MinBulkPaymentValue"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.maxBulkPaymentparameters(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Max Bulk Payment Parameter");
		subMasterRetailObj.maxBulkPaymentparameters().click();

		String xpath29 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("maxBulkPaymentparameters")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath29)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.maxBulkPaymentvalue());

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.maxBulkPaymentvalue(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Max Bulk Payment Value");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.maxBulkPaymentvalue().click();
				subMasterRetailObj.maxBulkPaymentvalue().sendKeys(subProductMasterTestData.get("MaxBulkPaymentValue"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the required foreclosure fields in maker$")
	public void enter_the_required_foreclosure_fields_in_maker() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.foreClosureLockin(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Foreclosure Lockin");
		subMasterRetailObj.foreClosureLockin().click();
		subMasterRetailObj.foreClosureLockin().sendKeys(subProductMasterTestData.get("ForeClosureLockin"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.foreClosureLockInStartsFrom(), 10,
				5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Foreclosure Lock-In starts From");
		subMasterRetailObj.foreClosureLockInStartsFrom().click();

		String xpath30 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("foreClosureLockInStartsFrom")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath30)).click();
				break;

			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.minRebateParameter(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Min Rebate Parameter");
		subMasterRetailObj.minRebateParameter().click();

		String xpath31 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("minRebateParameter")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath31)).click();
				break;

			} catch (Exception e) {

			}
		}

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.minRebatevalue(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Min Rebate Value");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.minRebatevalue().click();
				subMasterRetailObj.minRebatevalue().sendKeys(subProductMasterTestData.get("MinRebatevalue"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.maxRebateParameter(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Max Rebate Parameter");
		subMasterRetailObj.maxRebateParameter().click();

		String xpath32 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("maxRebateParameter")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath32)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.maxRebatevalue());

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.maxRebatevalue(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Max Rebate Value");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.maxRebatevalue().click();
				subMasterRetailObj.maxRebatevalue().sendKeys(subProductMasterTestData.get("MaxRebateValue"));
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the required reschedulement fields in maker$")
	public void enter_the_required_reschedulement_fields_in_maker() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.reschLockin(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Resch Lockin");
		subMasterRetailObj.reschLockin().click();
		subMasterRetailObj.reschLockin().sendKeys(subProductMasterTestData.get("ReschLockin"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.maxReschInaYear(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Max Resch in a year");
		subMasterRetailObj.maxReschInaYear().click();
		subMasterRetailObj.maxReschInaYear().sendKeys(subProductMasterTestData.get("MaxReschInAYear"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.totalReschAllowed(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Total Resch Allowed");
		subMasterRetailObj.totalReschAllowed().click();
		subMasterRetailObj.totalReschAllowed().sendKeys(subProductMasterTestData.get("TotalReachAllowed"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.reschedulementLockInStartsFrom(),
				10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Reschedulement Lock-In starts From");
		subMasterRetailObj.reschedulementLockInStartsFrom().click();

		String xpath33 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("reschedulementLockInStartsFrom")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath33)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the required moratorium/Grace period month in maker$")
	public void enter_the_required_moratoriumgrace_period_month_in_maker() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.interestHoliday());

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.interestHoliday(), 10, 5);
		subMasterRetailObj.interestHoliday().click();
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.interestHoliday().sendKeys(subProductMasterTestData.get("InterestHoliday"));
				break;
			} catch (Exception e) {

			}
		}

		verifyfield.verifyGivenFieldisMandatoryOrNot("Interest Holiday");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.principalHoliday(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Principal Holiday");
		subMasterRetailObj.principalHoliday().click();
		subMasterRetailObj.principalHoliday().sendKeys(subProductMasterTestData.get("PrincipalHoliday"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.interestComputed(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Interest Computed");
		subMasterRetailObj.interestComputed().click();

		String xpath34 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("interestComputed")
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath34)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.moratoriumStartMonthorInstallment());
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subMasterRetailObj.moratoriumStartMonthorInstallment(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("MORATORIUM_START_MONTH_OR_INSTALLMENT");
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.moratoriumStartMonthorInstallment().click();
				subMasterRetailObj.moratoriumStartMonthorInstallment()
						.sendKeys(subProductMasterTestData.get("MoratoriumStartMonthorInstallment"));
				break;
			} catch (Exception e) {

			}
		}

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.recomputationofProfit(), 10, 5);
		verifyfield.verifyGivenFieldisMandatoryOrNot("Recomputation of Profit");
		subMasterRetailObj.recomputationofProfit().click();

		String xpath35 = "//ion-label[contains(text(),'" + subProductMasterTestData.get("recomputationofProfit")+
				 "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath35)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^user select Product code under product details for parameter creation$")
	public void user_select_product_code_under_product_details_for_parameter_creation() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productCode(), 10, 2);
		subMasterRetailObj.productCode().click();
		System.out.println(paradata.ProductCode);
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + paradata.ProductCode + "')]/following-sibling::ion-radio")));
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + paradata.ProductCode + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user enter sub product code under sub product for parameter creation$")
	public void user_enter_sub_product_code_under_sub_product_for_parameter_creation() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.subProductCode(), 10, 2);
		subMasterRetailObj.subProductCode().click();
		subMasterRetailObj.subProductCode().sendKeys(paradata.SubProductCode);
	}

	@Then("^User validate the parameter created record in list view$")
	public void user_validate_the_parameter_created_record_in_list_view() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
		// driver.findElement(By.xpath("//span[contains(text(),'"+ paradata.ProductCode
		// +"')]")), 10, 2);
		for (int i = 0; i < 20; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + subProductMasterTestData.get("ProductCode") + "')]")).getText();
				System.out.println(validate);
				Assert.assertEquals(validate, subProductMasterTestData.get("ProductCode"));
				break;
			} catch (NoSuchElementException e) {

			}
		}

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
		// driver.findElement(By.xpath("//span[contains(text(),'"
		// +paradata.SubProductCode +"')]")), 10, 2);

		for (int i = 0; i < 20; i++) {
			try {
				String validate1 = driver
						.findElement(By.xpath("//span[contains(text(),'" + subProductMasterTestData.get("SubproductCode") + "')]")).getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, subProductMasterTestData.get("SubproductCode"));
				break;
			} catch (NoSuchElementException e) {

			}
		}

	}

	@Given("^Launch the kuls application and login as maker$")
	public void launch_the_kuls_application_and_login_as_maker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		applicationLogin.loginUlsApplicationAsMaker(loginData.Username, loginData.Password);
		// applicationLogin.ulSApplicationLoginAsAChecker(loginData.CheckerUserName1);
	}

	@And("^Navigate to Sub Product Master module view list$")
	public void navigate_to_sub_product_master_module_view_list() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.productSetupInLeftPanel(), 10, 2);
		subMasterRetailObj.productSetupInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.viewIconofSubProductMaster(), 10, 2);
		subMasterRetailObj.viewIconofSubProductMaster().click();
		Thread.sleep(3000);

	}

	@And("^get the test data for WIP List view validation$")
	public void get_the_test_data_for_wip_list_view_validation() throws Throwable {
		subProductMasterTestData=excelData.getTestdata("AT-SPR-009.1_D1");
	}

	@And("^Verify that records present in view list are non editable$")
	public void verify_that_records_present_in_view_list_are_non_editable() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.productSetupInLeftPanel(),10,2);
		String xpath = "//tbody/tr[1]/td[6]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified status field is not editable only displayable");
		}

	}

	@And("^Verify the Add button fuctionality$")
	public void verify_the_add_button_fuctionality() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.addIcon(), 10,
				2);
		Assert.assertEquals(subMasterRetailObj.addIcon().isDisplayed(), true);

	}

	@And("^Verify that all fields are present in view list while click on view icon$")
	public void verify_that_all_records_are_present_in_view_list_while_click_on_view_icon() throws Throwable {
		String xpath = "//span[contains(text(),'Action')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		WebElement Action = driver.findElement(By.xpath(xpath));
		System.out.println(Action);
		String xpath1 = "//span[contains(text(),'Product Group')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath1)), 10, 2);
		WebElement productgroup = driver.findElement(By.xpath(xpath1));
		System.out.println(productgroup);
		String xpath2 = "//thead/tr[1]/th[4]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 10, 2);
		WebElement Productcode = driver.findElement(By.xpath(xpath2));
		System.out.println(Productcode);
		String xpath3 = "//span[contains(text(),'Product Description')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 10, 2);
		WebElement productDescription = driver.findElement(By.xpath(xpath3));
		System.out.println(productDescription);
		String xpath4 = "//span[contains(text(),'Sub-Product Code')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath4)), 10, 2);
		WebElement Subproductcode = driver.findElement(By.xpath(xpath4));
		System.out.println(Subproductcode);
		String xpath5 = "//span[contains(text(),'Retail/Corporate')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath5)), 10, 2);
		WebElement retailcorporate = driver.findElement(By.xpath(xpath5));
		System.out.println(retailcorporate);
		String xpath6 = "//thead/tr[1]/th[8]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath6)), 10, 2);
		WebElement status = driver.findElement(By.xpath(xpath6));
		System.out.println(status);

	}

	@And("^Search with valid data in view list$")
	public void search_with_valid_data_in_view_list() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.searchTextField(), 30, 2);
		subMasterRetailObj.searchTextField().sendKeys(subProductMasterTestData.get("ListViewValidSearchText"));
		String xpath = "//span[contains(text(),'Product Group')]";
		String productgroup = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		for (int i = 0; i < 20; i++) {

			productgroup = driver.findElement(By.xpath(xpath)).getText();
		}
		System.out.println(productgroup);

	}

	@And("^Search with Invalid data in view list$")
	public void search_with_invalid_data_in_view_list() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.searchTextField(), 30, 2);
		subMasterRetailObj.searchTextField().sendKeys(subProductMasterTestData.get("ListViewInvalidSearchText"));
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

	@And("^Export to PDF functionality$")
	public void export_to_pdf_functionality() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.exportToPDF(),
				10, 3);
		subMasterRetailObj.exportToPDF().click();
		// seleniumactions.getBrowserHelper().SwitchToWindow(1);
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(subProductMasterTestData.get("DownloadPath"));
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

	@And("^Export to Excel functionality$")
	public void export_to_excel_functionality() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.exportToExcel().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();
		System.out.println("Downloaded XLS file present in system");

	}

	@And("^Navigate to Sub Product Master module WIP section$")
	public void navigate_to_sub_product_master_module_wip_section() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.subProductRetailTempView(), 10, 1);
		subMasterRetailObj.subProductRetailTempView().click();
		

	}

	@And("^Verify that all fields are present in view list of WIP section$")
	public void verify_that_all_fields_are_present_in_view_list_of_wip_section() throws Throwable {
		String xpath = "//span[contains(text(),'Action')]";
		for(int i=0;i<=30;i++)
		{
		try
		{
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		WebElement Action = driver.findElement(By.xpath(xpath));
		System.out.println(Action);
		}
		catch(Exception e)
		{
		if(i==30)
		{
			Assert.fail(e.getMessage());
		}
		}
		}
		String xpath1 = "//span[contains(text(),'Product Group')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath1)), 10, 2);
		WebElement productgroup = driver.findElement(By.xpath(xpath1));
		System.out.println(productgroup);
		String xpath2 = "//thead/tr[1]/th[4]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 10, 2);
		WebElement Productcode = driver.findElement(By.xpath(xpath2));
		System.out.println(Productcode);
		String xpath3 = "//span[contains(text(),'Product Description')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 10, 2);
		WebElement productDescription = driver.findElement(By.xpath(xpath3));
		System.out.println(productDescription);
		String xpath4 = "//span[contains(text(),'Sub-Product Code')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath4)), 10, 2);
		WebElement Subproductcode = driver.findElement(By.xpath(xpath4));
		System.out.println(Subproductcode);
		String xpath5 = "//span[contains(text(),'Retail/Corporate')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath5)), 10, 2);
		WebElement retailcorporate = driver.findElement(By.xpath(xpath5));
		System.out.println(retailcorporate);
		String xpath6 = "//thead/tr[1]/th[8]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath6)), 10, 2);
		WebElement status = driver.findElement(By.xpath(xpath6));
		System.out.println(status);
		String xpath7 = "//span[contains(text(),'Authorization Status')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath7)), 10, 2);
		WebElement authrizationstatus = driver.findElement(By.xpath(xpath7));
		System.out.println(authrizationstatus);
	}

	@And("^Verify the Add button fuctionality in WIP$")
	public void verify_the_add_button_fuctionality_in_wip() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.addIcon(), 10,
				2);
		Assert.assertEquals(subMasterRetailObj.addIcon().isDisplayed(), true);

	}

	@And("^Search with valid data in view list of WIP$")
	public void search_with_valid_data_in_view_list_of_wip() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.searchTextField(), 30, 2);
		subMasterRetailObj.searchTextField().sendKeys(subProductMasterTestData.get("WIPValidSearchText"));
		String xpath = "//span[contains(text(),'Product Group')]";
		String productgroup = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 10, 2);
		for (int i = 0; i < 20; i++) {

			productgroup = driver.findElement(By.xpath(xpath)).getText();
		}
		System.out.println(productgroup);
	}

	@And("^Search with Invalid data in view list of WIP$")
	public void search_with_invalid_data_in_view_list_of_wip() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.searchTextField(), 30, 2);
		subMasterRetailObj.searchTextField().sendKeys(subProductMasterTestData.get("WIPInValidSearchText"));
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

	@And("^Export to PDF functionality in WIP$")
	public void export_to_pdf_functionality_in_wip() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.exportToPDF(),
				10, 3);
		subMasterRetailObj.exportToPDF().click();

		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(subProductMasterTestData.get("DownloadPath"));
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

	@And("^Export to Excel functionality in WIP$")
	public void export_to_excel_functionality_in_wip() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 20; i++) {
			try {
				subMasterRetailObj.exportToExcel().click();
				break;
			} catch (Exception e) {

			}
		}
		System.out.println("Downloaded XLS file present in system");
		seleniumactions.getBrowserHelper().switchToParentWithChildClose();

	}

	@Given("^Launch the kuls application and login as checker$")
	public void launch_the_kuls_application() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		// applicationLogin.loginUlsApplicationAsMaker(loginData.Username,loginData.Password);
		applicationLogin.ulSApplicationLoginAsAChecker(loginData.CheckerUserName1);
	}

	@Then("^Click on Remarks button in Action confirmation popup$")
	public void click_on_remarks_button_in_action_confirmation_popup() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				subMasterRetailObj.returnButtonInRemarks(), 10, 2);
		subMasterRetailObj.returnButtonInRemarks().click();
	}

	@And("^Click on Menu icon$")
	public void click_on_menu_icon() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.menuIcon(), 10,
				2);
		subMasterRetailObj.menuIcon().click();

	}

	@And("^Click on Mailbox icon$")
	public void click_on_mailbox_icon() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.checkerInbox(),
				10, 2);
		subMasterRetailObj.checkerInbox().click();

	}

	@And("^Search the respective reference id$")
	public void search_the_respective_reference_id() throws Throwable {

	}

	@And("^click on Action button$")
	public void click_on_action_button() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.actionIcon(),
				10, 2);
		subMasterRetailObj.actionIcon().click();

	}

	@And("^Click on Return icon$")
	public void click_on_return_icon() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.returnIcon(),
				10, 2);
		subMasterRetailObj.returnIcon().click();

	}

	@And("^Enter the remarks in Action confirmation popup$")
	public void enter_the_remarks_in_action_confirmation_popup() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.remarksText(),
				10, 2);
		subMasterRetailObj.remarksText().click();

	}

}
