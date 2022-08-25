package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Living_Expenses_Obj {
	
	WebDriver driver;
	
	public Living_Expenses_Obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ion-label[contains(text(),'Other Masters')]")
	private WebElement Living_Exp_OtherMaster;
	public WebElement Living_Exp_OtherMaster(){
		return Living_Exp_OtherMaster;
	}
	
	@FindBy(xpath="//ion-label[text()='Living Expense']/parent::ion-item[1]//ion-button[1]")
	private WebElement Living_Exp_Tempview;
	public WebElement Living_Exp_Tempview(){
		return Living_Exp_Tempview;
	}
	
	@FindBy(xpath="//ion-label[text()='Living Expense']/parent::ion-item[1]//ion-button[2]")
	private WebElement Living_Exp_Listview;
	public WebElement Living_Exp_Listview(){
		return Living_Exp_Listview;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement Liv_Exp_Add_Icon;
	public WebElement Liv_Exp_Add_Icon() {
		return Liv_Exp_Add_Icon;
	}
	
	@FindBy(xpath = "//ion-label[contains(text(),'Description')]/parent::ion-item[1]/ion-textarea//textarea[1]")
	private WebElement Liv_Exp_Description;
	public WebElement Liv_Exp_Description() {
		return Liv_Exp_Description;
	}
	
	@FindBy(xpath = "//ion-label[contains(text(),'Description2')]/parent::ion-item[1]/ion-input[1]/input")
	private WebElement Liv_Exp_Description2;
	public WebElement Liv_Exp_Description2() {
		return Liv_Exp_Description2;
	}
	
	@FindBy(xpath = "//ion-label[contains(text(),'Description3')]/parent::ion-item[1]/ion-input[1]/input")
	private WebElement Liv_Exp_Description3;
	public WebElement Liv_Exp_Description3() {
		return Liv_Exp_Description3;
	}
	
	@FindBy(xpath = "//ion-select[@aria-label='Select,   Rule ']")
	private WebElement Liv_Exp_Rule;
	public WebElement Liv_Exp_Rule() {
		return Liv_Exp_Rule;
	}
	
	@FindBy(xpath = "//p-calendar//button")
	private WebElement Liv_Exp_EffectiveDate;
	public WebElement Liv_Exp_EffectiveDate() {
		return Liv_Exp_EffectiveDate;
	}
	
	@FindBy(xpath = "//button[starts-with(@class,'p-datepicker-year')]")
	private WebElement Liv_Exp_Year;
	public WebElement Liv_Exp_Year() {
		return Liv_Exp_Year;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Save']")
	private WebElement Liv_Exp_Save;
	public WebElement Liv_Exp_Save() {
		return Liv_Exp_Save;
	}
	
    @FindBy(xpath = "//button[@ng-reflect-text='Update']") 
    private WebElement Liv_Exp_Update;
    public WebElement Liv_Exp_Update() {
        return Liv_Exp_Update;
    }
	
    @FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]") 
    private WebElement Liv_Exp_Temp_Edit;
    public WebElement Liv_Exp_Temp_Edit() {
        return Liv_Exp_Temp_Edit;
    }  

    @FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[2]") 
    private WebElement Liv_Exp_Temp_view;
    public WebElement Liv_Exp_Temp_view() {
        return Liv_Exp_Temp_view;
    }
	// Living Expense Parameter    
  
    @FindBy(xpath = "//ion-label[text()='Living Expense Parameter']/parent::ion-segment-button") 
    private WebElement Liv_Exp_Living_Expense_Parameter;
    public WebElement Liv_Exp_Living_Expense_Parameter() {
        return Liv_Exp_Living_Expense_Parameter;
    } 
  
    @FindBy(xpath = "//ion-select[@aria-label=\"Select,  Code *\"]") 
    private WebElement Liv_Exp_Living_Expense_Parameter_Code;
    public WebElement Liv_Exp_Living_Expense_Parameter_Code() {
        return Liv_Exp_Living_Expense_Parameter_Code;
    } 
    
    @FindBy(xpath = "//ion-label[text()=' Value ']/parent::ion-item//input[1]") 
    private WebElement Liv_Exp_Living_Expense_Parameter_Value;
    public WebElement Liv_Exp_Living_Expense_Parameter_Value() {
        return Liv_Exp_Living_Expense_Parameter_Value;
    }
  
	
	
	
	
	
	
	
	
	
	
	
}
