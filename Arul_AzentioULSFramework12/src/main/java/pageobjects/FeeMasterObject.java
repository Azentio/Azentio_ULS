package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeeMasterObject {
	WebDriver driver;
 public FeeMasterObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
 @FindBy(xpath="//ion-label[text()='Config Manager']//following-sibling::ion-icon")
 private WebElement ConfigManager1;
 public WebElement ConfigManager(){
	 return ConfigManager1;
 }
 @FindBy(xpath="//span[text()='Configurations']")
 private WebElement Configuration1;
 public WebElement Configuration(){
	 return Configuration1;
 }
 @FindBy(xpath="//ion-label[text()='Fee master']//parent::ion-label//following-sibling::ion-buttons/ion-button[2]")
 private WebElement FeeMaster_EyeIcon1;
 public WebElement FeeMaster_EyeIcon(){
	 return FeeMaster_EyeIcon1;
 }
 @FindBy(xpath="//button[@ng-reflect-icon='pi pi-plus']")
 private WebElement FeeMaster_AddButton1;
 public WebElement FeeMaster_AddButton(){
	 return FeeMaster_AddButton1;
 }
 @FindBy(xpath="//ion-label[contains(text(),'Amort Tenure')]/following-sibling::ion-select")
 private WebElement FeeMaster_AmortTenure1;
 public WebElement FeeMaster_AmortTenure(){
	 return FeeMaster_AmortTenure1;
 }
 @FindBy(xpath="//ion-label[contains(text(),'Amort Rate Method')]/following-sibling::ion-select")
 private WebElement FeeMaster_AmortRate1;
 public WebElement FeeMaster_AmortRate(){
	 return FeeMaster_AmortRate1;
 }
 @FindBy(xpath="//ion-label[contains(text(),'Amount Recovery')]/following-sibling::ion-select")
 private WebElement FeeMaster_ChargeAmountRecovery1;
 public WebElement FeeMaster_ChargeAmountRecovery(){
	 return FeeMaster_ChargeAmountRecovery1;
 }
 @FindBy(xpath="//ion-label[contains(text(),'Amort Frequency')]/following-sibling::ion-select")
 private WebElement FeeMaster_AmountFrequency1;
 public WebElement FeeMaster_AmountFrequency(){
	 return FeeMaster_AmountFrequency1;
 }
 
 
 
// ***************IS Displayed**************************//
 
 @FindBy(xpath = "//button[@ng-reflect-text='Go Back']") //Back Button
	private WebElement BackButton1;
    public WebElement BackButton() {
		return BackButton1;
	}
    @FindBy(xpath = "//ion-label[contains(text(),'Charge Flag')]/following-sibling::ion-select") //ChargeFlag Name
	private WebElement ChargeFlagName1;
    public WebElement ChargeFlagName() {
		return ChargeFlagName1;
	}
    @FindBy(xpath = "//ion-label[contains(text(),'Description')]") //Charge description Name
  	private WebElement ChargeDescriptionName1;
      public WebElement ChargeDescriptionName() {
  		return ChargeDescriptionName1;
  	}
      @FindBy(xpath = "//ion-label[contains(text(),'Charge Type')]/following-sibling::ion-select") //Charge type Name
    	private WebElement ChargeTypeName1;
        public WebElement ChargeTypeName() {
    		return ChargeTypeName1;
    	}
        @FindBy(xpath = "//ion-label[contains(text(),'Due Code')]/following-sibling::ion-select") //Due code Name
    	private WebElement DueCodeName1;
        public WebElement DueCodeName() {
    		return DueCodeName1;
    	}
        @FindBy(xpath = "//ion-label[text()=' Legacy Code1 ']") //Legacy code1 Name
    	private WebElement LegacyCode1Name1;
        public WebElement LegacyCode1Name() {
    		return LegacyCode1Name1;
    	}
        @FindBy(xpath = "//ion-label[text()=' Legacy Code2 ']") //Legacy code1 Name
    	private WebElement LegacyCode2Name1;
        public WebElement LegacyCode2Name() {
    		return LegacyCode2Name1;
    	}
        @FindBy(xpath = "//ion-label[contains(text(),'GST Applicable State')]/following-sibling::ion-select") //GST Applicable State Name
    	private WebElement GSTApplicableStateName1;
        public WebElement GSTApplicableStateName() {
    		return GSTApplicableStateName1;
    	}
        @FindBy(xpath = "//ion-label[contains(text(),'Tax Calculation Method')]/following-sibling::ion-select") //Tax Calculation Method Name
    	private WebElement TaxCalculationMethodName1;
        public WebElement TaxCalculationMethodName() {
    		return TaxCalculationMethodName1;
    	}
        @FindBy(xpath = "//ion-label[text()='Is Tax Allowed ']") //Is Tax Allowed Name
    	private WebElement IsTaxAllowedName1;
        public WebElement IsTaxAllowedName() {
    		return IsTaxAllowedName1;
    	}
        @FindBy(xpath = "//ion-label[text()='Include In APR ']") //Include In APR Name
    	private WebElement IncludeInAPRName1;
        public WebElement IncludeInAPRName() {
    		return IncludeInAPRName1;
    	}
        @FindBy(xpath = "//ion-label[contains(text(),'Amortize')]/following-sibling::ion-select") //AmortizeName
    	private WebElement AmortizeName1;
        public WebElement AmortizeName() {
    		return AmortizeName1;
    	}
        @FindBy(xpath = "//ion-label[contains(text(),'Upfront')]/following-sibling::ion-select") //Upfront
    	private WebElement UpfrontName1;
        public WebElement UpfrontName() {
    		return UpfrontName1;
    	}
        @FindBy(xpath = "//ion-label[contains(text(),'Deduct')]/following-sibling::ion-select") // Deduct
    	private WebElement DeductName1;
        public WebElement DeductName() {
    		return DeductName1;
    	}
        @FindBy(xpath = "//ion-label[contains(text(),'Remarks')]") // Remarks
    	private WebElement RemarksName1;
        public WebElement RemarksName() {
    		return RemarksName1;
    	}
        
        
      ///**********************INPUT VALUES********************************///
        
        @FindBy(xpath="//ion-label[contains(text(),'Description')]//following-sibling::ion-input//input")//(xpath = "//ion-col[1]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]") 
    	private WebElement FeeMaster_ChargeDescription1;
        public WebElement FeeMaster_ChargeDescription() {
    		return FeeMaster_ChargeDescription1;
    	}
        @FindBy(xpath="//ion-label[contains(text(),'Charge Type')]/following-sibling::ion-select")//(xpath = "//ion-col[2]/digital-select-layout[1]/ion-item[1]/ion-select[1]") 
    	private WebElement FeeMaster_ChargeType1;
        public WebElement FeeMaster_ChargeType() {
    		return FeeMaster_ChargeType1;
    	}
        @FindBy(xpath="//ion-label[contains(text(),'Charge Flag')]/following-sibling::ion-select")//(xpath = "//ion-col[3]/digital-select-layout[1]/ion-item[1]/ion-select[1]") 
    	private WebElement FeeMaster_ChargeFlag1;
        public WebElement FeeMaster_ChargeFlag() {
    		return FeeMaster_ChargeFlag1;
    	}
        @FindBy(xpath="//ion-label[contains(text(),'Due Code')]/following-sibling::ion-select")//(xpath = "//ion-col[4]/digital-select-layout[1]/ion-item[1]/ion-select[1]") 
    	private WebElement FeeMaster_DueCode1;
        public WebElement FeeMaster_DueCode() {
    		return FeeMaster_DueCode1;
    	}
        @FindBy(xpath="//ion-label[text()=' Legacy Code1 ']//following-sibling::ion-input/input")//(xpath = "//ion-col[5]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]") 
    	private WebElement FeeMaster_Legacy1Code1;
        public WebElement FeeMaster_Legacy1Code() {
    		return FeeMaster_Legacy1Code1;
    	}
        @FindBy(xpath="//ion-label[text()=' Legacy Code2 ']//following-sibling::ion-input/input")//(xpath = "//ion-col[6]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]") 
    	private WebElement FeeMaster_Legacy2Code1;
        public WebElement FeeMaster_Legacy2Code() {
    		return FeeMaster_Legacy2Code1;
    	}
        @FindBy(xpath="//ion-label[contains(text(),'GST Applicable State')]/following-sibling::ion-select")//(xpath = "//ion-col[7]/digital-select-layout[1]/ion-item[1]/ion-select[1]") 
    	private WebElement FeeMaster_GSTApplicableState1;
        public WebElement FeeMaster_GSTApplicableState() {
    		return FeeMaster_GSTApplicableState1;
    	}
        @FindBy(xpath="//ion-label[contains(text(),'Tax Calculation Method')]/following-sibling::ion-select")//(xpath = "//ion-col[9]/digital-select-layout[1]/ion-item[1]/ion-select[1]") 
    	private WebElement FeeMaster_TaxCalculationMethod1;
        public WebElement FeeMaster_TaxCalculationMethod() {
    		return FeeMaster_TaxCalculationMethod1;
    	}
        @FindBy(xpath="//ion-label[contains(text(),'Amortize')]/following-sibling::ion-select")//(xpath = "//ion-col[11]/digital-select-layout[1]/ion-item[1]/ion-select[1]") 
    	private WebElement FeeMaster_Amortize1;
        public WebElement FeeMaster_Amortize() {
    		return FeeMaster_Amortize1;
    	}
        @FindBy(xpath="//ion-label[contains(text(),'Upfront')]/following-sibling::ion-select")//(xpath = "//ion-col[13]/digital-select-layout[1]/ion-item[1]/ion-select[1]") 
    	private WebElement FeeMaster_Upfront1;
        public WebElement FeeMaster_Upfront() {
    		return FeeMaster_Upfront1;
    	}
        @FindBy(xpath="//ion-label[text()='Is Tax Allowed ']//ancestor::digital-radio-button//ion-item")//(xpath = "//ion-col[8]/digital-radio-button[1]/ion-item[1]/ion-toggle[1]") 
    	private WebElement FeeMaster_TaxAllowedButton1;
        public WebElement FeeMaster_TaxAllowedButton() {
    		return FeeMaster_TaxAllowedButton1;
    	}
        @FindBy(xpath="//ion-label[text()='Include In APR ']//ancestor::digital-radio-button//ion-item")//(xpath = "//ion-col[10]/digital-radio-button[1]/ion-item[1]/ion-toggle[1]") 
    	private WebElement FeeMaster_IncludeARPButton1;
        public WebElement FeeMaster_IncludeARPButton() {
    		return FeeMaster_IncludeARPButton1;
    	}
        @FindBy(xpath="//ion-label[contains(text(),'Deduct')]/following-sibling::ion-select")//(xpath = "//ion-col[12]/digital-select-layout[1]/ion-item[1]/ion-select[1]") 
    	private WebElement FeeMaster_Deduct1;
        public WebElement FeeMaster_Deduct() {
    		return FeeMaster_Deduct1;
    	}
        @FindBy(xpath="//ion-label[text()=' Remarks ']//following-sibling::ion-textarea/div/textarea")//(xpath = "//ion-col[14]/digital-text-box[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]") 
    	private WebElement FeeMaster_Remark1;
        public WebElement FeeMaster_Remark() {
    		return FeeMaster_Remark1;
    	}
        @FindBy(xpath = "//button[@icon='pi pi-save']") 
    	private WebElement FeeMaster_Save1;
        public WebElement FeeMaster_Save1() {
    		return FeeMaster_Save1;
    	}
        		
        @FindBy(xpath = "//button[@ng-reflect-text='Update']") 
    	private WebElement FeeMaster_Update1;
        public WebElement FeeMaster_Update() {
    		return FeeMaster_Update1;
    	}
        @FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]/span[1]") 
    	private WebElement FeeMaster_ActionIcon1;
        public WebElement FeeMaster_ActionIcon() {
    		return FeeMaster_ActionIcon1;
    	}
        @FindBy(xpath = "//ion-segment-button[@id='seg2']")//(xpath="//ion-label[text()='Tax']")//(xpath = "//ion-segment-button[@id='seg2']") 
    	private WebElement FeeMaster_TaxTab1;
        public WebElement FeeMaster_TaxTab() {
    		return FeeMaster_TaxTab1;
    	}
        
        ///***************************Charge Tax Master Details*******IS Displayed***************//
        @FindBy(xpath = "//div[text()='Available']") 
    	private WebElement FeeMaster_AvailableName1;
        public WebElement FeeMaster_AvailableName() {
    		return FeeMaster_AvailableName1;
    	}
        @FindBy(xpath = "//div[text()='Selected']") 
    	private WebElement FeeMaster_SelectedName1;
        public WebElement FeeMaster_SelectedName() {
    		return FeeMaster_SelectedName1;
    	}
        @FindBy(xpath = "//ion-label[text()='Status ']") 
    	private WebElement FeeMaster_StatusName1;
        public WebElement FeeMaster_StatusName() {
    		return FeeMaster_StatusName1;
    	}
        @FindBy(xpath = "//ion-label[text()=' Remarks ']") 
    	private WebElement FeeMaster_TaxTab_RemarksName1;
        public WebElement FeeMaster_TaxTab_RemarksName() {
    		return FeeMaster_TaxTab_RemarksName1;
    	}
        
        ///***************************Charge Tax Master Details*******************//
        
        @FindBy(xpath = "//div[text()=' GST ']") 
    	private WebElement FeeMaster_TaxTab_GST1;
        public WebElement FeeMaster_TaxTab_GST() {
    		return FeeMaster_TaxTab_GST1;
    	}
        @FindBy(xpath = "//ion-col[1]/kub-picklist[1]/div[1]/ion-item[1]/p-picklist[1]/div[1]/div[3]/button[1]/span[1]") 
    	private WebElement FeeMaster_TaxTab_AvailableClick1;
        public WebElement FeeMaster_TaxTab_AvailableClick() {
    		return FeeMaster_TaxTab_AvailableClick1;
    	}
        @FindBy(xpath = "//ion-col[3]/digital-text-box[1]/ion-item[1]/ion-textarea[1]/div[1]/textarea[1]") 
    	private WebElement FeeMaster_TaxTab_Remark1;
        public WebElement FeeMaster_TaxTab_Remark() {
    		return FeeMaster_TaxTab_Remark1;
    	}
        @FindBy(xpath = "//ion-col[1]/ion-card[1]/ion-card-content[1]/form[1]/ion-grid[1]/ion-row[2]/ion-col[2]/button[1]") 
    	private WebElement FeeMaster_TaxTab_Save1;
        public WebElement FeeMaster_TaxTab_Save() {
    		return FeeMaster_TaxTab_Save1;
    	}
        @FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-outline']") 
    	private WebElement FeeMaster_Inbox1;
        public WebElement FeeMaster_Inbox() {
    		return FeeMaster_Inbox1;
    	}
        @FindBy(xpath = "//ion-label[contains(text(),'Charge')]//ancestor::ion-segment//preceding-sibling::ion-buttons//child::ion-button") 
    	private WebElement FeeMaster_TaxBack1;
        public WebElement FeeMaster_TaxBack() {
    		return FeeMaster_TaxBack1;
    	}
        @FindBy(xpath = "//ion-label[text()='Fee master']//parent::ion-label//following-sibling::ion-buttons/ion-button[1]") 
    	private WebElement FeeMaster_TempViewButton1;
        public WebElement FeeMaster_TempViewButton() {
    		return FeeMaster_TempViewButton1;
    	}
        @FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]") 
    	private WebElement FeeMaster_TempViewPencil1;
        public WebElement FeeMaster_TempViewPencil() {
    		return FeeMaster_TempViewPencil1;
    	}
        @FindBy(xpath = "//ion-label[contains(text(),'Status')]//parent::div//following-sibling::ion-item//child::ion-toggle") 
    	private WebElement FeeMaster_Statusbutton1;
        public WebElement FeeMaster_Statusbutton() {
    		return FeeMaster_Statusbutton1;
    	}
        @FindBy(xpath = "//ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/button[1]") 
    	private WebElement FeeMaster_InboxActionIcon1;
        public WebElement FeeMaster_InboxActionIcon() {
    		return FeeMaster_InboxActionIcon1;
    	}
    
        @FindBy(xpath = "(//div[@role='alert'])[2]")//SavePopup
    	private WebElement FeeMaster_SavePopUp1;
        public WebElement FeeMaster_SavePopUp() {
    		return FeeMaster_SavePopUp1;
    	}
        @FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-outline']")//MessageInbox
    	private WebElement FeeMaster_MessageInbox1;
        public WebElement FeeMaster_MessageInbox() {
    		return FeeMaster_MessageInbox1;
    	}
        @FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]/span[1]")//actionIcon
    	private WebElement FeeMaster_ActionIconInbox1;
        public WebElement FeeMaster_ActionIconInbox() {
    		return FeeMaster_ActionIconInbox1;
    	}
        @FindBy(xpath = "//ion-icon[@ng-reflect-name='duplicate-outline']")
    	private WebElement FeeMaster_DescriptionAdd1;
        public WebElement FeeMaster_DescriptionAdd() {
    		return FeeMaster_DescriptionAdd1;
    	}
        @FindBy(xpath = "//ion-input[@ng-reflect-name='en']")
    	private WebElement FeeMaster_DescriptionEnglish1;
        public WebElement FeeMaster_DescriptionEnglish() {
    		return FeeMaster_DescriptionEnglish1;
    	}
        @FindBy(xpath = "//ion-input[@ng-reflect-name='fr']")
    	private WebElement FeeMaster_Descriptionfrench1;
        public WebElement FeeMaster_Descriptionfrench() {
    		return FeeMaster_Descriptionfrench1;
    	}
        @FindBy(xpath = "//ion-input[@ng-reflect-name='ge']")
    	private WebElement FeeMaster_DescriptionGerman1;
        public WebElement FeeMaster_DescriptionGerman() {
    		return FeeMaster_DescriptionGerman1;
    	}
        @FindBy(xpath = "//ion-input[@ng-reflect-name='ar']")
    	private WebElement FeeMaster_DescriptionArabic1;
        public WebElement FeeMaster_DescriptionArabic() {
    		return FeeMaster_DescriptionArabic1;
    	}
        @FindBy(xpath = "//ion-icon[@ng-reflect-name='checkmark-done-outline']")
    	private WebElement FeeMaster_Descriptiontick1;
        public WebElement FeeMaster_Descriptiontick() {
    		return FeeMaster_Descriptiontick1;
    	}
        @FindBy(xpath = "//ion-select[@ng-reflect-text='Module name']")
        private WebElement ModuleName1;
        public WebElement ModuleName() {
            return ModuleName1;
        }
        @FindBy(xpath = "//ion-label[text()='LOS']/following-sibling::ion-radio")
        private WebElement LOS;
        public WebElement LOS() {
            return LOS;
        }
        @FindBy(xpath = "//button/span[contains(text(),'Submit')]") 
        private WebElement BounceMasterMaker_Submit;
        public WebElement BounceMasterMaker_Submit() {
            return BounceMasterMaker_Submit;
        }

        @FindBy(xpath = "//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea") 
        private WebElement BounceMaster_EnterRemark;
        public WebElement BounceMaster_EnterRemark() {
            return BounceMaster_EnterRemark;
        }

        @FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
        private WebElement BounceMasterRemarkSubmit;
        public WebElement BounceMasterRemarkSubmit() {
        	return BounceMasterRemarkSubmit;
        }

        @FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") 
        private WebElement BounceMasterInbox;
        public WebElement BounceMasterInbox() {
            return BounceMasterInbox;
        }

        @FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]") 
        private WebElement BounceMasterInboxView_Search;
        public WebElement BounceMasterInboxView_Search() {
            return BounceMasterInboxView_Search;
        }  

        @FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input") 
        private WebElement BounceMasterInboxView_SearchText;
        public WebElement BounceMasterInboxView_SearchText() {
            return BounceMasterInboxView_SearchText;
        }  

        @FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]") 
        private WebElement BounceMasterReferanceId;
        public WebElement BounceMasterReferanceId() {
            return BounceMasterReferanceId;
        } 

        @FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']") 
        private WebElement BounceMaster_Checker_Id;
        public WebElement BounceMaster_Checker_Id() {
            return BounceMaster_Checker_Id;
        } 
        @FindBy(xpath="//ion-label[text()='Fee master']//following-sibling::ion-buttons//child::ion-button[1]")
    	private WebElement tempViewOfFeeMaster;
    	public WebElement tempViewOfFeeMaster() {
    		return tempViewOfFeeMaster;
    	}
    	@FindBy(xpath="//button[@ng-reflect-text='View Summary']/child::span[1]")
    	private WebElement viewSummaryIconOfBounceMaster;
    	public WebElement viewSummaryIconOfBounceMaster() {
    		return viewSummaryIconOfBounceMaster;
    	}
    	
    	@FindBy(xpath="//ionic-title[contains(text(),'  Transaction summary ')]")
    	private WebElement viewSummaryPageOfBounceMaster;
    	public WebElement viewSummaryPageOfBounceMaster() {
    		return viewSummaryPageOfBounceMaster;
    	}
}
