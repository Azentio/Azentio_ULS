package helper;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonHelper {
	private WebDriver driver;
	Logger Log = LogManager.getLogger(RadioButtonHelper.class.getName());

	// wait helper constrcutor
	public RadioButtonHelper(WebDriver driver) {
		this.driver = driver;
		
	}

	// RadioButton 
	public void radioButton(String element) {
		while (true) {
			try {
				driver.findElement(By.xpath("//ion-label[contains(text(),'" + element + "')]/../ion-radio")).click();
				break;
			} catch (Exception e) {

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