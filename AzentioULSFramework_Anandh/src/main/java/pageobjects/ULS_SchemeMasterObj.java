package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_SchemeMasterObj {
	WebDriver driver;

	public ULS_SchemeMasterObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[text()='Config Manager']")
	private WebElement ULS_ConfigmanagerMainMenu;

	public WebElement ULSConfigmanagerMainMenu() {
		return ULS_ConfigmanagerMainMenu;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement schemeMaster_BackButton;

	public WebElement schemeMasterBackButton() {
		return schemeMaster_BackButton;
	}

	@FindBy(xpath = "//button[@icon='pi pi-save']")
	private WebElement schemeMaster_SaveButton;

	public WebElement schemeMasterSaveButton() {
		return schemeMaster_SaveButton;
	}

	@FindBy(xpath = "//ion-label[text()='SchemeMaster']//parent::ion-item//ion-buttons//ion-button[2]")
	private WebElement uLS_SchemeMaster_ViewIcon;

	public WebElement ulsSchemeAMasterViewIcon() {
		return uLS_SchemeMaster_ViewIcon;
	}

	@FindBy(xpath = "//ion-label[text()='SchemeMaster']/parent::ion-item//ion-buttons//ion-button[1]")
	private WebElement uLS_SchemeMaster_TempView;

	public WebElement ulsSchemeAMasterTempView() {
		return uLS_SchemeMaster_TempView;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement uls_SchemeMasterFirstRecord;
	public WebElement ulsSchemeMasterFirstRecord()
	{
		return uls_SchemeMasterFirstRecord;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement schemeMaster_AddButton;

	public WebElement schemeMasterAddButton() {
		return schemeMaster_AddButton;
	}

	@FindBy(xpath = "//ion-label[text()=' Description ']/following-sibling::ion-input//input")
	private WebElement schemeMaster_DescriptionTextBox;

	public WebElement schemeMasterDescriptionTextBox() {
		return schemeMaster_DescriptionTextBox;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,   Product Type *'])[1]")
	private WebElement schemeMaster_ProductTypeDropDown;

	public WebElement schemeMasterProductTypeDropDown() {
		return schemeMaster_ProductTypeDropDown;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,  Product Subtype *'])[1]")
	private WebElement schemeMaster_subProductTypeDropDwon;

	public WebElement schemematserSubProducTypeDropDown() {
		return schemeMaster_subProductTypeDropDwon;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,   Loan Currency *'])[1]")
	private WebElement schemeMaster_LoanCurrencyDropDown;

	public WebElement schemeMasterLoanCurrencyDropDwon() {
		return schemeMaster_LoanCurrencyDropDown;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,   Indexation Currency *'])[1]")
	private WebElement schemeMaster_IndexationCurrencyDropDown;

	public WebElement schemeMasterIndexationCurrencyDropDwon() {
		return schemeMaster_IndexationCurrencyDropDown;
	}

	@FindBy(xpath = "(//ion-label[text()='  Valid From ']/ancestor::ion-item/p-calendar//button)[1]")
	private WebElement schemeMaster_ValidFromDate;

	public WebElement schemeMasterValidFromDate() {
		return schemeMaster_ValidFromDate;
	}

	@FindBy(xpath = "(//ion-label[text()=' Valide To ']/ancestor::ion-item/p-calendar//button)[1]")
	private WebElement schemeMaster_ValidToDate;

	public WebElement schemeMasterValidToDate() {
		return schemeMaster_ValidToDate;
	}

	@FindBy(xpath = "//ion-label[text()='  Min Finance Amount ']/following-sibling::ion-input//input")
	private WebElement schemeMaster_MinFinanceAmount;

	public WebElement schemeMasterMinFinanceAmount() {
		return schemeMaster_MinFinanceAmount;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Finance Amount ']/following-sibling::ion-input//input")
	private WebElement schemeMaster_MaxFinanceAmount;

	public WebElement schemeMasterMaxFinanceAmount() {
		return schemeMaster_MaxFinanceAmount;
	}

	@FindBy(xpath = "//ion-label[text()='  Min Tenor In Months ']/following-sibling::ion-input//input")
	private WebElement schemeMaster_MinTenorInMonths;

	public WebElement schemeMasterMinTenorInMonths() {
		return schemeMaster_MinTenorInMonths;
	}

	@FindBy(xpath = "//ion-label[text()='  max Tenor In Months ']/following-sibling::ion-input//input")
	private WebElement schemeMaster_MaxTenorInMonths;

	public WebElement schemeMasterMaxTenorInMonths() {
		return schemeMaster_MaxTenorInMonths;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Repayment Type *']")
	private WebElement schemeMaster_RepaymentType;

	public WebElement schemeMasterRepaymentType() {
		return schemeMaster_RepaymentType;
	}
	                 //ion-select[@aria-label='Select,  Flat/Reducing *']
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Flat/Reducing *']")
	private WebElement schemeMaster_FlatReducing;

	public WebElement schemeMasterFlatReducing() {
		return schemeMaster_FlatReducing;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Int. Amortization Method *']")
	private WebElement schemeMaster_AmortizationMethod;

	public WebElement schemeMaster_AmortizationMethod() {
		return schemeMaster_AmortizationMethod;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Compute Installment on *']")
	private WebElement schemeMaster_ComputeInstallmentOn;

	public WebElement schemeMaster_ComputeInstallmentOn() {
		return schemeMaster_ComputeInstallmentOn;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Inst. due date method *']")
	private WebElement schemeMaster_InstDuedateMethod;

	public WebElement schemeMasterInstDuedateMethod() {
		return schemeMaster_InstDuedateMethod;
	}
	@FindBy(xpath="(//span[text()='Active']/ancestor::P-celleditor/parent::td/preceding-sibling::td[3]//button[1])[1]")
	private WebElement schemeMaster_SchemeChargeActiveRecord;
	public WebElement schemeMasterSchemeChargeActiveRecord()
	{
		return schemeMaster_SchemeChargeActiveRecord;
	}
	@FindBy(xpath="//ion-toggle[@role='switch']")
	private WebElement schemeMaster_ToggleButton;
	public WebElement schemeMasterToggleButton()
	{
		return schemeMaster_ToggleButton;
	}
	@FindBy(xpath="(//span[text()='Active']/ancestor::P-celleditor/parent::td/preceding-sibling::td[5]//button[1])[1]")
	private WebElement schemeMaster_BasicEligibilityActiveRecord;
	public WebElement schemeMasterBasicEligibilityActiveRecord()
	{
		return schemeMaster_BasicEligibilityActiveRecord;
	}
	@FindBy(xpath="(//span[text()='Active']/ancestor::P-celleditor/parent::td/preceding-sibling::td[3]//button[1])[1]")
	private WebElement schemeMaster_VerificationDetailsActiveRecord;
	public WebElement schemeMasterVerificationDetailsActiveRecord()
	{
		return schemeMaster_VerificationDetailsActiveRecord;
	}
	@FindBy(xpath="(//span[text()='Active']/ancestor::P-celleditor/parent::td/preceding-sibling::td[3]//button[1])[1]")
	private WebElement schemeMaster_ValuationActiveRecord;
	public WebElement schemeMasterValuationActiveRecord()
	{
		return schemeMaster_ValuationActiveRecord;
	}
	
	@FindBy(xpath = "//ion-label[text()=' LPC grace period (days) ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_LPCGracePeriodTestBox;

	public WebElement schemeMasterLPCGracePeriodTestBox() {
		return schemeMaster_LPCGracePeriodTestBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Principal Repayment Frequency *']")
	private WebElement schemeMaster_PrincipalRepaymentFrequency;

	public WebElement schemeMasterPrincipalRepaymentFrequency() {
		return schemeMaster_PrincipalRepaymentFrequency;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Interest Repayment Frequency *']")
	private WebElement schemeMaster_InterestRepaymentFrequencyDropDown;

	public WebElement schemeMasterInterestRepaymentFrequencyDropDown() {
		return schemeMaster_InterestRepaymentFrequencyDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  Inst. Rounding Logic ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_InstRoundingLogicTextbox;

	public WebElement schemeMasterInstRoundingLogicTextbox() {
		return schemeMaster_InstRoundingLogicTextbox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Loan Eligibility Calc. *']")
	private WebElement schemeMaster_LoanEligibilityCalcDropDown;

	public WebElement schemeMasterLoanEligibilityCalcDropDown() {
		return schemeMaster_LoanEligibilityCalcDropDown;
	}

	@FindBy(xpath = "//textarea")
	private WebElement schemeMaster_Remarks;

	public WebElement schemeMasterRemarks() {
		return schemeMaster_Remarks;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Include Co-Applicant Inc. *']")
	private WebElement schemeMaster_IncludeCoApplicantDropDown;

	public WebElement schemeMasterIncludeCoApplicantDropDown() {
		return schemeMaster_IncludeCoApplicantDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Include Guarantor Inc. *']")
	private WebElement schemeMaster_IncludeGuarantorDropDown;

	public WebElement schemeMaster_IncludeGuarantorDropDown() {
		return schemeMaster_IncludeGuarantorDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Due Period Required *']")
	private WebElement schemeMaster_DuePeriodRequiredDropDown;

	public WebElement schemeMasterDuePeriodRequiredDropDown() {
		return schemeMaster_DuePeriodRequiredDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Max Coapplicants ']//following-sibling::ion-input//input")
	private WebElement schemeMaster_MaxCoapplicantsTextBox;

	public WebElement schemeMasterMaxCoapplicantsTextBox() {
		return schemeMaster_MaxCoapplicantsTextBox;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Guarantors ']//following-sibling::ion-input//input")
	private WebElement schemeMaster_MaxGuarantorsTextBox;

	public WebElement schemeMasterMaxGuarantorsTextBox() {
		return schemeMaster_MaxGuarantorsTextBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Inst. Commence From *']")
	private WebElement schemeMaster_InstCommenceDropDown;

	public WebElement schemeMasterInstCommenceDropDown() {
		return schemeMaster_InstCommenceDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Days In Year *']")
	private WebElement schemeMaster_DaysInYearDropDown;

	public WebElement schemeMasterDaysInYearDropDown() {
		return schemeMaster_DaysInYearDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Multiple Disburs. Tranch Allowed *']")
	private WebElement schemeMaster_MultipleDisBursTranchAllowdDropDown;

	public WebElement schemeMasterMultipleDisBursTranchAllowdDropDown() {
		return schemeMaster_MultipleDisBursTranchAllowdDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,    Include Income Dedu. Debt *']")
	private WebElement schemeMaster_IncludeIncomeDeptDropDown;

	public WebElement schemeMasterIncludeIncomeDeptDropDown() {
		return schemeMaster_IncludeIncomeDeptDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Round Off *']")
	private WebElement schemeMaster_RoundOffDropDown;

	public WebElement schemeMasterRoundOffDropDown() {
		return schemeMaster_RoundOffDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  Roundoff Value ']/following-sibling::ion-input//input")
	private WebElement schemeMaster_RoundOffValueTextBox;

	public WebElement schemeMasterRoundOffValueTextBox() {
		return schemeMaster_RoundOffValueTextBox;
	}

	@FindBy(xpath = "//ion-label[text()='  Offer Validity (Days) ']/following-sibling::ion-input//input")
	private WebElement schemeMaster_OfferValidityDays;

	public WebElement schemeOfferValidityDays() {
		return schemeMaster_OfferValidityDays;
	}

	@FindBy(xpath = "//ion-label[text()=' Appropriation Code ']//following-sibling::ion-select")
	private WebElement schemeMaster_AppropriationCode;

	public WebElement schemeMasterAppropriationCode() {
		return schemeMaster_AppropriationCode;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Balloon Allowed *']")
	private WebElement schemeMaster_BaloonAllowedDropDown;

	public WebElement schemeMasterBaloonAllowedDropDown() {
		return schemeMaster_BaloonAllowedDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  Maximum Balloon Percentage ']/following-sibling::ion-input//input")
	private WebElement schemeMaster_MaximumBalloonPercentageTextBox;

	public WebElement schemeMasterMaximumBalloonPercentageTextBox() {
		return schemeMaster_MaximumBalloonPercentageTextBox;
	}

	@FindBy(xpath = "//ion-label[text()='  Min IRR ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_MinIRRTextBox;

	public WebElement schemeMasterMinIRRTextBox() {
		return schemeMaster_MinIRRTextBox;
	}

	@FindBy(xpath = "//ion-label[text()='  Max IRR ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_MaxIRRTextBox;

	public WebElement schemeMasterMaxIRRTextBox() {
		return schemeMaster_MaxIRRTextBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Pre-owned Asset *']")
	private WebElement schemeMaster_PreOwnedAssetDropdown;

	public WebElement schemeMasterPreOwnedAssetDropdown() {
		return schemeMaster_PreOwnedAssetDropdown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Day Count Convention for BPI *']")
	private WebElement schemeMaster_DayCountConventionForBPIDropdown;

	public WebElement schemeMasterDayCountConventionForBPIDropdown() {
		return schemeMaster_DayCountConventionForBPIDropdown;
	}

	@FindBy(xpath = "//ion-label[text()=' Discounting Factor Rounding ']/following-sibling::ion-input//input")
	private WebElement schemeMaster_DiscountFactorRoundingTextBox;

	public WebElement schemeMasterDiscountFactorRoundingTextBox() {
		return schemeMaster_DiscountFactorRoundingTextBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Interest Charging Starts From *']")
	private WebElement schemeMaster_InterestChargingStartFromDropDown;

	public WebElement schemeMasterInterestChargingStartFromDropDown() {
		return schemeMaster_InterestChargingStartFromDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   MI Recovery *']")
	private WebElement schemeMaster_MIRecoveryDropDown;

	public WebElement schemeMasterMIRecoveryDropDown() {
		return schemeMaster_MIRecoveryDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   BPI Recovery *']")
	private WebElement schemeMaster_BPIRecoveryDropDown;

	public WebElement schemeMasterBPIRecoveryDropDown() {
		return schemeMaster_BPIRecoveryDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Installment Recovery Type *']")
	private WebElement schemeMaster_InstallmentRecoveryTypeDropDown;

	public WebElement schemeMasterInstallmentRecoveryTypeDropDown() {
		return schemeMaster_InstallmentRecoveryTypeDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Rate Type *']")
	private WebElement schemeMaster_RateTypeDropDown;

	public WebElement schemeMasterRateTypeDropDown() {
		return schemeMaster_RateTypeDropDown;
	}

//@FindBy(xpath="//ion-select[@aria-label=' Select ,   Rate Type *']")
//private WebElement schemeMaster_RateTypeDropDown;
//
//public WebElement schemeMasterRateTypeDropDown() {
//	return schemeMaster_RateTypeDropDown;
//}
	@FindBy(xpath = "//ion-select[@aria-label='Select,   Initiate Disc. Factor *']")
	private WebElement schemeMaster_InitiateDiscFactorDropDown;

	public WebElement schemeMasterInitiateDiscFactorDropDown() {
		return schemeMaster_InitiateDiscFactorDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  Resch Lockin ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_ReschLockinTextBox;

	public WebElement schemeMasterReschLockinTextBox() {
		return schemeMaster_ReschLockinTextBox;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Resch in a year ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_MaxReschLockinTextBox;

	public WebElement schemeMasterMaxReschLockinTextBox() {
		return schemeMaster_MaxReschLockinTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Total Resch Allowed ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_TotalReschAllowedTextBox;

	public WebElement schemeMasterTotalReschAllowedTextBox() {
		return schemeMaster_TotalReschAllowedTextBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Reschedulement Lock-In starts From *']")
	private WebElement schemeMaster_RechedulementLockinStartsFromDropDown;

	public WebElement schemeMasterRechedulementLockinStartsFromDropDown() {
		return schemeMaster_RechedulementLockinStartsFromDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Bulk Payment *']")
	private WebElement schemeMaster_BulkPaymentDropDown;

	public WebElement schemeMasterBulkPaymentDropDown() {
		return schemeMaster_BulkPaymentDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  No of Bulk payment in a Year ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_NoOfBulkPaymentInAYearTextBox;

	public WebElement schemeMasterNoOfBulkPaymentInAYearTextBox() {
		return schemeMaster_NoOfBulkPaymentInAYearTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Bulk payment LockIn Period ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_BulkPaymentLockInPeriodTextBox;

	public WebElement schemeMasterBulkPaymentLockInPeriodTextBox() {
		return schemeMaster_BulkPaymentLockInPeriodTextBox;
	}

	@FindBy(xpath = "//ion-label[text()='  Bulk Payment Time Interval ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_BulkPaymentTimeIntervalTextBox;

	public WebElement schemeMasterBulkPaymentTimeIntervalTextBox() {
		return schemeMaster_BulkPaymentTimeIntervalTextBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Bulk Payment Lock-In starts From ']")
	private WebElement schemeMaster_BulkPaymentLockInStartsFromDropDown;

	public WebElement schemeMasterBulkPaymentLockInStartsFromDropDown() {
		return schemeMaster_BulkPaymentLockInStartsFromDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Bulk Payment Value ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_MaxBulkPaymentValueTextBox;

	public WebElement schemeMasterMaxBulkPaymentValueTextBox() {
		return schemeMaster_MaxBulkPaymentValueTextBox;
	}
	@FindBy(xpath="//ion-label[text()='  Min Bulk Payment Value ']//following-sibling::ion-input//input")
	private WebElement schemeMaster_MinBulkPaymentValuetextBox;
	public WebElement schemeMasterMinBulkPaymentValueTextbox()
	{
		return schemeMaster_MinBulkPaymentValuetextBox;
	}
	@FindBy(xpath="//ion-label[text()='  Min Bulk Payment Value ']//following-sibling::span")
	private WebElement schemeMaster_MinBulkPaymentValueMandatoryVerification;
	public WebElement schemeMasterMinBulkPaymentValueMandatoryVerification()
	{
		return schemeMaster_MinBulkPaymentValueMandatoryVerification;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Immediate/Due date *']")
	private WebElement schemeMaster_ImmediateDueDateDropDown;

	public WebElement schemeMasterImmediateDueDateDropDown() {
		return schemeMaster_ImmediateDueDateDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Min Bulk Payment Parameter ']//following-sibling::ion-select")
	private WebElement schemeMaster_MinBulkPaymentParameterDropDown;

	public WebElement schemeMasterMinBulkPaymentParameterDropDown() {
		return schemeMaster_MinBulkPaymentParameterDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Max Bulk Payment Parameter *']")
	private WebElement schemeMaster_MaxBulkPaymentParameterDropDown;

	public WebElement schemeMasterMaxBulkPaymentParameterDropDown() {
		return schemeMaster_MaxBulkPaymentParameterDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Foreclosure Lockin ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_ForeClosureLockinTextbox;

	public WebElement schemeMasterForeClosureLockinTextbox() {
		return schemeMaster_ForeClosureLockinTextbox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Foreclosure Lock-In starts From ']")
	private WebElement schemeMaster_ForeClosureLockInStartsFrom;

	public WebElement schemeMasterForeClouserLockInStartsFromDropDown() {
		return schemeMaster_ForeClosureLockInStartsFrom;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Min Rebate Parameter ']")
	private WebElement schemeMaster_MinRebateParameterDropDown;

	public WebElement schemeMasterMinRebateParameterDropDown() {
		return schemeMaster_MinRebateParameterDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  Min Rebate Value ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_MinRebateValueTextbox;

	public WebElement schemeMasterMinRebateValueTextbox() {
		return schemeMaster_MinRebateValueTextbox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Max Rebate Parameter ']")
	private WebElement schemeMaster_MaxRebateParameterDropDown;

	public WebElement schemeMasterMaxRebateParameterDropDown() {
		return schemeMaster_MaxRebateParameterDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Rebate Value ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_MaxRebateValueTextbox;

	public WebElement schemeMasterMaxRebateValueTextbox() {
		return schemeMaster_MaxRebateValueTextbox;
	}

	@FindBy(xpath = "//ion-label[text()='  Interest Holiday ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_InterestHoliDayTextbox;

	public WebElement schemeMasterInterestHoliDayTextbox() {
		return schemeMaster_InterestHoliDayTextbox;
	}

	@FindBy(xpath = "//ion-label[text()='  Principal Holiday ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_PrincipalHoliDayTextbox;

	public WebElement schemeMasterPrincipalHoliDayTextbox() {
		return schemeMaster_PrincipalHoliDayTextbox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,    Recomputation of Profit ']")
	private WebElement schemeMaster_RecomputationOfProfitDropDown;

	public WebElement schemeMasterRecomputationOfProfitDropDown() {
		return schemeMaster_RecomputationOfProfitDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Is Step-Up Allowed ']")
	private WebElement schemeMaster_IsSetUpAllowedDropDown;

	public WebElement schemeMasterIsSetUpAllowedDropDown() {
		return schemeMaster_IsSetUpAllowedDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Step-Up ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_MaxSetUpTextBox;

	public WebElement schemeMasterMaxSetUpTextBox() {
		return schemeMaster_MaxSetUpTextBox;
	}

	@FindBy(xpath = "//ion-label[text()='   Eligibility Type ']//following-sibling::ion-select")
	private WebElement schemeMaster_EligibilityTypeDropDown;

	public WebElement schemeMasterEligibilityTypeDropDown() {
		return schemeMaster_EligibilityTypeDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Pre-EMI *']")
	private WebElement schemeMaster_PreEMIDropDown;

	public WebElement schemeMasterPreEMIDropDown() {
		return schemeMaster_PreEMIDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  No. Of Pre-EMI Installment ']/following-sibling::ion-input/input")
	private WebElement schemeMaster_NoOfPreEMIInstallmentTextBox;

	public WebElement schemeMasterNoOfPreEMIInstallmentTextBox() {
		return schemeMaster_NoOfPreEMIInstallmentTextBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Is Loan Transfer Allowed ']")
	private WebElement schemeMaster_IsLoanTransferAllowedDropDown;

	public WebElement schemeMasterIsLoanTransferAllowedDropDown() {
		return schemeMaster_IsLoanTransferAllowedDropDown;
	}

	@FindBy(xpath = "//ion-segment-button//ion-label[text()='Scheme Charges']/parent::ion-segment-button")
	private WebElement schemeMaster_SchemeChargesSegmentButton;

	public WebElement schemeMasterSchemeChargesSegmentButton() {
		return schemeMaster_SchemeChargesSegmentButton;
	}

	@FindBy(xpath = "//ion-segment-button//ion-label[text()='Basic Eligibility']/parent::ion-segment-button")
	private WebElement schemeMaster_BasicEligibilitySegmentButton;

	public WebElement schemeMasterBasicEligibilitySegmentButton() {
		return schemeMaster_BasicEligibilitySegmentButton;
	}

	@FindBy(xpath = "//ion-segment-button//ion-label[text()='Verification']/parent::ion-segment-button")
	private WebElement schemeMaster_VerificationSegmentButton;

	public WebElement chemeMasterVerificationSegmentButton() {
		return schemeMaster_VerificationSegmentButton;
	}

	@FindBy(xpath = "//ion-segment-button//ion-label[text()='Valuation']/parent::ion-segment-button")
	private WebElement schemeMaster_ValuationSegmentButton;

	public WebElement chemeMasterValuationSegmentButton() {
		return schemeMaster_ValuationSegmentButton;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Master Charge *']")
	private WebElement schemeCharges_MasterChargeDropDown;

	public WebElement schemeChargesMasterChargeDropDown() {
		return schemeCharges_MasterChargeDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Charge ']")
	private WebElement schemeCharges_ChargeDropDown;

	public WebElement schemeChargeChargeDropDwon() {
		return schemeCharges_ChargeDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Calculation Type *']")
	private WebElement schemeCharges_CalculationTypeDropDown;

	public WebElement schemeChargeCalculationTypeDropDwon() {
		return schemeCharges_CalculationTypeDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  Flat Amount ']/following-sibling::ion-input/input")
	private WebElement schemeCharges_FlatAmountTextBox;

	public WebElement schemeChargesFlatAmountTextBox() {
		return schemeCharges_FlatAmountTextBox;
	}

	@FindBy(xpath = "//ion-label[text()='  Percentage ']/following-sibling::ion-input/input")
	private WebElement schemeCharges_PercentageTextBox;

	public WebElement schemeChargesPercentageTextBox() {
		return schemeCharges_PercentageTextBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Calculated On ']")
	private WebElement schemeCharges_CalculatedOnDropDown;

	public WebElement schemeChargesCalculatedOnDropDown() {
		return schemeCharges_CalculatedOnDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Rec/Pay ']")
	private WebElement schemeCharges_RecPayDropDown;

	public WebElement schemeChargesRecPayDropDown() {
		return schemeCharges_RecPayDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   RecFrom/PayTo ']")
	private WebElement schemeCharges_RecFrom_PayToDropDown;

	public WebElement schemeChargesRecFrom_PayToDropDown() {
		return schemeCharges_RecFrom_PayToDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Include in Cust IRR ']")
	private WebElement schemeCharges_IncludeInCustIRRDropDOwn;

	public WebElement schemeChargesIncluseCustINRDropDown() {
		return schemeCharges_IncludeInCustIRRDropDOwn;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Inc in Bank IRR ']")
	private WebElement schemeCharges_INCinBankIRRDropDown;

	public WebElement schemeChargesINCBankIRRDropDOwn() {
		return schemeCharges_INCinBankIRRDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Level ']")
	private WebElement schemeCharges_LevelDropDown;

	public WebElement schemeChargesLevelDropDOwn() {
		return schemeCharges_LevelDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Currency ']")
	private WebElement schemeCharges_CurrencyDropDown;

	public WebElement schemeChargesCurrencyDropDOwn() {
		return schemeCharges_CurrencyDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Event ']")
	private WebElement schemeCharges_EventDropDown;

	public WebElement schemeChargesEventDropDOwn() {
		return schemeCharges_EventDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Date Unit ']")
	private WebElement schemeCharges_DataUnitDropDown;

	public WebElement schemeChargesDataUnitDropDOwn() {
		return schemeCharges_DataUnitDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='  Date Value ']/following-sibling::ion-input/input")
	private WebElement schemeCharges_DateValueTextBox;

	public WebElement schemeChargesDateValueTextBox() {
		return schemeCharges_DateValueTextBox;
	}

	@FindBy(xpath = "//ion-label[text()='  Charge Count ']/following-sibling::ion-input/input")
	private WebElement schemeCharges_ChargeCountTextBox;

	public WebElement schemeChargesChargeCountTextBox() {
		return schemeCharges_ChargeCountTextBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Accounting Type *']")
	private WebElement schemeCharges_AccountingTypeDropDown;

	public WebElement schemeChargesAccountingTypeDropDown() {
		return schemeCharges_AccountingTypeDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Stage ']")
	private WebElement schemeCharges_StageDropDown;

	public WebElement schemeChargesStageDropDown() {
		return schemeCharges_StageDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,   Module ']")
	private WebElement schemeCharges_ModuleDropDown;

	public WebElement schemeChargesModuleDropDown() {
		return schemeCharges_ModuleDropDown;
	}

	@FindBy(xpath = "//textarea")
	private WebElement schemeCharges_Remarks;

	public WebElement schemeChargesReamrks() {
		return schemeCharges_Remarks;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,   Eligibility Type '])[1]")
	private WebElement basicEligibility_EligibilityTypeDropDown;

	public WebElement basicEligibilityEligibilityTypeDropDown() {
		return basicEligibility_EligibilityTypeDropDown;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,    Eligibility *'])[1]")
	private WebElement basicEligibility_EligibilityDropDown;

	public WebElement basicEligibilityEligibilityDropDown() {
		return basicEligibility_EligibilityDropDown;
	}

	@FindBy(xpath = "//ion-label[text()='    Base ']/following-sibling::ion-input/input")
	private WebElement basicEligibility_BaseTextBox;

	public WebElement basicEligibilityBaseTextBox() {
		return basicEligibility_BaseTextBox;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,   Income to be used *'])[1]")
	private WebElement basicEligibility_IncomeToBeUserDropDown;

	public WebElement basicEligibilityIncomeToBeUserDropDown() {
		return basicEligibility_IncomeToBeUserDropDown;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,  Rule '])[1]")
	private WebElement basicEligibility_RuleDropDown;

	public WebElement basicEligibilityRuleDropDown() {
		return basicEligibility_RuleDropDown;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,   Verification Stage *'])[1]")
	private WebElement verificationDetails_VerificationStageDropDown;

	public WebElement verificationDetailsVerificationStageDropDown() {
		return verificationDetails_VerificationStageDropDown;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,   Rule '])[1]")
	private WebElement verificationDetails_RuleDropDown;

	public WebElement verificationDetailsRuleDropDown() {
		return verificationDetails_RuleDropDown;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,  Asset Type *'])[1]")
	private WebElement valuationDetails_AssetTypeDropDown;

	public WebElement valuationDetailsAssetTypeDropDown() {
		return valuationDetails_AssetTypeDropDown;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,   Rule '])[1]")
	private WebElement valuationDetails_RuleDropDown;

	public WebElement valuationDetailsRuleDropDown() {
		return valuationDetails_RuleDropDown;
	}
	@FindBy(xpath="//ion-radio-group//ion-item[2]//ion-radio[1]")
	private WebElement valuationDetails_AssetTypeDropDownValue;

	public WebElement valuationDetailsAssetTypeDropDownValue() {
		return valuationDetails_AssetTypeDropDownValue;
	}
	@FindBy(xpath = "(//ion-label[text()='  Number Of Valuation ']/following-sibling::ion-input/input)[1]")
	private WebElement valuationDetails_NumberOfValuationTextBox;

	public WebElement valuationDetailsNumberOfValuationTextBox() {
		return valuationDetails_NumberOfValuationTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Description ']/span")
	private WebElement schemeMatser_DescriptionMendatoryField;

	public WebElement schemeMasterDescriptionMendatoryField() {
		return schemeMatser_DescriptionMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()='  Product Type ']/span)[1]")
	private WebElement schemeMatser_ProductTypeMendatoryField;

	public WebElement schemeMasterProdctTypeMendatoryField() {
		return schemeMatser_ProductTypeMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()=' Product Subtype ']/span)[1]")
	private WebElement schemeMatser_ProductSubTypeMendatoryField;

	public WebElement schemeMasterProdctSubTypeMendatoryField() {
		return schemeMatser_ProductSubTypeMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()='  Loan Currency ']/span)[1]")
	private WebElement schemeMatser_ProductLoanCurrencyMendatoryField;

	public WebElement schemeMasterLoanCurrencyMendatoryField() {
		return schemeMatser_ProductLoanCurrencyMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()='  Indexation Currency ']/span)[1]")
	private WebElement schemeMatser_IndexingCurrencyMendatoryField;

	public WebElement schemeMasterIndexingCurrencyMendatoryField() {
		return schemeMatser_IndexingCurrencyMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()='  Valid From ']/span)[1]")
	private WebElement schemeMatser_ValidFromyMendatoryField;

	public WebElement schemeMasterValidFromMendatoryField() {
		return schemeMatser_ValidFromyMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()=' Valide To ']/span)[1]")
	private WebElement schemeMatser_ValidToMendatoryField;

	public WebElement schemeMasterValidToMendatoryField() {
		return schemeMatser_ValidToMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()='  Min Finance Amount ']/span)[1]")
	private WebElement schemeMatser_MinFinanceAmountMendatoryField;

	public WebElement schemeMasterMinFinanceAmountMendatoryField() {
		return schemeMatser_MinFinanceAmountMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()='  Max Finance Amount ']/span)[1]")
	private WebElement schemeMatser_MaxFinanceAmountMendatoryField;

	public WebElement schemeMasterMaxFinanceAmountMendatoryField() {
		return schemeMatser_MaxFinanceAmountMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()='  Min Tenor In Months ']/span)[1]")
	private WebElement schemeMatser_MinTenorInMonthsMendatoryField;

	public WebElement schemeMasterMinTenorInMonthsMendatoryField() {
		return schemeMatser_MinTenorInMonthsMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()='  max Tenor In Months ']/span)[1]")
	private WebElement schemeMatser_MaxTenorInMonthsMendatoryField;

	public WebElement schemeMasterMaxTenorInMonthsMendatoryField() {
		return schemeMatser_MaxTenorInMonthsMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()=' LPC grace period (days) ']/span)[1]")
	private WebElement schemeMatser_LPCGracePeriodMendatoryField;

	public WebElement schemeMasterLPCGracePeriodMendatoryField() {
		return schemeMatser_LPCGracePeriodMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()='  Inst. Rounding Logic ']/span)[1]")
	private WebElement schemeMatser_InstRoundingLogicMendatoryField;

	public WebElement schemeMasterInstRoundingLogicMendatoryField() {
		return schemeMatser_InstRoundingLogicMendatoryField;
	}

	@FindBy(xpath = "(//ion-label[text()=' Remarks ']/span)[1]")
	private WebElement schemeMatser_RemarksMendatoryField;

	public WebElement schemeMasterRemarksMendatoryField() {
		return schemeMatser_RemarksMendatoryField;
	}

	@FindBy(xpath = "//h4[text()='Config Manager']")
	private WebElement schemeMatser_ConfigManagerMainMenu;

	public WebElement schemeMasterConfigManagerMainMenu() {
		return schemeMatser_ConfigManagerMainMenu;
	}

	@FindBy(xpath = "//button[starts-with(@class,'p-datepicker-month')]")
	private WebElement schemeMaster_MonthField;

	public WebElement schemeMasterMonthField() {
		return schemeMaster_MonthField;
	}

	@FindBy(xpath = "//button[starts-with(@class,'p-datepicker-year')]")
	private WebElement schemeMaster_YearField;

	public WebElement schemeMasterYearField() {
		return schemeMaster_YearField;
	}

	@FindBy(xpath = "//span[text()='Today']")
	private WebElement schemeMaster_TodayDate;

	public WebElement schemeMasterTodayDate() {
		return schemeMaster_TodayDate;
	}

	@FindBy(xpath = "//ion-label[text()=' Remarks ']//following-sibling::span")
	private WebElement Scheme_RemarksAstricks1;

	public WebElement Scheme_RemarksAstricks() {
		return Scheme_RemarksAstricks1;
	}

	@FindBy(xpath = "//ion-label[text()=' Max Coapplicants ']//following-sibling::span")
	private WebElement Scheme_MaxCoapplicantsAstricks1;

	public WebElement Scheme_MaxCoapplicantsAstricks() {
		return Scheme_MaxCoapplicantsAstricks1;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Guarantors ']//following-sibling::span")
	private WebElement Scheme_MaxGuarantorsAstricks1;

	public WebElement Scheme_MaxGuarantorsAstricks() {
		return Scheme_MaxGuarantorsAstricks1;
	}

	@FindBy(xpath = "//ion-label[text()='  Roundoff Value ']//following-sibling::span")
	private WebElement Scheme_RoundOffValueAstricks1;

	public WebElement Scheme_RoundOffValueAstricks() {
		return Scheme_RoundOffValueAstricks1;
	}

	@FindBy(xpath = "//ion-label[text()='  Offer Validity (Days) ']//following-sibling::span")
	private WebElement Scheme_OfferValidityAstricks1;

	public WebElement Scheme_OfferValidityAstricks() {
		return Scheme_OfferValidityAstricks1;
	}

	@FindBy(xpath = "//ion-label[text()='  Maximum Balloon Percentage ']//following-sibling::span")
	private WebElement Scheme_MaximumBallonPercentageAstricks1;

	public WebElement Scheme_MaximumBallonPercentageAstricks() {
		return Scheme_MaximumBallonPercentageAstricks1;
	}

	@FindBy(xpath = "//ion-label[text()='  Min IRR ']//following-sibling::span")
	private WebElement Scheme_MinIRRAstricks1;

	public WebElement Scheme_MinIRRAstricks() {
		return Scheme_MinIRRAstricks1;
	}

	@FindBy(xpath = "//ion-label[text()='  Max IRR ']//following-sibling::span")
	private WebElement Scheme_MaxIRRAstricks1;

	public WebElement Scheme_MaxIRRAstricks() {
		return Scheme_MaxIRRAstricks1;
	}

	@FindBy(xpath = "//ion-label[text()=' Discounting Factor Rounding ']//following-sibling::span")
	private WebElement Scheme_DiscountingFactorRoundingAstricks1;

	public WebElement Scheme_DiscountingFactorRoundingAstricks() {
		return Scheme_DiscountingFactorRoundingAstricks1;
	}

	@FindBy(xpath = "//ion-label[text()='  Resch Lockin ']")
	private WebElement Reschedulement_ReshLockin1;

	public WebElement Reschedulement_ReshLockin() {
		return Reschedulement_ReshLockin1;
	}
	@FindBy(xpath = "//ion-label[text()='  Resch Lockin ']//following-sibling::span")
	private WebElement Reschedulement_ReshLockin1Mandatory;

	public WebElement ReschedulementReshLockin1Mandatory() {
		return Reschedulement_ReshLockin1Mandatory;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Resch in a year ']//following-sibling::span")
	private WebElement Reschedulement_MaxReschInAYearAstrick1;

	public WebElement Reschedulement_MaxReschInAYearAstrick() {
		return Reschedulement_MaxReschInAYearAstrick1;
	}

	@FindBy(xpath = "//ion-label[text()=' Total Resch Allowed ']")
	private WebElement Reschedulement_TotalReschAllowed1;

	public WebElement Reschedulement_TotalReschAllowed() {
		return Reschedulement_TotalReschAllowed1;
	}

	@FindBy(xpath = "//ion-label[text()='  No of Bulk payment in a Year ']//following-sibling::span")
	private WebElement BulkPayment_NoOfBulkPaymentInAYearAstrick1;

	public WebElement BulkPayment_NoOfBulkPaymentInAYearAstrick() {
		return BulkPayment_NoOfBulkPaymentInAYearAstrick1;
	}

	@FindBy(xpath = "//ion-label[text()=' Bulk payment LockIn Period ']")
	private WebElement BulkPayment_BulkPaymentLockInperiod1;

	public WebElement BulkPayment_BulkPaymentLockInperiod() {
		return BulkPayment_BulkPaymentLockInperiod1;
	}

	@FindBy(xpath = "//ion-label[text()='  Bulk Payment Time Interval ']")
	private WebElement BulkPayment_BulkPaymentTimeInterval1;

	public WebElement BulkPayment_BulkPaymentTimeInterval() {
		return BulkPayment_BulkPaymentTimeInterval1;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Bulk Payment Value ']//following-sibling::span")
	private WebElement BulkPayment_MaxBulkPaymentValueastrick1;

	public WebElement BulkPayment_MaxBulkPaymentValueastrick() {
		return BulkPayment_MaxBulkPaymentValueastrick1;
	}

	@FindBy(xpath = "//ion-label[text()=' Foreclosure Lockin ']//following-singling::span")
	private WebElement Foreclosure_ForeclosureLockin1;

	public WebElement Foreclosure_ForeclosureLockin() {
		return Foreclosure_ForeclosureLockin1;
	}

	@FindBy(xpath = "//ion-label[text()='  Min Rebate Value ']//following-sibling::span")
	private WebElement Foreclosure_MinRebateValue1;

	public WebElement Foreclosure_MinRebateValue() {
		return Foreclosure_MinRebateValue1;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Rebate Value ']//following-sibling::span")
	private WebElement Foreclosure_MaxRebateValue1;

	public WebElement Foreclosure_MaxRebateValue() {
		return Foreclosure_MaxRebateValue1;
	}

	@FindBy(xpath = "//ion-label[text()='  Interest Holiday ']//following-sibling::span")
	private WebElement Moratorium_GracePeriod_InterestHoliday1;

	public WebElement Moratorium_GracePeriod_InterestHoliday() {
		return Moratorium_GracePeriod_InterestHoliday1;
	}

	@FindBy(xpath = "//ion-label[text()='  Principal Holiday ']//following-sibling::span")
	private WebElement Moratorium_GracePeriod_PrincipalHoliday1;

	public WebElement Moratorium_GracePeriod_PrincipalHoliday() {
		return Moratorium_GracePeriod_PrincipalHoliday1;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Step-Up ']//following-sibling::span")
	private WebElement Step_Up_MaxStepUp1;

	public WebElement Step_Up_MaxStepUp() {
		return Step_Up_MaxStepUp1;
	}

	@FindBy(xpath = "//ion-label[text()='  No. Of Pre-EMI Installment ']//following-sibling::span")
	private WebElement PreEMI_NoOfPreEMIInstallmentAstrick1;

	public WebElement PreEMI_NoOfPreEMIInstallmentAstrick() {
		return PreEMI_NoOfPreEMIInstallmentAstrick1;
	}

	/// ********************Charge Definition********************************///
	@FindBy(xpath = "//ion-label[text()='  Flat Amount ']")
	private WebElement ChargeDefinition_FlatAmount1;

	public WebElement ChargeDefinition_FlatAmount() {
		return ChargeDefinition_FlatAmount1;
	}

	@FindBy(xpath = "//ion-label[text()='  Percentage ']")
	private WebElement ChargeDefinition_Percentage1;

	public WebElement ChargeDefinition_Percentage() {
		return ChargeDefinition_Percentage1;
	}

	@FindBy(xpath = "//ion-label[text()='  Date Value ']")
	private WebElement ChargeDefinition_DateValue1;

	public WebElement ChargeDefinition_DateValue() {
		return ChargeDefinition_DateValue1;
	}

	@FindBy(xpath = "//ion-label[text()='  Charge Count ']")
	private WebElement ChargeDefinition_ChargeCount1;

	public WebElement ChargeDefinition_ChargeCount() {
		return ChargeDefinition_ChargeCount1;
	}

	@FindBy(xpath = "//ion-label[text()=' Remarks ']")
	private WebElement ChargeDefinition_Remarks1;

	public WebElement ChargeDefinition_Remarks() {
		return ChargeDefinition_Remarks1;
	}

	/// *************Basic eligibility*****************//
	@FindBy(xpath = "//ion-label[text()='    Base ']//following-sibling::span")
	private WebElement BasicEligibility_BaseAstrick1;

	public WebElement BasicEligibility_BaseAstrick() {
		return BasicEligibility_BaseAstrick1;
	}

	////// ******Valuation************//
	@FindBy(xpath = "//ion-label[text()='  Number Of Valuation ']//following-sibling::span")
	private WebElement Valuation_NumberOfValuationAstrick1;

	public WebElement Valuation_NumberOfValuationAstrick() {
		return Valuation_NumberOfValuationAstrick1;
	}
	@FindBy(xpath="//ion-icon[@aria-label='mail outline']")
	private WebElement schemeMaster_mailBox;
	public WebElement schemeMasterMailBox()
	{
		return schemeMaster_mailBox;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-search'])[2]")
	private WebElement schemeMaster_inboxSearch;
	public WebElement schemeMasterinboxSearch()
	{
		return schemeMaster_inboxSearch;
	}
	@FindBy(xpath="//app-inbox[1]//p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement schemeMaster_referenceID;
	public WebElement schemeMasterreferenceID()
	{
		return schemeMaster_referenceID;
	}
	@FindBy(xpath="//app-inbox[1]//p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]//button")
	private WebElement schemeMaster_inboxFirstRecord;
	public WebElement schemeMasterinboxFirstRecord()
	{
		return schemeMaster_inboxFirstRecord;
	}
	@FindBy(xpath="//span[text()='Submit']/parent::button")
	private WebElement schemeMaster_SubmitButton;
	public WebElement schemeMasterSubmitButton()
	{
		return schemeMaster_SubmitButton;
	}
	@FindBy(xpath="(//textarea)[2]")
	private WebElement schemeMaster_alertRemark;
	public WebElement schemeMasteralertRemark()
	{
		return schemeMaster_alertRemark;
	}
	@FindBy(xpath="(//button[@label='Submit'])[2]")
	private WebElement schemeMaster_alertSubmitButton;
	public WebElement schemeMasteraleralertSubmitButton()
	{
		return schemeMaster_alertSubmitButton;
	}
	@FindBy(xpath="//div[@id='toast-container']//div[@role='alert']")
	private WebElement schemeMaster_submitToastAlert;
	public WebElement schemeMastersubmitToastAlert()
	{
		return schemeMaster_submitToastAlert;
	}
	@FindBy(xpath="//div[@id='toast-container']//button")
	private WebElement schemeMaster_ToastAlertClose;
	public WebElement schemeMasterToastAlertClose()
	{
		return schemeMaster_ToastAlertClose;
	}
	@FindBy(xpath="//ion-button[@ng-reflect-text='Menu']")
	private WebElement schemeMaster_checkerMenuBar;
	public WebElement schemeMasterCheckerMenuBar()
	{
		return schemeMaster_checkerMenuBar;
	}
	@FindBy(xpath="//ion-label[text()='  Product Type ']/following-sibling::ion-select")
	private WebElement checker_productTypeValue;
	public WebElement checkerProductTypeValue()
	{
		return checker_productTypeValue;
	}
	@FindBy(xpath="//ion-label[text()=' Product Subtype ']/following-sibling::ion-select")
	private WebElement checker_subproductTypeValue;
	public WebElement checkerSubProductTypeValue()
	{
		return checker_subproductTypeValue;
	}
	@FindBy(xpath="//ion-label[text()=' Description ']/following-sibling::ion-input")
	private WebElement checker_DescriptionValue;
	public WebElement checkerDescriptionValue()
	{
		return checker_DescriptionValue;
	}
	@FindBy(xpath="//ion-label[text()='  Loan Currency ']/following-sibling::ion-select")
	private WebElement checker_LoanCurrencyValueDropDown;
	public WebElement checkerLoanCurrencyValueDropDown()
	{
		return checker_LoanCurrencyValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()='  Indexation Currency ']/following-sibling::ion-select")
	private WebElement checker_IndexationCurrencyValueDropDown;
	public WebElement checkerIndexationCurrencyValueDropDown()
	{
		return checker_IndexationCurrencyValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()='  Repayment Type ']/following-sibling::ion-select")
	private WebElement checker_RepaymentTypeValueDropDown;
	public WebElement checkerRepaymentTypeValueDropDown()
	{
		return checker_RepaymentTypeValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Flat/Reducing ']/following-sibling::ion-select")
	private WebElement checker_FlatReducingValueDropDown;
	public WebElement checkerFlatReducingValueDropDown()
	{
		return checker_FlatReducingValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Int. Amortization Method ']/following-sibling::ion-select")
	private WebElement checker_INTAmortizationValueDropDown;
	public WebElement checker_INTAmortizationValueDropDownValue()
	{
		return checker_INTAmortizationValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Compute Installment on ']/following-sibling::ion-select")
	private WebElement checker_ComputeInstallmentValueDropDown;
	public WebElement checker_ComputeInstallmentValueDropDown()
	{
		return checker_ComputeInstallmentValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Inst. due date method ']/following-sibling::ion-select")
	private WebElement checker_DueDateMethodValueDropDown;
	public WebElement checker_DueDateMethodValueDropDown()
	{
		return checker_DueDateMethodValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Principal Repayment Frequency ']/following-sibling::ion-select")
	private WebElement checker_PrincipalRepaymentFrequencyDropDown;
	public WebElement checker_PrincipalRepaymentFrequencyDropDown()
	{
		return checker_PrincipalRepaymentFrequencyDropDown;
	}
	@FindBy(xpath="//ion-label[text()='  Interest Repayment Frequency ']/following-sibling::ion-select")
	private WebElement checker_InterestRepaymentFrequencyDropDown;
	public WebElement checker_InterestRepaymentFrequencyDropDown()
	{
		return checker_InterestRepaymentFrequencyDropDown;
	}
	@FindBy(xpath="//ion-label[text()='  Loan Eligibility Calc. ']/following-sibling::ion-select")
	private WebElement checker_LoanEligibilityValueDropDown;
	public WebElement checker_LoanEligibilityValueDropDown()
	{
		return checker_LoanEligibilityValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()='  Include Co-Applicant Inc. ']/following-sibling::ion-select")
	private WebElement checker_IncludeCoApplicantValueDropDown;
	public WebElement checker_IncludeCoApplicantValueDropDown()
	{
		return checker_IncludeCoApplicantValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()='  Include Guarantor Inc. ']/following-sibling::ion-select")
	private WebElement checker_IncludeGuarentorValueDropDown;
	public WebElement checker_IncludeGuarentorValueDropDown()
	{
		return checker_IncludeGuarentorValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()='  Due Period Required ']/following-sibling::ion-select")
	private WebElement checker_DuePeriodValueDropDown;
	public WebElement checker_DuePeriodValueDropDown()
	{
		return checker_DuePeriodValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()='  Inst. Commence From ']/following-sibling::ion-select")
	private WebElement checker_InstCommenceFromValueDropDown;
	public WebElement checker_InstCommenceFromValueDropDown()
	{
		return checker_InstCommenceFromValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Days In Year ']/following-sibling::ion-select")
	private WebElement checker_DasInYearValueDropDown;
	public WebElement checker_DasInYearValueDropDown()
	{
		return checker_DasInYearValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()='  Multiple Disburs. Tranch Allowed ']/following-sibling::ion-select")
	private WebElement checker_MultipleDisbursValueDropDown;
	public WebElement checker_MultipleDisbursValueDropDown()
	{
		return checker_MultipleDisbursValueDropDown;
	}
	@FindBy(xpath="//ion-label[text()='   Include Income Dedu. Debt ']/following-sibling::ion-select")
	private WebElement checker_IncluseIncomeDeduValueDropDown;
	public WebElement checker_IncluseIncomeDeduValueDropDown()
	{
		return checker_IncluseIncomeDeduValueDropDown;
	}
//	@FindBy(xpath="//ion-label[text()='  Round Off ']/following-sibling::ion-select")
//	private WebElement checker_IncluseIncomeDeduValueDropDown;
//	public WebElement checker_IncluseIncomeDeduValueDropDown()
//	{
//		return checker_IncluseIncomeDeduValueDropDown;
//	}
	@FindBy(xpath="//span[text()='Approve']/parent::button")
	private WebElement checker_ApproveButton;
	public WebElement checkerApproveButton()
	{
		return checker_ApproveButton;
	}
	@FindBy(xpath="//span[text()='Reject']/parent::button")
	private WebElement checker_RejectButton;
	public WebElement checkerRejectButton()
	{
		return checker_RejectButton;
	}
	@FindBy(xpath="//span[text()='Return']/parent::button")
	private WebElement checker_ReturnButton;
	public WebElement checkerReturnButton()
	{
		return checker_ReturnButton;
	}
	@FindBy(xpath="//ion-label[text()=' Please Enter Remarks ']//parent::ion-item//ion-textarea//textarea")
	private WebElement checker_alertRemark;
	public WebElement checkerAlertRemark()
	{
		return checker_alertRemark;
	}
	@FindBy(xpath="(//span[text()='Approve']/parent::button)[2]")
	private WebElement checkerUser_AlertApprove;
	public WebElement checkerAlertApprove()
	{
		return checkerUser_AlertApprove;
	}
	@FindBy(xpath="(//span[text()='Reject']/parent::button)[2]")
	private WebElement checker_AlertRejectButton;
	public WebElement checkerAlertRejectButton()
	{
		return checker_AlertRejectButton;
	}
	@FindBy(xpath="(//span[text()='Return']/parent::button)[2]")
	private WebElement checker_AlertReturnButton;
	public WebElement checkerAlertReturnButton()
	{
		return checker_AlertReturnButton;
	}
	@FindBy(xpath="//div[@role='alert']")
	private WebElement checker_submitConfirmationPopUp;
	public WebElement checkerConfirmationPopUp()
	{
		return checker_submitConfirmationPopUp;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Search']")
	private WebElement schemeMaster_SearchBox;
	public WebElement schemeMasterSearchBox()
	{
		return schemeMaster_SearchBox;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement schemeMaster_SearchTextBox;
	public WebElement schemeMasterSearchTextBox()
	{
		return schemeMaster_SearchTextBox;
	}
	@FindBy(xpath="//span[text()=' Inbox ']/parent::div//input")
	private WebElement schemeMaster_SearchTextBoxInbox;
	public WebElement schemeMasterSearchTextBoxInbox()
	{
		return schemeMaster_SearchTextBoxInbox;
	}
	@FindBy(xpath="//span[text()=' Status ']")
	private WebElement schemeMaster_ListViewStatus;
	public WebElement schemeMasterListViewStatus()
	{
		return schemeMaster_ListViewStatus;
	}
	@FindBy(xpath="//input[@mode='ios']/parent::span/i")
	private WebElement schemeMaster_TextBoxCloseButton;
	public WebElement schemeMasterTextBoxCloseButton()
	{
		return schemeMaster_TextBoxCloseButton;
	}
}
