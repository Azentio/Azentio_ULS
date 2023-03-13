package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KULS_SubProductMaster_Update_CheckerReturn {

	WebDriver driver;

	public KULS_SubProductMaster_Update_CheckerReturn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIcon;

	public WebElement searchIcon() {
		return searchIcon;
	}

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-user-edit']")
	private WebElement actionIcon;

	public WebElement actionIcon() {
		return actionIcon;
	}

	@FindBy(xpath = "//button[@ng-reflect-label='Return']")
	private WebElement returnIcon;

	public WebElement returnIcon() {
		return returnIcon;
	}

	@FindBy(xpath = "(//ion-chip[@class='ng-star-inserted ios ion-activatable hydrated'])[1]")
	private WebElement remarksText;

	public WebElement remarksText() {
		return remarksText;
	}

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-replay']")
	private WebElement returnButtonInRemarks;

	public WebElement returnButtonInRemarks() {
		return returnButtonInRemarks;
	}

	@FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']")
	private WebElement checkerInbox;

	public WebElement checkerInbox() {
		return checkerInbox;
	}

	@FindBy(xpath = "//ion-button[@ng-reflect-text='Menu']")
	private WebElement menuIcon;

	public WebElement menuIcon() {
		return menuIcon;
	}

	@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
	private WebElement ProductMaster_Product_Checker_Approve;

	public WebElement ProductMaster_Product_Checker_Approve() {
		return ProductMaster_Product_Checker_Approve;
	}

	@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
	private WebElement ProductMaster_Product_Checker_Reject;

	public WebElement ProductMaster_Product_Checker_Reject() {
		return ProductMaster_Product_Checker_Reject;
	}

	@FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]")
	private WebElement ProductMaster_Product_Checker_Return;

	public WebElement ProductMaster_Product_Checker_Return() {
		return ProductMaster_Product_Checker_Return;
	}
}
