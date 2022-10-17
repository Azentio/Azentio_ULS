package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportMasterObj {
WebDriver driver;
public ReportMasterObj(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//ion-label[text()='Report Master']//following-sibling::ion-buttons//child::ion-button[2]")
private WebElement reportMasterApproveIcon;
public WebElement reportMasterApproveIcon() {
	return reportMasterApproveIcon;
}
@FindBy(xpath="//button[@ng-reflect-text='Add']")
private WebElement addIcon;
public WebElement addIcon() {
	return addIcon;
}
@FindBy(xpath="//ion-label[text()=' Report Category ']/following-sibling::ion-select")
private WebElement reportCategory;
public WebElement reportCategory() {
	return reportCategory;
}
@FindBy(xpath="//span[text()='Configurations']//following-sibling::ion-icon")
private WebElement configurationOptions;
public WebElement configurationOptions() {
	return configurationOptions;
}
@FindBy(xpath="//ion-label[text()='Config Manager']")
private WebElement configManagerOptions;
public WebElement configManagerOptions() {
	return configManagerOptions;
}
@FindBy(xpath="//ion-label[text()=' Report Name ']/following-sibling::ion-input/input")
private WebElement reportName;
public WebElement reportName() {
	return reportName;
} 
@FindBy(xpath="//ion-label[text()=' Report Name 2 ']/following-sibling::ion-input/input")
private WebElement reportName2;
public WebElement reportName2() {
	return reportName2;
}
@FindBy(xpath="//ion-label[text()=' Report Name 3 ']/following-sibling::ion-input/input")
private WebElement reportName3;
public WebElement reportName3() {
	return reportName3;
}
@FindBy(xpath = "//ion-label[text()=' Report Description ']/following-sibling::ion-input/input") 
private WebElement Reportdescription1;
public WebElement Reportdescription() {
    return Reportdescription1;
}
@FindBy(xpath="//ion-label[text()=' Report Url  ']/following-sibling::ion-textarea//textarea")
private WebElement reportUrl;
public WebElement reportUrl() {
	return reportUrl;
}

@FindBy(xpath="//ion-label[text()=' Report Type ']/following-sibling::ion-select")
private WebElement reportType;
public WebElement reportType() {
	return reportType;
}
@FindBy(xpath = "//button[@ng-reflect-text=\"Update\"]") 
private WebElement Report_Master_Update;
public WebElement Report_Master_Update() {
    return Report_Master_Update;
}
@FindBy(xpath="//tr[1]/td[1]/span[1]/button[1]")
private WebElement firstEditIcon;
public WebElement firstEditIcon() {
	return firstEditIcon;
} 
@FindBy(xpath="//ion-toggle[@role='switch']")
private WebElement reportMasterStatusSwitchButton;
public WebElement reportMasterStatusSwitchButton() {
	return reportMasterStatusSwitchButton;
}
@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") 
private WebElement Inbox;
public WebElement Inbox() {
    return Inbox;
} 
@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]") 
private WebElement InboxView_Search;
public WebElement InboxView_Search() {
    return InboxView_Search;
}  
@FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input") 
private WebElement InboxView_SearchText;
public WebElement InboxView_SearchText() {
    return InboxView_SearchText;
} 
@FindBy(xpath = "(//td[contains(text(),'MST_REPORT')])[1]//preceding-sibling::td[1]//child::span") 
private WebElement reportMasterReferanceId;
public WebElement reportMasterReferanceId() {
    return reportMasterReferanceId;
} 
@FindBy(xpath="(//td[text()=' MST_REPORT '])[1]//parent::tr//child::td[1]/button")
private WebElement firstEditIconInMakerListView;
public WebElement firstEditIconInMakerListView() {
	return firstEditIconInMakerListView;
}
@FindBy(xpath = "//kub-workflow-decision//button[@ng-reflect-label='Submit']") 
private WebElement reportMasterMaker_Submit;
public WebElement reportMasterMaker_Submit() {
    return reportMasterMaker_Submit;
}
@FindBy(xpath = "//ion-card-subtitle[text()=' SUBMIT ']/ancestor::ion-card//button") 
private WebElement reportMasterMaker_RemarkSubmit;
public WebElement reportMasterMaker_RemarkSubmit() {
    return reportMasterMaker_RemarkSubmit;
}
@FindBy(xpath = "//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea") 
private WebElement reportMasterMaker_EnterRemark;
public WebElement reportMasterMaker_EnterRemark() {
    return reportMasterMaker_EnterRemark;
}
@FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
private WebElement reportMasterMakerRemarkSubmit;
public WebElement reportMasterMakerRemarkSubmit() {
	return reportMasterMakerRemarkSubmit;
}

//*******************************************************Checker xpath**********************************************************
@FindBy(xpath = "(//div[@role='alert'])[2]") 
private WebElement reportMaster_Checker_Id;
public WebElement reportMaster_Checker_Id() {
    return reportMaster_Checker_Id;
} 
@FindBy(xpath = "//ion-icon[@aria-label='menu']") 
private WebElement Checker_toggle;
public WebElement Checker_toggle() {
    return Checker_toggle;
} 
@FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-unread-outline']") 
private WebElement Checker_Inbox;
public WebElement Checker_Inbox() {
    return Checker_Inbox;
}
@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]") 
private WebElement Checker_Approve;
public WebElement Checker_Approve() {
    return Checker_Approve;
}  
@FindBy(xpath = "//ion-label[contains(text(),'approve')]") 
private WebElement Checker_Alert_Approve;
public WebElement Checker_Alert_Approve() {
    return Checker_Alert_Approve;
}

@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
private WebElement Checker_Final_Approve;
public WebElement Checker_Final_Approve() {
    return Checker_Final_Approve;
}
@FindBy(xpath = "//kub-workflow-decision//child::button[@label='Reject']") 
private WebElement Checker_Reject;
public WebElement Checker_Reject() {
    return Checker_Reject;
}

@FindBy(xpath = "//ion-label[contains(text(),'cancel')]") 
private WebElement Checker_Alert_Reject;
public WebElement Checker_Alert_Reject() {
    return Checker_Alert_Reject;
}

@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
private WebElement Checker_Final_Reject;
public WebElement Checker_Final_Reject() {
    return Checker_Final_Reject;
}
@FindBy(xpath = "//kub-workflow-decision//child::button[@label='Return']") 
private WebElement Checker_Return;
public WebElement Checker_Return() {
    return Checker_Return;
}

@FindBy(xpath = "//ion-label[contains(text(),'return')]") 
private WebElement Checker_Alert_Return;
public WebElement Checker_Alert_Return() {
    return Checker_Alert_Return;
}

@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
private WebElement Checker_Final_Return;
public WebElement Checker_Final_Return() {
    return Checker_Final_Return;
}
@FindBy(xpath="//div[@role='alert']")
private WebElement checkerApproveMgs;
public WebElement checkerApproveMgs() {
	return checkerApproveMgs;
}
//******************************************Parameter Details*********************************************
@FindBy(xpath="//ion-title[text()=' Report Parameter Details ']/ancestor::ion-card//tr[1]//button[1]")
private WebElement reportParameterDetailsFirstEditIcon;
public WebElement reportParameterDetailsFirstEditIcon()
{
	return reportParameterDetailsFirstEditIcon;
}
@FindBy(xpath="//ion-label[contains(text(),'Param 1 Description 1')]//following-sibling::ion-input//child::input")
private WebElement Param1Description1;
public WebElement Param1Description1()
{
	return Param1Description1;
}
@FindBy(xpath="//ion-label[contains(text(),'Param 1 Description 2')]//following-sibling::ion-input//child::input")
private WebElement Param1Description2;
public WebElement Param1Description2()
{
	return Param1Description2;
}
@FindBy(xpath="//ion-label[contains(text(),'Param 1 Description 3')]//following-sibling::ion-input//child::input")
private WebElement Param1Description3;
public WebElement Param1Description3()
{
	return Param1Description3;
}
@FindBy(xpath="//ion-label[contains(text(),'Param 2 Description 2')]//following-sibling::ion-input//child::input")
private WebElement Param2Description2;
public WebElement Param2Description2()
{
	return Param2Description2;
}
@FindBy(xpath="//ion-label[contains(text(),'Param 2 Description 3')]//following-sibling::ion-input//child::input")
private WebElement Param2Description3;
public WebElement Param2Description3()
{
	return Param2Description3;
}
@FindBy(xpath="//ion-label[contains(text(),'Group Description')]//following-sibling::ion-input//child::input")
private WebElement GroupDescription;
public WebElement GroupDescription()
{
	return GroupDescription;
}
@FindBy(xpath="//ion-label[contains(text(),'Template')]//following-sibling::ion-select")
private WebElement Template;
public WebElement Template()
{
	return Template;
}
@FindBy(xpath="//ion-label[contains(text(),'Is Mandatory')]//following-sibling::ion-select")
private WebElement IsMandatory;
public WebElement IsMandatory()
{
	return IsMandatory;
}
@FindBy(xpath="//ion-label[contains(text(),'Parameter 1')]//following-sibling::ion-input//child::input")
private WebElement Parameter1;
public WebElement Parameter1()
{
	return Parameter1;
}
@FindBy(xpath="//ion-label[contains(text(),'Group Name')]//following-sibling::ion-input//child::input")
private WebElement GroupName;
public WebElement GroupName()
{
	return GroupName;
}
@FindBy(xpath="//ion-label[contains(text(),'Min Parameters Required')]//following-sibling::ion-input//child::input")
private WebElement MinParametersRequired;
public WebElement MinParametersRequired()
{
	return MinParametersRequired;
}
@FindBy(xpath="//ion-label[contains(text(),'Parameter 2')]//following-sibling::ion-input//child::input")
private WebElement Parameter2;
public WebElement Parameter2()
{
	return Parameter2;
}
@FindBy(xpath="//ion-label[contains(text(),'Sequence No')]//following-sibling::ion-input//child::input")
private WebElement SequenceNo;
public WebElement SequenceNo()
{
	return SequenceNo;
}
@FindBy(xpath="//ion-label[contains(text(),'Sequence No')]//following-sibling::ion-input")
private WebElement SequenceNoText;
public WebElement SequenceNoText()
{
	return SequenceNoText;
}
@FindBy(xpath="//ion-label[contains(text(),'Date Format')]//following-sibling::ion-input//child::input")
private WebElement DateFormat;
public WebElement DateFormat()
{
	return DateFormat;
}
@FindBy(xpath="//ion-label[contains(text(),'Nullable Values')]//following-sibling::ion-input//child::input")
private WebElement NullableValues;
public WebElement NullableValues()
{
	return NullableValues;
}
@FindBy(xpath="(//button[@ng-reflect-text='Update'])[2]")
private WebElement updateIcon;
public WebElement updateIcon()
{
	return updateIcon;
}
//*******************************************************blankField****************************************
@FindBy(xpath="//ion-label[text()=' Parameter 1 ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
private WebElement parameter1RequiredField;
public WebElement parameter1RequiredField() {
	return parameter1RequiredField;
}
@FindBy(xpath="//ion-label[text()=' Template ']/ancestor::digital-select-layout//parent::ion-col//ion-badge")
private WebElement templateRequiredField;
public WebElement templateRequiredField() {
	return templateRequiredField;
}
@FindBy(xpath="//ion-label[text()=' Param 1 Description 1 ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
private WebElement param1description1RequiredField;
public WebElement param1description1RequiredField() {
	return param1description1RequiredField;
}
@FindBy(xpath="//ion-label[text()=' Param 1 Description 2 ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
private WebElement param1description2RequiredField;
public WebElement param1description2RequiredField() {
	return param1description2RequiredField;
}
@FindBy(xpath="//ion-label[text()=' Param 1 Description 3 ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
private WebElement param1description3RequiredField;
public WebElement param1description3RequiredField() {
	return param1description3RequiredField;
}
@FindBy(xpath="//ion-label[text()=' Parameter 2 ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
private WebElement parameter2RequiredField;
public WebElement parameter2RequiredField() {
	return parameter2RequiredField;
}
@FindBy(xpath="//ion-label[text()=' Param 2 Description 2 ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
private WebElement param2description2RequiredField;
public WebElement param2description2RequiredField() {
	return param2description2RequiredField;
}
@FindBy(xpath="//ion-label[text()=' Param 2 Description 3 ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
private WebElement param2description3RequiredField;
public WebElement param2description3RequiredField() {
	return param2description3RequiredField;
}

@FindBy(xpath="//ion-label[text()=' Sequence No ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
private WebElement sequenceNumberRequiredField;
public WebElement sequenceNumberRequiredField() {
	return sequenceNumberRequiredField;
}
@FindBy(xpath="//ion-label[text()=' Date Format ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
private WebElement dateFormatRequiredField;
public WebElement dateFormatRequiredField() {
	return dateFormatRequiredField;
}
@FindBy(xpath="//ion-label[text()=' Nullable Values ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
private WebElement nullableValuesRequiredField;
public WebElement nullableValuesRequiredField() {
	return nullableValuesRequiredField;
}
}
