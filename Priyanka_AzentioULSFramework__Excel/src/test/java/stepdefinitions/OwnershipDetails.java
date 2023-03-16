package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.OwnershipDetailsObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.OwnershipDetailsTestDataType;

public class OwnershipDetails extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	OwnershipDetailsObj OwnershipDetailsObj = new OwnershipDetailsObj(driver);
	OwnershipDetailsTestDataType OwnershipDetailsTestDataType = jsonReader.getOwnershipDetailsByName("Maker");
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	SoftAssert  softAssert = new SoftAssert();

    @Then("^search Ownership Details record$")
    public void search_ownership_details_record() {
    	while(true)
    	{
    	try{
    		waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_SearchInputField(), 10, 1);
        	OwnershipDetailsObj.OwnershipDetails_SearchInputField().click();   
    	    OwnershipDetailsObj.OwnershipDetails_SearchInputField().sendKeys(OwnershipDetailsTestDataType.OwnershipDetailsReferenceId);
    	    break;
    	}catch(Exception E){}
    	} 
    }
    

    @And("^naviagte to the Ownership Details Segment button$")
    public void naviagte_to_the_ownership_details_segment_button() {
    while(true){
		
		try {
			waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_OwnershipSegmentButton(), 1, 1);
        	OwnershipDetailsObj.OwnershipDetails_OwnershipSegmentButton().click(); 
			break;
		} catch (Exception e) {
			waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_NextButton(), 2, 1);
        	OwnershipDetailsObj.OwnershipDetails_NextButton().click();	
		}
	}
    
    }
    
    @Then("^verify the field Owner Power Of Attorney Details$")
    public void verify_the_field_owner_power_of_attorney_details()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_OwnerPowerOfAttorneyDetails(), 5, 1);
    OwnershipDetailsObj.OwnershipDetails_OwnerPowerOfAttorneyDetails().click(); 
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_OwnerDropdown(), 5, 1);
	OwnershipDetailsObj.OwnershipDetails_OwnerDropdown().click(); 
    }

    @Then("^verify the field Name of Ownership Details$")
    public void verify_the_field_name_of_ownership_details() throws InterruptedException  {
    	  waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_Name(), 10, 1);
    	    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Name");
    	for(int i = 1; i < 10; i++){
    		
    		try {
    waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_Name(), 5, 1);
   // findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Name");
    //OwnershipDetailsObj.OwnershipDetails_Name().click(); 
    OwnershipDetailsObj.OwnershipDetails_Name().sendKeys(OwnershipDetailsTestDataType.Name);
    OwnershipDetailsObj.OwnershipDetails_Name().sendKeys(Keys.ENTER);
    
   // waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_OwnerPowerOfAttorneyDetails(), 10, 1);
	 String status = OwnershipDetailsObj.OwnershipDetails_Name().getAttribute("ng-reflect-type");
	//softAssert.asserteq
	 break;
        	}catch(Exception E){}
        	}
    
    }

    @Then("^verify the field Id Type is Pan Card$")
    public void verify_the_field_id_type_is_pan_card()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_IDType(), 5, 1);
        OwnershipDetailsObj.OwnershipDetails_IDType().click(); 
        
        waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_PanCardDropdown(), 5, 1);
    	OwnershipDetailsObj.OwnershipDetails_PanCardDropdown().click();    
    }

    @Then("^verify the field Id Number when Id Type is Pan Card$")
    public void verify_the_field_id_number_when_id_type_is_pan_card() throws InterruptedException  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_IdNumber(), 10, 1);
	    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Id Number");
	for(int i = 1; i < 10; i++){
		
		try {
waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_IdNumber(), 5, 1);
OwnershipDetailsObj.OwnershipDetails_IdNumber().sendKeys(OwnershipDetailsTestDataType.IdNumberPanCard);
OwnershipDetailsObj.OwnershipDetails_IdNumber().sendKeys(Keys.ENTER);
break;
    	}catch(Exception E){}
    	}   
	}

    @Then("^verify the field Id Type is Aadhar Card$")
    public void verify_the_field_id_type_is_aadhar_card()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_IDType(), 5, 1);
        OwnershipDetailsObj.OwnershipDetails_IDType().click(); 
        
        waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_AadharCardDropdown(), 5, 1);
    	OwnershipDetailsObj.OwnershipDetails_AadharCardDropdown().click();   
    }

    @Then("^verify the field Id Number when Id Type is Aadhar Card$")
    public void verify_the_field_id_number_when_id_type_is_aadhar_card()  {
    	for(int i = 1; i < 10; i++){
    		
    		try {
    waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_IdNumber(), 5, 1);
    OwnershipDetailsObj.OwnershipDetails_IdNumber().clear();
    OwnershipDetailsObj.OwnershipDetails_IdNumber().sendKeys(OwnershipDetailsTestDataType.IdNumberAadharCard);
    OwnershipDetailsObj.OwnershipDetails_IdNumber().sendKeys(Keys.ENTER);
    break;
        	}catch(Exception E){}
        	}   
    }

    @Then("^verify the field Issue date of Ownership Details$")
    public void verify_the_field_issue_date_of_ownership_details()  {
    	while(true) {
	    	try{

    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_IssueDate(), 10, 1);
    	OwnershipDetailsObj.OwnershipDetails_IssueDate().isDisplayed();
    	OwnershipDetailsObj.OwnershipDetails_IssueDate().click();

    	break;
	}catch(Exception e) {}
} 
    	while(true) {
	    	try{
		    	//clicksAndActionsHelper.moveToElement(OwnershipDetailsObj.Customer_AddressDetails_TodayDate());
      waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_TodayDate(), 10, 1);
      javascripthelper.JSEClick(OwnershipDetailsObj.OwnershipDetails_TodayDate());
	  break;
	    	}catch(Exception e) {}
	    }   
    }

    @Then("^verify the field Issue Place of Ownership Details$")
    public void verify_the_field_issue_place_of_ownership_details()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_IssuePlace(), 10, 1);
	    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Issue Place");
	for(int i = 1; i < 10; i++){
		
		try {
waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_IssuePlace(), 5, 1);
OwnershipDetailsObj.OwnershipDetails_IssuePlace().sendKeys(OwnershipDetailsTestDataType.IssuePlace);
OwnershipDetailsObj.OwnershipDetails_IssuePlace().sendKeys(Keys.ENTER);
break;
    	}catch(Exception E){}
    	}   
    }

    @Then("^verify the field City of Ownership Details$")
    public void verify_the_field_city_of_ownership_details()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_City(), 5, 1);
        OwnershipDetailsObj.OwnershipDetails_City().click(); 
        
        waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_CityDropdown(), 5, 1);
    	OwnershipDetailsObj.OwnershipDetails_CityDropdown().click();    
    }

    @Then("^verify the field Mobile of Ownership Details$")
    public void verify_the_field_mobile_of_ownership_details()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_Mobile(), 10, 1);
	    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Mobile");
	for(int i = 1; i < 10; i++){
		
		try {
waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_Mobile(), 5, 1);
OwnershipDetailsObj.OwnershipDetails_Mobile().sendKeys(OwnershipDetailsTestDataType.Mobile);
OwnershipDetailsObj.OwnershipDetails_Mobile().sendKeys(Keys.ENTER);
break;
    	}catch(Exception E){}
    	}     
    }

    @Then("^verify the field Phone of Ownership Details$")
    public void verify_the_field_phone_of_ownership_details()  {
        
    }

    @Then("^verify the field Mobile2 of Ownership Details$")
    public void verify_the_field_mobile2_of_ownership_details()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_Mobile2(), 10, 1);
	    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Mobile 2");
	for(int i = 1; i < 10; i++){
		
		try {
waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_Mobile2(), 5, 1);
OwnershipDetailsObj.OwnershipDetails_Mobile2().sendKeys(OwnershipDetailsTestDataType.Mobile2);
OwnershipDetailsObj.OwnershipDetails_Mobile2().sendKeys(Keys.ENTER);
break;
    	}catch(Exception E){}
    	}     
    }

    @Then("^verify the field Fax of Ownership Details$")
    public void verify_the_field_fax_of_ownership_details()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_Fax(), 10, 1);
	    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Fax");
	for(int i = 1; i < 10; i++){
		
		try {
waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_Fax(), 5, 1);
OwnershipDetailsObj.OwnershipDetails_Fax().sendKeys(OwnershipDetailsTestDataType.Fax);
OwnershipDetailsObj.OwnershipDetails_Fax().sendKeys(Keys.ENTER);
break;
    	}catch(Exception E){}
    	}    
    }

    @Then("^verify the field Email of Ownership Details$")
    public void verify_the_field_email_of_ownership_details()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_Email(), 10, 1);
	    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Email");
	for(int i = 1; i < 10; i++){
		
		try {
waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_Email(), 5, 1);
OwnershipDetailsObj.OwnershipDetails_Email().sendKeys(OwnershipDetailsTestDataType.Email);
OwnershipDetailsObj.OwnershipDetails_Email().sendKeys(Keys.ENTER);
break;
    	}catch(Exception E){}
    	}    
    }
    
    @Then("^Save Ownership Details record and validate the success pop$")
    public void save_ownership_details_record_and_validate_the_success_pop() {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_SaveButton(), 10, 1);
	 	OwnershipDetailsObj.OwnershipDetails_SaveButton().click(); 
	 	
	 	
	 	
	 	for(int i=1; i <=10; i++) {
		    try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_SaveConfirmationMessage(), 10, 1);
			 	OwnershipDetailsObj.OwnershipDetails_SaveConfirmationMessage().isDisplayed();
			 	String savemsg = OwnershipDetailsObj.OwnershipDetails_SaveConfirmationMessage().getText();
			 	System.out.println("save msg : "+savemsg);
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, OwnershipDetailsObj.OwnershipDetails_SaveConfirmationMessageCloseButton(), 10, 1);
			 	OwnershipDetailsObj.OwnershipDetails_SaveConfirmationMessageCloseButton().click();

			 	break;
		    	} 
		    	catch (Exception e) {}
		    
		    } 
    }
    



}



