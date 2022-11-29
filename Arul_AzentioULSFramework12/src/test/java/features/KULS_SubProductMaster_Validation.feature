Feature: Validation of Sub product master module
Scenario: Validate the view list in Sub product master page
# This test cases also covers the functionalities of M18
# SPM_09_01, SPM_09_02, SPM_09_03, SPM_09_08, SPM_09_09, SPM_09_10, SPM_09_11, SPM_10_01, SPM_10_02, SPM_10_03, SPM_10_04, SPM_10_05, SPM_10_06, SPM_10_07, SPM_10_08, SPM_10_09, SPM_10_10, SPM_10_11, SPM_10_12

Given Launch the kuls application and login as maker
And Navigate to Sub Product Master module view list
And Verify that records present in view list are non editable
And Verify the Add button fuctionality
And Verify that all fields are present in view list while click on view icon
And Search with valid data in view list
And Search with Invalid data in view list
And Export to PDF functionality
And Export to Excel functionality
And Navigate to Sub Product Master module WIP section
And Verify that all fields are present in view list of WIP section
And Verify the Add button fuctionality in WIP
And Search with valid data in view list of WIP
And Search with Invalid data in view list of WIP
And Export to PDF functionality in WIP
And Export to Excel functionality in WIP

