package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_AllocationMasterObj {
	WebDriver driver;
	public ULS_AllocationMasterObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//ion-label[text()='Allocation Master']//parent::ion-item//following-sibling::ion-buttons//ion-button[1]")
	private WebElement uls_AllocationMasterTempView;
	public WebElement ulsAllocationMasterTempView()
	{
		return uls_AllocationMasterTempView;
	}
	@FindBy(xpath="//tr[1]//td[1]//button[@ng-reflect-icon='pi pi-pencil']")
	private WebElement uls_AllocationMasterTempViewFirstRecord;
	public WebElement ulsAllocationMasterTempViewFirstRecord()
	{
		return uls_AllocationMasterTempViewFirstRecord;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement allocationMaster_BackButton;
	public WebElement allocationMasterBackButton()
	{
		return allocationMaster_BackButton;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement allocationMaster_SaveButton;
	public WebElement allocationMatserSaveButton()
	{
		return allocationMaster_SaveButton;
	}
	@FindBy(xpath="//ion-toggle")
	private WebElement allocationMaster_StatusField;
	public WebElement allocationMasterStatusField()
	{
		return allocationMaster_StatusField;
	}
	@FindBy(xpath="//ion-label[text()=' Discription ']//following-sibling::ion-input")
	private WebElement allocationMaster_DescriptionDataHolder;
	public WebElement allocationMasterDescriptionDataHolder()
	{
		return allocationMaster_DescriptionDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' Discription ']//following-sibling::ion-input//input")
	private WebElement allocationMaster_DescriptionInputBox;
	public WebElement allocationMasterDescriptionInputBox()
	{
		return allocationMaster_DescriptionInputBox;
	}
	@FindBy(xpath="//ion-label[text()=' Allocation Code ']//following-sibling::ion-input")
	private WebElement allocationMaster_AllocationCodeDataHolder;
	public WebElement allocationMasterAllocationCodeDataHolder()
	{
		return allocationMaster_AllocationCodeDataHolder;
	}

	@FindBy(xpath="//ion-label[text()=' Allocation Code ']//following-sibling::ion-input//input")
	private WebElement allocationMaster_AllocationCodeInputBox;
	public WebElement allocationMasterAllocationCodeInputBox()
	{
		return allocationMaster_AllocationCodeInputBox;
	}
	@FindBy(xpath="//tr[1]/td[text()=' ALLOCATION_MST ']//preceding-sibling::td[2]//button")
	private WebElement allocationMaster_NotificationFirstRecord;
	public WebElement allocationMasterNotificationFirstRecord()
	{
		return allocationMaster_NotificationFirstRecord;
	}
	@FindBy(xpath="//tr[1]/td[text()=' ALLOCATION_MST ']//preceding-sibling::td[1]//span")
	private WebElement allocationMaster_FirstRecordReferenceNumber;
	public WebElement allocationMasterFirstRecordReferernceNumber()
	{
		return allocationMaster_FirstRecordReferenceNumber;
	}
	@FindBy(xpath="//ion-label[text()=' Discription ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement allocationMaster_DescriptionFieldvalidation;
	public WebElement allocationMasterDescriptionFieldValidation()
	{
		return allocationMaster_DescriptionFieldvalidation;
	}
	@FindBy(xpath="//ion-label[text()=' Allocation Code ']//ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement allocationMaster_AllocationCodeFieldvalidation;
	public WebElement allocationMasterAllocationCodeFieldvalidation()
	{
		return allocationMaster_AllocationCodeFieldvalidation;
	}
	@FindBy(xpath="//ion-label[text()='Allocation Master']//parent::ion-item//ion-buttons//ion-button[2]")
	private WebElement allocationMaster_ViewButton;
	public WebElement allocationMasterViewButton()
	{
		return allocationMaster_ViewButton;
	}
	@FindBy(xpath="//tr[1]//td[1]//button[@ng-reflect-text='Edit']")
	private WebElement allocationMaster_ListVistviewEditIcon;
	public WebElement allocationMasterListViewEditIcon()
	{
		return allocationMaster_ListVistviewEditIcon;
	}
	@FindBy(xpath="//span[text()='Export']")
	private WebElement allocationMaster_BackButttonVerification;
	public WebElement allocationMasterBackButtonVerification()
	{
		return allocationMaster_BackButttonVerification;
	}
	
}
