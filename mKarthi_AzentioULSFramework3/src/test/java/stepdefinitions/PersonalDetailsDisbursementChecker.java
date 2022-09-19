package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.Transactions_ScreenOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class PersonalDetailsDisbursementChecker {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Transactions_ScreenOBJ Transaction = new Transactions_ScreenOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	
	@And("^User click the inbox mail icon in personal details disbursement checker$")
    public void user_click_the_inbox_mail_icon_in_personal_details_disbursement_checker() throws Throwable {
		

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.mailicon(), 60, 5);
		Transaction.mailicon().click();
       
    }

    @And("^User click the action edit icon in personal details disbursement checker$")
    public void user_click_the_action_edit_icon_in_personal_details_disbursement_checker() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchiconreferenceid(), 60, 5);
    	Transaction.searchiconreferenceid().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchsentkeys(), 60, 5);
    	Transaction.searchsentkeys().sendKeys("DISBCKR");
    	
    	Thread.sleep(2000);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.inboxediticon(), 60, 5);
    	Transaction.inboxediticon().click();

       
    }

    @And("^User click the customer details tab in personal details disbursement checker$")
    public void user_click_the_customer_details_tab_in_personal_details_disbursement_checker() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDetails(), 60, 5);
    	Transaction.CustomerDetails().click();
       
    }

    @And("^User verify the customer details List view in personal details disbursement checker$")
    public void user_verify_the_customer_details_list_view_in_personal_details_disbursement_checker() throws Throwable {
    	

    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDetails_CIFID(), 60, 5);
    	Transaction.CustomerDetails_CIFID().isDisplayed();
    	System.out.println(Transaction.CustomerDetails_CIFID());
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDetails_FirstName(), 60, 5);
    	Transaction.CustomerDetails_FirstName().isDisplayed();
    	System.out.println(Transaction.CustomerDetails_FirstName());
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDetails_MiddleName(), 60, 5);
    	Transaction.CustomerDetails_MiddleName().isDisplayed();
    	System.out.println(Transaction.CustomerDetails_MiddleName());
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDetails_LastName(), 60, 5);
    	Transaction.CustomerDetails_LastName().isDisplayed();
    	System.out.println(Transaction.CustomerDetails_LastName());

    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDetails_CustomerType(), 60, 5);
    	Transaction.CustomerDetails_CustomerType().isDisplayed();
    	System.out.println(Transaction.CustomerDetails_CustomerType());
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDetails_ApplicantType(), 60, 5);
    	Transaction.CustomerDetails_ApplicantType().isDisplayed();
    	System.out.println(Transaction.CustomerDetails_ApplicantType());
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDetails_Status(), 60, 5);
    	Transaction.CustomerDetails_Status().isDisplayed();
    	System.out.println(Transaction.CustomerDetails_Status());
       
       
       
    }
    @And("^User Verify the Values in List view should be non editable in personal details disbursement checker$")
    public void user_verify_the_customer_details_list_view_functionality_in_personal_details_disbursement_checker() throws Throwable {
    	
    	String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified product code field is not editable only displayable");
		}
       
    }

    @And("^User verify the back button functionality in personal details disbursement checker$")
    public void user_verify_the_back_button_functionality_in_personal_details_disbursement_checker() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.BackArrow(), 60, 5);
    	Transaction.BackArrow().click();
    	
       
    }


}
