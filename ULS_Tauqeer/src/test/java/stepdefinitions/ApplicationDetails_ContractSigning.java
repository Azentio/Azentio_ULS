package stepdefinitions;

import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class ApplicationDetails_ContractSigning {

	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	// JSPaths applicationDetailsJsPaths = new JSPaths(excelPath,
	// "ApplicationDetails_Elements",
	// "Application_Details_FieldName", "JSPath");
	JSPaths docDetails_ContractSigningJsPaths = new JSPaths(excelPath, "DocDetails_ContSign_Elements",
			"DocDetails_FieldName", "JSPath");

	// ApplicationDetailsPageObj appObj = new ApplicationDetailsPageObj(driver);
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	// ExcelData applicationDetailsExcelData = new ExcelData(excelTestDataPath,
	// "ApplicationDetails_TestData","DataSet ID");
	ExcelData docDetails_ContractSigning_TestData = new ExcelData(excelTestDataPath, "DocDetails_TestData",
			"DataSet ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	Robot robot;
	SoftAssert softAssert = new SoftAssert();
	WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(2000));

	// Testdata
	// @AT_ADC_01 application deatils COntract Signing stage
	@And("^User get the test data for test case AT_DOC_01$")
	public void get_the_test_data_for_test_case_search_customer_AT_DOC_01() throws Throwable {
		testData = docDetails_ContractSigning_TestData.getTestdata("DS_AT_DOC_01");
	}

	@And("User click the module name dropdown in ULS application for Application Details at Contract Signing Stage")
	public void user_click_the_module_name_dropdown_in_uls_application_for_application_details_contract_signing_stage()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("moduleNameDropdown"))
						.click();
				System.out.println(testData.get("Module Name"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User click the module name dropdown in ULS application for document details at contract signing stage")
	public void User_click_the_module_name_dropdown_in_ULS_application_for_document_details_at_contract_signing_stage()
			throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("moduleNameDropdown")));
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("moduleNameDropdown"))
						.click();
				// System.out.println(testData.get("Module Name"));
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User select the module name as LOS1 in ULS application for Application Details at Contract Signing Stage")
	public void user_select_the_module_name_as_los1_in_uls_application_for_application_details_contract_signing_stage() throws Throwable {
		try {
			
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
		} catch (Exception e) {
			// TODO: handle exception
			
			Assert.fail(e.getMessage());
		}
		// clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
	}
	
	 /// @And("User select the module name as LOS1 in ULS application for ApplicationDetails at Contract Signing Stage" )
	//  public void user_select_the_module_name_as_los1_in_uls_application_for_application_details_contract_signing_stage() throws Throwable { 
		//  try {
	  
	//  clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
	//  break;
	//  }	  
	//  catch (Exception e) 
		//  {
		 // Assert.fail(e.getMessage()); 
	//	  } 
	 // clicksAndActionsHelper.jsSelectUsingText(testData.get("Module Name"));
	  
	//  }

	 

	@And("User click the Mail box in ULS application for Application Details at Contract Signing Stage")
	public void user_click_the_mail_box_in_uls_application_for_application_details_contract_signing_stage()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver,
				javascriptHelper.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("mailBox")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("mailBox"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User click the Search button under inbox for Application Details at Contract Signing Stage")
	public void user_click_the_search_button_under_inbox_for_application_details_contract_signing_stage()
			throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("mailInboxSearchIconBtn")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("mailInboxSearchIconBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("User search the Ref id under inbox for Application Details at Contract Signing Stage")
	public void user_search_the_ref_id_under_inbox_for_application_details_contract_signing_stage() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("inboxSearchInput")));

		for (int i = 0; i <= 500; i++) {

			try {
				javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("User click the Entitle button under inbox for Application Details at Contract Signing Stage")
	public void user_click_the_entitle_button_under_inbox_for_application_details_contract_signing_stage()
			throws Throwable {

		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("inboxEntitleBtn")));
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("inboxEntitleBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("user click on the next button")
	public void user_click_on_the_next_button() throws IOException {
	
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("nextButton")));

				
				//javascriptHelper
				//		.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("nextButton")).click();
				
			//	javascriptHelper
			//	.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("nextButton")).click();
				
			//	javascriptHelper
				//.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("nextButton")).click();
						
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}
	
	
	@And("user click on doc details under contract signing stage")
	public void user_click_on_doc_details_under_contract_signing_stage() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentsDetailsTab")));
		
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentsDetailsTab")).click();
				

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	
	@And("user click on the view button under document details at contract signing stage")
	public void user_click_on_the_view_button_under_document_details_at_contract_signing_stage() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("viewButton")));
		
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper.JSEClick(javascriptHelper.
							executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("viewButton")));
				

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	
	@And("user verify the fields under document details tab at contract signing stage")
	public void user_verify_the_fields_under_document_details_tab_at_contract_signing_stage() throws IOException {
		
		
		//Back button
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("backbtn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("backbtn")).isDisplayed());
		
		System.out.println("Back button");
		
		
		
		//DocumentName
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentNameDrpDwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentNameDrpDwn")).isDisplayed());
		
		System.out.println("DocumentName");
		
		
		//Required At Stage
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("requiredAtStageDrpDwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("requiredAtStageDrpDwn")).isDisplayed());
		
		System.out.println("Required At Stage");
		
		
		
		//Document Status
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentStatusDrpDwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentStatusDrpDwn")).isDisplayed());
		
		System.out.println("Document Status");
		
		
		
		//Document Category
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentCategoryDrpDwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentCategoryDrpDwn")).isDisplayed());
		
		System.out.println("Document Category");
		
		
		
		//Upload Date
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("uploadDateCalender")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("uploadDateCalender")).isDisplayed());
		
		System.out.println("Upload Date");
		
		
		
		//Expected Receipt Date
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("expectedReceiptDateCalender")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("expectedReceiptDateCalender")).isDisplayed());
		
		System.out.println("Expected Receipt Date");
		
		
		
		//Deferral Stage
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("deferralStageDrpdwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("deferralStageDrpdwn")).isDisplayed());
		
		System.out.println("Deferral Stage");
		
		
		
		//Def Approved By
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("defApprovedByDrpdwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("defApprovedByDrpdwn")).isDisplayed());
		
		System.out.println("Def Approved By");
		
		
		
		//Change In Nature Approved By
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("changeInNatureAppByDrpdwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("changeInNatureAppByDrpdwn")).isDisplayed());
		
		System.out.println("Change In Nature Approved By");
		
		
		
		//Document Form
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentFormDrpDwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentFormDrpDwn")).isDisplayed());
		
		System.out.println("Document Form");
		
		
		
		//Document Quality

		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentQualityDrpDwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentQualityDrpDwn")).isDisplayed());
		
		System.out.println("Document Quality");
	
		
		
		//Document Received By
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentReceivedByDroDwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("documentReceivedByDroDwn")).isDisplayed());
		
		System.out.println("Document Received By");
		
		
		
		//Location Where Received
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("locationWhereReceivedDrpDwn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("locationWhereReceivedDrpDwn")).isDisplayed());
		
		System.out.println("Location Where Received");
		
		
		
		//Rack No
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("rackNoTextField")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("rackNoTextField")).isDisplayed());
		
		System.out.println("Rack No");
		
		
		
		//Shelf No
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("shelfNotextField")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("shelfNotextField")).isDisplayed());
		
		System.out.println("Shelf No");
		
		
		
		//Box No
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("boxNoTextField")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("boxNoTextField")).isDisplayed());
		
		System.out.println("Box No");
		
		
		
		//Date Of Expiry
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("dateOfExpiryCalender")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("dateOfExpiryCalender")).isDisplayed());
		
		System.out.println("Date Of Expiry");
		
		
		//Lodgement Amount
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("lodgementAmountTextField")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("lodgementAmountTextField")).isDisplayed());
		
		System.out.println("Lodgement Amount");
		
		
		
		//Remarks
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("remarkstextField")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("remarkstextField")).isDisplayed());
		
		System.out.println("Remarks");
		

		

		//View Document Button
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("viewDocumentButton")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("viewDocumentButton")).isDisplayed());
		
		System.out.println("view Document");
		
		
		
		
		//Upload Document
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("uploadBtn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("uploadBtn")).isDisplayed());
		
		System.out.println("Upload Document");
		
		
		//Status Toggle
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("statusToggleBtn")));
		
		Assert.assertTrue(javascriptHelper.
				executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("statusToggleBtn")).isDisplayed());
		
		System.out.println("Status Toggle");
	}
	

	@And("User verify the buttons present on the Application Details page")
	public void user_verify_the_buttons_present_on_the_application_details_page() throws IOException {

		// waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
		// executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("back_Btn")));

		for (int i = 0; i <= 300; i++) {

			try {
				System.out.println("1 " + javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("back_Btn"))
						.isDisplayed());
				Assert.assertEquals(true,
						javascriptHelper
								.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("back_Btn"))
								.isDisplayed());

				System.out.println("2 " + javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("submit_Btn"))
						.isDisplayed());
				Assert.assertEquals(true,
						javascriptHelper
								.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("submit_Btn"))
								.isDisplayed());

				System.out.println("3 " + javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("return_Btn"))
						.isDisplayed());
				Assert.assertEquals(true,
						javascriptHelper
								.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("return_Btn"))
								.isDisplayed());

				System.out.println("4 " + javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("viewSummary_Btn"))
						.isDisplayed());
				Assert.assertEquals(true, javascriptHelper
						.executeScriptWithWebElement(docDetails_ContractSigningJsPaths.getElement("viewSummary_Btn"))
						.isDisplayed());

				break;

			} catch (Exception e) {
				// TODO: handle exception
				if (i == 300)
					Assert.fail(e.getMessage());
			}
		}
	}

}
