package stepdefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationDetailsOfferingObj;
import pageobjects.CustomerAddressDetailsObj;
import pageobjects.CustomerPersonalDetailOfferingObj;
import pageobjects.FCU_VerificationObj;
import pageobjects.KULS_LoginObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.ApplicationDetailsOfferingTestDataType;
import testDataType.CustomerAddressDetailsTestDataType;
import testDataType.CustomerPersonalDetailOfferingTestDataType;
import testDataType.KULS_Login_TestDataType;

public class FCU_Verification {

	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	FCU_VerificationObj fcuVerificationObj = new FCU_VerificationObj(driver);
	String referenceID;
	BrowserHelper browserHelper = new BrowserHelper(driver);
	RadioButtonHelper radioButtonHelper = new RadioButtonHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	ExcelData excelData = new ExcelData(System.getProperty("user.dir") + "\\Test-data\\TestDataDesignSample.xlsx","FCU_VerificationTestData","Data Set ID");
	Map<String, String> testData;
	String dataSetID;
	SoftAssert softAssert = new SoftAssert();
	
//	@Then("^user should click on the menu toggle$")
//    public void user_should_click_on_the_menu_toggle() throws Throwable {
//		waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_Maker_MenuToggle());
//		fcuVerificationObj.fcuVerification_Maker_MenuToggle().click();
//    }
	
	@Then("^click on inbox button for fcu verification$")
    public void click_on_inbox_button_for_fcu_verification() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_Inbox());
		fcuVerificationObj.fcuVerification_Inbox().click();
    }

    @Then("^search for the record of fcu verification and open it$")
    public void search_for_the_record_of_fcu_verification_and_open_it() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SearchInbox());
    	fcuVerificationObj.fcuVerification_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SearchInputField());
    	fcuVerificationObj.fcuVerification_SearchInputField().sendKeys(testData.get("Stage Code"));
//    	String beforexpath = "//span[text()='";
//		String afterxpath = "']/../../td/button";
//		//span[text()='1345']/../../td/button
		String beforexpath = "//tr[1]/td[text()=' ";
		String afterxpath = " ']/../td/button";
		//tr[1]/td[text()=' App Data Entry ']/../td/button
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + testData.get("Stage Code") + afterxpath)).click();
    
    }

    @Then("^navigate to fcu verification tab$")
    public void navigate_to_fcu_verification_tab() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuVerificationTab());
    	fcuVerificationObj.fcuVerification_FcuVerificationTab().click();
    }
    
    @Then("^open customer record from list of customer screen$")
    public void open_customer_record_from_list_of_customer_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_CustomerRecordEditButton());
    	fcuVerificationObj.fcuVerification_CustomerRecordEditButton().click();
    }
    
    @Then("^click on edit button of fcu record for modification$")
    public void click_on_edit_button_of_fcu_record_for_modification() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SearchButton());
    	fcuVerificationObj.fcuVerification_SearchButton().click();
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SearchInputField());
    	fcuVerificationObj.fcuVerification_SearchInputField().sendKeys(testData.get("Verification Agency Name"));
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuVerificationRecordEditButton());
    	fcuVerificationObj.fcuVerification_FcuVerificationRecordEditButton().click();
    }
    
    @Then("^Modify the valid fields for FCU verification$")
    public void modify_the_valid_fields_for_fcu_verification() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_VerificationType());
    	fcuVerificationObj.fcuVerification_VerificationAgency().click();
    	radioButtonHelper.radioButton(testData.get("Modify Verification Agency"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_AgencyAllocationStatus());
    	fcuVerificationObj.fcuVerification_AgencyAllocationStatus().click();
    	radioButtonHelper.radioButton(testData.get("Modify Verification Allocation Status"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_VerificationStatus());
    	fcuVerificationObj.fcuVerification_VerificationStatus().click();
    	radioButtonHelper.radioButton(testData.get("Modify Verification Status"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_Remarks());
    	fcuVerificationObj.fcuVerification_Remarks().sendKeys(testData.get("Modify Remarks"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_DecisionType());
    	fcuVerificationObj.fcuVerification_DecisionType().click();
    	radioButtonHelper.radioButton(testData.get("Modify Verification Type"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuDetails_Remarks());
    	fcuVerificationObj.fcuVerification_FcuDetails_Remarks().sendKeys(testData.get("Modify Remarks FCUDetails"));
    }
    
    @Then("^verify while modification system show proper validation message for any mandatory blank field$")
    public void verify_while_modification_system_show_proper_validation_message_for_any_mandatory_blank_field() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_VerificationType());
    	fcuVerificationObj.fcuVerification_VerificationAgency().click();
    	radioButtonHelper.radioButton(testData.get("Blank Data"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuDetails_Remarks());
    	fcuVerificationObj.fcuVerification_FcuDetails_Remarks().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuDetails_Remarks());
    	fcuVerificationObj.fcuVerification_FcuDetails_Remarks().sendKeys(testData.get("Invalid Data"));
    }

    @Then("^verify system should not allow user to do a modification with invalid data$")
    public void verify_system_should_not_allow_user_to_do_a_modification_with_invalid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuDetails_Remarks());
    	fcuVerificationObj.fcuVerification_FcuDetails_Remarks().sendKeys(testData.get("Invalid Data"));
   
    }
    
    @Then("^verify system should save the modified record with valid data in fcu verification$")
    public void verify_system_should_save_the_modified_record_with_valid_data_in_fcu_verification() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SaveButton());
    	fcuVerificationObj.fcuVerification_SaveButton().click();
    }
    
    @Then("^verify system should show confirmation message post clicking on save button$")
    public void verify_system_should_show_confirmation_message_post_clicking_on_save_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SaveConfirmationMessage());
    	boolean status = fcuVerificationObj.fcuVerification_SaveConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SaveConfirmationMessage());
    	fcuVerificationObj.fcuVerification_SaveConfirmationMessage().click();
    }
    
    @Then("^verify the availability of List of customer in the system$")
    public void verify_the_availability_of_list_of_customer_in_the_system() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListOfCustomerTitle());
    	fcuVerificationObj.fcuVerification_ListOfCustomerTitle().isDisplayed();
    }

    @Then("^verify the field ID in list of customer$")
    public void verify_the_field_id_in_list_of_customer() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_CustomerIdValue());
    	fcuVerificationObj.fcuVerification_CustomerIdValue().getText().equalsIgnoreCase(testData.get("ID"));
    	try {
    		fcuVerificationObj.fcuVerification_CustomerIdValue().sendKeys("ok");
			System.out.println("Id field is editable");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Id field is not editable");
		}
    }

    @Then("^verify the field CIFID in list of customer$")
    public void verify_the_field_cifid_in_list_of_customer() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_CIFIdValue());
    	fcuVerificationObj.fcuVerification_CIFIdValue().getText().equalsIgnoreCase(testData.get("CIFID"));
    	try {
    		fcuVerificationObj.fcuVerification_CIFIdValue().sendKeys("ok");
			System.out.println("CifId field is editable");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("CifId field is not editable");
		}
    }

    @Then("^verify the field Customer Name in list of customer$")
    public void verify_the_field_customer_name_in_list_of_customer() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_CustomerNameValue());
    	fcuVerificationObj.fcuVerification_CustomerNameValue().getText().equalsIgnoreCase(testData.get("Customer Name"));
    	try {
    		fcuVerificationObj.fcuVerification_CustomerNameValue().sendKeys("ok");
			System.out.println("Customer name field is editable");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Customer name field is not editable");
		}
    }
    
    @Then("^verify the field Customer Type in list of customer$")
    public void verify_the_field_customer_type_in_list_of_customer() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_CustomerTypeValue());
    	fcuVerificationObj.fcuVerification_CustomerTypeValue().getText().equalsIgnoreCase(testData.get("Customer Type"));
    	try {
    		fcuVerificationObj.fcuVerification_CustomerTypeValue().sendKeys("ok");
    		System.out.println("Customer Type field is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("Customer Type field is not editable");
    	}
    }

    @Then("^verify the field Applicant Type in list of customer$")
    public void verify_the_field_applicant_type_in_list_of_customer() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ApplicantTypeValue());
    	fcuVerificationObj.fcuVerification_ApplicantTypeValue().getText().equalsIgnoreCase(testData.get("Applicant Type"));
    	try {
    		fcuVerificationObj.fcuVerification_ApplicantTypeValue().sendKeys("ok");
			System.out.println("Applicant Type field is editable");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Applicant Type field is not editable");
		}
    }

    @Then("^verify the field Status in list of customer$")
    public void verify_the_field_status_in_list_of_customer() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_StatusValue());
    	fcuVerificationObj.fcuVerification_StatusValue().getText().equalsIgnoreCase(testData.get("Status"));
    	try {
    		fcuVerificationObj.fcuVerification_StatusValue().sendKeys("ok");
			System.out.println("Status field is editable");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Status field is not editable");
		}
    }

    @Then("^verify the functionality of Export to PDF button$")
    public void verify_the_functionality_of_export_to_pdf_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ExportButton());
    	fcuVerificationObj.fcuVerification_ExportButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ExportToPDF());
    	fcuVerificationObj.fcuVerification_ExportToPDF().click();
    	browserHelper.SwitchToWindow(1);
    	browserHelper.switchToParentWithChildClose();
    }

    @Then("^verify the functionality of Export to Excel button$")
    public void verify_the_functionality_of_export_to_excel_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ExportButton());
    	fcuVerificationObj.fcuVerification_ExportButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ExportToPDF());
    	fcuVerificationObj.fcuVerification_ExportToPDF().click();
    }
    
    @Then("^verify FCU allocation screen fields$")
    public void verify_fcu_allocation_screen_fields() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ProductCode());
    	boolean status = fcuVerificationObj.fcuVerification_ProductCode().isDisplayed();
    	Assert.assertTrue(status);
    	boolean status1 = fcuVerificationObj.fcuVerification_SubProductCode().isDisplayed();
    	Assert.assertTrue(status1);
    	boolean status2 = fcuVerificationObj.fcuVerification_SourceEmployeeId().isDisplayed();
    	Assert.assertTrue(status2);
    	boolean status3 = fcuVerificationObj.fcuVerification_SourcingType().isDisplayed();
    	Assert.assertTrue(status3);
    	boolean status4 = fcuVerificationObj.fcuVerification_FcuDetails().isDisplayed();
    	Assert.assertTrue(status4);
    	boolean status5 = fcuVerificationObj.fcuVerification_BackButton().isDisplayed();
    	Assert.assertTrue(status5);
    	boolean status6 = fcuVerificationObj.fcuVerification_SaveButton().isDisplayed();
    	Assert.assertTrue(status6);
    	boolean status7 = fcuVerificationObj.fcuVerification_VerificationType().isDisplayed();
    	Assert.assertTrue(status7);
    	boolean status8 = fcuVerificationObj.fcuVerification_ApplicantTypeValue().isDisplayed();
    	Assert.assertTrue(status8);
    	boolean status9 = fcuVerificationObj.fcuVerification_VerificationAgency().isDisplayed();
    	Assert.assertTrue(status9);
    	boolean status10 = fcuVerificationObj.fcuVerification_AgencyAllocationStatus().isDisplayed();
    	Assert.assertTrue(status10);
    	boolean status11 = fcuVerificationObj.fcuVerification_VerificationStatus().isDisplayed();
    	Assert.assertTrue(status11);
    	boolean status12 = fcuVerificationObj.fcuVerification_Remarks().isDisplayed();
    	Assert.assertTrue(status12);
    }

    @Then("^verify the Product Summary section fields$")
    public void verify_the_product_summary_section_fields() throws Throwable {
    	boolean status1 = fcuVerificationObj.fcuVerification_ProductSummary_ProductCode().isDisplayed();
    	Assert.assertTrue(status1);
    	boolean status2 = fcuVerificationObj.fcuVerification_ProductSummary_SubProductCode().isDisplayed();
    	Assert.assertTrue(status2);
    	boolean status3 = fcuVerificationObj.fcuVerification_ProductSummary_SourceEmployeeID().isDisplayed();
    	Assert.assertTrue(status3);
    	boolean status4 = fcuVerificationObj.fcuVerification_ProductSummary_SourcingType().isDisplayed();
    	Assert.assertTrue(status4);
    	
    	boolean editable1 = fcuVerificationObj.fcuVerification_ProductCode().getAttribute("ng-reflect-readonly").equalsIgnoreCase("true");
    	Assert.assertTrue(editable1);
    	boolean editable2 = fcuVerificationObj.fcuVerification_SubProductCode().getAttribute("ng-reflect-readonly").equalsIgnoreCase("true");
    	Assert.assertTrue(editable2);
    	boolean editable3 = fcuVerificationObj.fcuVerification_SourceEmployeeId().getAttribute("ng-reflect-readonly").equalsIgnoreCase("true");
    	Assert.assertTrue(editable3);
    	boolean editable4 = fcuVerificationObj.fcuVerification_SourcingType().getAttribute("ng-reflect-readonly").equalsIgnoreCase("true");
    	Assert.assertTrue(editable4);
    }

    @Then("^verify the field Verification Type$")
    public void verify_the_field_verification_type() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_VerificationType());
    	boolean dropDown = fcuVerificationObj.fcuVerification_VerificationType().getAttribute("ng-reflect-interface").equalsIgnoreCase("popover");
    	Assert.assertTrue(dropDown);
    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(testData.get("Verification Type"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_VerificationType());
    	boolean autoPopulate = fcuVerificationObj.fcuVerification_VerificationType().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
    	Assert.assertTrue(autoPopulate);
    }

    @Then("^verify the field Applicant Type$")
    public void verify_the_field_applicant_type() throws Throwable {
    	boolean status = fcuVerificationObj.fcuVerification_ApplicantTypeValue().isDisplayed();
    	softAssert.assertTrue(status,"Applicant Type Field Missing");
    }

    @Then("^verify the field Verification Agency Type$")
    public void verify_the_field_verification_agency_type() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_VerificationAgency());
    	boolean dropDown = fcuVerificationObj.fcuVerification_VerificationAgency().getAttribute("ng-reflect-interface").equalsIgnoreCase("popover");
    	Assert.assertTrue(dropDown);
    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(testData.get("Verification Agency"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_VerificationAgency());
    	boolean autoPopulate = fcuVerificationObj.fcuVerification_VerificationAgency().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
    	Assert.assertTrue(autoPopulate);
    }

    @Then("^verify the field Agency Allocation Status$")
    public void verify_the_field_agency_allocation_status() throws Throwable {
    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(testData.get("Verification Allocation Status"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_AgencyAllocationStatus());
    	fcuVerificationObj.fcuVerification_AgencyAllocationStatus().click();
    	
    	List<WebElement> modulelist = driver.findElements(By.xpath("//ion-radio-group//ion-label"));
		for (WebElement webElement : modulelist) {
			String value = webElement.getText();
			if (value.equalsIgnoreCase("Select")) {
				System.out.println("Dropdown is showing select");
			}
			else if (value.equalsIgnoreCase("Cancelled")) {
				System.out.println("Dropdown is showing Cancelled");
			}
			else if (value.equalsIgnoreCase("Confirmed")) {
				System.out.println("Dropdown is showing Confirmed");
			}
			else if (value.equalsIgnoreCase("Waived")) {
				System.out.println("Dropdown is showing Waived");
			} else{
				System.out.println("Dropdown doesn't have Cancelled Confirmed or Waived");
				Assert.fail("Dropdown doesn't have Cancelled Confirmed or Waived");
			}
		}
    	
    }

    @Then("^verify the field Verification Status$")
    public void verify_the_field_verification_status() throws Throwable {
    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(testData.get("Verification Status"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_VerificationStatus());
    	fcuVerificationObj.fcuVerification_VerificationStatus().click();
    	
    	List<WebElement> modulelist = driver.findElements(By.xpath("//ion-radio-group//ion-label"));
		for (WebElement webElement : modulelist) {
			String value = webElement.getText();
			if (value.equalsIgnoreCase("Select")) {
				System.out.println("Dropdown is showing select");
			}
			else if (value.equalsIgnoreCase("Confirm")) {
				System.out.println("Dropdown is showing Confirmed");
			}
			else if (value.equalsIgnoreCase("Waived")) {
				System.out.println("Dropdown is showing Waived");
			} else{
				System.out.println("Dropdown doesn't have Confirmed or Waived");
				Assert.fail("Dropdown doesn't have Confirmed or Waived");
			}
		}
    }

    @Then("^verify the field Waived By$")
    public void verify_the_field_waived_by() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_WaivedBy());
    	boolean status= fcuVerificationObj.fcuVerification_WaivedBy().isDisplayed();
    	softAssert.assertTrue(status, "Waived By field missing");
    }

    @Then("^verify the field Remarks in FCU details$")
    public void verify_the_field_remarks_in_fcu_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_Remarks());
    	boolean status= fcuVerificationObj.fcuVerification_Remarks().getAttribute("ng-reflect-type").equalsIgnoreCase("text");
    	Assert.assertTrue(status);
    	
    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(testData.get("Remarks"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_Remarks());
    	boolean editable= fcuVerificationObj.fcuVerification_Remarks().getAttribute("ng-reflect-readonly").equalsIgnoreCase("false");
    	Assert.assertTrue(editable);
    }

    @Then("^verify the FCU allocation list at bottom of the same screen$")
    public void verify_the_fcu_allocation_list_at_bottom_of_the_same_screen() throws Throwable {
    	boolean status= fcuVerificationObj.fcuVerification_ListViewVerificationTypeField().isDisplayed();
    	Assert.assertTrue(status);
    	boolean status1= fcuVerificationObj.fcuVerification_ListViewVerificationAgencyNameField().isDisplayed();
    	Assert.assertTrue(status1);
    	boolean status2= fcuVerificationObj.fcuVerification_ListViewConfirmWaiveAgencyField().isDisplayed();
    	Assert.assertTrue(status2);
    	boolean status3= fcuVerificationObj.fcuVerification_ListViewVerificationStatusField().isDisplayed();
    	Assert.assertTrue(status3);
    	boolean status4= fcuVerificationObj.fcuVerification_ListViewWaivedByField().isDisplayed();
    	Assert.assertTrue(status4);
    	boolean status5= fcuVerificationObj.fcuVerification_ListViewRemarksField().isDisplayed();
    	Assert.assertTrue(status5);
    	boolean status6= fcuVerificationObj.fcuVerification_ListViewVerificationIDField().isDisplayed();
    	softAssert.assertTrue(status6);
    	
    }

    @Then("^verify the values display under FCU allocation list are in view only mode$")
    public void verify_the_values_display_under_fcu_allocation_list_are_in_view_only_mode() throws Throwable {
    	try {
    		waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListViewVerificationTypeValue());
    		fcuVerificationObj.fcuVerification_ListViewVerificationTypeValue().sendKeys("OK");;
			System.out.println("Verification type value is not in view only mode");
		} catch (Exception e) {
			System.out.println("Verification type value is in view only mode");
		}
    	try {
    		waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListViewVerificationAgencyNameValue());
    		fcuVerificationObj.fcuVerification_ListViewVerificationAgencyNameValue().sendKeys("OK");;
			
    		System.out.println("Verification Agency Name value is not in view only mode");
		} catch (Exception e) {
			System.out.println("Verification Agency Name value is in view only mode");
		}
    	try {
    		waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListViewConfirmWaiveAgencyValue());
    		fcuVerificationObj.fcuVerification_ListViewConfirmWaiveAgencyValue().sendKeys("ok");;
    		System.out.println("Confirm/Waive Agency value is not in view only mode");
		} catch (Exception e) {
			System.out.println("Confirm/Waive Agency value is in view only mode");
		}
    	
    	try {
    		waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListViewVerificationStatusValue());
    		fcuVerificationObj.fcuVerification_ListViewVerificationStatusValue().sendKeys("ok");;
    		System.out.println("Verification Status value is not in view only mode");
		} catch (Exception e) {
			System.out.println("Verification Status value is in view only mode");
		}
    	
    	try {
    		waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListViewWaivedByValue());
    		fcuVerificationObj.fcuVerification_ListViewWaivedByValue().sendKeys("ok");;
    		System.out.println("Waived By value is not in view only mode");
		} catch (Exception e) {
			System.out.println("Waived By value is in view only mode");
		}
    	
    	try {
    		waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListViewRemarksValue());
    		fcuVerificationObj.fcuVerification_ListViewRemarksValue().sendKeys("ok");;
    		System.out.println("Remarks value is not in view only mode");
		} catch (Exception e) {
			System.out.println("Remarks value is in view only mode");
		}		
    	
    	try {
    		waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListViewVerificationIDValue());
    		fcuVerificationObj.fcuVerification_ListViewVerificationIDValue().sendKeys("ok");;
    		System.out.println("Verification ID value is not in view only mode");
		} catch (Exception e) {
			System.out.println("Verification ID value is in view only mode");
		}
    }
    
    @Then("^click on add button to create a record for FCU verification$")
    public void click_on_add_button_to_create_a_record_for_fcu_verification() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_addButton());
    	fcuVerificationObj.fcuVerification_addButton().click();
    }
    @Then("^click on add button to create a record for FCU report$")
    public void click_on_add_button_to_create_a_record_for_fcu_report() throws Throwable {
    	for (int i = 0; i < 10; i++) {
			try {
				javaScriptHelper.scrollIntoView(fcuVerificationObj.fcuVerification_ListOfDocumentsTitle());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
        waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReportAddButton());
    	fcuVerificationObj.fcuVerification_FcuReportAddButton().click();
    }

    @Then("^Fill all the valid details for FCU verification$")
    public void fill_all_the_valid_details_for_fcu_verification() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_VerificationType());
    	fcuVerificationObj.fcuVerification_VerificationAgency().click();
    	radioButtonHelper.radioButton(testData.get("Verification Agency"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_AgencyAllocationStatus());
    	fcuVerificationObj.fcuVerification_AgencyAllocationStatus().click();
    	radioButtonHelper.radioButton(testData.get("Verification Allocation Status"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_VerificationStatus());
    	fcuVerificationObj.fcuVerification_VerificationStatus().click();
    	radioButtonHelper.radioButton(testData.get("Verification Status"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_Remarks());
    	fcuVerificationObj.fcuVerification_Remarks().sendKeys(testData.get("Remarks"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_DecisionType());
    	fcuVerificationObj.fcuVerification_DecisionType().click();
    	radioButtonHelper.radioButton(testData.get("Verification Type"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuDetails_Remarks());
    	fcuVerificationObj.fcuVerification_FcuDetails_Remarks().sendKeys(testData.get("Remarks FCUDetails"));
    }

    @Then("^verify the functionality of save button with all valid data in fcu verification$")
    public void verify_the_functionality_of_save_button_with_all_valid_data_in_fcu_verification() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SaveButton());
    	fcuVerificationObj.fcuVerification_SaveButton().click();
    }

    @Then("^verify the functionality of Back button in fcu verification$")
    public void verify_the_functionality_of_back_button_in_fcu_verification() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_BackButton());
    	fcuVerificationObj.fcuVerification_BackButton().click();
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListOfAgencyTitle());
    	boolean status = fcuVerificationObj.fcuVerification_ListOfAgencyTitle().isDisplayed();
    	Assert.assertTrue(status);
    }
    
    @Then("^verify the functionality of Back button in fcu report$")
    public void verify_the_functionality_of_back_button_in_fcu_report() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_BackButton());
    	fcuVerificationObj.fcuVerification_BackButton().click();
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListOfDocumentsTitle());
    	boolean status = fcuVerificationObj.fcuVerification_ListOfDocumentsTitle().isDisplayed();
    	Assert.assertTrue(status);
    }
    
    @Then("^verify the availability of FCU Report record screen$")
    public void verify_the_availability_of_fcu_report_record_screen() throws Throwable {
        
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_SaveButton());
    	boolean status = fcuVerificationObj.fcuVerification_FcuReport_SaveButton().isDisplayed();
    	Assert.assertTrue(status);
    	boolean status1 = fcuVerificationObj.fcuVerification_BackButton().isDisplayed();
    	Assert.assertTrue(status1);
    	boolean status2 = fcuVerificationObj.fcuVerification_FcuReport_DocumentType().isDisplayed();
    	Assert.assertTrue(status2);
    	boolean status3 = fcuVerificationObj.fcuVerification_FcuReport_SampledType().isDisplayed();
    	Assert.assertTrue(status3);
    	boolean status4 = fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs().isDisplayed();
    	Assert.assertTrue(status4);
    	boolean status5 = fcuVerificationObj.fcuVerification_FcuReport_Status().isDisplayed();
    	Assert.assertTrue(status5);
    	boolean status6 = fcuVerificationObj.fcuVerification_FcuReport_Remarks().isDisplayed();
    	Assert.assertTrue(status6);
    	
    }
    
    @Then("^Fill all the valid details for FCU Report form$")
    public void fill_all_the_valid_details_for_fcu_report_form() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_DocumentType());
    	fcuVerificationObj.fcuVerification_FcuReport_DocumentType().click();
    	radioButtonHelper.radioButton(testData.get("Report Document Type"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_SampledType());
    	fcuVerificationObj.fcuVerification_FcuReport_SampledType().click();
    	radioButtonHelper.radioButton(testData.get("Report Sampled Type"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs());
    	fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs().sendKeys(testData.get("Report No Of Docs"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_Status());
    	fcuVerificationObj.fcuVerification_FcuReport_Status().click();
    	radioButtonHelper.radioButton(testData.get("Report Status"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_Remarks());
    	fcuVerificationObj.fcuVerification_FcuReport_Remarks().sendKeys(testData.get("Report Remarks"));
    	
    }
    
    @Then("^verify the functionality of save button with all valid data in fcu report$")
    public void verify_the_functionality_of_save_button_with_all_valid_data_in_fcu_report() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_SaveButton());
    	fcuVerificationObj.fcuVerification_FcuReport_SaveButton().click();
    }
    
    @Then("^verify system should show confirmation message post clicking on save button of fcu report$")
    public void verify_system_should_show_confirmation_message_post_clicking_on_save_button_of_fcu_report() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SaveConfirmationMessage());
    	boolean status = fcuVerificationObj.fcuVerification_SaveConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SaveConfirmationMessage());
    	fcuVerificationObj.fcuVerification_SaveConfirmationMessage().click();
    }
    
    @Then("^verify the field Document Type$")
    public void verify_the_field_document_type() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_DocumentType());
    	boolean status = fcuVerificationObj.fcuVerification_FcuReport_DocumentType().getAttribute("ng-reflect-interface").equalsIgnoreCase("popover");
    	Assert.assertTrue(status);
    }

    @Then("^verify the field Sampled Type$")
    public void verify_the_field_sampled_type() throws Throwable {
    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Sampled Type");
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_SampledType());
    	boolean status = fcuVerificationObj.fcuVerification_FcuReport_SampledType().getAttribute("ng-reflect-interface").equalsIgnoreCase("popover");
    	Assert.assertTrue(status);
    	
    	List<WebElement> modulelist = driver.findElements(By.xpath("//ion-radio-group//ion-label"));
		for (WebElement webElement : modulelist) {
			String value = webElement.getText();
			if (value.equalsIgnoreCase("Select")) {
				System.out.println("Dropdown is showing select");
			}
			else if (value.equalsIgnoreCase("Sampled")) {
				System.out.println("Dropdown is showing Sampled");
			}else if (value.equalsIgnoreCase("Screened")) {
				System.out.println("Dropdown is showing Screened");
			}else{
				System.out.println("Dropdown doesn't have Sampled or Screened");
				Assert.fail("Dropdown doesn't have Sampled or Screened");
			}
		}
    }

    @Then("^verify the field No of Docs$")
    public void verify_the_field_no_of_docs() throws Throwable {
    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("No Of Docs");
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs());
    	boolean status = fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs().getAttribute("ng-reflect-type").equalsIgnoreCase("number");
    	Assert.assertTrue("No Of Docs Field is not a numeric field", status);
    	
    }

    @Then("^verify the field Status$")
    public void verify_the_field_status() throws Throwable {
    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Status");
    	
    	List<WebElement> modulelist = driver.findElements(By.xpath("//ion-radio-group//ion-label"));
		for (WebElement webElement : modulelist) {
			String value = webElement.getText();
			if (value.equalsIgnoreCase("Select")) {
				System.out.println("Dropdown is showing select");
			}
			else if (value.equalsIgnoreCase("Pending")) {
				System.out.println("Dropdown is showing Pending");
			}
			else if (value.equalsIgnoreCase("Could Not Verify")) {
				System.out.println("Dropdown is showing Could Not Verify");
			}
			else if (value.equalsIgnoreCase("Fake")) {
				System.out.println("Dropdown is showing Fake");
			}
			else if (value.equalsIgnoreCase("Negative")) {
				System.out.println("Dropdown is showing Negative");
			}
			else if (value.equalsIgnoreCase("Positive")) {
				System.out.println("Dropdown is showing Positive");
			}
			else if (value.equalsIgnoreCase("Refer to Credit")) {
				System.out.println("Dropdown is showing Refer to Credit");
			}else{
				System.out.println("Dropdown doesn't have mentioned values");
				Assert.fail("Dropdown doesn't have mentioned values");
			}
		}
    	
    }

    @Then("^verify the field Remarks of fcu report$")
    public void verify_the_field_remarks_of_fcu_report() throws Throwable {
    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("No Of Docs");
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_Remarks());
    	boolean status = fcuVerificationObj.fcuVerification_FcuReport_Remarks().getAttribute("ng-reflect-type").equalsIgnoreCase("text");
    	Assert.assertTrue(status);
    }

    @Then("^verify the functionality of Back button of fcu report$")
    public void verify_the_functionality_of_back_button_of_fcu_report() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_BackButton());
    	fcuVerificationObj.fcuVerification_BackButton().click();
    	
    	for (int i = 0; i < 10; i++) {
			try {
				javaScriptHelper.scrollIntoView(fcuVerificationObj.fcuVerification_ListOfDocumentsTitle());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
    }

    @Then("^verify system display the list at bottom of the screen$")
    public void verify_system_display_the_list_at_bottom_of_the_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_ListOfDocumentsTitle());
    	fcuVerificationObj.fcuVerification_ListOfDocumentsTitle().isDisplayed();
    }
    
    @Then("^verify proper validation message for blank field should display in FCU report$")
    public void verify_proper_validation_message_for_blank_field_should_display_in_fcu_report() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_SaveButton());
    	fcuVerificationObj.fcuVerification_FcuReport_SaveButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_StatusFieldValidation());
    	boolean message = fcuVerificationObj.fcuVerification_FcuReport_StatusFieldValidation().isDisplayed();
    	Assert.assertEquals(message, true);
    	String validationmessage = fcuVerificationObj.fcuVerification_FcuReport_StatusFieldValidation().getText();
    	System.out.println("Blank Field validation message - "+validationmessage);
    }

    @Then("^verify system should not allow to enter invalid datatypes while modification in FCU report$")
    public void verify_system_should_not_allow_to_enter_invalid_datatypes_while_modification_in_fcu_report() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs());
    	fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs().sendKeys("Invalid Data");
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_NoOfDocsInvalidDataValidation());
    	boolean message = fcuVerificationObj.fcuVerification_FcuReport_NoOfDocsInvalidDataValidation().isDisplayed();
    	Assert.assertEquals(message, true);
    	String validationmessage = fcuVerificationObj.fcuVerification_FcuReport_NoOfDocsInvalidDataValidation().getText();
    	System.out.println("Invalid Data validation message - "+validationmessage);
    }
    
    @Then("^verify the impact when user enter numeric value in character field in any field of FCU report$")
    public void verify_the_impact_when_user_enter_numeric_value_in_character_field_in_any_field_of_fcu_report() throws Throwable {
        
    }

    @Then("^verify the impact when user enter characters value in numeric field in any field of FCU report$")
    public void verify_the_impact_when_user_enter_characters_value_in_numeric_field_in_any_field_of_fcu_report() throws Throwable {
       waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs());
       fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs().sendKeys("123");
       
    }
    
    @Then("^click on edit button of fcu report record for modification$")
    public void click_on_edit_button_of_fcu_report_record_for_modification() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_SearchButton());
    	fcuVerificationObj.fcuVerification_FcuReport_SearchButton().click();
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_SearchInputField());
    	fcuVerificationObj.fcuVerification_SearchInputField().sendKeys(testData.get("2"));
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReportRecordEditButton());
    	fcuVerificationObj.fcuVerification_FcuReportRecordEditButton().click();
    	
    }
    
    @Then("^verify the buttons available on screen while modify the FCU report$")
    public void verify_the_buttons_available_on_screen_while_modify_the_fcu_report() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_SaveButton());
    	boolean status = fcuVerificationObj.fcuVerification_FcuReport_SaveButton().isDisplayed();
    	Assert.assertTrue(status);
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_BackButton());
    	boolean status1 = fcuVerificationObj.fcuVerification_BackButton().isDisplayed();
    	Assert.assertTrue(status1);
    }

    @Then("^verify system allow user to modify the FCU report$")
    public void verify_system_allow_user_to_modify_the_fcu_report() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_DocumentType());
    	fcuVerificationObj.fcuVerification_FcuReport_DocumentType().click();
    	radioButtonHelper.radioButton(testData.get("Modify Report Document Type"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_SampledType());
    	fcuVerificationObj.fcuVerification_FcuReport_SampledType().click();
    	radioButtonHelper.radioButton(testData.get("Modify Report Sampled Type"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs());
    	fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs().sendKeys(testData.get("Modify Report No Of Docs"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_Status());
    	fcuVerificationObj.fcuVerification_FcuReport_Status().click();
    	radioButtonHelper.radioButton(testData.get("Modify Report Status"));
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_Remarks());
    	fcuVerificationObj.fcuVerification_FcuReport_Remarks().sendKeys(testData.get("Modify Report Remarks"));
    }
    
    @Then("^verify while modification system show proper validation message for any mandatory blank field of fcu report$")
    public void verify_while_modification_system_show_proper_validation_message_for_any_mandatory_blank_field_of_fcu_report() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_Status());
    	fcuVerificationObj.fcuVerification_FcuReport_Status().sendKeys("Select");
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_StatusFieldValidation());
    	boolean message = fcuVerificationObj.fcuVerification_FcuReport_StatusFieldValidation().isDisplayed();
    	Assert.assertEquals(message, true);
    	String validationmessage = fcuVerificationObj.fcuVerification_FcuReport_StatusFieldValidation().getText();
    	System.out.println("Blank Field validation message - "+validationmessage);
    }

    @Then("^verify system should not allow user to do a modification with invalid data of fcu report$")
    public void verify_system_should_not_allow_user_to_do_a_modification_with_invalid_data_of_fcu_report() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs());
    	fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs());
    	fcuVerificationObj.fcuVerification_FcuReport_NoOfDocs().sendKeys("Invalid Data");
    	
    	waithelper.waitForElementwithFluentwait(driver, fcuVerificationObj.fcuVerification_FcuReport_NoOfDocsInvalidDataValidation());
    	boolean message = fcuVerificationObj.fcuVerification_FcuReport_NoOfDocsInvalidDataValidation().isDisplayed();
    	Assert.assertEquals(message, true);
    	String validationmessage = fcuVerificationObj.fcuVerification_FcuReport_NoOfDocsInvalidDataValidation().getText();
    	System.out.println("Invalid Data validation message - "+validationmessage);
    }
    
    @Then("^verify Overall decision section should be available under FCU report screen$")
    public void verify_overall_decision_section_should_be_available_under_fcu_report_screen() throws Throwable {
        
    }

    @Then("^verify user is able to save the Overall decisions$")
    public void verify_user_is_able_to_save_the_overall_decisions() throws Throwable {
        
    }

    @Then("^verify the field Decision in Overall decision section$")
    public void verify_the_field_decision_in_overall_decision_section() throws Throwable {
        
    }

    @Then("^verify system should not allow user to save the record without selecting a decision$")
    public void verify_system_should_not_allow_user_to_save_the_record_without_selecting_a_decision() throws Throwable {
        
    }

    @Then("^verify the field Remarks in overall decision$")
    public void verify_the_field_remarks_in_overall_decision() throws Throwable {
        
    }

    @Then("^verify the other fields on Overall decision section is non mandatory except decision$")
    public void verify_the_other_fields_on_overall_decision_section_is_non_mandatory_except_decision() throws Throwable {
        
    }
    
    @Then("^select data set ID for fcu verification testcase001$")
    public void select_data_set_id_for_fcu_verification_testcase001() throws Throwable {
    	dataSetID = "AT_FCU_001_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for fcu verification testcase002$")
    public void select_data_set_id_for_fcu_verification_testcase002() throws Throwable {
    	dataSetID = "AT_FC_02_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for fcu verification testcase003$")
    public void select_data_set_id_for_fcu_verification_testcase003() throws Throwable {
    	dataSetID = "AT_FC_03_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for fcu verification testcase004$")
    public void select_data_set_id_for_fcu_verification_testcase004() throws Throwable {
    	dataSetID = "AT_FC_04_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for fcu verification testcase005$")
    public void select_data_set_id_for_fcu_verification_testcase005() throws Throwable {
    	dataSetID = "AT_FC_05_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for fcu verification testcase006$")
    public void select_data_set_id_for_fcu_verification_testcase006() throws Throwable {
    	dataSetID = "AT_FC_06_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for fcu verification testcase007$")
    public void select_data_set_id_for_fcu_verification_testcase007() throws Throwable {
    	dataSetID = "AT_FC_07_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for fcu verification testcase008$")
    public void select_data_set_id_for_fcu_verification_testcase008() throws Throwable {
    	dataSetID = "AT_FC_08_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for fcu verification testcase009$")
    public void select_data_set_id_for_fcu_verification_testcase009() throws Throwable {
    	dataSetID = "AT_FC_09_D1";
        testData = excelData.getTestdata(dataSetID);
    }
    
}




