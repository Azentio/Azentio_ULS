Feature: To Test the asset collateral type
Scenario: To verify user should not able to create the asset collateral type record with in valid input
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on asset collateral config menu
Then click on asset collateral type view button
And click on add button in asset collateral 
And click on save button in asset collateral type
Then verify system should show the validation for the invalid fields
Then verify system should not allow to save the record when user enter numbers in all the text box
Then verify user not able to enter charecters in numeric field
Then verify system should not allow user to create the record with special characters