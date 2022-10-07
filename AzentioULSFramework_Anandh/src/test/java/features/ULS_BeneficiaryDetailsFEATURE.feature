Feature: To test the beneficiary details screen

@AT-BD-001
Scenario: Creation of Beneficiary Details record with valid data
Given navigate to uls application 
And login with maker credentials
Then  Click the inbox in in beneficiary details
And Click the search button in beneficiary detail
Then Enter as disbursement maker in the search bar in beneficiary detail
And Click the disbursement maker first action icon in beneficiary detail
Then Click the beneficiary detail tab
And Click the add button in the beneficiary detail
Then To verify the field Application Id in beneficiary details
And To verify the field Beneficiary Name in beneficiary details
Then To verify the field Beneficiary Type in beneficiary details 
And To verify the field Beneficiary KYC in beneficiary details
Then To verify the field Beneficiary address in beneficiary details  
And To verify the field Account Type in beneficiary details 
Then To verify the field IBAN Account Number in beneficiary details 
And To verify the field MICR Type in beneficiary details 
Then To verify the field Beneficiary MICR code in beneficiary details 
And To verify the field Bank code in beneficiary details 
Then To verify the field Branch Name in beneficiary details 
And To verify the field IFSC code in beneficiary details 
Then To verify the field Payment Type in beneficiary details 
And To verify the field Payment Mode in beneficiary details 
Then To verify the field Beneficiary email in beneficiary details 
And To verify the field remark in beneficiary details 
Then save the record in beneficiary details
And Validate the save popup in beneficiary details


@AT-BD-002
Scenario: Creation of Beneficiary Details record with valid data
Given navigate to uls application 
And login with maker credentials
Then  Click the inbox in in beneficiary details
And Click the search button in beneficiary detail
Then Enter as disbursement maker in the search bar in beneficiary detail
And Click the disbursement maker first action icon in beneficiary detail
Then Click the beneficiary detail tab
And Click the add button in the beneficiary detail
Then save the record in beneficiary details
And Verify the bank field in beneficiary detail
Then verify the impact when user enters only special characters value in any field in beneficiary details
And verify the impact when user enter numeric value in character field in beneficiary detail
Then verify the impact when user enter characters  value in numeric field in beneficiary detail
Then save the record in beneficiary details
@AT-BD-003
Scenario: To verify maker user can able to update the beneficiary record before save
Given navigate to uls application 
And login with maker credentials
And click on mail box
And search the disbursement maker record
And select the first record of disbursment maker stage
And go to beneficiary details tab
And click on add button on beneficiary details screen
Then To verify the field Application Id in beneficiary details
And To verify the field Beneficiary Name in beneficiary details
Then To verify the field Beneficiary Type in beneficiary details 
And To verify the field Beneficiary KYC in beneficiary details
Then To verify the field Beneficiary address in beneficiary details  
And To verify the field Account Type in beneficiary details 
Then To verify the field IBAN Account Number in beneficiary details 
And To verify the field MICR Type in beneficiary details 
Then To verify the field Beneficiary MICR code in beneficiary details 
And To verify the field Bank code in beneficiary details 
Then To verify the field Branch Name in beneficiary details 
And To verify the field IFSC code in beneficiary details 
Then To verify the field Payment Type in beneficiary details 
And To verify the field Payment Mode in beneficiary details 
Then To verify the field Beneficiary email in beneficiary details 
And To verify the field remark in beneficiary details
Then verify user can able to update the facility application ID field
Then verify user can able to update beneficiary name field
Then verify user can able to update beneficiary type field
Then verify user can able to update beneficiary KYC field
Then verify user can able to update the beneficiary address field
Then verify user can able to update the account type field
Then verify user can able to update the IBAN account no field
Then verify user can able to update the MICR Type field
Then verify user can able to update the beneficiary MICR Code field
Then verify user can able to update the Bank code field
Then verify user can able to update the branch name field
Then verify user can able to update the IFSC Code
Then verify user can able to update the payment type field
Then verify user can able to update the payment mode field
Then verify user can able to update the beneficiary email field
Then verify user can able to update the remarks field
And click on save button to save the updated beneficiary details record
@AT-BD-004
Scenario: To Verify System should allow user to do a modification on already saved record
Given navigate to uls application 
And login with maker credentials
And click on the mail box button
And User search Disbursement Maker Stage in inbox list view
And User click the first edit icon of Disbursement Maker Stage record
And user click the Beneficiary details tab
And User click the first edit icon of beneficiary details list data
And User Select and Update Facility Application id
And User Update Beneficiary Name
And User Select and Update Beneficiary Type
And User Update Beneficiary KYC
And User Update Beneficiary Address
And User Select and Update Account Type
And User Update IBAN or Account Number
And User Select and Update MICR Type
And User Select and Update Beneficiary MICR Code
And User Select and Update Bank Code
And User Select and Update Branch Name
And User Update IFSC Code
And User Select and Update Payment Type
And User Select and Update Payment Mode
And User Update Beneficiary Email
And User Update Remarks in Beneficiary Details
And User upadte and save the Beneficiary Details record
@AT-BD-003.2
Scenario: To verify maker user can able to update the beneficiary record before save
Given navigate to uls application 
And login with maker credentials
And click on mail box
And search the disbursement maker record
And select the first record of disbursment maker stage
And go to beneficiary details tab
And click on add button on beneficiary details screen
Then To verify the field Application Id in beneficiary details
And To verify the field Beneficiary Name in beneficiary details
Then To verify the field Beneficiary Type in beneficiary details 
And To verify the field Beneficiary KYC in beneficiary details
Then To verify the field Beneficiary address in beneficiary details  
And To verify the field Account Type in beneficiary details 
Then To verify the field IBAN Account Number in beneficiary details 
And To verify the field MICR Type in beneficiary details 
Then To verify the field Beneficiary MICR code in beneficiary details 
And To verify the field Bank code in beneficiary details 
Then To verify the field Branch Name in beneficiary details 
And To verify the field IFSC code in beneficiary details 
Then To verify the field Payment Type in beneficiary details 
And To verify the field Payment Mode in beneficiary details 
Then To verify the field Beneficiary email in beneficiary details 
And To verify the field remark in beneficiary details
Then verify user can able to update the facility application ID field
Then verify user can able to update beneficiary name field
Then verify user can able to update beneficiary type field
Then verify user can able to update beneficiary KYC field
Then verify user can able to update the beneficiary address field
Then verify user can able to update the account type field
Then verify user can able to update the IBAN account no field
Then verify user can able to update the MICR Type field
Then verify user can able to update the beneficiary MICR Code field
Then verify user can able to update the Bank code field
Then verify user can able to update the branch name field
Then verify user can able to update the IFSC Code
Then verify user can able to update the payment type field
Then verify user can able to update the payment mode field
Then verify user can able to update the beneficiary email field
Then verify user can able to update the remarks field
And click on save button to save the updated beneficiary details record

@AT-BD-005
Scenario: Validate that user can able to Update Beneficiary Details record with negative validation
Given navigate to uls application
And login with maker credentials
And Navigate to Mail box of Application details and search the DISBMKR value
And Click on action icon of first record of application details_DISBMKR
And Navigate to Beneficiary Details section
And Click on Pencil Icon of existing Beneficiary details record
And Remove values from required fields in Beneficiary Details
And Click on Save button and validate field is required popup in Beneficiary Details
And Click on Back button of Beneficiary details
And Click on Pencil Icon of existing Beneficiary details record
And Update with invalid data and validate error popup in Beneficiary details
@AT-BD-006
Scenario: To verify the functionality of Approved button in side application details screen at Disbursement Maker stage
Given navigate to uls application 
And login with maker credentials
And click on the mail box button
And User search Disbursement Maker Stage in inbox list view
And User Save the Reference Number for the Beneficiary Details Record Disbursement Maker Stage
And User click the first edit icon of Disbursement Maker Stage record
And User Verify the Functionality of Approve button in Beneficiary Details
And User Enter remark for approve
And User click popup approve button
And User Verify Record got approved and moved to Disbursement Checker Stage
@AT-BD-007
Scenario: To verify the functionality of Approved button in side application details screen at Disbursement Checker stage
Given navigate to uls application 
And login with maker credentials
And click on the mail box button
And User search Disbursement Checker Stage in inbox list view
And User Save the Reference Number for the Beneficiary Details Record Disbursement Checker Stage
And User click the first edit icon of Disbursement Checker Stage record
And User Verify the Functionality of Approve button in Beneficiary Details
And User Enter remark for approve
And User click popup approve button
And User Verify Record got approved and moved to Checker Print Stage
#Karthi


@AT-BD-008
Scenario: To verify Checker user is able to Reject the record
Given navigate to uls application 
And login with maker credentials
And User click the inbox mail icon in application detail offering
And User search the record from the system in Beneficiary details
And User click the action edit icon in Beneficiary details
And User click the Reject button in Beneficiary details
Then User enter the reject popup message in Beneficiary details
And User click the final reject in Beneficiary details
And User get the save confirmation messege in customer entity layout facility details
And User click the inbox mail icon in application detail offering
And User Verification search the record from the system in Beneficiary details
And User verify the rejected record removed from the system in Beneficiary details

@AT-BD-009
Scenario: To verify Checker user is able to Return the record
Given navigate to uls application 
And login with maker credentials
And User click the inbox mail icon in application detail offering
And User search the record from the system in Beneficiary details
And User click the action edit icon in Beneficiary details
And User click the return button in Beneficiary details
Then User enter the return popup message in Beneficiary details
And User click the final Return in Beneficiary details
And User get the save confirmation messege in customer entity layout facility details
And User click the inbox mail icon in application detail offering
And User Verification search the record from the system in Beneficiary details
And User verify the return record shown in Beneficiary details maker stage

@AT-BD-001.2
Scenario: Creation of Beneficiary Details record with valid data
Given navigate to uls application 
And login with maker credentials
Then  Click the inbox in in beneficiary details
And Click the search button in beneficiary detail
Then Enter as disbursement maker in the search bar in beneficiary detail
And Click the disbursement maker first action icon in beneficiary detail
Then Click the beneficiary detail tab
And Click the add button in the beneficiary detail
Then To verify the field Application Id in beneficiary details
And To verify the field Beneficiary Name in beneficiary details
Then To verify the field Beneficiary Type in beneficiary details 
And To verify the field Beneficiary KYC in beneficiary details
Then To verify the field Beneficiary address in beneficiary details  
And To verify the field Account Type in beneficiary details 
Then To verify the field IBAN Account Number in beneficiary details 
And To verify the field MICR Type in beneficiary details 
Then To verify the field Beneficiary MICR code in beneficiary details 
And To verify the field Bank code in beneficiary details 
Then To verify the field Branch Name in beneficiary details 
And To verify the field IFSC code in beneficiary details 
Then To verify the field Payment Type in beneficiary details 
And To verify the field Payment Mode in beneficiary details 
Then To verify the field Beneficiary email in beneficiary details 
And To verify the field remark in beneficiary details 
Then save the record in beneficiary details
And Validate the save popup in beneficiary details
#This Automation test case includes Manual test cases BEN_03_13 BEN_03_14
@AT-BD-010
Scenario: To verify the functionality of Activate/Deactivate button and  verify the Label on button if the status of record is Active
Given navigate to uls application 
And login with maker credentials
And click on the mail box button
And User search Disbursement Maker Stage in inbox list view
And User click the first edit icon of Disbursement Maker Stage record
And user click the Beneficiary details tab
And User click the first edit icon of beneficiary details list data
Then User verify the functionality of active and deactive toggle
Then User verify the Label on button if the status of record is Active
@AT-BD-011
Scenario: To verify the fucntionality of activation and deactivation in benefifciary Details screen
Given navigate to uls application 
And login with maker credentials
And click on mail box
And search the disbursement maker record
And select the first record of disbursment maker stage
And go to beneficiary details tab
And select one list view record
And check the status of the status button
Then verify if the status is activate user can able to de activate if the status is de activate user can able to activate
Then verify user can able to see the save and back button in the benificiary details screen
And click on back button in beneficiary dettails screen
And click on add button on beneficiary details screen
Then verify user can able to see the save and back button in the benificiary details screen
@AT-BD-003.3
Scenario: To verify maker user can able to update the beneficiary record before save
Given navigate to uls application 
And login with maker credentials
And click on mail box
And search the disbursement maker record
And select the first record of disbursment maker stage
And go to beneficiary details tab
And click on add button on beneficiary details screen
Then To verify the field Application Id in beneficiary details
And To verify the field Beneficiary Name in beneficiary details
Then To verify the field Beneficiary Type in beneficiary details 
And To verify the field Beneficiary KYC in beneficiary details
Then To verify the field Beneficiary address in beneficiary details  
And To verify the field Account Type in beneficiary details 
Then To verify the field IBAN Account Number in beneficiary details 
And To verify the field MICR Type in beneficiary details 
Then To verify the field Beneficiary MICR code in beneficiary details 
And To verify the field Bank code in beneficiary details 
Then To verify the field Branch Name in beneficiary details 
And To verify the field IFSC code in beneficiary details 
Then To verify the field Payment Type in beneficiary details 
And To verify the field Payment Mode in beneficiary details 
Then To verify the field Beneficiary email in beneficiary details 
And To verify the field remark in beneficiary details
Then verify user can able to update the facility application ID field
Then verify user can able to update beneficiary name field
Then verify user can able to update beneficiary type field
Then verify user can able to update beneficiary KYC field
Then verify user can able to update the beneficiary address field
Then verify user can able to update the account type field
Then verify user can able to update the IBAN account no field
Then verify user can able to update the MICR Type field
Then verify user can able to update the beneficiary MICR Code field
Then verify user can able to update the Bank code field
Then verify user can able to update the branch name field
Then verify user can able to update the IFSC Code
Then verify user can able to update the payment type field
Then verify user can able to update the payment mode field
Then verify user can able to update the beneficiary email field
Then verify user can able to update the remarks field
And click on save button to save the updated beneficiary details record
@AT-BD-012
Scenario: verify system display the List view at bottom of the screen
Given User Launch the KULS url for Transaction
And user click on Inbox Icon
And user click search icon
And user search Disbursement Maker
And user click on First record of Beneficiary Entry
And user click on Beneficiary Details Tab
And user verify the Beneficiary Type in List view screen
And user verify the Beneficiary Name in List view screen
And user verify the Account type in List view screen
And user verify the IBAN Account number in List view screen
And user verify the Beneficiary Bank_Name in List view Screen
And user verify the Bank name in List view screen
And user verify the Add button in List view screen
And user verify the Values in List view should be non editable
And user verify the Search button in List view screen
And user verify the Export to excel in List view screen
And user verify the Export to PDF in List view screen
And user verify the functionality of Search box with mismatch data
And user verify the functionality of Search box with matching data
And user verify the functionality of Export to PDF button
And user verify the functionality of Export to Excel button



