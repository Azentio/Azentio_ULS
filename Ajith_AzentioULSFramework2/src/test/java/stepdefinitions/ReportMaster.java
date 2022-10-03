package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageobjects.ReportMasterObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.ReportMasterTestData;

public class ReportMaster {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	ReportMasterTestData reportMasterTestData = jsonConfig.getReportMasterByName("Maker");
    ReportMasterObj reportMasterObj = new ReportMasterObj(driver);
    JsonDataReaderWriter json = new JsonDataReaderWriter();
	@When("^user click the configuration menu for Report Master$")
	public void user_click_the_configuration_menu_for_report_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.configurationOptions(),30, 2);
		reportMasterObj.configurationOptions().click();
	}
	@And("^User click the Configuration Manager option$")
    public void user_click_the_configuration_manager_option() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.configManagerOptions(),30, 2);
		reportMasterObj.configManagerOptions().click();
    }
	@And("^User click Approved list icon for Report Master$")
	public void user_click_approved_list_icon_for_report_master() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(reportMasterObj.reportMasterApproveIcon());
		reportMasterObj.reportMasterApproveIcon().click();
	}

	@And("^User click First Edit icon in Approved list view for Report Master$")
	public void user_click_first_edit_icon_in_approved_list_view_for_report_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.firstEditIcon(),30, 2);
		reportMasterObj.firstEditIcon().click();
	}

	@And("^User click and update the Report Name$")
	public void user_click_and_update_the_report_name() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportName(),30, 2);
		reportMasterObj.reportName().click();
		reportMasterObj.reportName().clear();
		System.out.println(reportMasterTestData.ReportName);
		reportMasterObj.reportName().sendKeys(reportMasterTestData.ReportName);
	}

	@And("^User click and update the Report Name2$")
	public void user_click_and_update_the_report_name2() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportName2(),30, 2);
		reportMasterObj.reportName2().click();
		reportMasterObj.reportName2().clear();
		reportMasterObj.reportName2().sendKeys(reportMasterTestData.ReportName2);
	}

	@And("^User click and update the Report Name3$")
	public void user_click_and_update_the_report_name3() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportName3(),30, 2);
		reportMasterObj.reportName3().click();
		reportMasterObj.reportName3().clear();
		reportMasterObj.reportName3().sendKeys(reportMasterTestData.ReportName3);
	}

	@And("^User click and update the Report Description$")
	public void user_click_and_update_the_report_description() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.Reportdescription(),30, 2);
		reportMasterObj.Reportdescription().click();
		reportMasterObj.Reportdescription().clear();
		reportMasterObj.Reportdescription().sendKeys(reportMasterTestData.ReportDescription);
	}

	@And("^User Select and update the Report Type$")
	public void user_select_and_update_the_report_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportType(),30, 2);
		reportMasterObj.reportType().click();
		String xpath ="//ion-label[text()=' CRY ']//following-sibling::ion-radio";
		for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("^User click and update the Report Url$")
	public void user_click_and_update_the_report_url() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportUrl(),30, 2);
		reportMasterObj.reportUrl().click();
		reportMasterObj.reportUrl().clear();
		reportMasterObj.reportUrl().sendKeys(reportMasterTestData.ReportURL);
	}

	@And("^User Select and update the Report Category$")
	public void user_select_and_update_the_report_category() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportCategory(),30, 2);
		reportMasterObj.reportCategory().click();
		String xpath ="//ion-label[text()=' TEMPLATE ']//following-sibling::ion-radio";
		for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("^User Verify the Status button in Report Master$")
	public void user_verify_the_status_button_in_report_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportMasterStatusSwitchButton(),30, 2);
		Assert.assertEquals(true, reportMasterObj.reportMasterStatusSwitchButton().isDisplayed());
	}

	@And("^User click Save button for report master updation$")
	public void user_click_save_button_for_report_master_updation() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.Report_Master_Update(),30, 2);
		reportMasterObj.Report_Master_Update().click();
	}

	@And("^user click inbox to approve record for report master$")
	public void user_click_inbox_to_approve_record_for_report_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.Inbox(),30, 2);
		reportMasterObj.Inbox().click();
	}

	@And("^user search report Master$")
	public void user_search_report_master() throws Throwable {
		for (int i = 0; i <20; i++) {
    		try {
            //seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
    			reportMasterObj.InboxView_Search().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
        	
            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.InboxView_SearchText(),60,2);
            reportMasterObj.InboxView_SearchText().click();
            Thread.sleep(2000);
            reportMasterObj.InboxView_SearchText().sendKeys(reportMasterTestData.SearchReportMaster);
	}

	@And("^user store reference number and click the first record in report master inbox view$")
	public void user_store_reference_number_and_click_the_first_record_in_report_master_inbox_view() throws Throwable {
		String reference = null;
        for (int i = 0; i < 200; i++) {
			try {
			 reference = reportMasterObj.reportMasterReferanceId().getText();
			 break;
			} catch (Exception e) {
				
			}
		}
        
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.firstEditIconInMakerListView(),40, 2);
        reportMasterObj.firstEditIconInMakerListView().click();
        
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40, 2);
        
        json.addReferanceData(reference);
        System.out.println(reference);
	}

    @And("^user submit report master record in maker$")
    public void user_submit_report_master_record_in_maker() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWaitElementToBeClickable(driver, reportMasterObj.reportMasterMaker_Submit(), 60, 2);
    	reportMasterObj.reportMasterMaker_Submit().click();
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportMasterMaker_EnterRemark(),30,2);
        reportMasterObj.reportMasterMaker_EnterRemark().click();
        reportMasterObj.reportMasterMaker_EnterRemark().sendKeys("ok");
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportMasterMaker_Submit(),30, 2);
        reportMasterObj.reportMasterMaker_Submit().click();
    }
}

