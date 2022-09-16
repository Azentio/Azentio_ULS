package stepdefinitions;

import java.util.Iterator;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationDetailsOfferingObj;
import pageobjects.CustomerAddressDetailsObj;
import pageobjects.CustomerPersonalDetailOfferingObj;
import pageobjects.KULS_LoginObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.ApplicationDetailsOfferingTestDataType;
import testDataType.CustomerAddressDetailsTestDataType;
import testDataType.CustomerPersonalDetailOfferingTestDataType;
import testDataType.KULS_Login_TestDataType;

public class CustomerAddressDetails {

	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Login_TestDataType ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	String referenceID;
	CustomerAddressDetailsObj customerAddressDetailsObj = new CustomerAddressDetailsObj(driver);
	CustomerAddressDetailsTestDataType customerAddressDetailsTestDataType = jsonConfig.getCustomerAddressDetailsByName("Maker");
	SoftAssert softAssert = new SoftAssert();
	
	@Then("^user should click on the menu toggle$")
    public void user_should_click_on_the_menu_toggle() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_Maker_MenuToggle());
		customerAddressDetailsObj.customerAddressDetails_Maker_MenuToggle().click();
    }

    @Then("^click on inbox to search for the Customer Address Details record$")
    public void click_on_inbox_to_search_for_the_customer_address_details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_Inbox());
    	customerAddressDetailsObj.customerAddressDetails_Inbox().click();
    }

    @Then("^click on search button to search the record of Customer Address Details$")
    public void click_on_search_button_to_search_the_record_of_customer_address_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_SearchInbox());
    	customerAddressDetailsObj.customerAddressDetails_SearchInbox().click();
    }

    @Then("^enter the reference id of the Customer Address Details record$")
    public void enter_the_reference_id_of_the_customer_address_details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_SearchInboxInputField());
    	customerAddressDetailsObj.customerAddressDetails_SearchInboxInputField().sendKeys(customerAddressDetailsTestDataType.ReferenceID);
	
    }

    @Then("^click on the entitle button of the Customer Address Details record of that reference id$")
    public void click_on_the_entitle_button_of_the_customer_address_details_record_of_that_reference_id() throws Throwable {
    	String beforexpath= "//span[contains(text(),'";
		String afterxpath= "')]/../../td/button";
		while(true) {
			try {
				driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    }

    @Then("^click on the Additional customer info tab in Customer Personal Information screen$")
    public void click_on_the_additional_customer_info_tab_in_customer_personal_information_screen() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AdditionalCustomerInfoTab());
		customerAddressDetailsObj.customerAddressDetails_AdditionalCustomerInfoTab().click();
    }
    
    @Then("^select the Customer Address details record from the customer personal detail screen$")
    public void select_the_customer_address_details_record_from_the_customer_personal_detail_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_SearchButton());
    	customerAddressDetailsObj.customerAddressDetails_SearchButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_SearchInputField());
    	customerAddressDetailsObj.customerAddressDetails_SearchInputField().sendKeys(customerAddressDetailsTestDataType.CustomerFirstName);
    	String beforexpath= "//span[contains(text(),'"; 
    	String afterxpath= "')]/../../../td[2]/span/button[1]";
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +customerAddressDetailsTestDataType.CustomerFirstName+ afterxpath)));
    	driver.findElement(By.xpath(beforexpath +customerAddressDetailsTestDataType.CustomerFirstName+ afterxpath)).click();
    	
    }
    @Then("^click on add button of Address details from the customer identification screen$")
    public void click_on_add_button_of_address_details_from_the_customer_identification_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetails());
    	customerAddressDetailsObj.customerAddressDetails_AddressDetails().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailAddButton());
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailAddButton().click();
    }
    
    @Then("^verify the field Address Type on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_address_type_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressTypeField());
    	boolean status = customerAddressDetailsObj.customerAddressDetails_AddressTypeField().getAttribute("aria-haspopup").equals("listbox");
    	Assert.assertTrue("Address Type Field is dropdown", status);
    }

    @Then("^verify the field Address Status on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_address_status_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_AddressStatusField().getAttribute("aria-haspopup").equals("listbox");
    	Assert.assertTrue("Address Status Field is dropdown", status);
    }

    @Then("^verify the field Residential or Occupancy Status on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_residential_or_occupancy_status_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_ResidentialOrOccupancyStatusField().getAttribute("aria-haspopup").equals("listbox");
    	Assert.assertTrue("Residential or occupancy status Field is dropdown", status);
    }

    @Then("^verify the field Mailing or Contact Address Flag on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_mailing_or_contact_address_flag_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_MaillingOrContactAddressFlag().getAttribute("role").equals("switch");
    	Assert.assertTrue("Mailing or contact address flag Field is checkbox(toggle)", status);
    }

    @Then("^verify the field Address Line1 on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_address_line1_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_AddressLine1Field().getAttribute("type").equals("text");
    	Assert.assertTrue("Address Line1 Field is textbox", status);
    }

    @Then("^verify the field Address Line2 on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_address_line2_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_AddressLine2Field().getAttribute("type").equals("text");
    	Assert.assertTrue("Address Line2 Field is textbox", status);
    }

    @Then("^verify the field Country on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_country_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_CountryField().getAttribute("aria-haspopup").equals("listbox");
    	Assert.assertTrue("Country Field is dropdown", status);
    }

    @Then("^verify the field Province ID on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_province_id_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_ProvinceIdField().getAttribute("aria-haspopup").equals("listbox");
    	Assert.assertTrue("Province ID Field is dropdown", status);
    }

    @Then("^verify the field Neighbourhood District Name on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_neighbourhood_district_name_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	javaScriptHelper.scrollIntoView(customerAddressDetailsObj.customerAddressDetails_NeighbourhoodDistrictNameField());
    	boolean status = customerAddressDetailsObj.customerAddressDetails_NeighbourhoodDistrictNameField().getAttribute("type").equals("text");
    	Assert.assertTrue("Neighbourhood district name Field is dropdown", status);
    }

    @Then("^verify the field CityID on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_cityid_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_CityIdField().getAttribute("aria-haspopup").equals("listbox");
    	Assert.assertTrue("City id Field is dropdown", status);
    }
    
    @Then("^verify the field Zip Code on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_zip_code_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_ZipCodeField().getAttribute("type").equals("text");
    	Assert.assertTrue("Zip Code Field is textbox", status);
    }

    @Then("^verify the field PO Box Number on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_po_box_number_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField().getAttribute("type").equals("number");
    	Assert.assertTrue("PO box number Field is number", status);
    }

    @Then("^verify the field Mobile Number primary on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_mobile_number_primary_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_MobileNumberPrimaryField().getAttribute("type").equals("text");
    	Assert.assertTrue("Mobile Number primary Field is textbox", status);
    }

    @Then("^verify the field Latitude Details of the address on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_latitude_details_of_the_address_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_LatitudeDetailOfTheAddressField().getAttribute("type").equals("text");
    	Assert.assertTrue("Latitude Details of the address Field is textbox", status);
    }

    @Then("^verify the field Longitude Details of the address on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_longitude_details_of_the_address_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_LongitudeDetailOfTheAddressField().getAttribute("type").equals("text");
    	Assert.assertTrue("Longitude Details of the address Field is textbox", status);
    }

    @Then("^verify the field Landmark on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_landmark_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_LandmarkField().getAttribute("type").equals("text");
    	Assert.assertTrue("Landmark Field is textbox", status);
    }

    @Then("^verify the field Occupancy Date on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_occupancy_date_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_OccupancyDateField().getAttribute("type").equals("text");
    	Assert.assertTrue("Occupancy Date Field is textbox", status);
    }

    @Then("^verify the field Landlord Name on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_landlord_name_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_LandlordNameField().getAttribute("type").equals("text");
    	Assert.assertTrue("Landlord name Field is textbox", status);
    }

    @Then("^verify the field Landlord Mobile Number on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_landlord_mobile_number_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_LandlordMobileNumberField().getAttribute("type").equals("text");
    	Assert.assertTrue("Landlord mobile number Field is textbox", status);
    }

    @Then("^verify the field Rent Amount on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_rent_amount_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_RentAmountField().getAttribute("type").equals("number");
    	Assert.assertTrue("Rent Amount Field is number", status);
    }

    @Then("^verify the field Frequency of Rent on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_frequency_of_rent_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_FrequencyOfRentField().getAttribute("aria-haspopup").equals("listbox");
    	Assert.assertTrue("Frequency of Rent Field is dropdown", status);

    }
    
    @Then("^verify the field Phone Number on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_phone_number_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_PhoneNumberField().getAttribute("type").equals("text");
    	Assert.assertTrue(status);
    }

    @Then("^verify the field Email ID on Additional customer info tab under Customer Address Details screen$")
    public void verify_the_field_email_id_on_additional_customer_info_tab_under_customer_address_details_screen() throws Throwable {
    	boolean status = customerAddressDetailsObj.customerAddressDetails_EmailIdField().getAttribute("type").equals("text");
    	Assert.assertTrue(status);
    }
    
    @Then("^select the record of Address details from the customer identification screen$")
    public void select_the_record_of_address_details_from_the_customer_identification_screen() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchButton());
//    	customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchButton().click();
//    	
//    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchInputField());
//    	customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchInputField().sendKeys(customerAddressDetailsTestDataType.AddressTypeCode);
    	String beforexpath= "//span[contains(text(),'"; 
    	String afterxpath= "')]/../../../td[1]/span/button[1]";
    	Thread.sleep(500);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +customerAddressDetailsTestDataType.AddressTypeCode+ afterxpath)));
    	driver.findElement(By.xpath(beforexpath +customerAddressDetailsTestDataType.AddressTypeCode+ afterxpath)).click();
    	
    }
    
    @Then("^verify Customer Address details screen should get open with mentioned Fields$")
    public void verify_customer_address_details_screen_should_get_open_with_mentioned_fields() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressTypeField());
    	boolean status = customerAddressDetailsObj.customerAddressDetails_AddressTypeField().isDisplayed();
    	Assert.assertTrue(status);
    	boolean status1 = customerAddressDetailsObj.customerAddressDetails_AddressStatusField().isDisplayed();
    	Assert.assertTrue(status1);
    	boolean status2 = customerAddressDetailsObj.customerAddressDetails_ResidentialOrOccupancyStatusField().isDisplayed();
    	Assert.assertTrue(status2);
    	boolean status3 = customerAddressDetailsObj.customerAddressDetails_MaillingOrContactAddressFlag().isDisplayed();
    	Assert.assertTrue(status3);
    	boolean status4 = customerAddressDetailsObj.customerAddressDetails_AddressLine1Field().isDisplayed();
    	Assert.assertTrue(status4);
    	boolean status5 = customerAddressDetailsObj.customerAddressDetails_AddressLine2Field().isDisplayed();
    	Assert.assertTrue(status5);
    	boolean status6 = customerAddressDetailsObj.customerAddressDetails_CountryField().isDisplayed();
    	Assert.assertTrue(status6);
    	boolean status7 = customerAddressDetailsObj.customerAddressDetails_ProvinceIdField().isDisplayed();
    	Assert.assertTrue(status7);
    	javaScriptHelper.scrollIntoView(customerAddressDetailsObj.customerAddressDetails_NeighbourhoodDistrictNameField());
    	boolean status8 = customerAddressDetailsObj.customerAddressDetails_NeighbourhoodDistrictNameField().isDisplayed();
    	Assert.assertTrue(status8);
    	boolean status9 = customerAddressDetailsObj.customerAddressDetails_CityIdField().isDisplayed();
    	Assert.assertTrue(status9);
    	boolean status10 = customerAddressDetailsObj.customerAddressDetails_ZipCodeField().isDisplayed();
    	Assert.assertTrue(status10);
    	boolean status11 = customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField().isDisplayed();
    	Assert.assertTrue(status11);
    	boolean status12 = customerAddressDetailsObj.customerAddressDetails_MobileNumberPrimaryField().isDisplayed();
    	Assert.assertTrue(status12);
    	boolean status13 = customerAddressDetailsObj.customerAddressDetails_LatitudeDetailOfTheAddressField().isDisplayed();
    	Assert.assertTrue(status13);
    	boolean status14 = customerAddressDetailsObj.customerAddressDetails_LongitudeDetailOfTheAddressField().isDisplayed();
    	Assert.assertTrue(status14);
    	boolean status15 = customerAddressDetailsObj.customerAddressDetails_LandmarkField().isDisplayed();
    	Assert.assertTrue(status15);
    	boolean status16 = customerAddressDetailsObj.customerAddressDetails_OccupancyDateField().isDisplayed();
    	Assert.assertTrue(status16);
    	boolean status17 = customerAddressDetailsObj.customerAddressDetails_LandlordNameField().isDisplayed();
    	Assert.assertTrue(status17);
    	boolean status18 = customerAddressDetailsObj.customerAddressDetails_LandlordMobileNumberField().isDisplayed();
    	Assert.assertTrue(status18);
    	boolean status19 = customerAddressDetailsObj.customerAddressDetails_RentAmountField().isDisplayed();
    	Assert.assertTrue(status19);
    	boolean status20 = customerAddressDetailsObj.customerAddressDetails_FrequencyOfRentField().isDisplayed();
    	Assert.assertTrue(status20);
    	boolean status21 = customerAddressDetailsObj.customerAddressDetails_PhoneNumberField().isDisplayed();
    	Assert.assertTrue(status21);
    	boolean status22 = customerAddressDetailsObj.customerAddressDetails_EmailIdField().isDisplayed();
    	Assert.assertTrue(status22);
    }

    @Then("^verify the functionality of Back button of customer address details screen$")
    public void verify_the_functionality_of_back_button_of_customer_address_details_screen() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_BackButton());
    	customerAddressDetailsObj.customerAddressDetails_BackButton().click();
    }
    
    @Then("^verify while modification system should allow user to save the address details record with valid data$")
    public void verify_while_modification_system_should_allow_user_to_save_the_address_details_record_with_valid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressLine1Field());
    	customerAddressDetailsObj.customerAddressDetails_AddressLine1Field().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressLine1Field());
    	customerAddressDetailsObj.customerAddressDetails_AddressLine1Field().sendKeys(Keys.BACK_SPACE);
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressLine1Field());
    	customerAddressDetailsObj.customerAddressDetails_AddressLine1Field().sendKeys(customerAddressDetailsTestDataType.AddressLine1);
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailsSaveButton());
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailsSaveButton().click();
    
    }

    @Then("^verify while modification of address details record system should display the confirmation message post clicking on save button$")
    public void verify_while_modification_of_address_details_record_system_should_display_the_confirmation_message_post_clicking_on_save_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_SaveConfirmationMessage());
    	customerAddressDetailsObj.customerAddressDetails_SaveConfirmationMessage().isDisplayed();
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_SaveConfirmationMessageCloseButton());
    	customerAddressDetailsObj.customerAddressDetails_SaveConfirmationMessageCloseButton().click();
    }
    
    @Then("^verify system should show the proper validation message for blank field while modifying address detail record$")
    public void verify_system_should_show_the_proper_validation_message_for_blank_field_while_modifying_address_detail_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressLine1Field());
    	customerAddressDetailsObj.customerAddressDetails_AddressLine1Field().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressLine1Field());
    	customerAddressDetailsObj.customerAddressDetails_AddressLine1Field().sendKeys(Keys.BACK_SPACE);
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailsSaveButton());
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailsSaveButton().click();
    	String beforexpath = "//ion-label[contains(text(),'";
    	String afterxpath = "')]/ancestor::ion-col/descendant::ion-badge";
    	String validationMessage = driver.findElement(By.xpath(beforexpath+customerAddressDetailsTestDataType.MandatoryFieldNameToModify+afterxpath)).getText();
    	System.out.println("Blank Field Validation Message :"+validationMessage);
    	boolean status = driver.findElement(By.xpath(beforexpath+customerAddressDetailsTestDataType.MandatoryFieldNameToModify+afterxpath)).isDisplayed();
    	Assert.assertTrue(status);
    }
    
    @Then("^verify system should not allow user to do a modification with invalid data of address detail record$")
    public void verify_system_should_not_allow_user_to_do_a_modification_with_invalid_data_of_address_detail_record() throws Throwable {
    	Thread.sleep(500);
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressLine1Field());
    	customerAddressDetailsObj.customerAddressDetails_AddressLine1Field().sendKeys(customerAddressDetailsTestDataType.InvalidInput);
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailsSaveButton());
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailsSaveButton().click();
    	String beforexpath = "//ion-label[contains(text(),'";
    	String afterxpath = "')]/ancestor::ion-col/descendant::ion-badge";
    	String validationMessage = driver.findElement(By.xpath(beforexpath+customerAddressDetailsTestDataType.MandatoryFieldNameToModify+afterxpath)).getText();
    	System.out.println("Invalid Input Validation Message :"+validationMessage);
    	boolean status = driver.findElement(By.xpath(beforexpath+customerAddressDetailsTestDataType.MandatoryFieldNameToModify+afterxpath)).isDisplayed();
    	Assert.assertTrue(status);
    }
    
    @Then("^Verify system should display mention fields on List view of Customer Address Information Parameter details$")
    public void verify_system_should_display_mention_fields_on_list_view_of_customer_address_information_parameter_details() throws Throwable {
//    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressIDListViewField());
//    	boolean status = customerAddressDetailsObj.customerAddressDetails_AddressIDListViewField().isDisplayed();
//    	Assert.assertTrue(status);
//    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressStatusListViewField());
//    	boolean status1 = customerAddressDetailsObj.customerAddressDetails_AddressStatusListViewField().isDisplayed();
//    	Assert.assertTrue(status1);
    	Thread.sleep(1000);
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressTypeListViewField());
    	boolean status2 = customerAddressDetailsObj.customerAddressDetails_AddressTypeListViewField().isDisplayed();
    	Assert.assertTrue(status2);
    	boolean status3 = customerAddressDetailsObj.customerAddressDetails_CountryListViewField().isDisplayed();
    	Assert.assertTrue(status3);
    	boolean status4 = customerAddressDetailsObj.customerAddressDetails_ContactAddressListViewField().isDisplayed();
    	Assert.assertTrue(status4);
    	boolean status5 = customerAddressDetailsObj.customerAddressDetails_OccupanceSinceListViewField().isDisplayed();
    	Assert.assertTrue(status5);
    	boolean status6 = customerAddressDetailsObj.customerAddressDetails_OccupancyStatusListViewField().isDisplayed();
    	Assert.assertTrue(status6);
    	boolean status7 = customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchButton().isDisplayed();
    	Assert.assertTrue(status7);
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailsExportListViewField());
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailsExportListViewField().click();
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_ExportToPDF());
    	boolean status8 = customerAddressDetailsObj.customerAddressDetails_ExportToPDF().isDisplayed();
    	Assert.assertTrue(status8);
    	boolean status9 = customerAddressDetailsObj.customerAddressDetails_ExportToXls().isDisplayed();
    	Assert.assertTrue(status9);
    }

    @Then("^Verify the values in List view should be non editable on List view of Customer Address details$")
    public void verify_the_values_in_list_view_should_be_non_editable_on_list_view_of_customer_address_details() throws Throwable {
//    	try {
//    		customerAddressDetailsObj.customerAddressDetails_AddressIDFirstValue().sendKeys(customerAddressDetailsTestDataType.EditText);
//    		System.out.println("AddressID Field is editable");
//    	} catch (Exception e) {
//			// TODO: handle exception
//    		System.out.println("AddressID Field is non editable");
//		}
    	try {
    		customerAddressDetailsObj.customerAddressDetails_AddressTypeFirstValue().sendKeys(customerAddressDetailsTestDataType.EditText);
    		System.out.println("AddressType Field is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("AddressType Field is non editable");
    	}
    	try {
    		customerAddressDetailsObj.customerAddressDetails_CountryFirstValue().sendKeys(customerAddressDetailsTestDataType.EditText);
    		System.out.println("Country Field is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("Country Field is non editable");
    	}
    	try {
    		customerAddressDetailsObj.customerAddressDetails_OccupancyStatusFirstValue().sendKeys(customerAddressDetailsTestDataType.EditText);
    		System.out.println("OccupancyStatus Field is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("OccupancyStatus Field is non editable");
    	}
    	try {
    		customerAddressDetailsObj.customerAddressDetails_OccupanceSinceFirstValue().sendKeys(customerAddressDetailsTestDataType.EditText);
    		System.out.println("OccupanceSince Field is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("OccupanceSince Field is non editable");
    	}
    	try {
    		customerAddressDetailsObj.customerAddressDetails_ContactAddressFirstValue().sendKeys(customerAddressDetailsTestDataType.EditText);
    		System.out.println("ContactAddress Field is editable");
    	} catch (Exception e) {
    		// TODO: handle exception
    		System.out.println("ContactAddress Field is non editable");
    	}
    
    }

    @Then("^Verify the functionality of Back button on List view of Customer Address details$")
    public void verify_the_functionality_of_back_button_on_list_view_of_customer_address_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_CustomerAddressBackButton());
    	customerAddressDetailsObj.customerAddressDetails_CustomerAddressBackButton().click();
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetails());
    	boolean status = customerAddressDetailsObj.customerAddressDetails_AddressDetails().isDisplayed();
    	Assert.assertTrue(status);
    }

    @Then("^click on export to excel button system should download Excel file of Customer Address details$")
    public void click_on_export_to_excel_button_system_should_download_excel_file_of_customer_address_details() throws Throwable {
    	for (int i = 0; i < 20; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailsExportListViewField());
				customerAddressDetailsObj.customerAddressDetails_AddressDetailsExportListViewField().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_ExportToXls());
    	customerAddressDetailsObj.customerAddressDetails_ExportToXls().click();
    }

    @Then("^click on export to pdf button system should download Pdf file of Customer Address details$")
    public void click_on_export_to_pdf_button_system_should_download_pdf_file_of_customer_address_details() throws Throwable {
    	for (int i = 0; i < 20; i++) {
			try {
				waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailsExportListViewField());
				customerAddressDetailsObj.customerAddressDetails_AddressDetailsExportListViewField().click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_ExportToPDF());
    	customerAddressDetailsObj.customerAddressDetails_ExportToPDF().click();
    }

    @Then("^Verify the functionality of add button$")
    public void verify_the_functionality_of_add_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailAddButton());
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailAddButton().click();
    }

    @Then("^verify search box should display matching record with matched data of Customer Address details$")
    public void verify_search_box_should_display_matching_record_with_matched_data_of_customer_address_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchButton());
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchButton().click();
    	Thread.sleep(1000);
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchInputField().sendKeys(customerAddressDetailsTestDataType.AddressTypeCode);
    	boolean status = customerAddressDetailsObj.customerAddressDetails_AddressTypeFirstValue().isDisplayed();
    	Assert.assertTrue(status);
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchCloseButton());
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchCloseButton().click();
    	
    }

    @Then("^verify search box should not display any record with mismatched data of Customer Address details$")
    public void verify_search_box_should_not_display_any_record_with_mismatched_data_of_customer_address_details() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchButton());
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchButton().click();
    	Thread.sleep(1000);
    	customerAddressDetailsObj.customerAddressDetails_AddressDetailSearchInputField().sendKeys(customerAddressDetailsTestDataType.InvalidInput);
    	boolean status = customerAddressDetailsObj.applicationDetailsOffering_NoDataFoundInSearch().isDisplayed();
    	Assert.assertTrue(status);
    }

    
    
}