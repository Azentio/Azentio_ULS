
Feature: To verify the functionality of fee master
@AT-FM-T005
Scenario: To verify user is able to update WIP fee master record 
Given Get the URL and login as maker
And Update test data for fee master test case no5
And Click the configuration
Then Click the config Manager
And Click on Temp view of Fee master
And Click on Pencil icon of the record
And Update the value in desription field
And Update the value in Charge type field
And Update the value in charge flag field
#And Update the value in Due code field
And Update the value in Legacy code1
And Update the value in Legacy code2
And Update the value in GST applicable state
And click the is tax allowed button
And update the value in tax calculation method field
And click the include in apr button
And Update the value in Amortize field
And Update the value in Deduct field
And Update the value in upfront field
And Update the value in amort rate method field
And Update the value in fee amort tenure method field
And Update the value in charge amount recovery field
And Update the value in fee amort frequency field
And Update the value in Remarks field
And Click on Save icon to update Fee master record
#Then Save the record in charge tab

@AT-FM-T006
Scenario: To verify user is able to update already approved fee master record 
Given Get the URL and login as maker
And Update test data for fee master test case no5
And Click the configuration
Then Click the config Manager
And Click the eyeicon of the fee master
And Click on Pencil icon of the record
And Update the value in desription field
And Update the value in Charge type field
And Update the value in charge flag field
#And Update the value in Due code field
And Update the value in Legacy code1
And Update the value in Legacy code2
And Update the value in GST applicable state
And click the is tax allowed button
And update the value in tax calculation method field
And click the include in apr button
And Update the value in Amortize field
And Update the value in Deduct field
And Update the value in upfront field
And Update the value in amort rate method field
And Update the value in fee amort tenure method field
And Update the value in charge amount recovery field
And Update the value in fee amort frequency field
And Update the value in Remarks field
And Click on Save icon to update Fee master record
#Then Save the record in charge tab


@AT-FM-T011
Scenario: To verify user can navigate to view workflow functionality
Given Get the URL and login as maker
And Update test data for fee master test case no5
And Click the configuration
Then Click the config Manager
Then Click the temp view button in fee master
And Click on Pencil icon of the record
Then Change the status in a fee master
And Click on Save icon to update Fee master record
And Click on Pencil icon of the record
Then Change the status in a fee master
And Click on Save icon to update Fee master record
And Click on Pencil icon of the record
And Verify the back button
And Click on Pencil icon of the record
And Validate the view summary of Fee master
 






 