package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportMasterObj {
	WebDriver driver;

	public ReportMasterObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement reportMasterConfigMenu;

	public WebElement reportMasterConfigMenu() {
		return reportMasterConfigMenu;
	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement reportMaster_Maker_MenuToggle;

	public WebElement reportMaster_Maker_MenuToggle() {
		return reportMaster_Maker_MenuToggle;
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
	private WebElement reportMaster_ApprovedRecordsButton;

	public WebElement reportMaster_ApprovedRecordsButton() {
		return reportMaster_ApprovedRecordsButton;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement reportMaster_addButton;

	public WebElement reportMaster_addButton() {
		return reportMaster_addButton;
	}

//	report parameter details add button
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

//	report group master
	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement reportMaster_ReportGroupMasterSegmentButton;

	public WebElement reportMaster_ReportGroupMasterSegmentButton() {
		return reportMaster_ReportGroupMasterSegmentButton;
	}

	// Save Button
	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement reportMaster_SaveButton;

	public WebElement reportMaster_SaveButton() {
		return reportMaster_SaveButton;
	}

	// Group Name
//	@FindBy(xpath = "//ion-label[contains(text(),'Group Name')]/following-sibling::ion-input/input")
	@FindBy(xpath = "//span[contains(text(),'Group Name')]")
	private WebElement reportMaster_GroupName;

	public WebElement reportMaster_GroupName() {
		return reportMaster_GroupName;
	}

	// Special Character validation message
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement reportMaster_SpecialCharacterValidationMessage;

	public WebElement reportMaster_SpecialCharacterValidationMessage() {
		return reportMaster_SpecialCharacterValidationMessage;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement reportMaster_SearchButton;

	public WebElement reportMaster_SearchButton() {
		return reportMaster_SearchButton;
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
	
	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement reportMaster_NoDataFoundInSearch;

	public WebElement reportMaster_NoDataFoundInSearch() {
		return reportMaster_NoDataFoundInSearch;
	}

	// export
	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement reportMaster_Export;

	public WebElement reportMaster_Export() {
		return reportMaster_Export;
	}

	// pdf
	@FindBy(xpath = " //li[@aria-label='PDF']") // PDF
	private WebElement reportMaster_PdfFile;

	public WebElement reportMaster_PdfFile() {
		return reportMaster_PdfFile;
	}

	// xls
	@FindBy(xpath = " //li[@aria-label='XLS']") // XLS
	private WebElement reportMaster_XlsFile;

	public WebElement reportMaster_XlsFile() {
		return reportMaster_XlsFile;
	}
	
	// List View GroupHeader ID field
	@FindBy(xpath = "//span[contains(text(),'ID')]")
	private WebElement reportMaster_ListViewGroupHeaderIDField;

	public WebElement reportMaster_ListViewGroupHeaderIDField() {
		return reportMaster_ListViewGroupHeaderIDField;
	}

	// List View GroupName field
	@FindBy(xpath = "//span[contains(text(),'Group Name')]")
	private WebElement reportMaster_ListViewGroupNameField;

	public WebElement reportMaster_ListViewGroupNameField() {
		return reportMaster_ListViewGroupNameField;
	}

	// List View Description field
	@FindBy(xpath = "//span[contains(text(),'Description')]")
	private WebElement reportMaster_ListViewDescriptionField;

	public WebElement reportMaster_ListViewDescriptionField() {
		return reportMaster_ListViewDescriptionField;
	}

	// List View Status
	@FindBy(xpath = "//span[contains(text(),'Status')]")
	private WebElement reportMaster_ListViewStatusField;

	public WebElement reportMaster_ListViewStatusField() {
		return reportMaster_ListViewStatusField;
	}
	
	
	
	
	
	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[8]/img[1]")
	private WebElement reportMaster_Profile;

	public WebElement reportMaster_Profile() {
		return reportMaster_Profile;
	}

	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement reportMaster_LogoutUser;

	public WebElement reportMaster_LogoutUser() {
		return reportMaster_LogoutUser;
	}

	
	
	
	
	
	
////////////////////////////////////////////////////Below object should be removed	
	
	
	

//	Select xpath
	@FindBy(xpath = "//ion-label[contains(text(),'Select')]")
	private WebElement covenantMaster_SelectLabel;

	public WebElement covenantMaster_SelectLabel() {
		return covenantMaster_SelectLabel;
	}

//	description
	@FindBy(xpath = "//ion-label[contains(text(),' Description ')]/following::ion-input[1]/input")
	private WebElement covenantMaster_Description;

	public WebElement covenantMaster_Description() {
		return covenantMaster_Description;
	}

//	frequency
	@FindBy(xpath = "//ion-label[contains(text(),'Frequency')]/following-sibling::ion-select")
	private WebElement covenantMaster_Frequency;

	public WebElement covenantMaster_Frequency() {
		return covenantMaster_Frequency;
	}

//	editable toggle
	@FindBy(xpath = "//ion-label[contains(text(),'Editable')]/parent::div/following-sibling::ion-item/ion-toggle")
	private WebElement covenantMaster_EditableToggle;

	public WebElement covenantMaster_EditableToggle() {
		return covenantMaster_EditableToggle;
	}

////	editable toggle on
////	@FindBy(xpath = "//ion-label[contains(text(),'Editable')]/parent::div/following-sibling::ion-item/ion-toggle/input")
//	@FindBy(xpath = "/ion-col[3]/digital-radio-button[1]/ion-item[1]/ion-toggle[1]/input")
//	private WebElement covenantMaster_EditableToggleON;
//	
//	public WebElement covenantMaster_EditableToggleON() {
//		return covenantMaster_EditableToggleON;
//	}

//	Actionable toggle
	@FindBy(xpath = "//ion-label[contains(text(),'Actionable')]/parent::div/following-sibling::ion-item/ion-toggle")
	private WebElement covenantMaster_ActionableToggle;

	public WebElement covenantMaster_ActionableToggle() {
		return covenantMaster_ActionableToggle;
	}

////	Actionable toggle on
//	@FindBy(xpath = "//ion-label[contains(text(),'Actionable')]/parent::div/following-sibling::ion-item/ion-toggle/input")
//	private WebElement covenantMaster_ActionableToggleON;
//	
//	public WebElement covenantMaster_ActionableToggleON() {
//		return covenantMaster_ActionableToggleON;
//	}

//	Waiver allowed toggle
	@FindBy(xpath = "//ion-label[contains(text(),'Waiver Allowed')]/parent::div/following-sibling::ion-item/ion-toggle")
	private WebElement covenantMaster_WaiverAllowedToggle;

	public WebElement covenantMaster_WaiverAllowedToggle() {
		return covenantMaster_WaiverAllowedToggle;
	}

//	Status toggle
	@FindBy(xpath = "//ion-label[contains(text(),'Status')]/parent::div/following-sibling::ion-item/ion-toggle")
	private WebElement covenantMaster_StatusToggle;

	public WebElement covenantMaster_StatusToggle() {
		return covenantMaster_StatusToggle;
	}

	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement covenantMaster_SaveConfirmationMessage;

	public WebElement covenantMaster_SaveConfirmationMessage() {
		return covenantMaster_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement covenantMaster_SaveConfirmationMessageCloseButton;

	public WebElement covenantMaster_SaveConfirmationMessageCloseButton() {
		return covenantMaster_SaveConfirmationMessageCloseButton;
	}

//	// First Record Edit button
//	@FindBy(xpath = "//tbody[1]/tr[1]/td[1]/span[1]/button[1]/span[1]")
//	private WebElement assetCollateralType_FirstRecordEditButton;
//
//	public WebElement assetCollateralType_FirstRecordEditButton() {
//		return assetCollateralType_FirstRecordEditButton;
//	}

	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement covenantMaster_Inbox;

	public WebElement covenantMaster_Inbox() {
		return covenantMaster_Inbox;
	}

	// inbox new created record
//	@FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]")
	@FindBy(xpath = "//td[contains(text(),'COVENANT_MST')]/../td[1]/button/span[1]")
	private WebElement covenantMaster_NewSavedRecord;

	public WebElement covenantMaster_NewSavedRecord() {
		return covenantMaster_NewSavedRecord;
	}

	// new record reference id
//	@FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]")
	@FindBy(xpath = "//td[contains(text(),'COVENANT_MST')]/../td[2]/span")
	private WebElement covenantMaster_NewRecordReferenceID;

	public WebElement covenantMaster_NewRecordReferenceID() {
		return covenantMaster_NewRecordReferenceID;
	}

	// MakerRemarks
	@FindBy(xpath = "//ion-textarea[1]//textarea[1]")
	private WebElement covenantMaster_MakerSubmitRemark;

	public WebElement covenantMaster_MakerSubmitRemark() {
		return covenantMaster_MakerSubmitRemark;
	}

	// Submit
	@FindBy(xpath = "//button/span[contains(text(),'Submit')]")
	private WebElement covenantMaster_Submit;

	public WebElement covenantMaster_Submit() {
		return covenantMaster_Submit;
	}

	// FinalSubmit
	@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
	private WebElement covenantMaster_FinalSubmit;

	public WebElement covenantMaster_FinalSubmit() {
		return covenantMaster_FinalSubmit;
	}

	// Confirmation Message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement covenantMaster_ConfirmationMessage;

	public WebElement covenantMaster_ConfirmationMessage() {
		return covenantMaster_ConfirmationMessage;
	}

	// confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement covenantMaster_ConfirmationMessageCloseButton;

	public WebElement covenantMaster_ConfirmationMessageCloseButton() {
		return covenantMaster_ConfirmationMessageCloseButton;
	}

	// Menu toggle
	@FindBy(xpath = "//ion-menu-toggle/ion-button")
	private WebElement covenantMaster_Checker_MenuToggle;

	public WebElement covenantMaster_Checker_MenuToggle() {
		return covenantMaster_Checker_MenuToggle;
	}

	@FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']/ion-icon[1]")
	private WebElement covenantMaster_Checker_Inbox;

	public WebElement covenantMaster_Checker_Inbox() {
		return covenantMaster_Checker_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement covenantMaster_Checker_SearchInbox;

	public WebElement covenantMaster_Checker_SearchInbox() {
		return covenantMaster_Checker_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement covenantMaster_Checker_SearchInboxInputField;

	public WebElement covenantMaster_Checker_SearchInboxInputField() {
		return covenantMaster_Checker_SearchInboxInputField;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement covenantMaster_Checker_SearchInboxCloseButton;

	public WebElement covenantMaster_Checker_SearchInboxCloseButton() {
		return covenantMaster_Checker_SearchInboxCloseButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	private WebElement covenantMaster_Checker_Approve;

	public WebElement covenantMaster_Checker_Approve() {
		return covenantMaster_Checker_Approve;
	}

//	// approve remark mandatory
//	@FindBy(xpath = "//ion-label[contains(text(),' Please Enter Remarks ')]/ion-text")
//	private WebElement covenantMaster_Checker_CheckerRemarkMandatory;
//
//	public WebElement covenantMaster_Checker_CheckerRemarkMandatory() {
//		return covenantMaster_Checker_CheckerRemarkMandatory;
//	}

	// approve remark
	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement covenantMaster_Checker_CheckerApproveRemark;

	public WebElement covenantMaster_Checker_CheckerApproveRemark() {
		return covenantMaster_Checker_CheckerApproveRemark;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement covenantMaster_Checker_CheckerApproveButton;

	public WebElement covenantMaster_Checker_CheckerApproveButton() {
		return covenantMaster_Checker_CheckerApproveButton;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement covenantMaster_Checker_CheckerRejectRemark;

	public WebElement covenantMaster_Checker_CheckerRejectRemark() {
		return covenantMaster_Checker_CheckerRejectRemark;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement covenantMaster_Checker_CheckerReturnRemark;

	public WebElement covenantMaster_Checker_CheckerReturnRemark() {
		return covenantMaster_Checker_CheckerReturnRemark;
	}

//	@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	private WebElement covenantMaster_Checker_Reject;

	public WebElement covenantMaster_Checker_Reject() {
		return covenantMaster_Checker_Reject;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement covenantMaster_Checker_CheckerRejectButton;

	public WebElement covenantMaster_Checker_CheckerRejectButton() {
		return covenantMaster_Checker_CheckerRejectButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Return')]")
	private WebElement covenantMaster_Checker_Return;

	public WebElement covenantMaster_Checker_Return() {
		return covenantMaster_Checker_Return;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement covenantMaster_Checker_CheckerReturnButton;

	public WebElement covenantMaster_Checker_CheckerReturnButton() {
		return covenantMaster_Checker_CheckerReturnButton;
	}

	// Approve confirmation message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement covenantMaster_Checker_ApproveConfirmationMessage;

	public WebElement covenantMaster_Checker_ApproveConfirmationMessage() {
		return covenantMaster_Checker_ApproveConfirmationMessage;
	}

	// Submit confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement covenantMaster_Checker_ApproveConfirmationMessageCloseButton;

	public WebElement covenantMaster_Checker_ApproveConfirmationMessageCloseButton() {
		return covenantMaster_Checker_ApproveConfirmationMessageCloseButton;
	}

	

	// Footer for paginator
	@FindBy(xpath = "//p-paginator")
	private WebElement covenantMaster_FooterForPaginator;

	public WebElement covenantMaster_FooterForPaginator() {
		return covenantMaster_FooterForPaginator;
	}

	// Blank field validation for mandatory field covenant type
	@FindBy(xpath = "//ion-label[contains(text(),' Covenant Type ')]/span/ancestor::digital-select-layout/following-sibling::div/descendant::ion-badge")
	private WebElement covenantMaster_BlankFieldValdationForCovenantType;

	public WebElement covenantMaster_BlankFieldValdationForCovenantType() {
		return covenantMaster_BlankFieldValdationForCovenantType;
	}

	// Blank field validation for description
	@FindBy(xpath = "//ion-label[contains(text(),'Description')]/span/ancestor::digital-text-box/following-sibling::div/descendant::ion-badge")
	private WebElement covenantMaster_BlankFieldValdationForDescription;

	public WebElement covenantMaster_BlankFieldValdationForDescription() {
		return covenantMaster_BlankFieldValdationForDescription;
	}

	// invalid data type validation for description field
	@FindBy(xpath = "//ion-label[contains(text(),'Description')]/span/ancestor::digital-text-box/following-sibling::div/descendant::ion-badge")
	private WebElement covenantMaster_InvalidDataTypeForDescriptionField;

	public WebElement covenantMaster_InvalidDataTypeForDescriptionField() {
		return covenantMaster_InvalidDataTypeForDescriptionField;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='View Summary']")
	private WebElement covenantMaster_ViewSummaryButton;

	public WebElement covenantMaster_ViewSummaryButton() {
		return covenantMaster_ViewSummaryButton;
	}

	@FindBy(xpath = "(//table//tr[1]//td[2])[3]")
	private WebElement covenantMaster_UserID;

	public WebElement covenantMaster_UserID() {
		return covenantMaster_UserID;
	}

	@FindBy(xpath = "(//table//tr[1]//td[3])[3]")
	private WebElement covenantMaster_StageCode;

	public WebElement covenantMaster_StageCode() {
		return covenantMaster_StageCode;
	}

	@FindBy(xpath = "(//table//tr[1]//td[4])[3]")
	private WebElement covenantMaster_Status;

	public WebElement covenantMaster_Status() {
		return covenantMaster_Status;
	}

	@FindBy(xpath = "(//table//tr[1]//td[5])[3]")
	private WebElement covenantMaster_StartTime;

	public WebElement covenantMaster_StartTime() {
		return covenantMaster_StartTime;
	}

	@FindBy(xpath = "(//table//tr[1]//td[6])[3]")
	private WebElement covenantMaster_EndTime;

	public WebElement covenantMaster_EndTime() {
		return covenantMaster_EndTime;
	}

	@FindBy(xpath = "//ion-buttons[1]/ion-button[1]")
	private WebElement covenantMaster_Close;

	public WebElement covenantMaster_Close() {
		return covenantMaster_Close;
	}

	// List View Description
	@FindBy(xpath = "//span[contains(text(),'Description')]")
	private WebElement covenantMaster_ListViewDescriptionField;

	public WebElement covenantMaster_ListViewDescriptionField() {
		return covenantMaster_ListViewDescriptionField;
	}

}
