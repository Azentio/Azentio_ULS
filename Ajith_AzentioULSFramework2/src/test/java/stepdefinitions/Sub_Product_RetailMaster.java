package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SubProductMasterRetail_Obj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.SubProductMaster_RetailTestData;

public class Sub_Product_RetailMaster extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	SubProductMasterRetail_Obj subMasterRetailObj = new SubProductMasterRetail_Obj(driver);
	 KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	 JsonDataReaderWriter json = new JsonDataReaderWriter();
	 SubProductMaster_RetailTestData subProductMasterRetailData = jsonConfig.getSubProductMasterRetailByName("Maker");
	 
	@Given("^user log in as uls application maker$")
    public void user_log_in_as_uls_application_maker() throws Throwable {
        String kulsApplicationUrl = configFileReader.getLoanTransactionApplicationUrl();
        driver.get(kulsApplicationUrl);
        applicationLogin.loginUlsApplicationAsMaker(loginData.Username,loginData.Password);
        
    }

//    @When("^user click product set up menu$")
//    public void user_click_product_set_up_menu() throws Throwable {
//    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.productSetup(),60,2);
//        subMasterRetailObj.productSetup().click();
//    }
    @And("^user click edit icon of sub product retail$")
    public void user_click_edit_icon_of_sub_product_retail() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.subProductEditIcon(),60,2);
        subMasterRetailObj.subProductEditIcon().click();
    }
  
    @And("^user click the edit icon for the record which saved in maker$")
    public void user_click_the_edit_icon_for_the_record_which_saved_in_maker() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.firstEditIcon(),60,3);
        subMasterRetailObj.firstEditIcon().click();
    }
    @And("^user click parameter tab in sub product retail master$")
    public void user_click_parameter_tab_in_sub_product_retail_master() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.parameter(),30, 2);
        subMasterRetailObj.parameter().click();
    	
        
    }
    @Then("^user verify the functionality of back button for parameter tab Updation$")
    public void user_verify_the_functionality_of_back_button_for_parameter_tab_updation() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.backButtonInParameterTab(),30, 2);
        subMasterRetailObj.backButtonInParameterTab().click();
        
    }
    @And("^user Select and modify the project group$")
    public void user_select_and_modify_the_project_group() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.productGroup(),60,3);
        subMasterRetailObj.productGroup().click();
        String xpath="//ion-label[contains(text(),'"+subProductMasterRetailData.ProjecttGroup+"')]//following-sibling::ion-radio";
        for (int i =0; i <20; i++) {
        	try {
        		driver.findElement(By.xpath(xpath)).click();
        		break;
			} catch (Exception e) {
				
			}
			
		}
        
    }

    @And("^user Select and modify the Product code$")
    public void user_select_and_modify_the_product_code() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.productCode(),30,3);
        for (int i = 0; i < 20; i++) {
			try {
				 subMasterRetailObj.productCode().click();
				 break;
			} catch (Exception e) {
				
			}
		}
       
        String xpath="//ion-label[contains(text(),'"+subProductMasterRetailData.ProductCode+"')]//following-sibling::ion-radio";
       // seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60, 3);
        
        for (int i =0; i <50; i++) {
        	try {
        		seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
        		driver.findElement(By.xpath(xpath)).click();
        		break;
			} catch (Exception e) {
				
			}
        }
       
        
    }

    @And("^user enter and modify sub product code$")
    public void user_enter_and_modify_sub_product_code() throws Throwable {
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.subProductCode(),60, 2);
    	for (int i = 0; i <20; i++) {
			try {
				subMasterRetailObj.subProductCode().click();
		        subMasterRetailObj.subProductCode().clear();
		        subMasterRetailObj.subProductCode().sendKeys(subProductMasterRetailData.SubProductCode);
		        break;
			} catch (Exception e) {
				
			}
		}
        
    }

    @And("^user enter and modify sub product description$")
    public void user_enter_and_modify_sub_product_description() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.subProductDescription(),60, 2);
        subMasterRetailObj.subProductDescription().click();
        subMasterRetailObj.subProductDescription().clear();
        subMasterRetailObj.subProductDescription().sendKeys(subProductMasterRetailData.SubProductDescription);
    }


    @And("^user enter and modify allocation sequence number$")
    public void user_enter_and_modify_allocation_sequence_number() throws Throwable {
       seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.Sub_Product_Alloation_Sequence_Number());
       subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
       subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().clear();
       subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().sendKeys(subProductMasterRetailData.AllocationSequenceNumber);
       
    }
    @And("^user enter and modify allocation sequence number for reject$")
    public void user_enter_and_modify_allocation_sequence_number_for_reject() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.Sub_Product_Alloation_Sequence_Number());
        subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
        subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().clear();
        subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().sendKeys(subProductMasterRetailData.AllocationSequenceNumbeforReturn);
    }
    @And("^user enter and modify allocation sequence number for return$")
    public void user_enter_and_modify_allocation_sequence_number_for_return() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.Sub_Product_Alloation_Sequence_Number());
        subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
        subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().clear();
        subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().sendKeys(subProductMasterRetailData.AllocationSequenceNumberforReject);
    }
    @And("^user click the save button for updation$")
    public void user_click_the_save_button_for_updation() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.SubProductUpdate());
        subMasterRetailObj.SubProductUpdate().click();
    }
    @Then("^user verify the sucess message for updation$")
    public void user_verify_the_sucess_message_for_updation() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.successMgs(),60, 2);
        Assert.assertEquals(subMasterRetailObj.successMgs().isDisplayed(),true);
    }
    @And("^user click list view in sub product menu$")
    public void user_click_list_view_in_sub_product_menu() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.subProductViewIcon(),60, 3);
        subMasterRetailObj.subProductViewIcon().click();
    }
    
    @And("^user click the inbox icon$")
    public void user_click_the_inbox_icon() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Product_Inbox(),30,3);
        subMasterRetailObj.Sub_Product_Inbox().click();
    }

    @And("^user click the modified record in the list view and store the reference number$")
    public void user_click_the_modified_record_in_the_list_view_and_store_the_reference_number() throws Throwable {
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Subproduct_InboxView_Search(),30,2);
       for (int i = 0; i <20; i++) {
		try {
        //seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
			subMasterRetailObj.Subproduct_InboxView_Search().click();
			break;
		} catch (Exception e) {
			
		}
	}
    	
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Subproduct_InboxView_SearchText(),60,2);
        subMasterRetailObj.Subproduct_InboxView_SearchText().click();
        subMasterRetailObj.Subproduct_InboxView_SearchText().sendKeys(subProductMasterRetailData.SearchSubProductInbox);
        String reference = null;
        for (int i = 0; i < 200; i++) {
			try {
			 reference = subMasterRetailObj.Sub_Producr_Product_ReferanceId().getText();
			 break;
			} catch (Exception e) {
				
			}
		}
        
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.firstEditIconInListView(),40, 2);
        subMasterRetailObj.firstEditIconInListView().click();
        
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40, 2);
        
        json.addReferanceData(reference);
        System.out.println(reference);
        
        
        
    }

    @And("^user submit the modified record and verify the sucess message$")
    public void user_submit_the_modified_record_and_verify_the_sucess_message() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Subproduct_Submit(),30, 2);
        subMasterRetailObj.Subproduct_Submit().click();
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Subproduct_Maker_SubmitRemark(),30,2);
        subMasterRetailObj.Subproduct_Maker_SubmitRemark().click();
        subMasterRetailObj.Subproduct_Maker_SubmitRemark().sendKeys(subProductMasterRetailData.Remark);
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.makerFinalSubmit(),30, 2);
        subMasterRetailObj.makerFinalSubmit().click();
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Subproduct_Checker_Id(),60, 3);
        String sucessmgs = subMasterRetailObj.Subproduct_Checker_Id().getText();
        System.out.println(sucessmgs);
        String Space = " ";
        String split[] = sucessmgs.split(" ");
        Space=split[split.length-1];
        String popupID = Space.replaceAll("[/.]", "");
        json.addData(popupID);
        System.out.println(popupID);
        
    }
    @Then("^User validate the updated record in list view$")
    public void user_validate_the_updated_record_in_list_view() throws Throwable {
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'" + subProductMasterRetailData.ProductCode + "')]")), 60, 2);
		for (int i = 0; i <20; i++) {
			try {
				String validate = driver.findElement(By.xpath("//span[contains(text(),'"+subProductMasterRetailData.ProductCode+"')]"))
						.getText();
				System.out.println(validate);
				Assert.assertEquals(validate, subProductMasterRetailData.ProductCode);
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    	

		//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'" + subProductMasterRetailData.SubProductCode + "')]")), 60, 2);
		for (int i = 0; i <20; i++) {
			try {
				String validate1 = driver.findElement(By.xpath("//span[contains(text(),'" + subProductMasterRetailData.SubProductCode + "')]")).getText();
				System.out.println(validate1);
				Assert.assertEquals(validate1, subProductMasterRetailData.SubProductCode);
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
		
    }

    @And("^user verify all modified details are present on post save the record$")
    public void user_verify_all_modified_details_are_present_on_post_save_the_record() throws Throwable {
    	//product group
        String xpath ="//ion-select[@aria-label=' "+subProductMasterRetailData.ProjecttGroup+" ,  Product Group *']";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
        Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(),true);
        //product code
        for (int i = 0; i <50; i++) {
			try {
				String xpath1 ="//ion-select[@aria-label=' "+subProductMasterRetailData.ProductCode+" ,  Product Code *']";
		        Assert.assertEquals(driver.findElement(By.xpath(xpath1)).isDisplayed(),true);
		        break;
			} catch (NoSuchElementException e) {
				
			}
		}
        //sub poduct code
        String xpath2 ="//ion-label[contains(text(),'Subproduct Code')]//following-sibling::ion-input";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath2)),60, 2);
        String subProductCode = driver.findElement(By.xpath(xpath2)).getAttribute("ng-reflect-model");
        Assert.assertEquals(subProductCode, subProductMasterRetailData.SubProductCode);
        System.out.println(subProductCode);
        //sub product description
        String xpath3 ="//ion-label[contains(text(),'Subproduct Description')]//following-sibling::ion-input";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath3)),60, 2);
        String subProductDescription = driver.findElement(By.xpath(xpath3)).getAttribute("ng-reflect-model");
        Assert.assertEquals(subProductDescription, subProductMasterRetailData.SubProductDescription);
        System.out.println(subProductDescription);
        // allocation seq num
        String xpath4 ="//ion-col[33]/digital-text-box[1]/ion-item[1]/ion-input[1]";
        seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath4)));
        String allocationseq = driver.findElement(By.xpath(xpath4)).getAttribute("ng-reflect-model");
        Assert.assertEquals(allocationseq,subProductMasterRetailData.AllocationSequenceNumber);
        System.out.println(allocationseq);
        
    }

    @And("^user verify enter invalid data should not be allowed on save the record$")
    public void user_verify_enter_invalid_data_should_not_be_allowed_on_save_the_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.subProductCode(),60, 2);
        subMasterRetailObj.subProductCode().click();
        subMasterRetailObj.subProductCode().clear();
        subMasterRetailObj.subProductCode().sendKeys(subProductMasterRetailData.InvalidTestData);
        String xpath="//digital-form-error//ion-badge";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60, 2);
        String error = driver.findElement(By.xpath(xpath)).getText();
        System.out.println(error);
        seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.Sub_Product_Alloation_Sequence_Number());
        subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
        subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().clear();
        try {
        	subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().sendKeys(subProductMasterRetailData.InvalidTestData);
		} catch (Exception e) {
			System.out.println("unable to send character data to allocation sequence number");
		}
        
        	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.SubProductUpdate());
            subMasterRetailObj.SubProductUpdate().click();
            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.tagName("ion-toast")),60,2);
		    WebElement Root = driver.findElement(By.tagName("ion-toast"));
		    for (int i = 0; i < 50; i++) {
		    	 try {
			    	 WebElement ShadowDom = (WebElement) seleniumactions.getJavascriptHelper().executeScript("return arguments[0].shadowRoot", Root);
					    String error1 = ShadowDom.findElement(By.xpath("//ion-toast//div[@class='toast-message']")).getText();
					    System.out.println(error1);
					    break;
				} catch (Exception e) {
					
				}
			   
			}
		   
        
    }

    @And("^user verify while modification, when user keep any mandatory field blank and click on save button system should not allow to save the record$")
    public void user_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_save_button_system_should_not_allow_to_save_the_record() throws Throwable {
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.subProductCode(),60, 2);
        subMasterRetailObj.subProductCode().click();
        subMasterRetailObj.subProductCode().clear();
        String xpath ="//ion-label[contains(text(),' Subproduct Code ')]//ancestor::digital-text-box//following-sibling::div//child::ion-badge";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60, 2);
        System.out.println(driver.findElement(By.xpath(xpath)).getText());
        seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.Sub_Product_Alloation_Sequence_Number());
        subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().click();
        subMasterRetailObj.Sub_Product_Alloation_Sequence_Number().clear();
        
    }
    

    @And("^user verify status option is non mandatory then default is active  and should be editable$")
    public void user_verify_status_option_is_non_mandatory_then_default_is_active_and_should_be_editable() throws Throwable {
    	
    	String xpath ="//ion-toggle[@role='switch']//input";
    	seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
    	Assert.assertEquals(driver.findElement(By.xpath(xpath)).getAttribute("value"),subProductMasterRetailData.StatusSwitchToggle);
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.statusSwitchButton(),60,3);
        subMasterRetailObj.statusSwitchButton().click();
        seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.SubProductUpdate());
        subMasterRetailObj.SubProductUpdate().click();
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.tagName("ion-toast")),60,2);
	    WebElement Root = driver.findElement(By.tagName("ion-toast"));
	    for (int i = 0; i < 50; i++) {
	    	 try {
		    	 WebElement ShadowDom = (WebElement) seleniumactions.getJavascriptHelper().executeScript("return arguments[0].shadowRoot", Root);
				    String error1 = ShadowDom.findElement(By.xpath("//ion-toast//div[@class='toast-message']")).getText();
				    System.out.println(error1);
				    break;
			} catch (Exception e) {
				
			}
		   
		}
	   
        
    }
    

    @And("^user select and modify loan currency$")
    public void user_select_and_modify_loan_currency() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.loanCurrency(),30, 2);
    	subMasterRetailObj.loanCurrency().click();

		//String xpa = "//ion-label[contains(text(),'"+subProductMasterRetailData.LoanCurrency+"')]";
		
		//WebElement loan = driver.findElement(By.xpath(xpa));
		//loan.click();
	//	driver.findElement(By.xpath("//ion-label[contains(text(),'"+subProductMasterRetailData.LoanCurrency+"')]//following-sibling::ion-radio")).click();
	
      for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'"+subProductMasterRetailData.LoanCurrency+"')]//following-sibling::ion-radio")).click();
				
				break;

			} catch (Exception e) {

			}
       }
    }

    @And("^user select and modify the repayment type$")
    public void user_select_and_modify_the_repayment_type() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.repaymentType(),30, 2);
    	subMasterRetailObj.repaymentType().click();

		String xpath = "//ion-label[contains(text(),'" + subProductMasterRetailData.RepaymentType +"')]//following-sibling::ion-radio";

		for (int i = 1; i < 20; i++) {
			try {
				WebElement x = driver.findElement(By.xpath(xpath));
				x.click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^user select and modify Flat and Reducing data$")
    public void user_select_and_modify_flat_and_reducing_data() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.flatReducing(),30, 2);
    	subMasterRetailObj.flatReducing().click();

		String xpath1 = "//ion-label[contains(text(),'" + subProductMasterRetailData.FlatReducing +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath1)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^user select and modify interest Amortization Method$")
    public void user_select_and_modify_interest_amortization_method() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.intAmortizationMethod(),30, 2);
    	subMasterRetailObj.intAmortizationMethod().click();

		String xpath2 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IntAmortizationMethod +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}

    }
    @And("^user select and modify interest Amortization Method for reject$")
    public void user_select_and_modify_interest_amortization_method_for_reject() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.intAmortizationMethod(),30, 2);
    	subMasterRetailObj.intAmortizationMethod().click();

		String xpath2 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IntAmortizationMethodReject +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}
    }
    @And("^user select and modify interest Amortization Method for return$")
    public void user_select_and_modify_interest_amortization_method_for_return() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.intAmortizationMethod(),30, 2);
    	subMasterRetailObj.intAmortizationMethod().click();

		String xpath2 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IntAmortizationMethodReturn +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath2)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Compute Installment on$")
    public void user_select_and_modify_compute_installment_on() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.computeInstallmentOn(),30, 2);
    	for (int i = 1; i < 200; i++) {
			try {
				subMasterRetailObj.computeInstallmentOn().click();
				break;

			} catch (Exception e) {

			}
		}
    	

		String xpath3 = "//ion-label[contains(text(),'" + subProductMasterRetailData.ComputeInstallmentOn +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath3)).click();
				break;

			} catch (Exception e) {

			}
		}

    }
    @And("^User select and Modify Compute Installment on for approved$")
    public void user_select_and_modify_compute_installment_on_for_approved() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.computeInstallmentOn(),30, 2);
    	subMasterRetailObj.computeInstallmentOn().click();

		String xpath3 = "//ion-label[contains(text(),'" + subProductMasterRetailData.ComputeInstallmentOnApproved +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath3)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Interest Due date method$")
    public void user_select_and_modify_interest_due_date_method() throws Throwable {
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.instDueDateMethod(),30, 2);
    	for (int i = 1; i < 200; i++) {
			try {
				subMasterRetailObj.instDueDateMethod().click();
				break;

			} catch (Exception e) {

			}
		}
    	

		String xpath4 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InstDueDateMethod +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath4)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Principal repayment Frequency$")
    public void user_select_and_modify_principal_repayment_frequency() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.lpcGracePeriod());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.principalRepaymentFrequency(),30, 2);
    	subMasterRetailObj.principalRepaymentFrequency().click();

		String xpath5 = "//ion-label[contains(text(),'" +subProductMasterRetailData.PrincipalRepaymentFrequency+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath5)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Interest Repayment Frequency$")
    public void user_select_and_modify_interest_repayment_frequency() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.interestRepaymentFrequency(),30, 2);
    	subMasterRetailObj.interestRepaymentFrequency().click();

		String xpath6 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InterestRepaymentFrequency +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath6)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Loan Eligibility Calculation$")
    public void user_select_and_modify_loan_eligibility_calculation() throws Throwable {
    	for (int i = 0; i <20; i++) {
    		try {
        		subMasterRetailObj.loanElegibilityCalc().click();
        		break;
    		} catch (Exception e) {
    			
    		}
		}
    	
		String xpath7 = "//ion-label[contains(text(),'" + subProductMasterRetailData.LoanElegibilityCalc +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath7)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Include Guarantor inclusive$")
    public void user_select_and_modify_include_guarantor_inclusive() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.includeGuarantorInc(),30, 2);
    	subMasterRetailObj.includeGuarantorInc().click();

		String xpath8 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IncludeGuarantorInc +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath8)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Due Period Required$")
    public void user_select_and_modify_due_period_required() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.duePeriodRequired(),30, 2);
    	subMasterRetailObj.duePeriodRequired().click();

		String xpath9 = "//ion-label[contains(text(),'" + subProductMasterRetailData.DuePeriodRequired +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath9)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Installment commence from$")
    public void user_select_and_modify_installment_commence_from() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.instCommenceFrom(),30, 2);
    	subMasterRetailObj.instCommenceFrom().click();

		String xpath10 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InstCommenceFrom +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath10)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Days in Year$")
    public void user_select_and_modify_days_in_year() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.daysInYear());
    	  
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.daysInYear(),30, 2);
    	subMasterRetailObj.daysInYear().click();

		String xpath11 = "//ion-label[contains(text(),'" + subProductMasterRetailData.DaysInYear +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath11)).click();
				break;

			} catch (Exception e) {

			}
		}

    }

    @And("^User select and Modify Multiple Disbursement Tranch Allowed$")
    public void user_select_and_modify_multiple_disbursement_tranch_allowed() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.multipleDisbursTranchAllowed(),30, 2);
    	for (int i = 0; i <20; i++) {
			try {
				subMasterRetailObj.multipleDisbursTranchAllowed().click();
				break;
			} catch (Exception e) {
				
			}
		}
 
		String xpath12 = "//ion-label[contains(text(),'" +subProductMasterRetailData.MultipleDisbursTranchAllowed+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath12)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Include Income Deduction Debit$")
    public void user_select_and_modify_include_income_deduction_debit() throws Throwable {
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.includeIncomeDeduDebt(),30, 2);
    	for (int i = 1; i < 20; i++) {
			try {
				subMasterRetailObj.includeIncomeDeduDebt().click();
				break;

			} catch (Exception e) {

			}
		}

		String xpath13 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IncludeIncomeDeduDebt +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath13)).click();
				break;

			} catch (Exception e) {

			}
		}

    }

    @And("^User select and Modify Round off$")
    public void user_select_and_modify_round_off() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.roundOff(),30, 2);
    	for (int i = 1; i < 20; i++) {
			try {
				subMasterRetailObj.roundOff().click();
				break;
			} catch (Exception e) {

			}
		}
    	

		String xpath14 = "//ion-label[contains(text(),'" + subProductMasterRetailData.RoundOff +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath14)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Appropriation Code$")
    public void user_select_and_modify_appropriation_code() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.appropriationCode(),30, 2);
    	subMasterRetailObj.appropriationCode().click();

		String xpath15 = "//ion-label[contains(text(),'" + subProductMasterRetailData.AppropriationCode +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath15)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Ballon Allowed$")
    public void user_select_and_modify_ballon_allowed() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.balloonAllowed());

    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.balloonAllowed(),30, 2);
    	subMasterRetailObj.balloonAllowed().click();

		String xpath16 = "//ion-label[contains(text(),'" +subProductMasterRetailData.BalloonAllowed+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath16)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Pre owned Asset$")
    public void user_select_and_modify_pre_owned_asset() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.preOwnedAsset());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.preOwnedAsset(),30,2);
    	subMasterRetailObj.preOwnedAsset().click();
		String xpath17 = "//ion-label[contains(text(),'" + subProductMasterRetailData.PreOwnedAsset +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath17)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Day Count Convention for BPI$")
    public void user_select_and_modify_day_count_convention_for_bpi() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.dayCountConventionForBPI());
    	for (int i = 0; i <20; i++) {
    		try {
    			subMasterRetailObj.dayCountConventionForBPI().click();
				break;

			} catch (Exception e) {

			}
		}
		String xpath18 = "//ion-label[contains(text(),'" + subProductMasterRetailData.DayCountConventionForBPI +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath18)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Interest Charging Starts from$")
    public void user_select_and_modify_interest_charging_starts_from() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.interestChargingStartsFrom());
    	subMasterRetailObj.interestChargingStartsFrom().click();

		String xpath19 = "//ion-label[contains(text(),'" +subProductMasterRetailData.InterestChargingStartsFrom+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath19)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify BPI recovery$")
    public void user_select_and_modify_bpi_recovery() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.bpiRecovery());
    	
    	for (int i = 1; i < 20; i++) {
			try {
				subMasterRetailObj.bpiRecovery().click();
				break;

			} catch (Exception e) {

			}
		}
		String xpath20 = "//ion-label[contains(text(),'" + subProductMasterRetailData.BpiRecovery +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath20)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Installment Recovery Type$")
    public void user_select_and_modify_installment_recovery_type() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.installmentRecoveryType(),30, 2);
    	subMasterRetailObj.installmentRecoveryType().click();

		String xpath21 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InstallmentRecoveryType +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath21)).click();
				break;

			} catch (Exception e) {

			}
		}

    }

    @And("^User select and Modify iS Step up allowed$")
    public void user_select_and_modify_is_step_up_allowed() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.isStepupAllowed(),30, 2);
    	subMasterRetailObj.isStepupAllowed().click();

		String xpath22 = "//ion-label[contains(text(),'" + subProductMasterRetailData.IsStepupAllowed +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath22)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Rate Type$")
    public void user_select_and_modify_rate_type() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.rateType(),30, 2);
    	subMasterRetailObj.rateType().click();

		String xpath23 = "//ion-label[contains(text(),'" + subProductMasterRetailData.RateType +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath23)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Initiate Discount Factor$")
    public void user_select_and_modify_initiate_discount_factor() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.initiateDiscFactor());

    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.initiateDiscFactor(),30, 2);
    	subMasterRetailObj.initiateDiscFactor().click();

		String xpath24 = "//ion-label[contains(text(),'" + subProductMasterRetailData.InitiateDiscFactor +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath24)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Bulk Payment$")
    public void user_select_and_modify_bulk_payment() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.bulkPayment(),30, 2);
    	subMasterRetailObj.bulkPayment().click();
		
		Thread.sleep(1000);

		String xpath25 = "//ion-label[contains(text(),'"+subProductMasterRetailData.bulkPayment+"')]//following-sibling::ion-radio";
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath25)),30, 2);
		driver.findElement(By.xpath(xpath25)).click();
		
    }

    @And("^User select and Modify Immediate and due date$")
    public void user_select_and_modify_immediate_and_due_date() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.immediateDueDate(),30, 2);
    	subMasterRetailObj.immediateDueDate().click();

		String xpath26 = "//ion-label[contains(text(),'" + subProductMasterRetailData.immediateDueDate +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath26)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Bulk Payment Lock in Starts from$")
    public void user_select_and_modify_bulk_payment_lock_in_starts_from() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.bulkPaymentLockinStartsFrom(),30, 2);
    	subMasterRetailObj.bulkPaymentLockinStartsFrom().click();

		String xpath27 = "//ion-label[contains(text(),'" + subProductMasterRetailData.bulkPaymentLockinStartsFrom
				+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath27)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Bulk Payment min bulk payment Parameter$")
    public void user_select_and_modify_bulk_payment_min_bulk_payment_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.minBulkPaymentParameter(),30, 2);
    	subMasterRetailObj.minBulkPaymentParameter().click();

		String xpath28 = "//ion-label[contains(text(),'" + subProductMasterRetailData.minBulkPaymentParameter +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath28)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Bulk Payment max bulk payment parameter$")
    public void user_select_and_modify_bulk_payment_max_bulk_payment_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.maxBulkPaymentparameters(),30, 2);
    	subMasterRetailObj.maxBulkPaymentparameters().click();

		String xpath29 = "//ion-label[contains(text(),'" + subProductMasterRetailData.maxBulkPaymentparameters +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath29)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Bulk Payment Forclosure lock in Starts from$")
    public void user_select_and_modify_bulk_payment_forclosure_lock_in_starts_from() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.foreClosureLockInStartsFrom());
    	subMasterRetailObj.foreClosureLockInStartsFrom().click();
		String xpath30 = "//ion-label[contains(text(),'"+subProductMasterRetailData.foreClosureLockInStartsFrom+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath30)).click();
				break;

			} catch (Exception e) {

			}
		}

    }

    @And("^User select and Modify Bulk Payment min rebate parameter$")
    public void user_select_and_modify_bulk_payment_min_rebate_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.minRebateParameter(),30, 2);
    	subMasterRetailObj.minRebateParameter().click();

		String xpath31 = "//ion-label[contains(text(),'" + subProductMasterRetailData.minRebateParameter +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath31)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Bulk Payment max rebate parameter$")
    public void user_select_and_modify_bulk_payment_max_rebate_parameter() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.maxRebateParameter());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.maxRebateParameter(),30, 2);
    	subMasterRetailObj.maxRebateParameter().click();

		String xpath32 = "//ion-label[contains(text(),'" + subProductMasterRetailData.maxRebateParameter +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath32)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Bulk Payment Reschedulement Lock in starts from$")
    public void user_select_and_modify_bulk_payment_reschedulement_lock_in_starts_from() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.reschedulementLockInStartsFrom());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.reschedulementLockInStartsFrom(),30, 2);
		subMasterRetailObj.reschedulementLockInStartsFrom().click();

		String xpath33 = "//ion-label[contains(text(),'" +subProductMasterRetailData.reschedulementLockInStartsFrom+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath33)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Interest computed$")
    public void user_select_and_modify_interest_computed() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.interestComputed());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.interestComputed(),30, 2);
    	subMasterRetailObj.interestComputed().click();

		String xpath34 = "//ion-label[contains(text(),'" +subProductMasterRetailData.interestComputed+"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath34)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify recomputation of profit$")
    public void user_select_and_modify_recomputation_of_profit() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.recomputationofProfit());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.recomputationofProfit(),30, 2);
    	subMasterRetailObj.recomputationofProfit().click();

		String xpath35 = "//ion-label[contains(text(),'" + subProductMasterRetailData.recomputationofProfit +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath35)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify pre EMI$")
    public void user_select_and_modify_pre_emi() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.tdsApplicable());
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.preEMI(),30, 2);
    	subMasterRetailObj.preEMI().click();

		String xpath36 = "//ion-label[contains(text(),'" + subProductMasterRetailData.preEMI +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath36)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify mi recovery to be renamed as$")
    public void user_select_and_modify_mi_recovery_to_be_renamed_as() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.miRecoveryToBeRenamedAs(),30, 2);
    	subMasterRetailObj.miRecoveryToBeRenamedAs().click();

		String xpath37 = "//ion-label[contains(text(),'" + subProductMasterRetailData.miRecoveryToBeRenamedAs +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath37)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify bpi payment tenure method$")
    public void user_select_and_modify_bpi_payment_tenure_method() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.bpiRepaymentTenureMethod());
    	subMasterRetailObj.bpiRepaymentTenureMethod().click();

		String xpath38 = "//ion-label[contains(text(),'" + subProductMasterRetailData.bpiRepaymentTenureMethod +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath38)).click();
				break;

			} catch (Exception e) {

			}
		}

    }

    @And("^User select and Modify bpi rate method$")
    public void user_select_and_modify_bpi_rate_method() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.bpiRateMethod(),30, 2);
    	subMasterRetailObj.bpiRateMethod().click();

		String xpath39 = "//ion-label[contains(text(),'" + subProductMasterRetailData.bpiRateMethod +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath39)).click();
				break;

			} catch (Exception e) {

			}
		}

    }

    @And("^User select and Modify bpi repayment frequency$")
    public void user_select_and_modify_bpi_repayment_frequency() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.bpiRepaymentFrequency(),30, 2);
    	subMasterRetailObj.bpiRepaymentFrequency().click();

		String xpath40 = "//ion-label[contains(text(),'" + subProductMasterRetailData.bpiRepaymentFrequency +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath40)).click();
				break;

			} catch (Exception e) {

			}
		}
    }

    @And("^User select and Modify Tds applicable$")
    public void user_select_and_modify_tds_applicable() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.tdsApplicable(),30, 2);
    	subMasterRetailObj.tdsApplicable().click();

		String xpath41 = "//ion-label[contains(text(),'" +subProductMasterRetailData.tdsApplicable +"')]//following-sibling::ion-radio";
		for (int i = 1; i < 20; i++) {
			try {
				driver.findElement(By.xpath(xpath41)).click();
				break;

			} catch (Exception e) {

			}
		}
    }
    @And("^user verify the functionality of Activate and Deactivate button$")
    public void user_verify_the_functionality_of_activate_and_deactivate_button() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.statusSwitchButton(),60,3);
    	subMasterRetailObj.statusSwitchButton().click();
        subMasterRetailObj.statusSwitchButton().click();
        
    }
    @And("^user verify the functionality of View Workflow button$")
    public void user_verify_the_functionality_of_view_workflow_button() throws Throwable {
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.viewSummary(),30, 2);
    	for (int i = 0; i <20; i++) {
			try {
				subMasterRetailObj.viewSummary().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	for (int i = 0; i <20; i++) {
			try {
				subMasterRetailObj.closeButtonInSummary().click();
				break;
			} catch (Exception e) {
				
			}
		}
        
       // seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.closeButtonInSummary(),30, 2);
        
    }
    @And("^User save the record for parameter updation$")
    public void user_save_the_record_for_parameter_updation() throws Throwable {
        seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.Save());
        subMasterRetailObj.Save().click();
        
    }
    @Then("^verify success message in parameter tab$")
    public void verify_success_message_in_parameter_tab() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.successMgs(),60, 2);
        Assert.assertEquals(subMasterRetailObj.successMgs().isDisplayed(),true);
    }
    @And("^User Update the record for parameter$")
    public void user_update_the_record_for_parameter() throws Throwable {
       seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.SubProductUpdate());
    	for (int i = 0; i < 20; i++) {
    		try {
    			subMasterRetailObj.SubProductUpdate().click();
    			break;
			} catch (Exception e) {
				
			}
			
		}
        
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.successMgs(),60, 2);
        Assert.assertEquals(subMasterRetailObj.successMgs().isDisplayed(),true);
    }
    @And("^User verify while modification, when user keep any mandatory field blank and click on save button for parameter tabs$")
    public void user_verify_while_modification_when_user_keep_any_mandatory_field_blank_and_click_on_save_button_for_parameter_tabs() throws Throwable {
    	seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.Save());
        subMasterRetailObj.Save().click();
       
    	//Principal Repayment Frequency
        seleniumactions.getJavascriptHelper().scrollIntoView(subMasterRetailObj.principalRepaymentFrequency());
    	String xpath ="//ion-label[contains(text(),'Principal Repayment Frequency')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60, 2);
      //  System.out.println(driver.findElement(By.xpath(xpath)).getText());
        Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),"Required field");
        //Interest Repayment Frequency
        String xpath1 ="//ion-label[contains(text(),' Interest Repayment Frequency ')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath1)),60, 2);
       // System.out.println(driver.findElement(By.xpath(xpath1)).getText());
        Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(),"Required field");
        //Loan Eligibility Calc
        String xpath2 ="//ion-label[contains(text(),' Loan Eligibility Calc. ')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath2)),60, 2);
       // System.out.println(driver.findElement(By.xpath(xpath2)).getText());
        Assert.assertEquals(driver.findElement(By.xpath(xpath2)).getText(),"Required field");
        //Include Guarantor Inc.
        String xpath3 ="//ion-label[contains(text(),'Include Guarantor Inc.')]//ancestor::digital-select-layout//following-sibling::div//child::ion-badge";
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath3)),60, 2);
        //System.out.println(driver.findElement(By.xpath(xpath3)).getText());
        Assert.assertEquals(driver.findElement(By.xpath(xpath3)).getText(),"Required field");
        System.out.println("System does not allow to save the record with bank fields");
        
    }
    @And("^user verify the rejected record removed from the system$")
    public void user_verify_the_rejected_record_removed_from_the_system() throws Throwable {
    	for (int i = 0; i <20; i++) {
    		try {
    			subMasterRetailObj.Subproduct_InboxView_Search().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
        	
            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Subproduct_InboxView_SearchText(),60,2);
            subMasterRetailObj.Subproduct_InboxView_SearchText().click();
            subMasterRetailObj.Subproduct_InboxView_SearchText().sendKeys(json.readReferancedata());
            String xpath ="//span[contains(text(),'"+json.readReferancedata()+"')]";
            for (int i = 0; i < 200; i++) {
				try {
					Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
					break;
				} catch (NoSuchElementException e) {
					
				}
			}
            
    }
    @And("^user verify the returned record removed from the system$")
    public void user_verify_the_returned_record_removed_from_the_system() throws Throwable {
    	for (int i = 0; i <20; i++) {
    		try {
    			subMasterRetailObj.Subproduct_InboxView_Search().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
        	
            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Subproduct_InboxView_SearchText(),60,2);
            subMasterRetailObj.Subproduct_InboxView_SearchText().click();
            subMasterRetailObj.Subproduct_InboxView_SearchText().sendKeys(json.readReferancedata());
            String xpath ="//span[contains(text(),'"+json.readReferancedata()+"')]";
            for (int i = 0; i < 200; i++) {
				try {
					Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
					break;
				} catch (NoSuchElementException e) {
					
				}
			}
    }
    @And("^user select Product code under product details for parameter Updation$")
    public void user_select_product_code_under_product_details_for_parameter_updation() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productCode(), 60, 2);
    	subMasterRetailObj.productCode().click();
		System.out.println(subProductMasterRetailData.ProductCodecParameterUpdation);
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'"+subProductMasterRetailData.ProductCodecParameterUpdation+"')]/following-sibling::ion-radio")));
				driver.findElement(By.xpath("//ion-label[contains(text(),'"+subProductMasterRetailData.ProductCodecParameterUpdation+"')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
    }
    @And("^user select Product code under product details for parameter Validation$")
    public void user_select_product_code_under_product_details_for_parameter_validation() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.productCode(), 60, 2);
    	subMasterRetailObj.productCode().click();
		System.out.println(subProductMasterRetailData.ProductCodecParameterValidation);
		for (int i = 0; i < 200; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'"+subProductMasterRetailData.ProductCodecParameterValidation+"')]/following-sibling::ion-radio")));
				driver.findElement(By.xpath("//ion-label[contains(text(),'"+subProductMasterRetailData.ProductCodecParameterValidation+"')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
    }

    @And("^user enter sub product code under sub product for parameter Validation$")
    public void user_enter_sub_product_code_under_sub_product_for_parameter_validation() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.subProductCode(), 60, 2);
    	subMasterRetailObj.subProductCode().click();
    	subMasterRetailObj.subProductCode().sendKeys(subProductMasterRetailData.SubProductCodeParameterValidation);
    }

    @And("^user enter sub product code under sub product for parameter Updation$")
    public void user_enter_sub_product_code_under_sub_product_for_parameter_updation() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, subMasterRetailObj.subProductCode(), 60, 2);
    	subMasterRetailObj.subProductCode().click();
    	subMasterRetailObj.subProductCode().sendKeys(subProductMasterRetailData.SubProductCodeParameterUpdation);
    }





}
