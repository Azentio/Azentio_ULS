package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.Transactions_ScreenOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class KULS_M_OfferDecision extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Transactions_ScreenOBJ Transaction = new Transactions_ScreenOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","OfferDecisionTestData","Data Set ID");
	Map<String, String> testData;
	String dataSetID;
	
	@And("^User search the record from the system in Offer Decision$")
    public void user_search_the_record_from_the_system_in_offer_decision() throws Throwable {
        
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchiconreferenceid(), 60, 5);
    	Transaction.searchiconreferenceid().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchsentkeys(), 60, 5);
    	Transaction.searchsentkeys().sendKeys(testData.get("Stage Code"));
		
    }

    @And("^User click the Application details Tab in Offer Decision$")
    public void user_click_the_application_details_tab_in_offer_decision() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetailsTab(), 60, 5);
    	Transaction.ApplicationDetailsTab().click();
        
    }

    @And("^User click the approve button in Offer Decision$")
    public void user_click_the_approve_button_in_offer_decision() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApprovalButton(), 60, 5);
    	Transaction.ApprovalButton().click();
        
    }

    @And("^User enter the popup remark in Offer Decision$")
    public void user_enter_the_popup_remark_in_offer_decision() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.Popup_ApproveMsg(), 60, 5);
    	Transaction.Popup_ApproveMsg().click();
        
    }

    @And("^User click the final approve button Offer Decision$")
    public void user_click_the_final_approve_button_offer_decision() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FinalApproveButton(), 60, 5);
    	Transaction.FinalApproveButton().click();
        
    }
    
    @And("^User get the save confirmation messege in offer decision$")
    public void user_get_the_save_confirmation_messege_in_offer_decision() throws Throwable {
    	
    	for (int i = 0; i < 20; i++) {
			try {
				
				System.out.println(Transaction.makerconfirmmsg().getText());
				break;
			} catch (NoSuchElementException e) {

			}
		}
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.successcancel(), 60, 5);
    	Transaction.successcancel().click();

        
    }

    @And("^User verify the case moved to the next level in Offer Decision$")
    public void user_verify_the_case_moved_to_the_next_level_in_offer_decision() throws Throwable {
    	
    	Assert.assertEquals("OFFERING", Transaction.makerconfirmmsg().getText());
        
    }
    
    @Then("^select data set ID for Offer Decision testcase006$")
    public void select_data_set_id_for_offer_decision_testcase006() throws Throwable {
    	dataSetID = "AT_OD_006_D1";
        testData = excelData.getTestdata(dataSetID);
    }


}
