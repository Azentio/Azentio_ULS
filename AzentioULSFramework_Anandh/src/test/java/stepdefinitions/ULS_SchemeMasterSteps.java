package stepdefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ULS_SchemeMasterObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.ULS_SchemeMasterTestDataType;

public class ULS_SchemeMasterSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	JsonConfig jsonConfig = new JsonConfig();
	KULS_Login_TestDataType KulsLoginTestDataType = jsonConfig.getKULSLoginCredentialsByName("Maker");
	ULS_SchemeMasterObj ulsSchemeMasterObj = new ULS_SchemeMasterObj(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ULS_SchemeMasterTestDataType ulSchemeMasterTestData = jsonConfig.getUlsSchemeMasterTestDataByName("Maker");
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter jsonDataReadertWriter = new JsonDataReaderWriter();
	SoftAssert softAssert = new SoftAssert();
	String filePath=System.getProperty("user.dir")+"\\Test-data\\ULSTestData.xlsx";
	Map<String,String> schemeMasterTestData= new HashMap<>();
	ExcelData excelData= new ExcelData(filePath,"SchemeMasterTestData","Data Set ID");
	@Given("^Navigate to ULS application URL$")
	public void navigate_to_uls_application_url() throws Throwable {
		driver.get(configFileReader.getULSApplicationCenBankUrl());
	}

	@Then("^login with valid maker credentials$")
	public void login_with_valid_maker_credentials() throws Throwable {
		Map<String,String> loginTestData= new HashMap<>();
		System.out.println("File path "+filePath);
		ExcelData ExcelDataForMakerLogin= new ExcelData(filePath,"LoginCredentials","Stage");
		loginTestData=ExcelDataForMakerLogin.getTestdata("Maker1");
		kulsLogin.loginUlsApplicationAsMaker(loginTestData.get("Username"),loginTestData.get("Password"));
	}
	@And("^get the test data of first test case$")
    public void get_the_test_data_of_first_test_case() throws Throwable {
		schemeMasterTestData=excelData.getTestdata("AT-SM-T001_D1");
    }

//	@And("^click on configuration manager$")
//	public void click_on_configuration_manager() throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterConfigManagerMainMenu(),
//				10, 5);
//		ulsSchemeMasterObj.schemeMasterConfigManagerMainMenu().click();
//	}

	@Then("^choose scheme master view button$")
	public void choose_scheme_master_view_button() throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.ulsSchemeAMasterViewIcon(), 10, 5);
		for(int i=0;i<=30;i++)
		{
			try
			{
		javascriptHelper.scrollIntoViewAndClick(ulsSchemeMasterObj.ulsSchemeAMasterViewIcon());
		break;
			}
			catch(Exception e)
			{
				if(i==30)
				{
					Assert.fail(e.getMessage());
				}
			}
			}
	}

	@And("^click on config Manager main module$")
	public void click_on_config_Manager_main_module() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.ULSConfigmanagerMainMenu(), 10,
				5);
		ulsSchemeMasterObj.ULSConfigmanagerMainMenu().click();
	}

	@And("^click on add button to create the scheme master record$")
	public void click_on_add_button_to_create_the_scheme_master_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterAddButton(), 10, 1);
		ulsSchemeMasterObj.schemeMasterAddButton().click();
	}

	@Then("^verify back and save buttons are visible$")
	public void verify_back_and_save_buttons_are_visible() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterBackButton(), 10, 5);

		Assert.assertTrue(ulsSchemeMasterObj.schemeMasterBackButton().isDisplayed());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterSaveButton(), 10, 5);
		Assert.assertTrue(ulsSchemeMasterObj.schemeMasterSaveButton().isDisplayed());
	}

	@And("^verify description field should be mendatory and user can able to pass the data in it for checker return$")
	public void verify_description_field_should_be_mendatory_and_user_can_able_to_pass_the_data_in_it_for_checker_return()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterDescriptionMendatoryField(), 10, 3);
		Assert.assertEquals(ulsSchemeMasterObj.schemeMasterDescriptionMendatoryField().getText(), "*");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterDescriptionTextBox(),
				10, 3);
		ulsSchemeMasterObj.schemeMasterDescriptionTextBox().click();
		ulsSchemeMasterObj.schemeMasterDescriptionTextBox()
				.sendKeys(ulSchemeMasterTestData.UlsDescriptionForCheckerReturn);
	}

	@And("^verify product type should be mendatory field and user can able to choose the product type for checker return$")
	public void verify_product_type_should_be_mendatory_field_and_user_can_able_to_choose_the_product_type_for_checker_return()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterProductTypeDropDown(),
				10, 3);
		String productTypeDropDown = ulsSchemeMasterObj.schemeMasterProductTypeDropDown().getAttribute("aria-label");
		Assert.assertTrue(productTypeDropDown.contains("*"));
		ulsSchemeMasterObj.schemeMasterProductTypeDropDown().click();
		// ulsSchemeMasterObj.schemeMasterProductTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + ulSchemeMasterTestData.UlsProductTypeForCheckerReturn
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				// javascriptHelper.scrollIntoViewAndClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^verify product sub type should be mendatory field and user can able to choose the product sub type dropdown for checker return$")
	public void verify_product_sub_type_should_be_mendatory_field_and_user_can_able_to_choose_the_product_sub_type_dropdown_for_checker_return()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemematserSubProducTypeDropDown(),
				3, 1);
		String subProductType = ulsSchemeMasterObj.schemematserSubProducTypeDropDown().getAttribute("aria-label");
		Assert.assertTrue(subProductType.contains("*"));
		ulsSchemeMasterObj.schemematserSubProducTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + ulSchemeMasterTestData.UlsSubProductTypeForCheckerReturn
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

	@And("^verify description field should be mendatory and user can able to pass the data in it$")
	public void verify_description_field_should_be_mendatory_and_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterDescriptionMendatoryField(), 10, 3);
		Assert.assertEquals(ulsSchemeMasterObj.schemeMasterDescriptionMendatoryField().getText(), "*");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterDescriptionTextBox(),
				10, 3);
		ulsSchemeMasterObj.schemeMasterDescriptionTextBox().click();
		ulsSchemeMasterObj.schemeMasterDescriptionTextBox().sendKeys(schemeMasterTestData.get("Description"));
	}

	@And("^verify product type should be non mendatory field and user can able to choose the product type$")
	public void verify_product_type_should_be_non_mendatory_field_and_user_can_able_to_choose_the_product_type()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterProductTypeDropDown(),
				10, 3);
		String productTypeDropDown = ulsSchemeMasterObj.schemeMasterProductTypeDropDown().getAttribute("aria-label");
		softAssert.assertFalse(productTypeDropDown.contains("*")," Product TYpe Field is Mandatory field");
		ulsSchemeMasterObj.schemeMasterProductTypeDropDown().click();
		// ulsSchemeMasterObj.schemeMasterProductTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("ProductType")
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				// javascriptHelper.scrollIntoViewAndClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^verify product sub type should be mendatory field and user can able to choose the product sub type dropdown$")
	public void verify_product_sub_type_should_be_mendatory_field_and_user_can_able_to_choose_the_product_sub_type_dropdown()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemematserSubProducTypeDropDown(),
				3, 1);
		String subProductType = ulsSchemeMasterObj.schemematserSubProducTypeDropDown().getAttribute("aria-label");
		softAssert.assertTrue(subProductType.contains("*")," Product sub type field is non mandatory field");
		ulsSchemeMasterObj.schemematserSubProducTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("SubProductType")
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

	@And("^verify description field should be mendatory and user can able to pass the data in it for checker reject$")
	public void verify_description_field_should_be_mendatory_and_user_can_able_to_pass_the_data_in_it_for_checker_reject()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterDescriptionMendatoryField(), 10, 3);
		softAssert.assertEquals(ulsSchemeMasterObj.schemeMasterDescriptionMendatoryField().getText(), "*"," Description field is non mandatory field");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterDescriptionTextBox(),
				10, 3);
		ulsSchemeMasterObj.schemeMasterDescriptionTextBox().click();
		ulsSchemeMasterObj.schemeMasterDescriptionTextBox()
				.sendKeys(schemeMasterTestData.get("Description"));
	}

	@And("^verify product type should be mendatory field and user can able to choose the product type for checker reject$")
	public void verify_product_type_should_be_mendatory_field_and_user_can_able_to_choose_the_product_type_for_checker_reject()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterProductTypeDropDown(),
				10, 3);
		String productTypeDropDown = ulsSchemeMasterObj.schemeMasterProductTypeDropDown().getAttribute("aria-label");
		softAssert.assertTrue(productTypeDropDown.contains("*")," Product Type field is a mandatory field ");
		ulsSchemeMasterObj.schemeMasterProductTypeDropDown().click();
		// ulsSchemeMasterObj.schemeMasterProductTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("ProductType")
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 15; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				// javascriptHelper.scrollIntoViewAndClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^verify product sub type should be mendatory field and user can able to choose the product sub type dropdown for checker reject$")
	public void verify_product_sub_type_should_be_mendatory_field_and_user_can_able_to_choose_the_product_sub_type_dropdown_for_checker_reject()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemematserSubProducTypeDropDown(),
				3, 1);
		String subProductType = ulsSchemeMasterObj.schemematserSubProducTypeDropDown().getAttribute("aria-label");
		softAssert.assertTrue(subProductType.contains("*"));
		ulsSchemeMasterObj.schemematserSubProducTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("SubProductType")
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

	@And("^verify loan currency drop down should be mendatory and user can able to select the data from the drop down$")
	public void verify_loan_currency_drop_down_shoudl_be_mendatory_and_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterLoanCurrencyDropDwon(),
				5, 1);
		String loanCurrency = ulsSchemeMasterObj.schemeMasterLoanCurrencyDropDwon().getAttribute("aria-label");
		softAssert.assertTrue(loanCurrency.contains("*")," Loan Currency field is non mandatory field ");
		ulsSchemeMasterObj.schemeMasterLoanCurrencyDropDwon().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("LoanCurrency") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify Indexation Currency field should be non mendatory and user can able to select the drop down$")
	public void verify_indexation_currency_field_should_be_non_mendatory_and_user_can_able_to_select_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterIndexationCurrencyDropDwon(), 5, 1);
		String indexationCurrency = ulsSchemeMasterObj.schemeMasterIndexationCurrencyDropDwon()
				.getAttribute("aria-label");
		softAssert.assertFalse(indexationCurrency.contains("*")," Indexation currency field is  a mandatory field ");
		ulsSchemeMasterObj.schemeMasterIndexationCurrencyDropDwon().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("IndexationCurrency")
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

	@And("^verify valid from calendar field field should be mendatory and user can able to slecet the date$")
	public void verify_valid_from_calendar_field_field_should_be_mendatory_and_user_can_able_to_slecet_the_date()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterValidFromDate(), 5, 1);
		ulsSchemeMasterObj.schemeMasterValidFromDate().click();
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterMonthField(), 3, 1);
//		ulsSchemeMasterObj.schemeMasterMonthField().click();
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterTodayDate(), 5, 1);
		ulsSchemeMasterObj.schemeMasterTodayDate().click();
	}

	@And("^verify valid to date calendar field should be mendatory and user can able to slecet the to date$")
	public void verify_valid_to_date_calendar_field_should_be_mendatory_and_user_can_able_to_slecet_the_to_date()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterValidToDate(), 5, 1);
		ulsSchemeMasterObj.schemeMasterValidToDate().click();

		String yearXpath = "//span[text()=' " + schemeMasterTestData.get("validFromYear") + " ']";
		String monthXpath = "//span[text()=' " + schemeMasterTestData.get("validFromMonth") + " ']";
		String dayXpath = "//span[text()='" + schemeMasterTestData.get("ValidFromDay") + "']";
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterMonthField(), 3, 1);
//		ulsSchemeMasterObj.schemeMasterMonthField().click();
//		
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterYearField(), 3, 1);
		ulsSchemeMasterObj.schemeMasterYearField().click();
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// driver.findElement(By.xpath(yearXpath)), 3, 1);
		for (int i = 0; i <= 10; i++) {
			try {
				driver.findElement(By.xpath(yearXpath)).click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		driver.findElement(By.xpath(monthXpath)).click();
		List<WebElement> findElements = driver.findElements(By.xpath(dayXpath));
		for (WebElement element : findElements) {
			try {
				element.click();
				break;
			} catch (Exception e) {

			}
		}

	}

	@And("^verify min finance amount text box field should me mendatory and user can able to pass the data in it$")
	public void verify_min_finance_amount_text_box_field_should_me_mendatory_and_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver,
//				ulsSchemeMasterObj.schemeMasterMinFinanceAmountMendatoryField(), 3, 1);
		boolean status=false;
		try
		{
		javascriptHelper.scrollIntoView(ulsSchemeMasterObj.schemeMasterMinFinanceAmountMendatoryField());
		ulsSchemeMasterObj.schemeMasterMinFinanceAmountMendatoryField().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," Min Finance amount field is non mandatory field ");
		ulsSchemeMasterObj.schemeMasterMinFinanceAmount().click();
		ulsSchemeMasterObj.schemeMasterMinFinanceAmount().sendKeys(schemeMasterTestData.get("MinFinanceAmount"));
	}

	@And("^verify max finance amount text box field should be mendatory and user can able to pass the data in it$")
	public void verify_max_finance_amount_text_box_field_should_be_mendatory_and_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		boolean status=true;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterMaxFinanceAmountMendatoryField(), 3, 1);
		ulsSchemeMasterObj.schemeMasterMaxFinanceAmountMendatoryField().getText();
		}
		catch(Exception e)
		{
			status=false;
		}
		softAssert.assertTrue(status," Max Finance amount field is non mandatory in application screen " );
		ulsSchemeMasterObj.schemeMasterMaxFinanceAmount().click();
		ulsSchemeMasterObj.schemeMasterMaxFinanceAmount().sendKeys(schemeMasterTestData.get("MaxFinanceAmount"));
	}

	@And("^verify Min Tenor In months text box field should be mendatory user can able to pass the data in it$")
	public void verify_min_tenor_in_months_text_box_field_should_be_mendatory_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterMinTenorInMonthsMendatoryField(), 3, 1);
		String tenorMonthMendField = ulsSchemeMasterObj.schemeMasterMinTenorInMonthsMendatoryField().getText();
		softAssert.assertEquals(tenorMonthMendField, "*"," Min Tenor In Months Field is non mandatory field ");
		ulsSchemeMasterObj.schemeMasterMinTenorInMonths().click();
		ulsSchemeMasterObj.schemeMasterMinTenorInMonths().sendKeys(schemeMasterTestData.get("MinTenorInMonth"));
	}

	@And("^verify Max Tenor In months Text box field should be mendatory user can able to pass the data in it$")
	public void verify_max_tenor_in_months_text_box_field_should_be_mendatory_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterMaxTenorInMonthsMendatoryField(), 3, 1);
		String maxtenorMonthMendField = ulsSchemeMasterObj.schemeMasterMaxTenorInMonthsMendatoryField().getText();
		softAssert.assertEquals(maxtenorMonthMendField, "*"," Max Tenor field is non mandatory field ");
		
		ulsSchemeMasterObj.schemeMasterMaxTenorInMonths().click();
		ulsSchemeMasterObj.schemeMasterMaxTenorInMonths().sendKeys(schemeMasterTestData.get("MaxTenorInMonth"));
	}

	@And("^Verify Repayment Type field should be mendatory user can able to choose the data$")
	public void verify_repayment_type_field_should_be_mendatory_user_can_able_to_choose_the_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterRepaymentType(), 5, 1);
		String repaymentTypeMendatoryField = ulsSchemeMasterObj.schemeMasterRepaymentType().getAttribute("aria-label");
		softAssert.assertTrue(repaymentTypeMendatoryField.contains("*")," Repayment Type field is non mandatory field ");
		ulsSchemeMasterObj.schemeMasterRepaymentType().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("RepaymentType")
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

	@And("^verify flat reducing drop down field should be mendatory user can able to slecet the data$")
	public void verify_flat_reducing_drop_down_field_should_be_mendatory_user_can_able_to_slecet_the_data()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterFlatReducing(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterFlatReducing().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," Flat reducing is non mandatiry field ");
		ulsSchemeMasterObj.schemeMasterFlatReducing().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("FlatReducing") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify int Amortization method field should be non mendatory and user can able to select the data$")
	public void verify_int_amortization_method_field_should_be_non_mendatory_and_user_can_able_to_select_the_data()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMaster_AmortizationMethod(),
				5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMaster_AmortizationMethod().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," int Amortization field is mandatory field ");
		ulsSchemeMasterObj.schemeMaster_AmortizationMethod().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("IntAmortizationMethod")
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

	@And("^verify compute installment on field should be mendatory and user can able to slecet the data from the dropdown$")
	public void verify_compute_installment_on_field_should_be_mendatory_and_user_can_able_to_slecet_the_data_from_the_dropdown()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMaster_ComputeInstallmentOn(),
				5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMaster_ComputeInstallmentOn().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," Compute Installment field is non mandatory field ");
		ulsSchemeMasterObj.schemeMaster_ComputeInstallmentOn().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("ComputeInstallmentOn")
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

	@And("^verify inst due method field should be mendatory user can able to slect the data in drop down$")
	public void verify_inst_due_method_field_should_be_mendatory_user_can_able_to_slect_the_data_in_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterInstDuedateMethod(), 5,
				1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterInstDuedateMethod().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*"),"  inst due method field is non mandatory field ");
		ulsSchemeMasterObj.schemeMasterInstDuedateMethod().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("InstDueDateMethod")
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

	@And("^verify verify LPC grace period field should be non mendatory and user can able to fill the data in it$")
	public void verify_verify_lpc_grace_period_field_should_be_non_mendatory_and_user_can_able_to_fill_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterLPCGracePeriodMendatoryField(), 3, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterLPCGracePeriodMendatoryField().getText();
		softAssert.assertNotEquals(mendatoryField, "*"," LPC Grace Period field is Mandatory field");
		ulsSchemeMasterObj.schemeMasterLPCGracePeriodTestBox().click();
		ulsSchemeMasterObj.schemeMasterLPCGracePeriodTestBox().sendKeys(schemeMasterTestData.get("LPCGracePeriod"));

	}

	@And("^verify principal Repayment Frequency field should be mendatory user can able to select the data from the drop down$")
	public void verify_principal_repayment_frequency_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterPrincipalRepaymentFrequency(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterPrincipalRepaymentFrequency().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," principal Repayment field is non mandatory field");
		ulsSchemeMasterObj.schemeMasterPrincipalRepaymentFrequency().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("PrincipalRepaymentFrom")
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

	@And("^verify intereset repayment frequency field should be non mendatory user can able to select the data from drop down$")
	public void verify_intereset_repayment_frequency_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterInterestRepaymentFrequencyDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterInterestRepaymentFrequencyDropDown()
				.getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," Interest Repayment Field frequency field is mandatory field ");
		ulsSchemeMasterObj.schemeMasterInterestRepaymentFrequencyDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("InterestRepaymentFrequency")
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

	@And("^verify inst rounding logic field should be mendatory and user can able pass the data in it$")
	public void verify_inst_rounding_logic_field_should_be_mendatory_and_user_can_able_pass_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterInstRoundingLogicMendatoryField(), 3, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterInstRoundingLogicMendatoryField().getText();
		softAssert.assertEquals(mendatoryField, "*"," inc rounding logic field is non mandatory field ");
		ulsSchemeMasterObj.schemeMasterInstRoundingLogicTextbox().click();
		ulsSchemeMasterObj.schemeMasterInstRoundingLogicTextbox().sendKeys(schemeMasterTestData.get("INSTRoundingLogic"));
	}

	@And("^verify Loan Eligibility Calc field should be mendatory and user can able to select the data from the drop down$")
	public void verify_loan_eligibility_calc_field_should_be_mendatory_and_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterLoanEligibilityCalcDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterLoanEligibilityCalcDropDown().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," Loan Eligibility Calc field is non mandatory field ");
		ulsSchemeMasterObj.schemeMasterLoanEligibilityCalcDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("LoanEligibilityCalc")
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

	@And("^verify Reamrk field should be non mendatory user can able to enter the reamrk in it$")
	public void verify_reamrk_field_should_be_non_mendatory_user_can_able_to_enter_the_reamrk_in_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterRemarksMendatoryField(),
				3, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterRemarksMendatoryField().getText();
		softAssert.assertNotEquals(mendatoryField, "*"," Remarks Field is mandatory in application screen");
		ulsSchemeMasterObj.schemeMasterRemarks().click();
		ulsSchemeMasterObj.schemeMasterRemarks().sendKeys(schemeMasterTestData.get("Remarks"));
	}

	@And("^verify include co applicant INC field should be mendatory user can able to select the data from the drop down$")
	public void verify_include_co_applicant_inc_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterIncludeCoApplicantDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterIncludeCoApplicantDropDown().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," co Applicant INC is non mandatory field in application screen");
		ulsSchemeMasterObj.schemeMasterIncludeCoApplicantDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("IncludeCoApplicantINC")
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

	@And("^verify include GuarantorInc field should be mendatory and user can able to select the data from drop down$")
	public void verify_include_guarantorinc_field_should_be_mendatory_and_user_can_able_to_select_the_data_from_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMaster_IncludeGuarantorDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMaster_IncludeGuarantorDropDown().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," Include Guarantor INC field is non mandatory in application screen");
		ulsSchemeMasterObj.schemeMaster_IncludeGuarantorDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("IncludeGuarentorINC")
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

	@And("^verify due period required field should be mendatory and user can able to select the data from drop down$")
	public void verify_due_period_required_field_should_be_mendatory_and_user_can_able_to_select_the_data_from_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterDuePeriodRequiredDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterDuePeriodRequiredDropDown().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," Due Period Required field is non mandatory field in application screen");
		ulsSchemeMasterObj.schemeMasterDuePeriodRequiredDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("DuePeriodRequired")
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

	@And("^verify max co applicans field should be non mendatory and user can able to pass the data in it$")
	public void verify_max_co_applicans_field_should_be_mendatory_and_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Scheme_MaxCoapplicantsAstricks(), 3,
				1);
		String mendatoryField = ulsSchemeMasterObj.Scheme_MaxCoapplicantsAstricks().getText();
		softAssert.assertNotEquals(mendatoryField, "*"," Max co applicant field is mandatory field in application screen");
		ulsSchemeMasterObj.schemeMasterMaxCoapplicantsTextBox().click();
		ulsSchemeMasterObj.schemeMasterMaxCoapplicantsTextBox().sendKeys(schemeMasterTestData.get("MaxCoApplicants"));
	}

	@And("^verify max guarantors field should be non mendatory user can able pass the data in it$")
	public void verify_max_guarantors_field_should_be_non_mendatory_user_can_able_pass_the_data_in_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Scheme_MaxGuarantorsAstricks(), 3,
				1);
		String mendatoryField = ulsSchemeMasterObj.Scheme_MaxGuarantorsAstricks().getText();
		softAssert.assertEquals(mendatoryField, "*"," max Gurantor field is mandatory field in applicantion screen");
		ulsSchemeMasterObj.schemeMasterMaxGuarantorsTextBox().click();
		ulsSchemeMasterObj.schemeMasterMaxGuarantorsTextBox().sendKeys(schemeMasterTestData.get("MaxGuarentor"));
	}

	@And("^verify inst commence field should be mendatory user can able to slecet the data from the drop down$")
	public void verify_inst_commence_field_should_be_mendatory_user_can_able_to_slecet_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterInstCommenceDropDown(),
				5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterInstCommenceDropDown().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," inst Commence is non mandatory field");
		ulsSchemeMasterObj.schemeMasterInstCommenceDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("InstCommenceFrom")
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

	@And("^verify days in year field should be mendatory user can able to select the data from dropdown$")
	public void verify_days_in_year_field_should_be_mendatory_user_can_able_to_select_the_data_from_dropdown()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterDaysInYearDropDown(), 5,
				1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterDaysInYearDropDown().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," days in year field is non mandatory field");
		ulsSchemeMasterObj.schemeMasterDaysInYearDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("DaysInYear") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify multiple disburs tranch allowed field should be mendatory and user can able to slecet the data from the dropdown$")
	public void verify_multiple_disburs_tranch_allowed_field_should_be_mendatory_and_user_can_able_to_slecet_the_data_from_the_dropdown()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterMultipleDisBursTranchAllowdDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterMultipleDisBursTranchAllowdDropDown()
				.getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," multiple disburs tranch allowed field is non mandatory field ");
		ulsSchemeMasterObj.schemeMasterMultipleDisBursTranchAllowdDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("MultipleDisburs")
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

	@And("^verify incluse income Dedu dept field should be non mendatory and user can able to select the data from dropdown$")
	public void verify_incluse_income_dedu_dept_field_should_be_non_mendatory_and_user_can_able_to_select_the_data_from_dropdown()
			throws Throwable {
		javascriptHelper.scrollIntoView(ulsSchemeMasterObj.schemeMasterIncludeIncomeDeptDropDown());

		String mendatoryField = ulsSchemeMasterObj.schemeMasterIncludeIncomeDeptDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Include income dedu dept field is mandatory field ");
		ulsSchemeMasterObj.schemeMasterIncludeIncomeDeptDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("IncludeIncomeDedu")
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

	@And("^verify Round off field should be non mendatory user can able to select the data from the drop down$")
	public void verify_round_off_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterRoundOffDropDown(), 5,
				1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterRoundOffDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Round Off field is mandatory field in application screen ");
		ulsSchemeMasterObj.schemeMasterRoundOffDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("RoundOff") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify round off value field should be non mendatory user can able to pass the data in the text box$")
	public void verify_round_off_value_field_should_be_non_mendatory_user_can_able_to_pass_the_data_in_the_text_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Scheme_RoundOffValueAstricks(), 3,
				1);
		String mendatoryField = ulsSchemeMasterObj.Scheme_RoundOffValueAstricks().getText();
		softAssert.assertNotEquals(mendatoryField, "*","  Round off value field is mandatory field in application screen");
		ulsSchemeMasterObj.schemeMasterRoundOffValueTextBox().click();
		ulsSchemeMasterObj.schemeMasterRoundOffValueTextBox().sendKeys(schemeMasterTestData.get("RoundOffValue"));
	}

	@And("^verfy offer validity field should be non mendatory user can able to pass the data in the text box$")
	public void verfy_offer_validity_field_should_be_non_mendatory_user_can_able_to_pass_the_data_in_the_text_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Scheme_OfferValidityAstricks(), 3,
				1);
		String mendatoryField = ulsSchemeMasterObj.Scheme_OfferValidityAstricks().getText();
		softAssert.assertNotEquals(mendatoryField, "*"," offer Validity field is mandatory field");
		ulsSchemeMasterObj.schemeOfferValidityDays().click();
		ulsSchemeMasterObj.schemeOfferValidityDays().sendKeys(schemeMasterTestData.get("OfferValidity"));

	}

	@And("^verify appropriation code field should be mendatory user can able to slecet the data from the drop down$")
	public void verify_appropriation_code_field_should_be_mendatory_user_can_able_to_slecet_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterAppropriationCode(), 5,
				1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterAppropriationCode().getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," Appropriation field is non mandatory field");
		ulsSchemeMasterObj.schemeMasterAppropriationCode().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("AppropriationCode")
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

	@And("^verify baloon allowed field should be non mendatory user can able to select the data from drop down$")
	public void verify_baloon_allowed_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterBaloonAllowedDropDown(),
				5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterBaloonAllowedDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Baloon allowed field is mandatory field ");
		ulsSchemeMasterObj.schemeMasterBaloonAllowedDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("BallonAllowed")
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

	@And("^verify maximum Baloon percentage field should be mendatory user can able to pass the data in it$")
	public void verify_maximum_baloon_percentage_field_should_be_mendatory_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.Scheme_MaximumBallonPercentageAstricks(), 3, 1);
		String mendatoryField = ulsSchemeMasterObj.Scheme_MaximumBallonPercentageAstricks().getText();
		softAssert.assertNotEquals(mendatoryField, "*"," Maximum Baloon percentage field s mandatory field");
		ulsSchemeMasterObj.schemeMasterMaximumBalloonPercentageTextBox().click();
		ulsSchemeMasterObj.schemeMasterMaximumBalloonPercentageTextBox()
				.sendKeys(schemeMasterTestData.get("MaximumBallonPercentage"));
	}

	@And("^verify min IRR field should be non mendatory user can able to pass the dta in it$")
	public void verify_min_irr_field_should_be_non_mendatory_user_can_able_to_pass_the_dta_in_it() throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Scheme_MinIRRAstricks(), 3, 1);
		ulsSchemeMasterObj.Scheme_MinIRRAstricks().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," min IRR field is a mandatory field ");
		ulsSchemeMasterObj.schemeMasterMinIRRTextBox().click();
		ulsSchemeMasterObj.schemeMasterMinIRRTextBox().sendKeys(schemeMasterTestData.get("MinIRR"));
	}

	@And("^verify Max Irr field should be non mendatory and user can able to pass the data in it$")
	public void verify_max_irr_field_should_be_non_mendatory_and_user_can_able_to_pass_the_data_in_it() throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Scheme_MaxIRRAstricks(), 3, 1);
		ulsSchemeMasterObj.Scheme_MaxIRRAstricks().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," Max Irr field is a mandatoyr field ");
		ulsSchemeMasterObj.schemeMasterMaxIRRTextBox().click();
		ulsSchemeMasterObj.schemeMasterMaxIRRTextBox().sendKeys(schemeMasterTestData.get("MaxIRR"));
	}

	@And("^verify pre owned asset should be non mendatory user can able to select the data from the drop down$")
	public void verify_pre_owned_asset_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterPreOwnedAssetDropdown(),
				5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterPreOwnedAssetDropdown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Pre Owned Asset field is mandatory field ");
		ulsSchemeMasterObj.schemeMasterPreOwnedAssetDropdown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("PreOwnedAsset")
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

	@And("^verify Day count for Bpi field should be non mendatory and user can able to select the data from drop down$")
	public void verify_day_count_for_bpi_field_should_be_non_mendatory_and_user_can_able_to_select_the_data_from_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterDayCountConventionForBPIDropdown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterDayCountConventionForBPIDropdown()
				.getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Day Count for BPI field is mandatory field ");
		ulsSchemeMasterObj.schemeMasterDayCountConventionForBPIDropdown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("DayCountConventionFrom")
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

	@And("^verify discount factor Rounding field should be non mendatory and user can able to pass the data in it$")
	public void verify_discount_factor_rounding_field_should_be_non_mendatory_and_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.Scheme_DiscountingFactorRoundingAstricks(), 3, 1);
		ulsSchemeMasterObj.Scheme_DiscountingFactorRoundingAstricks().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," discount Factor Rounding is a mandatory field ");
		ulsSchemeMasterObj.schemeMasterDiscountFactorRoundingTextBox().click();
		ulsSchemeMasterObj.schemeMasterDiscountFactorRoundingTextBox()
				.sendKeys(schemeMasterTestData.get("DiscountingFactor"));
	}

//	@And("^verify discount factor Rounding field should be mendatory and user can able to select the data from the drop down$")
//	public void verify_discount_factor_rounding_field_should_be_mendatory_and_user_can_able_to_select_the_data_from_the_drop_down()
//			throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterDiscountFactorRoundingTextBox(), 5,
//				1);
//		String mendatoryField = ulsSchemeMasterObj.schemeMasterDayCountConventionForBPIDropdown().getAttribute("aria-label");
//		Assert.assertTrue(mendatoryField.contains("*"));
//		ulsSchemeMasterObj.schemeMasterDayCountConventionForBPIDropdown().click();
//		String xpath = "//ion-label[text()=' " + ulSchemeMasterTestData.UlsProductType
//				+ " ']/parent::ion-item/ion-radio";
//		for (int i = 0; i <= 15; i++) {
//			try {
//				javascriptHelper.scrollIntoViewAndClick(driver.findElement(By.xpath(xpath)));
//				break;
//			} catch (Exception e) {
//				if (i == 15) {
//					Assert.fail(e.getMessage());
//				}
//			}
//		}
//	}

	@And("^verify interest charging starts from field should be non mendatory user can able to select the data from the drop down$")
	public void verify_interest_charging_starts_from_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterInterestChargingStartFromDropDown(), 5,
//				1);
		javascriptHelper.scrollIntoView(ulsSchemeMasterObj.schemeMasterInterestChargingStartFromDropDown());
		String mendatoryField = ulsSchemeMasterObj.schemeMasterInterestChargingStartFromDropDown()
				.getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Interest Charging starts from field is mandatoyr field ");
		ulsSchemeMasterObj.schemeMasterInterestChargingStartFromDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("InterestChargingstarts")
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

	@And("^verify MI Recovery field should be non mendatory user can able to select the data from the dropdown$")
	public void verify_mi_recovery_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_dropdown()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterMIRecoveryDropDown(), 5,
				1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterMIRecoveryDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," MI Recovery field is mandatoyr field in application screen ");
		ulsSchemeMasterObj.schemeMasterMIRecoveryDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("MIRecovery") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify BPI Recovery field should be non mendatory user can able to select the data from the drop down$")
	public void verify_bpi_recovery_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterBPIRecoveryDropDown(),
				5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterBPIRecoveryDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," BPI Recovery field is mandatory field in application screen");
		ulsSchemeMasterObj.schemeMasterBPIRecoveryDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("BPIRecovery") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify installment recovery type field should be non mendatiry user can able to select the data from the drop down$")
	public void verify_installment_recovery_type_field_should_be_non_mendatiry_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterInstallmentRecoveryTypeDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterInstallmentRecoveryTypeDropDown()
				.getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Installment Recovery type field is mandatory field ");
		ulsSchemeMasterObj.schemeMasterInstallmentRecoveryTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("InstallmentRecoveryType")
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

	@And("^verify rate type field should be non mendatory user can able to select the dta from drop down$")
	public void verify_rate_type_field_should_be_non_mendatory_user_can_able_to_select_the_dta_from_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterRateTypeDropDown(), 5,
				1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterRateTypeDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Rate Type field is mandatory field in application screen ");
		ulsSchemeMasterObj.schemeMasterRateTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("RateType") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify initiate disc factory field should be non mendatory user can able to select the data from drop down$")
	public void verify_initiate_disc_factory_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterInitiateDiscFactorDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterInitiateDiscFactorDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Initiate Disc Factor is mandatory field in application screen ");
		ulsSchemeMasterObj.schemeMasterInitiateDiscFactorDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("InitiateDIscFactor")
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

	@And("^verify resch lockin text box should not be mendatory user can able to pass the data in text box$")
	public void verify_resch_lockin_text_box_should_not_be_mendatory_user_can_able_to_pass_the_data_in_text_box()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Reschedulement_MaxReschInAYearAstrick(), 10, 1);
		ulsSchemeMasterObj.Reschedulement_MaxReschInAYearAstrick().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," resch Lockin field is mandatoory in application screen ");
		ulsSchemeMasterObj.schemeMasterReschLockinTextBox().click();
		ulsSchemeMasterObj.schemeMasterReschLockinTextBox().sendKeys(schemeMasterTestData.get("ReschLockIn"));
	}

	@And("^verify Max Resch In a year text box should be non mendatory user can able to pass the data in it$")
	public void verify_max_resch_in_a_year_text_box_should_be_non_mendatory_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.Reschedulement_MaxReschInAYearAstrick(), 3, 1);
		ulsSchemeMasterObj.Reschedulement_MaxReschInAYearAstrick().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," Max Resch In Year field is mandatory field");
		ulsSchemeMasterObj.schemeMasterMaxReschLockinTextBox().click();
		ulsSchemeMasterObj.schemeMasterMaxReschLockinTextBox().sendKeys(schemeMasterTestData.get("MaxReschInAYear"));

	}

	@And("^verify total resch Allowed text box should be non mendatory user can able to pass the data in it$")
	public void verify_total_resch_allowed_text_box_should_be_non_mendatory_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Reschedulement_TotalReschAllowed(),
				3, 1);
		ulsSchemeMasterObj.Reschedulement_TotalReschAllowed().getText();
		}
		catch(Exception e)
		{
		status=true;	
		}
		softAssert.assertTrue(status," Total Resch allowed field is mandatory ");
		ulsSchemeMasterObj.schemeMasterTotalReschAllowedTextBox().click();
		ulsSchemeMasterObj.schemeMasterTotalReschAllowedTextBox().sendKeys(schemeMasterTestData.get("TotaleschAllowed"));

	}

	@And("^verify Reschedulement Lock in starts field should be non mendatory user can able to slect the data from the drop down$")
	public void verify_reschedulement_lock_in_starts_field_should_be_non_mendatory_user_can_able_to_slect_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterRechedulementLockinStartsFromDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterRechedulementLockinStartsFromDropDown()
				.getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Reschedulement lock in starts field is mandatoyr field");
		ulsSchemeMasterObj.schemeMasterRechedulementLockinStartsFromDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("ReschedulementLockinstartsfrom")
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

	@And("^verify bulk payment field should be mendatory user can able to select the data from the drop down$")
	public void verify_bulk_payment_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterBulkPaymentDropDown(),
				5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterBulkPaymentDropDown().getAttribute("aria-label");
		Assert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeMasterBulkPaymentDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("BulkPayment") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify No of Bulk payment in Year field should be non mendatory user can able to pass the data$")
	public void verify_no_of_bulk_payment_in_year_field_should_be_non_mendatory_user_can_able_to_pass_the_data()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.BulkPayment_NoOfBulkPaymentInAYearAstrick(), 3, 1);
		ulsSchemeMasterObj.BulkPayment_NoOfBulkPaymentInAYearAstrick().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," No Of bulk payment is mandatory field in application screen");
		ulsSchemeMasterObj.schemeMasterNoOfBulkPaymentInAYearTextBox().click();
		ulsSchemeMasterObj.schemeMasterNoOfBulkPaymentInAYearTextBox()
				.sendKeys(schemeMasterTestData.get("NoOfBulkPaymentInYear"));
	}

	@And("^verify bulk payment Lockin Period field should be non mendatory user can able to pass the data in it$")
	public void verify_bulk_payment_lockin_period_field_should_be_non_mendatory_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.BulkPayment_BulkPaymentLockInperiod(), 3, 1);
		String mendatoryField = ulsSchemeMasterObj.BulkPayment_BulkPaymentLockInperiod().getText();
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeMasterBulkPaymentLockInPeriodTextBox().click();
		ulsSchemeMasterObj.schemeMasterBulkPaymentLockInPeriodTextBox()
				.sendKeys(schemeMasterTestData.get("BulkPaymentInLockInPeriod"));
	}

	@And("^verify bulk payment time interval field should be non mendatory user can able to enter the data$")
	public void verify_bulk_payment_time_interval_field_should_be_non_mendatory_user_can_able_to_enter_the_data()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.BulkPayment_BulkPaymentTimeInterval(), 3, 1);
		String mendatoryField = ulsSchemeMasterObj.BulkPayment_BulkPaymentTimeInterval().getText();
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeMasterBulkPaymentTimeIntervalTextBox().click();
		ulsSchemeMasterObj.schemeMasterBulkPaymentTimeIntervalTextBox()
				.sendKeys(schemeMasterTestData.get("BulkPaymentTimeInterval"));
	}

	@And("^verify bulk payment Lock in starts from field should be non mendatory user can able to select the data teh data from drop down$")
	public void verify_bulk_payment_lock_in_starts_from_field_should_be_non_mendatory_user_can_able_to_select_the_data_teh_data_from_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterBulkPaymentLockInStartsFromDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterBulkPaymentLockInStartsFromDropDown()
				.getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*"), " Bulk payment Lock in starts from field is mandatory in application screen ");
		ulsSchemeMasterObj.schemeMasterBulkPaymentLockInStartsFromDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("BulkPaymentLockInStartfrom")
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

	@And("^verify max bulk payment value field should be non mendatory user can able to enter the data in it$")
	public void verify_max_bulk_payment_value_field_should_be_non_mendatory_user_can_able_to_enter_the_data_in_it()
			throws Throwable {
		for (int i = 0; i <= 30; i++) {
			try {
				javascriptHelper.scrollIntoView(ulsSchemeMasterObj.schemeMasterMaxBulkPaymentValueTextBox());
				break;
			} catch (Exception e) {
				if (i == 30) {
					Assert.fail(e.getMessage());
				}
			}
		}
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.BulkPayment_MaxBulkPaymentValueastrick(), 10, 1);
		ulsSchemeMasterObj.BulkPayment_MaxBulkPaymentValueastrick().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," Max Bulk payment value field is mandatory in application screen ");
		ulsSchemeMasterObj.schemeMasterMaxBulkPaymentValueTextBox().click();
		ulsSchemeMasterObj.schemeMasterMaxBulkPaymentValueTextBox()
				.sendKeys(schemeMasterTestData.get("MaxBulkPaymentValue"));
	}

	@And("^verify immediate due date field should be non mendatory user can able to select the data from the drop down$")
	public void verify_innediate_due_date_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterImmediateDueDateDropDown(), 5,
//				1);
		javascriptHelper.scrollIntoView(ulsSchemeMasterObj.schemeMasterImmediateDueDateDropDown());
		String mendatoryField = ulsSchemeMasterObj.schemeMasterImmediateDueDateDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Imediate due date field is mandatory in application screen ");
		ulsSchemeMasterObj.schemeMasterImmediateDueDateDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("ImmediateDueDate")
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
	@And("^verify min bulkpayment value field should be non mandatory user can able to enter the data into it$")
    public void verify_min_bulkpayment_value_field_should_be_non_mandatory_user_can_able_to_enter_the_data_into_it() throws Throwable {
     boolean status=false;
		try
     {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterMinBulkPaymentValueMandatoryVerification(), 10, 1);
    	ulsSchemeMasterObj.schemeMasterMinBulkPaymentValueMandatoryVerification().click();
     }
     catch(Exception e)
     {
    	status=true; 
     }
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterMinBulkPaymentValueTextbox(), 10, 1);
		ulsSchemeMasterObj.schemeMasterMinBulkPaymentValueTextbox().click();
		ulsSchemeMasterObj.schemeMasterMinBulkPaymentValueTextbox().sendKeys(schemeMasterTestData.get("MinBulkPaymentValue"));
	}

	@And("^verify Min Bulk Payment Parameter field should be non mendatory user can able to select the data from the drop down$")
	public void verify_min_bulk_payment_parameter_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterMinBulkPaymentParameterDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterMinBulkPaymentParameterDropDown()
				.getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeMasterMinBulkPaymentParameterDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("MinBulkPaymentParameter")
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

	@And("^verify max bulk payment parameter field should be non mendatory user can able to select the data from the drop down$")
	public void verify_max_bulk_payment_parameter_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterMaxBulkPaymentParameterDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterMaxBulkPaymentParameterDropDown()
				.getAttribute("aria-label");
		Assert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeMasterMaxBulkPaymentParameterDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("MaxBulkPaymentParameter")
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

	@And("^verify Fore closure Lockin field should be non mendatory user can able to enter the data in it$")
	public void verify_fore_closure_lockin_field_should_be_non_mendatory_user_can_able_to_enter_the_data_in_it()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Foreclosure_ForeclosureLockin(), 3,
				1);
		ulsSchemeMasterObj.Foreclosure_ForeclosureLockin().getText();
		}
		catch(Exception e)
		{
		status=true;	
		}
		softAssert.assertTrue(status," Fore Closure Lockin field is mandatory in application screen ");
		ulsSchemeMasterObj.schemeMasterForeClosureLockinTextbox().click();
		ulsSchemeMasterObj.schemeMasterForeClosureLockinTextbox().sendKeys(schemeMasterTestData.get("ForeClousreLockIn"));

	}

	@And("^verify ForeClosure Lock in starts from field should be non mendatory user can able to select the data from the drop down$")
	public void verify_foreclosure_lock_in_starts_from_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterForeClouserLockInStartsFromDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterForeClouserLockInStartsFromDropDown()
				.getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Fore Closure lock in starts from field is mandatory in application screen ");
		ulsSchemeMasterObj.schemeMasterForeClouserLockInStartsFromDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("ForeClousureLockInStartFrom")
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

	@And("^verify min Rebate Parameter field should be non mendatory user can able to select the data from the drop down$")
	public void verify_min_rebate_parameter_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterMinRebateParameterDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterMinRebateParameterDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," min Rebate Parameter field is mandatory in application screen");
		
		ulsSchemeMasterObj.schemeMasterMinRebateParameterDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("MinRebateParameter")
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

	@And("^verify min Rebate Value field should be non mendatory user can able to fill the data in the text box$")
	public void verify_min_rebate_value_field_should_be_non_mendatory_user_can_able_to_fill_the_data_in_the_text_box()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Foreclosure_MinRebateValue(), 3, 1);
		ulsSchemeMasterObj.Foreclosure_MinRebateValue().getText();
		}
		catch(Exception e)
		{
		status=true;	
		}
		softAssert.assertTrue(status," Min Rebate Value is mandatory in application screen");
		ulsSchemeMasterObj.schemeMasterMinRebateValueTextbox().click();
		ulsSchemeMasterObj.schemeMasterMinRebateValueTextbox().sendKeys(schemeMasterTestData.get("LoanCurrency"));
	}

	@And("^verify max Rebate parameter should be non mendatory user can able to select the data from drop down$")
	public void verify_max_rebate_parameter_should_be_non_mendatory_user_can_able_to_select_the_data_from_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterMaxRebateParameterDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterMaxRebateParameterDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Max Rebate Parameter is mandatory in application screen");
		
		ulsSchemeMasterObj.schemeMasterMaxRebateParameterDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("MaxRebateParameter")
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

	@And("^verify max rebate value field should be non mendatory user can able to enter the data in it$")
	public void verify_max_rebate_value_field_should_be_non_mendatory_user_can_able_to_enter_the_data_in_it()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Foreclosure_MaxRebateValue(), 3, 1);
		ulsSchemeMasterObj.Foreclosure_MaxRebateValue().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," Max Rebate Value field is mandatory field in application screen ");
		ulsSchemeMasterObj.schemeMasterMaxRebateValueTextbox().click();
		ulsSchemeMasterObj.schemeMasterMaxRebateValueTextbox().sendKeys(schemeMasterTestData.get("MaxRebateValue"));
	}

	@And("^verify interest holiday field should be non mendatory user can able to pass the data in it$")
	public void verify_interest_holiday_field_should_be_non_mendatory_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.Moratorium_GracePeriod_InterestHoliday(), 3, 1);
		ulsSchemeMasterObj.Moratorium_GracePeriod_InterestHoliday().getText();
		}
		catch(Exception e)
		{
		status=true;	
		}
		softAssert.assertTrue(status," Interset Holiday field is mandatory in application screen");
		ulsSchemeMasterObj.schemeMasterInterestHoliDayTextbox().click();
		ulsSchemeMasterObj.schemeMasterInterestHoliDayTextbox().sendKeys(schemeMasterTestData.get("InterestHoliDay"));
	}

	@And("^verify principal holiday field should be non mendatory user can able to pass the data in it$")
	public void verify_principal_holiday_field_should_be_non_mendatory_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.Moratorium_GracePeriod_PrincipalHoliday(), 3, 1);
		ulsSchemeMasterObj.Moratorium_GracePeriod_PrincipalHoliday().getText();
		}
		catch(Exception e)
		{
		status=true;	
		}
		softAssert.assertTrue(status," Principal Holiday field is mandatory in application screen");
		ulsSchemeMasterObj.schemeMasterPrincipalHoliDayTextbox().click();
		ulsSchemeMasterObj.schemeMasterPrincipalHoliDayTextbox().sendKeys(schemeMasterTestData.get("PrincipalHoliDay"));
	}

	@And("^verify Recomputation of profit field should be non mendatory user can able to select the data from the drop down$")
	public void verify_recomputation_of_profit_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterRecomputationOfProfitDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterRecomputationOfProfitDropDown()
				.getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Recomputation field is mandatory in application screen");
		ulsSchemeMasterObj.schemeMasterRecomputationOfProfitDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("RecomputeOfProfit")
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

	@And("^verify Is Set up allowed field should be non mendatory user can able to select the data from the drop down$")
	public void verify_is_set_up_allowed_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterIsSetUpAllowedDropDown(), 5,
//				1);
		javascriptHelper.scrollIntoView(ulsSchemeMasterObj.schemeMasterIsSetUpAllowedDropDown());
		String mendatoryField = ulsSchemeMasterObj.schemeMasterIsSetUpAllowedDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Is set up allowed field is mandatory in application screen");
		ulsSchemeMasterObj.schemeMasterIsSetUpAllowedDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("IsStepUpAllowed")
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

	@And("^verify max step up field should be non mendatory and user can able to fill the data in it$")
	public void verify_max_step_up_field_should_be_non_mendatory_and_user_can_able_to_fill_the_data_in_it()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.Step_Up_MaxStepUp(), 3, 1);
		ulsSchemeMasterObj.Step_Up_MaxStepUp().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," Max Set up is mandatory in application screen");
		ulsSchemeMasterObj.schemeMasterMaxSetUpTextBox().click();
		ulsSchemeMasterObj.schemeMasterMaxSetUpTextBox().sendKeys(schemeMasterTestData.get("MaxStepUp"));
	}

	@And("^verify eligibility type field should be non mendatory user can able to select the data in it$")
	public void verify_eligibility_type_field_should_be_non_mendatory_user_can_able_to_select_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterEligibilityTypeDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterEligibilityTypeDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Eligibility field should be non mandatory but here its a mandatory field");
		ulsSchemeMasterObj.schemeMasterEligibilityTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("EligibilityType")
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 50; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 50) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^verify PreEmi field should be non mendatory user can able to select the data from the drop down$")
	public void verify_preemi_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
//		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterPreEMIDropDown(), 5,
//				1);
		javascriptHelper.scrollIntoView(ulsSchemeMasterObj.schemeMasterPreEMIDropDown());
		String mendatoryField = ulsSchemeMasterObj.schemeMasterPreEMIDropDown().getAttribute("aria-label");
		softAssert.assertFalse(mendatoryField.contains("*")," Pre EMI field is mandatory in application screen");
		ulsSchemeMasterObj.schemeMasterPreEMIDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("PreEmi") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify no of Pre EMI Installment should be non mendatory user can able to enter the data in it$")
	public void verify_no_of_pre_emi_installment_should_be_non_mendatory_user_can_able_to_enter_the_data_in_it()
			throws Throwable {
		boolean status=false;
		try
		{
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.PreEMI_NoOfPreEMIInstallmentAstrick(), 3, 1);
		ulsSchemeMasterObj.PreEMI_NoOfPreEMIInstallmentAstrick().getText();
		}
		catch(Exception e)
		{
			status=true;
		}
		softAssert.assertTrue(status," No Of Pre EMI Installment is mandatory in application screen ");
		ulsSchemeMasterObj.schemeMasterNoOfPreEMIInstallmentTextBox().click();
		ulsSchemeMasterObj.schemeMasterNoOfPreEMIInstallmentTextBox()
				.sendKeys(schemeMasterTestData.get("NoOfPreEMIInstallment"));
	}

	@And("^verify is loan Transfer Allower field should be mendatory user can able to select the data from the drop down$")
	public void verify_is_loan_transfer_allower_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterIsLoanTransferAllowedDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeMasterIsLoanTransferAllowedDropDown()
				.getAttribute("aria-label");
		softAssert.assertTrue(mendatoryField.contains("*")," Loan Transferedfield is non mandatoyr in application screen");
		ulsSchemeMasterObj.schemeMasterIsLoanTransferAllowedDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("IsLoanTransferAllowed")
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

	@Then("^verify user can able to save the scheme master record$")
	public void verify_user_can_able_to_save_the_scheme_master_record() throws Throwable {
		for (int i = 0; i <= 10; i++) {
			try {
				javascriptHelper.scrollIntoViewAndClick(ulsSchemeMasterObj.schemeMasterSaveButton());
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMastersubmitToastAlert(), 10,
				1);
		Assert.assertEquals(ulsSchemeMasterObj.schemeMastersubmitToastAlert().getText(), "success");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterToastAlertClose(), 10,
				1);
		ulsSchemeMasterObj.schemeMasterToastAlertClose().click();
	}

	@Then("^click on temp view of scheme master$")
	public void click_on_temp_view_of_scheme_master() throws Throwable {

		ulsSchemeMasterObj.ulsSchemeAMasterTempView().click();
	}

	@And("^select the first record$")
	public void select_the_first_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.ulsSchemeMasterFirstRecord(), 3, 1);
		ulsSchemeMasterObj.ulsSchemeMasterFirstRecord().click();
	}

	@And("^click on charge scheme sub screen$")
	public void click_on_charge_scheme_sub_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterSchemeChargesSegmentButton(), 3, 1);
		for (int i = 0; i <= 10; i++) {
			try {
				ulsSchemeMasterObj.schemeMasterSchemeChargesSegmentButton().click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^click on add button in charge scheme sub menu$")
	public void click_on_add_button_in_charge_scheme_sub_menu() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterAddButton(), 3, 1);
		ulsSchemeMasterObj.schemeMasterAddButton().click();
	}

	/**********************/
	@And("^verify master charge drop down should be mendatory user can able to select the data from the drop down$")
	public void verify_master_charge_drop_down_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeChargesMasterChargeDropDown(),
				5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesMasterChargeDropDown().getAttribute("aria-label");
		Assert.assertTrue(mendatoryField.contains("*"));
		Assert.assertTrue(ulsSchemeMasterObj.schemeChargesMasterChargeDropDown().getAttribute("ng-reflect-placeholder")
				.contains("Select"));
		ulsSchemeMasterObj.schemeChargesMasterChargeDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("MasterCharge") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify charge dropdown should be non mendatory user can able to select the dta from the drop down$")
	public void verify_charge_dropdown_should_be_non_mendatory_user_can_able_to_select_the_dta_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeChargeChargeDropDwon(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargeChargeDropDwon().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		Assert.assertTrue(ulsSchemeMasterObj.schemeChargeChargeDropDwon().getAttribute("ng-reflect-placeholder")
				.contains("Select"));
		ulsSchemeMasterObj.schemeChargeChargeDropDwon().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("charge") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify calculation type field should be mendatory user can able to select the data from the drop down$")
	public void verify_calculation_type_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeChargeCalculationTypeDropDwon(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargeCalculationTypeDropDwon().getAttribute("aria-label");
		Assert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargeCalculationTypeDropDwon().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("CalculationType")
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

	@And("^verify falt amount field should be non mendatory user can able to enter the data in it$")
	public void verify_falt_amount_field_should_be_non_mendatory_user_can_able_to_enter_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.ChargeDefinition_FlatAmount(), 3,
				1);
		String mendatoryField = ulsSchemeMasterObj.ChargeDefinition_FlatAmount().getText();
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesFlatAmountTextBox().click();
		ulsSchemeMasterObj.schemeChargesFlatAmountTextBox().sendKeys(schemeMasterTestData.get("flatAmount"));
	}

	@And("^verify percentage text box should be non mendatory user can able to enter the data in it$")
	public void verify_percentage_text_box_should_be_non_mendatory_user_can_able_to_enter_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.ChargeDefinition_Percentage(), 3,
				1);
		String mendatoryField = ulsSchemeMasterObj.ChargeDefinition_Percentage().getText();
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesPercentageTextBox().click();
		ulsSchemeMasterObj.schemeChargesPercentageTextBox().sendKeys(schemeMasterTestData.get("Percentage"));
	}

	@And("^verify calculated on field should be non mendatory user can able to select the data from the drop down$")
	public void verify_calculated_on_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeChargesCalculatedOnDropDown(),
				5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesCalculatedOnDropDown().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesCalculatedOnDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("CalculatedOn") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify RecPay field should be non mendatory user can able to select the data from the drop down$")
	public void verify_recpay_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeChargesRecPayDropDown(), 5,
				1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesRecPayDropDown().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesRecPayDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("RecPay") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify Recfrom PayTo field should be non mendatory user can able to select the data from the drop down$")
	public void verify_recfrom_payto_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeChargesRecFrom_PayToDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesRecFrom_PayToDropDown().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesRecFrom_PayToDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("RecFromPayTo") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify include in cust IRR field should be non mendatory user can able to select the data from the drop down$")
	public void verify_include_in_cust_irr_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeChargesIncluseCustINRDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesIncluseCustINRDropDown().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesIncluseCustINRDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("incluseInCustIRR")
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

	@And("^verify inc in bank IRR field should be non mendatory user can able to select the data from the drop down$")
	public void verify_inc_in_bank_irr_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeChargesINCBankIRRDropDOwn(),
				5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesINCBankIRRDropDOwn().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesINCBankIRRDropDOwn().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("INCInBankIRR") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify level drop down should be non mendatory user can able to slect the data from the drop down$")
	public void verify_level_drop_down_should_be_non_mendatory_user_can_able_to_slect_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeChargesLevelDropDOwn(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesLevelDropDOwn().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesLevelDropDOwn().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("Level") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify currency field should be non mendatory user can able to select the data from the drop down$")
	public void verify_currency_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeChargesCurrencyDropDOwn(), 5,
				1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesCurrencyDropDOwn().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesCurrencyDropDOwn().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("Currency") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify event field should be non mendatory user can able to select the data from the drop down$")
	public void verify_event_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeChargesEventDropDOwn(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesEventDropDOwn().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesEventDropDOwn().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("Event") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify data unit dropdown should be non mendatory user can able to select the data from the drop down$")
	public void verify_data_unit_dropdown_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeChargesDataUnitDropDOwn(), 5,
				1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesDataUnitDropDOwn().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesDataUnitDropDOwn().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("DataUnit") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify date value field should be non mendatory user can able to pass the data in it$")
	public void verify_date_value_field_should_be_non_mendatory_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.ChargeDefinition_DateValue(), 3, 1);
		String mendatoryField = ulsSchemeMasterObj.ChargeDefinition_DateValue().getText();
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesDateValueTextBox().click();
		ulsSchemeMasterObj.schemeChargesDateValueTextBox().sendKeys(schemeMasterTestData.get("DateValue"));
	}

	@And("^verify charge count field should be non mendatory user can able to pass the data in it$")
	public void verify_charge_count_field_should_be_non_mendatory_user_can_able_to_pass_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.ChargeDefinition_ChargeCount(), 3,
				1);
		String mendatoryField = ulsSchemeMasterObj.ChargeDefinition_ChargeCount().getText();
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesChargeCountTextBox().click();
		ulsSchemeMasterObj.schemeChargesChargeCountTextBox().sendKeys(schemeMasterTestData.get("ChargeCount"));
	}

	@And("^verify accounting type field should be mendatory field should be mendaory user can able to select the data from the drop down$")
	public void verify_accounting_type_field_should_be_mendatory_field_should_be_mendaory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeChargesAccountingTypeDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesAccountingTypeDropDown().getAttribute("aria-label");
		Assert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesAccountingTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("AccountingType")
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

	@And("^verify stage dropdown field should be non mendatroy user can able to select the data from the drop down$")
	public void verify_stage_dropdown_field_should_be_non_mendatroy_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeChargesStageDropDown(), 5, 1);
		String mendatoryField = ulsSchemeMasterObj.schemeChargesStageDropDown().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesStageDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("stage") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify module dropdown field should be non mendatroy user can able to select the data from the drop down$")
	public void verify_module_dropdown_field_should_be_non_mendatroy_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		javascriptHelper.scrollIntoView(ulsSchemeMasterObj.schemeChargesModuleDropDown());
		String mendatoryField = ulsSchemeMasterObj.schemeChargesModuleDropDown().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesModuleDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("module") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify remarks field should be non mendatory user can able to pass the data in it$")
	public void verify_remarks_field_should_be_non_mendatory_user_can_able_to_pass_the_data_in_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.ChargeDefinition_Remarks(), 3, 1);
		String mendatoryField = ulsSchemeMasterObj.ChargeDefinition_Remarks().getText();
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.schemeChargesReamrks().click();
		ulsSchemeMasterObj.schemeChargesReamrks().sendKeys(schemeMasterTestData.get("chargeRemarks"));
	}

	@And("^save the charge scheme record$")
	public void save_the_charge_scheme_record() throws Throwable {
		javascriptHelper.scrollIntoViewAndClick(ulsSchemeMasterObj.schemeMasterSaveButton());
		// ulsSchemeMasterObj.schemeMasterSaveButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMastersubmitToastAlert(), 5,
				1);
		Assert.assertEquals(ulsSchemeMasterObj.schemeMastersubmitToastAlert().getText(), "Success");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterToastAlertClose(), 5,
				1);
		ulsSchemeMasterObj.schemeMasterToastAlertClose().click();
	}

	@Then("^goto basic eligibility screen$")
	public void goto_basic_eligibility_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterBasicEligibilitySegmentButton(), 5, 1);
		ulsSchemeMasterObj.schemeMasterBasicEligibilitySegmentButton().click();
	}

	@Then("^click on add button in basic eligibility$")
	public void click_on_add_button_in_basic_eligibility() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterAddButton(), 5, 1);
		ulsSchemeMasterObj.schemeMasterAddButton().click();
	}

	@And("^verify Eligibility type field should be non mendatory user can able to fill the data in it$")
	public void verify_eligibility_type_field_should_be_non_mendatory_user_can_able_to_fill_the_data_in_it()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.basicEligibilityEligibilityTypeDropDown(), 4, 1);
		String mendatoryField = ulsSchemeMasterObj.basicEligibilityEligibilityTypeDropDown().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.basicEligibilityEligibilityTypeDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("eligibilityType2")
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

	@And("^verify Eligibility field should be mendatory user can able to fill the data in it$")
	public void verify_eligibility_field_should_be_mendatory_user_can_able_to_fill_the_data_in_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.basicEligibilityEligibilityDropDown(), 4, 1);
		String mendatoryField = ulsSchemeMasterObj.basicEligibilityEligibilityDropDown().getAttribute("aria-label");
		Assert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.basicEligibilityEligibilityDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("Eligibility") + " ']/parent::ion-item/ion-radio";
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

	@And("^verify Base field should be mendatory and user can able to fill the data inside the text box$")
	public void verify_base_field_should_be_mendatory_and_user_can_able_to_fill_the_data_inside_the_text_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.BasicEligibility_BaseAstrick(), 3,
				1);
		String mendatoryField = ulsSchemeMasterObj.BasicEligibility_BaseAstrick().getText();
		Assert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.basicEligibilityBaseTextBox().click();
		ulsSchemeMasterObj.basicEligibilityBaseTextBox().sendKeys(schemeMasterTestData.get("Base"));
	}

	@And("^verify Income To be Used field should be mendatory user can able to select the data from drop down$")
	public void verify_income_to_be_used_field_should_be_mendatory_user_can_able_to_select_the_data_from_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.basicEligibilityIncomeToBeUserDropDown(), 4, 1);
		String mendatoryField = ulsSchemeMasterObj.basicEligibilityIncomeToBeUserDropDown().getAttribute("aria-label");
		Assert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.basicEligibilityIncomeToBeUserDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("IncomeToBeUsed")
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

	@And("^verify Rule drop down field should be non mendatory user can able to slect the datafrom the drop down$")
	public void verify_rule_drop_down_field_should_be_non_mendatory_user_can_able_to_slect_the_datafrom_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.basicEligibilityRuleDropDown(), 4,
				1);
		String mendatoryField = ulsSchemeMasterObj.basicEligibilityRuleDropDown().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.basicEligibilityRuleDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("Rule") + " ']/parent::ion-item/ion-radio";
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

	@Then("^save the eligibility record$")
	public void save_the_eligibility_record() throws Throwable {
		ulsSchemeMasterObj.schemeMasterSaveButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMastersubmitToastAlert(), 5,
				1);
		for (int i = 0; i <= 10; i++) {
			try {
				Assert.assertEquals(ulsSchemeMasterObj.schemeMastersubmitToastAlert().getText(), "Success");
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterToastAlertClose(), 5,
				1);
		ulsSchemeMasterObj.schemeMasterToastAlertClose().click();
	}

	@Then("^goto verification screen$")
	public void goto_verification_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.chemeMasterVerificationSegmentButton(), 5, 1);
		ulsSchemeMasterObj.chemeMasterVerificationSegmentButton().click();
	}

	@And("^click on add button to create the verification record$")
	public void click_on_add_button_to_create_the_verification_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterAddButton(), 5, 1);
		ulsSchemeMasterObj.schemeMasterAddButton().click();
	}

	@And("^veirfy verification stage field should be mendatory user can able to select the data from the drop down$")
	public void veirfy_verification_stage_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.verificationDetailsVerificationStageDropDown(), 4, 1);
		String mendatoryField = ulsSchemeMasterObj.verificationDetailsVerificationStageDropDown()
				.getAttribute("aria-label");
		Assert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.verificationDetailsVerificationStageDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("VerificationStage")
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

	@And("^verify rule field should be non mendatory user can able to select the data from the drop down$")
	public void verify_rule_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.verificationDetailsRuleDropDown(),
				4, 1);
		String mendatoryField = ulsSchemeMasterObj.verificationDetailsRuleDropDown().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.verificationDetailsRuleDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("VerificationRule")
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

	@Then("^save the verification Record$")
	public void save_the_verification_record() throws Throwable {
		ulsSchemeMasterObj.schemeMasterSaveButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMastersubmitToastAlert(), 5,
				1);
		Assert.assertEquals(ulsSchemeMasterObj.schemeMastersubmitToastAlert().getText(), "Success");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterToastAlertClose(), 5,
				1);
		ulsSchemeMasterObj.schemeMasterToastAlertClose().click();
	}

	@Then("^goto valuation screen to add the data$")
	public void goto_valuation_screen_to_add_the_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.chemeMasterValuationSegmentButton(),
				5, 1);
		ulsSchemeMasterObj.chemeMasterValuationSegmentButton().click();
	}

	@Then("^click on add button to add the valuation data$")
	public void click_on_add_button_to_add_the_valuation_data() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterAddButton(), 5, 1);
		ulsSchemeMasterObj.schemeMasterAddButton().click();
	}

	@And("^verify asset type field should be mendatory user can able to select the data from the drop down$")
	public void verify_asset_type_field_should_be_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		/*
		 * waitHelper.waitForElementToVisibleWithFluentWait(driver,
		 * ulsSchemeMasterObj.valuationDetailsAssetTypeDropDown(), 4, 1); String
		 * mendatoryField =
		 * ulsSchemeMasterObj.valuationDetailsAssetTypeDropDown().getAttribute(
		 * "aria-label"); Assert.assertTrue(mendatoryField.contains("*"));
		 * ulsSchemeMasterObj.valuationDetailsAssetTypeDropDown().click(); String xpath
		 * = "//ion-label[text()=' " + ulSchemeMasterTestData.AssetType +
		 * " ']/parent::ion-item/ion-radio"; for (int i = 0; i <= 15; i++) { try {
		 * javascriptHelper.scrollIntoView(driver.findElement(By.xpath(xpath)));
		 * clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
		 * clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
		 * break; } catch (Exception e) { if (i == 15) { Assert.fail(e.getMessage()); }
		 * } }
		 */
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.valuationDetailsAssetTypeDropDown(),
				4, 1);
		String mendatoryField = ulsSchemeMasterObj.valuationDetailsAssetTypeDropDown().getAttribute("aria-label");
		Assert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.valuationDetailsAssetTypeDropDown().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.valuationDetailsAssetTypeDropDownValue(), 5, 1);
		ulsSchemeMasterObj.valuationDetailsAssetTypeDropDownValue().click();
	}

	@And("^verify valuation rule field should be non mendatory user can able to select the data from the drop down$")
	public void verify_valuation_rule_field_should_be_non_mendatory_user_can_able_to_select_the_data_from_the_drop_down()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.valuationDetailsRuleDropDown(), 4,
				1);
		String mendatoryField = ulsSchemeMasterObj.valuationDetailsRuleDropDown().getAttribute("aria-label");
		Assert.assertFalse(mendatoryField.contains("*"));
		ulsSchemeMasterObj.valuationDetailsRuleDropDown().click();
		String xpath = "//ion-label[text()=' " + schemeMasterTestData.get("ValuationRule")
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

	@And("^verifynumber of valuation field should be mendatory user can able to fill the data inside the text box$")
	public void verifynumber_of_valuation_field_should_be_mendatory_user_can_able_to_fill_the_data_inside_the_text_box()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.Valuation_NumberOfValuationAstrick(), 3, 1);
		String mendatoryField = ulsSchemeMasterObj.Valuation_NumberOfValuationAstrick().getText();
		Assert.assertTrue(mendatoryField.contains("*"));
		ulsSchemeMasterObj.valuationDetailsNumberOfValuationTextBox().click();
		ulsSchemeMasterObj.valuationDetailsNumberOfValuationTextBox()
				.sendKeys(schemeMasterTestData.get("NumberOfValuation"));
	}

	@And("^save the valuation record$")
	public void save_the_valuation_record() throws Throwable {
		ulsSchemeMasterObj.schemeMasterSaveButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMastersubmitToastAlert(), 5,
				1);
		Assert.assertEquals(ulsSchemeMasterObj.schemeMastersubmitToastAlert().getText(), "Success");
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterToastAlertClose(), 5,
				1);
		ulsSchemeMasterObj.schemeMasterToastAlertClose().click();
	}

	@Then("^click on notification in schemeMaster module$")
	public void click_on_notification_in_schememaster_module() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterMailBox(), 5, 1);
		ulsSchemeMasterObj.schemeMasterMailBox().click();
	}

	@And("^select the record from the notification list$")
	public void select_the_record_from_the_notification_list() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterinboxSearch(), 5, 1);
		ulsSchemeMasterObj.schemeMasterinboxSearch().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterSearchTextBoxInbox(), 5,
				1);
		clicksAndActionsHelper.moveToElement(ulsSchemeMasterObj.schemeMasterSearchTextBoxInbox());
		clicksAndActionsHelper.clickOnElement(ulsSchemeMasterObj.schemeMasterSearchTextBoxInbox());
		ulsSchemeMasterObj.schemeMasterSearchTextBoxInbox().sendKeys(schemeMasterTestData.get("moduleCode"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterreferenceID(), 5, 1);
		String referenceID = ulsSchemeMasterObj.schemeMasterreferenceID().getText();
		System.out.println("Reference ID is " + referenceID);
		jsonDataReadertWriter.addReferanceData(referenceID);
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ulsSchemeMasterObj.schemeMasterinboxFirstRecord(), 5, 1);
		ulsSchemeMasterObj.schemeMasterinboxFirstRecord().click();
	}

	@Then("^submit the record from the maker stage$")
	public void submit_the_record_from_the_maker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterSubmitButton(), 5, 1);
		ulsSchemeMasterObj.schemeMasterSubmitButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasteralertRemark(), 10, 1);
		ulsSchemeMasterObj.schemeMasteralertRemark().click();
		ulsSchemeMasterObj.schemeMasteralertRemark().sendKeys(schemeMasterTestData.get("AlertRemark"));
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasteraleralertSubmitButton(),
				5, 1);
		ulsSchemeMasterObj.schemeMasteraleralertSubmitButton().click();
		
	}

	@Then("^verify record is submitted from the maker end$")
	public void verify_record_is_submitted_from_the_maker_end() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMastersubmitToastAlert(), 5,
				1);
		String submitedStatus = ulsSchemeMasterObj.schemeMastersubmitToastAlert().getText();
		System.out.println(submitedStatus);
		String substring = submitedStatus.substring(83);
		System.out.println("Reviewer ID " + substring.replace(".", ""));
		jsonDataReadertWriter.addData(substring.replace(".", "").trim());
		softAssert.assertAll();
	}

	@Then("^login with checker user$")
	public void login_with_checker_user() throws Throwable {
		kulsLogin.ulSApplicationLoginAsAChecker(jsonDataReadertWriter.readdata());
	}
	
	@And("^click on menu bar the click on inbox$")
	public void click_on_menu_bar_the_click_on_inbox() throws Throwable {
		ulsSchemeMasterObj.schemeMasterCheckerMenuBar().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterMailBox(), 3, 1);
		ulsSchemeMasterObj.schemeMasterMailBox().click();
	}

	@Then("^select the scheme record which is submitted by maker$")
	public void select_the_scheme_record_which_is_submitted_by_maker() throws Throwable {
		for (int i = 0; i <= 15; i++) {
			try {
				driver.findElement(By.xpath(
						"//span[text()='" + jsonDataReadertWriter.readReferancedata() + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^verify the checker user can able to see the same record which is submited by maker$")
	public void verify_the_checker_user_can_able_to_see_the_same_record_which_is_submited_by_maker() throws Throwable {

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerDescriptionValue(), 5, 1);
		String Description = ulsSchemeMasterObj.checkerDescriptionValue().getAttribute("ng-reflect-model");
		Assert.assertTrue(Description.contains(ulSchemeMasterTestData.UlsDescription));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerProductTypeValue(), 5, 1);
		String productType = ulsSchemeMasterObj.checkerProductTypeValue().getAttribute("aria-label");
		Assert.assertTrue(productType.contains(ulSchemeMasterTestData.UlsProductType));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerSubProductTypeValue(), 5, 1);
		String subProductType = ulsSchemeMasterObj.checkerSubProductTypeValue().getAttribute("aria-label");
		Assert.assertTrue(subProductType.contains(ulSchemeMasterTestData.UlsSubProductType));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerLoanCurrencyValueDropDown(),
				5, 1);
		String LoanCurrency = ulsSchemeMasterObj.checkerLoanCurrencyValueDropDown().getAttribute("aria-label");
		Assert.assertTrue(LoanCurrency.contains(ulSchemeMasterTestData.LoanCurrency));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.checkerIndexationCurrencyValueDropDown(), 5, 1);
		String IndexationCurrency = ulsSchemeMasterObj.checkerIndexationCurrencyValueDropDown()
				.getAttribute("aria-label");
		Assert.assertTrue(IndexationCurrency.contains(ulSchemeMasterTestData.IndexationCurrency));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerRepaymentTypeValueDropDown(),
				5, 1);
		String repaymentType = ulsSchemeMasterObj.checkerRepaymentTypeValueDropDown().getAttribute("aria-label");
		Assert.assertTrue(repaymentType.contains(ulSchemeMasterTestData.RepaymentType));

		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerFlatReducingValueDropDown(),
				5, 1);
		String faltReducing = ulsSchemeMasterObj.checkerFlatReducingValueDropDown().getAttribute("aria-label");
		Assert.assertTrue(faltReducing.contains(ulSchemeMasterTestData.FlatReducing));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.checker_INTAmortizationValueDropDownValue(), 5, 1);
		String amortization = ulsSchemeMasterObj.checker_INTAmortizationValueDropDownValue().getAttribute("aria-label");
		Assert.assertTrue(amortization.contains(ulSchemeMasterTestData.IntAmortizationMethod));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.checker_ComputeInstallmentValueDropDown(), 5, 1);
		String computeInstallment = ulsSchemeMasterObj.checker_ComputeInstallmentValueDropDown()
				.getAttribute("aria-label");
		Assert.assertTrue(computeInstallment.contains(ulSchemeMasterTestData.ComputeInstallmentOn));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.checker_DueDateMethodValueDropDown(), 5, 1);
		String dueDateMethod = ulsSchemeMasterObj.checker_DueDateMethodValueDropDown().getAttribute("aria-label");
		Assert.assertTrue(dueDateMethod.contains(ulSchemeMasterTestData.InstDueDateMethod));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.checker_PrincipalRepaymentFrequencyDropDown(), 5, 1);
		String principalRepaymentFrequency = ulsSchemeMasterObj.checker_PrincipalRepaymentFrequencyDropDown()
				.getAttribute("aria-label");
		Assert.assertTrue(principalRepaymentFrequency.contains(ulSchemeMasterTestData.PrincipalRepaymentFrom));

//		waitHelper.waitForElementToVisibleWithFluentWait(driver,
//				ulsSchemeMasterObj.checker_InterestRepaymentFrequencyDropDown(), 5, 1);

		javascriptHelper.scrollIntoView(ulsSchemeMasterObj.checker_InterestRepaymentFrequencyDropDown());
		String intersetRepaymentFrequency = ulsSchemeMasterObj.checker_InterestRepaymentFrequencyDropDown()
				.getAttribute("aria-label");
		Assert.assertTrue(intersetRepaymentFrequency.contains(ulSchemeMasterTestData.InterestRepaymentFrequency));

		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.checker_LoanEligibilityValueDropDown(), 5, 1);
		String loanEligibilityValue = ulsSchemeMasterObj.checker_LoanEligibilityValueDropDown()
				.getAttribute("aria-label");
		Assert.assertTrue(loanEligibilityValue.contains(ulSchemeMasterTestData.LoanEligibilityCalc));

	}

	@Then("^click on approve button$")
	public void click_on_approve_button() throws Throwable {
		javascriptHelper.scrollIntoView(ulsSchemeMasterObj.checkerApproveButton());
		ulsSchemeMasterObj.checkerApproveButton().click();
	}

	@And("^give the checker remark in alert and approve it$")
	public void give_the_checker_remark_in_alert_and_approve_it() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerAlertRemark(), 5, 1);
		ulsSchemeMasterObj.checkerAlertRemark().click();
		ulsSchemeMasterObj.checkerAlertRemark().sendKeys(schemeMasterTestData.get("CheckerAlertRemark"));
		

		ulsSchemeMasterObj.checkerAlertApprove().click();
	}

	@Then("^verify checker user can able to see the successfull pop up after approving the record from checker end$")
	public void verify_checker_user_can_able_to_see_the_successfull_pop_up_after_approving_the_record_from_checker_end()
			throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerConfirmationPopUp(), 5, 1);

		Assert.assertEquals(ulsSchemeMasterObj.checkerConfirmationPopUp().getText(), "Record APPROVED Successfully");
	}

	@And("^click on reject button in checker stage$")
	public void click_on_reject_button_in_checker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerRejectButton(), 5, 1);
		ulsSchemeMasterObj.checkerRejectButton().click();
	}

	@And("^give the checker remark in alert pop up$")
	public void give_the_checker_remark_in_alert_pop_up() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerAlertRemark(), 5, 1);
		ulsSchemeMasterObj.checkerAlertRemark().click();
		ulsSchemeMasterObj.checkerAlertRemark().sendKeys(ulSchemeMasterTestData.checkerNegativeAlertRemark);
	}

	@And("^click on reject button in alert pop up$")
	public void click_on_reject_button_in_alert_pop_up() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerAlertRejectButton(), 5, 1);
		ulsSchemeMasterObj.checkerAlertRejectButton().click();
	}

	@Then("^verify checker user can able to see the reject pop up after rejecting the record$")
	public void verify_checker_user_can_able_to_see_the_reject_pop_up_after_rejecting_the_recordt() throws Throwable {
//Record REJECTED Successfully
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerConfirmationPopUp(), 5, 1);

		System.out.println(ulsSchemeMasterObj.checkerConfirmationPopUp().getText());
		Assert.assertEquals(ulsSchemeMasterObj.checkerConfirmationPopUp().getText(), "Record REJECTED Successfully");
	}

	@And("^click on return button$")
	public void click_on_return_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerReturnButton(), 5, 1);
		ulsSchemeMasterObj.checkerReturnButton().click();
	}

	@And("^Give the appropriate remark in alert pop up$")
	public void give_the_appropriate_remark_in_alert_pop_up() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerAlertRemark(), 5, 1);
		ulsSchemeMasterObj.checkerAlertRemark().click();
		ulsSchemeMasterObj.checkerAlertRemark().sendKeys(ulSchemeMasterTestData.checkerRuturnAlertRemark);
	}

	@And("^click on return button in remark pop up$")
	public void click_on_return_button_in_remark_pop_up() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerAlertReturnButton(), 5, 1);
		ulsSchemeMasterObj.checkerAlertReturnButton().click();
	}

	@When("^checker user return the record checker user can able to see the confirmation pop up$")
	public void checker_user_return_the_record_checker_user_can_able_to_see_the_confirmation_pop_up() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.checkerConfirmationPopUp(), 5, 1);

		System.out.println(ulsSchemeMasterObj.checkerConfirmationPopUp().getText());
		Assert.assertTrue(
				ulsSchemeMasterObj.checkerConfirmationPopUp().getText().contains("Record RETURNED Successfully"));
		// Assert.assertEquals(ulsSchemeMasterObj.checkerConfirmationPopUp().getText(),
		// "Record REJECTED Successfully");
	}

	@Then("^verify user can able to see the approved record in list view$")
	public void verify_user_can_able_to_see_the_approved_record_in_list_view() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterListViewStatus(), 5, 1);
		ulsSchemeMasterObj.schemeMasterListViewStatus().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterSearchBox(), 5, 1);
		ulsSchemeMasterObj.schemeMasterSearchBox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterSearchTextBox(), 5, 1);
		clicksAndActionsHelper.moveToElement(ulsSchemeMasterObj.schemeMasterSearchTextBox());
		clicksAndActionsHelper.clickOnElement(ulsSchemeMasterObj.schemeMasterSearchTextBox());
		ulsSchemeMasterObj.schemeMasterSearchTextBox().sendKeys(ulSchemeMasterTestData.UlsDescription);
		for (int i = 0; i <= 10; i++) {
			try {
				boolean displayed = driver
						.findElement(
								By.xpath("//span[contains(text(),'" + ulSchemeMasterTestData.UlsDescription + " ')]"))
						.isDisplayed();
				Assert.assertTrue(displayed);
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail("Element Not visible");
				}
			}
		}
	}

	@Then("^verify user can not able to see the rejected record in list view$")
	public void verify_user_can_not_able_to_see_the_rejected_record_in_list_view() throws Throwable {
		// waitHelper.waitForElementToVisibleWithFluentWait(driver,
		// ulsSchemeMasterObj.schemeMasterListViewStatus(), 5, 1);
		// ulsSchemeMasterObj.schemeMasterListViewStatus().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterTextBoxCloseButton(), 5,
				1);
		ulsSchemeMasterObj.schemeMasterTextBoxCloseButton().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterSearchBox(), 5, 1);
		ulsSchemeMasterObj.schemeMasterSearchBox().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterSearchTextBox(), 5, 1);
		clicksAndActionsHelper.moveToElement(ulsSchemeMasterObj.schemeMasterSearchTextBox());
		clicksAndActionsHelper.clickOnElement(ulsSchemeMasterObj.schemeMasterSearchTextBox());
		ulsSchemeMasterObj.schemeMasterSearchTextBox().clear();
		ulsSchemeMasterObj.schemeMasterSearchTextBox().sendKeys(ulSchemeMasterTestData.UlsDescriptionForCheckerReject);
		for (int i = 0; i <= 10; i++) {
			try {
				boolean displayed = driver.findElement(By.xpath(
						"//span[contains(text(),'" + ulSchemeMasterTestData.UlsDescriptionForCheckerReject + " ')]"))
						.isDisplayed();
				Assert.assertFalse(displayed);
			} catch (Exception e) {

			}
		}
	}

	@Then("^verify maker user can able to see the returned record in temp view$")
	public void verify_maker_user_can_able_to_see_the_returned_record_in_temp_view() throws Throwable {
		for (int i = 0; i <= 20; i++) {
			try {
				boolean returnRecordStatus = driver.findElement(By.xpath(
						"//span[contains(text(),'" + ulSchemeMasterTestData.UlsDescriptionForCheckerReturn + " ')]"))
						.isDisplayed();
				Assert.assertTrue(returnRecordStatus);
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^select the active data from the scheme master$")
	public void select_the_active_data_from_the_scheme_master() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterListViewStatus(), 5, 1);
		ulsSchemeMasterObj.schemeMasterListViewStatus().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterSchemeChargeActiveRecord(), 5, 1);
		ulsSchemeMasterObj.schemeMasterSchemeChargeActiveRecord().click();

	}

	@Then("^Deactivate the schemeCharge Record$")
	public void deactivate_the_schemecharge_record() throws Throwable {

		javascriptHelper.scrollIntoView(ulsSchemeMasterObj.schemeMasterToggleButton());
		ulsSchemeMasterObj.schemeMasterToggleButton().click();
	}

	@Then("^select the active data from the eligibility screen$")
	public void select_the_active_data_from_the_eligibility_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterListViewStatus(), 5, 1);
		ulsSchemeMasterObj.schemeMasterListViewStatus().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				ulsSchemeMasterObj.schemeMasterBasicEligibilityActiveRecord(), 5, 1);
		ulsSchemeMasterObj.schemeMasterBasicEligibilityActiveRecord().click();
	}

	@Then("^change the staus to inactive$")
	public void change_the_staus_to_inactive() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterToggleButton(), 5, 1);
		ulsSchemeMasterObj.schemeMasterToggleButton().click();
	}

	@Then("^select the active record from the list of verification record$")
	public void select_the_active_record_from_the_list_of_verification_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterListViewStatus(), 5, 1);
		ulsSchemeMasterObj.schemeMasterListViewStatus().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterValuationActiveRecord(),
				5, 1);
		ulsSchemeMasterObj.schemeMasterValuationActiveRecord().click();
	}

	@And("^Select the active data from the valuation screen$")
	public void select_the_active_data_from_the_valuation_screen() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterListViewStatus(), 5, 1);
		ulsSchemeMasterObj.schemeMasterListViewStatus().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterValuationActiveRecord(),
				5, 1);
		ulsSchemeMasterObj.schemeMasterValuationActiveRecord().click();
	}

	@And("^change the record status active to inactive$")
	public void change_the_record_status_active_to_inactive() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, ulsSchemeMasterObj.schemeMasterToggleButton(), 5, 1);
		ulsSchemeMasterObj.schemeMasterToggleButton().click();
	}
}
