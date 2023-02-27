package stepdefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.AssetCollateralTypeObject;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class AssetCollateralType extends BaseClass{
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	AssetCollateralTypeObject collateralTypeObj = new AssetCollateralTypeObject(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	//DepositAccountTestData depositMasterData = jconfig.getDepositAccountMasterByName("Maker");
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);
	FindFieldisMandatoryorNot mandateOrNot= new FindFieldisMandatoryorNot(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	
	
	 @And("^Click the configuration in collateral type$")
	    public void click_the_configuration_in_collateral_type() throws Throwable {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_Configurations(), 60, 2);
			collateralTypeObj.AssetCollateralType_Configurations().click();
	 }

	    @Then("^click the Asset colllaral config$")
	    public void click_the_asset_colllaral_config() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_AssetCollateralConfig(), 60, 2);
			collateralTypeObj.AssetCollateralType_AssetCollateralConfig().click();
	    }
	    @And("^Click the temp view button in collateral type$")
	    public void click_the_temp_view_button_in_collateral_type() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_TempView(), 60, 2);
			collateralTypeObj.AssetCollateralType_TempView().click();
	    }   

	    @Then("^To verify the Asset Collateral Type List view in collateral type$")
	    public void to_verify_the_asset_collateral_type_list_view_in_collateral_type() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_AddButton(), 60, 2);
	    	collateralTypeObj.AssetCollateralType_AddButton().isDisplayed();
	    	collateralTypeObj.AssetCollateralType_ListView_Search().isDisplayed();
	    	collateralTypeObj.AssetCollateralType_ListView_Export().isDisplayed();
	    	collateralTypeObj.AssetCollateralType_ListView_Status().isDisplayed();
	    	collateralTypeObj.AssetCollateralType_ListView_Action().isDisplayed();
	    	collateralTypeObj.AssetCollateralType_ListView_Asset_CollateraltypeCode().isDisplayed();
	    	collateralTypeObj.AssetCollateralType_ListView_Description().isDisplayed();
	    	collateralTypeObj.AssetCollateralType_ListView_AssetCollateralCategoryDescription().isDisplayed();
	    	collateralTypeObj.AssetCollateralType_ListView_AuthorizationStatus().isDisplayed();
	    }
	    @And("^To verify the values in List view should be non editable in collateral type$")
	    public void to_verify_the_values_in_list_view_should_be_non_editable_in_collateral_type() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_AddButton(), 60, 2);
	    	String xpath ="//tbody/tr[1]/td[3]";
	    	try {
	    		driver.findElement(By.xpath(xpath)).click();
			} catch (NoSuchElementException e) {
				System.out.println("Verified status field is not editable only displayable");
			}
	    }
	    @Then("^To verify the functionality of Search box with matching data in collateraltype master$")
	    public void to_verify_the_functionality_of_search_box_with_matching_data_in_collateraltype_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_ListViewSearch(), 60, 2);
	    	for (int i = 0; i < 20; i++) {
				try {
					collateralTypeObj.AssetCollateralType_ListViewSearch().click();
	    	break;
				} catch (Exception e) {

				}
	    	}

	    	collateralTypeObj.AssetCollateralType_ListViewSearchText().click();
	    	collateralTypeObj.AssetCollateralType_ListViewSearchText().sendKeys("test8");
	Assert.assertEquals(collateralTypeObj.AssetCollateralType_ListViewMachedData().isDisplayed(), true);
}
	    @Then("^To verify the functionality of Search box with unmatching data in collateraltype master$")
	    public void to_verify_the_functionality_of_search_box_with_unmatching_data_in_collateraltype_master() throws Throwable {
	    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
	    	
	    	for (int i = 0; i <20; i++) {
				try {
					collateralTypeObj.AssetCollateralType_ListViewSearch().click();
					break;
				} catch (Exception e) {
					
				}
			}
	    	collateralTypeObj.AssetCollateralType_ListViewSearchText().click();
	    	collateralTypeObj.AssetCollateralType_ListViewSearchText().sendKeys("bb");
	    	Thread.sleep(1000);
	    	String xpath ="(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
	    	for (int i = 0; i < 200; i++) {
	    		try {
	    		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
	    	       Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
	    	        //"Showing 0 to 0 of 0 entries"
	    	        break;
	    		} catch (Exception e) {
	    			
	    		}
			}
	        
	        driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
	    	

			}
	    @And("^To verify the functionality of Export to PDF button in collateraltype master$")
	    public void to_verify_the_functionality_of_export_to_pdf_button_in_collateraltype_master() throws Throwable {
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			collateralTypeObj.exportIcon().click();
	    			break;
	    		} catch (Exception e) {
	    			
	    		}
	    	}
	    	
	        action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,collateralTypeObj.exportToPDF(),60,3);
	        collateralTypeObj.exportToPDF().click();
	        //seleniumactions.getBrowserHelper().SwitchToWindow(1);
	        String UserDirectory = System.getProperty("user.dir");
	        System.out.println(UserDirectory);
	        String substring = UserDirectory.substring(0, 21)+"Downloads";
	        substring.replaceAll("/", "//");
	        System.out.println(substring);
	        File file = new File(substring);
	        	        File[] totalfiles = file.listFiles();
	        	        int length = totalfiles.length;
	        	        int i=0;
	        for (File fileName : totalfiles) {
	        	i++;
	        	if (fileName.getName().equalsIgnoreCase("CollateralTypeDataFile.pdf")) {
	    			System.out.println("Downloaded file present in system");
	    			break;
	    		}
	    		else if(i==length-1) {
	    			System.out.println("Downloaded file present does not exist in system");
	    		}
	    		
	    	}
	        action.getBrowserHelper().switchToParentWithChildClose();
	        

	    }


	    @Then("^To verify the functionality of Export to Excel button in collateraltype master$")
	    public void to_verify_the_functionality_of_export_to_excel_button_in_collateraltype_master() throws Throwable {
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			collateralTypeObj.exportIcon().click();
	    			break;
	    		} catch (Exception e) {
	    			
	    		}
	    	}
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			collateralTypeObj.exportToExcel().click();
	    			break;
	    		} catch (Exception e) {
	    			
	    		}
	    	}
	    	String UserDirectory = System.getProperty("user.dir");
	        System.out.println(UserDirectory);
	        String substring = UserDirectory.substring(0, 21)+"Downloads";
	        substring.replaceAll("/", "//");
	        System.out.println(substring);
	        File file = new File(substring);
	        	        File[] totalfiles = file.listFiles();
	        	        int length = totalfiles.length;
	        	        int i=0;
	        for (File fileName : totalfiles) {
	        	i++;
	        	if (fileName.getName().contains("CollateralTypeDataFile_export")) {
	    			System.out.println("Downloaded file present in system");
	    			break;
	    		}
	    		else if(i==length-1) {
	    			System.out.println("Downloaded file present does not exist in system");
	    		}
	    		
	    	}
	       action.getBrowserHelper().switchToParentWithChildClose();
	        System.out.println("Downloaded XLS file present in system");	        
	        
	    }
	    @And("^To verify the field asset collateral category description$")
	    public void to_verify_the_field_asset_collateral_category_description() throws Throwable {
	    String Description = collateralTypeObj.AssetCollateralType_Description_WIP().getText();
	    	System.out.println("Description");
	    	collateralTypeObj.AssetCollateralType_Description_WIP().isDisplayed();
	    }
	    @Then("^Click the inbox in collateral type master$")
	    public void click_the_inbox_in_collateral_type_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_Inbox(), 60, 2);
	    	collateralTypeObj.AssetCollateralType_Inbox().click();
	    }

	    @Then("^Search the record in collateral type master$")
	    public void search_the_record_in_collateral_type_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_SeachButton(), 60, 2);
	   					    	collateralTypeObj.AssetCollateralType_SeachButton().click();
	    	   	    
	    		    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_Inbox(), 60, 2);
	    			 	   action.getClickAndActionsHelper().moveToElement(collateralTypeObj.AssetCollateralType_SearchText());
		//collateralTypeObj.AssetCollateralType_SearchText().click();
	    	collateralTypeObj.AssetCollateralType_SearchText().sendKeys("COLL_TYPE");
	    	
	    }

	    @And("^Click the action icon in the collateral type master$")
	    public void click_the_action_icon_in_the_collateral_type_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_ActionIcon(), 60, 2);
	    	collateralTypeObj.AssetCollateralType_ActionIcon().click();
	    }
	    @Then("^Click the view summary button in collateral type master$")
	    public void click_the_view_summary_button_in_collateral_type_master() throws Throwable {
	    	//waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_ActionIcon(), 60, 2);
for (int i = 0; i < 20; i++) {
	try
	{
	    	action.getClickAndActionsHelper().JSEClick(collateralTypeObj.AssetCollateralType_ViewSummaryButton());
	    }
	catch(Exception e) {
	}
	}
	    }

	    @Then("^To verify the view workflow in the collateral type master$")
	    public void to_verify_the_view_workflow_in_the_collateral_type_master() throws Throwable {
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_UserID(), 60, 2);
	    	String UserID = collateralTypeObj.AssetCollateralType_UserID().getText();
	    	System.out.println("UserID:"+UserID);
	    	collateralTypeObj.AssetCollateralType_UserID().isDisplayed();
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_StageCode(), 60, 2);
	    	String UserStage = collateralTypeObj.AssetCollateralType_StageCode().getText();
	    	System.out.println("UserStage:"+UserStage);
	    	collateralTypeObj.AssetCollateralType_StageCode().isDisplayed();
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_Status(), 60, 2);
	    	String Status = collateralTypeObj.AssetCollateralType_Status().getText();
	    	System.out.println("Status:"+Status);
	    	collateralTypeObj.AssetCollateralType_Status().isDisplayed();
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_StartTime(), 60, 2);
	    	String StartTime= collateralTypeObj.AssetCollateralType_StartTime().getText();
	    	System.out.println("StartTime:"+StartTime);
	    	collateralTypeObj.AssetCollateralType_StartTime().isDisplayed();
	    	waitHelper.waitForElementToVisibleWithFluentWait(driver, collateralTypeObj.AssetCollateralType_EndTime(), 60, 2);
	    	String EndTime= collateralTypeObj.AssetCollateralType_EndTime().getText();
	    	System.out.println("EndTime:"+EndTime);
	    }
}

	       

	    
