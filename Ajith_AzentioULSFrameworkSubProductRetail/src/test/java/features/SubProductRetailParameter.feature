Feature: Creation of Parameter record with valid data
@m14.1
Scenario: Modification of Parameter tab details in Sub-product Retail Master screen
Given user log in as uls application maker
When user click product set up menu
And user click edit icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details for parameter Updation
And user enter sub product code under sub product for parameter Updation
And user enter sub product code description under sub product definition details and verify fields
And user select facility type under facility details  
And user select individual or corporate under facility details and verify fields
And user select Loan Purpose under facility details and verify fields
And user select Installed Based under facility details and verify fields
And user select continue with existing loan number under facility details and verify fields
And user select financial concept under facility details and verify fields
And user select Disbursement locking under facility details and verify fields
And user select Top Up Allowed under facility details and verify fields
And user select collatralized under Asset Financed details and verify fields
And user select finance against existing Asset under Asset Financed details and verify fields
And user select is multiple Asset Finance is allowed under Asset Financed details and verify fields
And user select impact on under Floating Rate details and verify fields
And user select Reset Logic under Floating Rate details and verify fields
And user select Floating rate Effective date under Floating Rate details and verify fields
And user select Floating Rate Effective Frequency under Floating Rate details and verify fields
And user enter EMI CAP percentage under Floating Rate details and verify fields
And user enter tenor tolerance in months under Floating Rate details and verify fields
And user enter legacy code 1 under Legacy Codes details and verify fields
And user enter legacy code 2 under Legacy Codes details and verify fields
And user enter dm code under Legacy Codes details and verify fields
And user enetr Allocation sequence number under Legacy Codes details and verify fields
And user verify and save the Record with Valid data
#Then Click the subproductretail master
#And user click the edit icon for the record which saved in maker
Then Verify the back arrow function
Then Enter the required sub product parameters fields in maker
And Enter the required bulk payment fields in maker
And Enter the required foreclosure fields in maker
And Enter the required reschedulement fields in maker
And Enter the required moratorium/Grace period month in maker
Then Enter the required pre-EMI fields in maker
Then Click the save button get the confirmation messege
#WIP Record
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
@M14.2_SubPrdMst_Approve
Scenario: verify Checker user is able to Approve the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Approve icon
And user Enter the remarks in Action confirmation popup
Then user Click on Remarks button in Action confirmation popup
Then user verify the Record got Approved 
@m14.3
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
And User select and Modify Compute Installment on for approved
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


@M1_SubPrdMst_Creation
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details for parameter Validation
And user enter sub product code under sub product for parameter Validation
And user enter sub product code description under sub product definition details and verify fields
And user select facility type under facility details  
And user select individual or corporate under facility details and verify fields
And user select Loan Purpose under facility details and verify fields
And user select Installed Based under facility details and verify fields
And user select continue with existing loan number under facility details and verify fields
And user select financial concept under facility details and verify fields
And user select Disbursement locking under facility details and verify fields
And user select Top Up Allowed under facility details and verify fields
And user select collatralized under Asset Financed details and verify fields
And user select finance against existing Asset under Asset Financed details and verify fields
And user select is multiple Asset Finance is allowed under Asset Financed details and verify fields
And user select impact on under Floating Rate details and verify fields
And user select Reset Logic under Floating Rate details and verify fields
And user select Floating rate Effective date under Floating Rate details and verify fields
And user select Floating Rate Effective Frequency under Floating Rate details and verify fields
And user enter EMI CAP percentage under Floating Rate details and verify fields
And user enter tenor tolerance in months under Floating Rate details and verify fields
And user enter legacy code 1 under Legacy Codes details and verify fields
And user enter legacy code 2 under Legacy Codes details and verify fields
And user enter dm code under Legacy Codes details and verify fields
And user enetr Allocation sequence number under Legacy Codes details and verify fields
And user verify and save the Record with Valid data
And user goto the Maker Inbox
Then user store the Referance Id in Maker stage and Click on Action Icon
And user click Back button icon and Click on Action Icon
And  user verify the submit button and submit from Maker stage

@M1.1_SubPrdMst_Approve
Scenario: verify Checker user is able to Approve the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Approve icon
And user Enter the remarks in Action confirmation popup
Then user Click on Remarks button in Action confirmation popup
Then user verify the Record got Approved 
@M1_SubPrdMst_Creation
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details for parameter Validation
And user enter sub product code under sub product for parameter Validation
And user enter sub product code description under sub product definition details and verify fields
And user select facility type under facility details  
And user select individual or corporate under facility details and verify fields
And user select Loan Purpose under facility details and verify fields
And user select Installed Based under facility details and verify fields
And user select continue with existing loan number under facility details and verify fields
And user select financial concept under facility details and verify fields
And user select Disbursement locking under facility details and verify fields
And user select Top Up Allowed under facility details and verify fields
And user select collatralized under Asset Financed details and verify fields
And user select finance against existing Asset under Asset Financed details and verify fields
And user select is multiple Asset Finance is allowed under Asset Financed details and verify fields
And user select impact on under Floating Rate details and verify fields
And user select Reset Logic under Floating Rate details and verify fields
And user select Floating rate Effective date under Floating Rate details and verify fields
And user select Floating Rate Effective Frequency under Floating Rate details and verify fields
And user enter EMI CAP percentage under Floating Rate details and verify fields
And user enter tenor tolerance in months under Floating Rate details and verify fields
And user enter legacy code 1 under Legacy Codes details and verify fields
And user enter legacy code 2 under Legacy Codes details and verify fields
And user enter dm code under Legacy Codes details and verify fields
And user enetr Allocation sequence number under Legacy Codes details and verify fields
And user verify and save the Record with Valid data
And user goto the Maker Inbox
Then user store the Referance Id in Maker stage and Click on Action Icon
And user click Back button icon and Click on Action Icon
And  user verify the submit button and submit from Maker stage

@M1.1_SubPrdMst_Approve
Scenario: verify Checker user is able to Approve the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Approve icon
And user Enter the remarks in Action confirmation popup
Then user Click on Remarks button in Action confirmation popup
Then user verify the Record got Approved 
@m14.4
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
 

@m16.1
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
And user select and modify interest Amortization Method for reject
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
@M16.2_SubPrdMst_Reject
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected 

@m17.1
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
And user select and modify interest Amortization Method for return
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
@M17.2_SubPrdMst_Return
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Return icon
And user Enter the remarks for Return the Record
Then user Click on Remarks button for Return confirmation
Then user verify the Record got Return











