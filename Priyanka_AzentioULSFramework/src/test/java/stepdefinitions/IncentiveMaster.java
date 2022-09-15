package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.IncentiveMasterObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.IncentiveMasterTestDataType;

public class IncentiveMaster extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	IncentiveMasterObj incentiveMasterObj = new IncentiveMasterObj(driver);
	IncentiveMasterTestDataType incentiveMasterTestDataType = jsonReader.getIncentiveMasterByName("Maker");
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);

	
	@Then("^click on Misc Config$")
	public void click_on_misc_config() {
	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.Misc_Config(), 30, 1);
	incentiveMasterObj.Misc_Config().click();
	}

	@Then("^click on Incentive Master eye icon$")
	public void click_on_incentive_master_eye_icon() {
	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_CheckBox_Button(), 30, 1);
	incentiveMasterObj.IncentiveMaster_CheckBox_Button().click();
	}

	@Then("^click on Incentive Master add button$")
	public void click_on_incentive_master_add_button() {
	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Add_Button(), 30, 1);
	incentiveMasterObj.IncentiveMaster_Add_Button().click();
	}

	    @Then("^Enter Incentive code$")
	    public void enter_incentive_code()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Code().sendKeys(incentiveMasterTestDataType.IncentiveCode);    
	    }

	    @Then("^Enter Incentive Description$")
	    public void enter_incentive_description()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Description().sendKeys(incentiveMasterTestDataType.Description);   
	    }

	    @Then("^Enter Incentive Description2$")
	    public void enter_incentive_description2()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description2(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Description2().sendKeys(incentiveMasterTestDataType.Description2); 
	    }

	    @Then("^Enter Incentive Description3$")
	    public void enter_incentive_description3()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description3(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Description3().sendKeys(incentiveMasterTestDataType.Description3);  
	    }

	    @Then("^Select Incentive Mode$")
	    public void select_incentive_mode()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveMode(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_IncentiveMode().click();  
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveMode_DropDown(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_IncentiveMode_DropDown().click();
	      
	    }

	    @Then("^Select Incentive Type$")
	    public void select_incentive_type()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveType(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_IncentiveType().click();  
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentiveType_DropDown(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_IncentiveType_DropDown().click();  
	    }

	    @Then("^Enter Flat Amount$")
	    public void enter_flat_amount()  {
	    	while(true) {
	    		try {
	    			waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_FlatAmount(), 30, 1);
	    	    	incentiveMasterObj.IncentiveMaster_FlatAmount().sendKeys(incentiveMasterTestDataType.FlatAmount);   
	    	   break;
	    		}
	    		catch(Exception e) {}
	    	}
	    	}
	    	 

	    @Then("^Enter Incentive Percentage$")
	    public void enter_incentive_percentage()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_IncentivePercentage(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_IncentivePercentage().sendKeys(incentiveMasterTestDataType.Percentage);  
	    }

	    @Then("^Select Incentive Computation on$")
	    public void select_incentive_computation_on()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ComputationOn(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_ComputationOn().click();  
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ComputationOn_DropDown(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_ComputationOn_DropDown().click();  
	     
	    }

	    @Then("^click on Incentive Master Save button$")
	    public void click_on_incentive_master_save_button()  {
	        
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SaveButton(), 30, 1);
    	incentiveMasterObj.IncentiveMaster_SaveButton().click();  
}
	    
	    @Then("^click on inbox search icon$")
	    public void click_on_inbox_search_icon()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Inbox_SearchIcon(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Inbox_SearchIcon().click();     
	    }

	    @Then("^search Incentive Master record$")
	    public void search_incentive_master_record()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SearchInputField(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys(incentiveMasterTestDataType.EventCode);  
	   
	    }
	    
	    @Then("^Enter Incentive code for return record$")
	    public void enter_incentive_code_for_return_record()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Code().sendKeys(incentiveMasterTestDataType.IncentiveCodeReturn);    
	        
	    }

	    @Then("^Enter Incentive code for reject record$")
	    public void enter_incentive_code_for_reject_record()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Code().sendKeys(incentiveMasterTestDataType.IncentiveCodeReject);    
	    
	    }
	    
	    @Then("^Enter Incentive code special character$")
	    public void enter_incentive_code_special_character()  {
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 30, 1);
	    incentiveMasterObj.IncentiveMaster_Code().sendKeys("@!#$"); 
	    
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.Validation_Alphanumeric(), 30, 1);
	    incentiveMasterObj.Validation_Alphanumeric().isDisplayed();
	      
	    }

	    @Then("^Keep Incentive Description field blank$")
	    public void keep_incentive_description_field_blank()  {
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.Validation_RequiredField(), 30, 1);
	 	incentiveMasterObj.Validation_RequiredField().isDisplayed();   
	    }
	    
	    @Then("^verify Incentive Master list view should display all the fields$")
	    public void verify_incentive_master_list_view_should_display_all_the_fields()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver,incentiveMasterObj.IncentiveMaster_Add_Button() , 30, 1);
	        incentiveMasterObj.IncentiveMaster_Add_Button().isDisplayed();
	        incentiveMasterObj.ListView_SearchIcon().isDisplayed();
	        incentiveMasterObj.ListView_Export().isDisplayed();
	        incentiveMasterObj.ListView_Export().click();


	        while (true) {
	    		try {
	    		
	    	    waithelper.waitForElementToVisibleWithFluentWait(driver,incentiveMasterObj.ListView_PdfFile(), 30, 1);
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
	    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver,incentiveMasterObj.IncentiveMaster_Add_Button() , 30, 1);
	        incentiveMasterObj.IncentiveMaster_Add_Button().click();
	        waithelper.waitForElementToVisibleWithFluentWait(driver,incentiveMasterObj.IncentiveMaster_SaveButton() , 30, 1);
	        incentiveMasterObj.IncentiveMaster_SaveButton().isDisplayed();
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_BackButton(), 30, 1);
	        incentiveMasterObj.IncentiveMaster_BackButton().click();     
	    }

	    @Then("^verify Incentive Master search box should display matching record with matched data$")
	    public void verify_incentive_master_search_box_should_display_matching_record_with_matched_data() throws InterruptedException  {
	    	while (true) {
				try {
			    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_SearchIcon(), 30, 1);
			    	incentiveMasterObj.ListView_SearchIcon().click();
					break;
				} catch (Exception e) {

				}
			}
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SearchInputField(), 30, 1);
	    incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys(incentiveMasterTestDataType.SearchValid);
	    incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    
	    while (true) {
			try {
				
			    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ListViewValue_Description(), 30, 1);
			    String description = incentiveMasterObj.IncentiveMaster_ListViewValue_Description().getText();
			    Assert.assertEquals(incentiveMasterTestDataType.SearchValid, description);  
				break;
			} catch (Exception e) {

			}
		}
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SearchInputFieldClose(), 30, 1);
		incentiveMasterObj.IncentiveMaster_SearchInputFieldClose().click();  
	    }

	    @Then("^verify Incentive Master search box should not display any record with mismatched data$")
	    public void verify_incentive_master_search_box_should_not_display_any_record_with_mismatched_data() {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_SearchIcon(), 30, 1);
	    	incentiveMasterObj.ListView_SearchIcon().click();
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_SearchInputField(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_SearchInputField().sendKeys(incentiveMasterTestDataType.SearchInvalid);
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_NoDataFoundInSearch(), 30, 1);
	        incentiveMasterObj.IncentiveMaster_NoDataFoundInSearch().isDisplayed();
	        incentiveMasterObj.IncentiveMaster_SearchInputFieldClose().click();    
	    }

	    @Then("^click on Incentive Master export to pdf button system should download Pdf file$")
	    public void click_on_incentive_master_export_to_pdf_button_system_should_download_pdf_file()   {
	    	incentiveMasterObj.ListView_Export().click();
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_PdfFile(), 30, 1);
	        incentiveMasterObj.ListView_PdfFile().click();
	        browserHelper.SwitchToWindow(1);
	        browserHelper.switchToParentWithChildClose();     
	    }

	    @Then("^click on Incentive Master export to excel button system should download Excel file$")
	    public void click_on_incentive_master_export_to_excel_button_system_should_download_excel_file() {
	    	while (true) {
				try {
				    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_Export(), 30, 1);
				    incentiveMasterObj.ListView_Export().click();
					break;
				} catch (StaleElementReferenceException se) {

				}
			}
		 waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.ListView_XlsFile(), 30, 1);
	    incentiveMasterObj.ListView_XlsFile().click(); 
	    }
	    

	    @Then("^click on Incentive Master Time icon$")
	    public void click_on_incentive_master_time_icon()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Time_Button(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_Time_Button().click();
	    }
	    
	    @Then("^open the record for Invalid modification$")
	    public void open_the_record_for_invalid_modification() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_ActionEdit(), 30, 1);
	    	incentiveMasterObj.IncentiveMaster_ActionEdit().click();	
	    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Code(), 30, 1);
	    	clicksAndActionHelper.doubleClick(incentiveMasterObj.IncentiveMaster_Code());
		    incentiveMasterObj.IncentiveMaster_Code().sendKeys(Keys.BACK_SPACE);   
		    incentiveMasterObj.IncentiveMaster_Code().sendKeys("@!#$");  
		    
		   
		    
		    waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.IncentiveMaster_Description(), 30, 1);
	    	clicksAndActionHelper.doubleClick(incentiveMasterObj.IncentiveMaster_Description());
		    incentiveMasterObj.IncentiveMaster_Description().sendKeys(Keys.BACK_SPACE); 
		    
		    
	    } 
	    
	    @Then("^system should not allow to save the record$")
	    public void system_should_not_allow_to_save_the_record() throws Throwable {
	    	 waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.Validation_Alphanumeric(), 30, 1);
			 incentiveMasterObj.Validation_Alphanumeric().isDisplayed();
			    
			 waithelper.waitForElementToVisibleWithFluentWait(driver, incentiveMasterObj.Validation_RequiredField(), 30, 1);
			 incentiveMasterObj.Validation_RequiredField().isDisplayed();
	    }
	    
	    
}
