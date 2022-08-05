package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Retail_Obj {

	WebDriver driver;
	public Product_Retail_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//------------------------MAKER STAGE PAGEOBJECTS----------------------//
	
	@FindBy(xpath="//ion-card-content[1]/ion-item[1]//ion-icon[1]")
	private WebElement Config_Manager;
	public WebElement Config_Manager() {
		return Config_Manager;
	}
    @FindBy(xpath = "//h4[contains(text(),'Product master')]/ancestor::ion-item//ion-button[2]") // ProductMaster Eye Icon
    private WebElement ProductMaster_EyeIcon;
    public WebElement ProductMaster_EyeIcon() {
        return ProductMaster_EyeIcon;
    }
    @FindBy(xpath = "//button[@ng-reflect-text='Add']") // Product Master Add Button
    private WebElement ProductMaster_AddButton;
    public WebElement ProductMaster_AddButton() {   
    	return ProductMaster_AddButton;
    }  
    @FindBy(xpath = "//ion-label[text()=' Product Group ']") // product group label
    private WebElement ProductMaster_ProductGroup_label;
    public WebElement ProductMaster_ProductGroup_label() {
        return ProductMaster_ProductGroup_label;
    }   
    @FindBy(xpath = "//ion-select[@aria-label='Select,  Product Group *']") // product group
    private WebElement ProductMaster_ProductGroup;
    public WebElement ProductMaster_ProductGroup() {
        return ProductMaster_ProductGroup;
    }    
    @FindBy(xpath = "//ion-label[text()=' Deposits ']") // product group
    private WebElement ProductMaster_ProductGroup_Deposits;
    public WebElement ProductMaster_ProductGroup_Deposits() {
        return ProductMaster_ProductGroup_Deposits;
    } 
    @FindBy(xpath = "//ion-label[text()=' Product Code ']") // product code label
    private WebElement ProductMaster_ProductCode_label;
    public WebElement ProductMaster_ProductCode_label() {
        return ProductMaster_ProductCode_label;
    }  
    @FindBy(xpath = "//ion-row[1]/ion-col[3]//ion-item[1]//ion-input[1]/input") // product code
    private WebElement ProductMaster_ProductCode;
    public WebElement ProductMaster_ProductCode() {
        return ProductMaster_ProductCode;
    }
    @FindBy(xpath = "//ion-label[text()=' Product Description ']") // product discription label
    private WebElement ProductMaster_ProductDescription_label;
    public WebElement ProductMaster_ProductDescription_label() {
        return ProductMaster_ProductDescription_label;
    }
    @FindBy(xpath = "//ion-row[1]/ion-col[4]//ion-item[1]//ion-input[1]/input") // product discription
    private WebElement ProductMaster_ProductDescription ;
    public WebElement ProductMaster_ProductDescription() {
        return ProductMaster_ProductDescription;
    }  
    @FindBy(xpath = "//ion-label[text()=' Retail/Corporate ']") // retail // Corparate label
    private WebElement ProductMaster_RetailCorprate_label;
    public WebElement ProductMaster_RetailCorprate_label() {
    	return ProductMaster_RetailCorprate_label;
    }
    @FindBy(xpath = "//ion-select[@aria-label='Select,  Retail/Corporate *']") // retail // Corparate
    private WebElement ProductMaster_RetailCorprate;
    public WebElement ProductMaster_RetailCorprate() {
    	return ProductMaster_RetailCorprate;
    } 
    @FindBy(xpath = "//ion-label[text()=' Retail ']/parent::ion-item/ion-radio") // 
    private WebElement ProductMaster_RetailCorprate_Drpdown;
    public WebElement ProductMaster_RetailCorprate_Drpdown() {
    	return ProductMaster_RetailCorprate_Drpdown;
    }  
    @FindBy(xpath = "//ion-label[text()=' DM Code ']") 
    private WebElement ProductMaster_Product_DMCode_label;
    public WebElement ProductMaster_Product_DMCode_label() {
        return ProductMaster_Product_DMCode_label;
    }  
    @FindBy(xpath = "//ion-row[1]/ion-col[6]//ion-item[1]//ion-input[1]/input") 
    private WebElement ProductMaster_Product_DMCode;
    public WebElement ProductMaster_Product_DMCode() {
        return ProductMaster_Product_DMCode;
    }   
    @FindBy(xpath = "//ion-label[text()=' Remarks ']") 
    private WebElement ProductMaster_Product_Remark_label;
    public WebElement ProductMaster_Product_Remark_label() {
        return ProductMaster_Product_Remark_label;
    }
    @FindBy(xpath = "//ion-textarea[1]//textarea[1]") 
    private WebElement ProductMaster_Product_Remark;
    public WebElement ProductMaster_Product_Remark() {
        return ProductMaster_Product_Remark;
    } 
    
    @FindBy(xpath = "//button[@ng-reflect-text='Save']") 
    private WebElement ProductMaster_Product_Save;
    public WebElement ProductMaster_Product_Save() {
        return ProductMaster_Product_Save;
    } 
    @FindBy(xpath = "//button[@ng-reflect-text='Go Back']") 
    private WebElement ProductMaster_Product_Back;
    public WebElement ProductMaster_Product_Back() {
        return ProductMaster_Product_Back;
    }  
    @FindBy(xpath = "//div[1]//tbody[1]/tr[1]/td[1]//button[1]") 
    private WebElement ProductMaster_Product_Edit;
    public WebElement ProductMaster_Product_Edit() {
        return ProductMaster_Product_Edit;
    }  
    @FindBy(xpath = "//div[1]/div[1]/div[1]/div[3]/span[1]/button[1]") 
    private WebElement ProductMaster_Product_Search;
    public WebElement ProductMaster_Product_Search() {
        return ProductMaster_Product_Search;
    }  
    @FindBy(xpath = "//ion-icon[@aria-label='mail outline']") 
    private WebElement ProductMaster_Product_Inbox;
    public WebElement ProductMaster_Product_Inbox() {
        return ProductMaster_Product_Inbox;
    }  
    @FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]/span[1]") 
    private WebElement ProductMaster_Product_ReferanceId;
    public WebElement ProductMaster_Product_ReferanceId() {
        return ProductMaster_Product_ReferanceId;
    }  
    @FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]") 
    private WebElement ProductMaster_Product_Action;
    public WebElement ProductMaster_Product_Action() {
        return ProductMaster_Product_Action;
    }  
    @FindBy(xpath = "//button/span[contains(text(),'Submit')]") 
    private WebElement ProductMaster_Product_Submit;
    public WebElement ProductMaster_Product_Submit() {
        return ProductMaster_Product_Submit;
    }
    @FindBy(xpath = "//button/span[contains(text(),'Cancel')]") 
    private WebElement ProductMaster_Product_Cancel;
    public WebElement ProductMaster_Product_Cancel() {
        return ProductMaster_Product_Cancel;
    }  
    @FindBy(xpath = "//button[@ng-reflect-text='View Summary']") 
    private WebElement ProductMaster_Product_ViewSummary;
    public WebElement ProductMaster_Product_ViewSummary() {
        return ProductMaster_Product_ViewSummary;
    }   
    @FindBy(xpath = "//ion-label[contains(text(),'new record')]") 
    private WebElement ProductMaster_Product_Submit_confirmation;
    public WebElement ProductMaster_Product_Submit_confirmation() {
        return ProductMaster_Product_Submit_confirmation;
    }  
    @FindBy(xpath = "//button[@ng-reflect-label='Submit']/span[2]") 
    private WebElement ProductMaster_Product_Maker_Submit;
    public WebElement ProductMaster_Product_Maker_Submit() {
        return ProductMaster_Product_Maker_Submit;
    }  
    @FindBy(xpath = "//div[@id='toast-container']/div[1]") 
    private WebElement ProductMaster_Product_Checker_Id;
    public WebElement ProductMaster_Product_Checker_Id() {
        return ProductMaster_Product_Checker_Id;
    }  
    @FindBy(xpath = "//ion-item[1]/ion-toggle[1]") 
    private WebElement ProductMaster_Product_Status;
    public WebElement ProductMaster_Product_Status() {
        return ProductMaster_Product_Status;
    }  
    @FindBy(xpath = "//div[4]/p-dropdown[1]/div[1]/div[2]") 
    private WebElement ProductMaster_Product_Export;
    public WebElement ProductMaster_Product_Export() {
        return ProductMaster_Product_Export;
    }
    @FindBy(xpath = " //li[@aria-label='XLS']") //PDF 
    private WebElement ProductMaster_Product_File;
    public WebElement ProductMaster_Product_File() {
        return ProductMaster_Product_File;
    }
    
    //------------------CHECKER STAGE PAGEOBJECTS----------------//
  
    @FindBy(xpath = "//ion-header/ion-toolbar[1]/ion-menu-toggle[1]") 
    private WebElement ProductMaster_Product_Checker_toggle;
    public WebElement ProductMaster_Product_Checker_toggle() {
        return ProductMaster_Product_Checker_toggle;
    } 
  
    @FindBy(xpath = "//ion-item[@ng-reflect-text='Inbox']/ion-icon[1]") 
    private WebElement ProductMaster_Product_Checker_Inbox;
    public WebElement ProductMaster_Product_Checker_Inbox() {
        return ProductMaster_Product_Checker_Inbox;
    }
  
    @FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]") 
    private WebElement ProductMaster_Product_Checker_Approve;
    public WebElement ProductMaster_Product_Checker_Approve() {
        return ProductMaster_Product_Checker_Approve;
    }
  
    @FindBy(xpath = "//button[@label='Reject']/span[contains(text(),'Reject')]") 
    private WebElement ProductMaster_Product_Checker_Reject;
    public WebElement ProductMaster_Product_Checker_Reject() {
        return ProductMaster_Product_Checker_Reject;
    }
  
    @FindBy(xpath = "//button[@label='Return']/span[contains(text(),'Return')]") 
    private WebElement ProductMaster_Product_Checker_Return;
    public WebElement ProductMaster_Product_Checker_Return() {
        return ProductMaster_Product_Checker_Return;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}