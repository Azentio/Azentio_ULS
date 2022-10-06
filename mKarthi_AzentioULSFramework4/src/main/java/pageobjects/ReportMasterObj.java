package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class ReportMasterObj {
	WebDriver driver;

	public ReportMasterObj(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-label[contains(text(),'Config Manager')]")
	private WebElement ConfigManager;
	public WebElement ConfigManager()
	{
		return ConfigManager;
	}
	@FindBy(xpath="//ion-label[text()='Report Master']//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement ReportMasterEditIcon;
	public WebElement ReportMasterEditIcon()
	{
		return ReportMasterEditIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Report Master')]//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement ReportMasterListViewIcon;
	public WebElement ReportMasterListViewIcon()
	{
		return ReportMasterListViewIcon; 
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Add'])[2]")
	private WebElement ReportParameterAddIcon;
	public WebElement ReportParameterAddIcon()
	{
		return ReportParameterAddIcon;
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
	@FindBy(xpath="(//button[@ng-reflect-text='Save'])[2]")
	private WebElement NewSave;
	public WebElement NewSave()
	{
		return NewSave;
	}
	@FindBy(xpath="(//div[@role='alert'])[2]")
	private WebElement makerconfirmmsg;
	public WebElement makerconfirmmsg() 
	{
		return makerconfirmmsg;
	}
	@FindBy(xpath="//button[@aria-label='Close']//following-sibling::div[contains(text(),'Success')]")
	private WebElement makerconfirmmsg1;
	public WebElement makerconfirmmsg1() 
	{
		return makerconfirmmsg1;
	}
	@FindBy(xpath="//span[text()='×']")
	private WebElement successcancel;
	public WebElement successcancel() 
	{
		return successcancel;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea")
	private WebElement popupremark;
	public WebElement popupremark() 
	{
		return popupremark;
	}
	@FindBy(xpath="(//button[@ng-reflect-label='Cancel'])[2]")
	private WebElement popupcancel;
	public WebElement popupcancel() 
	{
		return popupcancel;
	}
	@FindBy(xpath="(//kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/p-celleditor[1]/span)[2]")
	private WebElement ReferenceId;
	public WebElement ReferenceId() 
	{
		return ReferenceId;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIcon;
	public WebElement searchIcon() 
	{
		return searchIcon;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement productViewSearchText;
	public WebElement productViewSearchText() 
	{
		return productViewSearchText;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement BackArrow;
	public WebElement BackArrow()
	{
		return BackArrow;
	}
	@FindBy(xpath="//ion-icon[@aria-label='mail unread outline']")
	private WebElement mailicon;
	public WebElement mailicon() 
	{
		return mailicon;
	}
	@FindBy(xpath="//button/span[contains(text(),'Submit')]")
	private WebElement submit;
	public WebElement submit() 
	{
		return submit;
	}
	@FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
	private WebElement popupsubmit;
	public WebElement popupsubmit() 
	{
		return popupsubmit;
	}
	@FindBy(xpath="//div[@id='toast-container']/div[1]")
	private WebElement ProductCheckerid;
	public WebElement ProductCheckerid() 
	{
		return ProductCheckerid;
	}
	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
	private WebElement inboxiconChecker;
	public WebElement inboxiconChecker() 
	{
		return inboxiconChecker;
	}
	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	private WebElement CheckerApprove;
	public WebElement CheckerApprove()
	{
		return CheckerApprove;
	}
	@FindBy(xpath = "(//span[contains(text(),'Approve')])[2]")
	private WebElement popupapprove;
	public WebElement popupapprove() 
	{
		return popupapprove;
	}
	@FindBy(xpath = "//div[contains(text(),' Record ')]")
	private WebElement recordMsgChecker;
	public WebElement recordMsgChecker() 
	{
		return recordMsgChecker;
	}
	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	private WebElement CheckerReject;
	public WebElement CheckerReject() 
	{
		return CheckerReject;
	}
	@FindBy(xpath = "(//span[contains(text(),'Reject')])[2]")
	private WebElement popupreject;
	public WebElement popupreject() 
	{
		return popupreject;
	}
	@FindBy(xpath = "//span[contains(text(),'Return')]")
	private WebElement CheckerReturn;
	public WebElement CheckerReturn()
	{
		return CheckerReturn;
	}
	@FindBy(xpath = "(//span[contains(text(),'Return')])[2]")
	private WebElement popupReturn;
	public WebElement popupReturn() 
	{
		return popupReturn;
	}
	@FindBy(xpath="//span[text()=' Inbox ']//parent::div//child::span[2]/input")
	private WebElement searchsentkeys;
	public WebElement searchsentkeys() 
	{
		return searchsentkeys;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement AddIcon;
	public WebElement AddIcon() 
	{
		return AddIcon;
	}
	@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement referenceid;
	public WebElement referenceid() 
	{
		return referenceid;
	}
	@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement searchiconreferenceid;
	public WebElement searchiconreferenceid() 
	{
		return searchiconreferenceid;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement inboxediticon;
	public WebElement inboxediticon() 
	{
		return inboxediticon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Report Group Master')]")
	private WebElement ReportGroupMaster;
	public WebElement ReportGroupMaster() 
	{
		return ReportGroupMaster;
	}
	
	// angle
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-up'])[1]")
    private WebElement AvailableAngleup;
	public WebElement AvailableAngleup()
	{
		return AvailableAngleup;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-up'])[2]")
    private WebElement SelectedAngleup;
	public WebElement SelectedAngleup()
	{
		return SelectedAngleup;
	}
	
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-up'])[1]")
    private WebElement AvailableDoubleAngleup;
	public WebElement AvailableDoubleAngleup()
	{
		return AvailableDoubleAngleup;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-up'])[2]")
    private WebElement SelectedDoubleAngleup;
	public WebElement SelectedDoubleAngleup()
	{
		return SelectedDoubleAngleup;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-down'])[1]")
    private WebElement AvailableAngledown;
	public WebElement AvailableAngledown()
	{
		return AvailableAngledown;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-down'])[2]")
    private WebElement SelectedAngledown;
	public WebElement SelectedAngledown()
	{
		return SelectedAngledown;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-down'])[1]")
    private WebElement AvailableDoubleAngledown;
	public WebElement AvailableDoubleAngledown()
	{
		return AvailableDoubleAngledown;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-angle-double-down'])[2]")
    private WebElement SelectedDoubleAngledown;
	public WebElement SelectedDoubleAngledown()
	{
		return SelectedDoubleAngledown;
	}
	@FindBy(xpath="//span[@class='p-button-icon pi pi-angle-right']")
	private WebElement AngleRight;
    public WebElement AngleRight()
	{
		return AngleRight;
	}
    @FindBy(xpath="//span[@class='p-button-icon pi pi-angle-left']")
	private WebElement AngleLeft;
    public WebElement AngleLeft()
	{
		return AngleLeft;
	}
    @FindBy(xpath="//span[@class='p-button-icon pi pi-angle-double-right']")
	private WebElement AngleDoubleRight;
    public WebElement AngleDoubleRight()
	{
		return AngleDoubleRight;
	}
    @FindBy(xpath="//span[@class='p-button-icon pi pi-angle-double-left']")
   	private WebElement AngleDoubleLeft;
    public WebElement AngleDoubleLeft()
   	{
   		return AngleDoubleLeft;
   	}
	@FindBy(xpath="//div[contains(text(),'GST')]")
    private WebElement GST;
	public WebElement GST()
	{
		return GST;
	}
	@FindBy(xpath="//div[contains(text(),'TDS')]")
    private WebElement TDS;
	public WebElement TDS()
	{
		return TDS;
	}
	@FindBy(xpath="//div[contains(text(),'VAT')]")
    private WebElement VAT;
	public WebElement VAT()
	{
		return VAT;
	}
	@FindBy(xpath="//div[contains(text(),'Service Tax')]")
    private WebElement ServiceTax;
	public WebElement ServiceTax()
	{
		return ServiceTax;
	}
	
	


}
