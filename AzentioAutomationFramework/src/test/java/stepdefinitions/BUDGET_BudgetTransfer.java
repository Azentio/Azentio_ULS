package stepdefinitions;




	import java.util.Properties;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;


	import dataProvider.ConfigFileReader;
	import dataProvider.JsonReader;
	import helper.DropDownHelper;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import pageobjects.BUDGET_BudgetTransferObj;
	import resources.BaseClass;
	import resources.ExcelReader;

	public class BUDGET_BudgetTransfer {
		public Properties prop;
		WebDriver driver = BaseClass.driver;
		BUDGET_BudgetTransferObj budgetTransferobj;
		
		ExcelReader reader = new ExcelReader(System.getProperty("user.dir") + "\\Test-data\\TestData.xlsx");
		JsonReader jsonReader=new JsonReader();
		DropDownHelper dropDownHelper = new DropDownHelper(driver);
		
		  @When("^User click on Configuration to select Finance$")
		    public void user_click_on_configuration_to_select_finance() throws Throwable {
			  ConfigFileReader configFileReader = new ConfigFileReader();
			  budgetTransferobj = new BUDGET_BudgetTransferObj(driver);
			  
			
		    }

		    @Then("^User click on Segement second Button$")
		    public void user_click_on_segement_second_button() throws Throwable {
		        
		    }

		    @Then("^User click on Budget$")
		    public void user_click_on_budget() throws Throwable {
		    
		    }

		    @Then("^User click on Budget Transfer eye button$")
		    public void user_click_on_budget_transfer_eye_button() throws Throwable {
		    	budgetTransferobj.budgtTrnsfrEyeButtn().click();
		    }

		    @Then("^User click on add button$")
		    public void user_click_on_add_button() throws Throwable {
		    	budgetTransferobj.budgtTrnsfrAddButtn().click();
		    	
		    }
		    @And("^Fill the form$")
		    public void fill_the_form() throws Throwable {
		    	budgetTransferobj.budgtTrnsfrBudgtCodeDropDown().click();
		    	
		    	//Select dropdownBudcode = new Select(driver.budgetTransferobj.budgtTrnsfrBudgtCodeDropDown();
		    	//dropdownBudcode.selectByVisibleText("AR12345");
		    	
		    	dropDownHelper.SelectUsingVisibleText(budgetTransferobj.budgtTrnsfrBudgtCodeDropDown(), "AR12345");
		    	budgetTransferobj.budgtTrnsfrBudgtYearDropdown().click();
		    	budgetTransferobj.budgtTrnsfrBudgtYearDropdown().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		    	budgetTransferobj.budgtTrnsfrBranch().click();
		    	
		    	//Select dropdownBranch = new Select(driver.budgetTransferobj.budgtTrnsfrBranch());
		    	//dropdownBranch.selectByVisibleText("AZENT-MAIN");
		    	
		    	dropDownHelper.SelectUsingVisibleText(budgetTransferobj.budgtTrnsfrBranch(), "AZENT-MAIN");
		    	budgetTransferobj.budgtTrnsfrTransferToBudgtCode().click();
		    	
		    	//Select dropdownTransfertoBudCode = new Select(driver.budgetTransferobj.budgtTrnsfrTransferToBudgtCode());
		    	//dropdownTransfertoBudCode.selectByVisibleText("BC_HYR_01");
		    	
		    	dropDownHelper.SelectUsingVisibleText(budgetTransferobj.budgtTrnsfrTransferToBudgtCode(), "BC_HYR_01");
		    	budgetTransferobj.budgtTrnsfrApportionedAmountA().sendKeys("1000000");
		    	budgetTransferobj.budgtTrnsfrNewAmtA().click();
		    	budgetTransferobj.budgtTrnsfrApportionedAmountB().sendKeys("1000000");
		    	budgetTransferobj.budgtTrnsfrNewAmtB().click();
		    }

		    @Then("^User save the form$")
		    public void user_save_the_form() throws Throwable {
		    	budgetTransferobj.budgtTrnsfrSaveButton().click();
		    }
		
		
		
		
		
		
	}




