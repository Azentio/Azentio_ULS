Feature: IncentiveMaster Functionality 
@AT-ICM-TC001
 Scenario: To verify user is able to add new Incentive Master record in the system by entering valid data
#Given User launch the kuls application
#And User Login as maker
Given User login as uls maker in asset CD master
And Click the configuration
Then User click the config manager in Appropriation master
#Then click on Misc Config 
Then click on Incentive Master eye icon
Then click on Incentive Master add button
Then Enter Incentive code
Then Enter Incentive Description 
#Then Enter Incentive Description2
#Then Enter Incentive Description3
Then Select Incentive Mode  
Then Select Incentive Type
Then Enter Flat Amount
Then Enter Incentive Percentage
Then Select Incentive Computation on 
Then click on Incentive Master Save button
Then validate Success pop up
#Then click on inbox
#Then click on inbox search icon 
#Then search Incentive Master record
#And maker user open the record from inbox
#Then maker user submit the Record
#Then user logout from the application
