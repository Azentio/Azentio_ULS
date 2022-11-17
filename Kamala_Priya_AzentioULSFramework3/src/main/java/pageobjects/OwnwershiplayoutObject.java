package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OwnwershiplayoutObject {
	WebDriver driver;

	public OwnwershiplayoutObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	private WebElement NextButton1;
	public WebElement NextButton() {
		return NextButton1;
	}
	@FindBy(xpath = "//ion-segment-button[@id='seg12']")
	private WebElement OwnershipDetailsTab1;
	public WebElement OwnershipDetailsTab() {
		return OwnershipDetailsTab1;
	}
	@FindBy(xpath = "//ion-label[text()=' Owner/Power Of Attorney Details ']//following-sibling::ion-select")
	private WebElement OwnerDropdown1;
	public WebElement OwnerDropdown() {
		return OwnerDropdown1;
	}
	@FindBy(xpath = "//ion-label[text()=' Name ']//following-sibling::ion-input/input")
	private WebElement Name1;
	public WebElement Name() {
		return Name1;
	}
	@FindBy(xpath = "//ion-label[text()=' Id Number ']//following-sibling::ion-input/input")
	private WebElement IDNumber1;
	public WebElement IDNumber() {
		return IDNumber1;
	}
	@FindBy(xpath = "//ion-label[text()=' Issue Place ']//following-sibling::ion-input/input")
	private WebElement IssuePlace1;
	public WebElement IssuePlace() {
		return IssuePlace1;
	}
	@FindBy(xpath = "//ion-label[text()=' Mobile ']//following-sibling::ion-input/input")
	private WebElement Mobile1;
	public WebElement Mobile() {
		return Mobile1;
	}
	@FindBy(xpath = "//ion-label[text()=' Phone ']//following-sibling::ion-input/input")
	private WebElement Phone1;
	public WebElement Phone() {
		return Phone1;
	}
	@FindBy(xpath = "//ion-label[text()=' Mobile 2 ']//following-sibling::ion-input/input")
	private WebElement Mobile21;
	public WebElement Mobile2() {
		return Mobile21;
	}
	@FindBy(xpath = "//ion-label[text()=' Fax ']//following-sibling::ion-input/input")
	private WebElement Fax1;
	public WebElement Fax() {
		return Fax1;
	}
	@FindBy(xpath = "//ion-label[text()=' Email ']//following-sibling::ion-input/input")
	private WebElement Email1;
	public WebElement Email() {
		return Email1;
	}
	@FindBy(xpath = "//ion-label[text()=' Id Type ']//following-sibling::ion-select")
	private WebElement IDTypeDropdown1;
	public WebElement IDTypeDropdown() {
		return IDTypeDropdown1;
	}
	@FindBy(xpath = "//ion-label[text()=' City ']//following-sibling::ion-select")
	private WebElement City1;
	public WebElement City() {
		return City1;
	}
	@FindBy(xpath = "//ion-label[text()=' Issue Date ']//ancestor::ion-item//button")
	private WebElement IssueDate1;
	public WebElement IssueDate() {
		return IssueDate1;
	}
	@FindBy(xpath = "//span[text()='Clear']/parent::button")
	private WebElement clearbuttonIncalendar;
	public WebElement clearbuttonIncalendar() {
		return clearbuttonIncalendar;
	}
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	private WebElement previousbuttonIncalendar;
	public WebElement previousbuttonIncalendar() {
		return previousbuttonIncalendar;
	}
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
	private WebElement nextbuttonIncalendar;
	public WebElement nextbuttonIncalendar() {
		return nextbuttonIncalendar;
	}
	@FindBy(xpath = "//button[@ng-reflect-text='Update']")
	private WebElement savebutton1;
	public WebElement savebutton() {
		return savebutton1;
	}

}
