package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.CustomerEntityLayout_CustomerDebtObj;
import pageobjects.CustomerEntityLayout_IdentificationObj;
import resources.BaseClass;
import testDataType.KULS_CustomerEntityLayout_CustomerDebt_Testdata;
import testDataType.KULS_CustomerEntityLayout_Identification_Testdata;
import testDataType.KULS_Login_TestDataType;

public class CustomerEntityLayout_CustomerDebt_Step {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	CustomerEntityLayout_CustomerDebtObj customerdebtobj = new CustomerEntityLayout_CustomerDebtObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	KULS_CustomerEntityLayout_CustomerDebt_Testdata customerdebtData = jsonConfig.getCustomerDebtByName("Maker");
	
	
	@And("^Click on Add icon of Customer Debt section$")
    public void click_on_add_icon_of_customer_debt_section() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_AddIcon(), 60, 2);
		customerdebtobj.CustomerDebt_AddIcon().click();
    }

    @And("^Select the value in Finance type$")
    public void select_the_value_in_finance_type() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, customerdebtobj.CustomerDebt_FinanceType(), 60, 2);
    	customerdebtobj.CustomerDebt_FinanceType().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + customerdebtData.Financetype
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Select the value in Financial Institution$")
    public void select_the_value_in_financial_institution() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, customerdebtobj.CustomerDebt_FinancialInstitution(), 60, 2);
    	customerdebtobj.CustomerDebt_FinancialInstitution().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + customerdebtData.FinancialInstitution
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the value in Account Number$")
    public void enter_the_value_in_account_number() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_AccountNumber(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_AccountNumber());
				customerdebtobj.CustomerDebt_AccountNumber().sendKeys(customerdebtData.AccountNumber);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Sanction date$")
    public void select_the_value_in_sanction_date() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_SanctionDate(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_SanctionDate());
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CalenderIcon_TodayValue());
				
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Sanction amount$")
    public void enter_the_value_in_sanction_amount() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_SanctionAmount(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_SanctionAmount());
				customerdebtobj.CustomerDebt_SanctionAmount().sendKeys(customerdebtData.Sanctionamount);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Interest rate$")
    public void enter_the_value_in_interest_rate() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_InterestRate(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_InterestRate());
				customerdebtobj.CustomerDebt_InterestRate().sendKeys(customerdebtData.Interestrate);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Current Principle balance$")
    public void enter_the_value_in_current_principle_balance() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_CurrentPrincipalBalance(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_CurrentPrincipalBalance());
				customerdebtobj.CustomerDebt_CurrentPrincipalBalance().sendKeys(customerdebtData.CurrentPrinciplebalance);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Tenure months$")
    public void enter_the_value_in_tenure_months() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_TenureMonths(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_TenureMonths());
				customerdebtobj.CustomerDebt_TenureMonths().sendKeys(customerdebtData.TenureMonths);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Maturity date$")
    public void select_the_value_in_maturity_date() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_MaturityDate(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_MaturityDate());
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CalenderIcon_TodayValue());
				
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Installment amount$")
    public void enter_the_value_in_installment_amount() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_InstallmentAmount(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_InstallmentAmount());
				customerdebtobj.CustomerDebt_InstallmentAmount().sendKeys(customerdebtData.InstallmentAmount);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Amount considered$")
    public void enter_the_value_in_amount_considered() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_AmountConsidered(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_AmountConsidered());
				customerdebtobj.CustomerDebt_AmountConsidered().sendKeys(customerdebtData.AmountConsidered);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Currency$")
    public void select_the_value_in_currency() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, customerdebtobj.CustomerDebt_Currency(), 60, 2);
    	customerdebtobj.CustomerDebt_Currency().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + customerdebtData.Currency
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the value in Remarks$")
    public void enter_the_value_in_remarks() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(customerdebtobj.CustomerDebt_Remarks());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_Remarks(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_Remarks());
				customerdebtobj.CustomerDebt_Remarks().sendKeys(customerdebtData.Remarks);
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^Select the value in next due date$")
    public void select_the_value_in_next_due_date() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(customerdebtobj.CustomerDebt_NextDueDate());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_NextDueDate(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_NextDueDate());
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CalenderIcon_TodayValue());
				
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Collateral type$")
    public void select_the_value_in_collateral_type() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(customerdebtobj.CustomerDebt_CollateralType());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, customerdebtobj.CustomerDebt_CollateralType(), 60, 2);
    	customerdebtobj.CustomerDebt_CollateralType().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + customerdebtData.CollateralType
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Select the value in Closed date$")
    public void select_the_value_in_closed_date() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_ClosedDate(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_ClosedDate());
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CalenderIcon_TodayValue());
				
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Frequency field$")
    public void select_the_value_in_frequency_field() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, customerdebtobj.CustomerDebt_Frequency(), 60, 2);
    	customerdebtobj.CustomerDebt_Frequency().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + customerdebtData.Frequency
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the value in Last payment amount$")
    public void enter_the_value_in_last_payment_amount() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_LastPaymentAmount(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_LastPaymentAmount());
				customerdebtobj.CustomerDebt_LastPaymentAmount().sendKeys(customerdebtData.LastPaymentAmount);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Last payment date$")
    public void select_the_value_in_last_payment_date() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_LastPaymentDate(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_LastPaymentDate());
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CalenderIcon_TodayValue());
				
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Product name$")
    public void enter_the_value_in_product_name() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_ProductName(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_ProductName());
				customerdebtobj.CustomerDebt_ProductName().sendKeys(customerdebtData.ProductName);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Enter the value in Last 24 cycle$")
    public void enter_the_value_in_last_24_cycle() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_Last24Cycle(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_Last24Cycle());
				customerdebtobj.CustomerDebt_Last24Cycle().sendKeys(customerdebtData.Last24Cycle);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Toggle the Balance transfer flag$")
    public void toggle_the_balance_transfer_flag() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_BalanceTransferFlag(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_BalanceTransferFlag());
				//customerdebtobj.CustomerDebt_BalanceTransferFlag().sendKeys(customerdebtData.IDNumber);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in Facility Status$")
    public void select_the_value_in_facility_status() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, customerdebtobj.CustomerDebt_FacilityStatus(), 60, 2);
    	customerdebtobj.CustomerDebt_FacilityStatus().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + customerdebtData.FacilityStatus
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Enter the value in Remaining Tenure months$")
    public void enter_the_value_in_remaining_tenure_months() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_RemainingTenureMonths(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_RemainingTenureMonths());
				customerdebtobj.CustomerDebt_RemainingTenureMonths().sendKeys(customerdebtData.RemainingTenureMonths);
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in disbursement date$")
    public void select_the_value_in_disbursement_date() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_DisbursementDate(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerDebt_DisbursementDate());
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CalenderIcon_TodayValue());
				
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^Select the value in NPA Classification$")
    public void select_the_value_in_npa_classification() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, customerdebtobj.CustomerDebt_NPAClassification(), 60, 2);
    	customerdebtobj.CustomerDebt_NPAClassification().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + customerdebtData.NPAClassification
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Click on Save button of CustomerDebt$")
    public void click_on_save_button_of_CustomerDebt() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(customerdebtobj.CustomerDebt_SaveIcon());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerDebt_SaveIcon(), 60, 2);
    	customerdebtobj.CustomerDebt_SaveIcon().click();
    }
    @And("^Navigate to Customer Financials section$")
    public void navigate_to_customer_financials_section() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerdebtobj.CustomerFinancialsButton(), 60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				seleniumactions.getJavascriptHelper().JSEClick(customerdebtobj.CustomerFinancialsButton());
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }


}
