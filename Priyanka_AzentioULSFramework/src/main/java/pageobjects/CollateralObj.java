package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollateralObj {

	WebDriver driver;

	public CollateralObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-card-content[1]/ion-item[1]//ion-icon[1]")
	private WebElement config_Manager;

	public WebElement config_Manager() {
		return config_Manager;
	}

	// AssetCollateral_Config
	@FindBy(xpath = "//ion-label[contains(text(),'Asset Collateral Config')]")
	private WebElement AssetCollateral_Config;

	public WebElement AssetCollateral_Config() {
		return AssetCollateral_Config;
	}
	// collateral EditIcon
	@FindBy(xpath = "(//ion-list[1]/ion-item[1]/ion-buttons[1]/ion-button[1])[1]")
	private WebElement collateral_EditIcon;

	public WebElement collateral_EditIcon() {
		return collateral_EditIcon;
	}


	// collateral EyeIcon

	@FindBy(xpath = "(//ion-list[1]/ion-item[1]/ion-buttons[1]/ion-button[2])[1]")
	private WebElement collateral_EyeIcon;

	public WebElement collateral_EyeIcon() {
		return collateral_EyeIcon;
	}

	// collateral Add Button 
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement collateral_AddButton;

	public WebElement collateral_AddButton() {
		return collateral_AddButton;
	}
	//collateral_Arabic_AddButton
	@FindBy(xpath = "//button[@ng-reflect-text='يضيف']")
	private WebElement collateral_Arabic_AddButton;

	public WebElement collateral_Arabic_AddButton() {
		return collateral_Arabic_AddButton;
	}
	// collateral Save Button
	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement collateral_SaveButton;

	public WebElement collateral_SaveButton() {
		return collateral_SaveButton;
	}

	// collateral Back Button
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']/span[1]")
	private WebElement collateral_BackButton;

	public WebElement collateral_BackButton() {
		return collateral_BackButton;
	}

	// collateral_Description
	@FindBy(xpath = "//digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement collateral_Description;

	public WebElement collateral_Description() {
		return collateral_Description;
	}

	// collateral Assetcollateral_CategoryCode
	@FindBy(xpath = "//kub-uq-code[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement collateral_Assetcollateral_CategoryCode;

	public WebElement collateral_Assetcollateral_CategoryCode() {
		return collateral_Assetcollateral_CategoryCode;
	}

	// collateral Module
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Module *']")
	private WebElement collateral_Module;

	public WebElement collateral_Module() {
		return collateral_Module;
	}
	
	// Lo from  Module dropdown
	@FindBy(xpath = "(//ion-label[contains(text(),'LO')]/../ion-radio)[2]")
	private WebElement collateral_ModuleDropdown;

	public WebElement collateral_ModuleDropdown() {
		return collateral_ModuleDropdown;
	}

	// Lo from Module dropdown
	@FindBy(xpath = "//ion-select[@aria-label=' LO ,  Module *']")
	private WebElement collateral_ModuleDropdown_Reselect;

	public WebElement collateral_ModuleDropdown_Reselect() {
		return collateral_ModuleDropdown_Reselect;
	}
	// LM from Module dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'LM')]/../ion-radio")
	private WebElement collateral_ModuleDropdown_LM;

	public WebElement collateral_ModuleDropdown_LM() {
		return collateral_ModuleDropdown_LM;
	}
	// collateral Registration Required Toggle
	@FindBy(xpath = "//ion-row[1]/ion-col[5]/digital-radio-button[1]/ion-item[1]/ion-toggle[1]")
	private WebElement collateral_RegistrationRequiredToggle;

	public WebElement collateral_RegistrationRequiredToggle() {
		return collateral_RegistrationRequiredToggle;
	}

	// collateral Reposession Toggle
	@FindBy(xpath = "//ion-row[1]/ion-col[6]/digital-radio-button[1]/ion-item[1]/ion-toggle[1]")
	private WebElement collateral_ReposessionToggle;

	public WebElement collateral_ReposessionToggle() {
		return collateral_ReposessionToggle;
	}

	// collateral Remarks
	@FindBy(xpath = "//digital-text-box[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement collateral_Remarks;

	public WebElement collateral_Remarks() {
		return collateral_Remarks;
	}

	// ValidationRequiredField
	@FindBy(xpath = "//ion-badge[contains(text(),'Required field')]")
	private WebElement collateral_ValidationRequiredField;

	public WebElement collateral_ValidationRequiredField() {
		return collateral_ValidationRequiredField;
	}

	// ValidationAlphanumeric
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement collateral_ValidationAlphanumeric;

	public WebElement collateral_ValidationAlphanumeric() {
		return collateral_ValidationAlphanumeric;
	}
	

	//Search Icon
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement collateral_SearchIcon;

	public WebElement collateral_SearchIcon() {
		return collateral_SearchIcon;
	}
	// search input field
		@FindBy(xpath = "//div/span/input")
		private WebElement collateral_SearchInputField;

		public WebElement collateral_SearchInputField() {
			return collateral_SearchInputField;
		}

		// search close button
		@FindBy(xpath = "//div/span/i")
		private WebElement collateral_SearchCloseButton;

		public WebElement collateral_SearchCloseButton() {
			return collateral_SearchCloseButton;
		}
	
	//Export
	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement collateral_Export;

	public WebElement collateral_Export() {
		return collateral_Export;
	}
	// PDF
	@FindBy(xpath = " //li[@aria-label='PDF']") 
	private WebElement collateral_PdfFile;

	public WebElement collateral_PdfFile() {
		return collateral_PdfFile;
	}
	// XLS
	@FindBy(xpath = " //li[@aria-label='XLS']") 
	private WebElement collateral_XlsFile;

	public WebElement collateral_XlsFile() {
		return collateral_XlsFile;
	}

	// List view Asset/Collateral Category Code
	@FindBy(xpath = "//span[contains(text(),'Asset/Collateral Category Code')]") 
	private WebElement collateral_ListView_AssetCollateralCategoryCode;

	public WebElement collateral_ListView_AssetCollateralCategoryCode() {
		return collateral_ListView_AssetCollateralCategoryCode;
	}

	// List view AssetCollateral Category Description
	@FindBy(xpath = "//span[contains(text(),'AssetCollateral Category Description')]")
	private WebElement collateral_ListView_AssetCollateralCategoryDescription;

	public WebElement collateral_ListView_AssetCollateralCategoryDescription() {
		return collateral_ListView_AssetCollateralCategoryDescription;
	}

	// List view Created By
	@FindBy(xpath = "//span[contains(text(),'Created By')]")
	private WebElement collateral_ListView_CreatedBy;

	public WebElement collateral_ListView_CreatedBy() {
		return collateral_ListView_CreatedBy;
	}

	// List view Status
	@FindBy(xpath = "//thead/tr[1]/th[9]/span[1]")
	private WebElement collateral_ListView_Status;

	public WebElement collateral_ListView_Status() {
		return collateral_ListView_Status;
	}

	// list view first field of Asset/Collateral Category Code
	@FindBy(xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]/span[1]")
	private WebElement collateral_ListViewFirstField_AssetCollateralCategoryCode;

	public WebElement collateral_ListViewFirstField_AssetCollateralCategoryCode() {
		return collateral_ListViewFirstField_AssetCollateralCategoryCode;
	}

	// list view first field of AssetCollateral Category Description
	@FindBy(xpath = "//tbody/tr[1]/td[4]/p-celleditor[1]/span[1]")
	private WebElement collateral_ListViewFirstField_AssetCollateralCategoryDescription;

	public WebElement collateral_ListViewFirstField_AssetCollateralCategoryDescription() {
		return collateral_ListViewFirstField_AssetCollateralCategoryDescription;
	}

	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement collateral_NoDataFoundInSearch;

	public WebElement collateral_NoDataFoundInSearch() {
		return collateral_NoDataFoundInSearch;
	}
	
	// ActionEdit
	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement collateral_ActionEdit;

	public WebElement collateral_ActionEdit() {
		return collateral_ActionEdit;
	}


	@FindBy(xpath = "(//ion-item[1]/ion-toggle[1])[3]")
	private WebElement collateral_Status;

	public WebElement collateral_Status() {
		return collateral_Status;
	}
	// ViewSummary
	@FindBy(xpath = "//button[@ng-reflect-text='View Summary']")
	private WebElement collateral_ViewSummary;

	public WebElement collateral_ViewSummary() {
		return collateral_ViewSummary;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'User')]")
	private WebElement collateral_ViewSummaryUser;

	public WebElement collateral_ViewSummaryUser() {
		return collateral_ViewSummaryUser;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'Stage Code')]")
	private WebElement collateral_ViewSummaryStageCode;

	public WebElement collateral_ViewSummaryStageCode() {
		return collateral_ViewSummaryStageCode;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'Status')]")
	private WebElement collateral_ViewSummaryStatus;

	public WebElement collateral_ViewSummaryStatus() {
		return collateral_ViewSummaryStatus;
	}
	
	// collateral_ViewSummaryStatus_Pending
		@FindBy(xpath = "//td[contains(text(),'PENDING')]")
		private WebElement collateral_ViewSummaryStatus_Pending;

		public WebElement collateral_ViewSummaryStatus_Pending() {
			return collateral_ViewSummaryStatus_Pending;
		}

		// collateral_ViewSummaryStatus_Completed
		@FindBy(xpath = "//td[contains(text(),'COMPLETED')]")
		private WebElement collateral_ViewSummaryStatus_Completed;

		public WebElement collateral_ViewSummaryStatus_Completed() {
			return collateral_ViewSummaryStatus_Completed;
		}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'Start Time')]")
	private WebElement collateral_ViewSummaryStartTime;

	public WebElement collateral_ViewSummaryStartTime() {
		return collateral_ViewSummaryStartTime;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'End Time')]")
	private WebElement collateral_ViewSummaryEndTime;

	public WebElement collateral_ViewSummaryEndTime() {
		return collateral_ViewSummaryEndTime;
	}

	// ViewSummary
	@FindBy(xpath = "//th[contains(text(),'Remarks')]")
	private WebElement collateral_ViewSummaryRemarks;

	public WebElement collateral_ViewSummaryRemarks() {
		return collateral_ViewSummaryRemarks;
	}

	// ViewSummary
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
	private WebElement collateral_ViewSummaryClose;

	public WebElement collateral_ViewSummaryClose() {
		return collateral_ViewSummaryClose;
	}

	//collateral_ReferanceId
	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement collateral_ReferanceId;

	public WebElement collateral_ReferanceId() {
		return collateral_ReferanceId;
	}

	
	// collateral_Remarks_FieldValidation
	@FindBy(xpath = "//ion-badge[contains(text(),'Required field')]")
	private WebElement collateral_Remarks_FieldValidation;

	public WebElement collateral_Remarks_FieldValidation() {
		return collateral_Remarks_FieldValidation;
	}

	// collateral_CategoryCode_InvalidDataValidationMessage
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement collateral_CategoryCode_InvalidDataValidationMessage;

	public WebElement collateral_CategoryCode_InvalidDataValidationMessage() {
		return collateral_CategoryCode_InvalidDataValidationMessage;
	}
	
	//Change_Language
		@FindBy(xpath = "//ion-header/ion-toolbar[1]/section[1]/ion-list[1]/ion-item[5]/ion-select[1]")
		private WebElement Language;

		public WebElement Language() {
			return Language;
		}
		
		// Language_French
		@FindBy(xpath = "//ion-label[contains(text(),'French')]/../ion-radio")
		private WebElement Language_French;

		public WebElement Language_French() {
			return Language_French;
		}

		// Language_German
		@FindBy(xpath = "//ion-label[contains(text(),'German')]/../ion-radio")
		private WebElement Language_German;

		public WebElement Language_German() {
			return Language_German;
		}

		// Language_Arabic
		@FindBy(xpath = "//ion-label[contains(text(),'Arabic')]/../ion-radio")
		private WebElement Language_Arabic;

		public WebElement Language_Arabic() {
			return Language_Arabic;
		}

		// Language_English
		@FindBy(xpath = "//ion-label[contains(text(),'English')]/../ion-radio")
		private WebElement Language_English;

		public WebElement Language_English() {
			return Language_English;
		}

		// Description_add
		@FindBy(xpath = "//ion-row[1]/ion-col[2]/digital-text-box[1]/ion-item[1]/ion-button[1]")
		private WebElement Description_add;

		public WebElement Description_add() {
			return Description_add;
		}
		
		// Description_Close
		@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
		private WebElement Description_Close;

		public WebElement Description_Close() {
			return Description_Close;
		}
		// Description_Multilanguage
		@FindBy(xpath = "//div[1]/ion-card[1]/ion-grid[1]/form[1]/ion-input[1]/input[1]")
		private WebElement Description_Multilanguage;

		public WebElement Description_Multilanguage() {
			return Description_Multilanguage;
		}
}
