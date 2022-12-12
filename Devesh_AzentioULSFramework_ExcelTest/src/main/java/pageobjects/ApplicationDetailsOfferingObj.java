package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationDetailsOfferingObj {
	WebDriver driver;

	public ApplicationDetailsOfferingObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement applicationDetailsOffering_Maker_MenuToggle;

	public WebElement applicationDetailsOffering_Maker_MenuToggle() {
		return applicationDetailsOffering_Maker_MenuToggle;
	}


	@FindBy(xpath = "//ion-toolbar/ion-buttons[1]/ion-button[1]")
	private WebElement applicationDetailsOffering_BackButton;

	public WebElement applicationDetailsOffering_BackButton() {
		return applicationDetailsOffering_BackButton;
	}

	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement applicationDetailsOffering_Inbox;

	public WebElement applicationDetailsOffering_Inbox() {
		return applicationDetailsOffering_Inbox;
	}


	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement applicationDetailsOffering_SearchInbox;

	public WebElement applicationDetailsOffering_SearchInbox() {
		return applicationDetailsOffering_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement applicationDetailsOffering_SearchInboxInputField;

	public WebElement applicationDetailsOffering_SearchInboxInputField() {
		return applicationDetailsOffering_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement applicationDetailsOffering_SearchInboxCloseButton;

	public WebElement applicationDetailsOffering_SearchInboxCloseButton() {
		return applicationDetailsOffering_SearchInboxCloseButton;
	}
	
	// ApplicationDetailTab
	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement applicationDetailsOffering_ApplicationDetailTab;
	
	public WebElement applicationDetailsOffering_ApplicationDetailTab() {
		return applicationDetailsOffering_ApplicationDetailTab;
	}
	
	// Primaryproduct field
	@FindBy(xpath = "//ion-label[contains(text(),'Primary Product')]/../ion-select")
	private WebElement applicationDetailsOffering_PrimaryProductField;
	
	public WebElement applicationDetailsOffering_PrimaryProductField() {
		return applicationDetailsOffering_PrimaryProductField;
	}
	
	// PrimarySubproduct field
	@FindBy(xpath = "//ion-label[contains(text(),'Primary Sub Product')]/../ion-select")
	private WebElement applicationDetailsOffering_PrimarySubProductField;
	
	public WebElement applicationDetailsOffering_PrimarySubProductField() {
		return applicationDetailsOffering_PrimarySubProductField;
	}
	
	//  Special Promotion/Campaign  field
	@FindBy(xpath = "//ion-label[contains(text(),' Special Promotion/Campaign ')]/../ion-select")
	private WebElement applicationDetailsOffering_SpecialPromotionField;
	
	public WebElement applicationDetailsOffering_SpecialPromotionField() {
		return applicationDetailsOffering_SpecialPromotionField;
	}
	
	//Sourcing Channel  field
	@FindBy(xpath = "//ion-label[contains(text(),'Sourcing Channel')]/../ion-select")
	private WebElement applicationDetailsOffering_SourcingChannelField;
	
	public WebElement applicationDetailsOffering_SourcingChannelField() {
		return applicationDetailsOffering_SourcingChannelField;
	}
	
	// BusinessCenterCode  field
	@FindBy(xpath = "//ion-label[contains(text(),'Business Center Code')]/../ion-select")
	private WebElement applicationDetailsOffering_BusinessCenterCodeField;
	
	public WebElement applicationDetailsOffering_BusinessCenterCodeField() {
		return applicationDetailsOffering_BusinessCenterCodeField;
	}
	
	//ServicingType  field
	@FindBy(xpath = "//ion-label[contains(text(),'Servicing Type')]/../ion-select")
	private WebElement applicationDetailsOffering_ServicingTypeField;
	
	public WebElement applicationDetailsOffering_ServicingTypeField() {
		return applicationDetailsOffering_ServicingTypeField;
	}
	
	//ServicingEntity  field
	@FindBy(xpath = "//ion-label[contains(text(),'Servicing Entity')]/../ion-select")
	private WebElement applicationDetailsOffering_ServicingEntityField;
	
	public WebElement applicationDetailsOffering_ServicingEntityField() {
		return applicationDetailsOffering_ServicingEntityField;
	}
	
	//ServicingBranch  field
	@FindBy(xpath = "//ion-label[contains(text(),'Servicing Branch')]/../ion-select")
	private WebElement applicationDetailsOffering_ServicingBranchField;
	
	public WebElement applicationDetailsOffering_ServicingBranchField() {
		return applicationDetailsOffering_ServicingBranchField;
	}
	
	// Closing Staff or Servicing Staff or RM   field
	@FindBy(xpath = "//ion-label[contains(text(),' Closing Staff or Servicing Staff or RM ')]/../ion-select")
	private WebElement applicationDetailsOffering_ClosingStaffField;
	
	public WebElement applicationDetailsOffering_ClosingStaffField() {
		return applicationDetailsOffering_ClosingStaffField;
	}
	
	//SourcingType  field
	@FindBy(xpath = "//ion-label[contains(text(),'Sourcing Type')]/../ion-select")
	private WebElement applicationDetailsOffering_SourcingTypeField;
	
	public WebElement applicationDetailsOffering_SourcingTypeField() {
		return applicationDetailsOffering_SourcingTypeField;
	}
	
	//SourcingStaff  field
	@FindBy(xpath = "//ion-label[contains(text(),'Sourcing Staff')]/../ion-select")
	private WebElement applicationDetailsOffering_SourcingStaffField;
	
	public WebElement applicationDetailsOffering_SourcingStaffField() {
		return applicationDetailsOffering_SourcingStaffField;
	}
	
	//SourcingEntity  field
	@FindBy(xpath = "//ion-label[contains(text(),'Sourcing Entity')]/../ion-select")
	private WebElement applicationDetailsOffering_SourcingEntityField;
	
	public WebElement applicationDetailsOffering_SourcingEntityField() {
		return applicationDetailsOffering_SourcingEntityField;
	}
	
	//SourcingOffice  field
	@FindBy(xpath = "//ion-label[contains(text(),'Sourcing Office')]/../ion-select")
	private WebElement applicationDetailsOffering_SourcingOfficeField;
	
	public WebElement applicationDetailsOffering_SourcingOfficeField() {
		return applicationDetailsOffering_SourcingOfficeField;
	}
	
	//ReferenceType  field
	@FindBy(xpath = "//ion-label[contains(text(),'Reference Type')]/../ion-select")
	private WebElement applicationDetailsOffering_ReferenceTypeField;
	
	public WebElement applicationDetailsOffering_ReferenceTypeField() {
		return applicationDetailsOffering_ReferenceTypeField;
	}
	
	//ReferenceEntity  field
	@FindBy(xpath = "//ion-label[contains(text(),'Reference Entity')]/../ion-select")
	private WebElement applicationDetailsOffering_ReferenceEntityField;
	
	public WebElement applicationDetailsOffering_ReferenceEntityField() {
		return applicationDetailsOffering_ReferenceEntityField;
	}
	
	// TotalFinanceAmountRequested
	@FindBy(xpath = "(//p-inputnumber[1])[1]")
	private WebElement applicationDetailsOffering_TotalFinanceAmountRequested;
	
	public WebElement applicationDetailsOffering_TotalFinanceAmountRequested() {
		return applicationDetailsOffering_TotalFinanceAmountRequested;
	}
	
	// TotalFinanceAmountRequested
	@FindBy(xpath = "//ion-col[4]/kub-prime-ccy[1]/div[1]/div[1]/ion-item[1]/div[2]/div[1]/p-inputnumber[1]/input")
	private WebElement applicationDetailsOffering_TotalFinanceAmountRequestedInput;
	
	public WebElement applicationDetailsOffering_TotalFinanceAmountRequestedInput() {
		return applicationDetailsOffering_TotalFinanceAmountRequestedInput;
	}
	
	// DeclaredNetIncome
	@FindBy(xpath = "(//p-inputnumber[1])[2]")
	private WebElement applicationDetailsOffering_DeclaredNetIncome;
	
	public WebElement applicationDetailsOffering_DeclaredNetIncome() {
		return applicationDetailsOffering_DeclaredNetIncome;
	}
	// DeclaredNetIncome input
	@FindBy(xpath = "//ion-col[5]/kub-prime-ccy[1]/div[1]/div[1]/ion-item[1]/div[2]/div[1]/p-inputnumber[1]/input")
	private WebElement applicationDetailsOffering_DeclaredNetIncomeInput;
	
	public WebElement applicationDetailsOffering_DeclaredNetIncomeInput() {
		return applicationDetailsOffering_DeclaredNetIncomeInput;
	}
	
	// DeclaredCurrentObligition
	@FindBy(xpath = "(//p-inputnumber[1])[3]")
	private WebElement applicationDetailsOffering_DeclaredCurrentObligition;
	
	public WebElement applicationDetailsOffering_DeclaredCurrentObligition() {
		return applicationDetailsOffering_DeclaredCurrentObligition;
	}
	
	// DeclaredCurrentObligition input
	@FindBy(xpath = "//ion-col[6]/kub-prime-ccy[1]/div[1]/div[1]/ion-item[1]/div[2]/div[1]/p-inputnumber[1]/input")
	private WebElement applicationDetailsOffering_DeclaredCurrentObligitionInput;
	
	public WebElement applicationDetailsOffering_DeclaredCurrentObligitionInput() {
		return applicationDetailsOffering_DeclaredCurrentObligitionInput;
	}
	
	// ReferenceCode
	@FindBy(xpath = "//ion-col[21]/digital-text-box[1]/ion-item[1]/ion-input[1]")
	private WebElement applicationDetailsOffering_ReferenceCode;
	
	public WebElement applicationDetailsOffering_ReferenceCode() {
		return applicationDetailsOffering_ReferenceCode;
	}

	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement applicationDetailsOffering_NoDataFoundInSearch;

	public WebElement applicationDetailsOffering_NoDataFoundInSearch() {
		return applicationDetailsOffering_NoDataFoundInSearch;
	}
	
	
	
	
	
	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[8]/img[1]")
	private WebElement applicationDetailsOffering_Profile;
	
	public WebElement applicationDetailsOffering_Profile() {
		return applicationDetailsOffering_Profile;
	}
	
	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement applicationDetailsOffering_LogoutUser;
	
	public WebElement applicationDetailsOffering_LogoutUser() {
		return applicationDetailsOffering_LogoutUser;
	}
}
