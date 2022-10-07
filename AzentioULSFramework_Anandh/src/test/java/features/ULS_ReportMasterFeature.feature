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

@AT-RA-008
Scenario: To verify checker user can able to reject the Report master updated record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on reject button to reject the record
And enter the remark in alert tab fo rejection
And click on reject button in alert box
Then verify record is rejected in checker stage 
@AT-RA-009
Scenario: To verify checker user can able to return the Report master updated record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on return button to return the record
And enter the remark in alert tab fo return
And click on return button in alert box
Then verify record is return in checker stage

@AT-RA-010
Scenario: To verify user can able to create the report master record with invalid inputs
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on view button neqar by report master module
And click on edit button of one of the approved record
And clear the input data of Report Name field
And clear input data of Report Name 2 field
And clear the input data of Report Name 3 field
And clear the input data of Report Description field
And clear the input data of report type field
And clear the input data of Report URL field
And clear the input data of Report category field
And click on save button to save the report master screen without data
Then verify all the mandatory field should show the validation for blank field
Then verify report name field should through the validation message post enter the special character input
Then verify report name 2 field should through the validation message post enter the special character input
Then verify report name 3 field should through the validation message post enter the special character input
Then verify report Description field should through the validation message post enter the special character input
@AT-RA-028
Scenario: To verify checker user can able to approve the Lo Module waiver record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on approve button to approve the record
And enter the remark in alert tab 
And click on approve button in alert box
Then verify record is approved in checker stage 
@AT-RA-029
Scenario: To verify checker user can able to rejected the Lo Module waiver record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on reject button to reject the record
And enter the remark in alert tab fo rejection
And click on reject button in alert box
Then verify record is rejected in checker stage
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
