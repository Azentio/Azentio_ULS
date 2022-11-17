package stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.KULS_LoginObj;
import pageobjects.Trans_CustomerEmploymentObject;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.CustomerEmploymentTestData;
import testDataType.KULS_Login_TestDataType;

public class TransactionCustomerEmployment extends BaseClass {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configfilereader = new ConfigFileReader();
			JsonConfig jsonconfig = new JsonConfig();
			KULS_Application_Login login= new KULS_Application_Login(driver);
        KULS_Login_TestDataType testdatatype = jsonconfig.getKULSLoginCredentialsByName("Maker");
        Trans_CustomerEmploymentObject employementobj = new Trans_CustomerEmploymentObject(driver);
        CustomerEmploymentTestData employmentdata = jsonconfig.getCustomerEmploymentListByName("Maker");
    	WaitHelper waithelper = new WaitHelper(driver);
JavascriptHelper helper= new JavascriptHelper(driver);
Selenium_Actions action = new Selenium_Actions(driver);
List<String> xlsList = new ArrayList<>();
ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
SoftAssert softAssert = new SoftAssert();
String referenceID;
JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();


        
			@Then("^Click the inbox in customer employment$")
	    public void click_the_inbox_in_customer_employment() throws Throwable {
				waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxEmplyObj_InboxIcon(), 60, 2);
				employementobj.Trans_CxEmplyObj_InboxIcon().click();
	    }

	    @And("^click the search button in customer employement$")
	    public void click_the_search_button_in_customer_employement() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxEmplyObj_SearchButton(), 60, 2);
			employementobj.Trans_CxEmplyObj_SearchButton().click();
	    }

	    @Then("^Enter app data entry in the text bar$")
	    public void enter_app_data_entry_in_the_text_bar() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxEmplyObj_SearchBar(), 60, 2);
			employementobj.Trans_CxEmplyObj_SearchBar().click();
			employementobj.Trans_CxEmplyObj_SearchBar().sendKeys("APPDATAENT");
	    }
	    
	    @And("^click the first action icon in customer employement$")
	    public void click_the_first_action_icon_in_customer_employement() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxEmplyObj_ActionIcon(), 60, 2);
			employementobj.Trans_CxEmplyObj_ActionIcon().click();
	    }

	    @Then("^Click the customer finanace tab in customer employment$")
	    public void click_the_customer_finanace_tab_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxEmplyObj_CxFinancialTab(), 60, 2);
			employementobj.Trans_CxEmplyObj_CxFinancialTab().click();
	    }
	    
	    @And("^click the first edit icon in customer finance tab$")
	    public void click_the_first_edit_icon_in_customer_finance_tab() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxEmplyObj_CxFinancialEditIcon1(), 60, 2);
			employementobj.Trans_CxEmplyObj_CxFinancialEditIcon1().click();
	    }

	    @Then("^click the add button in customer employment list$")
	    public void click_the_add_button_in_customer_employment_list() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxEmplyObj_CxFinancialAddButton(), 60, 2);
			employementobj.Trans_CxEmplyObj_CxFinancialAddButton().click();
	    }
	    
	    @And("^Fill the nature of employment as salaried in customer employment$")
	    public void fill_the_nature_of_employment_as_salaried_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_NatureOfEmployment(), 60, 2);
	    	employementobj.Trans_CxFinancial_NatureOfEmployment().isDisplayed();
	    	employementobj.Trans_CxFinancial_NatureOfEmployment().click();
	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.NatureOfEmployment
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(employementobj.Trans_CxFinancial_NatureOfEmployment().getAttribute("aria-haspopup"),"listbox");
              Thread.sleep(1000);
	    	}

	    @Then("^choose the employment period and validate in customer employment$")
	    public void choose_the_employment_period_and_validate_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_EmploymentPeriod(), 60, 2);
	    	employementobj.Trans_CxFinancial_EmploymentPeriod().isDisplayed();
			employementobj.Trans_CxFinancial_EmploymentPeriod().click();
			for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.EmploymentPeriod
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
			Assert.assertEquals(employementobj.Trans_CxFinancial_EmploymentPeriod().getAttribute("aria-haspopup"),"listbox");

	    	}
	    
	    
	    @And("^Fill the employer name and validate in customer employment$")
	    public void fill_the_employer_name_and_validate_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_EmployerName(), 60, 2);
	    	employementobj.Trans_CxFinancial_EmployerName().isDisplayed();
			employementobj.Trans_CxFinancial_EmployerName().click();
			for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.EmployerName
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
			Assert.assertEquals(employementobj.Trans_CxFinancial_EmployerName().getAttribute("aria-haspopup"),"listbox");

	    	}

	    


//	    @Then("^Fill and verify the field Employer Name if Others in customer employment$")
//	    public void fill_and_verify_the_field_employer_name_if_others_in_customer_employment() throws Throwable {
//	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxEmplyObj_InboxIcon(), 60, 2);
//			
//			
//			Assert.assertEquals(employementobj.Trans_CxFinancial_EmployerName().getAttribute("aria-haspopup"),"listbox");
//
//	    }
	    
	    @And("^Fill and verify the field employer id in customer employment$")
	    public void fill_and_verify_the_field_employer_id_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_EmployeeID(), 60, 2);
			employementobj.Trans_CxFinancial_EmployeeID().isDisplayed();
			employementobj.Trans_CxFinancial_EmployeeID().click();
			employementobj.Trans_CxFinancial_EmployeeID().sendKeys(employmentdata.EmployeeID);
			Assert.assertEquals(employementobj.Trans_CxFinancial_EmployeeID().getAttribute("type"),"text");
	    }

	    @Then("^select and verify the field Date of Joining in customer employment$")
	    public void select_and_verify_the_field_date_of_joining_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_DateOfJoining(), 60, 2);
	    	employementobj.Trans_CxFinancial_DateOfJoining().isDisplayed();
			employementobj.Trans_CxFinancial_DateOfJoining().click();
			String yearXpath ="//button[text()=' "+employmentdata.DOJYear+" ']";
			for (int i = 0; i < 50; i++) {
			try	
			{
			driver.findElement(By.xpath(yearXpath)).click();
			break;
			}
			catch(Exception e) {
				}
			
			}
			  String yearXpath2 ="//span[text()=' "+employmentdata.DOJYear1+" ']";
		      while (true) {
		        try {
					driver.findElement(By.xpath(yearXpath2)).click();
		            break;
		        } catch (NoSuchElementException e) {
		        	String xpath="//body/div[1]/div[2]/span[1]";
		            String year = driver.findElement(By.xpath(xpath)).getText();
		            int firstyear = Integer.parseInt(year);
		            if (firstyear>1999) {
		            	employementobj.previousbuttonIncalendar().click();
		            }
		            else {
		            	employementobj.nextbuttonIncalendar().click();
		                
		            }
		        }
		    }
		      String monthXpath ="//span[text()=' "+employmentdata.DOJMonth+" ']";
		      for (int i = 0; i < 50; i++) {
					try	
					{
					driver.findElement(By.xpath(monthXpath)).click();
					break;
					}
					catch(Exception e) {
						}
					}  
		      String dateXpath ="//span[text()='"+employmentdata.DOJDate+"']";
		      for (int i = 0; i < 50; i++) {
					try	
					{
					driver.findElement(By.xpath(dateXpath)).click();
					break;
					}
					catch(Exception e) {
						}
					}
	            Thread.sleep(1000);

	    }
	    
	    @And("^select and  verify the field Employment End date in customer emplyment$")
	    public void select_and_verify_the_field_employment_end_date_in_customer_emplyment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_EmploymentEndDate(), 60, 2);
	    	employementobj.Trans_CxFinancial_EmploymentEndDate().isDisplayed();
			employementobj.Trans_CxFinancial_EmploymentEndDate().click();
			String yearXpath ="//button[text()=' "+employmentdata.EEDYear+" ']";
			for (int i = 0; i < 50; i++) {
			try	
			{
			driver.findElement(By.xpath(yearXpath)).click();
			break;
			}
			catch(Exception e) {
				}
			
			}
			  String yearXpath2 ="//span[text()=' "+employmentdata.EEDYear1+" ']";
		      while (true) {
		        try {
					driver.findElement(By.xpath(yearXpath2)).click();
		            break;
		        } catch (NoSuchElementException e) {
		        	String xpath="//body/div[1]/div[2]/span[1]";
		            String year = driver.findElement(By.xpath(xpath)).getText();
		            int firstyear = Integer.parseInt(year);
		            if (firstyear>1999) {
		            	employementobj.previousbuttonIncalendar().click();
		            }
		            else {
		            	employementobj.nextbuttonIncalendar().click();
		                
		            }
		        }
		    }
		      String monthXpath ="//span[text()=' "+employmentdata.EEDMonth+" ']";
		      for (int i = 0; i < 50; i++) {
					try	
					{
					driver.findElement(By.xpath(monthXpath)).click();
					break;
					}
					catch(Exception e) {
						}
					}  
		      String dateXpath ="//span[text()='"+employmentdata.EEDDate+"']";
		      for (int i = 0; i < 50; i++) {
					try	
					{
					driver.findElement(By.xpath(dateXpath)).click();
					break;
					}
					catch(Exception e) {
						}
					}
	    }

	    @Then("^select and  verify the field Department in customer employment$")
	    public void select_and_verify_the_field_department_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_Department(), 60, 2);
	    	employementobj.Trans_CxFinancial_Department().isDisplayed();
			employementobj.Trans_CxFinancial_Department().click();
			for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.Department
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
			Assert.assertEquals(employementobj.Trans_CxFinancial_Department().getAttribute("aria-haspopup"),"listbox");
	    }

	    @And("^select and verify the field Designation in customer employment$")
	    public void select_and_verify_the_field_designation_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_Designation(), 60, 2);
	    	employementobj.Trans_CxFinancial_Designation().isDisplayed();
			employementobj.Trans_CxFinancial_Designation().click();
			for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.Designation
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
			Assert.assertEquals(employementobj.Trans_CxFinancial_Designation().getAttribute("aria-haspopup"),"listbox");

	    }
	    
	    @Then("^select and verify the field employment type in customer employment$")
	    public void select_and_veryfy_the_field_employment_type_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_EmploymentType(), 60, 2);
	    	employementobj.Trans_CxFinancial_EmploymentType().isDisplayed();
			employementobj.Trans_CxFinancial_EmploymentType().click();
			for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.EmploymentType
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
			Assert.assertEquals(employementobj.Trans_CxFinancial_EmploymentType().getAttribute("aria-haspopup"),"listbox");
Thread.sleep(1000);
	    }
	    
	    @And("^Fill and verify the field Direct Manager Contact Number Extension in customer employment$")
	    public void fill_and_verify_the_field_direct_manager_contact_number_extension_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_DirectManagerNumExt(), 60, 2);
	    	employementobj.Trans_CxFinancial_DirectManagerNumExt().isDisplayed();
			employementobj.Trans_CxFinancial_DirectManagerNumExt().click();
			employementobj.Trans_CxFinancial_DirectManagerNumExt().sendKeys(employmentdata.DirectManagerContactNumberExtension);
			Assert.assertEquals(employementobj.Trans_CxFinancial_DirectManagerNumExt().getAttribute("type"),"number");

	    }

	    @Then("^Fill and verify the field Total Experince Years in customer employment$")
	    public void fill_and_verify_the_field_total_experince_years_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_TotalExperienceYears(), 60, 2);
	    	employementobj.Trans_CxFinancial_TotalExperienceYears().isDisplayed();
			employementobj.Trans_CxFinancial_TotalExperienceYears().click();
			employementobj.Trans_CxFinancial_TotalExperienceYears().sendKeys(employmentdata.TotalExperience_Years_);
			Assert.assertEquals(employementobj.Trans_CxFinancial_TotalExperienceYears().getAttribute("type"),"number");

	    }
	    
	    @And("^select and verify the field Retirement Age in customer employment$")
	    public void select_and_verify_the_field_retirement_age_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_RetirementAge(), 60, 2);
	    	employementobj.Trans_CxFinancial_RetirementAge().isDisplayed();
			employementobj.Trans_CxFinancial_RetirementAge().click();
			employementobj.Trans_CxFinancial_RetirementAge().sendKeys(employmentdata.RetirementAge_Years_);
			Assert.assertEquals(employementobj.Trans_CxFinancial_RetirementAge().getAttribute("type"),"number");

	    }

	    @Then("^Fill and verify the Share Holder Percentage in customer employment$")
	    public void fill_and_verify_the_share_holder_percentage_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_ShareHolderPercentage(), 60, 2);
	    	employementobj.Trans_CxFinancial_ShareHolderPercentage().isDisplayed();
			employementobj.Trans_CxFinancial_ShareHolderPercentage().click();
			employementobj.Trans_CxFinancial_ShareHolderPercentage().sendKeys(employmentdata.ShareHolderPercentage);
			Assert.assertEquals(employementobj.Trans_CxFinancial_ShareHolderPercentage().getAttribute("type"),"number");

	    }
	    @Then("^fill and verify the Employer Phone Number in customer employment$")
	    public void fill_and_verify_the_employer_phone_number_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_RetirementAge(), 60, 2);
			employementobj.Trans_CxFinancial_EmployerPhoneNumber().isDisplayed();
			employementobj.Trans_CxFinancial_EmployerPhoneNumber().click();
			employementobj.Trans_CxFinancial_EmployerPhoneNumber().sendKeys(employmentdata.EmployerPhoneNumber);
			Assert.assertEquals(employementobj.Trans_CxFinancial_EmployerPhoneNumber().getAttribute("type"),"text");

	    }

	    @Then("^fill and verify the field Employer City Code in customer employment$")
	    public void fill_and_verify_the_field_employer_city_code_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_EmpCityCode(), 60, 2);
			employementobj.Trans_CxFinancial_EmpCityCode().isDisplayed();
			employementobj.Trans_CxFinancial_EmpCityCode().click();
			employementobj.Trans_CxFinancial_EmpCityCode().sendKeys(employmentdata.EmployerCityCode);
			Assert.assertEquals(employementobj.Trans_CxFinancial_EmpCityCode().getAttribute("type"),"text");

	    }
	    @Then("^fill and verify the field Employer Phone Extension in customer employment$")
	    public void fill_and_verify_the_field_employer_phone_extension_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_EmpPhoneExt(), 60, 2);
			employementobj.Trans_CxFinancial_EmpPhoneExt().isDisplayed();
			employementobj.Trans_CxFinancial_EmpPhoneExt().click();
			employementobj.Trans_CxFinancial_EmpPhoneExt().sendKeys(employmentdata.EmployerPhoneExtension);
			Assert.assertEquals(employementobj.Trans_CxFinancial_EmpPhoneExt().getAttribute("type"),"text");

	    }
	    @And("^Verify the save and back button in customer employment$")
	    public void verify_the_save_and_back_button_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.CustomerEmployment_SaveButton(), 60, 2);
			employementobj.CustomerEmployment_SaveButton().isDisplayed();
			waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.CustomerEmployment_BackButtonButton(), 60, 2);
			employementobj.CustomerEmployment_BackButtonButton().isDisplayed();
	    }
	    @And("^Fill the nature of employment as self employed in customer employment$")
	    public void fill_the_nature_of_employment_as_self_employed_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_NatureOfEmployment(), 60, 2);
			employementobj.Trans_CxFinancial_NatureOfEmployment().isDisplayed();
			employementobj.Trans_CxFinancial_NatureOfEmployment().click();
	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.NatureOfEmployment2
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(employementobj.Trans_CxFinancial_NatureOfEmployment().getAttribute("aria-haspopup"),"listbox");

	    }
	    @Then("^Select and verify the company type field in customer employment$")
	    public void select_and_verify_the_company_type_field_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_CompanyType(), 60, 2);
			employementobj.Trans_CxFinancial_CompanyType().isDisplayed();
			employementobj.Trans_CxFinancial_CompanyType().click();
	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.CompanyType
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(employementobj.Trans_CxFinancial_CompanyType().getAttribute("aria-haspopup"),"listbox");

	    }
	    


	    @And("^select and verify the field proffesion in customer employment$")
	    public void select_and_verify_the_field_proffesion_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_Profession(), 60, 2);
			employementobj.Trans_CxFinancial_Profession().isDisplayed();
			employementobj.Trans_CxFinancial_Profession().click();
	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.Profession
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(employementobj.Trans_CxFinancial_Profession().getAttribute("aria-haspopup"),"listbox");

	    }
	    @And("^select and verify the field proffesion type in customer employment$")
	    public void select_and_verify_the_field_proffesion_type_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_ProfessionType(), 60, 2);
			employementobj.Trans_CxFinancial_ProfessionType().isDisplayed();
			employementobj.Trans_CxFinancial_ProfessionType().click();
	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.ProfessionType
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(employementobj.Trans_CxFinancial_ProfessionType().getAttribute("aria-haspopup"),"listbox");
	    }

	    @Then("^select and verify the field satutory Authority in customer employment$")
	    public void select_and_verify_the_field_satutory_authority_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_StatutotyAuthority(), 60, 2);
			employementobj.Trans_CxFinancial_StatutotyAuthority().isDisplayed();
			employementobj.Trans_CxFinancial_StatutotyAuthority().click();
	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.StatutoryAuthority
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(employementobj.Trans_CxFinancial_StatutotyAuthority().getAttribute("aria-haspopup"),"listbox");
	    }

	    @Then("^Fill the employment end date in customer employment$")
	    public void fill_the_employment_end_date_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_EmploymentEndDate(), 60, 2);
	    	employementobj.Trans_CxFinancial_EmploymentEndDate().isDisplayed();
			employementobj.Trans_CxFinancial_EmploymentEndDate().click();
			String yearXpath ="//button[text()=' "+employmentdata.EEDYear+" ']";
			for (int i = 0; i < 50; i++) {
			try	
			{
			driver.findElement(By.xpath(yearXpath)).click();
			break;
			}
			catch(Exception e) {
				}
			
			}
			  String yearXpath2 ="//span[text()=' "+employmentdata.EEDYear1+" ']";
		      while (true) {
		        try {
					driver.findElement(By.xpath(yearXpath2)).click();
		            break;
		        } catch (NoSuchElementException e) {
		        	String xpath="//body/div[1]/div[2]/span[1]";
		            String year = driver.findElement(By.xpath(xpath)).getText();
		            int firstyear = Integer.parseInt(year);
		            if (firstyear>1999) {
		            	employementobj.previousbuttonIncalendar().click();
		            }
		            else {
		            	employementobj.nextbuttonIncalendar().click();
		                
		            }
		        }
		    }
		      String monthXpath ="//span[text()=' "+employmentdata.EEDMonth+" ']";
		      for (int i = 0; i < 50; i++) {
					try	
					{
					driver.findElement(By.xpath(monthXpath)).click();
					break;
					}
					catch(Exception e) {
						}
					}  
		      String dateXpath ="//span[text()='"+employmentdata.EEDDate+"']";
		      for (int i = 0; i < 50; i++) {
					try	
					{
					driver.findElement(By.xpath(dateXpath)).click();
					break;
					}
					catch(Exception e) {
						}
					}
	    }

	    @Then("^select and verify the field employer phone extention in customer employment$")
	    public void select_and_verify_the_field_employer_phone_extention_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_EmpPhoneExt(), 60, 2);
			employementobj.Trans_CxFinancial_EmpPhoneExt().isDisplayed();
			employementobj.Trans_CxFinancial_EmpPhoneExt().click();
			employementobj.Trans_CxFinancial_EmpPhoneExt().sendKeys(employmentdata.EmployerPhoneExtension);
			Assert.assertEquals(employementobj.Trans_CxFinancial_EmpPhoneExt().getAttribute("type"),"text");	
	    }

	    @Then("^select and verify the field no of partners in customer employment$")
	    public void select_and_verify_the_field_no_of_partners_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_NoOFPartners(), 60, 2);
			employementobj.Trans_CxFinancial_NoOFPartners().isDisplayed();
			employementobj.Trans_CxFinancial_NoOFPartners().click();
			employementobj.Trans_CxFinancial_NoOFPartners().sendKeys(employmentdata.EmployerPhoneNumber);
			Assert.assertEquals(employementobj.Trans_CxFinancial_NoOFPartners().getAttribute("type"),"number");
	    }

	    @Then("^select and verify the field nature of business in customer employment$")
	    public void select_and_verify_the_field_nature_of_business_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_NatureOfBusiness(), 60, 2);
			employementobj.Trans_CxFinancial_NatureOfBusiness().isDisplayed();
			employementobj.Trans_CxFinancial_NatureOfBusiness().click();
	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.NatureOFBusiness
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(employementobj.Trans_CxFinancial_NatureOfBusiness().getAttribute("aria-haspopup"),"listbox");
	    }
	    

	    @Then("^select and verify the field register business name in customer employment$")
	    public void select_and_verify_the_field_register_business_name_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_RegisteredBusinessName(), 60, 2);
			employementobj.Trans_CxFinancial_RegisteredBusinessName().isDisplayed();
			employementobj.Trans_CxFinancial_RegisteredBusinessName().click();
			employementobj.Trans_CxFinancial_RegisteredBusinessName().sendKeys(employmentdata.RegisteredBusinessName);
			Assert.assertEquals(employementobj.Trans_CxFinancial_RegisteredBusinessName().getAttribute("type"),"text");
  }

	    @Then("^select and verify the field register business number in customer employment$")
	    public void select_and_verify_the_field_register_business_number_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_RegisteredBusinessNumber(), 60, 2);
			employementobj.Trans_CxFinancial_RegisteredBusinessNumber().isDisplayed();
			employementobj.Trans_CxFinancial_RegisteredBusinessNumber().click();
			employementobj.Trans_CxFinancial_RegisteredBusinessNumber().sendKeys(employmentdata.RegisteredBusinessNumber);
			Assert.assertEquals(employementobj.Trans_CxFinancial_RegisteredBusinessNumber().getAttribute("type"),"text");
	    }

	    @Then("^select and verify the field Business registration date in customer employment$")
	    public void select_and_verify_the_field_business_registration_date_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_BusinessRegistrationdate(), 60, 2);
	    	employementobj.Trans_CxFinancial_BusinessRegistrationdate().isDisplayed();
			employementobj.Trans_CxFinancial_BusinessRegistrationdate().click();
			String yearXpath ="//button[text()=' "+employmentdata.BRDYear+" ']";
			for (int i = 0; i < 50; i++) {
			try	
			{
			driver.findElement(By.xpath(yearXpath)).click();
			break;
			}
			catch(Exception e) {
				}
			
			}
			  String yearXpath2 ="//span[text()=' "+employmentdata.EEDYear1+" ']";
		      while (true) {
		        try {
					driver.findElement(By.xpath(yearXpath2)).click();
		            break;
		        } catch (NoSuchElementException e) {
		        	String xpath="//body/div[1]/div[2]/span[1]";
		            String year = driver.findElement(By.xpath(xpath)).getText();
		            int firstyear = Integer.parseInt(year);
		            if (firstyear>1999) {
		            	employementobj.previousbuttonIncalendar().click();
		            }
		            else {
		            	employementobj.nextbuttonIncalendar().click();
		                
		            }
		        }
		    }
		      String monthXpath ="//span[text()=' "+employmentdata.BRDMonth+" ']";
		      for (int i = 0; i < 50; i++) {
					try	
					{
					driver.findElement(By.xpath(monthXpath)).click();
					break;
					}
					catch(Exception e) {
						}
					}  
		      String dateXpath ="//span[text()='"+employmentdata.BRDDate+"']";
		      for (int i = 0; i < 50; i++) {
					try	
					{
					driver.findElement(By.xpath(dateXpath)).click();
					break;
					}
					catch(Exception e) {
						}
					}
	    }

	    @Then("^select and verify the field office premises date in customer employment$")
	    public void select_and_verify_the_field_office_premises_date_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_OfficePremisesType(), 60, 2);
			employementobj.Trans_CxFinancial_OfficePremisesType().isDisplayed();
			employementobj.Trans_CxFinancial_OfficePremisesType().click();
	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.OfficePremisesType
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(employementobj.Trans_CxFinancial_OfficePremisesType().getAttribute("aria-haspopup"),"listbox");
	    }

	    @Then("^select and verify the field share holder percentage in customer employment$")
	    public void select_and_verify_the_field_share_holder_percentage_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_ShareHolderPercentage(), 60, 2);
			employementobj.Trans_CxFinancial_ShareHolderPercentage().isDisplayed();
			employementobj.Trans_CxFinancial_ShareHolderPercentage().click();
			employementobj.Trans_CxFinancial_ShareHolderPercentage().sendKeys(employmentdata.ShareHolderPercentage);
			Assert.assertEquals(employementobj.Trans_CxFinancial_ShareHolderPercentage().getAttribute("type"),"number");
	    }

	    @Then("^select and verify the no of employes in customer employment$")
	    public void select_and_verify_the_no_of_employes_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_NoOfEmployees(), 60, 2);
			employementobj.Trans_CxFinancial_NoOfEmployees().isDisplayed();
			employementobj.Trans_CxFinancial_NoOfEmployees().click();
			employementobj.Trans_CxFinancial_NoOfEmployees().sendKeys(employmentdata.NoOfEmployees);
			Assert.assertEquals(employementobj.Trans_CxFinancial_NoOfEmployees().getAttribute("type"),"number");	
	    }

	    @Then("^fill the remarks in customer employment$")
	    public void fill_the_remarks_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_Remarks(), 60, 2);
			employementobj.Trans_CxFinancial_Remarks().isDisplayed();
			employementobj.Trans_CxFinancial_Remarks().click();
			employementobj.Trans_CxFinancial_Remarks().sendKeys(employmentdata.Remarks);
	    }

	    @Then("^save the record in customer employment$")
	    public void save_the_record_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.CustomerEmployment_SaveButton(), 60, 2);
	    	//helper.scrollIntoView(employementobj.Trans_CxFinancial_EmploymentPeriod());
			employementobj.CustomerEmployment_SaveButton().isDisplayed();
			employementobj.CustomerEmployment_SaveButton().click();	
	
	    }
	    @And("^Fill and verify the field Direct Manager telephone in customer employment$")
	    public void fill_and_verify_the_field_direct_manager_telephone_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_directManagerTelephone(), 60, 2);
			employementobj.Trans_CxFinancial_directManagerTelephone().isDisplayed();
			employementobj.Trans_CxFinancial_directManagerTelephone().click();
			employementobj.Trans_CxFinancial_directManagerTelephone().sendKeys(employmentdata.DirectManagerTelephone);
			Assert.assertEquals(employementobj.Trans_CxFinancial_directManagerTelephone().getAttribute("type"),"text");	
	    }

	    @And("^Fill and verify the field Direct Manager in customer employment$")
	    public void fill_and_verify_the_field_direct_manager_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_DirectManager(), 60, 2);
			employementobj.Trans_CxFinancial_DirectManager().isDisplayed();
			employementobj.Trans_CxFinancial_DirectManager().click();
			employementobj.Trans_CxFinancial_DirectManager().sendKeys(employmentdata.DirectManager);
	    }
	  

	    @Then("^Fill the state in customer employment$")
	    public void fill_the_state_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_cxFinancial_State(), 60, 2);
			employementobj.Trans_cxFinancial_State().isDisplayed();
			employementobj.Trans_cxFinancial_State().click();
	    	for (int i = 0; i < 60; i++) {
				try {
			
	    	driver.findElement(By.xpath("//ion-label[contains(text(),'" + employmentdata.State
					+ "')]/following-sibling::ion-radio")).click();
	    	break;
	    }
				catch(Exception e) {
				}
				}
	    	
			Assert.assertEquals(employementobj.Trans_cxFinancial_State().getAttribute("aria-haspopup"),"listbox");
	    }
	    @Then("^Fill the pincode in customer employment$")
	    public void fill_the_pincode_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_Pincode(), 60, 2);
			employementobj.Trans_CxFinancial_Pincode().isDisplayed();
			employementobj.Trans_CxFinancial_Pincode().click();
			employementobj.Trans_CxFinancial_Pincode().sendKeys(employmentdata.Pincode);	    }

	    @Then("^Fill the experience at current employment in customer employment$")
	    public void fill_the_experience_at_current_employment_in_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_ExpCurrentEmp(), 60, 2);
			employementobj.Trans_CxFinancial_ExpCurrentEmp().isDisplayed();
			employementobj.Trans_CxFinancial_ExpCurrentEmp().click();
			employementobj.Trans_CxFinancial_ExpCurrentEmp().sendKeys(employmentdata.ExperienceAtCurrentEmployment);	  
			}
	    @Then("^verify field Employer name in listview of the customer employment$")
	    public void verify_field_employer_name_in_listview_of_the_customer_employment() throws Throwable {

	    	String xpath = "(//table[1]/tbody[1]/tr[1]/td[3])[3]";
			action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath)), 60,
					2);
			WebElement EmployName = driver.findElement(By.xpath(xpath));
			System.out.println("AccountType :" + EmployName);
	    }

	    @Then("^verify field nature of employment in listview of the customer employment$")
	    public void verify_field_nature_of_employment_in_listview_of_the_customer_employment() throws Throwable {
	    	
	    	String xpath = "(//table[1]/tbody[1]/tr[1]/td[4])[3]";
			action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath)), 60,
					2);
			WebElement NatureOfEmployment = driver.findElement(By.xpath(xpath));
			System.out.println("AccountType :" + NatureOfEmployment);
	    }

	    @Then("^verify field  employment type in listview of the customer employment$")
	    public void verify_field_employment_type_in_listview_of_the_customer_employment() throws Throwable {
	    	
	    	String xpath = "(//table[1]/tbody[1]/tr[1]/td[4])[3]";
			action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath)), 60,
					2);
			WebElement employmentType = driver.findElement(By.xpath(xpath));
			System.out.println("AccountType :" + employmentType);
	    }

	    @Then("^verify field  status in listview of the customer employment$")
	    public void verify_field_status_in_listview_of_the_customer_employment() throws Throwable {
	    	String xpath = "(//table[1]/tbody[1]/tr[1]/td[5])[3]";
			action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath)), 60,
					2);
			WebElement Status = driver.findElement(By.xpath(xpath));
			System.out.println("AccountType :" + Status);
	    }
	    

	    @And("^verify the functionality of Search box with matching data in list view of the customer employment$")
	    public void verify_the_functionality_of_search_box_with_matching_data_in_list_view_of_the_customer_employment() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.CustomerEmployment_ListViewSearch(), 60, 2);
			//for (int i = 0; i < 20; i++) {
				//try {
					employementobj.CustomerEmployment_ListViewSearch().click();
					Thread.sleep(1000);
					//break;
				//} catch (Exception e) {

				//}
			//}

			employementobj.CustomerEmployment_ListViewSearchtext().click();
			employementobj.CustomerEmployment_ListViewSearchtext().sendKeys("Bank");
			employementobj.CustomerEmployment_MachedDataList().getText();
			Assert.assertEquals(employementobj.CustomerEmployment_MachedDataList().isDisplayed(), true);

	    }

	    @And("^verify the functionality of Search box with mismatch data in list view of the customer employment$")
	    public void verify_the_functionality_of_search_box_with_mismatch_data_in_list_view_of_the_customer_employment() throws Throwable {
	    
	    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

			for (int i = 0; i < 20; i++) {
				try {
					employementobj.CustomerEmployment_ListViewSearch().click();
					break;
				} catch (Exception e) {

				}
			}
			employementobj.CustomerEmployment_ListViewSearchtext().click();
			employementobj.CustomerEmployment_ListViewSearchtext().sendKeys("###");
			Thread.sleep(1000);
			String xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]";
			for (int i = 0; i < 200; i++) {
				try {
					action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
							driver.findElement(By.xpath(xpath)), 60, 2);
					Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
					// "Showing 0 to 0 of 0 entries"
					break;
				} catch (Exception e) {

				}
			}

			driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
}
	    @Then("^verify the functionality of Export to PDF button in the list view of the customer employment$")
	    public void verify_the_functionality_of_export_to_pdf_button_in_the_list_view_of_the_customer_employment() throws Throwable {
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			employementobj.exportIcon().click();
	    			break;
	    		} catch (Exception e) {

	    		}
	    	}

	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, employementobj.exportToPDF(), 60, 3);
	    	employementobj.exportToPDF().click();
	    	// seleniumactions.getBrowserHelper().SwitchToWindow(1);
	    	String UserDirectory = System.getProperty("user.dir");
	    	System.out.println(UserDirectory);
	    	String substring = UserDirectory.substring(0, 21) + "Downloads";
	    	substring.replaceAll("/", "//");
	    	System.out.println(substring);
	    	File file = new File(substring);
	    	File[] totalfiles = file.listFiles();
	    	int length = totalfiles.length;
	    	int i = 0;
	    	for (File fileName : totalfiles) {
	    		if (fileName.getName().equalsIgnoreCase("customeremployment.pdf")) {
	    			System.out.println("Downloaded file present in system");
	    			break;
	    		} else if (i == length - 1) {
	    			System.out.println("Downloaded file present does not exist in system");
	    		}

	    	}
	    	action.getBrowserHelper().switchToParentWithChildClose();
	    }
	    

	    @Then("^verify the functionality of Export to Excel button in the list view of the customer employment$")
	    public void verify_the_functionality_of_export_to_excel_button_in_the_list_view_of_the_customer_employment() throws Throwable {
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			employementobj.exportIcon().click();
	    			break;
	    		} catch (Exception e) {

	    		}
	    	}
	    	action.getClickAndActionsHelper().moveToElement(employementobj.exportToExcel());
	    	employementobj.exportToExcel().click();
	    Thread.sleep(2000);
	    	
	    	
	    	String UserDirectory = System.getProperty("user.dir");
	        //System.out.println(UserDirectory);
	        String substring = UserDirectory.substring(0, 21) + "Downloads";
	        substring.replaceAll("/", "//");
	        System.out.println(substring);
	        File file = new File(substring);
	        File[] totalfiles = file.listFiles();
	        for (File fileName : totalfiles) {
	            System.out.println("File name" + fileName);
	            xlsList.add(fileName.toString());
	        }
	    }

	    @Then("^save the record in customer employment as salaried$")
	    public void save_the_record_in_customer_employment_as_salaried() throws Throwable {
	    	helper.scrollIntoView(employementobj.Trans_CxFinancial_EmploymentPeriod());
	    	helper.scrollIntoView(employementobj.CustomerEmployment_SaveButton());
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.CustomerEmployment_SaveButton(), 60, 2);
			employementobj.CustomerEmployment_SaveButton().isDisplayed();
			employementobj.CustomerEmployment_SaveButton().click();	
	
	    }
	   
		
	    @And("^user click on Customer Financials Tab$")
	    public void user_click_on_customer_financials_tab() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxEmplyObj_CxFinancialTab(), 60, 5);
	    	employementobj.Trans_CxEmplyObj_CxFinancialTab().click();
	    }

	    @And("^user click on Customer Employement Add button$")
	    public void user_click_on_customer_employement_add_button() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxEmplyObj_CxFinancialAddButton(), 60, 5);
	    	employementobj.Trans_CxEmplyObj_CxFinancialAddButton().click();
	    }

	    @And("^user Enter character value in Numeric Field$")
	    public void user_enter_character_value_in_numeric_field() throws Throwable {
	    	helper.scrollIntoView(employementobj.Trans_CxFinancial_NoOFPartners());
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_NoOFPartners(), 60, 5);
	    	employementobj.Trans_CxFinancial_NoOFPartners().click();
	    	employementobj.Trans_CxFinancial_NoOFPartners().sendKeys(employmentdata.InvalidValue);
	    	String attribute = employementobj.Trans_CxFinancial_NoOFPartners_verification().getAttribute("ng-reflect-model");
	    	int number = Integer.parseInt(attribute);
	    	System.out.println("This field pass Numeric value only" +attribute);
	    }

	    @And("^user Enter Numeric value in Character field$")
	    public void user_enter_numeric_value_in_character_field() throws Throwable {
	        
	    }

	    @And("^user Enter Special character in Any field$")
	    public void user_enter_special_character_in_any_field() throws Throwable {
	    	helper.scrollIntoView(employementobj.Trans_CxFinancial_EmployeeID());
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, employementobj.Trans_CxFinancial_EmployeeID(), 60, 5);
	    	employementobj.Trans_CxFinancial_EmployeeID().click();
	    	employementobj.Trans_CxFinancial_EmployeeID().sendKeys(employmentdata.SpecialCharacter);
	    }
	    @Then("^user verify the Required field proper validation message$")
	    public void user_verify_the_required_field_proper_validation_message() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]")), 60, 5);
	        String nameErrorMessage = driver.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]"))
	                .getText();
	        String expectedErrorText = "Required field";
	        if (nameErrorMessage.equalsIgnoreCase(expectedErrorText)) {
	            System.out.println("System should not allow the Mandatory fields Empty.The Popup validation message is "
	                    + nameErrorMessage);
	        } else {
	            System.out.println(
	                    "System should allow the Mandatory fields.The Popup validation message is " + nameErrorMessage);
	        }
	    }
	    @And("^Validate the Message and verify it$")
	    public void validate_the_message_and_verify_it() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath("//ion-badge[contains(text(),'Alphanumeric characters allowed')]")), 60,2);
	        WebElement errorPopUp = driver.findElement(By.xpath("//ion-badge[contains(text(),'Alphanumeric characters allowed')]"));
	        String expectedErrorText = "Alphanumeric characters allowed";
	        String actualErrorText = errorPopUp.getText();
	        if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
	            System.out.println("The system was not allow the record to save as we enter the invalid details.The Popup validation message is"+ actualErrorText);
	        } else {
	            System.out.println(
	                    "The actual and expected result are not same.The Popup validation message is" + actualErrorText);
	        }
	        Assert.assertEquals(actualErrorText, "Alphanumeric characters allowed");
	    }
	    @And("^go to customer financial tab$")
		public void go_to_customer_financial_tab() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxEmplyObj_CxFinancialTab(), 10, 1);
			employementobj.Trans_CxEmplyObj_CxFinancialTab().click();
		}

		@And("^click on edit button in customer personal details list view record$")
		public void click_on_edit_button_in_customer_personal_details_list_view_record() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxEmplyObj_CxFinancialEditIcon1(), 10, 1);
			employementobj.Trans_CxEmplyObj_CxFinancialEditIcon1().click();

		}

		@And("^select the customer employement details list view record$")
		public void select_the_customer_employement_details_list_view_record() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsEditIcon(), 10, 1);
			employementobj.customerEmploymentDetailsEditIcon().click();
		}

		@And("^blank the employement period dropdown$")
		public void blank_the_employement_period_dropdown() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxFinancial_EmploymentPeriod(), 10, 1);
			employementobj.Trans_CxFinancial_EmploymentPeriod().click();
			String xpath = "//ion-label[text()=' " + employmentdata.defaultSelectValue
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 15; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 15) {
						Assert.fail(e.getMessage());
					}
				}
			}

		}

		@And("^blank the nature of emplyment dropdown field$")
		public void blank_the_nature_of_emplyment_dropdown_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxFinancial_NatureOfEmployment(), 10, 1);
			employementobj.Trans_CxFinancial_NatureOfEmployment().click();
			String xpath = "//ion-label[text()=' " + employmentdata.defaultSelectValue
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 15; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 15) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^blank the employername dropdown$")
		public void blank_the_employername_dropdown() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxFinancial_EmployerName(), 10, 1);
			employementobj.Trans_CxFinancial_EmployerName().click();
			String xpath = "//ion-label[text()=' " + employmentdata.defaultSelectValue
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 15; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 15) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^blank the name if other dropdown field$")
		public void blank_the_name_if_other_dropdown_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.CustomerEmploymentEmployeeNameIfOtherdataHolder(), 10, 1);
			int length = employementobj.CustomerEmploymentEmployeeNameIfOtherdataHolder()
					.getAttribute("ng-reflect-model").length();
			for (int i = 0; i <= length; i++) {
				employementobj.Trans_CxFinancialEmployerNameIfOther().click();
				employementobj.Trans_CxFinancialEmployerNameIfOther().sendKeys(Keys.BACK_SPACE);
			}
		}

		@And("^blank the employee ID text box field$")
		public void blank_the_employee_id_text_box_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.CustomerEmploymentEmployeeIDDataHolder(), 10, 1);
			int length = employementobj.CustomerEmploymentEmployeeIDDataHolder()
					.getAttribute("ng-reflect-model").length();
			for (int i = 0; i <= length; i++) {
				employementobj.Trans_CxFinancial_EmployeeID().sendKeys(Keys.BACK_SPACE);
			}
		}

		@And("^blank the date of joining calendar input field$")
		public void blank_the_date_of_joining_calendar_input_field() throws Throwable {
			/*
			 * String dateOfJoiningInput = ""; for (int j = 0; j <= 30; j++) { try {
			 * dateOfJoiningInput = javascriptHelper
			 * .executeScript("return document.getElementsByClassName('p-inputtext p-component')[0].value"
			 * ) .toString(); if (dateOfJoiningInput != "" && dateOfJoiningInput != null) {
			 * break; } } catch (Exception e) { if (j == 30) { Assert.fail(e.getMessage());
			 * } } }
			 */
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsdateOfJoingInputBox(), 10, 1);
			employementobj.customerEmploymentDetailsdateOfJoingInputBox().click();
//			for (int i = 0; i <= dateOfJoiningInput.length(); i++) {
//				employementobj.customerEmploymentDetailsdateOfJoingInputBox().sendKeys(Keys.BACK_SPACE);
//			}
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsClearButton(), 10, 1);
			employementobj.customerEmploymentDetailsClearButton().click();
		}

		@And("^blank the employment end date calendar input field$")
		public void blank_the_employment_end_date_calendar_input_field() throws Throwable {

		}

		@And("^blank the department dropdown field$")
		public void blank_the_department_dropdown_field() throws Throwable {

		}

		@And("^blank the designation dropdown field$")
		public void blank_the_designation_dropdown_field() throws Throwable {

		}

		@And("^blank the employment type dropdown field$")
		public void blank_the_employment_type_dropdown_field() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxFinancial_EmploymentType(), 10, 1);
			employementobj.Trans_CxFinancial_EmploymentType().click();
			String xpath = "//ion-label[text()=' " + employmentdata.defaultSelectValue
					+ " ']/parent::ion-item/ion-radio";
			for (int i = 0; i <= 15; i++) {
				try {
					helper.scrollIntoView(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
					clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
					break;
				} catch (Exception e) {
					if (i == 15) {
						Assert.fail(e.getMessage());
					}
				}
			}
		}

		@And("^blank the direct manager contact number extension field$")
		public void blank_the_direct_manager_contact_number_extension_field() throws Throwable {

		}

		@And("^blank the direct manager telephone input field$")
		public void blank_the_direct_manager_telephone_input_field() throws Throwable {

		}

		@And("^blank the employer phone number input field$")
		public void blank_the_employer_phone_number_input_field() throws Throwable {

		}

		@And("^blank the state dropdown field$")
		public void blank_the_state_dropdown_field() throws Throwable {

		}

		@And("^blank the pincode input field$")
		public void blank_the_pincode_input_field() throws Throwable {

		}

		@And("^blank the total experience input field$")
		public void blank_the_total_experience_input_field() throws Throwable {

			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsTotalExperienceYearsDateInputBox(), 10, 1);
			int length = employementobj.customerEmploymentDetailsTotalExperienceYearsDateInputBox()
					.getAttribute("ng-reflect-model").length();
			for (int i = 0; i <= length; i++) {
				employementobj.Trans_CxFinancial_TotalExperienceYears().sendKeys(Keys.BACK_SPACE);
			}
		}

		@And("^blank the experience at current employment field$")
		public void blank_the_experience_at_current_employment_field() throws Throwable {

		}

		@And("^blank the direct manager input field$")
		public void blank_the_direct_manager_input_field() throws Throwable {

		}

		@And("^blank the city code input field$")
		public void blank_the_city_code_input_field() throws Throwable {

		}

		@And("^blank the retirement age input field$")
		public void blank_the_retirement_age_input_field() throws Throwable {
			for (int i = 0; i <= 30; i++) {
				try {
					helper.scrollIntoView(
							employementobj.customerEmploymentDetailsRetirementAgeYearsDateHolder());
					break;
				} catch (Exception e) {
					if (i == 30) {
						Assert.fail(e.getMessage());
					}
				}
			}
			// waitHelper.waitForElementToVisibleWithFluentWait(driver,
			// employementobj.customerEmploymentDetailsRetirementAgeYearsDateHolder(),
			// 10, 1);
			int length = employementobj.customerEmploymentDetailsRetirementAgeYearsDateHolder()
					.getAttribute("ng-reflect-model").length();
			for (int i = 0; i <= length; i++) {
				employementobj.Trans_CxFinancial_RetirementAge().sendKeys(Keys.BACK_SPACE);
			}
		}

		@And("^click on save button after blank the fields in customer employment details$")
		public void click_on_save_button_after_blank_the_fields_in_customer_employment_details() throws Throwable {
			for (int i = 0; i <= 50; i++) {
				try {
					helper.scrollIntoView(employementobj.CustomerEmployment_SaveButton());
					break;
				} catch (Exception e) {
					if (i == 50) {
						Assert.fail(e.getMessage());
					}
				}
			}
			employementobj.CustomerEmployment_SaveButton().click();

		}

		@Then("^verify employment Period field should show the validation for required field$")
		public void verify_employment_period_field_should_show_the_validation_for_required_field() throws Throwable {
			for (int i = 0; i <= 30; i++) {
				try {
					helper.scrollIntoView(employementobj.Trans_CxFinancial_EmploymentPeriod());
					break;
				} catch (Exception e) {
					if (i == 30) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsEmploymentPeriodFieldvalidation().getText(),
					employmentdata.mandatoryBlankFieldValidation);
		}

		@Then("^verify nature of employment field should show the validation for required field$")
		public void verify_nature_of_employment_field_should_show_the_validation_for_required_field() throws Throwable {
			for (int i = 0; i <= 30; i++) {
				try {
					helper.scrollIntoView(employementobj.Trans_CxFinancial_NatureOfEmployment());
					break;
				} catch (Exception e) {
					if (i == 30) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsnatureOfEmploymentFieldvalidation().getText(),
					employmentdata.mandatoryBlankFieldValidation);
		}

		@Then("^verify employer name if other field should show the validation for required field$")
		public void verify_employer_name_if_other_field_should_show_the_validation_for_required_field() throws Throwable {
			for (int i = 0; i <= 30; i++) {
				try {
					helper.scrollIntoView(employementobj.Trans_CxFinancial_EmployerNameOther1());
					break;
				} catch (Exception e) {
					if (i == 30) {
						Assert.fail(e.getMessage());
					}
				}
			}
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsEmployerNameIfOtherFieldvalidation(), 10, 1);
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsEmployerNameIfOtherFieldvalidation().getText(),
					employmentdata.mandatoryBlankFieldValidation);
		}

		@Then("^verify employee ID field should show the validation for required field$")
		public void verify_employee_id_field_should_show_the_validation_for_required_field() throws Throwable {
			for (int i = 0; i <= 30; i++) {
				try {
					helper.scrollIntoView(employementobj.Trans_CxFinancial_EmployeeID());
					break;
				} catch (Exception e) {
					if (i == 30) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertEquals(employementobj.customerEmploymentDetailsEmployeeIDFieldvalidation().getText(),
					employmentdata.mandatoryBlankFieldValidation);
		}

		@Then("^verify Date of joining field should show the validation for required field$")
		public void verify_date_of_joining_field_should_show_the_validation_for_required_field() throws Throwable {
			for (int i = 0; i <= 30; i++) {
				try {
					helper
							.scrollIntoView(employementobj.customerEmploymentDetailsdateOfJoingInputBox());
					break;
				} catch (Exception e) {
					if (i == 30) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsdateOfJoiningFieldvalidation().getText(),
					employmentdata.mandatoryBlankFieldValidation);
		}

		@Then("^verify employment type field should show the validation for required field$")
		public void verify_employment_type_field_should_show_the_validation_for_required_field() throws Throwable {
			for (int i = 0; i <= 30; i++) {
				try {
					helper.scrollIntoView(employementobj.Trans_CxFinancial_EmploymentType());
					break;
				} catch (Exception e) {
					if (i == 30) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsEmploymentTypeFieldvalidation().getText(),
					employmentdata.mandatoryBlankFieldValidation);
		}

		@Then("^verify total experience field should show the validation for required field$")
		public void verify_total_experience_field_should_show_the_validation_for_required_field() throws Throwable {
			for (int i = 0; i <= 30; i++) {
				try {
					helper.scrollIntoView(
							employementobj.customerEmploymentDetailsTotalExperienceYearsDateInputBox());
					break;
				} catch (Exception e) {
					if (i == 30) {
						Assert.fail(e.getMessage());
					}
				}
			}
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsTotalExperienceYearsFieldvalidation().getText(),
					employmentdata.mandatoryBlankFieldValidation);
		}

		@Then("^verify retirement age field should show the validation for required field$")
		public void verify_retirement_age_field_should_show_the_validation_for_required_field() throws Throwable {
			boolean status = false;
			for (int i = 0; i <= 20; i++) {
				try {
					status = employementobj.customerEmploymentDetailsretirementAgeYearsFieldvalidation()
							.isDisplayed();
				} catch (Exception e) {
					if (i == 20) {
						status = false;
					}
				}
			}
			if (status == true) {
				Assert.assertEquals(
						employementobj.customerEmploymentDetailsretirementAgeYearsFieldvalidation().getText(),
						employmentdata.mandatoryBlankFieldValidation);
			} else {
				softAssert.assertTrue(status,
						" Retirement field is mandatory field but it not through the blank field validation while saving hence test step failed");

			}
		}

		@Then("^verify employer name field should through the validation for special character input$")
		public void verify_employer_name_field_should_through_the_validation_for_special_character_input()
				throws Throwable {
			for (int i = 0; i <= 20; i++) {
				try {
					helper.scrollIntoView(employementobj.Trans_CxFinancialEmployerNameIfOther());
					break;
				} catch (Exception e) {
					if (i == 20) {
						Assert.fail(e.getMessage());
					}
				}
			}
			employementobj.Trans_CxFinancialEmployerNameIfOther()
					.sendKeys(employmentdata.specialCharacterInput);
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsEmployerNameIfOtherFieldvalidation(), 10, 1);
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsEmployerNameIfOtherFieldvalidation().getText(),
					employmentdata.SpecialCharacterFieldValidation);
		}

		@Then("^verify employee ID field should through the validation for special character input$")
		public void verify_employee_id_field_should_through_the_validation_for_special_character_input() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxFinancial_EmployeeID(), 10, 1);
			employementobj.Trans_CxFinancial_EmployeeID().clear();
			employementobj.Trans_CxFinancial_EmployeeID()
					.sendKeys(employmentdata.specialCharacterInput);

			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsEmployeeIDFieldvalidation(), 10, 1);
			Assert.assertEquals(employementobj.customerEmploymentDetailsEmployeeIDFieldvalidation().getText(),
					employmentdata.SpecialCharacterFieldValidation);

		}

		@Then("^verify Direct manager phone number field should through the validation for special character input$")
		public void verify_direct_manager_phone_number_field_should_through_the_validation_for_special_character_input()
				throws Throwable {
			for (int i = 0; i <= 20; i++) {
				try {
					helper.scrollIntoView(employementobj.Trans_CxFinancial_directManagerTelephone());
					break;
				} catch (Exception e) {
					if (i == 20) {
						Assert.fail(e.getMessage());
					}
				}
			}
			employementobj.Trans_CxFinancial_directManagerTelephone()
					.sendKeys(employmentdata.specialCharacterInput);
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxFinancial_directManagerTelephone(), 10, 1);
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsDirectManagerTelePhoneFieldvalidation().getText(),
					employmentdata.SpecialCharacterFieldValidation);
		}

		@Then("^verify employer phone number field should through the validation for special character input$")
		public void verify_employer_phone_number_field_should_through_the_validation_for_special_character_input()
				throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxFinancial_EmployerPhoneNumber(), 10, 1);
			employementobj.Trans_CxFinancial_EmployerPhoneNumber().clear();
			employementobj.Trans_CxFinancial_EmployerPhoneNumber()
					.sendKeys(employmentdata.specialCharacterInput);

			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsEmployerPhoneNumberFieldvalidation(), 10, 1);
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsEmployerPhoneNumberFieldvalidation().getText(),
					employmentdata.MobileNumberValidation1);

		}

		@Then("^verify Direct Manager field should through the validation for special character input$")
		public void verify_direct_manager_field_should_through_the_validation_for_special_character_input()
				throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxFinancial_DirectManager(), 10, 1);
			employementobj.Trans_CxFinancial_DirectManager().clear();
			employementobj.Trans_CxFinancial_DirectManager()
					.sendKeys(employmentdata.specialCharacterInput);

			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsDirectManagerFieldvalidation(), 10, 1);
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsDirectManagerFieldvalidation().getText(),
					employmentdata.SpecialCharacterFieldValidation);
		}

		@Then("^verify system should not allow user to enter more that 10 digit phone number and less than 10 digit phone number in employer phone number field$")
		public void verify_system_should_not_allow_user_to_enter_more_that_10_digit_phone_number_and_less_than_10_digit_phone_number_in_employer_phone_number_field()
				throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.Trans_CxFinancial_EmployerPhoneNumber(), 10, 1);
			employementobj.Trans_CxFinancial_EmployerPhoneNumber().clear();
			employementobj.Trans_CxFinancial_EmployerPhoneNumber()
					.sendKeys(employmentdata.lessThanTenDigitPhoneNumber);
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsEmployerPhoneNumber2Fieldvalidation(), 10, 1);
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsEmployerPhoneNumber2Fieldvalidation().getText(),
					employmentdata.MobileNumberValidation2);
			employementobj.Trans_CxFinancial_EmployerPhoneNumber().clear();
			employementobj.Trans_CxFinancial_EmployerPhoneNumber()
					.sendKeys(employmentdata.greaterThatTeonDigitPhoneNumber);
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsEmployerPhoneNumber2Fieldvalidation(), 10, 1);
			Assert.assertEquals(
					employementobj.customerEmploymentDetailsEmployerPhoneNumber2Fieldvalidation().getText(),
					employmentdata.MobileNumberValidation2);
		}

		@Then("^verify the functionlaity of back button in customer EmploymentDetails screen$")
		public void verify_the_functionlaity_of_back_button_in_customer_employmentdetails_screen() throws Throwable {
			for (int i = 0; i <= 10; i++) {
				try {
					helper.scrollIntoView(employementobj.customerEmploymentDetailsBackButton());
					break;
				} catch (Exception e) {
					if (i == 10) {
						Assert.fail(e.getMessage());
					}
				}
			}
			employementobj.customerEmploymentDetailsBackButton().click();
			waithelper.waitForElementToVisibleWithFluentWait(driver,
					employementobj.customerEmploymentDetailsBackButtonVerification(), 10, 1);
			Assert.assertTrue(employementobj.customerEmploymentDetailsBackButtonVerification().isDisplayed());
			softAssert.assertAll();

		}



	    
}
