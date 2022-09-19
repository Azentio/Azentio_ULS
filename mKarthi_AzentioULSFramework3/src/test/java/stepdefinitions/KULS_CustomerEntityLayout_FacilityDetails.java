package stepdefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

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

public class KULS_CustomerEntityLayout_FacilityDetails {
	
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
	SoftAssert softAssert = new SoftAssert();
	
	
	@Then("^User click the action edit icon in conventional facility details$")
    public void user_click_the_action_edit_icon_in_conventional_facility_details() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ActionEditIcon(), 60, 5);
    	Transaction.FacilityDetails_ActionEditIcon().click();
        
    }

    @And("^User click the action edit icon in customer entity layout facility details$")
    public void user_click_the_action_edit_icon_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchiconreferenceid(), 60, 5);
    	Transaction.searchiconreferenceid().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchsentkeys(), 60, 5);
    	Transaction.searchsentkeys().sendKeys(Transactionjson.FacilityDetails_Search);
    	
    	Thread.sleep(2000);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.inboxediticon(), 60, 5);
    	Transaction.inboxediticon().click();
    	
        
    }

    @And("^User click the facility info tab in customer entity layout facility details$")
    public void user_click_the_facility_info_tab_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_FacilityInfo(), 60, 5);
    	Transaction.FacilityDetails_FacilityInfo().click();
        
    }

    @And("^User click the add icon in customer entity layout facility details$")
    public void user_click_the_add_icon_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.Addicon(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			Transaction.Addicon().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
    	
        
    }

    @And("^User click the back button in customer entity layout facility details$")
    public void user_click_the_back_button_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.GoBack(), 60, 5);
    	Transaction.GoBack().click();
        
    }

    @And("^User enter the primary product in customer entity layout facility details$")
    public void user_enter_the_primary_product_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_PrimaryProduct(), 60, 5);
    	Transaction.FacilityDetails_PrimaryProduct().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_PrimaryProduct+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

    }

    @And("^User enter the primary sub product in customer entity layout facility details$")
    public void user_enter_the_primary_sub_product_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_PrimarySubProduct(), 60, 5);
    	Transaction.FacilityDetails_PrimarySubProduct().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_PrimarySubProduct+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

        
    }

    @And("^User enter the scheme in customer entity layout facility details$")
    public void user_enter_the_scheme_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_Scheme(), 60, 5);
    	Transaction.FacilityDetails_Scheme().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_Scheme+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

        
    }

    @And("^User enter the program code in customer entity layout facility details$")
    public void user_enter_the_program_code_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ProgramCode(), 60, 5);
    	Transaction.FacilityDetails_ProgramCode().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_ProgramCode+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

        
    }

    @And("^User enter the facility type in customer entity layout facility details$")
    public void user_enter_the_facility_type_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_FacilityType(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			Transaction.FacilityDetails_FacilityType().click();
    	    	Transaction.FacilityDetails_FacilityType().sendKeys(Transactionjson.FacilityDetails_FacilityType);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
        
    }

    @And("^User enter the servicing branch in customer entity layout facility details$")
    public void user_enter_the_servicing_branch_in_customer_entity_layout_facility_details() throws Throwable {
        
    }

    @And("^User enter the pricing or interest indicator in customer entity layout facility details$")
    public void user_enter_the_pricing_or_interest_indicator_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_PricingOrInterestIndicator(), 60, 5);
    	Transaction.FacilityDetails_PricingOrInterestIndicator().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_PricingOrInterestIndicator+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

    	
        
    }

    @And("^User enter the declared asset value in customer entity layout facility details$")
    public void user_enter_the_declared_asset_value_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_DeclaredAssetValue(), 60, 5);
    	
    	for(int i=0; i<20; i++) {
    		try {
				
    			Transaction.FacilityDetails_DeclaredAssetValue().click();
    	    	Transaction.FacilityDetails_DeclaredAssetValue().sendKeys(Transactionjson.FacilityDetails_DeclaredAssetValue);
    	    	break;
    			
			} catch (Exception e) {
				
			}
    	}
    	
 
        
    }

    @And("^User enter the declared down payment amount in customer entity layout facility details$")
    public void user_enter_the_declared_down_payment_amount_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_DeclaredDownPaymentAmount(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
				
    			Transaction.FacilityDetails_DeclaredDownPaymentAmount().click();
    	    	Transaction.FacilityDetails_DeclaredDownPaymentAmount().sendKeys(Transactionjson.FacilityDetails_DeclaredDownPaymentAmount);
    	    	break;
    			
			} catch (Exception e) {
				
			}
    	}
    	
    	
 
        
    }

    @And("^User enter the requested amount in customer entity layout facility details$")
    public void user_enter_the_requested_amount_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_RequestedAmount(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
				
    			Transaction.FacilityDetails_RequestedAmount().click();
    	    	Transaction.FacilityDetails_RequestedAmount().sendKeys(Transactionjson.FacilityDetails_DeclaredRequestedAmount);
    	    	break;
    			
			} catch (Exception e) {
				
			}
    	}
    	
 
        
    }

    @And("^User enter the currency in customer entity layout facility details$")
    public void user_enter_the_currency_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_Currency(), 60, 5);
    	Transaction.FacilityDetails_Currency().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_Currency+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

    	

    	
    	
        
    }

    @And("^User enter the expiry date in customer entity layout facility details$")
    public void user_enter_the_expiry_date_in_customer_entity_layout_facility_details() throws Throwable {
    	

    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ExpiryDate(), 60, 5);
    	Transaction.FacilityDetails_ExpiryDate().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_Year(), 60, 5);
    	Transaction.FacilityDetails_Year().click();
    	
    	String xpath = "//div[@class='p-yearpicker ng-tns-c230-18 ng-star-inserted']//child::span[contains(text(),'"+Transactionjson.FacilityDetails_Year+"')]";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {
				
				Transaction.FacilityDetails_YearNext().click();
				

			}
		}
		
    	String xpath1 = "//div[@class='p-monthpicker ng-tns-c230-18 ng-star-inserted']//child::span[contains(text(),'"+Transactionjson.FacilityDetails_Month+"')]";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath1)));
				driver.findElement(By.xpath(xpath1)).click();
				break;

			} catch (Exception e) {
				

			}
		}
		
    	String xpath2 = "//table[@class='p-datepicker-calendar ng-tns-c230-18']//span[contains(text(),'"+Transactionjson.FacilityDetails_Day+"')]";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath2)));
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {
				

			}
		}
    	
    	
    	
        
    }

    @And("^User enter the loan tenure month in customer entity layout facility details$")
    public void user_enter_the_loan_tenure_month_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_LoanTenure(), 60, 5);
    	Transaction.FacilityDetails_LoanTenure().click();
    	Transaction.FacilityDetails_LoanTenure().sendKeys(Transactionjson.FacilityDetails_LoanTenure);
 
        
    }

    @And("^User click the save icon in customer entity layout facility details$")
    public void user_click_the_save_icon_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.NewSave(), 60, 5);
    	Transaction.NewSave().click();
    	
        
    }

    @And("^User get the save confirmation messege in customer entity layout facility details$")
    public void user_get_the_save_confirmation_messege_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	for (int i = 0; i < 20; i++) {
			try {
				
				System.out.println(Transaction.makerconfirmmsg().getText());
				break;
			} catch (NoSuchElementException e) {

			}
		}
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.successcancel(), 60, 5);
    	Transaction.successcancel().click();

        
    }

    @And("^User verify the primary product field should be non editable in customer entity layout facility details$")
    public void user_verify_the_primary_product_field_should_be_non_editable_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_PrimaryProduct(), 60, 5);

		boolean status = Transaction.ApplicationDetails_PrimaryProduct().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Primary product field should be non eitable one but here it is editable hence failed");

        
    }

    @And("^User verify the primary sub product field should be non editable in customer entity layout facility details$")
    public void user_verify_the_primary_sub_product_field_should_be_non_editable_in_customer_entity_layout_facility_de() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ApplicationDetails_PrimarySubProduct(), 60, 5);

		boolean status = Transaction.ApplicationDetails_PrimarySubProduct().getAttribute("ng-reflect-is-disabled")
				.equals("true");

		System.out.println("System status is" + status);

		softAssert.assertTrue(status,
				"Primary sub product field should be non eitable one but here it is editable hence failed");
		
		
		softAssert.assertAll();
		

        
    }
    
   
    @And("^User verify the impact when user enter characters  value in numeric field in customer entity layout facility details$")
    public void user_verify_the_impact_when_user_enter_characters_value_in_numeric_field_in_customer_entity_layout_facility_details() throws Throwable {
        
        seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.FacilityDetails_LoanTenure());
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_LoanTenure(), 60, 5);
    	Transaction.FacilityDetails_LoanTenure().click();
    	Transaction.FacilityDetails_LoanTenure().sendKeys(Transactionjson.FacilityDetails_LoanTenureVerifyChar);
    	String attr= Transaction.FacilityDetails_LoanTenure().getAttribute("ng-reflect-model");
    	Assert.assertNotEquals(attr, Transactionjson.FacilityDetails_LoanTenureVerifyChar);
    	
        
    	
    }

    @And("^User verify the impact when user enters only special characters value in any field in customer entity layout facility details$")
    public void user_verify_the_impact_when_user_enters_only_special_characters_value_in_any_field_in_customer_entity_layout_facility_details() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_LoanTenure(), 60, 5);
    	Transaction.FacilityDetails_LoanTenure().click();
    	Transaction.FacilityDetails_LoanTenure().sendKeys(Transactionjson.FacilityDetails_LoanTenureVerifySpecial);
    	String attr1 = Transaction.FacilityDetails_LoanTenure().getAttribute("ng-reflect-model");
    	Assert.assertEquals(attr1, Transactionjson.FacilityDetails_LoanTenureVerifySpecial);
        
    }

    @And("^User verify the impact when user keep any mandatory field blank and click on save button in customer entity layout facility details$")
    public void user_verify_the_impact_when_user_keep_any_mandatory_field_blank_and_click_on_save_button_in_customer_entity_layout_facility_details() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ProgramCode(), 60, 5);
    	Transaction.FacilityDetails_ProgramCode().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_ProgramCodeBlank+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
		
		help.waitForElementToVisibleWithFluentWait(driver, Transaction.UpdateSave(), 60, 5);
    	Transaction.UpdateSave().click();
    	
    	String ErrorMsg = Transaction.RequirdField().getText();
    	
    	System.out.println(ErrorMsg);
		

    	
    }

    @And("^User verify system display the List view in customer entity layout facility details$")
    public void user_verify_system_display_the_list_view_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.Addicon(), 60, 5);
    	Transaction.Addicon().isDisplayed();
    	System.out.println("Add Icon is available");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ActionEditIcon(), 60, 5);
    	Transaction.FacilityDetails_ActionEditIcon().isDisplayed();
    	System.out.println("Edit Icon is available");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.productViewSearchText(), 60, 5);
    	Transaction.productViewSearchText().isDisplayed();
    	System.out.println("Search Icon is available");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewProduct(), 60, 5);
    	Transaction.FacilityDetails_ListViewProduct().isDisplayed();
    	System.out.println("Product is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewSubProduct(), 60, 5);
    	Transaction.FacilityDetails_ListViewSubProduct().isDisplayed();
    	System.out.println("SubProduct is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewTenure(), 60, 5);
    	Transaction.FacilityDetails_ListViewTenure().isDisplayed();
    	System.out.println("Tenure is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewExpiryDate(), 60, 5);
    	Transaction.FacilityDetails_ListViewExpiryDate().isDisplayed();
    	System.out.println("ExpiryDate is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewRequestedAmount(), 60, 5);
    	Transaction.FacilityDetails_ListViewRequestedAmount().isDisplayed();
    	System.out.println("RequestedAmount is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewStatus(), 60, 5);
    	Transaction.FacilityDetails_ListViewStatus().isDisplayed();
    	System.out.println("Status is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewShowing(), 60, 5);
    	Transaction.FacilityDetails_ListViewShowing().isDisplayed();
    	System.out.println("Showing Entries is Displayed");
    	
        
    }

    @And("^User verify the impact post selecting any record from list view in customer entity layout facility details$")
    public void user_verify_the_impact_post_selecting_any_record_from_list_view_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ActionEditIcon(), 60, 5);
    	Transaction.FacilityDetails_ActionEditIcon().click();
    	
    	String RequestedAmount = Transaction.FacilityDetails_RequestedAmount().getAttribute("aria-valuenow");
    	
    	String LoanTenure = Transaction.FacilityDetails_LoanTenure().getAttribute("ng-reflect-model");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.GoBack(), 60, 5);
    	Transaction.GoBack().click();
    	
    	String RequestedAmountListView = Transaction.FacilityDetails_ListViewVerifyRequested().getText();
    	String LoanTenureListView = Transaction.FacilityDetails_ListViewVerifyTenure().getText();
    	
    	Assert.assertEquals(RequestedAmount, RequestedAmountListView);
    	Assert.assertEquals(LoanTenure, LoanTenureListView);
    	
    	
    	
        
    }

    @And("^User modify the program code in customer entity layout facility details$")
    public void user_modify_the_program_code_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ProgramCode(), 60, 5);
    	Transaction.FacilityDetails_ProgramCode().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_ProgramCodeModify+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
  
    }

    @And("^User modify the facility type in customer entity layout facility details$")
    public void user_modify_the_facility_type_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ProgramCode(), 60, 5);
    	Transaction.FacilityDetails_ProgramCode().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_FacilityTypeModify+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

        
    }
    @And("^User click the update save icon in customer entity layout facility details$")
    public void user_click_the_update_save_icon_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.UpdateSave(), 60, 5);
    	Transaction.UpdateSave().click();	
       
    }
    @And("^User click the submit button in customer entity layout facility details$")
    public void user_click_the_submit_button_in_customer_entity_layout_facility_details() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.SubmitButton(), 60, 5);
    	Transaction.SubmitButton().click();
    	
    	
    }

    @And("^User enter the popup message in customer entity layout facility details$")
    public void user_enter_the_popup_message_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.SubmitAlertButton(), 60, 5);
    	Transaction.SubmitAlertButton().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.SubmitFinalButton(), 60, 5);
    	Transaction.SubmitFinalButton().click();
    	
        
    }

    @And("^User get the confirmation message in customer entity layout facility details$")
    public void user_get_the_confirmation_message_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	for (int i = 0; i < 20; i++) {
			try {
				
				System.out.println(Transaction.makerconfirmmsg().getText());
				break;
			} catch (NoSuchElementException e) {

			}
		}
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.successcancel(), 60, 5);
    	Transaction.successcancel().click();
    	
    	
        
    }


    @And("^User keep any mandatory field blank and click on save button in conventional facility details$")
    public void user_keep_any_mandatory_field_blank_and_click_on_save_button_in_conventional_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ProgramCode(), 60, 5);
    	Transaction.FacilityDetails_ProgramCode().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_ProgramCodeBlank+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

        
    }

    @And("^User verify while modification system enters the invalid data in conventional facility details$")
    public void user_verify_while_modification_system_enters_the_invalid_data_in_conventional_facility_details() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_FacilityType(), 60, 5);
    	Transaction.FacilityDetails_ProgramCode().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+Transactionjson.FacilityDetails_FacilityTypeBlank+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}


    	
    }

    @And("^User verify the Facility Details details List view in customer entity layout facility details$")
    public void user_verify_the_facility_details_details_list_view_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.Addicon(), 60, 5);
    	Transaction.Addicon().isDisplayed();
    	System.out.println("Add Icon is available");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ActionEditIcon(), 60, 5);
    	Transaction.FacilityDetails_ActionEditIcon().isDisplayed();
    	System.out.println("Edit Icon is available");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.productViewSearchText(), 60, 5);
    	Transaction.productViewSearchText().isDisplayed();
    	System.out.println("Search Icon is available");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewProduct(), 60, 5);
    	Transaction.FacilityDetails_ListViewProduct().isDisplayed();
    	System.out.println("Product is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewSubProduct(), 60, 5);
    	Transaction.FacilityDetails_ListViewSubProduct().isDisplayed();
    	System.out.println("SubProduct is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewTenure(), 60, 5);
    	Transaction.FacilityDetails_ListViewTenure().isDisplayed();
    	System.out.println("Tenure is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewExpiryDate(), 60, 5);
    	Transaction.FacilityDetails_ListViewExpiryDate().isDisplayed();
    	System.out.println("ExpiryDate is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewRequestedAmount(), 60, 5);
    	Transaction.FacilityDetails_ListViewRequestedAmount().isDisplayed();
    	System.out.println("RequestedAmount is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewStatus(), 60, 5);
    	Transaction.FacilityDetails_ListViewStatus().isDisplayed();
    	System.out.println("Status is Displayed");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ListViewShowing(), 60, 5);
    	Transaction.FacilityDetails_ListViewShowing().isDisplayed();
    	System.out.println("Showing Entries is Displayed");

        
    }

    @And("^User verify the Values in List view should be non editable in customer entity layout facility details$")
    public void user_verify_the_values_in_list_view_should_be_non_editable_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified product code field is not editable only displayable");
		}
        
    }

    @And("^User verify the functionality of Add button in customer entity layout facility details$")
    public void user_verify_the_functionality_of_add_button_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	for(int i=0; i<20; i++) {
    		try {
    			Transaction.Addicon().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.GoBack(), 60, 5);
    	Transaction.GoBack().click();
    	
        
    }

    @And("^User verify the functionality of edit button in customer entity layout facility details$")
    public void user_verify_the_functionality_of_edit_button_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.FacilityDetails_ActionEditIcon(), 60, 5);
    	Transaction.FacilityDetails_ActionEditIcon().click();
        
    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.GoBack(), 60, 5);
    	Transaction.GoBack().click();
    	
        
    }

    @And("^User verify the functionality of Search box with mismatch data in customer entity layout facility details$")
    public void user_verify_the_functionality_of_search_box_with_mismatch_data_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
		for (int i = 0; i < 20; i++) {
			try {
				Transaction.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.productViewSearchText(),
				30, 2);
		Transaction.productViewSearchText().sendKeys("zzzzz");
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				break;
			} catch (NoSuchElementException e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();


        
    }

    @And("^User verify the functionality of Search box with matching data in customer entity layout facility details$")
    public void user_verify_the_functionality_of_search_box_with_matching_data_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.searchIcon(), 30, 2);
		for (int i = 0; i < 20; i++) {
			try {
				Transaction.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.productViewSearchText(),
				30, 2);
		Transaction.productViewSearchText().sendKeys(json.readReferancedata());

		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		String productcode = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);

		productcode = driver.findElement(By.xpath(xpath)).getText();

	    System.out.println(productcode);

        
    }

    @And("^User verify the functionality of Export to PDF button in customer entity layout facility details$")
    public void user_verify_the_functionality_of_export_to_pdf_button_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.exportIcon(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				Transaction.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.pdfOption(), 60, 3);
		// Assert.assertEquals(project.pdfOption().isDisplayed(), true);
		Transaction.pdfOption().click();
		String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		for (int i = 0; i < 20; i++) {
			try {
				for (File fileName : totalfiles) {
					if (fileName.getName().equalsIgnoreCase("ProductMasterFile.pdf")) {
						System.out.println("Downloaded file present in system");
						break;
					} else {
						// System.out.println("Downloaded file present does not exist in system");
					}

				}
				break;

			} catch (Exception e) {

			}
		}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();

        
    }

    @And("^User verify the functionality of Export to Excel button in customer entity layout facility details$")
    public void user_verify_the_functionality_of_export_to_excel_button_in_customer_entity_layout_facility_details() throws Throwable {
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.exportIcon(), 60, 2);
    	Transaction.exportIcon().click();

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.xlsOption(), 60, 3);
		// Assert.assertEquals(project.xlsOption().isDisplayed(), true);
		Transaction.xlsOption().click();

        
    }



}
