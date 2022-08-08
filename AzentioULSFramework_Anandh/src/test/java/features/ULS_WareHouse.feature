Feature: To Test the ware House master
@wareHouse1
Scenario: To verify list view of wareHouse master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And Go to config manager main menu
And click on view button in ware house master
Then verify list view records are non editable
Then verify user can able to add the record in to the ware house master screen

@WareHouse2
Scenario:  TO verify user can able to serach the list view record with matching and un matching input and user can able to download the the xls and pdf format file
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And Go to config manager main menu
And click on view button in ware house master
And click on search button in ware house list view
And enter the matching data in search test box
Then verify user can able to see the matching record
And enter invalid text inputin search box
Then verify system should not show the result for the un matched record
And click on export button
And choose xls format to download the Xls file
Then verify xls file is downloded in download section
And click on export button
And choose pdf format to download pdf file
Then verify pdf file is downloded in download section
@WareHouse3
Scenario: To verify the list view data in wareHouse master
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And Go to config manager main menu
And click on view button in ware house master
And select the first approved record
And Get The approved record data
Then verify System should display the currect description value
Then verify system should display the currect address value
#Then verify System should display the currect country value
#Then verify system should display the currect state value
#Then verify system should display the currect city value
#Then verify system should display the currect zip code value
Then verify system should display the currect phone 1 value
Then verify system should display the currect fax value
Then verify system should display the currect mail value
Then verify system shoudl display the currect contarct person value
Then verify system shoudl display the exact status of the record
@WareHouse4
Scenario: To verify the list view of WIP Record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And Go to config manager main menu
And click on temp view in wareHouse master screen
Then verify WIP list view records are non editable
Then verify user can able to add the record in to the ware house master screen
And click on search button in ware house list view
And enter the matching data in search test box
Then verify user can able to see the matching record
And enter invalid text inputin search box
Then verify system should not show the result for the un matched record
And click on export button
And choose xls format to download the Xls file
Then verify xls file is downloded in download section
And click on export button
And choose pdf format to download pdf file
Then verify pdf file is downloded in download section
And click on temp view in wareHouse master screen
And select the first record in WIP
And Get The WIP record data
Then verify System should display the currect description value
Then verify system should display the currect address value
#Then verify System should display the currect country value
#Then verify system should display the currect state value
#Then verify system should display the currect city value
#Then verify system should display the currect zip code value
Then verify system should display the currect phone 1 value
Then verify system should display the currect fax value
Then verify system should display the currect mail value
Then verify system shoudl display the currect contarct person value
Then verify system shoudl display the exact status of the record


