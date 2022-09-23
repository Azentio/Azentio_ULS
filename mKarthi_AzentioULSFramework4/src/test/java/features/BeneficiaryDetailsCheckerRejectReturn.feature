Feature: To verify the the user able to reject and return the record in Beneficiary details
@AT-BD-008
Scenario: To verify Checker user is able to Reject the record
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User search the record from the system in Beneficiary details
And User click the action edit icon in Beneficiary details
And User click the Reject button in Beneficiary details
Then User enter the reject popup message in Beneficiary details
And User click the final reject in Beneficiary details
And User get the save confirmation messege in customer entity layout facility details
@AT-BD-008.1
Scenario: To verify the Record should get removed from the system
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User Verification search the record from the system in Beneficiary details
And User verify the rejected record removed from the system in Beneficiary details

@AT-BD-009
Scenario: To verify Checker user is able to Return the record
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User search the record from the system in Beneficiary details
And User click the action edit icon in Beneficiary details
And User click the return button in Beneficiary details
Then User enter the return popup message in Beneficiary details
And User click the final Return in Beneficiary details
And User get the save confirmation messege in customer entity layout facility details
@AT-BD-009.1
Scenario: To verify the return record shown in Beneficiary details maker stage
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User Verification search the record from the system in Beneficiary details
And User verify the return record shown in Beneficiary details maker stage


