package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import dataProvider.JsonReader;
import pageobjects.KUBS_LoginObj;

import testDataType.KUBS_LoginTestDataType;

public class KUBS_Login {


		WebDriver drive;
		// String user;
		JsonReader reader = new JsonReader();
		KUBS_LoginObj login;

		public KUBS_Login(WebDriver drive) {
			this.drive = drive;
		}

		////input[@id='otp_5_fgick8bje0kkwzyzp0z']
		public void loginToAzentioApp(String user) {
			String before_xpath = "//input[@id='otp_";
			String after_xpath = "_fgick8bje0kkwzyzp0z']";

			KUBS_LoginTestDataType logindata = reader.getLoginCredentialsByName(user);
			login = new KUBS_LoginObj(drive);
			login.userName().sendKeys(logindata.UserName);
			login.goButton().click();
			login.passWord().sendKeys(logindata.Password);
			String otp = login.getOtp().getText();
			for (int i = 0; i <= 5; i++) {
				int start = i + 7;
				drive.findElement(By.xpath(before_xpath + i + after_xpath)).sendKeys(otp.substring(start, start + 1));
			}
			login.signIn().click();
			login.loginStatus().isDisplayed();
		}
	}



