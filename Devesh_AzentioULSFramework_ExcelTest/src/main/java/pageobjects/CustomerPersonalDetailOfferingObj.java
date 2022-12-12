package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPersonalDetailOfferingObj {
	WebDriver driver;

	public CustomerPersonalDetailOfferingObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement customerPersonalDetailOffering_Maker_MenuToggle;

	public WebElement customerPersonalDetailOffering_Maker_MenuToggle() {
		return customerPersonalDetailOffering_Maker_MenuToggle;
	}


	@FindBy(xpath = "//ion-toolbar/ion-buttons[1]/ion-button[1]")
	private WebElement customerPersonalDetailOffering_BackButton;

	public WebElement customerPersonalDetailOffering_BackButton() {
		return customerPersonalDetailOffering_BackButton;
	}

	// inbox
	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
//	@FindBy(xpath = "//ion-list[1]/ion-item[2]/div[1]")
	private WebElement customerPersonalDetailOffering_Inbox;

	public WebElement customerPersonalDetailOffering_Inbox() {
		return customerPersonalDetailOffering_Inbox;
	}


	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement customerPersonalDetailOffering_SearchInbox;

	public WebElement customerPersonalDetailOffering_SearchInbox() {
		return customerPersonalDetailOffering_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement customerPersonalDetailOffering_SearchInboxInputField;

	public WebElement customerPersonalDetailOffering_SearchInboxInputField() {
		return customerPersonalDetailOffering_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement customerPersonalDetailOffering_SearchInboxCloseButton;

	public WebElement customerPersonalDetailOffering_SearchInboxCloseButton() {
		return customerPersonalDetailOffering_SearchInboxCloseButton;
	}
	
	// CustomerDetailTab
	@FindBy(xpath = "//ion-segment-button[@id='seg3']")
	private WebElement customerPersonalDetailOffering_CustomerDetailTab;
	
	public WebElement customerPersonalDetailOffering_CustomerDetailTab() {
		return customerPersonalDetailOffering_CustomerDetailTab;
	}


	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement customerPersonalDetailOffering_NoDataFoundInSearch;

	public WebElement customerPersonalDetailOffering_NoDataFoundInSearch() {
		return customerPersonalDetailOffering_NoDataFoundInSearch;
	}

	// List View CIF ID
	@FindBy(xpath = "//span[contains(text(),'CIF ID')]")
	private WebElement customerPersonalDetailOffering_ListViewCIF_Id;

	public WebElement customerPersonalDetailOffering_ListViewCIF_Id() {
		return customerPersonalDetailOffering_ListViewCIF_Id;
	}

	// List View First Name
	@FindBy(xpath = "//span[contains(text(),'First Name')]")
	private WebElement customerPersonalDetailOffering_ListViewFirstNameField;

	public WebElement customerPersonalDetailOffering_ListViewFirstNameField() {
		return customerPersonalDetailOffering_ListViewFirstNameField;
	}
	
	// List View Last Name
	@FindBy(xpath = "//span[contains(text(),'Last Name')]")
	private WebElement customerPersonalDetailOffering_ListViewLastNameField;
	
	public WebElement customerPersonalDetailOffering_ListViewLastNameField() {
		return customerPersonalDetailOffering_ListViewLastNameField;
	}
	
	// List View Middle Name
	@FindBy(xpath = "//span[contains(text(),'Middle Name')]")
	private WebElement customerPersonalDetailOffering_ListViewMiddleNameField;
	
	public WebElement customerPersonalDetailOffering_ListViewMiddleNameField() {
		return customerPersonalDetailOffering_ListViewMiddleNameField;
	}

	// List View CustomerType
	@FindBy(xpath = "//span[contains(text(),'Customer Type')]")
	private WebElement customerPersonalDetailOffering_ListViewCustomerTypeField;

	public WebElement customerPersonalDetailOffering_ListViewCustomerTypeField() {
		return customerPersonalDetailOffering_ListViewCustomerTypeField;
	}

	// List View ApplicantType
	@FindBy(xpath = "//span[contains(text(),'Applicant Type')]")
	private WebElement customerPersonalDetailOffering_ListViewApplicantTypeField;

	public WebElement customerPersonalDetailOffering_ListViewApplicantTypeField() {
		return customerPersonalDetailOffering_ListViewApplicantTypeField;
	}
	
	// List View Status
	@FindBy(xpath = "//span[contains(text(),'Status')]")
	private WebElement customerPersonalDetailOffering_ListViewStatusField;
	
	public WebElement customerPersonalDetailOffering_ListViewStatusField() {
		return customerPersonalDetailOffering_ListViewStatusField;
	}
	
	// CIF ID Value in List View 
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]")
	private WebElement customerPersonalDetailOffering_ListViewCIF_IdValue;
	
	public WebElement customerPersonalDetailOffering_ListViewCIF_IdValue() {
		return customerPersonalDetailOffering_ListViewCIF_IdValue;
	}
	
	// First Name Value in List View 
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]")
	private WebElement customerPersonalDetailOffering_ListViewFirstNameFieldValue;
	
	public WebElement customerPersonalDetailOffering_ListViewFirstNameFieldValue() {
		return customerPersonalDetailOffering_ListViewFirstNameFieldValue;
	}
	
	// Last Name Value in List View 
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]")
	private WebElement customerPersonalDetailOffering_ListViewLastNameFieldValue;
	
	public WebElement customerPersonalDetailOffering_ListViewLastNameFieldValue() {
		return customerPersonalDetailOffering_ListViewLastNameFieldValue;
	}
	
	// Middle Name Value in List View
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]")
	private WebElement customerPersonalDetailOffering_ListViewMiddleNameFieldValue;
	
	public WebElement customerPersonalDetailOffering_ListViewMiddleNameFieldValue() {
		return customerPersonalDetailOffering_ListViewMiddleNameFieldValue;
	}
	
	// CustomerType Value in List View 
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[8]")
	private WebElement customerPersonalDetailOffering_ListViewCustomerTypeFieldValue;
	
	public WebElement customerPersonalDetailOffering_ListViewCustomerTypeFieldValue() {
		return customerPersonalDetailOffering_ListViewCustomerTypeFieldValue;
	}
	
	//  ApplicantType Value in List View
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[9]")
	private WebElement customerPersonalDetailOffering_ListViewApplicantTypeFieldValue;
	
	public WebElement customerPersonalDetailOffering_ListViewApplicantTypeFieldValue() {
		return customerPersonalDetailOffering_ListViewApplicantTypeFieldValue;
	}
	
	// Status Value in List View 
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[10]")
	private WebElement customerPersonalDetailOffering_ListViewStatusFieldValue;
	
	public WebElement customerPersonalDetailOffering_ListViewStatusFieldValue() {
		return customerPersonalDetailOffering_ListViewStatusFieldValue;
	}

	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[8]/img[1]")
	private WebElement customerPersonalDetailOffering_Profile;
	
	public WebElement customerPersonalDetailOffering_Profile() {
		return customerPersonalDetailOffering_Profile;
	}
	
	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement customerPersonalDetailOffering_LogoutUser;
	
	public WebElement customerPersonalDetailOffering_LogoutUser() {
		return customerPersonalDetailOffering_LogoutUser;
	}
}
