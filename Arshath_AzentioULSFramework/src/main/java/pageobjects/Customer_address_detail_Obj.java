package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_address_detail_Obj {

	WebDriver driver;

	public Customer_address_detail_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="(//tbody[1]/tr[1]/td[1]/span[1]/button[1])[2]")
	private WebElement Address_Edit_Icon;
	public WebElement Address_Edit_Icon() {
		return Address_Edit_Icon;
	}	
	
	@FindBy(xpath="//ion-segment//ion-label[text()='Additional Customer Info']/parent::ion-segment-button")
	private WebElement Address_Additional_Customer_Info_Tab;
	public WebElement Address_Additional_Customer_Info_Tab() {
		return Address_Additional_Customer_Info_Tab;
	}
	
	@FindBy(xpath="//ion-label[text()=' Address Type ']/parent::ion-item//ion-select")
	private WebElement Address_Address_Type;
	public WebElement Address_Address_Type() {
		return Address_Address_Type;
	}
	
	@FindBy(xpath="//ion-label[text()=' Address Status ']/parent::ion-item//ion-select")
	private WebElement Address_Address_Status;
	public WebElement Address_Address_Status() {
		return Address_Address_Status;
	}
	
	@FindBy(xpath="//ion-label[text()=' Residential or Occupancy Status ']/parent::ion-item//ion-select")
	private WebElement Address_Residential_or_Occupancy_Status;
	public WebElement Address_Residential_or_Occupancy_Status() {
		return Address_Residential_or_Occupancy_Status;
	}
	
	@FindBy(xpath="//ion-label[text()=' Province id ']/parent::ion-item//ion-select")
	private WebElement Address_Province_id;
	public WebElement Address_Province_id() {
		return Address_Province_id;
	}
	
	@FindBy(xpath="//ion-label[text()=' City id ']/parent::ion-item//ion-select")
	private WebElement Address_City_id;
	public WebElement Address_City_id() {
		return Address_City_id;
	}
	
	
}
