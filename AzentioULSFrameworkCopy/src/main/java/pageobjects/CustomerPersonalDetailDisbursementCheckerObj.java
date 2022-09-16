package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPersonalDetailDisbursementCheckerObj {
	WebDriver driver;

	public CustomerPersonalDetailDisbursementCheckerObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement customerPersonalDetailDisbursementChecker_Maker_MenuToggle;

	public WebElement customerPersonalDetailDisbursementChecker_Maker_MenuToggle() {
		return customerPersonalDetailDisbursementChecker_Maker_MenuToggle;
	}


	@FindBy(xpath = "//ion-toolbar/ion-buttons[1]/ion-button[1]")
	private WebElement customerPersonalDetailDisbursementChecker_BackButton;

	public WebElement customerPersonalDetailDisbursementChecker_BackButton() {
		return customerPersonalDetailDisbursementChecker_BackButton;
	}

	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement customerPersonalDetailDisbursementChecker_Inbox;

	public WebElement customerPersonalDetailDisbursementChecker_Inbox() {
		return customerPersonalDetailDisbursementChecker_Inbox;
	}


	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement customerPersonalDetailDisbursementChecker_SearchInbox;

	public WebElement customerPersonalDetailDisbursementChecker_SearchInbox() {
		return customerPersonalDetailDisbursementChecker_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement customerPersonalDetailDisbursementChecker_SearchInboxInputField;

	public WebElement customerPersonalDetailDisbursementChecker_SearchInboxInputField() {
		return customerPersonalDetailDisbursementChecker_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement customerPersonalDetailDisbursementChecker_SearchInboxCloseButton;

	public WebElement customerPersonalDetailDisbursementChecker_SearchInboxCloseButton() {
		return customerPersonalDetailDisbursementChecker_SearchInboxCloseButton;
	}
	
	// CustomerDetailTab
	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement customerPersonalDetailDisbursementChecker_CustomerDetailTab;
	
	public WebElement customerPersonalDetailDisbursementChecker_CustomerDetailTab() {
		return customerPersonalDetailDisbursementChecker_CustomerDetailTab;
	}
	
	// search button
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement customerPersonalDetailDisbursementChecker_SearchButton;

	public WebElement customerPersonalDetailDisbursementChecker_SearchButton() {
		return customerPersonalDetailDisbursementChecker_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div[3]/span/input")
	private WebElement customerPersonalDetailDisbursementChecker_SearchInputField;

	public WebElement customerPersonalDetailDisbursementChecker_SearchInputField() {
		return customerPersonalDetailDisbursementChecker_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement customerPersonalDetailDisbursementChecker_SearchCloseButton;

	public WebElement customerPersonalDetailDisbursementChecker_SearchCloseButton() {
		return customerPersonalDetailDisbursementChecker_SearchCloseButton;
	}
	
	// Selected Dropdown value
	@FindBy(xpath = "//ion-radio[@aria-checked='true']//preceding-sibling::ion-label")
	private WebElement customerPersonalDetailDisbursementChecker_SelectedDropdownValue;
	
	public WebElement customerPersonalDetailDisbursementChecker_SelectedDropdownValue() {
		return customerPersonalDetailDisbursementChecker_SelectedDropdownValue;
	}
	
	// Customer Type
	@FindBy(xpath = "//ion-label[contains(text(),'Customer Type')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_CustomerType;
	
	public WebElement customerPersonalDetailDisbursementChecker_CustomerType() {
		return customerPersonalDetailDisbursementChecker_CustomerType;
	}
	
	//  Applicant Type 
	@FindBy(xpath = "//ion-label[contains(text(),' Applicant Type ')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_ApplicantType;
	
	public WebElement customerPersonalDetailDisbursementChecker_ApplicantType() {
		return customerPersonalDetailDisbursementChecker_ApplicantType;
	}
	
	// Salutation
	@FindBy(xpath = "//ion-label[contains(text(),'Salutation')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_Salutation;
	
	public WebElement customerPersonalDetailDisbursementChecker_Salutation() {
		return customerPersonalDetailDisbursementChecker_Salutation;
	}
	
	// FirstName
	@FindBy(xpath = "//ion-col[6]/digital-text-box[1]/ion-item[1]/ion-input[1]")
	private WebElement customerPersonalDetailDisbursementChecker_FirstName;
	
	public WebElement customerPersonalDetailDisbursementChecker_FirstName() {
		return customerPersonalDetailDisbursementChecker_FirstName;
	}
	
	// Middle Name
	@FindBy(xpath = "//ion-col[7]/digital-text-box[1]/ion-item[1]/ion-input[1]")
	private WebElement customerPersonalDetailDisbursementChecker_MiddleName;
	
	public WebElement customerPersonalDetailDisbursementChecker_MiddleName() {
		return customerPersonalDetailDisbursementChecker_MiddleName;
	}
	
	// LastName
	@FindBy(xpath = "//ion-col[8]/digital-text-box[1]/ion-item[1]/ion-input[1]")
	private WebElement customerPersonalDetailDisbursementChecker_LastName;
	
	public WebElement customerPersonalDetailDisbursementChecker_LastName() {
		return customerPersonalDetailDisbursementChecker_LastName;
	}
	
	// Date Of Birth Field
	@FindBy(xpath = "//ion-label[contains(text(),' Date of Birth ')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_DateOfBirthField;
	
	public WebElement customerPersonalDetailDisbursementChecker_DateOfBirthField() {
		return customerPersonalDetailDisbursementChecker_DateOfBirthField;
	}
	
	// Date Of Birth
	@FindBy(xpath = "//input[@id='icon']/ancestor::digital-prime-date")
	private WebElement customerPersonalDetailDisbursementChecker_DateOfBirth;
	
	public WebElement customerPersonalDetailDisbursementChecker_DateOfBirth() {
		return customerPersonalDetailDisbursementChecker_DateOfBirth;
	}
	
	// Gender
	@FindBy(xpath = "//ion-label[contains(text(),'Gender')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_Gender;
	
	public WebElement customerPersonalDetailDisbursementChecker_Gender() {
		return customerPersonalDetailDisbursementChecker_Gender;
	}
	
	// Education Level
	@FindBy(xpath = "//ion-label[contains(text(),'Education Level')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_EducationLevel;
	
	public WebElement customerPersonalDetailDisbursementChecker_EducationLevel() {
		return customerPersonalDetailDisbursementChecker_EducationLevel;
	}
	
	// Marital Status
	@FindBy(xpath = "//ion-label[contains(text(),'Marital Status')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_MaritalStatus;
	
	public WebElement customerPersonalDetailDisbursementChecker_MaritalStatus() {
		return customerPersonalDetailDisbursementChecker_MaritalStatus;
	}
	
	//Nationality
	@FindBy(xpath = "//ion-label[contains(text(),'Nationality')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_Nationality;
	
	public WebElement customerPersonalDetailDisbursementChecker_Nationality() {
		return customerPersonalDetailDisbursementChecker_Nationality;
	}
	
	//Nationality
	@FindBy(xpath = "//ion-label[contains(text(),'Category')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_CustomerCategory;
	
	public WebElement customerPersonalDetailDisbursementChecker_CustomerCategory() {
		return customerPersonalDetailDisbursementChecker_CustomerCategory;
	}
	
	// Ethinicity
	@FindBy(xpath = "//ion-label[contains(text(),'Ethinicity')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_Ethinicity;
	
	public WebElement customerPersonalDetailDisbursementChecker_Ethinicity() {
		return customerPersonalDetailDisbursementChecker_Ethinicity;
	}
	
	// Religion
	@FindBy(xpath = "//ion-label[contains(text(),'Religion')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_Religion;
	
	public WebElement customerPersonalDetailDisbursementChecker_Religion() {
		return customerPersonalDetailDisbursementChecker_Religion;
	}
	
	// Residential status
	@FindBy(xpath = "//ion-label[contains(text(),'Residential Status')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_ResidentialStatus;
	
	public WebElement customerPersonalDetailDisbursementChecker_ResidentialStatus() {
		return customerPersonalDetailDisbursementChecker_ResidentialStatus;
	}
	
	// Language
	@FindBy(xpath = "//ion-label[contains(text(),'Language')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_Language;
	
	public WebElement customerPersonalDetailDisbursementChecker_Language() {
		return customerPersonalDetailDisbursementChecker_Language;
	}
	
	// No Of Dependents
	@FindBy(xpath = "//ion-col[26]/digital-text-box[1]/ion-item[1]/ion-input[1]")
	private WebElement customerPersonalDetailDisbursementChecker_NoOfDependents;
	
	public WebElement customerPersonalDetailDisbursementChecker_NoOfDependents() {
		return customerPersonalDetailDisbursementChecker_NoOfDependents;
	}
	
	// Mothers Maiden Name
	@FindBy(xpath = "//ion-col[27]/digital-text-box[1]/ion-item[1]/ion-input[1]")
	private WebElement customerPersonalDetailDisbursementChecker_MothersMaidenName;
	
	public WebElement customerPersonalDetailDisbursementChecker_MothersMaidenName() {
		return customerPersonalDetailDisbursementChecker_MothersMaidenName;
	}
	
	// Type Of Residence
	@FindBy(xpath = "//ion-label[contains(text(),'Type of Residence')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_TypeOfResidence;
	
	public WebElement customerPersonalDetailDisbursementChecker_TypeOfResidence() {
		return customerPersonalDetailDisbursementChecker_TypeOfResidence;
	}
	
	// Category Of Client
	@FindBy(xpath = "//ion-label[contains(text(),'Category of Client')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_CategoryOfClient;
	
	public WebElement customerPersonalDetailDisbursementChecker_CategoryOfClient() {
		return customerPersonalDetailDisbursementChecker_CategoryOfClient;
	}
	
	// Rating
	@FindBy(xpath = "//ion-label[contains(text(),'Rating')]/../ion-select")
	private WebElement customerPersonalDetailDisbursementChecker_Rating;
	
	public WebElement customerPersonalDetailDisbursementChecker_Rating() {
		return customerPersonalDetailDisbursementChecker_Rating;
	}
	
	// Existing Bank Relationship
	@FindBy(xpath = "//ion-col[30]/digital-radio-button/ion-item/ion-toggle")
	private WebElement customerPersonalDetailDisbursementChecker_ExistingBankRelationship;
	
	public WebElement customerPersonalDetailDisbursementChecker_ExistingBankRelationship() {
		return customerPersonalDetailDisbursementChecker_ExistingBankRelationship;
	}
	
	// Blacklisted
	@FindBy(xpath = "//ion-col[32]/digital-radio-button/ion-item/ion-toggle")
	private WebElement customerPersonalDetailDisbursementChecker_Blacklisted;
	
	public WebElement customerPersonalDetailDisbursementChecker_Blacklisted() {
		return customerPersonalDetailDisbursementChecker_Blacklisted;
	}
	


	
	
	
	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[8]/img[1]")
	private WebElement customerPersonalDetailOffering_Profile;
	
	public WebElement customerPersonalDetailOffering_Profile() {
		return customerPersonalDetailOffering_Profile;
	}
	
	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement customerPersonalDetailOffering_LogoutUser;
	
	public WebElement customerPersonalDetailOffering_LogoutUser() {
		return customerPersonalDetailOffering_LogoutUser;
	}
}
