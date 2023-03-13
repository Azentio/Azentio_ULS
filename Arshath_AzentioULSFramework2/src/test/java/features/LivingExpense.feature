Feature: To validate the functionalities of living master

@LivingExpense_M34
Scenario: To verify list view functionality of approved records in living expense location
Given Get the URL and login as maker  
And Click the configuration
And Click the other master
Then Click the Eye icon of the living expense
Then click the pencil icon in living expense
And Click the living expense location tab
And To verify the functionality of Add button in Living Expense
And To verify the functionality of Search box with matching data in Living Expense location
Then To verify the functionality of Search box with mismatch data in Living Expense location
And To verify the functionality of Export to PDF button in Living Expense location
Then To verify the functionality of Export to Excel button in Living Expense location
