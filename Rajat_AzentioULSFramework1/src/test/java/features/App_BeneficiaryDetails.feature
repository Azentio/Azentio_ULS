Feature: Testing the functionalities of Beneficiary Details In Application Creation 
#This Automation test case includes Manual test cases BEN_03_02 BEN_03_03 BEN_03_06 BEN_03_08
@AT-BD-004
Scenario: To Verify System should allow user to do a modification on already saved record
Given user login as a cent bank uls application
When user click the inbox icon for application new app
And Updating Testdata Id for Application Beneficiary Details
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
#This Automation test case includes Manual test cases BEN_03_13 BEN_03_14
@AT-BD-010
Scenario: To verify the functionality of Activate/Deactivate button and  verify the Label on button if the status of record is Active
Given user login as a cent bank uls application
When user click the inbox icon for application new app
And User search Disbursement Maker Stage in inbox list view
And User click the first edit icon of Disbursement Maker Stage record
And user click the Beneficiary details tab
And User click the first edit icon of beneficiary details list data
Then User verify the functionality of active and deactive toggle
Then User verify the Label on button if the status of record is Active
@AT-BD-006
Scenario: To verify the functionality of Approved button in side application details screen at Disbursement Maker stage
Given user login as a cent bank uls application
When user click the inbox icon for application new app
And Updating Testdata Id for Application Beneficiary Details
And User search Disbursement Maker Stage in inbox list view
And User Save the Reference Number for the Beneficiary Details Record Disbursement Maker Stage
And User click the first edit icon of Disbursement Maker Stage record
And User Verify the Functionality of Approve button in Beneficiary Details
And User Enter remark for approve
And User click popup approve button
And User Verify Record got approved and moved to Disbursement Checker Stage
@AT-BD-007
Scenario: To verify the functionality of Approved button in side application details screen at Disbursement Checker stage
Given user login as a cent bank uls application
When user click the inbox icon for application new app
And Updating Testdata Id for Application Beneficiary Details
And User search Disbursement Checker Stage in inbox list view
And User Save the Reference Number for the Beneficiary Details Record Disbursement Checker Stage
And User click the first edit icon of Disbursement Checker Stage record
And User Verify the Functionality of Approve button in Beneficiary Details
And User Enter remark for approve
And User click popup approve button
And User Verify Record got approved and moved to Checker Print Stage

