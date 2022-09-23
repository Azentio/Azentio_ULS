Feature: To test the dept details screen
@AT-DD-03
Scenario: To verify user can able to update the customer dept details screen with valid data
Given navigate to uls application 
And login with maker credentials
And click on mail box 
And search for app data entry record
And select the app data entry first record
And go to customer financial tab 
And click on edit button in customer personal details list view record
And click on pencil icon in financial commitment list view record
#And click on add button in financial commitment
And update the finance type dropdown fied
And update the financial institution dropdown field
And update the account number field
And update the sanction date calendar
And update the sanction amount
And update the interest rate percentage field
And update the current principal balance field
And update the tenure months field
And update the maturity date field
And update the installment amount field
And update the amount considered field
And update the currency field
And update the remarks field
And update the next due date calander field
And update the collateral type field
And update the closed date calander field
And update the ferequency dropdown field
And update the last payment amount field
And update the last payment date calander field
And update the product name field
And update the last 24 cycle field
And update the facility status dropdown field
And update the remaining tenure months field
And update the disbursement date alander field
And update the NPA classification dropdown field
And get the all the date inputs 
And save the updated record in customerfinancial commitment record
And click on pencil icon in financial commitment list view record
Then verify financial type field should get updated
Then verify financial institution field should get updated
Then verify account number field should get updated
Then verify sanctiondate field should get updated
Then verify sanction amount field should get updated
Then verify interest rate field should get updated
Then verify current principal field should get updated
Then verify tenure months field should get updated
Then verify maturity date field should get updated
Then verify installment field should get updated
Then verify amount considered field should get updated
Then verify currency field should get updated
Then verify remarks field should get updated
Then verify next due date field should get updated
Then verify next duedate field should get updated
Then verify collateral type field should get updated
Then verify frequenc field should get updated 
Then verify last payment amount field should get updated
Then verify last payment date field should get updated
Then verify product name field should get updated 
Then verify last 24 field should get updated
Then verify facility status field should get updated
Then verify remaining tenure field should get updated
Then verify disbursement date field should get updated
Then verify NPA clasification field should get updated
 