package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.ULS_LoModuleWaiverObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class MDM_LoWaiverModule extends BaseClass {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	ULS_LoModuleWaiverObj waiverObj = new ULS_LoModuleWaiverObj(driver);
	
    @And("^user verify the values should be non editable$")
    public void user_verify_the_values_should_be_non_editable() throws Throwable {
        
			try {
				driver.findElement(By.xpath("//tbody/tr[1]/td[3]/p-celleditor[1]")).sendKeys("0");
				
			} catch (Exception e) {
				System.out.println("This list view record can't able to edit");
			}
		
    }

    @And("^user verify the functionality of View in process records button$")
    public void user_verify_the_functionality_of_view_in_process_records_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, waiverObj.LoModuleWaiver_ViewSummary(), 60, 2);
    	Assert.assertTrue(waiverObj.LoModuleWaiver_ViewSummary().isDisplayed());    	
    	waiverObj.LoModuleWaiver_ViewSummary().click();
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, waiverObj.workflow_status(), 60, 2);
    	String text = waiverObj.workflow_status().getText();
    	System.out.println("The Workflow status is" +text);
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, waiverObj.workflow_Close(), 60, 2);
    	waiverObj.workflow_Close().click();    	
    	
    }

    @And("^user verify the functionality of Search box with Matching data$")
    public void user_verify_the_functionality_of_search_box_with_matching_data() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, waiverObj.SearchText(), 60, 2);
    	waiverObj.SearchText().click();    	
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, waiverObj.Search_Input(), 60, 2);
    	waiverObj.Search_Input().click();
    	waiverObj.Search_Input().sendKeys("123");
    	Thread.sleep(1000);
    }

    @And("^user verify the functionality of Search box with Mismatching data$")
    public void user_verify_the_functionality_of_search_box_with_mismatching_data() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, waiverObj.SearchText_Close(), 60, 2);
    	waiverObj.SearchText_Close().click();
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, waiverObj.SearchText(), 60, 2);
    	waiverObj.SearchText().click();
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, waiverObj.Search_Input(), 60, 2);
    	waiverObj.Search_Input().click();
    	waiverObj.Search_Input().sendKeys("sagf");
    }

    @And("^user verify the functionality of Export to PDF file$")
    public void user_verify_the_functionality_of_export_to_pdf_file() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			waiverObj.exportIcon().click();
    			break;
    		} catch (Exception e) {

    		}
    	}
    	waiverObj.pdfOption().click();
    	browserHelper.switchToParentWindow();
    	browserHelper.switchToParentWithChildClose();
    	
    }

    @And("^user verify the functionality of Export to Excel file$")
    public void user_verify_the_functionality_of_export_to_excel_file() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			waiverObj.exportIcon().click();
    			break;
    		} catch (Exception e) {

    		}
    	}
    	waiverObj.xlsOption().click();
    	Thread.sleep(1000);
    }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
