package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnderWritter_Offset_ControlObj {

	WebDriver driver;

	public UnderWritter_Offset_ControlObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-card-content[1]/ion-item[1]//ion-icon[1]")
	private WebElement config_Manager;

	public WebElement config_Manager() {
		return config_Manager;
	}

	// Business_Rules
	@FindBy(xpath = "//ion-list[1]/ion-item[2]/ion-accordion-group[1]/ion-accordion[1]/ion-item[1]")
	private WebElement Business_Rules;

	public WebElement Business_Rules() {
		return Business_Rules;
	}

	// UnderWritter_Offset_Control EyeIcon

	@FindBy(xpath = "(//ion-list[1]/ion-item[1]/ion-buttons[1]/ion-button[2])[2]")
	private WebElement UnderWritter_Offset_Control_EyeIcon;

	public WebElement UnderWritter_Offset_Control_EyeIcon() {
		return UnderWritter_Offset_Control_EyeIcon;
	}

	// ActionEdit
	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement UnderWritter_Offset_Control_ActionEdit;

	public WebElement UnderWritter_Offset_Control_ActionEdit() {
		return UnderWritter_Offset_Control_ActionEdit;
	}

	// UnderWritter_Offset_Control_MinimumValue
	
	@FindBy(xpath = "//ion-grid[2]/ion-row[1]/ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement UnderWritter_Offset_Control_MinimumValue;

	public WebElement UnderWritter_Offset_Control_MinimumValue() {
		return UnderWritter_Offset_Control_MinimumValue;
	}

	// UnderWritter_Offset_Control Save Button
	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement UnderWritter_Offset_Control_SaveButton;

	public WebElement UnderWritter_Offset_Control_SaveButton() {
		return UnderWritter_Offset_Control_SaveButton;
	}

	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement UnderWritter_Offset_Control_SaveConfirmationMessage;

	public WebElement UnderWritter_Offset_Control_SaveConfirmationMessage() {
		return UnderWritter_Offset_Control_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement UnderWritter_Offset_Control_SaveConfirmationMessageCloseButton;

	public WebElement UnderWritter_Offset_Control_SaveConfirmationMessageCloseButton() {
		return UnderWritter_Offset_Control_SaveConfirmationMessageCloseButton;
	}
	// UW_OFFSET_CONTROL

	// Inbox
	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
	private WebElement UnderWritter_Offset_Control_Inbox;

	public WebElement UnderWritter_Offset_Control_Inbox() {
		return UnderWritter_Offset_Control_Inbox;
	}

	// SearchRecord From inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement UnderWritter_Offset_Control_InboxSearch;

	public WebElement UnderWritter_Offset_Control_InboxSearch() {
		return UnderWritter_Offset_Control_InboxSearch;
	}

	// SearchInputField
	@FindBy(xpath = "//div/span/input")
	private WebElement UnderWritter_Offset_Control_InboxSearchInput;

	public WebElement UnderWritter_Offset_Control_InboxSearchInput() {
		return UnderWritter_Offset_Control_InboxSearchInput;
	}
	//ReferanceId
		@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
		private WebElement UnderWritter_Offset_Control_ReferanceId;
		public WebElement UnderWritter_Offset_Control_ReferanceId() {
			return UnderWritter_Offset_Control_ReferanceId;
		}
		
		
		//MakerSubmit
		@FindBy(xpath = "//button/span[contains(text(),'Submit')]")
		private WebElement UnderWritter_Offset_Control_Submit;
		public WebElement UnderWritter_Offset_Control_Submit() {
			return UnderWritter_Offset_Control_Submit;
		}
		
		//SubmitRemark
		@FindBy(xpath = "//ion-label[contains(text(),'ok')]")
		private WebElement UnderWritter_Offset_Control_SubmitRemark;
		public WebElement UnderWritter_Offset_Control_SubmitRemark() {
			return UnderWritter_Offset_Control_SubmitRemark;
		}

		//FinalSubmit
		@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
		private WebElement UnderWritter_Offset_Control_FinalSubmit;
		public WebElement UnderWritter_Offset_Control_FinalSubmit() {
				return UnderWritter_Offset_Control_FinalSubmit;
		}
		

		@FindBy(xpath = "//div[@id='toast-container']/div[1]")
		private WebElement UnderWritter_Offset_Control_Checker_Id;

		public WebElement UnderWritter_Offset_Control_Checker_Id() {
			return UnderWritter_Offset_Control_Checker_Id;
		}
		
		@FindBy(xpath="//div[@id='toast-container']/div/button/span")
		private WebElement UnderWritter_Offset_Control_Alert_Close;
		public WebElement UnderWritter_Offset_Control_Alert_Close() {
			return UnderWritter_Offset_Control_Alert_Close;
		}

		@FindBy(xpath = "//body/div/div/div/button")
		private WebElement UnderWritter_Offset_Control_ConfirmationMessageCloseButton;

		public WebElement UnderWritter_Offset_Control_ConfirmationMessageCloseButton() {
			return UnderWritter_Offset_Control_ConfirmationMessageCloseButton;
		}
		

		//Checker_Approve
		@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
		private WebElement Checker_Approve;
		public WebElement Checker_Approve() {
			return Checker_Approve;
		}
		//Checker_ApproveRemark 
		@FindBy(xpath = "//ion-label[contains(text(),'approve')]")
		private WebElement Checker_ApproveRemark;
		public WebElement Checker_ApproveRemark() {
			return Checker_ApproveRemark;
		}

		//Checker_ApproveAlert
		@FindBy(xpath = "(//span[contains(text(),'Approve')])[2]")
		private WebElement Checker_ApproveAlert;
		public WebElement Checker_ApproveAlert() {
			return Checker_ApproveAlert;
		}

		//Search Icon
		@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
		private WebElement ViewList_SearchIcon;

		public WebElement ViewList_SearchIcon() {
			return ViewList_SearchIcon;
		}
		

}
