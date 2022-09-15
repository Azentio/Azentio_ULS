Feature: ReportMaster Functionality 

@ReportMaster25 
 Scenario: To verify user is able to reject  Report Group Master record
Given User launch the kuls application
And User Login as maker
Then click on Config Manager
Then click on Report Master Checkbox
Then search Report Master record from view List
Then click on Report Group Master segment button
#Then click on Report Master AddButton
#Then click on Report Parameter Details AddButton
#Then click on Report Group Master
Then click on Report Group Master AddButton
Then Enter Group Name
Then Enter Group Description
Then Enter Min Required Parameter
Then save Report Group Master Record
Then validate Success pop up
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
Then checker user open the record from inbox
Then checker user reject the record

@ReportMaster26
 Scenario: To verify user is able to return  Report Group Master record
Given User launch the kuls application
And User Login as maker
Then click on Config Manager
Then click on Report Master Checkbox
Then search Report Master Reject record from view List
Then click on Report Group Master segment button
#Then click on Report Master AddButton
#Then click on Report Parameter Details AddButton
#Then click on Report Group Master
Then click on Report Group Master AddButton
Then Enter Group Name
Then Enter Group Description
Then Enter Min Required Parameter
Then save Report Group Master Record
Then validate Success pop up
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
Then checker user open the record from inbox
Then checker user return the record

@ReportMaster24 
 Scenario: To verify user is able to add new ReportMaster record in the system by entering valid data
Given User launch the kuls application
And User Login as maker
Then click on Config Manager
Then click on Report Master Checkbox
Then search Report Master Return record from view List
Then click on Report Group Master segment button
#Then click on Report Master AddButton
#Then click on Report Parameter Details AddButton
#Then click on Report Group Master
Then click on Report Group Master AddButton
Then Enter Group Name
Then Enter Group Description
Then Enter Min Required Parameter
Then save Report Group Master Record
Then validate Success pop up
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
And maker user open the record from inbox
Then maker user submit the Record
Then user logout from the application
And User Login as Checker
Then click on inbox
Then click on inbox search icon 
Then search Report Group Master record
Then checker user open the record from inbox
Then checker user approve the record

