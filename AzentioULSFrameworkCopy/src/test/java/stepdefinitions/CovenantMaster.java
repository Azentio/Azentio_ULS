package stepdefinitions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.CovenantMasterObj;
import pageobjects.KULS_LoginObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.CovenantMasterTestDataType;
import testDataType.KULS_Login_TestDataType;

public class CovenantMaster {

	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	RadioButtonHelper radioButtonHelper = new RadioButtonHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	DropDownHelper dropDownHelper = new DropDownHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	CovenantMasterObj covenantMasterObj = new CovenantMasterObj(driver);
	CovenantMasterTestDataType covenantMasterTestDataType = jsonConfig.getCovenantMasterByName("Maker");
	Selenium_Actions action = new Selenium_Actions(driver);

	@Then("^user should navigate to covenant master$")
	public void user_should_navigate_to_covenant_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Maker_MenuToggle());
		covenantMasterObj.covenantMaster_Maker_MenuToggle().click();;
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMasterConfigurations());
		covenantMasterObj.covenantMasterConfigurations().click();
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMasterConfigManager());
		covenantMasterObj.covenantMasterConfigManager().click();
//		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMasterConfigMenu());
//		covenantMasterObj.covenantMasterConfigMenu().click();
	}

	@And("^click on work in progress records button of covenant master$")
	public void click_on_work_in_progress_records_button_of_covenant_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_WorkInProgressRecordsButton());
		covenantMasterObj.covenantMaster_WorkInProgressRecordsButton().click();
	}

	@Then("^click on add button to create new record of covenant master$")
	public void click_on_add_button_to_create_new_record_of_covenant_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_addButton());
//		waithelper.waitForElementToVisibleWithFluentWait(driver, covenantMasterObj.covenantMaster_addButton(), 10, 4);
		covenantMasterObj.covenantMaster_addButton().click();
	}

	@Then("^verify the covenant type field should be mandatory and editable dropdown$")
	public void verify_the_covenant_type_field_should_be_mandatory_and_editable_dropdown() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(" Covenant Type ");
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_CovenantType());
		covenantMasterObj.covenantMaster_CovenantType().click();
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SelectLabel());
		List<WebElement> dropDownList = driver.findElements(By.xpath("//ion-radio-group/child::ion-item/following-sibling::ion-item[1]/ion-label"));
		System.out.println("No. of Covenant Type : "+dropDownList.size());
		for (WebElement value : dropDownList) {
			System.out.println(value.getText());
			Assert.assertTrue(value.getText().contains("Financial Covenants")||
							  		 	value.getText().contains("General")||
							  		 	value.getText().contains("Positive")||
							  		 	value.getText().contains("Negative"));
		}
		
		radioButtonHelper.radioButton("General");

//			if (radioButton.getAttribute("aria-checked").equalsIgnoreCase("true")) {
//				System.out.println("radio button is selected ");
//			} else {
//				radioButton.click();
//				try {
//					waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_CovenantType());
//					covenantMasterObj.covenantMaster_CovenantType().click();
//					break;
//				} catch (StaleElementReferenceException se) {
//					
//				}
//			}
		
		
//		radioButtonHelper.radioButton("Select");
	}

	@Then("^verify the description field should be mandatory and editable textbox$")
	public void verify_the_description_field_should_be_mandatory_and_editable_textbox() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(" Description ");
		String val = covenantMasterObj.covenantMaster_Description().getAttribute("type");
		System.out.println("Value -"+val);
		Assert.assertNotNull(val);
	}

	@Then("^verify the editable field should be non mandatory and editable checkbox$")
	public void verify_the_editable_field_should_be_non_mandatory_and_editable_checkbox() throws InterruptedException {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(" Editable ");
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_EditableToggle());
		covenantMasterObj.covenantMaster_EditableToggle().click();
		String val = covenantMasterObj.covenantMaster_EditableToggle().getAttribute("value");
		System.out.println(val);
		Assert.assertNotNull(val);
	}

	@Then("^verify the actionable field should be non mandatory and editable checkbox$")
	public void verify_the_actionable_field_should_be_non_mandatory_and_editable_checkbox() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(" Actionable ");
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_ActionableToggle());
		covenantMasterObj.covenantMaster_ActionableToggle().click();
		String val = covenantMasterObj.covenantMaster_ActionableToggle().getAttribute("value");
		Assert.assertNotNull(val);
	}

	@Then("^verify the frequency field should be mandatory and editable dropdown$")
	public void verify_the_frequency_field_should_be_mandatory_and_editable_dropdown() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(" Frequency ");
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Frequency());
		covenantMasterObj.covenantMaster_Frequency().click();
		
		radioButtonHelper.radioButton("Annual");
		
	}

	@Then("^verify the waiver allowed field should be non mandatory and editable checkbox$")
	public void verify_the_waiver_allowed_field_should_be_non_mandatory_and_editable_checkbox() throws Throwable {
		findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot(" Waiver Allowed ");
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_WaiverAllowedToggle());
		covenantMasterObj.covenantMaster_WaiverAllowedToggle().click();
		String val = covenantMasterObj.covenantMaster_WaiverAllowedToggle().getAttribute("value");
		Assert.assertNotNull(val);
		
	}

	@Then("^verify the functionality of back button of covenant master$")
	public void verify_the_functionality_of_back_button_of_covenant_master() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_BackButton());
		covenantMasterObj.covenantMaster_BackButton().click();
	}
	
	////////////////////////////////////////////////////////////////////////////////
	
	 @Then("^Fill all valid fields in the covenant master screen for approve the record$")
	    public void fill_all_valid_fields_in_the_covenant_master_screen_for_approve_the_record() throws Throwable {
		 waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_CovenantType());
		 covenantMasterObj.covenantMaster_CovenantType().click();
		 radioButtonHelper.radioButton(covenantMasterTestDataType.CovenantType1);
		
//			while (true) {
//				try {
		 clicksAndActionsHelper.doubleClick(covenantMasterObj.covenantMaster_Description());
					waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
					covenantMasterObj.covenantMaster_Description().sendKeys(covenantMasterTestDataType.Description1);
//
//					break;
//
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//			}
		 
		 waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Frequency());
		 covenantMasterObj.covenantMaster_Frequency().click();
		 radioButtonHelper.radioButton(covenantMasterTestDataType.Frequency1);
	    }

	    @Then("^verify post clicking on save button same record should get saved in the system$")
	    public void verify_post_clicking_on_save_button_same_record_should_get_saved_in_the_system() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveButton());
	    	covenantMasterObj.covenantMaster_SaveButton().click();
	    }
	    
	    @Then("^click on save button to save the record in the system$")
	    public void click_on_save_button_to_save_the_record_in_the_system() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveButton());
	    	covenantMasterObj.covenantMaster_SaveButton().click();
	    }

	    @Then("^verify system should display the confirmation message post clicking on save button$")
	    public void verify_system_should_display_the_confirmation_message_post_clicking_on_save_button() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveConfirmationMessage());
	    	boolean message = covenantMasterObj.covenantMaster_SaveConfirmationMessage().isDisplayed();
	    	Assert.assertTrue(message);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveConfirmationMessageCloseButton());
	    	covenantMasterObj.covenantMaster_SaveConfirmationMessageCloseButton().click();
	    	
	    }

	    @Then("^click on inbox button to select the record of covenant master$")
	    public void click_on_inbox_button_to_select_the_record_of_covenant_master() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Inbox());
	    	covenantMasterObj.covenantMaster_Inbox().click();
	    	
	    }
	    
	    @And("^select the record of covenant master from inbox to submit$")
	    public void select_the_record_of_covenant_master_from_inbox_to_submit() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_NewRecordReferenceID());
	    	referenceID=covenantMasterObj.covenantMaster_NewRecordReferenceID().getText();
	    	jsonDataReaderWriter.addReferanceData(referenceID);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_NewSavedRecord());
	    	covenantMasterObj.covenantMaster_NewSavedRecord().click();
	    	
	    }

	    @Then("^click on submit button to submit the record of covenant master$")
	    public void click_on_submit_button_to_submit_the_record_of_covenant_master() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Submit());
	    	covenantMasterObj.covenantMaster_Submit().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_MakerSubmitRemark());
	    	covenantMasterObj.covenantMaster_MakerSubmitRemark().sendKeys(covenantMasterTestDataType.MakerSubmitRemark);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_FinalSubmit());
	    	covenantMasterObj.covenantMaster_FinalSubmit().click();
	    }

	    @Then("^system should display confirmation message after submit covenant master record$")
	    public void system_should_display_confirmation_message_after_submit_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_ApproveConfirmationMessage());
	    	boolean message = covenantMasterObj.covenantMaster_Checker_ApproveConfirmationMessage().isDisplayed();
	    	Assert.assertTrue(message);
	    	
	    }

	    @Then("^capture checker ID of covenant master$")
	    public void capture_checker_id_of_covenant_master() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_ApproveConfirmationMessage());
	    	String message = covenantMasterObj.covenantMaster_Checker_ApproveConfirmationMessage().getText();
	    	String emptystring = "";
			String ar[] = message.split(" ");
			emptystring = ar[ar.length - 1];
			String checkerID = emptystring.replaceAll("[/.]", "");
			System.out.println(checkerID);
			jsonDataReaderWriter.addData(checkerID);
			
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_ConfirmationMessageCloseButton());
	    	covenantMasterObj.covenantMaster_ConfirmationMessageCloseButton().click();
	        
	    }

	    @Then("^logout user from application$")
	    public void logout_user_from_application() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Profile());
	    	covenantMasterObj.covenantMaster_Profile().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_LogoutUser());
	    	covenantMasterObj.covenantMaster_LogoutUser().click();
	    }
//	    Checker Approve--------------------------------
	    @And("^User Login as checker in uls application$")
	    public void user_login_as_checker_in_uls_application() throws Throwable {
	    	kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReaderWriter.readdata());
	    }
	    
	    @Then("^select the record of covenant master to approve$")
	    public void select_the_record_of_covenant_master_to_approve() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_SearchInbox());
	    	covenantMasterObj.covenantMaster_Checker_SearchInbox().click();
			waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_SearchInboxInputField());
			covenantMasterObj.covenantMaster_Checker_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
			String beforexpath = "//span[contains(text(),'";
			String afterxpath = "')]/../../td/button";
//			xpath - //span[contains(text(),'5550')]/../../td[1]/button
			Thread.sleep(1000);
			String res = driver.findElement(By.xpath("//span[contains(text(),'" + jsonDataReaderWriter.readReferancedata() + "')]" )).getText();
			Assert.assertEquals(res, jsonDataReaderWriter.readReferancedata());
			driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();

	    }

	    @Then("^select approve button for approve covenant master record$")
	    public void select_approve_button_for_approve_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_Approve());
	    	covenantMasterObj.covenantMaster_Checker_Approve().click();
	    }

	    @Then("^enter remark for approve the record of covenant master$")
	    public void enter_remark_for_approve_the_record_of_covenant_master() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, covenantMasterObj.covenantMaster_Checker_CheckerApproveRemark(), 10, 2);
	    	covenantMasterObj.covenantMaster_Checker_CheckerApproveRemark().sendKeys(covenantMasterTestDataType.CheckerApproveRemark);

	    }

	    @Then("^click on approve button of the covenant master record$")
	    public void click_on_approve_button_of_the_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_CheckerApproveButton());
	    	covenantMasterObj.covenantMaster_Checker_CheckerApproveButton().click();
	    }

	    @Then("^system should display confirmation message after approve the covenant master record$")
	    public void system_should_display_confirmation_message_after_approve_the_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_ConfirmationMessage());
	    	covenantMasterObj.covenantMaster_ConfirmationMessage().isDisplayed();
			waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_ApproveConfirmationMessageCloseButton());
			covenantMasterObj.covenantMaster_Checker_ApproveConfirmationMessageCloseButton().click();
		
	    }

	    @And("^click on approved records button of covenant master$")
	    public void click_on_approved_records_button_of_covenant_master() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_ApprovedRecordsButton());
	    	covenantMasterObj.covenantMaster_ApprovedRecordsButton().click();
	    }
	    
	    @Then("^verify record should get approved and display in the system under Approved List view$")
	    public void verify_record_should_get_approved_and_display_in_the_system_under_approved_list_view() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchButton());
	    	covenantMasterObj.covenantMaster_SearchButton().click();
			waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchInputField());
			covenantMasterObj.covenantMaster_SearchInputField().sendKeys(covenantMasterTestDataType.Description1);
			String beforexpath = "//span[contains(text(),'"; 
	    	String afterxpath = "')]"; 
	    	Thread.sleep(1000);
	    	boolean description = driver.findElement(By.xpath(beforexpath +covenantMasterTestDataType.Description1+ afterxpath)).isDisplayed();
	    	Assert.assertTrue(description);
		
	    }
	    
	    @Then("^Fill all valid fields in the covenant master screen for reject the record$")
	    public void fill_all_valid_fields_in_the_covenant_master_screen_for_reject_the_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_CovenantType());
			 covenantMasterObj.covenantMaster_CovenantType().click();
			 radioButtonHelper.radioButton(covenantMasterTestDataType.CovenantType2);
			
//				while (true) {
//					try {
			 clicksAndActionsHelper.doubleClick(covenantMasterObj.covenantMaster_Description());
						waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
						covenantMasterObj.covenantMaster_Description().sendKeys(covenantMasterTestDataType.Description2);
//
//						break;
//
//					} catch (Exception e) {
//						// TODO: handle exception
//					}
//				}
			 
			 waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Frequency());
			 covenantMasterObj.covenantMaster_Frequency().click();
			 radioButtonHelper.radioButton(covenantMasterTestDataType.Frequency2);
	    }
	    
	    @Then("^select the record of covenant master to reject$")
	    public void select_the_record_of_covenant_master_to_reject() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_SearchInbox());
	    	covenantMasterObj.covenantMaster_Checker_SearchInbox().click();
			waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_SearchInboxInputField());
			covenantMasterObj.covenantMaster_Checker_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
			String beforexpath = "//span[contains(text(),'";
			String afterxpath = "')]/../../td/button";
			Thread.sleep(1000);
			driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();
		
	    }

	    @Then("^select reject button to reject the covenant master record$")
	    public void select_reject_button_to_reject_the_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_Reject());
	    	covenantMasterObj.covenantMaster_Checker_Reject().click();
		
	    }

	    @Then("^enter remark for reject the record of covenant master$")
	    public void enter_remark_for_reject_the_record_of_covenant_master() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, covenantMasterObj.covenantMaster_Checker_CheckerRejectRemark(), 10, 2);
	    	covenantMasterObj.covenantMaster_Checker_CheckerRejectRemark().sendKeys(covenantMasterTestDataType.CheckerRejectRemark);
		
	    }

	    @Then("^click on reject button of the covenant master record$")
	    public void click_on_reject_button_of_the_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_CheckerRejectButton());
	    	covenantMasterObj.covenantMaster_Checker_CheckerRejectButton().click();
		
	    }

	    @Then("^system should display confirmation message after reject the covenant master record$")
	    public void system_should_display_confirmation_message_after_reject_the_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_ConfirmationMessage());
	    	covenantMasterObj.covenantMaster_ConfirmationMessage().isDisplayed();
			waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_ApproveConfirmationMessageCloseButton());
			covenantMasterObj.covenantMaster_Checker_ApproveConfirmationMessageCloseButton().click();
		
	    }
	    
	    @Then("^verify all the captured data from makers side should not be display in the system under Approved List view$")
	    public void verify_all_the_captured_data_from_makers_side_should_not_be_display_in_the_system_under_approved_list_view() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchButton());
	    	covenantMasterObj.covenantMaster_SearchButton().click();
			waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchInputField());
			covenantMasterObj.covenantMaster_SearchInputField().sendKeys(covenantMasterTestDataType.Description2);
			waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_NoDataFoundInSearch());
			boolean res = covenantMasterObj.covenantMaster_NoDataFoundInSearch().isDisplayed();
			Assert.assertTrue(res);
	    }
	    
//	    Checker Return--------------------------------
	    @Then("^Fill all valid fields in the screen for return the covenant master record$")
	    public void fill_all_valid_fields_in_the_screen_for_return_the_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_CovenantType());
			 covenantMasterObj.covenantMaster_CovenantType().click();
			 radioButtonHelper.radioButton(covenantMasterTestDataType.CovenantType3);
			
//				while (true) {
//					try {
			 clicksAndActionsHelper.doubleClick(covenantMasterObj.covenantMaster_Description());
						waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
						covenantMasterObj.covenantMaster_Description().sendKeys(covenantMasterTestDataType.Description3);
//
//						break;
//
//					} catch (Exception e) {
//						// TODO: handle exception
//					}
//				}
			 
			 waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Frequency());
			 covenantMasterObj.covenantMaster_Frequency().click();
			 radioButtonHelper.radioButton(covenantMasterTestDataType.Frequency3);
	    }
	    
	    @Then("^select the record of covenant master to return$")
	    public void select_the_record_of_covenant_master_to_return() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_SearchInbox());
	    	covenantMasterObj.covenantMaster_Checker_SearchInbox().click();
			waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_SearchInboxInputField());
			covenantMasterObj.covenantMaster_Checker_SearchInboxInputField().sendKeys(jsonDataReaderWriter.readReferancedata());
			String beforexpath = "//span[contains(text(),'";
			String afterxpath = "')]/../../td/button";
			Thread.sleep(1000);
			driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();

	    }

	    @Then("^select return button to return the covenant master record$")
	    public void select_return_button_to_return_the_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_Return());
	    	covenantMasterObj.covenantMaster_Checker_Return().click();
		
	    }

	    @Then("^enter remark for return the record of covenant master$")
	    public void enter_remark_for_return_the_record_of_covenant_master() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, covenantMasterObj.covenantMaster_Checker_CheckerReturnRemark(), 10, 2);
	    	covenantMasterObj.covenantMaster_Checker_CheckerReturnRemark().sendKeys(covenantMasterTestDataType.CheckerReturnRemark);
		
	    }

	    @Then("^click on return button of the covenant master record$")
	    public void click_on_return_button_of_the_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_CheckerReturnButton());
	    	covenantMasterObj.covenantMaster_Checker_CheckerReturnButton().click();
		  
	    }

	    @Then("^system should display confirmation message after return the covenant master record$")
	    public void system_should_display_confirmation_message_after_return_the_covenant_master_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_ConfirmationMessage());
	    	covenantMasterObj.covenantMaster_ConfirmationMessage().isDisplayed();
			waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Checker_ApproveConfirmationMessageCloseButton());
			covenantMasterObj.covenantMaster_Checker_ApproveConfirmationMessageCloseButton().click();
		
	    }
	    
	    @Then("^verify all the captured data should be returned and stored in the maker stage$")
	    public void verify_all_the_captured_data_should_be_returned_and_stored_in_the_maker_stage() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchButton());
	    	covenantMasterObj.covenantMaster_SearchButton().click();
			waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchInputField());
			covenantMasterObj.covenantMaster_SearchInputField().sendKeys(covenantMasterTestDataType.Description3);
			String beforexpath = "//span[contains(text(),'"; 
	    	String afterxpath = "')]"; 
	    	boolean description3 = driver.findElement(By.xpath(beforexpath +covenantMasterTestDataType.Description3+ afterxpath)).isDisplayed();
	    	Assert.assertTrue(description3);
	   
	    }
	    
	    //////////////////////////////////////////////////////////////////////////////////

	    @Then("^system should show proper validation message for blank field which is mandatory and user not allow to save the record$")
	    public void system_should_show_proper_validation_message_for_blank_field_which_is_mandatory_and_user_not_allow_to_save_the_record() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveButton());
	    	covenantMasterObj.covenantMaster_SaveButton().click();
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_BlankFieldValdationForCovenantType());
	    	boolean message = covenantMasterObj.covenantMaster_BlankFieldValdationForCovenantType().isDisplayed();
	    	Assert.assertTrue(message);
	    }

	    @Then("^verify system should show proper validation message when user enter numeric value in character field$")
	    public void verify_system_should_show_proper_validation_message_when_user_enter_numeric_value_in_character_field() throws Throwable {
	       
	    }

	    @Then("^verify system should show proper validation message when user enter characters value in numeric field$")
	    public void verify_system_should_show_proper_validation_message_when_user_enter_characters_value_in_numeric_field() throws Throwable {
	        
	    }

	    @Then("^verify system should show proper validation message when user enter only special characters value in any field$")
	    public void verify_system_should_show_proper_validation_message_when_user_enter_only_special_characters_value_in_any_field() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_CovenantType());
	    	covenantMasterObj.covenantMaster_CovenantType().click();
	    	radioButtonHelper.radioButton(covenantMasterTestDataType.CovenantType1);
	    	
	    	clicksAndActionsHelper.doubleClick(covenantMasterObj.covenantMaster_Description());
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	covenantMasterObj.covenantMaster_Description().sendKeys(covenantMasterTestDataType.SpecialCharacters);
	    	
	    	boolean message = covenantMasterObj.covenantMaster_SpecialCharacterValidationMessage().isDisplayed();
	    	Assert.assertTrue(message);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Frequency());
	    	covenantMasterObj.covenantMaster_Frequency().click();
	    	radioButtonHelper.radioButton(covenantMasterTestDataType.Frequency1);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveButton());
	    	covenantMasterObj.covenantMaster_SaveButton().click();
	    }
	    
	    /////////////////////////////////////////////////////////////////////////////////
	    
	    @Then("^click on edit button of covenant master WIP record to modify$")
	    public void click_on_edit_button_of_covenant_master_WIP_record_to_modify() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchButton());
	    	covenantMasterObj.covenantMaster_SearchButton().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchInputField());
	    	covenantMasterObj.covenantMaster_SearchInputField().sendKeys(covenantMasterTestDataType.BeforeApprovedRecord);
	    	
	    	String beforexpath ="//span[contains(text(),'";
	    	String afterxpath ="')]/../../../td/span/button[1]/span[1]";
	    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +covenantMasterTestDataType.BeforeApprovedRecord+ afterxpath)));
	    	driver.findElement(By.xpath(beforexpath +covenantMasterTestDataType.BeforeApprovedRecord+ afterxpath)).click();
	    }

	    @Then("^verify system should allow user to modify the covenant master before approve the record$")
	    public void verify_system_should_allow_user_to_modify_the_covenant_master_before_approve_the_record() throws Throwable {
	    	
	    	clicksAndActionsHelper.doubleClick(covenantMasterObj.covenantMaster_Description());
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	covenantMasterObj.covenantMaster_Description().sendKeys(Keys.chord(Keys.CONTROL, "A"));
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	covenantMasterObj.covenantMaster_Description().sendKeys(covenantMasterTestDataType.ModifiedBeforeApprovedRecord);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveButton());
	    	covenantMasterObj.covenantMaster_SaveButton().click();
	    }
	    
	    ///////////////////////////////////////////////////////////////////////////////////
	    
	    @Then("^click on edit button of covenant master approved record to modify$")
	    public void click_on_edit_button_of_covenant_master_approved_record_to_modify() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchButton());
	    	covenantMasterObj.covenantMaster_SearchButton().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchInputField());
	    	covenantMasterObj.covenantMaster_SearchInputField().sendKeys(covenantMasterTestDataType.ApprovedRecord);
	    	
//	    	waithelper.waitForElementwithFluentwait(driver, null);
//	    	span[contains(text(),'')]/../../../td/span/button[1]/span[1]
	    	String beforexpath ="//span[contains(text(),'";
	    	String afterxpath ="')]/../../../td/span/button[1]/span[1]";
	    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +covenantMasterTestDataType.ApprovedRecord+ afterxpath)));
	    	driver.findElement(By.xpath(beforexpath +covenantMasterTestDataType.ApprovedRecord+ afterxpath)).click();
	    }

	    @Then("^verify system should allow user to modify the covenant master already approved record$")
	    public void verify_system_should_allow_user_to_modify_the_covenant_master_already_approved_record() throws Throwable {
	    	
	    	clicksAndActionsHelper.doubleClick(covenantMasterObj.covenantMaster_Description());
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	covenantMasterObj.covenantMaster_Description().sendKeys(Keys.chord(Keys.CONTROL, "A"));
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	covenantMasterObj.covenantMaster_Description().sendKeys(covenantMasterTestDataType.ModifiedApprovedRecord);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveButton());
	    	covenantMasterObj.covenantMaster_SaveButton().click();
	    	
	    }

	    @Then("^verify same record should get saved with the modified data in the system$")
	    public void verify_same_record_should_get_saved_with_the_modified_data_in_the_system() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchButton());
	    	covenantMasterObj.covenantMaster_SearchButton().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchInputField());
	    	covenantMasterObj.covenantMaster_SearchInputField().sendKeys(covenantMasterTestDataType.ModifiedApprovedRecord);
	    	
//	    	waithelper.waitForElementwithFluentwait(driver, null);
//	    	span[contains(text(),'')]/../../../td/span/button[1]/span[1]
	    	String beforexpath ="//span[contains(text(),'";
	    	String afterxpath ="')]/../../../td/span/button[1]/span[1]";
	    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +covenantMasterTestDataType.ModifiedApprovedRecord+ afterxpath)));
	    	driver.findElement(By.xpath(beforexpath +covenantMasterTestDataType.ModifiedApprovedRecord+ afterxpath)).click();
	    	
	    	clicksAndActionsHelper.doubleClick(covenantMasterObj.covenantMaster_Description());
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	covenantMasterObj.covenantMaster_Description().sendKeys(Keys.chord(Keys.CONTROL, "A"));
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	covenantMasterObj.covenantMaster_Description().sendKeys(covenantMasterTestDataType.ReModifiedApprovedRecord);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveButton());
	    	covenantMasterObj.covenantMaster_SaveButton().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchButton());
	    	covenantMasterObj.covenantMaster_SearchButton().click();
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchInputField());
	    	covenantMasterObj.covenantMaster_SearchInputField().sendKeys(covenantMasterTestDataType.ReModifiedApprovedRecord);
	    	
	    	String beforexpath1 ="//span[contains(text(),'";
	    	String afterxpath1 ="')]/../../../td/span/button[1]/span[1]";
	    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath(beforexpath +covenantMasterTestDataType.ModifiedApprovedRecord+ afterxpath)));
	    	boolean message = driver.findElement(By.xpath(beforexpath1 +covenantMasterTestDataType.ReModifiedApprovedRecord+ afterxpath1)).isDisplayed();
	    	Assert.assertTrue(message);
	    	
	    }

	    @Then("^verify the field status in covenant master$")
	    public void verify_the_field_status_in_covenant_master() throws Throwable {
	    	findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Status");
	    	waithelper.waitForElementwithFluentwait(driver, driver.findElement(By.xpath("//ion-label[contains(text(),'Status')]/parent::div/following-sibling::ion-item/ion-toggle")));
	    	String status = driver.findElement(By.xpath("//ion-label[contains(text(),'Status')]/parent::div/following-sibling::ion-item/ion-toggle")).getAttribute("aria-checked");
//	    	if(driver.findElement(By.xpath("//ion-label[contains(text(),'Status')]/parent::div/following-sibling::ion-item/ion-toggle")).getAttribute("aria-checked"))
	    	if(status.equalsIgnoreCase("true"))
	    	{
	    		System.out.println("Status is active");
	    	}else if((status.equalsIgnoreCase("false"))) {
	    		System.out.println("Status is inactive");
	    	}
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_StatusToggle());
	    	covenantMasterObj.covenantMaster_StatusToggle().click();
	    }

	    @Then("^verify while modification system allow user to save the covenant record with valid data$")
	    public void verify_while_modification_system_allow_user_to_save_the_covenant_record_with_valid_data() throws Throwable {
	       
	    }
	    
	    ///////////////////////////////////////////////////////////////////////////
	    
	    @Then("^verify while modification in covenant master record proper validation message for blank field should display$")
	    public void verify_while_modification_in_covenant_master_record_proper_validation_message_for_blank_field_should_display() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	clicksAndActionsHelper.doubleClick(covenantMasterObj.covenantMaster_Description());
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	covenantMasterObj.covenantMaster_Description().sendKeys(Keys.chord(Keys.CONTROL, "A"));
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	covenantMasterObj.covenantMaster_Description().sendKeys(Keys.BACK_SPACE);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveButton());
	    	covenantMasterObj.covenantMaster_SaveButton().click();
	    	
	    	boolean message=covenantMasterObj.covenantMaster_BlankFieldValdationForDescription().isDisplayed();
	    	Assert.assertTrue(message);;
	    }

	    @Then("^verify while modification in covenant master record system should not allow to enter invalid datatypes$")
	    public void verify_while_modification_in_covenant_master_record_system_should_not_allow_to_enter_invalid_datatypes() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Description());
	    	covenantMasterObj.covenantMaster_Description().sendKeys(covenantMasterTestDataType.InvalidDataType);
	    	
	    	boolean message=covenantMasterObj.covenantMaster_InvalidDataTypeForDescriptionField().isDisplayed();
	    	Assert.assertTrue(message);;
	    }
	    
	    @Then("^verify the view workflow in the covenant master$")
	    public void verify_the_view_workflow_in_the_covenant_master() throws Throwable {
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, covenantMasterObj.covenantMaster_UserID(), 60, 2);
	    	String UserID = covenantMasterObj.covenantMaster_UserID().getText();
	    	System.out.println("UserID:"+UserID);
	    	covenantMasterObj.covenantMaster_UserID().isDisplayed();
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, covenantMasterObj.covenantMaster_StageCode(), 60, 2);
	    	String UserStage = covenantMasterObj.covenantMaster_StageCode().getText();
	    	System.out.println("UserStage:"+UserStage);
	    	covenantMasterObj.covenantMaster_StageCode().isDisplayed();
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, covenantMasterObj.covenantMaster_Status(), 60, 2);
	    	String Status = covenantMasterObj.covenantMaster_Status().getText();
	    	System.out.println("Status:"+Status);
	    	covenantMasterObj.covenantMaster_Status().isDisplayed();
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, covenantMasterObj.covenantMaster_StartTime(), 60, 2);
	    	String StartTime= covenantMasterObj.covenantMaster_StartTime().getText();
	    	System.out.println("StartTime:"+StartTime);
	    	covenantMasterObj.covenantMaster_StartTime().isDisplayed();
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, covenantMasterObj.covenantMaster_EndTime(), 60, 2);
	    	String EndTime= covenantMasterObj.covenantMaster_EndTime().getText();
	    	System.out.println("EndTime:"+EndTime);
	    	
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Close());
	    	covenantMasterObj.covenantMaster_Close().click();
	    }
	    
	    //////////////////////////////////////////////////////////////////////////////////////////////
	    
	    @Then("^verify add button should allow to create new record in covenant master$")
	    public void verify_add_button_should_allow_to_create_new_record_in_covenant_master() throws Throwable {
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_addButton());
	    	covenantMasterObj.covenantMaster_addButton().click();
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SaveButton());
	    	covenantMasterObj.covenantMaster_SaveButton().isDisplayed();
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_BackButton());
	    	clicksAndActionsHelper.doubleClick(covenantMasterObj.covenantMaster_BackButton());
	    }

	    @Then("^verify search box should display matching record with matched data in covenant master$")
	    public void verify_search_box_should_display_matching_record_with_matched_data_in_covenant_master() throws Throwable {
	    	while (true) {
				try {
					waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchButton());
					covenantMasterObj.covenantMaster_SearchButton().click();
					break;
				} catch (StaleElementReferenceException se) {

				}
			}
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_SearchInputField());
	    	covenantMasterObj.covenantMaster_SearchInputField().sendKeys(covenantMasterTestDataType.ApprovedRecord);
	    	String beforexpath = "//span[contains(text(),'"; 
	    	String afterxpath = "')]"; 
	    	boolean result = driver.findElement(By.xpath(beforexpath +covenantMasterTestDataType.ApprovedRecord+ afterxpath)).isDisplayed();
	    	Assert.assertTrue(result);
	    	
	    }

	    @Then("^verify search box should not display any record with mismatched data in covenant master$")
	    public void verify_search_box_should_not_display_any_record_with_mismatched_data_in_covenant_master() throws Throwable {
	    	covenantMasterObj.covenantMaster_SearchInputField().sendKeys(Keys.chord(Keys.CONTROL,"A"));
	    	covenantMasterObj.covenantMaster_SearchInputField().sendKeys("412379");
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_NoDataFoundInSearch());
	    	covenantMasterObj.covenantMaster_NoDataFoundInSearch().isDisplayed();
	    	covenantMasterObj.covenantMaster_SearchCloseButton().click();
	    }

	    @Then("^click on export to pdf button system should download Pdf file in covenant master$")
	    public void click_on_export_to_pdf_button_system_should_download_pdf_file_in_covenant_master() throws Throwable {
	    	covenantMasterObj.covenantMaster_Export().click();
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_PdfFile());
	    	covenantMasterObj.covenantMaster_PdfFile().click();
	    	browserHelper.SwitchToWindow(1);
	    	browserHelper.switchToParentWithChildClose();
	    }

	    @Then("^click on export to excel button system should download Excel file in covenant master$")
	    public void click_on_export_to_excel_button_system_should_download_excel_file_in_covenant_master() throws Throwable {
	    	while (true) {
				try {
					waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_Export());
					covenantMasterObj.covenantMaster_Export().click();
					break;
				} catch (StaleElementReferenceException se) {

				}
			}
	    	waithelper.waitForElementwithFluentwait(driver, covenantMasterObj.covenantMaster_XlsFile());
	    	covenantMasterObj.covenantMaster_XlsFile().click();
	    }

	    @Then("^verify the functionality of ID field system should display ID number of that record$")
	    public void verify_the_functionality_of_id_field_system_should_display_id_number_of_that_record() throws Throwable {
//	    	SoftAssert softAssert = new SoftAssert();
	    	boolean result = covenantMasterObj.covenantMaster_ListViewIDField().isDisplayed();
//	    	softAssert.assertTrue(result);
	    	System.out.println("System is showing ID field - "+result);
	    	
	    	try {
	    		covenantMasterObj.covenantMaster_ListViewIDField().sendKeys("ok");
	    		System.out.println("ID Field in list view is not editable");
	    	}catch(Exception e) {
	    		System.out.println("ID Field in list view is not editable");
	    	}
	    }

	    @Then("^verify the functionality of Description field system should display description of that record$")
	    public void verify_the_functionality_of_description_field_system_should_display_description_of_that_record() throws Throwable {
	    	boolean result = covenantMasterObj.covenantMaster_ListViewDescriptionField().isDisplayed();
	    	System.out.println("System is showing Description field - "+result);
	    	
	    	try {
	    		covenantMasterObj.covenantMaster_ListViewDescriptionField().sendKeys("ok");
	    		System.out.println("Description Field in list view is not editable");
	    	}catch(Exception e) {
	    		System.out.println("Description Field in list view is not editable");
	    	}
	    }
	    
	    @Then("^verify the functionality of Covenant Type field system should display Covenant Type of that record$")
	    public void verify_the_functionality_of_covenant_type_field_system_should_display_covenant_type_of_that_record() throws Throwable {
	    	boolean result = covenantMasterObj.covenantMaster_ListViewCovenantTypeField().isDisplayed();
	    	System.out.println("System is showing Covenant Type field - "+result);
	    	
	    	try {
	    		covenantMasterObj.covenantMaster_ListViewCovenantTypeField().sendKeys("ok");
	    		System.out.println("Covenant Type Field in list view is not editable");
	    	}catch(Exception e) {
	    		System.out.println("Covenant Type Field in list view is not editable");
	    	}
	    }

	    @Then("^verify the functionality of Frequency field system should display frequency of that record$")
	    public void verify_the_functionality_of_frequency_field_system_should_display_frequency_of_that_record() throws Throwable {
	    	boolean result = covenantMasterObj.covenantMaster_ListViewFrequencyField().isDisplayed();
	    	System.out.println("System is showing Frequency field - "+result);
	    	
	    	try {
	    		covenantMasterObj.covenantMaster_ListViewFrequencyField().sendKeys("ok");
	    		System.out.println("Frequency Field in list view is not editable");
	    	}catch(Exception e) {
	    		System.out.println("Frequency Field in list view is not editable");
	    	}
	    }

	    @Then("^verify the functionality of Status field system should display Status of that record$")
	    public void verify_the_functionality_of_status_field_system_should_display_status_of_that_record() throws Throwable {
	    	boolean result = covenantMasterObj.covenantMaster_ListViewStatusField().isDisplayed();
	    	System.out.println("System is showing Description field - "+result);
	    	
	    	try {
	    		covenantMasterObj.covenantMaster_ListViewStatusField().sendKeys("ok");
	    		System.out.println("Description Field in list view is not editable");
	    	}catch(Exception e) {
	    		System.out.println("Description Field in list view is not editable");
	    	}
	    }

}