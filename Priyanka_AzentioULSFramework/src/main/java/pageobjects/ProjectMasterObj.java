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
    
    //project_Setup
    @FindBy(xpath = "//h4[contains(text(),'Project Setup')]")
    private WebElement project_Setup;
    public WebElement project_Setup() {
    	return project_Setup;
    }
    
    // projectMaster EyeIcon

	@FindBy(xpath = "//ion-item[1]/ion-buttons[1]/ion-button[2]") 
	private WebElement projectMaster_EyeIcon;
	public WebElement projectMaster_EyeIcon() {
		return projectMaster_EyeIcon;
	}
	
	//project Master Add Button
	@FindBy(xpath = "//button[@ng-reflect-text='Add']") 
	private WebElement projectMaster_AddButton;
	public WebElement projectMaster_AddButton() {
		return projectMaster_AddButton;
	}
			
	//project Master Building Add Button
	@FindBy(xpath = "(//button[@ng-reflect-text='Add'])[2]") 
	private WebElement projectMaster_BuildingAddButton;
	public WebElement projectMaster_BuildingAddButton() {
		return projectMaster_BuildingAddButton;
	}
	
	//Unit Type
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Unit Type ']") 
	private WebElement projectMaster_UnitType;
	public WebElement projectMaster_UnitType() {
		return projectMaster_UnitType;
	}
	//APARTMENT option from ProductGroup drop down
	
	@FindBy(xpath = "(//ion-label[contains(text(),'APARTMENT')]/../ion-radio)[1]")
	private WebElement projectMaster_UnitType_Dropdown;
	public WebElement projectMaster_UnitType_Dropdown() {
		return projectMaster_UnitType_Dropdown;
	}
	
	//Building Name
	@FindBy(xpath = "//ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_BuildingName;
	public WebElement projectMaster_BuildingName() {
		return projectMaster_BuildingName;
	}
	
	//Building Type
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Building Type ']")
	private WebElement projectMaster_BuildingType;

	public WebElement projectMaster_BuildingType() {
		return projectMaster_BuildingType;
	}
	
	//RESIDENTIAL option from BuildingType drop down
	@FindBy(xpath = "//ion-label[contains(text(),'RESIDENTIAL')]/../ion-radio")
	private WebElement projectMaster_BuildingType_Dropdown;

	public WebElement projectMaster_BuildingType_Dropdown() {
		return projectMaster_BuildingType_Dropdown;
	}
	
	//Total Floors
	@FindBy(xpath = "//ion-col[4]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement projectMaster_TotalFloors;

	public WebElement projectMaster_TotalFloors() {
		return projectMaster_TotalFloors;
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
	
	//DisbursmentAmount
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
	
	//Stage of Completion
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
	
	//CLP
	@FindBy(xpath = "(//ion-select[@aria-label='Select,  CLP '])[2]")
	private WebElement projectMaster_CLP;

	public WebElement projectMaster_CLP() {
		return projectMaster_CLP;
	}
	//Flexi
	@FindBy(xpath = "(//ion-select[@aria-label='Select,  Flexi '])[2]")
	private WebElement projectMaster_Flexi;

	public WebElement projectMaster_Flexi() {
		return projectMaster_Flexi;
	}

	// Installment Linked
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Installment Linked ']")
	private WebElement projectMaster_InstallmentLinked;

	public WebElement projectMaster_InstallmentLinked() {
		return projectMaster_InstallmentLinked;
	}
	

	//Down Payment Flag
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Down Payment Flag ']")
	private WebElement projectMaster_DownPaymentFlag;

	public WebElement projectMaster_DownPaymentFlag() {
		return projectMaster_DownPaymentFlag;
	}
	
	// Subvention Flag
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Subvention Flag ']")
	private WebElement projectMaster_SubventionFlag;

	public WebElement projectMaster_SubventionFlag() {
		return projectMaster_SubventionFlag;
	}
	
	//CF Flag
	@FindBy(xpath = "//ion-select[@aria-label='Select,  CF Flag ']")
	private WebElement projectMaster_CfFlag;

	public WebElement projectMaster_CfFlag() {
		return projectMaster_CfFlag;
	}
	
	// Negative Remarks
	@FindBy(xpath = "(//ion-col[19]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1])[2]")
	private WebElement projectMaster_NegativeRemarks;

	public WebElement projectMaster_NegativeRemarks() {
		return projectMaster_NegativeRemarks;
	}
	
	//Basic Sales Price
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

	//Overall % Recommendations
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
	
	// RERA Registration
	@FindBy(xpath = "//ion-select[@aria-label=' Select ,  RERA Registration ']")
	private WebElement projectMaster_RERA_Registration;

	public WebElement projectMaster_RERA_Registration() {
		return projectMaster_RERA_Registration;
	}
	
	// RERA Registration No
	@FindBy(xpath = "//ion-col[24]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
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
