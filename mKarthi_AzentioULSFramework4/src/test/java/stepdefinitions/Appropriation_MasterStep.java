package stepdefinitions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
import pageobjects.Appropriation_MasterObj;
import pageobjects.Asset_CD_MasterOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.AppropriationMasterTestDataType;
import testDataType.Asset_CD_MasterTestDataType;
import testDataType.KULS_Login_TestDataType;

public class Appropriation_MasterStep {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Checker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Appropriation_MasterObj appropriation = new Appropriation_MasterObj(driver);
	FindFieldisMandatoryorNot mandatoryornot = new FindFieldisMandatoryorNot(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	AppropriationMasterTestDataType appropriationjson = jsonConfig.getAppropriationMasterListByName("Maker");
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","AppropriationMasterTestData","Data Set ID");
	Map<String, String> testData;
	Map<String, String> AppropriationMasterTestData = new HashMap<>();
	
	
	@Then("^User click the config manager in Appropriation master$")
    public void user_click_the_config_manager_in_appropriation_master() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, appropriation.ConfigManager(), 60, 5);
		appropriation.ConfigManager().click();
		
    }
	@And("^User search the appropriation master in inbox$")
    public void user_search_the_appropriation_master_in_inbox() throws Throwable {
        
		testData = excelData.getTestdata("AT-AM-T002-D1");
    	for (int i = 0; i < 20; i++) {
			try {
				appropriation.searchiconreferenceid().click();
				appropriation.searchsentkeys().sendKeys(testData.get("Inbox Search"));
				break;
				
			} catch (Exception e) {

			}
		}
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.referenceid(), 60, 5);
    	System.out.println(appropriation.referenceid().getText());
		String ref1 = appropriation.referenceid().getText();
		String ref2 = ref1.substring(0);
		excelData.updateTestData("AT-AM-002-D4","Reference ID",ref2);
		json.addReferanceData(ref2);
		testData = excelData.getTestdata("AT-ACD-T001_D1");


    }
	@And("^User get the reference id in appropriation master test case2$")
    public void user_get_the_reference_id_in_appropriation_master_test_case2() throws Throwable {
		testData = excelData.getTestdata("AT-AM-T002-D1");
		help.waitForElementToVisibleWithFluentWait(driver, appropriation.referenceid(), 60, 5);
    	System.out.println(appropriation.referenceid().getText());
		String ref1 = appropriation.referenceid().getText();
		String ref2 = ref1.substring(0);
		excelData.updateTestData("AT-AM-T002-D1","Reference ID",ref2);
		//json.addReferanceData(ref2);
		//testData = excelData.getTestdata("AT-ACD-T001_D1");
    }


    @And("^User click the first record in appropriation master$")
    public void user_click_the_first_record_in_appropriation_master() throws Throwable {
    	
    	for(int i=0; i<20; i++) {
			try {
				appropriation.inboxediticon().click();
				break;
			} catch (Exception e) {
				
			}
		}
       
    	
    }


    @And("^User click the Appropriation master edit icon$")
    public void user_click_the_appropriation_master_edit_icon() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, appropriation.appropriationEditIcon(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			appropriation.appropriationEditIcon().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
		
    	
        
    }

    @And("^User click the add icon in Appropriation master$")
    public void user_click_the_add_icon_in_appropriation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.Addicon(), 60, 5);
		appropriation.Addicon().click();
        
    }

    @And("^User enter the values in description for Appropriation master$")
    public void user_enter_the_values_in_description_for_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T001-D1");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.Description(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Description");
		appropriation.Description().click();
		appropriation.Description().sendKeys(testData.get("Description"));
		
    	
        
    }

    @And("^User enter the values in Appropriation Type for Appropriation master$")
    public void user_enter_the_values_in_appropriation_type_for_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T001-D1");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.AppropriationType(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Appropriation Type");
		appropriation.AppropriationType().click(); 
    	
    	String xpath = "//ion-label[contains(text(),'"+testData.get("Appropriation Type")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
    	
        
    }

    @And("^User enter the values in Remarks for Appropriation master$")
    public void user_enter_the_values_in_remarks_for_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T001-D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, appropriation.AppropriationRemarks(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Remarks");
		for(int i=0; i<20; i++) {
			try {
				appropriation.AppropriationRemarks().click(); 
				appropriation.AppropriationRemarks().sendKeys(testData.get("Remarks"));
				break;
			} catch (Exception e) {
				
			}
		}
    	
    	
        
    }

    @And("^User click the save icon in Appropriation master$")
    public void user_click_the_save_icon_in_appropriation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.Appropriation_NewSave(), 60, 5);
		appropriation.Appropriation_NewSave().click(); 
        
    }
    @And("^User get the save confirmation msg1 in Appropriation master$")
    public void user_get_the_save_confirmation_msg1_in_appropriation_master() throws Throwable {
    	for(int i=0; i<50; i++) {
    		try {
    			appropriation.makerconfirmmsg1().getText();	
    		    System.out.println(appropriation.makerconfirmmsg1().getText());
    		    break;
			} catch (Exception e) {
				
			}
    	}
	    
	    help.waitForElementToVisibleWithFluentWait(driver, appropriation.successcancel(), 60, 5);
	    appropriation.successcancel().click();
    	      
        
    }

    @And("^User get the save confirmation msg in Appropriation master$")
    public void user_get_the_save_confirmation_msg_in_appropriation_master() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, appropriation.makerconfirmmsg(), 60, 5);
		
    	for(int i=0; i<50; i++) {
    		try {
    			appropriation.makerconfirmmsg().getText();	
    		    System.out.println(appropriation.makerconfirmmsg().getText());
    		    break;
			} catch (Exception e) {
				
			}
    	}
	    
	    help.waitForElementToVisibleWithFluentWait(driver, appropriation.successcancel(), 60, 5);
	    appropriation.successcancel().click();
    	      
    }

    @And("^User click the action edit icon in Appropriation master$")
    public void user_click_the_action_edit_icon_in_appropriation_master() throws Throwable {
    	Thread.sleep(2000);
    	//help.waitForElementToVisibleWithFluentWait(driver, appropriation.listviewpencil(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			appropriation.listviewpencil().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
		 
        
    }

    @And("^User click the add icon in list of Appropriation details for Appropriation master$")
    public void user_click_the_add_icon_in_list_of_appropriation_details_for_appropriation_master() throws Throwable {
    	Thread.sleep(2000);
    	//help.waitForElementToVisibleWithFluentWait(driver, appropriation.Addicon(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			appropriation.ListAddicon().click(); 
    			break;
			} catch (Exception e) {
				
			}
    	}
		
    	
        
    }

    @And("^User enter the values in due type for Appropriation master$")
    public void user_enter_the_values_in_due_type_for_appropriation_master() throws Throwable {
    	testData = excelData.getTestdata("AT-AM-T001-D1");
    	//testData = excelData.getTestdata("AT-AM-001-D4");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.DueType(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Due Type");
		appropriation.DueType().click(); 
    	
    	
    	String xpath1 = "//ion-label[contains(text(),'"+testData.get("Due Type")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath1)));
				driver.findElement(By.xpath(xpath1)).click();
				break;

			} catch (Exception e) {

			}
		}
        
    }

    @And("^User enter the values in sequence no for Appropriation master$")
    public void user_enter_the_values_in_sequence_no_for_appropriation_master() throws Throwable {
    	testData = excelData.getTestdata("AT-AM-T001-D1");
    	//testData = excelData.getTestdata("AT-AM-001-D4");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.SequenceNo(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Sequence No");
		for(int i=0; i<20; i++) {
			try {
				appropriation.SequenceNo().click(); 
				appropriation.SequenceNo().sendKeys(testData.get("Sequence No"));
				break;
			} catch (Exception e) {
				
			}
		}
    	
    	
        
    }

    @And("^User enter the values in parent sequence no for Appropriation master$")
    public void user_enter_the_values_in_parent_sequence_no_for_appropriation_master() throws Throwable {
    	testData = excelData.getTestdata("AT-AM-T001-D1");
    	//testData = excelData.getTestdata("AT-AM-001-D4");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.ParentSequenceNo(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Parent Sequence No");
		appropriation.ParentSequenceNo().click(); 
		appropriation.ParentSequenceNo().sendKeys(testData.get("Parent Sequence No"));
        
    }

    @And("^User enter the values in list of appropriation remarks for Appropriation master$")
    public void user_enter_the_values_in_list_of_appropriation_remarks_for_appropriation_master() throws Throwable {
    	testData = excelData.getTestdata("AT-AM-T001-D1");
    	//testData = excelData.getTestdata("AT-AM-001-D4");
    	//help.waitForElementToVisibleWithFluentWait(driver, appropriation.AppropriationRemarks(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Remarks");
    	for(int i=0; i<20; i++) {
    		try {
    			appropriation.AppropriationRemarks1().click(); 
    			appropriation.AppropriationRemarks1().sendKeys(testData.get("List Remarks"));
    			break;
			} catch (Exception e) {
				
			}
    	}
		
    	
        
    }
    @And("^User click the status icon in appropriation master$")
    public void user_click_the_status_icon_in_appropriation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.StatusDeactivation(), 60, 5);
    	appropriation.StatusDeactivation().click();
       
    }

    @And("^User click the UpdateSave icon in Appropriation master$")
    public void user_click_the_updatesave_icon_in_appropriation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.UpdateSave(), 60, 5);
    	appropriation.UpdateSave().click();
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.successcancel(), 60, 5);
	    appropriation.successcancel().click();
        
    }
    @And("^User click the cancel icon in appropriation master$")
    public void user_click_the_cancel_icon_in_appropriation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.Cancel(), 60, 5);
    	appropriation.Cancel().click();
      
    }
    
    @And("^User enter the popup input messege in appropriation master$")
    public void user_enter_the_popup_input_messege_in_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T002-D1");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.popupremark(), 60, 5);
    	appropriation.popupremark().click();
    	appropriation.popupremark().sendKeys(testData.get("Popup Remark"));
    }

    @And("^user click the popup cancel in appropriation master$")
    public void user_click_the_popup_cancel_in_appropriation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.popupcancel(), 60, 5);
    	appropriation.popupcancel().click();
       
    }


    @And("^User get the cancel confirmation messege in appropriation master$")
    public void user_get_the_cancel_confirmation_messege_in_appropriation_master() throws Throwable {
    	
    	for(int i=0; i<50; i++) {
    		try {
    			appropriation.makerconfirmmsg1().getText();	
    		    System.out.println(appropriation.makerconfirmmsg1().getText());
    		    break;
			} catch (Exception e) {
				
			}
    	}
	    
	    help.waitForElementToVisibleWithFluentWait(driver, appropriation.successcancel(), 60, 5);
	    appropriation.successcancel().click();
    	
    	
    	
      
    }

    @And("^User verify the record removed from the system$")
    public void user_verify_the_record_removed_from_the_system() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T002-D1");
    	for (int i = 0; i < 50; i++) {
			try {
				appropriation.searchIcon().click();
				break;
			} catch (Exception e) {
				if(i==50) {
					e.getMessage();
				}

			}
		}
    	//appropriation.searchiconreferenceid().click();
    	appropriation.searchsentkeys().sendKeys(testData.get("Reference ID"));
    	Assert.assertNotEquals(testData.get("Reference ID"), true);
    	if (testData.get("Reference ID")!=testData.get("Reference ID")) {
    		
    		System.out.println("The record removed from the system");
			
		}
    	
      
    }
    @And("^User enter the values in due type for Appropriation master validation$")
    public void user_enter_the_values_in_due_type_for_appropriation_master_validation() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T003-D1");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.DueType(), 60, 5);
		appropriation.DueType().click(); 
    	
    	
    	String xpath2 = "//ion-label[contains(text(),'"+testData.get("Due Type")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath2)));
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}
        
    }
    @And("^User enter the values in due type for Appropriation master validation1$")
    public void user_enter_the_values_in_due_type_for_appropriation_master_validation1() throws Throwable {
    	testData = excelData.getTestdata("AT-AM-T004-D1");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.DueType(), 60, 5);
		appropriation.DueType().click(); 
    	
    	
    	String xpath2 = "//ion-label[contains(text(),'"+testData.get("Due Type")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath2)));
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}
    }


    @And("^User enter the values in sequence no for Appropriation master validation$")
    public void user_enter_the_values_in_sequence_no_for_appropriation_master_validation() throws Throwable {
    	testData = excelData.getTestdata("AT-AM-T003-D1");
    	//testData = excelData.getTestdata("AT-AM-003-D4");
    	//help.waitForElementToVisibleWithFluentWait(driver, appropriation.SequenceNo(), 60, 5);
		for(int i=0; i<20; i++) {
			try {
				appropriation.SequenceNo().click(); 
				appropriation.SequenceNo().sendKeys(testData.get("Sequence No"));
				break;
			} catch (Exception e) {
				
			}
		}
    	
        
    }

    @And("^User enter the values in parent sequence no for Appropriation master validation$")
    public void user_enter_the_values_in_parent_sequence_no_for_appropriation_master_validation() throws Throwable {
    	testData = excelData.getTestdata("AT-AM-T003-D1");
    	//testData = excelData.getTestdata("AT-AM-003-D4");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.ParentSequenceNo(), 60, 5);
		appropriation.ParentSequenceNo().click(); 
		appropriation.ParentSequenceNo().sendKeys(testData.get("Parent Sequence No"));
        
    }

    @And("^User enter the values in list of appropriation remarks for Appropriation master validation$")
    public void user_enter_the_values_in_list_of_appropriation_remarks_for_appropriation_master_validation() throws Throwable {
    	testData = excelData.getTestdata("AT-AM-T003-D1");
    	//testData = excelData.getTestdata("AT-AM-003-D4");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.AppropriationRemarks1(), 60, 5);
		appropriation.AppropriationRemarks1().click(); 
		appropriation.AppropriationRemarks1().sendKeys(testData.get("List Remarks"));
        
    }

    @And("^User verify the invalid field popup confirmation in appropriation$")
    public void user_verify_the_invalid_field_popup_confirmation_in_appropriation() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.RequiredField(), 60, 5);
    	appropriation.RequiredField().getText();
    	System.out.println(appropriation.RequiredField().getText());
    	
    	
    }
    @And("^User update the values in description for Appropriation master$")
    public void user_update_the_values_in_description_for_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T005-D1");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.Description(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Description");
		appropriation.Description().click();
		appropriation.Description().sendKeys(testData.get("Description"));
        
    }

    @And("^User update the values in Appropriation Type for Appropriation master$")
    public void user_update_the_values_in_appropriation_type_for_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T005-D1");
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.AppropriationType(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Appropriation Type");
		appropriation.AppropriationType().click(); 
    	
    	String xpath = "//ion-label[contains(text(),'"+testData.get("Appropriation Type")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

        
    }

    @And("^User update the values in Remarks for Appropriation master$")
    public void user_update_the_values_in_remarks_for_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T005-D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, appropriation.AppropriationRemarks(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Remarks");
		for(int i=0; i<20; i++) {
			try {
				appropriation.AppropriationRemarks().click(); 
				appropriation.AppropriationRemarks().sendKeys(testData.get("Remarks"));
				break;
			} catch (Exception e) {
				
			}
		}
        
    }

    @And("^User click the update save icon in Appropriation master$")
    public void user_click_the_update_save_icon_in_appropriation_master() throws Throwable {
        
    	Thread.sleep(1000);
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.UpdateSave(), 60, 5);
    	appropriation.UpdateSave().click(); 
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.successcancel(), 60, 5);
	    appropriation.successcancel().click();
    	
    }

    @And("^User click the inbox icon in Appropriation master$")
    public void user_click_the_inbox_icon_in_appropriation_master() throws Throwable {
    	
    	for (int i = 0; i < 20; i++) {
			try {
				appropriation.mailicon().click();
				break;
			} catch (Exception e) {

			}
		}
        
    }

    @And("^User search the appropriation master record$")
    public void user_search_the_appropriation_master_record() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T005-D1");
    	for (int i = 0; i < 20; i++) {
			try {
				appropriation.searchiconreferenceid().click();
				appropriation.searchsentkeys().sendKeys(testData.get("Inbox Search"));
				break;
				
			} catch (Exception e) {

			}
		}
        
    }

    @And("^User click the action edit icon and get the reference id in Appropriation master$")
    public void user_click_the_action_edit_icon_and_get_the_reference_id_in_appropriation_master() throws Throwable {
    	testData = excelData.getTestdata("AT-AM-T005-D1");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.referenceid(), 60, 5);
    	System.out.println(appropriation.referenceid().getText());
		String ref1 = appropriation.referenceid().getText();
		String ref2 = ref1.substring(0);
		excelData.updateTestData("AT-AM-T005-D1","Reference ID",ref2);
		json.addReferanceData(ref2);
		testData = excelData.getTestdata("AT-AM-T005-D1");
		
		for(int i=0; i<20; i++) {
			try {
				appropriation.inboxediticon().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	
    }

    @And("^User click the submit icon in appropriation master maker$")
    public void user_click_the_submit_icon_in_appropriation_master_maker() throws Throwable {
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, appropriation.submit(), 60, 2);
    	appropriation.submit().click();
        
    }

    @And("^User enter the popup remark and submit the appropriation master$")
    public void user_enter_the_popup_remark_and_submit_the_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T005-D1");
    	for (int i = 0; i < 20; i++) {
			try {
				appropriation.popupremark().click();
				break;
			} catch (Exception e) {

			}
		}
    	
    	for (int i = 0; i < 20; i++) {
			try {
				appropriation.popupremark().sendKeys(testData.get("Popup Remark"));
				break;
			} catch (Exception e) {

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.popupsubmit(), 60, 5);
    	appropriation.popupsubmit().click();

        
    }

    @And("^User get confirmation message and checker id in appropriation master$")
    public void user_get_confirmation_message_and_checker_id_in_appropriation_master() throws Throwable {
    	testData = excelData.getTestdata("AT-AM-T005-D1");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.ProductCheckerid(), 60, 5);
		String Success = appropriation.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		excelData.updateTestData("AT-AM-T005-D1","Checker id",popupID);
		json.addData(popupID);
		System.out.println(popupID);
		testData = excelData.getTestdata("AT-AM-T005-D1");
        
    }

    @And("^Get the test data for appropriation master test case6$")
    public void get_the_test_data_for_appropriation_master_test_case6() throws Throwable {
    	
    	AppropriationMasterTestData =testData = excelData.getTestdata("AT-AM-T006_D1");
        
    }

    @And("^Get the test data for appropriation master test case7$")
    public void get_the_test_data_for_appropriation_master_test_case7() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T007_D1");
        
    }

    @And("^Get the test data for appropriation master test case8$")
    public void get_the_test_data_for_appropriation_master_test_case8() throws Throwable {
    	
    	AppropriationMasterTestData =testData = excelData.getTestdata("AT-AM-T008-D1");
        
    }

    @And("^Get the test data for appropriation master test case9$")
    public void get_the_test_data_for_appropriation_master_test_case9() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T009_D1");
        
    }

    @And("^Get the test data for appropriation master test case10$")
    public void get_the_test_data_for_appropriation_master_test_case10() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T010_D1");
        
    }

    @And("^Get the test data for appropriation master test case11$")
    public void get_the_test_data_for_appropriation_master_test_case11() throws Throwable {
    	
    	AppropriationMasterTestData =testData = excelData.getTestdata("AT-AM-T011-D1");
        
    }
    
    // Checker Stage
    
    //Checker Approve
    @Given("^User login as uls checker in appropriation master$")
    public void user_login_as_uls_checker_in_appropriation_master() throws Throwable {
        
    	String kulsApplicationUrl = configFileReader.getApplicationUrlTransactions();
        driver.get(kulsApplicationUrl);
        //System.out.println(json.readdata());
        testData = excelData.getTestdata("AT-AM-T005-D1");
        System.out.println(testData.get("Checker id"));
        applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
        
    	
    }

    @Then("^User verify the Record got Approved in appropriation checker$")
    public void user_verify_the_record_got_approved_in_appropriation_checker() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.recordMsgChecker(), 60, 2);
   	   String Toast;
   	   Toast = appropriation.recordMsgChecker().getText();
   	   System.out.println(Toast);
   	   Assert.assertEquals(Toast, "Record APPROVED Successfully");
    	
    }

    @And("^User search the respective reference id and click on Action button in appropriation master$")
    public void user_search_the_respective_reference_id_and_click_on_action_button_in_appropriation_master() throws Throwable {
        
    	testData = excelData.getTestdata("AT-AM-T005-D1");
        for (int i = 0; i <40; i++) {
            
	    	try {
	           
	    		driver.findElement(By.xpath("//span[text()='"+testData.get("Reference ID")+"']/ancestor::tr/td[1]/button"))
	            .click();
	            break;
              
	    	}
         
	    	catch (Exception e) {
	    		
	    	}
	    		
	    }

    	
    }

    @And("^User click on Approve icon in appropriation master checker$")
    public void user_click_on_approve_icon_in_appropriation_master_checker() throws Throwable {
        
    Thread.sleep(2000);
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.CheckerApprove(), 60, 2);
		for(int i=0; i<40; i++) {
			try {
				seleniumactions.getClickAndActionsHelper().moveToElement(appropriation.CheckerApprove());
				appropriation.CheckerApprove().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	

    	
    }

    @And("^User click the popup remarks in appropriation master checker$")
    public void user_click_the_popup_remarks_in_appropriation_master_checker() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.popupremark(), 60, 2);
    	appropriation.popupremark().click();
    	appropriation.popupremark().sendKeys(testData.get("Popup Remark"));
    	
    }

    @And("^User click the popup approve in appropriation master checker$")
    public void user_click_the_popup_approve_in_appropriation_master_checker() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.popupapprove(), 60, 2);
    	appropriation.popupapprove().click();
    	
    }
    //Checker Reject
    
    @Then("^User verify the Record got Rejected in appropriation checker$")
    public void user_verify_the_record_got_rejected_in_appropriation_checker() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.recordMsgChecker(), 60, 2);
 	   String Toast;
 	   Toast = appropriation.recordMsgChecker().getText();
 	   System.out.println(Toast);
 	   Assert.assertEquals(Toast, "Record REJECTED Successfully");
    	
    }

    @And("^User click the reject icon in appropriation master checker$")
    public void user_click_the_reject_icon_in_appropriation_master_checker() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.CheckerReject(), 60, 2);
    	appropriation.CheckerReject().click();
        
    }
    @And("^User click the popup reject in appropriation master checker$")
    public void user_click_the_popup_reject_in_appropriation_master_checker() throws Throwable {
    	
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.popupreject(), 60, 2);
    	appropriation.popupreject().click();
    	
    }
    
    //Checker Return
    @Then("^User verify the Record got Returned in appropriation master checker$")
    public void user_verify_the_record_got_returned_in_appropriation_master_checker() throws Throwable {
        
       help.waitForElementToVisibleWithFluentWait(driver, appropriation.recordMsgChecker(), 60, 2);
 	   String Toast;
 	   Toast = appropriation.recordMsgChecker().getText();
 	   System.out.println(Toast);
 	   Assert.assertEquals( true, Toast.contains("Record RETURNED Successfully"));
    	
    }

    @And("^User click the return icon in appropriation master checker$")
    public void user_click_the_return_icon_in_appropriation_master_checker() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.CheckerReturn(), 60, 2);
    	appropriation.CheckerReturn().click();
    	
    }

    @And("^User click the final return icon in appropriation master checker$")
    public void user_click_the_final_return_icon_in_appropriation_master_checker() throws Throwable {
        
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.popupReturn(), 60, 2);
    	appropriation.popupReturn().click();
    	
    }
    
    //Active Deactive
    
    @And("^User verify the status button is active stage in appropriation master$")
    public void user_verify_the_status_button_is_active_stage_in_appropriation_master() throws Throwable {
        
    	//seleniumactions.getJavascriptHelper().scrollIntoView(appropriation.ApplicationDetails_SourcingOffice());;
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.StatusDeactivation(), 60, 5);
    	String Status = appropriation.StatusDeactivation().getAttribute("aria-checked");
    	
    	if (Status.equalsIgnoreCase("true")) {
    		
    		System.out.println("Active Status");
			
		}else {
			
			System.out.println("Deactive status");
		}
    	
    }

    @And("^User verify the status button is deactive stage in appropriation master$")
    public void user_verify_the_status_button_is_deactive_stage_in_appropriation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.StatusDeactivation(), 60, 5);
    	String Status = appropriation.StatusDeactivation().getAttribute("aria-checked");
    	
    	if (Status.equalsIgnoreCase("true")) {
    		
    		System.out.println("Active Status");
			
		}else {
			
			System.out.println("Deactive status");
		}
        
    }
    @Then("^User click the back button in appropriation master$")
    public void user_click_the_back_button_in_appropriation_master() throws Throwable {
        
    	for(int i=0; i<20; i++) {
    		try {
    			appropriation.Asset_BackArrow().click();
    			break;
			} catch (Exception e) {
			
			}
    	}
    	
    }
    // Negative updation
    
    @And("^User click the Appropriation master eye icon$")
    public void user_click_the_appropriation_master_eye_icon() throws Throwable {
        
    	for(int i=0; i<20; i++) {
    		try {
    			appropriation.appropriationEyeIcon().click();
    			break;
			} catch (Exception e) {
				
			}
    	}

    	
    }

    @And("^User update the description for Appropriation master valitation$")
    public void user_update_the_description_for_appropriation_master_valitation() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-T007-D1");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.Description(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Description");
		appropriation.Description().click();
		appropriation.Description().sendKeys(Keys.CONTROL,"A");
		appropriation.Description().sendKeys(Keys.BACK_SPACE);
		//appropriation.Description().clear();
		//appropriation.Description().sendKeys(testData.get("Description"));
        
    }

    @And("^User verify while modification, when user keep any mandatory field blank in appropriation master$")
    public void user_verify_while_modification_when_user_keep_any_mandatory_field_blank_in_appropriation_master() throws Throwable {
        
       help.waitForElementToVisibleWithFluentWait(driver, appropriation.RequiredField(), 60, 2);
   	   String Toast;
   	   Toast = appropriation.RequiredField().getText();
   	   System.out.println(Toast);
   	   Assert.assertEquals( true, Toast.contains("Required field"));
    	
    }

    @And("^User update the values in Appropriation Type for Appropriation master valitation$")
    public void user_update_the_values_in_appropriation_type_for_appropriation_master_valitation() throws Throwable {
        
    	testData = excelData.getTestdata("AT-AM-T007-D1");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.AppropriationType(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Appropriation Type");
		appropriation.AppropriationType().click(); 
    	
    	String xpath = "//ion-label[contains(text(),'"+testData.get("Appropriation Type")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

    	
    }

    @And("^User verify while modification system enters the invalid data in appropriation master$")
    public void user_verify_while_modification_system_enters_the_invalid_data_in_appropriation_master() throws Throwable {
    	 
    	   Thread.sleep(2000);
    	   help.waitForElementToVisibleWithFluentWait(driver, appropriation.RequiredField(), 60, 2);
    	   String Toast;
    	   Toast = appropriation.RequiredField().getText();
    	   System.out.println(Toast);
    	   Assert.assertEquals( true, Toast.contains("Required field"));
        
    }

    @And("^User get the success confirmation message in appropriation master$")
    public void user_get_the_success_confirmation_message_in_appropriation_master() throws Throwable {
    	
    	for(int i=0; i<50; i++) {
    		try {
    			appropriation.makerconfirmmsg1().getText();	
    		    System.out.println(appropriation.makerconfirmmsg1().getText());
    		    break;
			} catch (Exception e) {
				
			}
    	}
	    
	    help.waitForElementToVisibleWithFluentWait(driver, appropriation.successcancel(), 60, 5);
	    appropriation.successcancel().click();
    	
        
    }
    // PDF And  Excel
    @And("^user verify add button is displayed for appropriation master$")
    public void user_verify_add_button_is_displayed_for_appropriation_master() throws Throwable {
        
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appropriation.Addicon(),30, 2);
        Assert.assertTrue(appropriation.Addicon().isDisplayed(),"Add icon displayed not in list view screen");
    	
    }

    @And("^user verify search for record icon is displayed  for appropriation master$")
    public void user_verify_search_for_record_icon_is_displayed_for_appropriation_master() throws Throwable {
        
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appropriation.searchIcon(),30, 2);
        Assert.assertTrue(appropriation.searchIcon().isDisplayed(),"Search icon not displayed in list view screen");
    	
    }

    @And("^user verify export to pdf option is displayed  for appropriation master$")
    public void user_verify_export_to_pdf_option_is_displayed_for_appropriation_master() throws Throwable {
        
    	for (int i = 0; i < 50; i++) {
			try {
				appropriation.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    	
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appropriation.pdfOption(),30, 2);
        Assert.assertTrue(appropriation.pdfOption().isDisplayed(),"Export to pdf icon not  displayed in list view screen");

    	
    }

    @And("^user verify export to excel option is displayed for appropriation master$")
    public void user_verify_export_to_excel_option_is_displayed_for_appropriation_master() throws Throwable {
        
    	for (int i = 0; i < 50; i++) {
			try {
				appropriation.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appropriation.xlsOption(),30, 2);
        Assert.assertTrue(appropriation.xlsOption().isDisplayed(),"Export to xls icon displayed in list view screen");

    	
    }

    @And("^User verify the Values in List view should be non editable in appropriation master$")
    public void user_verify_the_values_in_list_view_should_be_non_editable_in_appropriation_master() throws Throwable {
        
    	String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified Description field is not editable only displayable");
		}
    	
    }

    @And("^User verify the functionality of Export to PDF button in appropriation master$")
    public void user_verify_the_functionality_of_export_to_pdf_button_in_appropriation_master() throws Throwable {
        
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, appropriation.exportIcon(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				appropriation.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, appropriation.pdfOption(), 60, 3);
		// Assert.assertEquals(project.pdfOption().isDisplayed(), true);
		appropriation.pdfOption().click();
		String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		for (int i = 0; i < 20; i++) {
			try {
				for (File fileName : totalfiles) {
					if (fileName.getName().equalsIgnoreCase("ProductMasterFile.pdf")) {
						System.out.println("Downloaded file present in system");
						break;
					} else {
						// System.out.println("Downloaded file present does not exist in system");
					}

				}
				break;

			} catch (Exception e) {

			}
		}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();

    	
    }

    @And("^User verify the functionality of Export to Excel button in appropriation master$")
    public void user_verify_the_functionality_of_export_to_excel_button_in_appropriation_master() throws Throwable {
        
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, appropriation.exportIcon(), 60, 2);
    	appropriation.exportIcon().click();

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, appropriation.xlsOption(), 60, 3);
		// Assert.assertEquals(project.xlsOption().isDisplayed(), true);
		appropriation.xlsOption().click();
    	
    }

    @And("^user verify the search results show matched data for appropriation master$")
    public void user_verify_the_search_results_show_matched_data_for_appropriation_master() throws Throwable {
        
    	for (int i = 0; i < 20; i++) {
			try {
				appropriation.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appropriation.assetAutoViewSearchText(), 30, 2);
		appropriation.assetAutoViewSearchText().sendKeys(testData.get("SearchMatchData"));

		String xpath = "//span[contains(text(),'"+testData.get("SearchMatchData")+"')]";
		for (int i = 0; i < 20; i++) {
            try {
            	Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
            	break;
			} catch (NoSuchElementException e) {
				
			}
			
		}

    	
    }

    @And("^user verify the search results shows no data for appropriation master$")
    public void user_verify_the_search_results_shows_no_data_for_appropriation_master() throws Throwable {
        
    	driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
		for (int i = 0; i < 20; i++) {
			try {
				appropriation.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				appropriation.assetAutoViewSearchText(), 30, 2);
		appropriation.assetAutoViewSearchText().sendKeys(testData.get("SearchUnmatchedData"));
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), testData.get("UnmatchedDataError"));
				break;
			} catch (NoSuchElementException e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();

    	
    }





}
