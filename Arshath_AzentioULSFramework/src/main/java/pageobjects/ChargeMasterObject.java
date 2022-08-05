package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChargeMasterObject {
	WebDriver driver;

	public ChargeMasterObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[text()='Charge master']//parent::ion-label//following-sibling::ion-buttons/ion-button[2]")
	private WebElement ChargeMaster_EyeIcon1;

	public WebElement ChargeMaster_EyeIcon() {
		return ChargeMaster_EyeIcon1;
	}

	@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	private WebElement SaveSuccess_alert;

	public WebElement SaveSuccess_alert() {
		return SaveSuccess_alert;
	}

	@FindBy(xpath = "//ion-radio")
	private WebElement chargeMaster_calculationTypeFieldVerification;

	public WebElement chargeMasterCalculationTypeDropDownFieldVerification() {
		return chargeMaster_calculationTypeFieldVerification;
	}

	@FindBy(xpath = "//h4[text()='Product Definitions']")
	private WebElement productDefinitions;

	public WebElement productDefinitions() {
		return productDefinitions;
	}

	@FindBy(xpath = "//h4[text()='Charge master']//parent::ion-label//following-sibling::ion-buttons/ion-button[1]")
	private WebElement ChargeMaster_tempviewIcon1;

	public WebElement ChargeMaster_tempviewIcon() {
		return ChargeMaster_tempviewIcon1;
	}

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-plus']")
	private WebElement ChargeMaster_AddButton1;

	public WebElement ChargeMaster_AddButton() {
		return ChargeMaster_AddButton1;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement ChargeMst_TempView_Edit;

	public WebElement ChargeMst_TempView_Edit() {
		return ChargeMst_TempView_Edit;
	}

	@FindBy(xpath = "(//ion-label[contains(text(),'Charge')])[1]")
	private WebElement ChargeMaster_Label_Charge;

	public WebElement ChargeMaster_Label_Charge() {
		return ChargeMaster_Label_Charge;
	}

	@FindBy(xpath = "(//ion-label[contains(text(),'Description')])[1]")
	private WebElement ChargeMaster_Label_Description;

	public WebElement ChargeMaster_Label_Description() {
		return ChargeMaster_Label_Description;
	}

	@FindBy(xpath = "(//ion-label[contains(text(),'Calculation Type')])[1]")
	private WebElement ChargeMaster_Label_Calculation_Type;

	public WebElement ChargeMaster_Label_Calculation_Type() {
		return ChargeMaster_Label_Calculation_Type;
	}

	// *********************************************************************//

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Charge *']")
	private WebElement ChargeMaster_ChargeDropDown1;

	public WebElement ChargeMaster_ChargeDropDown() {
		return ChargeMaster_ChargeDropDown1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Calculation Type *']")
	private WebElement ChargeMaster_CalculationTypeDropDown1;

	public WebElement ChargeMaster_CalculationTypeDropDown() {
		return ChargeMaster_CalculationTypeDropDown1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Description')]//following-sibling::ion-input//input")
	private WebElement ChargeMaster_Description1;

	public WebElement ChargeMaster_Description() {
		return ChargeMaster_Description1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Flat Amount')]//following-sibling::ion-input//input")
	private WebElement ChargeMaster_FlatAmount1;

	public WebElement ChargeMaster_FlatAmount() {
		return ChargeMaster_FlatAmount1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Percentage')]//following-sibling::ion-input//input")
	private WebElement ChargeMaster_Percentage1;

	public WebElement ChargeMaster_Percentage() {
		return ChargeMaster_Percentage1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Calculated On ']")
	private WebElement ChargeMaster_CalcutedOnDropDown1;

	public WebElement ChargeMaster_CalcutedOnDropDown() {
		return ChargeMaster_CalcutedOnDropDown1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Rec/Pay ']")
	private WebElement ChargeMaster_RecPayDropDown1;

	public WebElement ChargeMaster_RecPayDropDown() {
		return ChargeMaster_RecPayDropDown1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Include in Cust IRR ']")
	private WebElement ChargeMaster_IncludeInCustIRRDropDown1;

	public WebElement ChargeMaster_IncludeInCustIRRDropDown() {
		return ChargeMaster_IncludeInCustIRRDropDown1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Include in Bank IRR ']")
	private WebElement ChargeMaster_IncludeInBankIRRDropDown1;

	public WebElement ChargeMaster_IncludeInBankIRRDropDown() {
		return ChargeMaster_IncludeInBankIRRDropDown1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Level ']")
	private WebElement ChargeMaster_LevelDropDown1;

	public WebElement ChargeMaster_LevelDropDown() {
		return ChargeMaster_LevelDropDown1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Currency ']")
	private WebElement ChargeMaster_CurrencyDropDown1;

	public WebElement ChargeMaster_CurrencyDropDown() {
		return ChargeMaster_CurrencyDropDown1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Event ']")
	private WebElement ChargeMaster_EventDropDown1;

	public WebElement ChargeMaster_EventDropDown() {
		return ChargeMaster_EventDropDown1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Date Unit ']")
	private WebElement ChargeMaster_DateUnitDropDown1;

	public WebElement ChargeMaster_DateUnitDropDown() {
		return ChargeMaster_DateUnitDropDown1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Date Value')]//following-sibling::ion-input//input")
	private WebElement ChargeMaster_DateValue1;

	public WebElement ChargeMaster_DateValue() {
		return ChargeMaster_DateValue1;
	}

	@FindBy(xpath = "//ion-label[contains(text(),'Charge Count')]//following-sibling::ion-input//input")
	private WebElement ChargeMaster_ChargeCount1;

	public WebElement ChargeMaster_ChargeCount() {
		return ChargeMaster_ChargeCount1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Allow Edit ']")
	private WebElement ChargeMaster_AllowEditDropDown1;

	public WebElement ChargeMaster_AllowEditDropDown() {
		return ChargeMaster_AllowEditDropDown1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Accounting Type *']")
	private WebElement ChargeMaster_AccountingTypeDropDown1;

	public WebElement ChargeMaster_AccountingTypeDropDown() {
		return ChargeMaster_AccountingTypeDropDown1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Rule ']")
	private WebElement ChargeMaster_RuleDropDown1;

	public WebElement ChargeMaster_RuleDropDown() {
		return ChargeMaster_RuleDropDown1;
	}

	@FindBy(xpath = "//ion-textarea[1]/div[1]/textarea[1]")
	private WebElement ChargeMaster_Remarks1;

	public WebElement ChargeMaster_Remarks() {
		return ChargeMaster_Remarks1;
	}

	@FindBy(xpath = "//button[@ng-reflect-icon='pi pi-save']")
	private WebElement ChargeMaster_SaveButton1;

	public WebElement ChargeMaster_SaveButton() {
		return ChargeMaster_SaveButton1;
	}

	@FindBy(xpath = "(//p-table//button[@ng-reflect-text='Add'])[2]")
	private WebElement ChargeMaster_chargeslab_add;

	public WebElement ChargeMaster_chargeslab_add() {
		return ChargeMaster_chargeslab_add;
	}

	// ***************Charge Slab Details**********//
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Calculated Type *']")
	private WebElement ChargeSlab_CalculatedType1;

	public WebElement ChargeSlab_CalculatedType() {
		return ChargeSlab_CalculatedType1;
	}

	// ***************Charge Slab Details**********//
	@FindBy(xpath = "//ion-select[@aria-label='Select,  Calculated Type *']")
	private WebElement ChargeSlab_CalculatedTypeDropDown1;

	public WebElement ChargeSlab_CalculatedTypeDropDown() {
		return ChargeSlab_CalculatedTypeDropDown1;
	}

	@FindBy(xpath = "//ion-label[text()=' Min Slab Amount ']//following-sibling::ion-input//input")
	private WebElement ChargeSlab_MinSlabAmount1;

	public WebElement ChargeSlab_MinSlabAmount() {
		return ChargeSlab_MinSlabAmount1;
	}

	@FindBy(xpath = "//ion-label[text()=' Max Slab Amount ']//following-sibling::ion-input//input")
	private WebElement ChargeSlab_MaxSlabAmount1;

	public WebElement ChargeSlab_MaxSlabAmount() {
		return ChargeSlab_MaxSlabAmount1;
	}

	@FindBy(xpath = "//ion-label[text()=' Amount ']//following-sibling::ion-input//input")
	private WebElement ChargeSlab_Amount1;

	public WebElement ChargeSlab_Amount() {
		return ChargeSlab_Amount1;
	}

	@FindBy(xpath = "//ion-label[text()=' Rate ']//following-sibling::ion-input//input")
	private WebElement ChargeSlab_Rate1;

	public WebElement ChargeSlab_Rate() {
		return ChargeSlab_Rate1;
	}

	@FindBy(xpath = "//ion-select[@aria-label='Select,  Currency *']")
	private WebElement ChargeSlab_CurrencyDropDown1;

	public WebElement ChargeSlab_CurrencyDropDown() {
		return ChargeSlab_CurrencyDropDown1;
	}

	@FindBy(xpath = "(//ion-textarea[1]/div[1]/textarea[1])[2]")
	private WebElement ChargeSlab_Remarks1;

	public WebElement ChargeSlab_Remarks() {
		return ChargeSlab_Remarks1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-icon='pi pi-save'])[2]")
	private WebElement ChargeSlab_SaveButton1;

	public WebElement ChargeSlab_SaveButton() {
		return ChargeSlab_SaveButton1;
	}

	@FindBy(xpath = "(//button[@ng-reflect-text='Go Back'])[2]")
	private WebElement ChargeSlab_BackButton1;

	public WebElement ChargeSlab_BackButton() {
		return ChargeSlab_BackButton1;
	}

	@FindBy(xpath = "//ion-row[1]/ion-col[7]/digital-radio-button[1]/ion-item[1]/ion-toggle[1]")
	private WebElement ChargeSlab_Status;

	public WebElement ChargeSlab_Status() {
		return ChargeSlab_Status;
	}

	@FindBy(xpath = "(//tbody[1]/tr[1]/td[1]/span[1]/button[1])[2]")
	private WebElement ChargeSlab_Edit;

	public WebElement ChargeSlab_Edit() {
		return ChargeSlab_Edit;
	}
}
