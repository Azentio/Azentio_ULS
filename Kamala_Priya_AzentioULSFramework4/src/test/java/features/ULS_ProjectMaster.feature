  Feature: Check the functionality of project master
  
  #	PM_02_02,PM_02_03,PM_02_04"
@AT-PM-T004-D1
  Scenario: Project Master - To verify the impact when user enter numeric value in character field,
  													 characters value in numeric field and only special characters value in any field
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And click on eye icon of project master
Then click on add button
Then Choose the data set id for invalid data types in project master
Then verify system should not allow to enter invalid datatypes in project master

#PM_03_09
@AT-PM-T007-D1
  Scenario: Project Master - To verify the impact when user enter numeric value in character field,
  													 characters value in numeric field and only special characters value in any field
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And click on eye icon of project master
Then choose the data set id for modification with invalid data
Then click on edit button of record to modify in project master
Then verify system should not allow to enter invalid datatypes in project master

#PM_09_02, PM_09_03, PM_09_04, PM_09_09, PM_09_10, PM_09_11, PM_09_12
@AT-PM-T016
Scenario: To verify the functionality of project master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
Then choose the data set id for list view verification in project master
And Click the project setup edit icon in project master for validation
And Verify the Values in List view should be non editable
And Verify the functionality of Add button
And Verify the functionality of Export to PDF button
And Verify the functionality of Export to Excel button
And Verify the functionality of Search box with matching data
And Verify the functionality of Selarch box with mismatch data
And Click the inbox icon in maker for project master validation
And Click the inbox action edit icon in project master validation
And Verify the functionality of View in approved records button

#PM-11-01, PM-11-02, PM-11-03, PM-11-04
@AT-PM-T019
Scenario: To verify the impact when user keep any mandatory field blank and click on save button
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
Then choose the data set id for blank field validation in project master
And Click the project setup edit icon in project master for validation
And Click the action edit icon project master for mandatoryField validation
And Click the building details add icon in project master
And Verify the impact when user enters only special characters value in any field
And Verify the impact when user enter numeric value in character field
And Verify the impact when user enter characters  value in numeric field
Then Click the save button in project master
And Verify the impact when user keep any mandatory field blank

#PM-10-32
@AT-PM-T017.1
Scenario: To verify the checker approve the record for project master in creation
And choose the data set id for checker approval in report master
Given Get the URL and login as Checker in project master
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Approve icon
And user Enter the remarks in Action confirmation popup
Then user Click on Remarks button in Action confirmation popup
Then user verify the Record got Approved

@AT-PM-T017.1.1
Scenario: To verify the checker approve the record for project master in creation
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And click on eye icon of project master
Then User validate the updated record in list view

#PM-10-33
@AT-PM-T017.2
Scenario: To verify the checker reject the record for project master in creation
And choose the data set id for checker reject in project master
Given Get the URL and login as Checker in project master
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected

@AT-PM-T017.2.1
Scenario: To l the checker reject the record for project master in creation
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And click on eye icon of project master
And Click the inboxmailicon in maker stage for reject record verify
And user verify the rejected record removed from the system

#PM-10-34
@AT-PM-T018
Scenario: To verify the checker return the record for project master in creation
And choose the data set id for checker return in project master
Given Get the URL and login as Checker in project master
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user click on return icon
And user enter the remark for return the record
And user click the final return button
Then user verify the return record

@AT-PM-T018.1
Scenario: To verify the checker return the record for project master in creation
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And click on eye icon of project master
And Click the inboxmailicon in maker stage for reject record verify
And user verify the returned record removed from the system

#PM-12-12
@AT-PM-T021
Scenario: To verify the checker reject the record for project master in updation
And choose the data set id for checker reject in project master in updation
Given Get the URL and login as Checker in project master
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected

@AT-PM-T021.1
Scenario: To verify the checker reject the record for project master in updation
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And click on eye icon of project master
And Click the inboxmailicon in maker stage for reject record verify
And user verify the rejected record removed from the system

@AT_PM_T022
Scenario: verify Checker user is able to return the record in project master in updation
And choose the data set id for checker return in project master in updation
Given Get the URL and login as Checker in project master
And Click the configuration
Then Click the config Manager
#And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user click on return icon
And user enter the remark for return the record
And user click the final return button
Then user verify the return record

@AT_PM_T022_1
Scenario: Record should get approved and display in the system under Approved List view
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And click on eye icon of project master
#When user click product set up menu
And Click the inboxmailicon in maker stage for reject record verify
And user verify the returned record removed from the system

#PM_06_02
@T12
Scenario: To verify parameter list view record should get opened with non editable
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
Then click on temp view in project master
And go to building details tab
Then verify building details records are in non editable mode

#PM_06_08
@T13
Scenario: To verify back button fucntionality in building details record
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
Then click on temp view in project master
And go to building details tab
Then click on add button in building details 
And click on back button
Then verify screen should get changed to previous screen