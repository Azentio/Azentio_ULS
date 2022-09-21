package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.SubProduct_Master_RetailOBJ;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import testDataType.KULS_Login_TestDataType;
import testDataType.SubProductRetailParameterNegativeTestDataType;

public class SubproductRetailParameterNegativeStep {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	SubProduct_Master_RetailOBJ subretail = new SubProduct_Master_RetailOBJ(driver);
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	FindFieldisMandatoryorNot morn = new FindFieldisMandatoryorNot(driver);

	SubProductRetailParameterNegativeTestDataType paradata1 = jsonConfig.getSubParameterNegativeListByName("Maker");

	SubProduct_Master_RetailOBJ parameter = new SubProduct_Master_RetailOBJ(driver);

	@Given("^Maker Login in subproduct retail master$")
	public void maker_login_in_subproduct_retail_master() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		// login
		applicationLogin.loginUlsApplicationAsMaker(loginData.Username, loginData.Password);
		/*help.waitForElementToVisibleWithFluentWait(driver, subretail.username(), 60, 5);
		subretail.username().click();
		subretail.username().sendKeys("in00135");

		help.waitForElementToVisibleWithFluentWait(driver, subretail.con(), 60, 5);
		subretail.con().click();

		help.waitForElementToVisibleWithFluentWait(driver, subretail.pass(), 60, 5);
		subretail.pass().click();
		subretail.pass().sendKeys("admin");

		help.waitForElementToVisibleWithFluentWait(driver, subretail.sign(), 60, 5);
		subretail.sign().click();*/

	}

	@Then("^Click the subproductretail master and parameter$")
	public void click_the_subproductretail_master_and_parameter() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, subretail.productsetup(), 60, 5);
		subretail.productsetup().click();

		help.waitForElementToVisibleWithFluentWait(driver, subretail.eyeicon(), 60, 5);
		subretail.eyeicon().click();

		help.waitForElementToVisibleWithFluentWait(driver, subretail.pencil(), 60, 5);
		subretail.pencil().click();

		help.waitForElementToVisibleWithFluentWait(driver, subretail.parameter(), 60, 5);
		subretail.parameter().click();

	}

	@Then("^Enter the save icon$")
	public void enter_the_save_icon() throws Throwable {

		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.Save());
		// help.waitForElementToVisibleWithFluentWait(driver, parameter.Save(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				parameter.Save().click();

			} catch (Exception e) {

			}

		}

	}

	@Then("^Get the validation message$")
	public void get_the_validation_message() throws Throwable {

		/*
		 * System.out.println(parameter.invalid().getText()); for(int i=0; i<0; i++) {
		 * try { System.out.println(parameter.reqfields().getText()); break; } catch
		 * (Exception e) {
		 * 
		 * } }
		 */
		WebElement nameErrorMessage = driver
				.findElement(By.xpath("//digital-form-error//ion-badge"));
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

	@And("^Enter the details in subproduct parameters fields$")
	public void enter_the_details_in_subproduct_parameters_fields() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, parameter.loanCurrency(), 60, 5);

		parameter.loanCurrency().click();

		// String xpa = "//ion-label[contains(text(),'"+paradata1.LoanCurrency+"')]";

		// WebElement loan = driver.findElement(By.xpath(xpa));
		// loan.click();
		// driver.findElement(By.xpath("//ion-label[contains(text(),'"+paradata1.LoanCurrency+"')]//following-sibling::ion-radio")).click();

		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + paradata1.LoanCurrency + "')]//following-sibling::ion-radio"))
						.click();

				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.indexationCurrency(), 60, 5);

		parameter.indexationCurrency().click();

		String xpa1 = "//ion-label[contains(text(),'" + paradata1.IndexationCurrency
				+ "')]//following-sibling::ion-radio";
		for (int i = 0; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpa1)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.minimumFinanceAmount(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				parameter.minimumFinanceAmount();
				parameter.minimumFinanceAmount().sendKeys(paradata1.MinFinanceAmount);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maximumFinanceAmount(), 60, 5);

		parameter.maximumFinanceAmount().click();
		parameter.maximumFinanceAmount().sendKeys(paradata1.MaxFinanceAmount);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minTenorInMonths(), 60, 5);

		parameter.minTenorInMonths().click();
		parameter.minTenorInMonths().sendKeys(paradata1.MinTenorInMonths);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxTenorInMonths(), 60, 5);

		parameter.maxTenorInMonths().click();
		parameter.maxTenorInMonths().sendKeys(paradata1.MaxTenorInMonths);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.repaymentType(), 60, 5);

		parameter.repaymentType().click();

		String xpath = "//ion-label[contains(text(),'" + paradata1.RepaymentType + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.flatReducing(), 60, 5);

		parameter.flatReducing().click();

		String xpath1 = "//ion-label[contains(text(),'" + paradata1.FlatReducing + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath1)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.intAmortizationMethod(), 60, 5);

		parameter.intAmortizationMethod().click();

		String xpath2 = "//ion-label[contains(text(),'" + paradata1.IntAmortizationMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.computeInstallmentOn(), 60, 5);

		parameter.computeInstallmentOn().click();

		String xpath3 = "//ion-label[contains(text(),'" + paradata1.ComputeInstallmentOn
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath3)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.instDueDateMethod(), 60, 5);

		parameter.instDueDateMethod().click();

		String xpath4 = "//ion-label[contains(text(),'" + paradata1.InstDueDateMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath4)).click();
				break;

			} catch (Exception e) {

			}
		}

		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.lpcGracePeriod());
		help.waitForElementToVisibleWithFluentWait(driver, parameter.lpcGracePeriod(), 60, 5);

		parameter.lpcGracePeriod().click();
		parameter.lpcGracePeriod().sendKeys(paradata1.LPCGracePeriod);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.principalRepaymentFrequency(), 60, 5);

		parameter.principalRepaymentFrequency().click();

		String xpath5 = "//ion-label[contains(text(),'" + paradata1.PrincipalRepaymentFrequency
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath5)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestRepaymentFrequency(), 60, 5);

		parameter.interestRepaymentFrequency().click();

		String xpath6 = "//ion-label[contains(text(),'" + paradata1.InterestRepaymentFrequency
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath6)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.instRoundingLogic(), 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.instRoundingLogic().click();
				parameter.instRoundingLogic().sendKeys(paradata1.InstRoundingLogic);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.loanElegibilityCalc(), 60, 5);

		parameter.loanElegibilityCalc().click();

		String xpath7 = "//ion-label[contains(text(),'" + paradata1.LoanElegibilityCalc
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath7)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver, parameter.remarks(), 60,
		// 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.remarks().click();
				parameter.remarks().sendKeys(paradata1.Remark);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.includeGuarantorInc(), 60, 5);

		parameter.includeGuarantorInc().click();

		String xpath8 = "//ion-label[contains(text(),'" + paradata1.IncludeGuarantorInc
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath8)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.duePeriodRequired(), 60, 5);

		parameter.duePeriodRequired().click();

		String xpath9 = "//ion-label[contains(text(),'" + paradata1.DuePeriodRequired
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath9)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.maxCoapplicants(), 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.maxCoapplicants().click();
				parameter.maxCoapplicants().sendKeys(paradata1.MaxCoApplication);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxGuarantors(), 60, 5);

		parameter.maxGuarantors().click();
		parameter.maxGuarantors().sendKeys(paradata1.MaxGuarantors);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.instCommenceFrom(), 60, 5);

		parameter.instCommenceFrom().click();

		String xpath10 = "//ion-label[contains(text(),'" + paradata1.InstCommenceFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath10)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.daysInYear());

		help.waitForElementToVisibleWithFluentWait(driver, parameter.daysInYear(), 60, 5);

		parameter.daysInYear().click();

		String xpath11 = "//ion-label[contains(text(),'" + paradata1.DaysInYear + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath11)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.multipleDisbursTranchAllowed(), 60, 5);

		parameter.multipleDisbursTranchAllowed().click();

		String xpath12 = "//ion-label[contains(text(),'" + paradata1.MultipleDisbursTranchAllowed
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath12)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.includeIncomeDeduDebt(), 60, 5);

		parameter.includeIncomeDeduDebt().click();

		String xpath13 = "//ion-label[contains(text(),'" + paradata1.IncludeIncomeDeduDebt
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath13)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.roundOff(), 60, 5);

		parameter.roundOff().click();

		String xpath14 = "//ion-label[contains(text(),'" + paradata1.RoundOff + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath14)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver, parameter.roundOffValue(),
		// 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.roundOffValue().click();
				parameter.roundOffValue().sendKeys(paradata1.RoundOffValue);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.offerValidityDays(), 60, 5);

		parameter.offerValidityDays().click();
		parameter.offerValidityDays().sendKeys(paradata1.OfferValidityDays);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.appropriationCode(), 60, 5);

		parameter.appropriationCode().click();

		String xpath15 = "//ion-label[contains(text(),'" + paradata1.AppropriationCode
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath15)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.balloonAllowed());

		help.waitForElementToVisibleWithFluentWait(driver, parameter.balloonAllowed(), 60, 5);

		parameter.balloonAllowed().click();

		String xpath16 = "//ion-label[contains(text(),'" + paradata1.BalloonAllowed
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath16)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.maximumBalloonPercentage(), 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.maximumBalloonPercentage().click();
				parameter.maximumBalloonPercentage().sendKeys(paradata1.MaxBalloonPercentage);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minIRR(), 60, 5);

		parameter.minIRR().click();
		parameter.minIRR().sendKeys(paradata1.MinIRR);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxIRR(), 60, 5);

		parameter.maxIRR().click();
		parameter.maxIRR().sendKeys(paradata1.MaxIRR);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.preOwnedAsset(), 60, 5);

		parameter.preOwnedAsset().click();

		String xpath17 = "//ion-label[contains(text(),'" + paradata1.PreOwnedAsset
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath17)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.discountingFactorRounding());

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.discountingFactorRounding(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				parameter.discountingFactorRounding().click();
				parameter.discountingFactorRounding().sendKeys(paradata1.DiscountingFactorRounding);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.dayCountConventionForBPI(), 60, 5);

		parameter.dayCountConventionForBPI().click();

		String xpath18 = "//ion-label[contains(text(),'" + paradata1.DayCountConventionForBPI
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath18)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestChargingStartsFrom(), 60, 5);

		parameter.interestChargingStartsFrom().click();

		String xpath19 = "//ion-label[contains(text(),'" + paradata1.InterestChargingStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath19)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRecovery(), 60, 5);

		parameter.bpiRecovery().click();

		String xpath20 = "//ion-label[contains(text(),'" + paradata1.BpiRecovery + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath20)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.installmentRecoveryType(), 60, 5);

		parameter.installmentRecoveryType().click();

		String xpath21 = "//ion-label[contains(text(),'" + paradata1.InstallmentRecoveryType
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath21)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.isStepupAllowed(), 60, 5);
		parameter.isStepupAllowed().click();

		String xpath22 = "//ion-label[contains(text(),'" + paradata1.IsStepupAllowed
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath22)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.rateType(), 60, 5);

		parameter.rateType().click();

		String xpath23 = "//ion-label[contains(text(),'" + paradata1.RateType + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath23)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.initiateDiscFactor());

		help.waitForElementToVisibleWithFluentWait(driver, parameter.initiateDiscFactor(), 60, 5);

		parameter.initiateDiscFactor().click();

		String xpath24 = "//ion-label[contains(text(),'" + paradata1.InitiateDiscFactor
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath24)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the details in bulkpayment fields$")
	public void enter_the_details_in_bulkpayment_fields() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPayment1(), 60, 5);

		parameter.bulkPayment1().click();

		Thread.sleep(3000);

		String xpath25 = "//ion-label[contains(text(),'" + paradata1.bulkPayment + "')]//following-sibling::ion-radio";
		help.waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath25)), 80, 5);
		driver.findElement(By.xpath(xpath25)).click();

		for (int i = 0; i < 20; i++) {
			try {
				parameter.noOfBulkPaymentInAYear().click();
				parameter.noOfBulkPaymentInAYear().sendKeys(paradata1.NoOfBulkPaymentInAYear);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPaymentLockinPeriod(), 60, 5);

		parameter.bulkPaymentLockinPeriod().click();
		parameter.bulkPaymentLockinPeriod().sendKeys(paradata1.BulkPaymentLockinPeriod);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPaymentTimeInterval(), 60, 5);

		parameter.bulkPaymentTimeInterval().click();
		parameter.bulkPaymentTimeInterval().sendKeys(paradata1.BulkPaymentTimeInterval);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.immediateDueDate(), 60, 5);

		parameter.immediateDueDate().click();

		String xpath26 = "//ion-label[contains(text(),'" + paradata1.immediateDueDate
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath26)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPaymentLockinStartsFrom(), 60, 5);

		parameter.bulkPaymentLockinStartsFrom().click();

		String xpath27 = "//ion-label[contains(text(),'" + paradata1.bulkPaymentLockinStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath27)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minBulkPaymentParameter(), 60, 5);

		parameter.minBulkPaymentParameter().click();

		String xpath28 = "//ion-label[contains(text(),'" + paradata1.minBulkPaymentParameter
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath28)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.minBulkPaymentValue(), 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.minBulkPaymentValue().click();
				parameter.minBulkPaymentValue().sendKeys(paradata1.MinBulkPaymentValue);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxBulkPaymentparameters(), 60, 5);

		parameter.maxBulkPaymentparameters().click();

		String xpath29 = "//ion-label[contains(text(),'" + paradata1.maxBulkPaymentparameters
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath29)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.maxBulkPaymentvalue());

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.maxBulkPaymentvalue(), 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.maxBulkPaymentvalue().click();
				parameter.maxBulkPaymentvalue().sendKeys(paradata1.MaxBulkPaymentValue);
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the details in foreclosure fields$")
	public void enter_the_details_in_foreclosure_fields() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, parameter.foreClosureLockin(), 60, 5);

		parameter.foreClosureLockin().click();
		parameter.foreClosureLockin().sendKeys(paradata1.ForeClosureLockin);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.foreClosureLockInStartsFrom(), 60, 5);

		parameter.foreClosureLockInStartsFrom().click();

		String xpath30 = "//ion-label[contains(text(),'" + paradata1.foreClosureLockInStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath30)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minRebateParameter(), 60, 5);

		parameter.minRebateParameter().click();

		String xpath31 = "//ion-label[contains(text(),'" + paradata1.minRebateParameter
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath31)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.minRebatevalue(), 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.minRebatevalue().click();
				parameter.minRebatevalue().sendKeys(paradata1.MinRebatevalue);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxRebateParameter(), 60, 5);

		parameter.maxRebateParameter().click();

		String xpath32 = "//ion-label[contains(text(),'" + paradata1.maxRebateParameter
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath32)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.maxRebatevalue());

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.maxRebatevalue(), 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.maxRebatevalue().click();
				parameter.maxRebatevalue().sendKeys(paradata1.MaxRebateValue);
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the details in reschedulement fields$")
	public void enter_the_details_in_reschedulement_fields() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, parameter.reschLockin(), 60, 5);

		parameter.reschLockin().click();
		parameter.reschLockin().sendKeys(paradata1.ReschLockin);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxReschInaYear(), 60, 5);

		parameter.maxReschInaYear().click();
		parameter.maxReschInaYear().sendKeys(paradata1.MaxReschInAYear);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.totalReschAllowed(), 60, 5);

		parameter.totalReschAllowed().click();
		parameter.totalReschAllowed().sendKeys(paradata1.TotalReachAllowed);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.reschedulementLockInStartsFrom(), 60, 5);

		parameter.reschedulementLockInStartsFrom().click();

		String xpath33 = "//ion-label[contains(text(),'" + paradata1.reschedulementLockInStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath33)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the details in moratorium/Grace period month fields$")
	public void enter_the_details_in_moratoriumgrace_period_month_fields() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestHoliday(), 60, 5);

		parameter.interestHoliday().click();
		parameter.interestHoliday().sendKeys(paradata1.InterestHoliday);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.principalHoliday(), 60, 5);

		parameter.principalHoliday().click();
		parameter.principalHoliday().sendKeys(paradata1.PrincipalHoliday);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestComputed(), 60, 5);

		parameter.interestComputed().click();

		String xpath34 = "//ion-label[contains(text(),'" + paradata1.interestComputed
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath34)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.moratoriumStartMonthorInstallment());
		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.moratoriumStartMonthorInstallment(), 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.moratoriumStartMonthorInstallment().click();
				parameter.moratoriumStartMonthorInstallment().sendKeys(paradata1.MoratoriumStartMonthorInstallment);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.recomputationofProfit(), 60, 5);

		parameter.recomputationofProfit().click();

		String xpath35 = "//ion-label[contains(text(),'" + paradata1.recomputationofProfit
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath35)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the details in pre-EMI fields$")
	public void enter_the_details_in_preemi_fields() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, parameter.preEMI(), 60, 5);

		parameter.preEMI().click();

		String xpath36 = "//ion-label[contains(text(),'" + paradata1.preEMI + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath36)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.preEMIInstallment(), 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				parameter.preEMIInstallment().click();
				parameter.preEMIInstallment().sendKeys(paradata1.NoOfPreEMIInstallment);
				break;
			} catch (Exception e) {

			}
		}
		help.waitForElementToVisibleWithFluentWait(driver, parameter.invalid(), 60, 5);
		System.out.println(parameter.invalid().getText());

		help.waitForElementToVisibleWithFluentWait(driver, parameter.miRecoveryToBeRenamedAs(), 60, 5);

		parameter.miRecoveryToBeRenamedAs().click();

		String xpath37 = "//ion-label[contains(text(),'" + paradata1.miRecoveryToBeRenamedAs
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath37)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.bpiRepaymentTenureMethod());

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRepaymentTenureMethod(), 60, 5);

		parameter.bpiRepaymentTenureMethod().click();

		String xpath38 = "//ion-label[contains(text(),'" + paradata1.bpiRepaymentTenureMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath38)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRateMethod(), 60, 5);

		parameter.bpiRateMethod().click();

		String xpath39 = "//ion-label[contains(text(),'" + paradata1.bpiRateMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath39)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRepaymentFrequency(), 60, 5);

		parameter.bpiRepaymentFrequency().click();

		String xpath40 = "//ion-label[contains(text(),'" + paradata1.bpiRepaymentFrequency
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath40)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.tdsApplicable(), 60, 5);

		parameter.tdsApplicable().click();

		String xpath41 = "//ion-label[contains(text(),'" + paradata1.tdsApplicable
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath41)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.moratoriumTenureType(), 60, 5);

		parameter.moratoriumTenureType().click();

		String xpath42 = "//ion-label[contains(text(),'" + paradata1.moratoriumTenureType
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath42)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

}
