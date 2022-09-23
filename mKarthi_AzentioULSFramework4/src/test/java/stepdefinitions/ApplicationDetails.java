package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.TransactionApplicationDetailsObject;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class ApplicationDetails {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	TransactionApplicationDetailsObject ApplicationdetailsObj = new TransactionApplicationDetailsObject(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	//DepositAccountTestData depositMasterData = jconfig.getDepositAccountMasterByName("Maker");
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot mandateOrNot= new FindFieldisMandatoryorNot(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	
	 @Then("^Click the transaction button$")
	    public void click_the_transaction_button() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, ApplicationdetailsObj.Transaction(), 60, 2);
			ApplicationdetailsObj.Transaction().click();
	    }

	    @And("^Click the Application manager$")
	    public void click_the_application_manager() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, ApplicationdetailsObj.ApplicationManager(), 60, 2);
			ApplicationdetailsObj.ApplicationManager().click();
	    }
	    @Then("^Click the application details$")
	    public void click_the_application_details() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, ApplicationdetailsObj.ApplicationDetails_EyeIcon(), 60, 2);
			ApplicationdetailsObj.ApplicationDetails_EyeIcon().click();
	    }

	    @And("^Click the first pencil icon in application details$")
	    public void click_the_first_pencil_icon_in_application_details() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, ApplicationdetailsObj.ApplicationDetails_FirstPencilIcon(), 60, 2);
			ApplicationdetailsObj.ApplicationDetails_FirstPencilIcon().click();
	    }
	    @Then("^Save the record in application details$")
	    public void save_the_record_in_application_details() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, ApplicationdetailsObj.ApplicationDetails_SaveButton(), 60, 2);
			ApplicationdetailsObj.ApplicationDetails_SaveButton().click();
	    }

	    @Then("^Validate the required field functionality in application details$")
	    public void validate_the_required_field_functionality_in_application_details() throws Throwable {
	    	Thread.sleep(2000);
	    	
			WebElement nameErrorMessage = driver
					.findElement(By.xpath("//ion-badge[contains(text(),'Required field')]"));
			String expectedErrorText = "Required field";
			String actualErrorText = nameErrorMessage.getText();
			if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
				System.out.println(
						"The actual and expected result are same.The Popup validation message is" + actualErrorText);
			} else {
				System.out.println(
						"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
			}
			Assert.assertEquals("Required field", actualErrorText);
	    }

	    @And("^Click the servicing entitity and choose the select button$")
	    public void click_the_servicing_entitity_and_choose_the_select_button() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, ApplicationdetailsObj.ApplicationDetails_ServicingEntity(), 60, 2);
			ApplicationdetailsObj.ApplicationDetails_ServicingEntity().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, ApplicationdetailsObj.ApplicationDetails_ServicingEntity_Select(), 60, 2);
			ApplicationdetailsObj.ApplicationDetails_ServicingEntity_Select().click();
	    } 


}
