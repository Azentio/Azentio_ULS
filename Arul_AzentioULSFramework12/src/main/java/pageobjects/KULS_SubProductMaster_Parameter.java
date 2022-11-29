package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KULS_SubProductMaster_Parameter {
	WebDriver driver;
	public KULS_SubProductMaster_Parameter(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Loan Currency *']")
	private WebElement loanCurrency;
	public WebElement loanCurrency() {
		return loanCurrency;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Indexation Currency ']")
	private WebElement indexationCurrency;
	public WebElement indexationCurrency() {
		return indexationCurrency;
	}
	@FindBy(xpath="n-label[contains(text(),'Minimum Finance Amount')]//following-sibling::ion-input/input")
	private WebElement minimumFinanceAmount;
	public WebElement minimumFinanceAmount() {
		return minimumFinanceAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Maximum Finance Amount')]//following-sibling::ion-input/input")
	private WebElement maximumFinanceAmount;
	public WebElement maximumFinanceAmount() {
		return maximumFinanceAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Min Tenor In Months')]//following-sibling::ion-input/input")
	private WebElement minTenorInMonths;
	public WebElement minTenorInMonths() {
		return minTenorInMonths;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Max Tenor In Months')]//following-sibling::ion-input/input")
	private WebElement maxTenorInMonths;
	public WebElement maxTenorInMonths() {
		return maxTenorInMonths;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Repayment Type *']")
	private WebElement repaymentType;
	public WebElement repaymentType() {
		return repaymentType;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Flat/Reducing *']")
	private WebElement flatReducing;
	public WebElement flatReducing() {
		return flatReducing;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Int. Amortization Method *']")
	private WebElement intAmortizationMethod;
	public WebElement intAmortizationMethod() {
		return intAmortizationMethod;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Compute Installment on *']")
	private WebElement computeInstallmentOn;
	public WebElement computeInstallmentOn() {
		return computeInstallmentOn;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,   Inst. due date method *']")
	private WebElement instDueDateMethod;
	public WebElement instDueDateMethod() {
		return instDueDateMethod;
	}
	@FindBy(xpath="//ion-label[contains(text(),' LPC grace period (days) ')]//following-sibling::ion-input/input")
	private WebElement lpcGracePeriod;
	public WebElement lpcGracePeriod() {
		return lpcGracePeriod;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Principal Repayment Frequency *']")
	private WebElement principalRepaymentFrequency;
	public WebElement principalRepaymentFrequency() {
		return principalRepaymentFrequency;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Interest Repayment Frequency *']")
	private WebElement interestRepaymentFrequency;
	public WebElement interestRepaymentFrequency() {
		return interestRepaymentFrequency;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Inst. Rounding Logic ')]//following-sibling::ion-input/input")
	private WebElement instRoundingLogic;
	public WebElement instRoundingLogic() {
		return instRoundingLogic;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Loan Eligibility Calc. *']")
	private WebElement loanElegibilityCalc;
	public WebElement loanElegibilityCalc() {
		return loanElegibilityCalc;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Remarks')]//following-sibling::ion-input/input")
	private WebElement remarks;
	public WebElement remarks() {
		return remarks;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Include Guarantor Inc. *']")
	private WebElement includeGuarantorInc;
	public WebElement includeGuarantorInc() {
		return includeGuarantorInc;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Due Period Required *']")
	private WebElement duePeriodRequired;
	public WebElement duePeriodRequired() {
		return duePeriodRequired;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Max Coapplicants')]//following-sibling::ion-input/input")
	private WebElement maxCoapplicants;
	public WebElement maxCoapplicants() {
		return maxCoapplicants;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Max Guarantors')]//following-sibling::ion-input/input")
	private WebElement maxGuarantors;
	public WebElement maxGuarantors() {
		return maxGuarantors;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Inst. Commence From *']")
	private WebElement instCommenceFrom;
	public WebElement instCommenceFrom() {
		return instCommenceFrom;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Days In Year *']")
	private WebElement daysInYear;
	public WebElement daysInYear() {
		return daysInYear;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Multiple Disburs. Tranch Allowed *']")
	private WebElement multipleDisbursTranchAllowed;
	public WebElement multipleDisbursTranchAllowed() {
		return multipleDisbursTranchAllowed;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Include Income Dedu. Debt *']")
	private WebElement includeIncomeDeduDebt;
	public WebElement includeIncomeDeduDebt() {
		return includeIncomeDeduDebt;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Round Off *']")
	private WebElement roundOff;
	public WebElement roundOff() {
		return roundOff;
	}
	@FindBy(xpath="//ion-label[contains(text(),'RoundOff Value')]//following-sibling::ion-input/input")
	private WebElement roundOffValue;
	public WebElement roundOffValue() {
		return roundOffValue;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Offer Validity')]//following-sibling::ion-input/input")
	private WebElement offerValidityDays;
	public WebElement offerValidityDays() {
		return offerValidityDays;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Appropriation Code *']")
	private WebElement appropriationCode;
	public WebElement appropriationCode() {
		return appropriationCode;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Balloon Allowed *']")
	private WebElement balloonAllowed;
	public WebElement balloonAllowed() {
		return balloonAllowed;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Maximum Balloon Percentage')]//following-sibling::ion-input/input")
	private WebElement maximumBalloonPercentage;
	public WebElement maximumBalloonPercentage() {
		return maximumBalloonPercentage;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Min IRR')]//following-sibling::ion-input/input")
	private WebElement minIRR;
	public WebElement minIRR() {
		return minIRR;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Max IRR')]//following-sibling::ion-input/input")
	private WebElement maxIRR;
	public WebElement maxIRR() {
		return maxIRR;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Pre-owned Asset *']")
	private WebElement preOwnedAsset;
	public WebElement preOwnedAsset() {
		return preOwnedAsset;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Discounting Factor Rounding')]//following-sibling::ion-input/input")
	private WebElement discountingFactorRounding;
	public WebElement discountingFactorRounding() {
		return discountingFactorRounding;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Day Count Convention for BPI *']")
	private WebElement dayCountConventionForBPI;
	public WebElement dayCountConventionForBPI() {
		return dayCountConventionForBPI;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Interest Charging Starts From *']")
	private WebElement interestChargingStartsFrom;
	public WebElement interestChargingStartsFrom() {
		return interestChargingStartsFrom;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  BPI Recovery *']")
	private WebElement bpiRecovery;
	public WebElement bpiRecovery() {
		return bpiRecovery;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Installment Recovery Type *']")
	private WebElement installmentRecoveryType;
	public WebElement installmentRecoveryType() {
		return installmentRecoveryType;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Is Step-Up Allowed *']")
	private WebElement isStepupAllowed;
	public WebElement isStepupAllowed() {
		return isStepupAllowed;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Rate Type *']")
	private WebElement rateType;
	public WebElement rateType() {
		return rateType;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Initiate Disc. Factor *']")
	private WebElement initiateDiscFactor;
	public WebElement initiateDiscFactor() {
		return initiateDiscFactor;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Bulk Payment *']")
	private WebElement bulkPayment;
	public WebElement bulkPayment() {
		return bulkPayment;
	}
	@FindBy(xpath="//ion-label[contains(text(),' No of Bulk payment in a Year ')]//following-sibling::ion-input/input")
	private WebElement noOfBulkPaymentInAYear;
	public WebElement noOfBulkPaymentInAYear() {
		return noOfBulkPaymentInAYear;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Bulk payment LockIn Period ')]//following-sibling::ion-input/input")
	private WebElement bulkPaymentLockinPeriod;
	public WebElement bulkPaymentLockinPeriod() {
		return bulkPaymentLockinPeriod;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Bulk Payment Time Interval ')]//following-sibling::ion-input/input")
	private WebElement bulkPaymentTimeInterval;
	public WebElement bulkPaymentTimeInterval() {
		return bulkPaymentTimeInterval;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Immediate/Due date *']")
	private WebElement immediateDueDate;
	public WebElement immediateDueDate() {
		return immediateDueDate;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Bulk Payment Lock-In starts From *']")
	private WebElement bulkPaymentLockinStartsFrom;
	public WebElement bulkPaymentLockinStartsFrom() {
		return bulkPaymentLockinStartsFrom;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Min Bulk Payment Parameter *']")
	private WebElement minBulkPaymentParameter;
	public WebElement minBulkPaymentParameter() {
		return minBulkPaymentParameter;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Min Bulk Payment Value ')]//following-sibling::ion-input/input")
	private WebElement minBulkPaymentValue;
	public WebElement minBulkPaymentValue() {
		return minBulkPaymentValue;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Max Bulk Payment Parameter *']")
	private WebElement maxBulkPaymentparameters;
	public WebElement maxBulkPaymentparameters() {
		return maxBulkPaymentparameters;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Max Bulk Payment Value ')]//following-sibling::ion-input/input")
	private WebElement maxBulkPaymentvalue;
	public WebElement maxBulkPaymentvalue() {
		return maxBulkPaymentvalue;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Foreclosure Lockin ')]//following-sibling::ion-input/input")
	private WebElement foreClosureLockin;
	public WebElement foreClosureLockin() {
		return foreClosureLockin;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Foreclosure Lock-In starts From *']")
	private WebElement foreClosureLockInStartsFrom;
	public WebElement foreClosureLockInStartsFrom() {
		return foreClosureLockInStartsFrom;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Min Rebate Parameter *']")
	private WebElement minRebateParameter;
	public WebElement minRebateParameter() {
		return minRebateParameter;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Min Rebate Value ')]//following-sibling::ion-input/input']")
	private WebElement minRebatevalue;
	public WebElement minRebatevalue() {
		return minRebatevalue;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Max Rebate Parameter *']")
	private WebElement maxRebateParameter;
	public WebElement maxRebateParameter() {
		return maxRebateParameter;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Max Rebate Value ')]//following-sibling::ion-input/input")
	private WebElement maxRebatevalue;
	public WebElement maxRebatevalue() {
		return maxRebatevalue;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Resch Lockin ')]//following-sibling::ion-input/input")
	private WebElement reschLockin;
	public WebElement reschLockin() {
		return reschLockin;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Max Resch in a year ')]//following-sibling::ion-input/input")
	private WebElement maxReschInaYear;
	public WebElement maxReschInaYear() {
		return maxReschInaYear;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Total Resch Allowed ')]//following-sibling::ion-input/input")
	private WebElement totalReschAllowed;
	public WebElement totalReschAllowed() {
		return totalReschAllowed;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Reschedulement Lock-In starts From *']")
	private WebElement reschedulementLockInStartsFrom;
	public WebElement reschedulementLockInStartsFrom() {
		return reschedulementLockInStartsFrom;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Interest Holiday ')]//following-sibling::ion-input/input")
	private WebElement interestHoliday;
	public WebElement interestHoliday() {
		return interestHoliday;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Principal Holiday ')]//following-sibling::ion-input/input")
	private WebElement principalHoliday;
	public WebElement principalHoliday() {
		return principalHoliday;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Interest Computed *']")
	private WebElement interestComputed;
	public WebElement interestComputed() {
		return interestComputed;
	}
	@FindBy(xpath="//ion-label[contains(text(),' MORATORIUM_START_MONTH_OR_INSTALLMENT ')]//following-sibling::ion-input/input")
	private WebElement moratoriumStartMonthorInstallment;
	public WebElement moratoriumStartMonthorInstallment() {
		return moratoriumStartMonthorInstallment;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Recomputation of Profit *']")
	private WebElement recomputationofProfit;
	public WebElement recomputationofProfit() {
		return recomputationofProfit;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Pre-EMI *']")
	private WebElement preEMI;
	public WebElement preEMI() {
		return preEMI;
	}
	@FindBy(xpath="//ion-label[contains(text(),' No. Of Pre-EMI Installment ')]//following-sibling::ion-input/input")
	private WebElement preEMIInstallment;
	public WebElement preEMIInstallment() {
		return preEMIInstallment;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  MI_RECOVERY_TO_BE_RENAMED_AS *']")
	private WebElement miRecoveryToBeRenamedAs;
	public WebElement miRecoveryToBeRenamedAs() {
		return miRecoveryToBeRenamedAs;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  BPI_REPAYMENT_TENURE_METHOD *']")
	private WebElement bpiRepaymentTenureMethod;
	public WebElement bpiRepaymentTenureMethod() {
		return bpiRepaymentTenureMethod;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  BPI_RATE_METHOD *']")
	private WebElement bpiRateMethod;
	public WebElement bpiRateMethod() {
		return bpiRateMethod;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  BPI_REPAYMENT_FREQUENCY *']")
	private WebElement bpiRepaymentFrequency;
	public WebElement bpiRepaymentFrequency() {
		return bpiRepaymentFrequency;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  TDS_APPLICABLE *']")
	private WebElement tdsApplicable;
	public WebElement tdsApplicable() {
		return tdsApplicable;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  MORATORIUM_TENURE_TYPE ']")
	private WebElement moratoriumTenureType;
	public WebElement moratoriumTenureType() {
		return moratoriumTenureType;
	}
	
	
}
