package stepdefinitions;

import java.io.IOException;
import java.util.Map;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ReportMasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.ReportMasterTestDataType;

public class ReportMasterULSP extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	ReportMasterObj reportMasterObj = new ReportMasterObj(driver);
	//ReportMasterTestDataType reportMasterTestDataType = jsonReader.getReportMasterByName("Maker");
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx",
			"ReportMasterTestData", "Data Set ID");
	Map<String, String> testData;


    @Then("^click on Config Manager$")
    public void click_on_config_manager() {
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ConfigManager(), 30, 1);
    reportMasterObj.reportMaster_ConfigManager().click(); 
    }

	@Then("^click on Report Master Checkbox$")
	public void click_on_report_master_checkbox() {
	javascripthelper.scrollToElemet(waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_CheckBOX(), 30, 1));
	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_CheckBOX(), 30, 1);
	reportMasterObj.reportMaster_CheckBOX().click();
	}
	
	@Then("^search Report Master record from view List$")
    public void search_report_master_record_from_view_list()  {
		testData = excelData.getTestdata("AT-RA-025_D1");
		while (true) {
			try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchIcon(), 30, 1);
		    	reportMasterObj.reportMaster_SearchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchInputField(), 30, 1);
    reportMasterObj.reportMaster_SearchInputField().sendKeys(testData.get("ReportNameForApproved"));
    reportMasterObj.reportMaster_SearchInputField().sendKeys(Keys.ENTER);
    
    while (true) {
		try {
		    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListViewFirstField_ReportName(), 30, 1);
		    String reportName = reportMasterObj.reportMaster_ListViewFirstField_ReportName().getText();
		    Assert.assertEquals(testData.get("ReportNameForApproved"), reportName);  
			break;
		} catch (Exception e) {

		}
	}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListView_ViewIcon(), 30, 1);
    reportMasterObj.reportMaster_ListView_ViewIcon().click();
	}
	
	@Then("^search Report Master Reject record from view List$")
    public void search_report_master_reject_record_from_view_list()  {
		testData = excelData.getTestdata("AT-RA-026_D1");
		while (true) {
			try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchIcon(), 30, 1);
		    	reportMasterObj.reportMaster_SearchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchInputField(), 30, 1);
    reportMasterObj.reportMaster_SearchInputField().sendKeys(testData.get("ReportNameForReject"));
    reportMasterObj.reportMaster_SearchInputField().sendKeys(Keys.ENTER);
    
    while (true) {
		try {
		    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListViewFirstField_ReportName(), 30, 1);
		    String reportName = reportMasterObj.reportMaster_ListViewFirstField_ReportName().getText();
		    Assert.assertEquals(testData.get("ReportNameForReject"), reportName);  
			break;
		} catch (Exception e) {

		}
	}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListView_ViewIcon(), 30, 1);
    reportMasterObj.reportMaster_ListView_ViewIcon().click();
	   
    }

    @Then("^search Report Master Return record from view List$")
    public void search_report_master_return_record_from_view_list()  {
    	testData = excelData.getTestdata("AT-RA-024_D1");
    	while (true) {
			try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchIcon(), 30, 1);
		    	reportMasterObj.reportMaster_SearchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchInputField(), 30, 1);
    reportMasterObj.reportMaster_SearchInputField().sendKeys(testData.get("ReportNameForReturn"));
    reportMasterObj.reportMaster_SearchInputField().sendKeys(Keys.ENTER);
    
    while (true) {
		try {
		    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListViewFirstField_ReportName(), 30, 1);
		    String reportName = reportMasterObj.reportMaster_ListViewFirstField_ReportName().getText();
		    Assert.assertEquals(testData.get("ReportNameForReturn"), reportName);  
			break;
		} catch (Exception e) {

		}
	}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListView_ViewIcon(), 30, 1);
    reportMasterObj.reportMaster_ListView_ViewIcon().click();
	    
    }
	
	@Then("^click on Report Group Master segment button$")
    public void click_on_report_group_master_segment_button() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ReportGroupMasterSegmentButton(), 30, 1);
	    reportMasterObj.reportMaster_ReportGroupMasterSegmentButton().click();   
    }

    @Then("^click on Report Master AddButton$")
    public void click_on_report_master_addbutton() {
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_addButton(), 30, 1);
    reportMasterObj.reportMaster_addButton().click();   
    }

    @Then("^click on Report Parameter Details AddButton$")
    public void click_on_report_parameter_details_addbutton() {
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_addButton2(), 30, 1);
    reportMasterObj.reportMaster_addButton2().click();      
    }

    @Then("^click on Report Group Master$")
    public void click_on_report_group_master() {
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ReportGroupMasterSegmentButton(), 30, 1);
    reportMasterObj.reportMaster_ReportGroupMasterSegmentButton().click();    
    }

    @Then("^click on Report Group Master AddButton$")
    public void click_on_report_group_master_addbutton() {
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_addButton(), 30, 1);
     reportMasterObj.reportMaster_addButton().click();     
    }

    @Then("^Enter Group Name$")
    public void enter_group_name() {
    testData = excelData.getTestdata("AT-RA-025_D1");
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_GroupName(), 30, 1);
    reportMasterObj.reportMaster_GroupName().sendKeys(testData.get("GroupName"));
    reportMasterObj.reportMaster_GroupName().sendKeys(Keys.ENTER);  
    }

    @Then("^Enter Group Description$")
    public void enter_group_description() {
    testData = excelData.getTestdata("AT-RA-025_D1");
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_GroupDescription(), 30, 1);
    reportMasterObj.reportMaster_GroupDescription().sendKeys(testData.get("GroupDescription"));
    reportMasterObj.reportMaster_GroupDescription().sendKeys(Keys.ENTER);   
    }

    @Then("^Enter Min Required Parameter$")
    public void enter_min_required_parameter() {
    testData = excelData.getTestdata("AT-RA-025_D1");
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_MinParametersRequired(), 30, 1);
    reportMasterObj.reportMaster_MinParametersRequired().sendKeys(testData.get("MinParametersRequired"));
    reportMasterObj.reportMaster_MinParametersRequired().sendKeys(Keys.ENTER);  
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_Picklist(), 30, 1);
    reportMasterObj.reportMaster_Picklist().click();
   
    }

    @Then("^save Report Group Master Record$")
    public void save_report_group_master_record() {
		while (true) {
			try {
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SaveButton(), 30, 1);
    reportMasterObj.reportMaster_SaveButton().click();
	break;
} catch (Exception e) {
}
}
}
    @Then("^search Report Group Master record$")
    public void search_report_group_master_record() throws InterruptedException  {
    	testData = excelData.getTestdata("AT-RA-025_D1");
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchInputField(), 30, 1);
    	reportMasterObj.reportMaster_SearchInputField().sendKeys(testData.get("EventCode"));  
    	Thread.sleep(1000);
     
    }
    @Then("^validate Success pop up$")
    public void validate_success_pop_up()  {
    	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.productMaster_Product_SaveConfirmationMessage());
    	reportMasterObj.productMaster_Product_SaveConfirmationMessage().isDisplayed();
    	reportMasterObj.productMaster_Product_SaveConfirmationMessageCloseButton().isDisplayed();
    	reportMasterObj.productMaster_Product_SaveConfirmationMessageCloseButton().click();
    	System.out.println("System should display the confirmation message");
   
    }
    @Then("^click on inbox$")
    public void click_on_inbox()  {
    //Inbox
    
    while(true) {
    	try{
    	    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Inbox(), 60, 2);
    	    reportMasterObj.productMaster_Product_Inbox().click(); 
    		break;
    	 }
    		catch(Exception e){}
    	}
    }
    @Then("^click on inbox search icon$")
    public void click_on_inbox_search_icon()  {
    	testData = excelData.getTestdata("AT-RA-025_D1");
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.IncentiveMaster_Inbox_SearchIcon(), 30, 1);
    	reportMasterObj.IncentiveMaster_Inbox_SearchIcon().click();     
    }
    @And("^maker user open the record from inbox$")
    public void maker_user_open_the_record_from_inbox() throws IOException, ParseException, InterruptedException  {
    	testData = excelData.getTestdata("AT-RA-025_D1");
    	Thread.sleep(2000);  
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_ReferanceId(), 30, 2);
    String referenceID = reportMasterObj.productMaster_Product_ReferanceId().getText();
    //jsonReaderWriter.addReferanceData(referenceID);
    //System.out.println("reference Id " +referenceID);
    excelData.updateTestData("AT-RA-025_D1","Reference ID",referenceID);
    
    
	String beforeXpath = "//span[contains(text(),'";
	String afterXpath = "')]/../../td/button";
	
    WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+testData.get("Reference ID")+afterXpath));
    
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
    testData = excelData.getTestdata("AT-RA-012_D1");
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Submit(), 60, 2);
    reportMasterObj.productMaster_Product_Submit().click();
        
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_SubmitRemark(), 60, 2);
    reportMasterObj.productMaster_Product_SubmitRemark().click();
        
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_SubmitRemark(), 60, 2);
    reportMasterObj.productMaster_Product_FinalSubmit().click();  
    
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_Id(), 60, 2);
    String message = reportMasterObj.productMaster_Product_Checker_Id().getText();
	System.out.println(message);
	reportMasterObj.productMaster_Product_Checker_Id().click();
	String emptystring = "";
	String ar[] = message.split(" ");
	emptystring=ar[ar.length-1];
	String cheID=emptystring.replaceAll("[/.]", "");
	System.out.println(cheID);
	excelData.updateTestData("AT-RA-012_D1","Checker id",cheID);
	//jsonReaderWriter=new JsonDataReaderWriter();
	//jsonReaderWriter.addData(cheID);
	waithelper.waitForElementwithFluentwait(driver, reportMasterObj.productMaster_Product_ConfirmationMessageCloseButton());
	reportMasterObj.productMaster_Product_ConfirmationMessageCloseButton().click();
	
    }
    @Then("^user logout from the application$")
    public void user_logout_from_the_application()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Profile(), 60, 2);
    reportMasterObj.productMaster_Product_Profile().click();  
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Logout(), 60, 2);
    reportMasterObj.productMaster_Product_Logout().click();     
    }
    @Then("^checker user open the record from inbox$")
    public void checker_user_open_the_record_from_inbox() throws IOException, ParseException  {
    	
    	testData = excelData.getTestdata("AT-RA-025_D1");
    	//System.out.println("reference Id "+referenceID);
    	String beforeXpath = "//span[contains(text(),'";
    	String afterXpath = "')]/../../td/button";
    	WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+testData.get("Reference ID")+afterXpath));
        
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
    @Then("^checker user reject the record$")
    public void checker_user_reject_the_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_Reject(), 60, 2);  
    	reportMasterObj.productMaster_Product_Checker_Reject().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_RejectRemark(), 60, 2);  
    	reportMasterObj.productMaster_Product_Checker_RejectRemark().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_RejectAlert(), 60, 2);
    	reportMasterObj.productMaster_Product_Checker_RejectAlert().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_Id(), 60, 5);
    	String makerId = reportMasterObj.productMaster_Product_Checker_Id().getText();
    	System.out.println(makerId);
    	reportMasterObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    
    }
    @Then("^checker user return the record$")
    public void checker_user_return_the_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_Return(), 60, 2);  
    	reportMasterObj.productMaster_Product_Checker_Return().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_ReturnRemark(), 60, 2);  
    	reportMasterObj.productMaster_Product_Checker_ReturnRemark().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_ReturnAlert(), 60, 2);
    	reportMasterObj.productMaster_Product_Checker_ReturnAlert().click(); 
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_Id(), 60, 5);
    	String makerId = reportMasterObj.productMaster_Product_Checker_Id().getText();
    	System.out.println(makerId);
    	reportMasterObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    	         
    }
    @Then("^checker user approve the record$")
    public void checker_user_approve_the_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_Approve(), 60, 2);  
    	reportMasterObj.productMaster_Product_Checker_Approve().click();
    	
   
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_ApproveRemark(), 60, 2);  
    	reportMasterObj.productMaster_Product_Checker_ApproveRemark().click();
    	
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_ApproveAlert(), 60, 2);
    	reportMasterObj.productMaster_Product_Checker_ApproveAlert().click(); 
  
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.productMaster_Product_Checker_Id(), 60, 5);
    	String makerId = reportMasterObj.productMaster_Product_Checker_Id().getText();
    	System.out.println(makerId);
    	reportMasterObj.productMaster_Product_ConfirmationMessageCloseButton().click();
    	
    }


  

}