package stepdefinitions;

import org.openqa.selenium.WebDriver;

import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import pageobjects.CustomerLayoutEntityReference;
import resources.BaseClass;

public class CustomerEntityLayoutReference extends BaseClass{
WebDriver  driver = BaseClass.driver;
CustomerLayoutEntityReference customerEntityReference = new CustomerLayoutEntityReference(driver);
JsonConfig jsonConfig = new JsonConfig();
Selenium_Actions seleniumActions = new Selenium_Actions(driver);
@And("^User click Additional Customer info tab$")
public void user_click_additional_customer_info_tab() throws Throwable {
    seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEntityReference.additionalCustomerInfo(), 30, 2);
    customerEntityReference.additionalCustomerInfo().click();
}
@And("^User Verify the Functionality of add button in Reference List view$")
public void user_verify_the_functionality_of_add_button_in_reference_list_view() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEntityReference.refernceListViewAddIcon(), 30, 2);
    customerEntityReference.refernceListViewAddIcon().click();
}

@And("^User Veriy the Functionality of back button in Reference List view$")
public void user_veriy_the_functionality_of_back_button_in_reference_list_view() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEntityReference.backButtonInReference(), 30, 2);
    customerEntityReference.backButtonInReference().click();
			
}

@And("^User click First edit icon of Customer Personal Information$")
public void user_click_first_edit_icon_of_customer_personal_information() throws Throwable {
	seleniumActions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,customerEntityReference.customerPersonalInfoFirstEditIcon(), 30, 2);
    customerEntityReference.customerPersonalInfoFirstEditIcon().click();
}
}
