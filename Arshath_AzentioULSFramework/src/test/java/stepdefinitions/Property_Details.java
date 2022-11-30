package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.PersonalDetails_AppDataEntry_Obj;
import pageobjects.PropertyDetails_Obj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.PropertyDetails_TestData;

public class Property_Details extends BaseClass{

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
	//PropertyDetails_TestData propertydata = jsonConfig.getPropertyDetailByName("Maker");
	PropertyDetails_Obj PrpObj = new PropertyDetails_Obj(driver);
	PersonalDetails_AppDataEntry_Obj AppDataEntry = new PersonalDetails_AppDataEntry_Obj(driver);
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00075\\Downloads\\UlsTestDataDesign.xlsx",
			"PropertyDetailsTestdata", "Data Set ID");
	Map<String, String> testdata;
	
    @And("^user Enter Application ID$")
    public void user_enter_application_id() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Search_Input(), 60, 5);
    	AppDataEntry.Search_Input().click();
    	//AppDataEntry.Search_Input().sendKeys(propertydata.ApplicationID);
    }

    @And("^user choose Property Details Tab$")
    public void user_choose_property_details_tab() throws Throwable {
    	for (int i = 0; i < 50; i++) {
			try {
				PrpObj.Property_Details_Next().click();
				PrpObj.Property_Details_Tab().click();
				break;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

    }

    @And("^user click First Record Edit Icon$")
    public void user_click_first_record_edit_icon() throws Throwable {
    	Thread.sleep(1000);
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrpObj.Property_Details_Edit(), 60, 5);
        PrpObj.Property_Details_Edit().click();
    }

    @And("^user Modify the Security Type$")
    public void user_modify_the_security_type() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrpObj.Property_Details_Security_Type(), 60, 5);
    	PrpObj.Property_Details_Security_Type().click();
    	
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[text()=' "+testdata.get("SecurityType")+" ']/parent::ion-item//ion-radio")).click();
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Modify the Property City$")
    public void user_modify_the_property_city() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrpObj.Property_Details_Property_City(), 60, 5);
    	PrpObj.Property_Details_Property_City().click();
    	
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[text()=' "+testdata.get("PropertyCity")+" ']/parent::ion-item//ion-radio")).click();
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Modify the Property Type$")
    public void user_modify_the_property_type() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrpObj.Property_Details_Property_Type(), 60, 5);
    	PrpObj.Property_Details_Property_Type().click();
    	
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[text()=' "+testdata.get("PropertyType")+" ']/parent::ion-item//ion-radio")).click();
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Modify the Apf Status$")
    public void user_modify_the_apf_status() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrpObj.Property_Details_APF_Status(), 60, 5);
    	PrpObj.Property_Details_APF_Status().click();
    	
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[text()=' "+testdata.get("APFStatus")+" ']/parent::ion-item//ion-radio")).click();
			} catch (Exception e) {
				
			}
		}
    }
	
    @And("^user Modify the Construction Status$")
    public void user_modify_the_construction_status() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrpObj.Property_Details_Construction_Status(), 60, 5);
    	PrpObj.Property_Details_Construction_Status().click();
    	
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[text()=' "+testdata.get("ConstructionStatus")+" ']/parent::ion-item//ion-radio")).click();
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Modify the Property Category$")
    public void user_modify_the_property_category() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrpObj.Property_Details_Property_Category(), 60, 5);
    	PrpObj.Property_Details_Property_Category().click();
    	
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[text()=' "+testdata.get("PropertyCategory")+" ']/parent::ion-item//ion-radio")).click();
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Modify the Nature of Property$")
    public void user_modify_the_nature_of_property() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrpObj.Property_Details_Nature_of_Property(), 60, 5);
    	PrpObj.Property_Details_Nature_of_Property().click();
    	
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[text()=' "+testdata.get("NatureOfProperty")+" ']/parent::ion-item//ion-radio")).click();
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Modify the Occupancy Status$")
    public void user_modify_the_occupancy_status() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrpObj.Property_Details_Occupancy_Status(), 60, 5);
    	PrpObj.Property_Details_Occupancy_Status().click();
    	
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[text()=' "+testdata.get("OccupancyStatus")+" ']/parent::ion-item//ion-radio")).click();
			} catch (Exception e) {
				
			}
		}
    }
	
	//*******************@AT-PD-005*******************//
    


    
    @And("^user click the update button$")
    public void user_click_the_update_button() throws Throwable {
        javaHelper.scrollIntoView(AppDataEntry.customerPersonalDetails_Update());
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Update(), 60, 5);
        AppDataEntry.customerPersonalDetails_Update().isDisplayed();
        AppDataEntry.customerPersonalDetails_Update().click();      
        
    }
    
    @Then("^user verify the blank field and get the proper validation message$")
    public void user_verify_the_blank_field_and_get_the_proper_validation_message() throws Throwable {
    	String executeScript = (String) javaHelper.executeScript("return document.getElementsByTagName('ion-badge')[1].innerText");
    	Assert.assertEquals(executeScript, "Required field");
    }
	
	
	
	@And("^user update the Excelsheet testdata for modification$")
	public void user_update_the_Excelsheet_testdata_for_modification() throws Throwable
	{
		testdata = exceldata.getTestdata("AT_PD_004_D1");
	}
	
	
	
	
	
	
	
}
