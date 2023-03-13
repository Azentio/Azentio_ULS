Feature: check the Funtionality of LoModule Waiver
@AT-LO-014
Scenario: List view of Waiver Module Master - WIP records
Given User Launch the KULS application 
Then user click on configurations Tab
When user click Config Manager menu
And click on temp view on LO Module waiver 
And user verify the values should be non editable
And click on add button to create LO Module waiver record
Then verify waiver type field should be mandatory and editable dropdown
When user select waiver type as document waiver
Then system should display only document category document type and waiving authority
Then verify document category field should be non mendatory and dropdown
And user can able to select the data from the document category dropdown
Then verify document type field should be non mendatory and dropdown
And user can able to select the data from the document type dropdown
Then verify waiving authority field should be non mendatory and dropdown
And user can able to select the data from the waiving authority dropdown
Then system should display only Verification type and waiving authority
Then verify verification type field should be non mendatory and dropdown
And user can able to select the data from the verification type dropdown
And click on save button to save the Lo waiver record
Then verify the success pop up is coming after saving the record
And click on mail box icon in lo waiver
And search the lo waiver event code and select the first record
And user verify the functionality of View in process records button
And click on temp view on LO Module waiver 
And user verify the functionality of Search box with Matching data
And user verify the functionality of Search box with Mismatching data
And user verify the functionality of Export to PDF file
And user verify the functionality of Export to Excel file






































