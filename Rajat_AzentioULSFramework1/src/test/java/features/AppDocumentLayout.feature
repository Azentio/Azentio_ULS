Feature: Testing the over all of functionalities and Validation of Document layout details 
# This  Automation Test cases includes manual test cases CDL_01_01 CDL_01_02 CDL_01_03 
#CDL_01_04 CDL_01_05 CDL_01_06 
#CDL_01_07 CDL_01_08 CDL_01_09 CDL_01_10 CDL_01_11
#CDL_01_12 CDL_01_13 CDL_01_14 CDL_01_15 CDL_01_16 CDL_01_17 CDL_01_18 
#CDL_01_19 CDL_01_20 CDL_01_21 CDL_01_22 CDL_01_23 CDL_01_24
@AT-DLDD-004
Scenario: Document Details Parameter List View Records Verification
Given user login as a cent bank uls application
When user click the inbox icon for application new app
And User search app data in inbox list view
And User click the first edit icon of app data entry record
And user click the document details tab
And user verify add button in document list view 
And user verify search button in document list view 
And user verify pdf option in document list view
And user verify xls option in document list view 
And user verify number in document list view
And user verify Document name in document list view
And user verify Required at stage in document list view 
And user verify Document status in document list view 
And user verify Mandatory optional in document list view
And user verify Document Category in document list view
And user verify DMS upload status in document list view
And user verify number parameter non editable in document list view
And user verify Document name parameter non editable in document list view
And user verify Required at stage parameter non editable in document list view 
And user verify Document status parameter non editable in document list view 
And user verify Mandatory optional parameter non editable in document list view
And user verify Document Category parameter non editable in document list view
And user verify DMS upload status parameter non editable in document list view
And user verify the functionality of add button in document details
And user verify the functionality of back button in document details
And user search and verify match data in list view of document details
And user search and verify unmatched data in list view of document details
And user verify the functionality of pdf download in document details list view
And user verify the functionality of excel download in document details list view
@AT-DLDD-001
Scenario: creation of document details with valid details and verify the fields 
Given user login as a cent bank uls application
When user click the inbox icon for application new app
And User search app data in inbox list view
And User click the first edit icon of app data entry record
And user click the document details tab
And user verify the functionality of add button in document details
And user select the document name and verify the field is mandatory editable and dropdown
And user select the Required At Stage and verify the field is non mandatory non editable and drop down
And user select the Document status and verify the field is mandatory non editable and drop down
And user select the Mandatory optional and verify the field is mandatory non editable and drop down
And user select the Document Category and verify the field is mandatory non editable and drop down
And user select the upload date and verify the field is mandatory editable and date
And user select the Expected Date and verify the field is mandatory editable and date
And user select the Deferral Stage and verify the field is mandatory editable and dropdown
And user select the Deffered Approved by and verify the field is mandatory editable and dropdown
And user select the Change in nature approved by and verify the field is non mandatory editable and dropdown
And user select document form and verify the field is non mandatory editable and dropdown
And user select document quality and verify the field is non mandatory editable and dropdown
And user select document number and verify the field is non mandatory non editable and hyperlink
And user select document received by and verify the field is non mandatory non editable and hyperlink
And user select location where received and verify the field is non mandatory non editable and hyperlink
And user enter the rack number and verify the field is non mandatory non editable and hyperlink
And user enter the shelf number and verify the field is non mandatory non editable and hyperlink
And user enter the box number and verify the field is non mandatory non editable and hyperlink
And user enter remark and verify the field is no mandatory editable and text area
And user save the record in document details 
@AT-DLDD-002
Scenario: Validation of fields in document details layout
Given user login as a cent bank uls application
When user click the inbox icon for application new app
And User search app data in inbox list view
And User click the first edit icon of app data entry record
And user click the document details tab
And user verify the functionality of add button in document details
And user save the record in document details for blank field verification
And user verify the impact when user keep any mandatory field blank and click on save button








