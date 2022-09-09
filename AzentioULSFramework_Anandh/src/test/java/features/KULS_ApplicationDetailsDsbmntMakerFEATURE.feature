Feature: To Test the application details disbursement maker module
@AT_ADM_002
Scenario: To test the field level verification of the application details disbursement record
Given navigate to uls application 
And login with maker credentials
And click on mail box icon
And search the record for disbursement maker record
And select the disbursement maker record in the mail record
And go to application details 
Then verify add button is not available and user can not able to create the record 
Then verify user can not able to modify the primary product field
Then verify user can not able to modify the primary sub product field
Then verify user can not able to modify the total finance amount requested
Then verify user can not able to modify declared net income field
Then verify user can not able to modify the Declared Current Obligations field
Then verify user can not able to modify the Special PromotionCampaign field
Then verify user can not able to modify the sourcing channel field
Then verify user can not able to modify the business center code field
Then verify user can not able to modify the servicing type field
Then verify user can not able to modify the Servicing Entity field
Then verify user can not able to modify the Servicing Branch field
Then verify user can not able to modify the Closing Staff or Servicing Staff or RM field
Then verify user can not able to modify the Sourcing Type field
Then verify user can not able to modify the Sourcing staff field
Then verify user can not able to modify the Sourcing Entity field
Then verify user can not able to modify the Sourcing Office field
Then verify user can not able to modify the  Reference Type field
Then verify user can not able to modify the Reference Entity field
Then verify user can not able to modify the Reference Code field
Then verify the functionlaity of the back button