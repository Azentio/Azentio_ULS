package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.BaseClass;
import utilities.ExtentReporter;

public class login extends BaseClass  {

	
	WebDriver driver;
	 LandingPage landingPage;
		LoginPage loginPage;
	 
		ExtentReports extentReport=ExtentReporter.getExtentReport();
		ExtentTest extentTest;
		
		@Before
		public void openBrowser() throws IOException {
			
			driver= initializeDriver();
		}
	@Given("^Open any Browser$")
    public void open_any_browser() throws IOException {
		
		driver= initializeDriver();
		
		extentTest.info(" Browser launched");
    }
	

@And("^Navigate to Login page$")
public void navigate_to_login_page() throws InterruptedException {
	
	driver.get(prop.getProperty("url"));
	Thread.sleep(2000);
	  landingPage= new LandingPage(driver);
	 landingPage.myAccountDropdown().click();
	 landingPage.loginOption().click();	
	 
		Thread.sleep(2000);
}
	
@When("^User enters usernamea and password in their respective fields$")
public void user_enters_usernamea_and_password_in_their_respective_fields(){
	 loginPage= new LoginPage(driver);
	 loginPage.emailAddressField().sendKeys(prop.getProperty("email"));
	 loginPage.passwordField().sendKeys(prop.getProperty("password"));
	
}


@And("^User clicks on Login button$")
public void user_clicks_on_login_button() throws InterruptedException {
	Thread.sleep(2000);
	 loginPage.loginButton().click();
   
}

@Then("^Verify user is able to successfully login$")
public void verify_user_is_able_to_successfully_login() {
	
   Assert.assertTrue(loginPage.EditYourAccountInfo().isDisplayed());
}

@After
public void close() {
	driver.close();
}


}
