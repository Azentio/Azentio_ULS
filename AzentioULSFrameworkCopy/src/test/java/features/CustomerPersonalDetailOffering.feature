Feature: Check the functionality of Personal Detail Offering Stage
 	
  @AT_PDO_002
  Scenario: Verify the functionality of customer details list view
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on menu to open the sidebar
  	Then click on inbox to search for the personal detail offering record
  	Then click on search button to search the record of personal detail offering
  	Then enter the reference id of the personal detail offering record
  	Then click on the entitle button of the record of that reference id
  	Then click on the customer details tab in customer personal information screen
  	Then verify system should display mention fields of customer details list view
  	Then system should verify the values in the list view should be in read only mode
  	Then verify the functionality of the back button in the personal detail offering stage
  	
  	