package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class Appropriation_MasterObj {
	
	WebDriver driver;

	public Appropriation_MasterObj(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
       
	}
	@FindBy(xpath="//ion-label[contains(text(),'Config Manager')]")
	private WebElement ConfigManager;
	public WebElement ConfigManager()
	{
		return ConfigManager;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Appropriation master')]//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement appropriationEditIcon;
	public WebElement appropriationEditIcon()
	{
		return appropriationEditIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Appropriation master')]//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement appropriationEyeIcon;
	public WebElement appropriationEyeIcon()
	{
		return appropriationEyeIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement Addicon;
	public WebElement Addicon()
	{
		return Addicon;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Add'])[2]")
	private WebElement ListAddicon;
	public WebElement ListAddicon()
	{
		return ListAddicon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Description')]//following-sibling::ion-input//child::input")
	private WebElement Description;
	public WebElement Description()
	{
		return Description;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Appropriation Type')]//following-sibling::ion-select")
	private WebElement AppropriationType;
	public WebElement AppropriationType()
	{
		return AppropriationType;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Remarks ')]//following-sibling::ion-textarea//child::textarea")
	private WebElement AppropriationRemarks;
	public WebElement AppropriationRemarks()
	{
		return AppropriationRemarks;
	}
	@FindBy(xpath="(//ion-label[contains(text(),' Remarks ')]//following-sibling::ion-textarea//child::textarea)[2]")
	private WebElement AppropriationRemarks1;
	public WebElement AppropriationRemarks1()
	{
		return AppropriationRemarks1;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Save']")
	private WebElement Appropriation_NewSave;
	public WebElement Appropriation_NewSave()
	{
		return Appropriation_NewSave;
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
	@FindBy(xpath="(//button[@ng-reflect-text='Edit']//child::span)[1]")
	private WebElement listviewpencil;
	public WebElement listviewpencil() 
	{
		return listviewpencil;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Due Type')]//following-sibling::ion-select")
	private WebElement DueType;
	public WebElement DueType() 
	{
		return DueType;
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
	@FindBy(xpath="(//ion-label[contains(text(),'Sequence No')]//following-sibling::ion-input//child::input)[1]")
	private WebElement SequenceNo;
	public WebElement SequenceNo() 
	{
		return SequenceNo;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Parent Sequence No')]//following-sibling::ion-input//child::input")
	private WebElement ParentSequenceNo;
	public WebElement ParentSequenceNo() 
	{
		return ParentSequenceNo;
	}
	@FindBy(xpath="//span[text()='×']")
	private WebElement successcancel;
	public WebElement successcancel() 
	{
		return successcancel;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Status')]//parent::div//following-sibling::ion-item//child::ion-toggle")
	private WebElement StatusDeactivation;
	public WebElement StatusDeactivation() 
	{
		return StatusDeactivation;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement Asset_BackArrow;
	public WebElement Asset_BackArrow()
	{
		return Asset_BackArrow;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Update']")
	private WebElement UpdateSave;
	public WebElement UpdateSave() 
	{
		return UpdateSave;
	}
	@FindBy(xpath="//span[contains(text(),'Cancel')]")
	private WebElement Cancel;
	public WebElement Cancel() 
	{
		return Cancel;
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
	@FindBy(xpath="//span[@ng-reflect-ng-class='pi pi-chevron-down']")
	private WebElement exportIcon;
	public WebElement exportIcon() {
		return exportIcon;
	} 
	@FindBy(xpath = "//input[@mode='ios']") 
    private WebElement assetAutoViewSearchText;
    public WebElement assetAutoViewSearchText() {
        return assetAutoViewSearchText;
    } 
	@FindBy(xpath="//p-dropdownitem[@ng-reflect-label='PDF']//child::span")
	private WebElement pdfOption;
	public WebElement pdfOption() {
		return pdfOption;
	}
	@FindBy(xpath="//p-dropdownitem[@ng-reflect-label='XLS']//child::span")
	private WebElement xlsOption;
	public WebElement xlsOption() {
		return xlsOption;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement productViewSearchText;
	public WebElement productViewSearchText() 
	{
		return productViewSearchText;
	}
	@FindBy(xpath="//ion-badge[contains(text(),'Required field')]")
	private WebElement RequiredField;
	public WebElement RequiredField() 
	{
		return RequiredField;
	}
	@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement searchiconreferenceid;
	public WebElement searchiconreferenceid() 
	{
		return searchiconreferenceid;
	}
	@FindBy(xpath="//span[text()=' Inbox ']//parent::div//child::span[2]/input")
	private WebElement searchsentkeys;
	public WebElement searchsentkeys() 
	{
		return searchsentkeys;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement inboxediticon;
	public WebElement inboxediticon() 
	{
		return inboxediticon;
	}
	@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement referenceid;
	public WebElement referenceid() 
	{
		return referenceid;
	}
	

	@FindBy(xpath="//ion-icon[@aria-label='mail unread outline']")
	private WebElement mailicon;
	public WebElement mailicon() 
	{
		return mailicon;
	}
	@FindBy(xpath="//span[contains(text(),'Submit')]")
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
	

}
