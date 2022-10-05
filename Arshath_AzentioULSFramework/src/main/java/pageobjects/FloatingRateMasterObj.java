package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingRateMasterObj {

	WebDriver driver;
	public FloatingRateMasterObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ion-label[text()='Floating rate master']//parent::ion-label//following-sibling::ion-buttons/ion-button[2]")
	private WebElement floatingMaster_EyeIcon1;
	public WebElement floatingMaster_EyeIcon() {
		return floatingMaster_EyeIcon1;
	}

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement floatingMaster_AddButton1;
	public WebElement floatingMaster_AddButton() {
		return floatingMaster_AddButton1;
	}
	@FindBy(xpath = "//ion-label[text()='Status ']//parent::div//following-sibling::ion-item//child::ion-toggle")
	private WebElement floatingMaster_ActiveInactive1;

	public WebElement floatingMaster_ActiveInactive() {
		return floatingMaster_ActiveInactive1;
	}

	@FindBy(xpath = "(//span[text()='In-active']//ancestor::p-tag//ancestor::p-celleditor//ancestor::td//preceding-sibling::td//preceding-sibling::td//preceding-sibling::td//child::button)[1]")
	private WebElement floatingMaster_ActionIconOfactiverecord1;

	public WebElement floatingMaster_ActionIconOfactiverecord() {
		return floatingMaster_ActionIconOfactiverecord1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement floatingMaster_BackButton1;

	public WebElement floatingMaster_BackButton() {
		return floatingMaster_BackButton1;
	}

	@FindBy(xpath = "//ion-label[text()='Floating rate master']//parent::ion-label//following-sibling::ion-buttons/ion-button[1]")
	private WebElement floatingMaster_tempviewbuttonButton1;

	public WebElement floatingMaster_tempviewbuttonButton() {
		return floatingMaster_tempviewbuttonButton1;
	}

	@FindBy(xpath = "(//span[text()='Active']//ancestor::p-tag//ancestor::p-celleditor//ancestor::td//preceding-sibling::td//preceding-sibling::td//preceding-sibling::td//child::button)[1]")
	private WebElement floatingMaster_TempViewactiverecord1;

	public WebElement floatingMaster_TempViewactiverecord() {
		return floatingMaster_TempViewactiverecord1;
	}
	
	
}
