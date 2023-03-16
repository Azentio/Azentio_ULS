Feature: Offer Details Functionality 

@OD-001
 Scenario: To check the functionality of Offer Details
Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Offer Details record
And maker user open the record from inbox
Then open Facility Info Record
Then Validate fields and Sections are available on Offer details screen
Then Verify Offer Details Section displayed data should be in read only mode


@OD-003
 Scenario: To check the functionality of Offer Details
Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Offer Details record
And maker user open the record from inbox
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
