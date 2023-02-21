package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.ApplicationDetails_AppDataEntryObj;
import resources.BaseClass;
import resources.ExcelData;
import testDataType.KULS_ApplicationDetails_AppDataEntry_Testdata;
import testDataType.KULS_Login_TestDataType;

public class ApplicationDetails_AppDataEntry {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login login = new KULS_Application_Login(driver);
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	Selenium_Actions seleniumactions = new Selenium_Actions(driver);
	ApplicationDetails_AppDataEntryObj applicationentryobj = new ApplicationDetails_AppDataEntryObj(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	KULS_ApplicationDetails_AppDataEntry_Testdata applicationdetailsData = jsonConfig
			.getApplicationDetailsByName("Maker");
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign1702a.xlsx", "ApplicationDetails_AppDataEntry", "Data Set ID") ;
	Map<String, String> testdata;

	@Given("^Launch the kuls application and Navigate to Application details view list$")
	public void launch_the_kuls_application_and_navigate_to_application_details_view_list() throws Throwable {
		ExcelData excelData = new ExcelData("C:\\Users\\inindc00074\\Downloads\\UlsTestDataDesign1702a.xlsx",
				"Logincredentials", "Stage");
		Map<String, String> testdata = excelData.getTestdata("Maker2");
		String kulsApplicationUrl = configFileReader.getApplicationUrl();
		driver.get(kulsApplicationUrl);
		login.loginUlsApplicationAsMaker(testdata.get("Username"), testdata.get("Password"));
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, applicationentryobj.ModuleName(),10, 2);
		applicationentryobj.ModuleName().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, applicationentryobj.LOS(), 10,2);
		applicationentryobj.LOS().click();
		/*
		 * seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
		 * applicationentryobj.TransactionButtonInLeftPanel(), 60, 2);
		 * applicationentryobj.TransactionButtonInLeftPanel().click();
		 * seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
		 * applicationentryobj.ApplicationManagerInLeftPanel(), 60, 2);
		 * applicationentryobj.ApplicationManagerInLeftPanel().click();
		 * seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
		 * applicationentryobj.ApplicationDetailsViewList(), 60, 2);
		 * applicationentryobj.ApplicationDetailsViewList().click(); Thread.sleep(2000);
		 */	}

	@And("^Click on Add icon in Application details view list$")
	public void click_on_add_icon_in_application_details_view_list() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetailsAddIcon(), 60, 2);
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
				seleniumactions.getJavascriptHelper().scrollIntoView(driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.PrimaryProduct
						+ "')]/following-sibling::ion-radio")));
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
		//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.AppDataEntry_SourcingStaffField(), 60, 2);applicationentryobj.AppDataEntry_SourcingStaffField().click();
		seleniumactions.getJavascriptHelper().scrollIntoView(applicationentryobj.AppDataEntry_SourcingStaffField());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.AppDataEntry_SourcingStaffField(), 60, 2);
		applicationentryobj.AppDataEntry_SourcingStaffField().click();
		for (int i = 0; i < 50; i++) {
			try {
				
				seleniumactions.getClickAndActionsHelper().moveToElement(driver.findElement(By.xpath("//ion-label[contains(text(),'"
								+ applicationdetailsData.SourcingStaff + "')]/following-sibling::ion-radio")));
				seleniumactions.getClickAndActionsHelper().clickOnElement(driver.findElement(By.xpath("//ion-label[contains(text(),'"
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
						.scrollIntoView(applicationentryobj.ApplicationDetailsSaveIcon());
				seleniumactions.getJavascriptHelper().JSEClick(applicationentryobj.ApplicationDetailsSaveIcon());
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
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.AppDataEntry_CompanyNameField(), 60, 2);
		applicationentryobj.AppDataEntry_CompanyNameField().click();
		applicationentryobj.AppDataEntry_CompanyNameField().sendKeys(applicationdetailsData.CompanyName);
	}

	@And("^Click on Create new request button in Application details$")
	public void click_on_create_new_request_button_in_application_details() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_CreateNewRequestButton(), 60, 2);
		applicationentryobj.AppDataEntry_CreateNewRequestButton().click();
	}
	@And("^Click on the pencil icon of first record in Application details view list$")
    public void click_on_the_pencil_icon_of_first_record_in_application_details_view_list() throws Throwable {
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.apllicationDetails_PencilIconOfFirstRecord(), 60, 2);
		applicationentryobj.apllicationDetails_PencilIconOfFirstRecord().click();
    }

    @And("^Update the value in Primary sub product field of Application details$")
    public void update_the_value_in_primary_sub_product_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_PrimarySubProductField(), 60, 2);
		applicationentryobj.AppDataEntry_PrimarySubProductField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.UpdatedPrimarySubProduct
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Total finance amount requested field of Application details$")
    public void update_the_value_in_total_finance_amount_requested_field_of_application_details() throws Throwable {
    	// seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.AppDataEntry_TotalFinanceAmountRequestedField(),60,2);
    			for (int i = 0; i < 50; i++) {
    				try {
    					applicationentryobj.AppDataEntry_TotalFinanceAmountRequestedField().click();
    					applicationentryobj.AppDataEntry_TotalFinanceAmountRequestedField().clear();
    					applicationentryobj.AppDataEntry_TotalFinanceAmountRequestedField()
    							.sendKeys(testdata.get("Total Finance Amount Requested"));
    					break;

    				} catch (Exception e) {

    				}
    			}
    }

    @And("^Update the value in Declared net income field of Application details$")
    public void update_the_value_in_declared_net_income_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_DeclaredNetIncomeField(), 60, 2);
		applicationentryobj.AppDataEntry_DeclaredNetIncomeField().click();
		applicationentryobj.AppDataEntry_DeclaredNetIncomeField().clear();
		applicationentryobj.AppDataEntry_DeclaredNetIncomeField().sendKeys(testdata.get("Declared net Income"));
	}
    

    @And("^Update the value in Declared current obligations field of Application details$")
    public void update_the_value_in_declared_current_obligations_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_DeclaredCurrentObligationsField(), 60, 2);
		applicationentryobj.AppDataEntry_DeclaredCurrentObligationsField().click();
		applicationentryobj.AppDataEntry_DeclaredCurrentObligationsField().clear();
		applicationentryobj.AppDataEntry_DeclaredCurrentObligationsField()
				.sendKeys(testdata.get("Declared current obligations"));
    }

    @And("^Update the value in Special promotion of Application details$")
    public void update_the_value_in_special_promotion_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_SpecialPromotionField(), 60, 2);
		applicationentryobj.AppDataEntry_SpecialPromotionField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Special Promotion")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Sourcing channel field of Application details$")
    public void update_the_value_in_sourcing_channel_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_SourcingChannelField(), 60, 2);
		applicationentryobj.AppDataEntry_SourcingChannelField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Sourcing channel")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Business center code field of Application details$")
    public void update_the_value_in_business_center_code_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_BusinessCenterCodeField(), 60, 2);
		applicationentryobj.AppDataEntry_BusinessCenterCodeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Business center code")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Servicing branch field of Application details$")
    public void update_the_value_in_servicing_branch_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_ServicingBranchField(), 60, 2);
		applicationentryobj.AppDataEntry_ServicingBranchField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Servicing branch")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Sourcing type field of Application details$")
    public void update_the_value_in_sourcing_type_field_of_application_details() throws Throwable {
    	for (int j = 0; j <= 50; j++) {
			try {
				seleniumactions.getJavascriptHelper()
						.scrollIntoViewAndClick(applicationentryobj.AppDataEntry_SourcingTypeField());
				break;
			} catch (Exception e) {
				if (j == 50) {
					Assert.fail(e.getMessage());
				}
			}
    	}
    	//seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
			//	applicationentryobj.AppDataEntry_SourcingTypeField(), 60, 2);
		//applicationentryobj.AppDataEntry_SourcingTypeField().click();
			
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Sourcing type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		
    	}
    }

    @And("^Update the value in Sourcing office field of Application details$")
    public void update_the_value_in_sourcing_office_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_SourcingOfficeField(), 60, 2);
		applicationentryobj.AppDataEntry_SourcingOfficeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Sourcing office")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Reference type field of Application details$")
    public void update_the_value_in_reference_type_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_ReferenceTypeField(), 60, 2);
		applicationentryobj.AppDataEntry_ReferenceTypeField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Reference type")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Reference code field of Application details$")
    public void update_the_value_in_reference_code_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.AppDataEntry_ReferenceCodeField(), 60, 2);
		for (int i = 0; i < 50; i++) {
			try {
		applicationentryobj.AppDataEntry_ReferenceCodeField().click();
		applicationentryobj.AppDataEntry_ReferenceCodeField().clear();
		applicationentryobj.AppDataEntry_ReferenceCodeField().sendKeys(testdata.get("Reference code"));
		break;
			} catch (Exception e) {
			}
		}
    }
    @And("^Navigate to Mail box of Application details and search the App data entry value$")
    public void navigate_to_mail_box_of_application_details_and_search_the_app_data_entry_value() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetails_Inbox(), 30, 2);
    	applicationentryobj.ApplicationDetails_Inbox().click();
    	for (int i = 0; i <20; i++) {
    		try {
    			applicationentryobj.ApplicationDetailsInboxView_Search().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    	
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetailsInboxView_SearchText(),60,2);
        applicationentryobj.ApplicationDetailsInboxView_SearchText().click();
        applicationentryobj.ApplicationDetailsInboxView_SearchText().sendKeys(testdata.get("Search value in inbox"));

    }

    @And("^Navigate to Mail box of Application details and search the offering value$")
    public void navigate_to_mail_box_of_application_details_and_search_the_offering_value() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetails_Inbox(), 30, 2);
    	applicationentryobj.ApplicationDetails_Inbox().click();
    	for (int i = 0; i <20; i++) {
    		try {
    			applicationentryobj.ApplicationDetailsInboxView_Search().click();
    			break;
    		} catch (Exception e) {
    			
    		}
    	}
    	
        seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetailsInboxView_SearchText(),60,2);
        applicationentryobj.ApplicationDetailsInboxView_SearchText().click();
        applicationentryobj.ApplicationDetailsInboxView_SearchText().sendKeys(applicationdetailsData.SearchValueInInboxForOffering);
    }
    @And("^Click on action icon of first record of application details_Offering value$")
    public void click_on_action_icon_of_first_record_of_application_detailsoffering_value() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetailsMailBoxActionButtonOfFirstRecord_Offering(), 30, 2);
    	applicationentryobj.ApplicationDetailsMailBoxActionButtonOfFirstRecord_Offering().click();
    }

    @And("^Click on action icon of first record of application details_App data entry value$")
    public void click_on_action_icon_of_first_record_of_application_detailsapp_data_entry_value() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetailsMailBoxActionButtonOfFirstRecord_AppDataEntry(), 30, 2);
    	applicationentryobj.ApplicationDetailsMailBoxActionButtonOfFirstRecord_AppDataEntry().click();
    }
    
    @And("^Validate the Save successful popup of Application details$")
    public void validate_the_save_successful_popup_of_application_details() throws Throwable {
    	String Toast;
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver, applicationentryobj.ApplicationDetailsSaveSuccessfulPopup(), 10, 2);
		Toast = applicationentryobj.ApplicationDetailsSaveSuccessfulPopup().getText();
		System.out.println(Toast);
		
		
		Assert.assertTrue(Toast.contains("Success"));
    }
    @And("^Select Application details in the offering tab$")
    public void select_application_details_in_the_offering_tab() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetails_ApplicationDetailsTabInOfferingScreen(), 30, 2);
    	applicationentryobj.ApplicationDetails_ApplicationDetailsTabInOfferingScreen().click();
    }
    @And("^Keep the required field values as blank$")
    public void keep_the_required_field_values_as_blank() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_PrimarySubProductField(), 60, 2);
		applicationentryobj.AppDataEntry_PrimarySubProductField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + applicationdetailsData.UpdatedPrimarySubProductForValidation
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Validate the field is required popup in Application details$")
    public void validate_the_field_is_required_popup_in_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.requiredFieldWarningPopup(),60,2);
        Assert.assertEquals(applicationentryobj.requiredFieldWarningPopup().isDisplayed(), true);
    }
    @And("^Validate the fields present in the App data entry page$")
    public void validate_the_fields_present_in_the_app_data_entry_page() throws Throwable {
    	Thread.sleep(3000);
    	String xpath ="//ion-label[contains(text(),'Primary Product')]";
         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath)),60,2);
     	WebElement Primaryproduct = driver.findElement(By.xpath(xpath));
     	System.out.println(Primaryproduct);
     	 String xpath1 ="//ion-label[contains(text(),' Primary Sub Product ')]";
         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath1)),60,2);
     	WebElement primarysubproduct = driver.findElement(By.xpath(xpath1));
     	System.out.println(primarysubproduct);
     	 String xpath2 ="//span[contains(text(),' Total Finance Amount Requested ')]";
         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath2)),60,2);
     	WebElement totalfinanceamountrequired = driver.findElement(By.xpath(xpath2));
     	System.out.println(totalfinanceamountrequired);
     	String xpath3 ="//span[contains(text(),' Declared Net Income ')]";
         seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,driver.findElement(By.xpath(xpath3)),60,2);
     	WebElement declarednetincome = driver.findElement(By.xpath(xpath3));
     	System.out.println(declarednetincome);
    }

    @And("^Validate the Add button functionality$")
    public void validate_the_add_button_functionality() throws Throwable {
    	boolean status=false;
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetailsAddIcon(),10,2);
    	try
    	{
    	applicationentryobj.ApplicationDetailsAddIcon().isDisplayed();
    	}
    	catch(Exception e)
    	{
    	status=true;	                                                                                                                                                                                                              
    	}
    	Assert.assertTrue(status);
    	}

    @And("^Validate the View summary functionality in App data entry page$")
    public void validate_the_view_summary_functionality_in_app_data_entry_page() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.viewSummaryIconOfApplicationDetails(),60,2);
		seleniumactions.getJavascriptHelper().JSEClick(applicationentryobj.viewSummaryIconOfApplicationDetails());
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.viewSummaryPageOfApplicationDetails(),60,2);
		Assert.assertEquals(applicationentryobj.viewSummaryPageOfApplicationDetails().isDisplayed(), true);
    }
    @And("^Enter the value in Mobile number field of Application details$")
    public void enter_the_value_in_mobile_number_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetails_MobileNumberField(), 60, 2);
		applicationentryobj.ApplicationDetails_MobileNumberField().click();
		applicationentryobj.ApplicationDetails_MobileNumberField().sendKeys(applicationdetailsData.MobileNumber);
    }

    @And("^Enter the value in Date Of Birth field of Application details$")
    public void enter_the_value_in_date_of_birth_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetails_CalenderIcon(), 60, 2);
		applicationentryobj.ApplicationDetails_CalenderIcon().click();
		seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetails_CalenderIcon_TodayValue(), 60, 2);
		applicationentryobj.ApplicationDetails_CalenderIcon_TodayValue().click();
    }

    @And("^Enter the value in Email Id field of Application details$")
    public void enter_the_value_in_email_id_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetails_EmailIdField(), 60, 2);
		applicationentryobj.ApplicationDetails_EmailIdField().click();
		applicationentryobj.ApplicationDetails_EmailIdField().sendKeys(applicationdetailsData.EmailId);
    }

    @And("^Enter the value in Application Number$")
    public void enter_the_value_in_application_number() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetails_ApplicationNumberField(), 60, 2);
		applicationentryobj.ApplicationDetails_ApplicationNumberField().click();
		applicationentryobj.ApplicationDetails_ApplicationNumberField().sendKeys(applicationdetailsData.ApplicationNumber);
    }

    @And("^Enter the value in Customer name field of Application details$")
    public void enter_the_value_in_customer_name_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,applicationentryobj.ApplicationDetails_CustomerNameField(), 60, 2);
		applicationentryobj.ApplicationDetails_CustomerNameField().click();
		applicationentryobj.ApplicationDetails_CustomerNameField().sendKeys(applicationdetailsData.CustomerName);
    }
    @And("^Update the value in Sourcing entity field of Application details$")
    public void update_the_value_in_sourcing_entity_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_SourcingEntityField(), 60, 2);
		applicationentryobj.AppDataEntry_SourcingEntityField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Sourcing entity")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Sourcing staff field of Application details$")
    public void update_the_value_in_sourcing_staff_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_SourcingStaffField(), 60, 2);
		applicationentryobj.AppDataEntry_SourcingStaffField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Sourcing staff")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }

    @And("^Update the value in Reference entity field of Application details$")
    public void update_the_value_in_reference_entity_field_of_application_details() throws Throwable {
    	seleniumactions.getWaitHelper().waitForElementToVisibleWithFluentWait(driver,
				applicationentryobj.AppDataEntry_ReferenceEntityField(), 60, 2);
		applicationentryobj.AppDataEntry_ReferenceEntityField().click();
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + testdata.get("Reference entity")
						+ "')]/following-sibling::ion-radio")).click();
				break;
			} catch (Exception e) {
			}
		}
    }
    @And("^Update test data for Application details App data entry updation$")
    public void update_test_data_for_application_details_app_data_entry_updation() throws Throwable {
    	testdata=exceldata.getTestdata("AT-ADADE-001_D1");
    }

}
