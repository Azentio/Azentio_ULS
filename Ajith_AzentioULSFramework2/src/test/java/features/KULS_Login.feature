Feature: Login Functionality of kuls
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
 
