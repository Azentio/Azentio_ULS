package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppDocumentDetails_Obj {
	WebDriver driver;

	public AppDocumentDetails_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 //************************************************Document Details Parameter ****************************************************************//
	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement addIcon;

	public WebElement addIcon() {
		return addIcon;
	}
	@FindBy(xpath = "//ion-label[text()=' Document Name ']/following-sibling::ion-select")
	private WebElement documentName;

	public WebElement documentName() {
		return documentName;
	}
	@FindBy(xpath = "//ion-label[text()=' Required At Stage ']/following-sibling::ion-select")
	private WebElement requiredAtStage;

	public WebElement requiredAtStage() {
		return requiredAtStage;
	}
	@FindBy(xpath = "//ion-label[text()=' Document Category ']/following-sibling::ion-select")
	private WebElement documentCategory;

	public WebElement documentCategory() {
		return documentCategory;
	}
	@FindBy(xpath = "//ion-label[text()=' Mandatory/Optional ']/following-sibling::ion-select")
	private WebElement mandatoryOrOptional;

	public WebElement mandatoryOrOptional() {
		return mandatoryOrOptional;
	}
	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]/span[1]")
	private WebElement document_TempView_Search;

	public WebElement document_TempView_Search() {
		return document_TempView_Search;
	}
	@FindBy(xpath = "//ion-label[text()=' Document Status ']/following-sibling::ion-select")
	private WebElement documentStatus;

	public WebElement documentStatus() {
		return documentStatus;
	}
	@FindBy(xpath = "//ion-label[text()=' Upload Date ']/ancestor::ion-item//p-calendar//button")
	private WebElement uploadDate;
	public WebElement uploadDate() {
		return uploadDate;
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
	
	@FindBy(xpath = "//ion-label[text()=' Expected Receipt Date ']/ancestor::ion-item//p-calendar//button")
	private WebElement expectedReceiptDate;
	public WebElement expectedReceiptDate() {
		return expectedReceiptDate;
	}
	@FindBy(xpath = "//ion-label[text()=' Deferral Stage ']/following-sibling::ion-select")
	private WebElement deferralStage;

	public WebElement deferralStage() {
		return deferralStage;
	}
	//ion-label[text()=' Def Approved By ']/following-sibling::ion-select
	@FindBy(xpath = "//ion-label[text()=' Def Approved By ']/following-sibling::ion-select")
	private WebElement defApprovedBy;
	public WebElement defApprovedBy() {
		return defApprovedBy;
	}
	@FindBy(xpath = "//ion-label[text()=' Change In Nature Approved By ']/following-sibling::ion-select")
	private WebElement ChangeInNatureApprovedBy;
	public WebElement ChangeInNatureApprovedBy() {
		return ChangeInNatureApprovedBy;
	}
	
	@FindBy(xpath = "//ion-label[text()=' Document Form ']/following-sibling::ion-select")
	private WebElement documentForm;
	public WebElement documentForm() {
		return documentForm;
	}
	@FindBy(xpath = "//ion-label[text()=' Document Quality ']/following-sibling::ion-select")
	private WebElement documentQuality;
	public WebElement documentQuality() {
		return documentQuality;
	}
	@FindBy(xpath = "//ion-label[text()=' Document Received By ']/following-sibling::ion-select")
	private WebElement documentReceivedBy;
	public WebElement documentReceivedBy() {
		return documentReceivedBy;
	}
	@FindBy(xpath = "//ion-label[text()=' Location Where Received ']/following-sibling::ion-select")
	private WebElement locationWhereReceived;
	public WebElement locationWhereReceived() {
		return locationWhereReceived;
	}
	
	@FindBy(xpath = "//ion-label[text()=' Document Reference Number ']/following-sibling::ion-input/input")
	private WebElement documentReferenceNumber;
	public WebElement documentReferenceNumber() {
		return documentReferenceNumber;
	}
	
	@FindBy(xpath = "//ion-label[text()=' Rack No. ']/following-sibling::ion-input/input")
	private WebElement rackNumber;
	public WebElement rackNumber() {
		return rackNumber;
	}
	@FindBy(xpath = "//ion-label[text()=' Shelf No. ']/following-sibling::ion-input/input")
	private WebElement shelfNumber;
	public WebElement shelfNumber() {
		return shelfNumber;
	}
	@FindBy(xpath = "//ion-label[text()=' Box No. ']/following-sibling::ion-input/input")
	private WebElement boxNumber;
	public WebElement boxNumber() {
		return boxNumber;
	}
	//ion-label[text()=' Remark ']/following-sibling::ion-textarea
	@FindBy(xpath = "//ion-label[text()=' Remark ']/following-sibling::ion-textarea//textarea")
	private WebElement remarkInDocumentDetails;
	public WebElement remarkInDocumentDetails() {
		return remarkInDocumentDetails;
	}
	@FindBy(xpath = "//button[@ng-reflect-text='Save']") 
    private WebElement documentDetailsSave;
    public WebElement documentDetailsSave() {
        return documentDetailsSave;
    } 
    @FindBy(xpath="//div[@id='toast-container']//div[@role='alert']")
    private WebElement successMgs;
    public WebElement successMgs() {
    	return successMgs;
    }
	@FindBy(xpath = "//input[@mode='ios']") 
    private WebElement documentDetailsViewSearchText;
    public WebElement documentDetailsViewSearchText() {
        return documentDetailsViewSearchText;
    } 
    @FindBy(xpath = "//input[@mode='ios']/following-sibling::i") 
    private WebElement documentDetailsViewCloseSearchText;
    public WebElement documentDetailsViewCloseSearchText() {
        return documentDetailsViewCloseSearchText;
    } 

	@FindBy(xpath = "//span[text()='Export']/following-sibling::div/span")
	private WebElement exportIcon;

	public WebElement exportIcon() {
		return exportIcon;
	}
	@FindBy(xpath = "//button[@ng-reflect-text='Update']") 
    private WebElement documentDetailsUpdate;
    public WebElement documentDetailsUpdate() {
        return documentDetailsUpdate;
    } 

	@FindBy(xpath = "//p-dropdownitem[@ng-reflect-label='PDF']//child::span")
	private WebElement pdfOption;

	public WebElement pdfOption() {
		return pdfOption;
	}

	@FindBy(xpath = "//p-dropdownitem[@ng-reflect-label='XLS']//child::span")
	private WebElement xlsOption;

	public WebElement xlsOption() {
		return xlsOption;
	}

	@FindBy(xpath = "//span[text()=' No. ']")
	private WebElement numberParameter;

	public WebElement numberParameter() {
		return numberParameter;
	}

	@FindBy(xpath = "//span[text()=' Document Name ']")
	private WebElement documentNameParameter;

	public WebElement documentNameParameter() {
		return documentNameParameter;
	}

	@FindBy(xpath = "//span[text()=' Required At Stage ']")
	private WebElement requiredAtStageParameter;

	public WebElement requiredAtStageParameter() {
		return requiredAtStageParameter;
	}

	@FindBy(xpath = "//span[text()=' Document Status ']")
	private WebElement documentStatusParameter;

	public WebElement documentStatusParameter() {
		return documentStatusParameter;
	}

	@FindBy(xpath = "//span[text()=' Mandatory/Optional ']")
	private WebElement mandatoryOptionalParameter;

	public WebElement mandatoryOptionalParameter() {
		return mandatoryOptionalParameter;
	}

	@FindBy(xpath = "//span[text()=' Document Category ']")
	private WebElement documentCategoryParameter;

	public WebElement documentCategoryParameter() {
		return documentCategoryParameter;
	}

	@FindBy(xpath = "//span[text()=' DMS Upload Status ']")
	private WebElement dmsUploadStatusParameter;

	public WebElement dmsUploadStatusParameter() {
		return dmsUploadStatusParameter;
	}

	@FindBy(xpath = "//span[text()=' No. ']/ancestor::table//td[2]//span")
	private WebElement numberDataInlistView;

	public WebElement numberDataInlistViewTable() {
		return numberDataInlistView;
	}

	@FindBy(xpath = "//span[text()=' No. ']/ancestor::table//td[3]//span")
	private WebElement documentNameDataInlistView;

	public WebElement documentNameDataInlistViewTable() {
		return documentNameDataInlistView;
	}

	@FindBy(xpath = "//span[text()=' No. ']/ancestor::table//td[4]//span")
	private WebElement requiredAtStageDataInlistView;

	public WebElement requiredAtStageDataInlistViewTable() {
		return documentNameDataInlistView;
	}

	@FindBy(xpath = "//span[text()=' No. ']/ancestor::table//td[5]//span")
	private WebElement documentStatusDataInlistView;

	public WebElement documentStatusDataInlistViewTable() {
		return documentStatusDataInlistView;
	}

	@FindBy(xpath = "//span[text()=' No. ']/ancestor::table//td[6]//span")
	private WebElement mandatoryOptionalDataInlistViewTable;

	public WebElement mandatoryOptionalDataInlistViewTable() {
		return mandatoryOptionalDataInlistViewTable;
	}

	@FindBy(xpath = "//span[text()=' No. ']/ancestor::table//td[7]//span")
	private WebElement documentCategoryDataInlistViewTable;

	public WebElement documentCategoryDataInlistViewTable() {
		return documentCategoryDataInlistViewTable;
	}

	@FindBy(xpath = "//span[text()=' No. ']/ancestor::table//td[8]//span")
	private WebElement dmsUploadStatusDataInlistViewTable;

	public WebElement dmsUploadStatusDataInlistViewTable() {
		return dmsUploadStatusDataInlistViewTable;
	}

	@FindBy(xpath = "//ion-icon[@ng-reflect-name='mail-unread-outline']")
	private WebElement Inbox_Icon1;
	public WebElement Inbox_Icon() {
		return Inbox_Icon1;
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
	@FindBy(xpath="//ion-label[text()='Document Details']/parent::ion-segment-button")
	private WebElement documentDetails;
	public  WebElement documentDetails() {
		return documentDetails;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Go Back']")
	private WebElement backButtonInDocumentDetails;
	public WebElement backButtonInDocumentDetails() {
		return backButtonInDocumentDetails;
	} 
	@FindBy(xpath = "(//td[text()=' APPDATAENT '])[1]/preceding-sibling::td[6]//button")
	private WebElement AppDataEntry_ActionIcon;
	public WebElement AppDataEntry_ActionIcon() {
		return AppDataEntry_ActionIcon;
	}
}
