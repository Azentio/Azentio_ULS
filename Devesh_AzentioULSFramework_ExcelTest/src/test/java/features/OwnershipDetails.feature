Feature: Check the functionality of Collateral Layout Ownership Layout screen
 	
  @AT_CLOL_001
  Scenario: Verify the functionality of fields of Customer Address Details screen
		Given User launch the kuls application
		And User Login as maker for transaction screen
		Then select data set ID for Collateral Layout Ownership Layout testcase001
  	Then user should click on the menuu toggle
  	Then click on inbox to search for the Ownership Details record
  	Then click on search button to search the record of Ownership Details
  	Then enter the reference id of the Ownership Details record
  	Then click on the entitle button of the Ownership Details record of that reference id
  	Then verify the availability of Ownership layout in system
  	Then verify ownership layout screen should get open with all valid fields in proper format with back and save button
  	Then verify the functionality of back button in ownership details screen
  
@OW-003 @AT_CLOL_003
Scenario: Creation of Ownership layout record with valid data
#Given User launch the kuls application
#And User Login as maker
Given User launch the kuls application
And User Login as maker for transaction screen
Then select data set ID for Collateral Layout Ownership Layout testcase003
Then click on inbox
#Then click on inbox search icon
Then click on search button to search the record of Ownership Details
Then search Ownership Details record
And maker user open the record from inbox
And naviagte to the Ownership Details Segment button
Then verify the field Owner Power Of Attorney Details
Then verify the field Name of Ownership Details  
Then verify the field Id Type is Pan Card
Then verify the field Id Number when Id Type is Pan Card
Then verify the field Issue date of Ownership Details 
Then verify the field Issue Place of Ownership Details 
Then verify the field City of Ownership Details 
Then verify the field Mobile of Ownership Details 
#Then Save Ownership Details record and validate the success pop

@AT_CLOL_004
Scenario: user create test case in Owner ship details module
#Given user login as a cent bank uls application
#When user click the inbox icon for application new app
Given User launch the kuls application
And User Login as maker for transaction screen
Then select data set ID for Collateral Layout Ownership Layout testcase004
Then click on inbox to search for the Ownership Details record
And User search Reference Number in inbox list view
And User click the first edit icon for reference id searched
#And user click Entitleicon For OwnerShip details
And user click Next button for Owener ship details tab
#And user click Owener ship details tab 
And user click save button in Owener ship details
And user verify OwnerPower Of Attorney Details parameters show validation massage for blank 
And user verify Name for paramers show validation massage for blank
And user verify Id type for paramers show validation massage for blank
And user verify Id Number for show validation massage for blank
And user verify issue Date for show validation massage for blank
And user verify issue Place for show validation massage for blank
And user verify Mobile for show validation message for blank
And User Enter Numeric Value Instead of Character value in Name Parameter
And User Enter Numeric Value Instead of Character Value In Issue Place Field
And User Enter Character Value Instead of Numeric Value In Id Number
And User Enter Character Value Instead of Numeric Value In Mobile Number Field 
And User Enter Character Value Instead of Numeric Value In Mobile Number Two Field
And User Enter Character Value Instead of Numeric Value In Phone Number Field
And User Enter Special Character Value Instead of Character Value in Name Field
And User Enter Special Character Value Instead of Character Value in Issue Place Field 
And User Enter Special Character Value Instead of Character Value in Id Number Field 
  
@AT_CLOL_006
Scenario: To verify while modification system allow user to save the record with valid data im ownership layout
#Given Launch the kuls application and Navigate to Application details view list
#Then Click the inbox in customer employment
#And click the search button in customer employement
#Then Enter app data entry in the text bar
#And click the first action icon in customer employement

Given User launch the kuls application
And User Login as maker for transaction screen
Then select data set ID for Collateral Layout Ownership Layout testcase006
Then click on inbox to search for the Ownership Details record
Then Enter app data entry stage code in the text bar
And User click the first edit icon for reference id searched
Then Click the next button in appdate entry stage
And Click the ownership layout tab
Then update the field owner in ownwership layout
And update the name in ownwership layout
Then update the field id type in ownwership layout
And update the field id number in ownership layout
Then update the issue date in ownership layout
And update the issue place in ownwership layout
Then update the field city in ownership layout
And Update the field mobile in ownership layout
Then update the field phone in ownership layout 
And update the field mobile 2 in ownership layout
Then update the fax in ownership layout
And update the field email in ownwership layout
  
  
@AT_CLOL_005
Scenario: verify the buttons available while modifying
Given User launch the kuls application
And User Login as maker
Then select data set ID for Collateral Layout Ownership Layout testcase005
Then click on inbox
Then click on inbox to search for the Ownership Details record 
Then search Ownership Details record
And maker user open the record from inbox
And naviagte to the Ownership Details Segment button
Then verify the buttons available while modifying record


