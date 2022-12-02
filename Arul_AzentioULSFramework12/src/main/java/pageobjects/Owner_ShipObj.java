package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Owner_ShipObj {
	WebDriver driver;
	public Owner_ShipObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement inboxbuttonForOwnerShip;
	public WebElement inboxbuttonForOwnerShip() {
		return inboxbuttonForOwnerShip;
	}
	@FindBy(xpath="//ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/button[1]")
	private WebElement searchbuttonForOwnerShip;
	public WebElement searchbuttonForOwnerShip() {
		   return searchbuttonForOwnerShip;
	}
	@FindBy(xpath="//ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]") 
	private WebElement searchiconForOwnerShip;
	public WebElement searchiconForOwnerShip() {
		   return searchiconForOwnerShip;
	}

	@FindBy(xpath="//td[text()=' APPDATAENT ']/parent::tr//button")
	private WebElement EntitleiconForOwnerShip;
	public WebElement EntitleiconForOwnerShip() {
		return EntitleiconForOwnerShip;
	}

	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElement NextForOwnerShip;
	public WebElement NextForOwnerShip() {
		return NextForOwnerShip;
	}
	@FindBy(xpath="//ion-segment-button[@id='seg12']")
	private WebElement Owenershiptab;
	public WebElement Owenershiptab() {
		return Owenershiptab;
	}
	@FindBy(xpath="//ion-label[text()=' Owner/Power Of Attorney Details ']/ancestor::digital-select-layout//parent::ion-col//ion-badge")
	private WebElement owenerPowerOfAttorneyDetailsForRequiredFieldText;
	public WebElement owenerPowerOfAttorneyDetailsForRequiredFieldText() {
		return owenerPowerOfAttorneyDetailsForRequiredFieldText;
	}
	@FindBy(xpath="//ion-label[text()=' Name ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement nameForRequiredFieldText;
	public WebElement nameForRequiredFieldText() {
		return nameForRequiredFieldText;
	}
	@FindBy(xpath="//ion-label[text()=' Id Type ']/ancestor::digital-select-layout//parent::ion-col//ion-badge")
	private WebElement idTypeForRequiredFieldText;
	public WebElement idTypeForRequiredFieldText() {
		return idTypeForRequiredFieldText;
	}
	@FindBy(xpath="//ion-label[text()=' Id Number ']/ancestor::digital-text-box//parent::ion-col//ion-badge") 
	private WebElement idNumberForRequiredField;
	public WebElement idNumberForRequiredField() {
		return idNumberForRequiredField;
	}
	@FindBy(xpath="//ion-label[text()=' Issue Place ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
	private WebElement IssuePlaceForRequiredField;
    public WebElement IssuePlaceForRequiredField() {
    	return IssuePlaceForRequiredField;
    }
    @FindBy(xpath="//ion-label[text()=' Mobile ']/ancestor::digital-text-box//parent::ion-col//ion-badge")
    private WebElement MobileForRequiredField;
    public WebElement MobileForRequiredField() {
    	return MobileForRequiredField;
    }
    @FindBy(xpath="//ion-label[text()=' Issue Date ']/ancestor::digital-prime-date//parent::ion-col//ion-badge")
    private WebElement issueDateForRequiredField;
    public WebElement issueDateForRequiredField() {
    	return issueDateForRequiredField;
    }
	@FindBy(xpath="//button[@ng-reflect-text='Update']")
	private WebElement savebuttonForRequiredField;
	public WebElement savebuttonForRequiredField() {
		return savebuttonForRequiredField;
	}
	@FindBy(xpath = "//ion-label[text()=' Owner/Power Of Attorney Details ']//following-sibling::ion-select")
	private WebElement OwnerDropdown1;
	public WebElement OwnerDropdown() {
		return OwnerDropdown1;
	}
	@FindBy(xpath = "//ion-label[text()=' Name ']//following-sibling::ion-input/input")
	private WebElement Name1;
	public WebElement Name() {
		return Name1;
	}
	@FindBy(xpath = "//ion-label[text()=' Name ']//following-sibling::ion-input")
	private WebElement nameText;
	public WebElement nameText() {
		return nameText;
	}
	@FindBy(xpath = "//ion-label[text()=' Id Number ']//following-sibling::ion-input/input")
	private WebElement IDNumber1;
	public WebElement IDNumber() {
		return IDNumber1;
	}
	@FindBy(xpath = "//ion-label[text()=' Id Number ']//following-sibling::ion-input")
	private WebElement IDNumberText;
	public WebElement IDNumberText() {
		return IDNumberText;
	}
	@FindBy(xpath = "//ion-label[text()=' Issue Place ']//following-sibling::ion-input/input")
	private WebElement IssuePlace1;
	public WebElement IssuePlace() {
		return IssuePlace1;
	}
	@FindBy(xpath = "//ion-label[text()=' Issue Place ']//following-sibling::ion-input")
	private WebElement IssuePlaceText;
	public WebElement IssuePlaceText() {
		return IssuePlaceText;
	}
	@FindBy(xpath = "//ion-label[text()=' Mobile ']//following-sibling::ion-input/input")
	private WebElement Mobile1;
	public WebElement Mobile() {
		return Mobile1;
	}
	@FindBy(xpath = "//ion-label[text()=' Mobile ']//following-sibling::ion-input")
	private WebElement mobileText;
	public WebElement mobileText() {
		return mobileText;
	}
	@FindBy(xpath = "//ion-label[text()=' Phone ']//following-sibling::ion-input/input")
	private WebElement Phone1;
	public WebElement Phone() {
		return Phone1;
	}
	@FindBy(xpath = "//ion-label[text()=' Phone ']//following-sibling::ion-input")
	private WebElement phoneText;
	public WebElement phoneText() {
		return phoneText;
	}
	@FindBy(xpath = "//ion-label[text()=' Mobile 2 ']//following-sibling::ion-input/input")
	private WebElement Mobile21;
	public WebElement Mobile2() {
		return Mobile21;
	}
	@FindBy(xpath = "//ion-label[text()=' Mobile 2 ']//following-sibling::ion-input")
	private WebElement Mobile2Text;
	public WebElement Mobile2Text() {
		return Mobile2Text;
	}
	@FindBy(xpath = "//ion-label[text()=' Fax ']//following-sibling::ion-input/input")
	private WebElement Fax1;
	public WebElement Fax() {
		return Fax1;
	}
	@FindBy(xpath = "//ion-label[text()=' Email ']//following-sibling::ion-input/input")
	private WebElement Email1;
	public WebElement Email() {
		return Email1;
	}
	@FindBy(xpath = "//ion-label[text()=' Id Type ']//following-sibling::ion-select")
	private WebElement IDTypeDropdown1;
	public WebElement IDTypeDropdown() {
		return IDTypeDropdown1;
	}
	@FindBy(xpath = "//ion-label[text()=' City ']//following-sibling::ion-select")
	private WebElement City1;
	public WebElement City() {
		return City1;
	}
	@FindBy(xpath = "//ion-label[text()=' Issue Date ']//ancestor::ion-item//button")
	private WebElement IssueDate1;
	public WebElement IssueDate() {
		return IssueDate1;
	}
	@FindBy(xpath = "//span[text()='Clear']/parent::button")
	private WebElement clearbuttonIncalendar;
	public WebElement clearbuttonIncalendar() {
		return clearbuttonIncalendar;
	}
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	private WebElement previousbuttonIncalendar;
	public WebElement previousbuttonIncalendar() {
		return previousbuttonIncalendar;
	}
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]")
	private WebElement nextbuttonIncalendar;
	public WebElement nextbuttonIncalendar() {
		return nextbuttonIncalendar;
	}
	@FindBy(xpath = "//button[@ng-reflect-text='Update']")
	private WebElement savebutton1;
	public WebElement savebutton() {
		return savebutton1;
	}
	@FindBy(xpath="//ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
	private WebElement Application_DetailTab_SearchText1;
	public  WebElement Application_DetailTab_SearchText() {
		return Application_DetailTab_SearchText1;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Search']")
	private WebElement Application_DetailTab_SearchButtons1;
	public  WebElement Application_DetailTab_SearchButtons() {
		return Application_DetailTab_SearchButtons1;
	}
	@FindBy(xpath = "//td[text()=' APPDATAENT ']//preceding-sibling::td[3]/button")
	private WebElement AppDataEntry_ActionIcon;
	public WebElement AppDataEntry_ActionIcon() {
		return AppDataEntry_ActionIcon;
	}
	
	

}
