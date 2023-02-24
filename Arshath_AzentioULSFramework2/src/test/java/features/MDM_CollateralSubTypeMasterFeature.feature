Feature: Verify the functionalities of  Collateral subtype master Module
@Collaterel_SubType_M1
Scenario: Validate that user can able to create a collateral subtype master record
Given Launch the kuls application and Navigate to collateral subtype module view list
And Click on Add icon of collateral sub type
And Update test data for collateral sub type creation and checker approve
And Enter the value in Description field of collateral sub type
And Enter the value in Asset_CollateralSubtypeCode field
And Select the value in Asset_CollateralType field
And Enter the value in Exposure field
And Enter the value in Asset_CollateralValuationTolerance field
And Enter the value in Remarks field of collateral sub type
Then Click on Save button in collateral subtype
And  Click on Mail icon for collateral sub type
And Search the collateral sub type record
And Store the reference number and click on first collateral subtype record
Then Submit the collateral sub type record from maker user
And User Capture Checker id from the submit popup

@Collaterel_SubType_M1.1

Scenario: Validate that user can able to create a collateral subtype master record and approve by checker user
And Update test data for collateral sub type creation and checker approve
Given Login into KULS for checker user
#And Click on Menu icon for collateral sub type
And Click on Mail icon for collateral sub type
And Search the respective reference id and click on Action button for collatral sub type
And Click on Approve button for collateral sub type
And Enter the remarks in action confirmation popup for collateral sub type
And Click on Remarks button in action confirmation popup for collateral sub type
Then Verify the record approved popup for collateral sub type

@Collaterel_SubType_M1.2
Scenario: Validate that approved collateral subtype master record is present in the view list
Given Launch the kuls application and Navigate to collateral subtype module view list
Then verify that approved collateral sub type record is present in the view list

@Collaterel_SubType_M2
Scenario: Validate that user can able to create a collateral subtype master record
Given Launch the kuls application and Navigate to collateral subtype module view list
And Click on Add icon of collateral sub type
And Update test data for collateral sub type creation and checker reject
And Enter the value in Description field of collateral sub type
And Enter the value in Asset_CollateralSubtypeCode field
And Select the value in Asset_CollateralType field
And Enter the value in Exposure field
And Enter the value in Asset_CollateralValuationTolerance field
And Enter the value in Remarks field of collateral sub type
Then Click on Save button in collateral subtype
And  Click on Mail icon for collateral sub type
And Search the collateral sub type record
And Store the reference number and click on first collateral subtype record
Then Submit the collateral sub type record from maker user
And User Capture Checker id from the submit popup

@Collaterel_SubType_M2.1
Scenario: Validate that user can able to create a collateral subtype master record and reject by checker user
And Update test data for collateral sub type creation and checker reject
Given Login into KULS for checker user
#And Click on Menu icon for collateral sub type
And Click on Mail icon for collateral sub type
And Search the respective reference id and click on Action button for collatral sub type
And Click on reject button for collateral sub type
And Enter the remarks in action confirmation popup for collateral sub type rejection
And Click on remarks button action confirmation popup for collateral sub type rejection
Then Verify the record rejected popup for collateral sub type

@Collaterel_SubType_M2.2
Scenario: Validate that rejected record is present in the view list
Given Launch the kuls application and Navigate to collateral subtype module view list
Then verify that rejected collateral sub type record is not present in the view list


@Collaterel_SubType_M3
Scenario: Validate that user can able to create a collateral subtype master record
Given Launch the kuls application and Navigate to collateral subtype module view list
And Update test data for collateral sub type creation and checker reject
And Click on Add icon of collateral sub type
And Enter the value in Asset_CollateralSubtypeCode field
And Enter the value in Description field of collateral sub type
And Enter the value in Asset_CollateralSubtypeCode field for checker return
And Select the value in Asset_CollateralType field
And Enter the value in Exposure field
And Enter the value in Asset_CollateralValuationTolerance field
And Enter the value in Remarks field of collateral sub type
Then Click on Save button in collateral subtype
And  Click on Mail icon for collateral sub type
And Search the collateral sub type record
And Store the reference number and click on first collateral subtype record
Then Submit the collateral sub type record from maker user
And User Capture Checker id from the submit popup

@Collaterel_SubType_M3.1
Scenario: Validate that user can able to create a collateral subtype master record and return by checker user
And Update test data for collateral sub type creation and checker reject
Given Login into KULS for checker user
#And Click on Menu icon for collateral sub type
And Click on Mail icon for collateral sub type
And Search the respective reference id and click on Action button for collatral sub type
And Click on return button for collateral sub type
And Enter the remarks in action confirmation popup for collateral sub type return
And Click on remarks button action confirmation popup for collateral sub type return
Then Verify the record returned popup for collateral sub type

@Collaterel_SubType_M3.2
Scenario: Validate that returned record is present in the view list
Given Launch the kuls application and Navigate to collateral subtype module view list
And Update test data for collateral sub type creation and checker reject
And Navigate to temp view of collateral sub type
Then verify that returned collateral sub type record is present in the temp view

@Collaterel_SubType_M4
Scenario: Validate all fiedls of collateral sub type master
Given Launch the kuls application and Navigate to collateral subtype module view list
And Click on Add icon of collateral sub type
Then Click on Save button and validate the field is required popup
And Click on back button of Collateral sub type
And Click on Add icon of collateral sub type
And Enter special characters in all fields and validate the popup

@Collaterel_SubType_M5
Scenario: Validate the user can able to update collateral sub type record
Given Launch the kuls application and Navigate to collateral subtype module view list
And Navigate to temp view of collateral sub type
And Select the existing record in collateral sub type
And Update test data for collateral sub type update
And Update the value in Description field of collateral sub type
And Update the value in Asset_CollateralSubtypeCode field
And Update the value in Asset_CollateralType field
And Update the value in Exposure field
And Update the value in Asset_CollateralValuationTolerance field
And Update the value in Remarks field of collateral sub type
Then Click on Save button in collateral subtype


@Collaterel_SubType_M6
Scenario: Validate the user can able to update collateral sub type record
Given Launch the kuls application and Navigate to collateral subtype module view list
And Select the existing record in collateral sub type
And Update test data for collateral sub type update
And Update the value in Description field of collateral sub type
And Update the value in Asset_CollateralSubtypeCode field for checker approve
And Update the value in Asset_CollateralType field
And Update the value in Exposure field
And Update the value in Asset_CollateralValuationTolerance field
And Update the value in Remarks field of collateral sub type
Then Click on Save button in collateral subtype
And  Click on Mail icon for collateral sub type
And Search the collateral sub type record
And Store the reference number and click on first collateral subtype record
And Validate the record in mail box with updated record for checker approve
Then Submit the collateral sub type record from maker user
And User Capture Checker id from the submit popup

@Collaterel_SubType_M6.1
Scenario: Validate the user can able to update collateral sub type record and approve by checker
And Update test data for collateral sub type update
Given Login into KULS for checker user
#And Click on Menu icon for collateral sub type
And Click on Mail icon for collateral sub type
And Search the respective reference id and click on Action button for collatral sub type
And Click on Approve button for collateral sub type
And Enter the remarks in action confirmation popup for collateral sub type
And Click on Remarks button in action confirmation popup for collateral sub type
Then Verify the record approved popup for collateral sub type

@Collaterel_SubType_M7
Scenario: Validate the updation of collateral sub type record with all field validation
# This test case also covers the functionality of M10 and Back button functionality
# ACST_03_19, ACST_03_20, ACST_03_21, ACST_01_09, ACST_03_23
Given Launch the kuls application and Navigate to collateral subtype module view list
And Navigate to temp view of collateral sub type
And Select the existing record in collateral sub type
And Clear the value in required fields and validate the field required popup
And Click on back button of Collateral sub type
And Select the existing record in collateral sub type
Then Update the field value as special character and validate the error popup
And Click on back button of Collateral sub type
And Select the existing record in collateral sub type
And Update the status of collateral sub type record
Then Click on Save button in collateral subtype
And Select the existing record in collateral sub type
And Update the status of collateral sub type record
Then Click on Save button in collateral subtype

@Collaterel_SubType_M8
Scenario: Validate the user can able to update collateral sub type record
Given Launch the kuls application and Navigate to collateral subtype module view list
#And Navigate to temp view of collateral sub type
And Select the existing record in collateral sub type
And Update test data for collateral sub type update
And Update the value in Description field of collateral sub type
And Update the value in Asset_CollateralSubtypeCode field for checker reject
And Update the value in Asset_CollateralType field
And Update the value in Exposure field
And Update the value in Asset_CollateralValuationTolerance field
And Update the value in Remarks field of collateral sub type
Then Click on Save button in collateral subtype
And  Click on Mail icon for collateral sub type
And Search the collateral sub type record
And Store the reference number and click on first collateral subtype record
And Validate the record in mail box with updated record for checker reject
Then Submit the collateral sub type record from maker user
And User Capture Checker id from the submit popup

@Collaterel_SubType_M8.1
Scenario: Validate the user can able to update collateral sub type record and reject by checker
And Update test data for collateral sub type update
Given Login into KULS for checker user
#And Click on Menu icon for collateral sub type
And Click on Mail icon for collateral sub type
And Search the respective reference id and click on Action button for collatral sub type
And Click on reject button for collateral sub type
And Enter the remarks in action confirmation popup for collateral sub type rejection
And Click on remarks button action confirmation popup for collateral sub type rejection
Then Verify the record rejected popup for collateral sub type

@Collaterel_SubType_M9
Scenario: Validate the user can able to update collateral sub type record
Given Launch the kuls application and Navigate to collateral subtype module view list
#And Navigate to temp view of collateral sub type
And Select the existing record in collateral sub type
And Update test data for collateral sub type update
And Update the value in Description field of collateral sub type
And Update the value in Asset_CollateralSubtypeCode field for chcker return
And Update the value in Asset_CollateralType field
And Update the value in Exposure field
And Update the value in Asset_CollateralValuationTolerance field
And Update the value in Remarks field of collateral sub type
Then Click on Save button in collateral subtype
And  Click on Mail icon for collateral sub type
And Search the collateral sub type record
And Store the reference number and click on first collateral subtype record
And Validate the record in mail box with updated record for checker return
Then Submit the collateral sub type record from maker user
And User Capture Checker id from the submit popup

@Collaterel_SubType_M9.1
Scenario: Validate the user can able to update collateral sub type record and return by checker
And Update test data for collateral sub type update
Given Login into KULS for checker user
#And Click on Menu icon for collateral sub type
And Click on Mail icon for collateral sub type
And Search the respective reference id and click on Action button for collatral sub type
And Click on return button for collateral sub type
And Enter the remarks in action confirmation popup for collateral sub type return
And Click on remarks button action confirmation popup for collateral sub type return
Then Verify the record returned popup for collateral sub type

@Collaterel_SubType_M11
Scenario: Validate the collateral sub type view list
#This test case also cover the functionality of M12, M13, M14, M15
#ACST_04_01, ACST_04_02, ACST_04_03, ACST_04_08, ACST_04_09, ACST_04_10, ACST_04_11, ACST_05_01, ACST_05_02, ACST_05_03, ACST_05_10, ACST_05_11, ACST_05_12 ACST_05_13, ACST_04_04, ACST_05_04
Given Launch the kuls application and Navigate to collateral subtype module view list
And Validate the fields present in collateral sub type view list
And Validate that records in collateral sub type view list is non editable
And Search with valid test data in collateral sub type view list
And Search with invalid test data in collateral sub type view list
And Validat the export to PDF functionality of collateral sub type
And Validat the export to Excel functionality of collateral sub type
And Navigate to temp view of collateral sub type
And Validate the fields in WIP of collateral sub type
And Search with valid test data in collateral sub type WIP
And Search with invalid test data in collateral sub type WIP
And Validat the export to PDF functionality of collateral sub type 
And Validat the export to Excel functionality of collateral sub type
And Click on Add icon of collateral sub type
And Update test data for collateral sub type creation and checker approve
And Enter the value in Description field of collateral sub type
And Update test data for collateral sub type creation and checker reject
And Enter the value in Asset_CollateralSubtypeCode field for checker reject
And Select the value in Asset_CollateralType field
And Enter the value in Exposure field
And Enter the value in Asset_CollateralValuationTolerance field
And Enter the value in Remarks field of collateral sub type
Then Click on Save button in collateral subtype
And  Click on Mail icon for collateral sub type
And Search the collateral sub type record
And Store the reference number and click on first collateral subtype record
And Validate the view summary of collateral sub type
