package helper;

import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RadioButtonHelper {
	private WebDriver driver;
	Logger Log = LogManager.getLogger(RadioButtonHelper.class.getName());

	// wait helper constrcutor
	public RadioButtonHelper(WebDriver driver) {
		this.driver = driver;
		
	}

	// RadioButton 
	public void radioButton(String element) {
		driver.findElement(By.xpath("//ion-label[contains(text(),'"+element+"')]/../ion-radio"));
	}
      
}