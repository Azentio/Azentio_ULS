package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DueMasterObject {
	WebDriver driver;
	public DueMasterObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ion-label[text()='Product Definitions']")
	private WebElement productDefinitionInLeftPanel;
	public WebElement productDefinitionInLeftPanel() {
		return productDefinitionInLeftPanel;
	}
	@FindBy(xpath="//ion-label[text()='Due master']//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement dueMasterViewIcon;
	public WebElement dueMasterViewIcon() {
		return dueMasterViewIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement dueMasterAddIcon;
	public WebElement dueMasterAddIcon() {
		return dueMasterAddIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Due Code')]//following-sibling::ion-input/input")
	private WebElement dueMasterDueCodeField;
	public WebElement dueMasterDueCodeField() {
		return dueMasterDueCodeField;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Description')]//following-sibling::ion-input/input")
	private WebElement dueMasterDescriptionField;
	public WebElement dueMasterDescriptionField() {
		return dueMasterDescriptionField;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Legal Code 1')]//following-sibling::ion-input/input")
	private WebElement dueMasterLegalCode1Field;
	public WebElement dueMasterLegalCode1Field() {
		return dueMasterLegalCode1Field;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Legal Code 2')]//following-sibling::ion-input/input")
	private WebElement dueMasterLegalCode2Field;
	public WebElement dueMasterLegalCode2Field() {
		return dueMasterLegalCode2Field;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Legal Code 3')]//following-sibling::ion-input/input")
	private WebElement dueMasterLegalCode3Field;
	public WebElement dueMasterLegalCode3Field() {
		return dueMasterLegalCode3Field;
	}
	@FindBy(xpath="//ion-textarea/div/textarea")
	private WebElement dueMasterRemarksField;
	public WebElement dueMasterRemarksField() {
		return dueMasterRemarksField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Waiver Allowed ']")
	private WebElement dueMasterWaiverAllowedField;
	public WebElement dueMasterWaiverAllowedField() {
		return dueMasterWaiverAllowedField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Repayment Flag ']")
	private WebElement dueMasterRepaymentFlagField;
	public WebElement dueMasterRepaymentFlagField() {
		return dueMasterRepaymentFlagField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Future Adjustment Flag ']")
	private WebElement dueMasterFutureAdjustmentFlagField;
	public WebElement dueMasterFutureAdjustmentFlagField() {
		return dueMasterFutureAdjustmentFlagField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Is Tax Due ']")
	private WebElement dueMasterIsTaxDueField;
	public WebElement dueMasterIsTaxDueField() {
		return dueMasterIsTaxDueField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Tax Calculation Method ']")
	private WebElement dueMasterTaxCalculationMethodField;
	public WebElement dueMasterTaxCalculationMethodField() {
		return dueMasterTaxCalculationMethodField;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement dueMasterSaveButton;
	public WebElement dueMasterSaveButton() {
		return dueMasterSaveButton;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-arrow-left']")
	private WebElement dueMasterBackButton;
	public WebElement dueMasterBackButton() {
		return dueMasterBackButton;
	}
	@FindBy(xpath="(//div[@role='alert'])[2]")
	private WebElement dueMastersubmitSuccessPopup;
	public WebElement dueMastersubmitSuccessPopup() {
		return dueMastersubmitSuccessPopup;
	}
	@FindBy(xpath="//span[@class='redclr ng-star-inserted']")
	private WebElement dueMasterRedColorAstricSymbolForRequiredField;
	public WebElement dueMasterRedColorAstricSymbolForRequiredField() {
		return dueMasterRedColorAstricSymbolForRequiredField;
	}
	@FindBy(xpath="//ion-badge[contains(text(), 'Required field')]")
	private WebElement requiredFieldWarningPopup;
	public WebElement requiredFieldWarningPopup() {
		return requiredFieldWarningPopup;
	}
	@FindBy(xpath="//ion-badge[contains(text(),' Alphanumeric characters allowed')]")
	private WebElement alphaNumericCharactersAllowedWarningPopup;
	public WebElement alphaNumericCharactersAllowedWarningPopup() {
		return alphaNumericCharactersAllowedWarningPopup;
	}
	
	@FindBy(xpath="//ion-label[text()='Due master']//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement dueMasterTempView;
	public WebElement dueMasterTempView() {
		return dueMasterTempView;
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement pencilIconOfFirstRecord;
	public WebElement pencilIconOfFirstRecord() {
		return pencilIconOfFirstRecord;
	}
	@FindBy(xpath="//ion-label[text()='Status ']//parent::div//following-sibling::ion-item//child::ion-toggle")
	private WebElement statusToggleIcon;
	public WebElement statusToggleIcon() {
		return statusToggleIcon;
	}
	
	@FindBy(xpath="//button[@aria-label='Close']")
	private WebElement closeIconInSuccessPopup;
	public WebElement closeIconInSuccessPopup() {
		return closeIconInSuccessPopup;
	}
	@FindBy(xpath="//span[contains(text(),'Configurations')]")
	private WebElement configurationInLeftPanel;
	public WebElement configurationInLeftPanel() {
		return configurationInLeftPanel;
	}
	
}
