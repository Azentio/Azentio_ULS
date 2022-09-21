Feature: To verify user is able to add new Template record under Asset CD Master main menu by entering valid data
#ACDM_01_001, ACDM_01_002, ACDM_01_003, ACDM_01_004, ACDM_01_005, ACDM_01_006, ACDM_01_007, ACDM_01_008, ACDM_01_009, ACDM_01_010, ACDM_01_011, ACDM_01_012
@AT-01-02-03-04-09-011
Scenario: To verify the Asset CD Master all flow
Given User login as uls maker in asset CD master
And User click the product setup in asset CD master
And User click the edit icon in asset CD master
And User click the add icon in asset CD master
And User verify the save back help button in asset CD master
And User verify the all mentioned fields in asset CD master
Then User click the back button in asset CD master
And User click the add icon in asset CD master
Then User verify the asset category fields in asset CD master
And User enter the value in asset category for asset CD master
And User enter the value in asset type for asset CD master
And User enter the value in manufacturer for asset CD master
And User enter the value in model for asset CD master
And User enter the value in year of manufacture for asset CD master
And User enter the value in country for asset CD master
And User enter the value in remarks for asset CD master
And User click the save button for asset CD master
Then User verify the confirmation message in asset CD master
Then User click the inboxmail icon in asset CD master
And User click the search icon in asset CD master and get the reference id
And User click the submit icon in asset CD master maker
And User enter the popup remark and submit the asset CD master
And User get confirmation message and checker id in asset CD master

@AT-05-06
Scenario: To verify user able to approve in checker stage for Asset-CD-Master
Given User login as uls checker in asset CD master
And User click the menu in asset CD master checker
And User click the inboxicon in asset CD master checker
And User search the respective reference id and click on Action button in asset CD master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT-06.1
Scenario: To verify user able to approve in checker stage for Asset-CD-Master
Given User login as uls maker in asset CD master
And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User validate the updated record in list view in Asset CD master

@AT-07
Scenario: To verify the Asset CD Master all flow
Given User login as uls maker in asset CD master
And User click the product setup in asset CD master
And User click the edit icon in asset CD master
And User click the add icon in asset CD master
Then User verify the asset category fields in asset CD master
And User enter the value in asset category for asset CD master
And User enter the value in asset type for asset CD master
And User enter the value in manufacturer for asset CD master
And User enter the value in model for asset CD master
And User enter the value in year of manufacture for asset CD master
And User enter the value in country for asset CD master
And User enter the value in remarks for asset CD master
And User click the save button for asset CD master
Then User verify the confirmation message in asset CD master
Then User click the inboxmail icon in asset CD master
And User click the search icon in asset CD master and get the reference id
And User click the submit icon in asset CD master maker
And User enter the popup remark and submit the asset CD master
And User get confirmation message and checker id in asset CD master

@AT-07.1
Scenario: To verify the user able to reject the record in asset CD master
Given User login as uls checker in asset CD master
And User click the menu in asset CD master checker
And User click the inboxicon in asset CD master checker
And User search the respective reference id and click on Action button in asset CD master
And User click the reject icon in asset CD master checker
And User enter the reject remark in asset CD master checker
And User click the final reject icon in asset CD master checker
Then User verify the Record got Rejected in asset CD checker

@AT-07.1.1
Scenario: To verify the rejected record shown in asset CD master maker stage
Given User login as uls maker in asset CD master
And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User click the inboxmail icon in asset CD master
And User verify the rejected record removed from the system in asset CD master

@AT-08
Scenario: To verify the Asset CD Master all flow
Given User login as uls maker in asset CD master
And User click the product setup in asset CD master
And User click the edit icon in asset CD master
And User click the add icon in asset CD master
Then User verify the asset category fields in asset CD master
And User enter the value in asset category for asset CD master
And User enter the value in asset type for asset CD master
And User enter the value in manufacturer for asset CD master
And User enter the value in model for asset CD master
And User enter the value in year of manufacture for asset CD master
And User enter the value in country for asset CD master
And User enter the value in remarks for asset CD master
And User click the save button for asset CD master
Then User verify the confirmation message in asset CD master
Then User click the inboxmail icon in asset CD master
And User click the search icon in asset CD master and get the reference id
And User click the submit icon in asset CD master maker
And User enter the popup remark and submit the asset CD master
And User get confirmation message and checker id in asset CD master

@AT-08.1
Scenario: To verify the user able to return the record in asset CD master
Given User login as uls checker in asset CD master
And User click the menu in asset CD master checker
And User click the inboxicon in asset CD master checker
And User search the respective reference id and click on Action button in asset CD master
And User click the return icon in asset CD master checker
And User enter the return remark in asset CD master checker
And User click the final return icon in asset CD master checker
Then User verify the Record got Returned in asset CD checker

@AT-08.1.1
Scenario: To verify the rejected record shown in asset CD master maker stage
Given User login as uls maker in asset CD master
And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User click the inboxmail icon in asset CD master
And User verify the returned record removed from the system in asset CD master

