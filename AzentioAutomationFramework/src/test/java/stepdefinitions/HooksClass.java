package stepdefinitions;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import resources.BaseClass;

public class HooksClass  extends BaseClass  {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeExecution() {
		System.out.println("*** Test Execution started ***");
	}
	@Before
	public void browserSetup() throws IOException {
		driver = initializeDriver();
		
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		driver=BaseClass.driver;
		java.io.File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		  scenario.attach(fileContent, "image/png", "screenshot");
		  
		
	}
	@After
	public void TearDown() {
		driver=BaseClass.driver;
		driver.close();
		
	}
	@BeforeSuite
	public void afterExecution() {
		System.out.println("*** Test Execution Finished ***");
	}
}
