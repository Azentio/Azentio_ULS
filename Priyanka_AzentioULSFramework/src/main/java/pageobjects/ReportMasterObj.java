package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportMasterObj {
	WebDriver driver;

	public ReportMasterObj(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ion-label[contains(text(),'Config Manager')]")
	private WebElement reportMaster_ConfigManager;

	public WebElement reportMaster_ConfigManager() {
		return reportMaster_ConfigManager;
	}

	@FindBy(xpath = "(//li[3]//ion-icon[1])[1]")
	private WebElement reportMasterConfigurations;

	public WebElement reportMasterConfigurations() {
		return reportMasterConfigurations;

	}

	@FindBy(xpath = "//ion-label[contains(text(),'Report Master')]/following-sibling::ion-buttons/ion-button[1]")
	private WebElement reportMaster_WorkInProgressRecordsButton;

	public WebElement reportMaster_WorkInProgressRecordsButton() {
		return reportMaster_WorkInProgressRecordsButton;

	}

	@FindBy(xpath = "//ion-label[contains(text(),'Report Master')]/following-sibling::ion-buttons/ion-button[2]")
	private WebElement reportMaster_CheckBOX;

	public WebElement reportMaster_CheckBOX() {
		return reportMaster_CheckBOX;

	}


	//Search Icon
	@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
	private WebElement reportMaster_SearchIcon;

	public WebElement reportMaster_SearchIcon() {
		return reportMaster_SearchIcon;
	}
	// search input field
		@FindBy(xpath = "//div/span/input")
		private WebElement reportMaster_SearchInputField;

		public WebElement reportMaster_SearchInputField() {
			return reportMaster_SearchInputField;
		}

		// search close button
		@FindBy(xpath = "//div/span/i")
		private WebElement reportMaster_SearchCloseButton;

		public WebElement reportMaster_SearchCloseButton() {
			return reportMaster_SearchCloseButton;
		}

		// list view first field of Report Name
		@FindBy(xpath = "//tbody/tr[1]/td[3]/p-celleditor[1]/span[1]")
		private WebElement reportMaster_ListViewFirstField_ReportName;

		public WebElement reportMaster_ListViewFirstField_ReportName() {
			return reportMaster_ListViewFirstField_ReportName;
		}

		// list view icon
		@FindBy(xpath = "//tbody/tr[1]/td[1]/span[1]/button[1]/span[1]")
		private WebElement reportMaster_ListView_ViewIcon;

		public WebElement reportMaster_ListView_ViewIcon() {
			return reportMaster_ListView_ViewIcon;
		}

		// Report Group Master Segment button
		@FindBy(xpath = "//ion-segment-button[@id='seg2']")
		private WebElement reportGroupMaster_SegmentButton;

		public WebElement reportGroupMaster_SegmentButton() {
			return reportGroupMaster_SegmentButton;
		}
		
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement reportMaster_addButton;

	public WebElement reportMaster_addButton() {
		return reportMaster_addButton;

	}

//		report parameter details add button 

	@FindBy(xpath = "(//button[@ng-reflect-text='Add'])[2]")
	private WebElement reportMaster_addButton2;

	public WebElement reportMaster_addButton2() {
		return reportMaster_addButton2;

	}

	@FindBy(xpath = "//ion-row[2]/ion-col[1]/button[1]/span[1]")
	private WebElement reportMaster_BackButton;

	public WebElement reportMaster_BackButton() {
		return reportMaster_BackButton;

	}

//		report group master 

	@FindBy(xpath = "//ion-segment-button[@id='seg2']")
	private WebElement reportMaster_ReportGroupMasterSegmentButton;

	public WebElement reportMaster_ReportGroupMasterSegmentButton() {
		return reportMaster_ReportGroupMasterSegmentButton;

	}
	
	//Group Name
	@FindBy(xpath = "//ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement reportMaster_GroupName;

	public WebElement reportMaster_GroupName() {
		return reportMaster_GroupName;
	}
	
	// Group Description
	@FindBy(xpath = "//ion-col[3]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement reportMaster_GroupDescription;

	public WebElement reportMaster_GroupDescription() {
		return reportMaster_GroupDescription;
	}
	
	
	// Min Parameters Required
	@FindBy(xpath = "//ion-col[4]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
	private WebElement reportMaster_MinParametersRequired;

	public WebElement reportMaster_MinParametersRequired() {
		return reportMaster_MinParametersRequired;
	}
	
	// Picklist
	@FindBy(xpath = "//div[1]/ion-item[1]/p-picklist[1]/div[1]/div[3]/button[2]/span[1]")
	private WebElement reportMaster_Picklist;

	public WebElement reportMaster_Picklist() {
		return reportMaster_Picklist;
	}
	// Save Button

	@FindBy(xpath = "//ion-row[2]/ion-col[3]/button[1]")
	private WebElement reportMaster_SaveButton;

	public WebElement reportMaster_SaveButton() {
		return reportMaster_SaveButton;

	}
}
