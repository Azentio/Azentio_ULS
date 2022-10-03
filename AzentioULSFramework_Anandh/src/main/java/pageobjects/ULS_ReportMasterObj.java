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
	@FindBy(xpath="//ion-label[text()=' Report Name ']//following-sibling::ion-input")
	private WebElement reportMaster_reportNameDataHolder;
	public WebElement reportMasterReportnameDataHolder()
	{
		return reportMaster_reportNameDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Report Name ']//following-sibling::ion-input//input")
	private WebElement reportMaster_ReportNameInputBox;
	public WebElement reportMasterReportNameInputBox()
	{
		return reportMaster_ReportNameInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Report Name ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportNameFieldValidation;
	public WebElement reportMasterReportNameFieldValidation()
	{
		return reportMaster_ReportNameFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Report Name 2 ']//following-sibling::ion-input")
	private WebElement reportMaster_reportName2DataHolder;
	public WebElement reportMasterReportname2DataHolder()
	{
		return reportMaster_reportName2DataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Report Name 2 ']//following-sibling::ion-input//input")
	private WebElement reportMaster_ReportName2InputBox;
	public WebElement reportMasterReportName2InputBox()
	{
		return reportMaster_ReportName2InputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Report Name 2 ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportName2FieldValidation;
	public WebElement reportMasterReportName2FieldValidation()
	{
		return reportMaster_ReportName2FieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Report Name 3 ']//following-sibling::ion-input")
	private WebElement reportMaster_reportName3DataHolder;
	public WebElement reportMasterReportname3DataHolder()
	{
		return reportMaster_reportName3DataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Report Name 3 ']//following-sibling::ion-input//input")
	private WebElement reportMaster_ReportName3InputBox;
	public WebElement reportMasterReportName3InputBox()
	{
		return reportMaster_ReportName3InputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Report Name 3 ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportName3FieldValidation;
	public WebElement reportMasterReportName3FieldValidation()
	{
		return reportMaster_ReportName3FieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Report Description ']//ancestor::digital-text-box//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportDescriptionFieldValidation;
	public WebElement reportMasterReportDescriptionFieldValidation()
	{
		return reportMaster_ReportDescriptionFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Report Description ']//following-sibling::ion-input")
	private WebElement reportMaster_ReportDescriptionDataHolder;
	public WebElement reportMasterReportDescriptionDataHolder()
	{
		return reportMaster_ReportDescriptionDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Report Description ']//following-sibling::ion-input//input")
	private WebElement reportMaster_ReportDescriptionInputBox;
	public WebElement reportMasterReportDescriptionInputBox()
	{
		return reportMaster_ReportDescriptionInputBox;
	}
	@FindBy(xpath="//textarea")
	private WebElement reportMaster_ReportURLField;
	public WebElement reportMasterReportURLField()
	{
		return reportMaster_ReportURLField;
	}
	@FindBy(xpath="//ion-label[text()=' Report Url  ']//parent::ion-item//parent::digital-text-box//following-sibling::div//ion-badge")
	private WebElement reportMaster_reportURLFieldvalidation;
	public WebElement reportMasterReportURLFieldValidation()
	{
		return reportMaster_reportURLFieldvalidation;
	}
	@FindBy(xpath="//ion-label[text()=' Report Type ']//following-sibling::ion-select")
	private WebElement reportMaster_ReportTypeDropdown;
	public WebElement reportMasterReportTypeDropdown()
	{
		return reportMaster_ReportTypeDropdown;
	}
	@FindBy(xpath="//ion-label[text()=' Report Type ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportTypeDropdownFieldValidation;
	public WebElement reportMasterReportTypeDropdownFieldValidation()
	{
		return reportMaster_ReportTypeDropdownFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Report Category ']//ancestor::digital-select-layout//following-sibling::div//ion-badge")
	private WebElement reportMaster_ReportCategoryDropdownFieldValidation;
	public WebElement reportMasterReportCategoryDropdownFieldValidation()
	{
		return reportMaster_ReportCategoryDropdownFieldValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Report Category ']//following-sibling::ion-select")
	private WebElement reportMaster_ReportCategoryDropdown;
	public WebElement reportMasterReportCategoryDropdown()
	{
		return reportMaster_ReportCategoryDropdown;
	}
	@FindBy(xpath="//tr[1]//td[1]//button[@ng-reflect-icon='pi pi-pencil']")
	private WebElement reportMaster_ApprovedRecordEditIcon;
	public WebElement reportMaster_ApprovedRecordEditIcon()
	{
		return reportMaster_ApprovedRecordEditIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement reportMaster_SaveButton;
	public WebElement reportMasterSaveButton()
	{
		return reportMaster_SaveButton;
	}
}
