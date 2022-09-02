package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetails_AppDataEntry_Obj {

	WebDriver driver;
	public PersonalDetails_AppDataEntry_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Transactions')]")
	private WebElement Transactions;
	public WebElement Transactions_Module()
	{ 
		return Transactions;
	}
	
	@FindBy(xpath = "//ion-label[text()='Application manager']")
	private WebElement uls_ApplicationManagerMainMenu;
	public WebElement ulsApplicationManagerMainMenu() {
		return uls_ApplicationManagerMainMenu;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'Application Details')]/parent::ion-item//ion-button[1]")
	private WebElement Application_Details;
	public WebElement Application_Details_Icon()
	{ 
		return Application_Details;
	}
	
	@FindBy(xpath="//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement Inbox;
	public WebElement Inbox_Icon()
	{ 
		return Inbox;
	}
	
	@FindBy(xpath="//button[@ng-reflect-text='Search']")
	private WebElement Search;
	public WebElement Search_Icon()
	{ 
		return Search;
	}
	
	@FindBy(xpath="//ion-grid[1]/ion-row[1]/ion-col[1]//div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement Search_Input;
	public WebElement Search_Input()
	{ 
		return Search_Input;
	}
	
	@FindBy(xpath="//td[contains(text(),'APPDATAENT')]/parent::tr/td/button[1]")
	private WebElement Inbox_Edit;
	public WebElement Inbox_Edit()
	{ 
		return Inbox_Edit;
	}
	
	@FindBy(xpath="//ion-segment//ion-label[text()='Customer details']/parent::ion-segment-button")
	private WebElement Customer_details_Tab;
	public WebElement Customer_details_Tab()
	{ 
		return Customer_details_Tab;
	}		
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/span[1]/button[1]")
	private WebElement Customer_details_Edit;
	public WebElement Customer_details_Edit()
	{ 
		return Customer_details_Edit;
	}
	
	@FindBy(xpath = "//ion-label[text()=' Customer Type ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_CustomerTypeDropDown;

	public WebElement customerPersonalDetailsCustomerTypeDropDown() {
		return customerPersonalDetails_CustomerTypeDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Applicant Type ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_ApplicantTypeDropDown;

	public WebElement customerPersonalDetailsApplicantTypeDropDown() {
		return customerPersonalDetails_ApplicantTypeDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Salutation ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_SalutationDropDown;

	public WebElement customerPersonalDetailsSalutationDropDown() {
		return customerPersonalDetails_SalutationDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' KYC Status ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_KYCStatus;

	public WebElement customerPersonalDetailsKYCStatus() {
		return customerPersonalDetails_KYCStatus;
	}

	@FindBy(xpath = "//ion-label[text()=' First Name ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_FirstNameinputBox;

	public WebElement customerPersonalDetailsFirstNameinputBox() {
		return customerPersonalDetails_FirstNameinputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Middle Name ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_MiddleNameInputBox;

	public WebElement customerPersonalDetailsMiddleNameInputBox() {
		return customerPersonalDetails_MiddleNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Last Name ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_LastNameInputBox;

	public WebElement customerPersonalDetailsLastNameInputBox() {
		return customerPersonalDetails_LastNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=\" Father's First Name \"]//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_FatherFirstNameInputBox;

	public WebElement customerPersonalDetailsFatherFirstNameInputBox() {
		return customerPersonalDetails_FatherFirstNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=\" Father's Middle Name \"]//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_FatherMiddleNameInputBox;

	public WebElement customerPersonalDetailsFatherMiddleNameInputBox() {
		return customerPersonalDetails_FatherMiddleNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=\" Father's Last Name \"]//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_FatherLastNameInputBox;

	public WebElement customerPersonalDetailsFatherLastNameInputBox() {
		return customerPersonalDetails_FatherLastNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=\" Spouse's First Name \"]//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_SpouseFirstNameInputBox;

	public WebElement customerPersonalDetailsSpouseFirstNameInputBox() {
		return customerPersonalDetails_SpouseFirstNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=\" Spouse's Middle Name \"]//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_SpouseMiddleNameInputBox;

	public WebElement customerPersonalDetailsSpouseMiddleNameInputBox() {
		return customerPersonalDetails_SpouseMiddleNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=\" Spouse's Last Name \"]//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_SpouseLastNameInputBox;

	public WebElement customerPersonalDetailsSpouseLastNameInputBox() {
		return customerPersonalDetails_SpouseLastNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=\" No. Of Children \"]//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_NoOfChildrenInputBox;

	public WebElement customerPersonalDetailsNoOfChildrenInputBox() {
		return customerPersonalDetails_NoOfChildrenInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Spouse Status ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_SpouseStatusInputBox;

	public WebElement customerPersonalDetailsSpouseStatusInputBox() {
		return customerPersonalDetails_SpouseStatusInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Date of Birth ']//parent::div//following-sibling::p-calendar//button")
	private WebElement customerPersonalDetails_DateOfBirthCalendarInputBox;

	public WebElement customerPersonalDetailsDateOfBirthCalendarInputBox() {
		return customerPersonalDetails_DateOfBirthCalendarInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Gender ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_GenderDropDown;

	public WebElement customerPersonalDetailsGenderDropDown() {
		return customerPersonalDetails_GenderDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Education Level ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_EducationLevelDropDown;

	public WebElement customerPersonalDetailsEducationLevelDropDown() {
		return customerPersonalDetails_EducationLevelDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Marital Status ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_MaritalStatusDropDown;

	public WebElement customerPersonalDetailsMaritalStatusDropDown() {
		return customerPersonalDetails_MaritalStatusDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Nationality ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_NationalityDropDown;

	public WebElement customerPersonalDetailsNationalityDropDown() {
		return customerPersonalDetails_NationalityDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Ethinicity ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_EthinicityDropDown;

	public WebElement customerPersonalDetailsEthinicityDropDown() {
		return customerPersonalDetails_EthinicityDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Religion ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_ReligionDropDown;

	public WebElement customerPersonalDetailsReligionDropDown() {
		return customerPersonalDetails_ReligionDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Residential Status ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_ResidentialStatusDropDown;

	public WebElement customerPersonalDetailsResidentialStatusDropDown() {
		return customerPersonalDetails_ResidentialStatusDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Language ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_LanguageDropDown;

	public WebElement customerPersonalDetailsLanguageDropDown() {
		return customerPersonalDetails_LanguageDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' No of Dependents ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_NoOfDependentsInputBox;

	public WebElement customerPersonalDetailsNoOfDependentsInputBox() {
		return customerPersonalDetails_NoOfDependentsInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Mothers Maiden Name ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_MothersMaidenNameInputBox;

	public WebElement customerPersonalDetailsMothersMaidenNameInputBox() {
		return customerPersonalDetails_MothersMaidenNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Type of Residence ']/following-sibling::ion-select")
	private WebElement customerPersonalDetails_TypeOfResidenceInputBox;

	public WebElement customerPersonalDetailsTypeOfResidenceInputBox() {
		return customerPersonalDetails_TypeOfResidenceInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Category of Client ']/following-sibling::ion-select")
	private WebElement customerPersonalDetails_CategoryOfClientDropDown;

	public WebElement customerPersonalDetailsCategoryOfClientDropDown() {
		return customerPersonalDetails_CategoryOfClientDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Rating ']/following-sibling::ion-input//input")
	private WebElement customerDetails_RatingInputBox;

	public WebElement customerDetailsRatingInputBox() {
		return customerDetails_RatingInputBox;
	}

	@FindBy(xpath = "//textarea")
	private WebElement customerDetails_Remark;

	public WebElement customerDetaisRemark() {
		return customerDetails_Remark;
	}

	
	
	
}
