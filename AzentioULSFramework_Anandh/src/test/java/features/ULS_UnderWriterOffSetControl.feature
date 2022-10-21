Feature: To verify under writer offset control module fields and creation and updation
#ACT_01_01,UOC_01_02,UOC_01_03,UOC_01_04,UOC_01_05,UOC_01_06,UOC_01_07,UOC_01_08,UOC_01_12(9)
@AT_UOC_T001
Scenario:To verify user can able to create the under writer off set record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
And get the test data of the first test case from excel file
Then verify back button and save buttons are visible when user click on add button
Then verify minimum value input box should be mendatory and field should be text box
And user can able to enter the minimum value input box
Then verify maximum value input box should be mendatory and field should be text box
And user can able to enter the maximum value input box
#Then verify available field should be non mendatory and field should be display only
##Then verify selected field should be non mendatory and field should be display only
Then click on save button in under writer off set screen
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id
#UOC_01_09
@AT_UOC_T002
Scenario: To verify checker user can able to approve the under writer off set control record
Given Navigate to ULS application URL
Then login with checker user for approve the under writer record
And click on menu button
And get the test data of the first test case from excel file
Then select the under writer record in checker stage
And click on approve button in checker stage to approve the under writer off set control record
And give the checker remark in alert pop up for approve the under writer record
And click on approve button in remark pop up for approve the under writer record
Then verify checker user can able to see the approve pop up after approving the under writer record
#pre requisite
@AT_UOC_T001.2
Scenario:To verify user can able to create the under writer off set record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
And get the test data for checker reject creation
#And get the test data of the first test case from excel file
Then verify back button and save buttons are visible when user click on add button
Then verify minimum value input box should be mendatory and field should be text box
And user can able to enter the minimum value input box
Then verify maximum value input box should be mendatory and field should be text box
And user can able to enter the maximum value input box
#Then verify available field should be non mendatory and field should be display only
##Then verify selected field should be non mendatory and field should be display only
Then click on save button in under writer off set screen
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record for the checker reject record
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id for checker reject
#UOC_01_10
@AT_UOC_T003
Scenario: To verify checker user can able to reject the record
Given Navigate to ULS application URL
Then login with checker user for reject the under writer record
And click on menu button
And get the test data for checker reject scenario
Then select the under writer record in checker stage
And click on reject button in checker stage to return the under writer off set control record
And give the checker remark in alert pop up for reject the under writer record
And click on reject button in remark pop up for reject the under writer record
Then verify checker user can able to see the reject pop up after rejecting the under writer record
#pre requisite
@AT_UOC_T001.3
Scenario:To verify user can able to create the under writer off set record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
Then verify back button and save buttons are visible when user click on add button
And get the test data of checker return scenario
Then verify minimum value input box should be mendatory and field should be text box
And user can able to enter the minimum value input box
Then verify maximum value input box should be mendatory and field should be text box
And user can able to enter the maximum value input box
#Then verify available field should be non mendatory and field should be display only
##Then verify selected field should be non mendatory and field should be display only
Then click on save button in under writer off set screen
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record whcih is going to return in checker
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id for checker return
#UOC_01_11
@AT_UOC_T004
Scenario: To verify checker user can able to return the record
Given Navigate to ULS application URL
Then login with checker user for return the under writer record
And click on menu button
Then select the under writer record in checker stage
And click on return button in checker stage to return the under writer off set control record
And give the checker remark in alert pop up for return the under writer record
And click on return button in remark pop up for return the under writer record
Then verify checker user can able to see the reject pop up after returning the under writer record
#UOC_02_01,UOC_02_02,UOC_02_03,UOC_02_04(4)
@AT_UOC_T005
Scenario: To verify maker user can able to create the record with invalid input
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
And get the test data for negative scenarios in excel file
And click on save button before entering mendatory details
Then verify system should show the validation for minimum and maximum value mendatory fields
And fill the alphabets in minimum and maximum value input box 
Then click on save button after enter the alphabet input
Then verify system should not allow user to save the record 
Then fill the minimum and maximum input as special characters
And click on save button after enter special characters
Then verify system should not allow user to save the record
Then verify functionality of back button

#UOC_03_01,UOC_03_02,UOC_03_04(3)
@AT_UOC_T006
Scenario: To verify maker user can able to update the under writer record beore approval
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
And get the test data of the first test case from excel file
Then verify back button and save buttons are visible when user click on add button
Then verify minimum value input box should be mendatory and field should be text box
And user can able to enter the minimum value input box
Then verify maximum value input box should be mendatory and field should be text box
And user can able to enter the maximum value input box
#Then verify available field should be non mendatory and field should be display only
##Then verify selected field should be non mendatory and field should be display only
Then click on save button in under writer off set screen
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first record of under Writer off set control record
And update the minimum and maximum value fields 
Then click on save button after updating the under writer off set screen
When click on mail box after saving the under writer record
#Then click on search button to search the under writer off set record
And click on first record of under writer which is updated before approval
Then verify record is updated or not
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker ID of WIP Updated record
#Approval
@AT_UOC_T002.2
Scenario: To verify checker user can able to approve the under writer off set control record
Given Navigate to ULS application URL
And login with checker user to approve the WIP Updated record
And click on menu button
Then select the under writer record in checker stage
And click on approve button in checker stage to approve the under writer off set control record
And give the checker remark in alert pop up for approve the under writer record
And click on approve button in remark pop up for approve the under writer record
Then verify checker user can able to see the approve pop up after approving the under writer record

#UOC_03_03,UOC_03_05,UOC_03_17(3)
@AT_UOC_T007
Scenario: To verify maker user can able to update the under writer record which is approved from checker
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on under writer off set control view button
And get the test data of updattion seventh test case
Then select the record to do updation which is approved from checker user
Then update the already approved record 
And click on save button after update the approved one
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first updated under writer offset record which is going to approved in checker
Then verify approved record is updated with our input data
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id for updated under writer record
@AT_UOC_T008
Scenario: To verify checker user can able to approve the under writer off set control record
Given Navigate to ULS application URL
And log in with checker ID which is captured while sibmit from maker for approval purpose
And click on menu button
Then select the under writer record in checker stage
And click on approve button in checker stage to approve the under writer off set control record
And give the checker remark in alert pop up for approve the under writer record
And click on approve button in remark pop up for approve the under writer record
Then verify checker user can able to see the approve pop up after approving the under writer record
#Checker approval
@AT_UOC_T007.2
Scenario: To verify maker user can able to update the under writer record which is approved from checker
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on under writer off set control view button
Then select the record to do updation which is approved from checker user
And get the test data for updattion which is going to reject from checker
Then update the already approved record for checker reject
And click on save button after update the approved one
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first updated under writer off set record which is going to reject in checker
Then verify approved record is updated with our input data for checker reject
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id for checker reject scenario for updated record
#checker Reject
@AT_UOC_T009
Scenario: To verify checker user can able to reject the record
Given Navigate to ULS application URL
And log in with checker ID which is captured while sibmit from maker for rejection purpose
And click on menu button
Then select the under writer record in checker stage
And click on reject button in checker stage to return the under writer off set control record
And give the checker remark in alert pop up for reject the under writer record
And click on reject button in remark pop up for reject the under writer record
Then verify checker user can able to see the reject pop up after rejecting the under writer record
#preRequisites
@AT_UOC_T007.3
Scenario: To verify maker user can able to update the under writer record which is approved from checker
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on under writer off set control view button
Then select the record to do updation which is approved from checker user
Then update the already approved record for checker return
And click on save button after update the approved one
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first record of updated under writer which is going to return in checker stage
Then verify approved record is updated with our input data for checker return
And submit the under writer off set record
Then give alert remark and click on submit in alert
And store the checker id of updated record for checker return purpose
#Checker return
@AT_UOC_T010
Scenario: To verify checker user can able to return the record
Given Navigate to ULS application URL
And login with checker id which is captured while submit the updated record for return purpose
Then login with checker user for return the under writer record
And click on menu button
Then select the under writer record in checker stage
And click on return button in checker stage to return the under writer off set control record
And give the checker remark in alert pop up for return the under writer record
And click on return button in remark pop up for return the under writer record
Then verify checker user can able to see the reject pop up after returning the under writer record
#UOC_03_06,UOC_03_07,UOC_03_08,UOC_03_09,UOC_03_10,UOC_03_11,UOC_03_12
@AT_UOC_T011
Scenario: To verify maker user can not able to update the under writer record with invalid inputs
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on under writer off set control view button
And get the test data  of validation screnario in updation screen
Then select the record to do updation which is approved from checker user 
Then clear the input box value
And fill the alphabets in minimum and maximum value input box
Then click on save button after enter the alphabet input for updation record
Then verify system should not allow user to save the record 
Then clear the input box value
And click on save button before entering mendatory details in updation record
Then verify system should show the validation for minimum and maximum value mendatory fields
Then fill the minimum and maximum input as special characters
And click on save button after enter special characters
Then verify system should not allow user to save the record
Then clear the input box value
Then verify functionality of back button

@AT_UOC_T012
Scenario: validate the list view and WIP fields of under writer offset control
#This test case is also cover the functinality of M12, M13
# UOC_04_08, UOC_04_09, UOC_04_10, UOC_04_11, ACT_05_01, ACT_05_02, ACT_05_03, ACT_05_04, ACT_05_05, ACT_05_06, ACT_05_07
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config Manager main module
And click on under writer off set control view button
And get the test data of under writer validation scenario
#And click on under writer off set control view button
And Validate all fields in list view of under writer offset control
And Validate that values in list view of under writer offset control is non editable
And Validate the functionalitiy of Add button of under writer offset control
And Click on Back icon of under writer offset control
And Verify that user can click on view inporgress in view list of under writer offset control
And Click on Back icon of under writer offset control
And Search with valid data in under writer offset control
And Search with Invalid data in under writer offset control
And Validate Export to PDF functionality of under writer offset control
And Validate export to Excel functionality of under writer offset control
And Navigate to Temp view of under writer offset control
And Validate the fields are present in WIP of under writer offset control
And Validate the functionalitiy of Add button of under writer offset control
And Click on Back icon of under writer offset control
And Search with valid data in under writer offset control
And Search with Invalid data in under writer offset control
And Validate Export to PDF functionality of under writer offset control
And Validate export to Excel functionality of under writer offset control
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record to check the transaction summary
Then Validate the functionality of View summary section in under writer offset control