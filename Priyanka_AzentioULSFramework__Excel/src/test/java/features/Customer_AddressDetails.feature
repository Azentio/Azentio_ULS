Feature: Check the functionality of Customer Address Details 
 	
@AT_CAD_002
Scenario: verify the functionality of save button post entering all valid details and clicking on save button

Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
Then search Customer Address Details record
And maker user open the record from inbox
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
  