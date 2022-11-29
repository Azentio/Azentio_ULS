Feature: Validation of App data entry module
@ApplicationDetails_M1
Scenario: Validate that user can able to create a App data entry record
Given Launch the kuls application and Navigate to Application details view list
And Click on Add icon in Application details view list
And Select the value in customer type field of Application details
And Enter the value in CIF ID field of Application details
And Enter the value in Application Number
And Enter the value in Customer name field of Application details
And Select the value in ID type field of Application details
And Enter the value in ID number field of Application details
And Enter the value in Mobile number field of Application details
And Enter the value in Date Of Birth field of Application details
And Enter the value in Email Id field of Application details
And Click on Search button in Application details
And Click on Create new request button in Application details
And Select the value in Primary product field of Application details
And Select the value in Primary sub product field of Application details
And Enter the value in Total finance amount requested field of Application details
And Enter the value in Declared net income field of Application details
And Enter the value in Declared current obligations field of Application details
And Select the value in Special promotion of Application details
And Select the value in Sourcing channel field of Application details
And Select the value in Business center code field of Application details
And Select the value in Servicing type field of Application details
And Select the value in Servicing entity field of Application details
And Select the value in Servicing branch field of Application details
And Select the value in Closing staff field of Application details
And Select the value in Sourcing type field of Application details
And Select the value in Sourcing office field of Application details
And Select the value in Sourcing entity field of Application details
And Select the value in Sourcing staff field of Application details
And Select the value in Reference type field of Application details
And Select the value in Reference entity field of Application details
And Enter the value in Reference code field of Application details
And Click on Save button of Application details

@ApplicationDetails_M3
Scenario: Validate that user can able to update the application details
Given Launch the kuls application and Navigate to Application details view list
And Click on the pencil icon of first record in Application details view list
And Update the value in Primary sub product field of Application details
And Update the value in Total finance amount requested field of Application details
And Update the value in Declared net income field of Application details
And Update the value in Declared current obligations field of Application details
And Update the value in Special promotion of Application details
And Update the value in Sourcing channel field of Application details
And Update the value in Business center code field of Application details
And Update the value in Servicing branch field of Application details
And Update the value in Sourcing type field of Application details
And Update the value in Sourcing office field of Application details
And Update the value in Reference type field of Application details
And Update the value in Reference code field of Application details
And Click on Save button of Application details

@ApplicationDetails_AppDataEntry_M1
Scenario: Validate that user can able to update the application details_App data entry
# This test case also cover the functionality of M2
Given Launch the kuls application and Navigate to Application details view list
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Update the value in Primary sub product field of Application details
And Update the value in Total finance amount requested field of Application details
And Update the value in Declared net income field of Application details
And Update the value in Declared current obligations field of Application details
And Update the value in Special promotion of Application details
And Update the value in Sourcing channel field of Application details
And Update the value in Business center code field of Application details
And Update the value in Servicing branch field of Application details
And Update the value in Sourcing type field of Application details
And Update the value in Sourcing office field of Application details
And Update the value in Reference type field of Application details
And Update the value in Reference code field of Application details
And Click on Save button of Application details
And Validate the Save successful popup of Application details

@ApplicationDetails_AppDataEntry_M3
Scenario: Validate that user can able to update the application details_App data entry under offering screen
Given Launch the kuls application and Navigate to Application details view list
And Navigate to Mail box of Application details and search the offering value
And Click on action icon of first record of application details_Offering value
#And Select Application details in the offering tab
And Update the value in Primary sub product field of Application details
And Update the value in Total finance amount requested field of Application details
And Update the value in Declared net income field of Application details
And Update the value in Declared current obligations field of Application details
And Update the value in Special promotion of Application details
And Update the value in Sourcing channel field of Application details
And Update the value in Business center code field of Application details
And Update the value in Servicing branch field of Application details
And Update the value in Sourcing type field of Application details
And Update the value in Sourcing office field of Application details
And Update the value in Reference type field of Application details
And Update the value in Reference code field of Application details
And Click on Save button of Application details
And Validate the Save successful popup of Application details

@ApplicationDetails_AppDataEntry_M4
Scenario: Negative validation of App data entry updation in application details
Given Launch the kuls application and Navigate to Application details view list
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Keep the required field values as blank
And Click on Save button of Application details
And Validate the field is required popup in Application details

@ApplicationDetails_AppDataEntry_M5
Scenario: Negative validation of App data entry updation in application details
Given Launch the kuls application and Navigate to Application details view list
And Navigate to Mail box of Application details and search the App data entry value
And Click on action icon of first record of application details_App data entry value
And Validate the fields present in the App data entry page
And Validate the Add button functionality
And Validate the View summary functionality in App data entry page


