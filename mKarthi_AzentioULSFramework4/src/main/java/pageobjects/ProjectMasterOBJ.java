package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class ProjectMasterOBJ {
	WebDriver driver;

	public ProjectMasterOBJ(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-button[@ng-reflect-text='Menu']")
	private WebElement menuChecker;

	public WebElement menuChecker() {
		return menuChecker;
	}

	@FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']//child::ion-icon")
	private WebElement inboxiconChecker;
	public WebElement inboxiconChecker() 
	{
		return inboxiconChecker;
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

	@FindBy(xpath = "//ion-textarea[1]/div[1]/textarea[1]")
	private WebElement popupremark;

	public WebElement popupremark() {
		return popupremark;
	}

	@FindBy(xpath = "(//button[@ng-reflect-label='Submit'])[2]")
	private WebElement popupsubmit;

	public WebElement popupsubmit() {
		return popupsubmit;
	}

	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	private WebElement CheckerApprove;

	public WebElement CheckerApprove() {
		return CheckerApprove;
	}

	@FindBy(xpath = "(//span[contains(text(),'Approve')])[2]")
	private WebElement popupapprove;

	public WebElement popupapprove() {
		return popupapprove;
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

	@FindBy(xpath = "//div[contains(text(),' Record ')]")
	private WebElement recordMsgChecker;
	public WebElement recordMsgChecker() 
	{
		return recordMsgChecker;
	}

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement addIcon;
	public WebElement addIcon() 
	{
		return addIcon;
	}
	@FindBy(xpath="//h4[contains(text(),'Project Setup')]")
	private WebElement projectsetup;
	public WebElement projectsetup() 
	{
		return projectsetup;
	}
	@FindBy(xpath="(//ion-button[@ng-reflect-tooltip-position='bottom'])[1]")
	private WebElement projectmakertempedit;
	public WebElement projectmakertempedit() 
	{
		return projectmakertempedit;
	}
	@FindBy(xpath="//span[contains(text(),'Export')]")
	private WebElement exportIcon;
	public WebElement exportIcon() 
	{
		return exportIcon;
	}
	@FindBy(xpath="//span[contains(text(),'PDF')]")
	private WebElement pdfOption;
	public WebElement pdfOption() 
	{
		return pdfOption;
	}
	@FindBy(xpath="//span[contains(text(),'XLS')]")
	private WebElement xlsOption;
	public WebElement xlsOption() 
	{
		return xlsOption;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement GoBack;
	public WebElement GoBack() 
	{
		return GoBack;
	}
	@FindBy(xpath="//ion-item[@ng-reflect-text='Inbox']")
	private WebElement InboxIcon;
	public WebElement InboxIcon() 
	{
		return InboxIcon;
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
	@FindBy(xpath="(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement inboxactionicon;
	public WebElement inboxactionicon() 
	{
		return inboxactionicon;
	}
	@FindBy(xpath="//button[@ng-reflect-text='View Summary']//child::span")
	private WebElement viewsummary;
	public WebElement viewsummary() 
	{
		return viewsummary;
	}
	@FindBy(xpath="(//ion-button[@ng-reflect-color='danger'])[1]")
	private WebElement viewclose;
	public WebElement viewclose() 
	{
		return viewclose;
	}
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-pencil'])[1]")
	private WebElement actioneditmaker;
	public WebElement actioneditmaker() 
	{
		return actioneditmaker;
	}
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-plus'])[2]")
	private WebElement buildingaddbutton;
	public WebElement buildingaddbutton() 
	{
		return buildingaddbutton;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Update']")
	private WebElement recordupdatesave;
	public WebElement recordupdatesave() 
	{
		return recordupdatesave;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Save']")
	private WebElement newrecordsave;
	public WebElement newrecordsave() 
	{
		return newrecordsave;
	}
	@FindBy(xpath="(//ion-button[@ng-reflect-text='View'])[1]")
	private WebElement projectmastereyeicon;
	public WebElement projectmastereyeicon() 
	{
		return projectmastereyeicon;
	}
	
	@FindBy(xpath="//span[text()=' Inbox ']//parent::div//child::span[2]/input")
	private WebElement searchsentkeys;
	public WebElement searchsentkeys() 
	{
		return searchsentkeys;
	}
	@FindBy(xpath="//ion-label[contains(text(),' RERA Registration No ')]//following-sibling::ion-input/input")
	private WebElement RegNo;
	public WebElement RegNo() 
	{
		return RegNo;
	}
	@FindBy(xpath="//ion-label[contains(text(),' RERA Registration No ')]//following-sibling::ion-input")
	private WebElement RegNoinput;
	public WebElement RegNoinput() 
	{
		return RegNoinput;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Building Name ')]//following-sibling::ion-input/input")
	private WebElement BuildingName;
	public WebElement BuildingName() 
	{
		return BuildingName;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Building Name ')]//following-sibling::ion-input")
	private WebElement BuildingNameinput;
	public WebElement BuildingNameinput() 
	{
		return BuildingNameinput;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Verified By ')]//following-sibling::ion-input/input")
	private WebElement VerifiedBy;
	public WebElement VerifiedBy() 
	{
		return VerifiedBy;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Verified By ')]//following-sibling::ion-input")
	private WebElement VerifiedByinput;
	public WebElement VerifiedByinput() 
	{
		return VerifiedByinput;
	}
	

}