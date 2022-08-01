Feature: To validate the negative fields in scheme master
@SchemeMaster_M5
Scenario:To verify user is able to add new Scheme master record  by entering invalid data 
Given Get the URL and login as maker
Then click on product definition
And Click the eyeicon in scheme master
Then Click the add button in scheme master
And Save the record in scheme master
Then Print the validation results
And Fill the invalid details
Then Click the back button
And Click the temp view button
And Click the edit icon of active record
Then Click the scheme charge segment button
Then Click the add button in scheme charge
And Save the record in scheme master
Then Print the validation results
Then Click the back button
And Click the Basic eligibility segment button
Then Click the add button in scheme master
And Save the record in scheme master
Then Print the validation results
Then Click the back button
And Click the verification segment button
Then Click the add button in scheme master
And Save the record in scheme master
Then Print the validation results
Then Click the back button
And Click the valuation button
Then Click the add button in scheme master
And Save the record in scheme master
Then Print the validation results
Then Click the back button

@SchemeMaster_M4
Scenario:To verify user is able to cancel Scheme master record  
Given Get the URL and login as maker
Then click on product definition
And Click the temp view icon
And Click the edit icon of active record
Then Cancel the record in scheme master

#This Test case have Bug
@SchemeMaster_M6
Scenario:To verify user is able to deactivate the Scheme master record  
#Given Get the URL and login as maker
#Then click on product definition
#Then click on temp view of scheme master
#And select the first record
#And click on charge scheme sub screen
#Then select the active data from the scheme master
#Then Deactivate the schemeCharge Record
#And save the charge scheme record
#Then goto basic eligibility screen
#Then select the active data from the eligibility screen
#Then change the staus to inactive
#Then save the eligibility record
#Then goto verification screen
#Then select the active record from the list of verification record
#And change the record status active to inactive
#Then save the verification Record
#Then goto valuation screen to add the data
#And Select the active data from the valuation screen
#And change the record status active to inactive
#And save the valuation record
#Then click on temp view of scheme master
#And select the first record
#Then Click the status button to change the active record
#Then Click the status button in scheme master
#And Save the record in scheme master screen
#And Click the temp view icon
#And Click the edit icon of active record
#Then Cancel the record in scheme master



