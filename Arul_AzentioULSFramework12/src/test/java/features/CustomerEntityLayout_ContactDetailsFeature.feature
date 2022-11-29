Feature: Validation of Contact Details in Customer entity layout
@ContactDetails_M1
Scenario: Validate that user can able to create a Contact Details
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update test data for contact detatils test case one
And Navigate to Additional Customer info section
And Click on Pencil Icon of existing record
And Click on Add icon in Contact details view list
And Select the value in Phone type field of Contact details
And Enter the value in Phone number field of Contact details
And Select the value in Consent for phone contact field of Contact details
And Select the value in Prefered Phone contact type field of Contact details
And Enter the value in Prefered time for contact field of Contact details
And Select the value in Email type field of Contact details
And Enter the value in Email id field of Contact details
And Click on Save button in Contact details
Then Validate the Success popup in contact detatils

@ContactDetails_M2
Scenario: Validate that user can able to create a contact details with negative validation
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update test data for contact detatils test case two
And Navigate to Additional Customer info section
And Click on Pencil Icon of existing record
And Click on Add icon in Contact details view list
And Click on Save button and validate field is required popup
And Click on Back button
And Click on Add icon in Contact details view list
And Enter alphabet character in numeric field and validate popup
And Enter invalid email in email id field and validate popup

@ContactDetails_M3
Scenario: Validate that user can able to update a contact details
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update test data for contact detatils test case three
And Navigate to Additional Customer info section
And Click on Pencil Icon of existing record
And Click on Add icon in Contact details view list
And Select the value in Phone type field of Contact details
And Enter the value in Phone number field of Contact details
And Select the value in Consent for phone contact field of Contact details
And Select the value in Prefered Phone contact type field of Contact details
And Enter the value in Prefered time for contact field of Contact details
And Select the value in Email type field of Contact details
And Enter the value in Email id field of Contact details
And Click on Save button in Contact details
Then Validate the Success popup in contact detatils
And Click on Pencil icon in Contact details
And Update the value in Phone type field of Contact details
And Update the value in Phone number field of Contact details
And Update the value in Consent for phone contact field of Contact details
And Update the value in Prefered Phone contact type field of Contact details
And Update the value in Prefered time for contact field of Contact details
And Update the value in Email type field of Contact details
And Update the value in Email id field of Contact details
And Click on Save button in Contact details
Then Validate the Success popup in contact detatils

@ContactDetails_M4
Scenario: Validate that user can able to update a contact details with negative validation
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update test data for contact detatils test case four
And Navigate to Additional Customer info section
And Click on Pencil Icon of existing record
And Click on Add icon in Contact details view list
And Select the value in Phone type field of Contact details
And Enter the value in Phone number field of Contact details
And Select the value in Consent for phone contact field of Contact details
And Select the value in Prefered Phone contact type field of Contact details
And Enter the value in Prefered time for contact field of Contact details
And Select the value in Email type field of Contact details
And Enter the value in Email id field of Contact details
And Click on Save button in Contact details
Then Validate the Success popup in contact detatils
And Click on Pencil icon in Contact details
And Remove values from required fields in contact details
And Click on Save button and validate field is required popup
And Click on Back button
And Click on Pencil icon in Contact details
And Update alphabet character in numeric field and validate popup
And Update invalid email in email id field and validate popup


@ContactDetails_M5
Scenario: Validate of View list in contact details
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update test data for contact detatils test case five
And Navigate to Additional Customer info section
And Click on Pencil Icon of existing record
And Click on Add icon in Contact details view list
And Click on Back button
And Search with valid data
And Search with Invalid data
And Validate Export to PDF functionality
And Validate Export to Excel functionality