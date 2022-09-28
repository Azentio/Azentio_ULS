package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerEntityLayoutConvReferenceScreenObj {
WebDriver driver;

public CustomerEntityLayoutConvReferenceScreenObj(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//ion-title[text()=' References List View ']//ancestor::ion-card//button[@ng-reflect-icon='pi pi-plus']")
private WebElement References_add_icon;
public WebElement References_add_icon()
{
	return References_add_icon;
}

@FindBy(xpath="//ion-label[contains(text(),'Relationship Type')]//following-sibling::ion-select")
private WebElement References_Relationship_Type;
public WebElement References_Relationship_Type()
{
	return References_Relationship_Type;
}

@FindBy(xpath="//ion-label[contains(text(),' Salutation ')]//following-sibling::ion-select")
private WebElement References_Salutation;
public WebElement References_Salutation()
{
	return References_Salutation;
}

@FindBy(xpath="//ion-label[contains(text(),' First Name ')]//following-sibling::ion-input/input")
private WebElement References_First_Name;
public WebElement References_First_Name()
{
	return References_First_Name;
}

@FindBy(xpath="//ion-label[contains(text(),' Middle Name ')]//following-sibling::ion-input/input")
private WebElement References_Middle_Name;
public WebElement References_Middle_Name()
{
	return References_Middle_Name;
}

@FindBy(xpath="//ion-label[contains(text(),' Last Name ')]//following-sibling::ion-input/input")
private WebElement References_Last_Name;
public WebElement References_Last_Name()
{
	return References_Last_Name;
}

@FindBy(xpath="//ion-label[contains(text(),' Customer Full Name ')]//following-sibling::ion-input/input")
private WebElement References_Customer_Full_Name;
public WebElement References_Customer_Full_Name()
{
	return References_Customer_Full_Name;
}

@FindBy(xpath="//ion-label[contains(text(),' Identification Type ')]//following-sibling::ion-select")
private WebElement References_Identification_Type;
public WebElement References_Identification_Type()
{
	return References_Identification_Type;
}

@FindBy(xpath="//ion-label[contains(text(),' Identification Number ')]//following-sibling::ion-input/input")
private WebElement References_Identification_Number;
public WebElement References_Identification_Number()
{
	return References_Identification_Number;
}

@FindBy(xpath="//ion-label[contains(text(),'Residence Address ')]//following-sibling::ion-textarea//textarea")
private WebElement References_Residence_Address;
public WebElement References_Residence_Address()
{
	return References_Residence_Address;
}

@FindBy(xpath="//ion-label[contains(text(),'Office Address ')]//following-sibling::ion-textarea//textarea")
private WebElement References_Office_Address;
public WebElement References_Office_Address()
{
	return References_Office_Address;
}

@FindBy(xpath="//ion-label[contains(text(),'Contact Number')]//following-sibling::ion-input/input")
private WebElement References_Contact_Number;
public WebElement References_Contact_Number()
{
	return References_Contact_Number;
}

@FindBy(xpath="//ion-label[contains(text(),'Office Phone Number')]//following-sibling::ion-input/input")
private WebElement References_Office_Phone_Number;
public WebElement References_Office_Phone_Number()
{
	return References_Office_Phone_Number;
}

@FindBy(xpath="//ion-label[contains(text(),'Primary Mobile Number')]//following-sibling::ion-input/input")
private WebElement References_Primary_Mobile_Number;
public WebElement References_Primary_Mobile_Number()
{
	return References_Primary_Mobile_Number;
}

@FindBy(xpath="//ion-label[contains(text(),'Alternative Mobile Number')]//following-sibling::ion-input/input")
private WebElement References_Primary_Alternative_Number;
public WebElement References_Primary_Alternative_Number()
{
	return References_Primary_Alternative_Number;
}

@FindBy(xpath="//ion-label[contains(text(),'Email Id')]//following-sibling::ion-input/input")
private WebElement References_Email_Id;
public WebElement References_Email_Id()
{
	return References_Email_Id;
}

@FindBy(xpath="//ion-label[contains(text(),' No. of Years Known ')]//following-sibling::ion-input/input")
private WebElement References_No_of_Years_Known ;
public WebElement References_No_of_Years_Known()
{
	return References_No_of_Years_Known;
}
@FindBy(xpath="//ion-label[contains(text(),'CIF Number')]//following-sibling::ion-input/input")
private WebElement References_CIF_Number;
public WebElement References_CIF_Number()
{
	return References_CIF_Number;
}






}
