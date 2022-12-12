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

//	@FindBy(xpath = "(//li[3]//ion-icon[1])[1]")
	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
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

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement reportMaster_Maker_SearchInbox;

	public WebElement reportMaster_Maker_SearchInbox() {
		return reportMaster_Maker_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement reportMaster_Maker_SearchInboxInputField;

	public WebElement reportMaster_Maker_SearchInboxInputField() {
		return reportMaster_Maker_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement reportMaster_Maker_SearchInboxCloseButton;

	public WebElement reportMaster_Maker_SearchInboxCloseButton() {
		return reportMaster_Maker_SearchInboxCloseButton;
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
	
	// Report name field
	@FindBy(xpath = "//ion-label[text()=' Report Name ']/../ion-input/input")
	private WebElement reportMaster_ReportName;
	
	public WebElement reportMaster_ReportName() {
		return reportMaster_ReportName;
	}
	
	// Report name 2 field
	@FindBy(xpath = "//ion-label[text()=' Report Name 2 ']/../ion-input/input")
	private WebElement reportMaster_ReportName2;
	
	public WebElement reportMaster_ReportName2() {
		return reportMaster_ReportName2;
	}
	
	// Report name 3 field
	@FindBy(xpath = "//ion-label[text()=' Report Name 3 ']/../ion-input/input")
	private WebElement reportMaster_ReportName3;
	
	public WebElement reportMaster_ReportName3() {
		return reportMaster_ReportName3;
	}
	
	// Report description field
	@FindBy(xpath = "//ion-label[text()=' Report Description ']/../ion-input/input")
	private WebElement reportMaster_ReportDescription;
	
	public WebElement reportMaster_ReportDescription() {
		return reportMaster_ReportDescription;
	}
	
	// Report type field
	@FindBy(xpath = "//ion-label[text()=' Report Type ']/../ion-select")
	private WebElement reportMaster_ReportType;
	
	public WebElement reportMaster_ReportType() {
		return reportMaster_ReportType;
	}
	
	// Report Url field
//	@FindBy(xpath = "//ion-label[text()=' Report Url  ']/../ion-textarea/div/textarea")
	@FindBy(xpath = "//ion-label[contains(text(),' Report Url ')]/following-sibling::ion-textarea/div/textarea")
	private WebElement reportMaster_ReportUrl;
	
	public WebElement reportMaster_ReportUrl() {
		return reportMaster_ReportUrl;
	}

	// Report category field
	@FindBy(xpath = "//ion-label[text()=' Report Category ']/../ion-select")
	private WebElement reportMaster_ReportCategory;
	
	public WebElement reportMaster_ReportCategory() {
		return reportMaster_ReportCategory;
	}
	
	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement reportMaster_SaveConfirmationMessage;
	
	public WebElement reportMaster_SaveConfirmationMessage() {
		return reportMaster_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement reportMaster_SaveConfirmationMessageCloseButton;

	public WebElement reportMaster_SaveConfirmationMessageCloseButton() {
		return reportMaster_SaveConfirmationMessageCloseButton;
	}
	
	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement reportMaster_Inbox;

	public WebElement reportMaster_Inbox() {
		return reportMaster_Inbox;
	}
	
	// MakerRemarks
//	@FindBy(xpath = "//ion-textarea[1]//textarea[1]")
	@FindBy(xpath = "//ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement reportMaster_MakerSubmitRemark;

	public WebElement reportMaster_MakerSubmitRemark() {
		return reportMaster_MakerSubmitRemark;
	}
	
	//status
	@FindBy(xpath = "//ion-label[contains(text(),'Status')]/../../../digital-radio-button/ion-item/ion-toggle")
	private WebElement reportMaster_StatusToggle;
	
	public WebElement reportMaster_StatusToggle() {
		return reportMaster_StatusToggle;
	}
	
	//Report master - List view
	@FindBy(xpath = "//ion-title[contains(text(),'Report Master - List View')]")
	private WebElement reportMaster_ReportMasterListViewTitle;
	
	public WebElement reportMaster_ReportMasterListViewTitle() {
		return reportMaster_ReportMasterListViewTitle;
	}

	// Submit
	@FindBy(xpath = "//button/span[contains(text(),'Submit')]")
	private WebElement reportMaster_Submit;

	public WebElement reportMaster_Submit() {
		return reportMaster_Submit;
	}

	// FinalSubmit
	@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
	private WebElement reportMaster_FinalSubmit;

	public WebElement reportMaster_FinalSubmit() {
		return reportMaster_FinalSubmit;
	}
	
	// Confirmation Message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement reportMaster_ConfirmationMessage;

	public WebElement reportMaster_ConfirmationMessage() {
		return reportMaster_ConfirmationMessage;
	}

	// confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement reportMaster_ConfirmationMessageCloseButton;

	public WebElement reportMaster_ConfirmationMessageCloseButton() {
		return reportMaster_ConfirmationMessageCloseButton;
	}

	// Menu toggle
	@FindBy(xpath = "//ion-menu-toggle/ion-button")
	private WebElement reportMaster_Checker_MenuToggle;

	public WebElement reportMaster_Checker_MenuToggle() {
		return reportMaster_Checker_MenuToggle;
	}
	
	@FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']/ion-icon[1]")
	private WebElement reportMaster_Checker_Inbox;

	public WebElement reportMaster_Checker_Inbox() {
		return reportMaster_Checker_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement reportMaster_Checker_SearchInbox;

	public WebElement reportMaster_Checker_SearchInbox() {
		return reportMaster_Checker_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement reportMaster_Checker_SearchInboxInputField;

	public WebElement reportMaster_Checker_SearchInboxInputField() {
		return reportMaster_Checker_SearchInboxInputField;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement reportMaster_Checker_SearchInboxCloseButton;

	public WebElement reportMaster_Checker_SearchInboxCloseButton() {
		return reportMaster_Checker_SearchInboxCloseButton;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	private WebElement reportMaster_Checker_Approve;

	public WebElement reportMaster_Checker_Approve() {
		return reportMaster_Checker_Approve;
	}

	// approve remark
	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement reportMaster_Checker_CheckerApproveRemark;

	public WebElement reportMaster_Checker_CheckerApproveRemark() {
		return reportMaster_Checker_CheckerApproveRemark;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement reportMaster_Checker_CheckerApproveButton;

	public WebElement reportMaster_Checker_CheckerApproveButton() {
		return reportMaster_Checker_CheckerApproveButton;
	}

	// Approve confirmation message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement reportMaster_Checker_ApproveConfirmationMessage;

	public WebElement reportMaster_Checker_ApproveConfirmationMessage() {
		return reportMaster_Checker_ApproveConfirmationMessage;
	}

	// Submit confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement reportMaster_Checker_ApproveConfirmationMessageCloseButton;

	public WebElement reportMaster_Checker_ApproveConfirmationMessageCloseButton() {
		return reportMaster_Checker_ApproveConfirmationMessageCloseButton;
	}
	
	
////////////////////////////////////////////////////Below object should be removed	


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

}
