Feature: Income Details Functionality 

@AT-ID-004
Scenario: Creation of Income details record with invalid data
Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Income Details record
And maker user open the record from inbox
Then click on Customer Financials Segment button
Then click on Customer Financials Record Edit button
Then click on Incom Details Add button
#Then click on Income Details Action Edit
Then verify the impact when user enter characters value in numeric field
Then verify the impact when user enter special characters value in any field
Then click on Income Details save button
Then Validate impact when user keep any mandatory field blank 

@AT-ID-001

Scenario: To check the functionality of Income Details Salaried
Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Income Details record
And maker user open the record from inbox
Then click on Customer Financials Segment button
Then click on Customer Financials Record Edit button
Then click on Incom Details Add button
Then Validate fields and button under Income details sections
Then Validate Auto populated Employment field
And employment type is salaried then validate bank and branch fields
Then Validate Total Income field auto populated post entring the amount
Then Validate Total Income Considered field auto populated post entring the amount
Then Validate Total Deduction field auto populated post entring the amount
Then Validate Total Deduction Considered field auto populated post entring the amount
Then Validate Currency Field should be drop down
Then click on Income Details save button
Then Validate Save Success msg

@AT-ID-005
Scenario: Creation of Income details record with invalid data
Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Income Details record
And maker user open the record from inbox
Then click on Customer Financials Segment button
Then click on Customer Financials Record Edit button
#Then click on Incom Details Add button
Then click on Income Details Action Edit
Then modify Income Details record with valid data
Then click on Income Details save button
Then Validate Save Success msg
And maker user open the record from inbox
Then click on Customer Financials Segment button
Then click on Customer Financials Record Edit button
#Then click on Incom Details Add button
Then click on Income Details Action Edit
Then Validate Valid modified record should get saved in a system

@AT-ID-006
Scenario: Creation of Income details record with invalid data
Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Income Details record
And maker user open the record from inbox
Then click on Customer Financials Segment button
Then click on Customer Financials Record Edit button
#Then click on Incom Details Add button
Then click on Income Details Action Edit
Then verify the impact when user enter special characters value in any field
Then click on Income Details save button
Then Validate impact when user keep any mandatory field blank 

@AT-ID-007
Scenario: Validation of Income details List View 
Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Income Details record
And maker user open the record from inbox
Then click on Customer Financials Segment button
Then click on Customer Financials Record Edit button
Then verify Income Details List View should display all the fields
Then values in Income Details list view should not be editable
Then verify Income Details add button should allow to create new record
Then verify Income Details search box should display matching record with matched data
Then verify Income Details search box should not display any record with mismatched data
Then Income Details export Pdf file
Then Income Details export Excel file
Then Income Details List view Back button should navigate to the previous screen
