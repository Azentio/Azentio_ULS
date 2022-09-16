package stepdefinitions;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
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
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.KULS_LoginObj;
import pageobjects.ProductMaster_RetailObj;
import pageobjects.ProjectMasterObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.ProductMaster_RetailTestDataType;
import testDataType.ProjectMasterTestDataType;

public class ProjectMaster {
	
	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper=new WaitHelper(driver);
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
	ProjectMasterObj projectMasterObj = new ProjectMasterObj(driver);
	ProjectMasterTestDataType projectMasterTestDataType=jsonConfig.getProjectMasterByName("Maker");
	
	@Then("^user should navigate to project master$")
    public void user_should_navigate_to_project_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.config_Manager());
		projectMasterObj.config_Manager().click();
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.project_Setup());
		projectMasterObj.project_Setup().click();
    }
	
	@And("^click on edit view of project master$")
	public void click_on_edit_view_of_product_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_EditView());
		projectMasterObj.projectMaster_EditView().click();
	}
	
	@And("^click on eye icon of project master$")
	public void click_on_eye_icon_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_EyeIcon());
    	projectMasterObj.projectMaster_EyeIcon().click();
	}
	
	@Then("^select the submitted record of project master by maker to approve$")
    public void select_the_submitted_record_of_project_master_by_maker_to_approve() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInbox());
		projectMasterObj.projectMaster_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInboxInputField());
    	projectMasterObj.projectMaster_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +jsonDataReaderWriter.readReferancedata()+ afterxpath)).click();
    }
	
	@Then("^enter remark for approve the record of project master$")
    public void enter_remark_for_approve_the_record_of_project_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_CheckerApproveRemark());
		projectMasterObj.projectMaster_Checker_CheckerApproveRemark().sendKeys(projectMasterTestDataType.CheckerApproveRemark);
    }
	
	@Then("^select the submitted record of project master by maker to reject$")
	public void select_the_submitted_record_of_project_master_by_maker_to_reject() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInbox());
		projectMasterObj.projectMaster_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInboxInputField());
    	projectMasterObj.projectMaster_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +jsonDataReaderWriter.readReferancedata()+ afterxpath)).click();
	}

	@Then("^enter remark for reject the record of project master$")
	public void enter_remark_for_reject_the_record_of_project_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_CheckerRejectRemark());
		projectMasterObj.projectMaster_Checker_CheckerRejectRemark().sendKeys(projectMasterTestDataType.CheckerRejectRemark);
	}
	
	@Then("^select the submitted record of project master by maker to return$")
    public void select_the_submitted_record_of_project_master_by_maker_to_return() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInbox());
		projectMasterObj.projectMaster_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInboxInputField());
    	projectMasterObj.projectMaster_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +jsonDataReaderWriter.readReferancedata()+ afterxpath)).click();
    }

    @Then("^enter remark for return the record of project master$")
    public void enter_remark_for_return_the_record_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_CheckerReturnRemark());
    	projectMasterObj.projectMaster_Checker_CheckerReturnRemark().sendKeys(projectMasterTestDataType.CheckerReturnRemark);
    }
    
    @Then("^verify proper validation message for blank field should display in project master$")
    public void verify_proper_validation_message_for_blank_field_should_display_in_project_master() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
//    	projectMasterObj.projectMaster_Save().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProjectBlankFieldValidation());
    	boolean message = projectMasterObj.projectMaster_NameOfTheProjectBlankFieldValidation().isDisplayed();
    	Assert.assertEquals(message, true);
    }
    
    @Then("^verify while modification proper validation message for blank field should display in project master$")
    public void verify_while_modification_proper_validation_message_for_blank_field_should_display_in_project_master() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProjectInputField());
//    	clicksAndActionsHelper.doubleClick(projectMasterObj.projectMaster_NameOfTheProjectInputField());
//    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys(Keys.BACK_SPACE);
    	
//    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys(Keys.chord(Keys.CONTROL,"A"));
//    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys(Keys.BACK_SPACE);
//    	
//    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
//    	projectMasterObj.projectMaster_Save().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProjectBlankFieldValidation());
    	boolean message = projectMasterObj.projectMaster_NameOfTheProjectBlankFieldValidation().isDisplayed();
    	Assert.assertEquals(message, true);
    }
    
    
    @Then("^click on add button$")
    public void click_on_add_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_AddButton());
    	projectMasterObj.projectMaster_AddButton().click();
    }
    
    
    @Then("^click on edit button of record to modify in project master$")
    public void click_on_edit_button_of_record_to_modify_in_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
    	projectMasterObj.projectMaster_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
    	projectMasterObj.projectMaster_SearchInputField().sendKeys(projectMasterTestDataType.RecordForBlankMessage);
    	Thread.sleep(2000);
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ModifiedRecordEditButton());
    	projectMasterObj.projectMaster_ModifiedRecordEditButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProjectInputField());
    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProjectInputField());
    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys(Keys.BACK_SPACE);
    	
//    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
//    	projectMasterObj.projectMaster_Save().click();
    }
    
    @Then("^verify system should not allow to enter invalid datatypes in project master$")
    public void verify_system_should_not_allow_to_enter_invalid_datatypes_in_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProjectInputField());
    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys("*");
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_InvalidDatatypeValidationMessage());
    	String validationmsg = projectMasterObj.projectMaster_InvalidDatatypeValidationMessage().getText();
    	System.out.println("Invalid datatype validation message - "+validationmsg);
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_InvalidDatatypeValidationMessage());
    	boolean message = projectMasterObj.projectMaster_InvalidDatatypeValidationMessage().isDisplayed();
    	Assert.assertEquals(message, true);
    	
    }
    
    @Then("^verify the functionality of status of the record in project master$")
    public void verify_the_functionality_of_status_of_the_record_in_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
    	projectMasterObj.projectMaster_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
    	projectMasterObj.projectMaster_SearchInputField().sendKeys(projectMasterTestDataType.RecordForBlankMessage);
    	Thread.sleep(2000);
    	javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_DisplayStatus());
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_DisplayStatus());
    	projectMasterObj.projectMaster_DisplayStatus().isDisplayed();
    	String status = projectMasterObj.projectMaster_DisplayStatus().getText();
    	System.out.println("Status of the record " +projectMasterTestDataType.RecordForStatusVerify+ " in list view : "+status);
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchCloseButton());
    	projectMasterObj.projectMaster_SearchCloseButton().click();
    }
    
    @Then("^verify user can able to change the status from active to deactive in project master$")
    public void verify_user_can_able_to_change_the_status_from_active_to_deactive_in_project_master() throws Throwable {
    		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
        	projectMasterObj.projectMaster_Search().click();
        	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
        	projectMasterObj.projectMaster_SearchInputField().sendKeys(projectMasterTestDataType.RecordForStatusVerify);
        	Thread.sleep(2000);
        	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ModifiedRecordEditButton());
        	projectMasterObj.projectMaster_ModifiedRecordEditButton().click();
        	Thread.sleep(2000);
        	javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Status());
    		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Status());
    		projectMasterObj.projectMaster_Status().click();
    		
    		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Save());
    		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
    		projectMasterObj.projectMaster_Save().click();
    		
    		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
        	projectMasterObj.projectMaster_Search().click();
        	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
        	projectMasterObj.projectMaster_SearchInputField().sendKeys(projectMasterTestDataType.RecordForStatusVerify);
    		while (true) {
    			try {
    				String status = projectMasterObj.projectMaster_DisplayStatus().getText();
    				System.out.println("User changed Status to : " + status);
    				break;
    			} catch (Exception e) {
    			}
    		}
    		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchCloseButton());
    		projectMasterObj.projectMaster_SearchCloseButton().click();
    		
    }

    @Then("^verify user can able to change the status from deactive to active in project master$")
    public void verify_user_can_able_to_change_the_status_from_deactive_to_active_in_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
    	projectMasterObj.projectMaster_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
    	projectMasterObj.projectMaster_SearchInputField().sendKeys(projectMasterTestDataType.RecordForStatusVerify);
    	Thread.sleep(2000);
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ModifiedRecordEditButton());
    	projectMasterObj.projectMaster_ModifiedRecordEditButton().click();
    	Thread.sleep(2000);
    	javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Status());
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Status());
		projectMasterObj.projectMaster_Status().click();
		
		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Save());
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
		projectMasterObj.projectMaster_Save().click();
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
    	projectMasterObj.projectMaster_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
    	projectMasterObj.projectMaster_SearchInputField().sendKeys(projectMasterTestDataType.RecordForStatusVerify);
    	while (true) {
			try {
				String status = projectMasterObj.projectMaster_DisplayStatus().getText();
				System.out.println("User changed Status to : " + status);
				break;
			} catch (Exception e) {
			}
		}
    }
    
    @Then("^click on edit button of record to modify in project master modify$")
    public void click_on_edit_button_of_record_to_modify_in_project_master_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
    	projectMasterObj.projectMaster_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
    	projectMasterObj.projectMaster_SearchInputField().sendKeys(projectMasterTestDataType.RecordForApprove);
    	Thread.sleep(2000);
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ModifiedRecordEditButton());
    	projectMasterObj.projectMaster_ModifiedRecordEditButton().click();
    	
//    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProjectInputField());
//    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys(Keys.chord(Keys.CONTROL,"A"));
//    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProjectInputField());
//    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys(Keys.BACK_SPACE);
    }

    @Then("^verify Address Details fields are displayed under Project Master Modify menu$")
    public void verify_address_details_fields_are_displayed_under_project_master_modify_menu() throws Throwable {
    	Thread.sleep(1000);
    	javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_AddressDetails());
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Address1());
    	boolean res=projectMasterObj.projectMaster_Address1().isDisplayed();
    	Assert.assertEquals(res, true);
    	boolean res1=projectMasterObj.projectMaster_Address2().isDisplayed();
    	Assert.assertEquals(res1, true);
    	boolean res2=projectMasterObj.projectMaster_Address3().isDisplayed();
    	Assert.assertEquals(res2, true);
    	boolean res3=projectMasterObj.projectMaster_Survey_No().isDisplayed();
    	Assert.assertEquals(res3, true);
    	boolean res4=projectMasterObj.projectMaster_Landmark().isDisplayed();
    	Assert.assertEquals(res4, true);
    	boolean res5=projectMasterObj.projectMaster_Street().isDisplayed();
    	Assert.assertEquals(res5, true);
    	boolean res6=projectMasterObj.projectMaster_Country().isDisplayed();
    	Assert.assertEquals(res6, true);
    	boolean res7=projectMasterObj.projectMaster_City().isDisplayed();
    	Assert.assertEquals(res7, true);
    	boolean res8=projectMasterObj.projectMaster_Pincode().isDisplayed();
    	Assert.assertEquals(res8, true);
    	boolean res9=projectMasterObj.projectMaster_SalesRelationshipManager().isDisplayed();
    	Assert.assertEquals(res9, true);
    	boolean res10=projectMasterObj.projectMaster_PhoneNo().isDisplayed();
    	Assert.assertEquals(res10, true);
    	boolean res11=projectMasterObj.projectMaster_MobileNo().isDisplayed();
    	Assert.assertEquals(res11, true);
    	boolean res12=projectMasterObj.projectMaster_TitleVerifiedBy().isDisplayed();
    	Assert.assertEquals(res12, true);
    	boolean res13=projectMasterObj.projectMaster_ApprovedBy().isDisplayed();
    	Assert.assertEquals(res13, true);
    	boolean res14=projectMasterObj.projectMaster_PlanApproved().isDisplayed();
    	Assert.assertEquals(res14, true);
    	javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_PlanApproved());
    	boolean res15=projectMasterObj.projectMaster_PlanApprovedDateCalendar().isDisplayed();
    	Assert.assertEquals(res15, true);
    	boolean res16=projectMasterObj.projectMaster_RuralUrbanClassification().isDisplayed();
    	Assert.assertEquals(res16, true);
    	boolean res17=projectMasterObj.projectMaster_BuiltArea().isDisplayed();
    	Assert.assertEquals(res17, true);
    	boolean res18=projectMasterObj.projectMaster_AnyChargeOnProject().isDisplayed();
    	Assert.assertEquals(res18, true);
    	boolean res19=projectMasterObj.projectMaster_BasicSalesPrice().isDisplayed();
    	Assert.assertEquals(res19, true);
    	boolean res20=projectMasterObj.projectMaster_AreaOfLandUnit().isDisplayed();
    	Assert.assertEquals(res20, true);
    	boolean res21=projectMasterObj.projectMaster_NameOfCompetitorsFundingProject().isDisplayed();
    	Assert.assertEquals(res21, true);
    	boolean res22=projectMasterObj.projectMaster_SourcingBranchYesNo().isDisplayed();
    	Assert.assertEquals(res22, true);
    	boolean res23=projectMasterObj.projectMaster_UnderConstruction().isDisplayed();
    	Assert.assertEquals(res23, true);
    	boolean res24=projectMasterObj.projectMaster_OverallPercentCompletion().isDisplayed();
    	Assert.assertEquals(res24, true);
    	boolean res25=projectMasterObj.projectMaster_OverAllPercentRecommendation().isDisplayed();
    	Assert.assertEquals(res25, true);
    	boolean res26=projectMasterObj.projectMaster_TentativeDateCompletion().isDisplayed();
    	Assert.assertEquals(res26, true);
    	javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_TentativeDateCompletion());
    	boolean res27=projectMasterObj.projectMaster_NameOfBeneficiary().isDisplayed();
    	Assert.assertEquals(res27, true);
    	boolean res28=projectMasterObj.projectMaster_AccountNumber().isDisplayed();
    	Assert.assertEquals(res28, true);
    	boolean res29=projectMasterObj.projectMaster_BankName().isDisplayed();
    	Assert.assertEquals(res29, true);
    	boolean res30=projectMasterObj.projectMaster_BranchName().isDisplayed();
    	Assert.assertEquals(res30, true);
    	boolean res31=projectMasterObj.projectMaster_IFSC_Code().isDisplayed();
    	Assert.assertEquals(res31, true);
    }
    

    @Then("^verify Payment Plans Details fields are displayed under Project Master Modify menu$")
    public void verify_payment_plans_details_fields_are_displayed_under_project_master_modify_menu() throws Throwable {
    	javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_PaymentPlansDetails());
    	boolean res1=projectMasterObj.projectMaster_CLP().isDisplayed();
    	Assert.assertEquals(res1, true);
    	boolean res2=projectMasterObj.projectMaster_ADF().isDisplayed();
    	Assert.assertEquals(res2, true);
    	boolean res3=projectMasterObj.projectMaster_Flexi().isDisplayed();
    	Assert.assertEquals(res3, true);
    	boolean res4=projectMasterObj.projectMaster_Subvention().isDisplayed();
    	Assert.assertEquals(res4, true);
    	boolean res5=projectMasterObj.projectMaster_SubventionType().isDisplayed();
    	Assert.assertEquals(res5, true);
    	boolean res6=projectMasterObj.projectMaster_SubventionPeriod().isDisplayed();
    	Assert.assertEquals(res6, true);
    	boolean res7=projectMasterObj.projectMaster_SubventionStartDate().isDisplayed();
    	Assert.assertEquals(res7, true);
    	boolean res8=projectMasterObj.projectMaster_SubventionEndDate().isDisplayed();
    	Assert.assertEquals(res8, true);
    	boolean res9=projectMasterObj.projectMaster_InterestToBeCollected().isDisplayed();
    	Assert.assertEquals(res9, true);
    	boolean res10=projectMasterObj.projectMaster_DiscountingRate().isDisplayed();
    	Assert.assertEquals(res10, true);
    	boolean res11=projectMasterObj.projectMaster_RateType().isDisplayed();
    	Assert.assertEquals(res11, true);
    	boolean res12=projectMasterObj.projectMaster_RateOfInterest().isDisplayed();
    	Assert.assertEquals(res12, true);
    }

    @Then("^verify Exposure Tracking Details fields are displayed under Project Master Modify menu$")
    public void verify_exposure_tracking_details_fields_are_displayed_under_project_master_modify_menu() throws Throwable {
    	javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_ExposureTrackingDetails());
    	boolean res1=projectMasterObj.projectMaster_MaxNoOfUnitsToBeFunded().isDisplayed();
    	Assert.assertEquals(res1, true);
    	boolean res2=projectMasterObj.projectMaster_MaxSanctionAmtForAll().isDisplayed();
    	Assert.assertEquals(res2, true);
    	boolean res3=projectMasterObj.projectMaster_MaxDisbursedAmtForAll().isDisplayed();
    	Assert.assertEquals(res3, true);
    	boolean res4=projectMasterObj.projectMaster_SanctionedAmount().isDisplayed();
    	Assert.assertEquals(res4, true);
    	boolean res5=projectMasterObj.projectMaster_DisbursedAmount().isDisplayed();
    	Assert.assertEquals(res5, true);
    	boolean res6=projectMasterObj.projectMaster_SanctionedNoOfUnits().isDisplayed();
    	Assert.assertEquals(res6, true);
    	boolean res7=projectMasterObj.projectMaster_TotalNoUnits().isDisplayed();
    	Assert.assertEquals(res7, true);
    	boolean res8=projectMasterObj.projectMaster_Apartment().isDisplayed();
    	Assert.assertEquals(res8, true);
    	boolean res9=projectMasterObj.projectMaster_CommercialSpace().isDisplayed();
    	Assert.assertEquals(res9, true);
    	boolean res10=projectMasterObj.projectMaster_Plot().isDisplayed();
    	Assert.assertEquals(res10, true);
    	boolean res11=projectMasterObj.projectMaster_StudioApartment().isDisplayed();
    	Assert.assertEquals(res11, true);
    	boolean res12=projectMasterObj.projectMaster_BuilderFloor().isDisplayed();
    	Assert.assertEquals(res12, true);
    	boolean res13=projectMasterObj.projectMaster_Villa().isDisplayed();
    	Assert.assertEquals(res13, true);
    	boolean res14=projectMasterObj.projectMaster_TechnicalConditions().isDisplayed();
    	Assert.assertEquals(res14, true);
    	boolean res15=projectMasterObj.projectMaster_Remarks().isDisplayed();
    	Assert.assertEquals(res15, true);
    	boolean res16=projectMasterObj.projectMaster_DocumentToBeCollectedFromRetailBorrower().isDisplayed();
    	Assert.assertEquals(res16, true);
        
    }

    @Then("^verify system allow user to modify the Project Master Modify before approved the record$")
    public void verify_system_allow_user_to_modify_the_project_master_modify_before_approved_the_record() throws Throwable {
    	javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_ProjectCode());
    	projectMasterObj.projectMaster_ProjectCode().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	projectMasterObj.projectMaster_ProjectCode().sendKeys("123456");
    	
    	
    }

    @Then("^verify system allow user to do modification on already approved record$")
    public void verify_system_allow_user_to_do_modification_on_already_approved_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
    	projectMasterObj.projectMaster_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
    	projectMasterObj.projectMaster_SearchInputField().sendKeys(projectMasterTestDataType.RecordForApprove);
    	Thread.sleep(2000);
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ModifiedRecordEditButton());
    	projectMasterObj.projectMaster_ModifiedRecordEditButton().click();
    }
    
    @Then("^verify system allow user to save modified record of project master with valid data$")
    public void verify_system_allow_user_to_save_modified_record_of_project_master_with_valid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
    	projectMasterObj.projectMaster_Save().click();
    	System.out.println("System allows user to to save modified record of project master with valid data");
    }

    
    @And("^select the modified record of project master from inbox to approve$")
    public void select_the_modified_record_of_project_master_from_inbox_to_approve() throws Throwable {
    	projectMasterObj.projectMaster_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInboxInputField());
    	projectMasterObj.projectMaster_SearchInboxInputField().sendKeys(projectMasterTestDataType.ApproveReferenceID);
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +projectMasterTestDataType.ApproveReferenceID+ afterxpath)).click();
    }
    
    
    
//    @Then("^user should verify the buttons available on screen while modify$")
//    public void user_should_verify_the_buttons_available_on_screen_while_modify() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductGroup());
//    	assertTrue(productMaster_RetailObj.productMaster_ProductGroup().isDisplayed());
//    	assertTrue(productMaster_RetailObj.productMaster_ProductCode().isDisplayed());
//    	assertTrue(productMaster_RetailObj.productMaster_ProductDescription().isDisplayed());
//    	assertTrue(productMaster_RetailObj.productMaster_RetailCorporate().isDisplayed());
//    	assertTrue(productMaster_RetailObj.productMaster_Product_DMCode().isDisplayed());
//    	assertTrue(productMaster_RetailObj.productMaster_Product_Save().isDisplayed());
//    	assertTrue(productMaster_RetailObj.productMaster_Product_Back().isDisplayed());
//    	System.out.println("The buttons available on screen while modify the Product Master are displayed");
//    }
//
//    @Then("^verify system should modify the record before approved$")
//    public void verify_system_should_modify_the_record_before_approved() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
//    	clicksAndActionsHelper.doubleClick(productMaster_RetailObj.productMaster_ProductDescription());
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription(), 5, 1);
//    	productMaster_RetailObj.productMaster_ProductDescription().sendKeys(productMaster_RetailTestDataType.ProductDescription1);
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
//    	productMaster_RetailObj.productMaster_Product_Save().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton());
//    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
//    	System.out.println("System allows user to modify before approved the record of the Product Master");
//    }
    
//    @And("^click on eye icon of product master$")
//	public void click_on_eye_icon_of_product_master() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_EyeIcon());
//    	productMaster_RetailObj.productMaster_EyeIcon().click();
//	}
//
//    @Then("^verify system should modify already approved record$")
//    public void verify_system_should_modify_already_approved_record() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
//        productMaster_RetailObj.productMaster_Product_Search().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
//        productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.Record1AfterApproved);
//    	String beforexpath = "(//span[contains(text(),'";
//		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
////      xpath-	(//span[contains(text(),'dep55')]/../../../td[1]/span[1]/button[1]/span[1])[1]
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.Record1AfterApproved+ afterxpath)).click();
//    	
//        waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
//        clicksAndActionsHelper.doubleClick(productMaster_RetailObj.productMaster_ProductDescription());
//        waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
//        productMaster_RetailObj.productMaster_ProductDescription().sendKeys(productMaster_RetailTestDataType.ProductDescription2);
//        System.out.println("System allows user to modify already approved record of the Product Master");
//    }
//
//    @Then("^verify system allow user to save modified record with valid data$")
//    public void verify_system_allow_user_to_save_modified_record_with_valid_data() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
//    	productMaster_RetailObj.productMaster_Product_Save().click();
//    	System.out.println("System allows user to to save modified record with valid data");
//    }
//    
//    @Then("^system should display the confirmation message$")
//    public void system_should_display_the_confirmation_message() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SaveConfirmationMessage());
//    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessage().isDisplayed();
//    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().isDisplayed();
//    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
//    	System.out.println("System should display the confirmation message");
//    }
//
    @Then("^click on inbox button of project master$")
    public void click_on_inbox_button_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Inbox());
    	projectMasterObj.projectMaster_Inbox().click();
    }
//    
//    @Then("^select the modified record from inbox to approve$")
//    public void select_the_modified_record_from_inbox_to_approve() throws Throwable {
////    	xpath - //span[contains(text(),'5640')]/../../td/button
//    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.ApproveReferenceID);
//    	String beforexpath = "//span[contains(text(),'";
//		String afterxpath = "')]/../../td/button";
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.ApproveReferenceID+ afterxpath)).click();
//    }
//    
//    @Then("^select the modified record from inbox to reject$")
//    public void select_the_modified_record_from_inbox_to_reject() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
//    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.RejectReferenceID);
//    	String beforexpath = "//span[contains(text(),'";
//		String afterxpath = "')]/../../td/button";
////		xpath - //span[contains(text(),'5767')]/../../td/button
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.RejectReferenceID+ afterxpath)).click();
//    }
//    
//    @Then("^select the modified record from inbox to return$")
//    public void select_the_modified_record_from_inbox_to_return() throws Throwable {
////    	xpath - //span[contains(text(),'5640')]/../../td/button
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
//    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.ReturnReferenceID);
//    	String beforexpath = "//span[contains(text(),'";
//		String afterxpath = "')]/../../td/button";
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.ReturnReferenceID+ afterxpath)).click();
//    }
//
//    @Then("^click on submit button$")
//    public void click_on_submit_button() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Maker_Submit());
//    	productMaster_RetailObj.productMaster_Product_Maker_Submit().click();
//    	
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_MakerSubmitRemark());
//    	productMaster_RetailObj.productMaster_Product_MakerSubmitRemark().sendKeys(productMaster_RetailTestDataType.MakerSubmitRemark);
//    	
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Submit());
//    	productMaster_RetailObj.productMaster_Product_FinalSubmit().click();
//        
//    }
//
//    @Then("^system should display confirmation message after submit$")
//    public void system_should_display_confirmation_message_after_submit() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessage());
//    	productMaster_RetailObj.productMaster_Product_ConfirmationMessage().isDisplayed();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
//    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().isDisplayed();
//    	System.out.println("System is displaying confirmation message after submit");
//    }
//    
//    @Then("^capture checker ID$")
//    public void capture_checker_ID() throws Throwable {
//    	String message = productMaster_RetailObj.productMaster_Product_ConfirmationMessage().getText();
//    	String emptystring = "";
//		String ar[] = message.split(" ");
//		emptystring=ar[ar.length-1];
//		String checkerID=emptystring.replaceAll("[/.]", "");
//		System.out.println(checkerID);
//		jsonDataReaderWriter.addData(checkerID);
//		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
//    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
//    }
//    
    @Then("^logout user from the application$")
    public void logout_user_from_the_application() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Profile());
    	projectMasterObj.projectMaster_Profile();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_LogoutUser());
    	projectMasterObj.projectMaster_LogoutUser().click();
    }
//    
//    @Then("^click on edit button of record2 to modify$")
//    public void click_on_edit_button_of_record2_to_modify() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
//    	productMaster_RetailObj.productMaster_Product_Search().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.Record2ForReject);
//    	String beforexpath = "(//span[contains(text(),'";
//		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
////    	xpath - (//span[contains(text(),'desc17')]/../../../td[1]/span[1]/button[1]/span[1])[1]
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record2ForReject + afterxpath)).click();
//    	
//    }
//    
//    @Then("^click on edit button of record3 to modify$")
//    public void click_on_edit_button_of_record3_to_modify() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
//    	productMaster_RetailObj.productMaster_Product_Search().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.Record3ForReturn);
//    	String beforexpath = "(//span[contains(text(),'";
//		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
////    	xpath - (//span[contains(text(),'depo30')]/../../../td[1]/span[1]/button[1]/span[1])[1]
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record3ForReturn + afterxpath)).click();
//    }
//    
//////////////////////////////////////////////////////////////////////////////////
//   
    @And("^User Login as checker user$")
    public void user_login_as_checker_user() throws Throwable {
		kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
    }
//    
//    @Then("^click on menu button$")
//    public void click_on_menu_button() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_MenuToggle());
//    	productMaster_RetailObj.productMaster_Product_Checker_MenuToggle().click();
//    }
//    
//    @Then("^select the modified record to approve$")
//    public void select_the_modified_record_to_approve() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
//    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.ApproveReferenceID);
//    	String beforexpath = "//span[contains(text(),'";
//		String afterxpath = "')]/../../td/button";
////		xpath - //span[contains(text(),'5550')]/../../td[1]/button
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.ApproveReferenceID+ afterxpath)).click();
//    
//    }
//
    @Then("^select approve button in checker stage of project master$")
    public void select_approve_button_in_checker_stage_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_Approve());
    	projectMasterObj.projectMaster_Checker_Approve().click();
    }
//
//    @Then("^enter remark for approve$")
//    public void enter_remark_for_approve() throws Throwable {
////    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveRemark());
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveRemark(), 10, 2);
//    	productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveRemark().sendKeys(productMaster_RetailTestDataType.CheckerApproveRemark);
//    }
//
    @Then("^click on approve button to approve project master record$")
    public void click_on_approve_button_to_approve_project_master_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_CheckerApproveButton());
    	projectMasterObj.projectMaster_Checker_CheckerApproveButton().click();
    }
//
    @Then("^system should display confirmation message after approved the record of project master$")
    public void system_should_display_confirmation_message_after_approved_the_record_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessage());
    	projectMasterObj.projectMaster_ConfirmationMessage().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessageCloseButton());
    	projectMasterObj.projectMaster_ConfirmationMessageCloseButton().click();
    }
//    
//    @Then("^select the modified record to reject$")
//    public void select_the_modified_record_to_reject() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
//    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.RejectReferenceID);
//    	String beforexpath = "//span[contains(text(),'";
//		String afterxpath = "')]/../../td/button";
////		xpath - //span[contains(text(),'5550')]/../../td[1]/button
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.RejectReferenceID+ afterxpath)).click();
//    }
//
    @Then("^select reject button in checker stage of project master$")
    public void select_reject_button_in_checker_stage_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_Reject());
    	projectMasterObj.projectMaster_Checker_Reject().click();
    }
//
//    @Then("^enter remark for reject$")
//    public void enter_remark_for_reject() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectRemark());
//    	productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectRemark().sendKeys(productMaster_RetailTestDataType.CheckerRejectRemark);;
//    }
//    
    @Then("^click on reject button to reject project master record$")
    public void click_on_reject_button_to_reject_project_master_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_CheckerRejectButton());
    	projectMasterObj.projectMaster_Checker_CheckerRejectButton().click();
    }
//
    @Then("^system should display confirmation message after reject the record of project master$")
    public void system_should_display_confirmation_message_after_reject_the_record_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessage());
    	projectMasterObj.projectMaster_ConfirmationMessage().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessageCloseButton());
    	projectMasterObj.projectMaster_ConfirmationMessageCloseButton().click();
    }
//    
//    @Then("^select the modified record to return$")
//    public void select_the_modified_record_to_return() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
//    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.ReturnReferenceID);
//    	String beforexpath = "//span[contains(text(),'";
//		String afterxpath = "')]/../../td/button";
////		xpath - //span[contains(text(),'5550')]/../../td[1]/button
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.ReturnReferenceID+ afterxpath)).click();
//    
//    }
//
    @Then("^select return button in checker stage of project master$")
    public void select_return_button_in_checker_stage_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_Return());
    	projectMasterObj.projectMaster_Checker_Return().click();;
    }
//
//    @Then("^enter remark for return$")
//    public void enter_remark_for_return() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnRemark());
//    	productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnRemark().sendKeys(productMaster_RetailTestDataType.CheckerReturnRemark);
//    }
//    
    @Then("^click on return button to return project master record$")
    public void click_on_return_button_to_return_project_master_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_CheckerReturnButton());
    	projectMasterObj.projectMaster_Checker_CheckerReturnButton().click();
    }
//
    @Then("^system should display confirmation message after return the record of project master$")
    public void system_should_display_confirmation_message_after_return_the_record_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessage());
    	projectMasterObj.projectMaster_ConfirmationMessage().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessageCloseButton());
    	projectMasterObj.projectMaster_ConfirmationMessageCloseButton().click();
    }
//    
//    /////////////////////////////////////////////////////////////////////////////
//    
//    @Then("^verify proper validation message for blank field should display$")
//    public void verify_proper_validation_message_for_blank_field_should_display() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
//    	clicksAndActionsHelper.doubleClick(productMaster_RetailObj.productMaster_ProductDescription());
//    	productMaster_RetailObj.productMaster_ProductDescription().sendKeys(Keys.BACK_SPACE);
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
//    	productMaster_RetailObj.productMaster_Product_Save().click();
//    	
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ProductDescriptionFieldValidation());
//    	productMaster_RetailObj.productMaster_Product_ProductDescriptionFieldValidation().isDisplayed();
//   
//    }
//
//    @Then("^verify system should not allow to enter invalid datatypes while modification$")
//    public void verify_system_should_not_allow_to_enter_invalid_datatypes_while_modification() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Remark());
//    	clicksAndActionsHelper.doubleClick(productMaster_RetailObj.productMaster_Product_Remark());
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Remark());
//    	productMaster_RetailObj.productMaster_Product_Remark().sendKeys("*");
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage());
//    	String validationmsg = productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage().getText();
//    	System.out.println("Invalid datatype validation message - "+validationmsg);
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage());
//    	productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage().isDisplayed();
//    	
//    }
//    
//    /////////////////////////////////////////////////////////////////////////////
//    
//    @Then("^verify the functionality of status of the record$")
//    public void verify_the_functionality_of_status_of_the_record() throws Throwable {
//    	while (true) {
//			try {
//				String beforexpath = "//span[contains(text(),'";
//				String afterxpath = "')]/../../../td[6]/p-celleditor/p-tag/span";
//				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).isDisplayed();
//				break;
//			} catch (Exception e) {
//				try{
//					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
//					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
//				}catch(Exception ee) {
//					System.out.println("Record is not available");
//					break;
//				}
//			}
//		}
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_DisplayStatus());
//    	productMaster_RetailObj.productMaster_Product_DisplayStatus().isDisplayed();
//    	String status = productMaster_RetailObj.productMaster_Product_DisplayStatus().getText();
//    	System.out.println("Status of the record " +productMaster_RetailTestDataType.Record1BeforeApproved+ " in list view : "+status);
//    	
//    }
//
//    @Then("^verify user can able to change the status from active to deactive$")
//    public void verify_user_can_able_to_change_the_status_from_active_to_deactive() throws Throwable {
//    	//span[contains(text(),'98303275')]/../../../td[1]/span[1]/button[1]/span[1])[1]
//		while (true) {
//			try {
//				String beforexpath = "(//span[contains(text(),'";
//				String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
//				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).click();
//				break;
//			} catch (Exception e) {
//				try{
//					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
//					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
//				}catch(Exception ee) {
//					System.out.println("Record is not available");
//					break;
//				}
//			}
//		}
//		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Status());
//		productMaster_RetailObj.productMaster_Product_Status().click();
//		
//		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
//		productMaster_RetailObj.productMaster_Product_Save().click();
//		
//		while (true) {
//			try {
//				String beforexpath = "//span[contains(text(),'";
//				String afterxpath = "')]/../../../td[6]/p-celleditor/p-tag/span";
//				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).isDisplayed();
//				break;
//			} catch (Exception e) {
//				try{
//					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
//					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
//				}catch(Exception ee) {
//					System.out.println("Record is not available");
//					break;
//				}
//			}
//		}
//		while (true) {
//			try {
//				String status = productMaster_RetailObj.productMaster_Product_DisplayStatus().getText();
//				System.out.println("User changed Status to : " + status);
//				break;
//			} catch (Exception e) {
//			}
//		}
//		
//    }
//    
//
//    @Then("^verify user can able to change the status from deactive to active$")
//    public void verify_user_can_able_to_change_the_status_from_deactive_to_active() throws Throwable {
//    	//span[contains(text(),'98303275')]/../../../td[1]/span[1]/button[1]/span[1])[1]
//		while (true) {
//			try {
//				String beforexpath = "(//span[contains(text(),'";
//				String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
//				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).click();
//				break;
//			} catch (Exception e) {
//				try{
//					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
//					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
//				}catch(Exception ee) {
//					System.out.println("Record is not available");
//					break;
//				}
//			}
//		}
//		
//		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Status());
//		productMaster_RetailObj.productMaster_Product_Status().click();
//		
//		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
//		productMaster_RetailObj.productMaster_Product_Save().click();
//		
//		while (true) {
//			try {
//				String beforexpath = "//span[contains(text(),'";
//				String afterxpath = "')]/../../../td[6]/p-celleditor/p-tag/span";
//				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).isDisplayed();
//				break;
//			} catch (Exception e) {
//				try{
//					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
//					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
//				}catch(Exception ee) {
//					System.out.println("Record is not available");
//					break;
//				}
//			}
//		}
//    	while (true) {
//			try {
//				String status = productMaster_RetailObj.productMaster_Product_DisplayStatus().getText();
//				System.out.println("User changed Status to : " + status);
//				break;
//			} catch (Exception e) {
//			}
//		}
//    }
//
//    @Then("^verify the functionality of back button of product master$")
//    public void verify_the_functionality_of_back_button_of_product_master() throws Throwable {
//    	while (true) {
//			try {
//				String beforexpath = "(//span[contains(text(),'";
//				String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
//				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).click();
//				break;
//			} catch (Exception e) {
//				try{
//					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
//					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
//				}catch(Exception ee) {
//					System.out.println("Record is not available");
//					break;
//				}
//			}
//		}
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Back());
//    	productMaster_RetailObj.productMaster_Product_Back().click();
//    	
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ProductMasterTitle());
//    	productMaster_RetailObj.productMaster_Product_ProductMasterTitle().isDisplayed();
//    	
//    }
//    
//    ///////////////////////////////////////////////////////////////////////////
//    
//    @Then("^verify product master details list view fields should display all the fields$")
//    public void verify_product_master_details_list_view_fields_should_display_all_the_fields() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_AddButton());
//    	productMaster_RetailObj.productMaster_AddButton().isDisplayed();
//    	productMaster_RetailObj.productMaster_Product_Search().isDisplayed();
//    	productMaster_RetailObj.productMaster_Product_Export().isDisplayed();
//    	
//    	productMaster_RetailObj.productMaster_Product_Export().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_PdfFile());
//    	productMaster_RetailObj.productMaster_Product_PdfFile().isDisplayed();
//    	productMaster_RetailObj.productMaster_Product_XlsFile().isDisplayed();
//    	productMaster_RetailObj.productMaster_Product_Export().click();
//    	
//    	productMaster_RetailObj.productMaster_ListViewProductGroup().isDisplayed();
//    	productMaster_RetailObj.productMaster_ListViewProductCode().isDisplayed();
//    	productMaster_RetailObj.productMaster_ListViewProductDescription().isDisplayed();
//    	productMaster_RetailObj.productMaster_ListViewRetailCorporate().isDisplayed();
//    	productMaster_RetailObj.productMaster_ListViewStatus().isDisplayed();
//    	
//    }
//
//    @Then("^values in list view should not be editable$")
//    public void values_in_list_view_should_not_be_editable() throws Throwable {
//    	try {
//    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductGroup().sendKeys("ok");
//    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductCode().sendKeys("ok");
//    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductDescription().sendKeys("ok");
//    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfRetailandCorporate().sendKeys("ok");
//    		System.out.println("Values in list view is editable");
//    		
//    	}catch(Exception e) {
//    		System.out.println("Values in list view is not editable");
//    	}
//    }
//
//    @Then("^verify add button should allow to create new record$")
//    public void verify_add_button_should_allow_to_create_new_record() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_AddButton());
//    	productMaster_RetailObj.productMaster_AddButton().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
//    	productMaster_RetailObj.productMaster_Product_Save().isDisplayed();
////    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Back());
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Back(), 10, 2);
//    	productMaster_RetailObj.productMaster_Product_Back().click();
//    }
//
//    @Then("^verify search box should display matching record with matched data$")
//    public void verify_search_box_should_display_matching_record_with_matched_data() throws Throwable {
//		while (true) {
//			try {
//				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
//				productMaster_RetailObj.productMaster_Product_Search().click();
//				break;
//			} catch (StaleElementReferenceException se) {
//
//			}
//		}
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys("desc30");
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductCode_desc30());
//    	String productcode = productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductCode_desc30().getText();
//    	Assert.assertEquals("desc30", productcode);
//    	//    	boolean result = productcode.equalsIgnoreCase("desc30");
//    }
//
//    @Then("^verify search box should not display any record with mismatched data$")
//    public void verify_search_box_should_not_display_any_record_with_mismatched_data() throws Throwable {
//    	clicksAndActionsHelper.doubleClick(productMaster_RetailObj.productMaster_Product_SearchInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys("412379");
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NoDataFoundInSearch());
//    	productMaster_RetailObj.productMaster_Product_NoDataFoundInSearch().isDisplayed();
//    	productMaster_RetailObj.productMaster_Product_SearchCloseButton().click();
//    	
//    }
//
//    @Then("^click on export to pdf button system should download Pdf file$")
//    public void click_on_export_to_pdf_button_system_should_download_pdf_file() throws Throwable {
//    	productMaster_RetailObj.productMaster_Product_Export().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_PdfFile());
//    	productMaster_RetailObj.productMaster_Product_PdfFile().click();
//    	browserHelper.SwitchToWindow(1);
//    	browserHelper.switchToParentWithChildClose();
//    }
//
//    @Then("^click on export to excel button system should download Excel file$")
//    public void click_on_export_to_excel_button_system_should_download_excel_file() throws Throwable {
//    	while (true) {
//			try {
//				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Export());
//	    		productMaster_RetailObj.productMaster_Product_Export().click();
//				break;
//			} catch (StaleElementReferenceException se) {
//
//			}
//		}
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_XlsFile());
//    	productMaster_RetailObj.productMaster_Product_XlsFile().click();
//    }
//
//    @Then("^system should show product group field and the field will display only$")
//    public void system_should_show_product_group_field_and_the_field_will_display_only() throws Throwable {
//    	boolean result = productMaster_RetailObj.productMaster_ListViewProductGroup().isDisplayed();
//    	System.out.println("System is showing product group field - "+result);
//    	
//    	try {
//    		productMaster_RetailObj.productMaster_ListViewProductGroup().sendKeys("ok");
//    		System.out.println("Product Group Field in list view is not editable");
//    	}catch(Exception e) {
//    		System.out.println("Product Group Field in list view is not editable");
//    	}
//    }
//
//    @Then("^system should show product code field and the field will display only$")
//    public void system_should_show_product_code_field_and_the_field_will_display_only() throws Throwable {
//    	boolean result = productMaster_RetailObj.productMaster_ListViewProductCode().isDisplayed(); 
//    	System.out.println("System is showing product code field - "+result);
//    	try {
//    		productMaster_RetailObj.productMaster_ListViewProductCode().sendKeys("ok");
//    		System.out.println("Product Code Field in list view is not editable");
//    	}catch(Exception e) {
//    		System.out.println("Product Code Field in list view is not editable");
//    	}
//    }
//
//    @Then("^system should show product description field and the field will display only$")
//    public void system_should_show_product_description_field_and_the_field_will_display_only() throws Throwable {
//    	boolean result = productMaster_RetailObj.productMaster_ListViewProductDescription().isDisplayed();
//    	System.out.println("System is showing product description field - "+result);
//    	try {
//    		productMaster_RetailObj.productMaster_ListViewProductDescription().sendKeys("ok");
//    		System.out.println("Product Description Field in list view is not editable");
//    		
//    	}catch(Exception e) {
//    		System.out.println("Product Description Field in list view is not editable");
//    	}
//    }
//
//    @Then("^system should show retail or corporate field and the field will display only$")
//    public void system_should_show_retail_or_corporate_field_and_the_field_will_display_only() throws Throwable {
//    	boolean result = productMaster_RetailObj.productMaster_ListViewRetailCorporate().isDisplayed();
//    	System.out.println("System is showing retail or corporate field - "+result);
//    	try {
//    		productMaster_RetailObj.productMaster_ListViewRetailCorporate().sendKeys("ok");
//    		System.out.println("Retail or Corporate Field in list view is not editable");
//    		
//    	}catch(Exception e) {
//    		System.out.println("Retail or Corporate Field in list view is not editable");
//    	}
//    }
//
//    @Then("^system should show status field and the field will display only$")
//    public void system_should_show_status_field_and_the_field_will_display_only() throws Throwable {
//    	boolean result = productMaster_RetailObj.productMaster_ListViewStatus().isDisplayed();
//    	System.out.println("System is showing status field - "+result);
//    	try {
//    		productMaster_RetailObj.productMaster_ListViewStatus().sendKeys("ok");
//    		System.out.println("Status Field in list view is not editable");
//    		
//    	}catch(Exception e) {
//    		System.out.println("Status Field in list view is not editable");
//    	}
//    }
//    
////    ---------------------------------------------------------------------------------------------------
////    ---------------------------------------------------------------------------------------------------
//    
//    @Then("^click on Product Setup$")
//    public void click_on_product_setup()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver,productMaster_RetailObj.product_Setup(), 60, 1);
//	productMaster_RetailObj.product_Setup().click();   
//    }
//
//    @Then("^click on Product Master eye icon$")
//    public void click_on_product_master_eye_icon()  {
//    //waithelper.waitForElement(driver, 2000, productMaster_RetailObj.productMaster_EyeIcon());
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_EyeIcon(), 60, 1);
//    productMaster_RetailObj.productMaster_EyeIcon().click();   
//    }
//
//    @Then("^click on Product Master add button$")
//    public void click_on_product_master_add_button() throws InterruptedException  {
//    	
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_AddButton(), 60, 2);
//    productMaster_RetailObj.productMaster_AddButton().isDisplayed();
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		productMaster_RetailObj.productMaster_AddButton().click(); 
//    	    break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//     
//    
//    }
//
//    @Then("^verify functionality and asterik mark of the field Product Group$")
//    public void verify_functionality_and_asterik_mark_of_the_field_product_group()  {
//    //ProductGroup
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductGroup(), 60, 2);
//    productMaster_RetailObj.productMaster_ProductGroup().isDisplayed();
//   
//    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Product Group");
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		productMaster_RetailObj.productMaster_ProductGroup().click();
//    	      break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductGroup_Dropdown(), 60, 2);
//    
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		productMaster_RetailObj.productMaster_ProductGroup_Dropdown().click(); 
//    	      break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//    }
//
//    @Then("^verify functionality and asterik mark of the field Product Code$")
//    public void verify_functionality_and_asterik_mark_of_the_field_product_code()  {
//    //ProductCode
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductCode(), 60, 2);
//    productMaster_RetailObj.productMaster_ProductCode().isDisplayed();
//    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Product Code");
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		productMaster_RetailObj.productMaster_ProductCode().click();
//    		productMaster_RetailObj.productMaster_ProductCode().sendKeys(productMaster_RetailTestDataType.ProductCode);
//    	      break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//    
//    }
//    
//    @Then("^Enter Product Code for Return$")
//    public void enter_product_code_for_return()  {
//    //ProductCode for Return the record
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductCode(), 60, 2);
//    productMaster_RetailObj.productMaster_ProductCode().isDisplayed(); 
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		productMaster_RetailObj.productMaster_ProductCode().click(); 
//    	    productMaster_RetailObj.productMaster_ProductCode().sendKeys(productMaster_RetailTestDataType.ProductCodeReturn);
//
//    	    break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//           
//    }
//    @Then("^Enter Product Code for reject$")
//    public void enter_product_code_for_reject()  {
//    //ProductCode for Reject the record
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductCode(), 60, 2);
//    productMaster_RetailObj.productMaster_ProductCode().isDisplayed(); 
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		productMaster_RetailObj.productMaster_ProductCode().click(); 
//    	    productMaster_RetailObj.productMaster_ProductCode().sendKeys(productMaster_RetailTestDataType.ProductCodeReject);
//    	    break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//           
//    }
//
//    @Then("^Enter Product Description$")
//    public void enter_product_description()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescriptionEnter(), 30, 2);
//    productMaster_RetailObj.productMaster_ProductDescriptionEnter().isDisplayed();
//    waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductCode());
//    
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		productMaster_RetailObj.productMaster_ProductDescriptionEnter().click(); 
//    	    productMaster_RetailObj.productMaster_ProductDescriptionEnter().sendKeys(productMaster_RetailTestDataType.DescriptionEnglish);
//    	    break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//    
//   
//    }
//    
//    //-------------Multi language description----------//
//    
//    @Then("^verify functionality and asterik mark of the field Product Description$")
//    public void verify_functionality_and_asterik_mark_of_the_field_product_description()  {
//    //ProductDescription
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescriptionAdd(), 60, 2);
//    productMaster_RetailObj.productMaster_ProductDescriptionAdd().isDisplayed();
//    productMaster_RetailObj.productMaster_ProductDescriptionAdd().click();
//    
//    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Product Description");
//    
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription_English(), 60, 2);
//    productMaster_RetailObj.productMaster_ProductDescription_English().sendKeys(productMaster_RetailTestDataType.DescriptionEnglish);
//    productMaster_RetailObj.productMaster_ProductDescription_English().sendKeys(Keys.ENTER);
//    	
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription_French(), 60, 2);
//    productMaster_RetailObj.productMaster_ProductDescription_French().sendKeys(productMaster_RetailTestDataType.DescriptionFrench);
//    productMaster_RetailObj.productMaster_ProductDescription_French().sendKeys(Keys.ENTER);
//    	
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription_German(), 60, 2);
//    productMaster_RetailObj.productMaster_ProductDescription_German().sendKeys(productMaster_RetailTestDataType.DescriptionGerman);
//    productMaster_RetailObj.productMaster_ProductDescription_German().sendKeys(Keys.ENTER);
//    	
//    waithelper.waitForElementToVisibleWithFluentWait(driver,productMaster_RetailObj.productMaster_ProductDescription_Arabic(), 60, 2);
//    productMaster_RetailObj.productMaster_ProductDescription_Arabic().sendKeys(productMaster_RetailTestDataType.DescriptionArabic);
//    productMaster_RetailObj.productMaster_ProductDescription_Arabic().sendKeys( Keys.ENTER); 
//    
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription_Save(), 60, 2);
//    productMaster_RetailObj.productMaster_ProductDescription_Save().isDisplayed();
//    productMaster_RetailObj.productMaster_ProductDescription_Save().click();
//    }
//
//    @Then("^verify functionality and asterik mark of the field RetailCorporate$")
//    public void verify_functionality_and_asterik_mark_of_the_field_retailcorporate()  {
//    //RetailCorporate
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_RetailCorporate(), 60, 2);
//    productMaster_RetailObj.productMaster_RetailCorporate().isDisplayed();
//    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Retail/Corporate");
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		productMaster_RetailObj.productMaster_RetailCorporate().click(); 
//    	      break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//        
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_RetailCorporate_Dropdown(), 60, 2);
//    productMaster_RetailObj.productMaster_RetailCorporate_Dropdown().isDisplayed();
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		productMaster_RetailObj.productMaster_RetailCorporate_Dropdown().click(); 
//    	      break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }        
//    }
//
//    @Then("^verify functionality of the field DM Code$")
//    public void verify_functionality_of_the_field_dm_code()  {
//    //DMCode
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_DMCode(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_DMCode().isDisplayed();
//    waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_DMCode());
//    
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		 productMaster_RetailObj.productMaster_Product_DMCode().click();
//    		 productMaster_RetailObj.productMaster_Product_DMCode().sendKeys(productMaster_RetailTestDataType.DMCode);
//    	      break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//   
//    
//    }
//
//    @Then("^verify the field Remarks$")
//    public void verify_the_field_remarks()  {
//    //Remarks
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Remark(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_Remark().isDisplayed();
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		 productMaster_RetailObj.productMaster_Product_Remark().click();
//    		 productMaster_RetailObj.productMaster_Product_Remark().sendKeys(productMaster_RetailTestDataType.Remarks);
//    		 break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//       
//    
//    }
//
//    @Then("^verify the functionality of Back button$")
//    public void verify_the_functionality_of_back_button()  {
//    //Back
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Back(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_Back().isDisplayed();
//    productMaster_RetailObj.productMaster_Product_Back().click();
//   
//    }
    
    //Save
    @Then("^click on save button in project master$")
    public void click_on_save_button_in_project_master()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_Save(), 60, 2);
    projectMasterObj.projectMaster_Save().isDisplayed();
    projectMasterObj.projectMaster_Save().click();
  
    }
//    
//    
//    //---------------------validating----------------------------------------------------//
//
//    @Then("^validate the impact of any mandatory field blank$")
//    public void validate_the_impact_of_any_mandatory_field_blank()  {
//    	
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ValidationRequiredField(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_ValidationRequiredField().isDisplayed();
//    }
//    
//  //------------------------Remarks with special characters value-------------------------//
//    
//    @Then("^verify the field Remarks with special characters value$")
//    public void verify_the_field_remarks_with_special_characters_value()  {
//    //Remarks
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Remark(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_Remark().isDisplayed();
//    
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		productMaster_RetailObj.productMaster_Product_Remark().click();
//    	    productMaster_RetailObj.productMaster_Product_Remark().sendKeys(productMaster_RetailTestDataType.SymbolicRemark);         
//    	      break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//    
//    }
//    @Then("^validate the impact of special characters value in any field$")
//    public void validate_the_impact_of_special_characters_value_in_any_field()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ValidationAlphanumeric(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_ValidationAlphanumeric().isDisplayed();  
//    }
//    
//    @Then("^validate Success pop up$")
//    public void validate_success_pop_up()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SuccessValidation(), 60, 5);
//    productMaster_RetailObj.productMaster_Product_SuccessValidation().isDisplayed();
//    String msg = productMaster_RetailObj.productMaster_Product_SuccessValidation().getText();
//	System.out.println(msg);
//	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton());
//	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
//    }
//    
//    @Then("^click on Menu$")
//    public void click_on_menu()  {
//    //Menu
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Menu(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_Menu().click();  
//    	    
//    }
//
//    @Then("^click on inbox$")
//    public void click_on_inbox()  {
//    //Inbox
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Inbox(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_Inbox().click();  
//    }
//    @Then("^click on search icon of record list$")
//    public void click_on_search_icon_of_record_list()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchRecordList(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_SearchRecordList().click();
//    }
//    @Then("^search Project Master Retail record$")
//    public void search_project_master_retail_record()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
//    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.EventCode);
//             
//    }
//    
//    @And("^maker user open the record from inbox$")
//    public void maker_user_open_the_record_from_inbox() throws IOException, ParseException  {
//    
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ReferanceId(), 60, 2);
//    referenceID = productMaster_RetailObj.productMaster_Product_ReferanceId().getText();
//    jsonDataReaderWriter.addReferanceData(referenceID);
//    System.out.println("reference Id " +referenceID);
//  
//    
//	String beforeXpath = "//span[contains(text(),'";
//	String afterXpath = "')]/../../td/button";
//	
//    WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+jsonDataReaderWriter.readReferancedata()+afterXpath));
//    waithelper.waitForElementToVisibleWithFluentWait(driver, firstRecord, 60, 2);
//    for (int i = 0; i<20; i++)
//    {
//    	try {
//    		firstRecord.click(); 
//    	    break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
//	 
//
//    }
//    
//
//
//    @Then("^maker user submit the Record$")
//    public void maker_user_submit_the_record() throws IOException  {
//    //Submit the record from maker
//    
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Submit(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_Submit().click();
//    
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SubmitRemark(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_SubmitRemark().click();
//        
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SubmitRemark(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_FinalSubmit().click();  
//    
//    
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 5);
//    String message = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
//	System.out.println(message);
//	productMaster_RetailObj.productMaster_Product_Checker_Id().click();
//	String emptystring = "";
//	String ar[] = message.split(" ");
//	emptystring=ar[ar.length-1];
//	String cheID=emptystring.replaceAll("[/.]", "");
//	System.out.println(cheID);
//	
//	jsonDataReaderWriter=new JsonDataReaderWriter();
//	jsonDataReaderWriter.addData(cheID);
//	
//    }
//   
//    @Then("^user logout from the application$")
//    public void user_logout_from_the_application()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Logout(), 60, 5);
//    productMaster_RetailObj.productMaster_Product_Logout().click();     
//    }
//
//    @Then("^checker user open the record from inbox$")
//    public void checker_user_open_the_record_from_inbox() throws IOException, ParseException  {
//    	System.out.println("reference Id "+referenceID);
//    	String beforeXpath = "//span[contains(text(),'";
//    	String afterXpath = "')]/../../td/button";
//    	WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+jsonDataReaderWriter.readReferancedata()+afterXpath));
//        waithelper.waitForElementToVisibleWithFluentWait(driver, firstRecord, 60, 2);
////        for (int i = 0; i<20; i++)
//        while(true){
//        {
//        	try {
//        		firstRecord.click(); 
//        	    break;
//        	    }
//        	catch(Exception e) { 
//        		
//        	}
//        }}
//    	
//    }
//    
//
//    @Then("^checker user approve the record$")
//    public void checker_user_approve_the_record()  {
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Approve(), 60, 2);  
//    	productMaster_RetailObj.productMaster_Product_Checker_Approve().click();
//    	
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ApproveRemark(), 60, 2);  
//    	productMaster_RetailObj.productMaster_Product_Checker_ApproveRemark().click();
//    	
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ApproveAlert(), 60, 2);
//    	productMaster_RetailObj.productMaster_Product_Checker_ApproveAlert().click(); 
//  
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 5);
//    	String makerId = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
//    	System.out.println(makerId);
//    	productMaster_RetailObj.productMaster_Product_Checker_Alert_Close().click();
//    	
//    }
//   @Then("^checker user return the record$")
//    public void checker_user_return_the_record()  {
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Return(), 60, 2);  
//    	productMaster_RetailObj.productMaster_Product_Checker_Return().click();
//    	
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ReturnRemark(), 60, 2);  
//    	productMaster_RetailObj.productMaster_Product_Checker_ReturnRemark().click();
//    	
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ReturnAlert(), 60, 2);
//    	productMaster_RetailObj.productMaster_Product_Checker_ReturnAlert().click(); 
//    	
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 5);
//    	String makerId = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
//    	System.out.println(makerId);
//    	productMaster_RetailObj.productMaster_Product_Checker_Alert_Close().click();
//    	         
//    }
//    
//    
//    @Then("^checker user reject the record$")
//    public void checker_user_reject_the_record()  {
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Reject(), 60, 2);  
//    	productMaster_RetailObj.productMaster_Product_Checker_Reject().click();
//    	
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_RejectRemark(), 60, 2);  
//    	productMaster_RetailObj.productMaster_Product_Checker_RejectRemark().click();
//    	
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_RejectAlert(), 60, 2);
//    	productMaster_RetailObj.productMaster_Product_Checker_RejectAlert().click();
//    	
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 5);
//    	String makerId = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
//    	System.out.println(makerId);
//    	productMaster_RetailObj.productMaster_Product_Checker_Alert_Close().click();
//    
//    }
//
//    
//    
//    //-----------------------search---------------//
//    
//    @Then("^search approved record$")
//    public void search_approved_record()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
//    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.ProductCode);
//     
//    }
//
//    @Then("^close the search input field$")
//    public void close_the_search_input_field()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputFieldClose(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_SearchInputFieldClose().click();   
//       
//    }
//    
//    @Then("^search Rejected record$")
//    public void search_rejected_record()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
//    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.ProductCodeReject);
//        
//    }
//    
//    //---------------view summary----------------//
//    @Then("^click on Product Master edit icon$")
//    public void click_on_product_master_edit_icon()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.ProductMaster_Product_Edit(), 60, 2);
//    productMaster_RetailObj.ProductMaster_Product_Edit().click();   
//    }
//
//    @Then("^click on search icon$")
//    public void click_on_search_icon()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Search(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_Search().click();     
//    }
//
//    @Then("^search the record$")
//    public void search_the_record()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
//    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.ProductCodeReturn);
//    
//    }
//    @Then("^open the record$")
//    public void open_the_record()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.ProductMaster_Product_ActionEdit(), 60, 2);
//    productMaster_RetailObj.ProductMaster_Product_ActionEdit().click();      
//    }
//
//    @Then("^click on view summary$")
//    public void click_on_view_summary()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummary(), 60, 2);
//    WebElement viewsummary = productMaster_RetailObj.productMaster_Product_ViewSummary(); 
//    clicksAndActionsHelper.JSEClick(viewsummary);
//    }
//    
//
//    @Then("^verify the fields of view summary$")
//    public void verify_the_fields_of_view_summary()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryUser(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_ViewSummaryUser().isDisplayed();  
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryStageCode(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_ViewSummaryStageCode().isDisplayed();
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryStatus(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_ViewSummaryStatus().isDisplayed();
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryStartTime(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_ViewSummaryStartTime().isDisplayed(); 
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryEndTime(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_ViewSummaryEndTime().isDisplayed();
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryRemarks(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_ViewSummaryRemarks().isDisplayed(); 
//    
//    
//    }
//    @Then("^close the view summary$")
//    public void close_the_view_summary()  {
//    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryClose(), 60, 2);
//    productMaster_RetailObj.productMaster_Product_ViewSummaryClose().click();    
//    
//    }
}