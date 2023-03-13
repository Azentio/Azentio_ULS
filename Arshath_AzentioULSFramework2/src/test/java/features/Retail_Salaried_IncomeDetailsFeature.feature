Feature: Validation of salaried Income details 
@SalariedIncomeDetails_M1
Scenario: Validate that user can able to create a Income details
Given User Launch the KULS url for Transactionsss
And Navigate to Mail box of Application details and search the Reference id
And Click on action icon of first record of respective reference id
And update test data for salaried income details test case one
And Navigate to Customer financial section
#And Click on Pencil Icon of existing record
And Click on Add icon in Income view list
And Enter the value in Lumpsum amount
And Enter the value in Pension amount
And Select the value in Income field
And Select the value in Frequency field in income section
And Enter the value in Amount field
And Enter the value in Defined percentage field
And Enter the value in Adjusted Percentage field
And Enter the value in amount considered field
And Select the value in Deduction field
And select the value in Frequency fied in Deduction section
And Enter the vaue in Deduction amt field
And Enter the value in Deduction def percentage field
And Enter the value in Deduction Adj percentage field
And Enter the value in deduction Considered field
#And Click on Save button of Identification


@SalariedIncomeDetails_M2
Scenario: Validate that user can able to create multiple Income details records
Given User Launch the KULS url for Transactionsss
And Navigate to Mail box of Application details and search the Reference id
And Click on action icon of first record of respective reference id
And update test data for salaried income details test case two
And Navigate to Customer financial section
And Click on Pencil Icon of existing record
And Click on Add icon in Income view list
And Enter the value in Lumpsum amount
And Enter the value in Pension amount
And Select the value in Income field
And Select the value in Frequency field in income section
And Enter the value in Amount field
And Enter the value in Defined percentage field
And Enter the value in Adjusted Percentage field
And Enter the value in amount considered field
And Click on Plus icon in Income section
And Select the value in Income field1
And Select the value in Frequency field in income section1
And Enter the value in Amount field1
And Enter the value in Defined percentage field1
And Enter the value in Adjusted Percentage field1
And Enter the value in amount considered field1


@SalariedIncomeDetails_M3
Scenario: Validate that user can able to create multiple Deduction details records
Given User Launch the KULS url for Transactionsss
And Navigate to Mail box of Application details and search the Reference id
And Click on action icon of first record of respective reference id
And update test data for salaried income details test case two
And Navigate to Customer financial section
And Click on Pencil Icon of existing record
And Click on Add icon in Income view list
And Enter the value in Lumpsum amount
And Enter the value in Pension amount
And Select the value in Deduction field
And select the value in Frequency fied in Deduction section
And Enter the vaue in Deduction amt field
And Enter the value in Deduction def percentage field
And Enter the value in Deduction Adj percentage field
And Enter the value in deduction Considered field
And Click on Plus icon in Deduction section
And Select the value in Deduction field1
And select the value in Frequency fied in Deduction section1
And Enter the vaue in Deduction amt field1
And Enter the value in Deduction def percentage field1
And Enter the value in Deduction Adj percentage field1
And Enter the value in deduction Considered field1

@SalariedIncomeDetails_M4
Scenario: Validate the Income details validation
Given User Launch the KULS url for Transactionsss
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

@SalariedIncomeDetails_M5
Scenario: Validate the income details L1 stage approval
Given Login into KULS for checker user
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup

@SalariedIncomeDetails_M6
Scenario: Validate the income details L2 stage approval
Given Login into KULS for checker user
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup

@SalariedIncomeDetails_M7
Scenario: Validate the income details Offering stage approval
Given Login into KULS for checker user
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup

@SalariedIncomeDetails_M8
Scenario: Validate the income details DISBMKR stage approval
Given Login into KULS for checker user
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup

@SalariedIncomeDetails_M9
Scenario: Validate the income details DISBCKR stage approval
Given Login into KULS for checker user
And Navigate to Mail box of Application details and search the Reference id
And Click on Approve Icon in Application Details page
And User Capture Checker id from the submit popup








