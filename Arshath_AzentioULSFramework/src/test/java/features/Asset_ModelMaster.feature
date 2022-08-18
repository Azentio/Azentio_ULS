Feature:Check the functionality of Asset Model Master
@AT-AAM-T017
Scenario:
Given user log in as uls application maker
Then user click on configurations Tab
When user click product set up menu
And user click on Asset Auto Master Edit icon
And user click on Temp view First Record Edit Icon
And user click on Asset Model Master Tab
And user click on Asset Model Master Add icon
And user Enter Numeric value in character fields
And user Enter Characters value in Numeric Fields
And user click on Asset Model Master Save button
And user Validate the Message and verify it

@AT-AAM-T020
Scenario: verify system display the confirmation message post clicking on Approve button at Checker stage
Given user log in as uls application checker
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Approve icon button
And user Enter the remarks in Action confirmation popup screen
Then user Click on Remarks button in Action confirmation popup screen
Then user verify the Record got Approved in checker stage

@AT-AAM-T020_Approve_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user click on configurations Tab
#When user click Config Manager menu
#And user click list view icon of Warehouse Master
#Then User validate the WareHouse approved record in list view

@AT-AAM-T021_Reject
Scenario: verify Checker user is able to Reject the record
Given user log in as uls application checker
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Reject icon button
And user Enter the remarks for Reject the Record in checker
Then user Click on Remarks button for Reject confirmation Alert
Then user verify the Record got Rejected in checker stage

@AT-AAM-T021_Reject_Listview
Scenario: Record should get approved and display in the system under Reject List view
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
And user click list view icon of Warehouse Master
Then User validate the WareHouse Rejected record in list view

@AT-AAM-T022_Return
Scenario: verify Checker user is able to Approve the record
Given user log in as uls application checker
#And user Click on Chcker Menu icon
And user Click on Checker Mailbox icon
And user Search the respective reference id and click on Action button
And user Click on Return icon button
And user Enter the remarks for Return the Record in checker
Then user Click on Remarks button for Return confirmation Alert
Then user verify the Record got Returned in checker stage

@AT-AAM-T022_Return_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user click on configurations Tab
#When user click Config Manager menu
#And user click Temp view icon of Warehouse Master
#Then User validate the WareHouse Retured record in list view






