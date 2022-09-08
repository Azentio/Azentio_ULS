Feature: Check The functionality of the Personal Details App data Entry
@AT-PDE-001
Scenario: Customer Personal Information at App data entry satge
Given User Launch the KULS url for Transaction
Then user click on Transaction Module
And user click on Application Details
And user click on Inbox Icon
And user click search icon
And user search Appdata Entry
And user click on First record of Appdata Entry
And user click on Customer Details Tab
And user click on First Record Edit Icon
And user verify the customer Type field
And user verify the Applicant Type field
And user verify the Salutation field
And user verify the First Name field
And user verify the Middle Name filed
And user verify the Last Name field
And user verify the Father First Name field
And user verify the Father Middle Name field
And user verify the Father Last Name Field
And user verify the spouse First Name field
And user verify the spouse Middle name field
And user verify the spouse Last Name field
And user verify the No of children field
And user verify the spouse status field
And user verify the Date of birth field
And user verify the gender field
And user verify the Education Level field
And user verify the Marital status field
And user verify the Nationality field
And user verify the Ethinicity field
And user verify the Religion field
And user verify the Residental status field
And user verify the Language field
And user verify the No Of dependents field
And user verify the Mothers maiden name field
And user verify the Type of Residence field
And user verify the category of client field
And user verify the Rating field
And user verify the Remark fields

@AT_PDE_002
Scenario: verify the availability of Add button and create a new Record of customer details tab
Given User Launch the KULS url for Transaction
Then user click on Transaction Module
And user click on Application Details
And user click on Inbox Icon
And user click search icon
And user search Appdata Entry
And user click on First record of Appdata Entry
And user click on Customer Details Tab
And user click the Add button annd verify it
And user Choose customer Type
And user Enter CIF ID
And user Enter Application Number
And user Enter Customer Name
And user choose ID Type
And user Enter ID Number
And user Enter Mobile Number
And user Choose Date of Birth
And user Enter Email ID
And user Click the search button
And user click the Create New Record button
And user Enter the customer Type field
And user Enter the Applicant Type field
And user Enter the Salutation field
And user Enter the First Name field
And user Enter the Middle Name filed
And user Enter the Last Name field
And user Enter the Father First Name field
And user Enter the Father Middle Name field
And user Enter the Father Last Name Field
And user Enter the spouse First Name field
And user Enter the spouse Middle name field
And user Enter the spouse Last Name field
And user Enter the No of children field
And user Enter the spouse status field
And user Enter the Date of birth field
And user Enter the gender field
And user Enter the Education Level field
And user Enter the Marital status field
And user Enter the Nationality field
And user Enter the Ethinicity field
And user Enter the Religion field
And user Enter the Residental status field
And user Enter the Language field
And user Enter the No Of dependents field
And user Enter the Mothers maiden name field
And user Enter the Type of Residence field
And user Enter the category of client field
And user Enter the Rating field
And user Enter the Remark fields
And user Enter the Phone Number in Contact Details
And user Enter the Mobile Number Primary in Contact Details
And user Enter the Mobile Number Secondary in Contact Details
And user Enter the Email Address in Contact Details
And user Select the Prefered contact Methods in Contact Details
And user Enter the Prefered time for contact in Contact Details
And user click the Save the button

@AT_PDE_003
Scenario: verify user is able to modify  existing record of customer details 
Given User Launch the KULS url for Transaction
Then user click on Transaction Module
And user click on Application Details
And user click on Inbox Icon
And user click search icon
And user search Appdata Entry
And user click on First record of Appdata Entry
And user click on Customer Details Tab
And user click on First Record Edit Icon
And user Modify the Applicant Type field
And user click the update the button

@AT_PDE_004
Scenario: verify customer details list view
Given User Launch the KULS url for Transaction
Then user click on Transaction Module
And user click on Application Details
And user click on Inbox Icon
And user click search icon
And user search Appdata Entry
And user click on First record of Appdata Entry
And user click on Customer Details Tab
And user verify the Back button List View
And user verify the CIF ID List view
And user verify the First Name List View
And user verify the Middle Name List View
And user Verify the Last Name List View
And user verify the Customer Type List View
And user verify the Applicant Type List View
And user verify the Status List View


