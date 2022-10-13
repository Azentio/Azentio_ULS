Feature: Check the functionality of Asset auto master
#AAM_01_001,AAM_01_002,AAM_01_009,AAM_01_011,AAM_01_012,AAM_01_013,AAM_01_014,AAM_01_015
@T1
Scenario: creation of Asset Auto with valid details
Given user log in as uls application maker 
When user click the configuration menu for asset auto creation
And User click the Configuration Manager option
And user click asset auto edit icon
And User click add icon for asset auto master
And User verify asset auto master opens with asset category brand asset type and remarks fields
And User Update Test data for Asset Auto Master creation approve
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
@T2
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
@T13
Scenario: Creation of Asset Model Master record
Given user log in as uls application maker 
When user click the configuration menu for asset auto creation 
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
@T3.1
Scenario: creation of Asset Auto with valid details
Given user log in as uls application maker
When user click the configuration menu for asset auto creation 
And User enter the product setup menu for asset auto creation
And user click asset auto edit icon
And User click add icon for asset auto master
And User Update Test data for Asset Auto Master creation checker return
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
@T3.2
Scenario: Checker return submitted record from maker
Given user log in as uls application checker for asset auto record
#And user Click on Menu icon for asset auto record
And user Click on Mailbox icon for asset auto record
And Search the respective reference id and click on Action button for asset auto record
And user Click on return icon for asset auto record
And user Enter the remarks in Action confirmation popup for asset auto record return
Then user Click on Remarks button in Action confirmation popup for asset auto record return
Then user verify the Record got Approved for asset auto record return
@T4.1
Scenario: creation of Asset Auto with valid details
Given user log in as uls application maker 
When user click the configuration menu for asset auto creation
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
@t4.2
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
@T5
Scenario: Validation of asset auto master
Given user log in as uls application maker
When user click the configuration menu for asset auto creation 
And User enter the product setup menu for asset auto creation
And user click asset auto edit icon
And User click add icon for asset auto master
Then User verify the impact when user keep any mandatory field blank and click on save button
# AAM_03_001,AAM_03_003,AAM_03_004,AAM_03_005,AAM_03_006,AAM_03_007
# AAM_03_008,AAM_03_009,AAM_03_010,AAM_03_011
@T6.1
Scenario: updation of asset auto created record
Given user log in as uls application maker
When user click the configuration menu for asset auto creation 
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
@T7
Scenario: Checker approve and verify maker saved should reflect in checker
Given user log in as uls application checker for asset auto record
#And user Click on Menu icon for asset auto record
And user Click on Mailbox icon for asset auto record
And Search the respective reference id and click on Action button for asset auto record
And user Click on Approve icon for asset auto record
And user Enter the remarks in Action confirmation popup for asset auto record
Then user Click on Remarks button in Action confirmation popup for asset auto record
Then user verify the Record got Approved for asset auto record
@T6.2
Scenario: validation for updation of asset auto created record
Given user log in as uls application maker
When user click the configuration menu for asset auto creation 
And User enter the product setup menu for asset auto creation
And user click the list view in asset auto master
And user click the first edit icon for asset auto created record
And user verify the functionality of back button
And user click the first edit icon for asset auto created record
Then user verify System should show the proper validation message for blank field which is mandatory and should not allow user to save the record

# this test case includes AAM_03_016,AAM_03_017,AAM_03_018,AAM_03_019
@T10
Scenario: Validation for Modification of asset auto master record
Given user log in as uls application maker 
When user click the configuration menu for asset auto creation 
And User enter the product setup menu for asset auto creation
And user click the list view in asset auto master
And user click the first edit icon for asset auto created record
And user verify the functionality of Activate and Deactivate button for asset auto
Then user verify the label status active deactive  for asset auto
And user verify the functionality of back button
@T8.1
Scenario: updation of asset auto created record
Given user log in as uls application maker 
When user click the configuration menu for asset auto creation 
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
@T8.2
Scenario: Checker reject submitted record from maker
Given user log in as uls application checker for asset auto record
#And user Click on Menu icon for asset auto record
And user Click on Mailbox icon for asset auto record
And Search the respective reference id and click on Action button for asset auto record
And user Click on reject icon for asset auto record
And user Enter the remarks in Action confirmation popup for asset auto record reject
Then user Click on Remarks button in Action confirmation popup for asset auto record reject
Then user verify the Record got Approved for asset auto record reject
@T9.1
Scenario: updation of asset auto created record
Given user log in as uls application maker 
When user click the configuration menu for asset auto creation 
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
@T9.2
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
@T11
Scenario: To verify the Product Master List view of records
Given user log in as uls application maker 
When user click the configuration menu for asset auto creation 
And User enter the product setup menu for asset auto creation
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





