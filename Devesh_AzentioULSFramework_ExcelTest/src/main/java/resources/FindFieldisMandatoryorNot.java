package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindFieldisMandatoryorNot {
	WebDriver driver;
	public FindFieldisMandatoryorNot(WebDriver driver) {
		this.driver=driver;
	}
	public void verifyGivenFieldisMandatoryOrNot(String fieldName){
		//ion-label[contains(text(),'')]/span
		String pg = "//ion-label[contains(text(),'"+fieldName+"')]/span";
		try {
		if (driver.findElement(By.xpath(pg)).getText().equalsIgnoreCase("*")) {
			System.out.println(fieldName+ " This field have a mandatory asterisk mark");
		}
		}
		catch(Exception e) {
			System.out.println(fieldName+ " This field Not have a mandatory asterisk mark");
		}
		
}
}
