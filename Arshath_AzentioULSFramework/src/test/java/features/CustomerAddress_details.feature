Feature: check the functionality of Customer address details 
@AT-CAD-007
Scenario: verify system allow user to do a modification on already approved record
Given User Launch the KULS url for Transaction
And user click on Inbox Icon
And user click search icon
And user Enter Customer Address details Application ID
And user click on First record of Appdata Entry
And user click on Additional customer Info Tab
And user click on First Record Edit Icon
And user click on Address Information First Record Edit Icon
And user Modify the Address type field
And user Modify the Address Status field
And user Modify the Residental status field
#And user Modify the Province ID field
#And user Modify the City ID field
And user click the update the button