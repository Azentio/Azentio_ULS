package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncomeDetailsOBJ {
	
	WebDriver driver;

	public IncomeDetailsOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement InboxSearchIcon;
	public WebElement InboxSearchIcon() 
	{
		return InboxSearchIcon;
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
	@FindBy(xpath="//ion-label[contains(text(),'Customer Financials')]//parent::ion-segment-button")
	private WebElement CustomerFinancialsTab;
	public WebElement CustomerFinancialsTab() 
	{
		return CustomerFinancialsTab;
	}
	
	@FindBy(xpath="//ion-title[contains(text(),'Income')]//parent::ion-card-header//following-sibling::ion-card-content//child::kub-prime-table[1]/p-table[1]/div[1]/div[1]//button[@ng-reflect-text='Add']")
	private WebElement IncomeAddIcon;
	public WebElement IncomeAddIcon() 
	{
		return IncomeAddIcon;
	}
	
	@FindBy(xpath="//button[@ng-reflect-text='Save']//child::span")
	private WebElement NewSave;
	public WebElement NewSave()
	{
		return NewSave;
	
	}
	@FindBy(xpath="(//ion-card[@ng-reflect-mode='ios'])[2]//child::ion-toolbar//child::ion-buttons[1]")
	private WebElement BackArrow;
	public WebElement BackArrow()
	{
		return BackArrow;
	}
	@FindBy(xpath="//ion-toast[@role='dialog']")
	private WebElement SaveSuccessMsg;
	public WebElement SaveSuccessMsg()
	{
		return SaveSuccessMsg;
	}
	@FindBy(xpath="(//ion-select[@role='button'])[4]")
	private WebElement IncomeDropDown;
	public WebElement IncomeDropDown()
	{
		return IncomeDropDown;
	}
	@FindBy(xpath="(//ion-select[@role='button'])[6]")
	private WebElement IncomeDropDown1;
	public WebElement IncomeDropDown1()
	{
		return IncomeDropDown1;
	}
	@FindBy(xpath="(//ion-select[@role='button'])[5]")
	private WebElement FrequencyDropDown;
	public WebElement FrequencyDropDown()
	{
		return FrequencyDropDown;
	}
	@FindBy(xpath="(//ion-select[@role='button'])[7]")
	private WebElement FrequencyDropDown1;
	public WebElement FrequencyDropDown1()
	{
		return FrequencyDropDown1;
	}
	@FindBy(xpath="//input[@ng-reflect-name='incomeAmount']")
	private WebElement IncomeAmount;
	public WebElement IncomeAmount()
	{
		return IncomeAmount;
	}
	@FindBy(xpath="(//input[@ng-reflect-name='incomeAmount'])[2]")
	private WebElement IncomeAmount1;
	public WebElement IncomeAmount1()
	{
		return IncomeAmount1;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Employment Type')]//following-sibling::input")
	private WebElement EmploymentType;
	public WebElement EmploymentType()
	{
		return EmploymentType;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[1]")
	private WebElement FinancialYearCalender;
	public WebElement FinancialYearCalender()
	{
		return FinancialYearCalender;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[2]")
	private WebElement FillingDate;
	public WebElement FillingDate()
	{
		return FillingDate;
	}
	@FindBy(xpath="//span[contains(text(),'2023')]")
	private WebElement FinancialYearCalender_Year;
	public WebElement FinancialYearCalender_Year()
	{
		return FinancialYearCalender_Year;
	}
	@FindBy(xpath="//span[contains(text(),'11')]")
	private WebElement FillingDate_Date;
	public WebElement FillingDate_Date()
	{
		return FillingDate_Date;
	}
	@FindBy(xpath="//input[@id='incomeDefPercentage0']")
	private WebElement DefinedPercentage;
	public WebElement DefinedPercentage()
	{
		return DefinedPercentage;
	}
	@FindBy(xpath="//input[@id='incomeDefPercentage1']")
	private WebElement DefinedPercentage1;
	public WebElement DefinedPercentage1()
	{
		return DefinedPercentage1;
	}
	@FindBy(xpath="//input[@id='incomeAdjustedPercent0']")
	private WebElement AdjustedPercentage;
	public WebElement AdjustedPercentage()
	{
		return AdjustedPercentage;
	}
	@FindBy(xpath="//input[@id='incomeAdjustedPercent1']")
	private WebElement AdjustedPercentage1;
	public WebElement AdjustedPercentage1()
	{
		return AdjustedPercentage1;
	}
	@FindBy(xpath="//body[1]/app-root[1]/ion-app[1]/ion-modal[2]/page-composer-parser[1]/ion-content[1]/ion-grid[1]/ion-row[1]/ion-col[1]/kub-wrapper[1]/ion-grid[1]/ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/income[1]/form[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]")
	private WebElement AmountConsidered;
	public WebElement AmountConsidered()
	{
		return AmountConsidered;
	}
	@FindBy(xpath="(//input[@id='incomeAmountConsidered1'])[1]")
	private WebElement AmountConsidered1;
	public WebElement AmountConsidered1()
	{
		return AmountConsidered1;
	}
	@FindBy(xpath="//kub-wrapper[1]//ion-card[1]/ion-card-content[1]/income[1]/form[1]/div[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/ion-button[1]")
	private WebElement AddIncome;
	public WebElement AddIncome()
	{
		return AddIncome;
	}
	@FindBy(xpath="//input[@ng-reflect-name='totalIncome']")
	private WebElement TotalIncome;
	public WebElement TotalIncome()
	{
		return TotalIncome;
	}
	@FindBy(xpath="//input[@ng-reflect-name='totalDeduction']")
	private WebElement TotalDeduction;
	public WebElement TotalDeduction()
	{
		return TotalDeduction;
	}
	@FindBy(xpath="//input[@ng-reflect-name='totalIncomeConsidered']")
	private WebElement TotalIncomeConsidered;
	public WebElement TotalIncomeConsidered()
	{
		return TotalIncomeConsidered;
	}
	@FindBy(xpath="//input[@ng-reflect-name='totalDeductionConsidered']")
	private WebElement TotalDeductionConsidered;
	public WebElement TotalDeductionConsidered()
	{
		return TotalDeductionConsidered;
	}
	@FindBy(xpath="(//ion-select[@role='button'])[9]")
	private WebElement Deduction;
	public WebElement Deduction()
	{
		return Deduction;
	}
	@FindBy(xpath="(//ion-select[@role='button'])[11]")
	private WebElement Deduction1;
	public WebElement Deduction1()
	{
		return Deduction1;
	}
	@FindBy(xpath="(//ion-select[@role='button'])[10]")
	private WebElement Deduction_Frequency;
	public WebElement Deduction_Frequency()
	{
		return Deduction_Frequency;
	}
	@FindBy(xpath="(//ion-select[@role='button'])[12]")
	private WebElement Deduction_Frequency1;
	public WebElement Deduction_Frequency1()
	{
		return Deduction_Frequency1;
	}
	@FindBy(xpath="//input[@id='deductionAmount0']")
	private WebElement Deduction_Amt;
	public WebElement Deduction_Amt()
	{
		return Deduction_Amt;
	}
	@FindBy(xpath="//input[@id='deductionAmount1']")
	private WebElement Deduction_Amt1;
	public WebElement Deduction_Amt1()
	{
		return Deduction_Amt1;
	}
	@FindBy(xpath="(//input[@id='deductionDefPercentage'])[1]")
	private WebElement Deduction_Def;
	public WebElement Deduction_Def()
	{
		return Deduction_Def;
	}
	@FindBy(xpath="(//input[@id='deductionDefPercentage'])[2]")
	private WebElement Deduction_Def1;
	public WebElement Deduction_Def1()
	{
		return Deduction_Def1;
	}
	@FindBy(xpath="//input[@id='deductionAdjustedPercent0']")
	private WebElement Deduction_Adj;
	public WebElement Deduction_Adj()
	{
		return Deduction_Adj;
	}
	@FindBy(xpath="//input[@id='deductionAdjustedPercent1']")
	private WebElement Deduction_Adj1;
	public WebElement Deduction_Adj1()
	{
		return Deduction_Adj1;
	}
	@FindBy(xpath="(//input[@ng-reflect-name='deductionAmountConsidered'])[1]")
	private WebElement Deduction_Considered;
	public WebElement Deduction_Considered()
	{
		return Deduction_Considered;
	}
	@FindBy(xpath="(//input[@ng-reflect-name='deductionAmountConsidered'])[2]")
	private WebElement Deduction_Considered1;
	public WebElement Deduction_Considered1()
	{
		return Deduction_Considered1;
	}

}
