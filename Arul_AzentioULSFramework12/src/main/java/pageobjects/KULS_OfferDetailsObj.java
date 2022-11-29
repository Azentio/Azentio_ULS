package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KULS_OfferDetailsObj {
	WebDriver driver;

	public KULS_OfferDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement offerDetails_Maker_MenuToggle;

	public WebElement offerDetails_Maker_MenuToggle() {
		return offerDetails_Maker_MenuToggle;
	}

	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement offerDetails_Inbox;

	public WebElement offerDetails_Inbox() {
		return offerDetails_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement offerDetails_SearchInbox;

	public WebElement offerDetails_SearchInbox() {
		return offerDetails_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement offerDetails_SearchInboxInputField;

	public WebElement offerDetails_SearchInboxInputField() {
		return offerDetails_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement offerDetails_SearchInboxCloseButton;

	public WebElement offerDetails_SearchInboxCloseButton() {
		return offerDetails_SearchInboxCloseButton;
	}

	// search button
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement offerDetails_SearchButton;

	public WebElement offerDetails_SearchButton() {
		return offerDetails_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div[3]/span/input")
	private WebElement offerDetails_SearchInputField;

	public WebElement offerDetails_SearchInputField() {
		return offerDetails_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span[1]/i")
	private WebElement offerDetails_SearchCloseButton;

	public WebElement offerDetails_SearchCloseButton() {
		return offerDetails_SearchCloseButton;
	}

	// facility info
	@FindBy(xpath = "//ion-title[contains(text(),' Facility Info ')]")
	private WebElement offerDetails_FacilityInfoTitle;

	public WebElement offerDetails_FacilityInfoTitle() {
		return offerDetails_FacilityInfoTitle;
	}

	// Offer details first record edit button
	@FindBy(xpath = "//ion-title[contains(text(),' Facility Info ')]/../../ion-card-content/descendant::tbody/tr/td[1]/span/button[1]")
	private WebElement offerDetails_OfferDetailFirstRecordEdit;

	public WebElement offerDetails_OfferDetailFirstRecordEdit() {
		return offerDetails_OfferDetailFirstRecordEdit;
	}

	// Eligibility Details
	@FindBy(xpath = "//ion-title[contains(text(),'Eligibility Details')]")
	private WebElement offerDetails_EligibilityDetails;

	public WebElement offerDetails_EligibilityDetails() {
		return offerDetails_EligibilityDetails;
	}

	// Eligibility Type
	@FindBy(xpath = "//span[contains(text(),'Eligibility Type')]")
	private WebElement offerDetails_EligibilityType;

	public WebElement offerDetails_EligibilityType() {
		return offerDetails_EligibilityType;
	}

	// Eligibility Amount
	@FindBy(xpath = "//span[contains(text(),'Eligibility Amount')]")
	private WebElement offerDetails_EligibilityAmount;

	public WebElement offerDetails_EligibilityAmount() {
		return offerDetails_EligibilityAmount;
	}

	// Eligibility Percentage
	@FindBy(xpath = "//span[contains(text(),'Eligibility %')]")
	private WebElement offerDetails_EligibilityPercentage;

	public WebElement offerDetails_EligibilityPercentage() {
		return offerDetails_EligibilityPercentage;
	}

	// Currency
	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement offerDetails_Currency;

	public WebElement offerDetails_Currency() {
		return offerDetails_Currency;
	}

	// Actual Percentage
	@FindBy(xpath = "//span[text()=' Actual Percentage ']")
	private WebElement offerDetails_ActualPercentage;

	public WebElement offerDetails_ActualPercentage() {
		return offerDetails_ActualPercentage;
	}

	// Deviation Level
	@FindBy(xpath = "//span[contains(text(),'Deviation Level')]")
	private WebElement offerDetails_DeviationLevel;

	public WebElement offerDetails_DeviationLevel() {
		return offerDetails_DeviationLevel;
	}

	// Interest Rate Structure
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]")
	private WebElement offerDetails_InterestRateStructure;

	public WebElement offerDetails_InterestRateStructure() {
		return offerDetails_InterestRateStructure;
	}

	// ID
	@FindBy(xpath = "//ion-col[4]/kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[1]/span[1]")
	private WebElement offerDetails_InterestRateStructure_Id;

	public WebElement offerDetails_InterestRateStructure_Id() {
		return offerDetails_InterestRateStructure_Id;
	}

	// Period
	@FindBy(xpath = "//span[text()=' Period ']")
	private WebElement offerDetails_InterestRateStructure_Period;

	public WebElement offerDetails_InterestRateStructure_Period() {
		return offerDetails_InterestRateStructure_Period;
	}

	// Rate Definition
	@FindBy(xpath = "//span[text()=' Rate Definition ']")
	private WebElement offerDetails_InterestRateStructure_RateDefinition;

	public WebElement offerDetails_InterestRateStructure_RateDefinition() {
		return offerDetails_InterestRateStructure_RateDefinition;
	}

	// Interest Rate
	@FindBy(xpath = "//span[text()=' Interest Rate ']")
	private WebElement offerDetails_InterestRateStructure_InterestRate;

	public WebElement offerDetails_InterestRateStructure_InterestRate() {
		return offerDetails_InterestRateStructure_InterestRate;
	}

	// Index Rate
	@FindBy(xpath = "//span[text()=' Index Rate ']")
	private WebElement offerDetails_InterestRateStructure_IndexRate;

	public WebElement offerDetails_InterestRateStructure_IndexRate() {
		return offerDetails_InterestRateStructure_IndexRate;
	}

	// Base Rate
	@FindBy(xpath = "//span[text()=' Base Rate ']")
	private WebElement offerDetails_InterestRateStructure_BaseRate;

	public WebElement offerDetails_InterestRateStructure_BaseRate() {
		return offerDetails_InterestRateStructure_BaseRate;
	}

	// Spread Rate
	@FindBy(xpath = "//span[text()=' Spread Rate ']")
	private WebElement offerDetails_InterestRateStructure_SpreadRate;

	public WebElement offerDetails_InterestRateStructure_SpreadRate() {
		return offerDetails_InterestRateStructure_SpreadRate;
	}

	// Cap Rate
	@FindBy(xpath = "//span[text()=' Cap Rate ']")
	private WebElement offerDetails_InterestRateStructure_CapRate;

	public WebElement offerDetails_InterestRateStructure_CapRate() {
		return offerDetails_InterestRateStructure_CapRate;
	}

	// Floor Rate
	@FindBy(xpath = "//span[text()=' Floor Rate ']")
	private WebElement offerDetails_InterestRateStructure_FloorRate;

	public WebElement offerDetails_InterestRateStructure_FloorRate() {
		return offerDetails_InterestRateStructure_FloorRate;
	}

	// RBP Adjuster
	@FindBy(xpath = "//span[text()=' RBP Adjuster ']")
	private WebElement offerDetails_InterestRateStructure_RBPAdjuster;

	public WebElement offerDetails_InterestRateStructure_RBPAdjuster() {
		return offerDetails_InterestRateStructure_RBPAdjuster;
	}

	// Penalty Rate
	@FindBy(xpath = "//span[text()=' Penalty Rate ']")
	private WebElement offerDetails_InterestRateStructure_PenaltyRate;

	public WebElement offerDetails_InterestRateStructure_PenaltyRate() {
		return offerDetails_InterestRateStructure_PenaltyRate;
	}

	// Penalty Fee
	@FindBy(xpath = "//span[text()=' Penalty Fee ']")
	private WebElement offerDetails_InterestRateStructure_PenaltyFee;

	public WebElement offerDetails_InterestRateStructure_PenaltyFee() {
		return offerDetails_InterestRateStructure_PenaltyFee;
	}

	// Installments
	@FindBy(xpath = "//ion-title[text()=' Installments ']")
	private WebElement offerDetails_Installments;

	public WebElement offerDetails_Installments() {
		return offerDetails_Installments;
	}

	// Installment Period
	@FindBy(xpath = "//span[text()=' Instalment Period ']")
	private WebElement offerDetails_InstallmentPeriod;

	public WebElement offerDetails_InstallmentPeriod() {
		return offerDetails_InstallmentPeriod;
	}

	// Installment Amount
	@FindBy(xpath = "//span[text()=' Installment Amount ']")
	private WebElement offerDetails_InstallmentAmount;

	public WebElement offerDetails_InstallmentAmount() {
		return offerDetails_InstallmentAmount;
	}

	// Accept Offer button
	@FindBy(xpath = "//button[@ng-reflect-text='Accept Offer']")
	private WebElement offerDetails_AcceptOfferButton;

	public WebElement offerDetails_AcceptOfferButton() {
		return offerDetails_AcceptOfferButton;
	}

	// Eligibility type value
//	@FindBy(xpath = "//ion-title[contains(text(),'Eligibility Details')]/ancestor::ion-card-content/descendant::ion-col[31]/descendant::td[2]")
	@FindBy(xpath = "//ion-title[contains(text(),'Eligibility Details')]/ancestor::offering-conv/ion-col[3]/descendant::td[2]")
	private WebElement offerDetails_EligibilityTypeValue;

	public WebElement offerDetails_EligibilityTypeValue() {
		return offerDetails_EligibilityTypeValue;
	}

	// Eligibility Amount value
	@FindBy(xpath = "//ion-title[contains(text(),'Eligibility Details')]/ancestor::offering-conv/ion-col[3]/descendant::td[3]")
	private WebElement offerDetails_EligibilityAmountValue;

	public WebElement offerDetails_EligibilityAmountValue() {
		return offerDetails_EligibilityAmountValue;
	}

	// Eligibility % value
	@FindBy(xpath = "//ion-title[contains(text(),'Eligibility Details')]/ancestor::offering-conv/ion-col[3]/descendant::td[4]")
	private WebElement offerDetails_EligibilityPercentageValue;

	public WebElement offerDetails_EligibilityPercentageValue() {
		return offerDetails_EligibilityPercentageValue;
	}

	// Eligibility Currency value
	@FindBy(xpath = "//ion-title[contains(text(),'Eligibility Details')]/ancestor::offering-conv/ion-col[3]/descendant::td[5]")
	private WebElement offerDetails_CurrencyValue;

	public WebElement offerDetails_CurrencyValue() {
		return offerDetails_CurrencyValue;
	}

	// Actual Percentage value
	@FindBy(xpath = "//ion-title[contains(text(),'Eligibility Details')]/ancestor::offering-conv/ion-col[3]/descendant::td[6]")
	private WebElement offerDetails_ActualPercentageValue;

	public WebElement offerDetails_ActualPercentageValue() {
		return offerDetails_ActualPercentageValue;
	}

	// Deviation Level value
	@FindBy(xpath = "//ion-title[contains(text(),'Eligibility Details')]/ancestor::offering-conv/ion-col[3]/descendant::td[7]")
	private WebElement offerDetails_DeviationLevelValue;

	public WebElement offerDetails_DeviationLevelValue() {
		return offerDetails_DeviationLevelValue;
	}

	// Interest Rate Structure Id Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[1]")
	private WebElement offerDetails_InterestRateStructure_IdValue;

	public WebElement offerDetails_InterestRateStructure_IdValue() {
		return offerDetails_InterestRateStructure_IdValue;
	}

	// Interest Rate Structure Period Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[2]")
	private WebElement offerDetails_InterestRateStructure_PeriodValue;

	public WebElement offerDetails_InterestRateStructure_PeriodValue() {
		return offerDetails_InterestRateStructure_PeriodValue;
	}

	// Interest Rate Structure Rate Definition Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[3]")
	private WebElement offerDetails_InterestRateStructure_RateDefinitionValue;

	public WebElement offerDetails_InterestRateStructure_RateDefinitionValue() {
		return offerDetails_InterestRateStructure_RateDefinitionValue;
	}

	// Interest Rate Structure Interest Rate Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[4]")
	private WebElement offerDetails_InterestRateStructure_InterestRateValue;

	public WebElement offerDetails_InterestRateStructure_InterestRateValue() {
		return offerDetails_InterestRateStructure_InterestRateValue;
	}

	// Interest Rate Structure Index Rate Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[5]")
	private WebElement offerDetails_InterestRateStructure_IndexRateValue;

	public WebElement offerDetails_InterestRateStructure_IndexRateValue() {
		return offerDetails_InterestRateStructure_IndexRateValue;
	}

	// Interest Rate Structure Base Rate Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[6]")
	private WebElement offerDetails_InterestRateStructure_BaseRateValue;

	public WebElement offerDetails_InterestRateStructure_BaseRateValue() {
		return offerDetails_InterestRateStructure_BaseRateValue;
	}

	// Interest Rate Structure Spread Rate Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[7]")
	private WebElement offerDetails_InterestRateStructure_SpreadRateValue;

	public WebElement offerDetails_InterestRateStructure_SpreadRateValue() {
		return offerDetails_InterestRateStructure_SpreadRateValue;
	}

	// Interest Rate Structure Cap Rate Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[8]")
	private WebElement offerDetails_InterestRateStructure_CapRateValue;

	public WebElement offerDetails_InterestRateStructure_CapRateValue() {
		return offerDetails_InterestRateStructure_CapRateValue;
	}

	// Interest Rate Structure Floor Rate Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[9]")
	private WebElement offerDetails_InterestRateStructure_FloorRateValue;

	public WebElement offerDetails_InterestRateStructure_FloorRateValue() {
		return offerDetails_InterestRateStructure_FloorRateValue;
	}

	// Interest Rate Structure RBP Adjuster Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[10]")
	private WebElement offerDetails_InterestRateStructure_RBPAdjusterValue;

	public WebElement offerDetails_InterestRateStructure_RBPAdjusterValue() {
		return offerDetails_InterestRateStructure_RBPAdjusterValue;
	}

	// Interest Rate Structure Penalty Rate Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[11]")
	private WebElement offerDetails_InterestRateStructure_PenaltyRateValue;

	public WebElement offerDetails_InterestRateStructure_PenaltyRateValue() {
		return offerDetails_InterestRateStructure_PenaltyRateValue;
	}

	// Interest Rate Structure Penalty Fee Value
	@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]/ancestor::offering-conv/ion-col[4]/descendant::td[12]")
	private WebElement offerDetails_InterestRateStructure_PenaltyFeeValue;

	public WebElement offerDetails_InterestRateStructure_PenaltyFeeValue() {
		return offerDetails_InterestRateStructure_PenaltyFeeValue;
	}

	// Intallments period Value
	@FindBy(xpath = "//ion-title[contains(text(),'Installments')]/ancestor::offering-conv/ion-col[5]/descendant::td[2]")
	private WebElement offerDetails_InstallmentPeriodValue;

	public WebElement offerDetails_InstallmentPeriodValue() {
		return offerDetails_InstallmentPeriodValue;
	}

	// Intallments amount Value
	@FindBy(xpath = "//ion-title[contains(text(),'Installments')]/ancestor::offering-conv/ion-col[5]/descendant::td[3]")
	private WebElement offerDetails_InstallmentAmountValue;

	public WebElement offerDetails_InstallmentAmountValue() {
		return offerDetails_InstallmentAmountValue;
	}

	// Appeal Request title
	@FindBy(xpath = "//ion-label[contains(text(),'Appeal Request')]")
	private WebElement offerDetails_AppealRequest;

	public WebElement offerDetails_AppealRequest() {
		return offerDetails_AppealRequest;
	}

	// Origional Requested Amount
	@FindBy(xpath = "//ion-label[contains(text(),' Original Requested Amount ')]/../ion-input/input")
	private WebElement offerDetails_OrigionalRequestedAmount;

	public WebElement offerDetails_OrigionalRequestedAmount() {
		return offerDetails_OrigionalRequestedAmount;
	}

	// Origional Requested Tenure
	@FindBy(xpath = "//ion-label[contains(text(),' Original Requested Tenure ')]/../ion-input/input")
	private WebElement offerDetails_OrigionalRequestedTenure;

	public WebElement offerDetails_OrigionalRequestedTenure() {
		return offerDetails_OrigionalRequestedTenure;
	}

	// New Requested Amount
	@FindBy(xpath = "//ion-label[contains(text(),' New Requested Amount ')]/../ion-input/input")
	private WebElement offerDetails_NewRequestedAmount;

	public WebElement offerDetails_NewRequestedAmount() {
		return offerDetails_NewRequestedAmount;
	}

	// New Requested Tenure
	@FindBy(xpath = "//ion-label[contains(text(),' New Requested Tenure ')]/../ion-input/input")
	private WebElement offerDetails_NewRequestedTenure;

	public WebElement offerDetails_NewRequestedTenure() {
		return offerDetails_NewRequestedTenure;
	}

	// Save button
	@FindBy(xpath = "//button[@ptooltip='Save']")
	private WebElement offerDetails_SaveButton;

	public WebElement offerDetails_SaveButton() {
		return offerDetails_SaveButton;
	}

	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement offerDetails_SaveConfirmationMessage;

	public WebElement offerDetails_SaveConfirmationMessage() {
		return offerDetails_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement offerDetails_SaveConfirmationMessageCloseButton;

	public WebElement offerDetails_SaveConfirmationMessageCloseButton() {
		return offerDetails_SaveConfirmationMessageCloseButton;
	}

	// Appeal button
	@FindBy(xpath = "//button[@ptooltip='Appeal']")
	private WebElement offerDetails_AppealButton;

	public WebElement offerDetails_AppealButton() {
		return offerDetails_AppealButton;
	}

}