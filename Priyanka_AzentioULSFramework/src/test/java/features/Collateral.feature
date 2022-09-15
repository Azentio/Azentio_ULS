Feature: collateral Functionality 

@collateral_InvalidDataM2 @M2
 Scenario: System should display the proper validation post entering the invalid data and clicking on save button
Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral eye icon
Then click on collateral add button
Then Enter collateral Description
Then Enter collateral Module
Then click on collateral Registration Required Toggle
Then click on collateral Reposession Toggle
Then Enter collateral Remarks
Then click on collateral save button
Then validate the impact of any collateral mandatory field blank
Then click on collateral back button
Then click on collateral eye icon
Then click on collateral add button
Then Enter collateral Description
Then Enter special char in Asset collateral Category Code
Then validate the impact of any collateral field with special char
Then user logout from the application

 @M6
 Scenario: To verify while modification system enters the invalid data
Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral eye icon
Then open the already approved record
Then modify the record with any mandatory field blank
Then click on collateral save button
Then validate the impact when user keep any mandatory field blank
Then modify the record with invalid data 
Then validate the impact of invalid data 
Then user logout from the application

@M7
 Scenario: To verify the functionality of Activate and Deactivate button
Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral eye icon
Then validate status of the collateral record is active
Then verify able to change the collateral record status from active to deactive
Then validate Success pop up
Then validate status of the collateral record is Inactive
Then verify able to change the collateral record status from deactive to active
Then validate Success pop up
Then user logout from the application

@M8 @M12
 Scenario: collateral - To verify the functionality of View Workflow button
Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral Edit icon
Then open collateral wip record
Then click on collateral view summary
Then verify the fields of collateral view summary
Then close the collateral view summary 
Then user logout from the application

@M9 
 Scenario: collateral - to check the functionality of list view buttons of approved records
Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral eye icon
Then verify collateral details list view fields should display all the fields
Then values in collateral list view should not be editable
Then verify collateral add button should allow to create new record
Then verify collateral search box should display matching record with matched data
Then verify collateral search box should not display any record with mismatched data
Then click on collateral export to pdf button system should download Pdf file
Then click on collateral export to excel button system should download Excel file
Then user logout from the application

#@M10-NA

@M11
 Scenario: collateral - to check the functionality of list view buttons of WIP records
Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral Edit icon
Then verify collateral wip list view fields should display all the fields
Then values in collateral wip list view should not be editable
Then verify collateral wip add button should allow to create new record
Then verify collateral wip search box should display matching record with matched data
Then verify collateral wip search box should not display any record with mismatched data
Then click on collateral wip export to pdf button system should download Pdf file
Then click on collateral wip export to excel button system should download Excel file
Then user logout from the application

@collateral_return @ACCM_07_003 @ACCM_07_004
 Scenario: Asset collateral category - List View WIP Records
 					 To verify return button at checkes side.
Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral Edit icon
Then open collateral wip record for return
Then click on collateral save button
Then validate Success pop up
Then click on inbox
Then click on search icon of record list
Then search collateral record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on inbox
Then click on search icon of record list
Then search collateral record
Then checker user open the record from inbox
Then validate Txn status is completed
Then close the collateral view summary 
Then checker user return the record
Then user logout from the application
And User Login as maker
Then click on Asset collateral config
Then click on collateral Edit icon
Then search and validate the approved record 
#Then open collateral wip record for return
Then user logout from the application


@collateral_Creation_Rejection  @M1_M3_M4  @ACCM_07_002 @ACCM_07_001 @ACCM_07_004
 Scenario: Creation of Asset collateral categorydetails record with valid data.
 					 System should display all the captured and saved records.
 					 System should allow user to modify the Asset collateral category details before approve the record.
 					 To verify Approve button at checkes side
					 To verify system allow user to do a modification on already approved record
					 To verify reject button at checker side
Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral eye icon
Then click on collateral add button
Then verify Description field is multi langual
Then Enter Asset collateral Category Code
Then Enter collateral Module
Then click on collateral Registration Required Toggle
Then click on collateral Reposession Toggle
Then Enter collateral Remarks
Then click on collateral save button
Then validate Success pop up
#To verify user is able to edit the record in view screen.
Then click on collateral Edit icon
Then open collateral wip record
Then click on collateral view summary
Then Validate Txn status is in Pending state
Then close the collateral view summary 
Then edit the record with module field
Then click on collateral save button
Then validate Success pop up
Then click on inbox
Then click on search icon of record list
Then search collateral record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on inbox
Then click on search icon of record list
Then search collateral record
Then checker user open the record from inbox
Then validate Txn status is completed
Then close the collateral view summary 
Then checker user approve the record
Then user logout from the application
#Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral eye icon
Then search and validate the approved record 
Then Modify the approved record 
Then click on collateral save button
Then validate Success pop up
Then click on inbox
Then click on search icon of record list
Then search collateral record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on inbox
Then click on search icon of record list
Then search collateral record
Then checker user open the record from inbox
Then validate Txn status is completed
Then close the collateral view summary 
Then checker user reject the record
Then user logout from the application
#Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral eye icon
Then search and validate the approved record 
Then validate after rejection no changes should occur
Then user logout from the application

@M5
 Scenario: To verify the impact when user modify any approved record and reapprove the same
Given User launch the kuls application
And User Login as maker
Then click on Asset collateral config
Then click on collateral eye icon
Then open the already approved record
Then Modify the approved record 
Then click on collateral save button
Then validate Success pop up
Then click on inbox
Then click on search icon of record list
Then search collateral record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on inbox
Then click on search icon of record list
Then search collateral record
Then checker user open the record from inbox
Then checker user approve the record
Then user logout from the application
And User Login as maker
Then click on Asset collateral config
Then click on collateral eye icon
Then open the already approved record
Then Validate Old data get replaced with new one
Then user logout from the application






#@M6
#Scenario: collateral-While modification, user verify proper validation message for blank field 
  #				and verify system should not allow to enter invalid data.
#Given User launch the kuls application
#And User Login as maker
#Then click on Asset collateral config
#Then click on collateral Edit icon
#Then open collateral wip record
#Then verify impact on modification with blank field
#Then verify impact on modification with invalid data




