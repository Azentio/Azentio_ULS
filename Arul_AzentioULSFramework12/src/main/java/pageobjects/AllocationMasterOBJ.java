package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class AllocationMasterOBJ {

	WebDriver driver;

	public AllocationMasterOBJ(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement ConfigManager;

	public WebElement ConfigManager() {
		return ConfigManager;
	}

	@FindBy(xpath = "(//ion-label[contains(text(),'Allocation')]//following-sibling::ion-buttons//child::ion-button)[2]")
	private WebElement AllocationMasterListViewIcon;

	public WebElement AllocationMasterListViewIcon() {
		return AllocationMasterListViewIcon;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement ActionEditIcon;

	public WebElement ActionEditIcon() {
		return ActionEditIcon;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Update']")
	private WebElement UpdateSave;

	public WebElement UpdateSave() {
		return UpdateSave;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Allocation Code')]//following-sibling::ion-input/input")
	private WebElement AllocationCode;

	public WebElement AllocationCode() {
		return AllocationCode;
	}

	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
	private WebElement mailicon;

	public WebElement mailicon() {
		return mailicon;
	}

	@FindBy(xpath = "(//div[@role='alert'])[2]")
	private WebElement makerconfirmmsg;

	public WebElement makerconfirmmsg() {
		return makerconfirmmsg;
	}

	@FindBy(xpath = "//span[text()='×']")
	private WebElement successcancel;

	public WebElement successcancel() {
		return successcancel;
	}

	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement searchiconreferenceid;

	public WebElement searchiconreferenceid() {
		return searchiconreferenceid;
	}

	@FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input")
	private WebElement searchsentkeys;

	public WebElement searchsentkeys() {
		return searchsentkeys;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement referenceid;

	public WebElement referenceid() {
		return referenceid;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement inboxediticon;

	public WebElement inboxediticon() {
		return inboxediticon;
	}

	@FindBy(xpath = "//button/span[contains(text(),'Submit')]")
	private WebElement submit;

	public WebElement submit() {
		return submit;
	}

	@FindBy(xpath = "(//button[@ng-reflect-label='Submit'])[2]")
	private WebElement popupsubmit;

	public WebElement popupsubmit() {
		return popupsubmit;
	}

	@FindBy(xpath = "//div[@id='toast-container']/div[1]")
	private WebElement ProductCheckerid;

	public WebElement ProductCheckerid() {
		return ProductCheckerid;
	}

}
