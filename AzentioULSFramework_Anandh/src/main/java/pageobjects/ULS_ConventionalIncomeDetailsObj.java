package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_ConventionalIncomeDetailsObj {
	WebDriver driver;

	public ULS_ConventionalIncomeDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-label[text()='Additional Customer Info']//parent::ion-segment-button")
	private WebElement uls_AdditionalCustomerInfoTab;

	public WebElement ulsAdditionalCustomerInfotab() {
		return uls_AdditionalCustomerInfoTab;
	}

	@FindBy(xpath = "//ion-title[text()=' Customer Personal Information ']//ancestor::ion-card//button[@ng-reflect-text='Edit']")
	private WebElement uls_CustomerPersonalInformationListViewFirstRecord;

	public WebElement ulsCustomerPersonalInformationListViewFirstRecord() {
		return uls_CustomerPersonalInformationListViewFirstRecord;
	}
	@FindBy(xpath="//ion-title[text()=' References List View ']")
	private WebElement conventionalDetails_referenceListView;

	public WebElement conventionalDetailsReferenceListView() {
		return conventionalDetails_referenceListView;
	}

	@FindBy(xpath = "//ion-title[text()=' References List View ']//ancestor::ion-card//tr[1]//button[@ng-reflect-text='Edit']")
	private WebElement uls_ConventionalIncomeDetailsListViewFirstRecord;

	public WebElement ulsConvetionalIncomeDetailsListViewFirstRecord() {
		return uls_ConventionalIncomeDetailsListViewFirstRecord;
	}

	@FindBy(xpath = "//ion-label[text()=' Salutation ']//following-sibling::ion-select")
	private WebElement conventionalIncomeDetails_SalutationDropDown;

	public WebElement conventionalIncomeDetailsSalutationDropDown() {
		return conventionalIncomeDetails_SalutationDropDown;
	}

	@FindBy(xpath = "//ion-label[text()=' Customer Full Name ']//following-sibling::ion-input")
	private WebElement conventionalIncomeDetails_CustomerFullNameDataHolder;

	public WebElement conventionalIncomeDetailsCustomerFullNameDataHolder() {
		return conventionalIncomeDetails_CustomerFullNameDataHolder;
	}

	@FindBy(xpath = "//ion-label[text()=' Primary Mobile Number ']//following-sibling::ion-input")
	private WebElement conventionalIncomeDetails_PrimaryMobileNumberDataHolder;

	public WebElement conventionalIncomeDetailsPrimaryMobileNumberDataHolder() {
		return conventionalIncomeDetails_PrimaryMobileNumberDataHolder;
	}
	@FindBy(xpath="//ion-label[text()=' No. of Years Known ']//following-sibling::ion-input")
	private WebElement conventionalIncomeDetails_NoOfYearsKnownDataHolder;

	public WebElement conventionalIncomeDetailsNoOfYearsKnownDataHolder() {
		return conventionalIncomeDetails_NoOfYearsKnownDataHolder;
	}	

	@FindBy(xpath = "//ion-toggle")
	private WebElement conventionalIncomeDetails_StatusToggle;

	public WebElement conventionalIncomeDetailsStatusToggle() {
		return conventionalIncomeDetails_StatusToggle;
	}

	@FindBy(xpath = "//ion-title[text()=' Customer Reference ']//parent::ion-col//preceding-sibling::ion-col//button[@ng-reflect-text='Go Back']")
	private WebElement conventionalIncomeDetails_CustomerReferenceBackButton;

	public WebElement conventionalIncomeDetailsCustomerReferenceBackButton() {
		return conventionalIncomeDetails_CustomerReferenceBackButton;
	}

	@FindBy(xpath = "//ion-title[text()=' References List View ']//ancestor::ion-card//tr[1]//td[3]//span")
	private WebElement conventionalIncomeDetails_ListViewSalutationData;

	public WebElement conventionalIncomeDetailsListViewSalutationData() {
		return conventionalIncomeDetails_ListViewSalutationData;
	}

	@FindBy(xpath = "//ion-title[text()=' References List View ']//ancestor::ion-card//tr[1]//td[4]//span")
	private WebElement conventionalIncomeDetails_ListViewNameData;

	public WebElement conventionalIncomeDetailsListViewNameData() {
		return conventionalIncomeDetails_ListViewNameData;
	}

	@FindBy(xpath = "//ion-title[text()=' References List View ']//ancestor::ion-card//tr[1]//td[5]//span")

	private WebElement conventionalIncomeDetails_ListViewMobileNumberData;

	public WebElement conventionalIncomeDetailsListViewMobileNumberData() {
		return conventionalIncomeDetails_ListViewMobileNumberData;
	}

	@FindBy(xpath = "//ion-title[text()=' References List View ']//ancestor::ion-card//tr[1]//td[6]//span")
	private WebElement conventionalIncomeDetails_ListViewYearsknownData;

	public WebElement conventionalIncomeDetailsListViewYearsknownData() {
		return conventionalIncomeDetails_ListViewYearsknownData;
	}

	@FindBy(xpath = "//ion-title[text()=' References List View ']//ancestor::ion-card//tr[1]//td[7]//span//span")
	private WebElement conventionalIncomeDetails_ListViewStatusData;

	public WebElement conventionalIncomeDetailsListViewStatusData() {
		return conventionalIncomeDetails_ListViewStatusData;
	}

	@FindBy(xpath = "//ion-title[text()=' References List View ']//ancestor::ion-card//p-dropdown[@ng-reflect-placeholder='Export']")
	private WebElement conventionalIncomeDetails_ExportButton;

	public WebElement conventionalIncomeDetailsExportButton() {
		return conventionalIncomeDetails_ExportButton;
	}

	@FindBy(xpath = "//li[@aria-label='PDF']")
	private WebElement conventionalIncomeDetails_ExportPDFOption;

	public WebElement conventionalIncomeDetailsExportPDFOption() {
		return conventionalIncomeDetails_ExportPDFOption;
	}

	@FindBy(xpath = "//li[@aria-label='XLS']")
	private WebElement conventionalIncomeDetails_ExportXLSOption;

	public WebElement conventionalIncomeDetailsExportXLSOption() {
		return conventionalIncomeDetails_ExportXLSOption;
	}
}
