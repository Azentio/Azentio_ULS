package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataProvider.ConfigFileReader;
import dataProvider.JsonConfig;
import helper.ClicksAndActionsHelper;
import helper.JavascriptHelper;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import pageobjects.CustomerEntityLayoutConvReferenceScreenObj;
import resources.BaseClass;
import resources.ExcelData;
import resources.FindFieldisMandatoryorNot;
import resources.JsonDataReaderWriter;
import testDataType.CustomerEntityReferanceListTestdata;
import testDataType.KULS_Login_TestDataType;

public class CustomerEntity_ReferanceList extends BaseClass {

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
	CustomerEntityLayoutConvReferenceScreenObj Referance_Obj = new CustomerEntityLayoutConvReferenceScreenObj(driver);
	//CustomerEntityReferanceListTestdata Refedata = jsonConfig.getCustomerRefByName("Referance");
	ExcelData exceldata = new ExcelData("C:\\Users\\inindc00075\\Downloads\\UlsTestDataDesign.xlsx",
			"Conv-ReferenceListTestdata", "Data Set ID");
	Map<String, String> testdata;
	
	
	
	@And("^user click on Referance List view Add icon$")
	public void user_click_on_referance_list_view_add_icon() throws Throwable {

		//waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_add_icon(), 60, 2);
		javaHelper.scrollIntoView(Referance_Obj.References_add_icon());
		Assert.assertTrue(Referance_Obj.References_add_icon().isDisplayed());
		for (int i = 0; i < 20; i++) {
			try {
				Referance_Obj.References_add_icon().click();
				break;
			} catch (Exception e) {
				if (i==20) {
					
				}
			}
		}
		
	}

	@And("^user verify the Relationship type field and choose the value$")
	public void user_verify_the_relationship_type_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Relationship_Type(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Relationship_Type().isDisplayed());
		String type = Referance_Obj.References_Relationship_Type().getAttribute("aria-haspopup");
		Assert.assertEquals(type, "listbox");
		Referance_Obj.References_Relationship_Type().click();
		String xpath = "//ion-label[contains(text(),'"+testdata.get("RelationshipType")+"')]/parent::ion-item//ion-radio";
		for (int i = 0; i < 40; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if (i==40) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user verify the Salutation field and choose the value$")
	public void user_verify_the_salutation_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Salutation(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Salutation().isDisplayed());
		String type = Referance_Obj.References_Salutation().getAttribute("aria-haspopup");
		Assert.assertEquals(type, "listbox");
		Referance_Obj.References_Salutation().click();
		String xpath = "//ion-label[contains(text(),'"+testdata.get("Salutation")+"')]/parent::ion-item//ion-radio";
		for (int i = 0; i < 40; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if (i==40) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user verify the First Name field and choose the value$")
	public void user_verify_the_first_name_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_First_Name(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_First_Name().isDisplayed());
		String type = Referance_Obj.References_First_Name().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_First_Name().click();
		Referance_Obj.References_First_Name().sendKeys(testdata.get("FirstName"));
	}

	@And("^user verify the Middle Name field and choose the value$")
	public void user_verify_the_middle_name_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Middle_Name(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Middle_Name().isDisplayed());
		String type = Referance_Obj.References_Middle_Name().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_Middle_Name().click();
		Referance_Obj.References_Middle_Name().sendKeys(testdata.get("MiddleName"));
	}

	@And("^user verify the Last Name field and choose the value$")
	public void user_verify_the_last_name_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Last_Name(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Last_Name().isDisplayed());
		String type = Referance_Obj.References_Last_Name().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_Last_Name().click();
		Referance_Obj.References_Last_Name().sendKeys(testdata.get("LastName"));
	}

	@And("^user verify the Customer Full Name field and choose the value$")
	public void user_verify_the_customer_full_name_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Customer_Full_Name(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Customer_Full_Name().isDisplayed());
		String type = Referance_Obj.References_Customer_Full_Name().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_Customer_Full_Name().click();
		Referance_Obj.References_Customer_Full_Name().sendKeys(testdata.get("FullName"));
	}

	@And("^user verify the Identification type field and choose the value$")
	public void user_verify_the_identification_type_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Identification_Type(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Identification_Type().isDisplayed());
		String type = Referance_Obj.References_Identification_Type().getAttribute("aria-haspopup");
		Assert.assertEquals(type, "listbox");
		Referance_Obj.References_Identification_Type().click();
		String xpath = "//ion-label[contains(text(),'"+testdata.get("IdentificationType")+"')]/parent::ion-item//ion-radio";
		for (int i = 0; i < 40; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if (i==40) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^user verify the Identification Number field and choose the value$")
	public void user_verify_the_identification_number_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Identification_Number(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Identification_Number().isDisplayed());
		String type = Referance_Obj.References_Identification_Number().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_Identification_Number().click();
		Referance_Obj.References_Identification_Number().sendKeys(testdata.get("IdentificationNumber"));
	}

	@And("^user verify the Residental Address field and choose the value$")
	public void user_verify_the_residental_address_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Residence_Address(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Residence_Address().isDisplayed());
		String type = Referance_Obj.References_Residence_Address().getAttribute("type");
		Assert.assertEquals(type, "textarea");
		Referance_Obj.References_Residence_Address().click();
		Referance_Obj.References_Residence_Address().sendKeys(testdata.get("ReferencesResidenceAddress"));
	}

	@And("^user verify the Office Address field and choose the value$")
	public void user_verify_the_office_address_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Office_Address(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Office_Address().isDisplayed());
		String type = Referance_Obj.References_Office_Address().getAttribute("type");
		Assert.assertEquals(type, "textarea");
		Referance_Obj.References_Office_Address().click();
		Referance_Obj.References_Office_Address().sendKeys(testdata.get("ReferencesOfficeAddress"));
	}

	@And("^user verify the Contact Number field and choose the value$")
	public void user_verify_the_contact_number_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Contact_Number(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Contact_Number().isDisplayed());
		String type = Referance_Obj.References_Contact_Number().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_Contact_Number().click();
		Referance_Obj.References_Contact_Number().sendKeys(testdata.get("ReferencesContactNumber"));
	}

	@And("^user verify the Office phone Number field and choose the value$")
	public void user_verify_the_office_phone_number_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Office_Phone_Number(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Office_Phone_Number().isDisplayed());
		String type = Referance_Obj.References_Office_Phone_Number().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_Office_Phone_Number().click();
		Referance_Obj.References_Office_Phone_Number().sendKeys(testdata.get("OfficePhoneNumber"));
	}

	@And("^user verify the Primary Mobile Number field and choose the value$")
	public void user_verify_the_primary_mobile_number_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Primary_Mobile_Number(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Primary_Mobile_Number().isDisplayed());
		String type = Referance_Obj.References_Primary_Mobile_Number().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_Primary_Mobile_Number().click();
		Referance_Obj.References_Primary_Mobile_Number().sendKeys(testdata.get("PrimaryNumber"));
	}

	@And("^user verify the Alternative Mobile Number field and choose the value$")
	public void user_verify_the_alternative_mobile_number_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Primary_Alternative_Number(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Primary_Alternative_Number().isDisplayed());
		String type = Referance_Obj.References_Primary_Alternative_Number().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_Primary_Alternative_Number().click();
		Referance_Obj.References_Primary_Alternative_Number().sendKeys(testdata.get("AlternativeNumber"));
	}

	@And("^user verify the Email Id field and choose the value$")
	public void user_verify_the_email_id_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_Email_Id(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_Email_Id().isDisplayed());
		String type = Referance_Obj.References_Email_Id().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_Email_Id().click();
		Referance_Obj.References_Email_Id().sendKeys(testdata.get("Email"));
	}

	@And("^user verify the No of years Known field and choose the value$")
	public void user_verify_the_no_of_years_known_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_No_of_Years_Known(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_No_of_Years_Known().isDisplayed());
		String type = Referance_Obj.References_No_of_Years_Known().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_No_of_Years_Known().click();
		Referance_Obj.References_No_of_Years_Known().sendKeys(testdata.get("NoofYearsKnowns"));
	}

	@And("^user verify the CIF Number field and choose the value$")
	public void user_verify_the_cif_number_field_and_choose_the_value() throws Throwable {
		waitHelper.waitForElementToVisibleWithFluentWait(driver, Referance_Obj.References_CIF_Number(), 60, 2);
		Assert.assertTrue(Referance_Obj.References_CIF_Number().isDisplayed());
		String type = Referance_Obj.References_CIF_Number().getAttribute("type");
		Assert.assertEquals(type, "text");
		Referance_Obj.References_CIF_Number().click();
		Referance_Obj.References_CIF_Number().sendKeys(testdata.get("CIFnumber"));
	}
	
	@And("^user update the Excelsheet Testdata for Verification$")
	public void user_update_the_Excelsheet_Testdata_for_Verification() throws Throwable{
		testdata=exceldata.getTestdata("AT_CLID_002_D1");
	}

}
