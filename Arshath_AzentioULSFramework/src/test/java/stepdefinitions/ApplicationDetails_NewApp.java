package stepdefinitions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.ApplicationDetails_AppDataEntryObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.PersonalaDetailsDataEntryTestdata;

public class ApplicationDetails_NewApp extends BaseClass {

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
	ApplicationDetails_AppDataEntryObj AppliData = new ApplicationDetails_AppDataEntryObj(driver);
	PersonalaDetailsDataEntryTestdata personalData = jsonConfig.getPerDetailDataByName("Maker");


	@And("^user Enter Character value in Numeric fields$")
	public void user_enter_character_value_in_numeric_fields() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AppliData.AppDataEntry_TotalFinanceAmountRequestedField(), 60, 2);
			AppliData.AppDataEntry_TotalFinanceAmountRequestedField().click();
			AppliData.AppDataEntry_TotalFinanceAmountRequestedField().sendKeys(personalData.Characteric);
			String text = AppliData.AppDataEntry_TotalFinanceAmountRequestedField().getText();
			if (text.equalsIgnoreCase("ABCD")) {
				System.out.println("System should Allow the Characteric value in Numeric Field");
			} else {
				System.out.println("System should Not Allow the Characteric value in Numeric Field");
			}

	}

	@And("^user save the record and verify the Message we get$")
	public void user_save_the_record_and_verify_the_message_we_get() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, AppliData.ApplicationDetailsSaveIcon(), 60, 2);
		AppliData.ApplicationDetailsSaveIcon().click();
		String nameErrorMessage = driver.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]")).getText();
		String expectedErrorText = "Required field";
		if (nameErrorMessage.equalsIgnoreCase(expectedErrorText)) {
			System.out.println("System should not allow the Mandatory fields Empty.The Popup validation message is "
					+ nameErrorMessage);
		} else {
			System.out.println(
					"System should allow the Mandatory fields.The Popup validation message is " + nameErrorMessage);
		}
	}

}
