package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.Appropriation_MasterObj;
import pageobjects.ReportMasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.AppropriationMasterTestDataType;
import testDataType.KULS_Login_TestDataType;
import testDataType.ReportMasterTestDataType;

public class ReportMaster {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	ReportMasterObj ReportMaster = new ReportMasterObj(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ReportMasterTestDataType Reportjson = jsonConfig.getReportMasterListByName("Maker");
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx",
			"ReportMasterTestData", "Data Set ID");
	Map<String, String> testData;
	
	@Then("^User click the report master list view icon$")
    public void user_click_the_report_master_list_view_icon() throws Throwable {
		
		help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.ReportMasterListViewIcon(), 60, 5);
    	ReportMaster.ReportMasterListViewIcon().click();
		
        
    }

    @Then("^User verify the functionality of Add button in report master$")
    public void user_verify_the_functionality_of_add_button_in_report_master() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.AddIcon(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.AddIcon().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
    	
        
    }

    @Then("^User click the save icon in report master$")
    public void user_click_the_save_icon_in_report_master() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.NewSave(), 60, 5);
    	for (int i = 0; i <30; i++) {
			try {
				ReportMaster.NewSave().click();
				break;
			} catch (Exception e) {
				if(i==30) {
					Assert.fail();
				}
				
			}
		}
    	
        
    }

    @Then("^User get the confirmation message in report master$")
    public void user_get_the_confirmation_message_in_report_master() throws Throwable {
    	
    	for (int i = 0; i < 20; i++) {
			try {
				//Assert.assertEquals(assetcd.makerconfirmmsg().isDisplayed(), true);
				System.out.println(ReportMaster.makerconfirmmsg().getText());
				break;
			} catch (NoSuchElementException e) {

			}
		}
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.successcancel(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.successcancel().click();
    			break;
			} catch (Exception e) {
				
			}
    	}

        
    }

    @Then("^User click the inboxmail icon in report master$")
    public void user_click_the_inboxmail_icon_in_report_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.mailicon(), 60, 5);
    	ReportMaster.mailicon().click();
        
    }

    @And("^User verify the functionality of Back button in report master$")
    public void user_verify_the_functionality_of_back_button_in_report_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.BackArrow(), 60, 5);
    	ReportMaster.BackArrow().click();
        
    }

    @And("^User click the report parameter add icon in report master$")
    public void user_click_the_report_parameter_add_icon_in_report_master() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.ReportParameterAddIcon(), 60, 5);
    	ReportMaster.ReportParameterAddIcon().click();
        
    }

    @And("^User click the report group master icon in report master$")
    public void user_click_the_report_group_master_icon_in_report_master() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.ReportGroupMaster(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.ReportGroupMaster().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
    	
        
    }

    @And("^User click the report group master add icon in report master$")
    public void user_click_the_report_group_master_add_icon_in_report_master() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.AddIcon(), 60, 5);
    	for(int i=0; i<40; i++) {
    		try {
    			ReportMaster.AddIcon().click();
			} catch (Exception e) {
			
			}
    	}
    	
        
    }

    @And("^User Enter the group name in report master$")
    public void user_enter_the_group_name_in_report_master() throws Throwable {
    	testData = excelData.getTestdata("AT-RA-022_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.GroupName(), 60, 5);
    	ReportMaster.GroupName().click();
    	ReportMaster.GroupName().sendKeys(testData.get("Group Name"));
    	
        
    }

    @And("^User Enter the group description in report master$")
    public void user_enter_the_group_description_in_report_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-RA-022_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.GroupDescription(), 60, 5);
    	ReportMaster.GroupDescription().click();
    	ReportMaster.GroupDescription().sendKeys(testData.get("Group Des"));
    	
    }

    @And("^User Enter the min parameter required in report master$")
    public void user_enter_the_min_parameter_required_in_report_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-RA-022_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.MinParametersRequired(), 60, 5);
    	ReportMaster.MinParametersRequired().click();
    	ReportMaster.MinParametersRequired().sendKeys(testData.get("Min Parameter req"));
        
    }

    @And("^User Verify the available and selected field in report master$")
    public void user_click_the_double_arrow_in_report_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-RA-022_D1");
    	String xpath = "//div[contains(text(),'"+testData.get("Available and Selected")+"')]";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
		
		help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.AngleRight(), 60, 5);
    	ReportMaster.AngleRight().click();
    	
        
    }

    @And("^User get the reference id in report master$")
    public void user_get_the_reference_id_in_report_master() throws Throwable {
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.searchiconreferenceid().click();
				ReportMaster.searchsentkeys().sendKeys(testData.get("Inbox Search"));
				break;
				
			} catch (Exception e) {

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.referenceid(), 60, 5);
    	System.out.println(ReportMaster.referenceid().getText());
		String ref1 = ReportMaster.referenceid().getText();
		String ref2 = ref1.substring(0);
		//json.addReferanceData(ref2);
		excelData.updateTestData("AT-RA-012_D1","Reference ID",ref2);
        
    }

    @And("^User click the action edit icon in submit stage in report master$")
    public void user_click_the_action_edit_icon_in_submit_stage_in_report_master() throws Throwable {
    	
    	for(int i=0; i<20; i++) {
			try {
				ReportMaster.inboxediticon().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	       
    }

    @And("^User click the submit icon in report master$")
    public void user_click_the_submit_icon_in_report_master() throws Throwable {
    	
    	for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.submit().click();
				break;
			} catch (Exception e) {

			}
		}
        
    }

    @And("^User enter the popup remark and click the popup submit$")
    public void user_enter_the_popup_remark_and_click_the_popup_submit() throws Throwable {
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.popupremark().click();
				break;
			} catch (Exception e) {

			}
		}
    	
    	for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.popupremark().sendKeys(testData.get("Maker PopupRemark"));
				break;
			} catch (Exception e) {

			}
		}
    	
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.popupsubmit(), 60, 5);
    	ReportMaster.popupsubmit().click();
        
    }

    @And("^user get the popup message and get the checker id in report master$")
    public void user_get_the_popup_message_and_get_the_checher_id_in_report_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.ProductCheckerid(), 60, 5);
		String Success = ReportMaster.ProductCheckerid().getText();
		System.out.println(Success);
		String Space = " ";
		String split[] = Success.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		//json.addData(popupID);
		System.out.println(popupID);
		excelData.updateTestData("AT-RA-012_D1","Checker id",popupID);
        
    }
    @And("^User Enter the Template in report parameter$")
    public void user_enter_the_template_in_report_parameter() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.Template(), 60, 5);
    	ReportMaster.Template().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+testData.get("Template")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
    	
        
    }

    @And("^User Enter the parameter1 in report parameter$")
    public void user_enter_the_parameter1_in_report_parameter() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.Parameter1(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.Parameter1().click();
    	    	ReportMaster.Parameter1().sendKeys(testData.get("Parameter 1"));
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
    	
        
    }

    @And("^User Enter the param1 Description1 in report parameter$")
    public void user_enter_the_param1_description1_in_report_parameter() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.Param1Description1(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.Param1Description1().click();
    	    	ReportMaster.Param1Description1().sendKeys(testData.get("Parameter 1 Des 1"));
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
    	
        
    }

    @And("^User Enter the param1 Description2 in report parameter$")
    public void user_enter_the_param1_description2_in_report_parameter() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.Param1Description2(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    	    	ReportMaster.Param1Description2().click();
    	    	ReportMaster.Param1Description2().sendKeys(testData.get("Parameter 1 Des 2"));
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
        
    }

    @And("^User Enter the param1 Description3 in report parameter$")
    public void user_enter_the_param1_description3_in_report_parameter() throws Throwable {
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.Param1Description3(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.Param1Description3().click();
    	    	ReportMaster.Param1Description3().sendKeys(testData.get("Parameter 1 Des 3"));
    	        
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
    	
    }

    @And("^User Enter the parameter2 in report parameter$")
    public void user_enter_the_parameter2_in_report_parameter() throws Throwable {
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.Parameter2(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.Parameter2().click();
    	    	ReportMaster.Parameter2().sendKeys(testData.get("Parameter 2"));
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
    }

    @And("^User Enter the param2 Description2 in report parameter$")
    public void user_enter_the_param2_description2_in_report_parameter() throws Throwable {
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.Param2Description2(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.Param2Description2().click();
    	    	ReportMaster.Param2Description2().sendKeys(testData.get("Parameter 2 Des 2"));
    	        
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
    }

    @And("^User Enter the param2 Description3 in report parameter$")
    public void user_enter_the_param2_description3_in_report_parameter() throws Throwable {
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.Param2Description3(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.Param2Description3().click();
    	    	ReportMaster.Param2Description3().sendKeys(testData.get("Parameter 2 Des 3"));
    	        
    	    	break;
			} catch (Exception e) {
				
			}
    	}
    	
    }

    @And("^User Enter the IsMandatory in report parameter$")
    public void user_enter_the_ismandatory_in_report_parameter() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.IsMandatory(), 60, 5);
    	ReportMaster.IsMandatory().click();
    	
    	String xpath = "//ion-label[contains(text(),'"+testData.get("Is Mandatory")+"')]//following-sibling::ion-radio";

		for (int i = 1; i < 60; i++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;

			} catch (Exception e) {

			}
		}
        
    }

    @And("^User Enter the sequenceNo in report parameter$")
    public void user_enter_the_sequenceno_in_report_parameter() throws Throwable {
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.SequenceNo(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.SequenceNo().click();
    	    	ReportMaster.SequenceNo().sendKeys(testData.get("Sequence No"));
    	    	break;
			} catch (Exception e) {
			
			}
    	}
    	
        
    }

    @And("^User Enter the date format in report parameter$")
    public void user_enter_the_date_format_in_report_parameter() throws Throwable {
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.DateFormat(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.DateFormat().click();
    	    	ReportMaster.DateFormat().sendKeys(testData.get("Date format"));
    	    	break;
			} catch (Exception e) {
			
			}
    	}
    	
        
    }

    @And("^User Enter the Nullable values in report parameter$")
    public void user_enter_the_nullable_values_in_report_paramete() throws Throwable {
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.NullableValues(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.NullableValues().click();
    	    	ReportMaster.NullableValues().sendKeys(testData.get("Nullable values"));
    	    	break;
			} catch (Exception e) {
			
			}
    	}
    	
        
    }
    @And("^User click the report master edit icon$")
    public void user_click_the_report_master_edit_icon() throws Throwable {
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.ReportMasterEditIcon(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.ReportMasterEditIcon().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
    	
        
    	
    }
    
    // Checker 
    
    // Checker Approve
    
    @Given("^User login as uls checker in report master$")
    public void user_login_as_uls_checker_in_report_master() throws Throwable {
    	String kulsApplicationUrl = configFileReader.getApplicationUrlTransactions();
        driver.get(kulsApplicationUrl);
        //System.out.println(json.readdata());
        testData = excelData.getTestdata("AT-RA-012_D1");
        System.out.println(testData.get("Checker id"));
        applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
    }


    @And("^User click the search icon in report master and get the reference id in report master$")
    public void user_click_the_search_icon_in_report_master_and_get_the_reference_id_in_report_master() throws Throwable {
        
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	for (int i = 0; i < 20; i++) {
			try {
				ReportMaster.searchiconreferenceid().click();
				ReportMaster.searchsentkeys().sendKeys(testData.get("Inbox Search"));
				break;
				
			} catch (Exception e) {

			}
		}

    	
    }

    @And("^User search the respective reference id and click on Action button in report master$")
    public void user_search_the_respective_reference_id_and_click_on_action_button_in_report_master() throws Throwable {
        
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	for (int i = 0; i <40; i++) {
            
	    	try {
	           
	    		driver.findElement(By.xpath("//span[text()='"+testData.get("Reference ID")+"']/ancestor::tr/td[1]/button"))
	            .click();
	            break;
              
	    	}
         
	    	catch (Exception e) {
	    		
	    	}
	    		
	    }
    	
    }
    @Then("^User validate the updated record in list view in report master$")
    public void user_validate_the_updated_record_in_list_view_in_report_master() throws Throwable {
        
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	for (int i = 0; i <20; i++) {
            try {
                String validate = driver.findElement(By.xpath("//span[contains(text(),'"+testData.get("Reference ID")+"')]"))
                        .getText();
                System.out.println(validate);
                Assert.assertEquals(validate, testData.get("Reference ID"));
                break;

            } catch (NoSuchElementException e) {


            }

        }

    	
    }

    @And("^User click the report master eye icon$")
    public void user_click_the_report_master_eye_icon() throws Throwable {
        
    	//help.waitForElementToVisibleWithFluentWait(driver, ReportMaster.ReportMasterEditIcon(), 60, 5);
    	for(int i=0; i<20; i++) {
    		try {
    			ReportMaster.ReportMasterListViewIcon().click();
    			break;
			} catch (Exception e) {
				
			}
    	}
    	
        
    	
    }
    @And("^User verify the rejected record removed from the system in report master$")
    public void user_verify_the_rejected_record_removed_from_the_system_in_report_master() throws Throwable {
        
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	for (int i = 0; i <20; i++) {
            try {
            	ReportMaster.searchiconreferenceid().click();
                break;
            } catch (Exception e) {

            }
        }

            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,ReportMaster.searchsentkeys(),60,2);
            
            ReportMaster.searchsentkeys().sendKeys(testData.get("Reference ID"));
            
            String xpath ="//td[contains(text(),'MST_REPORT')]/preceding-sibling::td[1]/span[contains(text(),'"+json.readReferancedata()+"')]";
            for (int i = 0; i < 200; i++) {
                try {
                    Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
                    break;
                } catch (NoSuchElementException e) {

                }
            }

    	
    }

    @And("^User verify the returned record removed from the system in report master$")
    public void user_verify_the_returned_record_removed_from_the_system_in_report_master() throws Throwable {
        
    	testData = excelData.getTestdata("AT-RA-012_D1");
    	for (int i = 0; i <20; i++) {
            try {
            	ReportMaster.searchiconreferenceid().click();
                break;
            } catch (Exception e) {

            }
        }

            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,ReportMaster.searchsentkeys(),60,2);
            
            ReportMaster.searchsentkeys().sendKeys(testData.get("Reference ID"));
            
            String xpath ="//td[contains(text(),'MST_REPORT')]/preceding-sibling::td[1]/span[contains(text(),'"+json.readReferancedata()+"')]";
            for (int i = 0; i < 200; i++) {
                try {
                    Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
                    break;
                } catch (NoSuchElementException e) {

                }
            }
    	
    }

    	




}
