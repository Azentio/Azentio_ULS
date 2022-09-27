package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_DrawdownDetailsObj {
	WebDriver driver;
	public ULS_DrawdownDetailsObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-label[text()=' Product ']//following-sibling::ion-input")
	private WebElement drawDownDetails_FacilityDetailsProduct;
	public WebElement drawDownDetailsFacilityDetailsProduct()
	{
		return drawDownDetails_FacilityDetailsProduct;
	}
	@FindBy(xpath="//ion-label[text()=' Sub-Product ']//following-sibling::ion-input")
	private WebElement drawDownDetails_FacilityDetailsSubProduct;
	public WebElement drawDownDetailsFacilityDetailsSubProduct()
	{
		return drawDownDetails_FacilityDetailsSubProduct;
	}
	@FindBy(xpath="//ion-label[text()=' Scheme ']//following-sibling::ion-input")
	private WebElement drawDownDetails_FacilityDetailsScheme;
	public WebElement drawDownDetailsFacilityDetailsScheme()
	{
		return drawDownDetails_FacilityDetailsScheme;
	}
	@FindBy(xpath="//ion-label[text()=' Sanction Date ']//following-sibling::ion-input")
	private WebElement drawDownDetails_FacilityDetailsSanctionDate;
	public WebElement drawDownDetailsFacilityDetailsSanctionDate()
	{
		return drawDownDetails_FacilityDetailsSanctionDate;
	}
	@FindBy(xpath="//ion-label[text()=' Last Disbursement Date ']//following-sibling::ion-input")
	private WebElement drawDownDetails_FacilityDetailsLastDisbursementDate;
	public WebElement drawDownDetailsFacilityDetailsLastDisbursementDate()
	{
		return drawDownDetails_FacilityDetailsLastDisbursementDate;
	}
	@FindBy(xpath="//ion-label[text()=' Is Tranche Allowed? ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsIsTrancheAllowed;
	public WebElement drawdownDetailsFacilityDetailsIsTrancheAllowed()
	{
		return drawdownDetails_FacilityDetailsIsTrancheAllowed;
	}
	@FindBy(xpath="//ion-label[text()=' Loan No ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsLoanNo;
	public WebElement drawdownDetailsFacilityDetailsLoanNo()
	{
		return drawdownDetails_FacilityDetailsLoanNo;
	}
	@FindBy(xpath="//ion-label[text()=' Sanction Amount ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsSanctionAmount;
	public WebElement drawdownDetailsFacilityDetailsSanctionAmount()
	{
		return drawdownDetails_FacilityDetailsSanctionAmount;
	}
	@FindBy(xpath="//ion-label[text()=' Limit Amount ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsLimitAmount;
	public WebElement drawdownDetailsFacilityDetailsLimitAmount()
	{
		return drawdownDetails_FacilityDetailsLimitAmount;
	}
	@FindBy(xpath="//ion-label[text()=' Disbursed Amount ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsDisbursedAmount;
	public WebElement drawdownDetailsFacilityDetailsDisbursedAmount()
	{
		return drawdownDetails_FacilityDetailsDisbursedAmount;
	}
	@FindBy(xpath="//ion-label[text()=' Current Disbursement ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsCurrentDisbursement;
	public WebElement drawdownDetailsFacilityDetailsCurrentDisbursement()
	{
		return drawdownDetails_FacilityDetailsCurrentDisbursement;
	}
	@FindBy(xpath="//ion-label[text()=' Available Amount ']//following-sibling::ion-input")
	private WebElement drawdownDetails_FacilityDetailsAvailableAmount;
	public WebElement drawdownDetailsFacilityDetailsAvailableAmount()
	{
		return drawdownDetails_FacilityDetailsAvailableAmount;
	}
	@FindBy(xpath="//span[text()=' Payment For ']//ancestor::thead//parent::table//tbody//tr//td[1]")
	private WebElement drawdownDetails_ScheduleDetailsPaymentFor;
	public WebElement drawdownDetailsScheduleDetailsPaymentFor()
	{
		return drawdownDetails_ScheduleDetailsPaymentFor;
	}
	@FindBy(xpath="//span[text()=' Schedule Amount ']//ancestor::thead//parent::table//tbody//tr//td[2]")
	private WebElement drawdownDetails_ScheduleDetailsScheduleAmount;
	public WebElement drawdownDetailsScheduleDetailsScheduleAmount()
	{
		return drawdownDetails_ScheduleDetailsScheduleAmount;
	}
	@FindBy(xpath="//span[text()=' Planned Date ']//ancestor::thead//parent::table//tbody//tr//td[3]")
	private WebElement drawdownDetails_ScheduleDetailsPlannedDate;
	public WebElement drawdownDetailsScheduleDetailsPlannedDate()
	{
		return drawdownDetails_ScheduleDetailsPlannedDate;
	}
	@FindBy(xpath="//ion-title[text()=' Schedule Details ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[4]")
	private WebElement drawdownDetails_ScheduleDetailsCurrency;
	public WebElement drawdownDetailsScheduleDetailsCurrency()
	{
		return drawdownDetails_ScheduleDetailsCurrency;
	}
	@FindBy(xpath="//ion-title[text()=' Schedule Details ']//ancestor::ion-item//parent::ion-row//following-sibling::p-table[1]//tr[1]//td[5]")
	private WebElement drawdownDetails_ScheduleDetailsScheduleNotes;
	public WebElement drawdownDetailsScheduleDetailsScheduleNotes()
	{
		return drawdownDetails_ScheduleDetailsScheduleNotes;
	}

}
