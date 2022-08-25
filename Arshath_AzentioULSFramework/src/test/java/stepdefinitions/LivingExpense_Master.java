package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.Living_Expenses_Obj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.LivExp_Testdata;

public class LivingExpense_Master extends BaseClass {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Living_Expenses_Obj LivexpObj = new Living_Expenses_Obj(driver);
	LivExp_Testdata LivExpdata = jsonConfig.getLivExpListByName("Maker");

	@And("^user click on Other Masters Tab$")
	public void user_click_on_other_masters_tab() throws Throwable {
		javaHelper.scrollIntoView(LivexpObj.Living_Exp_OtherMaster());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Living_Exp_OtherMaster(), 60, 2);
		LivexpObj.Living_Exp_OtherMaster().click();
	}

	@And("^user click on List view Icon of  Living Expenses$")
	public void user_click_on_list_view_icon_of_living_expenses() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Living_Exp_Listview(), 60, 2);
		LivexpObj.Living_Exp_Listview().click();
	}

	@And("^user click on Add Icon for Living Expenses$")
	public void user_click_on_add_icon_for_living_expenses() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Add_Icon(), 60, 2);
		LivexpObj.Liv_Exp_Add_Icon().click();
	}

	@And("^user Enter value in Description and verify it$")
	public void user_enter_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().sendKeys(LivExpdata.Description);
	}

	@And("^user Enter value in Description2 and verify it$")
	public void user_enter_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description2");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().sendKeys(LivExpdata.Description2);
	}

	@And("^user Enter value in Description3 and verify it$")
	public void user_enter_value_in_description3_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description3");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description3(), 60, 2);
		LivexpObj.Liv_Exp_Description3().click();
		LivexpObj.Liv_Exp_Description3().sendKeys(LivExpdata.Description3);
	}

	@And("^user select Rule value and verify it$")
	public void user_select_rule_value_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Rule");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Rule(), 60, 2);
		LivexpObj.Liv_Exp_Rule().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'Rule1')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user choose Calender Effective Date and verify it$")
	public void user_choose_calender_effective_date_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Effective Date");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_EffectiveDate(), 60, 2);
		LivexpObj.Liv_Exp_EffectiveDate().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Year(), 60, 2);
		LivexpObj.Liv_Exp_Year().click();
		for (int i = 0; i < 50; i++) {
			try {
				// waitHelper.waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath("//span[text()='
				// 2023 ']")), 60, 2);
				driver.findElement(By.xpath("//span[text()=' 2023 ']")).click();
				// waitHelper.waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath("//span[contains(text(),'Aug')]")),
				// 60, 2);
				driver.findElement(By.xpath("//span[contains(text(),'Aug')]")).click();
				// waitHelper.waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath("(//span[text()='3'])[1]")),
				// 60, 2);
				driver.findElement(By.xpath("(//span[text()='3'])[1]")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user save the Record in Living Expenses$")
	public void user_save_the_record_in_living_expenses() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Save(), 60, 2);
		LivexpObj.Liv_Exp_Save().click();
	}
	
	//******************AT_LE_002_Approve_ListView************************//
    @Then("^User validate the Living Expense approved record in list view$")
    public void user_validate_the_living_expense_approved_record_in_list_view() throws Throwable {

	for (int i = 0; i < 50; i++) {
		try {
			String validate = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.Description + "')]")).getText();
			System.out.println(validate);
			Assert.assertEquals(validate, LivExpdata.Description);

			break;
		} catch (Exception e) {

		}
	}
    }

	//******************AT_LE_003_Reject************************//
  
    @And("^user Enter value in Reject Description and verify it$")
    public void user_enter_value_in_reject_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().sendKeys(LivExpdata.DescriptionReject);
    }

    @And("^user Enter value in Reject Description2 and verify it$")
    public void user_enter_value_in_reject_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description2");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().sendKeys(LivExpdata.DescriptionReject2);
    }
    
	//******************AT_LE_003_Reject_ListView************************//
    
    @Then("^User validate the Living Expense Rejected record in list view$")
    public void user_validate_the_living_expense_rejected_record_in_list_view() throws Throwable {
    	for (int i = 0; i < 50; i++) {
    		try {
    			String validate = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.DescriptionReject + "')]")).getText();
    			System.out.println(validate);
    			Assert.assertEquals(validate, LivExpdata.DescriptionReject);

    			break;
    		} catch (Exception e) {

    		}
    	}
    }
    
	//******************AT_LE_004_Return************************//
    
    @And("^user Enter value in Return Description and verify it$")
    public void user_enter_value_in_return_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().sendKeys(LivExpdata.DescriptionReturn);
    }

    @And("^user Enter value in Return Description2 and verify it$")
    public void user_enter_value_in_return_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description2");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().sendKeys(LivExpdata.DescriptionReturn2);
    }
    
    
  //******************AT_LE_004_Return_Listview************************//
    
    @Then("^User validate the Living Expense Returned record in list view$")
    public void user_validate_the_living_expense_returned_record_in_list_view() throws Throwable {
    	for (int i = 0; i < 50; i++) {
    		try {
    			String validate = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.DescriptionReturn + "')]")).getText();
    			System.out.println(validate);
    			Assert.assertEquals(validate, LivExpdata.DescriptionReturn);

    			break;
    		} catch (Exception e) {

    		}
    	}
    }
    

    //***********************AT_LE_005_Validation*******************//
    
    @And("^user verify the Blank field in Living Expense$")
    public void user_verify_the_blank_field_in_living_expense() throws Throwable {
		String nameErrorMessage = driver.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]"))
				.getText();
		String expectedErrorText = "Required field";
		if (nameErrorMessage.equalsIgnoreCase(expectedErrorText)) {
			System.out.println("System should not allow the Mandatory fields Empty.The Popup validation message is "
					+ nameErrorMessage);
		} else {
			System.out.println(
					"System should allow the Mandatory fields.The Popup validation message is " + nameErrorMessage);
		}
    }
    
    
    //***********************AT_LE_006_Modification*******************//
    
    @And("^user Enter Modify value in Description and verify it$")
    public void user_enter_modify_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().clear();
		LivexpObj.Liv_Exp_Description().sendKeys(LivExpdata.DescriptionModify);
    }

    @And("^user Enter Modify value in Description2 and verify it$")
    public void user_enter_modify_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().clear();
		LivexpObj.Liv_Exp_Description2().sendKeys(LivExpdata.DescriptionModify2);
    }
    
    @And("^user Enter ApprovedModify value in Description and verify it$")
    public void user_enter_approvedmodify_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().clear();
		LivexpObj.Liv_Exp_Description().sendKeys(LivExpdata.DescriptionApprovedModify);
    }

    @And("^user Enter ApprovedModify value in Description2 and verify it$")
    public void user_enter_approvedmodify_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().clear();
		LivexpObj.Liv_Exp_Description2().sendKeys(LivExpdata.DescriptionApprovedModify2);
    }
    
    
    
    
    //***********************AT_LE_007_Invalid_Modification*******************//
    
    @And("^user Goto the Temp view screen of living Expense$")
    public void user_goto_the_temp_view_screen_of_living_expense() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Living_Exp_Tempview(), 60, 2);
		LivexpObj.Living_Exp_Tempview().click();
    }

    @And("^user click on First record in living Expense$")
    public void user_click_on_first_record_in_living_expense() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Temp_Edit(), 60, 2);
		LivexpObj.Liv_Exp_Temp_Edit().click();   
    }

    @And("^user Enter Invalid value in Description and verify it$")
    public void user_enter_invalid_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().clear();
		LivexpObj.Liv_Exp_Description().sendKeys(LivExpdata.DescriptionInvalidModify);
    }

    @And("^user Enter Invalid value in Description2 and verify it$")
    public void user_enter_invalid_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description2");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().clear();
		LivexpObj.Liv_Exp_Description2().sendKeys(LivExpdata.DescriptionInvalidModify2);
    }

    @And("^user try to update the Modified Record$")
    public void user_try_to_update_the_modified_record() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Update(), 60, 2);
    	LivexpObj.Liv_Exp_Update().click();
    }

    @And("^Validate the Message and verify it$")
    public void validate_the_message_and_verify_it() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath("//ion-badge[contains(text(),'Alphanumeric characters allowed')]")), 60,2);
		WebElement errorPopUp = driver.findElement(By.xpath("//ion-badge[contains(text(),'Alphanumeric characters allowed')]"));
		String expectedErrorText = "Alphanumeric characters allowed";
		String actualErrorText = errorPopUp.getText();
		if (actualErrorText.equalsIgnoreCase(expectedErrorText)) {
			System.out.println("The system was not allow the record to save as we enter the invalid details.The Popup validation message is"+ actualErrorText);
		} else {
			System.out.println(
					"The actual and expected result are not same.The Popup validation message is" + actualErrorText);
		}
		Assert.assertEquals(actualErrorText, "Alphanumeric characters allowed");
    }
    
    

    @Then("^User validate the Living Expense Modified approved record in list view$")
    public void user_validate_the_living_expense_modified_approved_record_in_list_view() throws Throwable {
    	for (int i = 0; i < 50; i++) {
    		try {
    			String validate = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.DescriptionModify + "')]")).getText();
    			System.out.println(validate);
    			Assert.assertEquals(validate, LivExpdata.DescriptionModify);

    			break;
    		} catch (Exception e) {

    		}
    	}
    }

    
  //*****************************AT_LE_009_Reject_Valid_Modification***********************************//
    
    @And("^user Enter Reject Modify value in Description and verify it$")
    public void user_enter_reject_modify_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().clear();
		LivexpObj.Liv_Exp_Description().sendKeys(LivExpdata.DescriptionRejectModify);
    }

    @And("^user Enter Reject Modify value in Description2 and verify it$")
    public void user_enter_reject_modify_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().clear();
		LivexpObj.Liv_Exp_Description2().sendKeys(LivExpdata.DescriptionRejectModify2);
    }
    
    @Then("^User validate the Living Expense Modified Rejected record in list view$")
    public void user_validate_the_living_expense_modified_rejected_record_in_list_view() throws Throwable {
    	for (int i = 0; i < 50; i++) {
    		try {
    			String validate = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.DescriptionRejectModify + "')]")).getText();
    			System.out.println(validate);
    			Assert.assertEquals(validate, LivExpdata.DescriptionRejectModify);

    			break;
    		} catch (Exception e) {

    		}
    	}
    }
    
    //***********************AT_LE_010_Return_Valid_Modification*************************//
    
    @And("^user Enter Return Modify value in Description and verify it$")
    public void user_enter_return_modify_value_in_description_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description(), 60, 2);
		LivexpObj.Liv_Exp_Description().click();
		LivexpObj.Liv_Exp_Description().clear();
		LivexpObj.Liv_Exp_Description().sendKeys(LivExpdata.DescriptionReturnModify);
    }

    @And("^user Enter Return Modify value in Description2 and verify it$")
    public void user_enter_return_modify_value_in_description2_and_verify_it() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Description2(), 60, 2);
		LivexpObj.Liv_Exp_Description2().click();
		LivexpObj.Liv_Exp_Description2().clear();
		LivexpObj.Liv_Exp_Description2().sendKeys(LivExpdata.DescriptionReturnModify2);
    }
    
    @Then("^User validate the Living Expense Modify Returned record in list view$")
    public void user_validate_the_living_expense_modify_returned_record_in_list_view() throws Throwable {
       	for (int i = 0; i < 50; i++) {
    		try {
    			String validate = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.DescriptionReturnModify + "')]")).getText();
    			System.out.println(validate);
    			Assert.assertEquals(validate, LivExpdata.DescriptionReturnModify);

    			break;
    		} catch (Exception e) {

    		}
    	}
    }
    
    //****************@AT-LE-013_Parameter_Creation******************//
    
    @And("^user click on Living Expenses Parameter$")
    public void user_click_on_living_expenses_parameter() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Living_Expense_Parameter(), 60, 2);
        LivexpObj.Liv_Exp_Living_Expense_Parameter().click();
    }
    
    @And("^user select the code value$")
    public void user_select_the_code_value() throws Throwable {
    	verifyfield.verifyGivenFieldisMandatoryOrNot("Code");
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Living_Expense_Parameter_Code(), 60, 2);
        LivexpObj.Liv_Exp_Living_Expense_Parameter_Code().click();
        
        for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[text()=' LIVEXP ']/parent::ion-item//ion-radio")).click();
				break;
			}catch(Exception e) {
				
			}
		}
    }

    @And("^user Enter the value$")
    public void user_enter_the_value() throws Throwable {
    	verifyfield.verifyGivenFieldisMandatoryOrNot("Value");
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Living_Expense_Parameter_Value(), 60, 2);
        LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().click();
        LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().sendKeys(LivExpdata.value);
        }
    
    //******************@AT_LE_014_Parameter_Listview***************//
    
    @And("^user Click on First Record Eye icon$")
    public void user_click_on_first_record_eye_icon() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Temp_view(), 60, 2);
        LivexpObj.Liv_Exp_Temp_view().click();
    }
    
    @Then("^User validate the Living Expense Parameter approved record in list view$")
    public void user_validate_the_living_expense_parameter_approved_record_in_list_view() throws Throwable {
       	for (int i = 0; i < 50; i++) {
    		try {
    			String validate = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.Description + "')]")).getText();
    			System.out.println(validate);
    			Assert.assertEquals(validate, LivExpdata.Description);
    			
    			String validate1 = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.value + "')]")).getText();
    			System.out.println(validate1);
    			Assert.assertEquals(validate1, LivExpdata.value);
    			break;
    		} catch (Exception e) {

    		}
    	}
       	
    }


    //**********************@AT_LE_015_Parameter_Reject*********************//    
    
    @And("^user Enter the Reject value$")
    public void user_enter_the_reject_value() throws Throwable {
    	verifyfield.verifyGivenFieldisMandatoryOrNot("Value");
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Living_Expense_Parameter_Value(), 60, 2);
        LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().click();
        LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().sendKeys(LivExpdata.Rejectvalue);
    }
    
    //**********************@AT_LE_015_Parameter_Reject_Listview*********************//
    
    @Then("^User validate the Living Expense Parameter Rejected record in list view$")
    public void user_validate_the_living_expense_parameter_rejected_record_in_list_view() throws Throwable {
       	for (int i = 0; i < 50; i++) {
    		try {
    			String validate = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.DescriptionReject + "')]")).getText();
    			System.out.println(validate);
    			Assert.assertEquals(validate, LivExpdata.DescriptionReject);
    			
    			String validate1 = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.Rejectvalue + "')]")).getText();
    			System.out.println(validate1);
    			Assert.assertEquals(validate1, LivExpdata.Rejectvalue);
    			break;
    		} catch (Exception e) {

    		}
    	}
    } 
    
    //**********************@AT_LE_016_Parameter_Return*********************//
    
    @Then("^User validate the Living Expense Parameter Returned record in list view$")
    public void user_validate_the_living_expense_parameter_returned_record_in_list_view() throws Throwable {
    	verifyfield.verifyGivenFieldisMandatoryOrNot("Value");
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivexpObj.Liv_Exp_Living_Expense_Parameter_Value(), 60, 2);
        LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().click();
        LivexpObj.Liv_Exp_Living_Expense_Parameter_Value().sendKeys(LivExpdata.Returnvalue);
    }

    @And("^user Enter the Return value$")
    public void user_enter_the_return_value() throws Throwable {
      	for (int i = 0; i < 50; i++) {
    		try {
    			String validate = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.DescriptionReturn + "')]")).getText();
    			System.out.println(validate);
    			Assert.assertEquals(validate, LivExpdata.DescriptionReturn);
    			
    			String validate1 = driver.findElement(By.xpath("//span[contains(text(),'" + LivExpdata.Returnvalue + "')]")).getText();
    			System.out.println(validate1);
    			Assert.assertEquals(validate1, LivExpdata.Returnvalue);
    			break;
    		} catch (Exception e) {

    		}
    	}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
