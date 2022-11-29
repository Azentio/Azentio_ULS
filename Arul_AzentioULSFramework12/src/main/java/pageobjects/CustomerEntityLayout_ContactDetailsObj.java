package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerEntityLayout_ContactDetailsObj {
	WebDriver driver;
	public CustomerEntityLayout_ContactDetailsObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ion-label[contains(text(),' Phone Type ')]//following-sibling::ion-select")
	private WebElement ContactDetails_PhoneTypeField;
	public WebElement ContactDetails_PhoneTypeField() {
		return ContactDetails_PhoneTypeField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Phone Number ')]//following-sibling::ion-input/input")
	private WebElement ContactDetails_PhoneNumberField;
	public WebElement ContactDetails_PhoneNumberField() {
		return ContactDetails_PhoneNumberField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Consent for Phone Contact ')]//following-sibling::ion-select")
	private WebElement ContactDetails_ConsentForPhoneContactField;
	public WebElement ContactDetails_ConsentForPhoneContactField() {
		return ContactDetails_ConsentForPhoneContactField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Prefered Phone Contact Type ')]//following-sibling::ion-select")
	private WebElement ContactDetails_PreferedPhoneCotactTypeField;
	public WebElement ContactDetails_PreferedPhoneCotactTypeField() {
		return ContactDetails_PreferedPhoneCotactTypeField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Prefered Time For Contact ')]//following-sibling::ion-input/input")
	private WebElement ContactDetails_PreferedTimeForContactField;
	public WebElement ContactDetails_PreferedTimeForContactField() {
		return ContactDetails_PreferedTimeForContactField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Email Type ')]//following-sibling::ion-select")
	private WebElement ContactDetails_EmailTypeField;
	public WebElement ContactDetails_EmailTypeField() {
		return ContactDetails_EmailTypeField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Email Id ')]//following-sibling::ion-input/input")
	private WebElement ContactDetails_EmailIdField;
	public WebElement ContactDetails_EmailIdField() {
		return ContactDetails_EmailIdField;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement ContactDetails_SaveIcon;
	public WebElement ContactDetails_SaveIcon() {
		return ContactDetails_SaveIcon;
	}
	@FindBy(xpath="//span[contains(text(),'Transactions')]")
	private WebElement TransactionButtonInLeftPanel;
	public WebElement TransactionButtonInLeftPanel() {
	return TransactionButtonInLeftPanel;
	}
	@FindBy(xpath="//ion-title[contains(text(),' Contact Details ')]//ancestor::ion-card//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement ContactDetailsAddIcon;
	public WebElement ContactDetailsAddIcon() {
	return ContactDetailsAddIcon;
	}
	@FindBy(xpath = "//div[@aria-label='Success']") 
    private WebElement ContactDetailsSaveSuccessfulPopup;
    public WebElement ContactDetailsSaveSuccessfulPopup() {
    return ContactDetailsSaveSuccessfulPopup;
    }
    @FindBy(xpath = "//ion-segment-button[@id='seg3']") 
    private WebElement ContactDetails_AdditionalCustomerInfoButton;
    public WebElement ContactDetails_AdditionalCustomerInfoButton() {
    return ContactDetails_AdditionalCustomerInfoButton;
    }
    @FindBy(xpath="//tbody/tr[1]/td[2]/span[1]/button[1]/span[1]")
	private WebElement ContactDetails_PencilIconOfFirstRecord;
	public WebElement ContactDetails_PencilIconOfFirstRecord() {
		return ContactDetails_PencilIconOfFirstRecord;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-arrow-left'])[2]")
	private WebElement BackIcon;
	public WebElement BackIcon() {
		return BackIcon;
	}
	@FindBy(xpath="//ion-badge[contains(text(), 'Required field')]")
	private WebElement requiredFieldWarningPopup;
	public WebElement requiredFieldWarningPopup() {
		return requiredFieldWarningPopup;
	}
	@FindBy(xpath="//ion-badge[contains(text(),' Invalid time format (HH:MM)')]")
	private WebElement InvalidTimeFormatWarningPopup;
	public WebElement InvalidTimeFormatWarningPopup() {
		return InvalidTimeFormatWarningPopup;
	}
	@FindBy(xpath="//ion-badge[contains(text(),' Invalid Email')]")
	private WebElement InvalidEmailWarningPopup;
	public WebElement InvalidEmailWarningPopup() {
		return InvalidEmailWarningPopup;
	}
	@FindBy(xpath="//body[1]/app-root[1]/ion-app[1]/ion-modal[1]/page-composer-parser[1]/ion-content[1]/ion-grid[1]/ion-row[1]/ion-col[3]/data-grid[1]/ion-grid[1]/ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/button[1]/span[1]")
	private WebElement PencilIconOfFirstRecordInContactDetails;
	public WebElement PencilIconOfFirstRecordInContactDetails() {
		return PencilIconOfFirstRecordInContactDetails;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-search'])[4]")
	private WebElement searchIconOfCollateralSubType;
	public WebElement searchIconOfCollateralSubType() {
		return searchIconOfCollateralSubType;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement searchTextFieldOfCollateralSubType;
	public WebElement searchTextFieldOfCollateralSubType() {
	return searchTextFieldOfCollateralSubType;
	}

	@FindBy(xpath="//input[@mode='ios']/parent::span//i")
	private WebElement clearIconInSearchFieldOfCollateralSubType;
	public WebElement clearIconInSearchFieldOfCollateralSubType() {
	return clearIconInSearchFieldOfCollateralSubType;
	}
	@FindBy(xpath="(//span[text()='Export'])[3]")
	private WebElement exportIconOfCollateralSubType;
	public WebElement exportIconOfCollateralSubType() {
		return exportIconOfCollateralSubType;
	}	
	@FindBy(xpath="//li[@aria-label='PDF']")
	private WebElement exportToPDFOfCollateralSubType;
	public WebElement exportToPDFOfCollateralSubType() {
		return exportToPDFOfCollateralSubType;
	}	
	@FindBy(xpath="//li[@aria-label='XLS']")
	private WebElement exportToExcelOfCollateralSubType;
	public WebElement exportToExcelOfCollateralSubType() {
		return exportToExcelOfCollateralSubType;
	}
}
