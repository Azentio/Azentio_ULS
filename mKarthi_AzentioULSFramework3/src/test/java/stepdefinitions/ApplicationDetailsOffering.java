package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.BrowserHelper;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationDetailsOfferingObj;
import pageobjects.CustomerPersonalDetailOfferingObj;
import pageobjects.KULS_LoginObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.ApplicationDetailsOfferingTestDataType;
import testDataType.CustomerPersonalDetailOfferingTestDataType;
import testDataType.KULS_Login_TestDataType;

public class ApplicationDetailsOffering {

	WebDriver driver = BaseClass.driver;
	WaitHelper waithelper = new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Login_TestDataType ulsUserLoginCredentials = jsonConfig.getKULSLoginCredentialsByName("Checker");
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	KULS_LoginObj loginObj;
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	String referenceID;
	ApplicationDetailsOfferingObj applicationDetailsOfferingObj = new ApplicationDetailsOfferingObj(driver);
	ApplicationDetailsOfferingTestDataType applicationDetailsOfferingTestDataType = jsonConfig.getApplicationDetailsOfferingByName("Maker");
	SoftAssert softAssert = new SoftAssert();
	@Then("^user should click on menu toggle$")
	public void user_should_click_on_menu_toggle() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_Maker_MenuToggle());
		applicationDetailsOfferingObj.applicationDetailsOffering_Maker_MenuToggle().click();
	}

	@Then("^click on inbox to search for the Application details offering record$")
	public void click_on_inbox_to_search_for_the_Application_details_offering_record() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_Inbox());
		applicationDetailsOfferingObj.applicationDetailsOffering_Inbox().click();
	}

	@Then("^click on search button to search the record of Application details offering$")
	public void click_on_search_button_to_search_the_record_of_Application_details_offering() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_SearchInbox());
		applicationDetailsOfferingObj.applicationDetailsOffering_SearchInbox().click();
	}

	@Then("^enter the reference id of the Application details offering record$")
	public void enter_the_reference_id_of_the_Application_details_offering_record() throws Throwable {
		
		waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_SearchInboxInputField());
		applicationDetailsOfferingObj.applicationDetailsOffering_SearchInboxInputField().sendKeys(applicationDetailsOfferingTestDataType.ReferenceID);
	}

	@Then("^click on the entitle button of the Application details offering record of that reference id$")
	public void click_on_the_entitle_button_of_the_Application_details_offering_record_of_that_reference_id() throws Throwable {
		String beforexpath= "//span[contains(text(),'";
		String afterxpath= "')]/../../td/button";
		while(true) {
			try {
				driver.findElement(By.xpath(beforexpath + jsonDataReaderWriter.readReferancedata() + afterxpath)).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	}
	
	@Then("^click on the Application details tab in Application details screen$")
    public void click_on_the_Application_details_tab_in_Application_details_screen() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_ApplicationDetailTab());
		boolean status = applicationDetailsOfferingObj.applicationDetailsOffering_ApplicationDetailTab().isDisplayed();
		Assert.assertTrue("Application details tab is present :", status);
		waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_ApplicationDetailTab());
		applicationDetailsOfferingObj.applicationDetailsOffering_ApplicationDetailTab().click();
    }

	@Then("^verify Application Details screen should get open with mention fields$")
	public void verify_Application_Details_screen_should_get_open_with_mention_fields() throws Throwable {
		waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_PrimaryProductField());
		boolean status = applicationDetailsOfferingObj.applicationDetailsOffering_PrimaryProductField().isDisplayed();
    	Assert.assertTrue(status);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_PrimarySubProductField());
    	boolean status1 = applicationDetailsOfferingObj.applicationDetailsOffering_PrimarySubProductField().isDisplayed();
    	Assert.assertTrue(status1);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_DeclaredNetIncome());
    	boolean status16 = applicationDetailsOfferingObj.applicationDetailsOffering_DeclaredNetIncome().isDisplayed();
    	Assert.assertTrue(status16);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_DeclaredCurrentObligition());
    	boolean status17 = applicationDetailsOfferingObj.applicationDetailsOffering_DeclaredCurrentObligition().isDisplayed();
    	Assert.assertTrue(status17);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_TotalFinanceAmountRequested());
    	boolean status18 = applicationDetailsOfferingObj.applicationDetailsOffering_TotalFinanceAmountRequested().isDisplayed();
    	Assert.assertTrue(status18);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_SpecialPromotionField());
    	boolean status2 = applicationDetailsOfferingObj.applicationDetailsOffering_SpecialPromotionField().isDisplayed();
    	Assert.assertTrue(status2);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_SourcingChannelField());
    	boolean status3 = applicationDetailsOfferingObj.applicationDetailsOffering_SourcingChannelField().isDisplayed();
    	Assert.assertTrue(status3);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_BusinessCenterCodeField());
    	boolean status4 = applicationDetailsOfferingObj.applicationDetailsOffering_BusinessCenterCodeField().isDisplayed();
    	Assert.assertTrue(status4);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_ServicingTypeField());
    	boolean status5 = applicationDetailsOfferingObj.applicationDetailsOffering_ServicingTypeField().isDisplayed();
    	Assert.assertTrue(status5);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_ServicingEntityField());
    	boolean status6 = applicationDetailsOfferingObj.applicationDetailsOffering_ServicingEntityField().isDisplayed();
    	Assert.assertTrue(status6);
    	
    	javaScriptHelper.scrollIntoView(applicationDetailsOfferingObj.applicationDetailsOffering_ServicingBranchField());
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_ServicingBranchField());
    	boolean status7 = applicationDetailsOfferingObj.applicationDetailsOffering_ServicingBranchField().isDisplayed();
    	Assert.assertTrue(status7);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_ClosingStaffField());
    	boolean status8 = applicationDetailsOfferingObj.applicationDetailsOffering_ClosingStaffField().isDisplayed();
    	Assert.assertTrue(status8);
    	
	}
	
    @Then("^verify Referral Sourcing Details screen should get open with mention fields$")
    public void verify_referral_sourcing_details_screen_should_get_open_with_mention_fields() throws Throwable {
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_SourcingTypeField());
    	boolean status9 = applicationDetailsOfferingObj.applicationDetailsOffering_SourcingTypeField().isDisplayed();
    	Assert.assertTrue(status9);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_SourcingStaffField());
    	boolean status10 = applicationDetailsOfferingObj.applicationDetailsOffering_SourcingStaffField().isDisplayed();
    	Assert.assertTrue(status10);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_SourcingEntityField());
    	boolean status11 = applicationDetailsOfferingObj.applicationDetailsOffering_SourcingEntityField().isDisplayed();
    	Assert.assertTrue(status11);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_SourcingOfficeField());
    	boolean status12 = applicationDetailsOfferingObj.applicationDetailsOffering_SourcingOfficeField().isDisplayed();
    	Assert.assertTrue(status12);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceTypeField());
    	boolean status13 = applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceTypeField().isDisplayed();
    	Assert.assertTrue(status13);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceEntityField());
    	boolean status14 = applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceEntityField().isDisplayed();
    	Assert.assertTrue(status14);
    	waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceCode());
    	boolean status15 = applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceCode().isDisplayed();
    	Assert.assertTrue(status15);
		
    }
    
    @Then("^verify the field Primary Product on Application Details Offering screen$")
    public void verify_the_field_primary_product_on_application_details_offering_screen() throws Throwable {
    	String primaryProduct = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[3].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(primaryProduct);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.PrimaryProduct, primaryProduct);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_PrimaryProductField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Primary Product field is in read only mode");
    }

    @Then("^verify the field primary sub product on Application Details Offering screen$")
    public void verify_the_field_primary_sub_product_on_application_details_offering_screen() throws Throwable {
    	String primarySubProduct = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[4].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(primarySubProduct);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.PrimarySubProduct, primarySubProduct);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_PrimarySubProductField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Primary Sub Product field is in read only mode");
    }

    @Then("^verify the field declared net income on Application Details Offering screen$")
    public void verify_the_field_declared_net_income_on_application_details_offering_screen() throws Throwable {
    	String declaredNetIncome = applicationDetailsOfferingObj.applicationDetailsOffering_DeclaredNetIncome().getAttribute("ng-reflect-model");
		System.out.println(declaredNetIncome);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.DeclaredNetIncome, declaredNetIncome);
		javaScriptHelper.scrollIntoView(applicationDetailsOfferingObj.applicationDetailsOffering_PrimaryProductField());
    }

    @Then("^verify the field declared current obligation on Application Details Offering screen$")
    public void verify_the_field_declared_current_obligation_on_application_details_offering_screen() throws Throwable {
    	String declaredCurrentObligation = applicationDetailsOfferingObj.applicationDetailsOffering_DeclaredCurrentObligition().getAttribute("ng-reflect-model");
		System.out.println(declaredCurrentObligation);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.DeclaredCurrentObligation, declaredCurrentObligation);
    }

    @Then("^verify the field sourcing channel on Application Details Offering screen$")
    public void verify_the_field_sourcing_channel_on_application_details_offering_screen() throws Throwable {
    	String sourcingChannel = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[6].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(sourcingChannel);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.SourcingChannel, sourcingChannel);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_SourcingChannelField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Sourcing Channel field is in read only mode");
    }

    @Then("^verify the field business center code on Application Details Offering screen$")
    public void verify_the_field_business_center_code_on_application_details_offering_screen() throws Throwable {
    	String businessCenterCode = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[7].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(businessCenterCode);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.BusinessCenterCode, businessCenterCode);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_BusinessCenterCodeField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Business Center Code field is in read only mode");
    }

    @Then("^verify the field total finance amount requested on Application Details Offering screen$")
    public void verify_the_field_total_finance_amount_requested_on_application_details_offering_screen() throws Throwable {
    	String totalFinanceAmountRequested = applicationDetailsOfferingObj.applicationDetailsOffering_TotalFinanceAmountRequested().getAttribute("ng-reflect-model");
		System.out.println(totalFinanceAmountRequested);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.TotalFinanceAmountRequested, totalFinanceAmountRequested);
    }

    @Then("^verify the field special promotion on Application Details Offering screen$")
    public void verify_the_field_special_promotion_on_application_details_offering_screen() throws Throwable {
    	String specialPromotion = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[5].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(specialPromotion);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.SpecialPromotion, specialPromotion);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_SpecialPromotionField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Special Promotion field is in read only mode");
    }

    @Then("^verify the field servicing type on Application Details Offering screen$")
    public void verify_the_field_servicing_type_on_application_details_offering_screen() throws Throwable {
    	String servicingType = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[8].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(servicingType);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.ServicingType, servicingType);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_ServicingTypeField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Servicing Type field is in read only mode");
    }

    @Then("^verify the field servicing entity on Application Details Offering screen$")
    public void verify_the_field_servicing_entity_on_application_details_offering_screen() throws Throwable {
    	String servicingEntity = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[9].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(servicingEntity);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.ServicingEntity, servicingEntity);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_ServicingEntityField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Servicing Entity field is in read only mode");
    }

    @Then("^verify the field servicing branch on Application Details Offering screen$")
    public void verify_the_field_servicing_branch_on_application_details_offering_screen() throws Throwable {
    	String servicingBranch = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[10].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(servicingBranch);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.ServicingBranch, servicingBranch);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_ServicingBranchField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Servicing Branch field is in read only mode");
    }

    @Then("^verify the field closing staff on Application Details Offering screen$")
    public void verify_the_field_closing_staff_on_application_details_offering_screen() throws Throwable {
    	String closingStaff = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[11].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(closingStaff);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.ClosingStafforServicingStafforRM, closingStaff);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_ClosingStaffField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "ClosingStaff or Servicing Staff or RM field is in read only mode");
    }

    @Then("^verify the field sourcing type on Application Details Offering screen$")
    public void verify_the_field_sourcing_type_on_application_details_offering_screen() throws Throwable {
    	String sourcingType = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[12].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(sourcingType);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.SourcingType, sourcingType);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_SourcingTypeField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Sourcing Type field is in read only mode");
    }

    @Then("^verify the field sourcing staff on Application Details Offering screen$")
    public void verify_the_field_sourcing_staff_on_application_details_offering_screen() throws Throwable {
    	String sourcingStaff = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[13].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(sourcingStaff);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.SourcingStaff, sourcingStaff);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_SourcingStaffField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Sourcing Staff field is in read only mode");
    }

    @Then("^verify the field sourcing entity on Application Details Offering screen$")
    public void verify_the_field_sourcing_entity_on_application_details_offering_screen() throws Throwable {
    	String sourcingEntity = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[14].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(sourcingEntity);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.SourcingEntity, sourcingEntity);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_SourcingEntityField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Sourcing Entity field is in read only mode");
    }

    @Then("^verify the field sourcing office on Application Details Offering screen$")
    public void verify_the_field_sourcing_office_on_application_details_offering_screen() throws Throwable {
    	String sourcingOffice = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[15].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(sourcingOffice);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.SourcingOffice, sourcingOffice);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_SourcingOfficeField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Sourcing Office field is in read only mode");
    }

    @Then("^verify the field reference type on Application Details Offering screen$")
    public void verify_the_field_reference_type_on_application_details_offering_screen() throws Throwable {
    	String referenceType = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[16].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(referenceType);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.ReferenceType, referenceType);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceTypeField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Reference Type field is in read only mode");
    }

    @Then("^verify the field reference entity on Application Details Offering screen$")
    public void verify_the_field_reference_entity_on_application_details_offering_screen() throws Throwable {
    	String referenceEntity = javaScriptHelper.executeScript("return document.querySelectorAll('ion-select')[17].shadowRoot.querySelector('div.select-text').innerText").toString();
		System.out.println(referenceEntity);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.ReferenceEntity, referenceEntity);
		boolean result = applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceEntityField().getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("true");
		softAssert.assertTrue(result , "Reference Entity field is in read only mode");
		softAssert.assertAll();
    }

    @Then("^verify the field reference code on Application Details Offering screen$")
    public void verify_the_field_reference_code_on_application_details_offering_screen() throws Throwable {
    	String referenceCode = applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceCode().getAttribute("ng-reflect-model");
		System.out.println(referenceCode);
		Assert.assertEquals(applicationDetailsOfferingTestDataType.ReferenceCode, referenceCode);
		try {
			waithelper.waitForElementwithFluentwait(driver, applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceCode());
			applicationDetailsOfferingObj.applicationDetailsOffering_ReferenceCode().sendKeys(applicationDetailsOfferingTestDataType.EditText);
			System.out.println("Reference Code field is not in read only mode");
	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Reference Code field is in read only mode");
		}
    }

}