Feature: To verify the checker reject the record for project master in creation
@AT-PM-T017.2.1
Scenario: To verify the checker reject the record for project master in creation
Given User login into maker in project master for validation
Then Click the project setup in project master for validation
And Click the project setup eye icon in project master for validation
And Click the inboxmailicon in maker stage for reject record verify
And user verify the rejected record removed from the system
