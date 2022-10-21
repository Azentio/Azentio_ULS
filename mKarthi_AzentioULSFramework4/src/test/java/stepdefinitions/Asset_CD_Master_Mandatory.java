package stepdefinitions;

import java.io.File;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.Asset_CD_MasterOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.Asset_CD_MasterTestDataType;
import testDataType.KULS_Login_TestDataType;

public class Asset_CD_Master_Mandatory {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Checker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Asset_CD_MasterOBJ assetcd = new Asset_CD_MasterOBJ(driver);
	FindFieldisMandatoryorNot mandatoryornot = new FindFieldisMandatoryorNot(driver);
	Asset_CD_MasterTestDataType assetjson = jsonConfig.getAssetCDMasterListByName("Maker");
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","AssetCDMasterTestData","Data Set ID");
	Map<String, String> testData;
	
	
	
	@And("^Verify the impact when user enter characters value in numeric field in asset CD master$")
    public void verify_the_impact_when_user_enter_characters_value_in_numeric_field() throws Throwable {
		testData = excelData.getTestdata("AT-ACD-T005_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_yearofmanufacture(), 60, 5);
    	assetcd.asset_yearofmanufacture().click();
    	assetcd.asset_yearofmanufacture().sendKeys(testData.get("Year Of Manufacture"));
    	String attr= assetcd.asset_yearofmanufacture().getAttribute("ng-reflect-model");
    	Assert.assertNotEquals(attr, testData.get("Year Of Manufacture"));
    
	
	}
	@And("^Verify the impact when user enter numeric value in character field in asset CD master$")
    public void verify_the_impact_when_user_enter_numeric_value_in_character_field_in_asset_cd_master() throws Throwable {
		testData = excelData.getTestdata("AT-ACD-T005_D1");
		help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_model(), 60, 5);
    	assetcd.asset_model().click();
    	assetcd.asset_model().sendKeys(testData.get("Model"));
    	String attr2 = (String) seleniumactions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-input')[0].value");
    	Assert.assertEquals(attr2, testData.get("Model"));
    	
    	
	
    }
	 @And("^Verify the impact when user keep any mandatory field blank in asset CD master$")
	    public void verify_the_impact_when_user_keep_any_mandatory_field_blank() throws Throwable {
	    	
	    	WebElement nameErrorMessage = driver
					.findElement(By.xpath("//digital-form-error//ion-badge"));
			String expectedErrorText = "Required field";
			String actualErrorText = nameErrorMessage.getText();
			if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
				System.out.println(
						"The actual and expected result are same.The Popup validation message is" + actualErrorText);
			} else {
				System.out.println(
						"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
			}
	    	
	        
	    }
	    @And("^Click the listview pencil icon in asset CD master$")
	    public void click_the_listview_pencil_icon_in_asset_cd_master() throws Throwable {
	    	
	    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.listviewpencil(), 60, 5);
	    	//assetcd.listviewpencil().click();
	    	for(int i=0; i<20; i++) {
	    		try {
	    			assetcd.listviewpencil1().click();
	    			break;
				} catch (Exception e) {
					
				}
	    	}
	    	
	    	
	        
	    }

	    @And("^User update the assetcategory in asset CD master$")
	    public void user_update_the_assetcategory_in_asset_cd_master() throws Throwable {
	    	
	    	testData = excelData.getTestdata("AT-ACD-T006_D1");
	    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.assetcategoryupdate(), 60, 5);
	    	assetcd.assetcategoryupdate().click();
	    	
	    	String xpath = "//ion-label[contains(text(),'" +testData.get("Asset Category")+ "')]//following-sibling::ion-radio";

			for (int i = 1; i < 20; i++) {
				try {
					WebElement x = driver.findElement(By.xpath(xpath));
					x.click();
					break;

				} catch (Exception e) {

				}
			}
	        
	    }

	    @And("^User update the model in asset CD master$")
	    public void user_update_the_model_in_asset_cd_master() throws Throwable {
	    	testData = excelData.getTestdata("AT-ACD-T006_D1");
	    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_model(), 60, 5);
	    	assetcd.asset_model().click();
	    	assetcd.asset_model().clear();
	    	assetcd.asset_model().sendKeys(testData.get("Model"));
	    	//assetcd.asset_model().sendKeys(Keys.ENTER);
	    	
	        
	    }
	    @And("^User click the update button for asset CD master$")
	    public void user_click_the_update_button_for_asset_cd_master() throws Throwable {
	    	
	    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_UpdateSave(), 60, 5);
	    	for(int i=0; i<20; i++) {
	    		try {
	    			assetcd.Asset_UpdateSave().click();;
	    			break;
				} catch (Exception e) {
					
				}
	    	}
	    	
	    }

	    @And("^User verify while modification keep any mandatory field blank and click on save button$")
	    public void user_verify_while_modification_keep_any_mandatory_field_blank_and_click_on_save_button() throws Throwable {
	    	
	    	WebElement nameErrorMessage = driver
					.findElement(By.xpath("//digital-form-error//ion-badge"));
			String expectedErrorText = "Required field";
			String actualErrorText = nameErrorMessage.getText();
			if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
				System.out.println(
						"The actual and expected result are same.The Popup validation message is" + actualErrorText);
			} else {
				System.out.println(
						"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
			}
	    	
	    	
	        
	    }

	    @And("^User update the assettype in asset CD master$")
	    public void user_update_the_assettype_in_asset_cd_master() throws Throwable {
	    	
	    	testData = excelData.getTestdata("AT-ACD-T006_D1");
	    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Typeinput(), 60, 5);
	    	assetcd.Asset_Typeinput().click();
	    	
	    	String xpath2 = "//ion-label[contains(text(),'" +testData.get("Asset Type")+ "')]//following-sibling::ion-radio";

			for (int i = 1; i < 20; i++) {
				try {
					WebElement x = driver.findElement(By.xpath(xpath2));
					x.click();
					break;

				} catch (Exception e) {

				}
			}
	    	
	    	
	        
	    }
	    
	    // Active and deactive button
	    
	    @And("^User click the status button in asset CD master$")
	    public void user_click_the_status_button_in_asset_cd_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Activeanddeactive(), 60, 5);
	    	assetcd.Activeanddeactive().click();
	        
	    }

	    @And("^Verify the active status in asset CD master$")
	    public void verify_the_active_status_in_asset_cd_master() throws Throwable {
	    	
	    	String active = assetcd.Activeanddeactive().getAttribute("aria-checked");
	    	
	    	
	    	if (active.equalsIgnoreCase("true")) {
	    		
	    		System.out.println("Active status");
	    		
	    	}
	    	else if(active.equalsIgnoreCase("false")) {
	    		
	    		System.out.println("Deactive status");
	    	}
	    	
	    	
	        
	    }

	    @And("^Verify the Deactive status in asset CD master$")
	    public void verify_the_deactive_status_in_asset_cd_master() throws Throwable {
	    	
	    	String active1 = assetcd.Activeanddeactive().getAttribute("aria-checked");
	    	
	    	
	    	if (active1.equalsIgnoreCase("true")) {
	    		
	    		System.out.println("Active status");
	    		
	    	}
	    	else if(active1.equalsIgnoreCase("false")) {
	    		
	    		System.out.println("Deactive status");
	    	}
	        
	    }

	    @And("^User click the backbutton in asset CD master$")
	    public void user_click_the_backbutton_in_asset_cd_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_BackArrow(), 60, 5);
	    	assetcd.Asset_BackArrow().click();
	        
	    }
	    
	    // pdf and excel download
	    
	    @And("^Verify the functionality of Export to PDF button in asset CD master$")
		public void verify_the_functionality_of_export_to_pdf_button() throws Throwable {

			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.exportIcon(), 60, 2);
			for (int i = 0; i < 20; i++) {
				try {
					assetcd.exportIcon().click();
					break;
				} catch (Exception e) {

				}
			}

			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.pdfOption(), 60, 3);
			// Assert.assertEquals(project.pdfOption().isDisplayed(), true);
			assetcd.pdfOption().click();
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
	    
	    @And("^Verify the functionality of Export to Excel button in asset CD master$")
		public void verify_the_functionality_of_export_to_excel_button() throws Throwable {

			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.exportIcon(), 60, 2);
			assetcd.exportIcon().click();

			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.xlsOption(), 60, 3);
			// Assert.assertEquals(project.xlsOption().isDisplayed(), true);
			assetcd.xlsOption().click();

		}
	    
	    @And("^Verify the functionality of Search box with matching data in asset CD master$")
		public void verify_the_functionality_of_search_box_with_matching_data() throws Throwable {
	    	
	    	testData = excelData.getTestdata("AT-ACD-T012_D1");
			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.searchIcon(), 30, 2);
			for (int i = 0; i < 20; i++) {
				try {
					assetcd.searchIcon().click();
					break;
				} catch (Exception e) {

				}
			}
			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.productViewSearchText(),
					30, 2);
			assetcd.productViewSearchText().sendKeys(testData.get("Searching Matching Data"));

			String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
			String productcode = null;
			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
					driver.findElement(By.xpath(xpath)), 60, 2);

			productcode = driver.findElement(By.xpath(xpath)).getText();

		    System.out.println(productcode);

		}
	    
	    @And("^Verify the functionality of Search box with mismatch data in asset CD master$")
		public void verify_the_functionality_of_search_box_with_mismatch_data() throws Throwable {
	    	
	    	testData = excelData.getTestdata("AT-ACD-T012_D1");
			driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
			for (int i = 0; i < 20; i++) {
				try {
					assetcd.searchIcon().click();
					break;
				} catch (Exception e) {

				}
			}
			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.productViewSearchText(),
					30, 2);
			assetcd.productViewSearchText().sendKeys(testData.get("Searching Mismatch Data"));
			Thread.sleep(1000);
			String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
			for (int i = 0; i < 200; i++) {
				try {
					seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
							driver.findElement(By.xpath(xpath)), 60, 2);
					Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
					break;
				} catch (Exception e) {

				}
			}

			driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();

		}








}
