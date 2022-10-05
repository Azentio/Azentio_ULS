package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllocationMasterObject {
	WebDriver driver;

	public AllocationMasterObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ion-label[text()=' Discription ']")
	private WebElement AllocationMaster_DescriptionTitle1;

	public WebElement AllocationMaster_DescriptionTitle() {
		return AllocationMaster_DescriptionTitle1;
	}

	@FindBy(xpath = "//ion-label[text()=' Allocation Code ']")
	private WebElement AllocationMaster_AllocationCodeTitle1;

	public WebElement AllocationMaster_AllocationCodeTitle() {
		return AllocationMaster_AllocationCodeTitle1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement AllocationMaster_SaveButton1;

	public WebElement AllocationMaster_SaveButton() {
		return AllocationMaster_SaveButton1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement AllocationMaster_BackButton1;

	public WebElement AllocationMaster_BackButton() {
		return AllocationMaster_BackButton1;
	}

	@FindBy(xpath = "//ion-label[text()=' Discription ']//following-sibling::ion-input/input")
	private WebElement AllocationMaster_DiscriptionTextBox1;

	public WebElement AllocationMaster_DiscriptionTextBox() {
		return AllocationMaster_DiscriptionTextBox1;
	}

	@FindBy(xpath = "//ion-label[text()=' Allocation Code ']//following-sibling::ion-input/input")
	private WebElement AllocationMaster_AllocationCodeTextBox1;

	public WebElement AllocationMaster_AllocationCodeTextBox() {
		return AllocationMaster_AllocationCodeTextBox1;
	}

	@FindBy(xpath = "//span[text()='Configurations']")
	private WebElement AllocationMaster_Configuration1;

	public WebElement AllocationMaster_Configuration() {
		return AllocationMaster_Configuration1;
	}

	@FindBy(xpath = "//ion-label[text()='Allocation Master']//parent::ion-item//following-sibling::ion-buttons/ion-button[2]")
	private WebElement AllocationMaster_EyeIcon1;

	public WebElement AllocationMaster_EyeIcon() {
		return AllocationMaster_EyeIcon1;
	}

	@FindBy(xpath = "//ion-label[text()='Allocation Master']//parent::ion-item//following-sibling::ion-buttons/ion-button[1]")
	private WebElement AllocationMaster_TempViewButton1;

	public WebElement AllocationMaster_TempViewButton() {
		return AllocationMaster_TempViewButton1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement AllocationMaster_AddButton1;

	public WebElement AllocationMaster_AddButton() {
		return AllocationMaster_AddButton1;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement AllocationMaster_PopUp1;

	public WebElement AllocationMaster_PopUp() {
		return AllocationMaster_PopUp1;
	}

	// ****************Checker Stage*****************************//
	@FindBy(xpath = "//ion-icon[@aria-label='menu']")
	private WebElement AllocationMaster_Menu1;

	public WebElement AllocationMaster_Menu() {
		return AllocationMaster_Menu1;
	}

	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") // ion-icon[@aria-label='mail unread outline']
	private WebElement AllocationMaster_CheckerInbox1;

	public WebElement AllocationMaster_CheckerInbox() {
		return AllocationMaster_CheckerInbox1;
	}

	@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
	private WebElement AllocationMaster_CheckerApproveButton1;

	public WebElement AllocationMaster_CheckerApproveButton() {
		return AllocationMaster_CheckerApproveButton1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'approve')]")
	private WebElement AllocationMaster_CheckerAlertApprove1;

	public WebElement AllocationMaster_CheckerAlertApprove() {
		return AllocationMaster_CheckerAlertApprove1;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")
	private WebElement AllocationMaster_CheckerFinalApprove1;

	public WebElement AllocationMaster_CheckerFinalApprove() {
		return AllocationMaster_CheckerFinalApprove1;
	}

	@FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
	private WebElement AllocationMaster_CheckerRejectButton1;

	public WebElement AllocationMaster_CheckerRejectButton() {
		return AllocationMaster_CheckerRejectButton1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'cancel')]")
	private WebElement AllocationMaster_CheckerAlertReject1;

	public WebElement AllocationMaster_CheckerAlertReject() {
		return AllocationMaster_CheckerAlertReject1;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")
	private WebElement AllocationMaster_CheckerFinalReject1;

	public WebElement AllocationMaster_CheckerFinalReject() {
		return AllocationMaster_CheckerFinalReject1;
	}

	@FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]")
	private WebElement AllocationMaster_CheckerReturnButton1;

	public WebElement AllocationMaster_CheckerReturnButton() {
		return AllocationMaster_CheckerReturnButton1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'return')]")
	private WebElement AllocationMaster_CheckerAlertReturn1;

	public WebElement AllocationMaster_CheckerAlertReturn() {
		return AllocationMaster_CheckerAlertReturn1;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")
	private WebElement AllocationMaster_CheckerFinalReturn1;

	public WebElement AllocationMaster_CheckerFinalReturn() {
		return AllocationMaster_CheckerFinalReturn1;
	}

	@FindBy(xpath = "//ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement AllocationMaster_SearchText1;

	public WebElement AllocationMaster_SearchText() {
		return AllocationMaster_SearchText1;
	}

	@FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input")
	private WebElement AllocationMaster_CheckerSearchText1;

	public WebElement AllocationMaster_CheckerSearchText() {
		return AllocationMaster_CheckerSearchText1;
	}

	@FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement AllocationMaster_GetRefId1;

	public WebElement AllocationMaster_GetRefId() {
		return AllocationMaster_GetRefId1;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement AllocationMaster_CheckerId1;

	public WebElement AllocationMaster_CheckerId() {
		return AllocationMaster_CheckerId1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement AllocationMaster_PencilButton1;

	public WebElement AllocationMaster_PencilButton() {
		return AllocationMaster_PencilButton1;
	}

	@FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement AllocationMaster_Inbox1;

	public WebElement AllocationMaster_Inbox() {
		return AllocationMaster_Inbox1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Search'])[2]")
	private WebElement AllocationMaster_SeachButton1;

	public WebElement AllocationMaster_SeachButton() {
		return AllocationMaster_SeachButton1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement AllocationMaster_CheckerSeachButton1;

	public WebElement AllocationMaster_CheckerSeachButton() {
		return AllocationMaster_CheckerSeachButton1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement AllocationMaster_ActionIcon1;

	public WebElement AllocationMaster_ActionIcon() {
		return AllocationMaster_ActionIcon1;
	}

	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	private WebElement AllocationMaster_SubmitButton1;

	public WebElement AllocationMaster_SubmitButton() {
		return AllocationMaster_SubmitButton1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'ok')]")
	private WebElement AllocationMaster_SubmitOKButton1;

	public WebElement AllocationMaster_SubmitOKButton() {
		return AllocationMaster_SubmitOKButton1;
	}

	@FindBy(xpath = "(//span[text()='Submit'])[2]")
	private WebElement AllocationMaster_FinalSubmitButton1;

	public WebElement AllocationMaster_FinalSubmitButton() {
		return AllocationMaster_FinalSubmitButton1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement AllocationMaster_ListViewSearch1;

	public WebElement AllocationMaster_ListViewSearch() {
		return AllocationMaster_ListViewSearch1;
	}

	@FindBy(xpath = "//input[@mode='ios']")
	private WebElement AllocationMaster_ListViewSearchText1;

	public WebElement AllocationMaster_ListViewSearchText() {
		return AllocationMaster_ListViewSearchText1;
	}

	@FindBy(xpath = "//span[text()='Export']/following-sibling::div/span")
	private WebElement exportIcon;

	public WebElement exportIcon() {
		return exportIcon;
	}

	@FindBy(xpath = "//li[@aria-label='PDF']")
	private WebElement exportToPDF;

	public WebElement exportToPDF() {
		return exportToPDF;
	}

	@FindBy(xpath = "//li[@aria-label='XLS']/span")
	private WebElement exportToExcel;

	public WebElement exportToExcel() {
		return exportToExcel;
	}

	// ***********ALLOCATION MASTER************//
	@FindBy(xpath = "(//button[@ng-reflect-text='Add'])[2]")
	private WebElement allocationDetail_AddButton1;

	public WebElement allocationDetail_AddButton() {
		return allocationDetail_AddButton1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Allocation Based On *']")
	private WebElement allocationDetail_AllocationBasedOn_Dropdown1;

	public WebElement allocationDetail_AllocationBasedOn_Dropdown() {
		return allocationDetail_AllocationBasedOn_Dropdown1;
	}

	@FindBy(xpath = "//ion-label[text()=' Level No ']//following-sibling::ion-input/input")
	private WebElement allocationDetail_LevelNo1;

	public WebElement allocationDetail_LevelNo() {

		return allocationDetail_LevelNo1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Order By *']")
	private WebElement allocationDetail_OrderBy_Dropdown1;

	public WebElement allocationDetail_OrderBy_Dropdown() {
		return allocationDetail_OrderBy_Dropdown1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement allocationDetail_SaveButton1;

	public WebElement allocationDetail_SaveButton() {
		return allocationDetail_SaveButton1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='View'])[1]")
	private WebElement ListView_FirstEyeIcon1;

	public WebElement ListView_FirstEyeIcon() {
		return ListView_FirstEyeIcon1;
	}
}
