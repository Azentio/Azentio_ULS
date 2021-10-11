package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.BaseClass;

public class TwoTest extends BaseClass {
	@Test
	public void Twotest() throws IOException {
		System.out.println("TwoTest");
		 WebDriver driver=initializeDriver();
		 driver.get("https://www.tutorialsninja.com/demo/");
		 driver.close();
	}
	

}
