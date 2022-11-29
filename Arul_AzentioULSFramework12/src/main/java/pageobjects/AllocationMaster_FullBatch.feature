Feature: To verify the full flow of the allocation master
@AT-ALM-001
Scenario: To Create the allocation master with valid details
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Click the add button in the allocation master
And Validate the allocation master screen open with all fields
Then Enter the description fields in the allocation master
And Enter the allocation code value in the allocation master
Then Save the record in allocation master
And Validate the sucess popup
Then Click the inbox in allocation master
And Search the record in allocation master
Then Get the reference id and store it in json in allocation master
And Click the action icon of respective allocation master
Then Submit the record in allocation master

@AT-ALM-002
Scenario: To verify Checker user is able to Approve the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the approve button in the allocation Master
Then Enter the alert approve remark in allocation Master
And Give the final approve in the allocation Master
Then Verify the record get approved in allocation Master

@AT-ALM-002.1
Scenario: To verify Checker user is able to view the approved record in list view allocation master
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Verify the approved record is available in the list view in allocation master

@AT-ALM-001-Pre-Request
Scenario: To Create the allocation master with valid details
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Click the add button in the allocation master
And Validate the allocation master screen open with all fields
Then Enter the description fields in the allocation master
And Enter the allocation code value in the allocation master
Then Save the record in allocation master
And Validate the sucess popup
Then Click the inbox in allocation master
And Search the record in allocation master
Then Get the reference id and store it in json in allocation master
And Click the action icon of respective allocation master
Then Submit the record in allocation master

@AT-ALM-003
Scenario: To verify Checker user is able to reject the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the reject button in the allocation Master
Then Enter the alert reject remark in allocation Master
And Give the final reject in the allocation Master
Then Verify the record get rejected in allocation Master

@AT-ALM-003.1
Scenario: To verify Checker user is not able to view the rejected record in list view of allocation master
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Verify the rejected record is not available in the list view in allocation master

@AT-ALM-001-Pre-Request
Scenario: To Create the allocation master with valid details
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Click the add button in the allocation master
And Validate the allocation master screen open with all fields
Then Enter the description fields in the allocation master
And Enter the allocation code value in the allocation master
Then Save the record in allocation master
And Validate the sucess popup
Then Click the inbox in allocation master
And Search the record in allocation master
Then Get the reference id and store it in json in allocation master
And Click the action icon of respective allocation master
Then Submit the record in allocation master

@AT-ALM-004
Scenario: To verify Checker user is able to return the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the return button in the allocation Master
Then Enter the alert return remark in allocation Master
And Give the final return in the allocation Master
Then Verify the record get returned in allocation Master

@AT-ALM-004.1
Scenario: To verify Checker user is not able to view the returned record in list view of allocation master
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the temp view of the alloction master
Then Verify the Returned record is available in the list view in allocation master

@AT-ALM-005
Scenario: To verify the when user keep any mandatory field blank and invalid the system should not allow to save the record
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Click the add button in the allocation master
Then Save the record in allocation master
And keep the mandatory field as blank and save the record and validate it in allocation master
Then Validate the save button by filling invalid data

@AT-ALM-006
Scenario: To verify user can able to update the allocation master record before approval
#Given Navigate to ULS application URL
#Then login with valid maker credentials
#And go to configuration main menu
#And click on config Manager main module
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And click on temp view near by allocation master screen
And select the first record of temp view in allocation master screen
Then verify user can able to see the save button in allocation master screen
Then verify user can able to see the back button in allocation master screen
Then verify user can able to see the Description field in allocation master screen
Then verify user can able to see the allocation code in allocation master screen
Then verify user can able to see the Status field in allocation master screen
And update the description field in allocation master
And update the allocation code field
And click on save button to update the allocation master record
#Then verify allocation master record is saved in the system
And Validate the sucess popup
And click on mail box find the allocation master record
And search the allocation module event code
And select the allocation master first record
Then verify updated record visible for submission
And click on submit button to submit the record
And enter the alert remark in allocation master record
And click on alert submit button in allocation master record
And get the checker id for allocation master record

@AT-ALM-007
Scenario: User verify system allow user to modify the Allocation Master
#Given user log in as uls application maker
#When user click the configuration menu for Allocation Master 
#And User click the Configuration Manager option
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click Approved list icon for Allocation Master
And User click First Edit icon in Approved list view for Allocation Master
And User click back button in Alloction master screen
And User click First Edit icon in Approved list view for Allocation Master
And User click and update Description
And User click and update Allocation Code
And User click Save button for Allocation master updation 
And user click inbox to approve record for Allocation master
And user search Allocation Master
And user store reference number and click the first record in Allocation master inbox view
And user submit Allocation master record in maker
And user capture checker id for checker submit in AllocationMaster

@AT-ALM-008
Scenario: To verify make user can not able to update the allocation master record with invalid inputs and blank field
#Given Navigate to ULS application URL
#Then login with valid maker credentials
#And go to configuration main menu
#And click on config Manager main module
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And click on view icon near by allocation master screen
And select the approved record in allocation master list view
And clear the input field of description 
And clear the input field of allocation code
And click on save button with out data in mandatory field in allocation master
Then verify mandatory field are showing validation in allocation master screen
And enter the special character input in description field
And enter the special character input in allocation code field
Then verify description field show the validation for special characecter 
Then verify allocation code field show the validation for special characecter
And click on back buttonin allocation master updation screen
Then verify back button is working as we expected

@AT-ALM-007-Pre_Request
Scenario: User verify system allow user to modify the Allocation Master
#Given user log in as uls application maker
#When user click the configuration menu for Allocation Master 
#And User click the Configuration Manager option
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click Approved list icon for Allocation Master
And User click First Edit icon in Approved list view for Allocation Master
#And User click back button in Alloction master screen
#And User click First Edit icon in Approved list view for Allocation Master
And User click and update Description
And User click and update Allocation Code
And User click Save button for Allocation master updation 
And user click inbox to approve record for Allocation master
And user search Allocation Master
And user store reference number and click the first record in Allocation master inbox view
And user submit Allocation master record in maker
And user capture checker id for checker submit in AllocationMaster


@AT-ALM-009
Scenario: To verify Checker user is able to Approve the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the approve button in the allocation Master
Then Enter the alert approve remark in allocation Master
And Give the final approve in the allocation Master
Then Verify the record get approved in allocation Master


@AT-ALM-007-Pre-Request
Scenario: User verify system allow user to modify the Allocation Master
#Given user log in as uls application maker
#When user click the configuration menu for Allocation Master 
#And User click the Configuration Manager option
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click Approved list icon for Allocation Master
#And User click First Edit icon in Approved list view for Allocation Master
#And User click back button in Alloction master screen
And User click First Edit icon in Approved list view for Allocation Master
And User click and update Description
And User click and update Allocation Code
And User click Save button for Allocation master updation 
And user click inbox to approve record for Allocation master
And user search Allocation Master
And user store reference number and click the first record in Allocation master inbox view
And user submit Allocation master record in maker
And user capture checker id for checker submit in AllocationMaster

@AT-ALM-010
Scenario: To verify Checker user is able to reject the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the reject button in the allocation Master
Then Enter the alert reject remark in allocation Master
And Give the final reject in the allocation Master
Then Verify the record get rejected in allocation Master

@AT-ALM-007-Pre-Request
Scenario: User verify system allow user to modify the Allocation Master
#Given user log in as uls application maker
#When user click the configuration menu for Allocation Master 
#And User click the Configuration Manager option
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click Approved list icon for Allocation Master
#And User click First Edit icon in Approved list view for Allocation Master
#And User click back button in Alloction master screen
And User click First Edit icon in Approved list view for Allocation Master
And User click and update Description
And User click and update Allocation Code
And User click Save button for Allocation master updation 
And user click inbox to approve record for Allocation master
And user search Allocation Master
And user store reference number and click the first record in Allocation master inbox view
And user submit Allocation master record in maker
And user capture checker id for checker submit in AllocationMaster

@AT-ALM-011
Scenario: To verify Checker user is able to return the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the return button in the allocation Master
Then Enter the alert return remark in allocation Master
And Give the final return in the allocation Master
Then Verify the record get returned in allocation Master

#List View Validation
@AT-ALM-012
Scenario: To verify and validate the functionalities of list view
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
And Verify the functionality of add button in allocation master
Then Verify the values in the list view is not editable in allocation master
Then To verify the functionality of Search box with matching data in alloction master list view
And To verify the functionality of Search box with mismatch data in allocation master in list view
Then To verify the functionality of Export to PDF button in allocation master in list view
And To verify the functionality of Export to Excel button in allocation master list view

@AT_ALM_014
Scenario: List view of Allocation master - Approved records
#Given User Launch the KULS application 
#Then user click on configurations Tab
#When user click Config Manager menu
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And user click on Allocation Master List view Icon
And User verify the Values in List view should be non editable in Allocation Master 
And user verify the Add button of Allocation Master
And user click on back button in Master
And user click on search box
And user Enter the Mismatch data in search text box
And user click on search box
And user Enter the matching data in search text box
And user click on Export button and Download the PDF file
And user click on Export button and Download the Excel file

@AT_ALM_015
Scenario: To verify and validate the functionalities of work in progress
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the temp view of the alloction master
And Verify the functionality of add button in allocation master
Then Verify the values in the list view is not editable in allocation master
Then To verify the functionality of Search box with matching data in alloction master list view
And To verify the functionality of Search box with mismatch data in allocation master in list view
Then To verify the functionality of Export to PDF button in allocation master in list view
And To verify the functionality of Export to Excel button in allocation master list view

@AT_ALM_016
Scenario: To verify the Creation of Allocation master detail with valid data
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Click the first eye icon in allocation master list view
Then Click the add button in allocation details
And Choose the allocation based value in allocation detail
Then Fill the Level No in allocation Details
And Choose the order by value in allocation Details
Then Click the save button in allocation details

@AT_ALM_016-Pre-Request
Scenario: To verify the Creation of Allocation master detail with valid data
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Click the first eye icon in allocation master list view
Then Click the add button in allocation details
And Choose the allocation based value in allocation detail
Then Fill the Level No in allocation Details
And Choose the order by value in allocation Details
Then Click the save button in allocation details
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-017
Scenario: To verify Checker user is able to Approve the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the approve button in the allocation Master
Then Enter the alert approve remark in allocation Master
And Give the final approve in the allocation Master
Then Verify the record get approved in allocation Master

@AT_ALM_016-Pre-Request
Scenario: To verify the Creation of Allocation master detail with valid data
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Click the first eye icon in allocation master list view
Then Click the add button in allocation details
And Choose the allocation based value in allocation detail
Then Fill the Level No in allocation Details
And Choose the order by value in allocation Details
Then Click the save button in allocation details
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-018
Scenario: To verify Checker user is able to reject the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the reject button in the allocation Master
Then Enter the alert reject remark in allocation Master
And Give the final reject in the allocation Master
Then Verify the record get rejected in allocation Master

@AT_ALM_016-Pre-Request
Scenario: To verify the Creation of Allocation master detail with valid data
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Click the first eye icon in allocation master list view
Then Click the add button in allocation details
And Choose the allocation based value in allocation detail
Then Fill the Level No in allocation Details
And Choose the order by value in allocation Details
Then Click the save button in allocation details
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-019
Scenario: To verify Checker user is able to return the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the return button in the allocation Master
Then Enter the alert return remark in allocation Master
And Give the final return in the allocation Master
Then Verify the record get returned in allocation Master

@AT-ALM-020
Scenario: To verify the Creation of Allocation master detail with blank field validation
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the eye icon of the alloction master
Then Click the first eye icon in allocation master list view
And Click the add button in allocation details
Then Click the save button in allocation details
And validate the required field in allocation master

@AT-ALM-021
Scenario: To verify the modification of Allocation master detail before approving the record
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And Click the temp view of the alloction master
Then Click the first eye icon in allocation master list view
And Click the first edit icon in allocation details
Then Modify the allocation based on in allocation detail
And Modify the leval no in allocation details
Then Modify the order by value in allocation details
Then Click the updation button in allocation details 

@AT-ALM-022
Scenario: To verify the user able to modify the already approved record
Given User login as uls maker new
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
And User click the Allocation Master ListView icon in Allocation Master
And User click the Allocation Master Action edit icon in Allocation Master
Then User click the back button in asset CD master
And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master
And User click the save icon in Bounce master
And User get the save confirmation message
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-023
Scenario: To verify the user able to modify Negative validation
Given User login as uls maker new
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
And User click the Allocation Master ListView icon in Allocation Master
And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master validation
And User click the save icon in Bounce master
And User verify while modification, when user keep any mandatory field blank

@AT-ALM-022-Pre-Reuest
Scenario: To verify the user able to modify the already approved record
Given User login as uls maker new
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
And User click the Allocation Master ListView icon in Allocation Master
#And User click the Allocation Master Action edit icon in Allocation Master
#Then User click the back button in asset CD master
And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master
And User click the save icon in Bounce master
And User get the save confirmation message
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-024
Scenario: To verify Checker user is able to Approve the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the approve button in the allocation Master
Then Enter the alert approve remark in allocation Master
And Give the final approve in the allocation Master
Then Verify the record get approved in allocation Master

@AT-ALM-022-Pre-Reuest
Scenario: To verify the user able to modify the already approved record
Given User login as uls maker new
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
And User click the Allocation Master ListView icon in Allocation Master
And User click the Allocation Master Action edit icon in Allocation Master
#Then User click the back button in asset CD master
#And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master
And User click the save icon in Bounce master
And User get the save confirmation message
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-025
Scenario: To verify Checker user is able to reject the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the reject button in the allocation Master
Then Enter the alert reject remark in allocation Master
And Give the final reject in the allocation Master
Then Verify the record get rejected in allocation Master

@AT-ALM-022-Pre-Reuest
Scenario: To verify the user able to modify the already approved record
Given User login as uls maker new
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
And User click the Allocation Master ListView icon in Allocation Master
And User click the Allocation Master Action edit icon in Allocation Master
#Then User click the back button in asset CD master
#And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master
And User click the save icon in Bounce master
And User get the save confirmation message
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-026
Scenario: To verify Checker user is able to return the record in allocation master
Given user log in as uls application checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the return button in the allocation Master
Then Enter the alert return remark in allocation Master
And Give the final return in the allocation Master
Then Verify the record get returned in allocation Master



