Feature: To verify the functionalities of beneficiary details
@BeneficiaryDetails_01
Scenario: Creation of Beneficiary Details record with valid data
Given Launch the kuls application and Navigate to Application details view list
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
Scenario: Creation of Beneficiary Details record with valid data
Given Launch the kuls application and Navigate to Application details view list
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
