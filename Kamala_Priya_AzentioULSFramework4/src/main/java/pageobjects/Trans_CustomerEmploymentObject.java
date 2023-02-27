package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trans_CustomerEmploymentObject {
	
	WebDriver driver;
	
	public Trans_CustomerEmploymentObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//ion-icon[@ng-reflect-name='mail-unread-outline']")
private WebElement Trans_CxEmplyObj_InboxIcon1;
public WebElement Trans_CxEmplyObj_InboxIcon() {
	return Trans_CxEmplyObj_InboxIcon1;
}
@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]/span[1]")//(//button[@ng-reflect-text='Search'])[1]")
private WebElement Trans_CxEmplyObj_SearchButton1;
public WebElement Trans_CxEmplyObj_SearchButton() {
	return Trans_CxEmplyObj_SearchButton1;
}
@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
private WebElement Trans_CxEmplyObj_SearchBar1;
public WebElement Trans_CxEmplyObj_SearchBar() {
	return Trans_CxEmplyObj_SearchBar1;
}
@FindBy(xpath="//tbody/tr[1]/td[1]/button[1]")//(//td[contains(text(),'APPDATAENT')])[1]//preceding-sibling::td[7]/button")
private WebElement Trans_CxEmplyObj_ActionIcon1;
public WebElement Trans_CxEmplyObj_ActionIcon() {
	return Trans_CxEmplyObj_ActionIcon1;
}
@FindBy(xpath="//ion-segment-button[@id='seg4']")
private WebElement Trans_CxEmplyObj_CxFinancialTab1;
public WebElement Trans_CxEmplyObj_CxFinancialTab() {
	return Trans_CxEmplyObj_CxFinancialTab1;
}
@FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")
private WebElement Trans_CxEmplyObj_CxFinancialEditIcon1;
public WebElement Trans_CxEmplyObj_CxFinancialEditIcon1() {
	return Trans_CxEmplyObj_CxFinancialEditIcon1;
}
@FindBy(xpath="//ion-title[text()=' Customer Employment List ']/parent::ion-card-header/following-sibling::ion-card-content//button[@ng-reflect-text='Add']")
private WebElement Trans_CxEmplyObj_CxFinancialAddButton1;
public WebElement Trans_CxEmplyObj_CxFinancialAddButton() {
	return Trans_CxEmplyObj_CxFinancialAddButton1;
}
@FindBy(xpath="//ion-label[text()=' Nature of Employment ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_NatureOfEmployment1;
public WebElement Trans_CxFinancial_NatureOfEmployment() {
	return Trans_CxFinancial_NatureOfEmployment1;
}
@FindBy(xpath="//ion-label[text()=' Profession ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_Profession1;
public WebElement Trans_CxFinancial_Profession() {
	return Trans_CxFinancial_Profession1;
}
@FindBy(xpath="//ion-label[text()=' Statutory Authority ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_StatutotyAuthority1;
public WebElement Trans_CxFinancial_StatutotyAuthority() {
	return Trans_CxFinancial_StatutotyAuthority1;
}
@FindBy(xpath=" //ion-label[text()=' Employer Name if (Others) ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_EmployerNameOther1;
public WebElement Trans_CxFinancial_EmployerNameOther1() {
	return Trans_CxFinancial_EmployerName1;
}
@FindBy(xpath=" //ion-label[text()=' Department ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_Department1;
public WebElement Trans_CxFinancial_Department() {
	return Trans_CxFinancial_Department1;
}
@FindBy(xpath=" //ion-label[text()=' Employment Type ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_EmploymentType1;
public WebElement Trans_CxFinancial_EmploymentType() {
	return Trans_CxFinancial_EmploymentType1;
}
@FindBy(xpath=" //ion-label[text()=' Direct Manager Telephone ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_directManagerTelephone1;
public WebElement Trans_CxFinancial_directManagerTelephone() {
	return Trans_CxFinancial_directManagerTelephone1;
}
@FindBy(xpath=" //ion-label[text()=' Employer Phone Number ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_EmployerPhoneNumber1;
public WebElement Trans_CxFinancial_EmployerPhoneNumber() {
	return Trans_CxFinancial_EmployerPhoneNumber1;
}
@FindBy(xpath="  //ion-label[text()=' City ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_City1;
public WebElement Trans_CxFinancial_City() {
	return Trans_CxFinancial_City1;
}
@FindBy(xpath="  //ion-label[text()=' Sector ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_Sector1;
public WebElement Trans_CxFinancial_Sector() {
	return Trans_CxFinancial_Sector1;
}
@FindBy(xpath=" //ion-label[text()=' No Of Partners ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_NoOFPartners1;
public WebElement Trans_CxFinancial_NoOFPartners() {
	return Trans_CxFinancial_NoOFPartners1;
}
@FindBy(xpath=" //ion-label[text()=' Registered Business Name ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_RegisteredBusinessName1;
public WebElement Trans_CxFinancial_RegisteredBusinessName() {
	return Trans_CxFinancial_RegisteredBusinessName1;
}
@FindBy(xpath=" //ion-label[text()=' Registered Bussiness Number ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_RegisteredBusinessNumber1;
public WebElement Trans_CxFinancial_RegisteredBusinessNumber() {
	return Trans_CxFinancial_RegisteredBusinessNumber1;
}
@FindBy(xpath="  //ion-label[text()=' Share Holder Percentage ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_ShareHolderPercentage1;
public WebElement Trans_CxFinancial_ShareHolderPercentage() {
	return Trans_CxFinancial_ShareHolderPercentage1;
}
@FindBy(xpath="  //ion-label[text()=' Total Experience(Years) ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_TotalExperienceYears1;
public WebElement Trans_CxFinancial_TotalExperienceYears() {
	return Trans_CxFinancial_TotalExperienceYears1;
}
@FindBy(xpath="   //ion-label[text()=' Direct Manager ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_DirectManager1;
public WebElement Trans_CxFinancial_DirectManager() {
	return Trans_CxFinancial_DirectManager1;
}
@FindBy(xpath=" //ion-label[text()=' Retirement Age(Years) ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_RetirementAge1;
public WebElement Trans_CxFinancial_RetirementAge() {
	return Trans_CxFinancial_RetirementAge1;
}
@FindBy(xpath=" //ion-label[text()=' Employment Period ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_EmploymentPeriod1;
public WebElement Trans_CxFinancial_EmploymentPeriod() {
	return Trans_CxFinancial_EmploymentPeriod1;
}
@FindBy(xpath="  //ion-label[text()=' Company Type ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_CompanyType1;
public WebElement Trans_CxFinancial_CompanyType() {
	return Trans_CxFinancial_CompanyType1;
}
@FindBy(xpath=" //ion-label[text()=' Profession Type ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_ProfessionType1;
public WebElement Trans_CxFinancial_ProfessionType() {
	return Trans_CxFinancial_ProfessionType1;
}
@FindBy(xpath=" //ion-label[text()=' Employer Name ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_EmployerName1;
public WebElement Trans_CxFinancial_EmployerName() {
	return Trans_CxFinancial_EmployerName1;
}
@FindBy(xpath=" //ion-label[text()=' Employee ID ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_EmployeeID1;
public WebElement Trans_CxFinancial_EmployeeID() {
	return Trans_CxFinancial_EmployeeID1;
}
@FindBy(xpath=" //ion-label[text()=' Designation ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_Designation1;
public WebElement Trans_CxFinancial_Designation() {
	return Trans_CxFinancial_Designation1;
}
@FindBy(xpath=" //ion-label[text()=' Direct Manager Contact Number Extension ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_DirectManagerNumExt1;
public WebElement Trans_CxFinancial_DirectManagerNumExt() {
	return Trans_CxFinancial_DirectManagerNumExt1;
}
@FindBy(xpath=" //ion-label[text()=' Employer Phone Extension ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_EmpPhoneExt1;
public WebElement Trans_CxFinancial_EmpPhoneExt() {
	return Trans_CxFinancial_EmpPhoneExt1;
}
@FindBy(xpath=" //ion-label[text()=' State ']//following-sibling::ion-select")
private WebElement Trans_cxFinancial_State1;
public WebElement Trans_cxFinancial_State() {
	return Trans_cxFinancial_State1;
}
@FindBy(xpath=" //ion-label[text()=' Pincode ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_Pincode1;
public WebElement Trans_CxFinancial_Pincode() {
	return Trans_CxFinancial_Pincode1;
}
@FindBy(xpath=" //ion-label[text()=' Industry Sub Sector ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_IndustrySubSector1;
public WebElement Trans_CxFinancial_IndustrySubSector() {
	return Trans_CxFinancial_IndustrySubSector1;
}
@FindBy(xpath=" //ion-label[text()=' Nature OF Business ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_NatureOfBusiness1;
public WebElement Trans_CxFinancial_NatureOfBusiness() {
	return Trans_CxFinancial_NatureOfBusiness1;
}
@FindBy(xpath=" //ion-label[text()=' Registered Bussiness Number ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_RegBusinessNum1;
public WebElement Trans_CxFinancial_RegBusinessNum() {
	return Trans_CxFinancial_RegBusinessNum1;
}
@FindBy(xpath=" //ion-label[text()=' Office Premises Type ']//following-sibling::ion-select")
private WebElement Trans_CxFinancial_OfficePremisesType1;
public WebElement Trans_CxFinancial_OfficePremisesType() {
	return Trans_CxFinancial_OfficePremisesType1;
}
@FindBy(xpath=" //ion-label[text()=' No of Employees ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_NoOfEmployees1;
public WebElement Trans_CxFinancial_NoOfEmployees() {
	return Trans_CxFinancial_NoOfEmployees1;
}
@FindBy(xpath=" //ion-label[text()=' Experience at Current Employment ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_ExpCurrentEmp1;
public WebElement Trans_CxFinancial_ExpCurrentEmp() {
	return Trans_CxFinancial_ExpCurrentEmp1;
}
@FindBy(xpath=" //ion-label[text()=' Employer City Code ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_EmpCityCode1;
public WebElement Trans_CxFinancial_EmpCityCode() {
	return Trans_CxFinancial_EmpCityCode1;
}
@FindBy(xpath=" //ion-col[16]/digital-text-box[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
private WebElement Trans_CxFinancial_Remarks1;
public WebElement Trans_CxFinancial_Remarks() {
	return Trans_CxFinancial_Remarks1;
}
@FindBy(xpath=" //ion-label[text()=' Date of Joining ']//ancestor::ion-item//button")
private WebElement Trans_CxFinancial_DateOfJoining1;
public WebElement Trans_CxFinancial_DateOfJoining() {
	return Trans_CxFinancial_DateOfJoining1;
}
@FindBy(xpath=" //ion-label[text()=' Employment End Date ']//ancestor::ion-item//button")
private WebElement Trans_CxFinancial_EmploymentEndDate1;
public WebElement Trans_CxFinancial_EmploymentEndDate() {
	return Trans_CxFinancial_EmploymentEndDate1;
}
@FindBy(xpath=" //ion-label[text()=' Business Registration date ']//ancestor::ion-item//button")
private WebElement Trans_CxFinancial_BusinessRegistrationdate1;
public WebElement Trans_CxFinancial_BusinessRegistrationdate() {
	return Trans_CxFinancial_BusinessRegistrationdate1;
}
@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
private WebElement nextbuttonIncalendar;
public WebElement nextbuttonIncalendar() {
    return nextbuttonIncalendar;
}
@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
private WebElement previousbuttonIncalendar;
public WebElement previousbuttonIncalendar() {
    return previousbuttonIncalendar;
}
@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-save']")
private WebElement CustomerEmployment_SaveButton1;
public WebElement CustomerEmployment_SaveButton() {
    return CustomerEmployment_SaveButton1;
}
@FindBy(xpath = "(//button[@ng-reflect-text='Go Back'])[2]")
private WebElement CustomerEmployment_BackButtonButton1;
public WebElement CustomerEmployment_BackButtonButton() {
    return CustomerEmployment_BackButtonButton1;
}
@FindBy(xpath = "//span[contains(text(),'Bank')]")
private WebElement CustomerEmployment_MachedDataList1;
public WebElement CustomerEmployment_MachedDataList() {
    return CustomerEmployment_MachedDataList1;
}
@FindBy(xpath="(//span[text()='Export']/following-sibling::div/span)[2]")
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
@FindBy(xpath = "//ion-title[text()=' Customer Employment List ']/parent::ion-card-header/following-sibling::ion-card-content//button[@ng-reflect-text='Search']")
private WebElement CustomerEmployment_ListViewSearch1;
public WebElement CustomerEmployment_ListViewSearch() {
    return CustomerEmployment_ListViewSearch1;
}
@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/input[1]")
private WebElement CustomerEmployment_ListViewSearchtext1;
public WebElement CustomerEmployment_ListViewSearchtext() {
    return CustomerEmployment_ListViewSearchtext1;
}
@FindBy(xpath=" //ion-label[text()=' No Of Partners ']//following-sibling::ion-input")
private WebElement Trans_CxFinancial_NoOFPartners1_verification;
public WebElement Trans_CxFinancial_NoOFPartners_verification() {
    return Trans_CxFinancial_NoOFPartners1_verification;
}
@FindBy(xpath = "//ion-label[text()=' Employer Name if (Others) ']//following-sibling::ion-input")
private WebElement CustomerEmployment_EmployeeNameIfOtherdataHolder;

public WebElement CustomerEmploymentEmployeeNameIfOtherdataHolder() {
	return CustomerEmployment_EmployeeNameIfOtherdataHolder;
}

@FindBy(xpath = "//ion-label[text()=' Employee ID ']//following-sibling::ion-input")
private WebElement CustomerEmployment_EmployeeIDDataHolder;

public WebElement CustomerEmploymentEmployeeIDDataHolder() {
	return CustomerEmployment_EmployeeIDDataHolder;
}

@FindBy(xpath = "//ion-label[text()=' Date of Joining ']/parent::div/following-sibling::p-calendar//input")
private WebElement customerEmploymentDetails_dateOfJoingInputBox;

public WebElement customerEmploymentDetailsdateOfJoingInputBox() {
	return customerEmploymentDetails_dateOfJoingInputBox;
}

@FindBy(xpath = "//span[text()='Clear']//parent::button")
private WebElement customerEmploymentDetails_ClearButton;

public WebElement customerEmploymentDetailsClearButton() {
	return customerEmploymentDetails_ClearButton;
}

@FindBy(xpath = "//ion-label[text()=' Employment End Date ']/parent::div/following-sibling::p-calendar//input")
private WebElement customerEmploymentDetails_EmploymentEnddateInputBox;

public WebElement customerEmploymentDetailsEmploymentEnddateInputBox() {
	return customerEmploymentDetails_EmploymentEnddateInputBox;
}

@FindBy(xpath = "//ion-label[text()=' Direct Manager Contact Number Extension ']//following-sibling::ion-input")
private WebElement customerEmploymentDetails_DirectManagerContactNumberExtensionDateInputBox;

public WebElement customerEmploymentDetailsDirectManagerContactNumberExtensionDateInputBox() {
	return customerEmploymentDetails_DirectManagerContactNumberExtensionDateInputBox;
}

@FindBy(xpath = "//ion-label[text()=' Direct Manager Telephone ']//following-sibling::ion-input")
private WebElement customerEmploymentDetails_DirectManagerTelePhoneDateInputBox;

public WebElement customerEmploymentDetailsDirectManagerTelePhoneDateInputBox() {
	return customerEmploymentDetails_DirectManagerTelePhoneDateInputBox;
}

@FindBy(xpath = "//ion-label[text()=' Employer Phone Extension ']//following-sibling::ion-input")
private WebElement customerEmploymentDetails_EmployerPhoneExtensionDateInputBox;

public WebElement customerEmploymentDetailsEmployerPhoneExtensionDateInputBox() {
	return customerEmploymentDetails_EmployerPhoneExtensionDateInputBox;
}

@FindBy(xpath = "//ion-label[text()=' Pincode ']//following-sibling::ion-input")
private WebElement customerEmploymentDetails_PinCodeDateInputBox;

public WebElement customerEmploymentDetailsPinCodeDateInputBox() {
	return customerEmploymentDetails_PinCodeDateInputBox;
}

@FindBy(xpath = "//ion-label[text()=' Total Experience(Years) ']//following-sibling::ion-input")
private WebElement customerEmploymentDetails_TotalExperienceYearsDateInputBox;

public WebElement customerEmploymentDetailsTotalExperienceYearsDateInputBox() {
	return customerEmploymentDetails_TotalExperienceYearsDateInputBox;
}

@FindBy(xpath = "//ion-label[text()=' Experience at Current Employment ']//following-sibling::ion-input")
private WebElement customerEmploymentDetails_ExperienceAtCurrentEmploymentDateHolder;

public WebElement customerEmploymentDetailsExperienceAtCurrentEmploymentDateHolder() {
	return customerEmploymentDetails_ExperienceAtCurrentEmploymentDateHolder;
}

@FindBy(xpath = "//ion-label[text()=' Direct Manager ']//following-sibling::ion-input")
private WebElement customerEmploymentDetails_DirectmanagerDateHolder;

public WebElement customerEmploymentDetailsDirectmanagerDateHolder() {
	return customerEmploymentDetails_DirectmanagerDateHolder;
}

@FindBy(xpath = "//ion-label[text()=' Employer City Code ']//following-sibling::ion-input")
private WebElement customerEmploymentDetails_EmployerCityCodeDateHolder;

public WebElement customerEmploymentDetailsEmployerCityCodeDateHolder() {
	return customerEmploymentDetails_EmployerCityCodeDateHolder;
}

@FindBy(xpath = "//ion-label[text()=' Retirement Age(Years) ']//following-sibling::ion-input")

private WebElement customerEmploymentDetails_RetirementAgeYearsDateHolder;

public WebElement customerEmploymentDetailsRetirementAgeYearsDateHolder() {
	return customerEmploymentDetails_RetirementAgeYearsDateHolder;
}

@FindBy(xpath = "//ion-label[text()=' Employment Period ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_EmploymentPeriodFieldvalidation;

public WebElement customerEmploymentDetailsEmploymentPeriodFieldvalidation() {
	return customerEmploymentDetails_EmploymentPeriodFieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Nature of Employment ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_natureOfEmploymentFieldvalidation;

public WebElement customerEmploymentDetailsnatureOfEmploymentFieldvalidation() {
	return customerEmploymentDetails_natureOfEmploymentFieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Employer Name ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_EmployerNameFieldvalidation;

public WebElement customerEmploymentDetailsEmployerNameFieldvalidation() {
	return customerEmploymentDetails_EmployerNameFieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Employer Name if (Others) ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_EmployerNameIfOtherFieldvalidation;

public WebElement customerEmploymentDetailsEmployerNameIfOtherFieldvalidation() {
	return customerEmploymentDetails_EmployerNameIfOtherFieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Employee ID ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_EmployeeIDFieldvalidation;

public WebElement customerEmploymentDetailsEmployeeIDFieldvalidation() {
	return customerEmploymentDetails_EmployeeIDFieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Date of Joining ']//ancestor::digital-prime-date//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_dateOfJoiningFieldvalidation;

public WebElement customerEmploymentDetailsdateOfJoiningFieldvalidation() {
	return customerEmploymentDetails_dateOfJoiningFieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Total Experience(Years) ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_TotalExperienceYearsFieldvalidation;

public WebElement customerEmploymentDetailsTotalExperienceYearsFieldvalidation() {
	return customerEmploymentDetails_TotalExperienceYearsFieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Retirement Age(Years) ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_retirementAgeYearsFieldvalidation;

public WebElement customerEmploymentDetailsretirementAgeYearsFieldvalidation() {
	return customerEmploymentDetails_retirementAgeYearsFieldvalidation;
}

@FindBy(xpath = "(//ion-label[text()=' Employer Phone Number ']//ancestor::digital-text-box//following-sibling::div//ion-badge)[1]")
private WebElement customerEmploymentDetails_EmployerPhoneNumberFieldvalidation;

public WebElement customerEmploymentDetailsEmployerPhoneNumberFieldvalidation() {
	return customerEmploymentDetails_EmployerPhoneNumberFieldvalidation;
}

@FindBy(xpath = "(//ion-label[text()=' Employer Phone Number ']//ancestor::digital-text-box//following-sibling::div//ion-badge)[2]")
private WebElement customerEmploymentDetails_EmployerPhoneNumber2Fieldvalidation;

public WebElement customerEmploymentDetailsEmployerPhoneNumber2Fieldvalidation() {
	return customerEmploymentDetails_EmployerPhoneNumber2Fieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Direct Manager Telephone ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_DirectManagerTelePhoneFieldvalidation;

public WebElement customerEmploymentDetailsDirectManagerTelePhoneFieldvalidation() {
	return customerEmploymentDetails_DirectManagerTelePhoneFieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Employer Phone Extension ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_EmployerPhoneExtensionFieldvalidation;

public WebElement customerEmploymentDetailsEmployerPhoneExtensionFieldvalidation() {
	return customerEmploymentDetails_EmployerPhoneExtensionFieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Direct Manager ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_DirectManagerFieldvalidation;

public WebElement customerEmploymentDetailsDirectManagerFieldvalidation() {
	return customerEmploymentDetails_DirectManagerFieldvalidation;
}

@FindBy(xpath = "//ion-label[text()=' Employment Type ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
private WebElement customerEmploymentDetails_EmploymentTypeFieldvalidation;

public WebElement customerEmploymentDetailsEmploymentTypeFieldvalidation() {
	return customerEmploymentDetails_EmploymentTypeFieldvalidation;
}
@FindBy(xpath="(//button[@ng-reflect-text='Go Back'])[2]")
private WebElement customerEmploymentDetails_BackButton;

public WebElement customerEmploymentDetailsBackButton() {
	return customerEmploymentDetails_BackButton;
}
@FindBy(xpath="//ion-title[text()=' Customer Employment List ']")
private WebElement customerEmploymentDetails_BackButtonVerification;

public WebElement customerEmploymentDetailsBackButtonVerification() {
	return customerEmploymentDetails_BackButtonVerification;
}	

@FindBy(xpath = "(//ion-title[text()=' Customer Employment List ']//parent::ion-card-header//parent::ion-card//ion-card-content//button[@ng-reflect-text='Edit'])[1]")
private WebElement customerEmploymentDetails_EditIcon;

public WebElement customerEmploymentDetailsEditIcon() {
	return customerEmploymentDetails_EditIcon;
}
@FindBy(xpath = "//ion-label[text()=' Employer Name if (Others) ']//following-sibling::ion-input/input")
private WebElement Trans_CxFinancial_EmployerNameIfOther;

public WebElement Trans_CxFinancialEmployerNameIfOther() {
	return Trans_CxFinancial_EmployerNameIfOther;
}
//Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement customerEmployment_Maker_MenuToggle;

	public WebElement customerEmployment_Maker_MenuToggle() {
		return customerEmployment_Maker_MenuToggle;
	}
	
	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement customerEmployment_Inbox;

	public WebElement customerEmployment_Inbox() {
		return customerEmployment_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement customerEmployment_SearchInbox;

	public WebElement customerEmployment_SearchInbox() {
		return customerEmployment_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement customerEmployment_SearchInboxInputField;

	public WebElement customerEmployment_SearchInboxInputField() {
		return customerEmployment_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement customerEmployment_SearchInboxCloseButton;

	public WebElement propertyDetails_SearchInboxCloseButton() {
		return customerEmployment_SearchInboxCloseButton;
	}
	
	// search button
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement customerEmployment_SearchButton;

	public WebElement customerEmployment_SearchButton() {
		return customerEmployment_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div[3]/span/input")
	private WebElement customerEmployment_SearchInputField;

	public WebElement customerEmployment_SearchInputField() {
		return customerEmployment_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement customerEmployment_SearchCloseButton;

	public WebElement customerEmployment_SearchCloseButton() {
		return customerEmployment_SearchCloseButton;
	}
	
	// customer financial tab button
	@FindBy(xpath = "//ion-modal[1]/descendant::ion-segment-button[@id='seg4']")
	private WebElement customerEmployment_CustomerFinancialTab;
	
	public WebElement customerEmployment_CustomerFinancialTab() {
		return customerEmployment_CustomerFinancialTab;
	}
	
	// Customer Employment first record edit button
	@FindBy(xpath = "//ion-title[contains(text(),' Customer Employment List ')]/../../ion-card-content/descendant::tbody/tr/td[1]/span/button[1]")
	private WebElement customerEmployment_CustomerEmploymentFirstRecordEdit;
	
	public WebElement customerEmployment_CustomerEmploymentFirstRecordEdit() {
		return customerEmployment_CustomerEmploymentFirstRecordEdit;
	}
	
	@FindBy(xpath = " //ion-label[text()=' Employee ID ']//following-sibling::ion-input/input")
	private WebElement customerEmployment_EmployeeID;

	public WebElement customerEmployment_EmployeeID() {
		return customerEmployment_EmployeeID;
	}
	

	//Save button
	@FindBy(xpath = "//ion-col[3]/button[1]/span[1]")
	private WebElement customerEmployment_SaveButton;
	
	public WebElement customerEmployment_SaveButton() {
		return customerEmployment_SaveButton;
	}
	
	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement customerEmployment_SaveConfirmationMessage;

	public WebElement customerEmployment_SaveConfirmationMessage() {
		return customerEmployment_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement customerEmployment_SaveConfirmationMessageCloseButton;

	public WebElement customerEmployment_SaveConfirmationMessageCloseButton() {
		return customerEmployment_SaveConfirmationMessageCloseButton;
	}
	
}
