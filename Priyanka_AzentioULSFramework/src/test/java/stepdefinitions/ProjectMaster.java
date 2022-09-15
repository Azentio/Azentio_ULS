package stepdefinitions;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.AlertHelper;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.ProjectMasterObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.ProjectMasterTestDataType;

public class ProjectMaster extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver) ;
	AlertHelper alertHelper = new AlertHelper(driver);
	ProjectMasterObj projectMasterObj = new ProjectMasterObj(driver);
	ProjectMasterTestDataType projectMasterTestDataType = jsonReader.getProjectMasterByName("Maker");
	JsonDataReaderWriter jsonReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);


	@Then("^click on Project Setup$")
    public void click_on_project_setup()  {
	waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.project_Setup(), 30, 1);
	projectMasterObj.project_Setup().click();     
    }

    @Then("^click on Project Master eye icon$")
    public void click_on_project_master_eye_icon()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_EyeIcon(), 30, 1);
    projectMasterObj.projectMaster_EyeIcon().click();    
    }

    @Then("^click on Project Master add button$")
    public void click_on_project_master_add_button()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_AddButton(), 30, 1);
    projectMasterObj.projectMaster_AddButton().click();     
    }	
   //-----------------List view--------------------------------------//
    @Then("^verify Project details list view fields should display all the fields$")
    public void verify_project_details_list_view_fields_should_display_all_the_fields() throws Throwable {
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_AddButton(), 30, 1);
    projectMasterObj.projectMaster_AddButton().isDisplayed();
    projectMasterObj.projectMaster_Search().isDisplayed();
    projectMasterObj.projectMaster_Export().isDisplayed();
    	
    projectMasterObj.projectMaster_Export().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_PdfFile(), 30, 1);
    projectMasterObj.projectMaster_PdfFile().isDisplayed();
    projectMasterObj.projectMaster_XlsFile().isDisplayed();
    projectMasterObj.projectMaster_Export().click();
    	
    projectMasterObj.projectMaster_ListView_ProjectCode().isDisplayed();
    projectMasterObj.projectMaster_ListView_ProjectName().isDisplayed();
    projectMasterObj.projectMaster_ListView_Builder().isDisplayed();
    projectMasterObj.projectMaster_ListView_Group().isDisplayed();
    projectMasterObj.projectMaster_ListView_City().isDisplayed();
    projectMasterObj.projectMaster_ListView_State().isDisplayed();	  
    projectMasterObj.projectMaster_ListView_MakerDate().isDisplayed();	
    projectMasterObj.projectMaster_ListView_CheckerDate().isDisplayed();
    projectMasterObj.projectMaster_ListView_Status().isDisplayed();
   
    }
    @Then("^verify Values in Project details List view should be non editable$")
    public void verify_values_in_project_details_list_view_should_be_non_editable()   {
    
    try {
    	projectMasterObj.projectMaster_ListView_ProjectCode().sendKeys("ok");
    	projectMasterObj.projectMaster_ListView_ProjectName().sendKeys("ok");
    	projectMasterObj.projectMaster_ListView_Builder().sendKeys("ok");;
        projectMasterObj.projectMaster_ListView_Group().sendKeys("ok");;
        projectMasterObj.projectMaster_ListView_City().sendKeys("ok");;
        projectMasterObj.projectMaster_ListView_State().sendKeys("ok");;	  
        projectMasterObj.projectMaster_ListView_MakerDate().sendKeys("ok");;	
        projectMasterObj.projectMaster_ListView_CheckerDate().sendKeys("ok");;
        projectMasterObj.projectMaster_ListView_Status().sendKeys("ok");;
    	System.out.println("Values in list view is editable");
    		
    }catch(Exception e){
    	System.out.println("Values in list view is not editable");
    }    
   }
   
    @Then("^verify Project details add button should allow to create new record$")
    public void verify_project_details_add_button_should_allow_to_create_new_record() throws Throwable {
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_AddButton(), 30, 1);
    projectMasterObj.projectMaster_AddButton().click();
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_SaveButton(), 30, 1);
    projectMasterObj.projectMaster_SaveButton().isDisplayed();
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_BackButton(), 30, 1);
    projectMasterObj.projectMaster_BackButton().click();
      
    }

    @Then("^verify Project details search box should display matching record with matched data$")
    public void verify_project_details_search_box_should_display_matching_record_with_matched_data() throws Throwable {
    while (true) {
	try {
		waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_Search(), 30, 1);
		 projectMasterObj.projectMaster_Search().click();
		 break;
		} catch (StaleElementReferenceException se) {

		}
	}
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_SearchInputField(), 30, 1);
	projectMasterObj.projectMaster_SearchInputField().sendKeys(projectMasterTestDataType.ProjectName);
	
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_ListViewFirstFieldOf_ProjectName(), 30, 1);
    String projectName  =projectMasterObj.projectMaster_ListViewFirstFieldOf_ProjectName().getText();
    Assert.assertEquals(projectMasterTestDataType.ProjectName, projectName); 
    
 
    }

    @Then("^verify Project details search box should not display any record with mismatched data$")
    public void verify_project_details_search_box_should_not_display_any_record_with_mismatched_data() throws Throwable {
        waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_SearchCloseButton(), 30, 1);
        projectMasterObj.projectMaster_SearchCloseButton().click();
    	clicksAndActionHelper.doubleClick(projectMasterObj.projectMaster_SearchInputField());
    Thread.sleep(4000);
    projectMasterObj.projectMaster_SearchInputField().sendKeys("412379");
    Thread.sleep(4000);
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_NoDataFoundInSearch(), 30, 1);
    projectMasterObj.projectMaster_NoDataFoundInSearch().isDisplayed();
    projectMasterObj.projectMaster_SearchCloseButton().click();
    
    }

    @Then("^click on Project details export pdf button system should download Pdf file$")
    public void click_on_project_details_export_pdf_button_system_should_download_pdf_file() throws Throwable {
    projectMasterObj.projectMaster_Export().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_PdfFile(), 30, 1);
    projectMasterObj.projectMaster_PdfFile().click();
    browserHelper.SwitchToWindow(1);
    browserHelper.switchToParentWithChildClose();   
    }

    @Then("^click on Project details export excel button system should download Excel file$")
    public void click_on_project_details_export_excel_button_system_should_download_excel_file() throws Throwable {
    while (true) {
		try {
			waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_Export());
	    	projectMasterObj.projectMaster_Export().click();
			break;
		} catch (StaleElementReferenceException se) {

		}
	}
    	waithelper.waitForElementwithFluentwait(driver, projectMasterObj.projectMaster_XlsFile());
    	projectMasterObj.projectMaster_XlsFile().click();
       
    }
    //-----------------------View Workflow------------------------//
    
    @Then("^click on the Project Master view summary$")
    public void click_on_the_project_master_view_summary() throws Throwable {
//    	waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_ViewSummary(), 60, 2);
//        WebElement viewsummary = projectMasterObj.projectMaster_ViewSummary(); 
//        clicksAndActionHelper.JSEClick(viewsummary);     
    }

    @Then("^verify the Project Master fields of view summary$")
    public void verify_the_project_master_fields_of_view_summary() throws Throwable {
        
    }

    @Then("^close the Project Master view summary$")
    public void close_the_project_master_view_summary() throws Throwable {
        
    }
    
    //-------------------------------------------//

    @Then("^click on Project Master edit icon$")
    public void click_on_project_master_edit_icon()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_EditIcon(), 30, 1);
    projectMasterObj.projectMaster_EditIcon().click();       
    }
    
    @Then("^open the project master record$")
    public void open_the_project_master_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMaster_ActionEdit(), 30, 2);
    projectMasterObj.projectMaster_ActionEdit().click();      
    }
	
    @Then("^click on Project Master Building add button$")
    public void click_on_project_master_building_add_button() throws InterruptedException  {
    	Thread.sleep(1000);
    javascripthelper.scrollIntoView(projectMasterObj.projectMaster_BuildingAddButton());
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_BuildingAddButton(), 30, 1);
	projectMasterObj.projectMaster_BuildingAddButton().click();    	   

//    while(true)
//    {
//    	try {
//    		projectMasterObj.projectMaster_BuildingAddButton().click();    	   
//    		break;
//    	    }
//    	catch(Exception e) { 
//    		
//    	}
//    }
     
    }
    @Then("^verify the field Unit Type$")
    public void verify_the_field_unit_type()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_UnitType(), 30, 1);
    projectMasterObj.projectMaster_UnitType().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Unit Type");
    projectMasterObj.projectMaster_UnitType().click();
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_UnitType_Dropdown(), 30, 1);
    projectMasterObj.projectMaster_UnitType_Dropdown().click();
    
   }
    @Then("^verify the field Building Name$")
    public void verify_the_field_building_name()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_BuildingName(), 30, 1);
    projectMasterObj.projectMaster_BuildingName().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Building Name");
    projectMasterObj.projectMaster_BuildingName().click();
    projectMasterObj.projectMaster_BuildingName().sendKeys(projectMasterTestDataType.BuildingName);
    
    }

    @Then("^verify the field Building Type$")
    public void verify_the_field_building_type()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_BuildingType(), 30, 1);
    projectMasterObj.projectMaster_BuildingType().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Building Type");
    projectMasterObj.projectMaster_BuildingType().click();
        
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_BuildingType_Dropdown(), 30, 1);
    projectMasterObj.projectMaster_BuildingType_Dropdown().click();   
    
    }

    @Then("^verify the field Total Floors$")
    public void verify_the_field_total_floors()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_TotalFloors(), 30, 1);
    projectMasterObj.projectMaster_TotalFloors().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Total Floors");
  while(true)
  {
  	try {
  	    projectMasterObj.projectMaster_TotalFloors().click();
  	    projectMasterObj.projectMaster_TotalFloors().sendKeys(projectMasterTestDataType.TotalFloors);   	   
  		break;
  	    }
  	catch(Exception e) { 
  	}
  }        
    }

    @Then("^verify the field Total Flats$")
    public void verify_the_field_total_flats()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_TotalFlats(), 30, 1);
    projectMasterObj.projectMaster_TotalFlats().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Total Flats");
    projectMasterObj.projectMaster_TotalFlats().click();
    projectMasterObj.projectMaster_TotalFlats().sendKeys(projectMasterTestDataType.TotalFlats);         
    }

    @Then("^verify the field Tentative Start Dates$")
    public void verify_the_field_tentative_start_dates()   {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_TentativeStartDates(), 30, 1);
    projectMasterObj.projectMaster_TentativeStartDates().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Tentative Start Dates");
    projectMasterObj.projectMaster_TentativeStartDates().click();
    projectMasterObj.projectMaster_TentativeStartDates().sendKeys(projectMasterTestDataType.TentativeStartDates);         
   
    }

    @Then("^verify the field Tentative End Dates$")
    public void verify_the_field_tentative_end_dates() {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_TentativeEndDates(), 30, 1);
    projectMasterObj.projectMaster_TentativeEndDates().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Tentative End Dates");
    projectMasterObj.projectMaster_TentativeEndDates().click();
    projectMasterObj.projectMaster_TentativeEndDates().sendKeys(projectMasterTestDataType.TentativeEndDates);         
        
    }

    @Then("^verify the field Disbursment Amount$")
    public void verify_the_field_disbursment_amount()   {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_DisbursmentAmount(), 30, 1);
    projectMasterObj.projectMaster_DisbursmentAmount().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Disbursment Amount");
    projectMasterObj.projectMaster_DisbursmentAmount().click();
    projectMasterObj.projectMaster_DisbursmentAmount().sendKeys(projectMasterTestDataType.DisbursmentAmount);         
      
    }

    @Then("^verify the field Exposed No of Flats$")
    public void verify_the_field_exposed_no_of_flats()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_ExposedNoOfFlats(), 30, 1);
    projectMasterObj.projectMaster_ExposedNoOfFlats().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Exposed No of Flats");
    projectMasterObj.projectMaster_ExposedNoOfFlats().click();
    projectMasterObj.projectMaster_ExposedNoOfFlats().sendKeys(projectMasterTestDataType.ExposedNoOfFlats);         
     
        
    }

    @Then("^verify the field Verified By$")
    public void verify_the_field_verified_by()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_VerifiedBy(), 30, 1);
    projectMasterObj.projectMaster_VerifiedBy().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Verified By");
    projectMasterObj.projectMaster_VerifiedBy().click();
    projectMasterObj.projectMaster_VerifiedBy().sendKeys(projectMasterTestDataType.VerifiedBy);         
             
    }

    @Then("^verify the field Stage of Completion$")
    public void verify_the_field_stage_of_completion()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_StageOfCompletion(), 30, 1);
    projectMasterObj.projectMaster_StageOfCompletion().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("projectMaster_StageOfCompletion");
    projectMasterObj.projectMaster_StageOfCompletion().click();
    projectMasterObj.projectMaster_StageOfCompletion().sendKeys(projectMasterTestDataType.StageOfCompletion);         
             
    }

    @Then("^verify the field Verified On$")
    public void verify_the_field_verified_on()  {
   	waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_VerifiedOn(), 30, 1);
    projectMasterObj.projectMaster_VerifiedOn().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Verified On");
    projectMasterObj.projectMaster_VerifiedOn().click();
    projectMasterObj.projectMaster_VerifiedOn().sendKeys(projectMasterTestDataType.VerifiedOn); 
    
             
    }

    @Then("^verify the field CLP$")
    public void verify_the_field_clp()  {
    javascripthelper.scrollIntoView(projectMasterObj.projectMaster_CLP());
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_CLP(), 30, 1);
    projectMasterObj.projectMaster_CLP().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("CLP");
    projectMasterObj.projectMaster_CLP().click();
            
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_CLPDropDown(), 30, 1);
    projectMasterObj.projectMaster_CLPDropDown().click();        
    }

    @Then("^verify the field Flexi$")
    public void verify_the_field_flexi()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_Flexi(), 30, 1);
    projectMasterObj.projectMaster_Flexi().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Flexi");
    projectMasterObj.projectMaster_Flexi().click();
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_FlexiDropDown(), 30, 1);
    while(true)
    {
    	try {
    		projectMasterObj.projectMaster_FlexiDropDown().click();     	   
    		break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
           
    }

    @Then("^verify the field Installment Linked$")
    public void verify_the_field_installment_linked()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_InstallmentLinked(), 30, 1);
    projectMasterObj.projectMaster_InstallmentLinked().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Installment Linked");
    projectMasterObj.projectMaster_InstallmentLinked().click();
        
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_InstallmentLinkedDropDown(), 30, 1);
    while(true)
    {
    	try {
    		projectMasterObj.projectMaster_InstallmentLinkedDropDown().click();       	   
    		break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
       
    }

    @Then("^verify the field Down Payment Flag$")
    public void verify_the_field_down_payment_flag()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_DownPaymentFlag(), 30, 1);
    projectMasterObj.projectMaster_DownPaymentFlag().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Down Payment Flag");
    projectMasterObj.projectMaster_DownPaymentFlag().click();
            
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_DownPaymentFlagDropDown(), 30, 1);
  while(true)
  {
  	try {
  		projectMasterObj.projectMaster_DownPaymentFlagDropDown().click();     	   
  		break;
  	    }
  	catch(Exception e) { 
  		
  	}
  }
         
    }

    @Then("^verify the field Subvention Flag$")
    public void verify_the_field_subvention_flag()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_SubventionFlag(), 30, 1);
    projectMasterObj.projectMaster_SubventionFlag().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Subvention Flag");
    projectMasterObj.projectMaster_SubventionFlag().click();
            
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_SubventionFlagDropDown(), 30, 1);
    while(true)
    {
    	try {
    		 projectMasterObj.projectMaster_SubventionFlagDropDown().click();      	   
    		break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
       
    }

    @Then("^verify the field CF Flag$")
    public void verify_the_field_cf_flag()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_CfFlag(), 30, 1);
    projectMasterObj.projectMaster_CfFlag().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("CF Flag");
    projectMasterObj.projectMaster_CfFlag().click();
            
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_CfFlagDropDown(), 30, 1);
    while(true)
    {
    	try {
    		 projectMasterObj.projectMaster_CfFlagDropDown().click();    	   
    		break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
      
    }

    @Then("^verify the field Negative Remarks$")
    public void verify_the_field_negative_remarks()  {
   // javascripthelper.scrollIntoView(projectMasterObj.projectMaster_NegativeRemarks());
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_NegativeRemarks(), 30, 1);
    projectMasterObj.projectMaster_NegativeRemarks().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Negative Remarks");
    while(true)
    {
    	try {
    		projectMasterObj.projectMaster_NegativeRemarks().click();
    		projectMasterObj.projectMaster_NegativeRemarks().sendKeys(projectMasterTestDataType.NegativeRemarks);    
    		break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
   }

    @Then("^verify the field Basic Sales Price$")
    public void verify_the_field_basic_sales_price()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_BasicSalesPrice(), 30, 1);
    projectMasterObj.projectMaster_BasicSalesPrice().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Basic Sales Price/Sq Feet");
    projectMasterObj.projectMaster_BasicSalesPrice().click();
    projectMasterObj.projectMaster_BasicSalesPrice().sendKeys(projectMasterTestDataType.BasicSalesPrice);   
    }

    @Then("^verify the field Exposure Unit$")
    public void verify_the_field_exposure_unit()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_ExposureUnit(), 30, 1);
    projectMasterObj.projectMaster_ExposureUnit().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Exposure Unit");
    projectMasterObj.projectMaster_ExposureUnit().click();
    projectMasterObj.projectMaster_ExposureUnit().sendKeys(projectMasterTestDataType.ExposureUnit);    
    }

    @Then("^verify the field Overall Recommendations$")
    public void verify_the_field_overall_recommendations()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_OverallRecommendations(), 30, 1);
    projectMasterObj.projectMaster_OverallRecommendations().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Overall % Recommendations");
    projectMasterObj.projectMaster_OverallRecommendations().click();
    projectMasterObj.projectMaster_OverallRecommendations().sendKeys(projectMasterTestDataType.OverallRecommendations);    
    }

    @Then("^verify the field Construction Status$")
    public void verify_the_field_construction_status()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_ConstructionStatus(), 30, 1);
    projectMasterObj.projectMaster_ConstructionStatus().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Construction Status");
    projectMasterObj.projectMaster_ConstructionStatus().click();
    projectMasterObj.projectMaster_ConstructionStatus().sendKeys(projectMasterTestDataType.ConstructionStatus);   
    }

    @Then("^verify the field RERA Registration$")
    public void verify_the_field_rera_registration()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_RERA_Registration(), 30, 1);
    projectMasterObj.projectMaster_RERA_Registration().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("RERA Registration");
    projectMasterObj.projectMaster_RERA_Registration().click();
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_RERA_RegistrationDropDown(), 30, 1);
    while(true)
    {
    	try {
    		projectMasterObj.projectMaster_RERA_RegistrationDropDown().click();    	   
    		break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    
    }

    @Then("^verify the field RERA Registration Number$")
    public void verify_the_field_rera_registration_number()  {
    
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_RERA_Registration_Number(), 30, 1);
    projectMasterObj.projectMaster_RERA_Registration_Number().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("RERA Registration No");
    while(true)
    {
    	try {
    		projectMasterObj.projectMaster_RERA_Registration_Number().click();
    	    projectMasterObj.projectMaster_RERA_Registration_Number().sendKeys(projectMasterTestDataType.RERARegistrationNumber);   	   
    		break;
    	    }
    	catch(Exception e) { 
    		
    	}
    }
    
    }

    @Then("^verify the field Building Details Remark$")
    public void verify_the_field_building_details_remark() throws InterruptedException  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_Remarks(), 30, 1);
    projectMasterObj.projectMaster_Remarks().isDisplayed();
    findFieldisMandatoryorNot.verifyGivenFieldisMandatoryOrNot("Remarks");
    projectMasterObj.projectMaster_Remarks().click();
    projectMasterObj.projectMaster_Remarks().sendKeys(projectMasterTestDataType.Remark);
    Thread.sleep(2000);
    }
    
	
	
}
