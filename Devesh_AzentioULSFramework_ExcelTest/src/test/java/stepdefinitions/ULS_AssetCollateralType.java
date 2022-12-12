package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.ULS_AssetCollateralTypeObj;
import resources.BaseClass;
import testDataType.ULS_AssetCollateralTypeTestData;

public class ULS_AssetCollateralType extends BaseClass {
	WebDriver driver = BaseClass.driver;
	JsonConfig jsonConfig = new JsonConfig();
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	ULS_AssetCollateralTypeObj assetCollateralTypeObj = new ULS_AssetCollateralTypeObj(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	ULS_AssetCollateralTypeTestData assetCollateralTypeTestData = jsonConfig
			.getAssetCollateralTypeTestDataByName("Maker");
	ExcelData excelData = new ExcelData("C:\\Users\\inindc00091\\eclipse-workspace\\Devesh_AzentioULSFramework_ExcelTest\\Test-data\\TestDataDesignSample.xlsx","AssetCollateralTypeTestData","Data Set ID");
	Map<String, String> testData;

	
	@And("^click on asset collateral config menu$")
	public void click_on_asset_collateral_config_menu() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, assetCollateralTypeObj.ulsAssetCollateralConfig(), 5,
				1);
		assetCollateralTypeObj.ulsAssetCollateralConfig().click();
	}

	@Then("^click on asset collateral type view button$")
	public void click_on_asset_collateral_type_view_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				assetCollateralTypeObj.assetCollateralConfigCollateralTypeViewbutton(), 5, 1);
		assetCollateralTypeObj.assetCollateralConfigCollateralTypeViewbutton().click();
	}

	@And("^click on add button in asset collateral$")
	public void click_on_add_button_in_asset_collateral() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, assetCollateralTypeObj.assetCollateralTypeAddButton(),
				5, 1);
		assetCollateralTypeObj.assetCollateralTypeAddButton().click();
	}

	@And("^click on save button in asset collateral type$")
	public void click_on_save_button_in_asset_collateral_type() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, assetCollateralTypeObj.assetCollateralTypeSaveButton(),
				5, 1);
		assetCollateralTypeObj.assetCollateralTypeSaveButton().click();
	}

	@Then("^verify system should show the validation for the invalid fields$")
	public void verify_system_should_show_the_validation_for_the_invalid_fields() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				assetCollateralTypeObj.assetCollateralTypeDescriptionBlankVerification(), 5, 1);
		Assert.assertTrue(assetCollateralTypeObj.assetCollateralTypeDescriptionBlankVerification().isDisplayed());
		Assert.assertTrue(
				assetCollateralTypeObj.assetCollateralTypeCollateralCatagoryDropDownBlankVerification().isDisplayed());
		Assert.assertTrue(assetCollateralTypeObj.assetCollateralTypeCodeBlankVerification().isDisplayed());
		Assert.assertTrue(assetCollateralTypeObj.assetCollateralTypeModuleDropDownBlankVerification().isDisplayed());
		Assert.assertTrue(assetCollateralTypeObj.assetCollateralTypeHairCutBlankVerification().isDisplayed());
		Assert.assertTrue(assetCollateralTypeObj.assetCollateralTypeRemarksBlankVerification().isDisplayed());
	}

	@Then("^verify system should not allow to save the record when user enter numbers in all the text box$")
	public void verify_system_should_not_allow_to_save_the_record_when_user_enter_numbers_in_all_the_text_box()
			throws Throwable {
		testData = excelData.getTestdata("AT_ACT_05_D1");
		waitHelper.waitForElementToVisibleWithFluentWait(driver,
				assetCollateralTypeObj.assetCollateralTypeDescriptionTextBox(), 5, 1);
		assetCollateralTypeObj.assetCollateralTypeDescriptionTextBox().click();
		assetCollateralTypeObj.assetCollateralTypeDescriptionTextBox()
				.sendKeys(testData.get("Description"));

		assetCollateralTypeObj.assetCollateralTypeCollateralTypeCodeTextBox().click();
		assetCollateralTypeObj.assetCollateralTypeCollateralTypeCodeTextBox()
				.sendKeys(testData.get("Asset/Collateral Type Code"));

		assetCollateralTypeObj.assetCollateralTypeCollateralCatagoryDropDown().click();

		String xpath = "//ion-label[text()=' " + testData.get("Asset/Collateral Category")
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

		assetCollateralTypeObj.assetCollateralTypeModuleDropDown().click();

		String moduleXpath = "//ion-label[text()=' " + testData.get("Module")
				+ " ']/parent::ion-item/ion-radio";
		for (int i = 0; i <= 20; i++) {
			try {
				javascriptHelper.scrollIntoView(driver.findElement(By.xpath(moduleXpath)));
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(moduleXpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(moduleXpath)));
				// javascriptHelper.scrollIntoViewAndClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 20) {
					Assert.fail(e.getMessage());
				}
			}
		}
		for (int i = 0; i <= 15; i++) {
			try {
				assetCollateralTypeObj.assetCollateralTypeHairCutPercentage().click();
				assetCollateralTypeObj.assetCollateralTypeHairCutPercentage()
						.sendKeys(testData.get("HairCut %"));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
		assetCollateralTypeObj.assetCollateralTypeRemarkTextBox().click();
		assetCollateralTypeObj.assetCollateralTypeRemarkTextBox()
				.sendKeys(testData.get("Remarks"));
		boolean status = false;
		for (int i = 0; i <= 15; i++) {
			try {
				status = assetCollateralTypeObj.assetCollateralToastAlert().isDisplayed();
			} catch (Exception e) {

			}
		}
		Assert.assertFalse(status);

	}
	@Then("^verify user not able to enter charecters in numeric field$")
    public void verify_user_not_able_to_enter_charecters_in_numeric_field() throws Throwable {
		assetCollateralTypeObj.assetCollateralTypeHairCutPercentage().clear();
		for (int i = 0; i <= 15; i++) {
			try {
				assetCollateralTypeObj.assetCollateralTypeHairCutPercentage().click();
				assetCollateralTypeObj.assetCollateralTypeHairCutPercentage()
						.sendKeys(testData.get("Character Input"));
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
		String hairCutData = assetCollateralTypeObj.assetCollateralSubTyprHairCutPercentageDataHolder().getAttribute("ng-reflect-model");
		boolean status=false;
		char[] hairCutArray = hairCutData.toCharArray();
		for(int i=0;i<hairCutArray.length;i++)
		{
			if(Character.isDigit(hairCutArray[i]))
			{
				status=true;
			}
			else
			{
		        status=false;
			}
			Assert.assertTrue(status);
		}
	}

    @Then("^verify system should not allow user to create the record with special characters$")
    public void verify_system_should_not_allow_user_to_create_the_record_with_special_characters() throws Throwable {
    	assetCollateralTypeObj.assetCollateralTypeCollateralTypeCodeTextBox().clear();
    	assetCollateralTypeObj.assetCollateralTypeCollateralTypeCodeTextBox().sendKeys(testData.get("Special Character Input"));
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, assetCollateralTypeObj.collateralSubTypeCodeSpecialCharacterVerification(), 5, 1);
    	Assert.assertTrue(assetCollateralTypeObj.collateralSubTypeCodeSpecialCharacterVerification().isDisplayed());
    }

}
