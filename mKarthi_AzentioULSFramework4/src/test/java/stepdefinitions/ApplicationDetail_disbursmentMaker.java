package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationdetailDisbmtMakerObject;
import resources.BaseClass;
import testDataType.ApplicationDisbursementMakerTestData;
import testDataType.KULS_Login_TestDataType;

public class ApplicationDetail_disbursmentMaker extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	ApplicationDisbursementMakerTestData applicationdetailsData = jsonConfig
			.getApplication_DisbursementMakerListByName("Maker");
	ApplicationdetailDisbmtMakerObject disbmtmaker = new ApplicationdetailDisbmtMakerObject(driver);
	WaitHelper waithelper = new WaitHelper(driver);

	
	


	
	// ***************Kamalapriya***************************//
	@And("^Click the inbox button in application detail$")
	public void click_the_inbox_button_in_application_detail() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Inbox_Icon(), 60, 2);
		disbmtmaker.Inbox_Icon().click();
	}

	@Then("^click the action icon at new app stage$")
	public void click_the_action_icon_at_new_app_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.NewApp_ActionIcon(), 60, 2);
		disbmtmaker.NewApp_ActionIcon().click();
	}

	@And("^Click the customer details tab$")
	public void click_the_customer_details_tab() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_CustomerDetailTab(), 60, 2);
		disbmtmaker.Application_CustomerDetailTab().click();
	}

	@Then("^Click the Round button in customer details tab$")
	public void click_the_round_button_in_customer_details_tab() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_CustomerDetailsRound(), 60, 2);
		disbmtmaker.Application_CustomerDetailsRound().click();
	}

	@And("^Click the application details tab$")
	public void click_the_application_details_tab() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_Tab(), 60, 2);
		disbmtmaker.Application_Tab().click();
	}

	@Then("^Click the submit button in application details$")
	public void click_the_submit_button_in_application_details() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_NewApp_SubmitButton(), 60, 2);
		disbmtmaker.Application_NewApp_SubmitButton().click();
	}

	@And("^Click the Ok button for action confirmation in application detail$")
	public void click_the_ok_button_for_action_confirmation_in_application_detail() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_NewApp_SubmitAlertButton(), 60,
				2);
		disbmtmaker.Application_NewApp_SubmitAlertButton().click();
	}

	@Then("^Click the final submit button in application detail$")
	public void click_the_final_submit_button_in_application_detail() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_NewApp_SubmitFinalButton(), 60,
				2);
		disbmtmaker.Application_NewApp_SubmitFinalButton().click();
	}

	@And("^Click the action icon at DUPAPPDEC stage$")
	public void click_the_action_icon_at_dupappdec_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_DUPAPPDEC_ActionIcon(), 60, 2);
		disbmtmaker.Application_DUPAPPDEC_ActionIcon().click();
	}

	@Then("^Approve the record in application detail$")
	public void approve_the_record_in_application_detail() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_APPDATAENT_ApproveButton(), 60,
				2);
		disbmtmaker.Application_APPDATAENT_ApproveButton().click();
	}

	@And("^Click the action  icon in app data entry stage$")
	public void click_the_action_icon_in_app_data_entry_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_APPDATAENT_ActionIcon(), 60,
				2);
		disbmtmaker.Application_APPDATAENT_ActionIcon().click();
	}

	@And("^Click the action icon at LEGVRFY stage$")
	public void click_the_action_icon_at_legvrfy_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_LEGVRFY_ActionButton(), 60, 2);
		disbmtmaker.Application_LEGVRFY_ActionButton().click();
	}

	@And("^Click the action icon at FCUVRFY stage$")
	public void click_the_action_icon_at_fcuvrfy_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_FCUVRFY_ActionButton(), 60, 2);
		disbmtmaker.Application_FCUVRFY_ActionButton().click();
	}

	@And("^Click the action icon at OFFERING stage$")
	public void click_the_action_icon_at_offering_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_OFFERING_ActionButton(), 60,
				2);
		disbmtmaker.Application_OFFERING_ActionButton().click();
	}

	@Then("^click the application tab in OFFERING stage$")
	public void click_the_application_tab_in_offering_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_DetailTab_Offering(), 60, 2);
		disbmtmaker.Application_DetailTab_Offering().click();
	}

	@And("^Click the action icon at DISBMKR stage$")
	public void click_the_action_icon_at_disbmkr_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_DISBMKR_ActionIcon(), 60, 2);
		disbmtmaker.Application_DISBMKR_ActionIcon().click();
	}

//SEARCH AND FIND***********************//

	@Then("^Search the record in application details for disbursement maker$")
	public void search_the_record_in_application_details_for_disbursement_maker() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.searchiconreferenceid(), 60,
				2);
		disbmtmaker.searchiconreferenceid().click();
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.searchsentkeys(), 60, 2);
		disbmtmaker.searchsentkeys().click();
		disbmtmaker.searchsentkeys().sendKeys("DISBMKR");
	}

	@Then("^Verify the field primary product is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_primary_product_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_primaryProduct(), 60, 2);
		disbmtmaker.DISBMKR_primaryProduct().isDisplayed();
		try {
			disbmtmaker.DISBMKR_primaryProduct().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}

	}

	@Then("^Verify the field primary sub product is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_primary_sub_product_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_primarysubProduct(), 60, 2);
		disbmtmaker.DISBMKR_primarysubProduct().isDisplayed();
		try {
			disbmtmaker.DISBMKR_primarysubProduct().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Total finance amount requested  is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_total_finance_amount_requested_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_TotalFinanceAmountRequested(), 60, 2);
		disbmtmaker.DISBMKR_TotalFinanceAmountRequested().isDisplayed();
		try {
			disbmtmaker.DISBMKR_TotalFinanceAmountRequested().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Declared net income is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_declared_net_income_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_DeclaredNetIncome(), 60, 2);
		disbmtmaker.DISBMKR_DeclaredNetIncome().isDisplayed();
		try {
			disbmtmaker.DISBMKR_DeclaredNetIncome().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Declared current obligation is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_declared_current_obligation_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_DeclaredCurrentObligations(), 60, 2);
		disbmtmaker.DISBMKR_DeclaredCurrentObligations().isDisplayed();
		try {
			disbmtmaker.DISBMKR_DeclaredCurrentObligations().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field special promotion is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_special_promotion_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SpecialPromotion(), 60, 2);
		disbmtmaker.DISBMKR_SpecialPromotion().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SpecialPromotion().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field sourcing channel is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_sourcing_channel_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SourcingChannel(), 60, 2);
		disbmtmaker.DISBMKR_SourcingChannel().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SourcingChannel().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Business Center Code is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_business_center_code_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_BusinessCenterCode(), 60, 2);
		disbmtmaker.DISBMKR_BusinessCenterCode().isDisplayed();
		try {
			disbmtmaker.DISBMKR_BusinessCenterCode().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Servicing Type is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_servicing_type_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ServicingType(), 60, 2);
		disbmtmaker.DISBMKR_ServicingType().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ServicingType().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Servicing Entity is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_servicing_entity_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ServicingEntity(), 60, 2);
		disbmtmaker.DISBMKR_ServicingEntity().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ServicingEntity().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Servicing Branch is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_servicing_branch_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ServicingBranch(), 60, 2);
		disbmtmaker.DISBMKR_ServicingBranch().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ServicingBranch().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Closing Staff is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_closing_staff_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ClosingStaff(), 60, 2);
		disbmtmaker.DISBMKR_ClosingStaff().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ClosingStaff().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Sourcing Type is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_sourcing_type_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SourcingType(), 60, 2);
		disbmtmaker.DISBMKR_SourcingType().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SourcingType().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Sourcing Staff is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_sourcing_staff_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SourcingStaff(), 60, 2);
		disbmtmaker.DISBMKR_SourcingStaff().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SourcingStaff().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Sourcing Entity is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_sourcing_entity_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SourcingEntity(), 60, 2);
		disbmtmaker.DISBMKR_SourcingEntity().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SourcingEntity().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Sourcing Office is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_sourcing_office_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SourcingOffice(), 60, 2);
		disbmtmaker.DISBMKR_SourcingOffice().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SourcingOffice().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Reference Type is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_reference_type_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ReferenceType(), 60, 2);
		disbmtmaker.DISBMKR_ReferenceType().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ReferenceType().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Reference Entity  is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_reference_entity_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ReferenceEntity(), 60, 2);
		disbmtmaker.DISBMKR_ReferenceEntity().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ReferenceEntity().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Reference Code is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_reference_code_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ReferenceCode(), 60, 2);
		disbmtmaker.DISBMKR_ReferenceCode().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ReferenceCode().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

}
