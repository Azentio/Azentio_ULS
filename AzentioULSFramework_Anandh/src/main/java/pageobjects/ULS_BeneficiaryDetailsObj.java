package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_BeneficiaryDetailsObj {
	WebDriver driver;
	public ULS_BeneficiaryDetailsObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
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
	@FindBy(xpath="(//td[text()=' DISBMKR ']/preceding-sibling::td[3]//button)[1]")
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
	
}
