package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class SubProduct_Master_RetailOBJ {
	WebDriver driver;
	
	public SubProduct_Master_RetailOBJ(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
		
	}
	//Login 
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/kub-login[1]/ion-content[1]/form[1]/div[1]/ion-grid[1]/ion-row[1]/div[2]/ion-row[1]/ion-col[1]/div[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement username;
	public WebElement username()
	{
		return username;
	}
	@FindBy(xpath="//ion-button[contains(text(),'Continue')]")
	private WebElement con;
	public WebElement con()
	{
		return con;
	}
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/kub-login[1]/ion-content[1]/form[1]/div[1]/ion-grid[1]/ion-row[1]/div[2]/ion-row[2]/ion-col[1]/div[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement pass;
	public WebElement pass()
	{
		return pass;
	}
	@FindBy(xpath="//ion-button[contains(text(),'Sign In')]")
	private WebElement sign;
	public WebElement sign()
	{
		return sign;
	}
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-menu[1]/ion-content[1]/ion-split-pane[1]/ion-menu[1]/ion-content[1]/div[1]/ion-card-content[1]/ion-col[1]/ion-card-content[7]/ion-item[1]/ion-icon[1]")
	private WebElement productsetup;
	public WebElement productsetup()
	{
		return productsetup;
	}
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-menu[1]/ion-content[1]/ion-split-pane[1]/ion-menu[1]/ion-content[1]/div[1]/ion-card-content[1]/ion-col[1]/ion-card-content[7]/ion-card-content[1]/ion-item[4]/ion-buttons[1]/ion-button[2]")
	private WebElement eyeicon;
	public WebElement eyeicon()
	{
		return eyeicon;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement pencil;
	public WebElement pencil()
	{
		return pencil;
	}
	@FindBy(xpath="//ion-segment-button[@id='seg5']")
	private WebElement parameter;
	public WebElement parameter()
	{
		return parameter;
	}
	
	
	
	
	// Object
	@FindBy(xpath="//ion-segment-button[@id='seg1']")
    private WebElement SubProduct;
	public WebElement SubProduct()
	{
		return SubProduct;
	}
	@FindBy(xpath="//ion-segment-button[@id='seg2']")
    private WebElement Sub_Collateral;
	public WebElement Sub_Collateral()
	{
		return Sub_Collateral;
	}
	@FindBy(xpath="//ion-segment-button[@id='seg3']")
    private WebElement Sub_BusinessCenter;
	public WebElement Sub_BusinessCenter()
	{
		return Sub_BusinessCenter;
	}
	@FindBy(xpath="//ion-segment-button[@id='seg5']")
    private WebElement Sub_Parameters;
	public WebElement Sub_Parameters()
	{
		return Sub_Parameters;
	}
	// Business Center
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-up'])[1]")
    private WebElement Available_Angleup;
	public WebElement Available_Angleup()
	{
		return Available_Angleup;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-up'])[2]")
    private WebElement SBC_Angleup;
	public WebElement SBC_Angleup()
	{
		return Available_Angleup;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-up'])[1]")
    private WebElement Available_DoubleAngleup;
	public WebElement Available_DoubleAngleup()
	{
		return Available_DoubleAngleup;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-up'])[2]")
    private WebElement SBC_DoubleAngleup;
	public WebElement SBC_DoubleAngleup()
	{
		return SBC_DoubleAngleup;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-down'])[1]")
    private WebElement Available_Angledown;
	public WebElement Available_Angledown()
	{
		return Available_Angledown;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-down'])[2]")
    private WebElement SBC_Angledown;
	public WebElement SBC_Angledown()
	{
		return SBC_Angledown;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-down'])[1]")
    private WebElement Available_DoubleAngledown;
	public WebElement Available_DoubleAngledown()
	{
		return Available_DoubleAngledown;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-down'])[2]")
    private WebElement SBC_DoubleAngledown;
	public WebElement SBC_DoubleAngledown()
	{
		return SBC_DoubleAngledown;
	}
	@FindBy(xpath="//div[contains(text(),'CORP')]")
    private WebElement BC_CORP;
	public WebElement BC_CORP()
	{
		return BC_CORP;
	}
	@FindBy(xpath="//div[contains(text(),'MGMT')]")
    private WebElement BC_MGMT;
	public WebElement BC_MGMT()
	{
		return BC_MGMT;
	}
	@FindBy(xpath="//div[contains(text(),'DMS')]")
    private WebElement BC_DMS;
	public WebElement BC_DMS()
	{
		return BC_DMS;
	}
	@FindBy(xpath="//div[contains(text(),'RETAIL')]")
    private WebElement BC_Retails;
	public WebElement BC_Retails()
	{
		return BC_Retails;
	}
	
	// Checker reject
	@FindBy(xpath="//ion-button[@ng-reflect-text='Menu']")
    private WebElement menuChecker;
	public WebElement menuChecker()
	{
		return menuChecker;
	}
	@FindBy(xpath="//ion-item[@ng-reflect-text='Inbox']//child::ion-icon")
    private WebElement inboxiconChecker;
	public WebElement inboxiconChecker()
	{
		return inboxiconChecker;
	}
	@FindBy(xpath="//span[contains(text(),'5491')]//parent::td//preceding-sibling::td//child::button")
    private WebElement actionediticonChecker;
	public WebElement actionediticonChecker()
	{
		return actionediticonChecker;
	}
	@FindBy(xpath="//span[contains(text(),'Reject')]")
    private WebElement rejectChecker;
	public WebElement rejectChecker()
	{
		return rejectChecker;
	}
	@FindBy(xpath="//ion-label[contains(text(),'cancel')]")
    private WebElement cancelMsgChecker;
	public WebElement cancelMsgChecker()
	{
		return cancelMsgChecker;
	}
	@FindBy(xpath="(//span[contains(text(),'Reject')])[2]")
    private WebElement rejectMsgChecker;
	public WebElement rejectMsgChecker()
	{
		return rejectMsgChecker;
	}
	@FindBy(xpath="//div[contains(text(),' Record REJECTED Successfully ')]")
    private WebElement recordMsgChecker;
	public WebElement recordMsgChecker()
	{
		return recordMsgChecker;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Search'])[1]")
    private WebElement searchChecker;
	public WebElement searchChecker()
	{
		return searchChecker;
	}
	
	// Object Parameter
	
	@FindBy(xpath="//ion-select[@aria-label='Select,  Loan Currency *']")
	private WebElement loanCurrency;
	public WebElement loanCurrency() 
	{
		return loanCurrency;
	}
	@FindBy(xpath="//ion-select[@aria-label=' INR ,  Loan Currency *']")
	private WebElement loanCurrencyUpdate;
	public WebElement loanCurrencyUpdate() 
	{
		return loanCurrencyUpdate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' INR ')]")
	private WebElement loanCurrencyINR;
	public WebElement loanCurrencyINR() 
	{
		return loanCurrencyINR;
	}
	
	@FindBy(xpath="//ion-select[@aria-label='Select,  Indexation Currency ']")
	private WebElement indexationCurrency;
	public WebElement indexationCurrency() 
	{
		return indexationCurrency;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Minimum Finance Amount')]//following-sibling::ion-input/input")
	private WebElement minimumFinanceAmount;
	public WebElement minimumFinanceAmount() 
	{
		return minimumFinanceAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Maximum Finance Amount')]//following-sibling::ion-input/input")
	private WebElement maximumFinanceAmount;
	public WebElement maximumFinanceAmount() 
	{
		return maximumFinanceAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Min Tenor In Months')]//following-sibling::ion-input/input")
	private WebElement minTenorInMonths;
	public WebElement minTenorInMonths() 
	{
		return minTenorInMonths;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Max Tenor In Months')]//following-sibling::ion-input/input")
	private WebElement maxTenorInMonths;
	public WebElement maxTenorInMonths() 
	{
		return maxTenorInMonths;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Repayment Type *']")
	private WebElement repaymentType;
	public WebElement repaymentType()
	{
		return repaymentType;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Flat/Reducing *']")
	private WebElement flatReducing;
	public WebElement flatReducing()
{
		return flatReducing;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Int. Amortization Method *']")
	private WebElement intAmortizationMethod;
	public WebElement intAmortizationMethod() 
	{
		return intAmortizationMethod;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Compute Installment on *']")
	private WebElement computeInstallmentOn;
	public WebElement computeInstallmentOn()
	{
		return computeInstallmentOn;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,   Inst. due date method *']")
	private WebElement instDueDateMethod;
	public WebElement instDueDateMethod()
	{
		return instDueDateMethod;
	}
	@FindBy(xpath="//ion-label[contains(text(),' LPC grace period (days) ')]//following-sibling::ion-input/input")
	private WebElement lpcGracePeriod;
	public WebElement lpcGracePeriod()
	{
		return lpcGracePeriod;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Principal Repayment Frequency *']")
	private WebElement principalRepaymentFrequency;
	public WebElement principalRepaymentFrequency() 
	{
		return principalRepaymentFrequency;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Interest Repayment Frequency *']")
	private WebElement interestRepaymentFrequency;
	public WebElement interestRepaymentFrequency() 
	{
		return interestRepaymentFrequency;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Inst. Rounding Logic ')]//following-sibling::ion-input/input")
	private WebElement instRoundingLogic;
	public WebElement instRoundingLogic() 
	{
		return instRoundingLogic;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Loan Eligibility Calc. *']")
	private WebElement loanElegibilityCalc;
	public WebElement loanElegibilityCalc()
	{
		return loanElegibilityCalc;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Remarks')]//following-sibling::ion-input/input")
	private WebElement remarks;
	public WebElement remarks() 
	{
		return remarks;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Include Guarantor Inc. *']")
	private WebElement includeGuarantorInc;
	public WebElement includeGuarantorInc() 
	{
		return includeGuarantorInc;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Due Period Required *']")
	private WebElement duePeriodRequired;
	public WebElement duePeriodRequired() 
	{
		return duePeriodRequired;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Max Coapplicants')]//following-sibling::ion-input/input")
	private WebElement maxCoapplicants;
	public WebElement maxCoapplicants() 
	{
		return maxCoapplicants;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Max Guarantors')]//following-sibling::ion-input/input")
	private WebElement maxGuarantors;
	public WebElement maxGuarantors() 
	{
		return maxGuarantors;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Inst. Commence From *']")
	private WebElement instCommenceFrom;
	public WebElement instCommenceFrom() 
	{
		return instCommenceFrom;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Days In Year *']")
	private WebElement daysInYear;
	public WebElement daysInYear() 
	{
		return daysInYear;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Multiple Disburs. Tranch Allowed *']")
	private WebElement multipleDisbursTranchAllowed;
	public WebElement multipleDisbursTranchAllowed() 
	{
		return multipleDisbursTranchAllowed;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Include Income Dedu. Debt *']")
	private WebElement includeIncomeDeduDebt;
	public WebElement includeIncomeDeduDebt() 
	{
		return includeIncomeDeduDebt;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Round Off *']")
	private WebElement roundOff;
	public WebElement roundOff() 
	{
		return roundOff;
	}
	@FindBy(xpath="//ion-label[contains(text(),'RoundOff Value')]//following-sibling::ion-input/input")
	private WebElement roundOffValue;
	public WebElement roundOffValue() 
	{
		return roundOffValue;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Offer Validity')]//following-sibling::ion-input/input")
	private WebElement offerValidityDays;
	public WebElement offerValidityDays()
	{
		return offerValidityDays;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Appropriation Code *']")
	private WebElement appropriationCode;
	public WebElement appropriationCode() 
	{
		return appropriationCode;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Balloon Allowed *']")
	private WebElement balloonAllowed;
	public WebElement balloonAllowed()
	{
		return balloonAllowed;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Maximum Balloon Percentage')]//following-sibling::ion-input/input")
	private WebElement maximumBalloonPercentage;
	public WebElement maximumBalloonPercentage()
	{
		return maximumBalloonPercentage;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Min IRR')]//following-sibling::ion-input/input")
	private WebElement minIRR;
	public WebElement minIRR() 
	{
		return minIRR;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Max IRR')]//following-sibling::ion-input/input")
	private WebElement maxIRR;
	public WebElement maxIRR() 
	{
		return maxIRR;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Pre-owned Asset *']")
	private WebElement preOwnedAsset;
	public WebElement preOwnedAsset()
	{
		return preOwnedAsset;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Discounting Factor Rounding')]//following-sibling::ion-input/input")
	private WebElement discountingFactorRounding;
	public WebElement discountingFactorRounding() 
	{
		return discountingFactorRounding;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Day Count Convention for BPI *']")
	private WebElement dayCountConventionForBPI;
	public WebElement dayCountConventionForBPI() 
	{
		return dayCountConventionForBPI;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Interest Charging Starts From *']")
	private WebElement interestChargingStartsFrom;
	public WebElement interestChargingStartsFrom() 
	{
		return interestChargingStartsFrom;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  BPI Recovery *']")
	private WebElement bpiRecovery;
	public WebElement bpiRecovery()
	{
		return bpiRecovery;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Installment Recovery Type *']")
	private WebElement installmentRecoveryType;
	public WebElement installmentRecoveryType() 
	{
		return installmentRecoveryType;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Is Step-Up Allowed *']")
	private WebElement isStepupAllowed;
	public WebElement isStepupAllowed() 
	{
		return isStepupAllowed;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Rate Type *']")
	private WebElement rateType;
	public WebElement rateType() 
	{
		return rateType;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Initiate Disc. Factor *']")
	private WebElement initiateDiscFactor;
	public WebElement initiateDiscFactor() 
	{
		return initiateDiscFactor;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Bulk Payment *']")
	private WebElement bulkPayment1;
	public WebElement bulkPayment1() 
	{
		return bulkPayment1;
	}
	@FindBy(xpath="//ion-label[contains(text(),' No of Bulk payment in a Year ')]//following-sibling::ion-input/input")
	private WebElement noOfBulkPaymentInAYear;
	public WebElement noOfBulkPaymentInAYear() 
	{
		return noOfBulkPaymentInAYear;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Bulk payment LockIn Period ')]//following-sibling::ion-input/input")
	private WebElement bulkPaymentLockinPeriod;
	public WebElement bulkPaymentLockinPeriod() 
	{
		return bulkPaymentLockinPeriod;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Bulk Payment Time Interval ')]//following-sibling::ion-input/input")
	private WebElement bulkPaymentTimeInterval;
	public WebElement bulkPaymentTimeInterval() 
	{
		return bulkPaymentTimeInterval;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Immediate/Due date *']")
	private WebElement immediateDueDate;
	public WebElement immediateDueDate() 
	{
		return immediateDueDate;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Bulk Payment Lock-In starts From *']")
	private WebElement bulkPaymentLockinStartsFrom;
	public WebElement bulkPaymentLockinStartsFrom() 
	{
		return bulkPaymentLockinStartsFrom;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Min Bulk Payment Parameter *']")
	private WebElement minBulkPaymentParameter;
	public WebElement minBulkPaymentParameter() 
	{
		return minBulkPaymentParameter;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Min Bulk Payment Value ')]//following-sibling::ion-input/input")
	private WebElement minBulkPaymentValue;
	public WebElement minBulkPaymentValue() 
	{
		return minBulkPaymentValue;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Max Bulk Payment Parameter *']")
	private WebElement maxBulkPaymentparameters;
	public WebElement maxBulkPaymentparameters() 
	{
		return maxBulkPaymentparameters;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Max Bulk Payment Value ')]//following-sibling::ion-input/input")
	private WebElement maxBulkPaymentvalue;
	public WebElement maxBulkPaymentvalue() 
	{
		return maxBulkPaymentvalue;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Foreclosure Lockin ')]//following-sibling::ion-input/input")
	private WebElement foreClosureLockin;
	public WebElement foreClosureLockin() 
	{
		return foreClosureLockin;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Foreclosure Lock-In starts From *']")
	private WebElement foreClosureLockInStartsFrom;
	public WebElement foreClosureLockInStartsFrom() 
	{
		return foreClosureLockInStartsFrom;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Min Rebate Parameter *']")
	private WebElement minRebateParameter;
	public WebElement minRebateParameter() 
	{
		return minRebateParameter;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Min Rebate Value ')]//following-sibling::ion-input/input']")
	private WebElement minRebatevalue;
	public WebElement minRebatevalue() 
	{
		return minRebatevalue;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Max Rebate Parameter *']")
	private WebElement maxRebateParameter;
	public WebElement maxRebateParameter() 
	{
		return maxRebateParameter;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Max Rebate Value ')]//following-sibling::ion-input/input")
	private WebElement maxRebatevalue;
	public WebElement maxRebatevalue() 
	{
		return maxRebatevalue;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Resch Lockin ')]//following-sibling::ion-input/input")
	private WebElement reschLockin;
	public WebElement reschLockin() 
	{
		return reschLockin;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Max Resch in a year ')]//following-sibling::ion-input/input")
	private WebElement maxReschInaYear;
	public WebElement maxReschInaYear() 
	{
		return maxReschInaYear;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Total Resch Allowed ')]//following-sibling::ion-input/input")
	private WebElement totalReschAllowed;
	public WebElement totalReschAllowed() 
	{
		return totalReschAllowed;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Reschedulement Lock-In starts From *']")
	private WebElement reschedulementLockInStartsFrom;
	public WebElement reschedulementLockInStartsFrom() 
	{
		return reschedulementLockInStartsFrom;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Interest Holiday ')]//following-sibling::ion-input/input")
	private WebElement interestHoliday;
	public WebElement interestHoliday() 
	{
		return interestHoliday;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Principal Holiday ')]//following-sibling::ion-input/input")
	private WebElement principalHoliday;
	public WebElement principalHoliday() 
	{
		return principalHoliday;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Interest Computed *']")
	private WebElement interestComputed;
	public WebElement interestComputed() 
	{
		return interestComputed;
	}
	@FindBy(xpath="//ion-label[contains(text(),' MORATORIUM_START_MONTH_OR_INSTALLMENT ')]//following-sibling::ion-input/input")
	private WebElement moratoriumStartMonthorInstallment;
	public WebElement moratoriumStartMonthorInstallment() 
	{
		return moratoriumStartMonthorInstallment;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Recomputation of Profit *']")
	private WebElement recomputationofProfit;
	public WebElement recomputationofProfit() 
	{
		return recomputationofProfit;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Pre-EMI *']")
	private WebElement preEMI;
	public WebElement preEMI() 
	{
		return preEMI;
	}
	@FindBy(xpath="//ion-label[contains(text(),' No. Of Pre-EMI Installment ')]//following-sibling::ion-input/input")
	private WebElement preEMIInstallment;
	public WebElement preEMIInstallment() 
	{
		return preEMIInstallment;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  MI_RECOVERY_TO_BE_RENAMED_AS *']")
	private WebElement miRecoveryToBeRenamedAs;
	public WebElement miRecoveryToBeRenamedAs() 
	{
		return miRecoveryToBeRenamedAs;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  BPI_REPAYMENT_TENURE_METHOD *']")
	private WebElement bpiRepaymentTenureMethod;
	public WebElement bpiRepaymentTenureMethod() 
	{
		return bpiRepaymentTenureMethod;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  BPI_RATE_METHOD *']")
	private WebElement bpiRateMethod;
	public WebElement bpiRateMethod() 
	{
		return bpiRateMethod;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  BPI_REPAYMENT_FREQUENCY *']")
	private WebElement bpiRepaymentFrequency;
	public WebElement bpiRepaymentFrequency() 
	{
		return bpiRepaymentFrequency;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  TDS_APPLICABLE *']")
	private WebElement tdsApplicable;
	public WebElement tdsApplicable() 
	{
		return tdsApplicable;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  MORATORIUM_TENURE_TYPE ']")
	private WebElement moratoriumTenureType;
	public WebElement moratoriumTenureType() 
	{
		return moratoriumTenureType;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement Save;
	public WebElement Save() 
	{
		return Save;
	}
	@FindBy(xpath="(//div[@role='alert'])[2]")
	private WebElement makerconfirmmsg;
	public WebElement makerconfirmmsg() 
	{
		return makerconfirmmsg;
	}
	@FindBy(xpath="//span[text()='×']")
	private WebElement successcancel;
	public WebElement successcancel() 
	{
		return successcancel;
	}
	
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-menu[1]/ion-content[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-content[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/app-screen[1]/ion-content[1]/page-composer-parser[1]/ion-content[1]/ion-grid[1]/ion-row[1]/ion-card[1]/ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
	private WebElement back;
	public WebElement back() 
	{
		return back;
	}
	@FindBy(xpath="//ion-badge[contains(text(),' Maximum KEY NOT FOUND allowed is 999')]")
	private WebElement invalid;
	public WebElement invalid() 
	{
		return invalid;
	}
	@FindBy(xpath="//ion-badge[contains(text(),' Required field')]")
	private WebElement reqfields;
	public WebElement reqfields() 
	{
		return reqfields;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIcon;
	public WebElement searchIcon() 
	{
		return searchIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-user-edit']")
	private WebElement actionIcon;
	public WebElement actionIcon() 
	{
		return actionIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-label='Return']")
	private WebElement returnIcon;
	public WebElement returnIcon() 
	{
		return returnIcon;
	}
	
	@FindBy(xpath="(//ion-chip[@class='ng-star-inserted ios ion-activatable hydrated'])[1]")
	private WebElement remarksText;
	public WebElement remarksText() 
	{
		return remarksText;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-replay']")
	private WebElement returnButtonInRemarks;
	public WebElement returnButtonInRemarks() 
	{
		return returnButtonInRemarks;
	}
	@FindBy(xpath="//ion-item[@ng-reflect-text='Inbox']")
	private WebElement checkerInbox;
	public WebElement checkerInbox() 
	{
		return checkerInbox;
	}
	
	@FindBy(xpath="//ion-button[@ng-reflect-text='Menu']")
	private WebElement menuIcon;
	public WebElement menuIcon() 
	{
		return menuIcon;
	}
	@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement referenceid;
	public WebElement referenceid() 
	{
		return referenceid;
	}
	@FindBy(xpath="//button/span[contains(text(),'Submit')]")
	private WebElement submit;
	public WebElement submit() 
	{
		return submit;
	}
	@FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
	private WebElement popupsubmit;
	public WebElement popupsubmit() 
	{
		return popupsubmit;
	}
	@FindBy(xpath="//ion-textarea[1]/div[1]/textarea[1]")
	private WebElement popupremark;
	public WebElement popupremark() 
	{
		return popupremark;
	}
	@FindBy(xpath="//div[@id='toast-container']/div[1]")
	private WebElement ProductCheckerid;
	public WebElement ProductCheckerid() 
	{
		return ProductCheckerid;
	}
	
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-menu[1]/ion-content[1]/ion-split-pane[1]/ion-menu[1]/ion-content[1]/div[1]/ion-card-content[1]/ion-col[1]/ion-card-content[7]/ion-card-content[1]/ion-item[4]/ion-buttons[1]/ion-button[1]")
	private WebElement subproductediticon;
	public WebElement subproductediticon() 
	{
		return subproductediticon;
	}
	@FindBy(xpath="//ion-item[@ng-reflect-text='Inbox']")
	private WebElement mailicon;
	public WebElement mailicon() 
	{
		return mailicon;
	}
	@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement searchiconreferenceid;
	public WebElement searchiconreferenceid() 
	{
		return searchiconreferenceid;
	}
	@FindBy(xpath="//span[text()=' Inbox ']//parent::div//child::span[2]/input")
	private WebElement searchsentkeys;
	public WebElement searchsentkeys() 
	{
		return searchsentkeys;
	}
	@FindBy(xpath="//span[contains(text(),'Approve')]")
	private WebElement CheckerApprove;
	public WebElement CheckerApprove() 
	{
		return CheckerApprove;
	}
	@FindBy(xpath="//div[contains(text(),'Record APPROVED Successfully')]")
	private WebElement ApprovedMSG;
	public WebElement ApprovedMSG() 
	{
		return ApprovedMSG;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement inboxediticon;
	public WebElement inboxediticon() 
	{
		return inboxediticon;
	}
	@FindBy(xpath="//ion-badge[contains(text(),'Maximum KEY NOT FOUND allowed is 999')]")
	private WebElement errmsg;
	public WebElement errmsg() 
	{
		return errmsg;
	}
	

	
	
	

}
