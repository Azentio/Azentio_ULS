package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetCollateralTypeObject {
		WebDriver driver;
		 public AssetCollateralTypeObject(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
		 @FindBy(xpath="//span[text()='Configurations']")
		 private WebElement AssetCollateralType_Configurations1;
		 public WebElement AssetCollateralType_Configurations(){
			 return AssetCollateralType_Configurations1;
		 }
		 @FindBy(xpath="//ion-label[text()='Asset Collateral Config']")
		 private WebElement AssetCollateralType_AssetCollateralConfig1;
		 public WebElement AssetCollateralType_AssetCollateralConfig(){
			 return AssetCollateralType_AssetCollateralConfig1;
		 }
		 
		 @FindBy(xpath="//ion-label[text()='Colleteral type']//parent::ion-label//following-sibling::ion-buttons/ion-button[2]")
		 private WebElement AssetCollateralType_EyeIcon1;
		 public WebElement AssetCollateralType_EyeIcon(){
			 return AssetCollateralType_EyeIcon1;
		 }
		 @FindBy(xpath="//ion-label[text()='Colleteral type']//parent::ion-label//following-sibling::ion-buttons/ion-button[1]")
		 private WebElement AssetCollateralType_TempView1;
		 public WebElement AssetCollateralType_TempView(){
			 return AssetCollateralType_TempView1;
		 }
		 @FindBy(xpath="//span[text()=' Action ']")
		 private WebElement AssetCollateralType_ListView_Action1;
		 public WebElement AssetCollateralType_ListView_Action(){
			 return AssetCollateralType_ListView_Action1;
		 }
		 @FindBy(xpath="//span[text()=' Asset/Collateral type Code ']")
		 private WebElement AssetCollateralType_ListView_Asset_CollateraltypeCode1;
		 public WebElement AssetCollateralType_ListView_Asset_CollateraltypeCode(){
			 return AssetCollateralType_ListView_Asset_CollateraltypeCode1;
		 }
		 @FindBy(xpath="//span[text()=' Description ']")
		 private WebElement AssetCollateralType_ListView_Description1;
		 public WebElement AssetCollateralType_ListView_Description(){
			 return AssetCollateralType_ListView_Description1;
		 }
		 @FindBy(xpath="//span[text()=' AssetCollateral Category Description ']")
		 private WebElement AssetCollateralType_ListView_AssetCollateralCategoryDescription1;
		 public WebElement AssetCollateralType_ListView_AssetCollateralCategoryDescription(){
			 return AssetCollateralType_ListView_AssetCollateralCategoryDescription1;
		 }
		 @FindBy(xpath="//span[text()=' Status ']")
		 private WebElement AssetCollateralType_ListView_Status1;
		 public WebElement AssetCollateralType_ListView_Status(){
			 return AssetCollateralType_ListView_Status1;
		 }
		 @FindBy(xpath="//span[text()=' Authorization Status ']")
		 private WebElement AssetCollateralType_ListView_AuthorizationStatus1;
		 public WebElement AssetCollateralType_ListView_AuthorizationStatus(){
			 return AssetCollateralType_ListView_AuthorizationStatus1;
		 }
		 @FindBy(xpath="//button[@ng-reflect-text='Search']")
		 private WebElement AssetCollateralType_ListView_Search1;
		 public WebElement AssetCollateralType_ListView_Search(){
			 return AssetCollateralType_ListView_Search1;
		 }
		 @FindBy(xpath="//span[text()='Export']")
		 private WebElement AssetCollateralType_ListView_Export1;
		 public WebElement AssetCollateralType_ListView_Export(){
			 return AssetCollateralType_ListView_Export1;
		 }
		 @FindBy(xpath="//button[@ng-reflect-text='Add']")
		 private WebElement AssetCollateralType_AddButton1;
		 public WebElement AssetCollateralType_AddButton(){
			 return AssetCollateralType_AddButton1;
		 }
		 @FindBy(xpath = "//button[@ng-reflect-text='Search']")   
		 private WebElement AssetCollateralType_ListViewSearch1;
		 public WebElement AssetCollateralType_ListViewSearch(){
			 return AssetCollateralType_ListViewSearch1;
	}
		 @FindBy(xpath = "//input[@mode='ios']")   
		 private WebElement AssetCollateralType_ListViewSearchText1;
		 public WebElement AssetCollateralType_ListViewSearchText(){
			 return AssetCollateralType_ListViewSearchText1;
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
			 private WebElement AssetCollateralType_ListViewMachedData1;
			 public WebElement AssetCollateralType_ListViewMachedData(){
				 return AssetCollateralType_ListViewMachedData1;
			 }
			 @FindBy(xpath = "//tbody/tr[1]/td[4]/p-celleditor[1]/span[1]")   
			 private WebElement AssetCollateralType_Description_WIP1;
			 public WebElement AssetCollateralType_Description_WIP(){
				 return AssetCollateralType_Description_WIP1;
			 }
			 @FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")   
			 private WebElement AssetCollateralType_Inbox1;
			 public WebElement AssetCollateralType_Inbox(){
				 return AssetCollateralType_Inbox1;
			 }
			
			 @FindBy(xpath="(//button[@ng-reflect-text='Search'])[2]")
			 private WebElement  AssetCollateralType_SeachButton1;
			 public WebElement  AssetCollateralType_SeachButton(){
				 return  AssetCollateralType_SeachButton1;
		}
			 
			 @FindBy(xpath="//span[text()=' Inbox ']//parent::div//child::span[2]/input")
			 private WebElement AssetCollateralType_SearchText1;
			 public WebElement AssetCollateralType_SearchText(){
				 return AssetCollateralType_SearchText1;
			 }
			 @FindBy(xpath="(//button[@ng-reflect-text='Entitle'])[1]")
			 private WebElement AssetCollateralType_ActionIcon1;
			 public WebElement AssetCollateralType_ActionIcon(){
				 return AssetCollateralType_ActionIcon1;
		}
			 @FindBy(xpath="//button[@ng-reflect-text='View Summary']")
			 private WebElement AssetCollateralType_ViewSummaryButton1;
			 public WebElement AssetCollateralType_ViewSummaryButton(){
				 return AssetCollateralType_ViewSummaryButton1;
		}
			 @FindBy(xpath="(//table//tr[1]//td[2])[3]")
			 private WebElement AssetCollateralType_UserID1;
			 public WebElement AssetCollateralType_UserID(){
				 return AssetCollateralType_UserID1;
		}
			 @FindBy(xpath="(//table//tr[1]//td[3])[3]")
			 private WebElement AssetCollateralType_StageCode1;
			 public WebElement AssetCollateralType_StageCode(){
				 return AssetCollateralType_StageCode1;
		}
			 @FindBy(xpath="(//table//tr[1]//td[4])[3]")
			 private WebElement AssetCollateralType_Status1;
			 public WebElement AssetCollateralType_Status(){
				 return AssetCollateralType_Status1;
		}
			 @FindBy(xpath="(//table//tr[1]//td[5])[3]")
			 private WebElement AssetCollateralType_StartTime1;
			 public WebElement AssetCollateralType_StartTime(){
				 return AssetCollateralType_StartTime1;
		}
			 @FindBy(xpath="(//table//tr[1]//td[6])[3]")
			 private WebElement AssetCollateralType_EndTime1;
			 public WebElement AssetCollateralType_EndTime(){
				 return AssetCollateralType_EndTime1;
		}
}