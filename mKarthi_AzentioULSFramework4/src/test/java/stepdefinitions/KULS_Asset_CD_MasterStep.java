package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.Asset_CD_MasterOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.Asset_CD_MasterTestDataType;
import testDataType.KULS_Login_TestDataType;

public class KULS_Asset_CD_MasterStep extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Asset_CD_MasterOBJ assetcd = new Asset_CD_MasterOBJ(driver);
	FindFieldisMandatoryorNot mandatoryornot = new FindFieldisMandatoryorNot(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","AssetCDMasterTestData","Data Set ID");
	Map<String, String> testData;
	
	
	Asset_CD_MasterTestDataType assetjson = jsonConfig.getAssetCDMasterListByName("Maker");
	
	
	@Given("^User login as uls maker in asset CD master$")
    public void user_login_as_uls_maker_in_asset_cd_master() throws Throwable {
		
		String kulsApplicationUrl = configFileReader.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		applicationLogin.loginUlsApplicationAsMaker(loginData.Username3, loginData.Password);
        
    }

    @Then("^User click the back button in asset CD master$")
    public void user_click_the_back_button_in_asset_cd_master() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_BackArrow(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			assetcd.Asset_BackArrow().click();
    			break;
			} catch (Exception e) {
			
			}
    	}
    	
        
    }

    @Then("^User verify the asset category fields in asset CD master$")
    public void user_verify_the_asset_category_fields_in_asset_cd_master() throws Throwable {
    	
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot(" Asset Category ");
    	
        
    }

    @Then("^User verify the confirmation message in asset CD master$")
    public void user_verify_the_confirmation_message_in_asset_cd_master() throws Throwable {
    	
    	for (int i = 0; i < 20; i++) {
			try {
				//Assert.assertEquals(assetcd.makerconfirmmsg().isDisplayed(), true);
				System.out.println(assetcd.makerconfirmmsg().getText());
				break;
			} catch (NoSuchElementException e) {

			}
		}
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.successcancel(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			assetcd.successcancel().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
    	//assetcd.successcancel().click();
    	
        
    }

    @Then("^User click the inboxmail icon in asset CD master$")
    public void user_click_the_inboxmail_icon_in_asset_cd_master() throws Throwable {
    	
		for (int i = 0; i < 20; i++) {
			try {
				assetcd.mailicon().click();
				break;
			} catch (Exception e) {

			}
		}
        
    }


    @And("^User click the product setup in asset CD master$")
    public void user_click_the_product_setup_in_asset_cd_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.productsetup(), 60, 5);
    	assetcd.productsetup().click();
        
    }

    @And("^User click the edit icon in asset CD master$")
    public void user_click_the_edit_icon_in_asset_cd_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.productsetupediticon(), 60, 5);
    	assetcd.productsetupediticon().click();
        
    }

    @And("^User click the add icon in asset CD master$")
    public void user_click_the_add_icon_in_asset_cd_master() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Addicon(), 60, 5);
    	for(int i=0; i<50; i++)
    		try {
    			assetcd.Asset_Addicon().click();
    			break;
			} catch (Exception e) {
				
			}
    	
        
    }

    @And("^User verify the save back help button in asset CD master$")
    public void user_verify_the_save_back_help_button_in_asset_cd_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_NewSave(), 60, 5);
    	Assert.assertEquals(assetcd.Asset_NewSave().isDisplayed(), true);
    	   	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_BackArrow(), 60, 5);
    	Assert.assertEquals(assetcd.Asset_BackArrow().isDisplayed(), true);
 
    	
    }

    @And("^User verify the all mentioned fields in asset CD master$")
    public void user_verify_the_all_mentioned_fields_in_asset_cd_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_categorytext(), 60, 5);
    	Assert.assertEquals(assetcd.Asset_categorytext().isDisplayed(), true);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Typetext(), 60, 5);
    	Assert.assertEquals(assetcd.Asset_Typetext().isDisplayed(), true);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Manufacturertext(), 60, 5);
    	Assert.assertEquals(assetcd.Asset_Manufacturertext().isDisplayed(), true);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Modeltext(), 60, 5);
    	Assert.assertEquals(assetcd.Asset_Modeltext().isDisplayed(), true);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_YearOfManufacturetext(), 60, 5);
    	Assert.assertEquals(assetcd.Asset_YearOfManufacturetext().isDisplayed(), true);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Countrytext(), 60, 5);
    	Assert.assertEquals(assetcd.Asset_Countrytext().isDisplayed(), true);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Remarkstext(), 60, 5);
    	Assert.assertEquals(assetcd.Asset_Remarkstext().isDisplayed(), true);
        
    }

    @And("^User enter the value in asset category for asset CD master$")
    public void user_enter_the_value_in_asset_category_for_asset_cd_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_categoryinput(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			assetcd.Asset_categoryinput().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
    	
    	Thread.sleep(2000);
    	
    	String xpath = "//ion-label[contains(text(),'"+testData.get("Asset Category")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
    	
        
    }

    @And("^User enter the value in asset type for asset CD master$")
    public void user_enter_the_value_in_asset_type_for_asset_cd_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Typeinput(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			assetcd.Asset_Typeinput().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
    	
    	
    	String xpath1 = "//ion-label[contains(text(),'"+testData.get("Asset Type")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath1));
				seleniumactions.getJavascriptHelper().scrollIntoView(x);
				x.click();
				break;

			} catch (Exception e) {

			}
		}
		
    	
        
    }

    @And("^User enter the value in manufacturer for asset CD master$")
    public void user_enter_the_value_in_manufacturer_for_asset_cd_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Manufacturerinput(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			assetcd.Asset_Manufacturerinput().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
    	
    	
    	String xpath2 = "//ion-label[contains(text(),'" +testData.get("Manufacturer")+ "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath2));
				seleniumactions.getJavascriptHelper().scrollIntoView(x);
				x.click();
				break;

			} catch (Exception e) {

			}
		}
        
    }

    @And("^User enter the value in model for asset CD master$")
    public void user_enter_the_value_in_model_for_asset_cd_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_model(), 60, 5);
    	for(int i=0; i<50; i++)
    		try {
    			assetcd.asset_model().click();
    	    	assetcd.asset_model().sendKeys(testData.get("Model"));
    	    	break;
			} catch (Exception e) {
				
			}
    
        
    }

    @And("^User enter the value in year of manufacture for asset CD master$")
    public void user_enter_the_value_in_year_of_manufacture_for_asset_cd_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_yearofmanufacture(), 60, 5);
    	for(int i=0; i<50; i++) {
    		try {
    			assetcd.asset_yearofmanufacture().click();
    	    	assetcd.asset_yearofmanufacture().sendKeys(testData.get("Year Of Manufacture"));
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
        
    }

    @And("^User enter the value in country for asset CD master$")
    public void user_enter_the_value_in_country_for_asset_cd_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T001_D1");
    	Thread.sleep(1000);
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Countryinput(), 60, 5);
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Countryinput(), 60, 5);
    	assetcd.Asset_Countryinput().click();
    	
    	String xpath3 = "//ion-label[contains(text(),'"+testData.get("Country")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath3));
				seleniumactions.getJavascriptHelper().scrollIntoView(x);
				x.click();
				break;

			} catch (Exception e) {

			}
		}
        
    }

    @And("^User enter the value in remarks for asset CD master$")
    public void user_enter_the_value_in_remarks_for_asset_cd_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_Remark(), 60, 5);
    	for(int i=0; i<50; i++) {
    		try {
    			assetcd.asset_Remark().click();
    	    	assetcd.asset_Remark().sendKeys(testData.get("Remark"));
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
        
    }

    @And("^User click the save button for asset CD master$")
    public void user_click_the_save_button_for_asset_cd_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_NewSave(), 60, 5);
    	assetcd.Asset_NewSave().click();
        
    }

    @And("^User click the search icon in asset CD master and get the reference id$")
    public void user_click_the_search_icon_in_asset_cd_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(testData.get("Inbox Search"));
				break;
				
			} catch (Exception e) {

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.referenceid(), 60, 5);
    	System.out.println(assetcd.referenceid().getText());
		String ref1 = assetcd.referenceid().getText();
		String ref2 = ref1.substring(0);
		excelData.updateTestData("AT-ACD-T001_D1","Reference ID",ref2);
		json.addReferanceData(ref2);
		testData = excelData.getTestdata("AT-ACD-T001_D1");
        
    }



    @And("^User click the submit icon in asset CD master maker$")
    public void user_click_the_submit_icon_in_asset_cd_master_maker() throws Throwable {
    	
    	for(int i=0; i<20; i++) {
			try {
				assetcd.inboxediticon().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.submit(), 60, 2);
    	assetcd.submit().click();
    	
//    	for (int i = 0; i < 20; i++) {
//			try {
//				assetcd.submit().click();
//				break;
//			} catch (Exception e) {
//
//			}
//		}
        
    }

    @And("^User enter the popup remark and submit the asset CD master$")
    public void user_enter_the_popup_remark_and_submit_the_asset_cd_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.popupremark().click();
				break;
			} catch (Exception e) {

			}
		}
    	
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.popupremark().sendKeys(testData.get("Popup Remark"));
				break;
			} catch (Exception e) {

			}
		}
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 5);
    	//assetcd.popupremark().sendKeys(assetjson.PopupRemarks);
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupsubmit(), 60, 5);
    	assetcd.popupsubmit().click();
        
    }

    @And("^User get confirmation message and checker id in asset CD master$")
    public void user_get_confirmation_message_and_checker_id_in_asset_cd_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.ProductCheckerid(), 60, 5);
		String Success = assetcd.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		excelData.updateTestData("AT-ACD-T001_D1","Checker id",popupID);
		json.addData(popupID);
		System.out.println(popupID);
		testData = excelData.getTestdata("AT-ACD-T001_D1");
		
        
    }


}
