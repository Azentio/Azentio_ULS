package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import resources.BaseClass;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

public class Listeners extends BaseClass implements ITestListener {
	public WebDriver driver;
	ExtentTest extentTest;

	
	//Method called before every execution
	public void onStart(ITestContext context) {
	
		System.out.println("*** Test Suite " + context.getName() + " started ***");
	}
	
	//Method called after every execution
	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		try {
			takeScreenshot("ScreencaptureWhiletestEnds", BaseClass.driver);
		} catch (Exception e) {

			e.printStackTrace();
		}

		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

	//Method called before every steps
	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		ExtentTestManager.startTest(result.getMethod().getDescription());
		System.out.println(result);
	}
	//Method called after  steps is it gets passed
	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
		ExtentTestManager.getTest().log(Status.PASS, "Test passed");
		System.out.println(result);
		try {
			String screenshotPath = takeScreenshotForPassedReport(result.getName(), BaseClass.driver);
			ExtentTestManager.getTest().log(Status.PASS, "Screenshot: ",
					MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			System.out.println(screenshotPath);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	//Method called after  steps is it gets failed
	public void onTestFailure(ITestResult result) {

		String testMethodName = result.getName();

		try {

			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			takeScreenshot(testMethodName, BaseClass.driver);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
		try {
			String screenshotPath = takeScreenshotForFailureReport(result.getName(), BaseClass.driver);
			ExtentTestManager.getTest().log(Status.FAIL, "Screenshot: ",
					MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			System.out.println(screenshotPath);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
