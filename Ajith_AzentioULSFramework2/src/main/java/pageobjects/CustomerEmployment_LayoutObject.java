package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerEmployment_LayoutObject {

	WebDriver driver;

	public CustomerEmployment_LayoutObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement Trans_CxEmplyObj_InboxIcon1;

	public WebElement Trans_CxEmplyObj_InboxIcon() {
		return Trans_CxEmplyObj_InboxIcon1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Search'])[1]")
	private WebElement Trans_CxEmplyObj_SearchButton1;

	public WebElement Trans_CxEmplyObj_SearchButton() {
		return Trans_CxEmplyObj_SearchButton1;
	}

	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement Trans_CxEmplyObj_SearchBar1;

	public WebElement Trans_CxEmplyObj_SearchBar() {
		return Trans_CxEmplyObj_SearchBar1;
	}

	@FindBy(xpath = "(//td[text()=' APPDATAENT '])[1]//preceding-sibling::td[3]/button")
	private WebElement Trans_CxEmplyObj_ActionIcon1;

	public WebElement Trans_CxEmplyObj_ActionIcon() {
		return Trans_CxEmplyObj_ActionIcon1;
	}

	@FindBy(xpath = "//ion-segment-button[@id='seg4']")
	private WebElement Trans_CxEmplyObj_CxFinancialTab1;

	public WebElement Trans_CxEmplyObj_CxFinancialTab() {
		return Trans_CxEmplyObj_CxFinancialTab1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement Trans_CxEmplyObj_CxFinancialEditIcon1;

	public WebElement Trans_CxEmplyObj_CxFinancialEditIcon1() {
		return Trans_CxEmplyObj_CxFinancialEditIcon1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text=\"Edit\"])[2]")
	private WebElement Trans_CxEmplyObj_CxCustomerEmploymentListEditIcon1;

	public WebElement Trans_CxEmplyObj_CxCustomerEmploymentListEditIcon1() {
		return Trans_CxEmplyObj_CxCustomerEmploymentListEditIcon1;
	}

	@FindBy(xpath = "//ion-title[text()=' Customer Employment List ']/parent::ion-card-header/following-sibling::ion-card-content//button[@ng-reflect-text='Add']")
	private WebElement Trans_CxEmplyObj_CxFinancialAddButton1;

	public WebElement Trans_CxEmplyObj_CxFinancialAddButton() {
		return Trans_CxEmplyObj_CxFinancialAddButton1;
	}

	@FindBy(xpath = "//ion-label[text()=' Nature of Employment ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_NatureOfEmployment1;

	public WebElement Trans_CxFinancial_NatureOfEmployment() {
		return Trans_CxFinancial_NatureOfEmployment1;
	}

	@FindBy(xpath = "//ion-label[text()=' Profession ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_Profession1;

	public WebElement Trans_CxFinancial_Profession() {
		return Trans_CxFinancial_Profession1;
	}

	@FindBy(xpath = "//ion-label[text()=' Statutory Authority ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_StatutotyAuthority1;

	public WebElement Trans_CxFinancial_StatutotyAuthority() {
		return Trans_CxFinancial_StatutotyAuthority1;
	}

	@FindBy(xpath = "//ion-label[text()=' Employer Name if (Others) ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_EmployerNameOther1;

	public WebElement Trans_CxFinancial_EmployerNameOther1() {
		return Trans_CxFinancial_EmployerName1;
	}

	@FindBy(xpath = "//ion-label[text()=' Department ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_Department1;

	public WebElement Trans_CxFinancial_Department() {
		return Trans_CxFinancial_Department1;
	}

	@FindBy(xpath = "//ion-label[text()=' Employment Type ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_EmploymentType1;

	public WebElement Trans_CxFinancial_EmploymentType() {
		return Trans_CxFinancial_EmploymentType1;
	}

	@FindBy(xpath = "//ion-label[text()=' Direct Manager Telephone ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_directManagerTelephone1;

	public WebElement Trans_CxFinancial_directManagerTelephone() {
		return Trans_CxFinancial_directManagerTelephone1;
	}

	@FindBy(xpath = " //ion-label[text()=' Employer Phone Number ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_EmployerPhoneNumber1;

	public WebElement Trans_CxFinancial_EmployerPhoneNumber() {
		return Trans_CxFinancial_EmployerPhoneNumber1;
	}

	@FindBy(xpath = "  //ion-label[text()=' City ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_City1;

	public WebElement Trans_CxFinancial_City() {
		return Trans_CxFinancial_City1;
	}

	@FindBy(xpath = "  //ion-label[text()=' Sector ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_Sector1;

	public WebElement Trans_CxFinancial_Sector() {
		return Trans_CxFinancial_Sector1;
	}

	@FindBy(xpath = " //ion-label[text()=' No Of Partners ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_NoOFPartners1;

	public WebElement Trans_CxFinancial_NoOFPartners() {
		return Trans_CxFinancial_NoOFPartners1;
	}

	@FindBy(xpath = " //ion-label[text()=' Registered Business Name ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_RegisteredBusinessName1;

	public WebElement Trans_CxFinancial_RegisteredBusinessName() {
		return Trans_CxFinancial_RegisteredBusinessName1;
	}

	@FindBy(xpath = "  //ion-label[text()=' Share Holder Percentage ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_ShareHolderPercentage1;

	public WebElement Trans_CxFinancial_ShareHolderPercentage() {
		return Trans_CxFinancial_ShareHolderPercentage1;
	}

	@FindBy(xpath = "  //ion-label[text()=' Total Experience(Years) ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_TotalExperienceYears1;

	public WebElement Trans_CxFinancial_TotalExperienceYears() {
		return Trans_CxFinancial_TotalExperienceYears1;
	}

	@FindBy(xpath = "   //ion-label[text()=' Direct Manager ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_DirectManager1;

	public WebElement Trans_CxFinancial_DirectManager() {
		return Trans_CxFinancial_DirectManager1;
	}

	@FindBy(xpath = " //ion-label[text()=' Retirement Age(Years) ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_RetirementAge1;

	public WebElement Trans_CxFinancial_RetirementAge() {
		return Trans_CxFinancial_RetirementAge1;
	}

	@FindBy(xpath = " //ion-label[text()=' Employment Period ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_EmploymentPeriod1;

	public WebElement Trans_CxFinancial_EmploymentPeriod() {
		return Trans_CxFinancial_EmploymentPeriod1;
	}

	@FindBy(xpath = "  //ion-label[text()=' Company Type ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_CompanyType1;

	public WebElement Trans_CxFinancial_CompanyType() {
		return Trans_CxFinancial_CompanyType1;
	}

	@FindBy(xpath = " //ion-label[text()=' Profession Type ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_ProfessionType1;

	public WebElement Trans_CxFinancial_ProfessionType() {
		return Trans_CxFinancial_ProfessionType1;
	}

	@FindBy(xpath = " //ion-label[text()=' Employer Name ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_EmployerName1;

	public WebElement Trans_CxFinancial_EmployerName() {
		return Trans_CxFinancial_EmployerName1;
	}

	@FindBy(xpath = " //ion-label[text()=' Employee ID ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_EmployeeID1;

	public WebElement Trans_CxFinancial_EmployeeID() {
		return Trans_CxFinancial_EmployeeID1;
	}

	@FindBy(xpath = " //ion-label[text()=' Designation ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_Designation1;

	public WebElement Trans_CxFinancial_Designation() {
		return Trans_CxFinancial_Designation1;
	}

	@FindBy(xpath = " //ion-label[text()=' Direct Manager Contact Number Extension ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_DirectManagerNumExt1;

	public WebElement Trans_CxFinancial_DirectManagerNumExt() {
		return Trans_CxFinancial_DirectManagerNumExt1;
	}

	@FindBy(xpath = " //ion-label[text()=' Employer Phone Extension ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_EmpPhoneExt1;

	public WebElement Trans_CxFinancial_EmpPhoneExt() {
		return Trans_CxFinancial_EmpPhoneExt1;
	}

	@FindBy(xpath = " //ion-label[text()=' State ']//following-sibling::ion-select")
	private WebElement Trans_cxFinancial_State1;

	public WebElement Trans_cxFinancial_State() {
		return Trans_cxFinancial_State1;
	}

	@FindBy(xpath = " //ion-label[text()=' Pincode ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_Pincode1;

	public WebElement Trans_CxFinancial_Pincode() {
		return Trans_CxFinancial_Pincode1;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Update']") 
    private WebElement customerFinancialetailsUpdate;
    public WebElement customerFinancialetailsUpdate() {
        return customerFinancialetailsUpdate;
    } 
	@FindBy(xpath = " //ion-label[text()=' Industry Sub Sector ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_IndustrySubSector1;

	public WebElement Trans_CxFinancial_IndustrySubSector() {
		return Trans_CxFinancial_IndustrySubSector1;
	}

	@FindBy(xpath = " //ion-label[text()=' Nature OF Business ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_NatureOfBusiness1;

	public WebElement Trans_CxFinancial_NatureOfBusiness() {
		return Trans_CxFinancial_NatureOfBusiness1;
	}

	@FindBy(xpath = " //ion-label[text()=' Registered Bussiness Number ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_RegBusinessNum1;

	public WebElement Trans_CxFinancial_RegBusinessNum() {
		return Trans_CxFinancial_RegBusinessNum1;
	}

	@FindBy(xpath = " //ion-label[text()=' Office Premises Type ']//following-sibling::ion-select")
	private WebElement Trans_CxFinancial_OfficePremisesType1;

	public WebElement Trans_CxFinancial_OfficePremisesType() {
		return Trans_CxFinancial_OfficePremisesType1;
	}

	@FindBy(xpath = " //ion-label[text()=' No of Employees ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_NoOfEmployees1;

	public WebElement Trans_CxFinancial_NoOfEmployees() {
		return Trans_CxFinancial_NoOfEmployees1;
	}

	@FindBy(xpath = " //ion-label[text()=' Experience at Current Employment ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_ExpCurrentEmp1;

	public WebElement Trans_CxFinancial_ExpCurrentEmp() {
		return Trans_CxFinancial_ExpCurrentEmp1;
	}

	@FindBy(xpath = " //ion-label[text()=' Employer City Code ']//following-sibling::ion-input/input")
	private WebElement Trans_CxFinancial_EmpCityCode1;

	public WebElement Trans_CxFinancial_EmpCityCode() {
		return Trans_CxFinancial_EmpCityCode1;
	}

	@FindBy(xpath = " //ion-label[text()=' Remarks ']//following-sibling::ion-textarea/div")
	private WebElement Trans_CxFinancial_Remarks1;

	public WebElement Trans_CxFinancial_Remarks() {
		return Trans_CxFinancial_Remarks1;
	}

	@FindBy(xpath = " //ion-label[text()=' Date of Joining ']//ancestor::ion-item//button")
	private WebElement Trans_CxFinancial_DateOfJoining1;

	public WebElement Trans_CxFinancial_DateOfJoining() {
		return Trans_CxFinancial_DateOfJoining1;
	}
   
	@FindBy(xpath = " //ion-label[text()=' Employment End Date ']//ancestor::ion-item//button")
	private WebElement Trans_CxFinancial_EmploymentEndDate1;

	public WebElement Trans_CxFinancial_EmploymentEndDate() {
		return Trans_CxFinancial_EmploymentEndDate1;
	}

	@FindBy(xpath = "//span[text()='Clear']/parent::button")
	private WebElement clearbuttonIncalendar;

	public WebElement clearbuttonIncalendar() {
		return clearbuttonIncalendar;
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

	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement CustomerEmployment_SaveButton1;

	public WebElement CustomerEmployment_SaveButton() {
		return CustomerEmployment_SaveButton1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Go Back'])[2]")
	private WebElement CustomerEmployment_BackButtonButton1;

	public WebElement CustomerEmployment_BackButtonButton() {
		return CustomerEmployment_BackButtonButton1;
	}
	@FindBy(xpath="//div[@role='alert']")
    private WebElement successMgs;
    public WebElement successMgs() {
    	return successMgs;
    }

}
