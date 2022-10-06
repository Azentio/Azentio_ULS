package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.Transactions_ScreenOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.TransactionScreenTestDataType;

public class KULS_M_OfferDecision extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	TransactionScreenTestDataType Transactionjson = jsonConfig.getTransactionScreenListByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Transactions_ScreenOBJ Transaction = new Transactions_ScreenOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	
	@And("^User search the record from the system in Offer Decision$")
    public void user_search_the_record_from_the_system_in_offer_decision() throws Throwable {
        
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchiconreferenceid(), 60, 5);
    	Transaction.searchiconreferenceid().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchsentkeys(), 60, 5);
    	Transaction.searchsentkeys().sendKeys(Transactionjson.OfferDecision_Search);
		
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

    @And("^User verify the case moved to the next level in Offer Decision$")
    public void user_verify_the_case_moved_to_the_next_level_in_offer_decision() throws Throwable {
    	
    	Assert.assertEquals("OFFERING", Transaction.makerconfirmmsg().getText());
        
    }


}
