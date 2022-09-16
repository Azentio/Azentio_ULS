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
import pageobjects.LivingExpenseLocationObj;
import pageobjects.ReportMasterObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.LivingExpenseLocationTestDataType;
import testDataType.ReportMasterTestDataType;

public class LivingExpenseLocation {

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
	LivingExpenseLocationObj livingExpenseObj = new LivingExpenseLocationObj(driver);
	LivingExpenseLocationTestDataType livingExpenseTestDataType = jsonConfig.getLivingExpenseLocationByName("Maker");
	Selenium_Actions action = new Selenium_Actions(driver);
	
	@And("^User Login as checker to approve living expenses location modified record$")
	public void user_login_as_checker_to_approve_living_expenses_location_modified_record() throws Throwable {
		kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
	}

	@Then("^click on inbox button to select the living expenses location record$")
    public void click_on_inbox_button_to_select_the_living_expenses_location_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_Inbox());
		livingExpenseObj.livingExpense_Checker_Inbox().click();
    }

    @Then("^select the record of living expenses location to approve$")
    public void select_the_record_of_living_expenses_location_to_approve() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_SearchInbox());
    	livingExpenseObj.livingExpense_Checker_SearchInbox().click();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_SearchInboxInputField());
		livingExpenseObj.livingExpense_Checker_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
		String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		String res = driver.findElement(By.xpath("//span[contains(text(),'" + jsonDataReaderWriter.readReferancedata() + "')]" )).getText();
		Assert.assertEquals(res, jsonDataReaderWriter.readReferancedata());
		driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();

    }

    @Then("^select approve button for approve the living expenses location record$")
    public void select_approve_button_for_approve_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_Approve());
    	livingExpenseObj.livingExpense_Checker_Approve().click();
    }

    @Then("^enter remark for approve the living expenses location record$")
    public void enter_remark_for_approve_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseObj.livingExpense_Checker_CheckerApproveRemark(), 10, 2);
    	livingExpenseObj.livingExpense_Checker_CheckerApproveRemark().sendKeys(livingExpenseTestDataType.CheckerApproveRemark);

    }

    @Then("^click on approve button of the living expenses location record$")
    public void click_on_approve_button_of_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_CheckerApproveButton());
    	livingExpenseObj.livingExpense_Checker_CheckerApproveButton().click();
	
    }

    @Then("^system should display confirmation message after approve the living expenses location record$")
    public void system_should_display_confirmation_message_after_approve_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessage());
    	livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessage().isDisplayed();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessageCloseButton());
		livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessageCloseButton().click();
	
    }
    
    @Then("^logout from checker user$")
    public void logout_from_checker_user() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Profile());
    	livingExpenseObj.livingExpense_Profile().click();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_LogoutUser());
		livingExpenseObj.livingExpense_LogoutUser().click();
	
    }

    @Then("^user should navigate to living expense$")
    public void user_should_navigate_to_living_expense() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Maker_MenuToggle());
    	livingExpenseObj.livingExpense_Maker_MenuToggle().click();;
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpenseConfigurations());
		livingExpenseObj.livingExpenseConfigurations().click();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpenseConfigMenu());
		livingExpenseObj.livingExpenseConfigMenu().click();
    }
    
    @And("^click on approved records button of living expense$")
    public void click_on_approved_records_button_of_living_expense() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_ApprovedRecordsButton());
		livingExpenseObj.livingExpense_ApprovedRecordsButton().click();
    }

    @Then("^verify all the captured data of living expenses location record from makers side should be saved and stored in the system$")
    public void verify_all_the_captured_data_of_living_expenses_location_record_from_makers_side_should_be_saved_and_stored_in_the_system() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_SearchButton());
    	livingExpenseObj.livingExpense_SearchButton().click();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_SearchInputField());
		livingExpenseObj.livingExpense_SearchInputField().sendKeys(livingExpenseTestDataType.ApprovedRecord);
		String beforexpath = "//span[contains(text(),'"; 
    	String afterxpath = "')]"; 
    	Thread.sleep(1000);
    	boolean result = driver.findElement(By.xpath(beforexpath +livingExpenseTestDataType.ApprovedRecord+ afterxpath)).isDisplayed();
    	Assert.assertTrue(result);
    }
    
    ////////////////////////////////////////////////////////////////////////////////
    
    @And("^User Login as checker to reject living expenses location modified record$")
    public void user_login_as_checker_to_reject_living_expenses_location_modified_record() throws Throwable {
    	kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
    }
    
    @Then("^select the record of living expenses location to reject$")
    public void select_the_record_of_living_expenses_location_to_reject() throws Throwable {
    	livingExpenseObj.livingExpense_Checker_SearchInbox().click();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_SearchInboxInputField());
		livingExpenseObj.livingExpense_Checker_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
		String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		String res = driver.findElement(By.xpath("//span[contains(text(),'" + jsonDataReaderWriter.readReferancedata() + "')]" )).getText();
		Assert.assertEquals(res, jsonDataReaderWriter.readReferancedata());
		driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();

    }

    @Then("^select reject button for reject the living expenses location record$")
    public void select_reject_button_for_reject_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_Reject());
    	livingExpenseObj.livingExpense_Checker_Reject().click();
    }

    @Then("^enter remark for reject the living expenses location record$")
    public void enter_remark_for_reject_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseObj.livingExpense_Checker_CheckerRejectRemark(), 10, 2);
    	livingExpenseObj.livingExpense_Checker_CheckerRejectRemark().sendKeys(livingExpenseTestDataType.CheckerApproveRemark);

    }

    @Then("^click on reject button of the living expenses location record$")
    public void click_on_reject_button_of_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_CheckerRejectButton());
    	livingExpenseObj.livingExpense_Checker_CheckerRejectButton().click();
	
    }

    @Then("^system should display confirmation message after reject the living expenses location record$")
    public void system_should_display_confirmation_message_after_reject_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessage());
    	livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessage().isDisplayed();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessageCloseButton());
		livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessageCloseButton().click();
	
    }
    
    @Then("^verify all the captured data of living expenses location record from makers side should not be saved and stored in the system$")
    public void verify_all_the_captured_data_of_living_expenses_location_record_from_makers_side_should_not_be_saved_and_stored_in_the_system() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_SearchButton());
    	livingExpenseObj.livingExpense_SearchButton().click();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_SearchInputField());
		livingExpenseObj.livingExpense_SearchInputField().sendKeys(livingExpenseTestDataType.RejectedRecord);
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_NoDataFoundInSearch());
		boolean res = livingExpenseObj.livingExpense_NoDataFoundInSearch().isDisplayed();
		Assert.assertTrue(res);
    }
    
    ////////////////////////////////////////////////////////////
    
    @And("^User Login as checker to Return living expenses location modified record$")
    public void user_login_as_checker_to_return_living_expenses_location_modified_record() throws Throwable {
    	kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
    }
    
    @Then("^select the record of living expenses location to Return$")
    public void select_the_record_of_living_expenses_location_to_return() throws Throwable {
    	livingExpenseObj.livingExpense_Checker_SearchInbox().click();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_SearchInboxInputField());
		livingExpenseObj.livingExpense_Checker_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
		String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		String res = driver.findElement(By.xpath("//span[contains(text(),'" + jsonDataReaderWriter.readReferancedata() + "')]" )).getText();
		Assert.assertEquals(res, jsonDataReaderWriter.readReferancedata());
		driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();

    }

    @Then("^select Return button for Return the living expenses location record$")
    public void select_return_button_for_return_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_Return());
    	livingExpenseObj.livingExpense_Checker_Return().click();
    }

    @Then("^enter remark for Return the living expenses location record$")
    public void enter_remark_for_return_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, livingExpenseObj.livingExpense_Checker_CheckerReturnRemark(), 10, 2);
    	livingExpenseObj.livingExpense_Checker_CheckerReturnRemark().sendKeys(livingExpenseTestDataType.CheckerApproveRemark);

    }

    @Then("^click on Return button of the living expenses location record$")
    public void click_on_return_button_of_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_CheckerReturnButton());
    	livingExpenseObj.livingExpense_Checker_CheckerReturnButton().click();
	
    }

    @Then("^system should display confirmation message after Return the living expenses location record$")
    public void system_should_display_confirmation_message_after_return_the_living_expenses_location_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessage());
    	livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessage().isDisplayed();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessageCloseButton());
		livingExpenseObj.livingExpense_Checker_ApproveConfirmationMessageCloseButton().click();
	
    }
    
    @Then("^verify all the captured data of living expenses location record from makers side should be returned and stored in the system$")
    public void verify_all_the_captured_data_of_living_expenses_location_record_from_makers_side_should_be_returned_and_stored_in_the_system() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_SearchButton());
    	livingExpenseObj.livingExpense_SearchButton().click();
		waithelper.waitForElementwithFluentwait(driver, livingExpenseObj.livingExpense_SearchInputField());
		livingExpenseObj.livingExpense_SearchInputField().sendKeys(livingExpenseTestDataType.ReturnedRecord);
		String beforexpath = "//span[contains(text(),'"; 
    	String afterxpath = "')]"; 
    	boolean res = driver.findElement(By.xpath(beforexpath +livingExpenseTestDataType.ReturnedRecord+ afterxpath)).isDisplayed();
    	Assert.assertTrue(res);
   
    }




}