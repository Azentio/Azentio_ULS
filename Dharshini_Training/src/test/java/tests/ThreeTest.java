package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.BaseClass;

public class ThreeTest extends BaseClass { 
	@Test
	public void threetest() throws IOException {
		System.out.println("ThreeTest");
 WebDriver driver=initializeDriver();
		 driver.get("https://www.tutorialsninja.com/demo/");
		 driver.close();
	}
}

