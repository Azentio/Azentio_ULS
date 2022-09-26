package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerEntityLayoutDebtOBJ {
	WebDriver driver;

	public CustomerEntityLayoutDebtOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-label[contains(text(),'Finance Type')]//following-sibling::ion-select")
	private WebElement CustomerDebt_FinanceType;
	public WebElement CustomerDebt_FinanceType()
	{
		return CustomerDebt_FinanceType;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Financial Institution')]//following-sibling::ion-select")
	private WebElement CustomerDebt_FinancialInstitution;
	public WebElement CustomerDebt_FinancialInstitution()
	{
		return CustomerDebt_FinancialInstitution;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Currency')]//following-sibling::ion-select")
	private WebElement CustomerDebt_Currency;
	public WebElement CustomerDebt_Currency()
	{
		return CustomerDebt_Currency;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Collateral Type')]//following-sibling::ion-select")
	private WebElement CustomerDebt_CollateralType;
	public WebElement CustomerDebt_CollateralType()
	{
		return CustomerDebt_CollateralType;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Frequency')]//following-sibling::ion-select")
	private WebElement CustomerDebt_Frequency;
	public WebElement CustomerDebt_Frequency()
	{
		return CustomerDebt_Frequency;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Facility Status')]//following-sibling::ion-select")
	private WebElement CustomerDebt_FacilityStatus;
	public WebElement CustomerDebt_FacilityStatus()
	{
		return CustomerDebt_FacilityStatus;
	}
	@FindBy(xpath="//ion-label[contains(text(),'NPA CLASSIFICATION')]//following-sibling::ion-select")
	private WebElement CustomerDebt_NPA_CLASSIFICATION;
	public WebElement CustomerDebt_NPA_CLASSIFICATION()
	{
		return CustomerDebt_NPA_CLASSIFICATION;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Account Number')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_AccountNumber;
	public WebElement CustomerDebt_AccountNumber()
	{
		return CustomerDebt_AccountNumber;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Sanction Amount')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_SanctionAmount;
	public WebElement CustomerDebt_SanctionAmount()
	{
		return CustomerDebt_SanctionAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Interest Rate %')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_InterestRate;
	public WebElement CustomerDebt_InterestRate()
	{
		return CustomerDebt_InterestRate;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Current Principal Balance')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_CurrentPrincipalBalance;
	public WebElement CustomerDebt_CurrentPrincipalBalance()
	{
		return CustomerDebt_CurrentPrincipalBalance;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Tenure (months)')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_TenureMonth;
	public WebElement CustomerDebt_TenureMonth()
	{
		return CustomerDebt_TenureMonth;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Installment Amount')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_InstallmentAmount;
	public WebElement CustomerDebt_InstallmentAmount()
	{
		return CustomerDebt_InstallmentAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Amount Considered')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_AmountConsidered;
	public WebElement CustomerDebt_AmountConsidered()
	{
		return CustomerDebt_AmountConsidered;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Last Payment Amount')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_LastPaymentAmount;
	public WebElement CustomerDebt_LastPaymentAmount()
	{
		return CustomerDebt_LastPaymentAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Product Name')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_ProductName;
	public WebElement CustomerDebt_ProductName()
	{
		return CustomerDebt_ProductName;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Last 24 Cycle')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_Last24Cycle;
	public WebElement CustomerDebt_Last24Cycle()
	{
		return CustomerDebt_Last24Cycle;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Remaining Tenure (months)')]//following-sibling::ion-input//input")
	private WebElement CustomerDebt_RemainingTenureMonths;
	public WebElement CustomerDebt_RemainingTenureMonths()
	{
		return CustomerDebt_RemainingTenureMonths;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Remarks')]//following-sibling::ion-textarea//textarea")
	private WebElement CustomerDebt_Remarks;
	public WebElement CustomerDebt_Remarks()
	{
		return CustomerDebt_Remarks;
	}
	@FindBy(xpath="")
	private WebElement CustomerDebt_FinancialInstitutionError;
	public WebElement CustomerDebt_FinancialInstitutionError()
	{
		return CustomerDebt_FinancialInstitutionError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[2]")
	private WebElement CustomerDebt_SanctionDateError;
	public WebElement CustomerDebt_SanctionDateError()
	{
		return CustomerDebt_SanctionDateError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[3]")
	private WebElement CustomerDebt_SanctionAmountError;
	public WebElement CustomerDebt_SanctionAmountError()
	{
		return CustomerDebt_SanctionAmountError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[4]")
	private WebElement CustomerDebt_MaturityDateError;
	public WebElement CustomerDebt_MaturityDateError()
	{
		return CustomerDebt_MaturityDateError;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Installment Amount')]//parent::ion-item//parent::kub-uq-code//following-sibling::div//ion-badge")
	private WebElement CustomerDebt_InstallmentAmountError;
	public WebElement CustomerDebt_InstallmentAmountError()
	{
		return CustomerDebt_InstallmentAmountError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[6]")
	private WebElement CustomerDebt_AmountConsideredError;
	public WebElement CustomerDebt_AmountConsideredError()
	{
		return CustomerDebt_AmountConsideredError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[7]")
	private WebElement CustomerDebt_RemarksError;
	public WebElement CustomerDebt_RemarksError()
	{
		return CustomerDebt_RemarksError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[8]")
	private WebElement CustomerDebt_NextDueDateError;
	public WebElement CustomerDebt_NextDueDateError()
	{
		return CustomerDebt_NextDueDateError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[9]")
	private WebElement CustomerDebt_LastPaymentAmountError;
	public WebElement CustomerDebt_LastPaymentAmountError()
	{
		return CustomerDebt_LastPaymentAmountError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[10]")
	private WebElement CustomerDebt_LastPaymentDateError;
	public WebElement CustomerDebt_LastPaymentDateError()
	{
		return CustomerDebt_LastPaymentDateError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[11]")
	private WebElement CustomerDebt_FacilityStatusError;
	public WebElement CustomerDebt_FacilityStatusError()
	{
		return CustomerDebt_FacilityStatusError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[12]")
	private WebElement CustomerDebt_RemainingTenureMonthError;
	public WebElement CustomerDebt_RemainingTenureMonthError()
	{
		return CustomerDebt_RemainingTenureMonthError;
	}
	@FindBy(xpath="(//ion-badge[contains(text(),'Required field')])[13]")
	private WebElement CustomerDebt_DisbersementDateError;
	public WebElement CustomerDebt_DisbersementDateError()
	{
		return CustomerDebt_DisbersementDateError;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Account Number')]//parent::ion-item//parent::kub-uq-code//following-sibling::div//ion-badge[contains(text(),'Positive Integer Allowed')]")
	private WebElement CustomerDebt_AccountNumberError;
	public WebElement CustomerDebt_AccountNumberError()
	{
		return CustomerDebt_AccountNumberError;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Interest Rate %')]//parent::ion-item//parent::kub-uq-code//following-sibling::div//ion-badge[contains(text(),'Positive Integer Allowed')]")
	private WebElement CustomerDebt_InterestRateError;
	public WebElement CustomerDebt_InterestRateError()
	{
		return CustomerDebt_InterestRateError;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Current Principal Balance')]//parent::ion-item//parent::kub-uq-code//following-sibling::div//ion-badge[contains(text(),'Positive Integer Allowed')]")
	private WebElement CustomerDebt_CurrentPrincipalBalanceError;
	public WebElement CustomerDebt_CurrentPrincipalBalanceError()
	{
		return CustomerDebt_CurrentPrincipalBalanceError;
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
	@FindBy(xpath="//button[@ng-reflect-text='Edit']")
	private WebElement CustomerDebtActionEditIcon;
	public WebElement CustomerDebtActionEditIcon() 
	{
		return CustomerDebtActionEditIcon;
	}
	@FindBy(xpath="(//button[@ng-reflect-text='Add'])[4]")
	private WebElement FinanacialCommitmentsAddIcon;
	public WebElement FinanacialCommitmentsAddIcon() 
	{
		return FinanacialCommitmentsAddIcon;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-search'])[4]")
	private WebElement searchIcon;
	public WebElement searchIcon() 
	{
		return searchIcon;
	}
	@FindBy(xpath="(//span[@class='p-button-icon pi pi-search'])[4]")
	private WebElement productViewSearchText2;
	public WebElement productViewSearchText2() 
	{
		return productViewSearchText2;
	}
	@FindBy(xpath="//input[@mode='ios']")
	private WebElement productViewSearchText;
	public WebElement productViewSearchText() 
	{
		return productViewSearchText;
	}
	
	



}
