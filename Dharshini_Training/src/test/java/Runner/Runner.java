package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue="stepdefinitions",
		monochrome=false, //to make steps in color
		plugin= {"pretty","html:target//cucumber_html_report.html"},  //to ipmort the reprt
		
				dryRun = false,  //to check compilation errors
		        //strict = true,
		tags="@TC_01"
		
				//tags={"@SmokeTest","@Books"}
		)
public class Runner extends  AbstractTestNGCucumberTests{

}
