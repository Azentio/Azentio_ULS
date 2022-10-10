Feature: Testing the Functionalities of Allocation Master
# This Automation testcase includes manual test cases AM_03_03 AM_03_04 AM_03_07 AM_03_08 AM_03_09 AM_03_14
@AT-ALM-007
Scenario: User verify system allow user to modify the Allocation Master
Given user log in as uls application maker
When user click the configuration menu for Allocation Master 
And User click the Configuration Manager option
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
# This Automation testcase includes manual test cases AM_07_15
@AT-ALM-019.1
Scenario: Checker return for allocation details modification record
Given user log in as uls application checker for report master record
And user Click on Mailbox icon for Allocation master record
And Search the respective reference id and click on Action button for Allocation master record
And user Click on return icon for Allocation master record
And user Enter the remarks in Action confirmation popup for Allocation master record
Then user Click on Return button in Action confirmation popup for Allocation master record
Then user verify the Record got returned for Allocation master record
@AT-ALM-019.2
Scenario: Checker returned and verify maker saved should reflect in checker
Given user log in as uls application maker
And user Click on Mailbox icon for Allocation master record
And Search the respective reference id and verify record should returned to maker