package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asset_AutoMaster_Obj {

	WebDriver driver;
	public Asset_AutoMaster_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//**********************************************Asset Modal Master ****************************************************//
	
	
    @FindBy(xpath="//ion-label[contains(text(),'Asset Auto Master')]/parent::ion-item[1]/ion-buttons[1]/ion-button[1]")
    private WebElement asset_AutoMaster_Edit;
    public WebElement asset_AutoMaster_Edit() {
        return asset_AutoMaster_Edit;
    }
    @FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]") 
    private WebElement asset_AutoMaster_Temp_Edit;
    public WebElement asset_AutoMaster_Temp_Edit() {
        return asset_AutoMaster_Temp_Edit;
    }  
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement asset_AutoMaster_Add_Icon;

	public WebElement asset_AutoMaster_Add_Icon() {
		return asset_AutoMaster_Add_Icon;
	}
    @FindBy(xpath="//ion-label[contains(text(),'Asset Model Master')]//parent::ion-segment-button")
    private WebElement assetModelMaster;
    public WebElement assetModelMaster() {
        return assetModelMaster;
    }
    @FindBy(xpath="//ion-label[text()=' Asset Model ']/following-sibling::ion-input/child::input")
    private WebElement assetModel;
    public WebElement assetModel() {
        return assetModel;
    }
    @FindBy(xpath="//ion-label[text()=' Model Year ']/following-sibling::ion-input/child::input")
    private WebElement modelYear;
    public WebElement modelYear() {
        return modelYear;
    }
    @FindBy(xpath="//ion-label[text()=' Volume Of Engine ']/following-sibling::ion-input/child::input")
    private WebElement volumeOfEngine;
    public WebElement volumeOfEngine() {
        return volumeOfEngine;
    }
    @FindBy(xpath="//ion-label[text()=' Down Payment % ']/following-sibling::ion-input/child::input")
    private WebElement downPaymentPercentage;
    public WebElement downPaymentPercentage() {
        return downPaymentPercentage;
    }
    @FindBy(xpath="//ion-label[text()=' Residual Value % ']/following-sibling::ion-input/child::input")
    private WebElement residualValuePercentage;
    public WebElement residualValuePercentage() {
        return residualValuePercentage;
    }
    @FindBy(xpath="//ion-label[text()=' Remarks ' ]/following-sibling::ion-textarea//child::textarea")
    private WebElement remarksInAssetModelMaster;
    public WebElement remarksInAssetModelMaster() {
        return remarksInAssetModelMaster;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Asset Model Type *']")
    private WebElement assetModelType;
    public WebElement assetModelType() {
        return assetModelType;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Asset Condition *']")
    private WebElement assetCondition;
    public WebElement assetCondition() {
        return assetCondition;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Drivetrain ']")
    private WebElement driveTrain;
    public WebElement driverTrain() {
        return driveTrain;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Country *']")
    private WebElement countryInAssetModelMaster;
    public WebElement countryInAssetModelMaster() {
        return countryInAssetModelMaster;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  No Of Cylinder *']")
    private WebElement noOfCylinder;
    public WebElement noOfCylinder() {
        return noOfCylinder;
    }
}
