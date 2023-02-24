package stepdefinitions;

import java.io.File;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CustomerEntityLayoutDebtOBJ;
import pageobjects.Transactions_ScreenOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.TransactionScreenTestDataType;

public class KULS_CustomerDebt extends BaseClass {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	TransactionScreenTestDataType Transactionjson = jsonConfig.getTransactionScreenListByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	CustomerEntityLayoutDebtOBJ Transaction = new CustomerEntityLayoutDebtOBJ(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00075\\Downloads\\UlsTestDataDesign.xlsx","CustomerDeptDetails","Data Set ID");
	Map<String, String> testdata;
	
	@And("^User search the record from the system in customer debt$")
	public void user_search_the_record_from_the_system_in_customer_debt() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.InboxSearchIcon(), 60, 5);
		Transaction.InboxSearchIcon().click();

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.searchsentkeys(), 60, 5);
		Transaction.searchsentkeys().sendKeys("APPDATAENT");

	}

	@And("^User click the action edit icon in in customer debt$")
	public void user_click_the_action_edit_icon_in_in_customer_debt() throws Throwable {

		// help.waitForElementToVisibleWithFluentWait(driver,
		// Transaction.inboxediticon(), 60, 5);
		Thread.sleep(1000);
		for (int i = 0; i < 20; i++) {
			try {
				Transaction.inboxediticon().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User click the customer financials tab in customer debt$")
	public void user_click_the_customer_financials_tab_in_customer_debt() throws Throwable {

		for (int i = 0; i < 50; i++) {
			try {
				// help.waitForElementToVisibleWithFluentWait(driver,
				// Transaction.CustomerFinancialsTab(), 60, 5);
				Transaction.CustomerFinancialsTab().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					e.getMessage();
				}
			}
		}
	}
	@And("^User click the customer financials tab in customer debt1$")
	public void user_click_the_customer_financials_tab_in_customer_debt1() throws Throwable {

		for (int i = 0; i < 50; i++) {
			try {
				// help.waitForElementToVisibleWithFluentWait(driver,
				// Transaction.CustomerFinancialsTab(), 60, 5);
				Transaction.CustomerFinancialsTab().click();
				break;
			} catch (Exception e) {
				if (i == 50) {
					e.getMessage();
				}
			}
		}
	}

	@And("^User click the customer personal information action edit icon in customer debt$")
	public void user_click_the_customer_personal_information_action_edit_icon_in_customer_debt() throws Throwable {

		// help.waitForElementToVisibleWithFluentWait(driver,
		// Transaction.CustomerDebtActionEditIcon(), 60, 5);
		for (int i = 0; i < 20; i++) {
			try {
				Transaction.CustomerDebtActionEditIcon().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User click the financial commitment add icon in customer debt$")
	public void user_click_the_financial_commitment_add_icon_in_customer_debt() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.FinanacialCommitmentsAddIcon(), 60, 5);
		Transaction.FinanacialCommitmentsAddIcon().click();

	}

	@And("^User enter the Account Number in customer debt$")
	public void user_enter_the_account_number_in_customer_debt() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDebt_AccountNumber(), 60, 5);
		Transaction.CustomerDebt_AccountNumber().click();
		Transaction.CustomerDebt_AccountNumber().sendKeys(testdata.get("AccountNumber"));

	}

	@And("^User enter the Interest Rate in customer debt$")
	public void user_enter_the_interest_rate_in_customer_debt() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDebt_InterestRate(), 60, 5);
		Transaction.CustomerDebt_InterestRate().click();
		Transaction.CustomerDebt_InterestRate().sendKeys(testdata.get("InterestRate"));

	}

	@And("^User enter the currrent principal amount in customer debt$")
	public void user_enter_the_currrent_principal_amount_in_customer_debt() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDebt_CurrentPrincipalBalance(), 60, 5);
		Transaction.CustomerDebt_CurrentPrincipalBalance().click();
		Transaction.CustomerDebt_CurrentPrincipalBalance().sendKeys(testdata.get("CurrentPrincipalBalance"));

	}

	@And("^User verify the impact when user keep any mandatory field blank and click on save button in customer debt$")
	public void user_verify_the_impact_when_user_keep_any_mandatory_field_blank_and_click_on_save_button_in_customer_debt()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDebt_FinancialInstitutionError(), 60, 5);
		Assert.assertEquals("Required field", Transaction.CustomerDebt_FinancialInstitutionError().getText());
		System.out.println(Transaction.CustomerDebt_FinancialInstitutionError().getText());

	}

	@And("^User verify the impact when user enter characters value in numeric field in customer debt$")
	public void user_verify_the_impact_when_user_enter_characters_value_in_numeric_field_in_customer_debt()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDebt_AccountNumberError(), 60, 5);
		Assert.assertEquals("Positive Integer Allowed", Transaction.CustomerDebt_AccountNumberError().getText());
		System.out.println(Transaction.CustomerDebt_AccountNumberError().getText());

	}

	@And("^User verify the impact when user enters only characters value in any field in customer debt$")
	public void user_verify_the_impact_when_user_enters_only_characters_value_in_any_field_in_customer_debt()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.CustomerDebt_CurrentPrincipalBalanceError(), 60,
				5);
		Assert.assertEquals("Positive Integer Allowed",
				Transaction.CustomerDebt_CurrentPrincipalBalanceError().getText());
		System.out.println(Transaction.CustomerDebt_CurrentPrincipalBalanceError().getText());

	}

	// Valitation

	@And("^User verify the Customer Debt details List view$")
	public void user_verify_the_customer_debt_details_list_view() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ListView_FinancialInstitution(), 60, 5);
		Transaction.ListView_FinancialInstitution().isDisplayed();
		System.out.println("Financial Institution is displayed");

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ListView_InstallmentAmount(), 60, 5);
		Transaction.ListView_InstallmentAmount().isDisplayed();
		System.out.println("InstallAmount is displayed");

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ListView_CurrentPrincipalBalance(), 60, 5);
		Transaction.ListView_CurrentPrincipalBalance().isDisplayed();
		System.out.println("Current Principal Balance is displayed");

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ListView_LoanAmount(), 60, 5);
		Transaction.ListView_LoanAmount().isDisplayed();
		System.out.println("Loan Amount is displayed");

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ListView_NextDueDate(), 60, 5);
		Transaction.ListView_NextDueDate().isDisplayed();
		System.out.println("Next Due Date is displayed");

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ListView_BalanceOutstanding(), 60, 5);
		Transaction.ListView_BalanceOutstanding().isDisplayed();
		System.out.println("Balance OutStanding is displayed");

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ListView_Tenure(), 60, 5);
		Transaction.ListView_Tenure().isDisplayed();
		System.out.println("Tenure is displayed");

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.ListView_Currency(), 60, 5);
		Transaction.ListView_Currency().isDisplayed();
		System.out.println("Currency is displayed");

//    	help.waitForElementToVisibleWithFluentWait(driver, Transaction.ListView_Status(), 60, 5);
//    	Transaction.ListView_Status().isDisplayed();
//    	System.out.println("Status is displayed");

	}

	@And("^User verify the Values in List view should be non editable in customer debt$")
	public void user_verify_the_values_in_list_view_should_be_non_editable_in_customer_debt() throws Throwable {

		String xpath = "(//tr[1]/td[3]/p-celleditor[1]/span[1])[4]";
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified Financial Institution field is not editable only displayable");
		}

	}

	@And("^User verify the functionality of Search box with matching data in customer debt$")
	public void user_verify_the_functionality_of_search_box_with_matching_data_in_customer_debt() throws Throwable {

		seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.searchIcon());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.searchIcon(), 30, 2);
		for (int i = 0; i < 20; i++) {
			try {

				Transaction.searchIcon().click();
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						Transaction.productViewSearchText(), 30, 2);
				Transaction.productViewSearchText().sendKeys(testdata.get("SearchMatch"));

				String xpath = "(//tr[1]/td[3]/p-celleditor[1]/span[1])[4]";
				String FinancialInstitution = null;
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);

				FinancialInstitution = driver.findElement(By.xpath(xpath)).getText();

				System.out.println(FinancialInstitution);

				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				Transaction.productViewSearchTextCloseButton(), 30, 2);
		Transaction.productViewSearchTextCloseButton().click();

	}

	@And("^User verify the functionality of Search box with mismatch data in customer debt$")
	public void user_verify_the_functionality_of_search_box_with_mismatch_data_in_customer_debt() throws Throwable {

		for (int i = 0; i < 20; i++) {
			try {
				Transaction.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				Transaction.productViewSearchText(), 30, 2);
		Transaction.productViewSearchText().sendKeys(testdata.get("SearchMismatch"));
		Thread.sleep(1000);
		String xpath = "//ion-title[contains(text(),'Financial Commitments')]//parent::ion-card-header//following-sibling::ion-card-content//child::kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span";
		for (int i = 0; i < 200; i++) {
			try {

				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				break;
			} catch (NoSuchElementException e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				Transaction.productViewSearchTextCloseButton(), 30, 2);
		Transaction.productViewSearchTextCloseButton().click();

	}

	@And("^user click on back button in Application$")
	public void user_click_on_back_button_in_application() throws Throwable {
		Thread.sleep(1000);
		seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.customerDeptDetails_Backbtn());

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.customerDeptDetails_Backbtn(), 60, 5);
		Transaction.customerDeptDetails_Backbtn().click();
		
	}

	@And("^User click the inbox mail icon in application detail offerings$")
	public void user_click_the_inbox_mail_icon_in_application_detail_offerings() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, Transaction.mailicon(), 60, 5);
		Transaction.mailicon().click();

	}

	@And("^User verify the functionality of Export to PDF button in customer debt$")
	public void user_verify_the_functionality_of_export_to_pdf_button_in_customer_debt() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.exportIcon(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				Transaction.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.pdfOption(), 60, 3);
		// Assert.assertEquals(project.pdfOption().isDisplayed(), true);
		Transaction.pdfOption().click();
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

	@And("^User verify the functionality of Export to Excel button in customer debt$")
	public void user_verify_the_functionality_of_export_to_excel_button_in_customer_debt() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.exportIcon(),60, 2);
				Transaction.exportIcon().click();

				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, Transaction.xlsOption(),60, 3);
				Transaction.xlsOption().click();
				break;
			} catch (Exception e) {
				if (i==50) {
					{
						Assert.fail(e.getMessage());
					}
				}
			}
		}

	}

	@And("^Verify user is able to change the status of Debt record from Active to Inactive in customer debt$")
	public void verify_user_is_able_to_change_the_status_of_debt_record_from_active_to_inactive_in_customer_debt()
			throws Throwable {

		// help.waitForElementToVisibleWithFluentWait(driver,
		// Transaction.StatusButton(), 60, 5);
		for (int i = 0; i < 50; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.StatusButton());
				String Status = Transaction.StatusButton().getAttribute("aria-checked");

				if (Status.equalsIgnoreCase("true")) {

					System.out.println("Active Status");

				} else {

					System.out.println("Deactive status");
				}

				help.waitForElementToVisibleWithFluentWait(driver, Transaction.StatusButton(), 60, 5);
				Transaction.StatusButton().click();
				break;
			}

			catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User click the Action edit icon under financial commitments in customer debt$")
	public void user_click_the_action_edit_icon_under_financial_commitments_in_customer_debt() throws Throwable {

		for (int i = 0; i < 30; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.CustomerDebt_ActionEdit());
				Transaction.CustomerDebt_ActionEdit().click();
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^User click the save icon in customer debt$")
	public void user_click_the_save_icon_in_customer_debt() throws Throwable {
		for (int i = 0; i < 40; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.UpdateSave());
				help.waitForElementToVisibleWithFluentWait(driver, Transaction.UpdateSave(), 60, 5);
				Transaction.UpdateSave().click();
				break;
			} catch (Exception e) {
				if (i==40) {
					Assert.fail(e.getMessage());
				}
			}
		}


	}

	@And("^Verify user is able to change the status of Debt record from Inctive to Active in customer debt$")
	public void verify_user_is_able_to_change_the_status_of_debt_record_from_inctive_to_active_in_customer_debt()
			throws Throwable {

		for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(Transaction.StatusButton());
				String Status = Transaction.StatusButton().getAttribute("aria-checked");

				if (Status.equalsIgnoreCase("true")) {

					System.out.println("Active Status");

				} else {

					System.out.println("Deactive status");
				}

				help.waitForElementToVisibleWithFluentWait(driver, Transaction.StatusButton(), 60, 5);
				Transaction.StatusButton().click();
				break;
			}

			catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user update the exceldata value for CustomerDept Verifying$")
	public void user_update_the_exceldata_value_for_CustomerDept_Verifying() throws Throwable{
		testdata=excelData.getTestdata("AT-CLCD-002_D1");
	}
	@And("^user update the exceldata value for CustomerDept Listview$")
	public void user_update_the_exceldata_value_for_CustomerDept_listview() throws Throwable{
		testdata=excelData.getTestdata("AT-CLCD-005_D1");
	}
}
