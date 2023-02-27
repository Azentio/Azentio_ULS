package stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
import pageobjects.ReportMaster_Obj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.ReportMasterTestData;

public class ReportMaster extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	ReportMaster_Obj reportMstObj = new ReportMaster_Obj(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	ReportMasterTestData reportMasterData = jconfig.getReportMasterByName("Maker");
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot mandateOrNot = new FindFieldisMandatoryorNot(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	String Toast;
	List<String> xlsList = new ArrayList<>();
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00073\\Downloads\\UlsTestDataDesign.xlsx","ReportMaster","Data Set ID");
	Map<String, String> testData;

	

    @Then("^choose the data set id for for list view validation$")
    public void choose_the_data_set_id_for_for_list_view_validation() throws Throwable {
    	testData = excelData.getTestdata("AT-RM-T011-D1");
    }
	@And("^Click the Eye icon of report master$")
    public void click_the_eye_icon_of_report_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.reportMasterViewIcon(), 60, 2);
		reportMstObj.reportMasterViewIcon().click();
    }

	 @Then("^Click the first icon in the list view in the report master$")
	    public void click_the_first_icon_in_the_list_view_in_the_report_master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportGroupMaster_ListViewEyeIcon(), 60, 2);
			reportMstObj.ReportGroupMaster_ListViewEyeIcon().click();
	    }
	 @And("^To verify the functionality of Add button in report master$")
	    public void to_verify_the_functionality_of_add_button_in_report_master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.addIcon(), 60, 2);
			Assert.assertEquals(reportMstObj.addIcon().isDisplayed(), true);

	    }
	    @Then("^To verify the functionality of Search box with matching data in report master$")
	    public void to_verify_the_functionality_of_search_box_with_matching_data_in_report_master() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.parameter_ListViewSearch(), 60, 2);
			for (int i = 0; i < 20; i++) {
				try {
					reportMstObj.parameter_ListViewSearch().click();
					break;
				} catch (Exception e) {

				}
			}
Thread.sleep(2000);
			reportMstObj.parameter_ListViewSearchText().click();
			reportMstObj.parameter_ListViewSearchText().sendKeys(testData.get("Matcheddata"));
			Assert.assertEquals(reportMstObj.parameter_ListViewMachedData().isDisplayed(), true);
		}
	    
	    @And("^To verify the functionality of Search box with mismatch data in report master$")
	    public void to_verify_the_functionality_of_search_box_with_mismatch_data_in_report_master() throws Throwable {
			driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

			for (int i = 0; i < 20; i++) {
				try {
					reportMstObj.parameter_ListViewSearch().click();
					break;
				} catch (Exception e) {

				}
			}
			reportMstObj.parameter_ListViewSearchText().click();
			reportMstObj.parameter_ListViewSearchText().sendKeys(testData.get("UnMatcheddata"));
			Thread.sleep(1000);
			String xpath = "//span[contains(text(),'Showing 0 to 0 of 0 entries')]";
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
	    @Then("^To verify the functionality of Export to PDF button in report master$")
	    public void to_verify_the_functionality_of_export_to_pdf_button_in_report_master() throws Throwable {
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			reportMstObj.exportIcon().click();
	    			break;
	    		} catch (Exception e) {

	    		}
	    	}

	    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, reportMstObj.exportToPDF(), 60, 3);
	    	reportMstObj.exportToPDF().click();
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
	    		if (fileName.getName().equalsIgnoreCase("ReportMasterFormDataFile.pdf")) {
	    			System.out.println("Downloaded file present in system");
	    			break;
	    		} else if (i == length - 1) {
	    			System.out.println("Downloaded file present does not exist in system");
	    		}

	    	}
	    	action.getBrowserHelper().switchToParentWithChildClose();
	    }
	    

	    @And("^To verify the functionality of Export to Excel button in report master$")
	    public void to_verify_the_functionality_of_export_to_excel_button_in_report_master() throws Throwable {
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			reportMstObj.exportIcon().click();
	    			break;
	    		} catch (Exception e) {

	    		}
	    	}
	    	        action.getClickAndActionsHelper().moveToElement(reportMstObj.exportToExcel());
	    	        reportMstObj.exportToExcel().click();
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

	    }

	    @Then("^To verify the functionality of Sequence number field in report master$")
	    public void to_verify_the_functionality_of_sequence_number_field_in_report_master() throws Throwable {
			String xpath = "(//tbody/tr[1]/td[3]/p-celleditor[1]/span[1])[2]";
			//action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
					for (int i = 0; i < 20; i++) {
						try {
							String ScequenceNumber = driver.findElement(By.xpath(xpath)).getText();
							System.out.println("ScequenceNumber :" + ScequenceNumber);
							break;
						} catch (NoSuchElementException e) {
						}
					}

	    }

	    @And("^To verify the functionality of Description field in report master$")
	    public void to_verify_the_functionality_of_description_field_in_report_master() throws Throwable {
			String xpath1 = "(//tbody/tr[1]/td[4]/p-celleditor[1]/span[1])[2]";
			//action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath1)),60,2);
					for (int i = 0; i < 30; i++) {
						try {
							WebElement DescriptionField = driver.findElement(By.xpath(xpath1));
							System.out.println("DescriptionField :" + DescriptionField);
							break;
						} catch (NoSuchElementException e) {
						}
					}
	    }

	    @Then("^To verify the functionality of Status field in report master$")
	    public void to_verify_the_functionality_of_status_field_in_report_master() throws Throwable {
	    	String xpath2 = "(//p-tag[@ng-reflect-value='Active'])[3]";
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

	    

	//***************Creation Flow*************************************//

	    @Then("^Choose the data set id for report master creation$")
	    public void choose_the_data_set_id_for_report_master_creation() throws Throwable {
	    	testData = excelData.getTestdata("AT-RM-T001-D1");

	    }
@Then("^Click the add button in the report master$")
public void click_the_add_button_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.addIcon(), 60, 2);
	reportMstObj.addIcon().click();
}
@And("^Enter the report name in report master$")
public void enter_the_report_name_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.reportName(), 60, 2);
	reportMstObj.reportName().click();
	reportMstObj.reportName().sendKeys(testData.get("ReportName"));
}
@Then("^Fill the report name2 in report master$")
public void fill_the_report_name2_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.reportName2(), 60, 2);
	reportMstObj.reportName2().click();
	reportMstObj.reportName2().sendKeys(testData.get("ReportName2"));

}

@And("^Enter the report name3 in report master$")
public void enter_the_report_name3_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.reportName3(), 60, 2);
	reportMstObj.reportName3().click();
	reportMstObj.reportName3().sendKeys(testData.get("ReportName3"));
}
@Then("^Fill the report description in report master$")
public void fill_the_report_description_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.Reportdescription(), 60, 2);
	reportMstObj.Reportdescription().click();
	reportMstObj.Reportdescription().sendKeys(testData.get("ReportDescription"));

}

@And("^Choose the report type in report master$")
public void choose_the_report_type_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.reportType(), 60, 2);
	reportMstObj.reportType().click();
	for (int i = 0; i < 50; i++) {
		try {

			driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("ReportType")
					+ "')]/following-sibling::ion-radio")).click();
			break;
		} catch (Exception e) {
		}
	}

}
@Then("^Fill the report URL in report master$")
public void fill_the_report_url_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.reportUrl(), 60, 2);
	reportMstObj.reportUrl().click();
	reportMstObj.reportUrl().sendKeys(testData.get("ReportURL"));
}
@And("^Enter the report catogory in report master$")
public void enter_the_report_catogory_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.reportCategory(), 60, 2);
	reportMstObj.reportCategory().click();
	for (int i = 0; i < 50; i++) {
		try {

			driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("ReportCatogory")
					+ "')]/following-sibling::ion-radio")).click();
			break;
		} catch (Exception e) {
		}
	}

}

@Then("^Save the record in report master$")
public void save_the_record_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.Report_Master_Save(), 60, 2);
	reportMstObj.Report_Master_Save().click();
}

@And("^Click the inbox in report master$")
public void click_the_inbox_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.Report_Inbox(), 60, 2);
	reportMstObj.Report_Inbox().click();
}
@Then("^Search the record in search field in report master$")
public void search_the_record_in_search_field_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_SeachButton(), 60, 2);
	reportMstObj.ReportMaster_SeachButton().click();
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_SearchText(), 60, 2);
	action.getClickAndActionsHelper().moveToElement(reportMstObj.ReportMaster_SearchText());
	reportMstObj.ReportMaster_SearchText().click();
	reportMstObj.ReportMaster_SearchText().sendKeys(testData.get("Search"));
}


@And("^Get the reference id in report master$")
public void get_the_reference_id_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_GetRefId(), 60, 2);
	String RefId = reportMstObj.ReportMaster_GetRefId().getText();
	excelData.updateTestData("AT-RM-T001-D1", "Reference ID", RefId);

	System.out.println(RefId);
	//json.addReferanceData(RefId);
}
@And("^Get the reference id in report master for reject$")
public void get_the_reference_id_in_report_master_for_reject() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_GetRefId(), 60, 2);
	String RefId = reportMstObj.ReportMaster_GetRefId().getText();
	excelData.updateTestData("AT-RM-T001-D2", "Reference ID", RefId);

	System.out.println(RefId);
	//json.addReferanceData(RefId);
}
@And("^Get the reference id in report master for return$")
public void get_the_reference_id_in_report_master_for_return() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_GetRefId(), 60, 2);
	String RefId = reportMstObj.ReportMaster_GetRefId().getText();
	excelData.updateTestData("AT-RM-T001-D3", "Reference ID", RefId);

	System.out.println(RefId);
	//json.addReferanceData(RefId);
}
@Then("^Click the first action icon in report master$")
public void click_the_first_action_icon_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_ActionIcon(), 60, 2);
	reportMstObj.ReportMaster_ActionIcon().click();
}
@And("^Submit the record in report master$")
public void submit_the_record_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_SubmitButton(), 60, 2);
	reportMstObj.ReportMaster_SubmitButton().click();
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_SubmitOKButton(), 60, 2);
	reportMstObj.ReportMaster_SubmitOKButton().click();
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_FinalSubmitButton(), 60,
			2);
	reportMstObj.ReportMaster_FinalSubmitButton().click();
	Thread.sleep(3000);
}
    @Then("^Get the checker id in report master$")
    public void get_the_checker_id_in_report_master() throws Throwable {
   
	//waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerId(), 60, 2);
	String CheckerId = null;
	for(int i=0; i<20; i++) {
		try {
			CheckerId = reportMstObj.ReportMaster_CheckerId().getText();
			break;
		} catch (Exception e) {
			
		}
	}
	
	System.out.println(CheckerId);
	String Space = " ";
	String split[] = CheckerId.split(" ");
	Space = split[split.length - 1];
	String popupID = Space.replaceAll("[/.]", "");
	excelData.updateTestData("AT-RM-T001-D1","Checker id",popupID);
	System.out.println(popupID);
}
    @Then("^Get the checker id in report master for rejection flow$")
    public void get_the_checker_id_in_report_master_for_rejection_flow() throws Throwable {
      
   
	//waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerId(), 60, 2);
	String CheckerId = null;
	for(int i=0; i<20; i++) {
		try {
			CheckerId = reportMstObj.ReportMaster_CheckerId().getText();
			break;
		} catch (Exception e) {
			
		}
	}
	
	System.out.println(CheckerId);
	String Space = " ";
	String split[] = CheckerId.split(" ");
	Space = split[split.length - 1];
	String popupID = Space.replaceAll("[/.]", "");
	excelData.updateTestData("AT-RM-T001-D2","Checker id",popupID);
	System.out.println(popupID);
}
    @Then("^Get the checker id in report master for return$")
    public void get_the_checker_id_in_report_master_for_return() throws Throwable {
         
   //waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerId(), 60, 2);
	String CheckerId = null;
	for(int i=0; i<20; i++) {
		try {
			CheckerId = reportMstObj.ReportMaster_CheckerId().getText();
			break;
		} catch (Exception e) {
			
		}
	}
	
	System.out.println(CheckerId);
	String Space = " ";
	String split[] = CheckerId.split(" ");
	Space = split[split.length - 1];
	String popupID = Space.replaceAll("[/.]", "");
	excelData.updateTestData("AT-RM-T001-D3","Checker id",popupID);
	System.out.println(popupID);
}
///*******************Checker Approval************************//
@Given("^Get the URL and login as Checker in report master$")
public void get_the_url_and_login_as_checker_in_report_master() throws Throwable {
	String kulsApplicationUrl = configFileRead.getApplicationTransactionUrl();
	driver.get(kulsApplicationUrl);
	//System.out.println(json.readdata());
	login.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
}
@Then("^Choose the data set id for checker approval in report master$")
public void choose_the_data_set_id_for_checker_approval_in_report_master() throws Throwable {
	testData = excelData.getTestdata("AT-RM-T001-D1");
}
@Then("^Click the inbox in the report master$")
public void click_the_inbox_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerInbox(), 60,2);
	reportMstObj.ReportMaster_CheckerInbox().click();
}

@And("^Search the reference id and click the respective action icon in report master$")
public void search_the_reference_id_and_click_the_respective_action_icon_in_report_master() throws Throwable {
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

    @And("^Search the reference id and click the respective action icon in report master for rejection$")
    public void search_the_reference_id_and_click_the_respective_action_icon_in_report_master_for_rejection() throws Throwable {
		for (int i = 0; i < 60; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + testData.get("Reference ID") + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} 
			catch (Exception e) {

			}
		}
		}
		@And("^Search the reference id and click the respective action icon in report master for return$")
	    public void search_the_reference_id_and_click_the_respective_action_icon_in_report_master_for_return() throws Throwable {
	        
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
			


@Then("^Click the approve button in the report master$")
public void click_the_approve_button_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerApproveButton(), 60,2);
	reportMstObj.ReportMaster_CheckerApproveButton().click();
}

@And("^Enter the alert remark in the report master$")
public void enter_the_alert_remark_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerAlertApprove(), 60,2);
	reportMstObj.ReportMaster_CheckerAlertApprove().click();
}
@Then("^Give the final approve in the report master$")
public void give_the_final_approve_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerFinalApprove(), 60,2);
	reportMstObj.ReportMaster_CheckerFinalApprove().click();
}

@And("^Verify the record get approved in report master$")
public void verify_the_record_get_approved_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerId(), 60,2);
	Toast = reportMstObj.ReportMaster_CheckerId().getText();
	System.out.println(Toast);
	Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}


@Then("^Verify that approved record is present in the list view$")
public void verify_that_approved_record_is_present_in_the_list_view() throws Throwable {
	for (int i = 0; i < 20; i++) {
		try {

			String validate = driver
					.findElement(By.xpath("//span[contains(text(),'" + testData.get("ReportName") + "')]"))
					.getText();
			System.out.println(validate);

		} catch (Exception e) {
		}
	}
}
//****************Checker Reject****************************//

@Then("^Click the reject button in the report master$")
public void click_the_reject_button_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerRejectButton(), 60,2);
	reportMstObj.ReportMaster_CheckerRejectButton().click();
}
@And("^Enter the reject alert remark in the report master$")
public void enter_the_reject_alert_remark_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerAlertReject(), 60,2);
	reportMstObj.ReportMaster_CheckerAlertReject().click();	
}
@Then("^Give the final reject in the report master$")
public void give_the_final_reject_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerFinalReject(), 60,2);
	reportMstObj.ReportMaster_CheckerFinalReject().click();
}

@And("^Verify the record get rejected in report master$")
public void verify_the_record_get_rejected_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_RejectPopUp(), 60,2);
	Toast = reportMstObj.ReportMaster_RejectPopUp().getText();
	System.out.println(Toast);
	Assert.assertEquals(Toast, "Record REJECTED Successfully");
}

@Then("^Verify that rejected record is not present in the list view$")
public void verify_that_rejected_record_is_not_present_in_the_list_view() throws Throwable {
	for (int i = 0; i < 50; i++) {

	}
	try {
		String validate = driver
				.findElement(By.xpath("//span[contains(text(),'" + testData.get("ReportName") + "')]"))
				.getText();
		System.out.println(validate);
		Assert.assertEquals(validate, testData.get("ReportName"));
	} catch (Exception e) {
		System.out.println("The Rejected Record Not in the List view " );
	}
}
//*********************Checker Return**************************//
@Then("^Click the return button in the report master$")
public void click_the_return_button_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerReturnButton(), 60,2);
	reportMstObj.ReportMaster_CheckerReturnButton().click();
}

@And("^Enter the return alert remark in the report master$")
public void enter_the_return_alert_remark_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerAlertReturn(), 60,2);
	reportMstObj.ReportMaster_CheckerAlertReturn().click();
}
@Then("^Give the final return in the report master$")
public void give_the_final_return_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_CheckerFinalReturn1(), 60,2);
	reportMstObj.ReportMaster_CheckerFinalReturn1().click();
}


@And("^Verify the record get returned in report master$")
public void verify_the_record_get_returned_in_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.ReportMaster_ReturnPopUp(), 60,2);
	Toast = reportMstObj.ReportMaster_ReturnPopUp().getText();
	System.out.println(Toast);
}

@Then("^Verify that returned record is present in the temp view$")
public void verify_that_returned_record_is_present_in_the_temp_view() throws Throwable {
	for (int i = 0; i < 20; i++) {

	}
	try {
		String validate = driver
				.findElement(By.xpath("//span[contains(text(),'" + reportMasterData.ReportName + "')]"))
				.getText();
		System.out.println(validate);
		Assert.assertEquals(validate, reportMasterData.ReportName);
	} catch (Exception e) {

	}
}

@And("^Click the temp view in the report master$")
public void click_the_temp_view_in_the_report_master() throws Throwable {
	waitHelper.waitForElementToVisibleWithFluentWait(driver, reportMstObj.reportMasterEditIcon(), 60,2);
	reportMstObj.reportMasterEditIcon().click();
	
}
@Then("^choose the data set id for creation of report master for rejection$")
public void choose_the_data_set_id_for_creation_of_report_master_for_rejection() throws Throwable {
	testData = excelData.getTestdata("AT-RM-T001-D2");
}

@And("^Choose the data set id for return the records in report master$")
public void choose_the_data_set_id_for_return_the_records_in_report_master() throws Throwable {
	testData = excelData.getTestdata("AT-RM-T001-D3");
}
}	   

	 


