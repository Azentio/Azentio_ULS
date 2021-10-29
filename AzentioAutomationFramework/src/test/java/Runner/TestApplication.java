package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepdefinitions",
		//monochrome=false, //to make steps in color
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} ,//to ipmort the reprt
		
				//dryRun = false,  //to check compilation errors
		        strict = true
		// tags="@register"
				
			
		
		)
public class TestApplication extends  AbstractTestNGCucumberTests{
	

}
