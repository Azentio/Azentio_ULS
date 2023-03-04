package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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
	ExcelData excelData = new ExcelData(System.getProperty("user.dir") + "\\Test-data\\TestDataDesignSample.xlsx","CustomerAddressDetailsTestData","Data Set ID");
	Map<String, String> testData;
	String dataSetID;
	
	//****************@AT-CAD-001************************//
    @And("^user click on Address Information Add Icon$")
    public void user_click_on_address_information_add_icon() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Add_Icon(), 60, 2);
    	addressObj.Address_Add_Icon().click();
    }

    @And("^user verify the Address Type field and Choose the value$")
    public void user_verify_the_address_type_field_and_choose_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Type(), 60, 2);
    	Assert.assertTrue(addressObj.Address_Address_Type().isDisplayed());
    	
    	addressObj.Address_Address_Type().click();
    	String Xpath = "//ion-label[text()=' "+testData.get("Address Type")+" ']/parent::ion-item//ion-radio";
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(Xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user verify the Address status field and choose the value$")
    public void user_verify_the_address_status_field_and_choose_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Status(), 60, 2);
    	Assert.assertTrue(addressObj.Address_Address_Status().isDisplayed());
    	addressObj.Address_Address_Status().click();
    	String Xpath = "//ion-label[contains(text(),'"+testData.get("Address Status")+"')]/parent::ion-item//ion-radio";
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(Xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user verify the Residental status field and choose the value$")
    public void user_verify_the_residental_status_field_and_choose_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Residential_or_Occupancy_Status(), 60, 2);
    	Assert.assertTrue(addressObj.Address_Residential_or_Occupancy_Status().isDisplayed());
    	addressObj.Address_Residential_or_Occupancy_Status().click();
//    	 for(int i=0;i<=50;i++) {
//			 try {
//				 break;
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		 }
    	for (int i = 0; i < 50; i++) {
			try {
				javaHelper.scrollIntoView(driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Residential Status")+" ']")));
				driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Residential Status")+" ']/parent::ion-item//ion-radio")).click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user verify the Address Line 1 field and Enter the Vaue$")
    public void user_verify_the_address_line_1_field_and_enter_the_vaue() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Line_1(), 60, 2);
    	Assert.assertTrue(addressObj.Address_Address_Line_1().isDisplayed());
    	addressObj.Address_Address_Line_1().click();
    	for (int i = 0; i < 50; i++) {
			try {
				
				addressObj.Address_Address_Line_1().sendKeys(testData.get("Address Line1"));
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user verify the Address Line 2 field and Enter the Vaue$")
    public void user_verify_the_address_line_2_field_and_enter_the_vaue() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Line_2(), 60, 2);
    	Assert.assertTrue(addressObj.Address_Address_Line_2().isDisplayed());
    	addressObj.Address_Address_Line_2().click();
    	for (int i = 0; i < 50; i++) {
			try {
				
				addressObj.Address_Address_Line_2().sendKeys(testData.get("Address Line2"));
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user verify the country field and choose the value$")
    public void user_verify_the_country_field_and_choose_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Country(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Country().isDisplayed());
     	addressObj.Address_Country().click();
     	
     	for (int i = 0; i < 50; i++) {
 			try {
 				javaHelper.scrollIntoView(driver.findElement(By.xpath("//ion-label[text()=' ICELAND ']/parent::ion-item//ion-radio")));
 				driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Country")+" ']/parent::ion-item//ion-radio")).click();
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the Province Id field and choose the value$")
    public void user_verify_the_province_id_field_and_choose_the_value() throws Throwable {
    	javaHelper.scrollIntoView(addressObj.Address_Country());
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Province_id(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Province_id().isDisplayed());
     	addressObj.Address_Province_id().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Province Id")+" ']/parent::ion-item//ion-radio")).click();
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the District Name field and Enter the value$")
    public void user_verify_the_district_name_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Neighbourhood_District_Name(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Neighbourhood_District_Name().isDisplayed());
     	addressObj.Address_Neighbourhood_District_Name().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
// 				addressObj.Address_Neighbourhood_District_Name().sendKeys(testData.get("District Name"));
 				driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("District Name")+" ']/parent::ion-item//ion-radio")).click();
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the city Id field and choose the value$")
    public void user_verify_the_city_id_field_and_choose_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_City_id(), 60, 2);
     	Assert.assertTrue(addressObj.Address_City_id().isDisplayed());
     	addressObj.Address_City_id().click();
     	addressObj.Address_City_id().sendKeys(testData.get("City Id"));
//     	for (int i = 0; i < 50; i++) {
// 			try {
// 				
// 				driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("City Id")+" ']/parent::ion-item//ion-radio")).click();
// 				break;
// 			} catch (Exception e) {
// 				
// 			}
// 		}
    }

    @And("^user verify the Zip code field and Enter the value$")
    public void user_verify_the_zip_code_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Zip_Code(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Zip_Code().isDisplayed());
     	addressObj.Address_Zip_Code().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_Zip_Code().sendKeys(testData.get("Zip Code"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the PO Box Number field and Enter the value$")
    public void user_verify_the_po_box_number_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_PO_BOX_number(), 60, 2);
     	Assert.assertTrue(addressObj.Address_PO_BOX_number().isDisplayed());
     	addressObj.Address_PO_BOX_number().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_PO_BOX_number().sendKeys(testData.get("PO Box Number"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		} 
    }

    @And("^user verify the Mobile Number primary field and Enter the value$")
    public void user_verify_the_mobile_number_primary_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Mobile_Number(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Mobile_Number().isDisplayed());
     	addressObj.Address_Mobile_Number().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_Mobile_Number().sendKeys(testData.get("Mobile Number Primary"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the Mobile Number secondary field and Enter the value$")
    public void user_verify_the_mobile_number_secondary_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Mobile_Number(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Mobile_Number().isDisplayed());
     	addressObj.Address_Mobile_Number().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_Mobile_Number().sendKeys(testData.get("Mobile Number Secondary"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the Duration of stay field and Enter the value$")
    public void user_verify_the_duration_of_stay_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Duration_of_Stay(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Duration_of_Stay().isDisplayed());
     	addressObj.Address_Duration_of_Stay().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_Duration_of_Stay().sendKeys(testData.get("Duration Of Stay"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the Latitude details of the address field and Enter the Value$")
    public void user_verify_the_latitude_details_of_the_address_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Latitude_details_of_the_address(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Latitude_details_of_the_address().isDisplayed());
     	addressObj.Address_Latitude_details_of_the_address().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_Latitude_details_of_the_address().sendKeys(testData.get("Latitudedetailsoftheaddress"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the Longtitude details of the address field and Enter the Value$")
    public void user_verify_the_longtitude_details_of_the_address_field_and_enter_the_value() throws Throwable {
    	javaHelper.scrollIntoView(addressObj.Address_Longitude_details_of_the_address());
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Longitude_details_of_the_address(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Longitude_details_of_the_address().isDisplayed());
     	addressObj.Address_Longitude_details_of_the_address().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_Longitude_details_of_the_address().sendKeys(testData.get("Longtitudedetailsoftheaddress"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the LandMark field and Enter the Value$")
    public void user_verify_the_landmark_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Land_Mark(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Land_Mark().isDisplayed());
     	addressObj.Address_Land_Mark().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_Land_Mark().sendKeys(testData.get("LandMark"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the Occupancy date field and choose the date$")
    public void user_verify_the_occupancy_date_field_and_choose_the_date() throws Throwable {
    	javaHelper.scrollIntoView(addressObj.Address_Occupancy_date());
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Occupancy_date(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Occupancy_date().isDisplayed());
     	addressObj.Address_Occupancy_date().click();
     	driver.findElement(By.xpath("//button[text()=' "+testData.get("Year")+" ']")).click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
				driver.findElement(By.xpath("//span[text()=' "+testData.get("Year")+" ']")).click();

				driver.findElement(By.xpath("//span[contains(text(),'"+testData.get("Month")+"')]")).click();

				driver.findElement(By.xpath("(//span[text()='"+testData.get("Date")+"'])[1]")).click();
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the Landlord name field and Enter the Value$")
    public void user_verify_the_landlord_name_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Landlord_Name(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Landlord_Name().isDisplayed());
     	addressObj.Address_Landlord_Name().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_Landlord_Name().sendKeys(testData.get("LandLord Name"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the Landlord Number field and Enter the value$")
    public void user_verify_the_landlord_number_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Landlord_Mobile_Number(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Landlord_Mobile_Number().isDisplayed());
     	addressObj.Address_Landlord_Mobile_Number().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_Landlord_Mobile_Number().sendKeys(testData.get("LandLord Number"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the Rent amount field and Enter the Value$")
    public void user_verify_the_rent_amount_field_and_enter_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Rent_Amount(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Rent_Amount().isDisplayed());
     	
     	for (int i = 0; i < 50; i++) {
 			try {
 				addressObj.Address_Rent_Amount().click();
 				addressObj.Address_Rent_Amount().sendKeys(testData.get("Rent Amount"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user verify the Frequency of Rent field and choose the value$")
    public void user_verify_the_frequency_of_rent_field_and_choose_the_value() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Frequency_of_rent(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Frequency_of_rent().isDisplayed());
     	addressObj.Address_Frequency_of_rent().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Frequency Of Rent")+" ']/parent::ion-item//ion-radio")).click();
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

	
	
	
	
	//*************@AT-CAD-006***********************//
	

    @And("^user Try to change the Address Type field$")
    public void user_try_to_change_the_address_type_field() throws Throwable {
    	javaHelper.scrollIntoView(addressObj.Address_Address_Type());
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Type(), 60, 2);
    	Assert.assertTrue(addressObj.Address_Address_Type().isDisplayed());
    	
    	addressObj.Address_Address_Type().click();
    	String Xpath = "//ion-label[text()=' "+testData.get("Modify Address Type")+" ']/parent::ion-item//ion-radio";
    	for (int i = 0; i < 50; i++) {
			try {
				
				driver.findElement(By.xpath(Xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Try to change the Address status field$")
    public void user_try_to_change_the_address_status_field() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Status(), 60, 2);
    	Assert.assertTrue(addressObj.Address_Address_Status().isDisplayed());
    	
    	addressObj.Address_Address_Status().click();
    	String Xpath = "//ion-label[contains(text(),'"+testData.get("Modify Address Status")+"')]/parent::ion-item//ion-radio";
    	for (int i = 0; i < 50; i++) {
			try {
				
				driver.findElement(By.xpath(Xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Try to change the Residental status field$")
    public void user_try_to_change_the_residental_status_field() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Residential_or_Occupancy_Status(), 60, 2);
    	Assert.assertTrue(addressObj.Address_Residential_or_Occupancy_Status().isDisplayed());
    	addressObj.Address_Residential_or_Occupancy_Status().click();
    	for (int i = 0; i < 50; i++) {
			try {
				
				driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Modify Residential Status")+" ']/parent::ion-item//ion-radio")).click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Try to change the Address Line 1 field$")
    public void user_try_to_change_the_address_line_1_field() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Line_1(), 60, 2);
     	Assert.assertTrue(addressObj.Address_Address_Line_1().isDisplayed());
     	addressObj.Address_Address_Line_1().click();
     	for (int i = 0; i < 50; i++) {
 			try {
 				
 				addressObj.Address_Address_Line_1().sendKeys(testData.get("Modify Address Line1"));
 				break;
 			} catch (Exception e) {
 				
 			}
 		}
    }

    @And("^user Try to change the  Address Line 2 field$")
    public void user_try_to_change_the_address_line_2_field() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Line_2(), 60, 2);
    	Assert.assertTrue(addressObj.Address_Address_Line_2().isDisplayed());
    	addressObj.Address_Address_Line_2().click();
    	for (int i = 0; i < 50; i++) {
			try {
				
				addressObj.Address_Address_Line_2().sendKeys(testData.get("Modify Address Line2"));
				break;
			} catch (Exception e) {
				
			}
		}
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//*************@AT-CAD-007***********************//
    
	   @And("^user Enter Customer Address details Application ID$")
	    public void user_enter_customer_address_details_application_id() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Search_Input(), 60, 5);
	    	AppDataEntry.Search_Input().click();
	    	AppDataEntry.Search_Input().sendKeys(testData.get("Stage Code"));
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
					driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Modify Address Type")+" ']/parent::ion-item//ion-radio")).click();
					break;
				} catch (Exception e) {

				}
			}
	    }

	    @And("^user Modify the Address Status field$")
	    public void user_modify_the_address_status_field() throws Throwable {
	        waitHelper.waitForElementToVisibleWithFluentWait(driver, addressObj.Address_Address_Status(), 60, 2);
	    	Assert.assertTrue(addressObj.Address_Address_Status().isDisplayed());
	    	
	    	addressObj.Address_Address_Status().click();
	    	String Xpath = "//ion-label[contains(text(),'"+testData.get("Modify Address Status")+"')]/parent::ion-item//ion-radio";
	    	for (int i = 0; i < 50; i++) {
				try {
					
					driver.findElement(By.xpath(Xpath)).click();
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
					driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Modify Residential Status")+" ']/parent::ion-item//ion-radio")).click();
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
					driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Modify Province ID")+" ']/parent::ion-item//ion-radio")).click();
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
					driver.findElement(By.xpath("//ion-label[text()=' "+testData.get("Modify City ID")+" ']/parent::ion-item//ion-radio")).click();
					break;
				} catch (Exception e) {

				}
			}
	    }
	    
	    @Then("^select data set ID for customer address details testcase001$")
	    public void select_data_set_id_for_customer_address_details_testcase001() throws Throwable {
	    	dataSetID = "AT_CAD_001_D1";
	        testData = excelData.getTestdata(dataSetID);
	    }
	    
	    @Then("^select data set ID for customer address details testcase006$")
	    public void select_data_set_id_for_customer_address_details_testcase006() throws Throwable {
	    	dataSetID = "AT_CAD_006_D1";
	        testData = excelData.getTestdata(dataSetID);
	    }
	    
	    @Then("^select data set ID for customer address details testcase007$")
	    public void select_data_set_id_for_customer_address_details_testcase007() throws Throwable {
	    	dataSetID = "AT_CAD_007_D1";
	        testData = excelData.getTestdata(dataSetID);
	    }
	
}
