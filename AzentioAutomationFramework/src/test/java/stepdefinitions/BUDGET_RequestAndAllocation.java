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
		DropDownHelper dropDownHelper;		
		BUDGET_RequestAndAllocationTestDataType RequestAndAllocationTestData;
		ConfigFileReader configFileReader = new ConfigFileReader();
		KUBS_Login login;
		
		@Given("^Open Azentio login$")
		public void Open_Azentio_login() {
			login=new KUBS_Login(driver);
			driver.get(configFileReader.getApplicationUrl());
			//login.loginToAzentioApp("1003524");
		}
		@And("^Click the Dirction icon$")
		public void click_the_dirction_icon() {
			requestAndAllocation.budget_requestAndAllocation_DirctionIcon().click();
		}

		@When("^Select the budget Field$")
		public void select_the_budget_field() {
			requestAndAllocation.budget_requestAndAllocation_BudgetField().click();
		}

		@And("^Click the Budget request & allocation Eye icon$")
		public void click_the_budget_request_allocation_eye_icon() {
			requestAndAllocation.budget_requestAndAllocation_BudgetEyeIcon().click();
		}

		@And("^Curser click the add icon$")
		public void curser_click_the_add_icon() {
			requestAndAllocation.budget_requestAndAllocation_Addicon().click();
		}

		@And("^Select budget code$")
		public void select_budget_code() {
			dropDownHelper = new DropDownHelper(driver);
			dropDownHelper.SelectUsingVisibleText(requestAndAllocation.budget_requestAndAllocation_Budgetcode(), RequestAndAllocationTestData.BudgetCode);
		}

		@And("^Select budget year$")
		public void select_budget_year() {
			dropDownHelper.SelectUsingVisibleText(requestAndAllocation.budget_requestAndAllocation_Budgetyear(), RequestAndAllocationTestData.BudgetYear);
		}

		@And("^Select budget branch$")
		public void select_budget_branch() {
			dropDownHelper.SelectUsingVisibleText(requestAndAllocation.budget_requestAndAllocation_Budgetbranch(), RequestAndAllocationTestData.Branch);
			requestAndAllocation.budget_requestAndAllocation_branchOK().click();
		}

		@Then("^Enter budget amount$")
		public void enter_budget_amount() {
			String budgettype = requestAndAllocation.budget_requestAndAllocation_Budgettype().getText();
			String before_xpath = "//datatable-body-cell[2]/div/app-kub-currency[@id='";
			String after_xpath = "']";
			String before_xpath_for_remark = "//datatable-body-cell[3]/div/input[@id='"; // datatable-body-cell[3]/div/input[@id='3']
			String after_xpath_for_remark = "']";
			
			if (budgettype.equalsIgnoreCase("Yearly")) {
				String budtype = "Yearly";
				RequestAndAllocationTestData = new BUDGET_RequestAndAllocationTestDataType();
				RequestAndAllocationTestData = jsonReader.getAllowcationByName(budtype);
				requestAndAllocation.budget_requestAndAllocation_Budgetyearly().sendKeys(RequestAndAllocationTestData.BudgetAmount); // budreq.Budgetyear().sendKeys("10000");
				requestAndAllocation.budget_requestAndAllocation_Budgetremark().sendKeys("Ok");
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
			}
		}

		@And("^Select currency$")
		public void select_currency() throws Throwable {
			dropDownHelper.SelectUsingVisibleText(requestAndAllocation.budget_requestAndAllocation_Amountcurruncy(), RequestAndAllocationTestData.Currency);
		}

		@And("^Click the save button$")
		public void click_the_save_button() throws Throwable {
			requestAndAllocation.budget_requestAndAllocation_AllowSave().click();
		}

		@And("^Click the action button in table$")
		public void click_the_action_button_in_table() {
			RequestAndAllocationTestData = new BUDGET_RequestAndAllocationTestDataType();
			String befr_action = "//span[contains(text(),'";
			String aftr_action = "')]/ancestor::datatable-body-cell/preceding-sibling::datatable-body-cell/div/ion-buttons/ion-button\")";
			driver.findElement(By.xpath(befr_action + RequestAndAllocationTestData.BudgetCode + aftr_action)).click();
		}

		@And("^Submit the record$")
		public void submit_the_record() {
			requestAndAllocation.budget_requestAndAllocation_Budgetsave().click();
			requestAndAllocation.budget_requestAndAllocation_BudgetSubmit().click();
		}

	}


