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

	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement ConfigManager;

	public WebElement ConfigManager() {
		return ConfigManager;
	}
	@FindBy(xpath = "//ion-label[contains(text(),'Warehouse Master')]/parent::ion-item[1]//ion-buttons[1]/ion-button[2]")
	private WebElement Warehouse_Edit_Icon;

	public WebElement Warehouse_Edit_Icon() {
		return Warehouse_Edit_Icon;
	}
	@FindBy(xpath = "//ion-label[contains(text(),'Warehouse Master')]/parent::ion-item[1]//ion-buttons[1]/ion-button[1]")
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

  
}
