package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allocation_MstObj {

	WebDriver driver;

	public Allocation_MstObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[text()='Allocation Master']//parent::ion-item//following-sibling::ion-buttons/ion-button[2]")
	private WebElement AllocationMaster_EyeIcon1;

	public WebElement AllocationMaster_EyeIcon() {
		return AllocationMaster_EyeIcon1;
	}

	@FindBy(xpath = "//ion-label[text()='Allocation Master']//parent::ion-item//following-sibling::ion-buttons/ion-button[1]")
	private WebElement AllocationMaster_TempViewButton1;

	public WebElement AllocationMaster_TempViewButton() {
		return AllocationMaster_TempViewButton1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement AllocationMaster_AddButton1;

	public WebElement AllocationMaster_AddButton() {
		return AllocationMaster_AddButton1;
	}

	@FindBy(xpath = "//ion-col[1]/ion-card[1]/ion-card-content[1]//div[3]/span[1]/button[1]")
	private WebElement Allocation_SearchIcon;

	public WebElement AllocationSearchIcon() {
		return Allocation_SearchIcon;
	}

	@FindBy(xpath = "//input[@mode='ios']")
	private WebElement Allocation_SearchTextBox;

	public WebElement AllocationSearchTextBox() {
		return Allocation_SearchTextBox;
	}

	@FindBy(xpath = "//span[text()='Export']")
	private WebElement Allocation_ExportButton;

	public WebElement AllocationExportButton() {
		return Allocation_ExportButton;
	}

	@FindBy(xpath = "//li[@aria-label='PDF']")
	private WebElement Allocation_ExportPDFOption;

	public WebElement AllocationExportPDFOption() {
		return Allocation_ExportPDFOption;
	}

	@FindBy(xpath = "//li[@aria-label='XLS']")
	private WebElement Allocation_ExportXLSOption;

	public WebElement AllocationExportXLSOption() {
		return Allocation_ExportXLSOption;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement Allocation_BackButton;

	public WebElement AllocationBackButton() {
		return Allocation_BackButton;
	}

	@FindBy(xpath = "//input[@mode='ios']/parent::span/i")
	private WebElement Allocation_TextBoxCloseButton;

	public WebElement AllocationTextBoxCloseButton() {
		return Allocation_TextBoxCloseButton;
	}

}
