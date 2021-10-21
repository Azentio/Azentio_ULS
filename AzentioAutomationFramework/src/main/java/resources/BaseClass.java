package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import utilities.ExtentReporter;
import utilities.ExtentTestManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BaseClass {
	Logger log = LogManager.getLogger(BaseClass.class.getName());
	public Properties prop;
	ExtentReports extentReport=ExtentReporter.getExtentReport();
	
	ExtentTest extentTest;
	   public static WebDriver driver;
	
	
public  void takeScreenshot(String testName,WebDriver driver) throws IOException {
		
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
		FileUtils.copyFile(SourceFile,new File(destinationFilePath));
	
	}
public static String takeScreenshotForReport(String testName,WebDriver driver) throws IOException {
	
	File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\fail.png";
	FileUtils.copyFile(SourceFile,new File(destinationFilePath));
	return destinationFilePath;


}
public WebDriver initializeDriver( )throws IOException {
	
	 prop=new Properties();
	String proppath= System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
	//System.out.println(proppath);
	FileInputStream fis =new FileInputStream(proppath);
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}else if(browserName.equalsIgnoreCase("firefox")) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	
	
		
	}else if(browserName.equalsIgnoreCase("ie")) {
		
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	//ExtentTestManager.getTest().info(prop.getProperty("browser") +"Browser Initiated");
	
	return driver;
}


	
}

