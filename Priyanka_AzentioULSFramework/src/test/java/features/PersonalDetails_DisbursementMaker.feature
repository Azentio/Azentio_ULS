Feature: Personal Details Disbursement Maker Functionality 

@PDDM01
 Scenario: To check the functionality of Personal Details Disbursement Maker
Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Personal Details Disbursement Maker record
And maker user open the record from inbox
Then click on Customer Details Segment button
Then open Customer Details record
Then verify the field Customer Type
Then verify the field Applicant Type
Then verify the field Salutation 
Then verify the field First Name
Then verify the field Middle Name
Then verify the field Last Name
Then verify the field Date Of Birth
Then verify the field Gender
Then verify the field Edcuation Level
Then verify the field Marital Status
Then verify the field Nationality
Then verify the field Category 
Then verify the field Religion
Then verify the field Resident Status
Then verify the field Language
Then verify the field No of Dependents
Then verify the field Mothers Maiden Name
Then verify the field Type of Residence
Then verify the field Industry Segmentation
Then verify the toggle BlackListed




@PDDM02
 Scenario: To check the functionality of Personal Details Disbursement Maker List View
Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Personal Details Disbursement Maker record
And maker user open the record from inbox
Then click on Customer Details Segment button
Then verify Personal Details Disbursement Maker List View should display all the fields
Then values in Personal Details Disbursement Maker list view should not be editable
Then Personal Details Disbursement Maker export Pdf file
Then Personal Details Disbursement Maker export Excel file
#Then clicking on Back button system should navigate to the previous screen

@PDDM03
 Scenario: Verify System should not allow user to modify record of customer details
 Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Personal Details Disbursement Maker record
And maker user open the record from inbox
Then click on Customer Details Segment button
Then open Customer Details record
Then modification of Customer details record System should not allow
#Then click on Back button of Customer Details record


@PDDM04
 Scenario: Verify System should not allow user to add new record of customer details
 Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Personal Details Disbursement Maker record
And maker user open the record from inbox
Then click on Customer Details Segment button
Then verify the availability of Add button on customer details tab

