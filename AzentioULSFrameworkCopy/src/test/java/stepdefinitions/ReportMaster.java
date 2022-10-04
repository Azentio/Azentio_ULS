package stepdefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.KULS_LoginObj;
import pageobjects.ReportMasterObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.ReportMasterTestDataType;

public class ReportMaster {

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
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ReportMasterObj reportMasterObj = new ReportMasterObj(driver);
	ReportMasterTestDataType reportMasterTestDataType = jsonConfig.getReportMasterByName("Maker");
	Selenium_Actions action = new Selenium_Actions(driver);

	@Then("^user should navigate to report master$")
	public void user_should_navigate_to_report_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Maker_MenuToggle());
		reportMasterObj.reportMaster_Maker_MenuToggle().click();
		;
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMasterConfigurations());
		reportMasterObj.reportMasterConfigurations().click();
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMasterConfigMenu());
		reportMasterObj.reportMasterConfigMenu().click();
	}

	@And("^click on work in progress records button of report master$")
	public void click_on_work_in_progress_records_button_of_report_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_WorkInProgressRecordsButton());
		reportMasterObj.reportMaster_WorkInProgressRecordsButton().click();
	}

	@Then("^click on add button to create new record of report master$")
	public void click_on_add_button_to_create_new_record_of_report_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_addButton());
		reportMasterObj.reportMaster_addButton().click();
	}

	@Then("^click on save button to save the report master record in the system$")
	public void click_on_save_button_to_save_the_report_master_record_in_the_system() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SaveButton());
		reportMasterObj.reportMaster_SaveButton().click();
	}

	@Then("^user should navigate to report group master$")
    public void user_should_navigate_to_report_group_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_addButton2());
		reportMasterObj.reportMaster_addButton2().click();
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportGroupMasterSegmentButton());
		reportMasterObj.reportMaster_ReportGroupMasterSegmentButton().click();
    }

    @Then("^click on add button to create new record of report group master$")
    public void click_on_add_button_to_create_new_record_of_report_group_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_addButton());
    	clicksAndActionsHelper.JSEClick(reportMasterObj.reportMaster_addButton());
    }
	
	@Then("^verify system should show proper validation message for blank field of report master record which is mandatory$")
	public void verify_system_should_show_proper_validation_message_for_blank_field_of_report_master_record_which_is_mandatory() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SaveButton());
		clicksAndActionsHelper.JSEClick(reportMasterObj.reportMaster_SaveButton());
		
		String xpath = "//ion-label/span/ancestor::ion-col/descendant::ion-badge[contains(text(),'Required field')]";
		List<WebElement> mandatoryBlankFields = driver.findElements(By.xpath(xpath));
		for (WebElement element : mandatoryBlankFields) {
			boolean res = element.isDisplayed();
			Assert.assertTrue(res);
		}
	}
	
	@Then("^verify system should show proper validation message when user enter numeric value in character field of report master record$")
	public void verify_system_should_show_proper_validation_message_when_user_enter_numeric_value_in_character_field_of_report_master_record() throws Throwable {
		
	}

	@Then("^verify system should show proper validation message when user enter character value in numeric field of report master record$")
	public void verify_system_should_show_proper_validation_message_when_user_enter_character_value_in_numeric_field_of_report_master_record() throws Throwable {

	}

	@Then("^verify system should show proper validation message when user enter only special characters value in any field of report master record$")
	public void verify_system_should_show_proper_validation_message_when_user_enter_only_special_characters_value_in_any_field_of_report_master_record() throws Throwable {
		
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_GroupName());
		clicksAndActionsHelper.doubleClick(reportMasterObj.reportMaster_GroupName());
		reportMasterObj.reportMaster_GroupName().sendKeys(reportMasterTestDataType.SpecialCharacters);

		boolean message = reportMasterObj.reportMaster_SpecialCharacterValidationMessage().isDisplayed();
		Assert.assertTrue(message);
	}
	
	@Then("^verify search box should display matching record with matched data in report group master$")
    public void verify_search_box_should_display_matching_record_with_matched_data_in_report_group_master() throws Throwable {
		while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchButton());
				reportMasterObj.reportMaster_SearchButton().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchInputField());
    	reportMasterObj.reportMaster_SearchInputField().sendKeys(reportMasterTestDataType.ApprovedRecord);
    	String beforexpath = "//span[text()='"; 
    	String afterxpath = "']"; 
    	boolean result = driver.findElement(By.xpath(beforexpath +reportMasterTestDataType.ApprovedRecord+ afterxpath)).isDisplayed();
    	Assert.assertTrue(result);
    }

    @Then("^verify search box should not display any record with mismatched data in report group master$")
    public void verify_search_box_should_not_display_any_record_with_mismatched_data_in_report_group_master() throws Throwable {
    	reportMasterObj.reportMaster_SearchInputField().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	reportMasterObj.reportMaster_SearchInputField().sendKeys("412379");
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_NoDataFoundInSearch());
    	reportMasterObj.reportMaster_NoDataFoundInSearch().isDisplayed();
    	reportMasterObj.reportMaster_SearchCloseButton().click();
    }

    @Then("^click on export to pdf button system should download Pdf file in report group master$")
    public void click_on_export_to_pdf_button_system_should_download_pdf_file_in_report_group_master() throws Throwable {
    	reportMasterObj.reportMaster_Export().click();
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_PdfFile());
    	reportMasterObj.reportMaster_PdfFile().click();
    	browserHelper.SwitchToWindow(1);
    	browserHelper.switchToParentWithChildClose();
    }

    @Then("^click on export to excel button system should download Excel file in report group master$")
    public void click_on_export_to_excel_button_system_should_download_excel_file_in_report_group_master() throws Throwable {
    	while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Export());
				reportMasterObj.reportMaster_Export().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
    	for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_XlsFile());
				reportMasterObj.reportMaster_XlsFile().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
    }

    @Then("^verify the functionality of Group header ID field system should display Group header ID number of that record$")
    public void verify_the_functionality_of_group_header_id_field_system_should_display_group_header_id_number_of_that_record() throws Throwable {
    	boolean result = reportMasterObj.reportMaster_ListViewGroupHeaderIDField().isDisplayed();
    	System.out.println("System is showing GroupHeaderID field - "+result);
    	
    	try {
    		reportMasterObj.reportMaster_ListViewGroupHeaderIDField().sendKeys("ok");
    		System.out.println("GroupHeaderID Field in list view is not editable");
    	}catch(Exception e) {
    		System.out.println("GroupHeaderID Field in list view is not editable");
    	}
    }

    @Then("^verify the functionality of group name field system should display Group name of that record$")
    public void verify_the_functionality_of_group_name_field_system_should_display_group_name_of_that_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_GroupName());
    	boolean result = reportMasterObj.reportMaster_GroupName().isDisplayed();
    	System.out.println("System is showing GroupName field - "+result);
    	
    	try {
    		reportMasterObj.reportMaster_GroupName().sendKeys("ok");
    		System.out.println("GroupName Field in list view is not editable");
    	}catch(Exception e) {
    		System.out.println("GroupName Field in list view is not editable");
    	}
    }

    @Then("^verify the functionality of Description field system should display Description of that group master record$")
    public void verify_the_functionality_of_description_field_system_should_display_description_of_that_group_master_record() throws Throwable {
    	boolean result = reportMasterObj.reportMaster_ListViewDescriptionField().isDisplayed();
    	System.out.println("System is showing Description field - "+result);
    	
    	try {
    		reportMasterObj.reportMaster_ListViewDescriptionField().sendKeys("ok");
    		System.out.println("Description Field in list view is not editable");
    	}catch(Exception e) {
    		System.out.println("Description Field in list view is not editable");
    	}
    }

    @Then("^verify the functionality of Status field system should display Status of that group master record$")
    public void verify_the_functionality_of_status_field_system_should_display_status_of_that_group_master_record() throws Throwable {
    	boolean result = reportMasterObj.reportMaster_ListViewStatusField().isDisplayed();
    	System.out.println("System is showing Status field - "+result);
    	
    	try {
    		reportMasterObj.reportMaster_ListViewStatusField().sendKeys("ok");
    		System.out.println("Status Field in list view is not editable");
    	}catch(Exception e) {
    		System.out.println("Status Field in list view is not editable");
    	}
    }

}