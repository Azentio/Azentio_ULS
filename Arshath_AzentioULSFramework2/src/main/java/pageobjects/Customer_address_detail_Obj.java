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
	
	
	@FindBy(xpath="//ion-title[text()=' Address Details ']/ancestor::ion-card//button[@ng-reflect-text='Add']")
	private WebElement Address_Add_Icon;
	public WebElement Address_Add_Icon() {
		return Address_Add_Icon;
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
		
	@FindBy(xpath="//ion-label[text()=' Address Line 1 ']/parent::ion-item//input")
	private WebElement Address_Address_Line_1;
	public WebElement Address_Address_Line_1() {
		return Address_Address_Line_1;
	}
	
	@FindBy(xpath="//ion-label[text()=' Address Line 2 ']/parent::ion-item//input")
	private WebElement Address_Address_Line_2;
	public WebElement Address_Address_Line_2() {
		return Address_Address_Line_2;
	}
	
	@FindBy(xpath="//ion-label[text()=' Country ']/parent::ion-item//ion-select")
	private WebElement Address_Country;
	public WebElement Address_Country() {
		return Address_Country;
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
	
	@FindBy(xpath="//ion-label[text()=' Zip Code ']/parent::ion-item//input")
	private WebElement Address_Zip_Code;
	public WebElement Address_Zip_Code() {
		return Address_Zip_Code;
	}
	
	@FindBy(xpath="//ion-label[text()=' PO BOX number ']/parent::ion-item//input")
	private WebElement Address_PO_BOX_number;
	public WebElement Address_PO_BOX_number() {
		return Address_PO_BOX_number;
	}
	 
	@FindBy(xpath="//ion-label[text()=' Neighbourhood/District Name ']/parent::ion-item//input")
	private WebElement Address_Neighbourhood_District_Name ;
	public WebElement Address_Neighbourhood_District_Name() {
		return Address_Neighbourhood_District_Name;
	}
	 
	@FindBy(xpath="//ion-label[text()=' Mobile Number (Primary) ']/parent::ion-item//input")
	private WebElement Address_Mobile_Number;
	public WebElement Address_Mobile_Number() {
		return Address_Mobile_Number;
	}
	  	
	 @FindBy(xpath="//ion-label[text()=' Duration of Stay ']/parent::ion-item//input")
	 private WebElement Address_Duration_of_Stay;
	 public WebElement Address_Duration_of_Stay() {
			return Address_Duration_of_Stay;
	 }
	 @FindBy(xpath="//ion-label[text()=' Latitude details of the address ']/parent::ion-item//input")
	 private WebElement Address_Latitude_details_of_the_address;
	 public WebElement Address_Latitude_details_of_the_address() {
			return Address_Latitude_details_of_the_address;
	 }
	 @FindBy(xpath="//ion-label[text()=' Longitude details of the address ']/parent::ion-item//input")
	 private WebElement Address_Longitude_details_of_the_address;
	 public WebElement Address_Longitude_details_of_the_address() {
			return Address_Longitude_details_of_the_address;
	 }	
	 @FindBy(xpath="//ion-label[text()=' Land Mark ']/parent::ion-item//input")
	 private WebElement Address_Land_Mark;
	 public WebElement Address_Land_Mark() {
			return Address_Land_Mark;
	 }	
	 
	 @FindBy(xpath="//ion-label[text()=' Occupancy date ']/ancestor::ion-item//button")
	 private WebElement Address_Occupancy_date;
	 public WebElement Address_Occupancy_date() {
			return Address_Occupancy_date;
	 }		 
	
	 @FindBy(xpath="//ion-label[text()=' Landlord Name ']/parent::ion-item//input")
	 private WebElement Address_Landlord_Name;
	 public WebElement Address_Landlord_Name() {
			return Address_Landlord_Name;
	 }	 
	 	
	 @FindBy(xpath="//ion-label[text()=' Landlord Mobile Number ']/parent::ion-item//input")
	 private WebElement Address_Landlord_Mobile_Number;
	 public WebElement Address_Landlord_Mobile_Number() {
			return Address_Landlord_Mobile_Number;
	 }		
	 
	 @FindBy(xpath="//ion-label[text()=' Rent Amount ']/parent::ion-item//input")
	 private WebElement Address_Rent_Amount;
	 public WebElement Address_Rent_Amount() {
			return Address_Rent_Amount;
	 }	
	 
	 @FindBy(xpath="//ion-label[text()=' Frequency of rent ']/parent::ion-item//ion-select")
	 private WebElement Address_Frequency_of_rent;
	 public WebElement Address_Frequency_of_rent() {
			return Address_Frequency_of_rent;
	 } 
	
	
	
	
	
	
	
	
	
	
	
	
	
}