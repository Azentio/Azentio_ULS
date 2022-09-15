package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.CollateralObj;
import pageobjects.ProductMaster_RetailObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.CollateralTestDataType;


public class Collateral extends BaseClass {

	WebDriver driver = BaseClass.driver;
	JsonConfig jsonReader = new JsonConfig();
	WaitHelper waithelper = new WaitHelper(driver);
	CollateralObj collateralObj = new CollateralObj(driver);
	CollateralTestDataType collateralTestDataType = jsonReader.getCollateralByName("Maker");
	String referenceID;
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	JavascriptHelper javascripthelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionHelper = new ClicksAndActionsHelper(driver);
	BrowserHelper browserHelper = new BrowserHelper(driver);
	FindFieldisMandatoryorNot findFieldisMandatoryorNot = new FindFieldisMandatoryorNot(driver);
	ProductMaster_RetailObj productMaster_RetailObj = new ProductMaster_RetailObj(driver);

	@Then("^click on Asset collateral config$")
	public void click_on_asset_collateral_config() {
	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.AssetCollateral_Config() , 30, 1);
	collateralObj.AssetCollateral_Config().click();

	}

	@Then("^click on collateral eye icon$")
	public void click_on_collateral_eye_icon()  {
	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_EyeIcon() , 30, 1);
	collateralObj.collateral_EyeIcon().click();
	}

	@Then("^click on collateral add button$")
	public void click_on_collateral_add_button() throws InterruptedException  {
	Thread.sleep(1000);
	while(true)
	{
		try {
			waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_AddButton() , 60, 2);
			collateralObj.collateral_AddButton().click();
		    break;
			
		}
		catch(Exception e) {
			
		}
	}
	
	}

	@Then("^Enter collateral Description$")
	public void enter_collateral_description()  {
	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_Description() , 30, 1);
	collateralObj.collateral_Description().sendKeys(collateralTestDataType.Description);
	}

    @Then("^verify Description field is multi langual$")
    public void verify_description_field_is_multi_langual()  {
    //French	
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Language(), 30, 1);
    collateralObj.Language().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Language_French(), 30, 1);
    collateralObj.Language_French().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_add() , 30, 1);
    collateralObj.Description_add().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_Multilanguage() , 30, 1);
    collateralObj.Description_Multilanguage().sendKeys("French");
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_Close() , 30, 1);
    collateralObj.Description_Close().click();
    //German
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Language(), 30, 1);
    collateralObj.Language().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Language_German(), 30, 1);
    collateralObj.Language_German().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_add() , 30, 1);
    collateralObj.Description_add().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_Multilanguage() , 30, 1);
    collateralObj.Description_Multilanguage().sendKeys("German");
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_Close() , 30, 1);
    collateralObj.Description_Close().click();
    //Arabic
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Language(), 30, 1);
    collateralObj.Language().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Language_Arabic(), 30, 1);
    collateralObj.Language_Arabic().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_add() , 30, 1);
    collateralObj.Description_add().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_Multilanguage() , 30, 1);
    collateralObj.Description_Multilanguage().sendKeys("Arabic");
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_Close() , 30, 1);
    collateralObj.Description_Close().click();
    //English
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Language(), 30, 1);
    collateralObj.Language().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Language_English(), 30, 1);
    collateralObj.Language_English().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_add() , 30, 1);
    collateralObj.Description_add().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_Multilanguage() , 30, 1);
    collateralObj.Description_Multilanguage().sendKeys(collateralTestDataType.Description);
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.Description_Close() , 30, 1);
    collateralObj.Description_Close().click();
    
    
    }
	@Then("^Enter Asset collateral Category Code$")
	public void enter_asset_collateral_category_code()  {
	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_Assetcollateral_CategoryCode() , 30, 1);
	
	while(true){
	try{
		collateralObj.collateral_Assetcollateral_CategoryCode().click();
		collateralObj.collateral_Assetcollateral_CategoryCode().sendKeys(collateralTestDataType.AssetcollateralCategoryCode);
		  break;
		}
		catch(Exception e){}
	}
}

//	@Then("^Enter Asset collateral Category Code for reject$")
//	public void enter_asset_collateral_category_code_for_reject()   {
//	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_Assetcollateral_CategoryCode() , 30, 1);
//	collateralObj.collateral_Assetcollateral_CategoryCode().sendKeys(collateralTestDataType.collateralCategoryCodeReject);
//
//	}
	@Then("^Enter collateral Module$")
	public void enter_collateral_module()  {
	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_Module() , 30, 1);
	collateralObj.collateral_Module().click();
	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_ModuleDropdown() , 30, 1);
	collateralObj.collateral_ModuleDropdown().click();
	}

	@Then("^click on collateral Registration Required Toggle$")
	public void click_on_collateral_registration_required_toggle()  {
	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_RegistrationRequiredToggle() , 30, 1);
	collateralObj.collateral_RegistrationRequiredToggle().click();
	}

	@Then("^click on collateral Reposession Toggle$")
	public void click_on_collateral_reposession_toggle()  {
	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_ReposessionToggle() , 30, 1);
	collateralObj.collateral_ReposessionToggle().click();
	}

	@Then("^Enter collateral Remarks$")
	public void enter_collateral_remarks()  {
	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_Remarks() , 30, 1);
	collateralObj.collateral_Remarks().sendKeys(collateralTestDataType.Remarks);

	}
	@Then("^click on collateral save button$")
    public void click_on_collateral_save_button()  {
	
	
	while(true){
		try {
			waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_SaveButton() , 30, 1);
			collateralObj.collateral_SaveButton().click(); 
			break;
			}
	catch(Exception e){}
	}
    }
	@Then("^search and validate the approved record$")
    public void search_and_validate_the_approved_record() throws InterruptedException  {
		while (true) {
			try {
			  waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchIcon(), 30, 1);
			  collateralObj.collateral_SearchIcon().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchInputField(), 30, 1);
    collateralObj.collateral_SearchInputField().sendKeys(collateralTestDataType.AssetcollateralCategoryCode);
    collateralObj.collateral_SearchInputField().sendKeys(Keys.ENTER); 
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ActionEdit(), 30, 1);
    collateralObj.collateral_ActionEdit().isDisplayed();
    collateralObj.collateral_ActionEdit().click();
   
    }
	
	@Then("^open the already approved record$")
    public void open_the_already_approved_record() throws Throwable {
		
	    while (true) {
			try {
				waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ActionEdit(), 30, 1);
			    collateralObj.collateral_ActionEdit().isDisplayed();
			    collateralObj.collateral_ActionEdit().click();
				break;
			} 
			catch (StaleElementReferenceException se) {

			}
	    }
	    
    }
	@Then("^modify the record with any mandatory field blank$")
    public void modify_the_record_with_any_mandatory_field_blank() throws InterruptedException  {
		waithelper.waitForElementwithFluentwait(driver, productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton());
	    productMaster_RetailObj.productMaster_Product_ConfirmationMessageCloseButton().click();
		waithelper.waitForElementwithFluentwait(driver, collateralObj.collateral_Description());
		clicksAndActionHelper.doubleClick(collateralObj.collateral_Description());
    	collateralObj.collateral_Description().sendKeys(Keys.BACK_SPACE);
    }
	@Then("^validate the impact when user keep any mandatory field blank$")
    public void validate_the_impact_when_user_keep_any_mandatory_field_blank() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ValidationRequiredField(), 30, 1);
	    collateralObj.collateral_ValidationRequiredField().isDisplayed();
    }
	@Then("^modify the record with invalid data$")
    public void modify_the_record_with_invalid_data() throws Throwable {
		
		waithelper.waitForElementwithFluentwait(driver, collateralObj.collateral_Assetcollateral_CategoryCode());
    	clicksAndActionHelper.doubleClick(collateralObj.collateral_Assetcollateral_CategoryCode());
    	waithelper.waitForElementwithFluentwait(driver, collateralObj.collateral_Assetcollateral_CategoryCode());
    	collateralObj.collateral_Assetcollateral_CategoryCode().sendKeys("*");
    	
    	
    	  
    }

    @Then("^validate the impact of invalid data$")
    public void validate_the_impact_of_invalid_data() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, collateralObj.collateral_ValidationAlphanumeric());
    	String validationmsg = collateralObj.collateral_ValidationAlphanumeric().getText();
    	System.out.println("Invalid datatype validation message - "+validationmsg);
    	waithelper.waitForElementwithFluentwait(driver, collateralObj.collateral_ValidationAlphanumeric());
    	collateralObj.collateral_ValidationAlphanumeric().isDisplayed();
    }
	
	@Then("^Modify the approved record$")
    public void modify_the_approved_record() {
		waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_Remarks(), 60, 2);
	    clicksAndActionHelper.doubleClick(collateralObj.collateral_Remarks());
	    collateralObj.collateral_Remarks().sendKeys(Keys.BACK_SPACE);   
	    collateralObj.collateral_Remarks().sendKeys("Modify");   
    }
	

    @Then("^validate after rejection no changes should occur$")
    public void validate_after_rejection_no_changes_should_occur() {
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_Remarks(), 60, 2);
	clicksAndActionHelper.doubleClick(collateralObj.collateral_Remarks());
	String remark = collateralObj.collateral_Remarks().getText(); 
	System.out.println( "No changes occur after modfication rejected :" +remark);
	Assert.assertEquals(collateralTestDataType.Remarks, remark);
    }
    
    

    @Then("^Validate Old data get replaced with new one$")
    public void validate_old_data_get_replaced_with_new_one() throws Throwable {
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_Remarks(), 60, 2);
    clicksAndActionHelper.doubleClick(collateralObj.collateral_Remarks());
	String remark = collateralObj.collateral_Remarks().getText(); 
	System.out.println( "Old data get replaced with new one, remark :" +remark);
	Assert.assertNotEquals(collateralTestDataType.Remarks, remark);
	
    }
    
	//event code search//
    @Then("^search collateral record$")
    public void search_collateral_record() throws InterruptedException  {
    while(true)
    	{
    	try{
    		waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchInputField(), 60, 2);
        	collateralObj.collateral_SearchInputField().click();   
    	    collateralObj.collateral_SearchInputField().sendKeys(collateralTestDataType.EventCode);
    	    break;
    	}catch(Exception E){}
    	}
   Thread.sleep(1000);      
    }
    
    
    @Then("^Validate Txn status is in Pending state$")
    public void validate_txn_status_is_in_pending_state()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryStatus(), 60, 2);
    collateralObj.collateral_ViewSummaryStatus().isDisplayed();
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryStatus_Pending(), 60, 2);
    String status = collateralObj.collateral_ViewSummaryStatus_Pending().getText();
    System.out.println("status is "+status);
    
    }

    @Then("^edit the record with module field$")
    public void edit_the_record_with_module_field() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_ModuleDropdown_Reselect() , 30, 1);
    	collateralObj.collateral_ModuleDropdown_Reselect().click();
    	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_ModuleDropdown_LM() , 30, 1);
    	collateralObj.collateral_ModuleDropdown_LM().click();	
    }
    
    
    @Then("^validate the impact of any collateral mandatory field blank$")
    public void validate_the_impact_of_any_collateral_mandatory_field_blank()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_ValidationRequiredField() , 30, 1);
    collateralObj.collateral_ValidationRequiredField().isDisplayed();   
    }

	@Then("^click on collateral back button$")
	public void click_on_collateral_back_button() throws InterruptedException {
	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_BackButton(), 30, 1);

		while (true) {
			try {
				collateralObj.collateral_BackButton().click();
				break;
			} catch (Exception e) {

			}
		}

	}
    
    @Then("^Enter special char in Asset collateral Category Code$")
    public void enter_special_char_in_asset_collateral_category_code()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_Assetcollateral_CategoryCode() , 30, 1);
    collateralObj.collateral_Assetcollateral_CategoryCode().sendKeys(collateralTestDataType.SpecialChar);   
    }

    @Then("^validate the impact of any collateral field with special char$")
    public void validate_the_impact_of_any_collateral_field_with_special_char()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_ValidationAlphanumeric() , 30, 1);
    collateralObj.collateral_ValidationAlphanumeric().isDisplayed(); 
    }
    
    @Then("^verify collateral details list view fields should display all the fields$")
    public void verify_collateral_details_list_view_fields_should_display_all_the_fields() throws InterruptedException  {
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_AddButton() , 30, 1);
    collateralObj.collateral_AddButton().isDisplayed();
    collateralObj.collateral_SearchIcon().isDisplayed();
    collateralObj.collateral_Export().isDisplayed();
    collateralObj.collateral_Export().click();


    while (true) {
		try {
		
	    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_PdfFile(), 30, 1);
	    collateralObj.collateral_PdfFile().isDisplayed();
	    collateralObj.collateral_XlsFile().isDisplayed();
	    collateralObj.collateral_Export().click();
	    break;
		} catch (StaleElementReferenceException se) {
		}
		
    }
	
    collateralObj.collateral_ListView_AssetCollateralCategoryCode().isDisplayed();
    collateralObj.collateral_ListView_AssetCollateralCategoryDescription().isDisplayed();
    collateralObj.collateral_ListView_CreatedBy().isDisplayed();
    collateralObj.collateral_ListView_Status().isDisplayed();
    
    }

    @Then("^values in collateral list view should not be editable$")
    public void values_in_collateral_list_view_should_not_be_editable()  {
		try {
			collateralObj.collateral_ListViewFirstField_AssetCollateralCategoryCode().sendKeys("ok");
			collateralObj.collateral_ListViewFirstField_AssetCollateralCategoryDescription().sendKeys("ok");
			System.out.println("Values in list view is editable");

		} catch (Exception e) {
			System.out.println("Values in list view is not editable");
		}
    }

    @Then("^verify collateral add button should allow to create new record$")
    public void verify_collateral_add_button_should_allow_to_create_new_record()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_AddButton() , 30, 1);
    collateralObj.collateral_AddButton().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_SaveButton() , 30, 1);
    collateralObj.collateral_SaveButton().isDisplayed();
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_BackButton(), 30, 1);
    collateralObj.collateral_BackButton().click(); 
    }

    @Then("^verify collateral search box should display matching record with matched data$")
    public void verify_collateral_search_box_should_display_matching_record_with_matched_data() throws InterruptedException  {
    	while (true) {
			try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchIcon(), 30, 1);
		    	collateralObj.collateral_SearchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchInputField(), 30, 1);
    collateralObj.collateral_SearchInputField().sendKeys(collateralTestDataType.SearchValidCode);
    collateralObj.collateral_SearchInputField().sendKeys(Keys.ENTER);
  
    Thread.sleep(1000);
    while (true) {
		try {
		    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ListViewFirstField_AssetCollateralCategoryCode(), 30, 1);
		    String assetCollateralCategoryCode = collateralObj.collateral_ListViewFirstField_AssetCollateralCategoryCode().getText();
		    Assert.assertEquals(collateralTestDataType.SearchValidCode, assetCollateralCategoryCode);  
			break;
		} catch (Exception e) {

		}
	}
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchCloseButton(), 30, 1);
	collateralObj.collateral_SearchCloseButton().click();
    
    }

    @Then("^verify collateral search box should not display any record with mismatched data$")
    public void verify_collateral_search_box_should_not_display_any_record_with_mismatched_data()  {
    	//clicksAndActionsHelper.doubleClick(collateralObj.collateral_SearchInputField());
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchIcon(), 30, 1);
	collateralObj.collateral_SearchIcon().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchInputField(), 30, 1);
	collateralObj.collateral_SearchInputField().sendKeys(collateralTestDataType.SearchInvalidCode);
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_NoDataFoundInSearch(), 30, 1);
    collateralObj.collateral_NoDataFoundInSearch().isDisplayed();
    collateralObj.collateral_SearchCloseButton().click();  
    }

    @Then("^click on collateral export to pdf button system should download Pdf file$")
    public void click_on_collateral_export_to_pdf_button_system_should_download_pdf_file()  {
    collateralObj.collateral_Export().click();
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_PdfFile(), 30, 1);
    collateralObj.collateral_PdfFile().click();
    browserHelper.SwitchToWindow(1);
    browserHelper.switchToParentWithChildClose(); 
    }

    @Then("^click on collateral export to excel button system should download Excel file$")
    public void click_on_collateral_export_to_excel_button_system_should_download_excel_file()  {
    	while (true) {
			try {
			    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_Export(), 30, 1);
			    collateralObj.collateral_Export().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
	 waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_XlsFile(), 30, 1);
    collateralObj.collateral_XlsFile().click();
    } 
    //-----------------------wip--------------------------//
    @Then("^click on collateral Edit icon$")
    public void click_on_collateral_edit_icon()  {
    while(true){
    	try{
    	    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_EditIcon(), 30, 1);
    	    collateralObj.collateral_EditIcon().click();  
    		  break;
    		}
    		catch(Exception e){}
    	}
    }

    @Then("^verify collateral wip list view fields should display all the fields$")
    public void verify_collateral_wip_list_view_fields_should_display_all_the_fields() throws Throwable {
    	
        waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_AddButton() , 30, 1);
        collateralObj.collateral_AddButton().isDisplayed();
        collateralObj.collateral_SearchIcon().isDisplayed();
        collateralObj.collateral_Export().isDisplayed();
        collateralObj.collateral_Export().click();
        
        waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_PdfFile(), 30, 1);
        collateralObj.collateral_PdfFile().isDisplayed();
        collateralObj.collateral_XlsFile().isDisplayed();
        collateralObj.collateral_Export().click();
        	
        collateralObj.collateral_ListView_AssetCollateralCategoryCode().isDisplayed();
        collateralObj.collateral_ListView_AssetCollateralCategoryDescription().isDisplayed();
        collateralObj.collateral_ListView_CreatedBy().isDisplayed();
        collateralObj.collateral_ListView_Status().isDisplayed();   
    }

    @Then("^values in collateral wip list view should not be editable$")
    public void values_in_collateral_wip_list_view_should_not_be_editable() throws Throwable {
    	try {
			collateralObj.collateral_ListViewFirstField_AssetCollateralCategoryCode().sendKeys("ok");
			collateralObj.collateral_ListViewFirstField_AssetCollateralCategoryDescription().sendKeys("ok");
			System.out.println("Values in list view is editable");

		} catch (Exception e) {
			System.out.println("Values in list view is not editable");
		}    
    }

    @Then("^verify collateral wip add button should allow to create new record$")
    public void verify_collateral_wip_add_button_should_allow_to_create_new_record() throws Throwable {
    	waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_AddButton() , 30, 1);
        collateralObj.collateral_AddButton().click();
        waithelper.waitForElementToVisibleWithFluentWait(driver,collateralObj.collateral_SaveButton() , 30, 1);
        collateralObj.collateral_SaveButton().isDisplayed();
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_BackButton(), 30, 1);
        collateralObj.collateral_BackButton().click();  
    }

    @Then("^verify collateral wip search box should display matching record with matched data$")
    public void verify_collateral_wip_search_box_should_display_matching_record_with_matched_data() throws Throwable {
    	while (true) {
			try {
			  waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchIcon(), 30, 1);
			  collateralObj.collateral_SearchIcon().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchInputField(), 30, 1);
    collateralObj.collateral_SearchInputField().sendKeys(collateralTestDataType.SearchWIPValidPCode);
    collateralObj.collateral_SearchInputField().sendKeys(Keys.ENTER);
    Thread.sleep(2000);
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ListViewFirstField_AssetCollateralCategoryCode(), 30, 1);
    String assetCollateralCategoryCode = collateralObj.collateral_ListViewFirstField_AssetCollateralCategoryCode().getText();
    Assert.assertEquals(collateralTestDataType.SearchWIPValidPCode, assetCollateralCategoryCode);  
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchCloseButton(), 30, 1);
	collateralObj.collateral_SearchCloseButton().click();  
    }

    @Then("^verify collateral wip search box should not display any record with mismatched data$")
    public void verify_collateral_wip_search_box_should_not_display_any_record_with_mismatched_data() throws Throwable {
    	//clicksAndActionsHelper.doubleClick(collateralObj.collateral_SearchInputField());
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchIcon(), 30, 1);
    	collateralObj.collateral_SearchIcon().click();
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchInputField(), 30, 1);
    	collateralObj.collateral_SearchInputField().sendKeys(collateralTestDataType.SearchWIPInvalidPCode);
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_NoDataFoundInSearch(), 30, 1);
        collateralObj.collateral_NoDataFoundInSearch().isDisplayed();
        collateralObj.collateral_SearchCloseButton().click();    
    }

    @Then("^click on collateral wip export to pdf button system should download Pdf file$")
    public void click_on_collateral_wip_export_to_pdf_button_system_should_download_pdf_file() throws Throwable {
    	 collateralObj.collateral_Export().click();
    	    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_PdfFile(), 30, 1);
    	    collateralObj.collateral_PdfFile().click();
    	    browserHelper.SwitchToWindow(1);
    	    browserHelper.switchToParentWithChildClose();  
    }

    @Then("^click on collateral wip export to excel button system should download Excel file$")
    public void click_on_collateral_wip_export_to_excel_button_system_should_download_excel_file() throws Throwable {
    	while (true) {
			try {
			    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_Export(), 30, 1);
			    collateralObj.collateral_Export().click();
				break;
			} catch (StaleElementReferenceException se) {

			}
		}
	 waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_XlsFile(), 30, 1);
    collateralObj.collateral_XlsFile().click();   
    }
    
    //--------View Summary-------------//
    
    @Then("^open collateral wip record$")
    public void open_collateral_wip_record() {
        while(true){
        	try{
            	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ActionEdit(), 30, 1);
                collateralObj.collateral_ActionEdit().click();    
        		  break;
        		}
        		catch(Exception e){}
        	}
        
    }

    @Then("^click on collateral view summary$")
    public void click_on_collateral_view_summary()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummary(), 60, 2);
        WebElement viewsummary = collateralObj.collateral_ViewSummary(); 
        clicksAndActionHelper.JSEClick(viewsummary);   
    }

    @Then("^verify the fields of collateral view summary$")
    public void verify_the_fields_of_collateral_view_summary() {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryUser(), 60, 2);
        collateralObj.collateral_ViewSummaryUser().isDisplayed();  
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryStageCode(), 60, 2);
        collateralObj.collateral_ViewSummaryStageCode().isDisplayed();
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryStatus(), 60, 2);
        collateralObj.collateral_ViewSummaryStatus().isDisplayed();
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryStartTime(), 60, 2);
        collateralObj.collateral_ViewSummaryStartTime().isDisplayed(); 
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryEndTime(), 60, 2);
        collateralObj.collateral_ViewSummaryEndTime().isDisplayed();
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryRemarks(), 60, 2);
        collateralObj.collateral_ViewSummaryRemarks().isDisplayed();  
    }

    @Then("^close the collateral view summary$")
    public void close_the_collateral_view_summary()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryClose(), 60, 2);
        collateralObj.collateral_ViewSummaryClose().click();       
    }
    //---Invalid Modification---//
    
    @Then("^verify impact on modification with blank field$")
    public void verify_impact_on_modification_with_blank_field() throws InterruptedException  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_Description(), 60, 2);
    clicksAndActionHelper.doubleClick(collateralObj.collateral_Description());
    collateralObj.collateral_Description().sendKeys(Keys.BACK_SPACE);
    
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SaveButton(), 60, 2);
    collateralObj.collateral_SaveButton().click();
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ValidationRequiredField(), 60, 2);
    collateralObj.collateral_ValidationRequiredField().isDisplayed();
      
    }

    @Then("^verify impact on modification with invalid data$")
    public void verify_impact_on_modification_with_invalid_data()  {
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_Assetcollateral_CategoryCode(), 60, 2);
    clicksAndActionHelper.doubleClick(collateralObj.collateral_Assetcollateral_CategoryCode());
    collateralObj.collateral_Assetcollateral_CategoryCode().sendKeys("*");
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_CategoryCode_InvalidDataValidationMessage(), 60, 2);
    String validationmsg = collateralObj.collateral_CategoryCode_InvalidDataValidationMessage().getText();
    System.out.println("Invalid datatype validation message - "+validationmsg);
    	
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_CategoryCode_InvalidDataValidationMessage(), 60, 2);
    collateralObj.collateral_CategoryCode_InvalidDataValidationMessage().isDisplayed(); 
    }
    
    //----------------------------////
   

    @Then("^validate Txn status is completed$")
    public void validate_txn_status_is_completed()  {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummary(), 60, 2);
        WebElement viewsummary = collateralObj.collateral_ViewSummary(); 
        clicksAndActionHelper.JSEClick(viewsummary);  
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryStatus(), 60, 2);
        collateralObj.collateral_ViewSummaryStatus().isDisplayed();
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_ViewSummaryStatus_Completed(), 60, 2);
        String status = collateralObj.collateral_ViewSummaryStatus_Completed().getText();
        System.out.println("status is "+status);
        Assert.assertEquals(status,  "COMPLETED" );
        
    }
   
   //--------------------------//
    
    @Then("^validate status of the collateral record is active$")
    public void validate_status_of_the_collateral_record_is_active()  {
    	
    	while (true) {
			try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchIcon(), 30, 1);
		    	collateralObj.collateral_SearchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchInputField(), 30, 1);
    collateralObj.collateral_SearchInputField().sendKeys(collateralTestDataType.AssetcollateralCategoryCode);
    collateralObj.collateral_SearchInputField().sendKeys(Keys.ENTER);
    
    while (true) {
		try {
			String beforexpath = "//span[contains(text(),'";
			String afterxpath = "')]/../../../td[9]/p-celleditor/p-tag/span";
			String status = driver.findElement(By.xpath(beforexpath + collateralTestDataType.AssetcollateralCategoryCode + afterxpath)).getText();
			System.out.println("Status of the record " +collateralTestDataType.AssetcollateralCategoryCode+ " in list view : "+status);
			break;
		} catch (Exception e) {}
	}
    
    while (true) {
		try {
			//span[contains(text(),'FD31')]/../../../td[1]/span[1]/button[1]
			String beforexpath = "//span[contains(text(),'";
			String afterxpath = "')]/../../../td[1]/span[1]/button[1]";
			driver.findElement(By.xpath(beforexpath + collateralTestDataType.AssetcollateralCategoryCode + afterxpath)).click();
			break;
		}
		catch (Exception e) {}
	}
  }

    @Then("^verify able to change the collateral record status from active to deactive$")
    public void verify_able_to_change_the_collateral_record_status_from_active_to_deactive() {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_Status(), 30, 1);
        collateralObj.collateral_Status().click();
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SaveButton(), 30, 1);
        collateralObj.collateral_SaveButton().click();
        
    	
    }

    @Then("^validate status of the collateral record is Inactive$")
    public void validate_status_of_the_collateral_record_is_inactive() throws Throwable {
    	while (true) {
			try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchIcon(), 30, 1);
		    	collateralObj.collateral_SearchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchInputField(), 30, 1);
    collateralObj.collateral_SearchInputField().sendKeys(collateralTestDataType.AssetcollateralCategoryCode);
    collateralObj.collateral_SearchInputField().sendKeys(Keys.ENTER);
    
    while (true) {
		try {
			String beforexpath = "//span[contains(text(),'";
			String afterxpath = "')]/../../../td[9]/p-celleditor/p-tag/span";
			String status = driver.findElement(By.xpath(beforexpath + collateralTestDataType.AssetcollateralCategoryCode + afterxpath)).getText();
		
			System.out.println("Status of the record " +collateralTestDataType.AssetcollateralCategoryCode+ " in list view : "+status);

			
			break;
		} catch (Exception e) {}
		}
    
    while (true) {
		try {
			//span[contains(text(),'FD31')]/../../../td[1]/span[1]/button[1]
			
			String beforexpath = "//span[contains(text(),'";
			String afterxpath = "')]/../../../td[1]/span[1]/button[1]";
			driver.findElement(By.xpath(beforexpath + collateralTestDataType.AssetcollateralCategoryCode + afterxpath)).click();
    break;
		}
		catch (Exception e) {}
	}
    }

    @Then("^verify able to change the collateral record status from deactive to active$")
    public void verify_able_to_change_the_collateral_record_status_from_deactive_to_active()   {
    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_Status(), 30, 1);
        collateralObj.collateral_Status().click();
        waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SaveButton(), 30, 1);
        collateralObj.collateral_SaveButton().click();   
    }
    
    
    
    //------------------------------//
    @Then("^open collateral wip record for return$")
    public void open_collateral_wip_record_for_return() throws Throwable {
    	while (true) {
			try {
		    	waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchIcon(), 30, 1);
		    	collateralObj.collateral_SearchIcon().click();
				break;
			} catch (Exception e) {

			}
		}
    waithelper.waitForElementToVisibleWithFluentWait(driver, collateralObj.collateral_SearchInputField(), 30, 1);
    collateralObj.collateral_SearchInputField().sendKeys(collateralTestDataType.collateralCategoryCodeReturn);
    collateralObj.collateral_SearchInputField().sendKeys(Keys.ENTER);
    
    while (true) {
		try {
			String beforexpath = "//span[contains(text(),'";
			String afterxpath = "')]/../../../td[9]/p-celleditor/p-tag/span";
			String status = driver.findElement(By.xpath(beforexpath + collateralTestDataType.collateralCategoryCodeReturn + afterxpath)).getText();
		
			System.out.println("Status of the record " +collateralTestDataType.collateralCategoryCodeReturn+ " in list view : "+status);

			
			break;
		} catch (Exception e) {}
		}
    
    while (true) {
		try {
			//span[contains(text(),'FD31')]/../../../td[1]/span[1]/button[1]
			
			String beforexpath = "//span[contains(text(),'";
			String afterxpath = "')]/../../../td[1]/span[1]/button[1]";
			driver.findElement(By.xpath(beforexpath + collateralTestDataType.collateralCategoryCodeReturn + afterxpath)).click();
    break;
		}
		catch (Exception e) {}
	}
    
    }
    
}
