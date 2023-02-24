package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Warehouse_MasterObj {

	WebDriver driver;

	public Warehouse_MasterObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
	private WebElement Configurations;

	public WebElement Configurations() {
		return Configurations;
	}
	
	@FindBy(xpath="//ion-select[@aria-label='Corporate']")
	private WebElement Corporate;
	public WebElement Corporate(){
		return Corporate;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'LOS')]/parent::ion-item//ion-radio")
	private WebElement LOS;
	
	public WebElement LOS() {
		return LOS;
	}
	
	@FindBy(xpath = "//ion-card-content//ion-col[1]//div//ion-button")
	private WebElement Menu;

	public WebElement Menu() {
		return Menu;
	}
	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement ConfigManager;

	public WebElement ConfigManager() {
		return ConfigManager;
	}
	@FindBy(xpath = "//ion-label[contains(text(),'Warehouse Master')]/parent::ion-item[1]//ion-buttons[1]/ion-button[1]")
	private WebElement Warehouse_Edit_Icon;

	public WebElement Warehouse_Edit_Icon() {
		return Warehouse_Edit_Icon;
	}
	@FindBy(xpath = "//ion-label[contains(text(),'Warehouse Master')]/parent::ion-item[1]//ion-buttons[1]/ion-button[2]")
	private WebElement Warehouse_Eye_Icon;

	public WebElement Warehouse_Eye_Icon() {
		return Warehouse_Eye_Icon;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement Warehouse_Add_Icon;

	public WebElement Warehouse_Add_Icon() {
		return Warehouse_Add_Icon;
	}

	@FindBy(xpath = "//ion-col[1]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Warehouse_Description;

	public WebElement Warehouse_Description() {
		return Warehouse_Description;
	}

	@FindBy(xpath = "//ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Warehouse_Address;

	public WebElement Warehouse_Address() {
		return Warehouse_Address;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Country,  Country *']")
	private WebElement Warehouse_Country;

	public WebElement Warehouse_Country() {
		return Warehouse_Country;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  State *']")
	private WebElement Warehouse_State;

	public WebElement Warehouse_State() {
		return Warehouse_State;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Location *']")
	private WebElement Warehouse_Location;

	public WebElement Warehouse_Location() {
		return Warehouse_Location;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Zip code,  Zip Code *']")
	private WebElement Warehouse_Zipcode;

	public WebElement Warehouse_Zipcode() {
		return Warehouse_Zipcode;
	}

	@FindBy(xpath = "//ion-col[7]//ion-input[1]/input")
	private WebElement Warehouse_Phone1;

	public WebElement Warehouse_Phone1() {
		return Warehouse_Phone1;
	}
	
	@FindBy(xpath = "//ion-label[text()=' Phone 1 ']/following-sibling::ion-input")
	private WebElement Warehouse_Phone1_validation;

	public WebElement Warehouse_Phone1_validation() {
		return Warehouse_Phone1_validation;
	}

	@FindBy(xpath = "//ion-col[8]//ion-input[1]/input")
	private WebElement Warehouse_Fax;

	public WebElement Warehouse_Fax() {
		return Warehouse_Fax;
	}

	@FindBy(xpath = "//ion-col[9]//ion-input[1]/input")
	private WebElement Warehouse_Email;

	public WebElement Warehouse_Email() {
		return Warehouse_Email;
	}

	@FindBy(xpath = "//ion-col[10]//ion-input[1]/input")
	private WebElement Warehouse_ContactPerson;

	public WebElement Warehouse_ContactPerson() {
		return Warehouse_ContactPerson;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement Warehouse_Save;

	public WebElement Warehouse_Save() {
		return Warehouse_Save;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement Warehouse_Back;

	public WebElement Warehouse_Back() {
		return Warehouse_Back;
	}

	@FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement Warehouse_Inbox;

	public WebElement Warehouse_Inbox() {
		return Warehouse_Inbox;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement Warehouse_ReferanceId;

	public WebElement Warehouse_ReferanceId() {
		return Warehouse_ReferanceId;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]")
	private WebElement Warehouse_Action;

	public WebElement Warehouse_Action() {
		return Warehouse_Action;
	}
	@FindBy(xpath = "//button/span[contains(text(),'Submit')]") 
    private WebElement Warehouse_Submit;
    public WebElement Warehouse_Submit() {
        return Warehouse_Submit;
    }
    @FindBy(xpath = "//button/span[contains(text(),'Cancel')]") 
    private WebElement Warehouse_Cancel;
    public WebElement Warehouse_Cancel() {
        return Warehouse_Cancel;
    }  
    @FindBy(xpath = "//button[@ng-reflect-text='View Summary']") 
    private WebElement Warehouse_ViewSummary;
    public WebElement Warehouse_ViewSummary() {
        return Warehouse_ViewSummary;
    }   
    @FindBy(xpath = "//ion-label[contains(text(),'new record')]") 
    private WebElement Warehouse_Submit_confirmation;
    public WebElement Warehouse_Submit_confirmation() {
        return Warehouse_Submit_confirmation;
    }  
    @FindBy(xpath = "//button[@ng-reflect-label='Submit']/span[2]") 
    private WebElement Warehouse_Maker_Submit;
    public WebElement Warehouse_Maker_Submit() {
        return Warehouse_Maker_Submit;
    }
  
    @FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']") 
    private WebElement Warehouse_SaveSuccess_alert;
    public WebElement Warehouse_SaveSuccess_alert() {
        return Warehouse_SaveSuccess_alert;
    }
    
    @FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']") 
    private WebElement Warehouse_Checker_Id;
    public WebElement Warehouse_Checker_Id() {
        return Warehouse_Checker_Id;
    }  
    @FindBy(xpath = "//ion-item[1]/ion-toggle[1]") 
    private WebElement Warehouse_Status;
    public WebElement Warehouse_Status() {
        return Warehouse_Status;
    } 
    
    @FindBy(xpath = "//input[@value='on']//parent::ion-toggle") 
    private WebElement Warehouse_Status_On;
    public WebElement Warehouse_Status_On() {
        return Warehouse_Status_On;
    }
    @FindBy(xpath = "//tr[1]/td[13]//span") 
    private WebElement Warehouse_Status_Off;
    public WebElement Warehouse_Status_Off() {
        return Warehouse_Status_Off;
    }
  
    @FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]") 
    private WebElement Warehouse_Temp_Edit;
    public WebElement Warehouse_Temp_Edit() {
        return Warehouse_Temp_Edit;
    }  
    @FindBy(xpath = "//button[@ng-reflect-text='Update']") 
    private WebElement Warehouse_Update;
    public WebElement Warehouse_Update() {
        return Warehouse_Update;
    }
    
  //------------------CHECKER STAGE PAGEOBJECTS----------------//
    
    @FindBy(xpath = "//ion-icon[@aria-label='menu']") 
    private WebElement Checker_toggle;
    public WebElement Checker_toggle() {
        return Checker_toggle;
    } 
  
    @FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-unread-outline']") 
    private WebElement Checker_Inbox;
    public WebElement Checker_Inbox() {
        return Checker_Inbox;
    }
  
    @FindBy(xpath = "//ion-grid[1]/ion-row[1]/ion-col[2]//span[1]/button[1]") 
    private WebElement Checker_Approve;
    public WebElement Checker_Approve() {
        return Checker_Approve;
    }  
    @FindBy(xpath = "//ion-label[contains(text(),'approve')]") 
    private WebElement Checker_Alert_Approve;
    public WebElement Checker_Alert_Approve() {
        return Checker_Alert_Approve;
    }
  
    @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
    private WebElement Checker_Final_Approve;
    public WebElement Checker_Final_Approve() {
        return Checker_Final_Approve;
    }
    @FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]") 
    private WebElement Checker_Reject;
    public WebElement Checker_Reject() {
        return Checker_Reject;
    }
  
    @FindBy(xpath = "//ion-label[contains(text(),'cancel')]") 
    private WebElement Checker_Alert_Reject;
    public WebElement Checker_Alert_Reject() {
        return Checker_Alert_Reject;
    }
  
    @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
    private WebElement Checker_Final_Reject;
    public WebElement Checker_Final_Reject() {
        return Checker_Final_Reject;
    }
    @FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]") 
    private WebElement Checker_Return;
    public WebElement Checker_Return() {
        return Checker_Return;
    }
  
    @FindBy(xpath = "//ion-label[contains(text(),'return')]") 
    private WebElement Checker_Alert_Return;
    public WebElement Checker_Alert_Return() {
        return Checker_Alert_Return;
    }
 
    @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
    private WebElement Checker_Final_Return;
    public WebElement Checker_Final_Return() {
        return Checker_Final_Return;
    }  
    @FindBy(xpath = "//table[1]/tbody[1]/tr[2]/td[4]/p-celleditor[1]") 
    private WebElement Maker_Listview_Prdcode;
    public WebElement Maker_Listview_Prdcode() {
        return Maker_Listview_Prdcode;
    }
    
    @FindBy(xpath = "//table[1]/tbody[1]/tr[2]/td[6]/p-celleditor[1]") 
    private WebElement Maker_Listview_subPrdcode;
    public WebElement Maker_Listview_subPrdcode() {
        return Maker_Listview_subPrdcode;
    }

  //*******************Anandh code - warehouse***************//
    
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
	public WebElement wareHouse_ListViewDescription()
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
	private WebElement Warehouse_Description1;

	public WebElement Warehouse_Description1() {
		return Warehouse_Description1;
	}

	@FindBy(xpath = "//ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]")
	private WebElement Warehouse_Address1;

	public WebElement Warehouse_Address1() {
		return Warehouse_Address1;
	}
	@FindBy(xpath = "//ion-label[text()=' Phone 1 ']/following-sibling::ion-input")
	private WebElement Warehouse_Phone1_validation1;

	public WebElement Warehouse_Phone1_validation1() {
		return Warehouse_Phone1_validation1;
	}

	@FindBy(xpath = "//ion-col[8]//ion-input[1]")
	private WebElement Warehouse_Fax1;

	public WebElement Warehouse_Fax1() {
		return Warehouse_Fax1;
	}

	@FindBy(xpath = "//ion-col[9]//ion-input[1]")
	private WebElement Warehouse_Email1;

	public WebElement Warehouse_Email1() {
		return Warehouse_Email1;
	}

	@FindBy(xpath = "//ion-col[10]//ion-input[1]")
	private WebElement Warehouse_ContactPerson1;

	public WebElement Warehouse_ContactPerson1() {
		return Warehouse_ContactPerson1;
	}
}
