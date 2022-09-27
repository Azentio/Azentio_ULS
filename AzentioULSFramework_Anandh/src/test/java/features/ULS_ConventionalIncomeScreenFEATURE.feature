Feature: to test the conventional personal details record
@AT-CLID-001
Scenario: To verify list view and pdf excel download in conventional income details screen
Given navigate to uls application 
And login with maker credentials
And click on mail box 
And search for app data entry record
And select the app data entry first record
And select the customer additional info tab
And select the list view first record of customer personal details record
Then verify reference list view area is visible in application screen
And select the first record of referencelist view 
And get the data from the application screen of salutation name mobile number and years of known and status
Then verify records are matching with our list view record
And click on export button in reference list view
And click on pdf in reference list view
Then verify pdf file is downloaded in our system
And click on xls field option in export section 
Then verify xls field is downloaded in the download section