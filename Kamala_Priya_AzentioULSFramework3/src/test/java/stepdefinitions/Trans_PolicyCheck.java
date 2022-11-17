package stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.Trans_PolicyCheckObject;
import resources.BaseClass;
import testDataType.KULS_Login_TestDataType;

public class Trans_PolicyCheck {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper waithelper = new WaitHelper(driver);
	List<String> xlsList = new ArrayList<>();
	Trans_PolicyCheckObject policycheckobj=new Trans_PolicyCheckObject(driver);
	
	
	@Then("^click the inbox in application$")
    public void click_the_inbox_in_application() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_Inbox(), 60, 2);
		policycheckobj.PolicyCheck_Inbox().click();
    }

    @And("^Search for app data entry record$")
    public void search_for_app_data_entry_record() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_SearchButton(), 60, 2);
		policycheckobj.PolicyCheck_SearchButton().click();
		waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_SearchText(), 60, 2);
		policycheckobj.PolicyCheck_SearchText().click();
		policycheckobj.PolicyCheck_SearchText().sendKeys("406");
    }
    
    @Then("^Click the action icon of the app data entry$")
    public void click_the_action_icon_of_the_app_data_entry() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_ActionIcon(), 60, 2);
		policycheckobj.PolicyCheck_ActionIcon().click();
    }

    @And("^click the policy check tab in application details$")
    public void click_the_policy_check_tab_in_application_details() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_PolicycheckTab(), 60, 2);
		policycheckobj.PolicyCheck_PolicycheckTab().click();
    }

    @Then("^check the field Policy Check Summary screen and Credit Policy  screen is viewed in policy check$")
    public void check_the_field_policy_check_summary_screen_and_credit_policy_screen_is_viewed_in_policy_check() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_PolicycheckSummary(), 60, 2);
		policycheckobj.PolicyCheck_PolicycheckSummary().isDisplayed();
		waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_CreditPolicy(), 60, 2);
		policycheckobj.PolicyCheck_CreditPolicy().isDisplayed();
    }

    @And("^verify Policy Check Summary screen open with Execution Leve$")
    public void verify_policy_check_summary_screen_open_with_execution_leve() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheckSummary_ExecutionLeval(), 60, 2);
		policycheckobj.PolicyCheckSummary_ExecutionLeval().isDisplayed();
    }

    @And("^verify Policy Check Summary screen open with Execution Policy Status$")
    public void verify_policy_check_summary_screen_open_with_execution_policy_status() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheckSummary_ExecutionLeval(), 60, 2);
		policycheckobj.PolicyCheckSummary_ExecutionLeval().isDisplayed();
    }

    @And("^verify Policy Check Summary screen open with Execution Approval Level$")
    public void verify_policy_check_summary_screen_open_with_execution_approval_level() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheckSummary_ApprovalLeval(), 60, 2);
		policycheckobj.PolicyCheckSummary_ApprovalLeval().isDisplayed();
    }

    @And("^verify Policy Check Summary screen open with Execution Count$")
    public void verify_policy_check_summary_screen_open_with_execution_count() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheckSummary_Count(), 60, 2);
		policycheckobj.PolicyCheckSummary_Count().isDisplayed();
    }
    @Then("^verify Credit Policy  screen get open with Result ID$")
    public void verify_credit_policy_screen_get_open_with_result_id() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.CreditPolicy_ResultID(), 60, 2);
		policycheckobj.CreditPolicy_ResultID().isDisplayed();
    }

    @Then("^verify Credit Policy  screen get open with Policy Execution Level$")
    public void verify_credit_policy_screen_get_open_with_policy_execution_level() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.CreditPolicy_ExecutionLevel(), 60, 2);
		policycheckobj.CreditPolicy_ExecutionLevel().isDisplayed();
    }

    @Then("^verify Credit Policy  screen get open with Policy Level$")
    public void verify_credit_policy_screen_get_open_with_policy_level() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.CreditPolicy_PolicyLevel(), 60, 2);
		policycheckobj.CreditPolicy_PolicyLevel().isDisplayed();
    }

    @Then("^verify Credit Policy  screen get open with Customer Name$")
    public void verify_credit_policy_screen_get_open_with_customer_name() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.CreditPolicy_CustomerName(), 60, 2);
		policycheckobj.CreditPolicy_CustomerName().isDisplayed();
    }

    @Then("^verify Credit Policy  screen get open with Customer Type$")
    public void verify_credit_policy_screen_get_open_with_customer_type() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.CreditPolicy_CustomerType(), 60, 2);
		policycheckobj.CreditPolicy_CustomerType().isDisplayed();
		
    }

    //@Then("^verify Credit Policy  screen get open with Facility ID$")
   // public void verify_credit_policy_screen_get_open_with_facility_id() throws Throwable {
    	//waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_Inbox(), 60, 2);
		//policycheckobj.
   // }

//    @Then("^verify Credit Policy  screen get open with Product$")
//    public void verify_credit_policy_screen_get_open_with_product() throws Throwable {
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_Inbox(), 60, 2);
//		policycheckobj
//    }

//    @Then("^verify Credit Policy  screen get open with Sub Product$")
//    public void verify_credit_policy_screen_get_open_with_sub_product() throws Throwable {
//    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_Inbox(), 60, 2);
//		policycheckobj
//    }

    @Then("^verify Credit Policy  screen get open with Approval Level$")
    public void verify_credit_policy_screen_get_open_with_approval_level() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.CreditPolicy_ApprovalLeval(), 60, 2);
		policycheckobj.CreditPolicy_ApprovalLeval().isDisplayed();
    }

    @Then("^verify Credit Policy  screen get open with Approved By$")
    public void verify_credit_policy_screen_get_open_with_approved_by() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.CreditPolicy_ApprovedBy(), 60, 2);
		policycheckobj.CreditPolicy_ApprovedBy().isDisplayed();
    }

    @Then("^verify Credit Policy  screen get open with Approval Type$")
    public void verify_credit_policy_screen_get_open_with_approval_type() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.CreditPolicy_ApprovalType(), 60, 2);
		policycheckobj.CreditPolicy_ApprovalType().isDisplayed();
    }
    @And("^verify the functionality of Search box with matching data in policy check$")
    public void verify_the_functionality_of_search_box_with_matching_data_in_policy_check() throws Throwable {
    	//waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.PolicyCheck_Inbox(), 60, 2);
    	for (int i = 0; i < 20; i++) {
    		try {
    			policycheckobj.SearchButton2().click();
    			break;
    		} catch (Exception e) {

    		}
    	}

    	policycheckobj.Searchtext2().click();
    	policycheckobj.Searchtext2().sendKeys("New Azentio");
    	policycheckobj.MatchedData().getText();
    	Assert.assertEquals(policycheckobj.MatchedData().isDisplayed(), true);
    }
    
    @Then("^verify the functionality of Search box with mismatch data in policy check$")
    public void verify_the_functionality_of_search_box_with_mismatch_data_in_policy_check() throws Throwable {
    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

    	for (int i = 0; i < 20; i++) {
    		try {
    			policycheckobj.SearchButton2().click();
    			break;
    		} catch (Exception e) {

    		}
    	}
    	policycheckobj.Searchtext2().click();
    	policycheckobj.Searchtext2().sendKeys("###");
    	Thread.sleep(1000);
    	String xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]";
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
    					driver.findElement(By.xpath(xpath)), 60, 2);
    			Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
    			// "Showing 0 to 0 of 0 entries"
    			break;
    		} catch (Exception e) {

    		}
    	}

    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    }
    

    @And("^verify the functionality of Export to PDF button in policy check$")
    public void verify_the_functionality_of_export_to_pdf_button_in_policy_check() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			policycheckobj.exportIcon().click();
    			break;
    		} catch (Exception e) {

    		}
    	}

    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, policycheckobj.exportToPDF(), 60, 3);
    	policycheckobj.exportToPDF().click();
    	// seleniumactions.getBrowserHelper().SwitchToWindow(1);
    	String UserDirectory = System.getProperty("user.dir");
    	System.out.println(UserDirectory);
    	String substring = UserDirectory.substring(0, 21) + "Downloads";
    	substring.replaceAll("/", "//");
    	System.out.println(substring);
    	File file = new File(substring);
    	File[] totalfiles = file.listFiles();
    	int length = totalfiles.length;
    	int i = 0;
    	for (File fileName : totalfiles) {
    		if (fileName.getName().equalsIgnoreCase("PolicyCheckFormDataFile.pdf")) {
    			System.out.println("Downloaded file present in system");
    			break;
    		} else if (i == length - 1) {
    			System.out.println("Downloaded file present does not exist in system");
    		}

    	}
    	seleniumactions.getBrowserHelper().switchToParentWithChildClose();
    }
    
    @Then("^verify the functionality of Export to Excel button in policy check$")
    public void verify_the_functionality_of_export_to_excel_button_in_policy_check() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			policycheckobj.exportIcon().click();
    			break;
    		} catch (Exception e) {

    		}
    	}
    	seleniumactions.getClickAndActionsHelper().moveToElement(policycheckobj.exportToExcel());
    	policycheckobj.exportToExcel().click();
    Thread.sleep(2000);
    	
    	
    	String UserDirectory = System.getProperty("user.dir");
        //System.out.println(UserDirectory);
        String substring = UserDirectory.substring(0, 21) + "Downloads";
        substring.replaceAll("/", "//");
        System.out.println(substring);
        File file = new File(substring);
        File[] totalfiles = file.listFiles();
        for (File fileName : totalfiles) {
            System.out.println("File name" + fileName);
            xlsList.add(fileName.toString());
        }
    }
    @Then("^verify Credit Policy  screen get open with Result$")
    public void verify_credit_policy_screen_get_open_with_result() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, policycheckobj.CreditPolicy_Result(), 60, 2);
    	policycheckobj.CreditPolicy_Result().isDisplayed();
    }

  





}
