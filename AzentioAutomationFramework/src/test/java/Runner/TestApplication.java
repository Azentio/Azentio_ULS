package Runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepdefinitions",
		//monochrome=false, //to make steps in color
		plugin= {"pretty","html:target//cucumber_html_report.html"} ,//to ipmort the reprt
		
				//dryRun = false,  //to check compilation errors
		        strict = true
		//tags={"@login"}
				//@Listeners({com.coveros.utilities.Listener.class})
				//tags = {"@login "@register"}
		
		)
public class TestApplication extends  AbstractTestNGCucumberTests{
	public WebDriver driver;

}
