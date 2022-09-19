Feature: To verify Checker user is able to Return the record
#PM_10_34
@AT-PM-T018
Scenario: Checker user should able to Return the record
Given User Login into checker in project master
Then Click the menu icon in project master checker
And Click the inbox icon in project master checker
And Click the action editicon using reference id in project master
And Click return button in project master checker
Then verify the return confirmation in project master checker
@AT-PM-T018.1
Scenario: The same record should get again move to the Maker stage for the modification
Given User Login into maker in project master
Then Click the project setup in project master
And Click the project master wip
And Click the inbox icon in project master maker
Then Verify the return record present in the maker stage