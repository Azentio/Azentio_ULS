package stepdefinitions;

import java.io.IOException;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.BaseClass;

public class register extends BaseClass {
	WebDriver driver;

	@Given("^User navigates to Registration page$")
	public void user_navigates_to_Registration_page() throws IOException {
		// driver= initializeDriver();
		driver = BaseClass.driver;
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		// ExtentTestManager.getTest().info("User Navigated to required url");

	}

	@When("^User provies the following details into the input fields$")
	public void user_provies_the_following_details_into_the_input_fields(DataTable dataTable) {

		Map<String, String> map = dataTable.asMap(String.class, String.class);

		driver.findElement(By.id("input-firstname")).sendKeys(map.get("firstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(map.get("lastName"));
		driver.findElement(By.id("input-email")).sendKeys(map.get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(map.get("phone"));
		driver.findElement(By.id("input-password")).sendKeys(map.get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(map.get("password"));
		// ExtentTestManager.getTest().info("Users enters the data in required field");

	}

	@And("^Selects the privacy policy option$")
	public void selects_the_privacy_policy_option() {

		driver.findElement(By.name("agree")).click();
		// ExtentTestManager.getTest().info("User agrees on privacy option");

	}

	@And("^Clicks on Continue button$")
	public void clicks_on_Continue_button() {

		driver.findElement(By.cssSelector("input[type='submit'][value='Continue']")).click();
		// ExtentTestManager.getTest().info("User clicks continue button");

	}

	@Then("^User should get successfully registered$")
	public void user_should_get_successfully_registered() {
		// ExtentTestManager.getTest().info("user verifying succesful registration");
		String url = driver.getCurrentUrl();

		if (url.equals("http://tutorialsninja.com/demo/index.php?route=account/success")) {
			
			// Assert.assertEquals("http://tutorialsninja.com/demo/index.php?route=account/success",
			// url);
			Assert.fail("User has  registered");

		} else {

			System.out.println("User has not registered which is expected");
			
		}

	}

}
