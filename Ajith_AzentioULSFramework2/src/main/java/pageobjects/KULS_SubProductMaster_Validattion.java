package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KULS_SubProductMaster_Validattion {
	WebDriver driver;
	public KULS_SubProductMaster_Validattion(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIcon;
	public WebElement searchIcon() {
		return searchIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement addIcon;
	public WebElement addIcon() {
		return addIcon;
	}
	@FindBy(xpath="//span[text()='Export']")
	private WebElement exportIcon;
	public WebElement exportIcon() {
		return exportIcon;
	}	
	@FindBy(xpath="//li[@aria-label='PDF']")
	private WebElement exportToPDF;
	public WebElement exportToPDF() {
		return exportToPDF;
	}	
	@FindBy(xpath="//li[@aria-label='XLS']")
	private WebElement exportToExcel;
	public WebElement exportToExcel() {
		return exportToExcel;
	}
	@FindBy(xpath="//span[text()=' Action ']")
	private WebElement actionFieldinViewList;
	public WebElement actionFieldinViewList() {
		return actionFieldinViewList;
	}
	
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-eye'])[1]")
	private WebElement eyeIconinViewList;
	public WebElement eyeIconinViewList() {
	return eyeIconinViewList;
	}
	
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-pencil'])[1]")
	private WebElement pencilIconinViewList;
	public WebElement pencilIconinViewList() {
	return pencilIconinViewList;
	}
	@FindBy(xpath="//h4[text()='Product Setup']")
	private WebElement productSetupInLeftPanel;
	public WebElement productSetupInLeftPanel() {
	return productSetupInLeftPanel;
	}
	@FindBy(xpath="//ion-button[@ng-reflect-router-link='/menu/tabs/screen/mdm:SubProdu']")
	private WebElement editIconofSubProductMaster;
	public WebElement editIconofSubProductMaster() {
	return editIconofSubProductMaster;
	}
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-menu[1]/ion-content[1]/ion-split-pane[1]/ion-menu[1]/ion-content[1]/div[1]/ion-card-content[1]/ion-col[1]/ion-card-content[7]/ion-card-content[1]/ion-item[4]/ion-buttons[1]/ion-button[2]")
	private WebElement viewIconofSubProductMaster;
	public WebElement viewIconofSubProductMaster() {
	return viewIconofSubProductMaster;
	}
	
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement searchTextField;
	public WebElement searchTextField() {
	return searchTextField;
	}

	@FindBy(xpath="//input[@mode='ios']/parent::span//i")
	private WebElement clearIconInSearchField;
	public WebElement clearIconInSearchField() {
	return clearIconInSearchField;
	}
	
}
