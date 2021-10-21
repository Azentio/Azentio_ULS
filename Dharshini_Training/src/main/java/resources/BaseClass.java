package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExtentReporter;


public class BaseClass {
	WebDriver driver;
	public Properties prop;
	ExtentReports extentReport=ExtentReporter.getExtentReport();
	
	ExtentTest extentTest;

	//this.extentTest=null;
	
	
	public void takescreenshot(String testName,WebDriver driver) throws IOException {
		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
		FileUtils.copyFile(SourceFile,new File(destinationFilePath));
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
	extentTest.info(" Browser launched");
	return driver;
}



	
}

