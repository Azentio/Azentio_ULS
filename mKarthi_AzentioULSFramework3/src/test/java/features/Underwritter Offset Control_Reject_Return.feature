Feature: To verify user able to reject and return the record in Underwritter Offset Control
#UOC_03_15
@AT009
Scenario: To verify user able to reject the record in Underwritter Offset Control
Given User login as uls checker in underwritterOffsetControl
And User click the inboxicon in underwritterOffsetControl
And User click the search icon in underwritterOffsetControl and get the reference id
And User search the respective reference id and click on Action button in underwritterOffsetControl
And User click the reject icon in underwritterOffsetControl checker
And User enter the reject remark in underwritterOffsetControl checker
And User click the final reject icon in underwritterOffsetControl checker
Then User verify the Record got Rejected in underwritterOffsetControl checker

@AT009.1
Scenario: To verify the rejected record shown in asset CD master maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User click the inboxmail icon in asset CD master
And User verify the rejected record removed from the system in underwritterOffsetControl
#UOC_03_16
@AT010
Scenario: To verify user able to return the record in Underwritter Offset Control
Given User login as uls checker in underwritterOffsetControl
And User click the inboxicon in underwritterOffsetControl
And User click the search icon in underwritterOffsetControl and get the reference id
And User search the respective reference id and click on Action button in underwritterOffsetControl
And User click the return icon in underwritterOffsetControl checker
And User enter the return remark in underwritterOffsetControl checker
And User click the final return icon in underwritterOffsetControl checker
Then User verify the Record got Returned in underwritterOffsetControl checker
@AT010.1
Scenario: To verify the rejected record shown in asset CD master maker stage
Given User login as uls maker in asset CD master
Then User click the Configurations in asset auto master
And User click the product setup in asset CD master
And Click the Asset CD Master setup eye icon in Asset CD master
Then User click the inboxmail icon in asset CD master
And User verify the returned record removed from the system in underwritterOffsetControl
