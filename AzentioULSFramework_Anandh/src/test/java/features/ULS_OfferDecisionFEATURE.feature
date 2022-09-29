Feature: To Test the offer decision screen
Scenario: To Verify offer decesion screen should be non non editable one and user can able to create the offer deciosion record with valid data
Given navigate to uls application url and login with valid user ID
And click on mail box to select the l1App stage Record
And select the perticular record from mail box for offer decision screen
And select the offer decision tab
And click on edit button under offer decision list view record
Then verify product field under facility details should be non editable
Then verify sub product field under facility details should be non editable
Then verify scheme field under facility details should be non editable
Then verify pricing indicator field under facility details should be non editable
Then verify repayment type field under facility details should be non editable
Then verify compute instalment on field under facility details should be non editable
Then verify Principal frequency field under facility details should be non editable
Then verify interst frequency field under facility details should be non editable
Then verify Eligibilty type field should be non editable under eligibility details 
Then verify Eligibilty amount field should be non editable under eligibility details 
Then verify Eligibilty field should be non editable under eligibility details
Then verify Eligibilty percentage field should be non editable under eligibility details
Then verify currency field should be non editable under eligibility details
Then verify Actual Percentage field should be non editable under eligibility details
Then verify Deviation level field should be non editable under eligibility details
Then verify requested amount field should be non editable under finace configuration
Then verify requested tenure field should be non editable under finace configuration
Then verify Offered amount field should be non editable under finace configuration
Then verify Offered tenure field should be non editable under finace configuration
Then verify deviation amount field should be editable under finace configuration
Then verify deviation tenure field should be editable under finace configuration
And clear the input from the deviation field text boxes
And click on save button to save the offer decision record
And select the record from the notification area
And go to the offer decision screen
Then verify offered tenure should be matched with before saving
And enter the deviatuion amount
And enter the deviation tenure
And click on save button to save the offer decision record
And select the record from the notification area
And go to the offer decision screen
Then click on deviate button to verify deviation amount and tenure should get deviated
