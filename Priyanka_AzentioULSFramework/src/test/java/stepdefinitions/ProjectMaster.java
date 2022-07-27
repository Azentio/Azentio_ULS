package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.JsonConfig;
import helper.AlertHelper;
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
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);


	@Then("^click on Project Setup$")
    public void click_on_project_setup()  {
	waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.project_Setup(), 60, 1);
	projectMasterObj.project_Setup().click();     
    }

    @Then("^click on Project Master eye icon$")
    public void click_on_project_master_eye_icon()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_EyeIcon(), 60, 1);
    projectMasterObj.projectMaster_EyeIcon().click();    
    }

    @Then("^click on Project Master add button$")
    public void click_on_project_master_add_button()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_AddButton(), 60, 1);
    projectMasterObj.projectMaster_AddButton().click();     
    }	
	
    @Then("^click on Project Master Building add button$")
    public void click_on_project_master_building_add_button() throws Throwable {
    
    javascripthelper.scrollIntoView(projectMasterObj.projectMaster_BuildingAddButton());
    waithelper.waitForElementToVisibleWithFluentWait(driver,projectMasterObj.projectMaster_BuildingAddButton(), 60, 1);
    projectMasterObj.projectMaster_BuildingAddButton().click();
      Thread.sleep(10000);  
    }
	
	
	
	
}
