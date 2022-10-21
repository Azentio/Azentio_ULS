Feature: To verify the buttons available on screen while modify the Allocation master
@AT-ALM-022
Scenario: To verify the user able to modify the already approved record
Given User login as uls maker new
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
And User click the Allocation Master ListView icon in Allocation Master
And User click the Allocation Master Action edit icon in Allocation Master
Then User click the back button in asset CD master
And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master
And User click the save icon in Bounce master
And User get the save confirmation message
And User click the Inboxmail icon in Allocation master
And User click the search icon in Allocation Master and get the reference id
And User click the submit icon in Allocation Master maker
And User enter the popup remark and submit the Allocation Master
And User get confirmation message and checker id in Allocation Master

@AT-ALM-023
Scenario: To verify the user able to modify Negative validation
Given User login as uls maker new
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
And User click the Allocation Master ListView icon in Allocation Master
And User click the Allocation Master Action edit icon in Allocation Master
And User Update the Allocation Code in Allocation Master validation
And User click the save icon in Bounce master
And User verify while modification, when user keep any mandatory field blank
