package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dataProvider.JsonConfig;

import pageobjects.KUBS_LoginObj;

import testDataType.KUBS_LoginTestDataType;

public class KUBS_Login {

	WebDriver driver;
	
	JsonConfig reader = new JsonConfig();
	KUBS_LoginObj login;

	public KUBS_Login(WebDriver driver) {
		this.driver = driver;
	}

	public void loginToAzentioApp(String user) {
		String before_xpath = "//input[@id='otp_";
		String after_xpath = "_fgick8bje0kkwzyzp0z']";

		KUBS_LoginTestDataType logindata = reader.getLoginCredentialsByName(user);
		login = new KUBS_LoginObj(driver);
		login.Login_userName().sendKeys(logindata.UserName);
		login.Login_goButton().click();
		login.Login_passWord().sendKeys(logindata.Password);
		String otp = login.Login_getOtp().getText();
		for (int i = 0; i <= 5; i++) {
			int start = i + 7;
			driver.findElement(By.xpath(before_xpath + i + after_xpath)).sendKeys(otp.substring(start, start + 1));
		}
		login.Login_signIn().click();
		login.Login_loginStatus().isDisplayed();
	}
}
