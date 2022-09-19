package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.Customer_address_detail_Obj;
import pageobjects.PersonalDetails_AppDataEntry_Obj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.Customer_address_Testdata;
import testDataType.KULS_Login_TestDataType;

public class Customer_Address_Information extends BaseClass{

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();	
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	Customer_address_detail_Obj addressObj = new Customer_address_detail_Obj(driver);
	PersonalDetails_AppDataEntry_Obj AppDataEntry = new PersonalDetails_AppDataEntry_Obj(driver);
	Customer_address_Testdata custaddressdata = jsonConfig.getCustaddressByName("Maker");
	
	   @And("^user Enter Customer Address details Application ID$")
	    public void user_enter_customer_address_details_application_id() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Search_Input(), 60, 5);
	    	AppDataEntry.Search_Input().click();
	    	AppDataEntry.Search_Input().sendKeys(custaddressdata.ApplicationId);
	    }

	    @And("^user click on Additional customer Info Tab$")
	    public void user_click_on_additional_customer_info_tab() throws Throwable {
			   waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Additional_Customer_Info_Tab(), 10, 2);
		       addressObj.Address_Additional_Customer_Info_Tab().click();
	    }

	    @And("^user click on Address Information First Record Edit Icon$")
	    public void user_click_on_address_information_first_record_edit_icon() throws Throwable {
			   waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Edit_Icon(), 10, 2);
		       addressObj.Address_Edit_Icon().click();
	    }

	    @And("^user Modify the Address type field$")
	    public void user_modify_the_address_type_field() throws Throwable {
			   waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Type(), 10, 2);
		       addressObj.Address_Address_Type().click();
		       for (int i = 0; i < 50; i++) {
				try {
					driver.findElement(By.xpath("//ion-label[text()=' "+custaddressdata.Addresstype+" ']/parent::ion-item//ion-radio")).click();
					break;
				} catch (Exception e) {

				}
			}
	    }

	    @And("^user Modify the Address Status field$")
	    public void user_modify_the_address_status_field() throws Throwable {
			   waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Status(), 10, 2);
		       addressObj.Address_Address_Status().click();
		       for (int i = 0; i < 50; i++) {
				try {
					driver.findElement(By.xpath("//ion-label[text()=' "+custaddressdata.AddressStatus+" ']/parent::ion-item//ion-radio")).click();
					break;
				} catch (Exception e) {

				}
			}
	    }

	    @And("^user Modify the Residental status field$")
	    public void user_modify_the_residental_status_field() throws Throwable {
			   waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Residential_or_Occupancy_Status(), 10, 2);
		       addressObj.Address_Residential_or_Occupancy_Status().click();
		       for (int i = 0; i < 50; i++) {
				try {
					driver.findElement(By.xpath("//ion-label[text()=' "+custaddressdata.Residentalstatus+" ']/parent::ion-item//ion-radio")).click();
					break;
				} catch (Exception e) {

				}
			}
	    }

	    @And("^user Modify the Province ID field$")
	    public void user_modify_the_province_id_field() throws Throwable {
			   waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Province_id(), 10, 2);
		       addressObj.Address_Province_id().click();
		       for (int i = 0; i < 50; i++) {
				try {
					driver.findElement(By.xpath("//ion-label[text()=' "+custaddressdata.ProvinceID+" ']/parent::ion-item//ion-radio")).click();
					break;
				} catch (Exception e) {

				}
			}
	    }

	    @And("^user Modify the City ID field$")
	    public void user_modify_the_city_id_field() throws Throwable {
			   waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_City_id(), 10, 2);
		       addressObj.Address_City_id().click();
		       for (int i = 0; i < 50; i++) {
				try {
					driver.findElement(By.xpath("//ion-label[text()=' "+custaddressdata.CityID+" ']/parent::ion-item//ion-radio")).click();
					break;
				} catch (Exception e) {

				}
			}
	    }

	
	
	
	
}
