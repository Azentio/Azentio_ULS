package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class ULS_OfferDecision extends BaseClass{

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	
	

    @Given("^user Navigate uls application $")
    public void user_navigate_uls_application() throws Throwable {
        
    }
    
    @And("^user search for L1App record$")
    public void user_search_for_l1app_record() throws Throwable {
        
    }

    @And("^user select the L1App first record$")
    public void user_select_the_l1app_first_record() throws Throwable {
        
    }

    @And("^user click on offer decision tab$")
    public void user_click_on_offer_decision_tab() throws Throwable {
        
    }

    @And("^user verify the offer decision Tab should br there or Not$")
    public void user_verify_the_offer_decision_tab_should_br_there_or_not() throws Throwable {
        
    }

    @And("^user verify the deviate field$")
    public void user_verify_the_deviate_field() throws Throwable {
        
    }

    @And("^user verify the Recompute field$")
    public void user_verify_the_recompute_field() throws Throwable {
        
    }

    @And("^user verify the Decision button functionality$")
    public void user_verify_the_decision_button_functionality() throws Throwable {
        
    }
	
	
	
	
	
	
	
	
	
}
