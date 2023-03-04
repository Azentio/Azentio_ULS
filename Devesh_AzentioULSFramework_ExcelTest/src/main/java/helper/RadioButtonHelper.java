package helper;

import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.Iterator;
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
	JavascriptHelper javaScriptHelper = new JavascriptHelper(driver);
	public RadioButtonHelper(WebDriver driver) {
		this.driver = driver;
	}
	// RadioButton 
	public void radioButton(String element){
		for (int i = 0; i < 50; i++) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + element + "')]/../ion-radio")).click();
				break;
			} catch (Exception e) {
				try {
					driver.findElement(By.xpath("//ion-label[text()=' " + element + " ']/../ion-radio")).click();
					break;
				} catch (Exception e1) {
					try {
						driver.findElement(By.xpath("//ion-label[text()='" + element + " ']/../ion-radio")).click();
						break;
					} catch (Exception e2) {

					}
				}

			}
		}
	}
	// SelectOptionFromDropDown 
	public void selectOptionFromDropDown(List<WebElement> options, String value) {
		for (WebElement option : options) {
			if(option.getText().contains(value)) {
				option.click();
				break;
			}
		}
	}
    
}