Feature: To verify the functional flow for customer entity layout facility details
#customer entity layout facility details
@AT-FD-001
Scenario: To verify the functional flow for customer entity layout facility details
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in customer entity layout facility details
And User click the facility info tab in customer entity layout facility details
And User click the add icon in customer entity layout facility details
And User click the back button in customer entity layout facility details
And User click the add icon in customer entity layout facility details
And User enter the primary product in customer entity layout facility details
And User enter the primary sub product in customer entity layout facility details
And User enter the scheme in customer entity layout facility details
And User enter the program code in customer entity layout facility details
And User enter the facility type in customer entity layout facility details
And User enter the servicing branch in customer entity layout facility details
And User enter the pricing or interest indicator in customer entity layout facility details
And User enter the declared asset value in customer entity layout facility details
And User enter the declared down payment amount in customer entity layout facility details
And User enter the requested amount in customer entity layout facility details
And User enter the currency in customer entity layout facility details
And User enter the expiry date in customer entity layout facility details
And User enter the loan tenure month in customer entity layout facility details
And User click the save icon in customer entity layout facility details
And User get the save confirmation messege in customer entity layout facility details
Then User click the action edit icon in conventional facility details
And User verify the primary product field should be non editable in customer entity layout facility details
And User verify the primary sub product field should be non editable in customer entity layout facility details


@AT-FD-002
Scenario: To verify the impact when user keep any mandatory field blank and click on save button
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in customer entity layout facility details
And User click the facility info tab in customer entity layout facility details
And User click the add icon in customer entity layout facility details
And User verify the impact when user enter characters  value in numeric field in customer entity layout facility details
And User verify the impact when user enters only special characters value in any field in customer entity layout facility details
And User verify the impact when user keep any mandatory field blank and click on save button in customer entity layout facility details

@AT-FD-003
Scenario: To verify the impact post selecting any record from list view
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in customer entity layout facility details
And User click the facility info tab in customer entity layout facility details
And User verify system display the List view in customer entity layout facility details
And User get the values in the saved record in customer entity layout facility details
And User verify the impact post selecting any record from list view in customer entity layout facility details

@AT-FD-004
Scenario: To verify user is able to modify Facility Details  record in the system
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in customer entity layout facility details
And User click the facility info tab in customer entity layout facility details
Then User click the action edit icon in conventional facility details
And User modify the program code in customer entity layout facility details
And User modify the facility type in customer entity layout facility details
And User click the update save icon in customer entity layout facility details
And User get the save confirmation messege in customer entity layout facility details
And User click the application info tab in customer entity layout facility details
And User click the approvel button in customer entity layout facility details
And User enter the popup message in customer entity layout facility details
And User get the confirmation message in customer entity layout facility details

@AT-FD-005
Scenario: To verify while modification, when user keep any mandatory field blank and click on save button
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in customer entity layout facility details
And User click the facility info tab in customer entity layout facility details
Then User click the action edit icon in conventional facility details
And User keep any mandatory field blank and click on save button in conventional facility details
And User verify while modification system enters the invalid data in conventional facility details

@AT-FD-006
Scenario: To verify the functionality of Activate/Deactivate button
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in customer entity layout facility details
And User click the facility info tab in customer entity layout facility details
Then User click the action edit icon in conventional facility details
And User verify the status button is active stage in conventional facility details
And User click the status button in application details new app
And User verify the status button is deactive stage in application details new app
And User click the back button in customer entity layout facility details

@AT-FD-007
Scenario: To verify the Facility Details List view of Approved records
Given User login as uls maker in transaction
And User click the inbox mail icon in application detail offering
And User click the action edit icon in customer entity layout facility details
And User click the facility info tab in customer entity layout facility details
And User verify the Values in List view should be non editable in customer entity layout facility details
#And User verify the functionality of Add button in customer entity layout facility details
#And User verify the functionality of edit button in customer entity layout facility details
And User verify the functionality of Search box with mismatch data in customer entity layout facility details
And User verify the functionality of Search box with matching data in customer entity layout facility details
And User verify the functionality of Export to PDF button in customer entity layout facility details
And User verify the functionality of Export to Excel button in customer entity layout facility details









