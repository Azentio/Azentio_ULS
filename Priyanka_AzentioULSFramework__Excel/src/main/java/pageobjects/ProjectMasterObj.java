package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectMasterObj {
	WebDriver driver;

	public ProjectMasterObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// ------------------------MAKER STAGE PAGEOBJECTS----------------------//

	@FindBy(xpath = "//ion-card-content[1]/ion-item[1]//ion-icon[1]")
	private WebElement config_Manager;

	public WebElement config_Manager() {
		return config_Manager;
	}

	// project_Setup
	@FindBy(xpath = "//h4[contains(text(),'Project Setup')]")
	private WebElement project_Setup;

	public WebElement project_Setup() {
		return project_Setup;
	}

	// projectMaster EditIcon
	@FindBy(xpath = "//ion-card-content[9]/ion-card-content[1]/ion-item[1]/ion-buttons[1]/ion-button[1]")
	private WebElement projectMaster_EditIcon;

	public WebElement projectMaster_EditIcon() {
		return projectMaster_EditIcon;
	}

	// ActionEdit
	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement projectMaster_ActionEdit;

	public WebElement projectMaster_ActionEdit() {
		return projectMaster_ActionEdit;
	}

	// projectMaster EyeIcon

	@FindBy(xpath = "//ion-item[1]/ion-buttons[1]/ion-button[2]")
	private WebElement projectMaster_EyeIcon;

	public WebElement projectMaster_EyeIcon() {
		return projectMaster_EyeIcon;
	}

	// project Master Add Button
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement projectMaster_AddButton;

	public WebElement projectMaster_AddButton() {
		return projectMaster_AddButton;
	}

	// project Master Save Button
	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement projectMaster_SaveButton;

	public WebElement projectMaster_SaveButton() {
		return projectMaster_SaveButton;
	}

	// project Master Back Button
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']/span[1]")
	private WebElement projectMaster_BackButton;

	public WebElement projectMaster_BackButton() {
		return projectMaster_BackButton;
	}
	//--------------LIST VIEW--------------//
	@FindBy(xpath = "//div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement projectMaster_Search;

	public WebElement projectMaster_Search() {
		return projectMaster_Search;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement projectMaster_SearchInputField;

	public WebElement projectMaster_SearchInputField() {
		return projectMaster_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement projectMaster_SearchCloseButton;

	public WebElement projectMaster_SearchCloseButton() {
		return projectMaster_SearchCloseButton;
	}

	// list view first field of particular Project Name Azentio New
	@FindBy(xpath = "//span[contains(text(),'Azentio New')]")
	private WebElement projectMaster_ListViewFirstFieldOf_ProjectName;

	public WebElement projectMaster_ListViewFirstFieldOf_ProjectName() {
		return projectMaster_ListViewFirstFieldOf_ProjectName;
	}

	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement projectMaster_NoDataFoundInSearch;

	public WebElement projectMaster_NoDataFoundInSearch() {
		return projectMaster_NoDataFoundInSearch;
	}

	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement projectMaster_Export;

	public WebElement projectMaster_Export() {
		return projectMaster_Export;
	}

	@FindBy(xpath = " //li[@aria-label='PDF']") // PDF
	private WebElement projectMaster_PdfFile;

	public WebElement projectMaster_PdfFile() {
		return projectMaster_PdfFile;
	}

	@FindBy(xpath = " //li[@aria-label='XLS']") // XLS
	private WebElement projectMaster_XlsFile;

	public WebElement projectMaster_XlsFile() {
		return projectMaster_XlsFile;
	}

	
	// List view Project Code
	@FindBy(xpath = "//span[contains(text(),'Project Code')]")
	private WebElement projectMaster_ListView_ProjectCode;

	public WebElement projectMaster_ListView_ProjectCode() {
		return projectMaster_ListView_ProjectCode;
	}

	// List view Project Name
	@FindBy(xpath = "//span[contains(text(),'Project Name')]")
	private WebElement projectMaster_ListView_ProjectName;

	public WebElement projectMaster_ListView_ProjectName() {
		return projectMaster_ListView_ProjectName;
	}

	// List view Builder
	@FindBy(xpath = "//span[contains(text(),'Builder')]")
	private WebElement projectMaster_ListView_Builder;

	public WebElement projectMaster_ListView_Builder() {
		return projectMaster_ListView_Builder;
	}

	// List view Group
	@FindBy(xpath = "//span[contains(text(),'Group')]")
	private WebElement projectMaster_ListView_Group;

	public WebElement projectMaster_ListView_Group() {
		return projectMaster_ListView_Group;
	}

	// List view City
	@FindBy(xpath = "//span[contains(text(),'City')]")
	private WebElement projectMaster_ListView_City;

	public WebElement projectMaster_ListView_City() {
		return projectMaster_ListView_City;
	}

	// List view State
	@FindBy(xpath = "//span[contains(text(),'State')]")
	private WebElement projectMaster_ListView_State;

	public WebElement projectMaster_ListView_State() {
		return projectMaster_ListView_State;
	}

	// List view Maker Date
	@FindBy(xpath = "//span[contains(text(),'Maker Date')]")
	private WebElement projectMaster_ListView_MakerDate;

	public WebElement projectMaster_ListView_MakerDate() {
		return projectMaster_ListView_MakerDate;
	}

	// List view Checker Date
	@FindBy(xpath = "//span[contains(text(),'Checker Date')]")
	private WebElement projectMaster_ListView_CheckerDate;

	public WebElement projectMaster_ListView_CheckerDate() {
		return projectMaster_ListView_CheckerDate;
	}

	// List view status
	@FindBy(xpath = "//span[contains(text(),'Status')]")
	private WebElement projectMaster_ListView_Status;

	public WebElement projectMaster_ListView_Status() {
		return projectMaster_ListView_Status;
	}
	//---------------------------------------------------//
	@FindBy(xpath = "//button[@ng-reflect-text='View Summary']")
	private WebElement projectMaster_ViewSummary;

	public WebElement projectMaster_ViewSummary() {
		return projectMaster_ViewSummary;
	}
	//------------------------------------------------------//

	// project Master Building Add Button
	@FindBy(xpath = "(//button[@ng-reflect-text='Add'])[2]")
	private WebElement projectMaster_BuildingAddButton;

	public WebElement projectMaster_BuildingAddButton() {
		return projectMaster_BuildingAddButton;
	}

	// Unit Type
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Unit Type ']")
	private WebElement projectMaster_UnitType;

	public WebElement projectMaster_UnitType() {
		return projectMaster_UnitType;
	}
	// APARTMENT option from ProductGroup drop down

	@FindBy(xpath = "(//ion-label[contains(text(),'APARTMENT')]/../ion-radio)[1]")
	private WebElement projectMaster_UnitType_Dropdown;

	public WebElement projectMaster_UnitType_Dropdown() {
		return projectMaster_UnitType_Dropdown;
	}

	// Building Name
	@FindBy(xpath = "//ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_BuildingName;

	public WebElement projectMaster_BuildingName() {
		return projectMaster_BuildingName;
	}

	// Building Type
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Building Type ']")
	private WebElement projectMaster_BuildingType;

	public WebElement projectMaster_BuildingType() {
		return projectMaster_BuildingType;
	}

	// RESIDENTIAL option from BuildingType drop down
	@FindBy(xpath = "//ion-label[contains(text(),'RESIDENTIAL')]/../ion-radio")
	private WebElement projectMaster_BuildingType_Dropdown;

	public WebElement projectMaster_BuildingType_Dropdown() {
		return projectMaster_BuildingType_Dropdown;
	}

	// Total Floors
	@FindBy(xpath = "//ion-col[4]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_TotalFloors;

	public WebElement projectMaster_TotalFloors() {
		return projectMaster_TotalFloors;
	}

	// Total Flats
	@FindBy(xpath = "(//ion-col[5]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1])[2]")
	private WebElement projectMaster_TotalFlats;

	public WebElement projectMaster_TotalFlats() {
		return projectMaster_TotalFlats;
	}

	// Tentative Start Dates
	@FindBy(xpath = "//ion-col[6]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_TentativeStartDates;

	public WebElement projectMaster_TentativeStartDates() {
		return projectMaster_TentativeStartDates;
	}

	// Tentative End Dates
	@FindBy(xpath = "//ion-col[7]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_TentativeEndDates;

	public WebElement projectMaster_TentativeEndDates() {
		return projectMaster_TentativeEndDates;
	}

	// DisbursmentAmount
	@FindBy(xpath = "(//ion-col[8]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1])[2]")
	private WebElement projectMaster_DisbursmentAmount;

	public WebElement projectMaster_DisbursmentAmount() {
		return projectMaster_DisbursmentAmount;
	}

	// ExposedNoOfFlats
	@FindBy(xpath = "//ion-col[9]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_ExposedNoOfFlats;

	public WebElement projectMaster_ExposedNoOfFlats() {
		return projectMaster_ExposedNoOfFlats;
	}

	// Verified By
	@FindBy(xpath = "//ion-col[10]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_VerifiedBy;

	public WebElement projectMaster_VerifiedBy() {
		return projectMaster_VerifiedBy;
	}

	// Stage of Completion
	@FindBy(xpath = "//ion-col[11]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_StageOfCompletion;

	public WebElement projectMaster_StageOfCompletion() {
		return projectMaster_StageOfCompletion;
	}

	// Verified On
	@FindBy(xpath = "(//ion-col[12]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1])[2]")
	private WebElement projectMaster_VerifiedOn;

	public WebElement projectMaster_VerifiedOn() {
		return projectMaster_VerifiedOn;
	}

	// CLP
	@FindBy(xpath = "(//ion-select[@aria-label='Select,  CLP '])[2]")
	private WebElement projectMaster_CLP;

	public WebElement projectMaster_CLP() {
		return projectMaster_CLP;
	}

	// Yes from CLP DropDown
	@FindBy(xpath = "//ion-label[contains(text(),'Yes')]/../ion-radio/../ion-radio")
	private WebElement projectMaster_CLPDropDown;

	public WebElement projectMaster_CLPDropDown() {
		return projectMaster_CLPDropDown;
	}

	// Flexi
	@FindBy(xpath = "(//ion-select[@aria-label='Select,  Flexi '])[2]")
	private WebElement projectMaster_Flexi;

	public WebElement projectMaster_Flexi() {
		return projectMaster_Flexi;
	}

	// Yes from Flexi DropDown
	@FindBy(xpath = "//ion-label[contains(text(),'Yes')]/../ion-radio")
	private WebElement projectMaster_FlexiDropDown;

	public WebElement projectMaster_FlexiDropDown() {
		return projectMaster_FlexiDropDown;
	}

	// Installment Linked
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Installment Linked ']")
	private WebElement projectMaster_InstallmentLinked;

	public WebElement projectMaster_InstallmentLinked() {
		return projectMaster_InstallmentLinked;
	}

	// Yes from Installment Linked DropDown
	@FindBy(xpath = "//ion-label[contains(text(),'Yes')]/../ion-radio")
	private WebElement projectMaster_InstallmentLinkedDropDown;

	public WebElement projectMaster_InstallmentLinkedDropDown() {
		return projectMaster_InstallmentLinkedDropDown;
	}

	// Down Payment Flag
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Down Payment Flag ']")
	private WebElement projectMaster_DownPaymentFlag;

	public WebElement projectMaster_DownPaymentFlag() {
		return projectMaster_DownPaymentFlag;
	}

	// Yes from Down Payment Flag DropDown
	@FindBy(xpath = "//ion-label[contains(text(),'Yes')]/../ion-radio")
	private WebElement projectMaster_DownPaymentFlagDropDown;

	public WebElement projectMaster_DownPaymentFlagDropDown() {
		return projectMaster_DownPaymentFlagDropDown;
	}

	// Subvention Flag
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Subvention Flag ']")
	private WebElement projectMaster_SubventionFlag;

	public WebElement projectMaster_SubventionFlag() {
		return projectMaster_SubventionFlag;
	}

	// Yes from Subvention Flag DropDown
	@FindBy(xpath = "//ion-label[contains(text(),'Yes')]/../ion-radio")
	private WebElement projectMaster_SubventionFlagDropDown;

	public WebElement projectMaster_SubventionFlagDropDown() {
		return projectMaster_SubventionFlagDropDown;
	}

	// CF Flag
	@FindBy(xpath = "//ion-select[@aria-label='Select,  CF Flag ']")
	private WebElement projectMaster_CfFlag;

	public WebElement projectMaster_CfFlag() {
		return projectMaster_CfFlag;
	}

	// Yes from CF Flag DropDown
	@FindBy(xpath = "//ion-label[contains(text(),'Yes')]/../ion-radio")
	private WebElement projectMaster_CfFlagDropDown;

	public WebElement projectMaster_CfFlagDropDown() {
		return projectMaster_CfFlagDropDown;
	}

	// Negative Remarks
	@FindBy(xpath = "(//ion-col[19]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1])[2]")
	private WebElement projectMaster_NegativeRemarks;

	public WebElement projectMaster_NegativeRemarks() {
		return projectMaster_NegativeRemarks;
	}

	// Basic Sales Price
	@FindBy(xpath = "(//ion-col[20]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1])[2]")
	private WebElement projectMaster_BasicSalesPrice;

	public WebElement projectMaster_BasicSalesPrice() {
		return projectMaster_BasicSalesPrice;
	}

	// Exposure Unit
	@FindBy(xpath = "//ion-col[21]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_ExposureUnit;

	public WebElement projectMaster_ExposureUnit() {
		return projectMaster_ExposureUnit;
	}

	// Overall % Recommendations
	@FindBy(xpath = "//ion-col[22]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_OverallRecommendations;

	public WebElement projectMaster_OverallRecommendations() {
		return projectMaster_OverallRecommendations;
	}

	// Construction Status
	@FindBy(xpath = "//ion-col[23]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_ConstructionStatus;

	public WebElement projectMaster_ConstructionStatus() {
		return projectMaster_ConstructionStatus;
	}

	// RERA Registration //ion-select[@aria-label=' Select ,  RERA Registration ']
	@FindBy(xpath = "//ion-col[24]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement projectMaster_RERA_Registration;

	public WebElement projectMaster_RERA_Registration() {
		return projectMaster_RERA_Registration;
	}

	// Yes from RERA Registration DropDown
	@FindBy(xpath = "//ion-label[contains(text(),'Yes')]/../ion-radio")
	private WebElement projectMaster_RERA_RegistrationDropDown;

	public WebElement projectMaster_RERA_RegistrationDropDown() {
		return projectMaster_RERA_RegistrationDropDown;
	}

	// RERA Registration No
	@FindBy(xpath = "(//ion-col[25]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1])[2]")
	private WebElement projectMaster_RERA_Registration_Number;

	public WebElement projectMaster_RERA_Registration_Number() {
		return projectMaster_RERA_Registration_Number;
	}

	// Remarks
	@FindBy(xpath = "//ion-textarea[1]//textarea[1]")
	private WebElement projectMaster_Remarks;

	public WebElement projectMaster_Remarks() {
		return projectMaster_Remarks;
	}
}
