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
	@FindBy(xpath="//tr[1]//td[text()=' DISBMKR ']/preceding-sibling::td[3]//button")
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
    @FindBy(xpath = "//tr[1]//td[text()=' DISBMKR ']/preceding-sibling::td[3]//button") 
    private WebElement ActionButtonOfFirstRecord_DISBMKR;
    public WebElement ActionButtonOfFirstRecord_DISBMKR() {
    return ActionButtonOfFirstRecord_DISBMKR;
    }
    @FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement BeneficieryDetails_PencilIconOfFirstRecord;
	public WebElement BeneficieryDetails_PencilIconOfFirstRecord() {
		return BeneficieryDetails_PencilIconOfFirstRecord;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-arrow-left']")
	private WebElement BackIcon;
	public WebElement BackIcon() {
		return BackIcon;
	}
}