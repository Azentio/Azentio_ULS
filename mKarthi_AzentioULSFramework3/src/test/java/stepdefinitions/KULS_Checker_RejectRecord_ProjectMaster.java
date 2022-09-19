package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ProjectMasterOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class KULS_Checker_RejectRecord_ProjectMaster {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Checker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	ProjectMasterOBJ project = new ProjectMasterOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);

	@And("^user Click on Reject icon$")
	   public void user_click_on_reject_icon() throws Throwable {
	   help.waitForElementToVisibleWithFluentWait(driver, project.CheckerReject(), 60, 2);
	   project.CheckerReject().click();
	
	}

	@And("^user Enter the remarks for Reject the Record$")
	public void user_enter_the_remarks_for_reject_the_record() throws Throwable {
      help.waitForElementToVisibleWithFluentWait(driver, project.popupremark(), 60, 2);
	  project.popupremark().sendKeys("Reject");
    
	}

	@Then("^user Click on Remarks button for Reject confirmation$")
	public void user_click_on_remarks_button_for_reject_confirmation() throws Throwable {
	  help.waitForElementToVisibleWithFluentWait(driver, project.popupreject(), 60, 2);
	  project.popupreject().click();
    
	}

	@Then("^user verify the Record got Rejected$")
	public void user_verify_the_record_got_rejected() throws Throwable {
	  help.waitForElementToVisibleWithFluentWait(driver, project.recordMsgChecker(), 60, 2);
	  String Toast;
	  Toast = project.recordMsgChecker().getText();
	  System.out.println(Toast);
	  Assert.assertEquals(Toast, "Record REJECTED Successfully");
   
	}

}
