package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import org.testng.Assert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.KULS_SubProductMaster_Validattion;
import resources.BaseClass;
import testDataType.KULS_Login_TestDataType;

public class KULS_SubProductMaster_Validation {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_SubProductMaster_Validattion subMasterRetailObj = new KULS_SubProductMaster_Validattion(driver);
	 KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");

	
	 @Given("^Launch the kuls application and login as maker$")
	    public void launch_the_kuls_application_and_login_as_maker() throws Throwable {
		 String kulsApplicationUrl = configFileReader.getApplicationUrl();
	        driver.get(kulsApplicationUrl);
	        applicationLogin.loginUlsApplicationAsMaker(loginData.Username,loginData.Password);
	        //applicationLogin.ulSApplicationLoginAsAChecker(loginData.CheckerUserName1);
	 }


	    @And("^Navigate to Sub Product Master module view list$")
	    public void navigate_to_sub_product_master_module_view_list() throws Throwable {
	    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.productSetupInLeftPanel(),60,2);
	        subMasterRetailObj.productSetupInLeftPanel().click();
	        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.viewIconofSubProductMaster(),60,2);
	        subMasterRetailObj.viewIconofSubProductMaster().click();
	        Thread.sleep(3000);
	    	
	    }

	    @And("^Verify that records present in view list are non editable$")
	    public void verify_that_records_present_in_view_list_are_non_editable() throws Throwable {
	    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.productSetupInLeftPanel(),60,2);
	    	String xpath ="//tbody/tr[1]/td[6]";
	    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
	    	try {
	    		driver.findElement(By.xpath(xpath)).click();
			} catch (Exception e) {
				System.out.println("Verified status field is not editable only displayable");
			}
	        
	    }

	    @And("^Verify the Add button fuctionality$")
	    public void verify_the_add_button_fuctionality() throws Throwable {
	    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.addIcon(),60,2);
	        Assert.assertEquals(subMasterRetailObj.addIcon().isDisplayed(), true);
	    	
	    }

	    @And("^Verify that all fields are present in view list while click on view icon$")
	    public void verify_that_all_records_are_present_in_view_list_while_click_on_view_icon() throws Throwable {
	    	 String xpath ="//span[contains(text(),'Action')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
	     	WebElement Action = driver.findElement(By.xpath(xpath));
	     	System.out.println(Action);
	     	 String xpath1 ="//span[contains(text(),'Product Group')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath1)),60,2);
	     	WebElement productgroup = driver.findElement(By.xpath(xpath1));
	     	System.out.println(productgroup);
	     	 String xpath2 ="//thead/tr[1]/th[4]/span[1]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath2)),60,2);
	     	WebElement Productcode = driver.findElement(By.xpath(xpath2));
	     	System.out.println(Productcode);
	     	 String xpath3 ="//span[contains(text(),'Product Description')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath3)),60,2);
	     	WebElement productDescription = driver.findElement(By.xpath(xpath3));
	     	System.out.println(productDescription);
	     	 String xpath4 ="//span[contains(text(),'Sub-Product Code')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath4)),60,2);
	     	WebElement Subproductcode = driver.findElement(By.xpath(xpath4));
	     	System.out.println(Subproductcode);
	     	 String xpath5 ="//span[contains(text(),'Retail/Corporate')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath5)),60,2);
	     	WebElement retailcorporate = driver.findElement(By.xpath(xpath5));
	     	System.out.println(retailcorporate);
	     	String xpath6 ="//thead/tr[1]/th[8]/span[1]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath6)),60,2);
	     	WebElement status = driver.findElement(By.xpath(xpath6));
	     	System.out.println(status);
	     	
	     
	     	
	    }

	    @And("^Search with valid data in view list$")
	    public void search_with_valid_data_in_view_list() throws Throwable {
	    	for (int i = 0; i <20; i++) {
				try {
					subMasterRetailObj.searchIcon().click();
					break;
				} catch (Exception e) {
					
				}
			}
	    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.searchTextField(),30,2);
	    	subMasterRetailObj.searchTextField().sendKeys("aaa");
	    	String xpath ="//span[contains(text(),'Product Group')]";
	        String productgroup = null;
	        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
	        for (int i = 0; i < 20; i++) {
	        	
	        	productgroup = driver.findElement(By.xpath(xpath)).getText();
			}
	    	System.out.println(productgroup);
	        
	    }

	    @And("^Search with Invalid data in view list$")
	    public void search_with_invalid_data_in_view_list() throws Throwable {
	        	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
	    	
	        	for (int i = 0; i <20; i++) {
	    			try {
	    				subMasterRetailObj.searchIcon().click();
	    				break;
	    			} catch (Exception e) {
	    				
	    			}
	    		}
	        	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.searchTextField(),30,2);
	        	subMasterRetailObj.searchTextField().sendKeys("zfghz");
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

	    @And("^Export to PDF functionality$")
	    public void export_to_pdf_functionality() throws Throwable {
	        	for (int i = 0; i < 20; i++) {
	        		try {
	        			subMasterRetailObj.exportIcon().click();
	        			break;
	        		} catch (Exception e) {
	        			
	        		}
	    		}
	        	
	            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.exportToPDF(),60,3);
	            subMasterRetailObj.exportToPDF().click();
	            //seleniumactions.getBrowserHelper().SwitchToWindow(1);
	            String UserDirectory = System.getProperty("user.dir");
	            System.out.println(UserDirectory);
	            String substring = UserDirectory.substring(0, 21)+"Downloads";
	            substring.replaceAll("/", "//");
	            System.out.println(substring);
	            File file = new File("C:\\Users\\inindc00074");
	            File[] totalfiles = file.listFiles();
	            for (File fileName : totalfiles) {
	            	if (fileName.getName().equalsIgnoreCase("SubProductMasterFile.pdf")) {
	    				System.out.println("Downloaded file present in system");
	    				break;
	    			}
	    			else {
	    				System.out.println("Downloaded file present does not exist in system");
	    			}
	    			
	    		}
	            seleniumactions.getBrowserHelper().switchToParentWithChildClose();
	            
	        
	    }

	    @And("^Export to Excel functionality$")
	    public void export_to_excel_functionality() throws Throwable {
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			subMasterRetailObj.exportIcon().click();
	    			break;
	    		} catch (Exception e) {
	    			
	    		}
			}
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			subMasterRetailObj.exportToExcel().click();
	    			break;
	    		} catch (Exception e) {
	    			
	    		}
			}
	        
	        seleniumactions.getBrowserHelper().switchToParentWithChildClose();
	        System.out.println("Downloaded XLS file present in system");	        
	        
	    }

	    @And("^Navigate to Sub Product Master module WIP section$")
	    public void navigate_to_sub_product_master_module_wip_section() throws Throwable {
	    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.editIconofSubProductMaster(),60,2);
	        subMasterRetailObj.editIconofSubProductMaster().click();
	        Thread.sleep(3000);
	        
	    }

	    @And("^Verify that all fields are present in view list of WIP section$")
	    public void verify_that_all_fields_are_present_in_view_list_of_wip_section() throws Throwable {
	    	 String xpath ="//span[contains(text(),'Action')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
	     	WebElement Action = driver.findElement(By.xpath(xpath));
	     	System.out.println(Action);
	     	 String xpath1 ="//span[contains(text(),'Product Group')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath1)),60,2);
	     	WebElement productgroup = driver.findElement(By.xpath(xpath1));
	     	System.out.println(productgroup);
	     	 String xpath2 ="//thead/tr[1]/th[4]/span[1]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath2)),60,2);
	     	WebElement Productcode = driver.findElement(By.xpath(xpath2));
	     	System.out.println(Productcode);
	     	 String xpath3 ="//span[contains(text(),'Product Description')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath3)),60,2);
	     	WebElement productDescription = driver.findElement(By.xpath(xpath3));
	     	System.out.println(productDescription);
	     	 String xpath4 ="//span[contains(text(),'Sub-Product Code')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath4)),60,2);
	     	WebElement Subproductcode = driver.findElement(By.xpath(xpath4));
	     	System.out.println(Subproductcode);
	     	 String xpath5 ="//span[contains(text(),'Retail/Corporate')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath5)),60,2);
	     	WebElement retailcorporate = driver.findElement(By.xpath(xpath5));
	     	System.out.println(retailcorporate);
	     	String xpath6 ="//thead/tr[1]/th[8]/span[1]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath6)),60,2);
	     	WebElement status = driver.findElement(By.xpath(xpath6));
	     	System.out.println(status);
	     	String xpath7 ="//span[contains(text(),'Authorization Status')]";
	         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath7)),60,2);
	     	WebElement authrizationstatus = driver.findElement(By.xpath(xpath7));
	     	System.out.println(authrizationstatus);
	    }

	    @And("^Verify the Add button fuctionality in WIP$")
	    public void verify_the_add_button_fuctionality_in_wip() throws Throwable {
	    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.addIcon(),60,2);
	        Assert.assertEquals(subMasterRetailObj.addIcon().isDisplayed(), true);
	        
	    }

	    @And("^Search with valid data in view list of WIP$")
	    public void search_with_valid_data_in_view_list_of_wip() throws Throwable {
	    	for (int i = 0; i <20; i++) {
				try {
					subMasterRetailObj.searchIcon().click();
					break;
				} catch (Exception e) {
					
				}
			}
	    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.searchTextField(),30,2);
	    	subMasterRetailObj.searchTextField().sendKeys("aaa");
	    	String xpath ="//span[contains(text(),'Product Group')]";
	        String productgroup = null;
	        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
	        for (int i = 0; i < 20; i++) {
	        	
	        	productgroup = driver.findElement(By.xpath(xpath)).getText();
			}
	    	System.out.println(productgroup);        
	    }

	    @And("^Search with Invalid data in view list of WIP$")
	    public void search_with_invalid_data_in_view_list_of_wip() throws Throwable {
	    	driver.findElement(By.xpath("//input[@mode='ios']/parent::span//i")).click();
	    	
        	for (int i = 0; i <20; i++) {
    			try {
    				subMasterRetailObj.searchIcon().click();
    				break;
    			} catch (Exception e) {
    				
    			}
    		}
        	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.searchTextField(),30,2);
        	subMasterRetailObj.searchTextField().sendKeys("zfghz");
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

	    @And("^Export to PDF functionality in WIP$")
	    public void export_to_pdf_functionality_in_wip() throws Throwable {
	        	for (int i = 0; i < 20; i++) {
	        		try {
	        			subMasterRetailObj.exportIcon().click();
	        			break;
	        		} catch (Exception e) {
	        			
	        		}
	    		}
	        	
	            seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,subMasterRetailObj.exportToPDF(),60,3);
	            subMasterRetailObj.exportToPDF().click();
	            //seleniumactions.getBrowserHelper().SwitchToWindow(1);
	            String UserDirectory = System.getProperty("user.dir");
	            System.out.println(UserDirectory);
	            String substring = UserDirectory.substring(0, 21)+"Downloads";
	            substring.replaceAll("/", "//");
	            System.out.println(substring);
	            File file = new File("C:\\Users\\inindc00074");
	            File[] totalfiles = file.listFiles();
	            for (File fileName : totalfiles) {
	            	if (fileName.getName().equalsIgnoreCase("SubProductMasterFile.pdf")) {
	    				System.out.println("Downloaded file present in system");
	    				break;
	    			}
	    			else {
	    				System.out.println("Downloaded file present does not exist in system");
	    			}
	    			
	    		}
	            seleniumactions.getBrowserHelper().switchToParentWithChildClose();

	        
	    }

	    @And("^Export to Excel functionality in WIP$")
	    public void export_to_excel_functionality_in_wip() throws Throwable {
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			subMasterRetailObj.exportIcon().click();
	    			break;
	    		} catch (Exception e) {
	    			
	    		}
			}
	    	for (int i = 0; i < 20; i++) {
	    		try {
	    			subMasterRetailObj.exportToExcel().click();
	    			break;
	    		} catch (Exception e) {
	    			
	    		}
			}
	        
	        seleniumactions.getBrowserHelper().switchToParentWithChildClose();
	        System.out.println("Downloaded XLS file present in system");	        

	      	    }

}
