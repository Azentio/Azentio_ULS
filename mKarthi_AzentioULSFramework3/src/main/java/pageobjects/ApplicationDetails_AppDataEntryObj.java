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
	@FindBy(xpath="//ion-label[text()=' Primary Product ']//following-sibling::ion-select")
	private WebElement AppDataEntry_PrimaryProductField;
	public WebElement AppDataEntry_PrimaryProductField() {
		return AppDataEntry_PrimaryProductField;
	}
	@FindBy(xpath="//ion-label[text()=' Primary Sub Product ']//following-sibling::ion-select")
	private WebElement AppDataEntry_PrimarySubProductField;
	public WebElement AppDataEntry_PrimarySubProductField() {
		return AppDataEntry_PrimarySubProductField;
	}
	@FindBy(xpath="//ion-label[text()=' Special Promotion/Campaign ']//following-sibling::ion-select")
	private WebElement AppDataEntry_SpecialPromotionField;
	public WebElement AppDataEntry_SpecialPromotionField() {
		return AppDataEntry_SpecialPromotionField;
	}
	@FindBy(xpath="//ion-label[text()=' Sourcing Channel ']//following-sibling::ion-select")
	private WebElement AppDataEntry_SourcingChannelField;
	public WebElement AppDataEntry_SourcingChannelField() {
		return AppDataEntry_SourcingChannelField;
	}
	@FindBy(xpath="//ion-label[text()=' Business Center Code ']//following-sibling::ion-select")
	private WebElement AppDataEntry_BusinessCenterCodeField;
	public WebElement AppDataEntry_BusinessCenterCodeField() {
		return AppDataEntry_BusinessCenterCodeField;
	}
	@FindBy(xpath="//ion-label[text()=' Servicing Type ']//following-sibling::ion-select")
	private WebElement AppDataEntry_ServicingTypeField;
	public WebElement AppDataEntry_ServicingTypeField() {
		return AppDataEntry_ServicingTypeField;
	}
	@FindBy(xpath="//ion-label[text()=' Servicing Entity ']//following-sibling::ion-select")
	private WebElement AppDataEntry_ServicingEntityField;
	public WebElement AppDataEntry_ServicingEntityField() {
		return AppDataEntry_ServicingEntityField;
	}
	@FindBy(xpath="//ion-label[text()=' Servicing Branch ']//following-sibling::ion-select")
	private WebElement AppDataEntry_ServicingBranchField;
	public WebElement AppDataEntry_ServicingBranchField() {
		return AppDataEntry_ServicingBranchField;
	}
	
	@FindBy(xpath="//ion-label[text()=' Closing Staff or Servicing Staff or RM ']//following-sibling::ion-select")
	private WebElement AppDataEntry_ClosingStaffField;
	public WebElement AppDataEntry_ClosingStaffField() {
		return AppDataEntry_ClosingStaffField;
	}
	@FindBy(xpath="//ion-label[text()=' Sourcing Type ']//following-sibling::ion-select")
	private WebElement AppDataEntry_SourcingTypeField;
	public WebElement AppDataEntry_SourcingTypeField() {
		return AppDataEntry_SourcingTypeField;
	}
	@FindBy(xpath="//ion-label[text()=' Sourcing Staff ']//following-sibling::ion-select")
	private WebElement AppDataEntry_SourcingStaffField;
	public WebElement AppDataEntry_SourcingStaffField() {
		return AppDataEntry_SourcingStaffField;
	}
	@FindBy(xpath="//ion-label[text()=' Sourcing Entity ']//following-sibling::ion-select")
	private WebElement AppDataEntry_SourcingEntityField;
	public WebElement AppDataEntry_SourcingEntityField() {
		return AppDataEntry_SourcingEntityField;
	}
	@FindBy(xpath="//ion-label[text()=' Sourcing Office ']//following-sibling::ion-select")
	private WebElement AppDataEntry_SourcingOfficeField;
	public WebElement AppDataEntry_SourcingOfficeField() {
		return AppDataEntry_SourcingOfficeField;
	}
	@FindBy(xpath="//ion-label[text()=' Reference Type ']//following-sibling::ion-select")
	private WebElement AppDataEntry_ReferenceTypeField;
	public WebElement AppDataEntry_ReferenceTypeField() {
		return AppDataEntry_ReferenceTypeField;
	}
	@FindBy(xpath="//ion-label[text()=' Reference Entity ']//following-sibling::ion-select")
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
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement apllicationDetails_BackButton;
	public WebElement apllicationDetails_BackButton(){
		return apllicationDetails_BackButton;
	}
	@FindBy(xpath="//span[text()=' Inbox ']")
	private WebElement apllicationDetails_InboxText;
	public WebElement applicationDetailsInboxText(){
		return apllicationDetails_InboxText;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-pencil'])[1]")
	private WebElement apllicationDetails_PencilIconOfFirstRecord;
	public WebElement apllicationDetails_PencilIconOfFirstRecord(){
	return apllicationDetails_PencilIconOfFirstRecord;
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
    
    @FindBy(xpath = "//td[contains(text(),'APPDATAENT')]/parent::tr/td/button[1]") 
    private WebElement ApplicationDetailsMailBoxActionButtonOfFirstRecord_AppDataEntry;
    public WebElement ApplicationDetailsMailBoxActionButtonOfFirstRecord_AppDataEntry() {
    return ApplicationDetailsMailBoxActionButtonOfFirstRecord_AppDataEntry;
    }  
    @FindBy(xpath = "//td[contains(text(),' OFFERING ')]/parent::tr/td/button[1]") 
    private WebElement ApplicationDetailsMailBoxActionButtonOfFirstRecord_Offering;
    public WebElement ApplicationDetailsMailBoxActionButtonOfFirstRecord_Offering() {
    return ApplicationDetailsMailBoxActionButtonOfFirstRecord_Offering;
    } 
    @FindBy(xpath = "//div[@aria-label='Success']") 
    private WebElement ApplicationDetailsSaveSuccessfulPopup;
    public WebElement ApplicationDetailsSaveSuccessfulPopup() {
    return ApplicationDetailsSaveSuccessfulPopup;
    }
    @FindBy(xpath = "//ion-segment-button/ion-label[contains(text(),'Application Details')]") 
    private WebElement ApplicationDetails_ApplicationDetailsTabInOfferingScreen;
    public WebElement ApplicationDetails_ApplicationDetailsTabInOfferingScreen() {
    return ApplicationDetails_ApplicationDetailsTabInOfferingScreen;
    }
    @FindBy(xpath="//ion-badge[contains(text(), 'Required field')]")
   	private WebElement requiredFieldWarningPopup;
   	public WebElement requiredFieldWarningPopup() {
   	return requiredFieldWarningPopup;
   	}
   	@FindBy(xpath="//button[@ng-reflect-text='View Summary']/child::span[1]")
	private WebElement viewSummaryIconOfApplicationDetails;
	public WebElement viewSummaryIconOfApplicationDetails() {
		return viewSummaryIconOfApplicationDetails;
	}
	@FindBy(xpath="//ionic-title[contains(text(),'  Transaction summary ')]")
	private WebElement viewSummaryPageOfApplicationDetails;
	public WebElement viewSummaryPageOfApplicationDetails() {
		return viewSummaryPageOfApplicationDetails;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Customer Name ')]//following-sibling::ion-input/input")
	private WebElement ApplicationDetails_CustomerNameField;
	public WebElement ApplicationDetails_CustomerNameField() {
		return ApplicationDetails_CustomerNameField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Application Number ')]//following-sibling::ion-input/input")
	private WebElement ApplicationDetails_ApplicationNumberField;
	public WebElement ApplicationDetails_ApplicationNumberField() {
		return ApplicationDetails_ApplicationNumberField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Mobile Number ')]//following-sibling::ion-input/input")
	private WebElement ApplicationDetails_MobileNumberField;
	public WebElement ApplicationDetails_MobileNumberField() {
		return ApplicationDetails_MobileNumberField;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-calendar']")
	private WebElement ApplicationDetails_CalenderIcon;
	public WebElement ApplicationDetails_CalenderIcon() {
		return ApplicationDetails_CalenderIcon;
	}
	@FindBy(xpath="//span[contains(text(),'Today')]")
	private WebElement ApplicationDetails_CalenderIcon_TodayValue;
	public WebElement ApplicationDetails_CalenderIcon_TodayValue() {
		return ApplicationDetails_CalenderIcon_TodayValue;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Email ID ')]//following-sibling::ion-input/input")
	private WebElement ApplicationDetails_EmailIdField;
	public WebElement ApplicationDetails_EmailIdField() {
		return ApplicationDetails_EmailIdField;
	}
}


