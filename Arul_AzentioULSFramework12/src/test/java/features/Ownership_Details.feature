Feature: user test the Owner ship details
Scenario: user create test case in Owner ship details module
Given user login as a cent bank uls application
When user click the inbox icon for application new app
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