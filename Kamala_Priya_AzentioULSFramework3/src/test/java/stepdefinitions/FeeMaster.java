package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
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
import io.cucumber.java.en.Then;
import pageobjects.FeeMasterObject;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import testDataType.FeeMasterTestData;
import testDataType.KULS_Login_TestDataType;

public class FeeMaster extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	FeeMasterObject feeMstObj = new FeeMasterObject(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	FeeMasterTestData feeMasterData = jconfig.getFeeMasterByName("Maker");
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);
	JavascriptHelper javahelper = new JavascriptHelper(driver);
	FindFieldisMandatoryorNot mandateOrNot= new FindFieldisMandatoryorNot(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00073\\Downloads\\UlsTestDataDesign.xlsx","FeeMaster","Data Set ID");
	Map<String, String> testData;


    @Then("^Click the config Manager$")
    public void click_the_config_manager() throws Throwable {
 	  // action.getJavascriptHelper().scrollIntoView(feeMstObj.ConfigManager());
	
   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.ConfigManager(), 30, 5);
  for (int i = 0; i <25; i++) {
	  try {
		  
   feeMstObj.ConfigManager().click();
   break;
    }
	  catch(StaleElementReferenceException e) {
	  }}}
    @And("^Click the eyeicon of the fee master$")
    public void click_the_eyeicon_of_the_fee_master() throws Throwable {
   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_EyeIcon(), 30, 5);
   feeMstObj.FeeMaster_EyeIcon().click();

    }

    @Then("^Click the add button in fee master$")
    public void click_the_add_button_in_fee_master() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_AddButton(), 30, 5);
    	   feeMstObj.FeeMaster_AddButton().click();

    }
    @And("^then print the fields avilable in charge tab$")
    public void then_print_the_fields_avilable_in_charge_tab() throws Throwable {
 	   System.out.println(" The fields vaialble under Charge tab");
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.ChargeDescriptionName(), 30,5);
    	   feeMstObj.FeeMaster_ChargeDescription().isDisplayed();
    	   //waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.ChargeTypeName(), 30, 5);
    	   feeMstObj.ChargeTypeName().isDisplayed();
    	   //waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.ChargeFlagName(), 30, 5);
    	   feeMstObj.ChargeFlagName().isDisplayed();
    	   //waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.DueCodeName(), 30, 5);
    	   feeMstObj.DueCodeName().isDisplayed();
    	   //waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.LegacyCode1Name(), 30, 5);
    	   feeMstObj.LegacyCode1Name().isDisplayed();
    	 //waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.LegacyCode2Name(), 30, 5);
    	   feeMstObj.LegacyCode2Name().isDisplayed();
    	   //waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.GSTApplicableStateName(), 30, 5);
    	   feeMstObj.GSTApplicableStateName().isDisplayed();
    	  // waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.IsTaxAllowedName(), 30, 5);
    	   feeMstObj.IsTaxAllowedName().isDisplayed();
    	   //waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.TaxCalculationMethodName(), 30, 5);
    	   feeMstObj.TaxCalculationMethodName().isDisplayed();
    	   //waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.IncludeInAPRName(), 30, 5);
    	   feeMstObj.IncludeInAPRName().isDisplayed();
    	   //waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.RemarksName(), 30, 5);
    	   feeMstObj.RemarksName().isDisplayed();
    	   feeMstObj.FeeMaster_Save1().isDisplayed();
    	   feeMstObj.BackButton().isDisplayed();
    }
    @Then("^Check the functinality of charge description in charge tab$")
    public void check_the_functinality_of_charge_description_in_charge_tab() throws Throwable {
    	testData = excelData.getTestdata("AT-FM-T001-D1");
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_ChargeDescription(), 30, 5);
    	   feeMstObj.FeeMaster_ChargeDescription().click();
    	   feeMstObj.FeeMaster_ChargeDescription().sendKeys(testData.get("Description"));
    	   
    }

    @And("^Select the charge type in charge tab$")
    public void select_the_charge_type_in_charge_tab() throws Throwable {
    	Thread.sleep(2000);
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_ChargeType(), 30, 5);
    	   feeMstObj.FeeMaster_ChargeType().click();
    	   String xpath="//ion-label[contains(text(),'"+testData.get("Charge Type")+"')]/following-sibling::ion-radio";
    	   for (int i = 0; i <30; i++) {
    	   try {
    		   driver.findElement(By.xpath(xpath)).click();
    	      	   break;
    	   }
    	   catch(Exception e) {
    	   }}
    	   }

    

    @Then("^select the charge flag in charge tab$")
    public void select_the_charge_flag_in_charge_tab() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_ChargeFlag(), 30, 5);
    	   feeMstObj.FeeMaster_ChargeFlag().click();
    	   String xpath="//ion-label[contains(text(),'"+testData.get("Charge Flag")+"')]/following-sibling::ion-radio";
    	   for (int i = 0; i <30; i++) {
			try
			{
				driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
			}
			}
    }

    @And("^select the Due code in charge tab$")
    public void select_the_due_code_in_charge_tab() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_DueCode(), 30, 5);
    	   feeMstObj.FeeMaster_DueCode().click();
    	   String xpath="//ion-label[contains(text(),'"+testData.get("Due Code")+"')]/following-sibling::ion-radio";

    	   for (int i = 0; i <30; i++) {
			try {
		driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
    }}}
    @Then("^Enter the legacy code1$")
    public void enter_the_legacy_code1() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Legacy1Code(), 30, 5);
    	   for (int i = 0; i < 10; i++) {
			try {
    	   feeMstObj.FeeMaster_Legacy1Code().click();
    	   feeMstObj.FeeMaster_Legacy1Code().sendKeys(testData.get("Legacy Code1"));
    	   break;
			}
			catch(Exception e) {
    }}}
    @And("^Enter the legacy code2$")
    public void enter_the_legacy_code2() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Legacy2Code(), 30, 5);
    	  for (int i = 0; i <10; i++) {
			try {
    	   feeMstObj.FeeMaster_Legacy2Code().click();
    	   feeMstObj.FeeMaster_Legacy2Code().sendKeys(testData.get("Legacy Code2"));
    	   break;
    }
    	  catch(Exception e) {
    	  }}}
    @Then("^Choose the GST applicable state$")
    public void choose_the_gst_applicable_state() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_GSTApplicableState(), 30, 5);
    	   feeMstObj.FeeMaster_GSTApplicableState().click();
     	  String xpath="//ion-label[contains(text(),'"+testData.get("GST Applicable State")+"')]/following-sibling::ion-radio";

    	   for (int i = 0; i < 30; i++) {
			try {
		driver.findElement(By.xpath(xpath)).click();
		break;
			}
			catch(Exception e) {
			}
			}
    }


    @And("^click the is tax allowed button$")
    public void click_the_is_tax_allowed_button() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TaxAllowedButton(), 30, 5);
    	   feeMstObj.FeeMaster_TaxAllowedButton().click();
    }
    @Then("^select the tax calculation method$")
    public void select_the_tax_calculation_method() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TaxCalculationMethod(), 30, 5);
    	   feeMstObj.FeeMaster_TaxCalculationMethod().click();
    	   String xpath="//ion-label[contains(text(),'"+testData.get("Tax Calculation Method")+"')]/following-sibling::ion-radio";
    	   for (int i = 0; i < 10; i++) {
			try {
	driver.findElement(By.xpath(xpath)).click();
			break;
		}
			catch(Exception e) {
			}}
			}
		

    @And("^click the include in apr button$")
    public void click_the_include_in_apr_button() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_IncludeARPButton(), 30, 5);
    	   feeMstObj.FeeMaster_IncludeARPButton().click();
    }
    @Then("^choose the amortize field in charge tab$")
    public void choose_the_amortize_field_in_charge_tab() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Amortize(), 30, 5);
    	   feeMstObj.FeeMaster_Amortize().click();
	    	  String xpath="//ion-label[contains(text(),'"+testData.get("Amortize")+"')]/following-sibling::ion-radio";

    	   for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			break;
	}
			catch(Exception e) {
			}
			}
    }
    @And("^choose the deduct field in charge tab$")
    public void choose_the_deduct_field_in_charge_tab() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Deduct(), 30, 5);
    	   feeMstObj.FeeMaster_Deduct().click();
     	  String xpath="//ion-label[contains(text(),'"+testData.get("Deduct")+"')]/following-sibling::ion-radio";
    	   for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			}
			catch(Exception e) {
			}
			}
    }

    @Then("^select the upfront filed in charge tab$")
    public void select_the_upfront_filed_in_charge_tab() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Upfront(), 30, 5);
    	   feeMstObj.FeeMaster_Upfront().click();
    	   String xpath="//ion-label[contains(text(),'"+testData.get("Upfront")+"')]/following-sibling::ion-radio";
    	   for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
    }}}

    @And("^Select the amort rate method$")
    public void select_the_amort_rate_method() throws Throwable {
 	   String xpath="//ion-label[contains(text(),'"+testData.get("Amort Rate Method")+"')]/following-sibling::ion-radio";

    	 //  waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_AmortRate(), 60, 5);
    	   for (int i = 0; i < 30; i++) {
			try {
		    	   feeMstObj.FeeMaster_AmortRate().click();
driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
    }}
    }
    @Then("^Choose the fee amort tenure method$")
    public void choose_the_fee_amort_tenure_method() throws Throwable {
    	Thread.sleep(2000);
    	   action.getJavascriptHelper().scrollIntoView(feeMstObj.FeeMaster_AmortTenure());

    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_AmortTenure(), 30, 5);
    	   feeMstObj.FeeMaster_AmortTenure().click();
    	   String xpath="//ion-label[contains(text(),'"+testData.get("Amort Tenure(Method)")+"')]/following-sibling::ion-radio";

    	   for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
    }}
    }


    @And("^Select the charge amount recovery$")
    public void select_the_charge_amount_recovery() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_ChargeAmountRecovery(), 30, 5);
    	   feeMstObj.FeeMaster_ChargeAmountRecovery().click();
    	   String xpath="//ion-label[contains(text(),'"+testData.get("Amount Recovery")+"')]/following-sibling::ion-radio";
    	   for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
    }}
    }

    @Then("^Choose the fee amort frequency$")
    public void choose_the_fee_amort_frequency() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_AmountFrequency(), 30, 5);
    	   feeMstObj.FeeMaster_AmountFrequency().click();
    	   String xpath="//ion-label[contains(text(),'"+testData.get("Amort Frequency")+"')]/following-sibling::ion-radio";

    	   for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
    }}
    }


    @And("^enter the remark in charge tab$")
    public void enter_the_remark_in_charge_tab() throws Throwable {
 	   action.getJavascriptHelper().scrollIntoView(feeMstObj.FeeMaster_Remark());
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Remark(), 30, 5);
    	     	   feeMstObj.FeeMaster_Remark().click();
    	   feeMstObj.FeeMaster_Remark().sendKeys(testData.get("Remarks"));
			
    }

    @Then("^Save the record in charge tab$")
    public void save_the_record_in_charge_tab() throws Throwable {
  	   action.getJavascriptHelper().scrollIntoView(feeMstObj.FeeMaster_Save1());
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Save1(), 30, 5);
    	   feeMstObj.FeeMaster_Save1().click();
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_SavePopUp(), 30, 5);
    	  String Popup= feeMstObj.FeeMaster_SavePopUp().getText();
    	   Assert.assertTrue(Popup.contains("Success"));
    }
    @Then("^Save the record in fee master$")
    public void save_the_record_in_fee_master() throws Throwable {
    	 action.getJavascriptHelper().scrollIntoView(feeMstObj.FeeMaster_Save1());
  	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Save1(), 30, 5);
  	   Thread.sleep(1000);
  	   feeMstObj.FeeMaster_Save1().click();
  	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_SavePopUp(), 30, 5);
  	  String Popup= feeMstObj.FeeMaster_SavePopUp().getText();
  	   Assert.assertTrue(Popup.contains("Success"));
    }
    @Then("^update the record in fee master$")
    public void update_the_record_in_fee_master() throws Throwable {
    	javahelper.scrollIntoView(feeMstObj.FeeMaster_Update());
   	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Update(), 30, 5);
   	   Thread.sleep(1000);
   	   for (int i = 0; i < 100; i++) {
		try {
	
   	   feeMstObj.FeeMaster_Update().click();
		}
		catch(Exception e) {
		}
		}
    }
    
    @And("^Click the action icon in charge tab$")
    public void click_the_action_icon_in_charge_tab() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_ActionIcon(), 30, 5);
    	   feeMstObj.FeeMaster_ActionIcon().click();
    }

    @Then("^click the tax page$")
    public void click_the_tax_page() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TaxTab(), 30, 5);
    	   feeMstObj.FeeMaster_TaxTab().click();
    	   System.out.println("The Required fields under Tax");
    }
    

    @And("^print the fields available in charge tax master detail$")
    public void print_the_fields_available_in_charge_tax_master_detail() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_AvailableName(), 30, 5);
    	   feeMstObj.FeeMaster_AvailableName().isDisplayed();
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_SelectedName(), 30, 5);
    	   feeMstObj.FeeMaster_SelectedName().isDisplayed();
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TaxTab_RemarksName(), 30, 5);
    	   feeMstObj.FeeMaster_TaxTab_RemarksName().isDisplayed();
    	   feeMstObj.FeeMaster_Save1().isDisplayed();
    	   //feeMstObj.BackButton().isDisplayed();
    	  }


    @Then("^choose the field in avilable and tranfer to selected$")
    public void choose_the_field_in_avilable_and_tranfer_to_selected() throws Throwable {
    	 for (int i = 0; i < 30; i++) {
 			try {
 	    	   driver.findElement(By.xpath("//div[contains(text(),'"+feeMasterData.AvailableTax+"')]")).click();
 			break;
 			}
 			catch(Exception e) {
     }}

    	   
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TaxTab_AvailableClick(), 30, 5);
    	   feeMstObj.FeeMaster_TaxTab_AvailableClick().click();
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TaxTab_AvailableClick(), 30, 5);
    	   feeMstObj.FeeMaster_TaxTab_AvailableClick().click();
    	   
    }

    @And("^Enter the remark in charge tax master detail$")
    public void enter_the_remark_in_charge_tax_master_detail() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TaxTab_Remark(), 30, 5);
    	   feeMstObj.FeeMaster_TaxTab_Remark().click();
    	   feeMstObj.FeeMaster_TaxTab_Remark().sendKeys(feeMasterData.TaxRemark);
    }
    @Then("^save the record in tax master detail$")
    public void save_the_record_in_tax_master_detail() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Save1(), 30, 5);
  	   feeMstObj.FeeMaster_Save1().click();
    }
    @Then("^Click the action icon in fee master$")
    public void click_the_action_icon_in_fee_master() throws Throwable {
 	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_InboxActionIcon(), 30, 5);
 	  feeMstObj.FeeMaster_InboxActionIcon().click();
    }

    @And("^Click the Message Box in fee master$")
    public void click_the_message_box_in_fee_master() throws Throwable {
 	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_MessageInbox(), 30, 5);
 	  feeMstObj.FeeMaster_MessageInbox().click();
    }
    @And("^Verify the back button$")
    public void verify_the_back_button() throws Throwable {
    	action.getJavascriptHelper().scrollIntoView(feeMstObj.BackButton());
  	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.BackButton(), 30, 5);
  	 feeMstObj.BackButton().click();

    }
    @Then("^To verify the red astriek mark on all the mandatory fields in fee master$")
    public void to_verify_the_red_astriek_mark_on_all_the_mandatory_fields_in_fee_master() throws Throwable {
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Description");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Charge Type");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Charge Flag");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Due Code");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Legacy Code1");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Legacy Code2");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("GST Applicable State");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Is Tax Allowed");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Tax Calculation Method");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Include In APR");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Amortize");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Deduct");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Upfront");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Status");
    	mandateOrNot.verifyGivenFieldisMandatoryOrNot("Remarks");
    }
    @And("^Verify the back button in tax fee master$")
    public void verify_the_back_button_in_tax_fee_master() throws Throwable {
    	action.getJavascriptHelper().scrollIntoView(feeMstObj.FeeMaster_TaxBack());
   	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TaxBack(), 30, 5);
    	feeMstObj.FeeMaster_TaxBack().click();
    }
    
    ////////**********INVAILD DATA*******************//////////////
    
    @And("^Verify the fee master with invalid data$")
    public void verify_the_fee_master_with_invalid_data() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Legacy1Code(), 30, 5);
    	   feeMstObj.FeeMaster_Legacy1Code().click();
    	   feeMstObj.FeeMaster_Legacy1Code().sendKeys("$#@^&");
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
    @And("^Verify the fee master with blank field$")
    public void verify_the_fee_master_with_blank_field() throws Throwable {
    	WebElement nameErrorMessage = driver.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]"));
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
    ///**************Active/Inactive********///
    @Then("^Click the temp view button in fee master$")
    public void click_the_temp_view_button_in_fee_master() throws Throwable {
  	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TempViewButton(), 30, 5);
  	 feeMstObj.FeeMaster_TempViewButton().click();
    }

    @Then("^Change the status in a fee master$")
    public void change_the_status_in_a_fee_master() throws Throwable {
    	for (int i = 0; i <20; i++) {
			try {
				action.getJavascriptHelper().scrollIntoView(feeMstObj.FeeMaster_Statusbutton());
			} catch (NoSuchElementException e) {
				
			}
		}
    	
  	   action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, feeMstObj.FeeMaster_Statusbutton(), 30, 2);
  	 feeMstObj.FeeMaster_Statusbutton().click();
    	 
      	 }

    @And("^Click the tempview pencil icon in fee master$")
    public void click_the_tempview_pencil_icon_in_fee_master() throws Throwable {
    	 waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TempViewPencil(), 30, 5);
      	 feeMstObj.FeeMaster_TempViewPencil().click();    
      	 }
  


   }

