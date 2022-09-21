Feature: To verify the checker reject the record for project master in creation
#PM-10-33
@AT-PM-T017.2
Scenario: To verify the checker reject the record for project master in creation
Given user log in as uls application checker
And user Click on Menu icon
And user Click on Mailbox icon
And Search the respective reference id and click on Action button
And user Click on Reject icon
And user Enter the remarks for Reject the Record
Then user Click on Remarks button for Reject confirmation
Then user verify the Record got Rejected
