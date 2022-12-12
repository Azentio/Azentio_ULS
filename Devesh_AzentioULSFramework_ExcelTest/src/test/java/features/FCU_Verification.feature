Feature: Check the functionality of FCU verification screen
 	
  @AT-FC-001
  Scenario: Verify the functionality of FCU Verification screen
		Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for fcu verification testcase001
  	Then user should click on the menu toggle
  	Then click on inbox button for fcu verification
  	Then search for the record of fcu verification and open it
  	Then navigate to fcu verification tab
  	Then verify the availability of List of customer in the system
  	Then verify the field ID in list of customer
  	Then verify the field CIFID in list of customer
  	Then verify the field Customer Name in list of customer
  	Then verify the field Customer Type in list of customer
  	Then verify the field Applicant Type in list of customer
  	Then verify the field Status in list of customer
		Then verify the functionality of Export to PDF button
		Then verify the functionality of Export to Excel button
		
	@AT-FC-002
  Scenario: Verify the functionality of FCU Allocation screen
  	Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for fcu verification testcase002
  	Then user should click on the menu toggle
  	Then click on inbox button for fcu verification
  	Then search for the record of fcu verification and open it
  	Then navigate to fcu verification tab
  	Then open customer record from list of customer screen 
  	Then verify FCU allocation screen fields
  	Then verify the Product Summary section fields
		Then verify the field Verification Type
		Then verify the field Applicant Type
		Then verify the field Verification Agency Type
		Then verify the field Agency Allocation Status
		Then verify the field Verification Status
		Then verify the field Waived By
		Then verify the field Remarks in FCU details
		Then verify the functionality of Back button in fcu verification
		Then verify the FCU allocation list at bottom of the same screen
		Then verify the values display under FCU allocation list are in view only mode
		Then click on add button to create a record for FCU verification
		Then Fill all the valid details for FCU verification
		Then verify the functionality of save button with all valid data in fcu verification
		
	@AT-FC-003
  Scenario: Verify system allow user to modify the FCU verification records
  	Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for fcu verification testcase003
  	Then user should click on the menu toggle
  	Then click on inbox button for fcu verification
  	Then search for the record of fcu verification and open it
  	Then navigate to fcu verification tab
		Then open customer record from list of customer screen 
		Then click on edit button of fcu record for modification
		Then Modify the valid fields for FCU verification
		Then verify system should save the modified record with valid data in fcu verification
		Then verify system should show confirmation message post clicking on save button
		Then verify the functionality of Back button in fcu verification
		
	@AT-FC-004
  Scenario: Verify system allow user to verify while modification 
  								  system show validation message for blank field and invalid data
  	Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for fcu verification testcase004
  	Then user should click on the menu toggle
  	Then click on inbox button for fcu verification
  	Then search for the record of fcu verification and open it
  	Then navigate to fcu verification tab
  	Then open customer record from list of customer screen
  	Then click on edit button of fcu record for modification
		Then verify while modification system show proper validation message for any mandatory blank field
		Then verify system should not allow user to do a modification with invalid data
		
	@AT-FCUR-005
  Scenario: Verify the availability of FCU report screen in the system
  	Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for fcu verification testcase005
  	Then user should click on the menu toggle
  	Then click on inbox button for fcu verification
  	Then search for the record of fcu verification and open it
  	Then navigate to fcu verification tab
  	Then open customer record from list of customer screen
  	Then click on add button to create a record for FCU verification
  	Then click on add button to create a record for FCU report
  	Then verify the availability of FCU Report record screen
		Then Fill all the valid details for FCU Report form
		Then verify the functionality of save button with all valid data in fcu report
		Then verify system should show confirmation message post clicking on save button of fcu report
		Then verify the field Document Type
		Then verify the field Sampled Type
		Then verify the field No of Docs
		Then verify the field Status
		Then verify the field Remarks of fcu report
		Then verify the functionality of Back button of fcu report
		Then verify system display the list at bottom of the screen
		
	@AT-FC-006
  Scenario: Verify the impact while creation of FCU report record with invalid data
  	Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for fcu verification testcase006
  	Then user should click on the menu toggle
  	Then click on inbox button for fcu verification
  	Then search for the record of fcu verification and open it
  	Then navigate to fcu verification tab
  	Then open customer record from list of customer screen
  	Then click on add button to create a record for FCU verification
  	Then click on add button to create a record for FCU report
  	Then verify proper validation message for blank field should display in FCU report
  #	Then verify the impact when user enter numeric value in character field in any field of FCU report
  #	Then verify the impact when user enter characters value in numeric field in any field of FCU report
  	Then verify system should not allow to enter invalid datatypes while modification in FCU report
  	
  @AT-FC-007
  Scenario: Verify system allow user to modify the FCU report records
  	Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for fcu verification testcase007
  	Then user should click on the menu toggle
  	Then click on inbox button for fcu verification
  	Then search for the record of fcu verification and open it
  	Then navigate to fcu verification tab
  	Then open customer record from list of customer screen
		Then click on edit button of fcu record for modification
		Then click on edit button of fcu report record for modification
#		Then search for the fcu report record for modify
		Then verify the buttons available on screen while modify the FCU report
		Then verify system allow user to modify the FCU report
		Then verify system should save the modified record with valid data in fcu verification
		Then verify system should show confirmation message post clicking on save button
		Then verify the functionality of Back button in fcu report
		
	@AT-FC-008
  Scenario: Verify system allow user to modify the FCU report records
  	Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for fcu verification testcase008
  	Then user should click on the menu toggle
  	Then click on inbox button for fcu verification
  	Then search for the record of fcu verification and open it
  	Then navigate to fcu verification tab
  	Then open customer record from list of customer screen
		Then click on edit button of fcu record for modification
		Then click on edit button of fcu report record for modification
		Then verify while modification system show proper validation message for any mandatory blank field of fcu report
		Then verify system should not allow user to do a modification with invalid data of fcu report
		
	@AT-FC-009
  Scenario: Verify Overall Decision Screen
  	Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for fcu verification testcase009
  	Then user should click on the menu toggle
  	Then click on inbox button for fcu verification
  	Then search for the record of fcu verification and open it
  	Then navigate to fcu verification tab
  	Then open customer record from list of customer screen
  	Then click on add button to create a record for FCU verification
  	
  	Then verify Overall decision section should be available under FCU report screen
  	Then verify user is able to save the Overall decisions
  	Then verify the field Decision in Overall decision section
  	Then verify system should not allow user to save the record without selecting a decision
  	Then verify the field Remarks in overall decision
  	Then verify the other fields on Overall decision section is non mandatory except decision
		