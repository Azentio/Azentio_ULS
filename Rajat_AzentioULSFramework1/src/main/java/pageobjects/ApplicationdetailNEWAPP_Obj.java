package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationdetailNEWAPP_Obj {
	WebDriver driver;

	public ApplicationdetailNEWAPP_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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

	
	
	
	//****************************Kamalapriya***************************
	//1//
	@FindBy(xpath = "(//td[text()=' NEWAPP '])[1]//preceding-sibling::td[3]/button")
	private WebElement NewApp_ActionIcon1;
	public WebElement NewApp_ActionIcon() {
		return NewApp_ActionIcon1;
	}
	@FindBy(xpath="//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement Inbox_Icon1;
	public WebElement Inbox_Icon() {
		return Inbox_Icon1;
	}
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement Application_NewApp_SubmitButton1;
	public WebElement Application_NewApp_SubmitButton() {
		return Application_NewApp_SubmitButton1;
	}
	@FindBy(xpath = "//ion-label[contains(text(),'ok')]")
	private WebElement Application_NewApp_SubmitAlertButton1;
	public WebElement Application_NewApp_SubmitAlertButton() {
		return Application_NewApp_SubmitAlertButton1;
	}
	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement Application_NewApp_SubmitFinalButton1;
	public WebElement Application_NewApp_SubmitFinalButton() {
		return Application_NewApp_SubmitFinalButton1;
	}
	//2//
	@FindBy(xpath = "(//td[text()=' APPDATAENT '])[1]//preceding-sibling::td[3]/button")
	private WebElement Application_APPDATAENT_ActionIcon1;
	public WebElement Application_APPDATAENT_ActionIcon() {
		return Application_APPDATAENT_ActionIcon1;
	}
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Application_APPDATAENT_ApproveButton1;
	public WebElement Application_APPDATAENT_ApproveButton() {
		return Application_APPDATAENT_ApproveButton1;
	}
	@FindBy(xpath = "//ion-label[contains(text(),'approve')]")
	private WebElement Application_APPDATAENT_ApproveAlertButton1;
	public WebElement Application_APPDATAENT_ApproveAlertButton() {
		return Application_APPDATAENT_ApproveAlertButton1;
	}
	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement Application_APPDATAENT_ApproveFinalButton1;
	public WebElement Application_APPDATAENT_ApproveFinalButton() {
		return Application_APPDATAENT_ApproveFinalButton1;
	
}
	@FindBy(xpath = "(//td[text()=' LEGVRFY '])[1]//preceding-sibling::td[3]/button")
	private WebElement Application_LEGVRFY_ActionButton1;
	public WebElement Application_LEGVRFY_ActionButton() {
		return Application_LEGVRFY_ActionButton1;
}
	@FindBy(xpath = "(//td[text()=' FCUVRFY '])[1]//preceding-sibling::td[3]/button")
	private WebElement Application_FCUVRFY_ActionButton1;
	public WebElement Application_FCUVRFY_ActionButton() {
		return Application_FCUVRFY_ActionButton1;
}
	@FindBy(xpath = "(//td[text()=' OFFERING '])[1]//preceding-sibling::td[3]/button")
	private WebElement Application_OFFERING_ActionButton1;
	public WebElement Application_OFFERING_ActionButton() {
		return Application_OFFERING_ActionButton1;
}
	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement Application_OFFERING_ApplicationDetails1;
	public WebElement Application_OFFERING_ApplicationDetails() {
		return Application_OFFERING_ApplicationDetails1;
}
	@FindBy(xpath = "(//td[text()=' DISBMKR '])[1]//preceding-sibling::td[3]/button")
	private WebElement Application_DISBMKR_ActionIcon1;
	public WebElement Application_DISBMKR_ActionIcon() {
		return Application_DISBMKR_ActionIcon1;
}
	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement Application_CustomerDetailTab1;
	public WebElement Application_CustomerDetailTab() {
		return Application_CustomerDetailTab1;
}
	@FindBy(xpath="//tbody/tr[1]/td[1]/p-tableradiobutton[1]/div[1]/div[1]")
	private WebElement Application_CustomerDetailsRound1;
	public WebElement Application_CustomerDetailsRound() {
		return Application_CustomerDetailsRound1;
	}
	@FindBy(xpath="//ion-segment-button[@id='seg1']")
	private WebElement Application_Tab1;
	public WebElement Application_Tab() {
		return Application_Tab1;
	}
	@FindBy(xpath ="//td[text()=' DUPAPPDEC ']//preceding-sibling::td[3]/button")
	private WebElement Application_DUPAPPDEC_ActionIcon1;
	public WebElement Application_DUPAPPDEC_ActionIcon() {
		return Application_DUPAPPDEC_ActionIcon1;
	}
	@FindBy(xpath="//ion-segment-button[@id='seg2']")
	private WebElement Application_DetailTab_Offering1;
	public  WebElement Application_DetailTab_Offering() {
		return Application_DetailTab_Offering1;
	}
	//***************************Search**************************//
	@FindBy(xpath="//button[@ng-reflect-text='Search']")
	private WebElement Application_DetailTab_SearchButtons1;
	public  WebElement Application_DetailTab_SearchButtons() {
		return Application_DetailTab_SearchButtons1;
	}
	@FindBy(xpath="//ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement Application_DetailTab_SearchText1;
	public  WebElement Application_DetailTab_SearchText() {
		return Application_DetailTab_SearchText1;
	}
	@FindBy(xpath="//ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/i")
	private WebElement Application_DetailTab_SearchTextClose;
	public  WebElement Application_DetailTab_SearchTextClose() {
		return Application_DetailTab_SearchText1;
	}
	@FindBy(xpath="//ion-label[text()=' Primary Product ']/following-sibling::ion-select")
	private WebElement NEWAPP_primaryProduct1;
	public  WebElement NEWAPP_primaryProduct() {
		return NEWAPP_primaryProduct1;
	}
	@FindBy(xpath="//div[@role='alertdialog']")
    private WebElement successMgs;
    public WebElement successMgs() {
    	return successMgs;
    }
	@FindBy(xpath="//ion-label[text()=' Primary Sub Product ']/following-sibling::ion-select")
	private WebElement NEWAPP_primarysubProduct1;
	public  WebElement NEWAPP_primarysubProduct() {
		return NEWAPP_primarysubProduct1;
	}
	@FindBy(xpath="//ion-label[text()=' Total Finance Amount Requested ']/parent::div/following-sibling::div//p-inputnumber//input")
	private WebElement NEWAPP_TotalFinanceAmountRequested1;
	public  WebElement NEWAPP_TotalFinanceAmountRequested() {
		return NEWAPP_TotalFinanceAmountRequested1;
	}
	@FindBy(xpath="//ion-label[text()=' Total Finance Amount Requested ']/parent::div/following-sibling::div//p-inputnumber")
	private WebElement NEWAPP_TotalFinanceAmountRequestedText;
	public  WebElement NEWAPP_TotalFinanceAmountRequestedText() {
		return NEWAPP_TotalFinanceAmountRequestedText;
	}
	@FindBy(xpath="//ion-label[text()=' Declared Net Income ']/parent::div/following-sibling::div//p-inputnumber//input")
	private WebElement NEWAPP_DeclaredNetIncome1;
	public  WebElement NEWAPP_DeclaredNetIncome() {
		return NEWAPP_DeclaredNetIncome1;
	}
	@FindBy(xpath="//ion-label[text()=' Declared Net Income ']/parent::div/following-sibling::div//p-inputnumber")
	private WebElement NEWAPP_DeclaredNetIncomeText;
	public  WebElement NEWAPP_DeclaredNetIncomeText() {
		return NEWAPP_DeclaredNetIncomeText;
	}
	@FindBy(xpath="//ion-label[text()=' Special Promotion/Campaign ']/following-sibling::ion-select")
	private WebElement NEWAPP_SpecialPromotion1;
	public  WebElement NEWAPP_SpecialPromotion() {
		return NEWAPP_SpecialPromotion1;
	}
	@FindBy(xpath="//ion-label[text()=' Declared Current Obligations ']/parent::div/following-sibling::div//p-inputnumber//input")
	private WebElement NEWAPP_DeclaredCurrentObligations1;
	public  WebElement NEWAPP_DeclaredCurrentObligations() {
		return NEWAPP_DeclaredCurrentObligations1;
	}
	@FindBy(xpath="//ion-label[text()=' Declared Current Obligations ']/parent::div/following-sibling::div//p-inputnumber")
	private WebElement NEWAPP_DeclaredCurrentObligationsText;
	public  WebElement NEWAPP_DeclaredCurrentObligationsText() {
		return NEWAPP_DeclaredCurrentObligationsText;
	}
	@FindBy(xpath="//ion-label[text()=' Sourcing Channel ']/following-sibling::ion-select")
	private WebElement NEWAPP_SourcingChannel1;
	public  WebElement NEWAPP_SourcingChannel() {
		return NEWAPP_SourcingChannel1;
	}
	@FindBy(xpath="//ion-label[text()=' Business Center Code ']/following-sibling::ion-select")
	private WebElement NEWAPP_BusinessCenterCode1;
	public  WebElement NEWAPP_BusinessCenterCode() {
		return NEWAPP_BusinessCenterCode1;
	}
	@FindBy(xpath="//ion-label[text()=' Servicing Type ']/following-sibling::ion-select")
	private WebElement NEWAPP_ServicingType1;
	public  WebElement NEWAPP_ServicingType() {
		return NEWAPP_ServicingType1;
	}
	@FindBy(xpath="//ion-label[text()=' Servicing Entity ']/following-sibling::ion-select")
	private WebElement NEWAPP_ServicingEntity1;
	public  WebElement NEWAPP_ServicingEntity() {
		return NEWAPP_ServicingEntity1;
	}
	@FindBy(xpath="//ion-label[text()=' Servicing Branch ']/following-sibling::ion-select")
	private WebElement NEWAPP_ServicingBranch1;
	public  WebElement NEWAPP_ServicingBranch() {
		return NEWAPP_ServicingBranch1;
	}
	@FindBy(xpath="//ion-label[text()=' Closing Staff or Servicing Staff or RM ']/following-sibling::ion-select")
	private WebElement NEWAPP_ClosingStaff1;
	public  WebElement NEWAPP_ClosingStaff() {
		return NEWAPP_ClosingStaff1;
	}
	@FindBy(xpath="//ion-label[text()=' Sourcing Type ']/following-sibling::ion-select")
	private WebElement NEWAPP_SourcingType1;
	public  WebElement NEWAPP_SourcingType() {
		return NEWAPP_SourcingType1;
	}
	@FindBy(xpath="//ion-label[text()=' Sourcing Staff ']/following-sibling::ion-select")
	private WebElement NEWAPP_SourcingStaff1;
	public  WebElement NEWAPP_SourcingStaff() {
		return NEWAPP_SourcingStaff1;
	}
	@FindBy(xpath="//ion-label[text()=' Sourcing Entity ']/following-sibling::ion-select")
	private WebElement NEWAPP_SourcingEntity1;
	public  WebElement NEWAPP_SourcingEntity() {
		return NEWAPP_SourcingEntity1;
	}
	@FindBy(xpath="//ion-label[text()=' Sourcing Office ']/following-sibling::ion-select")
	private WebElement NEWAPP_SourcingOffice1;
	public  WebElement NEWAPP_SourcingOffice() {
		return NEWAPP_SourcingOffice1;
	}
	@FindBy(xpath="//ion-label[text()=' Reference Entity ']/following-sibling::ion-select")
	private WebElement NEWAPP_ReferenceEntity1;
	public  WebElement NEWAPP_ReferenceEntity() {
		return NEWAPP_ReferenceEntity1;
	}
	@FindBy(xpath="//ion-label[text()=' Reference Type ']/following-sibling::ion-select")
	private WebElement NEWAPP_ReferenceType1;
	public  WebElement NEWAPP_ReferenceType() {
		return NEWAPP_ReferenceType1;
	}
	@FindBy(xpath="//ion-label[text()=' Reference Code ']//following-sibling::ion-input/input")
	private WebElement NEWAPP_ReferenceCode1;
	public  WebElement NEWAPP_ReferenceCode() {
		return NEWAPP_ReferenceCode1;
	}
	@FindBy(xpath="//ion-label[text()=' Reference Code ']//following-sibling::ion-input")
	private WebElement NEWAPP_ReferenceCodeText;
	public  WebElement NEWAPP_ReferenceCodeText() {
		return NEWAPP_ReferenceCodeText;
	}
	
	
}
