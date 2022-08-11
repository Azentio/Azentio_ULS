package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_ProjectMasterObj {
	WebDriver driver;

	public ULS_ProjectMasterObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[text()='Project Setup']")
	private WebElement uls_ProjectSetUpMainMenu;

	public WebElement ulsProjectSetUpMainMenu() {
		return uls_ProjectSetUpMainMenu;
	}

	@FindBy(xpath = "//ion-label[text()='Project Master']//following-sibling::ion-buttons/ion-button[2]")
	private WebElement uls_ProjectMasterViewButton;

	public WebElement ulsProjectMasterViewButton() {
		return uls_ProjectMasterViewButton;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement uls_ProjectMasterBackButton;

	public WebElement ulsProjectMasterBackButton() {
		return uls_ProjectMasterBackButton;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement uls_ProjectMasterSaveButton;

	public WebElement ulsProjectMasterSaveButton() {
		return uls_ProjectMasterSaveButton;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement projectMaster_AddButton;

	public WebElement projectMasterAddButton() {
		return projectMaster_AddButton;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Project Type *']")
	private WebElement projectMaster_ProjectTypeDropDown;

	public WebElement projectMasterProjectTypeDropDown() {
		return projectMaster_ProjectTypeDropDown;
	}

	@FindBy(xpath = "(//ion-select[@aria-label='Select,  Sourcing Branch *'])[1]")
	private WebElement projectMaster_SourcingBranch1DropDown;

	public WebElement projectMasterSourcingBranch1DropDown() {
		return projectMaster_SourcingBranch1DropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Project Code ']/following-sibling::ion-input/input")
	private WebElement projectMaster_ProjectCode;

	public WebElement projectMasterProjectCode() {
		return projectMaster_ProjectCode;
	}

	@FindBy(xpath = "//ion-label[text()=' Project Code ']//span")
	private WebElement projectMaster_ProjectCodeMendatoryCheck;

	public WebElement projectMasterProjectCodeMendatoryCheck() {
		return projectMaster_ProjectCodeMendatoryCheck;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Builder Group *']")
	private WebElement projectMaster_BuilderGroupDropDown;

	public WebElement projectMasterBuilderGroupDropDown() {
		return projectMaster_BuilderGroupDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Name of the Project ']/following-sibling::ion-input/input")
	private WebElement projectMaster_NameOfTheProjectTextBox;

	public WebElement projectMasterNameOfTheProjectTextBox() {
		return projectMaster_NameOfTheProjectTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Name of the Project ']//span")
	private WebElement projectMaster_NameOfTheProject_MendatoryField;

	public WebElement projectMasterNameOfTheProjectMendatoryField() {
		return projectMaster_NameOfTheProject_MendatoryField;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Builder Name *']")
	private WebElement projectMaster_BuilderNameDropDown;

	public WebElement projectMasterBuilderNameDropDown() {
		return projectMaster_BuilderNameDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Construction Finance *']")
	private WebElement projectMaster_ConstructionFinanceDropDown;

	public WebElement projectMasterConstructionFinanceDropDown() {
		return projectMaster_ConstructionFinanceDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Remarks ']//span")
	private WebElement projectMaster_RemarkMendatoryFieldCheck;

	public WebElement projectMasterRemarkMendatoryFieldCheck() {
		return projectMaster_RemarkMendatoryFieldCheck;
	}

	@FindBy(xpath = "(//ion-label[text()=' Remarks ']/following-sibling::ion-input//input)[1]")
	private WebElement projectMaster_Remark1Textbox;

	public WebElement projectMasterRemark1TextBox() {
		return projectMaster_Remark1Textbox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Green Project *']")
	private WebElement projectMaster_GreenProjectDropDown;

	public WebElement projectMasterGreenProjectDropDown() {
		return projectMaster_GreenProjectDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Agency Name ']")
	private WebElement projectMaster_AgencyNameDropDown;

	public WebElement projectMasterAgencyDropDown() {
		return projectMaster_AgencyNameDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Special Scheme ']")
	private WebElement projectMaster_SpecialSchemeDropDown;

	public WebElement projectMasterSpecialSchemeDropDown() {
		return projectMaster_SpecialSchemeDropDown;
	}

	@FindBy(xpath = "(//ion-label[text()=' Remarks ']/following-sibling::ion-input//input)[2]")
	private WebElement projectMaster_Remark2Textbox;

	public WebElement projectMasterRemark2TextBox() {
		return projectMaster_Remark2Textbox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Sub25 Project ']")
	private WebElement projectMaster_Sub25ProjectDropDown;

	public WebElement projectMasterSub25ProjectDropDown() {
		return projectMaster_Sub25ProjectDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Address1 ']//span")
	private WebElement projectMaster_AddressDetailsAddress1MendatoryField;

	public WebElement projectMasterAddressDetailsAddress1MendatoyrField() {
		return projectMaster_AddressDetailsAddress1MendatoryField;
	}

	@FindBy(xpath = "//ion-label[text()=' Address1 ']/following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsAddress1TextBox;

	public WebElement projectMasterAddressDetailsAddress1TextBox() {
		return projectMaster_AddressDetailsAddress1TextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Address2 ']/following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsAddress2TextBox;

	public WebElement projectMasterAddressDetailsAddress2TextBox() {
		return projectMaster_AddressDetailsAddress2TextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Address2 ']//span")
	private WebElement projectMaster_AddressDetailsAddress2MendatoryField;

	public WebElement projectMasterAddressDetailsAddress2MendatoyrField() {
		return projectMaster_AddressDetailsAddress2MendatoryField;
	}

	@FindBy(xpath = "//ion-label[text()=' Address3 ']/following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsAddress3TextBox;

	public WebElement projectMasterAddressDetailsAddress3TextBox() {
		return projectMaster_AddressDetailsAddress3TextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Address3 ']//span")
	private WebElement projectMaster_AddressDetailsAddress3MendatoryField;

	public WebElement projectMasterAddressDetailsAddress3MendatoyrField() {
		return projectMaster_AddressDetailsAddress3MendatoryField;
	}

	@FindBy(xpath = "//ion-label[text()=' Survey No ']/following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsSurveyNoTextBox;

	public WebElement projectMasterAddressDetailsSurveyNoTextBox() {
		return projectMaster_AddressDetailsSurveyNoTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Survey No ']//span")
	private WebElement projectMaster_AddressDeatilsSurveyNoMendatoryCheck;

	public WebElement projectMasterAddressDeatilsSurveyNoMendatoryCheck() {
		return projectMaster_AddressDeatilsSurveyNoMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Landmark ']//span")
	private WebElement projectMaster_AddressDeatilsLandmarkMendatoryCheck;

	public WebElement projectMasterAddressDeatilsLandmarkMendatoryCheck() {
		return projectMaster_AddressDeatilsLandmarkMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Landmark ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDeatilsLandmarkTextBox;

	public WebElement projectMasterAddressDeatilsLandmarkTextBox() {
		return projectMaster_AddressDeatilsLandmarkTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Street ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDeatilsStreetTextBox;

	public WebElement projectMasterAddressDeatilsStreetTextBox() {
		return projectMaster_AddressDeatilsStreetTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Street ']//span")
	private WebElement projectMaster_AddressDeatilsStreetCheck;

	public WebElement projectMasterAddressDeatilsStreetMendatoryCheck() {
		return projectMaster_AddressDeatilsStreetCheck;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Country *']")
	private WebElement projectMaster_AddressDetailsCountyDropDown;

	public WebElement projectMasterAddressDetailsCountryDropDown() {
		return projectMaster_AddressDetailsCountyDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  State *']")
	private WebElement projectMaster_AddressDetailsStateDropDown;

	public WebElement projectMasterAddressDetailsStateDropDown() {
		return projectMaster_AddressDetailsStateDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  City ']")
	private WebElement projectMaster_AddressDetailsCityDropDown;

	public WebElement projectMasterAddressDetailsCityDropDown() {
		return projectMaster_AddressDetailsCityDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Pincode ']//span")
	private WebElement projectMaster_AddressDeatilsPinCodeMendatoryCheck;

	public WebElement projectMasterAddressDeatilsSPincodeMendatoryMendatoryCheck() {
		return projectMaster_AddressDeatilsPinCodeMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Pincode ']/following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsPincodeTextBox;

	public WebElement projectMaster_AddressDetailsPincodeTextBox() {
		return projectMaster_AddressDetailsPincodeTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Sales/Relationship Manager ']/following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsSalesRelationManagerTextBox;

	public WebElement projectMaster_AddressDetailsSalesRelationManagerTextBox() {
		return projectMaster_AddressDetailsSalesRelationManagerTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Sales/Relationship Manager ']//span")
	private WebElement projectMaster_AddressDetailsSalesRelationManagerMendatoryCheck;

	public WebElement projectMasterAddressDetailsSalesRelationManagerMendatoryCheck() {
		return projectMaster_AddressDetailsSalesRelationManagerMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Phone No ']//span")
	private WebElement projectMaster_AddressDetailsPhoneNoMendatoryCheck;

	public WebElement projectMasterAddressDetailsPhoneNoMendatoryCheck() {
		return projectMaster_AddressDetailsPhoneNoMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Phone No ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsPhoneNoTextBox;

	public WebElement projectMasterAddressDetailsPhoneNoTextBox() {
		return projectMaster_AddressDetailsPhoneNoTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Mobile No ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsMobileNoTextBox;

	public WebElement projectMasterAddressDetailsMobileNoTextBox() {
		return projectMaster_AddressDetailsMobileNoTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Mobile No ']//span")
	private WebElement projectMaster_AddressDetailsMobileNoMendatoryCheck;

	public WebElement projectMasterAddressDetailsMobileNoMendatoryCheck() {
		return projectMaster_AddressDetailsMobileNoMendatoryCheck;
	}

	@FindBy(xpath = "//ion-select[@aria-label=' NO ,  Title Verified By ']")
	private WebElement projectMaster_AddressDetailsTitleVerifiedDropDown;

	public WebElement projectMasterAddressDetailsTitleVerifiedDropDown() {
		return projectMaster_AddressDetailsTitleVerifiedDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Approved By ']//span")
	private WebElement projectMaster_AddressDetailsApprovedByMendatoryCheck;

	public WebElement projectMasterAddressDetailsApprovedByMendatoryCheck() {
		return projectMaster_AddressDetailsApprovedByMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Approved By ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsApprovedByTextBox;

	public WebElement projectMasterAddressDetailsApprovedByTextBox() {
		return projectMaster_AddressDetailsApprovedByTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Plan Approved ']//span")
	private WebElement projectMaster_AddressDetailsPlanApprovedMendatoryCheck;

	public WebElement projectMasterAddressDetailsPlanApprovedMendatoryCheck() {
		return projectMaster_AddressDetailsPlanApprovedMendatoryCheck;
	}

	@FindBy(xpath = "(//input[@type='date'])[1]")
	private WebElement projectMaster_AddressDetailsPlanApprovedByDate;

	public WebElement projectMasterAddressDetailsPlanApprovedByDate() {
		return projectMaster_AddressDetailsPlanApprovedByDate;
	}

	@FindBy(xpath = "//ion-label[text()=' Plan Approved Date ']//span")
	private WebElement projectMaster_PlanApprovedDataMendatoryCheck;

	public WebElement projectMasterPlanApprovedDateMendatoryCheck() {
		return projectMaster_PlanApprovedDataMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Plan Approved ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsPlanApprovedTextBox;

	public WebElement projectMasterAddressDetailsPlanApprovedTextBox() {
		return projectMaster_AddressDetailsPlanApprovedTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Plan Approved Date ']//span")
	private WebElement projectMaster_AddressDetailsPlanApprovedMendatoryField;

	public WebElement projectMasterAddressDetailsPlanApprovedMendatoryField() {
		return projectMaster_AddressDetailsPlanApprovedMendatoryField;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Rural/Urban Classification ']")
	private WebElement projectMaster_AddressDetailsRuralUrbanClassificationDropDown;

	public WebElement projectMasterAddressDetailsRuralUrbanClassification() {
		return projectMaster_AddressDetailsRuralUrbanClassificationDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Built Area ']/following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsBuiltAreaTextBox;

	public WebElement projectMasterAddressDetailsBuiltAreaTextBox() {
		return projectMaster_AddressDetailsBuiltAreaTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Built Area ']//span")
	private WebElement projectMaster_AddressDetailsBuiltAreaMendatoryCheck;

	public WebElement projectMasterAddressDetailsBuiltAreaMendatoryCheck() {
		return projectMaster_AddressDetailsBuiltAreaMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Any Charge On Project ']//span")
	private WebElement projectMaster_AddressDetailsAnyChargeOnProjectMendatoryCheck;

	public WebElement projectMasterAddressDetailsAnyChargeOnProjectMendatoryCheck() {
		return projectMaster_AddressDetailsAnyChargeOnProjectMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Any Charge On Project ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsAnyChargeOnProjectTextBox;

	public WebElement projectMasterAddressDetailsAnyChargeOnProjectTextBox() {
		return projectMaster_AddressDetailsAnyChargeOnProjectTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Basic Sales Price(BSP)/Distance Unit  ']//span")
	private WebElement projectMaster_AddressDetailsBasicSalesPriceDistanceUnitMendatoryCheck;

	public WebElement projectMasterAddressDetailsBasicSalesPriceDistanceUnitMendatoryCheck() {
		return projectMaster_AddressDetailsBasicSalesPriceDistanceUnitMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Basic Sales Price(BSP)/Distance Unit  ']/following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsBasicSalesPriceDistanceUnitTextBox;

	public WebElement projectMasterAddressDetailsBasicSalesPriceDistanceUnitTextBox() {
		return projectMaster_AddressDetailsBasicSalesPriceDistanceUnitTextBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Charge By/Noc to be taken from  ']")
	private WebElement projectMaster_AddressDetailsChargeByNocToBeTakenFromDropDown;

	public WebElement projectMasterAddressDetailsChargeByNocToBeTakenFromDropDown() {
		return projectMaster_AddressDetailsChargeByNocToBeTakenFromDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Area of Land/Distance Unit ']//span")
	private WebElement projectMaster_AddressDetailsAreaOfLandDistanceUnitMendatoryCheck;

	public WebElement projectMasterAddressDetailsAreaOfLandDistanceUnitMendatoryCheck() {
		return projectMaster_AddressDetailsAreaOfLandDistanceUnitMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Area of Land/Distance Unit ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsAreaOfLandDistanceUnitTextBox;

	public WebElement projectMasterAddressDetailsAreaOfLandDistanceUnitTextBox() {
		return projectMaster_AddressDetailsAreaOfLandDistanceUnitTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Name of Competitors funding project ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsNameOfCompetitorFundingProjectTextBox;

	public WebElement projectMasterAddressDetailsNameOfCompetitorFundingProjectTextBox() {
		return projectMaster_AddressDetailsNameOfCompetitorFundingProjectTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Name of Competitors funding project ']//span")
	private WebElement projectMaster_AddressDetailsNameOfCompetitorFundingProjectMendatoryCheck;

	public WebElement projectMasterAddressDetailsNameOfCompetitorFundingProjectMendatoryCheck() {
		return projectMaster_AddressDetailsNameOfCompetitorFundingProjectMendatoryCheck;
	}

	@FindBy(xpath = "//ion-modal[1]//ion-col[39]//ion-select[1]")
	private WebElement projectMaster_AddressDetailsSourcingBranchDropDown;

	public WebElement projectMasterAddressDetailsSourcingBranchDropDown() {
		return projectMaster_AddressDetailsSourcingBranchDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Monitoring Required ']//span")
	private WebElement projectMaster_AddressDetailsMoniteringRequiredMendatoryCheck;

	public WebElement projectMasterAddressDetailsMoniteringRequiredMendatoryCheck() {
		return projectMaster_AddressDetailsMoniteringRequiredMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Monitoring Required ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsMoniteringRequiredTextBox;

	public WebElement projectMasterAddressDetailsMoniteringRequiredTextBox() {
		return projectMaster_AddressDetailsMoniteringRequiredTextBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Under Construction ']")
	private WebElement projectMaster_AddressDetailsUnderConstructionDropDown;

	public WebElement projectMasterAddressDetailsUnderConstructionDropDown() {
		return projectMaster_AddressDetailsUnderConstructionDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Overall % Completion ']//span")
	private WebElement projectMaster_AddressDetailsOverAllCompletionMendatoryCheck;

	public WebElement projectMasterAddressDetailsOverAllCompletionMendatoryCheck() {
		return projectMaster_AddressDetailsOverAllCompletionMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Overall % Completion ']/following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsOverAllCompletionTextBox;

	public WebElement projectMasterAddressDetailsOverAllCompletionTextBox() {
		return projectMaster_AddressDetailsOverAllCompletionTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Overall % Recommendation ']//span")
	private WebElement projectMaster_AddressDetailsOverallRecomendationMendatoryCheck;

	public WebElement projectMasterAddressDetailsOverallRecomendationMendatoryCheck() {
		return projectMaster_AddressDetailsOverallRecomendationMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Overall % Recommendation ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsOverAllRecommendationTextBox;

	public WebElement projectMasterAddressDetailsOverAllRecommendationTextBox() {
		return projectMaster_AddressDetailsOverAllRecommendationTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Tentative Date Completion ']//span")
	private WebElement projectMaster_AddressDetailsTentatioveDateCalendar;

	public WebElement projectMasterAddressDetailsTentativeDateCalendar()

	{
		return projectMaster_AddressDetailsTentatioveDateCalendar;
	}

	@FindBy(xpath = "//ion-label[text()=' Tentative Date Completion ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddresDeatislTentativeDateCompletionDateInput;

	public WebElement projectMasterAddressDetailsTentativeDateCompletionDateInput() {
		return projectMaster_AddresDeatislTentativeDateCompletionDateInput;
	}

	@FindBy(xpath = "//ion-label[text()=' Name of Beneficiery ']//span")
	private WebElement projectMaster_NameOfbeneficieryMendatoryCheck;

	public WebElement projectMasterNameOfbeneficcieryMendatoryCheck() {
		return projectMaster_NameOfbeneficieryMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Name of Beneficiery ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsNameOfbenificieryTextBox;

	public WebElement projectMasterAddressDetailsNameOfBenificieryTextBox() {
		return projectMaster_AddressDetailsNameOfbenificieryTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Account No ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsAccountNumberTextBox;

	public WebElement projectMasterAddressDetailsTextBox() {
		return projectMaster_AddressDetailsAccountNumberTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Account No ']//span")
	private WebElement projectMaster_AddressDetailsAccountNoMendatoryCheck;

	public WebElement projectMasterAddressDetailsAccountNoMendatoryCheck() {
		return projectMaster_AddressDetailsAccountNoMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Account No ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsAccountNumberInputBox;

	public WebElement projectMasterAddressDetailsAccountNumberInputBox() {
		return projectMaster_AddressDetailsAccountNumberInputBox;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Bank Name *']")
	private WebElement projectMaster_AddressDetailsBankNameDropDown;

	public WebElement projectMasterAddressDetailsBankNameDropDown() {
		return projectMaster_AddressDetailsBankNameDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Date of Visit ']//span")
	private WebElement projectMaster_AddressDetailsDateOfVisitCalendarMendatoryCheck;

	public WebElement projectMasterAddressDetailsDateOfVisitCalendarMendatoryCheck() {
		return projectMaster_AddressDetailsDateOfVisitCalendarMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Date of Visit ']//following-sibling::ion-input//input")
	private WebElement projectMaster_AddressDetailsDateOfVisitInputCalendar;

	public WebElement projectMasterAddressDetailsDateOfVisitInputCalendar() {
		return projectMaster_AddressDetailsDateOfVisitInputCalendar;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Branch Name ']")
	private WebElement projectMaster_AddressDetailsBranchNameDropDown;

	public WebElement projectMasterAddressDetailsBranchNameDropDown() {
		return projectMaster_AddressDetailsBranchNameDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  IFSC Code ']")
	private WebElement projectMaster_AddressDetailsIFSCCodeDropDown;

	public WebElement projectMasterAddressDetailsIFSCCodeDropDown() {
		return projectMaster_AddressDetailsIFSCCodeDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  File Storage *']")
	private WebElement projectMaster_AddressDetailsFileStorageDropDown;

	public WebElement projectMasterAddressDetailsFileStorageDropDown() {
		return projectMaster_AddressDetailsFileStorageDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  CLP ']")
	private WebElement projectMaster_PaymentPlansClpDropDown;

	public WebElement projectMasterPaymentPlansClpDropDown() {
		return projectMaster_PaymentPlansClpDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  ADF ']")
	private WebElement projectMaster_PaymentPlansADFDropDown;

	public WebElement projectMasterPaymentPlansADFDropDown() {
		return projectMaster_PaymentPlansADFDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Flexi ']")
	private WebElement projectMaster_PaymentPlansFlexiDropDown;

	public WebElement projectMasterPaymentPlansFlexiDropDown() {
		return projectMaster_PaymentPlansFlexiDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Subvention ']")
	private WebElement projectMaster_PaymentPlansSubventionDropDown;

	public WebElement projectMasterPaymentPlansSubventionDropDown() {
		return projectMaster_PaymentPlansSubventionDropDown;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Subvention Type ']")
	private WebElement projectMaster_PaymentPlansSubventionTypeDropDown;

	public WebElement projectMasterPaymentPlansSubventionTypeDropDown() {
		return projectMaster_PaymentPlansSubventionTypeDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Subvention Period ']//span")
	private WebElement projectMaster_PaymentPlansSubventionPeriodMendatoryCheck;

	public WebElement projectMasterPaymentPlansSubventionPeriodMendatoryCheck() {
		return projectMaster_PaymentPlansSubventionPeriodMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Subvention Period ']//following-sibling::ion-input//input")
	private WebElement projectMaster_PaymentPlansSubventionPeriodInputBox;

	public WebElement projectMasterPaymentPlanSubventionPeriondInputBox() {
		return projectMaster_PaymentPlansSubventionPeriodInputBox;
	}

	@FindBy(xpath = "(//input[@type='date'])[4]")
	private WebElement projectMaster_PaymentPlansSubVentionStartDate;

	public WebElement projectMasterPaymentPlansSubventionStartDate() {
		return projectMaster_PaymentPlansSubVentionStartDate;
	}

	@FindBy(xpath = "//ion-label[text()=' Subvention Start Date ']//span")
	private WebElement projectMaster_PaymentPlansSubventionStartDateMendatoryCheck;

	public WebElement projectMasterPaymentPlansSubventionStartDateMendatoryCheck() {
		return projectMaster_PaymentPlansSubventionStartDateMendatoryCheck;
	}

	@FindBy(xpath = "(//input[@type='date'])[5]")
	private WebElement projectMaster_PaymentPlansSubVentionEndtDate;

	public WebElement projectMasterPaymentPlansSubventionEndDate() {
		return projectMaster_PaymentPlansSubVentionEndtDate;
	}

	@FindBy(xpath = "//ion-label[text()=' Subvention End Date ']//span")
	private WebElement projectMaster_PaymentPlansSubventionEndDateMendatoryCheck;

	public WebElement projectMasterPaymentPlansSubventionEndDateMendatoryCheck() {
		return projectMaster_PaymentPlansSubventionEndDateMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Interest To be collected ']//span")
	private WebElement projectMaster_PaymentPlansInterestToBeCollectedMendatoryCheck;

	public WebElement projectMasterPaymentPlansInterestedToBeCollectedMendatoryCheck() {
		return projectMaster_PaymentPlansInterestToBeCollectedMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Interest To be collected ']//following-sibling::ion-input//input")
	private WebElement projectMaster_PaymentPlansInterestToBeCollectedTextBox;

	public WebElement projectMasterPaymentPlansInterestToBeCollectedTextBox() {
		return projectMaster_PaymentPlansInterestToBeCollectedTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Discounting Rate ']//following-sibling::ion-input//input")
	private WebElement projectMaster_PaymentPlansDiscountingRateTextBox;

	public WebElement projectMasterPaymentPlansDiscountingRateTextBox() {
		return projectMaster_PaymentPlansDiscountingRateTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Discounting Rate ']//span")
	private WebElement projectMaster_PaymentPlansDiscountingRateMendatoryCheck;

	public WebElement projectMasterPaymentPlanDIscountingRateMendatoryCheck() {
		return projectMaster_PaymentPlansDiscountingRateMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Rate Type ']//span")
	private WebElement projectMaster_PaymentPlansRateTypeMendatoryCheck;

	public WebElement projectMasterPaymentPlansRateTypeMendatoryCheck() {
		return projectMaster_PaymentPlansRateTypeMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Rate Type ']//following-sibling::ion-input//input")
	private WebElement projectMaster_PaymentPlansRateTypeTextBox;

	public WebElement projectMasterPaymentPlansRateTypeTextBox() {
		return projectMaster_PaymentPlansRateTypeTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Rate of Interest ']//following-sibling::ion-input//input")
	private WebElement projectMaster_PaymentPlansRateOfIntersetTextBox;

	public WebElement projectMasterPaymentPlansRateOfInterestTextBox() {
		return projectMaster_PaymentPlansRateOfIntersetTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Rate of Interest ']//span")
	private WebElement projectMaster_PaymentPlansRateOfInterestMendatoryCheck;

	public WebElement projectMasterPaymentPlansRateOfInterestMendatoryCheck() {
		return projectMaster_PaymentPlansRateOfInterestMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Max No of Units to be Funded for all projects of builder: ']//span")
	private WebElement projectMaster_ExposureTrackingMaxNoOUnitToBeFundedMendatoryCheck;

	public WebElement projectMasterExposureTrackingMaxNoOUnitToBeFundedMendatoryCheck() {
		return projectMaster_ExposureTrackingMaxNoOUnitToBeFundedMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Max No of Units to be Funded for all projects of builder: ']//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingMaxNoOUnitToBeFundedTextBox;

	public WebElement projectMasterExposureTrackingMaxNoOUnitToBeFundedTextBox() {
		return projectMaster_ExposureTrackingMaxNoOUnitToBeFundedTextBox;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Max Sanction Amt for all cases funded in all Projects of the builder : ')]//span")
	private WebElement projectMaster_ExposureTrackingMaxSanctionAmtMendatoryCheck;

	public WebElement projectMasterExposureTrackingMaxSanctionAmtMendatoryCheck() {
		return projectMaster_ExposureTrackingMaxSanctionAmtMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Max Sanction Amt for all cases funded in all Projects of the builder : ')]//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingMaxSanctionAmtTextBox;

	public WebElement projectMasterExposureTrackingMaxSanctionAmtTextBox() {
		return projectMaster_ExposureTrackingMaxSanctionAmtTextBox;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Max Disbursed Amt for all cases funded in all Projects of the builder :')]//span")
	private WebElement projectMaster_ExposureTrackingMaxDisbursedAmtForAllcasesMendatoryCheck;

	public WebElement projectMasterExposureTrackingMaxDisbursedAmtForAllcasesMendatoryCheck() {
		return projectMaster_ExposureTrackingMaxDisbursedAmtForAllcasesMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Max Disbursed Amt for all cases funded in all Projects of the builder :')]//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingMaxDisbursedAmtForAllcasesTextBox;

	public WebElement projectMasterExposureTrackingMaxDisbursedAmtForAllcasesTextBox() {
		return projectMaster_ExposureTrackingMaxDisbursedAmtForAllcasesTextBox;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Sanctioned Amount')]//span")
	private WebElement projectMaster_ExposureTrackingSanctionedAmtMendatoryCheck;

	public WebElement projectMasterExposureTrackingSanctionedAmtMendatoryCheck() {
		return projectMaster_ExposureTrackingSanctionedAmtMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Sanctioned Amount')]//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingSanctionedAmtTextBox;

	public WebElement projectMasterExposureTrackingSanctionedAmtTextBox() {
		return projectMaster_ExposureTrackingSanctionedAmtTextBox;
	}

	@FindBy(xpath = "//ion-label[contains(text(),' Disbursed Amount ')]//span")
	private WebElement projectMaster_ExposureTrackingMaxDisbursedAmtMendatoryCheck;

	public WebElement projectMaster_ExposureTrackingMaxDisbursedAmtMendatoryCheck() {
		return projectMaster_ExposureTrackingMaxDisbursedAmtMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[contains(text(),' Disbursed Amount ')]//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingMaxDisbursedAmtTextBox;

	public WebElement projectMaster_ExposureTrackingMaxDisbursedAmtTextBox() {
		return projectMaster_ExposureTrackingMaxDisbursedAmtTextBox;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Sanctioned No of Units')]//span")
	private WebElement projectMaster_ExposureTrackingtSanctionedNoOfUnitMendatoryCheck;

	public WebElement projectMasterExposureTrackingSanctionedNoOfUnitMendatoryCheck() {
		return projectMaster_ExposureTrackingtSanctionedNoOfUnitMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Sanctioned No of Units')]//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtSanctionedNoOfUnitTextBox;

	public WebElement projectMasterExposureTrackingSanctionedNoOfUnitTextBox() {
		return projectMaster_ExposureTrackingtSanctionedNoOfUnitTextBox;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Total No Units')]//span")
	private WebElement projectMaster_ExposureTrackingtTotalNoUnitMendatoryCheck;

	public WebElement projectMasterExposureTrackingtTotalNoUnitMendatoryCheck() {
		return projectMaster_ExposureTrackingtTotalNoUnitMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Total No Units')]//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtTotalNoUnitTextBox;

	public WebElement projectMasterExposureTrackingtTotalNoUnitTextBox() {
		return projectMaster_ExposureTrackingtTotalNoUnitTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Apartment ']//span")
	private WebElement projectMaster_ExposureTrackingtAprtmentMendatoryCheck;

	public WebElement projectMasterExposureTrackingtAprtmentMendatoryCheck() {
		return projectMaster_ExposureTrackingtAprtmentMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Apartment ']//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtAprtmentTextBox;

	public WebElement projectMasterExposureTrackingtAprtmentTextBox() {
		return projectMaster_ExposureTrackingtAprtmentTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Commercial Space ']//span")
	private WebElement projectMaster_ExposureTrackingtCommercialSpaceMendatoryCheck;

	public WebElement projectMasterExposureTrackingtCommercialSpaceMendatoryCheck() {
		return projectMaster_ExposureTrackingtCommercialSpaceMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Commercial Space ']//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtCommercialSpaceTextBox;

	public WebElement projectMasterExposureTrackingtCommercialSpaceTextBox() {
		return projectMaster_ExposureTrackingtCommercialSpaceTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Plot ']//span")
	private WebElement projectMaster_ExposureTrackingtPlotMendatoryCheck;

	public WebElement projectMasterExposureTrackingtPlotMendatoryCheck() {
		return projectMaster_ExposureTrackingtPlotMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Plot ']//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtPlotTextBox;

	public WebElement projectMasterExposureTrackingtPlotTextBox() {
		return projectMaster_ExposureTrackingtPlotTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Apartment ']//span")
	private WebElement projectMaster_ExposureTrackingAprtmentMendatoryCheck;

	public WebElement projectMasterExposureTrackingApartmentMendatoryCheck() {
		return projectMaster_ExposureTrackingAprtmentMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Apartment ']/parent::ion-item//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtApartmentTextBox;

	public WebElement projectMasterExposureTrackingtApartmentTextBox() {
		return projectMaster_ExposureTrackingtApartmentTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Studio Apartment ']//span")
	private WebElement projectMaster_ExposureTrackingtStudioApartmentMendatoryCheck;

	public WebElement projectMasterExposureTrackingtStudioApartmentMendatoryCheck() {
		return projectMaster_ExposureTrackingtStudioApartmentMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Studio Apartment ']//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtStudioApartmentTextBox;

	public WebElement projectMasterExposureTrackingtStudioApartmentTextBox() {
		return projectMaster_ExposureTrackingtStudioApartmentTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Builder Floor ']//span")
	private WebElement projectMaster_ExposureTrackingtBuildFloorMendatoryCheck;

	public WebElement projectMasterExposureTrackingtBuildFloorMendatoryCheck() {
		return projectMaster_ExposureTrackingtBuildFloorMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Builder Floor ']//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtBuildFloorTextBox;

	public WebElement projectMasterExposureTrackingtBuildFloorTextBox() {
		return projectMaster_ExposureTrackingtBuildFloorTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Villa ']//span")
	private WebElement projectMaster_ExposureTrackingtVillaMendatoryCheck;

	public WebElement projectMasterExposureTrackingtVillaMendatoryCheck() {
		return projectMaster_ExposureTrackingtVillaMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Villa ']//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtVillaTextBox;

	public WebElement projectMasterExposureTrackingtVillaTextBox() {
		return projectMaster_ExposureTrackingtVillaTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Technical Conditions ']//span")
	private WebElement projectMaster_ExposureTrackingtTechnicalConditionMendatoryCheck;

	public WebElement projectMasterExposureTrackingtTechnicalConditionMendatoryCheck() {
		return projectMaster_ExposureTrackingtTechnicalConditionMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Technical Conditions ']//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtTechnicalConditionTextBox;

	public WebElement projectMasterExposureTrackingtTechnicalConditionTextBox() {
		return projectMaster_ExposureTrackingtTechnicalConditionTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Remarks ']//span")
	private WebElement projectMaster_ExposureTrackingtRemarksMendatoryCheck;

	public WebElement projectMasterExposureTrackingtRemarksMendatoryCheck() {
		return projectMaster_ExposureTrackingtRemarksMendatoryCheck;
	}

	@FindBy(xpath = "(//ion-label[text()=' Remarks ']//following-sibling::ion-input//input)[3]")
	private WebElement projectMaster_ExposureTrackingtRemarksTextBox;

	public WebElement projectMasterExposureTrackingtRemarksTextBox() {
		return projectMaster_ExposureTrackingtRemarksTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Document to be collected from Retail Borrower ']//span")
	private WebElement projectMaster_ExposureTrackingtDocumentToBecollectedFromRetailsBorrowerMendatoryCheck;

	public WebElement projectMasterExposureTrackingtDocumentToBecollectedFromRetailsBorrowerMendatoryCheck() {
		return projectMaster_ExposureTrackingtDocumentToBecollectedFromRetailsBorrowerMendatoryCheck;
	}

	@FindBy(xpath = "//ion-label[text()=' Document to be collected from Retail Borrower ']//following-sibling::ion-input//input")
	private WebElement projectMaster_ExposureTrackingtDocumentToBecollectedFromRetailsBorrowerTextBox;

	public WebElement projectMasterExposureTrackingtDocumentToBecollectedFromRetailsBorrowerTextBox() {
		return projectMaster_ExposureTrackingtDocumentToBecollectedFromRetailsBorrowerTextBox;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement projectMaster_SaveButton;

	public WebElement projectMasterSaveButton() {
		return projectMaster_SaveButton;
	}
//	@FindBy(xpath="//div[@id='toast-container']//div[@role='alert']")
//	private WebElement projectMaster_submitToastAlert;
//	public WebElement projectMastersubmitToastAlert()
//	{
//		return projectMaster_submitToastAlert;
//	}
	@FindBy(xpath = "//input[@mode='ios']")
	private WebElement projectMaster_SearchTextBox;

	public WebElement projectMasterSearchTextBox() {
		return projectMaster_SearchTextBox;
	}

	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
	private WebElement projectMaster_mailBox;

	public WebElement projectMasterMailBox() {
		return projectMaster_mailBox;
	}

	@FindBy(xpath = "(//button[@ng-reflect-icon='pi pi-search'])[2]")
	private WebElement projectMaster_inboxSearch;

	public WebElement projectMasterinboxSearch() {
		return projectMaster_inboxSearch;
	}

	@FindBy(xpath = "//span[text()=' Inbox ']/parent::div//input")
	private WebElement projectMaster_SearchTextBoxInbox;

	public WebElement projectMasterSearchTextBoxInbox() {
		return projectMaster_SearchTextBoxInbox;
	}

//	@FindBy(xpath="//app-inbox[1]//p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
//	private WebElement projectMaster_referenceID;
//	public WebElement projectMasterreferenceID()
//	{
//		return projectMaster_referenceID;
//	}
	@FindBy(xpath = "(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement projectMaster_firstRecord;

	public WebElement projectMasterfirstRecord() {
		return projectMaster_firstRecord;
	}

	@FindBy(xpath = "//app-inbox[1]//p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement projectMaster_referenceID;

	public WebElement projectMasterreferenceID() {
		return projectMaster_referenceID;
	}

	@FindBy(xpath = "//span[text()='Submit']/parent::button")
	private WebElement projectMaster_SubmitButton;

	public WebElement projectMasterSubmitButton() {
		return projectMaster_SubmitButton;
	}

	@FindBy(xpath = "(//textarea)[2]")
	private WebElement projectMaster_alertRemark;

	public WebElement projectMasteralertRemark() {
		return projectMaster_alertRemark;
	}

	@FindBy(xpath = "(//button[@label='Submit'])[2]")
	private WebElement projectMaster_alertSubmitButton;

	public WebElement projectMasteraleralertSubmitButton() {
		return projectMaster_alertSubmitButton;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement projectMaster_submitToastAlert;

	public WebElement projectMastersubmitToastAlert() {
		return projectMaster_submitToastAlert;
	}

	@FindBy(xpath = "//div[@id='toast-container']//button")
	private WebElement projectMaster_ToastAlertClose;

	public WebElement projectMasterToastAlertClose() {
		return projectMaster_ToastAlertClose;
	}

	@FindBy(xpath = "//ion-title[text()=' Building Details ']")
	private WebElement projectMasterTemp_BuildingDetails;

	public WebElement projectMasterTemoBuildingDetails() {
		return projectMasterTemp_BuildingDetails;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Add'])[2]")
	private WebElement projectMaster_BuildingDetailsAddButton;

	public WebElement projectMasterBuildingDetailsAddButton() {
		return projectMaster_BuildingDetailsAddButton;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Go Back'])[1]")
	private WebElement projectMaster_BuildingDetailsBackButton;

	public WebElement projectMasterBuildingDetailsBackButton() {
		return projectMaster_BuildingDetailsBackButton;
	}

	@FindBy(xpath = "(//span[text()='Export'])[2]")
	private WebElement buildingDetails_ExportText;

	public WebElement buildingDetailsExportText() {
		return buildingDetails_ExportText;
	}

	@FindBy(xpath = "//h4[text()='Project Master']//parent::ion-label//following-sibling::ion-buttons//ion-button[1]")
	private WebElement projectMaster_TempView;

	public WebElement projectMasterTempView() {
		return projectMaster_TempView;
	}

	@FindBy(xpath = "(//button[@ng-reflect-icon='pi pi-pencil'])[1]")
	private WebElement projectMaster_TempViewFirstRecord;

	public WebElement projectMasterTempViewFirstRecord() {
		return projectMaster_TempViewFirstRecord;
	}
	@FindBy(xpath="//ion-label[text()=' Project Code ']//following-sibling::ion-input")
	private WebElement projectMaster_SavedRecordProjectCode;
	public WebElement projectMasterSavedProjectCode()
	{
		return projectMaster_SavedRecordProjectCode;
	}
	@FindBy(xpath="(//table//tr[1]//td[2]//span)[1]")
	private WebElement buildingDetails_ListViewFirstData;
	public WebElement buildingDetailsListViewFirstRecord()
	{
		return buildingDetails_ListViewFirstData;
	}
	@FindBy(xpath="(//table//tr[1]//td[3]//span)[1]")
	private WebElement buildingDetails_ListViewSecondData;
	public WebElement buildingDetailsListViewSecondRecord()
	{
		return buildingDetails_ListViewSecondData;
	}
}
