package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollateralSubTypeObj {
	WebDriver driver;
	public CollateralSubTypeObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ion-label[contains(text(),'Asset Collateral Config')]")
	private WebElement AssetCollateralConfigInLeftPanel;
	public WebElement AssetCollateralConfigInLeftPanel() {
		return AssetCollateralConfigInLeftPanel;
	}
	
	@FindBy(xpath="//ion-label[text()='Collateral sub type']//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement TempViewIconOfCollateralSubType;
	public WebElement TempViewIconOfCollateralSubType() {
		return TempViewIconOfCollateralSubType;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement CollateralSubTypeAddIcon;
	public WebElement CollateralSubTypeAddIcon() {
		return CollateralSubTypeAddIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Description')]//following-sibling::ion-input/input")
	private WebElement CollateralSubTypeDescriptionField;
	public WebElement CollateralSubTypeDescriptionField() {
		return CollateralSubTypeDescriptionField;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Asset/Collateral subtype code')]//following-sibling::ion-input/input")
	private WebElement CollateralSubTypeCollateralSubTypeCodeField;
	public WebElement CollateralSubTypeCollateralSubTypeCodeField() {
		return CollateralSubTypeCollateralSubTypeCodeField;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Asset/Collateral type *']")
	private WebElement CollateralSubTypeCollateralTypeField;
	public WebElement CollateralSubTypeCollateralTypeField() {
		return CollateralSubTypeCollateralTypeField;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Exposure %')]//following-sibling::ion-input/input")
	private WebElement CollateralSubTypeExposurePercentageField;
	public WebElement CollateralSubTypeExposurePercentageField() {
		return CollateralSubTypeExposurePercentageField;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Asset/Collateral Valuation Tolerance %  ')]//following-sibling::ion-input/input")
	private WebElement CollateralSubTypeCollateralValuationToleranceField;
	public WebElement CollateralSubTypeCollateralValuationToleranceField() {
		return CollateralSubTypeCollateralValuationToleranceField;
	}
	@FindBy(xpath="//ion-textarea/div/textarea")
	private WebElement CollateralSubTypeRemarksField;
	public WebElement CollateralSubTypeRemarksField() {
		return CollateralSubTypeRemarksField;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement CollateralSubTypeSaveIcon;
	public WebElement CollateralSubTypeSaveIcon() {
		return CollateralSubTypeSaveIcon;
	}
	//button[@ng-reflect-icon='pi pi-arrow-left']
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-arrow-left']")
	private WebElement CollateralSubTypeBackIcon;
	public WebElement CollateralSubTypeBackIcon() {
		return CollateralSubTypeBackIcon;
	}
	@FindBy(xpath="(//div[@role='alert'])[2]")
	private WebElement CollateralSubTypesubmitSuccessPopup;
	public WebElement CollateralSubTypesubmitSuccessPopup() {
		return CollateralSubTypesubmitSuccessPopup;
	}
	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']") 
    private WebElement assetAuto_Checker_Id;
    public WebElement assetAuto_Checker_Id() {
        return assetAuto_Checker_Id;
    } 
    @FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") 
    private WebElement Checker_Inbox;
    public WebElement Checker_Inbox() {
        return Checker_Inbox;
    }
    @FindBy(xpath = "//ion-icon[@aria-label='menu']") 
    private WebElement Checker_toggle;
    public WebElement Checker_toggle() {
        return Checker_toggle;
    } 
    @FindBy(xpath="//div[@role='alert']")
    private WebElement checkerApproveMgs;
    public WebElement checkerApproveMgs() {
    	return checkerApproveMgs;
    }
    @FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]") 
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
    @FindBy(xpath = "//button/span[contains(text(),'Submit')]") 
    private WebElement assetAutoMaker_Submit;
    public WebElement assetAutoMaker_Submit() {
        return assetAutoMaker_Submit;
    }
    @FindBy(xpath = "//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea") 
    private WebElement assetAutoMakerMaker_EnterRemark;
    public WebElement assetAutoMakerMaker_EnterRemark() {
        return assetAutoMakerMaker_EnterRemark;
    }
    @FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
    private WebElement assetAutomakerRemarkSubmit;
    public WebElement assetAutomakerRemarkSubmit() {
    	return assetAutomakerRemarkSubmit;
    }
    @FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]") 
    private WebElement assetAutoInboxView_Search;
    public WebElement assetAutoInboxView_Search() {
        return assetAutoInboxView_Search;
    }  
    @FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input") 
    private WebElement assetAutoInboxView_SearchText;
    public WebElement assetAutoInboxView_SearchText() {
        return assetAutoInboxView_SearchText;
    }  
    @FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]") 
    private WebElement assetAutoReferanceId;
    public WebElement assetAutoReferanceId() {
        return assetAutoReferanceId;
    } 
    @FindBy(xpath = "(//td[text()=' COLL_SUB_TYPE ']//parent::tr//child::td[1]/button)[1]") 
    private WebElement firstEditIconInMakerListView;
    public WebElement firstEditIconInMakerListView() {
    	return firstEditIconInMakerListView;
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
	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement ConfigManagerInLeftPanel;

	public WebElement ConfigManagerInLeftPanel() {
		return ConfigManagerInLeftPanel;
	}
    @FindBy(xpath = "//ion-label[text()='Collateral sub type']//following-sibling::ion-buttons//child::ion-button[2]") 
    private WebElement ViewIconOfCollateralSubType;
    public WebElement ViewIconOfCollateralSubType() {
        return ViewIconOfCollateralSubType;
    }
    @FindBy(xpath="//ion-badge[contains(text(), 'Required field')]")
	private WebElement requiredFieldWarningPopup;
	public WebElement requiredFieldWarningPopup() {
		return requiredFieldWarningPopup;
	}
	@FindBy(xpath="//ion-badge[contains(text(),' Alphanumeric characters allowed')]")
	private WebElement alphaNumericCharactersAllowedWarningPopup;
	public WebElement alphaNumericCharactersAllowedWarningPopup() {
		return alphaNumericCharactersAllowedWarningPopup;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement pencilIconOfFirstRecordInCollateralSubType;
	public WebElement pencilIconOfFirstRecordInCollateralSubType() {
		return pencilIconOfFirstRecordInCollateralSubType;
	}
	
	@FindBy(xpath="//ion-col[1]/ion-card[1]/ion-card-content[1]/form[1]/ion-grid[2]/ion-row[1]/ion-col[4]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement CollateralSubTypeCollateralTypeFieldForUpdate;
	public WebElement CollateralSubTypeCollateralTypeFieldForUpdate() {
		return CollateralSubTypeCollateralTypeFieldForUpdate;
	}
	@FindBy(xpath="//ion-label[text()='Status ']//parent::div//following-sibling::ion-item//child::ion-toggle")
	private WebElement statusToggleIconOfCollateralSubtype;
	public WebElement statusToggleIconOfCollateralSubtype() {
		return statusToggleIconOfCollateralSubtype;
	}
	@FindBy(xpath="//button[@aria-label='Close']")
	private WebElement closeIconInSuccessPopupOfCollateralSubType;
	public WebElement closeIconInSuccessPopupOfCollateralSubType() {
		return closeIconInSuccessPopupOfCollateralSubType;
	}
	
	@FindBy(xpath="//button[@ng-reflect-text='View Summary']/child::span[1]")
	private WebElement viewSummaryIconOfCollateralSubType;
	public WebElement viewSummaryIconOfCollateralSubType() {
		return viewSummaryIconOfCollateralSubType;
	}
	
	@FindBy(xpath="//ionic-title[contains(text(),'  Transaction summary ')]")
	private WebElement viewSummaryPageOfCollateralSubType;
	public WebElement viewSummaryPageOfCollateralSubType() {
		return viewSummaryPageOfCollateralSubType;
	}
	@FindBy(xpath="//ion-button[@ng-reflect-expand='block']")
	private WebElement closeIconInViewSummaryPageOfCollateralSubType;
	public WebElement closeIconInViewSummaryPageOfCollateralSubType() {
		return closeIconInViewSummaryPageOfCollateralSubType;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIconOfCollateralSubType;
	public WebElement searchIconOfCollateralSubType() {
		return searchIconOfCollateralSubType;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement searchTextFieldOfCollateralSubType;
	public WebElement searchTextFieldOfCollateralSubType() {
	return searchTextFieldOfCollateralSubType;
	}

	@FindBy(xpath="//input[@mode='ios']/parent::span//i")
	private WebElement clearIconInSearchFieldOfCollateralSubType;
	public WebElement clearIconInSearchFieldOfCollateralSubType() {
	return clearIconInSearchFieldOfCollateralSubType;
	}
	@FindBy(xpath="//span[text()='Export']")
	private WebElement exportIconOfCollateralSubType;
	public WebElement exportIconOfCollateralSubType() {
		return exportIconOfCollateralSubType;
	}	
	@FindBy(xpath="//li[@aria-label='PDF']")
	private WebElement exportToPDFOfCollateralSubType;
	public WebElement exportToPDFOfCollateralSubType() {
		return exportToPDFOfCollateralSubType;
	}	
	@FindBy(xpath="//li[@aria-label='XLS']")
	private WebElement exportToExcelOfCollateralSubType;
	public WebElement exportToExcelOfCollateralSubType() {
		return exportToExcelOfCollateralSubType;
	}
	@FindBy(xpath="//span[contains(text(),'Configurations')]")
	private WebElement configurationInLeftPanel;
	public WebElement configurationInLeftPanel() {
		return configurationInLeftPanel;
	}
	@FindBy(xpath = "//ion-label[text()='LOS']/following-sibling::ion-radio")
    private WebElement LOS;
    public WebElement LOS() {
        return LOS;
    }
    @FindBy(xpath = "//ion-select[@ng-reflect-text='Module name']")
    private WebElement ModuleName1;
    public WebElement ModuleName() {
        return ModuleName1;
    }
}

