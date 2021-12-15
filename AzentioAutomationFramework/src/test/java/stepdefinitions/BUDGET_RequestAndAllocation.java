package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.ConfigFileReader;
import dataProvider.JsonReader;
import helper.DropDownHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import resources.BaseClass;
import testDataType.BUDGET_RequestAndAllocationTestDataType;
import pageobjects.BUDGET_RequestAndAllocationObj;

public class BUDGET_RequestAndAllocation extends BaseClass { 

	

		WebDriver driver = BaseClass.driver;
		JsonReader jsonReader = new JsonReader();
		BUDGET_RequestAndAllocationObj  requestAndAllocation;
		DropDownHelper dhelper;
		
		BUDGET_RequestAndAllocationTestDataType data;

		ConfigFileReader configFileReader = new ConfigFileReader();
		 

		@And("^Click the Dirction icon$")
		public void click_the_dirction_icon() {
			requestAndAllocation.DirctionIcon().click();
		}

		@When("^Select the budget Field$")
		public void select_the_budget_field() {
			requestAndAllocation.Budget().click();
		}

		@And("^Click the Budget request & allocation Eye icon$")
		public void click_the_budget_request_allocation_eye_icon() {
			requestAndAllocation.Budgeteye().click();
		}

		@And("^Curser click the add icon$")
		public void curser_click_the_add_icon() {
			requestAndAllocation.addicon().click();
		}

		@And("^Select budget code$")
		public void select_budget_code() {
			dhelper = new DropDownHelper(driver);
			dhelper.SelectUsingVisibleText(requestAndAllocation.Budgetcode(), data.Budgetcode);
		}

		@And("^Select budget year$")
		public void select_budget_year() {
			dhelper.SelectUsingVisibleText(requestAndAllocation.Budgetyear(), data.Budgetyear);
		}

		@And("^Select budget branch$")
		public void select_budget_branch() {
			dhelper.SelectUsingVisibleText(requestAndAllocation.Budgetbranch(), data.Branch);
			requestAndAllocation.branchOK().click();
		}

		@Then("^Enter budget amount$")
		public void enter_budget_amount() {
			String budgettype = requestAndAllocation.Budgettype().getText();
			String before_xpath = "//datatable-body-cell[2]/div/app-kub-currency[@id='";
			String after_xpath = "']";
			String before_xpath_for_remark = "//datatable-body-cell[3]/div/input[@id='"; // datatable-body-cell[3]/div/input[@id='3']
			String after_xpath_for_remark = "']";
			
			if (budgettype.equalsIgnoreCase("Yearly")) {
				String budtype = "Yearly";
				data = new BUDGET_RequestAndAllocationTestDataType();
				data = jsonReader.getBudtypeByName(budtype);
				requestAndAllocation.Budgetyear().sendKeys(data.BudgetAmount); // budreq.Budgetyear().sendKeys("10000");
				requestAndAllocation.Budremark().sendKeys("Ok");
			} else if (budgettype.equalsIgnoreCase("Monthly")) {

				for (int i = 0; i <= 11; i++) {
					WebElement budget_amount = driver.findElement(By.xpath(before_xpath + i + after_xpath));
					WebElement budget_remark = driver
							.findElement(By.xpath(before_xpath_for_remark + i + after_xpath_for_remark));
					if (budget_amount.isEnabled() && budget_remark.isEnabled()) {
						budget_amount.sendKeys("100000");
						budget_remark.sendKeys("Ok");
					}
				}

				/*
				 * years = new Monthlyobj(driver); years.mon1().sendKeys("1000");
				 * years.mon2().sendKeys("1000"); years.mon3().sendKeys("1000");
				 * years.mon4().sendKeys("1000"); years.mon5().sendKeys("1000");
				 * years.mon6().sendKeys("1000"); years.mon7().sendKeys("1000");
				 * years.mon8().sendKeys("1000"); years.mon9().sendKeys("1000");
				 * years.mon10().sendKeys("1000"); years.mon11().sendKeys("1000");
				 * years.mon12().sendKeys("1000");
				 */
			} else if (budgettype.equalsIgnoreCase("Quaterly")) {

				for (int i = 0; i <= 3; i++) {
					WebElement budget_amount = driver.findElement(By.xpath(before_xpath + i + after_xpath));
					WebElement budget_remark = driver
							.findElement(By.xpath(before_xpath_for_remark + i + after_xpath_for_remark));
					if (budget_amount.isEnabled() && budget_remark.isEnabled()) {
						budget_amount.sendKeys("100000");
						budget_remark.sendKeys("Ok");
					}

				}
				/*
				 * years.Quar0().sendKeys("1000"); years.Quar1().sendKeys("1000");
				 * years.Quar2().sendKeys("1000"); years.Quar3().sendKeys("1000");
				 */
			} else if (budgettype.equalsIgnoreCase("Halfyearly")) {
				for (int i = 0; i <= 1; i++) {
					WebElement budget_amount = driver.findElement(By.xpath(before_xpath + i + after_xpath));
					WebElement budget_remark = driver
							.findElement(By.xpath(before_xpath_for_remark + i + after_xpath_for_remark));
					if (budget_amount.isEnabled() && budget_remark.isEnabled()) {
						budget_amount.sendKeys("100000");
						budget_remark.sendKeys("Ok");
					}

				}
				/*
				 * years.Hy1().sendKeys("1000"); years.Hy2().sendKeys("1000");
				 */
			}
		}

		@And("^Select currency$")
		public void select_currency() throws Throwable {
			dhelper.SelectUsingVisibleText(requestAndAllocation.amountcurr(), data.Currency);
		}

		@And("^Click the save button$")
		public void click_the_save_button() throws Throwable {
			requestAndAllocation.AllowSave().click();
		}

		@And("^Click the action button in table$")
		public void click_the_action_button_in_table() {
			data = new BUDGET_RequestAndAllocationTestDataType();
			String befr_action = "//span[contains(text(),'";
			String aftr_action = "')]/ancestor::datatable-body-cell/preceding-sibling::datatable-body-cell/div/ion-buttons/ion-button\")";
			driver.findElement(By.xpath(befr_action + data.Budgetcode + aftr_action)).click();
		}

		@And("^Submit the record$")
		public void submit_the_record() {
			requestAndAllocation.Subsave().click();
			requestAndAllocation.Submit().click();
		}

	}


