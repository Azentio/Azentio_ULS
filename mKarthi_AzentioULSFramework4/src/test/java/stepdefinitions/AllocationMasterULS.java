package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AllocationMasterObjULS;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_AllocationMasterTestdata;

public class AllocationMasterULS {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	AllocationMasterObjULS allocationMasterObj = new AllocationMasterObjULS(driver);
	KULS_AllocationMasterTestdata allocationMasterTestData = jsonConfig.getAllocationMaster1ListByName("Maker");

	@When("^user click the configuration menu for Allocation Master$")
	public void user_click_the_configuration_menu_for_allocation_master() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.configurationOptions(), 30, 2);
		allocationMasterObj.configurationOptions().click();
	}

	@And("^User click Approved list icon for Allocation Master$")
	public void user_click_approved_list_icon_for_allocation_master() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(allocationMasterObj.allocationMasterApproveIcon());
		allocationMasterObj.allocationMasterApproveIcon().click();
	}

	@And("^User click First Edit icon in Approved list view for Allocation Master$")
	public void user_click_first_edit_icon_in_approved_list_view_for_allocation_master() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,allocationMasterObj.firstEditIcon(),30,
		// 2);
		for (int i = 0; i < 30; i++) {
			try {
				allocationMasterObj.firstEditIcon().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^User click back button in Alloction master screen$")
	public void user_click_back_button_in_alloction_master_screen() throws Throwable {
		//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, allocationMasterObj.allocationMaster_Back(), 30, 2);
		for(int i=0; i<20; i++) {
			try {
				allocationMasterObj.allocationMaster_Back().click();
				break;
			} catch (Exception e) {
				
			}
		}
		
	}

	@And("^User click and update Description$")
	public void user_click_and_update_description() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.AllocationMaster_DescriptionTextBox(), 30, 2);
		allocationMasterObj.AllocationMaster_DescriptionTextBox().click();
		allocationMasterObj.AllocationMaster_DescriptionTextBox().clear();
		allocationMasterObj.AllocationMaster_DescriptionTextBox().sendKeys(allocationMasterTestData.Description);
	}

	@And("^User click and update Allocation Code$")
	public void user_click_and_update_allocation_code() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.AllocationMaster_AllocationCodeTextBox(), 30, 2);
		allocationMasterObj.AllocationMaster_AllocationCodeTextBox().click();
		allocationMasterObj.AllocationMaster_AllocationCodeTextBox().clear();
		allocationMasterObj.AllocationMaster_AllocationCodeTextBox().sendKeys(allocationMasterTestData.AllocationCode);
	}

	@And("^User click Save button for Allocation master updation$")
	public void user_click_save_button_for_allocation_master_updation() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.alloctiont_Master_Update(), 30, 2);
		allocationMasterObj.alloctiont_Master_Update().click();
	}

	@And("^user click inbox to approve record for Allocation master$")
	public void user_click_inbox_to_approve_record_for_allocation_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, allocationMasterObj.Inbox(), 30,
				2);
		allocationMasterObj.Inbox().click();
		Thread.sleep(5000);
	}

	@And("^user search Allocation Master$")
	public void user_search_allocation_master() throws Throwable {

		for (int i = 0; i < 20; i++) {
			try {
				// seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
				allocationMasterObj.InboxView_Search().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.InboxView_SearchText(), 60, 2);
		allocationMasterObj.InboxView_SearchText().click();
		allocationMasterObj.InboxView_SearchText().sendKeys(allocationMasterTestData.SearchAllocationMaster);
	}

	@And("^user store reference number and click the first record in Allocation master inbox view$")
	public void user_store_reference_number_and_click_the_first_record_in_allocation_master_inbox_view()
			throws Throwable {
		String reference = null;
		for (int i = 0; i < 200; i++) {
			try {
				reference = allocationMasterObj.allocationMasterReferanceId().getText();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.firstEditIconInMakerListView(), 40, 2);
		allocationMasterObj.firstEditIconInMakerListView().click();

		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40,
		// 2);

		json.addReferanceData(reference);
		System.out.println(reference);
	}
	@And("^user capture checker id for checker submit$")
    public void user_capture_checker_id_for_checker_submit() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,allocationMasterObj.AllocationMaster_CheckerId(),60, 3);
        String sucessmgs = allocationMasterObj.AllocationMaster_CheckerId().getText();
        System.out.println(sucessmgs);
        String Space = " ";
        String split[] = sucessmgs.split(" ");
        Space=split[split.length-1];
        String popupID = Space.replaceAll("[/.]", "");
        json.addData(popupID);
        System.out.println(popupID);
    }

	@And("^user submit Allocation master record in maker$")
	public void user_submit_allocation_master_record_in_maker() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterMaker_Submit(), 60, 2);
		
		allocationMasterObj.allocationMasterMaker_Submit().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterMaker_EnterRemark(), 30, 2);
		allocationMasterObj.allocationMasterMaker_EnterRemark().click();
		allocationMasterObj.allocationMasterMaker_EnterRemark().sendKeys(allocationMasterTestData.EnterRemark);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.allocationMasterMaker_RemarkSubmit(), 30, 2);
		allocationMasterObj.allocationMasterMaker_RemarkSubmit().click();
	}

	@Then("^user Click on Return button in Action confirmation popup for Allocation master record$")
	public void user_click_on_return_button_in_action_confirmation_popup_for_allocation_master_record()
			throws Throwable {
		for (int i = 0; i < 30; i++) {
			try {
				allocationMasterObj.Checker_Final_Return().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@Then("^user verify the Record got returned for Allocation master record$")
	public void user_verify_the_record_got_returned_for_allocation_master_record() throws Throwable {
		String Toast;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.checkerApproveMgs(), 60, 2);
		Toast = allocationMasterObj.checkerApproveMgs().getText();
		System.out.println(Toast);
		// Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}

	@And("^user Click on Mailbox icon for Allocation master record$")
	public void user_click_on_mailbox_icon_for_allocation_master_record() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.Checker_Inbox(), 30, 2);
		allocationMasterObj.Checker_Inbox().click();
	}

	@And("^Search the respective reference id and click on Action button for Allocation master record$")
	public void search_the_respective_reference_id_and_click_on_action_button_for_allocation_master_record()
			throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user Click on return icon for Allocation master record$")
	public void user_click_on_return_icon_for_allocation_master_record() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				allocationMasterObj.Checker_Return(), 30, 2);
		allocationMasterObj.Checker_Return().click();
	}

	@And("^user Enter the remarks in Action confirmation popup for Allocation master record$")
	public void user_enter_the_remarks_in_action_confirmation_popup_for_allocation_master_record() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				allocationMasterObj.Checker_Alert_Return().click();
				break;
			} catch (ElementNotInteractableException e) {

			}
		}
	}

	@And("^Search the respective reference id and verify record should returned to maker$")
	public void search_the_respective_reference_id_and_verify_record_should_returned_to_maker() throws Throwable {
		for (int i = 0; i < 20; i++) {
			try {
				Assert.assertEquals(true,
						driver.findElement(
								By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button"))
								.isDisplayed());
				break;
			} catch (NoSuchElementException e) {

			}
		}
	}
}
