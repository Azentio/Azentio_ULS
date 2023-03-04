package stepdefinitions;

import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.KULS_LoginObj;
import pageobjects.OwnershipDetailsObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class OwnershipDetails {

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
	OwnershipDetailsObj ownershipDetailsObj = new OwnershipDetailsObj(driver);
	SoftAssert softAssert = new SoftAssert();
	ExcelData excelData = new ExcelData(System.getProperty("user.dir") + "\\Test-data\\TestDataDesignSample.xlsx","OwnershipLayoutTestData","Data Set ID");
	Map<String, String> testData;
	String dataSetID;
	
	@Then("^user should click on the menuu toggle$")
    public void user_should_click_on_the_menuu_toggle() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, ownershipDetailsObj.ownershipDetails_Maker_MenuToggle());
		ownershipDetailsObj.ownershipDetails_Maker_MenuToggle().click();
    }

    @Then("^click on inbox to search for the Ownership Details record$")
    public void click_on_inbox_to_search_for_the_ownership_details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, ownershipDetailsObj.ownershipDetails_Inbox());
    	ownershipDetailsObj.ownershipDetails_Inbox().click();
    }

    @Then("^click on search button to search the record of Ownership Details$")
    public void click_on_search_button_to_search_the_record_of_ownership_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, ownershipDetailsObj.ownershipDetails_SearchInbox());
    	ownershipDetailsObj.ownershipDetails_SearchInbox().click();
    }

    @Then("^enter the reference id of the Ownership Details record$")
    public void enter_the_reference_id_of_the_ownership_details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, ownershipDetailsObj.ownershipDetails_SearchInboxInputField());
    	ownershipDetailsObj.ownershipDetails_SearchInboxInputField().sendKeys(testData.get("Stage Code"));
	
    }

    @Then("^click on the entitle button of the Ownership Details record of that reference id$")
    public void click_on_the_entitle_button_of_the_ownership_details_record_of_that_reference_id() throws Throwable {
    	String beforexpath= "//span[contains(text(),'";
		String afterxpath= "')]/../../td/button";
		while(true) {
			try {
				driver.findElement(By.xpath(beforexpath + testData.get("Application id") + afterxpath)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    }

    @Then("^verify the availability of Ownership layout in system$")
    public void verify_the_availability_of_ownership_layout_in_system() throws Throwable {
    	while(true) {
    		try {
    			waithelper.waitForElementToVisibleWithFluentWait(driver, ownershipDetailsObj.ownershipDetails_OwnershipDetailTab(), 1,1);
    			boolean isAvailable = ownershipDetailsObj.ownershipDetails_OwnershipDetailTab().isDisplayed();
    			Assert.assertTrue("Ownership layout tab is not available",isAvailable);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				ownershipDetailsObj.ownershipDetails_NextButton().click();
			}
    	}
    }
    
    @Then("^verify ownership layout screen should get open with all valid fields in proper format with back and save button$")
    public void verify_ownership_layout_screen_should_get_open_with_all_valid_fields_in_proper_format_with_back_and_save_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, ownershipDetailsObj.ownershipDetails_OwnershipDetailTab());
		ownershipDetailsObj.ownershipDetails_OwnershipDetailTab().click();
    	waithelper.waitForElementwithFluentwait(driver, ownershipDetailsObj.ownershipDetails_OwnerOrPowerOfAttorney());
    	boolean status = ownershipDetailsObj.ownershipDetails_OwnerOrPowerOfAttorney().getAttribute("ng-reflect-interface").equalsIgnoreCase("popover");
    	Assert.assertTrue(status);
    	boolean status1 = ownershipDetailsObj.ownershipDetails_Name().getAttribute("type").equalsIgnoreCase("text");
    	Assert.assertTrue(status1);
    	boolean status2 = ownershipDetailsObj.ownershipDetails_IdType().getAttribute("ng-reflect-interface").equalsIgnoreCase("popover");
    	Assert.assertTrue(status2);
    	boolean status3 = ownershipDetailsObj.ownershipDetails_IdNumber().getAttribute("type").equalsIgnoreCase("text");
    	Assert.assertTrue(status3);
    	boolean status4 = ownershipDetailsObj.ownershipDetails_IssueDate().getAttribute("ng-reflect-view").equalsIgnoreCase("date");
    	Assert.assertTrue(status4);
    	boolean status5 = ownershipDetailsObj.ownershipDetails_IssuePlace().getAttribute("type").equalsIgnoreCase("text");
    	Assert.assertTrue(status5);
    	boolean status6 = ownershipDetailsObj.ownershipDetails_City().getAttribute("ng-reflect-interface").equalsIgnoreCase("popover");
    	Assert.assertTrue(status6);
    	boolean status7 = ownershipDetailsObj.ownershipDetails_Mobile().getAttribute("ng-reflect-type").equalsIgnoreCase("number");
    	Assert.assertTrue(status7);
    	boolean status8 = ownershipDetailsObj.ownershipDetails_Mobile2().getAttribute("ng-reflect-type").equalsIgnoreCase("number");
    	Assert.assertTrue(status8);
    	boolean status9 = ownershipDetailsObj.ownershipDetails_Phone().getAttribute("ng-reflect-type").equalsIgnoreCase("number");
    	Assert.assertTrue(status9);
    	boolean status10 = ownershipDetailsObj.ownershipDetails_Fax().getAttribute("type").equalsIgnoreCase("text");
    	Assert.assertTrue(status10);
    	boolean status11 = ownershipDetailsObj.ownershipDetails_Email().getAttribute("type").equalsIgnoreCase("text");
    	Assert.assertTrue(status11);
    	boolean status13 = ownershipDetailsObj.ownershipDetails_SaveButton().isDisplayed();
    	Assert.assertTrue(status13);
    	boolean status14 = ownershipDetailsObj.ownershipDetails_BackButton().isDisplayed();
    	Assert.assertTrue(status14);
    	
    }

    @Then("^verify the functionality of back button in ownership details screen$")
    public void verify_the_functionality_of_back_button_in_ownership_details_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, ownershipDetailsObj.ownershipDetails_BackButton());
    	ownershipDetailsObj.ownershipDetails_BackButton().click();
    	waithelper.waitForElementwithFluentwait(driver, ownershipDetailsObj.ownershipDetails_InboxScreen());
    	boolean status = ownershipDetailsObj.ownershipDetails_InboxScreen().isDisplayed();
    	Assert.assertTrue(status);
    	
    }
    
    @Then("^select data set ID for Collateral Layout Ownership Layout testcase001$")
    public void select_data_set_id_for_collateral_layout_ownership_layout_testcase001() throws Throwable {
    	dataSetID = "AT_CLOL_001_D1";
        testData = excelData.getTestdata(dataSetID);
    }
    
    
}