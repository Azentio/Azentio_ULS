package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ULS_AssetCollateralTypeObj {

	WebDriver driver;
	public ULS_AssetCollateralTypeObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ion-label[text()='Asset Collateral Config']")
	private WebElement uls_AssetCollateralConfig;
	public WebElement ulsAssetCollateralConfig()
	{
		return uls_AssetCollateralConfig;
	}
	@FindBy(xpath="//ion-label[text()='Colleteral type']/parent::ion-item//following-sibling::ion-buttons//ion-button[2]")
	private WebElement assetCollateralConfig_CollateralTypeViewButton;
	public WebElement assetCollateralConfigCollateralTypeViewbutton()
	{
		return assetCollateralConfig_CollateralTypeViewButton;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Add']")
	private WebElement assetCollateralType_AddButton;
	public WebElement assetCollateralTypeAddButton()
	{
		return assetCollateralType_AddButton;
	}
	@FindBy(xpath="//ion-label[text()=' Description ']/following-sibling::ion-input//input")
	private WebElement assetCollateralType_DescriptionTextBox;
	public WebElement assetCollateralTypeDescriptionTextBox()
	{
		return assetCollateralType_DescriptionTextBox;
	}
	@FindBy(xpath="//ion-label[text()=' Asset/Collateral type code ']/following-sibling::ion-input//input")
	private WebElement assetCollateralType_CollateralTypeCodeTextBox;
	public WebElement assetCollateralTypeCollateralTypeCodeTextBox()
	{
		return assetCollateralType_CollateralTypeCodeTextBox;
	}
	@FindBy(xpath="//ion-label[text()='  HairCut % ']/following-sibling::ion-input//input")
	private WebElement assetCollateralType_HairCutPercentage;
	public WebElement assetCollateralTypeHairCutPercentage()
	{
	 return assetCollateralType_HairCutPercentage;
	}
	@FindBy(xpath="//ion-label[text()='  HairCut % ']/following-sibling::ion-input")
	private WebElement assetCollateralSubType_hairCutPercentageDataHolder;
	public WebElement assetCollateralSubTyprHairCutPercentageDataHolder()
	{
		return assetCollateralSubType_hairCutPercentageDataHolder;
	}
	@FindBy(xpath="//textarea")
	private WebElement assetCollateralType_RemarkTextBox;
	public WebElement assetCollateralTypeRemarkTextBox()
	{
	 return assetCollateralType_RemarkTextBox;
	}
	@FindBy(xpath="//ion-label[text()=' Asset/Collateral type code ']/parent::ion-item/ancestor::ion-col[1]//div//div//ion-badge[contains(text(),'Alphanumeric characters allowed')]")
	private WebElement assetCollateralType_ColateralTypeCodeSpecialCharacterVerification;
	public WebElement collateralSubTypeCodeSpecialCharacterVerification()
	{
		return assetCollateralType_ColateralTypeCodeSpecialCharacterVerification;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Asset/Collateral Category *']")
	private WebElement assetCollateralType_CollateralCatagory;
	public WebElement assetCollateralTypeCollateralCatagoryDropDown()
	{
	return 	assetCollateralType_CollateralCatagory;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  Module *']")
	private WebElement assetCollateralType_Module;
	public WebElement assetCollateralTypeModuleDropDown()
	{
	return 	assetCollateralType_Module;
	}
	@FindBy(xpath="//ion-select[@aria-label='Select,  IFRS ']")
	private WebElement assetCollateralType_IFRS;
	public WebElement assetCollateralTypeIFRSDropDown()
	{
	return 	assetCollateralType_IFRS;
	}
	@FindBy(xpath="//ion-label[text()=' Asset/Collateral type code ']/parent::ion-item/ancestor::ion-col[1]//div//div//ion-badge[contains(text(),'Required field')]")
    private WebElement assetCollateralType_CollateralTypeCodeBlankVerification;
	public WebElement assetCollateralTypeCodeBlankVerification()
	{
		return assetCollateralType_CollateralTypeCodeBlankVerification;
	}
	@FindBy(xpath="//ion-label[text()=' Description ']/parent::ion-item/ancestor::ion-col[1]//div//div//ion-badge[contains(text(),'Required field')]")
	private WebElement assetCollateralType_DescriptionBlankVerification;
	public WebElement assetCollateralTypeDescriptionBlankVerification()
	{
		return assetCollateralType_DescriptionBlankVerification;
	}
	@FindBy(xpath="//ion-label[text()=' Asset/Collateral Category ']/parent::ion-item/ancestor::ion-col[1]//div//div//ion-badge[contains(text(),'Required field')]")
	private WebElement assetCollateralType_CollateralCatagoryDropDownBlankVerification;
	public WebElement assetCollateralTypeCollateralCatagoryDropDownBlankVerification()
	{
		return assetCollateralType_CollateralCatagoryDropDownBlankVerification;
	}
	@FindBy(xpath="//ion-label[text()=' Module ']/parent::ion-item/ancestor::ion-col[1]//div//div//ion-badge[contains(text(),'Required field')]")
	private WebElement assetCollateralType_ModuleDropDownBlankVerification;
	public WebElement assetCollateralTypeModuleDropDownBlankVerification()
	{
		return assetCollateralType_ModuleDropDownBlankVerification;
	}
	@FindBy(xpath="//ion-label[text()='  HairCut % ']/parent::ion-item/ancestor::ion-col[1]//div//div//ion-badge[contains(text(),'Required field')]")
	private WebElement assetCollateralType_HairCutBlankVerification;
	public WebElement assetCollateralTypeHairCutBlankVerification()
	{
		return assetCollateralType_HairCutBlankVerification;
	}
	@FindBy(xpath="//ion-label[text()=' Remarks ']/parent::ion-item/ancestor::ion-col[1]//div//div//ion-badge[contains(text(),'Required field')]")
	private WebElement assetCollateralType_RemarksBlankVerification;
	public WebElement assetCollateralTypeRemarksBlankVerification()
	{
		return assetCollateralType_RemarksBlankVerification;
	}
	@FindBy(xpath="//button[@ng-reflect-text='Save']")
	private WebElement assetCollateralType_SaveButton;
	public WebElement assetCollateralTypeSaveButton()
	{
		return assetCollateralType_SaveButton;
	}
	@FindBy(xpath="//div[@id='toast-container']//div[@role='alert']")
	private WebElement assetCollateral_ToastAlert;
	public WebElement assetCollateralToastAlert()
	{
		return assetCollateral_ToastAlert;
	}
}
