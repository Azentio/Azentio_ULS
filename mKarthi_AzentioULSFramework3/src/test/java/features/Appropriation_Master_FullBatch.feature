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
And User click the action edit icon in Appropriation master
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
And User enter the values in due type for Appropriation master validation
And User click the save icon in Appropriation master
And User verify the invalid field popup confirmation in appropriation

#
@AT-RA-042
Scenario: 