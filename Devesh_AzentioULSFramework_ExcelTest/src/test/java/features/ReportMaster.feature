Feature: Check the functionality of Report Master
 	
 	
 	@AT_RA_006
  Scenario: To verify system allow user to modify the Report Master before approve the record
		Given User launch the kuls application
		And User Login as maker
  	Then user should navigate to report master
  	And click on work in progress records button of report master
		Then click on add button to create new record of report master
		Then Fill all valid fields in the report master screen for approve the record
  	Then verify system display the confirmation message in the report master screen post clicking on save button
  	Then confirmation message displays in the report master screen with reference id
  	Then click on inbox button to select the record of report master
  	And select the record of report master from inbox to submit
  	Then verify the field status is non mandatory in report master
  	Then verify system allow user to modify the report master record before approve the record
  	Then verify system display the confirmation message in the report master screen post clicking on save button
		Then verify the functionality of back button in report master screen
			
  @AT_RA_007
  Scenario: To verify system allow user to do a modification on already approved record
		Given User launch the kuls application
		And User Login as maker
  	Then user should navigate to report master
  	And click on approved records button of report master
  	Then click on edit button of report master record to modify
  	Then verify system allow user to do a modification on already approved report master record
  	Then verify system display the confirmation message in the report master screen post clicking on save button
  	Then confirmation message displays in the report master screen with reference id
  	Then click on inbox button to select the record of report master
  	And select the record of report master from inbox to submit
  	Then click on submit button to submit the record of report master
  	Then system should display confirmation message after submit report master record
  	Then capture checker ID of report master
  	Then logout user from maker stage
  	
  	And User Login as checker to approve report master record
  	Then click on inbox button to select the record of report master
  	Then select the record of report master to approve
  	Then select approve button for approve the report master record
  	Then enter remark for approve the record of report master
  	Then click on approve button of the report master record
  	Then system should display confirmation message after approve the report master record
  	Then logout user from checker stage
  	And User Login as maker
  	Then user should navigate to report master
  	And click on approved records button of report master
  	Then verify all the captured modified data of report master from makers side should be saved and stored in the system
		
	@AT_RA_017
  Scenario: To verify system allow user to modify the Report Parameter Detail before approve the record
		Given User launch the kuls application
		And User Login as maker
  	Then user should navigate to report master
  	And click on work in progress records button of report master
		Then click on add button to create new record of report master
		Then Fill all valid fields in the report parameter detail screen for approve the record
  	Then verify system display the confirmation message in the report parameter detail screen post clicking on save button
  	Then confirmation message displays in the report parameter detail screen with reference id
  	Then click on inbox button to select the record of report parameter detail
  	And select the record of report parameter detail from inbox to submit
  	Then verify the field status is non mandatory in report parameter detail
  	Then verify system allow user to modify the report parameter detail record before approve the record
  	Then verify system display the confirmation message in the report parameter detail screen post clicking on save button
		Then verify the functionality of back button in report parameter detail screen
  @AT_RA_023
  Scenario: To verify user should not able to create the Report Master record with invalid input
		Given User launch the kuls application
		And User Login as maker
  	Then user should navigate to report master
  	And click on work in progress records button of report master
		Then click on add button to create new record of report master
		Then user should navigate to report group master
		Then click on add button to create new record of report group master
		Then verify system should show proper validation message for blank field of report master record which is mandatory 
#		Then verify system should show proper validation message when user enter numeric value in character field of report master record
#		Then verify system should show proper validation message when user enter character value in numeric field of report master record
		Then verify system should show proper validation message when user enter only special characters value in any field of report master record
  
  
  @AT_RA_031
  Scenario: Verify the functionality of List view of Report Group Master
		Given User launch the kuls application
		And User Login as maker
  	Then user should navigate to report master
  	And click on work in progress records button of report master
		Then click on add button to create new record of report master
		Then user should navigate to report group master
  	Then verify search box should display matching record with matched data in report group master
  	Then verify search box should not display any record with mismatched data in report group master
  	Then click on export to pdf button system should download Pdf file in report group master
  	Then click on export to excel button system should download Excel file in report group master
  #	Then verify the functionality of Group header ID field system should display Group header ID number of that record
		Then verify the functionality of group name field system should display Group name of that record
		Then verify the functionality of Description field system should display Description of that group master record
		Then verify the functionality of Status field system should display Status of that group master record