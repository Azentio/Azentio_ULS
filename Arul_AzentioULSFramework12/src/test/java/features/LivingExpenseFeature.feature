Feature: Verify the functionalities of Living expense module
@Living_Expense_M23
Scenario: Validate the fields in Living expense parameter sub module
Given Launch the kuls application and Navigate to living expense module view list
And click on Pencil icon of existing record
And Navigate to Living expense parameter section
And Validate all fields present in Living expense parameter view list
And Validate that records in Living expense parameter view list is non editable
And Search with valid test data in Living expense parameter view list
And Search with invalid test data in Living expense parameter view list
And Validate the export to PDF functionality of Living expense parameter
And Validate the export to Excel functionality of Living expense parameter
And Click on Add icon of Living expense parameter
And Click on back button of lLiving expense parameter

@Living_Expense_M24
Scenario: Creation of Living expense location record
Given Launch the kuls application and Navigate to living expense module view list
And click on Pencil icon of existing record
And Navigate to Living expense location page
And Click on Add icon of Living expense parameter
And Select the value in Country field of Living expense parameter
And Select the value in Province field of Living expense parameter
And Enter the value in Area factor income of Living expense parameter
And Enter the value in Area factor expenditure of Living expense parameter
Then Click on Save button in Living expense parameter
And Click on Mail icon for Living expense parameter
And Search the respictive Living expense parameter record
And Store the reference number and click on first Living expense parameter record
Then Submit the Living expense parameter record from maker user
And User Capture Checker id from the submit popup

@Living_Expense_M25
Scenario: Validate that user can able to create a Living expense location record and approve by checker user
Given Login into KULS for checker user
And Click on Mail icon for Living expense 
And Search the respective reference id and click on Action button for Living expense 
And Click on Approve button for Living expense
And Enter the remarks in action confirmation popup for Living expense
And Click on Remarks button in action confirmation popup for Living expense
Then Verify the record approved popup for Living expensel
