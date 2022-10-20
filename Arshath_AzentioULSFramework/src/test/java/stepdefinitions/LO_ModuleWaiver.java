package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ULS_LoModuleWaiverObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.ULS_LoModuleWaiverTestData;

public class LO_ModuleWaiver extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ULS_LoModuleWaiverObj loModuleWaiverObj = new ULS_LoModuleWaiverObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ULS_LoModuleWaiverTestData loModuleWaiverTestData = jsonConfig.getLoModuleWaiverTestDataByName("Maker");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter jsonDataReaderWriter= new JsonDataReaderWriter();

	@And("^click on config manager main menu$")
	public void click_on_config_manager_main_menu() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(loModuleWaiverObj.ULSConfigManager());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on temp view on LO Module waiver$")
	public void click_on_temp_view_on_lo_module_waiver() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(loModuleWaiverObj.loModuleWaiverTempViewButton());
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on add button to create LO Module waiver record$")
	public void click_on_add_button_to_create_lo_module_waiver_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loWaiverAddButton(), 5, 1);
		loModuleWaiverObj.loWaiverAddButton().click();
	}

	@Then("^verify waiver type field should be mandatory and editable dropdown$")
	public void verify_waiver_type_field_should_be_mandatory_and_editable_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown(),
				5, 1);
		String mandaoryCheck = loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("aria-label");
		Assert.assertTrue(mandaoryCheck.contains("*"));
		// loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("aria-haspopup").contains("listbox");
		Assert.assertTrue(
				loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("aria-haspopup").contains("listbox"));
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("ng-reflect-is-disabled")
				.equalsIgnoreCase("false"));

	}

	@And("^check user can able to select the data into the dropdown$")
	public void check_user_can_able_to_select_the_data_into_the_dropdown() throws Throwable {

	}

	@When("^user select waiver type as document waiver$")
	public void user_select_waiver_type_as_document_waiver() throws Throwable {
		loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().click();

		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.WaiverTypeForDocumentWaiver
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

	@Then("^system should display only document category document type and waiving authority$")
	public void system_should_display_only_document_category_document_type_and_waiving_authority() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown(), 5, 1);
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown().isDisplayed());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown(),
				5, 1);
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown().isDisplayed());
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown(), 5, 1);
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown().isDisplayed());

		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown()
		 * .isDisplayed()); waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverPDTypeDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverPDTypeDropDown().
		 * isDisplayed()); waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverValuationTypeDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverValuationTypeDropDown().
		 * isDisplayed());
		 */
	}

	@Then("^verify document category field should be non mendatory and dropdown$")
	public void verify_document_category_field_should_be_non_mendatory_and_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown(), 5, 1);
		String mandaoryCheck = loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown().getAttribute("aria-label");
		Assert.assertFalse(mandaoryCheck.contains("*"));
		// loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("aria-haspopup").contains("listbox");
		Assert.assertTrue(
				loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("aria-haspopup").contains("listbox"));
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("ng-reflect-is-disabled")
				.equalsIgnoreCase("false"));
	}

	@And("^user can able to select the data from the document category dropdown$")
	public void user_can_able_to_select_the_data_from_the_document_category_dropdown() throws Throwable {
		loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown().click();
		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.DocumentCategory
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

	@Then("^verify document type field should be non mendatory and dropdown$")
	public void verify_document_type_field_should_be_non_mendatory_and_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown(),
				5, 1);
		String mandaoryCheck = loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown().getAttribute("aria-label");
		Assert.assertFalse(mandaoryCheck.contains("*"));
		// loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("aria-haspopup").contains("listbox");
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown().getAttribute("aria-haspopup")
				.contains("listbox"));
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown().getAttribute("ng-reflect-is-disabled")
				.equalsIgnoreCase("false"));
	}

	@And("^user can able to select the data from the document type dropdown$")
	public void user_can_able_to_select_the_data_from_the_document_type_dropdown() throws Throwable {
		loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.DocumentType + " ']/parent::ion-item/ion-radio";
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

	@Then("^verify waiving authority field should be non mendatory and dropdown$")
	public void verify_waiving_authority_field_should_be_non_mendatory_and_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown(), 5, 1);
		String mandaoryCheck = loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown().getAttribute("aria-label");
		Assert.assertFalse(mandaoryCheck.contains("*"));
		// loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("aria-haspopup").contains("listbox");
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown().getAttribute("aria-haspopup")
				.contains("listbox"));
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown()
				.getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("false"));
	}

	@And("^user can able to select the data from the waiving authority dropdown$")
	public void user_can_able_to_select_the_data_from_the_waiving_authority_dropdown() throws Throwable {
		loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverFirstDropdown(), 5, 1);
		loModuleWaiverObj.loModuleWaiverFirstDropdown().click();
		/*
		 * String xpath = "//ion-label[text()=' " +
		 * loModuleWaiverTestData.WaivingAuthority + " ']/parent::ion-item/ion-radio";
		 * for (int i = 0; i <= 20; i++) { try {
		 * javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
		 * clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
		 * clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
		 * break; } catch (Exception e) { if (i == 20) { Assert.fail(e.getMessage()); }
		 * } }
		 */
	}

	@When("^user select waiver type as FI FCU Legal waiver$")
	public void user_select_waiver_type_as_fi_fcu_legal_waiver() throws Throwable {
		loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().click();

		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.WaiverTypeForFIFCULegalWaiver
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

	@Then("^system should display only Verification type and waiving authority$")
	public void system_should_display_only_verification_type_and_waiving_authority() throws Throwable {
		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown()
		 * .isDisplayed()); waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown().
		 * isDisplayed());
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown(), 5, 1);
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown().isDisplayed());

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown(), 5, 1);
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown().isDisplayed());
		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverPDTypeDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverPDTypeDropDown().
		 * isDisplayed()); waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverValuationTypeDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverValuationTypeDropDown().
		 * isDisplayed());
		 */

	}

	@Then("^verify verification type field should be non mendatory and dropdown$")
	public void verify_verification_type_field_should_be_non_mendatory_and_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown(), 5, 1);
		String mandaoryCheck = loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown().getAttribute("aria-label");
		Assert.assertFalse(mandaoryCheck.contains("*"));
		// loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("aria-haspopup").contains("listbox");
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown().getAttribute("aria-haspopup")
				.contains("listbox"));
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown()
				.getAttribute("ng-reflect-is-disabled").equalsIgnoreCase("false"));
	}

	@And("^user can able to select the data from the verification type dropdown$")
	public void user_can_able_to_select_the_data_from_the_verification_type_dropdown() throws Throwable {
		loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.VerificationType
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

	@When("^user select waiver type as Personel discussion waiver$")
	public void user_select_waiver_type_as_personel_discussion_waiver() throws Throwable {
		loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().click();

		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.WaiverTypeForPDWaiver
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

	@Then("^system should display only PD type and waiving authority$")
	public void system_should_display_only_pd_type_and_waiving_authority() throws Throwable {
		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown()
		 * .isDisplayed()); waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown().
		 * isDisplayed());
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown(), 5, 1);
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown().isDisplayed());

		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown(), 5, 1);
		 * Assert.assertFlase(loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown()
		 * .isDisplayed());
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverPDTypeDropDown(), 5,
				1);
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverPDTypeDropDown().isDisplayed());
		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverValuationTypeDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverValuationTypeDropDown().
		 * isDisplayed());
		 */
	}

	@Then("^verify PD Type field should be non mendatory and dropdown$")
	public void verify_pd_type_field_should_be_non_mendatory_and_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverPDTypeDropDown(), 5,
				1);
		String mandaoryCheck = loModuleWaiverObj.loModuleWaiverPDTypeDropDown().getAttribute("aria-label");
		Assert.assertFalse(mandaoryCheck.contains("*"));
		// loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("aria-haspopup").contains("listbox");
		Assert.assertTrue(
				loModuleWaiverObj.loModuleWaiverPDTypeDropDown().getAttribute("aria-haspopup").contains("listbox"));
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverPDTypeDropDown().getAttribute("ng-reflect-is-disabled")
				.equalsIgnoreCase("false"));
	}

	@And("^user can able to select the data from the PD Type dropdown$")
	public void user_can_able_to_select_the_data_from_the_pd_type_dropdown() throws Throwable {
		loModuleWaiverObj.loModuleWaiverPDTypeDropDown().click();

		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.PDType + " ']/parent::ion-item/ion-radio";
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

	@When("^user select waiver type as ROI change waiver$")
	public void user_select_waiver_type_as_roi_change_waiver() throws Throwable {
		loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().click();

		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.WaiverTypeForROIChangeWaiver
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

	@When("^user select waiver type as valuation waiver$")
	public void user_select_waiver_type_as_valuation_waiver() throws Throwable {
		loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().click();

		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.WaiverTypeForValuationWaiver
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

	@Then("^system should display only valuation type and waiving authority$")
	public void system_should_display_only_valuation_type_and_waiving_authority() throws Throwable {
		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverDocumentCategoryDropDown()
		 * .isDisplayed()); waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown(), 5, 1);
		 * Assert.assertFalse(loModuleWaiverObj.loModuleWaiverDocumentTypeDropDown().
		 * isDisplayed());
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown(), 5, 1);
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverWaivingAuthorityDropDown().isDisplayed());

		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown(), 5, 1);
		 * Assert.assertFlase(loModuleWaiverObj.loModuleWaiverVerificationTypeDropDown()
		 * .isDisplayed());
		 */
		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * loModuleWaiverObj.loModuleWaiverPDTypeDropDown(), 5, 1);
		 * Assert.assertTrue(loModuleWaiverObj.loModuleWaiverPDTypeDropDown().
		 * isDisplayed());
		 */

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				loModuleWaiverObj.loModuleWaiverValuationTypeDropDown(), 5, 1);
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverValuationTypeDropDown().isDisplayed());

	}

	@Then("^verify valuation type field should be non mendatory and dropdown$")
	public void verify_valuation_type_field_should_be_non_mendatory_and_dropdown() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverPDTypeDropDown(), 5,
				1);
		String mandaoryCheck = loModuleWaiverObj.loModuleWaiverPDTypeDropDown().getAttribute("aria-label");
		Assert.assertFalse(mandaoryCheck.contains("*"));
		// loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().getAttribute("aria-haspopup").contains("listbox");
		Assert.assertTrue(
				loModuleWaiverObj.loModuleWaiverPDTypeDropDown().getAttribute("aria-haspopup").contains("listbox"));
		Assert.assertTrue(loModuleWaiverObj.loModuleWaiverPDTypeDropDown().getAttribute("ng-reflect-is-disabled")
				.equalsIgnoreCase("false"));
	}

	@And("^user can able to select the data from the valuation type dropdown$")
	public void user_can_able_to_select_the_data_from_the_valuation_type_dropdown() throws Throwable {
		loModuleWaiverObj.loModuleWaiverValuationTypeDropDown().click();

		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.ValuationType
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

	@And("^click on save button to save the Lo waiver record$")
	public void click_on_save_button_to_save_the_lo_waiver_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverSaveButton(), 5, 1);
		loModuleWaiverObj.loModuleWaiverSaveButton().click();
	}

	@Then("^verify the success pop up is coming after saving the record$")
	public void verify_the_success_pop_up_is_coming_after_saving_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.LoModuleWaiversubmitToastAlert(), 5,
				1);
		String alert = loModuleWaiverObj.LoModuleWaiversubmitToastAlert().getText();
		Assert.assertTrue(alert.contains("Success"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.LoModuleWaiverToastAlertClose(), 5,
				1);
		loModuleWaiverObj.LoModuleWaiverToastAlertClose().click();
	}

	@Then("^submit the record in maker end$")
	public void submit_the_record_in_maker_end() throws Throwable {
waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.LoModuleWaiverSubmitButton(), 5, 1);
loModuleWaiverObj.LoModuleWaiverSubmitButton().click();
waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.LoModuleWaiveralertRemark(), 5, 1);
loModuleWaiverObj.LoModuleWaiveralertRemark().click();
loModuleWaiverObj.LoModuleWaiveralertRemark().sendKeys(loModuleWaiverTestData.makerAlertRemark);
waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.LoModuleWaiveraleralertSubmitButton(), 5, 1);
loModuleWaiverObj.LoModuleWaiveraleralertSubmitButton().click();
	}

	@Then("^store the reviewr ID$")
	public void store_the_reviewr_id() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.LoModuleWaiversubmitToastAlert(), 5,
				1);
		String submitedStatus = loModuleWaiverObj.LoModuleWaiversubmitToastAlert().getText();

		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		jsonDataReaderWriter.addData(substring.replace(".", "").trim());
	}

	@And("^click on mail box icon in lo waiver$")
	public void click_on_mail_box_icon_in_lo_waiver() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverMailBox(), 5, 1);
		loModuleWaiverObj.loModuleWaiverMailBox().click();
		
	}

	@And("^search the lo waiver event code and select the first record$")
	public void search_the_lo_waiver_event_code_and_select_the_first_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverinboxSearch(), 5, 1);
		loModuleWaiverObj.loModuleWaiverinboxSearch().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverSearchTextBox(), 5, 1);
		clicksAndActionsHelper.moveToElement(loModuleWaiverObj.loModuleWaiverSearchTextBox());
		clicksAndActionsHelper.clickOnElement(loModuleWaiverObj.loModuleWaiverSearchTextBox());
		loModuleWaiverObj.loModuleWaiverSearchTextBox().sendKeys(loModuleWaiverTestData.loModuleEventCode);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.LoModuleWaiverreferenceID(), 5, 1);
		loModuleWaiverObj.LoModuleWaiverreferenceID().getText();
		System.out.println("Reference ID : "+loModuleWaiverObj.LoModuleWaiverreferenceID().getText());
		jsonDataReaderWriter.addReferanceData(loModuleWaiverObj.LoModuleWaiverreferenceID().getText().trim());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverfirstRecord(), 5, 1);
		loModuleWaiverObj.loModuleWaiverfirstRecord().click();
	}
	@And("^keep mendatory field as blank and click on save button$")
    public void keep_mendatory_field_as_blank_and_click_on_save_button() throws Throwable {
     waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverSaveButton(), 10, 1);
     loModuleWaiverObj.loModuleWaiverSaveButton().click();
	}
	@Then("^verify system should through the validation for balnk field$")
    public void verify_system_should_through_the_validation_for_balnk_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.waiverTypeRequiredFieldVerification(), 10, 1);   
    Assert.assertTrue(loModuleWaiverObj.waiverTypeRequiredFieldVerification().isDisplayed());
	}
	@Then("^click on save button to verify system allowing to user to save or not$")
    public void click_on_save_button_to_verify_system_allowing_to_user_to_save_or_not() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverSaveButton(), 10, 1);
	     loModuleWaiverObj.loModuleWaiverSaveButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.waiverTypeRequiredFieldVerification(), 10, 1);   
	    Assert.assertTrue(loModuleWaiverObj.waiverTypeRequiredFieldVerification().isDisplayed());	
	}

    @And("^in waiver type dropdown select the invalid input$")
    public void in_waiver_type_dropdown_select_the_invalid_input() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown(), 10, 1);
		loModuleWaiverObj.loModuleWaiverWaiverTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + loModuleWaiverTestData.WaiverTypeFOrInvalidInput + " ']/parent::ion-item/ion-radio";
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

}
