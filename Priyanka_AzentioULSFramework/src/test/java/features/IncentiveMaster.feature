Feature: IncentiveMaster Functionality 

@IncentiveMaster @M1
 Scenario: To verify user is able to add new Incentive Master record in the system by entering valid data
Given User launch the kuls application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master eye icon
Then click on Incentive Master add button
Then Enter Incentive code
Then Enter Incentive Description 
Then Enter Incentive Description2
Then Enter Incentive Description3
Then Select Incentive Mode  
Then Select Incentive Type
Then Enter Flat Amount
Then Enter Incentive Percentage
Then Select Incentive Computation on 
Then click on Incentive Master Save button
Then validate Success pop up
Then click on inbox
Then click on inbox search icon 
Then search Incentive Master record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on inbox
Then click on inbox search icon 
Then search Incentive Master record
Then checker user open the record from inbox
Then checker user approve the record
Then user logout from the application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master eye icon
#Then search and validate the Incentive approved record

@IncentiveMaster @M2
 Scenario: To verify user is able to add new Incentive Master record in the system by entering valid data
Given User launch the kuls application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master eye icon
Then click on Incentive Master add button
Then Enter Incentive code for reject record
Then Enter Incentive Description 
Then Select Incentive Mode  
Then Select Incentive Type
Then Select Incentive Computation on 
Then click on Incentive Master Save button
Then validate Success pop up
Then click on inbox
Then click on inbox search icon 
Then search Incentive Master record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on inbox
Then click on inbox search icon 
Then search Incentive Master record
Then checker user open the record from inbox
Then checker user reject the record
Then user logout from the application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master eye icon 

@IncentiveMaster @M3
 Scenario: To verify user is able to add new Incentive Master record in the system by entering valid data
Given User launch the kuls application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master eye icon
Then click on Incentive Master add button
Then Enter Incentive code for return record
Then Enter Incentive Description 
Then Select Incentive Mode  
Then Select Incentive Type
Then Select Incentive Computation on 
Then click on Incentive Master Save button
Then validate Success pop up
Then click on inbox
Then click on inbox search icon 
Then search Incentive Master record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on inbox
Then click on inbox search icon 
Then search Incentive Master record
Then checker user open the record from inbox
Then checker user return the record
Then user logout from the application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master eye icon


@IncentiveMaster @M4
 Scenario: To verify Creation of Incentive Master record with invalid data
Given User launch the kuls application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master eye icon
Then click on Incentive Master add button
Then Enter Incentive code special character
Then Select Incentive Mode 
Then Select Incentive Type
Then Select Incentive Computation on 
Then click on Incentive Master Save button
Then Keep Incentive Description field blank

@IncentiveMasterM9 
 Scenario: To verify the Incentive Definition details List view Approved Records
Given User launch the kuls application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master eye icon
Then verify Incentive Master list view should display all the fields
Then values in Incentive Master list view value should not be editable
Then verify Incentive Master add button should allow to create new record
Then verify Incentive Master search box should display matching record with matched data
Then verify Incentive Master search box should not display any record with mismatched data
Then click on Incentive Master export to pdf button system should download Pdf file
Then click on Incentive Master export to excel button system should download Excel file
Then user logout from the application


@IncentiveMasterM10 
 Scenario: To verify the Incentive Definition details List view Approved Records
Given User launch the kuls application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master Time icon
Then verify Incentive Master list view should display all the fields
Then values in Incentive Master list view value should not be editable
Then verify Incentive Master add button should allow to create new record
Then verify Incentive Master search box should display matching record with matched data
Then verify Incentive Master search box should not display any record with mismatched data
Then click on Incentive Master export to pdf button system should download Pdf file
Then click on Incentive Master export to excel button system should download Excel file
Then user logout from the application


@IncentiveMasterM6
 Scenario: Modification of Incentive Master record with invalid data
Given User launch the kuls application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master eye icon
Then open the record for Invalid modification 
Then click on Incentive Master Save button
Then system should not allow to save the record
Then user logout from the application



@IncentiveMasterM5
 Scenario: Modification of Incentive Master record with valid data
Given User launch the kuls application
And User Login as maker
Then click on Misc Config 
Then click on Incentive Master eye icon