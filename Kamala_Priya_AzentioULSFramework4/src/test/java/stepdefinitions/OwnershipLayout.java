package stepdefinitions;

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
import testDataType.OwnershipLayoutTestData;

public class OwnershipLayout extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
			JsonConfig jsonconfig = new JsonConfig();
			KULS_Application_Login login= new KULS_Application_Login(driver);
        KULS_Login_TestDataType testdatatype = jsonconfig.getKULSLoginCredentialsByName("Maker");
        OwnwershiplayoutObject ownershipobject = new OwnwershiplayoutObject(driver);
        OwnershipLayoutTestData ownershipdata = jsonconfig.getOwnwershipLayoutByName("Maker");
    	WaitHelper waithelper = new WaitHelper(driver);
	
	
	
	
	

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
    
    @Then("^update the field owner in ownwership layout$")
    public void update_the_field_owner_in_ownwership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.OwnerDropdown(), 60, 2);
    	ownershipobject.OwnerDropdown().click();
    	String xpath ="//ion-label[text()=' "+ownershipdata.Owner+" ']//following-sibling::ion-radio";
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
    			ownershipobject.Name().sendKeys(ownershipdata.Name);
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }
    @Then("^update the field id type in ownwership layout$")
    public void update_the_field_id_type_in_ownwership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.IDTypeDropdown(), 60, 2);
    	ownershipobject.IDTypeDropdown().click();
    	String xpath ="//ion-label[text()=' "+ownershipdata.IDType+" ']//following-sibling::ion-radio";
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
    			ownershipobject.IDNumber().sendKeys(ownershipdata.IDNumber);
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
   	 String yearXpath ="//button[text()=' "+ownershipdata.PresentYear+" ']";
   	  for (int i = 0; i <30; i++) {
   			try {
   				 driver.findElement(By.xpath(yearXpath)).click();
   				break;
   			} catch (Exception e) {
   				
   			}
   		}
   	  String yearXpath2 ="//span[text()=' "+ownershipdata.IssueDateYear+" ']";
   	  while (true) {
   		try {
   			driver.findElement(By.xpath(yearXpath2)).click();
   			break;
   		} catch (NoSuchElementException e) {
   			String xpath="//body/div[1]/div[2]/span[1]";
   			String year = driver.findElement(By.xpath(xpath)).getText();
   			int firstyear = Integer.parseInt(year);
   			if (firstyear>Integer.parseInt(ownershipdata.IssueDateYear)) {
   				ownershipobject.previousbuttonIncalendar().click();
   			}
   			else {
   				ownershipobject.nextbuttonIncalendar().click();
   				
   			}
   		}
   	}
   	  String monthXpath ="//span[text()=' "+ownershipdata.IssueDateMonth+" ']";
   	  for (int i = 0; i <30; i++) {
   		try {
   			driver.findElement(By.xpath(monthXpath)).click();
   			break;
   		} catch (Exception e) {
   			
   		}
   	}
   	  String dateXpath ="//span[text()='"+ownershipdata.IssueDate+"']";
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
    			ownershipobject.IssuePlace().sendKeys(ownershipdata.IssuePlace);
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    }
    @Then("^update the field city in ownership layout$")
    public void update_the_field_city_in_ownership_layout() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,ownershipobject.City(), 60, 2);
    	ownershipobject.City().click();
    	String xpath ="//ion-label[text()=' "+ownershipdata.City+" ']//following-sibling::ion-radio";
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
    			ownershipobject.Mobile().sendKeys(ownershipdata.Mobile);
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
    			ownershipobject.Phone().sendKeys(ownershipdata.Phone);
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
    			ownershipobject.Mobile2().sendKeys(ownershipdata.Mobile2);
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
    			ownershipobject.Fax().sendKeys(ownershipdata.Fax);
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
    			ownershipobject.Email().sendKeys(ownershipdata.Email);
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


}
