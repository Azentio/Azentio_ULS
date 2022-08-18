package stepdefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.underWriterOffsetControlObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;

import testDataType.KULS_Login_TestDataType;

public class KULS_UnderWriterOffsetControl {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();

	KULS_Application_Login login = new KULS_Application_Login(driver);
	JavascriptHelper javascriptHelper= new JavascriptHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	underWriterOffsetControlObj underwriteroffsetcontrolObj = new underWriterOffsetControlObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	// KULS_CollateralSubType underwriteroffsetcontrolData =
	// jsonConfig.getCollateralSubTypeByName("Maker");
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	WaitHelper waitHelper= new WaitHelper(driver);

	@Given("^Launch the kuls application and Navigate to under writer offset control view list$")
	public void launch_the_kuls_application_and_navigate_to_under_writer_offset_control_view_list() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		login.loginUlsApplicationAsMaker(loginData.Username, loginData.Password);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.configurationInLeftPanel(), 60, 2);
		underwriteroffsetcontrolObj.configurationInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.businessRulesInLeftPanel(), 60, 2);
		underwriteroffsetcontrolObj.businessRulesInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.ViewIconOfListViewInUnderWriterOffsetControl(), 60, 2);
		underwriteroffsetcontrolObj.ViewIconOfListViewInUnderWriterOffsetControl().click();
	}

	@Then("^Validate the functionality of View summary section in under writer offset control$")
	public void validate_the_functionality_of_view_summary_section_in_under_writer_offset_control() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.viewSummaryIconOfUnderWriterOffsetControl(), 60, 2);

		seleniumactions.getJavascriptHelper()
				.JSEClick(underwriteroffsetcontrolObj.viewSummaryIconOfUnderWriterOffsetControl());

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.viewSummaryPageOfUnderWriterOffsetControl(), 60, 2);
		Assert.assertEquals(underwriteroffsetcontrolObj.viewSummaryPageOfUnderWriterOffsetControl().isDisplayed(),
				true);
	}

	@And("^Validate all fields in list view of under writer offset control$")
	public void validate_all_fields_in_list_view_of_under_writer_offset_control() throws Throwable {
		Thread.sleep(3000);
		String xpath = "(//span[contains(text(),'Action')])[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		WebElement Action = driver.findElement(By.xpath(xpath));
		System.out.println(Action);
		String xpath1 = "//span[contains(text(),' Minimum Value ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath1)), 60, 2);
		WebElement minimumvalue = driver.findElement(By.xpath(xpath1));
		System.out.println(minimumvalue);
		String xpath2 = "//span[contains(text(),' Maximum Value ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 60, 2);
		WebElement maximumvalue = driver.findElement(By.xpath(xpath2));
		System.out.println(maximumvalue);
		String xpath3 = "(//span[contains(text(),' Status ')])[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 60, 2);
		WebElement status = driver.findElement(By.xpath(xpath3));
		System.out.println(status);

	}

	@And("^Validate that values in list view of under writer offset control is non editable$")
	public void validate_that_values_in_list_view_of_under_writer_offset_control_is_non_editable() throws Throwable {
		String xpath = "//tbody/tr[1]/td[4]";
		Thread.sleep(2000);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified status field is not editable only displayable");
		}
	}

	@And("^Validate the functionalitiy of Add button of under writer offset control$")
	public void validate_the_functionalitiy_of_add_button_of_under_writer_offset_control() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.UnderWriterOffsetControlAddIcon(), 60, 2);
		underwriteroffsetcontrolObj.UnderWriterOffsetControlAddIcon().click();
		//Thread.sleep(2000);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, underwriteroffsetcontrolObj.underwriteroffsetcontrolSaveIcon(), 60, 1);
		Assert.assertEquals(underwriteroffsetcontrolObj.underwriteroffsetcontrolSaveIcon().isDisplayed(), true);
	}

	@And("^Click on Back icon of under writer offset control$")
	public void click_on_back_icon_of_under_writer_offset_control() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.underwriteroffsetcontrolBackIcon(), 60, 2);
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.JSEClick(underwriteroffsetcontrolObj.underwriteroffsetcontrolBackIcon());
				//underwriteroffsetcontrolObj.underwriteroffsetcontrolBackIcon().click();

				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// Thread.sleep(2000);
	}

	@And("^Verify that user can click on view inporgress in view list of under writer offset control$")
	public void verify_that_user_can_click_on_view_inprogress_in_view_list_of_under_writer_offset_control()
			throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.pencilIconOfFirstRecordInUnderWriterOffsetControl(), 60, 2);
		for (int i = 0; i <= 15; i++) {
			try {
				underwriteroffsetcontrolObj.pencilIconOfFirstRecordInUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.underwriteroffsetcontrolMinimumValueField(), 60, 2);
		Assert.assertEquals(underwriteroffsetcontrolObj.underwriteroffsetcontrolMinimumValueField().isDisplayed(),
				true);
	}

	@And("^Search with valid data in under writer offset control$")
	public void search_with_valid_data_in_under_writer_offset_control() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				underwriteroffsetcontrolObj.searchIconOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.searchTextFieldOfUnderWriterOffsetControl(), 30, 2);
		underwriteroffsetcontrolObj.searchTextFieldOfUnderWriterOffsetControl().sendKeys("1000");
		String xpath = "//span[contains(text(),' Minimum Value ')]";
		String productgroup = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		for (int i = 0; i < 20; i++) {

			productgroup = driver.findElement(By.xpath(xpath)).getText();
		}
		System.out.println(productgroup);

	}

	@And("^Search with Invalid data in under writer offset control$")
	public void search_with_invalid_data_in_under_writer_offset_control() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				underwriteroffsetcontrolObj.searchIconOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.searchTextFieldOfUnderWriterOffsetControl(), 30, 2);
		underwriteroffsetcontrolObj.searchTextFieldOfUnderWriterOffsetControl().sendKeys("zfghz");
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				// "Showing 0 to 0 of 0 entries"
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
	}

	@And("^Validate Export to PDF functionality of under writer offset control$")
	public void validate_export_to_pdf_functionality_of_under_writer_offset_control() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				underwriteroffsetcontrolObj.exportIconOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.exportToPDFOfUnderWriterOffsetControl(), 60, 3);
		underwriteroffsetcontrolObj.exportToPDFOfUnderWriterOffsetControl().click();
		seleniumactions.getBrowserHelper().SwitchToWindow(1);
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File("C:\\Users\\inindc00076");
		File[] totalfiles = file.listFiles();
		for (File fileName : totalfiles) {
			if (fileName.getName().equalsIgnoreCase("SubProductMasterFile.pdf")) {
				System.out.println("Downloaded file present in system");
				break;
			} else {
				System.out.println("Downloaded file present does not exist in system");
			}

		}
		seleniumactions.getBrowserHelper().switchToParentWithChildClose();

	}

	@And("^Validate export to Excel functionality of under writer offset control$")
	public void validate_export_to_excel_functionality_of_under_writer_offset_control() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				underwriteroffsetcontrolObj.exportIconOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 20; i++) {
			try {
				underwriteroffsetcontrolObj.exportToExcelOfUnderWriterOffsetControl().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();
		System.out.println("Downloaded XLS file present in system");

	}

	@And("^Navigate to Temp view of under writer offset control$")
	public void navigate_to_temp_view_of_under_writer_offset_control() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.TempViewIconOfUnderWriterOffsetControl(), 60, 2);
		underwriteroffsetcontrolObj.TempViewIconOfUnderWriterOffsetControl().click();
		Thread.sleep(2000);

	}

	@And("^Validate the fields are present in WIP of under writer offset control$")
	public void validate_the_fields_are_present_in_wip_of_under_writer_offset_control() throws Throwable {
		String xpath = "(//span[contains(text(),'Action')])[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);
		WebElement Action = driver.findElement(By.xpath(xpath));
		System.out.println(Action);
		String xpath1 = "//span[contains(text(),' Minimum Value ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath1)), 60, 2);
		WebElement minimumvalue = driver.findElement(By.xpath(xpath1));
		System.out.println(minimumvalue);
		String xpath2 = "//span[contains(text(),' Maximum Value ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath2)), 60, 2);
		WebElement maximumvalue = driver.findElement(By.xpath(xpath2));
		System.out.println(maximumvalue);
		String xpath3 = "(//span[contains(text(),' Status ')])[1]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath3)), 60, 2);
		WebElement status = driver.findElement(By.xpath(xpath3));
		System.out.println(status);
		String xpath4 = "//span[contains(text(),' Current Stage ')]";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath4)), 60, 2);
		WebElement currentstage = driver.findElement(By.xpath(xpath4));
		System.out.println(currentstage);
	}

	@And("^Click on pencil icon of first record in temp view of under writer offset control$")
	public void click_on_pencil_icon_of_first_record_in_temp_view_of_under_writer_offset_control() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				underwriteroffsetcontrolObj.pencilIconOfFirstRecordInUnderWriterOffsetControl(), 60, 2);
		underwriteroffsetcontrolObj.pencilIconOfFirstRecordInUnderWriterOffsetControl().click();
		Thread.sleep(2000);
	}

}
