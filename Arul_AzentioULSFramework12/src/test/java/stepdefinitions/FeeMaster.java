package stepdefinitions;

import java.util.Iterator;
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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.FeeMasterObject;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class FeeMaster extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	FeeMasterObject feeMstObj = new FeeMasterObject(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	//FeeMasterTestData feeMasterData = jconfig.getFeeMasterByName("Maker");
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);
	JavascriptHelper javahelper = new JavascriptHelper(driver);
	//FindFieldisMandatoryorNot mandateOrNot= new FindFieldisMandatoryorNot(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign0902.xlsx","FeeMaster","Data Set ID");
	Map<String, String> testData;
	
	@Given("^Get the URL and login as maker$")
	public void get_the_url_and_login_as_maker() throws Throwable {
		//String kulsApplicationUrl = configFileRead.getApplicationUrl();
		//driver.get(kulsApplicationUrl);
		ExcelData excelData = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign0102.xlsx","LoginCredentilas","Stage");
        Map<String, String> testdata = excelData.getTestdata("Maker1");
        String kulsApplicationUrl = configFileRead.getApplicationTransactionUrl();
        driver.get(kulsApplicationUrl);
        login.loginUlsApplicationAsMaker(testdata.get("Username"),testdata.get("Password"));
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
        		feeMstObj.ModuleName(), 10, 2);
        feeMstObj.ModuleName().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				feeMstObj.LOS(), 10, 2);
		feeMstObj.LOS().click();
	}
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
    @And("^Click on Save icon to update Fee master record$")
    public void click_on_save_icon_to_update_fee_master_record() throws Throwable {
    	//javahelper.scrollIntoView(feeMstObj.FeeMaster_Update());
    	
 	   for (int i = 0; i < 200; i++) {
		try {
			
			javahelper.scrollIntoView(feeMstObj.FeeMaster_Update());
			javahelper.JSEClick(feeMstObj.FeeMaster_Update());
			break;
		} catch (Exception e) {
			if(i==199) {
			Assert.fail(e.getMessage());
		}
		}
	}
 	   
 	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_SavePopUp(), 30, 5);
 	  String Popup= feeMstObj.FeeMaster_SavePopUp().getText();
 	   Assert.assertTrue(Popup.contains("Success"));
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
 	    	  // driver.findElement(By.xpath("//div[contains(text(),'"+feeMasterData.AvailableTax+"')]")).click();
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
    	 //  feeMstObj.FeeMaster_TaxTab_Remark().sendKeys(feeMasterData.TaxRemark);
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
    	//action.getJavascriptHelper().scrollIntoView(feeMstObj.BackButton());
  	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.BackButton(), 30, 5);
  	 feeMstObj.BackButton().click();

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
    
    @And("^Update the value in desription field$")
    public void update_the_value_in_desription_field() throws Throwable {
       waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_ChargeDescription(), 30, 5);
 	   feeMstObj.FeeMaster_ChargeDescription().click();
 	   feeMstObj.FeeMaster_ChargeDescription().clear();
 	   feeMstObj.FeeMaster_ChargeDescription().sendKeys(testData.get("Updated Description"));
    }

    @And("^Update the value in Charge type field$")
    public void update_the_value_in_charge_type_field() throws Throwable {
    	Thread.sleep(2000);
 	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_ChargeType(), 30, 5);
 	   feeMstObj.FeeMaster_ChargeType().click();
 	   String xpath="//ion-label[contains(text(),'"+testData.get("Updated Charge Type")+"')]/following-sibling::ion-radio";
 	   for (int i = 0; i <30; i++) {
 	   try {
 		   driver.findElement(By.xpath(xpath)).click();
 	      	   break;
 	   }
 	   catch(Exception e) {
 	   }}
 	   }

    @And("^Update the value in charge flag field$")
    public void update_the_value_in_charge_flag_field() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_ChargeFlag(), 30, 5);
 	   feeMstObj.FeeMaster_ChargeFlag().click();
 	   String xpath="//ion-label[contains(text(),'"+testData.get("Updated Charge Flag")+"')]/following-sibling::ion-radio";
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

    @And("^Update the value in Due code field$")
    public void update_the_value_in_due_code_field() throws Throwable {
       waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_DueCode(), 30, 5);
 	   feeMstObj.FeeMaster_DueCode().click();
 	   String xpath="//ion-label[contains(text(),'"+testData.get("Updated Due Code")+"')]/following-sibling::ion-radio";

 	   for (int i = 0; i <30; i++) {
			try {
		driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
			}}
    }

    @And("^Update the value in Legacy code1$")
    public void update_the_value_in_legacy_code1() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Legacy1Code(), 30, 5);
 	   for (int i = 0; i < 10; i++) {
			try {
 	   feeMstObj.FeeMaster_Legacy1Code().click();
 	  feeMstObj.FeeMaster_Legacy1Code().clear();
 	   feeMstObj.FeeMaster_Legacy1Code().sendKeys(testData.get("Updated Legacy Code1"));
 	   break;
			}
			catch(Exception e) {
 }}
    }

    @And("^Update the value in Legacy code2$")
    public void update_the_value_in_legacy_code2() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Legacy2Code(), 30, 5);
  	  for (int i = 0; i <10; i++) {
			try {
  	   feeMstObj.FeeMaster_Legacy2Code().click();
  	   feeMstObj.FeeMaster_Legacy2Code().clear();
  	   feeMstObj.FeeMaster_Legacy2Code().sendKeys(testData.get("Updated Legacy Code2"));
  	   break;
  }
  	  catch(Exception e) {
  	  }}
    }

    @And("^Update the value in GST applicable state$")
    public void update_the_value_in_gst_applicable_state() throws Throwable {
       waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_GSTApplicableState(), 30, 5);
 	   feeMstObj.FeeMaster_GSTApplicableState().click();
  	   String xpath="//ion-label[contains(text(),'"+testData.get("Updated GST Applicable State")+"')]/following-sibling::ion-radio";

 	   for (int i = 0; i < 30; i++) {
			try {
		driver.findElement(By.xpath(xpath)).click();
		break;
			}
			catch(Exception e) {
			}
			}
    }

    @And("^update the value in tax calculation method field$")
    public void update_the_value_in_tax_calculation_method_field() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_TaxCalculationMethod(), 30, 5);
 	   feeMstObj.FeeMaster_TaxCalculationMethod().click();
 	   String xpath="//ion-label[contains(text(),'"+testData.get("Updated Tax Calculation Method")+"')]/following-sibling::ion-radio";
 	   for (int i = 0; i < 10; i++) {
			try {
	driver.findElement(By.xpath(xpath)).click();
			break;
		}
			catch(Exception e) {
			}}
    }

    @And("^Update the value in Amortize field$")
    public void update_the_value_in_amortize_field() throws Throwable {
    	System.out.println(testData.get("Update Amortize"));
       waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Amortize(), 30, 5);
 	   feeMstObj.FeeMaster_Amortize().click();
	   String xpath="//ion-label[contains(text(),'"+testData.get("Update Amortize")+"')]/following-sibling::ion-radio";

 	   for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			break;
	}
			catch(Exception e) {
			}
			}
    }

    @And("^Update the value in Deduct field$")
    public void update_the_value_in_deduct_field() throws Throwable {
       waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Deduct(), 30, 5);
 	   feeMstObj.FeeMaster_Deduct().click();
  	   String xpath="//ion-label[contains(text(),'"+testData.get("Updated Deduct")+"')]/following-sibling::ion-radio";
 	   for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			}
			catch(Exception e) {
			}
			}
    }

    @And("^Update the value in upfront field$")
    public void update_the_value_in_upfront_field() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Upfront(), 30, 5);
 	   feeMstObj.FeeMaster_Upfront().click();
 	   String xpath="//ion-label[contains(text(),'"+testData.get("Updated Upfront")+"')]/following-sibling::ion-radio";
 	   for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
			}}
    }

    @And("^Update the value in amort rate method field$")
    public void update_the_value_in_amort_rate_method_field() throws Throwable {
    	System.out.println(testData.get("Updated Amort Rate Method"));
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, feeMstObj.FeeMaster_AmortRate(), 30, 2);
    	feeMstObj.FeeMaster_AmortRate().click();
    	String xpath="//ion-label[contains(text(),'"+testData.get("Updated Amort Rate Method")+"')]/following-sibling::ion-radio";
   	   for (int i = 0; i < 200; i++) {
			try {
		    	   driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
				if (i==199) {
					Assert.fail("Amort rate method not selected");
				}
				
			}}
    }

    @And("^Update the value in fee amort tenure method field$")
    public void update_the_value_in_fee_amort_tenure_method_field() throws Throwable {
    	Thread.sleep(2000);
 	   action.getJavascriptHelper().scrollIntoView(feeMstObj.FeeMaster_AmortTenure());
 	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_AmortTenure(), 30, 5);
 	   feeMstObj.FeeMaster_AmortTenure().click();
 	   String xpath="//ion-label[contains(text(),'"+testData.get("Updated Amort Tenure(Method)")+"')]/following-sibling::ion-radio";

 	   for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
			}}
    }

    @And("^Update the value in charge amount recovery field$")
    public void update_the_value_in_charge_amount_recovery_field() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_ChargeAmountRecovery(), 30, 5);
 	   feeMstObj.FeeMaster_ChargeAmountRecovery().click();
 	   String xpath="//ion-label[contains(text(),'"+testData.get("Updated Amount Recovery")+"')]/following-sibling::ion-radio";
 	   for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
			}}
    }

    @And("^Update the value in fee amort frequency field$")
    public void update_the_value_in_fee_amort_frequency_field() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_AmountFrequency(), 30, 5);
 	   feeMstObj.FeeMaster_AmountFrequency().click();
 	   String xpath="//ion-label[contains(text(),'"+testData.get("Updated Amort Frequency")+"')]/following-sibling::ion-radio";

 	   for (int i = 0; i < 30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			break;
			}
			catch(Exception e) {
			}}
    }

    @And("^Update the value in Remarks field$")
    public void update_the_value_in_remarks_field() throws Throwable {
       action.getJavascriptHelper().scrollIntoView(feeMstObj.FeeMaster_Remark());
 	   waitHelper.waitForElementToVisibleWithFluentWait(driver,  feeMstObj.FeeMaster_Remark(), 30, 5);
 	   feeMstObj.FeeMaster_Remark().click();
 	  feeMstObj.FeeMaster_Remark().clear();
 	   feeMstObj.FeeMaster_Remark().sendKeys(testData.get("Updated Remarks"));
    }
    @And("^Update test data for fee master test case no5$")
    public void update_test_data_for_fee_master_test_case_no5() throws Throwable {
    	testData=excelData.getTestdata("AT-FM-T005-D1");
    }
    @Then("^Submit the fee master record from maker user$")
    public void submit_the_fee_master_record_from_maker_user() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				feeMstObj.BounceMasterMaker_Submit(), 10, 2);
		feeMstObj.BounceMasterMaker_Submit().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				feeMstObj.BounceMaster_EnterRemark(), 10, 2);
		feeMstObj.BounceMaster_EnterRemark().click();
		feeMstObj.BounceMaster_EnterRemark().sendKeys(testData.get("EnterRemarks"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				feeMstObj.BounceMasterRemarkSubmit(), 10, 2);
		feeMstObj.BounceMasterRemarkSubmit().click();
    }

    @And("^Click on Mail icon for Fee master$")
    public void click_on_mail_icon_for_fee_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				feeMstObj.BounceMasterInbox(), 10, 2);
		feeMstObj.BounceMasterInbox().click();
    }

    @And("^Search the respictive fee master record$")
    public void search_the_respictive_fee_master_record() throws Throwable {
    	for (int i = 0; i < 20; i++) {
			try {
				// seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
				feeMstObj.BounceMasterInboxView_Search().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				feeMstObj.BounceMasterInboxView_SearchText(), 10, 2);
		feeMstObj.BounceMasterInboxView_SearchText().click();
		feeMstObj.BounceMasterInboxView_SearchText().sendKeys(testData.get("SearchValueInInbox"));
    }

    @And("^Store the reference number and click on first fee master record$")
    public void store_the_reference_number_and_click_on_first_fee_master_record() throws Throwable {
    	String reference = null;
		for (int i = 0; i < 200; i++) {
			try {
				reference = feeMstObj.BounceMasterReferanceId().getText();
				break;
			} catch (Exception e) {

			}
		}
		json.addReferanceData(reference);
		System.out.println(reference);

		for (int i = 0; i < 20; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
    }

    @And("^User Capture Checker id from the submit popup for fee Master$")
    public void user_capture_checker_id_from_the_submit_popup_for_fee_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				feeMstObj.BounceMaster_Checker_Id(), 10, 3);
		String CheckerId = feeMstObj.BounceMaster_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		json.addData(popupID);
		System.out.println(popupID);
    }
    @And("^Click on Temp view of Fee master$")
    public void click_on_temp_view_of_fee_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
    			feeMstObj.tempViewOfFeeMaster(), 10, 2);
    	feeMstObj.tempViewOfFeeMaster().click();
		Thread.sleep(2000);
    }
    @And("^Validate the view summary of Fee master$")
    public void validate_the_view_summary_of_fee_master() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
    			feeMstObj.viewSummaryIconOfBounceMaster(), 10, 2);
		seleniumactions.getJavascriptHelper().JSEClick(feeMstObj.viewSummaryIconOfBounceMaster());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				feeMstObj.viewSummaryPageOfBounceMaster(), 10, 2);
		Assert.assertEquals(feeMstObj.viewSummaryPageOfBounceMaster().isDisplayed(), true);
    }


   }

