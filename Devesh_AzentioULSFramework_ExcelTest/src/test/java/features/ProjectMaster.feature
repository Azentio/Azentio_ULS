Feature: Check the functionality of project master
 	#	PM_01_86,PM_01_87,PM_01_88
  @T002 @ProjectMaster
  Scenario: Project Master - to verify checker user is able to approve, reject and return the record
  	#	checker approved the record
  	And User Login as checker user
  	Then click on inbox button of project master
  	Then select the submitted record of project master by maker to approve
  	Then select approve button in checker stage of project master
  	Then enter remark for approve the record of project master
  	Then click on approve button to approve project master record
  	Then system should display confirmation message after approved the record of project master
  	Then logout user from the application
  	
  	# checker reject the record
  	And User Login as checker user
  	Then click on inbox button of project master
  	Then select the submitted record of project master by maker to reject
  	Then select reject button in checker stage of project master
  	Then enter remark for reject the record of project master
  	Then click on reject button to reject project master record
  	Then system should display confirmation message after reject the record of project master
  	Then logout user from the application
  	
  	#	checker return the record
  	And User Login as checker user
  	Then click on inbox button of project master
  	Then select the submitted record of project master by maker to return
  	Then select return button in checker stage of project master
  	Then enter remark for return the record of project master
  	Then click on return button to return project master record
  	Then system should display confirmation message after return the record of project master
  	Then logout user from the application
  	
  #	PM_02_01
  @T003 @ProjectMaster
  Scenario: Project Master - To verify the impact when user keep any mandatory field blank and click on save button
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to project master
  	And click on edit view of project master
  	Then click on add button
  	Then click on save button in project master
  	Then verify proper validation message for blank field should display in project master
  	
  #	PM_02_02,PM_02_03,PM_02_04"
	@T004 @ProjectMaster
  Scenario: Project Master - To verify the impact when user enter numeric value in character field,
  													 characters value in numeric field and only special characters value in any field
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for project master testcase004
  	Then user should navigate to project master
  	And click on eye icon of project master
  	Then click on add button
  	Then verify system should not allow to enter invalid datatypes in project master
 
  @T005 @ProjectMaster
  Scenario: Project Master - Verify all the fields of Address Details, Payment Plans, Exposure Tracking Details
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for project master testcase005
  	Then user should navigate to project master
  	And click on edit view of project master
  	Then click on add button
  	Then verify Address Details fields are displayed under Project Master Modify menu
  	Then verify Payment Plans Details fields are displayed under Project Master Modify menu
  	Then verify Exposure Tracking Details fields are displayed under Project Master Modify menu
  	And click on edit view of project master
  	Then click on add button
  	Then Fill all the valid fields in the project master screen
  	Then verify system allow user to save record of project master with valid data
  	Then confirmation message displays with reference id in project master
  	Then click on inbox button to select the record of project master
  	And select the record of project master from inbox to submit
  	Then modify the valid fields in the project master screen
  	Then verify system allow user to save modified before approved record of project master with valid data
  	
  #	PM_03_08
  @T006 @ProjectMaster
  Scenario: Project Master -  While modification, user verify proper validation message for blank field post clicking save button
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for project master testcase006
  	Then user should navigate to project master
  	And click on eye icon of project master
  	Then click on edit button of record to modify in project master
  	Then click on save button in project master
  	Then verify while modification proper validation message for blank field should display in project master
	
	# PM_03_09
	@T007 @ProjectMaster
  Scenario: Project Master - To verify the impact when user enter numeric value in character field,
  													 characters value in numeric field and only special characters value in any field
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to project master
  	And click on eye icon of project master
  	Then click on edit button of record to modify in project master
  	Then verify system should not allow to enter invalid datatypes in project master
  	
  @T008 @ProjectMaster
  Scenario: Project Master - Verify modification of Project Master already approved record
 	  Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for project master testcase008
  	Then user should navigate to project master
  	And click on edit view of project master
  	Then click on eye icon of project master
  	Then click on edit button of record to modify in project master modify
  	Then modify the valid fields in the project master screen
  	Then verify system allow user to save modified already approved record of project master with valid data
  	
  	
  @T009a @ProjectMaster
  Scenario: Project Master - Verify checker user is able to approve the record from checker stage
 	  Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for project master testcase009a
  	Then user should navigate to project master
  	Then click on eye icon of project master
  	Then click on edit button of record to modify in project master modify
  	Then modify the valid fields in the project master screen
  	Then verify system allow user to save record of project master with valid data
  	Then confirmation message displays with reference id in project master
  	Then click on inbox button
  	And select the modified record of project master from inbox to approve
  	Then click on submit button in project master
  	Then system should display confirmation message after submit project master record
  	Then capture checker ID of project master
  	Then logout user from maker stage project master
  	#	checker approved the record
  	And User Login as checker user
  	Then click on inbox button of project master
  	Then select the submitted record of project master by maker to approve
  	Then select approve button in checker stage of project master
  	Then enter remark for approve the record of project master
  	Then click on approve button to approve project master record
  	Then system should display confirmation message after approved the record of project master
  	Then logout user from the application
  	
  @T009b @ProjectMaster
  Scenario: Project Master - Verify checker user is able to reject the record from checker stage
 	  Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for project master testcase009b
  	Then user should navigate to project master
  	Then click on eye icon of project master
  	Then click on edit button of record to modify in project master modify
  	Then modify the valid fields in the project master screen
  	Then verify system allow user to save record of project master with valid data
  	Then confirmation message displays with reference id in project master
  	Then click on inbox button
  	And select the modified record of project master from inbox to approve
  	Then click on submit button in project master
  	Then system should display confirmation message after submit project master record
  	Then capture checker ID of project master
  	Then logout user from maker stage project master
  	# checker reject the record
  	And User Login as checker user
  	Then click on inbox button of project master
  	Then select the submitted record of project master by maker to reject
  	Then select reject button in checker stage of project master
  	Then enter remark for reject the record of project master
  	Then click on reject button to reject project master record
  	Then system should display confirmation message after reject the record of project master
  	Then logout user from the application
  	
  @T009c @ProjectMaster
  Scenario: Project Master - Verify checker user is able to reject the record from checker stage
 	  Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for project master testcase009c
  	Then user should navigate to project master
  	Then click on eye icon of project master
  	Then click on edit button of record to modify in project master modify
  	Then modify the valid fields in the project master screen
  	Then verify system allow user to save record of project master with valid data
  	Then confirmation message displays with reference id in project master
  	Then click on inbox button
  	And select the modified record of project master from inbox to approve
  	Then click on submit button in project master
  	Then system should display confirmation message after submit project master record
  	Then capture checker ID of project master
  	Then logout user from maker stage project master
  	#	checker return the record
  	And User Login as checker user
  	Then click on inbox button of project master
  	Then select the submitted record of project master by maker to return
  	Then select return button in checker stage of project master
  	Then enter remark for return the record of project master
  	Then click on return button to return project master record
  	Then system should display confirmation message after return the record of project master
  	Then logout user from the application
  	
  	 	
  #	PM_03_20, PM_03_21, PM_03_22
  @T010 @ProjectMaster
  Scenario: Project Master - to check the functionality of status(active/deactive) and back button
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for project master testcase010
  	Then user should navigate to project master
  	Then click on edit view of project master
  	Then verify the functionality of status of the record in project master
  	Then verify user can able to change the status from active to deactive in project master
  	Then verify user can able to change the status from deactive to active in project master
  	
  	
  #	Then verify user can able to change the status from active to deactive
  #	Then verifying the status is changes to deactive
  #	Then verify user can able to change the status from deactive to active
  #	Then verifying the status is changes to active
  	

  	
  	
  	
  	