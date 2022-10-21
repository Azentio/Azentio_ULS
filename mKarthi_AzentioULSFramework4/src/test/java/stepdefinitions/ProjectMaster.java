package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.Asset_CD_MasterOBJ;
import pageobjects.ProjectMasterOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class ProjectMaster {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	ProjectMasterOBJ Project = new ProjectMasterOBJ(driver);
	FindFieldisMandatoryorNot mandatoryornot = new FindFieldisMandatoryorNot(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","ProjectMasterTestData","Data Set ID");
	Map<String, String> testData;
	
	
	    @And("^User click the project master edit icon in project master$")
	    public void user_click_the_project_master_edit_icon_in_project_master() throws Throwable {
	    	
	    	//help.waitForElementToVisibleWithFluentWait(driver, Project.ProjectMasterEditIcon(), 60, 5);
	    	for(int i=0; i<20; i++) {
	    		try {
	    			Project.ProjectMasterEditIcon().click();
	    			break;
				} catch (Exception e) {
					
				}
	    	}
	    	
	        
	    }

	    @And("^User click the action edit icon in project master$")
	    public void user_click_the_action_edit_icon_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.ActionEditIcon(), 60, 5);
	    	Project.ActionEditIcon().click();
	        
	    }

	    @And("^User click the building details action edit icon in project master$")
	    public void user_click_the_building_details_action_edit_icon_in_project_master() throws Throwable {
	    	
	    	for(int i=0; i<20; i++) {
	    		try {
	    			seleniumactions.getJavascriptHelper().scrollIntoView(Project.BuildingDetailsActionEditIcon());
	    	    	//help.waitForElementToVisibleWithFluentWait(driver, Project.BuildingDetailsActionEditIcon(), 60, 5);
	    	    	Project.BuildingDetailsActionEditIcon().click();
	    	    	break;
				} catch (Exception e) {
					
				}
	    	}
	    	
	        
	    }

	    @And("^User verify the Unit Type in project master$")
	    public void user_verify_the_unit_type_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.UnitTypeVerify(), 60, 5);
	    	String ProjectMaster = Project.UnitTypeVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Unit Type"), true);
	        
	    }

	    @And("^User verify the Building Name in project master$")
	    public void user_verify_the_building_name_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.BuildingNameVerify(), 60, 5);
	    	String ProjectMaster = Project.BuildingNameVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Building Name"), true);
	        
	    }

	    @And("^User verify the Building Type in project master$")
	    public void user_verify_the_building_type_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.BuildingTypeVerify(), 60, 5);
	    	String ProjectMaster = Project.BuildingTypeVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Building Type"), true);
	        
	    }

	    @And("^User verify the Total Floors in project master$")
	    public void user_verify_the_total_floors_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.TotalFloorsVerify(), 60, 5);
	    	String ProjectMaster = Project.TotalFloorsVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Total Floors"), true);
	        
	    }

	    @And("^User verify the Total Flats in project master$")
	    public void user_verify_the_total_flats_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.TotalFlatsVerify(), 60, 5);
	    	String ProjectMaster = Project.TotalFlatsVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Total Flats"), true);
	        
	    }

	    @And("^User verify the Tentative Start Dates in project master$")
	    public void user_verify_the_tentative_start_dates_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.TentativeStartDatesVerify(), 60, 5);
	    	String ProjectMaster = Project.TentativeStartDatesVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Tentative Start Dates"), true);
	        
	    }

	    @And("^User verify the Tentative End Dates in project master$")
	    public void user_verify_the_tentative_end_dates_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.TentativeEndDatesVerify(), 60, 5);
	    	String ProjectMaster = Project.TentativeEndDatesVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Tentative End Dates"), true);
	        
	    }

	    @And("^User verify the Disbursment Amount in project master$")
	    public void user_verify_the_disbursment_amount_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.DisbursmentAmountVerify(), 60, 5);
	    	String ProjectMaster = Project.DisbursmentAmountVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Disbursment Amount"), true);
	        
	    }

	    @And("^User verify the Exposed No Of Flats in project master$")
	    public void user_verify_the_exposed_no_of_flats_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.ExposedNoOfFlatsVerify(), 60, 5);
	    	String ProjectMaster = Project.ExposedNoOfFlatsVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Exposed No of Flats"), false);
	        
	    }

	    @And("^User verify the Verified By in project master$")
	    public void user_verify_the_verified_by_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.VerifiedByVerify(), 60, 5);
	    	String ProjectMaster = Project.VerifiedByVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Verified By"), true);
	        
	    }

	    @And("^User verify the Stage Of Completion in project master$")
	    public void user_verify_the_stage_of_completion_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.StageOfCompletionVerify(), 60, 5);
	    	String ProjectMaster = Project.StageOfCompletionVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Stage of Completion"), true);
	        
	    }

	    @And("^User verify the Verified On in project master$")
	    public void user_verify_the_verified_on_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.VerifiedOnVerify(), 60, 5);
	    	String ProjectMaster = Project.VerifiedOnVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Verified On"), true);
	        
	    }

	    @And("^User verify the CLP in project master$")
	    public void user_verify_the_clp_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.CLPVerify(), 60, 5);
	    	String ProjectMaster = Project.CLPVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("CLP"), true);
	        
	    }

	    @And("^User verify the Flexi in project master$")
	    public void user_verify_the_flexi_in_project_master() throws Throwable {
	    	
	    	seleniumactions.getJavascriptHelper().scrollIntoView(Project.FlexiVerify());
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.FlexiVerify(), 60, 5);
	    	String ProjectMaster = Project.FlexiVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Flexi"), true);
	        
	    }

	    @And("^User verify the Installment Linked in project master$")
	    public void user_verify_the_installment_linked_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.InstallmentLinkedVerify(), 60, 5);
	    	String ProjectMaster = Project.InstallmentLinkedVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Installment Linked"), true);
	        
	    }

	    @And("^User verify the Down Payment Flag in project master$")
	    public void user_verify_the_down_payment_flag_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.DownPaymentFlagVerify(), 60, 5);
	    	String ProjectMaster = Project.DownPaymentFlagVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Down Payment Flag"), true);
	        
	    }

	    @And("^User verify the Subvention Flag in project master$")
	    public void user_verify_the_subvention_flag_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.SubventionFlagVerify(), 60, 5);
	    	String ProjectMaster = Project.SubventionFlagVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Subvention Flag"), true);
	        
	    }

	    @And("^User verify the CF Flag in project master$")
	    public void user_verify_the_cf_flag_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.CFFlagVerify(), 60, 5);
	    	String ProjectMaster = Project.CFFlagVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("CF Flag"), true);
	        
	    }

	    @And("^User verify the Negative Remarks in project master$")
	    public void user_verify_the_negative_remarks_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.NegativeRemarksVerify(), 60, 5);
	    	String ProjectMaster = Project.NegativeRemarksVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Negative Remarks"), true);
	        
	    }

	    @And("^User verify the Basic Sales Price/Sq Feet in project master$")
	    public void user_verify_the_basic_sales_pricesq_feet_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.BasicSalesPriceVerify(), 60, 5);
	    	String ProjectMaster = Project.BasicSalesPriceVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Basic Sales Price/Sq.Feet"), true);
	        
	    }

	    @And("^User verify the Exposure Unit in project master$")
	    public void user_verify_the_exposure_unit_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.ExposureUnitVerify(), 60, 5);
	    	String ProjectMaster = Project.ExposureUnitVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Exposure Unit"), true);
	        
	    }

	    @And("^User verify the Overall % Recommendations in project master$")
	    public void user_verify_the_overall_recommendations_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.OverallRecommendationsVerify(), 60, 5);
	    	String ProjectMaster = Project.OverallRecommendationsVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Overall % Recommendations"), true);
	        
	    }

	    @And("^User verify the Construction Status in project master$")
	    public void user_verify_the_construction_status_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.ConstructionStatusVerify(), 60, 5);
	    	String ProjectMaster = Project.ConstructionStatusVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Construction Status"), true);
	        
	    }

	    @And("^User verify the RERA Registration in project master$")
	    public void user_verify_the_rera_registration_in_project_master() throws Throwable {
	    	
	    	seleniumactions.getJavascriptHelper().scrollIntoView(Project.RERARegistrationVerify());
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.RERARegistrationVerify(), 60, 5);
	    	String ProjectMaster = Project.RERARegistrationVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("RERA Registration"), true);
	        
	    }

	    @And("^User verify the RERA Registration No in project master$")
	    public void user_verify_the_rera_registration_no_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.RERARegistrationNoVerify(), 60, 5);
	    	String ProjectMaster = Project.RERARegistrationNoVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("RERA Registration No"), true);
	        
	    }

	    @And("^User verify the Remarks in project master$")
	    public void user_verify_the_remarks_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.RemarksVerify(), 60, 5);
	    	String ProjectMaster = Project.RemarksVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Remarks"), true);
	        
	    }

	    @And("^User verify the Status in project master$")
	    public void user_verify_the_status_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.StatusVerify(), 60, 5);
	    	String ProjectMaster = Project.StatusVerify().getText();
	    	Assert.assertEquals(ProjectMaster.contains("Status"), true);
	        
	    }

	    @And("^User update the Building Name in project master$")
	    public void user_update_the_building_name_in_project_master() throws Throwable {
	    	
	    	testData = excelData.getTestdata("AT-PM-T020-D2");
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.BuildingName(), 60, 5);
	    	Project.BuildingName().click();
	    	Project.BuildingName().clear();
	    	Project.BuildingName().sendKeys(testData.get("BuildingName"));
	    	
	        
	    }

	    @And("^User update the Total Floors in project master$")
	    public void user_update_the_total_floors_in_project_master() throws Throwable {
	    	
	    	testData = excelData.getTestdata("AT-PM-T020-D2");
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.TotalFloors(), 60, 5);
	    	Project.TotalFloors().click();
	    	Project.TotalFloors().clear();
	    	Project.TotalFloors().sendKeys(testData.get("TotalFloors"));
	        
	    }

	    @And("^User update the Total Flats in project master$")
	    public void user_update_the_total_flats_in_project_master() throws Throwable {
	    	
	    	testData = excelData.getTestdata("AT-PM-T020-D2");
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.TotalFlats(), 60, 5);
	    	Project.TotalFlats().click();
	    	Project.TotalFlats().clear();
	    	Project.TotalFlats().sendKeys(testData.get("TotalFlats"));
	        
	    }

	    @And("^User save the record in project master$")
	    public void user_save_the_record_in_project_master() throws Throwable {
	    	
	    	help.waitForElementToVisibleWithFluentWait(driver, Project.UpdateSave(), 60, 5);
	    	Project.UpdateSave().click();
	        
	    }

	

}
