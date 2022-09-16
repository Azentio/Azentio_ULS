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
  	Then user should navigate to project master
  	And click on eye icon of project master
  	Then click on add button
  	Then verify system should not allow to enter invalid datatypes in project master
 
  #	PM_03_08
  @T006 @ProjectMaster
  Scenario: Project Master -  While modification, user verify proper validation message for blank field post clicking save button
  	Given User launch the kuls application
  	And User Login as maker
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
  	
  #	PM_03_20, PM_03_21, PM_03_22
  @T010 @ProjectMaster
  Scenario: Project Master - to check the functionality of status(active/deactive) and back button
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to project master
  	And click on eye icon of project master
  	Then verify the functionality of status of the record in project master
  	Then verify user can able to change the status from active to deactive in project master
  	Then verify user can able to change the status from deactive to active in project master
  	
  @T005/T008/T009 @ProjectMaster
  Scenario: Project Master -
  	Given User launch the kuls application
  	And User Login as maker
  	Then user should navigate to project master
  	And click on edit view of project master
  	Then click on edit button of record to modify in project master modify
  	Then verify Address Details fields are displayed under Project Master Modify menu
  	Then verify Payment Plans Details fields are displayed under Project Master Modify menu
  	Then verify Exposure Tracking Details fields are displayed under Project Master Modify menu
  	
  	Then verify system allow user to modify the Project Master Modify before approved the record
  	Then click on eye icon of project master
  	Then verify system allow user to do modification on already approved record
  	
  	Then verify system allow user to save modified record of project master with valid data
  	Then system should display the confirmation message
  	Then click on inbox button
  	And select the modified record of project master from inbox to approve
  	Then click on submit button
  	Then system should display confirmation message after submit
  	
  	
  	

  	
  	
  	
  	