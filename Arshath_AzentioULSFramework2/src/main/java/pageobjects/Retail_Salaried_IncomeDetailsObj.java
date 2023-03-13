package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Retail_Salaried_IncomeDetailsObj {
	WebDriver driver;
	public Retail_Salaried_IncomeDetailsObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//button[@ng-reflect-icon=\"pi pi-plus\"])[3]")
	private WebElement IncomeDetails_AddIcon;
	public WebElement IncomeDetails_AddIcon() {
		return IncomeDetails_AddIcon;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Employment Type')]/following-sibling::input")
	private WebElement IncomeDetails_EmploymentTypeField;
	public WebElement IncomeDetails_EmploymentTypeField() {
		return IncomeDetails_EmploymentTypeField;
	}	
	@FindBy(xpath="//ion-label[contains(text(),'Lumpsum Amount')]/following-sibling::input")
	private WebElement IncomeDetails_LumpsumAmountField;
	public WebElement IncomeDetails_LumpsumAmountField() {
		return IncomeDetails_LumpsumAmountField;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Pension Amount')]/following-sibling::input")
	private WebElement IncomeDetails_PensionAmountField;
	public WebElement IncomeDetails_PensionAmountField() {
		return IncomeDetails_PensionAmountField;
	}
	@FindBy(xpath="(//th[contains(text(),'Income')]//ancestor::div//following-sibling::ion-select)[1]")
	private WebElement IncomeDetails_IncomeField;
	public WebElement IncomeDetails_IncomeField() {
		return IncomeDetails_IncomeField;
	}
	@FindBy(xpath="(//th[contains(text(),'Income')]//ancestor::div//following-sibling::ion-select)[2]")
	private WebElement IncomeDetails_FrequencyField;
	public WebElement IncomeDetails_FrequencyField() {
		return IncomeDetails_FrequencyField;
	}
	@FindBy(xpath="(//th[contains(text(),' Amount ')]//ancestor::div//following-sibling::td/input)[1]")
	private WebElement IncomeDetails_AmountField;
	public WebElement IncomeDetails_AmountField() {
		return IncomeDetails_AmountField;
	}
	@FindBy(xpath="(//th[contains(text(),' Amount ')]//ancestor::div//following-sibling::td/input)[2]")
	private WebElement IncomeDetails_DefinedPercentageField;
	public WebElement IncomeDetails_DefinedPercentageField() {
		return IncomeDetails_DefinedPercentageField;
	}
	@FindBy(xpath="(//th[contains(text(),' Amount ')]//ancestor::div//following-sibling::td/input)[3]")
	private WebElement IncomeDetails_AdjustedPercentageField;
	public WebElement IncomeDetails_AdjustedPercentageField() {
		return IncomeDetails_AdjustedPercentageField;
	}
	@FindBy(xpath="(//th[contains(text(),' Amount ')]//ancestor::div//following-sibling::td/input)[4]")
	private WebElement IncomeDetails_AmountConsideredField;
	public WebElement IncomeDetails_AmountConsideredField() {
		return IncomeDetails_AmountConsideredField;
	}
	@FindBy(xpath="(//ion-icon[@aria-label='add'])[1]")
	private WebElement IncomeDetails_ActionIconInIncomeSection;
	public WebElement IncomeDetails_ActionIconInIncomeSection() {
		return IncomeDetails_ActionIconInIncomeSection;
	}
	@FindBy(xpath="(//ion-icon[@aria-label='add'])[2]")
	private WebElement IncomeDetails_ActionIconInDeductionSection;
	public WebElement IncomeDetails_ActionIconInDeductionSection() {
		return IncomeDetails_ActionIconInDeductionSection;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'Total Income ')]/following-sibling::input)[1]")
	private WebElement IncomeDetails_TotalIncomeField;
	public WebElement IncomeDetails_TotalIncomeField() {
		return IncomeDetails_TotalIncomeField;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'Total Income ')]/following-sibling::input)[2]")
	private WebElement IncomeDetails_TotalIncomeConsideredField;
	public WebElement IncomeDetails_TotalIncomeConsideredField() {
		return IncomeDetails_TotalIncomeConsideredField;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Salary Credited To Bank')]//parent::ion-col//ion-select")
	private WebElement IncomeDetails_SalaryCreditedToBankField;
	public WebElement IncomeDetails_SalaryCreditedToBankField() {
		return IncomeDetails_SalaryCreditedToBankField;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction ')]//ancestor::div//following-sibling::ion-select)[1]")
	private WebElement IncomeDetails_DeductionField;
	public WebElement IncomeDetails_DeductionField() {
		return IncomeDetails_DeductionField;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction ')]//ancestor::div//following-sibling::ion-select)[2]")
	private WebElement IncomeDetails_FrequencyInDeductionField;
	public WebElement IncomeDetails_FrequencyInDeductionField() {
		return IncomeDetails_FrequencyInDeductionField;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction Amt')]//ancestor::div//following-sibling::td/input)[1]")
	private WebElement IncomeDetails_DeductionAmtField;
	public WebElement IncomeDetails_DeductionAmtField() {
		return IncomeDetails_DeductionAmtField;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction Amt')]//ancestor::div//following-sibling::td/input)[2]")
	private WebElement IncomeDetails_DeductionDefPercentageField;
	public WebElement IncomeDetails_DeductionDefPercentageField() {
		return IncomeDetails_DeductionDefPercentageField;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction Amt')]//ancestor::div//following-sibling::td/input)[3]")
	private WebElement IncomeDetails_DeductionAdjPercentageField;
	public WebElement IncomeDetails_DeductionAdjPercentageField() {
		return IncomeDetails_DeductionAdjPercentageField;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction Amt')]//ancestor::div//following-sibling::td/input)[4]")
	private WebElement IncomeDetails_DeductionConsideredField;
	public WebElement IncomeDetails_DeductionConsideredField() {
		return IncomeDetails_DeductionConsideredField;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'Total Deduction')]/following-sibling::input)[1]")
	private WebElement IncomeDetails_TotalDeductionField;
	public WebElement IncomeDetails_TotalDeductionField() {
		return IncomeDetails_TotalDeductionField;
	}
	@FindBy(xpath="(//ion-label[contains(text(),'Total Deduction')]/following-sibling::input)[2]")
	private WebElement IncomeDetails_TotalDeductionConsideredField;
	public WebElement IncomeDetails_TotalDeductionConsideredField() {
		return IncomeDetails_TotalDeductionConsideredField;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Currency')]//parent::ion-col//ion-select")
	private WebElement IncomeDetails_CurrencyField;
	public WebElement IncomeDetails_CurrencyField() {
		return IncomeDetails_CurrencyField;
	}
	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") 
    private WebElement ApplicationDetails_Inbox;
    public WebElement ApplicationDetails_Inbox() {
        return ApplicationDetails_Inbox;
    }
    @FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]") 
    private WebElement ApplicationDetailsInboxView_Search;
    public WebElement ApplicationDetailsInboxView_Search() {
        return ApplicationDetailsInboxView_Search;
    }  
    @FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input") 
    private WebElement ApplicationDetailsInboxView_SearchText;
    public WebElement ApplicationDetailsInboxView_SearchText() {
        return ApplicationDetailsInboxView_SearchText;
    }  
    @FindBy(xpath = "(//tr/td/button)[1]") 
    private WebElement ApplicationDetailsMailBoxActionButtonOfFirstRecord_AppDataEntry;
    public WebElement ApplicationDetailsMailBoxActionButtonOfFirstRecord_AppDataEntry() {
    return ApplicationDetailsMailBoxActionButtonOfFirstRecord_AppDataEntry;
    }  
    @FindBy(xpath = "//ion-segment-button[@id='seg4']") 
    private WebElement CustomerFinancialsSection;
    public WebElement CustomerFinancialsSection() {
    return CustomerFinancialsSection;
    } 		
    @FindBy(xpath = "//ion-title[contains(text(),' Income ')]//ancestor::ion-card//button[@ng-reflect-icon='pi pi-plus']") 
    private WebElement AddIconOfIncomeDetails;
    public WebElement AddIconOfIncomeDetails() {
    return AddIconOfIncomeDetails;
    }
    @FindBy(xpath="(//th[contains(text(),'Income')]//ancestor::div//following-sibling::ion-select)[3]")
	private WebElement IncomeDetails_IncomeField1;
	public WebElement IncomeDetails_IncomeField1() {
		return IncomeDetails_IncomeField1;
	}
	@FindBy(xpath="(//th[contains(text(),'Income')]//ancestor::div//following-sibling::ion-select)[4]")
	private WebElement IncomeDetails_FrequencyField1;
	public WebElement IncomeDetails_FrequencyField1() {
		return IncomeDetails_FrequencyField;
	}
	@FindBy(xpath="(//th[contains(text(),' Amount ')]//ancestor::div//following-sibling::td/input)[5]")
	private WebElement IncomeDetails_AmountField1;
	public WebElement IncomeDetails_AmountField1() {
		return IncomeDetails_AmountField1;
	}
	@FindBy(xpath="(//th[contains(text(),' Amount ')]//ancestor::div//following-sibling::td/input)[6]")
	private WebElement IncomeDetails_DefinedPercentageField1;
	public WebElement IncomeDetails_DefinedPercentageField1() {
		return IncomeDetails_DefinedPercentageField1;
	}
	@FindBy(xpath="(//th[contains(text(),' Amount ')]//ancestor::div//following-sibling::td/input)[7]")
	private WebElement IncomeDetails_AdjustedPercentageField1;
	public WebElement IncomeDetails_AdjustedPercentageField1() {
		return IncomeDetails_AdjustedPercentageField1;
	}
	@FindBy(xpath="(//th[contains(text(),' Amount ')]//ancestor::div//following-sibling::td/input)[8]")
	private WebElement IncomeDetails_AmountConsideredField1;
	public WebElement IncomeDetails_AmountConsideredField1() {
		return IncomeDetails_AmountConsideredField1;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction ')]//ancestor::div//following-sibling::ion-select)[3]")
	private WebElement IncomeDetails_DeductionField1;
	public WebElement IncomeDetails_DeductionField1() {
		return IncomeDetails_DeductionField1;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction ')]//ancestor::div//following-sibling::ion-select)[4]")
	private WebElement IncomeDetails_FrequencyInDeductionField1;
	public WebElement IncomeDetails_FrequencyInDeductionField1() {
		return IncomeDetails_FrequencyInDeductionField1;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction Amt')]//ancestor::div//following-sibling::td/input)[5]")
	private WebElement IncomeDetails_DeductionAmtField1;
	public WebElement IncomeDetails_DeductionAmtField1() {
		return IncomeDetails_DeductionAmtField1;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction Amt')]//ancestor::div//following-sibling::td/input)[6]")
	private WebElement IncomeDetails_DeductionDefPercentageField1;
	public WebElement IncomeDetails_DeductionDefPercentageField1() {
		return IncomeDetails_DeductionDefPercentageField1;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction Amt')]//ancestor::div//following-sibling::td/input)[7]")
	private WebElement IncomeDetails_DeductionAdjPercentageField1;
	public WebElement IncomeDetails_DeductionAdjPercentageField1() {
		return IncomeDetails_DeductionAdjPercentageField1;
	}
	@FindBy(xpath="(//th[contains(text(),'Deduction Amt')]//ancestor::div//following-sibling::td/input)[8]")
	private WebElement IncomeDetails_DeductionConsideredField1;
	public WebElement IncomeDetails_DeductionConsideredField1() {
		return IncomeDetails_DeductionConsideredField1;
	}
	@FindBy(xpath="//span[contains(text(),'Eligibility Check')]")
	private WebElement IncomeDetails_EligibilityCheckButton;
	public WebElement IncomeDetails_EligibilityCheckButton() {
		return IncomeDetails_EligibilityCheckButton;
	}
	@FindBy(xpath="//div[contains(text(),'OK')]")
	private WebElement IncomeDetails_EligibilityCheckSuccessPopup;
	public WebElement IncomeDetails_EligibilityCheckSuccessPopup() {
		return IncomeDetails_EligibilityCheckSuccessPopup;
	}
	@FindBy(xpath="(//span[contains(text(),'Approve')])[1]")
	private WebElement IncomeDetails_ApproveIconInApplicationDetails;
	public WebElement IncomeDetails_ApproveIconInApplicationDetails() {
		return IncomeDetails_ApproveIconInApplicationDetails;
	}
	@FindBy(xpath="//ion-label[contains(text(),'approve')]")
	private WebElement IncomeDetails_ApproveinRemarksText;
	public WebElement IncomeDetails_ApproveinRemarksText() {
		return IncomeDetails_ApproveinRemarksText;
	}
	@FindBy(xpath="(//span[contains(text(),'Approve')])[3]")
	private WebElement IncomeDetails_ApproveButtoninRemarks;
	public WebElement IncomeDetails_ApproveButtoninRemarks() {
	return IncomeDetails_ApproveButtoninRemarks;
	}
	@FindBy(xpath="(//div[contains(text(),'Record APPROVED Successfully')])[1]")
	private WebElement IncomeDetails_RecordApprovedSuccessfullyPopup1;
	public WebElement IncomeDetails_RecordApprovedSuccessfullyPopup1() {
	return IncomeDetails_RecordApprovedSuccessfullyPopup1;
	}
	@FindBy(xpath="(//div[contains(text(),'Record APPROVED Successfully')])[2]")
	private WebElement IncomeDetails_RecordApprovedSuccessfullyPopup2;
	public WebElement IncomeDetails_RecordApprovedSuccessfullyPopup2() {
	return IncomeDetails_RecordApprovedSuccessfullyPopup2;
	}
	@FindBy(xpath="(//div[contains(text(),'Record APPROVED Successfully')])[3]")
	private WebElement IncomeDetails_RecordApprovedSuccessfullyPopup3;
	public WebElement IncomeDetails_RecordApprovedSuccessfullyPopup3() {
	return IncomeDetails_RecordApprovedSuccessfullyPopup3;
	}
}
