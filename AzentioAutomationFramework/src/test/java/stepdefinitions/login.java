package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.BaseClass;
import resources.ExcelReader;
import utilities.ExtentReporter;
import utilities.ExtentTestManager;

public class login extends BaseClass {

	WebDriver driver;
	LandingPage landingPage;
	LoginPage loginPage;

	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;
	ExcelReader reader = new ExcelReader(System.getProperty("user.dir")+"\\Test-data\\TestData.xlsx");
	
	
	@Given("^Open any Browser$")
	public void open_any_browser() throws IOException {
		driver = initializeDriver();
	}

	@And("^Navigate to Login page$")
	public void navigate_to_login_page() throws InterruptedException {

		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
		landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		ExtentTestManager.getTest().info("User clicks on my account dropdown");
		landingPage.loginOption().click();
		ExtentTestManager.getTest().info("User clicks on login option from dropdown");
	
	}

	@When("^User enters usernamea and password in their respective fields$")
	public void user_enters_usernamea_and_password_in_their_respective_fields() {
		loginPage = new LoginPage(driver);
		String email=reader.getCellData("Login","Username", 2);
		String password=reader.getCellData("Login","Password",2);
		loginPage.emailAddressField().sendKeys(email);
		ExtentTestManager.getTest().info("User Enters username");
		loginPage.passwordField().sendKeys(password);
		ExtentTestManager.getTest().info("User enters valid password");

	}


	@And("^User clicks on Login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		loginPage.loginButton().click();
		ExtentTestManager.getTest().info("User clicks login button after entering credentials");

	}

	@Then("^Verify user is able to successfully login$")
	public void verify_user_is_able_to_successfully_login() {

		Assert.assertTrue(loginPage.EditYourAccountInfo().isDisplayed());
		ExtentTestManager.getTest().info("User verifies the account page is displayed");
		//driver.close();
	}
	
}
