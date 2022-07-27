package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMaster_RetailObj {

	WebDriver driver;

	public ProductMaster_RetailObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// ------------------------MAKER STAGE PAGEOBJECTS----------------------//

	@FindBy(xpath = "//ion-card-content[1]/ion-item[1]//ion-icon[1]")
    private WebElement config_Manager;
    public WebElement config_Manager() {
    	return config_Manager;
    }
    
    //Product_Setup
    @FindBy(xpath = "//h4[contains(text(),'Product Setup')]")
    private WebElement Product_Setup;
    public WebElement Product_Setup() {
    	return Product_Setup;
    }
    
    // ProductMaster EyeIcon
    //h4[contains(text(),'Product master')]/ancestor::ion-item//ion-button[2]
	@FindBy(xpath = "//ion-item[3]/ion-buttons[1]/ion-button[2]") 
	private WebElement productMaster_EyeIcon;
	public WebElement productMaster_EyeIcon() {
		return productMaster_EyeIcon;
	}
	
	//Product Master Add Button
	@FindBy(xpath = "//button[@ng-reflect-text='Add']") 
	private WebElement productMaster_AddButton;
	public WebElement productMaster_AddButton() {
		return productMaster_AddButton;
	}
	
	//product group //ion-select[@aria-label='Select,  Product Group *']
	@FindBy(xpath = "//ion-col[2]/digital-select-layout/ion-item/ion-select")
	private WebElement productMaster_ProductGroup;
	public WebElement productMaster_ProductGroup() {
		return productMaster_ProductGroup;
	}
	
	//Lending option from ProductGroup dropdown
	
	@FindBy(xpath = "//ion-label[contains(text(),'Lending')]/../ion-radio")
	private WebElement productMaster_ProductGroup_Dropdown;
	public WebElement productMaster_ProductGroup_Dropdown() {
		return productMaster_ProductGroup_Dropdown;
	}////ion-label[text()=' Lending ']/parent::ion-item/ion-radio	
	
	@FindBy(xpath = "")
	private WebElement productMaster_ProductGroup_LendingSelect;
	public WebElement productMaster_ProductGroup_LendingSelect() {
		return productMaster_ProductGroup_LendingSelect;
	}
	//product code Asterik
	@FindBy(xpath = "//ion-label[@id='ion-input-92-lbl']") 
	private WebElement productMaster_ProductCodeAsterik;
	public WebElement productMaster_ProductCodeAsterik() {
		return productMaster_ProductCodeAsterik;
	}
	
	@FindBy(xpath = "//ion-col[3]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]") 
	private WebElement productMaster_ProductCode;
	public WebElement productMaster_ProductCode() {
		return productMaster_ProductCode;
	}//ion-row[1]/ion-col[3]//ion-item[1]//ion-input[1]/input
	
	
	@FindBy(xpath = "//ion-row[1]/ion-col[4]//ion-item[1]//ion-input[1]/input") 
	private WebElement productMaster_ProductDescriptionEnter;
	public WebElement productMaster_ProductDescriptionEnter() {
		return productMaster_ProductDescriptionEnter;
	}
	
	//product description
	//ion-row[1]/ion-col[4]//ion-item[1]//ion-input[1]/input
	@FindBy(xpath = "//ion-row[1]/ion-col[4]/digital-text-box[1]/ion-item[1]/ion-button[1]") 
	private WebElement productMaster_ProductDescription;
	public WebElement productMaster_ProductDescription() {
		return productMaster_ProductDescription;
	}
	
	//product description English
	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[1]/input[1]") 
	private WebElement productMaster_ProductDescription_English;
	public WebElement productMaster_ProductDescription_English() {
		return productMaster_ProductDescription_English;
	}
	
	//product description French
	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[2]/input[1]") 
	private WebElement productMaster_ProductDescription_French;
	public WebElement productMaster_ProductDescription_French() {
		return productMaster_ProductDescription_French;
	}
	//product description German
	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[3]/input[1]") 
	private WebElement productMaster_ProductDescription_German;
	public WebElement productMaster_ProductDescription_German() {
		return productMaster_ProductDescription_German;
	}
		
	//product description Arabic
	@FindBy(xpath = "//ion-grid[1]/form[1]/ion-input[4]/input[1]") 
	private WebElement productMaster_ProductDescription_Arabic;
	public WebElement productMaster_ProductDescription_Arabic() {
		return productMaster_ProductDescription_Arabic;
	}
	
	//product description save
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-buttons[1]/ion-button[1]") 
	private WebElement productMaster_ProductDescription_Save;
	public WebElement productMaster_ProductDescription_Save() {
		return productMaster_ProductDescription_Save;
	}
		
	//retail/Corporate ////ion-select[@aria-label='Select,  Retail/Corporate *']
	@FindBy(xpath = "//ion-col[5]/digital-select-layout/ion-item/ion-select") 
	private WebElement productMaster_RetailCorporate;
	public WebElement productMaster_RetailCorporate() {
		return productMaster_RetailCorporate;
	}
	
	//retail option from dropdown
	@FindBy(xpath = "//ion-label[text()=' Retail ']/parent::ion-item/ion-radio") 
	private WebElement productMaster_RetailCorporate_Dropdown;
	public WebElement productMaster_RetailCorporate_Dropdown() {
		return productMaster_RetailCorporate_Dropdown;
	}

	//DMCode
	@FindBy(xpath = "//ion-row[1]/ion-col[6]//ion-item[1]//ion-input[1]/input")
	private WebElement productMaster_Product_DMCode;
	public WebElement productMaster_Product_DMCode() {
		return productMaster_Product_DMCode;
	}

	//Remark
	@FindBy(xpath = "//ion-textarea[1]//textarea[1]")
	private WebElement productMaster_Product_Remark;
	public WebElement productMaster_Product_Remark() {
		return productMaster_Product_Remark;
	}
	//ValidationRequiredField
	@FindBy(xpath = "//ion-badge[contains(text(),'Required field')]")
	private WebElement productMaster_Product_ValidationRequiredField;
	public WebElement productMaster_Product_ValidationRequiredField() {
		return productMaster_Product_ValidationRequiredField;
	}
	
	//ValidationAlphanumeric
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement productMaster_Product_ValidationAlphanumeric;
	public WebElement productMaster_Product_ValidationAlphanumeric() {
		return productMaster_Product_ValidationAlphanumeric;
	}
	
	//Save
	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement productMaster_Product_Save;
	public WebElement productMaster_Product_Save() {
		return productMaster_Product_Save;
	}
	//SuccessValidation
	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement productMaster_Product_SuccessValidation;
	public WebElement productMaster_Product_SuccessValidation() {
		return productMaster_Product_SuccessValidation;
	}
	
	//Back
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement productMaster_Product_Back;
	public WebElement productMaster_Product_Back() {
		return productMaster_Product_Back;
	}

	//Edit
	@FindBy(xpath = "//ion-card-content[1]/ion-item[3]/ion-buttons[1]/ion-button[1]")
	private WebElement ProductMaster_Product_Edit;
	public WebElement ProductMaster_Product_Edit() {
		return ProductMaster_Product_Edit;
	}
	
	//ActionEdit
		@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]")
		private WebElement ProductMaster_Product_ActionEdit;
		public WebElement ProductMaster_Product_ActionEdit(){
			return ProductMaster_Product_ActionEdit;
		}
	//Search
	@FindBy(xpath = "//div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement productMaster_Product_Search;
	public WebElement productMaster_Product_Search() {
		return productMaster_Product_Search;
	}
	//SearchRecordList
	@FindBy(xpath = "//div[1]/div[1]/div[1]/span[2]/button[1]/span[1]")
	private WebElement productMaster_Product_SearchRecordList;
	public WebElement productMaster_Product_SearchRecordList() {
		return productMaster_Product_SearchRecordList;
	}
	
	//SearchInputField
	@FindBy(xpath = "//div/span/input")
	private WebElement productMaster_Product_SearchInputField;
	public WebElement productMaster_Product_SearchInputField() {
		return productMaster_Product_SearchInputField;
	}
	//SearchInputFieldClose
	@FindBy(xpath = "//div/span/i")
	private WebElement productMaster_Product_SearchInputFieldClose;
	public WebElement productMaster_Product_SearchInputFieldClose() {
		return productMaster_Product_SearchInputFieldClose;
	}
	
	//Menu
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-menu-toggle[1]/ion-button[1]")
	private WebElement productMaster_Product_Menu;
	public WebElement productMaster_Product_Menu() {
		return productMaster_Product_Menu;
	}

	
	//Inbox
	@FindBy(xpath = "//ion-icon[@aria-label='mail outline']")
	private WebElement productMaster_Product_Inbox;
	public WebElement productMaster_Product_Inbox() {
		return productMaster_Product_Inbox;
	}

	//ReferanceId
	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement productMaster_Product_ReferanceId;
	public WebElement productMaster_Product_ReferanceId() {
		return productMaster_Product_ReferanceId;
	}

	//Action //tbody/tr[1]/td[1]/span[1]/button[1]/span[1]
	@FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]")
	private WebElement productMaster_Product_Action;
	public WebElement productMaster_Product_Action() {
		return productMaster_Product_Action;
	}

	//MakerSubmit
	@FindBy(xpath = "//button/span[contains(text(),'Submit')]")
	private WebElement productMaster_Product_Submit;
	public WebElement productMaster_Product_Submit() {
		return productMaster_Product_Submit;
	}
	
	//SubmitRemark
	@FindBy(xpath = "//ion-label[contains(text(),'ok')]")
	private WebElement productMaster_Product_SubmitRemark;
	public WebElement productMaster_Product_SubmitRemark() {
		return productMaster_Product_SubmitRemark;
	}

	//FinalSubmit
	@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
	private WebElement productMaster_Product_FinalSubmit;
	public WebElement productMaster_Product_FinalSubmit() {
			return productMaster_Product_FinalSubmit;
	}
	//Logout
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/div[1]/ion-item[1]/ion-label[1]/div[1]/div[2]/ion-icon[1]")
	private WebElement productMaster_Product_Logout;
	public WebElement productMaster_Product_Logout() {
			return productMaster_Product_Logout;
	}
	
	//MakerCancel
	@FindBy(xpath = "//button/span[contains(text(),'Cancel')]")
	private WebElement productMaster_Product_Cancel;
	public WebElement productMaster_Product_Cancel() {
		return productMaster_Product_Cancel;
	}
	//button[@ng-reflect-text='View Summary']
	//ViewSummary 
	@FindBy(xpath = "//ion-col[2]/kub-workflow-decision[1]/span[1]/button[3]/span[1]")
	private WebElement productMaster_Product_ViewSummary;
	public WebElement productMaster_Product_ViewSummary() {
		return productMaster_Product_ViewSummary;
	}
	//ViewSummary
		@FindBy(xpath = "//th[contains(text(),'User')]")
		private WebElement productMaster_Product_ViewSummaryUser;
		public WebElement productMaster_Product_ViewSummaryUser() {
			return productMaster_Product_ViewSummaryUser;
		}
		//ViewSummary
		@FindBy(xpath = "//th[contains(text(),'Stage Code')]")
		private WebElement productMaster_Product_ViewSummaryStageCode;
		public WebElement productMaster_Product_ViewSummaryStageCode() {
			return productMaster_Product_ViewSummaryStageCode;
		}
		
		//ViewSummary
		@FindBy(xpath = "//th[contains(text(),'Status')]")
		private WebElement productMaster_Product_ViewSummaryStatus;
		public WebElement productMaster_Product_ViewSummaryStatus() {
			return productMaster_Product_ViewSummaryStatus;
		}
		
		//ViewSummary
		@FindBy(xpath = "//th[contains(text(),'Start Time')]")
		private WebElement productMaster_Product_ViewSummaryStartTime;
		public WebElement productMaster_Product_ViewSummaryStartTime() {
			return productMaster_Product_ViewSummaryStartTime;
		}
		
		//ViewSummary
		@FindBy(xpath = "//th[contains(text(),'End Time')]")
		private WebElement productMaster_Product_ViewSummaryEndTime;
		public WebElement productMaster_Product_ViewSummaryEndTime() {
			return productMaster_Product_ViewSummaryEndTime;
		}
		
		//ViewSummary
		@FindBy(xpath = "//th[contains(text(),'Remarks')]")
		private WebElement productMaster_Product_ViewSummaryRemarks;
		public WebElement productMaster_Product_ViewSummaryRemarks() {
			return productMaster_Product_ViewSummaryRemarks;
		}
		//ViewSummary
		@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
		private WebElement productMaster_Product_ViewSummaryClose;
		public WebElement productMaster_Product_ViewSummaryClose() {
			return productMaster_Product_ViewSummaryClose;
		}
		

	//Submit_Confirmation
	@FindBy(xpath = "//ion-label[contains(text(),'new record')]")
	private WebElement productMaster_Product_Submit_Confirmation;
	public WebElement productMaster_Product_Submit_Confirmation() {
		return productMaster_Product_Submit_Confirmation;
	}

	//Maker_Submit
	@FindBy(xpath = "//button[@ng-reflect-label='Submit']/span[2]")
	private WebElement productMaster_Product_Maker_Submit;
	public WebElement productMaster_Product_Maker_Submit() {
		return productMaster_Product_Maker_Submit;
	}

	//Checker_Id 
	@FindBy(xpath = "//div[@id='toast-container']/div[1]")
	private WebElement productMaster_Product_Checker_Id;
	public WebElement productMaster_Product_Checker_Id() {
		return productMaster_Product_Checker_Id;
	}
	
	@FindBy(xpath="//div[@id='toast-container']//button")
	private WebElement productMaster_Product_Checker_Alert_Close;
	public WebElement productMaster_Product_Checker_Alert_Close() {
		return productMaster_Product_Checker_Alert_Close;
	}

	//Status
	@FindBy(xpath = "//ion-item[1]/ion-toggle[1]")
	private WebElement productMaster_Product_Status;
	public WebElement productMaster_Product_Status() {
		return productMaster_Product_Status;
	}

	//Export	
	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement productMaster_Product_Export;
	public WebElement productMaster_Product_Export() {
		return productMaster_Product_Export;
	}
	
	//File
	@FindBy(xpath = " //li[@aria-label='XLS']") // PDF
	private WebElement productMaster_Product_File;
	public WebElement productMaster_Product_File() {
		return productMaster_Product_File;
	}

	// ------------------CHECKER STAGE PAGEOBJECTS----------------//
	
	//Checker_Toggle
	@FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-menu-toggle[1]")
	private WebElement productMaster_Product_Checker_Toggle;
	public WebElement productMaster_Product_Checker_Toggle() {
		return productMaster_Product_Checker_Toggle;
	}

	//Checker_Inbox
	@FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']/ion-icon[1]")
	private WebElement productMaster_Product_Checker_Inbox;
	public WebElement productMaster_Product_Checker_Inbox() {
		return productMaster_Product_Checker_Inbox;
	}

	//Checker_Approve
	@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
	private WebElement productMaster_Product_Checker_Approve;
	public WebElement productMaster_Product_Checker_Approve() {
		return productMaster_Product_Checker_Approve;
	}
	//Checker_ApproveRemark 
	@FindBy(xpath = "//ion-label[contains(text(),'approve')]")
	private WebElement productMaster_Product_Checker_ApproveRemark;
	public WebElement productMaster_Product_Checker_ApproveRemark() {
		return productMaster_Product_Checker_ApproveRemark;
	}

	//Checker_ApproveAlert
	@FindBy(xpath = "(//span[contains(text(),'Approve')])[2]")
	private WebElement productMaster_Product_Checker_ApproveAlert;
	public WebElement productMaster_Product_Checker_ApproveAlert() {
		return productMaster_Product_Checker_ApproveAlert;
	}
	
	//Checker_Reject
	@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
	private WebElement productMaster_Product_Checker_Reject;
	public WebElement productMaster_Product_Checker_Reject() {
		return productMaster_Product_Checker_Reject;
	}
	
	//Checker_RejectRemark
	@FindBy(xpath = "//ion-label[contains(text(),'cancel')]")
	private WebElement productMaster_Product_Checker_RejectRemark;
	public WebElement productMaster_Product_Checker_RejectRemark() {
		return productMaster_Product_Checker_RejectRemark;
	}	
	
	//Checker_RejectAlert
	@FindBy(xpath = "(//span[contains(text(),'Reject')])[2]")
	private WebElement productMaster_Product_Checker_RejectAlert;
	public WebElement productMaster_Product_Checker_RejectAlert() {
		return productMaster_Product_Checker_RejectAlert;
	}	

	//Checker_Return
	@FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]")
	private WebElement productMaster_Product_Checker_Return;
	public WebElement productMaster_Product_Checker_Return() {
		return productMaster_Product_Checker_Return;
	}
	//Checker_ReturnRemark
	@FindBy(xpath = "//ion-label[contains(text(),'return')]")
	private WebElement productMaster_Product_Checker_ReturnRemark;
	public WebElement productMaster_Product_Checker_ReturnRemark() {
		return productMaster_Product_Checker_ReturnRemark;
	}
	//Checker_ReturnAlert
	@FindBy(xpath = "(//span[contains(text(),'Return')])[2]")
	private WebElement productMaster_Product_Checker_ReturnAlert;
	public WebElement productMaster_Product_Checker_ReturnAlert() {
		return productMaster_Product_Checker_ReturnAlert;
	}

}