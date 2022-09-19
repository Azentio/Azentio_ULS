package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.Transactions_ScreenOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.TransactionScreenTestDataType;

public class ApplicationDetailsNewApp {
	
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
	TransactionScreenTestDataType Transactionjson = jsonConfig.getTransactionScreenListByName("Maker");
	
	@Given("^User login as uls maker in transaction$")
    public void user_login_as_uls_maker_in_transaction() throws Throwable {
		
		String kulsApplicationUrl = configFileReader.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		applicationLogin.loginUlsApplicationAsMaker(loginData.Username2, loginData.Password);
       
    }

    @And("^User click the transactions in application details new app$")
    public void user_click_the_transactions_in_application_details_new_app() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.Transactions(), 60, 5);
    	Transaction.Transactions().click();
       
    }

    @And("^User click the application manager in application details new app$")
    public void user_click_the_application_manager_in_application_details_new_app() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationManager(), 60, 5);
    	Transaction.ApplicationManager().click();
       
    }

    @And("^User click the application details list view in application details new app$")
    public void user_click_the_application_details_list_view_in_application_details_new_app() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetailsListviewIcon(), 60, 5);
    	Transaction.ApplicationDetailsListviewIcon().click();
       
    }

    @And("^User click the application details action edit icon in application details new app$")
    public void user_click_the_application_details_action_edit_icon_in_application_details_new_app() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.ListViewPencilIcon(), 180, 5);
    	while (true) {
    		try {
    			Transaction.ListViewPencilIcon().click();
    			break;
			} catch (Exception e) {
				
			}
			
		}
    	
    	
    	
       
    }

    @And("^User click the back arrow button in application details new app$")
    public void user_click_the_back_arrow_button_in_application_details_new_app() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.GoBack(), 60, 5);
    	Transaction.GoBack().click();
       
    }

    @And("^User verify the status button is active stage in application details new app$")
    public void user_verify_the_status_button_is_active_stage_in_application_details_new_app() throws Throwable {
    	
    	seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.ApplicationDetails_SourcingOffice());;
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.StatusButton(), 60, 5);
    	String Status = Transaction.StatusButton().getAttribute("aria-checked");
    	
    	if (Status.equalsIgnoreCase("true")) {
    		
    		System.out.println("Active Status");
			
		}else {
			
			System.out.println("Deactive status");
		}
    	
    }

    @And("^User click the status button in application details new app$")
    public void user_click_the_status_button_in_application_details_new_app() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.StatusButton(), 60, 5);
    	Transaction.StatusButton().click();
       
    }

    @And("^User verify the status button is deactive stage in application details new app$")
    public void user_verify_the_status_button_is_deactive_stage_in_application_details_new_app() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.StatusButton(), 60, 5);
    	String Status = Transaction.StatusButton().getAttribute("aria-checked");
    	
    	if (Status.equalsIgnoreCase("true")) {
    		
    		System.out.println("Active Status");
			
		}else{
			
			System.out.println("Deactive status");
		}
       
    }

    @And("^User enter the declared net income in application details new app$")
    public void user_enter_the_net_declared_net_income_in_application_details_new_app() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DeclaredNetIncome(), 60, 5);
    	Transaction.DeclaredNetIncome().click();
    	Transaction.DeclaredNetIncome().sendKeys(Transactionjson.ApplicationDetails_NetIncome);
       
    }

    @And("^User click the save button in application details new app$")
    public void user_click_the_save_button_in_application_details_new_app() throws Throwable {
    	
    	seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.UpdateSave());
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.UpdateSave(), 60, 5);
    	Transaction.UpdateSave().click();
       
    }
    @And("^User verify the module name in application details new app$")
    public void user_verify_the_module_name_in_application_details_new_app() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails(), 60, 5);
    	Transaction.ApplicationDetails().getText();
    	System.out.println(Transaction.ApplicationDetails().getText());
       
    }


}
