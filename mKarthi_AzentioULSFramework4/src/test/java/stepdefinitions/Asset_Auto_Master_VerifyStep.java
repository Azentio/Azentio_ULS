package stepdefinitions;

import java.io.File;

import org.openqa.selenium.By;
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
import pageobjects.Asset_Auto_MasterOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.Asset_CD_MasterTestDataType;
import testDataType.KULS_Login_TestDataType;

public class Asset_Auto_Master_VerifyStep {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Asset_Auto_MasterOBJ assetAutoMasterObj = new Asset_Auto_MasterOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	
	@Then("^User click the Configurations in asset auto master$")
    public void user_click_the_configurations_in_asset_auto_master() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.Asset_Configurations(), 60, 5);
		assetAutoMasterObj.Asset_Configurations().click();
        
    }

	
	@Then("^User click the workflow of the record in asset auto master$")
    public void user_click_the_workflow_of_the_record_in_asset_auto_master() throws Throwable {
		
		for(int i=0; i<20; i++){
			try {
				//project.viewsummary().click();
				seleniumactions.getClickAndActionsHelper().doubleClick(assetAutoMasterObj.viewsummary());
				break;
			} catch (Exception e) {
			
			}
		}
        
    }

    @And("^User click the asset auto master edit icon in asset auto master$")
    public void user_click_the_asset_auto_master_edit_icon_in_asset_auto_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.productsetupediticon(), 60, 5);
    	assetAutoMasterObj.productsetupediticon().click();
        
    }

    @And("^User verify the Asset Auto Master List view$")
    public void user_verify_the_asset_auto_master_list_view() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.Asset_Addicon(), 60, 5);
    	Assert.assertEquals(assetAutoMasterObj.Asset_Addicon().isDisplayed(), true);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.searchIcon(), 60, 5);
    	Assert.assertEquals(assetAutoMasterObj.searchIcon().isDisplayed(), true);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.exportIcon(), 60, 5);
    	Assert.assertEquals(assetAutoMasterObj.exportIcon().isDisplayed(), true);
    	
    	
        
    }

    @And("^User verify the Values in List view should be non editable$")
    public void user_verify_the_values_in_list_view_should_be_non_editable() throws Throwable {
    	
    	String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified product code field is not editable only displayable");
		}
        
    }

    @And("^User verify the functionality of Export to PDF button in asset auto master$")
    public void user_verify_the_functionality_of_export_to_pdf_button_in_asset_auto_master() throws Throwable {
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.exportIcon(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				assetAutoMasterObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.pdfOption(), 60, 3);
		// Assert.assertEquals(project.pdfOption().isDisplayed(), true);
		assetAutoMasterObj.pdfOption().click();
		String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		for (int i = 0; i < 20; i++) {
			try {
				for (File fileName : totalfiles) {
					if (fileName.getName().equalsIgnoreCase("ProductMasterFile.pdf")) {
						System.out.println("Downloaded file present in system");
						break;
					} else {
						// System.out.println("Downloaded file present does not exist in system");
					}

				}
				break;

			} catch (Exception e) {

			}
		}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();

	}


    @And("^User verify the functionality of Export to Excel button in asset auto master$")
    public void user_verify_the_functionality_of_export_to_excel_button_in_asset_auto_master() throws Throwable {
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.exportIcon(), 60, 2);
    	assetAutoMasterObj.exportIcon().click();

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.xlsOption(), 60, 3);
		// Assert.assertEquals(project.xlsOption().isDisplayed(), true);
		assetAutoMasterObj.xlsOption().click();

        
    }

    @And("^User verify the functionality of Search box with matching data in asset auto master$")
    public void user_verify_the_functionality_of_search_box_with_matching_data_in_asset_auto_master() throws Throwable {
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.searchIcon(), 30, 2);
		for (int i = 0; i < 20; i++) {
			try {
				assetAutoMasterObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.productViewSearchText(),
				30, 2);
		assetAutoMasterObj.productViewSearchText().sendKeys(json.readReferancedata());

		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		String productcode = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);

		productcode = driver.findElement(By.xpath(xpath)).getText();

	    System.out.println(productcode);

        
    }

    @And("^User verify the functionality of Search box with mismatch data in asset auto master$")
    public void user_verify_the_functionality_of_search_box_with_mismatch_data_in_asset_auto_master() throws Throwable {
    	
    	driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
		for (int i = 0; i < 20; i++) {
			try {
				assetAutoMasterObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.productViewSearchText(),
				30, 2);
		assetAutoMasterObj.productViewSearchText().sendKeys("zzzzz");
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				break;
			} catch (NoSuchElementException e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();


        
    }

    @And("^User click the add icon in asset auto master$")
    public void user_click_the_add_icon_in_asset_auto_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.Asset_Addicon(), 60, 5);
    	assetAutoMasterObj.Asset_Addicon().click();
    	
    	
        
    }
    // active deactive
    
    @And("^User click the asset auto master eye icon in asset auto master$")
    public void user_click_the_asset_auto_master_eye_icon_in_asset_auto_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.assetautomastereyeicon(), 60, 5);
    	assetAutoMasterObj.assetautomastereyeicon().click();
    }

    @And("^Click the listview pencil icon in asset auto master$")
    public void click_the_listview_pencil_icon_in_asset_auto_master() throws Throwable {
    	
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.listviewpencil(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			assetAutoMasterObj.listviewpencil().click();
    			break;
			} catch (Exception e) {
			
			}
    	}
    	
        
    }

    @And("^User click the backbutton in asset auto master$")
    public void user_click_the_backbutton_in_asset_auto_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.Asset_BackArrow(), 60, 5);
    	assetAutoMasterObj.Asset_BackArrow().click();
        
    }

    @And("^Verify the active status in asset auto master$")
    public void verify_the_active_status_in_asset_auto_master() throws Throwable {
    	
    	String active = assetAutoMasterObj.Activeanddeactive().getAttribute("aria-checked");
    	
    	
    	if (active.equalsIgnoreCase("true")) {
    		
    		System.out.println("Active status");
    		
    	}
    	else if(active.equalsIgnoreCase("false")) {
    		
    		System.out.println("Deactive status");
    	}
        
    }

    @And("^User click the status button in asset auto master$")
    public void user_click_the_status_button_in_asset_auto_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.Activeanddeactive(), 60, 5);
    	assetAutoMasterObj.Activeanddeactive().click();
        
    }

    @And("^Verify the Deactive status in asset auto master$")
    public void verify_the_deactive_status_in_asset_auto_master() throws Throwable {
    	
    	String active = assetAutoMasterObj.Activeanddeactive().getAttribute("aria-checked");
    	
    	
    	if (active.equalsIgnoreCase("true")) {
    		
    		System.out.println("Active status");
    		
    	}
    	else if(active.equalsIgnoreCase("false")) {
    		
    		System.out.println("Deactive status");
    	}
        
    }



}
