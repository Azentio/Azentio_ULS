Feature: To verify the functionality of Asset Auto Master
#AAM_05_001, AAM_05_002, AAM_05_003, AAM_05_004, AAM_05_009, AAM_05_010, AAM_05_011, AAM_05_012
@AT-AAM-T012
Scenario: To verify the Asset Auto Master List view
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the product setup in asset CD master
And User click the asset auto master edit icon in asset auto master
And User verify the Asset Auto Master List view
And User verify the Values in List view should be non editable
And User verify the functionality of Export to PDF button in asset auto master
And User verify the functionality of Export to Excel button in asset auto master
And User verify the functionality of Search box with matching data in asset auto master
And User verify the functionality of Search box with mismatch data in asset auto master
And User click the add icon in asset auto master
Then User click the workflow of the record in asset auto master

#AAM_08_015, AAM_08_016, AAM_08_017, AAM_08_018
@AT-AAM-T023
Scenario: To verify the functionality of Activate/Deactivate button
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the product setup in asset CD master
And User click the asset auto master eye icon in asset auto master
And Click the listview pencil icon in asset auto master
And User click the backbutton in asset auto master
And Click the listview pencil icon in asset auto master
And Verify the active status in asset auto master
And User click the status button in asset auto master
And Verify the Deactive status in asset auto master

#AAM_09_001, AAM_09_002, AAM_09_003, AAM_09_004, AAM_09_008, AAM_09_012, AAM_09_013, AAM_09_014, AAM_09_015
@AT-AAM-T024
Scenario:
