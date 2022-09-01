package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULSTransaction_CustomerPersonalDetailsObj {
	WebDriver driver;

	public ULSTransaction_CustomerPersonalDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Transactions']")
	private WebElement uls_TrasactionMainMenu;

	public WebElement ulsTransactionMainMenu() {
		return uls_TrasactionMainMenu;
	}

	@FindBy(xpath = "//ion-label[text()='Application manager']")
	private WebElement uls_ApplicationManagerMainMenu;

	public WebElement ulsApplicationManagerMainMenu() {
		return uls_ApplicationManagerMainMenu;
	}

	@FindBy(xpath = "//ion-label[text()='Application Details']//parent::ion-item//ion-buttons//ion-button[1]")
	public WebElement uls_ApplicationDetailsTempView;

	public WebElement ulsApplicationDetailsTempView() {
		return uls_ApplicationDetailsTempView;
	}

	@FindBy(xpath = "//ion-label[text()=' Customer Type ']//following-sibling::ion-select")
	private WebElement customerDetails_CustomerTypeDropDown;

	public WebElement customerDetailsCustomerTypeDropDown() {
		return customerDetails_CustomerTypeDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' CIF ID ']//following-sibling::ion-input//input")
	private WebElement customerDetails_CIFIDInputBox;

	public WebElement customerDetailsCIfInputBox() {
		return customerDetails_CIFIDInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' ID Type ']//following-sibling::ion-select")
	private WebElement customerDetails_IDTypeDropDown;

	public WebElement customerDetailsIDTypeDropDown() {
		return customerDetails_IDTypeDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' ID Number ']//following-sibling::ion-input//input")
	private WebElement customerDetails_IDNumberInputBox;

	public WebElement customerDetailsIDNumberInputBox() {
		return customerDetails_IDNumberInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Company Name ']//following-sibling::ion-input//input")
	private WebElement customerDetails_CompanyNameInputBox;

	public WebElement customerDetailsCompanyNameInputBox() {
		return customerDetails_CompanyNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Application Number ']//following-sibling::ion-input//input")
	private WebElement customerDetails_ApplicationNumberInputBox;

	public WebElement customerDetailsApplicationNumberInputBox() {
		return customerDetails_ApplicationNumberInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Customer Name ']//following-sibling::ion-input//input")
	private WebElement customerDetails_CustomerNameInputBox;

	public WebElement customerDetailsCustomerNameInputBox() {
		return customerDetails_CustomerNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Mobile Number ']//following-sibling::ion-input//input")
	private WebElement customerDetails_MobileNumberInputBox;

	public WebElement customerDetailsMobileNumberInputBox() {
		return customerDetails_MobileNumberInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Date of Birth ']//parent::div//following-sibling::p-calendar//button")
	private WebElement customerDetails_DateOfBirthCalendar;

	public WebElement customerDetailsDateOfBirthInputCalendar() {
		return customerDetails_DateOfBirthCalendar;
	}

	@FindBy(xpath = "//ion-label[text()=' Email ID ']//following-sibling::ion-input//input")
	private WebElement customerDetails_EmailIDInputBox;

	public WebElement customerDetailsEmailIDInputBox() {
		return customerDetails_EmailIDInputBox;
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

	@FindBy(xpath = "//ion-label[text()='Existing Bank Relationship ']/parent::div/parent::digital-radio-button//ion-toggle")
	private WebElement customerPersonalDetails_ExistingBankRelationshipToggleButton;

	public WebElement customerPersonalDetailsExistingBankRelationShipToggleButton() {
		return customerPersonalDetails_ExistingBankRelationshipToggleButton;
	}

	@FindBy(xpath = "//ion-label[text()='Blacklisted ']/parent::div/parent::digital-radio-button//ion-toggle")
	private WebElement customerPersonalDetails_BlackListedToggleButton;

	public WebElement customerPersonalDetailsBlackListedToggleButton() {
		return customerPersonalDetails_BlackListedToggleButton;
	}
	@FindBy(xpath="//ion-label[text()=' Phone number ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_PhoneNumberInputBox;

	public WebElement customerPersonalDetailsPhoneNumberInputBox() {
		return customerPersonalDetails_PhoneNumberInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Mobile Number (Primary) ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_MobileNumberPrimaryInputBox;

	public WebElement customerPersonalDetailsMobileNumberPrimaryInputBox() {
		return customerPersonalDetails_MobileNumberPrimaryInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Mobile Number (Secondary) ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_MobileNumberSecondaryInputBox;

	public WebElement customerPersonalDetailsMobileNumberSecondaryInputBox() {
		return customerPersonalDetails_MobileNumberSecondaryInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' EMAIL ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_EMAILInputBox;

	public WebElement customerPersonalDetailsEMAILInputBox() {
		return customerPersonalDetails_EMAILInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Prefered Contact method ']//following-sibling::ion-select")
	private WebElement customerPersonalDetails_PerfectContactMethodDropDown;

	public WebElement customerPersonalDetailsPerfectContactMethodDropDown() {
		return customerPersonalDetails_PerfectContactMethodDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Prefered time for contact ']//following-sibling::ion-input//input")
	private WebElement customerPersonalDetails_PreferedTimeForContactInputBox;

	public WebElement customerPersonalDetailsPreferedTimeForContactInputBox() {
		return customerPersonalDetails_PreferedTimeForContactInputBox;
	}
}
