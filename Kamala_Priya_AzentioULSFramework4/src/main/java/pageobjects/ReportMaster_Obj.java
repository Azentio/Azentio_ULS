package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportMaster_Obj {
	WebDriver driver;
public ReportMaster_Obj(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[text()='Configurations']//following-sibling::ion-icon")
private WebElement configurationOptions;
public WebElement configurationOptions() {
	return configurationOptions;
}
@FindBy(xpath="//button[@ng-reflect-text='Add']")
private WebElement addIcon;
public WebElement addIcon() {
	return addIcon;
}
@FindBy(xpath="//ion-label[text()='Config Manager']//following-sibling::ion-icon")
private WebElement configManager;
public WebElement configManager() {
	return configManager;
}
@FindBy(xpath="//ion-label[text()='Report Master']//following-sibling::ion-buttons//child::ion-button[1]")
private WebElement reportMasterEditIcon;
public WebElement reportMasterEditIcon() {
	return reportMasterEditIcon;
}
@FindBy(xpath="//ion-label[text()='Report Master']//following-sibling::ion-buttons//child::ion-button[2]")
private WebElement reportMasterViewIcon;
public WebElement reportMasterViewIcon() {
	return reportMasterViewIcon;
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
@FindBy(xpath="//ion-select[@aria-label='Select,  Report Type *']")
private WebElement reportType;
public WebElement reportType() {
	return reportType;
}
@FindBy(xpath="//ion-label[text()=' Report Url  ']/following-sibling::ion-textarea//textarea")
private WebElement reportUrl;
public WebElement reportUrl() {
	return reportUrl;
}
@FindBy(xpath="//ion-select[@aria-label='Select,  Report Category *']")
private WebElement reportCategoey;
public WebElement reportCategory() {
	return reportCategoey;
}
@FindBy(xpath = "//button[@ng-reflect-text='Save']") 
private WebElement Report_Master_Save;
public WebElement Report_Master_Save() {
    return Report_Master_Save;
}
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
public WebElement parameter_ListViewSearch(){
	 return parameter_ListViewSearch1;
}
@FindBy(xpath = "//input[@mode='ios']")   
private WebElement parameter_ListViewSearchText1;
public WebElement parameter_ListViewSearchText(){
	 return parameter_ListViewSearchText1;
} 
@FindBy(xpath="(//span[text()='Export'])[2]")
	private WebElement exportIcon;
	public WebElement exportIcon() {
		return exportIcon;
	}	
	@FindBy(xpath="//li[@aria-label='PDF']")
	private WebElement exportToPDF;
	public WebElement exportToPDF() {
		return exportToPDF;
	}	
	@FindBy(xpath="//li[@aria-label='XLS']")
	private WebElement exportToExcel;
	public WebElement exportToExcel() {
		return exportToExcel;
}
	 @FindBy(xpath = "(//tbody/tr[1]/td[4]/p-celleditor[1]/span[1])[2]")   
	 private WebElement parameter_ListViewMachedData1;
	 public WebElement parameter_ListViewMachedData(){
		 return parameter_ListViewMachedData1;
	 }


@FindBy(xpath="//ion-icon[@ng-reflect-name='mail-unread-outline']")
private WebElement Report_Inbox1;
public WebElement Report_Inbox(){
	 return Report_Inbox1;
}
@FindBy(xpath="(//button[@ng-reflect-text='Search'])[2]")
private WebElement ReportMaster_SeachButton1;
public WebElement ReportMaster_SeachButton(){
	 return ReportMaster_SeachButton1;
}
@FindBy(xpath="//ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
private WebElement ReportMaster_SearchText1;
public WebElement ReportMaster_SearchText(){
	 return ReportMaster_SearchText1;
}
@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
private WebElement ReportMaster_GetRefId1;
public WebElement ReportMaster_GetRefId(){
	 return ReportMaster_GetRefId1;
}
@FindBy(xpath="(//button[@ng-reflect-text='Entitle'])[1]")
private WebElement ReportMaster_ActionIcon1;
public WebElement ReportMaster_ActionIcon(){
	 return ReportMaster_ActionIcon1;
}
@FindBy(xpath="//span[contains(text(),'Submit')]")
private WebElement ReportMaster_SubmitButton1;
public WebElement ReportMaster_SubmitButton(){
	 return ReportMaster_SubmitButton1;
}
@FindBy(xpath="//ion-label[contains(text(),'ok')]")
private WebElement ReportMaster_SubmitOKButton1;
public WebElement ReportMaster_SubmitOKButton(){
	 return ReportMaster_SubmitOKButton1;
}
@FindBy(xpath="//ion-row[2]/ion-col[1]/span[1]/button[1]")
private WebElement ReportMaster_FinalSubmitButton1;
public WebElement ReportMaster_FinalSubmitButton(){
	 return ReportMaster_FinalSubmitButton1;
}
//@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
@FindBy(xpath="//div[@id='toast-container']//div[contains(text(),'Record APPROVED Successfully')]")
private WebElement ReportMaster_CheckerId1;
public WebElement ReportMaster_CheckerId(){
	 return ReportMaster_CheckerId1;
}
@FindBy(xpath="//div[@id='toast-container']//div[contains(text(),'Record RETURNED')]")
private WebElement ReportMaster_ReturnPopUp1;
public WebElement ReportMaster_ReturnPopUp(){
	 return ReportMaster_ReturnPopUp1;
}
@FindBy(xpath="//div[@id='toast-container']//div[contains(text(),'Record REJECTED Successfully')]")
private WebElement ReportMaster_RejectPopUp1;
public WebElement ReportMaster_RejectPopUp(){
	 return ReportMaster_RejectPopUp1;
}

@FindBy(xpath = "//ion-icon[@aria-label='menu']")
private WebElement DepositAccount_Menu1;
public WebElement DepositAccount_Menu(){
	 return DepositAccount_Menu1;
}
@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")  //ion-icon[@aria-label='mail unread outline']
private WebElement ReportMaster_CheckerInbox1;
public WebElement ReportMaster_CheckerInbox(){
	 return ReportMaster_CheckerInbox1;
}
@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
private WebElement ReportMaster_CheckerApproveButton1;
public WebElement ReportMaster_CheckerApproveButton(){
	 return ReportMaster_CheckerApproveButton1;
}
@FindBy(xpath = "//ion-label[contains(text(),'approve')]")
private WebElement ReportMaster_CheckerAlertApprove1;
public WebElement ReportMaster_CheckerAlertApprove(){
	 return ReportMaster_CheckerAlertApprove1;
}
@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
private WebElement ReportMaster_CheckerFinalApprove1;
public WebElement ReportMaster_CheckerFinalApprove(){
	 return ReportMaster_CheckerFinalApprove1;
}
@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
private WebElement ReportMaster_CheckerRejectButton1;
public WebElement ReportMaster_CheckerRejectButton(){
	 return ReportMaster_CheckerRejectButton1;
}
@FindBy(xpath = "//ion-label[contains(text(),'cancel')]") 
private WebElement ReportMaster_CheckerAlertReject1;
public WebElement ReportMaster_CheckerAlertReject(){
	 return ReportMaster_CheckerAlertReject1;
}
@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")  
private WebElement ReportMaster_CheckerFinalReject1;
public WebElement ReportMaster_CheckerFinalReject(){
	 return ReportMaster_CheckerFinalReject1;
}


   @FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]") 
private WebElement ReportMaster_CheckerReturnButton1;
public WebElement ReportMaster_CheckerReturnButton(){
	 return ReportMaster_CheckerReturnButton1;
}
@FindBy(xpath = "//ion-label[contains(text(),'return')]") 
private WebElement ReportMaster_CheckerAlertReturn1;
public WebElement ReportMaster_CheckerAlertReturn(){
	 return ReportMaster_CheckerAlertReturn1;
}
@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")   
private WebElement ReportMaster_CheckerFinalReturn1;
public WebElement ReportMaster_CheckerFinalReturn1(){
	 return ReportMaster_CheckerFinalReturn1;
}
}