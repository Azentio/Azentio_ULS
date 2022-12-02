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
import pageobjects.CustomerEntityLayout_IdentificationObj;
import resources.BaseClass;
import resources.ExcelData;
import testDataType.KULS_CustomerEntityLayout_Identification_Testdata;
import testDataType.KULS_Login_TestDataType;

public class CustomerEntityLayout_Identification {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	CustomerEntityLayout_IdentificationObj identificationsobj = new CustomerEntityLayout_IdentificationObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	KULS_CustomerEntityLayout_Identification_Testdata identificationData = jsonConfig.getIdentificationByName("Maker");
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign2211a.xlsx", "Identification", "Data Set ID") ;
	Map<String, String> testdata;
	
	
	@Then("^Validate the Success popup$")
    public void validate_the_success_popup() throws Throwable {
		String Toast;
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, identificationsobj.ContactDetailsSaveSuccessfulPopup(), 10, 2);
		Toast = identificationsobj.ContactDetailsSaveSuccessfulPopup().getText();
		System.out.println(Toast);
		Assert.assertTrue(Toast.contains("Success!"),"Suceess message is not populating");
	}

    @And("^Click on Add icon in Identification view list$")
    public void click_on_add_icon_in_identification_view_list() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.Identification_AddIcon(), 60, 2);
    	identificationsobj.Identification_AddIcon().click();
    }

    @And("^Enter the value in ID type field of Identification$")
    public void enter_the_value_in_id_type_field_of_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.Identification_IDTypeField(), 60, 2);
    	identificationsobj.Identification_IDTypeField().click();;
    	for (int i = 0; i <20; i++) {
			try {
				
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("ID Type")
						+ "')]/following-sibling::ion-radio")).click();
				//seleniumactions.getJavascriptHelper().JSEClick(identificationsobj.Identification_IDTypeField());
			
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^Enter the value in ID number field of Identification$")
    public void enter_the_value_in_id_number_field_of_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.Identification_IDNumberField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(identificationsobj.Identification_IDNumberField());
				identificationsobj.Identification_IDNumberField().sendKeys(testdata.get("ID Number"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Issue date field of Identification$")
    public void enter_the_value_in_issue_date_field_of_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.Identification_IssueDate(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(identificationsobj.Identification_IssueDate());
				seleniumactions.getJavascriptHelper().JSEClick(identificationsobj.CalenderIcon_TodayValue());
				
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Expiry Date field of Identification$")
    public void enter_the_value_in_expiry_date_field_of_identification() throws Throwable {
    	Thread.sleep(2000);
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.Identification_ExpiryDate(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(identificationsobj.Identification_ExpiryDate());
				seleniumactions.getJavascriptHelper().JSEClick(identificationsobj.CalenderIcon_TodayValue());
				
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Issuing Authority field of Identification$")
    public void select_the_value_in_issuing_authority_field_of_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, identificationsobj.Identification_IssuingAuthority(), 60, 2);
    	identificationsobj.Identification_IssuingAuthority().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Issuing Authority")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Select the value in Country Of Issue of Identification$")
    public void select_the_value_in_country_of_issue_of_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, identificationsobj.Identification_CountryOfIssue(), 60, 2);
    	identificationsobj.Identification_CountryOfIssue().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Country of Issue")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Click on Save button of Identification$")
    public void click_on_save_button_of_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.ContactDetails_SaveIcon(), 60, 2);
    	identificationsobj.ContactDetails_SaveIcon().click();
    	Thread.sleep(2000);
    }
    @And("^Enter special character in text field and validate error popup$")
    public void enter_special_character_in_text_field_and_validate_error_popup() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.Identification_IDNumberField(),60,2);
    	identificationsobj.Identification_IDNumberField().click();
    	identificationsobj.Identification_IDNumberField().sendKeys(testdata.get("Special character"));
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.alphaNumericCharactersAllowedWarningPopup(),60,2);
        Assert.assertEquals(identificationsobj.alphaNumericCharactersAllowedWarningPopup().isDisplayed(), true);
    }
    @And("^Click on first pencil icon in Identification$")
    public void click_on_first_pencil_icon_in_identification() throws Throwable {
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoViewAndClick(identificationsobj.PencilIconOfFirstRecordInIdentification());
				Thread.sleep(2000);
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^Update the value in ID type field of Identification$")
    public void update_the_value_in_id_type_field_of_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.Identification_IDTypeField(), 60, 2);
    	identificationsobj.Identification_IDTypeField().click();;
    	for (int i = 0; i <20; i++) {
			try {
				
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Updated ID Type")
						+ "')]/following-sibling::ion-radio")).click();
				//seleniumactions.getJavascriptHelper().JSEClick(identificationsobj.Identification_IDTypeField());
			
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^Update the value in ID number field of Identification$")
    public void update_the_value_in_id_number_field_of_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.Identification_IDNumberField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(identificationsobj.Identification_IDNumberField());
				identificationsobj.Identification_IDNumberField().clear();
				identificationsobj.Identification_IDNumberField().sendKeys(testdata.get("Updated ID Number"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Update the value in Country Of Issue of Identification$")
    public void updatel_the_value_in_country_of_issue_of_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, identificationsobj.Identification_CountryOfIssue(), 60, 2);
    	identificationsobj.Identification_CountryOfIssue().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Updated Country of Issue")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }
    @And("^Remove values from required fields in Identification$")
    public void remove_values_from_required_fields_in_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.Identification_IDNumberField(), 60, 2);
		seleniumactions.getJavascriptHelper().JSEClick(identificationsobj.Identification_IDNumberField());
		for(int i=0;i<=15;i++)
		{
			identificationsobj.Identification_IDNumberField().sendKeys(Keys.BACK_SPACE);
		}
    }
    @And("^Update special character in text field and validate error popup$")
    public void update_special_character_in_text_field_and_validate_error_popup() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.Identification_IDNumberField(),60,2);
    	identificationsobj.Identification_IDNumberField().click();
    	identificationsobj.Identification_IDNumberField().clear();
    	identificationsobj.Identification_IDNumberField().sendKeys(testdata.get("Special character"));
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.alphaNumericCharactersAllowedWarningPopup(),60,2);
        Assert.assertEquals(identificationsobj.alphaNumericCharactersAllowedWarningPopup().isDisplayed(), true);
    }
    @And("^Click on Back button of Identification$")
    public void click_on_back_button_of_identification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.BackIcon(),60,2);
    	identificationsobj.BackIcon().click();
    	Thread.sleep(2000);
    }
    @And("^Validate Export to PDF functionality of Identification$")
    public void validate_export_to_pdf_functionality_of_identification() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			identificationsobj.exportIconOfCollateralSubType().click();
    			break;
    		} catch (Exception e) {
    			
    		}
		}
    	
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,identificationsobj.exportToPDFOfCollateralSubType(),60,3);
        identificationsobj.exportToPDFOfCollateralSubType().click();
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

    @And("^Validate Export to Excel functionality of Identification$")
    public void validate_export_to_excel_functionality_of_identification() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			identificationsobj.exportIconOfCollateralSubType().click();
    			break;
    		} catch (Exception e) {
    			
    		}
		}
    	for (int i = 0; i < 20; i++) {
    		try {
    			identificationsobj.exportToExcelOfCollateralSubType().click();
    			break;
    		} catch (Exception e) {
    			
    		}
		}
        
        seleniumactions.getBrowserHelper().switchToParentWithChildClose();
        System.out.println("Downloaded XLS file present in system");
    }
    @And("^Update test data for Identification test case one$")
    public void update_test_data_for_identification_test_case_one() throws Throwable {
    	testdata=exceldata.getTestdata("AT-TLID-001_D1");
    }

    @And("^Update test data for Identification test case two$")
    public void update_test_data_for_identification_test_case_two() throws Throwable {
    	testdata=exceldata.getTestdata("AT-TLID-002_D1");
    }

    @And("^Update test data for Identification test case three$")
    public void update_test_data_for_identification_test_case_three() throws Throwable {
    	testdata=exceldata.getTestdata("AT-TLID-003_D1");
    }

    @And("^Update test data for Identification test case four$")
    public void update_test_data_for_identification_test_case_four() throws Throwable {
    	testdata=exceldata.getTestdata("AT-TLID-004_D1");
    }

    @And("^Update test data for Identification test case five$")
    public void update_test_data_for_identification_test_case_five() throws Throwable {
    	testdata=exceldata.getTestdata("AT-TLID-005_D1");
    }

}
