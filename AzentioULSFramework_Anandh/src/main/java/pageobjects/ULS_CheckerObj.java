package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_CheckerObj {
	WebDriver driver;
	public ULS_CheckerObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']")
	private WebElement checker_mailBox;

	public WebElement checkerMailBox() {
		return checker_mailBox;
	}

	@FindBy(xpath="//span[text()='Approve']/parent::button")
	private WebElement checker_ApproveButton;
	public WebElement checkerApproveButton()
	{
		return checker_ApproveButton;
	}
	@FindBy(xpath="//span[text()='Reject']/parent::button")
	private WebElement checker_RejectButton;
	public WebElement checkerRejectButton()
	{
		return checker_RejectButton;
	}
	@FindBy(xpath="//span[text()='Return']/parent::button")
	private WebElement checker_ReturnButton;
	public WebElement checkerReturnButton()
	{
		return checker_ReturnButton;
	}
	@FindBy(xpath="//ion-label[text()=' Please Enter Remarks ']//parent::ion-item//ion-textarea//textarea")
	private WebElement checker_alertRemark;
	public WebElement checkerAlertRemark()
	{
		return checker_alertRemark;
	}
	@FindBy(xpath="//div[@role='alert']")
	private WebElement checker_submitConfirmationPopUp;
	public WebElement checkerConfirmationPopUp()
	{
		return checker_submitConfirmationPopUp;
	}
	@FindBy(xpath="(//span[text()='Approve']/parent::button)[2]")
	private WebElement checkerUser_AlertApprove;
	public WebElement checkerAlertApprove()
	{
		return checkerUser_AlertApprove;
	}
	@FindBy(xpath="(//span[text()='Reject']/parent::button)[2]")
	private WebElement checker_AlertRejectButton;
	public WebElement checkerAlertRejectButton()
	{
		return checker_AlertRejectButton;
	}
	@FindBy(xpath="(//span[text()='Return']/parent::button)[2]")
	private WebElement checker_AlertReturnButton;
	public WebElement checkerAlertReturnButton()
	{
		return checker_AlertReturnButton;
	}

}
