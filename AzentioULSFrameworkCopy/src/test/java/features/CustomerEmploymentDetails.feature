Feature: Check the functionality of Customer Employment screen
 	
  @AT_CE_006
  Scenario: Verify system should allow user to do a modification with valid data
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle from maker side
  	Then click on inbox to search for the Customer Employment record
  	Then click on search button to search the record of Customer Employment in inbox
  	Then enter the reference id of the Customer Employment record
  	Then click on the entitle button of the Customer Employment record of that reference id
  	Then click on the Customer Financials tab
  	Then open the record of Customer Employment to modify
  	Then verify system should allow user to do a modification of Customer Employment Details record with valid data 
		Then verify system display the confirmation message post clicking on save button of Customer Employment Details record
		
		
		
		
		
		
		