Feature: Verify the functionalities of policy check
@PolicyCheck_001
Scenario: To verify the Policy Check List view record validation
Given Launch the kuls application and Navigate to Application details view list
Then click the inbox in application
And Search for app data entry record
Then Click the action icon of the app data entry
And click the policy check tab in application details
Then check the field Policy Check Summary screen and Credit Policy  screen is viewed in policy check
And verify Policy Check Summary screen open with Execution Leve
And verify Policy Check Summary screen open with Execution Policy Status
And verify Policy Check Summary screen open with Execution Approval Level
And verify Policy Check Summary screen open with Execution Count
Then verify Credit Policy  screen get open with Result ID
Then verify Credit Policy  screen get open with Policy Execution Level
Then verify Credit Policy  screen get open with Policy Level
Then verify Credit Policy  screen get open with Customer Name
Then verify Credit Policy  screen get open with Customer Type
#Then verify Credit Policy  screen get open with Facility ID
#Then verify Credit Policy  screen get open with Product
#Then verify Credit Policy  screen get open with Sub Product
Then verify Credit Policy  screen get open with Result
Then verify Credit Policy  screen get open with Approval Level
Then verify Credit Policy  screen get open with Approved By
Then verify Credit Policy  screen get open with Approval Type
And verify the functionality of Search box with matching data in policy check
Then verify the functionality of Search box with mismatch data in policy check
And verify the functionality of Export to PDF button in policy check
Then  verify the functionality of Export to Excel button in policy check
