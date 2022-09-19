Feature: To verify the checker approve the record for project master in creation
#PM-10-32
@AT-PM-T017.1
Scenario: To verify the checker approve the record for project master in creation
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Approve icon
And user Enter the remarks in Action confirmation popup
Then user Click on Remarks button in Action confirmation popup
Then user verify the Record got Approved
