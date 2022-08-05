package stepdefinitions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.SubProduct_Master_RetailOBJ;
import resources.BaseClass;
import testDataType.KULS_Login_TestDataType;
import testDataType.SubProductRetailParameterTestDataType;

public class SubProductRetailMasterParameterStep {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	SubProduct_Master_RetailOBJ subretail = new SubProduct_Master_RetailOBJ(driver);
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();

	SubProductRetailParameterTestDataType paradata = jsonConfig.getSubParameterListByName("Maker");

	SubProduct_Master_RetailOBJ parameter = new SubProduct_Master_RetailOBJ(driver);
	
	@Given("^Maker Login$")
	public void maker_login() throws Throwable {
		// Login function

				String kulsApplicationUrl = configFileReader.getApplicationUrl();
				driver.get(kulsApplicationUrl);
				// login
				help.waitForElementToVisibleWithFluentWait(driver, subretail.username(), 60, 5);
				subretail.username().click();
				subretail.username().sendKeys("in00135");

				help.waitForElementToVisibleWithFluentWait(driver, subretail.con(), 60, 5);
				subretail.con().click();

				help.waitForElementToVisibleWithFluentWait(driver, subretail.pass(), 60, 5);
				subretail.pass().click();
				subretail.pass().sendKeys("admin");

				help.waitForElementToVisibleWithFluentWait(driver, subretail.sign(), 60, 5);
				subretail.sign().click();
				
				help.waitForElementToVisibleWithFluentWait(driver, subretail.productsetup(), 60, 5);
				subretail.productsetup().click();
				
				help.waitForElementToVisibleWithFluentWait(driver, subretail.eyeicon(), 60, 5);
				subretail.eyeicon().click();
				
				help.waitForElementToVisibleWithFluentWait(driver, subretail.pencil(), 60, 5);
				subretail.pencil().click();
				
				help.waitForElementToVisibleWithFluentWait(driver, subretail.parameter(), 60, 5);
				subretail.parameter().click();
	        
	    }

	@Then("^Enter the required sub product parameters fields in maker$")
	public void enter_the_required_sub_product_parameters_fields_in_maker() throws Throwable {
		help.waitForElementToVisibleWithFluentWait(driver, parameter.loanCurrency(), 60, 5);
		parameter.loanCurrency().click();

		//String xpa = "//ion-label[contains(text(),'"+paradata.LoanCurrency+"')]";
		
		//WebElement loan = driver.findElement(By.xpath(xpa));
		//loan.click();
	//	driver.findElement(By.xpath("//ion-label[contains(text(),'"+paradata.LoanCurrency+"')]//following-sibling::ion-radio")).click();
	
      for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"+paradata.LoanCurrency+"')]//following-sibling::ion-radio")).click();
				
				break;

			} catch (Exception e) {

			}
       }

		help.waitForElementToVisibleWithFluentWait(driver, parameter.indexationCurrency(), 60, 5);
		
		parameter.indexationCurrency().click();

		String xpa1 = "//ion-label[contains(text(),'" + paradata.IndexationCurrency +"')]//following-sibling::ion-radio";
		for (int i = 0; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpa1)).click();
				break;

			} catch (Exception e) {

			}
		}

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.minimumFinanceAmount(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				parameter.minimumFinanceAmount();
				parameter.minimumFinanceAmount().sendKeys(paradata.MinFinanceAmount);
				break;
			} catch (Exception e) {
				
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maximumFinanceAmount(), 60, 5);
		parameter.maximumFinanceAmount().click();
		parameter.maximumFinanceAmount().sendKeys(paradata.MaxFinanceAmount);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minTenorInMonths(), 60, 5);
		parameter.minTenorInMonths().click();
		parameter.minTenorInMonths().sendKeys(paradata.MinTenorInMonths);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxTenorInMonths(), 60, 5);
		parameter.maxTenorInMonths().click();
		parameter.maxTenorInMonths().sendKeys(paradata.MaxTenorInMonths);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.repaymentType(), 60, 5);
		parameter.repaymentType().click();

		String xpath = "//ion-label[contains(text(),'" + paradata.RepaymentType +"')]//following-sibling::ion-radio";

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

		String xpath1 = "//ion-label[contains(text(),'" + paradata.FlatReducing +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath1)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.intAmortizationMethod(), 60, 5);
		parameter.intAmortizationMethod().click();

		String xpath2 = "//ion-label[contains(text(),'" + paradata.IntAmortizationMethod +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.computeInstallmentOn(), 60, 5);
		parameter.computeInstallmentOn().click();

		String xpath3 = "//ion-label[contains(text(),'" + paradata.ComputeInstallmentOn +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath3)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.instDueDateMethod(), 60, 5);
		parameter.instDueDateMethod().click();

		String xpath4 = "//ion-label[contains(text(),'" + paradata.InstDueDateMethod +"')]//following-sibling::ion-radio";
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
		parameter.lpcGracePeriod().sendKeys(paradata.LPCGracePeriod);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.principalRepaymentFrequency(), 60, 5);
		parameter.principalRepaymentFrequency().click();

		String xpath5 = "//ion-label[contains(text(),'" + paradata.PrincipalRepaymentFrequency +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath5)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestRepaymentFrequency(), 60, 5);
		parameter.interestRepaymentFrequency().click();

		String xpath6 = "//ion-label[contains(text(),'" + paradata.InterestRepaymentFrequency +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath6)).click();
				break;

			} catch (Exception e) {

			}
		}

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.instRoundingLogic(), 60, 5);
		
	    for (int i=0; i<20; i++) {
	    	try {
	    		parameter.instRoundingLogic().click();
	    		parameter.instRoundingLogic().sendKeys(paradata.InstRoundingLogic);
	    		break;
			} catch (Exception e) {
				
			}
	    }
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.loanElegibilityCalc(), 60, 5);
		parameter.loanElegibilityCalc().click();

		String xpath7 = "//ion-label[contains(text(),'" + paradata.LoanElegibilityCalc +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath7)).click();
				break;

			} catch (Exception e) {

			}
		}

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.remarks(), 60, 5);
		
		for(int i=0; i<20; i++) {
			try {
				parameter.remarks().click();
				parameter.remarks().sendKeys(paradata.Remark);
				break;
			} catch (Exception e) {
				
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.includeGuarantorInc(), 60, 5);
		parameter.includeGuarantorInc().click();

		String xpath8 = "//ion-label[contains(text(),'" + paradata.IncludeGuarantorInc +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath8)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.duePeriodRequired(), 60, 5);
		parameter.duePeriodRequired().click();

		String xpath9 = "//ion-label[contains(text(),'" + paradata.DuePeriodRequired +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath9)).click();
				break;

			} catch (Exception e) {

			}
		}

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.maxCoapplicants(), 60, 5);
		
		for(int i=0; i<20; i++) {
			try {
				parameter.maxCoapplicants().click();
				parameter.maxCoapplicants().sendKeys(paradata.MaxCoApplication);
				break;
			} catch (Exception e) {
				
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxGuarantors(), 60, 5);
		parameter.maxGuarantors().click();
		parameter.maxGuarantors().sendKeys(paradata.MaxGuarantors);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.instCommenceFrom(), 60, 5);
		parameter.instCommenceFrom().click();

		String xpath10 = "//ion-label[contains(text(),'" + paradata.InstCommenceFrom +"')]//following-sibling::ion-radio";
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

		String xpath11 = "//ion-label[contains(text(),'" + paradata.DaysInYear +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath11)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.multipleDisbursTranchAllowed(), 60, 5);
		parameter.multipleDisbursTranchAllowed().click();

		String xpath12 = "//ion-label[contains(text(),'" + paradata.MultipleDisbursTranchAllowed
				+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath12)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.includeIncomeDeduDebt(), 60, 5);
		parameter.includeIncomeDeduDebt().click();

		String xpath13 = "//ion-label[contains(text(),'" + paradata.IncludeIncomeDeduDebt +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath13)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.roundOff(), 60, 5);
		parameter.roundOff().click();

		String xpath14 = "//ion-label[contains(text(),'" + paradata.RoundOff +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath14)).click();
				break;

			} catch (Exception e) {

			}
		}

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.roundOffValue(), 60, 5);
		
		for(int i=0; i<20; i++) {
			try {
				parameter.roundOffValue().click();
				parameter.roundOffValue().sendKeys(paradata.RoundOffValue);
				break;
			} catch (Exception e) {
			
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.offerValidityDays(), 60, 5);
		parameter.offerValidityDays().click();
		parameter.offerValidityDays().sendKeys(paradata.OfferValidityDays);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.appropriationCode(), 60, 5);
		parameter.appropriationCode().click();

		String xpath15 = "//ion-label[contains(text(),'" + paradata.AppropriationCode +"')]//following-sibling::ion-radio";
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

		String xpath16 = "//ion-label[contains(text(),'" + paradata.BalloonAllowed +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath16)).click();
				break;

			} catch (Exception e) {

			}
		}

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.maximumBalloonPercentage(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				parameter.maximumBalloonPercentage().click();
				parameter.maximumBalloonPercentage().sendKeys(paradata.MaxBalloonPercentage);
				break;
			} catch (Exception e) {
				
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minIRR(), 60, 5);
		parameter.minIRR().click();
		parameter.minIRR().sendKeys(paradata.MinIRR);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxIRR(), 60, 5);
		parameter.maxIRR().click();
		parameter.maxIRR().sendKeys(paradata.MaxIRR);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.preOwnedAsset(), 60, 5);
		parameter.preOwnedAsset().click();

		String xpath17 = "//ion-label[contains(text(),'" + paradata.PreOwnedAsset +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath17)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.discountingFactorRounding());

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.discountingFactorRounding(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				parameter.discountingFactorRounding().click();
				parameter.discountingFactorRounding().sendKeys(paradata.DiscountingFactorRounding);
				break;
			} catch (Exception e) {
				
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.dayCountConventionForBPI(), 60, 5);
		parameter.dayCountConventionForBPI().click();

		String xpath18 = "//ion-label[contains(text(),'" + paradata.DayCountConventionForBPI +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath18)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestChargingStartsFrom(), 60, 5);
		parameter.interestChargingStartsFrom().click();

		String xpath19 = "//ion-label[contains(text(),'" + paradata.InterestChargingStartsFrom +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath19)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRecovery(), 60, 5);
		parameter.bpiRecovery().click();

		String xpath20 = "//ion-label[contains(text(),'" + paradata.BpiRecovery +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath20)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.installmentRecoveryType(), 60, 5);
		parameter.installmentRecoveryType().click();

		String xpath21 = "//ion-label[contains(text(),'" + paradata.InstallmentRecoveryType +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath21)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.isStepupAllowed(), 60, 5);
		parameter.isStepupAllowed().click();

		String xpath22 = "//ion-label[contains(text(),'" + paradata.IsStepupAllowed +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath22)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.rateType(), 60, 5);
		parameter.rateType().click();

		String xpath23 = "//ion-label[contains(text(),'" + paradata.RateType +"')]//following-sibling::ion-radio";
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

		String xpath24 = "//ion-label[contains(text(),'" + paradata.InitiateDiscFactor +"')]//following-sibling::ion-radio";
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
		parameter.preEMI().click();

		String xpath36 = "//ion-label[contains(text(),'" + paradata.preEMI +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath36)).click();
				break;

			} catch (Exception e) {

			}
		}

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.preEMIInstallment(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				parameter.preEMIInstallment().click();
				parameter.preEMIInstallment().sendKeys(paradata.NoOfPreEMIInstallment);
				break;
			} catch (Exception e) {
				
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.miRecoveryToBeRenamedAs(), 60, 5);
		parameter.miRecoveryToBeRenamedAs().click();

		String xpath37 = "//ion-label[contains(text(),'" + paradata.miRecoveryToBeRenamedAs +"')]//following-sibling::ion-radio";
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

		String xpath38 = "//ion-label[contains(text(),'" + paradata.bpiRepaymentTenureMethod +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath38)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRateMethod(), 60, 5);
		parameter.bpiRateMethod().click();

		String xpath39 = "//ion-label[contains(text(),'" + paradata.bpiRateMethod +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath39)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bpiRepaymentFrequency(), 60, 5);
		parameter.bpiRepaymentFrequency().click();

		String xpath40 = "//ion-label[contains(text(),'" + paradata.bpiRepaymentFrequency +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath40)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.tdsApplicable(), 60, 5);
		parameter.tdsApplicable().click();

		String xpath41 = "//ion-label[contains(text(),'" + paradata.tdsApplicable +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath41)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.moratoriumTenureType(), 60, 5);
		parameter.moratoriumTenureType().click();

		String xpath42 = "//ion-label[contains(text(),'" + paradata.moratoriumTenureType +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath42)).click();
				break;

			} catch (Exception e) {

			}
		}
		

	}
	
	@Then("^Click the save button get the confirmation messege$")
	public void click_the_save_button_get_the_confirmation_messege() throws Throwable {
		
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.Save());
		help.waitForElementToVisibleWithFluentWait(driver, parameter.Save(), 60, 5);
		parameter.Save().click();
		help.waitForElementToVisibleWithFluentWait(driver, parameter.makerconfirmmsg(), 60, 5);		
		System.out.println(parameter.makerconfirmmsg().getText());
	        
	    }
	

	@And("^Enter the required bulk payment fields in maker$")
	public void enter_the_required_bulk_payment_fields_in_maker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPayment1(), 60, 5);
		parameter.bulkPayment1().click();
		
		Thread.sleep(3000);

		String xpath25 = "//ion-label[contains(text(),'"+paradata.bulkPayment+"')]//following-sibling::ion-radio";
		help.waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath25)), 80, 5);
		driver.findElement(By.xpath(xpath25)).click();
		/*for (int i=0; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath25)).click();
				break;

			} catch (Exception e) {

			}
		}*/
		//seleniumactions.getJavascriptHelper().scrollIntoView(parameter.noOfBulkPaymentInAYear());

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.noOfBulkPaymentInAYear(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				parameter.noOfBulkPaymentInAYear().click();
				parameter.noOfBulkPaymentInAYear().sendKeys(paradata.NoOfBulkPaymentInAYear);
				break;
			} catch (Exception e) {
				
			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPaymentLockinPeriod(), 60, 5);
		parameter.bulkPaymentLockinPeriod().click();
		parameter.bulkPaymentLockinPeriod().sendKeys(paradata.BulkPaymentLockinPeriod);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPaymentTimeInterval(), 60, 5);
		parameter.bulkPaymentTimeInterval().click();
		parameter.bulkPaymentTimeInterval().sendKeys(paradata.BulkPaymentTimeInterval);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.immediateDueDate(), 60, 5);
		parameter.immediateDueDate().click();

		String xpath26 = "//ion-label[contains(text(),'" + paradata.immediateDueDate +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath26)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.bulkPaymentLockinStartsFrom(), 60, 5);
		parameter.bulkPaymentLockinStartsFrom().click();

		String xpath27 = "//ion-label[contains(text(),'" + paradata.bulkPaymentLockinStartsFrom
				+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath27)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minBulkPaymentParameter(), 60, 5);
		parameter.minBulkPaymentParameter().click();

		String xpath28 = "//ion-label[contains(text(),'" + paradata.minBulkPaymentParameter +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath28)).click();
				break;

			} catch (Exception e) {

			}
		}

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.minBulkPaymentValue(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				parameter.minBulkPaymentValue().click();
				parameter.minBulkPaymentValue().sendKeys(paradata.MinBulkPaymentValue);
				break;
			} catch (Exception e) {
				
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxBulkPaymentparameters(), 60, 5);
		parameter.maxBulkPaymentparameters().click();

		String xpath29 = "//ion-label[contains(text(),'" + paradata.maxBulkPaymentparameters +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath29)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.maxBulkPaymentvalue());

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.maxBulkPaymentvalue(), 60, 5);
		for(int i=0; i<20; i++) {
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
		parameter.foreClosureLockin().click();
		parameter.foreClosureLockin().sendKeys(paradata.ForeClosureLockin);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.foreClosureLockInStartsFrom(), 60, 5);
		parameter.foreClosureLockInStartsFrom().click();

		String xpath30 = "//ion-label[contains(text(),'" + paradata.foreClosureLockInStartsFrom
				+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath30)).click();
				break;

			} catch (Exception e) {

			}
		}

		help.waitForElementToVisibleWithFluentWait(driver, parameter.minRebateParameter(), 60, 5);
		parameter.minRebateParameter().click();

		String xpath31 = "//ion-label[contains(text(),'" + paradata.minRebateParameter +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath31)).click();
				break;

			} catch (Exception e) {

			}
		}

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.minRebatevalue(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				parameter.minRebatevalue().click();
				parameter.minRebatevalue().sendKeys(paradata.MinRebatevalue);
				break;
			} catch (Exception e) {
				
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxRebateParameter(), 60, 5);
		parameter.maxRebateParameter().click();

		String xpath32 = "//ion-label[contains(text(),'" + paradata.maxRebateParameter +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath32)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.maxRebatevalue());

		//help.waitForElementToVisibleWithFluentWait(driver, parameter.maxRebatevalue(), 60, 5);
		for(int i=0; i<20; i++) {
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
		parameter.reschLockin().click();
		parameter.reschLockin().sendKeys(paradata.ReschLockin);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.maxReschInaYear(), 60, 5);
		parameter.maxReschInaYear().click();
		parameter.maxReschInaYear().sendKeys(paradata.MaxReschInAYear);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.totalReschAllowed(), 60, 5);
		parameter.totalReschAllowed().click();
		parameter.totalReschAllowed().sendKeys(paradata.TotalReachAllowed);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.reschedulementLockInStartsFrom(), 60, 5);
		parameter.reschedulementLockInStartsFrom().click();

		String xpath33 = "//ion-label[contains(text(),'" + paradata.reschedulementLockInStartsFrom
				+"')]//following-sibling::ion-radio";
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
		parameter.interestHoliday().sendKeys(paradata.InterestHoliday);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.principalHoliday(), 60, 5);
		parameter.principalHoliday().click();
		parameter.principalHoliday().sendKeys(paradata.PrincipalHoliday);

		help.waitForElementToVisibleWithFluentWait(driver, parameter.interestComputed(), 60, 5);
		parameter.interestComputed().click();

		String xpath34 = "//ion-label[contains(text(),'" + paradata.interestComputed +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath34)).click();
				break;

			} catch (Exception e) {

			}
		}
		seleniumactions.getJavascriptHelper().scrollIntoView(parameter.moratoriumStartMonthorInstallment());
		//help.waitForElementToVisibleWithFluentWait(driver, parameter.moratoriumStartMonthorInstallment(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				parameter.moratoriumStartMonthorInstallment().click();
				parameter.moratoriumStartMonthorInstallment().sendKeys(paradata.MoratoriumStartMonthorInstallment);
				break;
			} catch (Exception e) {
				
			}
		}
		

		help.waitForElementToVisibleWithFluentWait(driver, parameter.recomputationofProfit(), 60, 5);
		parameter.recomputationofProfit().click();

		String xpath35 = "//ion-label[contains(text(),'" + paradata.recomputationofProfit +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath35)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

}
