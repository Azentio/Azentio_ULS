Feature: Testing the functionalities of Report Master
Scenario: User verify system allow user to modify the Report Master
Given user log in as uls application maker
When user click the configuration menu for Report Master 
And User click the Configuration Manager option
And User click Approved list icon for Report Master
And User click First Edit icon in Approved list view for Report Master
And User click and update the Report Name
And User click and update the Report Name2
And User click and update the Report Name3
And User click and update the Report Description
And User Select and update the Report Type
And User click and update the Report Url
And User Select and update the Report Category
And User Verify the Status button in Report Master
And User click Save button for report master updation 
And user click inbox to approve record for report master
And user search report Master
And user store reference number and click the first record in report master inbox view
And user submit report master record in maker
And user capture checker id for checker submit
Scenario: Checker approve and verify maker saved should reflect in checker
Given user log in as uls application checker for report master record
#And user Click on Menu icon for asset auto record
And user Click on Mailbox icon for report master record
And Search the respective reference id and click on Action button for report master record
And user Click on Approve icon for report master record
And user Enter the remarks in Action confirmation popup for report master record
Then user Click on Remarks button in Action confirmation popup for report master record
Then user verify the Record got Approved for report master record


