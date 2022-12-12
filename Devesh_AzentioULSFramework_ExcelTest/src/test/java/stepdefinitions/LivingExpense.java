package stepdefinitions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.DepositAccountMasterObject;
import pageobjects.LivingExpenseObject;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class LivingExpense extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileRead = new ConfigFileReader();
	JsonConfig jconfig = new JsonConfig();
	KULS_Login_TestDataType kulsLoginData = jconfig.getKULSLoginCredentialsByName("Maker");
	LivingExpenseObject LivingMstObj = new LivingExpenseObject(driver);
	DepositAccountMasterObject depositMstObj = new DepositAccountMasterObject(driver);
	KULS_Application_Login login = new KULS_Application_Login(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	Selenium_Actions action = new Selenium_Actions(driver);
	ClicksAndActionsHelper clickAndAction = new ClicksAndActionsHelper(driver);

//	AllocationMasterTestData allocationMasterData = jconfig.getAllocationMasterByName("Maker");
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	String Toast;
	List<String> xlsList = new ArrayList<>();
	
	@Then("^Verify the values in List view should be non editable in Living Expense$")
    public void verify_the_values_in_list_view_should_be_non_editable_in_living_expense() throws Throwable {
		String xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]";
		// action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (NoSuchElementException e) {
			System.out.println("Verified status field is not editable only displayable");
		}
		
    }
	@And("^To verify the functionality of Add button in Living Expense$")
    public void to_verify_the_functionality_of_add_button_in_living_expense() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivingMstObj.LivingExpense_AddButton(), 60, 2);
		Assert.assertEquals(LivingMstObj.LivingExpense_AddButton().isDisplayed(), true);
    }
    @Then("^To verify the functionality of View in Approved records in Living Expense$")
    public void to_verify_the_functionality_of_view_in_approved_records_in_living_expense() throws Throwable {
    	String xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]/span[1]";
		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath)), 60,
				2);
		WebElement RuleID = driver.findElement(By.xpath(xpath));
		System.out.println("RuleID :" + RuleID);

		String xpath1 = "//tbody/tr[1]/td[4]/p-celleditor[1]/span[1]";
		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath1)), 60,
				2);
		WebElement EffectiveDate = driver.findElement(By.xpath(xpath1));
		System.out.println("EffectiveDate :" + EffectiveDate);

		String xpath2 = "//p-tag[@ng-reflect-value='Active']";
		action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath(xpath2)), 60,
				2);
		WebElement status = driver.findElement(By.xpath(xpath2));
		System.out.println("status :" + status);
    }

    @And("^To verify the functionality of Search box with matching data in Living Expense$")
    public void to_verify_the_functionality_of_search_box_with_matching_data_in_living_expense() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivingMstObj.LivingExpense_ListViewSearch(), 60, 2);
    	for (int i = 0; i < 20; i++) {
    		try {
    			LivingMstObj.LivingExpense_ListViewSearch().click();
    			break;
    		} catch (Exception e) {

    		}
    	}

    	LivingMstObj.LivingExpense_ListViewSearchText().click();
    	LivingMstObj.LivingExpense_ListViewSearchText().sendKeys("Living");
    	Assert.assertEquals(LivingMstObj.LivingExpense_ListViewSearchText().isDisplayed(), true);
    }
    @Then("^To verify the functionality of Search box with mismatch data in Living Expense$")
    public void to_verify_the_functionality_of_search_box_with_mismatch_data_in_living_expense() throws Throwable {
    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

    	for (int i = 0; i < 20; i++) {
    		try {
    			LivingMstObj.LivingExpense_ListViewSearch().click();
    			break;
    		} catch (Exception e) {

    		}
    	}
    	LivingMstObj.LivingExpense_ListViewSearchText().click();
    	LivingMstObj.LivingExpense_ListViewSearchText().sendKeys("$##");
    	Thread.sleep(1000);
    	String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
    	for (int i = 0; i < 200; i++) {
    		try {
    			action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
    					driver.findElement(By.xpath(xpath)), 60, 2);
    			Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
    			// "Showing 0 to 0 of 0 entries"
    			break;
    		} catch (Exception e) {

    		}
    	}

    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    }

    @And("^To verify the functionality of Export to PDF button in Living Expense$")
    public void to_verify_the_functionality_of_export_to_pdf_button_in_living_expense() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			LivingMstObj.exportIcon().click();
    			break;
    		} catch (Exception e) {

    		}
    	}

    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, LivingMstObj.exportToPDF(), 60, 3);
    	LivingMstObj.exportToPDF().click();
    	// seleniumactions.getBrowserHelper().SwitchToWindow(1);
    	String UserDirectory = System.getProperty("user.dir");
    	System.out.println(UserDirectory);
    	String substring = UserDirectory.substring(0, 21) + "Downloads";
    	substring.replaceAll("/", "//");
    	System.out.println(substring);
    	File file = new File(substring);
    	File[] totalfiles = file.listFiles();
    	int length = totalfiles.length;
    	int i = 0;
    	for (File fileName : totalfiles) {
    		if (fileName.getName().equalsIgnoreCase("AllocationMasterFormDataFile.pdf")) {
    			System.out.println("Downloaded file present in system");
    			break;
    		} else if (i == length - 1) {
    			System.out.println("Downloaded file present does not exist in system");
    		}

    	}
    	action.getBrowserHelper().switchToParentWithChildClose();
    }

    @Then("^To verify the functionality of Export to Excel button in Living Expense$")
    public void to_verify_the_functionality_of_export_to_excel_button_in_living_expense() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			LivingMstObj.exportIcon().click();
    			break;
    		} catch (Exception e) {

    		}
    	}
    	        action.getClickAndActionsHelper().moveToElement(LivingMstObj.exportToExcel());
    	        LivingMstObj.exportToExcel().click();
    Thread.sleep(2000);
    	
    	
    	String UserDirectory = System.getProperty("user.dir");
        //System.out.println(UserDirectory);
        String substring = UserDirectory.substring(0, 21) + "Downloads";
        substring.replaceAll("/", "//");
        System.out.println(substring);
        File file = new File(substring);
        File[] totalfiles = file.listFiles();
        for (File fileName : totalfiles) {
            System.out.println("File name" + fileName);
            xlsList.add(fileName.toString());
        }
    }
    @Then("^click the pencil icon in living expense$")
    public void click_the_pencil_icon_in_living_expense() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivingMstObj.LivingExpenseLocatio_PencilIcon(), 60, 2);
		LivingMstObj.LivingExpenseLocatio_PencilIcon().click();
    
    }

    @Then("^Click the Eye icon of the living expense$")
    public void click_the_eye_icon_of_the_living_expense() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivingMstObj.LivingExpense_EyeIcon(), 60, 2);
		LivingMstObj.LivingExpense_EyeIcon().click();
    }
    
    @Then("^user should navigate to living expense$")
	public void user_should_navigate_to_living_expense() throws Throwable {
    	waitHelper.waitForElementwithFluentwait(driver, LivingMstObj.LivingExpense_Maker_MenuToggle());
		LivingMstObj.LivingExpense_Maker_MenuToggle().click();;
		waitHelper.waitForElementwithFluentwait(driver, LivingMstObj.livingExpenseConfigurations());
		LivingMstObj.livingExpenseConfigurations().click();
		waitHelper.waitForElementwithFluentwait(driver, LivingMstObj.livingExpenseConfigManager());
		LivingMstObj.livingExpenseConfigManager().click();
	}
    
    @And("^Click the other master$")
    public void click_the_other_master() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivingMstObj.LivingExpense_Maker_MenuToggle(), 60, 2);
    	LivingMstObj.LivingExpense_Maker_MenuToggle().click();
    	
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, depositMstObj.DepositAccount_Configurations(), 60, 2);
		depositMstObj.DepositAccount_Configurations().click();
    	
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivingMstObj.LivingExpense_OtherMaster(), 60, 2);
		LivingMstObj.LivingExpense_OtherMaster().click();
    }
    @Then("^Click the temp view in the living expense$")
    public void click_the_temp_view_in_the_living_expense() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, LivingMstObj.LivingExpense_TempViewButton(), 60, 2);
		LivingMstObj.LivingExpense_TempViewButton().click();
    }
    @And("^Click the living expense location tab$")
    public void click_the_living_expense_location_tab() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivingMstObj.LivingExpenseLocationTab(), 60, 2);
    	
    	LivingMstObj.LivingExpenseLocationTab().click();
    	
		}
    @And("^To verify the functionality of Search box with matching data in Living Expense location$")
    public void to_verify_the_functionality_of_search_box_with_matching_data_in_living_expense_location() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, LivingMstObj.LivingExpense_ListViewSearch(), 60, 2);
		for (int i = 0; i < 20; i++) {
			try {
				LivingMstObj.LivingExpense_ListViewSearch().click();
				break;
			} catch (Exception e) {

			}
		}

		LivingMstObj.LivingExpense_ListViewSearchText().click();
		LivingMstObj.LivingExpense_ListViewSearchText().sendKeys("123");
		Assert.assertEquals(LivingMstObj.LivingExpense_ListViewSearchText().isDisplayed(), true);
	}
 
   
    @Then("^To verify the functionality of Search box with mismatch data in Living Expense location$")
    public void to_verify_the_functionality_of_search_box_with_mismatch_data_in_living_expense_location() throws Throwable {
    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();

    	for (int i = 0; i < 20; i++) {
    		try {
    			LivingMstObj.LivingExpense_ListViewSearch().click();
    			break;
    		} catch (Exception e) {

    		}
    	}
    	LivingMstObj.LivingExpense_ListViewSearchText().click();
    	LivingMstObj.LivingExpense_ListViewSearchText().sendKeys("$##");
    	Thread.sleep(1000);
    	String xpath = "(//kub-prime-table[1]/p-table[1]/div[1]/p-paginator[1]/div[1]/span)[1]";
    	for (int i = 0; i < 200; i++) {
    		try {
    			action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
    					driver.findElement(By.xpath(xpath)), 60, 2);
    			Assert.assertEquals(driver.findElement(By.xpath(xpath)).getText(), "Showing 0 to 0 of 0 entries");
    			// "Showing 0 to 0 of 0 entries"
    			break;
    		} catch (Exception e) {

    		}
    	}

    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
    }

 
    @And("^To verify the functionality of Export to PDF button in Living Expense location$")
    public void to_verify_the_functionality_of_export_to_pdf_button_in_living_expense_location() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			LivingMstObj.exportIcon().click();
    			break;
    		} catch (Exception e) {

    		}
    	}

    	action.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, LivingMstObj.exportToPDF(), 60, 3);
    	LivingMstObj.exportToPDF().click();
    	// seleniumactions.getBrowserHelper().SwitchToWindow(1);
    	String UserDirectory = System.getProperty("user.dir");
    	System.out.println(UserDirectory);
    	String substring = UserDirectory.substring(0, 21) + "Downloads";
    	substring.replaceAll("/", "//");
    	System.out.println(substring);
    	File file = new File(substring);
    	File[] totalfiles = file.listFiles();
    	int length = totalfiles.length;
    	int i = 0;
    	for (File fileName : totalfiles) {
    		if (fileName.getName().equalsIgnoreCase("AllocationMasterFormDataFile.pdf")) {
    			System.out.println("Downloaded file present in system");
    			break;
    		} else if (i == length - 1) {
    			System.out.println("Downloaded file present does not exist in system");
    		}

    	}
    	action.getBrowserHelper().switchToParentWithChildClose();
    }
    
   
    @Then("^To verify the functionality of Export to Excel button in Living Expense location$")
    public void to_verify_the_functionality_of_export_to_excel_button_in_living_expense_location() throws Throwable {
    	for (int i = 0; i < 20; i++) {
    		try {
    			LivingMstObj.exportIcon().click();
    			break;
    		} catch (Exception e) {

    		}
    	}
    	        action.getClickAndActionsHelper().moveToElement(LivingMstObj.exportToExcel());
    	        LivingMstObj.exportToExcel().click();
    Thread.sleep(2000);
    	
    	
    	String UserDirectory = System.getProperty("user.dir");
        //System.out.println(UserDirectory);
        String substring = UserDirectory.substring(0, 21) + "Downloads";
        substring.replaceAll("/", "//");
        System.out.println(substring);
        File file = new File(substring);
        File[] totalfiles = file.listFiles();
        for (File fileName : totalfiles) {
            System.out.println("File name" + fileName);
            xlsList.add(fileName.toString());
        }
    }

    }

    
   


    


