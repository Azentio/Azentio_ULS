package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asset_AutoMaster_Obj {
	 WebDriver driver;
	public Asset_AutoMaster_Obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement addIcon;
	public WebElement addIcon() {
		return addIcon;
	}
	@FindBy(xpath="//ion-label[text()='Product Setup']//following-sibling::ion-icon")
	private WebElement productSetup;
	public WebElement productSetup() {
		return productSetup;
	}
	@FindBy(xpath="//span[text()='Configurations']//following-sibling::ion-icon")
	private WebElement configurationOptions;
	public WebElement configurationOptions() {
		return configurationOptions;
	}
	@FindBy(xpath="//ion-label[text()='Asset Auto Master']//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement assetAutoMasterEditIcon;
	public WebElement assetAutoMasterEditIcon() {
		return assetAutoMasterEditIcon;
	}
	@FindBy(xpath="//ion-label[text()='Asset Auto Master']//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement assetAutoMasterViewIcon;
	public WebElement assetAutoMasterViewIcon() {
		return assetAutoMasterViewIcon;
	}
	//ion-label[contains(text(),'Insurance Policy')]//following-sibling::ion-radio
	@FindBy(xpath="//ion-select[@aria-label='Select,  Asset Category *']")
	private WebElement assetCategory;
	public WebElement assetCategory() {
		return assetCategory;
	}
	//verification
	@FindBy(xpath="//ion-label[contains(text(),'Asset Category')]")
	private WebElement assetCategoryLabel;
	public WebElement assetCategoryLabel() {
		return assetCategoryLabel;
	}
	// updation
	@FindBy(xpath="//ion-col[2]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement assetCategoryUpdation;
	public WebElement assetCategoryUpdation() {
		return assetCategoryUpdation;
	}
	//creation
	@FindBy(xpath="//ion-select[@aria-label='Select,  Brand ']")
	private WebElement brand;
	public WebElement brand() {
		return brand;
	}
	// verification
	@FindBy(xpath="//ion-label[contains(text(),'Brand')]")
	private WebElement brandLabel;
	public WebElement brandLabel() {
		return brandLabel;
	} 
	// updation
	@FindBy(xpath="//ion-col[3]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement brandUpdate;
	public WebElement brandUpdate() {
		return brandUpdate;
	}
	// creation
	@FindBy(xpath="//ion-select[@aria-label='Select,  Asset Type *']")
	private WebElement assetType;
	public WebElement assetType() {
		return assetType;
	} 
	// verification
	@FindBy(xpath="//ion-label[contains(text(),'Asset Type')]")
	private WebElement assetTypeLabel;
	public WebElement assetTypeLabel() {
		return assetTypeLabel;
	}
	// update
		@FindBy(xpath="//ion-row[1]/ion-col[4]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
		private WebElement assetTypeUpdate;
		public WebElement assetTypeUpdate() {
			return assetTypeUpdate;
		} 
	@FindBy(xpath="//ion-label[text()=' Remarks ']//following-sibling::ion-textarea//child::textarea")
	private WebElement remark;
	public WebElement remark() {
		return remark;
	}
	@FindBy(xpath="//ion-label[text()=' Remarks ']")
	private WebElement remarkLabel;
	public WebElement remarkLabel() {
		return remarkLabel;
	}
	@FindBy(xpath = "//button[@ng-reflect-text='Save']") 
    private WebElement assetAutoMasterSave;
    public WebElement assetAutoMasterSave() {
        return assetAutoMasterSave;
    } 
    @FindBy(xpath = "//button[@ng-reflect-text='Update']") 
    private WebElement assetAutoMasterUpdate;
    public WebElement assetAutoMasterUpdate() {
        return assetAutoMasterUpdate;
    } 
	@FindBy(xpath="(//div[@role='alert'])[2]")
    private WebElement successMgs;
    public WebElement successMgs() {
    	return successMgs;
    }
    @FindBy(xpath="//button[@aria-label='Close']")
    private WebElement successClose;
    public WebElement successClose() {
    	return  successClose;
    }
    
    @FindBy(xpath="//tr[1]/td[1]/span[1]/button[1]")
    private WebElement firstEditIcon;
    public WebElement firstEditIcon() {
    	return firstEditIcon;
    } 
    @FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement backButtonInAssetAutoMaster;
	public WebElement backButtonInAssetAutoMaster() {
		return backButtonInAssetAutoMaster;
	}
	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") 
    private WebElement assetAutoInbox;
    public WebElement assetAutoInbox() {
        return assetAutoInbox;
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
    
    @FindBy(xpath = "(//td[contains(text(),'ASSET_AUTO_MST')])[1]//preceding-sibling::td[1]//child::span") 
    private WebElement assetAutoReferanceId;
    public WebElement assetAutoReferanceId() {
        return assetAutoReferanceId;
    } 
    @FindBy(xpath="(//td[text()=' ASSET_AUTO_MST '])[1]//parent::tr//child::td[1]/button")
    private WebElement firstEditIconInMakerListView;
    public WebElement firstEditIconInMakerListView() {
    	return firstEditIconInMakerListView;
    }
    @FindBy(xpath = "//button/span[contains(text(),'Submit')]") 
    private WebElement assetAutoMaker_Submit;
    public WebElement assetAutoMaker_Submit() {
        return assetAutoMaker_Submit;
    }
    @FindBy(xpath = "//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea") 
    private WebElement assetAutoMakerMaker_SubmitRemark;
    public WebElement assetAutoMakerMaker_EnterRemark() {
        return assetAutoMakerMaker_SubmitRemark;
    }
    @FindBy(xpath = "(//div[@role='alert'])[2]") 
    private WebElement assetAuto_Checker_Id;
    public WebElement assetAuto_Checker_Id() {
        return assetAuto_Checker_Id;
    } 
    @FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
    private WebElement assetAutomakerRemarkSubmit;
    public WebElement assetAutomakerRemarkSubmit() {
    	return assetAutomakerRemarkSubmit;
    }
    @FindBy(xpath="//ion-toggle[@role='switch']")
    private WebElement assetAutoStatusSwitchButton;
    public WebElement assetAutoStatusSwitchButton() {
    	return assetAutoStatusSwitchButton;
    }
    //*********************************************list view ****************************************//
    @FindBy(xpath="//button[@ng-reflect-text='Search']")
	private WebElement searchIcon;
	public WebElement searchIcon() {
		return searchIcon;
	}
	@FindBy(xpath = "//input[@mode='ios']") 
    private WebElement assetAutoViewSearchText;
    public WebElement assetAutoViewSearchText() {
        return assetAutoViewSearchText;
    } 
	@FindBy(xpath="//span[@ng-reflect-ng-class='pi pi-chevron-down']")
	private WebElement exportIcon;
	public WebElement exportIcon() {
		return exportIcon;
	} 
	@FindBy(xpath="//p-dropdownitem[@ng-reflect-label='PDF']//child::span")
	private WebElement pdfOption;
	public WebElement pdfOption() {
		return pdfOption;
	}
	@FindBy(xpath="//p-dropdownitem[@ng-reflect-label='XLS']//child::span")
	private WebElement xlsOption;
	public WebElement xlsOption() {
		return xlsOption;
	}
	@FindBy(xpath="//tr[1]/td[3]/p-celleditor[1]/span[1]")
	private WebElement assetCategoryInListView;
	public WebElement assetCategoryInListView() {
		return assetCategoryInListView;
	}
    @FindBy(xpath="//tr[1]/td[5]/p-celleditor[1]/span[1]")
    private WebElement assetTypeInListView;
    public WebElement assetTypeInListView() {
    	return assetTypeInListView;
    }
    @FindBy(xpath="//tr[1]/td[6]/p-celleditor[1]/span[1]")
    private WebElement remarkInListView;
    public WebElement remarkInListView() {
    	return remarkInListView;
    }
    //******************************************Checker x path********************************************//
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
    @FindBy(xpath = "//kub-workflow-decision//child::button[@label='Reject']") 
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
    @FindBy(xpath = "//kub-workflow-decision//child::button[@label='Return']") 
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
    @FindBy(xpath="//div[@role='alert']")
    private WebElement checkerApproveMgs;
    public WebElement checkerApproveMgs() {
    	return checkerApproveMgs;
    }
    
  //**********************************************Asset Modal Master ****************************************************
    @FindBy(xpath="//ion-label[contains(text(),'Asset Model Master')]//parent::ion-segment-button")
    private WebElement assetModelMaster;
    public WebElement assetModelMaster() {
    	return assetModelMaster;
    }
    @FindBy(xpath="//ion-label[text()=' Asset Model ']/following-sibling::ion-input/child::input")
    private WebElement assetModel;
    public WebElement assetModel() {
    	return assetModel;
    }
    @FindBy(xpath="//ion-label[text()=' Model Year ']/following-sibling::ion-input/child::input")
    private WebElement modelYear;
    public WebElement modelYear() {
    	return modelYear;
    }
    @FindBy(xpath="//ion-label[text()=' Volume Of Engine ']/following-sibling::ion-input/child::input")
    private WebElement volumeOfEngine;
    public WebElement volumeOfEngine() {
    	return volumeOfEngine;
    }
    @FindBy(xpath="//ion-label[text()=' Down Payment % ']/following-sibling::ion-input/child::input")
    private WebElement downPaymentPercentage;
    public WebElement downPaymentPercentage() {
    	return downPaymentPercentage;
    }
    @FindBy(xpath="//ion-label[text()=' Residual Value % ']/following-sibling::ion-input/child::input")
    private WebElement residualValuePercentage;
    public WebElement residualValuePercentage() {
    	return residualValuePercentage;
    }
    @FindBy(xpath="//ion-label[text()=' Remarks ' ]/following-sibling::ion-textarea//child::textarea")
    private WebElement remarksInAssetModelMaster;
    public WebElement remarksInAssetModelMaster() {
    	return remarksInAssetModelMaster;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Asset Model Type *']")
    private WebElement assetModelType;
    public WebElement assetModelType() {
    	return assetModelType;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Asset Condition *']")
    private WebElement assetCondition;
    public WebElement assetCondition() {
    	return assetCondition;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Drivetrain ']")
    private WebElement driveTrain;
    public WebElement driveTrain() {
    	return driveTrain;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Country *']")
    private WebElement countryInAssetModelMaster;
    public WebElement countryInAssetModelMaster() {
    	return countryInAssetModelMaster;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  No Of Cylinder *']")
    private WebElement noOfCylinder;
    public WebElement noOfCylinder() {
    	return noOfCylinder;
    }
}
