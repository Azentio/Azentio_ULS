package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.Owner_ShipObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class Ownership_VerifyDetails {
	WebDriver driver = BaseClass.driver;
	WaitHelper  WaitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader ConfigFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Application_Login applicationlogin = new KULS_Application_Login(driver);
KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
Owner_ShipObj Owner_Shipobj = new Owner_ShipObj(driver);
JsonDataReaderWriter json = new JsonDataReaderWriter();
Selenium_Actions Seleniumactions = new Selenium_Actions(driver);
SoftAssert softAssert = new SoftAssert();

@And("^User click the first edit icon for reference id searched$")
public void user_click_the_first_edit_icon_for_reference_id_searched() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.AppDataEntry_ActionIcon(),30, 2);
	Owner_Shipobj.AppDataEntry_ActionIcon().click();
}

@And("^User search Reference Number in inbox list view$")
public void user_search_reference_number_in_inbox_list_view() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.Application_DetailTab_SearchButtons(),30, 2);
	Owner_Shipobj.Application_DetailTab_SearchButtons().click();
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.Application_DetailTab_SearchText(),30, 2);
	Owner_Shipobj.Application_DetailTab_SearchText().click();
	Owner_Shipobj.Application_DetailTab_SearchText().sendKeys("602");
}

@And("^user click inbox button in Owener ship details$")
public void user_click_inbox_button_in_owener_ship_details() throws Throwable {
   Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.inboxbuttonForOwnerShip(), 60, 2);
   Owner_Shipobj.inboxbuttonForOwnerShip().click();
}

@And("^user click Search button in Owener ship details$")
public void user_click_search_button_in_owener_ship_details() throws Throwable {
    Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.searchbuttonForOwnerShip(), 60, 2);
    Owner_Shipobj.searchbuttonForOwnerShip().click();
}

@And("^user click Search icon in Appdata for Owener ship details$")
public void user_click_search_icon_in_appdata_for_owener_ship_details() throws Throwable {
  Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.searchiconForOwnerShip(), 60, 2);
  Owner_Shipobj.searchiconForOwnerShip().click();
  Owner_Shipobj.searchiconForOwnerShip().sendKeys("161");
}

@And("^user click Entitleicon For OwnerShip details$")
public void user_click_entitleicon_for_ownership_details() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.EntitleiconForOwnerShip(), 60, 2);
	Owner_Shipobj.EntitleiconForOwnerShip().click();
}
@And("^user click Next button for Owener ship details tab$")
public void user_click_next_button_for_owener_ship_details_tab() throws Throwable {
 Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.NextForOwnerShip(), 60, 2);
 
 for (int i = 0; i < 10; i++) {
	 try {
		 Owner_Shipobj.NextForOwnerShip().click();
		 javaHelper.scrollIntoView(Owner_Shipobj.Owenershiptab());
		 Owner_Shipobj.Owenershiptab().click();
		 break;
	 }catch(Exception e) {
		 
	 }
	
}
}

@And("^user click Owener ship details tab$")
public void user_click_owener_ship_details_tab() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.Owenershiptab(), 60, 2);
	Owner_Shipobj.Owenershiptab().click();
}

@And("^user click save button in Owener ship details$")
public void user_click_save_button_in_owener_ship_details() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.Owenershiptab(), 60, 2); 
	Owner_Shipobj.savebuttonForRequiredField().click();
    
}

@And("^user verify OwnerPower Of Attorney Details parameters show validation massage for blank$")
public void user_verify_ownerpower_of_attorney_details_parameters_show_validation_massage_for_blank() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.owenerPowerOfAttorneyDetailsForRequiredFieldText(), 60, 2); 
  Assert.assertEquals("Required field", Owner_Shipobj.owenerPowerOfAttorneyDetailsForRequiredFieldText().getText());
}

@And("^user verify Name for paramers show validation massage for blank$")
public void user_verify_name_for_paramers_show_validation_massage_for_blank() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.nameForRequiredFieldText(), 60, 2); 
  Assert.assertEquals("Required field", Owner_Shipobj.nameForRequiredFieldText().getText());
 
}

@And("^user verify Id type for paramers show validation massage for blank$")
public void user_verify_id_type_for_paramers_show_validation_massage_for_blank() throws Throwable {
  Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.idTypeForRequiredFieldText(), 60, 2); 
  Assert.assertEquals("Required field",Owner_Shipobj.idTypeForRequiredFieldText().getText());
  
}

@And("^user verify Id Number for show validation massage for blank$")
public void user_verify_id_number_for_show_validation_massage_for_blank() throws Throwable {
  Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.idNumberForRequiredField(), 60, 2); 
  Assert.assertEquals("Required field", Owner_Shipobj.idNumberForRequiredField().getText());  
}

@And("^user verify issue Date for show validation massage for blank$")
public void user_verify_issue_date_for_show_validation_massage_for_blank() throws Throwable {
  Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.issueDateForRequiredField(), 60, 2); 
  Assert.assertEquals("Required field", Owner_Shipobj.issueDateForRequiredField().getText());   
}

@And("^user verify issue Place for show validation massage for blank$")
public void user_verify_issue_place_for_show_validation_massage_for_blank() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.IssuePlaceForRequiredField(), 60, 2); 
  Assert.assertEquals("Required field", Owner_Shipobj.IssuePlaceForRequiredField().getText());
}

@And("^user verify Mobile for show validation message for blank$")
public void user_verify_mobile_for_show_validation_massage_for_blank() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.MobileForRequiredField(), 60, 2); 
    Assert.assertEquals("Required field", Owner_Shipobj.MobileForRequiredField().getText());   
}

@And("^User Enter Numeric Value Instead of Character value in Name Parameter$")
public void user_enter_numeric_value_instead_of_character_value_in_name_parameter() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.Name(), 60, 2);
	Owner_Shipobj.Name().click();
	Owner_Shipobj.Name().sendKeys("1235ab");
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Owner_Shipobj.nameText(), 60, 2);
	softAssert.assertEquals(Owner_Shipobj.nameText().getAttribute("ng-reflect-model"),"ab");
}

@And("^User Enter Numeric Value Instead of Character Value In Issue Place Field$")
public void user_enter_numeric_value_instead_of_character_value_in_issue_place_field() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.IssuePlace(), 60, 2);
	Owner_Shipobj.IssuePlace().click();
	Owner_Shipobj.IssuePlace().sendKeys("1235abc");
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.IssuePlaceText(), 60, 2);
	softAssert.assertEquals(Owner_Shipobj.IssuePlaceText().getAttribute("ng-reflect-model"),"abc");
}

@And("^User Enter Character Value Instead of Numeric Value In Mobile Number Field$")
public void user_enter_character_value_instead_of_numeric_value_in_mobile_number_field() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.Mobile(), 60, 2);
	Owner_Shipobj.Mobile().click();
	Owner_Shipobj.Mobile().sendKeys("12345abc");
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.mobileText(), 60, 2);
	Assert.assertEquals(Owner_Shipobj.mobileText().getAttribute("ng-reflect-model"),"12345");
	
}

@And("^User Enter Character Value Instead of Numeric Value In Mobile Number Two Field$")
public void user_enter_character_value_instead_of_numeric_value_in_mobile_number_two_field() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.Mobile2(), 60, 2);
	Owner_Shipobj.Mobile2().click();
	Owner_Shipobj.Mobile2().sendKeys("12345abc");
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.Mobile2Text(), 60, 2);
	Assert.assertEquals(Owner_Shipobj.Mobile2Text().getAttribute("ng-reflect-model"),"12345" );
	
}

@And("^User Enter Character Value Instead of Numeric Value In Phone Number Field$")
public void user_enter_character_value_instead_of_numeric_value_in_phone_number_field() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.Phone(), 60, 2);
	Owner_Shipobj.Phone().click();
	Owner_Shipobj.Phone().sendKeys("12345abc");
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.phoneText(), 60, 2);
	Assert.assertEquals(Owner_Shipobj.phoneText().getAttribute("ng-reflect-model"),"12345");
	
}

@And("^User Enter Special Character Value Instead of Character Value in Name Field$")
public void user_enter_special_character_value_instead_of_character_value_in_name_field() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.Name(), 60, 2);
	Owner_Shipobj.Name();
	Owner_Shipobj.Name().sendKeys("@@%$&^$");
	boolean status =true;
	try {
		Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.nameForRequiredFieldText(), 10, 2);
		softAssert.assertEquals("Alphanumeric characters allowed", Owner_Shipobj.nameForRequiredFieldText().getText());
		status=false;
	} catch (Exception e) {
		if (status) {
			Assert.assertTrue(status, "Name Field does not throw validation alphanumeric Characters Allowed");
		}
	}
	
	
}

@And("^User Enter Special Character Value Instead of Character Value in Issue Place Field$")
public void user_enter_special_character_value_instead_of_character_value_in_issue_place_field() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.IssuePlace(), 60, 2);
	Owner_Shipobj.IssuePlace();
	Owner_Shipobj.IssuePlace().sendKeys("@@%$&^$");
	boolean status = true;

	try {
		Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.IssuePlaceForRequiredField(), 10, 2);
		softAssert.assertEquals("Alphanumeric characters allowed", Owner_Shipobj.IssuePlaceForRequiredField().getText());
		status=false;
		
	} catch (Exception e) {
		Assert.assertTrue(status, "Issue Place does not throw validation Alphanumeric Characters Allowed");
	}
	
}

@And("^User Enter Special Character Value Instead of Character Value in Id Number Field$")
public void user_enter_special_character_value_instead_of_character_value_in_id_number_field() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.IDNumber(), 60, 2);
	Owner_Shipobj.IDNumber();
	Owner_Shipobj.IDNumber().sendKeys("@@%$&^$");
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.idNumberForRequiredField(), 60, 2);
	Assert.assertEquals("Alphanumeric characters allowed", Owner_Shipobj.idNumberForRequiredField().getText());
	softAssert.assertAll("Test Case failed due to Name, issue place Allows Numeric field");
}
@And("^User Enter Character Value Instead of Numeric Value In Id Number$")
public void user_enter_character_value_instead_of_numeric_value_in_id_number() throws Throwable {
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.IDNumber(), 60, 2);
	Owner_Shipobj.IDNumber().click();
	Owner_Shipobj.IDNumber().sendKeys("12345abc");
	Seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,Owner_Shipobj.IDNumberText(), 60, 2);
	softAssert.assertEquals(Owner_Shipobj.IDNumberText().getAttribute("ng-reflect-model"),"12345");
	
}



}
