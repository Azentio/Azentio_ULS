package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollateralLayout_OwnershipDetailsObj {
	WebDriver driver;

	public CollateralLayout_OwnershipDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Search Icon
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement OwnershipDetails_SearchIcon;

	public WebElement OwnershipDetails_SearchIcon() {
		return OwnershipDetails_SearchIcon;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement OwnershipDetails_SearchInputField;

	public WebElement OwnershipDetails_SearchInputField() {
		return OwnershipDetails_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement OwnershipDetails_SearchCloseButton;

	public WebElement OwnershipDetails_SearchCloseButton() {
		return OwnershipDetails_SearchCloseButton;
	}

	// Next button
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement OwnershipDetails_NextButton;

	public WebElement OwnershipDetails_NextButton() {
		return OwnershipDetails_NextButton;
	}

	// OwnershipSegment button
	@FindBy(xpath = "//ion-label[text()='Ownership Details']/parent::ion-segment-button")
	private WebElement OwnershipDetails_OwnershipSegmentButton;

	public WebElement OwnershipDetails_OwnershipSegmentButton() {
		return OwnershipDetails_OwnershipSegmentButton;
	}

	// Owner/Power Of Attorney Details
	@FindBy(xpath = "//ion-label[contains(text(),'Owner/Power Of Attorney Details')]/../ion-select")
	private WebElement OwnershipDetails_OwnerPowerOfAttorneyDetails;

	public WebElement OwnershipDetails_OwnerPowerOfAttorneyDetails() {
		return OwnershipDetails_OwnerPowerOfAttorneyDetails;
	}

	// Owner/Power Of Attorney Details Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Owner')]/../ion-radio")
	private WebElement OwnershipDetails_OwnerDropdown;

	public WebElement OwnershipDetails_OwnerDropdown() {
		return OwnershipDetails_OwnerDropdown;
	}

	// Power Of Attorney Details Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Owner')]/../ion-radio")
	private WebElement OwnershipDetails_PowerOfAttorneyDropdown;

	public WebElement OwnershipDetails_PowerOfAttorneyDropdown() {
		return OwnershipDetails_PowerOfAttorneyDropdown;
	}

	// ID Type
	@FindBy(xpath = "//ion-label[contains(text(),'Id Type')]/../ion-select")
	private WebElement OwnershipDetails_IDType;

	public WebElement OwnershipDetails_IDType() {
		return OwnershipDetails_IDType;
	}

	// PAN CARD Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'PAN CARD')]/../ion-radio")
	private WebElement OwnershipDetails_PanCardDropdown;

	public WebElement OwnershipDetails_PanCardDropdown() {
		return OwnershipDetails_PanCardDropdown;
	}

	// AADHAR CARD Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'AADHAR CARD')]/../ion-radio")
	private WebElement OwnershipDetails_AadharCardDropdown;

	public WebElement OwnershipDetails_AadharCardDropdown() {
		return OwnershipDetails_AadharCardDropdown;
	}

	// City
	@FindBy(xpath = "//ion-label[contains(text(),'City')]/../ion-select")
	private WebElement OwnershipDetails_City;

	public WebElement OwnershipDetails_City() {
		return OwnershipDetails_City;
	}

	// City Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Akola')]/../ion-radio")
	private WebElement OwnershipDetails_CityDropdown;

	public WebElement OwnershipDetails_CityDropdown() {
		return OwnershipDetails_CityDropdown;
	}

	// Id Number
	@FindBy(xpath = "//ion-label[contains(text(),'Id Number')]/../ion-input/input[1]")
	private WebElement OwnershipDetails_IdNumber;

	public WebElement OwnershipDetails_IdNumber() {
		return OwnershipDetails_IdNumber;
	}

	// Name
	@FindBy(xpath = "//ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement OwnershipDetails_Name;

	public WebElement OwnershipDetails_Name() {
		return OwnershipDetails_Name;
	}

	// Issue Place
	@FindBy(xpath = "//ion-label[contains(text(),'Issue Place')]/../ion-input/input[1]")
	private WebElement OwnershipDetails_IssuePlace;

	public WebElement OwnershipDetails_IssuePlace() {
		return OwnershipDetails_IssuePlace;
	}

	// Mobile
	@FindBy(xpath = "(//ion-label[contains(text(),'Mobile')]/../ion-input/input[1])[1]")
	private WebElement OwnershipDetails_Mobile;

	public WebElement OwnershipDetails_Mobile() {
		return OwnershipDetails_Mobile;
	}

	// Phone
	@FindBy(xpath = "//ion-label[contains(text(),'Phone')]/../ion-input/input[1]")
	private WebElement OwnershipDetails_Phone;

	public WebElement OwnershipDetails_Phone() {
		return OwnershipDetails_Phone;
	}

	// Mobile 2
	@FindBy(xpath = "//ion-label[contains(text(),'Mobile 2')]/../ion-input/input[1]")
	private WebElement OwnershipDetails_Mobile2;

	public WebElement OwnershipDetails_Mobile2() {
		return OwnershipDetails_Mobile2;
	}

	// Fax
	@FindBy(xpath = "//ion-label[contains(text(),'Fax')]/../ion-input/input[1]")
	private WebElement OwnershipDetails_Fax;

	public WebElement OwnershipDetails_Fax() {
		return OwnershipDetails_Fax;
	}

	// Email
	@FindBy(xpath = "//ion-label[contains(text(),'Email')]/../ion-input/input[1]")
	private WebElement OwnershipDetails_Email;

	public WebElement OwnershipDetails_Email() {
		return OwnershipDetails_Email;
	}

	// IssueDate
	@FindBy(xpath = "//input[@id='icon']")
	private WebElement OwnershipDetails_IssueDate;

	public WebElement OwnershipDetails_IssueDate() {
		return OwnershipDetails_IssueDate;
	}

	@FindBy(xpath = "//span[contains(text(),'Today')]")
	private WebElement OwnershipDetails_TodayDate;

	public WebElement OwnershipDetails_TodayDate() {
		return OwnershipDetails_TodayDate;
	}

	// Save button
	@FindBy(xpath = "//ion-col[3]/button[1]/span[1]")
	private WebElement OwnershipDetails_SaveButton;

	public WebElement OwnershipDetails_SaveButton() {
		return OwnershipDetails_SaveButton;
	}

	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement OwnershipDetails_SaveConfirmationMessage;

	public WebElement OwnershipDetails_SaveConfirmationMessage() {
		return OwnershipDetails_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement OwnershipDetails_SaveConfirmationMessageCloseButton;

	public WebElement OwnershipDetails_SaveConfirmationMessageCloseButton() {
		return OwnershipDetails_SaveConfirmationMessageCloseButton;
	}

}
