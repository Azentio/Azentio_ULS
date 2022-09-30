Feature: Check the functionality of Application Details New App
@AT_ADA_002
Scenario: verify user is able to add new Template Application details  record in the system by entering invalid data
Given User Launch the KULS url for Transaction
Then user click on Transaction Module
And user click on Application Details
And user click the Add button annd verify it
And user Choose customer Type
And user Enter CIF ID
And user Enter Application Number
And user Enter Customer Name
And user choose ID Type
And user Enter ID Number
And user Enter Mobile Number
And user Choose Date of Birth
And user Enter Email ID
And user Click the search button
And user click the Create New Record button
And user Enter Character value in Numeric fields
And user save the record and verify the Message we get