package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerEmploymentObj {
	WebDriver driver;
	public CustomerEmploymentObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement customerEmployment_Maker_MenuToggle;

	public WebElement customerEmployment_Maker_MenuToggle() {
		return customerEmployment_Maker_MenuToggle;
	}
	
	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement customerEmployment_Inbox;

	public WebElement customerEmployment_Inbox() {
		return customerEmployment_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement customerEmployment_SearchInbox;

	public WebElement customerEmployment_SearchInbox() {
		return customerEmployment_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement customerEmployment_SearchInboxInputField;

	public WebElement customerEmployment_SearchInboxInputField() {
		return customerEmployment_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement customerEmployment_SearchInboxCloseButton;

	public WebElement propertyDetails_SearchInboxCloseButton() {
		return customerEmployment_SearchInboxCloseButton;
	}
	
	// search button
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement customerEmployment_SearchButton;

	public WebElement customerEmployment_SearchButton() {
		return customerEmployment_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div[3]/span/input")
	private WebElement customerEmployment_SearchInputField;

	public WebElement customerEmployment_SearchInputField() {
		return customerEmployment_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement customerEmployment_SearchCloseButton;

	public WebElement customerEmployment_SearchCloseButton() {
		return customerEmployment_SearchCloseButton;
	}
	
	// customer financial tab button
	@FindBy(xpath = "//ion-modal[1]/descendant::ion-segment-button[@id='seg4']")
	private WebElement customerEmployment_CustomerFinancialTab;
	
	public WebElement customerEmployment_CustomerFinancialTab() {
		return customerEmployment_CustomerFinancialTab;
	}
	
	// Customer Employment first record edit button
	@FindBy(xpath = "//ion-title[contains(text(),' Customer Employment List ')]/../../ion-card-content/descendant::tbody/tr/td[1]/span/button[1]")
	private WebElement customerEmployment_CustomerEmploymentFirstRecordEdit;
	
	public WebElement customerEmployment_CustomerEmploymentFirstRecordEdit() {
		return customerEmployment_CustomerEmploymentFirstRecordEdit;
	}
	
	@FindBy(xpath = " //ion-label[text()=' Employee ID ']//following-sibling::ion-input/input")
	private WebElement customerEmployment_EmployeeID;

	public WebElement customerEmployment_EmployeeID() {
		return customerEmployment_EmployeeID;
	}
	

	//Save button
	@FindBy(xpath = "//ion-col[3]/button[1]/span[1]")
	private WebElement customerEmployment_SaveButton;
	
	public WebElement customerEmployment_SaveButton() {
		return customerEmployment_SaveButton;
	}
	
	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement customerEmployment_SaveConfirmationMessage;

	public WebElement customerEmployment_SaveConfirmationMessage() {
		return customerEmployment_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement customerEmployment_SaveConfirmationMessageCloseButton;

	public WebElement customerEmployment_SaveConfirmationMessageCloseButton() {
		return customerEmployment_SaveConfirmationMessageCloseButton;
	}
		
}