package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchemeMasterObject {
	WebDriver driver;

	public SchemeMasterObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[text()='SchemeMaster']/parent::ion-label/following-sibling::ion-buttons/ion-button[2]")
	private WebElement uLS_SchemeMaster_ViewIcon;

	public WebElement ulsSchemeAMasterViewIcon() {
		return uLS_SchemeMaster_ViewIcon;
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

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Flat/Reducing  *']")
	private WebElement schemeMaster_FlatReducing;

	public WebElement schemeMasterFlatReducing() {
		return schemeMaster_FlatReducing;
	}

	@FindBy(xpath = "Select,  Int. Amortization Method *")
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

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Appropriation Code *']")
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

	@FindBy(xpath = "//ion-select[@aria-label='Select,    Bulk payment *']")
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

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Immediate/Due date *']")
	private WebElement schemeMaster_ImmediateDueDateDropDown;

	public WebElement schemeMasterImmediateDueDateDropDown() {
		return schemeMaster_ImmediateDueDateDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Min Bulk Payment Parameter *']")
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

	@FindBy(xpath = "//ion-select[@aria-label='Select,    Eligibility Type ']")
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

	@FindBy(xpath = "//ion-label[contains(text(),'Scheme Charges')]//ancestor::ion-segment-button") // (xpath="//ion-segment-button[2]/ion-label[1]")//(xpath
																									// =
																									// "(//ion-segment-button//ion-label[text()='Scheme
																									// Charges'])[1]")
	private WebElement schemeMaster_SchemeChargesSegmentButton;

	public WebElement schemeMasterSchemeChargesSegmentButton() {
		return schemeMaster_SchemeChargesSegmentButton;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Basic Eligibility')]//ancestor::ion-segment-button") // (xpath =
																										// "(//ion-segment-button//ion-label[text()='Basic
																										// Eligibility'])[1]")
	private WebElement schemeMaster_BasicEligibilitySegmentButton;

	public WebElement schemeMasterBasicEligibilitySegmentButton() {
		return schemeMaster_BasicEligibilitySegmentButton;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Verification')]//ancestor::ion-segment-button") // (xpath =
																									// "(//ion-segment-button//ion-label[text()='Verification'])[1]")
	private WebElement schemeMaster_VerificationSegmentButton;

	public WebElement chemeMasterVerificationSegmentButton() {
		return schemeMaster_VerificationSegmentButton;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Valuation')]//ancestor::ion-segment-button") // (xpath =
																								// "(//ion-segment-button//ion-label[text()='Valuation'])[1]")
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
	private WebElement schemeCharges_DateUnitDropDown;

	public WebElement schemeChargesDateUnitDropDOwn() {
		return schemeCharges_DateUnitDropDown;
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

	/// KAMALAPRIYA//////
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

	@FindBy(xpath = "//ion-label[text()=' Foreclosure Lockin ']")
	private WebElement Foreclosure_ForeclosureLockin1;

	public WebElement Foreclosure_ForeclosureLockin() {
		return Foreclosure_ForeclosureLockin1;
	}

	@FindBy(xpath = "//ion-label[text()='  Min Rebate Value ']")
	private WebElement Foreclosure_MinRebateValue1;

	public WebElement Foreclosure_MinRebateValue() {
		return Foreclosure_MinRebateValue1;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Rebate Value ']")
	private WebElement Foreclosure_MaxRebateValue1;

	public WebElement Foreclosure_MaxRebateValue() {
		return Foreclosure_MaxRebateValue1;
	}

	@FindBy(xpath = "//ion-label[text()='  Interest Holiday ']")
	private WebElement Moratorium_GracePeriod_InterestHoliday1;

	public WebElement Moratorium_GracePeriod_InterestHoliday() {
		return Moratorium_GracePeriod_InterestHoliday1;
	}

	@FindBy(xpath = "//ion-label[text()='  Principal Holiday ']")
	private WebElement Moratorium_GracePeriod_PrincipalHoliday1;

	public WebElement Moratorium_GracePeriod_PrincipalHoliday() {
		return Moratorium_GracePeriod_PrincipalHoliday1;
	}

	@FindBy(xpath = "//ion-label[text()='  Max Step-Up ']")
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

	////// **********************validation**********************////
	@FindBy(xpath = "(//ion-badge[contains(text(),'Required field')])[1]")
	private WebElement SchemeMaster_RequiredField1;

	public WebElement SchemeMaster_RequiredField() {
		return SchemeMaster_RequiredField1;
	}

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-save']")
	private WebElement SchemeMaster_SaveButton1;

	public WebElement SchemeMaster_SaveButton() {
		return SchemeMaster_SaveButton1;
	}

	@FindBy(xpath = "//h4[text()='SchemeMaster']//parent::ion-label//following-sibling::ion-buttons/ion-button[1]")
	private WebElement SchemeMaster_TempViewButton1;

	public WebElement SchemeMaster_TempViewButton() {
		return SchemeMaster_TempViewButton1;
	}

	@FindBy(xpath = "//span[@class='p-button-icon pi pi-pencil']")
	private WebElement SchemeMaster_TempViewPencilButton1;

	public WebElement SchemeMaster_TempViewPencilButton() {
		return SchemeMaster_TempViewPencilButton1;
	}

	@FindBy(xpath = "(//span[text()='Active']//ancestor::p-tag//ancestor::p-celleditor//ancestor::td//preceding-sibling::td//preceding-sibling::td//preceding-sibling::td//child::button/span)[1]")
	private WebElement SchemeMaster_SchemeChargeEditIcon1;

	public WebElement SchemeMaster_SchemeChargeEditIcon() {
		return SchemeMaster_SchemeChargeEditIcon1;
	}

	@FindBy(xpath = "//h4[text()='Product Definitions']")
	private WebElement ProductDefinition1;

	public WebElement ProductDefinition() {
		return ProductDefinition1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement Scheme_BackButton1;

	public WebElement Scheme_BackButton() {
		return Scheme_BackButton1;
	}

	@FindBy(xpath = "//ion-col[1]/ion-card[1]/ion-card-content[1]/kub-prime-table[1]/p-table[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	private WebElement SchemeCharge_addButton1;

	public WebElement SchemeCharge_addButton() {
		return SchemeCharge_addButton1;
	}
	@FindBy(xpath = "//span[contains(text(),'Status')]")
	private WebElement SchemeCharge_StatusButton1;

	public WebElement SchemeCharge_StatusButton() {
		return SchemeCharge_StatusButton1;
	}
	@FindBy(xpath = "//ion-label[text()='Status ']//parent::div//following-sibling::ion-item//child::ion-toggle")
	private WebElement SchemeCharge_ActiveInactive1;

	public WebElement SchemeCharge_ActiveInactive() {
		return SchemeCharge_ActiveInactive1;
	}
	@FindBy(xpath = "//h4[text()='SchemeMaster']/parent::ion-label/following-sibling::ion-buttons/ion-button[1]")
	private WebElement uLS_SchemeMaster_tempViewIcon;

	public WebElement uLS_SchemeMastertempViewIcon() {
		return uLS_SchemeMaster_tempViewIcon;
	}
	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement uLS_SchemeMaster_CancelButton1;

	public WebElement uLS_SchemeMaster_CancelButton() {
		return uLS_SchemeMaster_CancelButton1;
	}
	@FindBy(xpath = "//ion-label[contains(text(),'cancel')]")
	private WebElement uLS_SchemeMaster_SubmitCancelButton1;

	public WebElement uLS_SchemeMaster_SubmitCancelButton() {
		return uLS_SchemeMaster_SubmitCancelButton1;
	}
	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")
	private WebElement uLS_SchemeMaster_FinalSubmitCancelButton1;

	public WebElement uLS_SchemeMaster_FinalSubmitCancelButton() {
		return uLS_SchemeMaster_FinalSubmitCancelButton1;
	}



}

