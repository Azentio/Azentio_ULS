Feature: check the functionality of Customer address details 
@AT_CAD_01
Scenario: verify post clicking on Add button, the Customer Address Information screen is getting open with all valid fields
Given User Launch the KULS url for Transaction
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
#And user verify the Province Id field and choose the value
And user verify the District Name field and Enter the value
#And user verify the city Id field and choose the value
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

@AT_CAD_06
Scenario: verify post clicking on Add button, the Customer Address Information screen is getting open with all valid fields
Given User Launch the KULS url for Transaction
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
#And user verify the Province Id field and choose the value
And user verify the District Name field and Enter the value
#And user verify the city Id field and choose the value
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

@AT_CAD_07
Scenario: verify system allow user to do a modification on already approved record
Given User Launch the KULS url for Transaction
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
#And user Modify the City ID field
And user click the update the button