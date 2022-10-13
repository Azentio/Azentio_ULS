package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import pageobjects.ReportMasterObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.ReportMasterTestData;

public class ReportMaster {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	ReportMasterTestData reportMasterTestData = jsonConfig.getReportMasterByName("Maker");
    ReportMasterObj reportMasterObj = new ReportMasterObj(driver);
    JsonDataReaderWriter json = new JsonDataReaderWriter();
    SoftAssert softAssert = new SoftAssert();
	@When("^user click the configuration menu for Report Master$")
	public void user_click_the_configuration_menu_for_report_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.configurationOptions(),30, 2);
		reportMasterObj.configurationOptions().click();
	}
	@And("^User click the Configuration Manager option$")
    public void user_click_the_configuration_manager_option() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.configManagerOptions(),30, 2);
		reportMasterObj.configManagerOptions().click();
    }
	@And("^User click Approved list icon for Report Master$")
	public void user_click_approved_list_icon_for_report_master() throws Throwable {
		seleniumactions.getJavascriptHelper().scrollIntoView(reportMasterObj.reportMasterApproveIcon());
		reportMasterObj.reportMasterApproveIcon().click();
	}

	@And("^User click First Edit icon in Approved list view for Report Master$")
	public void user_click_first_edit_icon_in_approved_list_view_for_report_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.firstEditIcon(),30, 2);
		reportMasterObj.firstEditIcon().click();
	}

	@And("^User click and update the Report Name$")
	public void user_click_and_update_the_report_name() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportName(),30, 2);
		reportMasterObj.reportName().click();
		reportMasterObj.reportName().clear();
		System.out.println(reportMasterTestData.ReportName);
		reportMasterObj.reportName().sendKeys(reportMasterTestData.ReportName);
	}
	@Then("^User Validate the updated report master record in list view$")
    public void user_validate_the_updated_report_master_record_in_list_view() throws Throwable {
		for (int i = 0; i <20; i++) {
			try {
				String validate = driver.findElement(By.xpath("//span[contains(text(),'"+reportMasterTestData.ReportName+"')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, reportMasterTestData.ReportName);
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }

	@And("^User click and update the Report Name2$")
	public void user_click_and_update_the_report_name2() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportName2(),30, 2);
		reportMasterObj.reportName2().click();
		reportMasterObj.reportName2().clear();
		reportMasterObj.reportName2().sendKeys(reportMasterTestData.ReportName2);
	}

	@And("^User click and update the Report Name3$")
	public void user_click_and_update_the_report_name3() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportName3(),30, 2);
		reportMasterObj.reportName3().click();
		reportMasterObj.reportName3().clear();
		reportMasterObj.reportName3().sendKeys(reportMasterTestData.ReportName3);
	}

	@And("^User click and update the Report Description$")
	public void user_click_and_update_the_report_description() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.Reportdescription(),30, 2);
		reportMasterObj.Reportdescription().click();
		reportMasterObj.Reportdescription().clear();
		reportMasterObj.Reportdescription().sendKeys(reportMasterTestData.ReportDescription);
	}

	@And("^User Select and update the Report Type$")
	public void user_select_and_update_the_report_type() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportType(),30, 2);
		reportMasterObj.reportType().click();
		String xpath ="//ion-label[text()=' "+reportMasterTestData.ReportType+" ']//following-sibling::ion-radio";
		for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("^User click and update the Report Url$")
	public void user_click_and_update_the_report_url() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportUrl(),30, 2);
		reportMasterObj.reportUrl().click();
		reportMasterObj.reportUrl().clear();
		reportMasterObj.reportUrl().sendKeys(reportMasterTestData.ReportURL);
	}

	@And("^User Select and update the Report Category$")
	public void user_select_and_update_the_report_category() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportCategory(),30, 2);
		reportMasterObj.reportCategory().click();
		String xpath ="//ion-label[text()=' "+reportMasterTestData.ReportCategory+" ']//following-sibling::ion-radio";
		for (int i = 0; i < 20; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("^User Verify the Status button in Report Master$")
	public void user_verify_the_status_button_in_report_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportMasterStatusSwitchButton(),30, 2);
		Assert.assertEquals(true, reportMasterObj.reportMasterStatusSwitchButton().isDisplayed());
	}

	@And("^User click Save button for report master updation$")
	public void user_click_save_button_for_report_master_updation() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.Report_Master_Update(),30, 2);
		reportMasterObj.Report_Master_Update().click();
	}

	@And("^user click inbox to approve record for report master$")
	public void user_click_inbox_to_approve_record_for_report_master() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.Inbox(),30, 2);
		reportMasterObj.Inbox().click();
		Thread.sleep(2000);
	}

	@And("^user search report Master$")
	public void user_search_report_master() throws Throwable {
		for (int i = 0; i <20; i++) {
    		try {
            //seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
    			reportMasterObj.InboxView_Search().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
     
            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.InboxView_SearchText(),60,2);
            reportMasterObj.InboxView_SearchText().click();
            reportMasterObj.InboxView_SearchText().sendKeys(reportMasterTestData.SearchReportMaster);
	}

	@And("^user store reference number and click the first record in report master inbox view$")
	public void user_store_reference_number_and_click_the_first_record_in_report_master_inbox_view() throws Throwable {
		String reference = null;
        for (int i = 0; i < 200; i++) {
			try {
			 reference = reportMasterObj.reportMasterReferanceId().getText();
			 break;
			} catch (Exception e) {
				
			}
		}
        
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.firstEditIconInMakerListView(),40, 2);
        reportMasterObj.firstEditIconInMakerListView().click();
        
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40, 2);
        
        json.addReferanceData(reference);
        System.out.println(reference);
	}

    @And("^user submit report master record in maker$")
    public void user_submit_report_master_record_in_maker() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWaitElementToBeClickable(driver, reportMasterObj.reportMasterMaker_Submit(), 60, 2);
    	reportMasterObj.reportMasterMaker_Submit().click();
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportMasterMaker_EnterRemark(),30,2);
        reportMasterObj.reportMasterMaker_EnterRemark().click();
        reportMasterObj.reportMasterMaker_EnterRemark().sendKeys(reportMasterTestData.EnterRemark);
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.reportMasterMaker_RemarkSubmit(),30, 2);
        reportMasterObj.reportMasterMaker_RemarkSubmit().click();
    }
    @Given("^user log in as uls application checker for report master record$")
    public void user_log_in_as_uls_application_checker_for_report_master_record() throws Throwable {
    	String kulsApplicationUrl = configFileReader.getLoanTransactionApplicationUrl();
		driver.get(kulsApplicationUrl);
		System.out.println(json.readdata());
		applicationLogin.ulSApplicationLoginAsAChecker(json.readdata());
    }
    @Then("^user Click on Approve button in Action confirmation popup for report master record$")
    public void user_click_on_approve_button_in_action_confirmation_popup_for_report_master_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.Checker_Final_Approve(), 30, 2);
    	reportMasterObj.Checker_Final_Approve().click();
    }
    @Then("^user verify the Record got Approved for report master record$")
    public void user_verify_the_record_got_approved_for_report_master_record() throws Throwable {
    	String Toast;
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.checkerApproveMgs(), 60, 2);
		Toast = reportMasterObj.checkerApproveMgs().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
    }

    @And("^user Click on Mailbox icon for report master record$")
    public void user_click_on_mailbox_icon_for_report_master_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.Checker_Inbox(), 30, 2);
    	reportMasterObj.Checker_Inbox().click();
    }

    @And("^Search the respective reference id and click on Action button for report master record$")
    public void search_the_respective_reference_id_and_click_on_action_button_for_report_master_record() throws Throwable {
    	for (int i = 0; i <20; i++) {
			try {
				driver.findElement(By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button"))
				.click();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^user Click on Approve icon for report master record$")
    public void user_click_on_approve_icon_for_report_master_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.Checker_Approve(), 30, 2);
    	reportMasterObj.Checker_Approve().click();
    }

    @And("^user Enter the remarks in Action confirmation popup for report master record$")
    public void user_enter_the_remarks_in_action_confirmation_popup_for_report_master_record() throws Throwable {
    	for (int i = 0; i <20; i++) {
			try {
				reportMasterObj.Checker_Alert_Approve().click();
				break;
			} catch (ElementNotInteractableException e) {
				
			}
		}
    }

    @And("^User click first Edit Icon in Approved list view for report parameter details$")
    public void user_click_first_edit_icon_in_approved_list_view_for_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.reportParameterDetailsFirstEditIcon(), 60, 5);
    	reportMasterObj.reportParameterDetailsFirstEditIcon().click();
    }

    @And("^User click and update the Template field in report parameter details$")
    public void user_click_and_update_the_template_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.Template(), 60, 5);
    	reportMasterObj.Template().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+reportMasterTestData.Template+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
    	
    }

    @And("^User click and update the parameter1 in report parameter details$")
    public void user_click_and_update_the_parameter1_in_report_parameter_details() throws Throwable {
    	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Parameter1().click();
    			reportMasterObj.Parameter1().sendKeys(reportMasterTestData.Parameter1);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    }

    @And("^User click and update param1 Description1 in report parameter$")
    public void user_click_and_update_param1_description1_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Param1Description1().click();
    			reportMasterObj.Param1Description1().sendKeys(reportMasterTestData.Param1Description1);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    }

    @And("^User click and update param1 Description2 in report parameter$")
    public void user_click_and_update_param1_description2_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Param1Description2().click();
    			reportMasterObj.Param1Description2().sendKeys(reportMasterTestData.Param1Description2);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    }

    @And("^User click and update param1 Description3 in report parameter$")
    public void user_click_and_update_param1_description3_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Param1Description3().click();
    			reportMasterObj.Param1Description3().sendKeys(reportMasterTestData.Param1Description3);
    	        
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    }

    @And("^User click and update parameter2 in report parameter$")
    public void user_click_and_update_parameter2_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Parameter2().click();
    			reportMasterObj.Parameter2().sendKeys(reportMasterTestData.Parameter2);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    }

    @And("^User click and update param2 Description2 in report parameter$")
    public void user_click_and_update_param2_description2_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Param2Description2().click();
    			reportMasterObj.Param2Description2().sendKeys(reportMasterTestData.Param2Description2);
    	        
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    }

    @And("^User click and update param2 Description3 in report parameter$")
    public void user_click_and_update_param2_description3_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Param2Description3().click();
    			reportMasterObj.Param2Description3().sendKeys(reportMasterTestData.Param2Description3);
    	        
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    }

    @And("^User select and update IsMandatory in report parameter$")
    public void user_select_and_update_ismandatory_in_report_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.IsMandatory(), 60, 5);
    	reportMasterObj.IsMandatory().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+reportMasterTestData.IsMandatory+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User click and update sequenceNo in report parameter$")
    public void user_click_and_update_sequenceno_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.SequenceNo().click();
    			reportMasterObj.SequenceNo().sendKeys(reportMasterTestData.SequenceNo);
    	    	break;
			} catch (Exception e) {
			
			}
    	}
    	
    }

    @And("^User click and update date format in report parameter$")
    public void user_click_and_update_date_format_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.DateFormat().click();
    			reportMasterObj.DateFormat().sendKeys(reportMasterTestData.DateFormat);
    	    	break;
			} catch (Exception e) {
			
			}
    	}
    }

    @And("^User click and update Nullable values in report parameter$")
    public void user_click_and_update_nullable_values_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.NullableValues().click();
    			reportMasterObj.NullableValues().sendKeys(reportMasterTestData.NullableValues);
    	    	break;
			} catch (Exception e) {
			
			}
    	}
    }
    @Then("^User click the Update icon in report parameter$")
    public void user_click_the_update_icon_in_report_parameter() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.updateIcon(),30, 2);
        reportMasterObj.updateIcon().click();
    }
    //***************************************blank field*************************************
    @And("^User Select and change the Template field in report parameter details$")
    public void user_select_and_change_the_template_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.Template(), 60, 5);
    	reportMasterObj.Template().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+reportMasterTestData.TemplateDefault+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User click and clear the parameter1 in report parameter details$")
    public void user_click_and_clear_the_parameter1_in_report_parameter_details() throws Throwable {
    	for(int i=0; i<20; i++) {
    		
    			reportMasterObj.Parameter1().click();
    			reportMasterObj.Parameter1().sendKeys(Keys.BACK_SPACE);
    	    	
    	}
    }

    @And("^User click and clear the param1 Description1 in report parameter$")
    public void user_click_and_clear_the_param1_description1_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		
    			reportMasterObj.Param1Description1().click();
    			reportMasterObj.Param1Description1().sendKeys(Keys.BACK_SPACE);
    	    	
    	}
    }

    @And("^User click and clear the param1 Description2 in report parameter$")
    public void user_click_and_clear_the_param1_description2_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		
    			reportMasterObj.Param1Description2().click();
    			reportMasterObj.Param1Description2().sendKeys(Keys.BACK_SPACE);
    	    	
    	}
    }

    @And("^User click and clear the param1 Description3 in report parameter$")
    public void user_click_and_clear_the_param1_description3_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		
    			reportMasterObj.Param1Description3().click();
    			reportMasterObj.Param1Description3().sendKeys(Keys.BACK_SPACE);
    	    	
				
			
    	}
    }

    @And("^User click and clear the parameter2 in report parameter$")
    public void user_click_and_clear_the_parameter2_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		
    			reportMasterObj.Parameter2().click();
    			reportMasterObj.Parameter2().sendKeys(Keys.BACK_SPACE);
    	    	
    	}
    }

    @And("^User click and clear the param2 Description2 in report parameter$")
    public void user_click_and_clear_the_param2_description2_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		
    			reportMasterObj.Param2Description2().click();
    			reportMasterObj.Param2Description2().sendKeys(Keys.BACK_SPACE);
    	        
    	}
    }

    @And("^User click and clear the param2 Description3 in report parameter$")
    public void user_click_and_clear_the_param2_description3_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		
    			reportMasterObj.Param2Description3().click();
    			reportMasterObj.Param2Description3().sendKeys(Keys.BACK_SPACE);
    	    	
    	}
    }

   

    @And("^User click and clear the sequenceNo in report parameter$")
    public void user_click_and_clear_the_sequenceno_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		
    			reportMasterObj.SequenceNo().click();
    			reportMasterObj.SequenceNo().sendKeys(Keys.BACK_SPACE);
    	    	
    	}
    }

    @And("^User click and clear the date format in report parameter$")
    public void user_click_and_clear_the_date_format_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		
    			reportMasterObj.DateFormat().click();
    			reportMasterObj.DateFormat().sendKeys(Keys.BACK_SPACE);
    	}
    }

    @And("^User click and clear the Nullable values in report parameter$")
    public void user_click_and_clear_the_nullable_values_in_report_parameter() throws Throwable {
    	for(int i=0; i<20; i++) {
    		
    			reportMasterObj.NullableValues().click();
    			reportMasterObj.NullableValues().sendKeys(Keys.BACK_SPACE);
    	}
    }

    @And("^User Validate the blank field for Template field in report parameter details$")
    public void user_validate_the_blank_field_for_template_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.templateRequiredField(), 60, 2); 
   	 Assert.assertEquals("Required field", reportMasterObj.templateRequiredField().getText());
    }

    @And("^User Validate the blank field and invalid data for Parameter1 field in report parameter details$")
    public void user_validate_the_blank_field_and_invalid_data_for_parameter1_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.parameter1RequiredField(), 60, 2); 
      	
      	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Parameter1().click();
    			reportMasterObj.Parameter1().sendKeys(reportMasterTestData.InvaliddataParameter1);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
      	try {
      		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.parameter1RequiredField(),5, 1);
      		 Assert.assertEquals("Alphanumeric characters allowed", reportMasterObj.parameter1RequiredField().getText());
		} catch (Exception e) {
			softAssert.assertFalse(true, "Alpha numeric validation message not thrown");
		}
      	 
    }

    @And("^User Validate the blank field and invalid data for Param1 Description1 field in report parameter details$")
    public void user_validate_the_blank_field_and_invalid_data_for_param1_description1_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.param1description1RequiredField(), 60, 2); 
     	 Assert.assertEquals("Required field", reportMasterObj.param1description1RequiredField().getText());
     	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Param1Description1().click();
    			reportMasterObj.Param1Description1().sendKeys(reportMasterTestData.InvaliddataParam1Description1);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
			try {
				seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.param1description1RequiredField(), 5, 1); 
		     	 Assert.assertEquals("Alphanumeric characters allowed", reportMasterObj.param1description1RequiredField().getText());
			} catch (Exception e) {
				softAssert.assertFalse(true, "Alpha numeric validation message not thrown");
			}
    }

    @And("^User Validate the blank field and invalid data for Param1 Description2 field in report parameter details$")
    public void user_validate_the_blank_field_and_invalid_data_for_param1_description2_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.param1description2RequiredField(), 30, 2); 
    	 Assert.assertEquals("Required field", reportMasterObj.param1description2RequiredField().getText());
    	 for(int i=0; i<20; i++) {
     		try {
     			reportMasterObj.Param1Description2().click();
     			reportMasterObj.Param1Description2().sendKeys(reportMasterTestData.InvaliddataParam1Description2);
     	    	break;
 			} catch (Exception e) {
 				
 			}
     	}
    	 try {
    		 seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.param1description2RequiredField(),5, 1); 
        	 Assert.assertEquals("Alphanumeric characters allowed", reportMasterObj.param1description2RequiredField().getText());
		} catch (Exception e) {
			softAssert.assertFalse(true, "Alpha numeric validation message not thrown");
		}
    }

    @And("^User Validate the blank field and invalid data for Param1 Description3 field in report parameter details$")
    public void user_validate_the_blank_field_and_invalid_data_for_param1_description3_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.param1description3RequiredField(), 60, 2); 
   	 Assert.assertEquals("Required field", reportMasterObj.param1description3RequiredField().getText());
   	for(int i=0; i<20; i++) {
		try {
			reportMasterObj.Param1Description3().click();
			reportMasterObj.Param1Description3().sendKeys(reportMasterTestData.InvaliddataParam1Description3);
	        
	    	break;
		} catch (Exception e) {
			
		}
	}
   	try {
   		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.param1description3RequiredField(), 5, 1); 
      	Assert.assertEquals("Alphanumeric characters allowed", reportMasterObj.param1description3RequiredField().getText());
	} catch (Exception e) {
		softAssert.assertFalse(true, "Alpha numeric validation message not thrown");
	}
    }
    @And("^User Validate the blank field and invalid data for Parameter2 field in report parameter details$")
    public void user_validate_the_blank_field_and_invalid_data_for_parameter2_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.parameter2RequiredField(), 60, 2); 
      	 Assert.assertEquals("Required field", reportMasterObj.parameter2RequiredField().getText());
      	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Parameter2().click();
    			reportMasterObj.Parameter2().sendKeys(reportMasterTestData.InvaliddataParameter2);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
      	try {
      		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.parameter2RequiredField(), 5, 1); 
         	 Assert.assertEquals("Alphanumeric characters allowed", reportMasterObj.parameter2RequiredField().getText());
		} catch (Exception e) {
			softAssert.assertFalse(true, "Alpha numeric validation message not thrown");
		}
    }

    @And("^User Validate the blank field and invalid data for Param2 Description2 field in report parameter details$")
    public void user_validate_the_blank_field_and_invalid_data_for_param2_description2_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.param2description2RequiredField(), 60, 2); 
      	 Assert.assertEquals("Required field", reportMasterObj.param2description2RequiredField().getText());
      	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Param2Description2().click();
    			reportMasterObj.Param2Description2().sendKeys(reportMasterTestData.InvaliddataParam2Description2);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
      	try {
      		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.param1description2RequiredField(),5, 1); 
         	 Assert.assertEquals("Alphanumeric characters allowed", reportMasterObj.param1description2RequiredField().getText());
		} catch (Exception e) {
			softAssert.assertFalse(true, "Alpha numeric validation message not thrown");
		}
      		
    }

    @And("^User Validate the blank field and invalid data for Param2 Description3 field in report parameter details$")
    public void user_validate_the_blank_field_and_invalid_data_for_param2_description3_field_in_report_parameter_details() throws Throwable {
    	 seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.param2description3RequiredField(), 60, 2); 
     	 Assert.assertEquals("Required field", reportMasterObj.param2description3RequiredField().getText());
     	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.Param2Description3().click();
    			reportMasterObj.Param2Description3().sendKeys(reportMasterTestData.InvaliddataParam2Description3);
    	    	break;
			} catch (Exception e) {
				
			}
    	}
     	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.param2description3RequiredField(), 60, 2); 
    	 Assert.assertEquals("Alphanumeric characters allowed", reportMasterObj.param2description3RequiredField().getText());
    }

    @And("^User Validate the blank field and invalid data for sequenceNo field in report parameter details$")
    public void user_validate_the_blank_field_and_invalid_data_for_sequenceno_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.sequenceNumberRequiredField(), 60, 2); 
    	 Assert.assertEquals("Required field", reportMasterObj.sequenceNumberRequiredField().getText());
    	 for(int i=0; i<20; i++) {
     		try {
     			reportMasterObj.SequenceNo().click();
     			reportMasterObj.SequenceNo().sendKeys(reportMasterTestData.InvaliddataSequenceNo);
     	    	break;
 			} catch (Exception e) {
 			
 			}
     	}
    	 seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,reportMasterObj.SequenceNoText() ,30, 2);
    	 Assert.assertEquals("123",reportMasterObj.SequenceNoText().getAttribute("ng-reflect-model"));
    }

    @And("^User Validate the blank field and invalid data for date format field in report parameter details$")
    public void user_validate_the_blank_field_and_invalid_data_for_date_format_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.dateFormatRequiredField(), 60, 2); 
   	 Assert.assertEquals("Required field", reportMasterObj.dateFormatRequiredField().getText());
   	for(int i=0; i<20; i++) {
		try {
			reportMasterObj.DateFormat().click();
			reportMasterObj.DateFormat().sendKeys(reportMasterTestData.InvaliddataDateFormat);
	    	break;
		} catch (Exception e) {
		
		}
	}
   	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.dateFormatRequiredField(), 30, 2); 
  	 Assert.assertEquals("Alphanumeric characters allowed", reportMasterObj.dateFormatRequiredField().getText());
    }

    @And("^User Validate the blank field and invalid data for Nullable values field in report parameter details$")
    public void user_validate_the_blank_field_and_invalid_data_for_nullable_values_field_in_report_parameter_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.nullableValuesRequiredField(), 60, 2); 
      	 Assert.assertEquals("Required field", reportMasterObj.nullableValuesRequiredField().getText());
      	for(int i=0; i<20; i++) {
    		try {
    			reportMasterObj.NullableValues().click();
    			reportMasterObj.NullableValues().sendKeys(reportMasterTestData.InvaliddataNullableValues);
    	    	break;
    		} catch (Exception e) {
    		
    		}
    	}
      	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMasterObj.nullableValuesRequiredField(), 30, 2); 
     	 Assert.assertEquals("Alphanumeric characters allowed", reportMasterObj.nullableValuesRequiredField().getText());
     	 softAssert.assertAll("Alphanumeric Validation message not displayed for parameter 1, param1description1,param1description2,param1 description3,param2,"
     	 		+ "param2description2");
    }
         
}

