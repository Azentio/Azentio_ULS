Feature: check the functionality of the Warehouse Master
@AT_WHM_T001_creation
Scenario: Creation of Warehouse Master record_ Add Template
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
And user click on Add icon for Warehouse master
And user Enter the value in description and verify it
And user Enter the value in Address field and verify it
And user Enter the value in country field and verify it
And user Enter the value in state field and verify it
And user Enter the value in Location field and verify it
And user Enter the value in Zip code field and verify it
And user Enter the value in Phone field and verify it
And user Enter the value in Fax field and verify it
And user Enter the value in Email field and verify it
And user Enter the value in Contact person field and verify it
And user save the warehouse master Record
And user goto the Maker Inbox and store the Referance ID
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage

@AT_WHM_T001_Approve
Scenario: verify Checker user is able to Approve the record
Given user login as uls application checker
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Approve icon button
And user Enter the remarks in Action confirmation popup screen
Then user Click on Remarks button in Action confirmation popup screen
Then user verify the Record got Approved in checker stage

@AT_WHM_T001_Approve_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
Then User validate the WareHouse approved record in list view

@AT_WHM_T002_Reject_Creation
Scenario: Creation of Warehouse Master record_ Add Template
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
And user click on Add icon for Warehouse master
And user Enter the value in description and verify it
And user Enter the value For Address field and verify it
And user Enter the value in country field and verify it
And user Enter the value in state field and verify it
And user Enter the value in Location field and verify it
And user Enter the value in Zip code field and verify it
And user Enter the value in Phone field and verify it
And user Enter the value in Fax field and verify it
And user Enter the value For Email field and verify it
And user Enter the value in Contact person field and verify it
And user save the warehouse master Record
And user goto the Maker Inbox and store the Referance ID l
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage l

@AT_WHM_T002_Reject
Scenario: verify Checker user is able to Reject the record
Given user login as uls application checker l
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Reject icon button
And user Enter the remarks for Reject the Record in checker
Then user Click on Remarks button for Reject confirmation Alert
Then user verify the Record got Rejected in checker stage

@AT_WHM_T002_Reject_ListView
Scenario: Record should get approved and display in the system under Reject List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
Then User validate the WareHouse Rejected record in list view

@AT_WHM_T003_Return_Creation
Scenario: Creation of Warehouse Master record_ Add Template
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
And user click on Add icon for Warehouse master
And user Enter the value in description and verify it
And user Enter the value to Address field and verify it
And user Enter the value in country field and verify it
And user Enter the value in state field and verify it
And user Enter the value in Location field and verify it
And user Enter the value in Zip code field and verify it
And user Enter the value in Phone field and verify it
And user Enter the value in Fax field and verify it
And user Enter the value to Email field and verify it
And user Enter the value in Contact person field and verify it
And user save the warehouse master Record
And user goto the Maker Inbox and store the Referance ID ll
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage ll

@AT_WHM_T003_Return
Scenario: verify Checker user is able to Approve the record
Given user login as uls application checker ll
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT_WHM_T003_Return_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click Temp view icon of Warehouse Master
Then User validate the WareHouse Retured record in list view

@AT_WHM_T004_Validation
Scenario: Creation of Warehouse Master record_ Add Template
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
And user click on Add icon for Warehouse master
And user Enter characters in numeric field
And user save the warehouse master Record
And user verify the validation Message in warehouse Master


@AT_WHM_T005_Modification
Scenario: Modification of Warehouse Master record
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
And user click on Add icon for Warehouse master
And user Enter the value in description and verify it
And user Enter the value in Address field and verify it
And user Enter the value in country field and verify it
And user Enter the value in state field and verify it
And user Enter the value in Location field and verify it
And user Enter the value in Zip code field and verify it
And user Enter the value in Phone field and verify it
And user Enter the value in Fax field and verify it
And user Enter the value in Email field and verify it
And user Enter the value in Contact person field and verify it
And user save the warehouse master Record
And user click Temp view icon of Warehouse Master
And user click on First Record Edit icon
And user Enter the value in description and Modify it
And user Enter the value in Address field and Modify it
And user click on the update button
And user click list view icon of Warehouse Master
And user click on First Record Edit icon
And user Enter the value in description and ReModify it
And user Enter the value in Address field and ReModify it
And user click on the update button
And user goto the Maker Inbox and store the Referance ID lll
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage lll

@AT_WHM_T005_Modification_Approve
Scenario: verify Checker user is able to Approve the record
Given user login as uls application checker lll
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Approve icon button
And user Enter the remarks in Action confirmation popup screen
Then user Click on Remarks button in Action confirmation popup screen
Then user verify the Record got Approved in checker stage

@AT_WHM_T005_Modification_Approve_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
Then User validate the WareHouse Modify approved record in list view

@AT_WHM_T006_Invalid
Scenario: verify while modification system enters the invalid data (Invalid data types)
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
And user click Temp view icon of Warehouse Master
And user click on First Record Edit icon
And user Enter the value in description and Modify it
And user Enter the value in Address field and Modify it
And user Enter Invalid Data in warehouse Master

@AT_WHM_T007_Modification_Reject
Scenario: Modification of Warehouse Master record
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
And user click on Add icon for Warehouse master
And user Enter the value in description and verify it
And user Enter the value in Address field and verify it
And user Enter the value in country field and verify it
And user Enter the value in state field and verify it
And user Enter the value in Location field and verify it
And user Enter the value in Zip code field and verify it
And user Enter the value in Phone field and verify it
And user Enter the value in Fax field and verify it
And user Enter the value in Email field and verify it
And user Enter the value in Contact person field and verify it
And user save the warehouse master Record
And user click Temp view icon of Warehouse Master
And user click on First Record Edit icon
And user Enter the value in description and Modify Reject it
And user Enter the value in Address field and Modify Reject it
And user click on the update button
And user goto the Maker Inbox and store the Referance ID llll
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage llll

@AT_WHM_T007_Modification_Checker_Reject
Scenario: verify Checker user is able to Approve the record
Given user login as uls application checker llll
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Reject icon button
And user Enter the remarks for Reject the Record in checker
Then user Click on Remarks button for Reject confirmation Alert
Then user verify the Record got Rejected in checker stage

@AT_WHM_T007_Modification_Checker_Reject_Listview
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
Then User validate the WareHouse Modify Rejected record in list view

@AT_WHM_T008_Modification_Return
Scenario: Modification of Warehouse Master record
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
And user click on Add icon for Warehouse master
And user Enter the value in description and verify it
And user Enter the value in Address field and verify it
And user Enter the value in country field and verify it
And user Enter the value in state field and verify it
And user Enter the value in Location field and verify it
And user Enter the value in Zip code field and verify it
And user Enter the value in Phone field and verify it
And user Enter the value in Fax field and verify it
And user Enter the value in Email field and verify it
And user Enter the value in Contact person field and verify it
And user save the warehouse master Record
And user click Temp view icon of Warehouse Master
And user click on First Record Edit icon
And user Enter the value in description and Modify Return it
And user Enter the value in Address field and Modify Return it
And user click on the update button
And user goto the Maker Inbox and store the Referance ID lllll
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage lllll

@AT_WHM_T008_Modification_Checker_Return
Scenario: verify Checker user is able to Approve the record
Given user login as uls application checker lllll
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT_WHM_T008_Modification_Checker_Return_Listview
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click Temp view icon of Warehouse Master
Then User validate the WareHouse Modify Retured record in list view

@AT_WHM_T009_Active_Deactive
Scenario: verify the functionality of Activate/Deactivate button
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
#And user click list view icon of Warehouse Master
And user click Temp view icon of Warehouse Master
And user click on First Record Edit icon
And user verify the status button
And user verify the status is Active
And user click on the update button
And user click Temp view icon of Warehouse Master
And user verify the status is Deactive
#And user verify the Back button and click

@AT_WHM_T010
Scenario: To verify list view of wareHouse master
Given user log in as uls application maker
Then user change Application Type as Los
And go to configuration main menu
And Go to config manager main menu
And click on view button in ware house master
Then verify list view records are non editable
Then verify user can able to add the record in to the ware house master screen

@AT_WHM_T011
Scenario:  TO verify user can able to serach the list view record with matching and un matching input and user can able to download the the xls and pdf format file
Given user log in as uls application maker
Then user change Application Type as Los
And go to configuration main menu
And Go to config manager main menu
And click on view button in ware house master
And click on search button in ware house list view
And enter the matching data in search test box
Then verify user can able to see the matching records
And enter invalid text inputin search box
Then verify system should not show the result for the un matched record
And click on export button
And choose xls format to download the Xls file
Then verify xls file is downloded in download section
And click on export button
And choose pdf format to download pdf file
Then verify pdf file is downloded in download section

@AT_WHM_T012
Scenario: To verify the list view data in wareHouse master
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And click on view button in ware house master
And select the first approved record
And Get The approved record data
Then verify System should display the currect description value
Then verify system should display the currect address value
#Then verify System should display the currect country value
#Then verify system should display the currect state value
#Then verify system should display the currect city value
#Then verify system should display the currect zip code value
Then verify system should display the currect phone 1 value
Then verify system should display the currect fax value
Then verify system should display the currect mail value
Then verify system shoudl display the currect contarct person value
Then verify system shoudl display the exact status of the record

@AT_WHM_T013
Scenario: To verify the list view of WIP Record
Given user log in as uls application maker
Then user change Application Type as Los
And go to configuration main menu
And Go to config manager main menu
And click on view button in ware house master
And user click list view icon of Warehouse Master
And user click on Add icon for Warehouse master
And user Enter the value in description and verify it
And user Enter the value in Address field and verify it
And user Enter the value in country field and verify it
And user Enter the value in state field and verify it
And user Enter the value in Location field and verify it
And user Enter the value in Zip code field and verify it
And user Enter the value in Phone field and verify it
And user Enter the value in Fax field and verify it
And user Enter the value in Email field and verify it
And user Enter the value in Contact person field and verify it
And user save the warehouse master Record
And click on temp view in wareHouse master screen
Then verify WIP list view records are non editable
Then verify user can able to add the record in to the ware house master screen
And click on search button in ware house list view
And enter the matching data in search test box
Then verify user can able to see the matching record
And enter invalid text inputin search box
Then verify system should not show the result for the un matched record
And click on export button
And choose xls format to download the Xls file
Then verify xls file is downloded in download section
And click on export button
And choose pdf format to download pdf file
Then verify pdf file is downloded in download section
And click on temp view in wareHouse master screen
And select the first record in WIP
And Get The approved record data
Then verify System should display the currect description value
Then verify system should display the currect address value
#Then verify System should display the currect country value
#Then verify system should display the currect state value
#Then verify system should display the currect city value
#Then verify system should display the currect zip code value
Then verify system should display the currect phone 1 value
Then verify system should display the currect fax value
Then verify system should display the currect mail value
Then verify system shoudl display the currect contarct person value
Then verify system shoudl display the exact status of the record




