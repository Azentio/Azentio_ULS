Feature: Check the functionality of Report Master
 	
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