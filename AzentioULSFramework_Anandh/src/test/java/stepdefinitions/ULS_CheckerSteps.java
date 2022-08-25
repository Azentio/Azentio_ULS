package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProvider.JsonConfig;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.ULS_CheckerObj;
import resources.BaseClass;
import resources.JsonDataReaderWriter;
import testDataType.ULS_CheckerTestData;

public class ULS_CheckerSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	KULS_Application_Login kulsLogin = new KULS_Application_Login(driver);
	JsonDataReaderWriter jsonData = new JsonDataReaderWriter();
	ULS_CheckerObj checkerObj = new ULS_CheckerObj(driver);
	JsonConfig jsonConfig = new JsonConfig();
	ULS_CheckerTestData checkerUserTestData = jsonConfig.getLoCheckerUserTestDataByName("checker");

	@And("^login with checker credentials$")
	public void login_with_checker_credentials() throws Throwable {
		kulsLogin.ulSApplicationLoginAsAChecker(jsonData.readdata());
	}

	@And("^click on notificatrion in checker stage$")
	public void click_on_notificatrion_in_checker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerMailBox(), 10, 1);
		checkerObj.checkerMailBox().click();
	}

	@And("^select the record by the help of reference ID$")
	public void select_the_record_by_the_help_of_reference_id() throws Throwable {
		for (int i = 0; i <= 15; i++) {
			try {
				driver.findElement(
						By.xpath("//span[text()='" + jsonData.readReferancedata() + "']/ancestor::tr/td[1]/button"))
						.click();
				break;
			} catch (Exception e) {
				if (i == 15) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on approve button to approve the record$")
	public void click_on_approve_button_to_approve_the_record() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerApproveButton(), 10, 1);
		checkerObj.checkerApproveButton().click();
	}

	@And("^enter the remark in alert tab$")
	public void enter_the_remark_in_alert_tab() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerAlertRemark(), 10, 1);
		checkerObj.checkerAlertRemark().click();
		checkerObj.checkerAlertRemark().sendKeys(checkerUserTestData.CheckerApproveRemark);
	}

	@And("^click on approve button in alert box$")
	public void click_on_approve_button_in_alert_box() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerAlertApprove(), 10, 1);
		checkerObj.checkerAlertApprove().click();
	}

	@Then("^verify record is approved in checker stage$")
	public void verify_record_is_approved_in_checker_stage() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerConfirmationPopUp(), 10, 1);

		Assert.assertEquals(checkerObj.checkerConfirmationPopUp().getText(), "Record APPROVED Successfully");
	}
	
	   @And("^click on reject button to reject the record$")
    public void click_on_reject_button_to_reject_the_record() throws Throwable {
		   waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerRejectButton(), 10, 1);
			checkerObj.checkerRejectButton().click();
    }

    @And("^enter the remark in alert tab fo rejection$")
    public void enter_the_remark_in_alert_tab_fo_rejection() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerAlertRemark(), 10, 1);
		checkerObj.checkerAlertRemark().click();
		checkerObj.checkerAlertRemark().sendKeys(checkerUserTestData.CheckerRejectRemark);
    }

    @And("^click on reject button in alert box$")
    public void click_on_reject_button_in_alert_box() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerAlertRejectButton(), 10, 1);
		checkerObj.checkerAlertRejectButton().click();
    }
    @Then("^verify record is rejected in checker stage$")
    public void verify_record_is_rejected_in_checker_stage() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerConfirmationPopUp(), 10, 1);

		Assert.assertEquals(checkerObj.checkerConfirmationPopUp().getText(), "Record REJECTED Successfully");
        //Record REJECTED Successfully
    }
    @Then("^verify record is return in checker stage$")
    public void verify_record_is_return_in_checker_stage() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerConfirmationPopUp(), 10, 1);

    	Assert.assertTrue(checkerObj.checkerConfirmationPopUp().getText()
				.contains("Record RETURNED Successfully"));
    }

    @And("^click on return button to return the record$")
    public void click_on_return_button_to_return_the_record() throws Throwable {
    	   waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerReturnButton(), 10, 1);
    				checkerObj.checkerReturnButton().click();	
    }

    @And("^enter the remark in alert tab fo return$")
    public void enter_the_remark_in_alert_tab_fo_return() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerAlertRemark(), 10, 1);
		checkerObj.checkerAlertRemark().click();
		checkerObj.checkerAlertRemark().sendKeys(checkerUserTestData.CheckerReturnRemark);        
    }

    @And("^click on return button in alert box$")
    public void click_on_return_button_in_alert_box() throws Throwable {
    	waitHelper.waitForElementToVisibleWithFluentWait(driver, checkerObj.checkerAlertReturnButton(), 10, 1);
		checkerObj.checkerAlertReturnButton().click();
		checkerObj.checkerAlertReturnButton().sendKeys(checkerUserTestData.CheckerRejectRemark);
    }

}
