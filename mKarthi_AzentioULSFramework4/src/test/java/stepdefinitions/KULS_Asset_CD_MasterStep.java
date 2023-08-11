package stepdefinitions;

import java.io.File;
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
	//JsonDataReaderWriter json = new JsonDataReaderWriter();
	Asset_CD_MasterOBJ assetcd = new Asset_CD_MasterOBJ(driver);
	FindFieldisMandatoryorNot mandatoryornot = new FindFieldisMandatoryorNot(driver);
	ExcelData assertcdmasterexcelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","AssetCDMasterTestData","Data Set ID");
	Map<String, String> assertcdmaster;
	
	
	//Asset_CD_MasterTestDataType assetjson = jsonConfig.getAssetCDMasterListByName("Maker");
	
	
	@Given("^User login as uls maker in asset CD master$")
    public void user_login_as_uls_maker_in_asset_cd_master() throws Throwable {
		
		ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","LoginCredentilas","Stage");
		Map<String, String> testdata = excelData.getTestdata("Maker2");
		String kulsApplicationUrl = configFileReader.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		applicationLogin.loginUlsApplicationAsMaker(testdata.get("Username"),testdata.get("Password"));
        
    }

    @Then("^User click the back button in asset CD master$")
    public void user_click_the_back_button_in_asset_cd_master() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_BackArrow(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			assetcd.Asset_BackArrow().click();
    			break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}
			
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
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.successcancel(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			assetcd.successcancel().click();
    			break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}
				
			}
    	}
    	//assetcd.successcancel().click();
    	
        
    }

    @Then("^User click the inboxmail icon in asset CD master$")
    public void user_click_the_inboxmail_icon_in_asset_cd_master() throws Throwable {
    	
    	Thread.sleep(2000);
    	
		for (int i = 0; i < 20; i++) {
			try {
				assetcd.mailicon().click();
				break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

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
				
				if(i==50) {
					Assert.fail(e.getMessage());
				}
				
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
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_categoryinput(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			assetcd.Asset_categoryinput().click();
    			break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}
				
			}
    	}
    	
    	//Thread.sleep(2000);
    	
    	

		for (int i = 1; i < 60; i++) {
			try {
				String xpath = "//ion-label[contains(text(),'"+assertcdmaster.get("Asset Category")+"')]//following-sibling::ion-radio";
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {
				
				if(i==60) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
        
    }

    @And("^User enter the value in asset type for asset CD master$")
    public void user_enter_the_value_in_asset_type_for_asset_cd_master() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Typeinput(), 60, 5);
    	for(int i=0; i<40; i++) {
    		try {
    			assetcd.Asset_Typeinput().click();
    			break;
			} catch (Exception e) {
				
				if(i==40) {
					Assert.fail(e.getMessage());
				}
				
			}
    	}
    	
    	
    	

		for (int i = 1; i < 20; i++) {
			try {
				
				String xpath1 = "//ion-label[contains(text(),'"+assertcdmaster.get("Asset Type")+"')]//following-sibling::ion-radio";
				WebElement x = driver.findElement(By.xpath(xpath1));
				seleniumactions.getJavascriptHelper().scrollIntoView(x);
				x.click();
				break;

			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
		
    	
        
    }

    @And("^User enter the value in manufacturer for asset CD master$")
    public void user_enter_the_value_in_manufacturer_for_asset_cd_master() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Manufacturerinput(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			assetcd.Asset_Manufacturerinput().click();
    			break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}
				
			}
    	}
    	
    	
    	

		for (int i = 1; i < 20; i++) {
			try {
				String xpath2 = "//ion-label[contains(text(),'" +assertcdmaster.get("Manufacturer")+ "')]//following-sibling::ion-radio";
				WebElement x = driver.findElement(By.xpath(xpath2));
				seleniumactions.getJavascriptHelper().scrollIntoView(x);
				x.click();
				break;

			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
        
    }

    @And("^User enter the value in model for asset CD master$")
    public void user_enter_the_value_in_model_for_asset_cd_master() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_model(), 60, 5);
    	for(int i=0; i<50; i++)
    		try {
    			assetcd.asset_model().click();
    	    	assetcd.asset_model().sendKeys(assertcdmaster.get("Model"));
    	    	break;
			} catch (Exception e) {
				
				if(i==50) {
					Assert.fail(e.getMessage());
				}
				
			}
    
        
    }

    @And("^User enter the value in year of manufacture for asset CD master$")
    public void user_enter_the_value_in_year_of_manufacture_for_asset_cd_master() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_yearofmanufacture(), 60, 5);
    	for(int i=0; i<60; i++) {
    		try {
    			assetcd.asset_yearofmanufacture().click();
    	    	assetcd.asset_yearofmanufacture().sendKeys(assertcdmaster.get("Year Of Manufacture"));
    	    	break;
			} catch (Exception e) {
				
				if(i==60) {
					Assert.fail(e.getMessage());
				}
				
			}
    	}
    	
        
    }

    @And("^User enter the value in country for asset CD master$")
    public void user_enter_the_value_in_country_for_asset_cd_master() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//Thread.sleep(1000);
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Countryinput(), 60, 5);
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Countryinput(), 60, 5);
    	for(int i=0; i<50; i++) {
    		try {
    			assetcd.Asset_Countryinput().click();
    			break;
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getLocalizedMessage());
				}
				
			}
    	}
    	
    	
    	

		for (int i = 1; i < 20; i++) {
			try {
				String xpath3 = "//ion-label[contains(text(),'"+assertcdmaster.get("Country")+"')]//following-sibling::ion-radio";
				WebElement x = driver.findElement(By.xpath(xpath3));
				seleniumactions.getJavascriptHelper().scrollIntoView(x);
				x.click();
				break;

			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
        
    }

    @And("^User enter the value in remarks for asset CD master$")
    public void user_enter_the_value_in_remarks_for_asset_cd_master() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_Remark(), 60, 5);
    	for(int i=0; i<50; i++) {
    		try {
    			assetcd.asset_Remark().click();
    	    	assetcd.asset_Remark().sendKeys(assertcdmaster.get("Remark"));
    	    	break;
			} catch (Exception e) {
				
				if(i==50) {
					Assert.fail(e.getMessage());
				}
				
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
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.referenceid(), 60, 5);
    	System.out.println(assetcd.referenceid().getText());
		String ref1 = assetcd.referenceid().getText();
		String ref2 = ref1.substring(0);
		assertcdmasterexcelData.updateTestData("AT-ACD-T001_D1","Reference ID",ref2);
		//json.addReferanceData(ref2);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T001_D1");
        
    }
    @And("^User click the search icon in asset CD master and get the reference id testcase010$")
    public void user_click_the_search_icon_in_asset_cd_master_testcase010() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.referenceid(), 60, 5);
    	System.out.println(assetcd.referenceid().getText());
		String ref1 = assetcd.referenceid().getText();
		String ref2 = ref1.substring(0);
		assertcdmasterexcelData.updateTestData("AT-ACD-T010_D1","Reference ID",ref2);
		//json.addReferanceData(ref2);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T010_D1");
        
    }

    @And("^User click the search icon in asset CD master and get the reference id testcase009$")
    public void user_click_the_search_icon_in_asset_cd_master_testcase009() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.referenceid(), 60, 5);
    	System.out.println(assetcd.referenceid().getText());
		String ref1 = assetcd.referenceid().getText();
		String ref2 = ref1.substring(0);
		assertcdmasterexcelData.updateTestData("AT-ACD-T009_D1","Reference ID",ref2);
		//json.addReferanceData(ref2);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T009_D1");
        
    }

    @And("^User click the search icon in asset CD master and get the reference id beforeapproved$")
    public void user_click_the_search_icon_in_asset_cd_master_beforeapproved() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.referenceid(), 60, 5);
    	System.out.println(assetcd.referenceid().getText());
		String ref1 = assetcd.referenceid().getText();
		String ref2 = ref1.substring(0);
		assertcdmasterexcelData.updateTestData("AT-ACD-T006_D1","Reference ID",ref2);
		//json.addReferanceData(ref2);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T006_D1");
        
    }

    
    @And("^User click the search icon in asset CD master and get the reference id return1$")
    public void user_click_the_search_icon_in_asset_cd_master_return1() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    }
    @And("^User click the search icon in asset CD master and get the reference id reject1$")
    public void user_click_the_search_icon_in_asset_cd_master_reject1() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    }

    
    @And("^User click the search icon in asset CD master and get the reference id reject$")
    public void user_click_the_search_icon_in_asset_cd_master_reject() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.referenceid(), 60, 5);
    	System.out.println(assetcd.referenceid().getText());
		String ref1 = assetcd.referenceid().getText();
		String ref2 = ref1.substring(0);
		assertcdmasterexcelData.updateTestData("AT-ACD-T003_D1","Reference ID",ref2);
		//json.addReferanceData(ref2);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T003_D1");
        
    }
    
    @And("^User click the search icon in asset CD master and get the reference id afterapproved$")
    public void user_click_the_search_icon_in_asset_cd_master_afterapproved() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.referenceid(), 60, 5);
    	System.out.println(assetcd.referenceid().getText());
		String ref1 = assetcd.referenceid().getText();
		String ref2 = ref1.substring(0);
		assertcdmasterexcelData.updateTestData("AT-ACD-T007_D1","Reference ID",ref2);
		//json.addReferanceData(ref2);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T007_D1");
        
    }

    
    @And("^User click the search icon in asset CD master and get the reference id return$")
    public void user_click_the_search_icon_in_asset_cd_master_return() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.referenceid(), 60, 5);
    	System.out.println(assetcd.referenceid().getText());
		String ref1 = assetcd.referenceid().getText();
		String ref2 = ref1.substring(0);
		assertcdmasterexcelData.updateTestData("AT-ACD-T004_D1","Reference ID",ref2);
		//json.addReferanceData(ref2);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T004_D1");
        
    }





    @And("^User click the submit icon in asset CD master maker$")
    public void user_click_the_submit_icon_in_asset_cd_master_maker() throws Throwable {
    	
    	for(int i=0; i<20; i++) {
			try {
				assetcd.inboxediticon().click();
				break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}
				
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
    	
    	//testData = excelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.popupremark().click();
				break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.popupremark().sendKeys(assertcdmaster.get("Popup Remark"));
				break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

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
		assertcdmasterexcelData.updateTestData("AT-ACD-T001_D1","Checker id",popupID);
		//json.addData(popupID);
		System.out.println(popupID);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T001_D1");
		
        
    }
    @And("^User get confirmation message and checker id in asset CD master testcase010$")
    public void user_get_confirmation_message_and_checker_id_in_asset_cd_master_testcase010() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.ProductCheckerid(), 60, 5);
		String Success = assetcd.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		assertcdmasterexcelData.updateTestData("AT-ACD-T010_D1","Checker id",popupID);
		//json.addData(popupID);
		System.out.println(popupID);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T010_D1");
		
        
    }
    @And("^User get confirmation message and checker id in asset CD master testcase009$")
    public void user_get_confirmation_message_and_checker_id_in_asset_cd_master_testcase009() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.ProductCheckerid(), 60, 5);
		String Success = assetcd.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		assertcdmasterexcelData.updateTestData("AT-ACD-T009_D1","Checker id",popupID);
		//json.addData(popupID);
		System.out.println(popupID);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T009_D1");
		
        
    }
    
    @And("^User get confirmation message and checker id in asset CD master beforeapproved$")
    public void user_get_confirmation_message_and_checker_id_in_asset_cd_master_beforeapproved() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.ProductCheckerid(), 60, 5);
		String Success = assetcd.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		assertcdmasterexcelData.updateTestData("AT-ACD-T006_D1","Checker id",popupID);
		//json.addData(popupID);
		System.out.println(popupID);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T006_D1");
		
        
    }
    
    @And("^User get confirmation message and checker id in asset CD master afterapproved$")
    public void user_get_confirmation_message_and_checker_id_in_asset_cd_master_afterapproved() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.ProductCheckerid(), 60, 5);
		String Success = assetcd.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		assertcdmasterexcelData.updateTestData("AT-ACD-T007_D1","Checker id",popupID);
		//json.addData(popupID);
		System.out.println(popupID);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T007_D1");
		
        
    }
    
    @And("^User get confirmation message and checker id in asset CD master reject$")
    public void user_get_confirmation_message_and_checker_id_in_asset_cd_master_reject() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.ProductCheckerid(), 60, 5);
		String Success = assetcd.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		assertcdmasterexcelData.updateTestData("AT-ACD-T003_D1","Checker id",popupID);
		//json.addData(popupID);
		System.out.println(popupID);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T003_D1");
		
        
    }
    
    @And("^User get confirmation message and checker id in asset CD master return$")
    public void user_get_confirmation_message_and_checker_id_in_asset_cd_master_return() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.ProductCheckerid(), 60, 5);
		String Success = assetcd.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		assertcdmasterexcelData.updateTestData("AT-ACD-T004_D1","Checker id",popupID);
		//json.addData(popupID);
		System.out.println(popupID);
		assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T004_D1");
		
        
    }
    
    @Given("^User login as uls checker in asset CD master$")
    public void user_login_as_uls_checker_in_asset_cd_master() throws Throwable {
		
		String kulsApplicationUrl = configFileReader.getApplicationUrlTransactions();
        driver.get(kulsApplicationUrl);
        //System.out.println(json.readdata());
        //assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T001_D1");
        System.out.println(assertcdmaster.get("Checker id"));
        applicationLogin.ulSApplicationLoginAsAChecker(assertcdmaster.get("Checker id"));
        
		
        
    }

    @Then("^User enter the popup remarks in asset CD master checker$")
    public void user_enter_the_popup_remarks_in_asset_cd_master_checker() throws Throwable {
        
    }

    @Then("^User verify the Record got Approved in asset CD checker$")
    public void user_verify_the_record_got_approved() throws Throwable {
    	
       help.waitForElementToVisibleWithFluentWait(driver, assetcd.recordMsgChecker(), 60, 2);
  	   String Toast;
  	   Toast = assetcd.recordMsgChecker().getText();
  	   System.out.println(Toast);
  	   Assert.assertEquals(Toast, "Record APPROVED Successfully");
        
    }


    @And("^User click the inboxicon in asset CD master checker$")
    public void user_click_the_inboxicon_in_asset_cd_master_checker() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.inboxiconChecker(), 60, 2);
		assetcd.inboxiconChecker().click();
        
    }

    @And("^User search the respective reference id and click on Action button in asset CD master$")
    public void user_search_the_respective_reference_id_and_click_on_action_button_in_asset_cd_master() throws Throwable {
    	
    	//assertcdmaster = assertcdmasterexcelData.getTestdata("AT-ACD-T001_D1");
    	for (int i = 0; i <40; i++) {
            
	    	try {
	           
	    		driver.findElement(By.xpath("//span[text()='"+assertcdmaster.get("Reference ID")+"']/ancestor::tr/td[1]/button"))
	            .click();
	            break;
              
	    	}
         
	    	catch (Exception e) {
	    		
	    		if(i==40) {
					Assert.fail(e.getMessage());
				}
	    		
	    	}
	    		
	    }

        
    }

    @And("^User click on Approve icon in asset CD master checker$")
    public void user_click_on_approve_icon_in_asset_cd_master_checker() throws Throwable {
    	
    	Thread.sleep(2000);
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.CheckerApprove(), 60, 2);
		for(int i=0; i<40; i++) {
			try {
				seleniumactions.getClickAndActionsHelper().moveToElement(assetcd.CheckerApprove());
				assetcd.CheckerApprove().click();
				break;
			} catch (Exception e) {
				
				if(i==40) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
    	
        
    }

    @And("^User click the popup remarks in asset CD master checker$")
    public void user_click_the_popup_remarks_in_asset_cd_master_checker() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T002_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 2);
		assetcd.popupremark().click();
		assetcd.popupremark().sendKeys(assertcdmaster.get("Popup Remark Approve"));
        
    }

    @And("^User click the popup approve in asset CD master checker$")
    public void user_click_the_popup_approve_in_asset_cd_master_checker() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupapprove(), 60, 2);
		assetcd.popupapprove().click();
        
    }
    
    // verify approve record
    
    @And("^Click the Asset CD Master setup eye icon in Asset CD master$")
    public void click_the_project_setup_eye_icon_in_project_master_for_validation() throws Throwable {
	
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.assetcdmastereyeicon(), 60, 2);
	assetcd.assetcdmastereyeicon().click();
        
	
    }

@Then("^User validate the updated record in list view in Asset CD master$")
public void user_validate_the_updated_record_in_list_view() throws Throwable {
    //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'" + subProductMasterRetailData.ProductCode + "')]")), 60, 2);
	//testData = excelData.getTestdata("AT-ACD-T001_D1");
	for (int i = 0; i <20; i++) {
        try {
            String validate = driver.findElement(By.xpath("//tbody/tr[1]/td[7]/p-celleditor[1]/span[1]")).getText();                 
            System.out.println(validate);
            Assert.assertEquals(validate, assertcdmaster.get("Remark"));
            break;

        } catch (NoSuchElementException e) {
        	
        	if(i==20) {
				Assert.fail(e.getMessage());
			}


        }

    }

    //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'" + subProductMasterRetailData.SubProductCode + "')]")), 60, 2);
//    for (int i = 0; i <20; i++) {
//        try {
//            String validate1 = driver.findElement(By.xpath("//span[contains(text(),'" + assetjson.ProjectName + "')]")).getText();
//            System.out.println(validate1);
//            Assert.assertEquals(validate1, assetjson.ProjectName);
//            break;
//        } catch (NoSuchElementException e) {
//
//        }
//    }

}

// Checker Reject and verification

@And("^User click the reject icon in asset CD master checker$")
public void User_click_the_reject_icon_in_asset_CD_master_checker() throws Throwable {
	
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.CheckerReject(), 60, 2);
	assetcd.CheckerReject().click();
    
}

@And("^User enter the reject remark in asset CD master checker$")
public void User_enter_the_reject_remark_in_asset_CD_master_checker$() throws Throwable {
	
	//testData = excelData.getTestdata("AT-ACD-T003_D1");
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 2);
	assetcd.popupremark().click();
	assetcd.popupremark().sendKeys(assertcdmaster.get("Popup Remark Reject"));
	
    
}

@And("^User click the final reject icon in asset CD master checker$")
public void User_click_the_final_reject_icon_in_asset_CD_master_checker() throws Throwable {
	
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupreject(), 60, 2);
	assetcd.popupreject().click();
	
	
    
}

@Then("^User verify the Record got Rejected in asset CD checker$")
public void user_verify_the_record_got_Rejected() throws Throwable {
	
   help.waitForElementToVisibleWithFluentWait(driver, assetcd.recordMsgChecker(), 60, 2);
	   String Toast;
	   Toast = assetcd.recordMsgChecker().getText();
	   System.out.println(Toast);
	   Assert.assertEquals(Toast, "Record REJECTED Successfully");
}

@And("^User verify the rejected record removed from the system in asset CD master$")
public void user_verify_the_rejected_record_removed_from_the_system() throws Throwable {
	//testData = excelData.getTestdata("AT-ACD-T001_D1");
	for (int i = 0; i <20; i++) {
        try {
        	assetcd.searchiconreferenceid().click();
            break;
        } catch (Exception e) {
        	
        	if(i==20) {
				Assert.fail(e.getMessage());
			}

        }
    }

        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetcd.searchsentkeys(),60,2);
        
        assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Reference ID"));
        
        String xpath ="//td[contains(text(),' ASSET_CD_MST ')]/preceding-sibling::td[1]/span[contains(text(),'"+assertcdmaster.get("Reference ID")+"')]";
        for (int i = 0; i < 200; i++) {
            try {
                Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
                break;
            } catch (NoSuchElementException e) {
            	
            	if(i==200) {
					Assert.fail(e.getMessage());
				}

            }
        }

}

// Asset CD Master Return record

@And("^User click the return icon in asset CD master checker$")
public void user_click_on_return_icon() throws Throwable {
	
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.CheckerReturn(), 60, 2);
	assetcd.CheckerReturn().click();
    
}

@And("^User enter the return remark in asset CD master checker$")
public void user_enter_the_remark_for_return_the_record() throws Throwable {
	
	//testData = excelData.getTestdata("AT-ACD-T004_D1");
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 2);
	assetcd.popupremark().click();
	assetcd.popupremark().sendKeys(assertcdmaster.get("Popup Remark Return"));
	
    
}

@And("^User click the final return icon in asset CD master checker$")
public void user_click_the_final_return_button() throws Throwable {
	
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupReturn(), 60, 2);
	assetcd.popupReturn().click();
	
	
    
}
@And("^User verify the returned record removed from the system in asset CD master$")
public void user_verify_the_returned_record_removed_from_the_system() throws Throwable {
    
	//testData = excelData.getTestdata("AT-ACD-T001_D1");
	for (int i = 0; i <20; i++) {
        try {
        	assetcd.searchiconreferenceid().click();
            break;
        } catch (Exception e) {
        	
        	if(i==20) {
				Assert.fail(e.getMessage());
			}

        }
    }

        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetcd.searchsentkeys(),60,2);
        
        assetcd.searchsentkeys().sendKeys(assertcdmaster.get("Reference ID"));
        String xpath ="//td[contains(text(),' ASSET_CD_MST ')]/preceding-sibling::td[1]/span[contains(text(),'"+assertcdmaster.get("Reference ID")+"')]";
        for (int i = 0; i < 200; i++) {
            try {
                Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
                break;
            } catch (NoSuchElementException e) {
            	
            	if(i==200) {
					Assert.fail(e.getMessage());
				}

            }
        }
}
@Then("^User verify the Record got Returned in asset CD checker$")
public void user_verify_the_record_got_Returned() throws Throwable {
	
   help.waitForElementToVisibleWithFluentWait(driver, assetcd.recordMsgChecker(), 60, 2);
	   String Toast;
	   Toast = assetcd.recordMsgChecker().getText();
	   System.out.println(Toast);
	   Assert.assertEquals( true, Toast.contains("Record RETURNED Successfully"));
	   
	   
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@And("^Verify the impact when user enter characters value in numeric field in asset CD master$")
public void verify_the_impact_when_user_enter_characters_value_in_numeric_field() throws Throwable {
	//testData = excelData.getTestdata("AT-ACD-T005_D1");
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_yearofmanufacture(), 60, 5);
	assetcd.asset_yearofmanufacture().click();
	assetcd.asset_yearofmanufacture().sendKeys(assertcdmaster.get("Year Of Manufacture"));
	String attr= assetcd.asset_yearofmanufacture().getAttribute("ng-reflect-model");
	Assert.assertNotEquals(attr, assertcdmaster.get("Year Of Manufacture"));


}
@And("^Verify the impact when user enter numeric value in character field in asset CD master$")
public void verify_the_impact_when_user_enter_numeric_value_in_character_field_in_asset_cd_master() throws Throwable {
	//testData = excelData.getTestdata("AT-ACD-T005_D1");
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_model(), 60, 5);
	assetcd.asset_model().click();
	assetcd.asset_model().sendKeys(assertcdmaster.get("Model"));
	String attr2 = (String) seleniumactions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-input')[0].value");
	Assert.assertEquals(attr2, assertcdmaster.get("Model"));
	
	

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
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}
				
			}
    	}
    	
    	
        
    }

    @And("^User update the assetcategory in asset CD master$")
    public void user_update_the_assetcategory_in_asset_cd_master() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T006_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.assetcategoryupdate(), 60, 5);
    	assetcd.assetcategoryupdate().click();
    	
    	

		for (int i = 1; i < 20; i++) {
			try {
				String xpath = "//ion-label[contains(text(),'" +assertcdmaster.get("Asset Category")+ "')]//following-sibling::ion-radio";
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
        
    }

    @And("^User update the model in asset CD master$")
    public void user_update_the_model_in_asset_cd_master() throws Throwable {
    	//testData = excelData.getTestdata("AT-ACD-T006_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.asset_model(), 60, 5);
    	assetcd.asset_model().click();
    	assetcd.asset_model().clear();
    	assetcd.asset_model().sendKeys(assertcdmaster.get("Model"));
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
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}
				
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
    	
    	//testData = excelData.getTestdata("AT-ACD-T006_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.Asset_Typeinput(), 60, 5);
    	assetcd.Asset_Typeinput().click();
    	
    	

		for (int i = 1; i < 20; i++) {
			try {
				String xpath2 = "//ion-label[contains(text(),'" +assertcdmaster.get("Asset Type")+ "')]//following-sibling::ion-radio";
				WebElement x = driver.findElement(By.xpath(xpath2));
				x.click();
				break;

			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

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
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

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
    	
    	//testData = excelData.getTestdata("AT-ACD-T012_D1");
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.searchIcon(), 30, 2);
		for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchIcon().click();
				break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.productViewSearchText(),
				30, 2);
		assetcd.productViewSearchText().sendKeys(assertcdmaster.get("Searching Matching Data"));

		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		String productcode = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);

		productcode = driver.findElement(By.xpath(xpath)).getText();

	    System.out.println(productcode);

	}
    
    @And("^Verify the functionality of Search box with mismatch data in asset CD master$")
	public void verify_the_functionality_of_search_box_with_mismatch_data() throws Throwable {
    	
    	//testData = excelData.getTestdata("AT-ACD-T012_D1");
		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
		for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchIcon().click();
				break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.productViewSearchText(),
				30, 2);
		assetcd.productViewSearchText().sendKeys(assertcdmaster.get("Searching Mismatch Data"));
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				break;
			} catch (Exception e) {
				
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();

	}
    
    //////////////////////////////////////////////Logout///////////////////////////////////////////////
    
    @And("^User Logout from application$")
    public void user_logout_from_application() throws Throwable {
    	
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.Profile_Logout(), 60, 2);
    	for(int i=0; i<50; i++) {
    		try {
				
    			assetcd.Profile_Logout().click();
    			//assetcd.Logout().click();
    			break;
    			
			} catch (Exception e) {
				if(i==50) {
					
					Assert.fail(e.getMessage());
		
				}
				
			}
    	}
    	
    	for(int i=0; i<50; i++) {
    		try {
				
    			//assetcd.Profile_Logout().click();
    			assetcd.Logout().click();
    			break;
    			
			} catch (Exception e) {
				if(i==50) {
					
					Assert.fail(e.getMessage());
		
				}
				
			}
    	}
		
		
		//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.Logout(), 60, 2);
		
    	
        
    }















/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
@And("^User get the testdata for Assert CD Master testcase001$")
public void user_get_the_testdata_for_assert_cd_master_testcase001() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T001_D1");
    
}

@And("^User get the testdata for Assert CD Master testcase002$")
public void user_get_the_testdata_for_assert_cd_master_testcase002() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T002_D1");
    
}

@And("^User get the testdata for Assert CD Master testcase003$")
public void user_get_the_testdata_for_assert_cd_master_testcase003() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T003_D1");
    
}

@And("^User get the testdata for Assert CD Master testcase004$")
public void user_get_the_testdata_for_assert_cd_master_testcase004() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T004_D1");
    
}

@And("^User get the testdata for Assert CD Master testcase005$")
public void user_get_the_testdata_for_assert_cd_master_testcase005() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T005_D1");
    
}

@And("^User get the testdata for Assert CD Master testcase006$")
public void user_get_the_testdata_for_assert_cd_master_testcase006() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T006_D1");
    
}
@And("^User get the testdata for Assert CD Master testcase006D2$")
public void user_get_the_testdata_for_assert_cd_master_testcase006D2() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T006_D2");
    
}

@And("^User get the testdata for Assert CD Master testcase007$")
public void user_get_the_testdata_for_assert_cd_master_testcase007() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T007_D1");
    
}

@And("^User get the testdata for Assert CD Master testcase008$")
public void user_get_the_testdata_for_assert_cd_master_testcase008() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T008_D1");
    
}

@And("^User get the testdata for Assert CD Master testcase009$")
public void user_get_the_testdata_for_assert_cd_master_testcase009() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T009_D1");
    
}

@And("^User get the testdata for Assert CD Master testcase010$")
public void user_get_the_testdata_for_assert_cd_master_testcase010() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T010_D1");
    
}

@And("^User get the testdata for Assert CD Master testcase011$")
public void user_get_the_testdata_for_assert_cd_master_testcase011() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T011_D1");
    
}

@And("^User get the testdata for Assert CD Master testcase012$")
public void user_get_the_testdata_for_assert_cd_master_testcase012() throws Throwable {
	
	assertcdmaster=assertcdmasterexcelData.getTestdata("AT-ACD-T012_D1");
    
}



}
