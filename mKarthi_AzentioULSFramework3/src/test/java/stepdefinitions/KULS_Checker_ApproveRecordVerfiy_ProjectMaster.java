package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
import testDataType.ProjectMasterTestDataType;

public class KULS_Checker_ApproveRecordVerfiy_ProjectMaster {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	ProjectMasterOBJ project = new ProjectMasterOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ProjectMasterTestDataType projectmaster = jsonConfig.getProjectMasterListByName("Maker");
	
	@And("^Click the project setup eye icon in project master for validation$")
	    public void click_the_project_setup_eye_icon_in_project_master_for_validation() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, project.projectmastereyeicon(), 60, 2);
		project.projectmastereyeicon().click();
	        
		
	    }
	
	@Then("^User validate the updated record in list view$")
    public void user_validate_the_updated_record_in_list_view() throws Throwable {
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'" + subProductMasterRetailData.ProductCode + "')]")), 60, 2);
        for (int i = 0; i <20; i++) {
            try {
                String validate = driver.findElement(By.xpath("//span[contains(text(),'"+projectmaster.ProjectCode+"')]"))
                        .getText();
                System.out.println(validate);
                Assert.assertEquals(validate, projectmaster.ProjectCode);
                break;

            } catch (NoSuchElementException e) {


            }

        }

        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'" + subProductMasterRetailData.SubProductCode + "')]")), 60, 2);
        for (int i = 0; i <20; i++) {
            try {
                String validate1 = driver.findElement(By.xpath("//span[contains(text(),'" + projectmaster.ProjectName + "')]")).getText();
                System.out.println(validate1);
                Assert.assertEquals(validate1, projectmaster.ProjectName);
                break;
            } catch (NoSuchElementException e) {

            }
        }

    }

}
