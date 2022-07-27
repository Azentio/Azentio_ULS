Feature: Product Master Retail Functionality 
 @ProductMaster_Retail
Scenario: Product Master Retail Field validation 

Given User launch the kuls application
And User Login as maker
Then click on Product Setup
Then click on Product Master eye icon
Then click on Product Master add button
Then verify functionality and asterik mark of the field Product Group
Then verify functionality and asterik mark of the field Product Code
Then verify functionality and asterik mark of the field Product Description
Then verify functionality and asterik mark of the field RetailCorporate
Then verify functionality of the field DM Code
Then verify the field Remarks
Then verify the functionality of Back button
Then user logout from the application

 @ProductMaster_Retail_invalid
Scenario: System should not allow user to save the records with invalid data
Given User launch the kuls application
And User Login as maker
Then click on Product Setup
Then click on Product Master eye icon
Then click on Product Master add button
Then verify functionality and asterik mark of the field Product Group
Then verify functionality and asterik mark of the field Product Code
Then verify functionality and asterik mark of the field RetailCorporate
Then verify the field Remarks
Then click on save button
Then validate the impact of any mandatory field blank
Then verify the functionality of Back button
Then click on Product Master add button
Then verify functionality and asterik mark of the field Product Group
Then verify functionality and asterik mark of the field Product Code
Then Enter Product Description
Then verify functionality and asterik mark of the field RetailCorporate
Then verify the field Remarks with special characters value
Then click on save button
Then validate the impact of special characters value in any field
Then user logout from the application


@ProductMaster_Retail_Approve
Scenario: verify Checker user is able to Approve the record

Given User launch the kuls application
And User Login as maker
Then click on Product Setup
Then click on Product Master eye icon
Then click on Product Master add button
Then verify functionality and asterik mark of the field Product Group
Then verify functionality and asterik mark of the field Product Code
Then Enter Product Description
Then verify functionality and asterik mark of the field RetailCorporate
Then verify the field Remarks
Then click on save button
Then validate Success pop up
Then click on inbox
Then click on search icon of record list
Then search Project Master Retail record 
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on Menu
Then click on inbox
Then click on search icon of record list
Then search Project Master Retail record 
Then checker user open the record from inbox
Then checker user approve the record
Then user logout from the application
Given User launch the kuls application
And User Login as maker
Then click on Product Setup
Then click on Product Master eye icon
Then click on search icon
Then search approved record
Then user logout from the application

@ProductMaster_Retail_Return
Scenario: verify Checker user is able to Return the record
Given User launch the kuls application
And User Login as maker
Then click on Product Setup
Then click on Product Master eye icon
Then click on Product Master add button
Then verify functionality and asterik mark of the field Product Group
Then Enter Product Code for Return
Then Enter Product Description
Then verify functionality and asterik mark of the field RetailCorporate
Then verify the field Remarks
Then click on save button
Then validate Success pop up
Then click on inbox
Then click on search icon of record list
Then search Project Master Retail record 
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on Menu
Then click on inbox
Then click on search icon of record list
Then search Project Master Retail record 
Then checker user open the record from inbox
Then checker user return the record
Then user logout from the application
Given User launch the kuls application
And User Login as maker
Then click on Product Setup
Then click on Product Master edit icon
Then click on search icon
Then search the record
Then user logout from the application

@ProductMaster_Retail_Reject
Scenario: verify Checker user is able to Reject the record
Given User launch the kuls application
And User Login as maker
Then click on Product Setup
Then click on Product Master eye icon
Then click on Product Master add button
Then verify functionality and asterik mark of the field Product Group
Then Enter Product Code for reject
Then Enter Product Description
Then verify functionality and asterik mark of the field RetailCorporate
Then verify the field Remarks
Then click on save button
Then validate Success pop up
Then click on inbox
Then click on search icon of record list
Then search Project Master Retail record 
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on Menu
Then click on inbox
Then click on search icon of record list
Then search Project Master Retail record 
Then checker user open the record from inbox
Then checker user reject the record
Then user logout from the application
Given User launch the kuls application
And User Login as maker
Then click on Product Setup
Then click on Product Master eye icon
Then click on search icon
Then search Rejected record
Then user logout from the application


@ProductMaster_Retail_viewworkflow
Scenario: To verify the view workflow

Given User launch the kuls application
And User Login as maker
Then click on Product Setup
Then click on Product Master edit icon
#Then click on search icon
#Then search the record
Then open the record
Then click on view summary
Then verify the fields of view summary
Then close the view summary
Then user logout from the application





