Feature: To verify the impact when user keep any mandatory field blank and click on save button
@AT-02
Scenario: To verify the impact when user keep any mandatory field blank and click on save button
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User search the record from the system in customer debt
And User click the action edit icon in in customer debt
And User click the customer financials tab in customer debt
And User click the customer personal information action edit icon in customer debt
And User click the financial commitment add icon in customer debt
And User enter the Account Number in customer debt
And User enter the Interest Rate in customer debt
And User enter the currrent principal amount in customer debt
And User click the save icon in customer entity layout facility details
And User verify the impact when user keep any mandatory field blank and click on save button in customer debt
And User verify the impact when user enter characters value in numeric field in customer debt
And User verify the impact when user enters only characters value in any field in customer debt

@AT-05
Scenario: To verify the functionality of Customer Debt details List view
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User search the record from the system in customer debt
And User click the action edit icon in in customer debt
And User click the customer financials tab in customer debt
And User click the customer personal information action edit icon in customer debt
And User verify the Customer Debt details List view
And User verify the Values in List view should be non editable in customer debt
And User verify the functionality of Search box with matching data in customer debt
And User verify the functionality of Export to PDF button in customer debt
And User verify the functionality of Export to Excel button in customer debt
And User verify the functionality of Search box with mismatch data in customer debt
And User click the inbox mail icon in application detail offering
And User click the action edit icon in in customer debt
And User click the customer financials tab in customer debt
And User click the customer personal information action edit icon in customer debt
And User click the Action edit icon under financial commitments in customer debt
And Verify user is able to change the status of Debt record from Active to Inactive in customer debt
And User click the save icon in customer debt
And User click the Action edit icon under financial commitments in customer debt
And Verify user is able to change the status of Debt record from Inctive to Active in customer debt
And User click the save icon in customer debt

