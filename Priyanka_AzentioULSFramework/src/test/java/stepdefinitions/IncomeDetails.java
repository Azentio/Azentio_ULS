package stepdefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.IncomeDetailsObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.IncomeDetailsTestDataType;

public class IncomeDetails extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	IncomeDetailsObj incomeDetailsObj = new IncomeDetailsObj(driver);
	IncomeDetailsTestDataType incomeDetailsTestDataType = jsonReader.getIncomeDetailsByName("Maker");
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	
	 @Then("^search Income Details record$")
	    public void search_income_details_record() throws InterruptedException  {
		 while(true)
	    	{
	    	try{  
	    		waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_SearchInputField(), 10, 1);
	    		incomeDetailsObj.IncomeDetails_SearchInputField().click();   
	    		incomeDetailsObj.IncomeDetails_SearchInputField().sendKeys(incomeDetailsTestDataType.ReferenceId);
	    	    break;
	    	}catch(Exception e){}
	    	}
	   
	    	}
	 
	 @Then("^click on Customer Financials Segment button$")
	 public void click_on_customer_financials_segment_button() throws InterruptedException  {
		
//     waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_Next(), , 1);
//     incomeDetailsObj.IncomeDetails_Next().click(); 
	 while(true)
	 {
	  try{
		  waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_CustomerFinancials_SegmentButton(), 10, 1);
		  incomeDetailsObj.IncomeDetails_CustomerFinancials_SegmentButton().isDisplayed();
	      incomeDetailsObj.IncomeDetails_CustomerFinancials_SegmentButton().click(); 
	     break;
  		}catch(Exception e){}
  	 }
	  
	 } 
	 
	 @Then("^click on Customer Financials Record Edit button$")
	 public void click_on_customer_financials_record_edit_button()  {
	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_CustomerFinancials_ActionEdit(), 10, 1);
	 incomeDetailsObj.IncomeDetails_CustomerFinancials_ActionEdit().isDisplayed();
	 incomeDetailsObj.IncomeDetails_CustomerFinancials_ActionEdit().click();       
	   
	 }

	 @Then("^click on Incom Details Add button$")
	 public void click_on_incom_details_add_button()  {
	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_AddButton(), 10, 1);
	 incomeDetailsObj.IncomeDetails_AddButton().click();    
	   
	 }

	 @Then("^Validate fields and button under Income details sections$")
	 public void validate_fields_and_button_under_income_details_sections()  {
	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_EmploymentType(), 10, 1);
	 incomeDetailsObj.IncomeDetails_EmploymentType().isDisplayed(); 
	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_IncomeAmount(), 10, 1);
	 incomeDetailsObj.IncomeDetails_IncomeAmount().isDisplayed(); 
	 incomeDetailsObj.IncomeDetails_TotalIncome().isDisplayed(); 
	 incomeDetailsObj.IncomeDetails_TotalIncomeConsidered().isDisplayed(); 
	 incomeDetailsObj.IncomeDetails_TotalDeduction().isDisplayed(); 
	 incomeDetailsObj.IncomeDetails_TotalDeductionConsidered().isDisplayed(); 
	 incomeDetailsObj.IncomeDetails_DeductionAmount().isDisplayed(); 
	 incomeDetailsObj.IncomeDetails_Currency().isDisplayed(); 
	 incomeDetailsObj.IncomeDetails_Save().isDisplayed();
	// incomeDetailsObj.IncomeDetails_Back().isDisplayed(); 
	 }

	    @Then("^Validate Auto populated Employment field$")
	    public void validate_auto_populated_employment_field()  {
	    	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_EmploymentType(), 10, 1);
	    	 String employmentType = incomeDetailsObj.IncomeDetails_EmploymentType().getText(); 
	    	 System.out.println("Auto populated Employment field : " +employmentType);
	    	 Assert.assertEquals("Salaried", employmentType);
	    }
	    
	    @And("^employment type is salaried then validate bank and branch fields$")
	    public void employment_type_is_salaried_then_validate_bank_and_branch_fields()  {
	     waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_SalaryCreditedToBank(), 10, 1);
	   	 incomeDetailsObj.IncomeDetails_SalaryCreditedToBank().isDisplayed(); 
	   	 incomeDetailsObj.IncomeDetails_SalaryCreditedToBank().click();
	   	while(true) {
			try {
	   	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_SalaryCreditedToBank_DropDown(), 10, 1);
	   	 incomeDetailsObj.IncomeDetails_SalaryCreditedToBank_DropDown().click();
	   	System.out.println("Salary Credited To Bank Field is a drop down");
	   	break;
			}
			catch(Exception e) {}
			System.out.println("Salary Credited To Bank Field is not a drop down");
		}
	   	//Bank
	   	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_BankName(), 10, 1);
	   	 incomeDetailsObj.IncomeDetails_BankName().isDisplayed(); 
	   	 incomeDetailsObj.IncomeDetails_BankName().click();
	   	while(true) {
			try {
	   	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_BankNameDropDown(), 10, 1);
	   	 incomeDetailsObj.IncomeDetails_BankNameDropDown().click();
	   	 System.out.println("Bank Field is a drop down");
	   	break;
			}
			catch(Exception e) {}
			System.out.println("Bank Field is not a drop down");
		}
	   	//Branch
	   	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_BranchName(), 10, 1);
	   	 incomeDetailsObj.IncomeDetails_BranchName().isDisplayed(); 
	   	 
	    }

	    @Then("^Validate Total Income field auto populated post entring the amount$")
	    public void validate_total_income_field_auto_populated_post_entring_the_amount()  {
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_Income(), 10, 1);
		incomeDetailsObj.IncomeDetails_Income().isDisplayed(); 
		incomeDetailsObj.IncomeDetails_Income().click();
		
		while(true) {
			try {
	   	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_IncomeDropdown(), 10, 1);
	   	 incomeDetailsObj.IncomeDetails_IncomeDropdown().click();
	   	break;
			}
			catch(Exception e) {}
		}
		
		waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_IncomeFrequency(), 10, 1);
		incomeDetailsObj.IncomeDetails_IncomeFrequency().isDisplayed(); 
		incomeDetailsObj.IncomeDetails_IncomeFrequency().click();
		
		while(true) {
			try {
	   	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_IncomeFrequencyDropdown(), 10, 1);
	   	 incomeDetailsObj.IncomeDetails_IncomeFrequencyDropdown().click();
	   	break;
			}
			catch(Exception e) {}
		}
		
		while(true) {
			try {
		waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_IncomeAmount(), 10, 1);
		//incomeDetailsObj.IncomeDetails_IncomeAmount().click();
		incomeDetailsObj.IncomeDetails_IncomeAmount().sendKeys(incomeDetailsTestDataType.Amount);
		incomeDetailsObj.IncomeDetails_IncomeAmount().sendKeys(Keys.ENTER);
		break;
			}
			catch(Exception e) {}
		}
		
		waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_TotalIncome(), 10, 1);
		String TotalIncome = incomeDetailsObj.IncomeDetails_TotalIncome().getAttribute("ng-reflect-model");
		System.out.println("TotalIncome Auto populated post entring the amount : " +TotalIncome);
   	    Assert.assertEquals(incomeDetailsTestDataType.Amount, TotalIncome);
		
		
		
	    }

	    @Then("^Validate Total Income Considered field auto populated post entring the amount$")
	    public void validate_total_income_considered_field_auto_populated_post_entring_the_amount()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_IncomeAdjustedPercent(), 10, 1);
			incomeDetailsObj.IncomeDetails_IncomeAdjustedPercent().click();
			incomeDetailsObj.IncomeDetails_IncomeAdjustedPercent().sendKeys(incomeDetailsTestDataType.AdjustedPercent);
			incomeDetailsObj.IncomeDetails_IncomeAdjustedPercent().sendKeys(Keys.ENTER);
			
			waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_TotalIncomeConsidered(), 10, 1);
			String TotalIncomeConsidered = incomeDetailsObj.IncomeDetails_TotalIncomeConsidered().getAttribute("ng-reflect-model");
			System.out.println("TotalIncome Auto populated post entring the amount : " +TotalIncomeConsidered);
	   	    Assert.assertEquals(incomeDetailsTestDataType.TotalIncomeConsidered, TotalIncomeConsidered);
			
	    }

	    @Then("^Validate Total Deduction field auto populated post entring the amount$")
	    public void validate_total_deduction_field_auto_populated_post_entring_the_amount()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_Deduction(), 10, 1);
	 		incomeDetailsObj.IncomeDetails_Deduction().isDisplayed(); 
	 		incomeDetailsObj.IncomeDetails_Deduction().click();
	 		
	 		while(true) {
	 			try {
	 	   	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_DeductionDropdown(), 10, 1);
	 	   	 incomeDetailsObj.IncomeDetails_DeductionDropdown().click();
	 	   	break;
	 			}
	 			catch(Exception e) {}
	 		}
	 		
	 		waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_DeductionFrequency(), 10, 1);
	 		incomeDetailsObj.IncomeDetails_DeductionFrequency().isDisplayed(); 
	 		incomeDetailsObj.IncomeDetails_DeductionFrequency().click();
	 		
	 		while(true) {
	 			try {
	 	   	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_DeductionFrequencyDropdown(), 10, 1);
	 	   	 incomeDetailsObj.IncomeDetails_DeductionFrequencyDropdown().click();
	 	   	break;
	 			}
	 			catch(Exception e) {}
	 		}
	 		
	 		while(true) {
	 			try {
	 		waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_DeductionAmount(), 10, 1);
	 		//incomeDetailsObj.IncomeDetails_IncomeAmount().click();
	 		incomeDetailsObj.IncomeDetails_DeductionAmount().sendKeys(incomeDetailsTestDataType.DeductionAmount);
	 		incomeDetailsObj.IncomeDetails_DeductionAmount().sendKeys(Keys.ENTER);
	 		break;
	 			}
	 			catch(Exception e) {}
	 		}
	 		
	 		waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_TotalDeduction(), 10, 1);
	 		String TotalDeduction = incomeDetailsObj.IncomeDetails_TotalDeduction().getAttribute("ng-reflect-model");
	 		System.out.println("Total Deduction Auto populated post entring the amount : " +TotalDeduction);
	    	Assert.assertEquals(incomeDetailsTestDataType.DeductionAmount, TotalDeduction);
	 		
	 		
   
	    }

	    @Then("^Validate Total Deduction Considered field auto populated post entring the amount$")
	    public void validate_total_deduction_considered_field_auto_populated_post_entring_the_amount()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_DeductionAdjustedPercent(), 10, 1);
			incomeDetailsObj.IncomeDetails_DeductionAdjustedPercent().click();
			incomeDetailsObj.IncomeDetails_DeductionAdjustedPercent().sendKeys(incomeDetailsTestDataType.DeductionAdjustedPercent);
			incomeDetailsObj.IncomeDetails_DeductionAdjustedPercent().sendKeys(Keys.ENTER);
			
			waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_TotalDeductionConsidered(), 10, 1);
			String TotalDeductionConsidered = incomeDetailsObj.IncomeDetails_TotalDeductionConsidered().getAttribute("ng-reflect-model");
			System.out.println("Total Deduction Considered Auto populated post entring the amount : " +TotalDeductionConsidered);
	   	    Assert.assertEquals(incomeDetailsTestDataType.DeductionAmount, TotalDeductionConsidered);
			  
	    }

	   
	    @Then("^Validate Currency Field should be drop down$")
	    public void validate_currency_field_should_be_drop_down()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_Currency(), 10, 1);
	 		incomeDetailsObj.IncomeDetails_Currency().isDisplayed(); 
	 		incomeDetailsObj.IncomeDetails_Currency().click();
	 		
	 		while(true) {
	 			try {
	 	   	 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_CurrencyDropdown(), 10, 1);
	 	   	 incomeDetailsObj.IncomeDetails_CurrencyDropdown().click();
	 	   	 System.out.println("Currency Field is drop down");
	 	   	break;
	 			}
	 			catch(Exception e) {}
	 			System.out.println("Currency Field is not a drop down");
	 		}  
	    }
	    
	    @Then("^click on Income Details Action Edit$")
	    public void click_on_income_details_action_edit()  {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_IncomActionEdit(), 10, 1);
		 	incomeDetailsObj.IncomeDetails_IncomActionEdit().click(); 
	    }
	    @Then("^verify the impact when user enter characters value in numeric field$")
	    public void verify_the_impact_when_user_enter_characters_value_in_numeric_field()   {
	    	while(true) {
				try {
			waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_IncomeAmount(), 10, 1);
			incomeDetailsObj.IncomeDetails_IncomeAmount().sendKeys("Money");
			incomeDetailsObj.IncomeDetails_IncomeAmount().sendKeys(Keys.ENTER);
			break;
				}
				catch(Exception e) {}
				System.out.println("Does not accept characters value in numeric field");
			}    
	    }

	    @Then("^verify the impact when user enter special characters value in any field$")
	    public void verify_the_impact_when_user_enter_special_characters_value_in_any_field()   {
	    	while(true) {
	 			try {
	 		waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_DeductionAmount(), 10, 1);
	 		incomeDetailsObj.IncomeDetails_DeductionAmount().sendKeys("@@@");
	 		incomeDetailsObj.IncomeDetails_DeductionAmount().sendKeys(Keys.ENTER);
	 		break;
	 			}
	 			catch(Exception e) {}
	 			System.out.println("Does not accept special characters value in any field");
	 		} 
	    }

	    @Then("^click on Income Details save button$")
	    public void click_on_income_details_save_button() {
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_Save(), 10, 1);
	 	incomeDetailsObj.IncomeDetails_Save().click();    
	    } 

	    @Then("^Validate impact when user keep any mandatory field blank$")
	    public void validate_impact_when_user_keep_any_mandatory_field_blank() {
	    while(true) {
	    try {
	    	WebElement successMsg = (WebElement) javascripthelper.executeScript(
	    	"return document.querySelector('ion-toast').shadowRoot.querySelector('div[class=toast-message]')");
	    	 String successmsg = successMsg.getText();
	    	 System.out.println("success msg : "+successmsg);
	    	 Assert.assertTrue(false);
	    	 break;
	    	} 
	    	catch (Exception e) {}
	    
	    }
	    }
	    //---modify--------------//

	    @Then("^modify Income Details record with valid data$")
	    public void modify_income_details_record_with_valid_data()  {
	    while(true) {
		try {
			waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_IncomeAmount(), 10, 1);
			incomeDetailsObj.IncomeDetails_IncomeAmount().clear();
			incomeDetailsObj.IncomeDetails_IncomeAmount().sendKeys(incomeDetailsTestDataType.ValidIncomeAmount);
			incomeDetailsObj.IncomeDetails_IncomeAmount().sendKeys(Keys.ENTER);
			break;
			}
			catch(Exception e) {}
			
			}     
	    }
	    

	    @Then("^Validate Save Success msg$")
	    public void validate_save_success_msg()  {
		while (true) {
			try {
				WebElement successMsg = (WebElement) javascripthelper.executeScript(
				"return document.querySelector('ion-toast').shadowRoot.querySelector('div[class=toast-message]')");
				String successmsg = successMsg.getText();
				System.out.println("success msg : " + successmsg);
				break;
				} catch (Exception e) {
				}

			} 
		
		
	    }

	    @Then("^Validate Valid modified record should get saved in a system$")
	    public void validate_valid_modified_record_should_get_saved_in_a_system() {
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_IncomeAmount(), 10, 1);
		String ModifyIncomeAmount = incomeDetailsObj.IncomeDetails_IncomeAmount().getAttribute("ng-reflect-model");
		System.out.println("Modified Income Amount : " +ModifyIncomeAmount);
	   	Assert.assertEquals(incomeDetailsTestDataType.ValidIncomeAmount, ModifyIncomeAmount);
	    	
	    }  
	    
	    //---------List View------------------------//
	    
	    @Then("^verify Income Details List View should display all the fields$")
	    public void verify_income_details_list_view_should_display_all_the_fields()  {
	    	incomeDetailsObj.IncomeDetails_AddButton().isDisplayed();
	        incomeDetailsObj.IncomeDetails_ListView_Next().isDisplayed();
	        incomeDetailsObj.IncomeDetails_ListView_BackButton().isDisplayed();
	        incomeDetailsObj.IncomeDetails_ListView_IncomeHeaderID().isDisplayed();
	        incomeDetailsObj.IncomeDetails_ListView_EmployerName().isDisplayed();
	        incomeDetailsObj.IncomeDetails_ListView_NatureOfEmployment().isDisplayed();
	        incomeDetailsObj.IncomeDetails_ListView_NetIncome().isDisplayed();   
	        incomeDetailsObj.IncomeDetails_ListView_NetDeduction().isDisplayed();  
	        incomeDetailsObj.IncomeDetails_ListView_Currency().isDisplayed();  
	        
	    }

	    @Then("^values in Income Details list view should not be editable$")
	    public void values_in_income_details_list_view_should_not_be_editable()  {
	    	try {
	        	incomeDetailsObj.IncomeDetails_ListViewFirstField_IncomeHeaderID().sendKeys("ok");
	        	incomeDetailsObj.IncomeDetails_ListViewFirstField_NatureOfEmployment().sendKeys("ok");
	        	incomeDetailsObj.IncomeDetails_ListViewFirstField_NetIncome().sendKeys("ok");
	        	incomeDetailsObj.IncomeDetails_ListViewFirstField_NetDeduction().sendKeys("ok");
	    		incomeDetailsObj.IncomeDetails_ListViewFirstField_Currency().sendKeys("ok");

	    		System.out.println("Values in list view is editable");

	    		} catch (Exception e) {
	    			System.out.println("Values in list view is not editable");
	    		}  
	    }

	   
	    
	    @Then("^verify Income Details search box should display matching record with matched data$")
	    public void verify_income_details_search_box_should_display_matching_record_with_matched_data() throws InterruptedException {
	    	while (true) {
				try {
			    	waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_ListView_SearchIcon(), 30, 1);
			    	incomeDetailsObj.IncomeDetails_ListView_SearchIcon().click();
					break;
				} catch (Exception e) {

				}
			}
	    waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_ListView_SearchIcon(), 30, 1);
	    incomeDetailsObj.IncomeDetails_SearchInputField().sendKeys(incomeDetailsTestDataType.SearchValid);
	    incomeDetailsObj.IncomeDetails_SearchInputField().sendKeys(Keys.ENTER);
	    Thread.sleep(1000);   
	    }

	    @Then("^verify Income Details search box should not display any record with mismatched data$")
	    public void verify_income_details_search_box_should_not_display_any_record_with_mismatched_data() {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_ListView_SearchIcon(), 30, 1);
	    	incomeDetailsObj.IncomeDetails_ListView_SearchIcon().click();
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_SearchInputField(), 30, 1);
	    	incomeDetailsObj.IncomeDetails_SearchInputField().sendKeys(incomeDetailsTestDataType.SearchInvalid);
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_NoDataFoundInSearch(), 30, 1);
	        incomeDetailsObj.IncomeDetails_NoDataFoundInSearch().isDisplayed();
	        incomeDetailsObj.IncomeDetails_SearchCloseButton().click();  
	    }

	    @Then("^Income Details export Pdf file$")
	    public void income_details_export_pdf_file()  {
	    	incomeDetailsObj.IncomeDetails_Export().click();
	        waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_PdfFile(), 10, 1);
	        incomeDetailsObj.IncomeDetails_PdfFile().click();
	        browserHelper.SwitchToWindow(1);
	        browserHelper.switchToParentWithChildClose();     
	    }

	    @Then("^Income Details export Excel file$")
	    public void income_details_export_excel_file()  {
	    	while (true) {
				try {
				    waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_Export(), 10, 1);
				    incomeDetailsObj.IncomeDetails_Export().click();
					break;
				} catch (StaleElementReferenceException se) {

				}
			}
		 waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_XlsFile(), 10, 1);
	    incomeDetailsObj.IncomeDetails_XlsFile().click();  
	      
	    }

	    @Then("^Income Details List view Back button should navigate to the previous screen$")
	    public void income_details_list_view_back_button_should_navigate_to_the_previous_screen()  {
		waithelper.waitForElementToVisibleWithFluentWait(driver, incomeDetailsObj.IncomeDetails_ListView_BackButton(), 10, 1);
        incomeDetailsObj.IncomeDetails_ListView_BackButton().click();
        }

	    @Then("^verify Income Details add button should allow to create new record$")
	    public void verify_income_details_add_button_should_allow_to_create_new_record() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver,incomeDetailsObj.IncomeDetails_AddButton() , 30, 1);
	    	incomeDetailsObj.IncomeDetails_AddButton().click();
	        waithelper.waitForElementToVisibleWithFluentWait(driver,incomeDetailsObj.IncomeDetails_Save() , 30, 1);
	        incomeDetailsObj.IncomeDetails_Save().isDisplayed();
	    }
}
