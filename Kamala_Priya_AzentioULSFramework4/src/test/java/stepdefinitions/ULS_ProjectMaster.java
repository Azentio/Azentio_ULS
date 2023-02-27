package stepdefinitions;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.RadioButtonHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.KULS_LoginObj;
import pageobjects.ProjectMasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class ULS_ProjectMaster {

	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper=new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	RadioButtonHelper radioButtonHelper = new RadioButtonHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ProjectMasterObj projectMasterObj = new ProjectMasterObj(driver);
	Selenium_Actions seleniumactions= new Selenium_Actions(driver);
	//ProjectMasterTestDataType projectMasterTestDataType=jsonConfig.getProjectMasterByName("Maker");
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00073\\Downloads\\UlsTestDataDesign.xlsx","ProjectMaster","Data Set ID");
	Map<String, String> testData;

	@And("^click on eye icon of project master$")
	public void click_on_eye_icon_of_project_master() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_EyeIcon(), 60, 2);
    	projectMasterObj.projectMaster_EyeIcon().click();
	}
	 
    @Then("^click on add button$")
    public void click_on_add_button() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_AddButton(), 60, 2);
    	projectMasterObj.projectMaster_AddButton().click();
    }
    @Then("^Choose the data set id for invalid data types in project master$")
    public void choose_the_data_set_id_for_invalid_data_types_in_project_master() throws Throwable {
   testData=excelData.getTestdata("AT-PM-T004-D1");
}
    @Then("^choose the data set id for modification with invalid data$")
    public void choose_the_data_set_id_for_modification_with_invalid_data() throws Throwable {
    	   testData=excelData.getTestdata("AT-PM-T007-D1");

    }
    @Then("^verify system should not allow to enter invalid datatypes in project master$")
    public void verify_system_should_not_allow_to_enter_invalid_datatypes_in_project_master() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_NameOfTheProjectInputField(), 60, 2);
    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys(testData.get("ProjectInvalidInput"));
    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_InvalidDatatypeValidationMessage(), 60, 2);
    	String validationmsg = projectMasterObj.projectMaster_InvalidDatatypeValidationMessage().getText();
    	System.out.println("Invalid datatype validation message - "+validationmsg);
    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_InvalidDatatypeValidationMessage(), 60, 2);
    	boolean message = projectMasterObj.projectMaster_InvalidDatatypeValidationMessage().isDisplayed();
    	Assert.assertEquals(message, true);
    	
      }
    @Then("^click on edit button of record to modify in project master$")
    public void click_on_edit_button_of_record_to_modify_in_project_master() throws Throwable {
    	//waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_Search(), 60, 2);
    	//projectMasterObj.projectMaster_Search().click();
    	//waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_SearchInputField(), 60, 2);
    	//projectMasterObj.projectMaster_SearchInputField().sendKeys(testData.get("RecordForBlankMessage"));
    	//Thread.sleep(2000);
    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_ModifiedRecordEditButton(), 60, 2);
    	projectMasterObj.projectMaster_ModifiedRecordEditButton().click();
    	    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_NameOfTheProjectInputField(), 60, 2);
    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys(Keys.chord(Keys.CONTROL,"A"));
    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_NameOfTheProjectInputField(), 60, 2);
    	projectMasterObj.projectMaster_NameOfTheProjectInputField().sendKeys(Keys.BACK_SPACE);
}
    
    @And("^Click the project setup edit icon in project master for validation$")
	public void click_the_project_setup_edit_icon_in_project_master_for_validation() throws Throwable {

    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectmakertempedit(), 60, 5);
    	projectMasterObj.projectmakertempedit().click();

	}

	@And("^Verify the Values in List view should be non editable$")
	public void verify_the_values_in_list_view_should_be_non_editable() throws Throwable {

		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified product code field is not editable only displayable");
		}

	}

	@And("^Verify the functionality of Add button$")
	public void verify_the_functionality_of_add_button() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.addIcon(), 60, 2);

		// Assert.assertEquals(project.addIcon().isDisplayed(), true);
		projectMasterObj.addIcon().click();

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.GoBack(), 60, 2);
		projectMasterObj.GoBack().click();

	}

	@And("^Verify the functionality of View in approved records button$")
	public void verify_the_functionality_of_view_in_approved_records_button() throws Throwable {

		//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.viewsummary(), 60, 2);
	
		for(int i=0; i<20; i++){
			try {
				//project.viewsummary().click();
				seleniumactions.getClickAndActionsHelper().doubleClick(projectMasterObj.viewsummary());
				break;
			} catch (Exception e) {
			
			}
		}
		

		//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, project.viewclose(), 60, 2);
		
	for(int i=0; i<20; i++) {
		try {
			seleniumactions.getClickAndActionsHelper().doubleClick(projectMasterObj.viewclose());
			//project.viewclose().click();l
			break;
		} catch (Exception e) {
		
		}
	}
		

	}

	@And("^Click the inbox icon in maker for project master validation$")
	public void click_the_inbox_icon_in_maker_for_project_master_validation() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.InboxIcon(), 60, 3);
		projectMasterObj.InboxIcon().click();
	}

	@And("^Verify the functionality of Search box with matching data$")
	public void verify_the_functionality_of_search_box_with_matching_data() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.searchIcon(), 30, 2);
		for (int i = 0; i < 20; i++) {
			try {
				projectMasterObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.productViewSearchText(),
				30, 2);
		projectMasterObj.productViewSearchText().sendKeys(testData.get("productViewSearchText"));

		String xpath = "//tr[1]/td[3]/p-celleditor[1]/span[1]";
		String productcode = null;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath(xpath)), 60, 2);

		productcode = driver.findElement(By.xpath(xpath)).getText();

	    System.out.println(productcode);

	}

	@And("^Click the inbox action edit icon in project master validation$")
	public void click_the_inbox_action_edit_icon_in_project_master_validation() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.inboxactionicon(), 30, 2);
		projectMasterObj.inboxactionicon().click();

	}

	@And("^Verify the functionality of Selarch box with mismatch data$")
	public void verify_the_functionality_of_search_box_with_mismatch_data() throws Throwable {

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();
		for (int i = 0; i < 20; i++) {
			try {
				projectMasterObj.searchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.productViewSearchText(),
				30, 2);
		projectMasterObj.productViewSearchText().sendKeys(testData.get("MismatchedData3"));
		Thread.sleep(1000);
		String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
						driver.findElement(By.xpath(xpath)), 60, 2);
				Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
				break;
			} catch (Exception e) {

			}
		}

		driver.findElement(By.xpath("//input[@mode='ios']//following-sibling::i")).click();

	}

	@And("^Verify the functionality of Export to PDF button$")
	public void verify_the_functionality_of_export_to_pdf_button() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.exportIcon(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				projectMasterObj.exportIcon().click();
				break;
			} catch (Exception e) {

			}
		}

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.pdfOption(), 60, 3);
		// Assert.assertEquals(project.pdfOption().isDisplayed(), true);
		projectMasterObj.pdfOption().click();
		String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		File[] totalfiles = file.listFiles();
		for (int i = 0; i < 20; i++) {
			try {
				for (File fileName : totalfiles) {
					if (fileName.getName().equalsIgnoreCase("ProductMasterFile.pdf")) {
						System.out.println("Downloaded file present in system");
						break;
					} else {
						// System.out.println("Downloaded file present does not exist in system");
					}

				}
				break;

			} catch (Exception e) {

			}
		}

		seleniumactions.getBrowserHelper().switchToParentWithChildClose();

	}

	@And("^Verify the functionality of Export to Excel button$")
	public void verify_the_functionality_of_export_to_excel_button() throws Throwable {

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.exportIcon(), 60, 2);
		projectMasterObj.exportIcon().click();

		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, projectMasterObj.xlsOption(), 60, 3);
		// Assert.assertEquals(project.xlsOption().isDisplayed(), true);
		projectMasterObj.xlsOption().click();

	}
	 @Then("^choose the data set id for list view verification in project master$")
	    public void choose_the_data_set_id_for_list_view_verification_in_project_master() throws Throwable {
		 testData=excelData.getTestdata("AT-PM-T016-D1");
	    }
	 @And("^Click the building details add icon in project master$")
	    public void click_the_building_details_add_icon_in_project_master() throws Throwable {
		 seleniumactions.getJavascriptHelper().scrollIntoView(projectMasterObj.buildingaddbutton());
		 waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.buildingaddbutton(), 60, 5);
		 projectMasterObj.buildingaddbutton().click();
	        
	    }
	 @And("^Click the action edit icon project master for mandatoryField validation$")
	    public void click_the_action_edit_icon_project_master_for_mandatoryfield_validation() throws Throwable {
	    	
		 waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.actioneditmaker(), 60, 5);
		 projectMasterObj.actioneditmaker().click();
	   	        
	    }
	 @And("^Verify the impact when user enters only special characters value in any field$")
	    public void verify_the_impact_when_user_enters_only_special_characters_value_in_any_field() throws Throwable {
	    	
		 waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.BuildingName(), 60, 5);
		 projectMasterObj.BuildingName().click();
		 projectMasterObj.BuildingName().sendKeys(testData.get("BuildingName"));
	    	String attr1 = projectMasterObj.BuildingNameinput().getAttribute("ng-reflect-model");
	    	Assert.assertEquals(attr1, testData.get("BuildingName"));
	        
	    }
	 @And("^Verify the impact when user enter numeric value in character field$")
	    public void verify_the_impact_when_user_enter_numeric_value_in_character_field() throws Throwable {
	    	
	    	//help.waitForElementToVisibleWithFluentWait(driver, project.VerifiedBy(), 60, 5);
	    	
	    	for(int i=0; i<20; i++) {
	    		try {
	    			projectMasterObj.VerifiedBy().click();
	    			projectMasterObj.VerifiedBy().sendKeys(testData.get("VerifiedBy"));
	    	    	break;
				} catch (Exception e) {
					
				}
	    	}
	    	
	    	String attr1 = projectMasterObj.VerifiedByinput().getAttribute("ng-reflect-model");
	    	Assert.assertEquals(attr1, testData.get("VerifiedBy"));
	    	
	        
	    	
	    }
	 
	 @And("^Verify the impact when user enter characters  value in numeric field$")
	    public void verify_the_impact_when_user_enter_characters_value_in_numeric_field() throws Throwable {
	    	
	    	seleniumactions.getJavascriptHelper().scrollIntoView(projectMasterObj.RegNo());
	    	
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.RegNo(), 60, 5);
	    	projectMasterObj.RegNo().click();
	    	projectMasterObj.RegNo().sendKeys(testData.get("RegNo"));
	    	String attr= projectMasterObj.RegNo().getAttribute("ng-reflect-model");
	    	Assert.assertNotEquals(attr,(testData.get("RegNo")));
	    	
	        
	    }
	 @Then("^Click the save button in project master$")
	    public void click_the_save_button_in_project_master() throws Throwable {
			
			seleniumactions.getJavascriptHelper().scrollIntoView(projectMasterObj.newrecordsave());
			
			waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.newrecordsave(), 60, 5);
			projectMasterObj.newrecordsave().click();
			
			
	        
	    }

	    @And("^Verify the impact when user keep any mandatory field blank$")
	    public void verify_the_impact_when_user_keep_any_mandatory_field_blank() throws Throwable {
	    	
	    	WebElement nameErrorMessage = driver
					.findElement(By.xpath("//digital-form-error//ion-badge"));
			String expectedErrorText = "Required field";
			String actualErrorText = nameErrorMessage.getText();
			if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
				System.out.println(
						"The actual and expected result are same.The Popup validation message is" + actualErrorText);
			} else {
				System.out.println(
						"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
			}
	    	
	        
	    }
	    @And("^user Click on Menu icon$")
		public void user_click_on_menu_icon() throws Throwable {
			
	    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.menuChecker(), 60, 2);
	    	projectMasterObj.menuChecker().click();
	 
		}

		@And("^user Click on Mailbox icon$")
		public void user_click_on_mailbox_icon() throws Throwable {
			
			waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.inboxiconChecker(), 60, 2);
			projectMasterObj.inboxiconChecker().click();
	 
		}

		@And("^Search the respective reference id and click on Action button$")
		public void search_the_respective_reference_id_and_click_on_action_button() throws Throwable {
		
		    for (int i = 0; i <20; i++) {
	        
		    	try {
		           
		    		driver.findElement(By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
		            .click();
		            break;
	              
		    	}
	         
		    	catch (Exception e) {
		    		
		    	}
		    		
		    }

		}

		@And("^user Click on Approve icon$")
		public void user_click_on_approve_icon() throws Throwable {
		   
			waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.CheckerApprove(), 60, 2);
			projectMasterObj.CheckerApprove().click();
		    
		}

		@And("^user Enter the remarks in Action confirmation popup$")
	    public void user_enter_the_remarks_in_action_confirmation_popup() throws Throwable {
			
			waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.popupremark(), 60, 2);
			projectMasterObj.popupremark().sendKeys("Approve");
		   
		}

		@Then("^user Click on Remarks button in Action confirmation popup$")
	    public void user_click_on_remarks_button_in_action_confirmation_popup() throws Throwable {
			
			waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.popupapprove(), 60, 2);
			projectMasterObj.popupapprove().click();

	    }

		@Then("^user verify the Record got Approved$")
	    public void user_verify_the_record_got_approved() throws Throwable {
			waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.recordMsgChecker(), 60, 2);
		   String Toast;
		   Toast = projectMasterObj.recordMsgChecker().getText();
		   System.out.println(Toast);
		   Assert.assertEquals(Toast, "Record APPROVED Successfully");
	    }
		 @Then("^choose the data set id for blank field validation in project master$")
		    public void choose_the_data_set_id_for_blank_field_validation_in_project_master() throws Throwable {
testData=excelData.getTestdata("AT-PM-T019-D1");
		 }
		 @Then("^User validate the updated record in list view$")
		    public void user_validate_the_updated_record_in_list_view() throws Throwable {
		        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'" + subProductMasterRetailData.ProductCode + "')]")), 60, 2);
		        for (int i = 0; i <20; i++) {
		            try {
		                String validate = driver.findElement(By.xpath("//span[contains(text(),'"+testData.get("ProjectCode")+"')]"))
		                        .getText();
		                System.out.println(validate);
		                Assert.assertEquals(validate, testData.get("ProjectCode"));
		                break;

		            } catch (NoSuchElementException e) {


		            }

		        }
		 }
		 @Given("^Get the URL and login as Checker in project master$")
		    public void get_the_url_and_login_as_checker_in_project_master() throws Throwable {
			 String kulsApplicationUrl = configFileReader.getApplicationTransactionUrl();
				driver.get(kulsApplicationUrl);
				
				// System.out.println(testData.get("Checker id"));
				kulsLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
		    }
	 
		    @And("^choose the data set id for checker approval in report master$")
		    public void choose_the_data_set_id_for_checker_approval_in_report_master() throws Throwable {
		    	testData=excelData.getTestdata("AT-PM-T017-D1");
		    }

		    @And("^choose the data set id for checker reject in project master$")
		    public void choose_the_data_set_id_for_checker_reject_in_project_master() throws Throwable {
		    	testData=excelData.getTestdata("AT-PM-T017-D2");
		    }
		    
		    @And("^choose the data set id for checker return in project master$")
		    public void choose_the_data_set_id_for_checker_return_in_project_master() throws Throwable {
		    	testData=excelData.getTestdata("AT-PM-T018-D1");
		    }

		    @And("^user Click on Reject icon$")
			   public void user_click_on_reject_icon() throws Throwable {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.CheckerReject(), 60, 2);
		    	projectMasterObj.CheckerReject().click();
			
			}

			@And("^user Enter the remarks for Reject the Record$")
			public void user_enter_the_remarks_for_reject_the_record() throws Throwable {
				waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.popupremark(), 60, 2);
				projectMasterObj.popupremark().sendKeys("Reject");
		    
			}

			@Then("^user Click on Remarks button for Reject confirmation$")
			public void user_click_on_remarks_button_for_reject_confirmation() throws Throwable {
				waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.popupreject(), 60, 2);
				projectMasterObj.popupreject().click();
		    
			}

			@Then("^user verify the Record got Rejected$")
			public void user_verify_the_record_got_rejected() throws Throwable {
				waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.recordMsgChecker(), 60, 2);
			  String Toast;
			  Toast = projectMasterObj.recordMsgChecker().getText();
			  System.out.println(Toast);
			  Assert.assertEquals(Toast, "Record REJECTED Successfully");
		   
			}
			@And("^Click the inboxmailicon in maker stage for reject record verify$")
			public void click_the_inboxmailicon_in_maker_stage_for_reject_record_verify() throws Throwable {
				
				waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.InboxIcon(), 60, 2);
				projectMasterObj.InboxIcon().click();

			}

@And("^user verify the rejected record removed from the system$")
public void user_verify_the_rejected_record_removed_from_the_system() throws Throwable {
    for (int i = 0; i <20; i++) {
        try {
        	projectMasterObj.searchIcon().click();
            break;
        } catch (Exception e) {

        }
    }

        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,projectMasterObj.searchIcon(),60,2);
        projectMasterObj.searchIcon().click();
        projectMasterObj.searchsentkeys().sendKeys(testData.get("Reference ID"));
        String xpath ="//span[contains(text(),'"+testData.get("Reference ID")+"')]";
        for (int i = 0; i < 200; i++) {
            try {
                Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
                break;
            } catch (NoSuchElementException e) {

            }
        }

}
@And("^user click on return icon$")
public void user_click_on_return_icon() throws Throwable {
	
	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.CheckerReturn(), 60, 2);
	projectMasterObj.CheckerReturn().click();
    
}

@And("^user enter the remark for return the record$")
public void user_enter_the_remark_for_return_the_record() throws Throwable {
	
	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.popupremark(), 60, 2);
	projectMasterObj.popupremark().click();
	projectMasterObj.popupremark().sendKeys(testData.get("RemarkReturn"));
	
    
}

@And("^user click the final return button$")
public void user_click_the_final_return_button() throws Throwable {
	
	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.popupReturn(), 60, 2);
	projectMasterObj.popupReturn().click();
	
}
@Then("^user verify the return record$")
public void user_verify_the_return_record() throws Throwable {
	
	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.recordMsgChecker(), 60, 2);
	System.out.println(projectMasterObj.recordMsgChecker().getText());
	}
@And("^user verify the returned record removed from the system$")
public void user_verify_the_returned_record_removed_from_the_system() throws Throwable {
    for (int i = 0; i <20; i++) {
        try {
        	projectMasterObj.searchIcon().click();
            break;
        } catch (Exception e) {

        }
    }

        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,projectMasterObj.searchIcon(),60,2);
        projectMasterObj.searchIcon().click();
        projectMasterObj.searchsentkeys().sendKeys(testData.get("Reference ID"));
        String xpath ="//span[contains(text(),'"+testData.get("Reference ID")+"')]";
        for (int i = 0; i < 200; i++) {
            try {
                Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
                break;
            } catch (NoSuchElementException e) {

            }
        }
}
@And("^choose the data set id for checker reject in project master in updation$")
public void choose_the_data_set_id_for_checker_reject_in_project_master_in_updation() throws Throwable {
	testData=excelData.getTestdata("AT-PM-T021-D1");
}

@And("^choose the data set id for checker return in project master in updation$")
public void choose_the_data_set_id_for_checker_return_in_project_master_in_updation() throws Throwable {
	testData=excelData.getTestdata("AT-PM-T022-D1");

}
@Then("^click on temp view in project master$")
public void click_on_temp_view_in_project_master() throws Throwable {
	Thread.sleep(2000);
	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterTempView(), 5, 1);
	projectMasterObj.projectMasterTempView().click();
	waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterTempViewFirstRecord(), 5,
			1);
	projectMasterObj.projectMasterTempViewFirstRecord().click();
}
@And("^go to building details tab$")
public void go_to_building_details_tab() throws Throwable {

	for (int i = 0; i <= 10; i++) {
		try {
			javaScriptHelper.scrollIntoView(projectMasterObj.projectMasterTemoBuildingDetails());
			break;
		} catch (Exception e) {
			if (i == 10) {
				Assert.fail(e.getLocalizedMessage());
			}

		}
		}
	}

	@Then("^verify building details records are in non editable mode$")
	public void verify_building_details_records_are_in_non_editable_mode() throws Throwable {
		for (int i = 0; i <= 15; i++) {
			try {
				javaScriptHelper.scrollIntoView(projectMasterObj.buildingDetailsListViewFirstRecord());
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}
	@Then("^click on add button in building details$")
	public void click_on_add_button_in_building_details() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterBuildingDetailsAddButton(), 5, 1);
		projectMasterObj.projectMasterBuildingDetailsAddButton().click();
	}
	@And("^click on back button$")
	public void click_on_back_button() throws Throwable {
		
		for (int i = 0; i <200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(projectMasterObj.projectMasterBuildingDetailsBackButton());				
				projectMasterObj.projectMasterBuildingDetailsBackButton().click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
	
	}
	@Then("^verify screen should get changed to previous screen$")
	public void verify_screen_should_get_changed_to_previous_screen() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.buildingDetailsExportText(), 5, 1);
		Assert.assertTrue(projectMasterObj.buildingDetailsExportText().isDisplayed());
	}

}
    
