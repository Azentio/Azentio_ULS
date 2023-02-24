package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_OfferDecisionObj {
	WebDriver driver;
	public ULS_OfferDecisionObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//tr[1]//td[text()=' L1APP ']//preceding-sibling::td[3]//button")
	private WebElement uls_OfferDecesionMailBoxFirstRecord;
	public WebElement ulsOfferDecisionMailBoxFirstRecord()
	{
		return uls_OfferDecesionMailBoxFirstRecord;
	}
	@FindBy(xpath="//ion-label[text()='Offer Decision']//parent::ion-segment-button")
	private WebElement uls_OfferDecisionTab;
	public WebElement ulsOfferDecisionTab()
	{
		return uls_OfferDecisionTab;
	}
	@FindBy(xpath="//tr[1]//td[1]//button[@ng-reflect-text='Edit']")
	private WebElement offerDecesion_FacilityInfoListViewFirstRecord;
	public WebElement offerDecisionFacilityInfoListviewFirstRecord()
	{
		return offerDecesion_FacilityInfoListViewFirstRecord;
	}
	@FindBy(xpath="//ion-label[text()=' Product ']//following-sibling::ion-input")
	private WebElement offerDecesion_FacilityDetailsProductField;
	public WebElement offerDecesionFacilityDetailsProductField()
	{
		return offerDecesion_FacilityDetailsProductField;
	}
	@FindBy(xpath="//ion-label[text()=' Sub-Product ']//following-sibling::ion-input")
	private WebElement offerDecesion_FacilityDetailsSubProductField;
	public WebElement offerDecesionFacilityDetailsSubProductField()
	{
		return offerDecesion_FacilityDetailsSubProductField;
	}
	@FindBy(xpath="//ion-label[text()=' Scheme ']//following-sibling::ion-input")
	private WebElement offerDecesion_FacilityDetailsSchemeField;
	public WebElement offerDecesionFacilityDetailsSchemeField()
	{
		return offerDecesion_FacilityDetailsSchemeField;
	}
	@FindBy(xpath="//ion-label[text()=' Pricing Indicator ']//following-sibling::ion-input")
	private WebElement offerDecesion_FacilityDetailsPricingIndicatorField;
	public WebElement offerDecesionFacilityDetailsPricingIndicatorField()
	{
		return offerDecesion_FacilityDetailsPricingIndicatorField;
	}
	@FindBy(xpath="//ion-label[text()=' Repayment Type ']//following-sibling::ion-input")
	private WebElement offerDecesion_FacilityDetailsRepaymentTypeField;
	public WebElement offerDecesionFacilityDetailsRepaymentTypeField()
	{
		return offerDecesion_FacilityDetailsRepaymentTypeField;
	}
	@FindBy(xpath="//ion-label[text()=' Compute Instalment On ']//following-sibling::ion-input")
	private WebElement offerDecesion_FacilityDetailsComputeInstalmentOnField;
	public WebElement offerDecesionFacilityDetailsComputeInstalmentOnField()
	{
		return offerDecesion_FacilityDetailsComputeInstalmentOnField;
	}
	@FindBy(xpath="//ion-label[text()=' Principal Frequency ']//following-sibling::ion-input")
	private WebElement offerDecesion_FacilityDetailsPrincipalFrequencyField;
	public WebElement offerDecesionFacilityDetailsPrincipalFrequencyField()
	{
		return offerDecesion_FacilityDetailsPrincipalFrequencyField;
	}
	@FindBy(xpath="//ion-label[text()=' Interest Frequency ']//following-sibling::ion-input")
	private WebElement offerDecesion_FacilityDetailsInterstFrequencyField;
	public WebElement offerDecesionFacilityDetailsInterstFrequencyField()
	{
		return offerDecesion_FacilityDetailsInterstFrequencyField;
	}
	@FindBy(xpath="//ion-title[text()=' Eligibility Details ']//ancestor::ion-item//parent::ion-row//following-sibling::ion-col//tbody//td[2]//span")
	private WebElement offerDecesion_EligibilityDetailsEligibilityType;
	public WebElement offerDecesionEligibilityDetailsEligibilityType()
	{
		return offerDecesion_EligibilityDetailsEligibilityType;
	}
	@FindBy(xpath="//ion-title[text()=' Eligibility Details ']//ancestor::ion-item//parent::ion-row//following-sibling::ion-col//tbody//td[3]//span")
	private WebElement offerDecesion_EligibilityDetailsEligibilityAmount;
	public WebElement offerDecesionEligibilityDetailsEligibilityAmount()
	{
		return offerDecesion_EligibilityDetailsEligibilityAmount;
	}
	@FindBy(xpath="//ion-title[text()=' Eligibility Details ']//ancestor::ion-item//parent::ion-row//following-sibling::ion-col//tbody//td[4]//span")
	private WebElement offerDecesion_EligibilityDetailsEligibilityPercentage;
	public WebElement offerDecesionEligibilityDetailsEligibilityPercentage()
	{
		return offerDecesion_EligibilityDetailsEligibilityPercentage;
	}
	@FindBy(xpath="//ion-title[text()=' Eligibility Details ']//ancestor::ion-item//parent::ion-row//following-sibling::ion-col//tbody//tr[1]//td[5]//span")
	private WebElement offerDecesion_EligibilityDetailsCurrency;
	public WebElement offerDecesionEligibilityDetailsCurrency()
	{
		return offerDecesion_EligibilityDetailsCurrency;
	}
	@FindBy(xpath="//ion-title[text()=' Eligibility Details ']//ancestor::ion-item//parent::ion-row//following-sibling::ion-col//tbody//tr[1]//td[6]//span")
	private WebElement offerDecesion_EligibilityDetailsActualPercentage;
	public WebElement offerDecesionEligibilityDetailsActualPercentage()
	{
		return offerDecesion_EligibilityDetailsActualPercentage;
	}
	@FindBy(xpath="//ion-title[text()=' Eligibility Details ']//ancestor::ion-item//parent::ion-row//following-sibling::ion-col//tbody//tr[1]//td[7]//span")
	private WebElement offerDecesion_EligibilityDetailsDeviationLevel;
	public WebElement offerDecesionEligibilityDetailsDeviationLevel()
	{
		return offerDecesion_EligibilityDetailsDeviationLevel;
	}
	

}
