Feature: To verify fields in project master input fields and record flow 
#PM_01_01,PM_01_02,PM_01_03,PM_01_04,PM_01_05,PM_01_06,PM_01_07,PM_01_08,PM_01_09,PM_01_10,PM_01_11,PM_01_12,PM_01_13,PM_01_14,PM_01_15,PM_01_16,PM_01_17,
#PM_01_18,PM_01_19,PM_01_20,PM_01_21,PM_01_22,PM_01_23,PM_01_24,PM_01_25,PM_01_26,PM_01_27,PM_01_28,PM_01_29,PM_01_30,PM_01_31,PM_01_32,PM_01_33
#PM_01_34,PM_01_35,PM_01_36,PM_01_37,PM_01_38,PM_01_39,PM_01_40,PM_01_41,PM_01_42,PM_01_43,PM_01_44,PM_01_45,PM_01_46,PM_01_47,PM_01_48,PM_01_49,PM_01_50,PM_01_51,
#PM_01_52,PM_01_53,PM_01_54,PM_01_55,PM_01_56,PM_01_57,PM_01_58,PM_01_59,PM_01_60,PM_01_61,PM_01_62,PM_01_63,PM_01_64,PM_01_65,PM_01_66,
#PM_01_67,PM_01_68,PM_01_69,PM_01_70,PM_01_71,PM_01_72,PM_01_73,PM_01_74,PM_01_75,PM_01_76,PM_01_78,PM_01_79,PM_01_80,PM_01_81,PM_01_82,PM_01_83,PM_01_84
@PM001
Scenario: To verify maker user can able to fill the project master fields and save the data
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to project setup main menu
Then click on project master view button
And click on add button to add the new project record
Then verify project type field should be mendatory user can able to select the data from the drop down
Then verify Sourcing branch field should be mendatory user can able to select the data from the drop down
Then verify project code field should be mendatory user can able to fill the data in text box
Then verify builder group field should be mendatory user can able to select the data from the drop down
Then verify name of the project field should be mendatory user can able to fill the data from in the text box
Then verify builder name field should be mendatory user can able to select the data from the drop down
Then verify construction finance field should be mendatory user can able to select the data from the drop down
Then verify remarks field should be non mendatory user can able to pass the data inside the text box
Then verify green project dropdown should be mendatory user can able to select the data from the drop down
Then verify agency name dropdown should be non mendatory user can able to select the data from the drop down
Then verify special scheme  dropdown should be non mendatory user can able to select data from the drop down
Then verify remarks2 field should be non mendatory user can able to pass the data in it
Then verify sub25 field should be non mendatory user can able to select the data from the drop down
Then verify address1 field should be mendatory field type should be text 
Then user can able to pass the data into the text box
Then verify address2 field should be mendatory field type should be text
Then user can able to pass the data into the address2 text box
Then verify address3 field should be non mendatory field type should be text
And user can able to enter the data into address3 text box
Then verify survey Number field should be non mendatory field type should be number
And user can able to enter the data into survey Number input box
Then verify landmark field should be non mendatory field type should be text
And user can able to enter the data into landmark input box
Then verify street field should be non mendatory field type should be text
And user can able to enter the data into street input box
Then verify county field should be mendatory field should be dropdown
And user can able to select the dta from the county drop down
Then verify state field should be mendatory field should be drop down
And user can able to select the data from the state drop down
Then verify city field should be mendatory field should be drop down
And user can able to select the data from the city drop down
Then verify pincode field should be non mendatory field type should be number
And user can able to enter the data into pincode input box
Then verify sales relationship manager field should be non mendatory field type should be number
And user can able to enter the data into sales relationship manager input box
Then verify phone number field should be mendatory field type should be number
And user can able to enter the data into phone number input box
Then verify mobile number field should be non mendatory field type should be number
And user can able to enter the data into mobile number input box
Then verify title verified by field should be non mendatory field type should be Text box
And user can able to enter the data into the title verified by input box
Then verify plan approved by field should be non mendatory field type should be Text box
And user can able to enter the data into the plan approved by input box 
Then verify plan approved field should be non mendatory field should be textbox
And user can able to select the data from the plan approved textbox
Then verify plan approved date should be mendatory 
And verify user can able to give data in it
Then verify rural urban field should be non mendatory dropdown
And user can able to select the data from the dropdown
Then verify built area field should be non mendatory text box
And user can able to fill the data in to the built area input box
Then verify any charge on project  field should be non mendatory text box
And user can able to fill the data into the any charge on project text box
Then verify Basic Sales Price Distance Unit field should be mendatory text box
And user can able to fill the data in Basic sales price distance unit text box
Then verify charge by NOC to be taken from field should be non mendatory dropdown
And user can able to select the data from the charge by NOC to be taken from dropdown
Then verify area of land distance unit field should be mendatory text box
And user can able to fill the data into the area of land distance unit text box
Then verify Name of Competitors funding project field should be non mendatory text box
And user can able to select the data from the Name of Competitors funding project text box
Then verify Source branch field should be mendatory dropdown
And user can able to select the data from the Source branch from dropdown
Then verify monitesring required field shlould be non mendatory text box
And verify user can able to edit the monitering required text box
Then verify under construction field should be non mendatory dropdown
And user can able to select the data from the under construction dropdown
Then verify overall completion percentage field should be mendatory field type should be number
And user can able to fill the overall completion percentage with number inputs
Then verify overall recomendation field should be mendatory field type should be number
And user can able to fill the overall recomendation field with number inputs
Then verify tentative date field should be non mendatory field type should be date
And user can able to pass the date in to the tentative date input box
Then verify Name of Beneficiery field should be mendatory field type shoudl be text
And user can able to pass the data into the name of benificiery text box
Then verify Account number field should be mendatory field type shoudl be number
And user can able to pass the data into the Account number field
Then verify bank name field should be mendatory dropdown
And verify user can able to select the data from the bannk name dropdown
Then verify date of visit field should be mendatory field 
And user can able to pass the date in date of visit field
Then verify branch name field should be non mendatory dropdown
And user can able to select the data from the branch name dropdown
Then verify IFSC Code field should be non mendatory dropdown
And user can able to select the data from the IFSC Code dropdown
Then verify file storage field should be mendatory dropdown
And user can able to select data from the file storage dropdown
Then verify CLP field should non mendatory be dropdown
And user can able to select the data from the CLP dropdown
Then verify ADF field should non mendatory be dropdown
And user can able to select the data from the ADF dropdown
Then verify Flexi field should non mendatory be dropdown
And user can able to select the data from the Flexi dropdown
Then verify subvention field should non mendatory be dropdown
And user can able to select the data from the subvention dropdown
Then verify subvention type field should non mendatory be dropdown
And user can able to select the data from the subvention type dropdown
Then verify subvention period should be non mendatory field should be number type
And user can able to fill the data in to the field 
Then verify subvention period start field should be non mendatory field type should be date
And user can able to pass the data in to the subvention period start field
Then verify subvention end date field should be non mendatory field type should be date
And user can able to pass the data in to the subvention end date field
Then verify interset to be collected field should be non mendatory field type should be number
And user can able to pass the data in to the interset to be collected field
Then verify discounting rate field should be non mendatory field type should be number
And user can able to pass the data in to the discounting rate field
Then verify rate type field should be non mendatory field type should be number
And user can able to pass the data in to the rate type field
Then verify rate of interest field should be non mendatory field type should be number
And user can able to pass the data in to the rate of interest field
Then verify Max No of Units to be Funded for all projects of builder field should be non mendatory text box
And verify user can able to pass the data in to Max No of Units to be Funded for all projects of builder textbox
Then verify Max Sanction Amt for all cases funded in all Projects of the builder field should be non mendatory text box
And verify user can able to pass the data in to Max Sanction Amt for all cases funded in all Projects of the builder textbox
Then verify Max Disbursed Amt for all cases funded in all Projects of the builder field should be non mendatory text box
And user can able to pass the data in to Max Disbursed Amt for all cases funded in all Projects of the builder textbox
Then verify Sanctioned Amount field should be non mendatory field type should be number
And user can able to pass the data in to Sanctioned Amount field
Then verify Disbursed Amount field should be non mendatory field type should be number
And user can able to pass the data in to Disbursed Amount field
Then verify Sanctioned No of Units field should be non mendatory field type should be number
And user can able to pass the data in to Sanctioned No of Units field
Then verify Total No Units field should be non mendatory field type should be number
And user can able to pass the data in to Total No Units field
Then verify Apartment should be non mendatory field type should be text
And user can able to pass the data in to Apartment field
Then verify Commercial Space should be non mendatory field type should be text
And user can able to pass the data in to Commercial Space field
Then verify plot field type should be number
And user can able to pass the data in to plot field
Then verify Studio Apartment should be non mendatory field type should be text
And user can able to pass the data in to Studio Apartment field
Then verify Builder Floor should be non mendatory field type should be number
And user can able to pass the data in to Builder Floor field
Then verify Villa should be non mendatory field type should be text
And user can able to pass the data in to Villa field
Then verify Technical Conditions should be non mendatory field type should be text
And user can able to pass the data in to Technical Conditions field
Then verify Remarks should be non mendatory field type should be text
And user can able to pass the data in to Remarks field
Then verify Document to be collected from Retail Borrower should be non mendatory field type should be text
And user can able to pass the data in to Document to be collected from Retail Borrower field
Then save the project master record
And click on notification icon in project master
Then serach for project master record in notification 
And select project master record  the record in notification area
Then submit the record from maker endAnd give alert remark and submit the alert button after clickking on alert
#PM_06_02
@T12
Scenario: To verify parameter list view record should get opened with non editable
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to project setup main menu
Then click on temp view in project master
And go to building details tab
Then verify building details records are in non editable mode
#PM_06_08
@T13
Scenario: To verify back button fucntionality in building details record
Given Navigate to ULS application URL
Then login with valid maker credentials
And go to project setup main menu
Then click on temp view in project master
And go to building details tab
Then click on add button in building details 
And click on back button
Then verify screen should get changed to previous screen