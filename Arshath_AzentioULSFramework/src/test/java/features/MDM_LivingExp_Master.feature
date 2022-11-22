Feature: Check the functionality of Living Expenses Master
@AT_LE_001_Creation
Scenario: Creation of Living Expenses record with valid data
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for Creation
And user Enter value in Description and verify it
And user Enter value in Description2 and verify it
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user go the Maker Inbox and store the Referance ID
Then user Click on Action Icon
And user verify submit button and submit the Record from Maker stage

@AT_LE_002_Checker_Approve
Scenario: verify Checker user is able to Approve the record
Given user login as kuls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for Approve
And user Search the respective reference id and click on Action button
And user Click on Approve icon button
And user Enter the remarks in Action confirmation popup screen
Then user Click on Remarks button in Action confirmation popup screen
Then user verify the Record got Approved in checker stage

@AT_LE_002_Listview
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Pass the Exceldata value for Creation
Then User validate the Living Expense approved record in list view

@AT_LE_003
Scenario: Creation of Living Expenses record with valid data
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for Rejection
And user Enter value in Reject Description and verify it
And user Enter value in Reject Description2 and verify it
And user Pass the Exceldata value for Creation
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user go the Maker Inbox and store the ReferanceID
Then user Click on Action Icon
And user verify submit button and submit Record from Maker stage

@AT_LE_003_Reject
Scenario: verify Checker user is able to Reject the record
Given user login kuls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for Rejection
And user Search the respective reference id and click on Action button
And user Click on Reject icon button
And user Enter the remarks for Reject the Record in checker
Then user Click on Remarks button for Reject confirmation Alert
Then user verify the Record got Rejected in checker stage

@AT_LE_003_Reject_ListView
Scenario: Record should get approved and display in the system under Reject List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
Then User validate the Living Expense Rejected record in list view

@AT_LE_004
Scenario: Creation of Living Expenses record with valid data
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for Return
And user Enter value in Return Description and verify it
And user Enter value in Return Description2 and verify it
And user Pass the Exceldata value for Creation
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user go Maker Inbox and store the ReferanceID
Then user Click on Action Icon
And user verify submit button and submiting Record from Maker stage

@AT_LE_004_Return
Scenario: verify Checker user is able to Return the record
Given user log in as uls application checker
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for Return
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT_LE_004_Return_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And user Pass the Exceldata value for Return
Then User validate the Living Expense Returned record in list view

@AT_LE_005_Validation
Scenario: Creation of Living Expenses record with invalid data
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user save the Record in Living Expensess
And user Pass the Exceldata value for Invalid
And user verify the Blank field in Living Expense
And user Enter Invalid value in Description2 and verify it
And Validate the Message and verify it

@AT_LE_006_Valid_Modification
Scenario: verify system allow user to modify the Living Expenses 
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for Creation
And user Enter value in Description and verify it
And user Enter value in Description2 and verify it
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user Goto the Temp view screen of living Expense
And user click on First record in living Expense
And user Pass the Exceldata value for Validation
And user Enter Modify value in Description and verify it
And user Enter Modify value in Description2 and verify it
And user try to update the Modified Record

@AT_LE_007_Invalid_Modification
Scenario: verify while modification system enters the invalid data (Invalid data types)
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for Creation
And user Enter value in Description and verify it
And user Enter value in Description2 and verify it
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user Goto the Temp view screen of living Expense
And user click on First record in living Expense
And user Pass the Exceldata value for InvalidModify
And user Enter Invalid value in Description and verify it
And user Enter Invalid value in Description2 and verify it
And user try to update the Modified Record
And user Pass the Exceldata value for Invalid
And Validate the Message and verify it
And user click on List view Icon of  Living Expenses 
And user click on First record in living Expense
And user Pass the Exceldata value for InvalidModify
And user Enter ApprovedModify value in Description and verify it
And user Enter ApprovedModify value in Description2 and verify it
And user try to update the Modified Record
And user go Inbox and store the ReferanceID
Then user Click on Action Icon
And verify submit button and submiting Record from Maker stage

@AT_LE_008_Checker_Approve
Scenario: verify Checker user is able to Approve the record
Given user launch kuls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for checker
And user Search the respective reference id and click on Action button
And user Click on Approve icon button
And user Enter the remarks in Action confirmation popup screen
Then user Click on Remarks button in Action confirmation popup screen
Then user verify the Record got Approved in checker stage

@AT_LE_008_Listview
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Pass the Exceldata value for Validation
Then User validate the Living Expense Modified approved record in list view

@AT_LE_009_Reject_Valid_Modification
Scenario: verify system allow user to modify the Living Expenses 
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for Creation
And user Enter value in Description and verify it
And user Enter value in Description2 and verify it
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user Goto the Temp view screen of living Expense
And user click on First record in living Expense
And user Pass the Exceldata value for ModifyRejection
And user Enter Reject Modify value in Description and verify it
And user Enter Reject Modify value in Description2 and verify it
And user try to update the Modified Record
And user goto Inbox and store the ReferanceID
Then user Click on Action Icon
And verify submit button and submiting the Record from Maker stage

@AT_LE_009_Reject
Scenario: verify Checker user is able to Reject the record
Given user launching kuls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for ModifyRejection
And user Search the respective reference id and click on Action button
And user Click on Reject icon button
And user Enter the remarks for Reject the Record in checker
Then user Click on Remarks button for Reject confirmation Alert
Then user verify the Record got Rejected in checker stage

@AT_LE_009_Reject_ListView
Scenario: Record should get approved and display in the system under Reject List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Pass the Exceldata value for ModifyRejection
Then User validate the Living Expense Modified Rejected record in list view

@AT_LE_010_Return_Valid_Modification
Scenario: verify system allow user to modify the Living Expenses 
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for Creation
And user Enter value in Description and verify it
And user Enter value in Description2 and verify it
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user Goto the Temp view screen of living Expense
And user click on First record in living Expense
And user Pass the Exceldata value for ModifyReturn
And user Enter Return Modify value in Description and verify it
And user Enter Return Modify value in Description2 and verify it
And user try to update the Modified Record
And user goto Maker Inbox and store the Referance ID
Then user Click on Action Icon
And verify submit button and submit it from Maker stage

@AT_LE_010_Return
Scenario: verify Checker user is able to Approve the record
Given login kuls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for ModifyReturn
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT_LE_010_Return_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker   
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And user Pass the Exceldata value for ModifyReturn
Then User validate the Living Expense Modify Returned record in list view

@AT_LE_011
Scenario: To verify list view functionality of approved records in living expense
Given user log in as uls application maker   
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
Then Click the Eye icon of the living expense
Then Verify the values in List view should be non editable in Living Expense
And To verify the functionality of Add button in Living Expense
And user Pass the Exceldata value for validation
Then To verify the functionality of View in Approved records in Living Expense
And To verify the functionality of Search box with matching data in Living Expense
Then To verify the functionality of Search box with mismatch data in Living Expense
And To verify the functionality of Export to PDF button in Living Expense
Then To verify the functionality of Export to Excel button in Living Expense

@AT_LE_012
Scenario: To verify list view functionality of approved records in living expense
Given user log in as uls application maker   
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
Then Verify the values in List view should be non editable in Living Expense
And To verify the functionality of Add button in Living Expense
And user Pass the Exceldata value for validations
Then To verify the functionality of View in Approved records in Living Expense
And To verify the functionality of Search box with matching data in Living Expense
Then To verify the functionality of Search box with mismatch data in Living Expense
And To verify the functionality of Export to PDF button in Living Expense
Then To verify the functionality of Export to Excel button in Living Expense

@AT_LE_013_Parameter_Creation
Scenario: Creation of Living Expense Parameter record with valid data
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for Creation
And user Enter value in Description and verify it
And user Enter value in Description2 and verify it
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user Goto the Temp view screen of living Expense
And user click on First record in living Expense
And user click on Living Expenses Parameter
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for ParaMeter Creation
And user Enter value in Description and verify it
And user select the code value
And user Enter the value
And user save the Record in Living Expenses
And user goto the Maker Inbox and store the New Referance ID
Then user Click on Action Icon
And user verify the submit button and submit the New Record from Maker stage

@AT_LE_014_Parameter_Approve
Scenario: verify Checker user is able to Approve the record
Given user log inas uls application checker
And user Click on Checker Mailbox icon
And user pass the Exceldata value for parameter checker
And user Search the respective reference id and click on Action button
And user Click on Approve icon button
And user Enter the remarks in Action confirmation popup screen
Then user Click on Remarks button in Action confirmation popup screen
Then user verify the Record got Approved in checker stage

@AT_LE_014_Parameter_Listview
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Click on First Record Eye icon
And user click on Living Expenses Parameter
And user Pass the Exceldata value for ParaMeter Creation
Then User validate the Living Expense Parameter approved record in list view

@AT_LE_015_Parameter_creatin_for_Reject
Scenario: Creation of Living Expense Parameter record with valid data
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for Rejection
And user Enter value in Reject Description and verify it
And user Enter value in Reject Description2 and verify it
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user Goto the Temp view screen of living Expense
And user click on First record in living Expense
And user click on Living Expenses Parameter
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for ParaMeter Rejection
And user Enter value in Reject Description and verify it
And user select the code value
And user Enter the Reject value
And user save the Record in Living Expenses
And user goto Maker Inbox and store the New Ref ID
Then user Click on Action Icon
And user verify the submit Icon and submit the New Record from Maker stage

@AT_LE_015_Parameter_Reject
Scenario: verify Checker user is able to Reject the record
Given user log in as uls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for ParaMeter Rejection
And user Search the respective reference id and click on Action button
And user Click on Reject icon button
And user Enter the remarks for Reject the Record in checker
Then user Click on Remarks button for Reject confirmation Alert
Then user verify the Record got Rejected in checker stage

@AT_LE_015_Parameter_Reject_ListView
Scenario: Record should get approved and display in the system under Reject List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Click on First Record Eye icon
And user click on Living Expenses Parameter
And user Pass the Exceldata value for ParaMeter Rejection
Then User validate the Living Expense Parameter Rejected record in list view

@AT_LE_016_Parameter_creatin_for_Return
Scenario: Creation of Living Expense Parameter record with valid data
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for ParaMeter Return
And user Enter value in Return Description and verify it
And user Enter value in Return Description2 and verify it
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user Goto the Temp view screen of living Expense
And user click on First record in living Expense
And user click on Living Expenses Parameter
And user click on Add Icon for Living Expenses
And user Enter value in Return Description and verify it
And user select the code value
And user Enter the Return value
And user save the Record in Living Expenses
And user goto MakerInbox and store the New Ref ID
Then user Click on Action Icon
And user verify the submitIcon and submit the New Record from Maker stage

@AT_LE_016_Parameter_Return
Scenario: verify Checker user is able to Approve the record
Given user launching uls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for ParaMeter Return
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT_LE_016_Parameter_Return_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And user Click on First Record Eye icon
And user click on Living Expenses Parameter
And user Pass the Exceldata value for ParaMeter Return
Then User validate the Living Expense Parameter Returned record in list view

@AT_LE_017_Parameter_Invalid
Scenario: Creation of Living Expense Parameter record with invalid data
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And user click on First record in living Expense
And user click on Living Expenses Parameter
And user click on Add Icon for Living Expenses
And user Pass the Exceldata value for ParaMeter Invalid
And user Enter Invalid value in Description and verify it
And user save the Record in Living Expensess
And Validate the Message and verify it
And user verify the Blank field in Living Expense

@AT_LE_018
Scenario: To verify user can able to update the living expense with invalid inputs
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And select the approved record of living expense
And go to living expese parameter tab
And select the living expense parameter approved record
And user Pass the Exceldata value for Update Invalid input
And clear all the input fields of living expense approved record
And click on save button in living expense record
Then verify system should through the validation for blank field
And enter invalid special charecter in input box
Then verify system should through the validation in living expense parameter screen
And click on back button in living expense parameter screen
Then verify living expense parameter screen should get navigate to previous screen

@AT_LE_019
Scenario: To verify maker user can able to update the living expense parameter approved record
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And click on view button in living expense module 
And select the approved record of living expense
And go to living expese parameter tab
And select the living expense parameter approved record
And user Pass the Exceldata value for Update input
And update the living expense paramater record
And click on save button in living expense record
And user goto MakerInbox and stored the New Ref ID
Then user Click on Action Icon
And user verify the submitIcon and submit New Record from Maker stage

@AT_LE_020_Checker_Approve
Scenario: verify Checker user is able to Approve the record
Given user login uls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for Update approve input
And user Search the respective reference id and click on Action button
And user Click on Approve icon button
And user Enter the remarks in Action confirmation popup screen
Then user Click on Remarks button in Action confirmation popup screen
Then user verify the Record got Approved in checker stage

@AT_LE_020_Listview
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Pass the Exceldata value for Update input
Then User validate Living Expense approved record in list view

@AT_LE_021
Scenario: To verify maker user can able to update the living expense parameter Reject record
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And click on view button in living expense module 
And select the approved record of living expense
And go to living expese parameter tab
And select the living expense parameter approved record
And user Pass the Exceldata value for Update Rejet input
And update the living expense paramater record
And click on save button in living expense record
And user goto Inbox and stored the New Ref ID
Then user Click on Action Icon
And user verify the submit and submit New Record from Maker stage

@AT_LE_021_Reject
Scenario: verify Checker user is able to Reject the record
Given user login uls application checkers
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for Update Rejet input
And user Search the respective reference id and click on Action button
And user Click on Reject icon button
And user Enter the remarks for Reject the Record in checker
Then user Click on Remarks button for Reject confirmation Alert
Then user verify the Record got Rejected in checker stage

@AT_LE_021_Reject_ListView
Scenario: Record should get approved and display in the system under Reject List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Pass the Exceldata value for Update Rejet input
Then User validate Living Expense approved record in list view

@AT_LE_022_Modification_Return
Scenario: To verify maker user can able to update the living expense parameter Return record
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And click on view button in living expense module 
And select the approved record of living expense
And go to living expese parameter tab
And select the living expense parameter approved record
And user Pass the Exceldata value for Update Return input
And update the living expense paramater record
And click on save button in living expense record
And user goto Inbox and stored the Ref ID
Then user Click on Action Icon
And user verify submit and submit New Record from Maker stage

@AT_LE_022_Return
Scenario: verify Checker user is able to Approve the record
Given user login uls application as checkers
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for Update Return input
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT_LE_022_Modification_Return_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And user Pass the Exceldata value for Update Return input
Then User validate Living Expense approved record in list view

@AT_LE_023
Scenario: Validate the fields in Living expense parameter sub module
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And click on Pencil icon of existing record
And Navigate to Living expense parameter section
And user Pass the Exceldata value for Living expense parameter view list
And Validate all fields present in Living expense parameter view list
And Validate that records in Living expense parameter view list is non editable
And Search with valid test data in Living expense parameter view list
And Search with invalid test data in Living expense parameter view list
And Validate the export to PDF functionality of Living expense parameter
And Validate the export to Excel functionality of Living expense parameter
And Click on Add icon of Living expense parameter
And Click on back button of lLiving expense parameter

@AT_LE_024
Scenario: Creation of Living expense location record
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And click on Pencil icon of existing record
And Navigate to Living expense location page
And Click on Add icon of Living expense parameter
And user Pass the Exceldata value for Living expense Location creation
And Select the value in Country field of Living expense parameter
And Select the value in Province field of Living expense parameter
And Enter the value in Area factor income of Living expense parameter
And Enter the value in Area factor expenditure of Living expense parameter
Then Click on Save button in Living expense parameter
And user goto Inbox and than stored the Ref ID
Then user Click on Action Icon
And user verify submit and than submit New Record from Maker stage

@AT_LE_025
Scenario: Validate that user can able to create a Living expense location record and approve by checker user
Given user launching the uls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for Living expense Location approve
And user Search the respective reference id and click on Action button
And user Click on Approve icon button
And user Enter the remarks in Action confirmation popup screen
Then user Click on Remarks button in Action confirmation popup screen
Then user verify the Record got Approved in checker stage

@AT_LE_026
Scenario: Rejection of Living expense location record
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And click on Pencil icon of existing record
And Navigate to Living expense location page
And Click on Add icon of Living expense parameter
And user Pass the Exceldata value for Living expense Location Rejection
And Select the value in Country field of Living expense parameter
And Select the value in Province field of Living expense parameter
And Enter the value in Area factor income of Living expense parameter
And Enter the value in Area factor expenditure of Living expense parameter
Then Click on Save button in Living expense parameter
And user goto Inbox and than stored the Refer ID
Then user Click on Action Icon
And user verify the submit and than submit New Record from Maker stage

@AT_LE_026_Reject
Scenario: verify Checker user is able to Reject the record
Given user launch the uls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for Living expense Location Rejection
And user Search the respective reference id and click on Action button
And user Click on Reject icon button
And user Enter the remarks for Reject the Record in checker
Then user Click on Remarks button for Reject confirmation Alert
Then user verify the Record got Rejected in checker stage

@AT_LE_027
Scenario: Return of Living expense location record
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And click on Pencil icon of existing record
And Navigate to Living expense location page
And Click on Add icon of Living expense parameter
And user Pass the Exceldata value for Living expense Location Return
And Select the value in Country field of Living expense parameter
And Select the value in Province field of Living expense parameter
And Enter the value in Area factor income of Living expense parameter
And Enter the value in Area factor expenditure of Living expense parameter
Then Click on Save button in Living expense parameter
And user go Inbox and than stored the Refer ID
Then user Click on Action Icon
And user verify the submit than submit New Record from Maker stage

@AT_LE_027_Return
Scenario: verify Checker user is able to Return the record
Given user log in as uls application checker
And user Click on Checker Mailbox icon
And user Pass the Exceldata value for Living expense Location Return
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT_LE_028_Validation
Scenario: Creation of Living Expenses Location record with invalid data
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And click on Pencil icon of existing record
And Navigate to Living expense location page
And Click on Add icon of Living expense parameter
And user save the Record in Living Expensess
And user Pass the Exceldata value for Living Expense Loccation Invalid
And user verify the Blank field in Living Expense
And Enter the Invalid value in Area factor income of Living expense parameter

@AT_LE_029_Modification
Scenario: Modification of Living Expense Location record
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
#And user click on List view Icon of  Living Expenses 
And user click on First record in living Expense
And Navigate to Living expense location page
And click on Pencil icon of existing record
And user Pass the Exceldata value for Living Expense Loccation Modified
And Enter the Modified value in Area factor income of Living expense parameter
And user save the Record in Living Expensess
And click on Pencil icon of existing record
And user Pass the Exceldata value for Living Expense Loccation ReModified
And Enter the ReModified value in Area factor income of Living expense parameter
And user save the Record in Living Expensess



 