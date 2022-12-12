package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LivingExpenseObject {
	WebDriver driver;

	public LivingExpenseObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//ion-label[text()='Other Masters']")
	private WebElement LivingExpense_OtherMaster1;
	public WebElement LivingExpense_OtherMaster() {
		return LivingExpense_OtherMaster1;
	}
	@FindBy(xpath = "//ion-label[text()='Living Expense']//parent::ion-item//following-sibling::ion-buttons/ion-button[2]")
	private WebElement LivingExpense_EyeIcon1;
	public WebElement LivingExpense_EyeIcon() {
		return LivingExpense_EyeIcon1;
	}
	
	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement LivingExpense_Maker_MenuToggle;

	public WebElement LivingExpense_Maker_MenuToggle() {
		return LivingExpense_Maker_MenuToggle;
	}
	
	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement livingExpenseConfigManager;
	
	public WebElement livingExpenseConfigManager() {
		return livingExpenseConfigManager;
	}

	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
	private WebElement livingExpenseConfigurations;

	public WebElement livingExpenseConfigurations() {
		return livingExpenseConfigurations;
	}
	
	@FindBy(xpath = "//ion-label[text()='Living Expense']//parent::ion-item//following-sibling::ion-buttons/ion-button[1]")
	private WebElement LivingExpense_TempViewButton1;
	public WebElement LivingExpense_TempViewButton() {
		return LivingExpense_TempViewButton1;
	}
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement LivingExpense_AddButton1;
	public WebElement LivingExpense_AddButton() {
		return LivingExpense_AddButton1;
	}
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")   
	 private WebElement LivingExpense_ListViewSearch1;
	 public WebElement LivingExpense_ListViewSearch(){
		 return LivingExpense_ListViewSearch1;
}
	 @FindBy(xpath = "//input[@mode='ios']")   
	 private WebElement LivingExpense_ListViewSearchText1;
	 public WebElement LivingExpense_ListViewSearchText(){
		 return LivingExpense_ListViewSearchText1;
} 
	 @FindBy(xpath="//span[text()='Export']/following-sibling::div/span")
		private WebElement exportIcon;
		public WebElement exportIcon() {
			return exportIcon;
		}	
		@FindBy(xpath="//li[@aria-label='PDF']")
		private WebElement exportToPDF;
		public WebElement exportToPDF() {
			return exportToPDF;
		}	
		@FindBy(xpath="//li[@aria-label='XLS']/span")
		private WebElement exportToExcel;
		public WebElement exportToExcel() {
			return exportToExcel;

}
		@FindBy(xpath="//ion-segment-button[@id='seg3']")
		private WebElement LivingExpenseLocationTab;
		public WebElement LivingExpenseLocationTab() {
			return LivingExpenseLocationTab;
}
         @FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")	
         private WebElement LivingExpenseLocatio_PencilIcon1;
 		public WebElement LivingExpenseLocatio_PencilIcon() {
 			return LivingExpenseLocatio_PencilIcon1;
}
}
