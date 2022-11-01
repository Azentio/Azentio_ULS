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
	@FindBy(xpath = "(//td[text()=' DISBMKR '])[1]//preceding-sibling::td[3]/button")
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
	@FindBy(xpath="(//td[text()=' DISBMKR '])[1]/preceding-sibling::td[2]/span")
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
