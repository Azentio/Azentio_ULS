package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationdetailDisbmtMakerObject;
import pageobjects.customerPersonalOfferingObject;
import resources.BaseClass;
import testDataType.ApplicationDisbursementMakerTestData;
import testDataType.KULS_Login_TestDataType;

public class CxPersonalDetailOfferingStage {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	customerPersonalOfferingObject PersonalOffering = new customerPersonalOfferingObject(driver);
	WaitHelper waithelper = new WaitHelper(driver);
	
	@Then("^Search the record in Customer details at offering stage$")
    public void search_the_record_in_customer_details_at_offering_stage() throws Throwable {
		
		waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.searchiconreferenceid(), 60, 2);
		PersonalOffering.searchiconreferenceid().click();
		waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.SearchText(), 60, 2);
		PersonalOffering.SearchText().click();
		PersonalOffering.SearchText().sendKeys("Offering");
    }

    @Then("^Click the Edit icon in Customer details at offering stage$")
    public void click_the_edit_icon_in_customer_details_at_offering_stage() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonal_Offering_EditIcon(), 60, 2);
		PersonalOffering.CxPersonal_Offering_EditIcon().click();
    }
    @And("^Click the inbox icon in Customer details at offering stage$")
    public void click_the_inbox_icon_in_customer_details_at_offering_stage() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.InboxIcon(), 60, 2);
		PersonalOffering.InboxIcon().click();
    }
    
    @Then("^Verify the field Customer Type is in read only mode in Customer details at offering stage$")
    public void verify_the_field_customer_type_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
		boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonal_Offering_CustomerType(), 60, 2);
    	PersonalOffering.CxPersonal_Offering_CustomerType().isDisplayed();
    	try {
    	PersonalOffering.CxPersonal_Offering_CustomerType().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);
	}
    	

   

    @And("^Click the action icon in Customer details at offering stage$")
    public void click_the_action_icon_in_customer_details_at_offering_stage() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_ActionButton(), 60, 2);
		PersonalOffering.CxPersonalOffering_ActionButton().click();
    }

    @And("^Click the customer details tab in Customer details at offering stage$")
    public void click_the_customer_details_tab_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonal_CustomerDetailsTab(), 60, 2);
    	PersonalOffering.CxPersonal_CustomerDetailsTab().isDisplayed();
    	try {
    	PersonalOffering.CxPersonal_CustomerDetailsTab().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);
	}
    

    @And("^Verify the field Applicant Type is in read only mode in Customer details at offering stage$")
    public void verify_the_field_applicant_type_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonal_Offering_ApplicantType(), 60, 2);
    	PersonalOffering.CxPersonal_Offering_ApplicantType().isDisplayed();
    	try {
    	PersonalOffering.CxPersonal_Offering_ApplicantType().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);
	}
    

    @And("^Verify the field Salutation is in read only mode in Customer details at offering stage$")
    public void verify_the_field_salutation_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonal_Offering_Salutation(), 60, 2);
    	PersonalOffering.CxPersonal_Offering_Salutation().isDisplayed();
    	try {
    	PersonalOffering.CxPersonal_Offering_Salutation().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);
    }

    @And("^Verify the field First Name is in read only mode in Customer details at offering stage$")
    public void verify_the_field_first_name_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_FirstName(), 60, 2);
    	PersonalOffering.CxPersonalOffering_FirstName().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_FirstName().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);
		}

    @And("^Verify the field Middle Name is in read only mode in Customer details at offering stage$")
    public void verify_the_field_middle_name_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_Middlename(), 60, 2);
    	PersonalOffering.CxPersonalOffering_Middlename().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_Middlename().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);
    }

    @And("^Verify the field Last Name is in read only mode in Customer details at offering stage$")
    public void verify_the_field_last_name_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_Lastname(), 60, 2);
    	PersonalOffering.CxPersonalOffering_Lastname().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_Lastname().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);
    }

    @And("^Verify the field Date of Birth is in read only mode in Customer details at offering stage$")
    public void verify_the_field_date_of_birth_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_DateOfBirth(), 60, 2);
    	PersonalOffering.CxPersonalOffering_DateOfBirth().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_DateOfBirth().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);
    }

    @And("^Verify the field Gender is in read only mode in Customer details at offering stage$")
    public void verify_the_field_gender_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_Gender(), 60, 2);
    	PersonalOffering.CxPersonalOffering_Gender().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_Gender().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field Education Level is in read only mode in Customer details at offering stage$")
    public void verify_the_field_education_level_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_EducationLevel1(), 60, 2);
    	PersonalOffering.CxPersonalOffering_EducationLevel1().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_EducationLevel1().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field Marital Status is in read only mode in Customer details at offering stage$")
    public void verify_the_field_marital_status_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_MaritalStatus1(), 60, 2);
    	PersonalOffering.CxPersonalOffering_MaritalStatus1().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_MaritalStatus1().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field Nationality is in read only mode in Customer details at offering stage$")
    public void verify_the_field_nationality_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_Nationality(), 60, 2);
    	PersonalOffering.CxPersonalOffering_Nationality().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_Nationality().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field Religion is in read only mode in Customer details at offering stage$")
    public void verify_the_field_religion_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_Religion(), 60, 2);
    	PersonalOffering.CxPersonalOffering_Religion().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_Religion().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field Resident Status is in read only mode in Customer details at offering stage$")
    public void verify_the_field_resident_status_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_ResidentialStatus(), 60, 2);
    	PersonalOffering.CxPersonalOffering_ResidentialStatus().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_ResidentialStatus().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field Language is in read only mode in Customer details at offering stage$")
    public void verify_the_field_language_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_Language(), 60, 2);
    	PersonalOffering.CxPersonalOffering_Language().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_Language().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field No of Dependents is in read only mode in Customer details at offering stage$")
    public void verify_the_field_no_of_dependents_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_NoOfDependents(), 60, 2);
    	PersonalOffering.CxPersonalOffering_NoOfDependents().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_NoOfDependents().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field Mothers Maiden Name is in read only mode in Customer details at offering stage$")
    public void verify_the_field_mothers_maiden_name_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_MothersMaidenName(), 60, 2);
    	PersonalOffering.CxPersonalOffering_MothersMaidenName().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_MothersMaidenName().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field Type of Residence is in read only mode in Customer details at offering stage$")
    public void verify_the_field_type_of_residence_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_TypeOfResidence(), 60, 2);
    	PersonalOffering.CxPersonalOffering_TypeOfResidence().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_TypeOfResidence().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field Category of Client is in read only mode in Customer details at offering stage$")
    public void verify_the_field_category_of_client_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_CategoryOfClient(), 60, 2);
    	PersonalOffering.CxPersonalOffering_CategoryOfClient().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_CategoryOfClient().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }

    @And("^Verify the field Rating is in read only mode in Customer details at offering stage$")
    public void verify_the_field_rating_is_in_read_only_mode_in_customer_details_at_offering_stage() throws Throwable {
    	boolean status = true;
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PersonalOffering.CxPersonalOffering_Rating(), 60, 2);
    	PersonalOffering.CxPersonalOffering_Rating().isDisplayed();
    	try {
    	PersonalOffering.CxPersonalOffering_Rating().click();
    }
    	catch(Exception e) {
    		status = false;
			System.out.println("Field is not editable");
		}
		Assert.assertFalse(status);

    }


}
