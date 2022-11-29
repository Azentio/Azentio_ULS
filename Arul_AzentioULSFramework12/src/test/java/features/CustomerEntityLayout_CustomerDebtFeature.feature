Feature: Validation of Customer Debt in Customer entity layout
@CustomerDebt_M1
Scenario: Validate that user can able to create a Customer debt
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Navigate to Customer Financials section
And Click on Pencil Icon of existing record
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
And Click on Save button of CustomerDebt
Then Validate the Success popup


