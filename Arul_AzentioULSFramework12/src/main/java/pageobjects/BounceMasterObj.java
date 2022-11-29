package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BounceMasterObj {
	WebDriver driver;
	public BounceMasterObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ion-label[contains(text(),' Bounce Code ')]//following-sibling::ion-input/input")
	private WebElement BounceCodeFieldInBounceMaster;
	public WebElement BounceCodeFieldInBounceMaster() {
		return BounceCodeFieldInBounceMaster;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Charge Applicable ')]//following-sibling::ion-select")
	private WebElement ChargeApplicableFieldInBounceMaster;
	public WebElement ChargeApplicableFieldInBounceMaster() {
		return ChargeApplicableFieldInBounceMaster;
	}
	@FindBy(xpath="(//ion-label[contains(text(),' Bounce Description ')]//following-sibling::ion-input/input)[1]")
	private WebElement BounceDescriptionFieldInBounceMaster;
	public WebElement BounceDescriptionFieldInBounceMaster() {
		return BounceDescriptionFieldInBounceMaster;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Bounce Description 2 ')]//following-sibling::ion-input/input")
	private WebElement BounceDescription2FieldInBounceMaster;
	public WebElement BounceDescription2FieldInBounceMaster() {
		return BounceDescription2FieldInBounceMaster;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Bounce Description 3 ')]//following-sibling::ion-input/input")
	private WebElement BounceDescription3FieldInBounceMaster;
	public WebElement BounceDescription3FieldInBounceMaster() {
		return BounceDescription3FieldInBounceMaster;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement BounceMasterAddIcon;
	public WebElement BounceMasterAddIcon() {
		return BounceMasterAddIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement BounceMasterSaveIcon;
	public WebElement BounceMasterSaveIcon() {
		return BounceMasterSaveIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-arrow-left']")
	private WebElement BounceMasterBackIcon;
	public WebElement BounceMasterBackIcon() {
		return BounceMasterBackIcon;
	}
	@FindBy(xpath="(//div[@role='alert'])[2]")
	private WebElement BounceMastersubmitSuccessPopup;
	public WebElement BounceMastersubmitSuccessPopup() {
		return BounceMastersubmitSuccessPopup;
	}
	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']") 
    private WebElement BounceMaster_Checker_Id;
    public WebElement BounceMaster_Checker_Id() {
        return BounceMaster_Checker_Id;
    } 
    @FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") 
    private WebElement BounceMasterInbox;
    public WebElement BounceMasterInbox() {
        return BounceMasterInbox;
    }
    @FindBy(xpath="//div[@role='alert']")
    private WebElement BounceMastercheckerApproveMgs;
    public WebElement BounceMastercheckerApproveMgs() {
    	return BounceMastercheckerApproveMgs;
    }
    @FindBy(xpath = "//ion-label[contains(text(),'approve')]") 
    private WebElement BounceMaster_Checker_Alert_Approve;
    public WebElement BounceMaster_Checker_Alert_Approve() {
        return BounceMaster_Checker_Alert_Approve;
    }
    @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
    private WebElement BounceMaster_Checker_Final_Approve;
    public WebElement BounceMaster_Checker_Final_Approve() {
        return BounceMaster_Checker_Final_Approve;
    }
    @FindBy(xpath = "//button/span[contains(text(),'Submit')]") 
    private WebElement BounceMasterMaker_Submit;
    public WebElement BounceMasterMaker_Submit() {
        return BounceMasterMaker_Submit;
    }
    @FindBy(xpath = "//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea") 
    private WebElement BounceMaster_EnterRemark;
    public WebElement BounceMaster_EnterRemark() {
        return BounceMaster_EnterRemark;
    }
    @FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
    private WebElement BounceMasterRemarkSubmit;
    public WebElement BounceMasterRemarkSubmit() {
    	return BounceMasterRemarkSubmit;
    }
    @FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]") 
    private WebElement BounceMasterInboxView_Search;
    public WebElement BounceMasterInboxView_Search() {
        return BounceMasterInboxView_Search;
    }  
    @FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input") 
    private WebElement BounceMasterInboxView_SearchText;
    public WebElement BounceMasterInboxView_SearchText() {
        return BounceMasterInboxView_SearchText;
    }  
    @FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]") 
    private WebElement BounceMasterReferanceId;
    public WebElement BounceMasterReferanceId() {
        return BounceMasterReferanceId;
    } 
    @FindBy(xpath = "(//td[text()=' COLL_SUB_TYPE ']//parent::tr//child::td[1]/button)[1]") 
    private WebElement BounceMasterFirstEditIconInMakerListView;
    public WebElement BounceMasterFirstEditIconInMakerListView() {
    	return BounceMasterFirstEditIconInMakerListView;
    }
    @FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]") 
    private WebElement BounceMasterChecker_Reject;
    public WebElement BounceMasterChecker_Reject() {
        return BounceMasterChecker_Reject;
    }
    @FindBy(xpath = "//ion-label[contains(text(),'cancel')]") 
    private WebElement BounceMaster_Checker_Alert_Reject;
    public WebElement BounceMaster_Checker_Alert_Reject() {
        return BounceMaster_Checker_Alert_Reject;
    }
    @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
    private WebElement BounceMaster_Checker_Final_Reject;
    public WebElement BounceMaster_Checker_Final_Reject() {
        return BounceMaster_Checker_Final_Reject;
    }
    @FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]") 
    private WebElement BounceMaster_Checker_Return;
    public WebElement BounceMaster_Checker_Return() {
        return BounceMaster_Checker_Return;
    }
    @FindBy(xpath = "//ion-label[contains(text(),'return')]") 
    private WebElement BounceMaster_Checker_Alert_Return;
    public WebElement BounceMaster_Checker_Alert_Return() {
        return BounceMaster_Checker_Alert_Return;
    }
    @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
    private WebElement BounceMaster_Checker_Final_Return;
    public WebElement BounceMaster_Checker_Final_Return() {
        return BounceMaster_Checker_Final_Return;
    }
    @FindBy(xpath="//ion-badge[contains(text(), 'Required field')]")
	private WebElement BounceMaster_requiredFieldWarningPopup;
	public WebElement BounceMaster_requiredFieldWarningPopup() {
		return BounceMaster_requiredFieldWarningPopup;
	}
	@FindBy(xpath="//ion-badge[contains(text(),' Alphanumeric characters allowed')]")
	private WebElement BounceMaster_alphaNumericCharactersAllowedWarningPopup;
	public WebElement BounceMaster_alphaNumericCharactersAllowedWarningPopup() {
		return BounceMaster_alphaNumericCharactersAllowedWarningPopup;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement BounceMaster_pencilIconOfFirstRecord;
	public WebElement BounceMaster_pencilIconOfFirstRecord() {
		return BounceMaster_pencilIconOfFirstRecord;
	}
	@FindBy(xpath="//ion-label[text()='Status ']//parent::div//following-sibling::ion-item//child::ion-toggle")
	private WebElement statusToggleIconOfBounceMaster;
	public WebElement statusToggleIconOfBounceMaster() {
		return statusToggleIconOfBounceMaster;
	}
	@FindBy(xpath="//button[@aria-label='Close']")
	private WebElement closeIconInSuccessPopupOfBounceMaster;
	public WebElement closeIconInSuccessPopupOfBounceMaster() {
		return closeIconInSuccessPopupOfBounceMaster;
	}
	
	@FindBy(xpath="//button[@ng-reflect-text='View Summary']/child::span[1]")
	private WebElement viewSummaryIconOfBounceMaster;
	public WebElement viewSummaryIconOfBounceMaster() {
		return viewSummaryIconOfBounceMaster;
	}
	
	@FindBy(xpath="//ionic-title[contains(text(),'  Transaction summary ')]")
	private WebElement viewSummaryPageOfBounceMaster;
	public WebElement viewSummaryPageOfBounceMaster() {
		return viewSummaryPageOfBounceMaster;
	}
	@FindBy(xpath="//ion-button[@ng-reflect-expand='block']")
	private WebElement closeIconInViewSummaryPageOfBounceMaster;
	public WebElement closeIconInViewSummaryPageOfBounceMaster() {
		return closeIconInViewSummaryPageOfBounceMaster;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIconOfBounceMaster;
	public WebElement searchIconOfBounceMaster() {
		return searchIconOfBounceMaster;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement searchTextFieldOfBounceMaster;
	public WebElement searchTextFieldOfBounceMaster() {
	return searchTextFieldOfBounceMaster;
	}

	@FindBy(xpath="//input[@mode='ios']/parent::span//i")
	private WebElement clearIconInSearchFieldOfBounceMaster;
	public WebElement clearIconInSearchFieldOfBounceMaster() {
	return clearIconInSearchFieldOfBounceMaster;
	}
	@FindBy(xpath="//span[text()='Export']")
	private WebElement exportIconOfBounceMaster;
	public WebElement exportIconOfBounceMaster() {
		return exportIconOfBounceMaster;
	}	
	@FindBy(xpath="//li[@aria-label='PDF']")
	private WebElement exportToPDFOfBounceMaster;
	public WebElement exportToPDFOfBounceMaster() {
		return exportToPDFOfBounceMaster;
	}	
	@FindBy(xpath="//li[@aria-label='XLS']")
	private WebElement exportToExcelOfBounceMaster;
	public WebElement exportToExcelOfBounceMaster() {
		return exportToExcelOfBounceMaster;
	}
	
	@FindBy(xpath="//span[contains(text(),'Configurations')]")
	private WebElement configurationInLeftPanel;
	public WebElement configurationInLeftPanel() {
		return configurationInLeftPanel;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'Config Manager')]")
	private WebElement configManagerInLeftPanel;
	public WebElement configManagerInLeftPanel() {
		return configManagerInLeftPanel;
	}
	
	@FindBy(xpath="//ion-label[text()='Bounce  Master']//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement viewIconOfBounceMaster;
	public WebElement viewIconOfBounceMaster() {
		return viewIconOfBounceMaster;
	}
	@FindBy(xpath="//ion-label[text()='Bounce  Master']//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement tempViewOfBounceMaster;
	public WebElement tempViewOfBounceMaster() {
		return tempViewOfBounceMaster;
	}
	
	@FindBy(xpath="//ion-icon[@aria-label='menu']")
	private WebElement menuBarInHomePage;
	public WebElement menuBarInHomePage() {
		return menuBarInHomePage;
	}
	@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]") 
    private WebElement bounceMaster_Checker_Approve;
    public WebElement bounceMaster_Checker_Approve() {
        return bounceMaster_Checker_Approve;
    }  
    @FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement ConfigManager;

	public WebElement ConfigManager() {
		return ConfigManager;
	}

	@FindBy(xpath = "(//ion-label[contains(text(),'Bounce')]//following-sibling::ion-buttons//child::ion-button)[1]")
	private WebElement BounceMasterEdit;

	public WebElement BounceMasterEdit() {
		return BounceMasterEdit;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement ActionEditIcon;

	public WebElement ActionEditIcon() {
		return ActionEditIcon;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Charge')]//following-sibling::ion-select")
	private WebElement ChargeApplicable;

	public WebElement ChargeApplicable() {
		return ChargeApplicable;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Update']")
	private WebElement UpdateSave;

	public WebElement UpdateSave() {
		return UpdateSave;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'Bounce Code')]//following-sibling::ion-input/input)[1]")
	private WebElement BounceCode;

	public WebElement BounceCode() {
		return BounceCode;
	}
	@FindBy(xpath="//ion-badge[contains(text(),'Required field')]")
	private WebElement RequiredField;

	public WebElement RequiredField() {
		return RequiredField;
	}
	@FindBy(xpath="//div[@aria-label='Success']")
	private WebElement BounceMasterSaveSuccessPopup;
	public WebElement BounceMasterSaveSuccessPopup() {
		return BounceMasterSaveSuccessPopup;
	}
	@FindBy(xpath="//ion-label[text()='Allocation Master']//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement viewIconOfAllocationMaster;
	public WebElement viewIconOfAllocationMaster() {
		return viewIconOfAllocationMaster;
	}
	@FindBy(xpath = "//ion-select[@ng-reflect-text='Module name']")
    private WebElement ModuleName1;
    public WebElement ModuleName() {
        return ModuleName1;
    }
    @FindBy(xpath = "//ion-label[text()='LOS']/following-sibling::ion-radio")
    private WebElement LOS;
    public WebElement LOS() {
        return LOS;
    }
}

