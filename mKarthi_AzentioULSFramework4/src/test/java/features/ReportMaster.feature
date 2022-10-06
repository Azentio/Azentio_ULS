Feature: To verify the report parameter creation of the report master
#RM_05_01, RM_05_02, RM_05_03, RM_05_04, RM_05_05, RM_05_06, RM_05_07, RM_05_08, RM_05_09, RM_05_10, RM_05_11, RM_05_12, RM_05_13, RM_05_17
@AT-RA-T012
Scenario: To verify the user can able to create the report parameter
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
And User click the report master edit icon
Then User verify the functionality of Add button in report master
And User verify the functionality of Back button in report master
Then User verify the functionality of Add button in report master
And User click the report parameter add icon in report master
And User Enter the Template in report parameter
And User Enter the parameter1 in report parameter
And User Enter the param1 Description1 in report parameter
And User Enter the param1 Description2 in report parameter
And User Enter the param1 Description3 in report parameter
And User Enter the parameter2 in report parameter
And User Enter the param2 Description2 in report parameter
And User Enter the param2 Description3 in report parameter
And User Enter the IsMandatory in report parameter
And User Enter the sequenceNo in report parameter
And User Enter the date format in report parameter
And User Enter the Nullable values in report parameter
Then User click the save icon in report master
Then User get the confirmation message in report master
Then User click the inboxmail icon in report master
And User get the reference id in report master
And User click the action edit icon in submit stage in report master
And User click the submit icon in report master
And User enter the popup remark and click the popup submit
And user get the popup message and get the checker id in report master

#RM_05_14
@AT-RA-T013
Scenario: To verify the user can able approve the record in checker stage
Given User login as uls checker in report master
And User click the inboxicon in report master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click on Approve icon in report master checker
And User click the popup remarks in report master checker
Then User enter the popup remarks in report master checker
And User click the popup approve in report master checker
Then User verify the Record got Approved in report master checker

@AT-RA-T013.1
Scenario: To verify user able to approve in checker stage and verify in maker stage for report Master 
Given User login as uls maker in report master
Then User click the Configurations in report master
And User click the product setup in report master
And Click the Asset CD Master setup eye icon in report master
Then User validate the updated record in list view in report master



#RM_08_02, RM_09_01, RM_09_02, RM_09_03, RM_09_04, RM_09_05, RM_09_06, RM_09_07, RM_09_08, RM_09_09, RM_09_13
@AT-RA-022
Scenario: To verify the functionality of the report master
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
Then User click the report master list view icon
Then User verify the functionality of Add button in report master
And User verify the functionality of Back button in report master
Then User verify the functionality of Add button in report master
And User click the report parameter add icon in report master
And User click the report group master icon in report master
And User click the report group master add icon in report master
And User Enter the group name in report master
And User Enter the group description in report master
And User Enter the min parameter required in report master
And User Verify the available and selected field in report master
Then User click the save icon in report master
Then User get the confirmation message in report master
Then User click the inboxmail icon in report master
And User get the reference id in report master
And User click the action edit icon in submit stage in report master
And User click the submit icon in report master
And User enter the popup remark and click the popup submit
And user get the popup message and get the checker id in report master


