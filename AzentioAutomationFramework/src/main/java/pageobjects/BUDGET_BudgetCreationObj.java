package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BUDGET_BudgetCreationObj {

	
	
	

		WebDriver driver;

		public BUDGET_BudgetCreationObj(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}

		@FindBy(xpath = "//ion-button[@ng-reflect-router-link='/tabs/list/datagrid-view/219']")
		private WebElement eyeicon;
		public WebElement eyeIcon() {
			return eyeicon;

		}

		@FindBy(xpath = "//ion-fab-button[@id='addBtn']")
		private WebElement addbtn;

		public WebElement addBtn() {
			return addbtn;
		}

		@FindBy(xpath = "//input[@name='budgetCode']")
		private WebElement bdgcode;
		public WebElement budgetCode() {
			return bdgcode;

		}

		@FindBy(xpath = "//ng-select[@class='ng-select ng-select-single ng-select-searchable ng-select-clearable ng-pristine ng-invalid ng-select-bottom ng-touched']")
		private WebElement bdg_type;

		public WebElement bdgType() {
			return bdg_type;
		}

		@FindBy(xpath = "//input[@name='warningPercentage']")
		private WebElement warning_percentage;
		public WebElement warningPercentage() {
			return warning_percentage;

		}

		@FindBy(xpath = "//input[@name='budgetName']")
		private WebElement budget_name;

		public WebElement budgetName() {
			return budget_name;

		}

		@FindBy(xpath = "//input[@name='remarks']")
		private WebElement remarks;

		public WebElement remarks() {
			return remarks;

		}

		@FindBy(xpath = "//ion-button[@class='ion-color ion-color-primary md button button-clear in-toolbar ion-activatable ion-focusable hydrated']")
		private WebElement savebtn;

		public WebElement saveBtn() {
			return savebtn;

		}

		@FindBy(xpath = "//ion-textarea[@name='remarks']")
		private WebElement enter_remarks;

		public WebElement enterRemarks() {
			return enter_remarks;
		}

		@FindBy(xpath = "//ion-button[@ng-reflect-router-link='/tabs/list/datagrid/36']")
		private WebElement notebtn;

		public WebElement noteBtn() {
			return notebtn;

		}

		@FindBy(xpath = "//ion-button[contains(text(),'Submit')]")
		private WebElement submit_button;

		public WebElement submitButton() {
			return submit_button;
		}

		@FindBy(xpath = "//span[contains(text(),'Submit')]")
		private WebElement first_submit_button;

		public WebElement firstSubmitButton() {
			return first_submit_button;

		}
	    @FindBy(xpath="//span[contains(text(),'Cancel')]")
	    private WebElement cancel_button;
	    public WebElement cancelButton()
	    {
			return cancel_button;
	    	
	    }
	    @FindBy(xpath="//ion-button[@class='ng-star-inserted ion-color ion-color-primary md button button-clear in-toolbar ion-activatable ion-focusable hydrated ion-activated']")
		private WebElement save_button;
	    public WebElement saveButton()
	    {
			return save_button;
	    	
	    }
	    @FindBy(xpath = "//div[@id='toast-container']")
		private WebElement reviewer_id;

		public WebElement reviewerId() {
			return reviewer_id;
		}
		@FindBy(xpath="//ion-label[contains(text(),'anant')]")
		private WebElement logout_button;
		public WebElement logoutButton()
		{
			return logout_button;
			
		}
	}


