Feature: Check the functionality of project master
  @M5 @ProjectMaster
  Scenario: Project Master - Modify records (approve, reject and return) at maker stage
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to project master
  	And click on edit view of project master
  	
  	Then click on edit button of record to modify
  	Then user should verify the buttons available on project master screen while modify
  	Then verify system should modify the record of project master before approved
  	
  	And click on eye icon of project master
  	Then verify system should modify already approved record of project master
  	Then verify system allow user to save modified record of project master with valid data
  	Then system should display the confirmation message
  	Then click on inbox button 
  	And select the modified record of project master from inbox to approve
  	Then click on submit button
  	Then system should display confirmation message after submit
  	
  #	And click on edit view of product master
 		And click on eye icon of product master
  	Then click on edit button of record2 to modify
  	Then verify system should modify the record before approved
  	Then click on inbox button 
  	And select the modified record from inbox to reject
  	Then click on submit button
  	Then system should display confirmation message after submit
  	
  #	And click on edit view of product master
  	And click on eye icon of product master
  	Then click on edit button of record3 to modify
  	Then verify system should modify the record before approved
  	Then click on inbox button 
  	And select the modified record from inbox to return
  	Then click on submit button
  	Then system should display confirmation message after submit
  	
  @M7 @ProjectMaster
  Scenario: Product Master - Modify records (approve, reject and return) at checker stage
  	Given User launch the kuls application
  	And User Login as checker
  	Then click on menu button
  	Then click on inbox button
  	Then select the modified record to approve
  	Then select approve button
  	Then enter remark for approve
  	Then click on approve button
  	Then system should display confirmation message after approved
  	
  	Then click on inbox button
  	Then select the modified record to reject
  	Then select reject button
  	Then enter remark for reject
  	Then click on reject button
  	Then system should display confirmation message after reject
  	
  	Then click on inbox button
  	Then select the modified record to return
  	Then select return button
  	Then enter remark for return
  	Then click on return button
  	Then system should display confirmation message after return
  	
	@M6 @ProjectMaster
  Scenario: Product Master - While modification, user verify proper validation message for blank field 
  																									and verify system should not allow to enter invalid datatypes.
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to product master
  	And click on edit view of product master
  	Then click on edit button of record to modify
  	Then verify proper validation message for blank field should display
  	Then verify system should not allow to enter invalid datatypes while modification
  	
  @M9 @ProjectMaster
  Scenario: Product Master - to check the functionality of status(active/deactive) and back button
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to product master
  	And click on edit view of product master
  	Then verify the functionality of status of the record
  	Then verify user can able to change the status from active to deactive
  	Then verify user can able to change the status from deactive to active
  	Then verify the functionality of back button
  	
  @M10 @ProjectMaster
  Scenario: Product Master - to check the functionality of list view buttons of approved records
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
  	
  	
  	
  	
  	
  	
  	
  	
