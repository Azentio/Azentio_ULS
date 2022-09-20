package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails_DisbursementMakerObj {

	WebDriver driver;

	public PersonalDetails_DisbursementMakerObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// ------------------------MAKER STAGE PAGEOBJECTS----------------------//

	@FindBy(xpath = "//span[contains(text(),'Transactions')]")
	private WebElement Transactions;

	public WebElement Transactions() {
		return Transactions;
	}
	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
	private WebElement productMaster_Product_Inbox;
	public WebElement productMaster_Product_Inbox() {
		return productMaster_Product_Inbox;
	}
	@FindBy(xpath = "//div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement productMaster_Product_Search;
	public WebElement productMaster_Product_Search() {
		return productMaster_Product_Search;
	}
	
	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement productMaster_Product_ReferanceId;
	public WebElement productMaster_Product_ReferanceId() {
		return productMaster_Product_ReferanceId;
	}
	
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement productMaster_Product_SearchRecordList;
	public WebElement productMaster_Product_SearchRecordList() {
		return productMaster_Product_SearchRecordList;
	}

	// Application_Manager
	@FindBy(xpath = "//ion-label[contains(text(),'Application manager')]")
	private WebElement Application_Manager;

	public WebElement Application_Manager() {
		return Application_Manager;
	}

	// Application Details
	@FindBy(xpath = "(//ion-accordion[1]/ion-list[1]/ion-item[5]/ion-buttons[1]/ion-button[1])[2]")
	private WebElement Application_Details;

	public WebElement Application_Details() {
		return Application_Details;
	}

	// Search Icon
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement PDDM_SearchIcon;

	public WebElement PDDM_SearchIcon() {
		return PDDM_SearchIcon;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement PDDM_SearchInputField;

	public WebElement PDDM_SearchInputField() {
		return PDDM_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement PDDM_SearchCloseButton;

	public WebElement PDDM_SearchCloseButton() {
		return PDDM_SearchCloseButton;
	}

	// Add Button
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement AddButton;

	public WebElement AddButton() {
		return AddButton;
	}

	// Customer details SegmentButton
	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement PDDM_CustomerDetails_SegmentButton;

	public WebElement PDDM_CustomerDetails_SegmentButton() {
		return PDDM_CustomerDetails_SegmentButton;
	}

	// ActionEdit
	@FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]/button[1]")
	private WebElement PDDM_CustomerDetails_ActionEdit;

	public WebElement PDDM_CustomerDetails_ActionEdit() {
		return PDDM_CustomerDetails_ActionEdit;
	}

	// CustomerType
	@FindBy(xpath = "//ion-col[2]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_CustomerType;

	public WebElement PDDM_CustomerDetails_CustomerType() {
		return PDDM_CustomerDetails_CustomerType;
	}

	// CustomerTypeDropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Corporate Customer')]/../ion-radio")
	private WebElement PDDM_CustomerDetails_CustomerTypeDropdown;

	public WebElement PDDM_CustomerDetails_CustomerTypeDropdown() {
		return PDDM_CustomerDetails_CustomerTypeDropdown;
	}

	// ApplicantType
	@FindBy(xpath = "//ion-col[3]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_ApplicantType;

	public WebElement PDDM_CustomerDetails_ApplicantType() {
		return PDDM_CustomerDetails_ApplicantType;
	}

	// ApplicantTypeDropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Guarantor')]/../ion-radio")
	private WebElement PDDM_CustomerDetails_ApplicantTypeDropdown;

	public WebElement PDDM_CustomerDetails_ApplicantTypeDropdown() {
		return PDDM_CustomerDetails_ApplicantTypeDropdown;
	}

	// Salutation
	@FindBy(xpath = "//ion-col[4]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_Salutation;

	public WebElement PDDM_CustomerDetails_Salutation() {
		return PDDM_CustomerDetails_Salutation;
	}

	// Salutation Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Miss')]/../ion-radio")
	private WebElement PDDM_CustomerDetails_SalutationDropdown;

	public WebElement PDDM_CustomerDetails_SalutationDropdown() {
		return PDDM_CustomerDetails_SalutationDropdown;
	}

	// First Name
	// @FindBy(xpath = "//ion-label[text()=' First Name
	// ']//following-sibling::ion-input")
	@FindBy(xpath = "//ion-input[@ng-reflect-model='Mahesh']")
	private WebElement PDDM_CustomerDetails_FirstName;

	public WebElement PDDM_CustomerDetails_FirstName() {
		return PDDM_CustomerDetails_FirstName;
	}

	// Middle Name
	@FindBy(xpath = "//ion-col[7]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement PDDM_CustomerDetails_MiddleName;

	public WebElement PDDM_CustomerDetails_MiddleName() {
		return PDDM_CustomerDetails_MiddleName;
	}

	// Last Name
	@FindBy(xpath = "//ion-col[8]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement PDDM_CustomerDetails_LastName;

	public WebElement PDDM_CustomerDetails_LastName() {
		return PDDM_CustomerDetails_LastName;
	}

	// Gender
	@FindBy(xpath = "//ion-col[18]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_Gender;

	public WebElement PDDM_CustomerDetails_Gender() {
		return PDDM_CustomerDetails_Gender;
	}

	// GenderDropdown
	@FindBy(xpath = "//ion-label[contains(text(),'FEMALE')]/../ion-radio")
	private WebElement PDDM_CustomerDetails_GenderDropdown;

	public WebElement PDDM_CustomerDetails_GenderDropdown() {
		return PDDM_CustomerDetails_GenderDropdown;
	}

	// Education Level
	@FindBy(xpath = "//ion-col[19]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_EdcuationLevel;

	public WebElement PDDM_CustomerDetails_EdcuationLevel() {
		return PDDM_CustomerDetails_EdcuationLevel;
	}

	// EdcuationLevel Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Professional')]/../ion-radio")
	private WebElement PDDM_CustomerDetails_EdcuationLevelDropdown;

	public WebElement PDDM_CustomerDetails_EdcuationLevelDropdown() {
		return PDDM_CustomerDetails_EdcuationLevelDropdown;
	}

	// Marital Status
	@FindBy(xpath = "//ion-col[20]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_MaritalStatus;

	public WebElement PDDM_CustomerDetails_MaritalStatus() {
		return PDDM_CustomerDetails_MaritalStatus;
	}

	// Marital Status Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Married')]/../ion-radio")
	private WebElement PDDM_CustomerDetails_MaritalStatusDropdown;

	public WebElement PDDM_CustomerDetails_MaritalStatusDropdown() {
		return PDDM_CustomerDetails_MaritalStatusDropdown;
	}

	// Nationality
	@FindBy(xpath = "//ion-col[21]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_Nationality;

	public WebElement PDDM_CustomerDetails_Nationality() {
		return PDDM_CustomerDetails_Nationality;
	}

	// Ethinicity
	@FindBy(xpath = "//ion-col[22]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_Ethinicity;

	public WebElement PDDM_CustomerDetails_Ethinicity() {
		return PDDM_CustomerDetails_Ethinicity;
	}

	// Religion
	@FindBy(xpath = "//ion-col[23]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_Religion;

	public WebElement PDDM_CustomerDetails_Religion() {
		return PDDM_CustomerDetails_Religion;
	}

	// Resident Status
	@FindBy(xpath = "//ion-col[24]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_ResidentStatus;

	public WebElement PDDM_CustomerDetails_ResidentStatus() {
		return PDDM_CustomerDetails_ResidentStatus;
	}

	// Language
	@FindBy(xpath = "//ion-col[25]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_Language;

	public WebElement PDDM_CustomerDetails_Language() {
		return PDDM_CustomerDetails_Language;
	}

	// TypeOfResidence
	@FindBy(xpath = "//ion-col[28]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_TypeOfResidence;

	public WebElement PDDM_CustomerDetails_TypeOfResidence() {
		return PDDM_CustomerDetails_TypeOfResidence;
	}

	// CategoryOfClient
	@FindBy(xpath = "//ion-col[29]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_CategoryOfClient;

	public WebElement PDDM_CustomerDetails_CategoryOfClient() {
		return PDDM_CustomerDetails_CategoryOfClient;
	}
	// BlackListed

	@FindBy(xpath = "//ion-col[29]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement PDDM_CustomerDetails_BlackListed;

	public WebElement PDDM_CustomerDetails_BlackListed() {
		return PDDM_CustomerDetails_BlackListed;
	}
	// -----------list view------------------------------//

	// ListView Back Button
	@FindBy(xpath = "//ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
	private WebElement PDDM_CustomerDetails_ListView_BackButton;

	public WebElement PDDM_CustomerDetails_ListView_BackButton() {
		return PDDM_CustomerDetails_ListView_BackButton;
	}

	// Export
	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement PDDM_CustomerDetails_Export;

	public WebElement PDDM_CustomerDetails_Export() {
		return PDDM_CustomerDetails_Export;
	}

	// PDF
	@FindBy(xpath = " //li[@aria-label='PDF']")
	private WebElement PDDM_CustomerDetails_PdfFile;

	public WebElement PDDM_CustomerDetails_PdfFile() {
		return PDDM_CustomerDetails_PdfFile;
	}

	// XLS
	@FindBy(xpath = " //li[@aria-label='XLS']")
	private WebElement PDDM_CustomerDetails_XlsFile;

	public WebElement PDDM_CustomerDetails_XlsFile() {
		return PDDM_CustomerDetails_XlsFile;
	}

	// List view CIF_ID
	@FindBy(xpath = "//span[contains(text(),'CIF ID')]")
	private WebElement PDDM_CustomerDetails_ListView_CIF_ID;

	public WebElement PDDM_CustomerDetails_ListView_CIF_ID() {
		return PDDM_CustomerDetails_ListView_CIF_ID;
	}

	// List view FirstName
	@FindBy(xpath = "//span[contains(text(),'First Name')]")
	private WebElement PDDM_CustomerDetails_ListView_FirstName;

	public WebElement PDDM_CustomerDetails_ListView_FirstName() {
		return PDDM_CustomerDetails_ListView_FirstName;
	}

	// List view MiddleName
	@FindBy(xpath = "//span[contains(text(),'Middle Name')]")
	private WebElement PDDM_CustomerDetails_ListView_MiddleName;

	public WebElement PDDM_CustomerDetails_ListView_MiddleName() {
		return PDDM_CustomerDetails_ListView_MiddleName;
	}

	// List view LastName
	@FindBy(xpath = "//span[contains(text(),'Last Name')]")
	private WebElement PDDM_CustomerDetails_ListView_LastName;

	public WebElement PDDM_CustomerDetails_ListView_LastName() {
		return PDDM_CustomerDetails_ListView_LastName;
	}

	// List view CustomerType
	@FindBy(xpath = "//span[contains(text(),'Customer Type')]")
	private WebElement PDDM_CustomerDetails_ListView_CustomerType;

	public WebElement PDDM_CustomerDetails_ListView_CustomerType() {
		return PDDM_CustomerDetails_ListView_CustomerType;
	}

	// List view ApplicantType
	@FindBy(xpath = "//span[contains(text(),'Applicant Type')]")
	private WebElement PDDM_CustomerDetails_ListView_ApplicantType;

	public WebElement PDDM_CustomerDetails_ListView_ApplicantType() {
		return PDDM_CustomerDetails_ListView_ApplicantType;
	}

	// List view Status
	@FindBy(xpath = "//span[contains(text(),'Status')]")
	private WebElement PDDM_CustomerDetails_ListView_Status;

	public WebElement PDDM_CustomerDetails_ListView_Status() {
		return PDDM_CustomerDetails_ListView_Status;
	}

	// list view first field of FirstName
	@FindBy(xpath = "//tbody/tr[1]/td[5]/p-celleditor[1]/span[1]")
	private WebElement PDDM_CustomerDetails_ListViewFirstField_FirstName;

	public WebElement PDDM_CustomerDetails_ListViewFirstField_FirstName() {
		return PDDM_CustomerDetails_ListViewFirstField_FirstName;
	}

	// list view first field of MiddleName
	@FindBy(xpath = "//tbody/tr[1]/td[6]/p-celleditor[1]/span[1]")
	private WebElement PDDM_CustomerDetails_ListViewFirstField_MiddleName;

	public WebElement PDDM_CustomerDetails_ListViewFirstField_MiddleName() {
		return PDDM_CustomerDetails_ListViewFirstField_MiddleName;
	}

	// list view first field of LastName
	@FindBy(xpath = "//tbody/tr[1]/td[7]/p-celleditor[1]/span[1]")
	private WebElement PDDM_CustomerDetails_ListViewFirstField_LastName;

	public WebElement PDDM_CustomerDetails_ListViewFirstField_LastName() {
		return PDDM_CustomerDetails_ListViewFirstField_LastName;
	}

	// list view first field of CustomerType
	@FindBy(xpath = "//tbody/tr[1]/td[8]/p-celleditor[1]/span[1]")
	private WebElement PDDM_CustomerDetails_ListViewFirstField_CustomerType;

	public WebElement PDDM_CustomerDetails_ListViewFirstField_CustomerType() {
		return PDDM_CustomerDetails_ListViewFirstField_CustomerType;
	}

	// list view first field of ApplicantType
	@FindBy(xpath = "//tbody/tr[1]/td[2]/p-celleditor[1]/span[1]")
	private WebElement PDDM_CustomerDetails_ListViewFirstField_ApplicantType;

	public WebElement PDDM_CustomerDetails_ListViewFirstField_ApplicantType() {
		return PDDM_CustomerDetails_ListViewFirstField_ApplicantType;
	}
	
	// Back Button
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement PDDM_CustomerDetails_BackButton;

	public WebElement PDDM_CustomerDetails_BackButton() {
		return PDDM_CustomerDetails_BackButton;
	}

}
