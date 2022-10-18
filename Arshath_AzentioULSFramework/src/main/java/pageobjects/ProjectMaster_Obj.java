package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectMaster_Obj {

	WebDriver driver;

	public ProjectMaster_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Project Setup')]")
	private WebElement ProjectSetup;

	public WebElement ProjectSetup() {
		return ProjectSetup;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Project Master')]/parent::ion-item[1]//ion-buttons[1]/ion-button[2]")
	private WebElement Prd_Mst_Eye;

	public WebElement Prd_Mst_Eye() {
		return Prd_Mst_Eye;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Project Master')]/parent::ion-item[1]//ion-buttons[1]/ion-button[1]")
	private WebElement Prd_Mst_Edit;

	public WebElement Prd_Mst_Edit() {
		return Prd_Mst_Edit;
	}

	@FindBy(xpath = "(//span[contains(text(),'Active')]//ancestor::tr/td//button[2]/span)[1]")
	private WebElement Prd_Mst_Listview_Eye;

	public WebElement Prd_Mst_Listview_Eye() {
		return Prd_Mst_Listview_Eye;
	}

	@FindBy(xpath = "(//span[contains(text(),'Active')]//ancestor::tr/td//button/span)[1]")
	private WebElement Prd_Mst_Tempview_Edit;

	public WebElement Prd_Mst_Tempview_Edit() {
		return Prd_Mst_Tempview_Edit;
	}

	@FindBy(xpath = "//ion-title[contains(text(),'Unit Details')]//ancestor::ion-card//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement Prd_Mst_Unitdetail_Add;

	public WebElement Prd_Mst_Unitdetail_Add() {
		return Prd_Mst_Unitdetail_Add;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Building Name')]")
	private WebElement Prd_Mst_Unitdetail_Label_BuildingName;

	public WebElement Prd_Mst_Unitdetail_Label_BuildingName() {
		return Prd_Mst_Unitdetail_Label_BuildingName;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Unit No')]")
	private WebElement Prd_Mst_Unitdetail_Label_UnitNo;

	public WebElement Prd_Mst_Unitdetail_Label_UnitNo() {
		return Prd_Mst_Unitdetail_Label_UnitNo;
	}

	@FindBy(xpath = "(//ion-label[contains(text(),' Floor ')])[2]")
	private WebElement Prd_Mst_Unitdetail_Label_Floor;

	public WebElement Prd_Mst_Unitdetail_Label_Floor() {
		return Prd_Mst_Unitdetail_Label_Floor;
	}

	@FindBy(xpath = "//ion-label[contains(text(),' Saleable Area (sq. ft) ')]")
	private WebElement Prd_Mst_Unitdetail_Label_Saleable;

	public WebElement Prd_Mst_Unitdetail_Label_Saleable() {
		return Prd_Mst_Unitdetail_Label_Saleable;
	}

	@FindBy(xpath = "//ion-label[contains(text(),' Exposed Appl No ')]")
	private WebElement Prd_Mst_Unitdetail_Label_Exposed;

	public WebElement Prd_Mst_Unitdetail_Label_Exposed() {
		return Prd_Mst_Unitdetail_Label_Exposed;
	}

	@FindBy(xpath = "//ion-col[7]/digital-radio-button[1]/ion-item[1]/ion-toggle[1]")
	private WebElement Prd_Mst_Unitdetail_Active_Deactive;

	public WebElement Prd_Mst_Unitdetail_Active_Deactive() {
		return Prd_Mst_Unitdetail_Active_Deactive;
	}

	@FindBy(xpath = "//ion-label[contains(text(),' Building Name ')]/parent::ion-item/ion-input/input")
	private WebElement Prd_Mst_Unitdetail_BuildingName;

	public WebElement Prd_Mst_Unitdetail_BuildingName() {
		return Prd_Mst_Unitdetail_BuildingName;
	}

	@FindBy(xpath = "//ion-label[contains(text(),' Unit No ')]/parent::ion-item/ion-input/input")
	private WebElement Prd_Mst_Unitdetail_UnitNo;

	public WebElement Prd_Mst_Unitdetail_UnitNo() {
		return Prd_Mst_Unitdetail_UnitNo;
	}

	@FindBy(xpath = "//ion-label[text()=' Floor ']/parent::ion-item/ion-input/input[1]")
	private WebElement Prd_Mst_Unitdetail_Floor;

	public WebElement Prd_Mst_Unitdetail_Floor() {
		return Prd_Mst_Unitdetail_Floor;
	}

	@FindBy(xpath = "//ion-label[text()=' Saleable Area (sq. ft) ']/parent::ion-item/ion-input/input[1]")
	private WebElement Prd_Mst_Unitdetail_Saleablearea;

	public WebElement Prd_Mst_Unitdetail_Saleablearea() {
		return Prd_Mst_Unitdetail_Saleablearea;
	}

	@FindBy(xpath = "//ion-label[text()=' Exposed Appl No ']/parent::ion-item/ion-input/input[1]")
	private WebElement Prd_Mst_Unitdetail_ExposedApplNo;

	public WebElement Prd_Mst_Unitdetail_ExposedApplNo() {
		return Prd_Mst_Unitdetail_ExposedApplNo;
	}

	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement Prd_Mst_Unitdetail_Save;

	public WebElement Prd_Mst_Unitdetail_Save() {
		return Prd_Mst_Unitdetail_Save;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Go Back'])[2]")
	private WebElement Prd_Mst_Unitdetail_Back;

	public WebElement Prd_Mst_Unitdetail_Back() {
		return Prd_Mst_Unitdetail_Back;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Search'])[4]")
	private WebElement Prd_Mst_Unitdetail_Search;

	public WebElement Prd_Mst_Unitdetail_Search() {
		return Prd_Mst_Unitdetail_Search;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement SaveSuccess_alert;

	public WebElement SaveSuccess_alert() {
		return SaveSuccess_alert;
	}

	@FindBy(xpath = "(//p-dropdown[1]//div[2])[6]")
	private WebElement Unitdetails_Export;

	public WebElement Unitdetails_Export() {
		return Unitdetails_Export;
	}
}
