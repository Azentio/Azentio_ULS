package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationDetailsAppDataEntryObj {
	WebDriver driver;
	public ApplicationDetailsAppDataEntryObj(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//tr[1]//td[contains(text(),' Disbursment Maker ')]//preceding-sibling::td[8]//button")
	private WebElement applicationDetails_DisbursmentMakerNotificationRecord;
	public WebElement applicationDetailsDisbursmentMakerNotificationRecord()
	{
		return applicationDetails_DisbursmentMakerNotificationRecord;
	}
	@FindBy(xpath="//ion-label[contains(text(),'Application Details')]//parent::ion-segment-button")
	private WebElement applicationDetails_ApplicationDetailsSegmentButton;
	public WebElement applicationDetailsApplicationDetailsSegmentButton()
	{
		return applicationDetails_ApplicationDetailsSegmentButton;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Classification ')]//following-sibling::ion-select")
	private WebElement applicationDetails_ClassificationDropdown;
	public WebElement applicationDetailsClassificationDropdown()
	{
		return applicationDetails_ClassificationDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Product ')]//following-sibling::ion-select")
	private WebElement applicationDetails_ProductDropdown;
	public WebElement applicationDetailsProductDropdown()
	{
		return applicationDetails_ProductDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Total Finance Amount Requested ')]//parent::div//following-sibling::div//input")
	private WebElement applicationDetails_TotalFinanceAmmountRequested;
	public WebElement applicationDetailsTotalFinanceAmmountRequested()
	{
		return applicationDetails_TotalFinanceAmmountRequested;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Declared Net Monthly Income ')]//parent::div//following-sibling::div//input")
	private WebElement applicationDetails_DeclaredetMonthlyIncomeTextBox;
	public WebElement applicationDetailsDeclaredetMonthlyIncomeTextBox()
	{
		return applicationDetails_DeclaredetMonthlyIncomeTextBox;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Declared Current Obligation')]//parent::div//following-sibling::div//input")
	private WebElement applicationDetails_DeclaredeCurrentObligationTextBox;
	public WebElement applicationDetailsDeclaredeCurrentObligationTextBox()
	{
		return applicationDetails_DeclaredeCurrentObligationTextBox;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Special Promotion/Campaign ')]//following-sibling::ion-select")
	private WebElement applicationDetails_SpecialPromotionCampaignDropdown;
	public WebElement applicationDetailsSpecialPromotionCampaignDropdown()
	{
		return applicationDetails_SpecialPromotionCampaignDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Sourcing Channel ')]//following-sibling::ion-select")
	private WebElement applicationDetails_SourcingChannelDropdown;
	public WebElement applicationDetailsSourcingChannelDropdown()
	{
		return applicationDetails_SourcingChannelDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Business Center Code ')]//following-sibling::ion-select")
	private WebElement applicationDetails_BusinessCenterCodeDropdown;
	public WebElement applicationDetailsBusinessCenterCodeDropdown()
	{
		return applicationDetails_BusinessCenterCodeDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Servicing Type ')]//following-sibling::ion-select")
	private WebElement applicationDetails_ServiceTypeCodeDropdown;
	public WebElement applicationDetailsServiceTypeCodeDropdown()
	{
		return applicationDetails_ServiceTypeCodeDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Region ')]//following-sibling::ion-select")
	private WebElement applicationDetails_RegionCodeDropdown;
	public WebElement applicationDetailsRegionCodeDropdown()
	{
		return applicationDetails_RegionCodeDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Servicing Branch')]//following-sibling::ion-select")
	private WebElement applicationDetails_ServicingBranchCodeDropdown;
	public WebElement applicationDetailsServicingBranchCodeDropdown()
	{
		return applicationDetails_ServicingBranchCodeDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Spoke Location ')]//following-sibling::ion-select")
	private WebElement applicationDetails_SpokeLocationDropdown;
	public WebElement applicationDetailsSpokeLocationDropdown()
	{
		return applicationDetails_SpokeLocationDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Closing Staff or Servicing Staff or RM ')]//following-sibling::ion-select")
	private WebElement applicationDetails_ClosingStafforServicingStafforRMDropdown;
	public WebElement applicationDetailsClosingStafforServicingStafforRMDropdown()
	{
		return applicationDetails_ClosingStafforServicingStafforRMDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Topup Type ')]//following-sibling::ion-select")
	private WebElement applicationDetails_TopupTypeDropdown;
	public WebElement applicationDetailsTopupTypeDropdown()
	{
		return applicationDetails_TopupTypeDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Topup Application No ')]//following-sibling::ion-input//input")
	private WebElement applicationDetails_TopupApplicationNoInputBox;
	public WebElement applicationDetailsTopupApplicationNoInputBox()
	{
		return applicationDetails_TopupApplicationNoInputBox;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Sourcing Type ')]//following-sibling::ion-select")
	private WebElement applicationDetails_SourcingTypeDropdown;
	public WebElement applicationDetailsSourcingTypeDropdown()
	{
		return applicationDetails_SourcingTypeDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Sourcing Office ')]//following-sibling::ion-select")
	private WebElement applicationDetails_SourcingOfficeDropdown;
	public WebElement applicationDetailsSourcingOfficeDropdown()
	{
		return applicationDetails_SourcingOfficeDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Sourcing Entity ')]//following-sibling::ion-select")
	private WebElement applicationDetails_SourcingEntityDropdown;
	public WebElement applicationDetailsSourcingEntityDropdown()
	{
		return applicationDetails_SourcingEntityDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Sourcing Staff ')]//following-sibling::ion-select")
	private WebElement applicationDetails_SourcingStaffDropdown;
	public WebElement applicationDetailsSourcingStaffDropdown()
	{
		return applicationDetails_SourcingStaffDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Reference Type ')]//following-sibling::ion-select")
	private WebElement applicationDetails_ReferenceTypeDropdown;
	public WebElement applicationDetailsReferenceTypeDropdown()
	{
		return applicationDetails_ReferenceTypeDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Reference Entity ')]//following-sibling::ion-select")
	private WebElement applicationDetails_ReferenceEntityDropdown;
	public WebElement applicationDetailsReferenceEntityDropdown()
	{ 
		return applicationDetails_ReferenceEntityDropdown;
	}
	@FindBy(xpath="//ion-label[contains(text(),' Reference Code ')]//following-sibling::ion-input//input")
	private WebElement applicationDetails_ReferenceCodeInputBox;
	public WebElement applicationDetailsReferenceCodeInputBox()
	{
		return applicationDetails_ReferenceCodeInputBox;
	}

}
