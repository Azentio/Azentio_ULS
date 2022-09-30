Feature: Check the functionality of Charge Master
@ChargeMaster_M1
Scenario: Creation of Charge Master record
Given user log in as uls application maker
When user click product Definitions up menu
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
And user verify the currency fields
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
And user verify the currency fields
And user verify the Remarks field
And user click on save button and verify it
#ChargeSlab- validation
And user Goto the Temp view screen
And user click on First Edit icon
And user click on chargeslab edit button
And user inactive the Record and update the Record
And user click on save button and verify it

@ChargeMaster_M2
Scenario: Validation of save with invalid and blank field in a Charge Master record
Given user log in as uls application maker
When user click product Definitions up menu
And user click on Charge Master Eye icon
And user click on Add icon
Then user Save the charge master Records
And validate the required field in a charge master
And user Goto the Temp view screen
And user click on Add icon
Then validate with invalid details in charge master
Then user Save the charge master Records
