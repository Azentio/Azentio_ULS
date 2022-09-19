Feature: To verify the functionality of project master and verify the checker reject, return and approve
#PM-09-02, PM-09-03, PM-09-04, PM-09-09, PM-09-10, PM-09-11, PM-09-12
@AT-PM-T016
Scenario: To verify the functionality of project master
Given User login into maker in project master for validation
Then Click the project setup in project master for validation
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

#PM-10-32
@AT-PM-T017.1
Scenario: To verify the checker approve the record for project master in creation
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Approve icon
And user Enter the remarks in Action confirmation popup
Then user Click on Remarks button in Action confirmation popup
Then user verify the Record got Approved

@AT-PM-T017.1.1
Scenario: To verify the checker approve the record for project master in creation
Given User login into maker in project master for validation
Then Click the project setup in project master for validation
And Click the project setup eye icon in project master for validation
Then User validate the updated record in list view

#PM-10-33
@AT-PM-T017.2
Scenario: To verify the checker reject the record for project master in creation
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected

@AT-PM-T017.2.1
Scenario: To l the checker reject the record for project master in creation
Given User login into maker in project master for validation
Then Click the project setup in project master for validation
And Click the project setup eye icon in project master for validation
And Click the inboxmailicon in maker stage for reject record verify
And user verify the rejected record removed from the system

#PM-10-34
@AT-PM-T018
Scenario: To verify the checker return the record for project master in creation
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user click on return icon
And user enter the remark for return the record
And user click the final return button
Then user verify the return record

@AT-PM-T018.1
Scenario: To verify the checker return the record for project master in creation
Given User login into maker in project master for validation
Then Click the project setup in project master for validation
And Click the project setup eye icon in project master for validation
And Click the inboxmailicon in maker stage for reject record verify
And user verify the returned record removed from the system

#PM-11-01, PM-11-02, PM-11-03, PM-11-04
@AT-PM-T019
Scenario: To verify the impact when user keep any mandatory field blank and click on save button
Given User login into maker in project master for validation
Then Click the project setup in project master for validation
And Click the project setup edit icon in project master for validation
And Click the action edit icon project master for mandatoryField validation
And Click the building details add icon in project master
And Verify the impact when user enters only special characters value in any field
And Verify the impact when user enter numeric value in character field
And Verify the impact when user enter characters  value in numeric field
Then Click the save button in project master
And Verify the impact when user keep any mandatory field blank

#PM-12-01,PM-12-02
@AT-PM-T020
Scenario: To verify system allow user to modify the Building details


#PM-12-12
@AT-PM-T021
Scenario: To verify the checker reject the record for project master in updation
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected

@AT-PM-T021.1
Scenario: To verify the checker reject the record for project master in updation
Given User login into maker in project master for validation
Then Click the project setup in project master for validation
And Click the project setup eye icon in project master for validation
And Click the inboxmailicon in maker stage for reject record verify
And user verify the rejected record removed from the system





