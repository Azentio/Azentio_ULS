package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.CustomerEmployment_LayoutObject;
import resources.BaseClass;
import testDataType.CustomerFinancialsTestData;

public class Customer_Fianancials extends BaseClass {
 WebDriver driver = BaseClass.driver;
 JsonConfig jsonConfig = new JsonConfig();
 ConfigFileReader configFileReader = new ConfigFileReader();
 Selenium_Actions seleniumActions = new Selenium_Actions(driver);
 CustomerEmployment_LayoutObject customerEmploymentLayout = new CustomerEmployment_LayoutObject(driver);
 CustomerFinancialsTestData customerFinancialsTestData = jsonConfig.getCustomerFinancialsDataListByName("Maker");
 @And("^User click the first edit icon in customer employment list$")
 public void user_click_the_first_edit_icon_in_customer_employment_list() throws Throwable {
	 
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxEmplyObj_CxCustomerEmploymentListEditIcon1(),30, 2);
	 customerEmploymentLayout.Trans_CxEmplyObj_CxCustomerEmploymentListEditIcon1().click();
 }
 @And("^User click the first edit icon in customer personal information$")
 public void user_click_the_first_edit_icon_in_customer_personal_information() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxEmplyObj_CxFinancialEditIcon1(),30, 2);
	 customerEmploymentLayout.Trans_CxEmplyObj_CxFinancialEditIcon1().click();
 }
 @And("^User click customer financials tab$")
 public void user_click_customer_financials_tab() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxEmplyObj_CxFinancialTab(),30, 2);
	 customerEmploymentLayout.Trans_CxEmplyObj_CxFinancialTab().click();
 }
 @And("^User select and update nature of the employment$")
 public void user_select_and_update_nature_of_the_employment() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_NatureOfEmployment(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_NatureOfEmployment().click();
	 System.out.println(customerFinancialsTestData.NatureofEmployment);
	 String xpath ="//ion-label[text()=' "+customerFinancialsTestData.NatureofEmployment+" ']//following-sibling::ion-radio";
	for (int i = 0; i <200; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^User select and update the employment period$")
 public void user_select_and_update_the_employment_period() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_EmploymentPeriod(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_EmploymentPeriod().click();
	 String xpath ="//ion-label[text()=' "+customerFinancialsTestData.Employmentperiod+" ']//following-sibling::ion-radio";
	for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^User select and update the employer name$")
 public void user_select_and_update_the_employer_name() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_EmployerName(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_EmployerName().click();
	 String xpath ="//ion-label[text()=' "+customerFinancialsTestData.EmployerName+" ']//following-sibling::ion-radio";
	for (int i = 0; i <60; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^User update the employer name others$")
 public void user_update_the_employer_name_others() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_EmployerNameOther1(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_EmployerNameOther1().click();
	for (int i = 0; i <60; i++) {
		try {
			customerEmploymentLayout.Trans_CxFinancial_EmployerNameOther1().clear();
			customerEmploymentLayout.Trans_CxFinancial_EmployerNameOther1().sendKeys(customerFinancialsTestData.EmployerName);
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^User update the employee id$")
 public void user_update_the_employee_id() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_EmployeeID(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_EmployeeID().click();
	for (int i = 0; i <30; i++) {
		try {
			 customerEmploymentLayout.Trans_CxFinancial_EmployeeID().clear();
			customerEmploymentLayout.Trans_CxFinancial_EmployeeID().sendKeys(customerFinancialsTestData.EmployeId);
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^User update the date of joining$")
 public void user_update_the_date_of_joining() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_DateOfJoining(),60, 2);
	 customerEmploymentLayout.Trans_CxFinancial_DateOfJoining().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.clearbuttonIncalendar(),60, 2);
	 customerEmploymentLayout.clearbuttonIncalendar().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_DateOfJoining(),60, 2);
	 customerEmploymentLayout.Trans_CxFinancial_DateOfJoining().click();
	 String yearXpath ="//button[text()=' "+customerFinancialsTestData.PresentYear+" ']";
	  for (int i = 0; i <30; i++) {
			try {
				 driver.findElement(By.xpath(yearXpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	  String yearXpath2 ="//span[text()=' "+customerFinancialsTestData.DateOfJoiningYear+" ']";
	  while (true) {
		try {
			driver.findElement(By.xpath(yearXpath2)).click();
			break;
		} catch (NoSuchElementException e) {
			String xpath="//body/div[1]/div[2]/span[1]";
			String year = driver.findElement(By.xpath(xpath)).getText();
			int firstyear = Integer.parseInt(year);
			if (firstyear>Integer.parseInt(customerFinancialsTestData.DateOfJoiningYear)) {
				customerEmploymentLayout.previousbuttonIncalendar().click();
			}
			else {
				customerEmploymentLayout.nextbuttonIncalendar().click();
				
			}
		}
	}
	  String monthXpath ="//span[text()=' "+customerFinancialsTestData.DateOfJoiningMonth+" ']";
	  for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(monthXpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
	  String dateXpath ="//span[text()='"+customerFinancialsTestData.DateOfJoiningDate+"']";
	  for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(dateXpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
		
 }

 @And("^User update the Employment end date$")
 public void user_update_the_employment_end_date() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_EmploymentEndDate(),60, 2);
	 customerEmploymentLayout.Trans_CxFinancial_EmploymentEndDate().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.clearbuttonIncalendar(),60, 2);
	 customerEmploymentLayout.clearbuttonIncalendar().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_EmploymentEndDate(),60, 2);
	 customerEmploymentLayout.Trans_CxFinancial_EmploymentEndDate().click();
	 String yearXpath ="//button[text()=' "+customerFinancialsTestData.PresentYear+" ']";
	  for (int i = 0; i <30; i++) {
			try {
				 driver.findElement(By.xpath(yearXpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	  String yearXpath2 ="//span[text()=' "+customerFinancialsTestData.EmploymentEndYear+" ']";
	  while (true) {
		try {
			driver.findElement(By.xpath(yearXpath2)).click();
			break;
		} catch (NoSuchElementException e) {
			String xpath="//body/div[1]/div[2]/span[1]";
			String year = driver.findElement(By.xpath(xpath)).getText();
			int firstyear = Integer.parseInt(year);
			if (firstyear>Integer.parseInt(customerFinancialsTestData.EmploymentEndYear)) {
				customerEmploymentLayout.previousbuttonIncalendar().click();
			}
			else {
				customerEmploymentLayout.nextbuttonIncalendar().click();
				
			}
		}
	}
	  String monthXpath ="//span[text()=' "+customerFinancialsTestData.EmploymentEndMonth+" ']";
	  for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(monthXpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
	  String dateXpath ="//span[text()='"+customerFinancialsTestData.EmploymentEndDate+"']";
	  for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(dateXpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
	  
 }

 @And("^User select and update department$")
 public void user_select_and_update_department() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_Department(),60, 2);
	 customerEmploymentLayout.Trans_CxFinancial_Department().click();
	 String xpath ="//ion-label[text()=' "+customerFinancialsTestData.Depertment+" ']//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
 }

 @And("^User select and update Designation$")
 public void user_select_and_update_designation() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_Designation(),60, 2);
	 customerEmploymentLayout.Trans_CxFinancial_Designation().click();
	 String xpath ="//ion-label[text()=' "+customerFinancialsTestData.Designation+" ']//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
 }

 @And("^User Select and Update the Employment Type$")
 public void user_select_and_update_the_employment_type() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_EmploymentType(),60, 2);
	 customerEmploymentLayout.Trans_CxFinancial_EmploymentType().click();
	 String xpath ="//ion-label[text()=' "+customerFinancialsTestData.EmploymentType+" ']//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
 }

 @And("^User update Direct Manager Contact Number Extension$")
 public void user_update_direct_manager_contact_number_extension() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_DirectManagerNumExt(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_DirectManagerNumExt().click();
	 
	 
	for (int i = 0; i <30; i++) {
		try {
			customerEmploymentLayout.Trans_CxFinancial_DirectManagerNumExt().clear();
			customerEmploymentLayout.Trans_CxFinancial_DirectManagerNumExt().sendKeys(customerFinancialsTestData.DirectManagerContactNumberExtension);
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^User update Direct Manager Telephone$")
 public void user_update_direct_manager_telephone() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_directManagerTelephone(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_directManagerTelephone().click();
	 
	 
	for (int i = 0; i <30; i++) {
		try {
			customerEmploymentLayout.Trans_CxFinancial_directManagerTelephone().clear();
			customerEmploymentLayout.Trans_CxFinancial_directManagerTelephone().sendKeys(customerFinancialsTestData.DirectManagertelephone);
			break;
		} catch (Exception e) {
			
		}
	}  
 }

 @And("^User update Employer Phone Extension$")
 public void user_update_employer_phone_extension() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_EmpPhoneExt(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_EmpPhoneExt().click();
	
	 
	for (int i = 0; i <30; i++) {
		try {
			 customerEmploymentLayout.Trans_CxFinancial_EmpPhoneExt().clear();
			customerEmploymentLayout.Trans_CxFinancial_EmpPhoneExt().sendKeys(customerFinancialsTestData.EmployerPhoneExtension);
			break;
		} catch (Exception e) {
			
		}
	}     
 }

 @And("^User select and update State$")
 public void user_select_and_update_state() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_cxFinancial_State(),60, 2);
	 customerEmploymentLayout.Trans_cxFinancial_State().click();
	 String xpath ="//ion-label[text()=' "+customerFinancialsTestData.State+" ']//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
 }

 @And("^User update pincode$")
 public void user_update_pincode() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_Pincode(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_Pincode().click();
	for (int i = 0; i <30; i++) {
		try {
			 customerEmploymentLayout.Trans_CxFinancial_Pincode().clear();
			customerEmploymentLayout.Trans_CxFinancial_Pincode().sendKeys(customerFinancialsTestData.Pincode);
			break;
		} catch (Exception e) {
			
		}
	}    
 }

 @And("^User Update Total Experience years$")
 public void user_update_total_experience_years() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_TotalExperienceYears(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_TotalExperienceYears().click();
	 
	 
	for (int i = 0; i <30; i++) {
		try {
			customerEmploymentLayout.Trans_CxFinancial_TotalExperienceYears().clear();
			customerEmploymentLayout.Trans_CxFinancial_TotalExperienceYears().sendKeys(customerFinancialsTestData.TotalExperience);
			break;
		} catch (Exception e) {
			
		}
	}       
 }

 @And("^User Update Experience At Current Employment$")
 public void user_update_experience_at_current_employment() throws Throwable {
	 seleniumActions.getJavascriptHelper().scrollIntoView(customerEmploymentLayout.Trans_CxFinancial_ExpCurrentEmp());
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_ExpCurrentEmp(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_ExpCurrentEmp().click();
	 
	 
	for (int i = 0; i <30; i++) {
		try {
			customerEmploymentLayout.Trans_CxFinancial_ExpCurrentEmp().clear();
			customerEmploymentLayout.Trans_CxFinancial_ExpCurrentEmp().sendKeys(customerFinancialsTestData.ExperienceAtCurrentEmployment);
			break;
		} catch (Exception e) {
			
		}
	}        
 }

 @And("^User Update Direct Manager$")
 public void user_update_direct_manager() throws Throwable {
	 seleniumActions.getJavascriptHelper().scrollIntoView(customerEmploymentLayout.Trans_CxFinancial_DirectManager());
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_DirectManager(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_DirectManager().click();
	for (int i = 0; i <30; i++) {
		try {
			customerEmploymentLayout.Trans_CxFinancial_DirectManager().clear();
			customerEmploymentLayout.Trans_CxFinancial_DirectManager().sendKeys(customerFinancialsTestData.DirectManager);
			break;
		} catch (Exception e) {
			
		}
	}        
 }

 @And("^User Update Employer City Code$")
 public void user_update_employer_city_code() throws Throwable {
	 seleniumActions.getJavascriptHelper().scrollIntoView(customerEmploymentLayout.Trans_CxFinancial_EmpCityCode());
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_EmpCityCode(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_EmpCityCode().click();
	 
	 
	for (int i = 0; i <30; i++) {
		try {
			customerEmploymentLayout.Trans_CxFinancial_EmpCityCode().clear();
			customerEmploymentLayout.Trans_CxFinancial_EmpCityCode().sendKeys(customerFinancialsTestData.EmployerCityCode);
			break;
		} catch (Exception e) {
			
		}
	}       
 }

 @And("^User Update Retirement Age Years$")
 public void user_update_retirement_age_years() throws Throwable {
	 seleniumActions.getJavascriptHelper().scrollIntoView(customerEmploymentLayout.Trans_CxFinancial_RetirementAge());
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_RetirementAge(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_RetirementAge().click();
	for (int i = 0; i <30; i++) {
		try {
			customerEmploymentLayout.Trans_CxFinancial_RetirementAge().clear();
			customerEmploymentLayout.Trans_CxFinancial_RetirementAge().sendKeys(customerFinancialsTestData.RetireMentAge);
			break;
		} catch (Exception e) {
			
		}
	}       
 }

 @And("^User Update Remarks$")
 public void user_update_remarks() throws Throwable {
	 seleniumActions.getJavascriptHelper().scrollIntoView(customerEmploymentLayout.Trans_CxFinancial_Remarks());
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.Trans_CxFinancial_Remarks(),30, 2);
	 customerEmploymentLayout.Trans_CxFinancial_Remarks().click();
	for (int i = 0; i <30; i++) {
		try {
			customerEmploymentLayout.Trans_CxFinancial_Remarks().clear();
			customerEmploymentLayout.Trans_CxFinancial_Remarks().sendKeys(customerFinancialsTestData.Remarks);
			break;
		} catch (Exception e) {
			
		}
	}  
 }
 @And("^User upadte and save the customer financial record$")
 public void user_upadte_and_save_the_customer_financial_record() throws Throwable {
	 seleniumActions.getJavascriptHelper().scrollIntoView(customerEmploymentLayout.customerFinancialDetailsUpdate());
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.customerFinancialDetailsUpdate(),30, 2);
	 customerEmploymentLayout.customerFinancialDetailsUpdate().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEmploymentLayout.successMgs(),30, 2);
	 Assert.assertEquals(customerEmploymentLayout.successMgs().isDisplayed(), true);
 }

}
