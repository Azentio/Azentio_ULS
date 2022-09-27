package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import dataProvider.JsonConfig;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ULS_CustomerAddressDetailsObj;
import resources.BaseClass;
import testDataType.ULS_CustomerAddressDetailsTestDataType;

public class ULS_CustomerAddressDetails_Steps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	JsonConfig jsonConfig = new JsonConfig();
	ULS_CustomerAddressDetailsTestDataType customerAddressDetailsTestdata = jsonConfig
			.getCustomerAddressDetailsTestdataByName("Maker");
	ULS_CustomerAddressDetailsObj customerAddressDetailsObj = new ULS_CustomerAddressDetailsObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	SoftAssert softAssert = new SoftAssert();
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);

	@And("^go to additional customer info tab$")
	public void go_to_additional_customer_info_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.ulsAdditionalCustomerInfoTab(), 10, 1);
		customerAddressDetailsObj.ulsAdditionalCustomerInfoTab().click();
	}

	@And("^select the additional customer info first record$")
	public void select_the_additional_customer_info_first_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAdditionalInfoFirstRecord(), 10, 1);
		customerAddressDetailsObj.customerAdditionalInfoFirstRecord().click();
	}

	@And("^click on add button under the address details$")
	public void click_on_add_button_under_the_address_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetailsAddButton(), 10, 1);
		customerAddressDetailsObj.customerAddressDetailsAddButton().click();
	}

	@And("^click on save button without filling the mandatory field$")
	public void click_on_save_button_without_filling_the_mandatory_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.csutomerAddressDetailsSaveButton(), 10, 1);
		customerAddressDetailsObj.csutomerAddressDetailsSaveButton().click();
	}

	@Then("^verify address type field should show the validation message$")
	public void verify_address_type_field_should_show_the_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsAddressTypeFieldValidation(), 10, 1);

		softAssert.assertEquals(customerAddressDetailsObj.addressDetailsAddressTypeFieldValidation().getText(),
				customerAddressDetailsTestdata.BlankFieldValidation);

	}

	@Then("^verify address status field should show the validation message$")
	public void verify_address_status_field_should_show_the_validation_message() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				status = customerAddressDetailsObj.addressDetailsAddressStatusFieldValidation().isDisplayed();

			} catch (Exception e) {
				if (i == 15) {
					status = false;
				}
			}
		}
		if (status == true) {
			Assert.assertEquals(
					customerAddressDetailsObj.addressDetailsAddressStatusFieldValidation().getText(),
					customerAddressDetailsTestdata.BlankFieldValidation);
		} else {
			softAssert.assertTrue(status, " address status field is not showing the validation  hence test step failed");
		}
	}
	

	@Then("^verify Residential or Occupancy Status should show validation message$")
	public void verify_residential_or_occupancy_status_should_show_validation_message() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				status = customerAddressDetailsObj.addressDetailsOccupancydateFieldValidation().isDisplayed();

			} catch (Exception e) {
				if (i == 15) {
					status = false;
				}
			}
		}
		if (status == true) {
			Assert.assertEquals(
					customerAddressDetailsObj.addressDetailsOccupancydateFieldValidation().getText(),
					customerAddressDetailsTestdata.BlankFieldValidation);
		} else {
			softAssert.assertTrue(status, " Occupancy status field is not showing the validation  hence test step failed");
		}
	}

	@Then("^verify address line 1 field should show the validation message$")
	public void verify_address_line_1_field_should_show_the_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsAddressLineOneFieldValidation(), 10, 1);

		softAssert.assertEquals(customerAddressDetailsObj.addressDetailsAddressLineOneFieldValidation().getText(),
				customerAddressDetailsTestdata.BlankFieldValidation);
	}

	@Then("^verify address line 2 field should show the validation message$")
	public void verify_address_line_2_field_should_show_the_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsAddressLineTwoFieldValidation(), 10, 1);

		softAssert.assertEquals(customerAddressDetailsObj.addressDetailsAddressLineTwoFieldValidation().getText(),
				customerAddressDetailsTestdata.BlankFieldValidation);
	}

	@Then("^verify Country field should show the validation message$")
	public void verify_country_field_should_show_the_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsCountryTwoFieldValidation(), 10, 1);

		softAssert.assertEquals(customerAddressDetailsObj.addressDetailsCountryTwoFieldValidation().getText(),
				customerAddressDetailsTestdata.BlankFieldValidation);
	}

	@Then("^verify provice id field should show the validation message$")
	public void verify_provice_id_field_should_show_the_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsProvinceIDFieldValidation(), 10, 1);

		softAssert.assertEquals(customerAddressDetailsObj.addressDetailsProvinceIDFieldValidation().getText(),
				customerAddressDetailsTestdata.BlankFieldValidation);
	}

	@Then("^verify  Neighbourhood District Name  field should show the validation message$")
	public void verify_neighbourhood_district_name_field_should_show_the_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsNeighbourhoodDistrictNameFieldValidation(), 10, 1);

		softAssert.assertEquals(
				customerAddressDetailsObj.addressDetailsNeighbourhoodDistrictNameFieldValidation().getText(),
				customerAddressDetailsTestdata.BlankFieldValidation);
	}

	@Then("^verify City id field should show the validation message$")
	public void verify_city_id_field_should_show_the_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsCityIdFieldValidation(), 10, 1);

		softAssert.assertEquals(customerAddressDetailsObj.addressDetailsCityIdFieldValidation().getText(),
				customerAddressDetailsTestdata.BlankFieldValidation);
	}

	@Then("^verify Zip Code field should show the validation message$")
	public void verify_zip_code_field_should_show_the_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsZipCodeFieldValidation(), 10, 1);

		softAssert.assertEquals(customerAddressDetailsObj.addressDetailsZipCodeFieldValidation().getText(),
				customerAddressDetailsTestdata.BlankFieldValidation);
	}

	@Then("^verify Occupancy Date field should show the validation message$")
	public void verify_occupancy_date_field_should_show_the_validation_message() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerAddressDetailsObj.addressDetailsOccupancydateFieldValidation());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}

		softAssert.assertEquals(customerAddressDetailsObj.addressDetailsOccupancydateFieldValidation().getText(),
				customerAddressDetailsTestdata.BlankFieldValidation);
	}

	@Then("^verify system should show the validation message post entering the special character input in address line one input box$")
	public void verify_system_should_show_the_validation_message_post_entering_the_special_character_input_in_address_line_one_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_AddressLine1Field(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_AddressLine1Field().click();
		customerAddressDetailsObj.customerAddressDetails_AddressLine1Field()
				.sendKeys(customerAddressDetailsTestdata.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsAddressLineOneFieldValidation(), 10, 1);
		Assert.assertEquals(customerAddressDetailsObj.addressDetailsAddressLineOneFieldValidation().getText(),
				customerAddressDetailsTestdata.specialCharacterValidation);
	}

	@Then("^verify system should show the validation message post entering the special character input in address line two input box$")
	public void verify_system_should_show_the_validation_message_post_entering_the_special_character_input_in_address_line_two_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_AddressLine2Field(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_AddressLine2Field().click();
		customerAddressDetailsObj.customerAddressDetails_AddressLine2Field()
				.sendKeys(customerAddressDetailsTestdata.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsAddressLineTwoFieldValidation(), 10, 1);
		Assert.assertEquals(customerAddressDetailsObj.addressDetailsAddressLineTwoFieldValidation().getText(),
				customerAddressDetailsTestdata.specialCharacterValidation);
	}

	@Then("^verify system should show the validation message post entering the special character input in neighboorhood district name input box$")
	public void verify_system_should_show_the_validation_message_post_entering_the_special_character_input_in_neighboorhood_district_name_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_NeighbourhoodDistrictNameField(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_NeighbourhoodDistrictNameField().click();
		customerAddressDetailsObj.customerAddressDetails_NeighbourhoodDistrictNameField()
				.sendKeys(customerAddressDetailsTestdata.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsNeighbourhoodDistrictNameFieldValidation(), 10, 1);
		Assert.assertEquals(
				customerAddressDetailsObj.addressDetailsNeighbourhoodDistrictNameFieldValidation().getText(),
				customerAddressDetailsTestdata.specialCharacterValidation);
	}

	@Then("^verify system should show the validation message post entering the special character input in Zip code input box$")
	public void verify_system_should_show_the_validation_message_post_entering_the_special_character_input_in_zip_code_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_ZipCodeField(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_ZipCodeField().click();
		customerAddressDetailsObj.customerAddressDetails_ZipCodeField()
				.sendKeys(customerAddressDetailsTestdata.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsZipCodeFieldValidation(), 10, 1);
		Assert.assertEquals(customerAddressDetailsObj.addressDetailsZipCodeFieldValidation().getText(),
				customerAddressDetailsTestdata.specialCharacterValidation);
	}

	@Then("^verify system should show the validation message post entering the special character input in Latitude details of the address input box$")
	public void verify_system_should_show_the_validation_message_post_entering_the_special_character_input_in_latitude_details_of_the_address_input_box()
			throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_LatitudeDetailOfTheAddressField(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_LatitudeDetailOfTheAddressField().click();
		customerAddressDetailsObj.customerAddressDetails_LatitudeDetailOfTheAddressField()
				.sendKeys(customerAddressDetailsTestdata.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsLatitudeDetailsOfTheAddressFieldValidation(), 10, 1);
		Assert.assertEquals(
				customerAddressDetailsObj.addressDetailsLatitudeDetailsOfTheAddressFieldValidation().getText(),
				customerAddressDetailsTestdata.specialCharacterValidation);
	}

	@Then("^verify system should show the validation message post entering the special character input in Logitude details of the address input box$")
	public void verify_system_should_show_the_validation_message_post_entering_the_special_character_input_in_logitude_details_of_the_address_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_LongitudeDetailOfTheAddressField(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_LongitudeDetailOfTheAddressField().click();
		customerAddressDetailsObj.customerAddressDetails_LongitudeDetailOfTheAddressField()
				.sendKeys(customerAddressDetailsTestdata.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsLongitudeDetailsOfTheAddressFieldValidation(), 10, 1);
		Assert.assertEquals(
				customerAddressDetailsObj.addressDetailsLongitudeDetailsOfTheAddressFieldValidation().getText(),
				customerAddressDetailsTestdata.specialCharacterValidation);
	}

	@Then("^verify system should show the validation message post entering the special character input in Land mark input box$")
	public void verify_system_should_show_the_validation_message_post_entering_the_special_character_input_in_land_mark_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_LandmarkField(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_LandmarkField().click();
		customerAddressDetailsObj.customerAddressDetails_LandmarkField()
				.sendKeys(customerAddressDetailsTestdata.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsLandMarkFieldValidation(), 10, 1);
		Assert.assertEquals(customerAddressDetailsObj.addressDetailsLandMarkFieldValidation().getText(),
				customerAddressDetailsTestdata.specialCharacterValidation);
	}

	@Then("^verify system should show the validation message post entering the special character input in Landloard Name input box$")
	public void verify_system_should_show_the_validation_message_post_entering_the_special_character_input_in_landloard_name_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_LandlordNameField(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_LandlordNameField().click();
		customerAddressDetailsObj.customerAddressDetails_LandlordNameField()
				.sendKeys(customerAddressDetailsTestdata.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailsLandLoardnameFieldValidation(), 10, 1);
		Assert.assertEquals(customerAddressDetailsObj.addressDetailsLandLoardnameFieldValidation().getText(),
				customerAddressDetailsTestdata.specialCharacterValidation);
	}

	@Then("^verify system should show the validation message post entering the special character input in Landloard mobile number input box$")
	public void verify_system_should_show_the_validation_message_post_entering_the_special_character_input_in_landloard_mobile_number_input_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_LandlordMobileNumberField(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_LandlordMobileNumberField().click();
		customerAddressDetailsObj.customerAddressDetails_LandlordMobileNumberField()
				.sendKeys(customerAddressDetailsTestdata.SpecialCharacterInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailslandLoardMobileNumberFieldValidation(), 10, 1);
		Assert.assertEquals(customerAddressDetailsObj.addressDetailslandLoardMobileNumberFieldValidation().getText(),
				customerAddressDetailsTestdata.MobileNumberValidation);
	}

	@Then("^verify system should show the validation message post enter the above seven digit pin code$")
	public void verify_system_should_show_the_validation_message_post_enter_the_above_seven_digit_pin_code()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_ZipCodeField(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_ZipCodeField().clear();
		customerAddressDetailsObj.customerAddressDetails_ZipCodeField().click();
		customerAddressDetailsObj.customerAddressDetails_ZipCodeField()
				.sendKeys(customerAddressDetailsTestdata.InvalidPincode);
		Assert.assertEquals(customerAddressDetailsObj.addressDetailsZipCodeFieldValidation().getText(),
				customerAddressDetailsTestdata.pincodeValidation);
	}

	@Then("^verify system should show the validation post enter the negative po box number$")
	public void verify_system_should_show_the_validation_post_enter_the_negative_po_box_number() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField(), 10, 1);
		customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField().clear();
		customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField().click();
		customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField()
				.sendKeys(customerAddressDetailsTestdata.NegativeInput);
		Assert.assertEquals(customerAddressDetailsObj.addressDetailsPoBoxNumberFieldValidation().getText(),
				customerAddressDetailsTestdata.specialCharacterValidation);
	}

	@Then("^verify system should show the validation post enter the invalid landlord mobile number$")
	public void verify_shsyem_should_show_the_validation_post_enter_the_invalid_landlord_mobile_number()
			throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper
						.scrollIntoView(customerAddressDetailsObj.customerAddressDetails_LandlordMobileNumberField());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerAddressDetailsObj.customerAddressDetails_LandlordMobileNumberField().clear();
		customerAddressDetailsObj.customerAddressDetails_LandlordMobileNumberField().click();
		customerAddressDetailsObj.customerAddressDetails_LandlordMobileNumberField()
				.sendKeys(customerAddressDetailsTestdata.InvalidMobileNumber);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.addressDetailslandLoardMobileNumberFieldValidation(), 10, 1);
		Assert.assertEquals(customerAddressDetailsObj.addressDetailslandLoardMobileNumberFieldValidation().getText(),
				customerAddressDetailsTestdata.MobileNumberValidation);
	}

	@Then("^verify system should not allow user to enter character input in po box number$")
	public void verify_system_should_not_allow_user_to_enter_character_input_in_po_box_number() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField().clear();
		customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField().click();
		customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField()
				.sendKeys(customerAddressDetailsTestdata.alphaNumericInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetailsPoBoxNumberDataHolder(), 10, 1);
		char[] dataCharArray = customerAddressDetailsObj.customerAddressDetailsPoBoxNumberDataHolder()
				.getAttribute("ng-reflect-model").toCharArray();
		for (int i = 0; i < dataCharArray.length; i++) {
			if (Character.isAlphabetic(dataCharArray[i])) {
				Assert.fail("System shoudl not allow characters but here its sllowed " + dataCharArray[i]);
			}
		}
	}

	@Then("^verify system should not allow user to enter character input in duration of stay$")
	public void verify_system_should_not_allow_user_to_enter_character_input_in_duration_of_stay() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper
						.scrollIntoView(customerAddressDetailsObj.customerAddressDetailsDurationOfStayInputBox());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerAddressDetailsObj.customerAddressDetailsDurationOfStayInputBox().clear();
		customerAddressDetailsObj.customerAddressDetailsDurationOfStayInputBox().click();
		customerAddressDetailsObj.customerAddressDetailsDurationOfStayInputBox()
				.sendKeys(customerAddressDetailsTestdata.alphaNumericInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetailsDurationOfStayDataHolder(), 10, 1);
		char[] dataCharArray = customerAddressDetailsObj.customerAddressDetailsDurationOfStayDataHolder()
				.getAttribute("ng-reflect-model").toCharArray();
		for (int i = 0; i < dataCharArray.length; i++) {
			if (Character.isAlphabetic(dataCharArray[i])) {
				Assert.fail("System shoudl not allow characters but here its sllowed " + dataCharArray[i]);
			}
		}
	}

	@Then("^verify system should not allow user to enter character input in Rent amount$")
	public void verify_system_should_not_allow_user_to_enter_character_input_in_rent_amount() throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerAddressDetailsObj.customerAddressDetails_RentAmountField());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerAddressDetailsObj.customerAddressDetails_RentAmountField().clear();
		customerAddressDetailsObj.customerAddressDetails_RentAmountField().click();
		customerAddressDetailsObj.customerAddressDetails_RentAmountField()
				.sendKeys(customerAddressDetailsTestdata.alphaNumericInput);
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				customerAddressDetailsObj.customerAddressDetailsRentAmountDataHolder(), 10, 1);
		char[] dataCharArray = customerAddressDetailsObj.customerAddressDetailsRentAmountDataHolder()
				.getAttribute("ng-reflect-model").toCharArray();
		for (int i = 0; i < dataCharArray.length; i++) {
			if (Character.isAlphabetic(dataCharArray[i])) {
				Assert.fail("System shoudl not allow characters but here its sllowed " + dataCharArray[i]);
			}
		}
	}

	@When("^user enter above 7 digit in po box number field$")
	public void user_enter_above_7_digit_in_po_box_number_field() throws Throwable {
		
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField().clear();
		customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField().click();
		customerAddressDetailsObj.customerAddressDetails_PoBoxNumberField()
				.sendKeys(customerAddressDetailsTestdata.invalidPoBoxNumber);

	}

	@Then("^system should show the validation for po box number$")
	public void system_should_show_the_validation_for_po_box_number() throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 20; i++) {
			try {
				status = customerAddressDetailsObj.addressDetailsPoBoxNumberFieldValidation().isDisplayed();

			} catch (Exception e) {
				if (i == 15) {
					status = false;
				}
			}
		}
		if (status == true) {
			Assert.assertEquals(customerAddressDetailsObj.addressDetailsPoBoxNumberFieldValidation().getText(),
					customerAddressDetailsTestdata.PoBoxValidationMessage);
		} else {
			softAssert.assertTrue(status,
					" po Box field should allow only 7 digit input but here its accepting more that that out TestData is : "
							+ customerAddressDetailsTestdata.invalidPoBoxNumber);
		}
		softAssert.assertAll();
	}

	@Then("^verify system should show the validation for invalid mobile number in mobile number field$")
	public void verify_system_should_show_the_validation_for_invalid_mobile_number_in_mobile_number_field()
			throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper
						.scrollIntoView(customerAddressDetailsObj.customerAddressDetails_MobileNumberPrimaryField());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerAddressDetailsObj.customerAddressDetails_MobileNumberPrimaryField().clear();
		customerAddressDetailsObj.customerAddressDetails_MobileNumberPrimaryField().click();
		customerAddressDetailsObj.customerAddressDetails_MobileNumberPrimaryField()
				.sendKeys(customerAddressDetailsTestdata.InvalidMobileNumber);
		for (int i = 0; i <= 20; i++) {
			try {
				status = customerAddressDetailsObj.addressDetailsMobileNumberPrimary1FieldValidation().isDisplayed();

			} catch (Exception e) {
				if (i == 15) {
					status = false;
				}
			}
		}
		if (status == true) {
			Assert.assertEquals(customerAddressDetailsObj.addressDetailsMobileNumberPrimary1FieldValidation().getText(),
					customerAddressDetailsTestdata.PoBoxValidationMessage);
		} else {
			softAssert.assertTrue(status, " Mobile Number field validation is not comming ");
		}
	}

	@Then("^verify system should show the validation for invalid mobile number in mobile number secondary field$")
	public void verify_system_should_show_the_validation_for_invalid_mobile_number_in_mobile_number_secondary_field()
			throws Throwable {
		boolean status = false;
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper
						.scrollIntoView(customerAddressDetailsObj.customerAddressDetails_MobileNumberPrimary2Field());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		customerAddressDetailsObj.customerAddressDetails_MobileNumberPrimary2Field().clear();
		customerAddressDetailsObj.customerAddressDetails_MobileNumberPrimary2Field().click();
		customerAddressDetailsObj.customerAddressDetails_MobileNumberPrimary2Field()
				.sendKeys(customerAddressDetailsTestdata.MobileNumberValidation);
		for (int i = 0; i <= 20; i++) {
			try {
				status = customerAddressDetailsObj.addressDetailsMobileNumberPrimary22FieldValidation().isDisplayed();

			} catch (Exception e) {
				if (i == 15) {
					status = false;
				}
			}
		}
		if (status == true) {
			Assert.assertEquals(
					customerAddressDetailsObj.addressDetailsMobileNumberPrimary22FieldValidation().getText(),
					customerAddressDetailsTestdata.MobileNumberValidation);
		} else {
			softAssert.assertTrue(status, " Mobile Number field 2 validation is not comming ");
		}
		softAssert.assertAll();
	}

}
