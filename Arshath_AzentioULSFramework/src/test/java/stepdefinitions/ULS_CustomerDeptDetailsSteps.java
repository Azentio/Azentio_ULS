package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.KULS_CommonWebElements;
import pageobjects.ULS_customerDeptDetailsObj;
import resources.BaseClass;
import testDataType.ULS_CustomerDeptDetailsTestData;

public class ULS_CustomerDeptDetailsSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	ULS_customerDeptDetailsObj customerDeptDetailsObj = new ULS_customerDeptDetailsObj(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ULS_CustomerDeptDetailsTestData customerDeptDetailsTestData = jsonConfig
			.getCustomerDeptDetailsTestDataByName("Maker");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	KULS_CommonWebElements ulsCommenElement = new KULS_CommonWebElements(driver);
	Map<String, String> testData = new HashMap<>();

	@And("^click on pencil icon in financial commitment list view record$")
	public void click_on_pencil_icon_in_financial_commitment_list_view_record() throws Throwable {

		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper
				.scrollIntoView(customerDeptDetailsObj.customerDeptDetailsFinancialCommitmentFirstRecord());
				customerDeptDetailsObj.customerDeptDetailsFinancialCommitmentFirstRecord().click();
//				if (i >= 10) {
//					javascriptHelper
//							.scrollIntoView(customerDeptDetailsObj.customerDeptDetailsFinancialCommitmentFirstRecord());
//					javascriptHelper
//							.JSEClick(customerDeptDetailsObj.customerDeptDetailsFinancialCommitmentFirstRecord());
//					break;
//				}
				break;
			} catch (Exception e) {
				if (i >= 15 && i <= 25) {

					javascriptHelper
							.scrollIntoView(customerDeptDetailsObj.customerDeptDetailsFinancialCommitmentFirstRecord());
					javascriptHelper
							.JSEClick(customerDeptDetailsObj.customerDeptDetailsFinancialCommitmentFirstRecord());
					break;
				}
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on add button in financial commitment$")
	public void click_on_add_button_in_financial_commitment() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDeptDetailsAddButton(),
				10, 1);
		customerDeptDetailsObj.customerDeptDetailsAddButton().click();
	}

	@And("^update the finance type dropdown fied$")
	public void update_the_finance_type_dropdown_fied() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtFinanceType(), 10,
				1);
		customerDeptDetailsObj.customerDebtFinanceType().click();
		String xpath = "//ion-label[text()=' " + customerDeptDetailsTestData.updatedFinanceType
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^update the financial institution dropdown field$")
	public void update_the_financial_institution_dropdown_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDebtFinancialInstitution(), 10, 1);
		customerDeptDetailsObj.customerDebtFinancialInstitution().click();
		String xpath = "//ion-label[text()=' " + customerDeptDetailsTestData.UpdatedFinancialInstitution
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^update the account number field$")
	public void update_the_account_number_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtAccountNumber(), 10,
				1);
		customerDeptDetailsObj.customerDebtAccountNumber().click();
		customerDeptDetailsObj.customerDebtAccountNumber().clear();
		customerDeptDetailsObj.customerDebtAccountNumber().sendKeys(customerDeptDetailsTestData.UpdatedAccountNumber);
	}

	@And("^update the sanction date calendar$")
	public void update_the_sanction_date_calendar() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDeptDetailsSansactionDateDataHolder(), 10, 1);

		customerDeptDetailsObj.customerDeptDetailsSansactionDateDataHolder().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommenElement.calendarYearField(), 10, 1);
		ulsCommenElement.calendarYearField().click();
		String monthXpath = "//span[text()=' " + customerDeptDetailsTestData.UpdatedSanctionMonth + " ']";
		String yearXpath = "//span[text()=' " + customerDeptDetailsTestData.UpdatedSanctionYear + " ']";
		String dayXpath = "//span[text()='" + customerDeptDetailsTestData.UpdatedSanctionday + "']";

		for (int i = 0; i <= 20; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(yearXpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(yearXpath)),
						driver.findElement(By.xpath(yearXpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 20; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(monthXpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(monthXpath)),
						driver.findElement(By.xpath(monthXpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		List<WebElement> dayElement = driver.findElements(By.xpath(dayXpath));
		;

		for (WebElement element : dayElement) {
			try {
				clicksAndActionsHelper.moveToElement(element);
//				clicksAndActionsHelper.clickUsingActionClass(element, element);
				element.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^update the sanction amount$")
	public void update_the_sanction_amount() throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtSanctionAmount(),
//				10, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerDeptDetailsObj.customerDebtSanctionAmount());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerDeptDetailsObj.customerDebtSanctionAmount().click();
		customerDeptDetailsObj.customerDebtSanctionAmount().clear();
		customerDeptDetailsObj.customerDebtSanctionAmount().sendKeys(customerDeptDetailsTestData.UpdatedSanctionAmount);
	}

	@And("^update the interest rate percentage field$")
	public void update_the_interest_rate_percentage_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtInterestRate(), 10,
				1);
		customerDeptDetailsObj.customerDebtInterestRate().click();
		customerDeptDetailsObj.customerDebtInterestRate().clear();
		customerDeptDetailsObj.customerDebtInterestRate()
				.sendKeys(customerDeptDetailsTestData.UpdatedInterestratePercentage);
	}

	@And("^update the current principal balance field$")
	public void update_the_current_principal_balance_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDebtCurrentPrincipalBalance(), 10, 1);
		customerDeptDetailsObj.customerDebtCurrentPrincipalBalance().click();
		customerDeptDetailsObj.customerDebtCurrentPrincipalBalance().clear();
		customerDeptDetailsObj.customerDebtCurrentPrincipalBalance()
				.sendKeys(customerDeptDetailsTestData.UpdatedCurrentPrincipalBalance);

	}

	@And("^update the tenure months field$")
	public void update_the_tenure_months_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtTenureMonths(), 10,
				1);
		customerDeptDetailsObj.customerDebtTenureMonths().click();
		customerDeptDetailsObj.customerDebtTenureMonths().clear();
		customerDeptDetailsObj.customerDebtTenureMonths().sendKeys(customerDeptDetailsTestData.UpdatedtenureMonths);
	}

	@And("^update the maturity date field$")
	public void update_the_maturity_date_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDeptDetailsMaturityDateDataHolder(), 10, 1);

		customerDeptDetailsObj.customerDeptDetailsMaturityDateDataHolder().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommenElement.calendarYearField(), 10, 1);
		ulsCommenElement.calendarYearField().click();
		String monthXpath = "//span[text()=' " + customerDeptDetailsTestData.UpdatedMaturityMonth + " ']";
		String yearXpath = "//span[text()=' " + customerDeptDetailsTestData.UpdatedMaturityYear + " ']";
		String dayXpath = "//span[text()='" + customerDeptDetailsTestData.UpdatedMaturityDay + "']";

		for (int i = 0; i <= 20; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(yearXpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(yearXpath)),
						driver.findElement(By.xpath(yearXpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 20; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(monthXpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(monthXpath)),
						driver.findElement(By.xpath(monthXpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		List<WebElement> dayElement = driver.findElements(By.xpath(dayXpath));
		;

		for (WebElement element : dayElement) {
			try {
//				clicksAndActionsHelper.moveToElement(element);
//				clicksAndActionsHelper.clickUsingActionClass(element, element);
				element.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^update the installment amount field$")
	public void update_the_installment_amount_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtInstallmentAmount(),
				10, 1);
		customerDeptDetailsObj.customerDebtInstallmentAmount().click();
		customerDeptDetailsObj.customerDebtInstallmentAmount().clear();
		customerDeptDetailsObj.customerDebtInstallmentAmount()
				.sendKeys(customerDeptDetailsTestData.UpdatedInstallmentAmount);
	}

	@And("^update the amount considered field$")
	public void update_the_amount_considered_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtAmountConsidered(),
				10, 1);
		customerDeptDetailsObj.customerDebtAmountConsidered().click();
		customerDeptDetailsObj.customerDebtAmountConsidered().clear();
		customerDeptDetailsObj.customerDebtAmountConsidered()
				.sendKeys(customerDeptDetailsTestData.UpdatedInstallmentAmount);
	}

	@And("^update the currency field$")
	public void update_the_currency_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtCurrency(), 10, 1);
		customerDeptDetailsObj.customerDebtCurrency().click();
		String xpath = "//ion-label[text()=' " + customerDeptDetailsTestData.UpdatedCurrency
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^update the remarks field$")
	public void update_the_remarks_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtRemarks(), 10, 1);
		customerDeptDetailsObj.customerDebtRemarks().click();
		customerDeptDetailsObj.customerDebtRemarks().clear();
		customerDeptDetailsObj.customerDebtRemarks().sendKeys(customerDeptDetailsTestData.UpdatedRemarks);
	}

	@And("^update the next due date calander field$")
	public void update_the_next_due_date_calander_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtNextDueDate(), 10,
				1);

		customerDeptDetailsObj.customerDebtNextDueDate().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommenElement.calendarYearField(), 10, 1);
		ulsCommenElement.calendarYearField().click();
		String monthXpath = "//span[text()=' " + customerDeptDetailsTestData.UpdatedNextDueMonth + " ']";
		String yearXpath = "//span[text()=' " + customerDeptDetailsTestData.UpdatedNextDueYear + " ']";
		String dayXpath = "//span[text()='" + customerDeptDetailsTestData.UpdatedNextDueDay + "']";

		for (int i = 0; i <= 20; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(yearXpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(yearXpath)),
						driver.findElement(By.xpath(yearXpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 20; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(monthXpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(monthXpath)),
						driver.findElement(By.xpath(monthXpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		List<WebElement> dayElement = driver.findElements(By.xpath(dayXpath));
		;

		for (WebElement element : dayElement) {
			try {
				clicksAndActionsHelper.moveToElement(element);
				clicksAndActionsHelper.clickUsingActionClass(element, element);
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^update the collateral type field$")
	public void update_the_collateral_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtCollateralType(),
				10, 1);
		customerDeptDetailsObj.customerDebtCollateralType().click();
		String xpath = "//ion-label[text()=' " + customerDeptDetailsTestData.UpdatedCollateralType
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^update the closed date calander field$")
	public void update_the_closed_date_calander_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDeptDetailsClosedDate(),
				10, 1);

		customerDeptDetailsObj.customerDeptDetailsClosedDate().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommenElement.calendarYearField(), 10, 1);
		ulsCommenElement.calendarYearField().click();
		String monthXpath = "//span[text()=' " + customerDeptDetailsTestData.UpdatedClosedMonth + " ']";
		String yearXpath = "//span[text()=' " + customerDeptDetailsTestData.UpdatedClosedYear + " ']";
		String dayXpath = "//span[text()='" + customerDeptDetailsTestData.UpdatedClosedDay + "']";

		for (int i = 0; i <= 20; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(yearXpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(yearXpath)),
						driver.findElement(By.xpath(yearXpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 20; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(monthXpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(monthXpath)),
						driver.findElement(By.xpath(monthXpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		List<WebElement> dayElement = driver.findElements(By.xpath(dayXpath));
		;

		for (WebElement element : dayElement) {
			try {
//				clicksAndActionsHelper.moveToElement(element);
//				clicksAndActionsHelper.clickUsingActionClass(element, element);
				element.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^update the ferequency dropdown field$")
	public void update_the_ferequency_dropdown_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtFrequency(), 10, 1);
		customerDeptDetailsObj.customerDebtFrequency().click();
		String xpath = "//ion-label[text()=' " + customerDeptDetailsTestData.UpdatedFrequency
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^update the last payment amount field$")
	public void update_the_last_payment_amount_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtLastPaymentAmount(),
				10, 1);
		customerDeptDetailsObj.customerDebtLastPaymentAmount().click();
		customerDeptDetailsObj.customerDebtLastPaymentAmount().clear();
		customerDeptDetailsObj.customerDebtLastPaymentAmount()
				.sendKeys(customerDeptDetailsTestData.UpdatedLastPaymentAmount);
	}

	@And("^update the last payment date calander field$")
	public void update_the_last_payment_date_calander_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDeptDetailsLastPaymentDate(), 10, 1);

		customerDeptDetailsObj.customerDeptDetailsLastPaymentDate().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommenElement.calendarYearField(), 10, 1);
		ulsCommenElement.calendarYearField().click();
		String monthXpath = "//span[text()=' " + customerDeptDetailsTestData.UpdatedLastPaymentMonth + " ']";
		String yearXpath = "//span[text()=' " + customerDeptDetailsTestData.UpdatedLastPaymentYear + " ']";
		String dayXpath = "//span[text()='" + customerDeptDetailsTestData.UpdatedLastPaymentDay + "']";

		for (int i = 0; i <= 20; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(yearXpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(yearXpath)),
						driver.findElement(By.xpath(yearXpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 20; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(monthXpath)));
				clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(monthXpath)),
						driver.findElement(By.xpath(monthXpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		List<WebElement> dayElement = driver.findElements(By.xpath(dayXpath));
		;

		for (WebElement element : dayElement) {
			try {
//				clicksAndActionsHelper.moveToElement(element);
//				clicksAndActionsHelper.clickUsingActionClass(element, element);
				element.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^update the product name field$")
	public void update_the_product_name_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtProductName(), 20,
				1);
		customerDeptDetailsObj.customerDebtProductName().click();
		customerDeptDetailsObj.customerDebtProductName().clear();
		customerDeptDetailsObj.customerDebtProductName().sendKeys(customerDeptDetailsTestData.UpdatedProductName);
	}

	@And("^update the last 24 cycle field$")
	public void update_the_last_24_cycle_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtLast24Cycle(), 10,
				1);
		customerDeptDetailsObj.customerDebtLast24Cycle().click();
		customerDeptDetailsObj.customerDebtLast24Cycle().clear();
		customerDeptDetailsObj.customerDebtLast24Cycle().sendKeys(customerDeptDetailsTestData.UpdatedLast24Cycle);
	}

	@And("^update the facility status dropdown field$")
	public void update_the_facility_status_dropdown_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtFacilityStatus(),
				10, 1);
		customerDeptDetailsObj.customerDebtFacilityStatus().click();
		String xpath = "//ion-label[text()=' " + customerDeptDetailsTestData.UpdatedFacilityStatus
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^update the remaining tenure months field$")
	public void update_the_remaining_tenure_months_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDebtRemainingTenureMonths(), 10, 1);
		customerDeptDetailsObj.customerDebtRemainingTenureMonths().click();
		customerDeptDetailsObj.customerDebtRemainingTenureMonths().clear();
		customerDeptDetailsObj.customerDebtRemainingTenureMonths()
				.sendKeys(customerDeptDetailsTestData.UpdatedRemainingTenureMonths);
	}

	@And("^update the disbursement date alander field$")
	public void update_the_disbursement_date_alander_field() throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver,
//				customerDeptDetailsObj.customerDebtDisbursementDate(), 10, 1);

		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(customerDeptDetailsObj.customerDeptDetailsDisbursementDateinput());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerDeptDetailsObj.customerDeptDetailsDisbursementDateinput().click();

		/*
		 * customerDeptDetailsObj.customerDebtDisbursementDate().click();
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * ulsCommenElement.calendarYearField(), 10, 1);
		 * ulsCommenElement.calendarYearField().click(); String monthXpath =
		 * "//span[text()=' " + customerDeptDetailsTestData.UpdatedDisbursementMonth +
		 * " ']"; String yearXpath = "//span[text()=' " +
		 * customerDeptDetailsTestData.UpdatedDisbursementYear + " ']"; String dayXpath
		 * = "//span[text()='" + customerDeptDetailsTestData.UpdatedDisbursementDay +
		 * "']";
		 * 
		 * for (int i = 0; i <= 30; i++) { try {
		 * javascriptHelper.scrollIntoView(driver.findElement(By.xpath(yearXpath)));
		 * clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(yearXpath)))
		 * ; clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(
		 * yearXpath)), driver.findElement(By.xpath(yearXpath))); break; } catch
		 * (Exception e) { if (i == 30) { Assert.fail(e.getMessage()); } } } for (int i
		 * = 0; i <= 20; i++) { try {
		 * javascriptHelper.scrollIntoView(driver.findElement(By.xpath(monthXpath)));
		 * clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(monthXpath))
		 * ); clicksAndActionsHelper.clickUsingActionClass(driver.findElement(By.xpath(
		 * monthXpath)), driver.findElement(By.xpath(monthXpath))); break; } catch
		 * (Exception e) { if (i == 20) { Assert.fail(e.getMessage()); } } }
		 * List<WebElement> dayElement = driver.findElements(By.xpath(dayXpath)); ;
		 * 
		 * for (WebElement element : dayElement) { try {
		 * clicksAndActionsHelper.moveToElement(element);
		 * clicksAndActionsHelper.clickUsingActionClass(element, element); break; }
		 * catch (Exception e) {
		 * 
		 * } }
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommenElement.calendarTodayDateButton(), 10, 1);
		ulsCommenElement.calendarTodayDateButton().click();
	}

	@And("^update the NPA classification dropdown field$")
	public void update_the_npa_classification_dropdown_field() throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtNPAClassification(),
//				10, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerDeptDetailsObj.customerDebtNPAClassification());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerDeptDetailsObj.customerDebtNPAClassification().click();
		String xpath = "//ion-label[text()=' " + customerDeptDetailsTestData.UpdatedNPAClassification
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^get the all the date inputs$")
	public void get_the_all_the_date_inputs() throws Throwable {
		String sanctionDate = "";
		String maturityDate = "";
		String nextDueDate = "";
		String closedDate = "";
		String lastPaymentDate = "";
		String disbursementDate = "";
		
		for (int i = 0; i <= 20; i++) {
			try {
				sanctionDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[0].value")
						.toString();
				if (sanctionDate != "" && sanctionDate != null) {
					testData.put("sanctionDate", sanctionDate);
					System.out.println("Sanction date " + testData.get("sanctionDate"));
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 20; i++) {
			try {
				maturityDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[1].value")
						.toString();
				if (maturityDate != "" && maturityDate != null) {
					testData.put("maturityDate", maturityDate);
					System.out.println("maturityDate " + testData.get("maturityDate"));
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 20; i++) {
			try {
				nextDueDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[2].value")
						.toString();
				if (nextDueDate != "" && nextDueDate != null) {
					testData.put("nextDueDate", nextDueDate);
					System.out.println("nextDueDate " + testData.get("nextDueDate"));
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// closedDate
		for (int i = 0; i <= 20; i++) {
			try {
				closedDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[3].value")
						.toString();
				if (closedDate != "" && closedDate != null) {
					testData.put("closedDate", closedDate);
					System.out.println("closedDate " + testData.get("closedDate"));
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// lastPaymentDate
		for (int i = 0; i <= 20; i++) {
			try {
				lastPaymentDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[4].value")
						.toString();
				if (lastPaymentDate != "" && lastPaymentDate != null) {
					testData.put("lastPaymentDate", lastPaymentDate);
					System.out.println("lastPaymentDate " + testData.get("lastPaymentDate"));
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// disbursementDate
		for (int i = 0; i <= 20; i++) {
			try {
				disbursementDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[5].value")
						.toString();
				if (disbursementDate != "" && disbursementDate != null) {
					testData.put("disbursementDate", disbursementDate);
					System.out.println("disbursementDate " + testData.get("disbursementDate"));
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^save the updated record in customerfinancial commitment record$")
	public void save_the_updated_record_in_customerfinancial_commitment_record() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerDeptDetailsObj.customerDeptDetailsSaveButton());
				customerDeptDetailsObj.customerDeptDetailsSaveButton().click();
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommenElement.ulsToastAlert(), 10, 1);
		Assert.assertEquals(ulsCommenElement.ulsToastAlert().getText(), customerDeptDetailsTestData.SaveSuccessMessage);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommenElement.ulsToastAlertClose(), 10, 1);
		ulsCommenElement.ulsToastAlertClose().click();

	}

	@Then("^verify financial type field should get updated$")
	public void verify_financial_type_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtFinanceType(), 10,
				1);

		Assert.assertTrue(customerDeptDetailsObj.customerDebtFinanceType().getAttribute("aria-label")
				.contains(customerDeptDetailsTestData.updatedFinanceType));
	}

	@Then("^verify financial institution field should get updated$")
	public void verify_financial_institution_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDebtFinancialInstitution(), 10, 1);

		Assert.assertTrue(customerDeptDetailsObj.customerDebtFinancialInstitution().getAttribute("aria-label")
				.contains(customerDeptDetailsTestData.UpdatedFinancialInstitution));
	}

	@Then("^verify account number field should get updated$")
	public void verify_account_number_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDeptDetailsAccountNumberDataHolder(), 10, 1);

		Assert.assertEquals(
				customerDeptDetailsObj.customerDeptDetailsAccountNumberDataHolder().getAttribute("ng-reflect-model"),
				customerDeptDetailsTestData.UpdatedAccountNumber);
	}

	@Then("^verify sanction amount field should get updated$")
	public void verify_sanction_amount_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDeptDetailsSansactionAmountDataHolder(), 10, 1);

		Assert.assertEquals(
				customerDeptDetailsObj.customerDeptDetailsSansactionAmountDataHolder().getAttribute("ng-reflect-model"),
				customerDeptDetailsTestData.UpdatedSanctionAmount);
	}

	@Then("^verify interest rate field should get updated$")
	public void verify_interest_rate_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDebtInterestRatedateHolder(), 10, 1);

		Assert.assertEquals(
				customerDeptDetailsObj.customerDebtInterestRatedateHolder().getAttribute("ng-reflect-model"),
				customerDeptDetailsTestData.UpdatedInterestratePercentage);
	}

	@Then("^verify current principal field should get updated$")
	public void verify_current_principal_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDeptDetailsCurrentPrincipalBalanceDataHolder(), 10, 1);

		Assert.assertEquals(customerDeptDetailsObj.customerDeptDetailsCurrentPrincipalBalanceDataHolder()
				.getAttribute("ng-reflect-model"), customerDeptDetailsTestData.UpdatedCurrentPrincipalBalance);
	}

	@Then("^verify tenure months field should get updated$")
	public void verify_tenure_months_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDeptDetailsTenureMonthsDataHolder(), 10, 1);

		Assert.assertEquals(
				customerDeptDetailsObj.customerDeptDetailsTenureMonthsDataHolder().getAttribute("ng-reflect-model"),
				customerDeptDetailsTestData.UpdatedtenureMonths);
	}

	@Then("^verify installment field should get updated$")
	public void verify_installment_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDeptDetailsInstallmentAmountDataHolder(), 10, 1);

		Assert.assertEquals(customerDeptDetailsObj.customerDeptDetailsInstallmentAmountDataHolder()
				.getAttribute("ng-reflect-model"), customerDeptDetailsTestData.UpdatedInstallmentAmount);
	}

	@Then("^verify amount considered field should get updated$")
	public void verify_amount_considered_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDeptDetailsAmountConsideredDataHolder(), 10, 1);

		Assert.assertEquals(
				customerDeptDetailsObj.customerDeptDetailsAmountConsideredDataHolder().getAttribute("ng-reflect-model"),
				customerDeptDetailsTestData.UpdatedAmountConsidered);
	}

	@Then("^verify currency field should get updated$")
	public void verify_currency_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtCurrency(), 10, 1);

		Assert.assertTrue(customerDeptDetailsObj.customerDebtCurrency().getAttribute("aria-label")
				.contains(customerDeptDetailsTestData.UpdatedCurrency));
	}

	@Then("^verify remarks field should get updated$")
	public void verify_remarks_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtRemarks(), 10, 1);
		Assert.assertEquals(customerDeptDetailsObj.customerDebtRemarks().getText(),
				customerDeptDetailsTestData.UpdatedRemarks);
	}

	@Then("^verify next duedate field should get updated$")
	public void verify_next_duedate_field_should_get_updated() throws Throwable {
		String closedDate = "";
		for (int i = 0; i <= 20; i++) {
			try {
				closedDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[3].value")
						.toString();
				if (closedDate != "" && closedDate != null) {
//					testData.put("closedDate", closedDate);
//					System.out.println("closedDate " + testData.get("closedDate"));
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(closedDate, testData.get("closedDate"));
	}

	@Then("^verify collateral type field should get updated$")
	public void verify_collateral_type_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtCollateralType(),
				10, 1);

		Assert.assertTrue(customerDeptDetailsObj.customerDebtCollateralType().getAttribute("aria-label")
				.contains(customerDeptDetailsTestData.UpdatedCollateralType));
	}

	@Then("^verify frequenc field should get updated$")
	public void verify_frequenc_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtFrequency(), 10, 1);

		Assert.assertTrue(customerDeptDetailsObj.customerDebtFrequency().getAttribute("aria-label")
				.contains(customerDeptDetailsTestData.UpdatedFrequency));
	}

	@Then("^verify last payment amount field should get updated$")
	public void verify_last_payment_amount_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDeptDetailsLastPaymentAmountDataHolder(), 10, 1);

		Assert.assertEquals(customerDeptDetailsObj.customerDeptDetailsLastPaymentAmountDataHolder()
				.getAttribute("ng-reflect-model"), customerDeptDetailsTestData.UpdatedLastPaymentAmount);
	}

	@Then("^verify last payment date field should get updated$")
	public void verify_last_payment_date_field_should_get_updated() throws Throwable {
		// lastPaymentDate
		String lastPaymentDate = "";
		for (int i = 0; i <= 20; i++) {
			try {
				lastPaymentDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[4].value")
						.toString();
				if (lastPaymentDate != "" && lastPaymentDate != null) {

					break;
				}

			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(lastPaymentDate, testData.get("lastPaymentDate"));
	}

	@Then("^verify product name field should get updated$")
	public void verify_product_name_field_should_get_updated() throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver,
//				customerDeptDetailsObj.customerDebtProductName(), 10, 1);
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.scrollIntoView(customerDeptDetailsObj.customerDebtProductNameDataHolder());
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}

		Assert.assertEquals(customerDeptDetailsObj.customerDebtProductNameDataHolder().getAttribute("ng-reflect-model"),
				customerDeptDetailsTestData.UpdatedProductName);
	}

	@Then("^verify last 24 field should get updated$")
	public void verify_last_24_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDebtLast24CycleDataHolder(), 10, 1);

		Assert.assertEquals(customerDeptDetailsObj.customerDebtLast24CycleDataHolder().getAttribute("ng-reflect-model"),
				customerDeptDetailsTestData.UpdatedLast24Cycle);
	}

	@Then("^verify facility status field should get updated$")
	public void verify_facility_status_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtFacilityStatus(),
				10, 1);
		Assert.assertTrue(customerDeptDetailsObj.customerDebtFacilityStatus().getAttribute("aria-label")
				.contains(customerDeptDetailsTestData.UpdatedFacilityStatus));

	}

	@Then("^verify remaining tenure field should get updated$")
	public void verify_remaining_tenure_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDebtRemainingTenureMonthsDataHolder(), 10, 1);

		Assert.assertEquals(
				customerDeptDetailsObj.customerDebtRemainingTenureMonthsDataHolder().getAttribute("ng-reflect-model"),
				customerDeptDetailsTestData.UpdatedRemainingTenureMonths);
	}

	@Then("^verify disbursement date field should get updated$")
	public void verify_disbursement_date_field_should_get_updated() throws Throwable {
		// disbursementDate
		String disbursementDate = "";
		for (int i = 0; i <= 20; i++) {
			try {
				disbursementDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[5].value")
						.toString();
				if (disbursementDate != "" && disbursementDate != null) {

					break;
				} else if (i == 20) {
					Assert.fail(disbursementDate + " Is null hence test case failed");
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertEquals(disbursementDate, testData.get("disbursementDate"));
	}

	@Then("^verify NPA clasification field should get updated$")
	public void verify_npa_clasification_field_should_get_updated() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtNPAClassification(),
				10, 1);

		Assert.assertEquals(customerDeptDetailsObj.customerDebtLast24CycleDataHolder().getAttribute("ng-reflect-model"),
				customerDeptDetailsTestData.UpdatedLast24Cycle);
	}

	@Then("^verify sanctiondate field should get updated$")
	public void verify_sanctiondate_field_should_get_updated() throws Throwable {
		String sanctionDate = "";
		for (int i = 0; i <= 20; i++) {
			try {
				sanctionDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[0].value")
						.toString();
				if (sanctionDate != "" && sanctionDate != null) {
//					testData.put("sanctionDate", sanctionDate);
//					System.out.println("Sanction date " + testData.get("sanctionDate"));
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		//Assert.assertEquals(sanctionDate, testData.get("sanctionDate"));
	}

	@Then("^verify maturity date field should get updated$")
	public void verify_maturity_date_field_should_get_updated() throws Throwable {
		String maturityDate="";
		for (int i = 0; i <= 20; i++) {
			try {
				maturityDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[1].value")
						.toString();
				if (maturityDate != "" && maturityDate != null) {
//					testData.put("maturityDate", maturityDate);
//					System.out.println("Sanction date " + testData.get("maturityDate"));
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		//Assert.assertEquals(maturityDate, testData.get("maturityDate"));
	}

	@Then("^verify next due date field should get updated$")
	public void verify_next_due_date_field_should_get_updated() throws Throwable {
		// closedDate
		String closedDate = "";
		for (int i = 0; i <= 20; i++) {
			try {
				closedDate = javascriptHelper
						.executeScript("return document.getElementsByClassName('p-inputtext p-component')[3].value")
						.toString();
				if (closedDate != "" && closedDate != null) {
//					testData.put("closedDate", closedDate);
//					System.out.println("closedDate " + testData.get("closedDate"));
					break;
				}
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		//Assert.assertEquals(closedDate, testData.get("closedDate"));
	}

	//*************@AT_DD_04****************//
	
    @And("^Reupdate the finance type dropdown fied$")
    public void reupdate_the_finance_type_dropdown_fied() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtFinanceType(), 10,
				1);
		customerDeptDetailsObj.customerDebtFinanceType().click();
		String xpath = "//ion-label[text()=' " + customerDeptDetailsTestData.ReupdatedFinanceType
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("^Reupdate the financial institution dropdown field$")
    public void reupdate_the_financial_institution_dropdown_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerDeptDetailsObj.customerDebtFinancialInstitution(), 10, 1);
		customerDeptDetailsObj.customerDebtFinancialInstitution().click();
		String xpath = "//ion-label[text()=' " + customerDeptDetailsTestData.ReUpdatedFinancialInstitution
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("^Reupdate the account number field$")
    public void reupdate_the_account_number_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtAccountNumber(), 10,
				1);
		customerDeptDetailsObj.customerDebtAccountNumber().click();
		customerDeptDetailsObj.customerDebtAccountNumber().clear();
		customerDeptDetailsObj.customerDebtAccountNumber().sendKeys(customerDeptDetailsTestData.ReUpdatedAccountNumber);
    }

    @And("^Reupdate the sanction amount$")
    public void reupdate_the_sanction_amount() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtSanctionAmount(), 10,1);
		customerDeptDetailsObj.customerDebtSanctionAmount().click();
		for (int i = 0; i < 10; i++) {
			try {
			customerDeptDetailsObj.customerDebtSanctionAmount().sendKeys(Keys.BACK_SPACE);
			
			}
			catch(Exception e)
			{
				
			}
		}
		
		
    }
    
    @And("^user update Invalid data to interest rate percentage field$")
    public void user_update_invalid_data_to_interest_rate_percentage_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDebtInterestRate(), 10,1);
		customerDeptDetailsObj.customerDebtInterestRate().click();
		customerDeptDetailsObj.customerDebtInterestRate().clear();
		customerDeptDetailsObj.customerDebtInterestRate().sendKeys(customerDeptDetailsTestData.InvalidUpdatedInterestratePercentage);
    }

    @And("^user verify the validation Messgae for Blank Field$")
    public void user_verify_the_validation_messgae_for_Blank_Field() throws Throwable {
		
    	String validation1 = "Required field";
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDeptDetails_validate1(), 10,1);
		String Result1 = customerDeptDetailsObj.customerDeptDetails_validate1().getText();
		Assert.assertEquals(validation1, Result1);
    }
    
    @And("^user click on back button$")
    public void user_click_on_back_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDeptDetails_Backbtn(), 10,1);
		customerDeptDetailsObj.customerDeptDetails_Backbtn().click();
    }
    
    @And("^user verify the validation Messgae for Invalid data$")
    public void user_verify_the_validation_messgae_for_invalid_data() throws Throwable {
    	String validation = "Positive Integer Allowed";
		waitHelper.waitForElementToVisibleWithFluentWait(driver, customerDeptDetailsObj.customerDeptDetails_validate(), 10,1);
		String Result = customerDeptDetailsObj.customerDeptDetails_validate().getText();
		Assert.assertEquals(validation, Result);

    	
    }
}
