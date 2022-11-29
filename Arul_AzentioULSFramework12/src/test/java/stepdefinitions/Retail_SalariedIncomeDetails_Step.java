package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.ApplicationDetails_AppDataEntryObj;
import pageobjects.Retail_Salaried_IncomeDetailsObj;
import resources.BaseClass;
import resources.ExcelData;
import testDataType.KULS_ApplicationDetails_AppDataEntry_Testdata;
import testDataType.KULS_Login_TestDataType;

public class Retail_SalariedIncomeDetails_Step {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	Retail_Salaried_IncomeDetailsObj salariedincomedetailsobj = new Retail_Salaried_IncomeDetailsObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	KULS_ApplicationDetails_AppDataEntry_Testdata applicationdetailsData = jsonConfig.getApplicationDetailsByName("Maker");
	ExcelData exceldata= new ExcelData("C:\\Users\\inindc00074\\Downloads\\salary.xlsx", "SalariedIncomeDetails", "Data Set ID");
	Map<String, String> testdata;
	
	@And("^Navigate to Customer financial section$")
    public void navigate_to_customer_financial_section() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.CustomerFinancialsSection(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.CustomerFinancialsSection());
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Click on Add icon in Income view list$")
    public void click_on_add_icon_in_income_view_list() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.AddIconOfIncomeDetails(), 60, 2);
    	seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.AddIconOfIncomeDetails());
    	//seleniumactions.getJavascriptHelper().(salariedincomedetailsobj.AddIconOfIncomeDetails().click());
    }

    @And("^Enter the value in Lumpsum amount$")
    public void enter_the_value_in_lumpsum_amount() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_LumpsumAmountField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_LumpsumAmountField());
				salariedincomedetailsobj.IncomeDetails_LumpsumAmountField().sendKeys(testdata.get("Lumpsum Amount"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Pension amount$")
    public void enter_the_value_in_pension_amount() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_PensionAmountField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_PensionAmountField());
				salariedincomedetailsobj.IncomeDetails_PensionAmountField().sendKeys(testdata.get("Pension Amount"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Income field$")
    public void select_the_value_in_income_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, salariedincomedetailsobj.IncomeDetails_IncomeField(), 60, 2);
    	salariedincomedetailsobj.IncomeDetails_IncomeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Income")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Select the value in Frequency field in income section$")
    public void select_the_value_in_frequency_field_in_income_section() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, salariedincomedetailsobj.IncomeDetails_FrequencyField(), 60, 2);
    	salariedincomedetailsobj.IncomeDetails_FrequencyField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Frequency")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the value in Amount field$")
    public void enter_the_value_in_amount_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_AmountField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_AmountField());
				salariedincomedetailsobj.IncomeDetails_AmountField().sendKeys(testdata.get("Amount"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Defined percentage field$")
    public void enter_the_value_in_defined_percentage_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_DefinedPercentageField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_DefinedPercentageField());
				salariedincomedetailsobj.IncomeDetails_DefinedPercentageField().sendKeys(testdata.get("Defined%"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Adjusted Percentage field$")
    public void enter_the_value_in_adjusted_percentage_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_AdjustedPercentageField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_AdjustedPercentageField());
				salariedincomedetailsobj.IncomeDetails_AdjustedPercentageField().sendKeys(testdata.get("Adjusted%"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in amount considered field$")
    public void enter_the_value_in_amount_considered_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_AmountConsideredField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_AmountConsideredField());
				//salariedincomedetailsobj.IncomeDetails_AmountConsideredField().sendKeys(testdata.get("Amount Considered"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Deduction field$")
    public void select_the_value_in_deduction_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, salariedincomedetailsobj.IncomeDetails_DeductionField(), 60, 2);
    	salariedincomedetailsobj.IncomeDetails_DeductionField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Deduction")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^select the value in Frequency fied in Deduction section$")
    public void select_the_value_in_frequency_fied_in_deduction_section() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, salariedincomedetailsobj.IncomeDetails_FrequencyInDeductionField(), 60, 2);
    	salariedincomedetailsobj.IncomeDetails_FrequencyInDeductionField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("DeductionFrequency")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the vaue in Deduction amt field$")
    public void enter_the_vaue_in_deduction_amt_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_DeductionAmtField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_DeductionAmtField());
				salariedincomedetailsobj.IncomeDetails_DeductionAmtField().sendKeys(testdata.get("Deduction amt"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Deduction def percentage field$")
    public void enter_the_value_in_deduction_def_percentage_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_DeductionDefPercentageField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_DeductionDefPercentageField());
				salariedincomedetailsobj.IncomeDetails_DeductionDefPercentageField().sendKeys(testdata.get("Deduction Def%"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Deduction Adj percentage field$")
    public void enter_the_value_in_deduction_adj_percentage_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_DeductionAdjPercentageField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_DeductionAdjPercentageField());
				salariedincomedetailsobj.IncomeDetails_DeductionAdjPercentageField().sendKeys(testdata.get("Deduction adj%"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in deduction Considered field$")
    public void enter_the_value_in_deduction_considered_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_DeductionConsideredField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_DeductionConsideredField());
				//salariedincomedetailsobj.IncomeDetails_DeductionConsideredField().sendKeys(testdata.get("Deduction considered"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }
    @And("^Navigate to Mail box of Application details and search the Reference id$")
    public void navigate_to_mail_box_of_application_details_and_search_the_reference_id() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.ApplicationDetails_Inbox(), 30, 2);
    	salariedincomedetailsobj.ApplicationDetails_Inbox().click();
    	for (int i = 0; i <20; i++) {
    		try {
    			salariedincomedetailsobj.ApplicationDetailsInboxView_Search().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    	
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.ApplicationDetailsInboxView_SearchText(),60,2);
        salariedincomedetailsobj.ApplicationDetailsInboxView_SearchText().click();
        salariedincomedetailsobj.ApplicationDetailsInboxView_SearchText().sendKeys("1301");
    }

    @And("^Click on action icon of first record of respective reference id$")
    public void click_on_action_icon_of_first_record_of_respective_reference_id() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.ApplicationDetailsMailBoxActionButtonOfFirstRecord_AppDataEntry(), 30, 2);
    	salariedincomedetailsobj.ApplicationDetailsMailBoxActionButtonOfFirstRecord_AppDataEntry().click();
    }
    @And("^update test data for salaried income details test case one$")
    public void update_test_data_for_salaried_income_details_test_case_one() throws Throwable {
    	testdata=exceldata.getTestdata("AT-RSI-001_D1");
    }
    @And("^Click on Plus icon in Income section$")
    public void click_on_plus_icon_in_income_section() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_ActionIconInIncomeSection(), 60, 2);
    	seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_ActionIconInIncomeSection());
    }

    @And("^Enter the value in Lumpsum amount1$")
    public void enter_the_value_in_lumpsum_amount1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_LumpsumAmountField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_LumpsumAmountField());
				salariedincomedetailsobj.IncomeDetails_LumpsumAmountField().sendKeys(testdata.get("Lumpsum Amount"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }
    @And("^Enter the value in Pension amount1$")
    public void enter_the_value_in_pension_amount1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_PensionAmountField(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_PensionAmountField());
				salariedincomedetailsobj.IncomeDetails_PensionAmountField().sendKeys(testdata.get("Pension Amount"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Income field1$")
    public void select_the_value_in_income_field1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, salariedincomedetailsobj.IncomeDetails_IncomeField1(), 60, 2);
    	salariedincomedetailsobj.IncomeDetails_IncomeField1().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Income1")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Select the value in Frequency field in income section1$")
    public void select_the_value_in_frequency_field_in_income_section1() throws Throwable {
    	//Thread.sleep(2000);
		/*
		 * seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
		 * salariedincomedetailsobj.IncomeDetails_FrequencyField1(), 60, 2);
		 * salariedincomedetailsobj.IncomeDetails_FrequencyField1().click(); for (int i
		 * = 0; i < 100; i++) { try {
		 * //seleniumactions.getClickAndActionsHelper().moveToElement(driver.findElement
		 * (By.xpath("//ion-label[contains(text(),'" + testdata.get("Frequency1") // +
		 * "')]/following-sibling::ion-radio")));
		 * //seleniumactions.getClickAndActionsHelper().clickOnElement(driver.
		 * findElement(By.xpath("//ion-label[contains(text(),'" +
		 * testdata.get("Frequency1") // + "')]/following-sibling::ion-radio")));
		 * //seleniumactions.getJavascriptHelper().JSEClick(driver.findElement(By.xpath(
		 * "//ion-label[contains(text(),'" + testdata.get("Frequency1") // +
		 * "')]/following-sibling::ion-radio")));
		 * //driver.findElement(By.xpath("//ion-label[contains(text(),'" +
		 * testdata.get("Frequency1") // + "')]/following-sibling::ion-radio")).click();
		 * seleniumactions.getClickAndActionsHelper().moveToElement(driver.findElement(
		 * By.xpath("//ion-label[contains(text(),'" + testdata.get("Frequency1") +
		 * "')]/following-sibling::ion-radio")));
		 * seleniumactions.getClickAndActionsHelper().doubleClick(driver.findElement(By.
		 * xpath("//ion-label[contains(text(),'" + testdata.get("Frequency1") +
		 * "')]/following-sibling::ion-radio")));
		 * 
		 * break; } catch (Exception e) { if(i==80) { Assert.fail(e.getMessage()); } } }
		 */
    	for (int i = 0; i < 50; i++) {
			try {
				salariedincomedetailsobj.IncomeDetails_FrequencyField1().click();
				break;
			} catch (Exception e) {
if (i==200) {
	Assert.fail(e.getMessage());
}
			}
		}

		//Thread.sleep(2000);

		String xpath = "//ion-label[contains(text(),'"+testdata.get("Frequency1")+"')]//following-sibling::ion-radio";
         
		for (int i = 1; i < 50; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				seleniumactions.getClickAndActionsHelper().doubleClick(driver.findElement(By.xpath(xpath)));
				break;

			} catch (Exception e) {
if (i==199) {
	Assert.fail(e.getMessage());
}
			}
		}
    }

    @And("^Enter the value in Amount field1$")
    public void enter_the_value_in_amount_field1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_AmountField1(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_AmountField1());
				salariedincomedetailsobj.IncomeDetails_AmountField1().sendKeys(testdata.get("Amount1"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Defined percentage field1$")
    public void enter_the_value_in_defined_percentage_field1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_DefinedPercentageField1(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_DefinedPercentageField1());
				salariedincomedetailsobj.IncomeDetails_DefinedPercentageField1().sendKeys(testdata.get("Defined%1"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Adjusted Percentage field1$")
    public void enter_the_value_in_adjusted_percentage_field1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_AdjustedPercentageField1(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_AdjustedPercentageField1());
				salariedincomedetailsobj.IncomeDetails_AdjustedPercentageField1().sendKeys(testdata.get("Adjusted%1"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }
    @And("^update test data for salaried income details test case two$")
    public void update_test_data_for_salaried_income_details_test_case_two() throws Throwable {
    	testdata=exceldata.getTestdata("AT-RSI-002_D1");
    }
    @And("^Enter the value in amount considered field1$")
    public void enter_the_value_in_amount_considered_field1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_AmountConsideredField1(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_AmountConsideredField1());
				//salariedincomedetailsobj.IncomeDetails_AmountConsideredField().sendKeys(testdata.get("Amount Considered"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }
    @And("^Click on Plus icon in Deduction section$")
    public void click_on_plus_icon_in_deduction_section() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_ActionIconInDeductionSection(), 60, 2);
    	seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_ActionIconInDeductionSection());
    }

    @And("^Select the value in Deduction field1$")
    public void select_the_value_in_deduction_field1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, salariedincomedetailsobj.IncomeDetails_DeductionField1(), 60, 2);
    	salariedincomedetailsobj.IncomeDetails_DeductionField1().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Deduction")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^select the value in Frequency fied in Deduction section1$")
    public void select_the_value_in_frequency_fied_in_deduction_section1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, salariedincomedetailsobj.IncomeDetails_FrequencyInDeductionField1(), 60, 2);
    	salariedincomedetailsobj.IncomeDetails_FrequencyInDeductionField1().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("DeductionFrequency")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the vaue in Deduction amt field1$")
    public void enter_the_vaue_in_deduction_amt_field1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_DeductionAmtField1(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_DeductionAmtField1());
				salariedincomedetailsobj.IncomeDetails_DeductionAmtField1().sendKeys(testdata.get("Deduction amt"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Deduction def percentage field1$")
    public void enter_the_value_in_deduction_def_percentage_field1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_DeductionDefPercentageField1(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_DeductionDefPercentageField1());
				salariedincomedetailsobj.IncomeDetails_DeductionDefPercentageField1().sendKeys(testdata.get("Deduction Def%"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Deduction Adj percentage field1$")
    public void enter_the_value_in_deduction_adj_percentage_field1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_DeductionAdjPercentageField1(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_DeductionAdjPercentageField1());
				salariedincomedetailsobj.IncomeDetails_DeductionAdjPercentageField1().sendKeys(testdata.get("Deduction adj%"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in deduction Considered field1$")
    public void enter_the_value_in_deduction_considered_field1() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_DeductionConsideredField1(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_DeductionConsideredField1());
				//salariedincomedetailsobj.IncomeDetails_DeductionConsideredField().sendKeys(testdata.get("Deduction considered"));
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }
    @And("^Click on eligibility button$")
    public void click_on_eligibility_button() throws Throwable {
    	Thread.sleep(2000);
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_EligibilityCheckButton(), 60, 2);
    	seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_EligibilityCheckButton());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_EligibilityCheckSuccessPopup(), 60, 2);
    	//salariedincomedetailsobj.IncomeDetails_EligibilityCheckSuccessPopup().isDisplayed();
    	Assert.assertTrue(salariedincomedetailsobj.IncomeDetails_EligibilityCheckSuccessPopup().isDisplayed());
    }
    @And("^Click on Approve Icon in Application Details page$")
    public void click_on_approve_icon_in_application_details_page() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_ApproveIconInApplicationDetails(), 60, 2);
    	seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_ApproveIconInApplicationDetails());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_ApproveinRemarksText(), 60, 2);
    	seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_ApproveinRemarksText());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_ApproveButtoninRemarks(), 60, 2);
    	seleniumactions.getJavascriptHelper().JSEClick(salariedincomedetailsobj.IncomeDetails_ApproveButtoninRemarks());
    }
    @And("^Validate Approved popup in Application details$")
    public void validate_approved_popup_in_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,salariedincomedetailsobj.IncomeDetails_RecordApprovedSuccessfullyPopup1(), 60, 2);
    	Assert.assertTrue(salariedincomedetailsobj.IncomeDetails_RecordApprovedSuccessfullyPopup1().isDisplayed());
    	Assert.assertTrue(salariedincomedetailsobj.IncomeDetails_RecordApprovedSuccessfullyPopup2().isDisplayed());
    	Assert.assertTrue(salariedincomedetailsobj.IncomeDetails_RecordApprovedSuccessfullyPopup3().isDisplayed());
        
    }
}
