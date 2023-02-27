package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeneficiaryDetails_Obj {
    WebDriver driver;
    public BeneficiaryDetails_Obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//ListView PageObjects
	
	
	@FindBy(xpath = "//ion-segment//ion-label[text()='Beneficiary Details']/parent::ion-segment-button")
	private WebElement Beneficiary_Tab;
	public WebElement Beneficiary_Tab() {
		return Beneficiary_Tab;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement Beneficiary_Add;
	public WebElement Beneficiary_Add() {
		return Beneficiary_Add;
	}	
	
	
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement Beneficiary_Search;
	public WebElement Beneficiary_Search() {
		return Beneficiary_Search;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Beneficiary Type')]")
	private WebElement Beneficiary_Type;
	public WebElement Beneficiary_Type() {
		return Beneficiary_Type;
	}
	
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]//table[1]/tbody[1]/tr[1]/td[3]")
	private WebElement Beneficiary_Type_Listview;
	public WebElement Beneficiary_Type_Listview() {
		return Beneficiary_Type_Listview;
	}
	@FindBy(xpath = "//span[contains(text(),'Beneficiary Name')]")
	private WebElement Beneficiary_Name;
	public WebElement Beneficiary_Name() {
		return Beneficiary_Name;
	}
	
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]//table[1]/tbody[1]/tr[1]/td[4]")
	private WebElement Beneficiary_Name_ListView;
	public WebElement Beneficiary_Name_ListView() {
		return Beneficiary_Name_ListView;
	}
	@FindBy(xpath = "//span[contains(text(),'Bank Account Type')]")
	private WebElement Bank_Account_Type;
	public WebElement Bank_Account_Type() {
		return Bank_Account_Type;
	}
	
	@FindBy(xpath = "//span[contains(text(),'IBAN/Account No.')]")
	private WebElement IBAN_Account_No;
	public WebElement IBAN_Account_No() {
		return IBAN_Account_No;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Beneficiary Bank Name')]")
	private WebElement Beneficiary_Bank_Name;
	public WebElement Beneficiary_Bank_Name() {
		return Beneficiary_Bank_Name;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Branch Code')]")
	private WebElement Branch_Code;
	public WebElement Branch_Code() {
		return Branch_Code;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Bank Name')]")
	private WebElement Bank_Name;
	public WebElement Bank_Name() {
		return Bank_Name;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Beneficiary Bank')]")
	private WebElement Beneficiary_Bank;
	public WebElement Beneficiary_Bank() {
		return Beneficiary_Bank;
	}
	
	@FindBy(xpath="//ion-grid[1]/ion-row[1]/ion-col[1]//div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement Search_Input;
	public WebElement Search_Input()
	{ 
		return Search_Input;
	}
	@FindBy(xpath = "//input[@mode='ios']") 
    private WebElement Beneficiary_SearchText;
    public WebElement Beneficiary_SearchText() {
        return Beneficiary_SearchText;
    } 
    @FindBy(xpath = "//input[@mode='ios']/following-sibling::i") 
    private WebElement Beneficiary_SearchText_Close;
    public WebElement Beneficiary_SearchText_Close() {
        return Beneficiary_SearchText_Close;
    } 
	@FindBy(xpath="//tr[1]//td[text()=' DISBMKR ']/parent::tr//td[1]//button[1]")
	private WebElement Inbox_Edit;
	public WebElement Inbox_Edit()
	{ 
		return Inbox_Edit;
	}

	@FindBy(xpath = "//span[text()='Export']/following-sibling::div/span")
	private WebElement exportIcon;

	public WebElement exportIcon() {
		return exportIcon;
	}

	@FindBy(xpath = "//p-dropdownitem[@ng-reflect-label='PDF']//child::span")
	private WebElement pdfOption;

	public WebElement pdfOption() {
		return pdfOption;
	}

	@FindBy(xpath = "//p-dropdownitem[@ng-reflect-label='XLS']//child::span")
	private WebElement xlsOption;

	public WebElement xlsOption() {
		return xlsOption;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Search']")
	private WebElement InboxSearchButton;
	public  WebElement InboxSearchButton() {
		return InboxSearchButton;
	}
	@FindBy(xpath="//ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement InboxSearchText;
	public  WebElement InboxSearchText() {
		return InboxSearchText;
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
	@FindBy(xpath="//ion-label[text()='Beneficiary Details']/parent::ion-segment-button")
	private WebElement beneficiaryDetailsTab;
	public  WebElement beneficiaryDetailsTab() {
		return beneficiaryDetailsTab;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement beneficiaryDetailsFirstEditIcon1;

	public WebElement beneficiaryDetailsFirstEditIcon1() {
		return beneficiaryDetailsFirstEditIcon1;
	}
	@FindBy(xpath = "//tr[1]//td[contains(text(),' Disbursment Maker ')]//preceding-sibling::td[8]//button")
	private WebElement AppDISBMKR_ActionIcon;
	public WebElement AppDISBMKR_ActionIcon() {
		return AppDISBMKR_ActionIcon;
	}
	@FindBy(xpath = "(//td[text()=' DISBCKR '])[1]//preceding-sibling::td[3]/button")
	private WebElement AppDISBCKR_ActionIcon;
	public WebElement AppDISBCKR_ActionIcon() {
		return AppDISBCKR_ActionIcon;
	}
	@FindBy(xpath = "//button[@ng-reflect-text='Update']") 
    private WebElement beneficiaryDetailsUpdate;
    public WebElement beneficiaryDetailsUpdate() {
        return beneficiaryDetailsUpdate;
    } 
    @FindBy(xpath="//div[@aria-label='Success']")
    private WebElement successMgs;
    public WebElement successMgs() {
    	return successMgs;
    }
  //ion-label[text()='Status ']/parent::div/following-sibling::ion-item//ion-toggle
    @FindBy(xpath="//ion-label[text()='Status ']/parent::div/following-sibling::ion-item//ion-toggle")
    private WebElement statusToggle;
    public WebElement statusToggle() {
    	return statusToggle;
    }
    // maker Approve Test Case
    @FindBy(xpath="(//td[text()=' DISBCKR '])[1]/preceding-sibling::td[2]/span")
	private WebElement referenceIdForDisbursementChecker;
	public WebElement referenceIdForDisbursementChecker() 
	{
		return referenceIdForDisbursementChecker;
	}
	@FindBy(xpath="//tr[1]//td[contains(text(),' Disbursment Maker ')]//preceding-sibling::td[7]//span")
	private WebElement referenceIdForDisbursementMaker;
	public WebElement referenceIdForDisbursementMaker() 
	{
		return referenceIdForDisbursementMaker;
	}
	@FindBy(xpath="//button[@ng-reflect-label='Approve']")
	private WebElement approveButton;
	public WebElement approveButton() 
	{
		return approveButton;
	}
	//ion-label[text()='approve']
	@FindBy(xpath="//ion-label[text()='approve']")
	private WebElement remarkforapprove;
	public WebElement remarkforapprove() 
	{
		return remarkforapprove;
	}
	@FindBy(xpath="(//button[@ng-reflect-label='Approve'])[2]")
	private WebElement finalApprove;
	public WebElement finalApprove() 
	{
		return finalApprove;
	}
}
