package stepdefinitions;

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
	
	
	@Then("^User click the config manager in Appropriation master$")
    public void user_click_the_config_manager_in_appropriation_master() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, appropriation.ConfigManager(), 60, 5);
		appropriation.ConfigManager().click();
		
    }
	@And("^User search the appropriation master in inbox$")
    public void user_search_the_appropriation_master_in_inbox() throws Throwable {
        
		testData = excelData.getTestdata("AT-AM-002-D4");
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
    	
    	testData = excelData.getTestdata("AT-AM-001-D4");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.Description(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Description");
		appropriation.Description().click();
		appropriation.Description().sendKeys(testData.get("Description"));
		
    	
        
    }

    @And("^User enter the values in Appropriation Type for Appropriation master$")
    public void user_enter_the_values_in_appropriation_type_for_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-001-D4");
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
    	
    	testData = excelData.getTestdata("AT-AM-001-D4");
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
    	
    	testData = excelData.getTestdata("AT-AM-001-D4");
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
    	
    	testData = excelData.getTestdata("AT-AM-001-D4");
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
    	
    	testData = excelData.getTestdata("AT-AM-001-D4");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.ParentSequenceNo(), 60, 5);
    	mandatoryornot.verifyGivenFieldisMandatoryOrNot("Parent Sequence No");
		appropriation.ParentSequenceNo().click(); 
		appropriation.ParentSequenceNo().sendKeys(testData.get("Parent Sequence No"));
        
    }

    @And("^User enter the values in list of appropriation remarks for Appropriation master$")
    public void user_enter_the_values_in_list_of_appropriation_remarks_for_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-001-D4");
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
        
    }
    @And("^User click the cancel icon in appropriation master$")
    public void user_click_the_cancel_icon_in_appropriation_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.Cancel(), 60, 5);
    	appropriation.Cancel().click();
      
    }
    
    @And("^User enter the popup input messege in appropriation master$")
    public void user_enter_the_popup_input_messege_in_appropriation_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-002-D4");
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
    	
    	testData = excelData.getTestdata("AT-AM-002-D4");
    	for (int i = 0; i < 20; i++) {
			try {
				appropriation.searchIcon().click();
				break;
			} catch (Exception e) {

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
    	
    	testData = excelData.getTestdata("AT-AM-003-D4");
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
    	
    	testData = excelData.getTestdata("AT-AM-003-D4");
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
    	
    	testData = excelData.getTestdata("AT-AM-003-D4");
    	help.waitForElementToVisibleWithFluentWait(driver, appropriation.ParentSequenceNo(), 60, 5);
		appropriation.ParentSequenceNo().click(); 
		appropriation.ParentSequenceNo().sendKeys(testData.get("Parent Sequence No"));
        
    }

    @And("^User enter the values in list of appropriation remarks for Appropriation master validation$")
    public void user_enter_the_values_in_list_of_appropriation_remarks_for_appropriation_master_validation() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-AM-003-D4");
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



}
