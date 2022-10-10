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
@FindBy(xpath = "//ion-label[text()=' Discription ']//following-sibling::ion-input/input")
private WebElement AllocationMaster_DescriptionTextBox1;

public WebElement AllocationMaster_DescriptionTextBox() {
	return AllocationMaster_DescriptionTextBox1;
}

@FindBy(xpath = "//ion-label[text()=' Allocation Code ']//following-sibling::ion-input/input")
private WebElement AllocationMaster_AllocationCodeTextBox1;
public WebElement AllocationMaster_AllocationCodeTextBox() {
	return AllocationMaster_AllocationCodeTextBox1;
}
@FindBy(xpath = "//button[@ng-reflect-text='Go Back']") 
private WebElement allocationMaster_Back;
public WebElement allocationMaster_Back() {
    return allocationMaster_Back;
} 
@FindBy(xpath = "//button[@ng-reflect-text='Update']") 
private WebElement alloctiont_Master_Update;
public WebElement alloctiont_Master_Update() {
    return alloctiont_Master_Update;
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
@FindBy(xpath = "(//td[contains(text(),'ALLOCATION_MST')])[1]//preceding-sibling::td[1]//child::span") 
private WebElement allocationMasterReferanceId;
public WebElement allocationMasterReferanceId() {
    return allocationMasterReferanceId;
} 
@FindBy(xpath="(//td[text()=' ALLOCATION_MST '])[1]//parent::tr//child::td[1]/button")
private WebElement firstEditIconInMakerListView;
public WebElement firstEditIconInMakerListView() {
	return firstEditIconInMakerListView;
}
@FindBy(xpath = "//kub-workflow-decision//button[@ng-reflect-label='Submit']") 
private WebElement allocationMasterMaker_Submit;
public WebElement allocationMasterMaker_Submit() {
    return allocationMasterMaker_Submit;
}
@FindBy(xpath = "//ion-card-subtitle[text()=' SUBMIT ']/ancestor::ion-card//button") 
private WebElement allocationMasterMaker_RemarkSubmit;
public WebElement allocationMasterMaker_RemarkSubmit() {
    return allocationMasterMaker_RemarkSubmit;
}
@FindBy(xpath = "//ion-label[contains(text(),'Please Enter Remarks')]//following-sibling::ion-textarea//child::textarea") 
private WebElement allocationMasterMaker_EnterRemark;
public WebElement allocationMasterMaker_EnterRemark() {
    return allocationMasterMaker_EnterRemark;
}
@FindBy(xpath="(//button[@ng-reflect-label='Submit'])[2]")
private WebElement allocationMasterMakerRemarkSubmit;
public WebElement allocationMasterMakerRemarkSubmit() {
	return allocationMasterMakerRemarkSubmit;
}
//*******************************************************Checker xpath**********************************************************
@FindBy(xpath = "//ion-icon[@aria-label='menu']") 
private WebElement Checker_toggle;
public WebElement Checker_toggle() {
  return Checker_toggle;
} 
@FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-unread-outline']") 
private WebElement Checker_Inbox;
public WebElement Checker_Inbox() {
  return Checker_Inbox;
}
@FindBy(xpath = "//button[@label='Approve']/span[contains(text(),'Approve')]") 
private WebElement Checker_Approve;
public WebElement Checker_Approve() {
  return Checker_Approve;
}  
@FindBy(xpath = "//ion-label[contains(text(),'approve')]") 
private WebElement Checker_Alert_Approve;
public WebElement Checker_Alert_Approve() {
  return Checker_Alert_Approve;
}

@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
private WebElement Checker_Final_Approve;
public WebElement Checker_Final_Approve() {
  return Checker_Final_Approve;
}
@FindBy(xpath = "//kub-workflow-decision//child::button[@label='Reject']") 
private WebElement Checker_Reject;
public WebElement Checker_Reject() {
  return Checker_Reject;
}

@FindBy(xpath = "//ion-label[contains(text(),'cancel')]") 
private WebElement Checker_Alert_Reject;
public WebElement Checker_Alert_Reject() {
  return Checker_Alert_Reject;
}

@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
private WebElement Checker_Final_Reject;
public WebElement Checker_Final_Reject() {
  return Checker_Final_Reject;
}
@FindBy(xpath = "//kub-workflow-decision//child::button[@label='Return']") 
private WebElement Checker_Return;
public WebElement Checker_Return() {
  return Checker_Return;
}

@FindBy(xpath = "//ion-label[contains(text(),'return')]") 
private WebElement Checker_Alert_Return;
public WebElement Checker_Alert_Return() {
  return Checker_Alert_Return;
}

@FindBy(xpath = "//ion-row[2]/ion-col[1]/span[1]/button[1]") 
private WebElement Checker_Final_Return;
public WebElement Checker_Final_Return() {
  return Checker_Final_Return;
}
@FindBy(xpath="//div[@role='alert']")
private WebElement checkerApproveMgs;
public WebElement checkerApproveMgs() {
	return checkerApproveMgs;
}
}
