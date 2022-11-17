package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.BeneficiaryDetailsObj;
import pageobjects.Trans_CustomerEmploymentObject;
import resources.BaseClass;
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
FindFieldisMandatoryorNot mandateOrNot= new FindFieldisMandatoryorNot(driver);

	
	
	
	

	    @Then("^Click the inbox in in beneficiary details$")
	    public void click_the_inbox_in_in_beneficiary_details() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.InboxIcon(), 60, 2);
			beneficiaryobj.InboxIcon().click();
	    }

	    @And("^Click the search button in beneficiary detail$")
	    public void click_the_search_button_in_beneficiary_detail() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.SearchButton(), 60, 2);
			beneficiaryobj.SearchButton().click();
	    }
	    @Then("^Enter as disbursement maker in the search bar in beneficiary detail$")
	    public void enter_as_disbursement_maker_in_the_search_bar_in_beneficiary_detail() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.SearchBar(), 60, 2);
			beneficiaryobj.SearchBar().click();
			beneficiaryobj.SearchBar().sendKeys("DISBMKR");
	    }

	    @And("^Click the disbursement maker first action icon in beneficiary detail$")
	    public void click_the_disbursement_maker_first_action_icon_in_beneficiary_detail() throws Throwable {
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
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + beneficiarydata.FacilityApplicationId
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
	    	beneficiaryobj.BeneficiaryName().sendKeys(beneficiarydata.BeneficiaryName);
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
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + beneficiarydata.BeneficiaryType
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
			    	beneficiaryobj.beneficiaryKYC().sendKeys(beneficiarydata.BeneficiaryKYC);
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
	    	beneficiaryobj.beneficiaryAddress().sendKeys(beneficiarydata.BeneficiaryKYC);;
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
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + beneficiarydata.AccountType
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
	    	beneficiaryobj.IBANorAccountNo().sendKeys(beneficiarydata.IBANAccountNo);
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
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + beneficiarydata.MICRType
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
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + beneficiarydata.BeneficiaryMICRCode
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
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + beneficiarydata.BankCode
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
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + beneficiarydata.BranchName
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
	    	beneficiaryobj.IFSCCode().sendKeys(beneficiarydata.IFSCCode);;
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
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + beneficiarydata.PaymentType
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
	    	beneficiaryobj.paymentMode().click();
	    	beneficiaryobj.paymentMode().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Payment Mode");

	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + beneficiarydata.PaymentMode
					+ "')]/following-sibling::ion-radio")).click();
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
	    	beneficiaryobj.beneficiaryEmail().sendKeys(beneficiarydata.BeneficiaryEmail);;
			Assert.assertEquals(beneficiaryobj.beneficiaryEmailText().getAttribute("type"),"text");
	    }

	    @And("^To verify the field remark in beneficiary details$")
	    public void to_verify_the_field_remark_in_beneficiary_details() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, beneficiaryobj.remarks(), 60, 2);
	        beneficiaryobj.remarks().isDisplayed();
	    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Remarks");
	    	beneficiaryobj.remarks().click();
	    	beneficiaryobj.remarks().sendKeys(beneficiarydata.BeneficiaryEmail);;
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
	    	beneficiaryobj.beneficiaryAddress().sendKeys("*%%*");
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
	    	beneficiaryobj.BeneficiaryName().sendKeys("1234");
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
	    	beneficiaryobj.IBANorAccountNo().sendKeys("1234");
	    	beneficiaryobj.IBANorAccountNo().sendKeys("abcd");
			String IBANorAccountNo = beneficiaryobj.IBANorAccountNoText()
					.getAttribute("ng-reflect-model");
			System.out.println(IBANorAccountNo);
			Assert.assertFalse(IBANorAccountNo.contains("abcd"));
	    }
}
