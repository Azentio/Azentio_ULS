Feature: Test the Liing expense module
@AT_LE_018
Scenario: To verify user can able to update the living expense with invalid inputs
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And go to other master main module
And click on view button in living expense module 
And select the approved record of living expense
And go to living expese parameter tab
And select the living expense parameter approved record
And clear all the input fields of living expense approved record
And click on save button in living expense record
Then verify system should through the validation for blank field
And enter invalid special charecter in input box
Then verify system should through the validation in living expense parameter screen
And click on back button in living expense parameter screen
Then verify living expense parameter screen should get navigate to previous screen

@AT_LE_019
Scenario: To verify maker user can able to update the living expense parameter approved record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And go to other master main module
And click on view button in living expense module 
And select the approved record of living expense
And go to living expese parameter tab
And select the living expense parameter approved record
And update the living expense paramater record
And click on save button in living expense record
And click on mail box and find the living expense record 
And submit the living expese record
Then give alert remark and click on submit in alert for living expense record
Then store the checker id for living expense record

@CheckerApproval
Scenario: To verify checker user can able to approve the living expense updated record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on approve button to approve the record
And enter the remark in alert tab 
And click on approve button in alert box
Then verify record is approved in checker stage 
@CheckerReject
Scenario: To verify checker user can able to rejected the living expense updated record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on reject button to reject the record
And enter the remark in alert tab fo rejection
And click on reject button in alert box
Then verify record is rejected in checker stage 
@CheckerReturn
Scenario: To verify checker user can able to return the living expense updated record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on return button to return the record
And enter the remark in alert tab fo return
And click on return button in alert box
Then verify record is return in checker stage
