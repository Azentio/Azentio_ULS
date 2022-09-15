package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.ReportMasterObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.ReportMasterTestDataType;

public class ReportMaster extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	ReportMasterObj reportMasterObj = new ReportMasterObj(driver);
	ReportMasterTestDataType reportMasterTestDataType = jsonReader.getReportMasterByName("Maker");
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);


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
		
		while (true) {
			try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchIcon(), 30, 1);
		    	reportMasterObj.reportMaster_SearchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchInputField(), 30, 1);
    reportMasterObj.reportMaster_SearchInputField().sendKeys(reportMasterTestDataType.ReportNameForApproved);
    reportMasterObj.reportMaster_SearchInputField().sendKeys(Keys.ENTER);
    
    while (true) {
		try {
		    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListViewFirstField_ReportName(), 30, 1);
		    String reportName = reportMasterObj.reportMaster_ListViewFirstField_ReportName().getText();
		    Assert.assertEquals(reportMasterTestDataType.ReportNameForApproved, reportName);  
			break;
		} catch (Exception e) {

		}
	}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListView_ViewIcon(), 30, 1);
    reportMasterObj.reportMaster_ListView_ViewIcon().click();
	}
	
	@Then("^search Report Master Reject record from view List$")
    public void search_report_master_reject_record_from_view_list()  {
		while (true) {
			try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchIcon(), 30, 1);
		    	reportMasterObj.reportMaster_SearchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchInputField(), 30, 1);
    reportMasterObj.reportMaster_SearchInputField().sendKeys(reportMasterTestDataType.ReportNameForReject);
    reportMasterObj.reportMaster_SearchInputField().sendKeys(Keys.ENTER);
    
    while (true) {
		try {
		    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListViewFirstField_ReportName(), 30, 1);
		    String reportName = reportMasterObj.reportMaster_ListViewFirstField_ReportName().getText();
		    Assert.assertEquals(reportMasterTestDataType.ReportNameForReject, reportName);  
			break;
		} catch (Exception e) {

		}
	}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListView_ViewIcon(), 30, 1);
    reportMasterObj.reportMaster_ListView_ViewIcon().click();
	   
    }

    @Then("^search Report Master Return record from view List$")
    public void search_report_master_return_record_from_view_list()  {
    	while (true) {
			try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchIcon(), 30, 1);
		    	reportMasterObj.reportMaster_SearchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchInputField(), 30, 1);
    reportMasterObj.reportMaster_SearchInputField().sendKeys(reportMasterTestDataType.ReportNameForReturn);
    reportMasterObj.reportMaster_SearchInputField().sendKeys(Keys.ENTER);
    
    while (true) {
		try {
		    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_ListViewFirstField_ReportName(), 30, 1);
		    String reportName = reportMasterObj.reportMaster_ListViewFirstField_ReportName().getText();
		    Assert.assertEquals(reportMasterTestDataType.ReportNameForReturn, reportName);  
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
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_GroupName(), 30, 1);
    reportMasterObj.reportMaster_GroupName().sendKeys(reportMasterTestDataType.GroupName);
    reportMasterObj.reportMaster_GroupName().sendKeys(Keys.ENTER);  
    }

    @Then("^Enter Group Description$")
    public void enter_group_description() {
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_GroupDescription(), 30, 1);
    reportMasterObj.reportMaster_GroupDescription().sendKeys(reportMasterTestDataType.GroupDescription);
    reportMasterObj.reportMaster_GroupDescription().sendKeys(Keys.ENTER);   
    }

    @Then("^Enter Min Required Parameter$")
    public void enter_min_required_parameter() {
    waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_MinParametersRequired(), 30, 1);
    reportMasterObj.reportMaster_MinParametersRequired().sendKeys(reportMasterTestDataType.MinParametersRequired);
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
    	waithelper.waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportMaster_SearchInputField(), 30, 1);
    	reportMasterObj.reportMaster_SearchInputField().sendKeys(reportMasterTestDataType.EventCode);  
    	Thread.sleep(1000);
     
    }

}
