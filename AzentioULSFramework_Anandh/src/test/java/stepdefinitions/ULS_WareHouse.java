package stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ULS_WareHouseObj;
import resources.BaseClass;
import testDataType.KULS_WareHouseMasterTestData;

public class ULS_WareHouse extends BaseClass {
	WebDriver driver = BaseClass.driver;

	ULS_WareHouseObj wareHouseObj = new ULS_WareHouseObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	KULS_WareHouseMasterTestData wareHouseTestData = jsonConfig.getUlsWareHouseTestDataByName("Maker");
	List<String> xlsList = new ArrayList<>();
	List<String> pdfList = new ArrayList<>();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	Map<String, String> testData = new HashMap<>();
	JavascriptHelper javascriptHelper= new JavascriptHelper(driver);

	@And("^Go to config manager main menu$")
	public void go_to_config_manager_main_menu() throws Throwable {
		//waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.ulsConfigManagerMainMenu(), 5, 1);
		for(int i=0;i<=15;i++)
		{
			try
			{
		javascriptHelper.scrollIntoViewAndClick(wareHouseObj.ulsConfigManagerMainMenu());
			break;
			}
			catch(Exception e)
			{
				if(i==15)
				{
					Assert.fail(e.getMessage());
				}
			}
			}
		//wareHouseObj.ulsConfigManagerMainMenu().click();
	}
	@And("^go to configuration main menu$")
    public void go_to_configuration_main_menu() throws Throwable {
     waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.ULSConfigurationMainMenu(), 5, 1);
     wareHouseObj.ULSConfigurationMainMenu().click();
	}

	@And("^click on view button in ware house master$")
	public void click_on_view_button_in_ware_house_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseMasterViewButton(), 5, 1);
		wareHouseObj.wareHouseMasterViewButton().click();
	}

	@Then("^verify list view records are non editable$")
	public void verify_list_view_records_are_non_editable() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewDescription(), 5, 1);
		try {
			wareHouseObj.wareHouseListViewDescription().click();
			wareHouseObj.wareHouseListViewDescription().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
		try {
			wareHouseObj.wareHouseListViewAddress().click();
			wareHouseObj.wareHouseListViewAddress().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewCountry().click();
			wareHouseObj.wareHouseListViewCountry().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewState().click();
			wareHouseObj.wareHouseListViewState().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewCity().click();
			wareHouseObj.wareHouseListViewCity().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewZipCode().click();
			wareHouseObj.wareHouseListViewZipCode().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewPhone1().click();
			wareHouseObj.wareHouseListViewPhone1().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewFax().click();
			wareHouseObj.wareHouseListViewFax().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewEmail().click();
			wareHouseObj.wareHouseListViewEmail().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewContactPerson().click();
			wareHouseObj.wareHouseListViewContactPerson().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@Then("^verify user can able to add the record in to the ware house master screen$")
	public void verify_user_can_able_to_add_the_record_in_to_the_ware_house_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseAddButton(), 5, 1);
		wareHouseObj.wareHouseAddButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseDescriptionTextBox(), 5, 1);
		Assert.assertTrue(wareHouseObj.wareHouseDescriptionTextBox().isDisplayed());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseBackButton(), 5, 1);
		wareHouseObj.wareHouseBackButton().click();
	}

	@And("^click on search button in ware house list view$")
	public void click_on_search_button_in_ware_house_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseSearchIcon(), 5, 1);
		for (int i = 0; i <= 15; i++) {
			try {
				wareHouseObj.wareHouseSearchIcon().click();
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^enter the matching data in search test box$")
	public void enter_the_matching_data_in_search_test_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseSearchTextBox(), 5, 1);
		clicksAndActionsHelper.moveToElement(wareHouseObj.wareHouseSearchTextBox());
		clicksAndActionsHelper.clickOnElement(wareHouseObj.wareHouseSearchTextBox());
		wareHouseObj.wareHouseSearchTextBox().sendKeys(wareHouseTestData.searchingWithMatchData);
	}

	@Then("^verify user can able to see the matching record$")
	public void verify_user_can_able_to_see_the_matching_record() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 15; i++) {
			try {
				status = driver
						.findElement(By.xpath("//span[text()='" + wareHouseTestData.searchingWithMatchData + " ']"))
						.isDisplayed();

			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}

			}
		}
		Assert.assertTrue(status);
	}

	@And("^enter invalid text inputin search box$")
	public void enter_invalid_text_inputin_search_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseTextBoxCloseButton(), 5, 1);
		wareHouseObj.wareHouseTextBoxCloseButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseSearchIcon(), 5, 1);
		wareHouseObj.wareHouseSearchIcon().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseSearchTextBox(), 5, 1);
		clicksAndActionsHelper.moveToElement(wareHouseObj.wareHouseSearchTextBox());
		clicksAndActionsHelper.clickOnElement(wareHouseObj.wareHouseSearchTextBox());
		wareHouseObj.wareHouseSearchTextBox().sendKeys(wareHouseTestData.searchingWithUnmatchedData);
	}

	@Then("^verify system should not show the result for the un matched record$")
	public void verify_system_shoudl_not_show_the_result_for_the_un_matched_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseUnmatchedSearchResult(), 5, 1);
		Assert.assertTrue(wareHouseObj.wareHouseUnmatchedSearchResult().isDisplayed());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseTextBoxCloseButton(), 5, 1);
		wareHouseObj.wareHouseTextBoxCloseButton().click();
	}

	@Then("^verify xls file is downloded in download section$")
	public void verify_xls_file_is_downloded_in_download_section() throws Throwable {
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();

		for (File fileName : totalfiles) {
			System.out.println("File name" + fileName);
			xlsList.add(fileName.toString());
		}

		int size = xlsList.size();
		String string = xlsList.get(size - 1);
		boolean status = string.contains(wareHouseTestData.FileNameForXlsFile);

		Assert.assertTrue(status);
	}

	@And("^click on export button$")
	public void click_on_export_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseExportButton(), 5, 1);
		wareHouseObj.wareHouseExportButton().click();
	}

	@And("^choose xls format to download the Xls file$")
	public void choose_xls_format_to_download_the_xls_file() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseExportXLSOption(), 5, 1);
		clicksAndActionsHelper.moveToElement(wareHouseObj.wareHouseExportXLSOption());
		 clicksAndActionsHelper.doubleClick(wareHouseObj.wareHouseExportXLSOption());
		//wareHouseObj.wareHouseExportXLSOption().click();
		// Thread.sleep(5000);

	}

	@And("^choose pdf format to download pdf file$")
	public void choose_pdf_format_to_download_pdf_file() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseExportPDFOption(), 5, 1);
		clicksAndActionsHelper.moveToElement(wareHouseObj.wareHouseExportPDFOption());
		 clicksAndActionsHelper.doubleClick(wareHouseObj.wareHouseExportPDFOption());
		//wareHouseObj.wareHouseExportPDFOption().click();
       // Thread.sleep(5000);
		browserHelper.SwitchToWindow(1);
		browserHelper.switchToParentWithChildClose();

	}

	@Then("^verify pdf file is downloded in download section$")
	public void verify_pdf_file_is_downloded_in_download_section() throws Throwable {
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();

		for (File fileName : totalfiles) {
			System.out.println("File name" + fileName);
			pdfList.add(fileName.toString());
		}

		int size = pdfList.size();
		String string = pdfList.get(size - 1);
		boolean status = string.contains(wareHouseTestData.FileNameForPDFFile);

		Assert.assertTrue(status);
	}

	@And("^select the first approved record$")
	public void select_the_first_approved_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseApprovedFirstRecord(), 5, 1);
		wareHouseObj.wareHouseApprovedFirstRecord().click();
	}

	@And("^Get The approved record data$")
	public void get_the_approved_record_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_Description(), 5, 1);
		String description = wareHouseObj.Warehouse_Description().getAttribute("ng-reflect-model");
		testData.put("description", description);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_Address(), 5, 1);
		String address = wareHouseObj.Warehouse_Address().getAttribute("ng-reflect-model");
		testData.put("address", address);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseCountryDropDownData(), 5, 1);
		String country = wareHouseObj.wareHouseCountryDropDownData().getAttribute("aria-label");
		testData.put("country", country);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseStateDropDown(), 5, 1);
		String state = wareHouseObj.wareHouseStateDropDown().getAttribute("aria-label");
		testData.put("state", state);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseCityDropDown(), 5, 1);
		String city = wareHouseObj.wareHouseCityDropDown().getAttribute("aria-label");
		testData.put("city", city);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseZipCodeDropDOwnDataHolder(), 5,
				1);
		String ZipCode = wareHouseObj.wareHouseZipCodeDropDOwnDataHolder().getAttribute("aria-label");
		testData.put("ZipCode", ZipCode);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_Phone1_validation(), 5, 1);
		String phone1 = wareHouseObj.Warehouse_Phone1_validation().getAttribute("ng-reflect-model");
		testData.put("phone1", phone1);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_Fax(), 5, 1);
		String fax = wareHouseObj.Warehouse_Fax().getAttribute("ng-reflect-model");
		testData.put("fax", fax);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_Email(), 5, 1);
		String email = wareHouseObj.Warehouse_Email().getAttribute("ng-reflect-model");
		testData.put("email", email);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_ContactPerson(), 5, 1);
		String contactPerson = wareHouseObj.Warehouse_ContactPerson().getAttribute("ng-reflect-model");
		testData.put("contactPerson", contactPerson);

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// wareHouseObj.wareHouseToggleButton(), 5, 1);
		String status = wareHouseObj.wareHouseToggleButton().getAttribute("value");
		testData.put("status", status);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseBackButton(), 5, 1);
		wareHouseObj.wareHouseBackButton().click();
	}

	@Then("^verify System should display the currect description value$")
	public void verify_system_should_display_the_currect_description_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewDescription(), 5, 1);
		Assert.assertEquals(testData.get("description"), wareHouseObj.wareHouseListViewDescription().getText());
	}

	@Then("^verify system should display the currect address value$")
	public void verify_system_should_display_the_currect_address_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewAddress(), 5, 1);
		Assert.assertEquals(testData.get("address"), wareHouseObj.wareHouseListViewAddress().getText());
	}

	@Then("^verify System should display the currect country value$")
	public void verify_system_should_display_the_currect_country_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewCountry(), 5, 1);
		// Assert.assertEquals(testData.get("country"),
		// wareHouseObj.wareHouseListViewCountry().getText());
		Assert.assertTrue(testData.get("country").contains(wareHouseObj.wareHouseListViewCountry().getText()));
	}

	@Then("^verify system should display the currect state value$")
	public void verify_system_should_display_the_currect_state_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewState(), 5, 1);
		// Assert.assertEquals(testData.get("state"),
		// wareHouseObj.wareHouseListViewState().getText());
		Assert.assertTrue(testData.get("state").contains(wareHouseObj.wareHouseListViewState().getText()));
	}

	@Then("^verify system should display the currect city value$")
	public void verify_system_should_display_the_currect_city_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewCity(), 5, 1);
		// Assert.assertEquals(testData.get("city"),
		// wareHouseObj.wareHouseListViewCity().getText());
		Assert.assertTrue(testData.get("city").contains(wareHouseObj.wareHouseListViewCity().getText()));
	}

	@Then("^verify system should display the currect zip code value$")
	public void verify_system_should_display_the_currect_zip_code_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewZipCode(), 5, 1);
		// Assert.assertEquals(testData.get("city"),
		// wareHouseObj.wareHouseListViewCity().getText());
		// Assert.assertEquals(testData.get("ZipCode"),
		// wareHouseObj.wareHouseListViewZipCode().getText());
		Assert.assertTrue(testData.get("ZipCode").contains(wareHouseObj.wareHouseListViewZipCode().getText()));
	}

	@Then("^verify system should display the currect phone 1 value$")
	public void verify_system_should_display_the_currect_phone_1_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewPhone1(), 5, 1);
		Assert.assertEquals(testData.get("phone1"), wareHouseObj.wareHouseListViewPhone1().getText());
	}

	@Then("^verify system should display the currect fax value$")
	public void verify_system_should_display_the_currect_fax_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewFax(), 5, 1);
		Assert.assertEquals(testData.get("fax"), wareHouseObj.wareHouseListViewFax().getText());
	}

	@Then("^verify system should display the currect mail value$")
	public void verify_system_should_display_the_currect_mail_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewEmail(), 5, 1);
		Assert.assertEquals(testData.get("email"), wareHouseObj.wareHouseListViewEmail().getText());
	}

	@Then("^verify system shoudl display the currect contarct person value$")
	public void verify_system_shoudl_display_the_currect_contarct_person_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewContactPerson(), 5, 1);
		Assert.assertEquals(testData.get("contactPerson"), wareHouseObj.wareHouseListViewContactPerson().getText());
	}

	@Then("^verify system shoudl display the exact status of the record$")
	public void verify_system_shoudl_display_the_exact_status_of_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseStatus(), 5, 1);
		if (wareHouseObj.wareHouseStatus().getText().equals("Active")) {
			Assert.assertEquals(testData.get("status"), "on");
		}

	}

	@And("^click on temp view in wareHouse master screen$")
	public void click_on_temp_view_in_warehouse_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseMasterTempView(), 5, 1);
		wareHouseObj.wareHouseMasterTempView().click();
	}

	@Then("^verify WIP list view records are non editable$")
	public void verify_wip_list_view_records_are_non_editable() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseListViewDescription(), 5, 1);
		try {
			wareHouseObj.wareHouseListViewDescription().click();
			wareHouseObj.wareHouseListViewDescription().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
		try {
			wareHouseObj.wareHouseListViewAddress().click();
			wareHouseObj.wareHouseListViewAddress().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewCountry().click();
			wareHouseObj.wareHouseListViewCountry().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewState().click();
			wareHouseObj.wareHouseListViewState().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewCity().click();
			wareHouseObj.wareHouseListViewCity().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewZipCode().click();
			wareHouseObj.wareHouseListViewZipCode().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewPhone1().click();
			wareHouseObj.wareHouseListViewPhone1().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewFax().click();
			wareHouseObj.wareHouseListViewFax().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewEmail().click();
			wareHouseObj.wareHouseListViewEmail().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			wareHouseObj.wareHouseListViewContactPerson().click();
			wareHouseObj.wareHouseListViewContactPerson().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}
	@And("^select the first record in WIP$")
    public void select_the_first_record_in_wip() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseApprovedFirstRecord(), 5, 1);
		wareHouseObj.wareHouseApprovedFirstRecord().click();
    }

    @And("^Get The WIP record data$")
    public void get_the_wip_record_data() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_Description(), 5, 1);
		String description = wareHouseObj.Warehouse_Description().getAttribute("ng-reflect-model");
		testData.put("description", description);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_Address(), 5, 1);
		String address = wareHouseObj.Warehouse_Address().getAttribute("ng-reflect-model");
		testData.put("address", address);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseCountryDropDownData(), 5, 1);
		String country = wareHouseObj.wareHouseCountryDropDownData().getAttribute("aria-label");
		testData.put("country", country);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseStateDropDown(), 5, 1);
		String state = wareHouseObj.wareHouseStateDropDown().getAttribute("aria-label");
		testData.put("state", state);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseCityDropDown(), 5, 1);
		String city = wareHouseObj.wareHouseCityDropDown().getAttribute("aria-label");
		testData.put("city", city);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseZipCodeDropDOwnDataHolder(), 5,
				1);
		String ZipCode = wareHouseObj.wareHouseZipCodeDropDOwnDataHolder().getAttribute("aria-label");
		testData.put("ZipCode", ZipCode);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_Phone1_validation(), 5, 1);
		String phone1 = wareHouseObj.Warehouse_Phone1_validation().getAttribute("ng-reflect-model");
		testData.put("phone1", phone1);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_Fax(), 5, 1);
		String fax = wareHouseObj.Warehouse_Fax().getAttribute("ng-reflect-model");
		testData.put("fax", fax);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_Email(), 5, 1);
		String email = wareHouseObj.Warehouse_Email().getAttribute("ng-reflect-model");
		testData.put("email", email);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.Warehouse_ContactPerson(), 5, 1);
		String contactPerson = wareHouseObj.Warehouse_ContactPerson().getAttribute("ng-reflect-model");
		testData.put("contactPerson", contactPerson);

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// wareHouseObj.wareHouseToggleButton(), 5, 1);
		String status = wareHouseObj.wareHouseToggleButton().getAttribute("value");
		testData.put("status", status);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, wareHouseObj.wareHouseBackButton(), 5, 1);
		wareHouseObj.wareHouseBackButton().click();
    }

}
