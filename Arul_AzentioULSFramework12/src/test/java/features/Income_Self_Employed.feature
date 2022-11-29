Feature: To verify the functionality of income
@AT-RSE-001
Scenario: To verify the functionality of income
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User search the record from the system in income details
And User click the action edit icon in in customer debt
And User click the customer financials tab in customer debt
And User click the customer personal information action edit icon in customer debt
And User click the income details add icon
And User verify the Income screen under customer financials section in income details
And User verify the functionality of Back button in income details

@AT-RSE-002
Scenario: To verify the functionality of income
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User search the record from the system in income details
And User click the action edit icon in in customer debt
And User click the customer financials tab in customer debt
And User click the customer personal information action edit icon in customer debt
And User click the income details add icon
And User select the income in income details
And User select the frequency in income details
And User enter the Amount in income details
And User verify the functionality of save button post entering all valid details and clicking on save button in income details
And User verify system display the confirmation message post clicking on save button in income details

@AT-RSE-003
Scenario: To verify the functionality of income
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User search the record from the system in income details
And User click the action edit icon in in customer debt
And User click the customer financials tab in customer debt
And User click the customer personal information action edit icon in customer debt
And User click the income details add icon
And User verify the field Employment Type Field should be auto populated from employment details screen
And User select financial year in income details
And User select filling date in income details
And User select the income in income details
And User select the frequency in income details
And User enter the Amount in income details
And User enter the Defined percentage in income details
And User enter the Adjusted percentage in income details
And User verify the auto populated value in Amount Considered field in income details
And User verify the functionality of save button post entering all valid details and clicking on save button in income details

@AT-RSE-004
Scenario: To verify the functionality of income
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User search the record from the system in income details
And User click the action edit icon in in customer debt
And User click the customer financials tab in customer debt
And User click the customer personal information action edit icon in customer debt
And User click the income details add icon
And User select financial year in income details
And User select filling date in income details
And User select the income in income details
And User select the frequency in income details
And User enter the Amount in income details
And User enter the Defined percentage in income details
And User enter the Adjusted percentage in income details
And User verify the auto populated value in Amount Considered field in income details
And User click the add button in income details
And User select the income1 in income details
And User select the frequency1 in income details
And User enter the Amount1 in income details
And User enter the Defined percentage1 in income details
And User enter the Adjusted percentage1 in income details
And User verify the auto populated value in Amount Considered1 field in income details


@AT-RSE-005
Scenario: To verify the functionality of income
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User search the record from the system in income details
And User click the action edit icon in in customer debt
And User click the customer financials tab in customer debt
And User click the customer personal information action edit icon in customer debt
And User click the income details add icon
And User select financial year in income details
And User select filling date in income details
And User select the income in income details
And User select the frequency in income details
And User enter the Amount in income details
And User enter the Defined percentage in income details
And User enter the Adjusted percentage in income details
And User verify the auto populated value in Amount Considered field in income details
And User click the add button in income details
And User select the income1 in income details
And User select the frequency1 in income details
And User enter the Amount1 in income details
And User enter the Defined percentage1 in income details
And User enter the Adjusted percentage1 in income details
And User verify the auto populated value in Amount Considered1 field in income details
And User verify the auto populated value in Total income field in income details
And User verify the auto populated value in Total income Considered field in income details
And User select the deduction in income details
And User select the deduction frequency in income details
And User enter the deduction Amt in income details
And User enter the deduction Def in income details
And User enter the deduction Adj in income details
And User verify the auto populated value in Deduction Considered field in income details
And User select the deduction1 in income details
And User select the deduction frequency1 in income details
And User enter the deduction Amt1 in income details
And User enter the deduction Def1 in income details
And User enter the deduction Adj1 in income details
And User verify the auto populated value in Deduction Considered1 field in income details
And User verify the auto populated value in Total deduction field when there are multiple income in income screen
And User verify the auto populated value in Total deduction Considered field when there are multiple income in income screen

@AT-RSE-005
Scenario: Validate the Income details validation
Given Launch the kuls application
And Navigate to Mail box of Application details and search the Reference id
And Click on action icon of first record of respective reference id
And Click on eligibility button
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And Validate Approved popup in Application details
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And Validate Approved popup in Application details
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And Validate Approved popup in Application details
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup

@AT-RSE-006
Scenario: Validate the income details L1 stage approval
Given Login into KULS for checker user
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup

@AT-RSE-007
Scenario: Validate the income details L2 stage approval
Given Login into KULS for checker user
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup

@AT-RSE-008
Scenario: Validate the income details Offering stage approval
Given Login into KULS for checker user
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup

@AT-RSE-009
Scenario: Validate the income details DISBMKR stage approval
Given Login into KULS for checker user
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup

@AT-RSE-010
Scenario: Validate the income details DISBCKR stage approval
Given Login into KULS for checker user
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup



