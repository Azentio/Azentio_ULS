package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CovenantMasterObj {
	WebDriver driver;

	public CovenantMasterObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Corporate Masters')]")
	private WebElement covenantMasterConfigMenu;

	public WebElement covenantMasterConfigMenu() {
		return covenantMasterConfigMenu;
	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement covenantMaster_Maker_MenuToggle;

	public WebElement covenantMaster_Maker_MenuToggle() {
		return covenantMaster_Maker_MenuToggle;
	}

//	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
	@FindBy(xpath = "(//li[3]//ion-icon[1])[1]")
	private WebElement covenantMasterConfigurations;

	public WebElement covenantMasterConfigurations() {
		return covenantMasterConfigurations;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Covenant Master')]/following-sibling::ion-buttons/ion-button[1]")
	private WebElement covenantMaster_WorkInProgressRecordsButton;

	public WebElement covenantMaster_WorkInProgressRecordsButton() {
		return covenantMaster_WorkInProgressRecordsButton;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Covenant Master')]/following-sibling::ion-buttons/ion-button[2]")
	private WebElement covenantMaster_ApprovedRecordsButton;

	public WebElement covenantMaster_ApprovedRecordsButton() {
		return covenantMaster_ApprovedRecordsButton;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement covenantMaster_addButton;

	public WebElement covenantMaster_addButton() {
		return covenantMaster_addButton;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/button[1]/span[1]")
	private WebElement covenantMaster_BackButton;

	public WebElement covenantMaster_BackButton() {
		return covenantMaster_BackButton;
	}

//	covenant type
	@FindBy(xpath = "//ion-label[contains(text(),' Covenant Type')]/following-sibling::ion-select")
	private WebElement covenantMaster_CovenantType;

	public WebElement covenantMaster_CovenantType() {
		return covenantMaster_CovenantType;
	}

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
////	Waiver allowed toggle on
//	@FindBy(xpath = "//ion-label[contains(text(),'Waiver Allowed')]/parent::div/following-sibling::ion-item/ion-toggle/input[@value='on']")
//	private WebElement covenantMaster_WaiverAllowedToggleON;
//	
//	public WebElement covenantMaster_WaiverAllowedToggleON() {
//		return covenantMaster_WaiverAllowedToggleON;
//	}

	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement covenantMaster_SearchButton;

	public WebElement covenantMaster_SearchButton() {
		return covenantMaster_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement covenantMaster_SearchInputField;

	public WebElement covenantMaster_SearchInputField() {
		return covenantMaster_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement covenantMaster_SearchCloseButton;

	public WebElement covenantMaster_SearchCloseButton() {
		return covenantMaster_SearchCloseButton;
	}

//	// Description invalid data type validation
//	@FindBy(xpath = "//ion-label[contains(text(),' Asset/Collateral type code ')]/ancestor::ion-col//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
//	private WebElement assetCollateralType_AssetCollateralTypeCodeInvalidDataValidation;
//
//	public WebElement assetCollateralType_AssetCollateralTypeCodeInvalidDataValidation() {
//		return assetCollateralType_AssetCollateralTypeCodeInvalidDataValidation;
//	}

	// Save Button
	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement covenantMaster_SaveButton;

	public WebElement covenantMaster_SaveButton() {
		return covenantMaster_SaveButton;
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

	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[8]/img[1]")
	private WebElement covenantMaster_Profile;

	public WebElement covenantMaster_Profile() {
		return covenantMaster_Profile;
	}

	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement covenantMaster_LogoutUser;

	public WebElement covenantMaster_LogoutUser() {
		return covenantMaster_LogoutUser;
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

	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement covenantMaster_NoDataFoundInSearch;

	public WebElement covenantMaster_NoDataFoundInSearch() {
		return covenantMaster_NoDataFoundInSearch;
	}

	// export
	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement covenantMaster_Export;

	public WebElement covenantMaster_Export() {
		return covenantMaster_Export;
	}

	// pdf
	@FindBy(xpath = " //li[@aria-label='PDF']") // PDF
	private WebElement covenantMaster_PdfFile;

	public WebElement covenantMaster_PdfFile() {
		return covenantMaster_PdfFile;
	}

	// xls
	@FindBy(xpath = " //li[@aria-label='XLS']") // XLS
	private WebElement covenantMaster_XlsFile;

	public WebElement covenantMaster_XlsFile() {
		return covenantMaster_XlsFile;
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

	// Special Character validation message
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement covenantMaster_SpecialCharacterValidationMessage;

	public WebElement covenantMaster_SpecialCharacterValidationMessage() {
		return covenantMaster_SpecialCharacterValidationMessage;
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

	// List View ID
	@FindBy(xpath = "//span[contains(text(),'ID')]")
	private WebElement covenantMaster_ListViewIDField;

	public WebElement covenantMaster_ListViewIDField() {
		return covenantMaster_ListViewIDField;
	}

	// List View CovenantType
	@FindBy(xpath = "//span[contains(text(),'Covenant Type')]")
	private WebElement covenantMaster_ListViewCovenantTypeField;

	public WebElement covenantMaster_ListViewCovenantTypeField() {
		return covenantMaster_ListViewCovenantTypeField;
	}

	// List View Frequency
	@FindBy(xpath = "//span[contains(text(),'Frequency')]")
	private WebElement covenantMaster_ListViewFrequencyField;

	public WebElement covenantMaster_ListViewFrequencyField() {
		return covenantMaster_ListViewFrequencyField;
	}
	
	// List View Status
	@FindBy(xpath = "//span[contains(text(),'Status')]")
	private WebElement covenantMaster_ListViewStatusField;
	
	public WebElement covenantMaster_ListViewStatusField() {
		return covenantMaster_ListViewStatusField;
	}

}
