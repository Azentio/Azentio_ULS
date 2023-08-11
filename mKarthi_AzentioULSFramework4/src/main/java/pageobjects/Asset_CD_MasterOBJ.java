package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class Asset_CD_MasterOBJ {
	
	WebDriver driver;

	public Asset_CD_MasterOBJ(WebDriver driver) {
		this.driver = BaseClass.driver;
		PageFactory.initElements(driver, this);
       
	}
	@FindBy(xpath="//ion-label[contains(text(),' Model ')]//following-sibling::ion-input/input")
	private WebElement asset_model;
	public WebElement asset_model()
	{
		return asset_model;
	}
	@FindBy(xpath="//ion-col[5]/digital-text-box[1]/ion-item[1]/ion-input[1]")
	private WebElement asset_model1;
	public WebElement asset_model1()
	{
		return asset_model;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Year Of Manufacture ')]//following-sibling::ion-input/input")
	private WebElement asset_yearofmanufacture;
	public WebElement asset_yearofmanufacture()
	{
		return asset_yearofmanufacture;
	}
	@FindBy(xpath="//textarea[@name='ion-textarea-1']")
	private WebElement asset_Remark;
	public WebElement asset_Remark()
	{
		return asset_Remark;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Product Setup')]")
	private WebElement productsetup;
	public WebElement productsetup()
	{
		return productsetup;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Asset CD Master')]//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement productsetupediticon;
	public WebElement productsetupediticon()
	{
		return productsetupediticon;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement Asset_Addicon;
	public WebElement Asset_Addicon()
	{
		return Asset_Addicon;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Save']")
	private WebElement Asset_NewSave;
	public WebElement Asset_NewSave()
	{
		return Asset_NewSave;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement Asset_BackArrow;
	public WebElement Asset_BackArrow()
	{
		return Asset_BackArrow;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Asset Category ')]")
	private WebElement Asset_categorytext;
	public WebElement Asset_categorytext()
	{
		return Asset_categorytext;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Asset Type ')]")
	private WebElement Asset_Typetext;
	public WebElement Asset_Typetext()
	{
		return Asset_Typetext;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Manufacturer ')]")
	private WebElement Asset_Manufacturertext;
	public WebElement Asset_Manufacturertext()
	{
		return Asset_Manufacturertext;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Model ')]")
	private WebElement Asset_Modeltext;
	public WebElement Asset_Modeltext()
	{
		return Asset_Modeltext;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Year Of Manufacture ')]")
	private WebElement Asset_YearOfManufacturetext;
	public WebElement Asset_YearOfManufacturetext()
	{
		return Asset_YearOfManufacturetext;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Country ')]")
	private WebElement Asset_Countrytext;
	public WebElement Asset_Countrytext()
	{
		return Asset_Countrytext;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Remarks ')]")
	private WebElement Asset_Remarkstext;
	public WebElement Asset_Remarkstext()
	{
		return Asset_Remarkstext;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Asset Category *']")
	private WebElement Asset_categoryinput;
	public WebElement Asset_categoryinput()
	{
		return Asset_categoryinput;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Asset Type *']")
	private WebElement Asset_Typeinput;
	public WebElement Asset_Typeinput()
	{
		return Asset_Typeinput;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Manufacturer *']")
	private WebElement Asset_Manufacturerinput;
	public WebElement Asset_Manufacturerinput()
	{
		return Asset_Manufacturerinput;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Country *']")
	private WebElement Asset_Countryinput;
	public WebElement Asset_Countryinput()
	{
		return Asset_Countryinput;
	}
	@FindBy(xpath="(//div[@role='alert'])[2]")
	private WebElement makerconfirmmsg;
	public WebElement makerconfirmmsg() 
	{
		return makerconfirmmsg;
	}
	@FindBy(xpath="//span[text()='×']")
	private WebElement successcancel;
	public WebElement successcancel() 
	{
		return successcancel;
	}
	@FindBy(xpath="//ion-header/ion-toolbar[1]/section[1]/ion-list[1]/ion-item[2]/div[1]/div[1]/ion-icon[1]")
	private WebElement mailicon;
	public WebElement mailicon() 
	{
		return mailicon;
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
	@FindBy(xpath="//button[@ng-reflect-text='View Summary']")
	private WebElement View_Summary;
	public WebElement View_Summary() 
	{
		return View_Summary;
	}
	@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	private WebElement referenceid;
	public WebElement referenceid() 
	{
		return referenceid;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Entitle'])[1]")
	private WebElement inboxediticon;
	public WebElement inboxediticon() 
	{
		return inboxediticon;
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
	@FindBy(xpath="//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea")
	private WebElement popupremark;
	public WebElement popupremark() 
	{
		return popupremark;
	}
	@FindBy(xpath="//div[@id='toast-container']/div[1]")
	private WebElement ProductCheckerid;
	public WebElement ProductCheckerid() 
	{
		return ProductCheckerid;
	}
	@FindBy(xpath = "//ion-button[@ng-reflect-text='Menu']")
	private WebElement menuChecker;
	public WebElement menuChecker()
	{
		return menuChecker;
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
	@FindBy(xpath="//ion-label[contains(text(),'Asset CD Master')]//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement assetcdmastereyeicon;
	public WebElement assetcdmastereyeicon() 
	{
		return assetcdmastereyeicon;
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
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-search']")
	private WebElement searchIcon;
	public WebElement searchIcon() 
	{
		return searchIcon;
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
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-pencil'])[1]")
	private WebElement listviewpencil;
	public WebElement listviewpencil() 
	{
		return listviewpencil;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Edit']//child::span)[1]")
	private WebElement listviewpencil1;
	public WebElement listviewpencil1() 
	{
		return listviewpencil1;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Asset Category ')]//following-sibling::ion-select")
	private WebElement assetcategoryupdate;
	public WebElement assetcategoryupdate() 
	{
		return assetcategoryupdate;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Update']")
	private WebElement Asset_UpdateSave;
	public WebElement Asset_UpdateSave()
	{
		return Asset_UpdateSave;
	}
	@FindBy(xpath="//ion-toggle[@role='switch']")
	private WebElement Activeanddeactive;
	public WebElement Activeanddeactive()
	{
		return Activeanddeactive;
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
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement productViewSearchText;
	public WebElement productViewSearchText() 
	{
		return productViewSearchText;
	}
	@FindBy(xpath="//span[contains(text(),'XLS')]")
	private WebElement xlsOption;
	public WebElement xlsOption() 
	{
		return xlsOption;
	}
	///  Logout  //////////
	
	
	@FindBy(xpath="//ion-item[@ng-reflect-text='Profile']")
	private WebElement Profile_Logout;
	public WebElement Profile_Logout() 
	{
		return Profile_Logout;
	}
	
	@FindBy(xpath="//span[contains(text(),'Logout')]")
	private WebElement Logout;
	public WebElement Logout() 
	{
		return Logout;
	}

	
}
