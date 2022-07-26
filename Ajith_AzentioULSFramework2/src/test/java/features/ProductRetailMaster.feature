Feature: Testing the functionalities of product master retail
Scenario: To verify the Product Master List view of records
# M11 test case includes following functionality PM_05_01 PM_05_02 PM_05_03 PM_05_04 
# PM_05_05 PM_05_06 PM_05_07 PM_05_08 PM_05_09 PM_05_10 PM_05_11 PM_05_12
Given user log in as uls application maker
When user click product set up menu
And user click temp view in product master retail
And user verify add button is displayed in screen
And user verify search for record icon is displayed in screen
And user verify export to pdf option is displayed in screen
And user verify export to excel option is displayed in screen
And user verify product group is displayed in screen
And user verify product code is displayed in screen
And user verify product description is displayed in screen
And user verify retail or corporate is displayed in screen
And user verify status is displayed in screen
And user verify Authorization status is displayed in screen
And user verify the functionality of add button
And user verify the search results show matched data
And user verify the search results shows no data
And user verify post clicking pdf option pdf file will be downloaded
And user verify post clicking xls option excel file will be downloaded
And user verify Field should show product group and will be display only
And user verify Field should be product code and will be displa yonly
And user verify Field should be auth status and will be display only
And user verify Field should be retail and corporate will be display only
And user verify Field should be status and will be display only
And user verify Field should be auth status and will be display only