package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);

		}

	}
}
