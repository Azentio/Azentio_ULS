Feature: Testing the functionalities of Report Master
# This Automation testcase includes manual test cases RM_03_02 RM_03_03 RM_03_04 RM_03_05 RM_03_09 RM_03_10
# RM_03_11 RM_03_16 RM_03_17
@AT-RA-006
Scenario: User verify system allow user to modify the Report Master
Given user log in as uls application maker
When user click the configuration menu for Report Master 
And User click the Configuration Manager option
And User click Approved list icon for Report Master
And User click First Edit icon in Approved list view for Report Master
And User click and update the Report Name
And User click and update the Report Name2
And User click and update the Report Name3
And User click and update the Report Description
And User Select and update the Report Type
And User click and update the Report Url
And User Select and update the Report Category
And User Verify the Status button in Report Master
And User click Save button for report master updation 
And user click inbox to approve record for report master
And user search report Master
And user store reference number and click the first record in report master inbox view
And user submit report master record in maker
And user capture checker id for checker submit
# This Automation testcase includes manual test cases RM_03_12 RM_03_13
@AT-RA-007.1
Scenario: Checker approve and verify maker saved should reflect in checker
Given user log in as uls application checker for report master record
And user Click on Mailbox icon for report master record
And Search the respective reference id and click on Action button for report master record
And user Click on Approve icon for report master record
And user Enter the remarks in Action confirmation popup for report master record
Then user Click on Approve button in Action confirmation popup for report master record
Then user verify the Record got Approved for report master record
@AT-RA-007.2
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
When user click the configuration menu for Report Master 
And User click the Configuration Manager option
And User click Approved list icon for Report Master
Then User Validate the updated report master record in list view
@AT-RA-017
Scenario: User verify system allow user to modify the Report Master
Given user log in as uls application maker
When user click the configuration menu for Report Master 
And User click the Configuration Manager option
And User click Approved list icon for Report Master
And User click First Edit icon in Approved list view for Report Master
And User click first Edit Icon in Approved list view for report parameter details
And User click and update the Template field in report parameter details
And User click and update the parameter1 in report parameter details
And User click and update param1 Description1 in report parameter
And User click and update param1 Description2 in report parameter
And User click and update param1 Description3 in report parameter
And User click and update parameter2 in report parameter
And User click and update param2 Description2 in report parameter
And User click and update param2 Description3 in report parameter
And User select and update IsMandatory in report parameter
And User click and update sequenceNo in report parameter
And User click and update date format in report parameter
And User click and update Nullable values in report parameter
Then User click the Update icon in report parameter
And user click inbox to approve record for report master
And user search report Master
And user store reference number and click the first record in report master inbox view
And user submit report master record in maker
And user capture checker id for checker submit
@AT-RA-018
Scenario: To verify while modification  when user keep any mandatory field blank and click on save button
Given user log in as uls application maker
When user click the configuration menu for Report Master 
And User click the Configuration Manager option
And User click Approved list icon for Report Master
And User click First Edit icon in Approved list view for Report Master
And User click first Edit Icon in Approved list view for report parameter details
And User Select and change the Template field in report parameter details
And User click and clear the parameter1 in report parameter details
And User click and clear the param1 Description1 in report parameter
And User click and clear the param1 Description2 in report parameter
And User click and clear the param1 Description3 in report parameter
And User click and clear the parameter2 in report parameter
And User click and clear the param2 Description2 in report parameter
And User click and clear the param2 Description3 in report parameter
And User click and clear the sequenceNo in report parameter
And User click and clear the date format in report parameter
And User click and clear the Nullable values in report parameter
Then User click the Update icon in report parameter
And User Validate the blank field for Template field in report parameter details
And User Validate the blank field and invalid data for Parameter1 field in report parameter details
And User Validate the blank field and invalid data for Param1 Description1 field in report parameter details
And User Validate the blank field and invalid data for Param1 Description2 field in report parameter details
And User Validate the blank field and invalid data for Param1 Description3 field in report parameter details
And User Validate the blank field and invalid data for Parameter2 field in report parameter details
And User Validate the blank field and invalid data for Param2 Description2 field in report parameter details
And User Validate the blank field and invalid data for Param2 Description3 field in report parameter details
And User Validate the blank field and invalid data for sequenceNo field in report parameter details
And User Validate the blank field and invalid data for date format field in report parameter details
And User Validate the blank field and invalid data for Nullable values field in report parameter details





