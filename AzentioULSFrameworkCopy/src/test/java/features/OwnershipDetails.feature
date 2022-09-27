Feature: Check the functionality of Collateral Layout Ownership Layout screen
 	
  @AT_CLOL_001
  Scenario: Verify the functionality of fields of Customer Address Details screen
		Given User launch the kuls application
		And User Login as maker
  	Then user should click on the menuu toggle
  	Then click on inbox to search for the Ownership Details record
  	Then click on search button to search the record of Ownership Details
  	Then enter the reference id of the Ownership Details record
  	Then click on the entitle button of the Ownership Details record of that reference id
  	Then verify the availability of Ownership layout in system
  	Then verify ownership layout screen should get open with all valid fields in proper format with back and save button
  	Then verify the functionality of back button in ownership details screen
  
  
  
  
  
  