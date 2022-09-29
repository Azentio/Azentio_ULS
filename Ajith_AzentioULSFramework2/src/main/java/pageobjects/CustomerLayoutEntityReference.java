package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLayoutEntityReference {
WebDriver driver;
public CustomerLayoutEntityReference(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//ion-label[text()='Additional Customer Info']/parent::ion-segment-button")
private WebElement additionalCustomerInfo;
public WebElement additionalCustomerInfo() {
 return additionalCustomerInfo;
}
@FindBy(xpath = "//ion-title[text()=' References List View ']/parent::ion-card-header/following-sibling::ion-card-content//button[@ng-reflect-text='Add']")
private WebElement refernceListViewAddIcon;

public WebElement refernceListViewAddIcon() {
	return refernceListViewAddIcon;
}
@FindBy(xpath="//ion-title[text()=' Customer Reference ']/parent::ion-col/preceding-sibling::ion-col//button")
private WebElement backButtonInReference;
public WebElement backButtonInReference() {
	return backButtonInReference;
} 

@FindBy(xpath = "(//button[@ng-reflect-text='Edit'])[1]")
private WebElement customerPersonalInfoFirstEditIcon;

public WebElement customerPersonalInfoFirstEditIcon() {
	return customerPersonalInfoFirstEditIcon;
}


}
