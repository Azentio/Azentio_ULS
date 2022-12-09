package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KULS_LoginObj {
	WebDriver driver;
	public KULS_LoginObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ion-input[@ng-reflect-name='username']/input")
	private WebElement userId;
	public WebElement userId() {
		return userId;
	}
	@FindBy(xpath="//ion-button[contains(text(),'Continue')]")
	private WebElement continueButton;
	public WebElement continueButton() {
		return continueButton;
	}
	@FindBy(xpath="//ion-content[1]/div[1]/img[1]")
    private WebElement loginPage;
    public WebElement loginPage() {
        return loginPage;
    }
	@FindBy(xpath="//ion-item/ion-input[@type='password']/input")
	private WebElement password;
	public WebElement password() {
		return password;
	}
	@FindBy(xpath="//ion-button[contains(text(),'Sign In')]")
	private WebElement signIn;
	public WebElement signIn() {
		return signIn;
	}
	@FindBy(xpath="//span[text()='Configurations']")
	private WebElement configuration;
	public WebElement configuration() {
		return configuration;
	}
	@FindBy(xpath = "//ion-card-content//ion-col[1]//div//ion-button")
	private WebElement MenuButton1;
	public WebElement MenuButton() {
		return MenuButton1;
	}
	@FindBy(xpath = "//ion-select[@ng-reflect-text='Module name']")
	private WebElement ModuleName1;
	public WebElement ModuleName() {
		return ModuleName1;
	}
	@FindBy(xpath = "//ion-label[text()='LOS']/following-sibling::ion-radio")
	private WebElement LOS1;
	public WebElement LOS() {
		return LOS1;
	}
}
