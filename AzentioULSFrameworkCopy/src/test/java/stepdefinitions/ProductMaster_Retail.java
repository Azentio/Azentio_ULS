package stepdefinitions;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

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
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.KULS_LoginObj;
import pageobjects.ProductMaster_RetailObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.ProductMaster_RetailTestDataType;

public class ProductMaster_Retail {
	
	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper=new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ProductMaster_RetailObj productMaster_RetailObj = new ProductMaster_RetailObj(driver);
	ProductMaster_RetailTestDataType productMaster_RetailTestDataType=jsonConfig.getProductMasterRetailByName("Maker");
	
	@Then("^user should navigate to product master$")
    public void user_should_navigate_to_product_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.product_Setup());
		productMaster_RetailObj.product_Setup().click();
    }
	
	@And("^click on edit view of product master$")
	public void click_on_edit_view_of_product_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_EditView());
		productMaster_RetailObj.productMaster_EditView().click();
	}

    @Then("^click on edit button of record to modify$")
    public void click_on_edit_button_of_record_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
    	productMaster_RetailObj.productMaster_Product_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.Record1BeforeApproved);
//      xpath-	(//span[contains(text(),'depo30')]/../../../td[1]/span[1]/button[1]/span[1])[1]
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).click();
    }

    @Then("^user should verify the buttons available on screen while modify$")
    public void user_should_verify_the_buttons_available_on_screen_while_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductGroup());
    	assertTrue(productMaster_RetailObj.productMaster_ProductGroup().isDisplayed());
    	assertTrue(productMaster_RetailObj.productMaster_ProductCode().isDisplayed());
    	assertTrue(productMaster_RetailObj.productMaster_ProductDescription().isDisplayed());
    	assertTrue(productMaster_RetailObj.productMaster_RetailCorporate().isDisplayed());
    	assertTrue(productMaster_RetailObj.productMaster_Product_DMCode().isDisplayed());
    	assertTrue(productMaster_RetailObj.productMaster_Product_Save().isDisplayed());
    	assertTrue(productMaster_RetailObj.productMaster_Product_Back().isDisplayed());
    	System.out.println("The buttons available on screen while modify the Product Master are displayed");
    }

    @Then("^verify system should modify the record before approved$")
    public void verify_system_should_modify_the_record_before_approved() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
    	clicksAndActionsHelper.doubleClick(productMaster_RetailObj.productMaster_ProductDescription());
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription(), 5, 1);
    	productMaster_RetailObj.productMaster_ProductDescription().sendKeys(productMaster_RetailTestDataType.ProductDescription1);
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
    	productMaster_RetailObj.productMaster_Product_Save().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton());
    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
    	System.out.println("System allows user to modify before approved the record of the Product Master");
    }
    
    @And("^click on eye icon of product master$")
	public void click_on_eye_icon_of_product_master() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_EyeIcon());
    	productMaster_RetailObj.productMaster_EyeIcon().click();
	}

    @Then("^verify system should modify already approved record$")
    public void verify_system_should_modify_already_approved_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
        productMaster_RetailObj.productMaster_Product_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
        productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.Record1AfterApproved);
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
//      xpath-	(//span[contains(text(),'dep55')]/../../../td[1]/span[1]/button[1]/span[1])[1]
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.Record1AfterApproved+ afterxpath)).click();
    	
        waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
        clicksAndActionsHelper.doubleClick(productMaster_RetailObj.productMaster_ProductDescription());
        waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
        productMaster_RetailObj.productMaster_ProductDescription().sendKeys(productMaster_RetailTestDataType.ProductDescription2);
        System.out.println("System allows user to modify already approved record of the Product Master");
    }

    @Then("^verify system allow user to save modified record with valid data$")
    public void verify_system_allow_user_to_save_modified_record_with_valid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
    	productMaster_RetailObj.productMaster_Product_Save().click();
    	System.out.println("System allows user to to save modified record with valid data");
    }
    
    @Then("^system should display the confirmation message$")
    public void system_should_display_the_confirmation_message() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SaveConfirmationMessage());
    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessage().isDisplayed();
    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().isDisplayed();
    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
    	System.out.println("System should display the confirmation message");
    }

    @Then("^click on inbox button$")
    public void click_on_inbox_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Inbox());
    	productMaster_RetailObj.productMaster_Product_Inbox().click();
    }
    
    @Then("^select the modified record from inbox to approve$")
    public void select_the_modified_record_from_inbox_to_approve() throws Throwable {
//    	xpath - //span[contains(text(),'5640')]/../../td/button
    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.ApproveReferenceID);
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.ApproveReferenceID+ afterxpath)).click();
    }
    
    @Then("^select the modified record from inbox to reject$")
    public void select_the_modified_record_from_inbox_to_reject() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.RejectReferenceID);
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5767')]/../../td/button
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.RejectReferenceID+ afterxpath)).click();
    }
    
    @Then("^select the modified record from inbox to return$")
    public void select_the_modified_record_from_inbox_to_return() throws Throwable {
//    	xpath - //span[contains(text(),'5640')]/../../td/button
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.ReturnReferenceID);
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.ReturnReferenceID+ afterxpath)).click();
    }

    @Then("^click on submit button$")
    public void click_on_submit_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Maker_Submit());
    	productMaster_RetailObj.productMaster_Product_Maker_Submit().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_MakerSubmitRemark());
    	productMaster_RetailObj.productMaster_Product_MakerSubmitRemark().sendKeys(productMaster_RetailTestDataType.MakerSubmitRemark);
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Submit());
    	productMaster_RetailObj.productMaster_Product_Submit().click();
        
    }

    @Then("^system should display confirmation message after submit$")
    public void system_should_display_confirmation_message_after_submit() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessage());
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessage().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().isDisplayed();
    	System.out.println("System is displaying confirmation message after submit");
    }
    
    @Then("^capture checker ID$")
    public void capture_checker_ID() throws Throwable {
    	String message = productMaster_RetailObj.productMaster_Product_ConfirmationMessage().getText();
    	String emptystring = "";
		String ar[] = message.split(" ");
		emptystring=ar[ar.length-1];
		String checkerID=emptystring.replaceAll("[/.]", "");
		System.out.println(checkerID);
		jsonDataReaderWriter.addData(checkerID);
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    }
    
    @Then("^logout user$")
    public void logout_user() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_LogoutUser());
    	productMaster_RetailObj.productMaster_Product_LogoutUser().click();
    }
    
    @Then("^click on edit button of record2 to modify$")
    public void click_on_edit_button_of_record2_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
    	productMaster_RetailObj.productMaster_Product_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.Record2ForReject);
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
//    	xpath - (//span[contains(text(),'desc17')]/../../../td[1]/span[1]/button[1]/span[1])[1]
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record2ForReject + afterxpath)).click();
    	
    }
    
    @Then("^click on edit button of record3 to modify$")
    public void click_on_edit_button_of_record3_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
    	productMaster_RetailObj.productMaster_Product_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.Record3ForReturn);
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
//    	xpath - (//span[contains(text(),'depo30')]/../../../td[1]/span[1]/button[1]/span[1])[1]
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record3ForReturn + afterxpath)).click();
    }
    
////////////////////////////////////////////////////////////////////////////////
   
    @And("^User Login as checker$")
    public void user_login_as_checker() throws Throwable {
		kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
    }
    
    @Then("^click on menu button$")
    public void click_on_menu_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_MenuToggle());
    	productMaster_RetailObj.productMaster_Product_Checker_MenuToggle().click();
    }
    
    @Then("^select the modified record to approve$")
    public void select_the_modified_record_to_approve() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.ApproveReferenceID);
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.ApproveReferenceID+ afterxpath)).click();
    
    }

    @Then("^select approve button$")
    public void select_approve_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_Approve());
    	productMaster_RetailObj.productMaster_Product_Checker_Approve().click();
    }

    @Then("^enter remark for approve$")
    public void enter_remark_for_approve() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveRemark());
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveRemark(), 10, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveRemark().sendKeys(productMaster_RetailTestDataType.CheckerApproveRemark);
    }

    @Then("^click on approve button$")
    public void click_on_approved_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveButton());
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveButton().click();
    }

    @Then("^system should display confirmation message after approved$")
    public void system_should_display_confirmation_message_after_approved() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessage());
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessage().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    }
    
    @Then("^select the modified record to reject$")
    public void select_the_modified_record_to_reject() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.RejectReferenceID);
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.RejectReferenceID+ afterxpath)).click();
    }

    @Then("^select reject button$")
    public void select_reject_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_Reject());
    	productMaster_RetailObj.productMaster_Product_Checker_Reject().click();
    }

    @Then("^enter remark for reject$")
    public void enter_remark_for_reject() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectRemark());
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectRemark().sendKeys(productMaster_RetailTestDataType.CheckerRejectRemark);;
    }
    
    @Then("^click on reject button$")
    public void click_on_reject_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectButton());
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectButton().click();
    }

    @Then("^system should display confirmation message after reject$")
    public void system_should_display_confirmation_message_after_reject() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessage());
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessage().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    }
    
    @Then("^select the modified record to return$")
    public void select_the_modified_record_to_return() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(productMaster_RetailTestDataType.ReturnReferenceID);
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(1000);
		driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.ReturnReferenceID+ afterxpath)).click();
    
    }

    @Then("^select return button$")
    public void select_return_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_Return());
    	productMaster_RetailObj.productMaster_Product_Checker_Return().click();;
    }

    @Then("^enter remark for return$")
    public void enter_remark_for_return() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnRemark());
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnRemark().sendKeys(productMaster_RetailTestDataType.CheckerReturnRemark);
    }
    
    @Then("^click on return button$")
    public void click_on_return_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnButton());
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnButton().click();
    }

    @Then("^system should display confirmation message after return$")
    public void system_should_display_confirmation_message_after_return() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessage());
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessage().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    @Then("^verify proper validation message for blank field should display$")
    public void verify_proper_validation_message_for_blank_field_should_display() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
    	clicksAndActionsHelper.doubleClick(productMaster_RetailObj.productMaster_ProductDescription());
    	productMaster_RetailObj.productMaster_ProductDescription().sendKeys(Keys.BACK_SPACE);
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
    	productMaster_RetailObj.productMaster_Product_Save().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ProductDescriptionFieldValidation());
    	productMaster_RetailObj.productMaster_Product_ProductDescriptionFieldValidation().isDisplayed();
   
    }

    @Then("^verify system should not allow to enter invalid datatypes while modification$")
    public void verify_system_should_not_allow_to_enter_invalid_datatypes_while_modification() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Remark());
    	clicksAndActionsHelper.doubleClick(productMaster_RetailObj.productMaster_Product_Remark());
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Remark());
    	productMaster_RetailObj.productMaster_Product_Remark().sendKeys("*");
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage());
    	String validationmsg = productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage().getText();
    	System.out.println("Invalid datatype validation message - "+validationmsg);
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage());
    	productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage().isDisplayed();
    	
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    @Then("^verify the functionality of status of the record$")
    public void verify_the_functionality_of_status_of_the_record() throws Throwable {
    	while (true) {
			try {
				String beforexpath = "//span[contains(text(),'";
				String afterxpath = "')]/../../../td[6]/p-celleditor/p-tag/span";
				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).isDisplayed();
				break;
			} catch (Exception e) {
				try{
					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
				}catch(Exception ee) {
					System.out.println("Record is not available");
					break;
				}
			}
		}
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_DisplayStatus());
    	productMaster_RetailObj.productMaster_Product_DisplayStatus().isDisplayed();
    	String status = productMaster_RetailObj.productMaster_Product_DisplayStatus().getText();
    	System.out.println("Status of the record " +productMaster_RetailTestDataType.Record1BeforeApproved+ " in list view : "+status);
    	
    }

    @Then("^verify user can able to change the status from active to deactive$")
    public void verify_user_can_able_to_change_the_status_from_active_to_deactive() throws Throwable {
    	//span[contains(text(),'98303275')]/../../../td[1]/span[1]/button[1]/span[1])[1]
		while (true) {
			try {
				String beforexpath = "(//span[contains(text(),'";
				String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).click();
				break;
			} catch (Exception e) {
				try{
					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
				}catch(Exception ee) {
					System.out.println("Record is not available");
					break;
				}
			}
		}
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Status());
		productMaster_RetailObj.productMaster_Product_Status().click();
		
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
		productMaster_RetailObj.productMaster_Product_Save().click();
		
		while (true) {
			try {
				String beforexpath = "//span[contains(text(),'";
				String afterxpath = "')]/../../../td[6]/p-celleditor/p-tag/span";
				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).isDisplayed();
				break;
			} catch (Exception e) {
				try{
					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
				}catch(Exception ee) {
					System.out.println("Record is not available");
					break;
				}
			}
		}
		String status = productMaster_RetailObj.productMaster_Product_DisplayStatus().getText();
    	System.out.println("User changed Status to : "+status);
    }
    

    @Then("^verify user can able to change the status from deactive to active$")
    public void verify_user_can_able_to_change_the_status_from_deactive_to_active() throws Throwable {
    	//span[contains(text(),'98303275')]/../../../td[1]/span[1]/button[1]/span[1])[1]
		while (true) {
			try {
				String beforexpath = "(//span[contains(text(),'";
				String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).click();
				break;
			} catch (Exception e) {
				try{
					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
				}catch(Exception ee) {
					System.out.println("Record is not available");
					break;
				}
			}
		}
		
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Status());
		productMaster_RetailObj.productMaster_Product_Status().click();
		
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
		productMaster_RetailObj.productMaster_Product_Save().click();
		
		while (true) {
			try {
				String beforexpath = "//span[contains(text(),'";
				String afterxpath = "')]/../../../td[6]/p-celleditor/p-tag/span";
				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).isDisplayed();
				break;
			} catch (Exception e) {
				try{
					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
				}catch(Exception ee) {
					System.out.println("Record is not available");
					break;
				}
			}
		}
		String status = productMaster_RetailObj.productMaster_Product_DisplayStatus().getText();
    	System.out.println("User changed Status to : "+status);
    }

    @Then("^verify the functionality of back button$")
    public void verify_the_functionality_of_back_button() throws Throwable {
    	while (true) {
			try {
				String beforexpath = "(//span[contains(text(),'";
				String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
				driver.findElement(By.xpath(beforexpath + productMaster_RetailTestDataType.Record1BeforeApproved + afterxpath)).click();
				break;
			} catch (Exception e) {
				try{
					waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NextButtonListView());
					productMaster_RetailObj.productMaster_Product_NextButtonListView().click();
				}catch(Exception ee) {
					System.out.println("Record is not available");
					break;
				}
			}
		}
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Back());
    	productMaster_RetailObj.productMaster_Product_Back().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ProductMasterTitle());
    	productMaster_RetailObj.productMaster_Product_ProductMasterTitle().isDisplayed();
    	
    }
    
    ///////////////////////////////////////////////////////////////////////////
    
    @Then("^verify product master details list view fields should display all the fields$")
    public void verify_product_master_details_list_view_fields_should_display_all_the_fields() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_AddButton());
    	productMaster_RetailObj.productMaster_AddButton().isDisplayed();
    	productMaster_RetailObj.productMaster_Product_Search().isDisplayed();
    	productMaster_RetailObj.productMaster_Product_Export().isDisplayed();
    	
    	productMaster_RetailObj.productMaster_Product_Export().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_PdfFile());
    	productMaster_RetailObj.productMaster_Product_PdfFile().isDisplayed();
    	productMaster_RetailObj.productMaster_Product_XlsFile().isDisplayed();
    	productMaster_RetailObj.productMaster_Product_Export().click();
    	
    	productMaster_RetailObj.productMaster_ListViewProductGroup().isDisplayed();
    	productMaster_RetailObj.productMaster_ListViewProductCode().isDisplayed();
    	productMaster_RetailObj.productMaster_ListViewProductDescription().isDisplayed();
    	productMaster_RetailObj.productMaster_ListViewRetailCorporate().isDisplayed();
    	productMaster_RetailObj.productMaster_ListViewStatus().isDisplayed();
    	
    }

    @Then("^values in list view should not be editable$")
    public void values_in_list_view_should_not_be_editable() throws Throwable {
    	try {
    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductGroup().sendKeys("ok");
    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductCode().sendKeys("ok");
    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductDescription().sendKeys("ok");
    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfRetailandCorporate().sendKeys("ok");
    		System.out.println("Values in list view is editable");
    		
    	}catch(Exception e) {
    		System.out.println("Values in list view is not editable");
    	}
    }

    @Then("^verify add button should allow to create new record$")
    public void verify_add_button_should_allow_to_create_new_record() throws Throwable {
    	productMaster_RetailObj.productMaster_AddButton().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
    	productMaster_RetailObj.productMaster_Product_Save().isDisplayed();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Back());
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Back(), 10, 2);
    	productMaster_RetailObj.productMaster_Product_Back().click();
    }

    @Then("^verify search box should display matching record with matched data$")
    public void verify_search_box_should_display_matching_record_with_matched_data() throws Throwable {
		while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
				productMaster_RetailObj.productMaster_Product_Search().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys("desc30");
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductCode_desc30());
    	String productcode = productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductCode_desc30().getText();
    	Assert.assertEquals("desc30", productcode);
    	//    	boolean result = productcode.equalsIgnoreCase("desc30");
    }

    @Then("^verify search box should not display any record with mismatched data$")
    public void verify_search_box_should_not_display_any_record_with_mismatched_data() throws Throwable {
    	clicksAndActionsHelper.doubleClick(productMaster_RetailObj.productMaster_Product_SearchInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys("412379");
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_NoDataFoundInSearch());
    	productMaster_RetailObj.productMaster_Product_NoDataFoundInSearch().isDisplayed();
    	productMaster_RetailObj.productMaster_Product_SearchCloseButton().click();
    	
    }

    @Then("^click on export to pdf button system should download Pdf file$")
    public void click_on_export_to_pdf_button_system_should_download_pdf_file() throws Throwable {
    	productMaster_RetailObj.productMaster_Product_Export().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_PdfFile());
    	productMaster_RetailObj.productMaster_Product_PdfFile().click();
    	browserHelper.SwitchToWindow(1);
    	browserHelper.switchToParentWithChildClose();
    }

    @Then("^click on export to excel button system should download Excel file$")
    public void click_on_export_to_excel_button_system_should_download_excel_file() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Export());
    	productMaster_RetailObj.productMaster_Product_Export().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_XlsFile());
    	productMaster_RetailObj.productMaster_Product_XlsFile().click();
    }

    @Then("^system should show product group field and the field will display only$")
    public void system_should_show_product_group_field_and_the_field_will_display_only() throws Throwable {
    	boolean result = productMaster_RetailObj.productMaster_ListViewProductGroup().isDisplayed();
    	System.out.println("System is showing product group field - "+result);
    	
    	try {
    		productMaster_RetailObj.productMaster_ListViewProductGroup().sendKeys("ok");
    		System.out.println("Product Group Field in list view is not editable");
    	}catch(Exception e) {
    		System.out.println("Product Group Field in list view is not editable");
    	}
    }

    @Then("^system should show product code field and the field will display only$")
    public void system_should_show_product_code_field_and_the_field_will_display_only() throws Throwable {
    	boolean result = productMaster_RetailObj.productMaster_ListViewProductCode().isDisplayed(); 
    	System.out.println("System is showing product code field - "+result);
    	try {
    		productMaster_RetailObj.productMaster_ListViewProductCode().sendKeys("ok");
    		System.out.println("Product Code Field in list view is not editable");
    	}catch(Exception e) {
    		System.out.println("Product Code Field in list view is not editable");
    	}
    }

    @Then("^system should show product description field and the field will display only$")
    public void system_should_show_product_description_field_and_the_field_will_display_only() throws Throwable {
    	boolean result = productMaster_RetailObj.productMaster_ListViewProductDescription().isDisplayed();
    	System.out.println("System is showing product description field - "+result);
    	try {
    		productMaster_RetailObj.productMaster_ListViewProductDescription().sendKeys("ok");
    		System.out.println("Product Description Field in list view is not editable");
    		
    	}catch(Exception e) {
    		System.out.println("Product Description Field in list view is not editable");
    	}
    }

    @Then("^system should show retail or corporate field and the field will display only$")
    public void system_should_show_retail_or_corporate_field_and_the_field_will_display_only() throws Throwable {
    	boolean result = productMaster_RetailObj.productMaster_ListViewRetailCorporate().isDisplayed();
    	System.out.println("System is showing retail or corporate field - "+result);
    	try {
    		productMaster_RetailObj.productMaster_ListViewRetailCorporate().sendKeys("ok");
    		System.out.println("Retail or Corporate Field in list view is not editable");
    		
    	}catch(Exception e) {
    		System.out.println("Retail or Corporate Field in list view is not editable");
    	}
    }

    @Then("^system should show status field and the field will display only$")
    public void system_should_show_status_field_and_the_field_will_display_only() throws Throwable {
    	boolean result = productMaster_RetailObj.productMaster_ListViewStatus().isDisplayed();
    	System.out.println("System is showing status field - "+result);
    	try {
    		productMaster_RetailObj.productMaster_ListViewStatus().sendKeys("ok");
    		System.out.println("Status Field in list view is not editable");
    		
    	}catch(Exception e) {
    		System.out.println("Status Field in list view is not editable");
    	}
    }
}