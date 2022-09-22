package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import freemarker.core._SortedArraySet;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pageobjects.PersonalDetails_AppDataEntry_Obj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.PersonalaDetailsDataEntryTestdata;

public class PersonalDetails_AppDataEntry extends BaseClass{

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
	PersonalDetails_AppDataEntry_Obj AppDataEntry = new PersonalDetails_AppDataEntry_Obj(driver);
	PersonalaDetailsDataEntryTestdata personalData = jsonConfig.getPerDetailDataByName("Maker");
	SoftAssert softassert = new SoftAssert();
	
    @Given("^User Launch the KULS url for Transaction$")
    public void user_launch_the_kuls_url_for_transaction() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationULSUrl();
		driver.get(kulsApplicationUrl);
		applicationLogin.UlsApplicationMaker(loginData.Username1, loginData.Password1);
    }

    @Then("^user click on Transaction Module$")
    public void user_click_on_transaction_module() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Transactions_Module(), 60, 5);
    	AppDataEntry.Transactions_Module().click();
    }

    @And("^user click on Application Details$")
    public void user_click_on_application_details() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.ulsApplicationManagerMainMenu(), 60, 5);
    	AppDataEntry.ulsApplicationManagerMainMenu().click();
    	javaHelper.scrollIntoView(AppDataEntry.Application_Details_Icon());
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Application_Details_Icon(), 60, 5);
    	AppDataEntry.Application_Details_Icon().click(); 
    }

    @And("^user click on Inbox Icon$")
    public void user_click_on_inbox_icon() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Inbox_Icon(), 60, 5);
    	AppDataEntry.Inbox_Icon().click(); 
    }

    @And("^user click search icon$")
    public void user_click_search_icon() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Search_Icon(), 60, 5);
    	AppDataEntry.Search_Icon().click(); 
    }

    @And("^user search Appdata Entry$")
    public void user_search_appdata_entry() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Search_Input(), 60, 5);
    	AppDataEntry.Search_Input().click();
    	AppDataEntry.Search_Input().sendKeys("AppData");
    }

    @And("^user click on First record of Appdata Entry$")
    public void user_click_on_first_record_of_appdata_entry() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Inbox_Edit(), 60, 5);
    	AppDataEntry.Inbox_Edit().click();
    }

    @And("^user click on Customer Details Tab$")
    public void user_click_on_customer_details_tab() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Customer_details_Tab(), 60, 5);
    	AppDataEntry.Customer_details_Tab().click();
    }

    @And("^user click on First Record Edit Icon$")
    public void user_click_on_first_record_edit_icon() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Customer_details_Edit(), 60, 5);
    	AppDataEntry.Customer_details_Edit().click();
    }

    @And("^user verify the customer Type field$")
    public void user_verify_the_customer_type_field() throws Throwable {
    	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsCustomerTypeDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsCustomerTypeDropDown().isDisplayed();
        try {
        	status=AppDataEntry.customerPersonalDetailsCustomerTypeDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"customer Type field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Applicant Type field$")
    public void user_verify_the_applicant_type_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsApplicantTypeDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsApplicantTypeDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsApplicantTypeDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"Applicant Type field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Salutation field$")
    public void user_verify_the_salutation_field() throws Throwable {
    	
       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSalutationDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsSalutationDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsSalutationDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"Salutation field should be non-editable but here its editable hence failed");
    }
	
    @And("^user verify the First Name field$")
    public void user_verify_the_first_name_field() throws Throwable {
    	
       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFirstNameinputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsFirstNameinputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsFirstNameinputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"First Name field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Middle Name filed$")
    public void user_verify_the_middle_name_filed() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsMiddleNameInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsMiddleNameInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsMiddleNameInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"Middle Name field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Last Name field$")
    public void user_verify_the_last_name_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsLastNameInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsLastNameInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsLastNameInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"Last Name field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Father First Name field$")
    public void user_verify_the_father_first_name_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFatherFirstNameInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsFatherFirstNameInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsFatherFirstNameInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"Father First Name field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Father Middle Name field$")
    public void user_verify_the_father_middle_name_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFatherMiddleNameInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsFatherMiddleNameInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsFatherMiddleNameInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"Father Middle Name field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Father Last Name Field$")
    public void user_verify_the_father_last_name_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFatherLastNameInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsFatherLastNameInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsFatherLastNameInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"Father Last Name field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the spouse First Name field$")
    public void user_verify_the_spouse_first_name_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseFirstNameInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsSpouseFirstNameInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsSpouseFirstNameInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"spouse First Name field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the spouse Middle name field$")
    public void user_verify_the_spouse_middle_name_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseMiddleNameInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsSpouseMiddleNameInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsSpouseMiddleNameInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"spouse Middle Name field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the spouse Last Name field$")
    public void user_verify_the_spouse_last_name_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseLastNameInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsSpouseLastNameInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsSpouseLastNameInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status,"spouse Last Name field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the No of children field$")
    public void user_verify_the_no_of_children_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsNoOfChildrenInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsNoOfChildrenInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsNoOfChildrenInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," No of children field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the spouse status field$")
    public void user_verify_the_spouse_status_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseStatusInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsSpouseStatusInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsSpouseStatusInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," spouse status field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Date of birth field$")
    public void user_verify_the_date_of_birth_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsDateOfBirthCalendarInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsDateOfBirthCalendarInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsDateOfBirthCalendarInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true"); 
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Date of birth field should be non-editable but here its editable hence failed");
    }
	
    @And("^user verify the gender field$")
    public void user_verify_the_gender_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsGenderDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsGenderDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsGenderDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," gender field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Education Level field$")
    public void user_verify_the_education_level_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsEducationLevelDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsEducationLevelDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsEducationLevelDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Education Level field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Marital status field$")
    public void user_verify_the_marital_status_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsMaritalStatusDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsMaritalStatusDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsMaritalStatusDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Marital status field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Nationality field$")
    public void user_verify_the_nationality_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsNationalityDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsNationalityDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsNationalityDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");  
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Nationality field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Ethinicity field$")
    public void user_verify_the_ethinicity_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsEthinicityDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsEthinicityDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsEthinicityDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Ethinicity field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Religion field$")
    public void user_verify_the_religion_field() throws Throwable {
    	javaHelper.scrollIntoView(AppDataEntry.customerPersonalDetailsReligionDropDown());
       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsReligionDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsReligionDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsReligionDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Religion field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Residental status field$")
    public void user_verify_the_residental_status_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsResidentialStatusDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsResidentialStatusDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsResidentialStatusDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Residental status field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Language field$")
    public void user_verify_the_language_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsLanguageDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsLanguageDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsLanguageDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Language field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the No Of dependents field$")
    public void user_verify_the_no_of_dependents_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," No Of dependents field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Mothers maiden name field$")
    public void user_verify_the_mothers_maiden_name_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsMothersMaidenNameInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsMothersMaidenNameInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsMothersMaidenNameInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Mothers maiden name field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Type of Residence field$")
    public void user_verify_the_type_of_residence_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsTypeOfResidenceInputBox(), 60, 2);
        AppDataEntry.customerPersonalDetailsTypeOfResidenceInputBox().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsTypeOfResidenceInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");  
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Residence field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the category of client field$")
    public void user_verify_the_category_of_client_field() throws Throwable {

       	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsCategoryOfClientDropDown(), 60, 2);
        AppDataEntry.customerPersonalDetailsCategoryOfClientDropDown().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetailsCategoryOfClientDropDown().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Client field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Rating field$")
    public void user_verify_the_rating_field() throws Throwable {

      	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsRatingInputBox(), 60, 2);
        AppDataEntry.customerDetailsRatingInputBox().isDisplayed();
        try {
        	AppDataEntry.customerDetailsRatingInputBox().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");   
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Rating field should be non-editable but here its editable hence failed");
    }

    @And("^user verify the Remark fields$")
    public void user_verify_the_remark_fields() throws Throwable {
 
      	boolean status = true;
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetaisRemark(), 60, 2);
        AppDataEntry.customerDetaisRemark().isDisplayed();
        try {
        	status=AppDataEntry.customerDetaisRemark().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");    
    }
        catch(Exception e) {
            status = false;
            System.out.println("Field is not editable");
        }
        softassert.assertTrue(status," Reamrk field should be non-editable but here its editable hence failed");
        softassert.assertAll();
    }
    
	    
	
	//******************@AT-PDE-002**********************//
    
    @And("^user click the Add button annd verify it$")
    public void user_click_the_add_button_annd_verify_it() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Customer_details_Add(), 60, 5);
    	AppDataEntry.Customer_details_Add().isDisplayed();
    	AppDataEntry.Customer_details_Add().click();
    }

    @And("^user Choose customer Type$")
    public void user_choose_customer_type() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.Customer_details_Add(), 60, 5);
    	AppDataEntry.customerDetailsCustomerTypeDropDown().isDisplayed();
    	AppDataEntry.customerDetailsCustomerTypeDropDown().click();
    	
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.CustType+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    	
    }

    @And("^user Enter CIF ID$")
    public void user_enter_cif_id() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsCIfInputBox(), 60, 5);
    	AppDataEntry.customerDetailsCIfInputBox().isDisplayed();
    	AppDataEntry.customerDetailsCIfInputBox().click();
    	AppDataEntry.customerDetailsCIfInputBox().sendKeys(personalData.CIFID);
    }

    @And("^user Enter Application Number$")
    public void user_enter_application_number() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsApplicationNumberInputBox(), 60, 5);
    	AppDataEntry.customerDetailsApplicationNumberInputBox().isDisplayed();
    	AppDataEntry.customerDetailsApplicationNumberInputBox().click();
    	AppDataEntry.customerDetailsApplicationNumberInputBox().sendKeys(personalData.ApplicationNo);
    }

    @And("^user Enter Customer Name$")
    public void user_enter_customer_name() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsCustomerNameInputBox(), 60, 5);
    	AppDataEntry.customerDetailsCustomerNameInputBox().isDisplayed();
    	AppDataEntry.customerDetailsCustomerNameInputBox().click();
    	AppDataEntry.customerDetailsCustomerNameInputBox().sendKeys(personalData.CustName);
    }

    @And("^user choose ID Type$")
    public void user_choose_id_type() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsIDTypeDropDown(), 60, 5);
    	AppDataEntry.customerDetailsIDTypeDropDown().isDisplayed();
    	AppDataEntry.customerDetailsIDTypeDropDown().click();
    	
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.IDType+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter ID Number$")
    public void user_enter_id_number() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsIDNumberInputBox(), 60, 5);
    	AppDataEntry.customerDetailsIDNumberInputBox().isDisplayed();
    	for (int i = 0; i < 50; i++) {
			try {
		    	AppDataEntry.customerDetailsIDNumberInputBox().click();
		    	AppDataEntry.customerDetailsIDNumberInputBox().sendKeys(personalData.IDNo);
		    	break;
			} catch (Exception e) {
				
			}
		}

    }

    @And("^user Enter Mobile Number$")
    public void user_enter_mobile_number() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsMobileNumberInputBox(), 60, 5);
    	AppDataEntry.customerDetailsMobileNumberInputBox().isDisplayed();
    	AppDataEntry.customerDetailsMobileNumberInputBox().click();
    	AppDataEntry.customerDetailsMobileNumberInputBox().sendKeys(personalData.MobileNo);
    }

    @And("^user Choose Date of Birth$")
    public void user_choose_date_of_birth() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsDateOfBirthInputCalendar(), 60, 5);
    	AppDataEntry.customerDetailsDateOfBirthInputCalendar().isDisplayed();
    	AppDataEntry.customerDetailsDateOfBirthInputCalendar().click();
//    	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.calendarFirstYear(), 60, 5);
//    	AppDataEntry.calendarFirstYear().click();
    	driver.findElement(By.xpath("//button[contains(text(),'"+personalData.Currentyear+"')]")).click();
    	for (int i = 0; i < 50; i++) {
			try {
				
				driver.findElement(By.xpath("//span[contains(text(),'"+personalData.year+"')]")).click();
				break;
			}
			catch(Exception e) {
				AppDataEntry.calendarPreviousButton().click();
			}
		}
    	driver.findElement(By.xpath("//span[contains(text(),'"+personalData.Month+"')]")).click();
    	driver.findElement(By.xpath("//span[contains(text(),'"+personalData.Date+"')]")).click();
    }

    @And("^user Enter Email ID$")
    public void user_enter_email_id() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsEmailIDInputBox(), 60, 5);
    	AppDataEntry.customerDetailsEmailIDInputBox().isDisplayed();
    	AppDataEntry.customerDetailsEmailIDInputBox().click();
    	AppDataEntry.customerDetailsEmailIDInputBox().sendKeys(personalData.EMAIL);
    }

    @And("^user Click the search button$")
    public void user_click_the_search_button() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetails_Customer_search(), 60, 5);
    	AppDataEntry.customerDetails_Customer_search().isDisplayed();
    	AppDataEntry.customerDetails_Customer_search().click();
    }

    @And("^user click the Create New Record button$")
    public void user_click_the_create_new_record_button() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetails_Customer_CreateNewReq(), 60, 5);
    	AppDataEntry.customerDetails_Customer_CreateNewReq().isDisplayed();
    	AppDataEntry.customerDetails_Customer_CreateNewReq().click();
    }
    
    @And("^user Enter the customer Type field$")
    public void user_enter_the_customer_type_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsCustomerTypeDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsCustomerTypeDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsCustomerTypeDropDown().click();
    	
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.CustType+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Applicant Type field$")
    public void user_enter_the_applicant_type_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsApplicantTypeDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsApplicantTypeDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsApplicantTypeDropDown().click();
    	
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.ApplicantType+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Salutation field$")
    public void user_enter_the_salutation_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSalutationDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsSalutationDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsSalutationDropDown().click();
    	
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.Salutation+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the First Name field$")
    public void user_enter_the_first_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFirstNameinputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsFatherFirstNameInputBox().isDisplayed();
    	for (int i = 0; i < 50; i++) {
			try {
		    	AppDataEntry.customerPersonalDetailsFirstNameinputBox().click();
		    	AppDataEntry.customerPersonalDetailsFirstNameinputBox().sendKeys(personalData.FirstName);
		    	break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

    }

    @And("^user Enter the Middle Name filed$")
    public void user_enter_the_middle_name_filed() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsMiddleNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsMiddleNameInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsMiddleNameInputBox().click();
    	AppDataEntry.customerPersonalDetailsMiddleNameInputBox().sendKeys(personalData.MiddleName); 
    }

    @And("^user Enter the Last Name field$")
    public void user_enter_the_last_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsLastNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsLastNameInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsLastNameInputBox().click();
    	AppDataEntry.customerPersonalDetailsLastNameInputBox().sendKeys(personalData.LastName); 
    }

    @And("^user Enter the Father First Name field$")
    public void user_enter_the_father_first_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFatherFirstNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsFatherFirstNameInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsFatherFirstNameInputBox().click();
    	AppDataEntry.customerPersonalDetailsFatherFirstNameInputBox().sendKeys(personalData.FatherFirstName); 
    }

    @And("^user Enter the Father Middle Name field$")
    public void user_enter_the_father_middle_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFatherMiddleNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsFatherMiddleNameInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsFatherMiddleNameInputBox().click();
    	AppDataEntry.customerPersonalDetailsFatherMiddleNameInputBox().sendKeys(personalData.FatherMiddleName); 
    }

    @And("^user Enter the Father Last Name Field$")
    public void user_enter_the_father_last_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFatherLastNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsFatherLastNameInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsFatherLastNameInputBox().click();
    	AppDataEntry.customerPersonalDetailsFatherLastNameInputBox().sendKeys(personalData.FatherLastName);
    }

    @And("^user Enter the spouse First Name field$")
    public void user_enter_the_spouse_first_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseFirstNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsSpouseFirstNameInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsSpouseFirstNameInputBox().click();
    	AppDataEntry.customerPersonalDetailsSpouseFirstNameInputBox().sendKeys(personalData.SpouseFirstName); 
    }

    @And("^user Enter the spouse Middle name field$")
    public void user_enter_the_spouse_middle_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseMiddleNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsSpouseMiddleNameInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsSpouseMiddleNameInputBox().click();
    	AppDataEntry.customerPersonalDetailsSpouseMiddleNameInputBox().sendKeys(personalData.SpouseMiddleName); 
    }

    @And("^user Enter the spouse Last Name field$")
    public void user_enter_the_spouse_last_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseLastNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsSpouseLastNameInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsSpouseLastNameInputBox().click();
    	AppDataEntry.customerPersonalDetailsSpouseLastNameInputBox().sendKeys(personalData.SpouseLastName); 
    }

    @And("^user Enter the No of children field$")
    public void user_enter_the_no_of_children_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsNoOfChildrenInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsNoOfChildrenInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsNoOfChildrenInputBox().click();
    	AppDataEntry.customerPersonalDetailsNoOfChildrenInputBox().sendKeys(personalData.NoOfChildren);
    }

    @And("^user Enter the spouse status field$")
    public void user_enter_the_spouse_status_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseStatusInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsSpouseStatusInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsSpouseStatusInputBox().click();
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.SpouseStatus+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Date of birth field$")
    public void user_enter_the_date_of_birth_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsDateOfBirthCalendarInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsDateOfBirthCalendarInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsDateOfBirthCalendarInputBox().click();

    	driver.findElement(By.xpath("//button[contains(text(),'"+personalData.Currentyear+"')]")).click();
    	for (int i = 0; i < 50; i++) {
			try {
				
				driver.findElement(By.xpath("//span[contains(text(),'"+personalData.year+"')]")).click();
				break;
			}
			catch(Exception e) {
				AppDataEntry.calendarPreviousButton().click();
			}
		}
    	driver.findElement(By.xpath("//span[contains(text(),'"+personalData.Month+"')]")).click();
    	driver.findElement(By.xpath("//span[contains(text(),'"+personalData.Date+"')]")).click();
    }

    @And("^user Enter the gender field$")
    public void user_enter_the_gender_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsGenderDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsGenderDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsGenderDropDown().click();
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[text()=' "+personalData.Gender+" ']//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Education Level field$")
    public void user_enter_the_education_level_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsEducationLevelDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsEducationLevelDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsEducationLevelDropDown().click();
    	
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.EduLevel+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Marital status field$")
    public void user_enter_the_marital_status_field() throws Throwable {
    	javaHelper.scrollIntoView(AppDataEntry.customerPersonalDetailsMaritalStatusDropDown());
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsMaritalStatusDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsMaritalStatusDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsMaritalStatusDropDown().click();
    	
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.Maritalstatus+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Nationality field$")
    public void user_enter_the_nationality_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsNationalityDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsNationalityDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsNationalityDropDown().click();
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.Nationality+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Ethinicity field$")
    public void user_enter_the_ethinicity_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsEthinicityDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsEthinicityDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsEthinicityDropDown().click();
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.Ethinicity+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Religion field$")
    public void user_enter_the_religion_field() throws Throwable {
    	javaHelper.scrollIntoView(AppDataEntry.customerPersonalDetailsReligionDropDown());
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsReligionDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsReligionDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsReligionDropDown().click();
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.Religion+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Residental status field$")
    public void user_enter_the_residental_status_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsResidentialStatusDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsResidentialStatusDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsResidentialStatusDropDown().click();
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.Residentalstatus+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Language field$")
    public void user_enter_the_language_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsLanguageDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsLanguageDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsLanguageDropDown().click();
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.Language+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the No Of dependents field$")
    public void user_enter_the_no_of_dependents_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox().isDisplayed();
    	for (int i = 0; i < 50; i++) {
			try {
		    	AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox().click();
		    	AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox().sendKeys(personalData.NoOfDependents);
		   break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
 }

    @And("^user Enter the Mothers maiden name field$")
    public void user_enter_the_mothers_maiden_name_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsMothersMaidenNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsMothersMaidenNameInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsMothersMaidenNameInputBox().click();
    	AppDataEntry.customerPersonalDetailsMothersMaidenNameInputBox().sendKeys(personalData.MothersMaidenName);
    }

    @And("^user Enter the Type of Residence field$")
    public void user_enter_the_type_of_residence_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsTypeOfResidenceInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsTypeOfResidenceInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsTypeOfResidenceInputBox().click();
    	
    	for (int i = 0; i < 50; i++) {
    		try {
    			driver.findElement(By.xpath("//ion-label[text()=' "+personalData.TypeofResidence+" ']//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the category of client field$")
    public void user_enter_the_category_of_client_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsCategoryOfClientDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsCategoryOfClientDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsCategoryOfClientDropDown().click();
    	
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.CategoryOfClient+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }

    @And("^user Enter the Rating field$")
    public void user_enter_the_rating_field() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsRatingInputBox(), 60, 5);
    	AppDataEntry.customerDetailsRatingInputBox().isDisplayed();
    	for (int i = 0; i <50; i++) {
			try {
				AppDataEntry.customerDetailsRatingInputBox().click();
				break;
				
			} catch (Exception e) {
				
			}
		}
    	
    	AppDataEntry.customerDetailsRatingInputBox().sendKeys(personalData.Rating);
    }

    @And("^user Enter the Remark fields$")
    public void user_enter_the_remark_fields() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetaisRemark(), 60, 5);
    	AppDataEntry.customerDetaisRemark().isDisplayed();
    	AppDataEntry.customerDetaisRemark().click();
    	AppDataEntry.customerDetaisRemark().sendKeys(personalData.Remarks);
    }
	
    @And("^user Enter the Phone Number in Contact Details$")
    public void user_enter_the_phone_number_in_contact_details() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsPhoneNumberInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsPhoneNumberInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsPhoneNumberInputBox().click();
    	AppDataEntry.customerPersonalDetailsPhoneNumberInputBox().sendKeys(personalData.PhoneNumber);
    }

    @And("^user Enter the Mobile Number Primary in Contact Details$")
    public void user_enter_the_mobile_number_primary_in_contact_details() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsMobileNumberPrimaryInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsMobileNumberPrimaryInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsMobileNumberPrimaryInputBox().click();
    	AppDataEntry.customerPersonalDetailsMobileNumberPrimaryInputBox().sendKeys(personalData.MobileNumberprimary);
    }

    @And("^user Enter the Mobile Number Secondary in Contact Details$")
    public void user_enter_the_mobile_number_secondary_in_contact_details() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsMobileNumberSecondaryInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsMobileNumberSecondaryInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsMobileNumberSecondaryInputBox().click();
    	AppDataEntry.customerPersonalDetailsMobileNumberSecondaryInputBox().sendKeys(personalData.MobileNumbersecondary);
    }

    @And("^user Enter the Email Address in Contact Details$")
    public void user_enter_the_email_address_in_contact_details() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsEMAILInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsEMAILInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsEMAILInputBox().click();
    	AppDataEntry.customerPersonalDetailsEMAILInputBox().sendKeys(personalData.EMAIL);
    }

    @And("^user Select the Prefered contact Methods in Contact Details$")
    public void user_select_the_prefered_contact_Methods_in_contact_details() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsPerfectContactMethodDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsPerfectContactMethodDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsPerfectContactMethodDropDown().click();
    	for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.PREFEREDCONTACTMethod+"')]//following-sibling::ion-radio")).click();
				break; 
			} catch (Exception e) {
				
			}
		}
    	
    	
    }

    @And("^user Enter the Prefered time for contact in Contact Details$")
    public void user_enter_the_prefered_time_for_contact_in_contact_details() throws Throwable {
     	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsPreferedTimeForContactInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsPreferedTimeForContactInputBox().isDisplayed();
    	AppDataEntry.customerPersonalDetailsPreferedTimeForContactInputBox().click();
    	AppDataEntry.customerPersonalDetailsPreferedTimeForContactInputBox().sendKeys(personalData.PREFEREDCONTACTDETAILS);
    }
	

    @And("^user click the Save the button$")
    public void user_click_the_save_the_button() throws Throwable {
        javaHelper.scrollIntoView(AppDataEntry.customerPersonalDetails_Save());
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Save(), 60, 5);
        AppDataEntry.customerPersonalDetails_Save().isDisplayed();
        AppDataEntry.customerPersonalDetails_Save().click();
        Thread.sleep(1000);
        Assert.assertEquals("Success", AppDataEntry.customerPersonalDetails_Alert().getText());
        
    }
	
	
	
    @And("^user Modify the Applicant Type field$")
    public void user_modify_the_Applicant_Type_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsApplicantTypeDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsApplicantTypeDropDown().isDisplayed();
    	AppDataEntry.customerPersonalDetailsApplicantTypeDropDown().click();
    	
    	for (int i = 0; i < 50; i++) {
    		try {
    				driver.findElement(By.xpath("//ion-label[contains(text(),'"+personalData.ModifyApplicantType+"')]//following-sibling::ion-radio")).click();
    				break; 
    		}catch(Exception e) {
    			
    		}
		}
    }
    
    @And("^user click the update the button$")
    public void user_click_the_update_the_button() throws Throwable {
        javaHelper.scrollIntoView(AppDataEntry.customerPersonalDetails_Update());
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Update(), 60, 5);
        AppDataEntry.customerPersonalDetails_Update().isDisplayed();
        AppDataEntry.customerPersonalDetails_Update().click();
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Alert(), 60, 5);
        Assert.assertEquals("Success", AppDataEntry.customerPersonalDetails_Alert().getText());
        
        
    }
	
	// AT_PDE_004
    
    @And("^user verify the Back button List View$")
    public void user_verify_the_back_button_list_view() throws Throwable {
        
    }

    @And("^user verify the CIF ID List view$")
    public void user_verify_the_cif_id_list_view() throws Throwable { 		
    	
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Listview_CIFID(), 60, 2);
        AppDataEntry.customerPersonalDetails_Listview_CIFID().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetails_Listview_CIFID().click();   
        	AppDataEntry.customerPersonalDetails_Listview_CIFID().sendKeys("0");
    }
        catch(ElementNotInteractableException e) {
            
            System.out.println("Field is not editable");
        }
//    	   softassert.assertTrue(status);
    }

    @And("^user verify the First Name List View$")
    public void user_verify_the_first_name_list_view() throws Throwable {

        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Listview_FirstName(), 60, 2);
        AppDataEntry.customerPersonalDetails_Listview_FirstName().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetails_Listview_FirstName().click(); 
        	AppDataEntry.customerPersonalDetails_Listview_FirstName().sendKeys("0");
    }
        catch(ElementNotInteractableException e) {
            
            System.out.println("Field is not editable");
        }
    }

    @And("^user verify the Middle Name List View$")
    public void user_verify_the_middle_name_list_view() throws Throwable {
    	
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Listview_MiddleName(), 60, 2);
        AppDataEntry.customerPersonalDetails_Listview_MiddleName().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetails_Listview_MiddleName().click(); 
        	AppDataEntry.customerPersonalDetails_Listview_MiddleName().sendKeys("0");
    }
        catch(ElementNotInteractableException e) {
            
            System.out.println("Field is not editable");
        }
    }

    @And("^user Verify the Last Name List View$")
    public void user_verify_the_last_name_list_view() throws Throwable {
    
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Listview_LastName(), 60, 2);
        AppDataEntry.customerPersonalDetails_Listview_LastName().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetails_Listview_LastName().click(); 
        	AppDataEntry.customerPersonalDetails_Listview_LastName().sendKeys("0");
    }
        catch(ElementNotInteractableException e) {
         
            System.out.println("Field is not editable");
        }
    }

    @And("^user verify the Customer Type List View$")
    public void user_verify_the_customer_type_list_view() throws Throwable {
       	
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Listview_CustType(), 60, 2);
        AppDataEntry.customerPersonalDetails_Listview_CustType().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetails_Listview_CustType().click();    
        	AppDataEntry.customerPersonalDetails_Listview_CustType().sendKeys("0");
    }
        catch(ElementNotInteractableException e) {
            
            System.out.println("Field is not editable");
        }
    }

    @And("^user verify the Applicant Type List View$")
    public void user_verify_the_applicant_type_list_view() throws Throwable {
       
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Listview_AppliType(), 60, 2);
        AppDataEntry.customerPersonalDetails_Listview_AppliType().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetails_Listview_AppliType().click(); 
        	AppDataEntry.customerPersonalDetails_Listview_AppliType().sendKeys("0");
    }
        catch(ElementNotInteractableException e) {
          
            System.out.println("Field is not editable");
        }
    }

    @And("^user verify the Status List View$")
    public void user_verify_the_status_list_view() throws Throwable {
      
        waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetails_Listview_Status(), 60, 2);
        AppDataEntry.customerPersonalDetails_Listview_Status().isDisplayed();
        try {
        	AppDataEntry.customerPersonalDetails_Listview_Status().click(); 
        	AppDataEntry.customerPersonalDetails_Listview_Status().sendKeys("0");  
    }
        catch(Exception e) {
       
            System.out.println("Field is not editable");
        }
    }

	
	
	
	
	
	
	
	
}
