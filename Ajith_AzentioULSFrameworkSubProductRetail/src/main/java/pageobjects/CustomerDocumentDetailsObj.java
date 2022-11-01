package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDocumentDetailsObj {
	WebDriver driver;
	public CustomerDocumentDetailsObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement customerDocumentDetails_Maker_MenuToggle;

	public WebElement customerDocumentDetails_Maker_MenuToggle() {
		return customerDocumentDetails_Maker_MenuToggle;
	}
	
	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement customerDocumentDetails_Inbox;

	public WebElement customerDocumentDetails_Inbox() {
		return customerDocumentDetails_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement customerDocumentDetails_SearchInbox;

	public WebElement customerDocumentDetails_SearchInbox() {
		return customerDocumentDetails_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement customerDocumentDetails_SearchInboxInputField;

	public WebElement customerDocumentDetails_SearchInboxInputField() {
		return customerDocumentDetails_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement customerDocumentDetails_SearchInboxCloseButton;

	public WebElement customerDocumentDetails_SearchInboxCloseButton() {
		return customerDocumentDetails_SearchInboxCloseButton;
	}
	
	// search button
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement customerDocumentDetails_SearchButton;

	public WebElement customerDocumentDetails_SearchButton() {
		return customerDocumentDetails_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div[3]/span/input")
	private WebElement customerDocumentDetails_SearchInputField;

	public WebElement customerDocumentDetails_SearchInputField() {
		return customerDocumentDetails_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span[1]/i")
	private WebElement customerDocumentDetails_SearchCloseButton;

	public WebElement customerDocumentDetails_SearchCloseButton() {
		return customerDocumentDetails_SearchCloseButton;
	}
	
	// customer financial tab button
	@FindBy(xpath = "//ion-segment-button[@id='seg6']")
	private WebElement customerDocumentDetails_DocumentDetailTab;
	
	public WebElement customerDocumentDetails_DocumentDetailTab() {
		return customerDocumentDetails_DocumentDetailTab;
	}
	
	// Customer Employment first record edit button
	@FindBy(xpath = "//ion-title[contains(text(),' Document Details ')]/../../ion-card-content/descendant::tbody/tr/td[1]/span/button[1]")
	private WebElement customerDocumentDetails_DocumentDetailFirstRecordEdit;
	
	public WebElement customerDocumentDetails_DocumentDetailFirstRecordEdit() {
		return customerDocumentDetails_DocumentDetailFirstRecordEdit;
	}
	
	// Document Name
	@FindBy(xpath = "//ion-label[contains(text(),' Document Name')]/../ion-select")
	private WebElement customerDocumentDetails_DocumentName;
	
	public WebElement customerDocumentDetails_DocumentName() {
		return customerDocumentDetails_DocumentName;
	}
	
	// Mandatory/Optional
	@FindBy(xpath = "//ion-label[contains(text(),'Mandatory/Optional')]/../ion-select")
	private WebElement customerDocumentDetails_MandatoryOrOptional;
	
	public WebElement customerDocumentDetails_MandatoryOrOptional() {
		return customerDocumentDetails_MandatoryOrOptional;
	}
	
	// Document Category
	@FindBy(xpath = "//ion-label[contains(text(),'Document Category')]/../ion-select")
	private WebElement customerDocumentDetails_DocumentCategory;
	
	public WebElement customerDocumentDetails_DocumentCategory() {
		return customerDocumentDetails_DocumentCategory;
	}
	
	// Document Status
	@FindBy(xpath = "//ion-label[contains(text(),' Document Status')]/../ion-select")
	private WebElement customerDocumentDetails_DocumentStatus;
	
	public WebElement customerDocumentDetails_DocumentStatus() {
		return customerDocumentDetails_DocumentStatus;
	}
	

	//Save button
	@FindBy(xpath = "//ion-col[3]/button[1]/span[1]")
	private WebElement customerDocumentDetails_SaveButton;
	
	public WebElement customerDocumentDetails_SaveButton() {
		return customerDocumentDetails_SaveButton;
	}
	
	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement customerDocumentDetails_SaveConfirmationMessage;

	public WebElement customerDocumentDetails_SaveConfirmationMessage() {
		return customerDocumentDetails_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement customerDocumentDetails_SaveConfirmationMessageCloseButton;

	public WebElement customerDocumentDetails_SaveConfirmationMessageCloseButton() {
		return customerDocumentDetails_SaveConfirmationMessageCloseButton;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement customerDocumentDetails_AddButton;

	public WebElement customerDocumentDetails_AddButton() {
		return customerDocumentDetails_AddButton;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement customerDocumentDetails_BackButton;
	
	public WebElement customerDocumentDetails_BackButton() {
		return customerDocumentDetails_BackButton;
	}
	
	@FindBy(xpath = "//ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
	private WebElement customerDocumentDetails_ListViewBackButton;
	
	public WebElement customerDocumentDetails_ListViewBackButton() {
		return customerDocumentDetails_ListViewBackButton;
	}
	
	@FindBy(xpath = "//ion-title[contains(text(),'Document Details')]")
	private WebElement customerDocumentDetails_DocumentDetailsScreen;
	
	public WebElement customerDocumentDetails_DocumentDetailsScreen() {
		return customerDocumentDetails_DocumentDetailsScreen;
	}
	
	//List View number
	@FindBy(xpath = "//span[contains(text(),'No.')]")
	private WebElement customerDocumentDetails_ListViewFieldNumber;
	
	public WebElement customerDocumentDetails_ListViewFieldNumber() {
		return customerDocumentDetails_ListViewFieldNumber;
	}
	
	//List View number value
	@FindBy(xpath = "//kub-prime-table/descendant::td[2]")
	private WebElement customerDocumentDetails_ListViewNumberValue;
	
	public WebElement customerDocumentDetails_ListViewNumberValue() {
		return customerDocumentDetails_ListViewNumberValue;
	}
	
	//List View Document Name
	@FindBy(xpath = "//span[contains(text(),'Document Name')]")
	private WebElement customerDocumentDetails_ListViewFieldDocumentName;
	
	public WebElement customerDocumentDetails_ListViewFieldDocumentName() {
		return customerDocumentDetails_ListViewFieldDocumentName;
	}

	//List View Document Name value
	@FindBy(xpath = "//kub-prime-table/descendant::td[3]")
	private WebElement customerDocumentDetails_ListViewDocumentNameValue;
	
	public WebElement customerDocumentDetails_ListViewDocumentNameValue() {
		return customerDocumentDetails_ListViewDocumentNameValue;
	}
	
	//List View Required At Stage
	@FindBy(xpath = "//span[contains(text(),'Required At Stage')]")
	private WebElement customerDocumentDetails_ListViewFieldRequiredAtStage;
	
	public WebElement customerDocumentDetails_ListViewFieldRequiredAtStage() {
		return customerDocumentDetails_ListViewFieldRequiredAtStage;
	}
	
	// List View Required At Stage value
	@FindBy(xpath = "//kub-prime-table/descendant::td[3]")
	private WebElement customerDocumentDetails_ListViewRequiredAtStageValue;

	public WebElement customerDocumentDetails_ListViewRequiredAtStageValue() {
		return customerDocumentDetails_ListViewRequiredAtStageValue;
	}
	
	//List View Document Status
	@FindBy(xpath = "//span[contains(text(),'Document Status')]")
	private WebElement customerDocumentDetails_ListViewFieldDocumentStatus;
	
	public WebElement customerDocumentDetails_ListViewFieldDocumentStatus() {
		return customerDocumentDetails_ListViewFieldDocumentStatus;
	}
	
	// List View Document Status
	@FindBy(xpath = "//kub-prime-table/descendant::td[4]")
	private WebElement customerDocumentDetails_ListViewDocumentStatusValue;

	public WebElement customerDocumentDetails_ListViewDocumentStatusValue() {
		return customerDocumentDetails_ListViewDocumentStatusValue;
	}
	
	//List View Mandatory/Optional
	@FindBy(xpath = "//span[contains(text(),'Mandatory/Optional')]")
	private WebElement customerDocumentDetails_ListViewFieldMandatoryOrOptional;
	
	public WebElement customerDocumentDetails_ListViewFieldMandatoryOrOptional() {
		return customerDocumentDetails_ListViewFieldMandatoryOrOptional;
	}
	
	// List View Mandatory/Optional
	@FindBy(xpath = "//kub-prime-table/descendant::td[5]")
	private WebElement customerDocumentDetails_ListViewMandatoryOrOptionalValue;

	public WebElement customerDocumentDetails_ListViewMandatoryOrOptionalValue() {
		return customerDocumentDetails_ListViewMandatoryOrOptionalValue;
	}
	
	//List View Document Category
	@FindBy(xpath = "//span[contains(text(),'Document Category')]")
	private WebElement customerDocumentDetails_ListViewFieldDocumentCategory;
	
	public WebElement customerDocumentDetails_ListViewFieldDocumentCategory() {
		return customerDocumentDetails_ListViewFieldDocumentCategory;
	}
	
	// List View Document Category
	@FindBy(xpath = "//kub-prime-table/descendant::td[6]")
	private WebElement customerDocumentDetails_ListViewDocumentCategoryValue;

	public WebElement customerDocumentDetails_ListViewDocumentCategoryValue() {
		return customerDocumentDetails_ListViewDocumentCategoryValue;
	}
	
	//List View DMS Upload Status
	@FindBy(xpath = "//span[contains(text(),'DMS Upload Status')]")
	private WebElement customerDocumentDetails_ListViewFieldDMSUploadStatus;
	
	public WebElement customerDocumentDetails_ListViewFieldDMSUploadStatus() {
		return customerDocumentDetails_ListViewFieldDMSUploadStatus;
	}
	
	// List View DMSUploadStatus
	@FindBy(xpath = "//kub-prime-table/descendant::td[7]")
	private WebElement customerDocumentDetails_ListViewDMSUploadStatusValue;

	public WebElement customerDocumentDetails_ListViewDMSUploadStatusValue() {
		return customerDocumentDetails_ListViewDMSUploadStatusValue;
	}
	
//  Export Button
	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]/span[1]")
	private WebElement customerDocumentDetails_ExportButton;
	
	public WebElement customerDocumentDetails_ExportButton() {
		return customerDocumentDetails_ExportButton;
	}
	
//  Export to PDF list view Field
	@FindBy(xpath = "//span[contains(text(),'PDF')]")
	private WebElement customerDocumentDetails_ExportToPDF;
	
	public WebElement customerDocumentDetails_ExportToPDF() {
		return customerDocumentDetails_ExportToPDF;
	}
	
//  Export to Excel list view Field
	@FindBy(xpath = "//span[contains(text(),'XLS')]")
	private WebElement customerDocumentDetails_ExportToXls;
	
	public WebElement customerDocumentDetails_ExportToXls() {
		return customerDocumentDetails_ExportToXls;
	}
	
	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement customerDocumentDetails_NoDataFoundInSearch;

	public WebElement customerDocumentDetails_NoDataFoundInSearch() {
		return customerDocumentDetails_NoDataFoundInSearch;
	}
		
}