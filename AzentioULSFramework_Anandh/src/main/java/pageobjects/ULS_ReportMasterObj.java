package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_ReportMasterObj {
	WebDriver driver;

	public ULS_ReportMasterObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Configurations']//following-sibling::ion-icon")
	private WebElement configurationOptions;

	public WebElement configurationOptions() {
		return configurationOptions;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement addIcon;

	public WebElement addIcon() {
		return addIcon;
	}

	@FindBy(xpath = "//ion-label[text()='Config Manager']//following-sibling::ion-icon")
	private WebElement configManager;

	public WebElement configManager() {
		return configManager;
	}

	@FindBy(xpath = "//ion-label[text()='Report Master']//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement reportMasterEditIcon;

	public WebElement reportMasterEditIcon() {
		return reportMasterEditIcon;
	}

	@FindBy(xpath = "//ion-label[text()='Report Master']//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement reportMasterViewIcon;

	public WebElement reportMasterViewIcon() {
		return reportMasterViewIcon;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name ']/following-sibling::ion-input/input")
	private WebElement reportName;

	public WebElement reportName() {
		return reportName;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name 2 ']/following-sibling::ion-input/input")
	private WebElement reportName2;

	public WebElement reportName2() {
		return reportName2;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name 3 ']/following-sibling::ion-input/input")
	private WebElement reportName3;

	public WebElement reportName3() {
		return reportName3;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Description ']/following-sibling::ion-input/input")
	private WebElement reportDescription;

	public WebElement reportDescription() {
		return reportDescription;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Report Type *']")
	private WebElement reportType;

	public WebElement reportType() {
		return reportType;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Url  ']/following-sibling::ion-textarea//textarea")
	private WebElement reportUrl;

	public WebElement reportUrl() {
		return reportUrl;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Report Category *']")
	private WebElement reportCategoey;

	public WebElement reportCategory() {
		return reportCategoey;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement Report_Master_Save;

	public WebElement Report_Master_Save() {
		return Report_Master_Save;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Go Back'])[1]")
	private WebElement reportMaster_BackButton;

	public WebElement reportMasterBackButton() {
		return reportMaster_BackButton;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportMaster_ReportNameValidation;

	public WebElement remportMasterReportNameValidation() {
		return reportMaster_ReportNameValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name 2 ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportMaster_ReportName2Validation;

	public WebElement remportMasterReportName2Validation() {
		return reportMaster_ReportName2Validation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name 3 ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportMaster_ReportName3Validation;

	public WebElement remportMasterReportName3Validation() {
		return reportMaster_ReportName3Validation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Description ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportMaster_DescriptionValidation;

	public WebElement remportMasterDescriptionValidation() {
		return reportMaster_DescriptionValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Type ']//ancestor::digital-select-layout//parent::ion-col//div//ion-badge")
	private WebElement reportMaster_ReportTypeValidation;

	public WebElement remportMasterReportTypeValidation() {
		return reportMaster_ReportTypeValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Url  ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportMaster_ReportUrlValidation;

	public WebElement remportMasterReportUrlValidation() {
		return reportMaster_ReportUrlValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Category ']//ancestor::digital-select-layout//parent::ion-col//div//ion-badge")
	private WebElement reportMaster_ReportCategoryValidation;

	public WebElement remportMasterReportCategoryValidation() {
		return reportMaster_ReportCategoryValidation;
	}

	@FindBy(xpath = "//ion-title[contains(text(),' Report Master - List View ')]")
	private WebElement reportMaster_ListViewTxt;

	public WebElement reportMasterListViewText() {
		return reportMaster_ListViewTxt;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Add'])[2]")
	private WebElement reportMaster_ParameterAddButton;

	public WebElement reportMasterReportMasterAddButton() {
		return reportMaster_ParameterAddButton;
	}

	@FindBy(xpath = "//ion-label[text()=' Template ']//following-sibling::ion-select")
	private WebElement reportParameterDetails_TemplateDropDown;

	public WebElement reportParameterDetailsTemplateDropDown() {
		return reportParameterDetails_TemplateDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Parameter 1 ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_Parameter1TextBox;

	public WebElement reportParameterDetailsParameter1TextBox() {
		return reportParameterDetails_Parameter1TextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 1 Description 1 ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_Param1Description1;

	public WebElement reportParameterDetailsParam1Description1() {
		return reportParameterDetails_Param1Description1;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 1 Description 2 ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_Param1Description2TextBox;

	public WebElement reportParameterDetailsParam1Description2TextBox() {
		return reportParameterDetails_Param1Description2TextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 1 Description 3 ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_Param1Description3TextBox;

	public WebElement reportParameterDetailsParam1Description3TextBox() {
		return reportParameterDetails_Param1Description3TextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Parameter 2 ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_Parameter2TextBox;

	public WebElement reportParameterDetailsParameter2TextBox() {
		return reportParameterDetails_Parameter2TextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 2 Description 1 ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_Param2Description1TextBox;

	public WebElement reportParameterDetailsParam2Description1TextBox() {
		return reportParameterDetails_Param2Description1TextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 2 Description 2 ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_Param2Description2TextBox;

	public WebElement reportParameterDetailsParam2Description2TextBox() {
		return reportParameterDetails_Param2Description2TextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 2 Description 3 ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_Param2Description3TextBox;

	public WebElement reportParameterDetailsParam2Description3TextBox() {
		return reportParameterDetails_Param2Description3TextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Is Mandatory ']//following-sibling::ion-select")
	private WebElement reportParameterDetails_IsMandatoryDropDown;

	public WebElement reportParameterDetailsIsMandatoryDropDown() {
		return reportParameterDetails_IsMandatoryDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Sequence No ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_SequenceNoTextBox;

	public WebElement reportParameterDetailsSequenceNoTextBox() {
		return reportParameterDetails_SequenceNoTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Sequence No ']//following-sibling::ion-input")
	private WebElement reportParameterDetails_SequenceNoDataHolder;

	public WebElement reportParameterDetailsSequenceNoDataHolder() {
		return reportParameterDetails_SequenceNoDataHolder;
	}

	@FindBy(xpath = "//ion-label[text()=' Date Format ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_DateFormatTextBox;

	public WebElement reportParameterDetailsDateFormatTextBox() {
		return reportParameterDetails_DateFormatTextBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Nullable Values ']//following-sibling::ion-input//input")
	private WebElement reportParameterDetails_NullableValuesTextBox;

	public WebElement reportParameterDetailsNullableValuesTextBox() {
		return reportParameterDetails_NullableValuesTextBox;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Save'])[2]")
	private WebElement reportParameterDetails_ReportParameterDetailsSaveButton;

	public WebElement reportParameterDetailsReportParameterDetailsSaveButton() {
		return reportParameterDetails_ReportParameterDetailsSaveButton;
	}

	@FindBy(xpath = "//ion-label[text()=' Template ']//ancestor::digital-select-layout//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_TemplateFieldValidation;

	public WebElement reportParameterDetailsTemplateFieldValidation() {
		return reportParameterDetails_TemplateFieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Parameter 1 ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_Parameter1FieldValidation;

	public WebElement reportParameterDetailsParameter1FieldValidation() {
		return reportParameterDetails_Parameter1FieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Parameter 2 ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_Parameter2FieldValidation;

	public WebElement reportParameterDetailsParameter2FieldValidation() {
		return reportParameterDetails_Parameter2FieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 1 Description 1 ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_Param1Description1FieldValidation;

	public WebElement reportParameterDetailsParam1Description1FieldValidation() {
		return reportParameterDetails_Param1Description1FieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 1 Description 2 ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_Param1Description2FieldValidation;

	public WebElement reportParameterDetailsParam1Description2FieldValidation() {
		return reportParameterDetails_Param1Description2FieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 1 Description 3 ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_Param1Description3FieldValidation;

	public WebElement reportParameterDetailsParam1Description3FieldValidation() {
		return reportParameterDetails_Param1Description3FieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 2 Description 2 ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_Param2Description2FieldValidation;

	public WebElement reportParameterDetailsParam2Description2FieldValidation() {
		return reportParameterDetails_Param2Description2FieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Param 2 Description 3 ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_Param2Description3FieldValidation;

	public WebElement reportParameterDetailsParam2Description3FieldValidation() {
		return reportParameterDetails_Param2Description3FieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Sequence No ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_SequenceNoFieldValidation;

	public WebElement reportParameterDetailsSequenceNoFieldValidation() {
		return reportParameterDetails_SequenceNoFieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Date Format ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_DateFormatFieldValidation;

	public WebElement reportParameterDetailsDateFormatFieldValidation() {
		return reportParameterDetails_DateFormatFieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Nullable Values ']//ancestor::digital-text-box//parent::ion-col//div//ion-badge")
	private WebElement reportParameterDetails_NullableValuesFieldValidation;

	public WebElement reportParameterDetailsNullableValuesFieldValidation() {
		return reportParameterDetails_NullableValuesFieldValidation;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement toastAlert;

	public WebElement toastAlert() {
		return toastAlert;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name ']//following-sibling::ion-input")
	private WebElement reportMaster_reportNameDataHolder;

	public WebElement reportMasterReportnameDataHolder() {
		return reportMaster_reportNameDataHolder;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name ']//following-sibling::ion-input//input")
	private WebElement reportMaster_ReportNameInputBox;

	public WebElement reportMasterReportNameInputBox() {
		return reportMaster_ReportNameInputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportNameFieldValidation;

	public WebElement reportMasterReportNameFieldValidation() {
		return reportMaster_ReportNameFieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name 2 ']//following-sibling::ion-input")
	private WebElement reportMaster_reportName2DataHolder;

	public WebElement reportMasterReportname2DataHolder() {
		return reportMaster_reportName2DataHolder;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name 2 ']//following-sibling::ion-input//input")
	private WebElement reportMaster_ReportName2InputBox;

	public WebElement reportMasterReportName2InputBox() {
		return reportMaster_ReportName2InputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name 2 ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportName2FieldValidation;

	public WebElement reportMasterReportName2FieldValidation() {
		return reportMaster_ReportName2FieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name 3 ']//following-sibling::ion-input")
	private WebElement reportMaster_reportName3DataHolder;

	public WebElement reportMasterReportname3DataHolder() {
		return reportMaster_reportName3DataHolder;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name 3 ']//following-sibling::ion-input//input")
	private WebElement reportMaster_ReportName3InputBox;

	public WebElement reportMasterReportName3InputBox() {
		return reportMaster_ReportName3InputBox;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Name 3 ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportName3FieldValidation;

	public WebElement reportMasterReportName3FieldValidation() {
		return reportMaster_ReportName3FieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Description ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportDescriptionFieldValidation;

	public WebElement reportMasterReportDescriptionFieldValidation() {
		return reportMaster_ReportDescriptionFieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Description ']//following-sibling::ion-input")
	private WebElement reportMaster_ReportDescriptionDataHolder;

	public WebElement reportMasterReportDescriptionDataHolder() {
		return reportMaster_ReportDescriptionDataHolder;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Description ']//following-sibling::ion-input//input")
	private WebElement reportMaster_ReportDescriptionInputBox;

	public WebElement reportMasterReportDescriptionInputBox() {
		return reportMaster_ReportDescriptionInputBox;
	}

	@FindBy(xpath = "//textarea")
	private WebElement reportMaster_ReportURLField;

	public WebElement reportMasterReportURLField() {
		return reportMaster_ReportURLField;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Url  ']//parent::ion-item//parent::digital-text-box//following-sibling::div//ion-badge")
	private WebElement reportMaster_reportURLFieldvalidation;

	public WebElement reportMasterReportURLFieldValidation() {
		return reportMaster_reportURLFieldvalidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Type ']//following-sibling::ion-select")
	private WebElement reportMaster_ReportTypeDropdown;

	public WebElement reportMasterReportTypeDropdown() {
		return reportMaster_ReportTypeDropdown;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Type ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportTypeDropdownFieldValidation;

	public WebElement reportMasterReportTypeDropdownFieldValidation() {
		return reportMaster_ReportTypeDropdownFieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Category ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportCategoryDropdownFieldValidation;

	public WebElement reportMasterReportCategoryDropdownFieldValidation() {
		return reportMaster_ReportCategoryDropdownFieldValidation;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Category ']//following-sibling::ion-select")
	private WebElement reportMaster_ReportCategoryDropdown;

	public WebElement reportMasterReportCategoryDropdown() {
		return reportMaster_ReportCategoryDropdown;
	}

	@FindBy(xpath = "//tr[1]//td[1]//button[@ng-reflect-icon='pi pi-pencil']")
	private WebElement reportMaster_ApprovedRecordEditIcon;

	public WebElement reportMaster_ApprovedRecordEditIcon() {
		return reportMaster_ApprovedRecordEditIcon;
	}

	

//	@FindBy(xpath = "//span[text()='Configurations']//following-sibling::ion-icon")
//	private WebElement configurationOptions;
//
//	public WebElement configurationOptions() {
//		return configurationOptions;
//	}
//
//	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
//	private WebElement addIcon;
//
//	public WebElement addIcon() {
//		return addIcon;
//	}
//
//	@FindBy(xpath = "//ion-label[text()='Config Manager']//following-sibling::ion-icon")
//	private WebElement configManager;
//
//	public WebElement configManager() {
//		return configManager;
//	}
//
//	@FindBy(xpath = "//ion-label[text()='Report Master']//following-sibling::ion-buttons//child::ion-button[1]")
//	private WebElement reportMasterEditIcon;
//
//	public WebElement reportMasterEditIcon() {
//		return reportMasterEditIcon;
//	}
//
//	@FindBy(xpath = "//ion-label[text()='Report Master']//following-sibling::ion-buttons//child::ion-button[2]")
//	private WebElement reportMasterViewIcon;
//
//	public WebElement reportMasterViewIcon() {
//		return reportMasterViewIcon;
//	}
//
//	@FindBy(xpath = "//ion-label[text()=' Report Name ']/following-sibling::ion-input/input")
//	private WebElement reportName;
//
//	public WebElement reportName() {
//		return reportName;
//	}
//
//	@FindBy(xpath = "//ion-label[text()=' Report Name 2 ']/following-sibling::ion-input/input")
//	private WebElement reportName2;
//
//	public WebElement reportName2() {
//		return reportName2;
//	}
//
//	@FindBy(xpath = "//ion-label[text()=' Report Name 3 ']/following-sibling::ion-input/input")
//	private WebElement reportName3;
//
//	public WebElement reportName3() {
//		return reportName3;
//	}
//
//	@FindBy(xpath = "//ion-select[@aria-label='Select,  Report Type *']")
//	private WebElement reportType;
//
//	public WebElement reportType() {
//		return reportType;
//	}
//
//	@FindBy(xpath = "//ion-label[text()=' Report Url  ']/following-sibling::ion-textarea//textarea")
//	private WebElement reportUrl;
//
//	public WebElement reportUrl() {
//		return reportUrl;
//	}
//
//	@FindBy(xpath = "//ion-select[@aria-label='Select,  Report Category *']")
//	private WebElement reportCategoey;
//
//	public WebElement reportCategory() {
//		return reportCategoey;
//	}
//
//	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
//	private WebElement Report_Master_Save;
//
//	public WebElement Report_Master_Save() {
//		return Report_Master_Save;
//	}

	@FindBy(xpath = "//ion-label[text()=' Group Name ']/following-sibling::ion-input/input")
	private WebElement ReportGroupMaster_GroupName1;

	public WebElement ReportGroupMaster_GroupName() {
		return ReportGroupMaster_GroupName1;
	}

	@FindBy(xpath = "//ion-label[text()=' Report Description ']/following-sibling::ion-input/input")
	private WebElement Reportdescription1;

	public WebElement Reportdescription() {
		return Reportdescription1;
	}

	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement Report_Master_ReportGroupMaster1;

	public WebElement Report_Master_ReportGroupMaster() {
		return Report_Master_ReportGroupMaster1;
	}

	@FindBy(xpath = "//ion-label[text()=' Group Description ']/following-sibling::ion-input/input")
	private WebElement ReportGroupMaster_GroupDescription1;

	public WebElement ReportGroupMaster_GroupDescription() {
		return ReportGroupMaster_GroupDescription1;
	}

	@FindBy(xpath = "//ion-label[text()='  Min Parameters Required ']/following-sibling::ion-input/input")
	private WebElement ReportGroupMaster_MinParametersRequired1;

	public WebElement ReportGroupMaster_MinParametersRequired() {
		return ReportGroupMaster_MinParametersRequired1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='View'])[1]")
	private WebElement ReportGroupMaster_ListViewEyeIcon1;

	public WebElement ReportGroupMaster_ListViewEyeIcon() {
		return ReportGroupMaster_ListViewEyeIcon1;
	}

	@FindBy(xpath = "//ion-grid[1]/ion-row[1]/ion-col[2]/data-grid[1]//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement parameter_ListViewSearch1;

	public WebElement parameter_ListViewSearch() {
		return parameter_ListViewSearch1;
	}

	@FindBy(xpath = "//input[@mode='ios']")
	private WebElement parameter_ListViewSearchText1;

	public WebElement parameter_ListViewSearchText() {
		return parameter_ListViewSearchText1;
	}

	@FindBy(xpath = "(//span[text()='Export'])[2]")
	private WebElement exportIcon;

	public WebElement exportIcon() {
		return exportIcon;
	}

	@FindBy(xpath = "//li[@aria-label='PDF']")
	private WebElement exportToPDF;

	public WebElement exportToPDF() {
		return exportToPDF;
	}

	@FindBy(xpath = "//li[@aria-label='XLS']")
	private WebElement exportToExcel;

	public WebElement exportToExcel() {
		return exportToExcel;
	}

	@FindBy(xpath = "(//tbody/tr[1]/td[4]/p-celleditor[1]/span[1])[2]")
	private WebElement parameter_ListViewMachedData1;

	public WebElement parameter_ListViewMachedData() {
		return parameter_ListViewMachedData1;
	}

	@FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement Report_Inbox1;

	public WebElement Report_Inbox() {
		return Report_Inbox1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Search'])[2]")
	private WebElement ReportMaster_SeachButton1;

	public WebElement ReportMaster_SeachButton() {
		return ReportMaster_SeachButton1;
	}

	@FindBy(xpath = "//ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement ReportMaster_SearchText1;

	public WebElement ReportMaster_SearchText() {
		return ReportMaster_SearchText1;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement ReportMaster_GetRefId1;

	public WebElement ReportMaster_GetRefId() {
		return ReportMaster_GetRefId1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement ReportMaster_ActionIcon1;

	public WebElement ReportMaster_ActionIcon() {
		return ReportMaster_ActionIcon1;
	}

	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	private WebElement ReportMaster_SubmitButton1;

	public WebElement ReportMaster_SubmitButton() {
		return ReportMaster_SubmitButton1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'ok')]")
	private WebElement ReportMaster_SubmitOKButton1;

	public WebElement ReportMaster_SubmitOKButton() {
		return ReportMaster_SubmitOKButton1;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")
	private WebElement ReportMaster_FinalSubmitButton1;

	public WebElement ReportMaster_FinalSubmitButton() {
		return ReportMaster_FinalSubmitButton1;
	}

//@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	@FindBy(xpath = "//div[@id='toast-container']//div[contains(text(),'Record APPROVED Successfully')]")
	private WebElement ReportMaster_CheckerId1;

	public WebElement ReportMaster_CheckerId() {
		return ReportMaster_CheckerId1;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[contains(text(),'Record RETURNED')]")
	private WebElement ReportMaster_ReturnPopUp1;

	public WebElement ReportMaster_ReturnPopUp() {
		return ReportMaster_ReturnPopUp1;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[contains(text(),'Record REJECTED Successfully')]")
	private WebElement ReportMaster_RejectPopUp1;

	public WebElement ReportMaster_RejectPopUp() {
		return ReportMaster_RejectPopUp1;
	}

	@FindBy(xpath = "//ion-icon[@aria-label='menu']")
	private WebElement DepositAccount_Menu1;

	public WebElement DepositAccount_Menu() {
		return DepositAccount_Menu1;
	}

	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") // ion-icon[@aria-label='mail unread outline']
	private WebElement ReportMaster_CheckerInbox1;

	public WebElement ReportMaster_CheckerInbox() {
		return ReportMaster_CheckerInbox1;
	}

	@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
	private WebElement ReportMaster_CheckerApproveButton1;

	public WebElement ReportMaster_CheckerApproveButton() {
		return ReportMaster_CheckerApproveButton1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'approve')]")
	private WebElement ReportMaster_CheckerAlertApprove1;

	public WebElement ReportMaster_CheckerAlertApprove() {
		return ReportMaster_CheckerAlertApprove1;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")
	private WebElement ReportMaster_CheckerFinalApprove1;

	public WebElement ReportMaster_CheckerFinalApprove() {
		return ReportMaster_CheckerFinalApprove1;
	}

	@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
	private WebElement ReportMaster_CheckerRejectButton1;

	public WebElement ReportMaster_CheckerRejectButton() {
		return ReportMaster_CheckerRejectButton1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'cancel')]")
	private WebElement ReportMaster_CheckerAlertReject1;

	public WebElement ReportMaster_CheckerAlertReject() {
		return ReportMaster_CheckerAlertReject1;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")
	private WebElement ReportMaster_CheckerFinalReject1;

	public WebElement ReportMaster_CheckerFinalReject() {
		return ReportMaster_CheckerFinalReject1;
	}

	@FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]")
	private WebElement ReportMaster_CheckerReturnButton1;

	public WebElement ReportMaster_CheckerReturnButton() {
		return ReportMaster_CheckerReturnButton1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'return')]")
	private WebElement ReportMaster_CheckerAlertReturn1;

	public WebElement ReportMaster_CheckerAlertReturn() {
		return ReportMaster_CheckerAlertReturn1;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")
	private WebElement ReportMaster_CheckerFinalReturn1;

	public WebElement ReportMaster_CheckerFinalReturn1() {
		return ReportMaster_CheckerFinalReturn1;
	}
	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement reportMasterConfigMenu;

	public WebElement reportMasterConfigMenu() {
		return reportMasterConfigMenu;
	}

	// Menu toggle
	@FindBy(xpath = "//ion-col/div/ion-button")
	private WebElement reportMaster_Maker_MenuToggle;

	public WebElement reportMaster_Maker_MenuToggle() {
		return reportMaster_Maker_MenuToggle;
	}

//	@FindBy(xpath = "(//li[3]//ion-icon[1])[1]")
	@FindBy(xpath = "//span[contains(text(),'Configurations')]")
	private WebElement reportMasterConfigurations;

	public WebElement reportMasterConfigurations() {
		return reportMasterConfigurations;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Report Master')]/following-sibling::ion-buttons/ion-button[1]")
	private WebElement reportMaster_WorkInProgressRecordsButton;

	public WebElement reportMaster_WorkInProgressRecordsButton() {
		return reportMaster_WorkInProgressRecordsButton;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Report Master')]/following-sibling::ion-buttons/ion-button[2]")
	private WebElement reportMaster_ApprovedRecordsButton;

	public WebElement reportMaster_ApprovedRecordsButton() {
		return reportMaster_ApprovedRecordsButton;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement reportMaster_addButton;

	public WebElement reportMaster_addButton() {
		return reportMaster_addButton;
	}

//	report parameter details add button
	@FindBy(xpath = "(//button[@ng-reflect-text='Add'])[2]")
	private WebElement reportMaster_addButton2;

	public WebElement reportMaster_addButton2() {
		return reportMaster_addButton2;
	}

	

//	report group master
	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement reportMaster_ReportGroupMasterSegmentButton;

	public WebElement reportMaster_ReportGroupMasterSegmentButton() {
		return reportMaster_ReportGroupMasterSegmentButton;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement reportMaster_SaveButton;

	public WebElement reportMaster_SaveButton() {
		return reportMaster_SaveButton;
	}

	// Group Name
//	@FindBy(xpath = "//ion-label[contains(text(),'Group Name')]/following-sibling::ion-input/input")
	@FindBy(xpath = "//span[contains(text(),'Group Name')]")
	private WebElement reportMaster_GroupName;

	public WebElement reportMaster_GroupName() {
		return reportMaster_GroupName;
	}

	// Special Character validation message
	@FindBy(xpath = "//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement reportMaster_SpecialCharacterValidationMessage;

	public WebElement reportMaster_SpecialCharacterValidationMessage() {
		return reportMaster_SpecialCharacterValidationMessage;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement reportMaster_SearchButton;

	public WebElement reportMaster_SearchButton() {
		return reportMaster_SearchButton;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement reportMaster_SearchInputField;

	public WebElement reportMaster_SearchInputField() {
		return reportMaster_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement reportMaster_SearchCloseButton;

	public WebElement reportMaster_SearchCloseButton() {
		return reportMaster_SearchCloseButton;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement reportMaster_Maker_SearchInbox;

	public WebElement reportMaster_Maker_SearchInbox() {
		return reportMaster_Maker_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement reportMaster_Maker_SearchInboxInputField;

	public WebElement reportMaster_Maker_SearchInboxInputField() {
		return reportMaster_Maker_SearchInboxInputField;
	}

	// SearchInboxCloseButton
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement reportMaster_Maker_SearchInboxCloseButton;

	public WebElement reportMaster_Maker_SearchInboxCloseButton() {
		return reportMaster_Maker_SearchInboxCloseButton;
	}
	
	// no data display
	@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
	private WebElement reportMaster_NoDataFoundInSearch;

	public WebElement reportMaster_NoDataFoundInSearch() {
		return reportMaster_NoDataFoundInSearch;
	}

	// export
	@FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]")
	private WebElement reportMaster_Export;

	public WebElement reportMaster_Export() {
		return reportMaster_Export;
	}

	// pdf
	@FindBy(xpath = " //li[@aria-label='PDF']") // PDF
	private WebElement reportMaster_PdfFile;

	public WebElement reportMaster_PdfFile() {
		return reportMaster_PdfFile;
	}

	// xls
	@FindBy(xpath = " //li[@aria-label='XLS']") // XLS
	private WebElement reportMaster_XlsFile;

	public WebElement reportMaster_XlsFile() {
		return reportMaster_XlsFile;
	}
	
	// List View GroupHeader ID field
	@FindBy(xpath = "//span[contains(text(),'ID')]")
	private WebElement reportMaster_ListViewGroupHeaderIDField;

	public WebElement reportMaster_ListViewGroupHeaderIDField() {
		return reportMaster_ListViewGroupHeaderIDField;
	}

	// List View GroupName field
	@FindBy(xpath = "//span[contains(text(),'Group Name')]")
	private WebElement reportMaster_ListViewGroupNameField;

	public WebElement reportMaster_ListViewGroupNameField() {
		return reportMaster_ListViewGroupNameField;
	}

	// List View Description field
	@FindBy(xpath = "//span[contains(text(),'Description')]")
	private WebElement reportMaster_ListViewDescriptionField;

	public WebElement reportMaster_ListViewDescriptionField() {
		return reportMaster_ListViewDescriptionField;
	}

	// List View Status
	@FindBy(xpath = "//span[contains(text(),'Status')]")
	private WebElement reportMaster_ListViewStatusField;

	public WebElement reportMaster_ListViewStatusField() {
		return reportMaster_ListViewStatusField;
	}
	
	
	
	
	
	// Profile
	@FindBy(xpath = "//ion-list[1]/ion-item[8]/img[1]")
	private WebElement reportMaster_Profile;

	public WebElement reportMaster_Profile() {
		return reportMaster_Profile;
	}

	// logout
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement reportMaster_LogoutUser;

	public WebElement reportMaster_LogoutUser() {
		return reportMaster_LogoutUser;
	}
	
	// Report name field
	@FindBy(xpath = "//ion-label[text()=' Report Name ']/../ion-input/input")
	private WebElement reportMaster_ReportName;
	
	public WebElement reportMaster_ReportName() {
		return reportMaster_ReportName;
	}
	
	// Report name 2 field
	@FindBy(xpath = "//ion-label[text()=' Report Name 2 ']/../ion-input/input")
	private WebElement reportMaster_ReportName2;
	
	public WebElement reportMaster_ReportName2() {
		return reportMaster_ReportName2;
	}
	
	// Report name 3 field
	@FindBy(xpath = "//ion-label[text()=' Report Name 3 ']/../ion-input/input")
	private WebElement reportMaster_ReportName3;
	
	public WebElement reportMaster_ReportName3() {
		return reportMaster_ReportName3;
	}
	
	// Report description field
	@FindBy(xpath = "//ion-label[text()=' Report Description ']/../ion-input/input")
	private WebElement reportMaster_ReportDescription;
	
	public WebElement reportMaster_ReportDescription() {
		return reportMaster_ReportDescription;
	}
	
	// Report type field
	@FindBy(xpath = "//ion-label[text()=' Report Type ']/../ion-select")
	private WebElement reportMaster_ReportType;
	
	public WebElement reportMaster_ReportType() {
		return reportMaster_ReportType;
	}
	
	// Report Url field
//	@FindBy(xpath = "//ion-label[text()=' Report Url  ']/../ion-textarea/div/textarea")
	@FindBy(xpath = "//ion-label[contains(text(),' Report Url ')]/following-sibling::ion-textarea/div/textarea")
	private WebElement reportMaster_ReportUrl;
	
	public WebElement reportMaster_ReportUrl() {
		return reportMaster_ReportUrl;
	}

	// Report category field
	@FindBy(xpath = "//ion-label[text()=' Report Category ']/../ion-select")
	private WebElement reportMaster_ReportCategory;
	
	public WebElement reportMaster_ReportCategory() {
		return reportMaster_ReportCategory;
	}
	
	// save success message
	@FindBy(xpath = "(//body/div/div/div/div[1])[1]")
	private WebElement reportMaster_SaveConfirmationMessage;
	
	public WebElement reportMaster_SaveConfirmationMessage() {
		return reportMaster_SaveConfirmationMessage;
	}

	// save success message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement reportMaster_SaveConfirmationMessageCloseButton;

	public WebElement reportMaster_SaveConfirmationMessageCloseButton() {
		return reportMaster_SaveConfirmationMessageCloseButton;
	}
	
	// inbox
	@FindBy(xpath = "//ion-list[1]/ion-item[1]/div[1]")
	private WebElement reportMaster_Inbox;

	public WebElement reportMaster_Inbox() {
		return reportMaster_Inbox;
	}
	
	// MakerRemarks
//	@FindBy(xpath = "//ion-textarea[1]//textarea[1]")
	@FindBy(xpath = "//ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement reportMaster_MakerSubmitRemark;

	public WebElement reportMaster_MakerSubmitRemark() {
		return reportMaster_MakerSubmitRemark;
	}
	
	//status
	@FindBy(xpath = "//ion-label[contains(text(),'Status')]/../../../digital-radio-button/ion-item/ion-toggle")
	private WebElement reportMaster_StatusToggle;
	
	public WebElement reportMaster_StatusToggle() {
		return reportMaster_StatusToggle;
	}
	
	//Report master - List view
	@FindBy(xpath = "//ion-title[contains(text(),'Report Master - List View')]")
	private WebElement reportMaster_ReportMasterListViewTitle;
	
	public WebElement reportMaster_ReportMasterListViewTitle() {
		return reportMaster_ReportMasterListViewTitle;
	}

	// Submit
	@FindBy(xpath = "//button/span[contains(text(),'Submit')]")
	private WebElement reportMaster_Submit;

	public WebElement reportMaster_Submit() {
		return reportMaster_Submit;
	}

	// FinalSubmit
	@FindBy(xpath = "(//span[contains(text(),'Submit')])[2]")
	private WebElement reportMaster_FinalSubmit;

	public WebElement reportMaster_FinalSubmit() {
		return reportMaster_FinalSubmit;
	}
	
	// Confirmation Message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement reportMaster_ConfirmationMessage;

	public WebElement reportMaster_ConfirmationMessage() {
		return reportMaster_ConfirmationMessage;
	}

	// confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement reportMaster_ConfirmationMessageCloseButton;

	public WebElement reportMaster_ConfirmationMessageCloseButton() {
		return reportMaster_ConfirmationMessageCloseButton;
	}

	// Menu toggle
	@FindBy(xpath = "//ion-menu-toggle/ion-button")
	private WebElement reportMaster_Checker_MenuToggle;

	public WebElement reportMaster_Checker_MenuToggle() {
		return reportMaster_Checker_MenuToggle;
	}
	
	@FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']/ion-icon[1]")
	private WebElement reportMaster_Checker_Inbox;

	public WebElement reportMaster_Checker_Inbox() {
		return reportMaster_Checker_Inbox;
	}

	// search inbox
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement reportMaster_Checker_SearchInbox;

	public WebElement reportMaster_Checker_SearchInbox() {
		return reportMaster_Checker_SearchInbox;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/input")
	private WebElement reportMaster_Checker_SearchInboxInputField;

	public WebElement reportMaster_Checker_SearchInboxInputField() {
		return reportMaster_Checker_SearchInboxInputField;
	}

	// search inbox input fields
	@FindBy(xpath = "//p-table/div/div/div/span/i")
	private WebElement reportMaster_Checker_SearchInboxCloseButton;

	public WebElement reportMaster_Checker_SearchInboxCloseButton() {
		return reportMaster_Checker_SearchInboxCloseButton;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	private WebElement reportMaster_Checker_Approve;

	public WebElement reportMaster_Checker_Approve() {
		return reportMaster_Checker_Approve;
	}

	// approve remark
	@FindBy(xpath = "//ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement reportMaster_Checker_CheckerApproveRemark;

	public WebElement reportMaster_Checker_CheckerApproveRemark() {
		return reportMaster_Checker_CheckerApproveRemark;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement reportMaster_Checker_CheckerApproveButton;

	public WebElement reportMaster_Checker_CheckerApproveButton() {
		return reportMaster_Checker_CheckerApproveButton;
	}

	// Approve confirmation message
	@FindBy(xpath = "//body/div/div/div/div[1]")
	private WebElement reportMaster_Checker_ApproveConfirmationMessage;

	public WebElement reportMaster_Checker_ApproveConfirmationMessage() {
		return reportMaster_Checker_ApproveConfirmationMessage;
	}

	// Submit confirmation message close button
	@FindBy(xpath = "//body/div/div/div/button")
	private WebElement reportMaster_Checker_ApproveConfirmationMessageCloseButton;

	public WebElement reportMaster_Checker_ApproveConfirmationMessageCloseButton() {
		return reportMaster_Checker_ApproveConfirmationMessageCloseButton;
	}
	
	
////////////////////////////////////////////////////Below object should be removed	


	@FindBy(xpath = "//button[@ng-reflect-text='View Summary']")
	private WebElement covenantMaster_ViewSummaryButton;

	public WebElement covenantMaster_ViewSummaryButton() {
		return covenantMaster_ViewSummaryButton;
	}

	@FindBy(xpath = "(//table//tr[1]//td[2])[3]")
	private WebElement covenantMaster_UserID;

	public WebElement covenantMaster_UserID() {
		return covenantMaster_UserID;
	}

	@FindBy(xpath = "(//table//tr[1]//td[3])[3]")
	private WebElement covenantMaster_StageCode;

	public WebElement covenantMaster_StageCode() {
		return covenantMaster_StageCode;
	}

	@FindBy(xpath = "(//table//tr[1]//td[4])[3]")
	private WebElement covenantMaster_Status;

	public WebElement covenantMaster_Status() {
		return covenantMaster_Status;
	}

	@FindBy(xpath = "(//table//tr[1]//td[5])[3]")
	private WebElement covenantMaster_StartTime;

	public WebElement covenantMaster_StartTime() {
		return covenantMaster_StartTime;
	}

	@FindBy(xpath = "(//table//tr[1]//td[6])[3]")
	private WebElement covenantMaster_EndTime;

	public WebElement covenantMaster_EndTime() {
		return covenantMaster_EndTime;
	}

	@FindBy(xpath = "//ion-buttons[1]/ion-button[1]")
	private WebElement covenantMaster_Close;

	public WebElement covenantMaster_Close() {
		return covenantMaster_Close;
	}
}
