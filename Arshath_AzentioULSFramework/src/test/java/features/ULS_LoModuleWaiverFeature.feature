Feature: To test the functionality of lo Module waiver
Scenario: To verify user can able to verify the input fields and can able to save and submit the LO Module waiver record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config manager main menu
And click on temp view on LO Module waiver 
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
When user select waiver type as FI FCU Legal waiver
Then system should display only Verification type and waiving authority
Then verify verification type field should be non mendatory and dropdown
And user can able to select the data from the verification type dropdown
Then verify waiving authority field should be non mendatory and dropdown
And user can able to select the data from the waiving authority dropdown
When user select waiver type as Personel discussion waiver
Then system should display only PD type and waiving authority
Then verify PD Type field should be non mendatory and dropdown
And user can able to select the data from the PD Type dropdown
Then verify waiving authority field should be non mendatory and dropdown
And user can able to select the data from the waiving authority dropdown
When user select waiver type as ROI change waiver
Then system should display only document category document type and waiving authority
Then verify document category field should be non mendatory and dropdown
And user can able to select the data from the document category dropdown
Then verify document type field should be non mendatory and dropdown
And user can able to select the data from the document type dropdown
Then verify waiving authority field should be non mendatory and dropdown
And user can able to select the data from the waiving authority dropdown
When user select waiver type as valuation waiver
Then system should display only valuation type and waiving authority 
Then verify valuation type field should be non mendatory and dropdown
And user can able to select the data from the valuation type dropdown
Then verify waiving authority field should be non mendatory and dropdown
And user can able to select the data from the waiving authority dropdown
And click on save button to save the Lo waiver record
Then verify the success pop up is coming after saving the record
And click on mail box icon in lo waiver
And search the lo waiver event code and select the first record
Then submit the record in maker end
Then store the reviewr ID
@CheckerApproval
Scenario: To verify checker user can able to approve the Lo Module waiver record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on approve button to approve the record
And enter the remark in alert tab 
And click on approve button in alert box
Then verify record is approved in checker stage 
@CheckerReject
Scenario: To verify checker user can able to rejected the Lo Module waiver record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on reject button to reject the record
And enter the remark in alert tab fo rejection
And click on reject button in alert box
Then verify record is rejected in checker stage 
@CheckerReturn
Scenario: To verify checker user can able to return the Lo Module waiver record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on return button to return the record
And enter the remark in alert tab fo return
And click on return button in alert box
Then verify record is return in checker stage

@Negative
Scenario: To verify user can not able to create the waiver record with invalid input
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to configuration main menu
And click on config manager main menu
And click on temp view on LO Module waiver 
And click on add button to create LO Module waiver record
And keep mendatory field as blank and click on save button
Then verify system should through the validation for balnk field
And in waiver type dropdown select the invalid input
Then click on save button to verify system allowing to user to save or not 


@AT-LO-006
Scenario: To verify checker user can able to approve the Lo Module waiver record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on approve button to approve the record
And enter the remark in alert tab 
And click on approve button in alert box
Then verify record is approved in checker stage 
@AT-LO-008
Scenario: To verify checker user can able to rejected the Lo Module waiver record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on reject button to reject the record
And enter the remark in alert tab fo rejection
And click on reject button in alert box
Then verify record is rejected in checker stage 
@AT-LO-009
Scenario: To verify checker user can able to return the Lo Module waiver record
Given Navigate to ULS application URL
And login with checker credentials
And click on notificatrion in checker stage
And select the record by the help of reference ID 
And click on return button to return the record
And enter the remark in alert tab fo return
And click on return button in alert box
Then verify record is return in checker stage