Feature: To test the dept details screen

@AT_DD_01
Scenario: Validate that user can able to create a Customer debt
Given User Launch the KULS url for Transaction
And click on mail box 
And search for app data entry record
And select the app data entry first record
And user click on Customer Financials Tab
And user click on First Record Edit Icon
And Click on Add icon of Customer Debt section
And Select the value in Finance type
And Select the value in Financial Institution
And Enter the value in Account Number
And Select the value in Sanction date
And Enter the value in Sanction amount
And Enter the value in Interest rate
And Enter the value in Current Principle balance
And Enter the value in Tenure months
And Select the value in Maturity date
And Enter the value in Installment amount
And Enter the value in Amount considered
And Select the value in Currency
And Enter the value in Remarks
And Select the value in next due date
And Select the value in Collateral type
And Select the value in Closed date
And Select the value in Frequency field
And Enter the value in Last payment amount
And Select the value in Last payment date
And Enter the value in Product name
And Enter the value in Last 24 cycle
And Toggle the Balance transfer flag
And Select the value in Facility Status
And Enter the value in Remaining Tenure months
And Select the value in disbursement date
And Select the value in NPA Classification
And save the updated record in customerfinancial commitment record

@AT_DD_02
Scenario: To verify the impact when user keep any mandatory field blank and click on save button
Given User Launch the KULS url for Transaction
And click on mail box 
And search for app data entry record
And select the app data entry first record
And User click the customer financials tab in customer debt
And User click the customer personal information action edit icon in customer debt
And User click the financial commitment add icon in customer debt
And User enter the Account Number in customer debt
And User verify the impact when user enter characters value in numeric field in customer debt
And User enter the currrent principal amount in customer debt
And User verify the impact when user enters only characters value in any field in customer debt
And User enter the Interest Rate in customer debt
And User click the save icon in customer entity layout facility details
And User verify the impact when user keep any mandatory field blank and click on save button in customer debt

@AT_DD_03
Scenario: To verify user can able to update the customer dept details screen with valid data
Given User Launch the KULS url for Transaction
And click on mail box 
And search for app data entry record
And select the app data entry first record
And user click on Customer Financials Tab
And user click on First Record Edit Icon
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
#Then verify sanctiondate field should get updated
Then verify sanction amount field should get updated
Then verify interest rate field should get updated
Then verify current principal field should get updated
Then verify tenure months field should get updated
#Then verify maturity date field should get updated
Then verify installment field should get updated
Then verify amount considered field should get updated
Then verify currency field should get updated
Then verify remarks field should get updated
#Then verify next due date field should get updated
#Then verify next duedate field should get updated
Then verify collateral type field should get updated
Then verify frequenc field should get updated 
Then verify last payment amount field should get updated
#Then verify last payment date field should get updated
Then verify product name field should get updated 
Then verify last 24 field should get updated
Then verify facility status field should get updated
Then verify remaining tenure field should get updated
#Then verify disbursement date field should get updated
Then verify NPA clasification field should get updated
 
@AT_DD_04
Scenario: verify while modification, when user keep any mandatory field blank and Fill the Invalid details
Given User Launch the KULS url for Transaction
And click on mail box 
And search for app data entry record
And select the app data entry first record
And user click on Customer Financials Tab
And user click on First Record Edit Icon
And click on pencil icon in financial commitment list view record
And Reupdate the finance type dropdown fied
And Reupdate the financial institution dropdown field
And Reupdate the account number field
And Reupdate the sanction amount
And user click the update button
And user verify the validation Messgae for Blank Field
And user click on back button
And click on pencil icon in financial commitment list view record
And user update Invalid data to interest rate percentage field
And user click the update button
And user verify the validation Messgae for Invalid data 
 
@AT_DD_05
Scenario: To verify the functionality of Customer Debt details List view
Given User Launch the KULS url for Transaction
And click on mail box 
And search for app data entry record
And select the app data entry first record
And User click the customer financials tab in customer debt
And User click the customer personal information action edit icon in customer debt
And User verify the Customer Debt details List view
And User verify the Values in List view should be non editable in customer debt
And User verify the functionality of Search box with matching data in customer debt
And User verify the functionality of Export to PDF button in customer debt
And User verify the functionality of Export to Excel button in customer debt
And User verify the functionality of Search box with mismatch data in customer debt
And user click on back button in Application
#And User click the inbox mail icon in application detail offerings
#And User click the action edit icon in in customer debt
#And User click the customer financials tab in customer debt
#And User click the customer personal information action edit icon in customer debt
And User click the customer personal information action edit icon in customer debt
And User click the Action edit icon under financial commitments in customer debt
And Verify user is able to change the status of Debt record from Active to Inactive in customer debt
And User click the save icon in customer debt
And user click on back button in Application
And User click the customer personal information action edit icon in customer debt
And User click the Action edit icon under financial commitments in customer debt
And Verify user is able to change the status of Debt record from Inctive to Active in customer debt
And User click the save icon in customer debt
 
 
 
 
 
 
 
 
 
 
 