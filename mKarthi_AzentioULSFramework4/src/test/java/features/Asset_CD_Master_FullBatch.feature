Feature: To verify the Asset CD Master full flow
#ACDM_01_002, ACDM_01_003, ACDM_01_004, ACDM_01_011, ACDM_01_012, ACDM_01_013, ACDM_01_014, ACDM_01_017, ACDM_01_018, ACDM_01_019, ACDM_01_020, ACDM_04_002, ACDM_04_003, ACDM_05_003
#ACDM_01_005, ACDM_01_006, ACDM_01_009,
@AT-ACD-T001
Scenario: To verify the Asset CD Master all flow
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
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

@AT-ACD-T002
Scenario: To verify user able to approve in checker stage for Asset-CD-Master
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset CD master and get the reference id
And User search the respective reference id and click on Action button in asset CD master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT-ACD-T002.1
Scenario: To verify user able to approve in checker stage and verify in maker stage for Asset-CD-Master 
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
#And User click the product setup in asset CD master
And User click the config manager in Bounce master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User validate the updated record in list view in Asset CD master

#ACDM_01_007
@AT-ACD-T003
Scenario: To verify the Asset CD Master all flow
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And User click the edit icon in asset CD master
And User click the add icon in asset CD master
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

@AT-ACD-T003.1
Scenario: To verify the user able to reject the record in asset CD master
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset CD master and get the reference id
And User search the respective reference id and click on Action button in asset CD master
And User click the reject icon in asset CD master checker
And User enter the reject remark in asset CD master checker
And User click the final reject icon in asset CD master checker
Then User verify the Record got Rejected in asset CD checker

@AT-ACD-T003.2
Scenario: To verify the rejected record shown in asset CD master maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User click the inboxmail icon in asset CD master
And User verify the rejected record removed from the system in asset CD master

#ACDM_01_008
@AT-ACD-T004
Scenario: To verify the Asset CD Master all flow
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And User click the edit icon in asset CD master
And User click the add icon in asset CD master
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

@AT-ACD-T004.1
Scenario: To verify the user able to reject the record in asset CD master
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset CD master and get the reference id
And User search the respective reference id and click on Action button in asset CD master
And User click the return icon in asset CD master checker
And User enter the return remark in asset CD master checker
And User click the final return icon in asset CD master checker
Then User verify the Record got Returned in asset CD checker

@AT-ACD-T004.2
Scenario: To verify the rejected record shown in asset CD master maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User click the inboxmail icon in asset CD master
And User verify the returned record removed from the system in asset CD master

#ACDM_02_001, ACDM_02_002, ACDM_02_003, ACDM_02_004
@AT-ACD-T005
Scenario: To verify the impact when user keep any mandatory field blank and click on save button
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And User click the edit icon in asset CD master
And User click the add icon in asset CD master
And Verify the impact when user enter characters value in numeric field in asset CD master
And Verify the impact when user enter numeric value in character field in asset CD master
And User click the save button for asset CD master
And Verify the impact when user keep any mandatory field blank in asset CD master

#ACDM_03_003, ACDM_03_004, ACDM_03_005, ACDM_03_006, ACDM_03_007, ACDM_03_008
@AT-ACD-T006
Scenario: To verify the Asset CD Master all flow
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And User click the edit icon in asset CD master
And User click the add icon in asset CD master
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

@AT-ACD-T006.1
Scenario: To verify user able to approve in checker stage for Asset-CD-Master
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset CD master and get the reference id
And User search the respective reference id and click on Action button in asset CD master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT-ACD-T006.2
Scenario: To verify system allow user to modify the Personal details before approve the record
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
And Click the listview pencil icon in asset CD master
And User update the assetcategory in asset CD master
And User update the model in asset CD master
And User click the update button for asset CD master
And User verify while modification keep any mandatory field blank and click on save button
And User update the assettype in asset CD master
And User click the update button for asset CD master

#ACDM_03_009, ACDM_03_010, ACDM_03_011,
@AT-ACD-T007
Scenario: To verify the Asset CD Master all flow
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And User click the edit icon in asset CD master
And User click the add icon in asset CD master
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

@AT-ACD-T007.1
Scenario: To verify user able to approve in checker stage for Asset-CD-Master
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset CD master and get the reference id
And User search the respective reference id and click on Action button in asset CD master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker
@AT-ACD-T007.2
Scenario: To verify the functionality of Submit button at Maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
And Click the listview pencil icon in asset CD master
And User update the assetcategory in asset CD master
And User update the assettype in asset CD master
And User click the update button for asset CD master
Then User verify the confirmation message in asset CD master
Then User click the inboxmail icon in asset CD master
And User click the search icon in asset CD master and get the reference id
And User click the submit icon in asset CD master maker
And User enter the popup remark and submit the asset CD master
And User get confirmation message and checker id in asset CD master

#ACDM_03_012, ACDM_03_013
@AT-ACD-T008
Scenario: To verify the functionality of Approve button at Checker stage
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset CD master and get the reference id
And User search the respective reference id and click on Action button in asset CD master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT-ACD-T008.1
Scenario: To verify user able to approve in checker stage for Asset-CD-Master
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User validate the updated record in list view in Asset CD master

#ACDM_03_014
@AT-ACD-T009
Scenario: To verify the Asset CD Master all flow
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And User click the edit icon in asset CD master
And User click the add icon in asset CD master
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

@AT-ACD-T009.1
Scenario: To verify user able to approve in checker stage for Asset-CD-Master
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset CD master and get the reference id
And User search the respective reference id and click on Action button in asset CD master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT-ACD-T009.2
Scenario: To verify the functionality of Submit button at Maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
And Click the listview pencil icon in asset CD master
And User update the assetcategory in asset CD master
And User update the assettype in asset CD master
And User click the update button for asset CD master
Then User verify the confirmation message in asset CD master
Then User click the inboxmail icon in asset CD master
And User click the search icon in asset CD master and get the reference id
And User click the submit icon in asset CD master maker
And User enter the popup remark and submit the asset CD master
And User get confirmation message and checker id in asset CD master

@AT-ACD-T009.3
Scenario: To verify the user able to reject the record in asset CD master
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User search the respective reference id and click on Action button in asset CD master
And User click the reject icon in asset CD master checker
And User enter the reject remark in asset CD master checker
And User click the final reject icon in asset CD master checker
Then User verify the Record got Rejected in asset CD checker

@AT-ACD-T009.4
Scenario: To verify the rejected record shown in asset CD master maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User click the inboxmail icon in asset CD master
And User verify the rejected record removed from the system in asset CD master

#ACDM_03_014
@AT-ACD-T010
Scenario: To verify the Asset CD Master all flow
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And User click the edit icon in asset CD master
And User click the add icon in asset CD master
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

@AT-ACD-T010.1
Scenario: To verify user able to approve in checker stage for Asset-CD-Master
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset CD master and get the reference id
And User search the respective reference id and click on Action button in asset CD master
And User click on Approve icon in asset CD master checker
And User click the popup remarks in asset CD master checker
Then User enter the popup remarks in asset CD master checker
And User click the popup approve in asset CD master checker
Then User verify the Record got Approved in asset CD checker

@AT-ACD-T010.2
Scenario: To verify the functionality of Submit button at Maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
And Click the listview pencil icon in asset CD master
And User update the assetcategory in asset CD master
And User update the assettype in asset CD master
And User click the update button for asset CD master
Then User verify the confirmation message in asset CD master
Then User click the inboxmail icon in asset CD master
And User click the search icon in asset CD master and get the reference id
And User click the submit icon in asset CD master maker
And User enter the popup remark and submit the asset CD master
And User get confirmation message and checker id in asset CD master

@AT-ACD-T010.3
Scenario: To verify the user able to return the record in asset CD master
Given User login as uls checker in asset CD master
And User click the inboxicon in asset CD master checker
And User click the search icon in asset CD master and get the reference id
And User search the respective reference id and click on Action button in asset CD master
And User click the return icon in asset CD master checker
And User enter the return remark in asset CD master checker
And User click the final return icon in asset CD master checker
Then User verify the Record got Returned in asset CD checker

@AT-ACD-T010.4
Scenario: To verify the rejected record shown in asset CD master maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User click the inboxmail icon in asset CD master
And User verify the returned record removed from the system in asset CD master

#ACDM_03_016, ACDM_03_017, ACDM_03_018, ACDM_03_019
@AT-ACD-T011
Scenario: To verify the functionality of Activate/Deactivate button
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
And Click the listview pencil icon in asset CD master
And User click the backbutton in asset CD master
And Click the listview pencil icon in asset CD master
And Verify the active status in asset CD master
And User click the status button in asset CD master
And Verify the Deactive status in asset CD master

#ACDM_04_008, ACDM_04_009, ACDM_04_010, ACDM_04_011, ACDM_04_012, ACDM_05_009, ACDM_05_010, ACDM_05_011, ACDM_05_012
@AT-ACD-T012
Scenario: To verify the functionality of search and pdf, excel download
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
#And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
And Verify the functionality of Export to PDF button in asset CD master
And Verify the functionality of Export to Excel button in asset CD master
And Verify the functionality of Search box with matching data in asset CD master
And Verify the functionality of Search box with mismatch data in asset CD master
And User click the edit icon in asset CD master
And Verify the functionality of Export to PDF button in asset CD master
And Verify the functionality of Export to Excel button in asset CD master
And Verify the functionality of Search box with matching data in asset CD master
And Verify the functionality of Search box with mismatch data in asset CD master

