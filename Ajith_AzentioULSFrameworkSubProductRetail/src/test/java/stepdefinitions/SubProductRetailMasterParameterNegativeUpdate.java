package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.SubProduct_Master_RetailOBJ;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.SubProductRetailParameterNegativeTestDataType;
import testDataType.SubProductRetailParameterTestDataType;

public class SubProductRetailMasterParameterNegativeUpdate extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	SubProduct_Master_RetailOBJ subretail = new SubProduct_Master_RetailOBJ(driver);
	WaitHelper help = new WaitHelper(driver);
	//KULS_Login login = new KULS_Login();
	FindFieldisMandatoryorNot morn = new FindFieldisMandatoryorNot(driver);

	SubProductRetailParameterNegativeTestDataType paradata1 = jsonConfig.getSubParameterNegativeListByName("Maker");

	SubProduct_Master_RetailOBJ parameter = new SubProduct_Master_RetailOBJ(driver);
	JsonDataReaderWriter jsonRW = new JsonDataReaderWriter();

	
//	@Then("^Get the validation message in maker$")
//    public void get_the_validation_message() throws Throwable {
//		
//		WebElement nameErrorMessage = driver
//				.findElement(By.xpath("//digital-form-error//ion-badge"));
//		String expectedErrorText = "Required field";
//		String actualErrorText = nameErrorMessage.getText();
//		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
//			System.out.println(
//					"The actual and expected result are same.The Popup validation message is" + actualErrorText);
//		} else {
//			System.out.println(
//					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
//		}
//        
//    }
//
//    @And("^Click the parameter$")
//    public void click_the_parameter() throws Throwable {
//    	
//    	help.waitForElementToVisibleWithFluentWait(driver, subretail.pencil(), 60, 5);
//		subretail.pencil().click();
//    	
//    	help.waitForElementToVisibleWithFluentWait(driver, subretail.parameter(), 60, 5);
//		subretail.parameter().click();
//    	
//        
//    }
//
//    @And("^Update the parameter fields in maker$")
//    public void update_the_parameter_fields_in_maker() throws Throwable {
//    	
//    	help.waitForElementToVisibleWithFluentWait(driver, subretail.loanCurrencyUpdate(), 60, 5);
//    	parameter.loanCurrencyUpdate().click();
//    	
//    	for (int i = 0; i < 50; i++) {
//			try {
//				driver.findElement(By.xpath(
//						"//ion-label[contains(text(),'" + paradata1.LoanCurrency + "')]//following-sibling::ion-radio"))
//						.click();
//
//				break;
//
//			} catch (Exception e) {
//
//			}
//		}
//    	
//    	//help.waitForElementToVisibleWithFluentWait(driver, subretail.minTenorInMonths(), 60, 5);
//    	for(int i=0; i<20; i++) {
//    		try {
//    			parameter.minTenorInMonths().click();
//    	    	parameter.minTenorInMonths().sendKeys(paradata1.MinTenorInMonths);
//			} catch (Exception e) {
//				
//			}
//    	}
//    	
//    	
//    	System.out.println(parameter.errmsg().getText());
//    	
//    	
//    	
//        
//    }
//
//    @And("^Click the save icon$")
//    public void click_the_save_icon() throws Throwable {
//    	
//    	help.waitForElementToVisibleWithFluentWait(driver, subretail.Save(), 60, 5);
//    	parameter.Save().click();
//        
//    }

}
