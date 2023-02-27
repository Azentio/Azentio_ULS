package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.ApplicationdetailDisbmtMakerObject;
import resources.BaseClass;
import resources.ExcelData;
import testDataType.ApplicationDisbursementMakerTestData;
import testDataType.KULS_Login_TestDataType;

public class ApplicationDetail_disbursmentMaker extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	ApplicationDisbursementMakerTestData applicationdetailsData = jsonConfig
			.getApplication_DisbursementMakerListByName("Maker");
	ApplicationdetailDisbmtMakerObject disbmtmaker = new ApplicationdetailDisbmtMakerObject(driver);
	WaitHelper waithelper = new WaitHelper(driver);
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00073\\Downloads\\UlsTestDataDesign.xlsx","CustomerEmployment","Data Set ID");
	Map<String, String> testData;
	
	@Given("^Launch the kuls application and Navigate to Application details view list$")
	public void launch_the_kuls_application_and_navigate_to_application_details_view_list() throws Throwable {
		ExcelData excelData = new ExcelData("C:\\Users\\inindc00073\\Downloads\\UlsTestDataDesign.xlsx","LoginCredentilas","Stage");
        Map<String, String> testdata = excelData.getTestdata("Maker2");
		String kulsApplicationUrl = configFileReader.getApplicationTransactionUrl();
		driver.get(kulsApplicationUrl);
		System.out.println();
		applicationLogin.loginUlsApplicationAsMaker(testdata.get("Username"),testdata.get("Password"));

		//applicationLogin.loginUlsApplicationAsMaker(loginData.Username1, loginData.Password1);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.TransactionButtonInLeftPanel(), 60, 2);
		disbmtmaker.TransactionButtonInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.ApplicationManagerInLeftPanel(), 60, 2);
		disbmtmaker.ApplicationManagerInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.ApplicationDetailsViewList(), 60, 2);
		disbmtmaker.ApplicationDetailsViewList().click();
	}

	@And("^Click on Add icon in Application details view list$")
	public void click_on_add_icon_in_application_details_view_list() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.ApplicationDetailsAddIcon(), 60, 2);
		disbmtmaker.ApplicationDetailsAddIcon().click();
	}

	@And("^Select the value in customer type field of Application details$")
	public void select_the_value_in_customer_type_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_CustomerTypeField(), 60, 2);
		disbmtmaker.AppDataEntry_CustomerTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.CustomerType
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in ID type field of Application details$")
	public void select_the_value_in_id_type_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_IDTypeField(), 60, 2);
		disbmtmaker.AppDataEntry_IDTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.IDType
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Enter the value in ID number field of Application details$")
	public void enter_the_value_in_id_number_field_of_application_details() throws Throwable {
		Thread.sleep(2000);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_IDNumberField(), 60, 2);
		disbmtmaker.AppDataEntry_IDNumberField().click();
		disbmtmaker.AppDataEntry_IDNumberField().sendKeys(applicationdetailsData.IDNumber);
	}

	@And("^Click on Search button in Application details$")
	public void click_on_search_button_in_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_SearchButton(), 60, 2);
		disbmtmaker.AppDataEntry_SearchButton().click();
	}

	@And("^Select the value in Primary product field of Application details$")
	public void select_the_value_in_primary_product_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_PrimaryProductField1(), 60, 2);
		disbmtmaker.AppDataEntry_PrimaryProductField1().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.PrimaryProduct
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Primary sub product field of Application details$")
	public void select_the_value_in_primary_sub_product_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_PrimarySubProductField(), 60, 2);
		disbmtmaker.AppDataEntry_PrimarySubProductField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.PrimarySubProduct
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Enter the value in Total finance amount requested field of Application details$")
	public void enter_the_value_in_total_finance_amount_requested_field_of_application_details() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,disbmtmaker.AppDataEntry_TotalFinanceAmountRequestedField(),60,2);
		for (int i = 0; i < 50; i++) {
			try {
				disbmtmaker.AppDataEntry_TotalFinanceAmountRequestedField().click();
				disbmtmaker.AppDataEntry_TotalFinanceAmountRequestedField()
						.sendKeys(applicationdetailsData.TotalFincanceAmountRequested);
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the value in Declared net income field of Application details$")
	public void enter_the_value_in_declared_net_income_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_DeclaredNetIncomeField(), 60, 2);
		disbmtmaker.AppDataEntry_DeclaredNetIncomeField().click();
		disbmtmaker.AppDataEntry_DeclaredNetIncomeField().sendKeys(applicationdetailsData.DeclaredNetIncome);
	}

	@And("^Enter the value in Declared current obligations field of Application details$")
	public void enter_the_value_in_declared_current_obligations_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_DeclaredCurrentObligationsField(), 60, 2);
		disbmtmaker.AppDataEntry_DeclaredCurrentObligationsField().click();
		disbmtmaker.AppDataEntry_DeclaredCurrentObligationsField()
				.sendKeys(applicationdetailsData.DeclaredCurrentObligations);
	}

	@And("^Select the value in Special promotion of Application details$")
	public void select_the_value_in_special_promotion_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_SpecialPromotionField(), 60, 2);
		disbmtmaker.AppDataEntry_SpecialPromotionField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.SpecialPromotion
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Sourcing channel field of Application details$")
	public void select_the_value_in_sourcing_channel_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_SourcingChannelField(), 60, 2);
		disbmtmaker.AppDataEntry_SourcingChannelField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.SourcingChannel
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Business center code field of Application details$")
	public void select_the_value_in_business_center_code_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_BusinessCenterCodeField(), 60, 2);
		disbmtmaker.AppDataEntry_BusinessCenterCodeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.BusinessCenterCode
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Servicing type field of Application details$")
	public void select_the_value_in_servicing_type_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_ServicingTypeField(), 60, 2);
		disbmtmaker.AppDataEntry_ServicingTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.ServicingType
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Servicing entity field of Application details$")
	public void select_the_value_in_servicing_entity_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_ServicingEntityField(), 60, 2);
		disbmtmaker.AppDataEntry_ServicingEntityField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.ServicingEntity
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Servicing branch field of Application details$")
	public void select_the_value_in_servicing_branch_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_ServicingBranchField(), 60, 2);
		disbmtmaker.AppDataEntry_ServicingBranchField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.ServicingBranch
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Closing staff field of Application details$")
	public void select_the_value_in_closing_staff_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_ClosingStaffField(), 60, 2);
		disbmtmaker.AppDataEntry_ClosingStaffField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.ClosingStaff
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Sourcing type field of Application details$")
	public void select_the_value_in_sourcing_type_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_SourcingTypeField(), 60, 2);
		disbmtmaker.AppDataEntry_SourcingTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.SourcingType
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Sourcing staff field of Application details$")
	public void select_the_value_in_sourcing_staff_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_SourcingStaffField(), 60, 2);
		disbmtmaker.AppDataEntry_SourcingStaffField().click();
		for (int i = 0; i < 50; i++) {
			try {
				seleniumactions.getClickAndActionsHelper()
						.moveToElement(driver.findElement(By.xpath("//ion-label[contains(text(),'"
								+ applicationdetailsData.SourcingStaff + "')]/following-sibling::ion-radio")));
				seleniumactions.getClickAndActionsHelper()
						.clickOnElement(driver.findElement(By.xpath("//ion-label[contains(text(),'"
								+ applicationdetailsData.SourcingStaff + "')]/following-sibling::ion-radio")));
				// driver.findElement(By.xpath("//ion-label[contains(text(),'" +
				// applicationdetailsData.SourcingStaff
				// + "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Sourcing entity field of Application details$")
	public void select_the_value_in_sourcing_entity_field_of_application_details() throws Throwable {
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
		// disbmtmaker.AppDataEntry_SourcingEntityField(), 60, 2);
		for (int j = 0; j <= 50; j++) {
			try {
				seleniumactions.getJavascriptHelper()
						.scrollIntoViewAndClick(disbmtmaker.AppDataEntry_SourcingEntityField());
				break;
			} catch (Exception e) {
				if (j == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.SourcingEntity
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Sourcing office field of Application details$")
	public void select_the_value_in_sourcing_office_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_SourcingOfficeField(), 60, 2);
		disbmtmaker.AppDataEntry_SourcingOfficeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.SourcingOffice
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Reference type field of Application details$")
	public void select_the_value_in_reference_type_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_ReferenceTypeField(), 60, 2);
		disbmtmaker.AppDataEntry_ReferenceTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.ReferenceType
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Select the value in Reference entity field of Application details$")
	public void select_the_value_in_reference_entity_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_ReferenceEntityField(), 60, 2);
		disbmtmaker.AppDataEntry_ReferenceEntityField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.ReferenceEntity
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Enter the value in Reference code field of Application details$")
	public void enter_the_value_in_reference_code_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_ReferenceCodeField(), 60, 2);
		for (int i = 0; i < 50; i++) {
			try {
				disbmtmaker.AppDataEntry_ReferenceCodeField().click();
				disbmtmaker.AppDataEntry_ReferenceCodeField().sendKeys(applicationdetailsData.ReferenceCode);
				break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Click on Save button of Application details$")
	public void click_on_save_button_of_application_details() throws Throwable {
		for (int j = 0; j <= 50; j++) {
			try {
				seleniumactions.getJavascriptHelper().scrollIntoViewAndClick(disbmtmaker.ApplicationDetailsSaveIcon());
				break;
			} catch (Exception e) {
				// if (j == 50) {
				// Assert.fail(e.getMessage());
				// }
			}
		}
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
		// disbmtmaker.ApplicationDetailsSaveIcon(), 60, 2);
		// disbmtmaker.ApplicationDetailsSaveIcon().click();
	}

	@And("^Enter the value in CIF ID field of Application details$")
	public void enter_the_value_in_cif_id_field_of_application_details() throws Throwable {
		Thread.sleep(2000);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_CIFIDField(), 60, 2);
		disbmtmaker.AppDataEntry_CIFIDField().click();
		disbmtmaker.AppDataEntry_CIFIDField().sendKeys(applicationdetailsData.CIFID);
	}

	@And("^Enter the value in Company name field of Application details$")
	public void enter_the_value_in_company_name_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_CompanyNameField(), 60, 2);
		disbmtmaker.AppDataEntry_CompanyNameField().click();
		disbmtmaker.AppDataEntry_CompanyNameField().sendKeys(applicationdetailsData.CompanyName);
	}

	@And("^Click on Create new request button in Application details$")
	public void click_on_create_new_request_button_in_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.AppDataEntry_CreateNewRequestButton(), 60, 2);
		disbmtmaker.AppDataEntry_CreateNewRequestButton().click();
	}

	// ***************Kamalapriya***************************//
	@And("^Click the inbox button in application detail$")
	public void click_the_inbox_button_in_application_detail() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Inbox_Icon(), 60, 2);
		disbmtmaker.Inbox_Icon().click();
	}

	@Then("^click the action icon at new app stage$")
	public void click_the_action_icon_at_new_app_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.NewApp_ActionIcon(), 60, 2);
		disbmtmaker.NewApp_ActionIcon().click();
	}

	@And("^Click the customer details tab$")
	public void click_the_customer_details_tab() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_CustomerDetailTab(), 60, 2);
		disbmtmaker.Application_CustomerDetailTab().click();
	}

	@Then("^Click the Round button in customer details tab$")
	public void click_the_round_button_in_customer_details_tab() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_CustomerDetailsRound(), 60, 2);
		disbmtmaker.Application_CustomerDetailsRound().click();
	}

	@And("^Click the application details tab$")
	public void click_the_application_details_tab() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_Tab(), 60, 2);
		disbmtmaker.Application_Tab().click();
	}

	@Then("^Click the submit button in application details$")
	public void click_the_submit_button_in_application_details() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_NewApp_SubmitButton(), 60, 2);
		disbmtmaker.Application_NewApp_SubmitButton().click();
	}

	@And("^Click the Ok button for action confirmation in application detail$")
	public void click_the_ok_button_for_action_confirmation_in_application_detail() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_NewApp_SubmitAlertButton(), 60,
				2);
		disbmtmaker.Application_NewApp_SubmitAlertButton().click();
	}

	@Then("^Click the final submit button in application detail$")
	public void click_the_final_submit_button_in_application_detail() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_NewApp_SubmitFinalButton(), 60,
				2);
		disbmtmaker.Application_NewApp_SubmitFinalButton().click();
	}

	@And("^Click the action icon at DUPAPPDEC stage$")
	public void click_the_action_icon_at_dupappdec_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_DUPAPPDEC_ActionIcon(), 60, 2);
		disbmtmaker.Application_DUPAPPDEC_ActionIcon().click();
	}

	@Then("^Approve the record in application detail$")
	public void approve_the_record_in_application_detail() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_APPDATAENT_ApproveButton(), 60,
				2);
		disbmtmaker.Application_APPDATAENT_ApproveButton().click();
	}

	@And("^Click the action  icon in app data entry stage$")
	public void click_the_action_icon_in_app_data_entry_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_APPDATAENT_ActionIcon(), 60,
				2);
		disbmtmaker.Application_APPDATAENT_ActionIcon().click();
	}

	@And("^Click the action icon at LEGVRFY stage$")
	public void click_the_action_icon_at_legvrfy_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_LEGVRFY_ActionButton(), 60, 2);
		disbmtmaker.Application_LEGVRFY_ActionButton().click();
	}

	@And("^Click the action icon at FCUVRFY stage$")
	public void click_the_action_icon_at_fcuvrfy_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_FCUVRFY_ActionButton(), 60, 2);
		disbmtmaker.Application_FCUVRFY_ActionButton().click();
	}

	@And("^Click the action icon at OFFERING stage$")
	public void click_the_action_icon_at_offering_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_OFFERING_ActionButton(), 60,
				2);
		disbmtmaker.Application_OFFERING_ActionButton().click();
	}

	@Then("^click the application tab in OFFERING stage$")
	public void click_the_application_tab_in_offering_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_DetailTab_Offering(), 60, 2);
		disbmtmaker.Application_DetailTab_Offering().click();
	}

	@And("^Click the action icon at DISBMKR stage$")
	public void click_the_action_icon_at_disbmkr_stage() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_DISBMKR_ActionIcon(), 60, 2);
		disbmtmaker.Application_DISBMKR_ActionIcon().click();
	}

//SEARCH AND FIND***********************//

	@Then("^Search the record in application details for disbursement maker$")
	public void search_the_record_in_application_details_for_disbursement_maker() throws Throwable {
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_DetailTab_SearchButtons(), 60,
				2);
		disbmtmaker.Application_DetailTab_SearchButtons().click();
		waithelper.waitForElementToVisibleWithFluentWait(driver, disbmtmaker.Application_DetailTab_SearchText(), 60, 2);
		disbmtmaker.Application_DetailTab_SearchText().click();
		disbmtmaker.Application_DetailTab_SearchText().sendKeys("DISBMKR");
	}

	@Then("^Verify the field primary product is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_primary_product_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_primaryProduct(), 60, 2);
		disbmtmaker.DISBMKR_primaryProduct().isDisplayed();
		try {
			disbmtmaker.DISBMKR_primaryProduct().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}

	}

	@Then("^Verify the field primary sub product is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_primary_sub_product_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_primarysubProduct(), 60, 2);
		disbmtmaker.DISBMKR_primarysubProduct().isDisplayed();
		try {
			disbmtmaker.DISBMKR_primarysubProduct().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Total finance amount requested  is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_total_finance_amount_requested_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_TotalFinanceAmountRequested(), 60, 2);
		disbmtmaker.DISBMKR_TotalFinanceAmountRequested().isDisplayed();
		try {
			disbmtmaker.DISBMKR_TotalFinanceAmountRequested().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Declared net income is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_declared_net_income_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_DeclaredNetIncome(), 60, 2);
		disbmtmaker.DISBMKR_DeclaredNetIncome().isDisplayed();
		try {
			disbmtmaker.DISBMKR_DeclaredNetIncome().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Declared current obligation is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_declared_current_obligation_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_DeclaredCurrentObligations(), 60, 2);
		disbmtmaker.DISBMKR_DeclaredCurrentObligations().isDisplayed();
		try {
			disbmtmaker.DISBMKR_DeclaredCurrentObligations().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field special promotion is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_special_promotion_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SpecialPromotion(), 60, 2);
		disbmtmaker.DISBMKR_SpecialPromotion().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SpecialPromotion().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field sourcing channel is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_sourcing_channel_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SourcingChannel(), 60, 2);
		disbmtmaker.DISBMKR_SourcingChannel().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SourcingChannel().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Business Center Code is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_business_center_code_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_BusinessCenterCode(), 60, 2);
		disbmtmaker.DISBMKR_BusinessCenterCode().isDisplayed();
		try {
			disbmtmaker.DISBMKR_BusinessCenterCode().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Servicing Type is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_servicing_type_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ServicingType(), 60, 2);
		disbmtmaker.DISBMKR_ServicingType().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ServicingType().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Servicing Entity is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_servicing_entity_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ServicingEntity(), 60, 2);
		disbmtmaker.DISBMKR_ServicingEntity().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ServicingEntity().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Servicing Branch is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_servicing_branch_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ServicingBranch(), 60, 2);
		disbmtmaker.DISBMKR_ServicingBranch().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ServicingBranch().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Closing Staff is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_closing_staff_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ClosingStaff(), 60, 2);
		disbmtmaker.DISBMKR_ClosingStaff().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ClosingStaff().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Sourcing Type is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_sourcing_type_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SourcingType(), 60, 2);
		disbmtmaker.DISBMKR_SourcingType().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SourcingType().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Sourcing Staff is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_sourcing_staff_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SourcingStaff(), 60, 2);
		disbmtmaker.DISBMKR_SourcingStaff().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SourcingStaff().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Sourcing Entity is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_sourcing_entity_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SourcingEntity(), 60, 2);
		disbmtmaker.DISBMKR_SourcingEntity().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SourcingEntity().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Sourcing Office is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_sourcing_office_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_SourcingOffice(), 60, 2);
		disbmtmaker.DISBMKR_SourcingOffice().isDisplayed();
		try {
			disbmtmaker.DISBMKR_SourcingOffice().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Reference Type is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_reference_type_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ReferenceType(), 60, 2);
		disbmtmaker.DISBMKR_ReferenceType().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ReferenceType().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Reference Entity  is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_reference_entity_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ReferenceEntity(), 60, 2);
		disbmtmaker.DISBMKR_ReferenceEntity().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ReferenceEntity().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

	@Then("^Verify the field Reference Code is in read only mode in Application details DISBMKR stage$")
	public void verify_the_field_reference_code_is_in_read_only_mode_in_application_details_disbmkr_stage()
			throws Throwable {
		boolean status = true;
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				disbmtmaker.DISBMKR_ReferenceCode(), 60, 2);
		disbmtmaker.DISBMKR_ReferenceCode().isDisplayed();
		try {
			disbmtmaker.DISBMKR_ReferenceCode().click();

		} catch (Exception e) {
			status = false;
			System.out.println("Field is not editable");
		
		}
		Assert.assertFalse(status);
	}

}
