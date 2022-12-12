Feature: Check the functionality of Asset Collateral Type Master
 	
  # ACT_01_01, ACT_01_02, ACT_01_03, ACT_01_04, ACT_01_05, ACT_01_06, ACT_01_07, ACT_01_08
  # ACT_01_09, ACT_01_10, ACT_01_15, ACT_01_16,
  
  @ACT_T001
  Scenario: Validation of input fields of collateral type(Maker Stage)
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for asset collateral type testcase001
  	Then user should navigate to asset collateral config
  	And click on view button of asset collateral config
  	Then click on add button to create new record of asset collateral config
  	Then verify the Asset Collateral type screen is getting open with all valid fields
  	Then verify the description field should be editable mandatory and multilingual
  	Then verify the field asset collateral type code should be mandatory editable and unique code
  	Then verify the field Asset Collateral category should be mandatory and editable
  	
  #	Then verify the field Asset Collateral category should display the list of only active and approved records
  	
  	Then verify the field Module should be mandatory editable dropdown should show the list of modules
  	Then verify the field IFRS should be non mandatory and editable dropdown should show yes or no
  	Then verify the field haircut percent should be mandatory editable and upto 4 decimal places allowed
  	Then verify the field Remarks should be mandatory and editable textarea
  	Then verify system display the confirmation message post clicking on save button
  	Then verify the functionality of back button of collateral type
  
  # ACT_01_11, ACT_01_12, ACT_06_1, - Approve
  @ACT_T002
  Scenario: Approving the record from the checker stage
  # Creation of record to approve
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for asset collateral type testcase002
  	Then user should navigate to asset collateral config
  	And click on view button of asset collateral config
  	Then click on add button to create new record of asset collateral config
  	Then Fill all valid fields in the screen for approve the record
  	Then verify system display the confirmation message post clicking on save button
  	Then confirmation message displays with reference id
  	Then click on inbox button to select the record of collateral type
  	And select the record of collateral type from inbox to submit
  	Then click on submit button to submit the record of collateral type
  	Then system should display confirmation message after submit collateral type record
  	Then capture checker ID of collateral type
  	Then logout user from maker stage
  
  #	Approve the record from checker
  	And User Login as checker to approve collateral type record
  	Then click on inbox button to select the record of collateral type
  	Then select the record of collateral type to approve
  	Then select approve button for approve
  	Then verify remark field is mandatory
  	Then enter remark for approve the record of collateral type
  	Then click on approve button of the collateral type record
  	Then system should display confirmation message after approve the collateral type record
  	Then logout user from checker stage
  	And User Login as maker
  	Then user should navigate to asset collateral config
  	And click on view button of asset collateral config
  	Then verify all the captured data from makers side should be saved and stored in the system
  	
  # ACT_01_13, AC_06_2 - Reject
  	@ACT_T003
  	Scenario: Reject the record from the checker stage
  # Creation of record to reject
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for asset collateral type testcase003
  	Then user should navigate to asset collateral config
  	And click on view button of asset collateral config
  	Then click on add button to create new record of asset collateral config
  	Then Fill all valid fields in the screen for reject the record
  	Then verify system display the confirmation message post clicking on save button
  	Then confirmation message displays with reference id
  	Then click on inbox button to select the record of collateral type
  	And select the record of collateral type from inbox to submit
  	Then click on submit button to submit the record of collateral type
  	Then system should display confirmation message after submit collateral type record
  	Then capture checker ID of collateral type
  	Then logout user from maker stage
  	
  #	Reject the record from checker
  	And User Login as checker to reject collateral type record
  	Then click on inbox button to select the record of collateral type
  	Then select the record of collateral type to reject
  	Then select reject button to reject the record
  	Then verify remark field is mandatory
  	Then enter remark for reject the record of collateral type
  	Then click on reject button of the collateral type record
  	Then system should display confirmation message after reject the collateral type record
  	Then logout user from checker stage
  	And User Login as maker
  	Then user should navigate to asset collateral config
  	And click on view button of asset collateral config
  	Then verify all the captured data from makers side should not be saved and stored in the system
  	
  # ACT_01_14, ACT_06_3, ACT_06_4	- Return
  @ACT_T004
  Scenario: Return the record from the checker stage
  # Creation of record to return
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for asset collateral type testcase004
  	Then user should navigate to asset collateral config
  	And click on view button of asset collateral config
  	Then click on add button to create new record of asset collateral config
  	Then Fill all valid fields in the screen for return the record
  	Then verify system display the confirmation message post clicking on save button
  	Then confirmation message displays with reference id
  	Then click on inbox button to select the record of collateral type
  	And select the record of collateral type from inbox to submit
  	Then click on submit button to submit the record of collateral type
  	Then system should display confirmation message after submit collateral type record
  	Then capture checker ID of collateral type
  	Then logout user from maker stage
  	
  #	Return the record from checker
  	And User Login as checker to return collateral type record
  	Then click on inbox button to select the record of collateral type
  	Then select the record of collateral type to return
  	Then select return button to return the record
  	Then verify remark field is mandatory
  	Then enter remark for return the record of collateral type
  	Then click on return button of the collateral type record
  	Then system should display confirmation message after return the collateral type record
  	Then logout user from checker stage
  	And User Login as maker
  	Then user should navigate to asset collateral config
  	And click on temp view button of asset collateral config
  	Then verify all the captured data from makers side should be moved back and stored in the maker stage
  	
  @ACT_T005
	Scenario: To verify user should not able to create the asset collateral type record with invalid input
#		Given Navigate to ULS application URL
#		Then login with valid maker credentials
#		And go to configuration main menu
#		And click on asset collateral config menu
		Given User launch the kuls application
		And User Login as maker
		Then select data set ID for asset collateral type testcase005
  	Then user should navigate to asset collateral config
		Then click on asset collateral type view button
		And click on add button in asset collateral 
		And click on save button in asset collateral type
		Then verify system should show the validation for the invalid fields
		Then verify system should not allow to save the record when user enter numbers in all the text box
		Then verify user not able to enter charecters in numeric field
		Then verify system should not allow user to create the record with special characters


  # "ACT_03_01, ACT_03_02, ACT_03_04, ACT_03_06, ACT_03_09, ACT_03_10, ACT_03_11, ACT_03_19, 
  #  ACT_03_20, ACT_03_21, ACT_03_22, ACT_03_23"
  @ACT_T006
  Scenario: Collateral Type Master - Modification of Asset Collateral type record before approved record
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for asset collateral type testcase006
  	Then user should navigate to asset collateral config
  	And click on temp view button of asset collateral config
  #	Then click on edit button of collateral type record to modify
  	Then click on add button to create new record of asset collateral config
  	Then Fill all valid fields in the screen for approve the record
  	Then verify system display the confirmation message post clicking on save button
  	Then confirmation message displays with reference id
  	Then click on inbox button to select the record of collateral type
  	And select the record of collateral type from inbox to submit
  #	Then verify the buttons available on screen while modify the Asset Collateral type
  #----	modify Before Approved Record
  	Then verify system allow user to modify the Asset Collateral type before approve the record
  	Then verify system display the confirmation message post clicking on save button
  	
  #----	modify Already Approved Record 
  #	And click on view button of asset collateral config
  #	Then click on edit button of collateral type record to modify
  #	Then verify system allow user to do a modification on already approved asset collateral type record
  #	Then verify system display the confirmation message post clicking on save button
  	
 	@ACT_T007
  Scenario: Collateral Type Master - Modification of Asset Collateral type approved record 
  									and re-approve the same also verify the functionality of approved button
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for asset collateral type testcase007
  	Then user should navigate to asset collateral config
  	#----	modify any Already Approved Record 
  	And click on view button of asset collateral config
  	Then click on edit button of collateral type record to modify
  	Then verify system allow user to do a modification on already approved asset collateral type record
  	Then verify system display the confirmation message post clicking on save button
  	Then confirmation message displays with reference id
  	Then click on inbox button to select the record of collateral type
  	And select the record of collateral type from inbox to submit
  	
  	Then click on submit button to submit the record of collateral type
  	Then system should display confirmation message after submit collateral type record
  	Then capture checker ID of collateral type
  	Then logout user from maker stage
  	
  # ----Re-Approving	
  	And User Login as checker to approve collateral type record
  	Then click on inbox button to select the record of collateral type
  	Then select the record of collateral type to approve
  	Then select approve button for approve
  	Then verify remark field is mandatory
  	Then enter remark for approve the record of collateral type
  	Then click on approve button of the collateral type record
  	Then system should display confirmation message after approve the collateral type record
  	Then logout user from checker stage
  	And User Login as maker
  	Then user should navigate to asset collateral config
  	And click on view button of asset collateral config
  	Then verify all the captured modified data from makers side should be saved and stored in the system
  	
  #	Then verify the impact when user modify any approved record and re approve the same
  #	Then verify while modification system allow user to save the record with valid data
  #	Then verify system display the confirmation message post clicking on save button
  #	Then verify the functionality of Submit button at Maker stage
  #	Then verify system display the confirmation message post clicking on Submit button at Maker stage
  
  #	--
  #	And User Login as a checker user
  #	Then click on inbox button to select the asset collateral type record
  #	Then click on action button of modified asset collateral type record
  #	Then click on approve button of asset collateral type record
  #	Then enter the remarks for modified asset collateral type record
  #	Then click on approve button verify the modified record should get approve from the system 
  #	Then verify system display the confirmation message post clicking on Approve button at Checker stage
  #	Then checker user logout from the uls application
  #	
  #	And User Login as maker
  #	Then user should navigate to asset collateral config
  #	And click on view button of asset collateral config
  #	And verify the approved record should display in approved list view
  	
  	
 	# ACT_03_07, ACT_03_08
  @ACT_T008
  Scenario: Collateral Type Master - To verify while modification, when user keep any mandatory field blank
  																	 system enters the invalid data (Invalid data types) and click on save button
  																	 (system should show proper validation message)
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for asset collateral type testcase008
  	Then user should navigate to asset collateral config
  	And click on view button of asset collateral config
  	Then click on edit button of record to modify in collateral type
  	Then verify proper validation message for blank field should display in collateral type
  	Then verify system should not allow to enter invalid datatypes while modification in collateral type
 
	@ACT_T009
  Scenario: Collateral Type Master - Modification of Asset Collateral type approved record 
  									and reject the same record
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for asset collateral type testcase009
  	Then user should navigate to asset collateral config
  	#----	modify any Already Approved Record 
  	And click on view button of asset collateral config
  	Then click on edit button of collateral type record to modify
  	Then verify system allow user to do a modification on already approved asset collateral type record
  	Then verify system display the confirmation message post clicking on save button
  	Then confirmation message displays with reference id
  	Then click on inbox button to select the record of collateral type
  	And select the record of collateral type from inbox to submit
  	Then click on submit button to submit the record of collateral type
  	Then system should display confirmation message after submit collateral type record
  	Then capture checker ID of collateral type
  	Then logout user from maker stage
  	
  #	--Reject the modified record
  	And User Login as checker to reject collateral type record
  	Then click on inbox button to select the record of collateral type
  	Then select the record of collateral type to reject
  	Then select reject button to reject the record
  	Then verify remark field is mandatory
  	Then enter remark for reject the record of collateral type
  	Then click on reject button of the collateral type record
  	Then system should display confirmation message after reject the collateral type record
  	Then logout user from checker stage
  	And User Login as maker
  	Then user should navigate to asset collateral config
  	And click on view button of asset collateral config
  	Then verify all the captured modified data from makers side should not be saved and stored in the system
  	
  @ACT_T010
  Scenario: Collateral Type Master - Modification of Asset Collateral type approved record 
  									and return the same record
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for asset collateral type testcase010
  	Then user should navigate to asset collateral config
  #---	modify any Already Approved Record 
  	And click on view button of asset collateral config
  	Then click on edit button of collateral type record to modify
  	Then verify system allow user to do a modification on already approved asset collateral type record
  	Then verify system display the confirmation message post clicking on save button
  	Then confirmation message displays with reference id
  	Then click on inbox button to select the record of collateral type
  	And select the record of collateral type from inbox to submit
  	Then click on submit button to submit the record of collateral type
  	Then system should display confirmation message after submit collateral type record
  	Then capture checker ID of collateral type
  	Then logout user from maker stage
  	
  #--- Return the modified record
  	And User Login as checker to return collateral type record
  	Then click on inbox button to select the record of collateral type
  	Then select the record of collateral type to return
  	Then select return button to return the record
  	Then verify remark field is mandatory
  	Then enter remark for return the record of collateral type
  	Then click on return button of the collateral type record
  	Then system should display confirmation message after return the collateral type record
  	Then logout user from checker stage
  	And User Login as maker
  	Then user should navigate to asset collateral config
  	And click on temp view button of asset collateral config
  	Then verify all the captured modified data from makers side should be moved back and stored in the maker stage	
  	
  @ACT_T011
  Scenario: Collateral Type Master - To verify the functionality of list view approved records
  	Given User launch the kuls application
  	And User Login as maker
  	Then select data set ID for asset collateral type testcase011
  	Then user should navigate to asset collateral config
  	And click on view button of asset collateral config
  	Then verify collateral type master list view fields should display all the fields
  	Then values in list view should not be editable in list of asset collateral type screen
  	Then verify add button should allow to create new record in collateral type master
  	Then verify search box should display matching record with matched data in collateral type
  	Then verify search box should not display any record with mismatched data in collateral type
  	Then click on export to pdf button system should download Pdf file in collateral type
  	Then click on export to excel button system should download Excel file in collateral type
  	
  	Then system should show Asset collateral category description field and the field will display only
  	Then system should show Authorization status field and the field will display only
  	
@AssetCollateralType_M12
Scenario: To verify the Asset Collateral Type List view of WIP records
Given User launch the kuls application
And User Login as maker
Then select data set ID for asset collateral type testcase012
#And Click the configuration in collateral type
#Then click the Asset colllaral config
Then user should navigate to asset collateral config
And Click the temp view button in collateral type
Then To verify the Asset Collateral Type List view in collateral type
Then To verify the functionality of Search box with matching data in collateraltype master
Then To verify the functionality of Search box with unmatching data in collateraltype master
And To verify the functionality of Export to PDF button in collateraltype master
Then To verify the functionality of Export to Excel button in collateraltype master
And To verify the field asset collateral category description

@AssetCollateralType_M13
Scenario: To verify the Asset Collateral Type view workflow
Given User launch the kuls application
And User Login as maker
Then select data set ID for asset collateral type testcase013
#And Click the configuration in collateral type
#Then click the Asset colllaral config
Then user should navigate to asset collateral config
And Click the temp view button in collateral type
Then Click the inbox in collateral type master
Then Search the record in collateral type master
And Click the action icon in the collateral type master
Then Click the view summary button in collateral type master
Then To verify the view workflow in the collateral type master
  	
  	
  	

  	
  	
  	
  	
  	