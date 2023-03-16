Feature: Project Master Retail Functionality 

@ProjectMaster_ListView
 Scenario: To check the functionality of list view buttons of approved records
Given User launch the kuls application
And User Login as maker
Then click on Project Setup
Then click on Project Master eye icon
Then verify Project details list view fields should display all the fields
Then verify Values in Project details List view should be non editable
Then verify Project details add button should allow to create new record
Then verify Project details search box should display matching record with matched data
Then verify Project details search box should not display any record with mismatched data
Then click on Project details export pdf button system should download Pdf file
Then click on Project details export excel button system should download Excel file
 
 @ProjectMaster_viewworkflow
Scenario: To verify the view workflow
Given User launch the kuls application
And User Login as maker
Then click on Project Setup
Then click on Project Master edit icon
#Then click on search icon
#Then search the record
Then open the project master record
Then click on the Project Master view summary
Then verify the Project Master fields of view summary
Then close the Project Master view summary
Then user logout from the application
 @ProjectMaster
Scenario: Project Master bulding Fields validation 

Given User launch the kuls application
And User Login as maker
Then click on Project Setup
Then click on Project Master edit icon
Then open the project master record
Then click on Project Master Building add button
Then verify the field Unit Type
Then verify the field Building Name
Then verify the field Building Type
Then verify the field Total Floors
Then verify the field Total Flats
Then verify the field Tentative Start Dates
Then verify the field Tentative End Dates
Then verify the field Disbursment Amount
Then verify the field Exposed No of Flats
Then verify the field Verified By
Then verify the field Stage of Completion
Then verify the field Verified On
Then verify the field CLP
Then verify the field Flexi
Then verify the field Installment Linked
Then verify the field Down Payment Flag
Then verify the field Subvention Flag
Then verify the field CF Flag
Then verify the field Negative Remarks
Then verify the field Basic Sales Price
Then verify the field Exposure Unit
Then verify the field Overall Recommendations
Then verify the field Construction Status
Then verify the field RERA Registration 
Then verify the field RERA Registration Number
Then verify the field Building Details Remark























#Then click on Project Master eye icon
#Then click on Project Master add button