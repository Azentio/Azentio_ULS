package stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.LOWaiverObject;
import pageobjects.ReportMaster_Obj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;

public class LO_Waiver {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	LOWaiverObject lowaiver =new LOWaiverObject(driver);
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot mandateOrNot = new FindFieldisMandatoryorNot(driver);
	String Toast;
	List<String> xlsList = new ArrayList<>();
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00073\\Downloads\\UlsTestDataDesign.xlsx","LOWaiver","Data Set ID");
	Map<String, String> testData;
	
	@Then("^choose the data set id for for list view validation in report master$")
    public void choose_the_data_set_id_for_for_list_view_validation_in_report_master() throws Throwable {
    
	}

    @Then("^Verify the values in the list view is notl editable in LO waiver$")
    public void verify_the_values_in_the_list_view_is_notl_editable_in_lo_waiver() throws Throwable {
    	String xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]";
		// action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (NoSuchElementException e) {
			System.out.println("Verified status field is not editable only displayable");
		}
    }

    @Then("^To verify the functionality of Search box with matching data in LO waiver$")
    public void to_verify_the_functionality_of_search_box_with_matching_data_in_lo_waiver() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, lowaiver.LoWaiver_ListViewSearch(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				lowaiver.LoWaiver_ListViewSearch().click();
				break;
			} catch (Exception e) {

			}
		}
Thread.sleep(2000);
lowaiver.LOWaiver_ListViewSearchText().click();
lowaiver.LOWaiver_ListViewSearchText().sendKeys(testData.get("Matcheddata"));
		Assert.assertEquals(lowaiver.LOWaiver_ListViewSearchText().isDisplayed(), true);
    }

    @Then("^To verify the functionality of Export to PDF button in LO waiver$")
    public void to_verify_the_functionality_of_export_to_pdf_button_in_lo_waiver() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			lowaiver.exportIcon().click();
    			break;
    		} catch (Exception e) {

    		}
    	}

    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, lowaiver.exportToPDF(), 60, 3);
    	lowaiver.exportToPDF().click();
    	// seleniumactions.getBrowserHelper().SwitchToWindow(1);
    	String UserDirectory = System.getProperty("user.dir");
    	System.out.println(UserDirectory);
    	String substring = UserDirectory.substring(0, 21) + "Downloads";
    	substring.replaceAll("/", "//");
    	System.out.println(substring);
    	File file = new File(substring);
    	File[] totalfiles = file.listFiles();
    	int length = totalfiles.length;
    	int i = 0;
    	for (File fileName : totalfiles) {
    		if (fileName.getName().equalsIgnoreCase("ReportMasterFormDataFile.pdf")) {
    			System.out.println("Downloaded file present in system");
    			break;
    		} else if (i == length - 1) {
    			System.out.println("Downloaded file present does not exist in system");
    		}

    	}
    	action.getBrowserHelper().switchToParentWithChildClose();
    }
    

    @And("^Click the Eye icon of LO waiver$")
    public void click_the_eye_icon_of_lo_waiver() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, lowaiver.loModuleWaiverViewButton(), 60, 2);
    	lowaiver.loModuleWaiverViewButton().click();
    }

    @And("^To verify the functionality of Add button in Lo waiver$")
    public void to_verify_the_functionality_of_add_button_in_lo_waiver() throws Throwable {
    }

    @And("^To verify the functionality of Search box with mismatch data in LO waiver$")
    public void to_verify_the_functionality_of_search_box_with_mismatch_data_in_lo_waiver() throws Throwable {
    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				lowaiver.LoWaiver_ListViewSearch().click();
				break;
			} catch (Exception e) {

			}
		}
		lowaiver.LoWaiver_ListViewSearch().click();
		lowaiver.LoWaiver_ListViewSearch().sendKeys(testData.get("UnMatcheddata"));
		Thread.sleep(1000);
		String xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]";
		for (int i = 0; i < 200; i++) {
			try {
				action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				// "Showing 0 to 0 of 0 entries"
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    }

    @And("^To verify the functionality of Export to Excel button LO waiver$")
    public void to_verify_the_functionality_of_export_to_excel_button_lo_waiver() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			lowaiver.exportIcon().click();
    			break;
    		} catch (Exception e) {

    		}
    	}
    	        action.getClickAndActionsHelper().moveToElement(lowaiver.exportToExcel());
    	        lowaiver.exportToExcel().click();
    Thread.sleep(2000);
    	
    	
    	String UserDirectory = System.getProperty("user.dir");
        //System.out.println(UserDirectory);
        String substring = UserDirectory.substring(0, 21) + "Downloads";
        substring.replaceAll("/", "//");
        System.out.println(substring);
        File file = new File(substring);
        File[] totalfiles = file.listFiles();
        for (File fileName : totalfiles) {
            System.out.println("File name" + fileName);
            xlsList.add(fileName.toString());
        }
    }

}
