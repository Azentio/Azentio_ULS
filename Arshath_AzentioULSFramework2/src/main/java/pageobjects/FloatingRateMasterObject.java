package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingRateMasterObject {
	WebDriver driver;

	public FloatingRateMasterObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[text()='Floating rate master']//parent::ion-label//following-sibling::ion-buttons/ion-button[2]")
	private WebElement floatingMaster_EyeIcon1;

	public WebElement floatingMaster_EyeIcon() {
		return floatingMaster_EyeIcon1;
	}

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement floatingMaster_AddButton1;

	public WebElement floatingMaster_AddButton() {
		return floatingMaster_AddButton1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Index Rate Type *']")
	private WebElement floatingMaster_IndexRateTypeDropdown1;

	public WebElement floatingMaster_IndexRateTypeDropdown() {
		return floatingMaster_IndexRateTypeDropdown1;
	}

	@FindBy(xpath = "//ion-label[text()=' Index Rate ']//following-sibling::ion-input/input") 
	private WebElement floatingMaster_IndexRate1;

	public WebElement floatingMaster_IndexRate() {
		return floatingMaster_IndexRate1;
	}

	@FindBy(xpath = "//ion-col[3]/digital-prime-date[1]/div[1]/ion-item[1]/p-calendar[1]/span[1]/button[1]/span[1]")
	private WebElement floatingMaster_ValidFormCalendar1;

	public WebElement floatingMaster_ValidFormCalendar() {
		return floatingMaster_ValidFormCalendar1;
	}

	@FindBy(xpath = "//ion-textarea[1]/div[1]/textarea[1]")
	private WebElement floatingMaster_Remarks1;

	public WebElement floatingMaster_Remarks() {
		return floatingMaster_Remarks1;
	}

	@FindBy(xpath = "//span[text()='Today']")
	private WebElement floatingMaster_CalendarToday1;

	public WebElement floatingMaster_CalendarToday() {
		return floatingMaster_CalendarToday1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement floatingMaster_Save1;

	public WebElement floatingMaster_Save() {
		return floatingMaster_Save1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Update']")
	private WebElement floatingMaster_update1;

	public WebElement floatingMaster_update() {
		return floatingMaster_update1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]")
	private WebElement floatingMaster_PencilIcon1;

	public WebElement floatingMaster_PencilIcon() {
		return floatingMaster_PencilIcon1;
	}

	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	private WebElement floatingMaster_Submit1;

	public WebElement floatingMaster_Submit() {
		return floatingMaster_Submit1;
	}

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	private WebElement floatingMaster_CancelButton1;

	public WebElement floatingMaster_CancelButton() {
		return floatingMaster_CancelButton1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'ok')]")
	private WebElement floatingMaster_SubmitOKButton1;

	public WebElement floatingMaster_SubmitOKButton() {
		return floatingMaster_SubmitOKButton1;
	}

	@FindBy(xpath = "(//span[text()='Submit'])[2]")
	private WebElement floatingMaster_FinalSubmitButton1;

	public WebElement floatingMaster_FinalSubmitButton() {
		return floatingMaster_FinalSubmitButton1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'cancel')]")
	private WebElement floatingMaster_SubmitcanceButton1;

	public WebElement floatingMaster_SubmitcanceButton() {
		return floatingMaster_SubmitcanceButton1;
	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]/span[2]")
	private WebElement floatingMaster_FinalcanceButton1;

	public WebElement floatingMaster_FinalcanceButton() {
		return floatingMaster_FinalcanceButton1;
	}

	@FindBy(xpath = "//ion-label[text()=' Index Rate Type ']")
	private WebElement floatingMaster_IndexRateTypeField1;

	public WebElement floatingMaster_IndexRateTypeField() {
		return floatingMaster_IndexRateTypeField1;
	}

	@FindBy(xpath = "//div[@aria-label='Success']")
	private WebElement floatingMaster_Sucesspopup1;

	public WebElement floatingMaster_Sucesspopup() {
		return floatingMaster_Sucesspopup1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Update']")
	private WebElement floatingMaster_tempviewupdate1;

	public WebElement floatingMaster_tempviewupdate() {
		return floatingMaster_tempviewupdate1;
	}

	@FindBy(xpath = "//button[@class='p-datepicker-month p-link ng-tns-c237-631 ng-star-inserted']")
	private WebElement floatingMaster_CalendarMonth1;

	public WebElement floatingMaster_CalendarMonth() {
		return floatingMaster_CalendarMonth1;
	}

	@FindBy(xpath = "//button[starts-with(@class,'p-ripple p-element p-datepicker-next')]")
	private WebElement floatingMaster_MonthNextArrow1;

	public WebElement floatingMaster_MonthNextArrow() {
		return floatingMaster_MonthNextArrow1;
	}

	@FindBy(xpath = "//ion-label[text()=' Index Rate ']")
	private WebElement floatingMaster_IndexRateField1;

	public WebElement floatingMaster_IndexRateField() {
		return floatingMaster_IndexRateField1;
	}

	@FindBy(xpath = "//ion-label[text()=' Valid From ']")
	private WebElement floatingMaster_ValidFromField1;

	public WebElement floatingMaster_ValidFromField() {
		return floatingMaster_ValidFromField1;
	}

	@FindBy(xpath = "//ion-label[text()=' Remarks ']")
	private WebElement floatingMaster_RemarksField1;

	public WebElement floatingMaster_RemarksField() {
		return floatingMaster_RemarksField1;
	}

	@FindBy(xpath = "(//div[@role='alert'])[2]")
	private WebElement floatingMaster_SavePopUp1;

	public WebElement floatingMaster_SavePopUp() {
		return floatingMaster_SavePopUp1;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement floatingMaster_PopUp1;

	public WebElement floatingMaster_PopUp() {
		return floatingMaster_PopUp1;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement floatingMaster_PopUptoast1;

	public WebElement floatingMaster_PopUptoast() {
		return floatingMaster_PopUptoast1;

	}

	@FindBy(xpath = "//ion-label[text()='Status ']//parent::div//following-sibling::ion-item//child::ion-toggle")
	private WebElement floatingMaster_ActiveInactive1;

	public WebElement floatingMaster_ActiveInactive() {
		return floatingMaster_ActiveInactive1;
	}

	@FindBy(xpath = "(//span[text()='In-active']//ancestor::p-tag//ancestor::p-celleditor//ancestor::td//preceding-sibling::td//preceding-sibling::td//preceding-sibling::td//child::button)[1]")
	private WebElement floatingMaster_ActionIconOfactiverecord1;

	public WebElement floatingMaster_ActionIconOfactiverecord() {
		return floatingMaster_ActionIconOfactiverecord1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement floatingMaster_BackButton1;

	public WebElement floatingMaster_BackButton() {
		return floatingMaster_BackButton1;
	}

	@FindBy(xpath = "//ion-label[text()='Floating rate master']//parent::ion-label//following-sibling::ion-buttons/ion-button[1]")
	private WebElement floatingMaster_tempviewbuttonButton1;

	public WebElement floatingMaster_tempviewbuttonButton() {
		return floatingMaster_tempviewbuttonButton1;
	}

	@FindBy(xpath = "(//span[text()='Active']//ancestor::p-tag//ancestor::p-celleditor//ancestor::td//preceding-sibling::td//preceding-sibling::td//preceding-sibling::td//child::button)[1]")
	private WebElement floatingMaster_TempViewactiverecord1;

	public WebElement floatingMaster_TempViewactiverecord() {
		return floatingMaster_TempViewactiverecord1;
	}

	@FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement InboxIcon1;

	public WebElement InboxIcon() {
		return InboxIcon1;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement FloatingMaster_ListViewSearch1;

	public WebElement FloatingMaster_ListViewSearch() {
		return FloatingMaster_ListViewSearch1;
	}

	@FindBy(xpath = "//input[@mode='ios']")
	private WebElement FloatingMaster_ListViewSearchText1;

	public WebElement FloatingMaster_ListViewSearchText() {
		return FloatingMaster_ListViewSearchText1;
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
}
