package stepdefinitions;

import static org.testng.Assert.assertNotEquals;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.Transactions_ScreenOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class ApplicationDetailOffering {
	
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
	
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","AppDetailOfferingTestData","Data Set ID");
	Map<String, String> testData;
	Map<String, String> AppDetailOfferingTestData = new HashMap<>();
	
	
	@And("^User click the inbox mail icon in application detail offering$")
    public void user_click_the_inbox_mail_icon_in_application_detail_offering() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.mailicon(), 60, 5);
		Transaction.mailicon().click();
        
    }

    @And("^User click the action edit icon in application detail offering$")
    public void user_click_the_action_edit_icon_in_application_detail_offering() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchiconreferenceid(), 60, 5);
    	Transaction.searchiconreferenceid().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchsentkeys(), 60, 5);
    	Transaction.searchsentkeys().sendKeys(testData.get("Inbox Search"));
    	
    	Thread.sleep(2000);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.inboxediticon(), 60, 5);
    	Transaction.inboxediticon().click();
    	
    	
        
    }

       @And("^User verify the availability of Add button on Application Detail offering$")
    public void user_verify_the_availability_of_add_button_on_application_detail_offering() throws Throwable {
    	
    	
    	try {
    		
    		WebElement add = driver.findElement(By.xpath("//button[@ng-reflect-text='Add']"));
    		add.click();
			
		} catch (Exception e) {
			
			System.out.println("Add icon is not available");
			
		}
        
        
    }
       

    @And("^User verify the modify existing record of Application Details under Offering screen$")
    public void user_verify_the_modify_existing_record_of_application_details_under_offering_screen() throws Throwable {
    	
    	String xpath = "(//ion-label[contains(text(),'Product')]//following-sibling::ion-input//child::input)[1]";
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Record is not editable only displayable");
		}
        
    }

    @And("^User verify the back button functionality in application detail offering$")
    public void user_verify_the_back_button_functionality_in_application_detail_offering() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.BackArrow(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			Transaction.BackArrow().click();
    			break;
				
			} catch (Exception e) {
				
			}
    	}
    	
    	
        
    }
    
    @And("^User click the application details tab in application detail offering$")
    public void user_click_the_application_details_tab_in_application_detail_offering() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetailsTab(), 60, 5);
    	Transaction.ApplicationDetailsTab().click();
        
    }

    @And("^User click the offering tab in application detail offering$")
    public void user_click_the_offering_tab_in_application_detail_offering() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.OfferingTab(), 60, 5);
    	Transaction.OfferingTab().click();
    	
        
    }

    @And("^User click the offering action edit icon in application detail offering$")
    public void user_click_the_offering_action_edit_icon_in_application_detail_offering() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ActionEditIcon(), 60, 5);
    	Transaction.ActionEditIcon().click();
    	
    	
        
    }
    @And("^User get the test data for application detail offering test case2$")
    public void user_get_the_test_data_for_application_detail_offering_test_case2() throws Throwable {
    	AppDetailOfferingTestData = testData = excelData.getTestdata("AT-ADO-002-D1");
    }



}
