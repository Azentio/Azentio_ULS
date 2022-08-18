package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_LoModuleWaiverObj {
	WebDriver driver;

	public ULS_LoModuleWaiverObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[text()='LO Module Waiver']/parent::ion-item//ion-buttons//ion-button[2]")
	private WebElement loModuleWaiver_ViewButton;

	public WebElement loModuleWaiverViewButton() {
		return loModuleWaiver_ViewButton;
	}

	@FindBy(xpath = "//ion-label[text()='LO Module Waiver']/parent::ion-item//ion-buttons//ion-button[1]")
	private WebElement loModuleWaiver_TempViewButton;

	public WebElement loModuleWaiverTempViewButton() {
		return loModuleWaiver_TempViewButton;
	}

	@FindBy(xpath = "//span[text()='Configurations']")
	private WebElement ULS_Configuration;

	public WebElement ULSConfiguration() {
		return ULS_Configuration;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Waiver Type *']")
	private WebElement loModuleWaiver_WaiverType;

	public WebElement loMoudleWaiverWaiverType() {
		return loModuleWaiver_WaiverType;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Document Category ']")
	private WebElement loModuleWaiver_DocumentCategory;

	public WebElement loMoudleWaiverDocumentCategory() {
		return loModuleWaiver_DocumentCategory;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Document Type ']")
	private WebElement loModuleWaiver_DocumentType;

	public WebElement loMoudleWaiverDocumentType() {
		return loModuleWaiver_DocumentType;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Waiving Authority ']")
	private WebElement loModuleWaiver_WaivingAutority;

	public WebElement loMoudleWaiverWaivingAutority() {
		return loModuleWaiver_WaivingAutority;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Verification Type ']")
	private WebElement loModuleWaiver_VerificationType;

	public WebElement loMoudleWaiverVerificationType() {
		return loModuleWaiver_VerificationType;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  PD Type ']")
	private WebElement loModuleWaiver_PoType;
	public WebElement loModuleWaiverPoType()
	{
		return loModuleWaiver_PoType;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Valuation Type ']")
	private WebElement loModuleWaiver_ValuationType;
	public WebElement loModuleWaiverValuationType()
	{
		return loModuleWaiver_ValuationType;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement loModuleWaiver_SaveButton;
	public WebElement loModuleWaiverSaveButton()
	{
		return loModuleWaiver_SaveButton;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement loModuleWaiver_BackButton;
	public WebElement loModuleWaiverBackButton()
	{
		return loModuleWaiver_BackButton;
	}
	@FindBy(xpath = "//app-inbox[1]//p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement LoModuleWaiver_referenceID;

	public WebElement LoModuleWaiverreferenceID() {
		return LoModuleWaiver_referenceID;
	}

	@FindBy(xpath = "//span[text()='Submit']/parent::button")
	private WebElement LoModuleWaiver_SubmitButton;

	public WebElement LoModuleWaiverSubmitButton() {
		return LoModuleWaiver_SubmitButton;
	}

	@FindBy(xpath = "//textarea")
	private WebElement LoModuleWaiver_alertRemark;

	public WebElement LoModuleWaiveralertRemark() {
		return LoModuleWaiver_alertRemark;
	}

	@FindBy(xpath = "(//button[@label='Submit'])[2]")
	private WebElement LoModuleWaiver_alertSubmitButton;

	public WebElement LoModuleWaiveraleralertSubmitButton() {
		return LoModuleWaiver_alertSubmitButton;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement LoModuleWaiver_submitToastAlert;

	public WebElement LoModuleWaiversubmitToastAlert() {
		return LoModuleWaiver_submitToastAlert;
	}

	@FindBy(xpath = "//div[@id='toast-container']//button")
	private WebElement LoModuleWaiver_ToastAlertClose;

	public WebElement LoModuleWaiverToastAlertClose() {
		return LoModuleWaiver_ToastAlertClose;
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

}
