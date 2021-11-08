package stepdefinitions;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import resources.BaseClass;

public class HooksClass extends BaseClass {
	WebDriver driver;

	

	@Before
	public void browserSetup(Scenario scenario) throws IOException {
		driver = initializeDriver();
		System.out.println("Driver Initiated");
		String name=scenario.getName();
		System.out.println("Scenario : **"+ name + "** Started executing");

	}

	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		driver = BaseClass.driver;
		java.io.File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		scenario.attach(fileContent, "image/png", "screenshot");

	}

	@After
	public void TearDown(Scenario scenario) {
		driver = BaseClass.driver;
		driver.close();
		System.out.println("Browser closed");
		String name=scenario.getName();
		System.out.println("Scenario : **"+ name + "** Stopped executing");
	}

}
