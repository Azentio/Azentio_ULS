package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_UnderWriterOffSetControlObj {
	
	WebDriver driver;
	public ULS_UnderWriterOffSetControlObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-label[text()='Business Rules']")
	private WebElement uls_BusinessRulesMainModule;
	public WebElement ulsBusinessRulesMainModule()
	{
		return uls_BusinessRulesMainModule;
	}
	@FindBy(xpath="//ion-label[text()='UnderwriterOffsetControl']//following-sibling::ion-buttons//ion-button[2]")
	private WebElement underWriterOffSetControl_ViewButton;
	public WebElement underWriterOffSetControlViewButton()
	{
		return underWriterOffSetControl_ViewButton;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement underWriterOffSetControl_AddButton;
	public WebElement underWriterOffSetControlAddButton()
	{
		return underWriterOffSetControl_AddButton;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement underWriterOffSetControl_BackButton;
	public WebElement underWriterOffSetControlBackButton()
	{
		return underWriterOffSetControl_BackButton;
	}
	@FindBy(xpath="//span[contains(text(),' Action ')]")
	private WebElement underWriterOffSetControl_Action;
	public WebElement underWriterOffSetControlAction()
	{
		return underWriterOffSetControl_Action;
	}
	@FindBy(xpath="//ion-label[text()=' Minimum Value ']//following-sibling::ion-input//input")
	private WebElement underWriterOffSetControl_MinimumValueInputBox;
	public WebElement userWriterOffSetControlMinimumValueInputBox() {
		return underWriterOffSetControl_MinimumValueInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Minimum Value ']//following-sibling::ion-input")
	private WebElement underWriterOffSetControl_MinimumValueDataHolder;
	public WebElement userWriterOffSetControlMinimumValueDataHolder() {
		return underWriterOffSetControl_MinimumValueDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Minimum Value ']//span")
	private WebElement underWriterOffSetControl_MinimumValueMendatoryCheck;
	public WebElement UnderWriterOffSetControl_MinimumValueMendatoryCheck()
	{
		return underWriterOffSetControl_MinimumValueMendatoryCheck;
	}
	@FindBy(xpath="//ion-label[text()=' Maximum Value ']//span")
	private WebElement underWriterOffSetControl_MaximumValueMendatoryCheck;
	public WebElement UnderWriterOffSetControl_MaximumValueMendatoryCheck()
	{
		return underWriterOffSetControl_MaximumValueMendatoryCheck;
	}
	
	@FindBy(xpath="//ion-label[text()=' Maximum Value ']//following-sibling::ion-input//input")
	private WebElement underWriterOffSetControl_MaximumValueInputBox;
	public WebElement userWriterOffSetControlMaximumValueInputBox() {
		return underWriterOffSetControl_MaximumValueInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Maximum Value ']//following-sibling::ion-input")
	private WebElement underWriterOffSetControl_MaximumValueDataHolder;
	public WebElement underWriterOffSetControlMaximumValueDataHolder()
	{
		return underWriterOffSetControl_MaximumValueDataHolder;
		
	}
	@FindBy(xpath="//button[@ng-reflect-text='Update']")
	private WebElement underWriterOffSetControl_UpdateSaveButton;
	public WebElement underWriterOffSetControlUpdateSaveButton()
	{
		return underWriterOffSetControl_UpdateSaveButton;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Save']")
	private WebElement underWriterOffSetControl_SaveButton;
	public WebElement userWriterOffSetControlSaveButton() {
		return underWriterOffSetControl_SaveButton;
	}
	@FindBy(xpath = "//input[@mode='ios']")
	private WebElement underWriterOffSetControl_SearchTextBox;

	public WebElement underWriterOffSetControlSearchTextBox() {
		return underWriterOffSetControl_SearchTextBox;
	}

	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
	private WebElement underWriterOffSetControl_mailBox;

	public WebElement underWriterOffSetControlMailBox() {
		return underWriterOffSetControl_mailBox;
	}

	@FindBy(xpath = "(//button[@ng-reflect-icon='pi pi-search'])[2]")
	private WebElement underWriterOffSetControl_inboxSearch;

	public WebElement underWriterOffSetControlinboxSearch() {
		return underWriterOffSetControl_inboxSearch;
	}

	@FindBy(xpath = "//span[text()=' Inbox ']/parent::div//input")
	private WebElement underWriterOffSetControl_SearchTextBoxInbox;

	public WebElement underWriterOffSetControlSearchTextBoxInbox() {
		return underWriterOffSetControl_SearchTextBoxInbox;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement underWriterOffSetControl_firstRecord;

	public WebElement underWriterOffSetControlfirstRecord() {
		return underWriterOffSetControl_firstRecord;
	}
	@FindBy(xpath="//ion-button[@ng-reflect-text='Menu']")
	private WebElement underWriterOffSetControl_checkerMenuBar;
	public WebElement underWriterOffSetControlCheckerMenuBar()
	{
		return underWriterOffSetControl_checkerMenuBar;
	}
	@FindBy(xpath = "//app-inbox[1]//p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement underWriterOffSetControl_referenceID;

	public WebElement underWriterOffSetControlreferenceID() {
		return underWriterOffSetControl_referenceID;
	}

	@FindBy(xpath = "//span[text()='Submit']/parent::button")
	private WebElement underWriterOffSetControl_SubmitButton;

	public WebElement underWriterOffSetControlSubmitButton() {
		return underWriterOffSetControl_SubmitButton;
	}

	@FindBy(xpath = "//textarea")
	private WebElement underWriterOffSetControl_alertRemark;

	public WebElement underWriterOffSetControlalertRemark() {
		return underWriterOffSetControl_alertRemark;
	}

	@FindBy(xpath = "(//button[@label='Submit'])[2]")
	private WebElement underWriterOffSetControl_alertSubmitButton;

	public WebElement underWriterOffSetControlaleralertSubmitButton() {
		return underWriterOffSetControl_alertSubmitButton;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement underWriterOffSetControl_submitToastAlert;

	public WebElement underWriterOffSetControlsubmitToastAlert() {
		return underWriterOffSetControl_submitToastAlert;
	}

	@FindBy(xpath = "//div[@id='toast-container']//button")
	private WebElement underWriterOffSetControl_ToastAlertClose;

	public WebElement underWriterOffSetControlToastAlertClose() {
		return underWriterOffSetControl_ToastAlertClose;
	}
	@FindBy(xpath="//span[text()='Approve']/parent::button")
	private WebElement checker_ApproveButton;
	public WebElement checkerApproveButton()
	{
		return checker_ApproveButton;
	}
	@FindBy(xpath="//span[text()='Reject']/parent::button")
	private WebElement checker_RejectButton;
	public WebElement checkerRejectButton()
	{
		return checker_RejectButton;
	}
	@FindBy(xpath="//span[text()='Return']/parent::button")
	private WebElement checker_ReturnButton;
	public WebElement checkerReturnButton()
	{
		return checker_ReturnButton;
	}
	@FindBy(xpath="//ion-label[text()=' Please Enter Remarks ']//parent::ion-item//ion-textarea//textarea")
	private WebElement checker_alertRemark;
	public WebElement checkerAlertRemark()
	{
		return checker_alertRemark;
	}
	@FindBy(xpath="//div[@role='alert']")
	private WebElement checker_submitConfirmationPopUp;
	public WebElement checkerConfirmationPopUp()
	{
		return checker_submitConfirmationPopUp;
	}
	@FindBy(xpath="(//span[text()='Approve']/parent::button)[2]")
	private WebElement checkerUser_AlertApprove;
	public WebElement checkerAlertApprove()
	{
		return checkerUser_AlertApprove;
	}
	@FindBy(xpath="(//span[text()='Reject']/parent::button)[2]")
	private WebElement checker_AlertRejectButton;
	public WebElement checkerAlertRejectButton()
	{
		return checker_AlertRejectButton;
	}
	@FindBy(xpath="(//span[text()='Return']/parent::button)[2]")
	private WebElement checker_AlertReturnButton;
	public WebElement checkerAlertReturnButton()
	{
		return checker_AlertReturnButton;
	}
	@FindBy(xpath="//ion-toast[starts-with(@id,'ion-overlay-')]")
	private WebElement underWriterOffSetControl_MendatoryAlert;
	public WebElement underWriterOffSetControlMendatoryAlert()
	{
		return underWriterOffSetControl_MendatoryAlert;
	}
	@FindBy(xpath="//ion-label[text()=' Minimum Value ']/ancestor::digital-text-box/parent::ion-col//digital-form-error//ion-badge")
	private WebElement underWriterOffSetControl_MinimumValueValidationMessage;
	public WebElement underWriterOffSetControlMinimumValueValidationMessage()
	{
		return underWriterOffSetControl_MinimumValueValidationMessage;
	}
	@FindBy(xpath="//ion-label[text()=' Maximum Value ']/ancestor::digital-text-box/parent::ion-col//digital-form-error//ion-badge")
	private WebElement underWriterOffSetControl_MaximumValueValidationMessage;
	public WebElement underWriterOffSetControlMaximumValueValidationMessage()
	{
		return underWriterOffSetControl_MaximumValueValidationMessage;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement underWriterOffSetControl_ListViewFirstRecord;
	public WebElement underWriterOffSetControlListViewFirstRecord()
	{
		return underWriterOffSetControl_ListViewFirstRecord;
	}
}
