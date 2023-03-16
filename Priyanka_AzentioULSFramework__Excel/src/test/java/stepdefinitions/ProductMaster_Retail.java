package stepdefinitions;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import dataProvider.JsonConfig;
import helper.AlertHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ProductMaster_RetailObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.ProductMaster_RetailTestDataType;

public class ProductMaster_Retail extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver) ;
	AlertHelper alertHelper = new AlertHelper(driver);
	ProductMaster_RetailObj productMaster_RetailObj = new ProductMaster_RetailObj(driver);
	ProductMaster_RetailTestDataType productMaster_RetailTestDataType = jsonReader.getProductMasterRetailByName("Maker");
	String referenceID;
	JsonDataReaderWriter jsonReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);


    @Then("^click on Product Setup$")
    public void click_on_product_setup()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,productMaster_RetailObj.Product_Setup(), 60, 1);
	productMaster_RetailObj.Product_Setup().click();   
    }

    @Then("^click on Product Master eye icon$")
    public void click_on_product_master_eye_icon()  {
    //waithelper.waitForElement(driver, 2000, productMaster_RetailObj.productMaster_EyeIcon());
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_EyeIcon(), 60, 1);
    productMaster_RetailObj.productMaster_EyeIcon().click();   
    }

    @Then("^click on Product Master add button$")
    public void click_on_product_master_add_button() throws InterruptedException  {
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_AddButton(), 60, 2);
    productMaster_RetailObj.productMaster_AddButton().isDisplayed();
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_AddButton().click(); 
    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
     
    
    }

    @Then("^verify functionality and asterik mark of the field Product Group$")
    public void verify_functionality_and_asterik_mark_of_the_field_product_group()  {
    //ProductGroup
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductGroup(), 60, 2);
    productMaster_RetailObj.productMaster_ProductGroup().isDisplayed();
   
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Product Group");
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductGroup().click();
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductGroup_Dropdown(), 60, 2);
    
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductGroup_Dropdown().click(); 
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    }

    @Then("^verify functionality and asterik mark of the field Product Code$")
    public void verify_functionality_and_asterik_mark_of_the_field_product_code()  {
    //ProductCode
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductCode(), 60, 2);
    productMaster_RetailObj.productMaster_ProductCode().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Product Code");
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductCode().click();
    		productMaster_RetailObj.productMaster_ProductCode().sendKeys(productMaster_RetailTestDataType.ProductCode);
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    
    }
    
    @Then("^Enter Product Code for Return$")
    public void enter_product_code_for_return()  {
    //ProductCode for Return the record
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductCode(), 60, 2);
    productMaster_RetailObj.productMaster_ProductCode().isDisplayed(); 
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductCode().click(); 
    	    productMaster_RetailObj.productMaster_ProductCode().sendKeys(productMaster_RetailTestDataType.ProductCodeReturn);

    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
           
    }
    @Then("^Enter Product Code for reject$")
    public void enter_product_code_for_reject()  {
    //ProductCode for Reject the record
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductCode(), 60, 2);
    productMaster_RetailObj.productMaster_ProductCode().isDisplayed(); 
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductCode().click(); 
    	    productMaster_RetailObj.productMaster_ProductCode().sendKeys(productMaster_RetailTestDataType.ProductCodeReject);
    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
           
    }

    @Then("^Enter Product Description$")
    public void enter_product_description()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescriptionEnter(), 30, 2);
    productMaster_RetailObj.productMaster_ProductDescriptionEnter().isDisplayed();
    waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_ProductCode());
    
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_ProductDescriptionEnter().click(); 
    	    productMaster_RetailObj.productMaster_ProductDescriptionEnter().sendKeys(productMaster_RetailTestDataType.DescriptionEnglish);
    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    
   
    }
    
    //-------------Multi language description----------//
    
    @Then("^verify functionality and asterik mark of the field Product Description$")
    public void verify_functionality_and_asterik_mark_of_the_field_product_description()  {
    //ProductDescription
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription(), 60, 2);
    productMaster_RetailObj.productMaster_ProductDescription().isDisplayed();
    productMaster_RetailObj.productMaster_ProductDescription().click();
    
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Product Description");
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription_English(), 60, 2);
    productMaster_RetailObj.productMaster_ProductDescription_English().sendKeys(productMaster_RetailTestDataType.DescriptionEnglish);
    //productMaster_RetailObj.productMaster_ProductDescription_English().sendKeys(Keys.ENTER);
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription_French(), 60, 2);
    productMaster_RetailObj.productMaster_ProductDescription_French().sendKeys(productMaster_RetailTestDataType.DescriptionFrench);
    //productMaster_RetailObj.productMaster_ProductDescription_French().sendKeys(Keys.ENTER);
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription_German(), 60, 2);
    productMaster_RetailObj.productMaster_ProductDescription_German().sendKeys(productMaster_RetailTestDataType.DescriptionGerman);
   // productMaster_RetailObj.productMaster_ProductDescription_German().sendKeys(Keys.ENTER);
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver,productMaster_RetailObj.productMaster_ProductDescription_Arabic(), 60, 2);
    productMaster_RetailObj.productMaster_ProductDescription_Arabic().sendKeys(productMaster_RetailTestDataType.DescriptionArabic);
    //productMaster_RetailObj.productMaster_ProductDescription_Arabic().sendKeys( Keys.ENTER); 
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_ProductDescription_Save(), 60, 2);
    productMaster_RetailObj.productMaster_ProductDescription_Save().isDisplayed();
    productMaster_RetailObj.productMaster_ProductDescription_Save().click();
    }

    @Then("^verify functionality and asterik mark of the field RetailCorporate$")
    public void verify_functionality_and_asterik_mark_of_the_field_retailcorporate()  {
    //RetailCorporate
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_RetailCorporate(), 60, 2);
    productMaster_RetailObj.productMaster_RetailCorporate().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Retail/Corporate");
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_RetailCorporate().click(); 
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
        
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_RetailCorporate_Dropdown(), 60, 2);
    productMaster_RetailObj.productMaster_RetailCorporate_Dropdown().isDisplayed();
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_RetailCorporate_Dropdown().click(); 
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }        
    }

    @Then("^verify functionality of the field DM Code$")
    public void verify_functionality_of_the_field_dm_code()  {
    //DMCode
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_DMCode(), 60, 2);
    productMaster_RetailObj.productMaster_Product_DMCode().isDisplayed();
    waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_DMCode());
    
    for (int i = 0; i<20; i++)
    {
    	try {
    		 productMaster_RetailObj.productMaster_Product_DMCode().click();
    		 productMaster_RetailObj.productMaster_Product_DMCode().sendKeys(productMaster_RetailTestDataType.DMCode);
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
   
    
    }

    @Then("^verify the field Remarks$")
    public void verify_the_field_remarks()  {
    //Remarks
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Remark(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Remark().isDisplayed();
    for (int i = 0; i<20; i++)
    {
    	try {
    		 productMaster_RetailObj.productMaster_Product_Remark().click();
    		 productMaster_RetailObj.productMaster_Product_Remark().sendKeys(productMaster_RetailTestDataType.Remarks);
    		 break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
       
    
    }

    @Then("^verify the functionality of Back button$")
    public void verify_the_functionality_of_back_button()  {
    //Back
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Back(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Back().isDisplayed();
    productMaster_RetailObj.productMaster_Product_Back().click();
   
    }
    @Then("^click on save button$")
    public void click_on_save_button()  {
    //Save
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Save(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Save().isDisplayed();
    productMaster_RetailObj.productMaster_Product_Save().click();
  
    }
    
    
    //---------------------validating----------------------------------------------------//

    @Then("^validate the impact of any mandatory field blank$")
    public void validate_the_impact_of_any_mandatory_field_blank()  {
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ValidationRequiredField(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ValidationRequiredField().isDisplayed();
    }
    
  //------------------------Remarks with special characters value-------------------------//
    
    @Then("^verify the field Remarks with special characters value$")
    public void verify_the_field_remarks_with_special_characters_value()  {
    //Remarks
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Remark(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Remark().isDisplayed();
    
    for (int i = 0; i<20; i++)
    {
    	try {
    		productMaster_RetailObj.productMaster_Product_Remark().click();
    	    productMaster_RetailObj.productMaster_Product_Remark().sendKeys(productMaster_RetailTestDataType.SymbolicRemark);         
    	      break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    
    }
    @Then("^validate the impact of special characters value in any field$")
    public void validate_the_impact_of_special_characters_value_in_any_field()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ValidationAlphanumeric(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ValidationAlphanumeric().isDisplayed();  
    }
    
    @Then("^validate Success pop up$")
    public void validate_success_pop_up()  {
    	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_SaveConfirmationMessage());
    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessage().isDisplayed();
    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().isDisplayed();
    	productMaster_RetailObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
    	System.out.println("System should display the confirmation message");
   
    }
    
    @Then("^click on Menu$")
    public void click_on_menu()  {
    //Menu
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Menu(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Menu().click();  
    	    
    }

    @Then("^click on inbox$")
    public void click_on_inbox()  {
    //Inbox
    
    while(true) {
    	try{
    	    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Inbox(), 60, 2);
    	    productMaster_RetailObj.productMaster_Product_Inbox().click(); 
    		break;
    	 }
    		catch(Exception e){}
    	}
    }
    @Then("^click on search icon of record list$")
    public void click_on_search_icon_of_record_list()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchRecordList(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchRecordList().click();
    }
    @Then("^search Project Master Retail record$")
    public void search_project_master_retail_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.EventCode);
             
    }
    
    @And("^maker user open the record from inbox$")
    public void maker_user_open_the_record_from_inbox() throws IOException, ParseException, InterruptedException  {
    Thread.sleep(1000);  
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ReferanceId(), 30, 2);
    referenceID = productMaster_RetailObj.productMaster_Product_ReferanceId().getText();
    jsonReaderWriter.addReferanceData(referenceID);
//    System.out.println("reference Id " +referenceID);
    
    
	String beforeXpath = "//span[contains(text(),'";
	String afterXpath = "')]/../../td/button";
	
    WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+jsonReaderWriter.readReferancedata()+afterXpath));
    
  while(true)
    {
    	try {
    		waithelper.waitForElementToVisibleWithFluentWait(driver, firstRecord, 30, 2);
    		firstRecord.click(); 
    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
	 

    }
    


    @Then("^maker user submit the Record$")
    public void maker_user_submit_the_record() throws IOException  {
    //Submit the record from maker
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Submit(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Submit().click();
        
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SubmitRemark(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SubmitRemark().click();
        
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SubmitRemark(), 60, 2);
    productMaster_RetailObj.productMaster_Product_FinalSubmit().click();  
    
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 2);
    String message = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
	System.out.println(message);
	productMaster_RetailObj.productMaster_Product_Checker_Id().click();
	String emptystring = "";
	String ar[] = message.split(" ");
	emptystring=ar[ar.length-1];
	String cheID=emptystring.replaceAll("[/.]", "");
	System.out.println(cheID);
	
	jsonReaderWriter=new JsonDataReaderWriter();
	jsonReaderWriter.addData(cheID);
	waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
    productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
	
    }
   
    @Then("^user logout from the application$")
    public void user_logout_from_the_application()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Profile(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Profile().click();  
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Logout(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Logout().click();     
    }

    @Then("^checker user open the record from inbox$")
    public void checker_user_open_the_record_from_inbox() throws IOException, ParseException  {
    	System.out.println("reference Id "+referenceID);
    	String beforeXpath = "//span[contains(text(),'";
    	String afterXpath = "')]/../../td/button";
    	WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+jsonReaderWriter.readReferancedata()+afterXpath));
        
       while(true)
        {
        	try {
        		waithelper.waitForElementToVisibleWithFluentWait(driver, firstRecord, 60, 2);
        		firstRecord.click(); 
        	    break;
        	    }
        	catch(Exception e) { 
        		
        	}
        }
    	
    }
    

    @Then("^checker user approve the record$")
    public void checker_user_approve_the_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Approve(), 60, 2);  
    	productMaster_RetailObj.productMaster_Product_Checker_Approve().click();
    	
   
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ApproveRemark(), 60, 2);  
    	productMaster_RetailObj.productMaster_Product_Checker_ApproveRemark().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ApproveAlert(), 60, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_ApproveAlert().click(); 
  
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 5);
    	String makerId = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
    	System.out.println(makerId);
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    	
    }
   @Then("^checker user return the record$")
    public void checker_user_return_the_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Return(), 60, 2);  
    	productMaster_RetailObj.productMaster_Product_Checker_Return().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ReturnRemark(), 60, 2);  
    	productMaster_RetailObj.productMaster_Product_Checker_ReturnRemark().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_ReturnAlert(), 60, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_ReturnAlert().click(); 
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 5);
    	String makerId = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
    	System.out.println(makerId);
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    	         
    }
    
    
    @Then("^checker user reject the record$")
    public void checker_user_reject_the_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Reject(), 60, 2);  
    	productMaster_RetailObj.productMaster_Product_Checker_Reject().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_RejectRemark(), 60, 2);  
    	productMaster_RetailObj.productMaster_Product_Checker_RejectRemark().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_RejectAlert(), 60, 2);
    	productMaster_RetailObj.productMaster_Product_Checker_RejectAlert().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Checker_Id(), 60, 5);
    	String makerId = productMaster_RetailObj.productMaster_Product_Checker_Id().getText();
    	System.out.println(makerId);
    	productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    
    }

    
    
    //-----------------------search---------------//
    
    @Then("^search approved record$")
    public void search_approved_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.ProductCode);
     
    }

    @Then("^close the search input field$")
    public void close_the_search_input_field()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputFieldClose(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchInputFieldClose().click();   
       
    }
    
    @Then("^search Rejected record$")
    public void search_rejected_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.ProductCodeReject);
        
    }
    
    //---------------view summary----------------//
    @Then("^click on Product Master edit icon$")
    public void click_on_product_master_edit_icon()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.ProductMaster_Product_Edit(), 60, 2);
    productMaster_RetailObj.ProductMaster_Product_Edit().click();   
    }

    @Then("^click on search icon$")
    public void click_on_search_icon()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_Search(), 60, 2);
    productMaster_RetailObj.productMaster_Product_Search().click();     
    }

    @Then("^search the record$")
    public void search_the_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_SearchInputField(), 60, 2);
    productMaster_RetailObj.productMaster_Product_SearchInputField().click();   
    productMaster_RetailObj.productMaster_Product_SearchInputField().sendKeys(productMaster_RetailTestDataType.ProductCodeReturn);
    
    }
    @Then("^open the record$")
    public void open_the_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.ProductMaster_Product_ActionEdit(), 60, 2);
    productMaster_RetailObj.ProductMaster_Product_ActionEdit().click();      
    }

    @Then("^click on view summary$")
    public void click_on_view_summary()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummary(), 60, 2);
    WebElement viewsummary = productMaster_RetailObj.productMaster_Product_ViewSummary(); 
    clicksAndActionHelper.JSEClick(viewsummary);
    }
    

    @Then("^verify the fields of view summary$")
    public void verify_the_fields_of_view_summary()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryUser(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryUser().isDisplayed();  
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryStageCode(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryStageCode().isDisplayed();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryStatus(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryStatus().isDisplayed();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryStartTime(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryStartTime().isDisplayed(); 
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryEndTime(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryEndTime().isDisplayed();
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryRemarks(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryRemarks().isDisplayed(); 
    
    
    }
    @Then("^close the view summary$")
    public void close_the_view_summary()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, productMaster_RetailObj.productMaster_Product_ViewSummaryClose(), 60, 2);
    productMaster_RetailObj.productMaster_Product_ViewSummaryClose().click();    
    
    }
    
    
   
}
