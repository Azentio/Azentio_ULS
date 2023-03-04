Feature: Check the functionality of Customer Address Details screen
 	
#Arshath
@AT_CAD_001
Scenario: verify post clicking on Add button, the Customer Address Information screen is getting open with all valid fields
Given User launch the kuls application
And User Login as maker for transaction screen
And user change the module to LOS
Then select data set ID for customer address details testcase001
And user click on Inbox Icon
And user click search icon
And user Enter Customer Address details Application ID
And user click on First record of Appdata Entry
And user click on Additional customer Info Tab
And user click on First Record Edit Icon
And user click on Address Information Add Icon
And user verify the Address Type field and Choose the value
And user verify the Address status field and choose the value
And user verify the Residental status field and choose the value
And user verify the Address Line 1 field and Enter the Vaue
And user verify the Address Line 2 field and Enter the Vaue
And user verify the country field and choose the value
And user verify the Province Id field and choose the value
And user verify the District Name field and Enter the value
And user verify the city Id field and choose the value
And user verify the Zip code field and Enter the value
And user verify the PO Box Number field and Enter the value
And user verify the Mobile Number primary field and Enter the value
#And user verify the Mobile Number secondary field and Enter the value
And user verify the Duration of stay field and Enter the value
And user verify the Latitude details of the address field and Enter the Value
And user verify the Longtitude details of the address field and Enter the Value
And user verify the LandMark field and Enter the Value
And user verify the Occupancy date field and choose the date
And user verify the Landlord name field and Enter the Value
And user verify the Landlord Number field and Enter the value
And user verify the Rent amount field and Enter the Value
And user verify the Frequency of Rent field and choose the value
And user click the Save the button

@AT_CAD_002
Scenario: verify the functionality of save button post entering all valid details and clicking on save button
Given User launch the kuls application
And User Login as maker for transaction screen
Then select data set ID for customer address details testcase002
Then user should click on the menu toggle
Then click on inbox
#Then click on inbox search icon 
And user click search icon
Then search Customer Address Details record
#And maker user open the record from inbox
And user click on First record of Appdata Entry
Then click on Additional customer info Segment button
Then click on Action button of Customer Personal Information
Then from customer identification screen click on add button of Address details
Then select Address Type
Then select Address Status
Then select Residential or Occupancy Status
Then Enter Address Line1
Then Enter Address Line2
Then select Country
Then select Province ID  	
Then Enter Neighbourhood District Name 
Then select City ID
Then Enter Zip Code
Then Enter Mobile Number primary
Then Enter Occupancy Date
Then click on save button of Address Detail

  @AT_CAD_003
  Scenario: Verify the functionality of fields of Customer Address Details screen
		Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for customer address details testcase003
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
#		Then verify the field Mailing or Contact Address Flag on Additional customer info tab under Customer Address Details screen  	
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
		
#		Then verify the field Phone Number on Additional customer info tab under Customer Address Details screen
#		Then verify the field Email ID on Additional customer info tab under Customer Address Details screen

@AT_CAD_004
Scenario: To verify user can not able to create the customer address deatisl with invalid input
Given User launch the kuls application
And User Login as maker for transaction screen
Then select data set ID for customer address details testcase004
And click on mail box
And search for app data entry record
And select the app data entry first record
And go to additional customer info tab
And select the additional customer info first record
And click on add button under the address details 
And click on save button without filling the mandatory field
Then verify address type field should show the validation message
Then verify address status field should show the validation message
Then verify Residential or Occupancy Status should show validation message
Then verify address line 1 field should show the validation message
Then verify address line 2 field should show the validation message
Then verify Country field should show the validation message
Then verify provice id field should show the validation message
Then verify  Neighbourhood District Name  field should show the validation message
Then verify City id field should show the validation message
Then verify Zip Code field should show the validation message
Then verify Occupancy Date field should show the validation message
Then verify system should show the validation message post entering the special character input in address line one input box
Then verify system should show the validation message post entering the special character input in address line two input box
Then verify system should show the validation message post entering the special character input in neighboorhood district name input box
Then verify system should show the validation message post entering the special character input in Zip code input box
Then verify system should show the validation message post entering the special character input in Latitude details of the address input box
Then verify system should show the validation message post entering the special character input in Logitude details of the address input box
Then verify system should show the validation message post entering the special character input in Land mark input box
Then verify system should show the validation message post entering the special character input in Landloard Name input box
Then verify system should show the validation message post entering the special character input in Landloard Name input box
Then verify system should show the validation message post entering the special character input in Landloard mobile number input box
Then verify system should show the validation message post enter the above seven digit pin code
Then verify system should show the validation post enter the negative po box number
Then verify system should show the validation post enter the invalid landlord mobile number
Then verify system should not allow user to enter character input in po box number
Then verify system should not allow user to enter character input in duration of stay
Then verify system should not allow user to enter character input in Rent amount
Then verify system should show the validation for invalid mobile number in mobile number field
Then verify system should show the validation for invalid mobile number in mobile number field
When user enter above 7 digit in po box number field
Then system should show the validation for po box number

	@AT_CAD_005
  Scenario: Verify the buttons are available on screen while modify the Customer Address Information
		Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for customer address details testcase005
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
  	
@AT_CAD_06
Scenario: verify post clicking on Add button, the Customer Address Information screen is getting open with all valid fields
Given User launch the kuls application
And User Login as maker for transaction screen
Then select data set ID for customer address details testcase006
And user click on Inbox Icon
And user click search icon
And user Enter Customer Address details Application ID
And user click on First record of Appdata Entry
And user click on Additional customer Info Tab
And user click on First Record Edit Icon
And user click on Address Information Add Icon
And user verify the Address Type field and Choose the value
And user verify the Address status field and choose the value
And user verify the Residental status field and choose the value
And user verify the Address Line 1 field and Enter the Vaue
And user verify the Address Line 2 field and Enter the Vaue
And user verify the country field and choose the value
And user verify the Province Id field and choose the value
And user verify the District Name field and Enter the value
And user verify the city Id field and choose the value
And user verify the Zip code field and Enter the value
And user verify the PO Box Number field and Enter the value
And user verify the Mobile Number primary field and Enter the value
#And user verify the Mobile Number secondary field and Enter the value
And user verify the Duration of stay field and Enter the value
And user verify the Latitude details of the address field and Enter the Value
And user verify the Longtitude details of the address field and Enter the Value
And user verify the LandMark field and Enter the Value
And user verify the Occupancy date field and choose the date
And user verify the Landlord name field and Enter the Value
And user verify the Landlord Number field and Enter the value
And user verify the Rent amount field and Enter the Value
And user verify the Frequency of Rent field and choose the value
And user Try to change the Address Type field
And user Try to change the Address status field
And user Try to change the Residental status field
And user Try to change the Address Line 1 field
And user Try to change the  Address Line 2 field
And user click the Save the button

@AT_CAD_07
Scenario: verify system allow user to do a modification on already approved record
Given User launch the kuls application
And User Login as maker for transaction screen
Then select data set ID for customer address details testcase007
And user click on Inbox Icon
And user click search icon
And user Enter Customer Address details Application ID
And user click on First record of Appdata Entry
And user click on Additional customer Info Tab
And user click on First Record Edit Icon
And user click on Address Information First Record Edit Icon
And user Modify the Address type field
And user Modify the Address Status field
And user Modify the Residental status field
#And user Modify the Province ID field
And user Modify the City ID field
And user click the update the button
  	
  @AT_CAD_008
  Scenario: Verify system should allow user to do a modification of 
  																		Customer Address Details record with valid data
		Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for customer address details testcase008
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
		And User Login as maker for transaction screen
		Then select data set ID for customer address details testcase009
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
		And User Login as maker for transaction screen
		Then select data set ID for customer address details testcase010
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
  	Then click on export to pdf button system should download Pdf file of Customer Address details
  	Then click on export to excel button system should download Excel file of Customer Address details
  	Then verify search box should display matching record with matched data of Customer Address details
  	Then verify search box should not display any record with mismatched data of Customer Address details
  	Then Verify the functionality of add button
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	