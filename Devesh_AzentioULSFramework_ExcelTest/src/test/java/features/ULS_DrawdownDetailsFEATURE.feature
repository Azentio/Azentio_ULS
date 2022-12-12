Feature: To test the drawdown details screen

@AT-DWD-006
Scenario: To verify the negative validation of the drawdown
#Given User login as uls maker in transaction
Given User launch the kuls application
And User Login as maker for transaction screen
Then select data set ID for Drawdown and Drawdown Details testcase006

And User click the inbox mail icon in Drawdown
And User search the record from the system in DrawDown
And User click the action edit icon in DrawDown
And User click the drawdown Details tab
And User click the action edit icon under facility list in drawdown
And User click the drawdown breakup edit button in drawdown details
And User click the add icon in drawdown details
And User enter the payment type in drawdown details
And User enter the end beneficiary name in drawdown details
And User enter the original amount in drawdown details
And User enter the Amount to be paid in drawdown details
And User enter the Paying currency in drawdown details
And User enter the payment mode in drawdown details
And User enter the proposed payment date in drawdown details
And User enter the disbursement a/c no in drawdown details
And User verify the functionality of Save button with all invalid data in drawdown details

@AT-DWD-007
Scenario: To verify drawdown breakup screen should 
#Given navigate to uls application 
#And login with maker credentials
Given User launch the kuls application
And User Login as maker for transaction screen
Then select data set ID for Drawdown and Drawdown Details testcase007
And User click the inbox mail icon in Drawdown
And User search the record from the system for DrawDown records
And User click the action edit icon in DrawDown
#Then  Click the inbox in in beneficiary details
#And Click the search button in beneficiary detail
#Then Enter as disbursement maker in the search bar in beneficiary detail
#And enter the draw down record reference number
#And Click the disbursement maker first action icon in beneficiary detail
And click on drawdown details tab
And click on list view first record on drawdown details
And click on edit button in drwdownBreakup
And click on add button in drawdown break up list view
Then verify when user click on add button new record user can able to add
Then check when user add any drawdownbreak up list view new row might be added
Then verify when user click on minus button that row will be deleted
Then verify the functionality of add button
Then verify the functionality of back button