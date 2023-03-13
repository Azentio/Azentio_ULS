package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_customerDeptDetailsObj {
	WebDriver driver;
	public ULS_customerDeptDetailsObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ion-title[text()=' Financial Commitments ']//ancestor::ion-card//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement customerDeptDetails_Addbutton;
	public WebElement customerDeptDetailsAddButton()
	{
		return customerDeptDetails_Addbutton;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Finance Type ')]//following-sibling::ion-select")
	private WebElement customerDebt_FinanceType;
	public WebElement customerDebtFinanceType() {
		return customerDebt_FinanceType;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Financial Institution ')]//following-sibling::ion-select")
	private WebElement customerDebt_FinancialInstitution;
	public WebElement customerDebtFinancialInstitution() {
		return customerDebt_FinancialInstitution;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Account Number ')]//following-sibling::ion-input/input")
	private WebElement customerDebt_AccountNumber;
	public WebElement customerDebtAccountNumber() {
		return customerDebt_AccountNumber;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[1]")
	private WebElement customerDebt_SanctionDate;
	public WebElement customerDebtSanctionDate() {
		return customerDebt_SanctionDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Sanction Amount ')]//following-sibling::ion-input/input")
	private WebElement customerDebt_SanctionAmount;
	public WebElement customerDebtSanctionAmount() {
		return customerDebt_SanctionAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Interest Rate % ')]//following-sibling::ion-input/input")
	private WebElement customerDebt_InterestRate;
	public WebElement customerDebtInterestRate() {
		return customerDebt_InterestRate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Interest Rate % ')]//following-sibling::ion-input")
	private WebElement customerDebt_InterestRatedateHolder;
	public WebElement customerDebtInterestRatedateHolder() {
		return customerDebt_InterestRatedateHolder;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Current Principal Balance ')]//following-sibling::ion-input/input")
	private WebElement customerDebt_CurrentPrincipalBalance;
	public WebElement customerDebtCurrentPrincipalBalance() {
		return customerDebt_CurrentPrincipalBalance;
	}
	@FindBy(xpath="(//ion-label[contains(text(),' Tenure (months) ')]//following-sibling::ion-input/input)[1]")
	private WebElement customerDebt_TenureMonths;
	public WebElement customerDebtTenureMonths() {
		return customerDebt_TenureMonths;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[2]")
	private WebElement customerDebt_MaturityDate;
	public WebElement customerDebtMaturityDate() {
		return customerDebt_MaturityDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Installment Amount ')]//following-sibling::ion-input/input")
	private WebElement customerDebt_InstallmentAmount;
	public WebElement customerDebtInstallmentAmount() {
		return customerDebt_InstallmentAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Amount Considered ')]//following-sibling::ion-input/input")
	private WebElement customerDebt_AmountConsidered;
	public WebElement customerDebtAmountConsidered() {
		return customerDebt_AmountConsidered;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Currency ')]//following-sibling::ion-select")
	private WebElement customerDebt_Currency;
	public WebElement customerDebtCurrency() {
		return customerDebt_Currency;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Remarks ')]//following-sibling::ion-textarea//textarea")
	private WebElement customerDebt_Remarks;
	public WebElement customerDebtRemarks() {
		return customerDebt_Remarks;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[3]")
	private WebElement customerDebt_NextDueDate;
	public WebElement customerDebtNextDueDate() {
		return customerDebt_NextDueDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Collateral Type ')]//following-sibling::ion-select")
	private WebElement customerDebt_CollateralType;
	public WebElement customerDebtCollateralType() {
		return customerDebt_CollateralType;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[4]")
	private WebElement customerDebt_ClosedDate;
	public WebElement customerDebtClosedDate() {
		return customerDebt_ClosedDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Frequency ')]//following-sibling::ion-select")
	private WebElement customerDebt_Frequency;
	public WebElement customerDebtFrequency() {
		return customerDebt_Frequency;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Last Payment Amount ')]//following-sibling::ion-input/input")
	private WebElement customerDebt_LastPaymentAmount;
	public WebElement customerDebtLastPaymentAmount() {
		return customerDebt_LastPaymentAmount;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[5]")
	private WebElement customerDebt_LastPaymentDate;
	public WebElement customerDebtLastPaymentDate() {
		return customerDebt_LastPaymentDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Product Name ')]//following-sibling::ion-input/input")
	private WebElement customerDebt_ProductName;
	public WebElement customerDebtProductName() {
		return customerDebt_ProductName;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Product Name ')]//following-sibling::ion-input")
	private WebElement customerDebt_ProductNameDataHolder;
	public WebElement customerDebtProductNameDataHolder() {
		return customerDebt_ProductNameDataHolder;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Last 24 Cycle ')]//following-sibling::ion-input/input")
	private WebElement customerDebt_Last24Cycle;
	public WebElement customerDebtLast24Cycle() {
		return customerDebt_Last24Cycle;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Last 24 Cycle ')]//following-sibling::ion-input")
	private WebElement customerDebt_Last24CycleDataHolder;
	public WebElement customerDebtLast24CycleDataHolder() {
		return customerDebt_Last24CycleDataHolder;
	}
	@FindBy(xpath="//ion-toggle")
	private WebElement customerDebt_BalanceTransferFlag;
	public WebElement customerDebtBalanceTransferFlag() {
		return customerDebt_BalanceTransferFlag;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Facility Status ')]//following-sibling::ion-select")
	private WebElement customerDebt_FacilityStatus;
	public WebElement customerDebtFacilityStatus() {
		return customerDebt_FacilityStatus;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Remaining Tenure (months) ')]//following-sibling::ion-input/input")
	private WebElement customerDebt_RemainingTenureMonths;
	public WebElement customerDebtRemainingTenureMonths() {
		return customerDebt_RemainingTenureMonths;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Remaining Tenure (months) ')]//following-sibling::ion-input")
	private WebElement customerDebt_RemainingTenureMonthsDataHolder;
	public WebElement customerDebtRemainingTenureMonthsDataHolder() {
		return customerDebt_RemainingTenureMonthsDataHolder;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[6]")
	private WebElement customerDebt_DisbursementDate;
	public WebElement customerDebtDisbursementDate() {
		return customerDebt_DisbursementDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' NPA CLASSIFICATION ')]//following-sibling::ion-select")
	private WebElement customerDebt_NPAClassification;
	public WebElement customerDebtNPAClassification() {
		return customerDebt_NPAClassification;
	}
	
	@FindBy(xpath="//ion-label[text()=' Account Number ']//following-sibling::ion-input")
	private WebElement customerDeptDetails_AccountNumberDataHolder;
	public WebElement customerDeptDetailsAccountNumberDataHolder()
	{
		return customerDeptDetails_AccountNumberDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Sanction Date ']//parent::div//following-sibling::p-calendar//input")
	private WebElement customerDeptDetails_SansactiondateDataHolder;
	public WebElement customerDeptDetailsSansactionDateDataHolder()
	{
		return customerDeptDetails_SansactiondateDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Sanction Amount ']//following-sibling::ion-input")
	private WebElement customerDeptDetails_SansactionAmountDataHolder;
	public WebElement customerDeptDetailsSansactionAmountDataHolder()
	{
		return customerDeptDetails_SansactionAmountDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Interest Rate % ']//following-sibling::ion-input")
	private WebElement customerDeptDetails_InterestRatePercentageDataHolder;
	public WebElement customerDeptDetailsInterestRatePercentageDataHolder()
	{
		return customerDeptDetails_InterestRatePercentageDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Current Principal Balance ']//following-sibling::ion-input")
	private WebElement customerDeptDetails_CurrentPrincipalBalanceDataHolder;
	public WebElement customerDeptDetailsCurrentPrincipalBalanceDataHolder()
	{
		return customerDeptDetails_CurrentPrincipalBalanceDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Tenure (months) ']//following-sibling::ion-input")
	private WebElement customerDeptDetails_TenureMonthsDataHolder;
	public WebElement customerDeptDetailsTenureMonthsDataHolder()
	{
		return customerDeptDetails_TenureMonthsDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Maturity Date  ']//parent::div//following-sibling::p-calendar//input")
	private WebElement customerDeptDetails_MaturityDateDataHolder;
	public WebElement customerDeptDetailsMaturityDateDataHolder()
	{
		return customerDeptDetails_MaturityDateDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Installment Amount ']//following-sibling::ion-input")
	private WebElement customerDeptDetails_InstallmentAmountDataHolder;
	public WebElement customerDeptDetailsInstallmentAmountDataHolder()
	{
		return customerDeptDetails_InstallmentAmountDataHolder;
	}	
	@FindBy(xpath="//ion-label[text()=' Amount Considered ']//following-sibling::ion-input")
	private WebElement customerDeptDetails_AmountConsideredDataHolder;
	public WebElement customerDeptDetailsAmountConsideredDataHolder()
	{
		return customerDeptDetails_AmountConsideredDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Next Due date ']//parent::div//following-sibling::p-calendar//input")
	private WebElement customerDeptDetails_NextDueDate;
	public WebElement customerDeptDetailsNextDueDate()
	{
		return customerDeptDetails_NextDueDate;
	}
	@FindBy(xpath="//ion-label[text()=' Closed Date ']//parent::div//following-sibling::p-calendar//input")
	private WebElement customerDeptDetails_ClosedDate;
	public WebElement customerDeptDetailsClosedDate()
	{
		return customerDeptDetails_ClosedDate;
	}
	@FindBy(xpath="//ion-label[text()=' Last Payment Date ']//parent::div//following-sibling::p-calendar//input")
	private WebElement customerDeptDetails_LastPaymentDate;
	public WebElement customerDeptDetailsLastPaymentDate()
	{
		return customerDeptDetails_LastPaymentDate;
	}
	@FindBy(xpath="//ion-label[text()=' Last Payment Amount ']//following-sibling::ion-input")
	private WebElement customerDeptDetails_LastPaymentAmountDataHolder;
	public WebElement customerDeptDetailsLastPaymentAmountDataHolder()
	{
		return customerDeptDetails_LastPaymentAmountDataHolder;
	}
	@FindBy(xpath="(//ion-title[text()=' Financial Commitments ']//ancestor::ion-card/parent::ion-col//tr[1]//button[@ng-reflect-text='Edit'])[1]")
	private WebElement customerDeptDetails_FinancialCommitmentFirstRecord;
	public WebElement customerDeptDetailsFinancialCommitmentFirstRecord()
	{
		return customerDeptDetails_FinancialCommitmentFirstRecord;
	}
	@FindBy(xpath="//ion-label[text()=' Disbursement Date ']//parent::div//following-sibling::p-calendar//input")
	private WebElement customerDeptDetails_DisbursementDateInput;
	public WebElement customerDeptDetailsDisbursementDateinput()
	{
		return customerDeptDetails_DisbursementDateInput;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement customerDeptDetails_SaveButton;
	public WebElement customerDeptDetailsSaveButton()
	{
		return customerDeptDetails_SaveButton;
	}
	
	@FindBy(xpath="//ion-badge[contains(text(),' Positive Integer Allowed')]")
	private WebElement customerDeptDetails_validate;
	public WebElement customerDeptDetails_validate()
	{
		return customerDeptDetails_validate;
	}
	@FindBy(xpath="//ion-badge[contains(text(),'Required field')]")
	private WebElement customerDeptDetails_validate1;
	public WebElement customerDeptDetails_validate1()
	{
		return customerDeptDetails_validate1;
	}
	
	@FindBy(xpath="(//button[@ng-reflect-text='Go Back'])[2]")
	private WebElement customerDeptDetails_Backbtn;
	public WebElement customerDeptDetails_Backbtn()
	{
		return customerDeptDetails_Backbtn;
	}
	
	
	
	
	
}
