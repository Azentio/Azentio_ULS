package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.PersonalDetails_AppDataEntry_Obj;
import pageobjects.PropertyDetails_Obj;
import pageobjects.Trans_CustomerEmploymentObject;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.Customer_Empolyment_Testdata;
import testDataType.KULS_Login_TestDataType;

public class Customer_Employment extends BaseClass{

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
	Trans_CustomerEmploymentObject Cust_Empl = new Trans_CustomerEmploymentObject(driver);
	Customer_Empolyment_Testdata custemployedata = jsonConfig.getCustEmployByName("Maker");
	PropertyDetails_Obj PrpObj = new PropertyDetails_Obj(driver);
	PersonalDetails_AppDataEntry_Obj AppDataEntry = new PersonalDetails_AppDataEntry_Obj(driver);
	
	
	
    @And("^user Enter Customer Employment Application ID$")
    public void user_enter_customer_employment_application_id() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Search_Input(), 60, 5);
    	AppDataEntry.Search_Input().click();
    	AppDataEntry.Search_Input().sendKeys(custemployedata.ApplicationID);
    }
	
    @And("^user click on Customer Financials Tab$")
    public void user_click_on_customer_financials_tab() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cust_Empl.Trans_CxEmplyObj_CxFinancialTab(), 60, 5);
    	Cust_Empl.Trans_CxEmplyObj_CxFinancialTab().click();
    }

    @And("^user click on Customer Employement Add button$")
    public void user_click_on_customer_employement_add_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cust_Empl.Trans_CxEmplyObj_CxFinancialAddButton(), 60, 5);
    	Cust_Empl.Trans_CxEmplyObj_CxFinancialAddButton().click();
    }

    @And("^user Enter character value in Numeric Field$")
    public void user_enter_character_value_in_numeric_field() throws Throwable {
    	javaHelper.scrollIntoView(Cust_Empl.Trans_CxFinancial_NoOFPartners());
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cust_Empl.Trans_CxFinancial_NoOFPartners(), 60, 5);
    	Cust_Empl.Trans_CxFinancial_NoOFPartners().click();
    	Cust_Empl.Trans_CxFinancial_NoOFPartners().sendKeys(custemployedata.InvalidValue);
    	String attribute = Cust_Empl.Trans_CxFinancial_NoOFPartners_verification().getAttribute("ng-reflect-model");
    	int number = Integer.parseInt(attribute);
    	System.out.println("This field pass Numeric value only" +attribute);
    }

    @And("^user Enter Numeric value in Character field$")
    public void user_enter_numeric_value_in_character_field() throws Throwable {
        
    }

    @And("^user Enter Special character in Any field$")
    public void user_enter_special_character_in_any_field() throws Throwable {
    	javaHelper.scrollIntoView(Cust_Empl.Trans_CxFinancial_EmployeeID());
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, Cust_Empl.Trans_CxFinancial_EmployeeID(), 60, 5);
        Cust_Empl.Trans_CxFinancial_EmployeeID().click();
        Cust_Empl.Trans_CxFinancial_EmployeeID().sendKeys(custemployedata.SpecialCharacter);
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
