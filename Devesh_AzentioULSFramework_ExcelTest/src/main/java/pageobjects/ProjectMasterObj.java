package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectMasterObj {
	WebDriver driver;

	public ProjectMasterObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ------------------------MAKER STAGE PAGEOBJECTS----------------------//
	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
	private WebElement projectMaster_Configurations;

	public WebElement projectMaster_Configurations() {
		return projectMaster_Configurations;
	}
	
	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement config_Manager;
	
	public WebElement config_Manager() {
		return config_Manager;
	}
	
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement projectMaster_MenuToggle;
	
	public WebElement projectMaster_MenuToggle() {
		return projectMaster_MenuToggle;
	}

//	@FindBy(xpath = "//h4[contains(text(),'Project Setup')]")
//	@FindBy(xpath = "//ion-label[contains(text(),'Project Setup')]")
//	private WebElement project_Setup;
//
//	public WebElement project_Setup() {
//		return project_Setup;
//	}

//	@FindBy(xpath = "//h4[contains(text(),'Project Master')]/../../ion-buttons/ion-button[2]")
	@FindBy(xpath = "//ion-label[contains(text(),'Project Master')]/../ion-buttons/ion-button[2]")
	private WebElement projectMaster_EyeIcon;

	public WebElement projectMaster_EyeIcon() {
		return projectMaster_EyeIcon;
	}

//	@FindBy(xpath = "//h4[contains(text(),'Project Master')]/../../ion-buttons/ion-button[1]")
	@FindBy(xpath = "//ion-label[contains(text(),'Project Master')]/../ion-buttons/ion-button[1]")
	private WebElement projectMaster_EditView;

	public WebElement projectMaster_EditView() {
		return projectMaster_EditView;
	}

//	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]") // Product Master Add Button
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement projectMaster_AddButton;

	public WebElement projectMaster_AddButton() {
		return projectMaster_AddButton;
	}

	// Validation Message For Blank Field
	@FindBy(xpath = "//ion-label/span[contains(text(),'*')]//following::ion-badge[contains(text(),'Required field')]")
	private WebElement projectMaster_ValidationMessageForBlankField;

	public WebElement projectMaster_ValidationMessageForBlankField() {
		return projectMaster_ValidationMessageForBlankField;
	}

	// NameOfTheProject Validation Message For Blank Field
	@FindBy(xpath = "//ion-label[contains(text(),' Name of the Project ')]/../../..//ion-badge[contains(text(),'Required field')]")
	private WebElement projectMaster_NameOfTheProjectBlankFieldValidation;

	public WebElement projectMaster_NameOfTheProjectBlankFieldValidation() {
		return projectMaster_NameOfTheProjectBlankFieldValidation;
	}

//	// NameOfTheProject input Field
//	@FindBy(xpath = "//ion-col[5]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
//	private WebElement projectMaster_NameOfTheProjectInputField;
//
//	public WebElement projectMaster_NameOfTheProjectInputField() {
//		return projectMaster_NameOfTheProjectInputField;
//	}

	// ProjectMasterAddTitle
	@FindBy(xpath = "//ion-title[contains(text(),'Project Master Add')]")
	private WebElement projectMaster_ProjectMasterAddTitle;

	public WebElement projectMaster_ProjectMasterAddTitle() {
		return projectMaster_ProjectMasterAddTitle;
	}

	// edit button of modified record
	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]/span[1]")
	private WebElement projectMaster_ModifiedRecordEditButton;

	public WebElement projectMaster_ModifiedRecordEditButton() {
		return projectMaster_ModifiedRecordEditButton;
	}

	// Validation Message For special character in any field
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement projectMaster_ValidationMessageForSpecialCharacter;

	public WebElement projectMaster_ValidationMessageForSpecialCharacter() {
		return projectMaster_ValidationMessageForSpecialCharacter;
	}

	// List view status
	@FindBy(xpath = "//thead/tr[1]/th[6]/span[1]")
	private WebElement projectMaster_ListViewStatus;

	public WebElement projectMaster_ListViewStatus() {
		return projectMaster_ListViewStatus;
	}

	@FindBy(xpath = "//ion-textarea[1]//textarea[1]")
	private WebElement projectMaster_Product_Remark;

	public WebElement projectMaster_Product_Remark() {
		return projectMaster_Product_Remark;
	}

//	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement projectMaster_Save;

	public WebElement projectMaster_Save() {
		return projectMaster_Save;
	}

	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement projectMaster_Product_SaveConfirmationMessage;

	public WebElement projectMaster_Product_SaveConfirmationMessage() {
		return projectMaster_Product_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement projectMaster_Product_SaveConfirmationMessageCloseButton;

	public WebElement projectMaster_Product_SaveConfirmationMessageCloseButton() {
		return projectMaster_Product_SaveConfirmationMessageCloseButton;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']/span[1]")
	private WebElement projectMaster_Product_Back;

	public WebElement projectMaster_Product_Back() {
		return projectMaster_Product_Back;
	}

	@FindBy(xpath = "//div[1]//tbody[1]/tr[1]/td[1]//button[1]")
	private WebElement projectMaster_Product_Edit;

	public WebElement projectMaster_Product_Edit() {
		return projectMaster_Product_Edit;
	}

	@FindBy(xpath = "//div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement projectMaster_Search;

	public WebElement projectMaster_Search() {
		return projectMaster_Search;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement projectMaster_SearchInbox;

	public WebElement projectMaster_SearchInbox() {
		return projectMaster_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement projectMaster_SearchInboxInputField;

	public WebElement projectMaster_SearchInboxInputField() {
		return projectMaster_SearchInboxInputField;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement projectMaster_SearchInboxCloseButton;

	public WebElement projectMaster_SearchInboxCloseButton() {
		return projectMaster_SearchInboxCloseButton;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement projectMaster_SearchInputField;

	public WebElement projectMaster_SearchInputField() {
		return projectMaster_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement projectMaster_SearchCloseButton;

	public WebElement projectMaster_SearchCloseButton() {
		return projectMaster_SearchCloseButton;
	}

	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
	private WebElement projectMaster_Inbox;

	public WebElement projectMaster_Inbox() {
		return projectMaster_Inbox;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement projectMaster_ReferanceId;

	public WebElement productMaster_Product_ReferanceId() {
		return projectMaster_ReferanceId;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]")
	private WebElement projectMaster_Action;

	public WebElement projectMaster_Action() {
		return projectMaster_Action;
	}
	
	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement projectMaster_Maker_SearchInbox;

	public WebElement projectMaster_Maker_SearchInbox() {
		return projectMaster_Maker_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement projectMaster_Maker_SearchInboxInputField;

	public WebElement projectMaster_Maker_SearchInboxInputField() {
		return projectMaster_Maker_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement projectMaster_Maker_SearchInboxCloseButton;

	public WebElement projectMaster_Maker_SearchInboxCloseButton() {
		return projectMaster_Maker_SearchInboxCloseButton;
	}
		
	// MakerRemarks
	@FindBy(xpath = "(//ion-textarea[1]//textarea[1])[2]")
	private WebElement projectMaster_MakerSubmitRemark;

	public WebElement projectMaster_MakerSubmitRemark() {
		return projectMaster_MakerSubmitRemark;
	}

	@FindBy(xpath = "//button/span[contains(text(),'Submit')]")
//	@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
	private WebElement projectMaster_Submit;

	public WebElement projectMaster_Submit() {
		return projectMaster_Submit;
	}

	// FinalSubmit
	@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
	private WebElement projectMaster_FinalSubmit;

	public WebElement projectMaster_FinalSubmit() {
		return projectMaster_FinalSubmit;
	}

	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement projectMaster_ConfirmationMessage;

	public WebElement projectMaster_ConfirmationMessage() {
		return projectMaster_ConfirmationMessage;
	}

	// confirmation message close button
//	@FindBy(xpath = "//ion-label[contains(text(),'new record')]")
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement projectMaster_ConfirmationMessageCloseButton;

	public WebElement projectMaster_ConfirmationMessageCloseButton() {
		return projectMaster_ConfirmationMessageCloseButton;
	}

//	// Next button list view
//	@FindBy(xpath = "(//button[@class='p-ripple p-element p-paginator-next p-paginator-element p-link']/span)[1]")
//	private WebElement productMaster_Product_NextButtonListView;
//	
//	public WebElement productMaster_Product_NextButtonListView() {
//		return productMaster_Product_NextButtonListView;
//	}
//
//	// Next button inbox
//	@FindBy(xpath = "(//button[@class='p-ripple p-element p-paginator-next p-paginator-element p-link']/span)[2]")
//	private WebElement productMaster_Product_NextButtonInbox;
//	
//	public WebElement productMaster_Product_NextButtonInbox() {
//		return productMaster_Product_NextButtonInbox;
//	}

	@FindBy(xpath = "//button/span[contains(text(),'Cancel')]")
	private WebElement projectMaster_Cancel;

	public WebElement projectMaster_Cancel() {
		return projectMaster_Cancel;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='View Summary']")
	private WebElement projectMaster_ViewSummary;

	public WebElement projectMaster_ViewSummary() {
		return projectMaster_ViewSummary;
	}

//	@FindBy(xpath = "//button[@ng-reflect-label='Submit']/span[2]")
	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	private WebElement projectMaster_Maker_Submit;

	public WebElement projectMaster_Maker_Submit() {
		return projectMaster_Maker_Submit;
	}

	@FindBy(xpath = "//div[@id='toast-container']/div[1]")
	private WebElement projectMaster_Checker_Id;

	public WebElement projectMaster_Checker_Id() {
		return projectMaster_Checker_Id;
	}

	@FindBy(xpath = "//ion-item[1]/ion-toggle[1]")
	private WebElement projectMaster_Status;

	public WebElement projectMaster_Status() {
		return projectMaster_Status;
	}

	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement projectMaster_Export;

	public WebElement projectMaster_Export() {
		return projectMaster_Export;
	}

	@FindBy(xpath = " //li[@aria-label='PDF']") // PDF
	private WebElement projectMaster_PdfFile;

	public WebElement projectMaster_PdfFile() {
		return projectMaster_PdfFile;
	}

	@FindBy(xpath = " //li[@aria-label='XLS']") // XLS
	private WebElement projectMaster__XlsFile;

	public WebElement projectMaster__XlsFile() {
		return projectMaster__XlsFile;
	}

//	//list view first field of product group  
//	@FindBy(xpath = "//tbody/tr[1]/td[2]/p-celleditor[1]/span[1]")
//	private WebElement projectMaster_ListViewFirstFieldOfProductGroup;
//	
//	public WebElement productMaster_Product_ListViewFirstFieldOfProductGroup() {
//		return productMaster_Product_ListViewFirstFieldOfProductGroup;
//	}
//	
//	//list view first field of product code  
//	@FindBy(xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]/span[1]")
//	private WebElement projectMaster_ListViewFirstFieldOfProductCode;
//	
//	public WebElement productMaster_Product_ListViewFirstFieldOfProductCode() {
//		return productMaster_Product_ListViewFirstFieldOfProductCode;
//	}
//	
//	//list view first field of particular product code desc30
//	@FindBy(xpath = "//span[contains(text(),'desc30')]")
//	private WebElement projectMaster_ListViewFirstFieldOfProductCode_desc30;
//	
//	public WebElement productMaster_Product_ListViewFirstFieldOfProductCode_desc30() {
//		return productMaster_Product_ListViewFirstFieldOfProductCode_desc30;
//	}

	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement projectMaster_NoDataFoundInSearch;

	public WebElement projectMaster_NoDataFoundInSearch() {
		return projectMaster_NoDataFoundInSearch;
	}

//	//list view first field of product description  
//	@FindBy(xpath = "//tbody/tr[1]/td[4]/p-celleditor[1]/span[1]")
//	private WebElement projectMaster_;
//	
//	public WebElement productMaster_Product_ListViewFirstFieldOfProductDescription() {
//		return productMaster_Product_ListViewFirstFieldOfProductDescription;
//	}
//	
//	//list view first field of retail/corporate 
//	@FindBy(xpath = "//tbody/tr[1]/td[5]/p-celleditor[1]/span[1]")
//	private WebElement projectMaster_ListViewFirstFieldOfRetailandCorporate;
//	
//	public WebElement productMaster_Product_ListViewFirstFieldOfRetailandCorporate() {
//		return productMaster_Product_ListViewFirstFieldOfRetailandCorporate;
//	}

	// ------------------CHECKER STAGE PAGEOBJECTS----------------//

	@FindBy(xpath = "//ion-menu-toggle/ion-button")
	private WebElement projectMaster_Checker_MenuToggle;

	public WebElement projectMaster_Checker_MenuToggle() {
		return projectMaster_Checker_MenuToggle;
	}

	@FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']/ion-icon[1]")
	private WebElement projectMaster_Checker_Inbox;

	public WebElement projectMaster_Checker_Inbox() {
		return projectMaster_Checker_Inbox;
	}

//	@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	private WebElement projectMaster_Checker_Approve;

	public WebElement projectMaster_Checker_Approve() {
		return projectMaster_Checker_Approve;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement projectMaster_Checker_CheckerApproveRemark;

	public WebElement projectMaster_Checker_CheckerApproveRemark() {
		return projectMaster_Checker_CheckerApproveRemark;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement projectMaster_Checker_CheckerApproveButton;

	public WebElement projectMaster_Checker_CheckerApproveButton() {
		return projectMaster_Checker_CheckerApproveButton;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement projectMaster_Checker_CheckerRejectRemark;

	public WebElement projectMaster_Checker_CheckerRejectRemark() {
		return projectMaster_Checker_CheckerRejectRemark;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement projectMaster_Checker_CheckerReturnRemark;

	public WebElement projectMaster_Checker_CheckerReturnRemark() {
		return projectMaster_Checker_CheckerReturnRemark;
	}

//	@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	private WebElement projectMaster_Checker_Reject;

	public WebElement projectMaster_Checker_Reject() {
		return projectMaster_Checker_Reject;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement projectMaster_Checker_CheckerRejectButton;

	public WebElement projectMaster_Checker_CheckerRejectButton() {
		return projectMaster_Checker_CheckerRejectButton;
	}

//	@FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]")
	@FindBy(xpath = "//span[contains(text(),'Return')]")
	private WebElement projectMaster_Checker_Return;

	public WebElement projectMaster_Checker_Return() {
		return projectMaster_Checker_Return;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement projectMaster_Checker_CheckerReturnButton;

	public WebElement projectMaster_Checker_CheckerReturnButton() {
		return projectMaster_Checker_CheckerReturnButton;
	}

	// Approve confirmation message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement projectMaster_ApproveConfirmationMessage;

	public WebElement projectMaster_ApproveConfirmationMessage() {
		return projectMaster_ApproveConfirmationMessage;
	}

	// Submit confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement projectMaster_ApproveConfirmationMessageCloseButton;

	public WebElement projectMaster_ApproveConfirmationMessageCloseButton() {
		return projectMaster_ApproveConfirmationMessageCloseButton;
	}

	// Invalid Datatype Validation Message
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement projectMaster_InvalidDatatypeValidationMessage;

	public WebElement projectMaster_InvalidDatatypeValidationMessage() {
		return projectMaster_InvalidDatatypeValidationMessage;
	}

	// status of record in list view
	@FindBy(xpath = "//span[contains(text(),'Azentio New')]/../../../td[11]/p-celleditor/p-tag/span")
	private WebElement projectMaster_DisplayStatus;

	public WebElement projectMaster_DisplayStatus() {
		return projectMaster_DisplayStatus;
	}

	// Project Master Title
	@FindBy(xpath = "//ion-title[contains(text(),'Product Master')]")
	private WebElement projectMaster_ProductMasterTitle;

	public WebElement projectMaster_ProductMasterTitle() {
		return projectMaster_ProductMasterTitle;
	}

	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[6]/img[1]")
	private WebElement projectMaster_Profile;

	public WebElement projectMaster_Profile() {
		return projectMaster_Profile;
	}
		
	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement projectMaster_LogoutUser;

	public WebElement projectMaster_LogoutUser() {
		return projectMaster_LogoutUser;
	}

	// Project Code
	@FindBy(xpath = "//ion-label[contains(text(),' Project Code ')]//following-sibling::ion-input/input")
	private WebElement projectMaster_ProjectCode;

	public WebElement projectMaster_ProjectCode() {
		return projectMaster_ProjectCode;
	}

	// NameOfTheProject
	@FindBy(xpath = "//ion-label[contains(text(),'Name of the Project')]//following-sibling::ion-input/input")
	private WebElement projectMaster_NameOfTheProject;

	public WebElement projectMaster_NameOfTheProject() {
		return projectMaster_NameOfTheProject;
	}
	

	// SourcingBranch
	@FindBy(xpath = "(//ion-label[contains(text(),' Sourcing Branch ')]/following-sibling::ion-select)[1]")
	private WebElement projectMaster_SourcingBranch;

	public WebElement projectMaster_SourcingBranch() {
		return projectMaster_SourcingBranch;
	}
	// SourcingBranchAddress
	@FindBy(xpath = "(//ion-label[contains(text(),' Sourcing Branch ')]/following-sibling::ion-select)[2]")
	private WebElement projectMaster_SourcingBranchAddressDetails;
	
	public WebElement projectMaster_SourcingBranchAddressDetails() {
		return projectMaster_SourcingBranchAddressDetails;
	}
	
	//construction finance
	@FindBy(xpath = "//ion-label[contains(text(),' Construction Finance ')]/following-sibling::ion-select")
	private WebElement projectMaster_ConstructionFinanceDropDown;

	public WebElement projectMasterConstructionFinanceDropDown() {
		return projectMaster_ConstructionFinanceDropDown;
	}
	
	//Green Project
	@FindBy(xpath = "//ion-label[contains(text(),' Green Project ')]/following-sibling::ion-select")
	private WebElement projectMaster_GreenProjectDropDown;

	public WebElement projectMasterGreenProjectDropDown() {
		return projectMaster_GreenProjectDropDown;
	}

	// Address1
	@FindBy(xpath = "//ion-label[contains(text(),'Address1')]//following-sibling::ion-input/input")
	private WebElement projectMaster_Address1;

	public WebElement projectMaster_Address1() {
		return projectMaster_Address1;
	}

	// Address2
	@FindBy(xpath = "//ion-label[contains(text(),'Address2')]//following-sibling::ion-input/input")
	private WebElement projectMaster_Address2;

	public WebElement projectMaster_Address2() {
		return projectMaster_Address2;
	}
	
	//state
	@FindBy(xpath = "//ion-label[contains(text(),' State ')]//following-sibling::ion-select")
	private WebElement projectMaster_AddressDetailsStateDropDown;

	public WebElement projectMasterAddressDetailsStateDropDown() {
		return projectMaster_AddressDetailsStateDropDown;
	}

	// PhoneNo
	@FindBy(xpath = "//ion-label[contains(text(),'Phone No')]//following-sibling::ion-input/input")
	private WebElement projectMaster_PhoneNo;

	public WebElement projectMaster_PhoneNo() {
		return projectMaster_PhoneNo;
	}

	// PlanApprovedDateCalendar
	@FindBy(xpath = "//ion-label[contains(text(),' Plan Approved Date ')]//following-sibling::ion-input/input")
	private WebElement projectMaster_PlanApprovedDateCalendar;

	public WebElement projectMaster_PlanApprovedDateCalendar() {
		return projectMaster_PlanApprovedDateCalendar;
	}

	// AreaOfLand/DistanceUnit
	@FindBy(xpath = "//ion-label[contains(text(),' Area of Land/Distance Unit ')]//following-sibling::ion-input/input")
	private WebElement projectMaster_AreaOfLandUnit;

	public WebElement projectMaster_AreaOfLandUnit() {
		return projectMaster_AreaOfLandUnit;
	}

	// SourcingBranch Address Details
	@FindBy(xpath = "(//ion-label[contains(text(),' Sourcing Branch ')])[2]")
	private WebElement projectMaster_SourcingBranchYesNo;

	public WebElement projectMaster_SourcingBranchYesNo() {
		return projectMaster_SourcingBranchYesNo;
	}

	// Overall % Recommendation
	@FindBy(xpath = "//ion-label[contains(text(),' Overall % Completion ')]")
	private WebElement projectMaster_OverAllPercentRecommendation;

	public WebElement projectMaster_OverAllPercentRecommendation() {
		return projectMaster_OverAllPercentRecommendation;
	}
	
	// Overall % Recommendation dropdown
	@FindBy(xpath = "//ion-label[contains(text(),' Overall % Recommendation ')]/following-sibling::ion-input/input")
	private WebElement projectMaster_OverAllPercentRecommendationTextbox;
	
	public WebElement projectMaster_OverAllPercentRecommendationTextbox() {
		return projectMaster_OverAllPercentRecommendationTextbox;
	}
	
	// NameOfBeneficiary
	@FindBy(xpath = "//ion-label[contains(text(),'Name of Beneficiery')]")
	private WebElement projectMaster_NameOfBeneficiary;

	public WebElement projectMaster_NameOfBeneficiary() {
		return projectMaster_NameOfBeneficiary;
	}
	
	// NameOfBeneficiary textbox
	@FindBy(xpath = "//ion-label[contains(text(),'Name of Beneficiery')]/following-sibling::ion-input/input")
	private WebElement projectMaster_NameOfBeneficiaryTextbox;
	
	public WebElement projectMaster_NameOfBeneficiaryTextbox() {
		return projectMaster_NameOfBeneficiaryTextbox;
	}
	
	// AccountNumber
	@FindBy(xpath = "//ion-label[contains(text(),' Account No ')]//following-sibling::ion-input/input")
	private WebElement projectMaster_AccountNumber;

	public WebElement projectMaster_AccountNumber() {
		return projectMaster_AccountNumber;
	}

	// Project Type
	@FindBy(xpath = "//ion-label[contains(text(),' Project Type ')]//following-sibling::ion-select")
	private WebElement projectMaster_ProjectType;
	
	public WebElement projectMaster_ProjectType() {
		return projectMaster_ProjectType;
	}

	// Address details
	@FindBy(xpath = "//ion-label[contains(text(),'Address Details')]")
	private WebElement projectMaster_AddressDetails;

	public WebElement projectMaster_AddressDetails() {
		return projectMaster_AddressDetails;
	}

	// Address 3
	@FindBy(xpath = "//ion-label[contains(text(),'Address3')]")
	private WebElement projectMaster_Address3;

	public WebElement projectMaster_Address3() {
		return projectMaster_Address3;
	}

	// Survey No
	@FindBy(xpath = "//ion-label[contains(text(),'Survey No')]")
	private WebElement projectMaster_Survey_No;

	public WebElement projectMaster_Survey_No() {
		return projectMaster_Survey_No;
	}

	// Landmark
	@FindBy(xpath = "//ion-label[contains(text(),'Landmark')]")
	private WebElement projectMaster_Landmark;

	public WebElement projectMaster_Landmark() {
		return projectMaster_Landmark;
	}

	// Street
	@FindBy(xpath = "//ion-label[contains(text(),'Street')]")
	private WebElement projectMaster_Street;

	public WebElement projectMaster_Street() {
		return projectMaster_Street;
	}
	
	// Country
	@FindBy(xpath = "//ion-label[contains(text(),'Country')]/following-sibling::ion-select")
	private WebElement projectMaster_Country;
	
	public WebElement projectMaster_Country() {
		return projectMaster_Country;
	}

	// City
	@FindBy(xpath = "//ion-label[contains(text(),'City')]")
	private WebElement projectMaster_City;

	public WebElement projectMaster_City() {
		return projectMaster_City;
	}

	// Pincode
	@FindBy(xpath = "//ion-label[contains(text(),'Pincode')]")
	private WebElement projectMaster_Pincode;

	public WebElement projectMaster_Pincode() {
		return projectMaster_Pincode;
	}

	// Sales/Relationship Manager
	@FindBy(xpath = "//ion-label[contains(text(),'Sales/Relationship Manager')]")
	private WebElement projectMaster_SalesRelationshipManager;

	public WebElement projectMaster_SalesRelationshipManager() {
		return projectMaster_SalesRelationshipManager;
	}

	// Mobile No
	@FindBy(xpath = "//ion-label[contains(text(),'Mobile No')]")
	private WebElement projectMaster_MobileNo;

	public WebElement projectMaster_MobileNo() {
		return projectMaster_MobileNo;
	}

	// Title Verified By
	@FindBy(xpath = "//ion-label[contains(text(),'Title Verified By')]")
	private WebElement projectMaster_TitleVerifiedBy;

	public WebElement projectMaster_TitleVerifiedBy() {
		return projectMaster_TitleVerifiedBy;
	}

	// Approved By
	@FindBy(xpath = "//ion-label[contains(text(),'Approved By')]")
	private WebElement projectMaster_ApprovedBy;

	public WebElement projectMaster_ApprovedBy() {
		return projectMaster_ApprovedBy;
	}

	// Plan Approved
	@FindBy(xpath = "//ion-label[contains(text(),'Plan Approved')]")
	private WebElement projectMaster_PlanApproved;

	public WebElement projectMaster_PlanApproved() {
		return projectMaster_PlanApproved;
	}

	// Rural/Urban Classification
	@FindBy(xpath = "//ion-label[contains(text(),'Rural/Urban Classification')]")
	private WebElement projectMaster_RuralUrbanClassification;

	public WebElement projectMaster_RuralUrbanClassification() {
		return projectMaster_RuralUrbanClassification;
	}

	// Charge By/Noc To Be Taken From
	@FindBy(xpath = "//ion-label[contains(text(),'Charge By/Noc To Be Taken From')]")
	private WebElement projectMaster_ChargeByNocToBeTakenFrom;

	public WebElement projectMaster_ChargeByNocToBeTakenFrom() {
		return projectMaster_ChargeByNocToBeTakenFrom;
	}

	// Built Area
	@FindBy(xpath = "//ion-label[contains(text(),'Built Area')]")
	private WebElement projectMaster_BuiltArea;

	public WebElement projectMaster_BuiltArea() {
		return projectMaster_BuiltArea;
	}

	// Any Charge On Project
	@FindBy(xpath = "//ion-label[contains(text(),'Any Charge On Project')]")
	private WebElement projectMaster_AnyChargeOnProject;

	public WebElement projectMaster_AnyChargeOnProject() {
		return projectMaster_AnyChargeOnProject;
	}
	
	// Basic Sales Price
	@FindBy(xpath = "//ion-label[contains(text(),'Basic Sales Price')]/following-sibling::ion-input/input")
	private WebElement projectMaster_BasicSalesPrice;
	
	public WebElement projectMaster_BasicSalesPrice() {
		return projectMaster_BasicSalesPrice;
	}
	
	// Select
	@FindBy(xpath = "//ion-label[text()=' Select ']/../ion-radio")
	private WebElement projectMaster_SelectRadioButton;
	
	public WebElement projectMaster_SelectRadioButton() {
		return projectMaster_SelectRadioButton;
	}

	// Name Of Competitors Funding Project
	@FindBy(xpath = "//ion-label[contains(text(),'Name of Competitors funding project')]")
	private WebElement projectMaster_NameOfCompetitorsFundingProject;

	public WebElement projectMaster_NameOfCompetitorsFundingProject() {
		return projectMaster_NameOfCompetitorsFundingProject;
	}

	// Monitoring Required
	@FindBy(xpath = "//ion-label[contains(text(),'Monitoring Required')]")
	private WebElement projectMaster_MonitoringRequired;

	public WebElement projectMaster_MonitoringRequired() {
		return projectMaster_MonitoringRequired;
	}

	// Under Construction
	@FindBy(xpath = "//ion-label[contains(text(),'Under Construction')]")
	private WebElement projectMaster_UnderConstruction;

	public WebElement projectMaster_UnderConstruction() {
		return projectMaster_UnderConstruction;
	}

	// Tentative Date Completion
	@FindBy(xpath = "//ion-label[contains(text(),'Tentative Date Completion')]")
	private WebElement projectMaster_TentativeDateCompletion;

	public WebElement projectMaster_TentativeDateCompletion() {
		return projectMaster_TentativeDateCompletion;
	}
	
	// Overall % Completion
	@FindBy(xpath = "//ion-label[contains(text(),'Overall % Completion')]")
	private WebElement projectMaster_OverallPercentCompletion;
	
	public WebElement projectMaster_OverallPercentCompletion() {
		return projectMaster_OverallPercentCompletion;
	}
	
	// Overall % Completion textbox
	@FindBy(xpath = "//ion-label[contains(text(),'Overall % Completion')]/following-sibling::ion-input/input")
	private WebElement projectMaster_OverallPercentCompletionTextbox;
	
	public WebElement projectMaster_OverallPercentCompletionTextbox() {
		return projectMaster_OverallPercentCompletionTextbox;
	}
	
	// BranchName
	@FindBy(xpath = "//ion-label[contains(text(),'Branch Name')]")
	private WebElement projectMaster_BranchName;

	public WebElement projectMaster_BranchName() {
		return projectMaster_BranchName;
	}
	
	// BankName
	@FindBy(xpath = "//ion-label[contains(text(),'Bank Name')]")
	private WebElement projectMaster_BankName;
	
	public WebElement projectMaster_BankName() {
		return projectMaster_BankName;
	}
	
	// BankName dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Bank Name')]/following-sibling::ion-select")
	private WebElement projectMaster_BankNameDropdown;
	
	public WebElement projectMaster_BankNameDropdown() {
		return projectMaster_BankNameDropdown;
	}

	// IFSC Code
	@FindBy(xpath = "//ion-label[contains(text(),'IFSC Code')]")
	private WebElement projectMaster_IFSC_Code;

	public WebElement projectMaster_IFSC_Code() {
		return projectMaster_IFSC_Code;
	}
	
	//date of visit
	@FindBy(xpath = "//ion-label[text()=' Date of Visit ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsDateOfVisitInputCalendar;

	public WebElement projectMasterAddressDetailsDateOfVisitInputCalendar() {
		return projectMaster_AddressDetailsDateOfVisitInputCalendar;
	}
	
	
	//file storage
	@FindBy(xpath = "//ion-label[text()=' File Storage ']//following-sibling::ion-select")
	private WebElement projectMaster_AddressDetailsFileStorageDropDown;

	public WebElement projectMasterAddressDetailsFileStorageDropDown() {
		return projectMaster_AddressDetailsFileStorageDropDown;
	}

	// Payment Plans Details
	@FindBy(xpath = "//ion-label[contains(text(),'Payment Plans')]")
	private WebElement projectMaster_PaymentPlansDetails;

	public WebElement projectMaster_PaymentPlansDetails() {
		return projectMaster_PaymentPlansDetails;
	}

	// CLP
	@FindBy(xpath = "//ion-label[contains(text(),'CLP')]")
	private WebElement projectMaster_CLP;

	public WebElement projectMaster_CLP() {
		return projectMaster_CLP;
	}
	
	// ADF
	@FindBy(xpath = "//ion-label[contains(text(),'ADF')]")
	private WebElement projectMaster_ADF;
	
	public WebElement projectMaster_ADF() {
		return projectMaster_ADF;
	}
	
	// Flexi
	@FindBy(xpath = "//ion-label[contains(text(),'Flexi')]")
	private WebElement projectMaster_Flexi;
	
	public WebElement projectMaster_Flexi() {
		return projectMaster_Flexi;
	}

	// Subvention
	@FindBy(xpath = "(//ion-label[contains(text(),'Subvention')])[2]")
	private WebElement projectMaster_Subvention;

	public WebElement projectMaster_Subvention() {
		return projectMaster_Subvention;
	}

	// Subvention Type
	@FindBy(xpath = "//ion-label[contains(text(),'Subvention Type')]")
	private WebElement projectMaster_SubventionType;

	public WebElement projectMaster_SubventionType() {
		return projectMaster_SubventionType;
	}

	// Subvention Period
	@FindBy(xpath = "//ion-label[contains(text(),'Subvention Period')]")
	private WebElement projectMaster_SubventionPeriod;

	public WebElement projectMaster_SubventionPeriod() {
		return projectMaster_SubventionPeriod;
	}

	// Subvention Start Date
	@FindBy(xpath = "//ion-label[contains(text(),'Subvention Start Date')]")
	private WebElement projectMaster_SubventionStartDate;

	public WebElement projectMaster_SubventionStartDate() {
		return projectMaster_SubventionStartDate;
	}

	// Subvention End Date
	@FindBy(xpath = "//ion-label[contains(text(),'Subvention End Date')]")
	private WebElement projectMaster_SubventionEndDate;

	public WebElement projectMaster_SubventionEndDate() {
		return projectMaster_SubventionEndDate;
	}

	// Interest To Be Collected
	@FindBy(xpath = "//ion-label[contains(text(),'Interest To be collected')]")
	private WebElement projectMaster_InterestToBeCollected;

	public WebElement projectMaster_InterestToBeCollected() {
		return projectMaster_InterestToBeCollected;
	}

	// Discounting Rate
	@FindBy(xpath = "//ion-label[contains(text(),'Discounting Rate')]")
	private WebElement projectMaster_DiscountingRate;

	public WebElement projectMaster_DiscountingRate() {
		return projectMaster_DiscountingRate;
	}

	// Rate Type
	@FindBy(xpath = "//ion-label[contains(text(),'Rate Type')]")
	private WebElement projectMaster_RateType;

	public WebElement projectMaster_RateType() {
		return projectMaster_RateType;
	}

	// Rate Of Interest
	@FindBy(xpath = "//ion-label[contains(text(),'Rate of Interest')]")
	private WebElement projectMaster_RateOfInterest;

	public WebElement projectMaster_RateOfInterest() {
		return projectMaster_RateOfInterest;
	}

	// Exposure Tracking Details
	@FindBy(xpath = "//ion-label[contains(text(),'Exposure Tracking')]")
	private WebElement projectMaster_ExposureTrackingDetails;

	public WebElement projectMaster_ExposureTrackingDetails() {
		return projectMaster_ExposureTrackingDetails;
	}

	// Max No Of Units To Be Funded
	@FindBy(xpath = "//ion-label[contains(text(),'Max No of Units to be Funded')]")
	private WebElement projectMaster_MaxNoOfUnitsToBeFunded;

	public WebElement projectMaster_MaxNoOfUnitsToBeFunded() {
		return projectMaster_MaxNoOfUnitsToBeFunded;
	}

	// Max Sanction Amt For All
	@FindBy(xpath = "//ion-label[contains(text(),'Max Sanction Amt for all')]")
	private WebElement projectMaster_MaxSanctionAmtForAll;

	public WebElement projectMaster_MaxSanctionAmtForAll() {
		return projectMaster_MaxSanctionAmtForAll;
	}

	// Max Disbursed Amt For All
	@FindBy(xpath = "//ion-label[contains(text(),'Max Disbursed Amt for all')]")
	private WebElement projectMaster_MaxDisbursedAmtForAll;

	public WebElement projectMaster_MaxDisbursedAmtForAll() {
		return projectMaster_MaxDisbursedAmtForAll;
	}

	// Sanctioned Amount
	@FindBy(xpath = "//ion-label[contains(text(),'Sanctioned Amount')]")
	private WebElement projectMaster_SanctionedAmount;

	public WebElement projectMaster_SanctionedAmount() {
		return projectMaster_SanctionedAmount;
	}

	// Disbursed Amount
	@FindBy(xpath = "//ion-label[contains(text(),'Disbursed Amount')]")
	private WebElement projectMaster_DisbursedAmount;

	public WebElement projectMaster_DisbursedAmount() {
		return projectMaster_DisbursedAmount;
	}

	// Sanctioned No Of Units
	@FindBy(xpath = "//ion-label[contains(text(),'Sanctioned No of Units')]")
	private WebElement projectMaster_SanctionedNoOfUnits;

	public WebElement projectMaster_SanctionedNoOfUnits() {
		return projectMaster_SanctionedNoOfUnits;
	}

	// Total No Units
	@FindBy(xpath = "//ion-label[contains(text(),'Total No Units')]")
	private WebElement projectMaster_TotalNoUnits;

	public WebElement projectMaster_TotalNoUnits() {
		return projectMaster_TotalNoUnits;
	}

	// Apartment
	@FindBy(xpath = "//ion-label[contains(text(),'Apartment')]")
	private WebElement projectMaster_Apartment;

	public WebElement projectMaster_Apartment() {
		return projectMaster_Apartment;
	}

	// Commercial Space
	@FindBy(xpath = "//ion-label[contains(text(),'Commercial Space')]")
	private WebElement projectMaster_CommercialSpace;

	public WebElement projectMaster_CommercialSpace() {
		return projectMaster_CommercialSpace;
	}

	// Plot
	@FindBy(xpath = "//ion-label[contains(text(),'Plot')]")
	private WebElement projectMaster_Plot;

	public WebElement projectMaster_Plot() {
		return projectMaster_Plot;
	}

	// Studio Apartment
	@FindBy(xpath = "//ion-label[contains(text(),'Studio Apartment')]")
	private WebElement projectMaster_StudioApartment;

	public WebElement projectMaster_StudioApartment() {
		return projectMaster_StudioApartment;
	}

	// Builder Floor
	@FindBy(xpath = "//ion-label[contains(text(),'Builder Floor')]")
	private WebElement projectMaster_BuilderFloor;

	public WebElement projectMaster_BuilderFloor() {
		return projectMaster_BuilderFloor;
	}

	// Villa
	@FindBy(xpath = "//ion-label[contains(text(),'Villa')]")
	private WebElement projectMaster_Villa;

	public WebElement projectMaster_Villa() {
		return projectMaster_Villa;
	}

	// Technical Conditions
	@FindBy(xpath = "//ion-label[contains(text(),'Technical Conditions')]")
	private WebElement projectMaster_TechnicalConditions;

	public WebElement projectMaster_TechnicalConditions() {
		return projectMaster_TechnicalConditions;
	}

	// Remarks
	@FindBy(xpath = "(//ion-label[contains(text(),'Remarks')])[3]")
	private WebElement projectMaster_Remarks;

	public WebElement projectMaster_Remarks() {
		return projectMaster_Remarks;
	}

	// Document To Be Collected From Retail Borrower
	@FindBy(xpath = "//ion-label[contains(text(),'Document to be collected from Retail Borrower')]")
	private WebElement projectMaster_DocumentToBeCollectedFromRetailBorrower;

	public WebElement projectMaster_DocumentToBeCollectedFromRetailBorrower() {
		return projectMaster_DocumentToBeCollectedFromRetailBorrower;
	}

}
