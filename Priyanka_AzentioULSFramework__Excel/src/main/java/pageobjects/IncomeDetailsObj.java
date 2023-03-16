package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncomeDetailsObj {
	WebDriver driver;

	public IncomeDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// ------------------------MAKER STAGE PAGEOBJECTS----------------------//

	@FindBy(xpath = "//span[contains(text(),'Transactions')]")
	private WebElement Transactions;

	public WebElement Transactions() {
		return Transactions;
	}

	// Search Icon
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement IncomeDetails_SearchIcon;

	public WebElement IncomeDetails_SearchIcon() {
		return IncomeDetails_SearchIcon;
	}

	// search input field
	@FindBy(xpath = "//div/span/input")
	private WebElement IncomeDetails_SearchInputField;

	public WebElement IncomeDetails_SearchInputField() {
		return IncomeDetails_SearchInputField;
	}

	// search close button
	@FindBy(xpath = "//div/span/i")
	private WebElement IncomeDetails_SearchCloseButton;

	public WebElement IncomeDetails_SearchCloseButton() {
		return IncomeDetails_SearchCloseButton;
	}

	// Next
	@FindBy(xpath = "(//button[contains(text(),'Next')])[3]")
	private WebElement IncomeDetails_Next;

	public WebElement IncomeDetails_Next() {
		return IncomeDetails_Next;
	}

	// Customer Financials SegmentButton
	@FindBy(xpath = "//ion-label[text()='Customer Financials']/parent::ion-segment-button")
	private WebElement IncomeDetails_CustomerFinancials_SegmentButton;

	public WebElement IncomeDetails_CustomerFinancials_SegmentButton() {
		return IncomeDetails_CustomerFinancials_SegmentButton;
	}

	// Customer Financials Edit
	@FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]/button[1]")
	private WebElement IncomeDetails_CustomerFinancials_ActionEdit;

	public WebElement IncomeDetails_CustomerFinancials_ActionEdit() {
		return IncomeDetails_CustomerFinancials_ActionEdit;
	}

	// Add Button
	@FindBy(xpath = "(//button[@ng-reflect-text='Add'])[3]")
	private WebElement IncomeDetails_AddButton;

	public WebElement IncomeDetails_AddButton() {
		return IncomeDetails_AddButton;
	}

	// EmploymentType
	@FindBy(xpath = "//span[contains(text(),'Salaried')]")
	private WebElement IncomeDetails_EmploymentType;

	public WebElement IncomeDetails_EmploymentType() {
		return IncomeDetails_EmploymentType;
	}

	// Income
	@FindBy(xpath = "(//tbody[1]/tr[1]/td[1]/digital-select-layout[1]/ion-item[1]/ion-select[1])[1]")
	private WebElement IncomeDetails_Income;

	public WebElement IncomeDetails_Income() {
		return IncomeDetails_Income;
	}

	// Income Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'BASIC')]/../ion-radio")
	private WebElement IncomeDetails_IncomeDropdown;

	public WebElement IncomeDetails_IncomeDropdown() {
		return IncomeDetails_IncomeDropdown;
	}

	// Income Frequency
	@FindBy(xpath = "(//tbody[1]/tr[1]/td[2]/digital-select-layout[1]/ion-item[1]/ion-select[1])[1]")
	private WebElement IncomeDetails_IncomeFrequency;

	public WebElement IncomeDetails_IncomeFrequency() {
		return IncomeDetails_IncomeFrequency;
	}

	// Income Frequency Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'Monthly')]/../ion-radio")
	private WebElement IncomeDetails_IncomeFrequencyDropdown;

	public WebElement IncomeDetails_IncomeFrequencyDropdown() {
		return IncomeDetails_IncomeFrequencyDropdown;
	}

	// Income Amount
	@FindBy(xpath = "//input[@id='incomeAmount0']")
	private WebElement IncomeDetails_IncomeAmount;

	public WebElement IncomeDetails_IncomeAmount() {
		return IncomeDetails_IncomeAmount;
	}

	// Income AdjustedPercent
	@FindBy(xpath = "//input[@id='incomeAdjustedPercent0']")
	private WebElement IncomeDetails_IncomeAdjustedPercent;

	public WebElement IncomeDetails_IncomeAdjustedPercent() {
		return IncomeDetails_IncomeAdjustedPercent;
	}

	// Income AmountConsidered
	@FindBy(xpath = "(//p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1])[1]")
	private WebElement IncomeDetails_IncomeAmountConsidered;

	public WebElement IncomeDetails_IncomeAmountConsidered() {
		return IncomeDetails_IncomeAmountConsidered;
	}

	// Total Income
	@FindBy(xpath = "//income[1]/form[1]/ion-row[2]/ion-col[1]/input[1]")
	private WebElement IncomeDetails_TotalIncome;

	public WebElement IncomeDetails_TotalIncome() {
		return IncomeDetails_TotalIncome;
	}

	// Total Income Considered
	@FindBy(xpath = "//income[1]/form[1]/ion-row[2]/ion-col[2]/input[1]")
	private WebElement IncomeDetails_TotalIncomeConsidered;

	public WebElement IncomeDetails_TotalIncomeConsidered() {
		return IncomeDetails_TotalIncomeConsidered;
	}

	// SalaryCreditedToBank
	@FindBy(xpath = "//ion-row[2]/ion-col[3]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement IncomeDetails_SalaryCreditedToBank;

	public WebElement IncomeDetails_SalaryCreditedToBank() {
		return IncomeDetails_SalaryCreditedToBank;
	}

	// SalaryCreditedToBank DropDown
	@FindBy(xpath = "//ion-label[contains(text(),'YES')]/../ion-radio")
	private WebElement IncomeDetails_SalaryCreditedToBank_DropDown;

	public WebElement IncomeDetails_SalaryCreditedToBank_DropDown() {
		return IncomeDetails_SalaryCreditedToBank_DropDown;
	}

	// BankName
	@FindBy(xpath = "//ion-select[@aria-label='Bank Name']")
	private WebElement IncomeDetails_BankName;

	public WebElement IncomeDetails_BankName() {
		return IncomeDetails_BankName;
	}

	// BankName DropDown
	@FindBy(xpath = "//ion-label[contains(text(),' ICICIBANK ')]/../ion-radio")
	private WebElement IncomeDetails_BankNameDropDown;

	public WebElement IncomeDetails_BankNameDropDown() {
		return IncomeDetails_BankNameDropDown;
	}

	// BranchName
	@FindBy(xpath = "//ion-col[5]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement IncomeDetails_BranchName;

	public WebElement IncomeDetails_BranchName() {
		return IncomeDetails_BranchName;
	}

	// BranchName DropDown
	@FindBy(xpath = "//ion-label[contains(text(),' ICICIBANK ')]/../ion-radio")
	private WebElement IncomeDetails_BranchNameDropDown;

	public WebElement IncomeDetails_BranchNameDropDown() {
		return IncomeDetails_BranchNameDropDown;
	}

	// Deduction
	@FindBy(xpath = "(//tbody[1]/tr[1]/td[1]/digital-select-layout[1]/ion-item[1]/ion-select[1])[2]")
	private WebElement IncomeDetails_Deduction;

	public WebElement IncomeDetails_Deduction() {
		return IncomeDetails_Deduction;
	}

	// Deduction Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),' INCOME TAX ')]/../ion-radio")
	private WebElement IncomeDetails_DeductionDropdown;

	public WebElement IncomeDetails_DeductionDropdown() {
		return IncomeDetails_DeductionDropdown;
	}

	// Deduction Frequency
	@FindBy(xpath = "(//tbody[1]/tr[1]/td[2]/digital-select-layout[1]/ion-item[1]/ion-select[1])[2]")
	private WebElement IncomeDetails_DeductionFrequency;

	public WebElement IncomeDetails_DeductionFrequency() {
		return IncomeDetails_DeductionFrequency;
	}

	// Deduction Frequency Dropdown
	@FindBy(xpath = "(//ion-label[contains(text(),' Yearly ')]/../ion-radio)[2]")
	private WebElement IncomeDetails_DeductionFrequencyDropdown;

	public WebElement IncomeDetails_DeductionFrequencyDropdown() {
		return IncomeDetails_DeductionFrequencyDropdown;
	}

	// Deduction Amount
	@FindBy(xpath = "//input[@id='deductionAmount0']")
	private WebElement IncomeDetails_DeductionAmount;

	public WebElement IncomeDetails_DeductionAmount() {
		return IncomeDetails_DeductionAmount;
	}

	// Deduction AdjustedPercent
	@FindBy(xpath = "//input[@id='deductionAdjustedPercent0']")
	private WebElement IncomeDetails_DeductionAdjustedPercent;

	public WebElement IncomeDetails_DeductionAdjustedPercent() {
		return IncomeDetails_DeductionAdjustedPercent;
	}

	// Deduction AmountConsidered
	@FindBy(xpath = "(//p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1])[2]")
	private WebElement IncomeDetails_DeductionAmountConsidered;

	public WebElement IncomeDetails_DeductionAmountConsidered() {
		return IncomeDetails_DeductionAmountConsidered;
	}

	// Total Deduction
	@FindBy(xpath = "//input[@id='totalDeduction']")
	private WebElement IncomeDetails_TotalDeduction;

	public WebElement IncomeDetails_TotalDeduction() {
		return IncomeDetails_TotalDeduction;
	}

	// Total Deduction Considered
	@FindBy(xpath = "//input[@id='totalDeductionConsidered']")
	private WebElement IncomeDetails_TotalDeductionConsidered;

	public WebElement IncomeDetails_TotalDeductionConsidered() {
		return IncomeDetails_TotalDeductionConsidered;
	}

	// Currency
	@FindBy(xpath = "//ion-row[3]/ion-col[3]/digital-select-layout[1]/ion-item[1]/ion-select[1]")
	private WebElement IncomeDetails_Currency;

	public WebElement IncomeDetails_Currency() {
		return IncomeDetails_Currency;
	}

	// Currency Dropdown
	@FindBy(xpath = "//ion-label[contains(text(),'INR')]/../ion-radio")
	private WebElement IncomeDetails_CurrencyDropdown;

	public WebElement IncomeDetails_CurrencyDropdown() {
		return IncomeDetails_CurrencyDropdown;
	}

	// Save
	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement IncomeDetails_Save;

	public WebElement IncomeDetails_Save() {
		return IncomeDetails_Save;
	}

	// Back
	@FindBy(xpath = "(//ion-toolbar[1]/ion-buttons[1]/ion-button[1])[2]")
	private WebElement IncomeDetails_Back;

	public WebElement IncomeDetails_Back() {
		return IncomeDetails_Back;
	}

	// Incom ActionEdit
	@FindBy(xpath = "(//table[1]/tbody[1]/tr[1]/td[1]/span[1]/button[1]/span[1])[2]")
	private WebElement IncomeDetails_IncomActionEdit;

	public WebElement IncomeDetails_IncomActionEdit() {
		return IncomeDetails_IncomActionEdit;
	}

	// ListView IncomeHeaderID
	@FindBy(xpath = "//span[contains(text(),'Income header ID')]")
	private WebElement IncomeDetails_ListView_IncomeHeaderID;

	public WebElement IncomeDetails_ListView_IncomeHeaderID() {
		return IncomeDetails_ListView_IncomeHeaderID;
	}

	// ListView EmployerName
	@FindBy(xpath = "(//span[contains(text(),'Employer Name')])[2]")
	private WebElement IncomeDetails_ListView_EmployerName;

	public WebElement IncomeDetails_ListView_EmployerName() {
		return IncomeDetails_ListView_EmployerName;
	}

	// ListView_NatureOfEmployment
	@FindBy(xpath = "(//span[contains(text(),'Nature of Employment')])[2]")
	private WebElement IncomeDetails_ListView_NatureOfEmployment;

	public WebElement IncomeDetails_ListView_NatureOfEmployment() {
		return IncomeDetails_ListView_NatureOfEmployment;
	}

	// ListView_NetIncome
	@FindBy(xpath = "//span[contains(text(),'Net income')]")
	private WebElement IncomeDetails_ListView_NetIncome;

	public WebElement IncomeDetails_ListView_NetIncome() {
		return IncomeDetails_ListView_NetIncome;
	}

	// ListView_NetDeduction
	@FindBy(xpath = "//span[contains(text(),'Net Deduction')]")
	private WebElement IncomeDetails_ListView_NetDeduction;

	public WebElement IncomeDetails_ListView_NetDeduction() {
		return IncomeDetails_ListView_NetDeduction;
	}

	// ListView_Currency
	@FindBy(xpath = "(//span[contains(text(),'Currency')])[1]")
	private WebElement IncomeDetails_ListView_Currency;

	public WebElement IncomeDetails_ListView_Currency() {
		return IncomeDetails_ListView_Currency;
	}

	// ListView BackButton
	@FindBy(xpath = "//button[@ng-reflect-text='Go Back']")
	private WebElement IncomeDetails_ListView_BackButton;

	public WebElement IncomeDetails_ListView_BackButton() {
		return IncomeDetails_ListView_BackButton;
	}

	// ListView Next
	@FindBy(xpath = "(//ion-toolbar[1]/ion-slides[1]/div[1]/button[2])[2]")
	private WebElement IncomeDetails_ListView_Next;

	public WebElement IncomeDetails_ListView_Next() {
		return IncomeDetails_ListView_Next;
	}

	// ListViewFirstField_IncomeHeaderID
	@FindBy(xpath = "(//tbody/tr[1]/td[2]/p-celleditor[1]/span[1])[2]")
	private WebElement IncomeDetails_ListViewFirstField_IncomeHeaderID;

	public WebElement IncomeDetails_ListViewFirstField_IncomeHeaderID() {
		return IncomeDetails_ListViewFirstField_IncomeHeaderID;
	}

	// IncomeDetails_ListViewFirstField_NatureOfEmployment
	@FindBy(xpath = "(//tbody/tr[1]/td[4]/p-celleditor[1]/span[1])[3]")
	private WebElement IncomeDetails_ListViewFirstField_NatureOfEmployment;

	public WebElement IncomeDetails_ListViewFirstField_NatureOfEmployment() {
		return IncomeDetails_ListViewFirstField_NatureOfEmployment;
	}

	//IncomeDetails_ListViewFirstField_NetIncome
	@FindBy(xpath = "(//tbody/tr[1]/td[5]/p-celleditor[1]/span[1])[3]")
	private WebElement IncomeDetails_ListViewFirstField_NetIncome;

	public WebElement IncomeDetails_ListViewFirstField_NetIncome() {
		return IncomeDetails_ListViewFirstField_NetIncome;
	}

	// IncomeDetails_ListViewFirstField_NetDeduction
	@FindBy(xpath = "(//tbody/tr[1]/td[6]/p-celleditor[1]/span[1])[2]")
	private WebElement IncomeDetails_ListViewFirstField_NetDeduction;

	public WebElement IncomeDetails_ListViewFirstField_NetDeduction() {
		return IncomeDetails_ListViewFirstField_NetDeduction;
	}

	// IncomeDetails_ListViewFirstField_Currency
	@FindBy(xpath = "(//tbody/tr[1]/td[7]/p-celleditor[1]/span[1])[2]")
	private WebElement IncomeDetails_ListViewFirstField_Currency;

	public WebElement IncomeDetails_ListViewFirstField_Currency() {
		return IncomeDetails_ListViewFirstField_Currency;
	}

	// Export
		@FindBy(xpath = "(//div[4]/p-dropdown[1]/div[1]/div[2])[3]")
		private WebElement IncomeDetails_Export;

		public WebElement IncomeDetails_Export() {
			return IncomeDetails_Export;
		}

		// PDF
		@FindBy(xpath = " //li[@aria-label='PDF']")
		private WebElement IncomeDetails_PdfFile;

		public WebElement IncomeDetails_PdfFile() {
			return IncomeDetails_PdfFile;
		}

		// XLS
		@FindBy(xpath = " //li[@aria-label='XLS']")
		private WebElement IncomeDetails_XlsFile;

		public WebElement IncomeDetails_XlsFile() {
			return IncomeDetails_XlsFile;
		}
		// Search Icon
		@FindBy(xpath = "(//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1])[3]")
		private WebElement IncomeDetails_ListView_SearchIcon;

		public WebElement IncomeDetails_ListView_SearchIcon() {
			return IncomeDetails_ListView_SearchIcon;
		}

		// no data display
		@FindBy(xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]")
		private WebElement IncomeDetails_NoDataFoundInSearch;

		public WebElement IncomeDetails_NoDataFoundInSearch() {
			return IncomeDetails_NoDataFoundInSearch;
		}
	

}
