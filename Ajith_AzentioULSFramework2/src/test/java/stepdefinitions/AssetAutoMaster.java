package stepdefinitions;

import java.io.File;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Asset_AutoMaster_Obj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.AssetAutoMaster_TestData;

public class AssetAutoMaster {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	Asset_AutoMaster_Obj assetAutoMasterObj = new Asset_AutoMaster_Obj(driver);
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	AssetAutoMaster_TestData assetAutoMasterData = jsonConfig.getAssetAutoMasterListByName("Maker");
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00482\\Downloads\\TestDataDesignSampleNew.xlsx","AssetAutoMasterTestData","Data Set ID");
	Map<String, String> testData;
	@And("^User enter the product setup menu for asset auto creation$")
    public void user_enter_the_product_setup_menu_for_asset_auto_creation() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.productSetup(), 30, 2);
        assetAutoMasterObj.productSetup().click();
    }
	 @When("^user click the configuration menu for asset auto creation$")
	    public void user_click_the_configuration_menu_for_asset_auto_creation() throws Throwable {
		 seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.configurationOptions(), 30, 2);
		 assetAutoMasterObj.configurationOptions().click();
	 }

    @And("^user click asset auto edit icon$")
    public void user_click_asset_auto_edit_icon() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoMasterEditIcon(),60,2);
    	assetAutoMasterObj.assetAutoMasterEditIcon().click();
    }

    @And("^User click add icon for asset auto master$")
    public void user_click_add_icon_for_asset_auto_master() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWaitElementToBeClickable(driver,assetAutoMasterObj.addIcon(),180,2);
        assetAutoMasterObj.addIcon().click();
    }
    @And("^User verify asset auto master opens with asset category brand asset type and remarks fields$")
    public void user_verify_asset_auto_master_opens_with_asset_category_brand_asset_type_and_remarks_fields() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetCategoryLabel(), 30, 2);
        Assert.assertEquals(assetAutoMasterObj.assetCategoryLabel().isDisplayed(), true);
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.brandLabel(), 30, 2);
        Assert.assertEquals(assetAutoMasterObj.brandLabel().isDisplayed(), true);
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetTypeLabel(), 30, 2);
        Assert.assertEquals(assetAutoMasterObj.assetTypeLabel().isDisplayed(), true);
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.remarkLabel(), 30, 2);
        Assert.assertEquals(assetAutoMasterObj.remarkLabel().isDisplayed(), true);
        System.out.println("Asset Auto Master opens with following fields " +assetAutoMasterObj.assetCategoryLabel().getText()+","
        		+assetAutoMasterObj.brandLabel().getText()+","+assetAutoMasterObj.assetTypeLabel().getText()+","+
        		assetAutoMasterObj.remarkLabel().getText());
        
    }
    @And("^user select Asset category and check feild is mandatory or not$")
    public void user_select_asset_category_and_check_feild_is_mandatory_or_not() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.assetCategory(), 30, 2);
        assetAutoMasterObj.assetCategory().click();
        String xpath= "//ion-label[text()=' "+testData.get("Asset Category")+" ']//following-sibling::ion-radio";
        for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
        verifyfield.verifyGivenFieldisMandatoryOrNot("Asset Category");
        String dropdown="//ion-label[contains(text(),'Asset Category')]//following-sibling::ion-select";
        System.out.println("Asset category field is "+driver.findElement(By.xpath(dropdown)).getAttribute("aria-haspopup"));
        
    }
    @And("^user select brand and check the feild is mandatory or not$")
    public void user_select_brand_and_check_the_feild_is_mandatory_or_not() throws Throwable {
    	System.out.println(testData.get("Brand"));
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.brand(), 30, 2);
    	assetAutoMasterObj.brand().click();
    	String xpath= "//ion-label[text()=' "+testData.get("Brand")+" ']//following-sibling::ion-radio";
        for (int i = 0; i < 30; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
        verifyfield.verifyGivenFieldisMandatoryOrNot("Brand");
        String dropdown="//ion-label[contains(text(),'Brand')]//following-sibling::ion-select";
        System.out.println("Brand field is "+driver.findElement(By.xpath(dropdown)).getAttribute("aria-haspopup"));
    }
 
    @And("^user select Asset type and check the feild is mandatory or not$")
    public void user_select_asset_type_and_check_the_feild_is_mandatory_or_not() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.assetType(), 30, 2);
    	assetAutoMasterObj.assetType().click();
    	String xpath= "//ion-label[text()=' "+testData.get("AssetType")+" ']//following-sibling::ion-radio";
        for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
        verifyfield.verifyGivenFieldisMandatoryOrNot("Asset Type");
        String dropdown="//ion-label[contains(text(),'Asset Type')]//following-sibling::ion-select";
        System.out.println("Asset Type field is "+driver.findElement(By.xpath(dropdown)).getAttribute("aria-haspopup"));
    }
     
    @And("^user enter remark for asset auto creation and check the feild is mandatory or not$")
    public void user_enter_remark_for_asset_auto_creation_and_check_the_feild_is_mandatory_or_not() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.remark(), 30, 2);
    	assetAutoMasterObj.remark().click();
    	for (int i = 0; i <50; i++) {
			try {
				assetAutoMasterObj.remark().sendKeys(testData.get("Remark"));
				break;
			} catch (Exception e) {
				
			}
		}
    	
    	verifyfield.verifyGivenFieldisMandatoryOrNot("Remarks");
    }
   
    @And("^user click save button for asset auto creation$")
    public void user_click_save_button_for_asset_auto_creation() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoMasterSave(),30, 2);
        Assert.assertEquals(assetAutoMasterObj.assetAutoMasterSave().isDisplayed(), true);
        assetAutoMasterObj.assetAutoMasterSave().click();
    }

    @And("^user validate success message in asset auto master$")
    public void user_validate_success_message_in_asset_auto_master() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.successMgs(),30, 2);
        Assert.assertEquals(assetAutoMasterObj.successMgs().isDisplayed(), true);
        System.out.println("record saved "+assetAutoMasterObj.successMgs().getText());
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.successClose(),30, 2);
        assetAutoMasterObj.successClose().click();
        
    }
    @And("^user click the first edit icon in asset auto master list$")
    public void user_click_the_first_edit_icon_in_asset_auto_master_list() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.firstEditIcon(),30,2);
        assetAutoMasterObj.firstEditIcon().click();
    }

    @And("^user verify the functionality of back button$")
    public void user_verify_the_functionality_of_back_button() throws Throwable {
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.backButtonInAssetAutoMaster(),30,2);
    	for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getClickAndActionsHelper().moveToElement(assetAutoMasterObj.backButtonInAssetAutoMaster());
				assetAutoMasterObj.backButtonInAssetAutoMaster().click(); 
				break;
			} catch (Exception e) {
				
			}
		}
    	
    }

    @And("^user click inbox to approve record for asset auto$")
    public void user_click_inbox_to_approve_record_for_asset_auto() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoInbox(),30,2);
    	assetAutoMasterObj.assetAutoInbox().click();
    }

    @And("^user search asset auto records$")
    public void user_search_asset_auto_records() throws Throwable {
    	for (int i = 0; i <20; i++) {
    		try {
            //seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
    			assetAutoMasterObj.assetAutoInboxView_Search().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
        	
            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoInboxView_SearchText(),60,2);
            assetAutoMasterObj.assetAutoInboxView_SearchText().click();
            assetAutoMasterObj.assetAutoInboxView_SearchText().sendKeys(assetAutoMasterData.SearchAssetAuto);
        
    }

    @And("^user store reference number and click the first record in asset auto maker view$")
    public void user_store_reference_number_and_click_the_first_record_in_asset_auto_maker_view() throws Throwable {
    	String reference = null;
        for (int i = 0; i < 200; i++) {
			try {
			 reference = assetAutoMasterObj.assetAutoReferanceId().getText();
			 break;
			} catch (Exception e) {
				
			}
		}
        
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.firstEditIconInMakerListView(),40, 2);
        assetAutoMasterObj.firstEditIconInMakerListView().click();
        
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40, 2);
        excelData.updateTestData("AT_RM_02_D1","Reference ID",reference);
        json.addReferanceData(reference);
        System.out.println(reference);
        
        
    }
    @And("^user submit asset auto record in maker$")
    public void user_submit_asset_auto_record_in_maker() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWaitElementToBeClickable(driver, assetAutoMasterObj.assetAutoMaker_Submit(), 60, 2);
    	assetAutoMasterObj.assetAutoMaker_Submit().click();
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoMakerMaker_EnterRemark(),30,2);
        assetAutoMasterObj.assetAutoMakerMaker_EnterRemark().click();
        assetAutoMasterObj.assetAutoMakerMaker_EnterRemark().sendKeys("ok");
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutomakerRemarkSubmit(),30, 2);
        assetAutoMasterObj.assetAutomakerRemarkSubmit().click();
        
    }

    @And("^user capture checker id for checker submit$")
    public void user_capture_checker_id_for_checker_submit() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAuto_Checker_Id(),60, 3);
        String sucessmgs = assetAutoMasterObj.assetAuto_Checker_Id().getText();
        System.out.println(sucessmgs);
        String Space = " ";
        String split[] = sucessmgs.split(" ");
        Space=split[split.length-1];
        String popupID = Space.replaceAll("[/.]", "");
        excelData.updateTestData("AT_RM_02_D1","Checker id",popupID);
        json.addData(popupID);
        System.out.println(popupID);
        
    }
    @Given("^user log in as uls application checker for asset auto record$")
    public void user_log_in_as_uls_application_checker_for_asset_auto_record() throws Throwable {
    	String kulsApplicationUrl = configFileReader.getLoanTransactionApplicationUrl();
		driver.get(kulsApplicationUrl);
		System.out.println(json.readdata());
		testData = excelData.getTestdata("AT_RM_02_D1");
		applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
    }

    @Then("^user Click on Remarks button in Action confirmation popup for asset auto record$")
    public void user_click_on_remarks_button_in_action_confirmation_popup_for_asset_auto_record() throws Throwable {
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.Checker_Final_Approve(), 30, 2);
    	assetAutoMasterObj.Checker_Final_Approve().click();
    
    }

    @Then("^user verify the Record got Approved for asset auto record$")
    public void user_verify_the_record_got_approved_for_asset_auto_record() throws Throwable {
    	String Toast;
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.checkerApproveMgs(), 60, 2);
		Toast = assetAutoMasterObj.checkerApproveMgs().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
    }
//******************************************checker approve *************************************************//
    @And("^user Click on Menu icon for asset auto record$")
    public void user_click_on_menu_icon_for_asset_auto_record() throws Throwable {
    	seleniumactions.getJavascriptHelper().JSEClick(assetAutoMasterObj.Checker_toggle());
    }

    @And("^user Click on Mailbox icon for asset auto record$")
    public void user_click_on_mailbox_icon_for_asset_auto_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.Checker_Inbox(), 30, 2);
    	assetAutoMasterObj.Checker_Inbox().click();
    }

    @And("^Search the respective reference id and click on Action button for asset auto record$")
    public void search_the_respective_reference_id_and_click_on_action_button_for_asset_auto_record() throws Throwable {
    	for (int i = 0; i <20; i++) {
			try {
				driver.findElement(By.xpath("//span[text()='"+testData.get("Reference ID")+"']/ancestor::tr/td[1]/button"))
				.click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Click on Approve icon for asset auto record$")
    public void user_click_on_approve_icon_for_asset_auto_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.Checker_Approve(), 30, 2);
    	assetAutoMasterObj.Checker_Approve().click();
		
    }

    @And("^user Enter the remarks in Action confirmation popup for asset auto record$")
    public void user_enter_the_remarks_in_action_confirmation_popup_for_asset_auto_record() throws Throwable {
    	for (int i = 0; i <20; i++) {
			try {
				assetAutoMasterObj.Checker_Alert_Approve().click();
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }
    //*********************************************************checker return ******************************************//
    @Then("^user Click on Remarks button in Action confirmation popup for asset auto record return$")
    public void user_click_on_remarks_button_in_action_confirmation_popup_for_asset_auto_record_return() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.Checker_Final_Return(), 60, 2);
    	assetAutoMasterObj.Checker_Final_Return().click();
    }

    @Then("^user verify the Record got Approved for asset auto record return$")
    public void user_verify_the_record_got_approved_for_asset_auto_record_return() throws Throwable {
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.checkerApproveMgs(), 60, 2);
		Assert.assertEquals(true,assetAutoMasterObj.checkerApproveMgs().getText().contains("Record RETURNED Successfully"));
		
    }

    @And("^user Click on return icon for asset auto record$")
    public void user_click_on_return_icon_for_asset_auto_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWaitElementToBeClickable(driver,assetAutoMasterObj.Checker_Return(),30,2);
        assetAutoMasterObj.Checker_Return().click();
				
			
    	
    }

    @And("^user Enter the remarks in Action confirmation popup for asset auto record return$")
    public void user_enter_the_remarks_in_action_confirmation_popup_for_asset_auto_record_return() throws Throwable {
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.Checker_Alert_Return(), 60, 2);
    	for (int i = 0; i < 50; i++) {
			try {
				assetAutoMasterObj.Checker_Alert_Return().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	
    }
    //*************************************************************Checker Reject *************************************************//
    @Then("^user Click on Remarks button in Action confirmation popup for asset auto record reject$")
    public void user_click_on_remarks_button_in_action_confirmation_popup_for_asset_auto_record_reject() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.Checker_Final_Reject(), 60, 2);
    	assetAutoMasterObj.Checker_Final_Reject().click();
    }

    @Then("^user verify the Record got Approved for asset auto record reject$")
    public void user_verify_the_record_got_approved_for_asset_auto_record_reject() throws Throwable {
    	String Toast;
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.checkerApproveMgs(), 60, 2);
		Toast = assetAutoMasterObj.checkerApproveMgs().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record REJECTED Successfully");
    }

    @And("^user Click on reject icon for asset auto record$")
    public void user_click_on_reject_icon_for_asset_auto_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWaitElementToBeClickable(driver,assetAutoMasterObj.Checker_Reject(), 30,2);    	
    	assetAutoMasterObj.Checker_Reject().click();
    }

    @And("^user Enter the remarks in Action confirmation popup for asset auto record reject$")
    public void user_enter_the_remarks_in_action_confirmation_popup_for_asset_auto_record_reject() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetAutoMasterObj.Checker_Alert_Reject(), 60, 2);
    	assetAutoMasterObj.Checker_Alert_Reject().click();
    }
    @Then("^User verify the impact when user keep any mandatory field blank and click on save button$")
    public void user_verify_the_impact_when_user_keep_any_mandatory_field_blank_and_click_on_save_button() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoMasterSave(),30, 2);
        assetAutoMasterObj.assetAutoMasterSave().click();
    	//String xpath ="//ion-label[contains(text(),'Asset Category')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),30, 2);
        String Requiredfields = (String) seleniumactions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-badge')[1].innerText");
    	//System.out.println(driver.findElement(By.xpath(xpath)).getText());
        Assert.assertEquals(Requiredfields,"Required field"); 
        //String xpath1 ="//ion-label[contains(text(),'Asset Type')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath1)),30, 2);
        String Requiredfields2 = (String) seleniumactions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-badge')[2].innerText");
        
       // System.out.println(driver.findElement(By.xpath(xpath1)).getText());
        Assert.assertEquals(Requiredfields2,"Required field");
    }

    @And("^user click the first edit icon for asset auto created record$")
    public void user_click_the_first_edit_icon_for_asset_auto_created_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.firstEditIcon(),60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				assetAutoMasterObj.firstEditIcon().click();
				break;
			} catch (Exception e) {
				
			}
		}
				
				
    	
    }

    @And("^user Select and modify the asset category in asset auto master$")
    public void user_select_and_modify_the_asset_category_in_asset_auto_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetCategoryUpdation(),30, 2);
    	assetAutoMasterObj.assetCategoryUpdation().click();
    	String xpath= "//ion-label[contains(text(),'"+assetAutoMasterData.AssetCategoryModify+"')]//following-sibling::ion-radio";
        for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
    }
    @And("^user verify the same record should get saved in system with only modified data$")
    public void user_verify_the_same_record_should_get_saved_in_system_with_only_modified_data() throws Throwable {
    	// Asset Category
    	//assetAutoMasterData.AssetCategoryModify
    	String xpath ="//ion-select[@aria-label=' "+assetAutoMasterData.AssetCategoryModify+" ,  Asset Category *']";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
        Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(),true);
        //Asset Type
        for (int i = 0; i <50; i++) {
			try {
				String xpath1 ="//ion-select[@aria-label=' "+assetAutoMasterData.AssetTypeModify+" ,  Asset Type *']";
		        Assert.assertEquals(driver.findElement(By.xpath(xpath1)).isDisplayed(),true);
		        break;
			} catch (NoSuchElementException e) {
				
			}
		}
        // brand
        String xpath1 ="//ion-select[@aria-label=' "+assetAutoMasterData.BrandModify+" ,  Brand ']";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
        Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(),true);
        
		// Remark
       String remarkvalue = (String) seleniumactions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-textarea')[0].value");
        Assert.assertEquals(remarkvalue, assetAutoMasterData.RemarkModify);
        
    }

    @And("^user select and update the brand field in asset auto master$")
    public void user_select_and_update_the_brand_field_in_asset_auto_master() throws Throwable {
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.brandUpdate(),30, 2);
    	for (int i = 0; i <50; i++) {
			try {
				assetAutoMasterObj.brandUpdate().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	
    	String xpath= "//ion-label[contains(text(),'"+assetAutoMasterData.BrandModify+"')]//following-sibling::ion-radio";
        for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user select and update the asset type in asset auto master$")
    public void user_select_and_update_the_asset_type_in_asset_auto_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWaitElementToBeClickable(driver,assetAutoMasterObj.assetTypeUpdate(),60,2);
    	assetAutoMasterObj.assetTypeUpdate().click();
    	String xpath= "//ion-label[contains(text(),'"+assetAutoMasterData.AssetTypeModify+"')]//following-sibling::ion-radio";
        for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user enter the remark in asset auto master$")
    public void user_enter_the_remark_in_asset_auto_master() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.remark(),30, 2);
        String remark = (String) seleniumactions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-textarea')[0].value");
        if (remark.isEmpty()) {
        	assetAutoMasterObj.remark().click();
        	assetAutoMasterObj.remark().sendKeys(assetAutoMasterData.RemarkModify);
		}
        else {
        	 assetAutoMasterObj.remark().clear();
        	 for (int i = 0; i < 20; i++) {
				try {
					assetAutoMasterObj.remark().click();
					assetAutoMasterObj.remark().sendKeys(assetAutoMasterData.RemarkModify);
					break;
				} catch (Exception e) {
					
				}
			}
        	 
		}
       
        
    }

    @And("^user update the record in asset auto master$")
    public void user_update_the_record_in_asset_auto_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoMasterUpdate(),30, 2);
    	assetAutoMasterObj.assetAutoMasterUpdate().click();
    }

    @And("^user verify the success message for updated record in asset auto master$")
    public void user_verify_the_success_message_for_updated_record_in_asset_auto_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.successMgs(),60, 2);
    	Assert.assertEquals(assetAutoMasterObj.successMgs().isDisplayed(), true);
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.successClose(),60, 2);
    	assetAutoMasterObj.successClose().click();
    	
    }

    @And("^user click the list view in asset auto master$")
    public void user_click_the_list_view_in_asset_auto_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoMasterViewIcon(),30, 2);
    	assetAutoMasterObj.assetAutoMasterViewIcon().click();
    }
    @Then("^user verify System should show the proper validation message for blank field which is mandatory and should not allow user to save the record$")
    public void user_verify_system_should_show_the_proper_validation_message_for_blank_field_which_is_mandatory_and_should_not_allow_user_to_save_the_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetCategoryUpdation(),30, 2);
    	assetAutoMasterObj.assetCategoryUpdation().click();
    	String xpath= "//ion-label[contains(text(),'Select')]//following-sibling::ion-radio";
        for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.brandUpdate(),30, 2);
    	assetAutoMasterObj.brandUpdate().click();
        for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoMasterUpdate(),30, 2);
        assetAutoMasterObj.assetAutoMasterUpdate().click();
    	String xpath3 ="//ion-label[contains(text(),'Asset Category')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),30, 2);
        System.out.println(driver.findElement(By.xpath(xpath3)).getText());
        Assert.assertEquals(driver.findElement(By.xpath(xpath3)).getText(),"Required field");
        String xpath1 ="//ion-label[contains(text(),'Asset Type')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath1)),30, 2);
        System.out.println(driver.findElement(By.xpath(xpath1)).getText());
        Assert.assertEquals(driver.findElement(By.xpath(xpath1)).getText(),"Required field");
       
    }
    @And("^user verify the functionality of Activate and Deactivate button for asset auto$")
    public void user_verify_the_functionality_of_activate_and_deactivate_button_for_asset_auto() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoStatusSwitchButton(),60,3);
    	assetAutoMasterObj.assetAutoStatusSwitchButton().click();
    	assetAutoMasterObj.assetAutoStatusSwitchButton().click();
    }
    @Then("^user verify the label status active deactive  for asset auto$")
    public void user_verify_the_label_status_active_deactive_for_asset_auto() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoStatusSwitchButton(),60,3);
    	assetAutoMasterObj.assetAutoStatusSwitchButton().click();
    	String status = assetAutoMasterObj.assetAutoStatusSwitchButton().getAttribute("aria-checked");
    	if (status.equalsIgnoreCase("true")) {
			System.out.println("viewed record is active");
		}
    	else {
    		System.out.println("viewed record is inactive");
		}
    }
    
    @Then("^user verify the fuctionality of add button in asset auto master list view$")
    public void user_verify_the_fuctionality_of_add_button_in_asset_auto_master_list_view() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.addIcon(),30, 2);
        assetAutoMasterObj.addIcon().click();
        
    }

    @And("^user verify add button is displayed for asset auto master$")
    public void user_verify_add_button_is_displayed_for_asset_auto_master() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.addIcon(),30, 2);
        Assert.assertTrue(assetAutoMasterObj.addIcon().isDisplayed(),"Add icon displayed not in list view screen");
    }

    @And("^user verify search for record icon is displayed  for asset auto master$")
    public void user_verify_search_for_record_icon_is_displayed_for_asset_auto_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.searchIcon(),30, 2);
        Assert.assertTrue(assetAutoMasterObj.searchIcon().isDisplayed(),"Search icon not displayed in list view screen");
    }

    @And("^user verify export to pdf option is displayed  for asset auto master$")
    public void user_verify_export_to_pdf_option_is_displayed_for_asset_auto_master() throws Throwable {
    	for (int i = 0; i < 50; i++) {
			try {
				assetAutoMasterObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.pdfOption(),30, 2);
        Assert.assertTrue(assetAutoMasterObj.pdfOption().isDisplayed(),"Export to pdf icon not  displayed in list view screen");
    }

    @And("^user verify export to excel option is displayed for asset auto master$")
    public void user_verify_export_to_excel_option_is_displayed_for_asset_auto_master() throws Throwable {
    	for (int i = 0; i < 50; i++) {
			try {
				assetAutoMasterObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.xlsOption(),30, 2);
        Assert.assertTrue(assetAutoMasterObj.xlsOption().isDisplayed(),"Export to xls icon displayed in list view screen");
    }

    @And("^user verify Asset category is displayed and non editable$")
    public void user_verify_asset_category_is_displayed_and_non_editable() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetCategoryInListView(),30, 2);
        Assert.assertTrue(assetAutoMasterObj.assetCategoryInListView().isDisplayed(),"Asset category vaule is not dispalyed in list view screen");
        try {
        	 assetAutoMasterObj.assetCategoryInListView().sendKeys("New Asset");
		} catch (Exception e) {
			System.out.println("Asset Category value in list view is non-Editable");
		}
       
    }

   

    @And("^user verify Asset type is displayed and non editable$")
    public void user_verify_asset_type_is_displayed_and_non_editable() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetTypeInListView(),30, 2);
        Assert.assertTrue(assetAutoMasterObj.assetTypeInListView().isDisplayed(),"Asset type vaule is not  dispalyed in list view screen");
        try {
        	 assetAutoMasterObj.assetCategoryInListView().sendKeys("Insurance");
		} catch (Exception e) {
			System.out.println("Asset type value in list view is non-Editable");
		}
    }

    @And("^user verify remark is displayed and non editable$")
    public void user_verify_remark_is_displayed_and_non_editable() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.remarkInListView(),30, 2);
        Assert.assertTrue(assetAutoMasterObj.remarkInListView().isDisplayed(),"remark vaule is not dispalyed in list view screen");
        try {
        	 assetAutoMasterObj.assetCategoryInListView().sendKeys("Insurance");
		} catch (Exception e) {
			System.out.println("remark value in list view is non-Editable");
		}
    }

    @And("^user verify post clicking pdf option pdf file will be downloaded for asset auto master$")
    public void user_verify_post_clicking_pdf_option_pdf_file_will_be_downloaded_for_asset_auto_master() throws Throwable {
    	for (int i = 0; i < 20; i++) {
			try {
				assetAutoMasterObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				assetAutoMasterObj.pdfOption(), 60, 3);
		assetAutoMasterObj.pdfOption().click();
		String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		int i=0;
		int lastIndex = totalfiles.length-1;
		for (File fileName : totalfiles) {
			i++;
			if (fileName.getName().equalsIgnoreCase(assetAutoMasterData.PdfFileName)) {
				
				break;
			}
			else if (i==lastIndex) {
				System.out.println("Downloaded file not present in system");
			}
		}
		seleniumactions.getBrowserHelper().switchToParentWithChildClose();
	
        
        
    }
  
	@And("^user verify the search results show matched data for asset auto master$")
    public void user_verify_the_search_results_show_matched_data_for_asset_auto_master() throws Throwable {
    	for (int i = 0; i < 20; i++) {
			try {
				assetAutoMasterObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetAutoViewSearchText(), 30, 2);
		assetAutoMasterObj.assetAutoViewSearchText().sendKeys(assetAutoMasterData.SerachMatchData);

		String xpath = "//span[contains(text(),'"+assetAutoMasterData.SerachMatchData+"')]";
		for (int i = 0; i < 20; i++) {
            try {
            	Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
            	break;
			} catch (NoSuchElementException e) {
				
			}
			
		}
		


    }

    @And("^user verify the search results shows no data for asset auto master$")
    public void user_verify_the_search_results_shows_no_data_for_asset_auto_master() throws Throwable {
    	driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
		for (int i = 0; i < 20; i++) {
			try {
				assetAutoMasterObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				assetAutoMasterObj.assetAutoViewSearchText(), 30, 2);
		assetAutoMasterObj.assetAutoViewSearchText().sendKeys(assetAutoMasterData.SearchUnmatchedData);
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), assetAutoMasterData.UnmatchedDataError);
				break;
			} catch (NoSuchElementException e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
    }

    @And("^user verify post clicking xls option excel file will be downloaded for asset auto master$")
    public void user_verify_post_clicking_xls_option_excel_file_will_be_downloaded_for_asset_auto_master() throws Throwable {
    	for (int i = 0; i < 50; i++) {
			try {
				assetAutoMasterObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,productMasterRetailObj.xlsOption(),60,3);
		for (int i = 0; i < 50; i++) {
			try {
				assetAutoMasterObj.xlsOption().click();
				break;
			} catch (Exception e) {

			}
		}
		// CollateralDataFile_export
		String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		int lastIndex = totalfiles.length-1;
		int i=0;
		for (File fileName : totalfiles) {
			i++;
			if (fileName.getName().contains(assetAutoMasterData.XlsFileName)) {
				System.out.println("Downloaded file present in system");
				break;
			}
				else if (i==lastIndex) {
					System.out.println("Downloaded file not present in system");
				}
			}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();
    }
//*******************************************Asset Model Master*******************************************************//
    @And("^user enter the asset model and verify the field editable mandatory and text box$")
    public void user_enter_the_asset_model_and_verify_the_field_editable_mandatory_and_text_box() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetModel(),30, 2);
        assetAutoMasterObj.assetModel().click();
        assetAutoMasterObj.assetModel().sendKeys(assetAutoMasterData.AssetModel);
        verifyfield.verifyGivenFieldisMandatoryOrNot("Asset Model");
        Assert.assertEquals(assetAutoMasterObj.assetModel().getAttribute("type"), "text");
        System.out.println("Asset Model field is " + assetAutoMasterObj.assetModel().getAttribute("type")+"box");
		
        
    }

    @And("^user select the asset model type and verify the field is mandatory or not and should be editable dropdown$")
    public void user_select_the_asset_model_type_and_verify_the_field_is_mandatory_or_not_and_should_be_editable_dropdown() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetModelType(),30, 2);
    	Assert.assertEquals( assetAutoMasterObj.assetModelType().getAttribute("aria-haspopup"),"listbox");
        System.out.println("Asset Model Type field is "+assetAutoMasterObj.assetModelType().getAttribute("aria-haspopup"));
    	for (int i = 0; i <20; i++) {
			try {
				 assetAutoMasterObj.assetModelType().click();
				 break;
			} catch (Exception e) {
				
			}
		}
       
        String xpath ="//ion-label[contains(text(),'"+assetAutoMasterData.AssetModelType+"')]//following-sibling::ion-radio";
        for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
		        driver.findElement(By.xpath(xpath)).click();
				 break;
			} catch (Exception e) {
				
			}
		}

        verifyfield.verifyGivenFieldisMandatoryOrNot("Asset Model Type");
        
    }

    @And("^user enter the Model Year and verify the field editable mandatory and text box$")
    public void user_enter_the_model_year_and_verify_the_field_editable_mandatory_and_text_box() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.modelYear(),30, 2);
    	assetAutoMasterObj.modelYear().click();
    	assetAutoMasterObj.modelYear().sendKeys(assetAutoMasterData.ModelYear);
        verifyfield.verifyGivenFieldisMandatoryOrNot("Model Year");
        Assert.assertEquals(assetAutoMasterObj.modelYear().getAttribute("type"),"number");
        System.out.println("Asset Model field is " + assetAutoMasterObj.modelYear().getAttribute("type")+"box");
    }

    @And("^user select the asset condition and verify the field editable mandatory and drop down$")
    public void user_select_the_asset_condition_and_verify_the_field_editable_mandatory_and_drop_down() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetCondition(),30, 2);
    	Assert.assertEquals( assetAutoMasterObj.assetCondition().getAttribute("aria-haspopup"),"listbox");
        System.out.println("Asset Model Type field is " +assetAutoMasterObj.assetCondition().getAttribute("aria-haspopup"));
    	assetAutoMasterObj.assetCondition().click();
    	String xpath ="//ion-label[contains(text(),'"+assetAutoMasterData.AssetCondition+"')]//following-sibling::ion-radio";
    	for (int i = 0; i <30; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
		        driver.findElement(By.xpath(xpath)).click();
		        break;
			} catch (Exception e) {
				
			}
		}
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)), 30, 2);
        
        verifyfield.verifyGivenFieldisMandatoryOrNot("Asset Condition");
        
    }

    @And("^user select the country in asset model master and verify the field is mandatory or not and should be editable dropdown$")
    public void user_select_the_country_in_asset_model_master_and_verify_the_field_is_mandatory_or_not_and_should_be_editable_dropdown() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.countryInAssetModelMaster(),30, 2);
    	Assert.assertEquals( assetAutoMasterObj.countryInAssetModelMaster().getAttribute("aria-haspopup"),"listbox");
        System.out.println("Asset Model Type field is " + assetAutoMasterObj.countryInAssetModelMaster().getAttribute("aria-haspopup"));
    	assetAutoMasterObj.countryInAssetModelMaster().click();
    	String xpath ="//ion-label[contains(text(),'"+assetAutoMasterData.Country+"')]//following-sibling::ion-radio";
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
		        driver.findElement(By.xpath(xpath)).click();
		        break;
			} catch (Exception e) {
				
			}
		}
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)), 30, 2);
        
        verifyfield.verifyGivenFieldisMandatoryOrNot("Country");
        
    }

    @And("^user select the drive train and verify the field is mandatory or not and should be editable dropdown$")
    public void user_select_the_drive_train_and_verify_the_field_is_mandatory_or_not_and_should_be_editable_dropdown() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.driveTrain(),30, 2);
    	Assert.assertEquals( assetAutoMasterObj.driveTrain().getAttribute("aria-haspopup"),"listbox");
        System.out.println("Asset Model Type field is " + assetAutoMasterObj.driveTrain().getAttribute("aria-haspopup"));
    	assetAutoMasterObj.driveTrain().click();
    	String xpath ="//ion-label[contains(text(),'"+assetAutoMasterData.DriveTrain+"')]//following-sibling::ion-radio";
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)), 30, 2);
    	for (int i = 0; i <30; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
		        driver.findElement(By.xpath(xpath)).click();
		        break;
			} catch (Exception e) {
				
			}
		}
        
        verifyfield.verifyGivenFieldisMandatoryOrNot("Drive Train");
        
    }

    @And("^user select number of cylinders verify the field is mandatory or not and should be editable dropdown$")
    public void user_select_number_of_cylinders_verify_the_field_is_mandatory_or_not_and_should_be_editable_dropdown() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.noOfCylinder(),30, 2);
    	Assert.assertEquals(assetAutoMasterObj.noOfCylinder().getAttribute("aria-haspopup"),"listbox");
        System.out.println("Asset Model Type field is " +assetAutoMasterObj.noOfCylinder().getAttribute("aria-haspopup"));
    	assetAutoMasterObj.noOfCylinder().click();
    	String xpath ="//ion-label[contains(text(),'"+assetAutoMasterData.Numberofcylinder+"')]//following-sibling::ion-radio";
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)), 30, 2);
    	for (int i = 0; i <30; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
		        driver.findElement(By.xpath(xpath)).click();
		        break;
			} catch (Exception e) {
				
			}
		}
        
        verifyfield.verifyGivenFieldisMandatoryOrNot("No Of Cylinder");
        
    }

    @And("^user enter the volume of engine verify the field is mandatory or not and should be editable text box$")
    public void user_enter_the_volume_of_engine_verify_the_field_is_mandatory_or_not_and_should_be_editable_text_box() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.volumeOfEngine(),30, 2);
    	assetAutoMasterObj.volumeOfEngine().click();
    	for (int i = 0; i < 20; i++) {
			try {
				assetAutoMasterObj.volumeOfEngine().sendKeys(assetAutoMasterData.VolumeOfEngine);
				break;
			} catch (Exception e) {
				
			}
		}
    	
        verifyfield.verifyGivenFieldisMandatoryOrNot("Volume Of Engine");
        Assert.assertEquals(assetAutoMasterObj.volumeOfEngine().getAttribute("type"), "text");
        System.out.println("Asset Model field is " + assetAutoMasterObj.volumeOfEngine().getAttribute("type")+"box");
    }

    @And("^user enter the down payment percentage and verify field should be numerical mandatory and editable$")
    public void user_enter_the_down_payment_percentage_and_verify_field_should_be_numerical_mandatory_and_editable() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.downPaymentPercentage(),30, 2);
    	assetAutoMasterObj.downPaymentPercentage().click();
    	for (int i = 0; i < 20; i++) {
    		try {
				assetAutoMasterObj.downPaymentPercentage().sendKeys(assetAutoMasterData.DownPaymentPercentage);
				break;
			} catch (Exception e) {
				
			}
    	}
			
    
    	
        verifyfield.verifyGivenFieldisMandatoryOrNot(" Down Payment % ");
        Assert.assertEquals(assetAutoMasterObj.downPaymentPercentage().getAttribute("type"), "text");
        System.out.println("Asset Model field is " + assetAutoMasterObj.downPaymentPercentage().getAttribute("type")+"box");
    }

    @And("^user enter the residual value percentage and verify the field is mandatory or not and should be editable text box$")
    public void user_enter_the_residual_value_percentage_and_verify_the_field_is_mandatory_or_not_and_should_be_editable_text_box() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.residualValuePercentage(),30, 2);
    	assetAutoMasterObj.residualValuePercentage().click();
    	for (int i = 0; i < 20; i++) {
    		try {
    			assetAutoMasterObj.residualValuePercentage().sendKeys(assetAutoMasterData.DownPaymentPercentage);
				break;
			} catch (Exception e) {
				
			}
    	}
    	
        verifyfield.verifyGivenFieldisMandatoryOrNot(" Residual Value % ");
        Assert.assertEquals(assetAutoMasterObj.residualValuePercentage().getAttribute("type"),"text");
        System.out.println("Asset Model field is " +assetAutoMasterObj.residualValuePercentage().getAttribute("type")+"box");
    }

    @And("^user enter the remarks in asset model master$")
    public void user_enter_the_remarks_in_asset_model_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.remark(),30, 2);
    	assetAutoMasterObj.remark().click();
    	assetAutoMasterObj.remark().sendKeys(assetAutoMasterData.DownPaymentPercentage);
        verifyfield.verifyGivenFieldisMandatoryOrNot("Remarks");
        Assert.assertEquals(assetAutoMasterObj.remark().getAttribute("type"),"textarea");
        System.out.println("Asset Model field is " +assetAutoMasterObj.remark().getAttribute("type")+"box");
    }
    @And("^user click asset model master$")
    public void user_click_asset_model_master() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetAutoMasterObj.assetModelMaster(),30, 2);
        assetAutoMasterObj.assetModelMaster().click();
    }
    @And("^User Update Test data for Asset Auto Master creation checker return$")
    public void user_update_test_data_for_asset_auto_master_creation_checker_return() throws Throwable {
    	testData = excelData.getTestdata("AT_RM_01_D2");
    }
    @And("^User Update Test data for Asset Auto Master creation approve$")
    public void user_update_test_data_for_asset_auto_master_creation_approve() throws Throwable {
    	testData = excelData.getTestdata("AT_RM_01_D1");
    }
    
}
