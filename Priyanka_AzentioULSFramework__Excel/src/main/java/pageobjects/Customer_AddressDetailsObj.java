package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_AddressDetailsObj {
	WebDriver driver;

	public Customer_AddressDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Search Icon
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement Customer_AddressDetails_SearchIcon;

	public WebElement Customer_AddressDetails_SearchIcon() {
		return Customer_AddressDetails_SearchIcon;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement Customer_AddressDetails_SearchInputField;

	public WebElement Customer_AddressDetails_SearchInputField() {
		return Customer_AddressDetails_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement Customer_AddressDetails_SearchCloseButton;

	public WebElement Customer_AddressDetails_SearchCloseButton() {
		return Customer_AddressDetails_SearchCloseButton;
	}

	// Add Button
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement AddButton;

	public WebElement AddButton() {
		return AddButton;
	}

	// Back button
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']/span[1]")
	private WebElement Customer_AddressDetails_BackButton;

	public WebElement Customer_AddressDetails_BackButton() {
		return Customer_AddressDetails_BackButton;
	}

	// Customer Address Back button
	@FindBy(xpath = "//ion-row[2]/ion-col[1]/button")
	private WebElement Customer_AddressDetails_CustomerAddressBackButton;

	public WebElement Customer_AddressDetails_CustomerAddressBackButton() {
		return Customer_AddressDetails_CustomerAddressBackButton;
	}

	// Save button
	@FindBy(xpath = "//ion-col[3]/button[1]/span[1]")
	private WebElement Customer_AddressDetails_AddressDetailsSaveButton;

	public WebElement Customer_AddressDetails_AddressDetailsSaveButton() {
		return Customer_AddressDetails_AddressDetailsSaveButton;
	}

	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement Customer_AddressDetails_SaveConfirmationMessage;

	public WebElement Customer_AddressDetails_SaveConfirmationMessage() {
		return Customer_AddressDetails_SaveConfirmationMessage;
	}//div[@id='toast-container']//div[@role='alert']

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement Customer_AddressDetails_SaveConfirmationMessageCloseButton;

	public WebElement Customer_AddressDetails_SaveConfirmationMessageCloseButton() {
		return Customer_AddressDetails_SaveConfirmationMessageCloseButton;
	}

	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement Customer_AddressDetails_Inbox;

	public WebElement Customer_AddressDetails_Inbox() {
		return Customer_AddressDetails_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement Customer_AddressDetails_SearchInbox;

	public WebElement Customer_AddressDetails_SearchInbox() {
		return Customer_AddressDetails_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement Customer_AddressDetails_SearchInboxInputField;

	public WebElement Customer_AddressDetails_SearchInboxInputField() {
		return Customer_AddressDetails_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement Customer_AddressDetails_SearchInboxCloseButton;

	public WebElement Customer_AddressDetails_SearchInboxCloseButton() {
		return Customer_AddressDetails_SearchInboxCloseButton;
	}

	// Additional Customer Info segment button
	@FindBy(xpath = "//ion-label[text()='Additional Customer Info']/parent::ion-segment-button")
	private WebElement Customer_AddressDetails_AdditionalCustomerInfo;

	public WebElement Customer_AddressDetails_AdditionalCustomerInfo() {
		return Customer_AddressDetails_AdditionalCustomerInfo;
	}

	// search button
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement Customer_AddressDetails_SearchButton;

	public WebElement Customer_AddressDetails_SearchButton() {
		return Customer_AddressDetails_SearchButton;
	}

	// ActionEdit
	@FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]/button[1]")
	private WebElement Customer_AddressDetails_CustomerPersonalInformation_ActionEdit;

	public WebElement Customer_AddressDetails_CustomerPersonalInformation_ActionEdit() {
		return Customer_AddressDetails_CustomerPersonalInformation_ActionEdit;
	}

	@FindBy(xpath = "//ion-title[contains(text(),'Address Details')]/ancestor::ion-card/descendant::button[1]")
	private WebElement Customer_AddressDetails_AddressDetailAddButton;

	public WebElement Customer_AddressDetails_AddressDetailAddButton() {
		return Customer_AddressDetails_AddressDetailAddButton;
	}

	// Address Type field
	@FindBy(xpath = "//ion-label[contains(text(),'Address Type')]/../ion-select")
	private WebElement Customer_AddressDetails_AddressTypeField;

	public WebElement Customer_AddressDetails_AddressTypeField() {
		return Customer_AddressDetails_AddressTypeField;
	}

	// Address Type Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Home')]/../ion-radio")
	private WebElement Customer_AddressDetails_AddressTypeDropdown;

	public WebElement Customer_AddressDetails_AddressTypeDropdown() {
		return Customer_AddressDetails_AddressTypeDropdown;
	}

	// AddressStatus Field
	@FindBy(xpath = "//ion-label[contains(text(),'Address Status')]/../ion-select")
	private WebElement Customer_AddressDetails_AddressStatusField;

	public WebElement Customer_AddressDetails_AddressStatusField() {
		return Customer_AddressDetails_AddressStatusField;
	}

	// Address Status Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Current')]/../ion-radio")
	private WebElement Customer_AddressDetails_AddressStatusDropdown;

	public WebElement Customer_AddressDetails_AddressStatusDropdown() {
		return Customer_AddressDetails_AddressStatusDropdown;
	}

//  Residential or Occupancy Status  field
	@FindBy(xpath = "//ion-label[contains(text(),' Residential or Occupancy Status ')]/../ion-select")
	private WebElement Customer_AddressDetails_ResidentialOrOccupancyStatusField;

	public WebElement Customer_AddressDetails_ResidentialOrOccupancyStatusField() {
		return Customer_AddressDetails_ResidentialOrOccupancyStatusField;
	}

//  Residential or Occupancy Status  Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Dormitory')]/../ion-radio")
	private WebElement Customer_AddressDetails_ResidentialOrOccupancyStatusDropdown;

	public WebElement Customer_AddressDetails_ResidentialOrOccupancyStatusDropdown() {
		return Customer_AddressDetails_ResidentialOrOccupancyStatusDropdown;
	}

	// Address Line 1 field
	@FindBy(xpath = "//ion-col[6]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Customer_AddressDetails_AddressLine1Field;

	public WebElement Customer_AddressDetails_AddressLine1Field() {
		return Customer_AddressDetails_AddressLine1Field;
	}

	// Address Line 2 field
	@FindBy(xpath = "//ion-col[7]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Customer_AddressDetails_AddressLine2Field;

	public WebElement Customer_AddressDetails_AddressLine2Field() {
		return Customer_AddressDetails_AddressLine2Field;
	}

	// Country field
	@FindBy(xpath = "//ion-label[contains(text(),'Country')]/../ion-select")
	private WebElement Customer_AddressDetails_CountryField;

	public WebElement Customer_AddressDetails_CountryField() {
		return Customer_AddressDetails_CountryField;
	}

	// Country Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'INDIA')]/../ion-radio")
	private WebElement Customer_AddressDetails_CountryDropdown;

	public WebElement Customer_AddressDetails_CountryDropdown() {
		return Customer_AddressDetails_CountryDropdown;
	}

	// Province id field
	@FindBy(xpath = "//ion-label[contains(text(),' Province id ')]/../ion-select")
	private WebElement Customer_AddressDetails_ProvinceIdField;

	public WebElement Customer_AddressDetails_ProvinceIdField() {
		return Customer_AddressDetails_ProvinceIdField;
	}

	// Province id Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Maharastra')]/../ion-radio")
	private WebElement Customer_AddressDetails_ProvinceIdDropdown;

	public WebElement Customer_AddressDetails_ProvinceIdDropdown() {
		return Customer_AddressDetails_ProvinceIdDropdown;
	}

	// NeighbourhoodDistrictName field
	@FindBy(xpath = "//ion-col[10]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Customer_AddressDetails_NeighbourhoodDistrictNameField;

	public WebElement Customer_AddressDetails_NeighbourhoodDistrictNameField() {
		return Customer_AddressDetails_NeighbourhoodDistrictNameField;
	}

	// City id field
	@FindBy(xpath = "//ion-label[contains(text(),' City id ')]/../ion-select")
	private WebElement Customer_AddressDetails_CityIdField;

	public WebElement Customer_AddressDetails_CityIdField() {
		return Customer_AddressDetails_CityIdField;
	}

	// City id Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Wardha')]/../ion-radio")
	private WebElement Customer_AddressDetails_CityIdDropdown;

	public WebElement Customer_AddressDetails_CityIdDropdown() {
		return Customer_AddressDetails_CityIdDropdown;
	}

	// ZipCode field
	@FindBy(xpath = "//ion-col[12]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Customer_AddressDetails_ZipCodeField;

	public WebElement Customer_AddressDetails_ZipCodeField() {
		return Customer_AddressDetails_ZipCodeField;
	}

	// Occupancy Date Field
	@FindBy(xpath = "//input[@id='icon']")
	private WebElement Customer_AddressDetails_OccupancyDateField;

	public WebElement Customer_AddressDetails_OccupancyDateField() {
		return Customer_AddressDetails_OccupancyDateField;
	}
	
	
	// ClickOnNextMonth
		@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
		private WebElement Customer_AddressDetails_ClickOnNextMonth;

		public WebElement Customer_AddressDetails_ClickOnNextMonth() {
			return Customer_AddressDetails_ClickOnNextMonth;
		}
		
	@FindBy(xpath = "//span[contains(text(),'Today')]")
	private WebElement Customer_AddressDetails_TodayDate;

	public WebElement Customer_AddressDetails_TodayDate() {
		return Customer_AddressDetails_TodayDate;
	}
	// Mailling Or Contact Address Flag field
	@FindBy(xpath = "//ion-label[contains(text(),'Mailling or Contact address flag')]/../../ion-item/ion-toggle")
	private WebElement Customer_AddressDetails_MaillingOrContactAddressFlag;

	public WebElement Customer_AddressDetails_MaillingOrContactAddressFlag() {
		return Customer_AddressDetails_MaillingOrContactAddressFlag;
	}

	// PoBoxNumber field
	@FindBy(xpath = "//ion-col[13]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Customer_AddressDetails_PoBoxNumberField;

	public WebElement Customer_AddressDetails_PoBoxNumberField() {
		return Customer_AddressDetails_PoBoxNumberField;
	}

	// Mobile Number (Primary) Field
	@FindBy(xpath = "//ion-col[14]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Customer_AddressDetails_MobileNumberPrimaryField;

	public WebElement Customer_AddressDetails_MobileNumberPrimaryField() {
		return Customer_AddressDetails_MobileNumberPrimaryField;
	}

}
