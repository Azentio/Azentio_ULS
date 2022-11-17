package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trans_PolicyCheckObject {
	WebDriver driver;

	public Trans_PolicyCheckObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement PolicyCheck_Inbox1;
	public WebElement PolicyCheck_Inbox() {
		return PolicyCheck_Inbox1;
	}
	@FindBy(xpath = "//button[@ng-reflect-text='Search']")
	private WebElement PolicyCheck_SearchButton1;
	public WebElement PolicyCheck_SearchButton() {
		return PolicyCheck_SearchButton1;
	}
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement PolicyCheck_SearchText1;
	public WebElement PolicyCheck_SearchText() {
		return PolicyCheck_SearchText1;
	}
	@FindBy(xpath = "//span[text()='406']//parent::td/preceding-sibling::td/button")
	private WebElement PolicyCheck_ActionIcon1;
	public WebElement PolicyCheck_ActionIcon() {
		return PolicyCheck_ActionIcon1;
	}
	@FindBy(xpath = "//ion-segment-button[@id='seg9']")
	private WebElement PolicyCheck_PolicycheckTab1;
	public WebElement PolicyCheck_PolicycheckTab() {
		return PolicyCheck_PolicycheckTab1;
	}
	@FindBy(xpath = " //ion-title[text()=' Policy Check Summary ']")
	private WebElement PolicyCheck_PolicycheckSummary1;
	public WebElement PolicyCheck_PolicycheckSummary() {
		return PolicyCheck_PolicycheckSummary1;
	}
	@FindBy(xpath = "  //ion-title[text()=' Credit Policy ']")
	private WebElement PolicyCheck_CreditPolicy1;
	public WebElement PolicyCheck_CreditPolicy() {
		return PolicyCheck_CreditPolicy1;
	}
	@FindBy(xpath = "(//span[text()=' Execution Level '])[1]")
	private WebElement PolicyCheckSummary_ExecutionLeval1;
	public WebElement PolicyCheckSummary_ExecutionLeval() {
		return PolicyCheckSummary_ExecutionLeval1;
	}
	@FindBy(xpath = "//span[text()=' Policy Status ']")
	private WebElement PolicyCheckSummary_PolicyStatus1;
	public WebElement PolicyCheckSummary_PolicyStatus() {
		return PolicyCheckSummary_PolicyStatus1;
	}
	@FindBy(xpath = "(//span[text()=' Approval Level '])[1]")
	private WebElement PolicyCheckSummary_ApprovalLeval1;
	public WebElement PolicyCheckSummary_ApprovalLeval() {
		return PolicyCheckSummary_ApprovalLeval1;
	}
	@FindBy(xpath = "//span[text()=' Count ']")
	private WebElement PolicyCheckSummary_Count1;
	public WebElement PolicyCheckSummary_Count() {
		return PolicyCheckSummary_Count1;
	}
	@FindBy(xpath = "//span[text()=' Result Id ']")
	private WebElement CreditPolicy_ResultID1;
	public WebElement CreditPolicy_ResultID() {
		return CreditPolicy_ResultID1;
	}
	@FindBy(xpath = "//span[text()=' Policy ']")
	private WebElement CreditPolicy_Policy1;
	public WebElement CreditPolicy_Policy() {
		return CreditPolicy_Policy1;
	}
	@FindBy(xpath = "//span[text()=' Policy Level ']")
	private WebElement CreditPolicy_PolicyLevel1;
	public WebElement CreditPolicy_PolicyLevel() {
		return CreditPolicy_PolicyLevel1;
	}
	@FindBy(xpath = "(//span[text()=' Execution Level '])[2]")
	private WebElement CreditPolicy_ExecutionLevel1;
	public WebElement CreditPolicy_ExecutionLevel() {
		return CreditPolicy_ExecutionLevel1;
	}
	@FindBy(xpath = "//span[text()=' Customer Name ']")
	private WebElement CreditPolicy_CustomerName1;
	public WebElement CreditPolicy_CustomerName() {
		return CreditPolicy_CustomerName1;
	}
	@FindBy(xpath = "//span[text()=' Customer Type ']")
	private WebElement CreditPolicy_CustomerType1;
	public WebElement CreditPolicy_CustomerType() {
		return CreditPolicy_CustomerType1;
	}
	@FindBy(xpath = "//span[text()=' Result ']")
	private WebElement CreditPolicy_Result1;
	public WebElement CreditPolicy_Result() {
		return CreditPolicy_Result1;
	}
	@FindBy(xpath = "(//span[text()=' Approval Level '])[2]")
	private WebElement CreditPolicy_ApprovalLeval1;
	public WebElement CreditPolicy_ApprovalLeval() {
		return CreditPolicy_ApprovalLeval1;
	}
	@FindBy(xpath = "//span[text()=' Approved By ']")
	private WebElement CreditPolicy_ApprovedBy1;
	public WebElement CreditPolicy_ApprovedBy() {
		return CreditPolicy_ApprovedBy1;
	}
	@FindBy(xpath = "//span[text()=' Approval Type ']")
	private WebElement CreditPolicy_ApprovalType1;
	public WebElement CreditPolicy_ApprovalType() {
		return CreditPolicy_ApprovalType1;
	}
	@FindBy(xpath="(//span[text()='Export']/following-sibling::div/span)[2]")
	private WebElement exportIcon;
	public WebElement exportIcon() {
		return exportIcon;
	}	
	@FindBy(xpath="//li[@aria-label='PDF']")
	private WebElement exportToPDF;
	public WebElement exportToPDF() {
		return exportToPDF;
	}	
	@FindBy(xpath="//li[@aria-label='XLS']/span")
	private WebElement exportToExcel;
	public WebElement exportToExcel() {
		return exportToExcel;
}
	@FindBy(xpath="//kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]")
	private WebElement MatchedDatal;
	public WebElement MatchedData() {
		return MatchedDatal;
}

	@FindBy(xpath="(//button[@ng-reflect-text='Search'])[2]")
	private WebElement SearchButton2l;
	public WebElement SearchButton2() {
		return SearchButton2l;
}
	@FindBy(xpath="//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/input[1]")
	private WebElement Searchtext2l;
	public WebElement Searchtext2() {
		return Searchtext2l;
}
}