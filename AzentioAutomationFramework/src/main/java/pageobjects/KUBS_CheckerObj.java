package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class KUBS_CheckerObj {

	
	
	
		WebDriver drive;

		public KUBS_CheckerObj(WebDriver drive) {
			this.drive = drive;
			PageFactory.initElements(drive, this);
		}

		@FindBy(xpath = "//ion-item[1]/ion-icon[@class='mr-2 md ion-color ion-color-dark hydrated']")
		private WebElement security_management;

		public WebElement securityManagement() {
			return security_management;
		}

		@FindBy(xpath = "//ion-buttons[1]/ion-button[2]")
		private WebElement eye_icon;

		public WebElement eyeIcon() {
			return eye_icon;
		}

		@FindBy(xpath = "//ion-buttons[1]/ion-button[1]")
		private WebElement note_icon;

		public WebElement noteIcon() {
			return note_icon;
		}
		@FindBy(xpath="//ion-icon[@ng-reflect-name='notifications-circle']")
		private WebElement notification_icon;
		public WebElement notificationIcon()
		{
			return notification_icon;	
		}
		@FindBy(xpath = "//ion-button[@ng-reflect-router-link='/inbox']")
		private WebElement notification_button;

		public WebElement notificationButton() {
			return notification_button;
		}

		@FindBy(xpath = "//span/ion-button[3]")
		private WebElement reject_button;

		public WebElement rejectButton() {
			return reject_button;
		}

		@FindBy(xpath = "//span/ion-button[1]")
		private WebElement approve_button;

		public WebElement approveButton() {
			return approve_button;

		}

		@FindBy(xpath = "//span/ion-button[2]")
		private WebElement return_button;

		public WebElement returnButton() {
			return return_button;
		}

		@FindBy(xpath = "//input[@name='budgetCode']")
		private WebElement budget_code;

		public WebElement getBudgetCode() {
			return budget_code;
		}

		@FindBy(xpath = "//ion-col[3]/app-kub-lov/span/ng-select/div/div/div[2]")
		private WebElement budget_year;

		public WebElement getBudgetYear() {
			return budget_year;
		}

		@FindBy(xpath = "//input[@name='warningPercentage']")
		private WebElement warning_percentage;

		public WebElement getWarningPercentage() {
			return warning_percentage;
		}

		@FindBy(xpath = "//input[@name='budgetName']")
		private WebElement budget_name;

		public WebElement getBudgetName() {
			return budget_name;
		}

		@FindBy(xpath = "//ion-col[8]/app-kub-lov/span/ng-select/div/div/div[2]")
		private WebElement budget_status;

		public WebElement getBudgetStatus() {
			return budget_status;
		}
		@FindBy(xpath="//textarea[@name='remarks']")
		private WebElement remarks;
		public WebElement remarks()
		{
			return remarks;		
		}
		@FindBy(xpath="//ion-button[contains(text(),'Submit')]")
		private WebElement submit_button;
		public WebElement submitButton()
		{
			return submit_button;		
		}


	}


