package stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ULS_ConventionalIncomeDetailsObj;
import resources.BaseClass;

public class ULS_ConventionalPersonalIncomeSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ULS_ConventionalIncomeDetailsObj conventionaIncomeDetailsObj = new ULS_ConventionalIncomeDetailsObj(driver);
	Map<String, String> mapTestData = new HashMap<>();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	String downloadPath = "C:\\Users\\inindc00076\\Downloads";
	String pdfFileName = "CustomerReferenceDataFile";
	String xlsFileName = "CustomerReferenceDataFile_export_";
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	SoftAssert softAssert = new SoftAssert();

	@And("^select the customer additional info tab$")
	public void select_the_customer_additional_info_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.ulsAdditionalCustomerInfotab(), 10, 1);
		conventionaIncomeDetailsObj.ulsAdditionalCustomerInfotab().click();

	}

	@And("^select the list view first record of customer personal details record$")
	public void select_the_list_view_first_record_of_customer_personal_details_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.ulsCustomerPersonalInformationListViewFirstRecord(), 10, 1);
		conventionaIncomeDetailsObj.ulsCustomerPersonalInformationListViewFirstRecord().click();
	}

	@Then("^verify reference list view area is visible in application screen$")
	public void verify_reference_list_view_area_is_visible_in_application_screen() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(conventionaIncomeDetailsObj.conventionalDetailsReferenceListView());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(conventionaIncomeDetailsObj.conventionalDetailsReferenceListView().isDisplayed());
	}

	@And("^select the first record of referencelist view$")
	public void select_the_first_record_of_referencelist_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.ulsConvetionalIncomeDetailsListViewFirstRecord(), 10, 1);
		conventionaIncomeDetailsObj.ulsConvetionalIncomeDetailsListViewFirstRecord().click();
	}

	@And("^get the data from the application screen of salutation name mobile number and years of known and status$")
	public void get_the_data_from_the_application_screen_of_salutation_name_mobile_number_and_years_of_known_and_status()
			throws Throwable {
		String salutationFinaldata = "";
		String fullNameFinalData = "";
		String mobileNumberFinalData = "";
		String yearsKnowFinaldata = "";
		String statusFinalData = "";

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsSalutationDropDown(), 10, 1);
		String salutationDropDownData = conventionaIncomeDetailsObj.conventionalIncomeDetailsSalutationDropDown()
				.getAttribute("aria-label");
		String[] salutaionSplit = salutationDropDownData.split(",");
		salutationFinaldata = salutaionSplit[0].trim();
		mapTestData.put("salutationFinaldata", salutationFinaldata);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsCustomerFullNameDataHolder(), 10, 1);
		fullNameFinalData = conventionaIncomeDetailsObj.conventionalIncomeDetailsCustomerFullNameDataHolder()
				.getAttribute("ng-reflect-model");
		mapTestData.put("fullNameFinalData", fullNameFinalData);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsPrimaryMobileNumberDataHolder(), 10, 1);
		mobileNumberFinalData = conventionaIncomeDetailsObj.conventionalIncomeDetailsPrimaryMobileNumberDataHolder()
				.getAttribute("ng-reflect-model");
		mapTestData.put("mobileNumberFinalData", mobileNumberFinalData);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsNoOfYearsKnownDataHolder(), 10, 1);
		yearsKnowFinaldata = conventionaIncomeDetailsObj.conventionalIncomeDetailsNoOfYearsKnownDataHolder()
				.getAttribute("ng-reflect-model");
		mapTestData.put("yearsKnowFinaldata", yearsKnowFinaldata);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsStatusToggle(), 10, 1);
		statusFinalData = conventionaIncomeDetailsObj.conventionalIncomeDetailsStatusToggle()
				.getAttribute("aria-checked");
		mapTestData.put("statusFinalData", statusFinalData);

		System.out.println(mapTestData.get("salutationFinaldata"));
		System.out.println(mapTestData.get("fullNameFinalData"));
		System.out.println(mapTestData.get("mobileNumberFinalData"));
		System.out.println(mapTestData.get("yearsKnowFinaldata"));
		System.out.println(mapTestData.get("statusFinalData"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsCustomerReferenceBackButton(), 10, 1);
		conventionaIncomeDetailsObj.conventionalIncomeDetailsCustomerReferenceBackButton().click();

	}

	@Then("^verify records are matching with our list view record$")
	public void verify_records_are_matching_with_our_list_view_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewSalutationData(), 20, 1);

		
		softAssert.assertEquals(conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewSalutationData().getText(),
				mapTestData.get("salutationFinaldata"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewNameData(), 30, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewNameData().isDisplayed();
				Assert.assertEquals(conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewNameData().getText(),
						mapTestData.get("fullNameFinalData"));
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewMobileNumberData(), 20, 1);
		Assert.assertEquals(conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewMobileNumberData().getText(),
				mapTestData.get("mobileNumberFinalData"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewYearsknownData(), 20, 1);
		for (int i = 0; i <= 30; i++) {
			try {
				Assert.assertEquals(
						conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewYearsknownData().getText(),
						mapTestData.get("yearsKnowFinaldata"));
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		if (mapTestData.get("statusFinalData") == "true") {
			waitHelper.waitForElementToVisibleWithFluentWait(driver,
					conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewStatusData(), 20, 1);
			Assert.assertEquals(conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewStatusData().getText(),
					mapTestData.get("statusFinalData"));
		} else if (mapTestData.get("statusFinalData") == "false") {
			waitHelper.waitForElementToVisibleWithFluentWait(driver,
					conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewStatusData(), 20, 1);
			Assert.assertEquals(conventionaIncomeDetailsObj.conventionalIncomeDetailsListViewStatusData().getText(),
					mapTestData.get("statusFinalData"));
		}

	}

	@And("^click on export button in reference list view$")
	public void click_on_export_button_in_reference_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsExportButton(), 10, 1);
		conventionaIncomeDetailsObj.conventionalIncomeDetailsExportButton().click();
	}

	@And("^click on pdf in reference list view$")
	public void click_on_pdf_in_reference_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsExportPDFOption(), 10, 1);

		clicksAndActionsHelper.moveToElement(conventionaIncomeDetailsObj.conventionalIncomeDetailsExportPDFOption());
		clicksAndActionsHelper.clickUsingActionClass(
				conventionaIncomeDetailsObj.conventionalIncomeDetailsExportPDFOption(),
				conventionaIncomeDetailsObj.conventionalIncomeDetailsExportPDFOption());
		Thread.sleep(500);

	}

	@Then("^verify pdf file is downloaded in our system$")
	public void verify_pdf_file_is_downloaded_in_our_system() throws Throwable {
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

		File file = new File(downloadPath);
		File[] listFiles = file.listFiles();
		List<String> pdfList = new ArrayList<>();

		Arrays.sort(listFiles, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
		for (File files : listFiles) {
			System.out.println("Download files : " + files.toString());
			pdfList.add(files.toString());
		}

		System.out.println(pdfList.get(0));

		Assert.assertTrue(pdfList.get(0).contains(pdfFileName));

//Assert.assertTrue(downlodedPDFFile.contains("CustomerReferenceDataFile"));

	}

	@And("^click on xls field option in export section$")
	public void click_on_xls_field_option_in_export_section() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsExportButton(), 10, 1);
		clicksAndActionsHelper.moveToElement(conventionaIncomeDetailsObj.conventionalIncomeDetailsExportButton());
		clicksAndActionsHelper.clickUsingActionClass(
				conventionaIncomeDetailsObj.conventionalIncomeDetailsExportButton(),
				conventionaIncomeDetailsObj.conventionalIncomeDetailsExportButton());
		// conventionaIncomeDetailsObj.conventionalIncomeDetailsExportButton().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				conventionaIncomeDetailsObj.conventionalIncomeDetailsExportXLSOption(), 10, 1);
		clicksAndActionsHelper.moveToElement(conventionaIncomeDetailsObj.conventionalIncomeDetailsExportXLSOption());
		clicksAndActionsHelper.clickUsingActionClass(
				conventionaIncomeDetailsObj.conventionalIncomeDetailsExportXLSOption(),
				conventionaIncomeDetailsObj.conventionalIncomeDetailsExportXLSOption());
		Thread.sleep(500);
	}

	@Then("^verify xls field is downloaded in the download section$")
	public void verify_xls_field_is_downloaded_in_the_download_section() throws Throwable {
		File file = new File(downloadPath);
		File[] listFiles = file.listFiles();
		List<String> xlsFile = new ArrayList<>();
		for (int i = 0; i <= 50; i++) {
			try {
				Arrays.sort(listFiles, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (File files : listFiles) {
			System.out.println("Download files : " + files.toString());
			xlsFile.add(files.toString());
		}

		System.out.println(xlsFile.get(0));

		Assert.assertTrue(xlsFile.get(0).contains(xlsFileName));
		softAssert.assertAll();
	}

}
