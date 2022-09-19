Feature: To Test the customer address deatails screen
Scenario: To verify user can not able to create the customer address deatisl with invalid input
Given navigate to uls application 
And login with maker credentials
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

