Feature: To verify while modification, when user keep any mandatory field blank and click on save button
#Modification of Parameter record
Scenario: To verify while modification, when user keep any mandatory field blank and click on save button
Given Maker Login in subproduct retail master
Then Click the subproductretail master and parameter
And Enter the details in subproduct parameters fields
And Enter the details in bulkpayment fields
And Enter the details in foreclosure fields
And Enter the details in reschedulement fields
And Enter the details in moratorium/Grace period month fields
And Enter the details in pre-EMI fields
Then Enter the save icon
Then Get the validation message