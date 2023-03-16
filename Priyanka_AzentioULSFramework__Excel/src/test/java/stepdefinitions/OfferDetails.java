package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.OfferDetailsObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.OfferDetailsTestDataType;

public class OfferDetails extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	OfferDetailsObj offerDetailsObj = new OfferDetailsObj(driver);
	OfferDetailsTestDataType offerDetailTestDataType = jsonReader.getOfferDetailsByName("Maker");
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	SoftAssert  softAssert = new SoftAssert();
	
	 @Then("^search Offer Details record$")
	    public void search_offer_details_record()  {
		 while(true)
	    	{
	    	try{
	    		waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_SearchInputField(), 10, 1);
	        	offerDetailsObj.OfferDetails_SearchInputField().click();   
	    	    offerDetailsObj.OfferDetails_SearchInputField().sendKeys(offerDetailTestDataType.OfferDetailsReferenceId);
	    	    break;
	    	}catch(Exception E){}
	    	} 
	    }

	    @Then("^open Facility Info Record$")
	    public void open_facility_info_record()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_FacilityInfoRecord(), 10, 1);
        	offerDetailsObj.OfferDetails_FacilityInfoRecord().click();   
    	     
	    }

	    @Then("^Validate fields and Sections are available on Offer details screen$")
	    public void validate_fields_and_sections_are_available_on_offer_details_screen()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_OfferDetailsSection(), 10, 1);
        	offerDetailsObj.OfferDetails_OfferDetailsSection().isDisplayed();
        	offerDetailsObj.OfferDetails_AcceptOfferButton().isDisplayed();
        	offerDetailsObj.OfferDetails_FinanceDetailsSection().isDisplayed();
        	javascripthelper.scrollToElemet(offerDetailsObj.OfferDetails_CreditRiskFactorSection());
        	offerDetailsObj.OfferDetails_CreditRiskFactorSection().isDisplayed();
        	offerDetailsObj.OfferDetails_CreditScoreDetailsSection().isDisplayed();
        	offerDetailsObj.OfferDetails_EligibilityDetailsSection().isDisplayed();
        	offerDetailsObj.OfferDetails_InterestRateStructureSection().isDisplayed();
        	javascripthelper.scrollToElemet(offerDetailsObj.OfferDetails_InstallmentsSection());

        	offerDetailsObj.OfferDetails_InstallmentsSection().isDisplayed();
        	offerDetailsObj.OfferDetails_AppealRequestSection().isDisplayed();
	    }

	    @Then("^Verify Offer Details Section displayed data should be in read only mode$")
	    public void verify_offer_details_section_displayed_data_should_be_in_read_only_mode()  {
	    	javascripthelper.scrollToElemet(offerDetailsObj.OfferDetails_OfferDetailsSection());
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_OfferDetailsSection(), 10, 1);
        	offerDetailsObj.OfferDetails_OfferDetailsSection().isDisplayed();
        	
        	
        	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_OfferDetailsSection_Product(), 10, 1);
        	boolean status = offerDetailsObj.OfferDetails_OfferDetailsSection_Product().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(status , "Offer Details Section Product Field is Read Only mode");
	        
        	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_OfferDetailsSection_SubProduct(), 10, 1);
        	boolean subProduct = offerDetailsObj.OfferDetails_OfferDetailsSection_SubProduct().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(subProduct , "Offer Details Section subProduct Field is Read Only mode");
	        
        	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_OfferDetailsSection_Scheme(), 10, 1);
        	boolean scheme = offerDetailsObj.OfferDetails_OfferDetailsSection_Scheme().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(scheme , "Offer Details Section scheme Field is Read Only mode");
	        
        	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_OfferDetailsSection_PricingIndicator(), 10, 1);
        	boolean pricingIndicator = offerDetailsObj.OfferDetails_OfferDetailsSection_PricingIndicator().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(pricingIndicator , "Offer Details Section PricingIndicator Field is Read Only mode");
	        
        	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_OfferDetailsSection_OfferedAmount(), 10, 1);
        	boolean offeredAmount = offerDetailsObj.OfferDetails_OfferDetailsSection_OfferedAmount().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(offeredAmount , "Offer Details Section OfferedAmount Field is Read Only mode");
	        
        	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_OfferDetailsSection_Tenure(), 10, 1);
        	boolean tenure = offerDetailsObj.OfferDetails_OfferDetailsSection_Tenure().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(tenure , "Offer Details Section Tenure Field is Read Only mode");
	        
        	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_OfferDetailsSection_NatureOfFinance(), 10, 1);
        	boolean natureOfFinance = offerDetailsObj.OfferDetails_OfferDetailsSection_NatureOfFinance().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(natureOfFinance , "Offer Details Section NatureOfFinance Field is Read Only mode");
	        
        	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_OfferDetailsSection_Currency(), 10, 1);
        	boolean currency = offerDetailsObj.OfferDetails_OfferDetailsSection_Currency().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(currency , "Offer Details Section Currency Field is Read Only mode");
        	softAssert.assertAll();
	    }
	    

	    @Then("^verify all the fields should be available on the Finance Details section$")
	    public void verify_all_the_fields_should_be_available_on_the_finance_details_section()  {
        	waithelper.waitForElementToVisibleWithFluentWait(driver, offerDetailsObj.OfferDetails_FinanceDetailsSection(), 10, 1);
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalObligations().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalNetIncome().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalIncome().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalFees().isDisplayed();
	    	
	    	javascripthelper.scrollToElemet(offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalDownPaymentAmount()); 

	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalDownPaymentAmount().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalContractValue().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_NoOfInstallments().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_LastInstallmentAmount().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_IRR().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_InstallmentFrequency().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_APR().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_AmountRequested().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_AdditionalDownPayment().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_DownPaymentPercentage().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_Tenure().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_ProfitAmount().isDisplayed();
	    	offerDetailsObj.OfferDetails_FinanceDetailsSection_DownPaymentAmount().isDisplayed();
	
	    }
	    
	    @Then("^verify the field Total Down Payment Amount should be in read only mode$")
	    public void verify_the_field_total_down_payment_amount_should_be_in_read_only_mode()  {
	    	clicksAndActionHelper.moveToElement(offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalDownPaymentAmount());
	    	boolean status = offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalDownPaymentAmount().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(status , "Finance Details Section Total Down Payment Amount Field is Read Only mode"); }

	    @Then("^verify the field Profit Amount should be in read only mode$")
	    public void verify_the_field_profit_amount_should_be_in_read_only_mode()  {
	    	clicksAndActionHelper.moveToElement(offerDetailsObj.OfferDetails_FinanceDetailsSection_ProfitAmount());
	    	boolean status = offerDetailsObj.OfferDetails_FinanceDetailsSection_ProfitAmount().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(status , "Finance Details Section Profit Amount Field is Read Only mode");
  
	    }

	    @Then("^verify the field Total Contract Value should be in read only mode$")
	    public void verify_the_field_total_contract_value_should_be_in_read_only_mode()  {
	    	clicksAndActionHelper.moveToElement(offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalContractValue());
	    	boolean status = offerDetailsObj.OfferDetails_FinanceDetailsSection_TotalContractValue().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(status , "Finance Details Section Total Contract Value  Field is Read Only mode");
  
	    }

	    @Then("^verify the field Additional Down payment should be in read only mode$")
	    public void verify_the_field_additional_down_payment_should_be_in_read_only_mode()  {
	    	clicksAndActionHelper.moveToElement(offerDetailsObj.OfferDetails_FinanceDetailsSection_AdditionalDownPayment());
	    	boolean status = offerDetailsObj.OfferDetails_FinanceDetailsSection_AdditionalDownPayment().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(status , "Finance Details Section Additional Down payment  Field is Read Only mode");
  
	    }

	    @Then("^verify the field Down Payment Percentage should be in read only mode$")
	    public void verify_the_field_down_payment_percentage_should_be_in_read_only_mode()  {
	    	clicksAndActionHelper.moveToElement(offerDetailsObj.OfferDetails_FinanceDetailsSection_DownPaymentPercentage());
	    	boolean status = offerDetailsObj.OfferDetails_FinanceDetailsSection_DownPaymentPercentage().getAttribute("readonly").equalsIgnoreCase("true");
        	softAssert.assertTrue(status , "Finance Details Section Down Payment Percentage  Field is Read Only mode");
  
	    }
	    
	    
	    @Then("^verify all the fields should be available on the Credit Risk Factor section$")
	    public void verify_all_the_fields_should_be_available_on_the_credit_risk_factor_section()  {
	        
	    }

	    @Then("^verify all the fields of Credit Risk Factor section should be in read only mode$")
	    public void verify_all_the_fields_of_credit_risk_factor_section_should_be_in_read_only_mode()  {
	        
	    }

	    @Then("^verify all the fields should be available on the Credit Score Details section$")
	    public void verify_all_the_fields_should_be_available_on_the_credit_score_details_section()  {
	        
	    }

	    @Then("^verify all the fields of Credit Score Details section should be in read only mode $")
	    public void verify_all_the_fields_of_credit_score_details_section_should_be_in_read_only_mode()  {
	        
	    }



}
