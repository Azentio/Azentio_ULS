package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionScreen_PropertyDetailsObj {
	WebDriver driver;
	public TransactionScreen_PropertyDetailsObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-label[text()='Property Details']//parent::ion-segment-button")
	private WebElement appdataEntry_PropertyDetailsTab;
	public WebElement appdataEntryPropertyDetailsTab()
	{
		return appdataEntry_PropertyDetailsTab;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement appdataEntry_PropertyDetailsAddButton;
	public WebElement appdataEntryPropertyDetailsAddButton()
	{
		return appdataEntry_PropertyDetailsAddButton;
	}
	@FindBy(xpath="(//ion-title[text()=' Property Details '])[2]")
	private WebElement appdataEntry_PropertyDetailsTitle;
	public WebElement appdataEntryPropertyDetailsTitle()
	{
		return appdataEntry_PropertyDetailsTitle;
	}
	@FindBy(xpath="//ion-label[text()=' Address Details ']")
	private WebElement appdataEntry_AddressDetailsTitle;
	public WebElement appdataEntryAddressDetailsTitle()
	{
		return appdataEntry_AddressDetailsTitle;
	}
	@FindBy(xpath="//ion-label[text()=' Charge Details ']")
	private WebElement appdataEntry_ChargeDetailsTitle;
	public WebElement appdataEntryChargeDetailsTitle()
	{
		return appdataEntry_ChargeDetailsTitle;
	}
	@FindBy(xpath="//ion-label[text()=' Construction Details  ']")
	private WebElement appdataEntry_ConstructionDetailsTitle;
	public WebElement appdataEntryConstructionDetailsTitle()
	{
		return appdataEntry_ConstructionDetailsTitle;
	}
	@FindBy(xpath="//button[text()=' Next']")
	private WebElement appdataEntry_NextButton;
	public WebElement appdataEntryNextButton()
	{
		return appdataEntry_NextButton;
	}
	@FindBy(xpath="//ion-label[text()=' Security Type ']//following-sibling::ion-select")
	private WebElement propertyDetails_SecurityTypeDropDown;
	public WebElement propertyDetailsSecurityTypeDropDown()
	{
		return propertyDetails_SecurityTypeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Property City ']//following-sibling::ion-select")
	private WebElement propertyDetails_propertyCityDropDown;
	public WebElement propertyDetailsPropertyCityDropDown()
	{
		return propertyDetails_propertyCityDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Type of Transaction ']//following-sibling::ion-select")
	private WebElement propertyDetails_TypeOfTransactionDropDown;
	public WebElement propertyDetailsTypeOfTransactionDropDown()
	{
		return propertyDetails_TypeOfTransactionDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Purchased From ']//following-sibling::ion-select")
	private WebElement propertyDetails_PurchasedFromDropDown;
	public WebElement propertyDetailsPurchasedFromDropDown()
	{
		return propertyDetails_PurchasedFromDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Property Type ']//following-sibling::ion-select")
	private WebElement propertyDetails_PropertyTypeDropDown;
	public WebElement propertyDetailsPropertyTypeDropDown()
	{
		return propertyDetails_PropertyTypeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' APF Status ']//following-sibling::ion-select")
	private WebElement propertyDetails_APFStatusDropDown;
	public WebElement propertyDetailsAPFStatusDropDown()
	{
		return propertyDetails_APFStatusDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Construction Status ']//following-sibling::ion-select")
	private WebElement propertyDetails_ConstructionStatusDropDown;
	public WebElement propertyDetailsConstructionStatusDropDown()
	{
		return propertyDetails_ConstructionStatusDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Property Category ']//following-sibling::ion-select")
	private WebElement propertyDetails_PropertyCategoryDropDown;
	public WebElement propertyDetailsPropertyCategoryDropDown()
	{
		return propertyDetails_PropertyCategoryDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Nature of Property ']//following-sibling::ion-select")
	private WebElement propertyDetails_NatureOfPropertyDropDown;
	public WebElement propertyDetailsNatureOfPropertyDropDown()
	{
		return propertyDetails_NatureOfPropertyDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Occupancy Status ']//following-sibling::ion-select")
	private WebElement propertyDetails_OccupencyStatusDropDown;
	public WebElement propertyDetailsOccupencyStatusDropDown()
	{
		return propertyDetails_OccupencyStatusDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Name of the Developer ']//following-sibling::ion-select")
	private WebElement propertyDetails_NameOfTheDeveloperDropDown;
	public WebElement propertyDetailsNameOfTheDeveloperDropDown()
	{
		return propertyDetails_NameOfTheDeveloperDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Project ']//following-sibling::ion-select")
	private WebElement propertyDetails_ProjectDropDown;
	public WebElement propertyDetailsProjectDropDown()
	{
		return propertyDetails_ProjectDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Building Details ']//following-sibling::ion-select")
	private WebElement propertyDetails_BuildingDetailsDropDown;
	public WebElement propertyDetailsBuildingDetailsDropDown()
	{
		return propertyDetails_BuildingDetailsDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Unit Details ']//following-sibling::ion-select")
	private WebElement propertyDetails_UnitDetailsDropDown;
	public WebElement propertyDetailsUnitDetailsDropDown()
	{
		return propertyDetails_UnitDetailsDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Flat/House No. /Shop No. Plot No. ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_AddressLine1InputBox;
	public WebElement propertyDetailsAddressLine1InputBox()
	{
		return propertyDetails_AddressLine1InputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Flat/House No. /Shop No. Plot No. ']//following-sibling::ion-input")
	private WebElement propertyDetails_AddressLine1DataHolder;
	public WebElement propertyDetailsAddressLine1DataHolder()
	{
		return propertyDetails_AddressLine1DataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 2 ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_AddressLine2InputBox;
	public WebElement propertyDetailsAddressLine2InputBox()
	{
		return propertyDetails_AddressLine2InputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 2 ']//following-sibling::ion-input")
	private WebElement propertyDetails_AddressLine2dataHolder;
	public WebElement propertyDetailsAddressLine2dataHolder()
	{
		return propertyDetails_AddressLine2dataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 3 ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_AddressLine3InputBox;
	public WebElement propertyDetailsAddressLine3InputBox()
	{
		return propertyDetails_AddressLine3InputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 3 ']//following-sibling::ion-input")
	private WebElement propertyDetails_AddressLine3DataHolder;
	public WebElement propertyDetailsAddressLine3DataHolder()
	{
		return propertyDetails_AddressLine3DataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Country ']//following-sibling::ion-select")
	private WebElement propertyDetails_CountryDropDown;
	public WebElement propertyDetailsCountryDropDown()
	{
		return propertyDetails_CountryDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' State ']//following-sibling::ion-select")
	private WebElement propertyDetails_StateDropDown;
	public WebElement propertyDetailsStateDropDown()
	{
		return propertyDetails_StateDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' City ']//following-sibling::ion-input")
	private WebElement propertyDetails_CityDropDown1;
	public WebElement propertyDetailsCityDropDown1()
	{
		return propertyDetails_CityDropDown1;
	}
	@FindBy(xpath="//ion-label[text()=' City ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_CityDropDown;
	public WebElement propertyDetailsCityDropDown()
	{
		return propertyDetails_CityDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' District/Neighbourhood ']//following-sibling::ion-select")
	private WebElement propertyDetails_DistrictNeighbourhoodInputBox;
	public WebElement propertyDetailsDistrictNeighbourhoodInputBox()
	{
		return propertyDetails_DistrictNeighbourhoodInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' District/Neighbourhood ']//following-sibling::ion-input")
	private WebElement propertyDetails_DistrictNeighbourhoodDataHolder;
	public WebElement propertyDetailsDistrictNeighbourhoodDataHolder()
	{
		return propertyDetails_DistrictNeighbourhoodDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Pincode ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_PincodeInputBox;
	public WebElement propertyDetailsPincodeInputBox()
	{
		return propertyDetails_PincodeInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Pincode ']//following-sibling::ion-input")
	private WebElement propertyDetails_PincodeDataHolder;
	public WebElement propertyDetailsPincodeDataHolder()
	{
		return propertyDetails_PincodeDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Location Type ']//following-sibling::ion-select")
	private WebElement propertyDetails_LocationTypeDropDown;
	public WebElement propertyDetails_LocationTypeDropDown()
	{
		return propertyDetails_LocationTypeDropDown;
	}
	
	
	@FindBy(xpath="//ion-label[text()=' Location Category ']//following-sibling::ion-select")
	private WebElement propertyDetails_LocationCategoryDropDown;
	public WebElement propertyDetails_LocationCategoryDropDown()
	{
		return propertyDetails_LocationCategoryDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Distance from Branch to Property ']//following-sibling::ion-select")
	private WebElement propertyDetails_DistancefromBranchtoPropertyDropDown;
	public WebElement propertyDetails_DistancefromBranchtoPropertyDropDown()
	{
		return propertyDetails_DistancefromBranchtoPropertyDropDown;
	}
	
	@FindBy(xpath="//ion-label[text()=' Distance from Branch to Property ']//span")
	private WebElement propertyDetails_DistancefromBranchtoPropertyMandatoryCheck;
	public WebElement propertyDetails_DistancefromBranchtoPropertyMandatoryCheck()
	{
		return propertyDetails_DistancefromBranchtoPropertyMandatoryCheck;
	}

	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//ion-label[text()=' Type of Charge ']//following-sibling::ion-select")
	private WebElement propertyDetails_TypeofChargeDropDown;
	public WebElement propertyDetailsTypeofChargeDropDown()
	{
		return propertyDetails_TypeofChargeDropDown;
	}	
	@FindBy(xpath="//ion-label[text()=' Name of the Charge Holder ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_NameoftheChargeHolderInputBox;
	public WebElement propertyDetailsNameoftheChargeHolderInputBox()
	{
		return propertyDetails_NameoftheChargeHolderInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Name of the Charge Holder ']//following-sibling::ion-input")
	private WebElement propertyDetails_NameoftheChargeHolderDataHolder;
	public WebElement propertyDetailsNameoftheChargeHolderDataHolder()
	{
		return propertyDetails_NameoftheChargeHolderDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Amount to the Charge Holder  ']/ancestor::ion-item//p-inputnumber//input")
	private WebElement propertyDetails_AmounttotheChargeHolderInputBox;
	public WebElement propertyDetailsAmounttotheChargeHolderInputBox()
	{
		return propertyDetails_AmounttotheChargeHolderInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Measurement ']//following-sibling::ion-select")
	private WebElement propertyDetails_MeasurementDropDown;
	public WebElement propertyDetailsMeasurementDropDown()
	{
		return propertyDetails_MeasurementDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Approx. Property Area ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_ApproxPropertyAreaInputBox;
	public WebElement propertyDetailsApproxPropertyAreaInputBox()
	{
		return propertyDetails_ApproxPropertyAreaInputBox;
	}

	@FindBy(xpath="//ion-label[text()=' Built Up/Plot Area ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_BuiltUpPlotAreaInputBox;
	public WebElement propertyDetailsBuiltUpPlotAreaInputBox()
	{
		return propertyDetails_BuiltUpPlotAreaInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Carpet Area ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_CarpetAreaInputBox;
	public WebElement propertyDetailsCarpetAreaInputBox()
	{
		return propertyDetails_CarpetAreaInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Property Management ']/following-sibling::ion-select")
	private WebElement propertyDetails_PropertyManagementDropDown;
	public WebElement propertyDetailsPropertyManagementDropDown()
	{
		return propertyDetails_PropertyManagementDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Year Of Construction  ']/parent::div/following-sibling::p-calendar//button")
	private WebElement propertyDetails_YearOfConstructionCalendarInput;
	public WebElement propertyDetailsYearOfConstructionCalendarInput()
	{
		return propertyDetails_YearOfConstructionCalendarInput;
	}
	@FindBy(xpath="//ion-label[text()=' Expected Completion Date  ']/parent::div/following-sibling::p-calendar//button")
	private WebElement propertyDetails_ExpectedCompletionDateCalendarInput;
	public WebElement propertyDetailsExpectedCompletionDateCalendarInput()
	{
		return propertyDetails_ExpectedCompletionDateCalendarInput;
	}
	@FindBy(xpath="//ion-label[text()=' Agreement Validity Date ']/parent::div/following-sibling::p-calendar//button")
	private WebElement propertyDetails_AgreementValidityDateCalendarInput;
	public WebElement propertyDetailsAgreementValidityDateCalendarInput()
	{
		return propertyDetails_AgreementValidityDateCalendarInput;
	}
	@FindBy(xpath="//ion-label[text()=' Agreement Date ']/parent::div/following-sibling::p-calendar//button")
	private WebElement propertyDetails_AgreementDateCalendarInput;	
	public WebElement propertyDetailsAgreementDateCalendarInput()
	{
		return propertyDetails_AgreementDateCalendarInput;
	}
	@FindBy(xpath="//ion-label[text()=' Year Of Construction  ']/parent::div/following-sibling::p-calendar//input")
	private WebElement propertyDetails_YearOfConstructionCalendarInputBox;
	public WebElement propertyDetailsYearOfConstructionCalendarInputBox()
	{
		return propertyDetails_YearOfConstructionCalendarInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Expected Completion Date  ']/parent::div/following-sibling::p-calendar//input")
	private WebElement propertyDetails_ExpectedCompletionDateCalendarInputBox;
	public WebElement propertyDetailsExpectedCompletionDateCalendarInputBox()
	{
		return propertyDetails_ExpectedCompletionDateCalendarInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Agreement Validity Date ']/parent::div/following-sibling::p-calendar//input")
	private WebElement propertyDetails_AgreementValidityDateCalendarInputBox;
	public WebElement propertyDetailsAgreementValidityDateCalendarInputBox()
	{
		return propertyDetails_AgreementValidityDateCalendarInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Agreement Date ']/parent::div/following-sibling::p-calendar//input")
	private WebElement propertyDetails_AgreementDateCalendarInputBox;	
	public WebElement propertyDetailsAgreementDateCalendarInputBox()
	{
		return propertyDetails_AgreementDateCalendarInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' % of Completion  ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_PercentageOfCompletionInputBox;	
	public WebElement propertyDetailsPercentageOfCompletionInputBox()
	{
		return propertyDetails_PercentageOfCompletionInputBox;
	}
	@FindBy(xpath="//ion-toggle")
	private WebElement propertyDetails_StatusToggleButton;	
	public WebElement propertyDetailsStatusToggleButton()
	{
		return propertyDetails_StatusToggleButton;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 1 ']//span")
	private WebElement propertyDetails_AddressLine1MandatoryCheck;
	public WebElement propertyDetailsAddressLine1MandatoryCheck()
	{
		return propertyDetails_AddressLine1MandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 2 ']//span")
	private WebElement propertyDetails_AddressLine2MandatoryCheck;
	public WebElement propertyDetailsAddressLine2MandatoryCheck()
	{
		return propertyDetails_AddressLine2MandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' District/Neighbourhood ']//span")
	private WebElement propertyDetails_DistritNeighbourhoodMandatoryCheck;
	public WebElement propertyDetailsDistritNeighbourhoodMandatoryCheck()
	{
		return propertyDetails_DistritNeighbourhoodMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Pincode ']//span")
	private WebElement propertyDetails_PincodeMandatoryCheck;
	public WebElement propertyDetailsPincodeMandatoryCheck()
	{
		return propertyDetails_PincodeMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Name of the Charge Holder ']//span")
	private WebElement propertyDetails_NameoftheChargeHolderMandatoryCheck;
	public WebElement propertyDetailsNameoftheChargeHolderMandatoryCheck()
	{
		return propertyDetails_NameoftheChargeHolderMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Amount to the Charge Holder ']//span")
	private WebElement propertyDetails_AmounttotheChargeHolderMandatoryCheck;
	public WebElement propertyDetailsAmounttotheChargeHolderMandatoryCheck()
	{
		return propertyDetails_AmounttotheChargeHolderMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Approx. Property Area ']//span")
	private WebElement propertyDetails_ApproxPropertyAreaMandatoryCheck;
	public WebElement propertyDetailsApproxPropertyAreaMandatoryCheck()
	{
		return propertyDetails_ApproxPropertyAreaMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Built Up/Plot Area ']//span")
	private WebElement propertyDetails_BuiltUpPlotAreaMandatoryCheck;
	public WebElement propertyDetailsBuiltUpPlotAreaMandatoryCheck()
	{
		return propertyDetails_BuiltUpPlotAreaMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Carpet Area ']//span")
	private WebElement propertyDetails_CarpetAreaMandatoryCheck;
	public WebElement propertyDetailsCarpetAreaMandatoryCheck()
	{
		return propertyDetails_CarpetAreaMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Year Of Construction  ']//span")
	private WebElement propertyDetails_YearOfConstructionMandatoryCheck;
	public WebElement propertyDetailsYearOfConstructionMandatoryCheck()
	{
		return propertyDetails_YearOfConstructionMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' % of Completion  ']//span")
	private WebElement propertyDetails_PercentageOfCompletionMandatoryCheck;
	public WebElement propertyDetailsPercentageOfCompletionMandatoryCheck()
	{
		return propertyDetails_PercentageOfCompletionMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Expected Completion Date  ']//span")
	private WebElement propertyDetails_ExpectedCompletionDateMandatoryCheck;
	public WebElement propertyDetailsExpectedCompletionDateMandatoryCheck()
	{
		return propertyDetails_ExpectedCompletionDateMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Agreement Date ']//span")
	private WebElement propertyDetails_AgreementDateMandatoryCheck;
	public WebElement propertyDetailsAgreementDateMandatoryCheck()
	{
		return propertyDetails_AgreementDateMandatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Agreement Validity Date ']//span")
	private WebElement propertyDetails_AgreementValidityDateMandatoryCheck;
	public WebElement propertyDetailsAgreementValidityDateMandatoryCheck()
	{
		return propertyDetails_AgreementValidityDateMandatoryCheck;
	}
	
	
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement propertyDetails_SaveButton;
	public WebElement propertyDetailsSaveButton()
	{
		return propertyDetails_SaveButton;
	}
	@FindBy(xpath="(//div[@id='toast-container']/div/div)[1]")
	private WebElement propertyDetails_AlertBox;
	public WebElement propertyDetailsAlertBox()
	{
		return propertyDetails_AlertBox;
	}
	@FindBy(xpath="//ion-label[text()=' Security Type ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_SecurityTypeFieldValidation;
	public WebElement propertyDetailsSecurityTypeFieldValidation()
	{
		return propertyDetails_SecurityTypeFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Property City ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_PropertyCityFieldValidation;
	public WebElement propertyDetailsPropertyCityFieldValidation()
	{
		return propertyDetails_PropertyCityFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Type of Transaction ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_TypeOfTransactionFieldValidation;
	public WebElement propertyDetailsTypeOfTransactionFieldValidation()
	{
		return propertyDetails_TypeOfTransactionFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Purchased From ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_PurchasedFromFieldValidation;
	public WebElement propertyDetailsPurchasedFromFieldValidation()
	{
		return propertyDetails_PurchasedFromFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Property Type ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_PropertyTypeFieldValidation;
	public WebElement propertyDetailsPropertyTypeFieldValidation()
	{
		return propertyDetails_PropertyTypeFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' APF Status ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_APFStatusFieldValidation;
	public WebElement propertyDetailsAPFStatusFieldValidation()
	{
		return propertyDetails_APFStatusFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Construction Status ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_ConstructionStatusdValidation;
	public WebElement propertyDetailsConstructionStatusdValidation()
	{
		return propertyDetails_ConstructionStatusdValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Property Category ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_PropertyCategorydValidation;
	public WebElement propertyDetailsPropertyCategorydValidation()
	{
		return propertyDetails_PropertyCategorydValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Nature of Property ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_NatureofPropertyFieldValidation;
	public WebElement propertyDetailsNatureofPropertyFieldValidation()
	{
		return propertyDetails_NatureofPropertyFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Occupancy Status ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_OccupancyStatusFieldValidation;
	public WebElement propertyDetailsOccupancyStatusFieldValidation()
	{
		return propertyDetails_OccupancyStatusFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Name of the Developer ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement propertyDetails_NameoftheDeveloperFieldValidation;
	public WebElement propertyDetailsNameoftheDeveloperFieldValidation()
	{
		return propertyDetails_NameoftheDeveloperFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 1 ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement propertyDetails_AddressLineOneFieldValidation;
	public WebElement propertyDetailsAddressLineOneFieldValidation()
	{
		return propertyDetails_AddressLineOneFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 2 ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement propertyDetails_AddressLineTwoFieldValidation;
	public WebElement propertyDetailsAddressLineTwoFieldValidation()
	{
		return propertyDetails_AddressLineTwoFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 3 ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement propertyDetails_AddressLineThreeFieldValidation;
	public WebElement propertyDetailsAddressLineThreeFieldValidation()
	{
		return propertyDetails_AddressLineThreeFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' District/Neighbourhood ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement propertyDetails_DistrictNeighbourhoodValidation;
	public WebElement propertyDetailsDistrictNeighbourhoodValidation()
	{
		return propertyDetails_DistrictNeighbourhoodValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Pincode ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement propertyDetails_PincodeFieldValidation;
	public WebElement propertyDetailsPincodeFieldValidation()
	{
		return propertyDetails_PincodeFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Name of the Charge Holder ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement propertyDetails_NameoftheChargeHolderFieldValidation;
	public WebElement propertyDetailsNameoftheChargeHolderFieldValidation()
	{
		return propertyDetails_NameoftheChargeHolderFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Approx. Property Area ']//following-sibling::ion-input")
	private WebElement propertyDetails_ApproxPropertyAreaDataHolder;
	public WebElement propertyDetailsApproxPropertyAreaDataHolder()
	{
		return propertyDetails_ApproxPropertyAreaDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Built Up/Plot Area ']//following-sibling::ion-input")
	private WebElement propertyDetails_BuiltUpPlotAreaDataHolder;
	public WebElement propertyDetailsBuiltUpPlotAreaDataHolder()
	{
		return propertyDetails_BuiltUpPlotAreaDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Carpet Area ']//following-sibling::ion-input")
	private WebElement propertyDetails_CarpetAreaDataHolder;
	public WebElement propertyDetailsCarpetAreaDataHolder()
	{
		return propertyDetails_CarpetAreaDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' % of Completion  ']//following-sibling::ion-input")
	private WebElement propertyDetails_PercentageOfCompletionDataHolder;
	public WebElement propertyDetailsPercentageOfCompletionDataHolder()
	{
		return propertyDetails_PercentageOfCompletionDataHolder;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement propertyDetails_BackButton;
	public WebElement propertyDetailsBackButton()
	{
		return propertyDetails_BackButton;
	}
	@FindBy(xpath="(//span[text()=' Action '])[2]")
	private WebElement propertyDetails_BackButtonVerification;
	public WebElement propertyDetailsBackButtonVerification()
	{
		return propertyDetails_BackButtonVerification;
	}
	@FindBy(xpath="//ion-label[text()=' Construction Cost ']")
	private WebElement propertyDetails_constructioncost;
	public WebElement propertyDetails_constructioncost()
	{
		return propertyDetails_constructioncost;
	}
	
}
