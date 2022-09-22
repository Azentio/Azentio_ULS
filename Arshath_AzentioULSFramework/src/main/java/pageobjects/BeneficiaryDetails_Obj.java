package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeneficiaryDetails_Obj {
    WebDriver driver;
    public BeneficiaryDetails_Obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//ListView PageObjects
	
	
	@FindBy(xpath = "//ion-segment//ion-label[text()='Beneficiary Details']/parent::ion-segment-button")
	private WebElement Beneficiary_Tab;
	public WebElement Beneficiary_Tab() {
		return Beneficiary_Tab;
	}
	
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement Beneficiary_Add;
	public WebElement Beneficiary_Add() {
		return Beneficiary_Add;
	}	
	
	
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement Beneficiary_Search;
	public WebElement Beneficiary_Search() {
		return Beneficiary_Search;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Beneficiary Type')]")
	private WebElement Beneficiary_Type;
	public WebElement Beneficiary_Type() {
		return Beneficiary_Type;
	}
	
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]//table[1]/tbody[1]/tr[1]/td[3]")
	private WebElement Beneficiary_Type_Listview;
	public WebElement Beneficiary_Type_Listview() {
		return Beneficiary_Type_Listview;
	}
	@FindBy(xpath = "//span[contains(text(),'Beneficiary Name')]")
	private WebElement Beneficiary_Name;
	public WebElement Beneficiary_Name() {
		return Beneficiary_Name;
	}
	
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]//table[1]/tbody[1]/tr[1]/td[4]")
	private WebElement Beneficiary_Name_ListView;
	public WebElement Beneficiary_Name_ListView() {
		return Beneficiary_Name_ListView;
	}
	@FindBy(xpath = "//span[contains(text(),'Bank Account Type')]")
	private WebElement Bank_Account_Type;
	public WebElement Bank_Account_Type() {
		return Bank_Account_Type;
	}
	
	@FindBy(xpath = "//span[contains(text(),'IBAN/Account No.')]")
	private WebElement IBAN_Account_No;
	public WebElement IBAN_Account_No() {
		return IBAN_Account_No;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Beneficiary Bank Name')]")
	private WebElement Beneficiary_Bank_Name;
	public WebElement Beneficiary_Bank_Name() {
		return Beneficiary_Bank_Name;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Branch Code')]")
	private WebElement Branch_Code;
	public WebElement Branch_Code() {
		return Branch_Code;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Bank Name')]")
	private WebElement Bank_Name;
	public WebElement Bank_Name() {
		return Bank_Name;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Beneficiary Bank')]")
	private WebElement Beneficiary_Bank;
	public WebElement Beneficiary_Bank() {
		return Beneficiary_Bank;
	}
	
	@FindBy(xpath="//ion-grid[1]/ion-row[1]/ion-col[1]//div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement Search_Input;
	public WebElement Search_Input()
	{ 
		return Search_Input;
	}
	@FindBy(xpath = "//input[@mode='ios']") 
    private WebElement Beneficiary_SearchText;
    public WebElement Beneficiary_SearchText() {
        return Beneficiary_SearchText;
    } 
    @FindBy(xpath = "//input[@mode='ios']/following-sibling::i") 
    private WebElement Beneficiary_SearchText_Close;
    public WebElement Beneficiary_SearchText_Close() {
        return Beneficiary_SearchText_Close;
    } 
	@FindBy(xpath="//tr[1]//td[text()=' DISBMKR ']/parent::tr//td[1]//button[1]")
	private WebElement Inbox_Edit;
	public WebElement Inbox_Edit()
	{ 
		return Inbox_Edit;
	}

	@FindBy(xpath = "//span[text()='Export']/following-sibling::div/span")
	private WebElement exportIcon;

	public WebElement exportIcon() {
		return exportIcon;
	}

	@FindBy(xpath = "//p-dropdownitem[@ng-reflect-label='PDF']//child::span")
	private WebElement pdfOption;

	public WebElement pdfOption() {
		return pdfOption;
	}

	@FindBy(xpath = "//p-dropdownitem[@ng-reflect-label='XLS']//child::span")
	private WebElement xlsOption;

	public WebElement xlsOption() {
		return xlsOption;
	}
	
}
