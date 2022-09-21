package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDocumentDetailsObj {
	WebDriver driver;
	public CustomerDocumentDetailsObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement customerDocumentDetails_Maker_MenuToggle;

	public WebElement customerDocumentDetails_Maker_MenuToggle() {
		return customerDocumentDetails_Maker_MenuToggle;
	}
	
	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement customerDocumentDetails_Inbox;

	public WebElement customerDocumentDetails_Inbox() {
		return customerDocumentDetails_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement customerDocumentDetails_SearchInbox;

	public WebElement customerDocumentDetails_SearchInbox() {
		return customerDocumentDetails_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement customerDocumentDetails_SearchInboxInputField;

	public WebElement customerDocumentDetails_SearchInboxInputField() {
		return customerDocumentDetails_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement customerDocumentDetails_SearchInboxCloseButton;

	public WebElement customerDocumentDetails_SearchInboxCloseButton() {
		return customerDocumentDetails_SearchInboxCloseButton;
	}
	
	// search button
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement customerDocumentDetails_SearchButton;

	public WebElement customerDocumentDetails_SearchButton() {
		return customerDocumentDetails_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div[3]/span/input")
	private WebElement customerDocumentDetails_SearchInputField;

	public WebElement customerDocumentDetails_SearchInputField() {
		return customerDocumentDetails_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement customerDocumentDetails_SearchCloseButton;

	public WebElement customerDocumentDetails_SearchCloseButton() {
		return customerDocumentDetails_SearchCloseButton;
	}
	
	// customer financial tab button
	@FindBy(xpath = "//ion-segment-button[@id='seg6']")
	private WebElement customerDocumentDetails_DocumentDetailTab;
	
	public WebElement customerDocumentDetails_DocumentDetailTab() {
		return customerDocumentDetails_DocumentDetailTab;
	}
	
	// Customer Employment first record edit button
	@FindBy(xpath = "//ion-title[contains(text(),' Document Details ')]/../../ion-card-content/descendant::tbody/tr/td[1]/span/button[1]")
	private WebElement customerDocumentDetails_DocumentDetailFirstRecordEdit;
	
	public WebElement customerDocumentDetails_DocumentDetailFirstRecordEdit() {
		return customerDocumentDetails_DocumentDetailFirstRecordEdit;
	}
	
	// Document Name
	@FindBy(xpath = "//ion-label[contains(text(),' Document Name')]/../ion-select")
	private WebElement customerDocumentDetails_DocumentName;
	
	public WebElement customerDocumentDetails_DocumentName() {
		return customerDocumentDetails_DocumentName;
	}
	
	// Mandatory/Optional
	@FindBy(xpath = "//ion-label[contains(text(),'Mandatory/Optional')]/../ion-select")
	private WebElement customerDocumentDetails_MandatoryOrOptional;
	
	public WebElement customerDocumentDetails_MandatoryOrOptional() {
		return customerDocumentDetails_MandatoryOrOptional;
	}
	
	// Document Category
	@FindBy(xpath = "//ion-label[contains(text(),'Document Category')]/../ion-select")
	private WebElement customerDocumentDetails_DocumentCategory;
	
	public WebElement customerDocumentDetails_DocumentCategory() {
		return customerDocumentDetails_DocumentCategory;
	}
	
	// Document Status
	@FindBy(xpath = "//ion-label[contains(text(),' Document Status')]/../ion-select")
	private WebElement customerDocumentDetails_DocumentStatus;
	
	public WebElement customerDocumentDetails_DocumentStatus() {
		return customerDocumentDetails_DocumentStatus;
	}
	

	//Save button
	@FindBy(xpath = "//ion-col[3]/button[1]/span[1]")
	private WebElement customerDocumentDetails_SaveButton;
	
	public WebElement customerDocumentDetails_SaveButton() {
		return customerDocumentDetails_SaveButton;
	}
	
	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement customerDocumentDetails_SaveConfirmationMessage;

	public WebElement customerDocumentDetails_SaveConfirmationMessage() {
		return customerDocumentDetails_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement customerDocumentDetails_SaveConfirmationMessageCloseButton;

	public WebElement customerDocumentDetails_SaveConfirmationMessageCloseButton() {
		return customerDocumentDetails_SaveConfirmationMessageCloseButton;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement customerDocumentDetails_AddButton;

	public WebElement customerDocumentDetails_AddButton() {
		return customerDocumentDetails_AddButton;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement customerDocumentDetails_BackButton;
	
	public WebElement customerDocumentDetails_BackButton() {
		return customerDocumentDetails_BackButton;
	}
		
}