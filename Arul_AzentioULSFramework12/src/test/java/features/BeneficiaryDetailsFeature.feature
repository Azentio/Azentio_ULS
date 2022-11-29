Feature: Validation of Beneficiary Details
@BeneficiaryDetails_M5
Scenario: Validate that user can able to Update Beneficiary Details record with negative validation
Given Launch the kuls application
And Navigate to Mail box of Application details and search the DISBMKR value
And Click on action icon of first record of application details_DISBMKR
And Navigate to Beneficiary Details section
And Click on Pencil Icon of existing Beneficiary details record
And Remove values from required fields in Beneficiary Details
And Click on Save button and validate field is required popup in Beneficiary Details
And Click on Back button of Beneficiary details
And Click on Pencil Icon of existing Beneficiary details record
And Update with invalid data and validate error popup in Beneficiary details