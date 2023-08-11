package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.util.Map;

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
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.Asset_CD_MasterOBJ;
import pageobjects.ProjectMasterOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.Asset_CD_MasterTestDataType;
import testDataType.KULS_Login_TestDataType;
import testDataType.ProjectMasterTestDataType;

public class KULS_Asset_CD_MasterCheckerApprove extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Checker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Asset_CD_MasterOBJ assetcd = new Asset_CD_MasterOBJ(driver);
	FindFieldisMandatoryorNot mandatoryornot = new FindFieldisMandatoryorNot(driver);
	Asset_CD_MasterTestDataType assetjson = jsonConfig.getAssetCDMasterListByName("Maker");
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ExcelData assertcdmasterexcelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","AssetCDMasterTestData","Data Set ID");
	Map<String, String> assertcdmaster;
	
	
	




    

	
	

}
