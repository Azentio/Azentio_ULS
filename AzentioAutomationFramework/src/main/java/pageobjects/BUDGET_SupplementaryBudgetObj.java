package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BUDGET_SupplementaryBudgetObj {
	WebDriver driver;

	public BUDGET_SupplementaryBudgetObj(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//---------------------------------Maker------------------------------------------------//
	
	//Select existing budget code
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement txtfield_bgtcode;
	public WebElement bgtCode()
	{
		return txtfield_bgtcode;
	}
	
	//Select budget year
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement bgtyear;
	public WebElement bdtYear()
	{
		return bgtyear;
	}
	
	//Select branch name
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement bgtbranch;
	public WebElement bgtBranch()
	{
		return bgtbranch;
	}
	
	//to verify existing amount will show when valid branch selected.
	@FindBy(xpath="//input[@id='2021-2022']")
	private WebElement existingamt;
	public WebElement existingAmt()
	{
		return existingamt;
	}
	
	//currency dropdown
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-supplementary-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[1]/ion-col[10]/app-kub-lov[1]/span[1]/ng-select[1]/div[1]/span[1]")
	private WebElement currencydropdown;
	
	//Select Currency
	@FindBy(xpath="(//input[@type='text'])[9]")
	private WebElement currency;
	public WebElement Currency()
	{
		return currency;
	}
	
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-supplementary-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[2]/ion-col[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement comments;
	public WebElement Comments()
	{
		return comments;
	}
	
	//Enter supplymentary_apportion_amt
	@FindBy(xpath="//input[@class='datatable ng-valid ng-dirty ng-touched']")
	private WebElement supplementary_apportion_amt;
	public WebElement supplementaryApportionAmt()
	{
		return supplementary_apportion_amt;
	}
	
	//Click on new amt
	@FindBy(xpath="//input[@class='datatable ng-pristine ng-valid ng-touched']")
	private WebElement newamt;
	public WebElement newAmt()
	{
		return newamt;
	}
	
	//Save supplymentary budget
	@FindBy(xpath="//ion-button[@class='ion-color ion-color-primary md button button-clear in-toolbar ion-activatable ion-focusable hydrated']")
	private WebElement supplybgtsave;
	public WebElement Save()
	{
		return supplybgtsave;
	}
	
	//Supplymentary Budget action edit
	@FindBy(xpath="//body[1]/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/app-data-grid[1]/ion-content[1]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[1]/div[1]/ion-buttons[1]/ion-button[1]")
	private WebElement supplybgtedit;
	public WebElement supplementaryBudgetEdit()
	{
		return supplybgtedit;
	}
	
	//Submit
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	private WebElement submitbtn;
	public WebElement submitButton()
	{
		return submitbtn;
	}
	
	//Remark field
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-modal[1]/div[2]/app-remarks[1]/ion-content[1]/ion-infinite-scroll[1]/ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement remarkfield;
	public WebElement remarkField()
	{
		return remarkfield;
	}
	
	//Submit by maker
	@FindBy(xpath="//ion-button[contains(text(),'Submit')]")
	private WebElement submitbymaker;
	public WebElement submitByMaker()
	{
		return submitbymaker;
	}
	
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-menu[1]/ion-content[1]/custom-side-menu[1]/ion-select[1]")
	private WebElement configuration;
	public WebElement Configuration()
	{
		return configuration;
	}
	
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-popover[1]/div[1]/div[2]/ion-select-popover[1]/ion-list[1]/ion-radio-group[1]/ion-item[2]/ion-radio[1]")
	private WebElement finance;
	public WebElement financeOption()
	{
		return finance;
	}
	
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-menu[1]/ion-content[1]/custom-side-menu[1]/ion-list[1]/ion-segment[1]/ion-segment-button[2]")
	private WebElement segment;
	public WebElement Segment()
	{
		return segment;
	}
	
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-menu[1]/ion-content[1]/custom-side-menu[1]/ion-list[1]/ion-item[2]/ion-icon[1]")
	private WebElement budget;
	public WebElement Budget()
	{
		return budget;
	}
	
	// Click on Supplymentary budget view icon
	@FindBy(xpath = "//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-menu[1]/ion-content[1]/custom-side-menu[1]/ion-list[1]/div[2]/ion-menu-toggle[2]/ion-item[1]/ion-buttons[1]/ion-button[2]")
	private WebElement btn_budgetviewicon;

	public WebElement budgetViewIcon() {
		return btn_budgetviewicon;
	}

	// Click on supplymentary budget creation button
	@FindBy(xpath = "//ion-icon[@name='add']")
	private WebElement btn_supplymentarybudgetcreation;

	public WebElement supplymentaryBudgetCreationButton() {
		return btn_supplymentarybudgetcreation;
	}

	
//-------------------------------------------Reviewer---------------------------------------------//
	
	//notification in reviewer
	@FindBy(xpath="//ion-header/ion-toolbar[1]/ion-buttons[2]/ion-button[2]")
	private WebElement notificationbtn;
	public WebElement notificationButton()
	{
		return notificationbtn;
	}
	
	//approval reject and return page
	@FindBy(xpath="//body[1]/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-inbox[1]/ion-content[1]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[1]/div[1]/ion-buttons[1]/ion-button[1]")
	private WebElement editbgtbyreviewer;
	public WebElement editBudget()
	{
		return editbgtbyreviewer;
	}
	
	//approve
	@FindBy(xpath="//span[contains(text(),'Approve')]")
	private WebElement approvebyreviewer;
	public WebElement approveByReviewer()
	{
		return approvebyreviewer;
	}
	
	//remark by reviewer
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-modal[1]/div[2]/app-remarks[1]/ion-content[1]/ion-infinite-scroll[1]/ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement remarkbyreviewer;
	public WebElement remarkByReviewer()
	{
		return remarkbyreviewer;
	}
	
	//submit by reviewer
	@FindBy(xpath="//ion-button[contains(text(),'Submit')]")
	private WebElement submitbyreviewer;
	public WebElement submitByReviewer()
	{
		return submitbyreviewer;
	}
	
//-----------------------------------------Checker------------------------------------------//
	
	//open pool edit
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-menu[1]/ion-content[1]/custom-side-menu[1]/ion-list[1]/div[1]/ion-menu-toggle[1]/ion-item[1]/ion-buttons[1]/ion-button[1]")
	private WebElement openpooledit;
	public WebElement openPoolEdit()
	{
		return openpooledit;
	}
	
	//claim
	@FindBy(xpath="//ion-button[contains(text(),'Claim')]")
	private WebElement claim;
	public WebElement Claim()
	{
		return claim;
	}
	
	//Notification for approval
	@FindBy(xpath="//ion-header/ion-toolbar[1]/ion-buttons[2]/ion-button[2]")
	private WebElement notifyforapproval;
	public WebElement notifyForApproval()
	{
		return notifyforapproval;
	}
	
	//edit by checker
	@FindBy(xpath="//body[1]/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-inbox[1]/ion-content[1]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[1]/div[1]/ion-buttons[1]/ion-button[1]")
	private WebElement editbychecker;
	public WebElement editByChecker()
	{
		return editbychecker;
	}
	
	//approval
	@FindBy(xpath="//span[contains(text(),'Approve')]")
	private WebElement approvebychecker;
	public WebElement approveByChecker()
	{
		return approvebychecker;
	}
	
	
	//remark by checker
	@FindBy(xpath="//body/app-root[1]/ion-app[1]/ion-modal[1]/div[2]/app-remarks[1]/ion-content[1]/ion-infinite-scroll[1]/ion-row[1]/ion-col[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]")
	private WebElement remarkbychecker;
	public WebElement remarkByChecker()
	{
		return remarkbychecker;
	}
	
	//Submit by checker
	@FindBy(xpath="//ion-button[contains(text(),'Submit')]")
	private WebElement submitbychecker;
	public WebElement submitByChecker()
	{
		return submitbychecker;
	}
	
}


