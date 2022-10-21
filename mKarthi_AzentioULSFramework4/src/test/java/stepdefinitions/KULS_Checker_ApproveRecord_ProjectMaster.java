package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.ProjectMasterOBJ;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.ProjectMasterTestDataType;

public class KULS_Checker_ApproveRecord_ProjectMaster {
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
	ProjectMasterTestDataType projectmaster = jsonConfig.getProjectMasterListByName("Maker");

	@Given("^user log in as uls application checker$")
	public void user_log_in_as_uls_application_checker() throws Throwable {
		
		    String kulsApplicationUrl = configFileReader.getApplicationUrlTransactions();
	        driver.get(kulsApplicationUrl);
	        System.out.println(json.readdata());
	        applicationLogin.ulSApplicationLoginAsAChecker(json.readdata());
	
	}

	@And("^user Click on Menu icon$")
	public void user_click_on_menu_icon() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, project.menuChecker(), 60, 2);
		project.menuChecker().click();
 
	}

	@And("^user Click on Mailbox icon$")
	public void user_click_on_mailbox_icon() throws Throwable {
		
	    help.waitForElementToVisibleWithFluentWait(driver, project.inboxiconChecker(), 60, 2);
	    project.inboxiconChecker().click();
 
	}

	@And("^Search the respective reference id and click on Action button$")
	public void search_the_respective_reference_id_and_click_on_action_button() throws Throwable {
	
	    for (int i = 0; i <20; i++) {
        
	    	try {
	           
	    		driver.findElement(By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button"))
	            .click();
	            break;
              
	    	}
         
	    	catch (Exception e) {
	    		
	    	}
	    		
	    }

	}

	@And("^user Click on Approve icon$")
	public void user_click_on_approve_icon() throws Throwable {
	   
		help.waitForElementToVisibleWithFluentWait(driver, project.CheckerApprove(), 60, 2);
	    project.CheckerApprove().click();
	    
	}

	@And("^user Enter the remarks in Action confirmation popup$")
    public void user_enter_the_remarks_in_action_confirmation_popup() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, project.popupremark(), 60, 2);
		project.popupremark().sendKeys("Approve");
	   
	}

	@Then("^user Click on Remarks button in Action confirmation popup$")
    public void user_click_on_remarks_button_in_action_confirmation_popup() throws Throwable {
		
	   help.waitForElementToVisibleWithFluentWait(driver, project.popupapprove(), 60, 2);
	   project.popupapprove().click();

    }

	@Then("^user verify the Record got Approved$")
    public void user_verify_the_record_got_approved() throws Throwable {
	   help.waitForElementToVisibleWithFluentWait(driver, project.recordMsgChecker(), 60, 2);
	   String Toast;
	   Toast = project.recordMsgChecker().getText();
	   System.out.println(Toast);
	   Assert.assertEquals(Toast, "Record APPROVED Successfully");
    }

}
