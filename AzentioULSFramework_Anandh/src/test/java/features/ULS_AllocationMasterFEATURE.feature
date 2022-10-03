Feature: To Test the allocation master screen
Scenario: To verify user can able to update the allocation master record before approval
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on temp view near by allocation master screen
And select the first record of temp view in allocation master screen
Then verify user can able to see the save button in allocation master screen
Then verify user can able to see the back button in allocation master screen
Then verify user can able to see the Description field in allocation master screen
Then verify user can able to see the allocation code in allocation master screen
Then verify user can able to see the Status field in allocation master screen
And update the description field in allocation master
And update the allocation code field
And click on save button to update the allocation master record
Then verify allocation master record is saved in the system
And click on mail box
And search the allocation module event code
And select the allocation master first record
Then verify updated record visible for submission
And click on submit button to submit the record