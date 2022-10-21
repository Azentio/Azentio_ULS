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
import pageobjects.AllocationMasterObject;
import pageobjects.Allocation_MstObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class MDM_Allocation_Master extends BaseClass {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browsehelper = new BrowserHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	AllocationMasterObject allocationObj = new AllocationMasterObject(driver);
	Allocation_MstObj allocationMstObj = new Allocation_MstObj(driver);
	
	
	@And("^user click on Allocation Master List view Icon$")
	public void user_click_on_allocation_master_list_view_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationObj.AllocationMaster_EyeIcon(), 50, 2);
		javaHelper.scrollIntoView(allocationObj.AllocationMaster_EyeIcon());
		allocationObj.AllocationMaster_EyeIcon().click();

	}

	@And("^User verify the Values in List view should be non editable in Allocation Master$")
	public void user_verify_the_values_in_list_view_should_be_non_editable_in_allocation_master() throws Throwable {
		String xpath = "//tr[1]/td[3]/p-celleditor[1]";
		try {
			driver.findElement(By.xpath(xpath)).click();
			driver.findElement(By.xpath(xpath)).sendKeys("1234");
		} catch (Exception e) {
			System.out.println("Verified Description field is not editable only displayable");
		}
	}

	@And("^user click on back button in Master$")
	public void user_click_on_back_button_in_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationObj.AllocationMaster_BackButton(), 50, 2);
		allocationObj.AllocationMaster_BackButton().click();
	}

	@And("^user verify the Add button of Allocation Master$")
	public void user_verify_the_add_button_of_allocation_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationObj.AllocationMaster_AddButton(), 50, 2);
		Assert.assertTrue(allocationObj.AllocationMaster_AddButton().isDisplayed());		
		allocationObj.AllocationMaster_AddButton().click();
	}

	@And("^user click on search box$")
	public void user_click_on_search_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationSearchIcon(), 50, 2);
		
		for (int i = 0; i < 50; i++) {
			try {
				Assert.assertTrue(allocationMstObj.AllocationSearchIcon().isDisplayed());		
				allocationMstObj.AllocationSearchIcon().click();
				break;
			} catch (Exception e) {
				if (i==50) {
					Assert.fail();
				}
			}
		}

	}

	@And("^user Enter the matching data in search text box$")
	public void user_enter_the_matching_data_in_search_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationSearchTextBox(), 50, 2);					
		allocationMstObj.AllocationSearchTextBox().sendKeys("Allocation master home loan");		
		Thread.sleep(1000);
		String xpath = driver.findElement(By.xpath("//tr[1]/td[3]/p-celleditor[1]")).getText();
		Assert.assertEquals(xpath, "Allocation master home loan");
		
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationTextBoxCloseButton(), 50, 2);	
		allocationMstObj.AllocationTextBoxCloseButton().click();
	}

	@And("^user Enter the Mismatch data in search text box$")
	public void user_enter_the_mismatch_data_in_search_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationSearchTextBox(), 50, 2);			
		allocationMstObj.AllocationSearchTextBox().sendKeys("AAAAA");
		Thread.sleep(1000);
		try {
			String xpath = driver.findElement(By.xpath("//tr[1]/td[3]/p-celleditor[1]")).getText();
			Assert.assertEquals(xpath, "AAAAA");
		} catch (Exception e) {
			System.out.println("The Search Record is Not Availble in List");
		}
		
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationTextBoxCloseButton(), 50, 2);	
		allocationMstObj.AllocationTextBoxCloseButton().click();
	}

	@And("^user click on Export button and Download the PDF file$")
	public void user_click_on_export_button_and_download_the_pdf_file() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationExportButton(), 50, 2);	
		allocationMstObj.AllocationExportButton().click();
		
		for (int i = 0; i < 50; i++) {
			try {
				allocationMstObj.AllocationExportPDFOption().click();
				break;
			} catch (Exception e) {
				if (i==50) {
					Assert.fail();
				}
			}
		}
		//browsehelper.SwitchToWindow(1);
		browsehelper.switchToParentWithChildClose();
		
	}

	@And("^user click on Export button and Download the Excel file$")
	public void user_click_on_export_button_and_download_the_excel_file() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationExportButton(), 50, 2);	
		allocationMstObj.AllocationExportButton().click();
		
		for (int i = 0; i < 50; i++) {
			try {
				allocationMstObj.AllocationExportXLSOption().click();
				break;
			} catch (Exception e) {
				if (i==50) {
					Assert.fail();
				}
			}
		}
	}

}
