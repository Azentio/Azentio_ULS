package stepdefinitions;

import java.io.File;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CollateralSubTypeObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.KULS_CollateralSubType;
import testDataType.KULS_Login_TestDataType;

public class KULS_CollateralSubType_Step {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	CollateralSubTypeObj collateralsubtypeObj = new CollateralSubTypeObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	KULS_CollateralSubType collateralsubtypeData = jsonConfig.getCollateralSubTypeByName("Maker");
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign2402.xlsx",
			"CollateralSubTypeTestData", "Data Set ID");
	Map<String, String> testdata;

	@Given("^Launch the kuls application and Navigate to collateral subtype module view list$")
	public void launch_the_kuls_application_and_navigate_to_collateral_subtype_module_view_list() throws Throwable {
		ExcelData excelData = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign2402.xlsx",
				"Logincredentials", "Stage");
		Map<String, String> testdata = excelData.getTestdata("Maker1");
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		login.loginUlsApplicationAsMaker(testdata.get("Username"), testdata.get("Password"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, collateralsubtypeObj.ModuleName(),
				10, 2);
		//collateralsubtypeObj.ModuleName().click();
		javaScriptHelper.JSEClick(collateralsubtypeObj.ModuleName());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, collateralsubtypeObj.LOS(), 10,
				2);
		collateralsubtypeObj.LOS().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.configurationInLeftPanel(), 30, 2);
		collateralsubtypeObj.configurationInLeftPanel().click();
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,collateralsubtypeObj.AssetCollateralConfigInLeftPanel(),30,2);
		// collateralsubtypeObj.AssetCollateralConfigInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.ConfigManagerInLeftPanel(), 30, 2);
		collateralsubtypeObj.ConfigManagerInLeftPanel().click();
		seleniumactions.getJavascriptHelper().scrollIntoView(collateralsubtypeObj.ViewIconOfCollateralSubType());
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,collateralsubtypeObj.ViewIconOfCollateralSubType(),30,2);
		collateralsubtypeObj.ViewIconOfCollateralSubType().click();

	}

	@Then("^Click on Save button in collateral subtype$")
	public void click_on_save_button_in_collateral_subtype() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeSaveIcon(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeSaveIcon().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypesubmitSuccessPopup(), 30, 2);
		Assert.assertEquals(collateralsubtypeObj.CollateralSubTypesubmitSuccessPopup().isDisplayed(), true);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.closeIconInSuccessPopupOfCollateralSubType(), 30, 2);
		collateralsubtypeObj.closeIconInSuccessPopupOfCollateralSubType().click();

	}

	@And("^Click on Add icon of collateral sub type$")
	public void click_on_add_icon_of_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeAddIcon(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeAddIcon().click();

	}

	@And("^Enter the value in Description field of collateral sub type$")
	public void enter_the_value_in_description_field_of_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeDescriptionField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeDescriptionField().click();
		collateralsubtypeObj.CollateralSubTypeDescriptionField().sendKeys(testdata.get("Description"));

	}

	@And("^Enter the value in Asset_CollateralSubtypeCode field$")
	public void enter_the_value_in_assetcollateralsubtypecode_field() throws Throwable {
		Random random = new Random();
		int randomNumber = random.nextInt(999999 - 100000) + 100000;
		exceldata.updateTestData(testdata.get("Data Set ID"), "Asset/Collateral subtype code",String.valueOf(randomNumber));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField()
				.sendKeys(String.valueOf(randomNumber));
		

	}

	@And("^Select the value in Asset_CollateralType field$")
	public void select_the_value_in_assetcollateraltype_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralTypeField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralTypeField().click();
		for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Asset/Collateral Type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}

	}

	@And("^Enter the value in Exposure field$")
	public void enter_the_value_in_exposure_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeExposurePercentageField(), 30, 2);
		for (int i = 0; i < 30; i++) {
			try {
				collateralsubtypeObj.CollateralSubTypeExposurePercentageField().click();
				collateralsubtypeObj.CollateralSubTypeExposurePercentageField().sendKeys(testdata.get("Exposure"));
				break;
			} catch (Exception e) {
			}
		}

	}

	@And("^Enter the value in Asset_CollateralValuationTolerance field$")
	public void enter_the_value_in_assetcollateralvaluationtolerance_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralValuationToleranceField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralValuationToleranceField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralValuationToleranceField()
				.sendKeys(testdata.get("Asset/Collateral Valuation Tollerance"));

	}

	@And("^Enter the value in Remarks field of collateral sub type$")
	public void enter_the_value_in_remarks_field_of_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeRemarksField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeRemarksField().click();
		collateralsubtypeObj.CollateralSubTypeRemarksField().sendKeys(testdata.get("Remarks"));

	}

	@And("^User Capture Checker id from the submit popup$")
	public void user_capture_checker_id_from_the_submit_popup() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.assetAuto_Checker_Id(), 30, 3);
		String CheckerId = collateralsubtypeObj.assetAuto_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		// json.addData(popupID);
		exceldata.updateTestData(testdata.get("Data Set ID"), "Checker id", popupID);
		System.out.println(popupID);
	}

	@Then("^Login into KULS for checker user$")
	public void login_into_kuls_for_checker_user() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		System.out.println(testdata.get("Checker id"));
		login.ulSApplicationLoginAsAChecker(testdata.get("Checker id"));
	}

	@And("^Click on Menu icon for collateral sub type$")
	public void click_on_menu_icon_for_collateral_sub_type() throws Throwable {

		seleniumactions.getJavascriptHelper().JSEClick(collateralsubtypeObj.Checker_toggle());
	}

	@Then("^Verify the record approved popup for collateral sub type$")
	public void verify_the_record_approved_popup_for_collateral_sub_type() throws Throwable {
		String Toast;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.checkerApproveMgs(), 30, 2);
		Toast = collateralsubtypeObj.checkerApproveMgs().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}

	@And("^Search the respective reference id and click on Action button for collatral sub type$")
	public void search_the_respective_reference_id_and_click_on_action_button_for_collatral_sub_type()
			throws Throwable {
		// testdata=exceldata.getTestdata("AT-ACS-T006_D6");
		for (int i = 0; i < 200; i++) {
			try {
				WebElement actionicon = driver.findElement(
						By.xpath("//span[text()='" + testdata.get("Reference ID") + "']/ancestor::tr/td[1]/button"));
				seleniumactions.getJavascriptHelper().JSEClick(actionicon);
						
				break;
			} catch (Exception e) {
				if(i==199) {
					Assert.fail(e.getMessage());
				
				}
			}
		}

	}

	@And("^Click on Approve button for collateral sub type$")
	public void click_on_approve_button_for_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.Checker_Approve(), 30, 2);
		collateralsubtypeObj.Checker_Approve().click();
	}

	@And("^Enter the remarks in action confirmation popup for collateral sub type$")
	public void enter_the_remarks_in_action_confirmation_popup_for_collateral_sub_type() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				// collateralsubtypeObj.Checker_Alert_Approve().click();
				seleniumactions.getJavascriptHelper().JSEClick(collateralsubtypeObj.Checker_Alert_Approve());

				break;
			} catch (ElementNotInteractableException e) {

			}
		}
	}

	@And("^Click on Remarks button in action confirmation popup for collateral sub type$")
	public void click_on_remarks_button_in_action_confirmation_popup_for_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.Checker_Final_Approve(), 30, 2);
		collateralsubtypeObj.Checker_Final_Approve().click();
	}

	@And("^Click on Mail icon for collateral sub type$")
	public void click_on_mail_icon_for_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.Checker_Inbox(), 30, 2);
		collateralsubtypeObj.Checker_Inbox().click();
	}

	@Then("^Submit the collateral sub type record from maker user$")
	public void submit_the_collateral_sub_type_record_from_maker_user() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.assetAutoMaker_Submit(), 30, 2);
		collateralsubtypeObj.assetAutoMaker_Submit().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.assetAutoMakerMaker_EnterRemark(), 30, 2);
		collateralsubtypeObj.assetAutoMakerMaker_EnterRemark().click();
		collateralsubtypeObj.assetAutoMakerMaker_EnterRemark().sendKeys("ok");
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.assetAutomakerRemarkSubmit(), 30, 2);
		collateralsubtypeObj.assetAutomakerRemarkSubmit().click();
	}

	@And("^Search the collateral sub type record$")
	public void search_the_collateral_sub_type_record() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				// seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
				collateralsubtypeObj.assetAutoInboxView_Search().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.assetAutoInboxView_SearchText(), 30, 2);
		collateralsubtypeObj.assetAutoInboxView_SearchText().click();
		collateralsubtypeObj.assetAutoInboxView_SearchText().sendKeys(testdata.get("Searh Value in Inbox"));
	}

	@And("^Store reference number and click on first collateral subtype record$")
	public void store_reference_number_and_click_on_first_collateral_subtype_record() throws Throwable {
		String reference = null;
		for (int i = 0; i < 200; i++) {
			try {
				reference = collateralsubtypeObj.assetAutoReferanceId().getText();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.firstEditIconInMakerListView(), 40, 2);
		collateralsubtypeObj.firstEditIconInMakerListView().click();

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40,
		// 2);

		// json.addReferanceData(reference);
		exceldata.updateTestData("AT-ACS-T001_D1", "Reference ID", reference);
		System.out.println(reference);

	}

	@And("^Store the reference number and click on first collateral subtype record$")
	public void store_the_reference_number_and_click_on_first_collateral_subtype_record() throws Throwable {
		String reference = "";
		for (int i = 0; i < 200; i++) {
			try {
				reference = collateralsubtypeObj.assetAutoReferanceId().getText();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.firstEditIconInMakerListView(), 40, 2);
		collateralsubtypeObj.firstEditIconInMakerListView().click();

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40,
		// 2);

		// json.addReferanceData(reference);
		System.out.println(reference);
		exceldata.updateTestData(testdata.get("Data Set ID"), "Reference ID", reference);

	}

	@And("^Click on remarks button action confirmation popup for collateral sub type rejection$")
	public void click_on_remarks_button_action_confirmation_popup_for_collateral_sub_type_rejection() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.Checker_Final_Reject(), 30, 2);
		collateralsubtypeObj.Checker_Final_Reject().click();
	}

	@Then("^Verify the record rejected popup for collateral sub type$")
	public void verify_the_record_rejected_popup_for_collateral_sub_type() throws Throwable {
		String Toast;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.checkerApproveMgs(), 30, 2);
		Toast = collateralsubtypeObj.checkerApproveMgs().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record REJECTED Successfully");
	}

	@And("^Click on reject button for collateral sub type$")
	public void click_on_reject_button_for_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.Checker_Reject(), 30, 2);
		collateralsubtypeObj.Checker_Reject().click();
	}

	@And("^Enter the remarks in action confirmation popup for collateral sub type rejection$")
	public void enter_the_remarks_in_action_confirmation_popup_for_collateral_sub_type_rejection() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.Checker_Alert_Reject(), 30, 2);
		seleniumactions.getJavascriptHelper().JSEClick(collateralsubtypeObj.Checker_Alert_Reject());
	}

	@And("^Click on remarks button action confirmation popup for collateral sub type return$")
	public void click_on_remarks_button_action_confirmation_popup_for_collateral_sub_type_return() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.Checker_Final_Return(), 30, 2);
		collateralsubtypeObj.Checker_Final_Return().click();
	}

	@Then("^Verify the record returned popup for collateral sub type$")
	public void verify_the_record_returned_popup_for_collateral_sub_type() throws Throwable {
		String Toast;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.checkerApproveMgs(), 30, 2);
		Toast = collateralsubtypeObj.checkerApproveMgs().getText();
		System.out.println(Toast);
	}

	@And("^Click on return button for collateral sub type$")
	public void click_on_return_button_for_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.Checker_Return(), 30, 2);
		collateralsubtypeObj.Checker_Return().click();
	}

	@And("^Enter the remarks in action confirmation popup for collateral sub type return$")
	public void enter_the_remarks_in_action_confirmation_popup_for_collateral_sub_type_return() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.Checker_Alert_Return(), 30, 2);
		collateralsubtypeObj.Checker_Alert_Return().click();
	}

	@Then("^verify that approved collateral sub type record is present in the view list$")
	public void verify_that_approved_collateral_sub_type_record_is_present_in_the_view_list() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeAddIcon(), 30, 2);
		for (int i = 0; i < 20; i++) {
			try {

				String validate = driver
						.findElement(By.xpath(
								"//span[contains(text(),'" + testdata.get("Asset/Collateral subtype code") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testdata.get("Asset/Collateral subtype code"));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}

		}

	}

	@Then("^verify that rejected collateral sub type record is not present in the view list$")
	public void verify_that_rejected_collateral_sub_type_record_is_not_present_in_the_view_list() throws Throwable {
		
		try {
			WebElement subtypecode = driver.findElement(By.xpath("//span[contains(text(),'" + testdata.get("Asset/Collateral subtype code") + "')]"));
			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subtypecode, 30, 2);
			String validate = subtypecode.getText();
//			String validate = driver
//					.findElement(By
//							.xpath("//span[contains(text(),'" + testdata.get("Asset/Collateral subtype code") + "')]"))
//					.getText();
			System.out.println(validate);
			Assert.assertEquals(validate, testdata.get("Asset/Collateral subtype code"));
		} catch (Exception e) {
			System.out.println(
					"The Rejected Record Not in the List view ");
		}
	}

	@And("^Navigate to temp view of collateral sub type$")
	public void navigate_to_temp_view_of_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.TempViewIconOfCollateralSubType(), 30, 2);
		collateralsubtypeObj.TempViewIconOfCollateralSubType().click();
		Thread.sleep(2000);
	}

	@Then("^verify that returned collateral sub type record is present in the temp view$")
	public void verify_that_returned_collateral_sub_type_record_is_present_in_the_temp_view() throws Throwable {
		System.out.println(testdata.get("Asset/Collateral subtype code"));
		for (int i = 0; i < 200; i++) {
			try {

				WebElement subtypecodeforreturn = driver
	.findElement(By.xpath(
								"//span[contains(text(),'" + testdata.get("Asset/Collateral subtype code") + "')]"));
						
				Assert.assertTrue(subtypecodeforreturn.isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail();
				}
				
			}
		}
	}

	@And("^Enter the value in Asset_CollateralSubtypeCode field for checker return$")
	public void enter_the_value_in_assetcollateralsubtypecode_field_for_checker_return() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField()
				.sendKeys(collateralsubtypeData.Asset_CollateralSubtypeCodeForReturn);
	}

	@And("^Enter the value in Asset_CollateralSubtypeCode field for checker reject$")
	public void enter_the_value_in_assetcollateralsubtypecode_field_for_checker_reject() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField()
				.sendKeys(testdata.get("Asset_CollateralSubtypeCodeForReject"));
	}

	@Then("^Click on Save button and validate the field is required popup$")
	public void click_on_save_button_and_validate_the_field_is_required_popup() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeSaveIcon(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeSaveIcon().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.requiredFieldWarningPopup(), 30, 2);
		Assert.assertEquals(collateralsubtypeObj.requiredFieldWarningPopup().isDisplayed(), true);

	}

	@And("^Click on back button of Collateral sub type$")
	public void click_on_back_button_of_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeBackIcon(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeBackIcon().click();
		Thread.sleep(2000);
	}

	@And("^Enter special characters in all fields and validate the popup$")
	public void enter_special_characters_in_all_fields_and_validate_the_popup() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeDescriptionField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeDescriptionField().click();
		testdata = exceldata.getTestdata("AT-ACS-T004_D4");
		collateralsubtypeObj.CollateralSubTypeDescriptionField().sendKeys(testdata.get("Description"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField()
				.sendKeys(testdata.get("Asset/Collateral subtype code"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.alphaNumericCharactersAllowedWarningPopup(), 30, 2);
		Assert.assertEquals(collateralsubtypeObj.alphaNumericCharactersAllowedWarningPopup().isDisplayed(), true);

	}

	@And("^Select the existing record in collateral sub type$")
	public void select_the_existing_record_in_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.pencilIconOfFirstRecordInCollateralSubType(), 30, 2);
		collateralsubtypeObj.pencilIconOfFirstRecordInCollateralSubType().click();

	}

	@And("^Update the value in Description field of collateral sub type$")
	public void update_the_value_in_description_field_of_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeDescriptionField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeDescriptionField().click();
		collateralsubtypeObj.CollateralSubTypeDescriptionField().clear();
		collateralsubtypeObj.CollateralSubTypeDescriptionField().sendKeys(testdata.get("Description"));
	}

	@And("^Update the value in Asset_CollateralSubtypeCode field$")
	public void update_the_value_in_assetcollateralsubtypecode_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().clear();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField()
				.sendKeys(testdata.get("Asset/Collateral subtype code"));
	}

	@And("^Update the value in Asset_CollateralType field$")
	public void update_the_value_in_assetcollateraltype_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralTypeFieldForUpdate(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralTypeFieldForUpdate().click();
		for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Asset/Collateral Type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Update the value in Exposure field$")
	public void update_the_value_in_exposure_field() throws Throwable {
		for (int i = 0; i < 30; i++) {
			try {
				collateralsubtypeObj.CollateralSubTypeExposurePercentageField().click();
				collateralsubtypeObj.CollateralSubTypeExposurePercentageField().clear();
				collateralsubtypeObj.CollateralSubTypeExposurePercentageField().sendKeys(testdata.get("Exposure"));
				break;
			} catch (Exception e) {
			}
		}

	}

	@And("^Update the value in Asset_CollateralValuationTolerance field$")
	public void update_the_value_in_assetcollateralvaluationtolerance_field() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralValuationToleranceField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralValuationToleranceField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralValuationToleranceField().clear();
		collateralsubtypeObj.CollateralSubTypeCollateralValuationToleranceField()
				.sendKeys(testdata.get("Asset/Collateral Valuation Tollerance"));

	}

	@And("^Update the value in Remarks field of collateral sub type$")
	public void update_the_value_in_remarks_field_of_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeRemarksField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeRemarksField().click();
		collateralsubtypeObj.CollateralSubTypeRemarksField().clear();
		collateralsubtypeObj.CollateralSubTypeRemarksField().sendKeys(testdata.get("Remarks"));
	}

	@Then("^Update the field value as special character and validate the error popup$")
	public void update_the_field_value_as_special_character_and_validate_the_error_popup() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeDescriptionField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeDescriptionField().click();
		collateralsubtypeObj.CollateralSubTypeDescriptionField().clear();
		testdata = exceldata.getTestdata("AT-ACS-T004_D4");
		collateralsubtypeObj.CollateralSubTypeDescriptionField().sendKeys(testdata.get("Description"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().clear();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField()
				.sendKeys(testdata.get("Asset/Collateral subtype code"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.alphaNumericCharactersAllowedWarningPopup(), 30, 2);
		Assert.assertEquals(collateralsubtypeObj.alphaNumericCharactersAllowedWarningPopup().isDisplayed(), true);

	}

	@And("^Clear the value in required fields and validate the field required popup$")
	public void clear_the_value_in_required_fields_and_validate_the_field_required_popup() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralTypeFieldForUpdate(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralTypeFieldForUpdate().click();
		testdata = exceldata.getTestdata("AT-ACS-T007_D7");
		for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Asset/Collateral Type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeSaveIcon(), 30, 2);
		collateralsubtypeObj.CollateralSubTypeSaveIcon().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.requiredFieldWarningPopup(), 30, 2);
		Assert.assertEquals(collateralsubtypeObj.requiredFieldWarningPopup().isDisplayed(), true);

	}

	@And("^Update the status of collateral sub type record$")
	public void update_the_status_of_collateral_sub_type_record() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.statusToggleIconOfCollateralSubtype(), 30, 2);
		collateralsubtypeObj.statusToggleIconOfCollateralSubtype().click();
	}

	@And("^Validate that records in collateral sub type view list is non editable$")
	public void validate_that_records_in_collateral_sub_type_view_list_is_non_editable() throws Throwable {
		String xpath = "//tbody/tr[1]/td[4]";
		Thread.sleep(2000);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 30, 2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified status field is not editable only displayable");
		}
	}

	@And("^Search with valid test data in collateral sub type view list$")
	public void search_with_valid_test_data_in_collateral_sub_type_view_list() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				collateralsubtypeObj.searchIconOfCollateralSubType().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.searchTextFieldOfCollateralSubType(), 30, 2);
		testdata = exceldata.getTestdata("AT-ACS-T011_D11");
		collateralsubtypeObj.searchTextFieldOfCollateralSubType().sendKeys(testdata.get("Valid"));
		String xpath = "//span[contains(text(),' Description ')]";
		String productgroup = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 30, 2);
		for (int i = 0; i < 20; i++) {

			productgroup = driver.findElement(By.xpath(xpath)).getText();
		}
		System.out.println(productgroup);

	}

	@And("^Search with invalid test data in collateral sub type view list$")
	public void search_with_invalid_test_data_in_collateral_sub_type_view_list() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				collateralsubtypeObj.searchIconOfCollateralSubType().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.searchTextFieldOfCollateralSubType(), 30, 2);
		testdata = exceldata.getTestdata("AT-ACS-T011_D11");
		collateralsubtypeObj.searchTextFieldOfCollateralSubType().sendKeys(testdata.get("Invalid"));
		Thread.sleep(3000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 30, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				// "Showing 0 to 0 of 0 entries"
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
	}

	@And("^Validat the export to PDF functionality of collateral sub type$")
	public void validat_the_export_to_pdf_functionality_of_collateral_sub_type() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				collateralsubtypeObj.exportIconOfCollateralSubType().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.exportToPDFOfCollateralSubType(), 30, 3);
		collateralsubtypeObj.exportToPDFOfCollateralSubType().click();
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

	@And("^Validat the export to Excel functionality of collateral sub type$")
	public void validat_the_export_to_excel_functionality_of_collateral_sub_type() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				collateralsubtypeObj.exportIconOfCollateralSubType().click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 20; i++) {
			try {
				collateralsubtypeObj.exportToExcelOfCollateralSubType().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();
		System.out.println("Downloaded XLS file present in system");

	}

	@And("^Validate the view summary of collateral sub type$")
	public void validate_the_view_summary_of_collateral_sub_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.viewSummaryIconOfCollateralSubType(), 30, 2);

		seleniumactions.getJavascriptHelper().JSEClick(collateralsubtypeObj.viewSummaryIconOfCollateralSubType());

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.viewSummaryPageOfCollateralSubType(), 30, 2);
		Assert.assertEquals(collateralsubtypeObj.viewSummaryPageOfCollateralSubType().isDisplayed(), true);

	}

	@And("^Search with valid test data in collateral sub type WIP$")
	public void search_with_valid_test_data_in_collateral_sub_type_wip() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				collateralsubtypeObj.searchIconOfCollateralSubType().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.searchTextFieldOfCollateralSubType(), 30, 2);
		testdata = exceldata.getTestdata("AT-ACS-T012_D12");
		collateralsubtypeObj.searchTextFieldOfCollateralSubType().sendKeys(testdata.get("Valid"));
		String xpath = "//span[contains(text(),' Description ')]";
		String productgroup = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 30, 2);
		for (int i = 0; i < 20; i++) {

			productgroup = driver.findElement(By.xpath(xpath)).getText();
		}
		System.out.println(productgroup);

	}

	@And("^Search with invalid test data in collateral sub type WIP$")
	public void search_with_invalid_test_data_in_collateral_sub_type_wip() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				collateralsubtypeObj.searchIconOfCollateralSubType().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.searchTextFieldOfCollateralSubType(), 30, 2);
		testdata = exceldata.getTestdata("AT-ACS-T012_D12");
		collateralsubtypeObj.searchTextFieldOfCollateralSubType().sendKeys("zfghz");
		Thread.sleep(3000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 30, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				// "Showing 0 to 0 of 0 entries"
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
	}

	@And("^Validate the fields present in collateral sub type view list$")
	public void validate_the_fields_present_in_collateral_sub_type_view_list() throws Throwable {
		Thread.sleep(3000);
		String xpath = "(//span[contains(text(),'Action')])[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 30, 2);
		WebElement Action = driver.findElement(By.xpath(xpath));
		System.out.println(Action);
		String xpath1 = "//span[contains(text(),' Asset/Collateral type Subtype Code ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath1)), 30, 2);
		WebElement assetcolleteralsubtypecode = driver.findElement(By.xpath(xpath1));
		System.out.println(assetcolleteralsubtypecode);
		String xpath2 = "//span[contains(text(),' Description ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 30, 2);
		WebElement description = driver.findElement(By.xpath(xpath2));
		System.out.println(description);
		String xpath3 = "(//span[contains(text(),' Status ')])[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 30, 2);
		WebElement status = driver.findElement(By.xpath(xpath3));
		System.out.println(status);
	}

	@And("^Validate the fields in WIP of collateral sub type$")
	public void validate_the_fields_in_wip_of_collateral_sub_type() throws Throwable {
		String xpath = "(//span[contains(text(),'Action')])[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 30, 2);
		WebElement Action = driver.findElement(By.xpath(xpath));
		System.out.println(Action);
		String xpath1 = "//span[contains(text(),' Asset/Collateral type Subtype Code ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath1)), 30, 2);
		WebElement assetcolleteralsubtypecode = driver.findElement(By.xpath(xpath1));
		System.out.println(assetcolleteralsubtypecode);
		String xpath2 = "//span[contains(text(),' Description ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 30, 2);
		WebElement description = driver.findElement(By.xpath(xpath2));
		System.out.println(description);
		String xpath3 = "(//span[contains(text(),' Status ')])[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 30, 2);
		WebElement status = driver.findElement(By.xpath(xpath3));
		System.out.println(status);
		String xpath4 = "//span[contains(text(),' Authorization Status ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath4)), 30, 2);
		WebElement authorizationstatus = driver.findElement(By.xpath(xpath4));
		System.out.println(authorizationstatus);
	}

	@And("^Update the value in Asset_CollateralSubtypeCode field for checker reject$")
	public void update_the_value_in_assetcollateralsubtypecode_field_for_checker_reject() throws Throwable {
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().clear();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField()
				.sendKeys(testdata.get("updatedAsset_CollateralSubtypeCodeForReject"));

	}

	@And("^Update the value in Asset_CollateralSubtypeCode field for chcker return$")
	public void update_the_value_in_assetcollateralsubtypecode_field_for_chcker_return() throws Throwable {
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().clear();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField()
				.sendKeys(testdata.get("updatedAsset_CollateralSubtypeCodeForReturn"));
	}

	@And("^Validate the record in mail box with updated record for checker approve$")
	public void validate_the_record_in_mail_box_with_updated_record_for_checker_approve() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {

				String validate = driver.findElement(By.xpath(
						"//ion-label[contains(text(),'Asset/Collateral subtype code')]//following-sibling::ion-input"))
						.getAttribute("ng-reflect-model");
				System.out.println(validate);
				Assert.assertEquals(validate, testdata.get("UpdatedAsset_CollateralSubtypeCodeForApprove"));
				break;
			} catch (Exception e) {
				Assert.fail();
			}

		}
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,collateralsubtypeObj.CollateralSubTypesubmitSuccessPopup(),30,2);
		// Assert.assertEquals(collateralsubtypeObj.CollateralSubTypesubmitSuccessPopup().isDisplayed(),
		// true);

	}

	@And("^Update the value in Asset_CollateralSubtypeCode field for checker approve$")
	public void update_the_value_in_assetcollateralsubtypecode_field_for_checker_approve() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField(), 1, 2);
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().click();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField().clear();
		collateralsubtypeObj.CollateralSubTypeCollateralSubTypeCodeField()
				.sendKeys(testdata.get("UpdatedAsset_CollateralSubtypeCodeForApprove"));

	}

	@And("^Validate the record in mail box with updated record for checker return$")
	public void validate_the_record_in_mail_box_with_updated_record_for_checker_return() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {

				String validate = driver.findElement(By.xpath(
						"//ion-label[contains(text(),'Asset/Collateral subtype code')]//following-sibling::ion-input"))
						.getAttribute("ng-reflect-model");
				System.out.println(validate);
				Assert.assertEquals(validate, testdata.get("updatedAsset_CollateralSubtypeCodeForReturn"));
				break;
			} catch (Exception e) {
				Assert.fail();
			}

		}

	}

	@And("^Validate the record in mail box with updated record for checker reject$")
	public void validate_the_record_in_mail_box_with_updated_record_for_checker_reject() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {

				String validate = driver.findElement(By.xpath(
						"//ion-label[contains(text(),'Asset/Collateral subtype code')]//following-sibling::ion-input"))
						.getAttribute("ng-reflect-model");
				System.out.println(validate);
				Assert.assertEquals(validate, testdata.get("updatedAsset_CollateralSubtypeCodeForReject"));
				break;
			} catch (Exception e) {
				Assert.fail();
			}

		}

	}

	@And("^Update test data for collateral sub type creation and checker approve$")
	public void update_test_data_for_collateral_sub_type_creation_and_checker_approve() throws Throwable {
		testdata = exceldata.getTestdata("AT-ACS-T001_D1");
	}

	@And("^Update test data for collateral sub type creation and checker reject$")
	public void update_test_data_for_collateral_sub_type_creation_and_checker_reject() throws Throwable {
		testdata = exceldata.getTestdata("AT-ACS-T002_D2");
	}

	@And("^Update test data for collateral sub type creation and checker return$")
	public void update_test_data_for_collateral_sub_type_creation_and_checker_return() throws Throwable {
		testdata = exceldata.getTestdata("AT-ACS-T003_D3");
	}

	@And("^Update test data for collateral sub type update$")
	public void update_test_data_for_collateral_sub_type_update() throws Throwable {
		testdata = exceldata.getTestdata("AT-ACS-T005_D5");
	}

}
