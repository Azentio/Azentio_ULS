package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class BounceMasterOBJ {

	WebDriver driver;

	public BounceMasterOBJ(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement ConfigManager;

	public WebElement ConfigManager() {
		return ConfigManager;
	}

	@FindBy(xpath = "(//ion-label[contains(text(),'Bounce')]//following-sibling::ion-buttons//child::ion-button)[1]")
	private WebElement BounceMasterEdit;

	public WebElement BounceMasterEdit() {
		return BounceMasterEdit;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement ActionEditIcon;

	public WebElement ActionEditIcon() {
		return ActionEditIcon;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Charge')]//following-sibling::ion-select")
	private WebElement ChargeApplicable;

	public WebElement ChargeApplicable() {
		return ChargeApplicable;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Update']")
	private WebElement UpdateSave;

	public WebElement UpdateSave() {
		return UpdateSave;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'Bounce Code')]//following-sibling::ion-input/input)[1]")
	private WebElement BounceCode;

	public WebElement BounceCode() {
		return BounceCode;
	}
	@FindBy(xpath="//ion-badge[contains(text(),'Required field')]")
	private WebElement RequiredField;

	public WebElement RequiredField() {
		return RequiredField;
	}
	
	
	
}
