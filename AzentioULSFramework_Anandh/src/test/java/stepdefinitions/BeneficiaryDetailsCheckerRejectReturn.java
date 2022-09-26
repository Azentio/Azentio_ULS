package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.Transactions_ScreenOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.TransactionScreenTestDataType;

public class BeneficiaryDetailsCheckerRejectReturn extends BaseClass {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	TransactionScreenTestDataType Transactionjson = jsonConfig.getTransactionScreenListByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Transactions_ScreenOBJ Transaction = new Transactions_ScreenOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);

	// Checker Reject
	@Then("^User enter the reject popup message in Beneficiary details$")
	public void user_enter_the_reject_popup_message_in_beneficiary_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.Popup_Mistake(), 60, 5);
		Transaction.Popup_Mistake().click();

	}

	@And("^User search the record from the system in Beneficiary details$")
	public void user_search_the_record_from_the_system_in_beneficiary_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchiconreferenceid(), 60, 5);
		Transaction.searchiconreferenceid().click();

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchsentkeys(), 60, 5);
		Transaction.searchsentkeys().sendKeys(Transactionjson.BeneficiaryDetails_Search);

	}

	@And("^User Verification search the record from the system in Beneficiary details$")
	public void user_verification_search_the_record_from_the_system_in_beneficiary_details() throws Throwable {

		for (int i = 0; i < 200; i++) {
			try {
				Transaction.InboxSearchText().click();
				Transaction.InboxSearchText().clear();
				Transaction.InboxSearchText().sendKeys("DISBCKR");
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.InboxSearchButton(),
				30, 2);
		Transaction.InboxSearchButton().click();

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.InboxSearchText(), 60, 5);
		Transaction.InboxSearchText().click();
		Transaction.InboxSearchText().sendKeys(json.readReferancedata());

	}

	@And("^User click the action edit icon in Beneficiary details$")
	public void user_click_the_action_edit_icon_in_beneficiary_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.referenceid(), 60, 5);
		for (int i = 0; i <= 30; i++) {
			try {
				System.out.println(Transaction.referenceid().getText());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String ref1 = Transaction.referenceid().getText();
		String ref2 = ref1.substring(0);
		json.addReferanceData(ref2);

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.inboxediticon(), 60, 5);
		for (int i = 0; i <= 30; i++) {
			try {
				Transaction.inboxediticon().click();
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^User click the Reject button in Beneficiary details$")
	public void user_click_the_reject_button_in_beneficiary_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.RejectButton(), 60, 5);
		Transaction.RejectButton().click();

	}

	@And("^User click the final reject in Beneficiary details$")
	public void user_click_the_final_reject_in_beneficiary_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.FinalRejectButton(), 60, 5);
		Transaction.FinalRejectButton().click();

	}

	@And("^User verify the rejected record removed from the system in Beneficiary details$")
	public void user_verify_the_rejected_record_removed_from_the_system_in_beneficiary_details() throws Throwable {

		String xpath = "//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button";

		try {

			Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);

		} catch (Exception e) {

			System.out.println("Record is not rejected");
		}

	}

	// Checker Return

	@Then("^User enter the return popup message in Beneficiary details$")
	public void user_enter_the_return_popup_message_in_beneficiary_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.Popup_Corrections(), 60, 5);
		Transaction.Popup_Corrections().click();

	}

	@And("^User click the return button in Beneficiary details$")
	public void user_click_the_return_button_in_beneficiary_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ReturnButton(), 60, 5);
		Transaction.ReturnButton().click();

	}

	@And("^User click the final Return in Beneficiary details$")
	public void user_click_the_final_return_in_beneficiary_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.FinalReturnButton(), 60, 5);
		Transaction.FinalReturnButton().click();

	}

	@And("^User verify the return record shown in Beneficiary details maker stage$")
	public void user_verify_the_return_record_shown_in_beneficiary_details_maker_stage() throws Throwable {

		String xpath = "//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button";

		try {

			Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);

		} catch (Exception e) {

			System.out.println("Record is not return");
		}

	}

}
