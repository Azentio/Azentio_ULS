package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.WebDriver;

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
	String path = System.getProperty("user.dir") + "\\Test-data\\ULSTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"LoginCredentials","Stage");
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
		waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menu(), 60, 2);
		loginObj.menu().click();
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menu(), 60, 2);
			loginObj.menu().click();
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menu(), 60, 2);
			loginObj.menu().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			break;
		case"ssk":
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menu(), 60, 2);
			loginObj.menu().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			break;
		case"0221":
			testdata = excelData.getTestdata("Checker4");
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menu(), 60, 2);
			loginObj.menu().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			break;
		case"0183":
			testdata = excelData.getTestdata("Checker5");
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menu(), 60, 2);
			loginObj.menu().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			break;	
		case"0326":
			testdata = excelData.getTestdata("Checker6");
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menu(), 60, 2);
			loginObj.menu().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			break;	
		case"0350":
			testdata = excelData.getTestdata("Checker7");
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menu(), 60, 2);
			loginObj.menu().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			break;		
		case"0306":
			testdata = excelData.getTestdata("Checker8");
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
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menu(), 60, 2);
			loginObj.menu().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
			break;	
		default:
			testdata = excelData.getTestdata("Checker8");
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.userId(), 60, 5);
			loginObj.userId().click();
			loginObj.userId().sendKeys(userID);
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.continueButton(), 60, 5);
			loginObj.continueButton().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.password(), 60, 2);
			loginObj.password().click();
			loginObj.password().sendKeys(testdata.get("Password"));
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.signIn(), 60, 5);
			loginObj.signIn().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.menu(), 60, 2);
			loginObj.menu().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, loginObj.configuration(), 60, 2);
			assertEquals(loginObj.configuration().isDisplayed(), true);
		  
		}
		
		

	}
}
