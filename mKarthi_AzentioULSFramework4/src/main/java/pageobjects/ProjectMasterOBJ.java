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
	@FindBy(xpath="//ion-label[contains(text(),'Project Master')]//following-sibling::ion-buttons//child::ion-button[1]")
	private WebElement ProjectMasterEditIcon;
	public WebElement ProjectMasterEditIcon() 
	{
		return ProjectMasterEditIcon;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Edit']//child::span)[1]")
	private WebElement ActionEditIcon;
	public WebElement ActionEditIcon() 
	{
		return ActionEditIcon;
	}
	@FindBy(xpath="//ion-title[contains(text(),'Building Details')]//parent::ion-card-header//following-sibling::ion-card-content//button[@ng-reflect-text='Edit']")
	private WebElement BuildingDetailsActionEditIcon;
	public WebElement BuildingDetailsActionEditIcon() 
	{
		return BuildingDetailsActionEditIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Unit Type')]")
	private WebElement UnitTypeVerify;
	public WebElement UnitTypeVerify() 
	{
		return UnitTypeVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Building Name')]")
	private WebElement BuildingNameVerify;
	public WebElement BuildingNameVerify() 
	{
		return BuildingNameVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Building Type')]")
	private WebElement BuildingTypeVerify;
	public WebElement BuildingTypeVerify() 
	{
		return BuildingTypeVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Total Floors')]//following-sibling::ion-input/input")
	private WebElement TotalFloors;
	public WebElement TotalFloors() 
	{
		return TotalFloors;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Total Floors')]")
	private WebElement TotalFloorsVerify;
	public WebElement TotalFloorsVerify() 
	{
		return TotalFloorsVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Total Flats')]//following-sibling::ion-input/input")
	private WebElement TotalFlats;
	public WebElement TotalFlats() 
	{
		return TotalFlats;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Total Flats')]")
	private WebElement TotalFlatsVerify;
	public WebElement TotalFlatsVerify() 
	{
		return TotalFlatsVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Tentative Start Dates')]")
	private WebElement TentativeStartDatesVerify;
	public WebElement TentativeStartDatesVerify() 
	{
		return TentativeStartDatesVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Tentative End Dates')]")
	private WebElement TentativeEndDatesVerify;
	public WebElement TentativeEndDatesVerify() 
	{
		return TentativeEndDatesVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Disbursment Amount')]")
	private WebElement DisbursmentAmountVerify;
	public WebElement DisbursmentAmountVerify() 
	{
		return DisbursmentAmountVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Exposed No of Flats')]")
	private WebElement ExposedNoOfFlatsVerify;
	public WebElement ExposedNoOfFlatsVerify() 
	{
		return ExposedNoOfFlatsVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Verified By')]")
	private WebElement VerifiedByVerify;
	public WebElement VerifiedByVerify() 
	{
		return VerifiedByVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Stage of Completion')]")
	private WebElement StageOfCompletionVerify;
	public WebElement StageOfCompletionVerify() 
	{
		return StageOfCompletionVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Verified On')]")
	private WebElement VerifiedOnVerify;
	public WebElement VerifiedOnVerify() 
	{
		return VerifiedOnVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'CLP')]")
	private WebElement CLPVerify;
	public WebElement CLPVerify() 
	{
		return CLPVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Flexi')]")
	private WebElement FlexiVerify;
	public WebElement FlexiVerify() 
	{
		return FlexiVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Installment Linked')]")
	private WebElement InstallmentLinkedVerify;
	public WebElement InstallmentLinkedVerify() 
	{
		return InstallmentLinkedVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Down Payment Flag')]")
	private WebElement DownPaymentFlagVerify;
	public WebElement DownPaymentFlagVerify() 
	{
		return DownPaymentFlagVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Subvention Flag')]")
	private WebElement SubventionFlagVerify;
	public WebElement SubventionFlagVerify() 
	{
		return SubventionFlagVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'CF Flag')]")
	private WebElement CFFlagVerify;
	public WebElement CFFlagVerify() 
	{
		return CFFlagVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Negative Remarks')]")
	private WebElement NegativeRemarksVerify;
	public WebElement NegativeRemarksVerify() 
	{
		return NegativeRemarksVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Basic Sales Price')]")
	private WebElement BasicSalesPriceVerify;
	public WebElement BasicSalesPriceVerify() 
	{
		return BasicSalesPriceVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Exposure Unit')]")
	private WebElement ExposureUnitVerify;
	public WebElement ExposureUnitVerify() 
	{
		return ExposureUnitVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Overall % Recommendations')]")
	private WebElement OverallRecommendationsVerify;
	public WebElement OverallRecommendationsVerify() 
	{
		return OverallRecommendationsVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Construction Status')]")
	private WebElement ConstructionStatusVerify;
	public WebElement ConstructionStatusVerify() 
	{
		return ConstructionStatusVerify;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'RERA Registration')])[1]")
	private WebElement RERARegistrationVerify;
	public WebElement RERARegistrationVerify() 
	{
		return RERARegistrationVerify;
	}
	@FindBy(xpath="//ion-label[contains(text(),'RERA Registration No')]")
	private WebElement RERARegistrationNoVerify;
	public WebElement RERARegistrationNoVerify() 
	{
		return RERARegistrationNoVerify;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'Remarks')])[5]")
	private WebElement RemarksVerify;
	public WebElement RemarksVerify() 
	{
		return RemarksVerify;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'Status')])[3]")
	private WebElement StatusVerify;
	public WebElement StatusVerify() 
	{
		return StatusVerify;
	}
	@FindBy(xpath = "//button[@ng-reflect-text='Update']")
	private WebElement UpdateSave;

	public WebElement UpdateSave() {
		return UpdateSave;
	}
	@FindBy(xpath="//ion-title[contains(text(),'Unit Details')]//parent::ion-card-header//following-sibling::ion-card-content/kub-prime-table/p-table/div/div/div/div[3]/span/button")
	private WebElement UnitDetails_Search;

	public WebElement UnitDetails_Search() {
		return UnitDetails_Search;
	}


}