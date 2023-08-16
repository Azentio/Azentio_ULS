Feature: Check the functionality of Covenant Master
  # CM_01_02, CM_01_03, CM_01_04, CM_01_05, CM_01_06, CM_01_07, CM_01_08, CM_01_09, CM_01_13
  @AT_CM_T001
  Scenario: Validation of input fields of collateral type(Maker Stage)
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for covenant master testcase001
  	Then user should navigate to covenant master
  	And click on work in progress records button of covenant master
  	Then click on add button to create new record of covenant master
  	Then verify the covenant type field should be mandatory and editable dropdown
  	Then verify the description field should be mandatory and editable textbox
  	Then verify the editable field should be non mandatory and editable checkbox
  	Then verify the actionable field should be non mandatory and editable checkbox
  	Then verify the frequency field should be mandatory and editable dropdown
  	Then verify the waiver allowed field should be non mandatory and editable checkbox
  	Then verify the functionality of back button of covenant master
  
  # CM_01_10 - Approve
  @AT_CM_T002
  Scenario: Approving the record from the checker stage
  ### Creation of record to approve
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for covenant master testcase002
  	Then user should navigate to covenant master
  	And click on work in progress records button of covenant master
  	Then click on add button to create new record of covenant master
  	Then Fill all valid fields in the covenant master screen for approve the record
  	Then verify post clicking on save button same record should get saved in the system
  	Then verify system should display the confirmation message post clicking on save button
  	Then click on inbox button to select the record of covenant master
  	And select the record of covenant master from inbox to submit
  	Then click on submit button to submit the record of covenant master
  	Then system should display confirmation message after submit covenant master record
  	Then capture checker ID of covenant master
  	Then logout user from application
  
  ###	Approve the record from checker
  	And User Login as checker in uls application
  	Then click on inbox button to select the record of covenant master
  	Then select the record of covenant master to approve
  	Then select approve button for approve covenant master record
  	Then enter remark for approve the record of covenant master
  	Then click on approve button of the covenant master record
  	Then system should display confirmation message after approve the covenant master record
  	Then logout user from application
  	And User Login as maker
  	Then user should navigate to covenant master
  	And click on approved records button of covenant master
  	Then verify record should get approved and display in the system under Approved List view
  	
  	
  # CM_01_11 - Reject
  	@AT_CM_T003
  	Scenario: Reject the record from the checker stage
  # Creation of record to reject
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for covenant master testcase003
  	Then user should navigate to covenant master
  	And click on work in progress records button of covenant master
  	Then click on add button to create new record of covenant master
  	Then Fill all valid fields in the covenant master screen for reject the record
  	Then click on save button to save the record in the system
  	Then verify system should display the confirmation message post clicking on save button
  	Then click on inbox button to select the record of covenant master
  	And select the record of covenant master from inbox to submit
  	Then click on submit button to submit the record of covenant master
  	Then system should display confirmation message after submit covenant master record
  	Then capture checker ID of covenant master
  	Then logout user from application
  	
  #	Reject the record from checker
  	And User Login as checker in uls application
  	Then click on inbox button to select the record of covenant master
  	Then select the record of covenant master to reject
  	Then select reject button to reject the covenant master record
  	Then enter remark for reject the record of covenant master
  	Then click on reject button of the covenant master record
  	Then system should display confirmation message after reject the covenant master record
  	Then logout user from application
  	And User Login as maker
  	Then user should navigate to covenant master
  	And click on approved records button of covenant master
  	Then verify all the captured data from makers side should not be display in the system under Approved List view
  	 	
  # CM_01_12	- Return
  @AT_CM_T004
  Scenario: Return the record from the checker stage
  # Creation of record to return
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for covenant master testcase004
  	Then user should navigate to covenant master
  	And click on work in progress records button of covenant master
  	Then click on add button to create new record of covenant master
  	Then Fill all valid fields in the screen for return the covenant master record
  	Then click on save button to save the record in the system
  	
  	Then verify system should display the confirmation message post clicking on save button
  	
  	Then click on inbox button to select the record of covenant master
  	And select the record of covenant master from inbox to submit
  	Then click on submit button to submit the record of covenant master
  	Then system should display confirmation message after submit covenant master record
  	Then capture checker ID of covenant master
  	Then logout user from application
  	
  #	Return the record from checker
  	And User Login as checker in uls application
  	Then click on inbox button to select the record of covenant master
  	Then select the record of covenant master to return
  	Then select return button to return the covenant master record
  	Then enter remark for return the record of covenant master
  	Then click on return button of the covenant master record
  	Then system should display confirmation message after return the covenant master record
  	Then logout user from application
  	And User Login as maker
  	Then user should navigate to covenant master
  	And click on work in progress records button of covenant master
  	Then verify all the captured data should be returned and stored in the maker stage
  	
  #	CM_02_01, CM_02_02, CM_02_03, CM_02_04
  @AT_CM_T005
	Scenario: To verify user should not able to create the Covenant Master record with invalid input
		Given User launch the kuls application
		And User Login as maker
		Then select data set ID for covenant master testcase005
  	Then user should navigate to covenant master
  	And click on work in progress records button of covenant master
		Then click on add button to create new record of covenant master
#		Then click on save button to save the record in the system
		Then system should show proper validation message for blank field which is mandatory and user not allow to save the record
#		Then verify system should show proper validation message when user enter numeric value in character field
#		Then verify system should show proper validation message when user enter characters value in numeric field
		Then verify system should show proper validation message when user enter only special characters value in any field

  # CM_03_02
   @AT_CM_T006
  Scenario: Covenant Master - verify system should allow user to modify the Covenant Master before approve the record
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for covenant master testcase006
  	Then user should navigate to covenant master
  	And click on work in progress records button of covenant master
  	Then click on add button to create new record of covenant master
  	Then Fill all valid fields in the covenant master screen to modify the record before approved
  	Then click on save button to save the record in the system
  	Then verify system should display the confirmation message post clicking on save button
  	Then click on inbox button to select the record of covenant master
  	And select the record of covenant master from inbox to submit
  	Then verify system should allow user to modify the covenant master before approve the record
  	
  #	CM_03_03, CM_03_04, CM_03_05, CM_03_08, CM_03_09, CM_03_10, CM_03_11
  @AT_CM_T007
  Scenario: Covenant Master - verify system should allow user to modify the Covenant Master approved record
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for covenant master testcase007
  	Then user should navigate to covenant master
  	And click on approved records button of covenant master
  	Then click on edit button of covenant master approved record to modify
  	Then verify the field status in covenant master
  	Then verify system should allow user to modify the covenant master already approved record
  	Then verify while modification system allow user to save the covenant record with valid data
  	Then verify system should display the confirmation message post clicking on save button
  	Then verify same record should get saved with the modified data in the system
  	Then click on inbox button to select the record of covenant master
  	And select the record of covenant master from inbox to submit
  	Then click on submit button to submit the record of covenant master
  	Then system should display confirmation message after submit covenant master record
  	
  @AT_CM_T008
  Scenario: Covenant Master - While modification, user verify proper validation message for blank field 
  																									and verify system should not allow to enter invalid datatypes.
	#	CM_03_06, CM_03_07
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for covenant master testcase008
  	Then user should navigate to covenant master
  	And click on approved records button of covenant master
  	Then click on edit button of covenant master approved record to modify
  	Then verify while modification in covenant master record proper validation message for blank field should display
  	Then verify while modification in covenant master record system should not allow to enter invalid datatypes
  	
  @AT_CM_T009
  Scenario: Covenant Master - verify system should allow user to modify the Covenant Master approved record
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for covenant master testcase009
  	Then user should navigate to covenant master
  	And click on approved records button of covenant master
  	Then click on edit button of covenant master approved record to modify
  	Then verify the field status in covenant master
  	Then verify system should allow user to modify the covenant master already approved record
  	Then verify while modification system allow user to save the covenant record with valid data
  	Then verify system should display the confirmation message post clicking on save button
  	Then verify same record should get saved with the modified data in the system
  	Then click on inbox button to select the record of covenant master
  	And select the record of covenant master from inbox to submit
  	Then click on submit button to submit the record of covenant master
  	Then system should display confirmation message after submit covenant master record
  	Then capture checker ID of covenant master
  	Then logout user from application
  ###	Approve the record from checker
  	And User Login as checker in uls application
  	Then click on inbox button to select the record of covenant master
  	Then select the record of covenant master to approve
  	Then select approve button for approve covenant master record
  	Then enter remark for approve the record of covenant master
  	Then click on approve button of the covenant master record
  	Then system should display confirmation message after approve the covenant master record
  	Then logout user from application
  	And User Login as maker
  	Then user should navigate to covenant master
  	And click on approved records button of covenant master
  	Then verify modified record should get approved and display in the system under Approved List view
  	
  @AT_CM_T010
  Scenario: Covenant Master - verify system should allow user to modify the Covenant Master approved record
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for covenant master testcase010
  	Then user should navigate to covenant master
  	And click on approved records button of covenant master
  	Then click on edit button of covenant master approved record to modify
  	Then verify the field status in covenant master
  	Then verify system should allow user to modify the covenant master already approved record
  	Then verify while modification system allow user to save the covenant record with valid data
  	Then verify system should display the confirmation message post clicking on save button
  	Then verify same record should get saved with the modified data in the system
  	Then click on inbox button to select the record of covenant master
  	And select the record of covenant master from inbox to submit
  	Then click on submit button to submit the record of covenant master
  	Then system should display confirmation message after submit covenant master record
  	Then capture checker ID of covenant master
  	Then logout user from application
  	#	Reject the record from checker
  	And User Login as checker in uls application
  	Then click on inbox button to select the record of covenant master
  	Then select the record of covenant master to reject
  	Then select reject button to reject the covenant master record
  	Then enter remark for reject the record of covenant master
  	Then click on reject button of the covenant master record
  	Then system should display confirmation message after reject the covenant master record
  	Then logout user from application
  	And User Login as maker
  	Then user should navigate to covenant master
  	And click on approved records button of covenant master
  	Then verify all the modified captured data from makers side should not be display in the system under Approved List view
  	
  @AT_CM_T011
  Scenario: Covenant Master - verify system should allow user to modify the Covenant Master approved record
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for covenant master testcase011
  	Then user should navigate to covenant master
  	And click on approved records button of covenant master
  	Then click on edit button of covenant master approved record to modify
  	Then verify the field status in covenant master
  	Then verify system should allow user to modify the covenant master already approved record
  	Then verify while modification system allow user to save the covenant record with valid data
  	Then verify system should display the confirmation message post clicking on save button
  	Then verify same record should get saved with the modified data in the system
  	Then click on inbox button to select the record of covenant master
  	And select the record of covenant master from inbox to submit
  	Then click on submit button to submit the record of covenant master
  	Then system should display confirmation message after submit covenant master record
  	Then capture checker ID of covenant master
  	Then logout user from application
  	#	Return the record from checker
  	And User Login as checker in uls application
  	Then click on inbox button to select the record of covenant master
  	Then select the record of covenant master to return
  	Then select return button to return the covenant master record
  	Then enter remark for return the record of covenant master
  	Then click on return button of the covenant master record
  	Then system should display confirmation message after return the covenant master record
  	Then logout user from application
  	And User Login as maker
  	Then user should navigate to covenant master
  	And click on work in progress records button of covenant master
  	Then verify all the modified captured data should be returned and stored in the maker stage
  	
  	@AT_CM_T012
  Scenario: Covenant Master - verify the view workflow in the covenant master 
  															system should display the workflow of the record (History)
	#	CM_03_16, CM_03_17
	
  #	Given User launch the kuls application
  #	And User Login as maker
  #	Then user should navigate to covenant master
  #	And click on approved records button of covenant master
  #	Then click on edit button of covenant master approved record to modify
  #	Then verify system should allow user to modify the covenant master already approved record
  #	Then verify system should display the confirmation message post clicking on save button
  #	Then click on inbox button to select the record of covenant master
  #	And select the record of covenant master from inbox to submit
  	
  	Given User launch the kuls application
  	Then select data set ID for covenant master testcase012
  	And User Login as checker in uls application
  	Then click on inbox button to select the record of covenant master
  	Then select the record of covenant master to view workflow
		Then verify the view workflow in the covenant master
		Then verify the functionality of back button of covenant master
  	
  # CM_04_02, CM_04_11, CM_04_12, CM_04_13, CM_04_14, CM_04_17, CM_04_18, CM_04_19, CM_04_20, CM_04_21
  @AT_CM_T013
  Scenario: Covenant Master - To verify the functionality of list view approved records
  	Given User launch the kuls application
  	Then select data set ID for covenant master testcase013
  	And User Login as maker
  	Then user should navigate to covenant master
  	And click on approved records button of covenant master
  	Then verify add button should allow to create new record in covenant master
  	Then verify search box should display matching record with matched data in covenant master
  	Then verify search box should not display any record with mismatched data in covenant master
  	Then click on export to pdf button system should download Pdf file in covenant master
  	Then click on export to excel button system should download Excel file in covenant master
  #	Then verify the functionality of ID field system should display ID number of that record
  	Then verify the functionality of Description field system should display description of that record
  	Then verify the functionality of Covenant Type field system should display Covenant Type of that record
 		Then verify the functionality of Frequency field system should display frequency of that record
  	Then verify the functionality of Status field system should display Status of that record
  	
  	

  	
  	
  	
  	
  	