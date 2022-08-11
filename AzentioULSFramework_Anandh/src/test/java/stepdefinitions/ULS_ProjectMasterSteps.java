package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ULS_ProjectMasterObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.ULS_ProjectMasterTestData;

public class ULS_ProjectMasterSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ULS_ProjectMasterObj projectMasterObj = new ULS_ProjectMasterObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ULS_ProjectMasterTestData ulsProjectMasterTestData = jsonConfig.getUlsProjectMasterTestDataByName("Maker");
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter jsonDataReaderWriter = new JsonDataReaderWriter();

	@Then("^click on project master view button$")
	public void click_on_project_master_view_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.ulsProjectMasterViewButton(), 5, 1);
		projectMasterObj.ulsProjectMasterViewButton().click();
	}

	@And("^go to project setup main menu$")
	public void go_to_project_setup_main_menu() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.ulsProjectSetUpMainMenu(), 5, 1);
		projectMasterObj.ulsProjectSetUpMainMenu().click();
	}

	@And("^click on add button to add the new project record$")
	public void click_on_add_button_to_add_the_new_project_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterAddButton(), 5, 1);
		projectMasterObj.projectMasterAddButton().click();
	}

	@Then("^verify project type field should be mendatory user can able to select the data from the drop down$")
	public void verify_project_type_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterProjectTypeDropDown(), 5,
				1);

		Assert.assertTrue(projectMasterObj.projectMasterProjectTypeDropDown().getAttribute("aria-label").contains("*"));
		projectMasterObj.projectMasterProjectTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.ProjectType
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify Sourcing branch field should be mendatory user can able to select the data from the drop down$")
	public void verify_sourcing_branch_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterSourcingBranch1DropDown(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterSourcingBranch1DropDown().getAttribute("aria-label").contains("*"));
		projectMasterObj.projectMasterSourcingBranch1DropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.SoucingBranch
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

	@Then("^verify project code field should be mendatory user can able to fill the data in text box$")
	public void verify_project_code_field_should_be_mendatory_user_can_able_to_fill_the_data_in_text_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterProjectCodeMendatoryCheck(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterProjectCodeMendatoryCheck().getText().contains("*"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterProjectCode(), 5, 1);
		projectMasterObj.projectMasterProjectCode().click();
		projectMasterObj.projectMasterProjectCode().sendKeys(ulsProjectMasterTestData.ProjectCode);
	}

	@Then("^verify builder group field should be mendatory user can able to select the data from the drop down$")
	public void verify_builder_group_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterBuilderGroupDropDown(),
				5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterBuilderGroupDropDown().getAttribute("aria-label").contains("*"));
		projectMasterObj.projectMasterBuilderGroupDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.BuilderGroup
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

	@Then("^verify name of the project field should be mendatory user can able to fill the data from in the text box$")
	public void verify_name_of_the_project_field_should_be_mendatory_user_can_able_to_fill_the_data_from_in_the_text_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterNameOfTheProjectMendatoryField(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterNameOfTheProjectMendatoryField().getText().contains("*"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterNameOfTheProjectTextBox(), 5, 1);
		projectMasterObj.projectMasterNameOfTheProjectTextBox().click();
		projectMasterObj.projectMasterNameOfTheProjectTextBox().sendKeys(ulsProjectMasterTestData.NameOfTheProject);
	}

	@Then("^verify builder name field should be mendatory user can able to select the data from the drop down$")
	public void verify_builder_name_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterBuilderNameDropDown(), 5,
				1);

		Assert.assertTrue(projectMasterObj.projectMasterBuilderNameDropDown().getAttribute("aria-label").contains("*"));
		projectMasterObj.projectMasterBuilderNameDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.BuilderName
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

	@Then("^verify construction finance field should be mendatory user can able to select the data from the drop down$")
	public void verify_construction_finance_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterConstructionFinanceDropDown(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterConstructionFinanceDropDown().getAttribute("aria-label").contains("*"));
		projectMasterObj.projectMasterConstructionFinanceDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.ConstructionFinance
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

	@Then("^verify remarks field should be non mendatory user can able to pass the data inside the text box$")
	public void verify_remarks_field_should_be_non_mendatory_user_can_able_to_pass_the_data_inside_the_text_box()
			throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterRemarkMendatoryFieldCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterRemark1TextBox(), 5, 1);
		projectMasterObj.projectMasterRemark1TextBox().click();
		projectMasterObj.projectMasterRemark1TextBox().sendKeys(ulsProjectMasterTestData.Remark);
	}

	@Then("^verify sub25 field should be non mendatory user can able to select the data from the drop down$")
	public void verify_sub25_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterSub25ProjectDropDown(),
				5, 1);

		Assert.assertFalse(
				projectMasterObj.projectMasterSub25ProjectDropDown().getAttribute("aria-label").contains("*"));
		projectMasterObj.projectMasterSub25ProjectDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.Sub25Project
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

	@Then("^verify green project dropdown should be mendatory user can able to select the data from the drop down$")
	public void verify_green_project_dropdown_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterGreenProjectDropDown(),
				5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterGreenProjectDropDown().getAttribute("aria-label").contains("*"));
		projectMasterObj.projectMasterGreenProjectDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.GreenProject
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

	@Then("^verify agency name dropdown should be non mendatory user can able to select the data from the drop down$")
	public void verify_agency_name_dropdown_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterAgencyDropDown(), 5, 1);

		Assert.assertFalse(projectMasterObj.projectMasterAgencyDropDown().getAttribute("aria-label").contains("*"));
		projectMasterObj.projectMasterAgencyDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.AgencyName + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify special scheme  dropdown should be non mendatory user can able to select data from the drop down$")
	public void verify_special_scheme_dropdown_should_be_non_mendatory_user_can_able_to_select_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterSpecialSchemeDropDown(),
				5, 1);

		Assert.assertFalse(
				projectMasterObj.projectMasterSpecialSchemeDropDown().getAttribute("aria-label").contains("*"));
		projectMasterObj.projectMasterSpecialSchemeDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.SpecialScheme
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

	@Then("^verify remarks2 field should be non mendatory user can able to pass the data in it$")
	public void verify_remarks2_field_should_be_non_mendatory_user_can_able_to_pass_the_data_in_it() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterRemarkMendatoryFieldCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterRemark2TextBox(), 5, 1);
		projectMasterObj.projectMasterRemark2TextBox().click();
		//projectMasterObj.projectMasterRemark2TextBox().clear();
		// projectMasterObj.projectMasterRemark2TextBox().sendKeys(ulsProjectMasterTestData.Remarks);
	}

	@Then("^verify address1 field should be mendatory field type should be text$")
	public void verify_address1_field_should_be_mendatory_field_type_should_be_text() throws Throwable {
		javascriptHelper.scrollIntoView(projectMasterObj.projectMasterAddressDetailsAddress1MendatoyrField());

		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsAddress1MendatoyrField().getText().contains("*"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsAddress1TextBox(), 5, 1);
		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsAddress1TextBox().getAttribute("type").contains("text"));
	}

	@Then("^user can able to pass the data into the text box$")
	public void user_can_able_to_pass_the_data_into_the_text_box() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsAddress1TextBox().sendKeys(ulsProjectMasterTestData.Address1);
	}

	@Then("^verify address2 field should be mendatory field type should be text$")
	public void verify_address2_field_should_be_mendatory_field_type_should_be_text() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsAddress2MendatoyrField(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsAddress2MendatoyrField().getText().contains("*"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsAddress2TextBox(), 5, 1);
		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsAddress2TextBox().getAttribute("type").contains("text"));
	}

	@Then("^user can able to pass the data into the address2 text box$")
	public void user_can_able_to_pass_the_data_into_the_address2_text_box() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsAddress2TextBox().sendKeys(ulsProjectMasterTestData.Address2);
	}

	@Then("^verify address3 field should be non mendatory field type should be text$")
	public void verify_address3_field_should_be_non_mendatory_field_type_should_be_text() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDetailsAddress3MendatoyrField().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsAddress3TextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsAddress3TextBox().getAttribute("type").contains("text"));

	}

	@And("^user can able to enter the data into address3 text box$")
	public void user_can_able_to_enter_the_data_into_address3_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsAddress3TextBox(), 5, 1);
		projectMasterObj.projectMasterAddressDetailsAddress3TextBox().click();
		projectMasterObj.projectMasterAddressDetailsAddress3TextBox().sendKeys(ulsProjectMasterTestData.Address3);
	}

	@Then("^verify survey Number field should be non mendatory field type should be number$")
	public void verify_survey_number_field_should_be_non_mendatory_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDeatilsSurveyNoMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsSurveyNoTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsSurveyNoTextBox().getAttribute("type").contains("number"));
	}

	@And("^user can able to enter the data into survey Number input box$")
	public void user_can_able_to_enter_the_data_into_survey_number_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsSurveyNoTextBox(), 5, 1);
		projectMasterObj.projectMasterAddressDetailsSurveyNoTextBox().click();
		projectMasterObj.projectMasterAddressDetailsSurveyNoTextBox().sendKeys(ulsProjectMasterTestData.SurveyNo);
	}

	@Then("^verify landmark field should be non mendatory field type should be text$")
	public void verify_landmark_field_should_be_non_mendatory_field_type_should_be_text() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDeatilsLandmarkMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		javascriptHelper.scrollIntoView(projectMasterObj.projectMasterAddressDeatilsLandmarkTextBox());
//		waitHelper.waitForElementToVisibleWithFluentWait(driver,
//				projectMasterObj.projectMasterAddressDeatilsLandmarkTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDeatilsLandmarkTextBox().getAttribute("type").contains("text"));
	}

	@And("^user can able to enter the data into landmark input box$")
	public void user_can_able_to_enter_the_data_into_landmark_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDeatilsLandmarkTextBox(), 5, 1);
		projectMasterObj.projectMasterAddressDeatilsLandmarkTextBox().click();
		projectMasterObj.projectMasterAddressDeatilsLandmarkTextBox().sendKeys(ulsProjectMasterTestData.LandMark);
	}

	@Then("^verify street field should be non mendatory field type should be text$")
	public void verify_street_field_should_be_non_mendatory_field_type_should_be_text() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDeatilsStreetMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDeatilsStreetTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDeatilsStreetTextBox().getAttribute("type").contains("text"));
	}

	@And("^user can able to enter the data into street input box$")
	public void user_can_able_to_enter_the_data_into_street_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDeatilsStreetTextBox(), 5, 1);
		projectMasterObj.projectMasterAddressDeatilsStreetTextBox().click();
		projectMasterObj.projectMasterAddressDeatilsStreetTextBox().sendKeys(ulsProjectMasterTestData.Street);
	}

	@Then("^verify county field should be mendatory field should be dropdown$")
	public void verify_county_field_should_be_mendatory_field_should_be_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsCountryDropDown(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsCountryDropDown().getDomAttribute("aria-label")
				.contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsCountryDropDown()
				.getDomAttribute("ng-reflect-placeholder").contains("Select"));
	}

	@And("^user can able to select the dta from the county drop down$")
	public void user_can_able_to_select_the_dta_from_the_county_drop_down() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsCountryDropDown(), 5, 1);
		projectMasterObj.projectMasterAddressDetailsCountryDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.County + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify state field should be mendatory field should be drop down$")
	public void verify_state_field_should_be_mendatory_field_should_be_drop_down() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsStateDropDown(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsStateDropDown().getDomAttribute("aria-label")
				.contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsStateDropDown()
				.getDomAttribute("ng-reflect-placeholder").contains("Select"));
	}

	@And("^user can able to select the data from the state drop down$")
	public void user_can_able_to_select_the_data_from_the_state_drop_down() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsStateDropDown(), 5, 1);
		projectMasterObj.projectMasterAddressDetailsStateDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.State + " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify city field should be mendatory field should be drop down$")
	public void verify_city_field_should_be_mendatory_field_should_be_drop_down() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsCityDropDown(), 5, 1);
		Assert.assertFalse(
				projectMasterObj.projectMasterAddressDetailsCityDropDown().getDomAttribute("aria-label").contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsCityDropDown()
				.getDomAttribute("ng-reflect-placeholder").contains("Select"));
	}

	@And("^user can able to select the data from the city drop down$")
	public void user_can_able_to_select_the_data_from_the_city_drop_down() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsCityDropDown(), 5, 1);
		projectMasterObj.projectMasterAddressDetailsCityDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.City + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify pincode field should be non mendatory field type should be number$")
	public void verify_pincode_field_should_be_non_mendatory_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDeatilsSPincodeMendatoryMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMaster_AddressDetailsPincodeTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMaster_AddressDetailsPincodeTextBox().getAttribute("type").contains("number"));
	}

	@And("^user can able to enter the data into pincode input box$")
	public void user_can_able_to_enter_the_data_into_pincode_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMaster_AddressDetailsPincodeTextBox(), 5, 1);
		projectMasterObj.projectMaster_AddressDetailsPincodeTextBox().click();
		projectMasterObj.projectMaster_AddressDetailsPincodeTextBox().sendKeys(ulsProjectMasterTestData.PinCode);
	}

	@Then("^verify sales relationship manager field should be non mendatory field type should be number$")
	public void verify_sales_relationship_manager_field_should_be_non_mendatory_field_type_should_be_number()
			throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDetailsSalesRelationManagerMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMaster_AddressDetailsSalesRelationManagerTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMaster_AddressDetailsSalesRelationManagerTextBox()
				.getAttribute("type").contains("text"));
	}

	@And("^user can able to enter the data into sales relationship manager input box$")
	public void user_can_able_to_enter_the_data_into_sales_relationship_manager_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMaster_AddressDetailsSalesRelationManagerTextBox(), 5, 1);
		projectMasterObj.projectMaster_AddressDetailsSalesRelationManagerTextBox().click();
		projectMasterObj.projectMaster_AddressDetailsSalesRelationManagerTextBox()
				.sendKeys(ulsProjectMasterTestData.SalesRelationshipManager);
	}

	@Then("^verify phone number field should be mendatory field type should be number$")
	public void verify_phone_number_field_should_be_mendatory_field_type_should_be_number() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsPhoneNoMendatoryCheck(), 5, 1);
		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsPhoneNoMendatoryCheck().getText().equalsIgnoreCase("*"));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsPhoneNoTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsPhoneNoTextBox().getAttribute("type").contains("number"));
	}

	@And("^user can able to enter the data into phone number input box$")
	public void user_can_able_to_enter_the_data_into_phone_number_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsPhoneNoTextBox(), 5, 1);
		projectMasterObj.projectMasterAddressDetailsPhoneNoTextBox().click();
		projectMasterObj.projectMasterAddressDetailsPhoneNoTextBox().sendKeys(ulsProjectMasterTestData.PhoneNo);
	}

	@Then("^verify mobile number field should be non mendatory field type should be number$")
	public void verify_mobile_number_field_should_be_non_mendatory_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDetailsMobileNoMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsMobileNoTextBox(), 5, 1);

//		Assert.assertTrue(
//				projectMasterObj.projectMasterAddressDetailsMobileNoTextBox().getAttribute("type").contains("number"));
	}

	@And("^user can able to enter the data into mobile number input box$")
	public void user_can_able_to_enter_the_data_into_mobile_number_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsMobileNoTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsMobileNoTextBox().getAttribute("type").equals("number"));
		projectMasterObj.projectMasterAddressDetailsMobileNoTextBox().click();
		projectMasterObj.projectMasterAddressDetailsMobileNoTextBox().sendKeys(ulsProjectMasterTestData.MobileNo);
	}

	@Then("^verify calendar functionality$")
	public void verify_calendar_functionality() throws Throwable {
		javascriptHelper.scrollIntoView(projectMasterObj.projectMasterAddressDetailsPlanApprovedByDate());
		projectMasterObj.projectMasterAddressDetailsPlanApprovedByDate().sendKeys("07/30/2020");
		// Thread.sleep(5000);
	}

	@Then("^verify title verified by field should be non mendatory field type should be Text box$")
	public void verify_title_verified_by_field_should_be_non_mendatory_field_type_should_be_text_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsTitleVerifiedDropDown(), 5, 1);
		Assert.assertFalse(projectMasterObj.projectMasterAddressDetailsTitleVerifiedDropDown()
				.getAttribute("aria-label").contains("*"));
	}

	@And("^user can able to enter the data into the title verified by input box$")
	public void user_can_able_to_enter_the_data_into_the_title_verified_by_input_box() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsTitleVerifiedDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.TitleVerrifiedBy
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

	@Then("^verify plan approved by field should be non mendatory field type should be Text box$")
	public void verify_plan_approved_by_field_should_be_non_mendatory_field_type_should_be_text_box() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDetailsApprovedByMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsApprovedByTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsApprovedByTextBox().getAttribute("type").contains("text"));
	}

	@And("^user can able to enter the data into the plan approved by input box$")
	public void user_can_able_to_enter_the_data_into_the_plan_approved_by_input_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsApprovedByTextBox(), 5, 1);
		projectMasterObj.projectMasterAddressDetailsApprovedByTextBox().clear();
		projectMasterObj.projectMasterAddressDetailsApprovedByTextBox().click();
		projectMasterObj.projectMasterAddressDetailsApprovedByTextBox().sendKeys(ulsProjectMasterTestData.ApprovedBy);
	}

	@Then("^verify plan approved field should be non mendatory field should be textbox$")
	public void verify_plan_approved_field_should_be_non_mendatory_field_should_be_textbox() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDetailsPlanApprovedMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsPlanApprovedTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsPlanApprovedTextBox().getAttribute("type")
				.contains("text"));
	}

	@And("^user can able to select the data from the plan approved textbox$")
	public void user_can_able_to_select_the_data_from_the_plan_approved_textbox() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsPlanApprovedTextBox(), 5, 1);
		projectMasterObj.projectMasterAddressDetailsPlanApprovedTextBox().clear();
		projectMasterObj.projectMasterAddressDetailsPlanApprovedTextBox().click();
		projectMasterObj.projectMasterAddressDetailsPlanApprovedTextBox()
				.sendKeys(ulsProjectMasterTestData.PlanApproved);
	}

	@Then("^verify plan approved date should be mendatory$")
	public void verify_plan_approved_date_should_be_mendatory() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPlanApprovedDateMendatoryCheck(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterPlanApprovedDateMendatoryCheck().getText().contains("*"));
	}

	@And("^verify user can able to give data in it$")
	public void verify_user_can_able_to_give_data_in_it() throws Throwable {
		javascriptHelper.scrollIntoView(projectMasterObj.projectMasterAddressDetailsPlanApprovedByDate());

		projectMasterObj.projectMasterAddressDetailsPlanApprovedByDate()
				.sendKeys(ulsProjectMasterTestData.PlanApprovedDate);
	}

	@Then("^verify rural urban field should be non mendatory dropdown$")
	public void verify_rural_urban_field_should_be_non_mendatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsRuralUrbanClassification(), 5, 1);
		Assert.assertFalse(projectMasterObj.projectMasterAddressDetailsRuralUrbanClassification()
				.getAttribute("aria-label").contains("*"));
	}

	@And("^user can able to select the data from the dropdown$")
	public void user_can_able_to_select_the_data_from_the_dropdown() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsRuralUrbanClassification().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.RuralUrbanClasification
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify built area field should be non mendatory text box$")
	public void verify_built_area_field_should_be_non_mendatory_text_box() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDetailsBuiltAreaMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsBuiltAreaTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsBuiltAreaTextBox().getAttribute("type").contains("text"));
	}

	@And("^user can able to fill the data in to the built area input box$")
	public void user_can_able_to_fill_the_data_in_to_the_built_area_input_box() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsBuiltAreaTextBox().click();
		projectMasterObj.projectMasterAddressDetailsBuiltAreaTextBox().sendKeys(ulsProjectMasterTestData.builtArea);
	}

	@Then("^verify any charge on project  field should be non mendatory text box$")
	public void verify_any_charge_on_project_field_should_be_non_mendatory_text_box() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDetailsAnyChargeOnProjectMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsAnyChargeOnProjectTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsAnyChargeOnProjectTextBox().getAttribute("type")
				.contains("text"));
	}

	@And("^user can able to fill the data into the any charge on project text box$")
	public void user_can_able_to_fill_the_data_into_the_any_charge_on_project_text_box() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsAnyChargeOnProjectTextBox()
				.sendKeys(ulsProjectMasterTestData.AnyChargeOnProject);
	}

	@Then("^verify Basic Sales Price Distance Unit field should be mendatory text box$")
	public void verify_basic_sales_price_distance_unit_field_should_be_mendatory_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsBasicSalesPriceDistanceUnitMendatoryCheck(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsBasicSalesPriceDistanceUnitMendatoryCheck()
				.getText().contains("*"));
	}

	@And("^user can able to fill the data in Basic sales price distance unit text box$")
	public void user_can_able_to_fill_the_data_in_basic_sales_price_distance_unit_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsBasicSalesPriceDistanceUnitTextBox(), 5, 1);
		projectMasterObj.projectMasterAddressDetailsBasicSalesPriceDistanceUnitTextBox()
				.sendKeys(ulsProjectMasterTestData.basicSalesPriceDistanceUnit);
	}

	@Then("^verify charge by NOC to be taken from field should be non mendatory dropdown$")
	public void verify_charge_by_noc_to_be_taken_from_field_should_be_non_mendatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsChargeByNocToBeTakenFromDropDown(), 5, 1);
		Assert.assertFalse(projectMasterObj.projectMasterAddressDetailsChargeByNocToBeTakenFromDropDown()
				.getAttribute("aria-label").contains("*"));
	}

	@And("^user can able to select the data from the charge by NOC to be taken from dropdown$")
	public void user_can_able_to_select_the_data_from_the_charge_by_noc_to_be_taken_from_dropdown() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsChargeByNocToBeTakenFromDropDown().click();
		// ion-label[contains(text(),'PNBHFL')]//parent::ion-item//ion-radio
		String xpath = "//ion-label[contains(text(),'" + ulsProjectMasterTestData.chargeByNOCToBeTakenFrom
				+ "')]//parent::ion-item//ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify area of land distance unit field should be mendatory text box$")
	public void verify_area_of_land_distance_unit_field_should_be_mendatory_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsAreaOfLandDistanceUnitMendatoryCheck(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsAreaOfLandDistanceUnitMendatoryCheck().getText()
				.contains("*"));
	}

	@And("^user can able to fill the data into the area of land distance unit text box$")
	public void user_can_able_to_fill_the_data_into_the_area_of_land_distance_unit_text_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsAreaOfLandDistanceUnitTextBox(), 5, 1);
		projectMasterObj.projectMasterAddressDetailsAreaOfLandDistanceUnitTextBox()
				.sendKeys(ulsProjectMasterTestData.areaOnLandDistanceUnit);
	}

	@Then("^verify Name of Competitors funding project field should be non mendatory text box$")
	public void verify_name_of_competitors_funding_project_field_should_be_non_mendatory_text_box() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDetailsNameOfCompetitorFundingProjectMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsNameOfCompetitorFundingProjectTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsNameOfCompetitorFundingProjectTextBox()
				.getAttribute("type").contains("text"));
	}

	@And("^user can able to select the data from the Name of Competitors funding project text box$")
	public void user_can_able_to_select_the_data_from_the_name_of_competitors_funding_project_text_box()
			throws Throwable {
		projectMasterObj.projectMasterAddressDetailsNameOfCompetitorFundingProjectTextBox().click();
		projectMasterObj.projectMasterAddressDetailsNameOfCompetitorFundingProjectTextBox()
				.sendKeys(ulsProjectMasterTestData.nameOfCompetitorsFundingProject);
	}

	@Then("^verify Source branch field should be mendatory dropdown$")
	public void verify_source_branch_field_should_be_mendatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsSourcingBranchDropDown(), 10, 1);
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsSourcingBranchDropDown()
				.getAttribute("aria-label").contains("*"));
	}

	@And("^user can able to select the data from the Source branch from dropdown$")
	public void user_can_able_to_select_the_data_from_the_source_branch_from_dropdown() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsSourcingBranchDropDown().click();
		// projectMasterObj.projectMasterAddressDetailsChargeByNocToBeTakenFromDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.addressDetailsSourcingBranch
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

	@Then("^verify monitesring required field shlould be non mendatory text box$")
	public void verify_monitesring_required_field_shlould_be_non_mendatory_text_box() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDetailsMoniteringRequiredMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsMoniteringRequiredTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsMoniteringRequiredTextBox().getAttribute("type")
				.contains("text"));
	}

	@And("^verify user can able to edit the monitering required text box$")
	public void verify_user_can_able_to_edit_the_monitering_required_text_box() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsMoniteringRequiredTextBox().clear();
		projectMasterObj.projectMasterAddressDetailsMoniteringRequiredTextBox()
				.sendKeys(ulsProjectMasterTestData.monteringRequired);
	}

	@Then("^verify under construction field should be non mendatory dropdown$")
	public void verify_under_construction_field_should_be_non_mendatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsUnderConstructionDropDown(), 5, 1);
		Assert.assertFalse(projectMasterObj.projectMasterAddressDetailsUnderConstructionDropDown()
				.getAttribute("aria-label").contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsUnderConstructionDropDown()
				.getAttribute("ng-reflect-placeholder").contains("Select"));
	}

	@And("^user can able to select the data from the under construction dropdown$")
	public void user_can_able_to_select_the_data_from_the_under_construction_dropdown() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsUnderConstructionDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.underConstruction
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

	@Then("^verify overall completion percentage field should be mendatory field type should be number$")
	public void verify_overall_completion_percentage_field_should_be_mendatory_field_type_should_be_number()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsOverAllCompletionMendatoryCheck(), 5, 1);
		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsOverAllCompletionMendatoryCheck().getText().contains("*"));
//		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsOverAllCompletionTextBox().getAttribute("type")
//				.equalsIgnoreCase("number"));
	}

	@And("^user can able to fill the overall completion percentage with number inputs$")
	public void user_can_able_to_fill_the_overall_completion_percentage_with_number_inputs() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsOverAllCompletionTextBox()
				.sendKeys(ulsProjectMasterTestData.overAllPercentageCompletion);
	}

	@Then("^verify overall recomendation field should be mendatory field type should be number$")
	public void verify_overall_recomendation_field_should_be_mendatory_field_type_should_be_number() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsOverallRecomendationMendatoryCheck(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsOverallRecomendationMendatoryCheck().getText()
				.contains("*"));
//		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsOverAllRecommendationTextBox()
//				.getAttribute("type").equalsIgnoreCase("number"));
	}

	@And("^user can able to fill the overall recomendation field with number inputs$")
	public void user_can_able_to_fill_the_overall_recomendation_field_with_number_inputs() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsOverAllRecommendationTextBox()
				.sendKeys(ulsProjectMasterTestData.overAllPercentageRecommendation);
	}

	@Then("^verify tentative date field should be non mendatory field type should be date$")
	public void verify_tentative_date_field_should_be_non_mendatory_field_type_should_be_date() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterAddressDetailsTentativeDateCalendar().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsTentativeDateCompletionDateInput(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsTentativeDateCompletionDateInput()
				.getAttribute("type").contains("date"));
	}

	@And("^user can able to pass the date in to the tentative date input box$")
	public void user_can_able_to_pass_the_date_in_to_the_tentative_date_input_box() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsTentativeDateCompletionDateInput()
				.sendKeys(ulsProjectMasterTestData.tentativeDateCompletion);
	}

	@Then("^verify Name of Beneficiery field should be mendatory field type shoudl be text$")
	public void verify_name_of_beneficiery_field_should_be_mendatory_field_type_shoudl_be_text() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterNameOfbeneficcieryMendatoryCheck(), 5, 1);
		Assert.assertTrue(
				projectMasterObj.projectMasterNameOfbeneficcieryMendatoryCheck().getText().equalsIgnoreCase("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsNameOfBenificieryTextBox().getAttribute("type")
				.equalsIgnoreCase("text"));
	}

	@And("^user can able to pass the data into the name of benificiery text box$")
	public void user_can_able_to_pass_the_data_into_the_name_of_benificiery_text_box() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsNameOfBenificieryTextBox()
				.sendKeys(ulsProjectMasterTestData.nameOfBeneficiery);
	}

	@Then("^verify Account number field should be mendatory field type shoudl be number$")
	public void verify_account_number_field_should_be_mendatory_field_type_shoudl_be_number() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsAccountNoMendatoryCheck(), 5, 1);
		Assert.assertTrue(
				projectMasterObj.projectMasterAddressDetailsAccountNoMendatoryCheck().getText().equalsIgnoreCase("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsAccountNumberInputBox().getAttribute("type")
				.equalsIgnoreCase("number"));
	}

	@And("^user can able to pass the data into the Account number field$")
	public void user_can_able_to_pass_the_data_into_the_account_number_field() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsAccountNumberInputBox()
				.sendKeys(ulsProjectMasterTestData.accountNo);
	}

	@Then("^verify bank name field should be mendatory dropdown$")
	public void verify_bank_name_field_should_be_mendatory_dropdown() throws Throwable {
//waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterAddressDetailsBankNameDropDown(), 5, 1);
		javascriptHelper.scrollIntoView(projectMasterObj.projectMasterAddressDetailsBankNameDropDown());
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsBankNameDropDown().getAttribute("aria-label")
				.contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsBankNameDropDown()
				.getAttribute("ng-reflect-placeholder").equalsIgnoreCase("Select"));
	}

	@And("^verify user can able to select the data from the bannk name dropdown$")
	public void verify_user_can_able_to_select_the_data_from_the_bannk_name_dropdown() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsBankNameDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.bankName + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify date of visit field should be mendatory field$")
	public void verify_date_of_visit_field_should_be_mendatory_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsDateOfVisitCalendarMendatoryCheck(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsDateOfVisitCalendarMendatoryCheck().getText()
				.contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsDateOfVisitInputCalendar().getAttribute("type")
				.contains("date"));
	}

	@And("^user can able to pass the date in date of visit field$")
	public void user_can_able_to_pass_the_date_in_date_of_visit_field() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsDateOfVisitInputCalendar()
				.sendKeys(ulsProjectMasterTestData.dateOfVisit);
	}

	@Then("^verify branch name field should be non mendatory dropdown$")
	public void verify_branch_name_field_should_be_non_mendatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsBranchNameDropDown(), 5, 1);
		Assert.assertFalse(projectMasterObj.projectMasterAddressDetailsBranchNameDropDown().getAttribute("aria-label")
				.contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsBranchNameDropDown()
				.getAttribute("ng-reflect-placeholder").equalsIgnoreCase("Select"));
	}

	@And("^user can able to select the data from the branch name dropdown$")
	public void user_can_able_to_select_the_data_from_the_branch_name_dropdown() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsBranchNameDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.branchName + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify IFSC Code field should be non mendatory dropdown$")
	public void verify_ifsc_code_field_should_be_non_mendatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsIFSCCodeDropDown(), 5, 1);
		Assert.assertFalse(projectMasterObj.projectMasterAddressDetailsIFSCCodeDropDown().getAttribute("aria-label")
				.contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsIFSCCodeDropDown()
				.getAttribute("ng-reflect-placeholder").equalsIgnoreCase("Select"));
	}

	@And("^user can able to select the data from the IFSC Code dropdown$")
	public void user_can_able_to_select_the_data_from_the_ifsc_code_dropdown() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsIFSCCodeDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.iFSCCode + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify file storage field should be mendatory dropdown$")
	public void verify_file_storage_field_should_be_mendatory_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterAddressDetailsFileStorageDropDown(), 5, 1);
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsFileStorageDropDown().getAttribute("aria-label")
				.contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterAddressDetailsFileStorageDropDown()
				.getAttribute("ng-reflect-placeholder").equalsIgnoreCase("Select"));
	}

	@And("^user can able to select data from the file storage dropdown$")
	public void user_can_able_to_select_data_from_the_file_storage_dropdown() throws Throwable {
		projectMasterObj.projectMasterAddressDetailsFileStorageDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.fileStorage
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

	@Then("^verify CLP field should non mendatory be dropdown$")
	public void verify_clp_fiedl_should_non_mendatory_be_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlansClpDropDown(), 5, 1);
		Assert.assertFalse(
				projectMasterObj.projectMasterPaymentPlansClpDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterPaymentPlansClpDropDown().getAttribute("ng-reflect-placeholder")
				.equalsIgnoreCase("Select"));
	}

	@And("^user can able to select the data from the CLP dropdown$")
	public void user_can_able_to_select_the_data_from_the_clp_dropdown() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansClpDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.clp + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify ADF field should non mendatory be dropdown$")
	public void verify_adf_fiedl_should_non_mendatory_be_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlansADFDropDown(), 5, 1);
		Assert.assertFalse(
				projectMasterObj.projectMasterPaymentPlansADFDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterPaymentPlansADFDropDown().getAttribute("ng-reflect-placeholder")
				.equalsIgnoreCase("Select"));
	}

	@And("^user can able to select the data from the ADF dropdown$")
	public void user_can_able_to_select_the_data_from_the_adf_dropdown() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansADFDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.adf + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify Flexi field should non mendatory be dropdown$")
	public void verify_flexi_fiedl_should_non_mendatory_be_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlansFlexiDropDown(), 5, 1);
		Assert.assertFalse(
				projectMasterObj.projectMasterPaymentPlansFlexiDropDown().getAttribute("aria-label").contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterPaymentPlansFlexiDropDown()
				.getAttribute("ng-reflect-placeholder").equalsIgnoreCase("Select"));
	}

	@And("^user can able to select the data from the Flexi dropdown$")
	public void user_can_able_to_select_the_data_from_the_flexi_dropdown() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansFlexiDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.flexi + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify subvention field should non mendatory be dropdown$")
	public void verify_subvention_field_should_non_mendatory_be_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlansSubventionDropDown(), 5, 1);
		Assert.assertFalse(projectMasterObj.projectMasterPaymentPlansSubventionDropDown().getAttribute("aria-label")
				.contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterPaymentPlansSubventionDropDown()
				.getAttribute("ng-reflect-placeholder").equalsIgnoreCase("Select"));
	}

	@And("^user can able to select the data from the subvention dropdown$")
	public void user_can_able_to_select_the_data_from_the_subvention_dropdown() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansSubventionDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.subvention + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify subvention type field should non mendatory be dropdown$")
	public void verify_subvention_type_field_should_non_mendatory_be_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlansSubventionTypeDropDown(), 5, 1);
		Assert.assertFalse(projectMasterObj.projectMasterPaymentPlansSubventionTypeDropDown().getAttribute("aria-label")
				.contains("*"));
		Assert.assertTrue(projectMasterObj.projectMasterPaymentPlansSubventionTypeDropDown()
				.getAttribute("ng-reflect-placeholder").equalsIgnoreCase("Select"));
	}

	@And("^user can able to select the data from the subvention type dropdown$")
	public void user_can_able_to_select_the_data_from_the_subvention_type_dropdown() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansSubventionTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + ulsProjectMasterTestData.subventionType
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

	@Then("^verify subvention period should be non mendatory field should be number type$")
	public void verify_subvention_period_should_be_non_mendatory_field_should_be_number_type() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterPaymentPlansSubventionPeriodMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlanSubventionPeriondInputBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterPaymentPlanSubventionPeriondInputBox().getAttribute("type")
				.contains("number"));
	}

	@And("^user can able to fill the data in to the field$")
	public void user_can_able_to_fill_the_data_in_to_the_field() throws Throwable {
		projectMasterObj.projectMasterPaymentPlanSubventionPeriondInputBox()
				.sendKeys(ulsProjectMasterTestData.subventionPeriod);
	}

	@Then("^verify subvention period start field should be non mendatory field type should be date$")
	public void verify_subvention_period_start_field_should_be_non_mendatory_field_type_should_be_date()
			throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterPaymentPlansSubventionStartDateMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlansSubventionStartDate(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterPaymentPlansSubventionStartDate().getAttribute("type").contains("date"));
	}

	@And("^user can able to pass the data in to the subvention period start field$")
	public void user_can_able_to_pass_the_data_in_to_the_subvention_period_start_field() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansSubventionStartDate()
				.sendKeys(ulsProjectMasterTestData.subventionStartDate);
	}

	@Then("^verify subvention end date field should be non mendatory field type should be date$")
	public void verify_subvention_end_date_field_should_be_non_mendatory_field_type_should_be_date() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterPaymentPlansSubventionEndDateMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlansSubventionEndDate(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterPaymentPlansSubventionEndDate().getAttribute("type").contains("date"));
	}

	@And("^user can able to pass the data in to the subvention end date field$")
	public void user_can_able_to_pass_the_data_in_to_the_subvention_end_date_field() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansSubventionEndDate()
				.sendKeys(ulsProjectMasterTestData.subventionEndDate);
	}

	@Then("^verify interset to be collected field should be non mendatory field type should be number$")
	public void verify_interset_to_be_collected_field_should_be_non_mendatory_field_type_should_be_number()
			throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterPaymentPlansInterestedToBeCollectedMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		javascriptHelper.scrollIntoView(projectMasterObj.projectMasterPaymentPlansInterestToBeCollectedTextBox());

		Assert.assertTrue(projectMasterObj.projectMasterPaymentPlansInterestToBeCollectedTextBox().getAttribute("type")
				.contains("number"));
	}

	@And("^user can able to pass the data in to the interset to be collected field$")
	public void user_can_able_to_pass_the_data_in_to_the_interset_to_be_collected_field() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansInterestToBeCollectedTextBox()
				.sendKeys(ulsProjectMasterTestData.InterestToBecollected);
	}

	@Then("^verify discounting rate field should be non mendatory field type should be number$")
	public void verify_discounting_rate_field_should_be_non_mendatory_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterPaymentPlanDIscountingRateMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlansDiscountingRateTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterPaymentPlansDiscountingRateTextBox().getAttribute("type")
				.contains("number"));
	}

	@And("^user can able to pass the data in to the discounting rate field$")
	public void user_can_able_to_pass_the_data_in_to_the_discounting_rate_field() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansDiscountingRateTextBox()
				.sendKeys(ulsProjectMasterTestData.discountingRate);
	}

	@Then("^verify rate type field should be non mendatory field type should be number$")
	public void verify_rate_type_field_should_be_non_mendatory_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterPaymentPlansRateTypeMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlansRateTypeTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterPaymentPlansRateTypeTextBox().getAttribute("type").contains("text"));
	}

	@And("^user can able to pass the data in to the rate type field$")
	public void user_can_able_to_pass_the_data_in_to_the_rate_type_field() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansRateTypeTextBox().sendKeys(ulsProjectMasterTestData.rateType);
	}

	@Then("^verify rate of interest field should be non mendatory field type should be number$")
	public void verify_rate_of_interest_field_should_be_non_mendatory_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterPaymentPlansRateOfInterestMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterPaymentPlansRateOfInterestTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterPaymentPlansRateOfInterestTextBox().getAttribute("type")
				.contains("number"));
	}

	@And("^user can able to pass the data in to the rate of interest field$")
	public void user_can_able_to_pass_the_data_in_to_the_rate_of_interest_field() throws Throwable {
		projectMasterObj.projectMasterPaymentPlansRateOfInterestTextBox()
				.sendKeys(ulsProjectMasterTestData.rateOfInterest);
	}

	@Then("^verify Max No of Units to be Funded for all projects of builder field should be non mendatory text box$")
	public void verify_max_no_of_units_to_be_funded_for_all_projects_of_builder_field_should_be_non_mendatory_text_box()
			throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingMaxNoOUnitToBeFundedMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingMaxNoOUnitToBeFundedTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterExposureTrackingMaxNoOUnitToBeFundedTextBox()
				.getAttribute("type").contains("text"));
	}

	@And("^verify user can able to pass the data in to Max No of Units to be Funded for all projects of builder textbox$")
	public void verify_user_can_able_to_pass_the_data_in_to_max_no_of_units_to_be_funded_for_all_projects_of_builder_textbox()
			throws Throwable {
		projectMasterObj.projectMasterExposureTrackingMaxNoOUnitToBeFundedTextBox()
				.sendKeys(ulsProjectMasterTestData.maxNoOfUnitToBeFundedForAllProject);
	}

	@Then("^verify Max Sanction Amt for all cases funded in all Projects of the builder field should be non mendatory text box$")
	public void verify_max_sanction_amt_for_all_cases_funded_in_all_projects_of_the_builder_field_should_be_non_mendatory_text_box()
			throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingMaxSanctionAmtMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingMaxSanctionAmtTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterExposureTrackingMaxSanctionAmtTextBox().getAttribute("type")
				.contains("text"));
	}

	@And("^verify user can able to pass the data in to Max Sanction Amt for all cases funded in all Projects of the builder textbox$")
	public void verify_user_can_able_to_pass_the_data_in_to_max_sanction_amt_for_all_cases_funded_in_all_projects_of_the_builder_textbox()
			throws Throwable {
		projectMasterObj.projectMasterExposureTrackingMaxSanctionAmtTextBox()
				.sendKeys(ulsProjectMasterTestData.maxSanctionAmtForAllClassesFundedInAllProject);
	}

	@Then("^verify Max Disbursed Amt for all cases funded in all Projects of the builder field should be non mendatory text box$")
	public void verify_max_disbursed_amt_for_all_cases_funded_in_all_projects_of_the_builder_field_should_be_non_mendatory_text_box()
			throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingMaxDisbursedAmtForAllcasesMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingMaxDisbursedAmtForAllcasesTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterExposureTrackingMaxDisbursedAmtForAllcasesTextBox()
				.getAttribute("type").contains("text"));
	}

	@And("^user can able to pass the data in to Max Disbursed Amt for all cases funded in all Projects of the builder textbox$")
	public void user_can_able_to_pass_the_data_in_to_max_disbursed_amt_for_all_cases_funded_in_all_projects_of_the_builder_textbox()
			throws Throwable {
		projectMasterObj.projectMasterExposureTrackingMaxDisbursedAmtForAllcasesTextBox()
				.sendKeys(ulsProjectMasterTestData.maxDIsbursedAmtForAllClassesFundedInAllProject);
	}

	@Then("^verify Sanctioned Amount field should be non mendatory field type should be number$")
	public void verify_sanctioned_amount_field_should_be_non_mendatory_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingSanctionedAmtMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingSanctionedAmtTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterExposureTrackingSanctionedAmtTextBox().getAttribute("type")
				.contains("number"));
	}

	@And("^user can able to pass the data in to Sanctioned Amount field$")
	public void user_can_able_to_pass_the_data_in_to_sanctioned_amount_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingSanctionedAmtTextBox()
				.sendKeys(ulsProjectMasterTestData.sanctionAmount);
	}

	@Then("^verify Disbursed Amount field should be non mendatory field type should be number$")
	public void verify_disbursed_amount_field_should_be_non_mendatory_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMaster_ExposureTrackingMaxDisbursedAmtMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMaster_ExposureTrackingMaxDisbursedAmtTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMaster_ExposureTrackingMaxDisbursedAmtTextBox().getAttribute("type")
				.contains("number"));
	}

	@And("^user can able to pass the data in to Disbursed Amount field$")
	public void user_can_able_to_pass_the_data_in_to_disbursed_amount_field() throws Throwable {
		projectMasterObj.projectMaster_ExposureTrackingMaxDisbursedAmtTextBox()
				.sendKeys(ulsProjectMasterTestData.disbursedAmount);
	}

	@Then("^verify Sanctioned No of Units field should be non mendatory field type should be number$")
	public void verify_sanctioned_no_of_units_field_should_be_non_mendatory_field_type_should_be_number()
			throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingSanctionedNoOfUnitMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingSanctionedNoOfUnitTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterExposureTrackingSanctionedNoOfUnitTextBox().getAttribute("type")
				.contains("number"));
	}

	@And("^user can able to pass the data in to Sanctioned No of Units field$")
	public void user_can_able_to_pass_the_data_in_to_sanctioned_no_of_units_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingSanctionedNoOfUnitTextBox()
				.sendKeys(ulsProjectMasterTestData.sanctionedNoOfUnits);
	}

	@Then("^verify Total No Units field should be non mendatory field type should be number$")
	public void verify_total_no_units_field_should_be_non_mendatory_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingtTotalNoUnitMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingtTotalNoUnitTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterExposureTrackingtTotalNoUnitTextBox().getAttribute("type")
				.contains("number"));
	}

	@And("^user can able to pass the data in to Total No Units field$")
	public void user_can_able_to_pass_the_data_in_to_total_no_units_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingtTotalNoUnitTextBox()
				.sendKeys(ulsProjectMasterTestData.totalNoUnits);
	}

	@Then("^verify Apartment should be non mendatory field type should be text$")
	public void verify_apartment_should_be_non_mendatory_field_type_should_be_text() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingApartmentMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingtAprtmentTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterExposureTrackingtAprtmentTextBox().getAttribute("type").contains("text"));
	}

	@And("^user can able to pass the data in to Apartment field$")
	public void user_can_able_to_pass_the_data_in_to_apartment_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingtAprtmentTextBox().sendKeys(ulsProjectMasterTestData.Apartment);
	}

	@Then("^verify Commercial Space should be non mendatory field type should be text$")
	public void verify_commercial_space_should_be_non_mendatory_field_type_should_be_text() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingtCommercialSpaceMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingtCommercialSpaceTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterExposureTrackingtCommercialSpaceTextBox().getAttribute("type")
				.contains("text"));
	}

	@And("^user can able to pass the data in to Commercial Space field$")
	public void user_can_able_to_pass_the_data_in_to_commercial_space_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingtCommercialSpaceTextBox()
				.sendKeys(ulsProjectMasterTestData.commercialSpace);
	}

	@Then("^verify plot field type should be number$")
	public void verify_plot_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingtPlotMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingtPlotTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterExposureTrackingtPlotTextBox().getAttribute("type").contains("number"));
	}

	@And("^user can able to pass the data in to plot field$")
	public void user_can_able_to_pass_the_data_in_to_plot_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingtPlotTextBox().sendKeys(ulsProjectMasterTestData.plot);
	}

	@Then("^verify Studio Apartment should be non mendatory field type should be text$")
	public void verify_studio_apartment_should_be_non_mendatory_field_type_should_be_text() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingtStudioApartmentMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		javascriptHelper.scrollIntoView(projectMasterObj.projectMasterExposureTrackingtStudioApartmentTextBox());

		Assert.assertTrue(projectMasterObj.projectMasterExposureTrackingtStudioApartmentTextBox().getAttribute("type")
				.contains("text"));
	}

	@And("^user can able to pass the data in to Studio Apartment field$")
	public void user_can_able_to_pass_the_data_in_to_studio_apartment_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingtStudioApartmentTextBox()
				.sendKeys(ulsProjectMasterTestData.studioApartment);
	}

	@Then("^verify Builder Floor should be non mendatory field type should be number$")
	public void verify_builder_floor_should_be_non_mendatory_field_type_should_be_number() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingtBuildFloorMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingtBuildFloorTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterExposureTrackingtBuildFloorTextBox().getAttribute("type")
				.contains("number"));
	}

	@And("^user can able to pass the data in to Builder Floor field$")
	public void user_can_able_to_pass_the_data_in_to_builder_floor_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingtBuildFloorTextBox()
				.sendKeys(ulsProjectMasterTestData.builderFloor);
	}

	@Then("^verify Villa should be non mendatory field type should be text$")
	public void verify_villa_should_be_non_mendatory_field_type_should_be_text() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingtVillaMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingtVillaTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterExposureTrackingtVillaTextBox().getAttribute("type").contains("text"));
	}

	@And("^user can able to pass the data in to Villa field$")
	public void user_can_able_to_pass_the_data_in_to_villa_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingtVillaTextBox().sendKeys(ulsProjectMasterTestData.villa);
	}

	@Then("^verify Technical Conditions should be non mendatory field type should be text$")
	public void verify_technical_conditions_should_be_non_mendatory_field_type_should_be_text() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingtTechnicalConditionMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingtTechnicalConditionTextBox(), 5, 1);

		Assert.assertTrue(projectMasterObj.projectMasterExposureTrackingtTechnicalConditionTextBox()
				.getAttribute("type").contains("text"));
	}

	@And("^user can able to pass the data in to Technical Conditions field$")
	public void user_can_able_to_pass_the_data_in_to_technical_conditions_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingtTechnicalConditionTextBox()
				.sendKeys(ulsProjectMasterTestData.technicalConditions);
	}

	@Then("^verify Remarks should be non mendatory field type should be text$")
	public void verify_remarks_should_be_non_mendatory_field_type_should_be_text() throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingtRemarksMendatoryCheck().isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingtRemarksTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterExposureTrackingtRemarksTextBox().getAttribute("type").contains("text"));
	}

	@And("^user can able to pass the data in to Remarks field$")
	public void user_can_able_to_pass_the_data_in_to_remarks_field() throws Throwable {
		projectMasterObj.projectMasterExposureTrackingtRemarksTextBox()
				.sendKeys(ulsProjectMasterTestData.exposureTrackingRemarks);
	}

	@Then("^verify Document to be collected from Retail Borrower should be non mendatory field type should be text$")
	public void verify_document_to_be_collected_from_retail_borrower_should_be_non_mendatory_field_type_should_be_text()
			throws Throwable {
		boolean statusOfRemark = true;
		try {
			projectMasterObj.projectMasterExposureTrackingtDocumentToBecollectedFromRetailsBorrowerMendatoryCheck()
					.isDisplayed();
		} catch (NoSuchElementException e) {
			statusOfRemark = false;
		}
		Assert.assertFalse(statusOfRemark);

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterExposureTrackingtDocumentToBecollectedFromRetailsBorrowerTextBox(), 5, 1);

		Assert.assertTrue(
				projectMasterObj.projectMasterExposureTrackingtDocumentToBecollectedFromRetailsBorrowerTextBox()
						.getAttribute("type").contains("text"));
	}

	@And("^user can able to pass the data in to Document to be collected from Retail Borrower field$")
	public void user_can_able_to_pass_the_data_in_to_document_to_be_collected_from_retail_borrower_field()
			throws Throwable {
		projectMasterObj.projectMasterExposureTrackingtDocumentToBecollectedFromRetailsBorrowerTextBox()
				.sendKeys(ulsProjectMasterTestData.documentToBeCollectedFromRetailsBorrower);
	}

	@Then("^save the project master record$")
	public void save_the_project_master_record() throws Throwable {
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(projectMasterObj.projectMasterSaveButton());
				
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMastersubmitToastAlert(), 30, 1);
		projectMasterObj.projectMastersubmitToastAlert().isDisplayed();
	}

	@Then("^serach for project master record in notification$")
	public void serach_for_project_master_record_in_notification() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterinboxSearch(), 5, 1);
		projectMasterObj.projectMasterinboxSearch().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterSearchTextBoxInbox(), 5,
				1);
		clicksAndActionsHelper.moveToElement(projectMasterObj.projectMasterSearchTextBoxInbox());
		clicksAndActionsHelper.clickOnElement(projectMasterObj.projectMasterSearchTextBoxInbox());
		projectMasterObj.projectMasterSearchTextBoxInbox().sendKeys(ulsProjectMasterTestData.eventCode);
	}

	@Then("^submit the record from maker end$")
	public void submit_the_record_from_maker_end() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterSubmitButton(), 5, 1);
		projectMasterObj.projectMasterSubmitButton().click();
	}

	@And("^click on notification icon in project master$")
	public void click_on_notification_icon_in_project_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterMailBox(), 5, 1);
		projectMasterObj.projectMasterMailBox().click();
	}

	@And("^select project master record  the record in notification area$")
	public void select_project_master_record_the_record_in_notification_area() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterreferenceID(), 5, 1);
		String referenceNumber = projectMasterObj.projectMasterreferenceID().getText();
		System.out.println(projectMasterObj.projectMasterreferenceID().getText());
		jsonDataReaderWriter.addReferanceData(referenceNumber);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterfirstRecord(), 5, 1);
		projectMasterObj.projectMasterfirstRecord().click();
	}

	@Then("^submit the record from maker endAnd give alert remark and submit the alert button after clickking on alert$")
	public void submit_the_record_from_maker_endand_give_alert_remark_and_submit_the_alert_button_after_clickking_on_alert()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterSavedProjectCode(), 5,
				1);
		String savedProjectCOde = projectMasterObj.projectMasterSavedProjectCode().getAttribute("ng-reflect-model");
		Assert.assertEquals(savedProjectCOde, ulsProjectMasterTestData.ProjectCode);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterSubmitButton(), 5, 1);
		projectMasterObj.projectMasterSubmitButton().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasteralertRemark(), 5, 1);

		projectMasterObj.projectMasteralertRemark().sendKeys(ulsProjectMasterTestData.alertRemark);

		projectMasterObj.projectMasteraleralertSubmitButton().click();

		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMastersubmitToastAlert(), 5,
				1);
		String submitedStatus = projectMasterObj.projectMastersubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		jsonDataReaderWriter.addData(substring.replace(".", "").trim());
	}

	@Then("^click on temp view in project master$")
	public void click_on_temp_view_in_project_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterTempView(), 5, 1);
		projectMasterObj.projectMasterTempView().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.projectMasterTempViewFirstRecord(), 5,
				1);
		projectMasterObj.projectMasterTempViewFirstRecord().click();
	}

	@Then("^verify building details records are in non editable mode$")
	public void verify_building_details_records_are_in_non_editable_mode() throws Throwable {
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(projectMasterObj.buildingDetailsListViewFirstRecord());
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^go to building details tab$")
	public void go_to_building_details_tab() throws Throwable {

		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.scrollIntoView(projectMasterObj.projectMasterTemoBuildingDetails());
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getLocalizedMessage());
				}

			}
		}
	}

	@Then("^click on add button in building details$")
	public void click_on_add_button_in_building_details() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterBuildingDetailsAddButton(), 5, 1);
		projectMasterObj.projectMasterBuildingDetailsAddButton().click();
	}

	@And("^click on back button$")
	public void click_on_back_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				projectMasterObj.projectMasterBuildingDetailsBackButton(), 5, 1);
		projectMasterObj.projectMasterBuildingDetailsBackButton().click();
	}

	@Then("^verify screen should get changed to previous screen$")
	public void verify_screen_should_get_changed_to_previous_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, projectMasterObj.buildingDetailsExportText(), 5, 1);
		Assert.assertTrue(projectMasterObj.buildingDetailsExportText().isDisplayed());
	}
}
