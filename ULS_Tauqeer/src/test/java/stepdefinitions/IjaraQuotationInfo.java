package stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.IjarahCustomerDetailObj;
import pageobjects.JSPaths;
import resources.BaseClass;

public class IjaraQuotationInfo {
	String excelPathJSPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	//JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");
	JSPaths quotationInfoJsPaths = new JSPaths(excelPathJSPath, "IjaraQuotationInfo_Elements", "QuotationInfo_FieldName", "JSPath");
	//JSPaths customerDetailsJsPaths = new JSPaths(excelPathJSPath, "CustomerDetail_JSPath", "CustomerDetails_FieldName", "JSPath");
	//JSPaths underWriterJsPaths = new JSPaths(excelPath, "Underwriter_Elements", "Underwriter_FieldName", "JSPath");
	//IjarahCustomerDetailObj ijarahCustomerDetailObj = new IjarahCustomerDetailObj(driver);
	
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	ExcelData quotationInfoExcelData  = new ExcelData(excelTestDataPath,"IjaraQuotationInfo_TestData","DataSet ID");
	//ExcelData customerDebtExcelData  = new ExcelData(excelTestDataPath,"CF_DebtTestData","DataSet ID");
	//ExcelData customerDetailsExcelData  = new ExcelData(excelTestDataPath,"CustomerDetail_TestData","DataSet ID");
	ExcelData underWriterExcelData  = new ExcelData(excelTestDataPath,"UnderWriter_TestData","DataSet ID");
	
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	
	
	@And("User get the test data for test case AT_QIA_01")
	 public void get_the_test_data_for_test_case_AT_CUD_01() throws Throwable {
		testData = quotationInfoExcelData.getTestdata("DS_AT_QIA_01");
    }	
	
	@And("User get the test data for test case AT_QIA_02")
	 public void get_the_test_data_for_test_case_AT_CUD_02() throws Throwable {
		testData = quotationInfoExcelData.getTestdata("DS_AT_QIA_02");
   }	
	
	
	
	
	 @And("User click the module name dropdown in ULS application for quotation info")
	 public void user_click_the_module_name_dropdown_in_uls_application_for_quotation_info() throws IOException {
		 waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("moduleNameDropdown")));
			
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("moduleNameDropdown")).click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
	 }
	 
	 
	 @And("User select the module name as LOS in ULS application for quotation info")
	 public void user_select_the_module_name_as_los_in_ULS_application_for_quotation_info() {
		 String moduleListJSpath = "document.querySelectorAll('ion-radio-group ion-item').length";
	        String moduleLength = "";
	        for (int i = 0; i <= 300; i++) {
	            try {
	                moduleLength = javascriptHelper.executeScript("return " + moduleListJSpath).toString();
	                System.out.println("Module Length " + moduleLength);
	                if (!(moduleLength.isBlank())) {
	                    break;
	                }
	            } catch (Exception e) {
	                if (i == 300) {
	                    Assert.fail(e.getMessage());
	                }
	            }
	        }
	        int premitiveIntegerLength = Integer.parseInt(moduleLength);
	        
//			document.querySelectorAll('ion-radio-group ion-item')[0].textContent
	        for (int i = 0; i < premitiveIntegerLength; i++) {
	            for (int j = 0; j <= 300; j++) {
	                try {
	                    String moduleName = javascriptHelper.executeScript(
	                            "return  document.querySelectorAll('ion-radio-group ion-item')[" + i + "].textContent")
	                            .toString();
	                    System.out.println("Module name " + moduleName);
//	                    if (moduleName.equalsIgnoreCase("LOS")) {
	                    if (moduleName.equalsIgnoreCase(testData.get("Module Name"))) {
	                        System.out
	                                .println("document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]");
	                        javascriptHelper
	                                .executeScriptWithWebElement(
	                                        "document.querySelectorAll('ion-radio-group ion-item ion-radio')[" + i + "]")
	                                .click();
	                    }
	                } catch (Exception e) { 

	                }
	            }
	        }	
	 }
	 
	 @And("User click the Mail box in ULS application for quotation info")
	 public void user_click_the_mail_box_in_uls_application_for_quotation_info() throws IOException {
		 waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("mailBox")));
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("mailBox")).click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}
	 }
	 
	 
	 @And("User click the Search button under inbox quotation info")
	 public void user_click_the_search_button_under_inbox_quotation_info() throws IOException {
		 waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("mailInboxSearchBtn")));
			for (int i = 0; i <= 500; i++) {
				try {
					javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("mailInboxSearchBtn")).click();
					break;
				} catch (Exception e) {
					if (i == 500) {
						Assert.fail(e.getMessage());
					}
				}
			}	    
	 }
	 
	 
	 
	 @And("User search the Ref id under inbox for quotation info")
     public void user_search_the_ref_id_under_inbox_for_quotation_info() throws IOException {
		 waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("inboxSearchInput")));
			for (int i = 0; i <= 2000; i++) {
				try {
					 javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("inboxSearchInput")).sendKeys(testData.get("Ref No"));
					
					break;
				} catch (Exception e) {
					if (i == 2000) {
						Assert.fail(e.getMessage());
					}
				}
			} 
	 }
	 
	 
	 
	 @And("User click the Entitle button under inbox for quotation info")
	 public void user_click_the_entitle_button_under_inbox_for_quotation_info() {
		 for (int i = 0; i <= 1000; i++) {
				try {
			        waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("inboxEntitleBtn")));
					javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("inboxEntitleBtn")).click();
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}	
	 }
	 
	
	
	@And("user click the next button")
	public void user_click_the_next_button() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("nextButton")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("nextButton")).click();
				//javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("nextButton")).click();
				//javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("nextButton")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("user click the quotation info tab")
	public void user_click_the_quotation_info_tab() {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("quotationInfoTab")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("user click the add new button")
	public void user_click_the_add_new_button() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("QuotationInfo_AddNew")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("QuotationInfo_AddNew")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("user click the back button")
	public void user_click_the_back_button() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("backButton")));
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("backButton")).click();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("user verify it is navigating to previous screen")
	public void user_verify_it_is_navigating_to_previous_screen() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("QuotationInfo_AddNew")));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("QuotationInfo_AddNew")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	
	@And("user verify back button is present")
	public void user_verify_back_button_is_present() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("backButton")));
		for (int i = 0; i <= 500; i++) {
			try {
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("backButton")).isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("user verify all the details under quotation info tab")
	public void user_verify_all_the_details_under_quotation_info_tab() throws IOException {
		
		//insuranceCompany By BP ID
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("insuranceCompanyBpIdDropDown")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("insuranceCompanyBpIdDropDown")).isDisplayed());
		System.out.println("1");
		
		
		//BasePremiumAmount
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("basePremAmtUpDownKey")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("basePremAmtUpDownKey")).isDisplayed());
		System.out.println("2");
		
		
		//Vat On Base Premium Amount
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("vatOnBasePremAmtUpDownKey")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("vatOnBasePremAmtUpDownKey")).isDisplayed());
		System.out.println("3");
		
		
		//Net Base Premium Amount
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("netBasePremAmtUpDownKey")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("netBasePremAmtUpDownKey")).isDisplayed());
		System.out.println("4");
		
		//Total Discount Amount 
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("totalDiscountAmtUpDownKey")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("totalDiscountAmtUpDownKey")).isDisplayed());
		System.out.println("5");
		
		
		//Expiry Date
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("expiryDatecalendar")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("expiryDatecalendar")).isDisplayed());
		System.out.println("6");
		
		//Quotation Reference No
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("quotationReferenceNoTextField")));
		Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(quotationInfoJsPaths.getElement("quotationReferenceNoTextField")).isDisplayed());
		System.out.println("7");
	}
	
}
