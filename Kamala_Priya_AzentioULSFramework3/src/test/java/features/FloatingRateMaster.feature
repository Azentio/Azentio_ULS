Feature: To verify the functionality of the foating rate master
#(FRM_01_001,FRM_01_002,FRM_01_003,FRM_01_004,FRM_01_005,FRM_01_006,FRM_01_007,FRM_01_008,FRM_01_013)

@FloatingRate_M1
Scenario: Creation of  Floating rate Master record
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the eye icon of the floating rate master
Then Click the add button in floating rate master
And Check all the fiels are avaliable in floating rate master
Then To verify the red astriek mark on all the mandatory fields
And Select the Index Rate type
Then Enter the Index rate
And Choose the valid form date
Then Enter the remark
And Save the record
Then Cancel the popup
Then Click the inbox in Floating rate master
And Search the record in Floating rate master
Then Get the reference id and store it in json in floating rate master
And Click the action icon of respective floating rate master
#And Save the record captured with popup
#Then Click the pencil icon 
And Submit the record
Then Get the checker id and store it in a excel

#FRM_01_009
#@FloatingRate_M2
#Scenario: To verify the functionality of Cancel button of  Floating rate Master record#
#Given Get the URL and login as maker
#And Click the configuration
#Then Click the config Manager
#And Click the eye icon of the floating rate master
#Then Click the add button in floating rate master
#And Select the Index Rate type
#Then Enter the Index rate
#And Choose the valid form date to cancel the record
#Then Enter the remark
#And Save the record
#Then Click the pencil icon
#And verify the cancel button
#(FRM_01_010,FRM_01_012)
@FloatingRate_M3
Scenario: To verify the functionality of active and inactive record of  Floating rate Master record
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the temp view button in floating rate master
Then Click the pencil icon
Then Change the status to active
And Save the record captured with popup
#Then Click the pencil icon
Then Change the status to active
And Save the record captured with popup
#And Save the record in floating rate master

#(FRM_02_001,FRM_02_002,FRM_02_004,FRM_02_003)

@FloatingRate_M4
Scenario: To verify system display the proper validation message in Floating rate Master record
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the eye icon of the floating rate master
Then Click the add button in floating rate master
And Check the functionality of invalid input
And Save the record for validation
And Click the eye icon of the floating rate master
Then Click the add button in floating rate master
And Save the record for validation
Then Print the validation output in floating rate master
Then Check the functionality of back button
@FloatingRate_M12
Scenario: To verify the Floating Rate master details List view
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the eye icon of the floating rate master
Then To verify the values in List view should be non editable in floating rate master
Then To verify the functionality of Search box with matching data in a floating rate master
And To verify the functionality of Search box with mismatch data in floating rate master
Then To verify the functionality of Export to PDF button in floating rate master
And To verify the functionality of Export to Excel button in floating rate master
#Checker Approve
@FloatingRate_2
Scenario: To verify the user able to approve the record in Floating rate master
Given Get the url and login as a checker in floationg rate master
Then Click the inbox in floating rate master checker
And Search the reference id and click the respective action icon in floating rate master
Then click the approve button in the floating rate master
And Select the remark to approve the record in floating rate master
Then Click the final approve button in floating rate master
And verify the record got approved in the floating rate master
#Checker Reject
@FloatingRate_2
Scenario: To verify the user able to reject the record in Floating rate master
Given Get the url and login as a checker in floationg rate master
Then Click the inbox in floating rate master checker
And Search the reference id and click the respective action icon in floating rate master
Then click the reject button in the floating rate master
And Select the remark to reject the record in floating rate master
Then Click the final reject button in floating rate master
And verify the record rejected in the floating rate master
#Checker Return
@FloatingRate_2
Scenario: To verify the user able to reject the record in Floating rate master
Given Get the url and login as a checker in floationg rate master
Then Click the inbox in floating rate master checker
And Search the reference id and click the respective action icon in floating rate master
Then click the return button in the floating rate master
And Select the remark to return the record in floating rate master
Then Click the final return button in floating rate master
And verify the record returned to maker in the floating rate master
#Modification Negative validation
@FloatingRate_7
Scenario: To verify user able to save the modified record with blank and invalid date
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And click the temp view in floating rate master
Then Select the first record in temp view of floating rate master
And Choose the row number in mexcel sheet
And click and choose the select fied in index rate type and make that field as blank 
And Update the record for validation while modifying
Then Validate the blank field popup in  floating rate master
Then click and pass the invalid details for index rate in floating rate
And Validate the the invalid detail popup in floating rate master
And Update the record for validation while modifying
#Modification Before approving the record
@FloatingRate_002
Scenario: To verify user able to modify and save the record before approval
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And click the temp view in floating rate master
Then Select the first record in temp view of floating rate master
And Choose the row number in excel sheet for modification before approving the record
And click and modify the field index rate type
Then Click and modify the field index rate
And Click and modify the remark
And Save the record captured with popup
#Modification After approving the record
@FloatingRate_007
Scenario: To verify user able to do modification and save the record after approval
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the eye icon of the floating rate master
Then Select the first record in temp view of floating rate master
And Choose the row number in excel sheet for modification before approving the record
And click and modify the field index rate type
Then Click and modify the field index rate
And Click and modify the remark
And Save the record captured with popup






