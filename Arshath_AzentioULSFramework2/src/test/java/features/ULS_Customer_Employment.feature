Feature: Check the functionality of Customer Employment
@AT-CE-004
Scenario: verify user is able to add new Employment Details record in the system by entering invalid data
Given User Launch the KULS url for Transaction
And user click on Inbox Icon
And user click search icon
And user Enter Customer Employment Application ID
And user click on First record of Appdata Entry
And user click on Customer Financials Tab
And user click on First Record Edit Icon
And user click on Customer Employement Add button
And user Enter character value in Numeric Field
#And user Enter Numeric value in Character field
And user Enter Special character in Any field
And Validate the Message and verify it
And user verify and save the Records with InValid data
Then user verify the Required field proper validation message






























