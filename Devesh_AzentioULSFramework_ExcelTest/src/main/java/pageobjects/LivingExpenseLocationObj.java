package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LivingExpenseLocationObj {
	WebDriver driver;

	public LivingExpenseLocationObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement livingExpense_SearchButton;

	public WebElement livingExpense_SearchButton() {
		return livingExpense_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement livingExpense_SearchInputField;

	public WebElement livingExpense_SearchInputField() {
		return livingExpense_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement livingExpense_SearchCloseButton;

	public WebElement livingExpense_SearchCloseButton() {
		return livingExpense_SearchCloseButton;
	}
	
	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement livingExpense_NoDataFoundInSearch;

	public WebElement livingExpense_NoDataFoundInSearch() {
		return livingExpense_NoDataFoundInSearch;
	}
	
//	@FindBy(xpath = "//ion-label[contains(text(),'Other Masters')]")
//	private WebElement livingExpenseConfigMenu;
//
//	public WebElement livingExpenseConfigMenu() {
//		return livingExpenseConfigMenu;
//	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement livingExpense_Maker_MenuToggle;

	public WebElement livingExpense_Maker_MenuToggle() {
		return livingExpense_Maker_MenuToggle;
	}
	
	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement livingExpenseConfigManager;
	
	public WebElement livingExpenseConfigManager() {
		return livingExpenseConfigManager;
	}

	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
	private WebElement livingExpenseConfigurations;

	public WebElement livingExpenseConfigurations() {
		return livingExpenseConfigurations;
	}
	
	@FindBy(xpath = "//ion-label[contains(text(),'Living Expense')]/following-sibling::ion-buttons/ion-button[1]")
	private WebElement livingExpense_WorkInProgressRecordsButton;

	public WebElement livingExpense_WorkInProgressRecordsButton() {
		return livingExpense_WorkInProgressRecordsButton;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Living Expense')]/following-sibling::ion-buttons/ion-button[2]")
	private WebElement livingExpense_ApprovedRecordsButton;

	public WebElement livingExpense_ApprovedRecordsButton() {
		return livingExpense_ApprovedRecordsButton;
	}
	
	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[7]/img[1]")
	private WebElement livingExpense_Profile;

	public WebElement livingExpense_Profile() {
		return livingExpense_Profile;
	}

	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement livingExpense_LogoutUser;

	public WebElement livingExpense_LogoutUser() {
		return livingExpense_LogoutUser;
	}

	// Menu toggle
	@FindBy(xpath = "//ion-menu-toggle/ion-button")
	private WebElement livingExpense_Checker_MenuToggle;

	public WebElement livingExpense_Checker_MenuToggle() {
		return livingExpense_Checker_MenuToggle;
	}

//	@FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']/ion-icon[1]")
	@FindBy(xpath = "//ion-list[1]/ion-item[2]/div[1]")
	private WebElement livingExpense_Checker_Inbox;

	public WebElement livingExpense_Checker_Inbox() {
		return livingExpense_Checker_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement livingExpense_Checker_SearchInbox;

	public WebElement livingExpense_Checker_SearchInbox() {
		return livingExpense_Checker_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement livingExpense_Checker_SearchInboxInputField;

	public WebElement livingExpense_Checker_SearchInboxInputField() {
		return livingExpense_Checker_SearchInboxInputField;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement livingExpense_Checker_SearchInboxCloseButton;

	public WebElement livingExpense_Checker_SearchInboxCloseButton() {
		return livingExpense_Checker_SearchInboxCloseButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	private WebElement livingExpense_Checker_Approve;

	public WebElement livingExpense_Checker_Approve() {
		return livingExpense_Checker_Approve;
	}

	// approve remark
	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement livingExpense_Checker_CheckerApproveRemark;

	public WebElement livingExpense_Checker_CheckerApproveRemark() {
		return livingExpense_Checker_CheckerApproveRemark;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement livingExpense_Checker_CheckerApproveButton;

	public WebElement livingExpense_Checker_CheckerApproveButton() {
		return livingExpense_Checker_CheckerApproveButton;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement livingExpense_Checker_CheckerRejectRemark;

	public WebElement livingExpense_Checker_CheckerRejectRemark() {
		return livingExpense_Checker_CheckerRejectRemark;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement livingExpense_Checker_CheckerReturnRemark;

	public WebElement livingExpense_Checker_CheckerReturnRemark() {
		return livingExpense_Checker_CheckerReturnRemark;
	}

//	@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	private WebElement livingExpense_Checker_Reject;

	public WebElement livingExpense_Checker_Reject() {
		return livingExpense_Checker_Reject;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement livingExpense_Checker_CheckerRejectButton;

	public WebElement livingExpense_Checker_CheckerRejectButton() {
		return livingExpense_Checker_CheckerRejectButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Return')]")
	private WebElement livingExpense_Checker_Return;

	public WebElement livingExpense_Checker_Return() {
		return livingExpense_Checker_Return;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement livingExpense_Checker_CheckerReturnButton;

	public WebElement livingExpense_Checker_CheckerReturnButton() {
		return livingExpense_Checker_CheckerReturnButton;
	}

	// Approve confirmation message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement livingExpense_Checker_ApproveConfirmationMessage;

	public WebElement livingExpense_Checker_ApproveConfirmationMessage() {
		return livingExpense_Checker_ApproveConfirmationMessage;
	}

	// Submit confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement livingExpense_Checker_ApproveConfirmationMessageCloseButton;

	public WebElement livingExpense_Checker_ApproveConfirmationMessageCloseButton() {
		return livingExpense_Checker_ApproveConfirmationMessageCloseButton;
	}

//	@FindBy(xpath = "//button[@ng-reflect-text='View Summary']")
//	private WebElement covenantMaster_ViewSummaryButton;
//
//	public WebElement covenantMaster_ViewSummaryButton() {
//		return covenantMaster_ViewSummaryButton;
//	}
//
//	@FindBy(xpath = "(//table//tr[1]//td[2])[3]")
//	private WebElement covenantMaster_UserID;
//
//	public WebElement covenantMaster_UserID() {
//		return covenantMaster_UserID;
//	}
//
//	@FindBy(xpath = "(//table//tr[1]//td[3])[3]")
//	private WebElement covenantMaster_StageCode;
//
//	public WebElement covenantMaster_StageCode() {
//		return covenantMaster_StageCode;
//	}
//
//	@FindBy(xpath = "(//table//tr[1]//td[4])[3]")
//	private WebElement covenantMaster_Status;
//
//	public WebElement covenantMaster_Status() {
//		return covenantMaster_Status;
//	}
//
//	@FindBy(xpath = "(//table//tr[1]//td[5])[3]")
//	private WebElement covenantMaster_StartTime;
//
//	public WebElement covenantMaster_StartTime() {
//		return covenantMaster_StartTime;
//	}
//
//	@FindBy(xpath = "(//table//tr[1]//td[6])[3]")
//	private WebElement covenantMaster_EndTime;
//
//	public WebElement covenantMaster_EndTime() {
//		return covenantMaster_EndTime;
//	}
//
//	@FindBy(xpath = "//ion-buttons[1]/ion-button[1]")
//	private WebElement covenantMaster_Close;
//
//	public WebElement covenantMaster_Close() {
//		return covenantMaster_Close;
//	}
}
