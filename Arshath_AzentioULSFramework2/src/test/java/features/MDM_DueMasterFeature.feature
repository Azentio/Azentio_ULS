Feature: Validation of Due master Module
@Duemaster_M1
Scenario: Validate that user can able to create a due master record
Given Launch the kuls application and Navigate to Due master module view list
And Click on Add icon
And user pass the excel Testdata value for creation
And Enter the value in Due code field
And Enter the value in Description field
And Select the value in Waiver allowed field
And Enter the value in Legal code1 field
And Enter the value in Legal code2 field
And Enter the value in Legal code3 field
And Select the value in Repayment flag field
And Select the value in Future adjustment flag field
And Select the value in Is tax due field
And Select the value in Tax calculation method
And Enter the value in Remarks field
And Verify that required fields are present with red color astric symbol
Then Click on Save button

@Duemaster_M2
Scenario: Validate that User can able to create due master with invalid data
Given Launch the kuls application and Navigate to Due master module view list
And Click on Add icon
And Click on Save button without entering the values in required fields
And user pass the excel Testdata value for Invalid
And Enter the invalid value in text fields and make sure the warning popup is displayed
Then Click on Save button and make sure that user can able to save the record

@Duemaster_M3
Scenario: Validate that User can able to change the status of due master record
# This test casel also covers the functionality of M4 test case (Due_04_01)
Given Launch the kuls application and Navigate to Due master module view list
And Navigate to Temp view in view list
And Click on Pencil icon of the record
And Update the status of the record
Then Click on Save button
And Click on Pencil icon of the record
And Update the status of the record
Then Click on Save button
And Click on Pencil icon of the record
Then Verify the back button functionality
