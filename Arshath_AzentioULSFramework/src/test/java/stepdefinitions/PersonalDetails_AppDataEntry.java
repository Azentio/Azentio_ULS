package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
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
	
	
    @Given("^User Launch the KULS url for Transaction$")
    public void user_launch_the_kuls_url_for_transaction() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
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
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsCustomerTypeDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsCustomerTypeDropDown().isDisplayed();
    }

    @And("^user verify the Applicant Type field$")
    public void user_verify_the_applicant_type_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsApplicantTypeDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsApplicantTypeDropDown().isDisplayed();
    }

    @And("^user verify the Salutation field$")
    public void user_verify_the_salutation_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSalutationDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsSalutationDropDown().isDisplayed();
    }
	
    @And("^user verify the First Name field$")
    public void user_verify_the_first_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFirstNameinputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsFirstNameinputBox().isDisplayed();
    }

    @And("^user verify the Middle Name filed$")
    public void user_verify_the_middle_name_filed() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsMiddleNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsMiddleNameInputBox().isDisplayed();
    }

    @And("^user verify the Last Name field$")
    public void user_verify_the_last_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsLastNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsLastNameInputBox().isDisplayed();
    }

    @And("^user verify the Father First Name field$")
    public void user_verify_the_father_first_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFatherFirstNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsFatherFirstNameInputBox().isDisplayed();
    }

    @And("^user verify the Father Middle Name field$")
    public void user_verify_the_father_middle_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFatherMiddleNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsFatherMiddleNameInputBox().isDisplayed();
    }

    @And("^user verify the Father Last Name Field$")
    public void user_verify_the_father_last_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsFatherLastNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsFatherLastNameInputBox().isDisplayed();
    }

    @And("^user verify the spouse First Name field$")
    public void user_verify_the_spouse_first_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseFirstNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsSpouseFirstNameInputBox().isDisplayed();
    }

    @And("^user verify the spouse Middle name field$")
    public void user_verify_the_spouse_middle_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseMiddleNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsSpouseMiddleNameInputBox().isDisplayed();
    }

    @And("^user verify the spouse Last Name field$")
    public void user_verify_the_spouse_last_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseLastNameInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsSpouseLastNameInputBox().isDisplayed();
    }

    @And("^user verify the No of children field$")
    public void user_verify_the_no_of_children_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsNoOfChildrenInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsNoOfChildrenInputBox().isDisplayed();
    }

    @And("^user verify the spouse status field$")
    public void user_verify_the_spouse_status_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsSpouseStatusInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsSpouseStatusInputBox().isDisplayed();
    }

    @And("^user verify the Date of birth field$")
    public void user_verify_the_date_of_birth_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsDateOfBirthCalendarInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsDateOfBirthCalendarInputBox().isDisplayed();
    }
	
    @And("^user verify the gender field$")
    public void user_verify_the_gender_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsGenderDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsGenderDropDown().isDisplayed();
    }

    @And("^user verify the Education Level field$")
    public void user_verify_the_education_level_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsEducationLevelDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsEducationLevelDropDown().isDisplayed();
    }

    @And("^user verify the Marital status field$")
    public void user_verify_the_marital_status_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsMaritalStatusDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsMaritalStatusDropDown().isDisplayed();
    }

    @And("^user verify the Nationality field$")
    public void user_verify_the_nationality_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsNationalityDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsNationalityDropDown().isDisplayed();
    }

    @And("^user verify the Ethinicity field$")
    public void user_verify_the_ethinicity_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsEthinicityDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsEthinicityDropDown().isDisplayed();
    }

    @And("^user verify the Religion field$")
    public void user_verify_the_religion_field() throws Throwable {
    	javaHelper.scrollIntoView(AppDataEntry.customerPersonalDetailsReligionDropDown());
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsReligionDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsReligionDropDown().isDisplayed();
    }

    @And("^user verify the Residental status field$")
    public void user_verify_the_residental_status_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsResidentialStatusDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsResidentialStatusDropDown().isDisplayed();
    }

    @And("^user verify the Language field$")
    public void user_verify_the_language_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsLanguageDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsLanguageDropDown().isDisplayed();
    }

    @And("^user verify the No Of dependents field$")
    public void user_verify_the_no_of_dependents_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox().isDisplayed();
    }

    @And("^user verify the Mothers maiden name field$")
    public void user_verify_the_mothers_maiden_name_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsNoOfDependentsInputBox().isDisplayed();
    }

    @And("^user verify the Type of Residence field$")
    public void user_verify_the_type_of_residence_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsTypeOfResidenceInputBox(), 60, 5);
    	AppDataEntry.customerPersonalDetailsTypeOfResidenceInputBox().isDisplayed();
    }

    @And("^user verify the category of client field$")
    public void user_verify_the_category_of_client_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerPersonalDetailsCategoryOfClientDropDown(), 60, 5);
    	AppDataEntry.customerPersonalDetailsCategoryOfClientDropDown().isDisplayed();
    }

    @And("^user verify the Rating field$")
    public void user_verify_the_rating_field() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetailsRatingInputBox(), 60, 5);
    	AppDataEntry.customerDetailsRatingInputBox().isDisplayed();
    }

    @And("^user verify the Remark fields$")
    public void user_verify_the_remark_fields() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, AppDataEntry.customerDetaisRemark(), 60, 5);
    	AppDataEntry.customerDetaisRemark().isDisplayed();
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
