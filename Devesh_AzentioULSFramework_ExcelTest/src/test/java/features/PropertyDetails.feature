Feature: Check the functionality of Property Details screen
 	
  @AT_PD_006
  Scenario: Verify the functionality of Activate/Deactivate button of Property Details screen
		Given User launch the kuls application
		And User Login as maker
		Then select data set ID for property details testcase006
  	Then user should click on the menu toggle from maker stage
  	Then click on inbox to search for the Property Details record
  	Then click on search button to search the record of Property Details in inbox
  	Then enter the reference id of the Property Details record
  	Then click on the entitle button of the Property Details record of that reference id
  	Then click on the Property Details tab
  	Then open the active record of Property Details to modify
  	Then click on status toggle button under property details to deactive
  	Then click on update button under property details
  	Then verify on clicking toggle button system should allow user to change the status of the record to Deactivate
  	Then open the deactive record of Property Details to modify
  	Then click on status toggle button under property details to deactive
  	Then click on update button under property details
  	Then verify on clicking toggle button system should allow user to change the status of the record to Activate
  #	Then verify the Label on button if the status of property details record is Active
  #	Then verify the Label on button if the status of property details record is Deactive
		Then verify the functionality of Back button on property details screen
		
		
		
		
		
		
		