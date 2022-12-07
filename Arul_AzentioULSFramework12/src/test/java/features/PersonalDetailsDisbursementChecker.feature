Feature: To verify the personal details disbursement checker list view fuctionality
#CDM_02_01, CDM_02_02, CDM_02_03
@AT-PDC-004
Scenario: To verify customer details list view
Given Launch the kuls application
And User Login as maker
And update test data for Personal disbursement checker test case four
And User click the inbox mail icon in personal details disbursement checker
And User click the action edit icon in personal details disbursement checker
And User click the customer details tab in personal details disbursement checker
And User verify the customer details List view in personal details disbursement checker
And User Verify the Values in List view should be non editable in personal details disbursement checker
And User verify the back button functionality in personal details disbursement checker