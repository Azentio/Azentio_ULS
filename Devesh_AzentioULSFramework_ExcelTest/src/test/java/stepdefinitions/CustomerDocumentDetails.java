package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CustomerDocumentDetailsObj;
import pageobjects.KULS_LoginObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.CustomerDocumentDetailsTestDataType;
import testDataType.KULS_Login_TestDataType;

public class CustomerDocumentDetails {

	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Login_TestDataType ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	String referenceID;
	BrowserHelper browserHelper = new BrowserHelper(driver);
	CustomerDocumentDetailsObj documentDetailsObj = new CustomerDocumentDetailsObj(driver);
	CustomerDocumentDetailsTestDataType documentDetailsTestDataType = jsonConfig.getCustomerDocumentDetailsByName("Maker");
	SoftAssert softAssert = new SoftAssert();
	
	@Then("^user should click on the menu toggle in login page$")
    public void user_should_click_on_the_menu_toggle_in_login_page() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_Maker_MenuToggle());
		documentDetailsObj.customerDocumentDetails_Maker_MenuToggle().click();
    }

    @Then("^click on inbox to search for the Customer Document Details record$")
    public void click_on_inbox_to_search_for_the_Customer_Document_Details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_Inbox());
    	documentDetailsObj.customerDocumentDetails_Inbox().click();
    }

    @Then("^click on search button to search the record of Customer Document Details in inbox$")
    public void click_on_search_button_to_search_the_record_of_Customer_Document_Details_in_inbox() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchInbox());
    	documentDetailsObj.customerDocumentDetails_SearchInbox().click();
    }

    @Then("^enter the reference id of the Customer Document Details record$")
    public void enter_the_reference_id_of_the_Customer_Document_Details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchInboxInputField());
    	documentDetailsObj.customerDocumentDetails_SearchInboxInputField().sendKeys(documentDetailsTestDataType.ReferenceID);
	
    }

    @Then("^click on the entitle button of the Customer Document Details record of that reference id$")
    public void click_on_the_entitle_button_of_the_Customer_Document_Details_record_of_that_reference_id() throws Throwable {
    	String beforexpath= "//span[contains(text(),'";
		String afterxpath= "')]/../../td/button";
		Thread.sleep(500);
		while(true) {
			try {
				driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    }

    @Then("^click on the Document Details tab$")
    public void click_on_the_document_details_tab() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_DocumentDetailTab());
		documentDetailsObj.customerDocumentDetails_DocumentDetailTab().click();
    }
    
    @Then("^open the record of Customer Document Details to modify$")
    public void open_the_record_of_Customer_Document_Details_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchButton());
    	documentDetailsObj.customerDocumentDetails_SearchButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchInputField());
    	documentDetailsObj.customerDocumentDetails_SearchInputField().sendKeys(documentDetailsTestDataType.Number);
    	String beforexpath= "//span[contains(text(),'"; 
    	String afterxpath= "')]/../../../td[1]/span/button[1]";
    	Thread.sleep(500);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +documentDetailsTestDataType.Number+ afterxpath)));
    	driver.findElement(By.xpath(beforexpath +documentDetailsTestDataType.Number+ afterxpath)).click();
    }
    

    @Then("^verify system should allow user to do a modification of Customer Document Details record before approved$")
    public void verify_system_should_allow_user_to_do_a_modification_of_Customer_Document_Details_record_before_approved() throws Throwable {
    	RadioButtonHelper radioButtonHelper = new  RadioButtonHelper(driver);
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_DocumentName());
    	documentDetailsObj.customerDocumentDetails_DocumentName().click();
    	radioButtonHelper.radioButton(documentDetailsTestDataType.DocumentName);
    	Thread.sleep(500);
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_MandatoryOrOptional());
    	documentDetailsObj.customerDocumentDetails_MandatoryOrOptional().click();
    	radioButtonHelper.radioButton(documentDetailsTestDataType.MandatoryOrOptional);
    	Thread.sleep(500);
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_DocumentCategory());
    	documentDetailsObj.customerDocumentDetails_DocumentCategory().click();
    	String beforexpath = "//ion-label[text()='";
    	String afterxpath = "']/../ion-radio";
    	Thread.sleep(500);
    	driver.findElement(By.xpath(beforexpath+ documentDetailsTestDataType.DocumentCategory + afterxpath)).click();
    }
    
    @Then("^verify system should allow user to do a modification with valid data$")
    public void verify_system_should_allow_user_to_do_a_modification_with_valid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SaveButton());
    	documentDetailsObj.customerDocumentDetails_SaveButton().click();
    }

    @Then("^verify system display the confirmation message post clicking on save button of Customer Document Details record$")
    public void verify_system_display_the_confirmation_message_post_clicking_on_save_button_of_Customer_Document_Details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SaveConfirmationMessage());
    	boolean status = documentDetailsObj.customerDocumentDetails_SaveConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    }
    
    @And("^verify the same record of Customer Document Details should get saved in a system$")
    public void verify_the_same_record_of_customer_document_details_should_get_saved_in_a_system() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchButton());
    	documentDetailsObj.customerDocumentDetails_SearchButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchInputField());
    	documentDetailsObj.customerDocumentDetails_SearchInputField().sendKeys(documentDetailsTestDataType.Number);
    	String beforexpath= "//span[contains(text(),'"; 
    	String afterxpath= "')]/../../../td[1]/span/button[1]";
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +documentDetailsTestDataType.Number+ afterxpath)));
    	boolean status = driver.findElement(By.xpath(beforexpath +documentDetailsTestDataType.Number+ afterxpath)).isDisplayed();
    	Assert.assertTrue(status);
    }
    
    @Then("^verify the functionality of Back button of Customer Document Details record$")
    public void verify_the_functionality_of_back_button_of_customer_document_details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_AddButton());
    	documentDetailsObj.customerDocumentDetails_AddButton().click();
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_BackButton());
    	documentDetailsObj.customerDocumentDetails_BackButton().click();
    	boolean status = documentDetailsObj.customerDocumentDetails_DocumentDetailsScreen().isDisplayed();
    	Assert.assertTrue(status);
    }
    
    @Then("^verify system should display the mention fields on List view of Customer Documents details$")
    public void verify_system_should_display_the_mention_fields_on_list_view_of_customer_documents_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_AddButton());
    	boolean status1 = documentDetailsObj.customerDocumentDetails_AddButton().isDisplayed();
    	Assert.assertTrue(status1);
    	boolean status2 = documentDetailsObj.customerDocumentDetails_ListViewBackButton().isDisplayed();
    	Assert.assertTrue(status2);
    	boolean status3 = documentDetailsObj.customerDocumentDetails_SearchButton().isDisplayed();
    	Assert.assertTrue(status3);
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_ExportButton());
    	documentDetailsObj.customerDocumentDetails_ExportButton().click();
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_ExportToPDF());
    	boolean status4 = documentDetailsObj.customerDocumentDetails_ExportToPDF().isDisplayed();
    	Assert.assertTrue(status4);
    	boolean status5 = documentDetailsObj.customerDocumentDetails_ExportToXls().isDisplayed();
    	Assert.assertTrue(status5);
    	boolean status6 = documentDetailsObj.customerDocumentDetails_ListViewFieldNumber().isDisplayed();
    	Assert.assertTrue(status6);
    	boolean status7 = documentDetailsObj.customerDocumentDetails_ListViewFieldDocumentName().isDisplayed();
    	Assert.assertTrue(status7);
    	boolean status8 = documentDetailsObj.customerDocumentDetails_ListViewFieldRequiredAtStage().isDisplayed();
    	Assert.assertTrue(status8);
    	boolean status9 = documentDetailsObj.customerDocumentDetails_ListViewFieldDocumentStatus().isDisplayed();
    	Assert.assertTrue(status9);
    	boolean status10 = documentDetailsObj.customerDocumentDetails_ListViewFieldMandatoryOrOptional().isDisplayed();
    	Assert.assertTrue(status10);
    	boolean status11 = documentDetailsObj.customerDocumentDetails_ListViewFieldDocumentCategory().isDisplayed();
    	Assert.assertTrue(status11);
    	boolean status12 = documentDetailsObj.customerDocumentDetails_ListViewFieldDMSUploadStatus().isDisplayed();
    	Assert.assertTrue(status12);
    	
    }

    @Then("^verify values in List view of Customer Documents details should be non editable$")
    public void verify_values_in_list_view_of_customer_documents_details_should_be_non_editable() throws Throwable {
    	try {
    		documentDetailsObj.customerDocumentDetails_ListViewNumberValue().sendKeys(documentDetailsTestDataType.EditText);
			System.out.println("Number Field value is editable");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Number Field value is non editable");
		}
    	try {
    		documentDetailsObj.customerDocumentDetails_ListViewDocumentNameValue().sendKeys(documentDetailsTestDataType.EditText);
    		System.out.println("DocumentName Field value is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("DocumentName Field value is non editable");
    	}
    	try {
    		documentDetailsObj.customerDocumentDetails_ListViewRequiredAtStageValue().sendKeys(documentDetailsTestDataType.EditText);
    		System.out.println("RequiredAtStage Field value is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("RequiredAtStage Field value is non editable");
    	}
    	try {
    		documentDetailsObj.customerDocumentDetails_ListViewDocumentStatusValue().sendKeys(documentDetailsTestDataType.EditText);
    		System.out.println("DocumentStatus Field value is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("DocumentStatus Field value is non editable");
    	}
    	try {
    		documentDetailsObj.customerDocumentDetails_ListViewMandatoryOrOptionalValue().sendKeys(documentDetailsTestDataType.EditText);
    		System.out.println("MandatoryOrOptional Field value is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("MandatoryOrOptional Field value is non editable");
    	}
    	try {
    		documentDetailsObj.customerDocumentDetails_ListViewDocumentCategoryValue().sendKeys(documentDetailsTestDataType.EditText);
    		System.out.println("DocumentCategory Field value is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("DocumentCategory Field value is non editable");
    	}
    	try {
    		documentDetailsObj.customerDocumentDetails_ListViewDMSUploadStatusValue().sendKeys(documentDetailsTestDataType.EditText);
    		System.out.println("DMSUploadStatus Field value is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("DMSUploadStatus Field value is non editable");
    	}
    	
    }

    @Then("^verify search box should display matching record with matched data of Customer Documents details$")
    public void verify_search_box_should_display_matching_record_with_matched_data_of_customer_documents_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchButton());
    	documentDetailsObj.customerDocumentDetails_SearchButton().click();
    	Thread.sleep(1000);
    	documentDetailsObj.customerDocumentDetails_SearchInputField().sendKeys(documentDetailsTestDataType.Number);
    	boolean status = documentDetailsObj.customerDocumentDetails_ListViewNumberValue().isDisplayed();
    	Assert.assertTrue(status);
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchCloseButton());
    	documentDetailsObj.customerDocumentDetails_SearchCloseButton().click();
    	
    }

    @Then("^verify search box should not display any record with mismatched data of Customer Documents details$")
    public void verify_search_box_should_not_display_any_record_with_mismatched_data_of_customer_documents_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_SearchButton());
    	documentDetailsObj.customerDocumentDetails_SearchButton().click();
    	Thread.sleep(1000);
    	documentDetailsObj.customerDocumentDetails_SearchInputField().sendKeys(documentDetailsTestDataType.InvalidInput);
    	Thread.sleep(500);
    	boolean status = documentDetailsObj.customerDocumentDetails_NoDataFoundInSearch().isDisplayed();
    	Assert.assertTrue(status);
    }

    @Then("^click on export to excel button system should download Excel file of Customer Documents details$")
    public void click_on_export_to_excel_button_system_should_download_excel_file_of_customer_documents_details() throws Throwable {
    	for (int i = 0; i < 20; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_ExportButton());
				documentDetailsObj.customerDocumentDetails_ExportButton().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_ExportToXls());
    	documentDetailsObj.customerDocumentDetails_ExportToXls().click();
    }

    @Then("^click on export to pdf button system should download Pdf file of Customer Documents details$")
    public void click_on_export_to_pdf_button_system_should_download_pdf_file_of_customer_documents_details() throws Throwable {
    	for (int i = 0; i < 20; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_ExportButton());
				documentDetailsObj.customerDocumentDetails_ExportButton().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_ExportToPDF());
				documentDetailsObj.customerDocumentDetails_ExportToPDF().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
    	browserHelper.SwitchToWindow(1);
    	browserHelper.switchToParentWithChildClose();
    }

    @Then("^verify the functionality of Add button of Customer Documents details list view screen$")
    public void verify_the_functionality_of_add_button_of_customer_documents_details_list_view_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_AddButton());
    	documentDetailsObj.customerDocumentDetails_AddButton().click();
    	waithelper.waitForElementwithFluentwait(driver, documentDetailsObj.customerDocumentDetails_BackButton());
    	documentDetailsObj.customerDocumentDetails_BackButton().click();
    	
    }
    
    
}