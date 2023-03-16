package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferDetailsObj {
	WebDriver driver;

	public OfferDetailsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Search Icon
		@FindBy(xpath = "//p-table[1]/div[1]/div[1]/div[1]/div[3]/span[1]/button[1]")
		private WebElement OfferDetails_SearchIcon;

		public WebElement OfferDetails_SearchIcon() {
			return OfferDetails_SearchIcon;
		}

		// search input field
		@FindBy(xpath = "//div/span/input")
		private WebElement OfferDetails_SearchInputField;

		public WebElement OfferDetails_SearchInputField() {
			return OfferDetails_SearchInputField;
		}

		// search close button
		@FindBy(xpath = "//div/span/i")
		private WebElement OfferDetails_SearchCloseButton;

		public WebElement OfferDetails_SearchCloseButton() {
			return OfferDetails_SearchCloseButton;
		}
	// Facility Info
			@FindBy(xpath = "//button[@ng-reflect-text='Edit']")
			private WebElement OfferDetails_FacilityInfoRecord;

			public WebElement OfferDetails_FacilityInfoRecord() {
				return OfferDetails_FacilityInfoRecord;
			}
	
	// Offer Details Section
		@FindBy(xpath = "//ion-label[contains(text(),'Offer Details')]")
		private WebElement OfferDetails_OfferDetailsSection;

		public WebElement OfferDetails_OfferDetailsSection() {
			return OfferDetails_OfferDetailsSection;
		}
		
		// Offer Details Section Product
				@FindBy(xpath = "//form[1]/ion-row[1]/ion-col[2]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
				private WebElement OfferDetails_OfferDetailsSection_Product;

				public WebElement OfferDetails_OfferDetailsSection_Product() {
					return OfferDetails_OfferDetailsSection_Product;
				}
				
				// Offer Details Section SubProduct
				@FindBy(xpath = "//form[1]/ion-row[1]/ion-col[3]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
				private WebElement OfferDetails_OfferDetailsSection_SubProduct;

				public WebElement OfferDetails_OfferDetailsSection_SubProduct() {
					return OfferDetails_OfferDetailsSection_SubProduct;
				}
				// Offer Details Section Scheme
				@FindBy(xpath = "//form[1]/ion-row[1]/ion-col[4]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
				private WebElement OfferDetails_OfferDetailsSection_Scheme;

				public WebElement OfferDetails_OfferDetailsSection_Scheme() {
					return OfferDetails_OfferDetailsSection_Scheme;
				}

				// Offer Details Section PricingIndicator
				@FindBy(xpath = "//form[1]/ion-row[1]/ion-col[5]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
				private WebElement OfferDetails_OfferDetailsSection_PricingIndicator;

				public WebElement OfferDetails_OfferDetailsSection_PricingIndicator() {
					return OfferDetails_OfferDetailsSection_PricingIndicator;
				}
				
				// Offer Details Section OfferedAmount
				@FindBy(xpath = "//form[1]/ion-row[1]/ion-col[6]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
				private WebElement OfferDetails_OfferDetailsSection_OfferedAmount;

				public WebElement OfferDetails_OfferDetailsSection_OfferedAmount() {
					return OfferDetails_OfferDetailsSection_OfferedAmount;
				}
				
				// Offer Details Section Tenure
				@FindBy(xpath = "//form[1]/ion-row[1]/ion-col[7]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
				private WebElement OfferDetails_OfferDetailsSection_Tenure;

				public WebElement OfferDetails_OfferDetailsSection_Tenure() {
					return OfferDetails_OfferDetailsSection_Tenure;
				}
				
				// Offer Details Section NatureOfFinance
				@FindBy(xpath = "//form[1]/ion-row[1]/ion-col[8]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
				private WebElement OfferDetails_OfferDetailsSection_NatureOfFinance;

				public WebElement OfferDetails_OfferDetailsSection_NatureOfFinance() {
					return OfferDetails_OfferDetailsSection_NatureOfFinance;
				}
				
				// Offer Details Section Currency
				@FindBy(xpath = "//form[1]/ion-row[1]/ion-col[9]/digital-text-box[1]/ion-item[1]/ion-input[1]/input[1]")
				private WebElement OfferDetails_OfferDetailsSection_Currency;

				public WebElement OfferDetails_OfferDetailsSection_Currency() {
					return OfferDetails_OfferDetailsSection_Currency;
				}
				
				// Accept Offer Button
				@FindBy(xpath = "//button[@ng-reflect-text='Accept Offer']")
				private WebElement OfferDetails_AcceptOfferButton;

				public WebElement OfferDetails_AcceptOfferButton() {
					return OfferDetails_AcceptOfferButton;
				}
				
				//--------------------------Finance Details Section-------------------//
				
				@FindBy(xpath = "//ion-label[contains(text(),'Finance Details')]")
				private WebElement OfferDetails_FinanceDetailsSection;

				public WebElement OfferDetails_FinanceDetailsSection() {
					return OfferDetails_FinanceDetailsSection;
				}
				//Total Obligations
				@FindBy(xpath = "//ion-label[contains(text(),'Total Obligations')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_TotalObligations;

				public WebElement OfferDetails_FinanceDetailsSection_TotalObligations() {
					return OfferDetails_FinanceDetailsSection_TotalObligations;
				}
				//Total Net Income
				@FindBy(xpath = "//ion-label[contains(text(),'Total Net Income')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_TotalNetIncome;

				public WebElement OfferDetails_FinanceDetailsSection_TotalNetIncome() {
					return OfferDetails_FinanceDetailsSection_TotalNetIncome;
				}
				//Total Income
				@FindBy(xpath = "//ion-label[contains(text(),'Total Income')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_TotalIncome;

				public WebElement OfferDetails_FinanceDetailsSection_TotalIncome() {
					return OfferDetails_FinanceDetailsSection_TotalIncome;
				}
				//Total Fees
				@FindBy(xpath = "//ion-label[contains(text(),'Total Fees')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_TotalFees;

				public WebElement OfferDetails_FinanceDetailsSection_TotalFees() {
					return OfferDetails_FinanceDetailsSection_TotalFees;
				}
				//TotalDownPaymentAmount
				@FindBy(xpath = "//ion-label[contains(text(),'Total Down Payment Amount')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_TotalDownPaymentAmount;

				public WebElement OfferDetails_FinanceDetailsSection_TotalDownPaymentAmount() {
					return OfferDetails_FinanceDetailsSection_TotalDownPaymentAmount;
				}
				//TotalContractValue
				@FindBy(xpath = "//ion-label[contains(text(),'Total Contract Value')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_TotalContractValue;

				public WebElement OfferDetails_FinanceDetailsSection_TotalContractValue() {
					return OfferDetails_FinanceDetailsSection_TotalContractValue;
				}
				
				//NoOfInstallments
				@FindBy(xpath = "//ion-label[contains(text(),' No. of Installments ')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_NoOfInstallments;

				public WebElement OfferDetails_FinanceDetailsSection_NoOfInstallments() {
					return OfferDetails_FinanceDetailsSection_NoOfInstallments;
				}
				//LastInstallmentAmount
				@FindBy(xpath = "//ion-label[contains(text(),'Last Installment Amount')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_LastInstallmentAmount;

				public WebElement OfferDetails_FinanceDetailsSection_LastInstallmentAmount() {
					return OfferDetails_FinanceDetailsSection_LastInstallmentAmount;
				}
				//IRR
				@FindBy(xpath = "//ion-label[contains(text(),'IRR')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_IRR;

				public WebElement OfferDetails_FinanceDetailsSection_IRR() {
					return OfferDetails_FinanceDetailsSection_IRR;
				}
				//InstallmentFrequency
				@FindBy(xpath = "//ion-label[contains(text(),'Installment Frequency')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_InstallmentFrequency;

				public WebElement OfferDetails_FinanceDetailsSection_InstallmentFrequency() {
					return OfferDetails_FinanceDetailsSection_InstallmentFrequency;
				}
				//APR
				@FindBy(xpath = "//ion-label[contains(text(),'APR')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_APR;

				public WebElement OfferDetails_FinanceDetailsSection_APR() {
					return OfferDetails_FinanceDetailsSection_APR;
				}
				//AmountRequested
				@FindBy(xpath = "//ion-label[contains(text(),'Amount Requested')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_AmountRequested;

				public WebElement OfferDetails_FinanceDetailsSection_AmountRequested() {
					return OfferDetails_FinanceDetailsSection_AmountRequested;
				}
				//AdditionalDownPayment
				@FindBy(xpath = "//ion-label[contains(text(),' Additional Down payment ')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_AdditionalDownPayment;

				public WebElement OfferDetails_FinanceDetailsSection_AdditionalDownPayment() {
					return OfferDetails_FinanceDetailsSection_AdditionalDownPayment;
				}
				//DownPaymentPercentage
				@FindBy(xpath = "//ion-label[contains(text(),'Down Payment Percentage')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_DownPaymentPercentage;

				public WebElement OfferDetails_FinanceDetailsSection_DownPaymentPercentage() {
					return OfferDetails_FinanceDetailsSection_DownPaymentPercentage;
				}
				
				//Tenure
				@FindBy(xpath = "(//ion-label[contains(text(),'Tenure')]/../ion-input/input[1])[2]")
				private WebElement OfferDetails_FinanceDetailsSection_Tenure;

				public WebElement OfferDetails_FinanceDetailsSection_Tenure() {
					return OfferDetails_FinanceDetailsSection_Tenure;
				}
				
				//ProfitAmount
				@FindBy(xpath = "//ion-label[contains(text(),'Profit Amount')]/../ion-input/input[1]")
				private WebElement OfferDetails_FinanceDetailsSection_ProfitAmount;

				public WebElement OfferDetails_FinanceDetailsSection_ProfitAmount() {
					return OfferDetails_FinanceDetailsSection_ProfitAmount;
				}
				
				//DownPaymentAmount
				@FindBy(xpath = "(//ion-label[contains(text(),'Down Payment Amount')]/../ion-input/input[1])[2]")
				private WebElement OfferDetails_FinanceDetailsSection_DownPaymentAmount;

				public WebElement OfferDetails_FinanceDetailsSection_DownPaymentAmount() {
					return OfferDetails_FinanceDetailsSection_DownPaymentAmount;
				}
				
				//--------------------Credit Risk Factor Section---------------------//
				@FindBy(xpath = "//ion-title[contains(text(),'Credit Risk Factor (CONV)')]")
				private WebElement OfferDetails_CreditRiskFactorSection;

				public WebElement OfferDetails_CreditRiskFactorSection() {
					return OfferDetails_CreditRiskFactorSection;
				}
				//TotalScore
				@FindBy(xpath = "//ion-col[1]/kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[2]")
				private WebElement OfferDetails_CreditRiskFactorSection_TotalScore;

				public WebElement OfferDetails_CreditRiskFactorSection_TotalScore() {
					return OfferDetails_CreditRiskFactorSection_TotalScore;
				}
				//RiskLevel
				@FindBy(xpath = "//ion-col[1]/kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[3]")
				private WebElement OfferDetails_CreditRiskFactorSection_RiskLevel;

				public WebElement OfferDetails_CreditRiskFactorSection_RiskLevel() {
					return OfferDetails_CreditRiskFactorSection_RiskLevel;
				}
				
				
				//----------------Credit Score Details Section------------------------//
				@FindBy(xpath = "//ion-title[contains(text(),'Credit Score Details (CONV)')]")
				private WebElement OfferDetails_CreditScoreDetailsSection;

				public WebElement OfferDetails_CreditScoreDetailsSection() {
					return OfferDetails_CreditScoreDetailsSection;
				}
				//SrNo
				@FindBy(xpath = "//ion-col[2]/kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[2]")
				private WebElement OfferDetails_CreditScoreDetailsSection_SrNo;

				public WebElement OfferDetails_CreditScoreDetailsSection_SrNo() {
					return OfferDetails_CreditScoreDetailsSection_SrNo;
				}
				//CustomerName
				@FindBy(xpath = "//ion-col[2]/kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[3]")
				private WebElement OfferDetails_CreditScoreDetailsSection_CustomerName;

				public WebElement OfferDetails_CreditScoreDetailsSection_CustomerName() {
					return OfferDetails_CreditScoreDetailsSection_CustomerName;
				}
				//CreditBureauScore
				@FindBy(xpath = "//ion-col[2]/kub-prime-table[1]/p-table[1]/div[1]/div[2]/table[1]/thead[1]/tr[1]/th[4]")
				private WebElement OfferDetails_CreditScoreDetailsSection_CreditBureauScore;

				public WebElement OfferDetails_CreditScoreDetailsSection_CreditBureauScore() {
					return OfferDetails_CreditScoreDetailsSection_CreditBureauScore;
				}
				
				
				// Eligibility Details Section
				@FindBy(xpath = "//ion-title[contains(text(),'Eligibility Details')]")
				private WebElement OfferDetails_EligibilityDetailsSection;

				public WebElement OfferDetails_EligibilityDetailsSection() {
					return OfferDetails_EligibilityDetailsSection;
				}
				
				// Interest Rate Structure Section
				@FindBy(xpath = "//ion-title[contains(text(),'Interest Rate Structure')]")
				private WebElement OfferDetails_InterestRateStructureSection;

				public WebElement OfferDetails_InterestRateStructureSection() {
					return OfferDetails_InterestRateStructureSection;
				}
				
				
				// Installments Section
				@FindBy(xpath = "//ion-title[contains(text(),'Installments')]")
				private WebElement OfferDetails_InstallmentsSection;

				public WebElement OfferDetails_InstallmentsSection() {
					return OfferDetails_InstallmentsSection;
				}
				
				// Appeal Request Section
				@FindBy(xpath = "//ion-label[contains(text(),'Appeal Request')]")
				private WebElement OfferDetails_AppealRequestSection;

				public WebElement OfferDetails_AppealRequestSection() {
					return OfferDetails_AppealRequestSection;
				}
				
				
	
}
