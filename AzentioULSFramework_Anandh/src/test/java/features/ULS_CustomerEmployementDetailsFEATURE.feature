Feature: To test the customer employement details screen
Scenario: To verify maker user can able to update the customer employement details record with invalid test inputs
Given navigate to uls application 
And login with maker credentials
And click on mail box 
And search for app data entry record
And select the app data entry first record
And go to customer financial tab
And click on edit button in customer personal details list view record
And select the customer employement details list view record
And blank the employement period dropdown
And blank the nature of emplyment dropdown field
And blank the employername dropdown
And blank the name if other dropdown field
And blank the employee ID text box field
And blank the date of joining calendar input field
And blank the employment type dropdown field
And blank the total experience input field
And blank the retirement age input field
And click on save button after blank the fields in customer employment details
Then verify employment Period field should show the validation for required field
Then verify employer name if other field should show the validation for required field
Then verify nature of employment field should show the validation for required field
Then verify employee ID field should show the validation for required field
Then verify Date of joining field should show the validation for required field
Then verify employment type field should show the validation for required field
Then verify total experience field should show the validation for required field
Then verify retirement age field should show the validation for required field
Then verify employer name field should through the validation for special character input
Then verify employee ID field should through the validation for special character input
Then verify Direct manager phone number field should through the validation for special character input
Then verify employer phone number field should through the validation for special character input
Then verify Direct Manager field should through the validation for special character input
Then verify system should not allow user to enter more that 10 digit phone number and less than 10 digit phone number in employer phone number field
Then verify the functionlaity of back button in customer EmploymentDetails screen
