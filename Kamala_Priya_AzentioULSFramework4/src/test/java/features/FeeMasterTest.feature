Feature: User create the Fee Master details
@FeeMaster_M1
Scenario: To verify user is able to add new Fee record in Fee Master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the eyeicon of the fee master
Then Click the add button in fee master
And then print the fields avilable in charge tab
Then To verify the red astriek mark on all the mandatory fields in fee master
Then Check the functinality of charge description in charge tab
And Select the charge type in charge tab
Then select the charge flag in charge tab
And select the Due code in charge tab
Then Enter the legacy code1
And Enter the legacy code2
Then Choose the GST applicable state
And click the is tax allowed button
Then select the tax calculation method
 And click the include in apr button
Then choose the amortize field in charge tab
And choose the deduct field in charge tab
Then select the upfront filed in charge tab
And Select the amort rate method
Then Choose the fee amort tenure method
And Select the charge amount recovery
Then Choose the fee amort frequency 
#And enter the remark in charge tab
Then Save the record in charge tab
#And Click the action icon in charge tab
#Then click the tax page
#And print the fields available in charge tax master detail
#Then choose the field in avilable and tranfer to selected 
#And Enter the remark in charge tax master detail
#Then save the record in tax master detail
#And Verify the back button in tax fee master

@FeeMaster_M7
Scenario: To verify user able to save the modified record with blank and invalid details
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the temp view in the fee master
Then Choose the data set id for fee master negative vlaidation
Then Chooose the First record in the fee master for modification
And Click the legacy code1 and pass the invalid details
Then Verify the invalid field validation popup in the fee master
And Click the charge type and make that field as blank in fee master
Then Verify the balank field validation popup in the fee master
@FeeMaster_M8
Scenario: To verify Checker user is able to Approve the record
And choose the data set id for checker approval in Fee master
Given Get the URL and login as Checker to approve the record in charge master
#Then Click the menu icon in deposit account
And Click  the inbox in checker
Then Search the record in serch field in checker stage for approve
Then search the reference id and click the respective action icon in fee master
And Click the approve button
Then Enter the alert approve remark
And Give the final approve
Then Verify the record get approved

@FeeMaster_M9
Scenario: To verify Checker user is able to Return the record
Then Choose the data set id to return in charge master
Given Get the URL and login as Checker to return the record in Fee master
#Then Click the menu icon in deposit account
And Click  the inbox in checker deposit account
Then Search the record in serch field in checker stage for return in Fee master
And Click the return button 
Then Enter the alert return remark 
And Give the final return 
Then Verify the record get returned

@FeeMaster_M10
Scenario: To verify Checker user is able to Reject the record   
And choose the data set id for checker approval in Fee master
Given Get the URL and login as Checker to reject the record in charge master
#Then Click the menu icon in deposit account
And Click  the inbox in checker deposit account
Then Search the record in serch field in checker stage for rejection
Then search the reference id and click the respective action icon in fee master
And Click the reject button
Then Enter the alert reject remark
And Give the final reject
Then Verify the record get rejected
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
 
