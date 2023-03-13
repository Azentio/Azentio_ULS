package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_LivingExpenseParameterObj {
	WebDriver driver;
	public ULS_LivingExpenseParameterObj(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-label[text()='Other Masters']")
	private WebElement uls_OtherMasterMainModule;
	public WebElement ulsOtherMasterMainMenu()
	{
		return uls_OtherMasterMainModule;
	}
	@FindBy(xpath="//ion-label[text()='Living Expense']//parent::ion-item//following-sibling::ion-buttons//ion-button[2]")
	private WebElement uls_LivingExpenseViewButton;
	public WebElement ulsLivingExpenseViewButton()
	{
		return uls_LivingExpenseViewButton;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement livingExpese_firstApprovedRecord;
	public WebElement livingExpenseFirstApprovedRecord()
	{
		return livingExpese_firstApprovedRecord;
	}
	@FindBy(xpath="//ion-label[text()='Living Expense Parameter']//parent::ion-segment-button")
	private WebElement livingExpense_ParameterTab;
	public WebElement livingExpenseParameterTab()
	{
		return livingExpense_ParameterTab;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement livingExpeseParameter_firstApprovedRecord;
	public WebElement livingExpeseParameterFirstApprovedRecord()
	{
		return livingExpeseParameter_firstApprovedRecord;
	}
	@FindBy(xpath="//ion-label[text()=' Description ']//following-sibling::ion-textarea//textarea")
	private WebElement livingExpesneParameter_Description;
	public WebElement livingExpesneParameterDescription()
	{
		return livingExpesneParameter_Description;
	}
	@FindBy(xpath="//ion-label[text()=' Description ']//following-sibling::ion-textarea")
	private WebElement livingExpesneParameter_DescriptionDataHolder;
	public WebElement livingExpesneParameterDescriptionDataHolder()
	{
		return livingExpesneParameter_DescriptionDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Code ']//following-sibling::ion-select")
	private WebElement livingExpesneParameter_CodeDropDown;
	public WebElement livingExpesneParameterCodeDropDown()
	{
		return livingExpesneParameter_CodeDropDown;
	}
	@FindBy(xpath="//ion-label[text()=' Value ']//following-sibling::ion-input//input")
	private WebElement livingExpesneParameter_ValueInputBox;
	public WebElement livingExpesneParameterValueInputBox()
	{
		return livingExpesneParameter_ValueInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Value ']//following-sibling::ion-input")
	private WebElement livingExpesneParameter_ValueInputBoxdataHolder;
	public WebElement livingExpesneParameterValueInputBoxdataHolder()
	{
		return livingExpesneParameter_ValueInputBoxdataHolder;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Update']")
	private WebElement livingExpense_UpdateSave;
	public WebElement livingExpenseUpdateSave()
	{
		return livingExpense_UpdateSave;
	}
	@FindBy(xpath="//ion-label[text()=' Description ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement livingExpenseParameter_DescriptionValidation;
	public WebElement livingExpenseParameterDescriptionValidation()
	{
		return livingExpenseParameter_DescriptionValidation;
	}
	@FindBy(xpath="//ion-label[text()=' Value ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement livingExpenseParameter_ValueValidation;
	public WebElement livingExpenseParameterValueValidation()
	{
		return livingExpenseParameter_ValueValidation;
	}
	@FindBy(xpath="//ion-label[text()=\" Code \"]//ancestor::digital-select-layout/parent::ion-col//ion-badge")
	private WebElement livingExpenseParameter_CodeDropDownValidation;
	public WebElement livingExpenseParameterCodeDropDownValidation()
	{
		return livingExpenseParameter_CodeDropDownValidation;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement livingExpenseParameter_BackButton;
	public WebElement livingExpenseParameterBackButton()
	{
		return livingExpenseParameter_BackButton;
	}
	@FindBy(xpath="//ion-title[text()=' Living Expense Parameter List ']")
	private WebElement livingExpense_ParameterList;
	public WebElement livingExpenseParameterList()
	{
		return livingExpense_ParameterList;
	}
	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
	private WebElement livingExpense_mailBox;

	public WebElement livingExpenseMailBox() {
		return livingExpense_mailBox;
	}
	@FindBy(xpath = "//app-inbox[1]//p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement livingExpense_referenceID;

	public WebElement livingExpensereferenceID() {
		return livingExpense_referenceID;
	}

	@FindBy(xpath = "//span[text()='Submit']/parent::button")
	private WebElement livingExpense_SubmitButton;

	public WebElement livingExpenseSubmitButton() {
		return livingExpense_SubmitButton;
	}

	@FindBy(xpath = "//textarea")
	private WebElement livingExpense_alertRemark;

	public WebElement livingExpensealertRemark() {
		return livingExpense_alertRemark;
	}

	@FindBy(xpath = "(//button[@label='Submit'])[2]")
	private WebElement livingExpense_alertSubmitButton;

	public WebElement livingExpensealeralertSubmitButton() {
		return livingExpense_alertSubmitButton;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement livingExpense_submitToastAlert;

	public WebElement livingExpensesubmitToastAlert() {
		return livingExpense_submitToastAlert;
	}

	@FindBy(xpath = "//div[@id='toast-container']//button")
	private WebElement livingExpense_ToastAlertClose;

	public WebElement livingExpenseToastAlertClose() {
		return livingExpense_ToastAlertClose;
	}
	@FindBy(xpath = "(//button[@ng-reflect-icon='pi pi-search'])[2]")
	private WebElement livingExpense_inboxSearch;

	public WebElement livingExpenseinboxSearch() {
		return livingExpense_inboxSearch;
	}

	@FindBy(xpath = "//span[text()=' Inbox ']/parent::div//input")
	private WebElement livingExpense_SearchTextBoxInbox;

	public WebElement livingExpenseSearchTextBoxInbox() {
		return livingExpense_SearchTextBoxInbox;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement livingExpense_firstRecord;

	public WebElement livingExpensefirstRecord() {
		return livingExpense_firstRecord;
	}
}
