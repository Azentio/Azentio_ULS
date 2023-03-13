Feature: Ownership Details Functionality 

@OW_002
 Scenario: Validate all the fields of Ownership Details Screen
Given User Launch the KULS url for Transaction
And user click on Inbox Icon
And user click search icon
And user update the Excelsheet Testdata for validation
Then search Ownership Details record
And user click on First record of Appdata Entry
And naviagte to the Ownership Details Segment button
Then verify the field Owner Power Of Attorney Details
Then verify the field Name of Ownership Details  
Then verify the field Id Type is Pan Card
Then verify the field Id Number when Id Type is Pan Card
Then verify the field Id Type is Aadhar Card
Then verify the field Id Number when Id Type is Aadhar Card
Then verify the field Issue date of Ownership Details 
Then verify the field Issue Place of Ownership Details 
Then verify the field City of Ownership Details 
Then verify the field Mobile of Ownership Details 
#Then verify the field Phone of Ownership Details 
Then verify the field Mobile2 of Ownership Details 
Then verify the field Fax of Ownership Details 
Then verify the field Email of Ownership Details 


@OW_003
 Scenario: Creation of Ownership layout record with valid data
Given User launch the kuls application
And User Login as maker
Then click on inbox
Then click on inbox search icon 
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