package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.WaitHelper;
import pageobjects.KULS_LoginObj;
import resources.ExcelData;
import testDataType.KULS_Login_TestDataType;

public class KULS_Application_Login {
	public WebDriver driver;
	WaitHelper waithelper;
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper;

	public KULS_Application_Login(WebDriver driver) {
		this.driver = driver;
	}

	JsonConfig jsonConfig = new JsonConfig();
	KULS_Login_TestDataType ulsUserLoginCredentials;
	ConfigFileReader configFileReader = new ConfigFileReader();

	ExcelData excelData = new ExcelData("C:\\Users\\inindc00074\\Downloads\\TestDataDesignSampleNew2211.xlsx","LoginCredentilas","Stage");
	Map<String, String> testdata;
	public void loginUlsApplicationAsMaker(String username, String password) throws InterruptedException {
		waithelper = new WaitHelper(driver);
		loginObj = new KULS_LoginObj(driver);
		javaScriptHelper = new JavascriptHelper(driver);
		waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.userId(), 60, 5);
		loginObj.userId().click();
		loginObj.userId().sendKeys(username);
		waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.continueButton(), 60, 5);
		loginObj.continueButton().click();
		waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.password(), 60, 2);
		loginObj.password().click();
		loginObj.password().sendKeys(password);
		waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.signIn(), 60, 5);
		loginObj.signIn().click();
		while(true) {
            try {
                waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.loginPage(), 3, 2);
                assertEquals(loginObj.loginPage().isDisplayed(), true);
                break;
            } 
            catch (Exception e) {
            	String kulsApplicationUrl = configFileReader.getApplicationcenbankUrl();
                driver.get(kulsApplicationUrl);
                waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.userId(), 60, 5);
                loginObj.userId().click();
                loginObj.userId().sendKeys(username);
                waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.continueButton(), 60, 5);
                loginObj.continueButton().click();
                waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.password(), 60, 2);
                loginObj.password().click();
                loginObj.password().sendKeys(password);
                Thread.sleep(1000);
                waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.signIn(), 60, 5);
                loginObj.signIn().click();
            }
		}
		waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menuIconInHomePage(), 60, 2);
		loginObj.menuIconInHomePage().click();
		waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
		assertEquals(loginObj.configuration().isDisplayed(), true);
            }
		
	

	public void ulSApplicationLoginAsAChecker(String userID) {
		waithelper = new WaitHelper(driver);
		loginObj = new KULS_LoginObj(driver);
		javaScriptHelper = new JavascriptHelper(driver);
		ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
		switch (userID) {
		case "in01951":
			testdata = excelData.getTestdata("Checker1");
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.userId(), 60, 5);
			loginObj.userId().click();
			loginObj.userId().sendKeys(testdata.get("Username"));
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.continueButton(), 60, 5);
			loginObj.continueButton().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.password(), 60, 2);
			loginObj.password().click();
			loginObj.password().sendKeys(testdata.get("Password"));
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.signIn(), 60, 5);
			loginObj.signIn().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menuIconInHomePage(), 60, 2);
			loginObj.menuIconInHomePage().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			break;
		case "in01589":
			testdata = excelData.getTestdata("Checker2");
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.userId(), 60, 5);
			loginObj.userId().click();
			loginObj.userId().sendKeys(testdata.get("Username"));
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.continueButton(), 60, 5);
			loginObj.continueButton().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.password(), 60, 2);
			loginObj.password().click();
			loginObj.password().sendKeys(testdata.get("Password"));
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.signIn(), 60, 5);
			loginObj.signIn().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menuIconInHomePage(), 60, 2);
			loginObj.menuIconInHomePage().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			break;
		}

	}
}
