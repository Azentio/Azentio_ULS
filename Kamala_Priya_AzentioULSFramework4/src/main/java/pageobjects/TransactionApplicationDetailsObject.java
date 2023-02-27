package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransactionApplicationDetailsObject {
		WebDriver driver;
	public TransactionApplicationDetailsObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[contains(text(),'Transactions')]")
	private WebElement Transaction1;
	public WebElement Transaction() {
		return Transaction1;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Application manager')]")
	private WebElement ApplicationManager1;
	public WebElement ApplicationManager() {
		return ApplicationManager1;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Application Details')]//following-sibling::ion-buttons/ion-button[1]")
	private WebElement ApplicationDetails_EyeIcon1;
	public WebElement ApplicationDetails_EyeIcon() {
		return ApplicationDetails_EyeIcon1;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement ApplicationDetails_FirstPencilIcon1;
	public WebElement ApplicationDetails_FirstPencilIcon() {
		return ApplicationDetails_FirstPencilIcon1;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement ApplicationDetails_SaveButton1;
	public WebElement ApplicationDetails_SaveButton() {
		return ApplicationDetails_SaveButton1;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Servicing Entity *']")
	private WebElement ApplicationDetails_ServicingEntity1;
	public WebElement ApplicationDetails_ServicingEntity() {
		return ApplicationDetails_ServicingEntity1;
	}
	@FindBy(xpath="//ion-label[text()=' Select ']//following-sibling::ion-radio")
	private WebElement ApplicationDetails_ServicingEntity_Select1;
	public WebElement ApplicationDetails_ServicingEntity_Select() {
		return ApplicationDetails_ServicingEntity_Select1;
	}
}