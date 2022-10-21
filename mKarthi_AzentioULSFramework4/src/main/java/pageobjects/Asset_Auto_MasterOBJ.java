package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class Asset_Auto_MasterOBJ {
	
	WebDriver driver;

	public Asset_Auto_MasterOBJ(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
       
	}
	@FindBy(xpath="//ion-label[contains(text(),'Asset Auto Master')]//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement productsetupediticon;
	public WebElement productsetupediticon()
	{
		return productsetupediticon;
	}
	@FindBy(xpath="//ion-toggle[@role='switch']")
	private WebElement Activeanddeactive;
	public WebElement Activeanddeactive()
	{
		return Activeanddeactive;
	}
	@FindBy(xpath="//span[contains(text(),'Export')]")
	private WebElement exportIcon;
	public WebElement exportIcon() 
	{
		return exportIcon;
	}
	@FindBy(xpath="//span[contains(text(),'PDF')]")
	private WebElement pdfOption;
	public WebElement pdfOption() 
	{
		return pdfOption;
	}
	@FindBy(xpath="//span[contains(text(),'XLS')]")
	private WebElement xlsOption;
	public WebElement xlsOption() 
	{
		return xlsOption;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement productViewSearchText;
	public WebElement productViewSearchText() 
	{
		return productViewSearchText;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement Asset_Addicon;
	public WebElement Asset_Addicon()
	{
		return Asset_Addicon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIcon;
	public WebElement searchIcon() 
	{
		return searchIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-text='View Summary']//child::span")
	private WebElement viewsummary;
	public WebElement viewsummary() 
	{
		return viewsummary;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Asset Auto Master')]//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement assetautomastereyeicon;
	public WebElement assetautomastereyeicon() 
	{
		return assetautomastereyeicon;
	}
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-pencil'])[1]")
	private WebElement listviewpencil;
	public WebElement listviewpencil() 
	{
		return listviewpencil;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement Asset_BackArrow;
	public WebElement Asset_BackArrow()
	{
		return Asset_BackArrow;
	}
	@FindBy(xpath="//span[contains(text(),'Configurations')]//following-sibling::ion-icon")
	private WebElement Asset_Configurations;
	public WebElement Asset_Configurations()
	{
		return Asset_Configurations;
	}
	@FindBy(xpath="//ion-label[contains(text(), 'Asset Model Master')]")
	private WebElement Asset_Model_Master_Tab;
	public WebElement Asset_Model_Master_Tab()
	{
		return Asset_Model_Master_Tab;
	}
	

}
