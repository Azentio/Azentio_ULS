package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.SubProductRetailParameterTestDataType;

public class SubProductRetailMasterParameterStep extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	SubProduct_Master_RetailOBJ subretail = new SubProduct_Master_RetailOBJ(driver);
	WaitHelper help = new WaitHelper(driver);
	//KULS_Login login = new KULS_Login();
	FindFieldisMandatoryorNot findFieldsMandatotyOrNot = new FindFieldisMandatoryorNot(driver);

	SubProductRetailParameterTestDataType paradata = jsonConfig.getSubParameterListByName("Maker");

	SubProduct_Master_RetailOBJ parameter = new SubProduct_Master_RetailOBJ(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();

	
	@Then("^Click the subproductretail master$")
	public void click_the_subproductretail_master() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, subretail.productsetup(), 60, 5);
		subretail.productsetup().click();

		help.waitForElementToVisibleWithFluentWait(driver, subretail.eyeicon(), 60, 5);
		subretail.eyeicon().click();
	}

	@Then("^Verify the back arrow function$")
	public void verify_the_back_arrow_function() throws Throwable {

	//	help.waitForElementToVisibleWithFluentWaitElementToBeClickable(driver, subretail.pencil(),60, 5);
		for(int i=0; i<20; i++) {
			try {
				subretail.pencil().click();
				break;
			} catch (Exception e) {
				
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, subretail.parameter(), 60, 5);
		subretail.parameter().click();

		// help.waitForElementToVisibleWithFluentWait(driver, subretail.back(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				subretail.back().click();
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, subretail.pencil(), 60, 5);
		subretail.pencil().click();

		help.waitForElementToVisibleWithFluentWait(driver, subretail.parameter(), 60, 5);
		subretail.parameter().click();
	}

	@Then("^Enter the required sub product parameters fields in maker$")
	public void enter_the_required_sub_product_parameters_fields_in_maker() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, parameter.loanCurrency(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Loan Currency");
		parameter.loanCurrency().click();

		// String xpa = "//ion-label[contains(text(),'"+paradata.LoanCurrency+"')]";

		// WebElement loan = driver.findElement(By.xpath(xpa));
		// loan.click();
		// driver.findElement(By.xpath("//ion-label[contains(text(),'"+paradata.LoanCurrency+"')]//following-sibling::ion-radio")).click();

		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + paradata.LoanCurrency + "')]//following-sibling::ion-radio"))
						.click();

				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.indexationCurrency(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Indexation Currency");
		parameter.indexationCurrency().click();

		String xpa1 = "//ion-label[contains(text(),'" + paradata.IndexationCurrency
				+ "')]//following-sibling::ion-radio";
		for (int i = 0; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpa1)).click();
				break;

			} catch (Exception e) {

			}
		}
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Minimum Finance Amount");
		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.minimumFinanceAmount(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				parameter.minimumFinanceAmount();
				parameter.minimumFinanceAmount().sendKeys(paradata.MinFinanceAmount);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maximumFinanceAmount(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Maximum Finance Amount");
		parameter.maximumFinanceAmount().click();
		parameter.maximumFinanceAmount().sendKeys(paradata.MaxFinanceAmount);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minTenorInMonths(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Min Tenor In Months");
		parameter.minTenorInMonths().click();
		parameter.minTenorInMonths().sendKeys(paradata.MinTenorInMonths);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxTenorInMonths(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Max Tenor In Months");
		parameter.maxTenorInMonths().click();
		parameter.maxTenorInMonths().sendKeys(paradata.MaxTenorInMonths);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.repaymentType(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Repayment Type");
		parameter.repaymentType().click();

		String xpath = "//ion-label[contains(text(),'" + paradata.RepaymentType + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.flatReducing(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Flat/Reducing");
		parameter.flatReducing().click();

		String xpath1 = "//ion-label[contains(text(),'" + paradata.FlatReducing + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath1)).click();
				break;

			} catch (Exception e) {

			}
		}

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.intAmortizationMethod(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Int. Amortization Method");
		for (int i = 0; i <20; i++) {
			try {
				parameter.intAmortizationMethod().click();
				break;
			} catch (Exception e) {
				
			}
		}
		

		String xpath2 = "//ion-label[contains(text(),'" + paradata.IntAmortizationMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.computeInstallmentOn(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Compute Installment on");
		parameter.computeInstallmentOn().click();

		String xpath3 = "//ion-label[contains(text(),'" + paradata.ComputeInstallmentOn
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath3)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.instDueDateMethod(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Inst. due date method");
		parameter.instDueDateMethod().click();

		String xpath4 = "//ion-label[contains(text(),'" + paradata.InstDueDateMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath4)).click();
				break;

			} catch (Exception e) {

			}
		}

		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.lpcGracePeriod());
		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.lpcGracePeriod(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("LPC grace period (days)");

		for (int i = 0; i < 20; i++) {
			try {
				parameter.lpcGracePeriod().click();
				parameter.lpcGracePeriod().sendKeys(paradata.LPCGracePeriod);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.principalRepaymentFrequency(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Principal Repayment Frequency");
		parameter.principalRepaymentFrequency().click();

		String xpath5 = "//ion-label[contains(text(),'" + paradata.PrincipalRepaymentFrequency
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath5)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestRepaymentFrequency(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Interest Repayment Frequency");
		parameter.interestRepaymentFrequency().click();

		String xpath6 = "//ion-label[contains(text(),'" + paradata.InterestRepaymentFrequency
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Inst. Rounding Logic");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.instRoundingLogic().click();
				parameter.instRoundingLogic().sendKeys(paradata.InstRoundingLogic);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.loanElegibilityCalc(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Loan Eligibility Calc.");
		parameter.loanElegibilityCalc().click();

		String xpath7 = "//ion-label[contains(text(),'" + paradata.LoanElegibilityCalc
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Remarks");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.remarks().click();
				parameter.remarks().sendKeys(paradata.Remark);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.includeGuarantorInc(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Include Guarantor Inc.");
		parameter.includeGuarantorInc().click();

		String xpath8 = "//ion-label[contains(text(),'" + paradata.IncludeGuarantorInc
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath8)).click();
				break;

			} catch (Exception e) {

			}
		}
        seleniumactions.getJavascriptHelper().scrollIntoView(parameter.duePeriodRequired());
		help.waitForElementToVisibleWithFluentWait(driver, parameter.duePeriodRequired(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Due Period Required");
		parameter.duePeriodRequired().click();

		String xpath9 = "//ion-label[contains(text(),'" + paradata.DuePeriodRequired
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Max Coapplicants");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.maxCoapplicants().click();
				parameter.maxCoapplicants().sendKeys(paradata.MaxCoApplication);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxGuarantors(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Max Guarantors");
		parameter.maxGuarantors().click();
		parameter.maxGuarantors().sendKeys(paradata.MaxGuarantors);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.instCommenceFrom(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Inst. Commence From");
		parameter.instCommenceFrom().click();

		String xpath10 = "//ion-label[contains(text(),'" + paradata.InstCommenceFrom
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Days In Year");
		parameter.daysInYear().click();

		String xpath11 = "//ion-label[contains(text(),'" + paradata.DaysInYear + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath11)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.multipleDisbursTranchAllowed(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Multiple Disburs. Tranch Allowed");
		parameter.multipleDisbursTranchAllowed().click();

		String xpath12 = "//ion-label[contains(text(),'" + paradata.MultipleDisbursTranchAllowed
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath12)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.includeIncomeDeduDebt(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Include Income Dedu. Debt");
		parameter.includeIncomeDeduDebt().click();

		String xpath13 = "//ion-label[contains(text(),'" + paradata.IncludeIncomeDeduDebt
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath13)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.roundOff(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Round Off");
		parameter.roundOff().click();

		String xpath14 = "//ion-label[contains(text(),'" + paradata.RoundOff + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath14)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver, parameter.roundOffValue(),
		// 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("RoundOff Value");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.roundOffValue().click();
				parameter.roundOffValue().sendKeys(paradata.RoundOffValue);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.offerValidityDays(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Offer Validity (Days)");
		parameter.offerValidityDays().click();
		parameter.offerValidityDays().sendKeys(paradata.OfferValidityDays);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.appropriationCode(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Appropriation Code");
		parameter.appropriationCode().click();

		String xpath15 = "//ion-label[contains(text(),'" + paradata.AppropriationCode
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Balloon Allowed");
		parameter.balloonAllowed().click();

		String xpath16 = "//ion-label[contains(text(),'" + paradata.BalloonAllowed
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Maximum Balloon Percentage");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.maximumBalloonPercentage().click();
				parameter.maximumBalloonPercentage().sendKeys(paradata.MaxBalloonPercentage);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minIRR(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Min IRR");
		parameter.minIRR().click();
		parameter.minIRR().sendKeys(paradata.MinIRR);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxIRR(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Max IRR");
		parameter.maxIRR().click();
		parameter.maxIRR().sendKeys(paradata.MaxIRR);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.preOwnedAsset(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Pre-owned Asset");
		parameter.preOwnedAsset().click();

		String xpath17 = "//ion-label[contains(text(),'" + paradata.PreOwnedAsset + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath17)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.discountingFactorRounding());
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Discounting Factor Rounding");

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.discountingFactorRounding(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				parameter.discountingFactorRounding().click();
				parameter.discountingFactorRounding().sendKeys(paradata.DiscountingFactorRounding);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.dayCountConventionForBPI(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Day Count Convention for BPI");
		for (int i = 1; i < 20; i++) {
			try {
				parameter.dayCountConventionForBPI().click();
				break;

			} catch (Exception e) {

			}
		}
		

		String xpath18 = "//ion-label[contains(text(),'" + paradata.DayCountConventionForBPI
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath18)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestChargingStartsFrom(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Interest Charging Starts From");
		parameter.interestChargingStartsFrom().click();

		String xpath19 = "//ion-label[contains(text(),'" + paradata.InterestChargingStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath19)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRecovery(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("BPI Recovery");
		parameter.bpiRecovery().click();

		String xpath20 = "//ion-label[contains(text(),'" + paradata.BpiRecovery + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath20)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.installmentRecoveryType(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Installment Recovery Type");
		parameter.installmentRecoveryType().click();

		String xpath21 = "//ion-label[contains(text(),'" + paradata.InstallmentRecoveryType
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath21)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.isStepupAllowed(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Is Step-Up Allowed");
		parameter.isStepupAllowed().click();

		String xpath22 = "//ion-label[contains(text(),'" + paradata.IsStepupAllowed
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath22)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.rateType(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Rate Type");
		parameter.rateType().click();

		String xpath23 = "//ion-label[contains(text(),'" + paradata.RateType + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath23)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.initiateDiscFactor());

		help.waitForElementToVisibleWithFluentWait(driver, parameter.initiateDiscFactor(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Initiate Disc. Factor");
		parameter.initiateDiscFactor().click();

		String xpath24 = "//ion-label[contains(text(),'" + paradata.InitiateDiscFactor
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath24)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@Then("^Enter the required pre-EMI fields in maker$")
	public void enter_the_required_preemi_fields_in_maker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, parameter.preEMI(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Pre-EMI");
		parameter.preEMI().click();

		String xpath36 = "//ion-label[contains(text(),'" + paradata.preEMI + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath36)).click();
				break;

			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.preEMIInstallment(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("No. Of Pre-EMI Installment");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.preEMIInstallment().click();
				parameter.preEMIInstallment().sendKeys(paradata.NoOfPreEMIInstallment);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.miRecoveryToBeRenamedAs(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("MI_RECOVERY_TO_BE_RENAMED_AS");
		parameter.miRecoveryToBeRenamedAs().click();

		String xpath37 = "//ion-label[contains(text(),'" + paradata.miRecoveryToBeRenamedAs
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath37)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.bpiRepaymentTenureMethod());

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRepaymentTenureMethod(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("BPI_REPAYMENT_TENURE_METHOD");
		for (int i = 0; i <20; i++) {
			try {
				parameter.bpiRepaymentTenureMethod().click();
				break;
			} catch (Exception e) {
				
			}
		}
		

		String xpath38 = "//ion-label[contains(text(),'" + paradata.bpiRepaymentTenureMethod
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath38)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRateMethod(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("BPI_RATE_METHOD");
		parameter.bpiRateMethod().click();

		String xpath39 = "//ion-label[contains(text(),'" + paradata.bpiRateMethod + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath39)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRepaymentFrequency(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("BPI_REPAYMENT_FREQUENCY");
		parameter.bpiRepaymentFrequency().click();

		String xpath40 = "//ion-label[contains(text(),'" + paradata.bpiRepaymentFrequency
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath40)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.tdsApplicable(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("TDS_APPLICABLE");
		parameter.tdsApplicable().click();

		String xpath41 = "//ion-label[contains(text(),'" + paradata.tdsApplicable + "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath41)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.moratoriumTenureType(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("MORATORIUM_TENURE_TYPE");
		parameter.moratoriumTenureType().click();

		String xpath42 = "//ion-label[contains(text(),'" + paradata.moratoriumTenureType
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath42)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^Click the approve icon in checker$")
	public void click_the_approve_icon_in_checker() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, parameter.CheckerApprove(), 60, 5);
		parameter.CheckerApprove().click();
	}

	@Then("^Click the save button get the confirmation messege$")
	public void click_the_save_button_get_the_confirmation_messege() throws Throwable {

		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.Save());

		// parameter.Save().click();
		for (int i = 0; i < 20; i++) {
			try {
				parameter.Save().click();
				break;

			} catch (Exception e) {

			}

		}

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.makerconfirmmsg(), 60, 5);

		for (int i = 0; i < 20; i++) {
			try {
				Assert.assertEquals(parameter.makerconfirmmsg().isDisplayed(), true);
				System.out.println(parameter.makerconfirmmsg().getText());
				break;
			} catch (NoSuchElementException e) {

			}
		}
		help.waitForElementToVisibleWithFluentWait(driver, parameter.successcancel(), 60, 5);
		parameter.successcancel().click();
		

	}

	@Then("^Launch the application and login as checker$")
	public void lanch_the_application_and_login_as_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		System.out.println(json.readdata());
		applicationLogin.ulSApplicationLoginAsAChecker(json.readdata());
	}

	@Then("^Get the respective reference id and submit in maker$")
	public void get_the_respective_reference_id() throws Throwable {
		// help.waitForElementToVisibleWithFluentWait(driver, parameter.mailicon(), 60,
		// 5);
		for (int i = 0; i < 20; i++) {
			try {
				parameter.mailicon().click();
				break;
			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver,
		// parameter.searchiconreferenceid(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				parameter.searchiconreferenceid().click();
				parameter.searchsentkeys().sendKeys(paradata.searchiconreferenceid);
				break;
			} catch (Exception e) {

			}
		}

		System.out.println(parameter.referenceid().getText());
		String ref1 = parameter.referenceid().getText();
		String ref2 = ref1.substring(0);
		json.addReferanceData(ref2);
		
		//help.waitForElementToVisibleWithFluentWait(driver, parameter.inboxediticon(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				parameter.inboxediticon().click();
				break;
			} catch (Exception e) {
				
			}
		}
		

		for (int i = 0; i < 20; i++) {
			try {
				parameter.submit().click();
				break;
			} catch (Exception e) {

			}
		}

		// help.waitForElementToVisibleWithFluentWait(driver, parameter.popupremark(),
		// 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				parameter.popupremark().click();
				parameter.popupremark().sendKeys(paradata.PopupRemarks);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.popupsubmit(), 60, 5);
		parameter.popupsubmit().click();

		// help.waitForElementToVisibleWithFluentWait(driver, parameter.ApprovedMSG(),
		// 60, 5);
		/*
		 * System.out.println(parameter.ApprovedMSG().getText()); String mak =
		 * parameter.ApprovedMSG().getText(); String mak1 = mak.substring(86, 94);
		 * jsonRW.addReferanceData(mak1);
		 */
		help.waitForElementToVisibleWithFluentWait(driver, parameter.ProductCheckerid(), 60, 5);
		String Success = parameter.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		json.addData(popupID);
		System.out.println(popupID);

	}

	@Then("^Click the action edit icon in checker$")
	public void click_the_action_edit_icon_in_checker() throws Throwable {

		String xpath1 = "//span[contains(text(),'" + json.readReferancedata()
				+ "')]//parent::td//preceding-sibling::td//child::button";

		WebElement actionedit = driver.findElement(By.xpath(xpath1));
		actionedit.click();
	}

	@And("^Enter the required bulk payment fields in maker$")
	public void enter_the_required_bulk_payment_fields_in_maker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPayment1(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Bulk Payment");
		parameter.bulkPayment1().click();

		//Thread.sleep(3000);

		String xpath25 = "//ion-label[contains(text(),'" + paradata.bulkPayment + "')]//following-sibling::ion-radio";
		//help.waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath25)), 30, 2);
		for (int i = 0; i <20; i++) {
			try {
				driver.findElement(By.xpath(xpath25)).click();
				break;
			} catch (Exception e) {
				
			}
		}
		

		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("No of Bulk payment in a Year");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.noOfBulkPaymentInAYear().click();
				parameter.noOfBulkPaymentInAYear().sendKeys(paradata.NoOfBulkPaymentInAYear);
				break;
			} catch (Exception e) {

			}
		}
        seleniumactions.getJavascriptHelper().scrollIntoView(parameter.bulkPaymentLockinPeriod());
		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPaymentLockinPeriod(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Bulk payment LockIn Period");
		parameter.bulkPaymentLockinPeriod().click();
		parameter.bulkPaymentLockinPeriod().sendKeys(paradata.BulkPaymentLockinPeriod);
        
		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPaymentTimeInterval(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Bulk Payment Time Interval");
		parameter.bulkPaymentTimeInterval().click();
		parameter.bulkPaymentTimeInterval().sendKeys(paradata.BulkPaymentTimeInterval);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.immediateDueDate(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Immediate/Due date");
		parameter.immediateDueDate().click();

		String xpath26 = "//ion-label[contains(text(),'" + paradata.immediateDueDate
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath26)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPaymentLockinStartsFrom(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Bulk Payment Lock-In starts From");
		parameter.bulkPaymentLockinStartsFrom().click();

		String xpath27 = "//ion-label[contains(text(),'" + paradata.bulkPaymentLockinStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath27)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minBulkPaymentParameter(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Min Bulk Payment Parameter");
		parameter.minBulkPaymentParameter().click();

		String xpath28 = "//ion-label[contains(text(),'" + paradata.minBulkPaymentParameter
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Min Bulk Payment Value");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.minBulkPaymentValue().click();
				parameter.minBulkPaymentValue().sendKeys(paradata.MinBulkPaymentValue);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxBulkPaymentparameters(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Max Bulk Payment Parameter");
		parameter.maxBulkPaymentparameters().click();

		String xpath29 = "//ion-label[contains(text(),'" + paradata.maxBulkPaymentparameters
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Max Bulk Payment Value");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.maxBulkPaymentvalue().click();
				parameter.maxBulkPaymentvalue().sendKeys(paradata.MaxBulkPaymentValue);
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the required foreclosure fields in maker$")
	public void enter_the_required_foreclosure_fields_in_maker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, parameter.foreClosureLockin(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Foreclosure Lockin");
		parameter.foreClosureLockin().click();
		parameter.foreClosureLockin().sendKeys(paradata.ForeClosureLockin);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.foreClosureLockInStartsFrom(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Foreclosure Lock-In starts From");
		parameter.foreClosureLockInStartsFrom().click();

		String xpath30 = "//ion-label[contains(text(),'" + paradata.foreClosureLockInStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath30)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minRebateParameter(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Min Rebate Parameter");
		parameter.minRebateParameter().click();

		String xpath31 = "//ion-label[contains(text(),'" + paradata.minRebateParameter
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Min Rebate Value");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.minRebatevalue().click();
				parameter.minRebatevalue().sendKeys(paradata.MinRebatevalue);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxRebateParameter(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Max Rebate Parameter");
		parameter.maxRebateParameter().click();

		String xpath32 = "//ion-label[contains(text(),'" + paradata.maxRebateParameter
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Max Rebate Value");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.maxRebatevalue().click();
				parameter.maxRebatevalue().sendKeys(paradata.MaxRebateValue);
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the required reschedulement fields in maker$")
	public void enter_the_required_reschedulement_fields_in_maker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, parameter.reschLockin(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Resch Lockin");
		parameter.reschLockin().click();
		parameter.reschLockin().sendKeys(paradata.ReschLockin);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxReschInaYear(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Max Resch in a year");
		parameter.maxReschInaYear().click();
		parameter.maxReschInaYear().sendKeys(paradata.MaxReschInAYear);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.totalReschAllowed(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Total Resch Allowed");
		parameter.totalReschAllowed().click();
		parameter.totalReschAllowed().sendKeys(paradata.TotalReachAllowed);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.reschedulementLockInStartsFrom(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Reschedulement Lock-In starts From");
		parameter.reschedulementLockInStartsFrom().click();

		String xpath33 = "//ion-label[contains(text(),'" + paradata.reschedulementLockInStartsFrom
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath33)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the required moratorium/Grace period month in maker$")
	public void enter_the_required_moratoriumgrace_period_month_in_maker() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.interestHoliday());

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestHoliday(), 60, 5);
		parameter.interestHoliday().click();
		for (int i = 0; i < 20; i++) {
			try {
				parameter.interestHoliday().sendKeys(paradata.InterestHoliday);
				break;
			} catch (Exception e) {
				
			}
		}
		
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Interest Holiday");
		help.waitForElementToVisibleWithFluentWait(driver, parameter.principalHoliday(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Principal Holiday");
		parameter.principalHoliday().click();
		parameter.principalHoliday().sendKeys(paradata.PrincipalHoliday);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestComputed(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Interest Computed");
		parameter.interestComputed().click();

		String xpath34 = "//ion-label[contains(text(),'" + paradata.interestComputed
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
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("MORATORIUM_START_MONTH_OR_INSTALLMENT");
		for (int i = 0; i < 20; i++) {
			try {
				parameter.moratoriumStartMonthorInstallment().click();
				parameter.moratoriumStartMonthorInstallment().sendKeys(paradata.MoratoriumStartMonthorInstallment);
				break;
			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.recomputationofProfit(), 60, 5);
		findFieldsMandatotyOrNot.verifyGivenFieldisMandatoryOrNot("Recomputation of Profit");
		parameter.recomputationofProfit().click();

		String xpath35 = "//ion-label[contains(text(),'" + paradata.recomputationofProfit
				+ "')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath35)).click();
				break;

			} catch (Exception e) {

			}
		}

	}
	@And("^user select Product code under product details for parameter creation$")
    public void user_select_product_code_under_product_details_for_parameter_creation() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, parameter.productCode(), 60, 2);
		parameter.productCode().click();
		System.out.println(paradata.ProductCode);
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'"+paradata.ProductCode+"')]/following-sibling::ion-radio")));
				driver.findElement(By.xpath("//ion-label[contains(text(),'"+paradata.ProductCode+"')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
    }

    @And("^user enter sub product code under sub product for parameter creation$")
    public void user_enter_sub_product_code_under_sub_product_for_parameter_creation() throws Throwable {
    	help.waitForElementToVisibleWithFluentWait(driver, parameter.subProductCode(), 60, 2);
    	parameter.subProductCode().click();
    	parameter.subProductCode().sendKeys(paradata.SubProductCode);
    }
    @Then("^User validate the parameter created record in list view$")
    public void user_validate_the_parameter_created_record_in_list_view() throws Throwable {
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'"+ paradata.ProductCode +"')]")), 60, 2);
    	 for (int i = 0; i <20; i++) {
			try {
				String validate = driver.findElement(By.xpath("//span[contains(text(),'"+paradata.ProductCode+"')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, paradata.ProductCode);
				break;
			} catch (NoSuchElementException e) {
				
			}
    	 }

		//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'" +paradata.SubProductCode +"')]")), 60, 2);
		
		for (int i = 0; i <20; i++) {
			try {
				String validate1 = driver.findElement(By.xpath("//span[contains(text(),'" + paradata.SubProductCode + "')]")).getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, paradata.SubProductCode);
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
		
		
    }

}
