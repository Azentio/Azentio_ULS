Feature: Check the functionality of Charge Master
@ChargeMaster_M1
Scenario: Creation of Charge Master record
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And user click on Charge Master Eye icon
And user click on Add icon
And user Enter the charge fields and verify the values
And user Enter the charge Description field and verify it
And user Enter the Calculation Type field and verify the values
And user Enter the Flat Amount field and verify it
And user Enter the Percentage field and verify it
And user Enter the Calculated On field and verify it
And user Enter the Rec pay field and verify it
And user Enter the Include In cust IRR and verify it
And user Enter the Include In Bank IRR and verify it
And user Enter the Level field and verify it
And user Enter the currency field and verify it
And user Enter the Event field and verify it
And user Enter the Date Unit and verify it
And user Enter the Date value and verify it
And user Enter the charge count and verify it
And user Enter the Allow Edit and verify it
And user Enter the Accounting type and verify it
And user Enter the Rule field and verify it
And user Enter the Remarks field and verify it
Then user Save the charge master Record
#ChargeSlab - verification
And user Goto the Temp view screen
And user click on First Edit icon
And user click on charge slab details add icon
And user verify the Calculated Type fields
And user verify the below fields
And user verify the min slab Amount fields
And user verify the max slab Amount fields
And user verify the Amount fields
And user verify the Rate fields
#And user verify the currency fields
And user verify the Remarks fields
And user click on save button and verify it
Then user verify the Required field proper validation message
#ChargeSlab- validation
And user Goto the Temp view screen
And user click on First Edit icon
And user click on charge slab details add icon
And user verify the Calculated Type fields
And user verify the below fields
And user verify the min slab Amount field
And user verify the max slab Amount field
And user verify the Amount field
And user verify the Rate field
And user verify the currency field
And user verify the Remarks field
And user click on save button and verify it
#ChargeSlab- validation
And user Goto the Temp view screen
And user click on First Edit icon
And user click on chargeslab edit button
And user inactive the Record and update the Record
And user click on Update button and verify it
#
Then click the inbox in charge master
And Search the record in search field for charge master
Then Get the reference id and store it in a excel in charge master
And Click the action icon in the charge master
Then Submit the record for checker approval in charge master
And Get the checker id and store it in a excel in charge master

@chargeMaster_M3
Scenario: To verify Checker user is able to Approve the record
And choose the data set id for checker approval in charge master
Given Get the URL and login as Checker to approve the record in charge master
#Then Click the menu icon in deposit account
And Click  the inbox in checker in charge Master
Then Search the record in serch field in checker stage for approve
Then search the reference id and click the respective action icon in Chage master
And Click the approve button in the Charge master
Then Enter the alert approve remark in charge master
And Give the final approve in the charge master
Then Verify the record get approved in chargel master


@DepositMaster_M3.1
Scenario: To verify Checker user is able to view the approved record in list view
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And user click on Charge Master Eye icon
Then verify the approved record present in the list view in charge master
@ChargeMaster_M1.1
Scenario: Creation of Charge Master record
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
Then Choose the data set id to reject in charge master
And user click on Charge Master Eye icon
And user click on Add icon
And user Enter the charge fields and verify the values
And user Enter the charge Description field and verify it
And user Enter the Calculation Type field and verify the values
And user Enter the Flat Amount field and verify it
And user Enter the Percentage field and verify it
And user Enter the Calculated On field and verify it
And user Enter the Rec pay field and verify it
And user Enter the Include In cust IRR and verify it
And user Enter the Include In Bank IRR and verify it
And user Enter the Level field and verify it
And user Enter the currency field and verify it
And user Enter the Event field and verify it
And user Enter the Date Unit and verify it
And user Enter the Date value and verify it
And user Enter the charge count and verify it
And user Enter the Allow Edit and verify it
And user Enter the Accounting type and verify it
And user Enter the Rule field and verify it
And user Enter the Remarks field and verify it
Then user Save the charge master Record
#ChargeSlab - verification
And user Goto the Temp view screen
And user click on First Edit icon
And user click on charge slab details add icon
And user verify the Calculated Type fields
And user verify the below fields
And user verify the min slab Amount fields
And user verify the max slab Amount fields
And user verify the Amount fields
And user verify the Rate fields
#And user verify the currency fields
And user verify the Remarks fields
And user click on save button and verify it
Then user verify the Required field proper validation message
#ChargeSlab- validation
And user Goto the Temp view screen
And user click on First Edit icon
And user click on charge slab details add icon
And user verify the Calculated Type fields
And user verify the below fields
And user verify the min slab Amount field
And user verify the max slab Amount field
And user verify the Amount field
And user verify the Rate field
And user verify the currency field
And user verify the Remarks field
And user click on save button and verify it
#ChargeSlab- validation
And user Goto the Temp view screen
And user click on First Edit icon
And user click on chargeslab edit button
And user inactive the Record and update the Record
And user click on Update button and verify it
#
Then click the inbox in charge master
And Search the record in search field for charge master
Then Get the reference id and store it in a excel in charge master reject
And Click the action icon in the charge master
Then Submit the record for checker approval in charge master
And Get the checker id and store it in a excel in charge master reject
@DepositMaster_M4
Scenario: To verify Checker user is able to Reject the record   
And choose the data set id for checker approval in charge master
Given Get the URL and login as Checker to reject the record in charge master
#Then Click the menu icon in deposit account
And Click  the inbox in checker deposit account
Then Search the record in serch field in checker stage for rejection
Then search the reference id and click the respective action icon in charge master
And Click the reject button in the charge master
Then Enter the alert reject remark in charge master
And Give the final reject in the charge master
Then Verify the record get rejected in charge master


@DepositMaster_M4.1
Scenario: To verify user is able to view the rejected record in the list view
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And user click on Charge Master Eye icon
Then verify the the rejected record in the list view in charge master

@ChargeMaster_M1.2
Scenario: Creation of Charge Master record
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
Then Choose the data set id to return in charge master
And user click on Charge Master Eye icon
And user click on Add icon
And user Enter the charge fields and verify the values
And user Enter the charge Description field and verify it
And user Enter the Calculation Type field and verify the values
And user Enter the Flat Amount field and verify it
And user Enter the Percentage field and verify it
And user Enter the Calculated On field and verify it
And user Enter the Rec pay field and verify it
And user Enter the Include In cust IRR and verify it
And user Enter the Include In Bank IRR and verify it
And user Enter the Level field and verify it
And user Enter the currency field and verify it
And user Enter the Event field and verify it
And user Enter the Date Unit and verify it
And user Enter the Date value and verify it
And user Enter the charge count and verify it
And user Enter the Allow Edit and verify it
And user Enter the Accounting type and verify it
And user Enter the Rule field and verify it
And user Enter the Remarks field and verify it
Then user Save the charge master Record
#ChargeSlab - verification
And user Goto the Temp view screen
And user click on First Edit icon
And user click on charge slab details add icon
And user verify the Calculated Type fields
And user verify the below fields
And user verify the min slab Amount fields
And user verify the max slab Amount fields
And user verify the Amount fields
And user verify the Rate fields
#And user verify the currency fields
And user verify the Remarks fields
And user click on save button and verify it
Then user verify the Required field proper validation message
#ChargeSlab- validation
And user Goto the Temp view screen
And user click on First Edit icon
And user click on charge slab details add icon
And user verify the Calculated Type fields
And user verify the below fields
And user verify the min slab Amount field
And user verify the max slab Amount field
And user verify the Amount field
And user verify the Rate field
And user verify the currency field
And user verify the Remarks field
And user click on save button and verify it
#ChargeSlab- validation
And user Goto the Temp view screen
And user click on First Edit icon
And user click on chargeslab edit button
And user inactive the Record and update the Record
And user click on Update button and verify it
#
Then click the inbox in charge master
And Search the record in search field for charge master
Then Get the reference id and store it in a excel in charge master return
And Click the action icon in the charge master
Then Submit the record for checker approval in charge master
And Get the checker id and store it in a excel in charge master return
@ChargeMaster_M2
Scenario: To verify Checker user is able to Return the record
Then Choose the data set id to return in charge master
Given Get the URL and login as Checker to return the record in charge master
#Then Click the menu icon in deposit account
And Click  the inbox in checker deposit account
Then Search the record in serch field in checker stage for return in charge master
And Click the return button in the charge master
Then Enter the alert return remark in charge master
And Give the final return in the charge master
Then Verify the record get returned in charge master

#AT-DAM-T003
@DepositMaster_M5.1
Scenario: To verify user is able to view the returned record in the list view
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And Click the temp view icon of charge master
Then verify the the returned record is in the list view in charge master

@ChargeMaster_M6
Scenario: Validation of save with invalid and blank field in a Charge Master record
Given Get the URL and login as maker
And Click the configuration
Then Click the config Manager
And user click on Charge Master Eye icon
And user click on Add icon
Then user Save the charge master Records
And validate the required field in a charge master
And user Goto the Temp view screen
And user click on Add icon
Then validate with invalid details in charge master
Then user Save the charge master Records
