package stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.KULS_CommonWebElements;
import pageobjects.TransactionScreen_PropertyDetailsObj;
import resources.BaseClass;
import testDataType.PropetyDetails_TestDataType;

public class PropertyDetails_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	KULS_CommonWebElements ulsCommonElementObj = new KULS_CommonWebElements(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	PropetyDetails_TestDataType propertyDetailsTestData = jsonConfig.getPropertyDetailsTestDataByName("Maker");
	TransactionScreen_PropertyDetailsObj propertyDetailsObj = new TransactionScreen_PropertyDetailsObj(driver);
	SoftAssert softAssert = new SoftAssert();
	KULS_CommonWebElements commenWebElementsObj = new KULS_CommonWebElements(driver);

	@And("^click on mail box$")
	public void click_on_mail_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonElementObj.ulsMailBox(), 20, 1);
		ulsCommonElementObj.ulsMailBox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonElementObj.ulsNotificationSerachButton(), 20,
				1);
		ulsCommonElementObj.ulsNotificationSerachButton().click();

	}

	@And("^search for app data entry record$")
	public void search_for_app_data_entry_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonElementObj.ulsNotificationSearchTextBox(), 20,
				1);
		clicksAndActionsHelper.moveToElement(ulsCommonElementObj.ulsNotificationSearchTextBox());
		clicksAndActionsHelper.clickUsingActionClass(ulsCommonElementObj.ulsNotificationSearchTextBox(),
				ulsCommonElementObj.ulsNotificationSearchTextBox());
		ulsCommonElementObj.ulsNotificationSearchTextBox().sendKeys(propertyDetailsTestData.StageCode);
	}

	@And("^select the app data entry first record$")
	public void select_the_app_data_entry_first_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsCommonElementObj.ulsNotificationRecordStageCode(),
				10, 1);
		for (int i = 0; i <= 10; i++) {
			try {
				if (ulsCommonElementObj.ulsNotificationRecordStageCode().getText()
						.equals(propertyDetailsTestData.StageCode)) {
					System.out.println("Stage Code " + propertyDetailsTestData.StageCode + " found successfully");
					try {
						waitHelper.waitForElementToVisibleWithFluentWait(driver,
								ulsCommonElementObj.ulsMailBoxFirstRecord(), 20, 1);
						ulsCommonElementObj.ulsMailBoxFirstRecord().click();
						break;
					} catch (Exception e) {

					}
				} else {
					if (i == 10) {
						Assert.fail(propertyDetailsTestData.StageCode + " is not available ");
					}
				}
			}

			catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on property detail record$")
	public void click_on_property_detail_record() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				waitHelper.waitForElementToVisibleWithFluentWait(driver,
						propertyDetailsObj.appdataEntryPropertyDetailsTab(), 3, 1);
				propertyDetailsObj.appdataEntryPropertyDetailsTab().click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
				propertyDetailsObj.appdataEntryNextButton().click();
			}
		}

	}

	@And("^click on add button in property details tab$")
	public void click_on_add_button_in_property_details_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.appdataEntryPropertyDetailsAddButton(), 10, 1);
		propertyDetailsObj.appdataEntryPropertyDetailsAddButton().click();

	}

	@Then("^verify property details is showing in the screen$")
	public void verify_property_details_is_showing_in_the_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.appdataEntryPropertyDetailsTitle(),
				10, 1);
		Assert.assertTrue(propertyDetailsObj.appdataEntryPropertyDetailsTitle().isDisplayed());
	}

	@Then("^verify address details is showing in screen$")
	public void verify_address_details_is_showing_in_screen() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.scrollIntoView(propertyDetailsObj.appdataEntryAddressDetailsTitle());
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(propertyDetailsObj.appdataEntryAddressDetailsTitle().isDisplayed());
	}

	@Then("^verify charge details is showing in the screen$")
	public void verify_charge_details_is_showing_in_the_screen() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.scrollIntoView(propertyDetailsObj.appdataEntryChargeDetailsTitle());
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(propertyDetailsObj.appdataEntryChargeDetailsTitle().isDisplayed());
	}

	@Then("^verify construction details is showing in the screen$")
	public void verify_construction_details_is_showing_in_the_screen() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.scrollIntoView(propertyDetailsObj.appdataEntryConstructionDetailsTitle());
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(propertyDetailsObj.appdataEntryConstructionDetailsTitle().isDisplayed());
	}

	@Then("^verify security type field should be visisble and mandatory dropdown$")
	public void verify_security_type_field_should_be_visisble_and_mandatory_dropdown() throws Throwable {
		for (int i = 0; i <= 15; i++) {
			try {
//				waitHelper.waitForElementToVisibleWithFluentWait(driver,
//						propertyDetailsObj.propertyDetailsSecurityTypeDropDown(), 10, 1);
				javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsSecurityTypeDropDown());
				Assert.assertTrue(propertyDetailsObj.propertyDetailsSecurityTypeDropDown().isDisplayed());
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(
				propertyDetailsObj.propertyDetailsSecurityTypeDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsSecurityTypeDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the security dropdown$")
	public void user_can_able_to_select_the_data_from_the_security_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsSecurityTypeDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsSecurityTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.SecurityType
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify property city field should be mandatory lookup$")
	public void verify_property_city_field_should_be_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyCityDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPropertyCityDropDown().isDisplayed());
		Assert.assertTrue(
				propertyDetailsObj.propertyDetailsPropertyCityDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPropertyCityDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the property city field$")
	public void user_can_able_to_select_the_data_from_the_property_city_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyCityDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsPropertyCityDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.PropertyCity
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Type Of Transaction field should be mandatory lookup$")
	public void verify_type_of_transaction_field_should_be_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsTypeOfTransactionDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsTypeOfTransactionDropDown().isDisplayed());
		Assert.assertTrue(
				propertyDetailsObj.propertyDetailsTypeOfTransactionDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsTypeOfTransactionDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the Type Of Transaction field$")
	public void user_can_able_to_select_the_data_from_the_type_of_transaction_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsTypeOfTransactionDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsTypeOfTransactionDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.TypeOfTransaction
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Purchased from field should be mandatory lookup$")
	public void verify_purchased_from_field_should_be_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPurchasedFromDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPurchasedFromDropDown().isDisplayed());
		Assert.assertTrue(
				propertyDetailsObj.propertyDetailsPurchasedFromDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPurchasedFromDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the Purchased from field$")
	public void user_can_able_to_select_the_data_from_the_purchased_from_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPurchasedFromDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsPurchasedFromDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.PurchasedFrom
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Property Type field should be mandatory lookup$")
	public void verify_property_type_field_should_be_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyTypeDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPropertyTypeDropDown().isDisplayed());
		Assert.assertTrue(
				propertyDetailsObj.propertyDetailsPropertyTypeDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPropertyTypeDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the Property Type field$")
	public void user_can_able_to_select_the_data_from_the_property_type_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyTypeDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsPropertyTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.PropertyType
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify APF Status field should be mandatory dropdown$")
	public void verify_apf_status_field_should_be_mandatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsAPFStatusDropDown(),
				10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAPFStatusDropDown().isDisplayed());
		Assert.assertTrue(
				propertyDetailsObj.propertyDetailsAPFStatusDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAPFStatusDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the APF Status field$")
	public void user_can_able_to_select_the_data_from_the_apf_status_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsAPFStatusDropDown(),
				10, 1);
		propertyDetailsObj.propertyDetailsAPFStatusDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.APFStatus + " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Construction Status field should be mandatory dropdown$")
	public void verify_construction_status_field_should_be_mandatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsConstructionStatusDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsConstructionStatusDropDown().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsConstructionStatusDropDown().getAttribute("aria-label")
				.contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsConstructionStatusDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the Construction Status field$")
	public void user_can_able_to_select_the_data_from_the_construction_status_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsConstructionStatusDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsConstructionStatusDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.ConstructionStatus
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Property Category field should be mandatory dropdown$")
	public void verify_property_category_field_should_be_mandatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyCategoryDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPropertyCategoryDropDown().isDisplayed());
		Assert.assertTrue(
				propertyDetailsObj.propertyDetailsPropertyCategoryDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPropertyCategoryDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the Property Category field$")
	public void user_can_able_to_select_the_data_from_the_property_category_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyCategoryDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsPropertyCategoryDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.PropertyCategory
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Nature of Property field should be mandatory lookup$")
	public void verify_nature_of_property_field_should_be_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsNatureOfPropertyDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsNatureOfPropertyDropDown().isDisplayed());
		Assert.assertTrue(
				propertyDetailsObj.propertyDetailsNatureOfPropertyDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsNatureOfPropertyDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the Nature of Property field$")
	public void user_can_able_to_select_the_data_from_the_nature_of_property_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsNatureOfPropertyDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsNatureOfPropertyDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.NatureOfProperty
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Occupancy Status field should be mandatory lookup$")
	public void verify_occupancy_status_field_should_be_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsOccupencyStatusDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsOccupencyStatusDropDown().isDisplayed());
		Assert.assertTrue(
				propertyDetailsObj.propertyDetailsOccupencyStatusDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsOccupencyStatusDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the Occupancy Status field$")
	public void user_can_able_to_select_the_data_from_the_occupancy_status_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsOccupencyStatusDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsOccupencyStatusDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.OccupancyStatus
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify name Of The Developer field should be mandatory lookup$")
	public void verify_name_of_the_developer_field_should_be_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsNameOfTheDeveloperDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsNameOfTheDeveloperDropDown().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsNameOfTheDeveloperDropDown().getAttribute("aria-label")
				.contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsNameOfTheDeveloperDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the name Of The Developer field$")
	public void user_can_able_to_select_the_data_from_the_name_of_the_developer_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsNameOfTheDeveloperDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsNameOfTheDeveloperDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.NameOfTheDeveloper
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Project field should be mandatory lookup$")
	public void verify_project_field_should_be_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsProjectDropDown(),
				10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsProjectDropDown().isDisplayed());
		Assert.assertFalse(
				propertyDetailsObj.propertyDetailsProjectDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsProjectDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the Project field$")
	public void user_can_able_to_select_the_data_from_the_project_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsProjectDropDown(),
				10, 1);
		propertyDetailsObj.propertyDetailsProjectDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.Project + " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Building Details field should be mandatory lookup$")
	public void verify_building_details_field_should_be_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsBuildingDetailsDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsBuildingDetailsDropDown().isDisplayed());
		Assert.assertFalse(
				propertyDetailsObj.propertyDetailsBuildingDetailsDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsBuildingDetailsDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the Building Details field$")
	public void user_can_able_to_select_the_data_from_the_building_details_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsBuildingDetailsDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsBuildingDetailsDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.BuildingDetails
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Unit Details field should be mandatory lookup$")
	public void verify_unit_details_field_should_be_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsUnitDetailsDropDown(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsUnitDetailsDropDown().isDisplayed());
		Assert.assertFalse(
				propertyDetailsObj.propertyDetailsUnitDetailsDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(propertyDetailsObj.propertyDetailsUnitDetailsDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
	}

	@And("^user can able to select the data from the Unit Details field$")
	public void user_can_able_to_select_the_data_from_the_unit_details_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsUnitDetailsDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsUnitDetailsDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.UnitDetails + " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify address line 1 field should be non mendatory text box$")
	public void verify_address_line_1_field_should_be_non_mendatory_text_box() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAddressLine1InputBox(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAddressLine1InputBox().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAddressLine1InputBox().getAttribute("type")
				.equals(propertyDetailsTestData.TextBoxAttributeVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsAddressLine1MandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status, "address line 1 field should be non mandatory but here its a mandatory one");
	}

	@And("^user can able to enter the data into the address line 1 input box$")
	public void user_can_able_to_enter_the_data_into_the_address_line_1_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAddressLine1InputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsAddressLine1InputBox().click();
		propertyDetailsObj.propertyDetailsAddressLine1InputBox().sendKeys(propertyDetailsTestData.AddressLine1);
	}

	@Then("^verify address line 2 field should be non mendatory text box$")
	public void verify_address_line_2_field_should_be_non_mendatory_text_box() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAddressLine2InputBox(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAddressLine2InputBox().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAddressLine2InputBox().getAttribute("type")
				.equals(propertyDetailsTestData.TextBoxAttributeVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsAddressLine2MandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status, "address line 2 field should be non mandatory but here its a mandatory one");
	}

	@And("^user can able to enter the data into the address line 2 input box$")
	public void user_can_able_to_enter_the_data_into_the_address_line_2_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAddressLine2InputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsAddressLine2InputBox().click();
		propertyDetailsObj.propertyDetailsAddressLine2InputBox().sendKeys(propertyDetailsTestData.AddressLine2);
	}

	@Then("^verify address line 3 field should be text box$")
	public void verify_address_line_3_field_should_be_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAddressLine3InputBox(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAddressLine3InputBox().isDisplayed());

	}

	@And("^user can able to enter the data into the address line 3 input box$")
	public void user_can_able_to_enter_the_data_into_the_address_line_3_input_box() throws Throwable {
		propertyDetailsObj.propertyDetailsAddressLine3InputBox().click();
		propertyDetailsObj.propertyDetailsAddressLine3InputBox().sendKeys(propertyDetailsTestData.AddressLine3);
	}

	@Then("^verify country field should be non mandatory lookup$")
	public void verify_country_field_should_be_non_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsCountryDropDown(),
				10, 1);

		Assert.assertTrue(propertyDetailsObj.propertyDetailsCountryDropDown().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsCountryDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
		softAssert.assertFalse(
				propertyDetailsObj.propertyDetailsCountryDropDown().getAttribute("aria-label").contains("*"),
				" Country field should be non mandatory but here its a mandatory one");
	}

	@And("^user can able to select the data from the country field$")
	public void user_can_able_to_select_the_data_from_the_country_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsCountryDropDown(),
				10, 1);
		propertyDetailsObj.propertyDetailsCountryDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.Country + " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify state field should be non mandatory lookup$")
	public void verify_state_field_should_be_non_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsStateDropDown(), 10,
				1);

		Assert.assertTrue(propertyDetailsObj.propertyDetailsStateDropDown().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsStateDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
		softAssert.assertFalse(
				propertyDetailsObj.propertyDetailsStateDropDown().getAttribute("aria-label").contains("*"),
				" State field should be non mandatory but here its a mandatory one");
	}

	@And("^user can able to select the data from the state field$")
	public void user_can_able_to_select_the_data_from_the_state_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsStateDropDown(), 10,
				1);
		propertyDetailsObj.propertyDetailsStateDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.State + " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify city field should be non mandatory lookup$")
	public void verify_city_field_should_be_non_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsCityDropDown(), 10,
				1);

		Assert.assertTrue(propertyDetailsObj.propertyDetailsCityDropDown().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsCityDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
		softAssert.assertFalse(
				propertyDetailsObj.propertyDetailsCityDropDown().getAttribute("aria-label").contains("*"),
				" City field should be non mandatory but here its a mandatory one");
	}

	@And("^user can able to select the data from the city field$")
	public void user_can_able_to_select_the_data_from_the_city_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsCityDropDown(), 10,
				1);
		propertyDetailsObj.propertyDetailsCityDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.City + " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify District Neighbourhood field should be non mandatory textbox$")
	public void verify_district_neighbourhood_field_should_be_non_mandatory_textbox() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsDistrictNeighbourhoodInputBox(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsDistrictNeighbourhoodInputBox().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsDistrictNeighbourhoodInputBox().getAttribute("type")
				.equals(propertyDetailsTestData.TextBoxAttributeVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsDistritNeighbourhoodMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status,
				" Ditrict Neighbourhood field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to enter the data from into District Neighbourhood field$")
	public void user_can_able_to_enter_the_data_from_into_district_neighbourhood_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsDistrictNeighbourhoodInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsDistrictNeighbourhoodInputBox().click();
		propertyDetailsObj.propertyDetailsDistrictNeighbourhoodInputBox()
				.sendKeys(propertyDetailsTestData.DistrictNeighbourhood);
	}

	@Then("^verify pincode field should be non mandatory textbox$")
	public void verify_pincode_field_should_be_non_mandatory_textbox() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsPincodeInputBox(),
				10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPincodeInputBox().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPincodeInputBox().getAttribute("type")
				.equals(propertyDetailsTestData.TextBoxAttributeVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsPincodeMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status, " Pincode field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to enter the data from into pincode field$")
	public void user_can_able_to_enter_the_data_from_into_pincode_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsPincodeInputBox(),
				10, 1);
		propertyDetailsObj.propertyDetailsPincodeInputBox().click();
		propertyDetailsObj.propertyDetailsPincodeInputBox().sendKeys(propertyDetailsTestData.Pincode);
	}

	@Then("^verify Type Of Charge field should be mandatory dropdown$")
	public void verify_type_of_charge_field_should_be_mandatory_dropdown() throws Throwable {
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsTypeofChargeDropDown());
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(propertyDetailsObj.propertyDetailsTypeofChargeDropDown().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsTypeofChargeDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
		softAssert.assertFalse(
				propertyDetailsObj.propertyDetailsTypeofChargeDropDown().getAttribute("aria-label").contains("*"),
				" Type Of charge field should be non mandatory but here its a mandatory one");
	}

	@And("^user can able to select the data from the Type Of Charge field$")
	public void user_can_able_to_select_the_data_from_the_type_of_charge_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsTypeofChargeDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsTypeofChargeDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.TypeOfCharge
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Name Of Charge Holder field should be non mandatory textbox$")
	public void verify_name_of_charge_holder_field_should_be_non_mandatory_textbox() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox().getAttribute("type")
				.equals(propertyDetailsTestData.TextBoxAttributeVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsNameoftheChargeHolderMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status,
				" Name Of The charge holder field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to enter the data from into Name Of Charge Holder field$")
	public void user_can_able_to_enter_the_data_from_into_name_of_charge_holder_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox().click();
		propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox()
				.sendKeys(propertyDetailsTestData.NameOfTheChargeHolder);
	}

	@Then("^verify Amount to the Charge Holder field should be non mandatory currency field$")
	public void verify_amount_to_the_charge_holder_field_should_be_non_mandatory_currency_field() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAmounttotheChargeHolderInputBox(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAmounttotheChargeHolderInputBox().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAmounttotheChargeHolderInputBox().getAttribute("inputmode")
				.equals(propertyDetailsTestData.CurrencyFieldAttributeVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsAmounttotheChargeHolderMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status,
				" Amount to the Charge Holder field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to enter the data from into Amount to the Charge Holder field$")
	public void user_can_able_to_enter_the_data_from_into_amount_to_the_charge_holder_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAmounttotheChargeHolderInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsAmounttotheChargeHolderInputBox().click();
		propertyDetailsObj.propertyDetailsAmounttotheChargeHolderInputBox()
				.sendKeys(propertyDetailsTestData.AmountToTheChargeHolder);
	}

	@Then("^verify Measurement field should be mandatory dropdown$")
	public void verify_measurement_field_should_be_mandatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsMeasurementDropDown(), 10, 1);

		Assert.assertTrue(propertyDetailsObj.propertyDetailsMeasurementDropDown().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsMeasurementDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
		softAssert.assertFalse(
				propertyDetailsObj.propertyDetailsMeasurementDropDown().getAttribute("aria-label").contains("*"),
				" Measurement field should be non mandatory but here its a mandatory one");
	}

	@And("^user can able to select the data from the Measurement field$")
	public void user_can_able_to_select_the_data_from_the_measurement_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsMeasurementDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsMeasurementDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.Measurement + " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Approx Property Area field should be non mandatory textbox$")
	public void verify_approx_property_area_field_should_be_non_mandatory_textbox() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsApproxPropertyAreaInputBox(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsApproxPropertyAreaInputBox().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsApproxPropertyAreaInputBox().getAttribute("type")
				.equals(propertyDetailsTestData.NumericInputBoxVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsApproxPropertyAreaMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status,
				" Approx Property Area field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to enter the data from into Approx Property Area field$")
	public void user_can_able_to_enter_the_data_from_into_approx_property_area_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsApproxPropertyAreaInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsApproxPropertyAreaInputBox().click();
		propertyDetailsObj.propertyDetailsApproxPropertyAreaInputBox()
				.sendKeys(propertyDetailsTestData.AmountToTheChargeHolder);
	}

	@Then("^verify Built Up Plot Area field should be non mandatory textbox$")
	public void verify_built_up_plot_area_field_should_be_non_mandatory_textbox() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsBuiltUpPlotAreaInputBox(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsBuiltUpPlotAreaInputBox().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsBuiltUpPlotAreaInputBox().getAttribute("type")
				.equals(propertyDetailsTestData.NumericInputBoxVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsBuiltUpPlotAreaMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status,
				" Built Up Plot Area field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to enter the data from into Built Up Plot Area field$")
	public void user_can_able_to_enter_the_data_from_into_built_up_plot_area_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsBuiltUpPlotAreaInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsBuiltUpPlotAreaInputBox().click();
		propertyDetailsObj.propertyDetailsBuiltUpPlotAreaInputBox().sendKeys(propertyDetailsTestData.BuildUpAplotArea);
	}

	@Then("^verify Carpet Area field should be non mandatory textbox$")
	public void verify_carpet_area_field_should_be_non_mandatory_textbox() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsCarpetAreaInputBox(),
				10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsCarpetAreaInputBox().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsCarpetAreaInputBox().getAttribute("type")
				.equals(propertyDetailsTestData.NumericInputBoxVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsCarpetAreaMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status, " Carpet Area field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to enter the data from into Carpet Area field$")
	public void user_can_able_to_enter_the_data_from_into_carpet_area_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsCarpetAreaInputBox(),
				10, 1);
		propertyDetailsObj.propertyDetailsCarpetAreaInputBox().click();
		propertyDetailsObj.propertyDetailsCarpetAreaInputBox().sendKeys(propertyDetailsTestData.CarpetArea);
	}

	@Then("^verify Property Management field should be non mandatory lookup$")
	public void verify_property_management_field_should_be_non_mandatory_lookup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyManagementDropDown(), 10, 1);

		Assert.assertTrue(propertyDetailsObj.propertyDetailsPropertyManagementDropDown().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPropertyManagementDropDown().getAttribute("aria-haspopup")
				.equals(propertyDetailsTestData.DropDownAndLookUpVerification));
		softAssert.assertFalse(
				propertyDetailsObj.propertyDetailsPropertyManagementDropDown().getAttribute("aria-label").contains("*"),
				" Property Management field should be non mandatory but here its a mandatory one");
	}

	@And("^user can able to select the data from the Property Management field$")
	public void user_can_able_to_select_the_data_from_the_property_management_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyManagementDropDown(), 10, 1);
		propertyDetailsObj.propertyDetailsPropertyManagementDropDown().click();
		String xpath = "//ion-label[text()=' " + propertyDetailsTestData.PropertyManagement
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify Year Of Construction field should be non mandatory calendar$")
	public void verify_year_of_construction_field_should_be_non_mandatory_calendar() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsYearOfConstructionCalendarInput());
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsYearOfConstructionCalendarInput(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsYearOfConstructionCalendarInput().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsYearOfConstructionCalendarInput()
				.getAttribute("ng-reflect-icon").contains(propertyDetailsTestData.CalendarAttributeVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsYearOfConstructionMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status,
				" Year Of Construction field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to select the date from the Year Of Construction field$")
	public void user_can_able_to_select_the_date_from_the_year_of_construction_field() throws Throwable {
		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * propertyDetailsObj.propertyDetailsYearOfConstructionCalendarInput(), 5, 1);
		 * propertyDetailsObj.propertyDetailsYearOfConstructionCalendarInput().click();
		 * 
		 * String yearXpath = "//span[text()=' " +
		 * propertyDetailsTestData.YearOfConstructionYear + " ']"; String monthXpath =
		 * "//span[text()=' " + propertyDetailsTestData.YearOfConstructionMonth + " ']";
		 * String dayXpath = "//span[text()='" +
		 * propertyDetailsTestData.YearOfConstructioDay + "']"; //
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * ulsSchemeMasterObj.schemeMasterMonthField(), 3, 1); //
		 * ulsSchemeMasterObj.schemeMasterMonthField().click(); //
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * commenWebElementsObj.calendarYearField(), 3, 1);
		 * commenWebElementsObj.calendarYearField().click(); //
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver, //
		 * driver.findElement(By.xpath(yearXpath)), 3, 1); for (int i = 0; i <= 10; i++)
		 * { try { driver.findElement(By.xpath(yearXpath)).click(); break; } catch
		 * (Exception e) { if (i == 10) { Assert.fail(e.getMessage()); } } }
		 * driver.findElement(By.xpath(monthXpath)).click(); List<WebElement>
		 * findElements = driver.findElements(By.xpath(dayXpath)); for (WebElement
		 * element : findElements) { try { element.click(); break; } catch (Exception e)
		 * {
		 * 
		 * } }
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsYearOfConstructionCalendarInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsYearOfConstructionCalendarInputBox()
				.sendKeys(propertyDetailsTestData.YearOfConstructiondate);
	}

	@Then("^verify percentage of completion field should be non mandatory textbox$")
	public void verify_percentage_of_completion_field_should_be_non_mandatory_textbox() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPercentageOfCompletionInputBox(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPercentageOfCompletionInputBox().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsPercentageOfCompletionInputBox().getAttribute("type")
				.equals(propertyDetailsTestData.NumericInputBoxVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsPercentageOfCompletionMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status,
				" percentage of completion field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to enter the data from into percentage of completion field$")
	public void user_can_able_to_enter_the_data_from_into_percentage_of_completion_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPercentageOfCompletionInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsPercentageOfCompletionInputBox().click();
		propertyDetailsObj.propertyDetailsPercentageOfCompletionInputBox()
				.sendKeys(propertyDetailsTestData.percentageOFCompletion);
	}

	@Then("^verify Expected Completion Date field should be non mandatory calendar$")
	public void verify_expected_completion_date_field_should_be_non_mandatory_calendar() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsExpectedCompletionDateCalendarInput(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsExpectedCompletionDateCalendarInput().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsExpectedCompletionDateCalendarInput()
				.getAttribute("ng-reflect-icon").contains(propertyDetailsTestData.CalendarAttributeVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsExpectedCompletionDateMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status,
				" Expected Completion Date field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to select the date from the Expected Completion Date field$")
	public void user_can_able_to_select_the_date_from_the_expected_completion_date_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsExpectedCompletionDateCalendarInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsExpectedCompletionDateCalendarInputBox().click();
		propertyDetailsObj.propertyDetailsExpectedCompletionDateCalendarInputBox()
				.sendKeys(propertyDetailsTestData.ExpectedCompletionDate);
	}

	@Then("^verify Agreement Date field should be non mandatory calendar$")
	public void verify_agreement_date_field_should_be_non_mandatory_calendar() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAgreementDateCalendarInput(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAgreementDateCalendarInput().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAgreementDateCalendarInput().getAttribute("ng-reflect-icon")
				.contains(propertyDetailsTestData.CalendarAttributeVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsAgreementDateMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status,
				" Agreement Date field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to select the date from the Agreement Date field$")
	public void user_can_able_to_select_the_date_from_the_agreement_date_field() throws Throwable {
		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * propertyDetailsObj.propertyDetailsAgreementDateCalendarInput(), 5, 1);
		 * propertyDetailsObj.propertyDetailsAgreementDateCalendarInput().click();
		 * 
		 * String yearXpath = "//span[text()=' " +
		 * propertyDetailsTestData.AgreementdateYear + " ']"; String monthXpath =
		 * "//span[text()=' " + propertyDetailsTestData.AgreementdateMonth + " ']";
		 * String dayXpath = "//span[text()='" +
		 * propertyDetailsTestData.AgreementdateDay + "']"; //
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * ulsSchemeMasterObj.schemeMasterMonthField(), 3, 1); //
		 * ulsSchemeMasterObj.schemeMasterMonthField().click(); //
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * commenWebElementsObj.calendarYearField(), 3, 1);
		 * commenWebElementsObj.calendarYearField().click(); //
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver, //
		 * driver.findElement(By.xpath(yearXpath)), 3, 1); for (int i = 0; i <= 10; i++)
		 * { try { driver.findElement(By.xpath(yearXpath)).click(); break; } catch
		 * (Exception e) { if (i == 10) { Assert.fail(e.getMessage()); } } }
		 * driver.findElement(By.xpath(monthXpath)).click(); List<WebElement>
		 * findElements = driver.findElements(By.xpath(dayXpath)); for (WebElement
		 * element : findElements) { try { element.click(); break; } catch (Exception e)
		 * {
		 * 
		 * } }
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAgreementDateCalendarInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsAgreementDateCalendarInputBox().click();
		propertyDetailsObj.propertyDetailsAgreementDateCalendarInputBox()
				.sendKeys(propertyDetailsTestData.AgreementDate);
	}

	@Then("^verify Agreement Validity Date field should be non mandatory calendar$")
	public void verify_agreement_validity_date_field_should_be_non_mandatory_calendar() throws Throwable {
		boolean status = false;
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAgreementValidityDateCalendarInput(), 10, 1);
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAgreementValidityDateCalendarInput().isDisplayed());
		Assert.assertTrue(propertyDetailsObj.propertyDetailsAgreementValidityDateCalendarInput()
				.getAttribute("ng-reflect-icon").contains(propertyDetailsTestData.CalendarAttributeVerification));
		for (int i = 0; i <= 15; i++) {
			try {
				propertyDetailsObj.propertyDetailsAgreementValidityDateMandatoryCheck().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 15) {
					status = true;
				}
			}
		}
		softAssert.assertTrue(status,
				" Agreement Validity Date field should be non mandatroy field but here its a mandatory one");
	}

	@And("^user can able to select the date from the Agreement Validity Date field$")
	public void user_can_able_to_select_the_date_from_the_agreement_validity_date_field() throws Throwable {
		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * propertyDetailsObj.propertyDetailsAgreementValidityDateCalendarInput(), 5,
		 * 1);
		 * propertyDetailsObj.propertyDetailsAgreementValidityDateCalendarInput().click(
		 * );
		 * 
		 * String yearXpath = "//span[text()=' " +
		 * propertyDetailsTestData.AgreementValiditydateYear + " ']"; String monthXpath
		 * = "//span[text()=' " + propertyDetailsTestData.AgreementValiditydateMonth +
		 * " ']"; String dayXpath = "//span[text()='" +
		 * propertyDetailsTestData.AgreementValiditydateday + "']"; //
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * ulsSchemeMasterObj.schemeMasterMonthField(), 3, 1); //
		 * ulsSchemeMasterObj.schemeMasterMonthField().click(); //
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * commenWebElementsObj.calendarYearField(), 3, 1);
		 * commenWebElementsObj.calendarYearField().click(); //
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver, //
		 * driver.findElement(By.xpath(yearXpath)), 3, 1); for (int i = 0; i <= 10; i++)
		 * { try { driver.findElement(By.xpath(yearXpath)).click(); break; } catch
		 * (Exception e) { if (i == 10) { Assert.fail(e.getMessage()); } } }
		 * driver.findElement(By.xpath(monthXpath)).click(); List<WebElement>
		 * findElements = driver.findElements(By.xpath(dayXpath)); for (WebElement
		 * element : findElements) { try { element.click(); break; } catch (Exception e)
		 * {
		 * 
		 * } } }
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAgreementValidityDateCalendarInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsAgreementValidityDateCalendarInputBox().click();
		propertyDetailsObj.propertyDetailsAgreementValidityDateCalendarInputBox()
				.sendKeys(propertyDetailsTestData.AgreementvalidityDate);
	}

	@And("^save the property details record$")
	public void save_the_property_details_record() throws Throwable {

		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsSaveButton());
				propertyDetailsObj.propertyDetailsSaveButton().click();
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify record is saved in the system$")
	public void verify_record_is_saved_in_the_system() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsAlertBox(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsAlertBox().getText(),
				propertyDetailsTestData.SaveVerification);
		softAssert.assertAll();
	}

	@Then("^verify security type field show the verification for blank field$")
	public void verify_security_type_field_show_the_verification_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsSecurityTypeFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsSecurityTypeFieldValidation().getText(),
				propertyDetailsTestData.BalnkFieldVerification);
	}

	@Then("^verify Property city field show the verification for blank field$")
	public void verify_property_city_field_show_the_verification_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyCityFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsPropertyCityFieldValidation().getText(),
				propertyDetailsTestData.BalnkFieldVerification);
	}

	@Then("^verify Type Of Transaction field show the verification for blank field$")
	public void verify_type_of_transaction_field_show_the_verification_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsTypeOfTransactionFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsTypeOfTransactionFieldValidation().getText(),
				propertyDetailsTestData.BalnkFieldVerification);
	}

	@Then("^verify Purchased from field show the verification for blank field$")
	public void verify_purchased_from_field_show_the_verification_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPurchasedFromFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsPurchasedFromFieldValidation().getText(),
				propertyDetailsTestData.BalnkFieldVerification);
	}

	@Then("^verify Property Type field show the verification for blank field$")
	public void verify_property_type_field_show_the_verification_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyTypeFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsPropertyTypeFieldValidation().getText(),
				propertyDetailsTestData.BalnkFieldVerification);
	}

	@Then("^verify APF Status field show the verification for blank field$")
	public void verify_apf_status_field_show_the_verification_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAPFStatusFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsAPFStatusFieldValidation().getText(),
				propertyDetailsTestData.BalnkFieldVerification);
	}

	@Then("^verify Construction Status field show the verification for blank field$")
	public void verify_construction_status_field_show_the_verification_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsConstructionStatusdValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsConstructionStatusdValidation().getText(),
				propertyDetailsTestData.BalnkFieldVerification);
	}

	@Then("^verify Property category field show the verification for blank field$")
	public void verify_property_category_field_show_the_verification_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPropertyCategorydValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsPropertyCategorydValidation().getText(),
				propertyDetailsTestData.BalnkFieldVerification);
	}

	@Then("^verify Occupancy Status field show the verification for blank field$")
	public void verify_occupancy_status_field_show_the_verification_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsOccupancyStatusFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsOccupancyStatusFieldValidation().getText(),
				propertyDetailsTestData.BalnkFieldVerification);
	}

	@Then("^verify name Of the Developer field show the verification for blank field$")
	public void verify_name_of_the_developer_field_show_the_verification_for_blank_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsNameoftheDeveloperFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsNameoftheDeveloperFieldValidation().getText(),
				propertyDetailsTestData.BalnkFieldVerification);
	}

	@Then("^verify name of the charge holder field should show the validation post enter only numeric input$")
	public void verify_name_of_the_charge_holder_field_should_show_the_validation_post_enter_only_numeric_input()
			throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox());
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox().click();
		propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox()
				.sendKeys(propertyDetailsTestData.NumericTestInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsNameoftheChargeHolderFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsNameoftheChargeHolderFieldValidation().getText(),
				propertyDetailsTestData.NumericFieldValidation);
	}

	@Then("^verify address line one field should through the validation post enter the special charecter input$")
	public void verify_address_line_one_field_should_through_the_validation_post_enter_the_special_charecter_input()
			throws Throwable {
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsAddressLine1InputBox());
				propertyDetailsObj.propertyDetailsAddressLine1InputBox().click();
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
		propertyDetailsObj.propertyDetailsAddressLine1InputBox()
				.sendKeys(propertyDetailsTestData.SpecialCharecterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAddressLineOneFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsAddressLineOneFieldValidation().getText(),
				propertyDetailsTestData.SpecialCharecterValidation);
	}

	@Then("^verify address line two field should through the validation post enter the special charecter input$")
	public void verify_address_line_two_field_should_through_the_validation_post_enter_the_special_charecter_input()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAddressLine2InputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsAddressLine2InputBox().click();
		propertyDetailsObj.propertyDetailsAddressLine2InputBox()
				.sendKeys(propertyDetailsTestData.SpecialCharecterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAddressLineTwoFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsAddressLineTwoFieldValidation().getText(),
				propertyDetailsTestData.SpecialCharecterValidation);
	}

	@Then("^verify address line three field should through the validation post enter the special charecter input$")
	public void verify_address_line_three_field_should_through_the_validation_post_enter_the_special_charecter_input()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAddressLine3InputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsAddressLine3InputBox().click();
		propertyDetailsObj.propertyDetailsAddressLine3InputBox()
				.sendKeys(propertyDetailsTestData.SpecialCharecterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsAddressLineThreeFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsAddressLineThreeFieldValidation().getText(),
				propertyDetailsTestData.SpecialCharecterValidation);
	}

	@Then("^verify District and neighboorhood field should through the validation post enter the special charecter input$")
	public void verify_district_and_neighboorhood_field_should_through_the_validation_post_enter_the_special_charecter_input()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsDistrictNeighbourhoodInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsDistrictNeighbourhoodInputBox().click();
		propertyDetailsObj.propertyDetailsDistrictNeighbourhoodInputBox()
				.sendKeys(propertyDetailsTestData.SpecialCharecterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsDistrictNeighbourhoodValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsDistrictNeighbourhoodValidation().getText(),
				propertyDetailsTestData.SpecialCharecterValidation);
	}

	@Then("^verify name of the charge holder field should through the validation post enter the special charecter input$")
	public void verify_name_of_the_charge_holder_field_should_through_the_validation_post_enter_the_special_charecter_input()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox().click();
		propertyDetailsObj.propertyDetailsNameoftheChargeHolderInputBox()
				.sendKeys(propertyDetailsTestData.SpecialCharecterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsDistrictNeighbourhoodValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsDistrictNeighbourhoodValidation().getText(),
				propertyDetailsTestData.SpecialCharecterValidation);
	}
	@Then("^verify pincode field should through the validation post enter the special charecter input$")
    public void verify_pincode_field_should_through_the_validation_post_enter_the_special_charecter_input() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPincodeInputBox(), 10, 1);
		propertyDetailsObj.propertyDetailsPincodeInputBox().click();
		propertyDetailsObj.propertyDetailsPincodeInputBox()
				.sendKeys(propertyDetailsTestData.SpecialCharecterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				propertyDetailsObj.propertyDetailsPincodeFieldValidation(), 10, 1);
		Assert.assertEquals(propertyDetailsObj.propertyDetailsPincodeFieldValidation().getText(),
				propertyDetailsTestData.PincodeValidation);
    }
	@When("^user enter the pincode minimum six digits$")
    public void user_enter_the_pincode_minimum_six_digits() throws Throwable {
waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsPincodeInputBox(), 10, 1);
propertyDetailsObj.propertyDetailsPincodeInputBox().clear();
propertyDetailsObj.propertyDetailsPincodeInputBox().click();
propertyDetailsObj.propertyDetailsPincodeInputBox().sendKeys(propertyDetailsTestData.minimumPincodeValue);
	}

    @Then("^verify system should through the validation for minim pincode validation$")
    public void verify_system_should_through_the_validation_for_minim_pincode_validation() throws Throwable {
     waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsPincodeFieldValidation(), 10, 1);
    Assert.assertEquals(propertyDetailsObj.propertyDetailsPincodeFieldValidation().getText(), propertyDetailsTestData.minimumPincodeValidation);
    }
    @Then("^verify approx property area field should not allow user to enter alphabets$")
    public void verify_approx_property_area_field_should_not_allow_user_to_enter_alphabets() throws Throwable {
       for(int i=0;i<=10;i++)
       {
    	   try
    	   {
    		javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsApproxPropertyAreaInputBox());   
    		break;
    	   }
    	   catch(Exception e)
    	   {
    		   if(i==10)
    		   {
    			   Assert.fail(e.getMessage());
    		   }
    	   }
       }
       propertyDetailsObj.propertyDetailsApproxPropertyAreaInputBox().click();
       propertyDetailsObj.propertyDetailsApproxPropertyAreaInputBox().sendKeys(propertyDetailsTestData.AlphaNumericInput);
       String placeHolder = propertyDetailsObj.propertyDetailsApproxPropertyAreaDataHolder().getAttribute("ng-reflect-model");
       char[] placeHolderArray = placeHolder.toCharArray();
      for(int i=0;i<placeHolderArray.length;i++)
      {
       boolean intStatus = Character.isDigit(placeHolderArray[i]);
       Assert.assertTrue(intStatus, " approx property allow "+placeHolderArray[i]+" hence test case failed");
      }
      
    }

    @Then("^verify built up plot area field should not allow user to enter alphabets$")
    public void verify_built_up_plot_area_field_should_not_allow_user_to_enter_plphabets() throws Throwable {
    	for(int i=0;i<=10;i++)
        {
     	   try
     	   {
     		javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsBuiltUpPlotAreaInputBox());   
     		break;
     	   }
     	   catch(Exception e)
     	   {
     		   if(i==10)
     		   {
     			   Assert.fail(e.getMessage());
     		   }
     	   }
        }
        propertyDetailsObj.propertyDetailsBuiltUpPlotAreaInputBox().click();
        propertyDetailsObj.propertyDetailsBuiltUpPlotAreaInputBox().sendKeys(propertyDetailsTestData.AlphaNumericInput);
        String placeHolder = propertyDetailsObj.propertyDetailsBuiltUpPlotAreaDataHolder().getAttribute("ng-reflect-model");
        char[] placeHolderArray = placeHolder.toCharArray();
       for(int i=0;i<placeHolderArray.length;i++)
       {
        boolean intStatus = Character.isDigit(placeHolderArray[i]);
        Assert.assertTrue(intStatus, " built up plot area allow "+placeHolderArray[i]+" hence test case failed");
       }       
    }

    @Then("^verify carpet area field should not allow user to enter alphabets$")
    public void verify_carpet_area_field_should_not_allow_user_to_enter_plphabets() throws Throwable {
    	for(int i=0;i<=10;i++)
        {
     	   try
     	   {
     		javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsCarpetAreaInputBox());   
     		break;
     	   }
     	   catch(Exception e)
     	   {
     		   if(i==10)
     		   {
     			   Assert.fail(e.getMessage());
     		   }
     	   }
        }
        propertyDetailsObj.propertyDetailsCarpetAreaInputBox().click();
        propertyDetailsObj.propertyDetailsCarpetAreaInputBox().sendKeys(propertyDetailsTestData.AlphaNumericInput);
        String placeHolder = propertyDetailsObj.propertyDetailsCarpetAreaDataHolder().getAttribute("ng-reflect-model");
        char[] placeHolderArray = placeHolder.toCharArray();
       for(int i=0;i<placeHolderArray.length;i++)
       {
        boolean intStatus = Character.isDigit(placeHolderArray[i]);
        Assert.assertTrue(intStatus, " built up plot area allow "+placeHolderArray[i]+" hence test case failed");
       }       
    }

    @Then("^verify percentage of completion field should not allow user to enter alphabets$")
    public void verify_percentage_of_completion_field_should_not_allow_user_to_enter_plphabets() throws Throwable {
    	for(int i=0;i<=10;i++)
        {
     	   try
     	   {
     		javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsPercentageOfCompletionInputBox());   
     		break;
     	   }
     	   catch(Exception e)
     	   {
     		   if(i==10)
     		   {
     			   Assert.fail(e.getMessage());
     		   }
     	   }
        }
        propertyDetailsObj.propertyDetailsPercentageOfCompletionInputBox().click();
        propertyDetailsObj.propertyDetailsPercentageOfCompletionInputBox().sendKeys(propertyDetailsTestData.AlphaNumericInput);
        String placeHolder = propertyDetailsObj.propertyDetailsPercentageOfCompletionDataHolder().getAttribute("ng-reflect-model");
        char[] placeHolderArray = placeHolder.toCharArray();
       for(int i=0;i<placeHolderArray.length;i++)
       {
        boolean intStatus = Character.isDigit(placeHolderArray[i]);
        Assert.assertTrue(intStatus, " built up plot area allow "+placeHolderArray[i]+" hence test case failed");
       }              
    }
    @Then("^verify the functionality of back button in property details screen$")
    public void verify_the_functionality_of_back_button_in_property_details_screen() throws Throwable {
     for(int i=0;i<=15;i++)
     {
    	 try
    	 {
  		 javascriptHelper.scrollIntoView(propertyDetailsObj.propertyDetailsBackButton());
  		propertyDetailsObj.propertyDetailsBackButton().click();	 
  		 break;
    		 
    	 }
    	 catch(Exception e)
    	 {
    		 if(i==15)
    		 {
    			 Assert.fail(e.getMessage());
    		 }
    	 }
     }
     waitHelper.waitForElementToVisibleWithFluentWait(driver, propertyDetailsObj.propertyDetailsBackButtonVerification(), 10, 1);
     Assert.assertTrue(propertyDetailsObj.propertyDetailsBackButtonVerification().isDisplayed());
    }

}
