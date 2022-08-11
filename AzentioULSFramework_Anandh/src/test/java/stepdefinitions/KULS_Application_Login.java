package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.WaitHelper;
import pageobjects.KULS_LoginObj;
import testDataType.KULS_Login_TestDataType;

public class KULS_Application_Login {
	public static WebDriver driver;
	WaitHelper waithelper;
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper;
	ConfigFileReader configFileReader = new ConfigFileReader();

	public KULS_Application_Login(WebDriver driver) {
		this.driver = driver;
	}

	JsonConfig jsonConfig = new JsonConfig();
	KULS_Login_TestDataType ulsUserLoginCredentials;

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
		while (true) {
			try {
				waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 30, 2);
				assertEquals(loginObj.configuration().isDisplayed(), true);
				break;
			} catch (Exception e) {
				String kulsApplicationUrl = configFileReader.getApplicationUrl();
				driver.get(kulsApplicationUrl);
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
			}
		}
	}

	public void ulSApplicationLoginAsAChecker(String userID) {
		waithelper = new WaitHelper(driver);
		loginObj = new KULS_LoginObj(driver);
		javaScriptHelper = new JavascriptHelper(driver);
		ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
		switch (userID) {
		case "in01951":
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.userId(), 60, 5);
			loginObj.userId().click();
			loginObj.userId().sendKeys(ulsUserLoginCredentials.CheckerUserName1);
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.continueButton(), 60, 5);
			loginObj.continueButton().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.password(), 60, 2);
			loginObj.password().click();
			loginObj.password().sendKeys(ulsUserLoginCredentials.CheckerUserPassword1);
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.signIn(), 60, 5);
			loginObj.signIn().click();
			while (true) {
				try {
					waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 3, 2);
					assertEquals(loginObj.configuration().isDisplayed(), true);
					break;
				} catch (Exception e) {
					String kulsApplicationUrl = configFileReader.getApplicationUrl();
					driver.get(kulsApplicationUrl);
					waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.userId(), 60, 5);
					loginObj.userId().click();
					loginObj.userId().sendKeys(ulsUserLoginCredentials.CheckerUserName1);
					waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.continueButton(), 60, 5);
					loginObj.continueButton().click();
					waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.password(), 60, 2);
					loginObj.password().click();
					loginObj.password().sendKeys(ulsUserLoginCredentials.CheckerUserPassword1);
					waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.signIn(), 60, 5);
					loginObj.signIn().click();
				}
			}
			break;
			
		case "in01589":
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.userId(), 60, 5);
			loginObj.userId().click();
			loginObj.userId().sendKeys(ulsUserLoginCredentials.CheckerUserName2);
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.continueButton(), 60, 5);
			loginObj.continueButton().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.password(), 60, 2);
			loginObj.password().click();
			loginObj.password().sendKeys(ulsUserLoginCredentials.CheckerUserPassword2);
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.signIn(), 60, 5);
			loginObj.signIn().click();
			while (true) {
				try {
					waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 3, 2);
					assertEquals(loginObj.configuration().isDisplayed(), true);
					break;
				} catch (Exception e) {
					String kulsApplicationUrl = configFileReader.getApplicationUrl();
					driver.get(kulsApplicationUrl);
					waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.userId(), 60, 5);
					loginObj.userId().click();
					loginObj.userId().sendKeys(ulsUserLoginCredentials.CheckerUserName2);
					waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.continueButton(), 60, 5);
					loginObj.continueButton().click();
					waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.password(), 60, 2);
					loginObj.password().click();
					loginObj.password().sendKeys(ulsUserLoginCredentials.CheckerUserPassword2);
					waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.signIn(), 60, 5);
					loginObj.signIn().click();
				}
			}
			break;
		}

	}
}
