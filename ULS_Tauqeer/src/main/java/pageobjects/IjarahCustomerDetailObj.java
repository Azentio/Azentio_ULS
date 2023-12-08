package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IjarahCustomerDetailObj {
	WebDriver driver;

	public IjarahCustomerDetailObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Heading of the tab
	@FindBy(xpath = "//span[@class='p-button-icon pi pi-plus']/parent::button")
	private WebElement customerDetailsAddBtn;

	public WebElement customerDetailsAddBtnElement() {
		return customerDetailsAddBtn;

	}
	
	@FindBy(xpath = "//span[@class='p-button-icon pi pi-arrow-left']/parent::button")
	private WebElement customerDetailsBackBtn;

	public WebElement customerDetailsBackBtnElement() {
		return customerDetailsBackBtn;

	}
	
	@FindBy(xpath = "//span[@class='p-button-icon pi pi-save']/parent::button")
	private WebElement customerDetailsSaveBtn;

	public WebElement customerDetailsSaveBtnElement() {
		return customerDetailsSaveBtn;

	}
	
	@FindBy(xpath = "(//ion-label[text()='Customer details'])[2]/following-sibling::ion-buttons/ion-button")
	private WebElement hB_CustomerDetail;

	public WebElement hB_CustomerDetailElement() {
		return hB_CustomerDetail;

	}
	
	@FindBy(xpath = "//div[@class='message']")
	private WebElement cD_PostSaveBlankFieldPopup;

	public WebElement cD_PostSaveBlankFieldPopupElement() {
		return cD_PostSaveBlankFieldPopup;

	}
	

}
