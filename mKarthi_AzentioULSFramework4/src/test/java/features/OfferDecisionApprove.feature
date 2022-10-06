Feature: To verify Final Underwriter Approver forwards the case to next level
@12
Scenario: To verify Final Underwriter Approver forwards the case to next level 
Given User login as uls maker in transaction
And User click the inbox mail icon in Drawdown
And User search the record from the system in Offer Decision
And User click the action edit icon in DrawDown
And User click the action edit icon under facility list in drawdown
And User click the Application details Tab in Offer Decision
And User click the approve button in Offer Decision
And User enter the popup remark in Offer Decision
And User click the final approve button Offer Decision
And User get the save confirmation messege in customer entity layout facility details
And User verify the case moved to the next level in Offer Decision



