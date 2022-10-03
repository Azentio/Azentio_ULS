package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportMasterObj {
WebDriver driver;
public ReportMasterObj(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//ion-label[text()='Report Master']//following-sibling::ion-buttons//child::ion-button[2]")
private WebElement reportMasterApproveIcon;
public WebElement reportMasterApproveIcon() {
	return reportMasterApproveIcon;
}
@FindBy(xpath="//button[@ng-reflect-text='Add']")
private WebElement addIcon;
public WebElement addIcon() {
	return addIcon;
}
@FindBy(xpath="//ion-label[text()=' Report Category ']/following-sibling::ion-select")
private WebElement reportCategory;
public WebElement reportCategory() {
	return reportCategory;
}
@FindBy(xpath="//span[text()='Configurations']//following-sibling::ion-icon")
private WebElement configurationOptions;
public WebElement configurationOptions() {
	return configurationOptions;
}
@FindBy(xpath="//ion-label[text()='Config Manager']//following-sibling::ion-icon")
private WebElement configManagerOptions;
public WebElement configManagerOptions() {
	return configManagerOptions;
}
@FindBy(xpath="//ion-label[text()=' Report Name ']/following-sibling::ion-input/input")
private WebElement reportName;
public WebElement reportName() {
	return reportName;
} 
@FindBy(xpath="//ion-label[text()=' Report Name 2 ']/following-sibling::ion-input/input")
private WebElement reportName2;
public WebElement reportName2() {
	return reportName2;
}
@FindBy(xpath="//ion-label[text()=' Report Name 3 ']/following-sibling::ion-input/input")
private WebElement reportName3;
public WebElement reportName3() {
	return reportName3;
}
@FindBy(xpath = "//ion-label[text()=' Report Description ']/following-sibling::ion-input/input") 
private WebElement Reportdescription1;
public WebElement Reportdescription() {
    return Reportdescription1;
}
@FindBy(xpath="//ion-label[text()=' Report Url  ']/following-sibling::ion-textarea//textarea")
private WebElement reportUrl;
public WebElement reportUrl() {
	return reportUrl;
}

@FindBy(xpath="//ion-label[text()=' Report Type ']/following-sibling::ion-select")
private WebElement reportType;
public WebElement reportType() {
	return reportType;
}
@FindBy(xpath = "//button[@ng-reflect-text=\"Update\"]") 
private WebElement Report_Master_Update;
public WebElement Report_Master_Update() {
    return Report_Master_Update;
}
@FindBy(xpath="//tr[1]/td[1]/span[1]/button[1]")
private WebElement firstEditIcon;
public WebElement firstEditIcon() {
	return firstEditIcon;
} 
@FindBy(xpath="//ion-toggle[@role='switch']")
private WebElement reportMasterStatusSwitchButton;
public WebElement reportMasterStatusSwitchButton() {
	return reportMasterStatusSwitchButton;
}
@FindBy(xpath = "//ion-icon[@aria-label='mail unread outline']") 
private WebElement Inbox;
public WebElement Inbox() {
    return Inbox;
} 
@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]") 
private WebElement InboxView_Search;
public WebElement InboxView_Search() {
    return InboxView_Search;
}  
@FindBy(xpath = "//span[text()=' Inbox ']//parent::div//child::span[2]/input") 
private WebElement InboxView_SearchText;
public WebElement InboxView_SearchText() {
    return InboxView_SearchText;
} 
@FindBy(xpath = "(//td[contains(text(),'MST_REPORT')])[1]//preceding-sibling::td[1]//child::span") 
private WebElement reportMasterReferanceId;
public WebElement reportMasterReferanceId() {
    return reportMasterReferanceId;
} 
@FindBy(xpath="(//td[text()=' MST_REPORT '])[1]//parent::tr//child::td[1]/button")
private WebElement firstEditIconInMakerListView;
public WebElement firstEditIconInMakerListView() {
	return firstEditIconInMakerListView;
}
@FindBy(xpath = "//button/span[contains(text(),'Submit')]") 
private WebElement reportMasterMaker_Submit;
public WebElement reportMasterMaker_Submit() {
    return reportMasterMaker_Submit;
}
@FindBy(xpath = "//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea") 
private WebElement reportMasterMaker_EnterRemark;
public WebElement reportMasterMaker_EnterRemark() {
    return reportMasterMaker_EnterRemark;
}
@FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
private WebElement reportMasterMakerRemarkSubmit;
public WebElement reportMasterMakerRemarkSubmit() {
	return reportMasterMakerRemarkSubmit;
}

}
