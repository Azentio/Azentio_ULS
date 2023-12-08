package stepdefinitions;

import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.JSPaths;
import resources.BaseClass;

public class TawarooqLivingExpenses {
	String excelPath = System.getProperty("user.dir") + "\\TestData\\IjaraJSPaths.xlsx";
	String excelTestDataPath = System.getProperty("user.dir") + "\\TestData\\ijaraTestData.xlsx";
	WebDriver driver = BaseClass.driver;
	JSPaths jsPaths = new JSPaths(excelPath, "Ijara_loginElements", "Ijara_LoginFieldName", "JSPath");

	JSPaths livingExpensesJsPaths = new JSPaths(excelPath, "TawarooqLivingExpenses_Elements",
			"LivingExpenses_FieldName", "JSPath");

	// ApplicationDetailsPageObj appObj = new ApplicationDetailsPageObj(driver);
	ExcelData exelData = new ExcelData(excelTestDataPath, "ijara_LoginCredentials", "UserType");
	Map<String, String> loginTestData = new HashMap<>();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	Selenium_Actions selenium_Actions = new Selenium_Actions(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	
	ExcelData livingExpenses_TestData = new ExcelData(excelTestDataPath, "TawarooqLivingExpenses_TestData",
			"DataSet ID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	Robot robot;
	SoftAssert softAssert = new SoftAssert();
	WebDriverWait expWait = new WebDriverWait(driver, Duration.ofSeconds(2000));

	// Testdata
	//@AT_LEA_01 application deatils COntract Signing stage
	@And("^User get the test data for test case AT_LEA_01$")
	public void get_the_test_data_for_test_case_search_customer_AT_DOC_01() throws Throwable {
		testData = livingExpenses_TestData.getTestdata("DS_AT_LEA_01");
    }	
	
	
	
	
	@And("user click on the module name dropdown under uls application")
	public void user_click_on_the_module_name_dropdown_under_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(livingExpensesJsPaths.getElement("moduleNameDrpDwn1")));
		
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement(livingExpensesJsPaths.getElement("moduleNameDrpDwn1")).click();
				

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		
	}
	
	@And("user click on the inbox under uls application")
	public void user_click_on_the_inbox_under_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper.
				executeScriptWithWebElement(livingExpensesJsPaths.getElement("mailBox")));
		
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement(livingExpensesJsPaths.getElement("mailBox")).click();
				

				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
	}
	
	@And("User click the Search button under inbox in uls application")
	public void user_click_the_search_button_under_inbox_in_uls_application() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("mailInboxSearchIconBtn")));

		for (int i = 0; i <= 500; i++) {

			try {
				javascriptHelper
						.executeScriptWithWebElement(livingExpensesJsPaths.getElement("mailInboxSearchIconBtn"))
						.click();
				//javascriptHelper.JSEClick(javascriptHelper
				//		.executeScriptWithWebElement(livingExpensesJsPaths.getElement("inboxSearchInput")));
				//javascriptHelper
				//.executeScriptWithWebElement(livingExpensesJsPaths.getElement("inboxSearchInput"))
				//.sendKeys("3201");

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("user search the ref id under inbox in uls application")
	public void user_search_the_ref_id_under_inbox_in_uls_application() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				//.executeScriptWithWebElement(livingExpensesJsPaths.getElement("inboxSearchInput")));
		System.out.println(testData.get("Ref No"));
		for (int i = 0; i <= 500; i++) {

			try {
				
				javascriptHelper
						.executeScriptWithWebElement(livingExpensesJsPaths.getElement("inboxSearchInput"))
						.sendKeys(testData.get("Ref No"));

				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("user click the entitle button under inbox in uls application")
	public void user_click_the_entitle_button_under_inbox_in_uls_application() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("inboxEntitleBtn")));
		
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper
						.executeScriptWithWebElement(livingExpensesJsPaths.getElement("inboxEntitleBtn"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	@And("user click on the living expenses under app data entry stage")
	public void user_click_on_the_living_expenses_under_app_data_entry_stage() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
			//	.executeScriptWithWebElement(livingExpensesJsPaths.getElement("LivingExpensesTab")));
		
		for (int i = 0; i <= 1000; i++) {
			try {

				javascriptHelper.JSEClick(javascriptHelper
								.executeScriptWithWebElement(livingExpensesJsPaths.getElement("LivingExpensesTab")));
						
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	

	@And("user click on the add button under living expenses tab at app data entry stage")
	public void user_click_on_the_add_button_under_living_expenses_tab_at_app_data_entry_stage() throws IOException {
		//waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
			//	.executeScriptWithWebElement(livingExpensesJsPaths.getElement("addBtn")));
		
		for (int i = 0; i <= 1000; i++) {
			try {
				javascriptHelper.JSEClick(javascriptHelper
						.executeScriptWithWebElement(livingExpensesJsPaths.getElement("addBtn")));

				/*
				 * javascriptHelper
				 * .executeScriptWithWebElement(livingExpensesJsPaths.getElement("addBtn"))
				 * .click();
				 */
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	
	@And("user verify the field are present under living expenses tab at app data entry stage")
	public void user_verify_the_field_are_present_under_living_expenses_tab_at_app_data_entry_stage() throws IOException {
		
		//save button
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("saveBtn")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("saveBtn")).isDisplayed());
		
		System.out.println("save Button is visible");
		
		
		//Back Button 
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("backbtn")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("backbtn")).isDisplayed());
		
		System.out.println("Back Button is visible");
		
		
		
		
		
		
		
		/*
		 * //Sr No waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
		 * .executeScriptWithWebElement(livingExpensesJsPaths.getElement("")));
		 * Assert.assertTrue(javascriptHelper
		 * .executeScriptWithWebElement(livingExpensesJsPaths.getElement("")).
		 * isDisplayed());
		 * 
		 * System.out.println("Sr No is visible");
		 */
		
		
		
		//click on add button of Expenses information
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("expensesInformationAddBtn")));
		
		javascriptHelper.JSEClick(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("expensesInformationAddBtn")));
		
		
		
		
		//Expense Info Delete Button
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("deleteBtn")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("deleteBtn")).isDisplayed());

		System.out.println("Expense Information Delete Button is visible");
				
		
		
		
		
		//Expense Type
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("expenseTypeDrpDwn")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("expenseTypeDrpDwn")).isDisplayed());

		System.out.println("Expense Type is visible");
		
		
		
		//Amount
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("amountUpDownKey")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("amountUpDownKey")).isDisplayed());

		System.out.println("Amount is visible");
		
		
		//Expected cost of living
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("expectedCostsOfLiving")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("expectedCostsOfLiving")).isDisplayed());

		System.out.println("Expected cost of living is visible");
		
		
		
		//Min cost of living
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("minimumLivingCost1")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("minimumLivingCost1")).isDisplayed());

		System.out.println("Min cost of living is visible");
		
		
		

		//Min cost of living
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("minimumLivingCost1")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("minimumLivingCost1")).isDisplayed());

		System.out.println("Min cost of living is visible");
		
		
		
		//Total cost of living
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("totalLivingExpenseTextField")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("totalLivingExpenseTextField")).isDisplayed());

		System.out.println("Total cost of living is visible");
		
		
		
		//Accredited cost
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("accreditedCoststextField")));
		Assert.assertTrue(javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("accreditedCoststextField")).isDisplayed());

		System.out.println("Accredited Cost");
		
		
		
		}
	
	
	@And("user give input in customer name field under living expenses at app data entry stage")
	public void user_give_input_in_customer_name_field_under_living_expenses_at_app_data_entry_stage() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("customerNameDrpDwn")));
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(livingExpensesJsPaths.getElement("customerNameDrpDwn")).isDisplayed());
				javascriptHelper
						.executeScriptWithWebElement(livingExpensesJsPaths.getElement("customerNameDrpDwn"))
						.click();
 
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
 
		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Customer Name"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}	
	}
	
	@And("user give input in is house employed field under living expense tab at app data entry stage")
	public void user_give_input_in_is_house_employed_field_under_living_expense_tab_at_app_data_entry_stage() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("isSpouseEmployedDrpDwn")));
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(livingExpensesJsPaths.getElement("isSpouseEmployedDrpDwn")).isDisplayed());
				javascriptHelper
						.executeScriptWithWebElement(livingExpensesJsPaths.getElement("isSpouseEmployedDrpDwn"))
						.click();
 
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
 
		try {
			clicksAndActionsHelper.jsSelectUsingText(testData.get("Spouse Employed"));
		} catch (Exception e) {
			// TODO: handle exception
			Assert.fail(e.getMessage());
		}	
	}
	
	
	@And("user give input in spouse salary under living expense tab at app data entry stage")
	public void user_give_input_in_spouse_salary_under_living_expense_tab_at_app_data_entry_stage() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("spouseSalaryTextbox")));
		
		javascriptHelper
		.executeScriptWithWebElement(livingExpensesJsPaths.getElement("spouseSalaryTextbox"))
		.sendKeys(testData.get("Spouse Salary"));
	}
	
	
	@And("user give input in living expense under living expense tab at app data entry stage")
	public void user_give_input_in_living_expense_under_living_expense_tab_at_app_data_entry_stage() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("livingAllowance")));
		
		javascriptHelper
		.executeScriptWithWebElement(livingExpensesJsPaths.getElement("livingAllowance"))
		.sendKeys(testData.get("Living Allowance"));
		
	}
	
	
	@And("user give input in expense type under living expense tab at app data entry stage")
	public void user_give_input_in_expense_type_under_living_expense_tab_at_app_data_entry_stage() throws IOException {
		
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("expenseTypeDrpDwn")));
		
		
		for (int i = 0; i <= 1000; i++) {
			try {
				// javascriptHelper.executeScriptWithWebElement(applicationDetailsJsPaths.getElement("productLabelField")).click();
				Assert.assertTrue(javascriptHelper.executeScriptWithWebElement(
						                         livingExpensesJsPaths.getElement("expenseTypeDrpDwn")).isDisplayed());
				
				javascriptHelper.executeScriptWithWebElement(
						             livingExpensesJsPaths.getElement("expenseTypeDrpDwn")).click();
				
				
				/*
				 * javascriptHelper.executeScriptWithWebElement(
				 * livingExpensesJsPaths.getElement("expenseTypeFoodOption")).click();
				 */
				
				
 
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
 
	}
	
	@And("user choose one option under expense type under living expense tab at app data entry stage")
	public void user_choose_one_option_under_expense_type_under_living_expense_tab_at_app_data_entry_stage() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("expenseTypeFoodOption")));
		
		
		for (int i = 0; i <= 1000; i++) {
			try {
						
				javascriptHelper.executeScriptWithWebElement(
						             livingExpensesJsPaths.getElement("expenseTypeFoodOption")).click();
				
				
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("user give input in amount type under living expense tab at app data entry stage")
	public void user_give_input_in_amount_type_under_living_expense_tab_at_app_data_entry_stage() throws IOException {
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("amountUpDownKey")));
		

		for (int i = 0; i <= 1000; i++) {
			try {
				
				javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("amountUpDownKey")).click();
				
				javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("amountUpDownKey"))
				.sendKeys(testData.get("Amount"));
				
				
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
		
		javascriptHelper
		.executeScriptWithWebElement(livingExpensesJsPaths.getElement("amountUpDownKey"))
		.sendKeys(testData.get("Amount"));
	}
	
	
	@And("user click on the save button under living expense tab at app data entry stage")
	public void user_click_on_the_save_button_under_living_expense_tab_at_app_data_entry_stage() throws IOException{
		waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
				.executeScriptWithWebElement(livingExpensesJsPaths.getElement("saveBtn")));
		
		
		for (int i = 0; i <= 1000; i++) {
			try {
						
				javascriptHelper.executeScriptWithWebElement(
						             livingExpensesJsPaths.getElement("saveBtn")).click();
				
				
				break;
			} catch (Exception e) {
				if (i == 1000) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	
	
	@And("user capture the post save confirmation message")
	public void user_capture_the_post_save_confirmation_message() throws IOException {
		
		//	waitHelper.waitForElementwithFluentwait(driver, javascriptHelper
			//		.executeScriptWithWebElement(livingExpensesJsPaths.getElement("successPopupMessage")));
			
			String xpath = livingExpensesJsPaths.getElement("successPopupMessage");
			System.out.println("xpath :" + xpath);
			
			
			for (int i = 0; i <= 1000; i++) {
				try {
							
					String actualConfirmationPopup = javascriptHelper.executeScriptWithWebElement(
							             livingExpensesJsPaths.getElement("successPopupMessage")).getAttribute("aria-label");
					
					
					System.out.println(actualConfirmationPopup);
					
					
					break;
				} catch (Exception e) {
					if (i == 1000) {
						Assert.fail(e.getMessage());
					}
				}
			}
	}
	
	
}
