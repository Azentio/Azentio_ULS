package stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Warehouse_MasterObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.WarehouseTestdata;

public class WareHouseMaster extends BaseClass {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Warehouse_MasterObj warehousrobj = new Warehouse_MasterObj(driver);
	WarehouseTestdata warehousedata = jsonConfig.getwarehouseListByName("Maker");
	String Toast;
	List<String> xlsList = new ArrayList<>();
	List<String> pdfList = new ArrayList<>();
	BrowserHelper browserHelper = new BrowserHelper(driver);
	Map<String, String> testData = new HashMap<>();

	@Then("^user click on configurations Tab$")
	public void user_click_on_configurations_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Configurations(), 50, 2);
		warehousrobj.Configurations().click();
	}

	@When("^user click Config Manager menu$")
	public void user_click_config_manager_menu() throws Throwable {
		javaHelper.scrollIntoView(warehousrobj.ConfigManager());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.ConfigManager(), 50, 2);
		warehousrobj.ConfigManager().click();
	}

	@And("^user click list view icon of Warehouse Master$")
	public void user_click_list_view_icon_of_warehouse_master() throws Throwable {
		javaHelper.scrollIntoView(warehousrobj.Warehouse_Eye_Icon());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Eye_Icon(), 50, 2);
		warehousrobj.Warehouse_Eye_Icon().click();
	}

	@And("^user click on Add icon for Warehouse master$")
	public void user_click_on_add_icon_for_warehouse_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Add_Icon(), 50, 2);
		warehousrobj.Warehouse_Add_Icon().isDisplayed();
		warehousrobj.Warehouse_Add_Icon().click();
	}

	@And("^user Enter the value in description and verify it$")
	public void user_enter_the_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description(), 50, 2);
		warehousrobj.Warehouse_Description().isDisplayed();
		warehousrobj.Warehouse_Description().click();
		warehousrobj.Warehouse_Description().sendKeys(warehousedata.Description);
	}

	@And("^user Enter the value in Address field and verify it$")
	public void user_enter_the_value_in_address_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Address");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 50, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.Address);
	}

	@And("^user Enter the value in country field and verify it$")
	public void user_enter_the_value_in_country_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Country");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Country(), 50, 2);
		warehousrobj.Warehouse_Country().isDisplayed();
		warehousrobj.Warehouse_Country().click();
		for (int i = 0; i < 500; i++) {
			try {
				javaHelper.scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'" + warehousedata.country + "')]/following-sibling::ion-radio")));
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + warehousedata.country + "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user Enter the value in state field and verify it$")
	public void user_enter_the_value_in_state_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("State");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_State(), 50, 2);
		warehousrobj.Warehouse_State().isDisplayed();
		warehousrobj.Warehouse_State().click();

		for (int i = 0; i < 500; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + warehousedata.State + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user Enter the value in Location field and verify it$")
	public void user_enter_the_value_in_location_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Location");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Location(), 50, 2);
		warehousrobj.Warehouse_Location().isDisplayed();
		warehousrobj.Warehouse_Location().click();

		for (int i = 0; i < 500; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + warehousedata.Location + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user Enter the value in Zip code field and verify it$")
	public void user_enter_the_value_in_zip_code_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Zip Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Zipcode(), 50, 2);
		warehousrobj.Warehouse_Zipcode().isDisplayed();
		warehousrobj.Warehouse_Zipcode().click();

		for (int i = 0; i < 500; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + warehousedata.Zipcode + "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user Enter the value in Phone field and verify it$")
	public void user_enter_the_value_in_phone_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Phone 1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Phone1(), 50, 2);
		warehousrobj.Warehouse_Phone1().isDisplayed();
		warehousrobj.Warehouse_Phone1().click();
		warehousrobj.Warehouse_Phone1().sendKeys(warehousedata.Phone);

	}

	@And("^user Enter the value in Fax field and verify it$")
	public void user_enter_the_value_in_fax_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Fax");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Fax(), 50, 2);
		warehousrobj.Warehouse_Fax().isDisplayed();
		warehousrobj.Warehouse_Fax().click();
		warehousrobj.Warehouse_Fax().sendKeys(warehousedata.Fax);

	}

	@And("^user Enter the value in Email field and verify it$")
	public void user_enter_the_value_in_email_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Email");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Email(), 50, 2);
		warehousrobj.Warehouse_Email().isDisplayed();
		warehousrobj.Warehouse_Email().click();
		warehousrobj.Warehouse_Email().sendKeys(warehousedata.Email);
	}

	@And("^user Enter the value in Contact person field and verify it$")
	public void user_enter_the_value_in_contact_person_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Contact Person");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ContactPerson(), 50, 2);
		warehousrobj.Warehouse_ContactPerson().isDisplayed();
		warehousrobj.Warehouse_ContactPerson().click();
		warehousrobj.Warehouse_ContactPerson().sendKeys(warehousedata.Contactperson);
	}

	@And("^user save the warehouse master Record$")
	public void user_save_the_warehouse_master_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Save(), 50, 2);
		warehousrobj.Warehouse_Save().isDisplayed();
		warehousrobj.Warehouse_Save().click();
	}

	@And("^user goto the Maker Inbox and store the Referance ID$")
	public void user_goto_the_maker_inbox_and_store_the_referance_id() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 50, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 50, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println("Referance ID : " +RefId);
		json.addReferanceData(RefId);

	}

	@Then("^user Click on Action Icon$")
	public void user_click_on_action_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Action(), 50, 2);
		warehousrobj.Warehouse_Action().click();
	}

	@And("^user verify the submit button and submit the Record from Maker stage$")
	public void user_verify_the_submit_button_and_submit_the_record_from_maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 50, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 50, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 50, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		json.addData(popupID);
		System.out.println("Checker ID : " +popupID);
	}

	// *********************Checker Approve***********************//

	@And("^user Click on Chcker Menu icon$")
	public void user_click_on_chcker_menu_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_toggle(), 50, 2);
		javaHelper.JSEClick(warehousrobj.Checker_toggle());
	}

	@And("^user Click on Checker Mailbox icon$")
	public void user_click_on_checker_mailbox_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Inbox(), 50, 2);
		warehousrobj.Checker_Inbox().click();
	}

	@And("^user Search the respective reference id and click on Action button$")
	public void user_search_the_respective_reference_id_and_click_on_action_button() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {
				{

				}
			}
		}
	}

	@And("^user Click on Approve icon button$")
	public void user_click_on_approve_icon_button() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// warehousrobj.Checker_Approve(), 50, 2);
		for (int i = 0; i < 50; i++) {
			try {
				warehousrobj.Checker_Approve().click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^user Enter the remarks in Action confirmation popup screen$")
	public void user_enter_the_remarks_in_action_confirmation_popup_screen() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				 //waitHelper.waitForElementToVisibleWithFluentWait(driver,warehousrobj.Checker_Approve(), 50, 2);
				//clicksAndActionsHelper.doubleClick(warehousrobj.Checker_Alert_Approve());
				javaHelper.JSEClick(warehousrobj.Checker_Alert_Approve());
				break;
			} catch (Exception e) {

			}
		}
	}

	@Then("^user Click on Remarks button in Action confirmation popup screen$")
	public void user_click_on_remarks_button_in_action_confirmation_popup_screen() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				//waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Final_Approve(), 50, 2);
				javaHelper.JSEClick(warehousrobj.Checker_Final_Approve());
				break;
			}catch(Exception e) {
				
			}
		}

	}

	@Then("^user verify the Record got Approved in checker stage$")
	public void user_verify_the_record_got_approved_in_checker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		Toast = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}

	@Then("^User validate the WareHouse approved record in list view$")
	public void user_validate_the_warehouse_approved_record_in_list_view() throws Throwable {
		for (int i = 0; i < 500; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + warehousedata.Address + "')]")).getText();
				System.out.println(validate);
				Assert.assertEquals(validate, warehousedata.Address);

				String validate1 = driver
						.findElement(By.xpath("//span[contains(text(),'" + warehousedata.Email + "')]")).getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, warehousedata.Email);
				break;
			} catch (Exception e) {

			}
		}
	}

	// ********************@AT_WHM_T002_Reject*************************//

	@And("^user Enter the value For Address field and verify it$")
	public void user_enter_the_value_for_address_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Address");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 50, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressReject);
	}

	@And("^user Enter the value For Email field and verify it$")
	public void user_enter_the_value_for_email_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Email");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Email(), 50, 2);
		warehousrobj.Warehouse_Email().isDisplayed();
		warehousrobj.Warehouse_Email().click();
		warehousrobj.Warehouse_Email().sendKeys(warehousedata.EmailReject);
	}

	@And("^user Click on Reject icon button$")
	public void user_click_on_reject_icon_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Reject(), 50, 2);
		warehousrobj.Checker_Reject().click();
	}

	@And("^user Enter the remarks for Reject the Record in checker$")
	public void user_enter_the_remarks_for_reject_the_record_in_checker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Alert_Reject(), 50, 2);
		warehousrobj.Checker_Alert_Reject().click();
	}

	@Then("^user Click on Remarks button for Reject confirmation Alert$")
	public void user_click_on_remarks_button_for_reject_confirmation_alert() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Final_Reject(), 50, 2);
		warehousrobj.Checker_Final_Reject().click();
	}

	@Then("^user verify the Record got Rejected in checker stage$")
	public void user_verify_the_record_got_rejected_in_checker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		Toast = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record REJECTED Successfully");
	}

	// ********************@AT_WHM_T002_Reject_ListView*************************//

	@Then("^User validate the WareHouse Rejected record in list view$")
	public void user_validate_the_warehouse_rejected_record_in_list_view() throws Throwable {
		try {

			String validate = driver
					.findElement(By.xpath("//span[contains(text(),'" + warehousedata.AddressReject + "')]")).getText();
			System.out.println(validate);
			Assert.assertEquals(validate, warehousedata.AddressReject);
		} catch (Exception e) {
			System.out.println("The Rejected Record Not in the List view " + warehousedata.AddressReject);
		}

		try {

			String validate1 = driver
					.findElement(By.xpath("//span[contains(text(),'" + warehousedata.EmailReject + "')]")).getText();
			System.out.println(validate1);
			Assert.assertEquals(validate1, warehousedata.EmailReject);
		} catch (Exception e) {
			System.out.println("The Rejected Record Not in the List view " + warehousedata.EmailReject);
		}
	}

	// **************************@AT-WHM-T003_Return**********************//

	@And("^user Enter the value to Address field and verify it$")
	public void user_enter_the_value_to_address_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Address");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 50, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressReturn);
	}

	@And("^user Enter the value to Email field and verify it$")
	public void user_enter_the_value_to_email_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Email");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Email(), 50, 2);
		warehousrobj.Warehouse_Email().isDisplayed();
		warehousrobj.Warehouse_Email().click();
		warehousrobj.Warehouse_Email().sendKeys(warehousedata.EmailReturn);
	}

	// **************************@AT_WHM_T002_Return_ListView**********************//

	@And("^user Click on Return icon button$")
	public void user_click_on_return_icon_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Return(), 50, 2);
		warehousrobj.Checker_Return().click();
	}

	@And("^user Enter the remarks for Return the Record in checker$")
	public void user_enter_the_remarks_for_return_the_record_in_checker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Alert_Return(), 50, 2);
		warehousrobj.Checker_Alert_Return().click();
	}

	@Then("^user Click on Remarks button for Return confirmation Alert$")
	public void user_click_on_remarks_button_for_return_confirmation_alert() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Alert_Return(), 50, 2);
		warehousrobj.Checker_Final_Return().click();
	}

	@Then("^user verify the Record got Returned in checker stage$")
	public void user_verify_the_record_got_returned_in_checker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 50, 2);
		Toast = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(Toast);
	}

	// *******************@AT_WHM_T002_Return_ListView*********************//

	@And("^user click Temp view icon of Warehouse Master$")
	public void user_click_temp_view_icon_of_warehouse_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Edit_Icon(), 50, 2);
		warehousrobj.Warehouse_Edit_Icon().click();
	}

	@Then("^User validate the WareHouse Retured record in list view$")
	public void user_validate_the_warehouse_retured_record_in_list_view() throws Throwable {
		try {
			String validate = driver
					.findElement(By.xpath("//span[contains(text(),'" + warehousedata.AddressReturn + "')]")).getText();
			System.out.println(validate);
			Assert.assertEquals(validate, warehousedata.AddressReturn);

			String validate1 = driver
					.findElement(By.xpath("//span[contains(text(),'" + warehousedata.EmailReturn + "')]")).getText();
			System.out.println(validate1);
			Assert.assertEquals(validate1, warehousedata.EmailReturn);
		} catch (Exception e) {

		}
	}

	// ********************@AT_WHM_T004********************//

	@And("^user Enter characters in numeric field$")
	public void user_enter_characters_in_numeric_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Phone1(), 50, 2);
		warehousrobj.Warehouse_Phone1().click();
		warehousrobj.Warehouse_Phone1().sendKeys(warehousedata.Validation);
		String AccountNumberData = warehousrobj.Warehouse_Phone1_validation().getAttribute("ng-reflect-model");
		Assert.assertFalse(AccountNumberData.contains("abcd"));

	}

	@And("^user verify the validation Message in warehouse Master$")
	public void user_verify_the_validation_message_in_warehouse_master() throws Throwable {
		String nameErrorMessage = driver.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]"))
				.getText();
		String expectedErrorText = "Required field";
		if (nameErrorMessage.equalsIgnoreCase(expectedErrorText)) {
			System.out.println("System should not allow the Mandatory fields Empty.The Popup validation message is "
					+ nameErrorMessage);
		} else {
			System.out.println(
					"System should allow the Mandatory fields.The Popup validation message is " + nameErrorMessage);
		}
	}

	// ********************@AT-WHM-T0050_Modification******************//

	@And("^user Enter the value in description and Modify it$")
	public void user_enter_the_value_in_description_and_modify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description(), 50, 2);
		warehousrobj.Warehouse_Description().isDisplayed();
		warehousrobj.Warehouse_Description().click();
		warehousrobj.Warehouse_Description().clear();
		warehousrobj.Warehouse_Description().sendKeys(warehousedata.DescriptionModify);
	}

	@And("^user Enter the value in Address field and Modify it$")
	public void user_enter_the_value_in_address_field_and_modify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 50, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().clear();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressModify);
	}

	@And("^user Enter the value in description and ReModify it$")
	public void user_enter_the_value_in_description_and_remodify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description(), 50, 2);
		warehousrobj.Warehouse_Description().isDisplayed();
		warehousrobj.Warehouse_Description().click();
		warehousrobj.Warehouse_Description().clear();
		warehousrobj.Warehouse_Description().sendKeys(warehousedata.DescriptionReModify);
	}

	@And("^user Enter the value in Address field and ReModify it$")
	public void user_enter_the_value_in_address_field_and_remodify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 50, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().clear();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressReModify);
	}

	@Then("^User validate the WareHouse Modify approved record in list view$")
	public void user_validate_the_warehouse_modify_approved_record_in_list_view() throws Throwable {
		for (int i = 0; i < 500; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + warehousedata.AddressReModify + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, warehousedata.AddressReModify);

				String validate1 = driver
						.findElement(By.xpath("//span[contains(text(),'" + warehousedata.DescriptionReModify + "')]"))
						.getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, warehousedata.DescriptionReModify);
				break;
			} catch (Exception e) {

			}
		}
	}

	// ********************@AT_WHM_T007_Modification_Reject******************//

	@And("^user Enter the value in description and Modify Reject it$")
	public void user_enter_the_value_in_description_and_modify_reject_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description(), 50, 2);
		warehousrobj.Warehouse_Description().isDisplayed();
		warehousrobj.Warehouse_Description().click();
		warehousrobj.Warehouse_Description().clear();
		warehousrobj.Warehouse_Description().sendKeys(warehousedata.DescriptionModifyReject);
	}

	@And("^user Enter the value in Address field and Modify Reject it$")
	public void user_enter_the_value_in_address_field_and_modify_reject_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 50, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().clear();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressModifyReject);
	}

	@Then("^User validate the WareHouse Modify Rejected record in list view$")
	public void user_validate_the_warehouse_modify_rejected_record_in_list_view() throws Throwable {
		for (int i = 0; i < 500; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + warehousedata.AddressModifyReject + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, warehousedata.AddressReModify);

				String validate1 = driver
						.findElement(
								By.xpath("//span[contains(text(),'" + warehousedata.DescriptionModifyReject + "')]"))
						.getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, warehousedata.DescriptionReModify);
				break;
			} catch (Exception e) {

			}
		}
	}

	// ********************@AT_WHM_T008_Modification_Return******************//

	@And("^user Enter the value in description and Modify Return it$")
	public void user_enter_the_value_in_description_and_modify_return_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description(), 50, 2);
		warehousrobj.Warehouse_Description().isDisplayed();
		warehousrobj.Warehouse_Description().click();
		warehousrobj.Warehouse_Description().clear();
		warehousrobj.Warehouse_Description().sendKeys(warehousedata.DescriptionReModifyReturn);
	}

	@And("^user Enter the value in Address field and Modify Return it$")
	public void user_enter_the_value_in_address_field_and_modify_return_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 50, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().clear();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressReModifyReturn);
	}

	@Then("^User validate the WareHouse Modify Retured record in list view$")
	public void user_validate_the_warehouse_modify_retured_record_in_list_view() throws Throwable {
		for (int i = 0; i < 500; i++) {
			try {
				String validate = driver
						.findElement(By.xpath("//span[contains(text(),'" + warehousedata.AddressReModifyReturn + "')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, warehousedata.AddressReModifyReturn);

				String validate1 = driver
						.findElement(
								By.xpath("//span[contains(text(),'" + warehousedata.DescriptionReModifyReturn + "')]"))
						.getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, warehousedata.DescriptionReModifyReturn);
				break;
			} catch (Exception e) {

			}
		}
	}

	// ******************@AT_WHM_T006_Invalid******************//

	@And("^user Enter Invalid Data in warehouse Master$")
	public void user_enter_invalid_data_in_warehouse_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Fax(), 50, 2);
		warehousrobj.Warehouse_Fax().isDisplayed();
		warehousrobj.Warehouse_Fax().click();
		warehousrobj.Warehouse_Fax().clear();
		warehousrobj.Warehouse_Fax().sendKeys(warehousedata.InvalidFax);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath("//ion-badge[contains(text(),'Maximum 50 characters are allowed')]")), 50,2);
		WebElement errorPopUp = driver.findElement(By.xpath("//ion-badge[contains(text(),'Maximum 50 characters are allowed')]"));
		String expectedErrorText = "Maximum 50 characters are allowed";
		String actualErrorText = errorPopUp.getText();
		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
			System.out.println("The system was not allow the record to save as we enter the invalid details.The Popup validation message is"+ actualErrorText);
		} else {
			System.out.println(
					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
		}
		Assert.assertEquals(actualErrorText, "Maximum 50 characters are allowed");
	}

	// ******************@AT_WHM_T009_Active_Deactive******************//

	@And("^user click on First Record Edit icon$")
	public void user_click_on_first_record_edit_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Temp_Edit(), 150, 2);
		warehousrobj.Warehouse_Temp_Edit().click();
	}

	@And("^user verify the status button$")
	public void user_verify_the_status_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Status(), 50, 2);
		warehousrobj.Warehouse_Status().isDisplayed();
	}

	@And("^user verify the status is Active$")
	public void user_verify_the_status_is_active() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Status_On(), 50, 2);
		warehousrobj.Warehouse_Status_On().isDisplayed();
		String ON = warehousrobj.Warehouse_Status_On().getAttribute("value");
		System.out.println(ON);
		Assert.assertTrue(ON.contains("on"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Status(), 50, 2);
		warehousrobj.Warehouse_Status().click();
	}

	@And("^user click on the update button$")
	public void user_click_on_the_update_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Update(), 50, 2);
		warehousrobj.Warehouse_Update().click();
	}

	@And("^user verify the status is Deactive$")
	public void user_verify_the_status_is_deactive() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Status_Off(), 50, 2);
		warehousrobj.Warehouse_Status_Off().isDisplayed();
		String Off = warehousrobj.Warehouse_Status_Off().getText();
		System.out.println(Off);
		Assert.assertEquals("In-active", Off);
	}

	@And("^user verify the Back button and click$")
	public void user_verify_the_back_button_and_click() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Back(), 50, 2);
		warehousrobj.Warehouse_Back().click();
	}

	// ********************Anandh Code-Warehouse***********************//
	@And("^Go to config manager main menu$")
	public void go_to_config_manager_main_menu() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// warehousrobj.ulsConfigManagerMainMenu(), 50, 1);
		for (int i = 0; i <= 150; i++) {
			try {
				javaHelper.scrollIntoViewAndClick(warehousrobj.ulsConfigManagerMainMenu());
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
		// warehousrobj.ulsConfigManagerMainMenu().click();
	}

	@And("^go to configuration main menu$")
	public void go_to_configuration_main_menu() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.ULSConfigurationMainMenu(), 50, 1);
		warehousrobj.ULSConfigurationMainMenu().click();
	}

	@And("^click on view button in ware house master$")
	public void click_on_view_button_in_ware_house_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseMasterViewButton(), 50, 1);
		warehousrobj.wareHouseMasterViewButton().click();
	}

	@Then("^verify list view records are non editable$")
	public void verify_list_view_records_are_non_editable() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouse_ListViewDescription(), 50, 1);
		try {
			warehousrobj.wareHouse_ListViewDescription().click();
			warehousrobj.wareHouse_ListViewDescription().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
		try {
			warehousrobj.wareHouseListViewAddress().click();
			warehousrobj.wareHouseListViewAddress().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewCountry().click();
			warehousrobj.wareHouseListViewCountry().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewState().click();
			warehousrobj.wareHouseListViewState().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewCity().click();
			warehousrobj.wareHouseListViewCity().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewZipCode().click();
			warehousrobj.wareHouseListViewZipCode().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewPhone1().click();
			warehousrobj.wareHouseListViewPhone1().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewFax().click();
			warehousrobj.wareHouseListViewFax().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewEmail().click();
			warehousrobj.wareHouseListViewEmail().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewContactPerson().click();
			warehousrobj.wareHouseListViewContactPerson().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@Then("^verify user can able to add the record in to the ware house master screen$")
	public void verify_user_can_able_to_add_the_record_in_to_the_ware_house_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseAddButton(), 50, 1);
		warehousrobj.wareHouseAddButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseDescriptionTextBox(), 50, 1);
		Assert.assertTrue(warehousrobj.wareHouseDescriptionTextBox().isDisplayed());
		for (int i = 0; i < 50; i++) {
			try {
			//waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseBackButton(), 50, 1);
			clicksAndActionsHelper.moveToElement(warehousrobj.wareHouseBackButton());
			warehousrobj.wareHouseBackButton().click();
			break;
			}catch(Exception e) {
				
			}
		}

	}

	@And("^click on search button in ware house list view$")
	public void click_on_search_button_in_ware_house_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseSearchIcon(), 50, 1);
		for (int i = 0; i <= 150; i++) {
			try {
				clicksAndActionsHelper.moveToElement(warehousrobj.wareHouseSearchIcon());
				warehousrobj.wareHouseSearchIcon().click();
				break;
			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^enter the matching data in search test box$")
	public void enter_the_matching_data_in_search_test_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseSearchTextBox(), 50, 1);
		clicksAndActionsHelper.moveToElement(warehousrobj.wareHouseSearchTextBox());
		clicksAndActionsHelper.clickOnElement(warehousrobj.wareHouseSearchTextBox());
		warehousrobj.wareHouseSearchTextBox().sendKeys(warehousedata.searchingWithMatchData);
	}

	@Then("^verify user can able to see the matching record$")
	public void verify_user_can_able_to_see_the_matching_record() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 150; i++) {
			try {
				status = driver.findElement(By.xpath("//span[text()='" + warehousedata.searchingWithMatchData + " ']")).isDisplayed();
				break;

			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		Assert.assertTrue(status);
	}

	@Then("^verify user can able to see the matching records$")
	public void verify_user_can_able_to_see_the_matching_records() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 150; i++) {
			try {
				status = driver.findElement(By.xpath("//span[text()='" + warehousedata.searchingWithMatchData1 + " ']")).isDisplayed();
				break;

			} catch (Exception e) {
				if (i == 150) {
					Assert.fail(e.getMessage());
				}

			}
		}
		Assert.assertTrue(status);
	}
	@And("^enter invalid text inputin search box$")
	public void enter_invalid_text_inputin_search_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseTextBoxCloseButton(), 50, 1);
		warehousrobj.wareHouseTextBoxCloseButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseSearchIcon(), 50, 1);
		warehousrobj.wareHouseSearchIcon().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseSearchTextBox(), 50, 1);
		clicksAndActionsHelper.moveToElement(warehousrobj.wareHouseSearchTextBox());
		clicksAndActionsHelper.clickOnElement(warehousrobj.wareHouseSearchTextBox());
		warehousrobj.wareHouseSearchTextBox().sendKeys(warehousedata.searchingWithUnmatchedData);
	}

	@Then("^verify system should not show the result for the un matched record$")
	public void verify_system_shoudl_not_show_the_result_for_the_un_matched_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseUnmatchedSearchResult(), 50, 1);
		Assert.assertTrue(warehousrobj.wareHouseUnmatchedSearchResult().isDisplayed());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseTextBoxCloseButton(), 50, 1);
		warehousrobj.wareHouseTextBoxCloseButton().click();
	}

	@Then("^verify xls file is downloded in download section$")
	public void verify_xls_file_is_downloded_in_download_section() throws Throwable {
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();

		for (File fileName : totalfiles) {
			System.out.println("File name" + fileName);
			xlsList.add(fileName.toString());
		}

		int size = xlsList.size();
		String string = xlsList.get(size - 1);
		boolean status = string.contains(warehousedata.FileNameForXlsFile);

		// Assert.assertTrue(status);
	}

	@And("^click on export button$")
	public void click_on_export_button() throws Throwable {
		for (int i = 0; i < 50; i++) {
			try {
				//waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseExportButton(), 50, 1);
				warehousrobj.wareHouseExportButton().click();
				break;
			}catch(Exception e) {
				
			}
		}

	}

	@And("^choose xls format to download the Xls file$")
	public void choose_xls_format_to_download_the_xls_file() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseExportXLSOption(), 50, 1);
		clicksAndActionsHelper.moveToElement(warehousrobj.wareHouseExportXLSOption());
		clicksAndActionsHelper.doubleClick(warehousrobj.wareHouseExportXLSOption());
		// warehousrobj.wareHouseExportXLSOption().click();
		// Thread.sleep(50000);

	}

	@And("^choose pdf format to download pdf file$")
	public void choose_pdf_format_to_download_pdf_file() throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseExportPDFOption(), 50, 2);

		// warehousrobj.wareHouseExportPDFOption().click();
		// Thread.sleep(50000);
		for (int i = 0; i < 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(warehousrobj.wareHouseExportPDFOption());
				clicksAndActionsHelper.doubleClick(warehousrobj.wareHouseExportPDFOption());
				browserHelper.SwitchToWindow(1);
				browserHelper.switchToParentWithChildClose();
				break;
			} catch (Exception e) {

			}
		}
	}

	@Then("^verify pdf file is downloded in download section$")
	public void verify_pdf_file_is_downloded_in_download_section() throws Throwable {
		String UserDirectory = System.getProperty("user.dir");
		System.out.println(UserDirectory);
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();

		for (File fileName : totalfiles) {
			System.out.println("File name" + fileName);
			pdfList.add(fileName.toString());
		}

		int size = pdfList.size();
		String string = pdfList.get(size - 1);
		boolean status = string.contains(warehousedata.FileNameForPDFFile);

		// Assert.assertTrue(status);
	}

	@And("^select the first approved record$")
	public void select_the_first_approved_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseApprovedFirstRecord(), 50, 1);
		warehousrobj.wareHouseApprovedFirstRecord().click();
	}

	@And("^Get The approved record data$")
	public void get_the_approved_record_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description1(), 50, 1);
		String description = warehousrobj.Warehouse_Description1().getAttribute("ng-reflect-model");
		testData.put("description", description);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address1(), 50, 1);
		String address = warehousrobj.Warehouse_Address1().getAttribute("ng-reflect-model");
		testData.put("address", address);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseCountryDropDownData(), 50, 1);
		String country = warehousrobj.wareHouseCountryDropDownData().getAttribute("aria-label");
		testData.put("country", country);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseStateDropDown(), 50, 1);
		String state = warehousrobj.wareHouseStateDropDown().getAttribute("aria-label");
		testData.put("state", state);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseCityDropDown(), 50, 1);
		String city = warehousrobj.wareHouseCityDropDown().getAttribute("aria-label");
		testData.put("city", city);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseZipCodeDropDOwnDataHolder(), 50,
				1);
		String ZipCode = warehousrobj.wareHouseZipCodeDropDOwnDataHolder().getAttribute("aria-label");
		testData.put("ZipCode", ZipCode);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Phone1_validation1(), 50, 1);
		String phone1 = warehousrobj.Warehouse_Phone1_validation1().getAttribute("ng-reflect-model");
		testData.put("phone1", phone1);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Fax1(), 50, 1);
		String fax = warehousrobj.Warehouse_Fax1().getAttribute("ng-reflect-model");
		testData.put("fax", fax);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Email1(), 50, 1);
		String email = warehousrobj.Warehouse_Email1().getAttribute("ng-reflect-model");
		testData.put("email", email);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ContactPerson1(), 50, 1);
		String contactPerson = warehousrobj.Warehouse_ContactPerson1().getAttribute("ng-reflect-model");
		testData.put("contactPerson", contactPerson);

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// warehousrobj.wareHouseToggleButton(), 50, 1);
		String status = warehousrobj.wareHouseToggleButton().getAttribute("value");
		testData.put("status", status);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseBackButton(), 50, 1);
		warehousrobj.wareHouseBackButton().click();
	}

	@Then("^verify System should display the currect description value$")
	public void verify_system_should_display_the_currect_description_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouse_ListViewDescription(), 50, 1);
		warehousrobj.wareHouse_ListViewDescription().getText();
		System.out.println("Description is" + warehousrobj.wareHouse_ListViewDescription().getText()+ "Summary Description is" + testData.get("description"));
		Assert.assertEquals(testData.get("description"), warehousrobj.wareHouse_ListViewDescription().getText());
	}

	@Then("^verify system should display the currect address value$")
	public void verify_system_should_display_the_currect_address_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseListViewAddress(), 50, 1);
		Assert.assertEquals(testData.get("address"), warehousrobj.wareHouseListViewAddress().getText());
	}

	@Then("^verify System should display the currect country value$")
	public void verify_system_should_display_the_currect_country_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseListViewCountry(), 50, 1);
		// Assert.assertEquals(testData.get("country"),
		// warehousrobj.wareHouseListViewCountry().getText());
		Assert.assertTrue(testData.get("country").contains(warehousrobj.wareHouseListViewCountry().getText()));
	}

	@Then("^verify system should display the currect state value$")
	public void verify_system_should_display_the_currect_state_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseListViewState(), 50, 1);
		// Assert.assertEquals(testData.get("state"),
		// warehousrobj.wareHouseListViewState().getText());
		Assert.assertTrue(testData.get("state").contains(warehousrobj.wareHouseListViewState().getText()));
	}

	@Then("^verify system should display the currect city value$")
	public void verify_system_should_display_the_currect_city_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseListViewCity(), 50, 1);
		// Assert.assertEquals(testData.get("city"),
		// warehousrobj.wareHouseListViewCity().getText());
		Assert.assertTrue(testData.get("city").contains(warehousrobj.wareHouseListViewCity().getText()));
	}

	@Then("^verify system should display the currect zip code value$")
	public void verify_system_should_display_the_currect_zip_code_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseListViewZipCode(), 50, 1);
		// Assert.assertEquals(testData.get("city"),
		// warehousrobj.wareHouseListViewCity().getText());
		// Assert.assertEquals(testData.get("ZipCode"),
		// warehousrobj.wareHouseListViewZipCode().getText());
		Assert.assertTrue(testData.get("ZipCode").contains(warehousrobj.wareHouseListViewZipCode().getText()));
	}

	@Then("^verify system should display the currect phone 1 value$")
	public void verify_system_should_display_the_currect_phone_1_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseListViewPhone1(), 50, 1);
		Assert.assertEquals(testData.get("phone1"), warehousrobj.wareHouseListViewPhone1().getText());
	}

	@Then("^verify system should display the currect fax value$")
	public void verify_system_should_display_the_currect_fax_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseListViewFax(), 50, 1);
		Assert.assertEquals(testData.get("fax"), warehousrobj.wareHouseListViewFax().getText());
	}

	@Then("^verify system should display the currect mail value$")
	public void verify_system_should_display_the_currect_mail_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseListViewEmail(), 50, 1);
		Assert.assertEquals(testData.get("email"), warehousrobj.wareHouseListViewEmail().getText());
	}

	@Then("^verify system shoudl display the currect contarct person value$")
	public void verify_system_shoudl_display_the_currect_contarct_person_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseListViewContactPerson(), 50, 1);
		Assert.assertEquals(testData.get("contactPerson"), warehousrobj.wareHouseListViewContactPerson().getText());
	}

	@Then("^verify system shoudl display the exact status of the record$")
	public void verify_system_shoudl_display_the_exact_status_of_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseStatus(), 50, 1);
		if (warehousrobj.wareHouseStatus().getText().equals("Active")) {
			Assert.assertEquals(testData.get("status"), "on");
		}

	}

	@And("^click on temp view in wareHouse master screen$")
	public void click_on_temp_view_in_warehouse_master_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseMasterTempView(), 50, 1);
		warehousrobj.wareHouseMasterTempView().click();
	}

	@Then("^verify WIP list view records are non editable$")
	public void verify_wip_list_view_records_are_non_editable() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouse_ListViewDescription(), 50, 1);
		try {
			warehousrobj.wareHouse_ListViewDescription().click();
			warehousrobj.wareHouse_ListViewDescription().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
		try {
			warehousrobj.wareHouseListViewAddress().click();
			warehousrobj.wareHouseListViewAddress().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewCountry().click();
			warehousrobj.wareHouseListViewCountry().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewState().click();
			warehousrobj.wareHouseListViewState().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewCity().click();
			warehousrobj.wareHouseListViewCity().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewZipCode().click();
			warehousrobj.wareHouseListViewZipCode().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewPhone1().click();
			warehousrobj.wareHouseListViewPhone1().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewFax().click();
			warehousrobj.wareHouseListViewFax().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewEmail().click();
			warehousrobj.wareHouseListViewEmail().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);

		try {
			warehousrobj.wareHouseListViewContactPerson().click();
			warehousrobj.wareHouseListViewContactPerson().sendKeys(Keys.ENTER);
		} catch (Exception e) {
			status = true;
		}
		Assert.assertTrue(status);
	}

	@And("^select the first record in WIP$")
	public void select_the_first_record_in_wip() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseApprovedFirstRecord(), 50, 1);
		warehousrobj.wareHouseApprovedFirstRecord().click();
	}

	@And("^Get The WIP record data$")
	public void get_the_wip_record_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description1(), 50, 1);
		String description = warehousrobj.Warehouse_Description1().getAttribute("ng-reflect-model");
		testData.put("description", description);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address1(), 50, 1);
		String address = warehousrobj.Warehouse_Address1().getAttribute("ng-reflect-model");
		testData.put("address", address);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseCountryDropDownData(), 50, 1);
		String country = warehousrobj.wareHouseCountryDropDownData().getAttribute("aria-label");
		testData.put("country", country);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseStateDropDown(), 50, 1);
		String state = warehousrobj.wareHouseStateDropDown().getAttribute("aria-label");
		testData.put("state", state);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseCityDropDown(), 50, 1);
		String city = warehousrobj.wareHouseCityDropDown().getAttribute("aria-label");
		testData.put("city", city);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseZipCodeDropDOwnDataHolder(), 50,
				1);
		String ZipCode = warehousrobj.wareHouseZipCodeDropDOwnDataHolder().getAttribute("aria-label");
		testData.put("ZipCode", ZipCode);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Phone1_validation1(), 50, 1);
		String phone1 = warehousrobj.Warehouse_Phone1_validation1().getAttribute("ng-reflect-model");
		testData.put("phone1", phone1);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Fax1(), 50, 1);
		String fax = warehousrobj.Warehouse_Fax1().getAttribute("ng-reflect-model");
		testData.put("fax", fax);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Email1(), 50, 1);
		String email = warehousrobj.Warehouse_Email1().getAttribute("ng-reflect-model");
		testData.put("email", email);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ContactPerson1(), 50, 1);
		String contactPerson = warehousrobj.Warehouse_ContactPerson1().getAttribute("ng-reflect-model");
		testData.put("contactPerson", contactPerson);

		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// warehousrobj.wareHouseToggleButton(), 50, 1);
		String status = warehousrobj.wareHouseToggleButton().getAttribute("value");
		testData.put("status", status);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.wareHouseBackButton(), 50, 1);
		warehousrobj.wareHouseBackButton().click();
	}

}
