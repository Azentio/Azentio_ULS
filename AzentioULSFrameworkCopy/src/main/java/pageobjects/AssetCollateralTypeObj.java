package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetCollateralTypeObj {
	WebDriver driver;

	public AssetCollateralTypeObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath = "//h4[contains(text(),'Asset Collateral Config')]")
	@FindBy(xpath = "//ion-label[contains(text(),'Asset Collateral Config')]")
	private WebElement assetCollateralConfigMenu;

	public WebElement assetCollateralConfigMenu() {
		return assetCollateralConfigMenu;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
	private WebElement assetCollateralConfigurations;
	
	public WebElement assetCollateralConfigurations() {
		return assetCollateralConfigurations;
	}

//	@FindBy(xpath = "//h4[contains(text(),'Collateral type')]/ancestor::ion-label/following-sibling::ion-buttons/ion-button[1]")
	@FindBy(xpath = "//ion-label[contains(text(),'Collateral type')]/following-sibling::ion-buttons/ion-button[1]")
	private WebElement assetCollateralType_TempView;

	public WebElement assetCollateralType_TempView() {
		return assetCollateralType_TempView;
	}

//	@FindBy(xpath = "//h4[contains(text(),'Collateral type')]/ancestor::ion-label/following-sibling::ion-buttons/ion-button[2]")
	@FindBy(xpath = "//ion-label[contains(text(),'Collateral type')]/following-sibling::ion-buttons/ion-button[2]")
	private WebElement assetCollateralType_View;

	public WebElement assetCollateralType_View() {
		return assetCollateralType_View;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement assetCollateralType_addButton;

	public WebElement assetCollateralType_addButton() {
		return assetCollateralType_addButton;
	}

//	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	@FindBy(xpath = "//ion-row[2]/ion-col[1]/button[1]/span[1]")
	private WebElement assetCollateralType_BackButton;

	public WebElement assetCollateralType_BackButton() {
		return assetCollateralType_BackButton;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement assetCollateralType_SearchButton;

	public WebElement assetCollateralType_SearchButton() {
		return assetCollateralType_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement assetCollateralType_SearchInputField;

	public WebElement assetCollateralType_SearchInputField() {
		return assetCollateralType_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement assetCollateralType_SearchCloseButton;

	public WebElement assetCollateralType_SearchCloseButton() {
		return assetCollateralType_SearchCloseButton;
	}

	// Asset Collateral Type Code required field validation
	@FindBy(xpath = "//ion-label[contains(text(),' Asset/Collateral type code ')]/ancestor::ion-col//ion-badge[contains(text(),' Required field')]")
	private WebElement assetCollateralType_AssetCollateralTypeCodeFieldValidation;

	public WebElement assetCollateralType_AssetCollateralTypeCodeFieldValidation() {
		return assetCollateralType_AssetCollateralTypeCodeFieldValidation;
	}

	// Description invalid data type validation
	@FindBy(xpath = "//ion-label[contains(text(),' Asset/Collateral type code ')]/ancestor::ion-col//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement assetCollateralType_AssetCollateralTypeCodeInvalidDataValidation;

	public WebElement assetCollateralType_AssetCollateralTypeCodeInvalidDataValidation() {
		return assetCollateralType_AssetCollateralTypeCodeInvalidDataValidation;
	}

	// Description input fields
	@FindBy(xpath = "//ion-label[contains(text(),' Description ')]/following::ion-input[1]/input")
	private WebElement assetCollateralType_Description;

	public WebElement assetCollateralType_Description() {
		return assetCollateralType_Description;
	}

	// Description Multilingual
	@FindBy(xpath = "//ion-label[contains(text(),' Description ')]/following-sibling::ion-button")
	private WebElement assetCollateralType_DescriptionMultilingual;

	public WebElement assetCollateralType_DescriptionMultilingual() {
		return assetCollateralType_DescriptionMultilingual;
	}
	
	// Application Language
	@FindBy(xpath = "//ion-item[5]/ion-select")
	private WebElement assetCollateralType_ApplicationLanguage;
	
	public WebElement assetCollateralType_ApplicationLanguage() {
		return assetCollateralType_ApplicationLanguage;
	}
	
	// Application Language English radio button
	@FindBy(xpath = "//ion-label[contains(text(),'English')]/../ion-radio")
	private WebElement assetCollateralType_ApplicationLanguageEnglish;
	
	public WebElement assetCollateralType_ApplicationLanguageEnglish() {
		return assetCollateralType_ApplicationLanguageEnglish;
	}
	
	// Application Language French radio button
	@FindBy(xpath = "//ion-label[contains(text(),'French')]/../ion-radio")
	private WebElement assetCollateralType_ApplicationLanguageFrench;
	
	public WebElement assetCollateralType_ApplicationLanguageFrench() {
		return assetCollateralType_ApplicationLanguageFrench;
	}
	
	// Application Language German radio button
	@FindBy(xpath = "//ion-label[contains(text(),'German')]/../ion-radio")
	private WebElement assetCollateralType_ApplicationLanguageGerman;
	
	public WebElement assetCollateralType_ApplicationLanguageGerman() {
		return assetCollateralType_ApplicationLanguageGerman;
	}
	
	// Application Language Arabic radio button
	@FindBy(xpath = "//ion-label[contains(text(),'Arabic')]/../ion-radio")
	private WebElement assetCollateralType_ApplicationLanguageArabic;
	
	public WebElement assetCollateralType_ApplicationLanguageArabic() {
		return assetCollateralType_ApplicationLanguageArabic;
	}

	// Description MultilangualInputField
	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[1]/input[1]")
	private WebElement assetCollateralType_DescriptionSelectedLanguageInputField;

	public WebElement assetCollateralType_DescriptionSelectedLanguageInputField() {
		return assetCollateralType_DescriptionSelectedLanguageInputField;
	}

//	// Description French
//	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[2]/input[1]")
//	private WebElement assetCollateralType_Description_French;
//
//	public WebElement assetCollateralType_Description_French() {
//		return assetCollateralType_Description_French;
//	}
//
//	// Description German
//	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[3]/input[1]")
//	private WebElement assetCollateralType_Description_German;
//
//	public WebElement assetCollateralType_Description_German() {
//		return assetCollateralType_Description_German;
//	}
//
//	// Description Arabic
//	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[4]/input[1]")
//	private WebElement assetCollateralType_Description_Arabic;
//
//	public WebElement assetCollateralType_Description_Arabic() {
//		return assetCollateralType_Description_Arabic;
//	}

	// description multilingual save
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
	private WebElement assetCollateralType_DescriptionMultilingual_Save;

	public WebElement assetCollateralType_DescriptionMultilingual_Save() {
		return assetCollateralType_DescriptionMultilingual_Save;
	}

	// Asset/Collateral type code input fields
	@FindBy(xpath = "//ion-label[contains(text(),' Asset/Collateral type code ')]/following::ion-input[1]/input")
	private WebElement assetCollateralType_AssetCollateralTypeCode;

	public WebElement assetCollateralType_AssetCollateralTypeCode() {
		return assetCollateralType_AssetCollateralTypeCode;
	}

	// Asset/Collateral Category select
	@FindBy(xpath = "//ion-label[contains(text(),' Asset/Collateral Category ')]/following-sibling::ion-select")
	private WebElement assetCollateralType_AssetCollateralCategory;

	public WebElement assetCollateralType_AssetCollateralCategory() {
		return assetCollateralType_AssetCollateralCategory;
	}

	// Module select
	@FindBy(xpath = "//ion-label[contains(text(),'Module')]/following-sibling::ion-select")
	private WebElement assetCollateralType_Module;

	public WebElement assetCollateralType_Module() {
		return assetCollateralType_Module;
	}

	// IFRS select
	@FindBy(xpath = "//ion-label[contains(text(),'IFRS')]/following-sibling::ion-select")
	private WebElement assetCollateralType_IFRS;

	public WebElement assetCollateralType_IFRS() {
		return assetCollateralType_IFRS;
	}
	
	// radio select button
	@FindBy(xpath = "//ion-radio-group//ion-label[contains(text(),'Select')]")
	private WebElement assetCollateralType_RadioButtonSelect;
	
	public WebElement assetCollateralType_RadioButtonSelect() {
		return assetCollateralType_RadioButtonSelect;
	}

	// HairCut % input field
	@FindBy(xpath = "//ion-label[contains(text(),'  HairCut % ')]/following-sibling::ion-input/input")
	private WebElement assetCollateralType_HairCutPercent;

	public WebElement assetCollateralType_HairCutPercent() {
		return assetCollateralType_HairCutPercent;
	}

	// HairCut % up to 4 decimal allowed
	@FindBy(xpath = "//ion-badge[contains(text(),' Up To Four Decimal Allowed')]")
	private WebElement assetCollateralType_HairCutPercentUp2FourDecimal;

	public WebElement assetCollateralType_HairCutPercentUp2FourDecimal() {
		return assetCollateralType_HairCutPercentUp2FourDecimal;
	}

	// Remarks input field
	@FindBy(xpath = "//ion-label[contains(text(),' Remarks ')]/following-sibling::ion-textarea/div/textarea")
	private WebElement assetCollateralType_Remarks;

	public WebElement assetCollateralType_Remarks() {
		return assetCollateralType_Remarks;
	}

	// Save Button
//	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
//	@FindBy(xpath = "//ion-col[3]/button/span[1]")
	private WebElement assetCollateralType_SaveButton;

	public WebElement assetCollateralType_SaveButton() {
		return assetCollateralType_SaveButton;
	}

	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement assetCollateralType_SaveConfirmationMessage;

	public WebElement assetCollateralType_SaveConfirmationMessage() {
		return assetCollateralType_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement assetCollateralType_SaveConfirmationMessageCloseButton;

	public WebElement assetCollateralType_SaveConfirmationMessageCloseButton() {
		return assetCollateralType_SaveConfirmationMessageCloseButton;
	}

	// First Record Edit button
	@FindBy(xpath = "//tbody[1]/tr[1]/td[1]/span[1]/button[1]/span[1]")
	private WebElement assetCollateralType_FirstRecordEditButton;

	public WebElement assetCollateralType_FirstRecordEditButton() {
		return assetCollateralType_FirstRecordEditButton;
	}

	// List View Title
	@FindBy(xpath = "//ion-title[contains(text(),'List of Asset/Collateral type')]")
	private WebElement assetCollateralType_ListViewtitle;

	public WebElement assetCollateralType_ListViewtitle() {
		return assetCollateralType_ListViewtitle;
	}

	// inbox
//	@FindBy(xpath = "//ion-icon[@aria-label='mail outline']")
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement assetCollateralType_Inbox;

	public WebElement assetCollateralType_Inbox() {
		return assetCollateralType_Inbox;
	}

	// inbox new created record
	@FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]")
	private WebElement assetCollateralType_NewSavedRecord;

	public WebElement assetCollateralType_NewSavedRecord() {
		return assetCollateralType_NewSavedRecord;
	}

	// new record reference id
	@FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]")
	private WebElement assetCollateralType_NewRecordReferenceID;

	public WebElement assetCollateralType_NewRecordReferenceID() {
		return assetCollateralType_NewRecordReferenceID;
	}

	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[8]/img[1]")
	private WebElement assetCollateralType_Profile;

	public WebElement assetCollateralType_Profile() {
		return assetCollateralType_Profile;
	}
	
	// logout
//	@FindBy(xpath = "//ion-label/div/div[2]/ion-icon")
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement assetCollateralType_LogoutUser;
	
	public WebElement assetCollateralType_LogoutUser() {
		return assetCollateralType_LogoutUser;
	}

	// MakerRemarks
	@FindBy(xpath = "(//ion-textarea[1]//textarea[1])[2]")
	private WebElement assetCollateralType_MakerSubmitRemark;

	public WebElement assetCollateralType_MakerSubmitRemark() {
		return assetCollateralType_MakerSubmitRemark;
	}

	// Submit
	@FindBy(xpath = "//button/span[contains(text(),'Submit')]")
	private WebElement assetCollateralType_Submit;

	public WebElement assetCollateralType_Submit() {
		return assetCollateralType_Submit;
	}

	// FinalSubmit
	@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
	private WebElement assetCollateralType_FinalSubmit;

	public WebElement assetCollateralType_FinalSubmit() {
		return assetCollateralType_FinalSubmit;
	}

	// Confirmation Message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement assetCollateralType_ConfirmationMessage;

	public WebElement assetCollateralType_ConfirmationMessage() {
		return assetCollateralType_ConfirmationMessage;
	}

	// confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement assetCollateralType_ConfirmationMessageCloseButton;

	public WebElement assetCollateralType_ConfirmationMessageCloseButton() {
		return assetCollateralType_ConfirmationMessageCloseButton;
	}

	// Menu toggle
	@FindBy(xpath = "//ion-menu-toggle/ion-button")
	private WebElement assetCollateralType_Checker_MenuToggle;

	public WebElement assetCollateralType_Checker_MenuToggle() {
		return assetCollateralType_Checker_MenuToggle;
	}

	@FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']/ion-icon[1]")
	private WebElement assetCollateralType_Checker_Inbox;

	public WebElement assetCollateralType_Checker_Inbox() {
		return assetCollateralType_Checker_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement assetCollateralType_Checker_SearchInbox;

	public WebElement assetCollateralType_Checker_SearchInbox() {
		return assetCollateralType_Checker_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement assetCollateralType_Checker_SearchInboxInputField;

	public WebElement assetCollateralType_Checker_SearchInboxInputField() {
		return assetCollateralType_Checker_SearchInboxInputField;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement assetCollateralType_Checker_SearchInboxCloseButton;

	public WebElement assetCollateralType_Checker_SearchInboxCloseButton() {
		return assetCollateralType_Checker_SearchInboxCloseButton;
	}

//	@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	private WebElement assetCollateralType_Checker_Approve;

	public WebElement assetCollateralType_Checker_Approve() {
		return assetCollateralType_Checker_Approve;
	}

	// approve remark mandatory
	@FindBy(xpath = "//ion-label[contains(text(),' Please Enter Remarks ')]/ion-text")
	private WebElement assetCollateralType_Checker_CheckerRemarkMandatory;

	public WebElement assetCollateralType_Checker_CheckerRemarkMandatory() {
		return assetCollateralType_Checker_CheckerRemarkMandatory;
	}

	// approve remark
	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement assetCollateralType_Checker_CheckerApproveRemark;

	public WebElement assetCollateralType_Checker_CheckerApproveRemark() {
		return assetCollateralType_Checker_CheckerApproveRemark;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement assetCollateralType_Checker_CheckerApproveButton;

	public WebElement assetCollateralType_Checker_CheckerApproveButton() {
		return assetCollateralType_Checker_CheckerApproveButton;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement assetCollateralType_Checker_CheckerRejectRemark;

	public WebElement assetCollateralType_Checker_CheckerRejectRemark() {
		return assetCollateralType_Checker_CheckerRejectRemark;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement assetCollateralType_Checker_CheckerReturnRemark;

	public WebElement assetCollateralType_Checker_CheckerReturnRemark() {
		return assetCollateralType_Checker_CheckerReturnRemark;
	}

//	@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	private WebElement assetCollateralType_Checker_Reject;

	public WebElement assetCollateralType_Checker_Reject() {
		return assetCollateralType_Checker_Reject;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement assetCollateralType_Checker_CheckerRejectButton;

	public WebElement assetCollateralType_Checker_CheckerRejectButton() {
		return assetCollateralType_Checker_CheckerRejectButton;
	}

//	@FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]")
	@FindBy(xpath = "//span[contains(text(),'Return')]")
	private WebElement assetCollateralType_Checker_Return;

	public WebElement assetCollateralType_Checker_Return() {
		return assetCollateralType_Checker_Return;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement assetCollateralType_Checker_CheckerReturnButton;

	public WebElement assetCollateralType_Checker_CheckerReturnButton() {
		return assetCollateralType_Checker_CheckerReturnButton;
	}

	// Approve confirmation message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement assetCollateralType_Checker_ApproveConfirmationMessage;

	public WebElement assetCollateralType_Checker_ApproveConfirmationMessage() {
		return assetCollateralType_Checker_ApproveConfirmationMessage;
	}

	// Submit confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement assetCollateralType_Checker_ApproveConfirmationMessageCloseButton;

	public WebElement assetCollateralType_Checker_ApproveConfirmationMessageCloseButton() {
		return assetCollateralType_Checker_ApproveConfirmationMessageCloseButton;
	}

	// list view first field of AssetCollateralTypeCode
	@FindBy(xpath = "//tbody/tr[1]/td[3]/p-celleditor/span")
	private WebElement assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode;

	public WebElement assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode() {
		return assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode;
	}

	// list view first field of Description
	@FindBy(xpath = "///tbody/tr[1]/td[4]/p-celleditor/span")
	private WebElement assetCollateralType_ListViewFirstFieldOfDescription;

	public WebElement assetCollateralType_ListViewFirstFieldOfDescription() {
		return assetCollateralType_ListViewFirstFieldOfDescription;
	}

	// list view first field of Asset Collateral Category description
	@FindBy(xpath = "//tbody/tr[1]/td[5]/p-celleditor/span")
	private WebElement assetCollateralType_ListViewFirstFieldOfAssetCollateralCategoryDescription;

	public WebElement assetCollateralType_ListViewFirstFieldOfAssetCollateralCategoryDescription() {
		return assetCollateralType_ListViewFirstFieldOfAssetCollateralCategoryDescription;
	}

	// list view first field of particular product code test1
	@FindBy(xpath = "//span[contains(text(),'test1')]")
	private WebElement assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode_test1;

	public WebElement assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode_test1() {
		return assetCollateralType_ListViewFirstFieldOfAssetCollateralTypeCode_test1;
	}

	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement assetCollateralType_NoDataFoundInSearch;

	public WebElement assetCollateralType_NoDataFoundInSearch() {
		return assetCollateralType_NoDataFoundInSearch;
	}
	
	//export
	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement assetCollateralType_Export;

	public WebElement assetCollateralType_Export() {
		return assetCollateralType_Export;
	}
	
	//pdf
	@FindBy(xpath = " //li[@aria-label='PDF']") // PDF
	private WebElement assetCollateralType_Product_PdfFile;

	public WebElement assetCollateralType_Product_PdfFile() {
		return assetCollateralType_Product_PdfFile;
	}
	
	//xls
	@FindBy(xpath = " //li[@aria-label='XLS']") // XLS
	private WebElement assetCollateralType_XlsFile;

	public WebElement assetCollateralType_XlsFile() {
		return assetCollateralType_XlsFile;
	}
	
	//List View Asset/Collateral Category Description
	@FindBy(xpath = "//span[contains(text(),'AssetCollateral Category Description')]")
	private WebElement assetCollateralType_ListViewAssetCollateralCategoryDescription;
	
	public WebElement assetCollateralType_ListViewAssetCollateralCategoryDescription() {
		return assetCollateralType_ListViewAssetCollateralCategoryDescription;
	}
	
	//List View Asset/Collateral type code
	@FindBy(xpath = "//span[contains(text(),'Asset/Collateral type Code')]")
	private WebElement assetCollateralType_ListViewAssetCollateralTypeCode;
	
	public WebElement assetCollateralType_ListViewAssetCollateralTypeCode() {
		return assetCollateralType_ListViewAssetCollateralTypeCode;
	}
	
	//List View Description
	@FindBy(xpath = "//thead/tr[1]/th[4]/span[1]")
	private WebElement assetCollateralType_ListViewDescription;
	
	public WebElement assetCollateralType_ListViewDescription() {
		return assetCollateralType_ListViewDescription;
	}
	
	//List View AuthorizationStatus
	@FindBy(xpath = "//thead/tr[1]/th[9]/span[1]")
	private WebElement assetCollateralType_ListViewAuthorizationStatus;
	
	public WebElement assetCollateralType_ListViewAuthorizationStatus() {
		return assetCollateralType_ListViewAuthorizationStatus;
	}
	
	//Footer for paginator
	@FindBy(xpath = "//p-paginator")
	private WebElement assetCollateralType_FooterForPaginator;
	
	public WebElement assetCollateralType_FooterForPaginator() {
		return assetCollateralType_FooterForPaginator;
	}

}
