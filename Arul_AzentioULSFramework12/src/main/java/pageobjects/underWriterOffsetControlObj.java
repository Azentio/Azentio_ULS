package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class underWriterOffsetControlObj {
	WebDriver driver;
	public underWriterOffsetControlObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@ng-reflect-text='View Summary']")
	private WebElement viewSummaryIconOfUnderWriterOffsetControl;
	public WebElement viewSummaryIconOfUnderWriterOffsetControl() {
		return viewSummaryIconOfUnderWriterOffsetControl;
	}
	
	@FindBy(xpath="//ionic-title[contains(text(),'  Transaction summary ')]")
	private WebElement viewSummaryPageOfUnderWriterOffsetControl;
	public WebElement viewSummaryPageOfUnderWriterOffsetControl() {
		return viewSummaryPageOfUnderWriterOffsetControl;
	}
	@FindBy(xpath="//ion-button[@ng-reflect-expand='block']")
	private WebElement closeIconInViewSummaryPageOfUnderWriterOffsetControl;
	public WebElement closeIconInViewSummaryPageOfUnderWriterOffsetControl() {
		return closeIconInViewSummaryPageOfUnderWriterOffsetControl;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIconOfUnderWriterOffsetControl;
	public WebElement searchIconOfUnderWriterOffsetControl() {
		return searchIconOfUnderWriterOffsetControl;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement searchTextFieldOfUnderWriterOffsetControl;
	public WebElement searchTextFieldOfUnderWriterOffsetControl() {
	return searchTextFieldOfUnderWriterOffsetControl;
	}

	@FindBy(xpath="//input[@mode='ios']/parent::span//i")
	private WebElement clearIconInSearchFieldOfUnderWriterOffsetControl;
	public WebElement clearIconInSearchFieldOfUnderWriterOffsetControl() {
	return clearIconInSearchFieldOfUnderWriterOffsetControl;
	}
	@FindBy(xpath="//span[text()='Export']")
	private WebElement exportIconOfUnderWriterOffsetControl;
	public WebElement exportIconOfUnderWriterOffsetControl() {
		return exportIconOfUnderWriterOffsetControl;
	}	
	@FindBy(xpath="//li[@aria-label='PDF']")
	private WebElement exportToPDFOfUnderWriterOffsetControl;
	public WebElement exportToPDFOfUnderWriterOffsetControl() {
		return exportToPDFOfUnderWriterOffsetControl;
	}	
	@FindBy(xpath="//li[@aria-label='XLS']")
	private WebElement exportToExcelOfUnderWriterOffsetControl;
	public WebElement exportToExcelOfUnderWriterOffsetControl() {
		return exportToExcelOfUnderWriterOffsetControl;
	
	}

	@FindBy(xpath="//ion-label[text()='UnderwriterOffsetControl']//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement TempViewIconOfUnderWriterOffsetControl;
	public WebElement TempViewIconOfUnderWriterOffsetControl() {
		return TempViewIconOfUnderWriterOffsetControl;
	}
	@FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement pencilIconOfFirstRecordInUnderWriterOffsetControl;
	public WebElement pencilIconOfFirstRecordInUnderWriterOffsetControl() {
		return pencilIconOfFirstRecordInUnderWriterOffsetControl;
	}
	@FindBy(xpath="//h4[contains(text(),'Business Rules')]")
	private WebElement BusinessRulesInLeftPanel;
	public WebElement BusinessRulesInLeftPanel() {
		return BusinessRulesInLeftPanel;
	}
	@FindBy(xpath = "//ion-label[text()='UnderwriterOffsetControl']//following-sibling::ion-buttons//child::ion-button[2]") 
    private WebElement ViewIconOfListViewInUnderWriterOffsetControl;
    public WebElement ViewIconOfListViewInUnderWriterOffsetControl() {
        return ViewIconOfListViewInUnderWriterOffsetControl;
    }
    @FindBy(xpath="//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement UnderWriterOffsetControlAddIcon;
	public WebElement UnderWriterOffsetControlAddIcon() {
		return UnderWriterOffsetControlAddIcon;
	}
	@FindBy(xpath="//span[contains(text(),'Configurations')]")
	private WebElement configurationInLeftPanel;
	public WebElement configurationInLeftPanel() {
		return configurationInLeftPanel;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'Business Rules')]")
	private WebElement businessRulesInLeftPanel;
	public WebElement businessRulesInLeftPanel() {
		return businessRulesInLeftPanel;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-arrow-left']")
	private WebElement underwriteroffsetcontrolBackIcon;
	public WebElement underwriteroffsetcontrolBackIcon() {
		return underwriteroffsetcontrolBackIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement underwriteroffsetcontrolSaveIcon;
	public WebElement underwriteroffsetcontrolSaveIcon() {
		return underwriteroffsetcontrolSaveIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Minimum Value ')]")
	private WebElement underwriteroffsetcontrolMinimumValueField;
	public WebElement underwriteroffsetcontrolMinimumValueField() {
		return underwriteroffsetcontrolMinimumValueField;
	}
}


