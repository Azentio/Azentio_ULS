Feature: To verify the functionality of Add row and delete row button
@AT-DWD-003
Scenario: To verify the functionality of Add row and delete row button
Given User login as uls maker in transaction
And User click the inbox mail icon in Drawdown
And User search the record from the system in DrawDown
And User click the action edit icon in DrawDown
And User click the drawdown tab in drawdown
And User click the action edit icon under facility list in drawdown
And User verify the functionality of Add row button in drawdown
And User verify the functionality of Back button in drawdown
And User verify the functionality of Back button in drawdown
And User verify the functionality of Delete row button in drawdown
And User verify the current schedule section under drawdown screen

@AT-DWD-005
Scenario: To verify the functionality flow of DrawDown Details
Given User login as uls maker in transaction
And User click the inbox mail icon in Drawdown
And User search the record from the system in DrawDown
And User click the action edit icon in DrawDown
And User click the drawdown Details tab
And User click the action edit icon under facility list in drawdown
And User click the drawdown breakup edit button in drawdown details
And User click the add icon in drawdown details
And User enter the payment type in drawdown details
And User select the end beneficiary name in drawdown details
And User enter the original amount in drawdown details
And User enter the Paying currency in drawdown details
And User enter the payment mode in drawdown details
And User enter the proposed payment date in drawdown details
And User enter the disbursement a/c no in drawdown details
And User enter verification the Amount to be paid in drawdown details
And User verify the functionality of Save button with all invalid data in drawdown details
And User enter the Amount to be paid in drawdown details
And User verify the functionality of Save button with all valid data in drawdown details

@AT-DWD-006
Scenario: To verify the negative validation of the drawdown
Given User login as uls maker in transaction
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


