Feature: To verify user is able to add new record of Application Details under Offering screen
@AT-ADO-002-offer
Scenario: To verify user is able to add new record of Application Details under Offering screen
And User get the test data for application detail offering test case2
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in application detail offering
And User click the application details tab in application detail offering
And User verify the availability of Add button on Application Detail offering
And User click the offering tab in application detail offering
And User click the offering action edit icon in application detail offering
And User verify the modify existing record of Application Details under Offering screen
And User verify the back button functionality in application detail offering