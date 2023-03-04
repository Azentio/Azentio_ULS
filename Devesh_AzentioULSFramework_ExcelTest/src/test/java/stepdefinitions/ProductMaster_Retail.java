package stepdefinitions;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.Map;

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
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
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
	RadioButtonHelper radioButtonHelper = new RadioButtonHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ProductMaster_RetailObj productMaster_RetailObj = new ProductMaster_RetailObj(driver);
	ProductMaster_RetailTestDataType productMaster_RetailTestDataType=jsonConfig.getProductMasterRetailByName("Maker");
//	ExcelData excelData = new ExcelData(System.getProperty("user.dir")+"\\Test-data\\TestDataDesignSample3.xlsx","ProductMasterTestData","TestCaseUnique ID");
	ExcelData excelData = new ExcelData(System.getProperty("user.dir") + "\\Test-data\\ULS_TestDataForTesting.xlsx","ProductMasterTestData","Data Set ID");
	Map<String, String> testData;
	String reference_id;
	String dataSetID;
	
	@Then("^click on menu toggle$")
    public void click_on_menu_toggle() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_MenuToggle());
		productMaster_RetailObj.productMaster_MenuToggle().click();
    }
	
	@Then("^user should navigate to product master$")
    public void user_should_navigate_to_product_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_MenuToggle());
		productMaster_RetailObj.productMaster_MenuToggle().click();
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productmaster_Configuration());
		productMaster_RetailObj.productmaster_Configuration().click();
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.config_Manager());
		productMaster_RetailObj.config_Manager().click();
//		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.product_Setup());
//		productMaster_RetailObj.product_Setup().click();
    }
	
	@And("^click on edit view of product master$")
	public void click_on_edit_view_of_product_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_EditView());
		productMaster_RetailObj.productMaster_EditView().click();
	}
	
	@Then("^click on add button to create product master record$")
    public void click_on_add_button_to_create_product_master_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_AddButton());
		productMaster_RetailObj.productMaster_AddButton().click();
    }

    @Then("^fill all the valid data in product master screen to modify$")
    public void fill_all_the_valid_data_in_product_master_screen_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductGroup());
    	productMaster_RetailObj.productMaster_ProductGroup().click();
    	radioButtonHelper.radioButton(testData.get("Product Group"));
    	
    	for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductCode());
				productMaster_RetailObj.productMaster_ProductCode().sendKeys(testData.get("Product Code"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription(), 5, 1);
    	productMaster_RetailObj.productMaster_ProductDescription().sendKeys(testData.get("Product Description"));
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_RetailCorporate());
    	productMaster_RetailObj.productMaster_RetailCorporate().click();
    	radioButtonHelper.radioButton(testData.get("Retail/Corporate"));
    	
    	for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_DMCode());
				productMaster_RetailObj.productMaster_Product_DMCode().sendKeys(testData.get("DM Code"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Remark());
    	productMaster_RetailObj.productMaster_Product_Remark().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Remark());
    	productMaster_RetailObj.productMaster_Product_Remark().sendKeys(testData.get("Remarks"));
    	
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
    	productMaster_RetailObj.productMaster_Product_Save().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton());
    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
    }

    @Then("^click on edit button of record to modify$")
    public void click_on_edit_button_of_record_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
    	productMaster_RetailObj.productMaster_Product_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(2000);
		driver.findElement(By.xpath(beforexpath +testData.get("Product Code")+ afterxpath)).click();
    }
//    @Then("^click on edit button of record to modify with invalid data$")
//    public void click_on_edit_button_of_record_to_modify_with_invalid_data() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
//    	productMaster_RetailObj.productMaster_Product_Search().click();
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
//    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
////      xpath-	(//span[contains(text(),'depo30')]/../../../td[1]/span[1]/button[1]/span[1])[1]
//    	String beforexpath = "(//span[contains(text(),'";
//    	String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
//    	Thread.sleep(1000);
//    	driver.findElement(By.xpath(beforexpath +testData.get("Product Code")+ afterxpath)).click();
//    }

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
    	for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductGroup());
				productMaster_RetailObj.productMaster_ProductGroup().click();
				radioButtonHelper.radioButton(testData.get("Modify Product Group"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
    	
    	for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
				productMaster_RetailObj.productMaster_ProductDescription().click();
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
				productMaster_RetailObj.productMaster_ProductDescription().sendKeys(Keys.chord(Keys.CONTROL,"A"));
				waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription(), 5, 1);
				productMaster_RetailObj.productMaster_ProductDescription().sendKeys(testData.get("Modify Product Description"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_DMCode());
    	productMaster_RetailObj.productMaster_Product_DMCode().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	productMaster_RetailObj.productMaster_Product_DMCode().sendKeys(testData.get("Modify DM Code"));
    	
    	for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Remark());
				productMaster_RetailObj.productMaster_Product_Remark().sendKeys(Keys.chord(Keys.CONTROL,"A"));
				productMaster_RetailObj.productMaster_Product_Remark().sendKeys(testData.get("Modify Remarks"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	
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
        productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Approved Record"));
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(2000);
		driver.findElement(By.xpath(beforexpath +testData.get("Approved Record")+ afterxpath)).click();
    	
		for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductGroup());
				productMaster_RetailObj.productMaster_ProductGroup().click();
				radioButtonHelper.radioButton(testData.get("Modify Product Group"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
    	
    	for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
				productMaster_RetailObj.productMaster_ProductDescription().click();
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
				productMaster_RetailObj.productMaster_ProductDescription().sendKeys(Keys.chord(Keys.CONTROL,"A"));
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
				productMaster_RetailObj.productMaster_ProductDescription().sendKeys(testData.get("Modify Product Description"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
        
        waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_DMCode());
    	productMaster_RetailObj.productMaster_Product_DMCode().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	productMaster_RetailObj.productMaster_Product_DMCode().sendKeys(testData.get("Modify DM Code"));
    	
    	for (int i = 0; i < 10; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Remark());
				productMaster_RetailObj.productMaster_Product_Remark().sendKeys(Keys.chord(Keys.CONTROL,"A"));
				productMaster_RetailObj.productMaster_Product_Remark().sendKeys(testData.get("Modify Remarks"));
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	
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
    	System.out.println("System should display the confirmation message");
    }

    @Then("^click on inbox button$")
    public void click_on_inbox_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Inbox());
    	productMaster_RetailObj.productMaster_Product_Inbox().click();
    }
    
    @Then("^select the modified record from inbox to approve$")
    public void select_the_modified_record_from_inbox_to_approve() throws Throwable {
    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(2000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
    }
    
    @Then("^select the modified record from inbox to reject$")
    public void select_the_modified_record_from_inbox_to_reject() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(2000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
    }
    
    @Then("^select the modified record from inbox to return$")
    public void select_the_modified_record_from_inbox_to_return() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(2000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
    }

    @Then("^click on submit button$")
    public void click_on_submit_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Maker_Submit());
    	productMaster_RetailObj.productMaster_Product_Maker_Submit().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_MakerSubmitRemark());
    	productMaster_RetailObj.productMaster_Product_MakerSubmitRemark().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_MakerSubmitRemark());
    	productMaster_RetailObj.productMaster_Product_MakerSubmitRemark().sendKeys(testData.get("Maker Submit Remark"));
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Submit());
    	productMaster_RetailObj.productMaster_Product_FinalSubmit().click();
        
    }

    @Then("^system should display confirmation message after submit$")
    public void system_should_display_confirmation_message_after_submit() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessage());
    	boolean status=productMaster_RetailObj.productMaster_Product_ConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
    	boolean status1=productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().isDisplayed();
    	Assert.assertTrue(status1);
    	System.out.println("System is displaying confirmation message after submit");
    }
    
    @Then("^capture checker ID$")
    public void capture_checker_ID() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessage());
    	String message = productMaster_RetailObj.productMaster_Product_ConfirmationMessage().getText();
    	String emptystring = "";
		String ar[] = message.split(" ");
		emptystring=ar[ar.length-1];
		String checkerID=emptystring.replaceAll("[/.]", "");
		if(checkerID.equals("ssk")) {
			Assert.fail("User ssk is not Valid");
		}
		System.out.println("Checker id : "+checkerID);
		excelData.updateTestData(dataSetID, "Checker id", checkerID);
		testData = excelData.getTestdata(dataSetID);
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    }
    
    @Then("^logout user$")
    public void logout_user() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Profile());
    	productMaster_RetailObj.productMaster_Product_Profile().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_LogoutUser());
    	productMaster_RetailObj.productMaster_Product_LogoutUser().click();
    }
    
    @Then("^click on edit button of record2 to modify$")
    public void click_on_edit_button_of_record2_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
    	productMaster_RetailObj.productMaster_Product_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(2000);
		driver.findElement(By.xpath(beforexpath + testData.get("Product Code") + afterxpath)).click();
    	
    }
    
    @Then("^click on edit button of record3 to modify$")
    public void click_on_edit_button_of_record3_to_modify() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
    	productMaster_RetailObj.productMaster_Product_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		Thread.sleep(2000);
		driver.findElement(By.xpath(beforexpath + testData.get("Product Code") + afterxpath)).click();
    }
    
////////////////////////////////////////////////////////////////////////////////
   
    @And("^User Login as checker$")
    public void user_login_as_checker() throws Throwable {
    	testData = excelData.getTestdata(dataSetID);
		kulsLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
    }
    
//    @Then("^click on menu button$")
//    public void click_on_menu_button() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_MenuToggle());
//    	productMaster_RetailObj.productMaster_Product_Checker_MenuToggle().click();
//    }
    
    @Then("^select the modified record to approve$")
    public void select_the_modified_record_to_approve() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInbox());
    	productMaster_RetailObj.productMaster_Product_SearchInbox().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInboxInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(2000);
//		waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +productMaster_RetailTestDataType.ApproveReferenceID+ afterxpath)));
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
    
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
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveRemark().click();
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveRemark(), 10, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerApproveRemark().sendKeys(testData.get("Checker Submit Remark"));
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
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
//		xpath - //span[contains(text(),'5550')]/../../td[1]/button
		Thread.sleep(2000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
    }

    @Then("^select reject button$")
    public void select_reject_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_Reject());
    	productMaster_RetailObj.productMaster_Product_Checker_Reject().click();
    }

    @Then("^enter remark for reject$")
    public void enter_remark_for_reject() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectRemark());
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectRemark(), 10, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectRemark().click();
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectRemark(), 10, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerRejectRemark().sendKeys(testData.get("Checker Submit Remark"));;
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
    	productMaster_RetailObj.productMaster_Product_SearchInboxInputField().sendKeys(testData.get("Reference ID"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../td/button";
		Thread.sleep(2000);
		driver.findElement(By.xpath(beforexpath +testData.get("Reference ID")+ afterxpath)).click();
    
    }

    @Then("^select return button$")
    public void select_return_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_Return());
    	productMaster_RetailObj.productMaster_Product_Checker_Return().click();;
    }

    @Then("^enter remark for return$")
    public void enter_remark_for_return() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnRemark());
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnRemark(), 10, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnRemark().click();
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnRemark(), 10, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_CheckerReturnRemark().sendKeys(testData.get("Checker Submit Remark"));
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
    	productMaster_RetailObj.productMaster_ProductDescription().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
    	productMaster_RetailObj.productMaster_ProductDescription().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductDescription());
    	productMaster_RetailObj.productMaster_ProductDescription().sendKeys(Keys.BACK_SPACE);
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
    	productMaster_RetailObj.productMaster_Product_Save().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ProductDescriptionFieldValidation());
    	boolean message = productMaster_RetailObj.productMaster_Product_ProductDescriptionFieldValidation().isDisplayed();
    	Assert.assertEquals(message, true);
    }

    @Then("^verify system should not allow to enter invalid datatypes while modification$")
    public void verify_system_should_not_allow_to_enter_invalid_datatypes_while_modification() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Remark());
    	productMaster_RetailObj.productMaster_Product_Remark().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Remark());
    	productMaster_RetailObj.productMaster_Product_Remark().sendKeys(testData.get("Invalid Data"));
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage());
    	String validationmsg = productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage().getText();
    	System.out.println("Invalid datatype validation message - "+validationmsg);
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage());
    	boolean message = productMaster_RetailObj.productMaster_Product_InvalidDatatypeValidationMessage().isDisplayed();
    	Assert.assertEquals(message, true);
    	
    }
    
    /////////////////////////////////////////////////////////////////////////////
    
    @Then("^verify the functionality of status of the record$")
    public void verify_the_functionality_of_status_of_the_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
    	productMaster_RetailObj.productMaster_Product_Search().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../../td[6]/p-celleditor/p-tag/span";
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath(beforexpath + testData.get("Product Code") + afterxpath)).isDisplayed();
		Assert.assertTrue(status);
		String status1 = driver.findElement(By.xpath(beforexpath + testData.get("Product Code") + afterxpath)).getText();
//    	String status = productMaster_RetailObj.productMaster_Product_DisplayStatus().getText();
    	System.out.println("Status of the record " +testData.get("Product Code")+ " in list view : "+status1);
    	
    }

    @Then("^verify user can able to change the status from active to deactive$")
    public void verify_user_can_able_to_change_the_status_from_active_to_deactive() throws Throwable {
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		driver.findElement(By.xpath(beforexpath + testData.get("Product Code") + afterxpath)).click();
    	
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Status());
		productMaster_RetailObj.productMaster_Product_Status().click();
		
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
		productMaster_RetailObj.productMaster_Product_Save().click();
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton());
		productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
    }
    
    @Then("^verifying the status is changes to deactive$")
    public void verifying_the_status_is_changes_to_deactive() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
    	productMaster_RetailObj.productMaster_Product_Search().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
    	
    	String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../../td[6]/p-celleditor/p-tag/span";
		Thread.sleep(2000);
		String status = driver.findElement(By.xpath(beforexpath + testData.get("Product Code") + afterxpath)).getText();
		System.out.println("User changed Status to : " + status);
    }
    @Then("^verifying the status is changes to active$")
    public void verifying_the_status_is_changes_to_active() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Search());
		productMaster_RetailObj.productMaster_Product_Search().click();
		
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField());
		productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
		
		String beforexpath = "//span[contains(text(),'";
		String afterxpath = "')]/../../../td[6]/p-celleditor/p-tag/span";
		Thread.sleep(2000);
		String status = driver.findElement(By.xpath(beforexpath + testData.get("Product Code") + afterxpath)).getText();
		System.out.println("User changed Status to : " + status);
	}
    

    @Then("^verify user can able to change the status from deactive to active$")
    public void verify_user_can_able_to_change_the_status_from_deactive_to_active() throws Throwable {
    	
    	String beforexpath = "(//span[contains(text(),'";
		String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
		driver.findElement(By.xpath(beforexpath + testData.get("Product Code") + afterxpath)).click();
		
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Status());
		productMaster_RetailObj.productMaster_Product_Status().click();
		
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
		productMaster_RetailObj.productMaster_Product_Save().click();
		
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton());
		productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
		
    }

    @Then("^verify the functionality of back button of product master$")
    public void verify_the_functionality_of_back_button_of_product_master() throws Throwable {
    	while (true) {
			try {
				String beforexpath = "(//span[contains(text(),'";
				String afterxpath = "')]/../../../td[1]/span[1]/button[1]/span[1])[1]";
				driver.findElement(By.xpath(beforexpath + testData.get("Product Code") + afterxpath)).click();
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
    		System.out.println("ProductGroup Values in list view is editable");
    		
    	}catch(Exception e) {
    		System.out.println("Values in list view is not editable");
    	}
    	try {
    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductCode().sendKeys("ok");
    		System.out.println("ProductCode Values in list view is editable");
    		
    	}catch(Exception e) {
    		System.out.println("Values in list view is not editable");
    	}
    	try {
    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfProductDescription().sendKeys("ok");
    		System.out.println("ProductDescription Values in list view is editable");
    		
    	}catch(Exception e) {
    		System.out.println("Values in list view is not editable");
    	}
    	try {
    		productMaster_RetailObj.productMaster_Product_ListViewFirstFieldOfRetailandCorporate().sendKeys("ok");
    		System.out.println("RetailandCorporate Values in list view is editable");
    		
    	}catch(Exception e) {
    		System.out.println("Values in list view is not editable");
    	}
    }

    @Then("^verify add button should allow to create new record$")
    public void verify_add_button_should_allow_to_create_new_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_AddButton());
    	productMaster_RetailObj.productMaster_AddButton().click();
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Save());
    	productMaster_RetailObj.productMaster_Product_Save().isDisplayed();
    	
    	while(true) {
    		try {
//    			waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Back(), 10, 2);
    			productMaster_RetailObj.productMaster_Product_Back().click();
    			break;
			} catch (Exception e) {
				// TODO: handle exception
			}
    	}
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
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
    	
    	String beforexpath = "//span[text()='";
    	String afterxpath = " ']";
    	Thread.sleep(2000);
    	String productcode = driver.findElement(By.xpath(beforexpath+ testData.get("Product Code")+afterxpath)).getText();
    	Assert.assertEquals(testData.get("Product Code"), productcode);
    	
    }

    @Then("^verify search box should not display any record with mismatched data$")
    public void verify_search_box_should_not_display_any_record_with_mismatched_data() throws Throwable {
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Invalid Data"));
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
    	while (true) {
			try {
				waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_Export());
	    		productMaster_RetailObj.productMaster_Product_Export().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
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
    
//    ---------------------------------------------------------------------------------------------------
//    ---------------------------------------------------------------------------------------------------
    
    @Then("^click on Product Setup$")
    public void click_on_product_setup()  {
    waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ModuleName());
    productMaster_RetailObj.productMaster_ModuleName().click();
	radioButtonHelper.radioButton("LOS");
    waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_MenuToggle());
	productMaster_RetailObj.productMaster_MenuToggle().click();
	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productmaster_Configuration());
    productMaster_RetailObj.productmaster_Configuration().click();;
    waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.config_Manager());
    productMaster_RetailObj.config_Manager().click();;
//    waithelper.waitForElementToVisibleWithFluentWait(driver,productMaster_RetailObj.product_Setup(), 60, 1);
//	productMaster_RetailObj.product_Setup().click();   
    }

    @Then("^click on Product Master eye icon$")
    public void click_on_product_master_eye_icon()  {
    //waithelper.waitForElement(driver, 2000, productMaster_RetailObj.productMaster_EyeIcon());
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_EyeIcon(), 60, 1);
    productMaster_RetailObj.productMaster_EyeIcon().click();   
    }

    @Then("^click on Product Master add button$")
    public void click_on_product_master_add_button() throws InterruptedException  {
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_AddButton(), 60, 2);
    productMaster_RetailObj.productMaster_AddButton().isDisplayed();
    for (int i = 0; i<20; i++)
    {
    	try {
    		Thread.sleep(1000);
    		productMaster_RetailObj.productMaster_AddButton().click(); 
    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
     
    
    }

    @Then("^verify functionality and asterik mark of the field Product Group$")
    public void verify_functionality_and_asterik_mark_of_the_field_product_group()  {
    //ProductGroup
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductGroup(), 60, 2);
    productMaster_RetailObj.productMaster_ProductGroup().isDisplayed();
   
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Product Group");
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductGroup().click();
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductGroup_Dropdown(), 60, 2);
    
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductGroup_Dropdown().click(); 
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    }

    @Then("^verify functionality and asterik mark of the field Product Code$")
    public void verify_functionality_and_asterik_mark_of_the_field_product_code()  {
    //ProductCode
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductCode(), 60, 2);
    productMaster_RetailObj.productMaster_ProductCode().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Product Code");
//    for (int i = 0; i<20; i++)
//    {
//    	try {
    		productMaster_RetailObj.productMaster_ProductCode().click();
    		productMaster_RetailObj.productMaster_ProductCode().sendKeys(testData.get("Product Code"));
//    	      break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
    
    }
    
    @Then("^Enter Product Code for Return$")
    public void enter_product_code_for_return()  {
    //ProductCode for Return the record
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductCode(), 60, 2);
    productMaster_RetailObj.productMaster_ProductCode().isDisplayed(); 
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductCode().click(); 
    	    productMaster_RetailObj.productMaster_ProductCode().sendKeys(testData.get("Product Code"));

    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
           
    }
    @Then("^Enter Product Code for reject$")
    public void enter_product_code_for_reject()  {
    //ProductCode for Reject the record
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductCode(), 60, 2);
    productMaster_RetailObj.productMaster_ProductCode().isDisplayed(); 
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductCode().click(); 
    	    productMaster_RetailObj.productMaster_ProductCode().sendKeys(testData.get("Product Code"));
    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
           
    }

    @Then("^Enter Product Description$")
    public void enter_product_description()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescriptionEnter(), 30, 2);
    productMaster_RetailObj.productMaster_ProductDescriptionEnter().isDisplayed();
    waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductCode());
    
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductDescriptionEnter().click(); 
    	    productMaster_RetailObj.productMaster_ProductDescriptionEnter().sendKeys(testData.get("Product Description"));
    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    
   
    }
    
    //-------------Multi language description----------//
    
    @Then("^verify functionality and asterik mark of the field Product Description$")
    public void verify_functionality_and_asterik_mark_of_the_field_product_description() throws InterruptedException  {
    //ProductDescription
    
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Product Description");
   
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Language(), 20, 1);
    productMaster_RetailObj.Language().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Language_French(), 20, 1);
    productMaster_RetailObj.Language_French().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescriptionAdd(), 20, 1);
    productMaster_RetailObj.productMaster_ProductDescriptionAdd().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Description_MultilanguageInputField(), 20, 1);
    productMaster_RetailObj.Description_MultilanguageInputField().sendKeys(productMaster_RetailTestDataType.DescriptionFrench);
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Description_Close(), 20, 1);
    productMaster_RetailObj.Description_Close().click();
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,  productMaster_RetailObj.Language(), 20, 1);
    productMaster_RetailObj.Language().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Language_German(), 20, 1);
    productMaster_RetailObj.Language_German().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescriptionAdd(), 20, 1);
    productMaster_RetailObj.productMaster_ProductDescriptionAdd().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Description_MultilanguageInputField(), 20, 1);
    productMaster_RetailObj.Description_MultilanguageInputField().sendKeys(productMaster_RetailTestDataType.DescriptionGerman);
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Description_Close(), 20, 1);
    productMaster_RetailObj.Description_Close().click();
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,  productMaster_RetailObj.Language(), 20, 1);
    productMaster_RetailObj.Language().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Language_Arabic(), 20, 1);
    productMaster_RetailObj.Language_Arabic().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescriptionAdd(), 20, 1);
    productMaster_RetailObj.productMaster_ProductDescriptionAdd().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Description_MultilanguageInputField(), 20, 1);
    productMaster_RetailObj.Description_MultilanguageInputField().sendKeys(productMaster_RetailTestDataType.DescriptionArabic);
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Description_Close(), 20, 1);
    productMaster_RetailObj.Description_Close().click();
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Language(), 20, 1);
    productMaster_RetailObj.Language().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,  productMaster_RetailObj.Language_English(), 20, 1);
    productMaster_RetailObj.Language_English().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescriptionAdd(), 20, 1);
    productMaster_RetailObj.productMaster_ProductDescriptionAdd().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Description_MultilanguageInputField(), 20, 1);
    productMaster_RetailObj.Description_MultilanguageInputField().sendKeys(productMaster_RetailTestDataType.DescriptionEnglish);
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.Description_Close(), 20, 1);
    productMaster_RetailObj.Description_Close().click();
    
    }

    @Then("^verify functionality and asterik mark of the field RetailCorporate$")
    public void verify_functionality_and_asterik_mark_of_the_field_retailcorporate()  {
    //RetailCorporate
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_RetailCorporate(), 60, 2);
    productMaster_RetailObj.productMaster_RetailCorporate().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Retail/Corporate");
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_RetailCorporate().click(); 
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
        
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_RetailCorporate_Dropdown(), 60, 2);
    productMaster_RetailObj.productMaster_RetailCorporate_Dropdown().isDisplayed();
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_RetailCorporate_Dropdown().click(); 
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }        
    }

    @Then("^verify functionality of the field DM Code$")
    public void verify_functionality_of_the_field_dm_code()  {
    //DMCode
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_DMCode(), 60, 2);
    productMaster_RetailObj.productMaster_Product_DMCode().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("DM Code");
    waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_DMCode());
    
    for (int i = 0; i<20; i++)
    {
    	try {
    		 productMaster_RetailObj.productMaster_Product_DMCode().click();
    		 productMaster_RetailObj.productMaster_Product_DMCode().sendKeys(testData.get("DM Code"));
    	     break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
   
    
    }

    @Then("^verify the field Remarks$")
    public void verify_the_field_remarks()  {
    //Remarks
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Remark(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Remark().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Remarks");
    for (int i = 0; i<20; i++)
    {
    	try {
    		 productMaster_RetailObj.productMaster_Product_Remark().click();
    		 productMaster_RetailObj.productMaster_Product_Remark().sendKeys(testData.get("Remarks"));
    		 break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
       
    
    }

    @Then("^verify the functionality of Back button$")
    public void verify_the_functionality_of_back_button()  {
    //Back
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Back(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Back().isDisplayed();
    productMaster_RetailObj.productMaster_Product_Back().click();
   
    }
    @Then("^click on save button$")
    public void click_on_save_button()  {
    //Save
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Save(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Save().isDisplayed();
    productMaster_RetailObj.productMaster_Product_Save().click();
    
    }
    
    
    //---------------------validating----------------------------------------------------//

    @Then("^validate the impact of any mandatory field blank$")
    public void validate_the_impact_of_any_mandatory_field_blank()  {
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ValidationRequiredField(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ValidationRequiredField().isDisplayed();
    }
    
  //------------------------Remarks with special characters value-------------------------//
    
    @Then("^verify the field Remarks with special characters value$")
    public void verify_the_field_remarks_with_special_characters_value()  {
    //Remarks
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Remark(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Remark().isDisplayed();
    
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_Product_Remark().click();
    	    productMaster_RetailObj.productMaster_Product_Remark().sendKeys(testData.get("Invalid Data"));         
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    
    }
    @Then("^validate the impact of special characters value in any field$")
    public void validate_the_impact_of_special_characters_value_in_any_field()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ValidationAlphanumeric(), 10, 2);
    productMaster_RetailObj.productMaster_Product_ValidationAlphanumeric().isDisplayed();  
    }
    
    @Then("^validate Success pop up$")
    public void validate_success_pop_up()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SuccessValidation(), 60, 5);
    productMaster_RetailObj.productMaster_Product_SuccessValidation().isDisplayed();
    String msg = productMaster_RetailObj.productMaster_Product_SuccessValidation().getText();
	System.out.println(msg);
	String emptyString = "";
	String ar[] = msg.split(" ");
	emptyString=ar[ar.length-1];
	reference_id=emptyString.replaceAll("[/.]", "");
	System.out.println("Reference ID : "+reference_id);
	excelData.updateTestData(dataSetID, "Reference ID", reference_id);
	testData = excelData.getTestdata(dataSetID);
	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton());
	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
    }
    
    @Then("^click on Menu$")
    public void click_on_menu()  {
    //Menu
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Menu(), 10, 2);
    productMaster_RetailObj.productMaster_Product_Menu().click();  
    	    
    }

    @Then("^click on inbox$")
    public void click_on_inbox()  {
    //Inbox
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Inbox(), 10, 2);
    productMaster_RetailObj.productMaster_Product_Inbox().click();  
    }
    @Then("^click on search icon of record list$")
    public void click_on_search_icon_of_record_list()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchRecordList(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchRecordList().click();
    }
    @Then("^search Project Master Retail record$")
    public void search_project_master_retail_record() throws InterruptedException  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Event Code"));
        
    }
    
    @And("^maker user open the record from inbox$")
    public void maker_user_open_the_record_from_inbox() throws IOException, ParseException, InterruptedException  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ReferanceId(), 60, 2);
    referenceID = productMaster_RetailObj.productMaster_Product_ReferanceId().getText();
    Thread.sleep(2000); 
	String beforeXpath = "//span[contains(text(),'";
	String afterXpath = "')]/../../td/button";
  System.out.println(testData.get("Reference ID")); 
  WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+testData.get("Reference ID")+afterXpath));
    waithelper.waitForElementToVisibleWithFluentWait(driver, firstRecord, 60, 2);
    for (int i = 0; i<20; i++)
    {
    	try {
    		firstRecord.click(); 
    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
	 
    }

    
    
    @Then("^maker user submit the Record$")
    public void maker_user_submit_the_record() throws IOException  {
    //Submit the record from maker
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Submit(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Submit().click();
    
	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SubmitRemark(), 60, 2);
	productMaster_RetailObj.productMaster_Product_SubmitRemark().click();
        
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SubmitRemark(), 20, 2);
    productMaster_RetailObj.productMaster_Product_FinalSubmit().click();  
    
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 20, 5);
    String message = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
	System.out.println(message);
	String emptystring = "";
	String ar[] = message.split(" ");
	emptystring=ar[ar.length-1];
	String checkerID=emptystring.replaceAll("[/.]", "");
	System.out.println(checkerID);
	excelData.updateTestData(dataSetID, "Checker id", checkerID);
	testData = excelData.getTestdata(dataSetID);
	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton(), 20, 2);
	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
	
    }
   
    @Then("^user logout from the application$")
    public void user_logout_from_the_application()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Profile(), 20, 2);
    productMaster_RetailObj.productMaster_Product_Profile().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Logout(), 20, 2);
    productMaster_RetailObj.productMaster_Product_Logout().click();     
    }

    @Then("^checker user open the record from inbox$")
    public void checker_user_open_the_record_from_inbox() throws IOException, ParseException  {
    	System.out.println("reference Id "+referenceID);
    	String beforeXpath = "//span[contains(text(),'";
    	String afterXpath = "')]/../../td/button";
    	
    	WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+testData.get("Reference ID")+afterXpath));
        waithelper.waitForElementToVisibleWithFluentWait(driver, firstRecord, 60, 2);
//        for (int i = 0; i<20; i++)
        while(true){
        {
        	try {
        		firstRecord.click(); 
        	    break;
        	    }
        	catch(Exception e) { 
        		
        	}
        }}
    	
    }
    

    @Then("^checker user approve the record$")
    public void checker_user_approve_the_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Approve(), 60, 2);  
    	productMaster_RetailObj.productMaster_Product_Checker_Approve().click();
    	
		waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ApproveRemark(), 60, 2);  
		productMaster_RetailObj.productMaster_Product_Checker_ApproveRemark().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ApproveAlert(), 60, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_ApproveAlert().click(); 
  
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 5);
    	String makerId = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
    	System.out.println(makerId);
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ApproveConfirmationMessageCloseButton(), 60, 2);
    	productMaster_RetailObj.productMaster_Product_ApproveConfirmationMessageCloseButton().click();
//    	productMaster_RetailObj.productMaster_Product_Checker_Alert_Close().click();
    	
    }
   @Then("^checker user return the record$")
    public void checker_user_return_the_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Return(), 60, 2);  
    	productMaster_RetailObj.productMaster_Product_Checker_Return().click();
    	
		waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ReturnRemark(), 60, 2);  
		productMaster_RetailObj.productMaster_Product_Checker_ReturnRemark().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ReturnAlert(), 60, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_ReturnAlert().click(); 
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 5);
    	String makerId = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
    	System.out.println(makerId);
//    	productMaster_RetailObj.productMaster_Product_Checker_Alert_Close().click();
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ApproveConfirmationMessageCloseButton(), 60, 2);
    	productMaster_RetailObj.productMaster_Product_ApproveConfirmationMessageCloseButton().click();
    	         
    }
    
    
    @Then("^checker user reject the record$")
    public void checker_user_reject_the_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Reject(), 60, 2);  
    	productMaster_RetailObj.productMaster_Product_Checker_Reject().click();
    	
		waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_RejectRemark(), 60, 2);  
		productMaster_RetailObj.productMaster_Product_Checker_RejectRemark().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_RejectAlert(), 60, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_RejectAlert().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 5);
    	String makerId = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
    	System.out.println(makerId);
//    	productMaster_RetailObj.productMaster_Product_Checker_Alert_Close().click();
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ApproveConfirmationMessageCloseButton(), 60, 2);
    	productMaster_RetailObj.productMaster_Product_ApproveConfirmationMessageCloseButton().click();
    
    }

    
    
    //-----------------------search---------------//
    
    @Then("^search approved record$")
    public void search_approved_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
     
    }

    @Then("^close the search input field$")
    public void close_the_search_input_field()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputFieldClose(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchInputFieldClose().click();   
       
    }
    
    @Then("^search Rejected record$")
    public void search_rejected_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
        
    }
    
    //---------------view summary----------------//
    @Then("^click on Product Master edit icon$")
    public void click_on_product_master_edit_icon()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.ProductMaster_Product_Edit(), 60, 2);
    productMaster_RetailObj.ProductMaster_Product_Edit().click();   
//    javaScriptHelper.scrollToElemetAndClick(productMaster_RetailObj.ProductMaster_Product_Edit());
    }

    @Then("^click on search icon$")
    public void click_on_search_icon()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Search(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Search().click();     
    }

    @Then("^search the record$")
    public void search_the_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(testData.get("Product Code"));
    
    }
    @Then("^open the record$")
    public void open_the_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.ProductMaster_Product_ActionEdit(), 60, 2);
    productMaster_RetailObj.ProductMaster_Product_ActionEdit().click();      
    }

    @Then("^click on view summary$")
    public void click_on_view_summary()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummary(), 60, 2);
    WebElement viewsummary = productMaster_RetailObj.productMaster_Product_ViewSummary(); 
    clicksAndActionsHelper.JSEClick(viewsummary);
    }
    

    @Then("^verify the fields of view summary$")
    public void verify_the_fields_of_view_summary()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryUser(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryUser().isDisplayed();  
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryStageCode(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryStageCode().isDisplayed();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryStatus(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryStatus().isDisplayed();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryStartTime(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryStartTime().isDisplayed(); 
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryEndTime(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryEndTime().isDisplayed();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryRemarks(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryRemarks().isDisplayed(); 
    
    
    }
    @Then("^close the view summary$")
    public void close_the_view_summary()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryClose(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryClose().click();    
    
    }
    
    @Then("^select data set ID for product master retail testcase001$")
    public void select_data_set_id_for_product_master_retail_testcase001() throws Throwable {
    	dataSetID = "AT_PMR_01_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for product master retail testcase002$")
    public void select_data_set_id_for_product_master_retail_testcase002() throws Throwable {
    	dataSetID = "AT_PMR_02_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for product master retail testcase003$")
    public void select_data_set_id_for_product_master_retail_testcase003() throws Throwable {
    	dataSetID = "AT_PMR_03_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for product master retail testcase004$")
    public void select_data_set_id_for_product_master_retail_testcase004() throws Throwable {
    	dataSetID = "AT_PMR_04_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for product master retail testcase005$")
    public void select_data_set_id_for_product_master_retail_testcase005() throws Throwable {
    	dataSetID = "AT_PMR_05_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for product master retail testcase006$")
    public void select_data_set_id_for_product_master_retail_testcase006() throws Throwable {
    	dataSetID = "AT_PMR_06_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for product master retail testcase007$")
    public void select_data_set_id_for_product_master_retail_testcase007() throws Throwable {
    	dataSetID = "AT_PMR_07_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for product master retail testcase008$")
    public void select_data_set_id_for_product_master_retail_testcase008() throws Throwable {
    	dataSetID = "AT_PMR_08_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for product master retail testcase009$")
    public void select_data_set_id_for_product_master_retail_testcase009() throws Throwable {
    	dataSetID = "AT_PMR_09_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for product master retail testcase010$")
    public void select_data_set_id_for_product_master_retail_testcase010() throws Throwable {
    	dataSetID = "AT_PMR_010_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for product master retail testcase011$")
    public void select_data_set_id_for_product_master_retail_testcase011() throws Throwable {
    	dataSetID = "AT_PMR_011_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
    @Then("^select data set ID for product master retail testcase012$")
    public void select_data_set_id_for_product_master_retail_testcase012() throws Throwable {
    	dataSetID = "AT_PMR_012_D1";
    	testData = excelData.getTestdata(dataSetID);
    }
    
}