Feature: To verify the Appropriation master full flow
#APM_01_001, APM_01_002, APM_01_003, APM_01_012, APM_01_004, APM_01_005, APM_01_006, APM_01_007, APM_01_008, APM_01_009, APM_01_011, APM_01_015
@AT-AM-001
Scenario: To verify the user able to create the Appropriation record in maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click the Appropriation master edit icon
And User click the add icon in Appropriation master
And User enter the values in description for Appropriation master
And User enter the values in Appropriation Type for Appropriation master
And User enter the values in Remarks for Appropriation master
And User click the save icon in Appropriation master
And User get the save confirmation msg in Appropriation master
And User click the action edit icon in Appropriation master
And User click the add icon in list of Appropriation details for Appropriation master
And User enter the values in due type for Appropriation master
And User enter the values in sequence no for Appropriation master
And User enter the values in parent sequence no for Appropriation master
And User enter the values in list of appropriation remarks for Appropriation master
And User click the save icon in Appropriation master
And User get the save confirmation msg1 in Appropriation master

#APM_01_013, APM_01_014
@AT-AM-002
Scenario: To verify the user can able to deactivate the record and the record should removed the record from the system
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click the Appropriation master edit icon
And User click the action edit icon in Appropriation master
And User click the status icon in appropriation master
And User click the UpdateSave icon in Appropriation master
#And User click the action edit icon in Appropriation master
Then User click the inboxmail icon in asset CD master
And User search the appropriation master in inbox
And User get the reference id in appropriation master test case2
And User click the first record in appropriation master
And User click the cancel icon in appropriation master
And User enter the popup input messege in appropriation master
And user click the popup cancel in appropriation master
And User get the cancel confirmation messege in appropriation master
And User verify the record removed from the system

#FRM_02_001
@AT-AM-003
Scenario: To verify the user enter the invalid details in appropriation master
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click the Appropriation master edit icon
And User click the action edit icon in Appropriation master
And User click the add icon in list of Appropriation details for Appropriation master
And User enter the values in due type for Appropriation master validation
And User enter the values in sequence no for Appropriation master validation
And User enter the values in parent sequence no for Appropriation master validation
And User enter the values in list of appropriation remarks for Appropriation master validation
And User click the save icon in Appropriation master
And User verify the invalid field popup confirmation in appropriation


#FRM_02_002, FRM_02_003, FRM_02_004
@AT-AM-004
Scenario: To verify system display the proper validation message when user  keep any mandatory fields blank and clicks on save button
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click the Appropriation master edit icon
And User click the action edit icon in Appropriation master
And User click the add icon in list of Appropriation details for Appropriation master
And User enter the values in due type for Appropriation master validation1
And User click the save icon in Appropriation master
And User verify the invalid field popup confirmation in appropriation

@AT-AM-005
Scenario: To verify user can able to update the before approve record
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click the Appropriation master edit icon
And User click the action edit icon in Appropriation master
And User update the values in description for Appropriation master
And User update the values in Appropriation Type for Appropriation master
And User update the values in Remarks for Appropriation master
And User click the update save icon in Appropriation master
And User click the inbox icon in Appropriation master
And User search the appropriation master record
And User click the action edit icon and get the reference id in Appropriation master
And User click the submit icon in appropriation master maker
And User enter the popup remark and submit the appropriation master
And User get confirmation message and checker id in appropriation master

@AT-AM-006
Scenario: To verify user can able to approve the record in checker stage
And Get the test data for appropriation master test case6
Given User login as uls checker in appropriation master
And User click the inbox icon in Appropriation master
#And User click the search icon in appropriation master and get the reference id
And User search the appropriation master in inbox
And User search the respective reference id and click on Action button in appropriation master
And User click on Approve icon in appropriation master checker
And User click the popup remarks in appropriation master checker
And User click the popup approve in appropriation master checker
Then User verify the Record got Approved in appropriation checker

@AT-AM-007
Scenario: To verify while modification system allow user to save the record with valid data
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click the Appropriation master eye icon
And User click the action edit icon in Appropriation master
And User update the description for Appropriation master valitation
And User click the update save icon in Appropriation master
And User verify while modification, when user keep any mandatory field blank in appropriation master
And User update the values in description for Appropriation master
And User update the values in Appropriation Type for Appropriation master valitation
And User click the update save icon in Appropriation master
And User verify while modification system enters the invalid data in appropriation master
And User update the values in Appropriation Type for Appropriation master
And User click the update save icon in Appropriation master
And User get the success confirmation message in appropriation master

@AT-AM-008
Scenario: To verify user can able to approve the record in checker stage
And Get the test data for appropriation master test case8
Given User login as uls checker in appropriation master
And User click the inbox icon in Appropriation master
#And User click the search icon in appropriation master and get the reference id
And User search the appropriation master in inbox
And User search the respective reference id and click on Action button in appropriation master
And User click the reject icon in appropriation master checker
And User click the popup remarks in appropriation master checker
And User click the popup reject in appropriation master checker
Then User verify the Record got Rejected in appropriation checker

@AT-AM-009
Scenario: To verify user can able to approve the record in checker stage
And Get the test data for appropriation master test case9
Given User login as uls checker in appropriation master
And User click the inbox icon in Appropriation master
#And User click the search icon in appropriation master and get the reference id
And User search the appropriation master in inbox
And User search the respective reference id and click on Action button in appropriation master
And User click the return icon in appropriation master checker
And User click the popup remarks in appropriation master checker
And User click the final return icon in appropriation master checker
Then User verify the Record got Returned in appropriation master checker

@AT-AM-010
Scenario: To verify the functionality of status button in appropriation master
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click the Appropriation master edit icon
Then User click the back button in appropriation master
And User click the Appropriation master edit icon
And User click the action edit icon in Appropriation master
And User verify the status button is active stage in appropriation master
And User click the status icon in appropriation master
And User verify the status button is deactive stage in appropriation master

@AT-AM-011
Scenario: To verify the functionality of PDF and Excel file download
And Get the test data for appropriation master test case11
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
Then User click the config manager in Appropriation master
And User click the Appropriation master eye icon
And user verify add button is displayed for appropriation master
And user verify search for record icon is displayed  for appropriation master
And user verify export to pdf option is displayed  for appropriation master
And user verify export to excel option is displayed for appropriation master
And User verify the Values in List view should be non editable in appropriation master
And User verify the functionality of Export to PDF button in appropriation master
And User verify the functionality of Export to Excel button in appropriation master
And user verify the search results show matched data for appropriation master
And user verify the search results shows no data for appropriation master


