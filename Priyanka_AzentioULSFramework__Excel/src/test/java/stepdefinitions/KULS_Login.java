package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class KULS_Login {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	JsonDataReaderWriter jsonDataReaderWriter=  new  JsonDataReaderWriter();
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00089\\Downloads\\TestDataDesignSample.xlsx","LoginCredentilas","Stage");

	Map<String, String> testdata;
	
	
	@Given("^User launch the kuls application$")
	public void user_launch_the_kuls_application() throws Throwable {
		KULS_Login_TestDataType kulsLoginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
		String kulsApplicationUrl = configFileReader.getApplicationUrl();

		driver.get(kulsApplicationUrl);
		//kulsLogin.loginUlsApplicationAsMaker(kulsLoginData.Username, kulsLoginData.Password);
		//kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
		//Thread.sleep(2000);

	}

	@And("^User Login as maker$")
	public void user_login_as_maker() throws Throwable {
		testdata = excelData.getTestdata("Maker1");
		kulsLogin.loginUlsApplicationAsMaker(testdata.get("Username"), testdata.get("Password"));

	}
	@And("^User Login as maker2$")
	public void user_login_as_maker2() throws Throwable {
		testdata = excelData.getTestdata("Maker2");
	kulsLogin.loginUlsApplicationAsMaker(testdata.get("Username"), testdata.get("Password"));

	}
	@And("^User Login as Checker$")
    public void user_login_as_checker() throws Throwable {
//		jsonDataReaderWriter =new JsonDataReaderWriter();
//		kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
		ExcelData excelData = new ExcelData("C:\\Users\\inindc00089\\Downloads\\TestDataDesignSample.xlsx","LoginCredentilas","Stage");

    }

}
