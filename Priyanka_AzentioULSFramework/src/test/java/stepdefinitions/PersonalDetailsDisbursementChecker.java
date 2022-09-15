package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.PersonalDetails_DisbursementCheckerObj;
import pageobjects.PersonalDetails_DisbursementMakerObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.PersonalDetails_DisbursementMakerTestDataType;

public class PersonalDetailsDisbursementChecker extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	PersonalDetails_DisbursementCheckerObj PDDCObj = new PersonalDetails_DisbursementCheckerObj(driver);
	PersonalDetails_DisbursementMakerTestDataType PDDMTestDataType = jsonReader.getPersonalDetails_DisbursementMakerByName("Maker");
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);

	
	@Then("^search Personal Details Disbursement Checker record$")
	public void search_personal_details_disbursement_checker_record() throws InterruptedException  {
		while(true)
    	{
    	try{
    		waithelper.waitForElementToVisibleWithFluentWait(driver, PDDCObj.PDDC_SearchInputField(), 10, 2);
        	PDDCObj.PDDC_SearchInputField().click();   
    	    PDDCObj.PDDC_SearchInputField().sendKeys(PDDMTestDataType.ReferenceIdChecker);
    	    break;
    	}catch(Exception E){}
    	}
   Thread.sleep(1000); 
	}

	@Then("^Validate Personal Details Disbursement Checker Back button$")
	public void validate_personal_details_disbursement_checker_back_button()  {
		waithelper.waitForElementToVisibleWithFluentWait(driver,PDDCObj.PDDC_CustomerDetails_BackButton() , 10, 1);
		PDDCObj.PDDC_CustomerDetails_BackButton().click(); 
	}
	@Then("^Validate Personal Details Disbursement Checker Add button$")
	public void validate_personal_details_disbursement_checker_add_button()  {

		waithelper.waitForElementToVisibleWithFluentWait(driver, PDDCObj.PDDC_AddButton(), 10, 1);
		PDDCObj.PDDC_AddButton().click();
		System.out.println("add button present");
			Assert.assertTrue(false);

			

	}

	

	
}
