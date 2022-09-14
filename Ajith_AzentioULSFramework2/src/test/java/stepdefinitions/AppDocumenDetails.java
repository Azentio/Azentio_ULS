package stepdefinitions;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.AppDocumentDetails_Obj;
import resources.BaseClass;

public class AppDocumenDetails extends BaseClass{
 WebDriver driver = BaseClass.driver;
 JsonConfig jsonConfig = new JsonConfig();
 AppDocumentDetails_Obj documentDetailsObj = new AppDocumentDetails_Obj(driver);
 Selenium_Actions seleniumActions = new Selenium_Actions(driver);
 @And("^User search app data in inbox list view$")
 public void user_search_app_data_in_inbox_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.Application_DetailTab_SearchButtons(),30, 2);
	 documentDetailsObj.Application_DetailTab_SearchButtons().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.Application_DetailTab_SearchText(),30, 2);
	 documentDetailsObj.Application_DetailTab_SearchText().click();
	 documentDetailsObj.Application_DetailTab_SearchText().sendKeys("APPDATAENT");
 }
 @And("^User click the first edit icon of app data entry record$")
 public void user_click_the_first_edit_icon_of_app_data_entry_record() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.AppDataEntry_ActionIcon(),30, 2);
	 documentDetailsObj.AppDataEntry_ActionIcon().click();
 }

 @And("^user click the document details tab$")
 public void user_click_the_document_details_tab() throws Throwable {
     seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentDetails(),30, 2);
     documentDetailsObj.documentDetails().click();
 }
 @And("^user verify add button in document list view$")
 public void user_verify_add_button_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentDetails(),30, 2);
     documentDetailsObj.documentDetails().click();
 }
 @And("^user verify search button in document list view$")
 public void user_verify_search_button_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.document_TempView_Search(),30, 2);
     Assert.assertEquals(true, documentDetailsObj.document_TempView_Search().isDisplayed());
 }
 @And("^user verify pdf option in document list view$")
 public void user_verify_pdf_option_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.exportIcon(),30, 2);
	 documentDetailsObj.exportIcon().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.pdfOption(),30, 2);
     Assert.assertEquals(true, documentDetailsObj.pdfOption().isDisplayed());
 }
 @And("^user verify xls option in document list view$")
 public void user_verify_xls_option_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.xlsOption(),30, 2);
     Assert.assertEquals(true, documentDetailsObj.xlsOption().isDisplayed());
 }
 @And("^user verify number in document list view$")
 public void user_verify_number_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.numberParameter(),30, 2);
     Assert.assertEquals(true, documentDetailsObj.numberParameter().isDisplayed());
 }
 @And("^user verify Document name in document list view$")
 public void user_verify_document_name_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentNameParameter(),30, 2);
     Assert.assertEquals(true, documentDetailsObj.documentNameParameter().isDisplayed());
 }
 @And("^user verify Required at stage in document list view$")
 public void user_verify_required_at_stage_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.requiredAtStageParameter(),30, 2);
     Assert.assertEquals(true, documentDetailsObj.requiredAtStageParameter().isDisplayed());
 }
 @And("^user verify Document status in document list view$")
 public void user_verify_document_status_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentStatusParameter(),30, 2);
     Assert.assertEquals(true, documentDetailsObj.documentStatusParameter().isDisplayed());
 }
 @And("^user verify Mandatory optional in document list view$")
 public void user_verify_mandatory_optional_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.mandatoryOptionalParameter(),30, 2);
     Assert.assertEquals(true, documentDetailsObj.mandatoryOptionalParameter().isDisplayed());
 }
 @And("^user verify Document Category in document list view$")
 public void user_verify_document_category_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentCategoryParameter(),30, 2);
     Assert.assertEquals(true, documentDetailsObj.documentCategoryParameter().isDisplayed());
 }
 @And("^user verify DMS upload status in document list view$")
 public void user_verify_dms_upload_status_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.dmsUploadStatusParameter(),30, 2);
     Assert.assertEquals(true, documentDetailsObj.dmsUploadStatusParameter().isDisplayed());
 }
 @And("^user verify number parameter non editable in document list view$")
 public void user_verify_number_parameter_non_editable_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.numberDataInlistViewTable(),30, 2);
	 documentDetailsObj.numberDataInlistViewTable().click();
	 boolean Status = false;
	 try {
    	 documentDetailsObj.numberDataInlistViewTable().click();
    	 documentDetailsObj.numberDataInlistViewTable().sendKeys("2");
	} catch (Exception e) {
		Status = true;
		System.out.println("number parameter in table non editable");
	}
	 Assert.assertEquals(true, Status);
 }
 @And("^user verify Document name parameter non editable in document list view$")
 public void user_verify_document_name_parameter_non_editable_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentNameDataInlistViewTable(),30, 2);
	 boolean Status = false;
	 try {
    	 documentDetailsObj.documentNameDataInlistViewTable().click();
    	 documentDetailsObj.documentNameDataInlistViewTable().sendKeys("ajith");
	} catch (Exception e) {
		Status = true;
		System.out.println("Document name parameter in table non editable");
	}
 }
 @And("^user verify Required at stage parameter non editable in document list view$")
 public void user_verify_required_at_stage_parameter_non_editable_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.requiredAtStageDataInlistViewTable(),30, 2);
	 boolean Status = false;
	 try {
    	 documentDetailsObj.requiredAtStageDataInlistViewTable().click();
    	 documentDetailsObj.requiredAtStageDataInlistViewTable().sendKeys("offering");
	} catch (Exception e) {
		 Status=true;
		System.out.println("Required at stage parameter in table non editable");
	}
	 Assert.assertEquals(true, Status);
 }
 @And("^user verify Document status parameter non editable in document list view$")
 public void user_verify_document_status_parameter_non_editable_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentStatusDataInlistViewTable(),30, 2);
	 boolean Status = false;
	 try {
    	 documentDetailsObj.documentStatusDataInlistViewTable().click();
    	 documentDetailsObj.requiredAtStageDataInlistViewTable().sendKeys("offering");
	} catch (Exception e) {
		Status = true;
		System.out.println("Document Status parameter in table non editable");
	}
	 Assert.assertEquals(true, Status);
 }
 @And("^user verify Mandatory optional parameter non editable in document list view$")
 public void user_verify_mandatory_optional_parameter_non_editable_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.mandatoryOptionalParameter(),30, 2);
	 boolean Status = false;
	 try {
    	 documentDetailsObj.mandatoryOptionalDataInlistViewTable().click();
    	 documentDetailsObj.mandatoryOptionalDataInlistViewTable().sendKeys("F");
	} catch (Exception e) {
		Status = true;
		System.out.println("Mandatory optional parameter in table non editable");
	}
	 Assert.assertEquals(true, Status);
 }
 @And("^user verify Document Category parameter non editable in document list view$")
 public void user_verify_document_category_parameter_non_editable_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentCategoryDataInlistViewTable(),30, 2);
	 boolean Status = false;
	 try {
    	 documentDetailsObj.documentCategoryDataInlistViewTable().click();
    	 documentDetailsObj.documentCategoryDataInlistViewTable().sendKeys("3");
	} catch (Exception e) {
		Status = true;
		System.out.println("Document Category parameter in table non editable");
	}
	 Assert.assertEquals(true, Status);
 }
 @And("^user verify DMS upload status parameter non editable in document list view$")
 public void user_verify_dms_upload_status_parameter_non_editable_in_document_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentNameDataInlistViewTable(),30, 2);
	 boolean Status = false;
	 try {
    	 documentDetailsObj.documentNameDataInlistViewTable().click();
    	 documentDetailsObj.documentNameDataInlistViewTable().sendKeys("H");
	} catch (Exception e) {
		Status = true;
		System.out.println("DMS upload status parameter in table non editable");
		
	}
	 Assert.assertEquals(true, Status);
 }
 @And("^user verify the functionality of add button in document details$")
 public void user_verify_the_functionality_of_add_button_in_document_details() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.addIcon(),30, 2);
	 documentDetailsObj.addIcon().click();
 }
 @And("^user verify the functionality of back button in document details$")
 public void user_verify_the_functionality_of_back_button_in_document_details() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.backButtonInDocumentDetails(),30, 2);
	 documentDetailsObj.backButtonInDocumentDetails().click();
 }
 @And("^user search and verify match data in list view of document details$")
 public void user_search_and_verify_match_data_in_list_view_of_document_details() throws Throwable {
	 for (int i = 0; i <200; i++) {
			try {
				 documentDetailsObj.document_TempView_Search().click();	
			} catch (Exception e) {
				
			}
		}
			
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentDetailsViewSearchText(),30, 2);
	 documentDetailsObj.documentDetailsViewSearchText().click();
	 documentDetailsObj.documentDetailsViewSearchText().sendKeys("183");
 }

 @And("^user search and verify unmatched data in list view of document details$")
 public void user_search_and_verify_unmatched_data_in_list_view_of_document_details() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentDetailsViewCloseSearchText(),30, 2);
	 documentDetailsObj.documentDetailsViewCloseSearchText().click();
	 for (int i = 0; i <200; i++) {
			try {
				 documentDetailsObj.document_TempView_Search().click();	
			} catch (Exception e) {
				
			}
		}
	 documentDetailsObj.documentDetailsViewSearchText().sendKeys("012");
	 String Xpath ="//span[text()='Showing 0 to 0 of 0 entries']";
	 for (int i = 0; i <30; i++) {
		try {
			Assert.assertEquals(true, driver.findElement(By.xpath(Xpath)).isDisplayed());
		} catch (NoSuchElementException e) {
			
		}
	}
 }
 @And("^user verify the functionality of pdf download in document details list view$")
 public void user_verify_the_functionality_of_pdf_download_in_document_details_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.exportIcon(),30, 2);
	 documentDetailsObj.exportIcon().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.pdfOption(),30, 2);
	 documentDetailsObj.pdfOption().click();
	 String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		System.out.println(substring);
		File file = new File(substring);
		boolean Downloadstatus=false;
		int j=0;
		while (Downloadstatus) {
			
			j++;
			File[] totalfiles = file.listFiles();
			for (File fileName : totalfiles) {
				
				System.out.println(fileName.getName());
			  
				if (fileName.getName().equals("DocumentDataFile.pdf")) {
					System.out.println("Downloaded file present in the system");
					Downloadstatus=true;
					break;
				}
					else if (j==60) {
							Assert.fail("Downloaded file not present in system");						
					}
				}
			if (Downloadstatus) {
				break;
			}
		}
		
		seleniumActions.getBrowserHelper().switchToParentWithChildClose();
 }
 @And("^user verify the functionality of excel download in document details list view$")
 public void user_verify_the_functionality_of_excel_download_in_document_details_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.exportIcon(),30, 2);
	 documentDetailsObj.exportIcon().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.xlsOption(),30, 2);
	 seleniumActions.getClickAndActionsHelper().moveToElement(documentDetailsObj.xlsOption());
	 documentDetailsObj.xlsOption().click();
	 String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		System.out.println(substring);
		File file = new File(substring);
		
		int j=0;
		boolean downloadStatus=false;
		do {
			
			j++;
			File[] totalfiles = file.listFiles();
			for (File fileName : totalfiles) {
				System.out.println(fileName.getName());
				if (fileName.getName().contains("DocumentDataFile_export")) {
					System.out.println("Downloaded file present in system");
					downloadStatus=true;
					break;
				}
					else if (j==60) {
						
							Assert.fail("Downloaded file not present in system");
					
						
					}
				}
			if (downloadStatus) {
				break;
			}
		} while (downloadStatus);
		

		seleniumActions.getBrowserHelper().switchToParentWithChildClose();
 }
 
}
