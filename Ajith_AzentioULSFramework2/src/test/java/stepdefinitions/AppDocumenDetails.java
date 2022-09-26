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
import io.cucumber.java.en.Then;
import pageobjects.AppDocumentDetails_Obj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import testDataType.AppDocumentDetailsTestData;

public class AppDocumenDetails extends BaseClass{
 WebDriver driver = BaseClass.driver;
 JsonConfig jsonConfig = new JsonConfig();
 AppDocumentDetails_Obj documentDetailsObj = new AppDocumentDetails_Obj(driver);
 Selenium_Actions seleniumActions = new Selenium_Actions(driver);
 FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
 AppDocumentDetailsTestData appDocumentDetailsdata = jsonConfig.getApplicationDocumentDetailsistByName("Maker");
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
	 documentDetailsObj.documentDetailsViewSearchText().sendKeys(appDocumentDetailsdata.SearchMatchedData);
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
	 documentDetailsObj.documentDetailsViewSearchText().sendKeys(appDocumentDetailsdata.SearchUnMatchedData);
	 String Xpath ="//span[text()='"+appDocumentDetailsdata.SearchUnMatchedData+"']";
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
		boolean Downloadstatus=true;
		int j=0;
		do {
			
			j++;
			File[] totalfiles = file.listFiles();
			for (File fileName : totalfiles) {
				
				//System.out.println(fileName.getName());
			  
				if (fileName.getName().equals("DocumentDataFile.pdf")) {
					System.out.println("Downloaded file present in the system");
					Downloadstatus=false;
					break;
				}
					else if (j==60) {
							Assert.fail("Downloaded file not present in system");						
					}
				}
			
		}while (Downloadstatus);
		
		seleniumActions.getBrowserHelper().switchToParentWithChildClose();
 }
 @And("^user verify the functionality of excel download in document details list view$")
 public void user_verify_the_functionality_of_excel_download_in_document_details_list_view() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.exportIcon(),30, 2);
	 documentDetailsObj.exportIcon().click();
	 //seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.xlsOption(),30, 2);
	 for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getClickAndActionsHelper().moveToElement(documentDetailsObj.xlsOption());
			 documentDetailsObj.xlsOption().click();
			 break; 
		} catch (Exception e) {
			
		}
	}
	 
	 String UserDirectory = System.getProperty("user.dir");
		String substring = UserDirectory.substring(0, 21) + "Downloads";
		substring.replaceAll("/", "//");
		//System.out.println(substring);
		File file = new File(substring);
		
		int j=0;
		boolean downloadStatus=true;
		do {
			
			j++;
			File[] totalfiles = file.listFiles();
			for (File fileName : totalfiles) {
				//System.out.println(fileName.getName());
				if (fileName.getName().contains("DocumentDataFile_export")) {
					System.out.println("Downloaded file present in system");
					downloadStatus=false;
					break;
				}
					else if (j==100) {
						
							Assert.fail("Downloaded file not present in system");
					
						
					}
				}
		} while (downloadStatus);
		

		seleniumActions.getBrowserHelper().switchToParentWithChildClose();
 }
 
 @And("^user select the document name and verify the field is mandatory editable and dropdown$")
 public void user_select_the_document_name_and_verify_the_field_is_mandatory_editable_and_dropdown() throws Throwable {
  seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentName(),60, 2);
  Assert.assertEquals(true, documentDetailsObj.documentName().isDisplayed());
  verifyfield.verifyGivenFieldisMandatoryOrNot("Document Name");
  Assert.assertEquals( documentDetailsObj.documentName().getAttribute("aria-haspopup"),"listbox");
  System.out.println("Document Name Type field is "+documentDetailsObj.documentName().getAttribute("aria-haspopup"));
  documentDetailsObj.documentName().click();
  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.DocumentName+" ']//following-sibling::ion-radio";
  for (int i = 0; i <60; i++) {
	try {
		driver.findElement(By.xpath(xpath)).click();
		break;
	} catch (Exception e) {
		
	}
}
 }

 @And("^user select the Required At Stage and verify the field is non mandatory non editable and drop down$")
 public void user_select_the_required_at_stage_and_verify_the_field_is_non_mandatory_non_editable_and_drop_down() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.requiredAtStage(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.requiredAtStage().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Required At Stage");
	  Assert.assertEquals( documentDetailsObj.requiredAtStage().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Required At Stage field is "+documentDetailsObj.requiredAtStage().getAttribute("aria-haspopup"));
	  documentDetailsObj.requiredAtStage().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.RequiredAtStage+" ']//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user select the Document status and verify the field is mandatory non editable and drop down$")
 public void user_select_the_document_status_and_verify_the_field_is_mandatory_non_editable_and_drop_down() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentStatus(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.documentStatus().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Document Status");
	  Assert.assertEquals( documentDetailsObj.documentStatus().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Document Status field is "+documentDetailsObj.documentStatus().getAttribute("aria-haspopup"));
	  documentDetailsObj.documentStatus().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.DocumentStatus+" ']//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user select the Document Category and verify the field is mandatory non editable and drop down$")
 public void user_select_the_document_category_and_verify_the_field_is_mandatory_non_editable_and_drop_down() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentCategory(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.documentCategory().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Document Category");
	  Assert.assertEquals( documentDetailsObj.documentCategory().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Document Category field is "+documentDetailsObj.documentCategory().getAttribute("aria-haspopup"));
	  documentDetailsObj.documentCategory().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.DocumentCategory+" ']//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user select the Mandatory optional and verify the field is mandatory non editable and drop down$")
 public void user_select_the_mandatory_optional_and_verify_the_field_is_mandatory_non_editable_and_drop_down() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.mandatoryOrOptional(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.mandatoryOrOptional().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Mandatory/Optional");
	  Assert.assertEquals( documentDetailsObj.mandatoryOrOptional().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Mandatory optional field is "+documentDetailsObj.mandatoryOrOptional().getAttribute("aria-haspopup"));
	  documentDetailsObj.mandatoryOrOptional().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.MandatoryOptional+" ']//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user select the upload date and verify the field is mandatory editable and date$")
 public void user_select_the_upload_date_and_verify_the_field_is_mandatory_editable_and_date() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.uploadDate(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.uploadDate().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Upload Date");
	  documentDetailsObj.uploadDate().click();
	  String yearXpath ="//button[text()=' "+appDocumentDetailsdata.PresentYear+" ']";
	  for (int i = 0; i <30; i++) {
			try {
				 driver.findElement(By.xpath(yearXpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	  String yearXpath2 ="//span[text()=' "+appDocumentDetailsdata.UploadYear+" ']";
	  while (true) {
		try {
			driver.findElement(By.xpath(yearXpath2)).click();
			break;
		} catch (NoSuchElementException e) {
			String xpath="//body/div[1]/div[2]/span[1]";
			String year = driver.findElement(By.xpath(xpath)).getText();
			int firstyear = Integer.parseInt(year);
			if (firstyear>Integer.parseInt(appDocumentDetailsdata.UploadYear)) {
				documentDetailsObj.previousbuttonIncalendar().click();
			}
			else {
				documentDetailsObj.nextbuttonIncalendar().click();
				
			}
		}
	}
	  String monthXpath ="//span[text()=' "+appDocumentDetailsdata.UploadMonth+" ']";
	  for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(monthXpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
	  String dateXpath ="//span[text()='"+appDocumentDetailsdata.UploadDate+"']";
	  for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(dateXpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user select the Deferral Stage and verify the field is mandatory editable and dropdown$")
 public void user_select_the_deferral_stage_and_verify_the_field_is_mandatory_editable_and_dropdown() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.deferralStage(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.deferralStage().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Deferral Stage");
	  Assert.assertEquals( documentDetailsObj.deferralStage().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Deferral Stage field is "+documentDetailsObj.deferralStage().getAttribute("aria-haspopup"));
	  documentDetailsObj.deferralStage().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.DefferalStage+" ']//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user select the Expected Date and verify the field is mandatory editable and date$")
 public void user_select_the_expected_date_and_verify_the_field_is_mandatory_editable_and_date() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.expectedReceiptDate(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.expectedReceiptDate().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Expected Receipt Date");
	  documentDetailsObj.expectedReceiptDate().click();
	  String yearXpath ="//button[text()=' "+appDocumentDetailsdata.PresentYear+" ']";
	  for (int i = 0; i <30; i++) {
			try {
				 driver.findElement(By.xpath(yearXpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	  String yearXpath2 ="//span[text()=' "+appDocumentDetailsdata.ExpectedReceiptYear+" ']";
	  while (true) {
		try {
			driver.findElement(By.xpath(yearXpath2)).click();
			break;
		} catch (NoSuchElementException e) {
			String xpath="//body/div[1]/div[2]/span[1]";
			String year = driver.findElement(By.xpath(xpath)).getText();
			int firstyear = Integer.parseInt(year);
			if (firstyear>Integer.parseInt(appDocumentDetailsdata.ExpectedReceiptYear)) {
				documentDetailsObj.previousbuttonIncalendar().click();
			}
			else {
				documentDetailsObj.nextbuttonIncalendar().click();
				
			}
			
		}
	}
	  String monthXpath ="//span[text()=' "+appDocumentDetailsdata.ExpectedReceptMonth+" ']";
	  for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(monthXpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
	  String dateXpath ="//span[text()='"+appDocumentDetailsdata.ExpectedReceptDate+"']";
	  for (int i = 0; i <30; i++) {
		try {
			driver.findElement(By.xpath(dateXpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}

 }

 @And("^user select the Deffered Approved by and verify the field is mandatory editable and dropdown$")
 public void user_select_the_deffered_approved_by_and_verify_the_field_is_mandatory_editable_and_dropdown() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.defApprovedBy(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.defApprovedBy().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Def Approved By");
	  Assert.assertEquals( documentDetailsObj.defApprovedBy().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Deffered Approved by field is "+documentDetailsObj.deferralStage().getAttribute("aria-haspopup"));
	  documentDetailsObj.defApprovedBy().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.DeferredApprovedBy+" ']//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));;
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user select the Change in nature approved by and verify the field is non mandatory editable and dropdown$")
 public void user_select_the_change_in_nature_approved_by_and_verify_the_field_is_non_mandatory_editable_and_dropdown() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.ChangeInNatureApprovedBy(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.ChangeInNatureApprovedBy().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Change In Nature Approved By");
	  Assert.assertEquals( documentDetailsObj.ChangeInNatureApprovedBy().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Change in Nature Approved By field is "+documentDetailsObj.ChangeInNatureApprovedBy().getAttribute("aria-haspopup"));
	 documentDetailsObj.ChangeInNatureApprovedBy().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.ChangeInNatureApprovedBy+" ']//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));;
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user enter remark and verify the field is no mandatory editable and text area$")
 public void user_enter_remark_and_verify_the_field_is_no_mandatory_editable_and_text_area() throws Throwable {
	 seleniumActions.getJavascriptHelper().scrollIntoView(documentDetailsObj.remarkInDocumentDetails());
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.remarkInDocumentDetails(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.remarkInDocumentDetails().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Remark"); //type="text"
	 Assert.assertTrue(documentDetailsObj.remarkInDocumentDetails().getAttribute("name").contains("ion-textarea"), "Remark Field is a text area");
	  documentDetailsObj.remarkInDocumentDetails().click();
	  for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.remarkInDocumentDetails().sendKeys(appDocumentDetailsdata.Remark);
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user select document form and verify the field is non mandatory editable and dropdown$")
 public void user_select_document_form_and_verify_the_field_is_non_mandatory_editable_and_dropdown() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentForm(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.documentForm().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Document Form");
	  Assert.assertEquals( documentDetailsObj.documentForm().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Document Form field is "+documentDetailsObj.documentForm().getAttribute("aria-haspopup"));
	  documentDetailsObj.documentForm().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.DocumentForm+" ' ]//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user select document quality and verify the field is non mandatory editable and dropdown$")
 public void user_select_document_quality_and_verify_the_field_is_non_mandatory_editable_and_dropdown() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentQuality(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.documentQuality().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Document Quality");
	  Assert.assertEquals( documentDetailsObj.documentQuality().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Document Quality field is "+documentDetailsObj.documentQuality().getAttribute("aria-haspopup"));
	  documentDetailsObj.documentQuality().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.DocumentQuality+" ' ]//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }


 @And("^user select document number and verify the field is non mandatory non editable and hyperlink$")
 public void user_select_document_number_and_verify_the_field_is_non_mandatory_non_editable_and_hyperlink() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentReferenceNumber(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.documentReferenceNumber().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Document Reference Number"); //type="text"
	  Assert.assertEquals( documentDetailsObj.documentReferenceNumber().getAttribute("type"),"text");
	  System.out.println("Document Reference field is "+documentDetailsObj.documentReferenceNumber().getAttribute("type"));
	  documentDetailsObj.documentReferenceNumber().click();
	  for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.documentReferenceNumber().sendKeys(appDocumentDetailsdata.DocumentReferenceNumber);
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user select document received by and verify the field is non mandatory non editable and hyperlink$")
 public void user_select_document_received_by_and_verify_the_field_is_non_mandatory_non_editable_and_hyperlink() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentReceivedBy(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.documentReceivedBy().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Document Received By");
	  Assert.assertEquals( documentDetailsObj.documentReceivedBy().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Document received by field is "+documentDetailsObj.documentReceivedBy().getAttribute("aria-haspopup"));
	  documentDetailsObj.documentReceivedBy().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.DcoumentReceivedBy+" ' ]//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
	
 }

 @And("^user select location where received and verify the field is non mandatory non editable and hyperlink$")
 public void user_select_location_where_received_and_verify_the_field_is_non_mandatory_non_editable_and_hyperlink() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.locationWhereReceived(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.locationWhereReceived().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Location Where Received");
	  Assert.assertEquals( documentDetailsObj.locationWhereReceived().getAttribute("aria-haspopup"),"listbox");
	  System.out.println("Location where received field is "+documentDetailsObj.locationWhereReceived().getAttribute("aria-haspopup"));
	  documentDetailsObj.locationWhereReceived().click();
	  String xpath ="//ion-label[text()=' "+appDocumentDetailsdata.LocationWhereReceived+" ' ]//following-sibling::ion-radio";
	  for (int i = 0; i <30; i++) {
		try {
			seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user enter the rack number and verify the field is non mandatory non editable and hyperlink$")
 public void user_enter_the_rack_number_and_verify_the_field_is_non_mandatory_non_editable_and_hyperlink() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.rackNumber(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.rackNumber().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Rack No."); //type="text"
	  Assert.assertEquals( documentDetailsObj.rackNumber().getAttribute("type"),"text");
	  System.out.println("Rack Number field is "+documentDetailsObj.rackNumber().getAttribute("type"));
	  documentDetailsObj.rackNumber().click();
	  for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.rackNumber().sendKeys(appDocumentDetailsdata.RackNumber);
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user enter the shelf number and verify the field is non mandatory non editable and hyperlink$")
 public void user_enter_the_shelf_number_and_verify_the_field_is_non_mandatory_non_editable_and_hyperlink() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.shelfNumber(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.shelfNumber().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Shelf No."); //type="text"
	  Assert.assertEquals( documentDetailsObj.shelfNumber().getAttribute("type"),"text");
	  System.out.println("Shelf Number field is "+documentDetailsObj.shelfNumber().getAttribute("type"));
	  documentDetailsObj.rackNumber().click();
	  for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.shelfNumber().sendKeys(appDocumentDetailsdata.ShelfNumber);
			break;
		} catch (Exception e) {
			
		}
	}
 }

 @And("^user enter the box number and verify the field is non mandatory non editable and hyperlink$")
 public void user_enter_the_box_number_and_verify_the_field_is_non_mandatory_non_editable_and_hyperlink() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.boxNumber(),60, 2);
	 Assert.assertEquals(true, documentDetailsObj.boxNumber().isDisplayed());
	 verifyfield.verifyGivenFieldisMandatoryOrNot("Box No."); //type="text"
	  Assert.assertEquals( documentDetailsObj.boxNumber().getAttribute("type"),"text");
	  System.out.println("Box Number field is "+documentDetailsObj.shelfNumber().getAttribute("type"));
	  documentDetailsObj.boxNumber().click();
	  for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.boxNumber().sendKeys(appDocumentDetailsdata.BoxNo);
			break;
		} catch (Exception e) {
			
		}
	}
 }
 
 @And("^user save the record in document details$")
 public void user_save_the_record_in_document_details() throws Throwable {
	 seleniumActions.getJavascriptHelper().scrollIntoView(documentDetailsObj.documentDetailsSave());
	 documentDetailsObj.documentDetailsSave().click();
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.successMgs(),30, 2);
	 Assert.assertEquals(documentDetailsObj.successMgs().isDisplayed(),true);
 }
 @And("^user save the record in document details for blank field verification$")
 public void user_save_the_record_in_document_details_for_blank_field_verification() throws Throwable {
	 seleniumActions.getJavascriptHelper().scrollIntoView(documentDetailsObj.documentDetailsSave());
	 for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.documentDetailsSave().click();
			break;
		} catch (Exception e) {
			
		}
	}
	 
 }

 @And("^user verify the impact when user keep any mandatory field blank and click on save button$")
 public void user_verify_the_impact_when_user_keep_any_mandatory_field_blank_and_click_on_save_button() throws Throwable {
    String documentName = (String) seleniumActions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-badge')[1].innerText");
    Assert.assertEquals(documentName,"Required field");
    String documentCategory = (String) seleniumActions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-badge')[2].innerText");
    Assert.assertEquals(documentCategory,"Required field");
 }
 
 @Then("^The system should not allow user to do a modification with invalid data$")
 public void the_system_should_not_allow_user_to_do_a_modification_with_invalid_data() throws Throwable {
	 //document reference number
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentReferenceNumber(),60, 2);
	  documentDetailsObj.documentReferenceNumber().click();
	  for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.documentReferenceNumber().sendKeys(appDocumentDetailsdata.InvalidInput);
			break;
		} catch (Exception e) {
			
		}
	}
	  String RefernceerrorMessage = (String) seleniumActions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-badge')[3].innerText");
	  Assert.assertEquals(RefernceerrorMessage, "Alphanumeric characters allowed");
	  //Rack Number
	  seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.rackNumber(),60, 2);
	  documentDetailsObj.rackNumber().click();
	  for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.rackNumber().sendKeys(appDocumentDetailsdata.InvalidInput);
			break;
		} catch (Exception e) {
			
		}
	}
	  String RackNumbererrorMessage = (String) seleniumActions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-badge')[4].innerText");
	  Assert.assertEquals(RackNumbererrorMessage, "Alphanumeric characters allowed");
	  //Shelf Number
	  seleniumActions.getJavascriptHelper().scrollIntoView(documentDetailsObj.shelfNumber());
	  seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.shelfNumber(),60, 2);
	  documentDetailsObj.shelfNumber().click();
	  for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.shelfNumber().sendKeys(appDocumentDetailsdata.InvalidInput);
			break;
		} catch (Exception e) {
			
		}
	}
	  String ShelfNumbererrorMessage = (String) seleniumActions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-badge')[5].innerText");
	  Assert.assertEquals(ShelfNumbererrorMessage, "Alphanumeric characters allowed");
	  //Box Number
	  seleniumActions.getJavascriptHelper().scrollIntoView(documentDetailsObj.boxNumber());
	  seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.boxNumber(),60, 2);
	  documentDetailsObj.boxNumber().click();
	  for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.boxNumber().sendKeys(appDocumentDetailsdata.InvalidInput);
			break;
		} catch (Exception e) {
			
		}
	}
	  String BoxNumbererrorMessage = (String) seleniumActions.getJavascriptHelper().executeScript("return document.getElementsByTagName('ion-badge')[6].innerText");
	  Assert.assertEquals(BoxNumbererrorMessage, "Alphanumeric characters allowed");
	  
 }

 @And("^User Change document name to default value$")
 public void user_change_document_name_to_default_value() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentName(),60, 2);
	  documentDetailsObj.documentName().click();
	  String xpath ="//ion-label[text()=' Select ']//following-sibling::ion-radio";
	  for (int i = 0; i <60; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
	  
 }

 @And("^User Change document Category to default value$")
 public void user_change_document_category_to_default_value() throws Throwable {
	 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,documentDetailsObj.documentCategory(),60, 2);
	  documentDetailsObj.documentCategory().click();
	  String xpath ="//ion-label[text()=' Select ']//following-sibling::ion-radio";
	  for (int i = 0; i <60; i++) {
		try {
			driver.findElement(By.xpath(xpath)).click();
			break;
		} catch (Exception e) {
			
		}
	}
 }
 @And("^user update the record in document details for blank field verification$")
 public void user_update_the_record_in_document_details_for_blank_field_verification() throws Throwable {
	 seleniumActions.getJavascriptHelper().scrollIntoView(documentDetailsObj.documentDetailsUpdate());
	 for (int i = 0; i <30; i++) {
		try {
			documentDetailsObj.documentDetailsUpdate().click();
			break;
		} catch (Exception e) {
			
		}
	}
 }
 
}
