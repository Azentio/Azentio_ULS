package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sub_Product_Master_Obj {

	WebDriver driver;
	public Sub_Product_Master_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//***********Maker Stage***********//
	
	@FindBy(xpath="(//ion-title[contains(text(),'Subproduct Master')])[2]")
	private WebElement  Sub_Product;
	public WebElement  Sub_Product() {
		return  Sub_Product ;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement addIcon;
	public WebElement addIcon() {
		return addIcon;
	}
	@FindBy(xpath="//h4[text()='Product Setup']")
	private WebElement productSetup;
	public WebElement productSetup() {
		return productSetup;
	}
	@FindBy(xpath="//h4[text()='Sub Product Master']//parent::ion-label//following-sibling::ion-buttons//ion-button[1]")
	private WebElement subProductEditIcon;
	public WebElement subProductEditIcon() {
		return subProductEditIcon;
	}
	@FindBy(xpath="//h4[text()='Sub Product Master']//parent::ion-label//following-sibling::ion-buttons//ion-button[2]")
	private WebElement subProductViewIcon;
	public WebElement subProductViewIcon() {
		return subProductViewIcon;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Product Group *']")
	private WebElement productGroup;
	public WebElement productGroup() {
		return productGroup;
	}
	//ion-label[contains(text(),'Deposits')]
	@FindBy(xpath="//ion-select[@aria-label='Select,  Product Code *']")
	private WebElement productCode;
	public WebElement productCode() {
		return productCode;
	}
	//ion-label[contains(text(),' APL ')]
	@FindBy(xpath="//ion-label[contains(text(),'Product Description')]//following-sibling::ion-input//input")
	private WebElement productDescription;
	public WebElement productDescription() {
		return productDescription;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Retail/Corporate')]//following-sibling::ion-input//input")
	private WebElement retailOrCorporate;
	public WebElement retailOrCorporate() {
		return retailOrCorporate;
	} 
	@FindBy(xpath="//ion-label[contains(text(),'Subproduct Code')]//following-sibling::ion-input//input")
	private WebElement subProductCode;
	public WebElement subProductCode() {
		return subProductCode;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Subproduct Description ')]//following-sibling::ion-input//input")
	private WebElement subProductDescription;
	public WebElement subProductDescription() {
		return subProductDescription;
	} 
    @FindBy(xpath="//ion-select[@aria-label='Select,  Facility Type *']")
    private WebElement facilityType;
    public WebElement facilityType() {
    	return facilityType;
    }
  //ion-label[text()=' Loan ']
    @FindBy(xpath="//ion-select[@aria-label='Select,  Individual/Corporate ']")
    private WebElement individualCorporate;
    public WebElement individualCorporate() {
    	return individualCorporate;
    }
  //ion-label[contains(text(),'Individual')]
    @FindBy(xpath="//ion-select[@aria-label='Select,  Loan Purpose ']")
    private WebElement loanPurpose;
    public WebElement loanPurpose() {
    	return loanPurpose;
    }
  //ion-label[contains(text(),'Construction Finance')]
    @FindBy(xpath="//ion-select[@aria-label='Select,  Installment Based ']")
    private WebElement installmentBased;
    public WebElement installmentBased() {
    	return installmentBased;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Continue Existing Loan Number ']")
    private WebElement continueExistingLoanNumber;
    public WebElement continueExistingLoanNumber() {
    	return continueExistingLoanNumber;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Financing Concept ']")
    private WebElement financialConcept;
    public WebElement financialConcept() {
    	return financialConcept;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Disbursement Locking ']")
    private WebElement disbursementLocking;
    public WebElement disbursementLocking() {
    	return disbursementLocking;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Top Up Allowed ']")
    private WebElement topUpAllowed;
    public WebElement topUpAllowed() {
    	return topUpAllowed;
    }
    
    //-------------1--------------------//
	@FindBy(xpath="(//ion-label[contains(text(),' Product ')])[1]")
	private WebElement  Sub_Product_Product;
	public WebElement  Sub_Product_Product() {
		return  Sub_Product_Product ;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'Subproduct Definition')]")
	private WebElement  Sub_Product_Subproduct_Definition;
	public WebElement  Sub_Product_Subproduct_Definition() {
		return  Sub_Product_Subproduct_Definition ;
	}	
	
	@FindBy(xpath="(//ion-label[contains(text(),'Facility')])[1]")
	private WebElement  Sub_Product_Facility;
	public WebElement  Sub_Product_Facility() {
		return  Sub_Product_Facility ;
	}			
	@FindBy(xpath="//ion-label[contains(text(),'Asset Financed')]")
	private WebElement  Sub_Product_Asset_Financed;
	public WebElement  Sub_Product_Asset_Financed() {
		return  Sub_Product_Asset_Financed ;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Collateralized ']")
	private WebElement Sub_Product_Collateralized;
	public WebElement Sub_Product_Collateralized() {
		return Sub_Product_Collateralized;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Finance Against Existing Asset ']")
	private WebElement Sub_Product_Finance_Against_Existing_Asset;
	public WebElement Sub_Product_Finance_Against_Existing_Asset() {
		return Sub_Product_Finance_Against_Existing_Asset;
	} 
	@FindBy(xpath="//ion-select[@aria-label='Select,  Is Multi Asset Finance Allowed ']")
	private WebElement Sub_Product_Multi_Asset_Finance_Allowed;
	public WebElement Sub_Product_Multi_Asset_Finance_Allowed() {
		return Sub_Product_Multi_Asset_Finance_Allowed;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Floating Rate')]")
	private WebElement Sub_Product_Floating_Rate;
	public WebElement Sub_Product_Floating_Rate() {
		return Sub_Product_Floating_Rate;
	}	
	@FindBy(xpath="//ion-select[@aria-label='Select,  Impact On ']")
	private WebElement Sub_Product_ImpactOn;
	public WebElement Sub_Product_ImpactOn() {
		return Sub_Product_ImpactOn;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Reset Logic ']")
	private WebElement Sub_Product_ResetLogic;
	public WebElement Sub_Product_ResetLogic() {
		return Sub_Product_ResetLogic;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Float Rate Effective Date ']")
	private WebElement Sub_Product_Float_Rate_Effective_Date;
	public WebElement Sub_Product_Float_Rate_Effective_Date() {
		return Sub_Product_Float_Rate_Effective_Date;
	}	
	@FindBy(xpath="//ion-select[@aria-label='Select,  Float Rate Effective Frequency ']")
	private WebElement Sub_Product_Float_Rate_Effective_Frequency;
	public WebElement Sub_Product_Float_Rate_Effective_Frequency() {
		return Sub_Product_Float_Rate_Effective_Frequency;
	}	
	@FindBy(xpath="//ion-col[27]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Sub_Product_EMI_Cap;
	public WebElement Sub_Product_EMI_Cap() {
		return Sub_Product_EMI_Cap;
	}
	@FindBy(xpath="//ion-col[28]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Sub_Product_tenorTolerance;
	public WebElement Sub_Product_tenorTolerance() {
		return Sub_Product_tenorTolerance;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Legacy Codes')]")
	private WebElement Sub_Product_Legacy_Codes;
	public WebElement Sub_Product_Legacy_Codes() {
		return Sub_Product_Legacy_Codes;
	}	
	@FindBy(xpath="//ion-col[30]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Sub_Product_Legacy_Codes1;
	public WebElement Sub_Product_Legacy_Codes1() {
		return Sub_Product_Legacy_Codes1;
	}
	@FindBy(xpath="//ion-col[31]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Sub_Product_Legacy_Codes2;
	public WebElement Sub_Product_Legacy_Codes2() {
		return Sub_Product_Legacy_Codes2;
	}
	@FindBy(xpath="//ion-col[32]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Sub_Product_DM_Code;
	public WebElement Sub_Product_DM_Code() {
		return Sub_Product_DM_Code;
	}
	@FindBy(xpath="//ion-col[33]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement Sub_Product_Alloation_Sequence_Number;
	public WebElement Sub_Product_Alloation_Sequence_Number() {
		return Sub_Product_Alloation_Sequence_Number;
	}
    @FindBy(xpath = "//button[@ng-reflect-text='Save']") 
    private WebElement Sub_Product_Product_Save;
    public WebElement Sub_Product_Product_Save() {
        return Sub_Product_Product_Save;
    }  
    @FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]") 
    private WebElement Sub_Product_TempView_Edit;
    public WebElement Sub_Product_TempView_Edit() {
        return Sub_Product_TempView_Edit;
    }
    @FindBy(xpath = "//ion-icon[@aria-label='mail outline']") 
    private WebElement Sub_Product_Inbox;
    public WebElement Sub_Product_Inbox() {
        return Sub_Product_Inbox;
    }  
    @FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]") 
    private WebElement Sub_Product_ReferanceId;
    public WebElement Sub_Producr_Product_ReferanceId() {
        return Sub_Product_ReferanceId;
    }  
    @FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]") 
    private WebElement Sub_Product_Action;
    public WebElement Sub_Product_Action() {
        return Sub_Product_Action;
    }   
    @FindBy(xpath = "//ion-col[34]/digital-radio-button[1]/ion-item[1]/ion-toggle[1]") 
    private WebElement Sub_Product_Status;
    public WebElement Sub_Product_Status() {
        return Sub_Product_Status;
    }
    @FindBy(xpath = "//button/span[contains(text(),'Submit')]") 
    private WebElement Subproduct_Submit;
    public WebElement Subproduct_Submit() {
        return Subproduct_Submit;
    }
    @FindBy(xpath = "//button/span[contains(text(),'Cancel')]") 
    private WebElement Subproduct_Cancel;
    public WebElement Subproduct_Cancel() {
        return Subproduct_Cancel;
    }  
    @FindBy(xpath = "//button[@ng-reflect-text='View Summary']") 
    private WebElement Subproduct_ViewSummary;
    public WebElement Subproduct_ViewSummary() {
        return Subproduct_ViewSummary;
    }   
    @FindBy(xpath = "//ion-label[contains(text(),'new record')]") 
    private WebElement Subproduct_Submit_confirmation;
    public WebElement Subproduct_Submit_confirmation() {
        return Subproduct_Submit_confirmation;
    }  
    @FindBy(xpath = "//button[@ng-reflect-label='Submit']/span[2]") 
    private WebElement Subproduct_Maker_Submit;
    public WebElement Subproduct_Maker_Submit() {
        return Subproduct_Maker_Submit;
    }
  
    @FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']") 
    private WebElement Subproduct_SaveSuccess_alert;
    public WebElement Subproduct_SaveSuccess_alert() {
        return Subproduct_SaveSuccess_alert;
    }
    
    @FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']") 
    private WebElement Subproduct_Checker_Id;
    public WebElement Subproduct_Checker_Id() {
        return Subproduct_Checker_Id;
    } 
    @FindBy(xpath = "//div[1]/div[1]/div[1]/div[3]/span[1]/button[1]") 
    private WebElement Subproduct_TempView_Search;
    public WebElement Subproduct_TempView_Search() {
        return Subproduct_TempView_Search;
    }
    @FindBy(xpath = "//button[@ng-reflect-text='Go Back']") 
    private WebElement Subproduct_Back;
    public WebElement Subproduct_Back() {
        return Subproduct_Back;
    }   
    @FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]") 
    private WebElement Subproduct_InboxView_Search;
    public WebElement Subproduct_InboxView_Search() {
        return Subproduct_InboxView_Search;
    }  
    @FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]") 
    private WebElement Subproduct_InboxView_SearchText;
    public WebElement Subproduct_InboxView_SearchText() {
        return Subproduct_InboxView_SearchText;
    }  
    @FindBy(xpath = "//ion-textarea[1]/div[1]/textarea[1]") 
    private WebElement Subproduct_Maker_SubmitRemark;
    public WebElement Subproduct_Maker_SubmitRemark() {
        return Subproduct_Maker_SubmitRemark;
    }
    
    //------------------CHECKER STAGE PAGEOBJECTS----------------//
    
    @FindBy(xpath = "//ion-icon[@aria-label='menu']") 
    private WebElement Checker_toggle;
    public WebElement Checker_toggle() {
        return Checker_toggle;
    } 
  
    @FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']/ion-icon[1]") 
    private WebElement Checker_Inbox;
    public WebElement Checker_Inbox() {
        return Checker_Inbox;
    }
  
    @FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]") 
    private WebElement Checker_Approve;
    public WebElement Checker_Approve() {
        return Checker_Approve;
    }  
    @FindBy(xpath = "//ion-label[contains(text(),'approve')]") 
    private WebElement Checker_Alert_Approve;
    public WebElement Checker_Alert_Approve() {
        return Checker_Alert_Approve;
    }
  
    @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
    private WebElement Checker_Final_Approve;
    public WebElement Checker_Final_Approve() {
        return Checker_Final_Approve;
    }
    @FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]") 
    private WebElement Checker_Reject;
    public WebElement Checker_Reject() {
        return Checker_Reject;
    }
  
    @FindBy(xpath = "//ion-label[contains(text(),'cancel')]") 
    private WebElement Checker_Alert_Reject;
    public WebElement Checker_Alert_Reject() {
        return Checker_Alert_Reject;
    }
  
    @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
    private WebElement Checker_Final_Reject;
    public WebElement Checker_Final_Reject() {
        return Checker_Final_Reject;
    }
    @FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]") 
    private WebElement Checker_Return;
    public WebElement Checker_Return() {
        return Checker_Return;
    }
  
    @FindBy(xpath = "//ion-label[contains(text(),'return')]") 
    private WebElement Checker_Alert_Return;
    public WebElement Checker_Alert_Return() {
        return Checker_Alert_Return;
    }
 
    @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
    private WebElement Checker_Final_Return;
    public WebElement Checker_Final_Return() {
        return Checker_Final_Return;
    }  
    @FindBy(xpath = "//table[1]/tbody[1]/tr[2]/td[4]/p-celleditor[1]") 
    private WebElement Maker_Listview_Prdcode;
    public WebElement Maker_Listview_Prdcode() {
        return Maker_Listview_Prdcode;
    }
    
    @FindBy(xpath = "//table[1]/tbody[1]/tr[2]/td[6]/p-celleditor[1]") 
    private WebElement Maker_Listview_subPrdcode;
    public WebElement Maker_Listview_subPrdcode() {
        return Maker_Listview_subPrdcode;
    }
    
    //*******************ParaMeter*****************//
    
	@FindBy(xpath="//ion-segment-button[@id='seg5']")
    private WebElement Sub_Parameters;
	public WebElement Sub_Parameters()
	{
		return Sub_Parameters;
	}
    
	@FindBy(xpath="//ion-select[@aria-label='Select,  Loan Currency *']")
	private WebElement loanCurrency;
	public WebElement loanCurrency() 
	{
		return loanCurrency;
	}
	
	@FindBy(xpath="//ion-label[contains(text(),' INR ')]")
	private WebElement loanCurrencyINR;
	public WebElement loanCurrencyINR() 
	{
		return loanCurrencyINR;
	}
    
}
