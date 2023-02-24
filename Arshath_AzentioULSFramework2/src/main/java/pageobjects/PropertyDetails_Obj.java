package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PropertyDetails_Obj {

	WebDriver driver;
	public PropertyDetails_Obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-segment//ion-label[text()='Property Details']/parent::ion-segment-button")
	private WebElement Property_Details_Tab;
	public WebElement Property_Details_Tab() {
		return Property_Details_Tab;
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/span[1]/button[1]")
	private WebElement Property_Details_Edit;
	public WebElement Property_Details_Edit()
	{ 
		return Property_Details_Edit;
	}
	//ion-select[@aria-label=' Primary Collateral ,  Security Type *']
	
	@FindBy(xpath="//ion-label[text()=' Security Type ']/parent::ion-item//ion-select")
	private WebElement Property_Details_Security_Type;
	public WebElement Property_Details_Security_Type()
	{ 
		return Property_Details_Security_Type;
	}
	
	@FindBy(xpath="//ion-label[text()=' Property City ']/parent::ion-item//ion-select")
	private WebElement Property_Details_Property_City;
	public WebElement Property_Details_Property_City()
	{ 
		return Property_Details_Property_City;
	}
	
	@FindBy(xpath="//ion-label[text()=' Property Type ']/parent::ion-item//ion-select")
	private WebElement Property_Details_Property_Type;
	public WebElement Property_Details_Property_Type()
	{ 
		return Property_Details_Property_Type;
	}
	
	@FindBy(xpath="//ion-label[text()=' APF Status ']/parent::ion-item//ion-select")
	private WebElement Property_Details_APF_Status;
	public WebElement Property_Details_APF_Status()
	{ 
		return Property_Details_APF_Status;
	}
	
	@FindBy(xpath="//ion-label[text()=' Construction Status ']/parent::ion-item//ion-select")
	private WebElement Property_Details_Construction_Status;
	public WebElement Property_Details_Construction_Status()
	{ 
		return Property_Details_Construction_Status;
	}
	
	@FindBy(xpath="//ion-label[text()=' Property Category ']//following-sibling::ion-select")
	private WebElement Property_Details_Property_Category;
	public WebElement Property_Details_Property_Category()
	{ 
		return Property_Details_Property_Category;
	}
	
	@FindBy(xpath="//ion-label[text()=' Nature of Property ']//following-sibling::ion-select")
	private WebElement Property_Details_Nature_of_Property;
	public WebElement Property_Details_Nature_of_Property()
	{ 
		return Property_Details_Nature_of_Property;
	}
	
	@FindBy(xpath="//ion-label[text()=' Occupancy Status ']//following-sibling::ion-select")
	private WebElement Property_Details_Occupancy_Status;
	public WebElement Property_Details_Occupancy_Status()
	{ 
		return Property_Details_Occupancy_Status;
	}
	
	
	@FindBy(xpath="//button[@ng-reflect-text='Update']")
	private WebElement Property_Details_Update;
	public WebElement Property_Details_Update() {
		return Property_Details_Update;
	}
	
	@FindBy(xpath="//div[@aria-label='Success']")
	private WebElement Property_Details_Alert;
	public WebElement Property_Details_Alert() {
		return Property_Details_Alert;
	}
	
	@FindBy(xpath="//button[text()=' Next']")
	private WebElement Property_Details_Next;
	public WebElement Property_Details_Next() {
		return Property_Details_Next;
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	

