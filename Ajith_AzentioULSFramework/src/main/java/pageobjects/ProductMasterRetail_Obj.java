package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMasterRetail_Obj {
	WebDriver driver;
	public ProductMasterRetail_Obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h4[text()='Product master']//parent::ion-label//following-sibling::ion-buttons//ion-button[1]")
	private WebElement productEditIcon;
	public WebElement productEditIcon() {
		return productEditIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement addIcon;
	public WebElement addIcon() {
		return addIcon;
	}
	@FindBy(xpath="//ion-label[@ng-reflect-text=' Product Master ']")
	private WebElement productMasterText;
	public WebElement productMasterText() {
		return productMasterText;
	} 
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement backButtonInProductMaster;
	public WebElement backButtonInProductMaster() {
		return backButtonInProductMaster;
	} 
	@FindBy(xpath="//button[@ng-reflect-text='Search']")
	private WebElement searchIcon;
	public WebElement searchIcon() {
		return searchIcon;
	}
	@FindBy(xpath = "//input[@mode='ios']") 
    private WebElement productViewSearchText;
    public WebElement productViewSearchText() {
        return productViewSearchText;
    } 
	@FindBy(xpath="//span[@ng-reflect-ng-class='pi pi-chevron-down']")
	private WebElement exportIcon;
	public WebElement exportIcon() {
		return exportIcon;
	} 
	@FindBy(xpath="//p-dropdownitem[@ng-reflect-label='PDF']//child::span")
	private WebElement pdfOption;
	public WebElement pdfOption() {
		return pdfOption;
	}
	@FindBy(xpath="//p-dropdownitem[@ng-reflect-label='XLS']//child::span")
	private WebElement xlsOption;
	public WebElement xlsOption() {
		return xlsOption;
	}
	//tr[1]/td[6]/p-celleditor[1]/span[1]
}
