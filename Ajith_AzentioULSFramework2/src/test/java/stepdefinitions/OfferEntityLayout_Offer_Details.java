package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.OfferEntityLayout_OfferDetailsObj;
import resources.BaseClass;

public class OfferEntityLayout_Offer_Details extends BaseClass {
	WebDriver driver = BaseClass.driver;
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	OfferEntityLayout_OfferDetailsObj offerDetailsObj = new OfferEntityLayout_OfferDetailsObj(driver);
	SoftAssert softAssert = new SoftAssert();
	
	@And("^User search Reference Number in inbox list view for offer details$")
    public void user_search_reference_number_in_inbox_list_view_for_offer_details() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.Application_DetailTab_SearchButtons(),30, 2);
		offerDetailsObj.Application_DetailTab_SearchButtons().click();
		 seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.Application_DetailTab_SearchText(),30, 2);
		 offerDetailsObj.Application_DetailTab_SearchText().click();
		 offerDetailsObj.Application_DetailTab_SearchText().sendKeys("650");
    }

    @And("^User click the first edit icon for reference id searched for offer details$")
    public void user_click_the_first_edit_icon_for_reference_id_searched_for_offer_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.offering_ActionIcon(),30, 2);
		offerDetailsObj.offering_ActionIcon().click();
    }
    @And("^User click the first edit icon in Facility info$")
    public void user_click_the_first_edit_icon_in_facility_info() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.facilityInfoEditIcon1(),30, 2);
		offerDetailsObj.facilityInfoEditIcon1().click();
    }
    @And("^User Verify Product field is available in offer details$")
    public void user_verify_product_field_is_available_in_offer_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.productField(),30, 2);
    	Assert.assertEquals(true, offerDetailsObj.productField().isDisplayed());
    	}

    @And("^User Verify Sub Product field is available in offer details$")
    public void user_verify_sub_product_field_is_available_in_offer_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.subProductField(),30, 2);
    	Assert.assertEquals(true, offerDetailsObj.subProductField().isDisplayed());
    }

    @And("^User Verify Scheme field is available in offer details$")
    public void user_verify_scheme_field_is_available_in_offer_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.schemeField(),30, 2);
    	Assert.assertEquals(true, offerDetailsObj.schemeField().isDisplayed());
    }

    @And("^User Verify Pricing Indicator field is available in offer details$")
    public void user_verify_pricing_indicator_field_is_available_in_offer_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.pricingIndicatorField(),30, 2);
    	Assert.assertEquals(true, offerDetailsObj.pricingIndicatorField().isDisplayed());
    }

    @And("^User Verify Offered Amount field is available in offer details$")
    public void user_verify_offered_amount_field_is_available_in_offer_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.offeredAmountField(),30, 2);
    	Assert.assertEquals(true, offerDetailsObj.offeredAmountField().isDisplayed());
    }

    @And("^User Verify Tenure field is available in offer details$")
    public void user_verify_tenure_field_is_available_in_offer_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.tenureField(),30, 2);
    	Assert.assertEquals(true, offerDetailsObj.tenureField().isDisplayed());
    }

    @And("^User Verify Currency field is available in offer details$")
    public void user_verify_currency_field_is_available_in_offer_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.currencyField(),30, 2);
    	Assert.assertEquals(true, offerDetailsObj.currencyField().isDisplayed());
    }
    @And("^User Verify Nature of Finance field is available in offer details$")
    public void user_verify_nature_of_finance_field_is_available_in_offer_details() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.natureOfFinanceField(),30, 2);
    	Assert.assertEquals(true, offerDetailsObj.natureOfFinanceField().isDisplayed());
    }
    @And("^User Verify Product field is View only mode$")
    public void user_verify_product_field_is_view_only_mode() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.productFieldText(),30, 2);
    	Assert.assertEquals("true", offerDetailsObj.productFieldText().getAttribute("ng-reflect-readonly"));
    	
    }

    @And("^User Verify Sub Product field is View only mode$")
    public void user_verify_sub_product_field_is_view_only_mode() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.subProductFieldText(),30, 2);
    	Assert.assertEquals("true", offerDetailsObj.subProductFieldText().getAttribute("ng-reflect-readonly"));
    }

    @And("^User Verify Scheme field is View only mode$")
    public void user_verify_scheme_field_is_view_only_mode() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.schemeFieldText(),30, 2);
    	Assert.assertEquals("true", offerDetailsObj.schemeFieldText().getAttribute("ng-reflect-readonly"));
    	
    }

    @And("^User Verify Pricing Indicator field is View only mode$")
    public void user_verify_pricing_indicator_field_is_view_only_mode() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.pricingIndicatorFieldText(),30, 2);
    	Assert.assertEquals("true", offerDetailsObj.pricingIndicatorFieldText().getAttribute("ng-reflect-readonly"));
    }

    @And("^User Verify Offered Amount field is View only mode$")
    public void user_verify_offered_amount_field_is_view_only_mode() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.offeredAmountText(),30, 2);
    	Assert.assertEquals("true", offerDetailsObj.offeredAmountText().getAttribute("ng-reflect-readonly"));
    }

    @And("^User Verify Tenure field is View only mode$")
    public void user_verify_tenure_field_is_view_only_mode() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.tenureFieldText(),30, 2);
    	Assert.assertEquals("true", offerDetailsObj.tenureFieldText().getAttribute("ng-reflect-readonly"));
    }

    @And("^User Verify Nature of Finance field is View only mode$")
    public void user_verify_nature_of_finance_field_is_view_only_mode() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.natureOfFinanceText(),30, 2);
    	Assert.assertEquals("true", offerDetailsObj.natureOfFinanceText().getAttribute("ng-reflect-readonly"));
    }

    @And("^User Verify Currency field is View only mode$")
    public void user_verify_currency_field_is_view_only_mode() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,offerDetailsObj.currencyFieldText(),30, 2);
    	Assert.assertEquals("true", offerDetailsObj.currencyFieldText().getAttribute("ng-reflect-readonly"));
} 
}
