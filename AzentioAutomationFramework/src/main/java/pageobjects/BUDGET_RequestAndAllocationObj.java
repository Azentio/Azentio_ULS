package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BUDGET_RequestAndAllocationObj {

	
	
	WebDriver driver;

	public BUDGET_RequestAndAllocationObj(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//ion-select[@class='datagrid-lov ng-valid md hydrated ng-touched ng-dirty ion-valid ion-touched ion-dirty']")
	private WebElement financeoption;

	public WebElement FinaceOption() {
		return financeoption;
	}

	@FindBy(xpath = "//ion-segment-button[@ng-reflect-value='txn_bnk']")
	private WebElement DirctionIcon;

	public WebElement DirctionIcon() {
		return DirctionIcon;
	}

	@FindBy(xpath = "//ion-label[text()=' Budget ']")
	private WebElement Budget;

	public WebElement Budget() {
		return Budget;
	}

	@FindBy(xpath = "//ion-button[@ng-reflect-router-link='/tabs/list/datagrid/37']")
	private WebElement Budgetedit;

	public WebElement Budgetedit() {
		return Budgetedit;
	}

	@FindBy(xpath = "//ion-button[@ng-reflect-router-link='/tabs/list/datagrid-view/131']")
	private WebElement Budgeteye;

	public WebElement Budgeteye() {
		return Budgeteye;
	}

	@FindBy(xpath = "//ion-icon[@name='add']")
	private WebElement addicon;

	public WebElement addicon() {
		return addicon;
	}

	@FindBy(xpath = "//ion-col[2]/app-kub-lov/span/ng-select/div/div/div[2]")
	private WebElement Budgetcode;

	public WebElement Budgetcode() {
		return Budgetcode;
	}
	// ng-select[@class='ng-select ng-select-single ng-select-searchable
	// ng-select-clearable ng-select-bottom ng-touched ng-dirty ng-valid']

	@FindBy(xpath = "//ion-content[1]/form[1]/ion-infinite-scroll[1]/ion-grid[1]/ion-row[1]/ion-col[3]/ion-item[1]")
	private WebElement Budgetname;

	public WebElement Budgetname() {
		return Budgetname;
	}

	@FindBy(xpath = "//ion-col[4]/app-kub-lov/span/ng-select/div/div/div[2]")
	private WebElement Budgettype;

	public WebElement Budgettype() {
		return Budgettype;
	}

	@FindBy(xpath = "//select[@ng-reflect-name='budgetYear']")
	private WebElement Budgetyear;

	public WebElement Budgetyear() {
		return Budgetyear;
	}

	@FindBy(xpath = "//ion-select[@ng-reflect-name='branch']")
	private WebElement Budgetbranch;

	public WebElement Budgetbranch() {
		return Budgetbranch;
	}

	@FindBy(xpath = "//span[contains(text(),'OK')]")
	private WebElement branchOK;

	public WebElement branchOK() {
		return branchOK;
	}

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	private WebElement branchcancel;

	public WebElement branchcancel() {
		return branchcancel;
	}
	
	@FindBy(xpath = "//input[@id='trxAmt']")
	private WebElement Budgetamount;

	public WebElement Budgetamount() {
		return Budgetamount;
	}

	@FindBy(xpath = "//ion-col[8]/app-kub-lov/span/ng-select/div/div/div[2]")
	private WebElement amountcurr;

	public WebElement amountcurr() {
		return amountcurr;
	}

	@FindBy(xpath = "//ion-header/ion-toolbar/ion-buttons[2]/ion-button[1]/ion-icon")
	private WebElement AllowSave;

	public WebElement AllowSave() {
		return AllowSave;
	}

	// Budget Type Yearly
	@FindBy(xpath = "//datatable-body-cell[2]/div/app-kub-currency[@id='0']")  //datatable-body-cell[2]/div/app-kub-currency[@id='0']
	private WebElement Budyear;

	public WebElement Budyear() {
		return Budyear;
	}

	@FindBy(xpath = "//datatable-body-cell[3]/div/input[@id='0']")
	private WebElement Budremark;

	public WebElement Budremark() {
		return Budremark;
	}
	//span[contains(text(),'newone')]/ancestor::datatable-body-cell/preceding-sibling::datatable-body-cell/div/ion-buttons/ion-button
	@FindBy(xpath = "//span[contains(text(),'newone')]/ancestor::datatable-body-cell/preceding-sibling::datatable-body-cell/div/ion-buttons/ion-button")
	private WebElement Budaction;

	public WebElement Budaction() {
		return Budaction;
	}  //span[contains(text(),'ViewSummary')]

	@FindBy(xpath = "//span[contains(text(),'ViewSummary')]")
	private WebElement viewsummary;

	public WebElement viewsummary() {
		return viewsummary;
	}
	

	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	private WebElement Submit;

	public WebElement Submit() {
		return Submit;
	}
	//span[contains(text(),'Cancel')]
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	private WebElement Cancel;

	public WebElement Cancel() {
		return Cancel;
	}
	//ion-header/ion-toolbar/ion-buttons[2]/ion-button[1]/ion-icon
	@FindBy(xpath = "//ion-header/ion-toolbar/ion-buttons[2]/ion-button[1]/ion-icon")
	private WebElement Subsave;

	public WebElement Subsave() {
		return Subsave;
	}
	
	
		//Halfyearly 
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='0']")
		private WebElement Hy1;
		public WebElement Hy1() {
			return Hy1;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='1']")
		private WebElement Hy2;
		public WebElement Hy2() {
			return Hy2;
		}
		//Halfyear Remark
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='0']")
		private WebElement Hyremark1;
		public WebElement Hyremark1() {
			return Hyremark1;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='1']")
		private WebElement Hyremark2;
		public WebElement Hyremark2() {
			return Hyremark2;
		}
		
		//Quaterly
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='0']")
		private WebElement Quar0;
		public WebElement Quar0() {
			return Quar0;
		}
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='1']")
		private WebElement Quar1;
		public WebElement Quar1() {
			return Quar1;
		}
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='2']")
		private WebElement Quar2;
		public WebElement Quar2() {
			return Quar2;
		}
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='3']")
		private WebElement Quar3;
		public WebElement Quar3() {
			return Quar3;
		}
		
		//Quar Remark
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='0']")
		private WebElement Quarremark0;
		public WebElement Quarremark0() {
			return Quarremark0;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='1']")
		private WebElement Quarremark1;
		public WebElement Quarremark1() {
			return Quarremark1;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='2']")
		private WebElement Quarremark2;
		public WebElement Quarremark2() {
			return Quarremark2;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='3']")
		private WebElement Quarremark3;
		public WebElement Quarremark3() {
			return Quarremark3;
		}
		//Monthly
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='0']")
		private WebElement mon1;
		public WebElement mon1() {
			return mon1;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='1']")
		private WebElement mon2;
		public WebElement mon2() {
			return mon2;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='2']")
		private WebElement mon3;
		public WebElement mon3() {
			return mon3;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='3']")
		private WebElement mon4;
		public WebElement mon4() {
			return mon4;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='4']")
		private WebElement mon5;
		public WebElement mon5() {
			return mon5;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='5']")
		private WebElement mon6;
		public WebElement mon6() {
			return mon6;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='6']")
		private WebElement mon7;
		public WebElement mon7() {
			return mon7;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='7']")
		private WebElement mon8;
		public WebElement mon8() {
			return mon8;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='8']")
		private WebElement mon9;
		public WebElement mon9() {
			return mon9;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='9']")
		private WebElement mon10;
		public WebElement mon10() {
			return mon10;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='10']")
		private WebElement mon11;
		public WebElement mon11() {
			return mon11;
		}
		
		@FindBy(xpath="//datatable-body-cell[2]/div/app-kub-currency[@id='11']")
		private WebElement mon12;
		public WebElement mon12() {
			return mon12;
		}
		
		//Monthly Remark
		
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='0']")
		private WebElement Monremark1;
		public WebElement Monremark1() {
			return Monremark1;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='1']")
		private WebElement Monremark2;
		public WebElement Monremark2() {
			return Monremark2;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='2']")
		private WebElement Monremark3;
		public WebElement Monremark3() {
			return Monremark3;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='3']")
		private WebElement Monremark4;
		public WebElement Monremark4() {
			return Monremark4;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='4']")
		private WebElement Monremark5;
		public WebElement Monremark5() {
			return Monremark5;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='5']")
		private WebElement Monremark6;
		public WebElement Monremark6() {
			return Monremark6;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='6']")
		private WebElement Monremark7;
		public WebElement Monremark7() {
			return Monremark7;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='7']")
		private WebElement Monremark8;
		public WebElement Monremark8() {
			return Monremark8;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='8']")
		private WebElement Monremark9;
		public WebElement Monremark9() {
			return Monremark9;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='9']")
		private WebElement Monremark10;
		public WebElement Monremark10() {
			return Monremark10;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='10']")
		private WebElement Monremark11;
		public WebElement Monremark11() {
			return Monremark11;
		}
		
		@FindBy(xpath="//datatable-body-cell[3]/div/input[@id='11']")
		private WebElement Monremark12;
		public WebElement Monremark12() {
			return Monremark12;
		}
		
		
		
		
	}







