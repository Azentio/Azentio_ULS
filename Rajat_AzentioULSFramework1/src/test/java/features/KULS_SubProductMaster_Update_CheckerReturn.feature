Feature: Checker user can able to return the updated record
@m7.1
Scenario: Modification of Sub-product Master record
Given user log in as uls application maker
When user click product set up menu
#updation
And user click list view in sub product menu
And user click the edit icon for the record which saved in maker 
And user Select and modify the project group 
And user Select and modify the Product code 
And user enter and modify sub product code 
And user enter and modify sub product description 
And user enter and modify allocation sequence number for reject
And user click the save button for updation
Then user verify the sucess message for updation
And user click the edit icon for the record which saved in maker 
And user verify all modified details are present on post save the record
And user click the inbox icon
And user click the modified record in the list view and store the reference number
And user submit the modified record and verify the sucess message
@7.2
Scenario: verify Checker user is able to Reject the record in subproduct Master Retail
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected 