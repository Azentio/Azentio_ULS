Feature: Check the functionality of Living Expenses Master
@AT_LE_001_Creation
Scenario: Creation of Living Expenses record with valid data
Given user log in as uls application maker
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
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Pass the Exceldata value for Creation
Then User validate the Living Expense approved record in list view

@AT_LE_003
Scenario: Creation of Living Expenses record with valid data
Given user log in as uls application maker
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
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
Then User validate the Living Expense Rejected record in list view

@AT_LE_004
Scenario: Creation of Living Expenses record with valid data
Given user log in as uls application maker
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
Scenario: verify Checker user is able to Approve the record
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
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Pass the Exceldata value for Validation
Then User validate the Living Expense Modified approved record in list view

@AT_LE_009_Reject_Valid_Modification
Scenario: verify system allow user to modify the Living Expenses 
Given user log in as uls application maker
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
And user Enter Reject Modify value in Description and verify it
And user Enter Reject Modify value in Description2 and verify it
And user try to update the Modified Record
And user goto the Maker Inbox and store the Referance ID
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage

@AT_LE_009_Reject
Scenario: verify Checker user is able to Reject the record
Given user log in as uls application checker
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Reject icon button
And user Enter the remarks for Reject the Record in checker
Then user Click on Remarks button for Reject confirmation Alert
Then user verify the Record got Rejected in checker stage

@AT_LE_009_Reject_ListView
Scenario: Record should get approved and display in the system under Reject List view
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
Then User validate the Living Expense Modified Rejected record in list view

@AT_LE_010_Return_Valid_Modification
Scenario: verify system allow user to modify the Living Expenses 
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
And user Enter value in Description and verify it
And user Enter value in Description2 and verify it
And user Enter value in Description3 and verify it
And user select Rule value and verify it
And user choose Calender Effective Date and verify it
And user save the Record in Living Expenses
And user Goto the Temp view screen of living Expense
And user click on First record in living Expense
And user Enter Return Modify value in Description and verify it
And user Enter Return Modify value in Description2 and verify it
And user try to update the Modified Record
And user goto the Maker Inbox and store the Referance ID
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage

@AT_LE_010_Return
Scenario: verify Checker user is able to Approve the record
Given user log in as uls application checker
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT_LE_010_Return_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker   
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
Then User validate the Living Expense Modify Returned record in list view

@AT_LE_013_Parameter_Creation
Scenario: Creation of Living Expense Parameter record with valid data
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
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
And user Enter value in Description and verify it
And user select the code value
And user Enter the value
And user save the Record in Living Expenses
And user goto the Maker Inbox and store the Referance ID
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage

@AT_LE_014_Parameter_Approve
Scenario: verify Checker user is able to Approve the record
Given user log in as uls application checker
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Approve icon button
And user Enter the remarks in Action confirmation popup screen
Then user Click on Remarks button in Action confirmation popup screen
Then user verify the Record got Approved in checker stage

@AT_LE_014_Parameter_Listview
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Click on First Record Eye icon
And user click on Living Expenses Parameter
Then User validate the Living Expense Parameter approved record in list view

@AT_LE_015_Parameter_creatin_for_Reject
Scenario: Creation of Living Expense Parameter record with valid data
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
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
And user Enter value in Reject Description and verify it
And user select the code value
And user Enter the Reject value
And user save the Record in Living Expenses
And user goto the Maker Inbox and store the Referance ID
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage

@AT_LE_015_Parameter_Reject
Scenario: verify Checker user is able to Reject the record
Given user log in as uls application checker
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Reject icon button
And user Enter the remarks for Reject the Record in checker
Then user Click on Remarks button for Reject confirmation Alert
Then user verify the Record got Rejected in checker stage

@AT_LE_015_Parameter_Reject_ListView
Scenario: Record should get approved and display in the system under Reject List view
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses
And user Click on First Record Eye icon
And user click on Living Expenses Parameter
Then User validate the Living Expense Parameter Rejected record in list view

@AT_LE_016_Parameter_creatin_for_Return
Scenario: Creation of Living Expense Parameter record with valid data
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user click on List view Icon of  Living Expenses 
And user click on Add Icon for Living Expenses
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
And user goto the Maker Inbox and store the Referance ID
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage

@AT_LE_016_Parameter_Return
Scenario: verify Checker user is able to Approve the record
Given user log in as uls application checker
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT_LE_016_Parameter_Return_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And user Click on First Record Eye icon
And user click on Living Expenses Parameter
Then User validate the Living Expense Parameter Returned record in list view

@AT_LE_016_Parameter_Invalid
Scenario: Creation of Living Expense Parameter record with invalid data
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
And user click on First record in living Expense
And user click on Living Expenses Parameter
And user click on Add Icon for Living Expenses
And user Enter Invalid value in Description and verify it
And Validate the Message and verify it
And user save the Record in Living Expenses
And user verify the Blank field in Living Expense

@AT-LE-022_Modification_Return
Scenario: verify Checker user is able to Approve the record
Given user log in as uls application checker
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT-LE-022_Modification_Return_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user Goto the Temp view screen of living Expense
#Then User validate the Living Expense Returned record in list view



