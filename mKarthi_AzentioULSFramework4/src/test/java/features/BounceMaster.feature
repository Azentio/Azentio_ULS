Feature: To verify user is able to modify Bounce Master record in the system 
@AT-BM-006
Scenario: To verify the functional flow of Bounce master
#Given User login as uls maker in asset CD master
Given User login as uls maker new
Then User click the Configurations in asset auto master
And User click the config manager in Bounce master
And User click the Bounce master edit icon
And User click the Action edit icon in Bounce master
And User Enter the Charge applicable in Bounce master
And User click the save icon in Bounce master
And User verify while modification system enters the invalid data in Bounce master
And User Select the Charge applicable in Bounce master
And User click the save icon in Bounce master
Then User click the back button in asset CD master
And User click the Action edit icon in Bounce master
And User clear the Bounce Code in Bounce master
And User click the save icon in Bounce master
And User verify while modification, when user keep any mandatory field blank

