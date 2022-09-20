package stepdefinitions;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
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
import pageobjects.PersonalDetails_DisbursementMakerObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.PersonalDetails_DisbursementMakerTestDataType;

public class PersonalDetails_DisbursementMaker extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	PersonalDetails_DisbursementMakerObj PDDMObj = new PersonalDetails_DisbursementMakerObj(driver);
	PersonalDetails_DisbursementMakerTestDataType PDDMTestDataType = jsonReader.getPersonalDetails_DisbursementMakerByName("Maker");
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	JsonDataReaderWriter jsonReaderWriter = new JsonDataReaderWriter();
	String referenceID;
	
	@Then("^click on search icon of record list$")
    public void click_on_search_icon_of_record_list()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.productMaster_Product_SearchRecordList(), 60, 2);
    PDDMObj.productMaster_Product_SearchRecordList().click();
    }
	
	
	@Then("^search Personal Details Disbursement Maker record$")
    public void search_personal_details_disbursement_maker_record() throws InterruptedException {
		while(true)
    	{
    	try{
    		waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_SearchInputField(), 30, 2);
        	PDDMObj.PDDM_SearchInputField().click();   
    	    PDDMObj.PDDM_SearchInputField().sendKeys(PDDMTestDataType.ReferenceId);
    	    break;
    	}catch(Exception E){}
    	}
   Thread.sleep(1000);   
    }
	@Then("^click on inbox$")
    public void click_on_inbox()  {
    //Inbox
    
    while(true) {
    	try{
    	    waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.productMaster_Product_Inbox(), 60, 2);
    	    PDDMObj.productMaster_Product_Inbox().click(); 
    		break;
    	 }
    		catch(Exception e){}
    	}
    }
	
	@And("^maker user open the record from inbox$")
    public void maker_user_open_the_record_from_inbox() throws IOException, ParseException, InterruptedException  {
    	Thread.sleep(1000);  
    waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.productMaster_Product_ReferanceId(), 30, 2);
    referenceID = PDDMObj.productMaster_Product_ReferanceId().getText();
    jsonReaderWriter.addReferanceData(referenceID);
    System.out.println("reference Id " +referenceID);
    
    
	String beforeXpath = "//span[contains(text(),'";
	String afterXpath = "')]/../../td/button";
	
    WebElement firstRecord = driver.findElement(By.xpath(beforeXpath+jsonReaderWriter.readReferancedata()+afterXpath));
    
  while(true)
    {
    	try {
    		waithelper.waitForElementToVisibleWithFluentWait(driver, firstRecord, 30, 2);
    		firstRecord.click(); 
    	    break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
	 

    }

	
	@Then("^click on search icon$")
    public void click_on_search_icon()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.productMaster_Product_Search(), 60, 2);
    PDDMObj.productMaster_Product_Search().click();     
    }


    @Then("^click on Customer Details Segment button$")
    public void click_on_customer_details_segment_button()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_SegmentButton(), 30, 2);
    	PDDMObj.PDDM_CustomerDetails_SegmentButton().isDisplayed();
    	PDDMObj.PDDM_CustomerDetails_SegmentButton().click();
    }
    @Then("^open Customer Details record$")
    public void open_customer_details_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_ActionEdit(), 30, 2);
    	PDDMObj.PDDM_CustomerDetails_ActionEdit().isDisplayed();  
    	PDDMObj.PDDM_CustomerDetails_ActionEdit().click();  
    }
    @Then("^verify the field Customer Type$")
    public void verify_the_field_customer_type() {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_CustomerType(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_CustomerType().getText(); 
    	System.out.println("Customer Type expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.CustomerType, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_CustomerType().click();
//        	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_CustomerTypeDropdown(), 30, 2);
//        	PDDMObj.PDDM_CustomerDetails_CustomerTypeDropdown().click();
        	System.out.println("Editable");

		} catch (Exception e) {
			System.out.println("Read only mode");
		}
    	
    }
    
    @Then("^verify the field Applicant Type$")
    public void verify_the_field_applicant_type()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_ApplicantType(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_ApplicantType().getText(); 
    	System.out.println("Applicant Type expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.ApplicantType, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_ApplicantType().click();
//        	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_ApplicantTypeDropdown(), 30, 2);
//        	PDDMObj.PDDM_CustomerDetails_ApplicantTypeDropdown().click();
        	System.out.println("Editable");

		} catch (Exception e) {
			System.out.println("Read only mode");
		}    
    }

    @Then("^verify the field Salutation$")
    public void verify_the_field_salutation()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Salutation(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_Salutation().getText();
    	System.out.println("Salutation expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.Salutation, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_Salutation().click();
//        	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_SalutationDropdown(), 30, 2);
//        	PDDMObj.PDDM_CustomerDetails_SalutationDropdown().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}    
    }

    @Then("^verify the field First Name$")
    public void verify_the_field_first_name() throws InterruptedException  {
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_FirstName(), 30, 2);
    String expected = PDDMObj.PDDM_CustomerDetails_FirstName().getText();
    System.out.println("First Name " +expected);
//    Assert.assertEquals(PDDMTestDataType.FirstName, expected);
//    	
//    	try {
//    		PDDMObj.PDDM_CustomerDetails_FirstName().sendKeys("ok");
//			System.out.println("Editable");
//
//		} catch (Exception e) {
//			System.out.println("Read only mode");
//		}    
    }

    @Then("^verify the field Middle Name$")
    public void verify_the_field_middle_name()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_MiddleName(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_MiddleName().getText(); 
    	Assert.assertEquals(PDDMTestDataType.MiddleName, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_MiddleName().sendKeys("ok");
			System.out.println("Editable");

		} catch (Exception e) {
			System.out.println("Read only mode");
		}   
    }

    @Then("^verify the field Last Name$")
    public void verify_the_field_last_name()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_LastName(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_LastName().getText(); 
    	Assert.assertEquals(PDDMTestDataType.LastName, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_LastName().sendKeys("ok");
			System.out.println("Editable");

		} catch (Exception e) {
			System.out.println("Read only mode");
		}  
    }

    @Then("^verify the field Date Of Birth$")
    public void verify_the_field_date_of_birth()  {
        
    }

    @Then("^verify the field Gender$")
    public void verify_the_field_gender()  {
    	//javascripthelper.scrollIntoView(PDDMObj.PDDM_CustomerDetails_Gender());
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Gender(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_Gender().getText();
    	System.out.println("Gender expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.Gender, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_Gender().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}
    }

    @Then("^verify the field Edcuation Level$")
    public void verify_the_field_edcuation_level()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_EdcuationLevel(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_EdcuationLevel().getText();
    	System.out.println("EdcuationLevel expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.EdcuationLevel, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_EdcuationLevel().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}  
    }

    @Then("^verify the field Marital Status$")
    public void verify_the_field_marital_status()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_MaritalStatus(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_MaritalStatus().getText();
    	System.out.println("MaritalStatus expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.MaritalStatus, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_MaritalStatus().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}     
    }

    @Then("^verify the field Nationality$")
    public void verify_the_field_nationality()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Nationality(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_Nationality().getText();
    	System.out.println("Nationality expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.Nationality, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_Nationality().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}   
    }

    @Then("^verify the field Ethinicity$")
    public void verify_the_field_ethinicity()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Ethinicity(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_Ethinicity().getText();
    	System.out.println("Ethinicity expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.Ethinicity, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_Ethinicity().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}      
    }

    @Then("^verify the field Religion$")
    public void verify_the_field_religion()  {
    	javascripthelper.scrollIntoView(PDDMObj.PDDM_CustomerDetails_Religion());
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Religion(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_Religion().getText();
    	System.out.println("Religion expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.Religion, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_Religion().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}   
    }

    @Then("^verify the field Resident Status$")
    public void verify_the_field_resident_status()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_ResidentStatus(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_ResidentStatus().getText();
    	System.out.println("ResidentStatus expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.ResidentStatus, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_ResidentStatus().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}  
    }
    
    @Then("^verify the field Language$")
    public void verify_the_field_language()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Language(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_Language().getText();
    	System.out.println("Language expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.Language, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_Language().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}   
    }

    @Then("^verify the field Type of Residence$")
    public void verify_the_field_type_of_residence()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_TypeOfResidence(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_TypeOfResidence().getText();
    	System.out.println("Type Of Residence expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.TypeOfResidence, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_TypeOfResidence().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}   
    }

    @Then("^verify the field Category of Client$")
    public void verify_the_field_category_of_client()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_CategoryOfClient(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_CategoryOfClient().getText();
    	System.out.println("Category of Client expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.CategoryOfClient, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_CategoryOfClient().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		} 
    }
    
    
    @Then("^verify the toggle BlackListed$")
    public void verify_the_toggle_blacklisted()  {
    	try {
        	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_BlackListed(), 30, 2);
        	PDDMObj.PDDM_CustomerDetails_BlackListed().click();
        	System.out.println("Editable");
		} catch (Exception e) {
			System.out.println("Read only mode");
		}   
    }
    
    
    //----------------------List View-------------------------//
    
    @Then("^verify Personal Details Disbursement Maker List View should display all the fields$")
    public void verify_personal_details_disbursement_maker_list_view_should_display_all_the_fields()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,PDDMObj.PDDM_CustomerDetails_BackButton() , 30, 1);
        PDDMObj.PDDM_CustomerDetails_BackButton().isDisplayed();
    	waithelper.waitForElementToVisibleWithFluentWait(driver,PDDMObj.PDDM_CustomerDetails_Export() , 30, 1);
        PDDMObj.PDDM_CustomerDetails_Export().isDisplayed();
        PDDMObj.PDDM_CustomerDetails_Export().click();


        while (true) {
    		try {
    		
    	    waithelper.waitForElementToVisibleWithFluentWait(driver,PDDMObj.PDDM_CustomerDetails_PdfFile(), 30, 1);
    	    PDDMObj.PDDM_CustomerDetails_PdfFile().isDisplayed();
    	    PDDMObj.PDDM_CustomerDetails_XlsFile().isDisplayed();
    	    PDDMObj.PDDM_CustomerDetails_Export().click();
    	    break;
    		} catch (StaleElementReferenceException se) {
    		}
    		
        }
    	
        PDDMObj.PDDM_CustomerDetails_ListView_CIF_ID().isDisplayed();
        PDDMObj.PDDM_CustomerDetails_ListView_FirstName().isDisplayed();
        PDDMObj.PDDM_CustomerDetails_ListView_MiddleName().isDisplayed();
        PDDMObj.PDDM_CustomerDetails_ListView_LastName().isDisplayed();
        PDDMObj.PDDM_CustomerDetails_ListView_CustomerType().isDisplayed();
        PDDMObj.PDDM_CustomerDetails_ListView_ApplicantType().isDisplayed();
        PDDMObj.PDDM_CustomerDetails_ListView_Status().isDisplayed();
        

    }
	
    @Then("^values in Personal Details Disbursement Maker list view should not be editable$")
    public void values_in_personal_details_disbursement_maker_list_view_should_not_be_editable()  {
    	try {
    	PDDMObj.PDDM_CustomerDetails_ListViewFirstField_FirstName().sendKeys("ok");
    	PDDMObj.PDDM_CustomerDetails_ListViewFirstField_MiddleName().sendKeys("ok");
    	PDDMObj.PDDM_CustomerDetails_ListViewFirstField_LastName().sendKeys("ok");
    	PDDMObj.PDDM_CustomerDetails_ListViewFirstField_CustomerType().sendKeys("ok");
		PDDMObj.PDDM_CustomerDetails_ListViewFirstField_ApplicantType().sendKeys("ok");

		System.out.println("Values in list view is editable");

		} catch (Exception e) {
			System.out.println("Values in list view is not editable");
		}
    }

    @Then("^Personal Details Disbursement Maker export Pdf file$")
    public void personal_details_disbursement_maker_export_pdf_file()  {
    	PDDMObj.PDDM_CustomerDetails_Export().click();
        waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_PdfFile(), 30, 1);
        PDDMObj.PDDM_CustomerDetails_PdfFile().click();
        browserHelper.SwitchToWindow(1);
        browserHelper.switchToParentWithChildClose();   
    }

    @Then("^Personal Details Disbursement Maker export Excel file$")
    public void personal_details_disbursement_maker_export_excel_file()  {
    	while (true) {
			try {
			    waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Export(), 30, 1);
			    PDDMObj.PDDM_CustomerDetails_Export().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
	 waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_XlsFile(), 30, 1);
    PDDMObj.PDDM_CustomerDetails_XlsFile().click();  
    }
    
    
    @Then("^clicking on Back button system should navigate to the previous screen$")
    public void clicking_on_back_button_system_should_navigate_to_the_previous_screen()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,PDDMObj.PDDM_CustomerDetails_ListView_BackButton() , 30, 1);
        PDDMObj.PDDM_CustomerDetails_ListView_BackButton().click(); 
    }
	
    //---------Modify----//
    

    @Then("^modification of Customer details record System should not allow$")
    public void modification_of_customer_details_record_system_should_not_allow()   {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_CustomerType(), 30, 2);
    	String expected = PDDMObj.PDDM_CustomerDetails_CustomerType().getText(); 
    	System.out.println("Customer Type expected " +expected);
    	Assert.assertEquals(PDDMTestDataType.CustomerType, expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_CustomerType().click();
        	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_CustomerTypeDropdown(), 30, 2);
        	PDDMObj.PDDM_CustomerDetails_CustomerTypeDropdown().click();
        	System.out.println("Editable");

		} catch (Exception e) {
			System.out.println("Read only mode");
		}   
    }
    
    
    @Then("^click on Back button of Customer Details record$")
    public void click_on_back_button_of_customer_details_record() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,PDDMObj.PDDM_CustomerDetails_BackButton() , 30, 1);
        PDDMObj.PDDM_CustomerDetails_BackButton().click();    
    }
    
   //-------Add button-------------//
    
    @Then("^verify the availability of Add button on customer details tab$")
    public void verify_the_availability_of_add_button_on_customer_details_tab(){
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.AddButton(), 10, 1);
		PDDMObj.AddButton().click();
		System.out.println("add button present");
			Assert.assertTrue(false);
 
    }
}
