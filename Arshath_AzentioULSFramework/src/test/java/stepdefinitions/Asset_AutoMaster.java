package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.Asset_AutoMaster_Obj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class Asset_AutoMaster extends BaseClass {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Asset_AutoMaster_Obj AssetObj = new Asset_AutoMaster_Obj(driver);
	

    @And("^user click on Asset Auto Master Edit icon$")
    public void user_click_on_asset_auto_master_edit_icon() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AssetObj.asset_AutoMaster_Edit(), 60, 2);
    	AssetObj.asset_AutoMaster_Edit().click();
    }

    @And("^user click on Temp view First Record Edit Icon$")
    public void user_click_on_temp_view_first_record_edit_icon() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AssetObj.asset_AutoMaster_Temp_Edit(), 60, 2);
    	AssetObj.asset_AutoMaster_Temp_Edit().click();
    }

    @And("^user click on Asset Model Master Tab$")
    public void user_click_on_asset_model_master_tab() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AssetObj.assetModelMaster(), 60, 2);
    	AssetObj.assetModelMaster().click();
    }

    @And("^user click on Asset Model Master Add icon$")
    public void user_click_on_asset_model_master_add_icon() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AssetObj.asset_AutoMaster_Add_Icon(), 60, 2);
    	AssetObj.asset_AutoMaster_Add_Icon().click();
    }

    @And("^user Enter Numeric value in character fields$")
    public void user_enter_numeric_value_in_character_fields() throws Throwable {

    }

    @And("^user Enter Characters value in Numeric Fields$")
    public void user_enter_characters_value_in_numeric_fields() throws Throwable {
        
    }

    @And("^user click on Asset Model Master Save button$")
    public void user_click_on_asset_model_master_save_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AssetObj.asset_AutoMaster_Add_Icon(), 60, 2);
    	
    }

    @And("^user Validate the Message and verify it$")
    public void user_validate_the_message_and_verify_it() throws Throwable {
        
    }
	
	
	
	
	
	
	
	
	
	
	
	
}
