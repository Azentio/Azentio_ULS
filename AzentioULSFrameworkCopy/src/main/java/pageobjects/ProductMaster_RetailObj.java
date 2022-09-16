package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMaster_RetailObj {
	WebDriver driver;

	public ProductMaster_RetailObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ------------------------MAKER STAGE PAGEOBJECTS----------------------//

//	@FindBy(xpath = "//ion-card-content[1]/ion-item[1]//ion-icon[1]")
//	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
	@FindBy(xpath = "(//li[3]//ion-icon[1])[1]")
	private WebElement config_Manager;

	public WebElement config_Manager() {
		return config_Manager;
	}
	
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement productMaster_MenuToggle;
	
	public WebElement productMaster_MenuToggle() {
		return productMaster_MenuToggle;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Product Setup')]")
	private WebElement product_Setup;

	public WebElement product_Setup() {
		return product_Setup;
	}

//	@FindBy(xpath = "//h4[contains(text(),'Product master')]/ancestor::ion-item//ion-button[2]") // ProductMaster Eye Icon
	@FindBy(xpath = "//ion-label[contains(text(),'Product master')]/following-sibling::ion-buttons/ion-button[2]") // ProductMaster Eye Icon
	private WebElement productMaster_EyeIcon;

	public WebElement productMaster_EyeIcon() {
		return productMaster_EyeIcon;
	}

//	@FindBy(xpath = "//h4[contains(text(),'Product master')]/ancestor::ion-item//ion-button[1]") // ProductMaster Edit Icon
	@FindBy(xpath = "//ion-label[contains(text(),'Product master')]/following-sibling::ion-buttons/ion-button[1]") // ProductMaster Edit Icon
	private WebElement productMaster_EditView;

	public WebElement productMaster_EditView() {
		return productMaster_EditView;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']") // Product Master Add Button
	private WebElement productMaster_AddButton;

	public WebElement productMaster_AddButton() {
		return productMaster_AddButton;
	}

//	@FindBy(xpath = "//ion-select[@aria-label='Select,  Product Group *']") // product group
	@FindBy(xpath = "//ion-row[1]/ion-col[2]/digital-select-layout[1]") // product group
	private WebElement productMaster_ProductGroup;

	public WebElement productMaster_ProductGroup() {
		return productMaster_ProductGroup;
	}

	// List view product group
	@FindBy(xpath = "//span[contains(text(),'Product Group')]") // product group
	private WebElement productMaster_ListViewProductGroup;

	public WebElement productMaster_ListViewProductGroup() {
		return productMaster_ListViewProductGroup;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[3]//ion-item[1]//ion-input[1]/input") // product code
	private WebElement productMaster_ProductCode;

	public WebElement productMaster_ProductCode() {
		return productMaster_ProductCode;
	}

	// List view product code
	@FindBy(xpath = "//span[contains(text(),'Product Code')]")
	private WebElement productMaster_ListViewProductCode;

	public WebElement productMaster_ListViewProductCode() {
		return productMaster_ListViewProductCode;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[4]//ion-item[1]//ion-input[1]/input") // product description
	private WebElement productMaster_ProductDescription;

	public WebElement productMaster_ProductDescription() {
		return productMaster_ProductDescription;
	}

	// List view Product Description
	@FindBy(xpath = "//span[contains(text(),'Product Description')]") // product description
	private WebElement productMaster_ListViewProductDescription;

	public WebElement productMaster_ListViewProductDescription() {
		return productMaster_ListViewProductDescription;
	}

//	@FindBy(xpath = "//ion-select[@aria-label='Select,  Retail/Corporate *']") // retail // Corporate
	@FindBy(xpath = "//ion-row[1]/ion-col[5]/digital-select-layout[1]") // retail // Corporate
	private WebElement productMaster_RetailCorporate;

	public WebElement productMaster_RetailCorporate() {
		return productMaster_RetailCorporate;
	}

	// List view retail/Corporate
	@FindBy(xpath = "//span[contains(text(),'Retail/Corporate')]") // retail // Corporate
	private WebElement productMaster_ListViewRetailCorporate;

	public WebElement productMaster_ListViewRetailCorporate() {
		return productMaster_ListViewRetailCorporate;
	}

	// List view status
	@FindBy(xpath = "//thead/tr[1]/th[6]/span[1]")
	private WebElement productMaster_ListViewStatus;

	public WebElement productMaster_ListViewStatus() {
		return productMaster_ListViewStatus;
	}

	@FindBy(xpath = "//ion-label[text()=' Retail ']/parent::ion-item/ion-radio") // retail // corporate
	private WebElement productMaster_RetailCorporate_Dropdown;

	public WebElement productMaster_RetailCorporate_Dropdown() {
		return productMaster_RetailCorporate_Dropdown;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[6]//ion-item[1]//ion-input[1]/input")
	private WebElement productMaster_Product_DMCode;

	public WebElement productMaster_Product_DMCode() {
		return productMaster_Product_DMCode;
	}

	@FindBy(xpath = "//ion-textarea[1]//textarea[1]")
	private WebElement productMaster_Product_Remark;

	public WebElement productMaster_Product_Remark() {
		return productMaster_Product_Remark;
	}

//	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement productMaster_Product_Save;

	public WebElement productMaster_Product_Save() {
		return productMaster_Product_Save;
	}

	// product group required field validation
	@FindBy(xpath = "//ion-row[1]/ion-col[2]/div[1]/span[1]/div[1]/digital-form-error[1]/ion-badge[1]")
	private WebElement productMaster_Product_ProductGroupFieldValidation;

	public WebElement productMaster_Product_ProductGroupFieldValidation() {
		return productMaster_Product_ProductGroupFieldValidation;
	}

	// ProductCode required field validation
	@FindBy(xpath = "//ion-row[1]/ion-col[3]/div[1]/span[1]/div[1]/digital-form-error[1]/ion-badge[1]")
	private WebElement productMaster_Product_ProductCodeFieldValidation;

	public WebElement productMaster_Product_ProductCodeFieldValidation() {
		return productMaster_Product_ProductCodeFieldValidation;
	}

	// ProductDescription required field validation
	@FindBy(xpath = "//ion-row[1]/ion-col[4]/div[1]/span[1]/div[1]/digital-form-error[1]/ion-badge[1]")
	private WebElement productMaster_Product_ProductDescriptionFieldValidation;

	public WebElement productMaster_Product_ProductDescriptionFieldValidation() {
		return productMaster_Product_ProductDescriptionFieldValidation;
	}

	// RetailandCorporate required field validation
	@FindBy(xpath = "//ion-row[1]/ion-col[5]/div[1]/span[1]/div[1]/digital-form-error[1]/ion-badge[1]")
	private WebElement productMaster_Product_RetailandCorporateFieldValidation;

	public WebElement productMaster_Product_RetailandCorporateFieldValidation() {
		return productMaster_Product_RetailandCorporateFieldValidation;
	}

	// save success message
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

	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']/span[1]")
	private WebElement productMaster_Product_Back;

	public WebElement productMaster_Product_Back() {
		return productMaster_Product_Back;
	}

	@FindBy(xpath = "//div[1]//tbody[1]/tr[1]/td[1]//button[1]")
	private WebElement productMaster_Product_Edit;

	public WebElement productMaster_Product_Edit() {
		return productMaster_Product_Edit;
	}

	@FindBy(xpath = "//div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement productMaster_Product_Search;

	public WebElement productMaster_Product_Search() {
		return productMaster_Product_Search;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement productMaster_Product_SearchInbox;

	public WebElement productMaster_Product_SearchInbox() {
		return productMaster_Product_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement productMaster_Product_SearchInboxInputField;

	public WebElement productMaster_Product_SearchInboxInputField() {
		return productMaster_Product_SearchInboxInputField;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement productMaster_Product_SearchInboxCloseButton;

	public WebElement productMaster_Product_SearchInboxCloseButton() {
		return productMaster_Product_SearchInboxCloseButton;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement productMaster_Product_SearchInputField;

	public WebElement productMaster_Product_SearchInputField() {
		return productMaster_Product_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement productMaster_Product_SearchCloseButton;

	public WebElement productMaster_Product_SearchCloseButton() {
		return productMaster_Product_SearchCloseButton;
	}

//	@FindBy(xpath = "//ion-icon[@aria-label='mail outline']")
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement productMaster_Product_Inbox;

	public WebElement productMaster_Product_Inbox() {
		return productMaster_Product_Inbox;
	}

	// Select Record of related event code
	@FindBy(xpath = "(//td[contains(text(),' PRODUCT_MST ')]/../td[1]/button)[1]")
	private WebElement productMaster_Product_FirstModifiedRecord;

	public WebElement productMaster_Product_FirstModifiedRecord() {
		return productMaster_Product_FirstModifiedRecord;
	}

//	//Select Record of related event code
//	@FindBy(xpath = "(//td[contains(text(),' PRODUCT_MST ')]/../td[1]/button)[2]")
//	private WebElement productMaster_Product_SecondModifiedRecord;
//	
//	public WebElement productMaster_Product_SecondModifiedRecord() {
//		return productMaster_Product_SecondModifiedRecord;
//	}
//	
//	//Select Record of related event code
//	@FindBy(xpath = "(//td[contains(text(),' PRODUCT_MST ')]/../td[1]/button)[3]")
//	private WebElement productMaster_Product_ThirdModifiedRecord;
//	
//	public WebElement productMaster_Product_ThirdModifiedRecord() {
//		return productMaster_Product_ThirdModifiedRecord;
//	}

	// Get Reference ID of related event code
	@FindBy(xpath = "(//td[contains(text(),' PRODUCT_MST ')]/../td[2]/span)[1]")
	private WebElement productMaster_Product_FirstReferenceID;

	public WebElement productMaster_Product_FirstReferenceID() {
		return productMaster_Product_FirstReferenceID;
	}
//	//Get Reference ID of related event code
//	@FindBy(xpath = "(//td[contains(text(),' PRODUCT_MST ')]/../td[2]/span)[2]")
//	private WebElement productMaster_Product_SecondReferenceID;
//	
//	public WebElement productMaster_Product_SecondReferenceID() {
//		return productMaster_Product_SecondReferenceID;
//	}
//	//Get Reference ID of related event code
//	@FindBy(xpath = "(//td[contains(text(),' PRODUCT_MST ')]/../td[2]/span)[3]")
//	private WebElement productMaster_Product_ThirdReferenceID;
//	
//	public WebElement productMaster_Product_ThirdReferenceID() {
//		return productMaster_Product_ThirdReferenceID;
//	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement productMaster_Product_ReferanceId;

	public WebElement productMaster_Product_ReferanceId() {
		return productMaster_Product_ReferanceId;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]")
	private WebElement productMaster_Product_Action;

	public WebElement productMaster_Product_Action() {
		return productMaster_Product_Action;
	}

	// MakerRemarks
	@FindBy(xpath = "(//ion-textarea[1]//textarea[1])[2]")
	private WebElement productMaster_Product_MakerSubmitRemark;

	public WebElement productMaster_Product_MakerSubmitRemark() {
		return productMaster_Product_MakerSubmitRemark;
	}

	@FindBy(xpath = "//button/span[contains(text(),'Submit')]")
//	@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
	private WebElement productMaster_Product_Submit;

	public WebElement productMaster_Product_Submit() {
		return productMaster_Product_Submit;
	}

	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement productMaster_Product_ConfirmationMessage;

	public WebElement productMaster_Product_ConfirmationMessage() {
		return productMaster_Product_ConfirmationMessage;
	}

	// confirmation message close button
//	@FindBy(xpath = "//ion-label[contains(text(),'new record')]")
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement productMaster_Product_ConfirmationMessageCloseButton;

	public WebElement productMaster_Product_ConfirmationMessageCloseButton() {
		return productMaster_Product_ConfirmationMessageCloseButton;
	}

	// Next button list view
//	@FindBy(xpath = "(//div/button[3])[1]")
//	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/button[3]/span[1]")
	@FindBy(xpath = "(//button[@class='p-ripple p-element p-paginator-next p-paginator-element p-link']/span)[1]")
	private WebElement productMaster_Product_NextButtonListView;

	public WebElement productMaster_Product_NextButtonListView() {
		return productMaster_Product_NextButtonListView;
	}

//	// disabled Next button list view
//	@FindBy(xpath = "//kub-prime-table/p-table/div/p-paginator/div/button[3][@disabled='']/span")
//	private WebElement productMaster_Product_DisabledNextButtonListView;
//	
//	public WebElement productMaster_Product_DisabledNextButtonListView() {
//		return productMaster_Product_DisabledNextButtonListView;
//	}

	// Next button inbox
//	@FindBy(xpath = "(//div/button[3]/span)[2]")
	@FindBy(xpath = "(//button[@class='p-ripple p-element p-paginator-next p-paginator-element p-link']/span)[2]")
	private WebElement productMaster_Product_NextButtonInbox;

	public WebElement productMaster_Product_NextButtonInbox() {
		return productMaster_Product_NextButtonInbox;
	}

//	// Disabled Next button inbox
//	@FindBy(xpath = "//ion-card-content/p-table/div/p-paginator/div/button[3][@disabled='']/span")
//	private WebElement productMaster_Product_DisabledNextButtonInbox;
//	
//	public WebElement productMaster_Product_DisabledNextButtonInbox() {
//		return productMaster_Product_DisabledNextButtonInbox;
//	}

	@FindBy(xpath = "//button/span[contains(text(),'Cancel')]")
	private WebElement productMaster_Product_Cancel;

	public WebElement productMaster_Product_Cancel() {
		return productMaster_Product_Cancel;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='View Summary']")
	private WebElement productMaster_Product_ViewSummary;

	public WebElement productMaster_Product_ViewSummary() {
		return productMaster_Product_ViewSummary;
	}

//	@FindBy(xpath = "//button[@ng-reflect-label='Submit']/span[2]")
	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	private WebElement productMaster_Product_Maker_Submit;

	public WebElement productMaster_Product_Maker_Submit() {
		return productMaster_Product_Maker_Submit;
	}

	@FindBy(xpath = "//div[@id='toast-container']/div[1]")
	private WebElement productMaster_Product_Checker_Id;

	public WebElement productMaster_Product_Checker_Id() {
		return productMaster_Product_Checker_Id;
	}

	@FindBy(xpath = "//ion-item[1]/ion-toggle[1]")
	private WebElement productMaster_Product_Status;

	public WebElement productMaster_Product_Status() {
		return productMaster_Product_Status;
	}

	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement productMaster_Product_Export;

	public WebElement productMaster_Product_Export() {
		return productMaster_Product_Export;
	}

	@FindBy(xpath = " //li[@aria-label='PDF']") // PDF
	private WebElement productMaster_Product_PdfFile;

	public WebElement productMaster_Product_PdfFile() {
		return productMaster_Product_PdfFile;
	}

	@FindBy(xpath = " //li[@aria-label='XLS']") // XLS
	private WebElement productMaster_Product_XlsFile;

	public WebElement productMaster_Product_XlsFile() {
		return productMaster_Product_XlsFile;
	}

	// list view first field of product group
	@FindBy(xpath = "//tbody/tr[1]/td[2]/p-celleditor[1]/span[1]")
	private WebElement productMaster_Product_ListViewFirstFieldOfProductGroup;

	public WebElement productMaster_Product_ListViewFirstFieldOfProductGroup() {
		return productMaster_Product_ListViewFirstFieldOfProductGroup;
	}

	// list view first field of product code
	@FindBy(xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]/span[1]")
	private WebElement productMaster_Product_ListViewFirstFieldOfProductCode;

	public WebElement productMaster_Product_ListViewFirstFieldOfProductCode() {
		return productMaster_Product_ListViewFirstFieldOfProductCode;
	}

	// list view first field of particular product code desc30
	@FindBy(xpath = "//span[contains(text(),'desc30')]")
	private WebElement productMaster_Product_ListViewFirstFieldOfProductCode_desc30;

	public WebElement productMaster_Product_ListViewFirstFieldOfProductCode_desc30() {
		return productMaster_Product_ListViewFirstFieldOfProductCode_desc30;
	}

	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement productMaster_Product_NoDataFoundInSearch;

	public WebElement productMaster_Product_NoDataFoundInSearch() {
		return productMaster_Product_NoDataFoundInSearch;
	}

	// list view first field of product description
	@FindBy(xpath = "//tbody/tr[1]/td[4]/p-celleditor[1]/span[1]")
	private WebElement productMaster_Product_ListViewFirstFieldOfProductDescription;

	public WebElement productMaster_Product_ListViewFirstFieldOfProductDescription() {
		return productMaster_Product_ListViewFirstFieldOfProductDescription;
	}

	// list view first field of retail/corporate
	@FindBy(xpath = "//tbody/tr[1]/td[5]/p-celleditor[1]/span[1]")
	private WebElement productMaster_Product_ListViewFirstFieldOfRetailandCorporate;

	public WebElement productMaster_Product_ListViewFirstFieldOfRetailandCorporate() {
		return productMaster_Product_ListViewFirstFieldOfRetailandCorporate;
	}

	// ------------------CHECKER STAGE PAGEOBJECTS----------------//

	@FindBy(xpath = "//ion-menu-toggle/ion-button")
	private WebElement productMaster_Product_Checker_MenuToggle;

	public WebElement productMaster_Product_Checker_MenuToggle() {
		return productMaster_Product_Checker_MenuToggle;
	}

	@FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']/ion-icon[1]")
	private WebElement productMaster_Product_Checker_Inbox;

	public WebElement productMaster_Product_Checker_Inbox() {
		return productMaster_Product_Checker_Inbox;
	}

//	@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	private WebElement productMaster_Product_Checker_Approve;

	public WebElement productMaster_Product_Checker_Approve() {
		return productMaster_Product_Checker_Approve;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement productMaster_Product_Checker_CheckerApproveRemark;

	public WebElement productMaster_Product_Checker_CheckerApproveRemark() {
		return productMaster_Product_Checker_CheckerApproveRemark;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement productMaster_Product_Checker_CheckerApproveButton;

	public WebElement productMaster_Product_Checker_CheckerApproveButton() {
		return productMaster_Product_Checker_CheckerApproveButton;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement productMaster_Product_Checker_CheckerRejectRemark;

	public WebElement productMaster_Product_Checker_CheckerRejectRemark() {
		return productMaster_Product_Checker_CheckerRejectRemark;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement productMaster_Product_Checker_CheckerReturnRemark;

	public WebElement productMaster_Product_Checker_CheckerReturnRemark() {
		return productMaster_Product_Checker_CheckerReturnRemark;
	}

//	@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	private WebElement productMaster_Product_Checker_Reject;

	public WebElement productMaster_Product_Checker_Reject() {
		return productMaster_Product_Checker_Reject;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement productMaster_Product_Checker_CheckerRejectButton;

	public WebElement productMaster_Product_Checker_CheckerRejectButton() {
		return productMaster_Product_Checker_CheckerRejectButton;
	}

//	@FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]")
	@FindBy(xpath = "//span[contains(text(),'Return')]")
	private WebElement productMaster_Product_Checker_Return;

	public WebElement productMaster_Product_Checker_Return() {
		return productMaster_Product_Checker_Return;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement productMaster_Product_Checker_CheckerReturnButton;

	public WebElement productMaster_Product_Checker_CheckerReturnButton() {
		return productMaster_Product_Checker_CheckerReturnButton;
	}

	// Approve confirmation message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement productMaster_Product_ApproveConfirmationMessage;

	public WebElement productMaster_Product_ApproveConfirmationMessage() {
		return productMaster_Product_ApproveConfirmationMessage;
	}

	// Submit confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement productMaster_Product_ApproveConfirmationMessageCloseButton;

	public WebElement productMaster_Product_ApproveConfirmationMessageCloseButton() {
		return productMaster_Product_ApproveConfirmationMessageCloseButton;
	}

	// Invalid Datatype Validation Message
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement productMaster_Product_InvalidDatatypeValidationMessage;

	public WebElement productMaster_Product_InvalidDatatypeValidationMessage() {
		return productMaster_Product_InvalidDatatypeValidationMessage;
	}

	// status of record in list view
	@FindBy(xpath = "//span[contains(text(),'depo30')]/../../../td[6]/p-celleditor/p-tag/span")
	private WebElement productMaster_Product_DisplayStatus;

	public WebElement productMaster_Product_DisplayStatus() {
		return productMaster_Product_DisplayStatus;
	}

	// Product Master Title
	@FindBy(xpath = "//ion-title[contains(text(),'Product Master')]")
	private WebElement productMaster_Product_ProductMasterTitle;

	public WebElement productMaster_Product_ProductMasterTitle() {
		return productMaster_Product_ProductMasterTitle;
	}

	// logout
//	@FindBy(xpath = "//ion-label/div/div[2]/ion-icon")
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement productMaster_Product_LogoutUser;

	public WebElement productMaster_Product_LogoutUser() {
		return productMaster_Product_LogoutUser;
	}

	// --------------------------------------------------------------------//
	// --------------------------------------------------------------------//

	// Lending option from ProductGroup dropdown

	@FindBy(xpath = "//ion-label[contains(text(),'Lending')]/../ion-radio")
	private WebElement productMaster_ProductGroup_Dropdown;

	public WebElement productMaster_ProductGroup_Dropdown() {
		return productMaster_ProductGroup_Dropdown;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[4]//ion-item[1]//ion-input[1]/input")
	private WebElement productMaster_ProductDescriptionEnter;

	public WebElement productMaster_ProductDescriptionEnter() {
		return productMaster_ProductDescriptionEnter;
	}

	// product description English
	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[1]/input[1]")
	private WebElement productMaster_ProductDescription_English;

	public WebElement productMaster_ProductDescription_English() {
		return productMaster_ProductDescription_English;
	}

	// product description French
	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[2]/input[1]")
	private WebElement productMaster_ProductDescription_French;

	public WebElement productMaster_ProductDescription_French() {
		return productMaster_ProductDescription_French;
	}

	// product description German
	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[3]/input[1]")
	private WebElement productMaster_ProductDescription_German;

	public WebElement productMaster_ProductDescription_German() {
		return productMaster_ProductDescription_German;
	}

	// product description Arabic
	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[4]/input[1]")
	private WebElement productMaster_ProductDescription_Arabic;

	public WebElement productMaster_ProductDescription_Arabic() {
		return productMaster_ProductDescription_Arabic;
	}

	// product description save
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
	private WebElement productMaster_ProductDescription_Save;

	public WebElement productMaster_ProductDescription_Save() {
		return productMaster_ProductDescription_Save;
	}

	// ValidationRequiredField
	@FindBy(xpath = "//ion-badge[contains(text(),'Required field')]")
	private WebElement productMaster_Product_ValidationRequiredField;

	public WebElement productMaster_Product_ValidationRequiredField() {
		return productMaster_Product_ValidationRequiredField;
	}

	// ValidationAlphanumeric
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement productMaster_Product_ValidationAlphanumeric;

	public WebElement productMaster_Product_ValidationAlphanumeric() {
		return productMaster_Product_ValidationAlphanumeric;
	}

	// SuccessValidation
	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement productMaster_Product_SuccessValidation;

	public WebElement productMaster_Product_SuccessValidation() {
		return productMaster_Product_SuccessValidation;
	}

	// Menu
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-menu-toggle[1]/ion-button[1]")
	private WebElement productMaster_Product_Menu;

	public WebElement productMaster_Product_Menu() {
		return productMaster_Product_Menu;
	}

	// SearchRecordList
	@FindBy(xpath = "//div[1]/div[1]/div[1]/span[2]/button[1]/span[1]")
	private WebElement productMaster_Product_SearchRecordList;

	public WebElement productMaster_Product_SearchRecordList() {
		return productMaster_Product_SearchRecordList;
	}

	// SubmitRemark
	@FindBy(xpath = "//ion-label[contains(text(),'ok')]")
	private WebElement productMaster_Product_SubmitRemark;

	public WebElement productMaster_Product_SubmitRemark() {
		return productMaster_Product_SubmitRemark;
	}

	// FinalSubmit
	@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
	private WebElement productMaster_Product_FinalSubmit;

	public WebElement productMaster_Product_FinalSubmit() {
		return productMaster_Product_FinalSubmit;
	}

	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[8]/img[1]")
	private WebElement productMaster_Product_Profile;

	public WebElement productMaster_Product_Profile() {
		return productMaster_Product_Profile;
	}
	
	// Logout
//	@FindBy(xpath = "//ion-header/ion-toolbar[1]/div[1]/ion-item[1]/ion-label[1]/div[1]/div[2]/ion-icon[1]")
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement productMaster_Product_Logout;
	
	public WebElement productMaster_Product_Logout() {
		return productMaster_Product_Logout;
	}

	// Checker_ApproveRemark
	@FindBy(xpath = "//ion-label[contains(text(),'approve')]")
	private WebElement productMaster_Product_Checker_ApproveRemark;

	public WebElement productMaster_Product_Checker_ApproveRemark() {
		return productMaster_Product_Checker_ApproveRemark;
	}

	// Checker_ApproveAlert
	@FindBy(xpath = "(//span[contains(text(),'Approve')])[2]")
	private WebElement productMaster_Product_Checker_ApproveAlert;

	public WebElement productMaster_Product_Checker_ApproveAlert() {
		return productMaster_Product_Checker_ApproveAlert;
	}

	@FindBy(xpath = "//div[@id='toast-container']//button")
	private WebElement productMaster_Product_Checker_Alert_Close;

	public WebElement productMaster_Product_Checker_Alert_Close() {
		return productMaster_Product_Checker_Alert_Close;
	}

	// Checker_ReturnRemark
	@FindBy(xpath = "//ion-label[contains(text(),'return')]")
	private WebElement productMaster_Product_Checker_ReturnRemark;

	public WebElement productMaster_Product_Checker_ReturnRemark() {
		return productMaster_Product_Checker_ReturnRemark;
	}

	// Checker_ReturnAlert
	@FindBy(xpath = "(//span[contains(text(),'Return')])[2]")
	private WebElement productMaster_Product_Checker_ReturnAlert;

	public WebElement productMaster_Product_Checker_ReturnAlert() {
		return productMaster_Product_Checker_ReturnAlert;
	}

	// Checker_RejectRemark
	@FindBy(xpath = "//ion-label[contains(text(),'cancel')]")
	private WebElement productMaster_Product_Checker_RejectRemark;

	public WebElement productMaster_Product_Checker_RejectRemark() {
		return productMaster_Product_Checker_RejectRemark;
	}

	// Checker_RejectAlert
	@FindBy(xpath = "(//span[contains(text(),'Reject')])[2]")
	private WebElement productMaster_Product_Checker_RejectAlert;

	public WebElement productMaster_Product_Checker_RejectAlert() {
		return productMaster_Product_Checker_RejectAlert;
	}

	// SearchInputFieldClose
	@FindBy(xpath = "//div/span/i")
	private WebElement productMaster_Product_SearchInputFieldClose;

	public WebElement productMaster_Product_SearchInputFieldClose() {
		return productMaster_Product_SearchInputFieldClose;
	}

	// Edit
//	@FindBy(xpath = "//ion-card-content[1]/ion-item[3]/ion-buttons[1]/ion-button[1]")
	@FindBy(xpath = "//ion-label[contains(text(),'Product master')]/following-sibling::ion-buttons/ion-button[1]")
	private WebElement ProductMaster_Product_Edit;

	public WebElement ProductMaster_Product_Edit() {
		return ProductMaster_Product_Edit;
	}

	// ActionEdit
	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement ProductMaster_Product_ActionEdit;

	public WebElement ProductMaster_Product_ActionEdit() {
		return ProductMaster_Product_ActionEdit;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'User')]")
	private WebElement productMaster_Product_ViewSummaryUser;

	public WebElement productMaster_Product_ViewSummaryUser() {
		return productMaster_Product_ViewSummaryUser;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'Stage Code')]")
	private WebElement productMaster_Product_ViewSummaryStageCode;

	public WebElement productMaster_Product_ViewSummaryStageCode() {
		return productMaster_Product_ViewSummaryStageCode;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'Status')]")
	private WebElement productMaster_Product_ViewSummaryStatus;

	public WebElement productMaster_Product_ViewSummaryStatus() {
		return productMaster_Product_ViewSummaryStatus;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'Start Time')]")
	private WebElement productMaster_Product_ViewSummaryStartTime;

	public WebElement productMaster_Product_ViewSummaryStartTime() {
		return productMaster_Product_ViewSummaryStartTime;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'End Time')]")
	private WebElement productMaster_Product_ViewSummaryEndTime;

	public WebElement productMaster_Product_ViewSummaryEndTime() {
		return productMaster_Product_ViewSummaryEndTime;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'Remarks')]")
	private WebElement productMaster_Product_ViewSummaryRemarks;

	public WebElement productMaster_Product_ViewSummaryRemarks() {
		return productMaster_Product_ViewSummaryRemarks;
	}

	// ViewSummary
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
	private WebElement productMaster_Product_ViewSummaryClose;

	public WebElement productMaster_Product_ViewSummaryClose() {
		return productMaster_Product_ViewSummaryClose;
	}

	// product description
	// ion-row[1]/ion-col[4]//ion-item[1]//ion-input[1]/input
	@FindBy(xpath = "//ion-row[1]/ion-col[4]/digital-text-box[1]/ion-item[1]/ion-button[1]")
	private WebElement productMaster_ProductDescriptionAdd;

	public WebElement productMaster_ProductDescriptionAdd() {
		return productMaster_ProductDescriptionAdd;
	}
	
	//Change_Language 
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/section[1]/ion-list[1]/ion-item[5]/ion-select[1]") 
	private WebElement Language; 

	public WebElement Language() { 
	return Language; 

	} 

	// Language_French
	@FindBy(xpath = "//ion-label[contains(text(),'French')]/../ion-radio")
	private WebElement Language_French;

	public WebElement Language_French() {
		return Language_French;
	}

	// Language_German
	@FindBy(xpath = "//ion-label[contains(text(),'German')]/../ion-radio")
	private WebElement Language_German;

	public WebElement Language_German() {
		return Language_German;
	}

	// Language_Arabic
	@FindBy(xpath = "//ion-label[contains(text(),'Arabic')]/../ion-radio")
	private WebElement Language_Arabic;

	public WebElement Language_Arabic() {
		return Language_Arabic;
	}

	// Language_English
	@FindBy(xpath = "//ion-label[contains(text(),'English')]/../ion-radio")
	private WebElement Language_English;

	public WebElement Language_English() {
		return Language_English;
	}

	//Description Input Field
	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[1]/input[1]")
	private WebElement Description_MultilanguageInputField;

	public WebElement Description_MultilanguageInputField() {
		return Description_MultilanguageInputField;
	}
	
	// Description_Close
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
	private WebElement Description_Close;

	public WebElement Description_Close() {
		return Description_Close;
	}

}
