Feature: Check the Functionality of Bounce Master
@AT-BM-005
Scenario: verify system allow user to do a modification on before approve the record
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And User click on Bounce Master Temp view
And user click on First Record Edit icon
And user update the Bounce code field
And user update the Charge Applicable field
And user update the Bounce Description field
And user update the Bounce Description2 field
And user update the Bounce Description3 field
And user click the save button

@AT-BM-007
Scenario: verify system allow user to do a modification on already approved record
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And User click on Bounce Master List view
And user click on First Record Edit icon
And user update the Bounce code field
And user update the Charge Applicable field
And user update the Bounce Description field
And user update the Bounce Description2 field
And user update the Bounce Description3 field
And user click the save buttons
And user goto the Maker Inbox and store the Referance ID
Then user Click on Action Icon
And user verify the submit button and submit the Record from Maker stage