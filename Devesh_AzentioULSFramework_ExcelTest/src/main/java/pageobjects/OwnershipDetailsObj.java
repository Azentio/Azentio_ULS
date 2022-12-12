package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnershipDetailsObj {
	WebDriver driver;

	public OwnershipDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement ownershipDetails_Maker_MenuToggle;

	public WebElement ownershipDetails_Maker_MenuToggle() {
		return ownershipDetails_Maker_MenuToggle;
	}


	@FindBy(xpath = "//ion-toolbar/ion-buttons[1]/ion-button[1]")
	private WebElement ownershipDetails_BackButton;

	public WebElement ownershipDetails_BackButton() {
		return ownershipDetails_BackButton;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Update']")
	private WebElement ownershipDetails_SaveButton;
	
	public WebElement ownershipDetails_SaveButton() {
		return ownershipDetails_SaveButton;
	}

	// inbox
	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
//	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement ownershipDetails_Inbox;

	public WebElement ownershipDetails_Inbox() {
		return ownershipDetails_Inbox;
	}
	
	// inbox screen
	@FindBy(xpath = "//span[text()=' Inbox ']")
	private WebElement ownershipDetails_InboxScreen;
	
	public WebElement ownershipDetails_InboxScreen() {
		return ownershipDetails_InboxScreen;
	}


	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement ownershipDetails_SearchInbox;

	public WebElement ownershipDetails_SearchInbox() {
		return ownershipDetails_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement ownershipDetails_SearchInboxInputField;

	public WebElement ownershipDetails_SearchInboxInputField() {
		return ownershipDetails_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement ownershipDetails_SearchInboxCloseButton;

	public WebElement ownershipDetails_SearchInboxCloseButton() {
		return ownershipDetails_SearchInboxCloseButton;
	}
	
	// OwnershipDetailTab
	@FindBy(xpath = "//ion-segment-button[@id='seg12']")
	private WebElement ownershipDetails_OwnershipDetailTab;
	
	public WebElement ownershipDetails_OwnershipDetailTab() {
		return ownershipDetails_OwnershipDetailTab;
	}
	
	// NextButton
	@FindBy(xpath = "//ion-modal/descendant::button[2]")
	private WebElement ownershipDetails_NextButton;
	
	public WebElement ownershipDetails_NextButton() {
		return ownershipDetails_NextButton;
	}
	
	// ApplicationDetailTab
	@FindBy(xpath = "//ion-segment-button[@id='seg1']")
	private WebElement ownershipDetails_ApplicationDetailTab;
	
	public WebElement ownershipDetails_ApplicationDetailTab() {
		return ownershipDetails_ApplicationDetailTab;
	}
	
	// Owner/Power Of Attorney Details
	@FindBy(xpath = "//ion-label[contains(text(),' Owner/Power Of Attorney Details ')]/../ion-select")
	private WebElement ownershipDetails_OwnerOrPowerOfAttorney;
	
	public WebElement ownershipDetails_OwnerOrPowerOfAttorney() {
		return ownershipDetails_OwnerOrPowerOfAttorney;
	}
	
	// Name
	@FindBy(xpath = "//ion-label[contains(text(),' Name ')]/../ion-input")
	private WebElement ownershipDetails_Name;
	
	public WebElement ownershipDetails_Name() {
		return ownershipDetails_Name;
	}
	
	// Id Type
	@FindBy(xpath = "//ion-label[contains(text(),'Id Type')]/../ion-select")
	private WebElement ownershipDetails_IdType;
	
	public WebElement ownershipDetails_IdType() {
		return ownershipDetails_IdType;
	}
	
	// Id Number
	@FindBy(xpath = "//ion-label[contains(text(),'Id Number')]/../ion-input")
	private WebElement ownershipDetails_IdNumber;
	
	public WebElement ownershipDetails_IdNumber() {
		return ownershipDetails_IdNumber;
	}
	
	// Issue Date
	@FindBy(xpath = "//ion-label[contains(text(),'Issue Date')]/ancestor::ion-item/p-calendar")
	private WebElement ownershipDetails_IssueDate;
	
	public WebElement ownershipDetails_IssueDate() {
		return ownershipDetails_IssueDate;
	}
	
	// Issue Place
	@FindBy(xpath = "//ion-label[contains(text(),'Issue Place')]/../ion-input")
	private WebElement ownershipDetails_IssuePlace;
	
	public WebElement ownershipDetails_IssuePlace() {
		return ownershipDetails_IssuePlace;
	}
	
	// City
	@FindBy(xpath = "//ion-label[contains(text(),'City')]/../ion-select")
	private WebElement ownershipDetails_City;
	
	public WebElement ownershipDetails_City() {
		return ownershipDetails_City;
	}
	
	// Mobile
	@FindBy(xpath = "//ion-label[text()=' Mobile ']/../ion-input")
	private WebElement ownershipDetails_Mobile;
	
	public WebElement ownershipDetails_Mobile() {
		return ownershipDetails_Mobile;
	}
	
	// Mobile 2
	@FindBy(xpath = "//ion-label[text()=' Mobile 2 ']/../ion-input")
	private WebElement ownershipDetails_Mobile2;
	
	public WebElement ownershipDetails_Mobile2() {
		return ownershipDetails_Mobile2;
	}
	
	// Phone
	@FindBy(xpath = "//ion-label[contains(text(),'Phone')]/../ion-input")
	private WebElement ownershipDetails_Phone;
	
	public WebElement ownershipDetails_Phone() {
		return ownershipDetails_Phone;
	}
	
	// Fax
	@FindBy(xpath = "//ion-label[contains(text(),'Fax')]/../ion-input")
	private WebElement ownershipDetails_Fax;
	
	public WebElement ownershipDetails_Fax() {
		return ownershipDetails_Fax;
	}
	
	// Email
	@FindBy(xpath = "//ion-label[contains(text(),'Email')]/../ion-input")
	private WebElement ownershipDetails_Email;
	
	public WebElement ownershipDetails_Email() {
		return ownershipDetails_Email;
	}
	
}
