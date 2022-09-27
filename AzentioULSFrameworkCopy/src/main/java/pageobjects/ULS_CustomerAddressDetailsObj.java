package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_CustomerAddressDetailsObj {
	WebDriver driver;
	public ULS_CustomerAddressDetailsObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// AddressType field 

	@FindBy(xpath = "//ion-label[contains(text(),'Address Type')]/../ion-select") 

	private WebElement customerAddressDetails_AddressTypeField; 

	 

	public WebElement customerAddressDetails_AddressTypeField() { 

	return customerAddressDetails_AddressTypeField; 

	} 

	 @FindBy(xpath="//ion-label[text()='Additional Customer Info']//parent::ion-segment-button")
	 private WebElement uls_AdditionalCustomerInfoTab;
	 public WebElement ulsAdditionalCustomerInfoTab()
	 {
		 return uls_AdditionalCustomerInfoTab;
	 }
	 @FindBy(xpath="//ion-title[text()=' Address Details ']/parent::ion-card-header/following-sibling::ion-card-content//button[@ng-reflect-text='Add']")
	 private WebElement customerAddressDetails_AddButton;
	 public WebElement customerAddressDetailsAddButton()
	 {
		 return customerAddressDetails_AddButton;
	 }	 
	 @FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	 private WebElement csutomerDetails_SaveButton;
	 public WebElement csutomerAddressDetailsSaveButton()
	 {
		 return csutomerDetails_SaveButton;
	 }
	 @FindBy(xpath="(//button[@icon='pi pi-pencil'])[1]")
	 private WebElement customerAdditionalInfo_FirstRecord;
	 public WebElement customerAdditionalInfoFirstRecord()
	 {
		 return customerAdditionalInfo_FirstRecord;
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
	@FindBy(xpath="//ion-label[text()=' Address Type ']//ancestor::digital-select-layout//parent::ion-col//ion-badge")
	private WebElement addressDetails_AddressTypeFieldValidation;
	public WebElement addressDetailsAddressTypeFieldValidation()
	{
		return addressDetails_AddressTypeFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Address Status ']//ancestor::digital-select-layout//parent::ion-col//ion-badge")
	private WebElement addressDetails_AddressStatusFieldValidation;
	public WebElement addressDetailsAddressStatusFieldValidation()
	{
		return addressDetails_AddressStatusFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Residential or Occupancy Status ']//ancestor::digital-select-layout//parent::ion-col//ion-badge")
	private WebElement addressDetails_ResidentialorOccupancyStatusFieldValidation;
	public WebElement addressDetailsResidentialorOccupancyStatusFieldValidation()
	{
		return addressDetails_ResidentialorOccupancyStatusFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 1 ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement addressDetails_AddressLineOneFieldValidation;
	public WebElement addressDetailsAddressLineOneFieldValidation()
	{
		return addressDetails_AddressLineOneFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 2 ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement addressDetails_AddressLineTwoFieldValidation;
	public WebElement addressDetailsAddressLineTwoFieldValidation()
	{
		return addressDetails_AddressLineTwoFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Country ']//ancestor::digital-select-layout//parent::ion-col//ion-badge")
	private WebElement addressDetails_CountryTwoFieldValidation;
	public WebElement addressDetailsCountryTwoFieldValidation()
	{
		return addressDetails_CountryTwoFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Province id ']//ancestor::digital-select-layout//parent::ion-col//ion-badge")
	private WebElement addressDetails_ProvinceIDFieldValidation;
	public WebElement addressDetailsProvinceIDFieldValidation()
	{
		return addressDetails_ProvinceIDFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Neighbourhood/District Name ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement addressDetails_NeighbourhoodDistrictNameFieldValidation;
	public WebElement addressDetailsNeighbourhoodDistrictNameFieldValidation()
	{
		return addressDetails_NeighbourhoodDistrictNameFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' City id ']//ancestor::digital-select-layout//parent::ion-col//ion-badge")
	private WebElement addressDetails_CityIdFieldValidation;
	public WebElement addressDetailsCityIdFieldValidation()
	{
		return addressDetails_CityIdFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Zip Code ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement addressDetails_ZipCodeFieldValidation;
	public WebElement addressDetailsZipCodeFieldValidation()
	{
		return addressDetails_ZipCodeFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' PO BOX number ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement addressDetails_PoBoxNumberFieldValidation;
	public WebElement addressDetailsPoBoxNumberFieldValidation()
	{
		return addressDetails_PoBoxNumberFieldValidation;
	}
	@FindBy(xpath="(//ion-label[text()=' Mobile Number (Primary) ']//ancestor::digital-text-box//parent::ion-col//ion-badge)[1]")
	private WebElement addressDetails_MobileNumberPrimary1FieldValidation;
	public WebElement addressDetailsMobileNumberPrimary1FieldValidation()
	{
		return addressDetails_MobileNumberPrimary1FieldValidation;
	}
	@FindBy(xpath="(//ion-label[text()=' Mobile Number (Primary) ']//ancestor::digital-text-box//parent::ion-col//ion-badge)[2]")
	private WebElement addressDetails_MobileNumberPrimary2FieldValidation;
	public WebElement addressDetailsMobileNumberPrimary22FieldValidation()
	{
		return addressDetails_MobileNumberPrimary2FieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Latitude details of the address ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement addressDetails_LatitudeDetailsOfTheAddressFieldValidation;
	public WebElement addressDetailsLatitudeDetailsOfTheAddressFieldValidation()
	{
		return addressDetails_LatitudeDetailsOfTheAddressFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Longitude details of the address ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement addressDetails_LongitudeDetailsOfTheAddressFieldValidation;
	public WebElement addressDetailsLongitudeDetailsOfTheAddressFieldValidation()
	{
		return addressDetails_LongitudeDetailsOfTheAddressFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Land Mark ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement addressDetails_landMarkFieldValidation;
	public WebElement addressDetailsLandMarkFieldValidation()
	{
		return addressDetails_landMarkFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Occupancy date ']//ancestor::digital-prime-date//parent::ion-col//ion-badge")
	private WebElement addressDetails_OccupancydateFieldValidation;
	public WebElement addressDetailsOccupancydateFieldValidation()
	{
		return addressDetails_OccupancydateFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Landlord Name ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement addressDetails_landLoardnameFieldValidation;
	public WebElement addressDetailsLandLoardnameFieldValidation()
	{
		return addressDetails_landLoardnameFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Landlord Mobile Number ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement addressDetails_landLoardMobileNumberFieldValidation;
	public WebElement addressDetailslandLoardMobileNumberFieldValidation()
	{
		return addressDetails_landLoardMobileNumberFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' PO BOX number ']//following-sibling::ion-input")
	private WebElement customerAddressDetails_PoBoxNumberDataHolder;
	public WebElement customerAddressDetailsPoBoxNumberDataHolder()
	{
		return customerAddressDetails_PoBoxNumberDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Duration of Stay ']//following-sibling::ion-input")
	private WebElement customerAddressDetails_DurationOfStayDataHolder;
	public WebElement customerAddressDetailsDurationOfStayDataHolder()
	{
		return customerAddressDetails_DurationOfStayDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Duration of Stay ']//following-sibling::ion-input//input")
	private WebElement customerAddressDetails_DurationOfStayInputBox;
	public WebElement customerAddressDetailsDurationOfStayInputBox()
	{
		return customerAddressDetails_DurationOfStayInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Rent Amount ']//following-sibling::ion-input")
	private WebElement customerAddressDetails_RentAmountDataHolder;
	public WebElement customerAddressDetailsRentAmountDataHolder()
	{
		return customerAddressDetails_RentAmountDataHolder;
	}
}
