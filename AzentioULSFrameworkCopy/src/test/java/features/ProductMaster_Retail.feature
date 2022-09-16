Feature: Check the functionality of product master
#Priyanka
@ProductMaster_Retail
Scenario: Product Master Retail Field validation 
#PM_01_01, PM_01_02, PM_01_03, PM_01_04, PM_01_05, PM_01_06, PM_01_07, PM_01_09, PM_01_10, PM_01_11, PM_01_14
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
 # PM_02_01, PM_02_02, PM_01_03, PM_02_04"
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
And User Login as checker
#Then click on Menu
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
And User Login as checker
#Then click on Menu
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
And User Login as checker
#Then click on Menu
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
  
  #Devesh
  @M5 @ProductMaster
  Scenario: Product Master - To verify Checker user is able to Approve, Reject and Return the modified records
  #PM_03_01, PM_03_02, PM_03_03, PM_03_04, PM_03_07, PM_03_08, PM_03_09, PM_03_10, PM_03_11, PM_03_10, PM_03_11
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to product master
  	And click on edit view of product master
  	Then click on edit button of record to modify
  	Then user should verify the buttons available on screen while modify
  	Then verify system should modify the record before approved
  #	submit record in maker for approval
  	And click on eye icon of product master
  	Then verify system should modify already approved record
  	Then verify system allow user to save modified record with valid data
  	Then system should display the confirmation message
  	Then click on inbox button
  	And select the modified record from inbox to approve
  	Then click on submit button
  	Then system should display confirmation message after submit
  	Then capture checker ID
  	Then logout user
  #	checker approved the record
  	And User Login as checker
  	Then click on inbox button
  	Then select the modified record to approve
  	Then select approve button
  	Then enter remark for approve
  	Then click on approve button
  	Then system should display confirmation message after approved
  	Then logout user
  #	submit record in maker for reject
  	And User Login as maker
  	Then user should navigate to product master
 		And click on eye icon of product master
  	Then click on edit button of record2 to modify
  	Then verify system should modify the record before approved
  	Then click on inbox button
  	And select the modified record from inbox to reject
  	Then click on submit button
  	Then system should display confirmation message after submit
  	Then capture checker ID
  	Then logout user
  # checker reject the record
  	And User Login as checker
  	Then click on inbox button
  	Then select the modified record to reject
  	Then select reject button
  	Then enter remark for reject
  	Then click on reject button
  	Then system should display confirmation message after reject
  	Then logout user
  #	submit record in maker for return
  	And User Login as maker
  	Then user should navigate to product master
  	And click on eye icon of product master
  	Then click on edit button of record3 to modify
  	Then verify system should modify the record before approved
  	Then click on inbox button
  	And select the modified record from inbox to return
  	Then click on submit button
  	Then system should display confirmation message after submit
  	Then capture checker ID
  	Then logout user
  #	checker return the record
  	And User Login as checker
  	Then click on inbox button
  	Then select the modified record to return
  	Then select return button
  	Then enter remark for return
  	Then click on return button
  	Then system should display confirmation message after return
  	Then logout user
  	
	@M6 @ProductMaster
  Scenario: Product Master - While modification, user verify proper validation message for blank field 
  																									and verify system should not allow to enter invalid datatypes.
	#	PM_03_05, PM_03_06
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to product master
  	And click on edit view of product master
  	Then click on edit button of record to modify
  	Then verify proper validation message for blank field should display
  	Then verify system should not allow to enter invalid datatypes while modification
  	
  @M9 @ProductMaster
  Scenario: Product Master - to check the functionality of status(active/deactive) and back button
  #PM_03_15, PM_03_16, PM_03_17
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to product master
  	And click on edit view of product master
  	Then verify the functionality of status of the record
  	Then verify user can able to change the status from active to deactive
  	Then verify user can able to change the status from deactive to active
  	Then verify the functionality of back button of product master
  	
  @M10 @ProductMaster
  Scenario: Product Master - to check the functionality of list view buttons of approved records
  #PM_04_01, PM_04_02, PM_04_03, PM_04_08,  PM_04_09, PM_04_10, PM_04_11, PM_04_12, 
  #PM_04_13, PM_04_14 ,PM_04_15,  PM_04_16
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to product master
  	And click on eye icon of product master
  	
  	Then verify product master details list view fields should display all the fields
  	Then values in list view should not be editable
  	Then verify add button should allow to create new record
  	Then verify search box should display matching record with matched data
  	Then verify search box should not display any record with mismatched data
  	Then click on export to pdf button system should download Pdf file
  	Then click on export to excel button system should download Excel file
  	Then system should show product group field and the field will display only
  	Then system should show product code field and the field will display only
  	Then system should show product description field and the field will display only
  	Then system should show retail or corporate field and the field will display only
  	Then system should show status field and the field will display only
  	
#Ajith
@M11
Scenario: To verify the Product Master List view of records
# M11 test case includes following functionality PM_05_01 PM_05_02 PM_05_03 PM_05_04 
# PM_05_05 PM_05_06 PM_05_07 PM_05_08 PM_05_09 PM_05_10 PM_05_11 PM_05_12
Given User launch the kuls application
And User Login as maker
Then user should navigate to product master
And user click temp view in product master retail
And user verify add button is displayed in screen
And user verify search for record icon is displayed in screen
And user verify export to pdf option is displayed in screen
And user verify export to excel option is displayed in screen
And user verify product group is displayed in screen
And user verify product code is displayed in screen
And user verify product description is displayed in screen
And user verify retail or corporate is displayed in screen
And user verify status is displayed in screen
And user verify Authorization status is displayed in screen
And user verify the functionality of add button
And user verify the search results show matched data
And user verify the search results shows no data
And user verify post clicking pdf option pdf file will be downloaded
And user verify post clicking xls option excel file will be downloaded
And user verify Field should show product group and will be display only
And user verify Field should be product code and will be displa yonly
And user verify Field should be auth status and will be display only
And user verify Field should be retail and corporate will be display only
And user verify Field should be status and will be display only
And user verify Field should be auth status and will be display only
