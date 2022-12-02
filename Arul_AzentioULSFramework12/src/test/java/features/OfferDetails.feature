Feature: Offer Details Functionality 
@OD-001
Scenario: To check the functionality of Offer Details
#This test case also covers the functionaity of OD-002
Given Launch the kuls application
And Navigate to Mail box
And update test data for offer details test case one
And Sarch the value in Mail box
And Click on action icon of first record in offering details
Then open Facility Info Record
Then Validate fields and Sections are available on Offer details screen
Then Verify Offer Details Section displayed data should be in read only mode

@OD-003
 Scenario: To check the functionality of Finance details section in  Offer Details
Given Launch the kuls application
And User Login as maker
And Navigate to Mail box
And update test data for offer details test case three
And Sarch the value in Mail box
And Click on action icon of first record in offering details
Then open Facility Info Record
Then Verify Offer Details Section displayed data should be in read only mode
Then verify all the fields should be available on the Finance Details section 
Then verify the field Total Down Payment Amount should be in read only mode
Then verify the field Profit Amount should be in read only mode
Then verify the field Total Contract Value should be in read only mode
Then verify the field Additional Down payment should be in read only mode
Then verify the field Down Payment Percentage should be in read only mode
Then verify all the fields should be available on the Credit Risk Factor section
Then verify all the fields of Credit Risk Factor section should be in read only mode 
Then verify all the fields should be available on the Credit Score Details section
Then verify all the fields of Credit Score Details section should be in read only mode 

@AT_OLOD_004
Scenario: Verify system should allow user to do a modification with valid data
Given Launch the kuls application
And User Login as maker
And Navigate to Mail box
And update test data for offer details test case four
And Sarch the value in Mail box
And Click on action icon of first record in offering details
Then open Facility Info Record
Then verify the Eligibility Details section fields are available
And verify all the fields under section eligibility details should have lookup values
And verify all the fields under section eligibility details should be in read only mode
		
@AT_OLOD_005
Scenario: To verify the section Interest Rate Structure & Installments section
Given Launch the kuls application
And User Login as maker
And Navigate to Mail box
And update test data for offer details test case five
And Sarch the value in Mail box
And Click on action icon of first record in offering details
Then open Facility Info Record
Then verify the section Interest Rate Structure fields are available
And verify all the fields under section Interest Rate Structure should have lookup values
And verify all the fields under section Interest Rate Structure should be in read only mode
Then verify the section Installments fields are available
Then verify the field period under section Installments should be in read only mode
Then verify Installments having same amount would be clubbed under same leg
Then verify the field Installment amount should be non editable
		
@AT_OLOD_006
Scenario: To verify the section Interest Rate Structure & Installments section
Given Launch the kuls application
And User Login as maker
And Navigate to Mail box
And update test data for offer details test case six
And Sarch the value in Mail box
And Click on action icon of first record in offering details
Then open Facility Info Record
Then verify the section Appeal Request fields are available
Then verify New Requested Tenure field system should allow user to enter value manually
Then verify New Requested Amount field system should allow user to enter value manually
Then verify the field Original Requested Tenure should be in read only mode
Then verify the field Original Requested Amount should be in read only mode
Then verify the functionality of save button under section Appeal Request
Then Validate the Success popup
Then verify system should display validation message for invalid data post clicking on save button under section Appeal Request
Then verify system display the confirmation message post clicking on save button under section Appeal Request
Then verify system should display proper validation message to enter new requested amount and Tenure
Then verify the Functionality of Appeal button
		
