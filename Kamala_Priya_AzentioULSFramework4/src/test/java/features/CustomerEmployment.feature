Feature: To Verify the fuctionalities of Customer Employment

#AT-CE-002-D2

@CustomerEmployment_M3
Scenario: To verify fields when nature of employment is Salf employed
Given Launch the kuls application and Navigate to Application details view list
Then Choose the data set id to verify nature of employment as self employed
Then Click the inbox in customer employment
And click the search button in customer employement
Then Enter app data entry in the text bar
And click the first action icon in customer employement
Then Click the customer finanace tab in customer employment
And click the first edit icon in customer finance tab
Then click the add button in customer employment list
And Verify the save and back button in customer employment
And Fill the nature of employment as self employed in customer employment
Then Select and verify the company type field in customer employment
And select and verify the field proffesion in customer employment
And select and verify the field proffesion type in customer employment
Then select and verify the field satutory Authority in customer employment
Then Fill the employment end date in customer employment
Then select and verify the field employer phone extention in customer employment
Then select and verify the field no of partners in customer employment
Then select and verify the field nature of business in customer employment
Then select and verify the field register business name in customer employment
Then select and verify the field register business number in customer employment
Then select and verify the field Business registration date in customer employment
Then select and verify the field office premises date in customer employment
Then select and verify the field share holder percentage in customer employment
Then select and verify the no of employes in customer employment
Then fill the remarks in customer employment
Then save the record in customer employment

#AT-CE-001-D1
@CustomerEmployment_M1
Scenario: To verify fields when nature of employment is Salaried 
Given Launch the kuls application and Navigate to Application details view list
Then Choose the dataset id to verify field when nature of employment is Salaried 
Then Click the inbox in customer employment
And click the search button in customer employement
Then Enter app data entry in the text bar
And click the first action icon in customer employement
Then Click the customer finanace tab in customer employment
And click the first edit icon in customer finance tab
Then click the add button in customer employment list
And Verify the save and back button in customer employment
And Fill the nature of employment as salaried in customer employment
Then choose the employment period and validate in customer employment
And Fill the employer name and validate in customer employment
#Then Fill and verify the field Employer Name if Others in customer employment
And Fill and verify the field employer id in customer employment
Then select and verify the field Date of Joining in customer employment
And select and  verify the field Employment End date in customer emplyment
Then select and  verify the field Department in customer employment
And select and verify the field Designation in customer employment
Then select and verify the field employment type in customer employment
And Fill and verify the field Direct Manager Contact Number Extension in customer employment
And Fill and verify the field Direct Manager telephone in customer employment
Then fill and verify the Employer Phone Number in customer employment
Then fill and verify the field Employer City Code in customer employment
Then fill and verify the field Employer Phone Extension in customer employment
#Then Fill and verify the field Total Experince Years in customer employment
And select and verify the field Retirement Age in customer employment
And Fill and verify the field Direct Manager in customer employment
Then Fill the state in customer employment
Then Fill the pincode in customer employment
Then Fill the experience at current employment in customer employment
Then save the record in customer employment as salaried
@CustomerEmployment_M8
Scenario: To verify fields in list view in customer employment
And Choose the data set id for list view validation in customer employment
Given Launch the kuls application and Navigate to Application details view list
Then Click the inbox in customer employment
And click the search button in customer employement
Then Enter app data entry in the text bar
And click the first action icon in customer employement
Then Click the customer finanace tab in customer employment
And click the first edit icon in customer finance tab
Then verify field Employer name in listview of the customer employment
Then verify field nature of employment in listview of the customer employment
Then verify field  employment type in listview of the customer employment
Then verify field  status in listview of the customer employment
And verify the functionality of Search box with matching data in list view of the customer employment
And verify the functionality of Search box with mismatch data in list view of the customer employment
Then verify the functionality of Export to PDF button in the list view of the customer employment
Then  verify the functionality of Export to Excel button in the list view of the customer employment
@AT-CE-004
Scenario: verify user is able to add new Employment Details record in the system by entering invalid data
Then choose the data set id for invalid data in customer employment
Given Launch the kuls application and Navigate to Application details view list
Then Click the inbox in customer employment
And click the search button in customer employement
Then Enter app data entry in the text bar
And click the first action icon in customer employement
Then Click the customer finanace tab in customer employment
And click the first edit icon in customer finance tab
And user click on Customer Employement Add button
And user Enter character value in Numeric Field
#And user Enter Numeric value in Character field
And user Enter Special character in Any field
And Validate the Message and verify it
Then save the record in customer employment as salaried
Then user verify the Required field proper validation message
@AT-CE-005

Scenario: To verify maker user can able to update the customer employement details record with invalid test inputs
Given Launch the kuls application and Navigate to Application details view list
Then Choose the data set id for invalid input for updation in customer employment
Then Click the inbox in customer employment
And click the search button in customer employement
Then Enter app data entry in the text bar
And click the first action icon in customer employement
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
#@CustomerEmployment_M1.1
#Scenario: To verify fields when nature of employment is Salaried 
#Given Launch the kuls application and Navigate to Application details view list
#Then Click the inbox in customer employment
#And click the search button in customer employement
#Then Enter app data entry in the text bar
#And click the first action icon in customer employement
#Then Click the customer finanace tab in customer employment
#And click the first edit icon in customer finance tab
#Then click the add button in customer employment list
#And Verify the save and back button in customer employment
#And Fill the nature of employment as salaried in customer employment
#Then choose the employment period and validate in customer employment
#And Fill the employer name and validate in customer employment
#Then Fill and verify the field Employer Name if Others in customer employment
#And Fill and verify the field employer id in customer employment
#Then select and verify the field Date of Joining in customer employment
#And select and  verify the field Employment End date in customer emplyment
#Then select and  verify the field Department in customer employment
#And select and verify the field Designation in customer employment
#Then select and verify the field employment type in customer employment
#And Fill and verify the field Direct Manager Contact Number Extension in customer employment
#And Fill and verify the field Direct Manager telephone in customer employment
#Then fill and verify the Employer Phone Number in customer employment
#Then fill and verify the field Employer City Code in customer employment
#Then fill and verify the field Employer Phone Extension in customer employment
#Then Fill and verify the field Total Experince Years in customer employment
#And select and verify the field Retirement Age in customer employment
#And Fill and verify the field Direct Manager in customer employment
#Then Fill the state in customer employment
#Then Fill the pincode in customer employment
#Then Fill the experience at current employment in customer employment
#Then save the record in customer employment as salaried
@AT-CE-006
Scenario: Updation of before approved record in customer financials screeen 
Given Launch the kuls application and Navigate to Application details view list
And choose the data set id for updation of before approved record in customer employment
Then Click the inbox in customer employment
And click the search button in customer employement
Then Enter app data entry in the text bar
And click the first action icon in customer employement
And go to customer financial tab
And User click the first edit icon in customer personal information
And User click the first edit icon in customer employment list
And User select and update nature of the employment
And User select and update the employment period
And User select and update the employer name
And User update the employer name others
And User update the employee id
And User update the date of joining
And User update the Employment end date
And User select and update department
And User select and update Designation
And User Select and Update the Employment Type
And User update Direct Manager Contact Number Extension
And User update Direct Manager Telephone
And User update Employer Phone Extension
And User select and update State
And User update pincode
#And User Update Total Experience years
And User Update Experience At Current Employment
And User Update Direct Manager
And User Update Employer City Code
And User Update Retirement Age Years
And User Update Remarks
And User upadte and save the customer financial record
 
  @CustomerEmployment_M7
  Scenario: Verify system should allow user to do a modification with valid data
		Given Launch the kuls application and Navigate to Application details view list
		Then choose the data set id for modification with valid data in customer employment
  	#Then user should click on the menu toggle from maker side
Then Click the inbox in customer employment
 Then click on search button to search the record of Customer Employment in inbox
  	Then enter the reference id of the Customer Employment record
  	Then click on the entitle button of the Customer Employment record of that reference id
  	Then click on the Customer Financials tab
  	Then open the record of Customer Employment to modify
  	Then verify system should allow user to do a modification of Customer Employment Details record with valid data 
		Then verify system display the confirmation message post clicking on save button of Customer Employment Details record