package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferEntityLayout_OfferDetailsObj {
	WebDriver driver;
public OfferEntityLayout_OfferDetailsObj(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
private WebElement Application_DetailTab_SearchText1;
public  WebElement Application_DetailTab_SearchText() {
	return Application_DetailTab_SearchText1;
}
@FindBy(xpath="//button[@ng-reflect-text='Search']")
private WebElement Application_DetailTab_SearchButtons1;
public  WebElement Application_DetailTab_SearchButtons() {
	return Application_DetailTab_SearchButtons1;
}
@FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]")
private WebElement facilityInfoEditIcon1;

public WebElement facilityInfoEditIcon1() {
	return facilityInfoEditIcon1;
}
@FindBy(xpath = "//td[text()=' OFFERING ']//preceding-sibling::td[3]/button")
private WebElement offering_ActionIcon;
public WebElement offering_ActionIcon() {
	return offering_ActionIcon;
}
@FindBy(xpath="//ion-label[text()=' Product ']")
private WebElement productField;
public WebElement productField() {
	return productField;
}

@FindBy(xpath="//ion-label[text()=' Product ']/following-sibling::ion-input")
private WebElement productFieldText;
public WebElement productFieldText() {
	return productFieldText;
}
@FindBy(xpath="//ion-label[text()=' Product ']/following-sibling::ion-input/input")
private WebElement productFieldClick;
public WebElement productFieldClick() {
	return productFieldClick;
}
@FindBy(xpath="//ion-label[text()=' Sub-Product ']")
private WebElement subProductField;
public WebElement subProductField() {
	return subProductField;
}
@FindBy(xpath="//ion-label[text()=' Sub-Product ']/following-sibling::ion-input")
private WebElement subProductFieldText;
public WebElement subProductFieldText() {
	return subProductFieldText;
}
@FindBy(xpath="//ion-label[text()=' Sub-Product ']/following-sibling::ion-input/input")
private WebElement subProductFieldClick;
public WebElement subProductFieldClick() {
	return subProductFieldClick;
}
@FindBy(xpath="//ion-label[text()=' Scheme ']")
private WebElement schemeField;
public WebElement schemeField() {
	return schemeField;
}
@FindBy(xpath="//ion-label[text()=' Scheme ']/following-sibling::ion-input")
private WebElement schemeFieldText;
public WebElement schemeFieldText() {
	return schemeFieldText;
}
@FindBy(xpath="//ion-label[text()=' Scheme ']/following-sibling::ion-input/input")
private WebElement schemeFieldClick;
public WebElement schemeFieldClick() {
	return schemeFieldClick;
}
@FindBy(xpath="//ion-label[text()=' Pricing Indicator ']")
private WebElement pricingIndicatorField;
public WebElement pricingIndicatorField() {
	return pricingIndicatorField;
}
@FindBy(xpath="//ion-label[text()=' Pricing Indicator ']/following-sibling::ion-input")
private WebElement pricingIndicatorFieldText;
public WebElement pricingIndicatorFieldText() {
	return pricingIndicatorFieldText;
}
@FindBy(xpath="//ion-label[text()=' Pricing Indicator ']/following-sibling::ion-input/input")
private WebElement pricingIndicatorFieldClick;
public WebElement pricingIndicatorFieldClick() {
	return pricingIndicatorFieldClick;
}

@FindBy(xpath="//ion-label[text()=' Offered Amount ']")
private WebElement offeredAmountField;
public WebElement offeredAmountField() {
	return offeredAmountField;
}

@FindBy(xpath="//ion-label[text()=' Offered Amount ']/following-sibling::ion-input")
private WebElement offeredAmountText;
public WebElement offeredAmountText() {
	return offeredAmountText;
}
@FindBy(xpath="//ion-label[text()=' Offered Amount ']/following-sibling::ion-input/input")
private WebElement offeredAmountClick;
public WebElement offeredAmountClick() {
	return offeredAmountClick;
}
@FindBy(xpath="//ion-label[text()=' Tenure ']")
private WebElement tenureField;
public WebElement tenureField() {
	return tenureField;
}
@FindBy(xpath="//ion-label[text()=' Tenure ']/following-sibling::ion-input")
private WebElement tenureFieldText;
public WebElement tenureFieldText() {
	return tenureFieldText;
}
@FindBy(xpath="//ion-label[text()=' Tenure ']/following-sibling::ion-input/input")
private WebElement tenureFieldClick;
public WebElement tenureFieldClick() {
	return tenureFieldClick;
}
@FindBy(xpath="//ion-label[text()=' Nature of Finance ']")
private WebElement natureOfFinanceField;
public WebElement natureOfFinanceField() {
	return natureOfFinanceField;
}
@FindBy(xpath="//ion-label[text()=' Nature of Finance ']/following-sibling::ion-input")
private WebElement natureOfFinanceText;
public WebElement natureOfFinanceText() {
	return natureOfFinanceText;
}
@FindBy(xpath="//ion-label[text()=' Nature of Finance ']/following-sibling::ion-input/input")
private WebElement natureOfFinanceClick;
public WebElement natureOfFinanceClick() {
	return natureOfFinanceClick;
}
@FindBy(xpath="//ion-label[text()=' Currency ']")
private WebElement currencyField;
public WebElement currencyField() {
	return currencyField;
}
@FindBy(xpath="//ion-label[text()=' Currency ']/following-sibling::ion-input")
private WebElement currencyFieldText;
public WebElement currencyFieldText() {
	return currencyFieldText;
}
@FindBy(xpath="//ion-label[text()=' Currency ']/following-sibling::ion-input/input")
private WebElement currencyFieldClick;
public WebElement currencyFieldClick() {
	return currencyFieldClick;
}

}
