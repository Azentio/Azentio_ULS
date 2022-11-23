package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class ReportMasterObj {
	WebDriver driver;

	public ReportMasterObj(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-label[contains(text(),'Config Manager')]")
	private WebElement ConfigManager;
	public WebElement ConfigManager()
	{
		return ConfigManager;
	}
	@FindBy(xpath="//ion-label[text()='Report Master']//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement ReportMasterEditIcon;
	public WebElement ReportMasterEditIcon()
	{
		return ReportMasterEditIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Report Master')]//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement ReportMasterListViewIcon;
	public WebElement ReportMasterListViewIcon()
	{
		return ReportMasterListViewIcon; 
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Add'])[2]")
	private WebElement ReportParameterAddIcon;
	public WebElement ReportParameterAddIcon()
	{
		return ReportParameterAddIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Param 1 Description 1')]//following-sibling::ion-input//child::input")
	private WebElement Param1Description1;
	public WebElement Param1Description1()
	{
		return Param1Description1;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Param 1 Description 2')]//following-sibling::ion-input//child::input")
	private WebElement Param1Description2;
	public WebElement Param1Description2()
	{
		return Param1Description2;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Param 1 Description 3')]//following-sibling::ion-input//child::input")
	private WebElement Param1Description3;
	public WebElement Param1Description3()
	{
		return Param1Description3;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Param 2 Description 2')]//following-sibling::ion-input//child::input")
	private WebElement Param2Description2;
	public WebElement Param2Description2()
	{
		return Param2Description2;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Param 2 Description 3')]//following-sibling::ion-input//child::input")
	private WebElement Param2Description3;
	public WebElement Param2Description3()
	{
		return Param2Description3;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Group Description')]//following-sibling::ion-input//child::input")
	private WebElement GroupDescription;
	public WebElement GroupDescription()
	{
		return GroupDescription;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Template')]//following-sibling::ion-select")
	private WebElement Template;
	public WebElement Template()
	{
		return Template;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Is Mandatory')]//following-sibling::ion-select")
	private WebElement IsMandatory;
	public WebElement IsMandatory()
	{
		return IsMandatory;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Parameter 1')]//following-sibling::ion-input//child::input")
	private WebElement Parameter1;
	public WebElement Parameter1()
	{
		return Parameter1;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Group Name')]//following-sibling::ion-input//child::input")
	private WebElement GroupName;
	public WebElement GroupName()
	{
		return GroupName;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Min Parameters Required')]//following-sibling::ion-input//child::input")
	private WebElement MinParametersRequired;
	public WebElement MinParametersRequired()
	{
		return MinParametersRequired;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Parameter 2')]//following-sibling::ion-input//child::input")
	private WebElement Parameter2;
	public WebElement Parameter2()
	{
		return Parameter2;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Sequence No')]//following-sibling::ion-input//child::input")
	private WebElement SequenceNo;
	public WebElement SequenceNo()
	{
		return SequenceNo;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Date Format')]//following-sibling::ion-input//child::input")
	private WebElement DateFormat;
	public WebElement DateFormat()
	{
		return DateFormat;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Nullable Values')]//following-sibling::ion-input//child::input")
	private WebElement NullableValues;
	public WebElement NullableValues()
	{
		return NullableValues;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Save'])[2]")
	private WebElement NewSave;
	public WebElement NewSave()
	{
		return NewSave;
	}
	@FindBy(xpath="(//div[@role='alert'])[2]")
	private WebElement makerconfirmmsg;
	public WebElement makerconfirmmsg() 
	{
		return makerconfirmmsg;
	}
	@FindBy(xpath="//button[@aria-label='Close']//following-sibling::div[contains(text(),'Success')]")
	private WebElement makerconfirmmsg1;
	public WebElement makerconfirmmsg1() 
	{
		return makerconfirmmsg1;
	}
	@FindBy(xpath="//span[text()='×']")
	private WebElement successcancel;
	public WebElement successcancel() 
	{
		return successcancel;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea")
	private WebElement popupremark;
	public WebElement popupremark() 
	{
		return popupremark;
	}
	@FindBy(xpath="(//button[@ng-reflect-label='Cancel'])[2]")
	private WebElement popupcancel;
	public WebElement popupcancel() 
	{
		return popupcancel;
	}
	@FindBy(xpath="(//kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/p-celleditor[1]/span)[2]")
	private WebElement ReferenceId;
	public WebElement ReferenceId() 
	{
		return ReferenceId;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIcon;
	public WebElement searchIcon() 
	{
		return searchIcon;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement productViewSearchText;
	public WebElement productViewSearchText() 
	{
		return productViewSearchText;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement BackArrow;
	public WebElement BackArrow()
	{
		return BackArrow;
	}
	@FindBy(xpath="//ion-icon[@aria-label='mail unread outline']")
	private WebElement mailicon;
	public WebElement mailicon() 
	{
		return mailicon;
	}
	@FindBy(xpath="//button/span[contains(text(),'Submit')]")
	private WebElement submit;
	public WebElement submit() 
	{
		return submit;
	}
	@FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
	private WebElement popupsubmit;
	public WebElement popupsubmit() 
	{
		return popupsubmit;
	}
	@FindBy(xpath="//div[@id='toast-container']/div[1]")
	private WebElement ProductCheckerid;
	public WebElement ProductCheckerid() 
	{
		return ProductCheckerid;
	}
	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
	private WebElement inboxiconChecker;
	public WebElement inboxiconChecker() 
	{
		return inboxiconChecker;
	}
	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	private WebElement CheckerApprove;
	public WebElement CheckerApprove()
	{
		return CheckerApprove;
	}
	@FindBy(xpath = "//input[@mode='ios']") 
    private WebElement assetAutoViewSearchText;
    public WebElement assetAutoViewSearchText() {
        return assetAutoViewSearchText;
    }
	@FindBy(xpath = "(//span[contains(text(),'Approve')])[2]")
	private WebElement popupapprove;
	public WebElement popupapprove() 
	{
		return popupapprove;
	}
	@FindBy(xpath = "//div[contains(text(),' Record ')]")
	private WebElement recordMsgChecker;
	public WebElement recordMsgChecker() 
	{
		return recordMsgChecker;
	}
	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	private WebElement CheckerReject;
	public WebElement CheckerReject() 
	{
		return CheckerReject;
	}
	@FindBy(xpath = "(//span[contains(text(),'Reject')])[2]")
	private WebElement popupreject;
	public WebElement popupreject() 
	{
		return popupreject;
	}
	@FindBy(xpath = "//span[contains(text(),'Return')]")
	private WebElement CheckerReturn;
	public WebElement CheckerReturn()
	{
		return CheckerReturn;
	}
	@FindBy(xpath = "(//span[contains(text(),'Return')])[2]")
	private WebElement popupReturn;
	public WebElement popupReturn() 
	{
		return popupReturn;
	}
	@FindBy(xpath="//span[text()=' Inbox ']//parent::div//child::span[2]/input")
	private WebElement searchsentkeys;
	public WebElement searchsentkeys() 
	{
		return searchsentkeys;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement AddIcon;
	public WebElement AddIcon() 
	{
		return AddIcon;
	}
	@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement referenceid;
	public WebElement referenceid() 
	{
		return referenceid;
	}
	@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement searchiconreferenceid;
	public WebElement searchiconreferenceid() 
	{
		return searchiconreferenceid;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement inboxediticon;
	public WebElement inboxediticon() 
	{
		return inboxediticon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Report Group Master')]")
	private WebElement ReportGroupMaster;
	public WebElement ReportGroupMaster() 
	{
		return ReportGroupMaster;
	}
	
	// angle
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-up'])[1]")
    private WebElement AvailableAngleup;
	public WebElement AvailableAngleup()
	{
		return AvailableAngleup;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-up'])[2]")
    private WebElement SelectedAngleup;
	public WebElement SelectedAngleup()
	{
		return SelectedAngleup;
	}
	
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-up'])[1]")
    private WebElement AvailableDoubleAngleup;
	public WebElement AvailableDoubleAngleup()
	{
		return AvailableDoubleAngleup;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-up'])[2]")
    private WebElement SelectedDoubleAngleup;
	public WebElement SelectedDoubleAngleup()
	{
		return SelectedDoubleAngleup;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-down'])[1]")
    private WebElement AvailableAngledown;
	public WebElement AvailableAngledown()
	{
		return AvailableAngledown;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-down'])[2]")
    private WebElement SelectedAngledown;
	public WebElement SelectedAngledown()
	{
		return SelectedAngledown;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-down'])[1]")
    private WebElement AvailableDoubleAngledown;
	public WebElement AvailableDoubleAngledown()
	{
		return AvailableDoubleAngledown;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-down'])[2]")
    private WebElement SelectedDoubleAngledown;
	public WebElement SelectedDoubleAngledown()
	{
		return SelectedDoubleAngledown;
	}
	@FindBy(xpath="//span[@class='p-button-icon pi pi-angle-right']")
	private WebElement AngleRight;
    public WebElement AngleRight()
	{
		return AngleRight;
	}
    @FindBy(xpath="//span[@class='p-button-icon pi pi-angle-left']")
	private WebElement AngleLeft;
    public WebElement AngleLeft()
	{
		return AngleLeft;
	}
    @FindBy(xpath="//span[@class='p-button-icon pi pi-angle-double-right']")
	private WebElement AngleDoubleRight;
    public WebElement AngleDoubleRight()
	{
		return AngleDoubleRight;
	}
    @FindBy(xpath="//span[@class='p-button-icon pi pi-angle-double-left']")
   	private WebElement AngleDoubleLeft;
    public WebElement AngleDoubleLeft()
   	{
   		return AngleDoubleLeft;
   	}
	@FindBy(xpath="//div[contains(text(),'GST')]")
    private WebElement GST;
	public WebElement GST()
	{
		return GST;
	}
	@FindBy(xpath="//div[contains(text(),'TDS')]")
    private WebElement TDS;
	public WebElement TDS()
	{
		return TDS;
	}
	@FindBy(xpath="//div[contains(text(),'VAT')]")
    private WebElement VAT;
	public WebElement VAT()
	{
		return VAT;
	}
	@FindBy(xpath="//div[contains(text(),'Service Tax')]")
    private WebElement ServiceTax;
	public WebElement ServiceTax()
	{
		return ServiceTax;
	}
	
	//Priyanka Report Master Obj
	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement reportMaster_ConfigManager;

	public WebElement reportMaster_ConfigManager() {
		return reportMaster_ConfigManager;
	}

	@FindBy(xpath = "(//li[3]//ion-icon[1])[1]")
	private WebElement reportMasterConfigurations;

	public WebElement reportMasterConfigurations() {
		return reportMasterConfigurations;

	}

	@FindBy(xpath = "//ion-label[contains(text(),'Report Master')]/following-sibling::ion-buttons/ion-button[1]")
	private WebElement reportMaster_WorkInProgressRecordsButton;

	public WebElement reportMaster_WorkInProgressRecordsButton() {
		return reportMaster_WorkInProgressRecordsButton;

	}

	@FindBy(xpath = "//ion-label[contains(text(),'Report Master')]/following-sibling::ion-buttons/ion-button[2]")
	private WebElement reportMaster_CheckBOX;

	public WebElement reportMaster_CheckBOX() {
		return reportMaster_CheckBOX;

	}


	//Search Icon
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement reportMaster_SearchIcon;

	public WebElement reportMaster_SearchIcon() {
		return reportMaster_SearchIcon;
	}
	// search input field
		@FindBy(xpath = "//div/span/input")
		private WebElement reportMaster_SearchInputField;

		public WebElement reportMaster_SearchInputField() {
			return reportMaster_SearchInputField;
		}

		// search close button
		@FindBy(xpath = "//div/span/i")
		private WebElement reportMaster_SearchCloseButton;

		public WebElement reportMaster_SearchCloseButton() {
			return reportMaster_SearchCloseButton;
		}

		// list view first field of Report Name
		@FindBy(xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]/span[1]")
		private WebElement reportMaster_ListViewFirstField_ReportName;

		public WebElement reportMaster_ListViewFirstField_ReportName() {
			return reportMaster_ListViewFirstField_ReportName;
		}

		// list view icon
		@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]/span[1]")
		private WebElement reportMaster_ListView_ViewIcon;

		public WebElement reportMaster_ListView_ViewIcon() {
			return reportMaster_ListView_ViewIcon;
		}

		// Report Group Master Segment button
		@FindBy(xpath = "//ion-segment-button[@id='seg2']")
		private WebElement reportGroupMaster_SegmentButton;

		public WebElement reportGroupMaster_SegmentButton() {
			return reportGroupMaster_SegmentButton;
		}
		
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement reportMaster_addButton;

	public WebElement reportMaster_addButton() {
		return reportMaster_addButton;

	}

//		report parameter details add button 

	@FindBy(xpath = "(//button[@ng-reflect-text='Add'])[2]")
	private WebElement reportMaster_addButton2;

	public WebElement reportMaster_addButton2() {
		return reportMaster_addButton2;

	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/button[1]/span[1]")
	private WebElement reportMaster_BackButton;

	public WebElement reportMaster_BackButton() {
		return reportMaster_BackButton;

	}

//		report group master 

	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement reportMaster_ReportGroupMasterSegmentButton;

	public WebElement reportMaster_ReportGroupMasterSegmentButton() {
		return reportMaster_ReportGroupMasterSegmentButton;

	}
	
	//Group Name
	@FindBy(xpath = "//ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement reportMaster_GroupName;

	public WebElement reportMaster_GroupName() {
		return reportMaster_GroupName;
	}
	
	// Group Description
	@FindBy(xpath = "//ion-col[3]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement reportMaster_GroupDescription;

	public WebElement reportMaster_GroupDescription() {
		return reportMaster_GroupDescription;
	}
	
	
	// Min Parameters Required
	@FindBy(xpath = "//ion-col[4]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement reportMaster_MinParametersRequired;

	public WebElement reportMaster_MinParametersRequired() {
		return reportMaster_MinParametersRequired;
	}
	
	// Picklist
	@FindBy(xpath = "//div[1]/ion-item[1]/p-picklist[1]/div[1]/div[3]/button[2]/span[1]")
	private WebElement reportMaster_Picklist;

	public WebElement reportMaster_Picklist() {
		return reportMaster_Picklist;
	}
	// Save Button

	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement reportMaster_SaveButton;

	public WebElement reportMaster_SaveButton() {
		return reportMaster_SaveButton;

	}
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement productMaster_Product_SaveConfirmationMessage;

	public WebElement productMaster_Product_SaveConfirmationMessage() {
		return productMaster_Product_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement productMaster_Product_SaveConfirmationMessageCloseButton;

	public WebElement productMaster_Product_SaveConfirmationMessageCloseButton() {
		return productMaster_Product_SaveConfirmationMessageCloseButton;
	}
	//Inbox
		@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
		private WebElement productMaster_Product_Inbox;
		public WebElement productMaster_Product_Inbox() {
			return productMaster_Product_Inbox;
		}
		// SearchRecord from inbox
		@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
		private WebElement IncentiveMaster_Inbox_SearchIcon;

		public WebElement IncentiveMaster_Inbox_SearchIcon() {
			return IncentiveMaster_Inbox_SearchIcon;
		}
		//ReferanceId
		@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
		private WebElement productMaster_Product_ReferanceId;
		public WebElement productMaster_Product_ReferanceId() {
			return productMaster_Product_ReferanceId;
		}

		//Action //tbody/tr[1]/td[1]/span[1]/button[1]/span[1]
		@FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]")
		private WebElement productMaster_Product_Action;
		public WebElement productMaster_Product_Action() {
			return productMaster_Product_Action;
		}

		//MakerSubmit
		@FindBy(xpath = "//button/span[contains(text(),'Submit')]")
		private WebElement productMaster_Product_Submit;
		public WebElement productMaster_Product_Submit() {
			return productMaster_Product_Submit;
		}
		
		//SubmitRemark
		@FindBy(xpath = "//ion-label[contains(text(),'ok')]")
		private WebElement productMaster_Product_SubmitRemark;
		public WebElement productMaster_Product_SubmitRemark() {
			return productMaster_Product_SubmitRemark;
		}

		//FinalSubmit
		@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
		private WebElement productMaster_Product_FinalSubmit;
		public WebElement productMaster_Product_FinalSubmit() {
				return productMaster_Product_FinalSubmit;
		}
		@FindBy(xpath = "//div[@id='toast-container']/div[1]")
		private WebElement productMaster_Product_Checker_Id;

		public WebElement productMaster_Product_Checker_Id() {
			return productMaster_Product_Checker_Id;
		}
		@FindBy(xpath = "//body/div/div/div/button")
		private WebElement productMaster_Product_ConfirmationMessageCloseButton;

		public WebElement productMaster_Product_ConfirmationMessageCloseButton() {
			return productMaster_Product_ConfirmationMessageCloseButton;
		}
		// Profile
		@FindBy(xpath = "//ion-item[@ng-reflect-text='Profile']")
		private WebElement productMaster_Product_Profile;

		public WebElement productMaster_Product_Profile() {
			return productMaster_Product_Profile;
		}
		//Logout
		@FindBy(xpath = "//app-user-profile-pop[1]/ion-list[1]/ion-item[2]/ul[1]/li[3]")
		private WebElement productMaster_Product_Logout;
		public WebElement productMaster_Product_Logout() {
				return productMaster_Product_Logout;
		}
		//Checker_Reject
		@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
		private WebElement productMaster_Product_Checker_Reject;
		public WebElement productMaster_Product_Checker_Reject() {
			return productMaster_Product_Checker_Reject;
		}
		
		//Checker_RejectRemark
		@FindBy(xpath = "//ion-label[contains(text(),'cancel')]")
		private WebElement productMaster_Product_Checker_RejectRemark;
		public WebElement productMaster_Product_Checker_RejectRemark() {
			return productMaster_Product_Checker_RejectRemark;
		}	
		
		//Checker_RejectAlert
		@FindBy(xpath = "(//span[contains(text(),'Reject')])[2]")
		private WebElement productMaster_Product_Checker_RejectAlert;
		public WebElement productMaster_Product_Checker_RejectAlert() {
			return productMaster_Product_Checker_RejectAlert;
		}	

		//Checker_Return
		@FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]")
		private WebElement productMaster_Product_Checker_Return;
		public WebElement productMaster_Product_Checker_Return() {
			return productMaster_Product_Checker_Return;
		}
		//Checker_ReturnRemark
		@FindBy(xpath = "//ion-label[contains(text(),'return')]")
		private WebElement productMaster_Product_Checker_ReturnRemark;
		public WebElement productMaster_Product_Checker_ReturnRemark() {
			return productMaster_Product_Checker_ReturnRemark;
		}
		//Checker_ReturnAlert
		@FindBy(xpath = "(//span[contains(text(),'Return')])[2]")
		private WebElement productMaster_Product_Checker_ReturnAlert;
		public WebElement productMaster_Product_Checker_ReturnAlert() {
			return productMaster_Product_Checker_ReturnAlert;
		}
		//Checker_Approve
		@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
		private WebElement productMaster_Product_Checker_Approve;
		public WebElement productMaster_Product_Checker_Approve() {
			return productMaster_Product_Checker_Approve;
		}
		//Checker_ApproveRemark 
		@FindBy(xpath = "//ion-label[contains(text(),'approve')]")
		private WebElement productMaster_Product_Checker_ApproveRemark;
		public WebElement productMaster_Product_Checker_ApproveRemark() {
			return productMaster_Product_Checker_ApproveRemark;
		}
		
		//productMaster_Checker_RemarkInput
			@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
			private WebElement productMaster_Checker_RemarkInput;
			public WebElement productMaster_Checker_RemarkInput() {
				return productMaster_Checker_RemarkInput;
			}

		//Checker_ApproveAlert
		@FindBy(xpath = "(//span[contains(text(),'Approve')])[2]")
		private WebElement productMaster_Product_Checker_ApproveAlert;
		public WebElement productMaster_Product_Checker_ApproveAlert() {
			return productMaster_Product_Checker_ApproveAlert;
		}






}
