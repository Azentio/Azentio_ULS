package tests;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.BaseClass;

public class FourTest extends BaseClass{
	public WebDriver driver;
	@Test
	public void Fourtest() throws IOException, InterruptedException {
		System.out.println("FourTest");
		  //Logger log = LogManager.getLogger(FourTest.class.getName());
		//og.debug("Test Execution Started");
		  driver=initializeDriver();
		 driver.get(prop.getProperty("url"));

		 Thread.sleep(5000);
		// Assert.assertTrue(false);
		
	}
@AfterMethod
public void closure()
{
	driver.close();
}
}


