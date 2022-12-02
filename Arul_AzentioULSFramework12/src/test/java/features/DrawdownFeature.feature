Feature: To test the drawdown screen
@AT-DW-001
Scenario: To verify drawdown screen should be read only mode and can able to save the record
Given Launch the kuls application
And User Login as maker
And Navigate to Mail box
And Sarch the value in Mail box for drawdown
And Click on action icon of first record in drawdown
And Navigate to Drawdown tab
And click on list view first record on drawdown details
Then verify Facility details section should be available 
Then verify All payment hyper link section is available or not
Then verify schedule details list section is available or not
Then verify payment details list section is available or not
Then verify product field should be non editable under facility details section
Then verify sub product field should be non editable under facility details section
Then verify scheme field should be non editable under facility detials section
Then verify saction date field should be non editable under facility details section
Then verify last disbursement date field should be non editable under facility details section
Then verify is tranche allowed field should be non editable under facility details section
Then verify Sanction amount field should be non editable under facility details section
Then verify disbursement amount field should be non editable under facility details section
Then verify current disbursement field should be non editable under facility details section
Then verify available amount field should be non editable under facility details section
And Click on Add icon in Payment details
And Select the value in Payment type field
And Enter the value in Payee field
And Enter the value in planned scheduled disbursement balance field
And Enter the value in schedule amount field
And Click on Save button in Payment details
