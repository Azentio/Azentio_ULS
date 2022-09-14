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

	@FindBy(xpath = "//button[@ng-reflect-text='Add']")
	private WebElement addIcon;

	public WebElement addIcon() {
		return addIcon;
	}

	@FindBy(xpath = "//kub-prime-table[1]/p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]/span[1]")
	private WebElement document_TempView_Search;

	public WebElement document_TempView_Search() {
		return document_TempView_Search;
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
	@FindBy(xpath = "(//td[text()=' APPDATAENT '])[1]//preceding-sibling::td[3]/button")
	private WebElement AppDataEntry_ActionIcon;
	public WebElement AppDataEntry_ActionIcon() {
		return AppDataEntry_ActionIcon;
	}
}
