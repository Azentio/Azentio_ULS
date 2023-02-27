package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KULS_CommonWebElements {
	WebDriver driver;

	public KULS_CommonWebElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-icon[@name='mail-unread-outline']")
	private WebElement uls_MailBox;

	public WebElement ulsMailBox() {
		return uls_MailBox;
	}
	@FindBy(xpath = "//button[starts-with(@class,'p-datepicker-month')]")
	private WebElement calendar_MonthField;

	public WebElement calendarMonthField() {
		return calendar_MonthField;
	}

	@FindBy(xpath = "//button[starts-with(@class,'p-datepicker-year')]")
	private WebElement calendar_YearField;

	public WebElement calendarYearField() {
		return calendar_YearField;
	}
	@FindBy(xpath="//span[text()='Today']//parent::button")
	private WebElement calendar_TodayDateButton;
	public WebElement calendarTodayDateButton()
	{
		return calendar_TodayDateButton;
	}
	@FindBy(xpath = "(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement uls_MailBoxFirstRecord;

	public WebElement ulsMailBoxFirstRecord() {
		return uls_MailBoxFirstRecord;
	}
	@FindBy(xpath="(//div[starts-with(@class,'p-datepicker-header')]//button[1])[1]")
	private WebElement calendar_PreviousButton;

	public WebElement calendarPreviousButton() {
		return calendar_PreviousButton;
	}	
	@FindBy(xpath="(//div[starts-with(@class,'p-datepicker-header')]//button[2])[2]")
	private WebElement calendar_NextButton;

	public WebElement calendarNextButton() {
		return calendar_NextButton;
	}	
	@FindBy(xpath = "//ion-label[text()='Customer details']//parent::ion-segment-button")
	private WebElement uls_CustomerDetailsTab;

	public WebElement ulsCustomerDetailsTab() {
		return uls_CustomerDetailsTab;
	}

	@FindBy(xpath = "//ion-title[text()=' Search Customer ']/parent::div//button[text()='Search ']")
	private WebElement uls_SearchButton;

	public WebElement ulsSearchButton() {
		return uls_SearchButton;
	}

	@FindBy(xpath = "//ion-title[text()=' Search Customer ']/parent::div//button[text()='Clear ']")
	private WebElement uls_ClearButton;

	public WebElement ulsClearButton() {
		return uls_ClearButton;
	}
    @FindBy(xpath="//button[text()='Create New Request ']")
    private WebElement uls_CreateNewRequestButton;
    public WebElement ulsCreateNewRequestButton()
    {
    	return uls_CreateNewRequestButton;
    }
    @FindBy(xpath="//button[@ng-reflect-text='Save']")
    private WebElement uls_SaveButton;
    public WebElement ulsSaveButton()
    {
    	return uls_SaveButton;
    }
    @FindBy(xpath="//app-inbox[1]//ion-grid[1]/ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
    private WebElement uls_notificationSearchButton;
    public WebElement ulsNotificationSerachButton()
    {
    	return uls_notificationSearchButton;
    }
    @FindBy(xpath="//span[text()=' Inbox ']//parent::div//following-sibling::span//input")
    private WebElement uls_notificationSearchTextBox;
    public WebElement ulsNotificationSearchTextBox()
    {
    	return uls_notificationSearchTextBox;
    }
    @FindBy(xpath="//table//tr[5]//td[4]")
    private WebElement uls_NotificationRecordStageCode;
    public WebElement ulsNotificationRecordStageCode()
    {
    	return uls_NotificationRecordStageCode;
    }
    @FindBy(xpath="//table//tbody//tr[1]//td[2]//span")
    private WebElement uls_NotificationFirstReferenceNumber;
    public WebElement ulsNotificationFirstReferenceNumber()
    {
    	return uls_NotificationFirstReferenceNumber;
    }
    @FindBy(xpath="//table//tbody//tr[1]//td[1]//button")
    private WebElement uls_NotificationFirstRecord;
    public WebElement ulsNotificationFirstRecord()
    {
    	return uls_NotificationFirstRecord;
    }
    @FindBy(xpath="//button[@ng-reflect-text='Add']")
    private WebElement uls_NotificationAddButton;
    public WebElement ulsNotificationAddButton()
    {
    	return uls_NotificationAddButton;
    }
    @FindBy(xpath="//ion-label[text()='Customer details']//parent::ion-segment-button")
    private WebElement uls_CustomerDetailsTabnewApp;
    public WebElement ulsCustomerDetailsTabnewApp()
    {
    	return uls_CustomerDetailsTabnewApp;
    }
    @FindBy(xpath="//div[@id='toast-container']/div/div[1]")
    private WebElement uls_toastAlert;
    public WebElement ulsToastAlert()
    {
    	return uls_toastAlert;
    }
    @FindBy(xpath="//div[@id='toast-container']//button[@aria-label='Close']")
    private WebElement uls_toastAlertClose;
    public WebElement ulsToastAlertClose()
    {
    	return uls_toastAlertClose;
    }
    @FindBy(xpath="//ion-label[text()='Additional Customer Info']//parent::ion-segment-button")
    private WebElement uls_AdditionalCustomerInfoTab;
    public WebElement ulsAdditionalCustomerInfo()
    {
    	return uls_AdditionalCustomerInfoTab;
    }
    @FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")
    private WebElement uls_CustomerPersonalDetailsListViewFirstRecord;
    public WebElement ulsCustomerPersonalDetailsListViewFirstRecord()
    {
    	return uls_CustomerPersonalDetailsListViewFirstRecord;
    }
    @FindBy(xpath="//ion-title[text()=' References List View ']//ancestor::ion-card//button[@ng-reflect-text='Add']")
    private WebElement uls_ReferenceListViewAddButton;
    public WebElement ulsReferenceListViewAddButton()
    {
    	return uls_ReferenceListViewAddButton;
    }
    @FindBy(xpath="//button[@label='Submit']")
    private WebElement uls_SubmitButton;
    public WebElement ulsSubmitButton()
    {
    return 	uls_SubmitButton;
    }
    @FindBy(xpath="//textarea")
    private WebElement  uls_AlertRemark;
    public WebElement ulsAlertRemark()
    {
    	return uls_AlertRemark;
    }
    @FindBy(xpath="//ion-col//button[@icon='pi pi-send']")
    private WebElement uls_AlertSubmitButton;
    public WebElement ulsAlertSubmitButton()
    {
    	return uls_AlertSubmitButton;
    }
    
}
