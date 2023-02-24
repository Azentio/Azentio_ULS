package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.Asset_CD_MasterOBJ;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;

public class KULS_Asset_CD_MasterCheckerApprove extends BaseClass {
	
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Checker");
	WaitHelper help = new WaitHelper(driver);
	KULS_Login login = new KULS_Login();
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	Asset_CD_MasterOBJ assetcd = new Asset_CD_MasterOBJ(driver);
	FindFieldisMandatoryorNot mandatoryornot = new FindFieldisMandatoryorNot(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00071\\Downloads\\TestDataDesignSampleNew.xlsx","AssetCDMasterTestData","Data Set ID");
	Map<String, String> testData;
	
	
	@Given("^User login as uls checker in asset CD master$")
    public void user_login_as_uls_checker_in_asset_cd_master() throws Throwable {
		
		String kulsApplicationUrl = configFileReader.getULSApplicationCenBankUrl();
        driver.get(kulsApplicationUrl);
        //System.out.println(json.readdata());
        testData = excelData.getTestdata("AT-ACD-T001_D1");
        System.out.println(testData.get("Checker id"));
        applicationLogin.ulSApplicationLoginAsAChecker(testData.get("Checker id"));
        
		
        
    }

    @Then("^User enter the popup remarks in asset CD master checker$")
    public void user_enter_the_popup_remarks_in_asset_cd_master_checker() throws Throwable {
        
    }

    @Then("^User verify the Record got Approved in asset CD checker$")
    public void user_verify_the_record_got_approved() throws Throwable {
    	
       help.waitForElementToVisibleWithFluentWait(driver, assetcd.recordMsgChecker(), 60, 2);
  	   String Toast;
  	   Toast = assetcd.recordMsgChecker().getText();
  	   System.out.println(Toast);
  	   Assert.assertEquals(Toast, "Record APPROVED Successfully");
        
    }


    @And("^User click the inboxicon in asset CD master checker$")
    public void user_click_the_inboxicon_in_asset_cd_master_checker() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.inboxiconChecker(), 60, 2);
		assetcd.inboxiconChecker().click();
        
    }

    @And("^User search the respective reference id and click on Action button in asset CD master$")
    public void user_search_the_respective_reference_id_and_click_on_action_button_in_asset_cd_master() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T001_D1");
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

    @And("^User click on Approve icon in asset CD master checker$")
    public void user_click_on_approve_icon_in_asset_cd_master_checker() throws Throwable {
    	
    	Thread.sleep(2000);
    	
    	//help.waitForElementToVisibleWithFluentWait(driver, assetcd.CheckerApprove(), 60, 2);
		for(int i=0; i<40; i++) {
			try {
				seleniumactions.getClickAndActionsHelper().moveToElement(assetcd.CheckerApprove());
				assetcd.CheckerApprove().click();
				break;
			} catch (Exception e) {
				
			}
		}
    	
        
    }

    @And("^User click the popup remarks in asset CD master checker$")
    public void user_click_the_popup_remarks_in_asset_cd_master_checker() throws Throwable {
    	
    	testData = excelData.getTestdata("AT-ACD-T002_D1");
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 2);
		assetcd.popupremark().click();
		assetcd.popupremark().sendKeys(testData.get("Popup Remark Approve"));
        
    }

    @And("^User click the popup approve in asset CD master checker$")
    public void user_click_the_popup_approve_in_asset_cd_master_checker() throws Throwable {
    	
    	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupapprove(), 60, 2);
		assetcd.popupapprove().click();
        
    }
    
    // verify approve record
    
    @And("^Click the Asset CD Master setup eye icon in Asset CD master$")
    public void click_the_project_setup_eye_icon_in_project_master_for_validation() throws Throwable {
	
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.assetcdmastereyeicon(), 60, 2);
	assetcd.assetcdmastereyeicon().click();
        
	
    }

@Then("^User validate the updated record in list view in Asset CD master$")
public void user_validate_the_updated_record_in_list_view() throws Throwable {
    //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'" + subProductMasterRetailData.ProductCode + "')]")), 60, 2);
	testData = excelData.getTestdata("AT-ACD-T001_D1");
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

    //seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("//span[contains(text(),'" + subProductMasterRetailData.SubProductCode + "')]")), 60, 2);
//    for (int i = 0; i <20; i++) {
//        try {
//            String validate1 = driver.findElement(By.xpath("//span[contains(text(),'" + assetjson.ProjectName + "')]")).getText();
//            System.out.println(validate1);
//            Assert.assertEquals(validate1, assetjson.ProjectName);
//            break;
//        } catch (NoSuchElementException e) {
//
//        }
//    }

}

// Checker Reject and verification

@And("^User click the reject icon in asset CD master checker$")
public void User_click_the_reject_icon_in_asset_CD_master_checker() throws Throwable {
	
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.CheckerReject(), 60, 2);
	assetcd.CheckerReject().click();
    
}

@And("^User enter the reject remark in asset CD master checker$")
public void User_enter_the_reject_remark_in_asset_CD_master_checker$() throws Throwable {
	
	testData = excelData.getTestdata("AT-ACD-T003_D1");
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 2);
	assetcd.popupremark().click();
	assetcd.popupremark().sendKeys(testData.get("Popup Remark Reject"));
	
    
}

@And("^User click the final reject icon in asset CD master checker$")
public void User_click_the_final_reject_icon_in_asset_CD_master_checker() throws Throwable {
	
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupreject(), 60, 2);
	assetcd.popupreject().click();
	
	
    
}

@Then("^User verify the Record got Rejected in asset CD checker$")
public void user_verify_the_record_got_Rejected() throws Throwable {
	
   help.waitForElementToVisibleWithFluentWait(driver, assetcd.recordMsgChecker(), 60, 2);
	   String Toast;
	   Toast = assetcd.recordMsgChecker().getText();
	   System.out.println(Toast);
	   Assert.assertEquals(Toast, "Record REJECTED Successfully");
}

@And("^User verify the rejected record removed from the system in asset CD master$")
public void user_verify_the_rejected_record_removed_from_the_system() throws Throwable {
	testData = excelData.getTestdata("AT-ACD-T001_D1");
	for (int i = 0; i <20; i++) {
        try {
        	assetcd.searchiconreferenceid().click();
            break;
        } catch (Exception e) {

        }
    }

        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetcd.searchsentkeys(),60,2);
        
        assetcd.searchsentkeys().sendKeys(testData.get("Reference ID"));
        
        String xpath ="//td[contains(text(),' ASSET_CD_MST ')]/preceding-sibling::td[1]/span[contains(text(),'"+json.readReferancedata()+"')]";
        for (int i = 0; i < 200; i++) {
            try {
                Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), false);
                break;
            } catch (NoSuchElementException e) {

            }
        }

}

// Asset CD Master Return record

@And("^User click the return icon in asset CD master checker$")
public void user_click_on_return_icon() throws Throwable {
	
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.CheckerReturn(), 60, 2);
	assetcd.CheckerReturn().click();
    
}

@And("^User enter the return remark in asset CD master checker$")
public void user_enter_the_remark_for_return_the_record() throws Throwable {
	
	testData = excelData.getTestdata("AT-ACD-T004_D1");
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupremark(), 60, 2);
	assetcd.popupremark().click();
	assetcd.popupremark().sendKeys(testData.get("Popup Remark Return"));
	
    
}

@And("^User click the final return icon in asset CD master checker$")
public void user_click_the_final_return_button() throws Throwable {
	
	help.waitForElementToVisibleWithFluentWait(driver, assetcd.popupReturn(), 60, 2);
	assetcd.popupReturn().click();
	
	
    
}
@And("^User verify the returned record removed from the system in asset CD master$")
public void user_verify_the_returned_record_removed_from_the_system() throws Throwable {
    
	testData = excelData.getTestdata("AT-ACD-T001_D1");
	for (int i = 0; i <20; i++) {
        try {
        	assetcd.searchiconreferenceid().click();
            break;
        } catch (Exception e) {

        }
    }

        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,assetcd.searchsentkeys(),60,2);
        
        assetcd.searchsentkeys().sendKeys(testData.get("Reference ID"));
        String xpath ="//td[contains(text(),' ASSET_CD_MST ')]/preceding-sibling::td[1]/span[contains(text(),'"+json.readReferancedata()+"')]";
        for (int i = 0; i < 200; i++) {
            try {
                Assert.assertEquals(driver.findElement(By.xpath(xpath)).isDisplayed(), true);
                break;
            } catch (NoSuchElementException e) {

            }
        }
}
@Then("^User verify the Record got Returned in asset CD checker$")
public void user_verify_the_record_got_Returned() throws Throwable {
	
   help.waitForElementToVisibleWithFluentWait(driver, assetcd.recordMsgChecker(), 60, 2);
	   String Toast;
	   Toast = assetcd.recordMsgChecker().getText();
	   System.out.println(Toast);
	   Assert.assertEquals( true, Toast.contains("Record RETURNED Successfully"));
	   
	   
}





    

	
	

}
