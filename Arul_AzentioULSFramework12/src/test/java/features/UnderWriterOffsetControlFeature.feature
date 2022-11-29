Feature: Verify the field validation of Under writer offset control module
@UnderWriter_OffsetConrolM11
Scenario: validate the list view and WIP fields of under writer offset control
#This test case is also cover the functinality of M12, M13
# UOC_04_08, UOC_04_09, UOC_04_10, UOC_04_11, ACT_05_01, ACT_05_02, ACT_05_03, ACT_05_04, ACT_05_05, ACT_05_06, ACT_05_07
Given Launch the kuls application and Navigate to under writer offset control view list
And Validate all fields in list view of under writer offset control
And Validate that values in list view of under writer offset control is non editable
And Validate the functionalitiy of Add button of under writer offset control
And Click on Back icon of under writer offset control
And Verify that user can click on view inporgress in view list of under writer offset control
And Click on Back icon of under writer offset control
And Search with valid data in under writer offset control
And Search with Invalid data in under writer offset control
And Validate Export to PDF functionality of under writer offset control
And Validate export to Excel functionality of under writer offset control
And Navigate to Temp view of under writer offset control
And Validate the fields are present in WIP of under writer offset control
And Validate the functionalitiy of Add button of under writer offset control
And Click on Back icon of under writer offset control
And Search with valid data in under writer offset control
And Search with Invalid data in under writer offset control
And Validate Export to PDF functionality of under writer offset control
And Validate export to Excel functionality of under writer offset control
And Navigate to Temp view of under writer offset control
And Click on pencil icon of first record in temp view of under writer offset control
Then Validate the functionality of View summary section in under writer offset control