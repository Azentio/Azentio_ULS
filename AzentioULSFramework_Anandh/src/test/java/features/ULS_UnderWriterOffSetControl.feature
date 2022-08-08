Feature: To verify under writer offset control module fields and creation and updation
@AT_UOC_T001
Scenario:To verify user can able to create the under writer off set record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on business rules main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
Then verify back button and save buttons are visible when user click on add button
Then verify minimum value input box should be mendatory and field should be text box
And user can able to enter the minimum value input box
Then verify maximum value input box should be mendatory and field should be text box
And user can able to enter the maximum value input box
Then verify available field should be non mendatory and field should be display only
Then verify selected field should be non mendatory and field should be display only
Then click on save button in under writer off set screen
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id
@AT_UOC_T002
Scenario: To verify checker user can able to approve the under writer off set control record
Given Navigate to ULS application URL
Then login with checker user
And click on menu button
Then select the under writer record in checker stage
And click on approve button in checker stage to approve the under writer off set control record
And give the checker remark in alert pop up for approve the under writer record
And click on approve button in remark pop up for approve the under writer record
Then verify checker user can able to see the approve pop up after approving the under writer record
@AT_UOC_T001.2
Scenario:To verify user can able to create the under writer off set record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on business rules main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
Then verify back button and save buttons are visible when user click on add button
Then verify minimum value input box should be mendatory and field should be text box
And user can able to enter the minimum value input box for checker reject
Then verify maximum value input box should be mendatory and field should be text box
And user can able to enter the maximum value input box for checker reject
Then verify available field should be non mendatory and field should be display only
Then verify selected field should be non mendatory and field should be display only
Then click on save button in under writer off set screen
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id
@AT_UOC_T003
Scenario: To verify checker user can able to reject the record
Given Navigate to ULS application URL
Then login with checker user for return the under writer record
And click on menu button
Then select the under writer record in checker stage
And click on reject button in checker stage to return the under writer off set control record
And give the checker remark in alert pop up for reject the under writer record
And click on reject button in remark pop up for reject the under writer record
Then verify checker user can able to see the reject pop up after rejecting the under writer record

@AT_UOC_T001.3
Scenario:To verify user can able to create the under writer off set record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on business rules main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
Then verify back button and save buttons are visible when user click on add button
Then verify minimum value input box should be mendatory and field should be text box
And user can able to enter the minimum value input box for checker return
Then verify maximum value input box should be mendatory and field should be text box
And user can able to enter the maximum value input box for checker return
Then verify available field should be non mendatory and field should be display only
Then verify selected field should be non mendatory and field should be display only
Then click on save button in under writer off set screen
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id
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

@AT_UOC_T005
Scenario: To verify maker user can able to create the record with invalid input
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on business rules main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
And click on save button before entering mendatory details
Then verify system should show the validation for minimum and maximum value mendatory fields
And fill the alphabets in minimum and maximum value input box 
Then click on save button after enter the alphabet input
Then verify system should not allow user to save the record 
Then fill the minimum and maximum input as special characters
And click on save button after enter special characters
Then verify system should not allow user to save the record
Then verify functionality of back button


@AT_UOC_T005.1
Scenario: To verify maker user can able to update the under writer record beore approval
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on business rules main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
Then verify back button and save buttons are visible when user click on add button
Then verify minimum value input box should be mendatory and field should be text box
And user can able to enter the minimum value input box for checker reject
Then verify maximum value input box should be mendatory and field should be text box
And user can able to enter the maximum value input box for checker reject
Then verify available field should be non mendatory and field should be display only
Then verify selected field should be non mendatory and field should be display only
Then click on save button in under writer off set screen
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record
And update the minimum and maximum value fields 
Then click on save button after updating the under writer off set screen
When click on mail box after saving the under writer record
#Then click on search button to search the under writer off set record
And click on first under writer off set record
Then verify record is updated or not
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id
@AT_UOC_T002.2
Scenario: To verify checker user can able to approve the under writer off set control record
Given Navigate to ULS application URL
Then login with checker user
And click on menu button
Then select the under writer record in checker stage
And click on approve button in checker stage to approve the under writer off set control record
And give the checker remark in alert pop up for approve the under writer record
And click on approve button in remark pop up for approve the under writer record
Then verify checker user can able to see the approve pop up after approving the under writer record
@AT_UOC_T006
Scenario: To verify maker user can able to update the under writer record which is approved from checkr
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on business rules main module
And click on under writer off set control view button
Then select the record to do updation which is approved from checker user
Then update the already approved record 
And click on save button after update the approved one
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record
Then verify approved record is updated with our input data
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id
@AT_UOC_T007
Scenario: To verify checker user can able to approve the under writer off set control record
Given Navigate to ULS application URL
Then login with checker user
And click on menu button
Then select the under writer record in checker stage
And click on approve button in checker stage to approve the under writer off set control record
And give the checker remark in alert pop up for approve the under writer record
And click on approve button in remark pop up for approve the under writer record
Then verify checker user can able to see the approve pop up after approving the under writer record
@AT_UOC_T006.2
Scenario: To verify maker user can able to update the under writer record which is approved from checkr
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on business rules main module
And click on under writer off set control view button
Then select the record to do updation which is approved from checker user
Then update the already approved record for checker reject
And click on save button after update the approved one
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record
Then verify approved record is updated with our input data for checker reject
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id
@AT_UOC_T008
Scenario: To verify checker user can able to reject the record
Given Navigate to ULS application URL
Then login with checker user for return the under writer record
And click on menu button
Then select the under writer record in checker stage
And click on reject button in checker stage to return the under writer off set control record
And give the checker remark in alert pop up for reject the under writer record
And click on reject button in remark pop up for reject the under writer record
Then verify checker user can able to see the reject pop up after rejecting the under writer record

@AT_UOC_T006.3
Scenario: To verify maker user can able to update the under writer record which is approved from checkr
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on business rules main module
And click on under writer off set control view button
Then select the record to do updation which is approved from checker user
Then update the already approved record for checker return
And click on save button after update the approved one
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record
Then verify approved record is updated with our input data for checker return
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id
@AT_UOC_T009
Scenario: To verify checker user can able to return the record
Given Navigate to ULS application URL
Then login with checker user for return the under writer record
And click on menu button
Then select the under writer record in checker stage
And click on return button in checker stage to return the under writer off set control record
And give the checker remark in alert pop up for return the under writer record
And click on return button in remark pop up for return the under writer record
Then verify checker user can able to see the reject pop up after returning the under writer record
@AT_UOC_T005.1
Scenario: To verify maker user can able to update the under writer record beore approval
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on business rules main module
And click on under writer off set control view button
Then click on add button to create under writer off set record
Then verify back button and save buttons are visible when user click on add button
Then verify minimum value input box should be mendatory and field should be text box
And user can able to enter the minimum value input box for checker reject
Then verify maximum value input box should be mendatory and field should be text box
And user can able to enter the maximum value input box for checker reject
Then verify available field should be non mendatory and field should be display only
Then verify selected field should be non mendatory and field should be display only
Then click on save button in under writer off set screen
When click on mail box after saving the under writer record
Then click on search button to search the under writer off set record
And click on first under writer off set record
And update the minimum and maximum value fields 
Then click on save button after updating the under writer off set screen
When click on mail box after saving the under writer record
#Then click on search button to search the under writer off set record
And click on first under writer off set record
Then verify record is updated or not
And submit the under writer off set record
Then give alert remark and click on submit in alert
Then store the checker id
@AT_UOC_T002.2
Scenario: To verify checker user can able to approve the under writer off set control record
Given Navigate to ULS application URL
Then login with checker user
And click on menu button
Then select the under writer record in checker stage
And click on approve button in checker stage to approve the under writer off set control record
And give the checker remark in alert pop up for approve the under writer record
And click on approve button in remark pop up for approve the under writer record
Then verify checker user can able to see the approve pop up after approving the under writer record
@AT_UOC_T010
Scenario: To verify maker user can not able to update the under writer record with invalid inputs
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on business rules main module
And click on under writer off set control view button
Then select the record to do updation which is approved from checker user 
Then clear the input box value
And fill the alphabets in minimum and maximum value input box
Then click on save button after enter the alphabet input for updation record
Then verify system should not allow user to save the record 
Then clear the input box value
And click on save button before entering mendatory details in updation record
Then verify system should show the validation for minimum and maximum value mendatory fields
Then fill the minimum and maximum input as special characters
And click on save button after enter special characters for updation record
Then verify system should not allow user to save the record
Then clear the input box value
Then verify functionality of back button

