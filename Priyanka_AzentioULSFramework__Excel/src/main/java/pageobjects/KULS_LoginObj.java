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
	//ul[1]/li[3]/ion-accordion-group[1]/ion-accordion[1]/ion-item[1]/ion-icon[2]
	@FindBy(xpath="//ion-icon[@name='cog']")
	private WebElement configuration;
	public WebElement configuration() {
		return configuration;
	}
	
	@FindBy(xpath = "//ion-menu[1]/ion-card-content[1]/ion-col[1]/div[1]/ion-button[1]")
	private WebElement Menu_Tab;

	public WebElement Menu_Tab() {
		return Menu_Tab;
	}
	
}
