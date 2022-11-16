package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.IncomeDetailsOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;

public class EligibilityCalculation extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper help = new WaitHelper(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	IncomeDetailsOBJ income = new IncomeDetailsOBJ(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx",
			"IncomeDetailsTestData", "Data Set ID");
	Map<String, String> testData;
	
	@And("^User search the record from the system in Eligibility calculation$")
    public void user_search_the_record_from_the_system_in_eligibility_calculation() throws Throwable {
        
    }
	@And("^User click the eligibility check button$")
    public void user_click_the_eligibility_check_button() throws Throwable {
        
    }

    @And("^User get the popup message in eligibility calculation$")
    public void user_get_the_popup_message_in_eligibility_calculation() throws Throwable {
        
    }

	
	

}
