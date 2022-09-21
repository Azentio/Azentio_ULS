package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

public class ProjectMaster_CheckerReturn extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Checker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	ProjectMasterOBJ project = new ProjectMasterOBJ(driver);

	@Given("^User Login into checker in project master$")
	public void user_login_into_checker_in_project_master() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		applicationLogin.ulSApplicationLoginAsAChecker(json.readdata());

	}

	@Given("^User Login into maker in project master$")
	public void user_login_into_maker_in_project_master() throws Throwable {

	}

	@Then("^Click the menu icon in project master checker$")
	public void click_the_menu_icon_in_project_master_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, project.menuChecker(), 60, 5);
		project.menuChecker().click();

	}

	@Then("^verify the return confirmation in project master checker$")
	public void verify_the_return_confirmation_in_project_master_checker() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, project.recordMsgChecker(), 60, 5);
		System.out.println(project.recordMsgChecker().getText());

	}

	@Then("^Click the project setup in project master$")
	public void click_the_project_setup_in_project_master() throws Throwable {

	}

	@Then("^Verify the return record present in the maker stage$")
	public void verify_the_return_record_present_in_the_maker_stage() throws Throwable {

	}

	@And("^Click the inbox icon in project master checker$")
	public void click_the_inbox_icon_in_project_master_checker() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, project.inboxiconChecker(), 60, 5);
		project.inboxiconChecker().click();

	}

	@And("^Click the action editicon using reference id in project master$")
	public void click_the_action_editicon_using_reference_id_in_project_master() throws Throwable {

		String xpath1 = "//span[contains(text(),'36')]//parent::td//preceding-sibling::td//child::button";

		WebElement actionedit = driver.findElement(By.xpath(xpath1));
		actionedit.click();

	}

	@And("^Click return button in project master checker$")
	public void click_return_button_in_project_master_checker() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, project.CheckerReturn(), 60, 5);
		project.CheckerReturn().click();
		
		help.waitForElementToVisibleWithFluentWait(driver, project.popupremark(), 60, 5);
		project.popupremark().click();
		project.popupremark().sendKeys("return");
		
		help.waitForElementToVisibleWithFluentWait(driver, project.popupReturn(), 60, 5);
		project.popupReturn().click();
		

	}

	@And("^Click the project master wip$")
	public void click_the_project_master_wip() throws Throwable {

	}

	@And("^Click the inbox icon in project master maker$")
	public void click_the_inbox_icon_in_project_master_maker() throws Throwable {

	}

}
