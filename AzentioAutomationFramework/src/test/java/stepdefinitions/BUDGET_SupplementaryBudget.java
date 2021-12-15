package stepdefinitions;



	
	

	import static org.junit.Assert.assertTrue;

	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.Assert;

	import dataProvider.ConfigFileReader;
	import dataProvider.JsonReader;
	import helper.DropDownHelper;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
import pageobjects.BUDGET_SupplementaryBudgetObj;
import resources.BaseClass;
public class BUDGET_SupplementaryBudget extends BaseClass {

	
		public Properties prop;
		WebDriver driver = BaseClass.driver;
		BUDGET_SupplementaryBudgetObj supplymentaryobj;
		DropDownHelper dropDownHelper;
		
		
		JsonReader jsonReader=new JsonReader();
		ConfigFileReader configFileReader = new ConfigFileReader();

		
		@When("^maker click on budget supplymentary view icon$")
		public void maker_click_on_budget_supplymentary_view_icon()  {
			supplymentaryobj.budgetViewIcon().click();
		}
		@And("^click on add button on budget supplymentary view page$")
		public void click_on_add_button_on_budget_supplymentary_view_page()  {
			supplymentaryobj.supplymentaryBudgetCreationButton().click();
		}
		@Then("^maker should fill the required field$")
		public void maker_should_fill_the_required_field()  {
			supplymentaryobj.bgtCode().sendKeys("AR");
			dropDownHelper.SelectUsingVisibleText(supplymentaryobj.bgtCode(),"AR12345");
			dropDownHelper.SelectUsingVisibleText(supplymentaryobj.bdtYear(),"2021-2022");
			supplymentaryobj.bgtBranch().sendKeys("LE");
			dropDownHelper.SelectUsingVisibleText(supplymentaryobj.bgtBranch(),"AZENT-MAIN");
			Assert.assertTrue(supplymentaryobj.existingAmt().isDisplayed());
			supplymentaryobj.Currency().sendKeys("RUP");
			supplymentaryobj.Comments().sendKeys("ok");
			supplymentaryobj.supplementaryApportionAmt().sendKeys("1000.00");
			supplymentaryobj.newAmt().click();
		}
		@Then("^maker should save the changed budget code details$")
		public void maker_should_save_the_changed_budget_code_details()  {
			supplymentaryobj.Save().click();
		}
		
		@Then("^maker should click on note icon of the changed budget code$")
		public void maker_should_click_on_note_icon_of_the_changed_budget_code()  {
			supplymentaryobj.supplementaryBudgetEdit().click();
		}
		@And("^maker should submit the record$")
		public void maker_should_submit_the_record()  {
			supplymentaryobj.submitButton().click();
			supplymentaryobj.remarkField().sendKeys("Submitted by maker");
			supplymentaryobj.submitByMaker().click();
			
		}
		@Then("^maker should log out$")
		public void maker_should_log_out() {
			
		}

		
		
		
		@Given("^reviewer should navigate to the url and login with valid credentials$")
		public void reviewer_should_navigate_to_the_url_and_login_with_valid_credentials()  {
			
		}
		@When("^reviewer should click on notification$")
		public void reviewer_should_click_on_notification()  {
			supplymentaryobj.notificationButton().click();
			
		}
		@And("^reviewer should click on edit option of changed budget code$")
		public void reviewer_should_click_on_edit_option_of_changed_budget_code()  {
			supplymentaryobj.editBudget().click();
		}
		@Then("^reviewer should approve and submit the record$")
		public void reviewer_should_approve_and_submit_the_record()  {
			supplymentaryobj.approveByReviewer().click();
			supplymentaryobj.remarkByReviewer().sendKeys("Approved by reviewer");
			supplymentaryobj.submitByReviewer().click();
			
		}
		@Then("^reviewer should log out$")
		public void reviewer_should_log_out()  {
			
		}

	   
		
		@Given("^checker should navigate to the url and login with valid credentials$")
	    public void checker_should_navigate_to_the_url_and_login_with_valid_credentials() {
	        
	    }
	    @When("^checker should click on system management and navigate to open tool$")
	    public void checker_should_click_on_system_management_and_navigate_to_open_tool()  {
	       
	    }
	    @And("^checker should click on note icon and claim the record$")
	    public void checker_should_click_on_note_icon_and_claim_the_record()  {
	    	supplymentaryobj.openPoolEdit().click();
	    	supplymentaryobj.Claim().click();
	    	
	    }
	    @Then("^checker should click on notification and click on edit changed record$")
	    public void checker_should_click_on_notification_and_click_on_edit_changed_record() {
	    	supplymentaryobj.notifyForApproval().click();
	    	supplymentaryobj.approveByChecker().click();
	        
	    }
	    @Then("^checker should approve and submit the record details$")
	    public void checker_should_approve_and_submit_the_record_details()  {
	    	supplymentaryobj.approveByChecker().click();
	    	supplymentaryobj.editByChecker().click();
	    	supplymentaryobj.editByChecker().click();
	        
	    }
}


