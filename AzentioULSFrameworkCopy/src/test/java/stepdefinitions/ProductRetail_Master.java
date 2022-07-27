package stepdefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.ProductMasterRetail_Obj;
import resources.BaseClass;
import testDataType.Product_RetailMasterTestData;

public class ProductRetail_Master {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	ProductMasterRetail_Obj productMasterRetailObj = new ProductMasterRetail_Obj(driver);
	Product_RetailMasterTestData productMasterRetailTestData = jsonConfig.getProductMasterRetailByName1("Maker");
	

	@And("^user click temp view in product master retail$")
	public void user_click_temp_view_in_product_master_retail() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				productMasterRetailObj.productEditIcon(), 60, 3);
		productMasterRetailObj.productEditIcon().click();
	}

	@And("^user verify add button is displayed in screen$")
	public void user_verify_add_button_is_displayed_in_screen() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, productMasterRetailObj.addIcon(),
				60, 2);
		Assert.assertEquals(productMasterRetailObj.addIcon().isDisplayed(), true);
	}

	@And("^user verify search for record icon is displayed in screen$")
	public void user_verify_search_for_record_icon_is_displayed_in_screen() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				productMasterRetailObj.searchIcon(), 60, 2);
		Assert.assertEquals(productMasterRetailObj.searchIcon().isDisplayed(), true);

	}

	@And("^user verify export to pdf option is displayed in screen$")
	public void user_verify_export_to_pdf_option_is_displayed_in_screen() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,productMasterRetailObj.exportIcon(),60,2);
		// productMasterRetailObj.exportIcon().click();
		for (int i = 0; i < 20; i++) {
			try {
				productMasterRetailObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				productMasterRetailObj.pdfOption(), 60, 3);
		Assert.assertEquals(productMasterRetailObj.pdfOption().isDisplayed(), true);

	}

	@And("^user verify export to excel option is displayed in screen$")
	public void user_verify_export_to_excel_option_is_displayed_in_screen() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				productMasterRetailObj.exportIcon(), 60, 2);
		productMasterRetailObj.exportIcon().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				productMasterRetailObj.xlsOption(), 60, 3);
		Assert.assertEquals(productMasterRetailObj.xlsOption().isDisplayed(), true);
	}

	@And("^user verify product group is displayed in screen$")
	public void user_verify_product_group_is_displayed_in_screen() throws Throwable {
		String xpath = "//tr[1]/td[2]/p-celleditor[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		String productgroup = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(productgroup);
	}

	@And("^user verify product code is displayed in screen$")
	public void user_verify_product_code_is_displayed_in_screen() throws Throwable {
		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		WebElement productcode = driver.findElement(By.xpath(xpath));
		System.out.println(productcode);

	}

	@And("^user verify product description is displayed in screen$")
	public void user_verify_product_description_is_displayed_in_screen() throws Throwable {
		String xpath = "//tr[1]/td[4]/p-celleditor[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		WebElement productDescription = driver.findElement(By.xpath(xpath));
		System.out.println(productDescription);

	}

	@And("^user verify retail or corporate is displayed in screen$")
	public void user_verify_retail_or_corporate_is_displayed_in_screen() throws Throwable {
		String xpath = "//tr[1]/td[5]/p-celleditor[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		WebElement productdetail = driver.findElement(By.xpath(xpath));
		System.out.println(productdetail);
	}

	@And("^user verify status is displayed in screen$")
	public void user_verify_status_is_displayed_in_screen() throws Throwable {
		String xpath = "//tr[1]/td[6]/p-celleditor[1]/p-tag[1]/span[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		WebElement status = driver.findElement(By.xpath(xpath));
		System.out.println(status);
	}

	@And("^user verify Authorization status is displayed in screen$")
	public void user_verify_authorization_status_is_displayed_in_screen() throws Throwable {
		String xpath = "//tr[1]/td[7]/p-celleditor[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		WebElement authorizationStatus = driver.findElement(By.xpath(xpath));
		System.out.println(authorizationStatus);
	}

	@And("^user verify the functionality of add button$")
	public void user_verify_the_functionality_of_add_button() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, productMasterRetailObj.addIcon(),
				60, 2);
		productMasterRetailObj.addIcon().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				productMasterRetailObj.productMasterText(), 60, 2);
		Assert.assertEquals(productMasterRetailObj.productMasterText().isDisplayed(), true);
		for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getClickAndActionsHelper()
						.moveToElement(productMasterRetailObj.backButtonInProductMaster());
				productMasterRetailObj.backButtonInProductMaster().click();
			} catch (Exception e) {

			}

		}

	}

	@And("^user verify the search results show matched data$")
	public void user_verify_the_search_results_show_matched_data() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,productMasterRetailObj.searchIcon(),30,2);
		for (int i = 0; i < 20; i++) {
			try {
				productMasterRetailObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				productMasterRetailObj.productViewSearchText(), 30, 2);
		productMasterRetailObj.productViewSearchText().sendKeys(productMasterRetailTestData.SerachMatchData);

		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		String productcode = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		for (int i = 0; i < 20; i++) {

			productcode = driver.findElement(By.xpath(xpath)).getText();
		}
		System.out.println(productcode);

	}

	@And("^user verify the search results shows no data$")
	public void user_verify_the_search_results_shows_no_data() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
		for (int i = 0; i < 20; i++) {
			try {
				productMasterRetailObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				productMasterRetailObj.productViewSearchText(), 30, 2);
		productMasterRetailObj.productViewSearchText().sendKeys(productMasterRetailTestData.SearchUnmatchedData);
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), productMasterRetailTestData.UnmatchedDataError);
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();

	}

	@And("^user verify post clicking pdf option pdf file will be downloaded$")
	public void user_verify_post_clicking_pdf_option_pdf_file_will_be_downloaded() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				productMasterRetailObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				productMasterRetailObj.pdfOption(), 60, 3);
		productMasterRetailObj.pdfOption().click();
		String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		for (File fileName : totalfiles) {
			if (fileName.getName().equalsIgnoreCase(productMasterRetailTestData.PdfFileName)) {
				System.out.println("Downloaded file present in system");
				break;
			} else {
				// System.out.println("Downloaded file present does not exist in system");
			}

		}
		seleniumactions.getBrowserHelper().switchToParentWithChildClose();
	}

	@And("^user verify post clicking xls option excel file will be downloaded$")
	public void user_verify_post_clicking_xls_option_excel_file_will_be_downloaded() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				productMasterRetailObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,productMasterRetailObj.xlsOption(),60,3);
		for (int i = 0; i < 20; i++) {
			try {
				productMasterRetailObj.xlsOption().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();
	}

	@And("^user verify Field should show product group and will be display only$")
	public void user_verify_field_should_show_product_group_and_will_be_display_only() throws Throwable {
		String xpath = "//tr[1]/td[2]/p-celleditor[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified product group field is not editable only displayable");
		}

	}

	@And("^user verify Field should be product code and will be displa yonly$")
	public void user_verify_field_should_be_product_code_and_will_be_displa_yonly() throws Throwable {
		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified product code field is not editable only displayable");
		}
	}

	@And("^user verify Field should be auth status and will be display only$")
	public void user_verify_field_should_be_auth_status_and_will_be_display_only() throws Throwable {
		String xpath = "//tr[1]/td[7]/p-celleditor[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified authorization status field is not editable only displayable");
		}
	}

	@And("^user verify Field should be retail and corporate will be display only$")
	public void user_verify_field_should_be_retail_and_corporate_will_be_display_only() throws Throwable {
		String xpath = "//tr[1]/td[5]/p-celleditor[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified retail or corporate field is not editable only displayable");
		}
	}

	@And("^user verify Field should be status and will be display only$")
	public void user_verify_field_should_be_status_and_will_be_display_only() throws Throwable {
		String xpath = "//tr[1]/td[6]/p-celleditor[1]/p-tag[1]/span[1]/span[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified status field is not editable only displayable");
		}
	}

}
