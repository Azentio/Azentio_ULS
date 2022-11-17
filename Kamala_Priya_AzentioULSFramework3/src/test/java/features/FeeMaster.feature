
Feature: To verify the functionality of fee master
#(Fee_01_01,Fee_01_02,Fee_01_03,Fee_01_05,Fee_01_06,Fee_01_07,Fee_01_08,Fee_01_09,Fee_01_10,Fee_01_11,Fee_01_16,Fee_01_17,Fee_01_18,
#Fee_01_19,Fee_01_20,Fee_01_21,Fee_01_22,Fee_01_23,Fee_01_24,Fee_01_25,Fee_01_26)
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

#(Fee_02_01,Fee_02_02,Fee_02_03,Fee_02_04)
@FeeMaster_M2
Scenario: To verify user is able save the record with invalid and blank field in Fee Master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the eyeicon of the fee master
Then Click the add button in fee master
And Verify the fee master with invalid data
Then save the record in tax master detail
And Click the eyeicon of the fee master
Then Click the add button in fee master
Then save the record in tax master detail
And Verify the fee master with blank field
And Verify the back button

#(Fee_03_01,Fee_03_02,Fee_03_03,Fee_04_01)
@FeeMaster_M3
Scenario: To verify user is able activate and inactivate the record in Fee Master
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
Then Click the temp view button in fee master
And Click the tempview pencil icon in fee master
Then Change the status in a fee master
Then update the record in fee master
And Click the tempview pencil icon in fee master
Then Change the status in a fee master
Then update the record in fee master
And Click the tempview pencil icon in fee master
#And Verify the back button

 