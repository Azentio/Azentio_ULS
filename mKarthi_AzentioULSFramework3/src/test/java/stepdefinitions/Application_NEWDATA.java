package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.*;
import pageobjects.ApplicationdetailNEWAPP_Obj;
import resources.BaseClass;
import testDataType.ApplicationDetails_NEWAPPTestData;
import testDataType.KULS_Login_TestDataType;

public class Application_NEWDATA extends BaseClass{
	  WebDriver driver = BaseClass.driver;
	  KULS_Application_Login login = new KULS_Application_Login(driver);
	  JsonConfig jsonConfig = new JsonConfig();
	  ConfigFileReader configFileReader = new ConfigFileReader();
	  KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	  ApplicationdetailNEWAPP_Obj appNewObj = new ApplicationdetailNEWAPP_Obj(driver);
	  ApplicationDetails_NEWAPPTestData applicationDetailsNEWAPPTestData = jsonConfig.getApplicationDetailsNEWAPPListByName("Maker");
	  Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	@Given("^user login as a cent bank uls application$")
	public void user_login_as_a_cent_bank_uls_application() throws Throwable {
		
	    String loanTransactionApplicationUrl = configFileReader.getApplicationUrlTransactions();
	    driver.get(loanTransactionApplicationUrl);
	    login.loginUlsApplicationAsMaker(loginData.Username2,loginData.Password);
	}
	@When("^user click the inbox icon for application new app$")
	public void user_click_the_inbox_icon_for_application_new_app() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.Inbox_Icon(),60, 2);
	    appNewObj.Inbox_Icon().click();
	}
	@And("^User search new app record in the inbox list view$")
	public void user_search_new_app_record_in_the_inbox_list_view() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.Application_DetailTab_SearchButtons(),60, 2);
	    appNewObj.Application_DetailTab_SearchButtons().click();
	    seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.Application_DetailTab_SearchText(),60, 2);
	    appNewObj.Application_DetailTab_SearchText().click();
	    appNewObj.Application_DetailTab_SearchText().sendKeys("NEWAPP");
	    
	}
	@And("^User click the first edit icon of new app record$")
	public void user_click_the_first_edit_icon_of_new_app_record() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NewApp_ActionIcon(),60,2);
	    appNewObj.NewApp_ActionIcon().click();
	}
	@And("^User click and update primary product$")
	public void user_click_and_update_primary_product() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_primaryProduct(),60,2);
		appNewObj.NEWAPP_primaryProduct().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.PrimaryProduct+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}
	@And("^User click and update primary sub product$")
	public void user_click_and_update_primary_sub_product() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_primarysubProduct(),60,2);
		appNewObj.NEWAPP_primarysubProduct().click();
		String xpath= "//ion-label[contains(text(),' "+applicationDetailsNEWAPPTestData.PrimarySubProduct+" ')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}
	@And("^User click and update Total Finance Amount Requested$")
	public void user_click_and_update_total_finance_amount_requested() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_TotalFinanceAmountRequested(),60,2);
		appNewObj.NEWAPP_TotalFinanceAmountRequested().clear();
		for (int i = 0; i <30; i++) {
			try {
				appNewObj.NEWAPP_TotalFinanceAmountRequested().sendKeys(applicationDetailsNEWAPPTestData.TotalFinanceAmount);
				break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("^User click and update Declared Net Income$")
	public void user_click_and_update_declared_net_income() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_DeclaredNetIncome(),60,2);
		appNewObj.NEWAPP_DeclaredNetIncome().clear();
		for (int i = 0; i <30; i++) {
			try {
				appNewObj.NEWAPP_DeclaredNetIncome().sendKeys(applicationDetailsNEWAPPTestData.DeclaredNetAmount);
				break;
			} catch (Exception e) {
				
			}
		}
	}
	@And("^User click and update Declared Current Obligations$")
	public void user_click_and_update_declared_current_obligations() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_DeclaredCurrentObligations(),60,2);
		appNewObj.NEWAPP_DeclaredCurrentObligations().clear();
		for (int i = 0; i <30; i++) {
			try {
				appNewObj.NEWAPP_DeclaredCurrentObligations().sendKeys(applicationDetailsNEWAPPTestData.DeclaredCurrentObligation);
				break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("^User click and update Special Promotion Campaign$")
	public void user_click_and_update_special_promotioncampaign() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_SpecialPromotion(),60,2);
		appNewObj.NEWAPP_SpecialPromotion().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.SpecialPromotionCampaign+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}



	@And("^User click and update Sourcing Channel$")
	public void user_click_and_update_sourcing_channel() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_SourcingChannel(),60,2);
		appNewObj.NEWAPP_SourcingChannel().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.SourcingChannel+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}



	@And("^User click and update Business Center Corporate Banking$")
	public void user_click_and_update_business_centercorporate_banking() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_BusinessCenterCode(),60,2);
		appNewObj.NEWAPP_BusinessCenterCode().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.BusinessCenterCode+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}



	@And("^User click and update Servicing Type$")
	public void user_click_and_update_servicing_type() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_ServicingType(),60,2);
		appNewObj.NEWAPP_ServicingType().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.ServicingType+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}



	@And("^User click and update Servicing Entity$")
	public void user_click_and_update_servicing_entity() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_ServicingEntity(),60,2);
		appNewObj.NEWAPP_ServicingEntity().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.ServicingEntity+"')]/parent::ion-item//ion-radio";
		System.out.println(applicationDetailsNEWAPPTestData.ServicingEntity);
		for (int i = 0; i <60; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}



	@And("^User click and update Servicing Branch$")
	public void user_click_and_update_servicing_branch() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_ServicingBranch(),60,2);
		appNewObj.NEWAPP_ServicingBranch().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.ServicingBranch+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("^User click and update Closing Staff or Servicing Staff or RM$")
	public void user_click_and_update_closing_staff_or_servicing_staff_or_rm() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_ClosingStaff(),60,2);
		appNewObj.NEWAPP_ClosingStaff().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.ClosingStafforServicingStafforRM+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}
	@And("^User click and update Sourcing Type$")
    public void user_click_and_update_sourcing_type() throws Throwable {
		seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_SourcingType());
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_SourcingType(),60,2);
		appNewObj.NEWAPP_SourcingType().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.SourcingType+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
    }
	@And("^User click and update Sourcing Staff$")
	public void user_click_and_update_sourcing_staff() throws Throwable {
		seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_SourcingStaff());
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_SourcingStaff(),60,2);
		appNewObj.NEWAPP_SourcingStaff().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.SourcingStaff+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("^User click and update Sourcing Entity$")
	public void user_click_and_update_sourcing_entity() throws Throwable {
		seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_SourcingEntity());
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_SourcingEntity(),60,2);
		appNewObj.NEWAPP_SourcingEntity().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.SourcingEntity+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("^User click and update Sourcing Office$")
	public void user_click_and_update_sourcing_office() throws Throwable {
		seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_SourcingOffice());
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_SourcingOffice(),60,2);
		appNewObj.NEWAPP_SourcingOffice().click();
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.SourcingOffice+"')]//following-sibling::ion-radio";
		System.out.println(applicationDetailsNEWAPPTestData.SourcingOffice);
		for (int i = 0; i <30; i++) {
			try {
				seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}

	@And("^User click and update Reference Type$")
	public void user_click_and_update_reference_type() throws Throwable {
		seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_ReferenceType());
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_ReferenceType(),60,2);
		appNewObj.NEWAPP_ReferenceType().click();
		String xpath= "//ion-label[text()=' "+applicationDetailsNEWAPPTestData.ReferenceType+" ']//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}
	@And("^User click and update Reference Entity$")
	public void user_click_and_update_reference_entity() throws Throwable {
		
		seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_ReferenceEntity());
		//seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_ReferenceEntity(),60,2);
		for (int i = 0; i <30; i++) {
			try {
				appNewObj.NEWAPP_ReferenceEntity().click();
				break;
			} catch (Exception e) {
				
			}
		}
		String xpath= "//ion-label[contains(text(),'"+applicationDetailsNEWAPPTestData.ReferenceEntity+"')]//following-sibling::ion-radio";
		for (int i = 0; i <30; i++) {
			try {
				
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				
			}
		}
	}
	@And("^User click and update Reference Code$")
	public void user_click_and_update_reference_code() throws Throwable {
		seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_ReferenceCode());
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_ReferenceCode(),60,2);
		appNewObj.NEWAPP_ReferenceCode().clear();
		for (int i = 0; i <30; i++) {
			try {
				appNewObj.NEWAPP_ReferenceCode().sendKeys(applicationDetailsNEWAPPTestData.ReferenceCode);
				break;
			} catch (Exception e) {
				
			}
		}
	}
	@And("^User verify the updated primary product$")
    public void user_verify_the_updated_primary_product() throws Throwable {
		String xpath= "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.PrimaryProduct+" ,  Primary Product *']";
		//seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),30, 2);
		for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
		
    }
   @And("^User verify the updated primary sub product$")
    public void user_verify_the_updated_primary_sub_product() throws Throwable {
	   String xpath= "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.PrimarySubProduct+" ,  Primary Sub Product *']";
	  // seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),30, 2);
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
	   
    }
   @And("^User verify the updated Total Finance Amount Requested$")
    public void user_verify_the_updated_total_finance_amount_requested() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_TotalFinanceAmountRequestedText(),60, 2);
        Assert.assertEquals(applicationDetailsNEWAPPTestData.TotalFinanceAmount,appNewObj.NEWAPP_TotalFinanceAmountRequestedText().getAttribute("ng-reflect-model"));
    }
   @And("^User verify the updated Declared Net Income$")
    public void user_verify_the_updated_declared_net_income() throws Throwable {
	   seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_DeclaredNetIncomeText(),60, 2);
       Assert.assertEquals(applicationDetailsNEWAPPTestData.DeclaredNetAmount,appNewObj.NEWAPP_DeclaredNetIncomeText().getAttribute("ng-reflect-model"));
    }
   @And("^User verify the updated Declared Current Obligations$")
    public void user_verify_the_updated_declared_current_obligations() throws Throwable {
	   seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_DeclaredCurrentObligationsText(),60, 2);
       Assert.assertEquals(applicationDetailsNEWAPPTestData.DeclaredCurrentObligation,appNewObj.NEWAPP_DeclaredCurrentObligationsText().getAttribute("ng-reflect-model"));
    }
   @And("^User verify the updated Special Promotion Campaign$")
    public void user_verify_the_updated_special_promotion_campaign() throws Throwable {
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.SpecialPromotionCampaign+" ,  Special Promotion/Campaign ']";
	  // seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),30, 2);
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
	   
    }
   @And("^User verify the updated Sourcing Channel$")
    public void user_verify_the_updated_sourcing_channel() throws Throwable {
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.SourcingChannel+" ,  Sourcing Channel *']";
	  // seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),30, 2);
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
	  
    }
   @And("^User verify the updated Business Center Corporate Banking$")
    public void user_verify_the_updated_business_center_corporate_banking() throws Throwable {
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.BusinessCenterCode+" ,  Buisness Center Code ']";
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }
   @And("^User verify the updated Servicing Type$")
    public void user_verify_the_updated_servicing_type() throws Throwable {
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.ServicingType+" ,  Servicing Type *']";
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }
   @And("^User verify the updated Servicing Entity$")
    public void user_verify_the_updated_servicing_entity() throws Throwable {
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.ServicingEntity+" ,  Servicing Entity *']";
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }
   @And("^User verify the updated Servicing Branch$")
    public void user_verify_the_updated_servicing_branch() throws Throwable {
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.ServicingBranch+" ,  Servicing Branch *']";
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }
   @And("^User verify the updated Closing Staff or Servicing Staff or RM$")
    public void user_verify_the_updated_closing_staff_or_servicing_staff_or_rm() throws Throwable {
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.ClosingStafforServicingStafforRM+" ,  Closing Staff or Servicing Staff or RM *']";
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }
   @And("^User verify the updated Sourcing Type$")
    public void user_verify_the_updated_sourcing_type() throws Throwable {
	   seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_SourcingType());
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.SourcingType+" ,  Sourcing Type *']";
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }
   @And("^User verify the updated Sourcing Staff$")
    public void user_verify_the_updated_sourcing_staff() throws Throwable {
	   seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_SourcingStaff());
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.SourcingStaff+" ,  Sourcing Staff *']";
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }
   @And("^User verify the updated Sourcing Entity$")
    public void user_verify_the_updated_sourcing_entity() throws Throwable {
	   seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_SourcingEntity());
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.SourcingEntity+" ,  Sourcing Entity *']";
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }
   @And("^User verify the updated Sourcing Office$")
    public void user_verify_the_updated_sourcing_office() throws Throwable {
	   seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_SourcingOffice());
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.SourcingOffice+" ,  Sourcing Office *']";
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }
   @And("^User verify the updated Reference Type$")
    public void user_verify_the_updated_reference_type() throws Throwable {
	   seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_ReferenceType());
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.ReferenceType+" ,  Reference Type ']";
	   seleniumActions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath(xpath)));
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }

   @And("^User verify the updated Reference Entity$")
    public void user_verify_the_updated_reference_entity() throws Throwable {
	   seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.NEWAPP_ReferenceEntity());
	   String xpath = "//ion-select[@aria-label=' "+applicationDetailsNEWAPPTestData.ReferenceEntity+" ,  Reference Entity ']";
	   for (int i = 0; i <30; i++) {
			try {
				Assert.assertEquals(true, driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (NoSuchElementException e) {
				
			}
		}
    }

   @And("^User verify the updated Reference Code$")
    public void user_verify_the_updated_reference_code() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.NEWAPP_ReferenceCodeText(),30, 2);
        Assert.assertEquals(applicationDetailsNEWAPPTestData.ReferenceCode,appNewObj.NEWAPP_ReferenceCodeText().getAttribute("ng-reflect-model"));
    }
   @And("^User click save button in Application details NEW APP and verify$")
   public void user_click_save_button_in_application_details_new_app_and_verify() throws Throwable {
	   seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.ApplicationDetailsSaveIcon());
       seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.ApplicationDetailsSaveIcon(),60,2);
       appNewObj.ApplicationDetailsSaveIcon().click();
       seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.successMgs(),60,2);
       Assert.assertEquals(appNewObj.successMgs().isDisplayed(), true);
   }
   @And("^user close the searched text New app$")
   public void user_close_the_searched_text_new_app() throws Throwable {
      seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.Application_DetailTab_SearchTextClose(),30, 2);
      appNewObj.Application_DetailTab_SearchTextClose().click();
      
   }
   @And("^user click submit in appdetails new data$")
   public void user_click_submit_in_appdetails_new_data() throws Throwable {
	   seleniumActions.getJavascriptHelper().scrollIntoView(appNewObj.Application_NewApp_SubmitButton());
     seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.Application_NewApp_SubmitButton(),60, 2);
     appNewObj.Application_NewApp_SubmitButton().click();
   }
   @And("^user enter remark in appdetails new data$")
   public void user_enter_remark_in_appdetails_new_data() throws Throwable {
	   seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.Application_NewApp_SubmitAlertButton(),60, 2);
	   appNewObj.Application_NewApp_SubmitAlertButton().click();
   }

  @And("^user click the final submit and verify pop up message$")
   public void user_click_the_final_submit_and_verify_pop_up_message() throws Throwable {
	  seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.Application_NewApp_SubmitFinalButton(),60, 2);
	   appNewObj.Application_NewApp_SubmitFinalButton().click();
	   seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,appNewObj.successMgs(),30, 2);
	   Assert.assertEquals(" Record APPROVED Successfully, and Current Stage is APPDATAENT with status PENDING from in02040. ",appNewObj.successMgs().getText());
   }

}
