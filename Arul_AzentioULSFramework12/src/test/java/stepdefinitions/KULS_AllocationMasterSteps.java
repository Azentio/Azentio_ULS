package stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.AllocationMasterObject;
import resources.BaseClass;
import resources.ExcelData;
import testDataType.KULS_Login_TestDataType;

public class KULS_AllocationMasterSteps {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	AllocationMasterObject allocationMstObj = new AllocationMasterObject(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);
	String Toast;
	List<String> xlsList = new ArrayList<>();
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign2511.xlsx", "AllocationMasterTestData", "Data Set ID") ;
	Map<String, String> testdata;

	 @Given("^Navigate the URl and login as a maker$")
	    public void navigate_the_url_and_login_as_a_maker() throws Throwable {
		 ExcelData excelData = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign2511.xlsx","Logincredentials","Stage");
	        Map<String, String> testdata = excelData.getTestdata("Maker1");
	    	String kulsApplicationUrl = configFileRead.getApplicationcenbankUrl();
	        driver.get(kulsApplicationUrl);
	        login.loginUlsApplicationAsMaker(testdata.get("Username"),testdata.get("Password"));
	 }
	 @Then("^select the LOS$")
	    public void select_the_los() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.ModuleName(), 60, 2);
			allocationMstObj.ModuleName().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.LOS(), 60, 2);
			allocationMstObj.LOS().click();
	    }

	@And("^Click the configuration$")
	public void click_the_configuration() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_Configuration(), 60, 2);
		allocationMstObj.AllocationMaster_Configuration().click();
	}
	 @Then("^Click the config Manager$")
	    public void click_the_config_manager() throws Throwable {
	 	  // action.getJavascriptHelper().scrollIntoView(feeMstObj.ConfigManager());
		
	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  allocationMstObj.ConfigManager(), 30, 5);
	  for (int i = 0; i <25; i++) {
		  try {
			  
			  allocationMstObj.ConfigManager().click();
	   break;
	    }
		  catch(StaleElementReferenceException e) {
		  }
		  }
	  }
	 
	 @And("^Click the temp view of the alloction master$")
	 public void click_the_temp_view_of_the_alloction_master() throws Throwable {
	 	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_TempViewButton(), 60, 2);
	 	allocationMstObj.AllocationMaster_TempViewButton().click();
	 }
	 @And("^Verify the functionality of add button in allocation master$")
	 public void verify_the_functionality_of_add_button_in_allocation_master() throws Throwable {
	   waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_AddButton(), 60, 2);
	 	Assert.assertEquals(allocationMstObj.AllocationMaster_AddButton().isDisplayed(), true);
	 }
	 @Then("^Verify the values in the list view is not editable in allocation master$")
	 public void verify_the_values_in_the_list_view_is_not_editable_in_allocation_master() throws Throwable {
	 	String xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]";
	 	// action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
	 	try {
	 		driver.findElement(By.xpath(xpath)).click();
	 	} catch (NoSuchElementException e) {
	 		System.out.println("Verified status field is not editable only displayable");
	 	}
	 	

	 }
	 @Then("^To verify the functionality of Search box with matching data in alloction master list view$")
	 public void to_verify_the_functionality_of_search_box_with_matching_data_in_alloction_master_list_view() throws Throwable {
	 	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_ListViewSearch(), 60, 2);
	 	for (int i = 0; i < 20; i++) {
	 		try {
	 			allocationMstObj.AllocationMaster_ListViewSearch().click();
	 			break;
	 		} catch (Exception e) {

	 		}
	 	}

	 	allocationMstObj.AllocationMaster_ListViewSearchText().click();
	 	allocationMstObj.AllocationMaster_ListViewSearchText().sendKeys(testdata.get("Search with valid"));
	 	Assert.assertEquals(allocationMstObj.AllocationMaster_ListViewSearchText().isDisplayed(), true);
	 }
	 @And("^To verify the functionality of Search box with mismatch data in allocation master in list view$")
	 public void to_verify_the_functionality_of_search_box_with_mismatch_data_in_allocation_master_in_list_view() throws Throwable {
	 	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

	 	for (int i = 0; i < 20; i++) {
	 		try {
	 			allocationMstObj.AllocationMaster_ListViewSearch().click();
	 			break;
	 		} catch (Exception e) {

	 		}
	 	}
	 	allocationMstObj.AllocationMaster_ListViewSearchText().click();
	 	allocationMstObj.AllocationMaster_ListViewSearchText().sendKeys(testdata.get("Search with Invalid"));
	 	Thread.sleep(1000);
	 	String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
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
	 @Then("^To verify the functionality of Export to PDF button in allocation master in list view$")
	 public void to_verify_the_functionality_of_export_to_pdf_button_in_allocation_master_in_list_view() throws Throwable {
	 	for (int i = 0; i < 20; i++) {
	 		try {
	 			allocationMstObj.exportIcon().click();
	 			break;
	 		} catch (Exception e) {

	 		}
	 	}

	 	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, allocationMstObj.exportToPDF(), 60, 3);
	 	allocationMstObj.exportToPDF().click();
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
	 		if (fileName.getName().equalsIgnoreCase("AllocationMasterFormDataFile.pdf")) {
	 			System.out.println("Downloaded file present in system");
	 			break;
	 		} else if (i == length - 1) {
	 			System.out.println("Downloaded file present does not exist in system");
	 		}

	 	}
	 	action.getBrowserHelper().switchToParentWithChildClose();
	 }
	 @And("^To verify the functionality of Export to Excel button in allocation master list view$")
	 public void to_verify_the_functionality_of_export_to_excel_button_in_allocation_master_list_view() throws Throwable {
	 	for (int i = 0; i < 20; i++) {
	 		try {
	 			allocationMstObj.exportIcon().click();
	 			break;
	 		} catch (Exception e) {

	 		}
	 	}
	 	        action.getClickAndActionsHelper().moveToElement(allocationMstObj.exportToExcel());
	 			allocationMstObj.exportToExcel().click();
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
	    // int size = xlsList.size();
	     //String string = xlsList.get(size - 1);
	    // boolean status = string.contains(AllocationMasterFormData.FileNameForXlsFile);
	 }
	 @And("^Update test data for Allocation master test case no fifteen$")
	    public void update_test_data_for_allocation_master_test_case_no_fifteen() throws Throwable {
		 testdata=exceldata.getTestdata("AT-ALM-015_D1");
	    }

}
