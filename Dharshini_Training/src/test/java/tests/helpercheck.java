package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.AlertHelper;
import helper.DropDownHelper;
import helper.GenericHelper;
import io.github.bonigarcia.wdm.WebDriverManager;
import resources.BaseClass;

public class helpercheck { 
		
	WebDriver driver;
	DropDownHelper dropDownHelper= new DropDownHelper(driver);
	GenericHelper genericHelper=new GenericHelper();
	AlertHelper alertHelper=new AlertHelper(driver);
	BaseClass baseClass=new BaseClass(driver);
	@Test
	public void OpenApplication() throws IOException, InterruptedException {
		
		    driver= baseClass.initializeDriver();
		    driver.get("http://omayo.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		
			////****Dropdown helper checking
			WebElement dropdown=driver.findElement(By.id("drop1"));
			dropDownHelper.SelectUsingVisibleText(dropdown,"doc 3");
			/*
			////****Generic helper checking
			WebElement element=driver.findElement(By.linkText("Page One"));
			 String value=genericHelper.readValueFromElement(element);
			 System.out.println(value);
		
			
			//******Alert helper checking
			driver.findElement(By.id("alert1")).click();
			alertHelper.AcceptAlert();
			
			*/
			
			Thread.sleep(5000);
			 
	}
}

