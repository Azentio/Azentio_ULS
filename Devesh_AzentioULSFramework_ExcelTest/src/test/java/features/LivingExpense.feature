Feature: Check the functionality Living Expense
 	
  @AT_LE_031
  Scenario: Verify the functionality of Approve button at Checker stage
		Given User launch the kuls application
		And User Login as checker to approve living expenses location modified record
		Then select data set ID for living expense testcase031
  	Then click on inbox button to select the living expenses location record
  	Then select the record of living expenses location to approve
  	Then select approve button for approve the living expenses location record
  	Then enter remark for approve the living expenses location record
  	Then click on approve button of the living expenses location record
  	Then system should display confirmation message after approve the living expenses location record
  	Then logout from checker user
  	And User Login as maker
  	Then user should navigate to living expense
  	And click on approved records button of living expense
  	Then verify all the captured data of living expenses location record from makers side should be saved and stored in the system
  	
  	@AT_LE_032
  Scenario: Verify the functionality of Reject button at Checker stage
		Given User launch the kuls application
		And User Login as checker to reject living expenses location modified record
		Then select data set ID for living expense testcase032
  	Then click on inbox button to select the living expenses location record
  	Then select the record of living expenses location to reject
  	Then select reject button for reject the living expenses location record
  	Then enter remark for reject the living expenses location record
  	Then click on reject button of the living expenses location record
  	Then system should display confirmation message after reject the living expenses location record
  	Then logout from checker user
  	And User Login as maker
  	Then user should navigate to living expense
  	And click on approved records button of living expense
  	Then verify all the captured data of living expenses location record from makers side should not be saved and stored in the system
  	
  	@AT_LE_033
  Scenario: Verify the functionality of Return button at Checker stage
		Given User launch the kuls application
		And User Login as checker to Return living expenses location modified record
		Then select data set ID for living expense testcase033
  	Then click on inbox button to select the living expenses location record
  	Then select the record of living expenses location to Return
  	Then select Return button for Return the living expenses location record
  	Then enter remark for Return the living expenses location record
  	Then click on Return button of the living expenses location record
  	Then system should display confirmation message after Return the living expenses location record
  	Then logout from checker user
  	And User Login as maker
  	Then user should navigate to living expense
  	And click on approved records button of living expense
  	Then verify all the captured data of living expenses location record from makers side should be returned and stored in the system
  	
  	@AT_LE_034 @LivingExpense_M34
Scenario: To verify list view functionality of approved records in living expense location
#Given Get the URL and login as maker  
#And Click the configuration
Given User launch the kuls application
And User Login as maker
And user should navigate to living expense
Then Click the Eye icon of the living expense
Then click the pencil icon in living expense
And Click the living expense location tab
And To verify the functionality of Add button in Living Expense
And To verify the functionality of Search box with matching data in Living Expense location
Then To verify the functionality of Search box with mismatch data in Living Expense location
And To verify the functionality of Export to PDF button in Living Expense location
Then To verify the functionality of Export to Excel button in Living Expense location
  	
  	
  	
  	
  	