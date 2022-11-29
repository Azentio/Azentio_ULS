package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchemeMasterObj {
	WebDriver driver;
	public SchemeMasterObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ion-label[text()=' Description ']/parent::ion-item//ion-input")
	private WebElement checker_DescriptionFieldValue;
	public WebElement checker_DescriptionFieldValue() {
		return checker_DescriptionFieldValue;
	}
	@FindBy(xpath="//ion-label[text()='  Min Finance Amount ']/parent::ion-item//ion-input")
	private WebElement checker_MinFinanceAmountFieldValue;
	public WebElement checker_MinFinanceAmountFieldValue() {
		return checker_MinFinanceAmountFieldValue;
	}
	@FindBy(xpath="//ion-label[text()='  Max Finance Amount ']/parent::ion-item//ion-input")
	private WebElement checker_MaxFinanceAmountFieldValue;
	public WebElement checker_MaxFinanceAmountFieldValue() {
		return checker_MaxFinanceAmountFieldValue;
	}
	@FindBy(xpath="//ion-label[text()='  Min Tenor In Months ']/parent::ion-item//ion-input")
	private WebElement checker_MinTenorInMonthsValue;
	public WebElement checker_MinTenorInMonthsValue() {
		return checker_MinTenorInMonthsValue;
	}
	@FindBy(xpath="//ion-label[text()='  max Tenor In Months ']/parent::ion-item//ion-input")
	private WebElement checker_MaxTenorInMonthsValue;
	public WebElement checker_MaxTenorInMonthsValue() {
		return checker_MaxTenorInMonthsValue;
	}
	@FindBy(xpath="//ion-label[text()=' LPC grace period (days) ']/parent::ion-item//ion-input")
	private WebElement checker_LPCGracePeriodValue;
	public WebElement checker_LPCGracePeriodValue() {
		return checker_LPCGracePeriodValue;
	}
	@FindBy(xpath="//ion-label[text()='  Inst. Rounding Logic ']/parent::ion-item//ion-input")
	private WebElement checker_InstRoutingLogicValue;
	public WebElement checker_InstRoutingLogicValue() {
		return checker_InstRoutingLogicValue;
	}
	@FindBy(xpath="//ion-label[text()=' Remarks ']/parent::ion-item//ion-textarea")
	private WebElement checker_RemarksValue;
	public WebElement checker_RemarksValue() {
		return checker_RemarksValue;
	}
	@FindBy(xpath="//ion-label[text()=' Max Coapplicants ']/parent::ion-item//ion-input")
	private WebElement checker_MaxCoapplicantsValue;
	public WebElement checker_MaxCoapplicantsValue() {
		return checker_MaxCoapplicantsValue;
	}
	@FindBy(xpath="//ion-label[text()='  Max Guarantors ']/parent::ion-item//ion-input")
	private WebElement checker_MaxGuarantorsValue;
	public WebElement checker_MaxGuarantorsValue() {
		return checker_MaxGuarantorsValue;
	}
	@FindBy(xpath="//ion-label[text()='  Roundoff Value ']/parent::ion-item//ion-input")
	private WebElement checker_RoundOffValue;
	public WebElement checker_RoundOffValue() {
		return checker_RoundOffValue;
	}
	@FindBy(xpath="//ion-label[text()='  Offer Validity (Days) ']/parent::ion-item//ion-input")
	private WebElement checker_OfferValidityDaysValue;
	public WebElement checker_OfferValidityDaysValue() {
		return checker_OfferValidityDaysValue;
	}
	@FindBy(xpath="//ion-label[text()='  Maximum Balloon Percentage ']/parent::ion-item//ion-input")
	private WebElement checker_MaximumBalloonPercentageValue;
	public WebElement checker_MaximumBalloonPercentageValue() {
		return checker_MaximumBalloonPercentageValue;
	}
}
