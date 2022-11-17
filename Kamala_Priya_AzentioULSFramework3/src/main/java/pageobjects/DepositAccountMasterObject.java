package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositAccountMasterObject {
	WebDriver driver;   
	 public DepositAccountMasterObject(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	 @FindBy(xpath="//span[text()='Configurations']//following-sibling::ion-icon")
	 private WebElement DepositAccount_Configurations1;
	 public WebElement DepositAccount_Configurations(){
		 return DepositAccount_Configurations1;
	 }
	 
	 @FindBy(xpath="//ion-label[text()='Deposit Account Master	']//parent::ion-label//following-sibling::ion-buttons/ion-button[2]")
	 private WebElement DepositAccount_EyeIcon1;
	 public WebElement DepositAccount_EyeIcon(){
		 return DepositAccount_EyeIcon1;
	 }
	 @FindBy(xpath="//ion-label[text()='Deposit Account Master	']//parent::ion-label//following-sibling::ion-buttons/ion-button[1]")
	 private WebElement DepositAccount_TempViewButton1;
	 public WebElement DepositAccount_TempViewButton(){
		 return DepositAccount_TempViewButton1;
	 }
	 @FindBy(xpath="//button[@ng-reflect-icon='pi pi-plus']")
	 private WebElement DepositAccount_AddButton1;
	 public WebElement DepositAccount_AddButton(){
		 return DepositAccount_AddButton1;
	 }
	 @FindBy(xpath="//ion-select[@aria-label='Select,  Bank Name *']")
	 private WebElement DepositAccount_BankNameDropDown1;
	 public WebElement DepositAccount_BankNameDropDown(){
		 return DepositAccount_BankNameDropDown1;
	 }
	 @FindBy(xpath="//ion-select[@aria-label='Select,  Branch Name *']")
	 private WebElement DepositAccount_BranchNameDropDown1;
	 public WebElement DepositAccount_BranchNameDropDown(){
		 return DepositAccount_BranchNameDropDown1;
	 }
	 @FindBy(xpath="//ion-select[@aria-label='Select,  Account Type *']")
	 private WebElement DepositAccount_AccountTypeDropDown1;
	 public WebElement DepositAccount_AccountTypeDropDown(){
		 return DepositAccount_AccountTypeDropDown1;
	 }
	 @FindBy(xpath="//ion-label[text()=' Account Number ']//following-sibling::ion-input/input")
	 private WebElement DepositAccount_AccountNumber1;
	 public WebElement DepositAccount_AccountNumber(){
		 return DepositAccount_AccountNumber1;
	 }
	 @FindBy(xpath="//ion-select[@aria-label='Select,  Account Currency *']")
	 private WebElement DepositAccount_AccountCurrencyDropDown1;
	 public WebElement DepositAccount_AccountCurrencyDropDown(){
		 return DepositAccount_AccountCurrencyDropDown1;
	 }
	 @FindBy(xpath="//ion-select[@aria-label='Select,  Payment Account Indicator *']")
	 private WebElement DepositAccount_PaymentAccountIndicatorDropDown1;
	 public WebElement DepositAccount_PaymentAccountIndicatorDropDown(){
		 return DepositAccount_PaymentAccountIndicatorDropDown1;
	 }
	 @FindBy(xpath="//ion-select[@aria-label='Select,  Chart Of Account Mapping Type *']")
	 private WebElement DepositAccount_ChartOfAccountMapingDropDown1;
	 public WebElement DepositAccount_ChartOfAccountMapingDropDown(){
		 return DepositAccount_ChartOfAccountMapingDropDown1;
	 }
	 @FindBy(xpath="//ion-select[@aria-label='Select,  Account Status *']")
	 private WebElement DepositAccount_AccountStatusDropDown1;
	 public WebElement DepositAccount_AccountStatusDropDown(){
		 return DepositAccount_AccountStatusDropDown1;
	 }
	 @FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	 private WebElement DepositAccount_Save1;
	 public WebElement DepositAccount_Save(){
		 return DepositAccount_Save1;
	 }
	 @FindBy(xpath="//ion-segment-button[@id='seg2']")
	 private WebElement DepositAccount_BranchMapingTab1;
	 public WebElement DepositAccount_BranchMapingTab(){
		 return DepositAccount_BranchMapingTab1;
	 }
	 @FindBy(xpath="//div[text()='Available']")
	 private WebElement DepositAccount_BranchMaping_Available1;
	 public WebElement DepositAccount_BranchMaping_Available(){
		 return DepositAccount_BranchMaping_Available1;
	 }
	 @FindBy(xpath="//div[text()='Selected']")
	 private WebElement DepositAccount_BranchMaping_Selected1;
	 public WebElement DepositAccount_BranchMaping_Selected(){
		 return DepositAccount_BranchMaping_Selected1;
	 }
	 @FindBy(xpath="//ion-col[1]/kub-picklist[1]/div[1]/ion-item[1]/p-picklist[1]/div[1]/div[3]/button[1]")
	 private WebElement DepositAccount_BranchMaping_AvailableTOSelected1;
	 public WebElement DepositAccount_BranchMaping_AvailableTOSelected(){
		 return DepositAccount_BranchMaping_AvailableTOSelected1;
	 }
	 @FindBy(xpath="//button[@ng-reflect-icon='pi pi-save']")
	 private WebElement DepositAccount_BranchMapingSave1;
	 public WebElement DepositAccount_BranchMapingSave(){
		 return DepositAccount_BranchMapingSave1;
}
	 @FindBy(xpath="(//button[@ng-reflect-text='Edit'])[1]")
	 private WebElement DepositAccount_PencilButton1;
	 public WebElement DepositAccount_PencilButton(){
		 return DepositAccount_PencilButton1;
}
	 @FindBy(xpath="//ion-icon[@ng-reflect-name='mail-unread-outline']")
	 private WebElement DepositAccount_Inbox1;
	 public WebElement DepositAccount_Inbox(){
		 return DepositAccount_Inbox1;
}
	 @FindBy(xpath="(//button[@ng-reflect-text='Search'])[2]")
	 private WebElement DepositAccount_SeachButton1;
	 public WebElement DepositAccount_SeachButton(){
		 return DepositAccount_SeachButton1;
}
	 @FindBy(xpath="//button[@ng-reflect-text='Search']")
	 private WebElement DepositAccount_CheckerSeachButton1;
	 public WebElement DepositAccount_CheckerSeachButton(){
		 return DepositAccount_CheckerSeachButton1;
}
	 @FindBy(xpath="(//button[@ng-reflect-text='Entitle'])[1]")
	 private WebElement DepositAccount_ActionIcon1;
	 public WebElement DepositAccount_ActionIcon(){
		 return DepositAccount_ActionIcon1;
}
	 @FindBy(xpath="//span[contains(text(),'Submit')]")
	 private WebElement DepositAccount_SubmitButton1;
	 public WebElement DepositAccount_SubmitButton(){
		 return DepositAccount_SubmitButton1;
}
	 @FindBy(xpath="//ion-label[contains(text(),'ok')]")
	 private WebElement DepositAccount_SubmitOKButton1;
	 public WebElement DepositAccount_SubmitOKButton(){
		 return DepositAccount_SubmitOKButton1;
}
	 @FindBy(xpath="(//span[text()='Submit'])[2]")
	 private WebElement DepositAccount_FinalSubmitButton1;
	 public WebElement DepositAccount_FinalSubmitButton(){
		 return DepositAccount_FinalSubmitButton1;
}
	 @FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	 private WebElement DepositAccount_BackButton1;
	 public WebElement DepositAccount_BackButton(){
		 return DepositAccount_BackButton1;
}
	 @FindBy(xpath="//div[@id='toast-container']//div[@role='alert']")
	 private WebElement DepositAccount_PopUp1;
	 public WebElement DepositAccount_PopUp(){
		 return DepositAccount_PopUp1;
}
	 @FindBy(xpath="//ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
	 private WebElement DepositAccount_SearchText1;
	 public WebElement DepositAccount_SearchText(){
		 return DepositAccount_SearchText1;
	 }
	 @FindBy(xpath="//span[text()=' Inbox ']//parent::div//child::span[2]/input")
	 private WebElement DepositAccount_CheckerSearchText1;
	 public WebElement DepositAccount_CheckerSearchText(){
		 return DepositAccount_CheckerSearchText1;
	 }
	 @FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[2]/span[1]")
	 private WebElement DepositAccount_GetRefId1;
	 public WebElement DepositAccount_GetRefId(){
		 return DepositAccount_GetRefId1;
}
	 //@FindBy(xpath = "//div[@id='toast-container']//div[@role='alert']")
	 //private WebElement DepositAccount_CheckerId1;
	 //public WebElement DepositAccount_CheckerId(){
		// return DepositAccount_CheckerId1;
		 @FindBy(xpath="//div[@id='toast-container']//div[contains(text(),'Record APPROVED Successfully')]")
		 private WebElement DepositAccount_CheckerId1;
		 public WebElement DepositAccount_CheckerId(){
		 	 return DepositAccount_CheckerId1;
}
		 @FindBy(xpath="//div[@id='toast-container']//div[contains(text(),'Record REJECTED Successfully')]")
		 private WebElement DepositAccount_CheckerReject1;
		 public WebElement DepositAccount_CheckerIDReject(){
		 	 return DepositAccount_CheckerReject1;
}
		 @FindBy(xpath="//div[@id='toast-container']//div[@role='alert']")
		 private WebElement DepositAccount_CheckerIDReturn1;
		 public WebElement DepositAccount_CheckerIDReturn(){
		 	 return DepositAccount_CheckerIDReturn1;
}
	 //****************Checker Stage*****************************//
	 @FindBy(xpath = "//ion-icon[@aria-label='menu']")
	 private WebElement DepositAccount_Menu1;
	 public WebElement DepositAccount_Menu(){
		 return DepositAccount_Menu1;
}
	 @FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")  //ion-icon[@aria-label='mail unread outline']
	 private WebElement DepositAccount_CheckerInbox1;
	 public WebElement DepositAccount_CheckerInbox(){
		 return DepositAccount_CheckerInbox1;
}
	 @FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]")
	 private WebElement DepositAccount_CheckerApproveButton1;
	 public WebElement DepositAccount_CheckerApproveButton(){
		 return DepositAccount_CheckerApproveButton1;
}
	 @FindBy(xpath = "//ion-label[contains(text(),'approve')]")
	 private WebElement DepositAccount_CheckerAlertApprove1;
	 public WebElement DepositAccount_CheckerAlertApprove(){
		 return DepositAccount_CheckerAlertApprove1;
}
	 @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
	 private WebElement DepositAccount_CheckerFinalApprove1;
	 public WebElement DepositAccount_CheckerFinalApprove(){
		 return DepositAccount_CheckerFinalApprove1;
}
	 @FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]")
	 private WebElement DepositAccount_CheckerRejectButton1;
	 public WebElement DepositAccount_CheckerRejectButton(){
		 return DepositAccount_CheckerRejectButton1;
}
	 @FindBy(xpath = "//ion-label[contains(text(),'cancel')]") 
	 private WebElement DepositAccount_CheckerAlertReject1;
	 public WebElement DepositAccount_CheckerAlertReject(){
		 return DepositAccount_CheckerAlertReject1;
}
	 @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")  
	 private WebElement DepositAccount_CheckerFinalReject1;
	 public WebElement DepositAccount_CheckerFinalReject(){
		 return DepositAccount_CheckerFinalReject1;
}


	    @FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]") 
	 private WebElement DepositAccount_CheckerReturnButton1;
	 public WebElement DepositAccount_CheckerReturnButton(){
		 return DepositAccount_CheckerReturnButton1;
}
	 @FindBy(xpath = "//ion-label[contains(text(),'return')]") 
	 private WebElement DepositAccount_CheckerAlertReturn1;
	 public WebElement DepositAccount_CheckerAlertReturn(){
		 return DepositAccount_CheckerAlertReturn1;
}
	 @FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]")   
	 private WebElement DepositAccount_CheckerFinalReturn1;
	 public WebElement DepositAccount_CheckerFinalReturn(){
		 return DepositAccount_CheckerFinalReturn1;
}
	 @FindBy(xpath = "//ion-label[text()=' Account Number ']//following-sibling::ion-input")   
	 private WebElement DepositAccount_AccountNumberValidation1;
	 public WebElement DepositAccount_AccountNumberValidation(){
		 return DepositAccount_AccountNumberValidation1;
}
	 @FindBy(xpath = "//ion-select[@aria-label=' Collection ,  Account Type *']")   
	 private WebElement DepositAccount_AccountTypeModification1;
	 public WebElement DepositAccount_AccountTypeModification(){
		 return DepositAccount_AccountTypeModification1;
}
	 //*************Modification for Approved record************************//
	 @FindBy(xpath = "//ion-grid[2]/ion-row[1]/ion-col[3]/digital-select-layout[1]/ion-item[1]/ion-select[1]")   
	 private WebElement DepositAccount_ApprovedAccountTypeModification1;
	 public WebElement DepositAccount_ApprovedAccountTypeModification(){
		 return DepositAccount_ApprovedAccountTypeModification1;
}
	 @FindBy(xpath = "//button[@ng-reflect-text='Search']")   
	 private WebElement DepositAccount_ListViewSearch1;
	 public WebElement DepositAccount_ListViewSearch(){
		 return DepositAccount_ListViewSearch1;
}
	 @FindBy(xpath = "//input[@mode='ios']")   
	 private WebElement DepositAccount_ListViewSearchText1;
	 public WebElement DepositAccount_ListViewSearchText(){
		 return DepositAccount_ListViewSearchText1;
} 
	 @FindBy(xpath="//span[text()='Export']")
		private WebElement exportIcon;
		public WebElement exportIcon() {
			return exportIcon;
		}	
		@FindBy(xpath="//li[@aria-label='PDF']")
		private WebElement exportToPDF;
		public WebElement exportToPDF() {
			return exportToPDF;
		}	
		@FindBy(xpath="//li[@aria-label='XLS']")
		private WebElement exportToExcel;
		public WebElement exportToExcel() {
			return exportToExcel;
}
		 @FindBy(xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]/span[1]")   
		 private WebElement DepositAccount_ListViewMachedData1;
		 public WebElement DepositAccount_ListViewMachedData(){
			 return DepositAccount_ListViewMachedData1;
		 }
		 
		 //Modification
		 
		 @FindBy(xpath="//ion-label[text()=' Bank Name ']//following-sibling::ion-select")
		 private WebElement DepositAccount_Modification_BankName1;
		 public WebElement DepositAccount_Modification_BankName(){
			 return DepositAccount_Modification_BankName1;
		 }
		 @FindBy(xpath="//ion-label[text()=' Branch Name ']//following-sibling::ion-select")
		 private WebElement DepositAccount_Modification_BranchName1;
		 public WebElement DepositAccount_Modification_BranchName(){
			 return DepositAccount_Modification_BranchName1;
		 }
		 @FindBy(xpath="//ion-label[text()=' Account Type ']//following-sibling::ion-select")
		 private WebElement DepositAccount_Modification_AccountType1;
		 public WebElement DepositAccount_Modification_AccountType(){
			 return DepositAccount_Modification_AccountType1;
		 }
		}
