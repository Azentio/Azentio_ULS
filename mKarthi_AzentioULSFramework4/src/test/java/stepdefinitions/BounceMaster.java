package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.BounceMasterOBJ;
import pageobjects.Transactions_ScreenOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.BounceMasterTestDataType;
import testDataType.KULS_Login_TestDataType;
import testDataType.TransactionScreenTestDataType;

public class BounceMaster extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	BounceMasterTestDataType Bouncejson = jsonConfig.getBounceMasterListByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	BounceMasterOBJ Bounce = new BounceMasterOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	
	@Given("^User login as uls maker new$")
    public void user_login_as_uls_maker_new() throws Throwable {
        
		String kulsApplicationUrl = configFileReader.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		applicationLogin.loginUlsApplicationAsMaker(loginData.Username, loginData.Password);
		
    }

	
	@And("^User click the config manager in Bounce master$")
    public void user_click_the_config_manager_in_bounce_master() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, Bounce.ConfigManager(), 60, 5);
		Bounce.ConfigManager().click();
        
    }

    @And("^User click the Bounce master edit icon$")
    public void user_click_the_bounce_master_edit_icon() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Bounce.BounceMasterEdit(), 60, 5);
		Bounce.BounceMasterEdit().click();
        
    }

    @And("^User click the Action edit icon in Bounce master$")
    public void user_click_the_action_edit_icon_in_bounce_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Bounce.ActionEditIcon(), 60, 5);
		Bounce.ActionEditIcon().click();
        
    }

    @And("^User Enter the Charge applicable in Bounce master$")
    public void user_enter_the_charge_applicable_in_bounce_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Bounce.ChargeApplicable(), 60, 5);
		Bounce.ChargeApplicable().click();
		
		String xpath = "//ion-label[contains(text(),'" + Bouncejson.ChargeApplicable + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
        
    }

    @And("^User click the save icon in Bounce master$")
    public void user_click_the_save_icon_in_bounce_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Bounce.UpdateSave(), 60, 5);
		Bounce.UpdateSave().click();
        
    }

    @And("^User verify while modification system enters the invalid data in Bounce master$")
    public void user_verify_while_modification_system_enters_the_invalid_data_in_bounce_master() throws Throwable {
        
      	help.waitForElementToVisibleWithFluentWait(driver, Bounce.RequiredField(), 60, 5);
   	    Assert.assertEquals("Required field",
   	    		Bounce.RequiredField().getText());
    	System.out.println(Bounce.RequiredField().getText());
    	
    }

    @And("^User Select the Charge applicable in Bounce master$")
    public void user_select_the_charge_applicable_in_bounce_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Bounce.ChargeApplicable(), 60, 5);
		Bounce.ChargeApplicable().click();
		
		String xpath = "//ion-label[contains(text(),'" + Bouncejson.ChargeApplicable1 + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
        
        
    }

    @And("^User clear the Bounce Code in Bounce master$")
    public void user_clear_the_bounce_code_in_bounce_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Bounce.BounceCode(), 60, 5);
		Bounce.BounceCode().click();
		for(int i=0; i<20; i++) {
			Bounce.BounceCode().sendKeys(Keys.BACK_SPACE);
		}
		

        
    }

    @And("^User verify while modification, when user keep any mandatory field blank$")
    public void user_verify_while_modification_when_user_keep_any_mandatory_field_blank() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, Bounce.RequiredField(), 60, 5);
   	    Assert.assertEquals("Required field",
   	    		Bounce.RequiredField().getText());
    	System.out.println(Bounce.RequiredField().getText());
    	
    	
    }


}
