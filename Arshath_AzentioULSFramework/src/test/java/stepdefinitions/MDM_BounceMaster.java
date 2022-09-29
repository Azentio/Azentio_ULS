package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.BounceMasterObj;
import resources.BaseClass;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.KULS_Login_TestDataType;
import testDataType.MDM_BounceMasterTestdata;

public class MDM_BounceMaster extends BaseClass {

	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	JavascriptHelper javaHelper = new JavascriptHelper(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	JsonConfig jsonConfig = new JsonConfig();
	FindFieldisMandatoryorNot verifyfield = new FindFieldisMandatoryorNot(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	JsonDataReaderWriter json = new JsonDataReaderWriter();
	KULS_Application_Login applicationLogin = new KULS_Application_Login(driver);
	KULS_Login_TestDataType loginData = jsonConfig.getKULSLoginCredentialsByName("Maker");
	BounceMasterObj bounceObj = new BounceMasterObj(driver);
	MDM_BounceMasterTestdata BounceData = jsonConfig.getBounceMstByName("Maker");

	@Given("^User Launch the KULS application$")
	public void user_launch_the_kuls_application() throws Throwable {
		String kulsApplicationUrl = configFileReader.getApplicationULSUrl();
		driver.get(kulsApplicationUrl);
		applicationLogin.UlsApplicationMaker(loginData.Username, loginData.Password);
	}

	@And("^User click on Bounce Master Temp view$")
	public void user_click_on_bounce_master_temp_view() throws Throwable {
		javaHelper.scrollIntoView(bounceObj.tempViewOfBounceMaster());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.tempViewOfBounceMaster(), 60, 2);
		bounceObj.tempViewOfBounceMaster().click();
	}

	@And("^user update the Bounce code field$")
	public void user_update_the_bounce_code_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.BounceCodeFieldInBounceMaster(), 60, 2);
		bounceObj.BounceCodeFieldInBounceMaster().click();
		bounceObj.BounceCodeFieldInBounceMaster().clear();
		bounceObj.BounceCodeFieldInBounceMaster().sendKeys(BounceData.BounceCode);
	}

	@And("^user update the Charge Applicable field$")
	public void user_update_the_charge_applicable_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.ChargeApplicableFieldInBounceMaster(), 60,
				2);
		bounceObj.ChargeApplicableFieldInBounceMaster().click();
		for (int i = 0; i < 10; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),' "+BounceData.ChargeApplicable+" ')]/parent::ion-item//ion-radio"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 10) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user update the Bounce Description field$")
	public void user_update_the_bounce_description_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.BounceDescriptionFieldInBounceMaster(), 60,
				2);
		for (int i = 0; i < 40; i++) {
			try {
				bounceObj.BounceDescriptionFieldInBounceMaster().click();
				bounceObj.BounceDescriptionFieldInBounceMaster().clear();
				bounceObj.BounceDescriptionFieldInBounceMaster().sendKeys(BounceData.BounceDescription);
				break;
			} catch (Exception e) {
				if (i == 40) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^user update the Bounce Description2 field$")
	public void user_update_the_bounce_description2_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.BounceDescription2FieldInBounceMaster(), 60,
				2);
		bounceObj.BounceDescription2FieldInBounceMaster().click();
		bounceObj.BounceDescription2FieldInBounceMaster().clear();
		bounceObj.BounceDescription2FieldInBounceMaster().sendKeys(BounceData.BounceDescription2);
	}

	@And("^user update the Bounce Description3 field$")
	public void user_update_the_bounce_description3_field() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.BounceDescription3FieldInBounceMaster(), 60,
				2);
		bounceObj.BounceDescription3FieldInBounceMaster().click();
		bounceObj.BounceDescription3FieldInBounceMaster().clear();
		bounceObj.BounceDescription3FieldInBounceMaster().sendKeys(BounceData.BounceDescription3);
	}

	@And("^user click the save button$")
	public void user_click_the_save_button() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.BounceMasterSaveIcon(), 60, 2);
		bounceObj.BounceMasterSaveIcon().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.BounceMasterSaveSuccessPopup(), 60, 2);
		Assert.assertEquals(bounceObj.BounceMasterSaveSuccessPopup().getText(), BounceData.SavePopup);

	}

	@And("^User click on Bounce Master List view$")
	public void user_click_on_bounce_master_list_view() throws Throwable {
		javaHelper.scrollIntoView(bounceObj.viewIconOfBounceMaster());
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.viewIconOfBounceMaster(), 60, 2);
		bounceObj.viewIconOfBounceMaster().click();
	}
	
	@And("^user click the save buttons$")
	public void user_click_the_save_buttons() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.BounceMasterSaveIcon(), 60, 2);
		bounceObj.BounceMasterSaveIcon().click();
		waitHelper.waitForElementToVisibleWithFluentWait(driver, bounceObj.BounceMastersubmitSuccessPopup(), 60, 2);
		Assert.assertEquals(bounceObj.BounceMastersubmitSuccessPopup().getText(), BounceData.SubmitPopup);

	}
	
}
