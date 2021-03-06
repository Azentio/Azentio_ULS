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
	@FindBy(xpath="//ion-segment-button[@ng-reflect-text='Configuration']")
	private WebElement configuration;
	public WebElement configuration() {
		return configuration;
	}
	
}
