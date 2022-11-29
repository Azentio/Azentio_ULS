package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerEntityLayout_IdentificationObj {
	WebDriver driver;
	public CustomerEntityLayout_IdentificationObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ion-label[contains(text(),' ID Type ')]//following-sibling::ion-select")
	private WebElement Identification_IDTypeField;
	public WebElement Identification_IDTypeField() {
		return Identification_IDTypeField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' ID Number ')]//following-sibling::ion-input/input")
	private WebElement Identification_IDNumberField;
	public WebElement Identification_IDNumberField() {
		return Identification_IDNumberField;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[1]")
	private WebElement Identification_IssueDate;
	public WebElement Identification_IssueDate() {
		return Identification_IssueDate;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[2]")
	private WebElement Identification_ExpiryDate;
	public WebElement Identification_ExpiryDate() {
		return Identification_ExpiryDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Issuing Authority ')]//following-sibling::ion-select")
	private WebElement Identification_IssuingAuthority;
	public WebElement Identification_IssuingAuthority() {
		return Identification_IssuingAuthority;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Country of Issue ')]//following-sibling::ion-select")
	private WebElement Identification_CountryOfIssue;
	public WebElement Identification_CountryOfIssue() {
		return Identification_CountryOfIssue;
	}
	@FindBy(xpath="//ion-title[contains(text(),' Customer Identification ')]//ancestor::ion-card//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement Identification_AddIcon;
	public WebElement Identification_AddIcon() {
	return Identification_AddIcon;
	}
	@FindBy(xpath="//span[contains(text(),'Transactions')]")
	private WebElement TransactionButtonInLeftPanel;
	public WebElement TransactionButtonInLeftPanel() {
	return TransactionButtonInLeftPanel;
	}
	@FindBy(xpath = "//div[contains(text(),'Success!')]") 
    private WebElement ContactDetailsSaveSuccessfulPopup;
    public WebElement ContactDetailsSaveSuccessfulPopup() {
    return ContactDetailsSaveSuccessfulPopup;
    }
    @FindBy(xpath="//span[contains(text(),'Today')]")
	private WebElement CalenderIcon_TodayValue;
	public WebElement CalenderIcon_TodayValue() {
		return CalenderIcon_TodayValue;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement ContactDetails_SaveIcon;
	public WebElement ContactDetails_SaveIcon() {
		return ContactDetails_SaveIcon;
	}
	@FindBy(xpath="//ion-badge[contains(text(),' Alphanumeric characters allowed')]")
	private WebElement alphaNumericCharactersAllowedWarningPopup;
	public WebElement alphaNumericCharactersAllowedWarningPopup() {
		return alphaNumericCharactersAllowedWarningPopup;
	}
	@FindBy(xpath="//body[1]/app-root[1]/ion-app[1]/ion-modal[1]/page-composer-parser[1]/ion-content[1]/ion-grid[1]/ion-row[1]/ion-col[1]/data-grid[1]/ion-grid[1]/ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/button[1]/span[1]")
	private WebElement PencilIconOfFirstRecordInIdentification;
	public WebElement PencilIconOfFirstRecordInIdentification() {
		return PencilIconOfFirstRecordInIdentification;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-arrow-left'])[3]")
	private WebElement BackIcon;
	public WebElement BackIcon() {
		return BackIcon;
	}
	@FindBy(xpath="(//span[text()='Export'])[2]")
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
