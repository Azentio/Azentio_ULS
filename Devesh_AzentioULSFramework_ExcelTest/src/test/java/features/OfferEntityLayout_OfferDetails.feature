Feature: Check the functionality of Offer Entity Layout Offer Details screen
 	
  @AT_OLOD_004
  Scenario: Verify system should allow user to do a modification with valid data
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle in the login page
  	Then click on inbox to search for the Offer Details record
  	Then click on search button to search the record of Offer Details in inbox
  	Then enter the reference id of the Offer Details record
  	Then click on the entitle button of the Offer Details record of that reference id
  	Then click on the edit button of the record under facility info
  	Then verify the Eligibility Details section fields are available
  	And verify all the fields under section eligibility details should have lookup values
  	And verify all the fields under section eligibility details should be in read only mode
		
	@AT_OLOD_005
  Scenario: To verify the section Interest Rate Structure & Installments section
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle in the login page
  	Then click on inbox to search for the Offer Details record
  	Then click on search button to search the record of Offer Details in inbox
  	Then enter the reference id of the Offer Details record
  	Then click on the entitle button of the Offer Details record of that reference id
  	Then click on the edit button of the record under facility info
  	
  	Then verify the section Interest Rate Structure fields are available
		And verify all the fields under section Interest Rate Structure should have lookup values
  	And verify all the fields under section Interest Rate Structure should be in read only mode
		
		Then verify the section Installments fields are available
		Then verify the field period under section Installments should be in read only mode
		Then verify Installments having same amount would be clubbed under same leg
		Then verify the field Installment amount should be non editable
	
#		Then verify post clicking on Accept Offer button the offer would be accepted
#		And verify Disbursement process can be initiated
		
	@AT_OLOD_006
  Scenario: To verify the section Interest Rate Structure & Installments section
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle in the login page
  	Then click on inbox to search for the Offer Details record
  	Then click on search button to search the record of Offer Details in inbox
  	Then enter the reference id of the Offer Details record
  	Then click on the entitle button of the Offer Details record of that reference id
  	Then click on the edit button of the record under facility info
		Then verify the section Appeal Request fields are available
		Then verify New Requested Tenure field system should allow user to enter value manually
		Then verify New Requested Amount field system should allow user to enter value manually
		Then verify the field Original Requested Tenure should be in read only mode
		Then verify the field Original Requested Amount should be in read only mode
#		Then verify the functionality of save button under section Appeal Requeslt
#		Then verify system should display validation message for invalid data post clicking on save button under section Appeal Request
#		Then verify system display the confirmation message post clicking on save button under section Appeal Request
#		Then verify system should display proper validation message to enter new requested amount and Tenure
#		Then verify the Functionality of Appeal button
		