Feature: testing the functionalities of customer financials transaction screen
# this test case includes manual testcases CES_03_01 ,CES_03_02
@AT-CE-005
Scenario: Updation of before approved record in customer financials screeen 
Given user login as a cent bank uls application
When user click the inbox icon for application new app
And User search app data in inbox list view
And User click the first edit icon of app data entry record
And User click customer financials tab
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


