package stepdefinitions;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.UnderWritter_Offset_ControlObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.CollateralTestDataType;

public class UnderWritter_Offset_Control extends BaseClass {
	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	UnderWritter_Offset_ControlObj underWritter_Offset_ControlObj = new UnderWritter_Offset_ControlObj(driver);
	CollateralTestDataType collateralTestDataType = jsonReader.getCollateralByName("Maker");
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	@Then("^click on the Business Rule$")
    public void click_on_the_business_rule()  {
	waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.Business_Rules() , 30, 1);
	underWritter_Offset_ControlObj.Business_Rules().click();   
    }

    @Then("^click on the UnderWritter Offset Control eye icon$")
    public void click_on_the_underwritter_offset_control_eye_icon()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_EyeIcon() , 30, 1);
    underWritter_Offset_ControlObj.UnderWritter_Offset_Control_EyeIcon().click(); 
    }

    @Then("^Modify the UnderWritter Offset Control approved record$")
    public void modify_the_underwritter_offset_control_approved_record() throws InterruptedException  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.ViewList_SearchIcon(), 60, 2);  
    underWritter_Offset_ControlObj.ViewList_SearchIcon().click();
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.UnderWritter_Offset_Control_InboxSearchInput(), 60, 2);  
    underWritter_Offset_ControlObj.UnderWritter_Offset_Control_InboxSearchInput().sendKeys(collateralTestDataType.MinimumValue);
    Thread.sleep(1000);	
    waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_ActionEdit() , 30, 1);
    underWritter_Offset_ControlObj.UnderWritter_Offset_Control_ActionEdit().click();  
    
     while(true) {
    	try {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_MinimumValue() , 30, 1);
    	clicksAndActionHelper.doubleClick(underWritter_Offset_ControlObj.UnderWritter_Offset_Control_MinimumValue());
    	   // underWritter_Offset_ControlObj.UnderWritter_Offset_Control_MinimumValue().sendKeys(Keys.BACK_SPACE);  
    	    underWritter_Offset_ControlObj.UnderWritter_Offset_Control_MinimumValue().sendKeys(collateralTestDataType.MinimumValueModify);
    	    underWritter_Offset_ControlObj.UnderWritter_Offset_Control_MinimumValue().sendKeys(Keys.ENTER);
    		break;
    	}
    	catch(Exception e) {}
    }
    
    
    }

    @Then("^save the record$")
    public void save_the_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_SaveButton() , 30, 1);
    underWritter_Offset_ControlObj.UnderWritter_Offset_Control_SaveButton().click(); 
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_SaveConfirmationMessage() , 30, 1);
    underWritter_Offset_ControlObj.UnderWritter_Offset_Control_SaveConfirmationMessage().isDisplayed();
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_SaveConfirmationMessageCloseButton() , 30, 1);
    underWritter_Offset_ControlObj.UnderWritter_Offset_Control_SaveConfirmationMessageCloseButton().click();
         
    }

    @Then("^click on the inbox$")
    public void click_on_the_inbox()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_Inbox() , 30, 1);
    underWritter_Offset_ControlObj.UnderWritter_Offset_Control_Inbox().click();
          
    }
    @And("^search UnderWritter Offset Control record from inbox$")
    public void search_underwritter_offset_control_record_from_inbox()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_InboxSearch() , 30, 1);
        underWritter_Offset_ControlObj.UnderWritter_Offset_Control_InboxSearch().click();
        
        waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_InboxSearchInput() , 30, 1);
        underWritter_Offset_ControlObj.UnderWritter_Offset_Control_InboxSearchInput().sendKeys(collateralTestDataType.EvtCode);
            
    }

    @Then("^maker user open the UnderWritter record from inbox$")
    public void maker_user_open_the_underwritter_record_from_inbox() throws IOException, ParseException  {
    	 waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.UnderWritter_Offset_Control_ReferanceId(), 60, 2);
    	    referenceID = underWritter_Offset_ControlObj.UnderWritter_Offset_Control_ReferanceId().getText();
    	    jsonDataReaderWriter.addReferanceData(referenceID);
    	    System.out.println("reference Id " +referenceID);
    	    
    	    
    		String beforeXpath = "//span[contains(text(),'";
    		String afterXpath = "')]/../../td/button";
    		
    	    WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+jsonDataReaderWriter.readReferancedata()+afterXpath));
    	    
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

    @And("^maker user submit the UnderWritter record$")
    public void maker_user_submit_the_underwritter_record() throws IOException  {
    	 
        waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_Submit() , 30, 1);
        underWritter_Offset_ControlObj.UnderWritter_Offset_Control_Submit().click();
        
        
        waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_SubmitRemark() , 30, 1);
        underWritter_Offset_ControlObj.UnderWritter_Offset_Control_SubmitRemark().click();
      
        
        waithelper.waitForElementToVisibleWithFluentWait(driver,underWritter_Offset_ControlObj.UnderWritter_Offset_Control_FinalSubmit() , 30, 1);
        underWritter_Offset_ControlObj.UnderWritter_Offset_Control_FinalSubmit().click();
        
        waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.UnderWritter_Offset_Control_Checker_Id(), 60, 2);
        String message = underWritter_Offset_ControlObj.UnderWritter_Offset_Control_Checker_Id().getText();
    	System.out.println(message);
    	underWritter_Offset_ControlObj.UnderWritter_Offset_Control_Checker_Id().click();
    	String emptystring = "";
    	String ar[] = message.split(" ");
    	emptystring=ar[ar.length-1];
    	String cheID=emptystring.replaceAll("[/.]", "");
    	System.out.println(cheID);
    	
    	jsonDataReaderWriter=new JsonDataReaderWriter();
    	jsonDataReaderWriter.addData(cheID);
    	waithelper.waitForElementwithFluentwait(driver, underWritter_Offset_ControlObj.UnderWritter_Offset_Control_ConfirmationMessageCloseButton());
        underWritter_Offset_ControlObj.UnderWritter_Offset_Control_ConfirmationMessageCloseButton().click();
        
    }
    
    @Then("^checker open the record from inbox$")
    public void checker_open_the_record_from_inbox() throws IOException, ParseException  {
    	System.out.println("reference Id "+referenceID);
    	String beforeXpath = "//span[contains(text(),'";
    	String afterXpath = "')]/../../td/button";
    	WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+jsonDataReaderWriter.readReferancedata()+afterXpath));
        
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

    @Then("^checker approve the record$")
    public void checker_approve_the_record() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.Checker_Approve(), 60, 2);  
    	underWritter_Offset_ControlObj.Checker_Approve().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.Checker_ApproveRemark(), 60, 2); 
    	underWritter_Offset_ControlObj.Checker_ApproveRemark().click();
    	
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.Checker_ApproveAlert(), 60, 2);  
    	underWritter_Offset_ControlObj.Checker_ApproveAlert().click();
    	
  
    	waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.UnderWritter_Offset_Control_Checker_Id(), 60, 5);
    	String makerId = underWritter_Offset_ControlObj.UnderWritter_Offset_Control_Checker_Id().getText();
    	System.out.println(makerId);
    	underWritter_Offset_ControlObj.UnderWritter_Offset_Control_ConfirmationMessageCloseButton().click();   
    }
    
    @Then("^Validate the aapproved record$")
    public void validate_the_aapproved_record()   {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.ViewList_SearchIcon(), 60, 2);  
    	underWritter_Offset_ControlObj.ViewList_SearchIcon().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.UnderWritter_Offset_Control_InboxSearchInput(), 60, 2);  
    	underWritter_Offset_ControlObj.UnderWritter_Offset_Control_InboxSearchInput().sendKeys(collateralTestDataType.MinimumValueModify);
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, underWritter_Offset_ControlObj.UnderWritter_Offset_Control_ActionEdit(), 60, 2);  
    	underWritter_Offset_ControlObj.UnderWritter_Offset_Control_ActionEdit().isDisplayed();
    }
    
     
}
