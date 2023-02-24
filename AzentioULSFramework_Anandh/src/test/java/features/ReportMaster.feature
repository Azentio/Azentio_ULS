Feature: To verify the functionalities of report master


#Creation
@ReportMaster_M1
Scenario: To verify user is able to add new Report Master record in the system by entering valid data in report master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And Click the Eye icon of report master
Then Choose the data set id for report master creation
Then Click the add button in the report master
And Enter the report name in report master
Then Fill the report name2 in report master
And Enter the report name3 in report master
Then Fill the report description in report master
And Choose the report type in report master
Then Fill the report URL in report master
And Enter the report catogory in report master
Then Save the record in report master
And Click the inbox in report master
Then Search the record in search field in report master
And Get the reference id in report master
Then Click the first action icon in report master
And Submit the record in report master
Then Get the checker id in report master
#Checker approval
@ReportMaster_M2
Scenario: To verify Checker user is able to Approve the record in report Master
Then Choose the data set id for checker approval in report master
Given Get the URL and login as Checker in report master
Then Click the inbox in the report master
And Search the reference id and click the respective action icon in report master
Then Click the approve button in the report master
And Enter the alert remark in the report master
Then Give the final approve in the report master
And Verify the record get approved in report master
#List View verification 
@ReportMaster_M2.1
Scenario: To verify Approved record is view in the maker list view in report Master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And Click the Eye icon of report master
Then Verify that approved record is present in the list view
@ReportMaster_M1.1
Scenario: To verify user is able to add new Report Master record in the system by entering valid data in report master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
Then choose the data set id for creation of report master for rejection
And Click the Eye icon of report master
Then Click the add button in the report master
And Enter the report name in report master
Then Fill the report name2 in report master
And Enter the report name3 in report master
Then Fill the report description in report master
And Choose the report type in report master
Then Fill the report URL in report master
And Enter the report catogory in report master
Then Save the record in report master
And Click the inbox in report master
Then Search the record in search field in report master
And Get the reference id in report master for reject
Then Click the first action icon in report master
And Submit the record in report master
Then Get the checker id in report master for rejection flow
#Checker Reject
@ReportMaster_M3
Scenario: To verify Checker user is able to Reject the record in report Master
Then choose the data set id for creation of report master for rejection
Given Get the URL and login as Checker in report master
Then Click the inbox in the report master
And Search the reference id and click the respective action icon in report master for rejection
Then Click the reject button in the report master
And Enter the reject alert remark in the report master
Then Give the final reject in the report master
And Verify the record get rejected in report master
#List View verification 
@ReportMaster_M3.1
Scenario: To verify Reject record is view in the maker list view in report Master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And Click the Eye icon of report master
Then Verify that rejected record is not present in the list view
@ReportMaster_M1.2
Scenario: To verify user is able to add new Report Master record in the system by entering valid data in report master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And Choose the data set id for return the records in report master
And Click the Eye icon of report master
Then Click the add button in the report master
And Enter the report name in report master
Then Fill the report name2 in report master
And Enter the report name3 in report master
Then Fill the report description in report master
And Choose the report type in report master
Then Fill the report URL in report master
And Enter the report catogory in report master
Then Save the record in report master
And Click the inbox in report master
Then Search the record in search field in report master
And Get the reference id in report master for return
Then Click the first action icon in report master
And Submit the record in report master
Then Get the checker id in report master for return
#Checker Return
@ReportMaster_M4
Scenario: To verify Checker user is able to Return the record in report Master
And Choose the data set id for return the records in report master
Given Get the URL and login as Checker in report master
Then Click the inbox in the report master
And Search the reference id and click the respective action icon in report master for return
Then Click the return button in the report master
And Enter the return alert remark in the report master
Then Give the final return in the report master
And Verify the record get returned in report master
#List View verification 
@ReportMaster_M4.1
Scenario: To verify Returned record is view in the maker list view in report Master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And Click the temp view in the report master
Then Verify that returned record is present in the temp view
@AT_RM_T005
Scenario: To verify maker user can able to create the report master record with invalid inputs
#RM_02_01,RM_02_02,RM_02_03,RM_02_04
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And Go to config manager main menu
And click on view button in report master
And click on add button in report master
Then verify back button and save buttons are appeared
And get the test data of report master fifth test case
And click on save button inreport master without filling the details
Then verify system should through the validation for the empty fields
And enter special charecters in text box
Then verify system should through the validation for report master
And click on back button in report master
Then verify report master screen should get back or not

@AT_RA_006
  Scenario: To verify system allow user to modify the Report Master before approve the record
	Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And Click the Eye icon of report master
  	And click on work in progress records button of report master
		Then click on add button to create new record of report master
		Then Fill all valid fields in the report master screen for approve the record
  	Then verify system display the confirmation message in the report master screen post clicking on save button
  	Then confirmation message displays in the report master screen with reference id
  	And Click the inbox in report master	
  	And select the record of report master from inbox to submit
  	Then verify the field status is non mandatory in report master
  	Then verify system allow user to modify the report master record before approve the record
  	Then verify system display the confirmation message in the report master screen post clicking on save button
		Then verify the functionality of back button in report master screen
			
  @AT_RA_007
  Scenario: To verify system allow user to do a modification on already approved record
		Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And Click the Eye icon of report master
  	And click on approved records button of report master
  	Then click on edit button of report master record to modify
  	Then verify system allow user to do a modification on already approved report master record
  	Then verify system display the confirmation message in the report master screen post clicking on save button
  	Then confirmation message displays in the report master screen with reference id
  	Then click on inbox button to select the record of report master
  	And select the record of report master from inbox to submit
  	Then click on submit button to submit the record of report master
  	Then system should display confirmation message after submit report master record
  	Then capture checker ID of report master
  	Then logout user from maker stage
  	
  	And User Login as checker to approve report master record
  	Then click on inbox button to select the record of report master
  	Then select the record of report master to approve
  	Then select approve button for approve the report master record
  	Then enter remark for approve the record of report master
  	Then click on approve button of the report master record
  	Then system should display confirmation message after approve the report master record
  	Then logout user from checker stage
  	And User Login as maker
  	Then user should navigate to report master
  	And click on approved records button of report master
  	Then verify all the captured modified data of report master from makers side should be saved and stored in the system
@AT-RA-008
Scenario: To verify checker user can able to reject the Report master updated record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on reject button to reject the record
And enter the remark in alert tab fo rejection
And click on reject button in alert box
Then verify record is rejected in checker stage 
@AT-RA-009
Scenario: To verify checker user can able to return the Report master updated record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on return button to return the record
And enter the remark in alert tab fo return
And click on return button in alert box
Then verify record is return in checker stage

@AT-RA-010
Scenario: To verify user can able to create the report master record with invalid inputs
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on view button neqar by report master module
And click on edit button of one of the approved record
And clear the input data of Report Name field
And get the test data o report master tenth test case
And clear input data of Report Name 2 field
And clear the input data of Report Name 3 field
And clear the input data of Report Description field
And clear the input data of report type field
And clear the input data of Report URL field
And clear the input data of Report category field
And click on save button to save the report master screen without data
Then verify all the mandatory field should show the validation for blank field
Then verify report name field should through the validation message post enter the special character input
Then verify report name 2 field should through the validation message post enter the special character input
Then verify report name 3 field should through the validation message post enter the special character input
Then verify report Description field should through the validation message post enter the special character input
#parameter List view validation
@ReportMaster_M11
Scenario: To verify the Report Parameter DetailList view of Approved records in report master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
Then choose the data set id for for list view validation
And Click the Eye icon of report master
Then Click the first icon in the list view in the report master
And To verify the functionality of Add button in report master
Then To verify the functionality of Search box with matching data in report master
And To verify the functionality of Search box with mismatch data in report master
Then To verify the functionality of Export to PDF button in report master
And To verify the functionality of Export to Excel button in report master
Then To verify the functionality of Sequence number field in report master
And To verify the functionality of Description field in report master
Then To verify the functionality of Status field in report master
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

@AT-RA-016
Scenario: To verify maker user can able to create report parameter details record with invalid input
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on view button neqar by report master module
And click on add button in report master
And click on add button in report parameter details 
And get the test data of parameter details validation scenario from excel
And click on save button in report parameter details without filling the mendaory details 
Then verify user can get the validation for incomplete data in mendatory field in report parameter details
And enter characters in numeric field in report parameter details
Then verify system should not allow to enter the charecter data into the numeric input box
And enter special charecter inputs in report parameter details 
Then verify system should through the validation for the special charecter inputs for special charecter 
And click on template field and select the data from the drop down
And click on is mendatory dropdown and select the value from the dropdown
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