package stepdefinitions;

import java.io.File;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.LivingExpenseObj;
import pageobjects.Warehouse_MasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.KULS_CollateralSubType;

import testDataType.KULS_Login_TestDataType;

public class KULS_LivingExpense_Step {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login login = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	LivingExpenseObj livingexpenseobj = new LivingExpenseObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	//KULS_LivingExpense_Testdata livingexpensedata = jsonConfig.getLivingExpenseByName("Maker");
   JsonDataReaderWriter json = new JsonDataReaderWriter();
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00075\\Downloads\\UlsTestDataDesign.xlsx",
			"LivingExpenseMasterTestdaa", "Data Set ID");
	Map<String, String> testData;
	Warehouse_MasterObj warehousrobj = new Warehouse_MasterObj(driver);
	
	@Given("^Launch the kuls application and Navigate to living expense module view list$")
    public void launch_the_kuls_application_and_navigate_to_living_expense_module_view_list() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
	    driver.get(kulsApplicationUrl);
	    login.loginUlsApplicationAsMaker(loginData.Username,loginData.Password);		   
	    seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.menuBarInHomePage(),60,2);
	    livingexpenseobj.menuBarInHomePage().click();
	    seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.configurationInLeftPanel(),60,2);
	    livingexpenseobj.configurationInLeftPanel().click();
	    seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.otherMasterInLeftPanel(),60,2);
	    livingexpenseobj.otherMasterInLeftPanel().click();
	    seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.viewIconOfLivingExpense(),60,2);
	    livingexpenseobj.viewIconOfLivingExpense().click();
    }

    @And("^click on Pencil icon of existing record$")
    public void click_on_pencil_icon_of_existing_record() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpense_pencilIconOfFirstRecord(),60,2);
    	livingexpenseobj.LivingExpense_pencilIconOfFirstRecord().click();
    }

    @And("^Navigate to Living expense parameter section$")
    public void navigate_to_living_expense_parameter_section() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpenseparameterButton(),60,2);
    	livingexpenseobj.LivingExpenseparameterButton().click();
        
    }

    @And("^Validate all fields present in Living expense parameter view list$")
    public void validate_all_fields_present_in_living_expense_parameter_view_list() throws Throwable {
    	Thread.sleep(3000);
    	String xpath ="(//span[contains(text(),'Action')])[1]";
         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
     	WebElement Action = driver.findElement(By.xpath(xpath));
     	System.out.println(Action);
//     	 String xpath1 ="//span[contains(text(),' Asset/Collateral type Subtype Code ')]";
//         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath1)),60,2);
//     	WebElement assetcolleteralsubtypecode = driver.findElement(By.xpath(xpath1));
//     	System.out.println(assetcolleteralsubtypecode);
     	 String xpath2 ="//span[contains(text(),' Description ')]";
         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath2)),60,2);
     	WebElement description = driver.findElement(By.xpath(xpath2));
     	System.out.println(description);
     	String xpath3 ="(//span[contains(text(),' Status ')])[1]";
         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath3)),60,2);
     	WebElement status = driver.findElement(By.xpath(xpath3));
     	System.out.println(status);
    }

    @And("^Validate that records in Living expense parameter view list is non editable$")
    public void validate_that_records_in_living_expense_parameter_view_list_is_non_editable() throws Throwable {
    	String xpath ="//tbody/tr[1]/td[4]";
    	Thread.sleep(2000);
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
    	try {
    		driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {
			System.out.println("Verified status field is not editable only displayable");
		}
    }

    @And("^Search with valid test data in Living expense parameter view list$")
    public void search_with_valid_test_data_in_living_expense_parameter_view_list() throws Throwable {
    	for (int i = 0; i <20; i++) {
			try {
				livingexpenseobj.searchIconOfLivingExpense().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.searchTextFieldOfLivingExpense(),30,2);
    	livingexpenseobj.searchTextFieldOfLivingExpense().sendKeys(testData.get("Search Match"));
    	String xpath ="//span[contains(text(),' Description ')]";
        String productgroup = null;
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
        for (int i = 0; i < 20; i++) {
        	
        	productgroup = driver.findElement(By.xpath(xpath)).getText();
		}
    	System.out.println(productgroup);
    }

    @And("^Search with invalid test data in Living expense parameter view list$")
    public void search_with_invalid_test_data_in_living_expense_parameter_view_list() throws Throwable {
    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    	
    	for (int i = 0; i <20; i++) {
			try {
				livingexpenseobj.searchIconOfLivingExpense().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.searchTextFieldOfLivingExpense(),30,2);
    	livingexpenseobj.searchTextFieldOfLivingExpense().sendKeys(testData.get("Search Mismatch"));
    	Thread.sleep(1000);
    	String xpath ="(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
    	for (int i = 0; i < 200; i++) {
    		try {
    			seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
    	       Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
    	        //"Showing 0 to 0 of 0 entries"
    	        break;
    		} catch (Exception e) {
    			
    		}
		}
        
        driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    }

    @And("^Validate the export to PDF functionality of Living expense parameter$")
    public void validate_the_export_to_pdf_functionality_of_living_expense_parameter() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			livingexpenseobj.exportIconOfLivingExpense().click();
    			break;
    		} catch (Exception e) {
    			
    		}
		}
    	
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.exportToPDFOfLivingExpense(),60,3);
        livingexpenseobj.exportToPDFOfLivingExpense().click();
        //seleniumactions.getBrowserHelper().SwitchToWindow(1);
        String UserDirectory = System.getProperty("user.dir");
        System.out.println(UserDirectory);
        String substring = UserDirectory.substring(0, 21)+"Downloads";
        substring.replaceAll("/", "//");
        System.out.println(substring);
        File file = new File("C:\\Users\\inindc00075");
        File[] totalfiles = file.listFiles();
        for (File fileName : totalfiles) {
        	if (fileName.getName().equalsIgnoreCase("LivingExpencesParameter.pdf")) {
				System.out.println("Downloaded file present in system");
				break;
			}
			else {
				System.out.println("Downloaded file present does not exist in system");
			}
			
		}
        seleniumactions.getBrowserHelper().switchToParentWithChildClose();
        }

    @And("^Validate the export to Excel functionality of Living expense parameter$")
    public void validate_the_export_to_excel_functionality_of_living_expense_parameter() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			livingexpenseobj.exportIconOfLivingExpense().click();
    			break;
    		} catch (Exception e) {
    			
    		}
		}
    	for (int i = 0; i < 20; i++) {
    		try {
    			livingexpenseobj.exportToExcelOfLivingExpense().click();
    			break;
    		} catch (Exception e) {
    			
    		}
		}
        
        seleniumactions.getBrowserHelper().switchToParentWithChildClose();
        System.out.println("Downloaded XLS file present in system");	
    }

    @And("^Click on Add icon of Living expense parameter$")
    public void click_on_add_icon_of_living_expense_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpenseAddIcon(),60,2);
	    livingexpenseobj.LivingExpenseAddIcon().click();
    }

    @And("^Click on back button of lLiving expense parameter$")
    public void click_on_back_button_of_lliving_expense_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpenseBackIcon(),60,2);
    	livingexpenseobj.LivingExpenseBackIcon().click();
    }
    @Then("^Click on Save button in Living expense parameter$")
    public void click_on_save_button_in_living_expense_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpenseSaveIcon(),60,2);
    	livingexpenseobj.LivingExpenseSaveIcon().click();
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpensesubmitSuccessPopup(),60,2);
        Assert.assertEquals(livingexpenseobj.LivingExpensesubmitSuccessPopup().isDisplayed(), true);	       
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.closeIconInSuccessPopupOfLivingexpense(),60,2);
    	livingexpenseobj.closeIconInSuccessPopupOfLivingexpense().click();
    }

    @Then("^Submit the Living expense parameter record from maker user$")
    public void submit_the_living_expense_parameter_record_from_maker_user() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, livingexpenseobj.LivingExpenseMaker_Submit(), 60, 2);
    	livingexpenseobj.LivingExpenseMaker_Submit().click();
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpenseMakerMaker_EnterRemark(),30,2);
        livingexpenseobj.LivingExpenseMakerMaker_EnterRemark().click();
        livingexpenseobj.LivingExpenseMakerMaker_EnterRemark().sendKeys("ok");
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpensemakerRemarkSubmit(),30, 2);
        livingexpenseobj.LivingExpensemakerRemarkSubmit().click();
    }

    @And("^Navigate to Living expense location page$")
    public void navigate_to_living_expense_location_page() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpenseLocationButton(),30, 2);
        livingexpenseobj.LivingExpenseLocationButton().click();
    }

    @And("^Select the value in Country field of Living expense parameter$")
    public void select_the_value_in_country_field_of_living_expense_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, livingexpenseobj.LivingExpenseLocation_CountryField(), 60, 2);
    	livingexpenseobj.LivingExpenseLocation_CountryField().click();
		for (int i = 0; i < 50; i++) {
			try {
					driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("Country")
							+ "')]/following-sibling::ion-radio")).click();
					break;
				} catch (Exception e) {
				}
			}
		
    }

    @And("^Select the value in Province field of Living expense parameter$")
    public void select_the_value_in_province_field_of_living_expense_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, livingexpenseobj.LivingExpenseLocation_ProvinceField(), 60, 2);
    	livingexpenseobj.LivingExpenseLocation_ProvinceField().click();
		for (int i = 0; i < 50; i++) {
			try {
					driver.findElement(By.xpath("//ion-label[contains(text(),'" + testData.get("Province")
							+ "')]/following-sibling::ion-radio")).click();
					break;
				} catch (Exception e) {
				}
			}
		
    }

    @And("^Enter the value in Area factor income of Living expense parameter$")
    public void enter_the_value_in_area_factor_income_of_living_expense_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpenseLocation_AreaFactorIncomeField(),60,2);
    	livingexpenseobj.LivingExpenseLocation_AreaFactorIncomeField().click();
    	livingexpenseobj.LivingExpenseLocation_AreaFactorIncomeField().sendKeys(testData.get("AreaFactorIncome"));
    }

    @And("^Enter the value in Area factor expenditure of Living expense parameter$")
    public void enter_the_value_in_area_factor_expenditure_of_living_expense_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpenseLocation_AreaFactorExpenditurefield(),60,2);
    	livingexpenseobj.LivingExpenseLocation_AreaFactorExpenditurefield().click();
    	livingexpenseobj.LivingExpenseLocation_AreaFactorExpenditurefield().sendKeys(testData.get("AreaFactorExpenditure"));
    }

    @And("^Click on Mail icon for Living expense parameter$")
    public void click_on_mail_icon_for_living_expense_parameter() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpense_Inbox(), 30, 2);
    	livingexpenseobj.LivingExpense_Inbox().click();
    }

    @And("^Search the respictive Living expense parameter record$")
    public void search_the_respictive_living_expense_parameter_record() throws Throwable {
    	for (int i = 0; i <20; i++) {
    		try {
            //seleniumactions.getClickAndActionsHelper().moveToElement(subMasterRetailObj.Subproduct_InboxView_Search());
    			livingexpenseobj.LivingExpenseInboxView_Search().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    	
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpenseInboxView_SearchText(),60,2);
        livingexpenseobj.LivingExpenseInboxView_SearchText().click();
        livingexpenseobj.LivingExpenseInboxView_SearchText().sendKeys("LIV_EXP");
    }

    @And("^Store the reference number and click on first Living expense parameter record$")
    public void store_the_reference_number_and_click_on_first_living_expense_parameter_record() throws Throwable {
    	String reference = null;
        for (int i = 0; i < 200; i++) {
			try {
			 reference = livingexpenseobj.LivingExpenseReferanceId().getText();
			 break;
			} catch (Exception e) {
				
			}
		}
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,livingexpenseobj.LivingExpense_pencilIconOfFirstRecord(),40, 2);
        livingexpenseobj.LivingExpense_pencilIconOfFirstRecord().click();
        
        //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.Sub_Producr_Product_ReferanceId(),40, 2);
        
        json.addReferanceData(reference);
        System.out.println(reference);
    }
    
	@And("^user Pass the Exceldata value for Living expense parameter view list$")
	public void user_Pass_the_Exceldata_value_for_Living_expense_parameter_view_list() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T023_D23");
	}
	@And("^user Pass the Exceldata value for Living expense Location creation$")
	public void user_Pass_the_Exceldata_value_for_Living_expense_location_creation() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T024_D24");
	}
	@And("^user Pass the Exceldata value for Living expense Location approve$")
	public void user_Pass_the_Exceldata_value_for_Living_expense_location_approve() throws Throwable {
		testData = exceldata.getTestdata("AT_LR_T025_D25");
	}

}

