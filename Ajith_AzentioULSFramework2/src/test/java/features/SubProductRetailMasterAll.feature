Feature: To check the functionalities of sub product retail master
@M1_SubPrdMst_Creation
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details and verify fields
And user enter sub product code under sub product definition details and verify fields
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

@M1.2_SubPrdMst_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
Then User validate the approved record in list view

@M2_SubPrdMst_CreateRecordforRejection
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product codes under product details and verify fields
And user enter sub product codes under sub product definition details and verify fields
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

@M2.1_SubPrdMst_Reject
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected 

@M2.2_SubPrdMst_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
Then User validate the Rejected record in list view

@M3_SubPrdMst_CreateRecordforReturn
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details and verify fields
And user enter sub product code under sub product definition details and verify fields
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

@M3.1_SubPrdMst_Return
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Return icon
And user Enter the remarks for Return the Record
Then user Click on Remarks button for Return confirmation
Then user verify the Record got Return 

@M3.2_SubPrdMst_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
When user click product set up menu
And user click Edit view icon of sub product retail
Then User validate the Returned record in list view

@M4_SubPrdMst_InvalidCreation
Scenario: Creation of Sub product retail master with Invalid data
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details and verify fields
And user enter sub product code as special characters
Then user verify the Special characters field proper validation message
And user verify and save the Record with InValid data
Then user verify the Required field proper validation message
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
@M5.1_SubPrdMst_Approve
Scenario: verify Checker user is able to Approve the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Approve icon
And user Enter the remarks in Action confirmation popup
Then user Click on Remarks button in Action confirmation popup
Then user verify the Record got Approved
@M5.2_SubPrdMst_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
Then User validate the updated record in list view
@m7.1
Scenario: Modification of Sub-product Master record
Given user log in as uls application maker
When user click product set up menu
#updation
And user click list view in sub product menu
And user click the edit icon for the record which saved in maker 
And user Select and modify the project group 
And user Select and modify the Product code 
And user enter and modify sub product code 
And user enter and modify sub product description 
And user enter and modify allocation sequence number for reject
And user click the save button for updation
Then user verify the sucess message for updation
And user click the edit icon for the record which saved in maker 
And user verify all modified details are present on post save the record
And user click the inbox icon
And user click the modified record in the list view and store the reference number
And user submit the modified record and verify the sucess message
@7.2
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected 
@8.1
Scenario: Modification of Sub-product Master record
Given user log in as uls application maker
When user click product set up menu
#updation
And user click list view in sub product menu
And user click the edit icon for the record which saved in maker 
And user Select and modify the project group 
And user Select and modify the Product code 
And user enter and modify sub product code 
And user enter and modify sub product description 
And user enter and modify allocation sequence number for return
And user click the save button for updation
Then user verify the sucess message for updation
And user click the edit icon for the record which saved in maker 
And user verify all modified details are present on post save the record
And user click the inbox icon
And user click the modified record in the list view and store the reference number
And user submit the modified record and verify the sucess message
@m8.2
Scenario: Verify that checker user can abe to return the updated sub product master record
Given Launch the kuls application and login as checker
And Click on Menu icon
And Click on Mailbox icon
#And Search the respective reference id
And click on Action button
And Click on Return icon
And Enter the remarks in Action confirmation popup
Then Click on Remarks button in Action confirmation popup
@m9
Scenario: Validate the view list in Sub product master page
# This test cases also covers the functionalities of M18
# SPM_09_01, SPM_09_02, SPM_09_03, SPM_09_08, SPM_09_09, SPM_09_10, 
#SPM_09_11, SPM_10_01, SPM_10_02, SPM_10_03, SPM_10_04, SPM_10_05, SPM_10_06, 
#SPM_10_07, SPM_10_08, SPM_10_09, SPM_10_10, SPM_10_11, SPM_10_12
Given Launch the kuls application and login as maker
And Navigate to Sub Product Master module view list
And Verify that records present in view list are non editable
And Verify the Add button fuctionality
And Verify that all fields are present in view list while click on view icon
And Search with valid data in view list
And Search with Invalid data in view list
And Export to PDF functionality
And Export to Excel functionality
And Navigate to Sub Product Master module WIP section
And Verify that all fields are present in view list of WIP section
And Verify the Add button fuctionality in WIP
And Search with valid data in view list of WIP
And Search with Invalid data in view list of WIP
And Export to PDF functionality in WIP
And Export to Excel functionality in WIP
@m10.1
Scenario: To verify post clicking on Add button, the Parameter screen is getting open with all valid fields
Given Launch the kuls application and login as maker
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details for parameter creation
And user enter sub product code under sub product for parameter creation
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
Then Get the respective reference id and submit in maker
@M10.2_SubPrdMst_Approve
Scenario: verify Checker user is able to Approve the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Approve icon
And user Enter the remarks in Action confirmation popup
Then user Click on Remarks button in Action confirmation popup
Then user verify the Record got Approved
@M10.3_SubPrdMst_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
Then User validate the parameter created record in list view
@m11.1
Scenario: To verify post clicking on Add button, the Parameter screen is getting open with all valid fields
Given Launch the kuls application and login as maker
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details for parameter creation
And user enter sub product code under sub product for parameter creation
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
Then Get the respective reference id and submit in maker
@11.2
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected 
@11.3_SubPrdMst_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
And user click the inbox icon
And user verify the rejected record removed from the system
@m12.1
Scenario: To verify post clicking on Add button, the Parameter screen is getting open with all valid fields
Given Launch the kuls application and login as maker
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details for parameter creation
And user enter sub product code under sub product for parameter creation
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
Then Get the respective reference id and submit in maker
@M12.2_SubPrdMst_Return
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Return icon
And user Enter the remarks for Return the Record
Then user Click on Remarks button for Return confirmation
Then user verify the Record got Return 

@M12.3_SubPrdMst_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
And user click the inbox icon
And user verify the returned record removed from the system
@m13
Scenario: To verify post clicking on Add button, the Parameter screen is getting open with all valid fields
Given Launch the kuls application and login as maker
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details for verify parameter field invalid
And user enter sub product code under sub product definition for verify parameter invalid data
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
And user click on the first Edit Icon
And user goto the parameter subTab
And user Enter the loan currency value
And user Enter the Remark value as special character
Then user verify the Special characters field proper validation message
And user verify and save the Records with InValid data
Then user verify the Required field proper validation message

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
And user click the edit icon for the record which saved in maker
#Then Verify the back arrow function
And user click parameter tab in sub product retail master
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

#Modification of Parameter record
@m15
Scenario: To verify while modification, when user keep any mandatory field blank and click on save button
Given user log in as uls application maker
Then Click the subproductretail master
And Click the parameter
And Update the parameter fields in maker
And Click the save icon
Then Get the validation message in maker
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
Scenario: verify Checker user is able to Return the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Return icon
And user Enter the remarks for Return the Record
Then user Click on Remarks button for Return confirmation
Then user verify the Record got Return
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