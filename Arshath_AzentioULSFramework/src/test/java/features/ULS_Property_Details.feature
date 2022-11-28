Feature: To test the property details tab
@AT_PD_001
Scenario: To create the property details with valid data
Given User Launch the KULS url for Transaction
And click on mail box 
And search for app data entry record
And select the app data entry first record
And click on property detail record
And click on add button in property details tab
Then verify property details is showing in the screen
Then verify address details is showing in screen
Then verify charge details is showing in the screen
Then verify construction details is showing in the screen
And user update the Excelsheet Testdata for Property creation
Then verify security type field should be visisble and mandatory dropdown
And user can able to select the data from the security dropdown
Then verify property city field should be mandatory lookup 
And user can able to select the data from the property city field
Then verify Type Of Transaction field should be mandatory lookup 
And user can able to select the data from the Type Of Transaction field
Then verify Purchased from field should be mandatory lookup 
And user can able to select the data from the Purchased from field
Then verify Property Type field should be mandatory lookup 
And user can able to select the data from the Property Type field
Then verify APF Status field should be mandatory dropdown 
And user can able to select the data from the APF Status field
Then verify Construction Status field should be mandatory dropdown 
And user can able to select the data from the Construction Status field
Then verify Property Category field should be mandatory dropdown 
And user can able to select the data from the Property Category field
Then verify Nature of Property field should be mandatory lookup 
And user can able to select the data from the Nature of Property field
Then verify Occupancy Status field should be mandatory lookup 
And user can able to select the data from the Occupancy Status field
Then verify name Of The Developer field should be mandatory lookup 
And user can able to select the data from the name Of The Developer field
Then verify Project field should be mandatory lookup 
And user can able to select the data from the Project field
Then verify Building Details field should be mandatory lookup 
And user can able to select the data from the Building Details field
Then verify Unit Details field should be mandatory lookup 
And user can able to select the data from the Unit Details field
Then verify address line 1 field should be non mendatory text box
And user can able to enter the data into the address line 1 input box
Then verify address line 2 field should be non mendatory text box
And user can able to enter the data into the address line 2 input box
Then verify address line 3 field should be text box
And user can able to enter the data into the address line 3 input box
Then verify country field should be non mandatory lookup
And user can able to select the data from the country field
Then verify state field should be non mandatory lookup
And user can able to select the data from the state field
Then verify District Neighbourhood field should be non mandatory textbox
And user can able to enter the data from into District Neighbourhood field
Then verify city field should be non mandatory lookup
And user can able to select the data from the city field
Then verify pincode field should be non mandatory textbox
And user can able to enter the data from into pincode field

Then verify Location Type field should be mandatory lookup
And user can able to enter the data from into Location Type field
#Then verify Location category field should be mandatory lookup
#And user can able to enter the data from into Location category field
Then verify distance from branch to property field should be mandatory lookup
And user can able to enter the data from into distance from branch to property field

Then verify Type Of Charge field should be mandatory dropdown 
And user can able to select the data from the Type Of Charge field
Then verify Name Of Charge Holder field should be non mandatory textbox
And user can able to enter the data from into Name Of Charge Holder field
Then verify Amount to the Charge Holder field should be non mandatory currency field
And user can able to enter the data from into Amount to the Charge Holder field
Then verify Measurement field should be mandatory dropdown 
And user can able to select the data from the Measurement field
Then verify Approx Property Area field should be non mandatory textbox
And user can able to enter the data from into Approx Property Area field
Then verify Built Up Plot Area field should be non mandatory textbox
And user can able to enter the data from into Built Up Plot Area field
Then verify Carpet Area field should be non mandatory textbox
And user can able to enter the data from into Carpet Area field
Then verify Property Management field should be non mandatory lookup
And user can able to select the data from the Property Management field
Then verify Year Of Construction field should be non mandatory calendar
And user can able to select the date from the Year Of Construction field
Then verify percentage of completion field should be non mandatory textbox
And user can able to enter the data from into percentage of completion field
Then verify Expected Completion Date field should be non mandatory calendar
And user can able to select the date from the Expected Completion Date field
Then verify Agreement Date field should be non mandatory calendar
And user can able to select the date from the Agreement Date field
Then verify Agreement Validity Date field should be non mandatory calendar
And user can able to select the date from the Agreement Validity Date field
And save the property details record
Then verify record is saved in the system

@AT_PD_002
Scenario: To verify user can able to create the property details record with invalid input
Given User Launch the KULS url for Transaction
And click on mail box 
And search for app data entry record
And select the app data entry first record
And click on property detail record
And click on add button in property details tab
And save the property details record
Then verify security type field show the verification for blank field
Then verify Property city field show the verification for blank field
Then verify Type Of Transaction field show the verification for blank field
Then verify Purchased from field show the verification for blank field
Then verify Property Type field show the verification for blank field
Then verify APF Status field show the verification for blank field
Then verify Construction Status field show the verification for blank field
Then verify Property category field show the verification for blank field
Then verify Occupancy Status field show the verification for blank field
Then verify name Of the Developer field show the verification for blank field 
Then verify name of the charge holder field should show the validation post enter only numeric input
Then verify address line one field should through the validation post enter the special charecter input
Then verify address line two field should through the validation post enter the special charecter input
Then verify address line three field should through the validation post enter the special charecter input
Then verify District and neighboorhood field should through the validation post enter the special charecter input
Then verify name of the charge holder field should through the validation post enter the special charecter input
Then verify pincode field should through the validation post enter the special charecter input
When user enter the pincode minimum six digits
Then verify system should through the validation for minim pincode validation
Then verify approx property area field should not allow user to enter alphabets
Then verify built up plot area field should not allow user to enter alphabets
Then verify carpet area field should not allow user to enter alphabets
Then verify percentage of completion field should not allow user to enter alphabets
Then verify the functionality of back button in property details screen

@AT_PD_003
Scenario: To verify user can able to modify theproperty details record before saving the record
Given User Launch the KULS url for Transaction
And click on mail box 
And search for app data entry record
And select the app data entry first record
And click on property detail record
And click on add button in property details tab
Then verify property details is showing in the screen
Then verify address details is showing in screen
Then verify charge details is showing in the screen
Then verify construction details is showing in the screen
Then verify security type field should be visisble and mandatory dropdown
And user can able to select the data from the security dropdown
Then verify property city field should be mandatory lookup 
And user can able to select the data from the property city field
Then verify Type Of Transaction field should be mandatory lookup 
And user can able to select the data from the Type Of Transaction field
Then verify Purchased from field should be mandatory lookup 
And user can able to select the data from the Purchased from field
Then verify Property Type field should be mandatory lookup 
And user can able to select the data from the Property Type field
Then verify APF Status field should be mandatory dropdown 
And user can able to select the data from the APF Status field
Then verify Construction Status field should be mandatory dropdown 
And user can able to select the data from the Construction Status field
Then verify Property Category field should be mandatory dropdown 
And user can able to select the data from the Property Category field
Then verify Nature of Property field should be mandatory lookup 
And user can able to select the data from the Nature of Property field
Then verify Occupancy Status field should be mandatory lookup 
And user can able to select the data from the Occupancy Status field
Then verify name Of The Developer field should be mandatory lookup 
And user can able to select the data from the name Of The Developer field
Then verify Project field should be mandatory lookup 
And user can able to select the data from the Project field
Then verify Building Details field should be mandatory lookup 
And user can able to select the data from the Building Details field
Then verify Unit Details field should be mandatory lookup 
And user can able to select the data from the Unit Details field
And user can able to enter the data into the address line 1 input box
And user can able to enter the data into the address line 2 input box
Then verify address line 3 field should be text box
And user can able to enter the data into the address line 3 input box
Then verify country field should be non mandatory lookup
And user can able to select the data from the country field
Then verify state field should be non mandatory lookup
And user can able to select the data from the state field
Then verify city field should be non mandatory lookup
And user can able to select the data from the city field
Then verify District Neighbourhood field should be non mandatory textbox
And user can able to enter the data from into District Neighbourhood field
Then verify pincode field should be non mandatory textbox
And user can able to enter the data from into pincode field
Then verify Type Of Charge field should be mandatory dropdown 
And user can able to select the data from the Type Of Charge field
Then verify Name Of Charge Holder field should be non mandatory textbox
And user can able to enter the data from into Name Of Charge Holder field
Then verify Amount to the Charge Holder field should be non mandatory currency field
And user can able to enter the data from into Amount to the Charge Holder field
Then verify Measurement field should be mandatory dropdown 
And user can able to select the data from the Measurement field
Then verify Approx Property Area field should be non mandatory textbox
And user can able to enter the data from into Approx Property Area field
Then verify Built Up Plot Area field should be non mandatory textbox
And user can able to enter the data from into Built Up Plot Area field
Then verify Carpet Area field should be non mandatory textbox
And user can able to enter the data from into Carpet Area field
Then verify Property Management field should be non mandatory lookup
And user can able to select the data from the Property Management field
Then verify Year Of Construction field should be non mandatory calendar
And user can able to select the date from the Year Of Construction field
Then verify percentage of completion field should be non mandatory textbox
And user can able to enter the data from into percentage of completion field
Then verify Expected Completion Date field should be non mandatory calendar
And user can able to select the date from the Expected Completion Date field
Then verify Agreement Date field should be non mandatory calendar
And user can able to select the date from the Agreement Date field
Then verify Agreement Validity Date field should be non mandatory calendar
And user can able to select the date from the Agreement Validity Date field
Then verify user can able to modify the data in security dropdown 
Then verify user can able to modify the data in the property city field
Then verify user can able to modify the data in the Type Of Transaction field
Then verify user can able to modify the data in the Purchased from field
Then verify user can able to modify the data in the Property Type field 
Then verify user can able to modify the data in the APF Status field
Then verify user can able to modify the data in the Construction Status field 
Then verify user can able to modify the data in the Property Category field
Then verify user can able to modify the data in the Nature of Property field
Then verify user can able to modify the data in the Occupancy Status field
Then verify user can able to modify the data in the name Of The Developer field
Then verify user can able to modify the data in the Project field
Then verify user can able to modify the data in the Building Details field
Then verify user can able to modify the data in the Unit Details field
Then verify user can able to modify the data in the address line 1 input box
Then verify user can able to modify the data in the address line 2 input box
Then verify user can able to modify the data in the address line 3 input box
Then verify user can able to modify the data in the country field
Then verify user can able to modify the data in the state field
Then verify user can able to modify the data in the city field
Then verify user can able to modify the data in in District Neighbourhood field
Then verify user can able to modify the data in into pincode field
Then verify user can able to modify the data in the Type Of Charge field
Then verify user can able to modify the data in Name Of Charge Holder field
Then verify user can able to modify the data in Amount to the Charge Holder field
Then verify user can able to modify the data in the Measurement field
Then verify user can able to modify the data in Approx Property Area field
Then verify user can able to modify the data in Built Up Plot Area field
Then verify can able to modify the data in Carpet Area field
Then verify can able to modify the data in the Property Management field
Then verify user can able to modify the date in the Year Of Construction field
Then verify user can able to modify the data in into percentage of completion field
Then verify user can able to modify the date in the Expected Completion Date field
Then verify user can able to modify the date in the Agreement Date field
Then verify user can able to modify the date in the Agreement Validity Date field
And save the property details record
Then verify record is saved in the system

@AT_PD_004_1
Scenario: verify system allow user to do a modification on already saved record
Given User Launch the KULS url for Transaction
And user click on Inbox Icon
And user click search icon
And user search Appdata Entry
#And user Enter Application ID
And user click on First record of Appdata Entry
And user choose Property Details Tab
And user click First Record Edit Icon
And user Modify the Security Type
And user Modify the Property City
And user Modify the Property Type
And user Modify the Apf Status
And user Modify the Construction Status
And user Modify the Property Category
And user Modify the Nature of Property
And user Modify the Occupancy Status
And user click the update the button

@AT_PD_005
Scenario: verify while modification, when user keep any mandatory field blank and click on save button
Given User Launch the KULS url for Transaction
And user click on Inbox Icon
And user click search icon
And user search Appdata Entry
And user click on First record of Appdata Entry
And user choose Property Details Tab
And user click First Record Edit Icon
And user can able to select the data from the security dropdown
And user can able to select the data from the property city field
And user can able to select the data from the Property Type field
And user can able to select the data from the APF Status field
And user Blank fill the Mandatory field
And user click the update button
Then user verify the blank field and get the proper validation message