Feature: Verify the functionalities of  Bounce master Module
@Bounce_Master_M1
Scenario: Validate that user can able to create a bounce master record
Given Launch the kuls application and Navigate to bounce master module view list
And Click on Add icon of bounce master
And User update test data for Bounce master creation checker approve
And Enter the value in Bounce code field of bounce master
And Select the value in Charge applicable field of bounce master
And Select the value in Bounce description field of bounce master
And Select the value in Bounce description2 field of bounce master
And Select the value in Bounce description3 field of bounce master
Then Click on Save button in bounce master
And Click on Mail icon for bounce master
And Search the respictive bounce master record
And Store the reference number and click on first bounce master record
Then Submit the bounce master record from maker user
And User Capture Checker id from the submit popup for Bounce Master

@Bounce_Master_M1.1
Scenario: Validate that user can able to create a Bounce master record and approve by checker user
Given Login into KULS for checker user
And Click on Mail icon for bounce master
And Search the respective reference id and click on Action button for bounce master
And Click on Approve button for bounce master
And Enter the remarks in action confirmation popup for bounce master
And Click on Remarks button in action confirmation popup for bounce master
Then Verify the record approved popup for bounce master

@Bounce_Master_M1.2
Scenario: Validate that approved bounce master record is present in the view list
Given Launch the kuls application and Navigate to bounce master module view list
Then verify that approved bounce master record is present in the view list

@Bounce_Master_M2
Scenario: Validate that user can able to create a bounce master record
Given Launch the kuls application and Navigate to bounce master module view list
And Click on Add icon of bounce master
And User update test data for Bounce master creation checker reject
And Enter the value in Bounce code field of bounce master
And Select the value in Charge applicable field of bounce master
And Select the value in Bounce description field of bounce master
And Select the value in Bounce description2 field of bounce master
And Select the value in Bounce description3 field of bounce master
Then Click on Save button in bounce master
And  Click on Mail icon for bounce master
And Search the respictive bounce master record
And Store the reference number and click on first bounce master record
Then Submit the bounce master record from maker user
And User Capture Checker id from the submit popup for Bounce Master

@Bounce_Master_M2.1
Scenario: Validate that user can able to create a bounce master record and reject by checker user
Given Login into KULS for checker user
And Click on Mail icon for bounce master
And Search the respective reference id and click on Action button for bounce master
And Click on reject button for bounce master
And Enter the remarks in action confirmation popup for bounce master rejection
And Click on remarks button action confirmation popup for bounce master rejection
Then Verify the record rejected popup for bounce master

@Bounce_Master_M2.2
Scenario: Validate that rejected record is present in the view list
Given Launch the kuls application and Navigate to bounce master module view list
Then verify that rejected bounce master record is not present in the view list


@Bounce_Master_M3
Scenario: Validate that user can able to create a bounce master master record
Given Launch the kuls application and Navigate to bounce master module view list
And Click on Add icon of bounce master
And User update test data for Bounce master creation checker return
And Enter the value in Bounce code field of bounce master
And Select the value in Charge applicable field of bounce master
And Select the value in Bounce description field of bounce master
And Select the value in Bounce description2 field of bounce master
And Select the value in Bounce description3 field of bounce master
Then Click on Save button in bounce master
And  Click on Mail icon for bounce master
And Search the respictive bounce master record
And Store the reference number and click on first bounce master record
Then Submit the bounce master record from maker user
And User Capture Checker id from the submit popup for Bounce Master

@Bounce_Master_M3.1
Scenario: Validate that user can able to create a bounce master record and return by checker user
Given Login into KULS for checker user
And Click on Mail icon for bounce master
And Search the respective reference id and click on Action button for bounce master
And Click on return button for bounce master
And Enter the remarks in action confirmation popup for bounce master return
And Click on remarks button action confirmation popup for bounce master return
Then Verify the record returned popup for bounce master

@Bounce_Master_M3.2
Scenario: Validate that returned record is present in the view list
Given Launch the kuls application and Navigate to bounce master module view list
And Navigate to temp view of bounce master
Then verify that returned bounce master record is present in the temp view

@Bounce_Master_M4
Scenario: Validate all fiedls of Bounce master
Given Launch the kuls application and Navigate to bounce master module view list
And Click on Add icon of bounce master
And User update test data for Bounce master creation validation
Then Click on Save button and validate the field is required popup in Bounce master
And Click on back button of bounce master
And Click on Add icon of bounce master
And Enter special characters in all fields and validate the popup in bounce master

@Bounce_Master_M5
Scenario: verify system allow user to do a modification on before approve the record
Given Launch the kuls application and Navigate to bounce master module view list
And User click on Bounce Master Temp view
And User click the Action edit icon in Bounce master
And User update test data for Bounce master updation
And user update the Bounce code field
And user update the Charge Applicable field
And user update the Bounce Description field
And user update the Bounce Description2 field
And user update the Bounce Description3 field
And user click the save button

@Bounce_Master_M6
Scenario: To verify the functional flow of Bounce master
Given Launch the kuls application and Navigate to bounce master module view list
And User click the Bounce master edit icon
And User click the Action edit icon in Bounce master
And User update test data for Bounce master updation validation
And User Enter the Charge applicable in Bounce master
And User click the save icon in Bounce master
And User verify while modification system enters the invalid data in Bounce master
And Click on back button of bounce master
And User click the Action edit icon in Bounce master
And User clear the Bounce Code in Bounce master
And User click the save icon in Bounce master
And User verify while modification, when user keep any mandatory field blank

@Bounce_Master_M7
Scenario: verify system allow user to do a modification on already approved record
Given Launch the kuls application and Navigate to bounce master module view list
And User click the Action edit icon in Bounce master
And User update test data for Bounce master updationand checker approve
And user update the Bounce code field
And user update the Charge Applicable field
And user update the Bounce Description field
And user update the Bounce Description2 field
And user update the Bounce Description3 field
And user click the save buttons
And  Click on Mail icon for bounce master
And Search the respictive bounce master record
And Store the reference number and click on first bounce master record
Then Submit the bounce master record from maker user
And User Capture Checker id from the submit popup for Bounce Master

@Bounce_Master_M7.1
Scenario: Validate that user can able to update a Bounce master record and approve by checker user
Given Login into KULS for checker user
And Click on Mail icon for bounce master
And Search the respective reference id and click on Action button for bounce master
And Click on Approve button for bounce master
And Enter the remarks in action confirmation popup for bounce master
And Click on Remarks button in action confirmation popup for bounce master
Then Verify the record approved popup for bounce master

@Bounce_Master_M8
Scenario: verify system allow user to do a modification on already approved record
Given Launch the kuls application and Navigate to bounce master module view list
And User click the Action edit icon in Bounce master
And User update test data for Bounce master updation and checker reject
And user update the Bounce code field
And user update the Charge Applicable field
And user update the Bounce Description field
And user update the Bounce Description2 field
And user update the Bounce Description3 field
And user click the save buttons
And  Click on Mail icon for bounce master
And Search the respictive bounce master record
And Store the reference number and click on first bounce master record
Then Submit the bounce master record from maker user
And User Capture Checker id from the submit popup for Bounce Master

@Bounce_Master_M8.1
Scenario: Validate that user can able to update a bounce master record and reject by checker user
Given Login into KULS for checker user
And Click on Mail icon for bounce master
And Search the respective reference id and click on Action button for bounce master
And Click on reject button for bounce master
And Enter the remarks in action confirmation popup for bounce master rejection
And Click on remarks button action confirmation popup for bounce master rejection
Then Verify the record rejected popup for bounce master

@Bounce_Master_M9
Scenario: verify system allow user to do a modification on already approved record
Given Launch the kuls application and Navigate to bounce master module view list
And User click the Action edit icon in Bounce master
And User update test data for Bounce master updation and checker return
And user update the Bounce code field
And user update the Charge Applicable field
And user update the Bounce Description field
And user update the Bounce Description2 field
And user update the Bounce Description3 field
And user click the save buttons
And  Click on Mail icon for bounce master
And Search the respictive bounce master record
And Store the reference number and click on first bounce master record
Then Submit the bounce master record from maker user
And User Capture Checker id from the submit popup for Bounce Master

@Bounce_Master_M9.1
Scenario: Validate that user can able to update a bounce master record and return by checker user
Given Login into KULS for checker user
And Click on Mail icon for bounce master
And Search the respective reference id and click on Action button for bounce master
And Click on return button for bounce master
And Enter the remarks in action confirmation popup for bounce master return
And Click on remarks button action confirmation popup for bounce master return
Then Verify the record returned popup for bounce master

@Bounce_Master_M10
Scenario: Validate all fiedls in view list of Bounce master
Given Launch the kuls application and Navigate to bounce master module view list
And User update test data for Bounce master view list validation
And Validate all fields present in bounce master view list
And Validate that records in bounce master view list is non editable
And Search with valid test data in bounce master view list
And Search with invalid test data in bounce master view list
And Validate the export to PDF functionality of bounce master
And Validate the export to Excel functionality of bounce master
And Click on Add icon of bounce master
And Click on back button of bounce master
And Navigate to temp view of bounce master
And Select the existing record in bounce master
And Validate the view summary of bounce master
