Feature: Check the functionality of the Allocation Masater

@Allocation_Master_M1
Scenario: To Create the allocation master with valid details
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
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


@Allocation_Master_M2
Scenario: To verify Checker user is able to Approve the record in allocation master
Given Get the URL and login as Checkers
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the approve button in the allocation Master
Then Enter the alert approve remark in allocation Master
And Give the final approve in the allocation Master
Then Verify the record get approved in allocation Master

@Allocation_Master_M2.1
Scenario: To verify Checker user is able to view the approved record in list view allocation master
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And Click the eye icon of the alloction master
Then Verify the approved record is available in the list view in allocation master

@Allocation_Master_Prereq
Scenario: To Create the allocation master with valid details
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
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

@Allocation_Master_M3
Scenario: To verify Checker user is able to reject the record in allocation master
Given Get the URL and login as Checkers
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the reject button in the allocation Master
Then Enter the alert reject remark in allocation Master
And Give the final reject in the allocation Master
Then Verify the record get rejected in allocation Master

@Allocation_Master_M3.1
Scenario: To verify Checker user is not able to view the rejected record in list view of allocation master
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And Click the eye icon of the alloction master
Then Verify the rejected record is not available in the list view in allocation master

@Allocation_Master_M4
Scenario: To Create the allocation master with valid details
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
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

@Allocation_Master_M4
Scenario: To verify Checker user is able to return the record in allocation master
Given Get the URL and login as Checkers
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the return button in the allocation Master
Then Enter the alert return remark in allocation Master
And Give the final return in the allocation Master
Then Verify the record get returned in allocation Master

@Allocation_Master_M4.1
Scenario: To verify Checker user is not able to view the returned record in list view of allocation master
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And Click the temp view of the alloction master
Then Verify the Returned record is available in the list view in allocation master

#Validation
@Allocation_Master_M5
Scenario: To verify the when user keep any mandatory field blank and invalid the system should not allow to save the record
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And Click the eye icon of the alloction master
Then Click the add button in the allocation master
Then Save the record in allocation master
And keep the mandatory field as blank and save the record and validate it in allocation master
Then Validate the save button by filling invalid data

@AT_ALM_006
Scenario: To verify user can able to update the allocation master record before approval
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
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

@AT_ALM_007
Scenario: User verify system allow user to modify the Allocation Master
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
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
And user capture checker id for checker submit

@AT_ALM_008
Scenario: To verify make user can not able to update the allocation master record with invalid inputs and blank field
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
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

#List View Validation
@Allocation_Master_M12
Scenario: To verify and validate the functionalities of list view
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And Click the eye icon of the alloction master
And Verify the functionality of add button in allocation master
Then Verify the values in the list view is not editable in allocation master
Then To verify the functionality of Search box with matching data in alloction master list view
And To verify the functionality of Search box with mismatch data in allocation master in list view
Then To verify the functionality of Export to PDF button in allocation master in list view
And To verify the functionality of Export to Excel button in allocation master list view

#WIP Validation
@Allocation_Master_M13
Scenario: To verify and validate the functionalities of work in progress
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And Click the temp view of the alloction master
And Verify the functionality of add button in allocation master
Then Verify the values in the list view is not editable in allocation master
Then To verify the functionality of Search box with matching data in alloction master list view
And To verify the functionality of Search box with mismatch data in allocation master in list view
Then To verify the functionality of Export to PDF button in allocation master in list view
And To verify the functionality of Export to Excel button in allocation master list view

@AT_ALM_014
Scenario: List view of Allocation master Approved records
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
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

#Allocation Detail Creation
@Allocation_Master_M16
Scenario: To verify the Creation of Allocation master detail with valid data
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And Click the eye icon of the alloction master
Then Click the first eye icon in allocation master list view
Then Click the add button in allocation details
And Choose the allocation based value in allocation detail
Then Fill the Level No in allocation Details
And Choose the order by value in allocation Details
Then Click the save button in allocation details
























