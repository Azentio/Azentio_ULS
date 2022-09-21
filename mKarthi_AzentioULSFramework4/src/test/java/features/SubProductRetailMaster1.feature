Feature: Modification of Sub-product Master record
# Checker Reject
Scenario: To verify Checker user is able to Reject the record
Given Checker login for subproductretail master
Then Click the menu icon in checker
And Click the inbox icon in checker
And Click the action edit icon using reference id in checker
Then Reject the sub product retail master in checker
Then Reject confirmation

