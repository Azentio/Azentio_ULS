package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.PersonalDetails_DisbursementMakerObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.ExcelReader;
import resources.JsonDataReaderWriter;
import testDataType.PersonalDetails_DisbursementMakerTestDataType;

public class PersonalDetails_DisbursementMaker extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	PersonalDetails_DisbursementMakerObj PDDMObj = new PersonalDetails_DisbursementMakerObj(driver);
//	PersonalDetails_DisbursementMakerTestDataType PDDMTestDataType = jsonReader.getPersonalDetails_DisbursementMakerByName("Maker");
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	SoftAssert  softAssert = new SoftAssert();
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00089\\Downloads\\TestDataDesignSample.xlsx","PDDMTestData", "Data Set ID");
	Map<String, String> testData;
	
	@And("^User click on Corporate and select LOS option$")
    public void user_click_on_corporate_and_select_los_option()   {
		for(int i=1; i<=10; i++)
    	{
    	try{
    		waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_Corporate(), 10, 1);
        	PDDMObj.PDDM_Corporate().click(); 
        	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_LOS(), 10, 1);
        	PDDMObj.PDDM_LOS().click(); 
        	break;
    	}catch(Exception E){}
    	} 
    }
	
	@Then("^search Personal Details Disbursement Maker record$")
    public void search_personal_details_disbursement_maker_record() throws InterruptedException {
		while(true)
    	{
    	try{
    		waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_SearchInputField(), 10, 1);
        	PDDMObj.PDDM_SearchInputField().click(); 
        	testData = excelData.getTestdata("AT-PDM-001_D1");
	    	String referenceID = testData.get("Reference ID");
    	    PDDMObj.PDDM_SearchInputField().sendKeys(referenceID);
    	    break;
    	}catch(Exception E){}
    	}
   //Thread.sleep(1000);   
    }
	

    @Then("^click on Customer Details Segment button$")
    public void click_on_customer_details_segment_button()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_SegmentButton(), 10, 1);
    	PDDMObj.PDDM_CustomerDetails_SegmentButton().isDisplayed();
    	PDDMObj.PDDM_CustomerDetails_SegmentButton().click();
    }
    @Then("^open Customer Details record$")
    public void open_customer_details_record()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_ActionEdit(), 10, 1);
    	PDDMObj.PDDM_CustomerDetails_ActionEdit().isDisplayed();  
    	PDDMObj.PDDM_CustomerDetails_ActionEdit().click();  
    }
    @Then("^verify the field Customer Type$")
    public void verify_the_field_customer_type() throws InterruptedException {
    waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_CustomerType(), 10, 1);
    String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[3].shadowRoot.querySelector('div.select-text').innerText").toString();
    System.out.println(expected);
    
    testData = excelData.getTestdata("AT-PDM-001_D1");
	String customerType = testData.get("Customer Type");
	
    Assert.assertEquals(customerType, expected);
    		
    boolean status = PDDMObj.PDDM_CustomerDetails_CustomerType().getAttribute("ng-reflect-is-disabled").equals("true");
    softAssert.assertTrue(status, "Customer Type field is readonly mode");
    
    }
    
    @Then("^verify the field Applicant Type$")
    public void verify_the_field_applicant_type()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_ApplicantType(), 10, 1);
    String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[4].shadowRoot.querySelector('div.select-text').innerText").toString();
    System.out.println(expected);
    
    testData = excelData.getTestdata("AT-PDM-001_D1");
	String applicantType = testData.get("Applicant Type");
	
    Assert.assertEquals(applicantType, expected);
        		
    boolean status = PDDMObj.PDDM_CustomerDetails_ApplicantType().getAttribute("ng-reflect-is-disabled").equals("true");
    softAssert.assertTrue(status, "Applicant Type field is readonly mode");
      
    }

    @Then("^verify the field Salutation$")
    public void verify_the_field_salutation()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Salutation(), 10, 1);
    String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[5].shadowRoot.querySelector('div.select-text').innerText").toString();
    System.out.println(expected);
    
    testData = excelData.getTestdata("AT-PDM-001_D1");
	String salutation = testData.get("Salutation");
	
    Assert.assertEquals(salutation, expected);
    	        		
    boolean status = PDDMObj.PDDM_CustomerDetails_Salutation().getAttribute("ng-reflect-is-disabled").equals("true");
    softAssert.assertTrue(status, "Salutation field is readonly mode");
      
    }

    @Then("^verify the field First Name$")
    public void verify_the_field_first_name() throws InterruptedException  {
    	
    String firstNameExpected =javascripthelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[1].value").toString();
    
    testData = excelData.getTestdata("AT-PDM-001_D1");
	String firstName = testData.get("First Name");
	
    Assert.assertEquals(firstName, firstNameExpected);
    
    boolean result = PDDMObj.PDDM_CustomerDetails_FirstName().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
	softAssert.assertTrue(result , "FirstName field is read only mode");  
    
   }

    @Then("^verify the field Middle Name$")
    public void verify_the_field_middle_name()  {
    String middleNameExpected =javascripthelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[2].value").toString();
    testData = excelData.getTestdata("AT-PDM-001_D1");
	String middleName = testData.get("Middle Name");
    Assert.assertEquals(middleName, middleNameExpected);
    boolean result = PDDMObj.PDDM_CustomerDetails_MiddleName().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
	softAssert.assertTrue(result , "Middle Name field is read only mode");  
    	
    	
    }

    @Then("^verify the field Last Name$")
    public void verify_the_field_last_name()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_LastName(), 10, 1);
    	String lastNameExpected =javascripthelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[3].value").toString();
    	testData = excelData.getTestdata("AT-PDM-001_D1");
    	String lastName = testData.get("Last Name");
    	Assert.assertEquals(lastName, lastNameExpected);
    	boolean result = PDDMObj.PDDM_CustomerDetails_LastName().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "LastName field is read only mode"); 
    }
    

    @Then("^verify the field Date Of Birth$")
    public void verify_the_field_date_of_birth()  {
    	String dateOfBirthExpected = javascripthelper.executeScript("return document.querySelector(\"#icon\").value").toString();
        System.out.println(dateOfBirthExpected);
        testData = excelData.getTestdata("AT-PDM-001_D1");
    	String dateOfBirth = testData.get("Date Of Birth");
    	Assert.assertEquals(dateOfBirth, dateOfBirthExpected);
    	boolean result = PDDMObj.PDDM_CustomerDetails_DateOfBirth().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Date Of Birth field is read only mode");  
    }

    @Then("^verify the field Gender$")
    public void verify_the_field_gender()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Gender(), 10, 1);
        String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[7].shadowRoot.querySelector('div.select-text').innerText").toString();
        System.out.println(expected);
        testData = excelData.getTestdata("AT-PDM-001_D1");
    	String gender = testData.get("Gender");
        Assert.assertEquals(gender, expected);
        	        		
        boolean status = PDDMObj.PDDM_CustomerDetails_Gender().getAttribute("ng-reflect-is-disabled").equals("true");
        softAssert.assertTrue(status, "Gender field is readonly mode");
         
    }

    @Then("^verify the field Edcuation Level$")
    public void verify_the_field_edcuation_level()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_EdcuationLevel(), 10, 1);
        String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[8].shadowRoot.querySelector('div.select-text').innerText").toString();
        System.out.println(expected);
        testData = excelData.getTestdata("AT-PDM-001_D1");
    	String edcuationLevel = testData.get("Edcuation Level");
        Assert.assertEquals(edcuationLevel, expected);
        	        		
        boolean status = PDDMObj.PDDM_CustomerDetails_EdcuationLevel().getAttribute("ng-reflect-is-disabled").equals("true");
        softAssert.assertTrue(status, "Edcuation Level field is readonly mode");
      
    }

    @Then("^verify the field Marital Status$")
    public void verify_the_field_marital_status()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_MaritalStatus(), 10, 1);
        String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[9].shadowRoot.querySelector('div.select-text').innerText").toString();
        System.out.println(expected);
        testData = excelData.getTestdata("AT-PDM-001_D1");
    	String maritalStatus = testData.get("Marital Status");
        Assert.assertEquals(maritalStatus, expected);
        	        		
        boolean status = PDDMObj.PDDM_CustomerDetails_MaritalStatus().getAttribute("ng-reflect-is-disabled").equals("true");
        softAssert.assertTrue(status, "Marital Status field is readonly mode");
           
    }

    @Then("^verify the field Nationality$")
    public void verify_the_field_nationality()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Nationality(), 10, 1);
        String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[10].shadowRoot.querySelector('div.select-text').innerText").toString();
        System.out.println(expected);
        testData = excelData.getTestdata("AT-PDM-001_D1");
    	String nationality = testData.get("Nationality");
        Assert.assertEquals(nationality, expected);
        	        		
        boolean status = PDDMObj.PDDM_CustomerDetails_Nationality().getAttribute("ng-reflect-is-disabled").equals("true");
        softAssert.assertTrue(status, "Nationality field is readonly mode");
          
    }
    @Then("^verify the field Category$")
    public void verify_the_field_category() {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Category(), 10, 1);
        String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[11].shadowRoot.querySelector('div.select-text').innerText").toString();
        System.out.println(expected);
        testData = excelData.getTestdata("AT-PDM-001_D1");
    	String category = testData.get("Category");
        Assert.assertEquals(category, expected);
        	        		
        boolean status = PDDMObj.PDDM_CustomerDetails_Category().getAttribute("ng-reflect-is-disabled").equals("true");
        softAssert.assertTrue(status, "Category field is readonly mode");   
    }
   

    @Then("^verify the field Religion$")
    public void verify_the_field_religion()  {
    	javascripthelper.scrollIntoView(PDDMObj.PDDM_CustomerDetails_Religion());
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Religion(), 10, 1);
        String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[12].shadowRoot.querySelector('div.select-text').innerText").toString();
        System.out.println(expected);
        testData = excelData.getTestdata("AT-PDM-001_D1");
    	String religion = testData.get("Religion");
        Assert.assertEquals(religion, expected);
        	        		
        boolean status = PDDMObj.PDDM_CustomerDetails_Religion().getAttribute("ng-reflect-is-disabled").equals("true");
        softAssert.assertTrue(status, "Religion field is readonly mode");      
    }

    @Then("^verify the field Resident Status$")
    public void verify_the_field_resident_status()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_ResidentStatus(), 10, 1);
    	String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[13].shadowRoot.querySelector('div.select-text').innerText").toString();
        System.out.println(expected);
        testData = excelData.getTestdata("AT-PDM-001_D1");
    	Assert.assertEquals(testData.get("Resident Status"), expected);
        	        		
        boolean status = PDDMObj.PDDM_CustomerDetails_ResidentStatus().getAttribute("ng-reflect-is-disabled").equals("true");
        softAssert.assertTrue(status, "Status field is readonly mode");      
    }
    
    @Then("^verify the field Language$")
    public void verify_the_field_language()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Language(), 10, 1);
    	String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[14].shadowRoot.querySelector('div.select-text').innerText").toString();
        System.out.println(expected);
        
        testData = excelData.getTestdata("AT-PDM-001_D1");
    	Assert.assertEquals(testData.get("Language"), expected);
        	        		
        boolean status = PDDMObj.PDDM_CustomerDetails_Language().getAttribute("ng-reflect-is-disabled").equals("true");
        softAssert.assertTrue(status, "Language field is readonly mode");      
    }
    
    @Then("^verify the field No of Dependents$")
    public void verify_the_field_no_of_dependents()  {
    String noofDependents =javascripthelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[11].value").toString();
    testData = excelData.getTestdata("AT-PDM-001_D1");
    Assert.assertEquals(testData.get("No of Dependents"), noofDependents);
    boolean status = PDDMObj.PDDM_CustomerDetails_MothersMaidenName().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
    softAssert.assertTrue(status , "No of Dependents field is read only mode");    
    }

    @Then("^verify the field Mothers Maiden Name$")
    public void verify_the_field_mothers_maiden_name() {
    String mothersMaidenName =javascripthelper.executeScript("return document.getElementsByClassName('native-input sc-ion-input-ios')[12].value").toString();
    testData = excelData.getTestdata("AT-PDM-001_D1");
    Assert.assertEquals(testData.get("Mothers Maiden Name"), mothersMaidenName);
    boolean status = PDDMObj.PDDM_CustomerDetails_MothersMaidenName().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
	softAssert.assertTrue(status , "Mothers Maiden Name field is read only mode");
    }

    @Then("^verify the field Type of Residence$")
    public void verify_the_field_type_of_residence()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_TypeOfResidence(), 10, 1);
    	String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[15].shadowRoot.querySelector('div.select-text').innerText").toString();
        System.out.println(expected);
        testData = excelData.getTestdata("AT-PDM-001_D1");
        Assert.assertEquals(testData.get("Type of Residence"), expected);
        	        		
        boolean status = PDDMObj.PDDM_CustomerDetails_TypeOfResidence().getAttribute("ng-reflect-is-disabled").equals("true");
        softAssert.assertTrue(status, "Residence field is readonly mode");     
    }

    @Then("^verify the field Industry Segmentation$")
    public void verify_the_field_industry_segmentation()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_IndustrySegmentation(), 10, 1);
    	String expected = javascripthelper.executeScript("return document.querySelectorAll('ion-select')[16].shadowRoot.querySelector('div.select-text').innerText").toString();
        System.out.println(expected);
        testData = excelData.getTestdata("AT-PDM-001_D1");
        Assert.assertEquals(testData.get("Industry Segmentation"), expected);
        	        		
        boolean status = PDDMObj.PDDM_CustomerDetails_IndustrySegmentation().getAttribute("ng-reflect-is-disabled").equals("true");
        softAssert.assertTrue(status, "IndustrySegmentation field is readonly mode"); 
        softAssert.assertAll();
    }
    
    
    @Then("^verify the toggle BlackListed$")
    public void verify_the_toggle_blacklisted()  {
    	try {
        	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_BlackListed(), 10, 1);
        	PDDMObj.PDDM_CustomerDetails_BlackListed().click();
        	
        	Assert.fail("BlackListed field is Editable");
		} catch (Exception e) {
			System.out.println("BlackListed field is Read only mode");
		}   
    }
    
    
    //----------------------List View-------------------------//
    
    @Then("^verify Personal Details Disbursement Maker List View should display all the fields$")
    public void verify_personal_details_disbursement_maker_list_view_should_display_all_the_fields()  {
//    	waithelper.
    	waithelper.waitForElementToVisibleWithFluentWait(driver,PDDMObj.PDDM_CustomerDetails_BackButton() , 10, 1);
//        PDDMObj.PDDM_CustomerDetails_BackButton().isDisplayed();
    	waithelper.waitForElementToVisibleWithFluentWait(driver,PDDMObj.PDDM_CustomerDetails_Export() , 10, 1);
        PDDMObj.PDDM_CustomerDetails_Export().isDisplayed();
        PDDMObj.PDDM_CustomerDetails_Export().click();


        while (true) {
    		try {
    		
    	    waithelper.waitForElementToVisibleWithFluentWait(driver,PDDMObj.PDDM_CustomerDetails_PdfFile(), 10, 1);
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
        waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_PdfFile(), 10, 1);
        PDDMObj.PDDM_CustomerDetails_PdfFile().click();
        browserHelper.SwitchToWindow(1);
        browserHelper.switchToParentWithChildClose();   
    }

    @Then("^Personal Details Disbursement Maker export Excel file$")
    public void personal_details_disbursement_maker_export_excel_file()  {
    	while (true) {
			try {
			    waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_Export(), 10, 1);
			    PDDMObj.PDDM_CustomerDetails_Export().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
	 waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_XlsFile(), 10, 1);
    PDDMObj.PDDM_CustomerDetails_XlsFile().click();  
    }
    
    
    @Then("^clicking on Back button system should navigate to the previous screen$")
    public void clicking_on_back_button_system_should_navigate_to_the_previous_screen()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,PDDMObj.PDDM_CustomerDetails_ListView_BackButton() , 10, 1);
        PDDMObj.PDDM_CustomerDetails_ListView_BackButton().click(); 
    }
	
    //---------Modify----//
    

    @Then("^modification of Customer details record System should not allow$")
    public void modification_of_customer_details_record_system_should_not_allow()   {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_CustomerType(), 10, 1);
    	String expected = PDDMObj.PDDM_CustomerDetails_CustomerType().getText(); 
    	System.out.println("Customer Type expected " +expected);
    	testData = excelData.getTestdata("AT-PDM-001_D1");
//    	String customerType = testData.get("Customer Type");
    	Assert.assertEquals(testData.get("Customer Type"), expected);
    	
    	try {
    		PDDMObj.PDDM_CustomerDetails_CustomerType().click();
        	waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.PDDM_CustomerDetails_CustomerTypeDropdown(), 10, 1);
        	PDDMObj.PDDM_CustomerDetails_CustomerTypeDropdown().click();
        	System.out.println("Modification allowed");
        	Assert.assertTrue(false);

		} catch (Exception e) {
			System.out.println("Modification not allowed");
		}   
    }
    
    
    @Then("^click on Back button of Customer Details record$")
    public void click_on_back_button_of_customer_details_record() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,PDDMObj.PDDM_CustomerDetails_BackButton() , 10, 1);
        PDDMObj.PDDM_CustomerDetails_BackButton().click();    
    }
    
   //-------Add button-------------//
    
    @Then("^verify the availability of Add button on customer details tab$")
    public void verify_the_availability_of_add_button_on_customer_details_tab(){
    	while(true){	
			try {
		waithelper.waitForElementToVisibleWithFluentWait(driver, PDDMObj.AddButton(), 10, 1);
		PDDMObj.AddButton().isDisplayed();
		//System.out.println("add button present");
		Assert.fail("add button present");
//			Assert.assertTrue(false);
			} catch (Exception e) {
			}
			System.out.println("add button is not present");

		}
    }
}
