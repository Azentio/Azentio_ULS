Feature: To test the beneficiary details screen
@AT-BD-003
Scenario: To verify maker user can able to update the beneficiary record before save
Given navigate to uls application 
And login with maker credentials
And click on mail box
And search the disbursement maker record
And select the first record of disbursment maker stage
And go to beneficiary details tab
And click on add button on beneficiary details screen
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

