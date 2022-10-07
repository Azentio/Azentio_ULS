Feature: To Test the allocation master screen
@AT-ALM-006
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
And click on mail box find the allocation master record
And search the allocation module event code
And select the allocation master first record
Then verify updated record visible for submission
And click on submit button to submit the record
And enter the alert remark in allocation master record
And click on alert submit button in allocation master record
And get the checker id for allocation master record


@AT-ALM-008
Scenario: To verify make user can not able to update the allocation master record with invalid inputs and blank field
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on view icon near by allocation master screen
And select the approved record in allocation master list view
And clear the input field of description 
And clear the input field of allocation code
And click on save button with out data in mandatory field in allocation master
Then verify mandatory field are showing validation in allocation master screen
And enter the special character input in description field
And enter the special character input in allocation code field
Then verify description field show the validation for special characecter 
Then verify allocation code field show the validation for special characecter
And click on back buttonin allocation master updation screen
Then verify back button is working as we expected

@AT-ALM-009
Scenario: To verify checker user can able to approve the updated allocation master record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on approve button to approve the record
And enter the remark in alert tab 
And click on approve button in alert box
Then verify record is approved in checker stage 
@AT-ALM-010
Scenario: To verify checker user can able to rejected the updated allocation master record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on reject button to reject the record
And enter the remark in alert tab fo rejection
And click on reject button in alert box
Then verify record is rejected in checker stage 
@AT-ALM-011
Scenario: To verify checker user can able to return the updated allocation master record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on return button to return the record
And enter the remark in alert tab fo return
And click on return button in alert box
Then verify record is return in checker stage

@AT-ALM-017
Scenario: To verify checker user can able to approve the updated allocation details record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on approve button to approve the record
And enter the remark in alert tab 
And click on approve button in alert box
Then verify record is approved in checker stage 
@AT-ALM-018
Scenario: To verify checker user can able to rejected the updated allocation details record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on reject button to reject the record
And enter the remark in alert tab fo rejection
And click on reject button in alert box
Then verify record is rejected in checker stage 
 