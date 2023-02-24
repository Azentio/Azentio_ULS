Feature: To verify the report parameter creation of the report master
#RM_05_01, RM_05_02, RM_05_03, RM_05_04, RM_05_05, RM_05_06, RM_05_07, RM_05_08, RM_05_09, RM_05_10, RM_05_11, RM_05_12, RM_05_13, RM_05_17
@AT-RA-T012
Scenario: To verify the user can able to create the report parameter
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
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
And User click the inboxicon in asset CD master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT-RA-T013.1
Scenario: To verify user able to approve in checker stage and verify in maker stage for report Master 
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
#And User click the product setup in asset CD master
And User click the config manager in Bounce master
And User click the report master eye icon
Then User validate the updated record in list view in report master

@AT-RA-T014
Scenario: To verify the user able to reject the record in Report master
Given User login as uls checker in report master
And User click the inboxicon in asset CD master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click the reject icon in asset CD master checker
And User enter the reject remark in asset CD master checker
And User click the final reject icon in asset CD master checker
Then User verify the Record got Rejected in asset CD checker

@AT-RA-T014.1
Scenario: To verify the rejected record shown in report master maker stage
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
#And User click the product setup in asset CD master
And User click the report master eye icon
Then User click the inboxmail icon in asset CD master
And User verify the rejected record removed from the system in report master

@AT-RA-T015
Scenario: To verify the user able to reject the record in report master
Given User login as uls checker in report master
And User click the inboxicon in asset CD master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click the return icon in asset CD master checker
And User enter the return remark in asset CD master checker
And User click the final return icon in asset CD master checker
Then User verify the Record got Returned in asset CD checker

@AT-RA-T015.1
Scenario: To verify the rejected record shown in report master maker stage
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
#And User click the product setup in asset CD master
And User click the report master eye icon
Then User click the inboxmail icon in asset CD master
And User verify the returned record removed from the system in report master

@AT-RA-T019
Scenario: To verify the user can able approve the record in checker stage
Given User login as uls checker in report master
And User click the inboxicon in asset CD master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT-RA-T020
Scenario: To verify the user able to reject the record in Report master
Given User login as uls checker in report master
And User click the inboxicon in asset CD master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click the reject icon in asset CD master checker
And User enter the reject remark in asset CD master checker
And User click the final reject icon in asset CD master checker
Then User verify the Record got Rejected in asset CD checker

@AT-RA-T021
Scenario: To verify the user able to reject the record in report master
Given User login as uls checker in report master
And User click the inboxicon in asset CD master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click the return icon in asset CD master checker
And User enter the return remark in asset CD master checker
And User click the final return icon in asset CD master checker
Then User verify the Record got Returned in asset CD checker

#RM_08_02, RM_09_01, RM_09_02, RM_09_03, RM_09_04, RM_09_05, RM_09_06, RM_09_07, RM_09_08, RM_09_09, RM_09_13
@AT-RA-T022
Scenario: To verify the functionality of the report master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
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

@AT-RA-T042
Scenario: To verify the functionality of the report master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
Then User click the report master list view icon
And user verify search for record icon is displayed  for asset auto master
And user verify export to pdf option is displayed  for asset auto master
And user verify export to excel option is displayed for asset auto master
And User verify the Values in List view should be non editable
And User verify the functionality of Export to PDF button in asset auto master
And User verify the functionality of Export to Excel button in asset auto master
And user verify the search results show matched data for report master
And user verify the search results shows no data for report masterl

@AT-RA-T040
Scenario: To verify the user can able approve the record in checker stage
Given User login as uls checker in report master
And User click the inboxicon in asset CD master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT-RA-T041
Scenario: To verify the user able to reject the record in Report master
Given User login as uls checker in report master
And User click the inboxicon in asset CD master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click the reject icon in asset CD master checker
And User enter the reject remark in asset CD master checker
And User click the final reject icon in asset CD master checker
Then User verify the Record got Rejected in asset CD checker

@AT-RA-T025 
 Scenario: To verify user is able to reject Report Group Master record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
Then click on Report Master Checkbox
Then search Report Master record from view List
Then click on Report Group Master segment button
#Then click on Report Master AddButton
#Then click on Report Parameter Details AddButton
#Then click on Report Group Master
Then click on Report Group Master AddButton
Then Enter Group Name
Then Enter Group Description
Then Enter Min Required Parameter
Then save Report Group Master Record
Then validate Success pop up
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
#And User Login as Checker
Given User login as uls checker in report master
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
Then checker user open the record from inbox
Then checker user reject the record

@AT-RA-T026
 Scenario: To verify user is able to return  Report Group Master record
 Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
#Given User launch the kuls application
#And User Login as maker
#Then click on Config Manager
Then click on Report Master Checkbox
Then search Report Master Reject record from view List
Then click on Report Group Master segment button
#Then click on Report Master AddButton
#Then click on Report Parameter Details AddButton
#Then click on Report Group Master
Then click on Report Group Master AddButton
Then Enter Group Name
Then Enter Group Description
Then Enter Min Required Parameter
Then save Report Group Master Record
Then validate Success pop up
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
#And User Login as Checker
Given User login as uls checker in report master
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
Then checker user open the record from inbox
Then checker user return the record

@AT-RA-T024 
 Scenario: To verify user is able to add new ReportMaster record in the system by entering valid data
 Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
#Given User launch the kuls application
#And User Login as maker
#Then click on Config Manager
Then click on Report Master Checkbox
Then search Report Master Return record from view List
Then click on Report Group Master segment button
#Then click on Report Master AddButton
#Then click on Report Parameter Details AddButton
#Then click on Report Group Master
Then click on Report Group Master AddButton
Then Enter Group Name
Then Enter Group Description
Then Enter Min Required Parameter
Then save Report Group Master Record
Then validate Success pop up
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
#And User Login as Checker
Given User login as uls checker in report master
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
Then checker user open the record from inbox
Then checker user approve the record

@AT-RA-T028
Scenario: To verify the user can able approve the record in checker stage
Given User login as uls checker in report master
And User click the inboxicon in asset CD master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT-RA-T029
Scenario: To verify the user able to reject the record in Report master
Given User login as uls checker in report master
And User click the inboxicon in asset CD master checker
And User click the search icon in report master and get the reference id in report master
And User search the respective reference id and click on Action button in report master
And User click the reject icon in asset CD master checker
And User enter the reject remark in asset CD master checker
And User click the final reject icon in asset CD master checker
Then User verify the Record got Rejected in asset CD checker



