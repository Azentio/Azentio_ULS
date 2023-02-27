package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ChargeMasterObject;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.Charge_Master_Testdata;
import testDataType.KULS_Login_TestDataType;

public class Charge_Master {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper click = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Charge_Master_Testdata chargedata = jsonConfig.getchargemasterListByName("Maker");
	ChargeMasterObject chargeObj = new ChargeMasterObject(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00073\\Downloads\\UlsTestDataDesign.xlsx","ChargeMaster","Data Set ID");
	Map<String, String> testData;


	@When("^user click product Definitions up menu$")
	public void user_click_product_definitions_up_menu() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.productDefinitions(), 60, 2);
		chargeObj.productDefinitions().click();
	}

	@And("^user click on Charge Master Eye icon$")
	public void user_click_on_charge_master_eye_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_EyeIcon(), 60, 2);
		chargeObj.ChargeMaster_EyeIcon().click();
	}

	@And("^user click on Add icon$")
	public void user_click_on_add_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_AddButton(), 60, 2);
		chargeObj.ChargeMaster_AddButton().click();
	}

	@And("^user Enter the charge fields and verify the values$")
	public void user_enter_the_charge_fields_and_verify_the_values() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Charge");
		//waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_ChargeDropDown(), 60, 2);
		chargeObj.ChargeMaster_ChargeDropDown().isDisplayed();
		chargeObj.ChargeMaster_ChargeDropDown().click();
    	testData = excelData.getTestdata("AT-CM-T001_D1");
        System.out.println(testData.get("DateUnit"));
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath(
						"//ion-label[contains(text(), '" +testData.get("Charge")+ "')]/following-sibling::ion-radio"))
						.click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the charge Description field and verify it$")
	public void user_enter_the_charge_description_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_Description(), 60, 2);
		chargeObj.ChargeMaster_Description().isDisplayed();
		chargeObj.ChargeMaster_Description().click();
    	testData = excelData.getTestdata("AT-CM-T001_D1");
		chargeObj.ChargeMaster_Description().sendKeys(testData.get("Description"));
	}

	@And("^user Enter the Calculation Type field and verify the values$")
	public void user_enter_the_calculation_type_field_and_verify_the_values() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Calculation Type");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_Description(), 60, 2);
		chargeObj.ChargeMaster_CalculationTypeDropDown().isDisplayed();
		chargeObj.ChargeMaster_CalculationTypeDropDown().click();
    	testData = excelData.getTestdata("AT-CM-T001_D1");

		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(), '" +testData.get("CalculationType")+ "')]/following-sibling::ion-radio")).click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the Flat Amount field and verify it$")
	public void user_enter_the_flat_amount_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Flat Amount");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_FlatAmount(), 60, 2);
		chargeObj.ChargeMaster_FlatAmount().isDisplayed();
		chargeObj.ChargeMaster_FlatAmount().click();
    	testData = excelData.getTestdata("AT-CM-T001_D1");

		chargeObj.ChargeMaster_FlatAmount().sendKeys(testData.get("FlatAmount"));
	}

	@And("^user Enter the Percentage field and verify it$")
	public void user_enter_the_percentage_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Percentage");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_Percentage(), 60, 2);
		chargeObj.ChargeMaster_Percentage().isDisplayed();
		chargeObj.ChargeMaster_Percentage().click();
		chargeObj.ChargeMaster_Percentage().sendKeys(testData.get("Percentage"));
	}

	@And("^user Enter the Calculated On field and verify it$")
	public void user_enter_the_calculated_on_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Calculated On");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CalcutedOnDropDown(), 60, 2);
		chargeObj.ChargeMaster_CalcutedOnDropDown().isDisplayed();
		chargeObj.ChargeMaster_CalcutedOnDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(), '" +testData.get("CalculatedOn")+ "')]/following-sibling::ion-radio")).click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the Rec pay field and verify it$")
	public void user_enter_the_rec_pay_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Rec/Pay");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_RecPayDropDown(), 60, 2);
		chargeObj.ChargeMaster_RecPayDropDown().isDisplayed();
		chargeObj.ChargeMaster_RecPayDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath(
						"//ion-label[contains(text(), '" +testData.get("Rec_Pay")+ "')]/following-sibling::ion-radio"))
						.click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the Include In cust IRR and verify it$")
	public void user_enter_the_include_in_cust_irr_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("IncludeInCustIRR");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_IncludeInCustIRRDropDown(), 60,
				2);
		chargeObj.ChargeMaster_IncludeInCustIRRDropDown().isDisplayed();
		chargeObj.ChargeMaster_IncludeInCustIRRDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(), '" +testData.get("IncludeInBankIRR")+ "')]/following-sibling::ion-radio")).click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the Include In Bank IRR and verify it$")
	public void user_enter_the_include_in_bank_irr_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("IncludeInBankIRR");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_IncludeInBankIRRDropDown(), 60,
				2);
		chargeObj.ChargeMaster_IncludeInBankIRRDropDown().isDisplayed();
		chargeObj.ChargeMaster_IncludeInBankIRRDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(), '" +testData.get("IncludeInCustIRR")+ "')]/following-sibling::ion-radio")).click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the Level field and verify it$")
	public void user_enter_the_level_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Level");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_LevelDropDown(), 60, 2);
		chargeObj.ChargeMaster_LevelDropDown().isDisplayed();
		chargeObj.ChargeMaster_LevelDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath(
						"//ion-label[contains(text(), '" +testData.get("Level")+ "')]/following-sibling::ion-radio"))
						.click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the currency field and verify it$")
	public void user_enter_the_currency_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Currency");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CurrencyDropDown(), 60, 2);
		chargeObj.ChargeMaster_CurrencyDropDown().isDisplayed();
		chargeObj.ChargeMaster_CurrencyDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath(
						"//ion-label[contains(text(), '" +testData.get("Currency")+ "')]/following-sibling::ion-radio"))
						.click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the Event field and verify it$")
	public void user_enter_the_event_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Event");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_EventDropDown(), 60, 2);
		chargeObj.ChargeMaster_EventDropDown().isDisplayed();
		Thread.sleep(1000);
		chargeObj.ChargeMaster_EventDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath(
						"//ion-label[contains(text(), '" +testData.get("Event")+ "')]/following-sibling::ion-radio"))
						.click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the Date Unit and verify it$")
	public void user_enter_the_date_unit_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Date Unit");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_DateUnitDropDown(), 60, 2);
		chargeObj.ChargeMaster_DateUnitDropDown().isDisplayed();
		chargeObj.ChargeMaster_DateUnitDropDown().click();
		System.out.println(testData.get("DateUnit").trim());
		String xpath="//ion-label[contains(text(),'"+testData.get("DateUnit").trim()+"')]/following-sibling::ion-radio";
		for (int i = 0; i < 100; i++) {
			try {
//				 javaHelper.JSEClick(driver.findElement(By.xpath(xpath)));
				javaHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				click.moveToElement(driver.findElement(By.xpath(xpath)));
				click.clickUsingActionClass(driver.findElement(By.xpath(xpath)), driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if(i==100)
				{
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user Enter the Date value and verify it$")
	public void user_enter_the_date_value_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Date Value");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_DateValue(), 60, 2);
		chargeObj.ChargeMaster_DateValue().isDisplayed();
		chargeObj.ChargeMaster_DateValue().click();
		for (int i = 0; i < 100; i++) {
			try {
		chargeObj.ChargeMaster_DateValue().sendKeys(testData.get("DateValue"));
		break;
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the charge count and verify it$")
	public void user_enter_the_charge_count_and_verify_it() throws Throwable {
		javaHelper.scrollIntoView(chargeObj.ChargeMaster_ChargeCount());
		verifyfield.verifyGivenFieldisMandatoryOrNot("Charge Count");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_ChargeCount(), 60, 2);
		chargeObj.ChargeMaster_ChargeCount().isDisplayed();
		chargeObj.ChargeMaster_ChargeCount().click();
		chargeObj.ChargeMaster_ChargeCount().sendKeys(testData.get("ChargeCount"));
	}

	@And("^user Enter the Allow Edit and verify it$")
	public void user_enter_the_allow_edit_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Allow Edit");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_AllowEditDropDown(), 60, 2);
		chargeObj.ChargeMaster_AllowEditDropDown().isDisplayed();
		chargeObj.ChargeMaster_AllowEditDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath(
						"//ion-label[contains(text(), '" +testData.get("AllowEdit")+ "')]/following-sibling::ion-radio"))
						.click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the Accounting type and verify it$")
	public void user_enter_the_accounting_type_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Accounting Type");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_AccountingTypeDropDown(), 60,
				2);
		chargeObj.ChargeMaster_AccountingTypeDropDown().isDisplayed();
		chargeObj.ChargeMaster_AccountingTypeDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(), '" + testData.get("AccountingType")+ "')]/following-sibling::ion-radio")).click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the Rule field and verify it$")
	public void user_enter_the_rule_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Rule");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_RuleDropDown(), 60, 2);
		chargeObj.ChargeMaster_RuleDropDown().isDisplayed();
		chargeObj.ChargeMaster_RuleDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By
						.xpath("//ion-label[contains(text(), '" +testData.get("Rule")+ "')]/following-sibling::ion-radio"))
						.click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user Enter the Remarks field and verify it$")
	public void user_enter_the_remarks_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Remarks");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_Remarks(), 60, 2);
		chargeObj.ChargeMaster_Remarks().isDisplayed();
		chargeObj.ChargeMaster_Remarks().click();
		chargeObj.ChargeMaster_Remarks().sendKeys(testData.get("Remark"));
	}

	@Then("^user Save the charge master Record$")
	public void user_save_the_charge_master_record() throws Throwable {
		javaHelper.scrollIntoView(chargeObj.ChargeMaster_SaveButton());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_SaveButton(), 60, 2);
		chargeObj.ChargeMaster_SaveButton().click();
		//waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.SaveSuccess_alert(), 60, 2);
		//String Toast = chargeObj.SaveSuccess_alert().getText();
		//System.out.println(Toast);
		//Assert.assertEquals(Toast, "success");
	}

	@And("^user Goto the Temp view screen$")
	public void user_goto_the_temp_view_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_tempviewIcon(), 60, 2);
		chargeObj.ChargeMaster_tempviewIcon().click();
	}

	@And("^user click on First Edit icon$")
	public void user_click_on_first_edit_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMst_TempView_Edit(), 60, 2);
		chargeObj.ChargeMst_TempView_Edit().click();
	}

	@And("^user click on charge slab details add icon$")
	public void user_click_on_charge_slab_details_add_icon() throws Throwable {
		Thread.sleep(2000);
		javaHelper.scrollIntoView(chargeObj.ChargeMaster_chargeslab_add());
		for (int i = 0; i < 100; i++) {
			try {
				//waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_chargeslab_add(), 60,2);
				
				chargeObj.ChargeMaster_chargeslab_add().click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user verify the Calculated Type fields$")
	public void user_verify_the_calculated_type_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Calculated Type");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_CalculatedTypeDropDown(), 60, 2);
		chargeObj.ChargeSlab_CalculatedTypeDropDown().isDisplayed();
		chargeObj.ChargeSlab_CalculatedTypeDropDown().click();
	}

	@And("^user verify the below fields$")
	public void user_verify_the_below_fields() throws Throwable {

		List<WebElement> calculationTypeFields = driver
				.findElements(By.xpath("//ion-radio/parent::ion-item//ion-label"));

		for (WebElement element : calculationTypeFields) {

			switch (element.getText()) {
			case "Flat Amount":
				System.out.println("dropdown value is" + element.getText());
				break;
			case "Maximum of Slab/Percent/Flat":
				System.out.println("dropdown value is" + element.getText());
				break;
			case "Minimum of Slab/Percent/Flat":
				System.out.println("dropdown value is" + element.getText());
				break;
			case "Percentage":
				System.out.println("dropdown value is" + element.getText());
				break;
			case "Slab":
				System.out.println("dropdown value is" + element.getText());
				break;
			default:
				if (!(element.getText().equalsIgnoreCase("Select"))) {
					Assert.fail("Test case failed due to " + element.getText()
							+ " is not available in the dropdown options");
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver, driver.findElement(
				By.xpath("//ion-label[contains(text(),'Flat Amount')]/following-sibling::ion-radio")), 60, 2);
		driver.findElement(By.xpath("//ion-label[contains(text(),'Flat Amount')]/following-sibling::ion-radio"))
				.click();

	}

	@And("^user verify the min slab Amount fields$")
	public void user_verify_the_min_slab_amount_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Min Slab Amount");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_MinSlabAmount(), 60, 2);
		chargeObj.ChargeSlab_MinSlabAmount().click();
		chargeObj.ChargeSlab_MinSlabAmount().isDisplayed();

	}

	@And("^user verify the max slab Amount fields$")
	public void user_verify_the_max_slab_amount_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Max Slab Amount");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_MaxSlabAmount(), 60, 2);
		chargeObj.ChargeSlab_MaxSlabAmount().isDisplayed();
		// chargeObj.ChargeSlab_MaxSlabAmount().click();
	}

	@And("^user verify the Amount fields$")
	public void user_verify_the_amount_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Amount");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_Amount(), 60, 2);
		chargeObj.ChargeSlab_Amount().isDisplayed();
	}

	@And("^user verify the Rate fields$")
	public void user_verify_the_rate_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Rate");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_Rate(), 60, 2);
		chargeObj.ChargeSlab_Rate().isDisplayed();
	}

	@And("^user verify the currency fields$")
	public void user_verify_the_currency_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Currency");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_CurrencyDropDown(), 60, 2);
		chargeObj.ChargeSlab_CurrencyDropDown().isDisplayed();
		chargeObj.ChargeSlab_CurrencyDropDown().click();

		List<WebElement> calculationTypeFields = driver
				.findElements(By.xpath("//ion-radio/parent::ion-item//ion-label"));

		for (WebElement element : calculationTypeFields) {
			javaHelper.scrollIntoView(element);
			switch (element.getText()) {
			case "AZ":
				System.out.println("dropdown value is" + element.getText());
				break;
			case "INR":
				System.out.println("dropdown value is" + element.getText());
				break;
			case "Dinar":
				System.out.println("dropdown value is" + element.getText());
				break;
			case "Singapore dollar":
				System.out.println("dropdown value is" + element.getText());
				break;
			case "USD":
				System.out.println("dropdown value is" + element.getText());
				break;
			//case "PHP":
				//System.out.println("dropdown value is" + element.getText());
				//break;
			//case "TZS":

				//System.out.println("dropdown value is" + element.getText());
				//break;
			//case "SAR":
			//	System.out.println("dropdown value is" + element.getText());
			//	break;
			//case "Mongolian Tugrug":
			//	System.out.println("dropdown value is" + element.getText());
			//	break;
			//case "USD":
			//	System.out.println("dropdown value is" + element.getText());
			//	break;
			//case "DY":
				//System.out.println("dropdown value is" + element.getText());
				//break;
			default:
				if (!(element.getText().equalsIgnoreCase("Select"))) {
					Assert.fail("Test case failed due to " + element.getText()
							+ " is not available in the dropdown options");
				}
			}
		}
		
		//for (int i = 0; i <50; i++) {
		//	
			//try {
			//	javaHelper.scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'TZS')]/following-sibling::ion-radio")));
				//waitHelper.waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath("//ion-label[contains(text(),'USD')]/following-sibling::ion-radio")), 60, 2);
				//WebElement currency= driver.findElement(By.xpath("//ion-label[contains(text(),'TZS')]/following-sibling::ion-radio"));
				//currency.click();
				//break;
			//}
			//catch(Exception e) {
				
			//}
		//}

	}
	@And("^user verify the currency field$")
	public void user_verify_the_currency_field() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Currency");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_CurrencyDropDown(), 60, 2);
		chargeObj.ChargeSlab_CurrencyDropDown().isDisplayed();
		chargeObj.ChargeSlab_CurrencyDropDown().click();
		for (int i = 0; i < 100; i++) {
			try {

				driver.findElement(By.xpath(
						"//ion-label[contains(text(), '" +testData.get("Slab_Currency")+ "')]/following-sibling::ion-radio"))
						.click();
			} catch (Exception e) {
			}
		}
	}

	@And("^user verify the Remarks fields$")
	public void user_verify_the_remarks_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Remarks");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_Remarks(), 60, 2);
		chargeObj.ChargeSlab_Remarks().isDisplayed();
	}

	@And("^user click on save button and verify it$")
	public void user_click_on_save_button_and_verify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_SaveButton(), 60, 2);
		chargeObj.ChargeSlab_SaveButton().isDisplayed();
		chargeObj.ChargeSlab_SaveButton().click();
	}

	@And("^user click on Back button and verify it$")
	public void user_click_on_back_button_and_verify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_BackButton(), 60, 2);
		chargeObj.ChargeSlab_BackButton().isDisplayed();
		chargeObj.ChargeSlab_BackButton().click();
	}

	@And("^user verify the min slab Amount field$")
	public void user_verify_the_min_slab_amount_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_MinSlabAmount(), 60, 2);
		chargeObj.ChargeSlab_MinSlabAmount().isDisplayed();
		chargeObj.ChargeSlab_MinSlabAmount().click();
		chargeObj.ChargeSlab_MinSlabAmount().sendKeys(testData.get("Slab_MinSlabAmount"));
	}

	@And("^user verify the max slab Amount field$")
	public void user_verify_the_max_slab_amount_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_MaxSlabAmount(), 60, 2);
		chargeObj.ChargeSlab_MaxSlabAmount().isDisplayed();
		chargeObj.ChargeSlab_MaxSlabAmount().click();
		chargeObj.ChargeSlab_MaxSlabAmount().sendKeys(testData.get("Slab_MaxSlabAmount"));
	}

	@And("^user verify the Amount field$")
	public void user_verify_the_amount_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_Amount(), 60, 2);
		chargeObj.ChargeSlab_Amount().isDisplayed();
		chargeObj.ChargeSlab_Amount().sendKeys(testData.get("Slab_Amount"));
	}

	@And("^user verify the Rate field$")
	public void user_verify_the_rate_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_Rate(), 60, 2);
		chargeObj.ChargeSlab_Rate().isDisplayed();
		chargeObj.ChargeSlab_Rate().click();
		chargeObj.ChargeSlab_Rate().sendKeys(testData.get("Slab_Rate"));
	}

	@And("^user verify the Remarks field$")
	public void user_verify_the_remarks_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_Remarks(), 60, 2);
		chargeObj.ChargeSlab_Remarks().isDisplayed();
		chargeObj.ChargeSlab_Remarks().click();

	}

	@And("^user click on chargeslab edit button$")
	public void user_click_on_chargeslab_edit_button() throws Throwable {
		Thread.sleep(2000);
		javaHelper.scrollIntoView(chargeObj.ChargeSlab_Edit());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_Edit(), 60, 2);
		chargeObj.ChargeSlab_Edit().click();
	}

	@And("^user inactive the Record and update the Record$")
	public void user_inactive_the_record_and_update_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeSlab_Status(), 60, 2);
		chargeObj.ChargeSlab_Status().click();
		Thread.sleep(2000);
	}
	 @And("^user click on Update button and verify it$")
	    public void user_click_on_update_button_and_verify_it() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.Chargeslab_UpdateButton(), 60, 2);
			chargeObj.Chargeslab_UpdateButton().click();
	    }
	
	//*********Validation*************///
	
    @Then("^user Save the charge master Records$")
    public void user_save_the_charge_master_records() throws Throwable {
    	javaHelper.scrollIntoView(chargeObj.ChargeMaster_SaveButton());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_SaveButton(), 60, 2);
		chargeObj.ChargeMaster_SaveButton().click();
    }
    
	@And("^validate the required field in a charge master$")
    public void validate_the_required_field_in_a_charge_master() throws Throwable {
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
        Assert.assertEquals(actualErrorText, "Required field");if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
            System.out.println(
                    "The actual and expected result are same.The Popup validation message is" + actualErrorText);
        } else {
            System.out.println(
                    "The actual and expected result are not same.The Popup validation message is" + actualErrorText);
        }
        Assert.assertEquals(actualErrorText, "Required field");
	}
	@Then("^validate with invalid details in charge master$")
    public void validate_with_invalid_details_in_charge_master() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_Percentage(), 60, 2);
        chargeObj.ChargeMaster_Percentage().click();
        chargeObj.ChargeMaster_Percentage().sendKeys("200");
       // waitHelper.waitForElementToVisibleWithFluentWait(driver,  driver.findElement(By.xpath("//ion-badge[contains(text(),' Maximum Percentage allowed is 100')]")), 60, 2);
        WebElement errorPopUp = driver.findElement(By.xpath("//ion-badge[contains(text(),' Maximum Percentage allowed is 100')]"));
        String expectedErrorText = "Maximum Percentage allowed is 100";
        String actualErrorText = errorPopUp.getText();
        if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
            System.out.println("The system was not allow the record to save as we enter the invalid details.The Popup validation message is" + actualErrorText);
        } else {
            System.out.println("The actual and expected result are not same.The Popup validation message is" + actualErrorText);
        }
        Assert.assertEquals(actualErrorText, "Maximum Percentage allowed is 100");
               
	}
	  @Then("^click the inbox in charge master$")
	    public void click_the_inbox_in_charge_master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_Inbox(), 60, 2);
			chargeObj.ChargeMaster_Inbox().click();
	  }

	    @Then("^Get the reference id and store it in a excel in charge master$")
	    public void get_the_reference_id_and_store_it_in_a_excel_in_charge_master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_GetRefId(), 60, 2);
	    	String RefId = chargeObj.ChargeMaster_GetRefId().getText();
			excelData.updateTestData("AT-CM-T001_D1", "Reference ID", RefId);
			System.out.println(RefId);
	    }
	    @Then("^Get the reference id and store it in a excel in charge master reject$")
	    public void get_the_reference_id_and_store_it_in_a_excel_in_charge_master_reject() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_GetRefId(), 60, 2);
	    	String RefId = chargeObj.ChargeMaster_GetRefId().getText();
			excelData.updateTestData("AT-CM-T001_D2", "Reference ID", RefId);
			System.out.println(RefId);
	    }
	    @Then("^Get the reference id and store it in a excel in charge master return$")
	    public void get_the_reference_id_and_store_it_in_a_excel_in_charge_master_return() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_GetRefId(), 60, 2);
	    	String RefId = chargeObj.ChargeMaster_GetRefId().getText();
			excelData.updateTestData("AT-CM-T001_D3", "Reference ID", RefId);
			System.out.println(RefId);
	    }
	    @Then("^Submit the record for checker approval in charge master$")
	    public void submit_the_record_for_checker_approval_in_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_SubmitButton(), 60, 2);
	    	chargeObj.ChargeMaster_SubmitButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_SubmitOKButton(), 60, 2);
			chargeObj.ChargeMaster_SubmitOKButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_FinalSubmitButton(), 60,
					2);
			chargeObj.ChargeMaster_FinalSubmitButton().click();
			Thread.sleep(4000);
			// waitHelper.waitForElementToVisibleWithFluentWait(driver,
			// depositMstObj.DepositAccount_CheckerId(), 60, 2);
			
	    }
	    @And("^Get the checker id and store it in a excel in charge master$")
	    public void get_the_checker_id_and_store_it_in_a_excel_in_charge_master() throws Throwable {
	    	String CheckerId = null;
			for (int i = 0; i < 30; i++) {
				try {
					CheckerId = chargeObj.ChargeMaster_CheckerId().getText();
					System.out.println(CheckerId);
					break;
				} catch (Exception e) {

				}
				
			}

			System.out.println(CheckerId);
			String Space = " ";
			String split[] = CheckerId.split(" ");
			Space = split[split.length - 1];
			String popupID = Space.replaceAll("[/.]", "");
		    excelData.updateTestData("AT-CM-T001_D1","Checker id",popupID);
			System.out.println(popupID);
			// json.addData(popupID);
			Thread.sleep(2000);
	    }
	    @And("^Get the checker id and store it in a excel in charge master reject$")
	    public void get_the_checker_id_and_store_it_in_a_excel_in_charge_master_reject() throws Throwable {
	    	String CheckerId = null;
			for (int i = 0; i < 30; i++) {
				try {
					CheckerId = chargeObj.ChargeMaster_CheckerId().getText();
					System.out.println(CheckerId);
					break;
				} catch (Exception e) {

				}
				
			}

			System.out.println(CheckerId);
			String Space = " ";
			String split[] = CheckerId.split(" ");
			Space = split[split.length - 1];
			String popupID = Space.replaceAll("[/.]", "");
		    excelData.updateTestData("AT-CM-T001_D2","Checker id",popupID);
			System.out.println(popupID);
			// json.addData(popupID);
			Thread.sleep(2000);
	    }
	    @And("^Get the checker id and store it in a excel in charge master return$")
	    public void get_the_checker_id_and_store_it_in_a_excel_in_charge_master_return() throws Throwable {
	    	String CheckerId = null;
			for (int i = 0; i < 30; i++) {
				try {
					CheckerId = chargeObj.ChargeMaster_CheckerId().getText();
					System.out.println(CheckerId);
					break;
				} catch (Exception e) {

				}
				
			}

			System.out.println(CheckerId);
			String Space = " ";
			String split[] = CheckerId.split(" ");
			Space = split[split.length - 1];
			String popupID = Space.replaceAll("[/.]", "");
		    excelData.updateTestData("AT-CM-T001_D3","Checker id",popupID);
			System.out.println(popupID);
			// json.addData(popupID);
			Thread.sleep(2000);	
	    }
	    @And("^Search the record in search field for charge master$")
	    public void search_the_record_in_search_field_for_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_SeachButton(), 60, 2);
	    	chargeObj.ChargeMaster_SeachButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_SearchText(), 60, 2);
			for (int i = 0; i < 100; i++) {
				try {
			
			click.moveToElement(chargeObj.ChargeMaster_SearchText());
			chargeObj.ChargeMaster_SearchText().click();
			chargeObj.ChargeMaster_SearchText().sendKeys(testData.get("Search"));
			break;
	    }
				catch(Exception e) {
					}
				}
	    }

	    @And("^Click the action icon in the charge master$")
	    public void click_the_action_icon_in_the_charge_master() throws Throwable {
	    	Thread.sleep(2000);
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_ActionIcon(), 80, 2);
	    	chargeObj.ChargeMaster_ActionIcon().click();	    
	    	}
	    //**************Checker Approve***************************************//

	    @Then("^Choose the data set id to reject in charge master$")
	    public void choose_the_data_set_id_to_reject_in_charge_master() throws Throwable {
			testData=excelData.getTestdata("AT-CM-T001_D2");

	    }
	    @And("^choose the data set id for checker approval in charge master$")
	    public void choose_the_data_set_id_for_checker_approval_in_charge_master() throws Throwable {
			testData=excelData.getTestdata("AT-CM-T001_D1");

	    }
	    @Then("^Choose the data set id to return in charge master$")
	    public void choose_the_data_set_id_to_return_in_charge_master() throws Throwable {
			testData=excelData.getTestdata("AT-CM-T001_D3");

	    }
	    @Given("^Get the URL and login as Checker to approve the record in charge master$")
	    public void get_the_url_and_login_as_checker_to_approve_the_record_in_charge_master() throws Throwable {
	    	String kulsApplicationUrl = configFileReader.getApplicationTransactionUrl();
			driver.get(kulsApplicationUrl);
			
			testData=excelData.getTestdata("AT-CM-T001_D1");
			// System.out.println(testData.get("Checker id"));
			applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	    }

	    @And("^Click  the inbox in checker in charge Master$")
	    public void click_the_inbox_in_checker_in_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerInbox(), 60, 2);
	    	chargeObj.ChargeMaster_CheckerInbox().click();

	    }
	    @Then("^Search the record in serch field in checker stage for approve$")
	    public void search_the_record_in_serch_field_in_checker_stage_for_approve() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerSeachButton(), 60,
					2);
	    	chargeObj.ChargeMaster_CheckerSeachButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerSearchText(), 60,
					2);
			click.moveToElement(chargeObj.ChargeMaster_CheckerSearchText());
			chargeObj.ChargeMaster_CheckerSearchText().click();
			chargeObj.ChargeMaster_CheckerSearchText().sendKeys(testData.get("Search"));
	    }
	    @Then("^search the reference id and click the respective action icon in Chage master$")
	    public void search_the_reference_id_and_click_the_respective_action_icon_in_chage_master() throws Throwable {
	    	for (int i = 0; i < 60; i++) {
				try {
					driver.findElement(
							By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
							.click();
					break;
				} catch (Exception e) {

				}
			}
	    }
	    @And("^Click the approve button in the Charge master$")
	    public void click_the_approve_button_in_the_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerApproveButton(),
					60, 2);
	    	chargeObj.ChargeMaster_CheckerApproveButton().click();

	    }
	    @Then("^Enter the alert approve remark in charge master$")
	    public void enter_the_alert_approve_remark_in_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerAlertApprove(),
					60, 2);
	    	chargeObj.ChargeMaster_CheckerAlertApprove().click();
	    }

	    @Then("^Verify the record get approved in chargel master$")
	    public void verify_the_record_get_approved_in_chargel_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerId(), 60, 2);
			String Toast = chargeObj.ChargeMaster_CheckerId().getText();
			System.out.println(Toast);
			Assert.assertEquals(Toast, "Record APPROVED Successfully");
	    }

	    @And("^Give the final approve in the charge master$")
	    public void give_the_final_approve_in_the_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerFinalApprove(),
					60, 2);
	    	chargeObj.ChargeMaster_CheckerFinalApprove().click();	    
	    	}
	    @Given("^Get the URL and login as Checker to reject the record in charge master$")
	    public void get_the_url_and_login_as_checker_to_reject_the_record_in_charge_master() throws Throwable {
	    	String kulsApplicationUrl = configFileReader.getApplicationTransactionUrl();
			driver.get(kulsApplicationUrl);
			
			testData=excelData.getTestdata("AT-CM-T001_D2");
			// System.out.println(testData.get("Checker id"));
			applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	    }

	    @Then("^Search the record in serch field in checker stage for rejection$")
	    public void search_the_record_in_serch_field_in_checker_stage_for_rejection() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerSeachButton(), 60,
					2);
	    	chargeObj.ChargeMaster_CheckerSeachButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerSearchText(), 60,
					2);
			click.moveToElement(chargeObj.ChargeMaster_CheckerSearchText());
			chargeObj.ChargeMaster_CheckerSearchText().click();
			chargeObj.ChargeMaster_CheckerSearchText().sendKeys(testData.get("Search"));
	    }

	    @Then("^search the reference id and click the respective action icon in charge master$")
	    public void search_the_reference_id_and_click_the_respective_action_icon_in_charge_master() throws Throwable {
	    	for (int i = 0; i < 60; i++) {
				try {
					driver.findElement(
							By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
							.click();
					break;
				} catch (Exception e) {

				}
			}	  
	    	}

	    @Then("^Enter the alert reject remark in charge master$")
	    public void enter_the_alert_reject_remark_in_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerAlertReject(),
					60, 2);
	    	chargeObj.ChargeMaster_CheckerAlertReject().click();
	    }

	    @Then("^Verify the record get rejected in charge master$")
	    public void verify_the_record_get_rejected_in_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerIDReject(), 60, 2);
			String Toast = chargeObj.ChargeMaster_CheckerIDReject().getText();
			System.out.println(Toast);
			Assert.assertEquals(Toast, "Record REJECTED Successfully");	    
	    }

	    @And("^Click the reject button in the charge master$")
	    public void click_the_reject_button_in_the_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerRejectButton(),
					60, 2);
	    	chargeObj.ChargeMaster_CheckerRejectButton().click();
	    }	    

	    @And("^Give the final reject in the charge master$")
	    public void give_the_final_reject_in_the_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerFinalReject(),
					60, 2);
	    	chargeObj.ChargeMaster_CheckerFinalReject().click();
	    }

	    @Given("^Get the URL and login as Checker to return the record in charge master$")
	    public void get_the_url_and_login_as_checker_to_return_the_record_in_charge_master() throws Throwable {
	    	String kulsApplicationUrl = configFileReader.getApplicationTransactionUrl();
			driver.get(kulsApplicationUrl);
			
			testData=excelData.getTestdata("AT-CM-T001_D3");
			// System.out.println(testData.get("Checker id"));
			applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	    }
	    @Then("^Search the record in serch field in checker stage for return in charge master$")
	    public void search_the_record_in_serch_field_in_checker_stage_for_return_in_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerSeachButton(), 60,
					2);
	    	chargeObj.ChargeMaster_CheckerSeachButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerSearchText(), 60,
					2);
			click.moveToElement(chargeObj.ChargeMaster_CheckerSearchText());
			chargeObj.ChargeMaster_CheckerSearchText().click();
			chargeObj.ChargeMaster_CheckerSearchText().sendKeys(testData.get("Search"));
	    }
	    

	    @Then("^search the reference id and click the respective action icon for return in Charge master$")
	    public void search_the_reference_id_and_click_the_respective_action_icon_for_return_in_charge_master() throws Throwable {
	    	for (int i = 0; i < 60; i++) {
				try {
					driver.findElement(
							By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
							.click();
					break;
				} catch (Exception e) {

				}
			}	
	    }


	    @Then("^Enter the alert return remark in charge master$")
	    public void enter_the_alert_return_remark_in_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerAlertReturn(),
					60, 2);
	    	chargeObj.ChargeMaster_CheckerAlertReturn().click();	   
	    	}

	    @Then("^Verify the record get returned in charge master$")
	    public void verify_the_record_get_returned_in_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerIDReturn(), 60, 2);
			String Toast = chargeObj.ChargeMaster_CheckerIDReturn().getText();
			System.out.println(Toast);
    }

	    @And("^Click the return button in the charge master$")
	    public void click_the_return_button_in_the_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerReturnButton(),
					60, 2);
	    	chargeObj.ChargeMaster_CheckerReturnButton().click();	 
	    	}

	    @And("^Give the final return in the charge master$")
	    public void give_the_final_return_in_the_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_CheckerFinalReturn(),
					60, 2);
	    	chargeObj.ChargeMaster_CheckerFinalReturn().click();		    
	    	}
	    @Then("^verify the approved record present in the list view in charge master$")
	    public void verify_the_approved_record_present_in_the_list_view_in_charge_master() throws Throwable {
	    	for (int i = 0; i < 20; i++) {
				try {

					String validate = driver
							.findElement(By.xpath("//span[contains(text(),'" + testData.get("Description") + "')]"))
							.getText();
					System.out.println(validate);
					Assert.assertEquals(validate, testData.get("Description"));
				} catch (Exception e) {
				}
			}
	    }
	    @Then("^verify the the rejected record in the list view in charge master$")
	    public void verify_the_the_rejected_record_in_the_list_view_in_charge_master() throws Throwable {
	    	for (int i = 0; i < 50; i++) {

			}
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("Description")+ "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("Description"));
			} catch (Exception e) {
				System.out.println("The Rejected Record Not in the List view ");
			}
}

	    @Then("^verify the the returned record is in the list view in charge master$")
	    public void verify_the_the_returned_record_is_in_the_list_view_in_charge_master() throws Throwable {
	    	for (int i = 0; i < 20; i++) {

			}
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("Description") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("Description"));
			} catch (Exception e) {

			}
		}
	    

	    @And("^Click the temp view icon of charge master$")
	    public void click_the_temp_view_icon_of_charge_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, chargeObj.ChargeMaster_tempviewIcon(), 60, 2);
			chargeObj.ChargeMaster_tempviewIcon().click();
	    }
}
