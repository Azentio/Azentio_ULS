package stepdefinitions;

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
import pageobjects.AllocationMasterOBJ;
import pageobjects.BounceMasterOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.BounceMasterTestDataType;
import testDataType.KULS_Login_TestDataType;

public class KULS_AllocationMasterStep extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	BounceMasterTestDataType Bouncejson = jsonConfig.getBounceMasterListByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	AllocationMasterOBJ Allocation = new AllocationMasterOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	
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
		Allocation.AllocationCode().sendKeys("MS001");
        
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
		json.addReferanceData(ref2);

    	
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
		json.addData(popupID);
		System.out.println(popupID);
        
    }


}
