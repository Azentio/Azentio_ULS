package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeneficiaryDetailsObj {
	WebDriver driver;
    public BeneficiaryDetailsObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath = "//ion-label[text()=' Facility Application Id ']/following-sibling::ion-select")
	private WebElement facilityApplicationId;
	public WebElement facilityApplicationId() {
		return facilityApplicationId;
	}
	@FindBy(xpath = "//ion-label[text()=' Beneficiary Name ']/following-sibling::ion-input/input")
	private WebElement BeneficiaryName;
	public WebElement BeneficiaryName() {
		return BeneficiaryName;
	}
	@FindBy(xpath = "//ion-label[text()=' Beneficiary Name ']/following-sibling::ion-input")
	private WebElement BeneficiaryNameText;
	public WebElement BeneficiaryNameText() {
		return BeneficiaryNameText;
	}
	@FindBy(xpath = "//ion-label[text()=' Beneficiary Type ']/following-sibling::ion-select")
	private WebElement beneficiaryType;
	public WebElement beneficiaryType() {
		return beneficiaryType;
	}
	@FindBy(xpath = "//ion-label[text()=' Beneficiary KYC ']/following-sibling::ion-input/input")
	private WebElement beneficiaryKYC;
	public WebElement beneficiaryKYC() {
		return beneficiaryKYC;
	}
	@FindBy(xpath = "//ion-label[text()=' Beneficiary KYC ']/following-sibling::ion-input")
	private WebElement beneficiaryKYCText;
	public WebElement beneficiaryKYCText() {
		return beneficiaryKYCText;
	}
	
	@FindBy(xpath = "//ion-label[text()=' Beneficiary Address ']/following-sibling::ion-input/input")
	private WebElement beneficiaryAddress;
	public WebElement beneficiaryAddress() {
		return beneficiaryAddress;
	}

	@FindBy(xpath = "//ion-label[text()=' Beneficiary Address ']/following-sibling::ion-input/input")
	private WebElement beneficiaryAddressText;
	public WebElement beneficiaryAddressText() {
		return beneficiaryAddressText;
	}
	@FindBy(xpath = "//ion-label[text()=' Account Type ']/following-sibling::ion-select")
	private WebElement accountType;
	public WebElement accountType() {
		return accountType;
	}
	@FindBy(xpath = "//ion-label[text()=' IBAN/Account No. ']/following-sibling::ion-input/input")
	private WebElement IBANorAccountNo;
	public WebElement IBANorAccountNo() {
		return IBANorAccountNo;
	}
	@FindBy(xpath = "//ion-label[text()=' IBAN/Account No. ']/following-sibling::ion-input")
	private WebElement IBANorAccountNoText;
	public WebElement IBANorAccountNoText() {
		return IBANorAccountNoText;
	}
	@FindBy(xpath = "//ion-label[text()=' MICR Type ']/following-sibling::ion-select")
	private WebElement MICRType;
	public WebElement MICRType() {
		return MICRType;
	}
	@FindBy(xpath = "//ion-label[text()=' Beneficiary MICR Code ']/following-sibling::ion-select")
	private WebElement beneficiaryMICRCode;
	public WebElement beneficiaryMICRCode() {
		return beneficiaryMICRCode;
	}
	@FindBy(xpath = "//ion-label[text()=' Bank Code ']/following-sibling::ion-select")
	private WebElement bankCode;
	public WebElement bankCode() {
		return bankCode;
	}
	@FindBy(xpath = "//ion-label[text()=' Branch Name ']/following-sibling::ion-select")
	private WebElement branchName;
	public WebElement branchName() {
		return branchName;
	}
	@FindBy(xpath = "//ion-label[text()=' IFSC Code ']/following-sibling::ion-input/input")
	private WebElement IFSCCode;
	public WebElement IFSCCode() {
		return IFSCCode;
	}
	@FindBy(xpath = "//ion-label[text()=' IFSC Code ']/following-sibling::ion-input")
	private WebElement IFSCCodeText;
	public WebElement IFSCCodeText() {
		return IFSCCodeText;
	}
	@FindBy(xpath = "//ion-label[text()=' Payment Type ']/following-sibling::ion-select")
	private WebElement paymentType;
	public WebElement paymentType() {
		return paymentType;
	}
	@FindBy(xpath = "//ion-label[text()=' Payment Mode ']/following-sibling::ion-select")
	private WebElement paymentMode;
	public WebElement paymentMode() {
		return paymentMode;
	}
	@FindBy(xpath = "//ion-label[text()=' Beneficiary Email ']/following-sibling::ion-input/input")
	private WebElement beneficiaryEmail;
	public WebElement beneficiaryEmail() {
		return beneficiaryEmail;
	}
	@FindBy(xpath = "//ion-label[text()=' Beneficiary Email ']/following-sibling::ion-input")
	private WebElement beneficiaryEmailText;
	public WebElement beneficiaryEmailText() {
		return beneficiaryEmailText;
	}
	@FindBy(xpath = "//ion-label[text()=' Remarks ']//following-sibling::ion-textarea//textarea")
	private WebElement remarks;
	public WebElement remarks() {
		return remarks;
	}
	@FindBy(xpath = "//ion-label[text()=' Remarks ']//following-sibling::ion-textarea")
	private WebElement remarksText;
	public WebElement remarksText() {
		return remarksText;
	}
	@FindBy(xpath="//ion-segment-button[@id='seg3']")
	private WebElement BeneficiaryDetailTab1;
	public WebElement BeneficiaryDetailTab() {
		return BeneficiaryDetailTab1;
	}
	@FindBy(xpath="//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement InboxIcon1;
	public WebElement InboxIcon() {
		return InboxIcon1;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Search'])[1]")
	private WebElement SearchButton1;
	public WebElement SearchButton() {
		return SearchButton1;
	}
	@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement SearchBar1;
	public WebElement SearchBar() {
		return SearchBar1;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]/button[1]")//(//td[text()=' DISBMKR '])[1]//preceding-sibling::td[3]/button")
	private WebElement ActionIcon1;
	public WebElement ActionIcon() {
		return ActionIcon1;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement AddButton1;
	public WebElement AddButton() {
		return AddButton1;
	}
	@FindBy(xpath="//div[@aria-label='Success']")
    private WebElement successMgs;
    public WebElement successMgs() {
    	return successMgs;
	
}
    @FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement SaveButton1;
	public WebElement SaveButton() {
		return SaveButton1;
	}

	@FindBy(xpath="//ion-label[text()=' Beneficiary Name ']/following-sibling::ion-input/input")
	private WebElement Beneficiaryname;
	public WebElement Beneficiaryname() {
		return Beneficiaryname;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary KYC ']/following-sibling::ion-input/input")
	private WebElement BeneficiaryKYC;
	public WebElement BeneficiaryKYC() {
		return BeneficiaryKYC;
	}
	@FindBy(xpath="//ion-badge[contains(text(),' Alphanumeric characters allowed')]")
	private WebElement alphaNumericCharactersAllowedWarningPopup;
	public WebElement alphaNumericCharactersAllowedWarningPopup() {
		return alphaNumericCharactersAllowedWarningPopup;
	}
	@FindBy(xpath="//ion-badge[contains(text(), 'Required field')]")
	private WebElement requiredFieldWarningPopup;
	public WebElement requiredFieldWarningPopup() {
		return requiredFieldWarningPopup;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement ContactDetails_SaveIcon;
	public WebElement ContactDetails_SaveIcon() {
		return ContactDetails_SaveIcon;
	}
	@FindBy(xpath = "//ion-segment-button[@id='seg3']") 
    private WebElement BeneficiaryDetailsSection;
    public WebElement BeneficiaryDetailsSection() {
    return BeneficiaryDetailsSection;
    }
    @FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") 
    private WebElement ApplicationDetails_Inbox;
    public WebElement ApplicationDetails_Inbox() {
        return ApplicationDetails_Inbox;
    }
    @FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]") 
    private WebElement ApplicationDetailsInboxView_Search;
    public WebElement ApplicationDetailsInboxView_Search() {
        return ApplicationDetailsInboxView_Search;
    }  
    @FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input") 
    private WebElement ApplicationDetailsInboxView_SearchText;
    public WebElement ApplicationDetailsInboxView_SearchText() {
        return ApplicationDetailsInboxView_SearchText;
    }  
    @FindBy(xpath = "(//td[contains(text(),'DISBMKR')]/parent::tr/td/button[1])[1]") 
    private WebElement ActionButtonOfFirstRecord_DISBMKR;
    public WebElement ActionButtonOfFirstRecord_DISBMKR() {
    return ActionButtonOfFirstRecord_DISBMKR;
    }
    @FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/button[1]/span[1]")
	private WebElement BeneficieryDetails_PencilIconOfFirstRecord;
	public WebElement BeneficieryDetails_PencilIconOfFirstRecord() {
		return BeneficieryDetails_PencilIconOfFirstRecord;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-arrow-left']")
	private WebElement BackIcon;
	public WebElement BackIcon() {
		return BackIcon;
	}
	@FindBy(xpath="//ion-label[text()='Beneficiary Details']//parent::ion-segment-button")
	private WebElement uls_BeneficiaryDetailsSegmantButton;
	public WebElement ulsBeneficiaryDetailsSegmantButton()
	{
		return uls_BeneficiaryDetailsSegmantButton;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement beneficiaryDetails_AddButton;
	public WebElement beneficiaryDetailsAddButton()
	{
		return beneficiaryDetails_AddButton;
	}
	@FindBy(xpath="//tr[1]//td[text()=' DISBMKR ']/preceding-sibling::td[3]//button")
	private WebElement beneficiaryDetails_DisbursementmakerFirstRecord;
	public WebElement beneficiaryDetailsDisbursementmakerFirstRecord()
	{
		return beneficiaryDetails_DisbursementmakerFirstRecord;
	}
	@FindBy(xpath="//ion-label[text()=' Facility Application Id ']//following-sibling::ion-select")
	private WebElement beneficiaryDetails_FacilityApplicationIDDropdown;
	public WebElement beneficiaryDetailsFacilityApplicationIDDropDown()
	{
		return beneficiaryDetails_FacilityApplicationIDDropdown;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary Name ']//following-sibling::ion-input//input")
	private WebElement beneficiaryDetails_BeneficiaryNameInputBox;
	public WebElement beneficiaryDetailsBeneficiaryNameInputBox()
	{
		return beneficiaryDetails_BeneficiaryNameInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary Name ']//following-sibling::ion-input")
	private WebElement beneficiaryDetails_BeneficiaryNameDataHolder;
	public WebElement beneficiaryDetailsBeneficiaryNameDataHolder()
	{
		return beneficiaryDetails_BeneficiaryNameDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary Type ']//following-sibling::ion-select")
	private WebElement beneficiaryDetails_BeneficiaryTypeDropDown;
	public WebElement beneficiaryDetailsBeneficiaryTypeDropDown()
	{
		return beneficiaryDetails_BeneficiaryTypeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary KYC ']//following-sibling::ion-input//input")
	private WebElement beneficiaryDetails_BeneficiaryKYCInputBox;
	public WebElement beneficiaryDetailsBeneficiaryKYCInputBox()
	{
		return beneficiaryDetails_BeneficiaryKYCInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary KYC ']//following-sibling::ion-input")
	private WebElement beneficiaryDetails_BeneficiaryKYCdataHolder;
	public WebElement beneficiaryDetailsBeneficiaryKYCdataHolder()
	{
		return beneficiaryDetails_BeneficiaryKYCdataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary Address ']//following-sibling::ion-input//input")
	private WebElement beneficiaryDetails_BeneficiaryAddressInputBox;
	public WebElement beneficiaryDetailsBeneficiaryAddressInputBox()
	{
		return beneficiaryDetails_BeneficiaryAddressInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary Address ']//following-sibling::ion-input")
	private WebElement beneficiaryDetails_BeneficiaryAddressDataHolder;
	public WebElement beneficiaryDetailsBeneficiaryAddressDataHolder()
	{
		return beneficiaryDetails_BeneficiaryAddressDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Account Type ']//following-sibling::ion-select")
	private WebElement beneficiaryDetails_AccountTypeDropDown;
	public WebElement beneficiaryDetailsAccountTypeDropDown()
	{
		return beneficiaryDetails_AccountTypeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' IBAN/Account No. ']//following-sibling::ion-input//input")
	private WebElement beneficiaryDetails_IBANAccountNoInputBox;
	public WebElement beneficiaryDetailsIBANAccountNoInputBox()
	{
		return beneficiaryDetails_IBANAccountNoInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' IBAN/Account No. ']//following-sibling::ion-input")
	private WebElement beneficiaryDetails_IBANAccountNoDataHolder;
	
	public WebElement beneficiaryDetailsIBANAccountNoDataHolder()
	{
		return beneficiaryDetails_IBANAccountNoDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' MICR Type ']//following-sibling::ion-select")
	private WebElement beneficiaryDetails_MICRTypeDropDown;
	public WebElement beneficiaryDetailsMICRTypeDropDown()
	{
		return beneficiaryDetails_MICRTypeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary MICR Code ']//following-sibling::ion-select")
	private WebElement beneficiaryDetails_BeneficiaryMICRCodeDropDown;
	public WebElement beneficiaryDetailsBeneficiaryMICRCodeDropDown()
	{
		return beneficiaryDetails_BeneficiaryMICRCodeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Bank Code ']//following-sibling::ion-select")
	private WebElement beneficiaryDetails_BankCodeDropDown;
	public WebElement beneficiaryDetailsBankCodeDropDown()
	{
		return beneficiaryDetails_BankCodeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Branch Name ']//following-sibling::ion-select")
	private WebElement beneficiaryDetails_BranchNameDropDown;
	public WebElement beneficiaryDetailsBranchNameDropDown()
	{
		return beneficiaryDetails_BranchNameDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' IFSC Code ']//following-sibling::ion-input//input")
	private WebElement beneficiaryDetails_IFSCCodeInputBox;
	public WebElement beneficiaryDetailsIFSCCodeInputBox()
	{
		return beneficiaryDetails_IFSCCodeInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' IFSC Code ']//following-sibling::ion-input")
	private WebElement beneficiaryDetails_IFSCCodeDataHolder;
	public WebElement beneficiaryDetailsIFSCCodeDataHolder()
	{
		return beneficiaryDetails_IFSCCodeDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Payment Type ']//following-sibling::ion-select")
	private WebElement beneficiaryDetails_PaymentTypeDropDown;
	public WebElement beneficiaryDetailsPaymentTypeDropDown()
	{
		return beneficiaryDetails_PaymentTypeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Payment Mode ']//following-sibling::ion-select")
	private WebElement beneficiaryDetails_PaymentModeDropDown;
	public WebElement beneficiaryDetailsPaymentModeDropDown()
	{
		return beneficiaryDetails_PaymentModeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary Email ']//following-sibling::ion-input//input")
	private WebElement beneficiaryDetails_BeneficiaryEmailInputBox;
	public WebElement beneficiaryDetails_BeneficiaryEmailInputBox()
	{
		return beneficiaryDetails_BeneficiaryEmailInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Beneficiary Email ']//following-sibling::ion-input")
	private WebElement beneficiaryDetails_BeneficiaryEmailDataHolder;
	public WebElement beneficiaryDetailsBeneficiaryEmailDataHolder()
	{
		return beneficiaryDetails_BeneficiaryEmailDataHolder;
	}
	@FindBy(xpath="//textarea")
	private WebElement beneficiaryDetails_Remarks;
	public WebElement beneficiaryDetailsRemarks()
	{
		return beneficiaryDetails_Remarks;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement beneficiaryDetails_SaveButton;
	public WebElement beneficiaryDetailsSaveButton()
	{
		return beneficiaryDetails_SaveButton;
	}
	@FindBy(xpath="//ion-label[text()='Status ']/parent::div/following-sibling::ion-item//ion-toggle")
    private WebElement statusToggle;
    public WebElement statusToggle() {
    	return statusToggle;
    }
	@FindBy(xpath="//ion-toggle")
	private WebElement beneficiaryDetails_StatusButton;
	public WebElement beneficiaryDetailsStatusButton()
	{
		return beneficiaryDetails_StatusButton;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement beneficiaryDetails_ListViewFirstRecord;
	public WebElement beneficiaryDetailsListViewFirstRecord()
	{
		return beneficiaryDetails_ListViewFirstRecord;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-arrow-left']")
	private WebElement beneficiaryDetails_BackButton;
	public WebElement beneficiaryDetailsBackButton()
	{
		return beneficiaryDetails_BackButton;
	}
	
}