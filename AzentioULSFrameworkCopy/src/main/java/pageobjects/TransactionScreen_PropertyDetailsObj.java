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
	
	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement propertyDetails_Maker_MenuToggle;

	public WebElement propertyDetails_Maker_MenuToggle() {
		return propertyDetails_Maker_MenuToggle;
	}
	
	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement propertyDetails_Inbox;

	public WebElement propertyDetails_Inbox() {
		return propertyDetails_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement propertyDetails_SearchInbox;

	public WebElement propertyDetails_SearchInbox() {
		return propertyDetails_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement propertyDetails_SearchInboxInputField;

	public WebElement propertyDetails_SearchInboxInputField() {
		return propertyDetails_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement propertyDetails_SearchInboxCloseButton;

	public WebElement propertyDetails_SearchInboxCloseButton() {
		return propertyDetails_SearchInboxCloseButton;
	}
	
	// search button
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement propertyDetails_SearchButton;

	public WebElement propertyDetails_SearchButton() {
		return propertyDetails_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div[3]/span/input")
	private WebElement propertyDetails_SearchInputField;

	public WebElement propertyDetails_SearchInputField() {
		return propertyDetails_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement propertyDetails_SearchCloseButton;

	public WebElement propertyDetails_SearchCloseButton() {
		return propertyDetails_SearchCloseButton;
	}
		
//	@FindBy(xpath="//ion-label[text()='Property Details']//parent::ion-segment-button")
	@FindBy(xpath="//ion-modal[1]/descendant::ion-segment-button[11]")
	private WebElement appdataEntry_PropertyDetailsTab;
	public WebElement appdataEntryPropertyDetailsTab()
	{
		return appdataEntry_PropertyDetailsTab;
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
	@FindBy(xpath="//ion-label[text()=' Address Line 1 ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_AddressLine1InputBox;
	public WebElement propertyDetailsAddressLine1InputBox()
	{
		return propertyDetails_AddressLine1InputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 2 ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_AddressLine2InputBox;
	public WebElement propertyDetailsAddressLine2InputBox()
	{
		return propertyDetails_AddressLine2InputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Address Line 3 ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_AddressLine3InputBox;
	public WebElement propertyDetailsAddressLine3InputBox()
	{
		return propertyDetails_AddressLine3InputBox;
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
	@FindBy(xpath="//ion-label[text()=' City ']//following-sibling::ion-select")
	private WebElement propertyDetails_CityDropDown;
	public WebElement propertyDetailsCityDropDown()
	{
		return propertyDetails_CityDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' District/Neighbourhood ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_DistrictNeighbourhoodInputBox;
	public WebElement propertyDetailsDistrictNeighbourhoodInputBox()
	{
		return propertyDetails_DistrictNeighbourhoodInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Pincode ']//following-sibling::ion-input//input")
	private WebElement propertyDetails_PincodeInputBox;
	public WebElement propertyDetailsPincodeInputBox()
	{
		return propertyDetails_PincodeInputBox;
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
	private WebElement propertyDetails_PropertyManagementInputBox;
	public WebElement propertyDetailsPropertyManagementInputBox()
	{
		return propertyDetails_PropertyManagementInputBox;
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
	
}
