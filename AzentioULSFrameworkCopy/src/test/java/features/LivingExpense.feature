Feature: Check the functionality Living Expense
 	
  @AT_LE_031
  Scenario: Verify the functionality of Approve button at Checker stage
		Given User launch the kuls application
		And User Login as checker to approve living expenses location modified record
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
  	