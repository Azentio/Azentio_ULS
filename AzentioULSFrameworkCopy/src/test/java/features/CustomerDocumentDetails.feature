Feature: Check the functionality of Customer Document Details screen
 	
  @AT_DLDD_003
  Scenario: Verify system should allow user to do a modification with valid data
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle in login page
  	Then click on inbox to search for the Customer Document Details record
  	Then click on search button to search the record of Customer Document Details in inbox
  	Then enter the reference id of the Customer Document Details record
  	Then click on the entitle button of the Customer Document Details record of that reference id
  	Then click on the Document Details tab
  	
  	Then open the record of Customer Document Details to modify
  	Then verify system should allow user to do a modification of Customer Document Details record before approved 
		Then verify system should allow user to do a modification with valid data
		Then verify system display the confirmation message post clicking on save button of Customer Employment Details record
		And verify the same record of Customer Document Details should get saved in a system
		Then verify the functionality of Back button of Customer Document Details record
		
	@AT_DLDD_005
  Scenario: Verify system should allow user to do a modification with valid data
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle in login page
  	Then click on inbox to search for the Customer Document Details record
  	Then click on search button to search the record of Customer Document Details in inbox
  	Then enter the reference id of the Customer Document Details record
  	Then click on the entitle button of the Customer Document Details record of that reference id
  	Then click on the Document Details tab
  	Then verify system should display the mention fields on List view of Customer Documents details
		Then verify values in List view of Customer Documents details should be non editable
  	Then verify search box should display matching record with matched data of Customer Documents details
  	Then verify search box should not display any record with mismatched data of Customer Documents details
		Then click on export to excel button system should download Excel file of Customer Documents details
  	Then click on export to pdf button system should download Pdf file of Customer Documents details
		Then verify the functionality of Add button of Customer Documents details list view screen
		
		
		