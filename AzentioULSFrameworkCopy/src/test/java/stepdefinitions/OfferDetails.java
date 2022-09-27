package stepdefinitions;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CustomerDocumentDetailsObj;
import pageobjects.KULS_LoginObj;
import pageobjects.OfferDetailsObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.CustomerDocumentDetailsTestDataType;
import testDataType.KULS_Login_TestDataType;
import testDataType.OfferDetailsTestDataType;

public class OfferDetails {

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
	BrowserHelper browserHelper = new BrowserHelper(driver);
	OfferDetailsObj offerDetailsObj = new OfferDetailsObj(driver);
	OfferDetailsTestDataType offerDetailsTestDataType = jsonConfig.getOfferDetailsByName("Maker");
	SoftAssert softAssert = new SoftAssert();
	
	@Then("^user should click on the menu toggle in the login page$")
    public void user_should_click_on_the_menu_toggle_in_the_login_page() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_Maker_MenuToggle());
		offerDetailsObj.offerDetails_Maker_MenuToggle().click();
    }

    @Then("^click on inbox to search for the Offer Details record$")
    public void click_on_inbox_to_search_for_the_Offer_Details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_Inbox());
    	offerDetailsObj.offerDetails_Inbox().click();
    }

    @Then("^click on search button to search the record of Offer Details in inbox$")
    public void click_on_search_button_to_search_the_record_of_Offer_Details_in_inbox() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_SearchInbox());
    	offerDetailsObj.offerDetails_SearchInbox().click();
    }

    @Then("^enter the reference id of the Offer Details record$")
    public void enter_the_reference_id_of_the_Offer_Details_record() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_SearchInboxInputField());
    	offerDetailsObj.offerDetails_SearchInboxInputField().sendKeys(offerDetailsTestDataType.ReferenceID);
	
    }

    @Then("^click on the entitle button of the Offer Details record of that reference id$")
    public void click_on_the_entitle_button_of_the_Offer_Details_record_of_that_reference_id() throws Throwable {
    	String beforexpath= "//span[contains(text(),'";
		String afterxpath= "')]/../../td/button";
		Thread.sleep(500);
		while(true) {
			try {
				driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
    }
    
    @Then("^click on the edit button of the record under facility info$")
    public void click_on_the_edit_button_of_the_record_under_facility_info() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_FacilityInfoTitle());
    	javaScriptHelper.scrollIntoView(offerDetailsObj.offerDetails_FacilityInfoTitle());
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_OfferDetailFirstRecordEdit());
    	offerDetailsObj.offerDetails_OfferDetailFirstRecordEdit().click();
    }

    @Then("^verify the Eligibility Details section fields are available$")
    public void verify_the_eligibility_details_section_fields_are_available() throws Throwable {
    	javaScriptHelper.scrollIntoView(offerDetailsObj.offerDetails_EligibilityDetails());
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_EligibilityDetails());
    	boolean status = offerDetailsObj.offerDetails_EligibilityType().isDisplayed();
    	Assert.assertTrue(status);
    	boolean status1 = offerDetailsObj.offerDetails_EligibilityAmount().isDisplayed();
    	Assert.assertTrue(status1);
    	boolean status2 = offerDetailsObj.offerDetails_EligibilityPercentage().isDisplayed();
    	Assert.assertTrue(status2);
    	boolean status3 = offerDetailsObj.offerDetails_Currency().isDisplayed();
    	Assert.assertTrue(status3);
    	boolean status4 = offerDetailsObj.offerDetails_ActualPercentage().isDisplayed();
    	Assert.assertTrue(status4);
    	boolean status5 = offerDetailsObj.offerDetails_DeviationLevel().isDisplayed();
    	Assert.assertTrue(status5);
    }

    @And("^verify all the fields under section eligibility details should have lookup values$")
    public void verify_all_the_fields_under_section_eligibility_details_should_have_lookup_values() throws Throwable {
    	offerDetailsObj.offerDetails_EligibilityTypeValue().isDisplayed();
    	boolean status = offerDetailsObj.offerDetails_EligibilityTypeValue().isEnabled();
    	Assert.assertTrue(status);
    	boolean status1 = offerDetailsObj.offerDetails_EligibilityAmount().isEnabled();
    	Assert.assertTrue(status1);
    	boolean status2 = offerDetailsObj.offerDetails_EligibilityPercentageValue().isEnabled();
    	Assert.assertTrue(status2);
    	boolean status3 = offerDetailsObj.offerDetails_CurrencyValue().isEnabled();
    	Assert.assertTrue(status3);
    	boolean status4 = offerDetailsObj.offerDetails_ActualPercentageValue().isEnabled();
    	Assert.assertTrue(status4);
    	boolean status5 = offerDetailsObj.offerDetails_DeviationLevelValue().isEnabled();
    	Assert.assertTrue(status5);
    }

    @And("^verify all the fields under section eligibility details should be in read only mode$")
    public void verify_all_the_fields_under_section_eligibility_details_should_be_in_read_only_mode() throws Throwable {
		try {
			offerDetailsObj.offerDetails_EligibilityTypeValue().sendKeys(offerDetailsTestDataType.EditText);
			System.out.println("Eligibility type value is not in read only mode");
		} catch (Exception e) {
			System.out.println("Eligibility type value is in read only mode");
			// TODO: handle exception
		}
		try {
			offerDetailsObj.offerDetails_EligibilityAmountValue().sendKeys(offerDetailsTestDataType.EditText);
			System.out.println("Eligibility Amount value is not in read only mode");
		} catch (Exception e) {
			System.out.println("Eligibility Amount value is in read only mode");
			// TODO: handle exception
		}
		try {
			offerDetailsObj.offerDetails_EligibilityPercentageValue().sendKeys(offerDetailsTestDataType.EditText);
			System.out.println("Eligibility Percentage value is not in read only mode");
		} catch (Exception e) {
			System.out.println("Eligibility Percentage value is in read only mode");
			// TODO: handle exception
		}
		try {
			offerDetailsObj.offerDetails_CurrencyValue().sendKeys(offerDetailsTestDataType.EditText);
			System.out.println("Currency value is not in read only mode");
		} catch (Exception e) {
			System.out.println("Currency value is in read only mode");
			// TODO: handle exception
		}
		try {
			offerDetailsObj.offerDetails_ActualPercentageValue().sendKeys(offerDetailsTestDataType.EditText);
			System.out.println("Actual Percentage value is not in read only mode");
		} catch (Exception e) {
			System.out.println("Actual Percentage value is in read only mode");
			// TODO: handle exception
		}
		try {
			offerDetailsObj.offerDetails_DeviationLevelValue().sendKeys(offerDetailsTestDataType.EditText);
			System.out.println("Deviation Level value is not in read only mode");
		} catch (Exception e) {
			System.out.println("Deviation Level value is in read only mode");
			// TODO: handle exception
		}
	}
    
//---------------------------------------------------------------------------------------------//
    
    @Then("^verify the section Interest Rate Structure fields are available$")
    public void verify_the_section_interest_rate_structure_fields_are_available() throws Throwable {
    	javaScriptHelper.scrollIntoView(offerDetailsObj.offerDetails_InterestRateStructure());
    	offerDetailsObj.offerDetails_InterestRateStructure().isDisplayed();
    	boolean status = offerDetailsObj.offerDetails_InterestRateStructure_Id().isDisplayed();
    	Assert.assertTrue(status);
    	boolean status1 = offerDetailsObj.offerDetails_InterestRateStructure_Period().isDisplayed();
    	Assert.assertTrue(status1);
    	boolean status2 = offerDetailsObj.offerDetails_InterestRateStructure_RateDefinition().isDisplayed();
    	Assert.assertTrue(status2);
    	boolean status3 = offerDetailsObj.offerDetails_InterestRateStructure_InterestRate().isDisplayed();
    	Assert.assertTrue(status3);
    	boolean status4 = offerDetailsObj.offerDetails_InterestRateStructure_IndexRate().isDisplayed();
    	Assert.assertTrue(status4);
    	boolean status5 = offerDetailsObj.offerDetails_InterestRateStructure_BaseRate().isDisplayed();
    	Assert.assertTrue(status5);
    	boolean status6 = offerDetailsObj.offerDetails_InterestRateStructure_SpreadRate().isDisplayed();
    	Assert.assertTrue(status6);
    	boolean status7 = offerDetailsObj.offerDetails_InterestRateStructure_CapRate().isDisplayed();
    	Assert.assertTrue(status7);
    	boolean status8 = offerDetailsObj.offerDetails_InterestRateStructure_FloorRate().isDisplayed();
    	Assert.assertTrue(status8);
    	boolean status9 = offerDetailsObj.offerDetails_InterestRateStructure_RBPAdjuster().isDisplayed();
    	Assert.assertTrue(status9);
    	boolean status10 = offerDetailsObj.offerDetails_InterestRateStructure_PenaltyRate().isDisplayed();
    	Assert.assertTrue(status10);
//    	javaScriptHelper.scrollIntoView(offerDetailsObj.offerDetails_InterestRateStructure_PenaltyFee());
    	boolean status11 = offerDetailsObj.offerDetails_InterestRateStructure_PenaltyFee().isDisplayed();
    	Assert.assertTrue(status11);
    	
    }

    @And("^verify all the fields under section Interest Rate Structure should have lookup values$")
    public void verify_all_the_fields_under_section_interest_rate_structure_should_have_lookup_values() throws Throwable {
//    	javaScriptHelper.scrollIntoView(offerDetailsObj.offerDetails_InterestRateStructure_Id());
    	boolean status = offerDetailsObj.offerDetails_InterestRateStructure_IdValue().isEnabled();
    	Assert.assertTrue(status);
    	boolean status1 = offerDetailsObj.offerDetails_InterestRateStructure_PeriodValue().isEnabled();
    	Assert.assertTrue(status1);
    	boolean status2 = offerDetailsObj.offerDetails_InterestRateStructure_RateDefinitionValue().isEnabled();
    	Assert.assertTrue(status2);
    	boolean status3 = offerDetailsObj.offerDetails_InterestRateStructure_InterestRateValue().isEnabled();
    	Assert.assertTrue(status3);
    	boolean status4 = offerDetailsObj.offerDetails_InterestRateStructure_IndexRateValue().isEnabled();
    	Assert.assertTrue(status4);
    	boolean status5 = offerDetailsObj.offerDetails_InterestRateStructure_BaseRateValue().isEnabled();
    	Assert.assertTrue(status5);
    	boolean status6 = offerDetailsObj.offerDetails_InterestRateStructure_SpreadRateValue().isEnabled();
    	Assert.assertTrue(status6);
    	boolean status7 = offerDetailsObj.offerDetails_InterestRateStructure_CapRateValue().isEnabled();
    	Assert.assertTrue(status7);
    	boolean status8 = offerDetailsObj.offerDetails_InterestRateStructure_FloorRateValue().isEnabled();
    	Assert.assertTrue(status8);
    	boolean status9 = offerDetailsObj.offerDetails_InterestRateStructure_RBPAdjusterValue().isEnabled();
    	Assert.assertTrue(status9);
    	boolean status10 = offerDetailsObj.offerDetails_InterestRateStructure_PenaltyRateValue().isEnabled();
    	Assert.assertTrue(status10);
//    	javaScriptHelper.scrollIntoView(offerDetailsObj.offerDetails_InterestRateStructure_PenaltyFee());
    	boolean status11 = offerDetailsObj.offerDetails_InterestRateStructure_PenaltyFeeValue().isEnabled();
    	Assert.assertTrue(status11);
    }

    @And("^verify all the fields under section Interest Rate Structure should be in read only mode$")
    public void verify_all_the_fields_under_section_interest_rate_structure_should_be_in_read_only_mode() throws Throwable {
    	try {
			offerDetailsObj.offerDetails_InterestRateStructure_IdValue().sendKeys(offerDetailsTestDataType.EditText);
			System.out.println("InterestRateStructure ID value is not in read only mode");
		} catch (Exception e) {
			System.out.println("InterestRateStructure ID value is in read only mode");
			// TODO: handle exception
		}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_PeriodValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure Period value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure Period value is in read only mode");
    		// TODO: handle exception
    	}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_RateDefinitionValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure RateDefinition value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure RateDefinition value is in read only mode");
    		// TODO: handle exception
    	}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_InterestRateValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure InterestRate value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure InterestRate value is in read only mode");
    		// TODO: handle exception
    	}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_IndexRateValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure IndexRate value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure IndexRate value is in read only mode");
    		// TODO: handle exception
    	}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_BaseRateValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure BaseRate value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure BaseRate value is in read only mode");
    		// TODO: handle exception
    	}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_SpreadRateValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure SpreadRate value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure SpreadRate value is in read only mode");
    		// TODO: handle exception
    	}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_CapRateValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure CapRate value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure CapRate value is in read only mode");
    		// TODO: handle exception
    	}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_FloorRateValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure FloorRate value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure FloorRate value is in read only mode");
    		// TODO: handle exception
    	}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_RBPAdjusterValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure RBPAdjuster value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure RBPAdjuster value is in read only mode");
    		// TODO: handle exception
    	}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_PenaltyRateValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure PenaltyRate value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure PenaltyRate value is in read only mode");
    		// TODO: handle exception
    	}
    	try {
    		offerDetailsObj.offerDetails_InterestRateStructure_PenaltyFeeValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("InterestRateStructure PenaltyFee value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("InterestRateStructure PenaltyFee value is in read only mode");
    		// TODO: handle exception
    	}
    }
    
    @Then("^verify the section Installments fields are available$")
    public void verify_the_section_installments_fields_are_available() throws Throwable {
    	boolean status = offerDetailsObj.offerDetails_InstallmentPeriod().isDisplayed();
    	Assert.assertTrue(status);
    	boolean status1 = offerDetailsObj.offerDetails_InstallmentAmount().isDisplayed();
    	Assert.assertTrue(status1);
    	
    }

    @Then("^verify the field period under section Installments should be in read only mode$")
    public void verify_the_field_period_under_section_Installments_should_be_in_read_only_mode() throws Throwable {
    	try {
    		offerDetailsObj.offerDetails_InstallmentPeriodValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("Installment period value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("Installment period value is in read only mode");
    		// TODO: handle exception
    	}
    	
    }

    @Then("^verify Installments having same amount would be clubbed under same leg$")
    public void verify_installments_having_same_amount_would_be_clubbed_under_same_leg() throws Throwable {
    	String installmentPeriod = offerDetailsObj.offerDetails_InstallmentPeriodValue().getText();
    	String installmentAmount = offerDetailsObj.offerDetails_InstallmentAmountValue().getText();
    	System.out.println("Clubbed Under Same leg - "+ installmentPeriod +":"+ installmentAmount);
    }
    
    @Then("^verify the field Installment amount should be non editable$")
    public void verify_the_field_installment_amount_should_be_non_editable() throws Throwable {
    	try {
    		offerDetailsObj.offerDetails_InstallmentAmountValue().sendKeys(offerDetailsTestDataType.EditText);
    		System.out.println("Installment amount value is not in read only mode");
    	} catch (Exception e) {
    		System.out.println("Installment amount value is in read only mode");
    		// TODO: handle exception
    	}
    }
    
    @Then("^verify post clicking on Accept Offer button the offer would be accepted$")
    public void verify_post_clicking_on_accept_offer_button_the_offer_would_be_accepted() throws Throwable {
    	javaScriptHelper.scrollIntoView(offerDetailsObj.offerDetails_AcceptOfferButton());
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_AcceptOfferButton());
    	offerDetailsObj.offerDetails_AcceptOfferButton().click();
    }

    @And("^verify Disbursement process can be initiated$")
    public void verify_disbursement_process_can_be_initiated() throws Throwable {
        
    	
    }
    
    //----------------------------------------------------------------------------------------//
    
    @Then("^verify the section Appeal Request fields are available$")
    public void verify_the_section_appeal_request_fields_are_available() throws Throwable {
    	javaScriptHelper.scrollIntoView(offerDetailsObj.offerDetails_AppealRequest());
    	offerDetailsObj.offerDetails_AppealRequest().isDisplayed();
    	
    	boolean status1 = offerDetailsObj.offerDetails_SaveButton().isDisplayed();
    	Assert.assertTrue(status1);
    	boolean status2 = offerDetailsObj.offerDetails_AppealButton().isDisplayed();
    	Assert.assertTrue(status2);
    	boolean status3 = offerDetailsObj.offerDetails_NewRequestedAmount().isDisplayed();
    	Assert.assertTrue(status3);
    	boolean status4 = offerDetailsObj.offerDetails_NewRequestedTenure().isDisplayed();
    	Assert.assertTrue(status4);
    	boolean status5 = offerDetailsObj.offerDetails_OrigionalRequestedAmount().isDisplayed();
    	Assert.assertTrue(status5);
    	boolean status6 = offerDetailsObj.offerDetails_OrigionalRequestedTenure().isDisplayed();
    	Assert.assertTrue(status6);
    	
    }

    @Then("^verify New Requested Tenure field system should allow user to enter value manually$")
    public void verify_new_requested_tenure_field_system_should_allow_user_to_enter_value_manually() throws Throwable {
    	try {
    		waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_NewRequestedTenure());
    		offerDetailsObj.offerDetails_NewRequestedTenure().sendKeys(offerDetailsTestDataType.NewRequestedTenure);
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail("system should not allow user to enter value manually in New Requested Tenure field");
		}
   
    }

    @Then("^verify New Requested Amount field system should allow user to enter value manually$")
    public void verify_new_requested_amount_field_system_should_allow_user_to_enter_value_manually() throws Throwable {
    	try {
    		waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_NewRequestedTenure());
    		offerDetailsObj.offerDetails_NewRequestedAmount().sendKeys(offerDetailsTestDataType.NewRequestedAmount);
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail("system should not allow user to enter value manually in New Requested Amount field");
		}
    }

    @Then("^verify the field Original Requested Tenure should be in read only mode$")
    public void verify_the_field_original_requested_tenure_should_be_in_read_only_mode() throws Throwable {
    	boolean status = offerDetailsObj.offerDetails_OrigionalRequestedAmount().getAttribute("readonly").equalsIgnoreCase("true");
    	Assert.assertTrue("Original Requested Tenure field should not be in read only mode", status);
    }

    @Then("^verify the field Original Requested Amount should be in read only mode$")
    public void verify_the_field_original_requested_amount_should_be_in_read_only_mode() throws Throwable {
    	boolean status = offerDetailsObj.offerDetails_OrigionalRequestedTenure().getAttribute("readonly").equalsIgnoreCase("true");
    	Assert.assertTrue("Original Requested Amount field should not be in read only mode", status);
        
    }

    @Then("^verify the functionality of save button under section Appeal Request$")
    public void verify_the_functionality_of_save_button_under_section_appeal_request() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_SaveButton());
    	offerDetailsObj.offerDetails_SaveButton().click();
    }

    @Then("^verify system should display validation message for invalid data post clicking on save button under section Appeal Request$")
    public void verify_system_should_display_validation_message_for_invalid_data_post_clicking_on_save_button_under_section_appeal_request() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_SaveConfirmationMessage());
    	boolean status = offerDetailsObj.offerDetails_SaveConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    	String invalidMessage = offerDetailsObj.offerDetails_SaveConfirmationMessage().getText();
    	System.out.println("InvalidMessage : " +invalidMessage);
    }

    @Then("^verify system display the confirmation message post clicking on save button under section Appeal Request$")
    public void verify_system_display_the_confirmation_message_post_clicking_on_save_button_under_section_appeal_request() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_SaveConfirmationMessage());
    	boolean status = offerDetailsObj.offerDetails_SaveConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    	String confirmationMessage = offerDetailsObj.offerDetails_SaveConfirmationMessage().getText();
    	System.out.println("ConfirmationMessage : " +confirmationMessage);
    }

    @Then("^verify system should display proper validation message to enter new requested amount and Tenure$")
    public void verify_system_should_display_proper_validation_message_to_enter_new_requested_amount_and_tenure() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_SaveButton());
    	offerDetailsObj.offerDetails_SaveButton().click();
    	boolean status = offerDetailsObj.offerDetails_SaveConfirmationMessage().isDisplayed();
    	Assert.assertTrue(status);
    	String validationMessage = offerDetailsObj.offerDetails_SaveConfirmationMessage().getText();
    	System.out.println("ValidationMessage : " +validationMessage);
    }

    @Then("^verify the Functionality of Appeal button$")
    public void verify_the_functionality_of_appeal_button() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, offerDetailsObj.offerDetails_AppealButton());
    	offerDetailsObj.offerDetails_AppealButton().click();
    }

}