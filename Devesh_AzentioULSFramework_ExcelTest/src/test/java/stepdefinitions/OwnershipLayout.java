package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.OwnwershiplayoutObject;
import resources.BaseClass;
import testDataType.KULS_Login_TestDataType;

public class OwnershipLayout extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
			JsonConfig jsonconfig = new JsonConfig();
			KULS_Application_Login login= new KULS_Application_Login(driver);
        KULS_Login_TestDataType testdatatype = jsonconfig.getKULSLoginCredentialsByName("Maker");
        OwnwershiplayoutObject ownershipobject = new OwnwershiplayoutObject(driver);
//        OwnershipLayoutTestData ownershipdata = jsonconfig.getOwnwershipLayoutByName("Maker");
    	WaitHelper waithelper = new WaitHelper(driver);
    	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","OwnershipLayoutTestData","Data Set ID");
    	Map<String, String> testData;
    	String dataSetID;

    	
    	
    	
    @Then("^Click the next button in appdate entry stage$")
    public void click_the_next_button_in_appdate_entry_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.NextButton(), 60, 2);
		ownershipobject.NextButton().click();
		ownershipobject.NextButton().click();
		ownershipobject.NextButton().click();


    }
    
    @And("^Click the ownership layout tab$")
    public void click_the_ownership_layout_tab() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.NextButton(), 60, 2);
		ownershipobject.NextButton().click();
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.OwnershipDetailsTab(), 60, 2);
    	ownershipobject.OwnershipDetailsTab().click();
    	
    }
    
    @Then("^Enter app data entry stage code in the text bar$")
    public void enter_app_data_entry_stage_code_in_the_text_bar() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, ownershipobject.OwnershipDetails_SearchBar(), 60, 2);
    	ownershipobject.OwnershipDetails_SearchBar().click();
    	ownershipobject.OwnershipDetails_SearchBar().sendKeys("APPDATAENT");
    }
    
    @Then("^update the field owner in ownwership layout$")
    public void update_the_field_owner_in_ownwership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.OwnerDropdown(), 60, 2);
    	ownershipobject.OwnerDropdown().click();
    	String xpath ="//ion-label[text()=' "+testData.get("Owner")+" ']//following-sibling::ion-radio";
    	for (int i = 0; i <200; i++) {
    		try {
    			driver.findElement(By.xpath(xpath)).click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }
    @And("^update the name in ownwership layout$")
    public void update_the_name_in_ownwership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.Name(), 60, 2);
    	ownershipobject.Name().click();
    	for (int i = 0; i <30; i++) {
    		try {
    			ownershipobject.Name().clear();
    			ownershipobject.Name().sendKeys(testData.get("Name"));
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }
    @Then("^update the field id type in ownwership layout$")
    public void update_the_field_id_type_in_ownwership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.IDTypeDropdown(), 60, 2);
    	ownershipobject.IDTypeDropdown().click();
    	String xpath ="//ion-label[text()=' "+testData.get("ID Type")+" ']//following-sibling::ion-radio";
    	for (int i = 0; i <200; i++) {
    		try {
    			driver.findElement(By.xpath(xpath)).click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }

    @And("^update the field id number in ownership layout$")
    public void update_the_field_id_number_in_ownership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.IDNumber(), 60, 2);
    	ownershipobject.IDNumber().click();
    	for (int i = 0; i <30; i++) {
    		try {
    			ownershipobject.IDNumber().clear();
    			ownershipobject.IDNumber().sendKeys(testData.get("ID Number"));
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }
    @Then("^update the issue date in ownership layout$")
    public void update_the_issue_date_in_ownership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.IssueDate(), 60, 2);
    	ownershipobject.IssueDate().click();
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.clearbuttonIncalendar(), 60, 2);
   	ownershipobject.clearbuttonIncalendar().click();
	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.IssueDate(), 60, 2);
   	ownershipobject.IssueDate().click();
   	 String yearXpath ="//button[text()=' "+testData.get("Present Year")+" ']";
   	  for (int i = 0; i <30; i++) {
   			try {
   				 driver.findElement(By.xpath(yearXpath)).click();
   				break;
   			} catch (Exception e) {
   				
   			}
   		}
   	  String yearXpath2 ="//span[text()=' "+testData.get("IssueDate Year")+" ']";
   	  while (true) {
   		try {
   			driver.findElement(By.xpath(yearXpath2)).click();
   			break;
   		} catch (NoSuchElementException e) {
   			String xpath="//body/div[1]/div[2]/span[1]";
   			String year = driver.findElement(By.xpath(xpath)).getText();
   			int firstyear = Integer.parseInt(year);
   			if (firstyear>Integer.parseInt(testData.get("IssueDate Year"))) {
   				ownershipobject.previousbuttonIncalendar().click();
   			}
   			else {
   				ownershipobject.nextbuttonIncalendar().click();
   				
   			}
   		}
   	}
   	  String monthXpath ="//span[text()=' "+testData.get("IssueDate Month")+" ']";
   	  for (int i = 0; i <30; i++) {
   		try {
   			driver.findElement(By.xpath(monthXpath)).click();
   			break;
   		} catch (Exception e) {
   			
   		}
   	}
   	  String dateXpath ="//span[text()='"+testData.get("IssueDate")+"']";
   	  for (int i = 0; i <30; i++) {
   		try {
   			driver.findElement(By.xpath(dateXpath)).click();
   			break;
   		} catch (Exception e) {
   			
   		}
   	}
    }

    @And("^update the issue place in ownwership layout$")
    public void update_the_issue_place_in_ownwership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.IssuePlace(), 60, 2);
    	ownershipobject.IssuePlace().click();
    	for (int i = 0; i <30; i++) {
    		try {
    			ownershipobject.IssuePlace().clear();
    			ownershipobject.IssuePlace().sendKeys(testData.get("Issue Place"));
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }
    @Then("^update the field city in ownership layout$")
    public void update_the_field_city_in_ownership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.City(), 60, 2);
    	ownershipobject.City().click();
    	String xpath ="//ion-label[text()=' "+testData.get("City")+" ']//following-sibling::ion-radio";
    	for (int i = 0; i <200; i++) {
    		try {
    			driver.findElement(By.xpath(xpath)).click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }


    @And("^Update the field mobile in ownership layout$")
    public void update_the_field_mobile_in_ownership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.Mobile(), 60, 2);
    	ownershipobject.Mobile().click();
    	for (int i = 0; i <30; i++) {
    		try {
    			ownershipobject.Mobile().clear();
    			ownershipobject.Mobile().sendKeys(testData.get("Mobile"));
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }
    @Then("^update the field phone in ownership layout$")
    public void update_the_field_phone_in_ownership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.Phone(), 60, 2);
    	ownershipobject.Phone().click();
    	for (int i = 0; i <30; i++) {
    		try {
    			ownershipobject.Phone().clear();
    			ownershipobject.Phone().sendKeys(testData.get("Phone"));
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }

    @And("^update the field mobile 2 in ownership layout$")
    public void update_the_field_mobile_2_in_ownership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.Mobile2(), 60, 2);
    	ownershipobject.Mobile2().click();
    	for (int i = 0; i <30; i++) {
    		try {
    			ownershipobject.Mobile2().clear();
    			ownershipobject.Mobile2().sendKeys(testData.get("Mobile2"));
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }
    @Then("^update the fax in ownership layout$")
    public void update_the_fax_in_ownership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.Fax(), 60, 2);
    	ownershipobject.Fax().click();
    	for (int i = 0; i <30; i++) {
    		try {
    			ownershipobject.Fax().clear();
    			ownershipobject.Fax().sendKeys(testData.get("Fax"));
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }
   
    @And("^update the field email in ownwership layout$")
    public void update_the_field_email_in_ownwership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.Email(), 60, 2);
    	ownershipobject.Email().click();
    	for (int i = 0; i <30; i++) {
    		try {
    			ownershipobject.Email().clear();
    			ownershipobject.Email().sendKeys(testData.get("Email"));
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }
    @Then("^save the record in ownership layout$")
    public void save_the_record_in_ownership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.savebutton(), 60, 2);
    	ownershipobject.savebutton().click();
    }
    
    @Then("^verify the buttons available while modifying record$")
    public void verify_the_buttons_available_while_modifying_record() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.savebutton(), 60, 2);
    	boolean result = ownershipobject.savebutton().isDisplayed();
    	Assert.assertTrue(result);
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.ownershipDetails_BackButton(), 60, 2);
    	boolean result1 = ownershipobject.ownershipDetails_BackButton().isDisplayed();
    	Assert.assertTrue(result1);
    	
    }
    
    @Then("^select data set ID for Collateral Layout Ownership Layout testcase005$")
    public void select_data_set_id_for_collateral_layout_ownership_layout_testcase005() throws Throwable {
    	dataSetID = "AT_CLOL_005_D1";
        testData = excelData.getTestdata(dataSetID);
    }
    @Then("^select data set ID for Collateral Layout Ownership Layout testcase006$")
    public void select_data_set_id_for_collateral_layout_ownership_layout_testcase006() throws Throwable {
    	dataSetID = "AT_CLOL_006_D1";
    	testData = excelData.getTestdata(dataSetID);
    }

}
