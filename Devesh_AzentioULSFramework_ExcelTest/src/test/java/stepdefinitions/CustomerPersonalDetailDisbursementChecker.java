package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.CustomerPersonalDetailDisbursementCheckerObj;
import pageobjects.KULS_LoginObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.CustomerPersonalDetailDisbursementCheckerTestDataType;
import testDataType.KULS_Login_TestDataType;

public class CustomerPersonalDetailDisbursementChecker {

	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Login_TestDataType ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	String referenceID;
	CustomerPersonalDetailDisbursementCheckerObj personalDetailDISBCKRObj = new CustomerPersonalDetailDisbursementCheckerObj(driver);
	CustomerPersonalDetailDisbursementCheckerTestDataType personalDetailDISBCKRTestDataType = jsonConfig.getCustomerPersonalDetailDisbursementCheckerByName("Maker");
	SoftAssert softAssert=new SoftAssert();
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","PersonalDetailsDISBCKRTestData","Data Set ID");
	Map<String, String> testData;
	String dataSetID;
	
	@Then("^user should click on menu toggle to open the sidebar$")
	public void user_should_click_on_menu_toggle_to_open_the_sidebar() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Maker_MenuToggle());
		personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Maker_MenuToggle().click();
	}
	
	@Then("^click on inbox for Personal detail Disbursement Checker stage record$")
    public void click_on_inbox_for_personal_detail_disbursement_checker_stage_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Inbox());
		personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Inbox().click();
    }

    @Then("^click on search button to search the record of in Personal detail Disbursement Checker stage$")
    public void click_on_search_button_to_search_the_record_of_in_personal_detail_disbursement_checker_stage() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_SearchInbox());
    	personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_SearchInbox().click();
    }

    @Then("^enter the reference id of Personal detail Disbursement Checker stage record$")
    public void enter_the_reference_id_of_personal_detail_disbursement_checker_stage_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_SearchInboxInputField());
    	personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_SearchInboxInputField().sendKeys(testData.get("Stage Code"));
    }

    @Then("^click on the entitle button of the Personal detail Disbursement Checker stage record$")
    public void click_on_the_entitle_button_of_the_personal_detail_disbursement_checker_stage_record() throws Throwable {
		String beforexpath = "//span[text()='";
		String afterxpath = "']/../../td/button";
		while (true) {
			try {
				driver.findElement(By.xpath(beforexpath + testData.get("Application id") + afterxpath)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

    @Then("^verify customer details tab availablity under Personal detail Disbursement Checker stage$")
    public void verify_customer_details_tab_availablity_under_personal_detail_disbursement_checker_stage() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CustomerDetailTab());
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CustomerDetailTab().isDisplayed();
    	Assert.assertTrue(result);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CustomerDetailTab());
    	personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CustomerDetailTab().click();
   
    }
    
    @Then("^verify post clicking on Customer details tab under Disbursement Checker screen should display mention fields$")
    public void verify_post_clicking_on_customer_details_tab_under_disbursement_checker_screen_should_display_mention_fields() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_SearchButton());
    	personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_SearchButton().click();
    	
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_SearchInputField());
    	personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_SearchInputField().sendKeys(testData.get("Customer First Name"));
    	String beforexpath= "//span[contains(text(),'"; 
    	String afterxpath= "')]/../../../td[2]/span/button[1]";
    	Thread.sleep(1000);
    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +testData.get("Customer First Name")+ afterxpath)));
    	driver.findElement(By.xpath(beforexpath +testData.get("Customer First Name")+ afterxpath)).click();
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CustomerType());
    	boolean status = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CustomerType().isDisplayed();
    	Assert.assertTrue(status);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_ApplicantType());
    	boolean status1 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_ApplicantType().isDisplayed();
    	Assert.assertTrue(status1);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Salutation());
    	boolean status2 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Salutation().isDisplayed();
    	Assert.assertTrue(status2);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_FirstName());
    	boolean status3 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_FirstName().isDisplayed();
    	Assert.assertTrue(status3);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_MiddleName());
    	boolean status4 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_MiddleName().isDisplayed();
    	Assert.assertTrue(status4);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_LastName());
    	boolean status5 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_LastName().isDisplayed();
    	Assert.assertTrue(status5);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_DateOfBirth());
    	boolean status6 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_DateOfBirth().isDisplayed();
    	Assert.assertTrue(status6);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Gender());
    	boolean status7 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Gender().isDisplayed();
    	Assert.assertTrue(status7);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_EducationLevel());
    	boolean status8 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_EducationLevel().isDisplayed();
    	Assert.assertTrue(status8);
    	javaScriptHelper.scrollIntoView(personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_MaritalStatus());
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_MaritalStatus());
    	boolean status9 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_MaritalStatus().isDisplayed();
    	Assert.assertTrue(status9);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Nationality());
    	boolean status10 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Nationality().isDisplayed();
    	Assert.assertTrue(status10);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CustomerCategory());
    	boolean status11 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CustomerCategory().isDisplayed();
    	Assert.assertTrue(status11);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Religion());
    	boolean status12 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Religion().isDisplayed();
    	Assert.assertTrue(status12);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_ResidentialStatus());
    	boolean status13 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_ResidentialStatus().isDisplayed();
    	Assert.assertTrue(status13);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Language());
    	boolean status14 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Language().isDisplayed();
    	Assert.assertTrue(status14);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_NoOfDependents());
    	boolean status15 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_NoOfDependents().isDisplayed();
    	Assert.assertTrue(status15);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_MothersMaidenName());
    	boolean status16 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_MothersMaidenName().isDisplayed();
    	Assert.assertTrue(status16);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_TypeOfResidence());
    	boolean status17 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_TypeOfResidence().isDisplayed();
    	Assert.assertTrue(status17);
//    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CategoryOfClient());
//    	boolean status18 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CategoryOfClient().isDisplayed();
//    	Assert.assertTrue(status18);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_ExistingBankRelationship());
    	boolean status19 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_ExistingBankRelationship().isDisplayed();
    	Assert.assertTrue(status19);
    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Blacklisted());
    	boolean status20 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Blacklisted().isDisplayed();
    	Assert.assertTrue(status20);
    	
//    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Rating());
//    	boolean status21 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Rating().isDisplayed();
//    	softAssert.assertTrue(status21);
//    	waithelper.waitForElementwithFluentwait(driver, personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Ethinicity());
//    	boolean status22 = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Ethinicity().isDisplayed();
//    	softAssert.assertTrue(status22);
    }

    @Then("^verify the field Date of Birth on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_date_of_birth_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String dob = javaScriptHelper.executeScript("return document.querySelector(\"#icon\").value").toString();
        System.out.println(dob);
    	Assert.assertEquals(testData.get("DateOfBirth"), dob);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_DateOfBirth().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Date Of Birth field is in read only mode");
    }

    @Then("^verify the field Education Level on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_education_level_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String educationLevel =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[8].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(educationLevel);
    	Assert.assertEquals(testData.get("EducationLevel"), educationLevel);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_EducationLevel().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Education Level field is in read only mode");
    }

    @Then("^verify the field No of Dependents on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_no_of_dependents_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String noOfDependents =javaScriptHelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[11].value").toString();
    	System.out.println(noOfDependents);
    	Assert.assertEquals(testData.get("NoOfDependents"), noOfDependents);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_NoOfDependents().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "NoOfDependents field is in read only mode");
    }

//    @Then("^verify the field Customer Name on Customer details tab under Disbursement Checker screen$")
//    public void verify_the_field_customer_name_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
//    	String customerName =javaScriptHelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[1].value").toString();
//    	Assert.assertEquals(personalDetailDISBCKRTestDataType.CustomerFirstName, customerName);
//    }

    @Then("^verify the field Gender on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_gender_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String gender =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[7].shadowRoot.querySelector('div.select-text').innerText").toString();
    	Assert.assertEquals(testData.get("Gender"), gender);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Gender().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Gender field is in read only mode");
    }

    @Then("^verify the field Existing Relationship on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_existing_relationship_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String existingBankRelationship =personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Blacklisted().getAttribute("aria-checked");
    	Assert.assertEquals(testData.get("ExistingRelationship"), existingBankRelationship);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_ExistingBankRelationship().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "ExistingRelationship field is in read only mode");
    }

    @Then("^verify the field Customer Type on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_customer_type_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String customerType =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[3].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(customerType);
    	Assert.assertEquals(testData.get("Customer Type"), customerType);
		boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CustomerType().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Customer type field is in read only mode");
    }

    @Then("^verify the field Applicant Type on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_applicant_type_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String applicantType =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[4].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(applicantType);
    	Assert.assertEquals(testData.get("Applicant Type"), applicantType);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_ApplicantType().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Applicant type field is in read only mode");
    }

    @Then("^verify the field Last Name or Family Name on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_last_name_or_family_name_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String lastName =javaScriptHelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[3].value").toString();
    	Assert.assertEquals(testData.get("Last Name"), lastName);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_LastName().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "LastName field is in read only mode");
    }

    @Then("^verify the field First Name on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_first_name_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String firstName =javaScriptHelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[1].value").toString();
    	Assert.assertEquals(testData.get("First Name"), firstName);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_FirstName().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "FirstName field is in read only mode");
    }

    @Then("^verify the field Middle Name on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_middle_name_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String middleName =javaScriptHelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[2].value").toString();
    	Assert.assertEquals(testData.get("Middle Name"), middleName);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_MiddleName().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Middle Name field is in read only mode");
    }

    @Then("^verify the field Mothers Maiden Name on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_mothers_maiden_name_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String mothersMaidenName =javaScriptHelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[12].value").toString();
    	Assert.assertEquals(testData.get("Mothers Maiden Name"), mothersMaidenName);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_MothersMaidenName().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Mothers Maiden Name field is in read only mode");
    
    }

    @Then("^verify the field BlackListed on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_blacklisted_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String blacklisted =personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Blacklisted().getAttribute("aria-checked");
    	Assert.assertEquals(testData.get("BlackListed"), blacklisted);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Blacklisted().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Blacklisted field is in read only mode");
		softAssert.assertAll();
    }

    @Then("^verify the field Salutation or Title on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_salutation_or_title_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String salutation =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[5].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(salutation);
    	Assert.assertEquals(testData.get("Salutation"), salutation);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Salutation().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Salutation field is in read only mode");
    }

    @Then("^verify the field Type of Residence on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_type_of_residence_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String typeOfResidence =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[15].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(typeOfResidence);
    	Assert.assertEquals(testData.get("TypeOfResidence"), typeOfResidence); 
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_TypeOfResidence().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "TypeOfResidence field is in read only mode");
    }

    @Then("^verify the field Language on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_language_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String language =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[14].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(language);
    	Assert.assertEquals(testData.get("Language"), language);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Language().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Language field is in read only mode");
    }
    
    @Then("^verify the field Religion on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_religion_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String religion =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[12].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(religion);
    	Assert.assertEquals(testData.get("Religion"), religion);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Religion().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Religion field is in read only mode");
    }

    @Then("^verify the field Category of Client on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_category_of_client_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String categoryOfClient =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[16].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(categoryOfClient);
    	Assert.assertEquals(testData.get("CategoryOfClient"), categoryOfClient);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CategoryOfClient().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Category Of Client field is in read only mode");
    }

    @Then("^verify the field Marital Status on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_marital_status_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String maritalStatus =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[9].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(maritalStatus);
    	Assert.assertEquals(testData.get("MaritalStatus"), maritalStatus);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_MaritalStatus().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Martial Status field is in read only mode");
    }

    @Then("^verify the field Customer Category or Sub Type on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_customer_category_or_sub_type_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String customerCategory =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[11].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(customerCategory);
    	Assert.assertEquals(testData.get("CustomerCategory"), customerCategory);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_CustomerCategory().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Customer Category field is in read only mode");
    }

    @Then("^verify the field Resident Status on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_resident_status_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String residentStatus =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[13].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(residentStatus);
    	Assert.assertEquals(testData.get("ResidentStatus"), residentStatus);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_ResidentialStatus().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Residential status field is in read only mode");
    }

    @Then("^verify the field Industry Description on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_industry_description_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
        
    }

    @Then("^verify the field Nationality on Customer details tab under Disbursement Checker screen$")
    public void verify_the_field_nationality_on_customer_details_tab_under_disbursement_checker_screen() throws Throwable {
    	String nationality =javaScriptHelper.executeScript("return document.querySelectorAll(\"ion-select\")[10].shadowRoot.querySelector('div.select-text').innerText").toString();
    	System.out.println(nationality);
    	Assert.assertEquals(testData.get("Nationality"), nationality);
    	boolean result = personalDetailDISBCKRObj.customerPersonalDetailDisbursementChecker_Nationality().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Nationality field is in read only mode");
    }
    
    @Then("^select data set ID for Personal details at Disbursement Checker stage testcase001$")
    public void select_data_set_id_for_personal_details_at_disbursement_checker_stage_testcase001() throws Throwable {
    	dataSetID = "AT_PDC_001_D1";
        testData = excelData.getTestdata(dataSetID);
    }

}