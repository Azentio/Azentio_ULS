package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.WaitHelper;
import pageobjects.KULS_CommonWebElements;
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
	String filePath = System.getProperty("user.dir") + "\\Test-data\\ULSTestData.xlsx";
	ExcelData excelData = new ExcelData(filePath, "LoginCredentials", "Stage");
	KULS_CommonWebElements kulsCommonWebObj;
	Map<String, String> testdata;
	ConfigFileReader configFileReader = new ConfigFileReader();

	public void loginUlsApplicationAsMaker(String username, String password) throws InterruptedException {
		for (int i = 0; i <= 5; i++) {

			try {
				waithelper = new WaitHelper(driver);
				loginObj = new KULS_LoginObj(driver);
				kulsCommonWebObj = new KULS_CommonWebElements(driver);
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
				waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.makerMenuBar(), 60, 2);
				loginObj.makerMenuBar().click();
				waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
				assertEquals(loginObj.configuration().isDisplayed(), true);
				waithelper.waitForElementToVisibleWithFluentWait(driver, kulsCommonWebObj.ulsCorporateToolBar(), 20, 1);
				kulsCommonWebObj.ulsCorporateToolBar().click();
				waithelper.waitForElementToVisibleWithFluentWait(driver, kulsCommonWebObj.ulsToolBarLOSOption(), 20, 1);
				kulsCommonWebObj.ulsToolBarLOSOption().click();
				break;
			} catch (Exception e) {
				if (i != 5) {
					driver.get(configFileReader.getULSApplicationCenBankUrl());
				} else if (i == 5) {
					Assert.fail(e.getMessage());
				}
			}

		}
	}

	public void ulSApplicationLoginAsAChecker(String userID) {
		waithelper = new WaitHelper(driver);
		loginObj = new KULS_LoginObj(driver);
		javaScriptHelper = new JavascriptHelper(driver);
		kulsCommonWebObj = new KULS_CommonWebElements(driver);
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.makerMenuBar(), 60, 2);
			loginObj.makerMenuBar().click();
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.makerMenuBar(), 60, 2);
			loginObj.makerMenuBar().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			break;
		case "ssk":
			testdata = excelData.getTestdata("Checker3");
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.makerMenuBar(), 60, 2);
			loginObj.makerMenuBar().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			waithelper.waitForElementToVisibleWithFluentWait(driver, kulsCommonWebObj.ulsConfigurationToolBar(), 20, 1);
			kulsCommonWebObj.ulsConfigurationToolBar().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, kulsCommonWebObj.ulsToolBarLOSOption(), 20, 1);
			kulsCommonWebObj.ulsToolBarLOSOption().click();
			break;

		}

	}
}
