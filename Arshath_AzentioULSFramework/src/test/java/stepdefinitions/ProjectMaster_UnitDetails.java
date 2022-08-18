package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageobjects.ProjectMaster_Obj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.ProjectMaster_UnitDetailsTestdata;

public class ProjectMaster_UnitDetails extends BaseClass{

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	ProjectMaster_UnitDetailsTestdata unitdata = jsonConfig.getunitdetailListByName("Maker");
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper click = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	ProjectMaster_Obj PrdMstObj = new ProjectMaster_Obj(driver);
	
	
    @When("^user click on Project set up menu$")
    public void user_click_on_project_set_up_menu() throws Throwable {
    	javaHelper.scrollIntoView(PrdMstObj.ProjectSetup());
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.ProjectSetup(), 60, 2);
    	PrdMstObj.ProjectSetup().click();
    }

    @And("^user click on project master List view icon$")
    public void user_click_on_project_master_list_view_icon() throws Throwable {
    	javaHelper.scrollIntoView(PrdMstObj.Prd_Mst_Eye());
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Eye(), 60, 2);
    	PrdMstObj.Prd_Mst_Eye().click();
    }

    @And("^user click on List view Edit Icon$")
    public void user_click_on_list_view_edit_icon() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Tempview_Edit(), 60, 2);
    	PrdMstObj.Prd_Mst_Tempview_Edit().click();
    }

    @And("^user click on unit details Add icon and verify the functionality$")
    public void user_click_on_unit_details_add_icon_and_verify_the_functionality() throws Throwable {
    	javaHelper.scrollIntoView(PrdMstObj.Prd_Mst_Unitdetail_Add());
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_Add(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_Add().isDisplayed();
    	PrdMstObj.Prd_Mst_Unitdetail_Add().click();
    }

    @And("^user Enter the value in Building Name and verify it$")
    public void user_enter_the_value_in_building_name_and_verify_it() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_BuildingName(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_BuildingName().isDisplayed();
    }

    @And("^user Enter the value in Unit No and verify it$")
    public void user_enter_the_value_in_unit_no_and_verify_it() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_UnitNo(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_UnitNo().isDisplayed();
    }

    @And("^user Enter the value in Floor and verify it$")
    public void user_enter_the_value_in_floor_and_verify_it() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_Floor(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_Floor().isDisplayed(); 
    }

    @And("^user Enter the value in Saleable Area sq ft and verify it$")
    public void user_enter_the_value_in_saleable_area_sq_ft_and_verify_it() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_Saleablearea(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_Saleablearea().isDisplayed(); 
    }

    @And("^user Enter the value in Exposed No and verify it$")
    public void user_enter_the_value_in_exposed_no_and_verify_it() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_ExposedApplNo(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_ExposedApplNo().isDisplayed();  
    }

    @And("^user verify the Active De-Active status and verify it$")
    public void user_verify_the_active_deactive_status_and_verify_it() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_Active_Deactive(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_Active_Deactive().isDisplayed();  
    }

    @And("^user save the Record in unit Details and verify the Message$")
    public void user_save_the_record_in_unit_details_and_verify_the_message() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_Save(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_Save().click(); 
		waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.SaveSuccess_alert(), 60, 2);
		String Toast = PrdMstObj.SaveSuccess_alert().getText();
		Assert.assertEquals(Toast, "success");
    }

    @And("^User verify the list view Record is Non-Editable$")
    public void user_verify_the_list_view_record_is_noneditable() throws Throwable {
        
    }
    
    //******************@AT-PM-T023*******************//
    @And("^Enter the value in Building Name and verify it$")
    public void enter_the_value_in_building_name_and_verify_it() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_BuildingName(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_BuildingName().isDisplayed();
    	PrdMstObj.Prd_Mst_Unitdetail_BuildingName().click();
    	PrdMstObj.Prd_Mst_Unitdetail_BuildingName().sendKeys(unitdata.BuildingName);
    }

    @And("^Enter the value in Unit No and verify it$")
    public void enter_the_value_in_unit_no_and_verify_it() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_UnitNo(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_UnitNo().isDisplayed();
    	PrdMstObj.Prd_Mst_Unitdetail_UnitNo().click();
    	PrdMstObj.Prd_Mst_Unitdetail_UnitNo().sendKeys(unitdata.UnitNo);
    }

    @And("^Enter the value in Floor and verify it$")
    public void enter_the_value_in_floor_and_verify_it() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_Floor(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_Floor().isDisplayed();
    	PrdMstObj.Prd_Mst_Unitdetail_Floor().click();
    	PrdMstObj.Prd_Mst_Unitdetail_Floor().sendKeys();
    }

    @And("^Enter the value in Saleable Area sq ft and verify it$")
    public void enter_the_value_in_saleable_area_sq_ft_and_verify_it() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_Saleablearea(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_Saleablearea().isDisplayed();
    	PrdMstObj.Prd_Mst_Unitdetail_Saleablearea().click();
    	PrdMstObj.Prd_Mst_Unitdetail_Saleablearea().sendKeys(unitdata.SaleableArea);
    }

    @And("^Enter the value in Exposed No and verify it$")
    public void enter_the_value_in_exposed_no_and_verify_it() throws Throwable {
       	waitHelper.waitForElementToVisibleWithFluentWait(driver, PrdMstObj.Prd_Mst_Unitdetail_ExposedApplNo(), 60, 2);
    	PrdMstObj.Prd_Mst_Unitdetail_ExposedApplNo().isDisplayed();
    	PrdMstObj.Prd_Mst_Unitdetail_ExposedApplNo().click();
    	PrdMstObj.Prd_Mst_Unitdetail_ExposedApplNo().sendKeys(unitdata.Exposed);
    }
}
