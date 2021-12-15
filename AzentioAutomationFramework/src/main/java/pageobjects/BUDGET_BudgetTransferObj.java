package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BUDGET_BudgetTransferObj {
	WebDriver driver;

	public BUDGET_BudgetTransferObj(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-menu[1]/ion-content[1]/custom-side-menu[1]/ion-list[1]/div[2]/ion-menu-toggle[3]/ion-item[1]/ion-buttons[1]/ion-button[2]/ion-icon[1]")
	private WebElement budgtTrnsfrEyeButtn;
	
	@FindBy(xpath = "//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/app-data-grid[1]/ion-content[1]/ion-fab[1]/ion-fab-button[1]/ion-icon[1]")
	private WebElement budgtTrnsfrAddButtn;

	@FindBy(xpath = "//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-transfer-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[1]/ion-col[2]/app-kub-lov[1]/span[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
	private WebElement budgtTrnsfrBudgtCodeDropDown;

	@FindBy(xpath = "//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-transfer-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[1]/ion-col[5]/app-kub-lov[1]/span[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
	private WebElement  budgtTrnsfrBudgtYearDropdown;

	@FindBy(xpath = "//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-transfer-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[1]/ion-col[6]/app-kub-lov[1]/span[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
	private WebElement budgtTrnsfrBranch;
	@FindBy(xpath = "//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-transfer-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[1]/ion-col[7]/app-kub-lov[1]/span[1]/ng-select[1]/div[1]/div[1]/div[2]/input[1]")
	private WebElement  budgtTrnsfrTransferToBudgtCode;
	@FindBy(xpath = "//input[@id='totalBudgetAmount']")
	private WebElement budgtTrnsfrTotalBudgtAmt;
	@FindBy(xpath = "//input[@id='trxAmt']")
	private WebElement budgtTrnsfrTransferAmt;
	@FindBy(xpath = "//body/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-transfer-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[1]/ion-col[11]/app-kub-lov[1]/span[1]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")
	private WebElement budgtTrnsfrCurrencyChange;
	@FindBy(xpath = "//body[1]/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-transfer-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[2]/ion-col[1]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[3]/div[1]/app-kub-currency[1]/input[1]")
	private WebElement budgtTrnsfrApportionedAmountA;
	@FindBy(xpath = "//body[1]/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-transfer-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[2]/ion-col[1]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[4]/div[1]/app-kub-currency[1]/input[1]")
	private WebElement budgtTrnsfrNewAmtA;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-transfer-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[2]/ion-col[2]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[3]/div[1]/app-kub-currency[1]/input[1]")
	private WebElement budgtTrnsfrApportionedAmountB;
	@FindBy(xpath = "//body[1]/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-transfer-update[1]/ion-content[1]/ion-infinite-scroll[1]/form[1]/ion-grid[1]/ion-row[2]/ion-col[2]/div[1]/ngx-datatable[1]/div[1]/datatable-body[1]/datatable-selection[1]/datatable-scroller[1]/datatable-row-wrapper[1]/datatable-body-row[1]/div[2]/datatable-body-cell[4]/div[1]/app-kub-currency[1]/input[1]")
	private WebElement budgtTrnsfrNewAmtB;
	@FindBy(xpath = "//body[1]/app-root[1]/ion-app[1]/ion-split-pane[1]/ion-router-outlet[1]/app-tabs[1]/ion-tabs[1]/div[1]/ion-router-outlet[1]/page-budget-transfer-update[1]/div[1]/ion-header[1]/ion-toolbar[1]/ion-buttons[2]/ion-button[1]")
	private WebElement budgtTrnsfrSaveButton;
	
	

	public WebElement budgtTrnsfrSaveButton() {
		return budgtTrnsfrSaveButton;

	}
	

	public WebElement budgtTrnsfrNewAmtB() {
		return budgtTrnsfrNewAmtB;

	}
	

	public WebElement budgtTrnsfrApportionedAmountB() {
		return budgtTrnsfrApportionedAmountB;

	}
	

	public WebElement budgtTrnsfrNewAmtA() {
		return budgtTrnsfrNewAmtA;

	}
	

	public WebElement budgtTrnsfrApportionedAmountA() {
		return budgtTrnsfrApportionedAmountA;

	}
	

	public WebElement budgtTrnsfrCurrencyChange() {
		return budgtTrnsfrCurrencyChange;

	}
	

	public WebElement budgtTrnsfrTransferAmt() {
		return budgtTrnsfrTransferAmt;

	}
	
	public WebElement budgtTrnsfrTotalBudgtAmt() {
		return budgtTrnsfrTotalBudgtAmt;

	}
	
	
	public WebElement budgtTrnsfrTransferToBudgtCode() {
		return budgtTrnsfrTransferToBudgtCode;

	}
	
	
	public WebElement budgtTrnsfrBranch() {
		return budgtTrnsfrBranch;

	}
	
	public WebElement budgtTrnsfrBudgtYearDropdown() {
		return budgtTrnsfrBudgtYearDropdown;

	}
	
	public WebElement budgtTrnsfrBudgtCodeDropDown() {
		return budgtTrnsfrBudgtCodeDropDown;

	}
	public WebElement budgtTrnsfrAddButtn() {
		return budgtTrnsfrAddButtn;

	}
	public WebElement budgtTrnsfrEyeButtn() {
		return budgtTrnsfrEyeButtn;

	}
	

}
