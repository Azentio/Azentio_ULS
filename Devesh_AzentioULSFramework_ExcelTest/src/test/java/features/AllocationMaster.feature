Feature: To verify the full flow of the allocation master
@AT-ALM-021
Scenario: To verify the modification of Allocation master detail before approving the record
Given User launch the kuls application
And User Login as maker
Then select data set ID for allocation master testcase021
Then user should navigate to Allocation master
And Click the temp view of the alloction master
Then Click the first eye icon in allocation master list view
And Click the first edit icon in allocation details
Then Modify the allocation based on in allocation detail
And Modify the leval no in allocation details
Then Modify the order by value in allocation details
Then Click the updation button in allocation details 

@AT-ALM-022
Scenario: To verify the user able to modify the already approved record
#Given User login as uls maker new
Given User launch the kuls application
And User Login as maker
Then select data set ID for allocation master testcase022
Then user should navigate to Allocation master
#Then User click the Configurations in asset auto master
#And User click the config manager in Bounce master
And User click the Allocation Master ListView icon in Allocation Master
And User click the Allocation Master Action edit icon in Allocation Master
Then User click the back button in asset CD master
And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master
And User click the save icon in Allocation master
And User get the save confirmation message
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
# next step needs to do
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-023
Scenario: To verify the user able to modify Negative validation
#Given User login as uls maker new
Given User launch the kuls application
And User Login as maker
Then select data set ID for allocation master testcase023
Then user should navigate to Allocation master
And User click the Allocation Master ListView icon in Allocation Master
And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master validation
And User click the save icon in Allocation master
And User verify while modification allocation master record, when user keep any mandatory field blank

@AT-ALM-022-Pre-Reuest
Scenario: To verify the user able to modify the already approved record
#Given User login as uls maker new
Given User launch the kuls application
And User Login as maker
Then select data set ID for allocation master testcase024
Then user should navigate to Allocation master
And User click the Allocation Master ListView icon in Allocation Master
#And User click the Allocation Master Action edit icon in Allocation Master
#Then User click the back button in asset CD master
And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master
And User click the save icon in Allocation master
And User get the save confirmation message
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-024
Scenario: To verify Checker user is able to Approve the record in allocation master
Given User launch the kuls application
And User Login as checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the approve button in the allocation Master
Then Enter the alert approve remark in allocation Master
And Give the final approve in the allocation Master
Then Verify the record get approved in allocation Master

@AT-ALM-022-Pre-Reuest
Scenario: To verify the user able to modify the already approved record
#Given User login as uls maker new
Given User launch the kuls application
And User Login as maker
Then select data set ID for allocation master testcase025
Then user should navigate to Allocation master
And User click the Allocation Master ListView icon in Allocation Master
And User click the Allocation Master Action edit icon in Allocation Master
#Then User click the back button in asset CD master
#And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master
And User click the save icon in Allocation master
And User get the save confirmation message
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-025
Scenario: To verify Checker user is able to reject the record in allocation master
Given User launch the kuls application
And User Login as checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the reject button in the allocation Master
Then Enter the alert reject remark in allocation Master
And Give the final reject in the allocation Master
Then Verify the record get rejected in allocation Master

@AT-ALM-022-Pre-Reuest
Scenario: To verify the user able to modify the already approved record
#Given User login as uls maker new
Given User launch the kuls application
And User Login as maker
Then select data set ID for allocation master testcase026
Then user should navigate to Allocation master
And User click the Allocation Master ListView icon in Allocation Master
And User click the Allocation Master Action edit icon in Allocation Master
#Then User click the back button in asset CD master
#And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master
And User click the save icon in Allocation master
And User get the save confirmation message
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-026
Scenario: To verify Checker user is able to return the record in allocation master
Given User launch the kuls application
And User Login as checker
#Then Click the menu icon in allocation Master
And Click  the inbox in checker allocation Master
#Then Search the record in serch field in checker stage
Then search the reference id and click the respective action icon in allocation Master
And Click the return button in the allocation Master
Then Enter the alert return remark in allocation Master
And Give the final return in the allocation Master
Then Verify the record get returned in allocation Master