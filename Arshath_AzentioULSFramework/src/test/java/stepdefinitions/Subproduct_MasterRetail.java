package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SubProduct_Master_RetailOBJ;
import pageobjects.Sub_Product_Master_Obj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.SubProductRetailParameterTestDataType;
import testDataType.SubproductMasterRetail_Testdata;

public class Subproduct_MasterRetail extends BaseClass {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	Sub_Product_Master_Obj subPrdMst = new Sub_Product_Master_Obj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	SubproductMasterRetail_Testdata subprdMstData = jsonConfig.getSubproductRetailByName("Maker");
	SubProductRetailParameterTestDataType paradata = jsonConfig.getSubParameterListByName("Maker");
	SubProduct_Master_RetailOBJ parameter = new SubProduct_Master_RetailOBJ(driver);
	SubProduct_Master_RetailOBJ subretail = new SubProduct_Master_RetailOBJ(driver);
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper click = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	String Tab;
	String Toast;

	@Given("^user log in as uls application maker$")
	public void user_log_in_as_uls_application_maker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		applicationLogin.loginUlsApplicationAsMaker(loginData.Username, loginData.Password);
		
	}

	@When("^user click product set up menu$")
	public void user_click_product_set_up_menu() throws Throwable {
		javaHelper.scrollIntoView(subPrdMst.productSetup());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.productSetup(), 60, 2);
		subPrdMst.productSetup().click();
	}

	@And("^user click list view icon of sub product retail$")
	public void user_click_list_view_icon_of_sub_product_retail() throws Throwable {
		javaHelper.scrollIntoView(subPrdMst.subProductViewIcon());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.subProductViewIcon(), 60, 2);
		subPrdMst.subProductViewIcon().click();
	}

	@And("^user click add icon for create record in sub product retail$")
	public void user_click_add_icon_for_create_record_in_sub_product_retail() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.addIcon(), 60, 2);
		subPrdMst.addIcon().click();
	}

	@And("^user click Back button icon and Click on Action Icon$")
	public void user_click_back_button_icon_and_click_on_action_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Subproduct_Back(), 60, 2);
		subPrdMst.Subproduct_Back().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Action(), 60, 2);
		subPrdMst.Sub_Product_Action().click();
	}

	@And("^user select Product group under product details and verify fields$")
	public void user_select_product_group_under_product_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Product Group");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Product(), 60, 2);
		Tab = subPrdMst.Sub_Product_Product().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.productGroup(), 60, 2);
		subPrdMst.productGroup().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(), '" + subprdMstData.ProductGroup
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Product code under product details and verify fields$")
	public void user_select_product_code_under_product_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Product Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.productCode(), 60, 2);
		subPrdMst.productCode().click();
		for (int i = 0; i < 200; i++) {
			try {
				javaHelper.scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.ProductCode + "')]/following-sibling::ion-radio")));
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.ProductCode	+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Product codes under product details and verify fields$")
	public void user_select_product_codes_under_product_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Product Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.productCode(), 60, 2);
		subPrdMst.productCode().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.RejectProductCode
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user enter sub product code under sub product definition details and verify fields$")
	public void user_enter_sub_product_code_under_sub_product_definition_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Subproduct Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Subproduct_Definition(), 60, 2);
		Tab = subPrdMst.Sub_Product_Subproduct_Definition().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.subProductCode(), 60, 2);
		subPrdMst.subProductCode().click();
		subPrdMst.subProductCode().sendKeys(subprdMstData.Subproductcode);
	}

	@And("^user enter sub product codes under sub product definition details and verify fields$")
	public void user_enter_sub_product_codes_under_sub_product_definition_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Subproduct Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Subproduct_Definition(), 60, 2);
		Tab = subPrdMst.Sub_Product_Subproduct_Definition().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.subProductCode(), 60, 2);
		subPrdMst.subProductCode().click();
		subPrdMst.subProductCode().sendKeys(subprdMstData.RejectSubproductcode);
	}

	@And("^user enter sub product code description under sub product definition details and verify fields$")
	public void user_enter_sub_product_code_description_under_sub_product_definition_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("subProduct Description");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.subProductDescription(), 60, 2);
		subPrdMst.subProductDescription().click();
		subPrdMst.subProductDescription().sendKeys(subprdMstData.SupproductDescription);
	}

	@And("^user select facility type under facility details$")
	public void user_select_facility_type_under_facility_details() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Facility Type");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Facility(), 60, 2);
		Tab = subPrdMst.Sub_Product_Facility().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.facilityType(), 60, 2);
		subPrdMst.facilityType().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.FacilityType
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select individual or corporate under facility details and verify fields$")
	public void user_select_individual_or_corporate_under_facility_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Individual/Corporate");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.individualCorporate(), 60, 2);
		subPrdMst.individualCorporate().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.Individual_Corporate
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Loan Purpose under facility details and verify fields$")
	public void user_select_loan_purpose_under_facility_details_and_verify_fields() throws Throwable {
		javaHelper.scrollIntoView(subPrdMst.loanPurpose());
		verifyfield.verifyGivenFieldisMandatoryOrNot("Loan Purpose");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.loanPurpose(), 60, 2);
		subPrdMst.loanPurpose().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.LoanPurpose
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Installed Based under facility details and verify fields$")
	public void user_select_installed_based_under_facility_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Installment Based");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.installmentBased(), 60, 2);
		subPrdMst.installmentBased().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.InstallmentBased
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select continue with existing loan number under facility details and verify fields$")
	public void user_select_continue_with_existing_loan_number_under_facility_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Continue Existing Loan Number");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.continueExistingLoanNumber(), 60, 2);
		subPrdMst.continueExistingLoanNumber().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.ContinueExistingLoanNumber
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select financial concept under facility details and verify fields$")
	public void user_select_financial_concept_under_facility_details_and_verify_fields() throws Throwable {
		javaHelper.scrollIntoView(subPrdMst.financialConcept());
		verifyfield.verifyGivenFieldisMandatoryOrNot("Financing Concept");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.financialConcept(), 60, 2);
		subPrdMst.financialConcept().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.FinancingConcept
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Disbursement locking under facility details and verify fields$")
	public void user_select_disbursement_locking_under_facility_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Disbursement Locking");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.disbursementLocking(), 60, 2);
		subPrdMst.disbursementLocking().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.DisbursementLocking
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Top Up Allowed under facility details and verify fields$")
	public void user_select_top_up_allowed_under_facility_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Top Up Allowed");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.topUpAllowed(), 60, 2);
		subPrdMst.topUpAllowed().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.TopupAllowed
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select collatralized under Asset Financed details and verify fields$")
	public void user_select_collatralized_under_asset_financed_details_and_verify_fields() throws Throwable {

		verifyfield.verifyGivenFieldisMandatoryOrNot("Collateralized");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Asset_Financed(), 70, 2);
		Tab = subPrdMst.Sub_Product_Asset_Financed().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Collateralized(), 60, 2);
		subPrdMst.Sub_Product_Collateralized().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.Collateralized
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select finance against existing Asset under Asset Financed details and verify fields$")
	public void user_select_finance_against_existing_asset_under_asset_financed_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Finance Against Existing Asset");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Finance_Against_Existing_Asset(),
				60, 2);
		subPrdMst.Sub_Product_Finance_Against_Existing_Asset().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.FinanceAgainstExistingAsset
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select is multiple Asset Finance is allowed under Asset Financed details and verify fields$")
	public void user_select_is_multiple_asset_finance_is_allowed_under_asset_financed_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Is Multi Asset Finance Allowed");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Multi_Asset_Finance_Allowed(),
				60, 2);
		subPrdMst.Sub_Product_Multi_Asset_Finance_Allowed().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.IsMultiAssetFinanceAllowed
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select impact on under Floating Rate details and verify fields$")
	public void user_select_impact_on_under_floating_rate_details_and_verify_fields() throws Throwable {
		javaHelper.scrollIntoView(subPrdMst.Sub_Product_ImpactOn());
		verifyfield.verifyGivenFieldisMandatoryOrNot("Impact On");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Floating_Rate(), 60, 2);
		Tab = subPrdMst.Sub_Product_Floating_Rate().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_ImpactOn(), 60, 2);
		subPrdMst.Sub_Product_ImpactOn().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + subprdMstData.ImpactOn + "')]/following-sibling::ion-radio"))
						.click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Reset Logic under Floating Rate details and verify fields$")
	public void user_select_reset_logic_under_floating_rate_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Reset Logic");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_ResetLogic(), 60, 2);
		subPrdMst.Sub_Product_ResetLogic().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.ResetLogic
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Floating rate Effective date under Floating Rate details and verify fields$")
	public void user_select_floating_rate_effective_date_under_floating_rate_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Float Rate Effective Date");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Float_Rate_Effective_Date(), 60,
				2);
		subPrdMst.Sub_Product_Float_Rate_Effective_Date().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.FloatRateEffectiverDate
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user select Floating Rate Effective Frequency under Floating Rate details and verify fields$")
	public void user_select_floating_rate_effective_frequency_under_floating_rate_details_and_verify_fields()
			throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Float Rate Effective Frequency");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Float_Rate_Effective_Frequency(),
				60, 2);
		subPrdMst.Sub_Product_Float_Rate_Effective_Frequency().click();
		for (int i = 0; i < 200; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + subprdMstData.FloatRateEffectiveFrequesncy
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {

			}
		}
	}

	@And("^user enter EMI CAP percentage under Floating Rate details and verify fields$")
	public void user_enter_emi_cap_percentage_under_floating_rate_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("EMI Cap (in %)");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_EMI_Cap(), 60, 2);
		subPrdMst.Sub_Product_EMI_Cap().click();
		subPrdMst.Sub_Product_EMI_Cap().sendKeys(subprdMstData.EMICap);
	}

	@And("^user enter tenor tolerance in months under Floating Rate details and verify fields$")
	public void user_enter_tenor_tolerance_in_months_under_floating_rate_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Tenor Tolerance (in months)");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_tenorTolerance(), 60, 2);
		subPrdMst.Sub_Product_tenorTolerance().click();
		subPrdMst.Sub_Product_tenorTolerance().sendKeys(subprdMstData.TenorTolerance);
	}

	@And("^user enter legacy code 1 under Legacy Codes details and verify fields$")
	public void user_enter_legacy_code_1_under_legacy_codes_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Legacy Code 1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Legacy_Codes(), 60, 2);
		Tab = subPrdMst.Sub_Product_Legacy_Codes().getText();
		System.out.println("System should display The Tab as " + Tab);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Legacy_Codes1(), 60, 2);
		subPrdMst.Sub_Product_Legacy_Codes1().click();
		subPrdMst.Sub_Product_Legacy_Codes1().sendKeys(subprdMstData.LegacyCode1);
	}

	@And("^user enter legacy code 2 under Legacy Codes details and verify fields$")
	public void user_enter_legacy_code_2_under_legacy_codes_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Legacy Code 2");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Legacy_Codes2(), 60, 2);
		subPrdMst.Sub_Product_Legacy_Codes2().click();
		subPrdMst.Sub_Product_Legacy_Codes2().sendKeys(subprdMstData.LegacyCode2);
	}

	@And("^user enter dm code under Legacy Codes details and verify fields$")
	public void user_enter_dm_code_under_legacy_codes_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("DM Code");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_DM_Code(), 60, 2);
		subPrdMst.Sub_Product_DM_Code().click();
		subPrdMst.Sub_Product_DM_Code().sendKeys(subprdMstData.DMCode);
	}

	@And("^user enetr Allocation sequence number under Legacy Codes details and verify fields$")
	public void user_enetr_allocation_sequence_number_under_legacy_codes_details_and_verify_fields() throws Throwable {
		verifyfield.verifyGivenFieldisMandatoryOrNot("Allocation Sequence Number");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Alloation_Sequence_Number(), 60,
				2);
		subPrdMst.Sub_Product_Alloation_Sequence_Number().click();
		subPrdMst.Sub_Product_Alloation_Sequence_Number().sendKeys(subprdMstData.AllocationSequenceNumber);
	}

	@And("^user verify and save the Record with Valid data$")
	public void user_verify_and_save_the_record_with_valid_data() throws Throwable {
		javaHelper.scrollIntoView(subPrdMst.Sub_Product_Product_Save());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Product_Save(), 60, 2);
		subPrdMst.Sub_Product_Product_Save().isDisplayed();
		subPrdMst.Sub_Product_Product_Save().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Subproduct_SaveSuccess_alert(), 60, 2);
		Toast = subPrdMst.Subproduct_SaveSuccess_alert().getText();
		Assert.assertEquals(Toast, "success");
	}

	@And("^user goto the Maker Inbox$")
	public void user_goto_the_maker_inbox() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Inbox(), 60, 2);
		subPrdMst.Sub_Product_Inbox().click();
	}

	@Then("^user store the Referance Id in Maker stage and Click on Action Icon$")
	public void user_store_the_referance_id_in_maker_stage_and_click_on_action_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Producr_Product_ReferanceId(), 60, 2);
		String RefId = subPrdMst.Sub_Producr_Product_ReferanceId().getText();
		System.out.println(RefId);
		json.addReferanceData(RefId);
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Action(), 60, 2);
		subPrdMst.Sub_Product_Action().click();
	}

	@And("^user verify the submit button and submit from Maker stage$")
	public void user_verify_the_submit_button_and_submit_from_maker_stage() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Subproduct_Submit(), 60, 2);
		subPrdMst.Subproduct_Submit().isDisplayed();
		subPrdMst.Subproduct_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Subproduct_Submit_confirmation(), 60, 2);
		subPrdMst.Subproduct_Submit_confirmation().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Subproduct_Maker_Submit(), 60, 2);
		subPrdMst.Subproduct_Maker_Submit().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Subproduct_Checker_Id(), 60, 2);
		String CheckerId = subPrdMst.Subproduct_Checker_Id().getText();
		System.out.println(CheckerId);
		String Space = " ";
		String split[] = CheckerId.split(" ");
		Space = split[split.length - 1];
		String popupID = Space.replaceAll("[/.]", "");
		json.addData(popupID);
		System.out.println(popupID);
	}

	// ****************M2_SubPrdMst_CHECKER APPROVE***************//

	@Given("^user log in as uls application checker$")
	public void user_log_in_as_uls_application_checker() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		System.out.println(json.readdata());
		applicationLogin.ulSApplicationLoginAsAChecker(json.readdata());
	}

	@And("^user Click on Menu icon$")
	public void user_click_on_menu_icon() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// subPrdMst.Checker_toggle(), 60, 2);
		// subPrdMst.Checker_toggle().click();
		javaHelper.JSEClick(subPrdMst.Checker_toggle());
	}

	@And("^user Click on Mailbox icon$")
	public void user_click_on_mailbox_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Checker_Inbox(), 60, 2);
		subPrdMst.Checker_Inbox().click();
	}

	@And("^Search the respective reference id and click on Action button$")
	public void search_the_respective_reference_id_and_click_on_action_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				driver.findElement(By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button")),60, 2);
		driver.findElement(By.xpath("//span[text()='" + json.readReferancedata() + "']/ancestor::tr/td[1]/button")).click();
	}

	@And("^user Click on Approve icon$")
	public void user_click_on_approve_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Checker_Approve(), 60, 2);
		subPrdMst.Checker_Approve().click();
	}

	@And("^user Enter the remarks in Action confirmation popup$")
	public void user_enter_the_remarks_in_action_confirmation_popup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Checker_Approve(), 60, 2);
		subPrdMst.Checker_Alert_Approve().click();
	}

	@Then("^user Click on Remarks button in Action confirmation popup$")
	public void user_click_on_remarks_button_in_action_confirmation_popup() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Checker_Final_Approve(), 60, 2);
		subPrdMst.Checker_Final_Approve().click();
	}

	@Then("^user verify the Record got Approved$")
	public void user_verify_the_record_got_approved() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Subproduct_Checker_Id(), 60, 2);
		Toast = subPrdMst.Subproduct_Checker_Id().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record APPROVED Successfully");
	}

	// *********************@M1.1_SubPrdMst_ListView*********************//

	@Then("^User validate the approved record in list view$")
	public void user_validate_the_approved_record_in_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Maker_Listview_Prdcode(), 60, 2);
		String validate = driver.findElement(By.xpath("//span[contains(text(),'" + subprdMstData.ProductCode + "')]"))
				.getText();
		System.out.println(validate);
		Assert.assertEquals(validate, subprdMstData.ProductCode);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Maker_Listview_subPrdcode(), 60, 2);
		String validate1 = driver
				.findElement(By.xpath("//span[contains(text(),'" + subprdMstData.Subproductcode + "')]")).getText();
		System.out.println(validate1);
		Assert.assertEquals(validate1, subprdMstData.Subproductcode);

	}

	// *********************@M3_SubPrdMst_Reject*********************//

	@And("^user Click on Reject icon$")
	public void user_click_on_reject_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Checker_Reject(), 60, 2);
		subPrdMst.Checker_Reject().click();
	}

	@And("^user Enter the remarks for Reject the Record$")
	public void user_enter_the_remarks_for_reject_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Checker_Alert_Reject(), 60, 2);
		subPrdMst.Checker_Alert_Reject().click();
	}

	@Then("^user Click on Remarks button for Reject confirmation$")
	public void user_click_on_remarks_button_for_reject_confirmation() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Checker_Final_Reject(), 60, 2);
		subPrdMst.Checker_Final_Reject().click();
	}

	@Then("^user verify the Record got Rejected$")
	public void user_verify_the_record_got_rejected() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Subproduct_Checker_Id(), 60, 2);
		Toast = subPrdMst.Subproduct_Checker_Id().getText();
		System.out.println(Toast);
		Assert.assertEquals(Toast, "Record REJECTED Successfully");
	}

	/// *******************@M2_SubPrdMst_ListView*******************///

	@Then("^User validate the Rejected record in list view$")
	public void user_validate_the_rejected_record_in_list_view() throws Throwable {
		try {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Maker_Listview_Prdcode(), 60, 2);
			String validate = driver
					.findElement(By.xpath("//span[contains(text(),'" + subprdMstData.RejectProductCode + "')]"))
					.getText();
			System.out.println(validate);
			Assert.assertEquals(validate, subprdMstData.RejectProductCode);
		} catch (Exception e) {
			System.out.println("The Rejected Record Not in the List view " + subprdMstData.RejectProductCode);
		}

		try {
			waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Maker_Listview_subPrdcode(), 60, 2);
			String validate1 = driver
					.findElement(By.xpath("//span[contains(text(),'" + subprdMstData.RejectSubproductcode + "')]"))
					.getText();
			System.out.println(validate1);
			Assert.assertEquals(validate1, subprdMstData.RejectSubproductcode);
		} catch (Exception e) {
			System.out.println("The Rejected Record Not in the List view " + subprdMstData.RejectSubproductcode);
		}
	}

	/// *******************@M4_SubPrdMst_Return*******************///

	@And("^user Click on Return icon$")
	public void user_click_on_return_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Checker_Return(), 60, 2);
		subPrdMst.Checker_Return().click();
	}

	@And("^user Enter the remarks for Return the Record$")
	public void user_enter_the_remarks_for_return_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Checker_Alert_Return(), 60, 2);
		subPrdMst.Checker_Alert_Return().click();
	}

	@Then("^user Click on Remarks button for Return confirmation$")
	public void user_click_on_remarks_button_for_return_confirmation() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Checker_Alert_Return(), 60, 2);
		subPrdMst.Checker_Final_Return().click();
	}

	@Then("^user verify the Record got Return$")
	public void user_verify_the_record_got_return() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Subproduct_Checker_Id(), 60, 2);
		Toast = subPrdMst.Subproduct_Checker_Id().getText();
		System.out.println(Toast);
		// Assert.assertEquals(Toast, "Record RETURNED Successfully, and Current Stage
		// is MAKER with status PENDING from "+json.readdata()+".");
	}

	/// *******************@M3_SubPrdMst_ListView*******************///

	@And("^user click Edit view icon of sub product retail$")
	public void user_click_edit_view_icon_of_sub_product_retail() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.subProductEditIcon(), 60, 2);
		subPrdMst.subProductEditIcon().click();
	}

	@Then("^User validate the Returned record in list view$")
	public void user_validate_the_returned_record_in_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Maker_Listview_Prdcode(), 60, 2);
		String validate = driver.findElement(By.xpath("//span[contains(text(),'" + subprdMstData.ProductCode + "')]"))
				.getText();
		System.out.println(validate);
		Assert.assertEquals(validate, subprdMstData.ProductCode);

		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Maker_Listview_subPrdcode(), 60, 2);
		String validate1 = driver
				.findElement(By.xpath("//span[contains(text(),'" + subprdMstData.Subproductcode + "')]")).getText();
		System.out.println(validate1);
		Assert.assertEquals(validate1, subprdMstData.Subproductcode);
	}

	/// *******************@M4_SubPrdMst_InvalidCreation*******************///

	@And("^user verify and save the Record with InValid data$")
	public void user_verify_and_save_the_record_with_invalid_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.Sub_Product_Product_Save(), 60, 2);
		subPrdMst.Sub_Product_Product_Save().isDisplayed();
		subPrdMst.Sub_Product_Product_Save().click();
	}

	@And("^user enter sub product code as special characters$")
	public void user_enter_sub_product_code_as_special_characters() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subPrdMst.subProductCode(), 60, 2);
		subPrdMst.subProductCode().click();
		subPrdMst.subProductCode().sendKeys(subprdMstData.Specialchar);
	}

	@Then("^user verify the Special characters field proper validation message$")
	public void user_verify_the_special_characters_field_proper_validation_message() throws Throwable {
		String nameErrorMessage = driver
				.findElement(By.xpath("(//ion-badge[contains(text(),'Alphanumeric characters allowed')])[1]"))
				.getText();
		String expectedErrorText = "Alphanumeric characters allowed";
		if (nameErrorMessage.equalsIgnoreCase(expectedErrorText)) {
			System.out.println("System should allow only " + nameErrorMessage);
		} else {
			System.out.println("System should not allow " + nameErrorMessage);
		}
	}

	@Then("^user verify the Required field proper validation message$")
	public void user_verify_the_required_field_proper_validation_message() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, driver.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]")), 60, 5);
		String nameErrorMessage = driver.findElement(By.xpath("(//ion-badge[contains(text(),'Required field')])[1]"))
				.getText();
		String expectedErrorText = "Required field";
		if (nameErrorMessage.equalsIgnoreCase(expectedErrorText)) {
			System.out.println("System should not allow the Mandatory fields Empty.The Popup validation message is "
					+ nameErrorMessage);
		} else {
			System.out.println(
					"System should allow the Mandatory fields.The Popup validation message is " + nameErrorMessage);
		}
	}

	@And("^user click on the first Edit Icon$")
	public void user_click_on_the_first_edit_icon() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subretail.pencil(), 60, 5);
		subretail.pencil().click();

	}

	@And("^user goto the parameter subTab$")
	public void user_goto_the_parameter_subtab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, subretail.parameter(), 60, 5);
		subretail.parameter().click();
	}

	@And("^user Enter the loan currency value$")
	public void user_enter_the_loan_currency_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, parameter.loanCurrency(), 60, 5);
		parameter.loanCurrency().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath(
						"//ion-label[contains(text(),'" + paradata.LoanCurrency + "')]//following-sibling::ion-radio"))
						.click();

				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^user Enter the Remark value as special character$")
	public void user_enter_the_remark_value_as_special_character() throws Throwable {
		javaHelper.scrollIntoView(parameter.remarks());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, parameter.remarks(), 60, 5);
		parameter.remarks().click();
		parameter.remarks().sendKeys(subprdMstData.Specialchar);
	}

	@And("^user verify and save the Records with InValid data$")
	public void user_verify_and_save_the_records_with_invalid_data() throws Throwable {
		javaHelper.scrollIntoView(parameter.Save());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, parameter.Save(), 60, 5);
		parameter.Save().click();
	}

}
