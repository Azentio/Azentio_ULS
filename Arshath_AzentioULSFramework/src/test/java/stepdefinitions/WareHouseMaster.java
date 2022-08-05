package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
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
	ClicksAndActionsHelper click = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Warehouse_MasterObj warehousrobj = new Warehouse_MasterObj(driver);
	WarehouseTestdata warehousedata = jsonConfig.getwarehouseListByName("Maker");
	String Toast;

	@When("^user click Config Managert menu$")
	public void user_click_config_managert_menu() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.ConfigManager(), 60, 2);
		warehousrobj.ConfigManager().click();
	}

	@And("^user click list view icon of Warehouse Master$")
	public void user_click_list_view_icon_of_warehouse_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Eye_Icon(), 60, 2);
		warehousrobj.Warehouse_Eye_Icon().click();
	}

	@And("^user click on Add icon for Warehouse master$")
	public void user_click_on_add_icon_for_warehouse_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Add_Icon(), 60, 2);
		warehousrobj.Warehouse_Add_Icon().isDisplayed();
		warehousrobj.Warehouse_Add_Icon().click();
	}

	@And("^user Enter the value in description and verify it$")
	public void user_enter_the_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description(), 60, 2);
		warehousrobj.Warehouse_Description().isDisplayed();
		warehousrobj.Warehouse_Description().click();
		warehousrobj.Warehouse_Description().sendKeys(warehousedata.Description);
	}

	@And("^user Enter the value in Address field and verify it$")
	public void user_enter_the_value_in_address_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Address");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 60, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.Address);
	}

	@And("^user Enter the value in country field and verify it$")
	public void user_enter_the_value_in_country_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Country");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Country(), 60, 2);
		warehousrobj.Warehouse_Country().isDisplayed();
		warehousrobj.Warehouse_Country().click();

		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + warehousedata.country + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user Enter the value in state field and verify it$")
	public void user_enter_the_value_in_state_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("State");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_State(), 60, 2);
		warehousrobj.Warehouse_State().isDisplayed();
		warehousrobj.Warehouse_State().click();

		for (int i = 0; i < 200; i++) {
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
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Location(), 60, 2);
		warehousrobj.Warehouse_Location().isDisplayed();
		warehousrobj.Warehouse_Location().click();

		for (int i = 0; i < 50; i++) {
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
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Zipcode(), 60, 2);
		warehousrobj.Warehouse_Zipcode().isDisplayed();
		warehousrobj.Warehouse_Zipcode().click();

		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + warehousedata.Zipcode + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user Enter the value in Phone field and verify it$")
	public void user_enter_the_value_in_phone_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Phone 1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Phone1(), 60, 2);
		warehousrobj.Warehouse_Phone1().isDisplayed();
		warehousrobj.Warehouse_Phone1().click();
		warehousrobj.Warehouse_Phone1().sendKeys(warehousedata.Phone);

	}

	@And("^user Enter the value in Fax field and verify it$")
	public void user_enter_the_value_in_fax_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Fax");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Fax(), 60, 2);
		warehousrobj.Warehouse_Fax().isDisplayed();
		warehousrobj.Warehouse_Fax().click();
		warehousrobj.Warehouse_Fax().sendKeys(warehousedata.Fax);

	}

	@And("^user Enter the value in Email field and verify it$")
	public void user_enter_the_value_in_email_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Email");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Email(), 60, 2);
		warehousrobj.Warehouse_Email().isDisplayed();
		warehousrobj.Warehouse_Email().click();
		warehousrobj.Warehouse_Email().sendKeys(warehousedata.Email);
	}

	@And("^user Enter the value in Contact person field and verify it$")
	public void user_enter_the_value_in_contact_person_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Contact Person");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ContactPerson(), 60, 2);
		warehousrobj.Warehouse_ContactPerson().isDisplayed();
		warehousrobj.Warehouse_ContactPerson().click();
		warehousrobj.Warehouse_ContactPerson().sendKeys(warehousedata.Contactperson);
	}

	@And("^user save the warehouse master Record$")
	public void user_save_the_warehouse_master_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Save(), 60, 2);
		warehousrobj.Warehouse_Save().isDisplayed();
		warehousrobj.Warehouse_Save().click();
	}

	@And("^user goto the Maker Inbox and store the Referance ID$")
	public void user_goto_the_maker_inbox_and_store_the_referance_id() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Inbox(), 60, 2);
		warehousrobj.Warehouse_Inbox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_ReferanceId(), 60, 2);
		String RefId = warehousrobj.Warehouse_ReferanceId().getText();
		System.out.println(RefId);
		json.addReferanceData(RefId);

	}

	@Then("^user Click on Action Icon$")
	public void user_click_on_action_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Action(), 60, 2);
		warehousrobj.Warehouse_Action().click();
	}

	@And("^user verify the submit button and submit the Record from Maker stage$")
	public void user_verify_the_submit_button_and_submit_the_record_from_maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit(), 60, 2);
		warehousrobj.Warehouse_Submit().isDisplayed();
		warehousrobj.Warehouse_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Submit_confirmation(), 60, 2);
		warehousrobj.Warehouse_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Maker_Submit(), 60, 2);
		warehousrobj.Warehouse_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 60, 2);
		String CheckerId = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		json.addData(popupID);
		System.out.println(popupID);
	}

	// *********************Checker Approve***********************//

	@And("^user Click on Chcker Menu icon$")
	public void user_click_on_chcker_menu_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_toggle(), 60, 2);
		javaHelper.JSEClick(warehousrobj.Checker_toggle());
	}

	@And("^user Click on Checker Mailbox icon$")
	public void user_click_on_checker_mailbox_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Inbox(), 60, 2);
		warehousrobj.Checker_Inbox().click();
	}

	@And("^user Search the respective reference id and click on Action button$")
	public void user_search_the_respective_reference_id_and_click_on_action_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(
						By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button")),
				60, 2);
		driver.findElement(By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button"))
				.click();
	}

	@And("^user Click on Approve icon button$")
	public void user_click_on_approve_icon_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Approve(), 60, 2);
		warehousrobj.Checker_Approve().click();
	}

	@And("^user Enter the remarks in Action confirmation popup screen$")
	public void user_enter_the_remarks_in_action_confirmation_popup_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Approve(), 60, 2);
		warehousrobj.Checker_Alert_Approve().click();
	}

	@Then("^user Click on Remarks button in Action confirmation popup screen$")
	public void user_click_on_remarks_button_in_action_confirmation_popup_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Final_Approve(), 60, 2);
		warehousrobj.Checker_Final_Approve().click();
	}

	@Then("^user verify the Record got Approved in checker stage$")
	public void user_verify_the_record_got_approved_in_checker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 60, 2);
		Toast = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}

	@Then("^User validate the WareHouse approved record in list view$")
	public void user_validate_the_warehouse_approved_record_in_list_view() throws Throwable {
		for (int i = 0; i < 50; i++) {
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
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 60, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressReject);
	}

	@And("^user Enter the value For Email field and verify it$")
	public void user_enter_the_value_for_email_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Email");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Email(), 60, 2);
		warehousrobj.Warehouse_Email().isDisplayed();
		warehousrobj.Warehouse_Email().click();
		warehousrobj.Warehouse_Email().sendKeys(warehousedata.EmailReject);
	}

	@And("^user Click on Reject icon button$")
	public void user_click_on_reject_icon_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Reject(), 60, 2);
		warehousrobj.Checker_Reject().click();
	}

	@And("^user Enter the remarks for Reject the Record in checker$")
	public void user_enter_the_remarks_for_reject_the_record_in_checker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Alert_Reject(), 60, 2);
		warehousrobj.Checker_Alert_Reject().click();
	}

	@Then("^user Click on Remarks button for Reject confirmation Alert$")
	public void user_click_on_remarks_button_for_reject_confirmation_alert() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Final_Reject(), 60, 2);
		warehousrobj.Checker_Final_Reject().click();
	}

	@Then("^user verify the Record got Rejected in checker stage$")
	public void user_verify_the_record_got_rejected_in_checker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 60, 2);
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
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 60, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressReturn);
	}

	@And("^user Enter the value to Email field and verify it$")
	public void user_enter_the_value_to_email_field_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Email");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Email(), 60, 2);
		warehousrobj.Warehouse_Email().isDisplayed();
		warehousrobj.Warehouse_Email().click();
		warehousrobj.Warehouse_Email().sendKeys(warehousedata.EmailReturn);
	}

	// **************************@AT_WHM_T002_Return_ListView**********************//

	@And("^user Click on Return icon button$")
	public void user_click_on_return_icon_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Return(), 60, 2);
		warehousrobj.Checker_Return().click();
	}

	@And("^user Enter the remarks for Return the Record in checker$")
	public void user_enter_the_remarks_for_return_the_record_in_checker() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Alert_Return(), 60, 2);
		warehousrobj.Checker_Alert_Return().click();
	}

	@Then("^user Click on Remarks button for Return confirmation Alert$")
	public void user_click_on_remarks_button_for_return_confirmation_alert() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Checker_Alert_Return(), 60, 2);
		warehousrobj.Checker_Final_Return().click();
	}

	@Then("^user verify the Record got Returned in checker stage$")
	public void user_verify_the_record_got_returned_in_checker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Checker_Id(), 60, 2);
		Toast = warehousrobj.Warehouse_Checker_Id().getText();
		System.out.println(Toast);
	}

	// *******************@AT_WHM_T002_Return_ListView*********************//

	@And("^user click Temp view icon of Warehouse Master$")
	public void user_click_temp_view_icon_of_warehouse_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Edit_Icon(), 60, 2);
		warehousrobj.Warehouse_Edit_Icon().click();
	}

	@Then("^User validate the WareHouse Retured record in list view$")
    public void user_validate_the_warehouse_retured_record_in_list_view() throws Throwable {
		try {
		String validate = driver.findElement(By.xpath("//span[contains(text(),'" + warehousedata.AddressReturn + "')]"))
				.getText();
		System.out.println(validate);
		Assert.assertEquals(validate, warehousedata.AddressReturn);

		
		String validate1 = driver
				.findElement(By.xpath("//span[contains(text(),'" + warehousedata.EmailReturn + "')]")).getText();
		System.out.println(validate1);
		Assert.assertEquals(validate1, warehousedata.EmailReturn);
    }catch(Exception e) {
    	
    }
	}
	
	//********************@AT_WHM_T004********************//
	
    @And("^user Enter characters in numeric field$")
    public void user_enter_characters_in_numeric_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Phone1(), 60, 2);		
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
	
	//********************@AT-WHM-T005_Modification******************//
    
    @And("^user Enter the value in description and Modify it$")
    public void user_enter_the_value_in_description_and_modify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description(), 60, 2);
		warehousrobj.Warehouse_Description().isDisplayed();
		warehousrobj.Warehouse_Description().click();
		warehousrobj.Warehouse_Description().clear();
		warehousrobj.Warehouse_Description().sendKeys(warehousedata.DescriptionModify);
    }

    @And("^user Enter the value in Address field and Modify it$")
    public void user_enter_the_value_in_address_field_and_modify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 60, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().clear();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressModify);
    }
	
    @And("^user Enter the value in description and ReModify it$")
    public void user_enter_the_value_in_description_and_remodify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description(), 60, 2);
		warehousrobj.Warehouse_Description().isDisplayed();
		warehousrobj.Warehouse_Description().click();
		warehousrobj.Warehouse_Description().clear();
		warehousrobj.Warehouse_Description().sendKeys(warehousedata.DescriptionReModify);
    }

    @And("^user Enter the value in Address field and ReModify it$")
    public void user_enter_the_value_in_address_field_and_remodify_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 60, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().clear();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressReModify);
    }
	
  //********************@AT_WHM_T007_Modification_Reject******************//    
    
    @And("^user Enter the value in description and Modify Reject it$")
    public void user_enter_the_value_in_description_and_modify_reject_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description(), 60, 2);
		warehousrobj.Warehouse_Description().isDisplayed();
		warehousrobj.Warehouse_Description().click();
		warehousrobj.Warehouse_Description().clear();
		warehousrobj.Warehouse_Description().sendKeys(warehousedata.DescriptionModifyReject);
    }

    @And("^user Enter the value in Address field and Modify Reject it$")
    public void user_enter_the_value_in_address_field_and_modify_reject_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 60, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().clear();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressModifyReject);
    }
    
  //********************@AT_WHM_T008_Modification_Return******************//    
    
    @And("^user Enter the value in description and Modify Return it$")
    public void user_enter_the_value_in_description_and_modify_return_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Description(), 60, 2);
		warehousrobj.Warehouse_Description().isDisplayed();
		warehousrobj.Warehouse_Description().click();
		warehousrobj.Warehouse_Description().clear();
		warehousrobj.Warehouse_Description().sendKeys(warehousedata.DescriptionReModifyReturn);
    }

    @And("^user Enter the value in Address field and Modify Return it$")
    public void user_enter_the_value_in_address_field_and_modify_return_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Address(), 60, 2);
		warehousrobj.Warehouse_Address().isDisplayed();
		warehousrobj.Warehouse_Address().click();
		warehousrobj.Warehouse_Address().clear();
		warehousrobj.Warehouse_Address().sendKeys(warehousedata.AddressReModifyReturn);
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    //******************@AT-WHM-T009_Active_Deactive******************//
    
    @And("^user click on First Record Edit icon$")
    public void user_click_on_first_record_edit_icon() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Temp_Edit(), 60, 2);
    	warehousrobj.Warehouse_Temp_Edit().click();
    }
    
    @And("^user verify the status button$")
    public void user_verify_the_status_button() throws Throwable {
        waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Status(), 60, 2);
        warehousrobj.Warehouse_Status().isDisplayed();
    }

    @And("^user verify the status is Active$")
    public void user_verify_the_status_is_active() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Status_On(), 60, 2);
    	warehousrobj.Warehouse_Status_On().isDisplayed();
    	String ON = warehousrobj.Warehouse_Status_On().getAttribute("value");
    	System.out.println(ON);
    	Assert.assertTrue(ON.contains("on"));
        waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Status(), 60, 2);
        warehousrobj.Warehouse_Status().click();
    }

    @And("^user click on the update button$")
    public void user_click_on_the_update_button() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Update(), 60, 2);
    	warehousrobj.Warehouse_Update().click();
    }
    
    @And("^user verify the status is Deactive$")
    public void user_verify_the_status_is_deactive() throws Throwable {

    	waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Status_Off(), 60, 2);
    	warehousrobj.Warehouse_Status_Off().isDisplayed();
    	String Off = warehousrobj.Warehouse_Status_Off().getText();
    	System.out.println(Off);
    	Assert.assertEquals("In-active", Off);
    }

    @And("^user verify the Back button and click$")
    public void user_verify_the_back_button_and_click() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, warehousrobj.Warehouse_Back(), 60, 2);
        warehousrobj.Warehouse_Back().click();
    }
	
	
}
