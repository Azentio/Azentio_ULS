package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LivingExpenseObj {
	WebDriver driver;
	public LivingExpenseObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement LivingExpense_pencilIconOfFirstRecord;
	public WebElement LivingExpense_pencilIconOfFirstRecord() {
		return LivingExpense_pencilIconOfFirstRecord;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement LivingExpenseAddIcon;
	public WebElement LivingExpenseAddIcon() {
		return LivingExpenseAddIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-arrow-left']")
	private WebElement LivingExpenseBackIcon;
	public WebElement LivingExpenseBackIcon() {
		return LivingExpenseBackIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIconOfLivingExpense;
	public WebElement searchIconOfLivingExpense() {
		return searchIconOfLivingExpense;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement searchTextFieldOfLivingExpense;
	public WebElement searchTextFieldOfLivingExpense() {
	return searchTextFieldOfLivingExpense;
	}
	@FindBy(xpath="//input[@mode='ios']/parent::span//i")
	private WebElement clearIconInSearchFieldOfLivingExpense;
	public WebElement clearIconInSearchFieldOfLivingExpense() {
	return clearIconInSearchFieldOfLivingExpense;
	}
	@FindBy(xpath="//span[text()='Export']")
	private WebElement exportIconOfLivingExpense;
	public WebElement exportIconOfLivingExpense() {
		return exportIconOfLivingExpense;
	}	
	@FindBy(xpath="//li[@aria-label='PDF']")
	private WebElement exportToPDFOfLivingExpense;
	public WebElement exportToPDFOfLivingExpense() {
		return exportToPDFOfLivingExpense;
	}	
	@FindBy(xpath="//li[@aria-label='XLS']")
	private WebElement exportToExcelOfLivingExpense;
	public WebElement exportToExcelOfLivingExpense() {
		return exportToExcelOfLivingExpense;
	}
	
	@FindBy(xpath="//span[contains(text(),'Configurations')]")
	private WebElement configurationInLeftPanel;
	public WebElement configurationInLeftPanel() {
		return configurationInLeftPanel;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Other Masters')]")
	private WebElement otherMasterInLeftPanel;
	public WebElement otherMasterInLeftPanel() {
		return otherMasterInLeftPanel;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'Living Expense')]//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement viewIconOfLivingExpense;
	public WebElement viewIconOfLivingExpense() {
		return viewIconOfLivingExpense;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Living Expense')]//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement tempViewOfLivingExpense;
	public WebElement tempViewOfLivingExpense() {
		return tempViewOfLivingExpense;
	}
	
	@FindBy(xpath="//ion-icon[@aria-label='menu']")
	private WebElement menuBarInHomePage;
	public WebElement menuBarInHomePage() {
		return menuBarInHomePage;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'Living Expense Location')]")
	private WebElement LivingExpenseLocationButton;
	public WebElement LivingExpenseLocationButton() {
		return LivingExpenseLocationButton;
	}
	
	@FindBy(xpath="//ion-select[@aria-label='Select,   Country *']")
	private WebElement LivingExpenseLocation_CountryField;
	public WebElement LivingExpenseLocation_CountryField() {
		return LivingExpenseLocation_CountryField;
	}
	
	@FindBy(xpath="//ion-select[@aria-label='Select,   Province *']")
	private WebElement LivingExpenseLocation_ProvinceField;
	public WebElement LivingExpenseLocation_ProvinceField() {
		return LivingExpenseLocation_ProvinceField;
	}
	@FindBy(xpath="//ion-label[contains(text(),'  Area Factor Income ')]//following-sibling::ion-input/input")
	private WebElement LivingExpenseLocation_AreaFactorIncomeField;
	public WebElement LivingExpenseLocation_AreaFactorIncomeField() {
		return LivingExpenseLocation_AreaFactorIncomeField;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),' Area Factor Expenditure ')]//following-sibling::ion-input/input")
	private WebElement LivingExpenseLocation_AreaFactorExpenditurefield;
	public WebElement LivingExpenseLocation_AreaFactorExpenditurefield() {
		return LivingExpenseLocation_AreaFactorExpenditurefield;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement LivingExpenseSaveIcon;
	public WebElement LivingExpenseSaveIcon() {
		return LivingExpenseSaveIcon;
	}
	@FindBy(xpath="(//div[@role='alert'])[2]")
	private WebElement LivingExpensesubmitSuccessPopup;
	public WebElement LivingExpensesubmitSuccessPopup() {
		return LivingExpensesubmitSuccessPopup;
	}
	@FindBy(xpath="//button[@aria-label='Close']")
	private WebElement closeIconInSuccessPopupOfLivingexpense;
	public WebElement closeIconInSuccessPopupOfLivingexpense() {
		return closeIconInSuccessPopupOfLivingexpense;
	}
	@FindBy(xpath = "//button/span[contains(text(),'Submit')]") 
    private WebElement LivingExpenseMaker_Submit;
    public WebElement LivingExpenseMaker_Submit() {
        return LivingExpenseMaker_Submit;
    }
    @FindBy(xpath = "//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea") 
    private WebElement LivingExpenseMakerMaker_EnterRemark;
    public WebElement LivingExpenseMakerMaker_EnterRemark() {
        return LivingExpenseMakerMaker_EnterRemark;
    }
    @FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
    private WebElement LivingExpensemakerRemarkSubmit;
    public WebElement LivingExpensemakerRemarkSubmit() {
    	return LivingExpensemakerRemarkSubmit;
    }
    @FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") 
    private WebElement LivingExpense_Inbox;
    public WebElement LivingExpense_Inbox() {
        return LivingExpense_Inbox;
    }
    @FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]") 
    private WebElement LivingExpenseInboxView_Search;
    public WebElement LivingExpenseInboxView_Search() {
        return LivingExpenseInboxView_Search;
    }  
    @FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input") 
    private WebElement LivingExpenseInboxView_SearchText;
    public WebElement LivingExpenseInboxView_SearchText() {
        return LivingExpenseInboxView_SearchText;
    }  
    @FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]") 
    private WebElement LivingExpenseReferanceId;
    public WebElement LivingExpenseReferanceId() {
        return LivingExpenseReferanceId;
    } 
	
}
