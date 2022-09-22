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
	// Offer Details Section
		@FindBy(xpath = "//ion-label[contains(text(),'Offer Details')]")
		private WebElement OfferDetails_OfferDetailsSection;

		public WebElement OfferDetails_OfferDetailsSection() {
			return OfferDetails_OfferDetailsSection;
		}

		// Accept Offer Button
				@FindBy(xpath = "//button[@ng-reflect-text='Accept Offer']")
				private WebElement OfferDetails_AcceptOfferButton;

				public WebElement OfferDetails_AcceptOfferButton() {
					return OfferDetails_AcceptOfferButton;
				}
				
				// Finance Details Section
				@FindBy(xpath = "//ion-label[contains(text(),'Finance Details')]")
				private WebElement OfferDetails_FinanceDetailsSection;

				public WebElement OfferDetails_FinanceDetailsSection() {
					return OfferDetails_FinanceDetailsSection;
				}
				
				// Credit Risk Factor Section
				@FindBy(xpath = "//ion-title[contains(text(),'Credit Risk Factor (CONV)')]")
				private WebElement OfferDetails_CreditRiskFactorSection;

				public WebElement OfferDetails_CreditRiskFactorSection() {
					return OfferDetails_CreditRiskFactorSection;
				}
				
				// Credit Score Details Section
				@FindBy(xpath = "//ion-title[contains(text(),'Credit Score Details (CONV)')]")
				private WebElement OfferDetails_CreditScoreDetailsSection;

				public WebElement OfferDetails_CreditScoreDetailsSection() {
					return OfferDetails_CreditScoreDetailsSection;
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
