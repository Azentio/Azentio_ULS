Feature: To verify the functionality of Deposit Account master

#AT-DAM-T001
@DepositMaster_M1_1_1c
Scenario: To verify user is able to add new Deposite account record in the system by entering valid data
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the eye icon of deposit master
Then Choose the data set id for creation of deposit account master
Then Click the Add button in the deposit master
And Verify all the fields in deposit screen
Then Select the Bank name in deposit master
And Select the branch name in deposit master
Then Choose the accounting type in deposit master
And Enter the account number in depost master
Then Choose the account currency in deposit master
And Choose the payment account indicator
Then Select the chart of account mapping type in deposit master
And Select the account status
Then Save the record in deposit master
And Click the pencil icon in deposit master
Then Click the branch maping 
And Verify the  fields in branch mappinng
Then Choose the availble collection 
And Map the available collection to selected 
Then save the record in branch mapping
And Click the inbox in deposit master
Then Search the record in serch field
And Get the reference id and store it in json
And Click the first action icon in deposit master
Then Submit the record in deposit master

#AT-DAM-T001
@DepositMaster_M1.1_2c
Scenario: To verify Checker user is able to Approve the record
Given Get the URL and login as Checker
#Then Click the menu icon in deposit account
And Click  the inbox in checker deposit account
Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in deposit master
And Click the approve button in the deposit master
Then Enter the alert approve remark in deposit master
And Give the final approve in the deposit master
Then Verify the record get approved in deposit master

#AT-DAM-T001
@DepositMaster_M1.2_3
Scenario: To verify Checker user is able to view the approved record in list view
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the eye icon of deposit master
Then verify the approved record present in the list view

#AT-DAM-T002
@DepositMaster_M1_4
Scenario: To verify user is able to add new Deposite account record in the system by entering valid data
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the eye icon of deposit master
Then Click the Add button in the deposit master
Then choose the data set id for checker reject
Then Select the Bank name in deposit master
And Select the branch name in deposit master
Then Choose the accounting type in deposit master
And Enter the account number in depost master
Then Choose the account currency in deposit master
And Choose the payment account indicator
Then Select the chart of account mapping type in deposit master
And Select the account status
Then Save the record in deposit master
And Click the pencil icon in deposit master
Then Click the branch maping 
And Verify the  fields in branch mappinng
Then Choose the availble collection 
And Map the available collection to selected 
Then save the record in branch mapping
And Click the inbox in deposit master
Then Search the record in serch field
And Get the reference id and store it in excel for checker reject in deposit account master
And Click the first action icon in deposit master
Then Submit the record in deposit master for checker reject

#AT-DAM-T002
@DepositMaster_M2_5_3c
Scenario: To verify Checker user is able to Reject the record
Given Get the URL and login as Checker for checker reject in deposit account master
#Then Click the menu icon in deposit account
And Click  the inbox in checker deposit account
Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in deposit master
And Click the reject button in the deposit master
Then Enter the alert reject remark in deposit master
And Give the final reject in the deposit master
Then Verify the record get rejected in deposit master

#AT-DAM-T002
@DepositMaster_M2.1_6
Scenario: To verify user is able to view the rejected record in the list view
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the eye icon of deposit master
Then verify the the rejected record in the list view

#AT-DAM-T003
@DepositMaster_M1_7
Scenario: To verify user is able to add new Deposite account record in the system by entering valid data
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the eye icon of deposit master
Then Click the Add button in the deposit master
Then Choose the data set id for checker return in deposit account master
Then Select the Bank name in deposit master
And Select the branch name in deposit master
Then Choose the accounting type in deposit master
And Enter the account number in depost master
Then Choose the account currency in deposit master
And Choose the payment account indicator
Then Select the chart of account mapping type in deposit master
And Select the account status
Then Save the record in deposit master
And Click the pencil icon in deposit master
Then Click the branch maping 
And Verify the  fields in branch mappinng
Then Choose the availble collection 
And Map the available collection to selected 
Then save the record in branch mapping
And Click the inbox in deposit master
Then Search the record in serch field
And Get the reference id and store it in excel for checker return in deposit account master
And Click the first action icon in deposit master
Then Submit the record in deposit master for checker return

#AT-DAM-T003
@DepositMaster_M3_8_4c
Scenario: To verify Checker user is able to Return the record
Given Get the URL and login as Checker to return the record in deposit account master
#Then Click the menu icon in deposit account
And Click  the inbox in checker deposit account
Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in deposit master
And Click the return button in the deposit master
Then Enter the alert return remark in deposit master
And Give the final return in the deposit master
Then Verify the record get returned in deposit master

#AT-DAM-T003
@DepositMaster_M3.1_9
Scenario: To verify user is able to view the returned record in the list view
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the temp view icon of deposit master
Then verify the the returned record is in the list view

#AT-DAM-T005-D1
#Validation
@DepositMaster_M4_10_5c
Scenario: To verify user is able to add new Deposite account record in the system by entering invalid data
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
Then Get the data set id for invalid data validation
And Click the temp view icon of deposit master
Then Click the Add button in the deposit master
Then save the record in branch mapping
And validate the record with blank field in deposit master
Then Validate the numeric field with character value in deposit master
Then save the record in branch mapping
Then Validate the numeric field with special character value in deposit master
Then save the record in branch mapping
Then Verify the functionality of the back button

#AT-DAM-T006-D1
#Modification Before Approve
@DepositMaster_M5
Scenario: To verify system allow user to modify the Deposite account before approve
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the temp view icon of deposit master
Then Click the first pencil icon in temp view of deposit account master
Then Choose the data set id for modification before approving
Then Modify the Bank name in deposit master
And Modify the branch name in deposit master
Then Modify the accounting type in deposit master
And Modify the account number in depost master
Then Save the record in deposit master


#Creation for modification by changing one field value
#@DepositMaster_M1.11_11
#Scenario: To verify user is able to add new Deposite account record in the system by entering valid data
#Given User login as uls maker in asset CD master
#And Click the configuration
#Then User click the config manager in Appropriation master
#And Click the eye icon of deposit master
#Then Click the Add button in the deposit master
#Then Select the Bank name in deposit master
#And Select the branch name in deposit master
#Then Modify the field account type2 in deposit master
#And Enter the account number in depost master
#Then Choose the account currency in deposit master
#And Choose the payment account indicator
#Then Select the chart of account mapping type in deposit master
#And Select the account status
#Then Save the record in deposoit master
#And Click the pencil icon in deposit master
#Then Click the branch maping 
#And Verify the  fields in branch mappinng
#Then Choose the availble collection 
#And Map the available collection to selected 
#Then save the record in branch mapping
#And Click the inbox in deposit master
#Then Search the record in serch field
#And Get the reference id and store it in json
#And Click the first action icon in deposit master
#Then Submit the record in deposit master
#
#@DepositMaster_M1.1_12
#Scenario: To verify Checker user is able to Approve the record
#Given Get the URL and login as Checker
#Then Click the menu icon in deposit account
#And Click  the inbox in checker deposit account
#Then Search the record in serch field in checker stage
#Then search the reference id and click the respective action icon in deposit master
#And Click the approve button in the deposit master
#Then Enter the alert approve remark in deposit master
#And Give the final approve in the deposit master
#Then Verify the record get approved in deposit master

#modification on already approved record
#AT-DAM-T007-D1
@DepositMaster_M6_13
Scenario: To verify system allow user to do a modification on already approved record
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the eye icon of deposit master
And Click the pencil icon in deposit master
Then Choose the data set id for modifing the approved record in deposit account master
Then Modify the Bank name in deposit master
And Modify the branch name in deposit master
Then Modify the accounting type in deposit master
And Modify the account number in depost master
Then Save the record in deposit master
And Click the inbox in deposit master
Then Search the record in serch field
And Get the reference id and store it in excel for approved record modification
And Click the first action icon in deposit master
Then Submit the record in deposit master for modifing the approved record
#AT-DAM-T007-D1
@DepositMaster_M1.1_14
Scenario: To verify Checker user is able to Approve the record
Given Get the URL and login as Checker for modifing the approved record
#Then Click the menu icon in deposit account
And Click  the inbox in checker deposit account
Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in deposit master
And Click the approve button in the deposit master
Then Enter the alert approve remark in deposit master
And Give the final approve in the deposit master
Then Verify the record get approved in deposit master

#Modification Reject
#Creation for modification by changing one field value
#@DepositMaster_M1.11_15
#Scenario: To verify user is able to add new Deposite account record in the system by entering valid data
#Given User login as uls maker in asset CD master
#And Click the configuration
#Then User click the config manager in Appropriation master
#And Click the eye icon of deposit master
#Then Click the Add button in the deposit master
#Then Select the Bank name in deposit master
#And Select the branch name in deposit master
#Then Modify the field account type2 in deposit master
#And Enter the account number in depost master
#Then Choose the account currency in deposit master
#And Choose the payment account indicator
#Then Select the chart of account mapping type in deposit master
#And Select the account status
#Then Save the record in deposoit master
#And Click the pencil icon in deposit master
#Then Click the branch maping 
#And Verify the  fields in branch mappinng
#Then Choose the availble collection 
#And Map the available collection to selected 
#Then save the record in branch mapping
#And Click the inbox in deposit master
#Then Search the record in serch field
#And Get the reference id and store it in json
#And Click the first action icon in deposit master
#Then Submit the record in deposit master
#
#@DepositMaster_M1.1_16
#Scenario: To verify Checker user is able to Approve the record
#Given Get the URL and login as Checker
#Then Click the menu icon in deposit account
#And Click  the inbox in checker deposit account
#Then Search the record in serch field in checker stage
#Then search the reference id and click the respective action icon in deposit master
#And Click the approve button in the deposit master
#Then Enter the alert approve remark in deposit master
#And Give the final approve in the deposit master
#Then Verify the record get approved in deposit master

#modification on already approved record
#AT-DAM-T008-D1
@DepositMaster_M6_13
Scenario: To verify system allow user to do a modification on already approved record
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the eye icon of deposit master
And Click the pencil icon in deposit master
Then Choose the data set id to reject the modified record in deposit account masters
Then Modify the Bank name in deposit master
And Modify the branch name in deposit master
Then Modify the accounting type in deposit master
And Modify the account number in depost master
Then Save the record in deposit master
And Click the inbox in deposit master
Then Search the record in serch field
And Get the reference id and store it in excel to reject the modified record in deposit account master
And Click the first action icon in deposit master
Then Submit the record in deposit master for reject the approved record

#AT-DAM-T008-D1
@DepositMaster_M7_18
Scenario: To verify Checker user is able to Reject the record
Given Get the URL and login as Checker to reject the approved record
#Then Click the menu icon in deposit account
And Click  the inbox in checker deposit account
Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in deposit master
And Click the reject button in the deposit master
Then Enter the alert reject remark in deposit master
And Give the final reject in the deposit master
Then Verify the record get rejected in deposit master


#Modification Return
#Creation for modification by changing one field value
#@DepositMaster_M1.11_19
#Scenario: To verify user is able to add new Deposite account record in the system by entering valid data
#Given User login as uls maker in asset CD master
#And Click the configuration
#Then User click the config manager in Appropriation master
#And Click the eye icon of deposit master
#Then Click the Add button in the deposit master
#Then Select the Bank name in deposit master
#And Select the branch name in deposit master
#Then Modify the field account type2 in deposit master
#And Enter the account number in depost master
#Then Choose the account currency in deposit master
#And Choose the payment account indicator
#Then Select the chart of account mapping type in deposit master
#And Select the account status
#Then Save the record in deposoit master
#And Click the pencil icon in deposit master
#Then Click the branch maping 
#And Verify the  fields in branch mappinng
#Then Choose the availble collection 
#And Map the available collection to selected 
#Then save the record in branch mapping
#And Click the inbox in deposit master
#Then Search the record in serch field
#And Get the reference id and store it in json
#And Click the first action icon in deposit master
#Then Submit the record in deposit master
#
#@DepositMaster_M1.1_20
#Scenario: To verify Checker user is able to Approve the record
#Given Get the URL and login as Checker
#Then Click the menu icon in deposit account
#And Click  the inbox in checker deposit account
#Then Search the record in serch field in checker stage
#Then search the reference id and click the respective action icon in deposit master
#And Click the approve button in the deposit master
#Then Enter the alert approve remark in deposit master
#And Give the final approve in the deposit master
#Then Verify the record get approved in deposit master

#modification on already approved record
#AT-DAM-T008-D1
@DepositMaster_M6_13
Scenario: To verify system allow user to do a modification on already approved record
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the eye icon of deposit master
And Click the pencil icon in deposit master
Then Choose the data set id to return the modified record in deposit account masters
Then Modify the Bank name in deposit master
And Modify the branch name in deposit master
Then Modify the accounting type in deposit master
And Modify the account number in depost master
Then Save the record in deposit master
And Click the inbox in deposit master
Then Search the record in serch field
And Get the reference id and store it in excel to return the modified record in deposit account master
And Click the first action icon in deposit master
Then Submit the record in deposit master for return the approved record

@DepositMaster_M8_22
Scenario: To verify Checker user is able to Return the record
Given Get the URL and login as Checker to return the approved record
#Then Click the menu icon in deposit account
And Click  the inbox in checker deposit account
Then search the reference id and click the respective action icon in deposit master
And Click the return button in the deposit master
Then Enter the alert return remark in deposit master
And Give the final return in the deposit master
Then Verify the record get returned in deposit master

#Creation for modification by changing one field value
#@DepositMaster_M1.11_23
#Scenario: To verify user is able to add new Deposite account record in the system by entering valid data
#Given User login as uls maker in asset CD master
#And Click the configuration
#Then User click the config manager in Appropriation master
#And Click the eye icon of deposit master
#Then Click the Add button in the deposit master
#Then Select the Bank name in deposit master
#And Select the branch name in deposit master
#Then Modify the field account type2 in deposit master
#And Enter the account number in depost master
#Then Choose the account currency in deposit master
#And Choose the payment account indicator
#Then Select the chart of account mapping type in deposit master
#And Select the account status
#Then Save the record in deposoit master
#And Click the pencil icon in deposit master
#Then Click the branch maping 
#And Verify the  fields in branch mappinng
#Then Choose the availble collection 
#And Map the available collection to selected 
#Then save the record in branch mapping
#And Click the inbox in deposit master
#Then Search the record in serch field
#And Get the reference id and store it in json
#And Click the first action icon in deposit master
#Then Submit the record in deposit master
#
#@DepositMaster_M1.1_24
#Scenario: To verify Checker user is able to Approve the record
#Given Get the URL and login as Checker
#Then Click the menu icon in deposit account
#And Click  the inbox in checker deposit account
#Then Search the record in serch field in checker stage
#Then search the reference id and click the respective action icon in deposit master
#And Click the approve button in the deposit master
#Then Enter the alert approve remark in deposit master
#And Give the final approve in the deposit master
#Then Verify the record get approved in deposit master


#AT-DAM-T010-D1

#modification on already approved record
@DepositMaster_M9_25
Scenario: To verify while modification, when user keep any mandatory field blank and click on save button
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the eye icon of deposit master
And Click the pencil icon in deposit master
Then Choose the data set id for negavite validation  in deposit account masters
Then Modify the Bank name in deposit master
#And Modify the branch name in deposit master
Then Modify the accounting type in deposit master
And Modify the account number in depost master
Then save the record in branch mapping
And validate the record with blank field in deposit master
Then Verify the functionality of the back button

#AT-DAM-T013-D1

#List view validation
@DepositMaster_M10_26_13c
Scenario: To verify the Deposite account List view of Approved records
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
Then Select the test data set id for listview and wip validation in deposit account master
And Click the eye icon of deposit master
Then To verify the values in List view in deposit master
And To verify the functionality of Add button in wip
And To verify the functionality of view in process record button in deposit master
Then To verify the functionality of Search box with matching data in deposit master
Then To verify the functionality of Search box with unmatching data in deposit master
And To verify the functionality of Export to PDF button in deposit master
Then To verify the functionality of Export to Excel button in deposit master

#AT-DAM-T013-D1
# WIP List view validation
@DepositMaster_M11_27_14c
Scenario: To verify the Deposite account WIP List view of Approved records
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
Then Select the test data set id for listview and wip validation in deposit account master
And Click the eye icon of deposit master
And Navigate to work in progress temp view
Then To verify the functionality of approved record button in wip
And To verify the functionality of Add button in wip
Then To verify the functionality of Search box with matching data in wip
And To verify the functionality of Search box with mismatch data in wip
Then To verify the functionality of Export to PDF button in wip
And To verify the functionality of Export to Excel button in wip


#Modification before approval extra
#Then Choose the account currency in deposit master
#And Choose the payment account indicator
#Then Select the chart of account mapping type in deposit master
#And Select the account status
##And Click the pencil icon in deposit master
#Then Click the branch maping 
#And Verify the  fields in branch mappinng
#Then Choose the availble collection 
#And Map the available collection to selected 
#Then save the record in branch mapping
#And Click the inbox in deposit master
#Then Search the record in serch field
#And Get the reference id and store it in excel for modification before approval
#And Click the first action icon in deposit master
#Then Modify the fielld account type in deposit master
#Then save the record in branch mapping



############################################################################################################################################################################################

@DepositMaster_M5-Pre_Request
Scenario: To verify system allow user to modify the Deposite account before approve
And User get the testdata for deposit account master testcase01
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the temp view icon of deposit master
Then Click the first pencil icon in temp view of deposit account master
#Then Choose the data set id for modification before approving
Then Modify the Bank name in deposit master1
And Modify the branch name in deposit master1
Then Modify the accounting type in deposit master1
And Modify the account number in depost master1
Then Save the record in deposit master
Then User click the inboxmail icon in Deposit Account master
And User click the search icon in Deposit Account master and get the reference id
And User click the submit icon in Deposit Account master maker
And User enter the popup remark and submit the Deposit Account master
And User get confirmation message and checker id in Deposit Account master


@AT-DAM-TC001
Scenario: To verify system allow user to approve the modified record
And User get the testdata for deposit account master testcase01
Given User login as uls checker in Deposite account master
And User click the inboxicon in Deposite account master checker
And User click the search icon in Deposite account master and get the reference id
And User search the respective reference id and click on Action button in Deposite account master
And User click on Approve icon in Deposite account master checker
And User get the testdata for deposit account master testcase02
And User click the popup remarks in Deposite account master checker
Then User enter the popup remarks in Deposite account master checker
And User click the popup approve in Deposite account master checker
Then User verify the Record got Approved in Deposite account checker

@AT-DAM-TC002
Scenario: To verify system allow user to view the summary button
And User get the testdata for deposit account master testcase01
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
And Click the temp view icon of deposit master
Then Click the first pencil icon in temp view of deposit account master
#Then Choose the data set id for modification before approving
Then Modify the Bank name in deposit master1
And Modify the branch name in deposit master1
Then Modify the accounting type in deposit master1
And Modify the account number in depost master1
Then Save the record in deposit master
Then User click the inboxmail icon in Deposit Account master
And User click the search icon in Deposit Account master and get the reference id
And User click the summary button in deposit account master
