package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_DrawdownDetailsObj {
	WebDriver driver;

	public ULS_DrawdownDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[text()='Drawdown details']//parent::ion-segment-button")
	private WebElement uls_DrawdownDetailsSegmentButton;

	public WebElement ulsDrawDownDetialsSegmentButton() {
		return uls_DrawdownDetailsSegmentButton;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement uls_DrawdownDetailsFirstRecord;

	public WebElement ulsDrawdownDetailsFirstRecord() {
		return uls_DrawdownDetailsFirstRecord;
	}

	@FindBy(xpath = "//ion-title[text()=' Facility Details ']")
	private WebElement drawdownDetails_FacilityDetailsSection;

	public WebElement drawdownDetialsFacilityDetailsSection() {
		return drawdownDetails_FacilityDetailsSection;
	}

	@FindBy(xpath = "//ion-title[text()=' Schedule Details ']")
	private WebElement drawdownDetails_ScheduleDetailsSection;

	public WebElement drawdownDetailsScheduleDetailsSection() {
		return drawdownDetails_ScheduleDetailsSection;
	}

	@FindBy(xpath = "//ion-title[text()=' Payment Details ']")
	private WebElement drawdownDetails_PaymentDetailsSection;

	public WebElement drawdownDetailsPaymentDetailsSection() {
		return drawdownDetails_PaymentDetailsSection;
	}

	@FindBy(xpath = "//ion-title[text()=' Drawdown BreakUp ']")
	private WebElement drawdownDetails_DrawdownBreakupSection;

	public WebElement drawdownDetailsDrawdownBreakupSection() {
		return drawdownDetails_DrawdownBreakupSection;
	}

	@FindBy(xpath = "//ion-label[text()=' Product ']//following-sibling::ion-input")
	private WebElement drawDownDetails_FacilityDetailsProduct;

	public WebElement drawDownDetailsFacilityDetailsProduct() {
		return drawDownDetails_FacilityDetailsProduct;
	}

	@FindBy(xpath = "//ion-label[text()=' Sub-Product ']//following-sibling::ion-input")
	private WebElement drawDownDetails_FacilityDetailsSubProduct;

	public WebElement drawDownDetailsFacilityDetailsSubProduct() {
		return drawDownDetails_FacilityDetailsSubProduct;
	}

	@FindBy(xpath = "//ion-label[text()=' Scheme ']//following-sibling::ion-input")
	private WebElement drawDownDetails_FacilityDetailsScheme;

	public WebElement drawDownDetailsFacilityDetailsScheme() {
		return drawDownDetails_FacilityDetailsScheme;
	}

	@FindBy(xpath = "//ion-label[text()=' Sanction Date ']//following-sibling::ion-input")
	private WebElement drawDownDetails_FacilityDetailsSanctionDate;

	public WebElement drawDownDetailsFacilityDetailsSanctionDate() {
		return drawDownDetails_FacilityDetailsSanctionDate;
	}

	@FindBy(xpath = "//ion-label[text()=' Last Disbursement Date ']//following-sibling::ion-input")
	private WebElement drawDownDetails_FacilityDetailsLastDisbursementDate;

	public WebElement drawDownDetailsFacilityDetailsLastDisbursementDate() {
		return drawDownDetails_FacilityDetailsLastDisbursementDate;
	}

	@FindBy(xpath = "//ion-label[text()=' Is Tranche Allowed? ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsIsTrancheAllowed;

	public WebElement drawdownDetailsFacilityDetailsIsTrancheAllowed() {
		return drawdownDetails_FacilityDetailsIsTrancheAllowed;
	}

	@FindBy(xpath = "//ion-label[text()=' Loan No ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsLoanNo;

	public WebElement drawdownDetailsFacilityDetailsLoanNo() {
		return drawdownDetails_FacilityDetailsLoanNo;
	}

	@FindBy(xpath = "//ion-label[text()=' Sanction Amount ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsSanctionAmount;

	public WebElement drawdownDetailsFacilityDetailsSanctionAmount() {
		return drawdownDetails_FacilityDetailsSanctionAmount;
	}

	@FindBy(xpath = "//ion-label[text()=' Limit Amount ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsLimitAmount;

	public WebElement drawdownDetailsFacilityDetailsLimitAmount() {
		return drawdownDetails_FacilityDetailsLimitAmount;
	}

	@FindBy(xpath = "//ion-label[text()=' Disbursed Amount ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsDisbursedAmount;

	public WebElement drawdownDetailsFacilityDetailsDisbursedAmount() {
		return drawdownDetails_FacilityDetailsDisbursedAmount;
	}

	@FindBy(xpath = "//ion-label[text()=' Current Disbursement ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsCurrentDisbursement;

	public WebElement drawdownDetailsFacilityDetailsCurrentDisbursement() {
		return drawdownDetails_FacilityDetailsCurrentDisbursement;
	}

	@FindBy(xpath = "//ion-label[text()=' Available Amount ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsAvailableAmount;

	public WebElement drawdownDetailsFacilityDetailsAvailableAmount() {
		return drawdownDetails_FacilityDetailsAvailableAmount;
	}

	@FindBy(xpath = "//span[text()=' Payment For ']//ancestor::thead//parent::table//tbody//tr//td[1]")
	private WebElement drawdownDetails_ScheduleDetailsPaymentFor;

	public WebElement drawdownDetailsScheduleDetailsPaymentFor() {
		return drawdownDetails_ScheduleDetailsPaymentFor;
	}

	@FindBy(xpath = "//span[text()=' Schedule Amount ']//ancestor::thead//parent::table//tbody//tr//td[2]")
	private WebElement drawdownDetails_ScheduleDetailsScheduleAmount;

	public WebElement drawdownDetailsScheduleDetailsScheduleAmount() {
		return drawdownDetails_ScheduleDetailsScheduleAmount;
	}

	@FindBy(xpath = "//span[text()=' Planned Date ']//ancestor::thead//parent::table//tbody//tr//td[3]")
	private WebElement drawdownDetails_ScheduleDetailsPlannedDate;

	public WebElement drawdownDetailsScheduleDetailsPlannedDate() {
		return drawdownDetails_ScheduleDetailsPlannedDate;
	}

	@FindBy(xpath = "//ion-title[text()=' Schedule Details ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[4]")
	private WebElement drawdownDetails_ScheduleDetailsCurrency;

	public WebElement drawdownDetailsScheduleDetailsCurrency() {
		return drawdownDetails_ScheduleDetailsCurrency;
	}

	@FindBy(xpath = "//ion-title[text()=' Schedule Details ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[5]")
	private WebElement drawdownDetails_ScheduleDetailsScheduleNotes;

	public WebElement drawdownDetailsScheduleDetailsScheduleNotes() {
		return drawdownDetails_ScheduleDetailsScheduleNotes;
	}

	@FindBy(xpath = "//ion-title[text()=' Payment Details ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[1]")
	private WebElement drawdownDetails_PaymentDetailsDisbursementAmount;

	public WebElement drawDownDetailsPaymentDetailsDisbursementAmount() {
		return drawdownDetails_PaymentDetailsDisbursementAmount;
	}

	@FindBy(xpath = "//ion-title[text()=' Payment Details ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[2]")
	private WebElement drawdownDetails_PaymentDetailsCurrency;

	public WebElement drawdownDetailsPaymentDetailsCurrency() {
		return drawdownDetails_PaymentDetailsCurrency;
	}

	@FindBy(xpath = "//ion-title[text()=' Payment Details ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[3]")
	private WebElement drawdownDetails_PaymentDetailsLoanAccountNo;

	public WebElement drawdownDetailsPaymentDetailsLoanAccountNo() {
		return drawdownDetails_PaymentDetailsLoanAccountNo;
	}

	@FindBy(xpath = "//ion-title[text()=' Payment Details ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[4]")
	private WebElement drawdownDetails_PaymentDetailsDisbStatus;

	public WebElement drawdownDetailsPaymentDetailsDisbStatus() {
		return drawdownDetails_PaymentDetailsDisbStatus;
	}

	@FindBy(xpath = "//ion-title[text()=' Drawdown BreakUp ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[2]")
	private WebElement drawdownDetails_DrawdownBreakupDrawdownID;

	public WebElement drawdownDetailsDrawdownBreakupDrawdownID() {
		return drawdownDetails_DrawdownBreakupDrawdownID;
	}

	@FindBy(xpath = "//ion-title[text()=' Drawdown BreakUp ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[3]")
	private WebElement drawdownDetails_DrawdownBreakupBeneficiaryID;

	public WebElement drawdownDetailsDrawdownBreakupBeneficiaryID() {
		return drawdownDetails_DrawdownBreakupBeneficiaryID;
	}

	@FindBy(xpath = "//ion-title[text()=' Drawdown BreakUp ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[4]")
	private WebElement drawdownDetails_DrawdownBreakupBeneficiaryName;

	public WebElement drawdownDetailsDrawdownBreakupBeneficiaryName() {
		return drawdownDetails_DrawdownBreakupBeneficiaryName;
	}

	@FindBy(xpath = "//ion-title[text()=' Drawdown BreakUp ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[5]")
	private WebElement drawdownDetails_DrawdownBreakupDrawdownAmount;

	public WebElement drawdownDetailsDrawdownBreakupDrawdownAmount() {
		return drawdownDetails_DrawdownBreakupDrawdownAmount;
	}

	@FindBy(xpath = "//ion-title[text()=' Drawdown BreakUp ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[6]")
	private WebElement drawdownDetails_DrawdownBreakupCurrency;

	public WebElement drawdownDetailsDrawdownBreakupCurrency() {
		return drawdownDetails_DrawdownBreakupCurrency;
	}

	@FindBy(xpath = "//ion-title[text()=' Drawdown BreakUp ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[7]")
	private WebElement drawdownDetails_DrawdownBreakupPaymentStatus;

	public WebElement drawdownDetailsDrawdownBreakupPaymentStatus() {
		return drawdownDetails_DrawdownBreakupPaymentStatus;
	}

	@FindBy(xpath = "//ion-title[text()=' Drawdown BreakUp ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[8]")
	private WebElement drawdownDetails_DrawdownBreakupStatus;

	public WebElement drawdownDetailsDrawdownBreakupStatus() {
		return drawdownDetails_DrawdownBreakupStatus;
	}

	@FindBy(xpath = "//ion-title[text()=' Drawdown BreakUp ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[2]//td[1]//p-tableradiobutton")
	private WebElement drawdownDetails_DrawdownBreakupEditIcon;

	public WebElement drawdownDetailsDrawdownBreakupEditIcon() {
		return drawdownDetails_DrawdownBreakupEditIcon;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Payment Type *']")
	private WebElement drawdownBreakUpDetails_PaymentTypeDropdown;
	public WebElement drawdownBreaupDetailsPaymentTypeDropdown()
	{
		return drawdownBreakUpDetails_PaymentTypeDropdown;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  End Beneficiary Name *']")
	private WebElement drawdownBreakUpDetails_EndBeneficiaryNameDropDown;
	public WebElement drawdownBreakUpDetailsEndBeneficiaryNameDropDown()
	{
		return drawdownBreakUpDetails_EndBeneficiaryNameDropDown;
	}
	@FindBy(xpath="//ion-item[2]//ion-radio[1]")
	private WebElement drawDownDetails_DropDownFirstOption;
	public WebElement drawDownDetailsDropDownFirstOption()
	{
		return drawDownDetails_DropDownFirstOption;
	}
	@FindBy(xpath="//ion-label[text()=' Original Amount ']//following-sibling::ion-input//input")
	private WebElement drawdownBreakUpDetails_OriginalAmountTextBox;
	public WebElement drawdownBreakUpDetailsOriginalAmountTextBox()
	{
		return drawdownBreakUpDetails_OriginalAmountTextBox;
	}
	@FindBy(xpath="//ion-label[text()=' Amount to be Paid ']//following-sibling::ion-input//input")
	private WebElement drawdownBreakUpDetails_AmountToBePaidTextBox;
	public WebElement drawdownBreakUpDetailsAmountToBePaidTextBox()
	{
		return drawdownBreakUpDetails_AmountToBePaidTextBox;
	}	
	@FindBy(xpath="//ion-select[@aria-label='Select,  Paying Currency *']")
	private WebElement drawdownBreakUpDetails_PayingCurrencyDropDown;
	public WebElement drawdownBreakUpDetailsPayingCurrencyDropDown()
	{
		return drawdownBreakUpDetails_PayingCurrencyDropDown;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Payment Mode *']")
	private WebElement drawdownBreakUpDetails_PaymentModeDropDown;
	public WebElement drawdownBreakUpDetailsPaymentModeDropDown()
	{
		return drawdownBreakUpDetails_PaymentModeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Proposed Payment Date ']//parent::div//following-sibling::p-calendar//button")
	private WebElement drawdownDetails_ProposedPaymentDatecalendar;
	public WebElement drawdownDetailsProposedDateCalendar()
	{
		return drawdownDetails_ProposedPaymentDatecalendar;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Disbursement A/C No *']")
	private WebElement drawdownDetails_DisbursedAccountNo;
	public WebElement drawdownDetailsDisbursedAccountNo()
	{
		return drawdownDetails_DisbursedAccountNo;
	}
	@FindBy(xpath="//button[text()='Save ']")
	private WebElement drawDownDetails_DrawdownDetailsBreakUpSaveButton;
	public WebElement drawDownDetailsDrawdownDetailsBreakUpSaveButton()
	{
		return drawDownDetails_DrawdownDetailsBreakUpSaveButton;
	}
	@FindBy(xpath="//ion-icon[@name='add']")
	private WebElement drawDownDetails_DrawdownDetailsBreakUpAddButton;
	public WebElement drawDownDetailsDrawdownDetailsBreakUpAddButton()
	{
		return drawDownDetails_DrawdownDetailsBreakUpAddButton;
	}
	@FindBy(xpath="//ion-title[text()=' Drawdown Breakup Detail ']//button[@icon='pi pi-arrow-left']")
	private WebElement drawDownDetails_DrawdownDetailsBreakUpBackButton;
	public WebElement drawDownDetailsDrawdownDetailsBreakUpBackButton()
	{
		return drawDownDetails_DrawdownDetailsBreakUpBackButton;
	}
	@FindBy(xpath="//ion-title[text()=' DrawDown Breakup List ']")
	private WebElement drawDownDetails_DrawdownDetailsBreakUpBackButtonVerification;
	public WebElement drawDownDetailsDrawdownDetailsBreakUpBackButtonVerification()
	{
		return drawDownDetails_DrawdownDetailsBreakUpBackButtonVerification;
	}

}
