package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class DrawdownStep extends BaseClass{
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
//	TransactionScreenTestDataType Transactionjson = jsonConfig.getTransactionScreenListByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Transactions_ScreenOBJ Transaction = new Transactions_ScreenOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","DrawdownDetailsTestData","Data Set ID");
	Map<String, String> testData;
	String dataSetID;
	
	@And("^User search the record from the system in DrawDown$")
    public void user_search_the_record_from_the_system_in_drawdown() throws Throwable {
       
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchiconreferenceid(), 60, 5);
    	Transaction.searchiconreferenceid().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchsentkeys(), 60, 5);
    	Transaction.searchsentkeys().sendKeys(testData.get("Application id"));
		
    }

    @And("^User click the drawdown tab in drawdown$")
    public void user_click_the_drawdown_tab_in_drawdown() throws Throwable {
       
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownTab(), 60, 5);
    	Transaction.DrawDownTab().click();
    	
    }

    @And("^User click the action edit icon under facility list in drawdown$")
    public void user_click_the_action_edit_icon_under_facility_list_in_drawdown() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDown_ActionEdit(), 60, 5);
    	Transaction.DrawDown_ActionEdit().click();
       
    }

    @And("^User click the add icon under payment details in drawdown$")
    public void user_click_the_add_icon_under_payment_details_in_drawdown() throws Throwable {
    	
    	seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.Addicon());
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.Addicon(), 60, 5);
    	Transaction.Addicon().click();
       
    }

    @And("^User verify the functionality of Add row button in drawdown$")
    public void user_verify_the_functionality_of_add_row_button_in_drawdown() throws Throwable {
    	
    	seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.DrawDown_EditRatioButton());
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDown_EditRatioButton(), 60, 5);
    	Transaction.DrawDown_EditRatioButton().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDown_AddRow(), 60, 5);
    	Transaction.DrawDown_AddRow().click();
    	
       
    }

    @And("^User verify the functionality of Delete row button in drawdown$")
    public void user_verify_the_functionality_of_delete_row_button_in_drawdown() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDown_DeleteRow(), 60, 5);
    	for(int i=0; i<50; i++) {
    		try {
    			Transaction.DrawDown_DeleteRow().click();
    			break;
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getMessage());
				}
				
			}
    	}
    	
       
    }

    @And("^User verify the functionality of Back button in drawdown$")
    public void user_verify_the_functionality_of_back_button_in_drawdown() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.GoBack(), 60, 5);
    	Transaction.GoBack().click();
       
    }

    @And("^User verify the current schedule section under drawdown screen$")
    public void user_verify_the_current_schedule_section_under_drawdown_screen() throws Throwable {
       
    }
    
    @And("^User click the action edit icon in DrawDown$")
    public void user_click_the_action_edit_icon_in_drawdown() throws Throwable {
    	
    	Thread.sleep(2000);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.MailActionEditIcon(), 60, 5);
    	Transaction.MailActionEditIcon().click();
        
    }
    
    //DrawDownDetails
    @And("^User click the drawdown Details tab$")
    public void user_click_the_drawdown_details_tab() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetailsTab(), 60, 5);
    	Transaction.DrawDownDetailsTab().click();
        
    }

    @And("^User click the drawdown breakup edit button in drawdown details$")
    public void user_click_the_drawdown_breakup_edit_button_in_drawdown_details() throws Throwable {
    	
    	for(int i=0; i<20; i++) {
    		try {
    			seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.DrawDownDetails_BreakupEditIcon());
    	    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetails_BreakupEditIcon(), 60, 5);
    	    	
    	    	Transaction.DrawDownDetails_BreakupEditIcon().click();
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
    	
    }

    @And("^User click the add icon in drawdown details$")
    public void user_click_the_add_icon_in_drawdown_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDown_Addicon(), 60, 5);
    	Transaction.DrawDown_Addicon().click();
        
    }

    @And("^User enter the payment type in drawdown details$")
    public void user_enter_the_payment_type_in_drawdown_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetails_PaymentType(), 60, 5);
    	Transaction.DrawDownDetails_PaymentType().click();
    	
    	String xpath = "//ion-label[contains(text(),'" + testData.get("Payment Type") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
        
    }

    @And("^User enter the end beneficiary name in drawdown details$")
    public void user_enter_the_end_beneficiary_name_in_drawdown_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetails_EndBeneficiaryName(), 60, 5);
    	Transaction.DrawDownDetails_EndBeneficiaryName().click();
    	
    	String xpath = "//ion-label[contains(text(),'" + testData.get("Beneficiary Name") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
        
        
    }

    @And("^User enter the original amount in drawdown details$")
    public void user_enter_the_original_amount_in_drawdown_details() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetails_OriginalAmount(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			Transaction.DrawDownDetails_OriginalAmount().click();
    	    	Transaction.DrawDownDetails_OriginalAmount().sendKeys(testData.get("Original Amount"));
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
        
    }

    @And("^User enter the Amount to be paid in drawdown details$")
    public void user_enter_the_amount_to_be_paid_in_drawdown_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetails_AmountToBePaid(), 60, 5);
    	Transaction.DrawDownDetails_AmountToBePaid().click();
    	Transaction.DrawDownDetails_AmountToBePaid().sendKeys(testData.get("Amount to be paid"));
        
        
    }

    @And("^User enter the Paying currency in drawdown details$")
    public void user_enter_the_paying_currency_in_drawdown_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetails_PayingCurrency(), 60, 5);
    	Transaction.DrawDownDetails_PayingCurrency().click();
    	
    	String xpath = "//ion-label[contains(text(),'" + testData.get("Paying Currency") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
        
        
    }

    @And("^User enter the payment mode in drawdown details$")
    public void user_enter_the_payment_mode_in_drawdown_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetails_PaymentMode(), 60, 5);
    	Transaction.DrawDownDetails_PaymentMode().click();
    	
    	String xpath = "//ion-label[contains(text(),'" + testData.get("Payment Mode") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
        
        
    }

    @And("^User enter the proposed payment date in drawdown details$")
    public void user_enter_the_proposed_payment_date_in_drawdown_details() throws Throwable {
        
    }

    @And("^User enter the disbursement a/c no in drawdown details$")
    public void user_enter_the_disbursement_ac_no_in_drawdown_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetails_DisbursementACNo(), 60, 5);
    	Transaction.DrawDownDetails_DisbursementACNo().click();
    	
    	String xpath = "//ion-label[contains(text(),'" + testData.get("Disbursement Account Number") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
        
        
    }

 

    @And("^User verify the functionality of Save button with all invalid data in drawdown details$")
    public void user_verify_the_functionality_of_save_button_with_all_invalid_data_in_drawdown_details() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDown_NewSave(), 60, 5);
    	Transaction.DrawDown_NewSave().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ProductCheckerid(), 60, 5);
		String Success = Transaction.ProductCheckerid().getText();
		System.out.println(Success);
		
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.successcancel(), 60, 5);
		Transaction.successcancel().click();
    	
    }
    @And("^User click the inbox mail icon in Drawdown$")
    public void user_click_the_inbox_mail_icon_in_drawdown() throws Throwable {
       
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.mailicon(), 60, 5);
		Transaction.mailicon().click();
    	
    }
    
    @And("^User select the end beneficiary name in drawdown details$")
    public void user_select_the_end_beneficiary_name_in_drawdown_details() throws Throwable {
       
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetails_EndBeneficiaryName(), 60, 5);
    	Transaction.DrawDownDetails_EndBeneficiaryName().click();
    	
    	String xpath = "//ion-label[contains(text(),'" + testData.get("BeneficiaryNameValidData") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
    	
    }

    @And("^User verify the functionality of Save button with all valid data in drawdown details$")
    public void user_verify_the_functionality_of_save_button_with_all_valid_data_in_drawdown_details() throws Throwable {
        
    	Thread.sleep(2000);
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDown_NewSave(), 60, 5);
    	Transaction.DrawDown_NewSave().click();
    	
    }
    
    @And("^User enter verification the Amount to be paid in drawdown details$")
    public void user_enter_verification_the_amount_to_be_paid_in_drawdown_details() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.DrawDownDetails_AmountToBePaid(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			Transaction.DrawDownDetails_AmountToBePaid().click();
    	    	Transaction.DrawDownDetails_AmountToBePaid().sendKeys(testData.get("AmountToBePaidVerification"));
    	        break;
			} catch (Exception e) {
				
			}
    	}
    }
    
    @Then("^select data set ID for Drawdown and Drawdown Details testcase006$")
    public void select_data_set_id_for_drawdown_and_drawdown_details_testcase006() throws Throwable {
    	dataSetID = "AT_DWD_006_D1";
        testData = excelData.getTestdata(dataSetID);
    }
    

	

}
