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