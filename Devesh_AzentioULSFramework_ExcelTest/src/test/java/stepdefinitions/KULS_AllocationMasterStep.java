package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.AllocationMasterOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class KULS_AllocationMasterStep extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
//	BounceMasterTestDataType Bouncejson = jsonConfig.getBounceMasterListByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	AllocationMasterOBJ Allocation = new AllocationMasterOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","AllocationMasterTestData","Data Set ID");
	Map<String, String> testData;
	String reference_id;
	String dataSetID;
	
	
	@Then("^user should navigate to Allocation master$")
    public void user_should_navigate_to_allocation_master() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, Allocation.allocationMaster_MenuToggle(), 60, 5);
		Allocation.allocationMaster_MenuToggle().click();
		help.waitForElementToVisibleWithFluentWait(driver, Allocation.allocationMaster_Configuration(), 60, 5);
		Allocation.allocationMaster_Configuration().click();
		help.waitForElementToVisibleWithFluentWait(driver, Allocation.ConfigManager(), 60, 5);
		Allocation.ConfigManager().click();
    }
	
	@And("^User click the Allocation Master ListView icon in Allocation Master$")
    public void user_click_the_allocation_master_listview_icon_in_allocation_master() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, Allocation.AllocationMasterListViewIcon(), 60, 5);
		Allocation.AllocationMasterListViewIcon().click();
		
    }
	@And("^User Update the Allocation Code in Allocation Master validation$")
    public void user_update_the_allocation_code_in_allocation_master_validation() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, Allocation.AllocationCode(), 60, 5);
		Allocation.AllocationCode().click();
		for(int i=0; i<20; i++) {
			Allocation.AllocationCode().sendKeys(Keys.BACK_SPACE);
		}
    }

    @And("^User click the Allocation Master Action edit icon in Allocation Master$")
    public void user_click_the_allocation_master_action_edit_icon_in_allocation_master() throws Throwable {
    	Thread.sleep(2000);
    	//help.waitForElementToVisibleWithFluentWait(driver, Allocation.ActionEditIcon(), 60, 5);
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Allocation.ActionEditIcon(), 60, 5);
		Allocation.ActionEditIcon().click();
        
    }

    @And("^User Update the Allocation Code in Allocation Master$")
    public void user_update_the_allocation_code_in_allocation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Allocation.AllocationCode(), 60, 5);
		Allocation.AllocationCode().click();
		Allocation.AllocationCode().clear();
		Allocation.AllocationCode().sendKeys(testData.get("Modify Allocation Code"));
        
    }
    
    @And("^User click the save icon in Allocation master$")
    public void user_click_the_save_icon_in_allocation_master() throws Throwable {
    	help.waitForElementToVisibleWithFluentWait(driver, Allocation.UpdateSave(), 60, 5);
    	Allocation.UpdateSave().click();
    }

    @And("^User get the save confirmation message$")
    public void user_get_the_save_confirmation_message() throws Throwable {
    	
    	for (int i = 0; i < 20; i++) {
			try {
				//Assert.assertEquals(Allocation.makerconfirmmsg().isDisplayed(), true);
				System.out.println(Allocation.makerconfirmmsg().getText());
				break;
			} catch (NoSuchElementException e) {

			}
		}
    	help.waitForElementToVisibleWithFluentWait(driver, Allocation.successcancel(), 60, 5);
    	Allocation.successcancel().click();
        
    }

    @And("^User click the Inboxmail icon in Allocation master$")
    public void user_click_the_inboxmail_icon_in_allocation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Allocation.mailicon(), 60, 5);
		Allocation.mailicon().click();
    	
    	
        
    }

    @And("^User click the search icon in Allocation Master and get the reference id$")
    public void user_click_the_search_icon_in_allocation_master_and_get_the_reference_id() throws Throwable {
        
    	for (int i = 0; i < 20; i++) {
			try {
				Allocation.searchiconreferenceid().click();
				Allocation.searchsentkeys().sendKeys("Allocation");
				break;
				
			} catch (Exception e) {

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Allocation.referenceid(), 60, 5);
    	System.out.println(Allocation.referenceid().getText());
		String ref1 = Allocation.referenceid().getText();
		String ref2 = ref1.substring(0);
//		json.addReferanceData(ref2);
		excelData.updateTestData(dataSetID, "Reference ID", ref2);
		testData = excelData.getTestdata(dataSetID);

    	
    }

    @And("^User click the submit icon in Allocation Master maker$")
    public void user_click_the_submit_icon_in_allocation_master_maker() throws Throwable {
    	
    	for(int i=0; i<20; i++) {
			try {
				Allocation.inboxediticon().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	
    	for (int i = 0; i < 20; i++) {
			try {
				Allocation.submit().click();
				break;
			} catch (Exception e) {

			}
		}

        
    }

    @And("^User enter the popup remark and submit the Allocation Master$")
    public void user_enter_the_popup_remark_and_submit_the_allocation_master() throws Throwable {
    	
    	
		
        
    }

    @And("^User get confirmation message and checker id in Allocation Master$")
    public void user_get_confirmation_message_and_checker_id_in_allocation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, Allocation.ProductCheckerid(), 60, 5);
		String Success = Allocation.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
//		json.addData(popupID);
		System.out.println(popupID);
		excelData.updateTestData(dataSetID, "Checker id", popupID);
		testData = excelData.getTestdata(dataSetID);
        
    }
    
    @And("^User verify while modification allocation master record, when user keep any mandatory field blank$")
    public void user_verify_while_modification_allocation_master_record_when_user_keep_any_mandatory_field_blank() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, Allocation.allocationMaster_RequiredField(), 60, 5);
   	    Assert.assertEquals("Required field",
   	    		Allocation.allocationMaster_RequiredField().getText());
    	System.out.println(Allocation.allocationMaster_RequiredField().getText());
    	
    }
    
    @Then("^select data set ID for allocation master testcase021$")
    public void select_data_set_id_for_allocation_master_testcase021() throws Throwable {
    	dataSetID = "AT_ALM_021_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for allocation master testcase022$")
    public void select_data_set_id_for_allocation_master_testcase022() throws Throwable {
    	dataSetID = "AT_ALM_022_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for allocation master testcase023$")
    public void select_data_set_id_for_allocation_master_testcase023() throws Throwable {
    	dataSetID = "AT_ALM_023_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for allocation master testcase024$")
    public void select_data_set_id_for_allocation_master_testcase024() throws Throwable {
    	dataSetID = "AT_ALM_024_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for allocation master testcase025$")
    public void select_data_set_id_for_allocation_master_testcase025() throws Throwable {
    	dataSetID = "AT_ALM_025_D1";
        testData = excelData.getTestdata(dataSetID);
    }

    @Then("^select data set ID for allocation master testcase026$")
    public void select_data_set_id_for_allocation_master_testcase026() throws Throwable {
    	dataSetID = "AT_ALM_026_D1";
        testData = excelData.getTestdata(dataSetID);
    }

}
