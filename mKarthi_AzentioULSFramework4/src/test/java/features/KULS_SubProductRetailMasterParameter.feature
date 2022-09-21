Feature: To verify user can able to create the parameter and approve & return in the checker stage
#SPM_03_14
@M7_SPR
Scenario: To verify Checker user is able to Reject the record
Given Checker login for subproductretail master
Then Click the menu icon in checker
And Click the inbox icon in checker
And Click the action edit icon using reference id in checker
Then Reject the sub product retail master in checker
Then Reject confirmation

#SPM_06_01, SPM_06_02, SPM_06_03, SPM_06_04, SPM_06_05, SPM_06_06, SPM_06_07, SPM_06_10, SPM_06_11
@M10_SPR
Scenario: Creation of Parameter record with valid data
Given Maker Login
Then Click the subproductretail master
Then Verify the back arrow function
Then Enter the required sub product parameters fields in maker
And Enter the required bulk payment fields in maker
And Enter the required foreclosure fields in maker
And Enter the required reschedulement fields in maker
And Enter the required moratorium/Grace period month in maker
Then Enter the required pre-EMI fields in maker
Then Click the save button get the confirmation messege
Then Get the respective reference id and submit in maker


#SPM_06_08
@M11_SPR
Scenario: To verify Checker user is able to Reject the record
Given Maker Login
Then Click the subproductretail master
Then Verify the back arrow function
Then Enter the required sub product parameters fields in maker
And Enter the required bulk payment fields in maker
And Enter the required foreclosure fields in maker
And Enter the required reschedulement fields in maker
And Enter the required moratorium/Grace period month in maker
Then Enter the required pre-EMI fields in maker
Then Click the save button get the confirmation messege
Then Get the respective reference id and submit in maker
Given Checker login for subproductretail master
Then Click the menu icon in checker
And Click the inbox icon in checker
And Click the action edit icon using reference id in checker
Then Reject the sub product retail master in checker
Then Reject confirmation


#SPM_06_09
@M12_SPR
Scenario: To verify Checker user is able to Return the record
Given Maker Login
Then Click the subproductretail master
Then Verify the back arrow function
Then Enter the required sub product parameters fields in maker
And Enter the required bulk payment fields in maker
And Enter the required foreclosure fields in maker
And Enter the required reschedulement fields in maker
And Enter the required moratorium/Grace period month in maker
Then Enter the required pre-EMI fields in maker
Then Click the save button get the confirmation messege
And Click the submit icon in maker
Then Get the respective reference id
Then Launch the kuls application and login as checker
Then Click the menu icon in checker
And Click the inbox icon in checker
Then Click the action edit icon in checker
And Click on Return icon
Then Click on Remarks button in Action confirmation popup
And Enter the remarks in Action confirmation popup
And Search the respective reference id

#SPM_08_05, SPM_08_06
@M15_SPR
Scenario: To verify while modification, when user keep any mandatory field blank and click on save button
Given Maker Login in subproduct retail master
Then Click the subproductretail master and parameter
And Enter the details in subproduct parameters fields
And Enter the details in bulkpayment fields
And Enter the details in foreclosure fields
And Enter the details in reschedulement fields
And Enter the details in moratorium/Grace period month fields
And Enter the details in pre-EMI fields
Then Enter the save icon
Then Get the validation message

#SPM_08_12
@M16_SPR
Scenario: To verify Checker user is able to Reject the record
Given Maker Login
Then Click the subproductretail master
Then Verify the back arrow function
Then Enter the required sub product parameters fields in maker
And Enter the required bulk payment fields in maker
And Enter the required foreclosure fields in maker
And Enter the required reschedulement fields in maker
And Enter the required moratorium/Grace period month in maker
Then Enter the required pre-EMI fields in maker
Then Click the save button get the confirmation messege
And Click the submit icon in maker
Then Get the respective reference id
Then Launch the kuls application and login as checker
Then Click the menu icon in checker
And Click the inbox icon in checker
Then Click the action edit icon in checker
Then Reject the sub product retail master in checker
Then Reject confirmation

