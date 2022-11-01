Feature: Check the functionality of Asset auto master
#AAM_01_001,AAM_01_002,AAM_01_009,AAM_01_011,AAM_01_012,AAM_01_013,AAM_01_014,AAM_01_015
@AT-AAM-T001
Scenario: creation of Asset Auto with valid details
Given User login as uls maker in asset CD master
When user click the configuration menu for asset auto creation
And User click the config manager in Bounce master
And user click asset auto edit icon
And User click add icon for asset auto master
And User verify asset auto master opens with asset category brand asset type and remarks fields
And user select Asset category and check feild is mandatory or not
And user select brand and check the feild is mandatory or not
And user select Asset type and check the feild is mandatory or not
And user enter remark for asset auto creation and check the feild is mandatory or not
And user click save button for asset auto creation
And user validate success message in asset auto master
And user click asset auto edit icon
And user click the first edit icon in asset auto master list
And user verify the functionality of back button
And user click inbox to approve record for asset auto
And user search asset auto records
And user store reference number and click the first record in asset auto maker view
And user submit asset auto record in maker
And user capture checker id for checker submit
# this test case includes AAM_01_005,AAM_01_006
@AT-AAM-T002
Scenario: Checker approve and verify maker saved should reflect in checker
Given user log in as uls application checker for asset auto record
#And user Click on Menu icon for asset auto record
And user Click on Mailbox icon for asset auto record
And user search asset auto records
And Search the respective reference id and click on Action button for asset auto record
And user Click on Approve icon for asset auto record
And user Enter the remarks in Action confirmation popup for asset auto record
Then user Click on Remarks button in Action confirmation popup for asset auto record
Then user verify the Record got Approved for asset auto record
# this test case includes AAM_06_001,AAM_06_002,AAM_06_003,AAM_06_004
#AAM_06_009,AAM_06_011,AAM_06_012,AAM_06_013,AAM_06_014,AAM_06_017
#AAM_06_018,AAM_06_019,AAM_06_020,AAM_06_021,AAM_06_022,AAM_06_023
@AT-AAM-T013
Scenario: Creation of Asset Model Master record
Given User login as uls maker in asset CD master
When user click the configuration menu for asset auto creation 
And User click the config manager in Bounce master
And User enter the product setup menu for asset auto creation
And user click the list view in asset auto master
And user click the first edit icon for asset auto created record
And user click asset model master
And User click add icon for asset auto master
And user enter the asset model and verify the field editable mandatory and text box
And user select the asset model type and verify the field is mandatory or not and should be editable dropdown
And user enter the Model Year and verify the field editable mandatory and text box
And user select the asset condition and verify the field editable mandatory and drop down
And user select the country in asset model master and verify the field is mandatory or not and should be editable dropdown
And user select the drive train and verify the field is mandatory or not and should be editable dropdown
And user select number of cylinders verify the field is mandatory or not and should be editable dropdown
And user enter the volume of engine verify the field is mandatory or not and should be editable text box
And user enter the down payment percentage and verify field should be numerical mandatory and editable
And user enter the residual value percentage and verify the field is mandatory or not and should be editable text box
And user enter the remarks in asset model master
And user click save button for asset auto creation
And user validate success message in asset auto master
And User click add icon for asset auto master
And user verify the functionality of back button
And user click inbox to approve record for asset auto
And user search asset auto records
And user store reference number and click the first record in asset auto maker view
And user submit asset auto record in maker
And user capture checker id for checker submit
#creation for  checker return
@AT-AAM-T003.1
Scenario: creation of Asset Auto with valid details
Given User login as uls maker in asset CD master
When user click the configuration menu for asset auto creation
And User click the config manager in Bounce master 
And User enter the product setup menu for asset auto creation
And user click asset auto edit icon
And User click add icon for asset auto master
And User verify asset auto master opens with asset category brand asset type and remarks fields
And user select Asset category and check feild is mandatory or not
And user select brand and check the feild is mandatory or not
And user select Asset type and check the feild is mandatory or not
And user enter remark for asset auto creation and check the feild is mandatory or not
And user click save button for asset auto creation
And user validate success message in asset auto master
And user click asset auto edit icon
And user click the first edit icon in asset auto master list
And user verify the functionality of back button
And user click inbox to approve record for asset auto
And user search asset auto records
And user store reference number and click the first record in asset auto maker view
And user submit asset auto record in maker
And user capture checker id for checker submit
#checker return
#AAM_01_008
@AT-AAM-T003.2
Scenario: Checker return submitted record from maker
Given user log in as uls application checker for asset auto record
#And user Click on Menu icon for asset auto record
And user Click on Mailbox icon for asset auto record
And Search the respective reference id and click on Action button for asset auto record
And user Click on return icon for asset auto record
And user Enter the remarks in Action confirmation popup for asset auto record return
Then user Click on Remarks button in Action confirmation popup for asset auto record return
Then user verify the Record got Approved for asset auto record return
@AT-AAM-T004.1
Scenario: creation of Asset Auto with valid details
Given User login as uls maker in asset CD master
When user click the configuration menu for asset auto creation
And User click the config manager in Bounce master
And User enter the product setup menu for asset auto creation
And user click asset auto edit icon
And User click add icon for asset auto master
And User verify asset auto master opens with asset category brand asset type and remarks fields
And user select Asset category and check feild is mandatory or not
And user select brand and check the feild is mandatory or not
And user select Asset type and check the feild is mandatory or not
And user enter remark for asset auto creation and check the feild is mandatory or not
And user click save button for asset auto creation
And user validate success message in asset auto master
And user click asset auto edit icon
And user click the first edit icon in asset auto master list
And user verify the functionality of back button
And user click inbox to approve record for asset auto
And user search asset auto records
And user store reference number and click the first record in asset auto maker view
And user submit asset auto record in maker
And user capture checker id for checker submit
#AAM_01_007
@AT-AAM-T004.2
Scenario: Checker reject submitted record from maker
Given user log in as uls application checker for asset auto record
#And user Click on Menu icon for asset auto record
And user Click on Mailbox icon for asset auto record
And Search the respective reference id and click on Action button for asset auto record
And user Click on reject icon for asset auto record
And user Enter the remarks in Action confirmation popup for asset auto record reject
Then user Click on Remarks button in Action confirmation popup for asset auto record reject
Then user verify the Record got Approved for asset auto record reject
#AAM_02_001,AAM_02_002
@AT-AAM-T005
Scenario: Validation of asset auto master
Given User login as uls maker in asset CD master
When user click the configuration menu for asset auto creation
And User click the config manager in Bounce master
And User enter the product setup menu for asset auto creation
And user click asset auto edit icon
And User click add icon for asset auto master
Then User verify the impact when user keep any mandatory field blank and click on save button
# AAM_03_001,AAM_03_003,AAM_03_004,AAM_03_005,AAM_03_006,AAM_03_007
# AAM_03_008,AAM_03_009,AAM_03_010,AAM_03_011
@AT-AAM-T006.1
Scenario: updation of asset auto created record
Given User login as uls maker in asset CD master
When user click the configuration menu for asset auto creation
And User click the config manager in Bounce master
And User enter the product setup menu for asset auto creation
And user click asset auto edit icon
#Wip
And user click the first edit icon for asset auto created record
And user Select and modify the asset category in asset auto master
And user select and update the brand field in asset auto master
And user select and update the asset type in asset auto master
And user enter the remark in asset auto master
And user update the record in asset auto master
And user verify the success message for updated record in asset auto master
And user click the first edit icon for asset auto created record
And user verify the same record should get saved in system with only modified data 
#approved record
And user click the list view in asset auto master
And user click the first edit icon for asset auto created record
And user Select and modify the asset category in asset auto master
And user select and update the brand field in asset auto master
And user select and update the asset type in asset auto master
And user enter the remark in asset auto master
And user update the record in asset auto master
And user verify the success message for updated record in asset auto master
And user click inbox to approve record for asset auto
And user search asset auto records
And user store reference number and click the first record in asset auto maker view
And user submit asset auto record in maker
And user capture checker id for checker submit
# AAM_03_012,AAM_03_013
@AT-AAM-T007
Scenario: Checker approve and verify maker saved should reflect in checker
Given user log in as uls application checker for asset auto record
#And user Click on Menu icon for asset auto record
And user Click on Mailbox icon for asset auto record
And Search the respective reference id and click on Action button for asset auto record
And user Click on Approve icon for asset auto record
And user Enter the remarks in Action confirmation popup for asset auto record
Then user Click on Remarks button in Action confirmation popup for asset auto record
Then user verify the Record got Approved for asset auto record
@AT-AAM-T006.2
Scenario: validation for updation of asset auto created record
Given User login as uls maker in asset CD master
When user click the configuration menu for asset auto creation
And User click the config manager in Bounce master
And User enter the product setup menu for asset auto creation
And user click the list view in asset auto master
And user click the first edit icon for asset auto created record
And user verify the functionality of back button
And user click the first edit icon for asset auto created record
Then user verify System should show the proper validation message for blank field which is mandatory and should not allow user to save the record

# this test case includes AAM_03_016,AAM_03_017,AAM_03_018,AAM_03_019
@AT-AAM-T010
Scenario: Validation for Modification of asset auto master record
Given User login as uls maker in asset CD master
When user click the configuration menu for asset auto creation
And User click the config manager in Bounce master
And User enter the product setup menu for asset auto creation
And user click the list view in asset auto master
And user click the first edit icon for asset auto created record
And user verify the functionality of Activate and Deactivate button for asset auto
Then user verify the label status active deactive  for asset auto
And user verify the functionality of back button
@AT-AAM-T008.1
Scenario: updation of asset auto created record
Given User login as uls maker in asset CD master 
When user click the configuration menu for asset auto creation
And User click the config manager in Bounce master
And User enter the product setup menu for asset auto creation
And user click the list view in asset auto master
And user click the first edit icon for asset auto created record
And user Select and modify the asset category in asset auto master
And user select and update the brand field in asset auto master
And user select and update the asset type in asset auto master
And user enter the remark in asset auto master
And user update the record in asset auto master
And user verify the success message for updated record in asset auto master
And user click inbox to approve record for asset auto
And user search asset auto records
And user store reference number and click the first record in asset auto maker view
And user submit asset auto record in maker
And user capture checker id for checker submit
# AAM_03_014
@AT-AAM-T008.2
Scenario: Checker reject submitted record from maker
Given user log in as uls application checker for asset auto record
#And user Click on Menu icon for asset auto record
And user Click on Mailbox icon for asset auto record
And Search the respective reference id and click on Action button for asset auto record
And user Click on reject icon for asset auto record
And user Enter the remarks in Action confirmation popup for asset auto record reject
Then user Click on Remarks button in Action confirmation popup for asset auto record reject
Then user verify the Record got Approved for asset auto record reject
@AT-AAM-T009.1
Scenario: updation of asset auto created record
Given User login as uls maker in asset CD master 
When user click the configuration menu for asset auto creation
And User click the config manager in Bounce master 
And User enter the product setup menu for asset auto creation
And user click the list view in asset auto master
And user click the first edit icon for asset auto created record
And user Select and modify the asset category in asset auto master
And user select and update the brand field in asset auto master
And user select and update the asset type in asset auto master
And user enter the remark in asset auto master
And user update the record in asset auto master
And user verify the success message for updated record in asset auto master
And user click inbox to approve record for asset auto
And user search asset auto records
And user store reference number and click the first record in asset auto maker view
And user submit asset auto record in maker
And user capture checker id for checker submit
# AAM_03_015
@AT-AAM-T009.2
Scenario: Checker return for submitted record from maker
Given user log in as uls application checker for asset auto record
#And user Click on Menu icon for asset auto record
And user Click on Mailbox icon for asset auto record
And Search the respective reference id and click on Action button for asset auto record
And user Click on return icon for asset auto record
And user Enter the remarks in Action confirmation popup for asset auto record return
Then user Click on Remarks button in Action confirmation popup for asset auto record return
Then user verify the Record got Approved for asset auto record return

# this test case includes AAM_04_001,AAM_04_002,AAM_04_003,AAM_04_004,AAM_04_008,AAM_04_009,AAM_04_010,AAM_04_011
@AT-AAM-T011
Scenario: To verify the Product Master List view of records
Given User login as uls maker in asset CD master
When user click the configuration menu for asset auto creation
And User click the config manager in Bounce master
#And User enter the product setup menu for asset auto creation
And user click the list view in asset auto master
And user verify add button is displayed for asset auto master
And user verify search for record icon is displayed  for asset auto master
And user verify export to pdf option is displayed  for asset auto master
And user verify export to excel option is displayed for asset auto master
And user verify Asset category is displayed and non editable
And user verify Asset type is displayed and non editable
And user verify remark is displayed and non editable
And user verify the search results show matched data for asset auto master
And user verify the search results shows no data for asset auto master
And user verify post clicking pdf option pdf file will be downloaded for asset auto master
And user verify post clicking xls option excel file will be downloaded for asset auto master
Then user verify the fuctionality of add button in asset auto master list view

@AT-AAM-T012
Scenario: To verify the Asset Auto Master List view
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And User click the asset auto master eye icon in asset auto master
#And User verify the Asset Auto Master List view
And user verify add button is displayed for asset auto master
And user verify search for record icon is displayed  for asset auto master
And user verify export to pdf option is displayed  for asset auto master
And user verify export to excel option is displayed for asset auto master
And user verify Asset category is displayed and non editable
And user verify Asset type is displayed and non editable
And user verify remark is displayed and non editable
And User verify the Values in List view should be non editable
And User verify the functionality of Export to PDF button in asset auto master
And User verify the functionality of Export to Excel button in asset auto master
And user verify the search results show matched data for asset auto master
And user verify the search results shows no data for asset auto master
#And User verify the functionality of Search box with matching data in asset auto master
#And User verify the functionality of Search box with mismatch data in asset auto master
And User click the add icon in asset auto master
Then User click the inboxmail icon in asset CD master
And User search the asset auto master in the asset auto master
And User click the first result in the asset auto master
Then User click the workflow of the record in asset auto master

@AT_AAM_T017
Scenario: verify user is able to add new Template details  record in the system by entering invalid data
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#When user click product set up menu
And user click on Asset Auto Master Edit icon
And user click on Temp view First Record Edit Icon
And user click on Asset Model Master Tab
And user click on Asset Model Master Add icon
And user Enter Characters value in Numeric Fields
And user click on Asset Model Master Save button
And user Validate the Message and verify it


#AAM_08_015, AAM_08_016, AAM_08_017, AAM_08_018
@AT-AAM-T023
Scenario: To verify the functionality of Activate/Deactivate button
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And User click the asset auto master eye icon in asset auto master
And Click the listview pencil icon in asset auto master
And User click the backbutton in asset auto master
And Click the listview pencil icon in asset auto master
And Verify the active status in asset auto master
And User click the status button in asset auto master
And Verify the Deactive status in asset auto master

#AAM_09_001, AAM_09_002, AAM_09_003, AAM_09_004, AAM_09_008, AAM_09_012, AAM_09_013, AAM_09_014, AAM_09_015
@AT-AAM-T024
Scenario: To verify the functionality of asset auto master 
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the project master listview icon in project master
And User click the asset auto master edit icon in asset auto master
And Click the listview pencil icon in asset auto master
And User click the asset model master in asset auto master
#And User verify the Asset Auto Master List view
And User verify the asset model master list view
And User verify the Values in List view should be non editable
And User verify the functionality of Export to PDF button in asset auto master
And User verify the functionality of Export to Excel button in asset auto master
And User verify the functionality of Search box with matching data in asset auto master
And User verify the functionality of Search box with mismatch data in asset auto master
And User click the add icon in asset auto master
Then User click the workflow of the record in asset auto master

@AT_AAM_T020
Scenario: verify system display the confirmation message post clicking on Approve button at Checker stage
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset auto master and get the reference id
And User search the respective reference id and click on Action button in asset auto master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT_AAM_T020_Approve_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
#And User click the product setup in asset CD master
And User click the config manager in Bounce master
And User click the asset auto master eye icon in asset auto master
Then User validate the updated record in list view in Asset auto master

@AT_AAM_T021_Reject
Scenario: verify Checker user is able to Reject the record
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset auto master and get the reference id
And User search the respective reference id and click on Action button in asset auto master
And User click the reject icon in asset CD master checker
And User enter the reject remark in asset CD master checker
And User click the final reject icon in asset CD master checker
Then User verify the Record got Rejected in asset CD checker

@AT_AAM_T021_Reject_Listview
Scenario: Record should get approved and display in the system under Reject List view
Scenario: To verify the rejected record shown in asset CD master maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User click the inboxmail icon in asset CD master
And User verify the rejected record removed from the system in asset auto master

@AT_AAM_T022_Return
Scenario: verify Checker user is able to Approve the record
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset auto master and get the reference id
And User search the respective reference id and click on Action button in asset auto master
And User click the return icon in asset CD master checker
And User enter the return remark in asset CD master checker
And User click the final return icon in asset CD master checker
Then User verify the Record got Returned in asset CD checker

@AT_AAM_T022_Return_ListView
Scenario: Record should get approved and display in the system under Approved List view
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User click the inboxmail icon in asset CD master
And User verify the returned record removed from the system in asset auto master








