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

	@FindBy(xpath = "(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement uls_MailBoxFirstRecord;

	public WebElement ulsMailBoxFirstRecord() {
		return uls_MailBoxFirstRecord;
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
    @FindBy(xpath="(//button[@ng-reflect-text='Search'])[1]")
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
  //  @FindBy(xpath="")
    
}
