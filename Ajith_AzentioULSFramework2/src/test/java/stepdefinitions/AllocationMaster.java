package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import pageobjects.ReportMasterObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.ReportMasterTestData;

public class AllocationMaster {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	ReportMasterTestData reportMasterTestData = jsonConfig.getReportMasterByName("Maker");
    ReportMasterObj reportMasterObj = new ReportMasterObj(driver);
    JsonDataReaderWriter json = new JsonDataReaderWriter();
}
