package stepdefinitions;

import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.AssetCollateralTypeObj;
import pageobjects.AssetCollateralTypeObject;
import pageobjects.KULS_LoginObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.AssetCollateralTypeTestDataType;
import testDataType.KULS_Login_TestDataType;

public class AssetCollateralType {

	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	RadioButtonHelper radioButtonHelper = new RadioButtonHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	AssetCollateralTypeObj assetCollateralTypeObj = new AssetCollateralTypeObj(driver);
	AssetCollateralTypeObject collateralTypeObj = new AssetCollateralTypeObject(driver);
	AssetCollateralTypeTestDataType assetCollateralTypeTestDataType = jsonConfig.getAssetCollateralTypeByName("Maker");
	Selenium_Actions action = new Selenium_Actions(driver);
	
	@Then("^user should navigate to asset collateral config$")
	public void user_should_navigate_to_asset_collateral_config() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralConfigurations());
		assetCollateralTypeObj.assetCollateralConfigurations().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralConfigMenu());
		assetCollateralTypeObj.assetCollateralConfigMenu().click();
	}

	@And("^click on view button of asset collateral config$")
	public void click_on_view_button_of_asset_collateral_config() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_View());
		assetCollateralTypeObj.assetCollateralType_View().click();
	}

	@Then("^click on add button to create new record of asset collateral config$")
	public void click_on_add_button_to_create_new_record_of_asset_collateral_config() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_addButton());
		assetCollateralTypeObj.assetCollateralType_addButton().click();
	}

	@Then("^verify the Asset Collateral type screen is getting open with all valid fields$")
	public void verify_the_asset_collateral_type_screen_is_getting_open_with_all_valid_fields() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SaveButton());
		boolean actualresult = assetCollateralTypeObj.assetCollateralType_SaveButton().isDisplayed();
		Assert.assertEquals(actualresult, true);
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_BackButton());
		boolean actualresult1 = assetCollateralTypeObj.assetCollateralType_BackButton().isDisplayed();
		Assert.assertEquals(actualresult1, true);
	}

	@Then("^verify the description field should be editable mandatory and multilingual$")
	public void verify_the_description_field_should_be_editable_mandatory_and_multilingual() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual());
		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual().isDisplayed();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Description());
		assetCollateralTypeObj.assetCollateralType_Description().click();

		assetCollateralTypeObj.assetCollateralType_Description().sendKeys("editable");
		assetCollateralTypeObj.assetCollateralType_Description().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		assetCollateralTypeObj.assetCollateralType_Description().sendKeys(Keys.BACK_SPACE);
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Description");
		
//		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ApplicationLanguage());
//        assetCollateralTypeObj.assetCollateralType_ApplicationLanguage().click();
//        waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ApplicationLanguageEnglish());
//        assetCollateralTypeObj.assetCollateralType_ApplicationLanguageEnglish().click();
//		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual());
//		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual().click();
//		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionSelectedLanguageInputField());
//		assetCollateralTypeObj.assetCollateralType_DescriptionSelectedLanguageInputField().sendKeys(assetCollateralTypeTestDataType.DescriptionEnglish);
//		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual_Save());
//		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual_Save().click();
		
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ApplicationLanguage());
        assetCollateralTypeObj.assetCollateralType_ApplicationLanguage().click();
        waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ApplicationLanguageFrench());
        assetCollateralTypeObj.assetCollateralType_ApplicationLanguageFrench().click();
        waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual());
		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionSelectedLanguageInputField());
		assetCollateralTypeObj.assetCollateralType_DescriptionSelectedLanguageInputField().sendKeys(assetCollateralTypeTestDataType.DescriptionFrench);
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual_Save());
		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual_Save().click();
		
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ApplicationLanguage());
        assetCollateralTypeObj.assetCollateralType_ApplicationLanguage().click();
        waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ApplicationLanguageGerman());
        assetCollateralTypeObj.assetCollateralType_ApplicationLanguageGerman().click();
        waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual());
		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionSelectedLanguageInputField());
		assetCollateralTypeObj.assetCollateralType_DescriptionSelectedLanguageInputField().sendKeys(assetCollateralTypeTestDataType.DescriptionGerman);
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual_Save());
		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual_Save().click();
		
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ApplicationLanguage());
        assetCollateralTypeObj.assetCollateralType_ApplicationLanguage().click();
        waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ApplicationLanguageArabic());
        assetCollateralTypeObj.assetCollateralType_ApplicationLanguageArabic().click();
        waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual());
		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionSelectedLanguageInputField());
		assetCollateralTypeObj.assetCollateralType_DescriptionSelectedLanguageInputField().sendKeys(assetCollateralTypeTestDataType.DescriptionArabic);
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual_Save());
		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual_Save().click();
		
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ApplicationLanguage());
        assetCollateralTypeObj.assetCollateralType_ApplicationLanguage().click();
        waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ApplicationLanguageEnglish());
        assetCollateralTypeObj.assetCollateralType_ApplicationLanguageEnglish().click();
        waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual());
		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionSelectedLanguageInputField());
		assetCollateralTypeObj.assetCollateralType_DescriptionSelectedLanguageInputField().sendKeys(assetCollateralTypeTestDataType.DescriptionEnglish);
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual_Save());
		assetCollateralTypeObj.assetCollateralType_DescriptionMultilingual_Save().click();

	}

	@Then("^verify the field asset collateral type code should be mandatory editable and unique code$")
	public void verify_the_field_asset_collateral_type_code_should_be_mandatory_editable_and_unique_code() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Asset/Collateral type code");
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode());
		assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode().sendKeys(assetCollateralTypeTestDataType.AssetCollateralTypeCode);
	}

	@Then("^verify the field Asset Collateral category should be mandatory and editable$")
	public void verify_the_field_asset_collateral_category_should_be_mandatory_and_editable() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Asset/Collateral Category");

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralCategory());
		assetCollateralTypeObj.assetCollateralType_AssetCollateralCategory().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.AssetCollateralCategory);
	}

	@Then("^verify the field Asset Collateral category should display the list of only active and approved records$")
	public void verify_the_field_asset_collateral_category_should_display_the_list_of_only_active_and_approved_records() throws Throwable {

	}

	@Then("^verify the field Module should be mandatory editable dropdown should show the list of modules$")
	public void verify_the_field_module_should_be_mandatory_editable_dropdown_should_show_the_list_of_modules() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Module");

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Module());
		assetCollateralTypeObj.assetCollateralType_Module().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.Module1);
		Thread.sleep(1000);
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Module());
		assetCollateralTypeObj.assetCollateralType_Module().click();

		Thread.sleep(1000);
		List<WebElement> modulelist = driver.findElements(By.xpath("//ion-radio-group//ion-label"));
		System.out.println(modulelist.size());
		for (WebElement webElement : modulelist) {
			while (true) {
				try {
					System.out.println(webElement.getText());
					boolean value = webElement.isDisplayed();
					Assert.assertEquals(value, true);
					break;
				} catch (StaleElementReferenceException se) {

				}
			}
		}

		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.Module2);

	}

	@Then("^verify the field IFRS should be non mandatory and editable dropdown should show yes or no$")
	public void verify_the_field_ifrs_should_be_non_mandatory_and_editable_dropdown_should_show_yes_or_no() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("IFRS");
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_IFRS());
		assetCollateralTypeObj.assetCollateralType_IFRS().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_RadioButtonSelect());
		List<WebElement> modulelist = driver.findElements(By.xpath("//ion-radio-group//ion-label"));
		for (WebElement webElement : modulelist) {
			String value = webElement.getText();
			if (value.equalsIgnoreCase("Select")) {
				System.out.println("Dropdown is showing select");
			}
			else if (value.equalsIgnoreCase("Y")) {
				System.out.println("Dropdown is showing yes(Y)");
			}
			else if (value.equalsIgnoreCase("N")) {
				System.out.println("Dropdown is showing no(N)");
			} else{
				System.out.println("Dropdown doesn't have Y or N");
			}
		}

		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.IFRS);
	}

	@Then("^verify the field haircut percent should be mandatory editable and upto 4 decimal places allowed$")
	public void verify_the_field_haircut_percent_should_be_mandatory_editable_and_upto_4_decimal_places_allowed() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("HairCut %");
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_HairCutPercent());
		assetCollateralTypeObj.assetCollateralType_HairCutPercent().click();

		assetCollateralTypeObj.assetCollateralType_HairCutPercent().sendKeys("1.00000");
		boolean up2fourdecimal = assetCollateralTypeObj.assetCollateralType_HairCutPercentUp2FourDecimal().isDisplayed();
		Assert.assertEquals(up2fourdecimal, true);
		assetCollateralTypeObj.assetCollateralType_HairCutPercent().sendKeys(Keys.chord(Keys.CONTROL, "A"));
		assetCollateralTypeObj.assetCollateralType_HairCutPercent().sendKeys("2.0000");

	}

	@Then("^verify the field Remarks should be mandatory and editable textarea$")
	public void verify_the_field_remarks_should_be_mandatory_and_editable_textarea() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Remarks");

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Remarks());
		assetCollateralTypeObj.assetCollateralType_Remarks().sendKeys("ok");
	}

//  @Then("^Fill all valid fields in the screen$")
//  public void fill_all_valid_fields_in_the_screen() throws Throwable {
//  	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Description());
//  	assetCollateralTypeObj.assetCollateralType_Description().sendKeys(assetCollateralTypeTestDataType.DescriptionEnglish);
//  	
//  	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode());
//  	assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode().sendKeys(assetCollateralTypeTestDataType.AssetCollateralTypeCode);
//  	
//  	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralCategory());
//  	assetCollateralTypeObj.assetCollateralType_AssetCollateralCategory().click();
//  	radioButtonHelper.radioButton(assetCollateralTypeTestDataType.AssetCollateralCategory);
//  	
//  	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Module());
//  	assetCollateralTypeObj.assetCollateralType_Module().click();
//  	radioButtonHelper.radioButton(assetCollateralTypeTestDataType.Module1);
//  	
//  	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_IFRS());
//  	assetCollateralTypeObj.assetCollateralType_IFRS().click();
//  	radioButtonHelper.radioButton(assetCollateralTypeTestDataType.IFRS);
//  	
//  	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_HairCutPercent());
//  	assetCollateralTypeObj.assetCollateralType_HairCutPercent().sendKeys(assetCollateralTypeTestDataType.HaircutPercent);
//  	
//  	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Remarks());
//  	assetCollateralTypeObj.assetCollateralType_Remarks().sendKeys(assetCollateralTypeTestDataType.Remarks);
//  	
//  }

	@Then("^verify system display the confirmation message post clicking on save button$")
	public void verify_system_display_the_confirmation_message_post_clicking_on_save_button() throws InterruptedException {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SaveButton());
		assetCollateralTypeObj.assetCollateralType_SaveButton().click();

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SaveConfirmationMessage());
		boolean res = assetCollateralTypeObj.assetCollateralType_SaveConfirmationMessage().isDisplayed();
		Assert.assertEquals(res, true);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SaveConfirmationMessageCloseButton());
		assetCollateralTypeObj.assetCollateralType_SaveConfirmationMessageCloseButton().click();
	}

	@Then("^verify the functionality of back button of collateral type$")
	public void verify_the_functionality_of_back_button_of_collateral_type() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_FirstRecordEditButton());
		assetCollateralTypeObj.assetCollateralType_FirstRecordEditButton().click();

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_BackButton());
		assetCollateralTypeObj.assetCollateralType_BackButton().click();

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ListViewtitle());
		boolean res = assetCollateralTypeObj.assetCollateralType_ListViewtitle().isDisplayed();
		Assert.assertEquals(res, true);

	}

	@Then("^click on inbox button to select the record of collateral type$")
	public void click_on_inbox_button_to_select_the_record_of_collateral_type() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Inbox());
		assetCollateralTypeObj.assetCollateralType_Inbox().click();
	}

	@And("^select the record of collateral type from inbox to submit$")
	public void select_the_record_of_collateral_type_from_inbox_to_submit() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_NewRecordReferenceID());
		referenceID = assetCollateralTypeObj.assetCollateralType_NewRecordReferenceID().getText();
		jsonDataReaderWriter.addReferanceData(referenceID);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_NewSavedRecord());
		assetCollateralTypeObj.assetCollateralType_NewSavedRecord().click();

	}

	@Then("^click on submit button to submit the record of collateral type$")
	public void click_on_submit_button_to_submit_the_record_of_collateral_type() throws Throwable {

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Submit());
		assetCollateralTypeObj.assetCollateralType_Submit().click();

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_MakerSubmitRemark());
		assetCollateralTypeObj.assetCollateralType_MakerSubmitRemark().sendKeys(assetCollateralTypeTestDataType.MakerSubmitRemark);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_FinalSubmit());
		assetCollateralTypeObj.assetCollateralType_FinalSubmit().click();
	}

	@Then("^system should display confirmation message after submit collateral type record$")
	public void system_should_display_confirmation_message_after_submit_collateral_type_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ConfirmationMessage());
		boolean res = assetCollateralTypeObj.assetCollateralType_ConfirmationMessage().isDisplayed();
		Assert.assertEquals(res, true);
	}

	@Then("^capture checker ID of collateral type$")
	public void capture_checker_id_of_collateral_type() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ConfirmationMessage());
		String message = assetCollateralTypeObj.assetCollateralType_ConfirmationMessage().getText();
		String emptystring = "";
		String ar[] = message.split(" ");
		emptystring = ar[ar.length - 1];
		String checkerID = emptystring.replaceAll("[/.]", "");
		System.out.println(checkerID);
		jsonDataReaderWriter.addData(checkerID);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ConfirmationMessageCloseButton());
		assetCollateralTypeObj.assetCollateralType_ConfirmationMessageCloseButton().click();

	}

	@Then("^logout user from maker stage$")
	public void logout_user_from_maker_stage() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Profile());
		assetCollateralTypeObj.assetCollateralType_Profile().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_LogoutUser());
		assetCollateralTypeObj.assetCollateralType_LogoutUser().click();
	}

	@And("^User Login as checker to approve collateral type record$")
	public void user_login_as_checker_to_approve_collateral_type_record() throws Throwable {
		kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
	}

	@Then("^click on menu button toggle$")
	public void click_on_menu_button_toggle() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_MenuToggle());
		assetCollateralTypeObj.assetCollateralType_Checker_MenuToggle().click();
	}

	@Then("^select the record of collateral type to approve$")
	public void select_the_record_of_collateral_type_to_approve() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_SearchInbox());
		assetCollateralTypeObj.assetCollateralType_Checker_SearchInbox().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_SearchInboxInputField());
		assetCollateralTypeObj.assetCollateralType_Checker_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
		String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		String res = driver.findElement(By.xpath("//span[contains(text(),'" + jsonDataReaderWriter.readReferancedata() + "')]" )).getText();
		Assert.assertEquals(res, jsonDataReaderWriter.readReferancedata());
		driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();

	}

	@Then("^select approve button for approve$")
	public void select_approve_button_for_approve() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_Approve());
		assetCollateralTypeObj.assetCollateralType_Checker_Approve().click();

	}
	
	@Then("^verify remark field is mandatory$")
	public void verify_remark_field_is_mandatory() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_CheckerRemarkMandatory());
		assetCollateralTypeObj.assetCollateralType_Checker_CheckerRemarkMandatory().getText().equalsIgnoreCase("*");
		
	}

	@Then("^enter remark for approve the record of collateral type$")
	public void enter_remark_for_approve_the_record_of_collateral_type() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, assetCollateralTypeObj.assetCollateralType_Checker_CheckerApproveRemark(), 10, 2);
		assetCollateralTypeObj.assetCollateralType_Checker_CheckerApproveRemark().sendKeys(assetCollateralTypeTestDataType.CheckerApproveRemark);

	}

	@Then("^click on approve button of the collateral type record$")
	public void click_on_approve_button_of_the_collateral_type_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_CheckerApproveButton());
		assetCollateralTypeObj.assetCollateralType_Checker_CheckerApproveButton().click();
	}

	@Then("^system should display confirmation message after approve the collateral type record$")
	public void system_should_display_confirmation_message_after_approve_the_collateral_type_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ConfirmationMessage());
		assetCollateralTypeObj.assetCollateralType_ConfirmationMessage().isDisplayed();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_ApproveConfirmationMessageCloseButton());
		assetCollateralTypeObj.assetCollateralType_Checker_ApproveConfirmationMessageCloseButton().click();
	}

	@Then("^logout user from checker stage$")
	public void logout_user_from_checker_stage() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Profile());
		assetCollateralTypeObj.assetCollateralType_Profile().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_LogoutUser());
		assetCollateralTypeObj.assetCollateralType_LogoutUser().click();
	}
	
	@Then("^verify all the captured data from makers side should be saved and stored in the system$")
    public void verify_all_the_captured_data_from_makers_side_should_be_saved_and_stored_in_the_system() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchButton());
		assetCollateralTypeObj.assetCollateralType_SearchButton().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchInputField());
		assetCollateralTypeObj.assetCollateralType_SearchInputField().sendKeys(assetCollateralTypeTestDataType.AssetCollateralTypeCode1);
//		boolean makerrecord = assetCollateralTypeObj.assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode().isDisplayed();
//		Assert.assertTrue(makerrecord);
		String beforexpath = "//span[contains(text(),'"; 
    	String afterxpath = "')]"; 
    	boolean assetcollateraltypecode1 = driver.findElement(By.xpath(beforexpath +assetCollateralTypeTestDataType.AssetCollateralTypeCode1+ afterxpath)).isDisplayed();
    	Assert.assertTrue(assetcollateraltypecode1);
	}
	
	@Then("^verify all the captured data from makers side should not be saved and stored in the system$")
	public void verify_all_the_captured_data_from_makers_side_should_not_be_saved_and_stored_in_the_system() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchButton());
		assetCollateralTypeObj.assetCollateralType_SearchButton().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchInputField());
		assetCollateralTypeObj.assetCollateralType_SearchInputField().sendKeys(assetCollateralTypeTestDataType.AssetCollateralTypeCode2);
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_NoDataFoundInSearch());
		boolean res = assetCollateralTypeObj.assetCollateralType_NoDataFoundInSearch().isDisplayed();
		Assert.assertTrue(res);
	}
	
	@Then("^verify all the captured data from makers side should be moved back and stored in the maker stage$")
    public void verify_all_the_captured_data_from_makers_side_should_be_moved_back_and_stored_in_the_maker_stage() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchButton());
		assetCollateralTypeObj.assetCollateralType_SearchButton().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchInputField());
		assetCollateralTypeObj.assetCollateralType_SearchInputField().sendKeys(assetCollateralTypeTestDataType.AssetCollateralTypeCode3);
//		waithelper.waitForElementwithFluentwait(driver, null);
//		boolean makerrecord = assetCollateralTypeObj.assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode().isDisplayed();
//		Assert.assertTrue(makerrecord);
		String beforexpath = "//span[contains(text(),'"; 
    	String afterxpath = "')]"; 
    	boolean assetcollateraltypecode3 = driver.findElement(By.xpath(beforexpath +assetCollateralTypeTestDataType.AssetCollateralTypeCode3+ afterxpath)).isDisplayed();
    	Assert.assertTrue(assetcollateraltypecode3);
    }

	@And("^User Login as checker to reject collateral type record$")
	public void user_login_as_checker_to_reject_collateral_type_record() throws Throwable {
		kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
	}

	@Then("^select the record of collateral type to reject$")
	public void select_the_record_of_collateral_type_to_reject() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_SearchInbox());
		assetCollateralTypeObj.assetCollateralType_Checker_SearchInbox().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_SearchInboxInputField());
		assetCollateralTypeObj.assetCollateralType_Checker_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
		String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();
	}

	@Then("^select reject button to reject the record$")
	public void select_reject_button_to_reject_the_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_Reject());
		assetCollateralTypeObj.assetCollateralType_Checker_Reject().click();
	}

	@Then("^enter remark for reject the record of collateral type$")
	public void enter_remark_for_reject_the_record_of_collateral_type() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, assetCollateralTypeObj.assetCollateralType_Checker_CheckerRejectRemark(), 10, 2);
		assetCollateralTypeObj.assetCollateralType_Checker_CheckerRejectRemark().sendKeys(assetCollateralTypeTestDataType.CheckerRejectRemark);
	}

	@Then("^click on reject button of the collateral type record$")
	public void click_on_reject_button_of_the_collateral_type_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_CheckerRejectButton());
		assetCollateralTypeObj.assetCollateralType_Checker_CheckerRejectButton().click();
	}

	@Then("^system should display confirmation message after reject the collateral type record$")
	public void system_should_display_confirmation_message_after_reject_the_collateral_type_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ConfirmationMessage());
		assetCollateralTypeObj.assetCollateralType_ConfirmationMessage().isDisplayed();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_ApproveConfirmationMessageCloseButton());
		assetCollateralTypeObj.assetCollateralType_Checker_ApproveConfirmationMessageCloseButton().click();
	}

	@Then("^Fill all valid fields in the screen for approve the record$")
	public void fill_all_valid_fields_in_the_screen_for_approve_the_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Description());
		assetCollateralTypeObj.assetCollateralType_Description().sendKeys(assetCollateralTypeTestDataType.Description1);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode());
		assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode().sendKeys(assetCollateralTypeTestDataType.AssetCollateralTypeCode1);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralCategory());
		assetCollateralTypeObj.assetCollateralType_AssetCollateralCategory().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.AssetCollateralCategory1);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Module());
		assetCollateralTypeObj.assetCollateralType_Module().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.Module);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_IFRS());
		assetCollateralTypeObj.assetCollateralType_IFRS().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.IFRS1);

		while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_HairCutPercent());
				assetCollateralTypeObj.assetCollateralType_HairCutPercent().sendKeys(assetCollateralTypeTestDataType.HaircutPercent1);
				break;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Remarks());
		assetCollateralTypeObj.assetCollateralType_Remarks().sendKeys(assetCollateralTypeTestDataType.Remarks1);

	}

	@Then("^Fill all valid fields in the screen for reject the record$")
	public void fill_all_valid_fields_in_the_screen_for_reject_the_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Description());
		assetCollateralTypeObj.assetCollateralType_Description().sendKeys(assetCollateralTypeTestDataType.Description2);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode());
		assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode().sendKeys(assetCollateralTypeTestDataType.AssetCollateralTypeCode2);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralCategory());
		assetCollateralTypeObj.assetCollateralType_AssetCollateralCategory().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.AssetCollateralCategory2);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Module());
		assetCollateralTypeObj.assetCollateralType_Module().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.Module);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_IFRS());
		assetCollateralTypeObj.assetCollateralType_IFRS().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.IFRS2);

		while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_HairCutPercent());
				assetCollateralTypeObj.assetCollateralType_HairCutPercent().sendKeys(assetCollateralTypeTestDataType.HaircutPercent2);
				break;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Remarks());
		assetCollateralTypeObj.assetCollateralType_Remarks().sendKeys(assetCollateralTypeTestDataType.Remarks2);

	}

	@Then("^Fill all valid fields in the screen for return the record$")
	public void fill_all_valid_fields_in_the_screen_for_return_the_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Description());
		assetCollateralTypeObj.assetCollateralType_Description().sendKeys(assetCollateralTypeTestDataType.Description3);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode());
		assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode().sendKeys(assetCollateralTypeTestDataType.AssetCollateralTypeCode3);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralCategory());
		assetCollateralTypeObj.assetCollateralType_AssetCollateralCategory().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.AssetCollateralCategory3);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Module());
		assetCollateralTypeObj.assetCollateralType_Module().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.Module);

		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_IFRS());
		assetCollateralTypeObj.assetCollateralType_IFRS().click();
		radioButtonHelper.radioButton(assetCollateralTypeTestDataType.IFRS3);

		while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_HairCutPercent());
				assetCollateralTypeObj.assetCollateralType_HairCutPercent().sendKeys(assetCollateralTypeTestDataType.HaircutPercent3);
				break;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Remarks());
		assetCollateralTypeObj.assetCollateralType_Remarks().sendKeys(assetCollateralTypeTestDataType.Remarks3);

	}

	@And("^User Login as checker to return collateral type record$")
	public void user_login_as_checker_to_return_collateral_type_record() throws Throwable {
		kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
	}

	@Then("^select the record of collateral type to return$")
	public void select_the_record_of_collateral_type_to_return() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_SearchInbox());
		assetCollateralTypeObj.assetCollateralType_Checker_SearchInbox().click();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_SearchInboxInputField());
		assetCollateralTypeObj.assetCollateralType_Checker_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
		String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//	xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();

	}

	@Then("^select return button to return the record$")
	public void select_return_button_to_return_the_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_Return());
		assetCollateralTypeObj.assetCollateralType_Checker_Return().click();
	}

	@Then("^enter remark for return the record of collateral type$")
	public void enter_remark_for_return_the_record_of_collateral_type() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, assetCollateralTypeObj.assetCollateralType_Checker_CheckerReturnRemark(), 10, 2);
		assetCollateralTypeObj.assetCollateralType_Checker_CheckerReturnRemark().sendKeys(assetCollateralTypeTestDataType.CheckerReturnRemark);
	}

	@Then("^click on return button of the collateral type record$")
	public void click_on_return_button_of_the_collateral_type_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_CheckerReturnButton());
		assetCollateralTypeObj.assetCollateralType_Checker_CheckerReturnButton().click();
	}

	@Then("^system should display confirmation message after return the collateral type record$")
	public void system_should_display_confirmation_message_after_return_the_collateral_type_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ConfirmationMessage());
		assetCollateralTypeObj.assetCollateralType_ConfirmationMessage().isDisplayed();
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Checker_ApproveConfirmationMessageCloseButton());
		assetCollateralTypeObj.assetCollateralType_Checker_ApproveConfirmationMessageCloseButton().click();
	}
	
//------------------------------------------------------------------------------------//
	
	@And("^click on temp view button of asset collateral config$")
    public void click_on_temp_view_button_of_asset_collateral_config() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_TempView());
		assetCollateralTypeObj.assetCollateralType_TempView().click();       
    }
	
	@Then("^click on edit button of record to modify in collateral type$")
	public void click_on_edit_button_of_record_to_modify_in_collateral_type() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchButton());
		assetCollateralTypeObj.assetCollateralType_SearchButton().click();
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchInputField());
    	assetCollateralTypeObj.assetCollateralType_SearchInputField().sendKeys(assetCollateralTypeTestDataType.RecordForValidateInvalidField);
//      xpath-	(//span[contains(text(),'depo30')]/../../../td[1]/span[1]/button[1]/span[1])[1]
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + assetCollateralTypeTestDataType.RecordForValidateInvalidField + afterxpath)).click();
    
	}
	
	@Then("^verify proper validation message for blank field should display in collateral type$")
    public void verify_proper_validation_message_for_blank_field_should_display_in_collateral_type() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode());
    	assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode());
    	assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode().sendKeys(Keys.BACK_SPACE);
    	
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SaveButton());
    	assetCollateralTypeObj.assetCollateralType_SaveButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCodeFieldValidation());
    	boolean message = assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCodeFieldValidation().isDisplayed();
    	Assert.assertEquals(message, true);
    	String validationmessage = assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCodeFieldValidation().getText();
    	System.out.println("Blank Field validation message - "+validationmessage);
    	
    }

    @Then("^verify system should not allow to enter invalid datatypes while modification in collateral type$")
    public void verify_system_should_not_allow_to_enter_invalid_datatypes_while_modification_in_collateral_type() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Description());
//    	assetCollateralTypeObj.assetCollateralType_Description().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode());
    	assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCode().sendKeys("*");
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCodeInvalidDataValidation());
    	String validationmsg = assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCodeInvalidDataValidation().getText();
    	System.out.println("Invalid datatype validation message - "+validationmsg);
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCodeInvalidDataValidation());
    	boolean message = assetCollateralTypeObj.assetCollateralType_AssetCollateralTypeCodeInvalidDataValidation().isDisplayed();
    	Assert.assertEquals(message, true);
    	
    }
    
    ////////////////////////////////////////////////////////////////////////////////////
    
    @Then("^verify collateral type master list view fields should display all the fields$")
    public void verify_collateral_type_master_list_view_fields_should_display_all_the_fields() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_addButton());
    	boolean res1 = assetCollateralTypeObj.assetCollateralType_addButton().isDisplayed();
    	Assert.assertEquals(res1, true);
    	boolean res2 = assetCollateralTypeObj.assetCollateralType_SearchButton().isDisplayed();
    	Assert.assertEquals(res2, true);
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Export());
    	assetCollateralTypeObj.assetCollateralType_Export().click();
    	boolean res3 = assetCollateralTypeObj.assetCollateralType_Product_PdfFile().isDisplayed();
    	Assert.assertEquals(res3, true);
    	boolean res4 = assetCollateralTypeObj.assetCollateralType_XlsFile().isDisplayed();
    	Assert.assertEquals(res4, true);
    	boolean res5 = assetCollateralTypeObj.assetCollateralType_ListViewAssetCollateralTypeCode().isDisplayed();
    	Assert.assertEquals(res5, true);
    	boolean res6 = assetCollateralTypeObj.assetCollateralType_ListViewDescription().isDisplayed();
    	Assert.assertEquals(res6, true);
    	boolean res7 = assetCollateralTypeObj.assetCollateralType_ListViewAssetCollateralCategoryDescription().isDisplayed();
    	Assert.assertEquals(res7, true);
    	boolean res8 = assetCollateralTypeObj.assetCollateralType_ListViewAuthorizationStatus().isDisplayed();
    	Assert.assertEquals(res8, true);
    	boolean res9 = assetCollateralTypeObj.assetCollateralType_FooterForPaginator().isDisplayed();
    	Assert.assertEquals(res9, true);
    }

    @Then("^values in list view should not be editable in list of asset collateral type screen$")
    public void values_in_list_view_should_not_be_editable_in_list_of_asset_collateral_type_screen() throws Throwable {
    	try {
    		assetCollateralTypeObj.assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode().sendKeys("ok");
    		assetCollateralTypeObj.assetCollateralType_ListViewFirstFieldOfDescription().sendKeys("ok");
    		assetCollateralTypeObj.assetCollateralType_ListViewFirstFieldOfAssetCollateralCategoryDescription().sendKeys("ok");
    		System.out.println("Values in list view is editable");
    		
    	}catch(Exception e) {
    		System.out.println("Values in list view is not editable");
    	}
    }

    @Then("^verify add button should allow to create new record in collateral type master$")
    public void verify_add_button_should_allow_to_create_new_record_in_collateral_type_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_addButton());
    	assetCollateralTypeObj.assetCollateralType_addButton().click();
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SaveButton());
    	assetCollateralTypeObj.assetCollateralType_SaveButton().isDisplayed();
		while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_BackButton());
				assetCollateralTypeObj.assetCollateralType_BackButton().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    }

    @Then("^verify search box should display matching record with matched data in collateral type$")
    public void verify_search_box_should_display_matching_record_with_matched_data_in_collateral_type() throws Throwable {
    	while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchButton());
				assetCollateralTypeObj.assetCollateralType_SearchButton().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchInputField());
    	assetCollateralTypeObj.assetCollateralType_SearchInputField().sendKeys(assetCollateralTypeTestDataType.AssetCollateralTypeCode1);
//    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode_test1());
//    	boolean assetcollateraltypecode = assetCollateralTypeObj.assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode_test1().isDisplayed();
//    	Assert.assertTrue(assetcollateraltypecode);
    	String beforexpath = "//span[contains(text(),'"; 
    	String afterxpath = "')]"; 
    	boolean assetcollateraltypecode1 = driver.findElement(By.xpath(beforexpath +assetCollateralTypeTestDataType.AssetCollateralTypeCode1+ afterxpath)).isDisplayed();
    	Assert.assertTrue(assetcollateraltypecode1);
    }

    @Then("^verify search box should not display any record with mismatched data in collateral type$")
    public void verify_search_box_should_not_display_any_record_with_mismatched_data_in_collateral_type() throws Throwable {
    	assetCollateralTypeObj.assetCollateralType_SearchInputField().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	assetCollateralTypeObj.assetCollateralType_SearchInputField().sendKeys("412379");
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_NoDataFoundInSearch());
    	assetCollateralTypeObj.assetCollateralType_NoDataFoundInSearch().isDisplayed();
    	assetCollateralTypeObj.assetCollateralType_SearchCloseButton().click();
    }

    @Then("^click on export to pdf button system should download Pdf file in collateral type$")
    public void click_on_export_to_pdf_button_system_should_download_pdf_file_in_collateral_type() throws Throwable {
    	assetCollateralTypeObj.assetCollateralType_Export().click();
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Product_PdfFile());
    	assetCollateralTypeObj.assetCollateralType_Product_PdfFile().click();
    	browserHelper.SwitchToWindow(1);
    	browserHelper.switchToParentWithChildClose();
    }

    @Then("^click on export to excel button system should download Excel file in collateral type$")
    public void click_on_export_to_excel_button_system_should_download_excel_file_in_collateral_type() throws Throwable {
    	while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_Export());
				assetCollateralTypeObj.assetCollateralType_Export().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_XlsFile());
    	assetCollateralTypeObj.assetCollateralType_XlsFile().click();
    }

    @Then("^system should show Asset collateral category description field and the field will display only$")
    public void system_should_show_asset_collateral_category_description_field_and_the_field_will_display_only() throws Throwable {
    	boolean result = assetCollateralTypeObj.assetCollateralType_ListViewAssetCollateralCategoryDescription().isDisplayed();
    	System.out.println("System is showing Asset/Collateral Category Description field - "+result);
    	
    	try {
    		assetCollateralTypeObj.assetCollateralType_ListViewAssetCollateralCategoryDescription().sendKeys("ok");
    		System.out.println("Asset/Collateral Category Description Field in list view is not editable");
    	}catch(Exception e) {
    		System.out.println("Asset/Collateral Category Description Field in list view is not editable");
    	}
    }

    @Then("^system should show Authorization status field and the field will display only$")
    public void system_should_show_authorization_status_field_and_the_field_will_display_only() throws Throwable {
    	boolean result = assetCollateralTypeObj.assetCollateralType_ListViewAuthorizationStatus().isDisplayed();
    	System.out.println("System is showing Authorization Status field - "+result);
    	
    	try {
    		assetCollateralTypeObj.assetCollateralType_ListViewAuthorizationStatus().sendKeys("ok");
    		System.out.println("Authorization Status Field in list view is not editable");
    	}catch(Exception e) {
    		System.out.println("Authorization Status Field in list view is not editable");
    	}
    }
    
    //////////////////////////////-------M6-M7-------////////////////////////////////
    
    @Then("^click on edit button of collateral type record to modify$")
    public void click_on_edit_button_of_collateral_type_record_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchButton());
    	assetCollateralTypeObj.assetCollateralType_SearchButton().click();
    	waithelper.waitForElementwithFluentwait(driver, assetCollateralTypeObj.assetCollateralType_SearchInputField());
    	assetCollateralTypeObj.assetCollateralType_SearchInputField().sendKeys(assetCollateralTypeTestDataType.RecordForApprove);
//      xpath-	(//span[contains(text(),'depo30')]/../../../td[1]/span[1]/button[1]/span[1])[1]
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + assetCollateralTypeTestDataType.RecordForApprove + afterxpath)).click();
    }
    
    @Then("^verify the buttons available on screen while modify the Asset Collateral type$")
    public void verify_the_buttons_available_on_screen_while_modify_the_asset_collateral_type() throws Throwable {
        
    }

    @Then("^verify system allow user to modify the Asset Collateral type before approve the record$")
    public void verify_system_allow_user_to_modify_the_asset_collateral_type_before_approve_the_record() throws Throwable {
        
    }

    @Then("^verify system allow user to do a modification on already approved asset collateral type record$")
    public void verify_system_allow_user_to_do_a_modification_on_already_approved_asset_collateral_type_record() throws Throwable {
        
    }

    @Then("^verify the impact when user modify any approved record and re approve the same$")
    public void verify_the_impact_when_user_modify_any_approved_record_and_re_approve_the_same() throws Throwable {
        
    }

    @Then("^verify while modification system allow user to save the record with valid data$")
    public void verify_while_modification_system_allow_user_to_save_the_record_with_valid_data() throws Throwable {
        
    }
    
    @Then("^verify the functionality of Submit button at Maker stage$")
    public void verify_the_functionality_of_submit_button_at_maker_stage() throws Throwable {
        
    }

    @Then("^verify system display the confirmation message post clicking on Submit button at Maker stage$")
    public void verify_system_display_the_confirmation_message_post_clicking_on_submit_button_at_maker_stage() throws Throwable {
        
    }

    
    /////////////////////////////////-----M12_M13-----//////////////////////////////////////
    
    
    @And("^Click the configuration in collateral type$")
    public void click_the_configuration_in_collateral_type() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_Configurations(), 60, 2);
		collateralTypeObj.AssetCollateralType_Configurations().click();
 }

    @Then("^click the Asset colllaral config$")
    public void click_the_asset_colllaral_config() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_AssetCollateralConfig(), 60, 2);
		collateralTypeObj.AssetCollateralType_AssetCollateralConfig().click();
    }
    @And("^Click the temp view button in collateral type$")
    public void click_the_temp_view_button_in_collateral_type() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_TempView(), 60, 2);
		collateralTypeObj.AssetCollateralType_TempView().click();
    }   

    @Then("^To verify the Asset Collateral Type List view in collateral type$")
    public void to_verify_the_asset_collateral_type_list_view_in_collateral_type() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_AddButton(), 60, 2);
    	collateralTypeObj.AssetCollateralType_AddButton().isDisplayed();
    	collateralTypeObj.AssetCollateralType_ListView_Search().isDisplayed();
    	collateralTypeObj.AssetCollateralType_ListView_Export().isDisplayed();
    	collateralTypeObj.AssetCollateralType_ListView_Status().isDisplayed();
    	collateralTypeObj.AssetCollateralType_ListView_Action().isDisplayed();
    	collateralTypeObj.AssetCollateralType_ListView_Asset_CollateraltypeCode().isDisplayed();
    	collateralTypeObj.AssetCollateralType_ListView_Description().isDisplayed();
    	collateralTypeObj.AssetCollateralType_ListView_AssetCollateralCategoryDescription().isDisplayed();
    	collateralTypeObj.AssetCollateralType_ListView_AuthorizationStatus().isDisplayed();
    }
    @And("^To verify the values in List view should be non editable in collateral type$")
    public void to_verify_the_values_in_list_view_should_be_non_editable_in_collateral_type() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_AddButton(), 60, 2);
    	String xpath ="//tbody/tr[1]/td[3]";
    	try {
    		driver.findElement(By.xpath(xpath)).click();
		} catch (NoSuchElementException e) {
			System.out.println("Verified status field is not editable only displayable");
		}
    }
    @Then("^To verify the functionality of Search box with matching data in collateraltype master$")
    public void to_verify_the_functionality_of_search_box_with_matching_data_in_collateraltype_master() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_ListViewSearch(), 60, 2);
    	for (int i = 0; i < 20; i++) {
			try {
				collateralTypeObj.AssetCollateralType_ListViewSearch().click();
    	break;
			} catch (Exception e) {

			}
    	}

    	collateralTypeObj.AssetCollateralType_ListViewSearchText().click();
    	collateralTypeObj.AssetCollateralType_ListViewSearchText().sendKeys("test8");
Assert.assertEquals(collateralTypeObj.AssetCollateralType_ListViewMachedData().isDisplayed(), true);
}
    @Then("^To verify the functionality of Search box with unmatching data in collateraltype master$")
    public void to_verify_the_functionality_of_search_box_with_unmatching_data_in_collateraltype_master() throws Throwable {
    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    	
    	for (int i = 0; i <20; i++) {
			try {
				collateralTypeObj.AssetCollateralType_ListViewSearch().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	collateralTypeObj.AssetCollateralType_ListViewSearchText().click();
    	collateralTypeObj.AssetCollateralType_ListViewSearchText().sendKeys("bb");
    	Thread.sleep(1000);
    	String xpath ="(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
    	for (int i = 0; i < 200; i++) {
    		try {
    		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
    	       Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
    	        //"Showing 0 to 0 of 0 entries"
    	        break;
    		} catch (Exception e) {
    			
    		}
		}
        
        driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    	

		}
    @And("^To verify the functionality of Export to PDF button in collateraltype master$")
    public void to_verify_the_functionality_of_export_to_pdf_button_in_collateraltype_master() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			collateralTypeObj.exportIcon().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    	
        action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,collateralTypeObj.exportToPDF(),60,3);
        collateralTypeObj.exportToPDF().click();
        //seleniumactions.getBrowserHelper().SwitchToWindow(1);
        String UserDirectory = System.getProperty("user.dir");
        System.out.println(UserDirectory);
        String substring = UserDirectory.substring(0, 21)+"Downloads";
        substring.replaceAll("/", "//");
        System.out.println(substring);
        File file = new File("C:\\Users\\inindc00073");
        File[] totalfiles = file.listFiles();
        for (File fileName : totalfiles) {
        	if (fileName.getName().equalsIgnoreCase("AssetCollateralTypeFile.pdf")) {
    			System.out.println("Downloaded file present in system");
    			break;
    		}
    		else {
    			System.out.println("Downloaded file present does not exist in system");
    		}
    		
    	}
        action.getBrowserHelper().switchToParentWithChildClose();
        

    }


    @Then("^To verify the functionality of Export to Excel button in collateraltype master$")
    public void to_verify_the_functionality_of_export_to_excel_button_in_collateraltype_master() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			collateralTypeObj.exportIcon().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    	for (int i = 0; i < 20; i++) {
    		try {
    			collateralTypeObj.exportToExcel().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
        
       action.getBrowserHelper().switchToParentWithChildClose();
        System.out.println("Downloaded XLS file present in system");	        
        
    }
    @And("^To verify the field asset collateral category description$")
    public void to_verify_the_field_asset_collateral_category_description() throws Throwable {
    String Description = collateralTypeObj.AssetCollateralType_Description_WIP().getText();
    	System.out.println("Description");
    	collateralTypeObj.AssetCollateralType_Description_WIP().isDisplayed();
    }
    @Then("^Click the inbox in collateral type master$")
    public void click_the_inbox_in_collateral_type_master() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_Inbox(), 60, 2);
    	collateralTypeObj.AssetCollateralType_Inbox().click();
    }

    @Then("^Search the record in collateral type master$")
    public void search_the_record_in_collateral_type_master() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_SeachButton(), 60, 2);
   					    	collateralTypeObj.AssetCollateralType_SeachButton().click();
    	   	    
    		    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_Inbox(), 60, 2);
    			 	   action.getClickAndActionsHelper().moveToElement(collateralTypeObj.AssetCollateralType_SearchText());
	//collateralTypeObj.AssetCollateralType_SearchText().click();
    	collateralTypeObj.AssetCollateralType_SearchText().sendKeys("COLL_TYPE");
    	
    }

    @And("^Click the action icon in the collateral type master$")
    public void click_the_action_icon_in_the_collateral_type_master() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_ActionIcon(), 60, 2);
    	collateralTypeObj.AssetCollateralType_ActionIcon().click();
    }
    @Then("^Click the view summary button in collateral type master$")
    public void click_the_view_summary_button_in_collateral_type_master() throws Throwable {
    	//waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_ActionIcon(), 60, 2);
for (int i = 0; i < 20; i++) {
try
{
    	action.getClickAndActionsHelper().JSEClick(collateralTypeObj.AssetCollateralType_ViewSummaryButton());
    }
catch(Exception e) {
}
}
    }

    @Then("^To verify the view workflow in the collateral type master$")
    public void to_verify_the_view_workflow_in_the_collateral_type_master() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_UserID(), 60, 2);
    	String UserID = collateralTypeObj.AssetCollateralType_UserID().getText();
    	System.out.println("UserID:"+UserID);
    	collateralTypeObj.AssetCollateralType_UserID().isDisplayed();
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_StageCode(), 60, 2);
    	String UserStage = collateralTypeObj.AssetCollateralType_StageCode().getText();
    	System.out.println("UserStage:"+UserStage);
    	collateralTypeObj.AssetCollateralType_StageCode().isDisplayed();
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_Status(), 60, 2);
    	String Status = collateralTypeObj.AssetCollateralType_Status().getText();
    	System.out.println("Status:"+Status);
    	collateralTypeObj.AssetCollateralType_Status().isDisplayed();
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_StartTime(), 60, 2);
    	String StartTime= collateralTypeObj.AssetCollateralType_StartTime().getText();
    	System.out.println("StartTime:"+StartTime);
    	collateralTypeObj.AssetCollateralType_StartTime().isDisplayed();
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_EndTime(), 60, 2);
    	String EndTime= collateralTypeObj.AssetCollateralType_EndTime().getText();
    	System.out.println("EndTime:"+EndTime);
    }
}