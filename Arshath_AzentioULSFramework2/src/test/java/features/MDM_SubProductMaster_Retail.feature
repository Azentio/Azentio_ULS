Feature: To check the functionalities of sub product retail master
@M1_SubPrdMst_Creation
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
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

@M1.1_SubPrdMst_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
Then User validate the approved record in list view

@M2_SubPrdMst_CreateRecordforRejection
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
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

@M2_SubPrdMst_Reject
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected 

@M2_SubPrdMst_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
When user click product set up menu
And user click list view icon of sub product retail
Then User validate the Rejected record in list view

@M3_SubPrdMst_CreateRecordforReturn
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
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

@M3_SubPrdMst_Return
Scenario: verify Checker user is able to Return the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Return icon
And user Enter the remarks for Return the Record
Then user Click on Remarks button for Return confirmation
Then user verify the Record got Return 

@M3_SubPrdMst_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
When user click product set up menu
And user click Edit view icon of sub product retail
Then User validate the Returned record in list view

@M4_SubPrdMst_InvalidCreation
Scenario: Creation of Sub product retail master with Invalid data
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And user select Product group under product details and verify fields 
And user select Product code under product details and verify fields
And user enter sub product code as special characters
Then user verify the Special characters field proper validation message
And user verify and save the Record with InValid data
Then user verify the Required field proper validation message

@M13_SubPrdMst_InvalidParameter
Scenario: Creation of Parameter record with invalid data
Given user log in as uls application maker
Then user click on configurations Tab
When user click Config Manager menu
When user click product set up menu
And user click Edit view icon of sub product retail
And user click on the first Edit Icon
And user goto the parameter subTab
And user Enter the loan currency value
And user Enter the Remark value as special character
Then user verify the Special characters field proper validation message
And user verify and save the Records with InValid data
Then user verify the Required field proper validation message
















