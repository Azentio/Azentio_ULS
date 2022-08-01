Feature: To check the functionalities of sub product retail master
@M5M6
Scenario: Modification of Sub-product Master record
Given user log in as uls application maker
When user click product set up menu
#WIP record
And user click edit icon of sub product retail
And user click the edit icon for the record which saved in maker 
And user Select and modify the project group 
And user Select and modify the Product code 
And user enter and modify sub product code 
And user enter and modify sub product description 
And user enter and modify allocation sequence number
And user click the save button for updation
Then user verify the sucess message for updation
#appproved record
#validation
And user click list view in sub product menu
And user click the edit icon for the record which saved in maker 
And user verify enter invalid data should not be allowed on save the record
And user verify while modification, when user keep any mandatory field blank and click on save button system should not allow to save the record
And user verify status option is non mandatory then default is active  and should be editable
#updation
And user click list view in sub product menu
And user click the edit icon for the record which saved in maker 
And user Select and modify the project group 
And user Select and modify the Product code 
And user enter and modify sub product code 
And user enter and modify sub product description 
And user enter and modify allocation sequence number
And user click the save button for updation
Then user verify the sucess message for updation
And user click the edit icon for the record which saved in maker 
And user verify all modified details are present on post save the record
And user click the inbox icon
And user click the modified record in the list view and store the reference number
And user submit the modified record and verify the sucess message
@m14
Scenario: Modification of Parameter tab details in Sub-product Retail Master screen
Given user log in as uls application maker
When user click product set up menu
#WIP Record
And user click edit icon of sub product retail
And user click the edit icon for the record which saved in maker 
And user click parameter tab in sub product retail master
Then user verify the functionality of back button for parameter tab Updation
And user click the edit icon for the record which saved in maker 
And user click parameter tab in sub product retail master
And user select and modify loan currency
And user select and modify the repayment type
And user select and modify Flat and Reducing data
And user select and modify interest Amortization Method
And User select and Modify Compute Installment on
And User select and Modify Interest Due date method
And User select and Modify Principal repayment Frequency
And User select and Modify Interest Repayment Frequency
And User select and Modify Loan Eligibility Calculation
And User select and Modify Include Guarantor inclusive
And User select and Modify Due Period Required
And User select and Modify Installment commence from
And User select and Modify Days in Year
And User select and Modify Multiple Disbursement Tranch Allowed
And User select and Modify Include Income Deduction Debit
And User select and Modify Round off
And User select and Modify Appropriation Code
And User select and Modify Ballon Allowed
And User select and Modify Pre owned Asset
And User select and Modify Day Count Convention for BPI
And User select and Modify Interest Charging Starts from
And User select and Modify BPI recovery
And User select and Modify Installment Recovery Type
And User select and Modify iS Step up allowed
And User select and Modify Rate Type
And User select and Modify Initiate Discount Factor
And User select and Modify Bulk Payment
And User select and Modify Immediate and due date
And User select and Modify Bulk Payment Lock in Starts from
And User select and Modify Bulk Payment min bulk payment Parameter
And User select and Modify Bulk Payment max bulk payment parameter
And User select and Modify Bulk Payment Forclosure lock in Starts from
And User select and Modify Bulk Payment min rebate parameter
And User select and Modify Bulk Payment max rebate parameter
And User select and Modify Bulk Payment Reschedulement Lock in starts from
And User select and Modify Interest computed
And User select and Modify recomputation of profit
And User select and Modify pre EMI
And User select and Modify mi recovery to be renamed as 
And User select and Modify bpi payment tenure method
And User select and Modify bpi rate method
And User select and Modify bpi repayment frequency
And User select and Modify Tds applicable
#And User save the record for parameter updation
And User Update the record for parameter
And user click the edit icon for the record which saved in maker 
And user click the inbox icon
And user click the modified record in the list view and store the reference number
And user verify the functionality of View Workflow button
And user submit the modified record and verify the sucess message
@m14.1
Scenario: Modification of Parameter tab details in Sub-product Retail Master screen in approved list
Given user log in as uls application maker
When user click product set up menu
#Approved Record
And user click edit icon of sub product retail
And user click list view in sub product menu
And user click the edit icon for the record which saved in maker 
And user click parameter tab in sub product retail master
And user click parameter tab in sub product retail master
And user select and modify loan currency
And user select and modify the repayment type
And user select and modify Flat and Reducing data
And user select and modify interest Amortization Method
And User select and Modify Compute Installment on
And User select and Modify Interest Due date method
And User select and Modify Principal repayment Frequency
And User select and Modify Interest Repayment Frequency
And User select and Modify Loan Eligibility Calculation
And User select and Modify Include Guarantor inclusive
And User select and Modify Due Period Required
And User select and Modify Installment commence from
And User select and Modify Days in Year
And User select and Modify Multiple Disbursement Tranch Allowed
And User select and Modify Include Income Deduction Debit
And User select and Modify Round off
And User select and Modify Appropriation Code
And User select and Modify Ballon Allowed
And User select and Modify Pre owned Asset
And User select and Modify Day Count Convention for BPI
And User select and Modify Interest Charging Starts from
And User select and Modify BPI recovery
And User select and Modify Installment Recovery Type
And User select and Modify iS Step up allowed
And User select and Modify Rate Type
And User select and Modify Initiate Discount Factor
And User select and Modify Bulk Payment
And User select and Modify Immediate and due date
And User select and Modify Bulk Payment Lock in Starts from
And User select and Modify Bulk Payment min bulk payment Parameter
And User select and Modify Bulk Payment max bulk payment parameter
And User select and Modify Bulk Payment Forclosure lock in Starts from
And User select and Modify Bulk Payment min rebate parameter
And User select and Modify Bulk Payment max rebate parameter
And User select and Modify Bulk Payment Reschedulement Lock in starts from
And User select and Modify Interest computed
And User select and Modify recomputation of profit
And User select and Modify pre EMI
And User select and Modify mi recovery to be renamed as 
And User select and Modify bpi payment tenure method
And User select and Modify bpi rate method
And User select and Modify bpi repayment frequency
And User select and Modify Tds applicable
And user verify the functionality of Activate and Deactivate button
And User save the record for parameter updation
Then verify success message in parameter tab
@m14.2
Scenario: Validation of Parameter tab details in Sub-product Retail Master screen in approved list
Given user log in as uls application maker
When user click product set up menu
#Approved Record
And user click edit icon of sub product retail
And user click list view in sub product menu
And user click the edit icon for the record which saved in maker 
And user click parameter tab in sub product retail master
And user click parameter tab in sub product retail master
And user select and modify loan currency
And user select and modify the repayment type
And user select and modify Flat and Reducing data
And user select and modify interest Amortization Method
And User select and Modify Compute Installment on
And User select and Modify Interest Due date method
And User verify while modification, when user keep any mandatory field blank and click on save button for parameter tabs













