package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KULS_SubProductMaster_Update_CheckerReturnObj {
	
	WebDriver driver;
	public KULS_SubProductMaster_Update_CheckerReturnObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIcon;
	public WebElement searchIcon() {
		return searchIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-user-edit']")
	private WebElement actionIcon;
	public WebElement actionIcon() {
		return actionIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-label='Return']")
	private WebElement returnIcon;
	public WebElement returnIcon() {
		return returnIcon;
	}
	
	@FindBy(xpath="(//ion-chip[@class='ng-star-inserted ios ion-activatable hydrated'])[1]")
	private WebElement remarksText;
	public WebElement remarksText() {
		return remarksText;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-replay']")
	private WebElement returnButtonInRemarks;
	public WebElement returnButtonInRemarks() {
		return returnButtonInRemarks;
	}
	@FindBy(xpath="//ion-item[@ng-reflect-text='Inbox']")
	private WebElement checkerInbox;
	public WebElement checkerInbox() {
		return checkerInbox;
	}
	
	@FindBy(xpath="//ion-button[@ng-reflect-text='Menu']")
	private WebElement menuIcon;
	public WebElement menuIcon() {
		return menuIcon;
	}
}
