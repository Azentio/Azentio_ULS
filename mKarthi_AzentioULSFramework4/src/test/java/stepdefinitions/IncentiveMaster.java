package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.AlertHelper;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.IncentiveMasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class IncentiveMaster extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	IncentiveMasterObj incentiveMasterObj = new IncentiveMasterObj(driver);
	//IncentiveMasterTestDataType incentiveMasterTestDataType = jsonReader.getIncentiveMasterByName("Maker");
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","IncentiveTestData","Data Set ID");
	Map<String, String> incentive;
	
	AlertHelper alart =new AlertHelper(driver);

	@Then("^click on Incentive Master eye icon$")
	public void click_on_incentive_master_eye_icon() {
	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Eye(), 30, 1);
	incentiveMasterObj.IncentiveMaster_Eye().click();
	
	
	}
	@Then("^click on Incentive Master add button$")
	public void click_on_incentive_master_add_button() {
	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Add_Button(), 30, 1);
	incentiveMasterObj.IncentiveMaster_Add_Button().click();
	}
	 @Then("^Enter Incentive code$")
	    public void enter_incentive_code()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 30, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(" Incentive Code ");
	    	incentiveMasterObj.IncentiveMaster_Code().sendKeys(incentive.get("IncentiveCode"));    
	    }
	  @Then("^Enter Incentive Description$")
	    public void enter_incentive_description()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Description().sendKeys(incentive.get("Description"));   
	    }
	  @Then("^Enter Incentive Description2$")
	    public void enter_incentive_description2()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description2(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Description2().sendKeys(incentive.get("Description2")); 
	    }
	  @Then("^Enter Incentive Description3$")
	    public void enter_incentive_description3()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description3(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Description3().sendKeys(incentive.get("Description3"));  
	    }
	  @Then("^Select Incentive Mode$")
	    public void select_incentive_mode()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveMode(), 30, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("  Incentive Mode ");
	    	incentiveMasterObj.IncentiveMaster_IncentiveMode().click();  
	    	//waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveMode_DropDown(), 30, 1);
	    	//incentiveMasterObj.IncentiveMaster_IncentiveMode_DropDown().click();
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveMode(), 30, 1);
	    	incentiveMasterObj.Incentive_Mode().sendKeys(Keys.DOWN);
	    	incentiveMasterObj.Incentive_Mode().sendKeys(Keys.ENTER);
	    	
	      
	    }

	    @Then("^Select Incentive Type$")
	    public void select_incentive_type()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveType(), 30, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("  Incentive Type ");
	    	incentiveMasterObj.IncentiveMaster_IncentiveType().click();  
//	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveType_DropDown(), 30, 1);
//	    	incentiveMasterObj.IncentiveMaster_IncentiveType_DropDown().click();  
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveType(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_IncentiveType().sendKeys(Keys.DOWN);
	    	incentiveMasterObj.IncentiveMaster_IncentiveType().sendKeys(Keys.ENTER);
	    }

	    @Then("^Enter Flat Amount$")
	    public void enter_flat_amount()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveType(), 30, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("  Flat Amount  ");
	    	while(true) {
	    		try {
	    			waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_FlatAmount(), 30, 1);
	    	    	incentiveMasterObj.IncentiveMaster_FlatAmount().sendKeys(incentive.get("FlatAmount"));   
	    	   break;
	    		}
	    		catch(Exception e) {}
	    	}
	    	}
	    	 

	    @Then("^Enter Incentive Percentage$")
	    public void enter_incentive_percentage()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentivePercentage(), 30, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(" Percentage ");
	    	incentiveMasterObj.IncentiveMaster_IncentivePercentage().sendKeys(incentive.get("Percentage"));  
	    }

	    @Then("^Select Incentive Computation on$")
	    public void select_incentive_computation_on()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ComputationOn(), 30, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("  Incentive Computation On ");
	    	incentiveMasterObj.IncentiveMaster_ComputationOn().click();  
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ComputationOn_DropDown(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_ComputationOn_DropDown().click();  
	     
	    }

	    @Then("^click on Incentive Master Save button$")
	    public void click_on_incentive_master_save_button()  {
	        
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SaveButton(), 30, 1);
  	incentiveMasterObj.IncentiveMaster_SaveButton().click();  
}
	    @Then("^click on Misc Config$")
		public void click_on_misc_config() {
		waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.Misc_Config(), 30, 1);
		incentiveMasterObj.Misc_Config().click();
		}
	    @Then("^search Incentive Master record$")
	    public void search_incentive_master_record()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SearchInputField(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys(incentive.get("EventCode"));  
	   
	    }

	
	    
	    
}
