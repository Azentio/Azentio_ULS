Feature: Check the functionality of the Project Ubit Details
@AT_PM_T015
Scenario: verify the Unit details Parameter details List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
#When user click on Project set up menu
And user click on project master List view icon
And user click on List view Edit Icon
And user click on unit details Add icon and verify the functionality
And user Enter the value in Building Name and verify it
And user Enter the value in Unit No and verify it
And user Enter the value in Floor and verify it
And user Enter the value in Saleable Area sq ft and verify it
And user Enter the value in Unit No and verify it
And user Enter the value in Exposed No and verify it
And user verify the Active De-Active status and verify it
And user save the Record in unit Details and verify the Message
And User verify the list view Record is Non-Editable


@AT_PM_T022
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
Then user click on configurations Tab
When user click Config Manager menu
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Return icon
And user Enter the remarks for Return the Record
Then user Click on Remarks button for Return confirmation
Then user verify the Record got Return 

@AT_PM_T022_1
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
#When user click product set up menu
And user click Edit view icon of sub product retail
Then User validate the Returned record in list view

@AT_PM_T023
Scenario: verify user is able to add new Unit details record in the system by entering valid data
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
#When user click on Project set up menu
And user click on project master List view icon
And user click on List view Edit Icon
And user click on unit details Add icon and verify the functionality
And Enter the value in Building Name and verify it
And Enter the value in Unit No and verify it
And Enter the value in Floor and verify it
And Enter the value in Saleable Area sq ft and verify it
And Enter the value in Unit No and verify it
And Enter the value in Exposed No and verify it
And user save the Record in unit Details and verify the Message

@AT_PM_T024
Scenario: verify user is able to modify Unit details record in the system
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on project master Temp view icon
And user click on List view Edit Icon
And user click on unit details Edit icon
And user update the Excelsheet Testdata for modify 
And Enter the Modify value in Building Name and verify it
And Enter the Modify value in Unit No and verify it
And Enter the Modify value in Floor and verify it
And Enter the Modify value in Saleable Area sq ft and verify it
And Enter the Modify value in Exposed No and verify it
And user save the Record in unit Details and verify the Message

@AT_PM_T024.1
Scenario: verify user is able to modify Unit details record in the system
Given user log in as uls application maker
Then user change Application Type as Los
Then user click on configurations Tab
When user click Config Manager menu
And user click on project master Temp view icon
And user click on List view Edit Icon
And user click on unit details Edit icon
And Click the toggle button and change status
And user save the Record in unit Details and verify the Message










