package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class customerPersonalOfferingObject {
WebDriver driver;
public customerPersonalOfferingObject(WebDriver driver) {
	this.driver= driver;
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//ion-icon[@aria-label='mail unread outline']")
private WebElement InboxIcon1;
public WebElement InboxIcon() {
	return InboxIcon1;
}
@FindBy(xpath="(//button[@ng-reflect-icon='pi pi-search'])[1]")
private WebElement SearchButton1;
public WebElement SearchButton() {
	return SearchButton1;
}
@FindBy(xpath="//ion-row[1]/ion-col[1]/ion-card[1]/ion-card-content[1]/p-table[1]/div[1]/div[1]/div[1]/span[2]/input[1]")
private WebElement SearchText1;
public WebElement SearchText() {
	return SearchText1;
}
@FindBy(xpath="(//td[text()=' OFFERING '])[1]//preceding-sibling::td[3]/button")
private WebElement CxPersonalOffering_ActionButton1;
public WebElement CxPersonalOffering_ActionButton() {
	return CxPersonalOffering_ActionButton1;
}
@FindBy(xpath="(//ion-segment-button[@id='seg3'])[2]")
private WebElement CxPersonal_CustomerDetailsTab1;
public WebElement CxPersonal_CustomerDetailsTab() {
	return CxPersonal_CustomerDetailsTab1;
}
@FindBy(xpath="//button[@ng-reflect-text='Edit']")
private WebElement CxPersonal_Offering_EditIcon1;
public WebElement CxPersonal_Offering_EditIcon() {
	return CxPersonal_Offering_EditIcon1;
}
@FindBy(xpath="//ion-label[text()=' Customer Type ']//following-sibling::ion-select")
private WebElement CxPersonal_Offering_CustomerType1;
public WebElement CxPersonal_Offering_CustomerType() {
	return CxPersonal_Offering_CustomerType1;
}
@FindBy(xpath="//ion-label[text()=' Applicant Type ']//following-sibling::ion-select")
private WebElement CxPersonal_Offering_ApplicantType1;
public WebElement CxPersonal_Offering_ApplicantType() {
	return CxPersonal_Offering_ApplicantType1;
}
@FindBy(xpath="//ion-label[text()=' Salutation ']//following-sibling::ion-select")
private WebElement CxPersonal_Offering_Salutation1;
public WebElement CxPersonal_Offering_Salutation() {
	return CxPersonal_Offering_Salutation1;
}

@FindBy(xpath="//ion-label[text()=' First Name ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_FirstName1;
public WebElement CxPersonalOffering_FirstName() {
	return CxPersonalOffering_FirstName1;
}
@FindBy(xpath="//ion-label[text()=' Middle Name ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_Middlename1;
public WebElement CxPersonalOffering_Middlename() {
	return CxPersonalOffering_Middlename1;
}
@FindBy(xpath="//ion-label[text()=' Last Name ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_Lastname1;
public WebElement CxPersonalOffering_Lastname() {
	return CxPersonalOffering_Lastname1;
}
@FindBy(xpath="//ion-label[text()=\" Father's First Name \"]//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_FatherFirstName1;
public WebElement CxPersonalOffering_FatherFirstName() {
	return CxPersonalOffering_FatherFirstName1;
}
@FindBy(xpath="//ion-label[text()=\" Father's Middle Name \"]//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_FatherMiddleName1;
public WebElement CxPersonalOffering_FatherMiddleName() {
	return CxPersonalOffering_FatherMiddleName1;
}
@FindBy(xpath="//ion-label[text()=\" Father's Last Name \"]//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_FatherLastName1;
public WebElement CxPersonalOffering_FatherLastName() {
	return CxPersonalOffering_FatherLastName1;
}
@FindBy(xpath="//ion-label[text()=\" Spouse's First Name \"]//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_SpouseFirstName1;
public WebElement CxPersonalOffering_SpouseFirstName() {
	return CxPersonalOffering_SpouseFirstName1;
}
@FindBy(xpath="//ion-label[text()=\" Spouse's Middle Name \"]//following-sibling::ion-input/input")
private WebElement CxPersoanlOffering_SpouseMiddleName1;
public WebElement CxPersoanlOffering_SpouseMiddleName() {
	return CxPersoanlOffering_SpouseMiddleName1;	
}
@FindBy(xpath="//ion-label[text()=\" Spouse's Last Name \"]//following-sibling::ion-input/input")
private WebElement CxPersoanlOffering_SpouseLastName1;
public WebElement CxPersoanlOffering_SpouseLastName() {
	return CxPersoanlOffering_SpouseLastName1;	
}
@FindBy(xpath="//ion-label[text()=\" No. Of Children \"]//following-sibling::ion-input/input")
private WebElement CxPersoanlOffering_NoOfChildren1;
public WebElement CxPersoanlOffering_NoOfChildren() {
	return CxPersoanlOffering_NoOfChildren1;	
}
@FindBy(xpath="//ion-label[text()=' Spouse Status ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_SpouseStatus1;
public WebElement CxPersonalOffering_SpouseStatus() {
	return CxPersonalOffering_SpouseStatus1;
}
@FindBy(xpath="//button[@ng-reflect-icon='pi pi-calendar']")
private WebElement CxPersonalOffering_DateOfBirth1;
public WebElement CxPersonalOffering_DateOfBirth() {
	return CxPersonalOffering_DateOfBirth1;
}
@FindBy(xpath="//ion-label[text()=' Gender ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_Gender1;
public WebElement CxPersonalOffering_Gender() {
	return CxPersonalOffering_Gender1;
}
@FindBy(xpath="//ion-label[text()=' Education Level ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_EducationLevel1;
public WebElement CxPersonalOffering_EducationLevel1() {
	return CxPersonalOffering_EducationLevel1;
}
@FindBy(xpath="//ion-label[text()=' Marital Status ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_MaritalStatus1;
public WebElement CxPersonalOffering_MaritalStatus1() {
	return CxPersonalOffering_MaritalStatus1;
}
@FindBy(xpath="//ion-label[text()=' Nationality ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_Nationality1;
public WebElement CxPersonalOffering_Nationality() {
	return CxPersonalOffering_Nationality1;
}
@FindBy(xpath="//ion-label[text()=' Ethinicity ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_Ethinicity1;
public WebElement CxPersonalOffering_Ethinicity() {
	return CxPersonalOffering_Ethinicity1;
}
@FindBy(xpath="//ion-label[text()=' Religion ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_Religion1;
public WebElement CxPersonalOffering_Religion() {
	return CxPersonalOffering_Religion1;
}
@FindBy(xpath="//ion-label[text()=' Residential Status ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_ResidentialStatus1;
public WebElement CxPersonalOffering_ResidentialStatus() {
	return CxPersonalOffering_ResidentialStatus1;
}
@FindBy(xpath="//ion-label[text()=' Language ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_Language1;
public WebElement CxPersonalOffering_Language() {
	return CxPersonalOffering_Language1;
}
@FindBy(xpath="//ion-label[text()=' No of Dependents ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_NoOfDependents1;
public WebElement CxPersonalOffering_NoOfDependents() {
	return CxPersonalOffering_NoOfDependents1;
}
@FindBy(xpath="//ion-label[text()=' Mothers Maiden Name ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_MothersMaidenName1;
public WebElement CxPersonalOffering_MothersMaidenName() {
	return CxPersonalOffering_MothersMaidenName1;
}
@FindBy(xpath="//ion-label[text()=' Type of Residence ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_TypeOfResidence1;
public WebElement CxPersonalOffering_TypeOfResidence() {
	return CxPersonalOffering_TypeOfResidence1;
}
@FindBy(xpath="//ion-label[text()=' Category of Client ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_CategoryOfClient1;
public WebElement CxPersonalOffering_CategoryOfClient() {
	return CxPersonalOffering_CategoryOfClient1;
}
@FindBy(xpath="//ion-label[text()=' Rating ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_Rating1;
public WebElement CxPersonalOffering_Rating() {
	return CxPersonalOffering_Rating1;
}
@FindBy(xpath="//ion-label[text()=' Remarks ']//following-sibling::ion-textarea")
private WebElement CxPersonalOffering_Remarks1;
public WebElement CxPersonalOffering_Remarks() {
	return CxPersonalOffering_Remarks1;
}
@FindBy(xpath="//ion-label[text()=' Phone number ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_Phonenumber1;
public WebElement CxPersonalOffering_Phonenumber() {
	return CxPersonalOffering_Phonenumber1;
}
@FindBy(xpath="//ion-label[text()=' Mobile Number (Primary) ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_MobileNumber_Primary1;
public WebElement CxPersonalOffering_MobileNumber_Primary() {
	return CxPersonalOffering_MobileNumber_Primary1;
}
@FindBy(xpath="//ion-label[text()=' Mobile Number (Secondary) ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_MobileNumber_Secondary1;
public WebElement CxPersonalOffering_MobileNumber_Secondary() {
	return CxPersonalOffering_MobileNumber_Secondary1;
}
@FindBy(xpath="//ion-label[text()=' EMAIL ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_MobileNumber_EMAIL1;
public WebElement CxPersonalOffering_MobileNumber_EMAIL() {
	return CxPersonalOffering_MobileNumber_EMAIL1;
}
@FindBy(xpath="//ion-label[text()=' Prefered Contact method ']//following-sibling::ion-select")
private WebElement CxPersonalOffering_MobileNumber_PreferedContactmethod1;
public WebElement CxPersonalOffering_MobileNumber_PreferedContactmethod() {
	return CxPersonalOffering_MobileNumber_PreferedContactmethod1;
}
@FindBy(xpath="//ion-label[text()=' Prefered time for contact ']//following-sibling::ion-input/input")
private WebElement CxPersonalOffering_MobileNumber_Preferedtimeforcontact1;
public WebElement CxPersonalOffering_MobileNumber_Preferedtimeforcontact() {
	return CxPersonalOffering_MobileNumber_Preferedtimeforcontact1;
}





}
