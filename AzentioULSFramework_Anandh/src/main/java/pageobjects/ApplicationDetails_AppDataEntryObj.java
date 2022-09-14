package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationDetails_AppDataEntryObj {
	WebDriver driver;
	public ApplicationDetails_AppDataEntryObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Primary Product *']")
	private WebElement AppDataEntry_PrimaryProductField;
	public WebElement AppDataEntry_PrimaryProductField() {
		return AppDataEntry_PrimaryProductField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Primary Sub Product *']")
	private WebElement AppDataEntry_PrimarySubProductField;
	public WebElement AppDataEntry_PrimarySubProductField() {
		return AppDataEntry_PrimarySubProductField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Special Promotion/Campaign ']")
	private WebElement AppDataEntry_SpecialPromotionField;
	public WebElement AppDataEntry_SpecialPromotionField() {
		return AppDataEntry_SpecialPromotionField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Sourcing Channel *']")
	private WebElement AppDataEntry_SourcingChannelField;
	public WebElement AppDataEntry_SourcingChannelField() {
		return AppDataEntry_SourcingChannelField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Business Center Code *']")
	private WebElement AppDataEntry_BusinessCenterCodeField;
	public WebElement AppDataEntry_BusinessCenterCodeField() {
		return AppDataEntry_BusinessCenterCodeField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Servicing Type *']")
	private WebElement AppDataEntry_ServicingTypeField;
	public WebElement AppDataEntry_ServicingTypeField() {
		return AppDataEntry_ServicingTypeField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Servicing Entity *']")
	private WebElement AppDataEntry_ServicingEntityField;
	public WebElement AppDataEntry_ServicingEntityField() {
		return AppDataEntry_ServicingEntityField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Servicing Branch *']")
	private WebElement AppDataEntry_ServicingBranchField;
	public WebElement AppDataEntry_ServicingBranchField() {
		return AppDataEntry_ServicingBranchField;
	}
	
	@FindBy(xpath="//ion-select[@aria-label='Select,  Closing Staff or Servicing Staff or RM *']")
	private WebElement AppDataEntry_ClosingStaffField;
	public WebElement AppDataEntry_ClosingStaffField() {
		return AppDataEntry_ClosingStaffField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Sourcing Type *']")
	private WebElement AppDataEntry_SourcingTypeField;
	public WebElement AppDataEntry_SourcingTypeField() {
		return AppDataEntry_SourcingTypeField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Sourcing Staff *']")
	private WebElement AppDataEntry_SourcingStaffField;
	public WebElement AppDataEntry_SourcingStaffField() {
		return AppDataEntry_SourcingStaffField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Sourcing Entity *']")
	private WebElement AppDataEntry_SourcingEntityField;
	public WebElement AppDataEntry_SourcingEntityField() {
		return AppDataEntry_SourcingEntityField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Sourcing Office *']")
	private WebElement AppDataEntry_SourcingOfficeField;
	public WebElement AppDataEntry_SourcingOfficeField() {
		return AppDataEntry_SourcingOfficeField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Reference Type ']")
	private WebElement AppDataEntry_ReferenceTypeField;
	public WebElement AppDataEntry_ReferenceTypeField() {
		return AppDataEntry_ReferenceTypeField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Reference Entity ']")
	private WebElement AppDataEntry_ReferenceEntityField;
	public WebElement AppDataEntry_ReferenceEntityField() {
		return AppDataEntry_ReferenceEntityField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Reference Code ')]//following-sibling::ion-input/input")
	private WebElement AppDataEntry_ReferenceCodeField;
	public WebElement AppDataEntry_ReferenceCodeField() {
		return AppDataEntry_ReferenceCodeField;
	}
	@FindBy(xpath="//ion-label[text()=' Total Finance Amount Requested ']/parent::div/following-sibling::div//child::p-inputnumber//input")
	private WebElement AppDataEntry_TotalFinanceAmountRequestedField;
	public WebElement AppDataEntry_TotalFinanceAmountRequestedField() {
		return AppDataEntry_TotalFinanceAmountRequestedField;
	}
	@FindBy(xpath="(//ion-item//p-inputnumber[1]//input)[2]")
	private WebElement AppDataEntry_DeclaredNetIncomeField;
	public WebElement AppDataEntry_DeclaredNetIncomeField() {
		return AppDataEntry_DeclaredNetIncomeField;
	}
	@FindBy(xpath="(//ion-item//p-inputnumber[1]//input)[3]")
	private WebElement AppDataEntry_DeclaredCurrentObligationsField;
	public WebElement AppDataEntry_DeclaredCurrentObligationsField() {
		return AppDataEntry_DeclaredCurrentObligationsField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Customer Type *']")
	private WebElement AppDataEntry_CustomerTypeField;
	public WebElement AppDataEntry_CustomerTypeField() {
		return AppDataEntry_CustomerTypeField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  ID Type ']")
	private WebElement AppDataEntry_IDTypeField;
	public WebElement AppDataEntry_IDTypeField() {
		return AppDataEntry_IDTypeField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' CIF ID ')]//following-sibling::ion-input/input")
	private WebElement AppDataEntry_CIFIDField;
	public WebElement AppDataEntry_CIFIDField() {
		return AppDataEntry_CIFIDField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' ID Number ')]//following-sibling::ion-input/input")
	private WebElement AppDataEntry_IDNumberField;
	public WebElement AppDataEntry_IDNumberField() {
		return AppDataEntry_IDNumberField;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Search'])[2]")
	private WebElement AppDataEntry_SearchButton;
	public WebElement AppDataEntry_SearchButton() {
	return AppDataEntry_SearchButton;
	}
	@FindBy(xpath="//button[contains(text(),'Create New Request ')]")
	private WebElement AppDataEntry_CreateNewRequestButton;
	public WebElement AppDataEntry_CreateNewRequestButton() {
	return AppDataEntry_CreateNewRequestButton;
	}
	@FindBy(xpath="//span[contains(text(),'Transactions')]")
	private WebElement TransactionButtonInLeftPanel;
	public WebElement TransactionButtonInLeftPanel() {
	return TransactionButtonInLeftPanel;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'Application manager')]")
	private WebElement ApplicationManagerInLeftPanel;
	public WebElement ApplicationManagerInLeftPanel() {
	return ApplicationManagerInLeftPanel;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Application Details')]/parent::ion-item//ion-button[1]")
	private WebElement ApplicationDetailsViewList;
	public WebElement ApplicationDetailsViewList() {
	return ApplicationDetailsViewList;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement ApplicationDetailsAddIcon;
	public WebElement ApplicationDetailsAddIcon() {
	return ApplicationDetailsAddIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement ApplicationDetailsSaveIcon;
	public WebElement ApplicationDetailsSaveIcon() {
	return ApplicationDetailsSaveIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Company Name ')]//following-sibling::ion-input/input")
	private WebElement AppDataEntry_CompanyNameField;
	public WebElement AppDataEntry_CompanyNameField() {
		return AppDataEntry_CompanyNameField;
	}
}


