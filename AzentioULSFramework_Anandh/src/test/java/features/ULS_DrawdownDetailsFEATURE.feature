Feature: To test the drawdown details screen
@AT-DWD-004
Scenario: To verify drawdown details screen should be read only mode and payment details screen should be editable only record in pending status
Given navigate to uls application 
And login with maker credentials
Then  Click the inbox in in beneficiary details
And Click the search button in beneficiary detail
Then Enter as disbursement maker in the search bar in beneficiary detail
And Click the disbursement maker first action icon in beneficiary detail
And click on drawdown details tab
And click on list view first record on drawdown details
Then verify Facility details section should be available 
Then verify All payment hyper link section is available or not
Then verify schedule details list section is available or not
Then verify payment details list section is available or not
Then verify drawdown breakdown section is available or not
Then verify product field should be non editable under facility details section
Then verify sub product field should be non editable under facility details section
Then verify scheme field should be non editable under facility detials section
Then verify saction date field should be non editable under facility details section
Then verify last disbursement date field should be non editable under facility details section
Then verify is tranche allowed field should be non editable under facility details section
Then verify Sanction amount field should be non editable under facility details section
Then verify limit amount field should be non editable under under facility details section
Then verify disbursement amount field should be non editable under facility details section
Then verify current disbursement field should be non editable under facility details section
Then verify available amount field should be non editable under facility details section
Then verify Payment schedule ID field should be in non editable under schedule details
Then verify Payment for field should be in non editable under schedule details
Then verify Planned schedule amount field should be in non editable under schedule details
Then verify Planned date field should be in non editable under schedule details
Then verify Currency field should be in non editable under schedule details
Then verify Schedule notes field should be in non editable under schedule details

@AT-DWD-007
Scenario: To verify drawdown breakup screen should 
Given navigate to uls application 
And login with maker credentials
Then  Click the inbox in in beneficiary details
And Click the search button in beneficiary detail
#Then Enter as disbursement maker in the search bar in beneficiary detail
And enter the draw down record reference number
And Click the disbursement maker first action icon in beneficiary detail
And click on drawdown details tab
And click on list view first record on drawdown details
And click on edit button in drwdownBreakup
And click on add button in drawdown break up list view
Then verify when user click on add button new record user can able to add
Then check when user add any drawdownbreak up list view new row might be added
Then verify when user click on minus button that row will be deleted
Then verify the functionality of add button
Then verify the functionality of back button