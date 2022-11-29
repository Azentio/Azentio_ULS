Feature: To Test the allocation master screen
@AT-ALM-007
Scenario: User verify system allow user to modify the Allocation Master
Given Launch the kuls application and Navigate to Allocation master module view list
And User click Approved list icon for Allocation Master
And User click First Edit icon in Approved list view for Allocation Master
And User click back button in Alloction master screen
And User click First Edit icon in Approved list view for Allocation Master
And User click and update Description
And User click and update Allocation Code
And User click Save button for Allocation master updation 
And user click inbox to approve record for Allocation master
And user search Allocation Master
And user store reference number and click the first record in Allocation master inbox view
And user submit Allocation master record in maker
And User Capture Checker id from the submit popup
@AT-ALM-009
Scenario: To verify checker user can able to approve the updated allocation master record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on approve button to approve the record
And enter the remark in alert tab 
And click on approve button in alert box
Then verify record is approved in checker stage 
@AT-ALM-010
Scenario: To verify checker user can able to rejected the updated allocation master record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on reject button to reject the record
And enter the remark in alert tab fo rejection
And click on reject button in alert box
Then verify record is rejected in checker stage 
@AT-ALM-011
Scenario: To verify checker user can able to return the updated allocation master record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on return button to return the record
And enter the remark in alert tab fo return
And click on return button in alert box
Then verify record is return in checker stage
@Allocation_Master_M15
Scenario: To verify and validate the functionalities of work in progress
Given Navigate the URl and login as a maker
Then select the LOS 
And Click the configuration
Then Click the config Manager
And Click the temp view of the alloction master
And Update test data for Allocation master test case no fifteen
And Verify the functionality of add button in allocation master
Then Verify the values in the list view is not editable in allocation master
Then To verify the functionality of Search box with matching data in alloction master list view
And To verify the functionality of Search box with mismatch data in allocation master in list view
Then To verify the functionality of Export to PDF button in allocation master in list view
And To verify the functionality of Export to Excel button in allocation master list view