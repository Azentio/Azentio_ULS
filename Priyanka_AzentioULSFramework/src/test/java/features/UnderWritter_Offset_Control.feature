Feature: UnderWritter Offset Control Functionality 

@UnderWritter_Offset_Control 
 Scenario: System should display the proper validation post entering the invalid data and clicking on save button
Given User launch the kuls application
And User Login as maker
Then click on the Business Rule
Then click on the UnderWritter Offset Control eye icon
Then Modify the UnderWritter Offset Control approved record
Then save the record
Then click on the inbox
And search UnderWritter Offset Control record from inbox
Then maker user open the UnderWritter record from inbox
And maker user submit the UnderWritter record
Then user logout from the application
And User Login as Checker
Then click on the inbox
And search UnderWritter Offset Control record from inbox
Then checker open the record from inbox
Then checker approve the record
Then user logout from the application
And User Login as maker
Then click on the Business Rule
Then click on the UnderWritter Offset Control eye icon
Then Validate the aapproved record
Then user logout from the application


