Feature: Check the functionality of Property Details
@AT-PD-004
Scenario: verify system allow user to do a modification on already saved record
Given User Launch the KULS url for Transaction
And user click on Inbox Icon
And user click search icon
#And user search Appdata Entry
And user Enter Application ID
And user click on First record of Appdata Entry
And user choose Property Details Tab
And user click First Record Edit Icon
And user Modify the Security Type
And user Modify the Property City
And user Modify the Property Type
And user Modify the Apf Status
And user click the update the button