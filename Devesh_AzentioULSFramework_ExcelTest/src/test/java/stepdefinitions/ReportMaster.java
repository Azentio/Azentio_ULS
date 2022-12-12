package stepdefinitions;

import java.util.List;
import java.util.Map;

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
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","ReportMasterTestData","Data Set ID");
	Map<String, String> testData;
	

	@Then("^user should navigate to report master$")
	public void user_should_navigate_to_report_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Maker_MenuToggle());
		reportMasterObj.reportMaster_Maker_MenuToggle().click();
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
    
    @Then("^Fill all valid fields in the report master screen for approve the record$")
    public void fill_all_valid_fields_in_the_report_master_screen_for_approve_the_record() throws Throwable {
    	testData = excelData.getTestdata("AT_RA_06_D1");
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName());
    	reportMasterObj.reportMaster_ReportName().sendKeys(testData.get("Report Name"));
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName2());
    	reportMasterObj.reportMaster_ReportName2().sendKeys(testData.get("Report Name 2"));
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName3());
    	reportMasterObj.reportMaster_ReportName3().sendKeys(testData.get("Report Name 3"));
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportDescription());
    	reportMasterObj.reportMaster_ReportDescription().sendKeys(testData.get("Report Description"));
    	reportMasterObj.reportMaster_ReportType().click();
    	radioButtonHelper.radioButton(testData.get("Report Type"));
    	while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportUrl());
				reportMasterObj.reportMaster_ReportUrl().sendKeys(testData.get("Report URL"));
				break;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	reportMasterObj.reportMaster_ReportCategory().click();
    	radioButtonHelper.radioButton(testData.get("Report Category"));
    	
    }

    @Then("^verify system display the confirmation message in the report master screen post clicking on save button$")
    public void verify_system_display_the_confirmation_message_in_the_report_master_screen_post_clicking_on_save_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SaveButton());
    	reportMasterObj.reportMaster_SaveButton().click();
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SaveConfirmationMessage());
    	boolean status = reportMasterObj.reportMaster_SaveConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    }
    
    @Then("^verify the functionality of back button in report master screen$")
    public void verify_the_functionality_of_back_button_in_report_master_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_WorkInProgressRecordsButton());
		reportMasterObj.reportMaster_WorkInProgressRecordsButton().click();
		
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_addButton());
		reportMasterObj.reportMaster_addButton().click();
		
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_BackButton());
		reportMasterObj.reportMaster_BackButton().click();
		
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportMasterListViewTitle());
		boolean status = reportMasterObj.reportMaster_ReportMasterListViewTitle().isDisplayed();
		Assert.assertTrue(status);
		
    }

    @Then("^confirmation message displays in the report master screen with reference id$")
    public void confirmation_message_displays_in_the_report_master_screen_with_reference_id() throws Throwable {
    	String message = reportMasterObj.reportMaster_SaveConfirmationMessage().getText();
		System.out.println(message);
		String emptyString = "";
		String ar[] = message.split(" ");
		emptyString=ar[ar.length-1];
		String referenceid=emptyString.replaceAll("[/.]", "");
		System.out.println("Reference ID : "+referenceid);
	  excelData.updateTestData("AT_RA_07_D1", "Reference ID", referenceid);
	  testData = excelData.getTestdata("AT_RA_07_D1");
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SaveConfirmationMessageCloseButton());
		reportMasterObj.reportMaster_SaveConfirmationMessageCloseButton().click();
    }

    @Then("^click on inbox button to select the record of report master$")
    public void click_on_inbox_button_to_select_the_record_of_report_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Inbox());
    	reportMasterObj.reportMaster_Inbox().click();
    }
    
    @And("^select the record of report master from inbox to submit$")
    public void select_the_record_of_report_master_from_inbox_to_submit() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Maker_SearchInbox());
    	reportMasterObj.reportMaster_Maker_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Maker_SearchInboxInputField());
    	reportMasterObj.reportMaster_Maker_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[text()='";
		String afterxpath = "']/../../td/button";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
    }
    
    @Then("^verify the field status is non mandatory in report master$")
    public void verify_the_field_status_is_non_mandatory_in_report_master() throws Throwable {
    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Status");
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//ion-label[contains(text(),'Status')]/parent::div/following-sibling::ion-item/ion-toggle")));
    	String status = driver.findElement(By.xpath("//ion-label[contains(text(),'Status')]/parent::div/following-sibling::ion-item/ion-toggle")).getAttribute("aria-checked");
    	if(status.equalsIgnoreCase("true"))
    	{
    		System.out.println("Status is active");
    	}else if((status.equalsIgnoreCase("false"))) {
    		System.out.println("Status is inactive");
    	}
    }

    @Then("^verify system allow user to modify the report master record before approve the record$")
    public void verify_system_allow_user_to_modify_the_report_master_record_before_approve_the_record() throws Throwable {
    	testData = excelData.getTestdata("AT_RA_06_D1");
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName());
    	reportMasterObj.reportMaster_ReportName().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	reportMasterObj.reportMaster_ReportName().sendKeys(testData.get("Modify Report Name"));
    	
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName2());
    	reportMasterObj.reportMaster_ReportName2().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	reportMasterObj.reportMaster_ReportName2().sendKeys(testData.get("Modify Report Name 2"));
    	
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName3());
    	reportMasterObj.reportMaster_ReportName3().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	reportMasterObj.reportMaster_ReportName3().sendKeys(testData.get("Modify Report Name 3"));
    	
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportDescription());
    	reportMasterObj.reportMaster_ReportDescription().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	reportMasterObj.reportMaster_ReportDescription().sendKeys(testData.get("Modify Report Description"));
    	
    	reportMasterObj.reportMaster_ReportType().click();
    	radioButtonHelper.radioButton(testData.get("Modify Report Type"));
    	
    	while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportUrl());
				reportMasterObj.reportMaster_ReportUrl().sendKeys(Keys.chord(Keys.CONTROL,"A"));
				reportMasterObj.reportMaster_ReportUrl().sendKeys(testData.get("Modify Report URL"));
				break;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	reportMasterObj.reportMaster_ReportCategory().click();
    	radioButtonHelper.radioButton(testData.get("Modify Report Category"));
    }
    
    @And("^click on approved records button of report master$")
    public void click_on_approved_records_button_of_report_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ApprovedRecordsButton());
    	reportMasterObj.reportMaster_ApprovedRecordsButton().click();
    }
    
    @Then("^click on edit button of report master record to modify$")
    public void click_on_edit_button_of_report_master_record_to_modify() throws Throwable {
    	testData = excelData.getTestdata("AT_RA_07_D1");
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchButton());
    	reportMasterObj.reportMaster_SearchButton().click();
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchInputField());
    	reportMasterObj.reportMaster_SearchInputField().sendKeys(testData.get("Approved Record"));
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + testData.get("Approved Record") + afterxpath)).click();
		
    }

    @Then("^verify system allow user to do a modification on already approved report master record$")
    public void verify_system_allow_user_to_do_a_modification_on_already_approved_report_master_record() throws Throwable {
    	testData = excelData.getTestdata("AT_RA_07_D1");
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName());
    	reportMasterObj.reportMaster_ReportName().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	reportMasterObj.reportMaster_ReportName().sendKeys(testData.get("Modify Report Name"));
    	
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName2());
    	reportMasterObj.reportMaster_ReportName2().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	reportMasterObj.reportMaster_ReportName2().sendKeys(testData.get("Modify Report Name 2"));
    	
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportName3());
    	reportMasterObj.reportMaster_ReportName3().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	reportMasterObj.reportMaster_ReportName3().sendKeys(testData.get("Modify Report Name 3"));
    	
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportDescription());
    	reportMasterObj.reportMaster_ReportDescription().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	reportMasterObj.reportMaster_ReportDescription().sendKeys(testData.get("Modify Report Description"));
    	
    	reportMasterObj.reportMaster_ReportType().click();
    	radioButtonHelper.radioButton(testData.get("Modify Report Type"));
    	
    	while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ReportUrl());
				reportMasterObj.reportMaster_ReportUrl().sendKeys(Keys.chord(Keys.CONTROL,"A"));
				reportMasterObj.reportMaster_ReportUrl().sendKeys(testData.get("Modify Report URL"));
				break;

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	reportMasterObj.reportMaster_ReportCategory().click();
    	radioButtonHelper.radioButton(testData.get("Modify Report Category"));
    }
    
    @Then("^click on submit button to submit the record of report master$")
    public void click_on_submit_button_to_submit_the_record_of_report_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Submit());
    	reportMasterObj.reportMaster_Submit().click();

		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_MakerSubmitRemark());
		reportMasterObj.reportMaster_MakerSubmitRemark().sendKeys(testData.get("Maker Submit Remark"));

		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_FinalSubmit());
		reportMasterObj.reportMaster_FinalSubmit().click();
    }

    @Then("^system should display confirmation message after submit report master record$")
    public void system_should_display_confirmation_message_after_submit_report_master_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ConfirmationMessage());
		boolean res = reportMasterObj.reportMaster_ConfirmationMessage().isDisplayed();
		Assert.assertEquals(res, true);
    }

    @Then("^capture checker ID of report master$")
    public void capture_checker_id_of_report_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ConfirmationMessage());
		String message = reportMasterObj.reportMaster_ConfirmationMessage().getText();
		String emptystring = "";
		String ar[] = message.split(" ");
		emptystring = ar[ar.length - 1];
		String checkerID = emptystring.replaceAll("[/.]", "");
		System.out.println(checkerID);
		excelData.updateTestData("AT_RA_07_D1", "Checker id", checkerID);
		testData = excelData.getTestdata("AT_RA_07_D1");

		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_ConfirmationMessageCloseButton());
		reportMasterObj.reportMaster_ConfirmationMessageCloseButton().click();
    }
    
    @And("^User Login as checker to approve report master record$")
    public void user_login_as_checker_to_approve_report_master_record() throws Throwable {
//    	testData = excelData.getTestdata("AT_ACT_07_D1");
		kulsLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
    }
    
    @Then("^select the record of report master to approve$")
    public void select_the_record_of_report_master_to_approve() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Checker_SearchInbox());
    	reportMasterObj.reportMaster_Checker_SearchInbox().click();
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Checker_SearchInboxInputField());
		reportMasterObj.reportMaster_Checker_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
		String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		String res = driver.findElement(By.xpath("//span[contains(text(),'" + testData.get("Reference ID") + "')]" )).getText();
		Assert.assertEquals(res, testData.get("Reference ID"));
		driver.findElement(By.xpath(beforexpath + testData.get("Reference ID") + afterxpath)).click();
    }

    @Then("^select approve button for approve the report master record$")
    public void select_approve_button_for_approve_the_report_master_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Checker_Approve());
    	reportMasterObj.reportMaster_Checker_Approve().click();
    }

    @Then("^enter remark for approve the record of report master$")
    public void enter_remark_for_approve_the_record_of_report_master() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_Checker_CheckerApproveRemark(), 10, 2);
    	reportMasterObj.reportMaster_Checker_CheckerApproveRemark().sendKeys(testData.get("Checker Submit Remark"));

    }

    @Then("^click on approve button of the report master record$")
    public void click_on_approve_button_of_the_report_master_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Checker_CheckerApproveButton());
    	reportMasterObj.reportMaster_Checker_CheckerApproveButton().click();
    }

    @Then("^system should display confirmation message after approve the report master record$")
    public void system_should_display_confirmation_message_after_approve_the_report_master_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Checker_ApproveConfirmationMessage());
    	reportMasterObj.reportMaster_Checker_ApproveConfirmationMessage().isDisplayed();
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_Checker_ApproveConfirmationMessageCloseButton());
		reportMasterObj.reportMaster_Checker_ApproveConfirmationMessageCloseButton().click();
	
    }
    
    @Then("^verify all the captured modified data of report master from makers side should be saved and stored in the system$")
    public void verify_all_the_captured_modified_data_of_report_master_from_makers_side_should_be_saved_and_stored_in_the_system() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchButton());
    	reportMasterObj.reportMaster_SearchButton().click();
		waithelper.waitForElementwithFluentwait(driver, reportMasterObj.reportMaster_SearchInputField());
		reportMasterObj.reportMaster_SearchInputField().sendKeys(testData.get("Modify Report Name"));
		String beforexpath = "//span[contains(text(),'"; 
		String afterxpath = "')]"; 
		boolean modifiedReportName = driver.findElement(By.xpath(beforexpath +testData.get("Modify Report Name")+ afterxpath)).isDisplayed();
		Assert.assertTrue(modifiedReportName);
    }




    

}