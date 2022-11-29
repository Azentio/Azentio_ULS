package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_WareHouseObj {
	WebDriver driver;
	public ULS_WareHouseObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-label[text()='Config Manager']")
	private WebElement uls_ConfigManagerMainMenu;
	public WebElement ulsConfigManagerMainMenu()
	{
		return uls_ConfigManagerMainMenu;
	}
	@FindBy(xpath="//span[text()='Configurations']")
    private WebElement ULS_ConfigurationMainMenu;
    public WebElement ULSConfigurationMainMenu()
    {
    	return ULS_ConfigurationMainMenu;
    }
	@FindBy(xpath="//ion-label[text()='Warehouse Master']//following-sibling::ion-buttons/ion-button[1]")
	private WebElement wareHouseMaster_TempView;
	public WebElement wareHouseMasterTempView()
	{
		return wareHouseMaster_TempView;
	}
	@FindBy(xpath="//ion-label[text()='Warehouse Master']//following-sibling::ion-buttons/ion-button[2]")
	private WebElement wareHouseMaster_ViewButton;
	public WebElement wareHouseMasterViewButton()
	{
		return wareHouseMaster_ViewButton;
	}
	@FindBy(xpath="//table//tbody//tr[1]/td[3]//span")
	private WebElement wareHouse_ListViewDescription;
	public WebElement wareHouseListViewDescription()
	{
		return wareHouse_ListViewDescription;
	}
	@FindBy(xpath="//table//tbody//tr[1]/td[4]//span")
	private WebElement wareHouse_ListViewAddress;
	public WebElement wareHouseListViewAddress()
	{
		return wareHouse_ListViewAddress;
	}
	@FindBy(xpath="//table//tbody//tr[1]/td[5]//span")
	private WebElement wareHouse_ListViewCountry;
	public WebElement wareHouseListViewCountry()
	{
		return wareHouse_ListViewCountry;
	}
	@FindBy(xpath="//table//tbody//tr[1]/td[6]//span")
	private WebElement wareHouse_ListViewState;
	public WebElement wareHouseListViewState()
	{
		return wareHouse_ListViewState;
	}
	@FindBy(xpath="//table//tbody//tr[1]/td[7]//span")
	private WebElement wareHouse_ListViewCity;
	public WebElement wareHouseListViewCity()
	{
		return wareHouse_ListViewCity;
	}
	@FindBy(xpath="//table//tbody//tr[1]/td[8]//span")
	private WebElement wareHouse_ListViewZipCode;
	public WebElement wareHouseListViewZipCode()
	{
		return wareHouse_ListViewZipCode;
	}
	@FindBy(xpath="//table//tbody//tr[1]/td[9]//span")
	private WebElement wareHouse_ListViewPhone1;
	public WebElement wareHouseListViewPhone1()
	{
		return wareHouse_ListViewPhone1;
	}
	@FindBy(xpath="//table//tbody//tr[1]/td[10]//span")
	private WebElement wareHouse_ListViewFax;
	public WebElement wareHouseListViewFax()
	{
		return wareHouse_ListViewFax;
	}
	@FindBy(xpath="//table//tbody//tr[1]/td[11]//span")
	private WebElement wareHouse_ListViewEmail;
	public WebElement wareHouseListViewEmail()
	{
		return wareHouse_ListViewEmail;
	}
	@FindBy(xpath="//table//tbody//tr[1]/td[12]//span")
	private WebElement wareHouse_ListViewContactPerson;
	public WebElement wareHouseListViewContactPerson()
	{
		return wareHouse_ListViewContactPerson;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement wareHouse_AddButton;
	public WebElement wareHouseAddButton()
	{
		return wareHouse_AddButton;
	}
	@FindBy(xpath="//ion-label[text()=' Description ']//following-sibling::ion-input//input")
	private WebElement wareHouse_DescriptionTextBox;
	public WebElement wareHouseDescriptionTextBox()
	{
		return wareHouse_DescriptionTextBox;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Search']")
	private WebElement wareHouse_SearchIcon;
	public WebElement wareHouseSearchIcon()
	{
		return wareHouse_SearchIcon;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement wareHouse_SearchTextBox;
	public WebElement wareHouseSearchTextBox()
	{
		return wareHouse_SearchTextBox;
	}
	@FindBy(xpath="//span[text()='Export']")
	private WebElement wareHouse_ExportButton;
	public WebElement wareHouseExportButton()
	{
		return wareHouse_ExportButton;
	}
	@FindBy(xpath="//li[@aria-label='PDF']")
	private WebElement wareHouse_ExportPDFOption;
	public WebElement wareHouseExportPDFOption()
	{
		return wareHouse_ExportPDFOption;
	}
	@FindBy(xpath="//li[@aria-label='XLS']")
	private WebElement wareHouse_ExportXLSOption;
	public WebElement wareHouseExportXLSOption()
	{
		return wareHouse_ExportXLSOption;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement wareHouse_BackButton;
	public WebElement wareHouseBackButton()
	{
		return wareHouse_BackButton;
	}
	@FindBy(xpath="//input[@mode='ios']/parent::span/i")
	private WebElement wareHouse_TextBoxCloseButton;
	public WebElement wareHouseTextBoxCloseButton()
	{
		return wareHouse_TextBoxCloseButton;
	}
	
	@FindBy(xpath="//span[text()='Showing 0 to 0 of 0 entries']")
	private WebElement wareHouse_UnmatchedTestResult;
	public WebElement wareHouseUnmatchedSearchResult()
	{
		return wareHouse_UnmatchedTestResult;
	}
	@FindBy(xpath="//ion-col[3]//ion-select")
	private WebElement wareHouse_CountryDropDOwn;
	public WebElement wareHouseCountryDropDownData()
	{
		return wareHouse_CountryDropDOwn;
	}
	@FindBy(xpath="//ion-col[4]//ion-select")
	private WebElement wareHouse_StateDropDown;
	public WebElement wareHouseStateDropDown()
	{
		return wareHouse_StateDropDown;
	}
	@FindBy(xpath="//ion-col[5]//ion-select")
	private WebElement wareHouse_CityDropDown;
	public WebElement wareHouseCityDropDown()
	{
		return wareHouse_CityDropDown;
	}
	@FindBy(xpath="//ion-toggle//input")
	private WebElement wareHouse_ToggleButton;
	public WebElement wareHouseToggleButton()
	{
		return wareHouse_ToggleButton;
	}
//	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
//	private WebElement wareHouse_backButton;
//	public WebElement wareHouseBackButton()
//	{
//		return wareHouse_backButton;
//	}
	@FindBy(xpath="(//ion-col[6]//ion-select)[1]")
	private WebElement wareHouse_ZipCodeDropDOwnDataHolder;
	public WebElement wareHouseZipCodeDropDOwnDataHolder()
	{
		return wareHouse_ZipCodeDropDOwnDataHolder;
	}
	@FindBy(xpath="//table//tr[1]//td[13]//span")
	private WebElement wareHouse_Status;
	public WebElement wareHouseStatus()
	{
		return wareHouse_Status;
	}
	@FindBy(xpath="//table//tr[1]//td[1]//button[1]")
	private WebElement wareHouse_ApprovedFirstRecord;
	public WebElement wareHouseApprovedFirstRecord()
	{
		return wareHouse_ApprovedFirstRecord;
	}
	@FindBy(xpath = "//ion-col[1]/digital-text-box[1]/ion-item[1]/ion-input[1]")
	private WebElement Warehouse_Description;

	public WebElement Warehouse_Description() {
		return Warehouse_Description;
	}

	@FindBy(xpath = "//ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]")
	private WebElement Warehouse_Address;

	public WebElement Warehouse_Address() {
		return Warehouse_Address;
	}
	@FindBy(xpath = "//ion-label[text()=' Phone 1 ']/following-sibling::ion-input")
	private WebElement Warehouse_Phone1_validation;

	public WebElement Warehouse_Phone1_validation() {
		return Warehouse_Phone1_validation;
	}

	@FindBy(xpath = "//ion-col[8]//ion-input[1]")
	private WebElement Warehouse_Fax;

	public WebElement Warehouse_Fax() {
		return Warehouse_Fax;
	}

	@FindBy(xpath = "//ion-col[9]//ion-input[1]")
	private WebElement Warehouse_Email;

	public WebElement Warehouse_Email() {
		return Warehouse_Email;
	}

	@FindBy(xpath = "//ion-col[10]//ion-input[1]")
	private WebElement Warehouse_ContactPerson;

	public WebElement Warehouse_ContactPerson() {
		return Warehouse_ContactPerson;
	}
}
