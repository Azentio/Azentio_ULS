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
	
}

	
