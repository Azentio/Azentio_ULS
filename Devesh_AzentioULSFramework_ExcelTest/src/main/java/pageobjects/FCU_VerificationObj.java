package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FCU_VerificationObj {
	WebDriver driver;

	public FCU_VerificationObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement fcuVerification_Maker_MenuToggle;

	public WebElement fcuVerification_Maker_MenuToggle() {
		return fcuVerification_Maker_MenuToggle;
	}

	// Back button
	@FindBy(xpath = "(//button[@ng-reflect-text='Go Back'])[2]")
	private WebElement fcuVerification_BackButton;

	public WebElement fcuVerification_BackButton() {
		return fcuVerification_BackButton;
	}
	
	// List of Agency Title
	@FindBy(xpath = "//ion-title[contains(text(),' List of Agency ')]")
	private WebElement fcuVerification_ListOfAgencyTitle;
	
	public WebElement fcuVerification_ListOfAgencyTitle() {
		return fcuVerification_ListOfAgencyTitle;
	}
	
	//Save button
	@FindBy(xpath = "//ion-col[3]/button[1]/span[1]")
	private WebElement fcuVerification_SaveButton;
	
	public WebElement fcuVerification_SaveButton() {
		return fcuVerification_SaveButton;
	}
	
	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement fcuVerification_SaveConfirmationMessage;

	public WebElement fcuVerification_SaveConfirmationMessage() {
		return fcuVerification_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement fcuVerification_SaveConfirmationMessageCloseButton;

	public WebElement fcuVerification_SaveConfirmationMessageCloseButton() {
		return fcuVerification_SaveConfirmationMessageCloseButton;
	}

	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[2]/div[1]")
	private WebElement fcuVerification_Inbox;

	public WebElement fcuVerification_Inbox() {
		return fcuVerification_Inbox;
	}
	
	// FCU Verification tab
	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement fcuVerification_FcuVerificationTab;
	
	public WebElement fcuVerification_FcuVerificationTab() {
		return fcuVerification_FcuVerificationTab;
	}
	
	// customer record edit button
	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]/span[1]")
	private WebElement fcuVerification_CustomerRecordEditButton;
	
	public WebElement fcuVerification_CustomerRecordEditButton() {
		return fcuVerification_CustomerRecordEditButton;
	}
	
	// fcu verification record edit button
	@FindBy(xpath = "(//tbody[1]/tr[1]/td[1]/span[1]/button[1]/span[1])[2]")
	private WebElement fcuVerification_FcuVerificationRecordEditButton;
	
	public WebElement fcuVerification_FcuVerificationRecordEditButton() {
		return fcuVerification_FcuVerificationRecordEditButton;
	}
	
	// List of customer title
	@FindBy(xpath = "//ion-title[contains(text(),'List of Customer')]")
	private WebElement fcuVerification_ListOfCustomerTitle;
	
	public WebElement fcuVerification_ListOfCustomerTitle() {
		return fcuVerification_ListOfCustomerTitle;
	}
	
	// Customer id
	@FindBy(xpath = "//tbody/tr/td[3]/p-celleditor/span")
	private WebElement fcuVerification_CustomerIdValue;
	
	public WebElement fcuVerification_CustomerIdValue() {
		return fcuVerification_CustomerIdValue;
	}
	
	// CIF id
	@FindBy(xpath = "//tbody/tr/td[0]/p-celleditor/span")
	private WebElement fcuVerification_CIFIdValue;
	
	public WebElement fcuVerification_CIFIdValue() {
		return fcuVerification_CIFIdValue;
	}
	
	// Customer Name
	@FindBy(xpath = "//tbody/tr/td[5]/p-celleditor/span")
	private WebElement fcuVerification_CustomerNameValue;
	
	public WebElement fcuVerification_CustomerNameValue() {
		return fcuVerification_CustomerNameValue;
	}
	
	// Customer Type
	@FindBy(xpath = "//tbody/tr/td[5]/p-celleditor/span")
	private WebElement fcuVerification_CustomerTypeValue;
	
	public WebElement fcuVerification_CustomerTypeValue() {
		return fcuVerification_CustomerTypeValue;
	}
	
	// Applicant Type
	@FindBy(xpath = "//tbody/tr/td[6]/p-celleditor/span")
	private WebElement fcuVerification_ApplicantTypeValue;
	
	public WebElement fcuVerification_ApplicantTypeValue() {
		return fcuVerification_ApplicantTypeValue;
	}
	
	// Status
	@FindBy(xpath = "//tbody/tr/td[7]/p-celleditor/span")
	private WebElement fcuVerification_StatusValue;
	
	public WebElement fcuVerification_StatusValue() {
		return fcuVerification_StatusValue;
	}
	
//  Export button
	@FindBy(xpath = "//span[contains(text(),'Export')]")
	private WebElement fcuVerification_ExportButton;
	
	public WebElement fcuVerification_ExportButton() {
		return fcuVerification_ExportButton;
	}
	
//  Export to PDF list view Field
	@FindBy(xpath = "//span[contains(text(),'PDF')]")
	private WebElement fcuVerification_ExportToPDF;
	
	public WebElement fcuVerification_ExportToPDF() {
		return fcuVerification_ExportToPDF;
	}
	
	//  Export to Excel list view Field
	@FindBy(xpath = "//span[contains(text(),'XLS')]")
	private WebElement fcuVerification_ExportToXls;
	
	public WebElement fcuVerification_ExportToXls() {
		return fcuVerification_ExportToXls;
	}
	
	//  Product code
	@FindBy(xpath = "//ion-label[text()=' Product Code ']/following-sibling::ion-input")
	private WebElement fcuVerification_ProductCode;
	
	public WebElement fcuVerification_ProductCode() {
		return fcuVerification_ProductCode;
	}
	
	// Sub Product code
	@FindBy(xpath = "//ion-label[text()=' Sub Product Code ']/following-sibling::ion-input")
	private WebElement fcuVerification_SubProductCode;
	
	public WebElement fcuVerification_SubProductCode() {
		return fcuVerification_SubProductCode;
	}
	
	// Source Employee id
	@FindBy(xpath = "//ion-label[text()=' Source Employee Id ']/following-sibling::ion-input")
	private WebElement fcuVerification_SourceEmployeeId;
	
	public WebElement fcuVerification_SourceEmployeeId() {
		return fcuVerification_SourceEmployeeId;
	}
	
	// Source Type
	@FindBy(xpath = "//ion-label[text()=' Sourcing Type ']/following-sibling::ion-input")
	private WebElement fcuVerification_SourcingType;
	
	public WebElement fcuVerification_SourcingType() {
		return fcuVerification_SourcingType;
	}
	
	// FCU Details
	@FindBy(xpath = "//ion-label[contains(text(),'FCU Details')]")
	private WebElement fcuVerification_FcuDetails;
	
	public WebElement fcuVerification_FcuDetails() {
		return fcuVerification_FcuDetails;
	}
	
	// Verification type
	@FindBy(xpath = "//ion-label[text()=' Verification Type ']/following-sibling::ion-select")
	private WebElement fcuVerification_VerificationType;
	
	public WebElement fcuVerification_VerificationType() {
		return fcuVerification_VerificationType;
	}
	
	// Verification Agency
	@FindBy(xpath = "//ion-label[text()=' Verification Agency ']/following-sibling::ion-select")
	private WebElement fcuVerification_VerificationAgency;
	
	public WebElement fcuVerification_VerificationAgency() {
		return fcuVerification_VerificationAgency;
	}
	
	// Agency Allocation Status 
	@FindBy(xpath = "//ion-label[text()=' Agency Allocation Status ']/following-sibling::ion-select")
	private WebElement fcuVerification_AgencyAllocationStatus;
	
	public WebElement fcuVerification_AgencyAllocationStatus() {
		return fcuVerification_AgencyAllocationStatus;
	}
	
	// Verification Status 
	@FindBy(xpath = "//ion-label[text()=' Verification Status ']/following-sibling::ion-select")
	private WebElement fcuVerification_VerificationStatus;
	
	public WebElement fcuVerification_VerificationStatus() {
		return fcuVerification_VerificationStatus;
	}
	
	// Desicion Type 
	@FindBy(xpath = "//ion-label[text()=' Desicion Type ']/following-sibling::ion-select")
	private WebElement fcuVerification_DecisionType;
	
	public WebElement fcuVerification_DecisionType() {
		return fcuVerification_DecisionType;
	}
	
	// waived by
	@FindBy(xpath = "//ion-label[text()=' Waived By ']/following-sibling::ion-select")
	private WebElement fcuVerification_WaivedBy;
	
	public WebElement fcuVerification_WaivedBy() {
		return fcuVerification_WaivedBy;
	}
	
	// Remarks 
	@FindBy(xpath = "(//ion-label[text()=' Remarks ']/following-sibling::ion-input/input)[1]")
	private WebElement fcuVerification_Remarks;
	
	public WebElement fcuVerification_Remarks() {
		return fcuVerification_Remarks;
	}
	
	// List view Verification type
	@FindBy(xpath = "//span[contains(text(),'Verification Type')]")
	private WebElement fcuVerification_ListViewVerificationTypeField;
	
	public WebElement fcuVerification_ListViewVerificationTypeField() {
		return fcuVerification_ListViewVerificationTypeField;
	}
	
	// List view Verification Id
	@FindBy(xpath = "//span[contains(text(),'Verification Id')]")
	private WebElement fcuVerification_ListViewVerificationIDField;
	
	public WebElement fcuVerification_ListViewVerificationIDField() {
		return fcuVerification_ListViewVerificationIDField;
	}
	
	// List view Verification Agency Name
	@FindBy(xpath = "//span[contains(text(),'Verification Agency Name')]")
	private WebElement fcuVerification_ListViewVerificationAgencyNameField;
	
	public WebElement fcuVerification_ListViewVerificationAgencyNameField() {
		return fcuVerification_ListViewVerificationAgencyNameField;
	}
	
	// List view Confirm/Waive Agency
	@FindBy(xpath = "//span[contains(text(),' Confirm/Waive Agency')]")
	private WebElement fcuVerification_ListViewConfirmWaiveAgencyField;
	
	public WebElement fcuVerification_ListViewConfirmWaiveAgencyField() {
		return fcuVerification_ListViewConfirmWaiveAgencyField;
	}
	
	// List view Report Allocation Date
	@FindBy(xpath = "//span[contains(text(),' Report Allocation Date')]")
	private WebElement fcuVerification_ListViewReportAllocationDateField;
	
	public WebElement fcuVerification_ListViewReportAllocationDateField() {
		return fcuVerification_ListViewReportAllocationDateField;
	}
	
	// List view Verification Status 
	@FindBy(xpath = "//span[contains(text(),' Verification Status ']/following')]")
	private WebElement fcuVerification_ListViewVerificationStatusField;
	
	public WebElement fcuVerification_ListViewVerificationStatusField() {
		return fcuVerification_ListViewVerificationStatusField;
	}
	
	// List view waived by
	@FindBy(xpath = "//span[contains(text(),' Waived By')]")
	private WebElement fcuVerification_ListViewWaivedByField;
	
	public WebElement fcuVerification_ListViewWaivedByField() {
		return fcuVerification_ListViewWaivedByField;
	}
	
	// Remarks 
	@FindBy(xpath = "//span[contains(text(),' Remarks')]")
	private WebElement fcuVerification_ListViewRemarksField;
	
	public WebElement fcuVerification_ListViewRemarksField() {
		return fcuVerification_ListViewRemarksField;
	}
	// List view Verification type Value
	@FindBy(xpath = "//ion-modal/descendant::td[3]/p-celleditor/span")
	private WebElement fcuVerification_ListViewVerificationTypeValue;
	
	public WebElement fcuVerification_ListViewVerificationTypeValue() {
		return fcuVerification_ListViewVerificationTypeValue;
	}
	
	// List view Verification Id Value 
	@FindBy(xpath = "//ion-modal/descendant::td[1]/p-celleditor/span")
	private WebElement fcuVerification_ListViewVerificationIDValue;
	
	public WebElement fcuVerification_ListViewVerificationIDValue() {
		return fcuVerification_ListViewVerificationIDValue;
	}
	
	// List view Verification Agency Name Value
	@FindBy(xpath = "//ion-modal/descendant::td[4]/p-celleditor/span")
	private WebElement fcuVerification_ListViewVerificationAgencyNameValue;
	
	public WebElement fcuVerification_ListViewVerificationAgencyNameValue() {
		return fcuVerification_ListViewVerificationAgencyNameValue;
	}
	
	// List view Confirm/Waive Agency
	@FindBy(xpath = "//ion-modal/descendant::td[5]/p-celleditor/span")
	private WebElement fcuVerification_ListViewConfirmWaiveAgencyValue;

	public WebElement fcuVerification_ListViewConfirmWaiveAgencyValue() {
		return fcuVerification_ListViewConfirmWaiveAgencyValue;
	}

	// List view Report Allocation Date
	@FindBy(xpath = "//ion-modal/descendant::td[6]/p-celleditor/span")
	private WebElement fcuVerification_ListViewReportAllocationDateValue;

	public WebElement fcuVerification_ListViewReportAllocationDateValue() {
		return fcuVerification_ListViewReportAllocationDateValue;
	}
	
	// List view Verification Status Value
	@FindBy(xpath = "//ion-modal/descendant::td[7]/p-celleditor/span")
	private WebElement fcuVerification_ListViewVerificationStatusValue;
	
	public WebElement fcuVerification_ListViewVerificationStatusValue() {
		return fcuVerification_ListViewVerificationStatusValue;
	}
	
	// List view waived by Value
	@FindBy(xpath = "//ion-modal/descendant::td[8]/p-celleditor/span")
	private WebElement fcuVerification_ListViewWaivedByValue;
	
	public WebElement fcuVerification_ListViewWaivedByValue() {
		return fcuVerification_ListViewWaivedByValue;
	}
	
	// Remarks Value
	@FindBy(xpath = "//ion-modal/descendant::td[9]/p-celleditor/span")
	private WebElement fcuVerification_ListViewRemarksValue;
	
	public WebElement fcuVerification_ListViewRemarksValue() {
		return fcuVerification_ListViewRemarksValue;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement fcuVerification_addButton;

	public WebElement fcuVerification_addButton() {
		return fcuVerification_addButton;
	}
	
	// ProductCode Inside Product Summary 
	@FindBy(xpath = "//ion-title[contains(text(),'Product Summary')]/ancestor::form/descendant::input[1]")
	private WebElement fcuVerification_ProductSummary_ProductCode;
	
	public WebElement fcuVerification_ProductSummary_ProductCode() {
		return fcuVerification_ProductSummary_ProductCode;
	}
	
	// Sub ProductCode Inside Product Summary 
	@FindBy(xpath = "//ion-title[contains(text(),'Product Summary')]/ancestor::form/descendant::input[2]")
	private WebElement fcuVerification_ProductSummary_SubProductCode;
	
	public WebElement fcuVerification_ProductSummary_SubProductCode() {
		return fcuVerification_ProductSummary_SubProductCode;
	}
	
	// Source Employee id Inside Product Summary 
	@FindBy(xpath = "//ion-title[contains(text(),'Product Summary')]/ancestor::form/descendant::input[3]")
	private WebElement fcuVerification_ProductSummary_SourceEmployeeID;
	
	public WebElement fcuVerification_ProductSummary_SourceEmployeeID() {
		return fcuVerification_ProductSummary_SourceEmployeeID;
	}
	
	// Sourcing Type Inside Product Summary 
	@FindBy(xpath = "//ion-title[contains(text(),'Product Summary')]/ancestor::form/descendant::input[4]")
	private WebElement fcuVerification_ProductSummary_SourcingType;
	
	public WebElement fcuVerification_ProductSummary_SourcingType() {
		return fcuVerification_ProductSummary_SourcingType;
	}
	
	
	// Verification Type Inside FCU Details
	@FindBy(xpath = "//ion-label[contains(text(),'FCU Details')]/ancestor::form/descendant::ion-select[1]")
	private WebElement fcuVerification_FcuDetails_VerificationType;
	
	public WebElement fcuVerification_FcuDetails_VerificationType() {
		return fcuVerification_FcuDetails_VerificationType;
	}
	
	// Verification Agency Name Inside FCU Details
	@FindBy(xpath = "//ion-label[contains(text(),'FCU Details')]/ancestor::form/descendant::ion-select[2]")
	private WebElement fcuVerification_FcuDetails_VerificationAgencyName;
	
	public WebElement fcuVerification_FcuDetails_VerificationAgencyName() {
		return fcuVerification_FcuDetails_VerificationAgencyName;
	}
	
	// Verification Status Inside FCU Details
	@FindBy(xpath = "//ion-label[contains(text(),'FCU Details')]/ancestor::form/descendant::ion-select[4]")
	private WebElement fcuVerification_FcuDetails_VerificationStatus;
	
	public WebElement fcuVerification_FcuDetails_VerificationStatus() {
		return fcuVerification_FcuDetails_VerificationStatus;
	}
	
	// Remakrs Inside FCU Details
	@FindBy(xpath = "//ion-label[contains(text(),'FCU Details')]/ancestor::form/descendant::input[7]")
	private WebElement fcuVerification_FcuDetails_Remarks;
	
	public WebElement fcuVerification_FcuDetails_Remarks() {
		return fcuVerification_FcuDetails_Remarks;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement fcuVerification_SearchInbox;

	public WebElement fcuVerification_SearchInbox() {
		return fcuVerification_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement fcuVerification_SearchInboxInputField;

	public WebElement fcuVerification_SearchInboxInputField() {
		return fcuVerification_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement fcuVerification_SearchInboxCloseButton;

	public WebElement fcuVerification_SearchInboxCloseButton() {
		return fcuVerification_SearchInboxCloseButton;
	}
	
	
	
	// search button
	@FindBy(xpath = "(//button[@ng-reflect-text='Search'])[2]")
	private WebElement fcuVerification_SearchButton;

	public WebElement fcuVerification_SearchButton() {
		return fcuVerification_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div[3]/span/input")
	private WebElement fcuVerification_SearchInputField;

	public WebElement fcuVerification_SearchInputField() {
		return fcuVerification_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement fcuVerification_SearchCloseButton;

	public WebElement fcuVerification_SearchCloseButton() {
		return fcuVerification_SearchCloseButton;
	}
	
	
	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[8]/img[1]")
	private WebElement fcuVerification_Profile;
	
	public WebElement fcuVerification_Profile() {
		return fcuVerification_Profile;
	}
	
	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement fcuVerification_LogoutUser;
	
	public WebElement fcuVerification_LogoutUser() {
		return fcuVerification_LogoutUser;
	}
	
	//FCU Form
	
	// List of documents title
	@FindBy(xpath = "//ion-title[contains(text(),' List of Documents ')]")
	private WebElement fcuVerification_ListOfDocumentsTitle;
	
	public WebElement fcuVerification_ListOfDocumentsTitle() {
		return fcuVerification_ListOfDocumentsTitle;
	}
	
	// FCU Report add button
	@FindBy(xpath = "(//button[@ng-reflect-text='Add'])[2]")
	private WebElement fcuVerification_FcuReportAddButton;
	
	public WebElement fcuVerification_FcuReportAddButton() {
		return fcuVerification_FcuReportAddButton;
	}
	
	// Document Type
	@FindBy(xpath = "//ion-label[text()=' Document Type ']/following-sibling::ion-select")
	private WebElement fcuVerification_FcuReport_DocumentType;
	
	public WebElement fcuVerification_FcuReport_DocumentType() {
		return fcuVerification_FcuReport_DocumentType;
	}
	
	// Sampled Type
	@FindBy(xpath = "//ion-label[text()=' Sampled Type ']/following-sibling::ion-select")
	private WebElement fcuVerification_FcuReport_SampledType;
	
	public WebElement fcuVerification_FcuReport_SampledType() {
		return fcuVerification_FcuReport_SampledType;
	}
	
	// No Of Docs
	@FindBy(xpath = "//ion-label[text()=' No Of Docs ']/following-sibling::ion-input/input")
	private WebElement fcuVerification_FcuReport_NoOfDocs;
	
	public WebElement fcuVerification_FcuReport_NoOfDocs() {
		return fcuVerification_FcuReport_NoOfDocs;
	}
	
	// Status
	@FindBy(xpath = "//ion-label[text()=' Status ']/following-sibling::ion-select")
	private WebElement fcuVerification_FcuReport_Status;
	
	public WebElement fcuVerification_FcuReport_Status() {
		return fcuVerification_FcuReport_Status;
	}
	
	// Remarks
	@FindBy(xpath = "(//ion-label[text()=' Remarks ']/following-sibling::ion-input/input)[3]")
	private WebElement fcuVerification_FcuReport_Remarks;
	
	public WebElement fcuVerification_FcuReport_Remarks() {
		return fcuVerification_FcuReport_Remarks;
	}
	
	//Save button
	@FindBy(xpath = "(//ion-col[3]/button[1]/span[1])[2]")
	private WebElement fcuVerification_FcuReport_SaveButton;

	public WebElement fcuVerification_FcuReport_SaveButton() {
		return fcuVerification_FcuReport_SaveButton;
	}
	
	// Status required field validation
	@FindBy(xpath = "//ion-label[contains(text(),' Status ')]/ancestor::ion-col//ion-badge[contains(text(),' Required field')]")
	private WebElement fcuVerification_FcuReport_StatusFieldValidation;

	public WebElement fcuVerification_FcuReport_StatusFieldValidation() {
		return fcuVerification_FcuReport_StatusFieldValidation;
	}

	// No of Docs invalid data type validation
	@FindBy(xpath = "//ion-label[contains(text(),' No Of Docs ')]/ancestor::ion-col//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement fcuVerification_FcuReport_NoOfDocsInvalidDataValidation;

	public WebElement fcuVerification_FcuReport_NoOfDocsInvalidDataValidation() {
		return fcuVerification_FcuReport_NoOfDocsInvalidDataValidation;
	}
	
	// search button
	@FindBy(xpath = "(//button[@ng-reflect-text='Search'])[3]")
	private WebElement fcuVerification_FcuReport_SearchButton;

	public WebElement fcuVerification_FcuReport_SearchButton() {
		return fcuVerification_FcuReport_SearchButton;
	}
	
	// customer record edit button
	@FindBy(xpath = "(//tbody[1]/tr[1]/td[1]/span[1]/button[1]/span[1])[3]")
	private WebElement fcuVerification_FcuReportRecordEditButton;

	public WebElement fcuVerification_FcuReportRecordEditButton() {
		return fcuVerification_FcuReportRecordEditButton;
	}

	
}
