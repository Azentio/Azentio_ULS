package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonReader;
import helper.BrowserHelper;
import helper.DropDownHelper;
import helper.VerificationHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.BUDGET_BudgetCreationObj;

import pageobjects.KUBS_CheckerObj;
import pageobjects.KUBS_MakerObj;
import pageobjects.KUBS_ReviewerObj;

import resources.BaseClass;
import testDataType.BUDGET_BudgetCreationTestDataType;

public class BUDGET_BudgetCreation {

	
public class BudgetCreation extends BaseClass {

		WebDriver drive = BaseClass.driver;
		JsonReader json = new JsonReader();
		ConfigFileReader config = new ConfigFileReader();
		KUBS_Login login = new KUBS_Login(drive);
		DropDownHelper dhelper;
		BUDGET_BudgetCreationObj budgetobj;
		KUBS_MakerObj makerobj;
		BUDGET_BudgetCreationTestDataType budgdata;
		String reviwerId;
		KUBS_ReviewerObj reviewer;
		String reference_id;
		BrowserHelper bhelper;
		KUBS_CheckerObj checker;
		// VerificationHelper vhelper;
		@Given("^navigate to the url and user should login as a maker$")
		public void navigate_to_the_url_and_user_should_login_as_a_maker() {
			login.loginToAzentioApp("1002435");
		}

		@And("^choose finance in configuration page$")
		public void choose_finance_in_configuration_page() {
			budgdata = json.getBudgetdataByName("Maker");
			dhelper = new DropDownHelper(drive);
			budgetobj = new BUDGET_BudgetCreationObj(drive);
			makerobj = new KUBS_MakerObj(drive);
			dhelper.SelectUsingVisibleText(makerobj.FinaceOption(), "Finance");
		}

		@Then("^Choose Budget creation menu$")
		public void choose_budget_creation_menu() {
			makerobj.budgetConfig().click();
		}

		@And("^click on the eye icon of budget defenition sub menu$")
		public void click_on_the_eye_icon_of_budget_defenition_sub_menu() {

			budgetobj.eyeIcon().click();

		}

		@Then("^capture all the valid details and save the record$")
		public void capture_all_the_valid_details_and_save_the_record() {

			budgetobj.addBtn().click();
			
			budgetobj.budgetCode().sendKeys(budgdata.BudgetCode);
			dhelper.SelectUsingVisibleText(budgetobj.bdgType(), budgdata.BudgetType);
			budgetobj.warningPercentage().sendKeys(budgdata.WarningPecentage);
			budgetobj.budgetName().sendKeys(budgdata.BudgetName);
			budgetobj.remarks().sendKeys(budgdata.Remark);
			budgetobj.saveBtn().click();
		}

		@And("^click note icon and choose our data and click our data and submit$")
		public void click_note_icon_and_choose_our_data_and_click_our_data_and_submit() {
			budgetobj.noteBtn().click();
			String before_xpath = "//datatable-row-wrapper[";
			String after_xpath = "]/datatable-body-row/div/datatable-body-cell[2]/div/span";
			for (int i = 1; i <= 8; i++) {
				String budger_code = drive.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
		
				if (budger_code.equalsIgnoreCase(budgdata.BudgetCode)) {
					drive.findElement(By.xpath(before_xpath + i
							+ "]/datatable-body-row/div/datatable-body-cell[1]/div/ion-buttons/ion-button")).click();
					budgetobj.firstSubmitButton().click();
					budgetobj.remarks().sendKeys("Ok");
					budgetobj.submitButton().click();
					break;
				}
				
			}
			VerificationHelper.verifyElementPresent(budgetobj.reviewerId());
			reviwerId = budgetobj.reviewerId().getText();
			System.out.println(reviwerId);
		}

		@Then("^click logout button and login as a reviewer$")
		public void click_logout_button_and_login_as_a_reviewer() {
			budgetobj.logoutButton().click();
			login.loginToAzentioApp(reviwerId.substring(10, 16));
		}

		@And("^find the budget code and approve the record$")
		public void find_the_budget_code_and_approve_the_record() {
			//datatable-row-wrapper[1]/datatable-body-row/div/datatable-body-cell[2]/div/span
			//datatable-row-wrapper[1]/datatable-body-row/div/datatable-body-cell[1]/div/ion-buttons/ion-button
			bhelper = new BrowserHelper(drive);
			String before_xpath = "//datatable-row-wrapper[";
			String after_xpath = "]/datatable-body-row/div/datatable-body-cell[2]/div/span";
			reviewer = new KUBS_ReviewerObj(drive);
			reviewer.notificationButton().click();
			for (int i = 0; i < 10; i++) {
				reference_id = drive.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
				drive.findElement(By.xpath(
						before_xpath + i + "]/datatable-body-row/div/datatable-body-cell[1]/div/ion-buttons/ion-button"))
						.click();
				String budgetcode = reviewer.getBudgetCode().getText();
				if (budgetcode.equalsIgnoreCase(budgdata.BudgetCode)) {
					
					reviewer.approveButton().click();
					reviewer.remarks().sendKeys("ok");
					reviewer.submitButton().click();
					break;
				} else {
					bhelper.goBack();
					reference_id="";
				}
			}	
		}
		@Then("^logout from the reviewer and login from checker$")
	    public void logout_from_the_reviewer_and_login_from_checker(){
			login.loginToAzentioApp("1002436");
			checker=new KUBS_CheckerObj(drive);
			checker.securityManagement().click();
			checker.noteIcon().click();
	    }

	    @And("^find the reference id and select the record$")
	    public void find_the_reference_id_and_select_the_record(){
	    	//span[contains(text(),'199')]/parent::div/parent::datatable-body-cell/preceding-sibling::datatable-body-cell[2]/div/ion-buttons/ion-button
	    String before_xpath="//span[contains(text(),'";
	    String after_xpath_claim="')]/parent::div/parent::datatable-body-cell/preceding-sibling::datatable-body-cell[2]/div/ion-buttons/ion-button";
	  //span[contains(text(),'199')]/ancestor::datatable-body-cell/preceding-sibling::datatable-body-cell/div/ion-buttons/ion-button
	    String after_xpath="')]/ancestor::datatable-body-cell/preceding-sibling::datatable-body-cell/div/ion-buttons/ion-button";
	    drive.findElement(By.xpath(before_xpath+reference_id+after_xpath_claim)).click();
	    checker.notificationButton().click();  
	    drive.findElement(By.xpath(before_xpath+reference_id+after_xpath)).click();
	    }
	    @And("^approve the record$")
	    public void approve_the_record() throws Throwable {
	    	reviewer.approveButton().click();
	    	reviewer.remarks().sendKeys("ok");
	    	reviewer.submitButton().click();
	    	checker.notificationIcon().click();
	   
	    }

	}
}


