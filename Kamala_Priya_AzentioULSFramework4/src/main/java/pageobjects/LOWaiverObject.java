package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOWaiverObject {
	WebDriver driver;
	public LOWaiverObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//ion-grid[1]/ion-row[1]/ion-col[2]/data-grid[1]//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")   
private WebElement LoWaiver_ListViewSearch1;
public WebElement LoWaiver_ListViewSearch(){
	 return LoWaiver_ListViewSearch1;
}
@FindBy(xpath = "//input[@mode='ios']")   
private WebElement LOWaiver_ListViewSearchText1;
public WebElement LOWaiver_ListViewSearchText(){
	 return LOWaiver_ListViewSearchText1;
} 
@FindBy(xpath="(//span[text()='Export'])[2]")
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
	 @FindBy(xpath = "(//tbody/tr[1]/td[4]/p-celleditor[1]/span[1])[2]")   
	 private WebElement LOWaiver_ListViewMachedData1;
	 public WebElement LOWaiver_ListViewMachedData(){
		 return LOWaiver_ListViewMachedData1;
	 }
	 @FindBy(xpath = "//ion-label[text()='LO Module Waiver']/parent::ion-item//ion-buttons//ion-button[2]")
		private WebElement loModuleWaiver_ViewButton;

		public WebElement loModuleWaiverViewButton() {
			return loModuleWaiver_ViewButton;
		}

		@FindBy(xpath = "//ion-label[text()='LO Module Waiver']/parent::ion-item//ion-buttons//ion-button[1]")
		private WebElement loModuleWaiver_TempViewButton;

		public WebElement loModuleWaiverTempViewButton() {
			return loModuleWaiver_TempViewButton;
		}

		@FindBy(xpath = "//button[@ng-reflect-text='Add']")
		private WebElement loWaiver_AddButton;

		public WebElement loWaiverAddButton() {
			return loWaiver_AddButton;
		}

		@FindBy(xpath = "//span[text()='Configurations']")
		private WebElement ULS_Configuration;

		public WebElement ULSConfiguration() {
			return ULS_Configuration;
		}

		@FindBy(xpath = "//ion-label[text()='Config Manager']")
		private WebElement ULS_ConfigManager;

		public WebElement ULSConfigManager() {
			return ULS_ConfigManager;
		}
}

