package stepdefinitions;

import java.io.File;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.Asset_CD_MasterOBJ;
import pageobjects.DepositAccountMasterObject;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class DepositAccountMaster extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	DepositAccountMasterObject depositMstObj = new DepositAccountMasterObject(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	//DepositAccountTestData depositMasterData = jconfig.getDepositAccountMasterByName("Maker");
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot mandateOrNot = new FindFieldisMandatoryorNot(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	String Toast;
	ExcelData depaccdataexcelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","DepAccountTestData","Data Set ID");
	Map<String, String> depaccdata;
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\UlsTestDataDesign.xlsx",
			"DepositAccount Master", "Data Set ID");
	Map<String, String> testData;
	

	@And("^Click the configuration$")
	public void click_the_configuration() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_Configurations(), 60, 2);
		depositMstObj.DepositAccount_Configurations().click();
	}

	@And("^Click the eye icon of deposit master$")
	public void click_the_eye_icon_of_deposit_master() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				depositMstObj.DepositAccount_EyeIcon().click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@Then("^Click the Add button in the deposit master$")
	public void click_the_add_button_in_the_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AddButton(), 60, 2);
		depositMstObj.DepositAccount_AddButton().click();
	}

	@And("^Verify all the fields in deposit screen$")
	public void verify_all_the_fields_in_deposit_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_BackButton(), 60, 2);
		depositMstObj.DepositAccount_BackButton().isDisplayed();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_Save(), 60, 2);
		depositMstObj.DepositAccount_Save().isDisplayed();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_BankNameDropDown(), 60,
				2);
		depositMstObj.DepositAccount_BankNameDropDown().isDisplayed();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_BranchNameDropDown(), 60,
				2);
		depositMstObj.DepositAccount_BranchNameDropDown().isDisplayed();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountTypeDropDown(), 60,
				2);
		depositMstObj.DepositAccount_AccountTypeDropDown().isDisplayed();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountNumber(), 60, 2);
		depositMstObj.DepositAccount_AccountNumber().isDisplayed();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountCurrencyDropDown(),
				60, 2);
		depositMstObj.DepositAccount_AccountCurrencyDropDown().isDisplayed();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_PaymentAccountIndicatorDropDown(), 60, 2);
		depositMstObj.DepositAccount_PaymentAccountIndicatorDropDown().isDisplayed();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_ChartOfAccountMapingDropDown(), 60, 2);
		depositMstObj.DepositAccount_ChartOfAccountMapingDropDown().isDisplayed();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountStatusDropDown(),
				60, 2);
		depositMstObj.DepositAccount_AccountStatusDropDown().isDisplayed();
	}
	 @Then("^Choose the data set id for creation of deposit account master$")
	    public void choose_the_data_set_id_for_creation_of_deposit_account_master() throws Throwable {
			testData = excelData.getTestdata("AT-DAM-T001-D1");
	 }

	@Then("^Select the Bank name in deposit master$")
	public void select_the_bank_name_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_BranchNameDropDown(), 60,
				2);
		depositMstObj.DepositAccount_BankNameDropDown().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//ion-label[contains(text(),'" + testData.get("Bank Name") + "')]/following-sibling::ion-radio"))
				.click();

	}

	@And("^Select the branch name in deposit master$")
	public void select_the_branch_name_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_BranchNameDropDown(), 60,
				2);
		depositMstObj.DepositAccount_BranchNameDropDown().click();
		
		for (int i = 0; i < 50; i++) {
			try {
				String xpath = "//ion-label[contains(text(),'" + testData.get("Branch Name")
				+ "')]/following-sibling::ion-radio";
				//depositMstObj.DepositAccount_BranchNameDropDown().click();
				// depositMstObj.DepositAccount_BranchNameDropDown().click();
				// clickAndAction.moveToElement(driver.findElement(By.xpath("//ion-label[contains(text(),'"
				// + depositMasterData.BranchName + "')]/following-sibling::ion-radio")));
				// clickAndAction.clickOnElement(driver.findElement(By.xpath("//ion-label[contains(text(),'"
				// + depositMasterData.BranchName + "')]/following-sibling::ion-radio")));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^Choose the accounting type in deposit master$")
	public void choose_the_accounting_type_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountTypeDropDown(), 60,
				2);
		depositMstObj.DepositAccount_AccountTypeDropDown().click();
		String xpath = "//ion-label[contains(text(),'" + testData.get("Account Type")
				+ "')]/following-sibling::ion-radio";
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
				if(i==50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Enter the account number in depost master$")
	public void enter_the_account_type_in_depost_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountNumber(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {

				depositMstObj.DepositAccount_AccountNumber().click();
				depositMstObj.DepositAccount_AccountNumber().sendKeys(testData.get("Account Number"));
				break;
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^Choose the account currency in deposit master$")
	public void choose_the_account_currency_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountCurrencyDropDown(),
				60, 2);
		depositMstObj.DepositAccount_AccountCurrencyDropDown().click();
		String xpath = "//ion-label[contains(text(),'" + testData.get("Account Currency")
				+ "')]/following-sibling::ion-radio";
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Choose the payment account indicator$")
	public void choose_the_payment_account_indicator() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_PaymentAccountIndicatorDropDown(), 60, 2);
		depositMstObj.DepositAccount_PaymentAccountIndicatorDropDown().click();
		String xpath = "//ion-label[contains(text(),'" + testData.get("Payment Account Indicator")
				+ "')]/following-sibling::ion-radio";
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^Select the chart of account mapping type in deposit master$")
	public void select_the_chart_of_account_mapping_type_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_ChartOfAccountMapingDropDown(), 60, 2);
		depositMstObj.DepositAccount_ChartOfAccountMapingDropDown().click();
		String xpath = "//ion-label[contains(text(),'" + testData.get("Chart Of Account Mapping Type")
				+ "')]/following-sibling::ion-radio";
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Select the account status$")
	public void select_the_account_status() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountStatusDropDown(),
				60, 2);
		depositMstObj.DepositAccount_AccountStatusDropDown().click();
		String xpath = "//ion-label[contains(text(),'" + testData.get("Account Status")
				+ "')]/following-sibling::ion-radio";
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^Save the record in deposit master$")
	public void save_the_record_in_deposoit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_Save(), 60, 2);
		depositMstObj.DepositAccount_Save().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_PopUp(), 60, 2);
		String popup = depositMstObj.DepositAccount_PopUp().getText();
		System.out.println("The system displays the confirmation message post clicking on Save button" + popup);
		// Assert.assertEquals("success", popup);
		Assert.assertTrue(popup.contains("Success"));

	}

	@And("^Click the pencil icon in deposit master$")
	public void click_the_pencil_icon_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_PencilButton(), 60, 2);
		depositMstObj.DepositAccount_PencilButton().click();

	}

	@Then("^Click the branch maping$")
	public void click_the_branch_maping() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_BranchMapingTab(), 60, 2);
		depositMstObj.DepositAccount_BranchMapingTab().click();

	}

	@And("^Verify the  fields in branch mappinng$")
	public void verify_the_fields_in_branch_mappinng() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_BranchMaping_Selected(),
				60, 2);
		depositMstObj.DepositAccount_BranchMaping_Selected().isDisplayed();
		depositMstObj.DepositAccount_BranchMaping_Available().isDisplayed();

	}

	@Then("^Choose the availble collection$")
	public void choose_the_availble_collection() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// depositMstObj.DepositAccount_EyeIcon(), 60, 2);
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath("//div[contains(text(),'" + testData.get("AvailableCollection") + "')]"))
						.click();
				break;
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^Map the available collection to selected$")
	public void map_the_available_collection_to_selected() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_BranchMaping_AvailableTOSelected(), 60, 2);
		depositMstObj.DepositAccount_BranchMaping_AvailableTOSelected().click();

	}

	@Then("^save the record in branch mapping$")
	public void save_the_record_in_branch_mapping() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_BranchMapingSave(), 60,
				2);
		depositMstObj.DepositAccount_BranchMapingSave().click();

	}

	@And("^Click the inbox in deposit master$")
	public void click_the_inbox_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_Inbox(), 60, 2);
		depositMstObj.DepositAccount_Inbox().click();

	}

	@Then("^Search the record in serch field$")
	public void search_the_record_in_serch_field() throws Throwable {
		
		for(int i=0; i<50; i++) {
			try {
				//waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SeachButton(), 60, 2);
				depositMstObj.DepositAccount_SeachButton().click();
				//waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SearchText(), 60, 2);
				action.getClickAndActionsHelper().moveToElement(depositMstObj.DepositAccount_SearchText());
				depositMstObj.DepositAccount_SearchText().click();
				depositMstObj.DepositAccount_SearchText().sendKeys(testData.get("Search"));
			} catch (Exception e) {
				
				if(i==50) {
				Assert.fail(e.getMessage());
				}
			}
		}
		
	
	}
	@And("^Get the reference id and store it in excel for checker return in deposit account master$")
    public void get_the_reference_id_and_store_it_in_excel_for_checker_return_in_deposit_account_master() throws Throwable {
 
    	 Thread.sleep(2000);
    		String RefId = depositMstObj.DepositAccount_GetRefId().getText();
	excelData.updateTestData("AT-DAM-T001-D3", "Reference ID", RefId);
	System.out.println(RefId);
	// json.addReferanceData(RefId);
	// excelData.updateTestData("AT-DAM-T001-D1","Reference ID",RefId);
}

	 @And("^Get the reference id and store it in excel for checker reject in deposit account master$")
	    public void get_the_reference_id_and_store_it_in_excel_for_checker_reject_in_deposit_account_master() throws Throwable {
		 Thread.sleep(2000);
	    		String RefId = depositMstObj.DepositAccount_GetRefId().getText();
		excelData.updateTestData("AT-DAM-T001-D2", "Reference ID", RefId);
		System.out.println(RefId);
		// json.addReferanceData(RefId);
		// excelData.updateTestData("AT-DAM-T001-D1","Reference ID",RefId);
	}
	@And("^Get the reference id and store it in json$")
	public void get_the_reference_id_and_store_it_in_json() throws Throwable {

		String RefId = depositMstObj.DepositAccount_GetRefId().getText();
		excelData.updateTestData("AT-DAM-T001-D1", "Reference ID", RefId);

		System.out.println(RefId);
		// json.addReferanceData(RefId);
		// excelData.updateTestData("AT-DAM-T001-D1","Reference ID",RefId);
	}
	//Modification reference id

    @And("^Get the reference id and store it in excel for approved record modification$")
    public void get_the_reference_id_and_store_it_in_excel_for_approved_record_modification() throws Throwable {
       
		String RefId = depositMstObj.DepositAccount_GetRefId().getText();
		excelData.updateTestData("AT-DAM-T007-D1", "Reference ID", RefId);

		System.out.println(RefId);
		// json.addReferanceData(RefId);
		// excelData.updateTestData("AT-DAM-T001-D1","Reference ID",RefId);
	}

    @And("^Get the reference id and store it in excel to reject the modified record in deposit account master$")
    public void get_the_reference_id_and_store_it_in_excel_to_reject_the_modified_record_in_deposit_account_master() throws Throwable {
           		String RefId = depositMstObj.DepositAccount_GetRefId().getText();
		excelData.updateTestData("AT-DAM-T008-D1", "Reference ID", RefId);

		System.out.println(RefId);
		// json.addReferanceData(RefId);
		// excelData.updateTestData("AT-DAM-T001-D1","Reference ID",RefId);
	}

    @And("^Get the reference id and store it in excel to return the modified record in deposit account master$")
    public void get_the_reference_id_and_store_it_in_excel_to_return_the_modified_record_in_deposit_account_master() throws Throwable {
              		String RefId = depositMstObj.DepositAccount_GetRefId().getText();
		excelData.updateTestData("AT-DAM-T009-D1", "Reference ID", RefId);

		System.out.println(RefId);
		// json.addReferanceData(RefId);
		// excelData.updateTestData("AT-DAM-T001-D1","Reference ID",RefId);
	}

	@And("^Click the first action icon in deposit master$")
	public void click_the_first_action_icon_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_ActionIcon(), 80, 2);
		depositMstObj.DepositAccount_ActionIcon().click();

	}

	@Then("^Submit the record in deposit master$")
	public void submit_the_record_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitButton(), 60, 2);
		depositMstObj.DepositAccount_SubmitButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitOKButton(), 60, 2);
		depositMstObj.DepositAccount_SubmitOKButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_FinalSubmitButton(), 60,
				2);
		depositMstObj.DepositAccount_FinalSubmitButton().click();
		Thread.sleep(4000);
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// depositMstObj.DepositAccount_CheckerId(), 60, 2);
		String CheckerId = null;
		for (int i = 0; i < 30; i++) {
			try {
				CheckerId = depositMstObj.DepositAccount_CheckerId().getText();
				System.out.println(CheckerId);
				break;
			} catch (Exception e) {
				if(i==30) {
					Assert.fail(e.getMessage());
				}

			}
			
		}

		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		System.out.println(popupID);
		// json.addData(popupID);
		excelData.updateTestData("AT-DAM-T001-D1", "Checker id", popupID);
		Thread.sleep(2000);
	}
	//Modification submit

    @Then("^Submit the record in deposit master for modifing the approved record$")
    public void submit_the_record_in_deposit_master_for_modifing_the_approved_record() throws Throwable {
    
	     		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitButton(), 60, 2);
			depositMstObj.DepositAccount_SubmitButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitOKButton(), 60, 2);
			depositMstObj.DepositAccount_SubmitOKButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_FinalSubmitButton(), 60,
					2);
			depositMstObj.DepositAccount_FinalSubmitButton().click();
			Thread.sleep(4000);
			// waitHelper.waitForElementToVisibleWithFluentWait(driver,
			// depositMstObj.DepositAccount_CheckerId(), 60, 2);
			String CheckerId = null;
			for (int i = 0; i < 30; i++) {
				try {
					CheckerId = depositMstObj.DepositAccount_CheckerId().getText();
					System.out.println(CheckerId);
					break;
				} catch (Exception e) {
					if(i==30) {
						Assert.fail(e.getMessage());
					}

				}
				
			}

			System.out.println(CheckerId);
			String Space = " ";
			String split[] = CheckerId.split(" ");
			Space = split[split.length - 1];
			String popupID = Space.replaceAll("[/.]", "");
			System.out.println(popupID);
			// json.addData(popupID);
			excelData.updateTestData("AT-DAM-T007-D1", "Checker id", popupID);
			Thread.sleep(2000);
		}


    @Then("^Submit the record in deposit master for reject the approved record$")
    public void submit_the_record_in_deposit_master_for_reject_the_approved_record() throws Throwable {
        	     		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitButton(), 60, 2);
			depositMstObj.DepositAccount_SubmitButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitOKButton(), 60, 2);
			depositMstObj.DepositAccount_SubmitOKButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_FinalSubmitButton(), 60,
					2);
			depositMstObj.DepositAccount_FinalSubmitButton().click();
			Thread.sleep(4000);
			// waitHelper.waitForElementToVisibleWithFluentWait(driver,
			// depositMstObj.DepositAccount_CheckerId(), 60, 2);
			String CheckerId = null;
			for (int i = 0; i < 30; i++) {
				try {
					CheckerId = depositMstObj.DepositAccount_CheckerId().getText();
					System.out.println(CheckerId);
					break;
				} catch (Exception e) {
					if(i==30) {
						Assert.fail(e.getMessage());
					}

				}
				
			}

			System.out.println(CheckerId);
			String Space = " ";
			String split[] = CheckerId.split(" ");
			Space = split[split.length - 1];
			String popupID = Space.replaceAll("[/.]", "");
			System.out.println(popupID);
			// json.addData(popupID);
			excelData.updateTestData("AT-DAM-T008-D1", "Checker id", popupID);
			Thread.sleep(2000);
		}
    @Then("^Submit the record in deposit master for return the approved record$")
    public void submit_the_record_in_deposit_master_for_return_the_approved_record() throws Throwable {

        	     		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitButton(), 60, 2);
			depositMstObj.DepositAccount_SubmitButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitOKButton(), 60, 2);
			depositMstObj.DepositAccount_SubmitOKButton().click();
			waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_FinalSubmitButton(), 60,
					2);
			depositMstObj.DepositAccount_FinalSubmitButton().click();
			Thread.sleep(4000);
			// waitHelper.waitForElementToVisibleWithFluentWait(driver,
			// depositMstObj.DepositAccount_CheckerId(), 60, 2);
			String CheckerId = null;
			for (int i = 0; i < 30; i++) {
				try {
					CheckerId = depositMstObj.DepositAccount_CheckerId().getText();
					System.out.println(CheckerId);
					break;
				} catch (Exception e) {
					
					if(i==30) {
						Assert.fail(e.getMessage());
					}

				}
				
			}

			System.out.println(CheckerId);
			String Space = " ";
			String split[] = CheckerId.split(" ");
			Space = split[split.length - 1];
			String popupID = Space.replaceAll("[/.]", "");
			System.out.println(popupID);
			// json.addData(popupID);
			excelData.updateTestData("AT-DAM-T009-D1", "Checker id", popupID);
			Thread.sleep(2000);
		}

    @Then("^Submit the record in deposit master for checker return$")
    public void submit_the_record_in_deposit_master_for_checker_return() throws Throwable {
     		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitButton(), 60, 2);
		depositMstObj.DepositAccount_SubmitButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitOKButton(), 60, 2);
		depositMstObj.DepositAccount_SubmitOKButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_FinalSubmitButton(), 60,
				2);
		depositMstObj.DepositAccount_FinalSubmitButton().click();
		Thread.sleep(4000);
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// depositMstObj.DepositAccount_CheckerId(), 60, 2);
		String CheckerId = null;
		for (int i = 0; i < 30; i++) {
			try {
				CheckerId = depositMstObj.DepositAccount_CheckerId().getText();
				System.out.println(CheckerId);
				break;
			} catch (Exception e) {
				if(i==30) {
					Assert.fail(e.getMessage());
				}

			}
			
		}

		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		System.out.println(popupID);
		// json.addData(popupID);
		excelData.updateTestData("AT-DAM-T001-D3", "Checker id", popupID);
		Thread.sleep(2000);
	}


    @Then("^Submit the record in deposit master for checker reject$")
    public void submit_the_record_in_deposit_master_for_checker_reject() throws Throwable {
   
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitButton(), 60, 2);
		depositMstObj.DepositAccount_SubmitButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_SubmitOKButton(), 60, 2);
		depositMstObj.DepositAccount_SubmitOKButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_FinalSubmitButton(), 60,
				2);
		depositMstObj.DepositAccount_FinalSubmitButton().click();
		Thread.sleep(4000);
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// depositMstObj.DepositAccount_CheckerId(), 60, 2);
		String CheckerId = null;
		for (int i = 0; i < 30; i++) {
			try {
				CheckerId = depositMstObj.DepositAccount_CheckerId().getText();
				System.out.println(CheckerId);
				break;
			} catch (Exception e) {
				
				if(i==30) {
					Assert.fail(e.getMessage());
				}

			}
			
		}

		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		System.out.println(popupID);
		// json.addData(popupID);
		excelData.updateTestData("AT-DAM-T001-D2", "Checker id", popupID);
		Thread.sleep(2000);
	}

	// *******Checker Stage***********************//
	@Given("^Get the URL and login as Checker for checker reject in deposit account master$")
    public void get_the_url_and_login_as_checker_for_checker_reject_in_deposit_account_master() throws Throwable {
    
		String kulsApplicationUrl = configFileRead.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		
		testData=excelData.getTestdata("AT-DAM-T001-D2");
		// System.out.println(testData.get("Checker id"));
		login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}

    @Given("^Get the URL and login as Checker to return the record in deposit account master$")
    public void get_the_url_and_login_as_checker_to_return_the_record_in_deposit_account_master() throws Throwable {
   
    
		String kulsApplicationUrl = configFileRead.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		
		testData=excelData.getTestdata("AT-DAM-T001-D3");
		// System.out.println(testData.get("Checker id"));
		login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	@Given("^Get the URL and login as Checker$")
	public void get_the_url_and_login_as_checker() throws Throwable {
		String kulsApplicationUrl = configFileRead.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		
		testData=excelData.getTestdata("AT-DAM-T001-D1");
		// System.out.println(testData.get("Checker id"));
		login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	//Modification checker stage
	 @Given("^Get the URL and login as Checker for modifing the approved record$")
	    public void get_the_url_and_login_as_checker_for_modifing_the_approved_record() throws Throwable {
    
		String kulsApplicationUrl = configFileRead.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		
		testData=excelData.getTestdata("AT-DAM-T007-D1");
		// System.out.println(testData.get("Checker id"));
		login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
	}
	  @Given("^Get the URL and login as Checker to reject the approved record$")
	    public void get_the_url_and_login_as_checker_to_reject_the_approved_record() throws Throwable {
	      		String kulsApplicationUrl = configFileRead.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		
		testData=excelData.getTestdata("AT-DAM-T008-D1");
		// System.out.println(testData.get("Checker id"));
		login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
		}
	  @Given("^Get the URL and login as Checker to return the approved record$")
	    public void get_the_url_and_login_as_checker_to_return_the_approved_record() throws Throwable {
	    
	      		String kulsApplicationUrl = configFileRead.getApplicationUrlTransactions();
		driver.get(kulsApplicationUrl);
		
		testData=excelData.getTestdata("AT-DAM-T009-D1");
		// System.out.println(testData.get("Checker id"));
		login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
		}

	@Then("^Click the menu icon in deposit account$")
	public void click_the_menu_icon_in_deposit_account() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_Menu(), 30, 2);

		action.getJavascriptHelper().JSEClick(depositMstObj.DepositAccount_Menu());

	}

	@And("^Click  the inbox in checker deposit account$")
	public void click_the_inbox_in_checker_deposit_account() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerInbox(), 60, 2);
		depositMstObj.DepositAccount_CheckerInbox().click();

	}

	@Then("^search the reference id and click the respective action icon in deposit master$")
	public void search_the_reference_id_and_click_the_respective_action_icon_in_deposit_master() throws Throwable {
//    	waitHelper.waitForElementToVisibleWithFluentWait(driver,
//				driver.findElement(By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button")),60, 2);
		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {
				if(i==60) {
					Assert.fail(e.getMessage());
				}

			}
		}

	}

	@And("^Click the approve button in the deposit master$")
	public void click_the_approve_button_in_the_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerApproveButton(),
				60, 2);
		depositMstObj.DepositAccount_CheckerApproveButton().click();

	}

	@Then("^Enter the alert approve remark in deposit master$")
	public void enter_the_alert_approve_remark_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerAlertApprove(), 60,
				2);
		depositMstObj.DepositAccount_CheckerAlertApprove().click();
	}

	@And("^Give the final approve in the deposit master$")
	public void give_the_final_approve_in_the_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerFinalApprove(), 60,
				2);
		depositMstObj.DepositAccount_CheckerFinalApprove().click();
	}

	@Then("^Verify the record get approved in deposit master$")
	public void verify_the_record_get_approved_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerId(), 60, 2);
		Toast = depositMstObj.DepositAccount_CheckerId().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}

	// ********List View Verification***************//
	@Then("^verify the approved record present in the list view$")
	public void verify_the_approved_record_present_in_the_list_view() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {

				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + testData.get("Account Number") + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, testData.get("AccountNumber"));
			} catch (Exception e) {
				if(i==20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	// *****Checker Reject******************//

    @Then("^choose the data set id for checker reject$")
    public void choose_the_data_set_id_for_checker_reject() throws Throwable {
    	testData=excelData.getTestdata("AT-DAM-T001-D3");
    }
	@And("^Click the reject button in the deposit master$")
	public void click_the_reject_button_in_the_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerRejectButton(), 60,
				2);

		depositMstObj.DepositAccount_CheckerRejectButton().click();

	}

	@Then("^Enter the alert reject remark in deposit master$")
	public void enter_the_alert_reject_remark_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerAlertReject(), 60,
				2);
		depositMstObj.DepositAccount_CheckerAlertReject().click();
	}

	@And("^Give the final reject in the deposit master$")
	public void give_the_final_reject_in_the_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerFinalReject(), 60,
				2);

		depositMstObj.DepositAccount_CheckerFinalReject().click();

	}

	@Then("^Verify the record get rejected in deposit master$")
	public void verify_the_record_get_rejected_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerIDReject(), 60, 2);
		Toast = depositMstObj.DepositAccount_CheckerIDReject().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record REJECTED Successfully");
	}

///**************list view************************///
	@Then("^verify the the rejected record in the list view$")
	public void verify_the_the_rejected_record_in_the_list_view() throws Throwable {
    	testData=excelData.getTestdata("AT-DAM-T001-D2");

		for (int i = 0; i < 50; i++) {

		}
		try {
			String validate = driver
					.findElement(By.xpath("//span[contains(text(),'" + testData.get("Account Number")+ "')]"))
					.getText();
			System.out.println(validate);
			Assert.assertEquals(validate, testData.get("Account Number"));
		} catch (Exception e) {
			System.out.println("The Rejected Record Not in the List view ");
		}
	}

	// *****Checker Return******************//
	@And("^Click the return button in the deposit master$")
	public void click_the_return_button_in_the_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerReturnButton(), 60,
				2);

		depositMstObj.DepositAccount_CheckerReturnButton().click();

	}

	@Then("^Enter the alert return remark in deposit master$")
	public void enter_the_alert_return_remark_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerAlertReturn(), 60,
				2);

		depositMstObj.DepositAccount_CheckerAlertReturn().click();

	}

	@And("^Give the final return in the deposit master$")
	public void give_the_final_return_in_the_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerFinalReturn(), 80,
				2);

		depositMstObj.DepositAccount_CheckerFinalReturn().click();

	}

	@Then("^Verify the record get returned in deposit master$")
	public void verify_the_record_get_returned_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerIDReturn(), 60, 2);
		Toast = depositMstObj.DepositAccount_CheckerIDReturn().getText();
		System.out.println(Toast);

	}

///**************************List View***********************************//
	@Then("^verify the the returned record is in the list view$")
	public void verify_the_the_returned_record_is_in_the_list_view() throws Throwable {
		for (int i = 0; i < 20; i++) {

		}
		try {
			String validate = driver
					.findElement(By.xpath("//span[contains(text(),'" + testData.get("AccountNumber") + "')]"))
					.getText();
			System.out.println(validate);
			Assert.assertEquals(validate, testData.get("AccountNumber"));
		} catch (Exception e) {

		}
	}

	@And("^Click the temp view icon of deposit master$")
	public void click_the_temp_view_icon_of_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_TempViewButton(), 60, 2);
		depositMstObj.DepositAccount_TempViewButton().click();
	}
	@Then("^Click the first pencil icon in temp view of deposit account master$")
    public void click_the_first_pencil_icon_in_temp_view_of_deposit_account_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_PencilButton(), 60, 2);
		depositMstObj.DepositAccount_PencilButton().click();
    }


	// ************************Validation******************//
	@And("^validate the record with blank field in deposit master$")
	public void validate_the_record_with_blank_field_in_deposit_master() throws Throwable {
		Thread.sleep(1000);
		WebElement nameErrorMessage = driver
				.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]"));
		String expectedErrorText = "Required field";
		String actualErrorText = nameErrorMessage.getText();
		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
			System.out.println(
					"The actual and expected result are same.The Popup validation message is" + actualErrorText);
		} else {
			System.out.println(
					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
		}
		Assert.assertEquals("Required field", actualErrorText);

	}

	@Then("^Verify the functionality of the back button$")
	public void verify_the_functionality_of_the_back_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_BackButton(), 60, 2);
		depositMstObj.DepositAccount_BackButton().click();
	}

	@Then("^Get the data set id for invalid data validation$")
	public void get_the_data_set_id_for_invalid_data_validation() throws Throwable {
		testData = excelData.getTestdata("AT-DAM-T005-D1");

	}

	@Then("^Validate the numeric field with character value in deposit master$")
	public void validate_the_numeric_field_with_character_value_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountNumber(), 60, 2);
		depositMstObj.DepositAccount_AccountNumber().click();
		depositMstObj.DepositAccount_AccountNumber().sendKeys(testData.get("ValidationNumericField"));
		String AccountNumberData = depositMstObj.DepositAccount_AccountNumberValidation()
				.getAttribute("ng-reflect-model");
		Assert.assertFalse(AccountNumberData.contains("abcd"));
	}

	@Then("^Validate the numeric field with special character value in deposit master$")
	public void validate_the_numeric_field_with_special_character_value_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountNumber(), 60, 2);
		depositMstObj.DepositAccount_AccountNumber().click();
		depositMstObj.DepositAccount_AccountNumber().sendKeys(testData.get("ValidationSpeciaChar"));
		String AccountNumberData = depositMstObj.DepositAccount_AccountNumberValidation()
				.getAttribute("ng-reflect-model");
		Assert.assertFalse(AccountNumberData.contains("$%^&"));
	}
	// ************************Modification Before Approve
	// ****************************//

	@Then("^Modify the field account type in deposit master$")
	public void modify_the_field_account_type_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountTypeModification(),
				60, 2);
		depositMstObj.DepositAccount_AccountTypeModification().click();
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("AccountTypeModification")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}

	}
	// ***********************Modification for approved
	// record**********************************//

	@Then("^Modify the field Account type in approved record for modification$")
	public void modify_the_field_account_type_in_approved_record_for_modification() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_ApprovedAccountTypeModification(), 60, 2);
		depositMstObj.DepositAccount_ApprovedAccountTypeModification().click();
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(),'"
						+ testData.get("ApprovedAccountTypeModification") + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {
			}
		}
	}

    @Then("^Modify the Bank name in deposit master$")
    public void modify_the_bank_name_in_deposit_master() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_Modification_BankName(), 60, 2);
		depositMstObj.DepositAccount_Modification_BankName().click();
		String xpath="//ion-label[contains(text(),'"
				+ testData.get("Bank Name") + "')]/following-sibling::ion-radio";
		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			}
			catch(Exception e)
			{
			}
			}
		}

    
    @Then("^Modify the Bank name in deposit master1$")
    public void modify_the_bank_name_in_deposit_master1() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_Modification_BankName(), 60, 2);
		depositMstObj.DepositAccount_Modification_BankName().click();
		String xpath="//ion-label[contains(text(),'"
				+ depaccdata.get("Bank Name") + "')]/following-sibling::ion-radio";
		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			}
			catch(Exception e)
			{
			}
			}
		}

    

    @Then("^Modify the accounting type in deposit master$")
    public void modify_the_accounting_type_in_deposit_master() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_Modification_AccountType(), 60, 2);
		depositMstObj.DepositAccount_Modification_AccountType().click();
		String xpath="//ion-label[contains(text(),'"
				+ testData.get("Account Type") + "')]/following-sibling::ion-radio";
		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			}
			catch(Exception e)
			{
			}
			}
		}
    @Then("^Modify the accounting type in deposit master1$")
    public void modify_the_accounting_type_in_deposit_master1() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_Modification_AccountType(), 60, 2);
		depositMstObj.DepositAccount_Modification_AccountType().click();
		String xpath="//ion-label[contains(text(),'"
				+ depaccdata.get("Account Type") + "')]/following-sibling::ion-radio";
		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			}
			catch(Exception e)
			{
			}
			}
		}
    

    @And("^Modify the branch name in deposit master$")
    public void modify_the_branch_name_in_deposit_master() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_Modification_BranchName(), 60, 2);
		depositMstObj.DepositAccount_Modification_BranchName().click();
		String xpath="//ion-label[contains(text(),'"
				+ testData.get("Branch Name") + "')]/following-sibling::ion-radio";
		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			}
			catch(Exception e)
			{
			}
			}
		}
    @And("^Modify the branch name in deposit master1$")
    public void modify_the_branch_name_in_deposit_master1() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_Modification_BranchName(), 60, 2);
		depositMstObj.DepositAccount_Modification_BranchName().click();
		String xpath="//ion-label[contains(text(),'"
				+ depaccdata.get("Branch Name") + "')]/following-sibling::ion-radio";
		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
			}
			catch(Exception e)
			{
			}
			}
		}
    
    
    @And("^Modify the account number in depost master$")
    public void modify_the_account_number_in_depost_master() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountNumber(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {

				depositMstObj.DepositAccount_AccountNumber().click();
				depositMstObj.DepositAccount_AccountNumber().clear();
				depositMstObj.DepositAccount_AccountNumber().sendKeys(testData.get("Account Number"));
				break;
			} catch (Exception e) {
			}
		}
    }
    @And("^Modify the account number in depost master1$")
    public void modify_the_account_number_in_depost_master1() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountNumber(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {

				depositMstObj.DepositAccount_AccountNumber().click();
				depositMstObj.DepositAccount_AccountNumber().clear();
				depositMstObj.DepositAccount_AccountNumber().sendKeys(depaccdata.get("Account Number"));
				break;
			} catch (Exception e) {
			}
		}
    }



	// ************Creation Modification for the approved
	// record*******************///
	@Then("^Modify the field account type2 in deposit master$")
	public void modify_the_field_account_type2_in_deposit_master() throws Throwable {
		Thread.sleep(1000);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AccountTypeDropDown(), 60,
				2);
		depositMstObj.DepositAccount_AccountTypeDropDown().click();
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("AccountType2")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	// ********Validation of blank field while doing modification********//

	@Then("^Make the field account type blank while doing modification$")
	public void make_the_field_account_type_blank_while_doing_modification() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				depositMstObj.DepositAccount_ApprovedAccountTypeModification(), 60, 2);
		depositMstObj.DepositAccount_ApprovedAccountTypeModification().click();
		for (int i = 0; i < 50; i++) {
			try {

				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("SelectModification")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}
	// ************List view Validation***************************//

	@Then("^To verify the values in List view in deposit master$")
	public void to_verify_the_values_in_list_view_in_deposit_master() throws Throwable {
		String xpath = "//tbody/tr[1]/td[3]";
		// action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (NoSuchElementException e) {
			System.out.println("Verified status field is not editable only displayable");
		}

	}

	@And("^To verify the functionality of view in process record button in deposit master$")
	public void to_verify_the_functionality_of_view_in_process_record_button_in_deposit_master() throws Throwable {
		String xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]/span[1]";
		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath)), 60,
				2);
		WebElement AccountType = driver.findElement(By.xpath(xpath));
		System.out.println("AccountType :" + AccountType);

		String xpath1 = "//tbody/tr[1]/td[4]/p-celleditor[1]/span[1]";
		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath1)), 60,
				2);
		WebElement AccountNumber = driver.findElement(By.xpath(xpath1));
		System.out.println("AccountNumber :" + AccountNumber);

		String xpath2 = "//p-tag[@ng-reflect-value='Active']";
		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath2)), 60,
				2);
		WebElement status = driver.findElement(By.xpath(xpath2));
		System.out.println("status :" + status);
	}

	// matched data search

	@Then("^To verify the functionality of Search box with matching data in deposit master$")
	public void to_verify_the_functionality_of_search_box_with_matching_data_in_deposit_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_ListViewSearch(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				depositMstObj.DepositAccount_ListViewSearch().click();
				depositMstObj.DepositAccount_ListViewSearchText().sendKeys(testData.get("ListViewSearch"));
				break;
			} catch (Exception e) {

			}
		}

		//depositMstObj.DepositAccount_ListViewSearchText().click();
		
		Assert.assertEquals(depositMstObj.DepositAccount_ListViewMachedData().isDisplayed(), true);

//		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
//		String AccountNumber = null;
//		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
//				driver.findElement(By.xpath(xpath)), 60, 2);
//		for (int i = 0; i < 20; i++) {
//
//			AccountNumber = driver.findElement(By.xpath(xpath)).getText();
//		}
//		System.out.println(AccountNumber);
	}
	// *************UnMactched Data**********//

	@Then("^To verify the functionality of Search box with unmatching data in deposit master$")
	public void to_verify_the_functionality_of_search_box_with_unmatching_data_in_deposit_master() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				depositMstObj.DepositAccount_ListViewSearch().click();
				break;
			} catch (Exception e) {

			}
		}
		depositMstObj.DepositAccount_ListViewSearchText().click();
		depositMstObj.DepositAccount_ListViewSearchText().sendKeys(testData.get("ListViewSearchUnmatched"));
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				// "Showing 0 to 0 of 0 entries"
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

	}

	@And("^To verify the functionality of Export to PDF button in deposit master$")
	public void to_verify_the_functionality_of_export_to_pdf_button_in_deposit_master() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				depositMstObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, depositMstObj.exportToPDF(), 60, 3);
		depositMstObj.exportToPDF().click();
		// seleniumactions.getBrowserHelper().SwitchToWindow(1);
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File("C:\\Users\\ININDC00071");
		File[] totalfiles = file.listFiles();
		for (File fileName : totalfiles) {
			if (fileName.getName().equalsIgnoreCase("DepositAccountMasterFile.pdf")) {
				System.out.println("Downloaded file present in system");
				break;
			} else {
				System.out.println("Downloaded file present does not exist in system");
			}

		}
		action.getBrowserHelper().switchToParentWithChildClose();

	}

	@Then("^To verify the functionality of Export to Excel button in deposit master$")
	public void to_verify_the_functionality_of_export_to_excel_button_in_deposit_master() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				depositMstObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 20; i++) {
			try {
				depositMstObj.exportToExcel().click();
				break;
			} catch (Exception e) {

			}
		}

		action.getBrowserHelper().switchToParentWithChildClose();
		System.out.println("Downloaded XLS file present in system");

	}

	@And("^Navigate to work in progress temp view$")
	public void navigate_to_work_in_progress_temp_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_TempViewButton(), 60, 2);
		depositMstObj.DepositAccount_TempViewButton().click();
	}

	@Then("^To verify the functionality of approved record button in wip$")
	public void to_verify_the_functionality_of_approved_record_button_in_wip() throws Throwable {
		String xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]/span[1]";
//action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		for (int i = 0; i < 20; i++) {
			try {
				String AccountType = driver.findElement(By.xpath(xpath)).getText();
				System.out.println("AccountType :" + AccountType);
				break;
			} catch (NoSuchElementException e) {
			}
		}
		String xpath1 = "//tbody/tr[1]/td[4]/p-celleditor[1]/span[1]";
//action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath1)),60,2);
		for (int i = 0; i < 30; i++) {
			try {
				WebElement AccountNumber = driver.findElement(By.xpath(xpath1));
				System.out.println("AccountNumber :" + AccountNumber);
				break;
			} catch (NoSuchElementException e) {
			}
		}
		String xpath2 = "//p-tag[@ng-reflect-value='Active']";
//action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath2)),60,2);
		for (int i = 0; i < 30; i++) {
			try {
				WebElement status = driver.findElement(By.xpath(xpath2));
				System.out.println("status :" + status);
				break;
			} catch (NoSuchElementException e) {
			}
		}
	}

	@And("^To verify the functionality of Add button in wip$")
	public void to_verify_the_functionality_of_add_button_in_wip() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_AddButton(), 60, 2);
		Assert.assertEquals(depositMstObj.DepositAccount_AddButton().isDisplayed(), true);
	}

	@Then("^To verify the functionality of Search box with matching data in wip$")
	public void to_verify_the_functionality_of_search_box_with_matching_data_in_wip() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_ListViewSearch(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				depositMstObj.DepositAccount_ListViewSearch().click();
				depositMstObj.DepositAccount_ListViewSearchText().sendKeys(testData.get("ListViewSearch"));
				Assert.assertEquals(depositMstObj.DepositAccount_ListViewMachedData().isDisplayed(), true);
				break;
			} catch (Exception e) {
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}

		//depositMstObj.DepositAccount_ListViewSearchText().click();
		
	}

	@And("^To verify the functionality of Search box with mismatch data in wip$")
	public void to_verify_the_functionality_of_search_box_with_mismatch_data_in_wip() throws Throwable {
		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

		for (int i = 0; i < 20; i++) {
			try {
				depositMstObj.DepositAccount_ListViewSearch().click();
				depositMstObj.DepositAccount_ListViewSearchText().sendKeys(testData.get("ListViewSearchUnmatched"));
				break;
			} catch (Exception e) {
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
		//depositMstObj.DepositAccount_ListViewSearchText().click();
		
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				// "Showing 0 to 0 of 0 entries"
				break;
			} catch (Exception e) {
				if(i==200) {
					Assert.fail(e.getMessage());
				}

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

	}

	@Then("^To verify the functionality of Export to PDF button in wip$")
	public void to_verify_the_functionality_of_export_to_pdf_button_in_wip() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				depositMstObj.exportIcon().click();
				break;
			} catch (Exception e) {
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}

		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, depositMstObj.exportToPDF(), 60, 3);
		depositMstObj.exportToPDF().click();
		// seleniumactions.getBrowserHelper().SwitchToWindow(1);
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		int length = totalfiles.length;
		int i = 0;
		for (File fileName : totalfiles) {
			if (fileName.getName().equalsIgnoreCase("DepositAccMasterFormDataFile.pdf")) {
				System.out.println("Downloaded file present in system");
				break;
			} else if (i == length - 1) {
				System.out.println("Downloaded file present does not exist in system");
			}

		}
		action.getBrowserHelper().switchToParentWithChildClose();

	}

	@And("^To verify the functionality of Export to Excel button in wip$")
	public void to_verify_the_functionality_of_export_to_excel_button_in_wip() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				depositMstObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		for (int i = 0; i < 20; i++) {
			try {
				depositMstObj.exportToExcel().click();
				break;
			} catch (Exception e) {

			}
		}
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		int length = totalfiles.length;
		int i = 0;
		for (File fileName : totalfiles) {
			if (fileName.getName().contains("DepositAccMasterFormDataFile_export")) {
				System.out.println("Downloaded file present in system");
				break;
			} else if (i == length - 1) {
				System.out.println("Downloaded file present does not exist in system");
			}

		}

		action.getBrowserHelper().switchToParentWithChildClose();
		System.out.println("Downloaded XLS file present in system");

	}

	@Then("^Search the record in serch field in checker stage$")
	public void search_the_record_in_serch_field_in_checker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerSeachButton(), 60,
				2);
		depositMstObj.DepositAccount_CheckerSeachButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_CheckerSearchText(), 60,
				2);
		action.getClickAndActionsHelper().moveToElement(depositMstObj.DepositAccount_CheckerSearchText());
		depositMstObj.DepositAccount_CheckerSearchText().click();
		depositMstObj.DepositAccount_CheckerSearchText().sendKeys(testData.get("Search"));
	}
	
	Asset_CD_MasterOBJ assetcd = new Asset_CD_MasterOBJ(driver);
	@Then("^User click the inboxmail icon in Deposit Account master$")
    public void user_click_the_inboxmail_icon_in_deposit_account_master() throws Throwable {
		
		for (int i = 0; i < 50; i++) {
			try {
				assetcd.mailicon().click();
				break;
			} catch (Exception e) {
				if(i==50) {
					Assert.fail(e.getMessage());

			}
		}
        
    }
        
    }

    @And("^User click the search icon in Deposit Account master and get the reference id$")
    public void user_click_the_search_icon_in_deposit_account_master_and_get_the_reference_id() throws Throwable {
    	
    	for (int i = 0; i < 50; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(depaccdata.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				
				if(i==50) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	Thread.sleep(500);
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, assetcd.referenceid(), 60, 5);
    	System.out.println(assetcd.referenceid().getText());
		String ref1 = assetcd.referenceid().getText();
		String ref2 = ref1.substring(0);
		depaccdataexcelData.updateTestData("DepositMaster_M5-Pre_Request_D1","Reference ID",ref2);
		json.addReferanceData(ref2);
		depaccdata = depaccdataexcelData.getTestdata("DepositMaster_M5-Pre_Request_D1");
        
    }

        

    @And("^User click the submit icon in Deposit Account master maker$")
    public void user_click_the_submit_icon_in_deposit_account_master_maker() throws Throwable {
    	Thread.sleep(500);
    	for(int i=0; i<50; i++) {
			try {
				assetcd.inboxediticon().click();
				break;
			} catch (Exception e) {
				if(i==20) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
    	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, assetcd.submit(), 60, 2);
    	assetcd.submit().click();
    	
//    	for (int i = 0; i < 20; i++) {
//			try {
//				assetcd.submit().click();
//				break;
//			} catch (Exception e) {
//
//			}
//		}

        
    }

    @And("^User enter the popup remark and submit the Deposit Account master$")
    public void user_enter_the_popup_remark_and_submit_the_deposit_account_master() throws Throwable {
        
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.popupremark().click();
				break;
			} catch (Exception e) {
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.popupremark().sendKeys(depaccdata.get("Popup Remark"));
				break;
			} catch (Exception e) {
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 5);
    	//assetcd.popupremark().sendKeys(assetjson.PopupRemarks);
    	
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, assetcd.popupsubmit(), 60, 5);
    	assetcd.popupsubmit().click();

    	
    }

    @And("^User get confirmation message and checker id in Deposit Account master$")
    public void user_get_confirmation_message_and_checker_id_in_deposit_account_master() throws Throwable {
        
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, assetcd.ProductCheckerid(), 60, 5);
		String Success = assetcd.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		depaccdataexcelData.updateTestData("DepositMaster_M5-Pre_Request_D1","Checker id",popupID);
		json.addData(popupID);
		System.out.println(popupID);
		depaccdata = depaccdataexcelData.getTestdata("DepositMaster_M5-Pre_Request_D1");
		
    	
    }
    
    //////////////////////////////////---Checker---/////////////////////////////////////////////
    ConfigFileReader configFileReader = new ConfigFileReader();
   // KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
    
    @Given("^User login as uls checker in Deposite account master$")
    public void user_login_as_uls_checker_in_deposite_account_master() throws Throwable {
    	
    	String kulsApplicationUrl = configFileReader.getApplicationUrlTransactions();
        driver.get(kulsApplicationUrl);
        //System.out.println(json.readdata());
       // testData = excelData.getTestdata("AT-ACD-T001_D1");
        //System.out.println(testData.get("Checker id"));
        login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
        
    }

    @Then("^User enter the popup remarks in Deposite account master checker$")
    public void user_enter_the_popup_remarks_in_deposite_account_master_checker() throws Throwable {
    	
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 2);
    	assetcd.popupremark().sendKeys(depaccdata.get("Popup Remark Approve"));
        
    }

    @Then("^User verify the Record got Approved in Deposite account checker$")
    public void user_verify_the_record_got_approved_in_deposite_account_checker() throws Throwable {
    	
    	  waitHelper.waitForElementToVisibleWithFluentWait(driver, assetcd.recordMsgChecker(), 60, 2);
     	   String Toast;
     	   Toast = assetcd.recordMsgChecker().getText();
     	   System.out.println(Toast);
     	   Assert.assertEquals(Toast, "Record APPROVED Successfully");
    	
        
    }

    @And("^User click the inboxicon in Deposite account master checker$")
    public void user_click_the_inboxicon_in_deposite_account_master_checker() throws Throwable {
    	
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, assetcd.inboxiconChecker(), 60, 2);
		assetcd.inboxiconChecker().click();
        
    }

    @And("^User click the search icon in Deposite account master and get the reference id$")
    public void user_click_the_search_icon_in_deposite_account_master_and_get_the_reference_id() throws Throwable {
    	
    	for (int i = 0; i < 20; i++) {
			try {
				assetcd.searchiconreferenceid().click();
				assetcd.searchsentkeys().sendKeys(depaccdata.get("Inbox Search"));
				break;
				
			} catch (Exception e) {
				if(i==20) {
					Assert.fail(e.getMessage());
				}

			}
		}

        
    }
    @And("^User click the summary button in deposit account master$")
    public void user_click_the_summary_button_in_deposit_account_master() throws Throwable {
    	
    	Thread.sleep(500);
    	for(int i=0; i<50; i++) {
			try {
				assetcd.inboxediticon().click();
				break;
			} catch (Exception e) {
				if(i==20) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
    	ClicksAndActionsHelper click = new ClicksAndActionsHelper(driver);
    	
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, assetcd.View_Summary(), 60, 2);
    	//assetcd.View_Summary().click();
    	click.doubleClick(assetcd.View_Summary());
       
    }

    @And("^User search the respective reference id and click on Action button in Deposite account master$")
    public void user_search_the_respective_reference_id_and_click_on_action_button_in_deposite_account_master() throws Throwable {
    	
        for (int i = 0; i <40; i++) {
            
	    	try {
	           
	    		driver.findElement(By.xpath("//span[text()='"+depaccdata.get("Reference ID")+"']/ancestor::tr/td[1]/button"))
	            .click();
	            break;
              
	    	}
         
	    	catch (Exception e) {
	    		if(i==20) {
					Assert.fail(e.getMessage());
				}
	    		
	    	}
	    		
	    }


        
    }
    Selenium_Actions seleniumactions = new Selenium_Actions(driver);

    @And("^User click on Approve icon in Deposite account master checker$")
    public void user_click_on_approve_icon_in_deposite_account_master_checker() throws Throwable {
    	
    	for(int i=0; i<40; i++) {
			try {
				seleniumactions.getClickAndActionsHelper().moveToElement(assetcd.CheckerApprove());
				assetcd.CheckerApprove().click();
				break;
			} catch (Exception e) {
				if(i==20) {
					Assert.fail(e.getMessage());
				}
				
			}
		}
        
    }

    @And("^User click the popup remarks in Deposite account master checker$")
    public void user_click_the_popup_remarks_in_deposite_account_master_checker() throws Throwable {
        
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 2);
		assetcd.popupremark().click();
	

    	
    }

    @And("^User click the popup approve in Deposite account master checker$")
    public void user_click_the_popup_approve_in_deposite_account_master_checker() throws Throwable {
    	
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, assetcd.popupapprove(), 60, 2);
		assetcd.popupapprove().click();
        
    }


	
	

	@Then("^Select the test data set id for listview and wip validation in deposit account master$")
	public void select_the_test_data_set_id_for_listview_and_wip_validation_in_deposit_account_master()
			throws Throwable {
		testData = excelData.getTestdata("AT-DAM-T013-D1");
	}
	@Then("^Choose the data set id for checker return in deposit account master$")
    public void choose_the_data_set_id_for_checker_return_in_deposit_account_master() throws Throwable {
		testData = excelData.getTestdata("AT-DAM-T001-D3");

    }
	 @Then("^Choose the data set id for modification before approving$")
	    public void choose_the_data_set_id_for_modification_before_approving() throws Throwable {
		 testData=excelData.getTestdata("AT-DAM-T006-D1");
	    }
	 @Then("^Choose the data set id for modifing the approved record in deposit account master$")
	    public void choose_the_data_set_id_for_modifing_the_approved_record_in_deposit_account_master() throws Throwable {
		 testData=excelData.getTestdata("AT-DAM-T007-D1");
	    }
	 @Then("^Choose the data set id to reject the modified record in deposit account masters$")
	    public void choose_the_data_set_id_to_reject_the_modified_record_in_deposit_account_masters() throws Throwable {
		 testData=excelData.getTestdata("AT-DAM-T008-D1");

	 }
	 @Then("^Choose the data set id to return the modified record in deposit account masters$")
	    public void choose_the_data_set_id_to_return_the_modified_record_in_deposit_account_masters() throws Throwable {
		 testData=excelData.getTestdata("AT-DAM-T009-D1");
	    }
	 @Then("^Choose the data set id for negavite validation  in deposit account masters$")
	    public void choose_the_data_set_id_for_negavite_validation_in_deposit_account_masters() throws Throwable {
		 testData=excelData.getTestdata("AT-DAM-T010-D1");
	    }
	    @And("^User get the testdata for deposit account master testcase01$")
	    public void user_get_the_testdata_for_deposit_account_master_testcase01() throws Throwable {
	    	depaccdata=depaccdataexcelData.getTestdata("DepositMaster_M5-Pre_Request_D1");
	    }
	    @And("^User get the testdata for deposit account master testcase02$")
	    public void user_get_the_testdata_for_deposit_account_master_testcase02() throws Throwable {
	    	depaccdata=depaccdataexcelData.getTestdata("AT-DAM-TC001_D1");
	    }
}
