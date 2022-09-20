package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails_DisbursementCheckerObj {
	WebDriver driver;

	public PersonalDetails_DisbursementCheckerObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// ------------------------MAKER STAGE PAGEOBJECTS----------------------//

	@FindBy(xpath = "//span[contains(text(),'Transactions')]")
	private WebElement Transactions;

	public WebElement Transactions() {
		return Transactions;
	}

	// Application_Manager
	@FindBy(xpath = "//ion-label[contains(text(),'Application manager')]")
	private WebElement Application_Manager;

	public WebElement Application_Manager() {
		return Application_Manager;
	}

	// Application Details
	@FindBy(xpath = "(//ion-accordion[1]/ion-list[1]/ion-item[5]/ion-buttons[1]/ion-button[1])[2]")
	private WebElement Application_Details;

	public WebElement Application_Details() {
		return Application_Details;
	}

	// Search Icon
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement PDDC_SearchIcon;

	public WebElement PDDC_SearchIcon() {
		return PDDC_SearchIcon;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement PDDC_SearchInputField;

	public WebElement PDDC_SearchInputField() {
		return PDDC_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement PDDC_SearchCloseButton;

	public WebElement PDDC_SearchCloseButton() {
		return PDDC_SearchCloseButton;
	}

	// Add Button
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement PDDC_AddButton;

	public WebElement PDDC_AddButton() {
		return PDDC_AddButton;
	}

	// ListView Back Button
	@FindBy(xpath = "//ion-toolbar[1]/ion-buttons[1]/ion-button[1]")
	private WebElement PDDC_CustomerDetails_ListView_BackButton;

	public WebElement PDDC_CustomerDetails_ListView_BackButton() {
		return PDDC_CustomerDetails_ListView_BackButton;
	}

	// Back Button
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement PDDC_CustomerDetails_BackButton;

	public WebElement PDDC_CustomerDetails_BackButton() {
		return PDDC_CustomerDetails_BackButton;
	}

}
