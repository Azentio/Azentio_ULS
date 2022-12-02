Feature: To verify user can able to create the document layout document details
@AT-DLDD-001
Scenario: creation of document details with valid details and verify the fields 
#Given user login as a cent bank uls application
And Get the test data for Document Layout Document Details Test case1
Given User login as uls maker in transaction
When user click the inbox icon for application new app
And User search app data in inbox list view
And User click the first edit icon of app data entry record
And user click the document details tab
And user verify the functionality of add button in document details
And user select the document name and verify the field is mandatory editable and dropdown
And user select the Required At Stage and verify the field is non mandatory non editable and drop down
And user select the Document status and verify the field is mandatory non editable and drop down
And user select the Mandatory optional and verify the field is mandatory non editable and drop down
And user select the Document Category and verify the field is mandatory non editable and drop down
And user select the upload date and verify the field is mandatory editable and date
And user select the Expected Date and verify the field is mandatory editable and date
And user select the Deferral Stage and verify the field is mandatory editable and dropdown
And user select the Deffered Approved by and verify the field is mandatory editable and dropdown
And user select the Change in nature approved by and verify the field is non mandatory editable and dropdown
And user select document form and verify the field is non mandatory editable and dropdown
And user select document quality and verify the field is non mandatory editable and dropdown
And user select document number and verify the field is non mandatory non editable and hyperlink
And user select document received by and verify the field is non mandatory non editable and hyperlink
And user select location where received and verify the field is non mandatory non editable and hyperlink
And user enter the rack number and verify the field is non mandatory non editable and hyperlink
And user enter the shelf number and verify the field is non mandatory non editable and hyperlink
And user enter the box number and verify the field is non mandatory non editable and hyperlink
And user enter remark and verify the field is no mandatory editable and text area
And user save the record in document details

@AT-DLDD-002
Scenario: Validation of fields in document details layout
And Get the test data for Document Layout Document Details Test case2
#Given user login as a cent bank uls application
Given User login as uls maker in transaction
When user click the inbox icon for application new app
And User search app data in inbox list view
And User click the first edit icon of app data entry record
And user click the document details tab
And user verify the functionality of add button in document details
And user save the record in document details for blank field verification
And user verify the impact when user keep any mandatory field blank and click on save button

@AT-DLDD-003
Scenario: Verify system should allow user to do a modification with valid data
And Get the test data for Document Layout Document Details Test case3
#Given User launch the kuls application
#And User Login as maker
#Then user should click on the menu toggle in login page
Given User login as uls maker in transaction
#Then click on inbox to search for the Customer Document Details record
#Then click on search button to search the record of Customer Document Details in inbox
#Then enter the reference id of the Customer Document Details record
#Then click on the entitle button of the Customer Document Details record of that reference id
When user click the inbox icon for application new app
And User search app data in inbox list view
And User click the first edit icon of app data entry record
Then click on the Document Details tab
Then open the record of Customer Document Details to modify
Then verify system should allow user to do a modification of Customer Document Details record before approved 
Then verify system should allow user to do a modification with valid data
Then verify system display the confirmation message post clicking on save button of Customer Employment Details record
And verify the same record of Customer Document Details should get saved in a system
Then verify the functionality of Back button of Customer Document Details record

@AT-DLDD-004
Scenario: Validation of fields in document details layout Modified data
And Get the test data for Document Layout Document Details Test case4
#Given user login as a cent bank uls application
#Then click on inbox to search for the Customer Document Details record
#Then click on search button to search the record of Customer Document Details in inbox
#Then enter the reference id of the Customer Document Details record
#Then click on the entitle button of the Customer Document Details record of that reference id
Given User login as uls maker in transaction
When user click the inbox icon for application new app
And User search app data in inbox list view
And User click the first edit icon of app data entry record
And user click the document details tab
Then open the record of Customer Document Details to modify
And User Change document name to default value
And User Change document Category to default value 
And user update the record in document details for blank field verification
And user verify the impact when user keep any mandatory field blank and click on save button
Then The system should not allow user to do a modification with invalid data

@AT-DLDD-005
Scenario: Verify system should allow user to do a modification with valid data
And Get the test data for Document Layout Document Details Test case5
#Given User launch the kuls application
#And User Login as maker
#Then user should click on the menu toggle in login page
Given User login as uls maker in transaction
#Then click on inbox to search for the Customer Document Details record
#Then click on search button to search the record of Customer Document Details in inbox
#Then enter the reference id of the Customer Document Details record
#Then click on the entitle button of the Customer Document Details record of that reference id
When user click the inbox icon for application new app
And User search app data in inbox list view
And User click the first edit icon of app data entry record
Then click on the Document Details tab
Then verify system should display the mention fields on List view of Customer Documents details
Then verify values in List view of Customer Documents details should be non editable
Then verify search box should display matching record with matched data of Customer Documents details
Then verify search box should not display any record with mismatched data of Customer Documents details
Then click on export to excel button system should download Excel file of Customer Documents details
Then click on export to pdf button system should download Pdf file of Customer Documents details
Then verify the functionality of Add button of Customer Documents details list view screen

