package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectMasterObj {
	WebDriver driver;
	public ProjectMasterObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h4[text()='Project Master']//parent::ion-label//following-sibling::ion-buttons//child::ion-button[2]")
	private WebElement projectMasterViewIcon;
	public WebElement projectMasterViewIcon() {
		return projectMasterViewIcon;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement addIconInProjectMaster;
	public WebElement addIconInProjectMaster() {
		return addIconInProjectMaster;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Project Type *']")
	private WebElement ProjectType;
	public WebElement ProjectType() {
		return ProjectType;
	}
	//ion-label[contains(text(),'NON APF')] select value
	@FindBy(xpath="//ion-select[@aria-label='Select,  Sourcing Branch *']")
	private WebElement SourcingBranch;
	public WebElement SourcingBranch() {
		return SourcingBranch;
	}
	//ion-label[contains(text(),' 164 - TEMA ZONE - ADJIRINGANOR ')]
    @FindBy(xpath="//ion-label[contains(text(),'Project Code')]//following-sibling::ion-input/input")
    private WebElement ProjectCode;
    public WebElement ProjectCode() {
    	return ProjectCode;
    }
    ////ion-label[contains(text(),'AZNE ')]
    @FindBy(xpath="//ion-select[@aria-label='Select,  Builder Group *']")
    private WebElement BuilderGroup;
    public WebElement BuilderGroup() {
    	return BuilderGroup;
    }
    @FindBy(xpath="//ion-label[contains(text(),' Name of the Project ')]//following-sibling::ion-input/input")
    private WebElement nameOfTheProject;
    public WebElement nameOfTheProject() {
    	return nameOfTheProject;
    }
    @FindBy(xpath="//ion-select[@aria-label='Select,  Builder Name *']")
    private WebElement BuilderName;
    public WebElement BuilderName() {
    	return BuilderName;
    }
    
    
    
}
