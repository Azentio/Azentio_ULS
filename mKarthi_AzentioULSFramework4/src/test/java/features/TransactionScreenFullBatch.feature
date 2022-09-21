Feature: To verify user is able to create the record and full flow of the transaction screen
#Application Details NewApp
@AT-ADA-001
Scenario: Validate that user can able to create a App data entry record
Given Launch the kuls application and Navigate to Application details view list
And Click on Add icon in Application details view list
And Select the value in customer type field of Application details
And Enter the value in CIF ID field of Application details
And Enter the value in Application Number
And Enter the value in Customer name field of Application details
And Select the value in ID type field of Application details
And Enter the value in ID number field of Application details
And Enter the value in Mobile number field of Application details
And Enter the value in Date Of Birth field of Application details
And Enter the value in Email Id field of Application details
And Click on Search button in Application details
And Click on Create new request button in Application details
And Select the value in Primary product field of Application details
And Select the value in Primary sub product field of Application details
And Enter the value in Total finance amount requested field of Application details
And Enter the value in Declared net income field of Application details
And Enter the value in Declared current obligations field of Application details
And Select the value in Special promotion of Application details
And Select the value in Sourcing channel field of Application details
And Select the value in Business center code field of Application details
And Select the value in Servicing type field of Application details
And Select the value in Servicing entity field of Application details
And Select the value in Servicing branch field of Application details
And Select the value in Closing staff field of Application details
And Select the value in Sourcing type field of Application details
And Select the value in Sourcing office field of Application details
And Select the value in Sourcing entity field of Application details
And Select the value in Sourcing staff field of Application details
And Select the value in Reference type field of Application details
And Select the value in Reference entity field of Application details
And Enter the value in Reference code field of Application details
And Click on Save button of Application details

@AT_ADA_002
Scenario: verify user is able to add new Template Application details  record in the system by entering invalid data
Given User Launch the KULS url for Transaction
Then user click on Transaction Module
And user click on Application Details
And user click the Add button annd verify it
And user Choose customer Type
And user Enter CIF ID
And user Enter Application Number
And user Enter Customer Name
And user choose ID Type
And user Enter ID Number
And user Enter Mobile Number
And user Choose Date of Birth
And user Enter Email ID
And user Click the search button
And user click the Create New Record button
And user Enter Character value in Numeric fields
And user save the record and verify the Message we get

@AT-ADA-003
Scenario: Validate that user can able to update the application details
Given Launch the kuls application and Navigate to Application details view list
And Click on the pencil icon of first record in Application details view list
And Update the value in Primary sub product field of Application details
And Update the value in Total finance amount requested field of Application details
And Update the value in Declared net income field of Application details
And Update the value in Declared current obligations field of Application details
And Update the value in Special promotion of Application details
And Update the value in Sourcing channel field of Application details
And Update the value in Business center code field of Application details
And Update the value in Servicing branch field of Application details
And Update the value in Sourcing type field of Application details
And Update the value in Sourcing office field of Application details
And Update the value in Reference type field of Application details
And Update the value in Reference code field of Application details
And Click on Save button of Application details

@AT-ADA-004
Scenario: Updation of Approved record fields in application new app
Given user login as a cent bank uls application
When user click the inbox icon for application new app
And User search new app record in the inbox list view
And User click the first edit icon of new app record
And User click and update primary product
And User click and update primary sub product
And User click and update Total Finance Amount Requested 
And User click and update Declared Net Income 
And User click and update Declared Current Obligations 
And User click and update Special Promotion Campaign
And User click and update Sourcing Channel
And User click and update Business Center Corporate Banking 
And User click and update Servicing Type
And User click and update Servicing Entity
And User click and update Servicing Branch
And User click and update Closing Staff or Servicing Staff or RM
And User click and update Sourcing Type
And User click and update Sourcing Staff
And User click and update Sourcing Entity
And User click and update Sourcing Office
And User click and update Reference Type
And User click and update Reference Entity
And User click and update Reference Code
And User click save button in Application details NEW APP and verify
#And user close the searched text New app
When user click the inbox icon for application new app
#And User search new app record in the inbox list view
And User click the first edit icon of new app record
And User verify the updated primary product
And User verify the updated primary sub product
And User verify the updated Total Finance Amount Requested
And User verify the updated Declared Net Income 
And User verify the updated Declared Current Obligations 
And User verify the updated Special Promotion Campaign
And User verify the updated Sourcing Channel
And User verify the updated Business Center Corporate Banking 
And User verify the updated Servicing Type
And User verify the updated Servicing Entity
And User verify the updated Servicing Branch
And User verify the updated Closing Staff or Servicing Staff or RM
And User verify the updated Sourcing Type
And User verify the updated Sourcing Staff
And User verify the updated Sourcing Entity
And User verify the updated Sourcing Office
And User verify the updated Reference Type
And User verify the updated Reference Entity
And User verify the updated Reference Code
And user click submit in appdetails new data
And user enter remark in appdetails new data
And user click the final submit and verify pop up message

@AT-ADA-005
Scenario: To verify while modification, when user keep any mandatory field blank and by passing invalid data
#Given Get the URL and login as maker
Given user login as a cent bank uls application
Then Click the transaction button
And Click the Application manager
Then Click the application details
And Click the first pencil icon in application details
Then Save the record in application details
Then Validate the required field functionality in application details
And Click the servicing entitity and choose the select button
Then Validate the required field functionality in application details

@AT-ADA-006
Scenario: To verify the user able to active and deactive the record
Given User login as uls maker in transaction
And User click the transactions in application details new app
And User click the application manager in application details new app
And User click the application details list view in application details new app
And User click the application details action edit icon in application details new app
And User click the back arrow button in application details new app
And User click the application details action edit icon in application details new app
And User enter the declared net income in application details new app
And User verify the status button is active stage in application details new app
And User click the status button in application details new app
And User verify the status button is deactive stage in application details new app
And User verify the module name in application details new app
And User click the save button in application details new app

#Application Details App Data Entry

@ApplicationDetailsPre-Request
Scenario: Validate that user can able to create a App data entry record
Given Launch the kuls application and Navigate to Application details view list
And Click on Add icon in Application details view list
And Select the value in customer type field of Application details
And Enter the value in CIF ID field of Application details
And Enter the value in Application Number
And Enter the value in Customer name field of Application details
And Select the value in ID type field of Application details
And Enter the value in ID number field of Application details
And Enter the value in Mobile number field of Application details
And Enter the value in Date Of Birth field of Application details
And Enter the value in Email Id field of Application details
And Click on Search button in Application details
And Click on Create new request button in Application details
And Select the value in Primary product field of Application details
And Select the value in Primary sub product field of Application details
And Enter the value in Total finance amount requested field of Application details
And Enter the value in Declared net income field of Application details
And Enter the value in Declared current obligations field of Application details
And Select the value in Special promotion of Application details
And Select the value in Sourcing channel field of Application details
And Select the value in Business center code field of Application details
And Select the value in Servicing type field of Application details
And Select the value in Servicing entity field of Application details
And Select the value in Servicing branch field of Application details
And Select the value in Closing staff field of Application details
And Select the value in Sourcing type field of Application details
And Select the value in Sourcing staff field of Application details
And Select the value in Sourcing entity field of Application details
And Select the value in Sourcing office field of Application details
And Select the value in Reference type field of Application details
And Select the value in Reference entity field of Application details
And Enter the value in Reference code field of Application details
And Click on Save button of Application details
And User click the inbox mail icon in application detail offering
And User click the action edit icon in application details pre-request
Then Click the submit button in application details
And Click the Ok button for action confirmation in application detail
Then Click the final submit button in application detail


@AT-ADE-001,AT-ADE-002
Scenario: Validate that user can able to update the application details_App data entry
# This test case also cover the functionality of M2
Given Launch the kuls application and Navigate to Application details view list
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update the value in Primary sub product field of Application details
And Update the value in Total finance amount requested field of Application details
And Update the value in Declared net income field of Application details
And Update the value in Declared current obligations field of Application details
And Update the value in Special promotion of Application details
And Update the value in Sourcing channel field of Application details
And Update the value in Business center code field of Application details
And Update the value in Servicing branch field of Application details
And Update the value in Sourcing type field of Application details
And Update the value in Sourcing office field of Application details
And Update the value in Reference type field of Application details
And Update the value in Reference code field of Application details
And Click on Save button of Application details
And Validate the Save successful popup of Application details

@AT-ADE-003
Scenario: Validate that user can able to update the application details_App data entry under offering screen
Given Launch the kuls application and Navigate to Application details view list
And Navigate to Mail box of Application details and search the offering value
And Click on action icon of first record of application details_Offering value
#And Select Application details in the offering tab
And Update the value in Primary sub product field of Application details
And Update the value in Total finance amount requested field of Application details
And Update the value in Declared net income field of Application details
And Update the value in Declared current obligations field of Application details
And Update the value in Special promotion of Application details
And Update the value in Sourcing channel field of Application details
And Update the value in Business center code field of Application details
And Update the value in Servicing branch field of Application details
And Update the value in Sourcing type field of Application details
And Update the value in Sourcing office field of Application details
And Update the value in Reference type field of Application details
And Update the value in Reference code field of Application details
And Click on Save button of Application details
And Validate the Save successful popup of Application details

@AT-ADE-004
Scenario: Negative validation of App data entry updation in application details
Given Launch the kuls application and Navigate to Application details view list
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Keep the required field values as blank
And Click on Save button of Application details
And Validate the field is required popup in Application details

@AT-ADE-005
Scenario: Negative validation of App data entry updation in application details
Given Launch the kuls application and Navigate to Application details view list
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Validate the fields present in the App data entry page
And Validate the Add button functionality
And Validate the View summary functionality in App data entry page


#Application Detail Offering

@AT_ADO_001
Scenario: Verify the functionality of Application Details Offering Stage
#Given User launch the kuls application
#And User Login as maker
Given User login as uls maker in transaction
Then user should click on menu toggle
Then click on inbox to search for the Application details offering record
Then click on search button to search the record of Application details offering
Then enter the reference id of the Application details offering record
Then click on the entitle button of the Application details offering record of that reference id
Then click on the Application details tab in Application details screen
Then verify Application Details screen should get open with mention fields
Then verify Referral Sourcing Details screen should get open with mention fields
  	
Then verify the field Primary Product on Application Details Offering screen
Then verify the field primary sub product on Application Details Offering screen
Then verify the field declared net income on Application Details Offering screen
Then verify the field declared current obligation on Application Details Offering screen
Then verify the field sourcing channel on Application Details Offering screen
Then verify the field business center code on Application Details Offering screen
Then verify the field total finance amount requested on Application Details Offering screen
Then verify the field special promotion on Application Details Offering screen
Then verify the field servicing type on Application Details Offering screen
Then verify the field servicing entity on Application Details Offering screen
Then verify the field servicing branch on Application Details Offering screen
Then verify the field closing staff on Application Details Offering screen
  	
Then verify the field sourcing type on Application Details Offering screen
Then verify the field sourcing staff on Application Details Offering screen
Then verify the field sourcing entity on Application Details Offering screen
Then verify the field sourcing office on Application Details Offering screen
Then verify the field reference type on Application Details Offering screen
Then verify the field reference entity on Application Details Offering screen
Then verify the field reference code on Application Details Offering screen

@AT-ADO-002
Scenario: To verify user is able to add new record of Application Details under Offering screen
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in application detail offering
And User click the application details tab in application detail offering
And User verify the availability of Add button on Application Detail offering
And User click the offering tab in application detail offering
And User click the offering action edit icon in application detail offering
And User verify the modify existing record of Application Details under Offering screen
And User verify the back button functionality in application detail offering

#Application Detail Disbursement Maker

@AT_ADM_001
Scenario: To verify the fields in application detail at disbursement maker stage
Given Launch the kuls application and Navigate to Application details view list
And Click the inbox button in application detail
Then Search the record in application details for disbursement maker
And Click the action icon at DISBMKR stage
Then Verify the field primary product is in read only mode in Application details DISBMKR stage
Then Verify the field primary sub product is in read only mode in Application details DISBMKR stage
Then Verify the field Total finance amount requested  is in read only mode in Application details DISBMKR stage
Then Verify the field Declared net income is in read only mode in Application details DISBMKR stage
Then Verify the field Declared current obligation is in read only mode in Application details DISBMKR stage
Then Verify the field special promotion is in read only mode in Application details DISBMKR stage
Then Verify the field sourcing channel is in read only mode in Application details DISBMKR stage
Then Verify the field Business Center Code is in read only mode in Application details DISBMKR stage
Then Verify the field Servicing Type is in read only mode in Application details DISBMKR stage
Then Verify the field Servicing Entity is in read only mode in Application details DISBMKR stage
Then Verify the field Servicing Branch is in read only mode in Application details DISBMKR stage
Then Verify the field Closing Staff is in read only mode in Application details DISBMKR stage
Then Verify the field Sourcing Type is in read only mode in Application details DISBMKR stage
Then Verify the field Sourcing Staff is in read only mode in Application details DISBMKR stage
Then Verify the field Sourcing Entity is in read only mode in Application details DISBMKR stage
Then Verify the field Sourcing Office is in read only mode in Application details DISBMKR stage
Then Verify the field Reference Type is in read only mode in Application details DISBMKR stage
Then Verify the field Reference Entity  is in read only mode in Application details DISBMKR stage
Then Verify the field Reference Code is in read only mode in Application details DISBMKR stage


@AT_ADM_002
Scenario: To test the field level verification of the application details disbursement record
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And search the record for disbursement maker record
And select the disbursement maker record in the mail record
And go to application details 
Then verify add button is not available and user can not able to create the record 
Then verify user can not able to modify the primary product field
Then verify user can not able to modify the primary sub product field
Then verify user can not able to modify the total finance amount requested
Then verify user can not able to modify declared net income field
Then verify user can not able to modify the Declared Current Obligations field
Then verify user can not able to modify the Special PromotionCampaign field
Then verify user can not able to modify the sourcing channel field
Then verify user can not able to modify the business center code field
Then verify user can not able to modify the servicing type field
Then verify user can not able to modify the Servicing Entity field
Then verify user can not able to modify the Servicing Branch field
Then verify user can not able to modify the Closing Staff or Servicing Staff or RM field
Then verify user can not able to modify the Sourcing Type field
Then verify user can not able to modify the Sourcing staff field
Then verify user can not able to modify the Sourcing Entity field
Then verify user can not able to modify the Sourcing Office field
Then verify user can not able to modify the  Reference Type field
Then verify user can not able to modify the Reference Entity field
Then verify user can not able to modify the Reference Code field
Then verify the functionlaity of the back button

#Application Detail Disbursement Checker
@AT-ADC-001
Scenario: To verify the availability of Application Details tab under Disbursement Checker stage
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in application detail disbursement checker
And User verify the primary product field in application detail disbursement checker
And User verify the primary sub product field in application detail disbursement checker
And User verify the total finanace amount requested field in application detail disbursement checker
And User verify the declared net income field in application detail disbursement checker
And User verify the declared current obligations field in application detail disbursement checker
And User verify the special promotion campaign field in application detail disbursement checker
And User verify the sourcing channel field in application detail disbursement checker
And User verify the business center code field in application detail disbursement checker
And User verify the servicing type field in application detail disbursement checker
And User verify the servicing entity field in application detail disbursement checker
And User verify the servicing branch field in application detail disbursement checker
And User verify the closing staff or servicing staff or RM field in application detail disbursement checker
And User verify the sourcing type field in application detail disbursement checker
And User verify the sourcing staff field in application detail disbursement checker
And User verify the sourcing entity field in application detail disbursement checker
And User verify the sourcing office field in application detail disbursement checker
And User verify the reference type field in application detail disbursement checker
And User verify the reference entity field in application detail disbursement checker
And User verify the reference code field in application detail disbursement checker
And User click the work flow icon in application detail disbursement checker

@AT-ADC-002
Scenario: To verify user is able to modify  existing record of Application Details under Disbursement Checker screen
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in application detail disbursement checker
And User verify the availability of Add button on Application Detail offering
And User Verify the Values in List view should be non editable in application detail disbursement checker
And User verify the back button functionality in application detail disbursement checker


#Customer Entity Layout-Customer personal detail
@AT_CEL_001
Scenario: To verify maker can able to submit the customer personal Details record
Given navigate to uls application 
And login with maker credentials
And click on mail box icon
And select the application record
And click on customer details record
And click on add button to add the customer personal detail record
And search the customer for individual customer
And choose customer for individual 
And enter the CIF ID
And enter the applicantion number
And enter customer name
And choose the ID type
And enter id number in id type field
And enter mobile number field
And give date of birth of the employee
And enter email Id
And click on search button to search the customer 
And click oncreate new request button
And choose customer type as individual customer
And Applicant type field should br dropdown and user can able to select the data from the dropdown
And salutation field should be dropdown and user can able to select the data  from the slutation dropdown
And first name field should be text box and user can able to enter the data into the input box
And middle name field should be text box and user can able to enter the data into the input box
And last name field should be text box and user can able to enter the data into the input box
And date of birth field should be date and user can able to give dte oof birth into it
And gender field should be dropdown and user can able to select the data from the dropdown
And education level field should be lookup and user can able to select the data from the dropdown
And marital status field should be dropdown and user can able to sleect the data from the dropdown
And nationality field should be lookup and user can able to select the data from the nationality field
And ethnicity field should be lookup and user can able to select the data from the ethnicity field
And residential status field should be lookup and user can able o select the data from residential status
And language field should be lookup and user can able to select the data from the language field
And no of dependents field should bro textbox and user can able to enter the data into it
And mother maiden name field should be textbox and user can able to pass the data into the input box
And Type of Residence field should be lookup and user can able to select the data from the type of r̥esidence field
And Category of Client field should be lookup and user can able to select the data from the Category of Client field
And Rating field should be text box and user can able to pass the data into it
And fill the contactdetails form
Then save the customer detail record
@CEL_02
Scenario: To verify user can not able to create customer personal details record with invalid input
Given navigate to uls application 
And login with maker credentials
And click on mail box icon
And select the application record
And click on customer details record
And click on add button to add the customer personal detail record
And search the customer for individual customer
And choose customer for individual 
And enter the CIF ID
And enter the applicantion number
And enter customer name
And choose the ID type
And enter id number in id type field
And enter mobile number field
And give date of birth of the employee
And enter email Id
And click on search button to search the customer 
And click oncreate new request button
And set nationality field as blank field
And set maritail status fild as blank field
And click on save button before enter the mandatory field
Then verify customertype field should show the blank field validation message
Then verify applicant type field should show the blank field validation message
Then verify salutation field should show the blank field validation message
Then verify first name should show the blank field validation message
Then verify last name should show the blank field validation message
Then verify date of birth should show the blank field validation message
Then verify gender should show the blank field validation message
Then verify educational level should show the blank field validation message
Then verify Marital status should show the blank field validation message
Then verify nationality should show the blank field validation message
Then verify residencial status should show the blank field validation message
Then verify language should show the blank field validation message
Then verify no of dependents should show the blank field validation message
Then verify Mothers maiden name should show the blank field validation message
Then verify type of residence should show the blank field validation message
Then verify category of client should show the blank field validation message
Then verify first name field should not allow numeric values
Then verify first name field should not allow special charecters
Then verify last name field should not allow numeric values
Then verify last name field should not allow special charecters
Then verify no of dependents field should not allow to enter numeric values
Then verify user can not enter negative input
Then verify mothers maiden name field should not allow numeric values
Then verify mothers maiden name field should not allow special charecters

@AT-CEL-005
Scenario: To verify list view of customer personal details record
Given navigate to uls application 
And login with maker credentials
And click on mail box icon
And search the new application record
And select the new application record in mail box
And click on customer details tab 
And store the form data which is available in the list view
Then verify CIF ID field is available in screen and field should be read only mode
Then verify first name field is available in screen and field should be read only mode
Then verify middle name field is available in screen and field should be read only mode
Then verify last name field is available and read only mode in screen
Then verify customer type field i available and should be in read only mode
Then verify applicant type field should be available and read only mode
Then verify status field should be available and field should be read only mode
Then verify back button is available is screen and field should be read only mode
Then verify save button is available in the screen and field should be read only mode

#Personal Detail Data Entry
@AT_PDE_001
Scenario: Customer Personal Information at App data entry satge
Given User Launch the KULS url for Transaction
Then user click on Transaction Module
And user click on Application Details
And user click on Inbox Icon
And user click search icon
And user search Appdata Entry
And user click on First record of Appdata Entry
And user click on Customer Details Tab
And user click on First Record Edit Icon
And user verify the customer Type field
And user verify the Applicant Type field
And user verify the Salutation field
And user verify the First Name field
And user verify the Middle Name filed
And user verify the Last Name field
And user verify the Father First Name field
And user verify the Father Middle Name field
And user verify the Father Last Name Field
And user verify the spouse First Name field
And user verify the spouse Middle name field
And user verify the spouse Last Name field
And user verify the No of children field
And user verify the spouse status field
And user verify the Date of birth field
And user verify the gender field
And user verify the Education Level field
And user verify the Marital status field
And user verify the Nationality field
And user verify the Ethinicity field
And user verify the Religion field
And user verify the Residental status field
And user verify the Language field
And user verify the No Of dependents field
And user verify the Mothers maiden name field
And user verify the Type of Residence field
And user verify the category of client field
And user verify the Rating field
And user verify the Remark fields

@AT_PDE_002
Scenario: verify the availability of Add button and create a new Record of customer details tab
Given User Launch the KULS url for Transaction
Then user click on Transaction Module
And user click on Application Details
And user click on Inbox Icon
And user click search icon
And user search Appdata Entry
And user click on First record of Appdata Entry
And user click on Customer Details Tab
And user click the Add button annd verify it
And user Choose customer Type
And user Enter CIF ID
And user Enter Application Number
And user Enter Customer Name
And user choose ID Type
And user Enter ID Number
And user Enter Mobile Number
And user Choose Date of Birth
And user Enter Email ID
And user Click the search button
And user click the Create New Record button
And user Enter the customer Type field
And user Enter the Applicant Type field
And user Enter the Salutation field
And user Enter the First Name field
And user Enter the Middle Name filed
And user Enter the Last Name field
And user Enter the Father First Name field
And user Enter the Father Middle Name field
And user Enter the Father Last Name Field
And user Enter the spouse First Name field
And user Enter the spouse Middle name field
And user Enter the spouse Last Name field
And user Enter the No of children field
And user Enter the spouse status field
And user Enter the Date of birth field
And user Enter the gender field
And user Enter the Education Level field
And user Enter the Marital status field
And user Enter the Nationality field
And user Enter the Ethinicity field
And user Enter the Religion field
And user Enter the Residental status field
And user Enter the Language field
And user Enter the No Of dependents field
And user Enter the Mothers maiden name field
And user Enter the Type of Residence field
And user Enter the category of client field
And user Enter the Rating field
And user Enter the Remark fields
And user Enter the Phone Number in Contact Details
And user Enter the Mobile Number Primary in Contact Details
And user Enter the Mobile Number Secondary in Contact Details
And user Enter the Email Address in Contact Details
And user Select the Prefered contact Methods in Contact Details
And user Enter the Prefered time for contact in Contact Details
And user click the Save the button

@AT_PDE_003
Scenario: verify user is able to modify  existing record of customer details 
Given User Launch the KULS url for Transaction
Then user click on Transaction Module
And user click on Application Details
And user click on Inbox Icon
And user click search icon
And user search Appdata Entry
And user click on First record of Appdata Entry
And user click on Customer Details Tab
And user click on First Record Edit Icon
And user Modify the Applicant Type field
And user click the update the button

@AT_PDE_004
Scenario: verify customer details list view
Given User Launch the KULS url for Transaction
Then user click on Transaction Module
And user click on Application Details
And user click on Inbox Icon
And user click search icon
And user search Appdata Entry
And user click on First record of Appdata Entry
And user click on Customer Details Tab
#And user verify the Back button List View
And user verify the CIF ID List view
And user verify the First Name List View
And user verify the Middle Name List View
And user Verify the Last Name List View
And user verify the Customer Type List View
And user verify the Applicant Type List View
And user verify the Status List View

#Personal Details Offering
@AT_PDO_002
Scenario: Verify the functionality of customer details list view
#Given User launch the kuls application
#And User Login as maker
Given User login as uls maker in transaction
Then user should click on menu to open the sidebar
Then click on inbox to search for the personal detail offering record
Then click on search button to search the record of personal detail offering
Then enter the reference id of the personal detail offering record
Then click on the entitle button of the record of that reference id
Then click on the customer details tab in customer personal information screen
Then verify system should display mention fields of customer details list view
Then system should verify the values in the list view should be in read only mode
Then verify the functionality of the back button in the personal detail offering stage

#Personal Details Disbursement Maker
@PDDM01
 Scenario: To check the functionality of Personal Details Disbursement Maker
#Given User launch the kuls application
#And User Login as maker
#Given navigate to uls application 
#And login with maker credentials
Given User login as uls maker in transaction
Then click on inbox
Then click on search icon of record list 
Then search Personal Details Disbursement Maker record
And maker user open the record from inbox
Then click on Customer Details Segment button
Then open Customer Details record
Then verify the field Customer Type
Then verify the field Applicant Type
Then verify the field Salutation 
#Then verify the field First Name
#Then verify the field Middle Name
#Then verify the field Last Name
#Then verify the field Date Of Birth
Then verify the field Gender
Then verify the field Edcuation Level
Then verify the field Marital Status
Then verify the field Nationality
Then verify the field Ethinicity
Then verify the field Religion
Then verify the field Resident Status
Then verify the field Language
#Then verify the field No of Dependents
#Then verify the field Mothers Maiden Name
Then verify the field Type of Residence
Then verify the field Category of Client
#Then verify the field Rating
Then verify the toggle BlackListed


@PDDM02
 Scenario: To check the functionality of Personal Details Disbursement Maker List View
#Given User launch the kuls application
#And User Login as maker
#Given navigate to uls application 
#And login with maker credentials
Given User login as uls maker in transaction
Then click on inbox
Then click on search icon of record list
Then search Personal Details Disbursement Maker record
And maker user open the record from inbox
Then click on Customer Details Segment button
Then verify Personal Details Disbursement Maker List View should display all the fields
Then values in Personal Details Disbursement Maker list view should not be editable
Then Personal Details Disbursement Maker export Pdf file
Then Personal Details Disbursement Maker export Excel file
Then clicking on Back button system should navigate to the previous screen

@PDDM03
 Scenario: Verify System should not allow user to modify record of customer details
#Given User launch the kuls application
#And User Login as maker
#Given navigate to uls application 
#And login with maker credentials
Given User login as uls maker in transaction
Then click on inbox
Then click on search icon of record list
Then search Personal Details Disbursement Maker record
And maker user open the record from inbox
Then click on Customer Details Segment button
Then open Customer Details record
Then modification of Customer details record System should not allow
Then click on Back button of Customer Details record


@PDDM04
Scenario: Verify System should not allow user to add new record of customer details
#Given User launch the kuls application
#And User Login as maker
#Given navigate to uls application 
#And login with maker credentials
Given User login as uls maker in transaction
Then click on inbox
Then click on search icon of record list
Then search Personal Details Disbursement Maker record
And maker user open the record from inbox
Then click on Customer Details Segment button
Then verify the availability of Add button on customer details tab


#Personal Information Disbursement checker
@AT_PDC_001
Scenario: Verify Customer Personal Information at Disbursement Checker stage
#Given User launch the kuls application
#And User Login as maker
Given User login as uls maker in transaction
Then user should click on menu toggle to open the sidebar
Then click on inbox for Personal detail Disbursement Checker stage record
Then click on search button to search the record of in Personal detail Disbursement Checker stage
Then enter the reference id of Personal detail Disbursement Checker stage record
Then click on the entitle button of the Personal detail Disbursement Checker stage record
Then verify customer details tab availablity under Personal detail Disbursement Checker stage
Then verify post clicking on Customer details tab under Disbursement Checker screen should display mention fields
Then verify the field Customer Type on Customer details tab under Disbursement Checker screen
Then verify the field Applicant Type on Customer details tab under Disbursement Checker screen
Then verify the field Salutation or Title on Customer details tab under Disbursement Checker screen
Then verify the field First Name on Customer details tab under Disbursement Checker screen
Then verify the field Middle Name on Customer details tab under Disbursement Checker screen
Then verify the field Last Name or Family Name on Customer details tab under Disbursement Checker screen
Then verify the field Date of Birth on Customer details tab under Disbursement Checker screen
Then verify the field Gender on Customer details tab under Disbursement Checker screen
Then verify the field Education Level on Customer details tab under Disbursement Checker screen
Then verify the field Marital Status on Customer details tab under Disbursement Checker screen
Then verify the field Nationality on Customer details tab under Disbursement Checker screen
Then verify the field Customer Category or Sub Type on Customer details tab under Disbursement Checker screen
Then verify the field Religion on Customer details tab under Disbursement Checker screen
Then verify the field Resident Status on Customer details tab under Disbursement Checker screen
Then verify the field Language on Customer details tab under Disbursement Checker screen
Then verify the field No of Dependents on Customer details tab under Disbursement Checker screen
Then verify the field Mothers Maiden Name on Customer details tab under Disbursement Checker screen
Then verify the field Type of Residence on Customer details tab under Disbursement Checker screen
Then verify the field Category of Client on Customer details tab under Disbursement Checker screen
Then verify the field Existing Relationship on Customer details tab under Disbursement Checker screen
Then verify the field BlackListed on Customer details tab under Disbursement Checker screen

@PDDC-002
Scenario: To check the functionality of Personal Details Disbursement Checker
#Given User launch the kuls application
#And User Login as maker
Given User login as uls maker in transaction
Then click on inbox
Then click on search icon of record list
Then search Personal Details Disbursement Checker record
And maker user open the record from inbox
Then click on Customer Details Segment button
Then open Customer Details record
Then Validate Personal Details Disbursement Checker Back button
Then Validate Personal Details Disbursement Checker Add button 

