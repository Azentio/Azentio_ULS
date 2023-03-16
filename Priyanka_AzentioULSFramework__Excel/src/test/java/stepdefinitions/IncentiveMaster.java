package stepdefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.IncentiveMasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.ExcelReader;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.IncentiveMasterTestDataType;

public class IncentiveMaster extends BaseClass {

	WebDriver driver = BaseClass.driver;
//	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	IncentiveMasterObj incentiveMasterObj = new IncentiveMasterObj(driver);
//	IncentiveMasterTestDataType incentiveMasterTestDataType = jsonReader.getIncentiveMasterByName("Maker");
	String referenceID;
//	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	RadioButtonHelper radioButtonHelper = new RadioButtonHelper(driver);
	ExcelReader excelReader;
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00089\\Downloads\\TestDataDesignSample.xlsx","IncentiveMasterTestData", "Data Set ID");
	Map<String, String> testData = new HashMap<>();
	
	@And("^user update the data set ID for Incentive Master1$")
    public void user_update_the_data_set_id_for_incentive_master1() throws Throwable {
		testData = excelData.getTestdata("AT_IM_001_D1"); 
    }
	
	@Then("^click on config Manager$")
    public void click_on_config_manager() throws InterruptedException {
		
	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.config_Manager(), 10, 1);
	incentiveMasterObj.config_Manager().click();   
	
    }

	@Then("^click on Incentive Master eye icon$")
	public void click_on_incentive_master_eye_icon() {

		for (int i = 1; i <= 20; i++)

		{
			try {
				javascripthelper.scrollToElemetAndClick(incentiveMasterObj.IncentiveMaster_CheckBox_Button());
				break;
			} catch (Exception e) {
			}

		}
	}

	@Then("^click on Incentive Master add button$")
	public void click_on_incentive_master_add_button() {
	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Add_Button(), 10, 1);
	incentiveMasterObj.IncentiveMaster_Add_Button().click();
	}

	@Then("^Verify Incentive Master screen should get open with all valid fields$")
	    public void verify_incentive_master_screen_should_get_open_with_all_valid_fields() throws InterruptedException  {
		waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 10, 1);
		incentiveMasterObj.IncentiveMaster_Code().isDisplayed();
		  incentiveMasterObj.IncentiveMaster_Description().isDisplayed();
		  incentiveMasterObj.IncentiveMaster_Description2().isDisplayed();
		  incentiveMasterObj.IncentiveMaster_Description3().isDisplayed();
		  incentiveMasterObj.IncentiveMaster_IncentiveMode().isDisplayed();
		  incentiveMasterObj.IncentiveMaster_IncentiveType().isDisplayed();
		  incentiveMasterObj.IncentiveMaster_FlatAmount().isDisplayed();
		  incentiveMasterObj.IncentiveMaster_IncentivePercentage().isDisplayed();
		  incentiveMasterObj.IncentiveMaster_ComputationOn().isDisplayed();
		  incentiveMasterObj.IncentiveMaster_BackButton().isDisplayed();
		  incentiveMasterObj.IncentiveMaster_SaveButton().isDisplayed();
	        
	    }

	    @Then("^Enter Incentive code$")
	    public void enter_incentive_code()  {
	    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 10, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Incentive Code");
	    	incentiveMasterObj.IncentiveMaster_Code().sendKeys(testData.get("IncentiveCode"));
	 
	    }

	    @Then("^Enter Incentive Description$")
	    public void enter_incentive_description()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description(), 10, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Description");
	    	incentiveMasterObj.IncentiveMaster_Description().sendKeys(testData.get("Description"));   
	    }

	    @Then("^Enter Incentive Description2$")
	    public void enter_incentive_description2()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description2(), 10, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Description 2");
	    	incentiveMasterObj.IncentiveMaster_Description2().sendKeys(testData.get("Description2")); 
	    }

	    @Then("^Enter Incentive Description3$")
	    public void enter_incentive_description3()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description3(), 10, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Description 3");
	    	incentiveMasterObj.IncentiveMaster_Description3().sendKeys(testData.get("Description3"));  
	    }

	    @Then("^Select Incentive Mode$")
	    public void select_incentive_mode()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveMode(), 10, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Incentive Mode");
	    	incentiveMasterObj.IncentiveMaster_IncentiveMode().click();  
	    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SelectLabel(), 10, 1);
	    	List<WebElement> dropDownList = driver.findElements(By.xpath("//ion-radio-group/child::ion-item/following-sibling::ion-item[1]/ion-label"));
			System.out.println("No. of Incentive Mode : "+dropDownList.size());
	    	
			for (WebElement value : dropDownList) {
				System.out.println(value.getText());
				Assert.assertTrue(value.getText().contains("B")||
								  		 	value.getText().contains("F")||
								  		 	value.getText().contains("P")||
								  		 	value.getText().contains("T"));
			}
			
			radioButtonHelper.radioButton(testData.get("Incentive Mode"));
			//CRON,COLL,SIMPLE,SALES
	      
	    }

	    @Then("^Select Incentive Type$")
	    public void select_incentive_type()  {
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveType(), 10, 1);
	    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Incentive Type");
	    incentiveMasterObj.IncentiveMaster_IncentiveType().click();  
	    	
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SelectLabel(), 10, 1);
	    List<WebElement> dropDownList = driver.findElements(By.xpath("//ion-radio-group/child::ion-item/following-sibling::ion-item[1]/ion-label"));
		System.out.println("No. of Incentive Type : "+dropDownList.size());
	    	
			for (WebElement value : dropDownList) {
				System.out.println(value.getText());
				Assert.assertTrue(value.getText().contains("CRON")||
								  		 	value.getText().contains("COLL")||
								  		 	value.getText().contains("SIMPLE")||
								  		 	value.getText().contains("SALES"));
			}
			
			radioButtonHelper.radioButton(testData.get("Incentive Type")); 
	    }

	    @Then("^Enter Flat Amount$")
	    public void enter_flat_amount()  {
	    	while(true) {
	    		try {
	    			waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_FlatAmount(), 10, 1);
	    			findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Flat Amount");
	    			incentiveMasterObj.IncentiveMaster_FlatAmount().sendKeys(testData.get("FlatAmount"));   
	    	   break;
	    		}
	    		catch(Exception e) {}
	    	}
	    	}
	    	 

	    @Then("^Enter Incentive Percentage$")
	    public void enter_incentive_percentage()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentivePercentage(), 10, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Incentive Percentage");
	    	incentiveMasterObj.IncentiveMaster_IncentivePercentage().sendKeys(testData.get("IncentivePercentage"));  
	    }

	    @Then("^Select Incentive Computation on$")
	    public void select_incentive_computation_on()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ComputationOn(), 10, 1);
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Incentive Computation On");
		    incentiveMasterObj.IncentiveMaster_ComputationOn().click();  
		    	
		    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SelectLabel(), 10, 1);
		    List<WebElement> dropDownList = driver.findElements(By.xpath("//ion-radio-group/child::ion-item/following-sibling::ion-item[1]/ion-label"));
			System.out.println("No. of Incentive Computation on : "+dropDownList.size());
		    	
				for (WebElement value : dropDownList) {
					System.out.println(value.getText());
					Assert.assertTrue(value.getText().contains("AC")||
									  value.getText().contains("SANC"));
				}
				
				radioButtonHelper.radioButton(testData.get("Incentive Computation On")); 
	     
	    }

	    @Then("^click on Incentive Master Save button$")
	    public void click_on_incentive_master_save_button()  {
	        
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SaveButton(), 10, 1);
    	incentiveMasterObj.IncentiveMaster_SaveButton().click();  
    	
    	
	 	for(int i=1; i <=10; i++) {
		    try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SaveConfirmationMessage(), 10, 1);
		    	incentiveMasterObj.IncentiveMaster_SaveConfirmationMessage().isDisplayed();
			 	String savemsg = incentiveMasterObj.IncentiveMaster_SaveConfirmationMessage().getText();
			 	System.out.println("save msg : "+savemsg);
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SaveConfirmationMessageCloseButton(), 10, 1);
			 	incentiveMasterObj.IncentiveMaster_SaveConfirmationMessageCloseButton().click();

			 	break;
		    	} 
		    	catch (Exception e) {}
		    
		    }
}
	    
	    @Then("^click on inbox search icon$")
	    public void click_on_inbox_search_icon()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Inbox_SearchIcon(), 10, 1);
	    	incentiveMasterObj.IncentiveMaster_Inbox_SearchIcon().click();     
	    }

	    @Then("^search Incentive Master record$")
	    public void search_incentive_master_record()  {
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SearchInputField(), 10, 1);
	    incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys(testData.get("SearchIncentiveMaster"));  
	   
	    }
	    

	    @Then("^search and validate the Incentive approved record$")
	    public void search_and_validate_the_incentive_approved_record() throws InterruptedException  {
	    	while (true) {
				try {
			    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_SearchIcon(), 10, 1);
			    	incentiveMasterObj.ListView_SearchIcon().click();
					break;
				} catch (Exception e) {

				}
			}
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SearchInputField(), 10, 1);
	    
	    incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys(testData.get("Description"));
	    incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys(Keys.ENTER);
	    
	    Thread.sleep(1000);
	    while (true) {
			try {
				
			    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ListViewValue_Description(), 10, 1);
			    String descript = incentiveMasterObj.IncentiveMaster_ListViewValue_Description().getText();
			    Assert.assertEquals(testData.get("Description"), descript);  
				break;
			} catch (Exception e) {}

			}
	        
	    }
	    
	    @And("^Maker User open the record from inbox and submit the Record$")
	    public void maker_user_open_the_record_from_inbox_and_submit_the_record() throws InterruptedException {
			Thread.sleep(1000);
			waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ReferanceId(),
					10, 1);
			referenceID = incentiveMasterObj.IncentiveMaster_ReferanceId().getText();
			
			excelData.updateTestData("AT_IM_001_D1", "Reference ID", referenceID);
			

			String beforeXpath = "//span[contains(text(),'";
			String afterXpath = "')]/../../td/button";
	    	
	       WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+testData.get("Reference ID")+afterXpath));
	        
	      while(true)
	        {
	        	try {
	        		waithelper.waitForElementToVisibleWithFluentWait(driver, firstRecord, 10, 1);
	        		firstRecord.click(); 
	        	    break;
	        	    }
	        	catch(Exception e) { 
	        		
	        	} 
	        }
	      
	      // Submit the record
	      waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Submit(), 10, 1);
	      incentiveMasterObj.IncentiveMaster_Submit().click();
	          
	      waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SubmitRemark(), 10, 1);
	      incentiveMasterObj.IncentiveMaster_SubmitRemark().click();
	          
	      waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_FinalSubmit(), 10, 1);
	      incentiveMasterObj.IncentiveMaster_FinalSubmit().click();  
	      
	      
	   
	  	
	    }
	    
	    @Then("^capture checker login id$")
	    public void capture_checker_login_id() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Checker_Id(), 10, 1);
	 	    String message = incentiveMasterObj.IncentiveMaster_Checker_Id().getText();
	 	  	System.out.println(message);
	 	  	//incentiveMasterObj.IncentiveMaster_Checker_Id().click();
	 	  	String emptystring = "";
	 	  	String ar[] = message.split(" ");
	 	  	emptystring=ar[ar.length-1];
	 	  	String cheID=emptystring.replaceAll("[/.]", "");
	 	  	System.out.println(cheID);
	 	  	excelData.updateTestData("AT_IM_001_D1", "Checker id", cheID);
//	 		map = excelData.getTestdata("AT_IM_001_D1");
//	 		String excelCheckerId = map.get("Checker id");
	 	  	waithelper.waitForElementwithFluentwait(driver, incentiveMasterObj.IncentiveMaster_SaveConfirmationMessageCloseButton());
	 	    incentiveMasterObj.IncentiveMaster_SaveConfirmationMessageCloseButton().click(); 
	    }
	    
	    @And("^Login as Checker User Incentive Master$")
	    public void login_as_checker_user_incentive_master() throws Throwable {
	       
	    }
	    @And("^Checker User open the record from inbox and Approve the Record$")
	    public void checker_user_open_the_record_from_inbox_and_approve_the_record() throws Throwable {
	    
//	    String excelReferenceID = map.get("Reference ID");
	    String beforeXpath = "//span[contains(text(),'";
		String afterXpath = "')]/../../td/button";
    	
       WebElement CheckerfirstRecord = driver.findElement(By.xpath(beforeXpath+testData.get("Reference ID")+afterXpath));
       while(true)
	        {
	        	try {
	        		waithelper.waitForElementToVisibleWithFluentWait(driver, CheckerfirstRecord, 10, 1);
	        		CheckerfirstRecord.click(); 
	        	    break;
	        	    }
	        	catch(Exception e) { 
	        		
	        	}
	        } 
       
   
	    }
	    
	    //-------------------reject----------------------//
	    
	    @And("^user update the data set ID for Incentive Master2$")
	    public void user_update_the_data_set_id_for_incentive_master2() throws Throwable {
			testData = excelData.getTestdata("AT_IM_001_D2"); 
	    }
//	    IncentiveCodeReject 
	    
	    @Then("^Enter Incentive code for reject record$")
	    public void enter_incentive_code_for_reject_record()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 10, 1);
	    	incentiveMasterObj.IncentiveMaster_Code().sendKeys(testData.get("IncentiveCode"));    
	    
	    }
//--------------------return---------------------//
	    
	    @And("^user update the data set ID for Incentive Master3$")
	    public void user_update_the_data_set_id_for_incentive_master3() throws Throwable {
			testData = excelData.getTestdata("AT_IM_001_D2"); 
	    }
	    
//	    IncentiveCodeReturn
	    @Then("^Enter Incentive code for return record$")
	    public void enter_incentive_code_for_return_record()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 10, 1);
	    	incentiveMasterObj.IncentiveMaster_Code().sendKeys(testData.get("IncentiveCode"));    
	        
	    }

	   
	    
	    @Then("^Enter Incentive code special character$")
	    public void enter_incentive_code_special_character()  {
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 10, 1);
	    incentiveMasterObj.IncentiveMaster_Code().sendKeys("@!#$"); 
	    
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.Validation_Alphanumeric(), 10, 1);
	    incentiveMasterObj.Validation_Alphanumeric().isDisplayed();
	      
	    }

	    @Then("^Keep Incentive Description field blank$")
	    public void keep_incentive_description_field_blank()  {
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.Validation_RequiredField(), 10, 1);
	 	incentiveMasterObj.Validation_RequiredField().isDisplayed();   
	    }
	    
	    @Then("^verify Incentive Master list view should display all the fields$")
	    public void verify_incentive_master_list_view_should_display_all_the_fields()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver,incentiveMasterObj.IncentiveMaster_Add_Button() , 10, 1);
	        incentiveMasterObj.IncentiveMaster_Add_Button().isDisplayed();
	        incentiveMasterObj.ListView_SearchIcon().isDisplayed();
	        incentiveMasterObj.ListView_Export().isDisplayed();
	        incentiveMasterObj.ListView_Export().click();


	        while (true) {
	    		try {
	    		
	    	    waithelper.waitForElementToVisibleWithFluentWait(driver,incentiveMasterObj.ListView_PdfFile(), 10, 1);
	    	    incentiveMasterObj.ListView_PdfFile().isDisplayed();
	    	    incentiveMasterObj.ListView_XlsFile().isDisplayed();
	    	    incentiveMasterObj.ListView_Export().click();
	    	    break;
	    		} catch (StaleElementReferenceException se) {
	    		}
	    		
	        }
	    	
	        incentiveMasterObj.IncentiveMaster_ListView_Description().isDisplayed();
	        incentiveMasterObj.IncentiveMaster_ListView_IncentiveMode().isDisplayed();
	        incentiveMasterObj.IncentiveMaster_ListView_IncentiveType().isDisplayed();
	        incentiveMasterObj.IncentiveMaster_ListView_Status().isDisplayed();    
	    }

	    @Then("^values in Incentive Master list view value should not be editable$")
	    public void values_in_incentive_master_list_view_value_should_not_be_editable() {
	    	try {
				incentiveMasterObj.IncentiveMaster_ListViewValue_Description().sendKeys("ok");
				incentiveMasterObj.IncentiveMaster_ListViewValue_IncentiveMode().sendKeys("ok");
				incentiveMasterObj.IncentiveMaster_ListViewValue_IncentiveType().sendKeys("ok");
				System.out.println("Values in list view is editable");

			} catch (Exception e) {
				System.out.println("Values in list view is not editable");
			}  
	    }

	    @Then("^verify Incentive Master add button should allow to create new record$")
	    public void verify_incentive_master_add_button_should_allow_to_create_new_record() {
	    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver,incentiveMasterObj.IncentiveMaster_Add_Button() , 10, 1);
	        incentiveMasterObj.IncentiveMaster_Add_Button().click();
	        waithelper.waitForElementToVisibleWithFluentWait(driver,incentiveMasterObj.IncentiveMaster_SaveButton() , 10, 1);
	        incentiveMasterObj.IncentiveMaster_SaveButton().isDisplayed();
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_BackButton(), 10, 1);
	        incentiveMasterObj.IncentiveMaster_BackButton().click();     
	    }

	    
	    @Then("^verify Incentive Master search box should display matching record with matched data$")
	    public void verify_incentive_master_search_box_should_display_matching_record_with_matched_data() throws InterruptedException  {
	    	while (true) {
				try {
			    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_SearchIcon(), 10, 1);
			    	incentiveMasterObj.ListView_SearchIcon().click();
					break;
				} catch (Exception e) {

				}
			}
//	    	SearchValid
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SearchInputField(), 10, 1);
	    incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys(testData.get("Description"));
	    incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    
	    while (true) {
			try {
				
			    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ListViewValue_Description(), 10, 1);
			    String description = incentiveMasterObj.IncentiveMaster_ListViewValue_Description().getText();
			    Assert.assertEquals(testData.get("Description"), description);  
				break;
			} catch (Exception e) {

			}
		}
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SearchInputFieldClose(), 10, 1);
		incentiveMasterObj.IncentiveMaster_SearchInputFieldClose().click();  
	    }

	    @Then("^verify Incentive Master search box should not display any record with mismatched data$")
	    public void verify_incentive_master_search_box_should_not_display_any_record_with_mismatched_data() {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_SearchIcon(), 10, 1);
	    	incentiveMasterObj.ListView_SearchIcon().click();
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SearchInputField(), 10, 1);
	    	incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys("@@@@@");
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_NoDataFoundInSearch(), 10, 1);
	        incentiveMasterObj.IncentiveMaster_NoDataFoundInSearch().isDisplayed();
	        incentiveMasterObj.IncentiveMaster_SearchInputFieldClose().click();    
	    }

	    @Then("^click on Incentive Master export to pdf button system should download Pdf file$")
	    public void click_on_incentive_master_export_to_pdf_button_system_should_download_pdf_file()   {
	    	incentiveMasterObj.ListView_Export().click();
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_PdfFile(), 10, 1);
	        incentiveMasterObj.ListView_PdfFile().click();
	        browserHelper.SwitchToWindow(1);
	        browserHelper.switchToParentWithChildClose();     
	    }

	    @Then("^click on Incentive Master export to excel button system should download Excel file$")
	    public void click_on_incentive_master_export_to_excel_button_system_should_download_excel_file() {
	    	while (true) {
				try {
				    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_Export(), 10, 1);
				    incentiveMasterObj.ListView_Export().click();
					break;
				} catch (StaleElementReferenceException se) {

				}
			}
		 waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_XlsFile(), 10, 1);
	    incentiveMasterObj.ListView_XlsFile().click(); 
	    }
	    

	    @Then("^click on Incentive Master Time icon$")
	    public void click_on_incentive_master_time_icon()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Time_Button(), 10, 1);
	    	incentiveMasterObj.IncentiveMaster_Time_Button().click();
	    }
	    
	    @Then("^open the record for Invalid modification$")
	    public void open_the_record_for_invalid_modification() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ActionEdit(), 10, 1);
	    	incentiveMasterObj.IncentiveMaster_ActionEdit().click();	
	    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 10, 1);
	    	clicksAndActionHelper.doubleClick(incentiveMasterObj.IncentiveMaster_Code());
		    incentiveMasterObj.IncentiveMaster_Code().sendKeys(Keys.BACK_SPACE);   
		    incentiveMasterObj.IncentiveMaster_Code().sendKeys("@!#$");  
		    
		   
		    
		    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description(), 10, 1);
	    	clicksAndActionHelper.doubleClick(incentiveMasterObj.IncentiveMaster_Description());
		    incentiveMasterObj.IncentiveMaster_Description().sendKeys(Keys.BACK_SPACE); 
		    
		    
	    } 
	    
	    @Then("^system should not allow to save the record$")
	    public void system_should_not_allow_to_save_the_record() throws Throwable {
	    	 waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.Validation_Alphanumeric(), 10, 1);
			 incentiveMasterObj.Validation_Alphanumeric().isDisplayed();
			    
			 waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.Validation_RequiredField(), 10, 1);
			 incentiveMasterObj.Validation_RequiredField().isDisplayed();
	    }
	    
	    
}
