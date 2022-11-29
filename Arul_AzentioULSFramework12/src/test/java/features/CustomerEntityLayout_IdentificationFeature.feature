Feature: Validation of Identification in Customer entity layout
@Identification_M1
Scenario: Validate that user can able to create a Customer Identification
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update test data for Identification test case one
And Navigate to Additional Customer info section
And Click on Pencil Icon of existing record
And Click on Add icon in Identification view list
And Enter the value in ID type field of Identification
And Enter the value in ID number field of Identification
And Enter the value in Issue date field of Identification
And Enter the value in Expiry Date field of Identification
And Select the value in Issuing Authority field of Identification
And Select the value in Country Of Issue of Identification
And Click on Save button of Identification
Then Validate the Success popup

@Identification_M2
Scenario: Validate that user can able to create a Customer Identification with negative validation
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update test data for Identification test case two
And Navigate to Additional Customer info section
And Click on Pencil Icon of existing record
And Click on Add icon in Identification view list
And Click on Save button and validate field is required popup
And Click on Back button
And Click on Add icon in Identification view list
And Enter special character in text field and validate error popup

@Identification_M3
Scenario: Validate that user can able to update an existing Customer Identification
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update test data for Identification test case three
And Navigate to Additional Customer info section
And Click on Pencil Icon of existing record
And Click on Add icon in Identification view list
And Enter the value in ID type field of Identification
And Enter the value in ID number field of Identification
And Enter the value in Issue date field of Identification
And Enter the value in Expiry Date field of Identification
And Select the value in Issuing Authority field of Identification
And Select the value in Country Of Issue of Identification
And Click on Save button of Identification
Then Validate the Success popup
And Click on first pencil icon in Identification
And Update the value in ID type field of Identification
And Update the value in ID number field of Identification
And Update the value in Country Of Issue of Identification
And Click on Save button of Identification
Then Validate the Success popup

@Identification_M4
Scenario: Validate that user can able to update an existing Customer Identification with negative validation
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update test data for Identification test case four
And Navigate to Additional Customer info section
And Click on Pencil Icon of existing record
And Click on Add icon in Identification view list
And Enter the value in ID type field of Identification
And Enter the value in ID number field of Identification
And Enter the value in Issue date field of Identification
And Enter the value in Expiry Date field of Identification
And Select the value in Issuing Authority field of Identification
And Select the value in Country Of Issue of Identification
And Click on Save button of Identification
Then Validate the Success popup
And Click on first pencil icon in Identification
And Remove values from required fields in Identification
And Click on Save button and validate field is required popup
And Click on Back button of Identification
And Click on first pencil icon in Identification
And Update special character in text field and validate error popup

@Identification_M5
Scenario: Validate the view list of Customer Identification
Given Launch the kuls application
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update test data for Identification test case five
And Navigate to Additional Customer info section
And Click on Pencil Icon of existing record
And Click on Add icon in Identification view list
And Enter the value in ID type field of Identification
And Enter the value in ID number field of Identification
And Enter the value in Issue date field of Identification
And Enter the value in Expiry Date field of Identification
And Select the value in Issuing Authority field of Identification
And Select the value in Country Of Issue of Identification
And Click on Save button of Identification
Then Validate the Success popup
And Validate Export to PDF functionality of Identification
And Validate Export to Excel functionality of Identification

