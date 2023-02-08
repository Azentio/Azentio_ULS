package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncentiveMasterObj {
	WebDriver driver;

	public IncentiveMasterObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Misc_Config
	@FindBy(xpath = "//ion-label[contains(text(),'Misc Config')]")
	private WebElement Misc_Config;

	public WebElement Misc_Config() {
		return Misc_Config;
	}

	// CheckBox_Button
	@FindBy(xpath = "(//ion-list[1]/ion-item[2]/ion-buttons[1]/ion-button[2])[4]")
	private WebElement IncentiveMaster_CheckBox_Button;

	public WebElement IncentiveMaster_CheckBox_Button() {
		return IncentiveMaster_CheckBox_Button;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'Incentive master')]//parent::ion-item/child::ion-buttons/ion-button)[1]")
	private WebElement IncentiveMaster_Eye;

	public WebElement IncentiveMaster_Eye() {
		return IncentiveMaster_Eye;
	}

	// Time_Button
	@FindBy(xpath = "(//ion-list[1]/ion-item[2]/ion-buttons[1]/ion-button[1])[4]")
	private WebElement IncentiveMaster_Time_Button;

	public WebElement IncentiveMaster_Time_Button() {
		return IncentiveMaster_Time_Button;
	}

	// IncentiveMaster_Add_Button
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement IncentiveMaster_Add_Button;

	public WebElement IncentiveMaster_Add_Button() {
		return IncentiveMaster_Add_Button;
	}
	
	@FindBy(xpath = "//ion-menu[1]/ion-card-content[1]/ion-col[1]/div[1]/ion-button[1]")
	private WebElement Menu_Tab;

	public WebElement Menu_Tab() {
		return Menu_Tab;
	}
	// IncentiveMaster_Code
	@FindBy(xpath = "//ion-row[1]/ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement IncentiveMaster_Code;

	public WebElement IncentiveMaster_Code() {
		return IncentiveMaster_Code;
	}

	// IncentiveMaster_Description
	@FindBy(xpath = "//ion-row[1]/ion-col[3]/digital-text-box[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement IncentiveMaster_Description;

	public WebElement IncentiveMaster_Description() {
		return IncentiveMaster_Description;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'  Incentive Mode ')]//following-sibling::ion-select")
	private WebElement Incentive_Mode;
	public WebElement Incentive_Mode()
	{
		return Incentive_Mode;
	}

	// IncentiveMaster_Description2
	@FindBy(xpath = "//ion-row[1]/ion-col[4]/digital-text-box[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement IncentiveMaster_Description2;

	public WebElement IncentiveMaster_Description2() {
		return IncentiveMaster_Description2;
	}

	// IncentiveMaster_Description3
	@FindBy(xpath = "//ion-row[1]/ion-col[5]/digital-text-box[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement IncentiveMaster_Description3;

	public WebElement IncentiveMaster_Description3() {
		return IncentiveMaster_Description3;
	}

	// Incentive Mode
	@FindBy(xpath = "//ion-select[@aria-label='Select,   Incentive Mode *']")
	private WebElement IncentiveMaster_IncentiveMode;

	public WebElement IncentiveMaster_IncentiveMode() {
		return IncentiveMaster_IncentiveMode;
	}

	// Incentive Mode select the option - B
	@FindBy(xpath = "//ion-label[contains(text(),'B')]/../ion-radio")
	private WebElement IncentiveMaster_IncentiveMode_DropDown;

	public WebElement IncentiveMaster_IncentiveMode_DropDown() {
		return IncentiveMaster_IncentiveMode_DropDown;
	}

	// IncentiveMaster_IncentiveType
	@FindBy(xpath = "//ion-select[@aria-label='Select,   Incentive Type *']")
	private WebElement IncentiveMaster_IncentiveType;

	public WebElement IncentiveMaster_IncentiveType() {
		return IncentiveMaster_IncentiveType;
	}

	// IncentiveMaster_IncentiveType -SIMPLE
	@FindBy(xpath = "//ion-label[contains(text(),'SIMPLE')]/../ion-radio")
	private WebElement IncentiveMaster_IncentiveType_DropDown;

	public WebElement IncentiveMaster_IncentiveType_DropDown() {
		return IncentiveMaster_IncentiveType_DropDown;
	}

	// IncentiveMaster_FlatAmount
	@FindBy(xpath = "//ion-col[8]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement IncentiveMaster_FlatAmount;

	public WebElement IncentiveMaster_FlatAmount() {
		return IncentiveMaster_FlatAmount;
	}

	// IncentiveMaster_IncentivePercentage
	@FindBy(xpath = "//ion-col[9]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement IncentiveMaster_IncentivePercentage;

	public WebElement IncentiveMaster_IncentivePercentage() {
		return IncentiveMaster_IncentivePercentage;
	}

	// IncentiveMaster_ComputationOn
	@FindBy(xpath = "//ion-select[@aria-label='Select,   Incentive Computation On *']")
	private WebElement IncentiveMaster_ComputationOn;

	public WebElement IncentiveMaster_ComputationOn() {
		return IncentiveMaster_ComputationOn;
	}

	// IncentiveMaster_ComputationOn
	@FindBy(xpath = "//ion-label[contains(text(),'AC')]/../ion-radio")
	private WebElement IncentiveMaster_ComputationOn_DropDown;

	public WebElement IncentiveMaster_ComputationOn_DropDown() {
		return IncentiveMaster_ComputationOn_DropDown;
	}

	// IncentiveMaster_SaveButton
	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement IncentiveMaster_SaveButton;

	public WebElement IncentiveMaster_SaveButton() {
		return IncentiveMaster_SaveButton;
	}
	
	// SearchRecord from inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement IncentiveMaster_Inbox_SearchIcon;

	public WebElement IncentiveMaster_Inbox_SearchIcon() {
		return IncentiveMaster_Inbox_SearchIcon;
	}

	// SearchInputField
	@FindBy(xpath = "//div/span/input")
	private WebElement IncentiveMaster_SearchInputField;

	public WebElement IncentiveMaster_SearchInputField() {
		return IncentiveMaster_SearchInputField;
	}

	// SearchInputFieldClose
	@FindBy(xpath = "//div/span/i")
	private WebElement IncentiveMaster_SearchInputFieldClose;

	public WebElement IncentiveMaster_SearchInputFieldClose() {
		return IncentiveMaster_SearchInputFieldClose;
	}

	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement IncentiveMaster_NoDataFoundInSearch;

	public WebElement IncentiveMaster_NoDataFoundInSearch() {
		return IncentiveMaster_NoDataFoundInSearch;
	}
	
	// ValidationRequiredField
	@FindBy(xpath = "//ion-badge[contains(text(),'Required field')]")
	private WebElement Validation_RequiredField;

	public WebElement Validation_RequiredField() {
		return Validation_RequiredField;
	}

	// ValidationAlphanumeric
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement Validation_Alphanumeric;

	public WebElement Validation_Alphanumeric() {
		return Validation_Alphanumeric;
	}

	// Search Icon
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement ListView_SearchIcon;

	public WebElement ListView_SearchIcon() {
		return ListView_SearchIcon;
	}

	// Export
	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement ListView_Export;

	public WebElement ListView_Export() {
		return ListView_Export;
	}

	// PDF
	@FindBy(xpath = " //li[@aria-label='PDF']")
	private WebElement ListView_PdfFile;

	public WebElement ListView_PdfFile() {
		return ListView_PdfFile;
	}

	// XLS
	@FindBy(xpath = " //li[@aria-label='XLS']")
	private WebElement ListView_XlsFile;

	public WebElement ListView_XlsFile() {
		return ListView_XlsFile;
	}
	
	// ListView IncentiveMaster_Description
	@FindBy(xpath = "//span[contains(text(),' Description ')]")
	private WebElement IncentiveMaster_ListView_Description;

	public WebElement IncentiveMaster_ListView_Description() {
		return IncentiveMaster_ListView_Description;
	}

	//ListView Incentive Mode
	@FindBy(xpath = "//span[contains(text(),' Incentive Mode ')]")
	private WebElement IncentiveMaster_ListView_IncentiveMode;

	public WebElement IncentiveMaster_ListView_IncentiveMode() {
		return IncentiveMaster_ListView_IncentiveMode;
	}

	// ListView IncentiveMaster_IncentiveType
	@FindBy(xpath = "//span[contains(text(),' Incentive Type ')]")
	private WebElement IncentiveMaster_ListView_IncentiveType;

	public WebElement IncentiveMaster_ListView_IncentiveType() {
		return IncentiveMaster_ListView_IncentiveType;
	}
	
	//ListView IncentiveMaster_Status
	@FindBy(xpath = "//thead/tr[1]/th[6]/span[1]")
	private WebElement IncentiveMaster_ListView_Status;

	public WebElement IncentiveMaster_ListView_Status() {
		return IncentiveMaster_ListView_Status;
	}
	
	// list view Value of Description;
	@FindBy(xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]/span[1]")
	private WebElement IncentiveMaster_ListViewValue_Description;

	public WebElement IncentiveMaster_ListViewValue_Description() {
		return IncentiveMaster_ListViewValue_Description;
	}

	// list view Value of IncentiveMode
	@FindBy(xpath = "//tbody/tr[1]/td[4]/p-celleditor[1]/span[1]")
	private WebElement IncentiveMaster_ListViewValue_IncentiveMode;

	public WebElement IncentiveMaster_ListViewValue_IncentiveMode() {
		return IncentiveMaster_ListViewValue_IncentiveMode;
	}

	// list view Value of IncentiveType
	@FindBy(xpath = "//tbody/tr[1]/td[5]/p-celleditor[1]/span[1]")
	private WebElement IncentiveMaster_ListViewValue_IncentiveType;

	public WebElement IncentiveMaster_ListViewValue_IncentiveType() {
		return IncentiveMaster_ListViewValue_IncentiveType;
	}

	// IncentiveMaster Back Button
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']/span[1]")
	private WebElement IncentiveMaster_BackButton;

	public WebElement IncentiveMaster_BackButton() {
		return IncentiveMaster_BackButton;
	}
	
	// ActionEdit
	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement IncentiveMaster_ActionEdit;

	public WebElement IncentiveMaster_ActionEdit() {
		return IncentiveMaster_ActionEdit;
	}

}
