package stepdefinitions;

import java.io.File;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.CustomerEntityLayout_ContactDetailsObj;
import resources.BaseClass;
import resources.ExcelData;
import testDataType.KULS_CustomerEntityLayout_ContactDetails_Testdata;
import testDataType.KULS_Login_TestDataType;

public class CustomerEntityLayout_ContactDetails_Step {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	CustomerEntityLayout_ContactDetailsObj contactdetailsobj = new CustomerEntityLayout_ContactDetailsObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	KULS_CustomerEntityLayout_ContactDetails_Testdata contactdetailsData = jsonConfig.getContactDetailsByName("Maker");
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign2211a.xlsx", "ContactDetails", "Data Set ID") ;
	Map<String, String> testdata;
	
	@Given("^Launch the kuls application$")
    public void launch_the_kuls_application() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationcenbankUrl();
		driver.get(kulsApplicationUrl);
		System.out.println();
		applicationLogin.loginUlsApplicationAsMaker(loginData.Username1, loginData.Password1);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.TransactionButtonInLeftPanel(), 60, 2);
		Thread.sleep(2000);
    }

    @Then("^Validate the Success popup in contact detatils$")
    public void validate_the_success_popup_in_contact_detatils() throws Throwable {
    	String Toast;
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, contactdetailsobj.ContactDetailsSaveSuccessfulPopup(), 60, 2);
		Toast = contactdetailsobj.ContactDetailsSaveSuccessfulPopup().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Success");
    }

    @And("^Click on Add icon in Contact details view list$")
    public void click_on_add_icon_in_contact_details_view_list() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoViewAndClick(contactdetailsobj.ContactDetailsAddIcon());
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetailsAddIcon(), 60, 2);
    	//contactdetailsobj.ContactDetailsAddIcon().click();
    }

    @And("^Select the value in Phone type field of Contact details$")
    public void select_the_value_in_phone_type_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, contactdetailsobj.ContactDetails_PhoneTypeField(), 60, 2);
    	contactdetailsobj.ContactDetails_PhoneTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Phone type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the value in Phone number field of Contact details$")
    public void enter_the_value_in_phone_number_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_PhoneNumberField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(contactdetailsobj.ContactDetails_PhoneNumberField());
				contactdetailsobj.ContactDetails_PhoneNumberField().sendKeys(testdata.get("Phone Number"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    	
    	
    }

    @And("^Select the value in Consent for phone contact field of Contact details$")
    public void select_the_value_in_consent_for_phone_contact_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, contactdetailsobj.ContactDetails_ConsentForPhoneContactField(), 60, 2);
    	contactdetailsobj.ContactDetails_ConsentForPhoneContactField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Consent for Phone contact")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Select the value in Prefered Phone contact type field of Contact details$")
    public void select_the_value_in_prefered_phone_contact_type_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, contactdetailsobj.ContactDetails_PreferedPhoneCotactTypeField(), 60, 2);
    	contactdetailsobj.ContactDetails_PreferedPhoneCotactTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Prefered phone contact type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the value in Prefered time for contact field of Contact details$")
    public void enter_the_value_in_prefered_time_for_contact_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_PreferedTimeForContactField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(contactdetailsobj.ContactDetails_PreferedTimeForContactField());
				contactdetailsobj.ContactDetails_PreferedTimeForContactField().sendKeys(testdata.get("Prefered time for contact"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Email type field of Contact details$")
    public void select_the_value_in_email_type_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, contactdetailsobj.ContactDetails_EmailTypeField(), 60, 2);
    	contactdetailsobj.ContactDetails_EmailTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Email type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the value in Email id field of Contact details$")
    public void enter_the_value_in_email_id_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_EmailIdField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(contactdetailsobj.ContactDetails_EmailIdField());
				contactdetailsobj.ContactDetails_EmailIdField().sendKeys(testdata.get("Email Id"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Click on Save button in Contact details$")
    public void click_on_save_button_in_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_SaveIcon(), 60, 2);
    	contactdetailsobj.ContactDetails_SaveIcon().click();
    	
    }
    @And("^Navigate to Additional Customer info section$")
    public void navigate_to_additional_customer_info_section() throws Throwable {
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_AdditionalCustomerInfoButton(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(contactdetailsobj.ContactDetails_AdditionalCustomerInfoButton());
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }
    

    @And("^Click on Pencil Icon of existing record$")
    public void click_on_pencil_icon_of_existing_record() throws Throwable {
    	Thread.sleep(2000);
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_PencilIconOfFirstRecord(), 60, 2);
    	contactdetailsobj.ContactDetails_PencilIconOfFirstRecord().click();
    	Thread.sleep(2000);
    }
    @And("^Click on Save button and validate field is required popup$")
    public void click_on_save_button_and_validate_field_is_required_popup() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_SaveIcon(),60,2);
    	contactdetailsobj.ContactDetails_SaveIcon().click();
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.requiredFieldWarningPopup(),60,2);
        Assert.assertEquals(contactdetailsobj.requiredFieldWarningPopup().isDisplayed(), true);
    }

    @And("^Click on Back button$")
    public void click_on_back_button() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.BackIcon(),60,2);
    	contactdetailsobj.BackIcon().click();
    	Thread.sleep(2000);
    }

    @And("^Enter alphabet character in numeric field and validate popup$")
    public void enter_alphabet_character_in_numeric_field_and_validate_popup() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_PreferedTimeForContactField(),60,2);
    	contactdetailsobj.ContactDetails_PreferedTimeForContactField().click();
    	contactdetailsobj.ContactDetails_PreferedTimeForContactField().sendKeys(testdata.get("Alphabet in numeric field"));
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.InvalidTimeFormatWarningPopup(),60,2);
        Assert.assertEquals(contactdetailsobj.InvalidTimeFormatWarningPopup().isDisplayed(), true);
    }

    @And("^Enter invalid email in email id field and validate popup$")
    public void enter_invalid_email_in_email_id_field_and_validate_popup() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_EmailIdField(),60,2);
    	contactdetailsobj.ContactDetails_EmailIdField().click();
    	contactdetailsobj.ContactDetails_EmailIdField().sendKeys(testdata.get("Invalid Email"));
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_EmailIdField(),60,2);
        Assert.assertEquals(contactdetailsobj.ContactDetails_EmailIdField().isDisplayed(), true);
        
    }
    @And("^Click on Pencil icon in Contact details$")
    public void click_on_pencil_icon_in_contact_details() throws Throwable {
    	
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.PencilIconOfFirstRecordInContactDetails(),60,2);
    	//contactdetailsobj.PencilIconOfFirstRecordInContactDetails().click();
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoViewAndClick(contactdetailsobj.PencilIconOfFirstRecordInContactDetails());
				Thread.sleep(2000);
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^Update the value in Phone type field of Contact details$")
    public void update_the_value_in_phone_type_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, contactdetailsobj.ContactDetails_PhoneTypeField(), 60, 2);
    	contactdetailsobj.ContactDetails_PhoneTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Updated Phone type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Phone number field of Contact details$")
    public void update_the_value_in_phone_number_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_PhoneNumberField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(contactdetailsobj.ContactDetails_PhoneNumberField());
				contactdetailsobj.ContactDetails_PhoneNumberField().clear();
				contactdetailsobj.ContactDetails_PhoneNumberField().sendKeys(testdata.get("Updated Phone Number"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Update the value in Consent for phone contact field of Contact details$")
    public void update_the_value_in_consent_for_phone_contact_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, contactdetailsobj.ContactDetails_ConsentForPhoneContactField(), 60, 2);
    	contactdetailsobj.ContactDetails_ConsentForPhoneContactField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Updated Consent for Phone contact")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Prefered Phone contact type field of Contact details$")
    public void update_the_value_in_prefered_phone_contact_type_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, contactdetailsobj.ContactDetails_PreferedPhoneCotactTypeField(), 60, 2);
    	contactdetailsobj.ContactDetails_PreferedPhoneCotactTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Updated Prefered phone contact type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Prefered time for contact field of Contact details$")
    public void update_the_value_in_prefered_time_for_contact_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_PreferedTimeForContactField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(contactdetailsobj.ContactDetails_PreferedTimeForContactField());
				contactdetailsobj.ContactDetails_PreferedTimeForContactField().clear();
				contactdetailsobj.ContactDetails_PreferedTimeForContactField().sendKeys(testdata.get("Updated Prefered time for contact"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Update the value in Email type field of Contact details$")
    public void update_the_value_in_email_type_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, contactdetailsobj.ContactDetails_EmailTypeField(), 60, 2);
    	contactdetailsobj.ContactDetails_EmailTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Updated Email type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Email id field of Contact details$")
    public void update_the_value_in_email_id_field_of_contact_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_EmailIdField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(contactdetailsobj.ContactDetails_EmailIdField());
				contactdetailsobj.ContactDetails_EmailIdField().clear();
				contactdetailsobj.ContactDetails_EmailIdField().sendKeys(testdata.get("Updated Email Id"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }
    @And("^Remove values from required fields in contact details$")
    public void remove_values_from_required_fields_in_contact_details() throws Throwable {
    			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_PhoneNumberField(), 60, 2);
				seleniumactions.getJavascriptHelper().JSEClick(contactdetailsobj.ContactDetails_PhoneNumberField());
				for(int i=0;i<=10;i++)
				{
				contactdetailsobj.ContactDetails_PhoneNumberField().sendKeys(Keys.BACK_SPACE);
				}
			
    }

    @And("^Update alphabet character in numeric field and validate popup$")
    public void update_alphabet_character_in_numeric_field_and_validate_popup() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_PreferedTimeForContactField(),60,2);
    	contactdetailsobj.ContactDetails_PreferedTimeForContactField().click();
    	contactdetailsobj.ContactDetails_PreferedTimeForContactField().clear();
    	contactdetailsobj.ContactDetails_PreferedTimeForContactField().sendKeys(testdata.get("Alphabet in numeric field"));
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.InvalidTimeFormatWarningPopup(),60,2);
        Assert.assertEquals(contactdetailsobj.InvalidTimeFormatWarningPopup().isDisplayed(), true);
    }

    @And("^Update invalid email in email id field and validate popup$")
    public void update_invalid_email_in_email_id_field_and_validate_popup() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_EmailIdField(),60,2);
    	contactdetailsobj.ContactDetails_EmailIdField().click();
    	contactdetailsobj.ContactDetails_EmailIdField().clear();
    	contactdetailsobj.ContactDetails_EmailIdField().sendKeys(testdata.get("Invalid Email"));
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.ContactDetails_EmailIdField(),60,2);
        Assert.assertEquals(contactdetailsobj.ContactDetails_EmailIdField().isDisplayed(), true);
    }
    @And("^Validate that values in view list is non editable$")
    public void validate_that_values_in_view_list_is_non_editable() throws Throwable {
    	String xpath ="//ion-col[4]//div[2]/table[1]/tbody[1]/tr[1]/td[4]";
    	Thread.sleep(2000);
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
    	try {
    		driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified status field is not editable only displayable");
		}
    }

    @And("^Search with valid data$")
    public void search_with_valid_data() throws Throwable {
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoViewAndClick(contactdetailsobj.searchIconOfCollateralSubType());
				//contactdetailsobj.searchIconOfCollateralSubType().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.searchTextFieldOfCollateralSubType(),30,2);
    	Thread.sleep(2000);
    	contactdetailsobj.searchTextFieldOfCollateralSubType().sendKeys(testdata.get("Search with valid data"));
    	String xpath ="//span[contains(text(),'aaa')]";
        String productgroup = null;
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
        for (int i = 0; i < 20; i++) {
        	
        	productgroup = driver.findElement(By.xpath(xpath)).getText();
		}
    	System.out.println(productgroup);
    }

    @And("^Search with Invalid data$")
    public void search_with_invalid_data() throws Throwable {
    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    	
    	for (int i = 0; i <20; i++) {
			try {
				contactdetailsobj.searchIconOfCollateralSubType().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.searchTextFieldOfCollateralSubType(),30,2);
    	contactdetailsobj.searchTextFieldOfCollateralSubType().sendKeys(testdata.get("Search with invalid data"));
    	Thread.sleep(1000);
    	String xpath ="//span[contains(text(),'Showing 0 to 0 of 0 entries')]";
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
    	       Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
    	       
    	        //"Showing 0 to 0 of 0 entries"
    	        break;
    		} catch (Exception e) {
    			
    		}
		}
        
        driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    }

    @And("^Validate Export to PDF functionality$")
    public void validate_export_to_pdf_functionality() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			contactdetailsobj.exportIconOfCollateralSubType().click();
    			break;
    		} catch (Exception e) {
    			
    		}
		}
    	
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,contactdetailsobj.exportToPDFOfCollateralSubType(),60,3);
        contactdetailsobj.exportToPDFOfCollateralSubType().click();
        //seleniumactions.getBrowserHelper().SwitchToWindow(1);
        String UserDirectory = System.getProperty("user.dir");
        System.out.println(UserDirectory);
        String substring = UserDirectory.substring(0, 21)+"Downloads";
        substring.replaceAll("/", "//");
        System.out.println(substring);
        File file = new File("C:\\Users\\inindc00074");
        File[] totalfiles = file.listFiles();
        for (File fileName : totalfiles) {
        	if (fileName.getName().equalsIgnoreCase("SubProductMasterFile.pdf")) {
				System.out.println("Downloaded file present in system");
				break;
			}
			else {
				System.out.println("Downloaded file present does not exist in system");
			}
			
		}
        seleniumactions.getBrowserHelper().switchToParentWithChildClose();
    }

    @And("^Validate Export to Excel functionality$")
    public void validate_export_to_excel_functionality() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			contactdetailsobj.exportIconOfCollateralSubType().click();
    			break;
    		} catch (Exception e) {
    			
    		}
		}
    	for (int i = 0; i < 20; i++) {
    		try {
    			contactdetailsobj.exportToExcelOfCollateralSubType().click();
    			break;
    		} catch (Exception e) {
    			
    		}
		}
        
        seleniumactions.getBrowserHelper().switchToParentWithChildClose();
        System.out.println("Downloaded XLS file present in system");
    }
    @And("^Update test data for contact detatils test case one$")
    public void update_test_data_for_contact_detatils_test_case_one() throws Throwable {
    	testdata=exceldata.getTestdata("AT-CLCD-001_D1");
    }

    @And("^Update test data for contact detatils test case two$")
    public void update_test_data_for_contact_detatils_test_case_two() throws Throwable {
    	testdata=exceldata.getTestdata("AT-CLCD-002_D1");
    }

    @And("^Update test data for contact detatils test case three$")
    public void update_test_data_for_contact_detatils_test_case_three() throws Throwable {
    	testdata=exceldata.getTestdata("AT-CLCD-003_D1");
    }

    @And("^Update test data for contact detatils test case four$")
    public void update_test_data_for_contact_detatils_test_case_four() throws Throwable {
    	testdata=exceldata.getTestdata("AT-CLCD-004_D1");
    }

    @And("^Update test data for contact detatils test case five$")
    public void update_test_data_for_contact_detatils_test_case_five() throws Throwable {
    	testdata=exceldata.getTestdata("AT-CLCD-005_D1");
    }
}
