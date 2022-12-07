package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class Transactions_ScreenOBJ {
	
	WebDriver driver;

	public Transactions_ScreenOBJ(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
       
	}
	
	// Application Details New App
	
	@FindBy(xpath="//span[contains(text(),'Transactions')]")
	private WebElement Transactions;
	public WebElement Transactions()
	{
		return Transactions;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Application manager')]")
	private WebElement ApplicationManager;
	public WebElement ApplicationManager()
	{
		return ApplicationManager;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Application Details')]//parent::ion-item//child::ion-buttons//child::ion-button")
	private WebElement ApplicationDetailsListviewIcon;
	public WebElement ApplicationDetailsListviewIcon()
	{
		return ApplicationDetailsListviewIcon;
	}
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-pencil'])[1]")
	private WebElement ListViewPencilIcon;
	public WebElement ListViewPencilIcon()
	{
		return ListViewPencilIcon;
	}
	@FindBy(xpath="(//input[@ng-reflect-ng-class='p-inputnumber-input'])[2]")
	private WebElement DeclaredNetIncome;
	public WebElement DeclaredNetIncome()
	{
		return DeclaredNetIncome;
	}
	@FindBy(xpath="//ion-toggle[@role='switch']")
	private WebElement StatusButton;
	public WebElement StatusButton()
	{
		return StatusButton;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Application Details')]")
	private WebElement ApplicationDetails;
	public WebElement ApplicationDetails()
	{
		return ApplicationDetails;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Update']")
	private WebElement UpdateSave;
	public WebElement UpdateSave()
	{
		return UpdateSave;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement GoBack;
	public WebElement GoBack()
	{
		return GoBack;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Reference Code')]//following-sibling::ion-input//child::input")
	private WebElement ReferenceCode;
	public WebElement ReferenceCode()
	{
		return ReferenceCode;
	}
	@FindBy(xpath="//span[contains(text(),'Approve')]")
	private WebElement ApproveButton;
	public WebElement ApproveButton()
	{
		return ApproveButton;
	}
	
	// ApplicationDetailOffering
	
	@FindBy(xpath="(//ion-label[contains(text(),'Application Details')]//parent::ion-segment-button)")
	private WebElement ApplicationDetailsTab;
	public WebElement ApplicationDetailsTab()
	{
		return ApplicationDetailsTab;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Edit']")
	private WebElement ActionEditIcon;
	public WebElement ActionEditIcon() 
	{
		return ActionEditIcon;
	}
	
	@FindBy(xpath="//ion-icon[@aria-label='mail unread outline']")
	private WebElement mailicon;
	public WebElement mailicon() 
	{
		return mailicon;
	}
	@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement searchiconreferenceid;
	public WebElement searchiconreferenceid() 
	{
		return searchiconreferenceid;
	}
	@FindBy(xpath="//span[text()=' Inbox ']//parent::div//child::span[2]/input")
	private WebElement searchsentkeys;
	public WebElement searchsentkeys() 
	{
		return searchsentkeys;
	}
	@FindBy(xpath="//ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement InboxSearchText;
	public  WebElement InboxSearchText() {
		return InboxSearchText;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Search']")
	private WebElement InboxSearchButton;
	public  WebElement InboxSearchButton() {
		return InboxSearchButton;
	}
	
	@FindBy(xpath="(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement inboxediticon;
	public WebElement inboxediticon() 
	{
		return inboxediticon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Offering')]//parent::ion-segment-button")
	private WebElement OfferingTab;
	public WebElement OfferingTab() 
	{
		return OfferingTab;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement Addicon;
	public WebElement Addicon()
	{
		return Addicon;
	}
	@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/span[1]/ion-button[1]")
	private WebElement DrawDown_Addicon;
	public WebElement DrawDown_Addicon()
	{
		return DrawDown_Addicon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Loan Tenure')]//following-sibling::ion-input//child::input")
	private WebElement LoanTenure;
	public WebElement LoanTenure()
	{
		return LoanTenure;
	}
	@FindBy(xpath="(//ion-card[@ng-reflect-mode='ios'])[2]//child::ion-toolbar//child::ion-buttons[1]")
	private WebElement BackArrow;
	public WebElement BackArrow()
	{
		return BackArrow;
	}
	@FindBy(xpath="(//ion-card[@ng-reflect-mode='ios']//child::ion-toolbar//child::ion-buttons)[3]")
	private WebElement OfferingBackArrow;
	public WebElement OfferingBackArrow()
	{
		return OfferingBackArrow;
	}
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElement NavigationNext;
	public WebElement NavigationNext()
	{
		return NavigationNext;
	}
	
	//Personal details DisChecker
	
	@FindBy(xpath="(//ion-label[contains(text(),'Customer details')]//parent::ion-segment-button)")
	private WebElement CustomerDetails;
	public WebElement CustomerDetails()
	{
		return CustomerDetails;
	}
	@FindBy(xpath="//span[contains(text(),'CIF ID')]")
	private WebElement CustomerDetails_CIFID;
	public WebElement CustomerDetails_CIFID()
	{
		return CustomerDetails_CIFID;
	}
	@FindBy(xpath="//span[contains(text(),'First Name')]")
	private WebElement CustomerDetails_FirstName;
	public WebElement CustomerDetails_FirstName()
	{
		return CustomerDetails_FirstName;
	}
	@FindBy(xpath="//span[contains(text(),'Middle Name')]")
	private WebElement CustomerDetails_MiddleName;
	public WebElement CustomerDetails_MiddleName()
	{
		return CustomerDetails_MiddleName;
	}
	@FindBy(xpath="//span[contains(text(),'Last Name')]")
	private WebElement CustomerDetails_LastName;
	public WebElement CustomerDetails_LastName()
	{
		return CustomerDetails_LastName;
	}
	@FindBy(xpath="//span[contains(text(),'Customer Type')]")
	private WebElement CustomerDetails_CustomerType;
	public WebElement CustomerDetails_CustomerType()
	{
		return CustomerDetails_CustomerType;
	}
	@FindBy(xpath="//span[contains(text(),'Applicant Type')]")
	private WebElement CustomerDetails_ApplicantType;
	public WebElement CustomerDetails_ApplicantType()
	{
		return CustomerDetails_ApplicantType;
	}
	@FindBy(xpath="//span[contains(text(),'Status')]")
	private WebElement CustomerDetails_Status;
	public WebElement CustomerDetails_Status()
	{
		return CustomerDetails_Status;
	}
	
	//ApplicationDetails Disbursement checker
	
	@FindBy(xpath="(//ion-label[contains(text(),'Class')]//following-sibling::ion-select)")
	private WebElement ApplicationDetails_Classification;
	public WebElement ApplicationDetails_Classification()
	{
		return ApplicationDetails_Classification;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'Product')]//following-sibling::ion-select)")
	private WebElement ApplicationDetails_Product;
	public WebElement ApplicationDetails_Product()
	{
		return ApplicationDetails_Product;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Total Finance Amount Requested')]//parent::div//following-sibling::div//p-inputnumber")
	private WebElement ApplicationDetails_TotalFinanceAmountRequested;
	public WebElement ApplicationDetails_TotalFinanceAmountRequested()
	{
		return ApplicationDetails_TotalFinanceAmountRequested;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Declared Net')]//parent::div//following-sibling::div//p-inputnumber")
	private WebElement ApplicationDetails_DeclaredNetIncome;
	public WebElement ApplicationDetails_DeclaredNetIncome()
	{
		return ApplicationDetails_DeclaredNetIncome;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Declared Current Obligations')]//parent::div//following-sibling::div//p-inputnumber")
	private WebElement ApplicationDetails_DeclaredCurrentObligations;
	public WebElement ApplicationDetails_DeclaredCurrentObligations()
	{
		return ApplicationDetails_DeclaredCurrentObligations;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Special Promotion/Campaign')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_SpecialPromotionCampaign;
	public WebElement ApplicationDetails_SpecialPromotionCampaign()
	{
		return ApplicationDetails_SpecialPromotionCampaign;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Sourcing Channel')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_SourcingChannel;
	public WebElement ApplicationDetails_SourcingChannel()
	{
		return ApplicationDetails_SourcingChannel;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Business Center Code')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_BusinessCenterCode;
	public WebElement ApplicationDetails_BusinessCenterCode()
	{
		return ApplicationDetails_BusinessCenterCode;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Servicing Type')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_ServicingType;
	public WebElement ApplicationDetails_ServicingType()
	{
		return ApplicationDetails_ServicingType;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Region')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_Region;
	public WebElement ApplicationDetails_Region()
	{
		return ApplicationDetails_Region;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Servicing Branch')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_ServicingBranch;
	public WebElement ApplicationDetails_ServicingBranch()
	{
		return ApplicationDetails_ServicingBranch;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Closing Staff or Servicing Staff or RM')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_ClosingStaffOrServicingStaffOrRM;
	public WebElement ApplicationDetails_ClosingStaffOrServicingStaffOrRM()
	{
		return ApplicationDetails_ClosingStaffOrServicingStaffOrRM;
	}
	//Referral/Sourcing Details
	
	@FindBy(xpath="//ion-label[contains(text(),'Sourcing Type')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_SourcingType;
	public WebElement ApplicationDetails_SourcingType()
	{
		return ApplicationDetails_SourcingType;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Sourcing Staff')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_SourcingStaff;
	public WebElement ApplicationDetails_SourcingStaff()
	{
		return ApplicationDetails_SourcingStaff;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Sourcing Entity')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_SourcingEntity;
	public WebElement ApplicationDetails_SourcingEntity()
	{
		return ApplicationDetails_SourcingEntity;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Sourcing Office')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_SourcingOffice;
	public WebElement ApplicationDetails_SourcingOffice()
	{
		return ApplicationDetails_SourcingOffice;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Reference Type')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_ReferenceType;
	public WebElement ApplicationDetails_ReferenceType()
	{
		return ApplicationDetails_ReferenceType;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Reference Entity')]//following-sibling::ion-select")
	private WebElement ApplicationDetails_ReferenceEntity;
	public WebElement ApplicationDetails_ReferenceEntity()
	{
		return ApplicationDetails_ReferenceEntity;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Reference Code')]//following-sibling::ion-input")
	private WebElement ApplicationDetails_ReferenceCode;
	public WebElement ApplicationDetails_ReferenceCode()
	{
		return ApplicationDetails_ReferenceCode;
	}
	@FindBy(xpath="//button[@ng-reflect-text='View Summary']/child::span[1]")
	private WebElement ViewSummary;
	public WebElement ViewSummary()
	{
		return ViewSummary;
	}
	@FindBy(xpath="//ion-button[@expand='block']//child::ion-icon")
	private WebElement ViewSummaryClose;
	public WebElement ViewSummaryClose()
	{
		return ViewSummaryClose;
	}
	
	//Facility Details
	
	@FindBy(xpath="(//ion-label[contains(text(),'Facility Info')]//parent::ion-segment-button)")
	private WebElement FacilityDetails_FacilityInfo;
	public WebElement FacilityDetails_FacilityInfo()
	{
		return FacilityDetails_FacilityInfo;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Primary Product')]//following-sibling::ion-select")
	private WebElement FacilityDetails_PrimaryProduct;
	public WebElement FacilityDetails_PrimaryProduct()
	{
		return FacilityDetails_PrimaryProduct;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Primary Sub Product')]//following-sibling::ion-select")
	private WebElement FacilityDetails_PrimarySubProduct;
	public WebElement FacilityDetails_PrimarySubProduct()
	{
		return FacilityDetails_PrimarySubProduct;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Scheme')]//following-sibling::ion-select")
	private WebElement FacilityDetails_Scheme;
	public WebElement FacilityDetails_Scheme()
	{
		return FacilityDetails_Scheme;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Program Code')]//following-sibling::ion-select")
	private WebElement FacilityDetails_ProgramCode;
	public WebElement FacilityDetails_ProgramCode()
	{
		return FacilityDetails_ProgramCode;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Servicing Branch')]//following-sibling::ion-select")
	private WebElement FacilityDetails_ServicingBranch;
	public WebElement FacilityDetails_ServicingBranch()
	{
		return FacilityDetails_ServicingBranch;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Pricing or Interest Indicator')]//following-sibling::ion-select")
	private WebElement FacilityDetails_PricingOrInterestIndicator;
	public WebElement FacilityDetails_PricingOrInterestIndicator()
	{
		return FacilityDetails_PricingOrInterestIndicator;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Currency')]//following-sibling::ion-select")
	private WebElement FacilityDetails_Currency;
	public WebElement FacilityDetails_Currency()
	{
		return FacilityDetails_Currency;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Facility Type')]//following-sibling::ion-select")
	private WebElement FacilityDetails_FacilityType;
	public WebElement FacilityDetails_FacilityType()
	{
		return FacilityDetails_FacilityType;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Loan')]//following-sibling::ion-input//child::input")
	private WebElement FacilityDetails_LoanTenure;
	public WebElement FacilityDetails_LoanTenure()
	{
		return FacilityDetails_LoanTenure;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Loan')]//following-sibling::ion-input")
	private WebElement FacilityDetails_LoanTenure2;
	public WebElement FacilityDetails_LoanTenure2()
	{
		return FacilityDetails_LoanTenure2;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Declared Asset Value')]//parent::div//following-sibling::div//p-inputnumber//input")
	private WebElement FacilityDetails_DeclaredAssetValue;
	public WebElement FacilityDetails_DeclaredAssetValue()
	{
		return FacilityDetails_DeclaredAssetValue;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Declared Down Payment Amount')]//parent::div//following-sibling::div//p-inputnumber//input")
	private WebElement FacilityDetails_DeclaredDownPaymentAmount;
	public WebElement FacilityDetails_DeclaredDownPaymentAmount()
	{
		return FacilityDetails_DeclaredDownPaymentAmount;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Requested Amount')]//parent::div//following-sibling::div//p-inputnumber//input")
	private WebElement FacilityDetails_RequestedAmount;
	public WebElement FacilityDetails_RequestedAmount()
	{
		return FacilityDetails_RequestedAmount;
	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Expiry Date')]//parent::div//following-sibling::p-calendar//child::span//child::input")
	private WebElement FacilityDetails_ExpiryDate;
	public WebElement FacilityDetails_ExpiryDate()
	{
		return FacilityDetails_ExpiryDate;
	
	}
	@FindBy(xpath="//button[contains(text(),'2022')]")
	private WebElement FacilityDetails_Year;
	public WebElement FacilityDetails_Year()
	{
		return FacilityDetails_Year;
	
	}
	@FindBy(xpath="//button[@class='p-ripple p-element p-datepicker-next p-link ng-tns-c230-18']//child::span")
	private WebElement FacilityDetails_YearNext;
	public WebElement FacilityDetails_YearNext()
	{
		return FacilityDetails_YearNext;
	
	}
	@FindBy(xpath="//button[@ng-reflect-text='Save']//child::span")
	private WebElement NewSave;
	public WebElement NewSave()
	{
		return NewSave;
	
	}
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-modal[3]/drawdown-detail-breakup-scr[1]/ion-grid[1]/button[1]")
	private WebElement DrawDown_NewSave;
	public WebElement DrawDown_NewSave()
	{
		return DrawDown_NewSave;
	
	}
	@FindBy(xpath="(//div[@role='alert'])[2]")
	private WebElement makerconfirmmsg;
	public WebElement makerconfirmmsg() 
	{
		return makerconfirmmsg;
	}
	@FindBy(xpath="//span[text()='×']")
	private WebElement successcancel;
	public WebElement successcancel() 
	{
		return successcancel;
	}
	
	@FindBy(xpath="(//button[@ng-reflect-text='Edit']//child::span)[1]")
	private WebElement FacilityDetails_ActionEditIcon;
	public WebElement FacilityDetails_ActionEditIcon()
	{
		return FacilityDetails_ActionEditIcon;
	
	}
	@FindBy(xpath="")
	private WebElement FacilityDetails_;
	public WebElement FacilityDetails()
	{
		return FacilityDetails_;
	
	}
	@FindBy(xpath="//span[contains(text(),'Export')]")
	private WebElement exportIcon;
	public WebElement exportIcon() 
	{
		return exportIcon;
	}
	@FindBy(xpath="//span[contains(text(),'PDF')]")
	private WebElement pdfOption;
	public WebElement pdfOption() 
	{
		return pdfOption;
	}
	@FindBy(xpath="//span[contains(text(),'XLS')]")
	private WebElement xlsOption;
	public WebElement xlsOption() 
	{
		return xlsOption;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement productViewSearchText;
	public WebElement productViewSearchText() 
	{
		return productViewSearchText;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIcon;
	public WebElement searchIcon() 
	{
		return searchIcon;
	}
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-search'])")
	private WebElement productViewSearchText2;
	public WebElement productViewSearchText2() 
	{
		return productViewSearchText2;
	}
	@FindBy(xpath="//digital-form-error[@ng-reflect-msg='VAL.REQUIRED']//child::ion-badge")
	private WebElement RequirdField;
	public WebElement RequirdField() 
	{
		return RequirdField;
	}
	@FindBy(xpath="//span[contains(text(),'Product')]")
	private WebElement FacilityDetails_ListViewProduct;
	public WebElement FacilityDetails_ListViewProduct() 
	{
		return FacilityDetails_ListViewProduct;
	}
	@FindBy(xpath="//span[contains(text(),' Sub product')]")
	private WebElement FacilityDetails_ListViewSubProduct;
	public WebElement FacilityDetails_ListViewSubProduct() 
	{
		return FacilityDetails_ListViewSubProduct;
	}
	@FindBy(xpath="//span[contains(text(),'Tenure')]")
	private WebElement FacilityDetails_ListViewTenure;
	public WebElement FacilityDetails_ListViewTenure() 
	{
		return FacilityDetails_ListViewTenure;
	}
	@FindBy(xpath="//span[contains(text(),'Expiry date')]")
	private WebElement FacilityDetails_ListViewExpiryDate;
	public WebElement FacilityDetails_ListViewExpiryDate() 
	{
		return FacilityDetails_ListViewExpiryDate;
	}
	@FindBy(xpath="//span[contains(text(),'Requested Amount')]")
	private WebElement FacilityDetails_ListViewRequestedAmount;
	public WebElement FacilityDetails_ListViewRequestedAmount() 
	{
		return FacilityDetails_ListViewRequestedAmount;
	}
	@FindBy(xpath="//span[contains(text(),'Status')]")
	private WebElement FacilityDetails_ListViewStatus;
	public WebElement FacilityDetails_ListViewStatus() 
	{
		return FacilityDetails_ListViewStatus;
	}
	@FindBy(xpath="//span[contains(text(),'Export')]")
	private WebElement FacilityDetails_ListViewExport;
	public WebElement FacilityDetails_ListViewExport() 
	{
		return FacilityDetails_ListViewExport;
	}
	@FindBy(xpath="//span[contains(text(),'Showing')]")
	private WebElement FacilityDetails_ListViewShowing;
	public WebElement FacilityDetails_ListViewShowing() 
	{
		return FacilityDetails_ListViewShowing;
	}
	@FindBy(xpath="(//thead[@class='p-datatable-thead']//following-sibling::tbody//child::tr//child::td[7]//child::p-celleditor//span)[1]")
	private WebElement FacilityDetails_ListViewVerifyRequested;
	public WebElement FacilityDetails_ListViewVerifyRequested() 
	{
		return FacilityDetails_ListViewVerifyRequested;
	}
	@FindBy(xpath="(//thead[@class='p-datatable-thead']//following-sibling::tbody//child::tr//child::td[5]//child::p-celleditor//span)[1]")
	private WebElement FacilityDetails_ListViewVerifyTenure;
	public WebElement FacilityDetails_ListViewVerifyTenure() 
	{
		return FacilityDetails_ListViewVerifyTenure;
	}
	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement SubmitButton;
	public WebElement SubmitButton() 
	{
		return SubmitButton;
	}
	@FindBy(xpath = "//ion-label[contains(text(),'on behalf')]")
	private WebElement SubmitAlertButton;
	public WebElement SubmitAlertButton() 
	{
		return SubmitAlertButton;
	}
	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement SubmitFinalButton;
	public WebElement SubmitFinalButton() 
	{
		return SubmitFinalButton;
	}
	
	//CheckerReject And Return
	@FindBy(xpath="//span[contains(text(),'Reject')]")
	private WebElement RejectButton;
	public WebElement RejectButton() 
	{
		return RejectButton;
	}
	@FindBy(xpath="//span[contains(text(),'Return')]")
	private WebElement ReturnButton;
	public WebElement ReturnButton() 
	{
		return ReturnButton;
	}
	@FindBy(xpath="//ion-label[contains(text(),'mistake')]")
	private WebElement Popup_Mistake;
	public WebElement Popup_Mistake() 
	{
		return Popup_Mistake;
	}
	@FindBy(xpath="(//span[contains(text(),'Reject')])[2]")
	private WebElement FinalRejectButton;
	public WebElement FinalRejectButton() 
	{
		return FinalRejectButton;
	}
	@FindBy(xpath="//ion-label[contains(text(),'corrections')]")
	private WebElement Popup_Corrections;
	public WebElement Popup_Corrections() 
	{
		return Popup_Corrections;
	}
	@FindBy(xpath="(//span[contains(text(),'Return')])[2]")
	private WebElement FinalReturnButton;
	public WebElement FinalReturnButton() 
	{
		return FinalReturnButton;
	}
	@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement referenceid;
	public WebElement referenceid() 
	{
		return referenceid;
	}
	
	//DrawDown
	
	@FindBy(xpath="//ion-label[contains(text(),'Drawdown')]/parent::ion-segment-button")
	private WebElement DrawDownTab;
	public WebElement DrawDownTab() 
	{
		return DrawDownTab;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Drawdown details')]/parent::ion-segment-button")
	private WebElement DrawDownDetailsTab;
	public WebElement DrawDownDetailsTab() 
	{
		return DrawDownDetailsTab;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement DrawDown_ActionEdit;
	public WebElement DrawDown_ActionEdit() 
	{
		return DrawDown_ActionEdit;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]/p-tableradiobutton[1]/div[1]/div[2]")
	private WebElement DrawDown_EditRatioButton;
	public WebElement DrawDown_EditRatioButton() 
	{
		return DrawDown_EditRatioButton;
	}
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-modal[2]/drawdown-breakup[1]/p-table[1]/div[1]/div[1]/div[1]/span[1]/ion-button[1]")
	private WebElement DrawDown_AddRow;
	public WebElement DrawDown_AddRow() 
	{
		return DrawDown_AddRow;
	}
	@FindBy(xpath="//tbody/tr[1]/td[6]/ion-button[1]")
	private WebElement DrawDown_DeleteRow;
	public WebElement DrawDown_DeleteRow() 
	{
		return DrawDown_DeleteRow;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]/button[1]")
	private WebElement MailActionEditIcon;
	public WebElement MailActionEditIcon() 
	{
		return MailActionEditIcon;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]/p-tableradiobutton[1]/div[1]/div[2]")
	private WebElement DrawDownDetails_BreakupEditIcon;
	public WebElement DrawDownDetails_BreakupEditIcon() 
	{
		return DrawDownDetails_BreakupEditIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Payment Type')]/following-sibling::ion-select")
	private WebElement DrawDownDetails_PaymentType;
	public WebElement DrawDownDetails_PaymentType() 
	{
		return DrawDownDetails_PaymentType;
	}
	@FindBy(xpath="//ion-label[contains(text(),'End Beneficiary Name')]/following-sibling::ion-select")
	private WebElement DrawDownDetails_EndBeneficiaryName;
	public WebElement DrawDownDetails_EndBeneficiaryName() 
	{
		return DrawDownDetails_EndBeneficiaryName;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Paying Currency')]/following-sibling::ion-select")
	private WebElement DrawDownDetails_PayingCurrency;
	public WebElement DrawDownDetails_PayingCurrency() 
	{
		return DrawDownDetails_PayingCurrency;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Payment Mode')]/following-sibling::ion-select")
	private WebElement DrawDownDetails_PaymentMode;
	public WebElement DrawDownDetails_PaymentMode() 
	{
		return DrawDownDetails_PaymentMode;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Disbursement')]/following-sibling::ion-select")
	private WebElement DrawDownDetails_DisbursementACNo;
	public WebElement DrawDownDetails_DisbursementACNo() 
	{
		return DrawDownDetails_DisbursementACNo;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Original Amount')]/following-sibling::ion-input/input")
	private WebElement DrawDownDetails_OriginalAmount;
	public WebElement DrawDownDetails_OriginalAmount() 
	{
		return DrawDownDetails_OriginalAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Amount to be Paid')]/following-sibling::ion-input/input")
	private WebElement DrawDownDetails_AmountToBePaid;
	public WebElement DrawDownDetails_AmountToBePaid() 
	{
		return DrawDownDetails_AmountToBePaid;
	}
	@FindBy(xpath="//div[@id='toast-container']/div[1]")
	private WebElement ProductCheckerid;
	public WebElement ProductCheckerid() 
	{
		return ProductCheckerid;
	}
	
	//Offer Decision
	
	
	@FindBy(xpath="//span[contains(text(),'Approve')]")
	private WebElement ApprovalButton;
	public WebElement ApprovalButton() 
	{
		return ApprovalButton;
	}
	@FindBy(xpath="//ion-label[contains(text(),'on behalf')]")
	private WebElement Popup_ApproveMsg;
	public WebElement Popup_ApproveMsg() 
	{
		return Popup_ApproveMsg;
	}
	@FindBy(xpath="(//span[contains(text(),'Approve')])[2]")
	private WebElement FinalApproveButton;
	public WebElement FinalApproveButton() 
	{
		return FinalApproveButton;
	}
	@FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input") 
    private WebElement ApplicationDetailsInboxView_SearchText;
    public WebElement ApplicationDetailsInboxView_SearchText() {
        return ApplicationDetailsInboxView_SearchText;
    }

}
