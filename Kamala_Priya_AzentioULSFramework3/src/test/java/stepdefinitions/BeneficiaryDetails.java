package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.BeneficiaryDetailsObj;
import pageobjects.KULS_CommonWebElements;
import pageobjects.Trans_CustomerEmploymentObject;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import testDataType.BeneficiaryDetailTestData;
import testDataType.CustomerEmploymentTestData;
import testDataType.KULS_Login_TestDataType;

public class BeneficiaryDetails extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
			JsonConfig jsonconfig = new JsonConfig();
			KULS_Application_Login login= new KULS_Application_Login(driver);
        KULS_Login_TestDataType testdatatype = jsonconfig.getKULSLoginCredentialsByName("Maker");
        BeneficiaryDetailsObj beneficiaryobj = new BeneficiaryDetailsObj(driver);
        BeneficiaryDetailTestData beneficiarydata = jsonconfig.getBeneficiaryDetailListByName("Maker");
    	WaitHelper waithelper = new WaitHelper(driver);
JavascriptHelper helper= new JavascriptHelper(driver);
Selenium_Actions action = new Selenium_Actions(driver);
ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);

FindFieldisMandatoryorNot mandateOrNot= new FindFieldisMandatoryorNot(driver);
KULS_CommonWebElements commonWebObj = new KULS_CommonWebElements(driver);
KULS_CommonWebElements ulsCommonWebElementObj = new KULS_CommonWebElements(driver);


ExcelData excelData = new ExcelData("C:\\Users\\inindc00073\\Downloads\\UlsTestDataDesign.xlsx","BenificiaryDetails","Data Set ID");
Map<String, String> testData;
	
	
	
	

	    @Then("^Click the inbox in in beneficiary details$")
	    public void click_the_inbox_in_in_beneficiary_details() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.InboxIcon(), 60, 2);
			beneficiaryobj.InboxIcon().click();
	    }

	    @And("^Click the search button in beneficiary detail$")
	    public void click_the_search_button_in_beneficiary_detail() throws Throwable {
	    	Thread.sleep(1000);
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.SearchButton(), 60, 2);
			beneficiaryobj.SearchButton().click();
	    }
	    @Then("^Enter as disbursement maker in the search bar in beneficiary detail$")
	    public void enter_as_disbursement_maker_in_the_search_bar_in_beneficiary_detail() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.SearchBar(), 60, 2);
			beneficiaryobj.SearchBar().click();
			beneficiaryobj.SearchBar().sendKeys(testData.get("SearchBar"));
	    }

	    @And("^Click the disbursement maker first action icon in beneficiary detail$")
	    public void click_the_disbursement_maker_first_action_icon_in_beneficiary_detail() throws Throwable {
	    	Thread.sleep(2000);
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.ActionIcon(), 60, 2);
			beneficiaryobj.ActionIcon().click();
	    }
	    @Then("^Click the beneficiary detail tab$")
	    public void click_the_beneficiary_detail_tab() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.BeneficiaryDetailTab(), 60, 2);
			beneficiaryobj.BeneficiaryDetailTab().click();
	    }
	    @And("^Click the add button in the beneficiary detail$")
	    public void click_the_add_button_in_the_beneficiary_detail() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.AddButton(), 60, 2);
			beneficiaryobj.AddButton().click();
			Thread.sleep(1000);
	    }
	 	 
	 	@Then("^To verify the field Application Id in beneficiary details$")
	    public void to_verify_the_field_application_id_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.facilityApplicationId(), 60, 2);
	    	beneficiaryobj.facilityApplicationId().click();
	    	beneficiaryobj.facilityApplicationId().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Facility Application Id");

	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("FacilityApplicationId")
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(beneficiaryobj.facilityApplicationId().getAttribute("aria-haspopup"),"listbox");

	 	}
	    @And("^To verify the field Beneficiary Name in beneficiary details$")
	    public void to_verify_the_field_beneficiary_name_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.BeneficiaryName(), 60, 2);
	    		    	beneficiaryobj.BeneficiaryName().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Beneficiary Name");
	    	beneficiaryobj.BeneficiaryName().click();
	    	beneficiaryobj.BeneficiaryName().sendKeys(testData.get("BeneficiaryName"));
			Assert.assertEquals(beneficiaryobj.BeneficiaryNameText().getAttribute("type"),"text");

	    }

	    @Then("^To verify the field Beneficiary Type in beneficiary details$")
	    public void to_verify_the_field_beneficiary_type_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.beneficiaryType(), 60, 2);
	    	beneficiaryobj.beneficiaryType().click();
	    	beneficiaryobj.beneficiaryType().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Beneficiary Type");

	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("BeneficiaryType")
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(beneficiaryobj.beneficiaryType().getAttribute("aria-haspopup"),"listbox");

	    }
	    @And("^To verify the field Beneficiary KYC in beneficiary details$")
	    public void to_verify_the_field_beneficiary_kyc_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.beneficiaryKYC(), 60, 2);
	        beneficiaryobj.beneficiaryKYC().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Beneficiary KYC");
         for (int i = 0; i < 100; i++) {
	
				try {
			    	beneficiaryobj.beneficiaryKYC().click();
			    	beneficiaryobj.beneficiaryKYC().sendKeys(testData.get("BeneficiaryKYC"));
                  break;
				} catch (Exception e) {
					// TODO: handle exception
				}
			
			Assert.assertEquals(beneficiaryobj.beneficiaryKYCText().getAttribute("type"),"text");

	    }}

	    @Then("^To verify the field Beneficiary address in beneficiary details$")
	    public void to_verify_the_field_beneficiary_address_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.beneficiaryAddress(), 60, 2);
	        beneficiaryobj.beneficiaryAddress().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Beneficiary Address");
	    	beneficiaryobj.beneficiaryAddress().click();
	    	beneficiaryobj.beneficiaryAddress().sendKeys(testData.get("BeneficiaryAddress"));;
			Assert.assertEquals(beneficiaryobj.beneficiaryAddressText().getAttribute("type"),"text");
	    }
	    @And("^To verify the field Account Type in beneficiary details$")
	    public void to_verify_the_field_account_type_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.accountType(), 60, 2);
	    	beneficiaryobj.accountType().click();
	    	beneficiaryobj.accountType().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Account Type");

	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("AccountType")
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(beneficiaryobj.accountType().getAttribute("aria-haspopup"),"listbox");

	    }
	    @Then("^To verify the field IBAN Account Number in beneficiary details$")
	    public void to_verify_the_field_iban_account_number_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.IBANorAccountNo(), 60, 2);
	        beneficiaryobj.IBANorAccountNo().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("IBAN/Account No.");
	    	beneficiaryobj.IBANorAccountNo().click();
	    	beneficiaryobj.IBANorAccountNo().sendKeys(testData.get("IBANAccountNo"));
			Assert.assertEquals(beneficiaryobj.IBANorAccountNoText().getAttribute("type"),"number");
	    }
	    
	    @And("^To verify the field MICR Type in beneficiary details$")
	    public void to_verify_the_field_micr_type_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.MICRType(), 60, 2);
	    	beneficiaryobj.MICRType().click();
	    	beneficiaryobj.MICRType().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("MICR Type");

	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("MICRType")
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(beneficiaryobj.MICRType().getAttribute("aria-haspopup"),"listbox");

	    }
	    @Then("^To verify the field Beneficiary MICR code in beneficiary details$")
	    public void to_verify_the_field_beneficiary_micr_code_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.beneficiaryMICRCode(), 60, 2);
	    	beneficiaryobj.beneficiaryMICRCode().click();
	    	beneficiaryobj.beneficiaryMICRCode().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Beneficiary MICR Code");

	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("BeneficiaryMICRCode")
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(beneficiaryobj.beneficiaryMICRCode().getAttribute("aria-haspopup"),"listbox");

	    }

	    @And("^To verify the field Bank code in beneficiary details$")
	    public void to_verify_the_field_bank_code_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.bankCode(), 60, 2);
	    	beneficiaryobj.bankCode().click();
	    	beneficiaryobj.bankCode().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Facility Application Id");

	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("BankCode")
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(beneficiaryobj.bankCode().getAttribute("aria-haspopup"),"listbox");

	    }

	    @Then("^To verify the field Branch Name in beneficiary details$")
	    public void to_verify_the_field_branch_name_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.branchName(), 60, 2);
	    	beneficiaryobj.branchName().click();
	    	beneficiaryobj.branchName().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Branch Name");

	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("BranchName")
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(beneficiaryobj.branchName().getAttribute("aria-haspopup"),"listbox");

	    }

	    @And("^To verify the field IFSC code in beneficiary details$")
	    public void to_verify_the_field_ifsc_code_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.IFSCCode(), 60, 2);
	        beneficiaryobj.IFSCCode().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("IFSC Code");
	    	beneficiaryobj.IFSCCode().click();
	    	beneficiaryobj.IFSCCode().sendKeys(testData.get("IFSCCode"));;
			Assert.assertEquals(beneficiaryobj.IFSCCodeText().getAttribute("type"),"text");
	    }
	    @Then("^To verify the field Payment Type in beneficiary details$")
	    public void to_verify_the_field_payment_type_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.paymentType(), 60, 2);
	    	beneficiaryobj.paymentType().click();
	    	beneficiaryobj.paymentType().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Payment Type");

	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("PaymentType")
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(beneficiaryobj.paymentType().getAttribute("aria-haspopup"),"listbox");

	    }
	    @And("^To verify the field Payment Mode in beneficiary details$")
	    public void to_verify_the_field_payment_mode_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.paymentMode(), 60, 2);
	    	Thread.sleep(2000);
	    	action.getClickAndActionsHelper().moveToElement(beneficiaryobj.paymentMode());
	    	beneficiaryobj.paymentMode().click();
	    	beneficiaryobj.paymentMode().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Payment Mode");
String xpath="//ion-label[contains(text(),'" + testData.get("PaymentMode")
+ "')]/following-sibling::ion-radio";
	    	for (int i = 0; i < 200; i++) {
				try {
			 
	    	driver.findElement(By.xpath(xpath)).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(beneficiaryobj.paymentMode().getAttribute("aria-haspopup"),"listbox");
			
	    }
	    @Then("^To verify the field Beneficiary email in beneficiary details$")
	    public void to_verify_the_field_beneficiary_email_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.beneficiaryEmail(), 60, 2);
	        beneficiaryobj.beneficiaryEmail().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Beneficiary Email");
	    	beneficiaryobj.beneficiaryEmail().click();
	    	beneficiaryobj.beneficiaryEmail().sendKeys(testData.get("BeneficiaryEmail"));;
			Assert.assertEquals(beneficiaryobj.beneficiaryEmailText().getAttribute("type"),"text");
	    }

	    @And("^To verify the field remark in beneficiary details$")
	    public void to_verify_the_field_remark_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.remarks(), 60, 2);
	        beneficiaryobj.remarks().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Remarks");
	    	beneficiaryobj.remarks().click();
	    	beneficiaryobj.remarks().sendKeys(testData.get("Remarks"));;
			//Assert.assertEquals(beneficiaryobj.remarksText().getAttribute("type"),"text");
	    }
	    @Then("^save the record in beneficiary details$")
	    public void save_the_record_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.SaveButton(), 60, 2);
	        beneficiaryobj.SaveButton().isDisplayed();
	        beneficiaryobj.SaveButton().click();
	        
	    }

	    @And("^Validate the save popup in beneficiary details$")
	    public void validate_the_save_popup_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.successMgs(), 60, 2);
	   	 Assert.assertEquals(beneficiaryobj.successMgs().isDisplayed(), true);

	    }
	    @And("^Verify the bank field in beneficiary detail$")
	    public void verify_the_bank_field_in_beneficiary_detail() throws Throwable {
			WebElement nameErrorMessage = driver
					.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]"));
			String expectedErrorText = "Required field";
			String actualErrorText = nameErrorMessage.getText();
			if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
				System.out.println(
						"The actual and expected result are same.The Popup validation message is" + actualErrorText);
			} else {
				System.out.println(
						"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
			}
			Assert.assertEquals("Required field", actualErrorText);

		}	    
	    @Then("^verify the impact when user enters only special characters value in any field in beneficiary details$")
	    public void verify_the_impact_when_user_enters_only_special_characters_value_in_any_field_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.beneficiaryAddress(), 60, 2);
	    	beneficiaryobj.beneficiaryAddress().click();
	    	beneficiaryobj.beneficiaryAddress().sendKeys(testData.get("Special Character"));
	    	WebElement errorPopUp = driver.findElement(By.xpath("//ion-badge[contains(text(),' Alphanumeric characters allowed')]"));
	    	String expectedErrorText = "Alphanumeric characters allowed";
	    	String actualErrorText = errorPopUp.getText();
	    	if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
	    		System.out.println("The system was not allow the record to save as we enter the invalid details.The Popup validation message is" + actualErrorText);
	    	} else {
	    		System.out.println("The actual and expected result are not same.The Popup validation message is" + actualErrorText);
	    	}
	    	Assert.assertEquals("Alphanumeric characters allowed", actualErrorText);
	    }     
	    @And("^verify the impact when user enter numeric value in character field in beneficiary detail$")
	    public void verify_the_impact_when_user_enter_numeric_value_in_character_field_in_beneficiary_detail() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.BeneficiaryName(), 60, 2);
	    	beneficiaryobj.BeneficiaryName().click();
	    	beneficiaryobj.BeneficiaryName().sendKeys(testData.get("Numeric Value"));
	    	WebElement errorPopUp = driver.findElement(By.xpath("//ion-badge[contains(text(),' Alphabets allowed')]"));
	    	String expectedErrorText = "Alphabets allowed";
	    	String actualErrorText = errorPopUp.getText();
	    	if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
	    		System.out.println("The system was not allow the record to save as we enter the invalid details.The Popup validation message is" + actualErrorText);
	    	} else {
	    		System.out.println("The actual and expected result are not same.The Popup validation message is" + actualErrorText);
	    	}
	    	Assert.assertEquals("Alphabets allowed", actualErrorText);
	    }
	    @Then("^verify the impact when user enter characters  value in numeric field in beneficiary detail$")
	    public void verify_the_impact_when_user_enter_characters_value_in_numeric_field_in_beneficiary_detail() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.IBANorAccountNo(), 60, 2);
	    	beneficiaryobj.IBANorAccountNo().click();
	    	beneficiaryobj.IBANorAccountNo().sendKeys(testData.get("Numeric Value"));
	    	beneficiaryobj.IBANorAccountNo().sendKeys(testData.get("CharacterValue"));
			String IBANorAccountNo = beneficiaryobj.IBANorAccountNoText()
					.getAttribute("ng-reflect-model");
			System.out.println(IBANorAccountNo);
			Assert.assertFalse(IBANorAccountNo.contains("abcd"));
	    }

	    @Then("^choose the data set id for creation of beneficiary details$")
	    public void choose_the_data_set_id_for_creation_of_beneficiary_details() throws Throwable {
testData=excelData.getTestdata("AT-BD-001-D1");
	    }

	    @Then("^Choose the data set for invalide validation in beneficaiary details$")
	    public void choose_the_data_set_for_invalide_validation_in_beneficaiary_details() throws Throwable {
	    	testData=excelData.getTestdata("AT-BD-002-D2");

	    }
	    @And("^Navigate to Mail box of Application details and search the DISBMKR value$")
	    public void navigate_to_mail_box_of_application_details_and_search_the_disbckr_value() throws Throwable {
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.ApplicationDetails_Inbox(), 30, 2);
			beneficiaryobj.ApplicationDetails_Inbox().click();
	    	for (int i = 0; i <20; i++) {
	    		try {
	    			beneficiaryobj.ApplicationDetailsInboxView_Search().click();
	    			break;
	    		} catch (Exception e) {
	    			
	    		}
	    	}
	    	
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.ApplicationDetailsInboxView_SearchText(),60,2);
	        beneficiaryobj.ApplicationDetailsInboxView_SearchText().click();
	        beneficiaryobj.ApplicationDetailsInboxView_SearchText().sendKeys(testData.get("SearchBar"));
	    }

	    @And("^Click on action icon of first record of application details_DISBMKR$")
	    public void click_on_action_icon_of_first_record_of_application_detailsdisbmkr() throws Throwable {
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.ActionButtonOfFirstRecord_DISBMKR(), 30, 2);
	    	beneficiaryobj.ActionButtonOfFirstRecord_DISBMKR().click();      
	    }

	    @And("^Navigate to Beneficiary Details section$")
	    public void navigate_to_beneficiary_details_section() throws Throwable {
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.BeneficiaryDetailsSection(), 60, 2);
	    	for (int i = 0; i <20; i++) {
				try {
					action.getJavascriptHelper().JSEClick(beneficiaryobj.BeneficiaryDetailsSection());
					break;
				} catch (ElementNotInteractableException e) {
					
				}
			}
	    }

	    @And("^Remove values from required fields in Beneficiary Details$")
	    public void remove_values_from_required_fields_in_beneficiary_details() throws Throwable {
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.Beneficiaryname(), 60, 2);
	    	action.getJavascriptHelper().JSEClick(beneficiaryobj.Beneficiaryname());
			for(int i=0;i<=15;i++)
			{
				beneficiaryobj.Beneficiaryname().sendKeys(Keys.BACK_SPACE);
			}
	    }

	    @And("^Click on Save button and validate field is required popup in Beneficiary Details$")
	    public void click_on_save_button_and_validate_field_is_required_popup_in_beneficiary_details() throws Throwable {
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.ContactDetails_SaveIcon(),60,2);
	    	beneficiaryobj.ContactDetails_SaveIcon().click();
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.requiredFieldWarningPopup(),60,2);
	        Assert.assertEquals(beneficiaryobj.requiredFieldWarningPopup().isDisplayed(), true);
	    }

	    @And("^Update with invalid data and validate error popup in Beneficiary details$")
	    public void update_with_invalid_data_and_validate_error_popup_in_beneficiary_details() throws Throwable {
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.BeneficiaryKYC(),60,2);
	    	beneficiaryobj.BeneficiaryKYC().click();
	    	beneficiaryobj.BeneficiaryKYC().clear();
	    	beneficiaryobj.BeneficiaryKYC().sendKeys(testData.get("InvalidData"));
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.alphaNumericCharactersAllowedWarningPopup(),60,2);
	        Assert.assertEquals(beneficiaryobj.alphaNumericCharactersAllowedWarningPopup().isDisplayed(), true);
	    }
	    @And("^Click on Pencil Icon of existing Beneficiary details record$")
	    public void click_on_pencil_icon_of_existing_beneficiary_details_record() throws Throwable {
	    	Thread.sleep(2000);
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.BeneficieryDetails_PencilIconOfFirstRecord(), 60, 2);
	    	beneficiaryobj.BeneficieryDetails_PencilIconOfFirstRecord().click();
	    	Thread.sleep(2000);
	    }
	    @And("^Click on Back button of Beneficiary details$")
	    public void click_on_back_button_of_beneficiary_details() throws Throwable {
	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.BackIcon(),60,2);
	    	beneficiaryobj.BackIcon().click();
	    }


	    @Then("^choose the data set id to update beneficiary details record with negative validation$")
	    public void choose_the_data_set_id_to_update_beneficiary_details_record_with_negative_validation() throws Throwable {
	    	testData=excelData.getTestdata("AT-BD-005-D1");

	    }
		@And("^search the disbursement maker record$")
		public void search_the_disbursement_maker_record() throws Throwable {
//	        waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElementObj.ulsNotificationSerachButton(), 10, 1);
//	        ulsCommonWebElementObj.ulsNotificationSerachButton().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonWebElementObj.ulsNotificationSearchTextBox(),
					10, 1);
			clicksAndActionsHelper.moveToElement(ulsCommonWebElementObj.ulsNotificationSearchTextBox());
			clicksAndActionsHelper.clickOnElement(ulsCommonWebElementObj.ulsNotificationSearchTextBox());
			ulsCommonWebElementObj.ulsNotificationSearchTextBox().sendKeys("DISBMKR");
		}

		@And("^select the first record of disbursment maker stage$")
		public void select_the_first_record_of_disbursment_maker_stage() throws Throwable {

			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsDisbursementmakerFirstRecord(), 10, 1);
			beneficiaryobj.beneficiaryDetailsDisbursementmakerFirstRecord().click();
		}

		@And("^go to beneficiary details tab$")
		public void go_to_beneficiary_details_tab() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.ulsBeneficiaryDetailsSegmantButton(), 10, 1);
			beneficiaryobj.ulsBeneficiaryDetailsSegmantButton().click();
		}

		@And("^click on add button on beneficiary details screen$")
		public void click_on_add_button_on_beneficiary_details_screen() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.beneficiaryDetailsAddButton(),
					10, 1);
			for (int i = 0; i <= 10; i++) {
				try {
					beneficiaryobj.beneficiaryDetailsAddButton().click();
					break;
				} catch (Exception e) {
					if (i == 10) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@Then("^verify user can able to update the facility application ID field$")
		public void verify_user_can_able_to_update_the_facility_application_id_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsFacilityApplicationIDDropDown(), 10, 1);
			beneficiaryobj.beneficiaryDetailsFacilityApplicationIDDropDown().click();
			String xpath = "//ion-label[text()=' " + testData.get("UpdatedFacilityApplicationID")
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 50; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertTrue(beneficiaryobj.beneficiaryDetailsFacilityApplicationIDDropDown()
					.getAttribute("aria-label").contains(testData.get("UpdatedFacilityApplicationID")));
		}

		@Then("^verify user can able to update beneficiary name field$")
		public void verify_user_can_able_to_update_beneficiary_name_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsBeneficiaryNameInputBox(), 10, 1);
			beneficiaryobj.beneficiaryDetailsBeneficiaryNameInputBox().click();
			beneficiaryobj.beneficiaryDetailsBeneficiaryNameInputBox().clear();
			beneficiaryobj.beneficiaryDetailsBeneficiaryNameInputBox()
					.sendKeys(testData.get("UpdatedBeneficiaryName"));
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsBeneficiaryNameDataHolder(), 10, 1);
			Assert.assertEquals(
					beneficiaryobj.beneficiaryDetailsBeneficiaryNameDataHolder().getAttribute("ng-reflect-model"),
					testData.get("UpdatedBeneficiaryName"));
		}

		@Then("^verify user can able to update beneficiary type field$")
		public void verify_user_can_able_to_update_beneficiary_type_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsBeneficiaryTypeDropDown(), 10, 1);
			beneficiaryobj.beneficiaryDetailsBeneficiaryTypeDropDown().click();
			String xpath = "//ion-label[text()=' " + testData.get("UpdatedBeneficiaryType")
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 50; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertTrue(beneficiaryobj.beneficiaryDetailsBeneficiaryTypeDropDown().getAttribute("aria-label")
					.contains(testData.get("UpdatedBeneficiaryType")));
		}

		@Then("^verify user can able to update beneficiary KYC field$")
		public void verify_user_can_able_to_update_beneficiary_kyc_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsBeneficiaryKYCInputBox(), 10, 1);
			beneficiaryobj.beneficiaryDetailsBeneficiaryKYCInputBox().click();
			beneficiaryobj.beneficiaryDetailsBeneficiaryKYCInputBox().clear();
			beneficiaryobj.beneficiaryDetailsBeneficiaryKYCInputBox()
					.sendKeys(testData.get("UpdatedBeneficiaryKYC"));
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsBeneficiaryKYCdataHolder(), 10, 1);
			Assert.assertEquals(
					beneficiaryobj.beneficiaryDetailsBeneficiaryKYCdataHolder().getAttribute("ng-reflect-model"),
					testData.get("UpdatedBeneficiaryKYC"));
		}

		@Then("^verify user can able to update the beneficiary address field$")
		public void verify_user_can_able_to_update_the_beneficiary_address_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsBeneficiaryAddressInputBox(), 10, 1);
			beneficiaryobj.beneficiaryDetailsBeneficiaryAddressInputBox().click();
			beneficiaryobj.beneficiaryDetailsBeneficiaryAddressInputBox().clear();
			beneficiaryobj.beneficiaryDetailsBeneficiaryAddressInputBox()
					.sendKeys(testData.get("UpdatedBeneficiaryAddress"));
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsBeneficiaryAddressDataHolder(), 10, 1);
			Assert.assertEquals(
					beneficiaryobj.beneficiaryDetailsBeneficiaryAddressDataHolder().getAttribute("ng-reflect-model"),
					testData.get("UpdatedBeneficiaryAddress"));
		}

		@Then("^verify user can able to update the account type field$")
		public void verify_user_can_able_to_update_the_account_type_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsAccountTypeDropDown(), 10, 1);
			beneficiaryobj.beneficiaryDetailsAccountTypeDropDown().click();
			String xpath = "//ion-label[text()=' " + testData.get("UpdatedAccountType")
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 50; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertTrue(beneficiaryobj.beneficiaryDetailsAccountTypeDropDown().getAttribute("aria-label")
					.contains(testData.get("UpdatedAccountType")));
		}

		@Then("^verify user can able to update the IBAN account no field$")
		public void verify_user_can_able_to_update_the_iban_account_no_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsIBANAccountNoInputBox(), 10, 1);
			beneficiaryobj.beneficiaryDetailsIBANAccountNoInputBox().click();
			beneficiaryobj.beneficiaryDetailsIBANAccountNoInputBox().clear();
			beneficiaryobj.beneficiaryDetailsIBANAccountNoInputBox()
					.sendKeys(testData.get("UpdatedIBANAccountNumber"));
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsIBANAccountNoDataHolder(), 10, 1);
			Assert.assertEquals(
					beneficiaryobj.beneficiaryDetailsIBANAccountNoDataHolder().getAttribute("ng-reflect-model"),
					testData.get("UpdatedIBANAccountNumber"));
		}

		@Then("^verify user can able to update the MICR Type field$")
		public void verify_user_can_able_to_update_the_micr_type_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsMICRTypeDropDown(), 10, 1);
			beneficiaryobj.beneficiaryDetailsMICRTypeDropDown().click();
			String xpath = "//ion-label[text()=' " + testData.get("UpdatedMICRType")
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 50; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertTrue(beneficiaryobj.beneficiaryDetailsMICRTypeDropDown().getAttribute("aria-label")
					.contains(testData.get("UpdatedMICRType")));
		}

		@Then("^verify user can able to update the beneficiary MICR Code field$")
		public void verify_user_can_able_to_update_the_beneficiary_micr_code_field() throws Throwable {
			if (testData.get("UpdatedMICRType").equals("NON-MICR")) {
				System.out.println("Non MICr No need to update the Micr code");
			} else

			{
				waithelper.waitForElementToVisibleWithFluentWait(driver,
						beneficiaryobj.beneficiaryDetailsBeneficiaryMICRCodeDropDown(), 10, 1);
				beneficiaryobj.beneficiaryDetailsBeneficiaryMICRCodeDropDown().click();
				String xpath = "//ion-label[text()=' " + testData.get("UpdatedBeneficiaryMICRCode")
						+ " ']/parent::ion-item/ion-radio";
				for (int i = 0; i <= 50; i++) {
					try {
						helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
						clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
						clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
						break;
					} catch (Exception e) {
						if (i == 50) {
							Assert.fail(e.getMessage());
						}
					}
				}
				Assert.assertTrue(beneficiaryobj.beneficiaryDetailsBeneficiaryMICRCodeDropDown()
						.getAttribute("aria-label").contains(testData.get("UpdatedBeneficiaryMICRCode")));
			}
		}

		@Then("^verify user can able to update the Bank code field$")
		public void verify_user_can_able_to_update_the_bank_code_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsBankCodeDropDown(), 10, 1);
			beneficiaryobj.beneficiaryDetailsBankCodeDropDown().click();
			String xpath = "//ion-label[text()=' " + testData.get("UpdatedBankCode")
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 50; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertTrue(beneficiaryobj.beneficiaryDetailsBankCodeDropDown().getAttribute("aria-label")
					.contains(testData.get("UpdatedBankCode")));
		}

		@Then("^verify user can able to update the branch name field$")
		public void verify_user_can_able_to_update_the_branch_name_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsBranchNameDropDown(), 10, 1);
			beneficiaryobj.beneficiaryDetailsBranchNameDropDown().click();
			String xpath = "//ion-label[text()=' " + testData.get("UpdatedBranchName")
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 50; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertTrue(beneficiaryobj.beneficiaryDetailsBranchNameDropDown().getAttribute("aria-label")
					.contains(testData.get("UpdatedBranchName")));
		}

		@Then("^verify user can able to update the IFSC Code$")
		public void verify_user_can_able_to_update_the_ifsc_code() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsIFSCCodeInputBox(), 10, 1);
			beneficiaryobj.beneficiaryDetailsIFSCCodeInputBox().click();
			beneficiaryobj.beneficiaryDetailsIFSCCodeInputBox().clear();
			beneficiaryobj.beneficiaryDetailsIFSCCodeInputBox().sendKeys(testData.get("UpdatedIFSCCode"));
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsIFSCCodeDataHolder(), 10, 1);
			Assert.assertEquals(
					beneficiaryobj.beneficiaryDetailsIFSCCodeDataHolder().getAttribute("ng-reflect-model"),
					testData.get("UpdatedIFSCCode"));
		}

		@Then("^verify user can able to update the payment type field$")
		public void verify_user_can_able_to_update_the_payment_type_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsPaymentTypeDropDown(), 10, 1);
			beneficiaryobj.beneficiaryDetailsPaymentTypeDropDown().click();
			String xpath = "//ion-label[text()=' " + testData.get("UpdatedPaymentType")
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 50; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertTrue(beneficiaryobj.beneficiaryDetailsPaymentTypeDropDown().getAttribute("aria-label")
					.contains(testData.get("UpdatedPaymentType")));
		}

		@Then("^verify user can able to update the payment mode field$")
		public void verify_user_can_able_to_update_the_payment_mode_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsPaymentModeDropDown(), 10, 1);
			beneficiaryobj.beneficiaryDetailsPaymentModeDropDown().click();
			String xpath = "//ion-label[text()=' " + testData.get("UpdatedPaymentMode")
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 50; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertTrue(beneficiaryobj.beneficiaryDetailsPaymentModeDropDown().getAttribute("aria-label")
					.contains(testData.get("UpdatedPaymentMode")));
		}

		@Then("^verify user can able to update the beneficiary email field$")
		public void verify_user_can_able_to_update_the_beneficiary_email_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetails_BeneficiaryEmailInputBox(), 10, 1);
			beneficiaryobj.beneficiaryDetails_BeneficiaryEmailInputBox().click();
			beneficiaryobj.beneficiaryDetails_BeneficiaryEmailInputBox().clear();
			beneficiaryobj.beneficiaryDetails_BeneficiaryEmailInputBox()
					.sendKeys(testData.get("UpdatedBeneficiaryEmail"));
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					beneficiaryobj.beneficiaryDetailsBeneficiaryEmailDataHolder(), 10, 1);
			Assert.assertEquals(
					beneficiaryobj.beneficiaryDetailsBeneficiaryEmailDataHolder().getAttribute("ng-reflect-model"),
					testData.get("UpdatedBeneficiaryEmail"));
		}

		@Then("^verify user can able to update the remarks field$")
		public void verify_user_can_able_to_update_the_remarks_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.beneficiaryDetailsRemarks(), 10,
					1);
			beneficiaryobj.beneficiaryDetailsRemarks().click();
			beneficiaryobj.beneficiaryDetailsRemarks().clear();
			beneficiaryobj.beneficiaryDetailsRemarks().sendKeys(testData.get("UpdatedRemarks"));
			Assert.assertEquals(beneficiaryobj.beneficiaryDetailsRemarks().getText(),
					testData.get("UpdatedRemarks"));
		}

		@And("^click on save button to save the updated beneficiary details record$")
		public void click_on_save_button_to_save_the_updated_beneficiary_details_record() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.beneficiaryDetailsSaveButton(),
					10, 1);
			beneficiaryobj.beneficiaryDetailsSaveButton().click();
		}
		 @Then("^choose the data set id to update the beneficiary detail record before save$")
		    public void choose_the_data_set_id_to_update_the_beneficiary_detail_record_before_save() throws Throwable {
			 testData=excelData.getTestdata("AT-BD-003-D1");
		    }

@Then("^User verify the functionality of active and deactive toggle$")
public void user_verify_the_functionality_of_active_and_deactive_toggle() throws Throwable {
	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.statusToggle(),30, 2);
	beneficiaryobj.statusToggle().click();
	beneficiaryobj.statusToggle().click();
	
}
@Then("^User verify the Label on button if the status of record is Active$")
public void user_verify_the_label_on_button_if_the_status_of_record_is_active() throws Throwable {
	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,beneficiaryobj.statusToggle(),30, 2);
	String status = beneficiaryobj.statusToggle().getAttribute("aria-checked");
	if (status.equalsIgnoreCase("true")) {
		System.out.println("viewed record is active");
	}
	else {
		System.out.println("viewed record is inactive");
	}
}
}
