Feature: To verify the functionalities of beneficiary details
@BeneficiaryDetails_01
Scenario: Creation of Beneficiary Details record with valid data
Given Launch the kuls application and Navigate to Application details view list
Then choose the data set id for creation of beneficiary details
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


@BeneficiaryDetails_02
Scenario: Creation of Beneficiary Details record with invalid data
Given Launch the kuls application and Navigate to Application details view list
Then Choose the data set for invalide validation in beneficaiary details
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

@BeneficiaryDetails_M5
Scenario: Validate that user can able to Update Beneficiary Details record with negative validation
Given Launch the kuls application and Navigate to Application details view list
Then choose the data set id to update beneficiary details record with negative validation
And Navigate to Mail box of Application details and search the DISBMKR value
And Click on action icon of first record of application details_DISBMKR
And Navigate to Beneficiary Details section
And Click on Pencil Icon of existing Beneficiary details record
And Remove values from required fields in Beneficiary Details
And Click on Save button and validate field is required popup in Beneficiary Details
And Click on Back button of Beneficiary details
And Click on Pencil Icon of existing Beneficiary details record
And Update with invalid data and validate error popup in Beneficiary details

@AT-BD-003
Scenario: To verify maker user can able to update the beneficiary record before save
Given Launch the kuls application and Navigate to Application details view list
Then choose the data set id to update the beneficiary detail record before save
Then  Click the inbox in in beneficiary details
And search the disbursement maker record
And Click on action icon of first record of application details_DISBMKR
#And select the first record of disbursment maker stage
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

@AT-BD-010
Scenario: To verify the functionality of Activate/Deactivate button and  verify the Label on button if the status of record is Active
Given Launch the kuls application and Navigate to Application details view list
Then choose the data set id to update beneficiary details record with negative validation
And Navigate to Mail box of Application details and search the DISBMKR value
And Click on action icon of first record of application details_DISBMKR
And Navigate to Beneficiary Details section
And Click on Pencil Icon of existing Beneficiary details record
#Given user login as a cent bank uls application
#When user click the inbox icon for application new app
#And User search Disbursement Maker Stage in inbox list view
#And User click the first edit icon of Disbursement Maker Stage record
#And user click the Beneficiary details tab
#And User click the first edit icon of beneficiary details list data
Then User verify the functionality of active and deactive toggle
Then User verify the Label on button if the status of record is Active