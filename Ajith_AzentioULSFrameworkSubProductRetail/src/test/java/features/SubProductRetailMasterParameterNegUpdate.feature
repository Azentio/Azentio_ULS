Feature: To verify while modification, when user keep any mandatory field blank and click on save button
#Modification of Parameter record
Scenario: To verify while modification, when user keep any mandatory field blank and click on save button
Given user log in as uls application maker
Then Click the subproductretail master
And Click the parameter
And Update the parameter fields in maker
And Click the save icon
Then Get the validation message in maker