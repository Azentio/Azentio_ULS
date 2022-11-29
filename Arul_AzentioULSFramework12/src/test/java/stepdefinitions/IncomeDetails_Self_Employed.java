package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.IncomeDetailsOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;

public class IncomeDetails_Self_Employed extends BaseClass {

	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper help = new WaitHelper(driver);
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	IncomeDetailsOBJ income = new IncomeDetailsOBJ(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign1.xlsx",
			"IncomeDetailsTestData", "Data Set ID");
	Map<String, String> testData;

	@And("^User search the record from the system in income details$")
	public void user_search_the_record_from_the_system_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-001_D1");
		help.waitForElementToVisibleWithFluentWait(driver, income.InboxSearchIcon(), 60, 5);
		income.InboxSearchIcon().click();

		help.waitForElementToVisibleWithFluentWait(driver, income.searchsentkeys(), 60, 5);
		income.searchsentkeys().sendKeys(testData.get("Inbox Search"));

	}

	@And("^User click the income details add icon$")
	public void user_click_the_income_details_add_icon() throws Throwable {

		//seleniumactions.getJavascriptHelper().scrollIntoView(income.IncomeAddIcon());
		help.waitForElementToVisibleWithFluentWait(driver, income.IncomeAddIcon(), 60, 5);
		income.IncomeAddIcon().click();

	}

	@And("^User verify the Income screen under customer financials section in income details$")
	public void user_verify_the_income_screen_under_customer_financials_section_in_income_details() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, income.NewSave(), 30, 2);
		Assert.assertTrue(income.NewSave().isDisplayed(), "Save icon displayed not in income details screen");

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, income.BackArrow(), 30, 2);
		Assert.assertTrue(income.BackArrow().isDisplayed(), "Back button icon displayed not in income details screen");

	}

	@And("^User select the income in income details$")
	public void user_select_the_income_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-002_D1");

		for (int i = 0; i < 20; i++) {
			try {
				income.IncomeDropDown().click();
				break;
			} catch (Exception e) {

			}
		}

		Thread.sleep(2000);

		String xpath = "//ion-label[contains(text(),'" + testData.get("Income") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select the frequency in income details$")
	public void user_select_the_frequency_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-002_D1");

		for (int i = 0; i < 20; i++) {
			try {
				income.FrequencyDropDown().click();
				break;
			} catch (Exception e) {

			}
		}

		Thread.sleep(2000);

		String xpath = "//ion-label[contains(text(),'" + testData.get("Frequency")
				+ "')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User enter the Amount in income details$")
	public void user_enter_the_amount_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-002_D1");
		help.waitForElementToVisibleWithFluentWait(driver, income.IncomeAmount(), 60, 5);
		income.IncomeAmount().click();
		income.IncomeAmount().clear();
		income.IncomeAmount().sendKeys(testData.get("Income Amount"));

	}

	@And("^User verify the functionality of save button post entering all valid details and clicking on save button in income details$")
	public void user_verify_the_functionality_of_save_button_post_entering_all_valid_details_and_clicking_on_save_button_in_income_details()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.NewSave(), 60, 5);
		income.NewSave().click();

	}

	@And("^User verify system display the confirmation message post clicking on save button in income details$")
	public void user_verify_system_display_the_confirmation_message_post_clicking_on_save_button_in_income_details()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.SaveSuccessMsg(), 60, 5);
		String Success = income.SaveSuccessMsg().getText();
		System.out.println(Success);

	}

	@And("^User verify the functionality of Back button in income details$")
	public void user_verify_the_functionality_of_back_button_in_income_details() throws Throwable {

		// help.waitForElementToVisibleWithFluentWait(driver, income.BackArrow(), 60,
		// 5);
		for (int i = 0; i < 20; i++) {
			try {
				income.BackArrow().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User verify the field Employment Type Field should be auto populated from employment details screen$")
	public void user_verify_the_field_employment_type_field_should_be_auto_populated_from_employment_details_screen()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.EmploymentType(), 60, 5);
		String Message = income.EmploymentType().getAttribute("ng-reflect-model");
		System.out.println(Message);

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,income.NewSave(),30,
		// 2);
		Assert.assertEquals(Message, "Self Employed");

	}

	@And("^User enter the Defined percentage in income details$")
	public void user_enter_the_defined_percentage_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-003_D1");
		help.waitForElementToVisibleWithFluentWait(driver, income.DefinedPercentage(), 60, 5);
		income.DefinedPercentage().click();
		income.DefinedPercentage().clear();
		income.DefinedPercentage().sendKeys(testData.get("Defined Percentage"));

	}

	@And("^User enter the Adjusted percentage in income details$")
	public void user_enter_the_adjusted_percentage_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-003_D1");
		help.waitForElementToVisibleWithFluentWait(driver, income.AdjustedPercentage(), 60, 5);
		income.AdjustedPercentage().click();
		income.AdjustedPercentage().clear();
		income.AdjustedPercentage().sendKeys(testData.get("Adjusted Percentage"));
	}

	@And("^User select financial year in income details$")
	public void user_select_financial_year_in_income_details() throws Throwable {

		// testData = excelData.getTestdata("AT-RSE-003_D1");
		help.waitForElementToVisibleWithFluentWait(driver, income.FinancialYearCalender(), 60, 5);
		income.FinancialYearCalender().click();

		help.waitForElementToVisibleWithFluentWait(driver, income.FinancialYearCalender_Year(), 60, 5);
		income.FinancialYearCalender_Year().click();

	}

	@And("^User select filling date in income details$")
	public void user_select_filling_date_in_income_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.FillingDate(), 60, 5);
		income.FillingDate().click();

		help.waitForElementToVisibleWithFluentWait(driver, income.FillingDate_Date(), 60, 5);
		income.FillingDate_Date().click();

	}

	@And("^User verify the auto populated value in Amount Considered field in income details$")
	public void user_verify_the_auto_populated_value_in_amount_considered_field_in_income_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.AmountConsidered(), 60, 5);
		income.AmountConsidered().click();
		String AmountConsidered = income.AmountConsidered().getAttribute("ng-reflect-model");
		System.out.println(AmountConsidered);

	}

	@And("^User click the add button in income details$")
	public void user_click_the_add_button_in_income_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.AddIncome(), 60, 5);
		income.AddIncome().click();

	}

	@And("^User select the income1 in income details$")
	public void user_select_the_income1_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-004_D1");

		for (int i = 0; i < 20; i++) {
			try {
				income.IncomeDropDown1().click();
				break;
			} catch (Exception e) {

			}
		}

		Thread.sleep(2000);

		String xpath = "//ion-label[contains(text(),'" + testData.get("Income") + "')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select the frequency1 in income details$")
	public void user_select_the_frequency1_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-004_D1");

		for (int i = 0; i < 20; i++) {
			try {
				income.FrequencyDropDown1().click();
				break;
			} catch (Exception e) {

			}
		}

		Thread.sleep(2000);

		String xpath = "//ion-label[contains(text(),'" + testData.get("Frequency")
				+ "')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
	}

	@And("^User enter the Amount1 in income details$")
	public void user_enter_the_amount1_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-004_D1");
		help.waitForElementToVisibleWithFluentWait(driver, income.IncomeAmount1(), 60, 5);
		income.IncomeAmount1().click();
		income.IncomeAmount1().clear();
		income.IncomeAmount1().sendKeys(testData.get("Income Amount"));

	}

	@And("^User enter the Defined percentage1 in income details$")
	public void user_enter_the_defined_percentage1_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-004_D1");
		help.waitForElementToVisibleWithFluentWait(driver, income.DefinedPercentage1(), 60, 5);
		income.DefinedPercentage1().click();
		income.DefinedPercentage1().clear();
		income.DefinedPercentage1().sendKeys(testData.get("Defined Percentage"));

	}

	@And("^User enter the Adjusted percentage1 in income details$")
	public void user_enter_the_adjusted_percentage1_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-004_D1");
		help.waitForElementToVisibleWithFluentWait(driver, income.AdjustedPercentage1(), 60, 5);
		income.AdjustedPercentage1().click();
		income.AdjustedPercentage1().clear();
		income.AdjustedPercentage1().sendKeys(testData.get("Adjusted Percentage"));

	}

	@And("^User verify the auto populated value in Amount Considered1 field in income details$")
	public void user_verify_the_auto_populated_value_in_amount_considered1_field_in_income_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.AmountConsidered1(), 60, 5);
		income.AmountConsidered1().click();
		String AmountConsidered = income.AmountConsidered1().getAttribute("ng-reflect-model");
		System.out.println(AmountConsidered);

	}

	@And("^User verify the auto populated value in Total income field in income details$")
	public void user_verify_the_auto_populated_value_in_total_income_field_in_income_details() throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.TotalIncome(), 60, 5);
		income.TotalIncome().click();
		String TotalIncome = income.TotalIncome().getAttribute("ng-reflect-model");
		System.out.println(TotalIncome);

	}

	@And("^User verify the auto populated value in Total income Considered field in income details$")
	public void user_verify_the_auto_populated_value_in_total_income_considered_field_in_income_details()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.TotalIncomeConsidered(), 60, 5);
		income.TotalIncomeConsidered().click();
		String TotalIncomeConsidered = income.TotalIncomeConsidered().getAttribute("ng-reflect-model");
		System.out.println(TotalIncomeConsidered);

	}

	@And("^User select the deduction in income details$")
	public void user_select_the_deduction_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-005_D1");

		seleniumactions.getJavascriptHelper().scrollToElemet(income.Deduction());

		for (int i = 0; i < 20; i++) {
			try {
				income.Deduction().click();
				break;
			} catch (Exception e) {

			}
		}

		Thread.sleep(2000);

		String xpath = "//ion-label[contains(text(),'" + testData.get("Deduction")
				+ "')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select the deduction frequency in income details$")
	public void user_select_the_deduction_frequency_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-005_D1");

		for (int i = 0; i < 20; i++) {
			try {
				income.Deduction_Frequency().click();
				break;
			} catch (Exception e) {

			}
		}

		Thread.sleep(2000);

		String xpath = "//ion-label[contains(text(),'" + testData.get("Deduction Frequency")
				+ "')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User enter the deduction Amt in income details$")
	public void user_enter_the_deduction_amt_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-005_D1");

		help.waitForElementToVisibleWithFluentWait(driver, income.Deduction_Amt(), 60, 5);
		income.Deduction_Amt().click();
		income.Deduction_Amt().clear();
		income.Deduction_Amt().sendKeys(testData.get("Deduction Amt"));

	}

	@And("^User enter the deduction Def in income details$")
	public void user_enter_the_deduction_def_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-005_D1");

		help.waitForElementToVisibleWithFluentWait(driver, income.Deduction_Def(), 60, 5);
		income.Deduction_Def().click();
		//income.Deduction_Def().clear();
		income.Deduction_Def().sendKeys(testData.get("Deduction Def"));

	}

	@And("^User enter the deduction Adj in income details$")
	public void user_enter_the_deduction_adj_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-005_D1");

		help.waitForElementToVisibleWithFluentWait(driver, income.Deduction_Adj(), 60, 5);
		income.Deduction_Adj().click();
		//income.Deduction_Adj().clear();
		income.Deduction_Adj().sendKeys(testData.get("Deduction Adj"));

	}

	@And("^User verify the auto populated value in Deduction Considered field in income details$")
	public void user_verify_the_auto_populated_value_in_deduction_considered_field_in_income_details()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.Deduction_Considered(), 60, 5);
		income.Deduction_Considered().click();
		String DeductionConsidered = income.Deduction_Considered().getAttribute("ng-reflect-model");
		System.out.println(DeductionConsidered);

	}

	@And("^User select the deduction1 in income details$")
	public void user_select_the_deduction1_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-005_D1");

		for (int i = 0; i < 20; i++) {
			try {
				income.Deduction1().click();
				break;
			} catch (Exception e) {

			}
		}

		Thread.sleep(2000);

		String xpath = "//ion-label[contains(text(),'" + testData.get("Deduction1")
				+ "')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User select the deduction frequency1 in income details$")
	public void user_select_the_deduction_frequency1_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-005_D1");

		for (int i = 0; i < 20; i++) {
			try {
				income.Deduction_Frequency().click();
				break;
			} catch (Exception e) {

			}
		}

		Thread.sleep(2000);

		String xpath = "//ion-label[contains(text(),'" + testData.get("Deduction Frequency1")
				+ "')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^User enter the deduction Amt1 in income details$")
	public void user_enter_the_deduction_amt1_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-005_D1");

		help.waitForElementToVisibleWithFluentWait(driver, income.Deduction_Amt1(), 60, 5);
		income.Deduction_Amt1().click();
		income.Deduction_Amt1().clear();
		income.Deduction_Amt1().sendKeys(testData.get("Deduction Amt1"));

	}

	@And("^User enter the deduction Def1 in income details$")
	public void user_enter_the_deduction_def1_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-005_D1");

		help.waitForElementToVisibleWithFluentWait(driver, income.Deduction_Def1(), 60, 5);
		income.Deduction_Def1().click();
		//income.Deduction_Def1().clear();
		income.Deduction_Def1().sendKeys(testData.get("Deduction Def1"));

	}

	@And("^User enter the deduction Adj1 in income details$")
	public void user_enter_the_deduction_adj1_in_income_details() throws Throwable {

		testData = excelData.getTestdata("AT-RSE-005_D1");

		help.waitForElementToVisibleWithFluentWait(driver, income.Deduction_Adj1(), 60, 5);
		income.Deduction_Adj1().click();
		//income.Deduction_Adj1().clear();
		income.Deduction_Adj1().sendKeys(testData.get("Deduction Adj1"));

	}

	@And("^User verify the auto populated value in Deduction Considered1 field in income details$")
	public void user_verify_the_auto_populated_value_in_deduction_considered1_field_in_income_details()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.Deduction_Considered1(), 60, 5);
		seleniumactions.getJavascriptHelper().scrollIntoView(income.Deduction_Considered1());
		income.Deduction_Considered1().click();
		String DeductionConsidered1 = income.Deduction_Considered1().getAttribute("ng-reflect-model");
		System.out.println(DeductionConsidered1);

	}

	@And("^User verify the auto populated value in Total deduction field when there are multiple income in income screen$")
	public void user_verify_the_auto_populated_value_in_total_deduction_field_when_there_are_multiple_income_in_income_screen()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.TotalDeduction(), 60, 5);
		income.TotalDeduction().click();
		String TotalDeduction = income.TotalDeduction().getAttribute("ng-reflect-model");
		System.out.println(TotalDeduction);

	}

	@And("^User verify the auto populated value in Total deduction Considered field when there are multiple income in income screen$")
	public void user_verify_the_auto_populated_value_in_total_deduction_considered_field_when_there_are_multiple_income_in_income_screen()
			throws Throwable {

		help.waitForElementToVisibleWithFluentWait(driver, income.TotalDeductionConsidered(), 60, 5);
		income.TotalDeductionConsidered().click();
		String TotalDeductionConsidered = income.TotalDeductionConsidered().getAttribute("ng-reflect-model");
		System.out.println(TotalDeductionConsidered);

	}

}
