package stepdefinitions;

import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.SchemeMasterObject;
import resources.BaseClass;
import resources.ExcelData;
import testDataType.KULS_Login_TestDataType;

public class SchemeMaster extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	SchemeMasterObject schemeMstObj = new SchemeMasterObject(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	//SchemeMasterTestData schemeMasterData = jconfig.getSchemeMasterByName("Maker");
	ClicksAndActionsHelper clickAndAction= new ClicksAndActionsHelper(driver);
	

	@Given("^Get the URL and login as maker$")
	public void get_the_url_and_login_as_maker() throws Throwable {
		//String kulsApplicationUrl = configFileRead.getApplicationUrl();
		//driver.get(kulsApplicationUrl);
		ExcelData excelData = new ExcelData("C:\\Users\\inindc00073\\Downloads\\UlsTestDataDesign.xlsx","LoginCredentilas","Stage");
        Map<String, String> testdata = excelData.getTestdata("Maker1");
        String kulsApplicationUrl = configFileRead.getApplicationTransactionUrl();
        driver.get(kulsApplicationUrl);
        login.loginUlsApplicationAsMaker(testdata.get("Username"),testdata.get("Password"));
	}

	@Then("^click on product definition$")
	public void click_on_product_definition() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.ProductDefinition(), 60, 2);
		schemeMstObj.ProductDefinition().click();
	}

	@And("^Click the eyeicon in scheme master$")
	public void click_the_eyeicon_in_scheme_master() throws Throwable {
		action.getJavascriptHelper().scrollIntoView(schemeMstObj.ulsSchemeAMasterViewIcon());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.ulsSchemeAMasterViewIcon(), 60, 2);
		schemeMstObj.ulsSchemeAMasterViewIcon().click();
	}

	@Then("^Click the add button in scheme master$")
	public void click_the_add_button_in_scheme_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.schemeMasterAddButton(), 60, 2);
		schemeMstObj.schemeMasterAddButton().click();

	}

	@And("^Fill the product type$")
	public void fill_the_product_type() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.schemeMasterProductTypeDropDown(), 60, 2);
		schemeMstObj.schemeMasterProductTypeDropDown().click();
//		String xpath = "//ion-label[contains(text(),'" + schemeMasterData.productType + "')]";
	}

	@Then("^Select the product subtype$")
	public void select_the_product_subtype() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.schemematserSubProducTypeDropDown(), 60,
				2);
		schemeMstObj.schemematserSubProducTypeDropDown().click();
//		String xpath = "//ion-label[contains(text(),'" + schemeMasterData.productSubType + "')]";
	}

	@And("^Save the record in scheme master$")
	public void save_the_record_in_scheme_master() throws Throwable {
		//action.getJavascriptHelper().scrollIntoView(schemeMstObj.SchemeMaster_SaveButton());

		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeMaster_SaveButton(), 60, 2);
		schemeMstObj.SchemeMaster_SaveButton().click();
	}

	@Then("^Print the validation results$")
	public void print_the_validation_results() throws Throwable {
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
	}

	@Then("^Click the back button$")
	public void click_the_back_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.Scheme_BackButton(), 60, 2);
		schemeMstObj.Scheme_BackButton().click();
	}

	@And("^Click the temp view button$")
	public void click_the_temp_view_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeMaster_TempViewButton(), 60, 2);
		schemeMstObj.SchemeMaster_TempViewButton().click();
	}

	@And("^Click the temp view first pencil button$")
	public void click_the_temp_view_first_pencil_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeMaster_TempViewPencilButton(), 60,
				2);
		schemeMstObj.SchemeMaster_TempViewPencilButton().click();
	}

	@And("^Fill the invalid details$")
	public void fill_the_invalid_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeMaster_TempViewPencilButton(), 60,
				2);
		schemeMstObj.schemeMasterMinFinanceAmount().click();
		schemeMstObj.schemeMasterMinFinanceAmount().sendKeys("abc");

	}

	@Then("^Click the scheme charge segment button$")
	public void click_the_scheme_charge_segment_button() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.schemeMasterSchemeChargesSegmentButton(),
				60, 2);
		// action.getJavascriptHelper().JSEClick(schemeMstObj.schemeMasterSchemeChargesSegmentButton());
		schemeMstObj.schemeMasterSchemeChargesSegmentButton().click();

	}

	@Then("^Click the add button in scheme charge$")
	public void click_the_add_button_in_scheme_charge() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeCharge_addButton(), 60, 2);
		schemeMstObj.SchemeCharge_addButton().click();
	}

	@And("^Click the edit icon of active record$")
	public void click_the_edit_icon_of_active_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeMaster_SchemeChargeEditIcon(), 60,
				2);
		schemeMstObj.SchemeMaster_SchemeChargeEditIcon().click();
	}

	@And("^Click the Basic eligibility segment button$")
	public void click_the_basic_eligibility_segment_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				schemeMstObj.schemeMasterBasicEligibilitySegmentButton(), 60, 2);
		schemeMstObj.schemeMasterBasicEligibilitySegmentButton().click();

	}

	@And("^Click the verification segment button$")
	public void click_the_verification_segment_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.chemeMasterVerificationSegmentButton(),
				60, 2);
		schemeMstObj.chemeMasterVerificationSegmentButton().click();

	}

	@And("^Click the valuation button$")
	public void click_the_valuation_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.chemeMasterValuationSegmentButton(), 60,
				2);
		schemeMstObj.chemeMasterValuationSegmentButton().click();
	}

	///***************Inactive*******//
	@Then("^Click the status button in scheme master$")
    public void click_the_status_button_in_scheme_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeCharge_ActiveInactive(), 30,5);
		action.getJavascriptHelper().scrollIntoView(schemeMstObj.SchemeCharge_ActiveInactive());  

		for (int i = 0; i <10; i++) {
		try {	

			//waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeCharge_ActiveInactive(), 30,5);
		schemeMstObj.SchemeCharge_ActiveInactive().click();
		break;
		}
		catch(NoSuchElementException e) {
	    }}}

    @Then("^Click the status button to change the active record$")
    public void click_the_status_button_to_change_the_active_record() throws Throwable {
    	//action.getJavascriptHelper().scrollIntoViewAndClick(schemeMstObj.SchemeCharge_StatusButton());

		  waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeCharge_StatusButton(), 60,2);
		  schemeMstObj.SchemeCharge_StatusButton().click();
    }
    @And("^Save the record in scheme master screen$")
    public void save_the_record_in_scheme_master_screen() throws Throwable {
    	action.getJavascriptHelper().scrollIntoView(schemeMstObj.SchemeMaster_SaveButton());

    			waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeMaster_SaveButton(), 60, 2);
    			schemeMstObj.SchemeMaster_SaveButton().click();
    }
    @Then("^Fill the missing mandate field$")
    public void fill_the_missing_mandate_field() throws Throwable {
    	
    	action.getJavascriptHelper().scrollIntoView(schemeMstObj.schemeMasterBulkPaymentDropDown());
   for (int i = 0; i <10; i++) {
	try {
		//ion-label[contains(text(),'" + schemeMasterData.BulkPayment + "')]
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.schemeMasterBulkPaymentDropDown(), 60, 2);
		schemeMstObj.schemeMasterBulkPaymentDropDown().click();
	//	driver.findElement(By.xpath("//ion-label[contains(text(),'"+schemeMasterData.BulkPayment+"')]")).click();
		//action.getJavascriptHelper().scrollIntoView(schemeMstObj.schemeMasterImmediateDueDateDropDown());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.schemeMasterImmediateDueDateDropDown(), 60, 2);
		schemeMstObj.schemeMasterImmediateDueDateDropDown().click();
//		driver.findElement(By.xpath("//ion-label[contains(text(),'"+schemeMasterData.ImmediateDueDate+"')]")).click();
		
	}
	catch(Exception e) {
    }}}
    @And("^Click the temp view icon$")
    public void click_the_temp_view_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.SchemeMaster_TempViewButton(), 60, 2);
		schemeMstObj.SchemeMaster_TempViewButton().click();
    }
    @Then("^Cancel the record in scheme master$")
    public void cancel_the_record_in_scheme_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.uLS_SchemeMaster_CancelButton(), 60, 2);
		schemeMstObj.uLS_SchemeMaster_CancelButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.uLS_SchemeMaster_SubmitCancelButton(), 60, 2);

		schemeMstObj.uLS_SchemeMaster_SubmitCancelButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, schemeMstObj.uLS_SchemeMaster_FinalSubmitCancelButton(), 60, 2);

		schemeMstObj.uLS_SchemeMaster_FinalSubmitCancelButton().click();
    }
}
