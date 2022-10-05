package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllocationMasterObj {
	WebDriver driver;
public AllocationMasterObj(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[text()='Configurations']//following-sibling::ion-icon")
private WebElement configurationOptions;
public WebElement configurationOptions() {
	return configurationOptions;
}
@FindBy(xpath="//ion-label[text()='Allocation Master']//following-sibling::ion-buttons//child::ion-button[2]")
private WebElement allocationMasterApproveIcon;
public WebElement allocationMasterApproveIcon() {
	return allocationMasterApproveIcon;
}
@FindBy(xpath="//tr[1]/td[1]/span[1]/button[1]")
private WebElement firstEditIcon;
public WebElement firstEditIcon() {
	return firstEditIcon;
} 
}
