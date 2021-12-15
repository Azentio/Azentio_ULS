package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KUBS_MakerObj {

	
	WebDriver drive;
	public KUBS_MakerObj(WebDriver drive)
	{
		this.drive=drive;
		PageFactory.initElements(drive, this);
	}
	@FindBy(xpath="//ion-select[@class='datagrid-lov ng-valid md hydrated ng-touched ng-dirty ion-valid ion-touched ion-dirty']")
	private WebElement financeoption;
	public WebElement FinaceOption()
	{
		return financeoption;	
	}
	@FindBy(xpath="//ion-segment-button[@value='sys_cnf']")
	private WebElement tool_icon;
	public WebElement toolIcon()
	{
		return tool_icon;	
	}
	@FindBy(xpath="//ion-segment-button[@value='txn_bnk']")
	private WebElement direction_icon;
	public WebElement directionIcon()
	{
		return direction_icon;	
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'Business partner setup')]")
	private WebElement business_partner_setup;
	public WebElement businessPartnerSetup()
	{
		return business_partner_setup;	
	}
	@FindBy(xpath="//ion-label[contains(text(),'Accounting setup')]")
	private WebElement accounting_setup;
	public WebElement accountingSetup()
	{
		return accounting_setup;
		
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'General ledger configuration')]")
	private WebElement general_ledger_config;
	public WebElement glConfig()
	{
		return general_ledger_config;	
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'Expense/AR & AP configuration')]")
	private WebElement expense_config;
	public WebElement expenseConfig()
	{
		return expense_config;
		
	}
	@FindBy(xpath="//ion-label[contains(text(),'Budget configuration')]")
	private WebElement budgetconfig;
	public WebElement budgetConfig()
	{
		return budgetconfig;
		
	}
	@FindBy(xpath="//ion-label[contains(text(),'Fixed assets configuration')]")
	private WebElement fixed_assets_config;
	public WebElement fixedAssetsConfig()
	{
		return fixed_assets_config;
		
	}
	@FindBy(xpath="//ion-label[contains(text(),'Inventory maintenance')]")
	private WebElement inventory_maintenance;
	public WebElement inventoryMaintenance()
	{
		return inventory_maintenance;
		
	}
	@FindBy(xpath="//ion-label[contains(text(),'Bank recon')]")
	private WebElement bank_recon;
	public WebElement bankRecon()
	{
		return bank_recon;
		
	}
	@FindBy(xpath="//ion-label[contains(text(),'Petty cash configuration')]")
	private WebElement petty_cash_config;
	public WebElement pettyCashConfig()
	{
		return petty_cash_config;
			
	}
	@FindBy(xpath="//ion-label[contains(text(),'General ledger transaction')]")
	private WebElement dir_gl_transaction;
	public WebElement dirGlTransaction()
	{
		return accounting_setup;
		
	}
	@FindBy(xpath="//ion-label[text()=' Budget ']")
	private WebElement dir_budget;
	public WebElement dirBudget()
	{
		return dir_budget;
		
	}
	@FindBy(xpath="//ion-label[contains(text(),' Accounts payable ')]")
	private WebElement dir_accounts_payable;
	public WebElement dirAccountsPayable()
	{
		return dir_accounts_payable;
		
	}
    @FindBy(xpath="//ion-label[contains(text(),' Adjustments ( AR and AP) ')]")
    private WebElement dir_adjustments;
    public WebElement dirAdjustments()
    {
		return dir_adjustments;
    	
    }
    @FindBy(xpath="//ion-label[text()=' Accounts receivable ']")
    private WebElement dir_accounts_receivable;
    public WebElement dirAccountsReceivable()
    {
		return dir_accounts_receivable;
    	
    }
    @FindBy(xpath="//ion-label[contains(text(),'Fixed assets')]")
    private WebElement dir_fixed_assets;
    public WebElement dirFixedAssets()
    {
		return dir_fixed_assets;
    	
    }
    @FindBy(xpath="//ion-label[contains(text(),'Inventory management')]")
    private WebElement dir_inventory_management;
    public WebElement dirInventoryManagement()
    {
		return dir_inventory_management;
    	
    }
    @FindBy(xpath="//ion-label[contains(text(),'Petty cash')]")
    private WebElement dir_petty_cash;
    public WebElement dirPettyCash()
    {
		return dir_petty_cash;	
    }
    @FindBy(xpath="//ion-label[text()=' Bank recon ']")
    private WebElement dir_bank_recon;
    public WebElement dirBankRecon()
    {
		return dir_bank_recon;
    	
    }
    
}




