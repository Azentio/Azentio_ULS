package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.Asset_CD_MasterOBJ;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.Asset_CD_MasterTestDataType;
import testDataType.KULS_Login_TestDataType;

public class Underwritter_Offset_ControlStep {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Checker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Asset_CD_MasterOBJ assetcd = new Asset_CD_MasterOBJ(driver);
	FindFieldisMandatoryorNot mandatoryornot = new FindFieldisMandatoryorNot(driver);
	Asset_CD_MasterTestDataType assetjson = jsonConfig.getAssetCDMasterListByName("Maker");
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	
	@Given("^User login as uls checker in underwritterOffsetControl$")
    public void user_login_as_uls_checker_in_asset_cd_master() throws Throwable {
		
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
        driver.get(kulsApplicationUrl);
        System.out.println(json.readdata());
        applicationLogin.ulSApplicationLoginAsAChecker(json.readdata());
		
        
    }
	@And("^User click the inboxicon in underwritterOffsetControl$")
    public void user_click_the_inboxicon_in_asset_cd_master_checker() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.inboxiconChecker(), 60, 2);
		assetcd.inboxiconChecker().click();
        
    }
	 @And("^User click the search icon in underwritterOffsetControl and get the reference id$")
	    public void user_click_the_search_icon_in_asset_cd_master() throws Throwable {
	    	
	    	for (int i = 0; i < 20; i++) {
				try {
					assetcd.searchiconreferenceid().click();
					assetcd.searchsentkeys().sendKeys(assetjson.searchiconreferenceid);
					break;
					
				} catch (Exception e) {

				}
			}
	 }
	 @And("^User search the respective reference id and click on Action button in underwritterOffsetControl$")
	    public void user_search_the_respective_reference_id_and_click_on_action_button_in_asset_cd_master() throws Throwable {
	    	
	    	for (int i = 0; i <40; i++) {
	            
		    	try {
		           
		    		driver.findElement(By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button"))
		            .click();
		            break;
	              
		    	}
	         
		    	catch (Exception e) {
		    		
		    	}
		    		
		    }

	        
	    }
	 @And("^User click the reject icon in underwritterOffsetControl checker$")
	 public void User_click_the_reject_icon_in_asset_CD_master_checker() throws Throwable {
	 	
	 	help.waitForElementToVisibleWithFluentWait(driver, assetcd.CheckerReject(), 60, 2);
	 	assetcd.CheckerReject().click();
	     
	 }

	 @And("^User enter the reject remark in underwritterOffsetControl checker$")
	 public void User_enter_the_reject_remark_in_asset_CD_master_checker$() throws Throwable {
	 	
	 	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 2);
	 	assetcd.popupremark().click();
	 	assetcd.popupremark().sendKeys("Reject");
	 	
	     
	 }

	 @And("^User click the final reject icon in underwritterOffsetControl checker$")
	 public void User_click_the_final_reject_icon_in_asset_CD_master_checker() throws Throwable {
	 	
	 	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupreject(), 60, 2);
	 	assetcd.popupreject().click();
	 	
	 	
	     
	 }

	 @Then("^User verify the Record got Rejected in underwritterOffsetControl checker$")
	 public void user_verify_the_record_got_Rejected() throws Throwable {
	 	
	    help.waitForElementToVisibleWithFluentWait(driver, assetcd.recordMsgChecker(), 60, 2);
	 	   String Toast;
	 	   Toast = assetcd.recordMsgChecker().getText();
	 	   System.out.println(Toast);
	 	   Assert.assertEquals(Toast, "Record REJECTED Successfully");
	 }

	 @And("^User verify the rejected record removed from the system in underwritterOffsetControl$")
	 public void user_verify_the_rejected_record_removed_from_the_system() throws Throwable {
	    
	 	for (int i = 0; i <20; i++) {
	         try {
	         	assetcd.searchiconreferenceid().click();
	             break;
	         } catch (Exception e) {

	         }
	     }

	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetcd.searchsentkeys(),60,2);
	         
	         assetcd.searchsentkeys().sendKeys(json.readReferancedata());
	         
	         String xpath ="//td[contains(text(),' ASSET_CD_MST ')]/preceding-sibling::td[1]/span[contains(text(),'"+json.readReferancedata()+"')]";
	         for (int i = 0; i < 200; i++) {
	             try {
	                 Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
	                 break;
	             } catch (NoSuchElementException e) {

	             }
	         }

	 }
	 @And("^User click the return icon in underwritterOffsetControl checker$")
	 public void user_click_on_return_icon() throws Throwable {
	 	
	 	help.waitForElementToVisibleWithFluentWait(driver, assetcd.CheckerReturn(), 60, 2);
	 	assetcd.CheckerReturn().click();
	     
	 }

	 @And("^User enter the return remark in underwritterOffsetControl checker$")
	 public void user_enter_the_remark_for_return_the_record() throws Throwable {
	 	
	 	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 2);
	 	assetcd.popupremark().click();
	 	assetcd.popupremark().sendKeys("Return");
	 	
	     
	 }

	 @And("^User click the final return icon in underwritterOffsetControl checker$")
	 public void user_click_the_final_return_button() throws Throwable {
	 	
	 	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupReturn(), 60, 2);
	 	assetcd.popupReturn().click();
	 	
	 	
	     
	 }
	 @And("^User verify the returned record removed from the system in underwritterOffsetControl$")
	 public void user_verify_the_returned_record_removed_from_the_system() throws Throwable {
	     
	 	for (int i = 0; i <20; i++) {
	         try {
	         	assetcd.searchiconreferenceid().click();
	             break;
	         } catch (Exception e) {

	         }
	     }

	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetcd.searchsentkeys(),60,2);
	         
	         assetcd.searchsentkeys().sendKeys(json.readReferancedata());
	         String xpath ="//td[contains(text(),' ASSET_CD_MST ')]/preceding-sibling::td[1]/span[contains(text(),'"+json.readReferancedata()+"')]";
	         for (int i = 0; i < 200; i++) {
	             try {
	                 Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
	                 break;
	             } catch (NoSuchElementException e) {

	             }
	         }
	 }
	 @Then("^User verify the Record got Returned in underwritterOffsetControl checker$")
	 public void user_verify_the_record_got_Returned() throws Throwable {
	 	
	    help.waitForElementToVisibleWithFluentWait(driver, assetcd.recordMsgChecker(), 60, 2);
	 	   String Toast;
	 	   Toast = assetcd.recordMsgChecker().getText();
	 	   System.out.println(Toast);
	 	   Assert.assertEquals(Toast, "Record RETURNED Successfully, and Current Stage is MAKER with status PENDING from in00135.");
	 }



	 


}
