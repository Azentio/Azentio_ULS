package stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.tools.ant.filters.LineContains.Contains;
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
import pageobjects.AllocationMasterObject;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.AllocationMasterTestData;
import testDataType.KULS_Login_TestDataType;

public class AllocationMaster extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	AllocationMasterObject allocationMstObj = new AllocationMasterObject(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);

	AllocationMasterTestData allocationMasterData = jconfig.getAllocationMasterByName("Maker");
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	String Toast;
	List<String> xlsList = new ArrayList<>();
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00075\\Downloads\\UlsTestDataDesign.xlsx", "AllocationMasterTestData", "Data Set ID") ;
	Map<String, String> testData;
	
	
	 @And("^Click the eye icon of the alloction master$")
	    public void click_the_eye_icon_of_the_alloction_master() throws Throwable {
		 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_EyeIcon(), 60, 2);
		 allocationMstObj.AllocationMaster_EyeIcon().click();
	    }
	 @Then("^Click the add button in the allocation master$")
	    public void click_the_add_button_in_the_allocation_master() throws Throwable {
		 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_AddButton(), 60, 2);
		 allocationMstObj.AllocationMaster_AddButton().click();
	    }

	    @And("^Validate the allocation master screen open with all fields$")
	    public void validate_the_allocation_master_screen_open_with_all_fields() throws Throwable {
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_SaveButton(), 60, 2);
			 allocationMstObj.AllocationMaster_SaveButton().isDisplayed();
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_BackButton(), 60, 2);
			 allocationMstObj.AllocationMaster_BackButton().isDisplayed();
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_DescriptionTitle(), 60, 2);
			 allocationMstObj.AllocationMaster_DescriptionTitle().isDisplayed();
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_SaveButton(), 60, 2);
			 allocationMstObj.AllocationMaster_AllocationCodeTitle().isDisplayed();
	    }
	    @Then("^Enter the description fields in the allocation master$")
	    public void enter_the_description_fields_in_the_allocation_master() throws Throwable {
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_DiscriptionTextBox(), 60, 2);
			 allocationMstObj.AllocationMaster_DiscriptionTextBox().click();
			 testData = exceldata.getTestdata("AT-ALM-001_D1");
			 allocationMstObj.AllocationMaster_DiscriptionTextBox().sendKeys(testData.get("Description"));
	    }

	    @And("^Enter the allocation code value in the allocation master$")
	    public void enter_the_allocation_code_value_in_the_allocation_master() throws Throwable {
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_AllocationCodeTextBox(), 60, 2);
			 allocationMstObj.AllocationMaster_AllocationCodeTextBox().click();
			 allocationMstObj.AllocationMaster_AllocationCodeTextBox().sendKeys(testData.get("Allocation code"));
	    }

	    @Then("^Save the record in allocation master$")
	    public void save_the_record_in_allocation_master() throws Throwable {
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_SaveButton(), 60, 2);
			 allocationMstObj.AllocationMaster_SaveButton().click();
			 
	    }
	    @And("^Validate the sucess popup$")
	    public void validate_the_sucess_popup() throws Throwable {
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_PopUp(), 60, 2);
	    	String popup = allocationMstObj.AllocationMaster_PopUp().getText();
			System.out.println("The system displays the confirmation message post clicking on Save button" + popup);
			Assert.assertTrue(popup.contains("Success"));
	    }
	    @Then("^Click the inbox in allocation master$")
	    public void click_the_inbox_in_allocation_master() throws Throwable {
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_Inbox(), 60, 2);
			 allocationMstObj.AllocationMaster_Inbox().click();
	    }

	    @And("^Search the record in allocation master$")
	    public void search_the_record_in_allocation_master() throws Throwable {
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_PopUp(), 60, 2);
			 allocationMstObj.AllocationMaster_SeachButton().click();
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_SearchText(), 60, 2);
				action.getClickAndActionsHelper().moveToElement(allocationMstObj.AllocationMaster_SearchText());
				allocationMstObj.AllocationMaster_SearchText().click();
				allocationMstObj.AllocationMaster_SearchText().sendKeys(testData.get("Search"));
			 
	    }

	    @Then("^Get the reference id and store it in json in allocation master$")
	    public void get_the_reference_id_and_store_it_in_json_in_allocation_master() throws Throwable {
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_GetRefId(), 60, 2);
			 String RefId = allocationMstObj.AllocationMaster_GetRefId().getText();
				System.out.println(RefId);
				exceldata.updateTestData("AT-ALM-002_D1", "Reference ID", RefId);
				//json.addReferanceData(RefId);
	    }

	    @And("^Click the action icon of respective allocation master$")
	    public void click_the_action_icon_of_respective_allocation_master() throws Throwable {
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_ActionIcon(), 60, 2);
			 allocationMstObj.AllocationMaster_ActionIcon().click();
	    }
	    @Then("^Submit the record in allocation master$")
	    public void submit_the_record_in_allocation_master() throws Throwable {
			 //waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_PopUp(), 60, 2);
			 waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_SubmitButton(), 60, 2);
			 allocationMstObj.AllocationMaster_SubmitButton().click();
				waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_SubmitOKButton(), 60, 2);
				allocationMstObj.AllocationMaster_SubmitOKButton().click();
				waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_FinalSubmitButton(), 60,
						2);
				allocationMstObj.AllocationMaster_FinalSubmitButton().click();
				waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerId(), 60, 2);
				String CheckerId = null;
				CheckerId = allocationMstObj.AllocationMaster_CheckerId().getText();
				System.out.println(CheckerId);
				String Space = " ";
				String split[] = CheckerId.split(" ");
				Space = split[split.length - 1];
				String popupID = Space.replaceAll("[/.]", "");
				exceldata.updateTestData("AT-ALM-002_D1", "Checker id", popupID);
				//json.addData(popupID);
				System.out.println(popupID);
			}



	    
	 // *******Checker Stage***********************//
		@Given("^Get the URL and login as Checkers$")
		public void get_the_url_and_login_as_checkers() throws Throwable {
			String kulsApplicationUrl = configFileRead.getApplicationUrl();
			driver.get(kulsApplicationUrl);
			testData = exceldata.getTestdata("AT-ALM-002_D1");
			System.out.println(testData.get("Checker id"));
			login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
		}

		@Then("^Click the menu icon in allocation Master$")
		public void click_the_menu_icon_in_allocation_Master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_Menu(), 30, 2);

			action.getJavascriptHelper().JSEClick(allocationMstObj.AllocationMaster_Menu());

		}

		@And("^Click  the inbox in checker allocation Master$")
		public void click_the_inbox_in_checker_allocation_Master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerInbox(), 60, 2);
			allocationMstObj.AllocationMaster_CheckerInbox().click();

		}
		

		@Then("^search the reference id and click the respective action icon in allocation Master$")
		public void search_the_reference_id_and_click_the_respective_action_icon_in_allocation_Master() throws Throwable {
//	    	waitHelper.waitForElementToVisibleWithFluentWait(driver,
//					driver.findElement(By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button")),60, 2);
			testData = exceldata.getTestdata("AT-WHM-T002_D1");
			for (int i = 0; i < 60; i++) {
				try {
					driver.findElement(
							By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
							.click();
					break;
				} catch (Exception e) {

				}
			}

		}

		@And("^Click the approve button in the allocation Master$")
		public void click_the_approve_button_in_the_allocation_Master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerApproveButton(),
					60, 2);
			allocationMstObj.AllocationMaster_CheckerApproveButton().click();

		}

		@Then("^Enter the alert approve remark in allocation Master$")
		public void enter_the_alert_approve_remark_in_allocation_Master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerAlertApprove(), 60,
					2);
			allocationMstObj.AllocationMaster_CheckerAlertApprove().click();
		}

		@And("^Give the final approve in the allocation Master$")
		public void give_the_final_approve_in_the_allocation_Master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerFinalApprove(), 60,
					2);
			allocationMstObj.AllocationMaster_CheckerFinalApprove().click();
		}

		@Then("^Verify the record get approved in allocation Master$")
		public void verify_the_record_get_approved_in_allocation_Master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerId(), 60, 2);
			Toast = allocationMstObj.AllocationMaster_CheckerId().getText();
			System.out.println(Toast);
			Assert.assertEquals(Toast, "Record APPROVED Successfully");
		}

		///****************List View verification**************************///
		@Then("^Verify the approved record is available in the list view in allocation master$")
	    public void verify_the_approved_record_is_available_in_the_list_view_in_allocation_master() throws Throwable {
				for (int i = 0; i < 20; i++) {
					try {

						String validate = driver
								.findElement(By.xpath("//span[contains(text(),'" +allocationMstObj.AllocationMaster_DiscriptionTextBox() + "')]"))
								.getText();
						System.out.println(validate);
						Assert.assertEquals(validate, allocationMstObj.AllocationMaster_DiscriptionTextBox());
					} catch (Exception e) {
					}
				}
			}
		
////*****************Checker Reject**************************//
@And("^Click the reject button in the allocation Master$")
public void click_the_reject_button_in_the_allocation_Master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerRejectButton(),
			60, 2);
	allocationMstObj.AllocationMaster_CheckerRejectButton().click();

}

@Then("^Enter the alert reject remark in allocation Master$")
public void enter_the_alert_reject_remark_in_allocation_Master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerAlertReject(), 60,
			2);
	allocationMstObj.AllocationMaster_CheckerAlertReject().click();
}

@And("^Give the final reject in the allocation Master$")
public void give_the_final_reject_in_the_allocation_Master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerFinalReject(), 60,
			2);
	allocationMstObj.AllocationMaster_CheckerFinalReject().click();
}

@Then("^Verify the record get rejected in allocation Master$")
public void verify_the_record_get_rejected_in_allocation_Master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerId(), 60, 2);
	Toast = allocationMstObj.AllocationMaster_CheckerId().getText();
	System.out.println(Toast);
	Assert.assertEquals(Toast, "Record REJECTED Successfully");
}
///*************List view rejection validation**********************//
@Then("^Verify the rejected record is not available in the list view in allocation master$")
public void verify_the_rejected_record_is_not_available_in_the_list_view_in_allocation_master() throws Throwable {
	for (int i = 0; i < 50; i++) {

	}
	try {
		String validate = driver
				.findElement(By.xpath("//span[contains(text(),'" + allocationMstObj.AllocationMaster_DiscriptionTextBox() + "')]"))
				.getText();
		System.out.println(validate);
		Assert.assertEquals(validate, allocationMstObj.AllocationMaster_DiscriptionTextBox());
	} catch (Exception e) {
		System.out.println("The Rejected Record Not in the List view " + allocationMstObj.AllocationMaster_DiscriptionTextBox());
	}
}
///*************************Checker Return**********************************///
@And("^Click the return button in the allocation Master$")
public void click_the_return_button_in_the_allocation_Master() throws Throwable {
waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerReturnButton(),
		60, 2);
allocationMstObj.AllocationMaster_CheckerReturnButton().click();

}

@Then("^Enter the alert return remark in allocation Master$")
public void enter_the_alert_return_remark_in_allocation_Master() throws Throwable {
waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerAlertReturn(), 60,
		2);
allocationMstObj.AllocationMaster_CheckerAlertReturn().click();
}

@And("^Give the final return in the allocation Master$")
public void give_the_final_return_in_the_allocation_Master() throws Throwable {
waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerFinalReturn(), 60,
		2);
allocationMstObj.AllocationMaster_CheckerFinalReturn().click();
}

@Then("^Verify the record get returned in allocation Master$")
public void verify_the_record_get_returned_in_allocation_Master() throws Throwable {
waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_CheckerId(), 60, 2);
Toast = allocationMstObj.AllocationMaster_CheckerId().getText();
System.out.println(Toast);
}

///***********************Return List View Validation*********************************///
@Then("^Verify the Returned record is available in the list view in allocation master$")
public void verify_the_returned_record_is_available_in_the_list_view_in_allocation_master() throws Throwable {
	for (int i = 0; i < 20; i++) {

	}
	try {
		String validate = driver
				.findElement(By.xpath("//span[contains(text(),'" + allocationMstObj.AllocationMaster_AllocationCodeTextBox() + "')]"))
				.getText();
		System.out.println(validate);
		Assert.assertEquals(validate, allocationMstObj.AllocationMaster_AllocationCodeTextBox());
	} catch (Exception e) {

	}
}
@And("^Click the temp view of the alloction master$")
public void click_the_temp_view_of_the_alloction_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_TempViewButton(), 60, 2);
	allocationMstObj.AllocationMaster_TempViewButton().click();
}
@And("^keep the mandatory field as blank and save the record and validate it in allocation master$")
public void keep_the_mandatory_field_as_blank_and_save_the_record_and_validate_it_in_allocation_master() throws Throwable {
	
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
@Then("^Validate the save button by filling invalid data$")
public void validate_the_save_button_by_filling_in_valid_data() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_TempViewButton(), 60, 2);
	allocationMstObj.AllocationMaster_AllocationCodeTextBox().click();
	allocationMstObj.AllocationMaster_AllocationCodeTextBox().sendKeys("*%%*");
	WebElement errorPopUp = driver.findElement(By.xpath("//ion-badge[contains(text(),' Alphanumeric characters allowed')]"));
	String expectedErrorText = "Alphanumeric characters allowed";
	String actualErrorText = errorPopUp.getText();
	if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
		System.out.println("The system was not allow the record to save as we enter the invalid details.The Popup validation message is" + actualErrorText);
	} else {
		System.out.println("The actual and expected result are not same.The Popup validation message is" + actualErrorText);
	}
	Assert.assertEquals("Alphanumeric characters allowed", actualErrorText);

	
}
///*****************List view validation*********************///
@Then("^Verify the values in the list view is not editable in allocation master$")
public void verify_the_values_in_the_list_view_is_not_editable_in_allocation_master() throws Throwable {
	String xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]";
	// action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
	try {
		driver.findElement(By.xpath(xpath)).click();
	} catch (NoSuchElementException e) {
		System.out.println("Verified status field is not editable only displayable");
	}
	

}

@And("^Verify the functionality of add button in allocation master$")
public void verify_the_functionality_of_add_button_in_allocation_master() throws Throwable {
  waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_AddButton(), 60, 2);
	Assert.assertEquals(allocationMstObj.AllocationMaster_AddButton().isDisplayed(), true);
}

@Then("^To verify the functionality of Search box with matching data in alloction master list view$")
public void to_verify_the_functionality_of_search_box_with_matching_data_in_alloction_master_list_view() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.AllocationMaster_ListViewSearch(), 60, 2);
	for (int i = 0; i < 20; i++) {
		try {
			allocationMstObj.AllocationMaster_ListViewSearch().click();
			break;
		} catch (Exception e) {

		}
	}

	allocationMstObj.AllocationMaster_ListViewSearchText().click();
	allocationMstObj.AllocationMaster_ListViewSearchText().sendKeys(allocationMasterData.ListViewSearch);
	Assert.assertEquals(allocationMstObj.AllocationMaster_ListViewSearchText().isDisplayed(), true);
}
@And("^To verify the functionality of Search box with mismatch data in allocation master in list view$")
public void to_verify_the_functionality_of_search_box_with_mismatch_data_in_allocation_master_in_list_view() throws Throwable {
	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

	for (int i = 0; i < 20; i++) {
		try {
			allocationMstObj.AllocationMaster_ListViewSearch().click();
			break;
		} catch (Exception e) {

		}
	}
	allocationMstObj.AllocationMaster_ListViewSearchText().click();
	allocationMstObj.AllocationMaster_ListViewSearchText().sendKeys(allocationMasterData.ListViewSearchUnmatchedData);
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
@Then("^To verify the functionality of Export to PDF button in allocation master in list view$")
public void to_verify_the_functionality_of_export_to_pdf_button_in_allocation_master_in_list_view() throws Throwable {
	for (int i = 0; i < 20; i++) {
		try {
			allocationMstObj.exportIcon().click();
			break;
		} catch (Exception e) {

		}
	}

	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, allocationMstObj.exportToPDF(), 60, 3);
	allocationMstObj.exportToPDF().click();
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
		if (fileName.getName().equalsIgnoreCase("AllocationMasterFormDataFile.pdf")) {
			System.out.println("Downloaded file present in system");
			break;
		} else if (i == length - 1) {
			System.out.println("Downloaded file present does not exist in system");
		}

	}
	action.getBrowserHelper().switchToParentWithChildClose();
}
@And("^To verify the functionality of Export to Excel button in allocation master list view$")
public void to_verify_the_functionality_of_export_to_excel_button_in_allocation_master_list_view() throws Throwable {
	for (int i = 0; i < 20; i++) {
		try {
			allocationMstObj.exportIcon().click();
			break;
		} catch (Exception e) {

		}
	}
	        action.getClickAndActionsHelper().moveToElement(allocationMstObj.exportToExcel());
			allocationMstObj.exportToExcel().click();
Thread.sleep(2000);
	
	
	String UserDirectory = System.getProperty("user.dir");
    //System.out.println(UserDirectory);
    String substring = UserDirectory.substring(0, 21) + "Downloads";
    substring.replaceAll("/", "//");
    System.out.println(substring);
    File file = new File(substring);
    File[] totalfiles = file.listFiles();
    for (File fileName : totalfiles) {
        System.out.println("File name" + fileName);
        xlsList.add(fileName.toString());
    }
   // int size = xlsList.size();
    //String string = xlsList.get(size - 1);
   // boolean status = string.contains(AllocationMasterFormData.FileNameForXlsFile);
}
//*************Allocation Details Creation*********************
@Then("^Click the add button in allocation details$")
public void click_the_add_button_in_allocation_details() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.allocationDetail_AddButton(), 60, 2);
	allocationMstObj.allocationDetail_AddButton().click(); 
}
@And("^Choose the allocation based value in allocation detail$")
public void choose_the_allocation_based_value_in_allocation_detail() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.allocationDetail_AllocationBasedOn_Dropdown(), 60, 2);
	allocationMstObj.allocationDetail_AllocationBasedOn_Dropdown().click();
	for (int i = 0; i < 20; i++) {
		try {
	
	//driver.findElement(By.xpath("//ion-label[text()='"+allocationMasterData.AllocationBasedOn+"']/following-sibling::ion-radio")).click();
			driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("Allocation Based On")
					+ "')]/following-sibling::ion-radio")).click();
			break;
		}
	
	catch(Exception e) {
		
	}
	}
}
@Then("^Fill the Level No in allocation Details$")
public void fill_the_level_no_in_allocation_details() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.allocationDetail_LevelNo(), 60, 2);
	allocationMstObj.allocationDetail_LevelNo().click();
	allocationMstObj.allocationDetail_LevelNo().sendKeys(testData.get("Level No"));

}
@And("^Choose the order by value in allocation Details$")
public void choose_the_order_by_value_in_allocation_details() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.allocationDetail_OrderBy_Dropdown(), 60, 2);
	allocationMstObj.allocationDetail_OrderBy_Dropdown().click();
	for (int i = 0; i < 20; i++) {
		try {
			driver.findElement(By.xpath("//ion-label[contains(text(),'"+testData.get("Order By")+"')]/following-sibling::ion-radio")).click();
		}
		catch (Exception e) {
		}
		}
		
	}

@Then("^Click the save button in allocation details$")
public void click_the_save_button_in_allocation_details() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.allocationDetail_SaveButton(), 60, 2);
	allocationMstObj.allocationDetail_SaveButton().click();
}
@Then("^Click the first eye icon in allocation master list view$")
public void click_the_first_eye_icon_in_allocation_master_list_view() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, allocationMstObj.ListView_FirstEyeIcon(), 60, 2);
	allocationMstObj.ListView_FirstEyeIcon().click();
}

}
