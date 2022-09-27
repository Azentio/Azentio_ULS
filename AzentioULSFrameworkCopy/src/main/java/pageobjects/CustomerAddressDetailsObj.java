package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerAddressDetailsObj {
	WebDriver driver;

	public CustomerAddressDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement customerAddressDetails_Maker_MenuToggle;

	public WebElement customerAddressDetails_Maker_MenuToggle() {
		return customerAddressDetails_Maker_MenuToggle;
	}

	// Back button
	@FindBy(xpath = "(//button[@ng-reflect-text='Go Back'])[2]")
	private WebElement customerAddressDetails_BackButton;

	public WebElement customerAddressDetails_BackButton() {
		return customerAddressDetails_BackButton;
	}
	
	// Customer Address Back button
	@FindBy(xpath = "//ion-row[2]/ion-col[1]/button")
	private WebElement customerAddressDetails_CustomerAddressBackButton;
	
	public WebElement customerAddressDetails_CustomerAddressBackButton() {
		return customerAddressDetails_CustomerAddressBackButton;
	}
	
	//Save button
	@FindBy(xpath = "//ion-col[3]/button[1]/span[1]")
	private WebElement customerAddressDetails_AddressDetailsSaveButton;
	
	public WebElement customerAddressDetails_AddressDetailsSaveButton() {
		return customerAddressDetails_AddressDetailsSaveButton;
	}
	
	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement customerAddressDetails_SaveConfirmationMessage;

	public WebElement customerAddressDetails_SaveConfirmationMessage() {
		return customerAddressDetails_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement customerAddressDetails_SaveConfirmationMessageCloseButton;

	public WebElement customerAddressDetails_SaveConfirmationMessageCloseButton() {
		return customerAddressDetails_SaveConfirmationMessageCloseButton;
	}

	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement customerAddressDetails_Inbox;

	public WebElement customerAddressDetails_Inbox() {
		return customerAddressDetails_Inbox;
	}


	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement customerAddressDetails_SearchInbox;

	public WebElement customerAddressDetails_SearchInbox() {
		return customerAddressDetails_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement customerAddressDetails_SearchInboxInputField;

	public WebElement customerAddressDetails_SearchInboxInputField() {
		return customerAddressDetails_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement customerAddressDetails_SearchInboxCloseButton;

	public WebElement customerAddressDetails_SearchInboxCloseButton() {
		return customerAddressDetails_SearchInboxCloseButton;
	}
	
	// Additional Customer Info Tab
	@FindBy(xpath = "//ion-segment-button[@id='seg3']")
	private WebElement customerAddressDetails_AdditionalCustomerInfoTab;
	
	public WebElement customerAddressDetails_AdditionalCustomerInfoTab() {
		return customerAddressDetails_AdditionalCustomerInfoTab;
	}
	
	
	// Customer Personal Information Title
	@FindBy(xpath = "//ion-title[contains(text(),'Customer Personal Information')]")
	private WebElement customerAddressDetails_CustomerPersonalInformationTitle;
	
	public WebElement customerAddressDetails_CustomerPersonalInformationTitle() {
		return customerAddressDetails_CustomerPersonalInformationTitle;
	}
	
	// search button
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement customerAddressDetails_SearchButton;

	public WebElement customerAddressDetails_SearchButton() {
		return customerAddressDetails_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div[3]/span/input")
	private WebElement customerAddressDetails_SearchInputField;

	public WebElement customerAddressDetails_SearchInputField() {
		return customerAddressDetails_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement customerAddressDetails_SearchCloseButton;

	public WebElement customerAddressDetails_SearchCloseButton() {
		return customerAddressDetails_SearchCloseButton;
	}
	
	// Address details add button
//	@FindBy(xpath = "//ion-col[2]/descendant::button[@ng-reflect-text='Add']")
//	@FindBy(xpath = "//ion-title[contains(text(),'Address Details')]/ancestor::ion-card/child::ion-card-content/descendant::button[1]")
	@FindBy(xpath = "//ion-title[contains(text(),'Address Details')]/ancestor::ion-card/descendant::button[1]")
	private WebElement customerAddressDetails_AddressDetailAddButton;
	
	public WebElement customerAddressDetails_AddressDetailAddButton() {
		return customerAddressDetails_AddressDetailAddButton;
	}
	
	// Address details
	@FindBy(xpath = "//ion-title[contains(text(),'Address Details')]")
	private WebElement customerAddressDetails_AddressDetails;
	
	public WebElement customerAddressDetails_AddressDetails() {
		return customerAddressDetails_AddressDetails;
	}
	
	// Address details search button
//	@FindBy(xpath = "//ion-col[2]/descendant::button[@ng-reflect-text='Search']")
//	@FindBy(xpath = "//ion-title[text()=' Address Details ']/../../ion-card-content/descendant::div[3]/div/div[3]/span/button")
	@FindBy(xpath = "//ion-title[text()=' Address Details ']/ancestor::ion-card/descendant::button[@ng-reflect-text='Search']")
	private WebElement customerAddressDetails_AddressDetailSearchButton;
	
	public WebElement customerAddressDetails_AddressDetailSearchButton() {
		return customerAddressDetails_AddressDetailSearchButton;
	}
	
	// Address details search input field
//	@FindBy(xpath = "//div[3]/span/input")
	@FindBy(xpath = "//input[@class='p-inputtext p-component p-element p-inputtext-sm captionTempinput ng-star-inserted']")
	private WebElement customerAddressDetails_AddressDetailSearchInputField;
	
	public WebElement customerAddressDetails_AddressDetailSearchInputField() {
		return customerAddressDetails_AddressDetailSearchInputField;
	}
	
	// Address details search close button
//	@FindBy(xpath = "//div[3]/span/i")
//	@FindBy(xpath = "//kub-prime-table/p-table/div/div[1]/div/div[3]/span/i")
	@FindBy(xpath = "//ion-title[contains(text(),'Address Details')]/../../ion-card-content/descendant::i[@class='pi pi-times ng-star-inserted']")
	private WebElement customerAddressDetails_AddressDetailSearchCloseButton;
	
	public WebElement customerAddressDetails_AddressDetailSearchCloseButton() {
		return customerAddressDetails_AddressDetailSearchCloseButton;
	}
	
	// AddressType field
	@FindBy(xpath = "//ion-label[contains(text(),'Address Type')]/../ion-select")
	private WebElement customerAddressDetails_AddressTypeField;
	
	public WebElement customerAddressDetails_AddressTypeField() {
		return customerAddressDetails_AddressTypeField;
	}
	
	// AddressStatus Field
	@FindBy(xpath = "//ion-label[contains(text(),'Address Status')]/../ion-select")
	private WebElement customerAddressDetails_AddressStatusField;
	
	public WebElement customerAddressDetails_AddressStatusField() {
		return customerAddressDetails_AddressStatusField;
	}
	
	// Phone Number Field
	@FindBy(xpath = "//ion-label[contains(text(),'Phone Number')]/../ion-select")
	private WebElement customerAddressDetails_PhoneNumberField;
	
	public WebElement customerAddressDetails_PhoneNumberField() {
		return customerAddressDetails_PhoneNumberField;
	}
	
	// Emaid id Field
	@FindBy(xpath = "//ion-label[contains(text(),'Emaid id')]/../ion-select")
	private WebElement customerAddressDetails_EmailIdField;
	
	public WebElement customerAddressDetails_EmailIdField() {
		return customerAddressDetails_EmailIdField;
	}
	
	//  Residential or Occupancy Status  field
	@FindBy(xpath = "//ion-label[contains(text(),' Residential or Occupancy Status ')]/../ion-select")
	private WebElement customerAddressDetails_ResidentialOrOccupancyStatusField;
	
	public WebElement customerAddressDetails_ResidentialOrOccupancyStatusField() {
		return customerAddressDetails_ResidentialOrOccupancyStatusField;
	}
	
	// Mailling Or Contact Address Flag  field
	@FindBy(xpath = "//ion-label[contains(text(),'Mailling or Contact address flag')]/../../ion-item/ion-toggle")
	private WebElement customerAddressDetails_MaillingOrContactAddressFlag;
	
	public WebElement customerAddressDetails_MaillingOrContactAddressFlag() {
		return customerAddressDetails_MaillingOrContactAddressFlag;
	}
	
	// Address Line 1  field
	@FindBy(xpath = "//ion-col[6]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_AddressLine1Field;
	
	public WebElement customerAddressDetails_AddressLine1Field() {
		return customerAddressDetails_AddressLine1Field;
	}
	
	//Address Line 2  field
	@FindBy(xpath = "//ion-col[7]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_AddressLine2Field;
	
	public WebElement customerAddressDetails_AddressLine2Field() {
		return customerAddressDetails_AddressLine2Field;
	}
	
	//Country field
	@FindBy(xpath = "//ion-label[contains(text(),'Country')]/../ion-select")
	private WebElement customerAddressDetails_CountryField;
	
	public WebElement customerAddressDetails_CountryField() {
		return customerAddressDetails_CountryField;
	}
	
	// Province id field
	@FindBy(xpath = "//ion-label[contains(text(),' Province id ')]/../ion-select")
	private WebElement customerAddressDetails_ProvinceIdField;
	
	public WebElement customerAddressDetails_ProvinceIdField() {
		return customerAddressDetails_ProvinceIdField;
	}
	
	// NeighbourhoodDistrictName   field
	@FindBy(xpath = "//ion-col[10]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_NeighbourhoodDistrictNameField;
	
	public WebElement customerAddressDetails_NeighbourhoodDistrictNameField() {
		return customerAddressDetails_NeighbourhoodDistrictNameField;
	}
	
	// City id   field
	@FindBy(xpath = "//ion-label[contains(text(),' City id ')]/../ion-select")
	private WebElement customerAddressDetails_CityIdField;
	
	public WebElement customerAddressDetails_CityIdField() {
		return customerAddressDetails_CityIdField;
	}
	
	//ZipCode  field
	@FindBy(xpath = "//ion-col[12]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_ZipCodeField;
	
	public WebElement customerAddressDetails_ZipCodeField() {
		return customerAddressDetails_ZipCodeField;
	}
	
	//PoBoxNumber  field
	@FindBy(xpath = "//ion-col[13]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_PoBoxNumberField;
	
	public WebElement customerAddressDetails_PoBoxNumberField() {
		return customerAddressDetails_PoBoxNumberField;
	}
	
	//Mobile Number (Primary) Field
	@FindBy(xpath = "//ion-col[14]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_MobileNumberPrimaryField;
	
	public WebElement customerAddressDetails_MobileNumberPrimaryField() {
		return customerAddressDetails_MobileNumberPrimaryField;
	}
	
	//Mobile Number (Primary)2 Field
	@FindBy(xpath = "//ion-col[15]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_MobileNumberPrimary2Field;
	
	public WebElement customerAddressDetails_MobileNumberPrimary2Field() {
		return customerAddressDetails_MobileNumberPrimary2Field;
	}
	
	//Latitude Detail Of TheAddress Field
	@FindBy(xpath = "//ion-col[17]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_LatitudeDetailOfTheAddressField;
	
	public WebElement customerAddressDetails_LatitudeDetailOfTheAddressField() {
		return customerAddressDetails_LatitudeDetailOfTheAddressField;
	}
	
	//Longitude Detail Of TheAddress Field
	@FindBy(xpath = "//ion-col[18]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_LongitudeDetailOfTheAddressField;
	
	public WebElement customerAddressDetails_LongitudeDetailOfTheAddressField() {
		return customerAddressDetails_LongitudeDetailOfTheAddressField;
	}
	
	//Land Mark Field
	@FindBy(xpath = "//ion-col[19]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_LandmarkField;
	
	public WebElement customerAddressDetails_LandmarkField() {
		return customerAddressDetails_LandmarkField;
	}
	
	//Occupancy Date Field
	@FindBy(xpath = "//input[@id='icon']")
	private WebElement customerAddressDetails_OccupancyDateField;
	
	public WebElement customerAddressDetails_OccupancyDateField() {
		return customerAddressDetails_OccupancyDateField;
	}
	
	//Landlord Name Field
	@FindBy(xpath = "//ion-col[21]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_LandlordNameField;
	
	public WebElement customerAddressDetails_LandlordNameField() {
		return customerAddressDetails_LandlordNameField;
	}
	
	//Landlord Mobile Number Field
	@FindBy(xpath = "//ion-col[22]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_LandlordMobileNumberField;
	
	public WebElement customerAddressDetails_LandlordMobileNumberField() {
		return customerAddressDetails_LandlordMobileNumberField;
	}
	
	//RentAmount Field
	@FindBy(xpath = "//ion-col[23]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement customerAddressDetails_RentAmountField;
	
	public WebElement customerAddressDetails_RentAmountField() {
		return customerAddressDetails_RentAmountField;
	}
	
	//  Frequency of rent field
	@FindBy(xpath = "//ion-label[contains(text(),' Frequency of rent ')]/../ion-select")
	private WebElement customerAddressDetails_FrequencyOfRentField;
	
	public WebElement customerAddressDetails_FrequencyOfRentField() {
		return customerAddressDetails_FrequencyOfRentField;
	}
	
	//  Address ID list view Field
	@FindBy(xpath = "//span[contains(text(),'Address ID')]")
	private WebElement customerAddressDetails_AddressIDListViewField;
	
	public WebElement customerAddressDetails_AddressIDListViewField() {
		return customerAddressDetails_AddressIDListViewField;
	}
	
	//  Address ID value of first record list view
	@FindBy(xpath = "(//tr)[8]/td[2]/p-celleditor/span")
	private WebElement customerAddressDetails_AddressIDFirstValue;
	
	public WebElement customerAddressDetails_AddressIDFirstValue() {
		return customerAddressDetails_AddressIDFirstValue;
	}
	
	//  Address type list view Field
	@FindBy(xpath = "//span[contains(text(),'Address Type')]")
	private WebElement customerAddressDetails_AddressTypeListViewField;
	
	public WebElement customerAddressDetails_AddressTypeListViewField() {
		return customerAddressDetails_AddressTypeListViewField;
	}
	
	//  Address type value of first record list view
//	@FindBy(xpath = "(//tr)[8]/td[3]/p-celleditor/span")
	@FindBy(xpath = "(//tbody/tr/td[3]/p-celleditor/span)[3]")
	private WebElement customerAddressDetails_AddressTypeFirstValue;
	
	public WebElement customerAddressDetails_AddressTypeFirstValue() {
		return customerAddressDetails_AddressTypeFirstValue;
	}
	
	//  Address Status list view Field
	@FindBy(xpath = "//span[contains(text(),'Address Status')]")
	private WebElement customerAddressDetails_AddressStatusListViewField;
	
	public WebElement customerAddressDetails_AddressStatusListViewField() {
		return customerAddressDetails_AddressStatusListViewField;
	}
	
	//  Country list view Field
	@FindBy(xpath = "//span[contains(text(),'Country')]")
	private WebElement customerAddressDetails_CountryListViewField;
	
	public WebElement customerAddressDetails_CountryListViewField() {
		return customerAddressDetails_CountryListViewField;
	}
	
	//  Country value of first record list view
	@FindBy(xpath = "(//tbody/tr/td[4]/p-celleditor/span)[3]")
	private WebElement customerAddressDetails_CountryFirstValue;
	
	public WebElement customerAddressDetails_CountryFirstValue() {
		return customerAddressDetails_CountryFirstValue;
	}
	
	//  Occupancy Status list view Field
	@FindBy(xpath = "//span[contains(text(),'Occupancy Status')]")
	private WebElement customerAddressDetails_OccupancyStatusListViewField;
	
	public WebElement customerAddressDetails_OccupancyStatusListViewField() {
		return customerAddressDetails_OccupancyStatusListViewField;
	}
	

	//  Occupancy Status value of first record list view
	@FindBy(xpath = "(//tbody/tr/td[5]/p-celleditor/span)[3]")
	private WebElement customerAddressDetails_OccupancyStatusFirstValue;
	
	public WebElement customerAddressDetails_OccupancyStatusFirstValue() {
		return customerAddressDetails_OccupancyStatusFirstValue;
	}
	
	//  Occupance Since list view Field
	@FindBy(xpath = "//span[contains(text(),'Occupance Since')]")
	private WebElement customerAddressDetails_OccupanceSinceListViewField;
	
	public WebElement customerAddressDetails_OccupanceSinceListViewField() {
		return customerAddressDetails_OccupanceSinceListViewField;
	}
	
//  Occupance Since list value of first record list view
	@FindBy(xpath = "(//tbody/tr/td[6]/p-celleditor)[3]")
	private WebElement customerAddressDetails_OccupanceSinceFirstValue;
	
	public WebElement customerAddressDetails_OccupanceSinceFirstValue() {
		return customerAddressDetails_OccupanceSinceFirstValue;
	}
	
	//  Contact Address list view Field
	@FindBy(xpath = "//span[contains(text(),'Contact Address')]")
	private WebElement customerAddressDetails_ContactAddressListViewField;
	
	public WebElement customerAddressDetails_ContactAddressListViewField() {
		return customerAddressDetails_ContactAddressListViewField;
	}
	

//  contact address value of first record list view
	@FindBy(xpath = "(//tbody/tr/td[7]/p-celleditor/span)[2]")
	private WebElement customerAddressDetails_ContactAddressFirstValue;
	
	public WebElement customerAddressDetails_ContactAddressFirstValue() {
		return customerAddressDetails_ContactAddressFirstValue;
	}
	
	//  Export list view Field
	@FindBy(xpath = "//ion-title[contains(text(),'Address Details')]/../../ion-card-content/kub-prime-table/p-table/div/div/div/div[4]/p-dropdown/div/div[2]/span")
	private WebElement customerAddressDetails_AddressDetailsExportListViewField;
	
	public WebElement customerAddressDetails_AddressDetailsExportListViewField() {
		return customerAddressDetails_AddressDetailsExportListViewField;
	}
	
	//  Export to PDF list view Field
	@FindBy(xpath = "//span[contains(text(),'PDF')]")
	private WebElement customerAddressDetails_ExportToPDF;
	
	public WebElement customerAddressDetails_ExportToPDF() {
		return customerAddressDetails_ExportToPDF;
	}
	
	//  Export to Excel list view Field
	@FindBy(xpath = "//span[contains(text(),'XLS')]")
	private WebElement customerAddressDetails_ExportToXls;
	
	public WebElement customerAddressDetails_ExportToXls() {
		return customerAddressDetails_ExportToXls;
	}
	
	
	
	
	// no data display
//	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	@FindBy(xpath = "//ion-title[contains(text(),'Address Details')]/../../ion-card-content/descendant::p-paginator/div/span[1]")
	private WebElement applicationDetailsOffering_NoDataFoundInSearch;

	public WebElement applicationDetailsOffering_NoDataFoundInSearch() {
		return applicationDetailsOffering_NoDataFoundInSearch;
	}
	
	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[8]/img[1]")
	private WebElement applicationDetailsOffering_Profile;
	
	public WebElement applicationDetailsOffering_Profile() {
		return applicationDetailsOffering_Profile;
	}
	
	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement applicationDetailsOffering_LogoutUser;
	
	public WebElement applicationDetailsOffering_LogoutUser() {
		return applicationDetailsOffering_LogoutUser;
	}
}
