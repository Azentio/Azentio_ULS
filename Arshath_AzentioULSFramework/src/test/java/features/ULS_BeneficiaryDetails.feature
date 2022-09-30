Feature: verify the Beneficiary details screen with list view
@AT_BD_012
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













