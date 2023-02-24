package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerEntityLayout_CustomerDebtObj {
	WebDriver driver;
	public CustomerEntityLayout_CustomerDebtObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ion-label[contains(text(),' Finance Type ')]//following-sibling::ion-select")
	private WebElement CustomerDebt_FinanceType;
	public WebElement CustomerDebt_FinanceType() {
		return CustomerDebt_FinanceType;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Financial Institution ')]//following-sibling::ion-select")
	private WebElement CustomerDebt_FinancialInstitution;
	public WebElement CustomerDebt_FinancialInstitution() {
		return CustomerDebt_FinancialInstitution;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Account Number ')]//following-sibling::ion-input/input")
	private WebElement CustomerDebt_AccountNumber;
	public WebElement CustomerDebt_AccountNumber() {
		return CustomerDebt_AccountNumber;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[1]")
	private WebElement CustomerDebt_SanctionDate;
	public WebElement CustomerDebt_SanctionDate() {
		return CustomerDebt_SanctionDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Sanction Amount ')]//following-sibling::ion-input/input")
	private WebElement CustomerDebt_SanctionAmount;
	public WebElement CustomerDebt_SanctionAmount() {
		return CustomerDebt_SanctionAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Interest Rate % ')]//following-sibling::ion-input/input")
	private WebElement CustomerDebt_InterestRate;
	public WebElement CustomerDebt_InterestRate() {
		return CustomerDebt_InterestRate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Current Principal Balance ')]//following-sibling::ion-input/input")
	private WebElement CustomerDebt_CurrentPrincipalBalance;
	public WebElement CustomerDebt_CurrentPrincipalBalance() {
		return CustomerDebt_CurrentPrincipalBalance;
	}
	@FindBy(xpath="(//ion-label[contains(text(),' Tenure (months) ')]//following-sibling::ion-input/input)[1]")
	private WebElement CustomerDebt_TenureMonths;
	public WebElement CustomerDebt_TenureMonths() {
		return CustomerDebt_TenureMonths;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[2]")
	private WebElement CustomerDebt_MaturityDate;
	public WebElement CustomerDebt_MaturityDate() {
		return CustomerDebt_MaturityDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Installment Amount ')]//following-sibling::ion-input/input")
	private WebElement CustomerDebt_InstallmentAmount;
	public WebElement CustomerDebt_InstallmentAmount() {
		return CustomerDebt_InstallmentAmount;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Amount Considered ')]//following-sibling::ion-input/input")
	private WebElement CustomerDebt_AmountConsidered;
	public WebElement CustomerDebt_AmountConsidered() {
		return CustomerDebt_AmountConsidered;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Currency ')]//following-sibling::ion-select")
	private WebElement CustomerDebt_Currency;
	public WebElement CustomerDebt_Currency() {
		return CustomerDebt_Currency;
	}
	@FindBy(xpath="//ion-textarea/div/textarea")
	private WebElement CustomerDebt_Remarks;
	public WebElement CustomerDebt_Remarks() {
		return CustomerDebt_Remarks;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[3]")
	private WebElement CustomerDebt_NextDueDate;
	public WebElement CustomerDebt_NextDueDate() {
		return CustomerDebt_NextDueDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Collateral Type ')]//following-sibling::ion-select")
	private WebElement CustomerDebt_CollateralType;
	public WebElement CustomerDebt_CollateralType() {
		return CustomerDebt_CollateralType;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[4]")
	private WebElement CustomerDebt_ClosedDate;
	public WebElement CustomerDebt_ClosedDate() {
		return CustomerDebt_ClosedDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Frequency ')]//following-sibling::ion-select")
	private WebElement CustomerDebt_Frequency;
	public WebElement CustomerDebt_Frequency() {
		return CustomerDebt_Frequency;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Last Payment Amount ')]//following-sibling::ion-input/input")
	private WebElement CustomerDebt_LastPaymentAmount;
	public WebElement CustomerDebt_LastPaymentAmount() {
		return CustomerDebt_LastPaymentAmount;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[5]")
	private WebElement CustomerDebt_LastPaymentDate;
	public WebElement CustomerDebt_LastPaymentDate() {
		return CustomerDebt_LastPaymentDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Product Name ')]//following-sibling::ion-input/input")
	private WebElement CustomerDebt_ProductName;
	public WebElement CustomerDebt_ProductName() {
		return CustomerDebt_ProductName;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Last 24 Cycle ')]//following-sibling::ion-input/input")
	private WebElement CustomerDebt_Last24Cycle;
	public WebElement CustomerDebt_Last24Cycle() {
		return CustomerDebt_Last24Cycle;
	}
	@FindBy(xpath="//ion-toggle")
	private WebElement CustomerDebt_BalanceTransferFlag;
	public WebElement CustomerDebt_BalanceTransferFlag() {
		return CustomerDebt_BalanceTransferFlag;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Facility Status ')]//following-sibling::ion-select")
	private WebElement CustomerDebt_FacilityStatus;
	public WebElement CustomerDebt_FacilityStatus() {
		return CustomerDebt_FacilityStatus;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Remaining Tenure (months) ')]//following-sibling::ion-input/input")
	private WebElement CustomerDebt_RemainingTenureMonths;
	public WebElement CustomerDebt_RemainingTenureMonths() {
		return CustomerDebt_RemainingTenureMonths;
	}
	@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-calendar'])[6]")
	private WebElement CustomerDebt_DisbursementDate;
	public WebElement CustomerDebt_DisbursementDate() {
		return CustomerDebt_DisbursementDate;
	}
	@FindBy(xpath="//ion-label[contains(text(),' NPA CLASSIFICATION ')]//following-sibling::ion-select")
	private WebElement CustomerDebt_NPAClassification;
	public WebElement CustomerDebt_NPAClassification() {
		return CustomerDebt_NPAClassification;
	}
	@FindBy(xpath="//ion-title[contains(text(),' Financial Commitments ')]//ancestor::ion-card//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement CustomerDebt_AddIcon;
	public WebElement CustomerDebt_AddIcon() {
	return CustomerDebt_AddIcon;
	}
	@FindBy(xpath="//span[contains(text(),'Today')]")
	private WebElement CalenderIcon_TodayValue;
	public WebElement CalenderIcon_TodayValue() {
		return CalenderIcon_TodayValue;
	}
	@FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	private WebElement CustomerDebt_SaveIcon;
	public WebElement CustomerDebt_SaveIcon() {
		return CustomerDebt_SaveIcon;
	}
	@FindBy(xpath = "//ion-segment-button[@id='seg4']") 
    private WebElement CustomerFinancialsButton;
    public WebElement CustomerFinancialsButton() {
    return CustomerFinancialsButton;
    }
	
}




