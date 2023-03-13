Feature: check the functionality of Floating rate master screen
@AT_FRM_011
Scenario: verify the functionality of Activate/Deactivate button
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And user click on Floating rate master Temp view Icon
And user click on First Record Edit icon
And user verify the status button of the Record
And user click the status button to Deactive the record
And user click the save button
And user click on First Record Edit icon
And user verify the Deactive status in Record
And user click the status button to active the record
And user click the save button
And user click on First Record Edit icon
And user verify the active status in Record














