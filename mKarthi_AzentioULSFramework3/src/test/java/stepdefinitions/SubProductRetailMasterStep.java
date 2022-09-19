package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.SubProduct_Master_RetailOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class SubProductRetailMasterStep extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Checker"); 
	JsonDataReaderWriter jsonRW = new JsonDataReaderWriter();
	
	SubProduct_Master_RetailOBJ subretail = new SubProduct_Master_RetailOBJ(driver);
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	
	@Given("^Checker login for subproductretail master$")
    public void checker_login_for_sub_product_master() throws Throwable {

        String kulsApplicationUrl = configFileReader.getApplicationUrl();
        driver.get(kulsApplicationUrl);
        System.out.println(jsonRW.readdata());
        applicationLogin.ulSApplicationLoginAsAChecker(jsonRW.readdata());
    
        
    }

    @Then("^Click the menu icon in checker$")
    public void click_the_menu_icon_in_checker() throws Throwable {
    	help.waitForElementToVisibleWithFluentWait(driver, subretail.menuChecker(), 60, 5);
    	subretail.menuChecker().click();
    	
        
    }

    @Then("^Reject the sub product retail master in checker$")
    public void reject_the_sub_product_retail_master_in_checker() throws Throwable {
    	help.waitForElementToVisibleWithFluentWait(driver, subretail.rejectChecker(), 60, 5);
    	subretail.rejectChecker().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, subretail.cancelMsgChecker(), 60, 5);
    	subretail.cancelMsgChecker().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, subretail.rejectMsgChecker(), 60, 5);
    	subretail.rejectMsgChecker().click();
        
    }

    @Then("^Reject confirmation$")
    public void reject_confirmation() throws Throwable {
    	help.waitForElementToVisibleWithFluentWait(driver, subretail.recordMsgChecker(), 60, 5);
    	System.out.println(subretail.recordMsgChecker().getText());
    	
        
    }

    @And("^Click the inbox icon in checker$")
    public void click_the_inbox_icon_in_checker() throws Throwable {
    	help.waitForElementToVisibleWithFluentWait(driver, subretail.inboxiconChecker(), 60, 5);
    	subretail.inboxiconChecker().click();
        
    }

    @And("^Click the action edit icon using reference id in checker$")
    public void click_the_action_edit_icon_using_reference_id_in_checker() throws Throwable {
    	 
    	String xpath1 ="//span[contains(text(),'"+jsonRW.readReferancedata()+"')]//parent::td//preceding-sibling::td//child::button";
    	
    	WebElement actionedit = driver.findElement(By.xpath(xpath1));
    	actionedit.click();
    }

}


