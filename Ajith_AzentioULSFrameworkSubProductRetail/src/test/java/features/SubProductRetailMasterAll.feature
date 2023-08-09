Feature: To check the functionalities of sub product retail master
#AT-SPR-T001
@AT-SPR-T001_01
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And get the test data for the first test case
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
And store the record reference number for checker approval
And user goto the Maker Inbox
And user click first record in Inbox view
And user click Back button icon in sub product retail
And get the test data for the first test case
And user click first record in Inbox view
And  user verify the submit button and submit from Maker stage
And store the checker id of sub product master for checker approval
#AT-SPR-T001
@AT-SPR-T001_02
Scenario: verify Checker user is able to Approve the record in subproduct Master Retail
And get the test data for checker approval scenario
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Approve icon
And user Enter the remarks in Action confirmation popup
Then user Click on Remarks button in Action confirmation popup
Then user verify the Record got Approved 
#AT-SPR-T001
@AT-SPR-T001_03
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
And user click list view icon of sub product retail
And get the test data for the first test case
And user click list view icon of sub product retail
Then User validate the approved record in list view
#AT-SPR-T002
@AT-SPR-T002_01
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And get the test datafor creation of record which is going to reject by maker
And user select Product group under product details and verify fields 
And user select Product codes under product details and verify fields
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
Then user store the Referance Id in Maker stage and Click on Action Icon which is going to reject in checker
#Then user store the Referance Id in Maker stage and Click on Action Icon
And user click Back button icon and Click on Action Icon
And  user verify the submit button and submit from Maker stage
#AT-SPR-T002
@AT-SPR-T002_02
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
And get the test data of checker reject scenario
Given user log in as uls application checker
And user change Module name from Corporate to LOS
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected 
#AT-SPR-T002
@AT-SPR-T002_03
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
And user click list view icon of sub product retail
#And user click list view icon of sub product retail
And get the test datafor creation of record which is going to reject by maker
Then User validate the Rejected record in list view
#AT-SPR-T003
@AT-SPR-T003_01
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And get the test data of creation of sub product record whcih is going to return in checker stage
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
Then user store the Referance Id in Maker stage for checker return purpose and Click on Action Icon
And user click Back button icon and Click on Action Icon
And submit the record from maker and store the checker ID for return purpose

#AT-SPR-T003
@AT-SPR-T003_02
Scenario: verify Checker user is able to Return the record in subproduct Master Retail
Given Navigate to uls application and for checker return
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Return icon
And user Enter the remarks for Return the Record
Then user Click on Remarks button for Return confirmation
Then user verify the Record got Return 
#AT-SPR-T003
@AT-SPR-T003_03
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
And click on temp view of sub product retail master
And get the test data of creation of sub product record whcih is going to return in checker stage
Then User validate the Returned record in list view
@AT-SPR-T004
Scenario: Creation of Sub product retail master with Invalid data
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And get the test data of validation scenario
And user select Product group under product details and verify fields 
And user select Product code under product details and verify fields
And user enter sub product code as special characters
Then user verify the Special characters field proper validation message
And user verify and save the Record with InValid data
Then user verify the Required field proper validation message
#AT-SPR-T004
#AT-SPR-T005
@M5M6
Scenario: Modification of Sub-product Master record
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
#WIP record
And user click edit icon of sub product retail
And user click the edit icon for the record which saved in maker
And get the test data for Updation scenario for checker approval 
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
And store the updated record reference number for checker approval purpose
And user submit the modification record and store the checker id for approval purpose
@M5.1_SubPrdMst_Approve
Scenario: verify Checker user is able to Approve the record in subproduct Master Retail
And get the test data of updation checker approval scenario
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
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
And user click list view icon of sub product retail
And get the test data for Updation scenario for checker approval
Then User validate the updated record in list view
#AT-SPR-T007
@AT-SPR-T007_01
Scenario: Modification of Sub-product Master record
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
#updation
And user click list view in sub product menu
And user click the edit icon for the record which saved in maker 
And get the test data for Updation scenario for checker Reject
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
And select the modified record and store the reference number for checker reject purpose
#And user submit the modified record and verify the sucess message
And store the updated record checker ID for rejection purpose
#AT-SPR-T007
@AT-SPR-T007_02
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
And get the test data of checker reject for updation scenario
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected 
#AT-SPR-T008
@AT-SPR-T008_01
Scenario: Modification of Sub-product Master record
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
#updation
And user click list view in sub product menu
And user click the edit icon for the record which saved in maker 
And get the test data for updation which is going to return in checker
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
#AT-SPR-T008
@AT-SPR-T008_02
Scenario: Verify that checker user can abe to return the updated sub product master record
And get the test data of checker return for updation scenario 
Given user log in as uls application checker
And Click on Menu icon
And Click on Mailbox icon
#And Search the respective reference id
And click on Action button
And Click on Return icon
And Enter the remarks in Action confirmation popup
Then Click on Remarks button in Action confirmation popup
#AT-SPR-T009
@AT-SPR-T009
Scenario: Validate the view list in Sub product master page
# This test cases also covers the functionalities of M18
# SPM_09_01, SPM_09_02, SPM_09_03, SPM_09_08, SPM_09_09, SPM_09_10, 
#SPM_09_11, SPM_10_01, SPM_10_02, SPM_10_03, SPM_10_04, SPM_10_05, SPM_10_06, 
#SPM_10_07, SPM_10_08, SPM_10_09, SPM_10_10, SPM_10_11, SPM_10_12
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
And user click list view in sub product menu
And get the test data for WIP List view validation
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
#AT-SPR-T010
@AT-SPR-T010_01
Scenario: To verify post clicking on Add button, the Parameter screen is getting open with all valid fields
Given Launch the kuls application and login as maker
And user change Module name from Corporate to LOS
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And get the test data of sub product parameter creation test data
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
#AT-SPR-T010
@AT-SPR-T010_02
Scenario: verify Checker user is able to Approve the record in subproduct Parameter Master Record
And get the test data for subproduct parameter checker approval scenario
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
#And user change Module name from Corporate to LOS
When user click product set up menu
And user click list view icon of sub product retail
And get the test data of sub product parameter creation test data
Then User validate the parameter created record in list view
#AT-SPR-T011
@AT-SPR-T011_01
Scenario: To verify post clicking on Add button, the Parameter screen is getting open with all valid fields
Given Launch the kuls application and login as maker
#And user change Module name from Corporate to LOS
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
#And get the test datafor creation of record which is going to reject by maker
And get the test data for creation of sub product parameter which is going to rejected by checker
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
And search for sub product master record in mail box area
And select the sub product master record and store the reference number for checker reject purpose
And submit the record from maker stage 
And store the checker id for cheker id for checker reject purpose 
#AT-SPR-T011
@AT-SPR-T011_02
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
#Given user log in as uls application checker
Given navigate the uls application along with parameter creation record test data
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected 
#AT-SPR-T011
@AT-SPR-T011_03
Scenario: Record should get approved and display in the system under Approved List view
Given user log in as uls application maker
And user change Module name from Corporate to LOS
And user click the inbox icon
And user verify the rejected record removed from the system
#AT-SPR-T012
@AT-SPR-T012_01
Scenario: To verify post clicking on Add button, the Parameter screen is getting open with all valid fields
Given Launch the kuls application and login as maker
#And user change Module name from Corporate to LOS
When user click product set up menu
And user click list view icon of sub product retail
And user click add icon for create record in sub product retail
And get the test data for sub product parameter creation which going to return in checker
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
And search for sub product master record in mail box area
And select the sub product parameter master record and store the reference number for checker return purpose
And submit the record from maker stage 
And store the checker id for cheker id for checker return purpose in sub product parameter
#AT-SPR-T012
@AT-SPR-T012_02
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given Navigate to uls application as checker along with parameter checker rekect test data
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Return icon
And user Enter the remarks for Return the Record
Then user Click on Remarks button for Return confirmation
Then user verify the Record got Return 
#AT-SPR-T012
@AT-SPR-T012_03
Scenario: Record should get approved and display in the system under Approved List view
Given Navigate to uls application for verify returned parameter record is visible under temp of sub product retail
#And user change Module name from Corporate to LOS
When click on configuration main menu
And click on config manager sub menu
And click on temp view of sub product retail master
Then User validate the Returned record in list view
@AT-SPR-T013
Scenario: To verify post clicking on Add button, the Parameter screen is getting open with all valid fields
Given Launch the kuls application and login as maker
#And user change Module name from Corporate to LOS
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
#AT-SPR-T014
@AT-SPR-T014_01
Scenario: Modification of Parameter tab details in Sub-product Retail Master screen
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
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
#AT-SPR-T014
@AT-SPR-T014_02
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
@AT-SPR-T015
Scenario: To verify while modification, when user keep any mandatory field blank and click on save button
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
Then Click the subproductretail master
And Click the parameter
And Update the parameter fields in maker
And Click the save icon
Then Get the validation message in maker
@m14.3
Scenario: Modification of Parameter tab details in Sub-product Retail Master screen in approved list
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
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
#AT-SPR-T016
@AT-SPR-T016_01
Scenario: Modification of Parameter tab details in Sub-product Retail Master screen
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
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
#AT-SPR-T016
@AT-SPR-T016_02
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected 
#AT-SPR-T017
@AT-SPR-T017_01
Scenario: Modification of Parameter tab details in Sub-product Retail Master screen
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
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
#AT-SPR-T017
@AT-SPR-T017_02
Scenario: verify Checker user is able to Return the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Return icon
And user Enter the remarks for Return the Record
Then user Click on Remarks button for Return confirmation
Then user verify the Record got Return
@M1.0_SubPrdMst_Creation
Scenario: Creation of Sub product retail master with valid data
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
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
#AT-SPR-T014 
@AT-SPR-T014
Scenario: Validation of Parameter tab details in Sub-product Retail Master screen in approved list
Given user log in as uls application maker
#And user change Module name from Corporate to LOS
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