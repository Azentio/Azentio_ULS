Feature: Check the functionality of Customer Address Details screen
 	
  @AT_CAD_003
  Scenario: Verify the functionality of fields of Customer Address Details screen
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle
  	Then click on inbox to search for the Customer Address Details record
  	Then click on search button to search the record of Customer Address Details
  	Then enter the reference id of the Customer Address Details record
  	Then click on the entitle button of the Customer Address Details record of that reference id
  	Then click on the Additional customer info tab in Customer Personal Information screen
  	Then select the Customer Address details record from the customer personal detail screen
  	Then click on add button of Address details from the customer identification screen
  	
		Then verify the field Address Type on Additional customer info tab under Customer Address Details screen  	
		Then verify the field Address Status on Additional customer info tab under Customer Address Details screen  	
		Then verify the field Residential or Occupancy Status on Additional customer info tab under Customer Address Details screen  	
		Then verify the field Mailing or Contact Address Flag on Additional customer info tab under Customer Address Details screen  	
		Then verify the field Address Line1 on Additional customer info tab under Customer Address Details screen  	
		Then verify the field Address Line2 on Additional customer info tab under Customer Address Details screen  	
		Then verify the field Country on Additional customer info tab under Customer Address Details screen  	
		Then verify the field Province ID on Additional customer info tab under Customer Address Details screen  	
		Then verify the field Neighbourhood District Name on Additional customer info tab under Customer Address Details screen  	
		Then verify the field CityID on Additional customer info tab under Customer Address Details screen  	
		Then verify the field Zip Code on Additional customer info tab under Customer Address Details screen
		Then verify the field PO Box Number on Additional customer info tab under Customer Address Details screen
		Then verify the field Mobile Number primary on Additional customer info tab under Customer Address Details screen
		Then verify the field Latitude Details of the address on Additional customer info tab under Customer Address Details screen
		Then verify the field Longitude Details of the address on Additional customer info tab under Customer Address Details screen
		Then verify the field Landmark on Additional customer info tab under Customer Address Details screen
		Then verify the field Occupancy Date on Additional customer info tab under Customer Address Details screen
		Then verify the field Landlord Name on Additional customer info tab under Customer Address Details screen
		Then verify the field Landlord Mobile Number on Additional customer info tab under Customer Address Details screen
		Then verify the field Rent Amount on Additional customer info tab under Customer Address Details screen
		Then verify the field Frequency of Rent on Additional customer info tab under Customer Address Details screen
		
		Then verify the field Phone Number on Additional customer info tab under Customer Address Details screen
		Then verify the field Email ID on Additional customer info tab under Customer Address Details screen

	@AT_CAD_005
  Scenario: Verify the buttons are available on screen while modify the Customer Address Information
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle
  	Then click on inbox to search for the Customer Address Details record
  	Then click on search button to search the record of Customer Address Details
  	Then enter the reference id of the Customer Address Details record
  	Then click on the entitle button of the Customer Address Details record of that reference id
  	Then click on the Additional customer info tab in Customer Personal Information screen
  	Then select the Customer Address details record from the customer personal detail screen
  	Then select the record of Address details from the customer identification screen
  	Then verify Customer Address details screen should get open with mentioned Fields
  	Then verify the functionality of Back button of customer address details screen
  	
  @AT_CAD_008
  Scenario: Verify system should allow user to do a modification of 
  																		Customer Address Details record with valid data
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle
  	Then click on inbox to search for the Customer Address Details record
  	Then click on search button to search the record of Customer Address Details
  	Then enter the reference id of the Customer Address Details record
  	Then click on the entitle button of the Customer Address Details record of that reference id
  	Then click on the Additional customer info tab in Customer Personal Information screen
  	Then select the Customer Address details record from the customer personal detail screen
  	Then select the record of Address details from the customer identification screen
  	Then verify while modification system should allow user to save the address details record with valid data
  	Then verify while modification of address details record system should display the confirmation message post clicking on save button
  	
  @AT_CAD_009
  Scenario: Verify system should show the proper validation message for blank field 
  													which is mandatory and should not allow user to save the record
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle
  	Then click on inbox to search for the Customer Address Details record
  	Then click on search button to search the record of Customer Address Details
  	Then enter the reference id of the Customer Address Details record
  	Then click on the entitle button of the Customer Address Details record of that reference id
  	Then click on the Additional customer info tab in Customer Personal Information screen
  	Then select the Customer Address details record from the customer personal detail screen
  	Then select the record of Address details from the customer identification screen
  	Then verify system should show the proper validation message for blank field while modifying address detail record
  	Then verify system should not allow user to do a modification with invalid data of address detail record
  	
  	
  @AT_CAD_010
  Scenario: Verify the Customer Address Information Parameter details List view 
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menu toggle
  	Then click on inbox to search for the Customer Address Details record
  	Then click on search button to search the record of Customer Address Details
  	Then enter the reference id of the Customer Address Details record
  	Then click on the entitle button of the Customer Address Details record of that reference id
  	Then click on the Additional customer info tab in Customer Personal Information screen
  	Then select the Customer Address details record from the customer personal detail screen
  	Then Verify system should display mention fields on List view of Customer Address Information Parameter details
  	Then Verify the values in List view should be non editable on List view of Customer Address details
  	Then select the record of Address details from the customer identification screen
  	Then Verify the functionality of Back button on List view of Customer Address details
  	Then click on export to excel button system should download Excel file of Customer Address details
  	Then click on export to pdf button system should download Pdf file of Customer Address details
  	Then verify search box should display matching record with matched data of Customer Address details
  	Then verify search box should not display any record with mismatched data of Customer Address details
  	Then Verify the functionality of add button
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	