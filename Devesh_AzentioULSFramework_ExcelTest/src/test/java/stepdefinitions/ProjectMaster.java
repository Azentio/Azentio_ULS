package stepdefinitions;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","ProjectMasterTestData","Data Set ID");
	Map<String, String> testData;
	String dataSetID;
	
	@Then("^user should navigate to project master$")
    public void user_should_navigate_to_project_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_MenuToggle());
		projectMasterObj.projectMaster_MenuToggle().click();
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Configurations());
		projectMasterObj.projectMaster_Configurations().click();
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.config_Manager());
		projectMasterObj.config_Manager().click();
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
	
	@Then("^Fill all the valid fields in the project master screen$")
    public void fill_all_the_valid_fields_in_the_project_master_screen() throws Throwable {
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ProjectType());
				projectMasterObj.projectMaster_ProjectType().click();
				radioButtonHelper.radioButton(testData.get("Project Type"));
				break;
			} catch (Exception e) {

			}
		}
//		for (int i = 0; i < 10; i++) {
//			try {
//				WebElement ele=driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Project Type")+" ']/../ion-radio"));
//				javaScriptHelper.scrollIntoView(ele);
//				ele.click();
//				break;
//			} catch (Exception e) {
//
//			}
//		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SourcingBranch());
		projectMasterObj.projectMaster_SourcingBranch().click();
		radioButtonHelper.radioButton(testData.get("Sourcing Branch"));
		
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ProjectCode());
				projectMasterObj.projectMaster_ProjectCode().sendKeys(testData.get("Project Code"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProject());
		projectMasterObj.projectMaster_NameOfTheProject().sendKeys(testData.get("NameOfTheProject"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMasterConstructionFinanceDropDown());
		projectMasterObj.projectMasterConstructionFinanceDropDown().click();
		radioButtonHelper.radioButton(testData.get("Construction Finance"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMasterGreenProjectDropDown());
		projectMasterObj.projectMasterGreenProjectDropDown().click();
		radioButtonHelper.radioButton(testData.get("Green Project"));
		
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Address1());
				projectMasterObj.projectMaster_Address1().sendKeys(testData.get("Address1"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Address2());
		projectMasterObj.projectMaster_Address2().sendKeys(testData.get("Address2"));
		
		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Country());
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Country());
		projectMasterObj.projectMaster_Country().click();
		for (int i = 0; i < 10; i++) {
			try {
				WebElement ele=driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Country")+" ']/../ion-radio"));
				javaScriptHelper.scrollIntoView(ele);
				ele.click();
				break;
			} catch (Exception e) {

			}
		}
//		radioButtonHelper.radioButton(testData.get("Country"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMasterAddressDetailsStateDropDown());
		projectMasterObj.projectMasterAddressDetailsStateDropDown().click();
		for (int i = 0; i < 10; i++) {
			try {
				WebElement ele=driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("State")+" ']/../ion-radio"));
				javaScriptHelper.scrollIntoView(ele);
				ele.click();
				break;
			} catch (Exception e) {

			}
		}
		radioButtonHelper.radioButton(testData.get("State"));
		
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_PhoneNo());
				projectMasterObj.projectMaster_PhoneNo().click();
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_PhoneNo());
				projectMasterObj.projectMaster_PhoneNo().sendKeys(testData.get("Phone Number"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_PlanApprovedDateCalendar());
		projectMasterObj.projectMaster_PlanApprovedDateCalendar().sendKeys(testData.get("Plan Approved Date"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_BasicSalesPrice());
		projectMasterObj.projectMaster_BasicSalesPrice().sendKeys(testData.get("BasicSalesPrice"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_AreaOfLandUnit());
		projectMasterObj.projectMaster_AreaOfLandUnit().sendKeys(testData.get("AreaOfLandUnit"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SourcingBranchAddressDetails());
		projectMasterObj.projectMaster_SourcingBranchAddressDetails().click();;
		radioButtonHelper.radioButton(testData.get("Sourcing Branch AddressDetails"));
		
		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_SourcingBranchAddressDetails());
		
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_OverallPercentCompletionTextbox());
				projectMasterObj.projectMaster_OverallPercentCompletionTextbox().sendKeys(testData.get("Overall % Completion"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_OverAllPercentRecommendationTextbox());
		projectMasterObj.projectMaster_OverAllPercentRecommendationTextbox().sendKeys(testData.get("Overall % Recommendation"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfBeneficiaryTextbox());
		projectMasterObj.projectMaster_NameOfBeneficiaryTextbox().sendKeys(testData.get("Name Of Beneficiary"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_AccountNumber());
		projectMasterObj.projectMaster_AccountNumber().sendKeys(testData.get("Account Number"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_BankNameDropdown());
		projectMasterObj.projectMaster_BankNameDropdown().click();
		radioButtonHelper.radioButton(testData.get("Bank Name"));
		
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMasterAddressDetailsDateOfVisitInputCalendar());
				projectMasterObj.projectMasterAddressDetailsDateOfVisitInputCalendar().sendKeys(testData.get("Date of Visit"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMasterAddressDetailsFileStorageDropDown());
		projectMasterObj.projectMasterAddressDetailsFileStorageDropDown().click();
		radioButtonHelper.radioButton(testData.get("File Storage"));
		
		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Save());
		
    }
	
	@Then("^modify the valid fields in the project master screen$")
    public void modify_the_valid_fields_record_in_the_project_master_screen() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ProjectMasterAddTitle());
		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_ProjectMasterAddTitle());
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ProjectType());
				projectMasterObj.projectMaster_ProjectType().click();
				radioButtonHelper.radioButton(testData.get("Modify Project Type"));
				break;
			} catch (Exception e) {

			}
		}
//		for (int i = 0; i < 10; i++) {
//			try {
//				WebElement ele=driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Modify Project Type")+" ']/../ion-radio"));
//				javaScriptHelper.scrollIntoView(ele);
//				ele.click();
//				break;
//			} catch (Exception e) {
//
//			}
//		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SourcingBranch());
		projectMasterObj.projectMaster_SourcingBranch().click();
		radioButtonHelper.radioButton(testData.get("Modify Sourcing Branch"));
		
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ProjectCode());
				projectMasterObj.projectMaster_ProjectCode().sendKeys(Keys.chord(Keys.CONTROL,"A"));
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ProjectCode());
				projectMasterObj.projectMaster_ProjectCode().sendKeys(testData.get("Modify Project Code"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProject());
		projectMasterObj.projectMaster_NameOfTheProject().sendKeys(Keys.chord(Keys.CONTROL,"A"));
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProject());
		projectMasterObj.projectMaster_NameOfTheProject().sendKeys(testData.get("Modify NameOfTheProject"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMasterConstructionFinanceDropDown());
		projectMasterObj.projectMasterConstructionFinanceDropDown().click();
		radioButtonHelper.radioButton(testData.get("Modify Construction Finance"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMasterGreenProjectDropDown());
		projectMasterObj.projectMasterGreenProjectDropDown().click();
		radioButtonHelper.radioButton(testData.get("Modify Green Project"));
		
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Address1());
				projectMasterObj.projectMaster_Address1().sendKeys(Keys.chord(Keys.CONTROL,"A"));
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Address1());
				projectMasterObj.projectMaster_Address1().sendKeys(testData.get("Modify Address1"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Address2());
		projectMasterObj.projectMaster_Address2().sendKeys(Keys.chord(Keys.CONTROL,"A"));
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Address2());
		projectMasterObj.projectMaster_Address2().sendKeys(testData.get("Modify Address2"));
		
		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Country());
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Country());
		projectMasterObj.projectMaster_Country().click();
//		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SelectRadioButton());
		for (int i = 0; i < 10; i++) {
			try {
				WebElement ele=driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Modify Country")+" ']/../ion-radio"));
				javaScriptHelper.scrollIntoView(ele);
				ele.click();
				break;
			} catch (Exception e) {

			}
		}
//		radioButtonHelper.radioButton(testData.get("Modify Country"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMasterAddressDetailsStateDropDown());
		projectMasterObj.projectMasterAddressDetailsStateDropDown().click();
		for (int i = 0; i < 10; i++) {
			try {
				WebElement ele=driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Modify State")+" ']/../ion-radio"));
				javaScriptHelper.scrollIntoView(ele);
				ele.click();
				break;
			} catch (Exception e) {

			}
		}
//		radioButtonHelper.radioButton(testData.get("Modify State"));
		
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_PhoneNo());
				projectMasterObj.projectMaster_PhoneNo().sendKeys(Keys.chord(Keys.CONTROL,"A"));
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_PhoneNo());
				projectMasterObj.projectMaster_PhoneNo().sendKeys(testData.get("Modify Phone Number"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_PlanApprovedDateCalendar());
		projectMasterObj.projectMaster_PlanApprovedDateCalendar().sendKeys(Keys.chord(Keys.CONTROL,"A"));
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_PlanApprovedDateCalendar());
		projectMasterObj.projectMaster_PlanApprovedDateCalendar().sendKeys(testData.get("Modify Plan Approved Date"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_BasicSalesPrice());
		projectMasterObj.projectMaster_BasicSalesPrice().sendKeys(Keys.chord(Keys.CONTROL,"A"));
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_BasicSalesPrice());
		projectMasterObj.projectMaster_BasicSalesPrice().sendKeys(testData.get("Modify BasicSalesPrice"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_AreaOfLandUnit());
		projectMasterObj.projectMaster_AreaOfLandUnit().sendKeys(Keys.chord(Keys.CONTROL,"A"));
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_AreaOfLandUnit());
		projectMasterObj.projectMaster_AreaOfLandUnit().sendKeys(testData.get("Modify AreaOfLandUnit"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SourcingBranchAddressDetails());
		projectMasterObj.projectMaster_SourcingBranchAddressDetails().click();;
		radioButtonHelper.radioButton(testData.get("Modify Sourcing Branch AddressDetails"));
		
		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_SourcingBranchAddressDetails());
		
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_OverallPercentCompletionTextbox());
				projectMasterObj.projectMaster_OverallPercentCompletionTextbox().sendKeys(Keys.chord(Keys.CONTROL,"A"));
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_OverallPercentCompletionTextbox());
				projectMasterObj.projectMaster_OverallPercentCompletionTextbox().sendKeys(testData.get("Modify Overall % Completion"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_OverAllPercentRecommendationTextbox());
		projectMasterObj.projectMaster_OverAllPercentRecommendationTextbox().sendKeys(Keys.chord(Keys.CONTROL,"A"));
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_OverAllPercentRecommendationTextbox());
		projectMasterObj.projectMaster_OverAllPercentRecommendationTextbox().sendKeys(testData.get("Modify Overall % Recommendation"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfBeneficiaryTextbox());
		projectMasterObj.projectMaster_NameOfBeneficiaryTextbox().sendKeys(Keys.chord(Keys.CONTROL,"A"));
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfBeneficiaryTextbox());
		projectMasterObj.projectMaster_NameOfBeneficiaryTextbox().sendKeys(testData.get("Modify Name Of Beneficiary"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_AccountNumber());
		projectMasterObj.projectMaster_AccountNumber().sendKeys(Keys.chord(Keys.CONTROL,"A"));
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_AccountNumber());
		projectMasterObj.projectMaster_AccountNumber().sendKeys(testData.get("Modify Account Number"));
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_BankNameDropdown());
		projectMasterObj.projectMaster_BankNameDropdown().click();
		radioButtonHelper.radioButton(testData.get("Modify Bank Name"));
		
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMasterAddressDetailsDateOfVisitInputCalendar());
				projectMasterObj.projectMasterAddressDetailsDateOfVisitInputCalendar().sendKeys(testData.get("Modify Date of Visit"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMasterAddressDetailsFileStorageDropDown());
		projectMasterObj.projectMasterAddressDetailsFileStorageDropDown().click();
		radioButtonHelper.radioButton(testData.get("Modify File Storage"));
		
		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Save());
    }
	
	@Then("^confirmation message displays with reference id in project master$")
	public void confirmation_message_displays_with_reference_id_in_project_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Product_SaveConfirmationMessage());
		String message = projectMasterObj.projectMaster_Product_SaveConfirmationMessage().getText();
		System.out.println(message);
		String emptyString = "";
		String ar[] = message.split(" ");
		emptyString=ar[ar.length-1];
		String referenceid=emptyString.replaceAll("[/.]", "");
		System.out.println("Reference ID : "+referenceid);
	  excelData.updateTestData(dataSetID, "Reference ID", referenceid);
	  testData = excelData.getTestdata(dataSetID);
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Product_SaveConfirmationMessageCloseButton());
		projectMasterObj.projectMaster_Product_SaveConfirmationMessageCloseButton().click();
	}

	@Then("^click on inbox button to select the record of project master$")
	public void click_on_inbox_button_to_select_the_record_of_project_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Inbox());
		projectMasterObj.projectMaster_Inbox().click();
	}

	@And("^select the record of project master from inbox to submit$")
	public void select_the_record_of_project_master_from_inbox_to_submit() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Maker_SearchInbox());
		projectMasterObj.projectMaster_Maker_SearchInbox().click();
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Maker_SearchInboxInputField());
		projectMasterObj.projectMaster_Maker_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
		String beforexpath = "//span[text()='";
		String afterxpath = "']/../../td/button";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
	
	}
	
	@Then("^select the submitted record of project master by maker to approve$")
    public void select_the_submitted_record_of_project_master_by_maker_to_approve() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInbox());
		projectMasterObj.projectMaster_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInboxInputField());
    	projectMasterObj.projectMaster_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
    }
	
	@Then("^enter remark for approve the record of project master$")
    public void enter_remark_for_approve_the_record_of_project_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_CheckerApproveRemark());
		projectMasterObj.projectMaster_Checker_CheckerApproveRemark().sendKeys(testData.get("Checker Submit Remark"));
    }
	
	@Then("^select the submitted record of project master by maker to reject$")
	public void select_the_submitted_record_of_project_master_by_maker_to_reject() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInbox());
		projectMasterObj.projectMaster_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInboxInputField());
    	projectMasterObj.projectMaster_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
	}

	@Then("^enter remark for reject the record of project master$")
	public void enter_remark_for_reject_the_record_of_project_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_CheckerRejectRemark());
		projectMasterObj.projectMaster_Checker_CheckerRejectRemark().sendKeys(testData.get("Checker Submit Remark"));
	}
	
	@Then("^select the submitted record of project master by maker to return$")
    public void select_the_submitted_record_of_project_master_by_maker_to_return() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInbox());
		projectMasterObj.projectMaster_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInboxInputField());
    	projectMasterObj.projectMaster_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
    }

    @Then("^enter remark for return the record of project master$")
    public void enter_remark_for_return_the_record_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_CheckerReturnRemark());
    	projectMasterObj.projectMaster_Checker_CheckerReturnRemark().sendKeys(testData.get("Checker Submit Remark"));
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
    	projectMasterObj.projectMaster_SearchInputField().sendKeys(testData.get("Approved Record"));
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + testData.get("Approved Record") + afterxpath)).click();
   
//    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ModifiedRecordEditButton());
//    	projectMasterObj.projectMaster_ModifiedRecordEditButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProject());
    	projectMasterObj.projectMaster_NameOfTheProject().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProject());
    	projectMasterObj.projectMaster_NameOfTheProject().sendKeys(Keys.BACK_SPACE);
    	
//    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
//    	projectMasterObj.projectMaster_Save().click();
    }
    
    @Then("^verify system should not allow to enter invalid datatypes in project master$")
    public void verify_system_should_not_allow_to_enter_invalid_datatypes_in_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_NameOfTheProject());
    	projectMasterObj.projectMaster_NameOfTheProject().sendKeys(testData.get("Invalid Data"));
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
    	projectMasterObj.projectMaster_SearchInputField().sendKeys(testData.get("Project Code"));
    	String beforexpath = "//span[text()='";
		String afterxpath = " ']/../../../td[11]/p-celleditor/p-tag/span";
		Thread.sleep(1000);
		boolean status = driver.findElement(By.xpath(beforexpath + testData.get("Project Code") + afterxpath)).isDisplayed();
		Assert.assertTrue(status);
		String status1 = driver.findElement(By.xpath(beforexpath + testData.get("Project Code") + afterxpath)).getText();
		Assert.assertEquals(status1, "Active");
		System.out.println("Status of the record " +testData.get("Project Code")+ " in list view : "+status1);
    }
    
    @Then("^verify user can able to change the status from active to deactive in project master$")
    public void verify_user_can_able_to_change_the_status_from_active_to_deactive_in_project_master() throws Throwable {
    	String beforexpath = "//span[text()='";
		String afterxpath = " ']/../../../td[1]/span[1]/button[1]/span[1]";
		driver.findElement(By.xpath(beforexpath + testData.get("Project Code") + afterxpath)).click();
    	
//		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ProjectMasterAddTitle());
        for (int i = 0; i < 10; i++) {
			try {
				javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Status());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Status());
   		projectMasterObj.projectMaster_Status().click();
    		
		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Save());
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
		projectMasterObj.projectMaster_Save().click();
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Product_SaveConfirmationMessageCloseButton());
		projectMasterObj.projectMaster_Product_SaveConfirmationMessageCloseButton().click();
    		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
		projectMasterObj.projectMaster_Search().click();
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
		projectMasterObj.projectMaster_SearchInputField().sendKeys(testData.get("Project Code"));
		String beforexpath1 = "//span[text()='";
		String afterxpath1 = " ']/../../../td[11]/p-celleditor/p-tag/span";
		Thread.sleep(1000);
		String status = driver.findElement(By.xpath(beforexpath1 + testData.get("Project Code") + afterxpath1)).getText();
		System.out.println("User changed Status to : " + status);
		Assert.assertEquals(status, "In-active");
    }

    @Then("^verify user can able to change the status from deactive to active in project master$")
    public void verify_user_can_able_to_change_the_status_from_deactive_to_active_in_project_master() throws Throwable {
    	String beforexpath = "//span[text()='";
		String afterxpath = " ']/../../../td[1]/span[1]/button[1]/span[1]";
		driver.findElement(By.xpath(beforexpath + testData.get("Project Code") + afterxpath)).click();
    	
		for (int i = 0; i < 10; i++) {
			try {
				javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Status());
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
//        javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Status());
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Status());
   		projectMasterObj.projectMaster_Status().click();
    		
		javaScriptHelper.scrollIntoView(projectMasterObj.projectMaster_Save());
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
		projectMasterObj.projectMaster_Save().click();
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Product_SaveConfirmationMessageCloseButton());
		projectMasterObj.projectMaster_Product_SaveConfirmationMessageCloseButton().click();
    		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
		projectMasterObj.projectMaster_Search().click();
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
		projectMasterObj.projectMaster_SearchInputField().sendKeys(testData.get("Project Code"));
		String beforexpath1 = "//span[contains(text(),'";
		String afterxpath1 = "')]/../../../td[11]/p-celleditor/p-tag/span";
		Thread.sleep(1000);
		String status = driver.findElement(By.xpath(beforexpath1 + testData.get("Project Code") + afterxpath1)).getText();
		System.out.println("User changed Status to : " + status);
		Assert.assertEquals(status, "Active");
    }
    
    @Then("^click on edit button of record to modify in project master modify$")
    public void click_on_edit_button_of_record_to_modify_in_project_master_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Search());
    	projectMasterObj.projectMaster_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInputField());
    	projectMasterObj.projectMaster_SearchInputField().sendKeys(testData.get("Approved Record"));
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + testData.get("Approved Record") + afterxpath)).click();
    	
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
    
    @Then("^verify system allow user to save modified before approved record of project master with valid data$")
    public void verify_system_allow_user_to_save_modified_before_approved_record_of_project_master_with_valid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
    	projectMasterObj.projectMaster_Save().click();
    	System.out.println("System allows user to to save modified before approved record of project master with valid data");
    }
    
    @Then("^verify system allow user to save modified already approved record of project master with valid data$")
    public void verify_system_allow_user_to_save_modified_already_approved_record_of_project_master_with_valid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
    	projectMasterObj.projectMaster_Save().click();
    	System.out.println("System allows user to to save modified already approved record of project master with valid data");
    }
    
    @Then("^verify system allow user to save record of project master with valid data$")
    public void verify_system_allow_user_to_save_record_of_project_master_with_valid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Save());
    	projectMasterObj.projectMaster_Save().click();
    	System.out.println("System allows user to to save modified already approved record of project master with valid data");
    }
    
    @And("^select the modified record of project master from inbox to approve$")
    public void select_the_modified_record_of_project_master_from_inbox_to_approve() throws Throwable {
    	projectMasterObj.projectMaster_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_SearchInboxInputField());
    	projectMasterObj.projectMaster_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
    }
    
    @Then("^click on submit button in project master$")
    public void click_on_submit_button_in_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Submit());
    	projectMasterObj.projectMaster_Submit().click();
		
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_MakerSubmitRemark());
		projectMasterObj.projectMaster_MakerSubmitRemark().click();
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_MakerSubmitRemark());
		projectMasterObj.projectMaster_MakerSubmitRemark().sendKeys(testData.get("Maker Submit Remark"));

		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_FinalSubmit());
		projectMasterObj.projectMaster_FinalSubmit().click();
    }
    
    @Then("^system should display confirmation message after submit project master record$")
    public void system_should_display_confirmation_message_after_submit_project_master_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessage());
		boolean res = projectMasterObj.projectMaster_ConfirmationMessage().isDisplayed();
		Assert.assertEquals(res, true);
    }

    @Then("^capture checker ID of project master$")
    public void capture_checker_id_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessage());
		String message = projectMasterObj.projectMaster_ConfirmationMessage().getText();
		String emptystring = "";
		String ar[] = message.split(" ");
		emptystring = ar[ar.length - 1];
		String checkerID = emptystring.replaceAll("[/.]", "");
		System.out.println(checkerID);
		if(checkerID.equals("ssk")) {
			Assert.fail("User ssk is not Valid");
		}
		excelData.updateTestData(dataSetID, "Checker id", checkerID);
		testData = excelData.getTestdata(dataSetID);
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessageCloseButton());
		projectMasterObj.projectMaster_ConfirmationMessageCloseButton().click();
    }

    @Then("^logout user from maker stage project master$")
    public void logout_user_from_maker_stage_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Profile());
    	projectMasterObj.projectMaster_Profile().click();
		waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_LogoutUser());
		projectMasterObj.projectMaster_LogoutUser().click();
    }
    
    @Then("^click on inbox button of project master$")
    public void click_on_inbox_button_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Inbox());
    	projectMasterObj.projectMaster_Inbox().click();
    }

    @Then("^logout user from the application$")
    public void logout_user_from_the_application() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Profile());
    	projectMasterObj.projectMaster_Profile();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_LogoutUser());
    	projectMasterObj.projectMaster_LogoutUser().click();
    }

    @And("^User Login as checker user$")
    public void user_login_as_checker_user() throws Throwable {
		kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
    }

    @Then("^select approve button in checker stage of project master$")
    public void select_approve_button_in_checker_stage_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_Approve());
    	projectMasterObj.projectMaster_Checker_Approve().click();
    }

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

    @Then("^select reject button in checker stage of project master$")
    public void select_reject_button_in_checker_stage_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_Reject());
    	projectMasterObj.projectMaster_Checker_Reject().click();
    }
    
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

    @Then("^select return button in checker stage of project master$")
    public void select_return_button_in_checker_stage_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_Return());
    	projectMasterObj.projectMaster_Checker_Return().click();;
    }

    @Then("^click on return button to return project master record$")
    public void click_on_return_button_to_return_project_master_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Checker_CheckerReturnButton());
    	projectMasterObj.projectMaster_Checker_CheckerReturnButton().click();
    }

    @Then("^system should display confirmation message after return the record of project master$")
    public void system_should_display_confirmation_message_after_return_the_record_of_project_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessage());
    	projectMasterObj.projectMaster_ConfirmationMessage().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_ConfirmationMessageCloseButton());
    	projectMasterObj.projectMaster_ConfirmationMessageCloseButton().click();
    }
  
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
    
    //Save
    @Then("^click on save button in project master$")
    public void click_on_save_button_in_project_master()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_Save(), 60, 2);
    projectMasterObj.projectMaster_Save().isDisplayed();
    projectMasterObj.projectMaster_Save().click();
  
    }
    
    @Then("^select data set ID for project master testcase004$")
    public void select_data_set_id_for_project_master_testcase004() throws Throwable {
    	dataSetID = "AT_PM_004_D1";
        testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for project master testcase005$")
    public void select_data_set_id_for_project_master_testcase005() throws Throwable {
    	dataSetID = "AT_PM_005_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for project master testcase006$")
    public void select_data_set_id_for_project_master_testcase006() throws Throwable {
    	dataSetID = "AT_PM_006_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for project master testcase008$")
    public void select_data_set_id_for_project_master_testcase008() throws Throwable {
    	dataSetID = "AT_PM_008_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for project master testcase009a$")
    public void select_data_set_id_for_project_master_testcase009a() throws Throwable {
    	dataSetID = "AT_PM_009a_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for project master testcase009b$")
    public void select_data_set_id_for_project_master_testcase009b() throws Throwable {
    	dataSetID = "AT_PM_009b_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for project master testcase009c$")
    public void select_data_set_id_for_project_master_testcase009c() throws Throwable {
    	dataSetID = "AT_PM_009c_D1";
        testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for project master testcase010$")
    public void select_data_set_id_for_project_master_testcase010() throws Throwable {
    	dataSetID = "AT_PM_010_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
}