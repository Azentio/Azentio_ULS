Feature: Creation of Parameter record with valid data
@SPM_06_01
Scenario: To verify post clicking on Add button, the Parameter screen is getting open with all valid fields
Given Maker Login
Then Click the subproductretail master
Then Verify the back arrow function
Then Enter the required sub product parameters fields in maker
And Enter the required bulk payment fields in maker
And Enter the required foreclosure fields in maker
And Enter the required reschedulement fields in maker
And Enter the required moratorium/Grace period month in maker
Then Enter the required pre-EMI fields in maker
Then Click the save button get the confirmation messege
Then Get the respective reference id and submit in maker
