Feature: verify the Beneficiary details screen with list view
@AT_BD_011
Scenario: To verify the fucntionality of activation and deactivation in benefifciary Details screen
Given User Launch the KULS url for Transaction
And user click on Inbox Icon
And user click search icon
And user update the Excelsheet Testdata for active deactive
And user search Disbursement Maker
And user click on First record of Beneficiary Entry
And user click on Beneficiary Details Tab
And select one list view record
And check the status of the status button
Then verify if the status is activate user can able to de activate if the status is de activate user can able to activate
Then verify user can able to see the save and back button in the benificiary details screen
And click on back button in beneficiary dettails screen
And click on add button on beneficiary details screen
Then verify user can able to see the save and back button in the benificiary details screen

@AT_BD_012
Scenario: verify system display the List view at bottom of the screen
Given User Launch the KULS url for Transaction
And user click on Inbox Icon
And user click search icon
And user update the Excelsheet Testdata for Listview
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













