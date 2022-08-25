Feature: To Test the Report master module

#RM_02_01,RM_02_02,RM_02_03,RM_02_04
Scenario: To verify maker user can able to create the report master record with invalid inputs
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And Go to config manager main menu
And click on view button in report master
And click on add button in report master
Then verify back button and save buttons are appeared
And click on save button inreport master without filling the details
Then verify system should through the validation for the empty fields
And enter special charecters in text box
Then verify system should through the validation for report master
And click on back button in report master
Then verify report master screen should get back or not
@NegativeScenarioRPD
Scenario: To verify maker user can able to create report parameter details record with invalid input
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And Go to config manager main menu
And click on view button in report master
And click on add button in report master
And click on add button in report parameter details 
And click on save button in report parameter details without filling the mendaory details 
Then verify user can get the validation for incomplete data in mendatory field in report parameter details
And enter characters in numeric field in report parameter details
Then verify system should not allow to enter the charecter data into the numeric input box
And enter special charecter inputs in report parameter details 
Then verify system should through the validation for the special charecter inputs for special charecter 
And click on template field and select the data from the drop down
And click on is mendatory dropdown and select the value from the dropdown
And enter numeric inputs in all the charecter fields in report parameter details
Then verify system should not allow user to save the parameter details record
