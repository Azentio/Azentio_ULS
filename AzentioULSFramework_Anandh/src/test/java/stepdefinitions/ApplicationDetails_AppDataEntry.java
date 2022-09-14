package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.ApplicationDetails_AppDataEntryObj;
import resources.BaseClass;
import testDataType.KULS_ApplicationDetails_AppDataEntry_Testdata;
import testDataType.KULS_Login_TestDataType;

public class ApplicationDetails_AppDataEntry {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	ApplicationDetails_AppDataEntryObj applicationentryobj = new ApplicationDetails_AppDataEntryObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	KULS_ApplicationDetails_AppDataEntry_Testdata applicationdetailsData = jsonConfig
			.getApplicationDetailsByName("Maker");

//	@Given("^Launch the kuls application and Navigate to Application details view list$")
//	public void launch_the_kuls_application_and_navigate_to_application_details_view_list() throws Throwable {
//		String kulsApplicationUrl = configFileReader.getULSApplicationCenBankUrl();
//		driver.get(kulsApplicationUrl);
//		System.out.println();
//		applicationLogin.loginUlsApplicationAsMaker(loginData.Username1, loginData.Password1);
//		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
//				applicationentryobj.TransactionButtonInLeftPanel(), 60, 2);
//		applicationentryobj.TransactionButtonInLeftPanel().click();
//		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
//				applicationentryobj.ApplicationManagerInLeftPanel(), 60, 2);
//		applicationentryobj.ApplicationManagerInLeftPanel().click();
//		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
//				applicationentryobj.ApplicationDetailsViewList(), 60, 2);
//		applicationentryobj.ApplicationDetailsViewList().click();
//	}

	@And("^Click on Add icon in Application details view list$")
	public void click_on_add_icon_in_application_details_view_list() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.TransactionButtonInLeftPanel(), 60, 2);
		applicationentryobj.TransactionButtonInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.ApplicationManagerInLeftPanel(), 60, 2);
		applicationentryobj.ApplicationManagerInLeftPanel().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.ApplicationDetailsViewList(), 60, 2);
		applicationentryobj.ApplicationDetailsViewList().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.ApplicationDetailsAddIcon(), 60, 2);
		applicationentryobj.ApplicationDetailsAddIcon().click();
	}

	@And("^Select the value in customer type field of Application details$")
	public void select_the_value_in_customer_type_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_CustomerTypeField(), 60, 2);
		applicationentryobj.AppDataEntry_CustomerTypeField().click();
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
				applicationentryobj.AppDataEntry_IDTypeField(), 60, 2);
		applicationentryobj.AppDataEntry_IDTypeField().click();
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
				applicationentryobj.AppDataEntry_IDNumberField(), 60, 2);
		applicationentryobj.AppDataEntry_IDNumberField().click();
		applicationentryobj.AppDataEntry_IDNumberField().sendKeys(applicationdetailsData.IDNumber);
	}

	@And("^Click on Search button in Application details$")
	public void click_on_search_button_in_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_SearchButton(), 60, 2);
		applicationentryobj.AppDataEntry_SearchButton().click();
	}

	@And("^Select the value in Primary product field of Application details$")
	public void select_the_value_in_primary_product_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_PrimaryProductField(), 60, 2);
		applicationentryobj.AppDataEntry_PrimaryProductField().click();
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
				applicationentryobj.AppDataEntry_PrimarySubProductField(), 60, 2);
		applicationentryobj.AppDataEntry_PrimarySubProductField().click();
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
		// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.AppDataEntry_TotalFinanceAmountRequestedField(),60,2);
		for (int i = 0; i < 50; i++) {
			try {
				applicationentryobj.AppDataEntry_TotalFinanceAmountRequestedField().click();
				applicationentryobj.AppDataEntry_TotalFinanceAmountRequestedField()
						.sendKeys(applicationdetailsData.TotalFincanceAmountRequested);
				break;

			} catch (Exception e) {

			}
		}

	}

	@And("^Enter the value in Declared net income field of Application details$")
	public void enter_the_value_in_declared_net_income_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_DeclaredNetIncomeField(), 60, 2);
		applicationentryobj.AppDataEntry_DeclaredNetIncomeField().click();
		applicationentryobj.AppDataEntry_DeclaredNetIncomeField().sendKeys(applicationdetailsData.DeclaredNetIncome);
	}

	@And("^Enter the value in Declared current obligations field of Application details$")
	public void enter_the_value_in_declared_current_obligations_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_DeclaredCurrentObligationsField(), 60, 2);
		applicationentryobj.AppDataEntry_DeclaredCurrentObligationsField().click();
		applicationentryobj.AppDataEntry_DeclaredCurrentObligationsField()
				.sendKeys(applicationdetailsData.DeclaredCurrentObligations);
	}

	@And("^Select the value in Special promotion of Application details$")
	public void select_the_value_in_special_promotion_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_SpecialPromotionField(), 60, 2);
		applicationentryobj.AppDataEntry_SpecialPromotionField().click();
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
				applicationentryobj.AppDataEntry_SourcingChannelField(), 60, 2);
		applicationentryobj.AppDataEntry_SourcingChannelField().click();
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
				applicationentryobj.AppDataEntry_BusinessCenterCodeField(), 60, 2);
		applicationentryobj.AppDataEntry_BusinessCenterCodeField().click();
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
				applicationentryobj.AppDataEntry_ServicingTypeField(), 60, 2);
		applicationentryobj.AppDataEntry_ServicingTypeField().click();
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
				applicationentryobj.AppDataEntry_ServicingEntityField(), 60, 2);
		applicationentryobj.AppDataEntry_ServicingEntityField().click();
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
				applicationentryobj.AppDataEntry_ServicingBranchField(), 60, 2);
		applicationentryobj.AppDataEntry_ServicingBranchField().click();
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
				applicationentryobj.AppDataEntry_ClosingStaffField(), 60, 2);
		applicationentryobj.AppDataEntry_ClosingStaffField().click();
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
				applicationentryobj.AppDataEntry_SourcingTypeField(), 60, 2);
		applicationentryobj.AppDataEntry_SourcingTypeField().click();
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
				applicationentryobj.AppDataEntry_SourcingStaffField(), 60, 2);
		applicationentryobj.AppDataEntry_SourcingStaffField().click();
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
		// applicationentryobj.AppDataEntry_SourcingEntityField(), 60, 2);
		for (int j = 0; j <= 50; j++) {
			try {
				seleniumactions.getJavascriptHelper()
						.scrollIntoViewAndClick(applicationentryobj.AppDataEntry_SourcingEntityField());
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
				applicationentryobj.AppDataEntry_SourcingOfficeField(), 60, 2);
		applicationentryobj.AppDataEntry_SourcingOfficeField().click();
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
				applicationentryobj.AppDataEntry_ReferenceTypeField(), 60, 2);
		applicationentryobj.AppDataEntry_ReferenceTypeField().click();
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
				applicationentryobj.AppDataEntry_ReferenceEntityField(), 60, 2);
		applicationentryobj.AppDataEntry_ReferenceEntityField().click();
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
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.AppDataEntry_ReferenceCodeField(), 60, 2);
		for (int i = 0; i < 50; i++) {
			try {
		applicationentryobj.AppDataEntry_ReferenceCodeField().click();
		applicationentryobj.AppDataEntry_ReferenceCodeField().sendKeys(applicationdetailsData.ReferenceCode);
		break;
			} catch (Exception e) {
			}
		}
	}

	@And("^Click on Save button of Application details$")
	public void click_on_save_button_of_application_details() throws Throwable {
		for (int j = 0; j <= 50; j++) {
			try {
				seleniumactions.getJavascriptHelper()
						.scrollIntoViewAndClick(applicationentryobj.ApplicationDetailsSaveIcon());
				break;
			} catch (Exception e) {
				if (j == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}
			//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
			//	applicationentryobj.ApplicationDetailsSaveIcon(), 60, 2);
		//applicationentryobj.ApplicationDetailsSaveIcon().click();
	}

	@And("^Enter the value in CIF ID field of Application details$")
	public void enter_the_value_in_cif_id_field_of_application_details() throws Throwable {
		Thread.sleep(2000);
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_CIFIDField(), 60, 2);
		applicationentryobj.AppDataEntry_CIFIDField().click();
		applicationentryobj.AppDataEntry_CIFIDField().sendKeys(applicationdetailsData.CIFID);
	}

	@And("^Enter the value in Company name field of Application details$")
	public void enter_the_value_in_company_name_field_of_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_CompanyNameField(), 60, 2);
		applicationentryobj.AppDataEntry_CompanyNameField().click();
		applicationentryobj.AppDataEntry_CompanyNameField().sendKeys(applicationdetailsData.CompanyName);
	}

	@And("^Click on Create new request button in Application details$")
	public void click_on_create_new_request_button_in_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_CreateNewRequestButton(), 60, 2);
		applicationentryobj.AppDataEntry_CreateNewRequestButton().click();
	}

}
