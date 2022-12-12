Feature: To Test the customer personal details Screen
@CEL_02
Scenario: To verify user can not able to create customer personal details record with invalid input
#Given navigate to uls application 
#And login with maker credentials
Given User launch the kuls application
And User Login as maker for transaction screen
Then select data set ID for Customer personal details testcase002
And click on mail box icon
And select the application record
And click on customer details record
And click on add button to add the customer personal detail record
And search the customer for individual customer
And choose customer for individual 
And enter the CIF ID
And enter the applicantion number
And enter customer name
And choose the ID type
And enter id number in id type field
And enter mobile number field
And give date of birth of the employee
And enter email Id
And click on search button to search the customer 
And click oncreate new request button
And set nationality field as blank field
And set maritail status fild as blank field
And click on save button before enter the mandatory field
Then verify customertype field should show the blank field validation message
Then verify applicant type field should show the blank field validation message
Then verify salutation field should show the blank field validation message
Then verify first name should show the blank field validation message
Then verify last name should show the blank field validation message
Then verify date of birth should show the blank field validation message
Then verify gender should show the blank field validation message
Then verify educational level should show the blank field validation message
Then verify Marital status should show the blank field validation message
Then verify nationality should show the blank field validation message
Then verify residencial status should show the blank field validation message
Then verify language should show the blank field validation message
#Then verify no of dependents should show the blank field validation message
Then verify Mothers maiden name should show the blank field validation message
Then verify type of residence should show the blank field validation message
Then verify category of client should show the blank field validation message
Then verify first name field should not allow numeric values
Then verify first name field should not allow special charecters
Then verify last name field should not allow numeric values
Then verify last name field should not allow special charecters
Then verify no of dependents field should not allow to enter numeric values
Then verify user can not enter negative input
Then verify mothers maiden name field should not allow numeric values
Then verify mothers maiden name field should not allow special charecters