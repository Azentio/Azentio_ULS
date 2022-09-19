Feature: To verify the personal details disbursement checker list view fuctionality
#CDM_01_38
@AT-PDC-003
Scenario: To verify user is able to modify existing record of customer details under Disbursement Checker screen
Given User login as uls maker in transaction
And User click the inbox mail icon in personal details disbursement checker
And User click the action edit icon in personal details disbursement checker
And User click the customer details tab in personal details disbursement checker
And User verify the System should not allow user to modify record of customer details under Disbursement Checker screen


#CDM_02_01, CDM_02_02, CDM_02_03
@AT-PDC-004
Scenario: To verify customer details list view
Given User login as uls maker in transaction
And User click the inbox mail icon in personal details disbursement checker
And User click the action edit icon in personal details disbursement checker
And User click the customer details tab in personal details disbursement checker
And User verify the customer details List view in personal details disbursement checker
And User Verify the Values in List view should be non editable in personal details disbursement checker
And User verify the back button functionality in personal details disbursement checker