package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.Customer_AddressDetailsObj;
import resources.BaseClass;
import testDataType.PersonalDetails_DisbursementMakerTestDataType;

public class Customer_AddressDetails extends BaseClass{

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	Customer_AddressDetailsObj customer_AddressDetailsObj = new Customer_AddressDetailsObj(driver);
	PersonalDetails_DisbursementMakerTestDataType PDDMTestDataType = jsonReader.getPersonalDetails_DisbursementMakerByName("Maker");
	SoftAssert softAssert = new SoftAssert();
	
	
	 @Then("^search Customer Address Details record$")
	    public void search_customer_address_details_record()  {
		 while(true)
	    	{
	    	try{
	    		waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_SearchInputField(), 10, 1);
	        	customer_AddressDetailsObj.Customer_AddressDetails_SearchInputField().click();   
	    	    customer_AddressDetailsObj.Customer_AddressDetails_SearchInputField().sendKeys(PDDMTestDataType.ReferenceIdCustomerAddressDetails);
	    	    break;
	    	}catch(Exception E){}
	    	}  
	    }
	 
	 @Then("^click on Additional customer info Segment button$")
	 public void click_on_additional_customer_info_segment_button() {
		 waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_AdditionalCustomerInfo(), 10, 1);
		 customer_AddressDetailsObj.Customer_AddressDetails_AdditionalCustomerInfo().isDisplayed();
		 customer_AddressDetailsObj.Customer_AddressDetails_AdditionalCustomerInfo().click();   
	 	  
	    }
	 
	 @Then("^click on Action button of Customer Personal Information$")
	 public void click_on_action_button_of_customer_personal_information() {
	 waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_CustomerPersonalInformation_ActionEdit(), 10, 1);
	 customer_AddressDetailsObj.Customer_AddressDetails_CustomerPersonalInformation_ActionEdit().isDisplayed();
	 customer_AddressDetailsObj.Customer_AddressDetails_CustomerPersonalInformation_ActionEdit().click();   
 	    
	    }

	 @Then("^from customer identification screen click on add button of Address details$")
	    public void from_customer_identification_screen_click_on_add_button_of_address_details()  {
		 waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_AddressDetailAddButton(), 10, 1);
		 customer_AddressDetailsObj.Customer_AddressDetails_AddressDetailAddButton().isDisplayed();
		 waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_AddressDetailAddButton(), 10, 1);
		 customer_AddressDetailsObj.Customer_AddressDetails_AddressDetailAddButton().click();   
	 	   
	    } 
	 
	 @Then("^select Address Type$")
	 public void select_address_type() {
	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_AddressTypeField(), 10, 1);
	customer_AddressDetailsObj.Customer_AddressDetails_AddressTypeField().isDisplayed();
	customer_AddressDetailsObj.Customer_AddressDetails_AddressTypeField().click(); 
	
	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_AddressTypeDropdown(), 10, 1);
	customer_AddressDetailsObj.Customer_AddressDetails_AddressTypeDropdown().click(); 
	 	   	
	    }

	    @Then("^select Address Status$")
	    public void select_address_status() {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_AddressStatusField(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_AddressStatusField().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_AddressStatusField().click(); 
	    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_AddressStatusDropdown(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_AddressStatusDropdown().click();    
	    }

	    @Then("^select Residential or Occupancy Status$")
	    public void select_residential_or_occupancy_status() {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_ResidentialOrOccupancyStatusField(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_ResidentialOrOccupancyStatusField().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_ResidentialOrOccupancyStatusField().click(); 
	    	while(true) {
	    	try{
//	    	javaScriptHelper.scrollToElemet(customer_AddressDetailsObj.Customer_AddressDetails_ResidentialOrOccupancyStatusDropdown());
	    	clicksAndActionsHelper.moveToElement(customer_AddressDetailsObj.Customer_AddressDetails_ResidentialOrOccupancyStatusDropdown());
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_ResidentialOrOccupancyStatusDropdown(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_ResidentialOrOccupancyStatusDropdown().click();  
	    	break;
	    	}catch(Exception e) {}
	    }}

	    @Then("^Enter Address Line1$")
	    public void enter_address_line1() {
	    	while(true) {
		    	try{
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_AddressLine1Field(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_AddressLine1Field().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_AddressLine1Field().sendKeys(PDDMTestDataType.AddressLine1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_AddressLine1Field().sendKeys(Keys.ENTER);
	    	break;
		    	}catch(Exception e) {}
		    }  
	    }

	    @Then("^Enter Address Line2$")
	    public void enter_address_line2() {
	    	while(true) {
		    	try{
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_AddressLine2Field(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_AddressLine2Field().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_AddressLine2Field().sendKeys(PDDMTestDataType.AddressLine2);
	    	customer_AddressDetailsObj.Customer_AddressDetails_AddressLine2Field().sendKeys(Keys.ENTER);
	    	break;
    	}catch(Exception e) {}
    } 
	    }

	    @Then("^select Country$")
	    public void select_country() {
	    	clicksAndActionsHelper.moveToElement(customer_AddressDetailsObj.Customer_AddressDetails_CountryField());

	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_CountryField(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_CountryField().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_CountryField().click(); 
	    	while(true) {
		    	try{
//		    	javaScriptHelper.scrollToElemet(customer_AddressDetailsObj.Customer_AddressDetails_ResidentialOrOccupancyStatusDropdown());
		    	clicksAndActionsHelper.moveToElement(customer_AddressDetailsObj.Customer_AddressDetails_CountryDropdown());
		    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_CountryDropdown(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_CountryDropdown().click();    
	    	break;
		    	}catch(Exception e) {}
		    }
	    }

	    @Then("^select Province ID$")
	    public void select_province_id() {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_ProvinceIdField(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_ProvinceIdField().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_ProvinceIdField().click(); 
	    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_ProvinceIdDropdown(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_ProvinceIdDropdown().click();   
	    }

	    @Then("^Enter Neighbourhood District Name$")
	    public void enter_neighbourhood_district_name() {
	    	while(true) {
		    	try{
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_NeighbourhoodDistrictNameField(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_NeighbourhoodDistrictNameField().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_NeighbourhoodDistrictNameField().sendKeys(PDDMTestDataType.NeighbourhoodDistrictName);
	    	customer_AddressDetailsObj.Customer_AddressDetails_NeighbourhoodDistrictNameField().sendKeys(Keys.ENTER);
	    	break;
		    	}catch(Exception e) {}
		    }   
	    }

	    @Then("^select City ID$")
	    public void select_city_id() {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_CityIdField(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_CityIdField().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_CityIdField().click(); 
	    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_CityIdDropdown(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_CityIdDropdown().click();   
	       
	    }

	    @Then("^Enter Zip Code$")
	    public void enter_zip_code() {
	    	while(true) {
		    	try{
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_ZipCodeField(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_ZipCodeField().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_ZipCodeField().sendKeys(PDDMTestDataType.ZipCode);
	    	customer_AddressDetailsObj.Customer_AddressDetails_ZipCodeField().sendKeys(Keys.ENTER);
	    	break;
    	}catch(Exception e) {}
    }    
	    }

	    @Then("^Enter Mobile Number primary$")
	    public void enter_mobile_number_primary() {
    		//javaScriptHelper.scrollToElemet(customer_AddressDetailsObj.Customer_AddressDetails_MobileNumberPrimaryField());

	    	while(true) {
		    	try{
			    	clicksAndActionsHelper.moveToElement(customer_AddressDetailsObj.Customer_AddressDetails_MobileNumberPrimaryField());

	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_MobileNumberPrimaryField(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_MobileNumberPrimaryField().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_MobileNumberPrimaryField().sendKeys(PDDMTestDataType.MobileNumberprimary);
	    	customer_AddressDetailsObj.Customer_AddressDetails_MobileNumberPrimaryField().sendKeys(Keys.ENTER);
	    	break;
		    	}catch(Exception e) {}
		    }   
	    }

	    @Then("^Enter Occupancy Date$")
	    public void enter_occupancy_date() {
	    	while(true) {
		    	try{
			    	clicksAndActionsHelper.moveToElement(customer_AddressDetailsObj.Customer_AddressDetails_OccupancyDateField());

	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_OccupancyDateField(), 10, 1);
	    	customer_AddressDetailsObj.Customer_AddressDetails_OccupancyDateField().isDisplayed();
	    	customer_AddressDetailsObj.Customer_AddressDetails_OccupancyDateField().sendKeys(PDDMTestDataType.OccupancyDate);
	    	customer_AddressDetailsObj.Customer_AddressDetails_OccupancyDateField().sendKeys(Keys.ENTER);
	    	    	break;
    	}catch(Exception e) {}
    } 
//	    	while(true) {
//		    	try{
//			    	clicksAndActionsHelper.moveToElement(customer_AddressDetailsObj.Customer_AddressDetails_TodayDate());
//
//			    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_TodayDate(), 10, 1);
//			    	customer_AddressDetailsObj.Customer_AddressDetails_TodayDate().click();
//			    	break;
//		    	}catch(Exception e) {}
//		    } 

		    	
	    }

	    @Then("^click on save button of Address Detail$")
	    public void click_on_save_button_of_address_detail() throws InterruptedException {
	    	clicksAndActionsHelper.moveToElement(customer_AddressDetailsObj.Customer_AddressDetails_AddressDetailsSaveButton());

	    	waithelper.waitForElementToVisibleWithFluentWait(driver, customer_AddressDetailsObj.Customer_AddressDetails_AddressDetailsSaveButton(), 10, 1);
		 	customer_AddressDetailsObj.Customer_AddressDetails_AddressDetailsSaveButton().click(); 
		 	Thread.sleep(3000);
		 	
		 	while(true) {
			    try {
			    	String successMsg = javaScriptHelper.executeScript(
			    	"return document.querySelector('ion-toast').shadowRoot.querySelector('div[class=toast-message]')").toString();
			    	//String successmsg = successMsg.getText();
			    	 System.out.println("success msg : "+successMsg);
			    	 break;
			    	} 
			    	catch (Exception e) {}
			    
			    }
    } 
	    }

    
    
   
    
