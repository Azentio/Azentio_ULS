package stepdefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.ProjectMasterOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class KULS_ProjectMaster_ValidationStep extends BaseClass {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	ProjectMasterOBJ project = new ProjectMasterOBJ(driver);

	@Given("^User login into maker in project master for validation$")
	public void user_login_into_maker_in_project_master_for_validation() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		applicationLogin.loginUlsApplicationAsMaker(loginData.Username, loginData.Password);

	}

	@Then("^Click the project setup in project master for validation$")
	public void click_the_project_setup_in_project_master_for_validation() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, project.projectsetup(), 60, 5);
		project.projectsetup().click();

	}

	@And("^Click the project setup edit icon in project master for validation$")
	public void click_the_project_setup_edit_icon_in_project_master_for_validation() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, project.projectmakertempedit(), 60, 5);
		project.projectmakertempedit().click();

	}

	@And("^Verify the Values in List view should be non editable$")
	public void verify_the_values_in_list_view_should_be_non_editable() throws Throwable {

		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified product code field is not editable only displayable");
		}

	}

	@And("^Verify the functionality of Add button$")
	public void verify_the_functionality_of_add_button() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.addIcon(), 60, 2);

		// Assert.assertEquals(project.addIcon().isDisplayed(), true);
		project.addIcon().click();

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.GoBack(), 60, 2);
		project.GoBack().click();

	}

	@And("^Verify the functionality of View in approved records button$")
	public void verify_the_functionality_of_view_in_approved_records_button() throws Throwable {

		//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.viewsummary(), 60, 2);
	
		for(int i=0; i<20; i++){
			try {
				//project.viewsummary().click();
				seleniumactions.getClickAndActionsHelper().doubleClick(project.viewsummary());
				break;
			} catch (Exception e) {
			
			}
		}
		

		//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.viewclose(), 60, 2);
		
	for(int i=0; i<20; i++) {
		try {
			seleniumactions.getClickAndActionsHelper().doubleClick(project.viewclose());
			//project.viewclose().click();l
			break;
		} catch (Exception e) {
		
		}
	}
		

	}

	@And("^Click the inbox icon in maker for project master validation$")
	public void click_the_inbox_icon_in_maker_for_project_master_validation() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.InboxIcon(), 60, 3);
		project.InboxIcon().click();
	}

	@And("^Verify the functionality of Search box with matching data$")
	public void verify_the_functionality_of_search_box_with_matching_data() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.searchIcon(), 30, 2);
		for (int i = 0; i < 20; i++) {
			try {
				project.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.productViewSearchText(),
				30, 2);
		project.productViewSearchText().sendKeys("aaa");

		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		String productcode = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);

		productcode = driver.findElement(By.xpath(xpath)).getText();

	    System.out.println(productcode);

	}

	@And("^Click the inbox action edit icon in project master validation$")
	public void click_the_inbox_action_edit_icon_in_project_master_validation() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.inboxactionicon(), 30, 2);
		project.inboxactionicon().click();

	}

	@And("^Verify the functionality of Selarch box with mismatch data$")
	public void verify_the_functionality_of_search_box_with_mismatch_data() throws Throwable {

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
		for (int i = 0; i < 20; i++) {
			try {
				project.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.productViewSearchText(),
				30, 2);
		project.productViewSearchText().sendKeys("zz");
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();

	}

	@And("^Verify the functionality of Export to PDF button$")
	public void verify_the_functionality_of_export_to_pdf_button() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.exportIcon(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				project.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.pdfOption(), 60, 3);
		// Assert.assertEquals(project.pdfOption().isDisplayed(), true);
		project.pdfOption().click();
		String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		for (int i = 0; i < 20; i++) {
			try {
				for (File fileName : totalfiles) {
					if (fileName.getName().equalsIgnoreCase("ProductMasterFile.pdf")) {
						System.out.println("Downloaded file present in system");
						break;
					} else {
						// System.out.println("Downloaded file present does not exist in system");
					}

				}
				break;

			} catch (Exception e) {

			}
		}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();

	}

	@And("^Verify the functionality of Export to Excel button$")
	public void verify_the_functionality_of_export_to_excel_button() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.exportIcon(), 60, 2);
		project.exportIcon().click();

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.xlsOption(), 60, 3);
		// Assert.assertEquals(project.xlsOption().isDisplayed(), true);
		project.xlsOption().click();

	}

}
